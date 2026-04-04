package com.reservation_system.Randoop.userrepository;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest1Test {

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
        com.reservation_system.model.Guest guest5 = new com.reservation_system.model.Guest((int) '#', "hi!", "demo/data/test-users.csv", "", false);
        java.lang.String str6 = guest5.getUserType();
        java.lang.String str7 = guest5.getUserType();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Guest" + "'", str6, "Guest");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Guest" + "'", str7, "Guest");
    }

    @Test
    public void test0502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0502");
        com.reservation_system.model.Guest guest5 = new com.reservation_system.model.Guest((int) ' ', "student", "headlabcoordinator", "Guest", true);
        java.lang.String str6 = guest5.getUserType();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Guest" + "'", str6, "Guest");
    }

    @Test
    public void test0503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0503");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("demo/data/test-users.csv");
        com.reservation_system.model.Researcher researcher7 = new com.reservation_system.model.Researcher(5, "hi!", "labmanager", "Guest", false);
        userRepository1.addUser((com.reservation_system.model.User) researcher7);
        java.util.List<com.reservation_system.model.User> userList9 = userRepository1.getAllUsers();
        com.reservation_system.repository.UserRepository userRepository11 = new com.reservation_system.repository.UserRepository("demo/data/test-users.csv");
        com.reservation_system.model.Researcher researcher17 = new com.reservation_system.model.Researcher(5, "hi!", "labmanager", "Guest", false);
        userRepository11.addUser((com.reservation_system.model.User) researcher17);
        java.util.List<com.reservation_system.model.User> userList19 = userRepository11.getAllUsers();
        userRepository1.saveAllUsers(userList19);
        java.util.Optional<com.reservation_system.model.User> userOptional22 = userRepository1.findByEmail("");
        org.junit.Assert.assertNotNull(userList9);
        org.junit.Assert.assertNotNull(userList19);
        org.junit.Assert.assertNotNull(userOptional22);
    }

    @Test
    public void test0504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0504");
        // The following exception was thrown during execution in test generation
        try {
            com.reservation_system.model.User user6 = com.reservation_system.patterns.factory.UserFactory.createUser("Password1!", (int) '#', "researcher", "headlabcoordinator", "Researcher", true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid user type: Password1!");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0505");
        com.reservation_system.model.User user6 = com.reservation_system.patterns.factory.UserFactory.createUser("Researcher", 100, "Student", "guest", "demo/data/test-users.csv", false);
        org.junit.Assert.assertNotNull(user6);
    }

    @Test
    public void test0506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0506");
        com.reservation_system.model.Guest guest5 = new com.reservation_system.model.Guest((int) (short) 1, "alice@example.com", "labmanager", "Alice", true);
        java.lang.String str6 = guest5.getUserType();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Guest" + "'", str6, "Guest");
    }

    @Test
    public void test0507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0507");
        com.reservation_system.model.Student student5 = new com.reservation_system.model.Student((int) (byte) 10, "", "demo/data/test-users.csv", "researcher", true);
    }

    @Test
    public void test0508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0508");
        com.reservation_system.model.Guest guest5 = new com.reservation_system.model.Guest((int) (byte) -1, "hi!", "", "Password1!", false);
        boolean boolean6 = guest5.isApproved();
        java.lang.String str7 = guest5.getEmail();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
    }

    @Test
    public void test0509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0509");
        com.reservation_system.model.HeadLabCoordinator headLabCoordinator5 = new com.reservation_system.model.HeadLabCoordinator(100, "researcher", "Password1!", "researcher", false);
    }

    @Test
    public void test0510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0510");
        com.reservation_system.model.HeadLabCoordinator headLabCoordinator5 = new com.reservation_system.model.HeadLabCoordinator(0, "faculty", "", "student", true);
        java.lang.String str6 = headLabCoordinator5.getName();
        java.lang.String str7 = headLabCoordinator5.getPassword();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "faculty" + "'", str6, "faculty");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "student" + "'", str7, "student");
    }

    @Test
    public void test0511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0511");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("demo/data/test-users.csv");
        com.reservation_system.model.Researcher researcher7 = new com.reservation_system.model.Researcher(5, "hi!", "labmanager", "Guest", false);
        userRepository1.addUser((com.reservation_system.model.User) researcher7);
        java.util.List<com.reservation_system.model.User> userList9 = userRepository1.getAllUsers();
        boolean boolean10 = userRepository1.headLabCoordinatorExists();
        boolean boolean12 = userRepository1.emailExists("guest");
        java.util.Optional<com.reservation_system.model.User> userOptional14 = userRepository1.findByEmail("researcher");
        java.util.Optional<com.reservation_system.model.User> userOptional16 = userRepository1.findByEmail("alice@example.com");
        int int17 = userRepository1.getNextID();
        java.util.Optional<com.reservation_system.model.User> userOptional19 = userRepository1.findByEmail("hi!");
        org.junit.Assert.assertNotNull(userList9);
// flaky "1) test0511(com.reservation_system.randoop.userrepository.RegressionTest1)":         org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
// flaky "1) test0511(com.reservation_system.randoop.userrepository.RegressionTest1)":         org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(userOptional14);
        org.junit.Assert.assertNotNull(userOptional16);
// flaky "1) test0511(com.reservation_system.randoop.userrepository.RegressionTest1)":         org.junit.Assert.assertTrue("'" + int17 + "' != '" + 102 + "'", int17 == 102);
        org.junit.Assert.assertNotNull(userOptional19);
    }

    @Test
    public void test0512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0512");
        com.reservation_system.model.HeadLabCoordinator headLabCoordinator5 = new com.reservation_system.model.HeadLabCoordinator((int) (byte) 0, "Faculty", "headlabcoordinator", "guest", true);
        headLabCoordinator5.setApproved(false);
    }

    @Test
    public void test0513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0513");
        // The following exception was thrown during execution in test generation
        try {
            com.reservation_system.model.User user6 = com.reservation_system.patterns.factory.UserFactory.createUser("demo/data/test-users.csv", (-1), "Password1!", "headlabcoordinator", "", false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid user type: demo/data/test-users.csv");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0514");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("demo/data/test-users.csv");
        int int2 = userRepository1.getNextID();
        int int3 = userRepository1.getNextID();
        com.reservation_system.model.HeadLabCoordinator headLabCoordinator9 = new com.reservation_system.model.HeadLabCoordinator((int) (byte) 1, "", "", "guest", false);
        userRepository1.addUser((com.reservation_system.model.User) headLabCoordinator9);
        java.util.List<com.reservation_system.model.User> userList11 = userRepository1.getAllUsers();
        boolean boolean13 = userRepository1.emailExists("Faculty");
        boolean boolean15 = userRepository1.emailExists("Alice");
        java.util.List<com.reservation_system.model.User> userList16 = userRepository1.getAllUsers();
        com.reservation_system.repository.UserRepository userRepository18 = new com.reservation_system.repository.UserRepository("demo/data/test-users.csv");
        java.util.List<com.reservation_system.model.User> userList19 = userRepository18.getAllUsers();
        int int20 = userRepository18.getNextID();
        boolean boolean22 = userRepository18.emailExists("headlabcoordinator");
        com.reservation_system.repository.UserRepository userRepository24 = new com.reservation_system.repository.UserRepository("demo/data/test-users.csv");
        com.reservation_system.model.Researcher researcher30 = new com.reservation_system.model.Researcher(5, "hi!", "labmanager", "Guest", false);
        userRepository24.addUser((com.reservation_system.model.User) researcher30);
        java.util.List<com.reservation_system.model.User> userList32 = userRepository24.getAllUsers();
        com.reservation_system.model.Guest guest38 = new com.reservation_system.model.Guest(0, "Password1!", "demo/data/test-users.csv", "researcher", false);
        boolean boolean39 = guest38.requiresDepartmentApproval();
        userRepository24.addUser((com.reservation_system.model.User) guest38);
        boolean boolean42 = userRepository24.emailExists("Alice");
        int int43 = userRepository24.getNextID();
        com.reservation_system.repository.UserRepository userRepository45 = new com.reservation_system.repository.UserRepository("demo/data/test-users.csv");
        boolean boolean47 = userRepository45.emailExists("Alice");
        com.reservation_system.repository.UserRepository userRepository49 = new com.reservation_system.repository.UserRepository("demo/data/test-users.csv");
        java.util.List<com.reservation_system.model.User> userList50 = userRepository49.getAllUsers();
        int int51 = userRepository49.getNextID();
        java.util.List<com.reservation_system.model.User> userList52 = userRepository49.getAllUsers();
        userRepository45.saveAllUsers(userList52);
        userRepository24.saveAllUsers(userList52);
        com.reservation_system.repository.UserRepository userRepository56 = new com.reservation_system.repository.UserRepository("demo/data/test-users.csv");
        boolean boolean58 = userRepository56.emailExists("Alice");
        com.reservation_system.repository.UserRepository userRepository60 = new com.reservation_system.repository.UserRepository("demo/data/test-users.csv");
        java.util.List<com.reservation_system.model.User> userList61 = userRepository60.getAllUsers();
        int int62 = userRepository60.getNextID();
        java.util.List<com.reservation_system.model.User> userList63 = userRepository60.getAllUsers();
        userRepository56.saveAllUsers(userList63);
        userRepository24.saveAllUsers(userList63);
        userRepository18.saveAllUsers(userList63);
        userRepository1.saveAllUsers(userList63);
// flaky "2) test0514(com.reservation_system.randoop.userrepository.RegressionTest1)":         org.junit.Assert.assertTrue("'" + int2 + "' != '" + 102 + "'", int2 == 102);
// flaky "2) test0514(com.reservation_system.randoop.userrepository.RegressionTest1)":         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 102 + "'", int3 == 102);
        org.junit.Assert.assertNotNull(userList11);
// flaky "2) test0514(com.reservation_system.randoop.userrepository.RegressionTest1)":         org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(userList16);
        org.junit.Assert.assertNotNull(userList19);
// flaky "1) test0514(com.reservation_system.randoop.userrepository.RegressionTest1)":         org.junit.Assert.assertTrue("'" + int20 + "' != '" + 102 + "'", int20 == 102);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(userList32);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
// flaky "1) test0514(com.reservation_system.randoop.userrepository.RegressionTest1)":         org.junit.Assert.assertTrue("'" + int43 + "' != '" + 102 + "'", int43 == 102);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertNotNull(userList50);
// flaky "1) test0514(com.reservation_system.randoop.userrepository.RegressionTest1)":         org.junit.Assert.assertTrue("'" + int51 + "' != '" + 102 + "'", int51 == 102);
        org.junit.Assert.assertNotNull(userList52);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + false + "'", boolean58 == false);
        org.junit.Assert.assertNotNull(userList61);
// flaky "1) test0514(com.reservation_system.randoop.userrepository.RegressionTest1)":         org.junit.Assert.assertTrue("'" + int62 + "' != '" + 102 + "'", int62 == 102);
        org.junit.Assert.assertNotNull(userList63);
    }

    @Test
    public void test0515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0515");
        com.reservation_system.model.Guest guest5 = new com.reservation_system.model.Guest((int) (byte) 10, "", "guest", "Guest", true);
    }

    @Test
    public void test0516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0516");
        com.reservation_system.model.Student student5 = new com.reservation_system.model.Student((int) (short) 100, "Researcher", "hi!", "", true);
        java.lang.String str6 = student5.getName();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Researcher" + "'", str6, "Researcher");
    }

    @Test
    public void test0517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0517");
        com.reservation_system.model.HeadLabCoordinator headLabCoordinator5 = new com.reservation_system.model.HeadLabCoordinator((-1), "hi!", "Alice", "guest", true);
        java.lang.String str6 = headLabCoordinator5.getEmail();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Alice" + "'", str6, "Alice");
    }

    @Test
    public void test0518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0518");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("demo/data/test-users.csv");
        int int2 = userRepository1.getNextID();
        boolean boolean3 = userRepository1.headLabCoordinatorExists();
        com.reservation_system.model.Guest guest9 = new com.reservation_system.model.Guest((int) (byte) -1, "hi!", "", "Password1!", false);
        userRepository1.addUser((com.reservation_system.model.User) guest9);
        int int11 = userRepository1.getNextID();
        boolean boolean13 = userRepository1.emailExists("headlabcoordinator");
        boolean boolean14 = userRepository1.headLabCoordinatorExists();
        boolean boolean15 = userRepository1.headLabCoordinatorExists();
        com.reservation_system.model.HeadLabCoordinator headLabCoordinator21 = new com.reservation_system.model.HeadLabCoordinator((int) ' ', "alice@example.com", "Faculty", "hi!", true);
        boolean boolean22 = headLabCoordinator21.requiresDepartmentApproval();
        userRepository1.addUser((com.reservation_system.model.User) headLabCoordinator21);
        java.util.Optional<com.reservation_system.model.User> userOptional25 = userRepository1.findByEmail("researcher");
        java.util.List<com.reservation_system.model.User> userList26 = userRepository1.getAllUsers();
// flaky "3) test0518(com.reservation_system.randoop.userrepository.RegressionTest1)":         org.junit.Assert.assertTrue("'" + int2 + "' != '" + 102 + "'", int2 == 102);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
// flaky "3) test0518(com.reservation_system.randoop.userrepository.RegressionTest1)":         org.junit.Assert.assertTrue("'" + int11 + "' != '" + 102 + "'", int11 == 102);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(userOptional25);
        org.junit.Assert.assertNotNull(userList26);
    }

    @Test
    public void test0519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0519");
        com.reservation_system.model.Guest guest5 = new com.reservation_system.model.Guest(0, "Password1!", "demo/data/test-users.csv", "researcher", false);
        boolean boolean6 = guest5.requiresDepartmentApproval();
        java.lang.String str7 = guest5.getUserType();
        java.lang.String str8 = guest5.getUserType();
        java.lang.String str9 = guest5.getName();
        guest5.setApproved(false);
        java.lang.String str12 = guest5.getUserType();
        guest5.setApproved(false);
        java.lang.String str15 = guest5.getEmail();
        java.lang.String str16 = guest5.getUserType();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Guest" + "'", str7, "Guest");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Guest" + "'", str8, "Guest");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Password1!" + "'", str9, "Password1!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Guest" + "'", str12, "Guest");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "demo/data/test-users.csv" + "'", str15, "demo/data/test-users.csv");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Guest" + "'", str16, "Guest");
    }

    @Test
    public void test0520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0520");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("demo/data/test-users.csv");
        boolean boolean3 = userRepository1.emailExists("Alice");
        com.reservation_system.model.Researcher researcher9 = new com.reservation_system.model.Researcher((int) 'a', "labmanager", "faculty", "", false);
        boolean boolean10 = researcher9.isApproved();
        java.lang.String str11 = researcher9.getName();
        userRepository1.addUser((com.reservation_system.model.User) researcher9);
        boolean boolean14 = userRepository1.emailExists("Alice");
        boolean boolean16 = userRepository1.emailExists("Password1!");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "labmanager" + "'", str11, "labmanager");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
// flaky "4) test0520(com.reservation_system.randoop.userrepository.RegressionTest1)":         org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
    }

    @Test
    public void test0521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0521");
        com.reservation_system.model.HeadLabCoordinator headLabCoordinator5 = new com.reservation_system.model.HeadLabCoordinator((int) (short) 100, "student", "Guest", "demo/data/test-users.csv", true);
    }

    @Test
    public void test0522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0522");
        com.reservation_system.model.Researcher researcher5 = new com.reservation_system.model.Researcher(0, "alice@example.com", "Faculty", "hi!", true);
    }

    @Test
    public void test0523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0523");
        com.reservation_system.model.Guest guest5 = new com.reservation_system.model.Guest((int) (byte) -1, "guest", "demo/data/test-users.csv", "headlabcoordinator", false);
        boolean boolean6 = guest5.requiresDepartmentApproval();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test0524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0524");
        com.reservation_system.model.Faculty faculty5 = new com.reservation_system.model.Faculty((int) (byte) -1, "Alice", "researcher", "Password1!", false);
        int int6 = faculty5.getID();
        java.lang.String str7 = faculty5.getUserType();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Faculty" + "'", str7, "Faculty");
    }

    @Test
    public void test0525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0525");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("demo/data/test-users.csv");
        com.reservation_system.model.Researcher researcher7 = new com.reservation_system.model.Researcher(5, "hi!", "labmanager", "Guest", false);
        userRepository1.addUser((com.reservation_system.model.User) researcher7);
        java.util.List<com.reservation_system.model.User> userList9 = userRepository1.getAllUsers();
        com.reservation_system.repository.UserRepository userRepository11 = new com.reservation_system.repository.UserRepository("demo/data/test-users.csv");
        com.reservation_system.model.Researcher researcher17 = new com.reservation_system.model.Researcher(5, "hi!", "labmanager", "Guest", false);
        userRepository11.addUser((com.reservation_system.model.User) researcher17);
        java.util.Optional<com.reservation_system.model.User> userOptional20 = userRepository11.findByEmail("alice@example.com");
        java.util.List<com.reservation_system.model.User> userList21 = userRepository11.getAllUsers();
        userRepository1.saveAllUsers(userList21);
        java.util.List<com.reservation_system.model.User> userList23 = userRepository1.getAllUsers();
        com.reservation_system.repository.UserRepository userRepository25 = new com.reservation_system.repository.UserRepository("demo/data/test-users.csv");
        com.reservation_system.model.Researcher researcher31 = new com.reservation_system.model.Researcher(5, "hi!", "labmanager", "Guest", false);
        userRepository25.addUser((com.reservation_system.model.User) researcher31);
        com.reservation_system.repository.UserRepository userRepository34 = new com.reservation_system.repository.UserRepository("demo/data/test-users.csv");
        com.reservation_system.model.Researcher researcher40 = new com.reservation_system.model.Researcher(5, "hi!", "labmanager", "Guest", false);
        userRepository34.addUser((com.reservation_system.model.User) researcher40);
        int int42 = userRepository34.getNextID();
        java.util.List<com.reservation_system.model.User> userList43 = userRepository34.getAllUsers();
        userRepository25.saveAllUsers(userList43);
        boolean boolean45 = userRepository25.headLabCoordinatorExists();
        java.util.List<com.reservation_system.model.User> userList46 = userRepository25.getAllUsers();
        userRepository1.saveAllUsers(userList46);
        org.junit.Assert.assertNotNull(userList9);
        org.junit.Assert.assertNotNull(userOptional20);
        org.junit.Assert.assertNotNull(userList21);
        org.junit.Assert.assertNotNull(userList23);
// flaky "5) test0525(com.reservation_system.randoop.userrepository.RegressionTest1)":         org.junit.Assert.assertTrue("'" + int42 + "' != '" + 102 + "'", int42 == 102);
        org.junit.Assert.assertNotNull(userList43);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + true + "'", boolean45 == true);
        org.junit.Assert.assertNotNull(userList46);
    }

    @Test
    public void test0526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0526");
        com.reservation_system.model.Faculty faculty5 = new com.reservation_system.model.Faculty(100, "researcher", "student", "Student", false);
        java.lang.String str6 = faculty5.getUserType();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Faculty" + "'", str6, "Faculty");
    }

    @Test
    public void test0527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0527");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("demo/data/test-users.csv");
        boolean boolean3 = userRepository1.emailExists("Alice");
        int int4 = userRepository1.getNextID();
        boolean boolean5 = userRepository1.headLabCoordinatorExists();
        boolean boolean6 = userRepository1.headLabCoordinatorExists();
        boolean boolean8 = userRepository1.emailExists("Researcher");
        boolean boolean10 = userRepository1.emailExists("Password1!");
        boolean boolean11 = userRepository1.headLabCoordinatorExists();
        boolean boolean13 = userRepository1.emailExists("alice@example.com");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
// flaky "6) test0527(com.reservation_system.randoop.userrepository.RegressionTest1)":         org.junit.Assert.assertTrue("'" + int4 + "' != '" + 102 + "'", int4 == 102);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
// flaky "4) test0527(com.reservation_system.randoop.userrepository.RegressionTest1)":         org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
// flaky "3) test0527(com.reservation_system.randoop.userrepository.RegressionTest1)":         org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
// flaky "2) test0527(com.reservation_system.randoop.userrepository.RegressionTest1)":         org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test0528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0528");
        com.reservation_system.model.Faculty faculty5 = new com.reservation_system.model.Faculty((int) (byte) 0, "student", "student", "Student", false);
    }

    @Test
    public void test0529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0529");
        com.reservation_system.model.LabManager labManager5 = new com.reservation_system.model.LabManager((int) (byte) 1, "", "Password1!", "", true);
    }

    @Test
    public void test0530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0530");
        com.reservation_system.model.LabManager labManager5 = new com.reservation_system.model.LabManager(0, "faculty", "Guest", "researcher", false);
        java.lang.String str6 = labManager5.getPassword();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "researcher" + "'", str6, "researcher");
    }

    @Test
    public void test0531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0531");
        com.reservation_system.model.HeadLabCoordinator headLabCoordinator5 = new com.reservation_system.model.HeadLabCoordinator(5, "faculty", "faculty", "hi!", true);
        int int6 = headLabCoordinator5.getID();
        headLabCoordinator5.setApproved(true);
        java.lang.String str9 = headLabCoordinator5.getUserType();
        java.lang.String str10 = headLabCoordinator5.getUserType();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 5 + "'", int6 == 5);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "headlabcoordinator" + "'", str9, "headlabcoordinator");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "headlabcoordinator" + "'", str10, "headlabcoordinator");
    }

    @Test
    public void test0532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0532");
        com.reservation_system.model.Researcher researcher5 = new com.reservation_system.model.Researcher(10, "labmanager", "Faculty", "student", false);
        java.lang.String str6 = researcher5.getUserType();
        java.lang.String str7 = researcher5.getPassword();
        java.lang.Class<?> wildcardClass8 = researcher5.getClass();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Researcher" + "'", str6, "Researcher");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "student" + "'", str7, "student");
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0533");
        com.reservation_system.model.Guest guest5 = new com.reservation_system.model.Guest((int) (byte) 0, "demo/data/test-users.csv", "Student", "faculty", false);
    }

    @Test
    public void test0534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0534");
        com.reservation_system.model.Researcher researcher5 = new com.reservation_system.model.Researcher((int) '#', "student", "Password1!", "student", true);
    }

    @Test
    public void test0535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0535");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("demo/data/test-users.csv");
        java.util.List<com.reservation_system.model.User> userList2 = userRepository1.getAllUsers();
        int int3 = userRepository1.getNextID();
        boolean boolean5 = userRepository1.emailExists("headlabcoordinator");
        boolean boolean6 = userRepository1.headLabCoordinatorExists();
        java.util.Optional<com.reservation_system.model.User> userOptional8 = userRepository1.findByEmail("Alice");
        java.util.Optional<com.reservation_system.model.User> userOptional10 = userRepository1.findByEmail("Student");
        com.reservation_system.model.Guest guest16 = new com.reservation_system.model.Guest((-1), "Alice", "guest", "hi!", false);
        userRepository1.addUser((com.reservation_system.model.User) guest16);
        java.lang.String str18 = guest16.getUserType();
        org.junit.Assert.assertNotNull(userList2);
// flaky "7) test0535(com.reservation_system.randoop.userrepository.RegressionTest1)":         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 102 + "'", int3 == 102);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(userOptional8);
        org.junit.Assert.assertNotNull(userOptional10);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Guest" + "'", str18, "Guest");
    }

    @Test
    public void test0536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0536");
        com.reservation_system.model.Faculty faculty5 = new com.reservation_system.model.Faculty(10, "", "researcher", "Researcher", true);
        java.lang.String str6 = faculty5.getUserType();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Faculty" + "'", str6, "Faculty");
    }

    @Test
    public void test0537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0537");
        com.reservation_system.model.LabManager labManager5 = new com.reservation_system.model.LabManager(1, "headlabcoordinator", "Alice", "faculty", false);
        java.lang.String str6 = labManager5.getName();
        java.lang.String str7 = labManager5.getUserType();
        int int8 = labManager5.getID();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "headlabcoordinator" + "'", str6, "headlabcoordinator");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "labmanager" + "'", str7, "labmanager");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
    }

    @Test
    public void test0538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0538");
        com.reservation_system.model.Guest guest5 = new com.reservation_system.model.Guest((int) (byte) 1, "alice@example.com", "faculty", "Alice", true);
        boolean boolean6 = guest5.requiresDepartmentApproval();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test0539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0539");
        com.reservation_system.model.Student student5 = new com.reservation_system.model.Student(1, "demo/data/test-users.csv", "alice@example.com", "guest", false);
        java.lang.String str6 = student5.getUserType();
        java.lang.String str7 = student5.getUserType();
        java.lang.String str8 = student5.getName();
        java.lang.String str9 = student5.getPassword();
        java.lang.String str10 = student5.getUserType();
        student5.setApproved(false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Student" + "'", str6, "Student");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Student" + "'", str7, "Student");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "demo/data/test-users.csv" + "'", str8, "demo/data/test-users.csv");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "guest" + "'", str9, "guest");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Student" + "'", str10, "Student");
    }

    @Test
    public void test0540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0540");
        com.reservation_system.model.Student student5 = new com.reservation_system.model.Student((int) (short) 100, "faculty", "alice@example.com", "", false);
    }

    @Test
    public void test0541() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0541");
        com.reservation_system.model.Researcher researcher5 = new com.reservation_system.model.Researcher((int) 'a', "labmanager", "faculty", "", false);
        boolean boolean6 = researcher5.isApproved();
        java.lang.String str7 = researcher5.getName();
        java.lang.String str8 = researcher5.getUserType();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "labmanager" + "'", str7, "labmanager");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Researcher" + "'", str8, "Researcher");
    }

    @Test
    public void test0542() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0542");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("demo/data/test-users.csv");
        int int2 = userRepository1.getNextID();
        boolean boolean3 = userRepository1.headLabCoordinatorExists();
        com.reservation_system.model.Guest guest9 = new com.reservation_system.model.Guest((int) (byte) -1, "hi!", "", "Password1!", false);
        userRepository1.addUser((com.reservation_system.model.User) guest9);
        int int11 = userRepository1.getNextID();
        boolean boolean12 = userRepository1.headLabCoordinatorExists();
// flaky "8) test0542(com.reservation_system.randoop.userrepository.RegressionTest1)":         org.junit.Assert.assertTrue("'" + int2 + "' != '" + 102 + "'", int2 == 102);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
// flaky "5) test0542(com.reservation_system.randoop.userrepository.RegressionTest1)":         org.junit.Assert.assertTrue("'" + int11 + "' != '" + 102 + "'", int11 == 102);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test0543() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0543");
        com.reservation_system.model.HeadLabCoordinator headLabCoordinator5 = new com.reservation_system.model.HeadLabCoordinator((int) '4', "demo/data/test-users.csv", "alice@example.com", "Password1!", false);
    }

    @Test
    public void test0544() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0544");
        com.reservation_system.model.LabManager labManager5 = new com.reservation_system.model.LabManager((int) '#', "", "labmanager", "hi!", true);
        labManager5.setApproved(true);
    }

    @Test
    public void test0545() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0545");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("demo/data/test-users.csv");
        java.util.List<com.reservation_system.model.User> userList2 = userRepository1.getAllUsers();
        com.reservation_system.model.Guest guest8 = new com.reservation_system.model.Guest(0, "Password1!", "demo/data/test-users.csv", "researcher", false);
        boolean boolean9 = guest8.requiresDepartmentApproval();
        java.lang.String str10 = guest8.getUserType();
        java.lang.String str11 = guest8.getUserType();
        guest8.setApproved(true);
        java.lang.String str14 = guest8.getUserType();
        userRepository1.addUser((com.reservation_system.model.User) guest8);
        com.reservation_system.model.Faculty faculty21 = new com.reservation_system.model.Faculty(5, "researcher", "guest", "faculty", true);
        java.lang.String str22 = faculty21.getUserType();
        java.lang.String str23 = faculty21.getUserType();
        java.lang.String str24 = faculty21.getUserType();
        faculty21.setApproved(false);
        userRepository1.addUser((com.reservation_system.model.User) faculty21);
        java.lang.String str28 = faculty21.getPassword();
        org.junit.Assert.assertNotNull(userList2);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Guest" + "'", str10, "Guest");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Guest" + "'", str11, "Guest");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Guest" + "'", str14, "Guest");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "Faculty" + "'", str22, "Faculty");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "Faculty" + "'", str23, "Faculty");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "Faculty" + "'", str24, "Faculty");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "faculty" + "'", str28, "faculty");
    }

    @Test
    public void test0546() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0546");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("demo/data/test-users.csv");
        int int2 = userRepository1.getNextID();
        boolean boolean3 = userRepository1.headLabCoordinatorExists();
        com.reservation_system.model.Guest guest9 = new com.reservation_system.model.Guest((int) (byte) -1, "hi!", "", "Password1!", false);
        userRepository1.addUser((com.reservation_system.model.User) guest9);
        java.util.Optional<com.reservation_system.model.User> userOptional12 = userRepository1.findByEmail("Faculty");
        boolean boolean14 = userRepository1.emailExists("hi!");
        int int15 = userRepository1.getNextID();
        java.util.Optional<com.reservation_system.model.User> userOptional17 = userRepository1.findByEmail("alice@example.com");
        boolean boolean18 = userRepository1.headLabCoordinatorExists();
// flaky "9) test0546(com.reservation_system.randoop.userrepository.RegressionTest1)":         org.junit.Assert.assertTrue("'" + int2 + "' != '" + 102 + "'", int2 == 102);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(userOptional12);
// flaky "6) test0546(com.reservation_system.randoop.userrepository.RegressionTest1)":         org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
// flaky "4) test0546(com.reservation_system.randoop.userrepository.RegressionTest1)":         org.junit.Assert.assertTrue("'" + int15 + "' != '" + 102 + "'", int15 == 102);
        org.junit.Assert.assertNotNull(userOptional17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
    }

    @Test
    public void test0547() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0547");
        com.reservation_system.model.Researcher researcher5 = new com.reservation_system.model.Researcher((int) (short) 100, "hi!", "Researcher", "hi!", false);
    }

    @Test
    public void test0548() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0548");
        com.reservation_system.model.HeadLabCoordinator headLabCoordinator5 = new com.reservation_system.model.HeadLabCoordinator(0, "Guest", "Faculty", "guest", false);
        java.lang.String str6 = headLabCoordinator5.getPassword();
        java.lang.String str7 = headLabCoordinator5.getUserType();
        boolean boolean8 = headLabCoordinator5.requiresDepartmentApproval();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "guest" + "'", str6, "guest");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "headlabcoordinator" + "'", str7, "headlabcoordinator");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test0549() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0549");
        com.reservation_system.model.Guest guest5 = new com.reservation_system.model.Guest(0, "Password1!", "demo/data/test-users.csv", "researcher", false);
        java.lang.String str6 = guest5.getUserType();
        java.lang.String str7 = guest5.getUserType();
        java.lang.String str8 = guest5.getName();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Guest" + "'", str6, "Guest");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Guest" + "'", str7, "Guest");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Password1!" + "'", str8, "Password1!");
    }

    @Test
    public void test0550() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0550");
        com.reservation_system.model.Researcher researcher5 = new com.reservation_system.model.Researcher((int) (short) 10, "", "demo/data/test-users.csv", "Student", true);
    }

    @Test
    public void test0551() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0551");
        com.reservation_system.model.Faculty faculty5 = new com.reservation_system.model.Faculty(5, "Faculty", "Password1!", "Researcher", true);
        int int6 = faculty5.getID();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 5 + "'", int6 == 5);
    }

    @Test
    public void test0552() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0552");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("demo/data/test-users.csv");
        int int2 = userRepository1.getNextID();
        int int3 = userRepository1.getNextID();
        com.reservation_system.model.HeadLabCoordinator headLabCoordinator9 = new com.reservation_system.model.HeadLabCoordinator((int) (byte) 1, "", "", "guest", false);
        userRepository1.addUser((com.reservation_system.model.User) headLabCoordinator9);
        java.lang.String str11 = headLabCoordinator9.getUserType();
// flaky "10) test0552(com.reservation_system.randoop.userrepository.RegressionTest1)":         org.junit.Assert.assertTrue("'" + int2 + "' != '" + 102 + "'", int2 == 102);
// flaky "7) test0552(com.reservation_system.randoop.userrepository.RegressionTest1)":         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 102 + "'", int3 == 102);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "headlabcoordinator" + "'", str11, "headlabcoordinator");
    }

    @Test
    public void test0553() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0553");
        com.reservation_system.model.LabManager labManager5 = new com.reservation_system.model.LabManager((int) (byte) -1, "faculty", "Student", "student", false);
        java.lang.String str6 = labManager5.getUserType();
        java.lang.String str7 = labManager5.getEmail();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "labmanager" + "'", str6, "labmanager");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Student" + "'", str7, "Student");
    }

    @Test
    public void test0554() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0554");
        com.reservation_system.model.Faculty faculty5 = new com.reservation_system.model.Faculty(0, "Alice", "guest", "student", false);
        boolean boolean6 = faculty5.isApproved();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test0555() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0555");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("demo/data/test-users.csv");
        java.util.List<com.reservation_system.model.User> userList2 = userRepository1.getAllUsers();
        java.util.List<com.reservation_system.model.User> userList3 = userRepository1.getAllUsers();
        org.junit.Assert.assertNotNull(userList2);
        org.junit.Assert.assertNotNull(userList3);
    }

    @Test
    public void test0556() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0556");
        com.reservation_system.model.User user6 = com.reservation_system.patterns.factory.UserFactory.createUser("researcher", (int) (byte) 10, "Faculty", "researcher", "headlabcoordinator", true);
        org.junit.Assert.assertNotNull(user6);
    }

    @Test
    public void test0557() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0557");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("demo/data/test-users.csv");
        com.reservation_system.model.Faculty faculty7 = new com.reservation_system.model.Faculty(5, "researcher", "guest", "faculty", true);
        java.lang.String str8 = faculty7.getUserType();
        java.lang.String str9 = faculty7.getUserType();
        userRepository1.addUser((com.reservation_system.model.User) faculty7);
        com.reservation_system.repository.UserRepository userRepository12 = new com.reservation_system.repository.UserRepository("demo/data/test-users.csv");
        boolean boolean14 = userRepository12.emailExists("Alice");
        com.reservation_system.repository.UserRepository userRepository16 = new com.reservation_system.repository.UserRepository("demo/data/test-users.csv");
        java.util.List<com.reservation_system.model.User> userList17 = userRepository16.getAllUsers();
        int int18 = userRepository16.getNextID();
        java.util.List<com.reservation_system.model.User> userList19 = userRepository16.getAllUsers();
        userRepository12.saveAllUsers(userList19);
        userRepository1.saveAllUsers(userList19);
        com.reservation_system.repository.UserRepository userRepository23 = new com.reservation_system.repository.UserRepository("demo/data/test-users.csv");
        java.util.List<com.reservation_system.model.User> userList24 = userRepository23.getAllUsers();
        com.reservation_system.model.Guest guest30 = new com.reservation_system.model.Guest(0, "Password1!", "demo/data/test-users.csv", "researcher", false);
        boolean boolean31 = guest30.requiresDepartmentApproval();
        java.lang.String str32 = guest30.getUserType();
        java.lang.String str33 = guest30.getUserType();
        guest30.setApproved(true);
        java.lang.String str36 = guest30.getUserType();
        userRepository23.addUser((com.reservation_system.model.User) guest30);
        com.reservation_system.repository.UserRepository userRepository39 = new com.reservation_system.repository.UserRepository("demo/data/test-users.csv");
        java.util.List<com.reservation_system.model.User> userList40 = userRepository39.getAllUsers();
        int int41 = userRepository39.getNextID();
        boolean boolean43 = userRepository39.emailExists("headlabcoordinator");
        boolean boolean44 = userRepository39.headLabCoordinatorExists();
        java.util.Optional<com.reservation_system.model.User> userOptional46 = userRepository39.findByEmail("Alice");
        boolean boolean48 = userRepository39.emailExists("Alice");
        boolean boolean50 = userRepository39.emailExists("Guest");
        boolean boolean52 = userRepository39.emailExists("headlabcoordinator");
        com.reservation_system.repository.UserRepository userRepository54 = new com.reservation_system.repository.UserRepository("demo/data/test-users.csv");
        boolean boolean56 = userRepository54.emailExists("Alice");
        com.reservation_system.model.Researcher researcher62 = new com.reservation_system.model.Researcher((int) 'a', "labmanager", "faculty", "", false);
        boolean boolean63 = researcher62.isApproved();
        java.lang.String str64 = researcher62.getName();
        userRepository54.addUser((com.reservation_system.model.User) researcher62);
        boolean boolean66 = userRepository54.headLabCoordinatorExists();
        java.util.List<com.reservation_system.model.User> userList67 = userRepository54.getAllUsers();
        userRepository39.saveAllUsers(userList67);
        userRepository23.saveAllUsers(userList67);
        userRepository1.saveAllUsers(userList67);
        boolean boolean72 = userRepository1.emailExists("Researcher");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Faculty" + "'", str8, "Faculty");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Faculty" + "'", str9, "Faculty");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(userList17);
// flaky "11) test0557(com.reservation_system.randoop.userrepository.RegressionTest1)":         org.junit.Assert.assertTrue("'" + int18 + "' != '" + 102 + "'", int18 == 102);
        org.junit.Assert.assertNotNull(userList19);
        org.junit.Assert.assertNotNull(userList24);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "Guest" + "'", str32, "Guest");
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "Guest" + "'", str33, "Guest");
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "Guest" + "'", str36, "Guest");
        org.junit.Assert.assertNotNull(userList40);
// flaky "8) test0557(com.reservation_system.randoop.userrepository.RegressionTest1)":         org.junit.Assert.assertTrue("'" + int41 + "' != '" + 102 + "'", int41 == 102);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + true + "'", boolean44 == true);
        org.junit.Assert.assertNotNull(userOptional46);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + true + "'", boolean50 == true);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + false + "'", boolean63 == false);
        org.junit.Assert.assertEquals("'" + str64 + "' != '" + "labmanager" + "'", str64, "labmanager");
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + true + "'", boolean66 == true);
        org.junit.Assert.assertNotNull(userList67);
// flaky "5) test0557(com.reservation_system.randoop.userrepository.RegressionTest1)":         org.junit.Assert.assertTrue("'" + boolean72 + "' != '" + true + "'", boolean72 == true);
    }

    @Test
    public void test0558() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0558");
        com.reservation_system.model.LabManager labManager5 = new com.reservation_system.model.LabManager(6, "labmanager", "", "Faculty", false);
    }

    @Test
    public void test0559() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0559");
        com.reservation_system.model.User user6 = com.reservation_system.patterns.factory.UserFactory.createUser("researcher", (-1), "demo/data/test-users.csv", "student", "demo/data/test-users.csv", true);
        org.junit.Assert.assertNotNull(user6);
    }

    @Test
    public void test0560() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0560");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("demo/data/test-users.csv");
        boolean boolean3 = userRepository1.emailExists("Alice");
        int int4 = userRepository1.getNextID();
        boolean boolean5 = userRepository1.headLabCoordinatorExists();
        boolean boolean6 = userRepository1.headLabCoordinatorExists();
        boolean boolean8 = userRepository1.emailExists("Researcher");
        boolean boolean10 = userRepository1.emailExists("alice@example.com");
        com.reservation_system.repository.UserRepository userRepository12 = new com.reservation_system.repository.UserRepository("demo/data/test-users.csv");
        java.util.List<com.reservation_system.model.User> userList13 = userRepository12.getAllUsers();
        int int14 = userRepository12.getNextID();
        boolean boolean16 = userRepository12.emailExists("headlabcoordinator");
        java.util.Optional<com.reservation_system.model.User> userOptional18 = userRepository12.findByEmail("student");
        com.reservation_system.repository.UserRepository userRepository20 = new com.reservation_system.repository.UserRepository("demo/data/test-users.csv");
        java.util.List<com.reservation_system.model.User> userList21 = userRepository20.getAllUsers();
        int int22 = userRepository20.getNextID();
        boolean boolean24 = userRepository20.emailExists("headlabcoordinator");
        boolean boolean25 = userRepository20.headLabCoordinatorExists();
        java.util.Optional<com.reservation_system.model.User> userOptional27 = userRepository20.findByEmail("Alice");
        boolean boolean29 = userRepository20.emailExists("guest");
        java.util.List<com.reservation_system.model.User> userList30 = userRepository20.getAllUsers();
        userRepository12.saveAllUsers(userList30);
        userRepository1.saveAllUsers(userList30);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
// flaky "12) test0560(com.reservation_system.randoop.userrepository.RegressionTest1)":         org.junit.Assert.assertTrue("'" + int4 + "' != '" + 102 + "'", int4 == 102);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
// flaky "9) test0560(com.reservation_system.randoop.userrepository.RegressionTest1)":         org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
// flaky "6) test0560(com.reservation_system.randoop.userrepository.RegressionTest1)":         org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(userList13);
// flaky "3) test0560(com.reservation_system.randoop.userrepository.RegressionTest1)":         org.junit.Assert.assertTrue("'" + int14 + "' != '" + 102 + "'", int14 == 102);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(userOptional18);
        org.junit.Assert.assertNotNull(userList21);
// flaky "2) test0560(com.reservation_system.randoop.userrepository.RegressionTest1)":         org.junit.Assert.assertTrue("'" + int22 + "' != '" + 102 + "'", int22 == 102);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertNotNull(userOptional27);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertNotNull(userList30);
    }

    @Test
    public void test0561() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0561");
        com.reservation_system.model.LabManager labManager5 = new com.reservation_system.model.LabManager((int) '4', "Alice", "researcher", "Faculty", false);
        java.lang.String str6 = labManager5.getName();
        labManager5.setApproved(false);
        java.lang.Class<?> wildcardClass9 = labManager5.getClass();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Alice" + "'", str6, "Alice");
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0562() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0562");
        com.reservation_system.model.Researcher researcher5 = new com.reservation_system.model.Researcher(35, "Faculty", "researcher", "Faculty", true);
        researcher5.setApproved(true);
    }

    @Test
    public void test0563() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0563");
        com.reservation_system.model.LabManager labManager5 = new com.reservation_system.model.LabManager(35, "Faculty", "Student", "alice@example.com", false);
    }

    @Test
    public void test0564() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0564");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("demo/data/test-users.csv");
        com.reservation_system.model.Researcher researcher7 = new com.reservation_system.model.Researcher(5, "hi!", "labmanager", "Guest", false);
        userRepository1.addUser((com.reservation_system.model.User) researcher7);
        java.util.List<com.reservation_system.model.User> userList9 = userRepository1.getAllUsers();
        boolean boolean10 = userRepository1.headLabCoordinatorExists();
        boolean boolean12 = userRepository1.emailExists("guest");
        com.reservation_system.repository.UserRepository userRepository14 = new com.reservation_system.repository.UserRepository("demo/data/test-users.csv");
        boolean boolean16 = userRepository14.emailExists("Alice");
        com.reservation_system.repository.UserRepository userRepository18 = new com.reservation_system.repository.UserRepository("demo/data/test-users.csv");
        java.util.List<com.reservation_system.model.User> userList19 = userRepository18.getAllUsers();
        int int20 = userRepository18.getNextID();
        java.util.List<com.reservation_system.model.User> userList21 = userRepository18.getAllUsers();
        userRepository14.saveAllUsers(userList21);
        userRepository1.saveAllUsers(userList21);
        int int24 = userRepository1.getNextID();
        com.reservation_system.model.Researcher researcher30 = new com.reservation_system.model.Researcher(98, "Alice", "Student", "guest", false);
        java.lang.String str31 = researcher30.getUserType();
        int int32 = researcher30.getID();
        userRepository1.addUser((com.reservation_system.model.User) researcher30);
        java.lang.String str34 = researcher30.getEmail();
        org.junit.Assert.assertNotNull(userList9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(userList19);
// flaky "13) test0564(com.reservation_system.randoop.userrepository.RegressionTest1)":         org.junit.Assert.assertTrue("'" + int20 + "' != '" + 102 + "'", int20 == 102);
        org.junit.Assert.assertNotNull(userList21);
// flaky "10) test0564(com.reservation_system.randoop.userrepository.RegressionTest1)":         org.junit.Assert.assertTrue("'" + int24 + "' != '" + 102 + "'", int24 == 102);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "Researcher" + "'", str31, "Researcher");
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 98 + "'", int32 == 98);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "Student" + "'", str34, "Student");
    }

    @Test
    public void test0565() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0565");
        com.reservation_system.model.HeadLabCoordinator headLabCoordinator5 = new com.reservation_system.model.HeadLabCoordinator(100, "Password1!", "researcher", "Password1!", true);
        java.lang.String str6 = headLabCoordinator5.getUserType();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "headlabcoordinator" + "'", str6, "headlabcoordinator");
    }

    @Test
    public void test0566() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0566");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("demo/data/test-users.csv");
        com.reservation_system.model.Researcher researcher7 = new com.reservation_system.model.Researcher(5, "hi!", "labmanager", "Guest", false);
        userRepository1.addUser((com.reservation_system.model.User) researcher7);
        java.util.List<com.reservation_system.model.User> userList9 = userRepository1.getAllUsers();
        com.reservation_system.model.Guest guest15 = new com.reservation_system.model.Guest(0, "Password1!", "demo/data/test-users.csv", "researcher", false);
        boolean boolean16 = guest15.requiresDepartmentApproval();
        userRepository1.addUser((com.reservation_system.model.User) guest15);
        boolean boolean19 = userRepository1.emailExists("Alice");
        java.util.List<com.reservation_system.model.User> userList20 = userRepository1.getAllUsers();
        java.util.Optional<com.reservation_system.model.User> userOptional22 = userRepository1.findByEmail("Faculty");
        boolean boolean23 = userRepository1.headLabCoordinatorExists();
        org.junit.Assert.assertNotNull(userList9);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(userList20);
        org.junit.Assert.assertNotNull(userOptional22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
    }

    @Test
    public void test0567() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0567");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("demo/data/test-users.csv");
        java.util.List<com.reservation_system.model.User> userList2 = userRepository1.getAllUsers();
        int int3 = userRepository1.getNextID();
        java.util.List<com.reservation_system.model.User> userList4 = userRepository1.getAllUsers();
        com.reservation_system.model.Faculty faculty10 = new com.reservation_system.model.Faculty(10, "", "alice@example.com", "Password1!", false);
        java.lang.String str11 = faculty10.getUserType();
        userRepository1.addUser((com.reservation_system.model.User) faculty10);
        boolean boolean14 = userRepository1.emailExists("Student");
        org.junit.Assert.assertNotNull(userList2);
// flaky "14) test0567(com.reservation_system.randoop.userrepository.RegressionTest1)":         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 102 + "'", int3 == 102);
        org.junit.Assert.assertNotNull(userList4);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Faculty" + "'", str11, "Faculty");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test0568() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0568");
        com.reservation_system.model.Guest guest5 = new com.reservation_system.model.Guest(10, "demo/data/test-users.csv", "Password1!", "hi!", true);
        java.lang.String str6 = guest5.getUserType();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Guest" + "'", str6, "Guest");
    }

    @Test
    public void test0569() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0569");
        com.reservation_system.model.HeadLabCoordinator headLabCoordinator5 = new com.reservation_system.model.HeadLabCoordinator((int) (byte) 1, "Faculty", "student", "Alice", true);
    }

    @Test
    public void test0570() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0570");
        com.reservation_system.model.LabManager labManager5 = new com.reservation_system.model.LabManager((int) (byte) 100, "student", "Password1!", "alice@example.com", false);
    }

    @Test
    public void test0571() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0571");
        com.reservation_system.model.Guest guest5 = new com.reservation_system.model.Guest((int) '#', "alice@example.com", "demo/data/test-users.csv", "headlabcoordinator", true);
        java.lang.String str6 = guest5.getEmail();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "demo/data/test-users.csv" + "'", str6, "demo/data/test-users.csv");
    }

    @Test
    public void test0572() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0572");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("demo/data/test-users.csv");
        com.reservation_system.model.Researcher researcher7 = new com.reservation_system.model.Researcher(5, "hi!", "labmanager", "Guest", false);
        userRepository1.addUser((com.reservation_system.model.User) researcher7);
        java.util.List<com.reservation_system.model.User> userList9 = userRepository1.getAllUsers();
        java.util.Optional<com.reservation_system.model.User> userOptional11 = userRepository1.findByEmail("");
        boolean boolean12 = userRepository1.headLabCoordinatorExists();
        java.util.Optional<com.reservation_system.model.User> userOptional14 = userRepository1.findByEmail("demo/data/test-users.csv");
        org.junit.Assert.assertNotNull(userList9);
        org.junit.Assert.assertNotNull(userOptional11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(userOptional14);
    }

    @Test
    public void test0573() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0573");
        com.reservation_system.model.Faculty faculty5 = new com.reservation_system.model.Faculty(100, "hi!", "Student", "headlabcoordinator", false);
    }

    @Test
    public void test0574() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0574");
        com.reservation_system.model.LabManager labManager5 = new com.reservation_system.model.LabManager((-1), "demo/data/test-users.csv", "", "headlabcoordinator", false);
    }

    @Test
    public void test0575() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0575");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("demo/data/test-users.csv");
        java.util.List<com.reservation_system.model.User> userList2 = userRepository1.getAllUsers();
        int int3 = userRepository1.getNextID();
        boolean boolean5 = userRepository1.emailExists("headlabcoordinator");
        boolean boolean7 = userRepository1.emailExists("Faculty");
        boolean boolean9 = userRepository1.emailExists("");
        com.reservation_system.model.LabManager labManager15 = new com.reservation_system.model.LabManager(101, "Faculty", "alice@example.com", "alice@example.com", true);
        userRepository1.addUser((com.reservation_system.model.User) labManager15);
        boolean boolean17 = labManager15.isApproved();
        org.junit.Assert.assertNotNull(userList2);
// flaky "15) test0575(com.reservation_system.randoop.userrepository.RegressionTest1)":         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 102 + "'", int3 == 102);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
    }

    @Test
    public void test0576() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0576");
        com.reservation_system.model.LabManager labManager5 = new com.reservation_system.model.LabManager((int) (short) 1, "Guest", "student", "labmanager", true);
        labManager5.setApproved(true);
    }

    @Test
    public void test0577() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0577");
        com.reservation_system.model.HeadLabCoordinator headLabCoordinator5 = new com.reservation_system.model.HeadLabCoordinator((int) ' ', "alice@example.com", "Faculty", "hi!", true);
        boolean boolean6 = headLabCoordinator5.requiresDepartmentApproval();
        java.lang.String str7 = headLabCoordinator5.getUserType();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "headlabcoordinator" + "'", str7, "headlabcoordinator");
    }

    @Test
    public void test0578() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0578");
        com.reservation_system.model.Guest guest5 = new com.reservation_system.model.Guest(6, "Faculty", "Guest", "faculty", true);
        java.lang.String str6 = guest5.getPassword();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "faculty" + "'", str6, "faculty");
    }

    @Test
    public void test0579() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0579");
        com.reservation_system.model.Faculty faculty5 = new com.reservation_system.model.Faculty((int) (short) 1, "headlabcoordinator", "demo/data/test-users.csv", "Student", true);
        java.lang.String str6 = faculty5.getPassword();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Student" + "'", str6, "Student");
    }

    @Test
    public void test0580() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0580");
        com.reservation_system.model.Student student5 = new com.reservation_system.model.Student(10, "demo/data/test-users.csv", "Password1!", "alice@example.com", true);
        java.lang.String str6 = student5.getEmail();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Password1!" + "'", str6, "Password1!");
    }

    @Test
    public void test0581() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0581");
        com.reservation_system.model.User user6 = com.reservation_system.patterns.factory.UserFactory.createUser("student", 52, "Researcher", "student", "guest", true);
        org.junit.Assert.assertNotNull(user6);
    }

    @Test
    public void test0582() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0582");
        // The following exception was thrown during execution in test generation
        try {
            com.reservation_system.model.User user6 = com.reservation_system.patterns.factory.UserFactory.createUser("hi!", (int) (byte) 100, "faculty", "labmanager", "alice@example.com", true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid user type: hi!");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0583() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0583");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("demo/data/test-users.csv");
        boolean boolean3 = userRepository1.emailExists("Alice");
        com.reservation_system.model.Researcher researcher9 = new com.reservation_system.model.Researcher((int) 'a', "labmanager", "faculty", "", false);
        boolean boolean10 = researcher9.isApproved();
        java.lang.String str11 = researcher9.getName();
        userRepository1.addUser((com.reservation_system.model.User) researcher9);
        boolean boolean13 = userRepository1.headLabCoordinatorExists();
        int int14 = userRepository1.getNextID();
        com.reservation_system.model.User user21 = com.reservation_system.patterns.factory.UserFactory.createUser("Guest", (int) (short) 1, "", "alice@example.com", "labmanager", true);
        userRepository1.addUser(user21);
        java.lang.String str23 = user21.getPassword();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "labmanager" + "'", str11, "labmanager");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 102 + "'", int14 == 102);
        org.junit.Assert.assertNotNull(user21);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "labmanager" + "'", str23, "labmanager");
    }

    @Test
    public void test0584() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0584");
        com.reservation_system.model.Researcher researcher5 = new com.reservation_system.model.Researcher((int) '#', "", "researcher", "alice@example.com", false);
        boolean boolean6 = researcher5.requiresDepartmentApproval();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test0585() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0585");
        com.reservation_system.model.Researcher researcher5 = new com.reservation_system.model.Researcher(1, "Student", "guest", "researcher", true);
        java.lang.String str6 = researcher5.getUserType();
        boolean boolean7 = researcher5.isApproved();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Researcher" + "'", str6, "Researcher");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test0586() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0586");
        com.reservation_system.model.Guest guest5 = new com.reservation_system.model.Guest((int) ' ', "student", "headlabcoordinator", "Guest", true);
        java.lang.String str6 = guest5.getPassword();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Guest" + "'", str6, "Guest");
    }

    @Test
    public void test0587() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0587");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("demo/data/test-users.csv");
        boolean boolean3 = userRepository1.emailExists("Password1!");
        com.reservation_system.model.Faculty faculty9 = new com.reservation_system.model.Faculty((-1), "headlabcoordinator", "Student", "", false);
        userRepository1.addUser((com.reservation_system.model.User) faculty9);
        faculty9.setApproved(false);
        java.lang.String str13 = faculty9.getUserType();
// flaky "16) test0587(com.reservation_system.randoop.userrepository.RegressionTest1)":         org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Faculty" + "'", str13, "Faculty");
    }

    @Test
    public void test0588() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0588");
        com.reservation_system.model.LabManager labManager5 = new com.reservation_system.model.LabManager(101, "hi!", "", "alice@example.com", false);
    }

    @Test
    public void test0589() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0589");
        com.reservation_system.model.Student student5 = new com.reservation_system.model.Student(98, "", "labmanager", "Password1!", true);
    }

    @Test
    public void test0590() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0590");
        com.reservation_system.model.Faculty faculty5 = new com.reservation_system.model.Faculty((int) 'a', "student", "Researcher", "headlabcoordinator", true);
    }

    @Test
    public void test0591() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0591");
        com.reservation_system.model.Student student5 = new com.reservation_system.model.Student((int) (short) 0, "student", "student", "faculty", false);
        java.lang.String str6 = student5.getPassword();
        java.lang.String str7 = student5.getName();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "faculty" + "'", str6, "faculty");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "student" + "'", str7, "student");
    }

    @Test
    public void test0592() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0592");
        com.reservation_system.model.Researcher researcher5 = new com.reservation_system.model.Researcher(1, "Guest", "Password1!", "", false);
    }

    @Test
    public void test0593() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0593");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("demo/data/test-users.csv");
        int int2 = userRepository1.getNextID();
        boolean boolean3 = userRepository1.headLabCoordinatorExists();
        com.reservation_system.model.Guest guest9 = new com.reservation_system.model.Guest((int) (byte) -1, "hi!", "", "Password1!", false);
        userRepository1.addUser((com.reservation_system.model.User) guest9);
        java.util.Optional<com.reservation_system.model.User> userOptional12 = userRepository1.findByEmail("Password1!");
        java.util.Optional<com.reservation_system.model.User> userOptional14 = userRepository1.findByEmail("Alice");
        boolean boolean16 = userRepository1.emailExists("alice@example.com");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 102 + "'", int2 == 102);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(userOptional12);
        org.junit.Assert.assertNotNull(userOptional14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
    }

    @Test
    public void test0594() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0594");
        // The following exception was thrown during execution in test generation
        try {
            com.reservation_system.model.User user6 = com.reservation_system.patterns.factory.UserFactory.createUser("", (int) (short) 1, "guest", "researcher", "hi!", false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid user type: ");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0595() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0595");
        com.reservation_system.model.Researcher researcher5 = new com.reservation_system.model.Researcher(35, "Researcher", "", "student", true);
    }

    @Test
    public void test0596() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0596");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("demo/data/test-users.csv");
        com.reservation_system.model.Researcher researcher7 = new com.reservation_system.model.Researcher(5, "hi!", "labmanager", "Guest", false);
        userRepository1.addUser((com.reservation_system.model.User) researcher7);
        boolean boolean10 = userRepository1.emailExists("labmanager");
        com.reservation_system.model.Researcher researcher16 = new com.reservation_system.model.Researcher((int) 'a', "labmanager", "faculty", "", false);
        boolean boolean17 = researcher16.requiresDepartmentApproval();
        java.lang.String str18 = researcher16.getUserType();
        userRepository1.addUser((com.reservation_system.model.User) researcher16);
        int int20 = userRepository1.getNextID();
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Researcher" + "'", str18, "Researcher");
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 102 + "'", int20 == 102);
    }

    @Test
    public void test0597() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0597");
        com.reservation_system.model.LabManager labManager5 = new com.reservation_system.model.LabManager(35, "Researcher", "Password1!", "labmanager", false);
        java.lang.String str6 = labManager5.getUserType();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "labmanager" + "'", str6, "labmanager");
    }

    @Test
    public void test0598() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0598");
        com.reservation_system.model.LabManager labManager5 = new com.reservation_system.model.LabManager(0, "Student", "researcher", "Guest", false);
        java.lang.String str6 = labManager5.getUserType();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "labmanager" + "'", str6, "labmanager");
    }

    @Test
    public void test0599() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0599");
        com.reservation_system.model.Student student5 = new com.reservation_system.model.Student((int) (short) 10, "labmanager", "", "researcher", false);
    }

    @Test
    public void test0600() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0600");
        com.reservation_system.model.HeadLabCoordinator headLabCoordinator5 = new com.reservation_system.model.HeadLabCoordinator(0, "Password1!", "Guest", "demo/data/test-users.csv", true);
    }

    @Test
    public void test0601() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0601");
        com.reservation_system.model.Guest guest5 = new com.reservation_system.model.Guest(5, "Researcher", "demo/data/test-users.csv", "Alice", false);
        int int6 = guest5.getID();
        java.lang.String str7 = guest5.getUserType();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 5 + "'", int6 == 5);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Guest" + "'", str7, "Guest");
    }

    @Test
    public void test0602() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0602");
        com.reservation_system.model.Student student5 = new com.reservation_system.model.Student(35, "demo/data/test-users.csv", "hi!", "student", false);
        boolean boolean6 = student5.isApproved();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test0603() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0603");
        com.reservation_system.model.LabManager labManager5 = new com.reservation_system.model.LabManager(0, "demo/data/test-users.csv", "labmanager", "researcher", false);
        boolean boolean6 = labManager5.isApproved();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test0604() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0604");
        com.reservation_system.model.Researcher researcher5 = new com.reservation_system.model.Researcher((int) (byte) 10, "Researcher", "labmanager", "Guest", false);
    }

    @Test
    public void test0605() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0605");
        // The following exception was thrown during execution in test generation
        try {
            com.reservation_system.model.User user6 = com.reservation_system.patterns.factory.UserFactory.createUser("hi!", 0, "Researcher", "", "guest", true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid user type: hi!");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0606() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0606");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("demo/data/test-users.csv");
        boolean boolean3 = userRepository1.emailExists("Password1!");
        int int4 = userRepository1.getNextID();
        java.lang.Class<?> wildcardClass5 = userRepository1.getClass();
// flaky "17) test0606(com.reservation_system.randoop.userrepository.RegressionTest1)":         org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 102 + "'", int4 == 102);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0607() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0607");
        com.reservation_system.model.Student student5 = new com.reservation_system.model.Student((int) (byte) -1, "researcher", "Guest", "hi!", false);
    }

    @Test
    public void test0608() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0608");
        com.reservation_system.model.Guest guest5 = new com.reservation_system.model.Guest(0, "headlabcoordinator", "Password1!", "", true);
    }

    @Test
    public void test0609() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0609");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("demo/data/test-users.csv");
        java.util.List<com.reservation_system.model.User> userList2 = userRepository1.getAllUsers();
        int int3 = userRepository1.getNextID();
        boolean boolean5 = userRepository1.emailExists("headlabcoordinator");
        boolean boolean6 = userRepository1.headLabCoordinatorExists();
        java.util.Optional<com.reservation_system.model.User> userOptional8 = userRepository1.findByEmail("Alice");
        boolean boolean10 = userRepository1.emailExists("Alice");
        boolean boolean12 = userRepository1.emailExists("Guest");
        boolean boolean14 = userRepository1.emailExists("headlabcoordinator");
        com.reservation_system.model.Student student20 = new com.reservation_system.model.Student(0, "Guest", "Password1!", "demo/data/test-users.csv", true);
        userRepository1.addUser((com.reservation_system.model.User) student20);
        java.util.Optional<com.reservation_system.model.User> userOptional23 = userRepository1.findByEmail("student");
        com.reservation_system.model.Student student29 = new com.reservation_system.model.Student((int) (short) -1, "alice@example.com", "student", "student", true);
        boolean boolean30 = student29.requiresDepartmentApproval();
        userRepository1.addUser((com.reservation_system.model.User) student29);
        org.junit.Assert.assertNotNull(userList2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 102 + "'", int3 == 102);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(userOptional8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(userOptional23);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
    }

    @Test
    public void test0610() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0610");
        com.reservation_system.model.Faculty faculty5 = new com.reservation_system.model.Faculty((int) (short) -1, "Faculty", "hi!", "alice@example.com", true);
        java.lang.Class<?> wildcardClass6 = faculty5.getClass();
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0611() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0611");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("demo/data/test-users.csv");
        int int2 = userRepository1.getNextID();
        boolean boolean3 = userRepository1.headLabCoordinatorExists();
        com.reservation_system.model.Guest guest9 = new com.reservation_system.model.Guest((int) (byte) -1, "hi!", "", "Password1!", false);
        userRepository1.addUser((com.reservation_system.model.User) guest9);
        com.reservation_system.repository.UserRepository userRepository12 = new com.reservation_system.repository.UserRepository("demo/data/test-users.csv");
        com.reservation_system.model.Researcher researcher18 = new com.reservation_system.model.Researcher(5, "hi!", "labmanager", "Guest", false);
        userRepository12.addUser((com.reservation_system.model.User) researcher18);
        java.util.List<com.reservation_system.model.User> userList20 = userRepository12.getAllUsers();
        com.reservation_system.repository.UserRepository userRepository22 = new com.reservation_system.repository.UserRepository("demo/data/test-users.csv");
        com.reservation_system.model.Researcher researcher28 = new com.reservation_system.model.Researcher(5, "hi!", "labmanager", "Guest", false);
        userRepository22.addUser((com.reservation_system.model.User) researcher28);
        java.util.Optional<com.reservation_system.model.User> userOptional31 = userRepository22.findByEmail("alice@example.com");
        java.util.List<com.reservation_system.model.User> userList32 = userRepository22.getAllUsers();
        userRepository12.saveAllUsers(userList32);
        userRepository1.saveAllUsers(userList32);
        int int35 = userRepository1.getNextID();
        java.lang.Class<?> wildcardClass36 = userRepository1.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 102 + "'", int2 == 102);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(userList20);
        org.junit.Assert.assertNotNull(userOptional31);
        org.junit.Assert.assertNotNull(userList32);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 102 + "'", int35 == 102);
        org.junit.Assert.assertNotNull(wildcardClass36);
    }

    @Test
    public void test0612() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0612");
        com.reservation_system.model.Faculty faculty5 = new com.reservation_system.model.Faculty(0, "", "researcher", "researcher", false);
        java.lang.String str6 = faculty5.getUserType();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Faculty" + "'", str6, "Faculty");
    }

    @Test
    public void test0613() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0613");
        com.reservation_system.model.Student student5 = new com.reservation_system.model.Student((int) (short) -1, "student", "labmanager", "Researcher", false);
    }

    @Test
    public void test0614() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0614");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("demo/data/test-users.csv");
        int int2 = userRepository1.getNextID();
        boolean boolean3 = userRepository1.headLabCoordinatorExists();
        com.reservation_system.model.Guest guest9 = new com.reservation_system.model.Guest((int) (byte) -1, "hi!", "", "Password1!", false);
        userRepository1.addUser((com.reservation_system.model.User) guest9);
        int int11 = userRepository1.getNextID();
        boolean boolean13 = userRepository1.emailExists("headlabcoordinator");
        boolean boolean14 = userRepository1.headLabCoordinatorExists();
        boolean boolean15 = userRepository1.headLabCoordinatorExists();
        com.reservation_system.model.HeadLabCoordinator headLabCoordinator21 = new com.reservation_system.model.HeadLabCoordinator((int) ' ', "alice@example.com", "Faculty", "hi!", true);
        boolean boolean22 = headLabCoordinator21.requiresDepartmentApproval();
        userRepository1.addUser((com.reservation_system.model.User) headLabCoordinator21);
        int int24 = userRepository1.getNextID();
        java.util.Optional<com.reservation_system.model.User> userOptional26 = userRepository1.findByEmail("researcher");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 102 + "'", int2 == 102);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 102 + "'", int11 == 102);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 102 + "'", int24 == 102);
        org.junit.Assert.assertNotNull(userOptional26);
    }

    @Test
    public void test0615() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0615");
        com.reservation_system.model.Guest guest5 = new com.reservation_system.model.Guest((int) (short) 1, "demo/data/test-users.csv", "researcher", "Guest", false);
    }

    @Test
    public void test0616() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0616");
        com.reservation_system.model.HeadLabCoordinator headLabCoordinator5 = new com.reservation_system.model.HeadLabCoordinator((int) (short) -1, "demo/data/test-users.csv", "guest", "labmanager", true);
        java.lang.String str6 = headLabCoordinator5.getUserType();
        java.lang.String str7 = headLabCoordinator5.getUserType();
        java.lang.String str8 = headLabCoordinator5.getEmail();
        java.lang.String str9 = headLabCoordinator5.getUserType();
        java.lang.String str10 = headLabCoordinator5.getName();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "headlabcoordinator" + "'", str6, "headlabcoordinator");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "headlabcoordinator" + "'", str7, "headlabcoordinator");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "guest" + "'", str8, "guest");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "headlabcoordinator" + "'", str9, "headlabcoordinator");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "demo/data/test-users.csv" + "'", str10, "demo/data/test-users.csv");
    }

    @Test
    public void test0617() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0617");
        com.reservation_system.model.HeadLabCoordinator headLabCoordinator5 = new com.reservation_system.model.HeadLabCoordinator(101, "Student", "researcher", "", false);
        java.lang.String str6 = headLabCoordinator5.getUserType();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "headlabcoordinator" + "'", str6, "headlabcoordinator");
    }

    @Test
    public void test0618() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0618");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("demo/data/test-users.csv");
        com.reservation_system.model.Researcher researcher7 = new com.reservation_system.model.Researcher(5, "hi!", "labmanager", "Guest", false);
        userRepository1.addUser((com.reservation_system.model.User) researcher7);
        java.util.List<com.reservation_system.model.User> userList9 = userRepository1.getAllUsers();
        java.util.Optional<com.reservation_system.model.User> userOptional11 = userRepository1.findByEmail("");
        boolean boolean12 = userRepository1.headLabCoordinatorExists();
        java.lang.Class<?> wildcardClass13 = userRepository1.getClass();
        org.junit.Assert.assertNotNull(userList9);
        org.junit.Assert.assertNotNull(userOptional11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0619() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0619");
        com.reservation_system.model.Student student5 = new com.reservation_system.model.Student((int) (short) 100, "guest", "Password1!", "Password1!", false);
        boolean boolean6 = student5.isApproved();
        java.lang.String str7 = student5.getUserType();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Student" + "'", str7, "Student");
    }

    @Test
    public void test0620() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0620");
        com.reservation_system.model.User user6 = com.reservation_system.patterns.factory.UserFactory.createUser("researcher", (int) (byte) 100, "hi!", "Faculty", "Faculty", false);
        org.junit.Assert.assertNotNull(user6);
    }

    @Test
    public void test0621() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0621");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("demo/data/test-users.csv");
        com.reservation_system.model.Researcher researcher7 = new com.reservation_system.model.Researcher(5, "hi!", "labmanager", "Guest", false);
        userRepository1.addUser((com.reservation_system.model.User) researcher7);
        int int9 = userRepository1.getNextID();
        boolean boolean11 = userRepository1.emailExists("faculty");
        java.util.List<com.reservation_system.model.User> userList12 = userRepository1.getAllUsers();
        com.reservation_system.model.Guest guest18 = new com.reservation_system.model.Guest(1, "demo/data/test-users.csv", "alice@example.com", "faculty", true);
        userRepository1.addUser((com.reservation_system.model.User) guest18);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 102 + "'", int9 == 102);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(userList12);
    }

    @Test
    public void test0622() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0622");
        com.reservation_system.model.Faculty faculty5 = new com.reservation_system.model.Faculty(0, "Student", "hi!", "demo/data/test-users.csv", true);
        int int6 = faculty5.getID();
        boolean boolean7 = faculty5.requiresDepartmentApproval();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test0623() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0623");
        com.reservation_system.model.LabManager labManager5 = new com.reservation_system.model.LabManager((int) (short) 100, "Alice", "Faculty", "hi!", false);
    }

    @Test
    public void test0624() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0624");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("demo/data/test-users.csv");
        com.reservation_system.model.Researcher researcher7 = new com.reservation_system.model.Researcher(5, "hi!", "labmanager", "Guest", false);
        userRepository1.addUser((com.reservation_system.model.User) researcher7);
        java.util.List<com.reservation_system.model.User> userList9 = userRepository1.getAllUsers();
        com.reservation_system.repository.UserRepository userRepository11 = new com.reservation_system.repository.UserRepository("demo/data/test-users.csv");
        com.reservation_system.model.Researcher researcher17 = new com.reservation_system.model.Researcher(5, "hi!", "labmanager", "Guest", false);
        userRepository11.addUser((com.reservation_system.model.User) researcher17);
        java.util.List<com.reservation_system.model.User> userList19 = userRepository11.getAllUsers();
        userRepository1.saveAllUsers(userList19);
        com.reservation_system.repository.UserRepository userRepository22 = new com.reservation_system.repository.UserRepository("demo/data/test-users.csv");
        com.reservation_system.model.Researcher researcher28 = new com.reservation_system.model.Researcher(5, "hi!", "labmanager", "Guest", false);
        userRepository22.addUser((com.reservation_system.model.User) researcher28);
        java.util.List<com.reservation_system.model.User> userList30 = userRepository22.getAllUsers();
        com.reservation_system.repository.UserRepository userRepository32 = new com.reservation_system.repository.UserRepository("demo/data/test-users.csv");
        com.reservation_system.model.Researcher researcher38 = new com.reservation_system.model.Researcher(5, "hi!", "labmanager", "Guest", false);
        userRepository32.addUser((com.reservation_system.model.User) researcher38);
        java.util.List<com.reservation_system.model.User> userList40 = userRepository32.getAllUsers();
        userRepository22.saveAllUsers(userList40);
        userRepository1.saveAllUsers(userList40);
        com.reservation_system.model.Faculty faculty48 = new com.reservation_system.model.Faculty((int) (byte) -1, "faculty", "demo/data/test-users.csv", "Student", false);
        boolean boolean49 = faculty48.isApproved();
        userRepository1.addUser((com.reservation_system.model.User) faculty48);
        java.util.Optional<com.reservation_system.model.User> userOptional52 = userRepository1.findByEmail("");
        org.junit.Assert.assertNotNull(userList9);
        org.junit.Assert.assertNotNull(userList19);
        org.junit.Assert.assertNotNull(userList30);
        org.junit.Assert.assertNotNull(userList40);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertNotNull(userOptional52);
    }

    @Test
    public void test0625() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0625");
        com.reservation_system.model.Student student5 = new com.reservation_system.model.Student(0, "student", "Faculty", "", false);
    }

    @Test
    public void test0626() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0626");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("demo/data/test-users.csv");
        java.util.List<com.reservation_system.model.User> userList2 = userRepository1.getAllUsers();
        com.reservation_system.model.Guest guest8 = new com.reservation_system.model.Guest(0, "Password1!", "demo/data/test-users.csv", "researcher", false);
        boolean boolean9 = guest8.requiresDepartmentApproval();
        java.lang.String str10 = guest8.getUserType();
        java.lang.String str11 = guest8.getUserType();
        guest8.setApproved(true);
        java.lang.String str14 = guest8.getUserType();
        userRepository1.addUser((com.reservation_system.model.User) guest8);
        java.util.Optional<com.reservation_system.model.User> userOptional17 = userRepository1.findByEmail("Researcher");
        java.util.Optional<com.reservation_system.model.User> userOptional19 = userRepository1.findByEmail("");
        org.junit.Assert.assertNotNull(userList2);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Guest" + "'", str10, "Guest");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Guest" + "'", str11, "Guest");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Guest" + "'", str14, "Guest");
        org.junit.Assert.assertNotNull(userOptional17);
        org.junit.Assert.assertNotNull(userOptional19);
    }

    @Test
    public void test0627() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0627");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("demo/data/test-users.csv");
        java.util.List<com.reservation_system.model.User> userList2 = userRepository1.getAllUsers();
        int int3 = userRepository1.getNextID();
        com.reservation_system.repository.UserRepository userRepository5 = new com.reservation_system.repository.UserRepository("demo/data/test-users.csv");
        java.util.List<com.reservation_system.model.User> userList6 = userRepository5.getAllUsers();
        int int7 = userRepository5.getNextID();
        boolean boolean9 = userRepository5.emailExists("headlabcoordinator");
        boolean boolean10 = userRepository5.headLabCoordinatorExists();
        java.util.Optional<com.reservation_system.model.User> userOptional12 = userRepository5.findByEmail("Alice");
        boolean boolean14 = userRepository5.emailExists("Alice");
        boolean boolean16 = userRepository5.emailExists("Guest");
        boolean boolean18 = userRepository5.emailExists("headlabcoordinator");
        java.util.List<com.reservation_system.model.User> userList19 = userRepository5.getAllUsers();
        userRepository1.saveAllUsers(userList19);
        boolean boolean22 = userRepository1.emailExists("");
        int int23 = userRepository1.getNextID();
        org.junit.Assert.assertNotNull(userList2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 102 + "'", int3 == 102);
        org.junit.Assert.assertNotNull(userList6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 102 + "'", int7 == 102);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(userOptional12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(userList19);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 102 + "'", int23 == 102);
    }

    @Test
    public void test0628() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0628");
        com.reservation_system.model.LabManager labManager5 = new com.reservation_system.model.LabManager((int) (short) -1, "researcher", "Guest", "Researcher", false);
        labManager5.setApproved(true);
    }

    @Test
    public void test0629() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0629");
        com.reservation_system.model.Researcher researcher5 = new com.reservation_system.model.Researcher((int) (short) 0, "Guest", "labmanager", "headlabcoordinator", false);
        boolean boolean6 = researcher5.isApproved();
        java.lang.String str7 = researcher5.getPassword();
        researcher5.setApproved(false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "headlabcoordinator" + "'", str7, "headlabcoordinator");
    }

    @Test
    public void test0630() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0630");
        com.reservation_system.model.HeadLabCoordinator headLabCoordinator5 = new com.reservation_system.model.HeadLabCoordinator(97, "guest", "hi!", "student", true);
    }

    @Test
    public void test0631() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0631");
        com.reservation_system.model.User user6 = com.reservation_system.patterns.factory.UserFactory.createUser("faculty", (int) (short) 100, "", "Guest", "Guest", true);
        org.junit.Assert.assertNotNull(user6);
    }

    @Test
    public void test0632() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0632");
        com.reservation_system.model.Faculty faculty5 = new com.reservation_system.model.Faculty(5, "Faculty", "faculty", "labmanager", false);
        boolean boolean6 = faculty5.requiresDepartmentApproval();
        boolean boolean7 = faculty5.requiresDepartmentApproval();
        faculty5.setApproved(false);
        int int10 = faculty5.getID();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 5 + "'", int10 == 5);
    }

    @Test
    public void test0633() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0633");
        com.reservation_system.model.Student student5 = new com.reservation_system.model.Student((-1), "faculty", "faculty", "researcher", true);
        java.lang.String str6 = student5.getUserType();
        java.lang.Class<?> wildcardClass7 = student5.getClass();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Student" + "'", str6, "Student");
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0634() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0634");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("demo/data/test-users.csv");
        com.reservation_system.model.Faculty faculty7 = new com.reservation_system.model.Faculty(5, "researcher", "guest", "faculty", true);
        java.lang.String str8 = faculty7.getUserType();
        java.lang.String str9 = faculty7.getUserType();
        userRepository1.addUser((com.reservation_system.model.User) faculty7);
        com.reservation_system.repository.UserRepository userRepository12 = new com.reservation_system.repository.UserRepository("demo/data/test-users.csv");
        boolean boolean14 = userRepository12.emailExists("Alice");
        com.reservation_system.repository.UserRepository userRepository16 = new com.reservation_system.repository.UserRepository("demo/data/test-users.csv");
        java.util.List<com.reservation_system.model.User> userList17 = userRepository16.getAllUsers();
        int int18 = userRepository16.getNextID();
        java.util.List<com.reservation_system.model.User> userList19 = userRepository16.getAllUsers();
        userRepository12.saveAllUsers(userList19);
        userRepository1.saveAllUsers(userList19);
        boolean boolean22 = userRepository1.headLabCoordinatorExists();
        boolean boolean24 = userRepository1.emailExists("demo/data/test-users.csv");
        com.reservation_system.model.Researcher researcher30 = new com.reservation_system.model.Researcher((int) 'a', "labmanager", "faculty", "", false);
        boolean boolean31 = researcher30.isApproved();
        java.lang.String str32 = researcher30.getName();
        java.lang.String str33 = researcher30.getName();
        researcher30.setApproved(false);
        java.lang.String str36 = researcher30.getUserType();
        userRepository1.addUser((com.reservation_system.model.User) researcher30);
        java.lang.String str38 = researcher30.getUserType();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Faculty" + "'", str8, "Faculty");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Faculty" + "'", str9, "Faculty");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(userList17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 102 + "'", int18 == 102);
        org.junit.Assert.assertNotNull(userList19);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "labmanager" + "'", str32, "labmanager");
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "labmanager" + "'", str33, "labmanager");
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "Researcher" + "'", str36, "Researcher");
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "Researcher" + "'", str38, "Researcher");
    }

    @Test
    public void test0635() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0635");
        com.reservation_system.model.Faculty faculty5 = new com.reservation_system.model.Faculty(10, "", "alice@example.com", "Password1!", false);
        java.lang.String str6 = faculty5.getUserType();
        faculty5.setApproved(true);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Faculty" + "'", str6, "Faculty");
    }

    @Test
    public void test0636() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0636");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("demo/data/test-users.csv");
        java.util.List<com.reservation_system.model.User> userList2 = userRepository1.getAllUsers();
        int int3 = userRepository1.getNextID();
        boolean boolean5 = userRepository1.emailExists("headlabcoordinator");
        boolean boolean6 = userRepository1.headLabCoordinatorExists();
        java.util.Optional<com.reservation_system.model.User> userOptional8 = userRepository1.findByEmail("Alice");
        boolean boolean10 = userRepository1.emailExists("Alice");
        int int11 = userRepository1.getNextID();
        boolean boolean13 = userRepository1.emailExists("");
        org.junit.Assert.assertNotNull(userList2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 102 + "'", int3 == 102);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(userOptional8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 102 + "'", int11 == 102);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test0637() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0637");
        com.reservation_system.model.Faculty faculty5 = new com.reservation_system.model.Faculty((int) (short) 0, "Faculty", "Guest", "Faculty", false);
        int int6 = faculty5.getID();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test0638() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0638");
        com.reservation_system.model.Student student5 = new com.reservation_system.model.Student(101, "Researcher", "", "alice@example.com", false);
    }

    @Test
    public void test0639() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0639");
        com.reservation_system.model.User user6 = com.reservation_system.patterns.factory.UserFactory.createUser("Faculty", (int) (byte) 1, "Faculty", "student", "Password1!", true);
        java.lang.String str7 = user6.getEmail();
        org.junit.Assert.assertNotNull(user6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "student" + "'", str7, "student");
    }

    @Test
    public void test0640() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0640");
        com.reservation_system.model.Researcher researcher5 = new com.reservation_system.model.Researcher((int) 'a', "labmanager", "faculty", "", false);
        boolean boolean6 = researcher5.isApproved();
        java.lang.String str7 = researcher5.getName();
        researcher5.setApproved(true);
        java.lang.String str10 = researcher5.getName();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "labmanager" + "'", str7, "labmanager");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "labmanager" + "'", str10, "labmanager");
    }

    @Test
    public void test0641() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0641");
        com.reservation_system.model.Faculty faculty5 = new com.reservation_system.model.Faculty(5, "Faculty", "faculty", "labmanager", false);
        boolean boolean6 = faculty5.requiresDepartmentApproval();
        boolean boolean7 = faculty5.requiresDepartmentApproval();
        int int8 = faculty5.getID();
        java.lang.String str9 = faculty5.getName();
        int int10 = faculty5.getID();
        java.lang.Class<?> wildcardClass11 = faculty5.getClass();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 5 + "'", int8 == 5);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Faculty" + "'", str9, "Faculty");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 5 + "'", int10 == 5);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0642() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0642");
        com.reservation_system.model.Guest guest5 = new com.reservation_system.model.Guest((int) 'a', "Password1!", "", "guest", false);
        boolean boolean6 = guest5.isApproved();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test0643() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0643");
        com.reservation_system.model.Student student5 = new com.reservation_system.model.Student((int) (byte) 0, "Alice", "student", "Alice", true);
        java.lang.String str6 = student5.getName();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Alice" + "'", str6, "Alice");
    }

    @Test
    public void test0644() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0644");
        com.reservation_system.model.HeadLabCoordinator headLabCoordinator5 = new com.reservation_system.model.HeadLabCoordinator((int) (byte) 10, "", "Alice", "guest", true);
        java.lang.String str6 = headLabCoordinator5.getUserType();
        java.lang.String str7 = headLabCoordinator5.getUserType();
        java.lang.String str8 = headLabCoordinator5.getEmail();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "headlabcoordinator" + "'", str6, "headlabcoordinator");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "headlabcoordinator" + "'", str7, "headlabcoordinator");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Alice" + "'", str8, "Alice");
    }

    @Test
    public void test0645() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0645");
        com.reservation_system.model.Student student5 = new com.reservation_system.model.Student((-1), "headlabcoordinator", "faculty", "Guest", false);
        java.lang.String str6 = student5.getUserType();
        java.lang.String str7 = student5.getUserType();
        boolean boolean8 = student5.requiresDepartmentApproval();
        java.lang.String str9 = student5.getUserType();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Student" + "'", str6, "Student");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Student" + "'", str7, "Student");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Student" + "'", str9, "Student");
    }

    @Test
    public void test0646() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0646");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("demo/data/test-users.csv");
        com.reservation_system.model.Researcher researcher7 = new com.reservation_system.model.Researcher(5, "hi!", "labmanager", "Guest", false);
        userRepository1.addUser((com.reservation_system.model.User) researcher7);
        int int9 = userRepository1.getNextID();
        com.reservation_system.repository.UserRepository userRepository11 = new com.reservation_system.repository.UserRepository("demo/data/test-users.csv");
        com.reservation_system.model.Researcher researcher17 = new com.reservation_system.model.Researcher(5, "hi!", "labmanager", "Guest", false);
        userRepository11.addUser((com.reservation_system.model.User) researcher17);
        java.util.List<com.reservation_system.model.User> userList19 = userRepository11.getAllUsers();
        boolean boolean20 = userRepository11.headLabCoordinatorExists();
        boolean boolean22 = userRepository11.emailExists("guest");
        com.reservation_system.repository.UserRepository userRepository24 = new com.reservation_system.repository.UserRepository("demo/data/test-users.csv");
        boolean boolean26 = userRepository24.emailExists("Alice");
        com.reservation_system.repository.UserRepository userRepository28 = new com.reservation_system.repository.UserRepository("demo/data/test-users.csv");
        java.util.List<com.reservation_system.model.User> userList29 = userRepository28.getAllUsers();
        int int30 = userRepository28.getNextID();
        java.util.List<com.reservation_system.model.User> userList31 = userRepository28.getAllUsers();
        userRepository24.saveAllUsers(userList31);
        userRepository11.saveAllUsers(userList31);
        java.util.List<com.reservation_system.model.User> userList34 = userRepository11.getAllUsers();
        userRepository1.saveAllUsers(userList34);
        boolean boolean36 = userRepository1.headLabCoordinatorExists();
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 102 + "'", int9 == 102);
        org.junit.Assert.assertNotNull(userList19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(userList29);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 102 + "'", int30 == 102);
        org.junit.Assert.assertNotNull(userList31);
        org.junit.Assert.assertNotNull(userList34);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
    }

    @Test
    public void test0647() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0647");
        com.reservation_system.model.Researcher researcher5 = new com.reservation_system.model.Researcher(0, "", "Password1!", "researcher", false);
        researcher5.setApproved(true);
        int int8 = researcher5.getID();
        java.lang.String str9 = researcher5.getUserType();
        boolean boolean10 = researcher5.isApproved();
        java.lang.String str11 = researcher5.getUserType();
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Researcher" + "'", str9, "Researcher");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Researcher" + "'", str11, "Researcher");
    }

    @Test
    public void test0648() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0648");
        com.reservation_system.model.Faculty faculty5 = new com.reservation_system.model.Faculty((int) (byte) 1, "faculty", "student", "labmanager", true);
        java.lang.String str6 = faculty5.getPassword();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "labmanager" + "'", str6, "labmanager");
    }

    @Test
    public void test0649() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0649");
        com.reservation_system.model.Guest guest5 = new com.reservation_system.model.Guest((int) '4', "faculty", "guest", "alice@example.com", true);
        java.lang.String str6 = guest5.getUserType();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Guest" + "'", str6, "Guest");
    }

    @Test
    public void test0650() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0650");
        com.reservation_system.model.Guest guest5 = new com.reservation_system.model.Guest(6, "Faculty", "Guest", "faculty", true);
        java.lang.String str6 = guest5.getUserType();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Guest" + "'", str6, "Guest");
    }

    @Test
    public void test0651() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0651");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("demo/data/test-users.csv");
        int int2 = userRepository1.getNextID();
        boolean boolean3 = userRepository1.headLabCoordinatorExists();
        com.reservation_system.model.Guest guest9 = new com.reservation_system.model.Guest((int) (byte) -1, "hi!", "", "Password1!", false);
        userRepository1.addUser((com.reservation_system.model.User) guest9);
        int int11 = userRepository1.getNextID();
        boolean boolean13 = userRepository1.emailExists("headlabcoordinator");
        java.util.List<com.reservation_system.model.User> userList14 = userRepository1.getAllUsers();
        int int15 = userRepository1.getNextID();
        java.lang.Class<?> wildcardClass16 = userRepository1.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 102 + "'", int2 == 102);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 102 + "'", int11 == 102);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(userList14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 102 + "'", int15 == 102);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test0652() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0652");
        com.reservation_system.model.Student student5 = new com.reservation_system.model.Student(52, "Faculty", "faculty", "labmanager", false);
        java.lang.String str6 = student5.getUserType();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Student" + "'", str6, "Student");
    }

    @Test
    public void test0653() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0653");
        com.reservation_system.model.LabManager labManager5 = new com.reservation_system.model.LabManager((int) '4', "labmanager", "Alice", "headlabcoordinator", false);
        java.lang.String str6 = labManager5.getUserType();
        java.lang.String str7 = labManager5.getUserType();
        java.lang.String str8 = labManager5.getUserType();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "labmanager" + "'", str6, "labmanager");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "labmanager" + "'", str7, "labmanager");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "labmanager" + "'", str8, "labmanager");
    }

    @Test
    public void test0654() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0654");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("demo/data/test-users.csv");
        com.reservation_system.model.Researcher researcher7 = new com.reservation_system.model.Researcher(5, "hi!", "labmanager", "Guest", false);
        userRepository1.addUser((com.reservation_system.model.User) researcher7);
        java.util.List<com.reservation_system.model.User> userList9 = userRepository1.getAllUsers();
        boolean boolean10 = userRepository1.headLabCoordinatorExists();
        boolean boolean12 = userRepository1.emailExists("guest");
        com.reservation_system.repository.UserRepository userRepository14 = new com.reservation_system.repository.UserRepository("demo/data/test-users.csv");
        boolean boolean16 = userRepository14.emailExists("Alice");
        com.reservation_system.repository.UserRepository userRepository18 = new com.reservation_system.repository.UserRepository("demo/data/test-users.csv");
        java.util.List<com.reservation_system.model.User> userList19 = userRepository18.getAllUsers();
        int int20 = userRepository18.getNextID();
        java.util.List<com.reservation_system.model.User> userList21 = userRepository18.getAllUsers();
        userRepository14.saveAllUsers(userList21);
        userRepository1.saveAllUsers(userList21);
        int int24 = userRepository1.getNextID();
        com.reservation_system.model.Researcher researcher30 = new com.reservation_system.model.Researcher(98, "Alice", "Student", "guest", false);
        java.lang.String str31 = researcher30.getUserType();
        int int32 = researcher30.getID();
        userRepository1.addUser((com.reservation_system.model.User) researcher30);
        com.reservation_system.model.Faculty faculty39 = new com.reservation_system.model.Faculty((int) (short) 10, "labmanager", "faculty", "alice@example.com", false);
        java.lang.String str40 = faculty39.getUserType();
        boolean boolean41 = faculty39.isApproved();
        java.lang.String str42 = faculty39.getEmail();
        userRepository1.addUser((com.reservation_system.model.User) faculty39);
        org.junit.Assert.assertNotNull(userList9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(userList19);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 102 + "'", int20 == 102);
        org.junit.Assert.assertNotNull(userList21);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 102 + "'", int24 == 102);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "Researcher" + "'", str31, "Researcher");
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 98 + "'", int32 == 98);
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "Faculty" + "'", str40, "Faculty");
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "faculty" + "'", str42, "faculty");
    }

    @Test
    public void test0655() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0655");
        com.reservation_system.model.Student student5 = new com.reservation_system.model.Student(0, "labmanager", "researcher", "guest", false);
        student5.setApproved(true);
    }

    @Test
    public void test0656() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0656");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("demo/data/test-users.csv");
        com.reservation_system.model.Researcher researcher7 = new com.reservation_system.model.Researcher(5, "hi!", "labmanager", "Guest", false);
        userRepository1.addUser((com.reservation_system.model.User) researcher7);
        java.util.Optional<com.reservation_system.model.User> userOptional10 = userRepository1.findByEmail("alice@example.com");
        java.util.List<com.reservation_system.model.User> userList11 = userRepository1.getAllUsers();
        com.reservation_system.repository.UserRepository userRepository13 = new com.reservation_system.repository.UserRepository("demo/data/test-users.csv");
        com.reservation_system.model.Researcher researcher19 = new com.reservation_system.model.Researcher(5, "hi!", "labmanager", "Guest", false);
        userRepository13.addUser((com.reservation_system.model.User) researcher19);
        java.util.List<com.reservation_system.model.User> userList21 = userRepository13.getAllUsers();
        boolean boolean23 = userRepository13.emailExists("hi!");
        com.reservation_system.repository.UserRepository userRepository25 = new com.reservation_system.repository.UserRepository("demo/data/test-users.csv");
        com.reservation_system.model.Researcher researcher31 = new com.reservation_system.model.Researcher(5, "hi!", "labmanager", "Guest", false);
        userRepository25.addUser((com.reservation_system.model.User) researcher31);
        java.util.List<com.reservation_system.model.User> userList33 = userRepository25.getAllUsers();
        com.reservation_system.model.Guest guest39 = new com.reservation_system.model.Guest(0, "Password1!", "demo/data/test-users.csv", "researcher", false);
        boolean boolean40 = guest39.requiresDepartmentApproval();
        userRepository25.addUser((com.reservation_system.model.User) guest39);
        boolean boolean43 = userRepository25.emailExists("Alice");
        int int44 = userRepository25.getNextID();
        com.reservation_system.repository.UserRepository userRepository46 = new com.reservation_system.repository.UserRepository("demo/data/test-users.csv");
        boolean boolean48 = userRepository46.emailExists("Alice");
        com.reservation_system.repository.UserRepository userRepository50 = new com.reservation_system.repository.UserRepository("demo/data/test-users.csv");
        java.util.List<com.reservation_system.model.User> userList51 = userRepository50.getAllUsers();
        int int52 = userRepository50.getNextID();
        java.util.List<com.reservation_system.model.User> userList53 = userRepository50.getAllUsers();
        userRepository46.saveAllUsers(userList53);
        userRepository25.saveAllUsers(userList53);
        userRepository13.saveAllUsers(userList53);
        userRepository1.saveAllUsers(userList53);
        boolean boolean58 = userRepository1.headLabCoordinatorExists();
        int int59 = userRepository1.getNextID();
        org.junit.Assert.assertNotNull(userOptional10);
        org.junit.Assert.assertNotNull(userList11);
        org.junit.Assert.assertNotNull(userList21);
// flaky "18) test0656(com.reservation_system.randoop.userrepository.RegressionTest1)":         org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertNotNull(userList33);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 102 + "'", int44 == 102);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertNotNull(userList51);
        org.junit.Assert.assertTrue("'" + int52 + "' != '" + 102 + "'", int52 == 102);
        org.junit.Assert.assertNotNull(userList53);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + true + "'", boolean58 == true);
        org.junit.Assert.assertTrue("'" + int59 + "' != '" + 102 + "'", int59 == 102);
    }

    @Test
    public void test0657() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0657");
        com.reservation_system.model.Student student5 = new com.reservation_system.model.Student(101, "headlabcoordinator", "Guest", "demo/data/test-users.csv", false);
        student5.setApproved(false);
        boolean boolean8 = student5.requiresDepartmentApproval();
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test0658() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0658");
        com.reservation_system.model.Faculty faculty5 = new com.reservation_system.model.Faculty(5, "Faculty", "faculty", "labmanager", false);
        boolean boolean6 = faculty5.requiresDepartmentApproval();
        faculty5.setApproved(true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test0659() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0659");
        com.reservation_system.model.Student student5 = new com.reservation_system.model.Student((int) (short) 0, "Password1!", "demo/data/test-users.csv", "faculty", true);
        java.lang.String str6 = student5.getUserType();
        java.lang.String str7 = student5.getUserType();
        java.lang.String str8 = student5.getEmail();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Student" + "'", str6, "Student");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Student" + "'", str7, "Student");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "demo/data/test-users.csv" + "'", str8, "demo/data/test-users.csv");
    }

    @Test
    public void test0660() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0660");
        com.reservation_system.model.LabManager labManager5 = new com.reservation_system.model.LabManager((int) (byte) 100, "researcher", "alice@example.com", "", false);
        labManager5.setApproved(false);
        int int8 = labManager5.getID();
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8 == 100);
    }

    @Test
    public void test0661() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0661");
        com.reservation_system.model.Researcher researcher5 = new com.reservation_system.model.Researcher((int) (short) 100, "Alice", "Faculty", "labmanager", true);
        java.lang.String str6 = researcher5.getPassword();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "labmanager" + "'", str6, "labmanager");
    }

    @Test
    public void test0662() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0662");
        com.reservation_system.model.Faculty faculty5 = new com.reservation_system.model.Faculty(5, "researcher", "guest", "faculty", true);
        java.lang.String str6 = faculty5.getUserType();
        java.lang.String str7 = faculty5.getEmail();
        java.lang.String str8 = faculty5.getUserType();
        java.lang.String str9 = faculty5.getEmail();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Faculty" + "'", str6, "Faculty");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "guest" + "'", str7, "guest");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Faculty" + "'", str8, "Faculty");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "guest" + "'", str9, "guest");
    }

    @Test
    public void test0663() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0663");
        com.reservation_system.model.Student student5 = new com.reservation_system.model.Student((int) ' ', "Faculty", "", "Student", false);
    }

    @Test
    public void test0664() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0664");
        com.reservation_system.model.LabManager labManager5 = new com.reservation_system.model.LabManager(98, "Guest", "Password1!", "hi!", false);
    }

    @Test
    public void test0665() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0665");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("demo/data/test-users.csv");
        java.util.List<com.reservation_system.model.User> userList2 = userRepository1.getAllUsers();
        int int3 = userRepository1.getNextID();
        boolean boolean5 = userRepository1.emailExists("headlabcoordinator");
        boolean boolean6 = userRepository1.headLabCoordinatorExists();
        java.util.Optional<com.reservation_system.model.User> userOptional8 = userRepository1.findByEmail("Alice");
        boolean boolean10 = userRepository1.emailExists("Alice");
        com.reservation_system.repository.UserRepository userRepository12 = new com.reservation_system.repository.UserRepository("demo/data/test-users.csv");
        java.util.List<com.reservation_system.model.User> userList13 = userRepository12.getAllUsers();
        int int14 = userRepository12.getNextID();
        boolean boolean16 = userRepository12.emailExists("headlabcoordinator");
        boolean boolean17 = userRepository12.headLabCoordinatorExists();
        java.util.Optional<com.reservation_system.model.User> userOptional19 = userRepository12.findByEmail("Alice");
        boolean boolean21 = userRepository12.emailExists("Alice");
        int int22 = userRepository12.getNextID();
        java.util.List<com.reservation_system.model.User> userList23 = userRepository12.getAllUsers();
        userRepository1.saveAllUsers(userList23);
        java.util.Optional<com.reservation_system.model.User> userOptional26 = userRepository1.findByEmail("Student");
        java.util.List<com.reservation_system.model.User> userList27 = userRepository1.getAllUsers();
        org.junit.Assert.assertNotNull(userList2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 102 + "'", int3 == 102);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(userOptional8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(userList13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 102 + "'", int14 == 102);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNotNull(userOptional19);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 102 + "'", int22 == 102);
        org.junit.Assert.assertNotNull(userList23);
        org.junit.Assert.assertNotNull(userOptional26);
        org.junit.Assert.assertNotNull(userList27);
    }

    @Test
    public void test0666() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0666");
        com.reservation_system.model.Student student5 = new com.reservation_system.model.Student((int) (short) 0, "researcher", "hi!", "headlabcoordinator", false);
        int int6 = student5.getID();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test0667() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0667");
        com.reservation_system.model.LabManager labManager5 = new com.reservation_system.model.LabManager(97, "faculty", "guest", "alice@example.com", true);
        java.lang.String str6 = labManager5.getUserType();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "labmanager" + "'", str6, "labmanager");
    }

    @Test
    public void test0668() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0668");
        com.reservation_system.model.LabManager labManager5 = new com.reservation_system.model.LabManager(1, "headlabcoordinator", "Alice", "faculty", false);
        java.lang.String str6 = labManager5.getUserType();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "labmanager" + "'", str6, "labmanager");
    }

    @Test
    public void test0669() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0669");
        com.reservation_system.model.HeadLabCoordinator headLabCoordinator5 = new com.reservation_system.model.HeadLabCoordinator((int) (short) 0, "Researcher", "researcher", "labmanager", false);
        java.lang.String str6 = headLabCoordinator5.getUserType();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "headlabcoordinator" + "'", str6, "headlabcoordinator");
    }

    @Test
    public void test0670() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0670");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("demo/data/test-users.csv");
        java.util.List<com.reservation_system.model.User> userList2 = userRepository1.getAllUsers();
        int int3 = userRepository1.getNextID();
        boolean boolean5 = userRepository1.emailExists("headlabcoordinator");
        boolean boolean6 = userRepository1.headLabCoordinatorExists();
        java.util.Optional<com.reservation_system.model.User> userOptional8 = userRepository1.findByEmail("Alice");
        java.util.Optional<com.reservation_system.model.User> userOptional10 = userRepository1.findByEmail("guest");
        java.util.Optional<com.reservation_system.model.User> userOptional12 = userRepository1.findByEmail("Alice");
        org.junit.Assert.assertNotNull(userList2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 102 + "'", int3 == 102);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(userOptional8);
        org.junit.Assert.assertNotNull(userOptional10);
        org.junit.Assert.assertNotNull(userOptional12);
    }

    @Test
    public void test0671() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0671");
        com.reservation_system.model.Student student5 = new com.reservation_system.model.Student(5, "Guest", "hi!", "researcher", true);
    }

    @Test
    public void test0672() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0672");
        com.reservation_system.model.Researcher researcher5 = new com.reservation_system.model.Researcher((int) (short) 10, "alice@example.com", "faculty", "", false);
    }

    @Test
    public void test0673() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0673");
        com.reservation_system.model.Student student5 = new com.reservation_system.model.Student(1, "demo/data/test-users.csv", "alice@example.com", "guest", false);
        java.lang.String str6 = student5.getUserType();
        boolean boolean7 = student5.requiresDepartmentApproval();
        boolean boolean8 = student5.isApproved();
        student5.setApproved(false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Student" + "'", str6, "Student");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test0674() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0674");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("demo/data/test-users.csv");
        com.reservation_system.model.Faculty faculty7 = new com.reservation_system.model.Faculty(5, "researcher", "guest", "faculty", true);
        java.lang.String str8 = faculty7.getUserType();
        java.lang.String str9 = faculty7.getUserType();
        userRepository1.addUser((com.reservation_system.model.User) faculty7);
        boolean boolean11 = userRepository1.headLabCoordinatorExists();
        boolean boolean13 = userRepository1.emailExists("Guest");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Faculty" + "'", str8, "Faculty");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Faculty" + "'", str9, "Faculty");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test0675() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0675");
        com.reservation_system.model.LabManager labManager5 = new com.reservation_system.model.LabManager(10, "Guest", "Guest", "faculty", true);
        java.lang.String str6 = labManager5.getName();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Guest" + "'", str6, "Guest");
    }

    @Test
    public void test0676() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0676");
        com.reservation_system.model.Faculty faculty5 = new com.reservation_system.model.Faculty(5, "researcher", "guest", "faculty", true);
        java.lang.String str6 = faculty5.getUserType();
        java.lang.String str7 = faculty5.getUserType();
        java.lang.String str8 = faculty5.getUserType();
        faculty5.setApproved(false);
        java.lang.String str11 = faculty5.getName();
        faculty5.setApproved(false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Faculty" + "'", str6, "Faculty");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Faculty" + "'", str7, "Faculty");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Faculty" + "'", str8, "Faculty");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "researcher" + "'", str11, "researcher");
    }

    @Test
    public void test0677() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0677");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("demo/data/test-users.csv");
        com.reservation_system.model.Researcher researcher7 = new com.reservation_system.model.Researcher(5, "hi!", "labmanager", "Guest", false);
        userRepository1.addUser((com.reservation_system.model.User) researcher7);
        java.util.List<com.reservation_system.model.User> userList9 = userRepository1.getAllUsers();
        com.reservation_system.model.Guest guest15 = new com.reservation_system.model.Guest(0, "Password1!", "demo/data/test-users.csv", "researcher", false);
        boolean boolean16 = guest15.requiresDepartmentApproval();
        userRepository1.addUser((com.reservation_system.model.User) guest15);
        boolean boolean19 = userRepository1.emailExists("Alice");
        java.util.Optional<com.reservation_system.model.User> userOptional21 = userRepository1.findByEmail("hi!");
        int int22 = userRepository1.getNextID();
        com.reservation_system.repository.UserRepository userRepository24 = new com.reservation_system.repository.UserRepository("demo/data/test-users.csv");
        com.reservation_system.model.Researcher researcher30 = new com.reservation_system.model.Researcher(5, "hi!", "labmanager", "Guest", false);
        userRepository24.addUser((com.reservation_system.model.User) researcher30);
        int int32 = userRepository24.getNextID();
        com.reservation_system.repository.UserRepository userRepository34 = new com.reservation_system.repository.UserRepository("demo/data/test-users.csv");
        int int35 = userRepository34.getNextID();
        boolean boolean36 = userRepository34.headLabCoordinatorExists();
        com.reservation_system.model.Guest guest42 = new com.reservation_system.model.Guest((int) (byte) -1, "hi!", "", "Password1!", false);
        userRepository34.addUser((com.reservation_system.model.User) guest42);
        int int44 = userRepository34.getNextID();
        boolean boolean46 = userRepository34.emailExists("headlabcoordinator");
        java.util.List<com.reservation_system.model.User> userList47 = userRepository34.getAllUsers();
        userRepository24.saveAllUsers(userList47);
        userRepository1.saveAllUsers(userList47);
        com.reservation_system.repository.UserRepository userRepository51 = new com.reservation_system.repository.UserRepository("demo/data/test-users.csv");
        boolean boolean53 = userRepository51.emailExists("Password1!");
        com.reservation_system.model.Faculty faculty59 = new com.reservation_system.model.Faculty((-1), "headlabcoordinator", "Student", "", false);
        userRepository51.addUser((com.reservation_system.model.User) faculty59);
        faculty59.setApproved(true);
        java.lang.String str63 = faculty59.getUserType();
        userRepository1.addUser((com.reservation_system.model.User) faculty59);
        java.lang.String str65 = faculty59.getUserType();
        org.junit.Assert.assertNotNull(userList9);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(userOptional21);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 102 + "'", int22 == 102);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 102 + "'", int32 == 102);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 102 + "'", int35 == 102);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 102 + "'", int44 == 102);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertNotNull(userList47);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + true + "'", boolean53 == true);
        org.junit.Assert.assertEquals("'" + str63 + "' != '" + "Faculty" + "'", str63, "Faculty");
        org.junit.Assert.assertEquals("'" + str65 + "' != '" + "Faculty" + "'", str65, "Faculty");
    }

    @Test
    public void test0678() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0678");
        com.reservation_system.model.Faculty faculty5 = new com.reservation_system.model.Faculty(101, "guest", "labmanager", "alice@example.com", true);
    }

    @Test
    public void test0679() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0679");
        com.reservation_system.model.Faculty faculty5 = new com.reservation_system.model.Faculty(5, "Faculty", "faculty", "labmanager", false);
        boolean boolean6 = faculty5.requiresDepartmentApproval();
        boolean boolean7 = faculty5.requiresDepartmentApproval();
        int int8 = faculty5.getID();
        int int9 = faculty5.getID();
        boolean boolean10 = faculty5.requiresDepartmentApproval();
        java.lang.String str11 = faculty5.getName();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 5 + "'", int8 == 5);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 5 + "'", int9 == 5);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Faculty" + "'", str11, "Faculty");
    }

    @Test
    public void test0680() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0680");
        com.reservation_system.model.HeadLabCoordinator headLabCoordinator5 = new com.reservation_system.model.HeadLabCoordinator(52, "Guest", "Student", "student", false);
    }

    @Test
    public void test0681() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0681");
        com.reservation_system.model.Student student5 = new com.reservation_system.model.Student(100, "student", "student", "Alice", false);
    }

    @Test
    public void test0682() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0682");
        com.reservation_system.model.Guest guest5 = new com.reservation_system.model.Guest(1, "Password1!", "Faculty", "faculty", false);
        java.lang.String str6 = guest5.getEmail();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Faculty" + "'", str6, "Faculty");
    }

    @Test
    public void test0683() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0683");
        com.reservation_system.model.User user6 = com.reservation_system.patterns.factory.UserFactory.createUser("Faculty", (-1), "guest", "researcher", "labmanager", false);
        org.junit.Assert.assertNotNull(user6);
    }

    @Test
    public void test0684() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0684");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("demo/data/test-users.csv");
        com.reservation_system.model.Researcher researcher7 = new com.reservation_system.model.Researcher(5, "hi!", "labmanager", "Guest", false);
        userRepository1.addUser((com.reservation_system.model.User) researcher7);
        java.util.List<com.reservation_system.model.User> userList9 = userRepository1.getAllUsers();
        boolean boolean10 = userRepository1.headLabCoordinatorExists();
        boolean boolean12 = userRepository1.emailExists("guest");
        java.util.Optional<com.reservation_system.model.User> userOptional14 = userRepository1.findByEmail("researcher");
        java.util.List<com.reservation_system.model.User> userList15 = userRepository1.getAllUsers();
        boolean boolean16 = userRepository1.headLabCoordinatorExists();
        org.junit.Assert.assertNotNull(userList9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(userOptional14);
        org.junit.Assert.assertNotNull(userList15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
    }

    @Test
    public void test0685() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0685");
        com.reservation_system.model.Guest guest5 = new com.reservation_system.model.Guest((-1), "student", "researcher", "alice@example.com", false);
    }

    @Test
    public void test0686() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0686");
        com.reservation_system.model.Student student5 = new com.reservation_system.model.Student((int) (byte) 0, "demo/data/test-users.csv", "demo/data/test-users.csv", "Student", false);
        java.lang.String str6 = student5.getName();
        java.lang.String str7 = student5.getUserType();
        java.lang.String str8 = student5.getName();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "demo/data/test-users.csv" + "'", str6, "demo/data/test-users.csv");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Student" + "'", str7, "Student");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "demo/data/test-users.csv" + "'", str8, "demo/data/test-users.csv");
    }

    @Test
    public void test0687() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0687");
        com.reservation_system.model.User user6 = com.reservation_system.patterns.factory.UserFactory.createUser("headlabcoordinator", (int) (byte) 0, "", "headlabcoordinator", "Password1!", false);
        java.lang.String str7 = user6.getName();
        org.junit.Assert.assertNotNull(user6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
    }

    @Test
    public void test0688() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0688");
        com.reservation_system.model.User user6 = com.reservation_system.patterns.factory.UserFactory.createUser("student", 101, "", "faculty", "Student", false);
        boolean boolean7 = user6.requiresDepartmentApproval();
        org.junit.Assert.assertNotNull(user6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test0689() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0689");
        com.reservation_system.model.LabManager labManager5 = new com.reservation_system.model.LabManager(102, "demo/data/test-users.csv", "hi!", "guest", true);
    }

    @Test
    public void test0690() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0690");
        com.reservation_system.model.Guest guest5 = new com.reservation_system.model.Guest((int) '#', "demo/data/test-users.csv", "faculty", "guest", true);
    }

    @Test
    public void test0691() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0691");
        com.reservation_system.model.Student student5 = new com.reservation_system.model.Student(1, "demo/data/test-users.csv", "alice@example.com", "guest", false);
        java.lang.String str6 = student5.getUserType();
        student5.setApproved(true);
        java.lang.String str9 = student5.getUserType();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Student" + "'", str6, "Student");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Student" + "'", str9, "Student");
    }

    @Test
    public void test0692() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0692");
        com.reservation_system.model.Researcher researcher5 = new com.reservation_system.model.Researcher((int) (short) -1, "Password1!", "hi!", "", false);
        boolean boolean6 = researcher5.isApproved();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test0693() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0693");
        com.reservation_system.model.Guest guest5 = new com.reservation_system.model.Guest(1, "labmanager", "guest", "faculty", true);
        boolean boolean6 = guest5.requiresDepartmentApproval();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test0694() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0694");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("demo/data/test-users.csv");
        com.reservation_system.model.Researcher researcher7 = new com.reservation_system.model.Researcher(5, "hi!", "labmanager", "Guest", false);
        userRepository1.addUser((com.reservation_system.model.User) researcher7);
        java.util.List<com.reservation_system.model.User> userList9 = userRepository1.getAllUsers();
        com.reservation_system.model.Guest guest15 = new com.reservation_system.model.Guest(0, "Password1!", "demo/data/test-users.csv", "researcher", false);
        boolean boolean16 = guest15.requiresDepartmentApproval();
        userRepository1.addUser((com.reservation_system.model.User) guest15);
        boolean boolean19 = userRepository1.emailExists("Alice");
        int int20 = userRepository1.getNextID();
        com.reservation_system.repository.UserRepository userRepository22 = new com.reservation_system.repository.UserRepository("demo/data/test-users.csv");
        java.util.List<com.reservation_system.model.User> userList23 = userRepository22.getAllUsers();
        userRepository1.saveAllUsers(userList23);
        java.util.Optional<com.reservation_system.model.User> userOptional26 = userRepository1.findByEmail("Password1!");
        int int27 = userRepository1.getNextID();
        com.reservation_system.model.Guest guest33 = new com.reservation_system.model.Guest((int) (byte) -1, "hi!", "", "Password1!", false);
        userRepository1.addUser((com.reservation_system.model.User) guest33);
        org.junit.Assert.assertNotNull(userList9);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 102 + "'", int20 == 102);
        org.junit.Assert.assertNotNull(userList23);
        org.junit.Assert.assertNotNull(userOptional26);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 102 + "'", int27 == 102);
    }

    @Test
    public void test0695() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0695");
        com.reservation_system.model.User user6 = com.reservation_system.patterns.factory.UserFactory.createUser("headlabcoordinator", (int) (byte) 100, "demo/data/test-users.csv", "Alice", "", false);
        org.junit.Assert.assertNotNull(user6);
    }

    @Test
    public void test0696() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0696");
        com.reservation_system.model.Guest guest5 = new com.reservation_system.model.Guest((int) (short) 0, "Guest", "demo/data/test-users.csv", "labmanager", false);
    }

    @Test
    public void test0697() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0697");
        com.reservation_system.model.Researcher researcher5 = new com.reservation_system.model.Researcher((int) 'a', "labmanager", "faculty", "", false);
        boolean boolean6 = researcher5.isApproved();
        java.lang.String str7 = researcher5.getName();
        researcher5.setApproved(true);
        java.lang.String str10 = researcher5.getUserType();
        java.lang.String str11 = researcher5.getEmail();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "labmanager" + "'", str7, "labmanager");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Researcher" + "'", str10, "Researcher");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "faculty" + "'", str11, "faculty");
    }

    @Test
    public void test0698() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0698");
        com.reservation_system.model.Guest guest5 = new com.reservation_system.model.Guest(98, "hi!", "demo/data/test-users.csv", "Guest", true);
    }

    @Test
    public void test0699() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0699");
        com.reservation_system.model.Guest guest5 = new com.reservation_system.model.Guest((int) (short) 10, "student", "labmanager", "researcher", true);
        java.lang.Class<?> wildcardClass6 = guest5.getClass();
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0700() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0700");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("demo/data/test-users.csv");
        com.reservation_system.model.Researcher researcher7 = new com.reservation_system.model.Researcher(5, "hi!", "labmanager", "Guest", false);
        userRepository1.addUser((com.reservation_system.model.User) researcher7);
        java.util.List<com.reservation_system.model.User> userList9 = userRepository1.getAllUsers();
        com.reservation_system.model.Guest guest15 = new com.reservation_system.model.Guest(0, "Password1!", "demo/data/test-users.csv", "researcher", false);
        boolean boolean16 = guest15.requiresDepartmentApproval();
        userRepository1.addUser((com.reservation_system.model.User) guest15);
        boolean boolean19 = userRepository1.emailExists("Alice");
        int int20 = userRepository1.getNextID();
        com.reservation_system.repository.UserRepository userRepository22 = new com.reservation_system.repository.UserRepository("demo/data/test-users.csv");
        boolean boolean24 = userRepository22.emailExists("Alice");
        com.reservation_system.repository.UserRepository userRepository26 = new com.reservation_system.repository.UserRepository("demo/data/test-users.csv");
        java.util.List<com.reservation_system.model.User> userList27 = userRepository26.getAllUsers();
        int int28 = userRepository26.getNextID();
        java.util.List<com.reservation_system.model.User> userList29 = userRepository26.getAllUsers();
        userRepository22.saveAllUsers(userList29);
        userRepository1.saveAllUsers(userList29);
        java.util.Optional<com.reservation_system.model.User> userOptional33 = userRepository1.findByEmail("alice@example.com");
        com.reservation_system.repository.UserRepository userRepository35 = new com.reservation_system.repository.UserRepository("demo/data/test-users.csv");
        boolean boolean37 = userRepository35.emailExists("Alice");
        com.reservation_system.repository.UserRepository userRepository39 = new com.reservation_system.repository.UserRepository("demo/data/test-users.csv");
        java.util.List<com.reservation_system.model.User> userList40 = userRepository39.getAllUsers();
        int int41 = userRepository39.getNextID();
        java.util.List<com.reservation_system.model.User> userList42 = userRepository39.getAllUsers();
        userRepository35.saveAllUsers(userList42);
        userRepository1.saveAllUsers(userList42);
        com.reservation_system.repository.UserRepository userRepository46 = new com.reservation_system.repository.UserRepository("demo/data/test-users.csv");
        int int47 = userRepository46.getNextID();
        int int48 = userRepository46.getNextID();
        com.reservation_system.model.Researcher researcher54 = new com.reservation_system.model.Researcher((int) (byte) 1, "Faculty", "", "Guest", false);
        userRepository46.addUser((com.reservation_system.model.User) researcher54);
        boolean boolean57 = userRepository46.emailExists("Password1!");
        java.util.List<com.reservation_system.model.User> userList58 = userRepository46.getAllUsers();
        userRepository1.saveAllUsers(userList58);
        org.junit.Assert.assertNotNull(userList9);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 102 + "'", int20 == 102);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(userList27);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 102 + "'", int28 == 102);
        org.junit.Assert.assertNotNull(userList29);
        org.junit.Assert.assertNotNull(userOptional33);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertNotNull(userList40);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 102 + "'", int41 == 102);
        org.junit.Assert.assertNotNull(userList42);
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + 102 + "'", int47 == 102);
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 102 + "'", int48 == 102);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + true + "'", boolean57 == true);
        org.junit.Assert.assertNotNull(userList58);
    }

    @Test
    public void test0701() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0701");
        com.reservation_system.model.LabManager labManager5 = new com.reservation_system.model.LabManager((int) (byte) 100, "Faculty", "Faculty", "student", false);
    }

    @Test
    public void test0702() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0702");
        com.reservation_system.model.LabManager labManager5 = new com.reservation_system.model.LabManager(0, "Student", "researcher", "Guest", false);
        int int6 = labManager5.getID();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test0703() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0703");
        com.reservation_system.model.Student student5 = new com.reservation_system.model.Student(52, "Faculty", "guest", "student", true);
        java.lang.String str6 = student5.getName();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Faculty" + "'", str6, "Faculty");
    }

    @Test
    public void test0704() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0704");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("demo/data/test-users.csv");
        java.util.List<com.reservation_system.model.User> userList2 = userRepository1.getAllUsers();
        boolean boolean3 = userRepository1.headLabCoordinatorExists();
        java.util.Optional<com.reservation_system.model.User> userOptional5 = userRepository1.findByEmail("guest");
        org.junit.Assert.assertNotNull(userList2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(userOptional5);
    }

    @Test
    public void test0705() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0705");
        com.reservation_system.model.LabManager labManager5 = new com.reservation_system.model.LabManager(10, "Guest", "Guest", "faculty", true);
        java.lang.String str6 = labManager5.getUserType();
        java.lang.String str7 = labManager5.getUserType();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "labmanager" + "'", str6, "labmanager");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "labmanager" + "'", str7, "labmanager");
    }

    @Test
    public void test0706() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0706");
        com.reservation_system.model.Student student5 = new com.reservation_system.model.Student(0, "Guest", "labmanager", "alice@example.com", true);
        boolean boolean6 = student5.requiresDepartmentApproval();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test0707() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0707");
        com.reservation_system.model.Guest guest5 = new com.reservation_system.model.Guest((int) (byte) -1, "hi!", "", "Password1!", false);
        boolean boolean6 = guest5.isApproved();
        java.lang.String str7 = guest5.getUserType();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Guest" + "'", str7, "Guest");
    }

    @Test
    public void test0708() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0708");
        com.reservation_system.model.User user6 = com.reservation_system.patterns.factory.UserFactory.createUser("Guest", (int) (byte) -1, "labmanager", "guest", "guest", true);
        org.junit.Assert.assertNotNull(user6);
    }

    @Test
    public void test0709() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0709");
        com.reservation_system.model.Researcher researcher5 = new com.reservation_system.model.Researcher(0, "student", "faculty", "faculty", true);
    }

    @Test
    public void test0710() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0710");
        com.reservation_system.model.Student student5 = new com.reservation_system.model.Student(0, "Guest", "Password1!", "demo/data/test-users.csv", true);
        java.lang.String str6 = student5.getEmail();
        boolean boolean7 = student5.isApproved();
        java.lang.String str8 = student5.getUserType();
        java.lang.Class<?> wildcardClass9 = student5.getClass();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Password1!" + "'", str6, "Password1!");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Student" + "'", str8, "Student");
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0711() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0711");
        com.reservation_system.model.LabManager labManager5 = new com.reservation_system.model.LabManager(10, "Password1!", "demo/data/test-users.csv", "Guest", true);
        java.lang.String str6 = labManager5.getUserType();
        java.lang.String str7 = labManager5.getPassword();
        java.lang.Class<?> wildcardClass8 = labManager5.getClass();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "labmanager" + "'", str6, "labmanager");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Guest" + "'", str7, "Guest");
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0712() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0712");
        com.reservation_system.model.Researcher researcher5 = new com.reservation_system.model.Researcher(10, "Faculty", "Guest", "", false);
    }

    @Test
    public void test0713() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0713");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("demo/data/test-users.csv");
        com.reservation_system.model.Researcher researcher7 = new com.reservation_system.model.Researcher(5, "hi!", "labmanager", "Guest", false);
        userRepository1.addUser((com.reservation_system.model.User) researcher7);
        java.util.List<com.reservation_system.model.User> userList9 = userRepository1.getAllUsers();
        boolean boolean10 = userRepository1.headLabCoordinatorExists();
        boolean boolean12 = userRepository1.emailExists("researcher");
        org.junit.Assert.assertNotNull(userList9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
// flaky "19) test0713(com.reservation_system.randoop.userrepository.RegressionTest1)":         org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test0714() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0714");
        com.reservation_system.model.Student student5 = new com.reservation_system.model.Student((-1), "headlabcoordinator", "faculty", "Guest", false);
        java.lang.String str6 = student5.getUserType();
        java.lang.String str7 = student5.getUserType();
        java.lang.String str8 = student5.getUserType();
        java.lang.String str9 = student5.getUserType();
        java.lang.String str10 = student5.getUserType();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Student" + "'", str6, "Student");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Student" + "'", str7, "Student");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Student" + "'", str8, "Student");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Student" + "'", str9, "Student");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Student" + "'", str10, "Student");
    }

    @Test
    public void test0715() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0715");
        com.reservation_system.model.Student student5 = new com.reservation_system.model.Student((int) '#', "Faculty", "headlabcoordinator", "student", true);
    }

    @Test
    public void test0716() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0716");
        com.reservation_system.model.Guest guest5 = new com.reservation_system.model.Guest(97, "hi!", "Student", "Researcher", true);
    }

    @Test
    public void test0717() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0717");
        com.reservation_system.model.Researcher researcher5 = new com.reservation_system.model.Researcher((int) (short) 0, "guest", "Guest", "Student", true);
    }

    @Test
    public void test0718() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0718");
        com.reservation_system.model.Researcher researcher5 = new com.reservation_system.model.Researcher(0, "", "Password1!", "researcher", false);
        boolean boolean6 = researcher5.isApproved();
        researcher5.setApproved(false);
        java.lang.String str9 = researcher5.getUserType();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Researcher" + "'", str9, "Researcher");
    }

    @Test
    public void test0719() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0719");
        com.reservation_system.model.HeadLabCoordinator headLabCoordinator5 = new com.reservation_system.model.HeadLabCoordinator((int) (byte) -1, "guest", "student", "", false);
    }

    @Test
    public void test0720() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0720");
        com.reservation_system.model.Faculty faculty5 = new com.reservation_system.model.Faculty((-1), "Faculty", "Researcher", "alice@example.com", false);
        java.lang.String str6 = faculty5.getUserType();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Faculty" + "'", str6, "Faculty");
    }

    @Test
    public void test0721() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0721");
        com.reservation_system.model.Student student5 = new com.reservation_system.model.Student((int) (short) 10, "Student", "alice@example.com", "hi!", false);
    }

    @Test
    public void test0722() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0722");
        com.reservation_system.model.User user6 = com.reservation_system.patterns.factory.UserFactory.createUser("Guest", (int) (short) 10, "Password1!", "demo/data/test-users.csv", "researcher", false);
        java.lang.String str7 = user6.getEmail();
        org.junit.Assert.assertNotNull(user6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "demo/data/test-users.csv" + "'", str7, "demo/data/test-users.csv");
    }

    @Test
    public void test0723() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0723");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("demo/data/test-users.csv");
        java.util.List<com.reservation_system.model.User> userList2 = userRepository1.getAllUsers();
        int int3 = userRepository1.getNextID();
        boolean boolean5 = userRepository1.emailExists("headlabcoordinator");
        boolean boolean7 = userRepository1.emailExists("Faculty");
        boolean boolean9 = userRepository1.emailExists("");
        com.reservation_system.model.LabManager labManager15 = new com.reservation_system.model.LabManager(101, "Faculty", "alice@example.com", "alice@example.com", true);
        userRepository1.addUser((com.reservation_system.model.User) labManager15);
        java.lang.String str17 = labManager15.getName();
        org.junit.Assert.assertNotNull(userList2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 102 + "'", int3 == 102);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "Faculty" + "'", str17, "Faculty");
    }

    @Test
    public void test0724() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0724");
        com.reservation_system.model.Student student5 = new com.reservation_system.model.Student((int) 'a', "Faculty", "Faculty", "alice@example.com", true);
        boolean boolean6 = student5.requiresDepartmentApproval();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test0725() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0725");
        com.reservation_system.model.Faculty faculty5 = new com.reservation_system.model.Faculty((int) '#', "researcher", "labmanager", "", false);
        faculty5.setApproved(true);
        java.lang.String str8 = faculty5.getUserType();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Faculty" + "'", str8, "Faculty");
    }

    @Test
    public void test0726() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0726");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("demo/data/test-users.csv");
        boolean boolean3 = userRepository1.emailExists("Alice");
        com.reservation_system.model.Researcher researcher9 = new com.reservation_system.model.Researcher((int) 'a', "labmanager", "faculty", "", false);
        boolean boolean10 = researcher9.isApproved();
        java.lang.String str11 = researcher9.getName();
        userRepository1.addUser((com.reservation_system.model.User) researcher9);
        boolean boolean13 = userRepository1.headLabCoordinatorExists();
        java.util.List<com.reservation_system.model.User> userList14 = userRepository1.getAllUsers();
        java.lang.Class<?> wildcardClass15 = userList14.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "labmanager" + "'", str11, "labmanager");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(userList14);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0727() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0727");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("demo/data/test-users.csv");
        boolean boolean3 = userRepository1.emailExists("Alice");
        int int4 = userRepository1.getNextID();
        boolean boolean5 = userRepository1.headLabCoordinatorExists();
        boolean boolean6 = userRepository1.headLabCoordinatorExists();
        boolean boolean8 = userRepository1.emailExists("Researcher");
        boolean boolean10 = userRepository1.emailExists("headlabcoordinator");
        com.reservation_system.repository.UserRepository userRepository12 = new com.reservation_system.repository.UserRepository("demo/data/test-users.csv");
        com.reservation_system.model.Researcher researcher18 = new com.reservation_system.model.Researcher(5, "hi!", "labmanager", "Guest", false);
        userRepository12.addUser((com.reservation_system.model.User) researcher18);
        java.util.List<com.reservation_system.model.User> userList20 = userRepository12.getAllUsers();
        boolean boolean21 = userRepository12.headLabCoordinatorExists();
        boolean boolean23 = userRepository12.emailExists("guest");
        com.reservation_system.repository.UserRepository userRepository25 = new com.reservation_system.repository.UserRepository("demo/data/test-users.csv");
        boolean boolean27 = userRepository25.emailExists("Alice");
        com.reservation_system.repository.UserRepository userRepository29 = new com.reservation_system.repository.UserRepository("demo/data/test-users.csv");
        java.util.List<com.reservation_system.model.User> userList30 = userRepository29.getAllUsers();
        int int31 = userRepository29.getNextID();
        java.util.List<com.reservation_system.model.User> userList32 = userRepository29.getAllUsers();
        userRepository25.saveAllUsers(userList32);
        userRepository12.saveAllUsers(userList32);
        java.util.List<com.reservation_system.model.User> userList35 = userRepository12.getAllUsers();
        userRepository1.saveAllUsers(userList35);
        int int37 = userRepository1.getNextID();
        java.util.Optional<com.reservation_system.model.User> userOptional39 = userRepository1.findByEmail("labmanager");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 102 + "'", int4 == 102);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
// flaky "20) test0727(com.reservation_system.randoop.userrepository.RegressionTest1)":         org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(userList20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(userList30);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 102 + "'", int31 == 102);
        org.junit.Assert.assertNotNull(userList32);
        org.junit.Assert.assertNotNull(userList35);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 102 + "'", int37 == 102);
        org.junit.Assert.assertNotNull(userOptional39);
    }

    @Test
    public void test0728() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0728");
        com.reservation_system.model.LabManager labManager5 = new com.reservation_system.model.LabManager((int) (short) 100, "labmanager", "labmanager", "faculty", false);
    }

    @Test
    public void test0729() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0729");
        com.reservation_system.model.Student student5 = new com.reservation_system.model.Student(0, "Guest", "Password1!", "demo/data/test-users.csv", true);
        java.lang.String str6 = student5.getPassword();
        java.lang.String str7 = student5.getUserType();
        java.lang.String str8 = student5.getUserType();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "demo/data/test-users.csv" + "'", str6, "demo/data/test-users.csv");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Student" + "'", str7, "Student");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Student" + "'", str8, "Student");
    }

    @Test
    public void test0730() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0730");
        com.reservation_system.model.LabManager labManager5 = new com.reservation_system.model.LabManager((int) (byte) 10, "alice@example.com", "faculty", "guest", false);
    }

    @Test
    public void test0731() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0731");
        com.reservation_system.model.HeadLabCoordinator headLabCoordinator5 = new com.reservation_system.model.HeadLabCoordinator((int) ' ', "student", "Researcher", "alice@example.com", true);
        java.lang.String str6 = headLabCoordinator5.getEmail();
        boolean boolean7 = headLabCoordinator5.isApproved();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Researcher" + "'", str6, "Researcher");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test0732() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0732");
        com.reservation_system.model.HeadLabCoordinator headLabCoordinator5 = new com.reservation_system.model.HeadLabCoordinator((int) (byte) 10, "researcher", "hi!", "student", true);
    }

    @Test
    public void test0733() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0733");
        com.reservation_system.model.Guest guest5 = new com.reservation_system.model.Guest(0, "Password1!", "demo/data/test-users.csv", "researcher", false);
        boolean boolean6 = guest5.requiresDepartmentApproval();
        java.lang.String str7 = guest5.getUserType();
        java.lang.String str8 = guest5.getUserType();
        java.lang.String str9 = guest5.getName();
        java.lang.String str10 = guest5.getUserType();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Guest" + "'", str7, "Guest");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Guest" + "'", str8, "Guest");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Password1!" + "'", str9, "Password1!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Guest" + "'", str10, "Guest");
    }

    @Test
    public void test0734() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0734");
        com.reservation_system.model.Faculty faculty5 = new com.reservation_system.model.Faculty(10, "alice@example.com", "Student", "headlabcoordinator", false);
    }

    @Test
    public void test0735() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0735");
        com.reservation_system.model.Researcher researcher5 = new com.reservation_system.model.Researcher((int) (byte) 1, "demo/data/test-users.csv", "alice@example.com", "", false);
        java.lang.String str6 = researcher5.getUserType();
        java.lang.String str7 = researcher5.getUserType();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Researcher" + "'", str6, "Researcher");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Researcher" + "'", str7, "Researcher");
    }

    @Test
    public void test0736() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0736");
        com.reservation_system.model.Guest guest5 = new com.reservation_system.model.Guest(1, "labmanager", "guest", "faculty", true);
        boolean boolean6 = guest5.isApproved();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test0737() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0737");
        com.reservation_system.model.Guest guest5 = new com.reservation_system.model.Guest((int) (byte) 0, "demo/data/test-users.csv", "demo/data/test-users.csv", "Researcher", false);
        guest5.setApproved(false);
        boolean boolean8 = guest5.isApproved();
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test0738() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0738");
        com.reservation_system.model.Researcher researcher5 = new com.reservation_system.model.Researcher(0, "", "Password1!", "researcher", false);
        researcher5.setApproved(true);
        int int8 = researcher5.getID();
        boolean boolean9 = researcher5.isApproved();
        boolean boolean10 = researcher5.isApproved();
        int int11 = researcher5.getID();
        java.lang.String str12 = researcher5.getUserType();
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Researcher" + "'", str12, "Researcher");
    }

    @Test
    public void test0739() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0739");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("demo/data/test-users.csv");
        java.util.List<com.reservation_system.model.User> userList2 = userRepository1.getAllUsers();
        int int3 = userRepository1.getNextID();
        boolean boolean5 = userRepository1.emailExists("headlabcoordinator");
        boolean boolean6 = userRepository1.headLabCoordinatorExists();
        java.util.Optional<com.reservation_system.model.User> userOptional8 = userRepository1.findByEmail("Alice");
        boolean boolean10 = userRepository1.emailExists("Alice");
        boolean boolean12 = userRepository1.emailExists("Guest");
        boolean boolean14 = userRepository1.emailExists("headlabcoordinator");
        com.reservation_system.model.Researcher researcher20 = new com.reservation_system.model.Researcher((int) '#', "demo/data/test-users.csv", "Student", "faculty", false);
        userRepository1.addUser((com.reservation_system.model.User) researcher20);
        boolean boolean23 = userRepository1.emailExists("student");
        org.junit.Assert.assertNotNull(userList2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 102 + "'", int3 == 102);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(userOptional8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
    }

    @Test
    public void test0740() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0740");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("demo/data/test-users.csv");
        com.reservation_system.model.Researcher researcher7 = new com.reservation_system.model.Researcher(5, "hi!", "labmanager", "Guest", false);
        userRepository1.addUser((com.reservation_system.model.User) researcher7);
        java.util.List<com.reservation_system.model.User> userList9 = userRepository1.getAllUsers();
        com.reservation_system.repository.UserRepository userRepository11 = new com.reservation_system.repository.UserRepository("demo/data/test-users.csv");
        com.reservation_system.model.Researcher researcher17 = new com.reservation_system.model.Researcher(5, "hi!", "labmanager", "Guest", false);
        userRepository11.addUser((com.reservation_system.model.User) researcher17);
        java.util.List<com.reservation_system.model.User> userList19 = userRepository11.getAllUsers();
        userRepository1.saveAllUsers(userList19);
        int int21 = userRepository1.getNextID();
        org.junit.Assert.assertNotNull(userList9);
        org.junit.Assert.assertNotNull(userList19);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 102 + "'", int21 == 102);
    }

    @Test
    public void test0741() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0741");
        com.reservation_system.model.LabManager labManager5 = new com.reservation_system.model.LabManager((int) (short) 0, "", "Guest", "Student", true);
        int int6 = labManager5.getID();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test0742() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0742");
        com.reservation_system.model.HeadLabCoordinator headLabCoordinator5 = new com.reservation_system.model.HeadLabCoordinator((int) (byte) 10, "Alice", "guest", "alice@example.com", true);
        java.lang.String str6 = headLabCoordinator5.getUserType();
        java.lang.String str7 = headLabCoordinator5.getUserType();
        java.lang.String str8 = headLabCoordinator5.getUserType();
        boolean boolean9 = headLabCoordinator5.isApproved();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "headlabcoordinator" + "'", str6, "headlabcoordinator");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "headlabcoordinator" + "'", str7, "headlabcoordinator");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "headlabcoordinator" + "'", str8, "headlabcoordinator");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test0743() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0743");
        com.reservation_system.model.Student student5 = new com.reservation_system.model.Student(1, "demo/data/test-users.csv", "alice@example.com", "guest", false);
        java.lang.String str6 = student5.getUserType();
        java.lang.String str7 = student5.getUserType();
        java.lang.String str8 = student5.getName();
        boolean boolean9 = student5.requiresDepartmentApproval();
        java.lang.String str10 = student5.getUserType();
        java.lang.String str11 = student5.getName();
        int int12 = student5.getID();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Student" + "'", str6, "Student");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Student" + "'", str7, "Student");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "demo/data/test-users.csv" + "'", str8, "demo/data/test-users.csv");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Student" + "'", str10, "Student");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "demo/data/test-users.csv" + "'", str11, "demo/data/test-users.csv");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
    }

    @Test
    public void test0744() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0744");
        com.reservation_system.model.Faculty faculty5 = new com.reservation_system.model.Faculty(5, "Faculty", "faculty", "labmanager", false);
        java.lang.String str6 = faculty5.getUserType();
        java.lang.String str7 = faculty5.getName();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Faculty" + "'", str6, "Faculty");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Faculty" + "'", str7, "Faculty");
    }

    @Test
    public void test0745() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0745");
        com.reservation_system.model.HeadLabCoordinator headLabCoordinator5 = new com.reservation_system.model.HeadLabCoordinator((int) (byte) -1, "Faculty", "Guest", "faculty", false);
        java.lang.String str6 = headLabCoordinator5.getUserType();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "headlabcoordinator" + "'", str6, "headlabcoordinator");
    }

    @Test
    public void test0746() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0746");
        com.reservation_system.model.Student student5 = new com.reservation_system.model.Student((int) (short) 10, "Password1!", "Alice", "Student", true);
        java.lang.String str6 = student5.getPassword();
        java.lang.String str7 = student5.getEmail();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Student" + "'", str6, "Student");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Alice" + "'", str7, "Alice");
    }

    @Test
    public void test0747() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0747");
        com.reservation_system.model.LabManager labManager5 = new com.reservation_system.model.LabManager((int) '#', "demo/data/test-users.csv", "student", "faculty", false);
    }

    @Test
    public void test0748() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0748");
        com.reservation_system.model.HeadLabCoordinator headLabCoordinator5 = new com.reservation_system.model.HeadLabCoordinator((int) (short) -1, "demo/data/test-users.csv", "guest", "labmanager", true);
        java.lang.String str6 = headLabCoordinator5.getUserType();
        java.lang.String str7 = headLabCoordinator5.getUserType();
        java.lang.String str8 = headLabCoordinator5.getEmail();
        java.lang.String str9 = headLabCoordinator5.getUserType();
        java.lang.String str10 = headLabCoordinator5.getUserType();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "headlabcoordinator" + "'", str6, "headlabcoordinator");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "headlabcoordinator" + "'", str7, "headlabcoordinator");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "guest" + "'", str8, "guest");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "headlabcoordinator" + "'", str9, "headlabcoordinator");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "headlabcoordinator" + "'", str10, "headlabcoordinator");
    }

    @Test
    public void test0749() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0749");
        com.reservation_system.model.LabManager labManager5 = new com.reservation_system.model.LabManager((int) '#', "researcher", "Guest", "headlabcoordinator", true);
        boolean boolean6 = labManager5.isApproved();
        java.lang.String str7 = labManager5.getUserType();
        java.lang.String str8 = labManager5.getUserType();
        java.lang.String str9 = labManager5.getUserType();
        java.lang.String str10 = labManager5.getUserType();
        java.lang.String str11 = labManager5.getUserType();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "labmanager" + "'", str7, "labmanager");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "labmanager" + "'", str8, "labmanager");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "labmanager" + "'", str9, "labmanager");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "labmanager" + "'", str10, "labmanager");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "labmanager" + "'", str11, "labmanager");
    }

    @Test
    public void test0750() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0750");
        com.reservation_system.model.User user6 = com.reservation_system.patterns.factory.UserFactory.createUser("Guest", (int) (byte) 100, "Alice", "guest", "student", false);
        org.junit.Assert.assertNotNull(user6);
    }

    @Test
    public void test0751() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0751");
        com.reservation_system.model.HeadLabCoordinator headLabCoordinator5 = new com.reservation_system.model.HeadLabCoordinator((int) (byte) -1, "demo/data/test-users.csv", "alice@example.com", "student", true);
        boolean boolean6 = headLabCoordinator5.requiresDepartmentApproval();
        java.lang.String str7 = headLabCoordinator5.getUserType();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "headlabcoordinator" + "'", str7, "headlabcoordinator");
    }

    @Test
    public void test0752() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0752");
        com.reservation_system.model.Student student5 = new com.reservation_system.model.Student(100, "demo/data/test-users.csv", "guest", "faculty", true);
        java.lang.String str6 = student5.getUserType();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Student" + "'", str6, "Student");
    }

    @Test
    public void test0753() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0753");
        com.reservation_system.model.Researcher researcher5 = new com.reservation_system.model.Researcher((int) (short) 10, "Researcher", "", "demo/data/test-users.csv", true);
        java.lang.String str6 = researcher5.getEmail();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
    }

    @Test
    public void test0754() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0754");
        com.reservation_system.model.Guest guest5 = new com.reservation_system.model.Guest((int) (byte) 10, "labmanager", "student", "Faculty", false);
        int int6 = guest5.getID();
        java.lang.String str7 = guest5.getUserType();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Guest" + "'", str7, "Guest");
    }

    @Test
    public void test0755() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0755");
        com.reservation_system.model.HeadLabCoordinator headLabCoordinator5 = new com.reservation_system.model.HeadLabCoordinator((-1), "hi!", "Alice", "guest", true);
        headLabCoordinator5.setApproved(true);
    }

    @Test
    public void test0756() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0756");
        com.reservation_system.model.Researcher researcher5 = new com.reservation_system.model.Researcher(0, "", "Password1!", "researcher", false);
        boolean boolean6 = researcher5.isApproved();
        java.lang.String str7 = researcher5.getPassword();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "researcher" + "'", str7, "researcher");
    }

    @Test
    public void test0757() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0757");
        com.reservation_system.model.Student student5 = new com.reservation_system.model.Student(1, "demo/data/test-users.csv", "alice@example.com", "guest", false);
        java.lang.String str6 = student5.getUserType();
        java.lang.String str7 = student5.getUserType();
        java.lang.String str8 = student5.getName();
        java.lang.String str9 = student5.getPassword();
        java.lang.String str10 = student5.getUserType();
        int int11 = student5.getID();
        java.lang.String str12 = student5.getUserType();
        java.lang.String str13 = student5.getUserType();
        boolean boolean14 = student5.requiresDepartmentApproval();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Student" + "'", str6, "Student");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Student" + "'", str7, "Student");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "demo/data/test-users.csv" + "'", str8, "demo/data/test-users.csv");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "guest" + "'", str9, "guest");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Student" + "'", str10, "Student");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Student" + "'", str12, "Student");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Student" + "'", str13, "Student");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test0758() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0758");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("demo/data/test-users.csv");
        com.reservation_system.model.Researcher researcher7 = new com.reservation_system.model.Researcher(5, "hi!", "labmanager", "Guest", false);
        userRepository1.addUser((com.reservation_system.model.User) researcher7);
        int int9 = userRepository1.getNextID();
        java.util.Optional<com.reservation_system.model.User> userOptional11 = userRepository1.findByEmail("headlabcoordinator");
        int int12 = userRepository1.getNextID();
        java.util.Optional<com.reservation_system.model.User> userOptional14 = userRepository1.findByEmail("Faculty");
        com.reservation_system.repository.UserRepository userRepository16 = new com.reservation_system.repository.UserRepository("demo/data/test-users.csv");
        java.util.List<com.reservation_system.model.User> userList17 = userRepository16.getAllUsers();
        userRepository1.saveAllUsers(userList17);
        boolean boolean20 = userRepository1.emailExists("Faculty");
        boolean boolean21 = userRepository1.headLabCoordinatorExists();
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 102 + "'", int9 == 102);
        org.junit.Assert.assertNotNull(userOptional11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 102 + "'", int12 == 102);
        org.junit.Assert.assertNotNull(userOptional14);
        org.junit.Assert.assertNotNull(userList17);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
    }

    @Test
    public void test0759() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0759");
        com.reservation_system.model.Student student5 = new com.reservation_system.model.Student(52, "alice@example.com", "", "", false);
        java.lang.String str6 = student5.getPassword();
        java.lang.String str7 = student5.getPassword();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
    }

    @Test
    public void test0760() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0760");
        com.reservation_system.model.Faculty faculty5 = new com.reservation_system.model.Faculty(5, "researcher", "guest", "faculty", true);
        java.lang.String str6 = faculty5.getUserType();
        java.lang.String str7 = faculty5.getEmail();
        java.lang.String str8 = faculty5.getUserType();
        java.lang.String str9 = faculty5.getUserType();
        java.lang.String str10 = faculty5.getUserType();
        faculty5.setApproved(true);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Faculty" + "'", str6, "Faculty");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "guest" + "'", str7, "guest");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Faculty" + "'", str8, "Faculty");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Faculty" + "'", str9, "Faculty");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Faculty" + "'", str10, "Faculty");
    }

    @Test
    public void test0761() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0761");
        com.reservation_system.model.Student student5 = new com.reservation_system.model.Student(102, "Faculty", "Password1!", "demo/data/test-users.csv", false);
    }

    @Test
    public void test0762() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0762");
        com.reservation_system.model.Faculty faculty5 = new com.reservation_system.model.Faculty(5, "researcher", "guest", "faculty", true);
        java.lang.String str6 = faculty5.getUserType();
        java.lang.String str7 = faculty5.getEmail();
        java.lang.String str8 = faculty5.getUserType();
        java.lang.String str9 = faculty5.getUserType();
        boolean boolean10 = faculty5.isApproved();
        java.lang.String str11 = faculty5.getUserType();
        java.lang.String str12 = faculty5.getName();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Faculty" + "'", str6, "Faculty");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "guest" + "'", str7, "guest");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Faculty" + "'", str8, "Faculty");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Faculty" + "'", str9, "Faculty");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Faculty" + "'", str11, "Faculty");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "researcher" + "'", str12, "researcher");
    }

    @Test
    public void test0763() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0763");
        com.reservation_system.model.Guest guest5 = new com.reservation_system.model.Guest(101, "alice@example.com", "labmanager", "Faculty", false);
    }

    @Test
    public void test0764() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0764");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("demo/data/test-users.csv");
        com.reservation_system.model.Researcher researcher7 = new com.reservation_system.model.Researcher(5, "hi!", "labmanager", "Guest", false);
        userRepository1.addUser((com.reservation_system.model.User) researcher7);
        java.util.List<com.reservation_system.model.User> userList9 = userRepository1.getAllUsers();
        com.reservation_system.repository.UserRepository userRepository11 = new com.reservation_system.repository.UserRepository("demo/data/test-users.csv");
        com.reservation_system.model.Researcher researcher17 = new com.reservation_system.model.Researcher(5, "hi!", "labmanager", "Guest", false);
        userRepository11.addUser((com.reservation_system.model.User) researcher17);
        java.util.Optional<com.reservation_system.model.User> userOptional20 = userRepository11.findByEmail("alice@example.com");
        java.util.List<com.reservation_system.model.User> userList21 = userRepository11.getAllUsers();
        userRepository1.saveAllUsers(userList21);
        boolean boolean23 = userRepository1.headLabCoordinatorExists();
        int int24 = userRepository1.getNextID();
        java.util.Optional<com.reservation_system.model.User> userOptional26 = userRepository1.findByEmail("Faculty");
        java.lang.Class<?> wildcardClass27 = userOptional26.getClass();
        org.junit.Assert.assertNotNull(userList9);
        org.junit.Assert.assertNotNull(userOptional20);
        org.junit.Assert.assertNotNull(userList21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 102 + "'", int24 == 102);
        org.junit.Assert.assertNotNull(userOptional26);
        org.junit.Assert.assertNotNull(wildcardClass27);
    }

    @Test
    public void test0765() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0765");
        com.reservation_system.model.HeadLabCoordinator headLabCoordinator5 = new com.reservation_system.model.HeadLabCoordinator(10, "labmanager", "labmanager", "labmanager", true);
        boolean boolean6 = headLabCoordinator5.requiresDepartmentApproval();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test0766() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0766");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("demo/data/test-users.csv");
        java.util.List<com.reservation_system.model.User> userList2 = userRepository1.getAllUsers();
        int int3 = userRepository1.getNextID();
        boolean boolean5 = userRepository1.emailExists("headlabcoordinator");
        boolean boolean6 = userRepository1.headLabCoordinatorExists();
        int int7 = userRepository1.getNextID();
        boolean boolean9 = userRepository1.emailExists("Researcher");
        boolean boolean10 = userRepository1.headLabCoordinatorExists();
        com.reservation_system.model.Student student16 = new com.reservation_system.model.Student((int) (short) -1, "alice@example.com", "student", "student", true);
        boolean boolean17 = student16.isApproved();
        userRepository1.addUser((com.reservation_system.model.User) student16);
        java.lang.String str19 = student16.getUserType();
        org.junit.Assert.assertNotNull(userList2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 102 + "'", int3 == 102);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 102 + "'", int7 == 102);
// flaky "21) test0766(com.reservation_system.randoop.userrepository.RegressionTest1)":         org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "Student" + "'", str19, "Student");
    }

    @Test
    public void test0767() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0767");
        com.reservation_system.model.User user6 = com.reservation_system.patterns.factory.UserFactory.createUser("labmanager", (int) '4', "Faculty", "Password1!", "Password1!", false);
        org.junit.Assert.assertNotNull(user6);
    }

    @Test
    public void test0768() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0768");
        com.reservation_system.model.HeadLabCoordinator headLabCoordinator5 = new com.reservation_system.model.HeadLabCoordinator((int) (short) 100, "alice@example.com", "Guest", "labmanager", true);
        boolean boolean6 = headLabCoordinator5.isApproved();
        java.lang.String str7 = headLabCoordinator5.getUserType();
        java.lang.String str8 = headLabCoordinator5.getUserType();
        java.lang.String str9 = headLabCoordinator5.getUserType();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "headlabcoordinator" + "'", str7, "headlabcoordinator");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "headlabcoordinator" + "'", str8, "headlabcoordinator");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "headlabcoordinator" + "'", str9, "headlabcoordinator");
    }

    @Test
    public void test0769() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0769");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("demo/data/test-users.csv");
        com.reservation_system.model.Researcher researcher7 = new com.reservation_system.model.Researcher(5, "hi!", "labmanager", "Guest", false);
        userRepository1.addUser((com.reservation_system.model.User) researcher7);
        int int9 = userRepository1.getNextID();
        java.util.Optional<com.reservation_system.model.User> userOptional11 = userRepository1.findByEmail("headlabcoordinator");
        int int12 = userRepository1.getNextID();
        java.util.Optional<com.reservation_system.model.User> userOptional14 = userRepository1.findByEmail("Faculty");
        java.util.List<com.reservation_system.model.User> userList15 = userRepository1.getAllUsers();
        boolean boolean16 = userRepository1.headLabCoordinatorExists();
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 102 + "'", int9 == 102);
        org.junit.Assert.assertNotNull(userOptional11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 102 + "'", int12 == 102);
        org.junit.Assert.assertNotNull(userOptional14);
        org.junit.Assert.assertNotNull(userList15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
    }

    @Test
    public void test0770() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0770");
        com.reservation_system.model.HeadLabCoordinator headLabCoordinator5 = new com.reservation_system.model.HeadLabCoordinator((int) (byte) 10, "", "Alice", "guest", true);
        java.lang.String str6 = headLabCoordinator5.getUserType();
        java.lang.String str7 = headLabCoordinator5.getUserType();
        boolean boolean8 = headLabCoordinator5.requiresDepartmentApproval();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "headlabcoordinator" + "'", str6, "headlabcoordinator");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "headlabcoordinator" + "'", str7, "headlabcoordinator");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test0771() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0771");
        com.reservation_system.model.Student student5 = new com.reservation_system.model.Student((int) (byte) -1, "Guest", "Alice", "Guest", true);
        java.lang.String str6 = student5.getUserType();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Student" + "'", str6, "Student");
    }

    @Test
    public void test0772() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0772");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("demo/data/test-users.csv");
        boolean boolean3 = userRepository1.emailExists("Password1!");
        boolean boolean5 = userRepository1.emailExists("hi!");
        java.util.List<com.reservation_system.model.User> userList6 = userRepository1.getAllUsers();
        boolean boolean8 = userRepository1.emailExists("Guest");
        com.reservation_system.model.LabManager labManager14 = new com.reservation_system.model.LabManager((int) (byte) -1, "headlabcoordinator", "demo/data/test-users.csv", "headlabcoordinator", false);
        userRepository1.addUser((com.reservation_system.model.User) labManager14);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
// flaky "22) test0772(com.reservation_system.randoop.userrepository.RegressionTest1)":         org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(userList6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test0773() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0773");
        com.reservation_system.model.LabManager labManager5 = new com.reservation_system.model.LabManager((int) (byte) -1, "headlabcoordinator", "demo/data/test-users.csv", "headlabcoordinator", false);
        java.lang.String str6 = labManager5.getName();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "headlabcoordinator" + "'", str6, "headlabcoordinator");
    }

    @Test
    public void test0774() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0774");
        com.reservation_system.model.Student student5 = new com.reservation_system.model.Student((int) (short) 1, "", "", "labmanager", true);
        boolean boolean6 = student5.isApproved();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test0775() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0775");
        com.reservation_system.model.Researcher researcher5 = new com.reservation_system.model.Researcher(5, "headlabcoordinator", "Faculty", "Password1!", false);
    }

    @Test
    public void test0776() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0776");
        com.reservation_system.model.Student student5 = new com.reservation_system.model.Student((int) (byte) 10, "alice@example.com", "researcher", "alice@example.com", false);
    }

    @Test
    public void test0777() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0777");
        com.reservation_system.model.Student student5 = new com.reservation_system.model.Student(0, "Guest", "Password1!", "demo/data/test-users.csv", true);
        java.lang.String str6 = student5.getPassword();
        int int7 = student5.getID();
        java.lang.String str8 = student5.getEmail();
        student5.setApproved(true);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "demo/data/test-users.csv" + "'", str6, "demo/data/test-users.csv");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Password1!" + "'", str8, "Password1!");
    }

    @Test
    public void test0778() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0778");
        com.reservation_system.model.Guest guest5 = new com.reservation_system.model.Guest((int) (byte) 0, "Password1!", "", "faculty", true);
    }

    @Test
    public void test0779() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0779");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("demo/data/test-users.csv");
        com.reservation_system.model.Researcher researcher7 = new com.reservation_system.model.Researcher(5, "hi!", "labmanager", "Guest", false);
        userRepository1.addUser((com.reservation_system.model.User) researcher7);
        int int9 = userRepository1.getNextID();
        boolean boolean11 = userRepository1.emailExists("Researcher");
        boolean boolean12 = userRepository1.headLabCoordinatorExists();
        com.reservation_system.model.Faculty faculty18 = new com.reservation_system.model.Faculty(10, "", "alice@example.com", "Password1!", false);
        java.lang.String str19 = faculty18.getUserType();
        java.lang.String str20 = faculty18.getUserType();
        userRepository1.addUser((com.reservation_system.model.User) faculty18);
        com.reservation_system.model.Student student27 = new com.reservation_system.model.Student((int) (short) -1, "hi!", "guest", "Guest", true);
        student27.setApproved(true);
        userRepository1.addUser((com.reservation_system.model.User) student27);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 102 + "'", int9 == 102);
// flaky "23) test0779(com.reservation_system.randoop.userrepository.RegressionTest1)":         org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "Faculty" + "'", str19, "Faculty");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "Faculty" + "'", str20, "Faculty");
    }

    @Test
    public void test0780() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0780");
        com.reservation_system.model.Guest guest5 = new com.reservation_system.model.Guest((int) (byte) -1, "Alice", "Guest", "guest", false);
    }

    @Test
    public void test0781() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0781");
        com.reservation_system.model.Researcher researcher5 = new com.reservation_system.model.Researcher((int) (short) 100, "Guest", "Student", "labmanager", false);
        java.lang.Class<?> wildcardClass6 = researcher5.getClass();
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0782() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0782");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("demo/data/test-users.csv");
        com.reservation_system.model.Researcher researcher7 = new com.reservation_system.model.Researcher(5, "hi!", "labmanager", "Guest", false);
        userRepository1.addUser((com.reservation_system.model.User) researcher7);
        int int9 = userRepository1.getNextID();
        java.util.List<com.reservation_system.model.User> userList10 = userRepository1.getAllUsers();
        com.reservation_system.model.Student student16 = new com.reservation_system.model.Student(98, "Password1!", "Password1!", "student", false);
        java.lang.String str17 = student16.getUserType();
        java.lang.String str18 = student16.getEmail();
        boolean boolean19 = student16.requiresDepartmentApproval();
        userRepository1.addUser((com.reservation_system.model.User) student16);
        java.util.List<com.reservation_system.model.User> userList21 = userRepository1.getAllUsers();
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 102 + "'", int9 == 102);
        org.junit.Assert.assertNotNull(userList10);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "Student" + "'", str17, "Student");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Password1!" + "'", str18, "Password1!");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNotNull(userList21);
    }

    @Test
    public void test0783() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0783");
        com.reservation_system.model.LabManager labManager5 = new com.reservation_system.model.LabManager((int) (short) -1, "labmanager", "hi!", "", false);
        labManager5.setApproved(true);
    }

    @Test
    public void test0784() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0784");
        com.reservation_system.model.Student student5 = new com.reservation_system.model.Student(1, "demo/data/test-users.csv", "alice@example.com", "guest", false);
        java.lang.String str6 = student5.getUserType();
        java.lang.String str7 = student5.getUserType();
        java.lang.String str8 = student5.getName();
        java.lang.String str9 = student5.getPassword();
        java.lang.String str10 = student5.getUserType();
        int int11 = student5.getID();
        java.lang.String str12 = student5.getUserType();
        boolean boolean13 = student5.requiresDepartmentApproval();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Student" + "'", str6, "Student");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Student" + "'", str7, "Student");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "demo/data/test-users.csv" + "'", str8, "demo/data/test-users.csv");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "guest" + "'", str9, "guest");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Student" + "'", str10, "Student");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Student" + "'", str12, "Student");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test0785() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0785");
        com.reservation_system.model.Guest guest5 = new com.reservation_system.model.Guest((int) (byte) 1, "Guest", "labmanager", "Password1!", false);
    }

    @Test
    public void test0786() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0786");
        com.reservation_system.model.Researcher researcher5 = new com.reservation_system.model.Researcher((int) (short) -1, "labmanager", "faculty", "headlabcoordinator", true);
        java.lang.String str6 = researcher5.getName();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "labmanager" + "'", str6, "labmanager");
    }

    @Test
    public void test0787() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0787");
        com.reservation_system.model.HeadLabCoordinator headLabCoordinator5 = new com.reservation_system.model.HeadLabCoordinator(5, "Faculty", "", "Alice", false);
        boolean boolean6 = headLabCoordinator5.isApproved();
        java.lang.String str7 = headLabCoordinator5.getEmail();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
    }

    @Test
    public void test0788() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0788");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("demo/data/test-users.csv");
        int int2 = userRepository1.getNextID();
        boolean boolean3 = userRepository1.headLabCoordinatorExists();
        com.reservation_system.model.Guest guest9 = new com.reservation_system.model.Guest((int) (byte) -1, "hi!", "", "Password1!", false);
        userRepository1.addUser((com.reservation_system.model.User) guest9);
        int int11 = userRepository1.getNextID();
        boolean boolean13 = userRepository1.emailExists("headlabcoordinator");
        java.util.List<com.reservation_system.model.User> userList14 = userRepository1.getAllUsers();
        com.reservation_system.model.LabManager labManager20 = new com.reservation_system.model.LabManager(10, "Password1!", "demo/data/test-users.csv", "Guest", true);
        java.lang.String str21 = labManager20.getUserType();
        java.lang.String str22 = labManager20.getPassword();
        java.lang.String str23 = labManager20.getEmail();
        userRepository1.addUser((com.reservation_system.model.User) labManager20);
        boolean boolean25 = labManager20.requiresDepartmentApproval();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 102 + "'", int2 == 102);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 102 + "'", int11 == 102);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(userList14);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "labmanager" + "'", str21, "labmanager");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "Guest" + "'", str22, "Guest");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "demo/data/test-users.csv" + "'", str23, "demo/data/test-users.csv");
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
    }

    @Test
    public void test0789() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0789");
        com.reservation_system.model.Faculty faculty5 = new com.reservation_system.model.Faculty((int) (short) 0, "faculty", "faculty", "Alice", false);
    }

    @Test
    public void test0790() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0790");
        com.reservation_system.model.LabManager labManager5 = new com.reservation_system.model.LabManager((int) 'a', "faculty", "Student", "Password1!", true);
    }

    @Test
    public void test0791() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0791");
        com.reservation_system.model.Researcher researcher5 = new com.reservation_system.model.Researcher((int) '4', "Guest", "Guest", "researcher", false);
    }

    @Test
    public void test0792() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0792");
        com.reservation_system.model.HeadLabCoordinator headLabCoordinator5 = new com.reservation_system.model.HeadLabCoordinator((int) (short) 0, "hi!", "Faculty", "faculty", false);
    }

    @Test
    public void test0793() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0793");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("demo/data/test-users.csv");
        int int2 = userRepository1.getNextID();
        boolean boolean3 = userRepository1.headLabCoordinatorExists();
        com.reservation_system.model.Guest guest9 = new com.reservation_system.model.Guest((int) (byte) -1, "hi!", "", "Password1!", false);
        userRepository1.addUser((com.reservation_system.model.User) guest9);
        java.util.Optional<com.reservation_system.model.User> userOptional12 = userRepository1.findByEmail("Faculty");
        java.util.List<com.reservation_system.model.User> userList13 = null;
        // The following exception was thrown during execution in test generation
        try {
            userRepository1.saveAllUsers(userList13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 102 + "'", int2 == 102);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(userOptional12);
    }

    @Test
    public void test0794() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0794");
        com.reservation_system.model.Faculty faculty5 = new com.reservation_system.model.Faculty(5, "Faculty", "faculty", "labmanager", false);
        java.lang.String str6 = faculty5.getPassword();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "labmanager" + "'", str6, "labmanager");
    }

    @Test
    public void test0795() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0795");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("demo/data/test-users.csv");
        java.util.List<com.reservation_system.model.User> userList2 = userRepository1.getAllUsers();
        int int3 = userRepository1.getNextID();
        boolean boolean5 = userRepository1.emailExists("headlabcoordinator");
        boolean boolean6 = userRepository1.headLabCoordinatorExists();
        java.util.Optional<com.reservation_system.model.User> userOptional8 = userRepository1.findByEmail("Alice");
        boolean boolean10 = userRepository1.emailExists("Alice");
        boolean boolean12 = userRepository1.emailExists("Guest");
        boolean boolean14 = userRepository1.emailExists("headlabcoordinator");
        com.reservation_system.model.Researcher researcher20 = new com.reservation_system.model.Researcher((int) '#', "demo/data/test-users.csv", "Student", "faculty", false);
        userRepository1.addUser((com.reservation_system.model.User) researcher20);
        java.util.List<com.reservation_system.model.User> userList22 = userRepository1.getAllUsers();
        org.junit.Assert.assertNotNull(userList2);
// flaky "24) test0795(com.reservation_system.randoop.userrepository.RegressionTest1)":         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 6 + "'", int3 == 6);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(userOptional8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(userList22);
    }

    @Test
    public void test0796() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0796");
        // The following exception was thrown during execution in test generation
        try {
            com.reservation_system.model.User user6 = com.reservation_system.patterns.factory.UserFactory.createUser("demo/data/test-users.csv", 98, "Faculty", "demo/data/test-users.csv", "Alice", false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid user type: demo/data/test-users.csv");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0797() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0797");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("demo/data/test-users.csv");
        java.util.List<com.reservation_system.model.User> userList2 = userRepository1.getAllUsers();
        int int3 = userRepository1.getNextID();
        int int4 = userRepository1.getNextID();
        java.util.List<com.reservation_system.model.User> userList5 = userRepository1.getAllUsers();
        com.reservation_system.repository.UserRepository userRepository7 = new com.reservation_system.repository.UserRepository("demo/data/test-users.csv");
        java.util.List<com.reservation_system.model.User> userList8 = userRepository7.getAllUsers();
        int int9 = userRepository7.getNextID();
        boolean boolean11 = userRepository7.emailExists("headlabcoordinator");
        java.util.Optional<com.reservation_system.model.User> userOptional13 = userRepository7.findByEmail("student");
        com.reservation_system.repository.UserRepository userRepository15 = new com.reservation_system.repository.UserRepository("demo/data/test-users.csv");
        java.util.List<com.reservation_system.model.User> userList16 = userRepository15.getAllUsers();
        userRepository7.saveAllUsers(userList16);
        userRepository1.saveAllUsers(userList16);
        org.junit.Assert.assertNotNull(userList2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 36 + "'", int3 == 36);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 36 + "'", int4 == 36);
        org.junit.Assert.assertNotNull(userList5);
        org.junit.Assert.assertNotNull(userList8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 36 + "'", int9 == 36);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(userOptional13);
        org.junit.Assert.assertNotNull(userList16);
    }

    @Test
    public void test0798() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0798");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("demo/data/test-users.csv");
        java.util.List<com.reservation_system.model.User> userList2 = userRepository1.getAllUsers();
        int int3 = userRepository1.getNextID();
        com.reservation_system.repository.UserRepository userRepository5 = new com.reservation_system.repository.UserRepository("demo/data/test-users.csv");
        java.util.List<com.reservation_system.model.User> userList6 = userRepository5.getAllUsers();
        int int7 = userRepository5.getNextID();
        boolean boolean9 = userRepository5.emailExists("headlabcoordinator");
        boolean boolean10 = userRepository5.headLabCoordinatorExists();
        java.util.Optional<com.reservation_system.model.User> userOptional12 = userRepository5.findByEmail("Alice");
        boolean boolean14 = userRepository5.emailExists("Alice");
        boolean boolean16 = userRepository5.emailExists("Guest");
        boolean boolean18 = userRepository5.emailExists("headlabcoordinator");
        java.util.List<com.reservation_system.model.User> userList19 = userRepository5.getAllUsers();
        userRepository1.saveAllUsers(userList19);
        boolean boolean22 = userRepository1.emailExists("Password1!");
        boolean boolean23 = userRepository1.headLabCoordinatorExists();
        java.lang.Class<?> wildcardClass24 = userRepository1.getClass();
        org.junit.Assert.assertNotNull(userList2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 36 + "'", int3 == 36);
        org.junit.Assert.assertNotNull(userList6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 36 + "'", int7 == 36);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(userOptional12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(userList19);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(wildcardClass24);
    }

    @Test
    public void test0799() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0799");
        com.reservation_system.model.Researcher researcher5 = new com.reservation_system.model.Researcher((int) (byte) 100, "Password1!", "headlabcoordinator", "Password1!", false);
    }

    @Test
    public void test0800() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0800");
        com.reservation_system.model.Faculty faculty5 = new com.reservation_system.model.Faculty((int) (byte) 100, "student", "Password1!", "Guest", false);
        java.lang.String str6 = faculty5.getName();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "student" + "'", str6, "student");
    }

    @Test
    public void test0801() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0801");
        com.reservation_system.model.LabManager labManager5 = new com.reservation_system.model.LabManager(0, "Password1!", "headlabcoordinator", "alice@example.com", false);
        java.lang.String str6 = labManager5.getUserType();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "labmanager" + "'", str6, "labmanager");
    }

    @Test
    public void test0802() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0802");
        com.reservation_system.model.Faculty faculty5 = new com.reservation_system.model.Faculty((int) (short) 10, "Password1!", "", "researcher", false);
    }

    @Test
    public void test0803() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0803");
        com.reservation_system.model.HeadLabCoordinator headLabCoordinator5 = new com.reservation_system.model.HeadLabCoordinator((int) (short) 100, "alice@example.com", "Guest", "labmanager", true);
        boolean boolean6 = headLabCoordinator5.isApproved();
        boolean boolean7 = headLabCoordinator5.isApproved();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test0804() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0804");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("demo/data/test-users.csv");
        int int2 = userRepository1.getNextID();
        int int3 = userRepository1.getNextID();
        boolean boolean5 = userRepository1.emailExists("Alice");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 36 + "'", int2 == 36);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 36 + "'", int3 == 36);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test0805() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0805");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("demo/data/test-users.csv");
        int int2 = userRepository1.getNextID();
        int int3 = userRepository1.getNextID();
        com.reservation_system.model.Researcher researcher9 = new com.reservation_system.model.Researcher((int) (byte) 1, "Faculty", "", "Guest", false);
        userRepository1.addUser((com.reservation_system.model.User) researcher9);
        boolean boolean12 = userRepository1.emailExists("Password1!");
        int int13 = userRepository1.getNextID();
        java.util.Optional<com.reservation_system.model.User> userOptional15 = userRepository1.findByEmail("alice@example.com");
// flaky "25) test0805(com.reservation_system.randoop.userrepository.RegressionTest1)":         org.junit.Assert.assertTrue("'" + int2 + "' != '" + 102 + "'", int2 == 102);
// flaky "11) test0805(com.reservation_system.randoop.userrepository.RegressionTest1)":         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 102 + "'", int3 == 102);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
// flaky "7) test0805(com.reservation_system.randoop.userrepository.RegressionTest1)":         org.junit.Assert.assertTrue("'" + int13 + "' != '" + 102 + "'", int13 == 102);
        org.junit.Assert.assertNotNull(userOptional15);
    }

    @Test
    public void test0806() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0806");
        com.reservation_system.model.Student student5 = new com.reservation_system.model.Student(5, "Password1!", "labmanager", "demo/data/test-users.csv", true);
    }

    @Test
    public void test0807() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0807");
        com.reservation_system.model.Faculty faculty5 = new com.reservation_system.model.Faculty((int) (short) 0, "hi!", "Guest", "Alice", true);
    }

    @Test
    public void test0808() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0808");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("demo/data/test-users.csv");
        int int2 = userRepository1.getNextID();
        boolean boolean3 = userRepository1.headLabCoordinatorExists();
        com.reservation_system.model.Guest guest9 = new com.reservation_system.model.Guest((int) (byte) -1, "hi!", "", "Password1!", false);
        userRepository1.addUser((com.reservation_system.model.User) guest9);
        int int11 = userRepository1.getNextID();
        boolean boolean13 = userRepository1.emailExists("headlabcoordinator");
        java.util.List<com.reservation_system.model.User> userList14 = userRepository1.getAllUsers();
        com.reservation_system.model.LabManager labManager20 = new com.reservation_system.model.LabManager(10, "Password1!", "demo/data/test-users.csv", "Guest", true);
        java.lang.String str21 = labManager20.getUserType();
        java.lang.String str22 = labManager20.getPassword();
        java.lang.String str23 = labManager20.getEmail();
        userRepository1.addUser((com.reservation_system.model.User) labManager20);
        boolean boolean25 = userRepository1.headLabCoordinatorExists();
        java.util.Optional<com.reservation_system.model.User> userOptional27 = userRepository1.findByEmail("headlabcoordinator");
// flaky "26) test0808(com.reservation_system.randoop.userrepository.RegressionTest1)":         org.junit.Assert.assertTrue("'" + int2 + "' != '" + 102 + "'", int2 == 102);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
// flaky "12) test0808(com.reservation_system.randoop.userrepository.RegressionTest1)":         org.junit.Assert.assertTrue("'" + int11 + "' != '" + 102 + "'", int11 == 102);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(userList14);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "labmanager" + "'", str21, "labmanager");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "Guest" + "'", str22, "Guest");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "demo/data/test-users.csv" + "'", str23, "demo/data/test-users.csv");
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(userOptional27);
    }

    @Test
    public void test0809() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0809");
        com.reservation_system.model.User user6 = com.reservation_system.patterns.factory.UserFactory.createUser("labmanager", 101, "hi!", "faculty", "", false);
        user6.setApproved(false);
        org.junit.Assert.assertNotNull(user6);
    }

    @Test
    public void test0810() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0810");
        com.reservation_system.model.User user6 = com.reservation_system.patterns.factory.UserFactory.createUser("Researcher", (int) (byte) 100, "Faculty", "demo/data/test-users.csv", "Password1!", false);
        org.junit.Assert.assertNotNull(user6);
    }

    @Test
    public void test0811() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0811");
        com.reservation_system.model.Student student5 = new com.reservation_system.model.Student(1, "demo/data/test-users.csv", "alice@example.com", "guest", false);
        java.lang.String str6 = student5.getUserType();
        java.lang.String str7 = student5.getUserType();
        java.lang.String str8 = student5.getName();
        boolean boolean9 = student5.requiresDepartmentApproval();
        java.lang.String str10 = student5.getName();
        java.lang.Class<?> wildcardClass11 = student5.getClass();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Student" + "'", str6, "Student");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Student" + "'", str7, "Student");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "demo/data/test-users.csv" + "'", str8, "demo/data/test-users.csv");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "demo/data/test-users.csv" + "'", str10, "demo/data/test-users.csv");
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0812() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0812");
        com.reservation_system.model.LabManager labManager5 = new com.reservation_system.model.LabManager((int) (byte) 1, "researcher", "alice@example.com", "headlabcoordinator", true);
    }

    @Test
    public void test0813() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0813");
        com.reservation_system.model.Faculty faculty5 = new com.reservation_system.model.Faculty(5, "researcher", "guest", "faculty", true);
        java.lang.String str6 = faculty5.getUserType();
        java.lang.String str7 = faculty5.getEmail();
        java.lang.String str8 = faculty5.getUserType();
        java.lang.String str9 = faculty5.getUserType();
        java.lang.String str10 = faculty5.getName();
        faculty5.setApproved(true);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Faculty" + "'", str6, "Faculty");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "guest" + "'", str7, "guest");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Faculty" + "'", str8, "Faculty");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Faculty" + "'", str9, "Faculty");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "researcher" + "'", str10, "researcher");
    }

    @Test
    public void test0814() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0814");
        com.reservation_system.model.HeadLabCoordinator headLabCoordinator5 = new com.reservation_system.model.HeadLabCoordinator((int) (short) 0, "Guest", "hi!", "guest", false);
    }

    @Test
    public void test0815() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0815");
        com.reservation_system.model.Faculty faculty5 = new com.reservation_system.model.Faculty((int) (byte) 1, "faculty", "student", "labmanager", true);
        boolean boolean6 = faculty5.isApproved();
        java.lang.String str7 = faculty5.getUserType();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Faculty" + "'", str7, "Faculty");
    }

    @Test
    public void test0816() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0816");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("demo/data/test-users.csv");
        com.reservation_system.model.Researcher researcher7 = new com.reservation_system.model.Researcher(5, "hi!", "labmanager", "Guest", false);
        userRepository1.addUser((com.reservation_system.model.User) researcher7);
        java.util.List<com.reservation_system.model.User> userList9 = userRepository1.getAllUsers();
        com.reservation_system.repository.UserRepository userRepository11 = new com.reservation_system.repository.UserRepository("demo/data/test-users.csv");
        com.reservation_system.model.Researcher researcher17 = new com.reservation_system.model.Researcher(5, "hi!", "labmanager", "Guest", false);
        userRepository11.addUser((com.reservation_system.model.User) researcher17);
        java.util.List<com.reservation_system.model.User> userList19 = userRepository11.getAllUsers();
        userRepository1.saveAllUsers(userList19);
        com.reservation_system.repository.UserRepository userRepository22 = new com.reservation_system.repository.UserRepository("demo/data/test-users.csv");
        com.reservation_system.model.Researcher researcher28 = new com.reservation_system.model.Researcher(5, "hi!", "labmanager", "Guest", false);
        userRepository22.addUser((com.reservation_system.model.User) researcher28);
        java.util.List<com.reservation_system.model.User> userList30 = userRepository22.getAllUsers();
        com.reservation_system.repository.UserRepository userRepository32 = new com.reservation_system.repository.UserRepository("demo/data/test-users.csv");
        com.reservation_system.model.Researcher researcher38 = new com.reservation_system.model.Researcher(5, "hi!", "labmanager", "Guest", false);
        userRepository32.addUser((com.reservation_system.model.User) researcher38);
        java.util.List<com.reservation_system.model.User> userList40 = userRepository32.getAllUsers();
        userRepository22.saveAllUsers(userList40);
        userRepository1.saveAllUsers(userList40);
        com.reservation_system.model.Faculty faculty48 = new com.reservation_system.model.Faculty((int) (byte) -1, "faculty", "demo/data/test-users.csv", "Student", false);
        boolean boolean49 = faculty48.isApproved();
        userRepository1.addUser((com.reservation_system.model.User) faculty48);
        java.lang.String str51 = faculty48.getUserType();
        org.junit.Assert.assertNotNull(userList9);
        org.junit.Assert.assertNotNull(userList19);
        org.junit.Assert.assertNotNull(userList30);
        org.junit.Assert.assertNotNull(userList40);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertEquals("'" + str51 + "' != '" + "Faculty" + "'", str51, "Faculty");
    }

    @Test
    public void test0817() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0817");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("demo/data/test-users.csv");
        int int2 = userRepository1.getNextID();
        boolean boolean3 = userRepository1.headLabCoordinatorExists();
        com.reservation_system.model.Guest guest9 = new com.reservation_system.model.Guest((int) (byte) -1, "hi!", "", "Password1!", false);
        userRepository1.addUser((com.reservation_system.model.User) guest9);
        int int11 = userRepository1.getNextID();
        com.reservation_system.model.Guest guest17 = new com.reservation_system.model.Guest((int) (byte) 100, "guest", "Faculty", "student", false);
        java.lang.String str18 = guest17.getPassword();
        java.lang.String str19 = guest17.getUserType();
        userRepository1.addUser((com.reservation_system.model.User) guest17);
        int int21 = userRepository1.getNextID();
// flaky "27) test0817(com.reservation_system.randoop.userrepository.RegressionTest1)":         org.junit.Assert.assertTrue("'" + int2 + "' != '" + 102 + "'", int2 == 102);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
// flaky "13) test0817(com.reservation_system.randoop.userrepository.RegressionTest1)":         org.junit.Assert.assertTrue("'" + int11 + "' != '" + 102 + "'", int11 == 102);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "student" + "'", str18, "student");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "Guest" + "'", str19, "Guest");
// flaky "8) test0817(com.reservation_system.randoop.userrepository.RegressionTest1)":         org.junit.Assert.assertTrue("'" + int21 + "' != '" + 102 + "'", int21 == 102);
    }

    @Test
    public void test0818() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0818");
        com.reservation_system.model.Faculty faculty5 = new com.reservation_system.model.Faculty((int) (byte) 10, "alice@example.com", "", "", false);
        faculty5.setApproved(false);
    }

    @Test
    public void test0819() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0819");
        com.reservation_system.model.HeadLabCoordinator headLabCoordinator5 = new com.reservation_system.model.HeadLabCoordinator(5, "Faculty", "", "Alice", false);
        boolean boolean6 = headLabCoordinator5.isApproved();
        java.lang.String str7 = headLabCoordinator5.getName();
        java.lang.Class<?> wildcardClass8 = headLabCoordinator5.getClass();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Faculty" + "'", str7, "Faculty");
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0820() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0820");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("demo/data/test-users.csv");
        int int2 = userRepository1.getNextID();
        boolean boolean3 = userRepository1.headLabCoordinatorExists();
        com.reservation_system.model.Guest guest9 = new com.reservation_system.model.Guest((int) (byte) -1, "hi!", "", "Password1!", false);
        userRepository1.addUser((com.reservation_system.model.User) guest9);
        int int11 = userRepository1.getNextID();
        java.util.Optional<com.reservation_system.model.User> userOptional13 = userRepository1.findByEmail("student");
// flaky "28) test0820(com.reservation_system.randoop.userrepository.RegressionTest1)":         org.junit.Assert.assertTrue("'" + int2 + "' != '" + 102 + "'", int2 == 102);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
// flaky "14) test0820(com.reservation_system.randoop.userrepository.RegressionTest1)":         org.junit.Assert.assertTrue("'" + int11 + "' != '" + 102 + "'", int11 == 102);
        org.junit.Assert.assertNotNull(userOptional13);
    }

    @Test
    public void test0821() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0821");
        com.reservation_system.model.Student student5 = new com.reservation_system.model.Student(0, "hi!", "hi!", "headlabcoordinator", true);
        java.lang.String str6 = student5.getUserType();
        int int7 = student5.getID();
        student5.setApproved(true);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Student" + "'", str6, "Student");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test0822() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0822");
        com.reservation_system.model.HeadLabCoordinator headLabCoordinator5 = new com.reservation_system.model.HeadLabCoordinator((int) (byte) 100, "Password1!", "guest", "Faculty", true);
        java.lang.String str6 = headLabCoordinator5.getUserType();
        java.lang.String str7 = headLabCoordinator5.getEmail();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "headlabcoordinator" + "'", str6, "headlabcoordinator");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "guest" + "'", str7, "guest");
    }

    @Test
    public void test0823() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0823");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("demo/data/test-users.csv");
        com.reservation_system.model.Researcher researcher7 = new com.reservation_system.model.Researcher(5, "hi!", "labmanager", "Guest", false);
        userRepository1.addUser((com.reservation_system.model.User) researcher7);
        int int9 = userRepository1.getNextID();
        boolean boolean11 = userRepository1.emailExists("Researcher");
        boolean boolean12 = userRepository1.headLabCoordinatorExists();
        java.util.Optional<com.reservation_system.model.User> userOptional14 = userRepository1.findByEmail("researcher");
        java.util.Optional<com.reservation_system.model.User> userOptional16 = userRepository1.findByEmail("labmanager");
// flaky "29) test0823(com.reservation_system.randoop.userrepository.RegressionTest1)":         org.junit.Assert.assertTrue("'" + int9 + "' != '" + 102 + "'", int9 == 102);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(userOptional14);
        org.junit.Assert.assertNotNull(userOptional16);
    }

    @Test
    public void test0824() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0824");
        com.reservation_system.model.Guest guest5 = new com.reservation_system.model.Guest((int) (short) 10, "Researcher", "alice@example.com", "hi!", true);
        java.lang.String str6 = guest5.getPassword();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
    }

    @Test
    public void test0825() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0825");
        com.reservation_system.model.LabManager labManager5 = new com.reservation_system.model.LabManager(52, "Faculty", "Researcher", "headlabcoordinator", true);
    }

    @Test
    public void test0826() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0826");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("demo/data/test-users.csv");
        com.reservation_system.model.Researcher researcher7 = new com.reservation_system.model.Researcher(5, "hi!", "labmanager", "Guest", false);
        userRepository1.addUser((com.reservation_system.model.User) researcher7);
        boolean boolean9 = userRepository1.headLabCoordinatorExists();
        java.util.Optional<com.reservation_system.model.User> userOptional11 = userRepository1.findByEmail("alice@example.com");
// flaky "30) test0826(com.reservation_system.randoop.userrepository.RegressionTest1)":         org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(userOptional11);
    }

    @Test
    public void test0827() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0827");
        com.reservation_system.model.Researcher researcher5 = new com.reservation_system.model.Researcher(5, "faculty", "Password1!", "Faculty", true);
    }

    @Test
    public void test0828() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0828");
        com.reservation_system.model.Student student5 = new com.reservation_system.model.Student(1, "demo/data/test-users.csv", "alice@example.com", "guest", false);
        java.lang.String str6 = student5.getUserType();
        student5.setApproved(false);
        java.lang.String str9 = student5.getUserType();
        java.lang.String str10 = student5.getUserType();
        java.lang.String str11 = student5.getUserType();
        boolean boolean12 = student5.requiresDepartmentApproval();
        java.lang.String str13 = student5.getName();
        boolean boolean14 = student5.isApproved();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Student" + "'", str6, "Student");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Student" + "'", str9, "Student");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Student" + "'", str10, "Student");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Student" + "'", str11, "Student");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "demo/data/test-users.csv" + "'", str13, "demo/data/test-users.csv");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test0829() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0829");
        com.reservation_system.model.Researcher researcher5 = new com.reservation_system.model.Researcher(100, "student", "guest", "headlabcoordinator", false);
        java.lang.String str6 = researcher5.getUserType();
        java.lang.String str7 = researcher5.getUserType();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Researcher" + "'", str6, "Researcher");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Researcher" + "'", str7, "Researcher");
    }

    @Test
    public void test0830() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0830");
        com.reservation_system.model.Student student5 = new com.reservation_system.model.Student(0, "labmanager", "headlabcoordinator", "alice@example.com", true);
    }

    @Test
    public void test0831() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0831");
        com.reservation_system.model.Guest guest5 = new com.reservation_system.model.Guest((int) (short) 10, "student", "labmanager", "researcher", true);
        java.lang.String str6 = guest5.getEmail();
        java.lang.String str7 = guest5.getPassword();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "labmanager" + "'", str6, "labmanager");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "researcher" + "'", str7, "researcher");
    }

    @Test
    public void test0832() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0832");
        com.reservation_system.model.Faculty faculty5 = new com.reservation_system.model.Faculty((int) ' ', "labmanager", "student", "demo/data/test-users.csv", true);
        java.lang.String str6 = faculty5.getUserType();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Faculty" + "'", str6, "Faculty");
    }

    @Test
    public void test0833() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0833");
        com.reservation_system.model.Faculty faculty5 = new com.reservation_system.model.Faculty((int) '4', "hi!", "Researcher", "Guest", false);
        java.lang.String str6 = faculty5.getUserType();
        java.lang.String str7 = faculty5.getUserType();
        java.lang.Class<?> wildcardClass8 = faculty5.getClass();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Faculty" + "'", str6, "Faculty");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Faculty" + "'", str7, "Faculty");
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0834() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0834");
        com.reservation_system.model.Guest guest5 = new com.reservation_system.model.Guest(10, "", "guest", "headlabcoordinator", false);
        guest5.setApproved(true);
        int int8 = guest5.getID();
        java.lang.String str9 = guest5.getUserType();
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 10 + "'", int8 == 10);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Guest" + "'", str9, "Guest");
    }

    @Test
    public void test0835() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0835");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("demo/data/test-users.csv");
        int int2 = userRepository1.getNextID();
        boolean boolean3 = userRepository1.headLabCoordinatorExists();
        com.reservation_system.model.Guest guest9 = new com.reservation_system.model.Guest((int) (byte) -1, "hi!", "", "Password1!", false);
        userRepository1.addUser((com.reservation_system.model.User) guest9);
        int int11 = userRepository1.getNextID();
        boolean boolean13 = userRepository1.emailExists("headlabcoordinator");
        boolean boolean14 = userRepository1.headLabCoordinatorExists();
        boolean boolean15 = userRepository1.headLabCoordinatorExists();
        boolean boolean17 = userRepository1.emailExists("researcher");
// flaky "31) test0835(com.reservation_system.randoop.userrepository.RegressionTest1)":         org.junit.Assert.assertTrue("'" + int2 + "' != '" + 102 + "'", int2 == 102);
// flaky "15) test0835(com.reservation_system.randoop.userrepository.RegressionTest1)":         org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
// flaky "9) test0835(com.reservation_system.randoop.userrepository.RegressionTest1)":         org.junit.Assert.assertTrue("'" + int11 + "' != '" + 102 + "'", int11 == 102);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
// flaky "4) test0835(com.reservation_system.randoop.userrepository.RegressionTest1)":         org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
// flaky "3) test0835(com.reservation_system.randoop.userrepository.RegressionTest1)":         org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test0836() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0836");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("demo/data/test-users.csv");
        int int2 = userRepository1.getNextID();
        int int3 = userRepository1.getNextID();
        java.util.List<com.reservation_system.model.User> userList4 = userRepository1.getAllUsers();
        com.reservation_system.model.Guest guest10 = new com.reservation_system.model.Guest(0, "student", "", "alice@example.com", false);
        java.lang.String str11 = guest10.getEmail();
        userRepository1.addUser((com.reservation_system.model.User) guest10);
        boolean boolean13 = userRepository1.headLabCoordinatorExists();
        boolean boolean14 = userRepository1.headLabCoordinatorExists();
// flaky "32) test0836(com.reservation_system.randoop.userrepository.RegressionTest1)":         org.junit.Assert.assertTrue("'" + int2 + "' != '" + 102 + "'", int2 == 102);
// flaky "16) test0836(com.reservation_system.randoop.userrepository.RegressionTest1)":         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 102 + "'", int3 == 102);
        org.junit.Assert.assertNotNull(userList4);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
// flaky "10) test0836(com.reservation_system.randoop.userrepository.RegressionTest1)":         org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
// flaky "5) test0836(com.reservation_system.randoop.userrepository.RegressionTest1)":         org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test0837() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0837");
        com.reservation_system.model.Faculty faculty5 = new com.reservation_system.model.Faculty((int) '4', "", "alice@example.com", "Password1!", false);
    }

    @Test
    public void test0838() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0838");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("demo/data/test-users.csv");
        java.util.List<com.reservation_system.model.User> userList2 = userRepository1.getAllUsers();
        int int3 = userRepository1.getNextID();
        com.reservation_system.repository.UserRepository userRepository5 = new com.reservation_system.repository.UserRepository("demo/data/test-users.csv");
        java.util.List<com.reservation_system.model.User> userList6 = userRepository5.getAllUsers();
        int int7 = userRepository5.getNextID();
        int int8 = userRepository5.getNextID();
        java.util.List<com.reservation_system.model.User> userList9 = userRepository5.getAllUsers();
        userRepository1.saveAllUsers(userList9);
        boolean boolean12 = userRepository1.emailExists("");
        org.junit.Assert.assertNotNull(userList2);
// flaky "33) test0838(com.reservation_system.randoop.userrepository.RegressionTest1)":         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 102 + "'", int3 == 102);
        org.junit.Assert.assertNotNull(userList6);
// flaky "17) test0838(com.reservation_system.randoop.userrepository.RegressionTest1)":         org.junit.Assert.assertTrue("'" + int7 + "' != '" + 102 + "'", int7 == 102);
// flaky "11) test0838(com.reservation_system.randoop.userrepository.RegressionTest1)":         org.junit.Assert.assertTrue("'" + int8 + "' != '" + 102 + "'", int8 == 102);
        org.junit.Assert.assertNotNull(userList9);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test0839() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0839");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("demo/data/test-users.csv");
        java.util.Optional<com.reservation_system.model.User> userOptional3 = userRepository1.findByEmail("hi!");
        boolean boolean4 = userRepository1.headLabCoordinatorExists();
        java.util.Optional<com.reservation_system.model.User> userOptional6 = userRepository1.findByEmail("");
        java.util.List<com.reservation_system.model.User> userList7 = userRepository1.getAllUsers();
        org.junit.Assert.assertNotNull(userOptional3);
// flaky "34) test0839(com.reservation_system.randoop.userrepository.RegressionTest1)":         org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(userOptional6);
        org.junit.Assert.assertNotNull(userList7);
    }

    @Test
    public void test0840() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0840");
        com.reservation_system.model.LabManager labManager5 = new com.reservation_system.model.LabManager((int) '4', "student", "headlabcoordinator", "researcher", false);
        java.lang.String str6 = labManager5.getUserType();
        java.lang.String str7 = labManager5.getName();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "labmanager" + "'", str6, "labmanager");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "student" + "'", str7, "student");
    }

    @Test
    public void test0841() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0841");
        com.reservation_system.model.Researcher researcher5 = new com.reservation_system.model.Researcher((int) (short) 100, "alice@example.com", "", "Password1!", false);
        java.lang.String str6 = researcher5.getUserType();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Researcher" + "'", str6, "Researcher");
    }

    @Test
    public void test0842() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0842");
        com.reservation_system.model.Guest guest5 = new com.reservation_system.model.Guest(5, "Researcher", "demo/data/test-users.csv", "Alice", false);
        java.lang.String str6 = guest5.getUserType();
        java.lang.String str7 = guest5.getName();
        java.lang.String str8 = guest5.getEmail();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Guest" + "'", str6, "Guest");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Researcher" + "'", str7, "Researcher");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "demo/data/test-users.csv" + "'", str8, "demo/data/test-users.csv");
    }

    @Test
    public void test0843() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0843");
        com.reservation_system.model.Researcher researcher5 = new com.reservation_system.model.Researcher((int) 'a', "labmanager", "faculty", "", false);
        boolean boolean6 = researcher5.requiresDepartmentApproval();
        java.lang.String str7 = researcher5.getUserType();
        researcher5.setApproved(true);
        java.lang.String str10 = researcher5.getUserType();
        java.lang.String str11 = researcher5.getUserType();
        researcher5.setApproved(true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Researcher" + "'", str7, "Researcher");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Researcher" + "'", str10, "Researcher");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Researcher" + "'", str11, "Researcher");
    }

    @Test
    public void test0844() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0844");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("demo/data/test-users.csv");
        com.reservation_system.model.Researcher researcher7 = new com.reservation_system.model.Researcher(5, "hi!", "labmanager", "Guest", false);
        userRepository1.addUser((com.reservation_system.model.User) researcher7);
        int int9 = userRepository1.getNextID();
        com.reservation_system.repository.UserRepository userRepository11 = new com.reservation_system.repository.UserRepository("demo/data/test-users.csv");
        com.reservation_system.model.Researcher researcher17 = new com.reservation_system.model.Researcher(5, "hi!", "labmanager", "Guest", false);
        userRepository11.addUser((com.reservation_system.model.User) researcher17);
        java.util.List<com.reservation_system.model.User> userList19 = userRepository11.getAllUsers();
        boolean boolean20 = userRepository11.headLabCoordinatorExists();
        boolean boolean22 = userRepository11.emailExists("guest");
        com.reservation_system.repository.UserRepository userRepository24 = new com.reservation_system.repository.UserRepository("demo/data/test-users.csv");
        boolean boolean26 = userRepository24.emailExists("Alice");
        com.reservation_system.repository.UserRepository userRepository28 = new com.reservation_system.repository.UserRepository("demo/data/test-users.csv");
        java.util.List<com.reservation_system.model.User> userList29 = userRepository28.getAllUsers();
        int int30 = userRepository28.getNextID();
        java.util.List<com.reservation_system.model.User> userList31 = userRepository28.getAllUsers();
        userRepository24.saveAllUsers(userList31);
        userRepository11.saveAllUsers(userList31);
        java.util.List<com.reservation_system.model.User> userList34 = userRepository11.getAllUsers();
        userRepository1.saveAllUsers(userList34);
        int int36 = userRepository1.getNextID();
// flaky "35) test0844(com.reservation_system.randoop.userrepository.RegressionTest1)":         org.junit.Assert.assertTrue("'" + int9 + "' != '" + 102 + "'", int9 == 102);
        org.junit.Assert.assertNotNull(userList19);
// flaky "18) test0844(com.reservation_system.randoop.userrepository.RegressionTest1)":         org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
// flaky "12) test0844(com.reservation_system.randoop.userrepository.RegressionTest1)":         org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(userList29);
// flaky "6) test0844(com.reservation_system.randoop.userrepository.RegressionTest1)":         org.junit.Assert.assertTrue("'" + int30 + "' != '" + 102 + "'", int30 == 102);
        org.junit.Assert.assertNotNull(userList31);
        org.junit.Assert.assertNotNull(userList34);
// flaky "4) test0844(com.reservation_system.randoop.userrepository.RegressionTest1)":         org.junit.Assert.assertTrue("'" + int36 + "' != '" + 102 + "'", int36 == 102);
    }

    @Test
    public void test0845() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0845");
        com.reservation_system.model.Guest guest5 = new com.reservation_system.model.Guest(0, "guest", "hi!", "hi!", false);
    }

    @Test
    public void test0846() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0846");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("demo/data/test-users.csv");
        com.reservation_system.model.Researcher researcher7 = new com.reservation_system.model.Researcher(5, "hi!", "labmanager", "Guest", false);
        userRepository1.addUser((com.reservation_system.model.User) researcher7);
        java.util.Optional<com.reservation_system.model.User> userOptional10 = userRepository1.findByEmail("alice@example.com");
        java.util.List<com.reservation_system.model.User> userList11 = userRepository1.getAllUsers();
        com.reservation_system.repository.UserRepository userRepository13 = new com.reservation_system.repository.UserRepository("demo/data/test-users.csv");
        com.reservation_system.model.Researcher researcher19 = new com.reservation_system.model.Researcher(5, "hi!", "labmanager", "Guest", false);
        userRepository13.addUser((com.reservation_system.model.User) researcher19);
        java.util.List<com.reservation_system.model.User> userList21 = userRepository13.getAllUsers();
        boolean boolean23 = userRepository13.emailExists("hi!");
        com.reservation_system.repository.UserRepository userRepository25 = new com.reservation_system.repository.UserRepository("demo/data/test-users.csv");
        com.reservation_system.model.Researcher researcher31 = new com.reservation_system.model.Researcher(5, "hi!", "labmanager", "Guest", false);
        userRepository25.addUser((com.reservation_system.model.User) researcher31);
        java.util.List<com.reservation_system.model.User> userList33 = userRepository25.getAllUsers();
        com.reservation_system.model.Guest guest39 = new com.reservation_system.model.Guest(0, "Password1!", "demo/data/test-users.csv", "researcher", false);
        boolean boolean40 = guest39.requiresDepartmentApproval();
        userRepository25.addUser((com.reservation_system.model.User) guest39);
        boolean boolean43 = userRepository25.emailExists("Alice");
        int int44 = userRepository25.getNextID();
        com.reservation_system.repository.UserRepository userRepository46 = new com.reservation_system.repository.UserRepository("demo/data/test-users.csv");
        boolean boolean48 = userRepository46.emailExists("Alice");
        com.reservation_system.repository.UserRepository userRepository50 = new com.reservation_system.repository.UserRepository("demo/data/test-users.csv");
        java.util.List<com.reservation_system.model.User> userList51 = userRepository50.getAllUsers();
        int int52 = userRepository50.getNextID();
        java.util.List<com.reservation_system.model.User> userList53 = userRepository50.getAllUsers();
        userRepository46.saveAllUsers(userList53);
        userRepository25.saveAllUsers(userList53);
        userRepository13.saveAllUsers(userList53);
        userRepository1.saveAllUsers(userList53);
        boolean boolean58 = userRepository1.headLabCoordinatorExists();
        java.util.List<com.reservation_system.model.User> userList59 = userRepository1.getAllUsers();
        java.util.Optional<com.reservation_system.model.User> userOptional61 = userRepository1.findByEmail("Faculty");
        org.junit.Assert.assertNotNull(userOptional10);
        org.junit.Assert.assertNotNull(userList11);
        org.junit.Assert.assertNotNull(userList21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(userList33);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
// flaky "36) test0846(com.reservation_system.randoop.userrepository.RegressionTest1)":         org.junit.Assert.assertTrue("'" + int44 + "' != '" + 102 + "'", int44 == 102);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertNotNull(userList51);
// flaky "19) test0846(com.reservation_system.randoop.userrepository.RegressionTest1)":         org.junit.Assert.assertTrue("'" + int52 + "' != '" + 102 + "'", int52 == 102);
        org.junit.Assert.assertNotNull(userList53);
// flaky "13) test0846(com.reservation_system.randoop.userrepository.RegressionTest1)":         org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + true + "'", boolean58 == true);
        org.junit.Assert.assertNotNull(userList59);
        org.junit.Assert.assertNotNull(userOptional61);
    }

    @Test
    public void test0847() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0847");
        com.reservation_system.model.Researcher researcher5 = new com.reservation_system.model.Researcher((int) (byte) 1, "faculty", "alice@example.com", "Researcher", false);
    }

    @Test
    public void test0848() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0848");
        com.reservation_system.model.Faculty faculty5 = new com.reservation_system.model.Faculty(0, "faculty", "researcher", "", true);
    }

    @Test
    public void test0849() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0849");
        com.reservation_system.model.Student student5 = new com.reservation_system.model.Student((int) (short) 10, "headlabcoordinator", "demo/data/test-users.csv", "Alice", true);
    }

    @Test
    public void test0850() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0850");
        com.reservation_system.model.Guest guest5 = new com.reservation_system.model.Guest(0, "guest", "Researcher", "guest", true);
        java.lang.String str6 = guest5.getUserType();
        boolean boolean7 = guest5.requiresDepartmentApproval();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Guest" + "'", str6, "Guest");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test0851() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0851");
        com.reservation_system.model.HeadLabCoordinator headLabCoordinator5 = new com.reservation_system.model.HeadLabCoordinator(10, "labmanager", "labmanager", "labmanager", true);
        headLabCoordinator5.setApproved(true);
    }

    @Test
    public void test0852() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0852");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("demo/data/test-users.csv");
        java.util.List<com.reservation_system.model.User> userList2 = userRepository1.getAllUsers();
        int int3 = userRepository1.getNextID();
        boolean boolean5 = userRepository1.emailExists("headlabcoordinator");
        boolean boolean6 = userRepository1.headLabCoordinatorExists();
        int int7 = userRepository1.getNextID();
        com.reservation_system.repository.UserRepository userRepository9 = new com.reservation_system.repository.UserRepository("demo/data/test-users.csv");
        com.reservation_system.model.Researcher researcher15 = new com.reservation_system.model.Researcher(5, "hi!", "labmanager", "Guest", false);
        userRepository9.addUser((com.reservation_system.model.User) researcher15);
        int int17 = userRepository9.getNextID();
        com.reservation_system.repository.UserRepository userRepository19 = new com.reservation_system.repository.UserRepository("demo/data/test-users.csv");
        com.reservation_system.model.Researcher researcher25 = new com.reservation_system.model.Researcher(5, "hi!", "labmanager", "Guest", false);
        userRepository19.addUser((com.reservation_system.model.User) researcher25);
        java.util.List<com.reservation_system.model.User> userList27 = userRepository19.getAllUsers();
        boolean boolean28 = userRepository19.headLabCoordinatorExists();
        boolean boolean30 = userRepository19.emailExists("guest");
        com.reservation_system.repository.UserRepository userRepository32 = new com.reservation_system.repository.UserRepository("demo/data/test-users.csv");
        boolean boolean34 = userRepository32.emailExists("Alice");
        com.reservation_system.repository.UserRepository userRepository36 = new com.reservation_system.repository.UserRepository("demo/data/test-users.csv");
        java.util.List<com.reservation_system.model.User> userList37 = userRepository36.getAllUsers();
        int int38 = userRepository36.getNextID();
        java.util.List<com.reservation_system.model.User> userList39 = userRepository36.getAllUsers();
        userRepository32.saveAllUsers(userList39);
        userRepository19.saveAllUsers(userList39);
        java.util.List<com.reservation_system.model.User> userList42 = userRepository19.getAllUsers();
        userRepository9.saveAllUsers(userList42);
        userRepository1.saveAllUsers(userList42);
        int int45 = userRepository1.getNextID();
        org.junit.Assert.assertNotNull(userList2);
// flaky "37) test0852(com.reservation_system.randoop.userrepository.RegressionTest1)":         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 102 + "'", int3 == 102);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
// flaky "20) test0852(com.reservation_system.randoop.userrepository.RegressionTest1)":         org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
// flaky "14) test0852(com.reservation_system.randoop.userrepository.RegressionTest1)":         org.junit.Assert.assertTrue("'" + int7 + "' != '" + 102 + "'", int7 == 102);
// flaky "7) test0852(com.reservation_system.randoop.userrepository.RegressionTest1)":         org.junit.Assert.assertTrue("'" + int17 + "' != '" + 102 + "'", int17 == 102);
        org.junit.Assert.assertNotNull(userList27);
// flaky "5) test0852(com.reservation_system.randoop.userrepository.RegressionTest1)":         org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
// flaky "2) test0852(com.reservation_system.randoop.userrepository.RegressionTest1)":         org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertNotNull(userList37);
// flaky "2) test0852(com.reservation_system.randoop.userrepository.RegressionTest1)":         org.junit.Assert.assertTrue("'" + int38 + "' != '" + 102 + "'", int38 == 102);
        org.junit.Assert.assertNotNull(userList39);
        org.junit.Assert.assertNotNull(userList42);
// flaky "1) test0852(com.reservation_system.randoop.userrepository.RegressionTest1)":         org.junit.Assert.assertTrue("'" + int45 + "' != '" + 102 + "'", int45 == 102);
    }

    @Test
    public void test0853() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0853");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("demo/data/test-users.csv");
        com.reservation_system.model.Researcher researcher7 = new com.reservation_system.model.Researcher(5, "hi!", "labmanager", "Guest", false);
        userRepository1.addUser((com.reservation_system.model.User) researcher7);
        java.util.List<com.reservation_system.model.User> userList9 = userRepository1.getAllUsers();
        com.reservation_system.repository.UserRepository userRepository11 = new com.reservation_system.repository.UserRepository("demo/data/test-users.csv");
        com.reservation_system.model.Researcher researcher17 = new com.reservation_system.model.Researcher(5, "hi!", "labmanager", "Guest", false);
        userRepository11.addUser((com.reservation_system.model.User) researcher17);
        java.util.Optional<com.reservation_system.model.User> userOptional20 = userRepository11.findByEmail("alice@example.com");
        java.util.List<com.reservation_system.model.User> userList21 = userRepository11.getAllUsers();
        userRepository1.saveAllUsers(userList21);
        com.reservation_system.model.Student student28 = new com.reservation_system.model.Student((int) (short) 100, "guest", "Guest", "faculty", false);
        userRepository1.addUser((com.reservation_system.model.User) student28);
        java.lang.Class<?> wildcardClass30 = userRepository1.getClass();
        org.junit.Assert.assertNotNull(userList9);
        org.junit.Assert.assertNotNull(userOptional20);
        org.junit.Assert.assertNotNull(userList21);
        org.junit.Assert.assertNotNull(wildcardClass30);
    }

    @Test
    public void test0854() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0854");
        com.reservation_system.model.Guest guest5 = new com.reservation_system.model.Guest((int) (byte) 100, "guest", "Faculty", "student", false);
        java.lang.String str6 = guest5.getPassword();
        boolean boolean7 = guest5.requiresDepartmentApproval();
        int int8 = guest5.getID();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "student" + "'", str6, "student");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8 == 100);
    }

    @Test
    public void test0855() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0855");
        com.reservation_system.model.Researcher researcher5 = new com.reservation_system.model.Researcher(10, "demo/data/test-users.csv", "Student", "faculty", false);
        java.lang.String str6 = researcher5.getEmail();
        java.lang.String str7 = researcher5.getUserType();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Student" + "'", str6, "Student");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Researcher" + "'", str7, "Researcher");
    }

    @Test
    public void test0856() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0856");
        com.reservation_system.model.Faculty faculty5 = new com.reservation_system.model.Faculty(0, "faculty", "Guest", "", false);
        java.lang.Class<?> wildcardClass6 = faculty5.getClass();
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0857() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0857");
        com.reservation_system.model.HeadLabCoordinator headLabCoordinator5 = new com.reservation_system.model.HeadLabCoordinator((int) (short) 100, "alice@example.com", "Guest", "labmanager", true);
        boolean boolean6 = headLabCoordinator5.isApproved();
        java.lang.String str7 = headLabCoordinator5.getUserType();
        int int8 = headLabCoordinator5.getID();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "headlabcoordinator" + "'", str7, "headlabcoordinator");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8 == 100);
    }

    @Test
    public void test0858() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0858");
        com.reservation_system.model.LabManager labManager5 = new com.reservation_system.model.LabManager(10, "Password1!", "demo/data/test-users.csv", "Guest", true);
        java.lang.String str6 = labManager5.getUserType();
        java.lang.String str7 = labManager5.getPassword();
        labManager5.setApproved(true);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "labmanager" + "'", str6, "labmanager");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Guest" + "'", str7, "Guest");
    }

    @Test
    public void test0859() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0859");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("demo/data/test-users.csv");
        int int2 = userRepository1.getNextID();
        boolean boolean3 = userRepository1.headLabCoordinatorExists();
        com.reservation_system.model.Guest guest9 = new com.reservation_system.model.Guest((int) (byte) -1, "hi!", "", "Password1!", false);
        userRepository1.addUser((com.reservation_system.model.User) guest9);
        com.reservation_system.repository.UserRepository userRepository12 = new com.reservation_system.repository.UserRepository("demo/data/test-users.csv");
        com.reservation_system.model.Researcher researcher18 = new com.reservation_system.model.Researcher(5, "hi!", "labmanager", "Guest", false);
        userRepository12.addUser((com.reservation_system.model.User) researcher18);
        java.util.List<com.reservation_system.model.User> userList20 = userRepository12.getAllUsers();
        com.reservation_system.repository.UserRepository userRepository22 = new com.reservation_system.repository.UserRepository("demo/data/test-users.csv");
        com.reservation_system.model.Researcher researcher28 = new com.reservation_system.model.Researcher(5, "hi!", "labmanager", "Guest", false);
        userRepository22.addUser((com.reservation_system.model.User) researcher28);
        java.util.Optional<com.reservation_system.model.User> userOptional31 = userRepository22.findByEmail("alice@example.com");
        java.util.List<com.reservation_system.model.User> userList32 = userRepository22.getAllUsers();
        userRepository12.saveAllUsers(userList32);
        userRepository1.saveAllUsers(userList32);
        java.util.Optional<com.reservation_system.model.User> userOptional36 = userRepository1.findByEmail("researcher");
        com.reservation_system.repository.UserRepository userRepository38 = new com.reservation_system.repository.UserRepository("demo/data/test-users.csv");
        java.util.List<com.reservation_system.model.User> userList39 = userRepository38.getAllUsers();
        int int40 = userRepository38.getNextID();
        boolean boolean42 = userRepository38.emailExists("headlabcoordinator");
        boolean boolean43 = userRepository38.headLabCoordinatorExists();
        java.util.Optional<com.reservation_system.model.User> userOptional45 = userRepository38.findByEmail("Alice");
        boolean boolean47 = userRepository38.emailExists("Alice");
        boolean boolean49 = userRepository38.emailExists("researcher");
        java.util.List<com.reservation_system.model.User> userList50 = userRepository38.getAllUsers();
        userRepository1.saveAllUsers(userList50);
// flaky "38) test0859(com.reservation_system.randoop.userrepository.RegressionTest1)":         org.junit.Assert.assertTrue("'" + int2 + "' != '" + 102 + "'", int2 == 102);
// flaky "21) test0859(com.reservation_system.randoop.userrepository.RegressionTest1)":         org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(userList20);
        org.junit.Assert.assertNotNull(userOptional31);
        org.junit.Assert.assertNotNull(userList32);
        org.junit.Assert.assertNotNull(userOptional36);
        org.junit.Assert.assertNotNull(userList39);
// flaky "15) test0859(com.reservation_system.randoop.userrepository.RegressionTest1)":         org.junit.Assert.assertTrue("'" + int40 + "' != '" + 102 + "'", int40 == 102);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
// flaky "8) test0859(com.reservation_system.randoop.userrepository.RegressionTest1)":         org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + true + "'", boolean43 == true);
        org.junit.Assert.assertNotNull(userOptional45);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertNotNull(userList50);
    }

    @Test
    public void test0860() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0860");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("demo/data/test-users.csv");
        boolean boolean3 = userRepository1.emailExists("Alice");
        com.reservation_system.model.Researcher researcher9 = new com.reservation_system.model.Researcher((int) 'a', "labmanager", "faculty", "", false);
        boolean boolean10 = researcher9.isApproved();
        java.lang.String str11 = researcher9.getName();
        userRepository1.addUser((com.reservation_system.model.User) researcher9);
        boolean boolean13 = userRepository1.headLabCoordinatorExists();
        int int14 = userRepository1.getNextID();
        com.reservation_system.model.User user21 = com.reservation_system.patterns.factory.UserFactory.createUser("Guest", (int) (short) 1, "", "alice@example.com", "labmanager", true);
        userRepository1.addUser(user21);
        int int23 = userRepository1.getNextID();
        java.util.List<com.reservation_system.model.User> userList24 = userRepository1.getAllUsers();
        boolean boolean26 = userRepository1.emailExists("");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "labmanager" + "'", str11, "labmanager");
// flaky "39) test0860(com.reservation_system.randoop.userrepository.RegressionTest1)":         org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
// flaky "22) test0860(com.reservation_system.randoop.userrepository.RegressionTest1)":         org.junit.Assert.assertTrue("'" + int14 + "' != '" + 102 + "'", int14 == 102);
        org.junit.Assert.assertNotNull(user21);
// flaky "16) test0860(com.reservation_system.randoop.userrepository.RegressionTest1)":         org.junit.Assert.assertTrue("'" + int23 + "' != '" + 102 + "'", int23 == 102);
        org.junit.Assert.assertNotNull(userList24);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
    }

    @Test
    public void test0861() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0861");
        com.reservation_system.model.HeadLabCoordinator headLabCoordinator5 = new com.reservation_system.model.HeadLabCoordinator(98, "Researcher", "researcher", "Researcher", false);
    }

    @Test
    public void test0862() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0862");
        com.reservation_system.model.Guest guest5 = new com.reservation_system.model.Guest(0, "Password1!", "demo/data/test-users.csv", "researcher", false);
        boolean boolean6 = guest5.requiresDepartmentApproval();
        java.lang.String str7 = guest5.getUserType();
        java.lang.String str8 = guest5.getUserType();
        guest5.setApproved(true);
        java.lang.String str11 = guest5.getUserType();
        java.lang.String str12 = guest5.getUserType();
        java.lang.String str13 = guest5.getUserType();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Guest" + "'", str7, "Guest");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Guest" + "'", str8, "Guest");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Guest" + "'", str11, "Guest");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Guest" + "'", str12, "Guest");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Guest" + "'", str13, "Guest");
    }

    @Test
    public void test0863() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0863");
        com.reservation_system.model.Faculty faculty5 = new com.reservation_system.model.Faculty((int) (short) 10, "guest", "Researcher", "faculty", false);
    }

    @Test
    public void test0864() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0864");
        com.reservation_system.model.Student student5 = new com.reservation_system.model.Student((int) (short) 10, "Password1!", "Alice", "Student", true);
        int int6 = student5.getID();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
    }

    @Test
    public void test0865() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0865");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("demo/data/test-users.csv");
        boolean boolean3 = userRepository1.emailExists("Alice");
        int int4 = userRepository1.getNextID();
        boolean boolean5 = userRepository1.headLabCoordinatorExists();
        boolean boolean6 = userRepository1.headLabCoordinatorExists();
        boolean boolean8 = userRepository1.emailExists("Researcher");
        boolean boolean10 = userRepository1.emailExists("headlabcoordinator");
        com.reservation_system.repository.UserRepository userRepository12 = new com.reservation_system.repository.UserRepository("demo/data/test-users.csv");
        com.reservation_system.model.Researcher researcher18 = new com.reservation_system.model.Researcher(5, "hi!", "labmanager", "Guest", false);
        userRepository12.addUser((com.reservation_system.model.User) researcher18);
        java.util.List<com.reservation_system.model.User> userList20 = userRepository12.getAllUsers();
        boolean boolean21 = userRepository12.headLabCoordinatorExists();
        boolean boolean23 = userRepository12.emailExists("guest");
        com.reservation_system.repository.UserRepository userRepository25 = new com.reservation_system.repository.UserRepository("demo/data/test-users.csv");
        boolean boolean27 = userRepository25.emailExists("Alice");
        com.reservation_system.repository.UserRepository userRepository29 = new com.reservation_system.repository.UserRepository("demo/data/test-users.csv");
        java.util.List<com.reservation_system.model.User> userList30 = userRepository29.getAllUsers();
        int int31 = userRepository29.getNextID();
        java.util.List<com.reservation_system.model.User> userList32 = userRepository29.getAllUsers();
        userRepository25.saveAllUsers(userList32);
        userRepository12.saveAllUsers(userList32);
        java.util.List<com.reservation_system.model.User> userList35 = userRepository12.getAllUsers();
        userRepository1.saveAllUsers(userList35);
        java.lang.Class<?> wildcardClass37 = userRepository1.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
// flaky "40) test0865(com.reservation_system.randoop.userrepository.RegressionTest1)":         org.junit.Assert.assertTrue("'" + int4 + "' != '" + 102 + "'", int4 == 102);
// flaky "23) test0865(com.reservation_system.randoop.userrepository.RegressionTest1)":         org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
// flaky "17) test0865(com.reservation_system.randoop.userrepository.RegressionTest1)":         org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(userList20);
// flaky "9) test0865(com.reservation_system.randoop.userrepository.RegressionTest1)":         org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(userList30);
// flaky "6) test0865(com.reservation_system.randoop.userrepository.RegressionTest1)":         org.junit.Assert.assertTrue("'" + int31 + "' != '" + 102 + "'", int31 == 102);
        org.junit.Assert.assertNotNull(userList32);
        org.junit.Assert.assertNotNull(userList35);
        org.junit.Assert.assertNotNull(wildcardClass37);
    }

    @Test
    public void test0866() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0866");
        com.reservation_system.model.HeadLabCoordinator headLabCoordinator5 = new com.reservation_system.model.HeadLabCoordinator((int) (byte) 10, "hi!", "researcher", "demo/data/test-users.csv", false);
    }

    @Test
    public void test0867() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0867");
        com.reservation_system.model.Researcher researcher5 = new com.reservation_system.model.Researcher((int) 'a', "headlabcoordinator", "Alice", "Password1!", false);
    }

    @Test
    public void test0868() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0868");
        com.reservation_system.model.HeadLabCoordinator headLabCoordinator5 = new com.reservation_system.model.HeadLabCoordinator((int) (byte) -1, "demo/data/test-users.csv", "alice@example.com", "student", true);
        java.lang.String str6 = headLabCoordinator5.getEmail();
        java.lang.String str7 = headLabCoordinator5.getUserType();
        java.lang.String str8 = headLabCoordinator5.getUserType();
        java.lang.String str9 = headLabCoordinator5.getUserType();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "headlabcoordinator" + "'", str7, "headlabcoordinator");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "headlabcoordinator" + "'", str8, "headlabcoordinator");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "headlabcoordinator" + "'", str9, "headlabcoordinator");
    }

    @Test
    public void test0869() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0869");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("demo/data/test-users.csv");
        com.reservation_system.model.Researcher researcher7 = new com.reservation_system.model.Researcher(5, "hi!", "labmanager", "Guest", false);
        userRepository1.addUser((com.reservation_system.model.User) researcher7);
        java.util.Optional<com.reservation_system.model.User> userOptional10 = userRepository1.findByEmail("alice@example.com");
        java.util.List<com.reservation_system.model.User> userList11 = userRepository1.getAllUsers();
        java.util.Optional<com.reservation_system.model.User> userOptional13 = userRepository1.findByEmail("Password1!");
        boolean boolean15 = userRepository1.emailExists("guest");
        boolean boolean16 = userRepository1.headLabCoordinatorExists();
        org.junit.Assert.assertNotNull(userOptional10);
        org.junit.Assert.assertNotNull(userList11);
        org.junit.Assert.assertNotNull(userOptional13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
// flaky "41) test0869(com.reservation_system.randoop.userrepository.RegressionTest1)":         org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
    }

    @Test
    public void test0870() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0870");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("demo/data/test-users.csv");
        com.reservation_system.model.Researcher researcher7 = new com.reservation_system.model.Researcher(5, "hi!", "labmanager", "Guest", false);
        userRepository1.addUser((com.reservation_system.model.User) researcher7);
        int int9 = researcher7.getID();
        java.lang.String str10 = researcher7.getUserType();
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 5 + "'", int9 == 5);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Researcher" + "'", str10, "Researcher");
    }

    @Test
    public void test0871() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0871");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("demo/data/test-users.csv");
        com.reservation_system.model.Researcher researcher7 = new com.reservation_system.model.Researcher(5, "hi!", "labmanager", "Guest", false);
        userRepository1.addUser((com.reservation_system.model.User) researcher7);
        java.util.List<com.reservation_system.model.User> userList9 = userRepository1.getAllUsers();
        com.reservation_system.repository.UserRepository userRepository11 = new com.reservation_system.repository.UserRepository("demo/data/test-users.csv");
        com.reservation_system.model.Researcher researcher17 = new com.reservation_system.model.Researcher(5, "hi!", "labmanager", "Guest", false);
        userRepository11.addUser((com.reservation_system.model.User) researcher17);
        java.util.Optional<com.reservation_system.model.User> userOptional20 = userRepository11.findByEmail("alice@example.com");
        java.util.List<com.reservation_system.model.User> userList21 = userRepository11.getAllUsers();
        userRepository1.saveAllUsers(userList21);
        java.util.List<com.reservation_system.model.User> userList23 = userRepository1.getAllUsers();
        com.reservation_system.repository.UserRepository userRepository25 = new com.reservation_system.repository.UserRepository("demo/data/test-users.csv");
        com.reservation_system.model.Researcher researcher31 = new com.reservation_system.model.Researcher(5, "hi!", "labmanager", "Guest", false);
        userRepository25.addUser((com.reservation_system.model.User) researcher31);
        java.util.List<com.reservation_system.model.User> userList33 = userRepository25.getAllUsers();
        com.reservation_system.repository.UserRepository userRepository35 = new com.reservation_system.repository.UserRepository("demo/data/test-users.csv");
        com.reservation_system.model.Researcher researcher41 = new com.reservation_system.model.Researcher(5, "hi!", "labmanager", "Guest", false);
        userRepository35.addUser((com.reservation_system.model.User) researcher41);
        java.util.Optional<com.reservation_system.model.User> userOptional44 = userRepository35.findByEmail("alice@example.com");
        java.util.List<com.reservation_system.model.User> userList45 = userRepository35.getAllUsers();
        userRepository25.saveAllUsers(userList45);
        com.reservation_system.model.Student student52 = new com.reservation_system.model.Student((int) (short) 100, "guest", "Guest", "faculty", false);
        userRepository25.addUser((com.reservation_system.model.User) student52);
        com.reservation_system.repository.UserRepository userRepository55 = new com.reservation_system.repository.UserRepository("demo/data/test-users.csv");
        int int56 = userRepository55.getNextID();
        int int57 = userRepository55.getNextID();
        java.util.List<com.reservation_system.model.User> userList58 = userRepository55.getAllUsers();
        userRepository25.saveAllUsers(userList58);
        userRepository1.saveAllUsers(userList58);
        org.junit.Assert.assertNotNull(userList9);
        org.junit.Assert.assertNotNull(userOptional20);
        org.junit.Assert.assertNotNull(userList21);
        org.junit.Assert.assertNotNull(userList23);
        org.junit.Assert.assertNotNull(userList33);
        org.junit.Assert.assertNotNull(userOptional44);
        org.junit.Assert.assertNotNull(userList45);
// flaky "42) test0871(com.reservation_system.randoop.userrepository.RegressionTest1)":         org.junit.Assert.assertTrue("'" + int56 + "' != '" + 102 + "'", int56 == 102);
// flaky "24) test0871(com.reservation_system.randoop.userrepository.RegressionTest1)":         org.junit.Assert.assertTrue("'" + int57 + "' != '" + 102 + "'", int57 == 102);
        org.junit.Assert.assertNotNull(userList58);
    }

    @Test
    public void test0872() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0872");
        com.reservation_system.model.Faculty faculty5 = new com.reservation_system.model.Faculty(5, "Faculty", "faculty", "labmanager", false);
        boolean boolean6 = faculty5.requiresDepartmentApproval();
        boolean boolean7 = faculty5.requiresDepartmentApproval();
        int int8 = faculty5.getID();
        java.lang.String str9 = faculty5.getName();
        java.lang.String str10 = faculty5.getUserType();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 5 + "'", int8 == 5);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Faculty" + "'", str9, "Faculty");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Faculty" + "'", str10, "Faculty");
    }

    @Test
    public void test0873() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0873");
        com.reservation_system.model.Student student5 = new com.reservation_system.model.Student(1, "demo/data/test-users.csv", "alice@example.com", "guest", false);
        java.lang.String str6 = student5.getUserType();
        student5.setApproved(false);
        boolean boolean9 = student5.requiresDepartmentApproval();
        student5.setApproved(true);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Student" + "'", str6, "Student");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test0874() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0874");
        com.reservation_system.model.Guest guest5 = new com.reservation_system.model.Guest((int) (short) 100, "", "student", "Researcher", true);
        java.lang.String str6 = guest5.getUserType();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Guest" + "'", str6, "Guest");
    }

    @Test
    public void test0875() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0875");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("demo/data/test-users.csv");
        int int2 = userRepository1.getNextID();
        int int3 = userRepository1.getNextID();
        com.reservation_system.model.HeadLabCoordinator headLabCoordinator9 = new com.reservation_system.model.HeadLabCoordinator((int) (byte) 1, "", "", "guest", false);
        userRepository1.addUser((com.reservation_system.model.User) headLabCoordinator9);
        java.util.List<com.reservation_system.model.User> userList11 = userRepository1.getAllUsers();
        boolean boolean13 = userRepository1.emailExists("Faculty");
        java.util.List<com.reservation_system.model.User> userList14 = userRepository1.getAllUsers();
        com.reservation_system.repository.UserRepository userRepository16 = new com.reservation_system.repository.UserRepository("demo/data/test-users.csv");
        java.util.List<com.reservation_system.model.User> userList17 = userRepository16.getAllUsers();
        com.reservation_system.model.Guest guest23 = new com.reservation_system.model.Guest(0, "Password1!", "demo/data/test-users.csv", "researcher", false);
        boolean boolean24 = guest23.requiresDepartmentApproval();
        java.lang.String str25 = guest23.getUserType();
        java.lang.String str26 = guest23.getUserType();
        guest23.setApproved(true);
        java.lang.String str29 = guest23.getUserType();
        userRepository16.addUser((com.reservation_system.model.User) guest23);
        com.reservation_system.repository.UserRepository userRepository32 = new com.reservation_system.repository.UserRepository("demo/data/test-users.csv");
        java.util.List<com.reservation_system.model.User> userList33 = userRepository32.getAllUsers();
        int int34 = userRepository32.getNextID();
        boolean boolean36 = userRepository32.emailExists("headlabcoordinator");
        boolean boolean37 = userRepository32.headLabCoordinatorExists();
        java.util.Optional<com.reservation_system.model.User> userOptional39 = userRepository32.findByEmail("Alice");
        boolean boolean41 = userRepository32.emailExists("Alice");
        boolean boolean43 = userRepository32.emailExists("Guest");
        boolean boolean45 = userRepository32.emailExists("headlabcoordinator");
        com.reservation_system.repository.UserRepository userRepository47 = new com.reservation_system.repository.UserRepository("demo/data/test-users.csv");
        boolean boolean49 = userRepository47.emailExists("Alice");
        com.reservation_system.model.Researcher researcher55 = new com.reservation_system.model.Researcher((int) 'a', "labmanager", "faculty", "", false);
        boolean boolean56 = researcher55.isApproved();
        java.lang.String str57 = researcher55.getName();
        userRepository47.addUser((com.reservation_system.model.User) researcher55);
        boolean boolean59 = userRepository47.headLabCoordinatorExists();
        java.util.List<com.reservation_system.model.User> userList60 = userRepository47.getAllUsers();
        userRepository32.saveAllUsers(userList60);
        userRepository16.saveAllUsers(userList60);
        userRepository1.saveAllUsers(userList60);
        boolean boolean64 = userRepository1.headLabCoordinatorExists();
// flaky "43) test0875(com.reservation_system.randoop.userrepository.RegressionTest1)":         org.junit.Assert.assertTrue("'" + int2 + "' != '" + 102 + "'", int2 == 102);
// flaky "25) test0875(com.reservation_system.randoop.userrepository.RegressionTest1)":         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 102 + "'", int3 == 102);
        org.junit.Assert.assertNotNull(userList11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(userList14);
        org.junit.Assert.assertNotNull(userList17);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "Guest" + "'", str25, "Guest");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "Guest" + "'", str26, "Guest");
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "Guest" + "'", str29, "Guest");
        org.junit.Assert.assertNotNull(userList33);
// flaky "18) test0875(com.reservation_system.randoop.userrepository.RegressionTest1)":         org.junit.Assert.assertTrue("'" + int34 + "' != '" + 102 + "'", int34 == 102);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
        org.junit.Assert.assertNotNull(userOptional39);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + true + "'", boolean43 == true);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
        org.junit.Assert.assertEquals("'" + str57 + "' != '" + "labmanager" + "'", str57, "labmanager");
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + true + "'", boolean59 == true);
        org.junit.Assert.assertNotNull(userList60);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + true + "'", boolean64 == true);
    }

    @Test
    public void test0876() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0876");
        com.reservation_system.model.Student student5 = new com.reservation_system.model.Student(100, "hi!", "labmanager", "Researcher", true);
    }

    @Test
    public void test0877() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0877");
        com.reservation_system.model.HeadLabCoordinator headLabCoordinator5 = new com.reservation_system.model.HeadLabCoordinator((int) (short) -1, "researcher", "student", "student", true);
        java.lang.String str6 = headLabCoordinator5.getUserType();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "headlabcoordinator" + "'", str6, "headlabcoordinator");
    }

    @Test
    public void test0878() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0878");
        com.reservation_system.model.User user6 = com.reservation_system.patterns.factory.UserFactory.createUser("Guest", (int) (short) 1, "", "Guest", "Guest", false);
        org.junit.Assert.assertNotNull(user6);
    }

    @Test
    public void test0879() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0879");
        com.reservation_system.model.Faculty faculty5 = new com.reservation_system.model.Faculty((int) (byte) -1, "Alice", "researcher", "Password1!", false);
        java.lang.String str6 = faculty5.getName();
        java.lang.String str7 = faculty5.getUserType();
        java.lang.String str8 = faculty5.getUserType();
        java.lang.String str9 = faculty5.getUserType();
        java.lang.String str10 = faculty5.getUserType();
        java.lang.String str11 = faculty5.getPassword();
        boolean boolean12 = faculty5.requiresDepartmentApproval();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Alice" + "'", str6, "Alice");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Faculty" + "'", str7, "Faculty");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Faculty" + "'", str8, "Faculty");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Faculty" + "'", str9, "Faculty");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Faculty" + "'", str10, "Faculty");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Password1!" + "'", str11, "Password1!");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test0880() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0880");
        com.reservation_system.model.Researcher researcher5 = new com.reservation_system.model.Researcher((int) (byte) -1, "demo/data/test-users.csv", "Alice", "faculty", true);
        java.lang.String str6 = researcher5.getUserType();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Researcher" + "'", str6, "Researcher");
    }

    @Test
    public void test0881() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0881");
        com.reservation_system.model.Faculty faculty5 = new com.reservation_system.model.Faculty((int) '#', "faculty", "hi!", "Student", true);
        java.lang.String str6 = faculty5.getName();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "faculty" + "'", str6, "faculty");
    }

    @Test
    public void test0882() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0882");
        com.reservation_system.model.Researcher researcher5 = new com.reservation_system.model.Researcher(102, "headlabcoordinator", "student", "Guest", true);
    }

    @Test
    public void test0883() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0883");
        com.reservation_system.model.Researcher researcher5 = new com.reservation_system.model.Researcher((int) 'a', "", "labmanager", "demo/data/test-users.csv", true);
        researcher5.setApproved(false);
        researcher5.setApproved(false);
    }

    @Test
    public void test0884() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0884");
        com.reservation_system.model.Student student5 = new com.reservation_system.model.Student((int) 'a', "Faculty", "Faculty", "alice@example.com", true);
        int int6 = student5.getID();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 97 + "'", int6 == 97);
    }

    @Test
    public void test0885() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0885");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("demo/data/test-users.csv");
        java.util.List<com.reservation_system.model.User> userList2 = userRepository1.getAllUsers();
        int int3 = userRepository1.getNextID();
        boolean boolean5 = userRepository1.emailExists("headlabcoordinator");
        boolean boolean6 = userRepository1.headLabCoordinatorExists();
        boolean boolean8 = userRepository1.emailExists("faculty");
        com.reservation_system.model.User user15 = com.reservation_system.patterns.factory.UserFactory.createUser("Faculty", 1, "Faculty", "Guest", "", false);
        userRepository1.addUser(user15);
        org.junit.Assert.assertNotNull(userList2);
// flaky "44) test0885(com.reservation_system.randoop.userrepository.RegressionTest1)":         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 102 + "'", int3 == 102);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(user15);
    }

    @Test
    public void test0886() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0886");
        com.reservation_system.model.User user6 = com.reservation_system.patterns.factory.UserFactory.createUser("headlabcoordinator", 101, "Guest", "Guest", "guest", true);
        org.junit.Assert.assertNotNull(user6);
    }

    @Test
    public void test0887() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0887");
        com.reservation_system.model.Faculty faculty5 = new com.reservation_system.model.Faculty(97, "student", "guest", "alice@example.com", true);
    }

    @Test
    public void test0888() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0888");
        com.reservation_system.model.HeadLabCoordinator headLabCoordinator5 = new com.reservation_system.model.HeadLabCoordinator(0, "faculty", "Student", "labmanager", false);
    }

    @Test
    public void test0889() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0889");
        com.reservation_system.model.Guest guest5 = new com.reservation_system.model.Guest((int) (short) 0, "Password1!", "demo/data/test-users.csv", "student", false);
        guest5.setApproved(true);
    }

    @Test
    public void test0890() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0890");
        com.reservation_system.model.LabManager labManager5 = new com.reservation_system.model.LabManager(102, "student", "faculty", "Alice", false);
        java.lang.String str6 = labManager5.getUserType();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "labmanager" + "'", str6, "labmanager");
    }

    @Test
    public void test0891() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0891");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("demo/data/test-users.csv");
        java.util.List<com.reservation_system.model.User> userList2 = userRepository1.getAllUsers();
        int int3 = userRepository1.getNextID();
        boolean boolean5 = userRepository1.emailExists("headlabcoordinator");
        boolean boolean6 = userRepository1.headLabCoordinatorExists();
        java.util.Optional<com.reservation_system.model.User> userOptional8 = userRepository1.findByEmail("Alice");
        boolean boolean10 = userRepository1.emailExists("guest");
        java.util.Optional<com.reservation_system.model.User> userOptional12 = userRepository1.findByEmail("");
        boolean boolean13 = userRepository1.headLabCoordinatorExists();
        org.junit.Assert.assertNotNull(userList2);
// flaky "45) test0891(com.reservation_system.randoop.userrepository.RegressionTest1)":         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 102 + "'", int3 == 102);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(userOptional8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(userOptional12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test0892() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0892");
        com.reservation_system.model.Researcher researcher5 = new com.reservation_system.model.Researcher((int) ' ', "researcher", "student", "Password1!", true);
    }

    @Test
    public void test0893() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0893");
        com.reservation_system.model.Faculty faculty5 = new com.reservation_system.model.Faculty(100, "", "guest", "headlabcoordinator", true);
    }

    @Test
    public void test0894() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0894");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("demo/data/test-users.csv");
        java.util.Optional<com.reservation_system.model.User> userOptional3 = userRepository1.findByEmail("hi!");
        boolean boolean4 = userRepository1.headLabCoordinatorExists();
        java.util.Optional<com.reservation_system.model.User> userOptional6 = userRepository1.findByEmail("");
        com.reservation_system.model.Researcher researcher12 = new com.reservation_system.model.Researcher(0, "", "Password1!", "researcher", false);
        researcher12.setApproved(true);
        int int15 = researcher12.getID();
        boolean boolean16 = researcher12.isApproved();
        userRepository1.addUser((com.reservation_system.model.User) researcher12);
        boolean boolean18 = researcher12.requiresDepartmentApproval();
        org.junit.Assert.assertNotNull(userOptional3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(userOptional6);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
    }

    @Test
    public void test0895() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0895");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("demo/data/test-users.csv");
        int int2 = userRepository1.getNextID();
        com.reservation_system.repository.UserRepository userRepository4 = new com.reservation_system.repository.UserRepository("demo/data/test-users.csv");
        com.reservation_system.model.Researcher researcher10 = new com.reservation_system.model.Researcher(5, "hi!", "labmanager", "Guest", false);
        userRepository4.addUser((com.reservation_system.model.User) researcher10);
        java.util.List<com.reservation_system.model.User> userList12 = userRepository4.getAllUsers();
        com.reservation_system.model.Guest guest18 = new com.reservation_system.model.Guest(0, "Password1!", "demo/data/test-users.csv", "researcher", false);
        boolean boolean19 = guest18.requiresDepartmentApproval();
        userRepository4.addUser((com.reservation_system.model.User) guest18);
        boolean boolean22 = userRepository4.emailExists("Alice");
        int int23 = userRepository4.getNextID();
        com.reservation_system.repository.UserRepository userRepository25 = new com.reservation_system.repository.UserRepository("demo/data/test-users.csv");
        boolean boolean27 = userRepository25.emailExists("Alice");
        com.reservation_system.repository.UserRepository userRepository29 = new com.reservation_system.repository.UserRepository("demo/data/test-users.csv");
        java.util.List<com.reservation_system.model.User> userList30 = userRepository29.getAllUsers();
        int int31 = userRepository29.getNextID();
        java.util.List<com.reservation_system.model.User> userList32 = userRepository29.getAllUsers();
        userRepository25.saveAllUsers(userList32);
        userRepository4.saveAllUsers(userList32);
        userRepository1.saveAllUsers(userList32);
        java.util.List<com.reservation_system.model.User> userList36 = userRepository1.getAllUsers();
        java.util.List<com.reservation_system.model.User> userList37 = userRepository1.getAllUsers();
        java.util.Optional<com.reservation_system.model.User> userOptional39 = userRepository1.findByEmail("Researcher");
// flaky "46) test0895(com.reservation_system.randoop.userrepository.RegressionTest1)":         org.junit.Assert.assertTrue("'" + int2 + "' != '" + 102 + "'", int2 == 102);
        org.junit.Assert.assertNotNull(userList12);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
// flaky "26) test0895(com.reservation_system.randoop.userrepository.RegressionTest1)":         org.junit.Assert.assertTrue("'" + int23 + "' != '" + 102 + "'", int23 == 102);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(userList30);
// flaky "19) test0895(com.reservation_system.randoop.userrepository.RegressionTest1)":         org.junit.Assert.assertTrue("'" + int31 + "' != '" + 102 + "'", int31 == 102);
        org.junit.Assert.assertNotNull(userList32);
        org.junit.Assert.assertNotNull(userList36);
        org.junit.Assert.assertNotNull(userList37);
        org.junit.Assert.assertNotNull(userOptional39);
    }

    @Test
    public void test0896() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0896");
        com.reservation_system.model.Researcher researcher5 = new com.reservation_system.model.Researcher((int) (short) -1, "labmanager", "faculty", "headlabcoordinator", true);
        int int6 = researcher5.getID();
        java.lang.String str7 = researcher5.getUserType();
        java.lang.String str8 = researcher5.getUserType();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Researcher" + "'", str7, "Researcher");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Researcher" + "'", str8, "Researcher");
    }

    @Test
    public void test0897() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0897");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("demo/data/test-users.csv");
        com.reservation_system.model.Researcher researcher7 = new com.reservation_system.model.Researcher(5, "hi!", "labmanager", "Guest", false);
        userRepository1.addUser((com.reservation_system.model.User) researcher7);
        java.util.List<com.reservation_system.model.User> userList9 = userRepository1.getAllUsers();
        com.reservation_system.repository.UserRepository userRepository11 = new com.reservation_system.repository.UserRepository("demo/data/test-users.csv");
        com.reservation_system.model.Researcher researcher17 = new com.reservation_system.model.Researcher(5, "hi!", "labmanager", "Guest", false);
        userRepository11.addUser((com.reservation_system.model.User) researcher17);
        java.util.Optional<com.reservation_system.model.User> userOptional20 = userRepository11.findByEmail("alice@example.com");
        java.util.List<com.reservation_system.model.User> userList21 = userRepository11.getAllUsers();
        userRepository1.saveAllUsers(userList21);
        com.reservation_system.model.Student student28 = new com.reservation_system.model.Student((int) (short) 100, "guest", "Guest", "faculty", false);
        userRepository1.addUser((com.reservation_system.model.User) student28);
        java.lang.String str30 = student28.getUserType();
        org.junit.Assert.assertNotNull(userList9);
        org.junit.Assert.assertNotNull(userOptional20);
        org.junit.Assert.assertNotNull(userList21);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "Student" + "'", str30, "Student");
    }

    @Test
    public void test0898() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0898");
        com.reservation_system.model.Student student5 = new com.reservation_system.model.Student(52, "Guest", "hi!", "labmanager", true);
    }

    @Test
    public void test0899() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0899");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("demo/data/test-users.csv");
        com.reservation_system.model.Researcher researcher7 = new com.reservation_system.model.Researcher(5, "hi!", "labmanager", "Guest", false);
        userRepository1.addUser((com.reservation_system.model.User) researcher7);
        java.util.List<com.reservation_system.model.User> userList9 = userRepository1.getAllUsers();
        com.reservation_system.model.Guest guest15 = new com.reservation_system.model.Guest(0, "Password1!", "demo/data/test-users.csv", "researcher", false);
        boolean boolean16 = guest15.requiresDepartmentApproval();
        userRepository1.addUser((com.reservation_system.model.User) guest15);
        boolean boolean19 = userRepository1.emailExists("Alice");
        java.util.Optional<com.reservation_system.model.User> userOptional21 = userRepository1.findByEmail("hi!");
        int int22 = userRepository1.getNextID();
        com.reservation_system.repository.UserRepository userRepository24 = new com.reservation_system.repository.UserRepository("demo/data/test-users.csv");
        com.reservation_system.model.Researcher researcher30 = new com.reservation_system.model.Researcher(5, "hi!", "labmanager", "Guest", false);
        userRepository24.addUser((com.reservation_system.model.User) researcher30);
        int int32 = userRepository24.getNextID();
        com.reservation_system.repository.UserRepository userRepository34 = new com.reservation_system.repository.UserRepository("demo/data/test-users.csv");
        int int35 = userRepository34.getNextID();
        boolean boolean36 = userRepository34.headLabCoordinatorExists();
        com.reservation_system.model.Guest guest42 = new com.reservation_system.model.Guest((int) (byte) -1, "hi!", "", "Password1!", false);
        userRepository34.addUser((com.reservation_system.model.User) guest42);
        int int44 = userRepository34.getNextID();
        boolean boolean46 = userRepository34.emailExists("headlabcoordinator");
        java.util.List<com.reservation_system.model.User> userList47 = userRepository34.getAllUsers();
        userRepository24.saveAllUsers(userList47);
        userRepository1.saveAllUsers(userList47);
        com.reservation_system.repository.UserRepository userRepository51 = new com.reservation_system.repository.UserRepository("demo/data/test-users.csv");
        boolean boolean53 = userRepository51.emailExists("Password1!");
        com.reservation_system.model.Faculty faculty59 = new com.reservation_system.model.Faculty((-1), "headlabcoordinator", "Student", "", false);
        userRepository51.addUser((com.reservation_system.model.User) faculty59);
        faculty59.setApproved(true);
        java.lang.String str63 = faculty59.getUserType();
        userRepository1.addUser((com.reservation_system.model.User) faculty59);
        com.reservation_system.repository.UserRepository userRepository66 = new com.reservation_system.repository.UserRepository("demo/data/test-users.csv");
        com.reservation_system.model.Researcher researcher72 = new com.reservation_system.model.Researcher(5, "hi!", "labmanager", "Guest", false);
        userRepository66.addUser((com.reservation_system.model.User) researcher72);
        java.util.Optional<com.reservation_system.model.User> userOptional75 = userRepository66.findByEmail("alice@example.com");
        java.util.List<com.reservation_system.model.User> userList76 = userRepository66.getAllUsers();
        com.reservation_system.repository.UserRepository userRepository78 = new com.reservation_system.repository.UserRepository("demo/data/test-users.csv");
        int int79 = userRepository78.getNextID();
        int int80 = userRepository78.getNextID();
        com.reservation_system.model.HeadLabCoordinator headLabCoordinator86 = new com.reservation_system.model.HeadLabCoordinator((int) (byte) 1, "", "", "guest", false);
        userRepository78.addUser((com.reservation_system.model.User) headLabCoordinator86);
        java.util.List<com.reservation_system.model.User> userList88 = userRepository78.getAllUsers();
        userRepository66.saveAllUsers(userList88);
        userRepository1.saveAllUsers(userList88);
        org.junit.Assert.assertNotNull(userList9);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(userOptional21);
// flaky "47) test0899(com.reservation_system.randoop.userrepository.RegressionTest1)":         org.junit.Assert.assertTrue("'" + int22 + "' != '" + 102 + "'", int22 == 102);
// flaky "27) test0899(com.reservation_system.randoop.userrepository.RegressionTest1)":         org.junit.Assert.assertTrue("'" + int32 + "' != '" + 102 + "'", int32 == 102);
// flaky "20) test0899(com.reservation_system.randoop.userrepository.RegressionTest1)":         org.junit.Assert.assertTrue("'" + int35 + "' != '" + 102 + "'", int35 == 102);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
// flaky "10) test0899(com.reservation_system.randoop.userrepository.RegressionTest1)":         org.junit.Assert.assertTrue("'" + int44 + "' != '" + 102 + "'", int44 == 102);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertNotNull(userList47);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + true + "'", boolean53 == true);
        org.junit.Assert.assertEquals("'" + str63 + "' != '" + "Faculty" + "'", str63, "Faculty");
        org.junit.Assert.assertNotNull(userOptional75);
        org.junit.Assert.assertNotNull(userList76);
// flaky "7) test0899(com.reservation_system.randoop.userrepository.RegressionTest1)":         org.junit.Assert.assertTrue("'" + int79 + "' != '" + 102 + "'", int79 == 102);
// flaky "3) test0899(com.reservation_system.randoop.userrepository.RegressionTest1)":         org.junit.Assert.assertTrue("'" + int80 + "' != '" + 102 + "'", int80 == 102);
        org.junit.Assert.assertNotNull(userList88);
    }

    @Test
    public void test0900() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0900");
        com.reservation_system.model.Student student5 = new com.reservation_system.model.Student(1, "demo/data/test-users.csv", "alice@example.com", "guest", false);
        java.lang.String str6 = student5.getUserType();
        java.lang.String str7 = student5.getUserType();
        java.lang.String str8 = student5.getName();
        java.lang.String str9 = student5.getPassword();
        java.lang.String str10 = student5.getUserType();
        int int11 = student5.getID();
        java.lang.String str12 = student5.getUserType();
        java.lang.String str13 = student5.getUserType();
        java.lang.String str14 = student5.getUserType();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Student" + "'", str6, "Student");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Student" + "'", str7, "Student");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "demo/data/test-users.csv" + "'", str8, "demo/data/test-users.csv");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "guest" + "'", str9, "guest");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Student" + "'", str10, "Student");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Student" + "'", str12, "Student");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Student" + "'", str13, "Student");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Student" + "'", str14, "Student");
    }

    @Test
    public void test0901() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0901");
        com.reservation_system.model.HeadLabCoordinator headLabCoordinator5 = new com.reservation_system.model.HeadLabCoordinator((int) (short) -1, "demo/data/test-users.csv", "guest", "labmanager", true);
        boolean boolean6 = headLabCoordinator5.isApproved();
        java.lang.String str7 = headLabCoordinator5.getUserType();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "headlabcoordinator" + "'", str7, "headlabcoordinator");
    }

    @Test
    public void test0902() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0902");
        com.reservation_system.model.Guest guest5 = new com.reservation_system.model.Guest(5, "guest", "Faculty", "faculty", false);
    }

    @Test
    public void test0903() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0903");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("demo/data/test-users.csv");
        boolean boolean3 = userRepository1.emailExists("Alice");
        com.reservation_system.model.Researcher researcher9 = new com.reservation_system.model.Researcher((int) 'a', "labmanager", "faculty", "", false);
        boolean boolean10 = researcher9.isApproved();
        java.lang.String str11 = researcher9.getName();
        userRepository1.addUser((com.reservation_system.model.User) researcher9);
        boolean boolean13 = researcher9.requiresDepartmentApproval();
        java.lang.String str14 = researcher9.getPassword();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "labmanager" + "'", str11, "labmanager");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
    }

    @Test
    public void test0904() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0904");
        com.reservation_system.model.Faculty faculty5 = new com.reservation_system.model.Faculty((int) 'a', "student", "Guest", "alice@example.com", false);
        java.lang.String str6 = faculty5.getUserType();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Faculty" + "'", str6, "Faculty");
    }

    @Test
    public void test0905() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0905");
        com.reservation_system.model.LabManager labManager5 = new com.reservation_system.model.LabManager(1, "student", "demo/data/test-users.csv", "hi!", false);
        java.lang.String str6 = labManager5.getUserType();
        int int7 = labManager5.getID();
        java.lang.String str8 = labManager5.getUserType();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "labmanager" + "'", str6, "labmanager");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "labmanager" + "'", str8, "labmanager");
    }

    @Test
    public void test0906() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0906");
        // The following exception was thrown during execution in test generation
        try {
            com.reservation_system.model.User user6 = com.reservation_system.patterns.factory.UserFactory.createUser("hi!", 5, "Faculty", "faculty", "headlabcoordinator", false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid user type: hi!");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0907() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0907");
        com.reservation_system.model.Student student5 = new com.reservation_system.model.Student(10, "Researcher", "headlabcoordinator", "Researcher", true);
    }

    @Test
    public void test0908() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0908");
        com.reservation_system.model.HeadLabCoordinator headLabCoordinator5 = new com.reservation_system.model.HeadLabCoordinator((int) (short) 10, "", "faculty", "headlabcoordinator", false);
    }

    @Test
    public void test0909() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0909");
        com.reservation_system.model.Student student5 = new com.reservation_system.model.Student(98, "Password1!", "Password1!", "student", false);
        java.lang.String str6 = student5.getPassword();
        java.lang.String str7 = student5.getPassword();
        java.lang.String str8 = student5.getUserType();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "student" + "'", str6, "student");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "student" + "'", str7, "student");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Student" + "'", str8, "Student");
    }

    @Test
    public void test0910() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0910");
        com.reservation_system.model.Researcher researcher5 = new com.reservation_system.model.Researcher(0, "", "Password1!", "researcher", false);
        researcher5.setApproved(true);
        int int8 = researcher5.getID();
        java.lang.String str9 = researcher5.getUserType();
        java.lang.String str10 = researcher5.getPassword();
        java.lang.String str11 = researcher5.getPassword();
        java.lang.Class<?> wildcardClass12 = researcher5.getClass();
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Researcher" + "'", str9, "Researcher");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "researcher" + "'", str10, "researcher");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "researcher" + "'", str11, "researcher");
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0911() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0911");
        com.reservation_system.model.Student student5 = new com.reservation_system.model.Student((int) ' ', "Student", "Password1!", "Guest", false);
        java.lang.String str6 = student5.getEmail();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Password1!" + "'", str6, "Password1!");
    }

    @Test
    public void test0912() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0912");
        com.reservation_system.model.Guest guest5 = new com.reservation_system.model.Guest(6, "faculty", "", "Guest", false);
    }

    @Test
    public void test0913() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0913");
        com.reservation_system.model.HeadLabCoordinator headLabCoordinator5 = new com.reservation_system.model.HeadLabCoordinator(5, "faculty", "faculty", "hi!", true);
        java.lang.String str6 = headLabCoordinator5.getUserType();
        java.lang.String str7 = headLabCoordinator5.getUserType();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "headlabcoordinator" + "'", str6, "headlabcoordinator");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "headlabcoordinator" + "'", str7, "headlabcoordinator");
    }

    @Test
    public void test0914() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0914");
        com.reservation_system.model.Student student5 = new com.reservation_system.model.Student(98, "Password1!", "Password1!", "student", false);
        java.lang.String str6 = student5.getUserType();
        java.lang.String str7 = student5.getEmail();
        boolean boolean8 = student5.requiresDepartmentApproval();
        java.lang.String str9 = student5.getPassword();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Student" + "'", str6, "Student");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Password1!" + "'", str7, "Password1!");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "student" + "'", str9, "student");
    }

    @Test
    public void test0915() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0915");
        com.reservation_system.model.Student student5 = new com.reservation_system.model.Student(5, "Faculty", "Student", "demo/data/test-users.csv", false);
    }

    @Test
    public void test0916() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0916");
        com.reservation_system.model.Researcher researcher5 = new com.reservation_system.model.Researcher(35, "Faculty", "researcher", "Faculty", true);
        java.lang.String str6 = researcher5.getUserType();
        java.lang.String str7 = researcher5.getUserType();
        java.lang.String str8 = researcher5.getUserType();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Researcher" + "'", str6, "Researcher");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Researcher" + "'", str7, "Researcher");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Researcher" + "'", str8, "Researcher");
    }

    @Test
    public void test0917() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0917");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("demo/data/test-users.csv");
        java.util.List<com.reservation_system.model.User> userList2 = userRepository1.getAllUsers();
        int int3 = userRepository1.getNextID();
        boolean boolean5 = userRepository1.emailExists("headlabcoordinator");
        boolean boolean6 = userRepository1.headLabCoordinatorExists();
        java.util.Optional<com.reservation_system.model.User> userOptional8 = userRepository1.findByEmail("Alice");
        boolean boolean10 = userRepository1.emailExists("");
        java.util.Optional<com.reservation_system.model.User> userOptional12 = userRepository1.findByEmail("student");
        int int13 = userRepository1.getNextID();
        org.junit.Assert.assertNotNull(userList2);
// flaky "48) test0917(com.reservation_system.randoop.userrepository.RegressionTest1)":         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 102 + "'", int3 == 102);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(userOptional8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(userOptional12);
// flaky "28) test0917(com.reservation_system.randoop.userrepository.RegressionTest1)":         org.junit.Assert.assertTrue("'" + int13 + "' != '" + 102 + "'", int13 == 102);
    }

    @Test
    public void test0918() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0918");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("demo/data/test-users.csv");
        com.reservation_system.model.Researcher researcher7 = new com.reservation_system.model.Researcher(5, "hi!", "labmanager", "Guest", false);
        userRepository1.addUser((com.reservation_system.model.User) researcher7);
        int int9 = userRepository1.getNextID();
        com.reservation_system.repository.UserRepository userRepository11 = new com.reservation_system.repository.UserRepository("demo/data/test-users.csv");
        com.reservation_system.model.Researcher researcher17 = new com.reservation_system.model.Researcher(5, "hi!", "labmanager", "Guest", false);
        userRepository11.addUser((com.reservation_system.model.User) researcher17);
        java.util.List<com.reservation_system.model.User> userList19 = userRepository11.getAllUsers();
        boolean boolean20 = userRepository11.headLabCoordinatorExists();
        boolean boolean22 = userRepository11.emailExists("guest");
        com.reservation_system.repository.UserRepository userRepository24 = new com.reservation_system.repository.UserRepository("demo/data/test-users.csv");
        boolean boolean26 = userRepository24.emailExists("Alice");
        com.reservation_system.repository.UserRepository userRepository28 = new com.reservation_system.repository.UserRepository("demo/data/test-users.csv");
        java.util.List<com.reservation_system.model.User> userList29 = userRepository28.getAllUsers();
        int int30 = userRepository28.getNextID();
        java.util.List<com.reservation_system.model.User> userList31 = userRepository28.getAllUsers();
        userRepository24.saveAllUsers(userList31);
        userRepository11.saveAllUsers(userList31);
        java.util.List<com.reservation_system.model.User> userList34 = userRepository11.getAllUsers();
        userRepository1.saveAllUsers(userList34);
        java.util.Optional<com.reservation_system.model.User> userOptional37 = userRepository1.findByEmail("hi!");
        com.reservation_system.model.HeadLabCoordinator headLabCoordinator43 = new com.reservation_system.model.HeadLabCoordinator((int) (byte) -1, "demo/data/test-users.csv", "alice@example.com", "student", true);
        java.lang.String str44 = headLabCoordinator43.getEmail();
        java.lang.String str45 = headLabCoordinator43.getUserType();
        userRepository1.addUser((com.reservation_system.model.User) headLabCoordinator43);
// flaky "49) test0918(com.reservation_system.randoop.userrepository.RegressionTest1)":         org.junit.Assert.assertTrue("'" + int9 + "' != '" + 102 + "'", int9 == 102);
        org.junit.Assert.assertNotNull(userList19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(userList29);
// flaky "29) test0918(com.reservation_system.randoop.userrepository.RegressionTest1)":         org.junit.Assert.assertTrue("'" + int30 + "' != '" + 102 + "'", int30 == 102);
        org.junit.Assert.assertNotNull(userList31);
        org.junit.Assert.assertNotNull(userList34);
        org.junit.Assert.assertNotNull(userOptional37);
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + "headlabcoordinator" + "'", str45, "headlabcoordinator");
    }

    @Test
    public void test0919() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0919");
        com.reservation_system.model.LabManager labManager5 = new com.reservation_system.model.LabManager((int) (short) 100, "Alice", "guest", "hi!", true);
    }

    @Test
    public void test0920() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0920");
        com.reservation_system.model.Student student5 = new com.reservation_system.model.Student((int) (byte) 0, "alice@example.com", "Alice", "student", false);
    }

    @Test
    public void test0921() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0921");
        com.reservation_system.model.Faculty faculty5 = new com.reservation_system.model.Faculty((int) (byte) 10, "demo/data/test-users.csv", "hi!", "Researcher", true);
    }

    @Test
    public void test0922() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0922");
        com.reservation_system.model.HeadLabCoordinator headLabCoordinator5 = new com.reservation_system.model.HeadLabCoordinator((int) '#', "demo/data/test-users.csv", "", "guest", true);
    }

    @Test
    public void test0923() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0923");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("demo/data/test-users.csv");
        java.util.List<com.reservation_system.model.User> userList2 = userRepository1.getAllUsers();
        int int3 = userRepository1.getNextID();
        boolean boolean5 = userRepository1.emailExists("headlabcoordinator");
        boolean boolean7 = userRepository1.emailExists("Faculty");
        boolean boolean9 = userRepository1.emailExists("");
        com.reservation_system.model.LabManager labManager15 = new com.reservation_system.model.LabManager(101, "Faculty", "alice@example.com", "alice@example.com", true);
        userRepository1.addUser((com.reservation_system.model.User) labManager15);
        java.util.Optional<com.reservation_system.model.User> userOptional18 = userRepository1.findByEmail("Password1!");
        org.junit.Assert.assertNotNull(userList2);
// flaky "50) test0923(com.reservation_system.randoop.userrepository.RegressionTest1)":         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 102 + "'", int3 == 102);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(userOptional18);
    }

    @Test
    public void test0924() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0924");
        com.reservation_system.model.Student student5 = new com.reservation_system.model.Student(0, "Guest", "Password1!", "demo/data/test-users.csv", true);
        java.lang.String str6 = student5.getPassword();
        int int7 = student5.getID();
        java.lang.String str8 = student5.getEmail();
        java.lang.String str9 = student5.getUserType();
        int int10 = student5.getID();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "demo/data/test-users.csv" + "'", str6, "demo/data/test-users.csv");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Password1!" + "'", str8, "Password1!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Student" + "'", str9, "Student");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test0925() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0925");
        com.reservation_system.model.HeadLabCoordinator headLabCoordinator5 = new com.reservation_system.model.HeadLabCoordinator(0, "Guest", "Faculty", "guest", false);
        java.lang.String str6 = headLabCoordinator5.getUserType();
        java.lang.String str7 = headLabCoordinator5.getName();
        java.lang.String str8 = headLabCoordinator5.getEmail();
        headLabCoordinator5.setApproved(true);
        java.lang.String str11 = headLabCoordinator5.getUserType();
        java.lang.String str12 = headLabCoordinator5.getUserType();
        java.lang.String str13 = headLabCoordinator5.getUserType();
        java.lang.String str14 = headLabCoordinator5.getUserType();
        int int15 = headLabCoordinator5.getID();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "headlabcoordinator" + "'", str6, "headlabcoordinator");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Guest" + "'", str7, "Guest");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Faculty" + "'", str8, "Faculty");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "headlabcoordinator" + "'", str11, "headlabcoordinator");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "headlabcoordinator" + "'", str12, "headlabcoordinator");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "headlabcoordinator" + "'", str13, "headlabcoordinator");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "headlabcoordinator" + "'", str14, "headlabcoordinator");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
    }

    @Test
    public void test0926() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0926");
        com.reservation_system.model.Researcher researcher5 = new com.reservation_system.model.Researcher(1, "Student", "guest", "researcher", true);
        java.lang.String str6 = researcher5.getEmail();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "guest" + "'", str6, "guest");
    }

    @Test
    public void test0927() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0927");
        com.reservation_system.model.Guest guest5 = new com.reservation_system.model.Guest((int) (byte) 100, "Student", "Guest", "demo/data/test-users.csv", false);
        java.lang.String str6 = guest5.getUserType();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Guest" + "'", str6, "Guest");
    }

    @Test
    public void test0928() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0928");
        com.reservation_system.model.Faculty faculty5 = new com.reservation_system.model.Faculty(97, "", "labmanager", "Faculty", false);
    }

    @Test
    public void test0929() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0929");
        com.reservation_system.model.Guest guest5 = new com.reservation_system.model.Guest(0, "Password1!", "demo/data/test-users.csv", "researcher", false);
        guest5.setApproved(false);
        int int8 = guest5.getID();
        java.lang.String str9 = guest5.getPassword();
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "researcher" + "'", str9, "researcher");
    }

    @Test
    public void test0930() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0930");
        com.reservation_system.model.LabManager labManager5 = new com.reservation_system.model.LabManager((int) (byte) 1, "faculty", "Alice", "labmanager", false);
    }

    @Test
    public void test0931() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0931");
        com.reservation_system.model.HeadLabCoordinator headLabCoordinator5 = new com.reservation_system.model.HeadLabCoordinator((int) (byte) 10, "", "Alice", "guest", true);
        java.lang.String str6 = headLabCoordinator5.getUserType();
        java.lang.String str7 = headLabCoordinator5.getUserType();
        java.lang.String str8 = headLabCoordinator5.getUserType();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "headlabcoordinator" + "'", str6, "headlabcoordinator");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "headlabcoordinator" + "'", str7, "headlabcoordinator");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "headlabcoordinator" + "'", str8, "headlabcoordinator");
    }

    @Test
    public void test0932() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0932");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("demo/data/test-users.csv");
        com.reservation_system.model.Researcher researcher7 = new com.reservation_system.model.Researcher(5, "hi!", "labmanager", "Guest", false);
        userRepository1.addUser((com.reservation_system.model.User) researcher7);
        java.util.List<com.reservation_system.model.User> userList9 = userRepository1.getAllUsers();
        com.reservation_system.model.Guest guest15 = new com.reservation_system.model.Guest(0, "Password1!", "demo/data/test-users.csv", "researcher", false);
        boolean boolean16 = guest15.requiresDepartmentApproval();
        userRepository1.addUser((com.reservation_system.model.User) guest15);
        boolean boolean19 = userRepository1.emailExists("Alice");
        int int20 = userRepository1.getNextID();
        com.reservation_system.repository.UserRepository userRepository22 = new com.reservation_system.repository.UserRepository("demo/data/test-users.csv");
        java.util.List<com.reservation_system.model.User> userList23 = userRepository22.getAllUsers();
        userRepository1.saveAllUsers(userList23);
        java.util.Optional<com.reservation_system.model.User> userOptional26 = userRepository1.findByEmail("Password1!");
        boolean boolean28 = userRepository1.emailExists("");
        org.junit.Assert.assertNotNull(userList9);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 102 + "'", int20 == 102);
        org.junit.Assert.assertNotNull(userList23);
        org.junit.Assert.assertNotNull(userOptional26);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
    }

    @Test
    public void test0933() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0933");
        com.reservation_system.model.HeadLabCoordinator headLabCoordinator5 = new com.reservation_system.model.HeadLabCoordinator((int) (short) 100, "alice@example.com", "Guest", "labmanager", true);
        java.lang.String str6 = headLabCoordinator5.getUserType();
        java.lang.String str7 = headLabCoordinator5.getName();
        boolean boolean8 = headLabCoordinator5.isApproved();
        boolean boolean9 = headLabCoordinator5.isApproved();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "headlabcoordinator" + "'", str6, "headlabcoordinator");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test0934() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0934");
        com.reservation_system.model.Guest guest5 = new com.reservation_system.model.Guest((int) (byte) -1, "", "headlabcoordinator", "", false);
    }

    @Test
    public void test0935() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0935");
        com.reservation_system.model.Researcher researcher5 = new com.reservation_system.model.Researcher(35, "labmanager", "researcher", "student", true);
    }

    @Test
    public void test0936() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0936");
        com.reservation_system.model.Guest guest5 = new com.reservation_system.model.Guest((int) (byte) 10, "Alice", "student", "guest", false);
        int int6 = guest5.getID();
        java.lang.String str7 = guest5.getPassword();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "guest" + "'", str7, "guest");
    }

    @Test
    public void test0937() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0937");
        com.reservation_system.model.HeadLabCoordinator headLabCoordinator5 = new com.reservation_system.model.HeadLabCoordinator(5, "Faculty", "", "Alice", false);
        java.lang.String str6 = headLabCoordinator5.getUserType();
        java.lang.String str7 = headLabCoordinator5.getUserType();
        headLabCoordinator5.setApproved(false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "headlabcoordinator" + "'", str6, "headlabcoordinator");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "headlabcoordinator" + "'", str7, "headlabcoordinator");
    }

    @Test
    public void test0938() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0938");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("demo/data/test-users.csv");
        com.reservation_system.model.Researcher researcher7 = new com.reservation_system.model.Researcher(5, "hi!", "labmanager", "Guest", false);
        userRepository1.addUser((com.reservation_system.model.User) researcher7);
        java.util.List<com.reservation_system.model.User> userList9 = userRepository1.getAllUsers();
        com.reservation_system.repository.UserRepository userRepository11 = new com.reservation_system.repository.UserRepository("demo/data/test-users.csv");
        com.reservation_system.model.Researcher researcher17 = new com.reservation_system.model.Researcher(5, "hi!", "labmanager", "Guest", false);
        userRepository11.addUser((com.reservation_system.model.User) researcher17);
        java.util.Optional<com.reservation_system.model.User> userOptional20 = userRepository11.findByEmail("alice@example.com");
        java.util.List<com.reservation_system.model.User> userList21 = userRepository11.getAllUsers();
        userRepository1.saveAllUsers(userList21);
        com.reservation_system.model.HeadLabCoordinator headLabCoordinator28 = new com.reservation_system.model.HeadLabCoordinator(0, "Guest", "Faculty", "guest", false);
        java.lang.String str29 = headLabCoordinator28.getUserType();
        java.lang.String str30 = headLabCoordinator28.getName();
        java.lang.String str31 = headLabCoordinator28.getEmail();
        headLabCoordinator28.setApproved(true);
        userRepository1.addUser((com.reservation_system.model.User) headLabCoordinator28);
        boolean boolean36 = userRepository1.emailExists("researcher");
        java.util.Optional<com.reservation_system.model.User> userOptional38 = userRepository1.findByEmail("headlabcoordinator");
        com.reservation_system.repository.UserRepository userRepository40 = new com.reservation_system.repository.UserRepository("demo/data/test-users.csv");
        com.reservation_system.model.Researcher researcher46 = new com.reservation_system.model.Researcher(5, "hi!", "labmanager", "Guest", false);
        userRepository40.addUser((com.reservation_system.model.User) researcher46);
        boolean boolean49 = userRepository40.emailExists("labmanager");
        com.reservation_system.model.Researcher researcher55 = new com.reservation_system.model.Researcher((int) 'a', "labmanager", "faculty", "", false);
        boolean boolean56 = researcher55.requiresDepartmentApproval();
        java.lang.String str57 = researcher55.getUserType();
        userRepository40.addUser((com.reservation_system.model.User) researcher55);
        boolean boolean59 = researcher55.requiresDepartmentApproval();
        userRepository1.addUser((com.reservation_system.model.User) researcher55);
        org.junit.Assert.assertNotNull(userList9);
        org.junit.Assert.assertNotNull(userOptional20);
        org.junit.Assert.assertNotNull(userList21);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "headlabcoordinator" + "'", str29, "headlabcoordinator");
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "Guest" + "'", str30, "Guest");
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "Faculty" + "'", str31, "Faculty");
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertNotNull(userOptional38);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + true + "'", boolean49 == true);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + true + "'", boolean56 == true);
        org.junit.Assert.assertEquals("'" + str57 + "' != '" + "Researcher" + "'", str57, "Researcher");
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + true + "'", boolean59 == true);
    }

    @Test
    public void test0939() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0939");
        com.reservation_system.model.LabManager labManager5 = new com.reservation_system.model.LabManager((int) '#', "researcher", "Guest", "headlabcoordinator", true);
        java.lang.String str6 = labManager5.getEmail();
        java.lang.String str7 = labManager5.getUserType();
        labManager5.setApproved(false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Guest" + "'", str6, "Guest");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "labmanager" + "'", str7, "labmanager");
    }

    @Test
    public void test0940() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0940");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("demo/data/test-users.csv");
        int int2 = userRepository1.getNextID();
        boolean boolean4 = userRepository1.emailExists("Alice");
        boolean boolean5 = userRepository1.headLabCoordinatorExists();
        java.util.Optional<com.reservation_system.model.User> userOptional7 = userRepository1.findByEmail("labmanager");
        java.util.List<com.reservation_system.model.User> userList8 = userRepository1.getAllUsers();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 102 + "'", int2 == 102);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(userOptional7);
        org.junit.Assert.assertNotNull(userList8);
    }

    @Test
    public void test0941() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0941");
        com.reservation_system.model.LabManager labManager5 = new com.reservation_system.model.LabManager(0, "Password1!", "headlabcoordinator", "alice@example.com", false);
        boolean boolean6 = labManager5.isApproved();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test0942() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0942");
        com.reservation_system.model.Guest guest5 = new com.reservation_system.model.Guest(0, "Password1!", "demo/data/test-users.csv", "researcher", false);
        guest5.setApproved(false);
        boolean boolean8 = guest5.requiresDepartmentApproval();
        java.lang.String str9 = guest5.getUserType();
        boolean boolean10 = guest5.isApproved();
        guest5.setApproved(true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Guest" + "'", str9, "Guest");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test0943() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0943");
        com.reservation_system.model.Guest guest5 = new com.reservation_system.model.Guest(52, "headlabcoordinator", "demo/data/test-users.csv", "faculty", false);
        java.lang.String str6 = guest5.getUserType();
        java.lang.String str7 = guest5.getName();
        java.lang.String str8 = guest5.getName();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Guest" + "'", str6, "Guest");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "headlabcoordinator" + "'", str7, "headlabcoordinator");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "headlabcoordinator" + "'", str8, "headlabcoordinator");
    }

    @Test
    public void test0944() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0944");
        com.reservation_system.model.LabManager labManager5 = new com.reservation_system.model.LabManager((int) (byte) 100, "alice@example.com", "Password1!", "", false);
        int int6 = labManager5.getID();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
    }

    @Test
    public void test0945() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0945");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("demo/data/test-users.csv");
        com.reservation_system.model.Researcher researcher7 = new com.reservation_system.model.Researcher(5, "hi!", "labmanager", "Guest", false);
        userRepository1.addUser((com.reservation_system.model.User) researcher7);
        boolean boolean10 = userRepository1.emailExists("labmanager");
        int int11 = userRepository1.getNextID();
        boolean boolean13 = userRepository1.emailExists("");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 102 + "'", int11 == 102);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test0946() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0946");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("demo/data/test-users.csv");
        java.util.List<com.reservation_system.model.User> userList2 = userRepository1.getAllUsers();
        com.reservation_system.model.Guest guest8 = new com.reservation_system.model.Guest(0, "Password1!", "demo/data/test-users.csv", "researcher", false);
        boolean boolean9 = guest8.requiresDepartmentApproval();
        java.lang.String str10 = guest8.getUserType();
        java.lang.String str11 = guest8.getUserType();
        guest8.setApproved(true);
        java.lang.String str14 = guest8.getUserType();
        userRepository1.addUser((com.reservation_system.model.User) guest8);
        com.reservation_system.repository.UserRepository userRepository17 = new com.reservation_system.repository.UserRepository("demo/data/test-users.csv");
        java.util.List<com.reservation_system.model.User> userList18 = userRepository17.getAllUsers();
        int int19 = userRepository17.getNextID();
        boolean boolean21 = userRepository17.emailExists("headlabcoordinator");
        boolean boolean22 = userRepository17.headLabCoordinatorExists();
        java.util.Optional<com.reservation_system.model.User> userOptional24 = userRepository17.findByEmail("Alice");
        boolean boolean26 = userRepository17.emailExists("Alice");
        boolean boolean28 = userRepository17.emailExists("Guest");
        boolean boolean30 = userRepository17.emailExists("headlabcoordinator");
        com.reservation_system.repository.UserRepository userRepository32 = new com.reservation_system.repository.UserRepository("demo/data/test-users.csv");
        boolean boolean34 = userRepository32.emailExists("Alice");
        com.reservation_system.model.Researcher researcher40 = new com.reservation_system.model.Researcher((int) 'a', "labmanager", "faculty", "", false);
        boolean boolean41 = researcher40.isApproved();
        java.lang.String str42 = researcher40.getName();
        userRepository32.addUser((com.reservation_system.model.User) researcher40);
        boolean boolean44 = userRepository32.headLabCoordinatorExists();
        java.util.List<com.reservation_system.model.User> userList45 = userRepository32.getAllUsers();
        userRepository17.saveAllUsers(userList45);
        userRepository1.saveAllUsers(userList45);
        java.util.List<com.reservation_system.model.User> userList48 = userRepository1.getAllUsers();
        int int49 = userRepository1.getNextID();
        boolean boolean51 = userRepository1.emailExists("researcher");
        org.junit.Assert.assertNotNull(userList2);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Guest" + "'", str10, "Guest");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Guest" + "'", str11, "Guest");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Guest" + "'", str14, "Guest");
        org.junit.Assert.assertNotNull(userList18);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 102 + "'", int19 == 102);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertNotNull(userOptional24);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "labmanager" + "'", str42, "labmanager");
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + true + "'", boolean44 == true);
        org.junit.Assert.assertNotNull(userList45);
        org.junit.Assert.assertNotNull(userList48);
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + 102 + "'", int49 == 102);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
    }

    @Test
    public void test0947() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0947");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("demo/data/test-users.csv");
        int int2 = userRepository1.getNextID();
        int int3 = userRepository1.getNextID();
        com.reservation_system.model.HeadLabCoordinator headLabCoordinator9 = new com.reservation_system.model.HeadLabCoordinator((int) (byte) 1, "", "", "guest", false);
        userRepository1.addUser((com.reservation_system.model.User) headLabCoordinator9);
        java.util.List<com.reservation_system.model.User> userList11 = userRepository1.getAllUsers();
        boolean boolean13 = userRepository1.emailExists("Faculty");
        boolean boolean15 = userRepository1.emailExists("Alice");
        java.util.List<com.reservation_system.model.User> userList16 = userRepository1.getAllUsers();
        java.util.Optional<com.reservation_system.model.User> userOptional18 = userRepository1.findByEmail("alice@example.com");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 102 + "'", int2 == 102);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 102 + "'", int3 == 102);
        org.junit.Assert.assertNotNull(userList11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(userList16);
        org.junit.Assert.assertNotNull(userOptional18);
    }

    @Test
    public void test0948() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0948");
        com.reservation_system.model.Faculty faculty5 = new com.reservation_system.model.Faculty((int) ' ', "hi!", "hi!", "", true);
    }

    @Test
    public void test0949() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0949");
        com.reservation_system.model.Student student5 = new com.reservation_system.model.Student((int) (byte) 0, "Researcher", "Student", "Guest", true);
        java.lang.String str6 = student5.getUserType();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Student" + "'", str6, "Student");
    }

    @Test
    public void test0950() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0950");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("demo/data/test-users.csv");
        boolean boolean3 = userRepository1.emailExists("Alice");
        com.reservation_system.model.Researcher researcher9 = new com.reservation_system.model.Researcher((int) 'a', "labmanager", "faculty", "", false);
        boolean boolean10 = researcher9.isApproved();
        java.lang.String str11 = researcher9.getName();
        userRepository1.addUser((com.reservation_system.model.User) researcher9);
        boolean boolean13 = userRepository1.headLabCoordinatorExists();
        java.util.Optional<com.reservation_system.model.User> userOptional15 = userRepository1.findByEmail("");
        com.reservation_system.repository.UserRepository userRepository17 = new com.reservation_system.repository.UserRepository("demo/data/test-users.csv");
        java.util.List<com.reservation_system.model.User> userList18 = userRepository17.getAllUsers();
        int int19 = userRepository17.getNextID();
        boolean boolean21 = userRepository17.emailExists("headlabcoordinator");
        boolean boolean22 = userRepository17.headLabCoordinatorExists();
        java.util.Optional<com.reservation_system.model.User> userOptional24 = userRepository17.findByEmail("Alice");
        boolean boolean26 = userRepository17.emailExists("Alice");
        boolean boolean28 = userRepository17.emailExists("Guest");
        boolean boolean30 = userRepository17.emailExists("headlabcoordinator");
        java.util.List<com.reservation_system.model.User> userList31 = userRepository17.getAllUsers();
        userRepository1.saveAllUsers(userList31);
        boolean boolean33 = userRepository1.headLabCoordinatorExists();
        boolean boolean35 = userRepository1.emailExists("alice@example.com");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "labmanager" + "'", str11, "labmanager");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(userOptional15);
        org.junit.Assert.assertNotNull(userList18);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 102 + "'", int19 == 102);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertNotNull(userOptional24);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNotNull(userList31);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
    }

    @Test
    public void test0951() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0951");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("demo/data/test-users.csv");
        com.reservation_system.model.Faculty faculty7 = new com.reservation_system.model.Faculty(5, "researcher", "guest", "faculty", true);
        java.lang.String str8 = faculty7.getUserType();
        java.lang.String str9 = faculty7.getUserType();
        userRepository1.addUser((com.reservation_system.model.User) faculty7);
        com.reservation_system.repository.UserRepository userRepository12 = new com.reservation_system.repository.UserRepository("demo/data/test-users.csv");
        boolean boolean14 = userRepository12.emailExists("Alice");
        com.reservation_system.repository.UserRepository userRepository16 = new com.reservation_system.repository.UserRepository("demo/data/test-users.csv");
        java.util.List<com.reservation_system.model.User> userList17 = userRepository16.getAllUsers();
        int int18 = userRepository16.getNextID();
        java.util.List<com.reservation_system.model.User> userList19 = userRepository16.getAllUsers();
        userRepository12.saveAllUsers(userList19);
        userRepository1.saveAllUsers(userList19);
        boolean boolean22 = userRepository1.headLabCoordinatorExists();
        boolean boolean24 = userRepository1.emailExists("demo/data/test-users.csv");
        java.util.Optional<com.reservation_system.model.User> userOptional26 = userRepository1.findByEmail("alice@example.com");
        com.reservation_system.model.Guest guest32 = new com.reservation_system.model.Guest(5, "guest", "demo/data/test-users.csv", "Faculty", false);
        userRepository1.addUser((com.reservation_system.model.User) guest32);
        com.reservation_system.model.Faculty faculty39 = new com.reservation_system.model.Faculty((int) (short) -1, "faculty", "Student", "hi!", true);
        userRepository1.addUser((com.reservation_system.model.User) faculty39);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Faculty" + "'", str8, "Faculty");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Faculty" + "'", str9, "Faculty");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(userList17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 102 + "'", int18 == 102);
        org.junit.Assert.assertNotNull(userList19);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertNotNull(userOptional26);
    }

    @Test
    public void test0952() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0952");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("demo/data/test-users.csv");
        com.reservation_system.model.Researcher researcher7 = new com.reservation_system.model.Researcher(5, "hi!", "labmanager", "Guest", false);
        userRepository1.addUser((com.reservation_system.model.User) researcher7);
        java.util.List<com.reservation_system.model.User> userList9 = userRepository1.getAllUsers();
        com.reservation_system.model.Guest guest15 = new com.reservation_system.model.Guest(0, "Password1!", "demo/data/test-users.csv", "researcher", false);
        boolean boolean16 = guest15.requiresDepartmentApproval();
        userRepository1.addUser((com.reservation_system.model.User) guest15);
        java.util.Optional<com.reservation_system.model.User> userOptional19 = userRepository1.findByEmail("guest");
        boolean boolean20 = userRepository1.headLabCoordinatorExists();
        org.junit.Assert.assertNotNull(userList9);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(userOptional19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
    }

    @Test
    public void test0953() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0953");
        com.reservation_system.model.User user6 = com.reservation_system.patterns.factory.UserFactory.createUser("Faculty", 1, "Guest", "", "headlabcoordinator", false);
        org.junit.Assert.assertNotNull(user6);
    }

    @Test
    public void test0954() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0954");
        com.reservation_system.model.Guest guest5 = new com.reservation_system.model.Guest((int) '4', "hi!", "Password1!", "headlabcoordinator", false);
        java.lang.String str6 = guest5.getPassword();
        java.lang.String str7 = guest5.getName();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "headlabcoordinator" + "'", str6, "headlabcoordinator");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
    }

    @Test
    public void test0955() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0955");
        com.reservation_system.model.Researcher researcher5 = new com.reservation_system.model.Researcher((int) (short) 10, "hi!", "student", "faculty", true);
        java.lang.String str6 = researcher5.getUserType();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Researcher" + "'", str6, "Researcher");
    }

    @Test
    public void test0956() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0956");
        com.reservation_system.model.HeadLabCoordinator headLabCoordinator5 = new com.reservation_system.model.HeadLabCoordinator((int) '#', "researcher", "", "Student", true);
        boolean boolean6 = headLabCoordinator5.requiresDepartmentApproval();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test0957() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0957");
        com.reservation_system.model.User user6 = com.reservation_system.patterns.factory.UserFactory.createUser("Researcher", (int) (short) 10, "faculty", "Faculty", "labmanager", false);
        org.junit.Assert.assertNotNull(user6);
    }

    @Test
    public void test0958() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0958");
        com.reservation_system.model.Faculty faculty5 = new com.reservation_system.model.Faculty((int) (byte) 0, "Guest", "Guest", "researcher", false);
    }

    @Test
    public void test0959() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0959");
        com.reservation_system.model.Guest guest5 = new com.reservation_system.model.Guest((int) 'a', "student", "", "labmanager", false);
        java.lang.Class<?> wildcardClass6 = guest5.getClass();
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0960() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0960");
        com.reservation_system.model.Faculty faculty5 = new com.reservation_system.model.Faculty((int) (byte) 10, "alice@example.com", "", "", false);
        java.lang.String str6 = faculty5.getUserType();
        boolean boolean7 = faculty5.isApproved();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Faculty" + "'", str6, "Faculty");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test0961() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0961");
        com.reservation_system.model.Faculty faculty5 = new com.reservation_system.model.Faculty(0, "researcher", "faculty", "guest", false);
        java.lang.String str6 = faculty5.getEmail();
        java.lang.Class<?> wildcardClass7 = faculty5.getClass();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "faculty" + "'", str6, "faculty");
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0962() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0962");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("demo/data/test-users.csv");
        com.reservation_system.model.Researcher researcher7 = new com.reservation_system.model.Researcher(5, "hi!", "labmanager", "Guest", false);
        userRepository1.addUser((com.reservation_system.model.User) researcher7);
        java.util.List<com.reservation_system.model.User> userList9 = userRepository1.getAllUsers();
        com.reservation_system.repository.UserRepository userRepository11 = new com.reservation_system.repository.UserRepository("demo/data/test-users.csv");
        com.reservation_system.model.Researcher researcher17 = new com.reservation_system.model.Researcher(5, "hi!", "labmanager", "Guest", false);
        userRepository11.addUser((com.reservation_system.model.User) researcher17);
        java.util.List<com.reservation_system.model.User> userList19 = userRepository11.getAllUsers();
        userRepository1.saveAllUsers(userList19);
        boolean boolean21 = userRepository1.headLabCoordinatorExists();
        int int22 = userRepository1.getNextID();
        boolean boolean24 = userRepository1.emailExists("alice@example.com");
        org.junit.Assert.assertNotNull(userList9);
        org.junit.Assert.assertNotNull(userList19);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 102 + "'", int22 == 102);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
    }

    @Test
    public void test0963() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0963");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("demo/data/test-users.csv");
        java.util.List<com.reservation_system.model.User> userList2 = userRepository1.getAllUsers();
        int int3 = userRepository1.getNextID();
        boolean boolean5 = userRepository1.emailExists("headlabcoordinator");
        boolean boolean6 = userRepository1.headLabCoordinatorExists();
        java.util.Optional<com.reservation_system.model.User> userOptional8 = userRepository1.findByEmail("Alice");
        boolean boolean10 = userRepository1.emailExists("Alice");
        boolean boolean12 = userRepository1.emailExists("Guest");
        boolean boolean14 = userRepository1.emailExists("headlabcoordinator");
        java.util.List<com.reservation_system.model.User> userList15 = userRepository1.getAllUsers();
        java.util.Optional<com.reservation_system.model.User> userOptional17 = userRepository1.findByEmail("Faculty");
        com.reservation_system.model.Student student23 = new com.reservation_system.model.Student(1, "demo/data/test-users.csv", "alice@example.com", "guest", false);
        java.lang.String str24 = student23.getUserType();
        java.lang.String str25 = student23.getUserType();
        userRepository1.addUser((com.reservation_system.model.User) student23);
        int int27 = userRepository1.getNextID();
        boolean boolean29 = userRepository1.emailExists("researcher");
        boolean boolean30 = userRepository1.headLabCoordinatorExists();
        org.junit.Assert.assertNotNull(userList2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 102 + "'", int3 == 102);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(userOptional8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(userList15);
        org.junit.Assert.assertNotNull(userOptional17);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "Student" + "'", str24, "Student");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "Student" + "'", str25, "Student");
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 102 + "'", int27 == 102);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
    }

    @Test
    public void test0964() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0964");
        com.reservation_system.model.Student student5 = new com.reservation_system.model.Student(0, "Guest", "Password1!", "demo/data/test-users.csv", true);
        java.lang.String str6 = student5.getEmail();
        boolean boolean7 = student5.isApproved();
        java.lang.String str8 = student5.getEmail();
        int int9 = student5.getID();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Password1!" + "'", str6, "Password1!");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Password1!" + "'", str8, "Password1!");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test0965() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0965");
        com.reservation_system.model.Faculty faculty5 = new com.reservation_system.model.Faculty(101, "researcher", "faculty", "Faculty", true);
    }

    @Test
    public void test0966() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0966");
        com.reservation_system.model.Faculty faculty5 = new com.reservation_system.model.Faculty((int) (byte) 100, "Password1!", "Faculty", "student", true);
        int int6 = faculty5.getID();
        java.lang.String str7 = faculty5.getUserType();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Faculty" + "'", str7, "Faculty");
    }

    @Test
    public void test0967() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0967");
        com.reservation_system.model.LabManager labManager5 = new com.reservation_system.model.LabManager((int) (byte) 1, "Guest", "faculty", "researcher", false);
    }

    @Test
    public void test0968() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0968");
        com.reservation_system.model.Researcher researcher5 = new com.reservation_system.model.Researcher((-1), "Faculty", "Guest", "Alice", false);
    }

    @Test
    public void test0969() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0969");
        com.reservation_system.model.Researcher researcher5 = new com.reservation_system.model.Researcher((int) (short) -1, "Student", "Alice", "labmanager", false);
        java.lang.Class<?> wildcardClass6 = researcher5.getClass();
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0970() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0970");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("demo/data/test-users.csv");
        int int2 = userRepository1.getNextID();
        boolean boolean3 = userRepository1.headLabCoordinatorExists();
        com.reservation_system.model.Guest guest9 = new com.reservation_system.model.Guest((int) (byte) -1, "hi!", "", "Password1!", false);
        userRepository1.addUser((com.reservation_system.model.User) guest9);
        int int11 = userRepository1.getNextID();
        boolean boolean13 = userRepository1.emailExists("headlabcoordinator");
        java.util.List<com.reservation_system.model.User> userList14 = userRepository1.getAllUsers();
        int int15 = userRepository1.getNextID();
        java.util.List<com.reservation_system.model.User> userList16 = userRepository1.getAllUsers();
        com.reservation_system.model.LabManager labManager22 = new com.reservation_system.model.LabManager(10, "Password1!", "demo/data/test-users.csv", "Guest", true);
        java.lang.String str23 = labManager22.getUserType();
        labManager22.setApproved(false);
        userRepository1.addUser((com.reservation_system.model.User) labManager22);
        java.util.List<com.reservation_system.model.User> userList27 = userRepository1.getAllUsers();
        int int28 = userRepository1.getNextID();
        boolean boolean29 = userRepository1.headLabCoordinatorExists();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 102 + "'", int2 == 102);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 102 + "'", int11 == 102);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(userList14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 102 + "'", int15 == 102);
        org.junit.Assert.assertNotNull(userList16);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "labmanager" + "'", str23, "labmanager");
        org.junit.Assert.assertNotNull(userList27);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 102 + "'", int28 == 102);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
    }

    @Test
    public void test0971() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0971");
        com.reservation_system.model.Student student5 = new com.reservation_system.model.Student(1, "demo/data/test-users.csv", "alice@example.com", "guest", false);
        java.lang.String str6 = student5.getUserType();
        java.lang.String str7 = student5.getUserType();
        java.lang.String str8 = student5.getName();
        java.lang.String str9 = student5.getPassword();
        java.lang.String str10 = student5.getUserType();
        int int11 = student5.getID();
        boolean boolean12 = student5.isApproved();
        java.lang.String str13 = student5.getEmail();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Student" + "'", str6, "Student");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Student" + "'", str7, "Student");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "demo/data/test-users.csv" + "'", str8, "demo/data/test-users.csv");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "guest" + "'", str9, "guest");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Student" + "'", str10, "Student");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test0972() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0972");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("demo/data/test-users.csv");
        int int2 = userRepository1.getNextID();
        boolean boolean3 = userRepository1.headLabCoordinatorExists();
        com.reservation_system.model.Guest guest9 = new com.reservation_system.model.Guest((int) (byte) -1, "hi!", "", "Password1!", false);
        userRepository1.addUser((com.reservation_system.model.User) guest9);
        int int11 = userRepository1.getNextID();
        com.reservation_system.model.Guest guest17 = new com.reservation_system.model.Guest((int) (byte) 100, "guest", "Faculty", "student", false);
        java.lang.String str18 = guest17.getPassword();
        java.lang.String str19 = guest17.getUserType();
        userRepository1.addUser((com.reservation_system.model.User) guest17);
        int int21 = guest17.getID();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 102 + "'", int2 == 102);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 102 + "'", int11 == 102);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "student" + "'", str18, "student");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "Guest" + "'", str19, "Guest");
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 100 + "'", int21 == 100);
    }

    @Test
    public void test0973() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0973");
        com.reservation_system.model.HeadLabCoordinator headLabCoordinator5 = new com.reservation_system.model.HeadLabCoordinator((int) (byte) 1, "student", "Password1!", "alice@example.com", true);
        java.lang.String str6 = headLabCoordinator5.getName();
        java.lang.String str7 = headLabCoordinator5.getUserType();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "student" + "'", str6, "student");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "headlabcoordinator" + "'", str7, "headlabcoordinator");
    }

    @Test
    public void test0974() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0974");
        com.reservation_system.model.HeadLabCoordinator headLabCoordinator5 = new com.reservation_system.model.HeadLabCoordinator(5, "faculty", "faculty", "hi!", true);
        int int6 = headLabCoordinator5.getID();
        headLabCoordinator5.setApproved(true);
        headLabCoordinator5.setApproved(false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 5 + "'", int6 == 5);
    }

    @Test
    public void test0975() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0975");
        com.reservation_system.model.Student student5 = new com.reservation_system.model.Student(1, "demo/data/test-users.csv", "alice@example.com", "guest", false);
        java.lang.String str6 = student5.getUserType();
        java.lang.String str7 = student5.getUserType();
        java.lang.String str8 = student5.getUserType();
        java.lang.String str9 = student5.getUserType();
        java.lang.Class<?> wildcardClass10 = student5.getClass();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Student" + "'", str6, "Student");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Student" + "'", str7, "Student");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Student" + "'", str8, "Student");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Student" + "'", str9, "Student");
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0976() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0976");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("demo/data/test-users.csv");
        com.reservation_system.model.Researcher researcher7 = new com.reservation_system.model.Researcher(5, "hi!", "labmanager", "Guest", false);
        userRepository1.addUser((com.reservation_system.model.User) researcher7);
        java.util.List<com.reservation_system.model.User> userList9 = userRepository1.getAllUsers();
        boolean boolean11 = userRepository1.emailExists("hi!");
        com.reservation_system.model.LabManager labManager17 = new com.reservation_system.model.LabManager(1, "Researcher", "labmanager", "demo/data/test-users.csv", false);
        userRepository1.addUser((com.reservation_system.model.User) labManager17);
        labManager17.setApproved(true);
        org.junit.Assert.assertNotNull(userList9);
// flaky "51) test0976(com.reservation_system.randoop.userrepository.RegressionTest1)":         org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test0977() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0977");
        com.reservation_system.model.Student student5 = new com.reservation_system.model.Student(0, "Faculty", "student", "Guest", true);
        java.lang.String str6 = student5.getUserType();
        java.lang.String str7 = student5.getUserType();
        java.lang.String str8 = student5.getUserType();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Student" + "'", str6, "Student");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Student" + "'", str7, "Student");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Student" + "'", str8, "Student");
    }

    @Test
    public void test0978() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0978");
        // The following exception was thrown during execution in test generation
        try {
            com.reservation_system.model.User user6 = com.reservation_system.patterns.factory.UserFactory.createUser("demo/data/test-users.csv", (int) (short) 100, "", "Alice", "hi!", true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid user type: demo/data/test-users.csv");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0979() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0979");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("demo/data/test-users.csv");
        int int2 = userRepository1.getNextID();
        boolean boolean3 = userRepository1.headLabCoordinatorExists();
        com.reservation_system.model.Guest guest9 = new com.reservation_system.model.Guest((int) (byte) -1, "hi!", "", "Password1!", false);
        userRepository1.addUser((com.reservation_system.model.User) guest9);
        java.util.Optional<com.reservation_system.model.User> userOptional12 = userRepository1.findByEmail("Faculty");
        boolean boolean14 = userRepository1.emailExists("hi!");
        boolean boolean16 = userRepository1.emailExists("Password1!");
        java.util.Optional<com.reservation_system.model.User> userOptional18 = userRepository1.findByEmail("");
        int int19 = userRepository1.getNextID();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 102 + "'", int2 == 102);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(userOptional12);
// flaky "52) test0979(com.reservation_system.randoop.userrepository.RegressionTest1)":         org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNotNull(userOptional18);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 102 + "'", int19 == 102);
    }

    @Test
    public void test0980() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0980");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("demo/data/test-users.csv");
        com.reservation_system.model.Researcher researcher7 = new com.reservation_system.model.Researcher(5, "hi!", "labmanager", "Guest", false);
        userRepository1.addUser((com.reservation_system.model.User) researcher7);
        java.util.List<com.reservation_system.model.User> userList9 = userRepository1.getAllUsers();
        boolean boolean11 = userRepository1.emailExists("hi!");
        com.reservation_system.model.LabManager labManager17 = new com.reservation_system.model.LabManager(1, "Researcher", "labmanager", "demo/data/test-users.csv", false);
        userRepository1.addUser((com.reservation_system.model.User) labManager17);
        int int19 = labManager17.getID();
        java.lang.String str20 = labManager17.getUserType();
        org.junit.Assert.assertNotNull(userList9);
// flaky "53) test0980(com.reservation_system.randoop.userrepository.RegressionTest1)":         org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 1 + "'", int19 == 1);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "labmanager" + "'", str20, "labmanager");
    }

    @Test
    public void test0981() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0981");
        com.reservation_system.model.HeadLabCoordinator headLabCoordinator5 = new com.reservation_system.model.HeadLabCoordinator(5, "Faculty", "", "Alice", false);
        java.lang.String str6 = headLabCoordinator5.getUserType();
        java.lang.String str7 = headLabCoordinator5.getUserType();
        java.lang.String str8 = headLabCoordinator5.getUserType();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "headlabcoordinator" + "'", str6, "headlabcoordinator");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "headlabcoordinator" + "'", str7, "headlabcoordinator");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "headlabcoordinator" + "'", str8, "headlabcoordinator");
    }

    @Test
    public void test0982() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0982");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("demo/data/test-users.csv");
        com.reservation_system.model.Researcher researcher7 = new com.reservation_system.model.Researcher(5, "hi!", "labmanager", "Guest", false);
        userRepository1.addUser((com.reservation_system.model.User) researcher7);
        java.util.List<com.reservation_system.model.User> userList9 = userRepository1.getAllUsers();
        com.reservation_system.model.Guest guest15 = new com.reservation_system.model.Guest(0, "Password1!", "demo/data/test-users.csv", "researcher", false);
        boolean boolean16 = guest15.requiresDepartmentApproval();
        userRepository1.addUser((com.reservation_system.model.User) guest15);
        java.util.Optional<com.reservation_system.model.User> userOptional19 = userRepository1.findByEmail("Student");
        java.lang.Class<?> wildcardClass20 = userOptional19.getClass();
        org.junit.Assert.assertNotNull(userList9);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(userOptional19);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test0983() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0983");
        com.reservation_system.model.HeadLabCoordinator headLabCoordinator5 = new com.reservation_system.model.HeadLabCoordinator((int) (byte) 1, "student", "", "Alice", false);
    }

    @Test
    public void test0984() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0984");
        com.reservation_system.model.Guest guest5 = new com.reservation_system.model.Guest(0, "Password1!", "demo/data/test-users.csv", "researcher", false);
        boolean boolean6 = guest5.requiresDepartmentApproval();
        java.lang.String str7 = guest5.getUserType();
        java.lang.String str8 = guest5.getUserType();
        java.lang.String str9 = guest5.getName();
        guest5.setApproved(false);
        java.lang.String str12 = guest5.getUserType();
        guest5.setApproved(false);
        java.lang.String str15 = guest5.getEmail();
        guest5.setApproved(true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Guest" + "'", str7, "Guest");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Guest" + "'", str8, "Guest");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Password1!" + "'", str9, "Password1!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Guest" + "'", str12, "Guest");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "demo/data/test-users.csv" + "'", str15, "demo/data/test-users.csv");
    }

    @Test
    public void test0985() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0985");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("demo/data/test-users.csv");
        com.reservation_system.model.Researcher researcher7 = new com.reservation_system.model.Researcher(5, "hi!", "labmanager", "Guest", false);
        userRepository1.addUser((com.reservation_system.model.User) researcher7);
        int int9 = userRepository1.getNextID();
        java.util.List<com.reservation_system.model.User> userList10 = userRepository1.getAllUsers();
        com.reservation_system.model.Student student16 = new com.reservation_system.model.Student(98, "Password1!", "Password1!", "student", false);
        java.lang.String str17 = student16.getUserType();
        java.lang.String str18 = student16.getEmail();
        boolean boolean19 = student16.requiresDepartmentApproval();
        userRepository1.addUser((com.reservation_system.model.User) student16);
        com.reservation_system.repository.UserRepository userRepository22 = new com.reservation_system.repository.UserRepository("demo/data/test-users.csv");
        com.reservation_system.model.Researcher researcher28 = new com.reservation_system.model.Researcher(5, "hi!", "labmanager", "Guest", false);
        userRepository22.addUser((com.reservation_system.model.User) researcher28);
        java.lang.String str30 = researcher28.getUserType();
        userRepository1.addUser((com.reservation_system.model.User) researcher28);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 102 + "'", int9 == 102);
        org.junit.Assert.assertNotNull(userList10);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "Student" + "'", str17, "Student");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Password1!" + "'", str18, "Password1!");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "Researcher" + "'", str30, "Researcher");
    }

    @Test
    public void test0986() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0986");
        com.reservation_system.model.Researcher researcher5 = new com.reservation_system.model.Researcher(0, "", "Password1!", "researcher", false);
        researcher5.setApproved(true);
        int int8 = researcher5.getID();
        boolean boolean9 = researcher5.isApproved();
        boolean boolean10 = researcher5.isApproved();
        java.lang.String str11 = researcher5.getUserType();
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Researcher" + "'", str11, "Researcher");
    }

    @Test
    public void test0987() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0987");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("demo/data/test-users.csv");
        com.reservation_system.model.Researcher researcher7 = new com.reservation_system.model.Researcher(5, "hi!", "labmanager", "Guest", false);
        userRepository1.addUser((com.reservation_system.model.User) researcher7);
        int int9 = userRepository1.getNextID();
        java.util.Optional<com.reservation_system.model.User> userOptional11 = userRepository1.findByEmail("headlabcoordinator");
        com.reservation_system.repository.UserRepository userRepository13 = new com.reservation_system.repository.UserRepository("demo/data/test-users.csv");
        java.util.List<com.reservation_system.model.User> userList14 = userRepository13.getAllUsers();
        int int15 = userRepository13.getNextID();
        boolean boolean17 = userRepository13.emailExists("headlabcoordinator");
        boolean boolean18 = userRepository13.headLabCoordinatorExists();
        java.util.Optional<com.reservation_system.model.User> userOptional20 = userRepository13.findByEmail("Alice");
        boolean boolean22 = userRepository13.emailExists("Alice");
        boolean boolean24 = userRepository13.emailExists("Guest");
        boolean boolean26 = userRepository13.emailExists("headlabcoordinator");
        com.reservation_system.model.Student student32 = new com.reservation_system.model.Student(0, "Guest", "Password1!", "demo/data/test-users.csv", true);
        userRepository13.addUser((com.reservation_system.model.User) student32);
        userRepository1.addUser((com.reservation_system.model.User) student32);
        java.util.List<com.reservation_system.model.User> userList35 = userRepository1.getAllUsers();
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 102 + "'", int9 == 102);
        org.junit.Assert.assertNotNull(userOptional11);
        org.junit.Assert.assertNotNull(userList14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 102 + "'", int15 == 102);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(userOptional20);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(userList35);
    }

    @Test
    public void test0988() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0988");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("demo/data/test-users.csv");
        java.util.List<com.reservation_system.model.User> userList2 = userRepository1.getAllUsers();
        int int3 = userRepository1.getNextID();
        boolean boolean5 = userRepository1.emailExists("headlabcoordinator");
        boolean boolean6 = userRepository1.headLabCoordinatorExists();
        java.util.Optional<com.reservation_system.model.User> userOptional8 = userRepository1.findByEmail("Alice");
        boolean boolean10 = userRepository1.emailExists("Alice");
        boolean boolean12 = userRepository1.emailExists("Guest");
        boolean boolean14 = userRepository1.emailExists("headlabcoordinator");
        java.util.List<com.reservation_system.model.User> userList15 = userRepository1.getAllUsers();
        java.util.Optional<com.reservation_system.model.User> userOptional17 = userRepository1.findByEmail("Faculty");
        com.reservation_system.model.Student student23 = new com.reservation_system.model.Student(1, "demo/data/test-users.csv", "alice@example.com", "guest", false);
        java.lang.String str24 = student23.getUserType();
        java.lang.String str25 = student23.getUserType();
        userRepository1.addUser((com.reservation_system.model.User) student23);
        java.util.Optional<com.reservation_system.model.User> userOptional28 = userRepository1.findByEmail("guest");
        com.reservation_system.repository.UserRepository userRepository30 = new com.reservation_system.repository.UserRepository("demo/data/test-users.csv");
        com.reservation_system.model.Researcher researcher36 = new com.reservation_system.model.Researcher(5, "hi!", "labmanager", "Guest", false);
        userRepository30.addUser((com.reservation_system.model.User) researcher36);
        boolean boolean39 = userRepository30.emailExists("headlabcoordinator");
        boolean boolean41 = userRepository30.emailExists("Guest");
        java.util.List<com.reservation_system.model.User> userList42 = userRepository30.getAllUsers();
        userRepository1.saveAllUsers(userList42);
        org.junit.Assert.assertNotNull(userList2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 102 + "'", int3 == 102);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(userOptional8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(userList15);
        org.junit.Assert.assertNotNull(userOptional17);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "Student" + "'", str24, "Student");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "Student" + "'", str25, "Student");
        org.junit.Assert.assertNotNull(userOptional28);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + true + "'", boolean41 == true);
        org.junit.Assert.assertNotNull(userList42);
    }

    @Test
    public void test0989() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0989");
        com.reservation_system.model.HeadLabCoordinator headLabCoordinator5 = new com.reservation_system.model.HeadLabCoordinator(6, "Alice", "Guest", "alice@example.com", true);
    }

    @Test
    public void test0990() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0990");
        com.reservation_system.model.Researcher researcher5 = new com.reservation_system.model.Researcher(1, "Alice", "Student", "researcher", true);
    }

    @Test
    public void test0991() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0991");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("demo/data/test-users.csv");
        com.reservation_system.model.Researcher researcher7 = new com.reservation_system.model.Researcher(5, "hi!", "labmanager", "Guest", false);
        userRepository1.addUser((com.reservation_system.model.User) researcher7);
        java.util.List<com.reservation_system.model.User> userList9 = userRepository1.getAllUsers();
        com.reservation_system.repository.UserRepository userRepository11 = new com.reservation_system.repository.UserRepository("demo/data/test-users.csv");
        com.reservation_system.model.Researcher researcher17 = new com.reservation_system.model.Researcher(5, "hi!", "labmanager", "Guest", false);
        userRepository11.addUser((com.reservation_system.model.User) researcher17);
        java.util.List<com.reservation_system.model.User> userList19 = userRepository11.getAllUsers();
        userRepository1.saveAllUsers(userList19);
        boolean boolean21 = userRepository1.headLabCoordinatorExists();
        com.reservation_system.repository.UserRepository userRepository23 = new com.reservation_system.repository.UserRepository("demo/data/test-users.csv");
        java.util.List<com.reservation_system.model.User> userList24 = userRepository23.getAllUsers();
        int int25 = userRepository23.getNextID();
        boolean boolean27 = userRepository23.emailExists("headlabcoordinator");
        java.util.Optional<com.reservation_system.model.User> userOptional29 = userRepository23.findByEmail("student");
        com.reservation_system.repository.UserRepository userRepository31 = new com.reservation_system.repository.UserRepository("demo/data/test-users.csv");
        java.util.List<com.reservation_system.model.User> userList32 = userRepository31.getAllUsers();
        int int33 = userRepository31.getNextID();
        boolean boolean35 = userRepository31.emailExists("headlabcoordinator");
        boolean boolean36 = userRepository31.headLabCoordinatorExists();
        java.util.Optional<com.reservation_system.model.User> userOptional38 = userRepository31.findByEmail("Alice");
        boolean boolean40 = userRepository31.emailExists("guest");
        java.util.List<com.reservation_system.model.User> userList41 = userRepository31.getAllUsers();
        userRepository23.saveAllUsers(userList41);
        java.util.List<com.reservation_system.model.User> userList43 = userRepository23.getAllUsers();
        userRepository1.saveAllUsers(userList43);
        int int45 = userRepository1.getNextID();
        com.reservation_system.model.User user52 = com.reservation_system.patterns.factory.UserFactory.createUser("researcher", 0, "", "Researcher", "", true);
        boolean boolean53 = user52.requiresDepartmentApproval();
        userRepository1.addUser(user52);
        org.junit.Assert.assertNotNull(userList9);
        org.junit.Assert.assertNotNull(userList19);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertNotNull(userList24);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 102 + "'", int25 == 102);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(userOptional29);
        org.junit.Assert.assertNotNull(userList32);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 102 + "'", int33 == 102);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertNotNull(userOptional38);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + true + "'", boolean40 == true);
        org.junit.Assert.assertNotNull(userList41);
        org.junit.Assert.assertNotNull(userList43);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 102 + "'", int45 == 102);
        org.junit.Assert.assertNotNull(user52);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + true + "'", boolean53 == true);
    }

    @Test
    public void test0992() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0992");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("demo/data/test-users.csv");
        com.reservation_system.model.Researcher researcher7 = new com.reservation_system.model.Researcher(5, "hi!", "labmanager", "Guest", false);
        userRepository1.addUser((com.reservation_system.model.User) researcher7);
        java.util.List<com.reservation_system.model.User> userList9 = userRepository1.getAllUsers();
        boolean boolean10 = userRepository1.headLabCoordinatorExists();
        boolean boolean12 = userRepository1.emailExists("guest");
        com.reservation_system.repository.UserRepository userRepository14 = new com.reservation_system.repository.UserRepository("demo/data/test-users.csv");
        boolean boolean16 = userRepository14.emailExists("Alice");
        com.reservation_system.repository.UserRepository userRepository18 = new com.reservation_system.repository.UserRepository("demo/data/test-users.csv");
        java.util.List<com.reservation_system.model.User> userList19 = userRepository18.getAllUsers();
        int int20 = userRepository18.getNextID();
        java.util.List<com.reservation_system.model.User> userList21 = userRepository18.getAllUsers();
        userRepository14.saveAllUsers(userList21);
        userRepository1.saveAllUsers(userList21);
        int int24 = userRepository1.getNextID();
        com.reservation_system.model.Researcher researcher30 = new com.reservation_system.model.Researcher(98, "Alice", "Student", "guest", false);
        java.lang.String str31 = researcher30.getUserType();
        int int32 = researcher30.getID();
        userRepository1.addUser((com.reservation_system.model.User) researcher30);
        java.lang.String str34 = researcher30.getUserType();
        org.junit.Assert.assertNotNull(userList9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(userList19);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 102 + "'", int20 == 102);
        org.junit.Assert.assertNotNull(userList21);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 102 + "'", int24 == 102);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "Researcher" + "'", str31, "Researcher");
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 98 + "'", int32 == 98);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "Researcher" + "'", str34, "Researcher");
    }

    @Test
    public void test0993() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0993");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("demo/data/test-users.csv");
        boolean boolean3 = userRepository1.emailExists("Alice");
        com.reservation_system.model.Researcher researcher9 = new com.reservation_system.model.Researcher((int) 'a', "labmanager", "faculty", "", false);
        boolean boolean10 = researcher9.isApproved();
        java.lang.String str11 = researcher9.getName();
        userRepository1.addUser((com.reservation_system.model.User) researcher9);
        boolean boolean13 = researcher9.requiresDepartmentApproval();
        java.lang.String str14 = researcher9.getName();
        java.lang.String str15 = researcher9.getUserType();
        int int16 = researcher9.getID();
        java.lang.String str17 = researcher9.getName();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "labmanager" + "'", str11, "labmanager");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "labmanager" + "'", str14, "labmanager");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Researcher" + "'", str15, "Researcher");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 97 + "'", int16 == 97);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "labmanager" + "'", str17, "labmanager");
    }

    @Test
    public void test0994() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0994");
        com.reservation_system.model.User user6 = com.reservation_system.patterns.factory.UserFactory.createUser("headlabcoordinator", 98, "Researcher", "headlabcoordinator", "demo/data/test-users.csv", false);
        org.junit.Assert.assertNotNull(user6);
    }

    @Test
    public void test0995() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0995");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("demo/data/test-users.csv");
        boolean boolean3 = userRepository1.emailExists("Alice");
        com.reservation_system.repository.UserRepository userRepository5 = new com.reservation_system.repository.UserRepository("demo/data/test-users.csv");
        java.util.List<com.reservation_system.model.User> userList6 = userRepository5.getAllUsers();
        int int7 = userRepository5.getNextID();
        java.util.List<com.reservation_system.model.User> userList8 = userRepository5.getAllUsers();
        userRepository1.saveAllUsers(userList8);
        boolean boolean10 = userRepository1.headLabCoordinatorExists();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(userList6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 102 + "'", int7 == 102);
        org.junit.Assert.assertNotNull(userList8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test0996() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0996");
        // The following exception was thrown during execution in test generation
        try {
            com.reservation_system.model.User user6 = com.reservation_system.patterns.factory.UserFactory.createUser("demo/data/test-users.csv", 52, "researcher", "Faculty", "Password1!", false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid user type: demo/data/test-users.csv");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0997() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0997");
        com.reservation_system.model.Faculty faculty5 = new com.reservation_system.model.Faculty(0, "student", "faculty", "Researcher", false);
        java.lang.String str6 = faculty5.getName();
        java.lang.String str7 = faculty5.getUserType();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "student" + "'", str6, "student");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Faculty" + "'", str7, "Faculty");
    }

    @Test
    public void test0998() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0998");
        com.reservation_system.model.Student student5 = new com.reservation_system.model.Student(10, "demo/data/test-users.csv", "Password1!", "alice@example.com", true);
        java.lang.String str6 = student5.getUserType();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Student" + "'", str6, "Student");
    }

    @Test
    public void test0999() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0999");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("demo/data/test-users.csv");
        com.reservation_system.model.Researcher researcher7 = new com.reservation_system.model.Researcher(5, "hi!", "labmanager", "Guest", false);
        userRepository1.addUser((com.reservation_system.model.User) researcher7);
        java.util.List<com.reservation_system.model.User> userList9 = userRepository1.getAllUsers();
        com.reservation_system.repository.UserRepository userRepository11 = new com.reservation_system.repository.UserRepository("demo/data/test-users.csv");
        com.reservation_system.model.Researcher researcher17 = new com.reservation_system.model.Researcher(5, "hi!", "labmanager", "Guest", false);
        userRepository11.addUser((com.reservation_system.model.User) researcher17);
        java.util.Optional<com.reservation_system.model.User> userOptional20 = userRepository11.findByEmail("alice@example.com");
        java.util.List<com.reservation_system.model.User> userList21 = userRepository11.getAllUsers();
        userRepository1.saveAllUsers(userList21);
        com.reservation_system.model.Student student28 = new com.reservation_system.model.Student((int) (short) 100, "guest", "Guest", "faculty", false);
        userRepository1.addUser((com.reservation_system.model.User) student28);
        com.reservation_system.repository.UserRepository userRepository31 = new com.reservation_system.repository.UserRepository("demo/data/test-users.csv");
        int int32 = userRepository31.getNextID();
        int int33 = userRepository31.getNextID();
        java.util.List<com.reservation_system.model.User> userList34 = userRepository31.getAllUsers();
        userRepository1.saveAllUsers(userList34);
        com.reservation_system.repository.UserRepository userRepository37 = new com.reservation_system.repository.UserRepository("demo/data/test-users.csv");
        com.reservation_system.model.Researcher researcher43 = new com.reservation_system.model.Researcher(5, "hi!", "labmanager", "Guest", false);
        userRepository37.addUser((com.reservation_system.model.User) researcher43);
        java.util.List<com.reservation_system.model.User> userList45 = userRepository37.getAllUsers();
        boolean boolean47 = userRepository37.emailExists("hi!");
        com.reservation_system.model.LabManager labManager53 = new com.reservation_system.model.LabManager(1, "Researcher", "labmanager", "demo/data/test-users.csv", false);
        userRepository37.addUser((com.reservation_system.model.User) labManager53);
        userRepository1.addUser((com.reservation_system.model.User) labManager53);
        java.util.Optional<com.reservation_system.model.User> userOptional57 = userRepository1.findByEmail("alice@example.com");
        org.junit.Assert.assertNotNull(userList9);
        org.junit.Assert.assertNotNull(userOptional20);
        org.junit.Assert.assertNotNull(userList21);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 102 + "'", int32 == 102);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 102 + "'", int33 == 102);
        org.junit.Assert.assertNotNull(userList34);
        org.junit.Assert.assertNotNull(userList45);
// flaky "54) test0999(com.reservation_system.randoop.userrepository.RegressionTest1)":         org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + true + "'", boolean47 == true);
        org.junit.Assert.assertNotNull(userOptional57);
    }

    @Test
    public void test1000() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test1000");
        com.reservation_system.model.Faculty faculty5 = new com.reservation_system.model.Faculty((int) (short) 100, "headlabcoordinator", "student", "Faculty", false);
    }
}
