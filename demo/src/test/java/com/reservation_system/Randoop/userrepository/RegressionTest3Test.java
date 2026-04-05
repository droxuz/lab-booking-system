package com.reservation_system.Randoop.userrepository;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest3Test {

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
        com.reservation_system.model.User user6 = com.reservation_system.patterns.factory.UserFactory.createUser("researcher", (-1), "headlabcoordinator", "Password1!", "guest", false);
        user6.setApproved(true);
        org.junit.Assert.assertNotNull(user6);
    }

    @Test
    public void test1502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1502");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("data/test-userrepo.csv");
        com.reservation_system.model.Researcher researcher7 = new com.reservation_system.model.Researcher(5, "hi!", "labmanager", "Guest", false);
        userRepository1.addUser((com.reservation_system.model.User) researcher7);
        int int9 = userRepository1.getNextID();
        java.util.Optional<com.reservation_system.model.User> userOptional11 = userRepository1.findByEmail("headlabcoordinator");
        java.util.Optional<com.reservation_system.model.User> userOptional13 = userRepository1.findByEmail("");
        java.lang.Class<?> wildcardClass14 = userOptional13.getClass();
// flaky "1) test1502(com.reservation_system.randoop.userrepository.RegressionTest3)":         org.junit.Assert.assertTrue("'" + int9 + "' != '" + 101 + "'", int9 == 101);
        org.junit.Assert.assertNotNull(userOptional11);
        org.junit.Assert.assertNotNull(userOptional13);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test1503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1503");
        com.reservation_system.model.LabManager labManager5 = new com.reservation_system.model.LabManager((int) (short) 0, "Guest", "hi!", "faculty", false);
        java.lang.String str6 = labManager5.getPassword();
        java.lang.Class<?> wildcardClass7 = labManager5.getClass();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "faculty" + "'", str6, "faculty");
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test1504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1504");
        com.reservation_system.model.Guest guest5 = new com.reservation_system.model.Guest(0, "Faculty", "Student", "Alice", true);
        java.lang.String str6 = guest5.getEmail();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Student" + "'", str6, "Student");
    }

    @Test
    public void test1505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1505");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("data/test-userrepo.csv");
        java.util.List<com.reservation_system.model.User> userList2 = userRepository1.getAllUsers();
        int int3 = userRepository1.getNextID();
        boolean boolean5 = userRepository1.emailExists("headlabcoordinator");
        boolean boolean6 = userRepository1.headLabCoordinatorExists();
        java.util.Optional<com.reservation_system.model.User> userOptional8 = userRepository1.findByEmail("Alice");
        boolean boolean10 = userRepository1.emailExists("Alice");
        boolean boolean12 = userRepository1.emailExists("Guest");
        boolean boolean14 = userRepository1.emailExists("headlabcoordinator");
        java.util.List<com.reservation_system.model.User> userList15 = userRepository1.getAllUsers();
        java.util.List<com.reservation_system.model.User> userList16 = userRepository1.getAllUsers();
        java.util.Optional<com.reservation_system.model.User> userOptional18 = userRepository1.findByEmail("labmanager");
        com.reservation_system.model.Researcher researcher24 = new com.reservation_system.model.Researcher((int) 'a', "labmanager", "faculty", "", false);
        boolean boolean25 = researcher24.isApproved();
        java.lang.String str26 = researcher24.getName();
        boolean boolean27 = researcher24.requiresDepartmentApproval();
        java.lang.String str28 = researcher24.getUserType();
        userRepository1.addUser((com.reservation_system.model.User) researcher24);
        java.lang.String str30 = researcher24.getName();
        org.junit.Assert.assertNotNull(userList2);
// flaky "2) test1505(com.reservation_system.randoop.userrepository.RegressionTest3)":         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 101 + "'", int3 == 101);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
// flaky "1) test1505(com.reservation_system.randoop.userrepository.RegressionTest3)":         org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(userOptional8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
// flaky "1) test1505(com.reservation_system.randoop.userrepository.RegressionTest3)":         org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(userList15);
        org.junit.Assert.assertNotNull(userList16);
        org.junit.Assert.assertNotNull(userOptional18);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "labmanager" + "'", str26, "labmanager");
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "Researcher" + "'", str28, "Researcher");
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "labmanager" + "'", str30, "labmanager");
    }

    @Test
    public void test1506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1506");
        com.reservation_system.model.Researcher researcher5 = new com.reservation_system.model.Researcher((int) (byte) -1, "", "researcher", "", true);
    }

    @Test
    public void test1507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1507");
        com.reservation_system.model.User user6 = com.reservation_system.patterns.factory.UserFactory.createUser("Faculty", 10, "Student", "labmanager", "alice@example.com", true);
        java.lang.String str7 = user6.getPassword();
        boolean boolean8 = user6.isApproved();
        org.junit.Assert.assertNotNull(user6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test1508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1508");
        com.reservation_system.model.HeadLabCoordinator headLabCoordinator5 = new com.reservation_system.model.HeadLabCoordinator(98, "faculty", "data/test-userrepo.csv", "headlabcoordinator", true);
    }

    @Test
    public void test1509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1509");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("data/test-userrepo.csv");
        com.reservation_system.model.Researcher researcher7 = new com.reservation_system.model.Researcher(5, "hi!", "labmanager", "Guest", false);
        userRepository1.addUser((com.reservation_system.model.User) researcher7);
        java.util.List<com.reservation_system.model.User> userList9 = userRepository1.getAllUsers();
        boolean boolean10 = userRepository1.headLabCoordinatorExists();
        boolean boolean12 = userRepository1.emailExists("guest");
        java.util.Optional<com.reservation_system.model.User> userOptional14 = userRepository1.findByEmail("researcher");
        java.util.Optional<com.reservation_system.model.User> userOptional16 = userRepository1.findByEmail("alice@example.com");
        int int17 = userRepository1.getNextID();
        boolean boolean18 = userRepository1.headLabCoordinatorExists();
        java.util.Optional<com.reservation_system.model.User> userOptional20 = userRepository1.findByEmail("headlabcoordinator");
        org.junit.Assert.assertNotNull(userList9);
// flaky "3) test1509(com.reservation_system.randoop.userrepository.RegressionTest3)":         org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
// flaky "2) test1509(com.reservation_system.randoop.userrepository.RegressionTest3)":         org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(userOptional14);
        org.junit.Assert.assertNotNull(userOptional16);
// flaky "2) test1509(com.reservation_system.randoop.userrepository.RegressionTest3)":         org.junit.Assert.assertTrue("'" + int17 + "' != '" + 101 + "'", int17 == 101);
// flaky "1) test1509(com.reservation_system.randoop.userrepository.RegressionTest3)":         org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(userOptional20);
    }

    @Test
    public void test1510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1510");
        com.reservation_system.model.User user6 = com.reservation_system.patterns.factory.UserFactory.createUser("Faculty", 6, "hi!", "", "headlabcoordinator", true);
        java.lang.String str7 = user6.getName();
        org.junit.Assert.assertNotNull(user6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
    }

    @Test
    public void test1511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1511");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("data/test-userrepo.csv");
        com.reservation_system.model.Researcher researcher7 = new com.reservation_system.model.Researcher(5, "hi!", "labmanager", "Guest", false);
        userRepository1.addUser((com.reservation_system.model.User) researcher7);
        java.util.List<com.reservation_system.model.User> userList9 = userRepository1.getAllUsers();
        com.reservation_system.model.Guest guest15 = new com.reservation_system.model.Guest(0, "Password1!", "data/test-userrepo.csv", "researcher", false);
        boolean boolean16 = guest15.requiresDepartmentApproval();
        userRepository1.addUser((com.reservation_system.model.User) guest15);
        boolean boolean19 = userRepository1.emailExists("Alice");
        int int20 = userRepository1.getNextID();
        com.reservation_system.repository.UserRepository userRepository22 = new com.reservation_system.repository.UserRepository("data/test-userrepo.csv");
        boolean boolean24 = userRepository22.emailExists("Alice");
        com.reservation_system.repository.UserRepository userRepository26 = new com.reservation_system.repository.UserRepository("data/test-userrepo.csv");
        java.util.List<com.reservation_system.model.User> userList27 = userRepository26.getAllUsers();
        int int28 = userRepository26.getNextID();
        java.util.List<com.reservation_system.model.User> userList29 = userRepository26.getAllUsers();
        userRepository22.saveAllUsers(userList29);
        userRepository1.saveAllUsers(userList29);
        boolean boolean32 = userRepository1.headLabCoordinatorExists();
        com.reservation_system.model.User user39 = com.reservation_system.patterns.factory.UserFactory.createUser("guest", (int) (byte) 100, "data/test-userrepo.csv", "data/test-userrepo.csv", "Guest", true);
        userRepository1.addUser(user39);
        org.junit.Assert.assertNotNull(userList9);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
// flaky "4) test1511(com.reservation_system.randoop.userrepository.RegressionTest3)":         org.junit.Assert.assertTrue("'" + int20 + "' != '" + 101 + "'", int20 == 101);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(userList27);
// flaky "3) test1511(com.reservation_system.randoop.userrepository.RegressionTest3)":         org.junit.Assert.assertTrue("'" + int28 + "' != '" + 101 + "'", int28 == 101);
        org.junit.Assert.assertNotNull(userList29);
// flaky "3) test1511(com.reservation_system.randoop.userrepository.RegressionTest3)":         org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertNotNull(user39);
    }

    @Test
    public void test1512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1512");
        com.reservation_system.model.Researcher researcher5 = new com.reservation_system.model.Researcher((int) '#', "student", "student", "Guest", true);
        java.lang.String str6 = researcher5.getName();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "student" + "'", str6, "student");
    }

    @Test
    public void test1513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1513");
        com.reservation_system.model.Faculty faculty5 = new com.reservation_system.model.Faculty(6, "faculty", "data/test-userrepo.csv", "Guest", false);
    }

    @Test
    public void test1514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1514");
        com.reservation_system.model.HeadLabCoordinator headLabCoordinator5 = new com.reservation_system.model.HeadLabCoordinator(11, "Faculty", "Alice", "Student", false);
    }

    @Test
    public void test1515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1515");
        com.reservation_system.model.Student student5 = new com.reservation_system.model.Student(35, "Faculty", "researcher", "Guest", true);
        int int6 = student5.getID();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 35 + "'", int6 == 35);
    }

    @Test
    public void test1516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1516");
        com.reservation_system.model.LabManager labManager5 = new com.reservation_system.model.LabManager((int) '4', "student", "headlabcoordinator", "researcher", false);
        labManager5.setApproved(false);
    }

    @Test
    public void test1517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1517");
        com.reservation_system.model.LabManager labManager5 = new com.reservation_system.model.LabManager(11, "Guest", "alice@example.com", "alice@example.com", true);
    }

    @Test
    public void test1518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1518");
        com.reservation_system.model.Researcher researcher5 = new com.reservation_system.model.Researcher((int) (byte) 0, "Researcher", "", "data/test-userrepo.csv", false);
        boolean boolean6 = researcher5.isApproved();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test1519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1519");
        com.reservation_system.model.Faculty faculty5 = new com.reservation_system.model.Faculty(5, "researcher", "guest", "faculty", true);
        java.lang.String str6 = faculty5.getUserType();
        java.lang.String str7 = faculty5.getEmail();
        java.lang.String str8 = faculty5.getName();
        faculty5.setApproved(false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Faculty" + "'", str6, "Faculty");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "guest" + "'", str7, "guest");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "researcher" + "'", str8, "researcher");
    }

    @Test
    public void test1520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1520");
        com.reservation_system.model.Researcher researcher5 = new com.reservation_system.model.Researcher((int) 'a', "labmanager", "faculty", "", false);
        boolean boolean6 = researcher5.isApproved();
        boolean boolean7 = researcher5.requiresDepartmentApproval();
        boolean boolean8 = researcher5.isApproved();
        java.lang.String str9 = researcher5.getName();
        int int10 = researcher5.getID();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "labmanager" + "'", str9, "labmanager");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 97 + "'", int10 == 97);
    }

    @Test
    public void test1521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1521");
        com.reservation_system.model.Student student5 = new com.reservation_system.model.Student(0, "Guest", "Password1!", "data/test-userrepo.csv", true);
        java.lang.String str6 = student5.getEmail();
        java.lang.String str7 = student5.getUserType();
        java.lang.String str8 = student5.getName();
        boolean boolean9 = student5.requiresDepartmentApproval();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Password1!" + "'", str6, "Password1!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Student" + "'", str7, "Student");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Guest" + "'", str8, "Guest");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test1522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1522");
        com.reservation_system.model.User user6 = com.reservation_system.patterns.factory.UserFactory.createUser("Guest", (int) (byte) -1, "student", "Guest", "Alice", true);
        org.junit.Assert.assertNotNull(user6);
    }

    @Test
    public void test1523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1523");
        com.reservation_system.model.User user6 = com.reservation_system.patterns.factory.UserFactory.createUser("labmanager", 1, "Researcher", "data/test-userrepo.csv", "faculty", true);
        java.lang.String str7 = user6.getName();
        boolean boolean8 = user6.isApproved();
        org.junit.Assert.assertNotNull(user6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Researcher" + "'", str7, "Researcher");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test1524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1524");
        com.reservation_system.model.HeadLabCoordinator headLabCoordinator5 = new com.reservation_system.model.HeadLabCoordinator(101, "student", "", "", false);
    }

    @Test
    public void test1525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1525");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("data/test-userrepo.csv");
        int int2 = userRepository1.getNextID();
        int int3 = userRepository1.getNextID();
        com.reservation_system.model.HeadLabCoordinator headLabCoordinator9 = new com.reservation_system.model.HeadLabCoordinator((int) (byte) 1, "", "", "guest", false);
        userRepository1.addUser((com.reservation_system.model.User) headLabCoordinator9);
        java.util.List<com.reservation_system.model.User> userList11 = userRepository1.getAllUsers();
        com.reservation_system.repository.UserRepository userRepository13 = new com.reservation_system.repository.UserRepository("data/test-userrepo.csv");
        java.util.List<com.reservation_system.model.User> userList14 = userRepository13.getAllUsers();
        int int15 = userRepository13.getNextID();
        com.reservation_system.repository.UserRepository userRepository17 = new com.reservation_system.repository.UserRepository("data/test-userrepo.csv");
        java.util.List<com.reservation_system.model.User> userList18 = userRepository17.getAllUsers();
        int int19 = userRepository17.getNextID();
        boolean boolean21 = userRepository17.emailExists("headlabcoordinator");
        boolean boolean22 = userRepository17.headLabCoordinatorExists();
        java.util.Optional<com.reservation_system.model.User> userOptional24 = userRepository17.findByEmail("Alice");
        boolean boolean26 = userRepository17.emailExists("Alice");
        boolean boolean28 = userRepository17.emailExists("Guest");
        boolean boolean30 = userRepository17.emailExists("headlabcoordinator");
        java.util.List<com.reservation_system.model.User> userList31 = userRepository17.getAllUsers();
        userRepository13.saveAllUsers(userList31);
        userRepository1.saveAllUsers(userList31);
        java.util.Optional<com.reservation_system.model.User> userOptional35 = userRepository1.findByEmail("alice@example.com");
        com.reservation_system.repository.UserRepository userRepository37 = new com.reservation_system.repository.UserRepository("data/test-userrepo.csv");
        int int38 = userRepository37.getNextID();
        int int39 = userRepository37.getNextID();
        java.util.List<com.reservation_system.model.User> userList40 = userRepository37.getAllUsers();
        boolean boolean42 = userRepository37.emailExists("Guest");
        com.reservation_system.repository.UserRepository userRepository44 = new com.reservation_system.repository.UserRepository("data/test-userrepo.csv");
        int int45 = userRepository44.getNextID();
        com.reservation_system.repository.UserRepository userRepository47 = new com.reservation_system.repository.UserRepository("data/test-userrepo.csv");
        com.reservation_system.model.Researcher researcher53 = new com.reservation_system.model.Researcher(5, "hi!", "labmanager", "Guest", false);
        userRepository47.addUser((com.reservation_system.model.User) researcher53);
        java.util.List<com.reservation_system.model.User> userList55 = userRepository47.getAllUsers();
        com.reservation_system.model.Guest guest61 = new com.reservation_system.model.Guest(0, "Password1!", "data/test-userrepo.csv", "researcher", false);
        boolean boolean62 = guest61.requiresDepartmentApproval();
        userRepository47.addUser((com.reservation_system.model.User) guest61);
        boolean boolean65 = userRepository47.emailExists("Alice");
        int int66 = userRepository47.getNextID();
        com.reservation_system.repository.UserRepository userRepository68 = new com.reservation_system.repository.UserRepository("data/test-userrepo.csv");
        boolean boolean70 = userRepository68.emailExists("Alice");
        com.reservation_system.repository.UserRepository userRepository72 = new com.reservation_system.repository.UserRepository("data/test-userrepo.csv");
        java.util.List<com.reservation_system.model.User> userList73 = userRepository72.getAllUsers();
        int int74 = userRepository72.getNextID();
        java.util.List<com.reservation_system.model.User> userList75 = userRepository72.getAllUsers();
        userRepository68.saveAllUsers(userList75);
        userRepository47.saveAllUsers(userList75);
        userRepository44.saveAllUsers(userList75);
        userRepository37.saveAllUsers(userList75);
        userRepository1.saveAllUsers(userList75);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 101 + "'", int2 == 101);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 101 + "'", int3 == 101);
        org.junit.Assert.assertNotNull(userList11);
        org.junit.Assert.assertNotNull(userList14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 101 + "'", int15 == 101);
        org.junit.Assert.assertNotNull(userList18);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 101 + "'", int19 == 101);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertNotNull(userOptional24);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
// flaky "5) test1525(com.reservation_system.randoop.userrepository.RegressionTest3)":         org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNotNull(userList31);
        org.junit.Assert.assertNotNull(userOptional35);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 101 + "'", int38 == 101);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 101 + "'", int39 == 101);
        org.junit.Assert.assertNotNull(userList40);
// flaky "4) test1525(com.reservation_system.randoop.userrepository.RegressionTest3)":         org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + true + "'", boolean42 == true);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 101 + "'", int45 == 101);
        org.junit.Assert.assertNotNull(userList55);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + false + "'", boolean62 == false);
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + false + "'", boolean65 == false);
        org.junit.Assert.assertTrue("'" + int66 + "' != '" + 101 + "'", int66 == 101);
        org.junit.Assert.assertTrue("'" + boolean70 + "' != '" + false + "'", boolean70 == false);
        org.junit.Assert.assertNotNull(userList73);
        org.junit.Assert.assertTrue("'" + int74 + "' != '" + 101 + "'", int74 == 101);
        org.junit.Assert.assertNotNull(userList75);
    }

    @Test
    public void test1526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1526");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("data/test-userrepo.csv");
        com.reservation_system.model.Faculty faculty7 = new com.reservation_system.model.Faculty(5, "researcher", "guest", "faculty", true);
        java.lang.String str8 = faculty7.getUserType();
        java.lang.String str9 = faculty7.getUserType();
        userRepository1.addUser((com.reservation_system.model.User) faculty7);
        com.reservation_system.repository.UserRepository userRepository12 = new com.reservation_system.repository.UserRepository("data/test-userrepo.csv");
        boolean boolean14 = userRepository12.emailExists("Alice");
        com.reservation_system.repository.UserRepository userRepository16 = new com.reservation_system.repository.UserRepository("data/test-userrepo.csv");
        java.util.List<com.reservation_system.model.User> userList17 = userRepository16.getAllUsers();
        int int18 = userRepository16.getNextID();
        java.util.List<com.reservation_system.model.User> userList19 = userRepository16.getAllUsers();
        userRepository12.saveAllUsers(userList19);
        userRepository1.saveAllUsers(userList19);
        boolean boolean22 = userRepository1.headLabCoordinatorExists();
        int int23 = userRepository1.getNextID();
        int int24 = userRepository1.getNextID();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Faculty" + "'", str8, "Faculty");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Faculty" + "'", str9, "Faculty");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(userList17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 101 + "'", int18 == 101);
        org.junit.Assert.assertNotNull(userList19);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 101 + "'", int23 == 101);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 101 + "'", int24 == 101);
    }

    @Test
    public void test1527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1527");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("data/test-userrepo.csv");
        com.reservation_system.model.Researcher researcher7 = new com.reservation_system.model.Researcher(5, "hi!", "labmanager", "Guest", false);
        userRepository1.addUser((com.reservation_system.model.User) researcher7);
        int int9 = userRepository1.getNextID();
        com.reservation_system.repository.UserRepository userRepository11 = new com.reservation_system.repository.UserRepository("data/test-userrepo.csv");
        com.reservation_system.model.Researcher researcher17 = new com.reservation_system.model.Researcher(5, "hi!", "labmanager", "Guest", false);
        userRepository11.addUser((com.reservation_system.model.User) researcher17);
        java.util.List<com.reservation_system.model.User> userList19 = userRepository11.getAllUsers();
        boolean boolean20 = userRepository11.headLabCoordinatorExists();
        boolean boolean22 = userRepository11.emailExists("guest");
        com.reservation_system.repository.UserRepository userRepository24 = new com.reservation_system.repository.UserRepository("data/test-userrepo.csv");
        boolean boolean26 = userRepository24.emailExists("Alice");
        com.reservation_system.repository.UserRepository userRepository28 = new com.reservation_system.repository.UserRepository("data/test-userrepo.csv");
        java.util.List<com.reservation_system.model.User> userList29 = userRepository28.getAllUsers();
        int int30 = userRepository28.getNextID();
        java.util.List<com.reservation_system.model.User> userList31 = userRepository28.getAllUsers();
        userRepository24.saveAllUsers(userList31);
        userRepository11.saveAllUsers(userList31);
        java.util.List<com.reservation_system.model.User> userList34 = userRepository11.getAllUsers();
        userRepository1.saveAllUsers(userList34);
        java.util.Optional<com.reservation_system.model.User> userOptional37 = userRepository1.findByEmail("hi!");
        java.util.Optional<com.reservation_system.model.User> userOptional39 = userRepository1.findByEmail("Guest");
        boolean boolean40 = userRepository1.headLabCoordinatorExists();
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 101 + "'", int9 == 101);
        org.junit.Assert.assertNotNull(userList19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(userList29);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 101 + "'", int30 == 101);
        org.junit.Assert.assertNotNull(userList31);
        org.junit.Assert.assertNotNull(userList34);
        org.junit.Assert.assertNotNull(userOptional37);
        org.junit.Assert.assertNotNull(userOptional39);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + true + "'", boolean40 == true);
    }

    @Test
    public void test1528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1528");
        com.reservation_system.model.HeadLabCoordinator headLabCoordinator5 = new com.reservation_system.model.HeadLabCoordinator((int) (short) -1, "data/test-userrepo.csv", "guest", "labmanager", true);
        int int6 = headLabCoordinator5.getID();
        java.lang.String str7 = headLabCoordinator5.getPassword();
        java.lang.String str8 = headLabCoordinator5.getUserType();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "labmanager" + "'", str7, "labmanager");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "headlabcoordinator" + "'", str8, "headlabcoordinator");
    }

    @Test
    public void test1529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1529");
        com.reservation_system.model.LabManager labManager5 = new com.reservation_system.model.LabManager((int) '#', "data/test-userrepo.csv", "headlabcoordinator", "researcher", false);
        java.lang.String str6 = labManager5.getEmail();
        java.lang.String str7 = labManager5.getUserType();
        java.lang.String str8 = labManager5.getPassword();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "headlabcoordinator" + "'", str6, "headlabcoordinator");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "labmanager" + "'", str7, "labmanager");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "researcher" + "'", str8, "researcher");
    }

    @Test
    public void test1530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1530");
        com.reservation_system.model.Faculty faculty5 = new com.reservation_system.model.Faculty((int) (byte) 1, "faculty", "student", "labmanager", true);
        boolean boolean6 = faculty5.isApproved();
        java.lang.String str7 = faculty5.getPassword();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "labmanager" + "'", str7, "labmanager");
    }

    @Test
    public void test1531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1531");
        com.reservation_system.model.Guest guest5 = new com.reservation_system.model.Guest(98, "labmanager", "labmanager", "Faculty", true);
    }

    @Test
    public void test1532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1532");
        com.reservation_system.model.Guest guest5 = new com.reservation_system.model.Guest((int) (short) 0, "Researcher", "Faculty", "headlabcoordinator", true);
    }

    @Test
    public void test1533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1533");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("data/test-userrepo.csv");
        com.reservation_system.model.Faculty faculty7 = new com.reservation_system.model.Faculty(5, "researcher", "guest", "faculty", true);
        java.lang.String str8 = faculty7.getUserType();
        java.lang.String str9 = faculty7.getUserType();
        userRepository1.addUser((com.reservation_system.model.User) faculty7);
        boolean boolean11 = userRepository1.headLabCoordinatorExists();
        java.util.List<com.reservation_system.model.User> userList12 = userRepository1.getAllUsers();
        int int13 = userRepository1.getNextID();
        int int14 = userRepository1.getNextID();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Faculty" + "'", str8, "Faculty");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Faculty" + "'", str9, "Faculty");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(userList12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 101 + "'", int13 == 101);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 101 + "'", int14 == 101);
    }

    @Test
    public void test1534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1534");
        com.reservation_system.model.LabManager labManager5 = new com.reservation_system.model.LabManager((int) '#', "researcher", "Guest", "headlabcoordinator", true);
        java.lang.String str6 = labManager5.getEmail();
        java.lang.String str7 = labManager5.getUserType();
        java.lang.String str8 = labManager5.getUserType();
        int int9 = labManager5.getID();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Guest" + "'", str6, "Guest");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "labmanager" + "'", str7, "labmanager");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "labmanager" + "'", str8, "labmanager");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 35 + "'", int9 == 35);
    }

    @Test
    public void test1535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1535");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("data/test-userrepo.csv");
        boolean boolean3 = userRepository1.emailExists("Alice");
        int int4 = userRepository1.getNextID();
        boolean boolean5 = userRepository1.headLabCoordinatorExists();
        boolean boolean6 = userRepository1.headLabCoordinatorExists();
        boolean boolean8 = userRepository1.emailExists("Researcher");
        boolean boolean10 = userRepository1.emailExists("hi!");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 101 + "'", int4 == 101);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
// flaky "6) test1535(com.reservation_system.randoop.userrepository.RegressionTest3)":         org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
// flaky "5) test1535(com.reservation_system.randoop.userrepository.RegressionTest3)":         org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test1536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1536");
        com.reservation_system.model.Researcher researcher5 = new com.reservation_system.model.Researcher(52, "Guest", "Researcher", "hi!", true);
        java.lang.String str6 = researcher5.getEmail();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Researcher" + "'", str6, "Researcher");
    }

    @Test
    public void test1537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1537");
        com.reservation_system.model.HeadLabCoordinator headLabCoordinator5 = new com.reservation_system.model.HeadLabCoordinator((int) (byte) 0, "labmanager", "Guest", "", false);
        int int6 = headLabCoordinator5.getID();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test1538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1538");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("data/test-userrepo.csv");
        boolean boolean3 = userRepository1.emailExists("Alice");
        java.util.List<com.reservation_system.model.User> userList4 = userRepository1.getAllUsers();
        int int5 = userRepository1.getNextID();
        int int6 = userRepository1.getNextID();
        boolean boolean8 = userRepository1.emailExists("researcher");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(userList4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 101 + "'", int5 == 101);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 101 + "'", int6 == 101);
// flaky "7) test1538(com.reservation_system.randoop.userrepository.RegressionTest3)":         org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test1539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1539");
        // The following exception was thrown during execution in test generation
        try {
            com.reservation_system.model.User user6 = com.reservation_system.patterns.factory.UserFactory.createUser("Password1!", 99, "hi!", "Password1!", "Faculty", true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid user type: Password1!");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1540");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("data/test-userrepo.csv");
        int int2 = userRepository1.getNextID();
        int int3 = userRepository1.getNextID();
        com.reservation_system.model.HeadLabCoordinator headLabCoordinator9 = new com.reservation_system.model.HeadLabCoordinator((int) (byte) 1, "", "", "guest", false);
        userRepository1.addUser((com.reservation_system.model.User) headLabCoordinator9);
        java.util.List<com.reservation_system.model.User> userList11 = userRepository1.getAllUsers();
        com.reservation_system.repository.UserRepository userRepository13 = new com.reservation_system.repository.UserRepository("data/test-userrepo.csv");
        java.util.List<com.reservation_system.model.User> userList14 = userRepository13.getAllUsers();
        int int15 = userRepository13.getNextID();
        com.reservation_system.repository.UserRepository userRepository17 = new com.reservation_system.repository.UserRepository("data/test-userrepo.csv");
        java.util.List<com.reservation_system.model.User> userList18 = userRepository17.getAllUsers();
        int int19 = userRepository17.getNextID();
        boolean boolean21 = userRepository17.emailExists("headlabcoordinator");
        boolean boolean22 = userRepository17.headLabCoordinatorExists();
        java.util.Optional<com.reservation_system.model.User> userOptional24 = userRepository17.findByEmail("Alice");
        boolean boolean26 = userRepository17.emailExists("Alice");
        boolean boolean28 = userRepository17.emailExists("Guest");
        boolean boolean30 = userRepository17.emailExists("headlabcoordinator");
        java.util.List<com.reservation_system.model.User> userList31 = userRepository17.getAllUsers();
        userRepository13.saveAllUsers(userList31);
        userRepository1.saveAllUsers(userList31);
        java.util.List<com.reservation_system.model.User> userList34 = userRepository1.getAllUsers();
        boolean boolean35 = userRepository1.headLabCoordinatorExists();
        java.util.Optional<com.reservation_system.model.User> userOptional37 = userRepository1.findByEmail("headlabcoordinator");
        java.util.List<com.reservation_system.model.User> userList38 = userRepository1.getAllUsers();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 101 + "'", int2 == 101);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 101 + "'", int3 == 101);
        org.junit.Assert.assertNotNull(userList11);
        org.junit.Assert.assertNotNull(userList14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 101 + "'", int15 == 101);
        org.junit.Assert.assertNotNull(userList18);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 101 + "'", int19 == 101);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertNotNull(userOptional24);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNotNull(userList31);
        org.junit.Assert.assertNotNull(userList34);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
        org.junit.Assert.assertNotNull(userOptional37);
        org.junit.Assert.assertNotNull(userList38);
    }

    @Test
    public void test1541() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1541");
        com.reservation_system.model.Student student5 = new com.reservation_system.model.Student(0, "faculty", "headlabcoordinator", "Student", false);
    }

    @Test
    public void test1542() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1542");
        com.reservation_system.model.LabManager labManager5 = new com.reservation_system.model.LabManager((int) (byte) 1, "student", "alice@example.com", "data/test-userrepo.csv", true);
        java.lang.String str6 = labManager5.getUserType();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "labmanager" + "'", str6, "labmanager");
    }

    @Test
    public void test1543() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1543");
        com.reservation_system.model.LabManager labManager5 = new com.reservation_system.model.LabManager(0, "Alice", "Guest", "Alice", false);
    }

    @Test
    public void test1544() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1544");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("data/test-userrepo.csv");
        java.util.List<com.reservation_system.model.User> userList2 = userRepository1.getAllUsers();
        int int3 = userRepository1.getNextID();
        boolean boolean5 = userRepository1.emailExists("headlabcoordinator");
        boolean boolean6 = userRepository1.headLabCoordinatorExists();
        java.util.Optional<com.reservation_system.model.User> userOptional8 = userRepository1.findByEmail("Alice");
        boolean boolean10 = userRepository1.emailExists("Alice");
        boolean boolean12 = userRepository1.emailExists("Guest");
        boolean boolean14 = userRepository1.emailExists("headlabcoordinator");
        com.reservation_system.repository.UserRepository userRepository16 = new com.reservation_system.repository.UserRepository("data/test-userrepo.csv");
        boolean boolean18 = userRepository16.emailExists("Alice");
        com.reservation_system.model.Researcher researcher24 = new com.reservation_system.model.Researcher((int) 'a', "labmanager", "faculty", "", false);
        boolean boolean25 = researcher24.isApproved();
        java.lang.String str26 = researcher24.getName();
        userRepository16.addUser((com.reservation_system.model.User) researcher24);
        boolean boolean28 = userRepository16.headLabCoordinatorExists();
        java.util.List<com.reservation_system.model.User> userList29 = userRepository16.getAllUsers();
        userRepository1.saveAllUsers(userList29);
        com.reservation_system.model.HeadLabCoordinator headLabCoordinator36 = new com.reservation_system.model.HeadLabCoordinator((int) (byte) 10, "Alice", "guest", "alice@example.com", true);
        java.lang.String str37 = headLabCoordinator36.getUserType();
        java.lang.String str38 = headLabCoordinator36.getUserType();
        java.lang.String str39 = headLabCoordinator36.getUserType();
        java.lang.String str40 = headLabCoordinator36.getUserType();
        userRepository1.addUser((com.reservation_system.model.User) headLabCoordinator36);
        java.lang.Class<?> wildcardClass42 = headLabCoordinator36.getClass();
        org.junit.Assert.assertNotNull(userList2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 101 + "'", int3 == 101);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(userOptional8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "labmanager" + "'", str26, "labmanager");
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertNotNull(userList29);
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "headlabcoordinator" + "'", str37, "headlabcoordinator");
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "headlabcoordinator" + "'", str38, "headlabcoordinator");
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "headlabcoordinator" + "'", str39, "headlabcoordinator");
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "headlabcoordinator" + "'", str40, "headlabcoordinator");
        org.junit.Assert.assertNotNull(wildcardClass42);
    }

    @Test
    public void test1545() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1545");
        com.reservation_system.model.Student student5 = new com.reservation_system.model.Student(1, "data/test-userrepo.csv", "alice@example.com", "guest", false);
        java.lang.String str6 = student5.getUserType();
        java.lang.String str7 = student5.getUserType();
        java.lang.String str8 = student5.getName();
        java.lang.String str9 = student5.getPassword();
        java.lang.String str10 = student5.getUserType();
        int int11 = student5.getID();
        java.lang.String str12 = student5.getUserType();
        java.lang.String str13 = student5.getUserType();
        int int14 = student5.getID();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Student" + "'", str6, "Student");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Student" + "'", str7, "Student");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "data/test-userrepo.csv" + "'", str8, "data/test-userrepo.csv");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "guest" + "'", str9, "guest");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Student" + "'", str10, "Student");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Student" + "'", str12, "Student");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Student" + "'", str13, "Student");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
    }

    @Test
    public void test1546() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1546");
        com.reservation_system.model.Researcher researcher5 = new com.reservation_system.model.Researcher((int) (short) 0, "student", "", "faculty", false);
    }

    @Test
    public void test1547() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1547");
        com.reservation_system.model.User user6 = com.reservation_system.patterns.factory.UserFactory.createUser("Guest", (int) (short) 10, "Password1!", "data/test-userrepo.csv", "researcher", false);
        boolean boolean7 = user6.requiresDepartmentApproval();
        java.lang.String str8 = user6.getPassword();
        org.junit.Assert.assertNotNull(user6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "researcher" + "'", str8, "researcher");
    }

    @Test
    public void test1548() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1548");
        com.reservation_system.model.Researcher researcher5 = new com.reservation_system.model.Researcher((int) 'a', "alice@example.com", "", "hi!", false);
        java.lang.Class<?> wildcardClass6 = researcher5.getClass();
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test1549() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1549");
        com.reservation_system.model.LabManager labManager5 = new com.reservation_system.model.LabManager(6, "Faculty", "", "data/test-userrepo.csv", true);
    }

    @Test
    public void test1550() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1550");
        com.reservation_system.model.LabManager labManager5 = new com.reservation_system.model.LabManager(10, "Password1!", "data/test-userrepo.csv", "Guest", true);
        java.lang.String str6 = labManager5.getUserType();
        boolean boolean7 = labManager5.requiresDepartmentApproval();
        boolean boolean8 = labManager5.isApproved();
        java.lang.Class<?> wildcardClass9 = labManager5.getClass();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "labmanager" + "'", str6, "labmanager");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test1551() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1551");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("data/test-userrepo.csv");
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
        com.reservation_system.model.Student student23 = new com.reservation_system.model.Student(1, "data/test-userrepo.csv", "alice@example.com", "guest", false);
        java.lang.String str24 = student23.getUserType();
        java.lang.String str25 = student23.getUserType();
        userRepository1.addUser((com.reservation_system.model.User) student23);
        boolean boolean28 = userRepository1.emailExists("faculty");
        boolean boolean30 = userRepository1.emailExists("data/test-userrepo.csv");
        com.reservation_system.model.Researcher researcher36 = new com.reservation_system.model.Researcher((int) (byte) 1, "Faculty", "", "Guest", false);
        userRepository1.addUser((com.reservation_system.model.User) researcher36);
        java.util.Optional<com.reservation_system.model.User> userOptional39 = userRepository1.findByEmail("Guest");
        org.junit.Assert.assertNotNull(userList2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 101 + "'", int3 == 101);
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
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertNotNull(userOptional39);
    }

    @Test
    public void test1552() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1552");
        com.reservation_system.model.Student student5 = new com.reservation_system.model.Student(0, "Guest", "Password1!", "data/test-userrepo.csv", true);
        java.lang.String str6 = student5.getPassword();
        int int7 = student5.getID();
        java.lang.String str8 = student5.getEmail();
        java.lang.String str9 = student5.getUserType();
        java.lang.String str10 = student5.getEmail();
        java.lang.Class<?> wildcardClass11 = student5.getClass();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "data/test-userrepo.csv" + "'", str6, "data/test-userrepo.csv");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Password1!" + "'", str8, "Password1!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Student" + "'", str9, "Student");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Password1!" + "'", str10, "Password1!");
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test1553() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1553");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("data/test-userrepo.csv");
        com.reservation_system.model.Researcher researcher7 = new com.reservation_system.model.Researcher(5, "hi!", "labmanager", "Guest", false);
        userRepository1.addUser((com.reservation_system.model.User) researcher7);
        int int9 = researcher7.getID();
        java.lang.String str10 = researcher7.getPassword();
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 5 + "'", int9 == 5);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Guest" + "'", str10, "Guest");
    }

    @Test
    public void test1554() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1554");
        com.reservation_system.model.Researcher researcher5 = new com.reservation_system.model.Researcher(1, "Student", "guest", "researcher", true);
        java.lang.String str6 = researcher5.getUserType();
        java.lang.String str7 = researcher5.getEmail();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Researcher" + "'", str6, "Researcher");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "guest" + "'", str7, "guest");
    }

    @Test
    public void test1555() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1555");
        com.reservation_system.model.Researcher researcher5 = new com.reservation_system.model.Researcher(100, "student", "guest", "headlabcoordinator", false);
        java.lang.String str6 = researcher5.getUserType();
        java.lang.String str7 = researcher5.getEmail();
        boolean boolean8 = researcher5.isApproved();
        researcher5.setApproved(false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Researcher" + "'", str6, "Researcher");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "guest" + "'", str7, "guest");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test1556() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1556");
        // The following exception was thrown during execution in test generation
        try {
            com.reservation_system.model.User user6 = com.reservation_system.patterns.factory.UserFactory.createUser("hi!", 11, "headlabcoordinator", "Faculty", "", true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid user type: hi!");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1557() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1557");
        com.reservation_system.model.Faculty faculty5 = new com.reservation_system.model.Faculty((int) (byte) 100, "student", "Password1!", "Guest", false);
        java.lang.String str6 = faculty5.getUserType();
        java.lang.String str7 = faculty5.getEmail();
        java.lang.String str8 = faculty5.getEmail();
        java.lang.String str9 = faculty5.getUserType();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Faculty" + "'", str6, "Faculty");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Password1!" + "'", str7, "Password1!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Password1!" + "'", str8, "Password1!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Faculty" + "'", str9, "Faculty");
    }

    @Test
    public void test1558() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1558");
        com.reservation_system.model.Faculty faculty5 = new com.reservation_system.model.Faculty((int) '#', "", "Faculty", "Student", true);
    }

    @Test
    public void test1559() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1559");
        com.reservation_system.model.HeadLabCoordinator headLabCoordinator5 = new com.reservation_system.model.HeadLabCoordinator((int) ' ', "student", "Alice", "headlabcoordinator", true);
    }

    @Test
    public void test1560() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1560");
        com.reservation_system.model.Guest guest5 = new com.reservation_system.model.Guest(5, "Guest", "student", "headlabcoordinator", false);
    }

    @Test
    public void test1561() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1561");
        com.reservation_system.model.Researcher researcher5 = new com.reservation_system.model.Researcher(100, "student", "guest", "headlabcoordinator", false);
        java.lang.String str6 = researcher5.getUserType();
        java.lang.String str7 = researcher5.getEmail();
        int int8 = researcher5.getID();
        boolean boolean9 = researcher5.requiresDepartmentApproval();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Researcher" + "'", str6, "Researcher");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "guest" + "'", str7, "guest");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8 == 100);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test1562() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1562");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("data/test-userrepo.csv");
        java.util.List<com.reservation_system.model.User> userList2 = userRepository1.getAllUsers();
        int int3 = userRepository1.getNextID();
        boolean boolean5 = userRepository1.emailExists("headlabcoordinator");
        boolean boolean6 = userRepository1.headLabCoordinatorExists();
        java.util.Optional<com.reservation_system.model.User> userOptional8 = userRepository1.findByEmail("Alice");
        boolean boolean10 = userRepository1.emailExists("guest");
        java.util.Optional<com.reservation_system.model.User> userOptional12 = userRepository1.findByEmail("");
        boolean boolean14 = userRepository1.emailExists("");
        org.junit.Assert.assertNotNull(userList2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 101 + "'", int3 == 101);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(userOptional8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(userOptional12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test1563() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1563");
        com.reservation_system.model.Researcher researcher5 = new com.reservation_system.model.Researcher((int) (short) 0, "student", "labmanager", "data/test-userrepo.csv", false);
        java.lang.String str6 = researcher5.getUserType();
        int int7 = researcher5.getID();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Researcher" + "'", str6, "Researcher");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test1564() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1564");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("data/test-userrepo.csv");
        com.reservation_system.model.Researcher researcher7 = new com.reservation_system.model.Researcher(5, "hi!", "labmanager", "Guest", false);
        userRepository1.addUser((com.reservation_system.model.User) researcher7);
        int int9 = userRepository1.getNextID();
        java.util.Optional<com.reservation_system.model.User> userOptional11 = userRepository1.findByEmail("headlabcoordinator");
        int int12 = userRepository1.getNextID();
        java.util.Optional<com.reservation_system.model.User> userOptional14 = userRepository1.findByEmail("Faculty");
        com.reservation_system.repository.UserRepository userRepository16 = new com.reservation_system.repository.UserRepository("data/test-userrepo.csv");
        java.util.List<com.reservation_system.model.User> userList17 = userRepository16.getAllUsers();
        userRepository1.saveAllUsers(userList17);
        java.util.List<com.reservation_system.model.User> userList19 = userRepository1.getAllUsers();
        com.reservation_system.model.User user26 = com.reservation_system.patterns.factory.UserFactory.createUser("labmanager", (int) (short) 10, "Faculty", "hi!", "Password1!", true);
        userRepository1.addUser(user26);
        int int28 = userRepository1.getNextID();
        java.util.Optional<com.reservation_system.model.User> userOptional30 = userRepository1.findByEmail("guest");
        com.reservation_system.model.LabManager labManager36 = new com.reservation_system.model.LabManager((int) (short) -1, "faculty", "Guest", "Guest", true);
        userRepository1.addUser((com.reservation_system.model.User) labManager36);
        java.util.List<com.reservation_system.model.User> userList38 = null;
        // The following exception was thrown during execution in test generation
        try {
            userRepository1.saveAllUsers(userList38);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 101 + "'", int9 == 101);
        org.junit.Assert.assertNotNull(userOptional11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 101 + "'", int12 == 101);
        org.junit.Assert.assertNotNull(userOptional14);
        org.junit.Assert.assertNotNull(userList17);
        org.junit.Assert.assertNotNull(userList19);
        org.junit.Assert.assertNotNull(user26);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 101 + "'", int28 == 101);
        org.junit.Assert.assertNotNull(userOptional30);
    }

    @Test
    public void test1565() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1565");
        com.reservation_system.model.Guest guest5 = new com.reservation_system.model.Guest((int) '#', "hi!", "data/test-userrepo.csv", "", false);
        java.lang.String str6 = guest5.getEmail();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "data/test-userrepo.csv" + "'", str6, "data/test-userrepo.csv");
    }

    @Test
    public void test1566() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1566");
        com.reservation_system.model.User user6 = com.reservation_system.patterns.factory.UserFactory.createUser("Student", 10, "Alice", "Guest", "", false);
        boolean boolean7 = user6.requiresDepartmentApproval();
        int int8 = user6.getID();
        org.junit.Assert.assertNotNull(user6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 10 + "'", int8 == 10);
    }

    @Test
    public void test1567() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1567");
        com.reservation_system.model.HeadLabCoordinator headLabCoordinator5 = new com.reservation_system.model.HeadLabCoordinator(97, "Faculty", "labmanager", "Alice", true);
        java.lang.String str6 = headLabCoordinator5.getPassword();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Alice" + "'", str6, "Alice");
    }

    @Test
    public void test1568() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1568");
        com.reservation_system.model.LabManager labManager5 = new com.reservation_system.model.LabManager((int) '4', "labmanager", "Researcher", "guest", true);
    }

    @Test
    public void test1569() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1569");
        com.reservation_system.model.Guest guest5 = new com.reservation_system.model.Guest((int) (short) 10, "", "headlabcoordinator", "alice@example.com", true);
        java.lang.String str6 = guest5.getUserType();
        int int7 = guest5.getID();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Guest" + "'", str6, "Guest");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 10 + "'", int7 == 10);
    }

    @Test
    public void test1570() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1570");
        com.reservation_system.model.LabManager labManager5 = new com.reservation_system.model.LabManager(11, "hi!", "Student", "Alice", true);
        labManager5.setApproved(false);
    }

    @Test
    public void test1571() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1571");
        com.reservation_system.model.Faculty faculty5 = new com.reservation_system.model.Faculty((int) (short) 10, "labmanager", "headlabcoordinator", "hi!", true);
        java.lang.String str6 = faculty5.getEmail();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "headlabcoordinator" + "'", str6, "headlabcoordinator");
    }

    @Test
    public void test1572() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1572");
        com.reservation_system.model.Faculty faculty5 = new com.reservation_system.model.Faculty((int) (byte) 10, "Password1!", "guest", "Faculty", false);
        boolean boolean6 = faculty5.requiresDepartmentApproval();
        java.lang.String str7 = faculty5.getUserType();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Faculty" + "'", str7, "Faculty");
    }

    @Test
    public void test1573() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1573");
        // The following exception was thrown during execution in test generation
        try {
            com.reservation_system.model.User user6 = com.reservation_system.patterns.factory.UserFactory.createUser("", 102, "guest", "Faculty", "Student", true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid user type: ");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1574() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1574");
        com.reservation_system.model.Student student5 = new com.reservation_system.model.Student(100, "student", "researcher", "Alice", false);
        java.lang.String str6 = student5.getUserType();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Student" + "'", str6, "Student");
    }

    @Test
    public void test1575() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1575");
        com.reservation_system.model.Student student5 = new com.reservation_system.model.Student(1, "data/test-userrepo.csv", "alice@example.com", "guest", false);
        java.lang.String str6 = student5.getUserType();
        java.lang.String str7 = student5.getUserType();
        java.lang.String str8 = student5.getName();
        boolean boolean9 = student5.requiresDepartmentApproval();
        student5.setApproved(false);
        java.lang.String str12 = student5.getUserType();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Student" + "'", str6, "Student");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Student" + "'", str7, "Student");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "data/test-userrepo.csv" + "'", str8, "data/test-userrepo.csv");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Student" + "'", str12, "Student");
    }

    @Test
    public void test1576() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1576");
        com.reservation_system.model.Researcher researcher5 = new com.reservation_system.model.Researcher((int) 'a', "", "labmanager", "data/test-userrepo.csv", true);
        researcher5.setApproved(false);
        java.lang.String str8 = researcher5.getUserType();
        java.lang.String str9 = researcher5.getUserType();
        java.lang.Class<?> wildcardClass10 = researcher5.getClass();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Researcher" + "'", str8, "Researcher");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Researcher" + "'", str9, "Researcher");
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test1577() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1577");
        com.reservation_system.model.Faculty faculty5 = new com.reservation_system.model.Faculty((int) (byte) 100, "Student", "headlabcoordinator", "Faculty", true);
    }

    @Test
    public void test1578() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1578");
        com.reservation_system.model.Faculty faculty5 = new com.reservation_system.model.Faculty(11, "data/test-userrepo.csv", "", "data/test-userrepo.csv", false);
    }

    @Test
    public void test1579() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1579");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("data/test-userrepo.csv");
        com.reservation_system.model.Faculty faculty7 = new com.reservation_system.model.Faculty(5, "researcher", "guest", "faculty", true);
        java.lang.String str8 = faculty7.getUserType();
        java.lang.String str9 = faculty7.getUserType();
        userRepository1.addUser((com.reservation_system.model.User) faculty7);
        boolean boolean11 = faculty7.requiresDepartmentApproval();
        java.lang.String str12 = faculty7.getEmail();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Faculty" + "'", str8, "Faculty");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Faculty" + "'", str9, "Faculty");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "guest" + "'", str12, "guest");
    }

    @Test
    public void test1580() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1580");
        com.reservation_system.model.Guest guest5 = new com.reservation_system.model.Guest(0, "", "Guest", "Researcher", true);
    }

    @Test
    public void test1581() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1581");
        com.reservation_system.model.Faculty faculty5 = new com.reservation_system.model.Faculty(5, "researcher", "guest", "faculty", true);
        java.lang.String str6 = faculty5.getUserType();
        java.lang.String str7 = faculty5.getEmail();
        java.lang.String str8 = faculty5.getUserType();
        java.lang.String str9 = faculty5.getUserType();
        boolean boolean10 = faculty5.isApproved();
        java.lang.String str11 = faculty5.getUserType();
        int int12 = faculty5.getID();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Faculty" + "'", str6, "Faculty");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "guest" + "'", str7, "guest");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Faculty" + "'", str8, "Faculty");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Faculty" + "'", str9, "Faculty");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Faculty" + "'", str11, "Faculty");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 5 + "'", int12 == 5);
    }

    @Test
    public void test1582() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1582");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("data/test-userrepo.csv");
        boolean boolean3 = userRepository1.emailExists("Alice");
        int int4 = userRepository1.getNextID();
        boolean boolean5 = userRepository1.headLabCoordinatorExists();
        java.util.List<com.reservation_system.model.User> userList6 = userRepository1.getAllUsers();
        int int7 = userRepository1.getNextID();
        com.reservation_system.model.LabManager labManager13 = new com.reservation_system.model.LabManager((int) (byte) 100, "researcher", "alice@example.com", "", false);
        userRepository1.addUser((com.reservation_system.model.User) labManager13);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
// flaky "8) test1582(com.reservation_system.randoop.userrepository.RegressionTest3)":         org.junit.Assert.assertTrue("'" + int4 + "' != '" + 33 + "'", int4 == 33);
// flaky "6) test1582(com.reservation_system.randoop.userrepository.RegressionTest3)":         org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(userList6);
// flaky "4) test1582(com.reservation_system.randoop.userrepository.RegressionTest3)":         org.junit.Assert.assertTrue("'" + int7 + "' != '" + 33 + "'", int7 == 33);
    }

    @Test
    public void test1583() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1583");
        com.reservation_system.model.LabManager labManager5 = new com.reservation_system.model.LabManager((int) (short) 0, "Student", "", "Guest", true);
    }

    @Test
    public void test1584() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1584");
        com.reservation_system.model.HeadLabCoordinator headLabCoordinator5 = new com.reservation_system.model.HeadLabCoordinator((int) (byte) -1, "", "Faculty", "Faculty", true);
        headLabCoordinator5.setApproved(false);
    }

    @Test
    public void test1585() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1585");
        com.reservation_system.model.HeadLabCoordinator headLabCoordinator5 = new com.reservation_system.model.HeadLabCoordinator((int) (short) 0, "", "", "Researcher", false);
        java.lang.String str6 = headLabCoordinator5.getEmail();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
    }

    @Test
    public void test1586() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1586");
        com.reservation_system.model.LabManager labManager5 = new com.reservation_system.model.LabManager(97, "hi!", "", "student", true);
    }

    @Test
    public void test1587() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1587");
        com.reservation_system.model.Guest guest5 = new com.reservation_system.model.Guest((int) (byte) 0, "researcher", "student", "Researcher", true);
    }

    @Test
    public void test1588() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1588");
        com.reservation_system.model.Student student5 = new com.reservation_system.model.Student(1, "data/test-userrepo.csv", "alice@example.com", "guest", false);
        java.lang.String str6 = student5.getUserType();
        java.lang.String str7 = student5.getUserType();
        java.lang.String str8 = student5.getName();
        boolean boolean9 = student5.requiresDepartmentApproval();
        java.lang.String str10 = student5.getName();
        java.lang.String str11 = student5.getUserType();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Student" + "'", str6, "Student");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Student" + "'", str7, "Student");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "data/test-userrepo.csv" + "'", str8, "data/test-userrepo.csv");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "data/test-userrepo.csv" + "'", str10, "data/test-userrepo.csv");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Student" + "'", str11, "Student");
    }

    @Test
    public void test1589() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1589");
        com.reservation_system.model.Faculty faculty5 = new com.reservation_system.model.Faculty((int) (byte) -1, "Alice", "researcher", "Password1!", false);
        java.lang.String str6 = faculty5.getName();
        java.lang.String str7 = faculty5.getUserType();
        java.lang.String str8 = faculty5.getUserType();
        java.lang.String str9 = faculty5.getPassword();
        java.lang.String str10 = faculty5.getEmail();
        java.lang.String str11 = faculty5.getUserType();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Alice" + "'", str6, "Alice");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Faculty" + "'", str7, "Faculty");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Faculty" + "'", str8, "Faculty");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Password1!" + "'", str9, "Password1!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "researcher" + "'", str10, "researcher");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Faculty" + "'", str11, "Faculty");
    }

    @Test
    public void test1590() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1590");
        com.reservation_system.model.Researcher researcher5 = new com.reservation_system.model.Researcher(6, "Student", "Faculty", "researcher", true);
    }

    @Test
    public void test1591() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1591");
        com.reservation_system.model.Researcher researcher5 = new com.reservation_system.model.Researcher(10, "labmanager", "Faculty", "student", false);
        boolean boolean6 = researcher5.requiresDepartmentApproval();
        java.lang.String str7 = researcher5.getName();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "labmanager" + "'", str7, "labmanager");
    }

    @Test
    public void test1592() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1592");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("data/test-userrepo.csv");
        com.reservation_system.model.Researcher researcher7 = new com.reservation_system.model.Researcher(5, "hi!", "labmanager", "Guest", false);
        userRepository1.addUser((com.reservation_system.model.User) researcher7);
        int int9 = userRepository1.getNextID();
        java.util.Optional<com.reservation_system.model.User> userOptional11 = userRepository1.findByEmail("headlabcoordinator");
        int int12 = userRepository1.getNextID();
        java.util.Optional<com.reservation_system.model.User> userOptional14 = userRepository1.findByEmail("Faculty");
        java.util.List<com.reservation_system.model.User> userList15 = userRepository1.getAllUsers();
        java.util.Optional<com.reservation_system.model.User> userOptional17 = userRepository1.findByEmail("data/test-userrepo.csv");
        java.util.List<com.reservation_system.model.User> userList18 = userRepository1.getAllUsers();
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 101 + "'", int9 == 101);
        org.junit.Assert.assertNotNull(userOptional11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 101 + "'", int12 == 101);
        org.junit.Assert.assertNotNull(userOptional14);
        org.junit.Assert.assertNotNull(userList15);
        org.junit.Assert.assertNotNull(userOptional17);
        org.junit.Assert.assertNotNull(userList18);
    }

    @Test
    public void test1593() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1593");
        com.reservation_system.model.Student student5 = new com.reservation_system.model.Student(99, "hi!", "Alice", "Student", false);
    }

    @Test
    public void test1594() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1594");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("data/test-userrepo.csv");
        java.util.List<com.reservation_system.model.User> userList2 = userRepository1.getAllUsers();
        int int3 = userRepository1.getNextID();
        boolean boolean5 = userRepository1.emailExists("headlabcoordinator");
        java.util.Optional<com.reservation_system.model.User> userOptional7 = userRepository1.findByEmail("student");
        com.reservation_system.repository.UserRepository userRepository9 = new com.reservation_system.repository.UserRepository("data/test-userrepo.csv");
        java.util.List<com.reservation_system.model.User> userList10 = userRepository9.getAllUsers();
        int int11 = userRepository9.getNextID();
        boolean boolean13 = userRepository9.emailExists("headlabcoordinator");
        boolean boolean14 = userRepository9.headLabCoordinatorExists();
        java.util.Optional<com.reservation_system.model.User> userOptional16 = userRepository9.findByEmail("Alice");
        boolean boolean18 = userRepository9.emailExists("guest");
        java.util.List<com.reservation_system.model.User> userList19 = userRepository9.getAllUsers();
        userRepository1.saveAllUsers(userList19);
        java.util.List<com.reservation_system.model.User> userList21 = userRepository1.getAllUsers();
        boolean boolean22 = userRepository1.headLabCoordinatorExists();
        org.junit.Assert.assertNotNull(userList2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 101 + "'", int3 == 101);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(userOptional7);
        org.junit.Assert.assertNotNull(userList10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 101 + "'", int11 == 101);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
// flaky "9) test1594(com.reservation_system.randoop.userrepository.RegressionTest3)":         org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(userOptional16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(userList19);
        org.junit.Assert.assertNotNull(userList21);
// flaky "7) test1594(com.reservation_system.randoop.userrepository.RegressionTest3)":         org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
    }

    @Test
    public void test1595() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1595");
        com.reservation_system.model.LabManager labManager5 = new com.reservation_system.model.LabManager((int) (short) 100, "guest", "data/test-userrepo.csv", "student", true);
    }

    @Test
    public void test1596() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1596");
        com.reservation_system.model.Researcher researcher5 = new com.reservation_system.model.Researcher(6, "researcher", "student", "student", true);
    }

    @Test
    public void test1597() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1597");
        com.reservation_system.model.LabManager labManager5 = new com.reservation_system.model.LabManager((int) ' ', "student", "Guest", "data/test-userrepo.csv", false);
    }

    @Test
    public void test1598() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1598");
        com.reservation_system.model.Guest guest5 = new com.reservation_system.model.Guest((int) (byte) 100, "guest", "Faculty", "student", false);
        java.lang.String str6 = guest5.getPassword();
        boolean boolean7 = guest5.requiresDepartmentApproval();
        guest5.setApproved(false);
        java.lang.String str10 = guest5.getUserType();
        java.lang.String str11 = guest5.getUserType();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "student" + "'", str6, "student");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Guest" + "'", str10, "Guest");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Guest" + "'", str11, "Guest");
    }

    @Test
    public void test1599() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1599");
        com.reservation_system.model.HeadLabCoordinator headLabCoordinator5 = new com.reservation_system.model.HeadLabCoordinator((int) ' ', "alice@example.com", "Faculty", "hi!", true);
        java.lang.String str6 = headLabCoordinator5.getPassword();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
    }

    @Test
    public void test1600() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1600");
        com.reservation_system.model.Faculty faculty5 = new com.reservation_system.model.Faculty((int) (short) 10, "", "", "alice@example.com", false);
    }

    @Test
    public void test1601() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1601");
        com.reservation_system.model.User user6 = com.reservation_system.patterns.factory.UserFactory.createUser("Student", 5, "", "Student", "Password1!", true);
        java.lang.String str7 = user6.getEmail();
        org.junit.Assert.assertNotNull(user6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Student" + "'", str7, "Student");
    }

    @Test
    public void test1602() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1602");
        com.reservation_system.model.Guest guest5 = new com.reservation_system.model.Guest(35, "Faculty", "Alice", "Alice", false);
        java.lang.String str6 = guest5.getEmail();
        java.lang.String str7 = guest5.getUserType();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Alice" + "'", str6, "Alice");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Guest" + "'", str7, "Guest");
    }

    @Test
    public void test1603() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1603");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("data/test-userrepo.csv");
        int int2 = userRepository1.getNextID();
        boolean boolean3 = userRepository1.headLabCoordinatorExists();
        com.reservation_system.repository.UserRepository userRepository5 = new com.reservation_system.repository.UserRepository("data/test-userrepo.csv");
        boolean boolean7 = userRepository5.emailExists("Alice");
        com.reservation_system.model.Researcher researcher13 = new com.reservation_system.model.Researcher((int) 'a', "labmanager", "faculty", "", false);
        boolean boolean14 = researcher13.isApproved();
        java.lang.String str15 = researcher13.getName();
        userRepository5.addUser((com.reservation_system.model.User) researcher13);
        boolean boolean17 = userRepository5.headLabCoordinatorExists();
        java.util.List<com.reservation_system.model.User> userList18 = userRepository5.getAllUsers();
        userRepository1.saveAllUsers(userList18);
        com.reservation_system.repository.UserRepository userRepository21 = new com.reservation_system.repository.UserRepository("data/test-userrepo.csv");
        int int22 = userRepository21.getNextID();
        com.reservation_system.repository.UserRepository userRepository24 = new com.reservation_system.repository.UserRepository("data/test-userrepo.csv");
        com.reservation_system.model.Researcher researcher30 = new com.reservation_system.model.Researcher(5, "hi!", "labmanager", "Guest", false);
        userRepository24.addUser((com.reservation_system.model.User) researcher30);
        java.util.List<com.reservation_system.model.User> userList32 = userRepository24.getAllUsers();
        com.reservation_system.model.Guest guest38 = new com.reservation_system.model.Guest(0, "Password1!", "data/test-userrepo.csv", "researcher", false);
        boolean boolean39 = guest38.requiresDepartmentApproval();
        userRepository24.addUser((com.reservation_system.model.User) guest38);
        boolean boolean42 = userRepository24.emailExists("Alice");
        int int43 = userRepository24.getNextID();
        com.reservation_system.repository.UserRepository userRepository45 = new com.reservation_system.repository.UserRepository("data/test-userrepo.csv");
        boolean boolean47 = userRepository45.emailExists("Alice");
        com.reservation_system.repository.UserRepository userRepository49 = new com.reservation_system.repository.UserRepository("data/test-userrepo.csv");
        java.util.List<com.reservation_system.model.User> userList50 = userRepository49.getAllUsers();
        int int51 = userRepository49.getNextID();
        java.util.List<com.reservation_system.model.User> userList52 = userRepository49.getAllUsers();
        userRepository45.saveAllUsers(userList52);
        userRepository24.saveAllUsers(userList52);
        userRepository21.saveAllUsers(userList52);
        userRepository1.saveAllUsers(userList52);
        boolean boolean58 = userRepository1.emailExists("Password1!");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 101 + "'", int2 == 101);
// flaky "10) test1603(com.reservation_system.randoop.userrepository.RegressionTest3)":         org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "labmanager" + "'", str15, "labmanager");
// flaky "8) test1603(com.reservation_system.randoop.userrepository.RegressionTest3)":         org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNotNull(userList18);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 101 + "'", int22 == 101);
        org.junit.Assert.assertNotNull(userList32);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 101 + "'", int43 == 101);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertNotNull(userList50);
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + 101 + "'", int51 == 101);
        org.junit.Assert.assertNotNull(userList52);
// flaky "5) test1603(com.reservation_system.randoop.userrepository.RegressionTest3)":         org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + true + "'", boolean58 == true);
    }

    @Test
    public void test1604() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1604");
        com.reservation_system.model.LabManager labManager5 = new com.reservation_system.model.LabManager(10, "Password1!", "data/test-userrepo.csv", "Guest", true);
        java.lang.String str6 = labManager5.getUserType();
        java.lang.String str7 = labManager5.getUserType();
        java.lang.Class<?> wildcardClass8 = labManager5.getClass();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "labmanager" + "'", str6, "labmanager");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "labmanager" + "'", str7, "labmanager");
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test1605() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1605");
        com.reservation_system.model.HeadLabCoordinator headLabCoordinator5 = new com.reservation_system.model.HeadLabCoordinator((int) ' ', "alice@example.com", "Faculty", "hi!", true);
        java.lang.String str6 = headLabCoordinator5.getUserType();
        java.lang.String str7 = headLabCoordinator5.getUserType();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "headlabcoordinator" + "'", str6, "headlabcoordinator");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "headlabcoordinator" + "'", str7, "headlabcoordinator");
    }

    @Test
    public void test1606() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1606");
        com.reservation_system.model.LabManager labManager5 = new com.reservation_system.model.LabManager((int) (short) 10, "researcher", "Guest", "", false);
        java.lang.String str6 = labManager5.getName();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "researcher" + "'", str6, "researcher");
    }

    @Test
    public void test1607() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1607");
        com.reservation_system.model.LabManager labManager5 = new com.reservation_system.model.LabManager(5, "data/test-userrepo.csv", "faculty", "hi!", false);
    }

    @Test
    public void test1608() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1608");
        com.reservation_system.model.Student student5 = new com.reservation_system.model.Student(0, "Guest", "Password1!", "data/test-userrepo.csv", true);
        java.lang.String str6 = student5.getEmail();
        boolean boolean7 = student5.isApproved();
        java.lang.String str8 = student5.getUserType();
        int int9 = student5.getID();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Password1!" + "'", str6, "Password1!");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Student" + "'", str8, "Student");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test1609() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1609");
        com.reservation_system.model.Student student5 = new com.reservation_system.model.Student((int) '#', "hi!", "Alice", "guest", false);
    }

    @Test
    public void test1610() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1610");
        com.reservation_system.model.Student student5 = new com.reservation_system.model.Student(101, "headlabcoordinator", "alice@example.com", "data/test-userrepo.csv", false);
    }

    @Test
    public void test1611() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1611");
        com.reservation_system.model.HeadLabCoordinator headLabCoordinator5 = new com.reservation_system.model.HeadLabCoordinator((int) (short) 100, "Student", "researcher", "alice@example.com", true);
    }

    @Test
    public void test1612() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1612");
        com.reservation_system.model.LabManager labManager5 = new com.reservation_system.model.LabManager((int) '#', "researcher", "Guest", "headlabcoordinator", true);
        java.lang.String str6 = labManager5.getEmail();
        java.lang.String str7 = labManager5.getUserType();
        int int8 = labManager5.getID();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Guest" + "'", str6, "Guest");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "labmanager" + "'", str7, "labmanager");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 35 + "'", int8 == 35);
    }

    @Test
    public void test1613() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1613");
        com.reservation_system.model.Student student5 = new com.reservation_system.model.Student((-1), "Alice", "Researcher", "Alice", true);
    }

    @Test
    public void test1614() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1614");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("data/test-userrepo.csv");
        boolean boolean3 = userRepository1.emailExists("Alice");
        com.reservation_system.model.Researcher researcher9 = new com.reservation_system.model.Researcher((int) 'a', "labmanager", "faculty", "", false);
        boolean boolean10 = researcher9.isApproved();
        java.lang.String str11 = researcher9.getName();
        userRepository1.addUser((com.reservation_system.model.User) researcher9);
        boolean boolean13 = userRepository1.headLabCoordinatorExists();
        java.util.Optional<com.reservation_system.model.User> userOptional15 = userRepository1.findByEmail("");
        com.reservation_system.repository.UserRepository userRepository17 = new com.reservation_system.repository.UserRepository("data/test-userrepo.csv");
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
        java.util.List<com.reservation_system.model.User> userList33 = userRepository1.getAllUsers();
        boolean boolean34 = userRepository1.headLabCoordinatorExists();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "labmanager" + "'", str11, "labmanager");
// flaky "11) test1614(com.reservation_system.randoop.userrepository.RegressionTest3)":         org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(userOptional15);
        org.junit.Assert.assertNotNull(userList18);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 101 + "'", int19 == 101);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
// flaky "9) test1614(com.reservation_system.randoop.userrepository.RegressionTest3)":         org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertNotNull(userOptional24);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNotNull(userList31);
        org.junit.Assert.assertNotNull(userList33);
// flaky "6) test1614(com.reservation_system.randoop.userrepository.RegressionTest3)":         org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
    }

    @Test
    public void test1615() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1615");
        com.reservation_system.model.Faculty faculty5 = new com.reservation_system.model.Faculty((int) (byte) -1, "alice@example.com", "guest", "", true);
    }

    @Test
    public void test1616() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1616");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("data/test-userrepo.csv");
        com.reservation_system.model.Researcher researcher7 = new com.reservation_system.model.Researcher(5, "hi!", "labmanager", "Guest", false);
        userRepository1.addUser((com.reservation_system.model.User) researcher7);
        com.reservation_system.repository.UserRepository userRepository10 = new com.reservation_system.repository.UserRepository("data/test-userrepo.csv");
        com.reservation_system.model.Researcher researcher16 = new com.reservation_system.model.Researcher(5, "hi!", "labmanager", "Guest", false);
        userRepository10.addUser((com.reservation_system.model.User) researcher16);
        int int18 = userRepository10.getNextID();
        java.util.List<com.reservation_system.model.User> userList19 = userRepository10.getAllUsers();
        userRepository1.saveAllUsers(userList19);
        boolean boolean21 = userRepository1.headLabCoordinatorExists();
        java.util.List<com.reservation_system.model.User> userList22 = userRepository1.getAllUsers();
        com.reservation_system.repository.UserRepository userRepository24 = new com.reservation_system.repository.UserRepository("data/test-userrepo.csv");
        java.util.List<com.reservation_system.model.User> userList25 = userRepository24.getAllUsers();
        int int26 = userRepository24.getNextID();
        java.util.List<com.reservation_system.model.User> userList27 = userRepository24.getAllUsers();
        userRepository1.saveAllUsers(userList27);
        java.util.Optional<com.reservation_system.model.User> userOptional30 = userRepository1.findByEmail("Guest");
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 101 + "'", int18 == 101);
        org.junit.Assert.assertNotNull(userList19);
// flaky "12) test1616(com.reservation_system.randoop.userrepository.RegressionTest3)":         org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertNotNull(userList22);
        org.junit.Assert.assertNotNull(userList25);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 101 + "'", int26 == 101);
        org.junit.Assert.assertNotNull(userList27);
        org.junit.Assert.assertNotNull(userOptional30);
    }

    @Test
    public void test1617() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1617");
        com.reservation_system.model.User user6 = com.reservation_system.patterns.factory.UserFactory.createUser("labmanager", (int) (short) 10, "Faculty", "hi!", "Password1!", true);
        user6.setApproved(true);
        org.junit.Assert.assertNotNull(user6);
    }

    @Test
    public void test1618() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1618");
        com.reservation_system.model.HeadLabCoordinator headLabCoordinator5 = new com.reservation_system.model.HeadLabCoordinator((-1), "hi!", "Alice", "guest", true);
        java.lang.String str6 = headLabCoordinator5.getPassword();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "guest" + "'", str6, "guest");
    }

    @Test
    public void test1619() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1619");
        com.reservation_system.model.HeadLabCoordinator headLabCoordinator5 = new com.reservation_system.model.HeadLabCoordinator(35, "faculty", "guest", "guest", true);
        java.lang.String str6 = headLabCoordinator5.getUserType();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "headlabcoordinator" + "'", str6, "headlabcoordinator");
    }

    @Test
    public void test1620() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1620");
        com.reservation_system.model.Faculty faculty5 = new com.reservation_system.model.Faculty(0, "Student", "hi!", "data/test-userrepo.csv", true);
        java.lang.String str6 = faculty5.getPassword();
        int int7 = faculty5.getID();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "data/test-userrepo.csv" + "'", str6, "data/test-userrepo.csv");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test1621() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1621");
        com.reservation_system.model.HeadLabCoordinator headLabCoordinator5 = new com.reservation_system.model.HeadLabCoordinator(98, "Faculty", "hi!", "Faculty", false);
    }

    @Test
    public void test1622() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1622");
        com.reservation_system.model.Researcher researcher5 = new com.reservation_system.model.Researcher(97, "faculty", "alice@example.com", "Student", true);
        java.lang.String str6 = researcher5.getName();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "faculty" + "'", str6, "faculty");
    }

    @Test
    public void test1623() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1623");
        com.reservation_system.model.Researcher researcher5 = new com.reservation_system.model.Researcher(6, "labmanager", "headlabcoordinator", "Faculty", false);
        boolean boolean6 = researcher5.requiresDepartmentApproval();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test1624() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1624");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("data/test-userrepo.csv");
        java.util.List<com.reservation_system.model.User> userList2 = userRepository1.getAllUsers();
        int int3 = userRepository1.getNextID();
        boolean boolean5 = userRepository1.emailExists("headlabcoordinator");
        boolean boolean6 = userRepository1.headLabCoordinatorExists();
        int int7 = userRepository1.getNextID();
        boolean boolean9 = userRepository1.emailExists("Researcher");
        boolean boolean10 = userRepository1.headLabCoordinatorExists();
        int int11 = userRepository1.getNextID();
        org.junit.Assert.assertNotNull(userList2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 101 + "'", int3 == 101);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
// flaky "13) test1624(com.reservation_system.randoop.userrepository.RegressionTest3)":         org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 101 + "'", int7 == 101);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
// flaky "10) test1624(com.reservation_system.randoop.userrepository.RegressionTest3)":         org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 101 + "'", int11 == 101);
    }

    @Test
    public void test1625() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1625");
        com.reservation_system.model.LabManager labManager5 = new com.reservation_system.model.LabManager((int) (byte) 1, "student", "Alice", "Guest", false);
        java.lang.String str6 = labManager5.getUserType();
        java.lang.String str7 = labManager5.getUserType();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "labmanager" + "'", str6, "labmanager");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "labmanager" + "'", str7, "labmanager");
    }

    @Test
    public void test1626() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1626");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("data/test-userrepo.csv");
        int int2 = userRepository1.getNextID();
        boolean boolean3 = userRepository1.headLabCoordinatorExists();
        com.reservation_system.model.Guest guest9 = new com.reservation_system.model.Guest((int) (byte) -1, "hi!", "", "Password1!", false);
        userRepository1.addUser((com.reservation_system.model.User) guest9);
        int int11 = userRepository1.getNextID();
        boolean boolean13 = userRepository1.emailExists("headlabcoordinator");
        java.util.List<com.reservation_system.model.User> userList14 = userRepository1.getAllUsers();
        int int15 = userRepository1.getNextID();
        java.util.List<com.reservation_system.model.User> userList16 = userRepository1.getAllUsers();
        boolean boolean18 = userRepository1.emailExists("alice@example.com");
        boolean boolean19 = userRepository1.headLabCoordinatorExists();
        com.reservation_system.repository.UserRepository userRepository21 = new com.reservation_system.repository.UserRepository("data/test-userrepo.csv");
        int int22 = userRepository21.getNextID();
        boolean boolean23 = userRepository21.headLabCoordinatorExists();
        java.util.List<com.reservation_system.model.User> userList24 = userRepository21.getAllUsers();
        userRepository1.saveAllUsers(userList24);
        int int26 = userRepository1.getNextID();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 101 + "'", int2 == 101);
// flaky "14) test1626(com.reservation_system.randoop.userrepository.RegressionTest3)":         org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 101 + "'", int11 == 101);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(userList14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 101 + "'", int15 == 101);
        org.junit.Assert.assertNotNull(userList16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
// flaky "11) test1626(com.reservation_system.randoop.userrepository.RegressionTest3)":         org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 101 + "'", int22 == 101);
// flaky "7) test1626(com.reservation_system.randoop.userrepository.RegressionTest3)":         org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertNotNull(userList24);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 101 + "'", int26 == 101);
    }

    @Test
    public void test1627() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1627");
        com.reservation_system.model.Guest guest5 = new com.reservation_system.model.Guest((int) (byte) 1, "Faculty", "hi!", "hi!", true);
    }

    @Test
    public void test1628() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1628");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("data/test-userrepo.csv");
        boolean boolean3 = userRepository1.emailExists("Alice");
        com.reservation_system.repository.UserRepository userRepository5 = new com.reservation_system.repository.UserRepository("data/test-userrepo.csv");
        java.util.List<com.reservation_system.model.User> userList6 = userRepository5.getAllUsers();
        int int7 = userRepository5.getNextID();
        java.util.List<com.reservation_system.model.User> userList8 = userRepository5.getAllUsers();
        userRepository1.saveAllUsers(userList8);
        java.util.List<com.reservation_system.model.User> userList10 = userRepository1.getAllUsers();
        com.reservation_system.model.Student student16 = new com.reservation_system.model.Student((int) (byte) 10, "alice@example.com", "labmanager", "researcher", true);
        java.lang.String str17 = student16.getName();
        java.lang.String str18 = student16.getUserType();
        userRepository1.addUser((com.reservation_system.model.User) student16);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(userList6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 101 + "'", int7 == 101);
        org.junit.Assert.assertNotNull(userList8);
        org.junit.Assert.assertNotNull(userList10);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Student" + "'", str18, "Student");
    }

    @Test
    public void test1629() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1629");
        com.reservation_system.model.Faculty faculty5 = new com.reservation_system.model.Faculty((int) (byte) -1, "Alice", "researcher", "Password1!", false);
        java.lang.String str6 = faculty5.getName();
        java.lang.String str7 = faculty5.getUserType();
        java.lang.String str8 = faculty5.getUserType();
        faculty5.setApproved(false);
        java.lang.String str11 = faculty5.getUserType();
        java.lang.String str12 = faculty5.getPassword();
        java.lang.String str13 = faculty5.getPassword();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Alice" + "'", str6, "Alice");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Faculty" + "'", str7, "Faculty");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Faculty" + "'", str8, "Faculty");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Faculty" + "'", str11, "Faculty");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Password1!" + "'", str12, "Password1!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Password1!" + "'", str13, "Password1!");
    }

    @Test
    public void test1630() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1630");
        com.reservation_system.model.HeadLabCoordinator headLabCoordinator5 = new com.reservation_system.model.HeadLabCoordinator(0, "", "guest", "researcher", false);
    }

    @Test
    public void test1631() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1631");
        com.reservation_system.model.Student student5 = new com.reservation_system.model.Student(5, "labmanager", "Password1!", "hi!", false);
        java.lang.String str6 = student5.getName();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "labmanager" + "'", str6, "labmanager");
    }

    @Test
    public void test1632() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1632");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("data/test-userrepo.csv");
        java.util.List<com.reservation_system.model.User> userList2 = userRepository1.getAllUsers();
        int int3 = userRepository1.getNextID();
        java.util.List<com.reservation_system.model.User> userList4 = userRepository1.getAllUsers();
        com.reservation_system.model.Faculty faculty10 = new com.reservation_system.model.Faculty(10, "", "alice@example.com", "Password1!", false);
        java.lang.String str11 = faculty10.getUserType();
        userRepository1.addUser((com.reservation_system.model.User) faculty10);
        int int13 = userRepository1.getNextID();
        org.junit.Assert.assertNotNull(userList2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 101 + "'", int3 == 101);
        org.junit.Assert.assertNotNull(userList4);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Faculty" + "'", str11, "Faculty");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 101 + "'", int13 == 101);
    }

    @Test
    public void test1633() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1633");
        com.reservation_system.model.Guest guest5 = new com.reservation_system.model.Guest(11, "guest", "researcher", "headlabcoordinator", false);
    }

    @Test
    public void test1634() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1634");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("data/test-userrepo.csv");
        com.reservation_system.model.Faculty faculty7 = new com.reservation_system.model.Faculty(5, "researcher", "guest", "faculty", true);
        java.lang.String str8 = faculty7.getUserType();
        java.lang.String str9 = faculty7.getUserType();
        userRepository1.addUser((com.reservation_system.model.User) faculty7);
        com.reservation_system.repository.UserRepository userRepository12 = new com.reservation_system.repository.UserRepository("data/test-userrepo.csv");
        boolean boolean14 = userRepository12.emailExists("Alice");
        com.reservation_system.repository.UserRepository userRepository16 = new com.reservation_system.repository.UserRepository("data/test-userrepo.csv");
        java.util.List<com.reservation_system.model.User> userList17 = userRepository16.getAllUsers();
        int int18 = userRepository16.getNextID();
        java.util.List<com.reservation_system.model.User> userList19 = userRepository16.getAllUsers();
        userRepository12.saveAllUsers(userList19);
        userRepository1.saveAllUsers(userList19);
        boolean boolean22 = userRepository1.headLabCoordinatorExists();
        boolean boolean24 = userRepository1.emailExists("data/test-userrepo.csv");
        java.util.Optional<com.reservation_system.model.User> userOptional26 = userRepository1.findByEmail("alice@example.com");
        com.reservation_system.model.Guest guest32 = new com.reservation_system.model.Guest(5, "guest", "data/test-userrepo.csv", "Faculty", false);
        userRepository1.addUser((com.reservation_system.model.User) guest32);
        java.lang.String str34 = guest32.getUserType();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Faculty" + "'", str8, "Faculty");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Faculty" + "'", str9, "Faculty");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(userList17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 101 + "'", int18 == 101);
        org.junit.Assert.assertNotNull(userList19);
// flaky "15) test1634(com.reservation_system.randoop.userrepository.RegressionTest3)":         org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertNotNull(userOptional26);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "Guest" + "'", str34, "Guest");
    }

    @Test
    public void test1635() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1635");
        com.reservation_system.model.Faculty faculty5 = new com.reservation_system.model.Faculty(101, "Guest", "", "student", false);
    }

    @Test
    public void test1636() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1636");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("data/test-userrepo.csv");
        java.util.List<com.reservation_system.model.User> userList2 = userRepository1.getAllUsers();
        int int3 = userRepository1.getNextID();
        boolean boolean5 = userRepository1.emailExists("headlabcoordinator");
        boolean boolean6 = userRepository1.headLabCoordinatorExists();
        java.util.Optional<com.reservation_system.model.User> userOptional8 = userRepository1.findByEmail("Alice");
        boolean boolean10 = userRepository1.emailExists("Alice");
        boolean boolean12 = userRepository1.emailExists("Guest");
        boolean boolean14 = userRepository1.emailExists("headlabcoordinator");
        java.util.List<com.reservation_system.model.User> userList15 = userRepository1.getAllUsers();
        java.util.List<com.reservation_system.model.User> userList16 = userRepository1.getAllUsers();
        java.util.Optional<com.reservation_system.model.User> userOptional18 = userRepository1.findByEmail("labmanager");
        java.util.List<com.reservation_system.model.User> userList19 = userRepository1.getAllUsers();
        com.reservation_system.repository.UserRepository userRepository21 = new com.reservation_system.repository.UserRepository("data/test-userrepo.csv");
        com.reservation_system.model.Researcher researcher27 = new com.reservation_system.model.Researcher(5, "hi!", "labmanager", "Guest", false);
        userRepository21.addUser((com.reservation_system.model.User) researcher27);
        java.util.List<com.reservation_system.model.User> userList29 = userRepository21.getAllUsers();
        com.reservation_system.model.Guest guest35 = new com.reservation_system.model.Guest(0, "Password1!", "data/test-userrepo.csv", "researcher", false);
        boolean boolean36 = guest35.requiresDepartmentApproval();
        userRepository21.addUser((com.reservation_system.model.User) guest35);
        boolean boolean39 = userRepository21.emailExists("Alice");
        int int40 = userRepository21.getNextID();
        com.reservation_system.repository.UserRepository userRepository42 = new com.reservation_system.repository.UserRepository("data/test-userrepo.csv");
        boolean boolean44 = userRepository42.emailExists("Alice");
        com.reservation_system.repository.UserRepository userRepository46 = new com.reservation_system.repository.UserRepository("data/test-userrepo.csv");
        java.util.List<com.reservation_system.model.User> userList47 = userRepository46.getAllUsers();
        int int48 = userRepository46.getNextID();
        java.util.List<com.reservation_system.model.User> userList49 = userRepository46.getAllUsers();
        userRepository42.saveAllUsers(userList49);
        userRepository21.saveAllUsers(userList49);
        java.util.List<com.reservation_system.model.User> userList52 = userRepository21.getAllUsers();
        userRepository1.saveAllUsers(userList52);
        int int54 = userRepository1.getNextID();
        org.junit.Assert.assertNotNull(userList2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 101 + "'", int3 == 101);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
// flaky "16) test1636(com.reservation_system.randoop.userrepository.RegressionTest3)":         org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(userOptional8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(userList15);
        org.junit.Assert.assertNotNull(userList16);
        org.junit.Assert.assertNotNull(userOptional18);
        org.junit.Assert.assertNotNull(userList19);
        org.junit.Assert.assertNotNull(userList29);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 101 + "'", int40 == 101);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertNotNull(userList47);
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 101 + "'", int48 == 101);
        org.junit.Assert.assertNotNull(userList49);
        org.junit.Assert.assertNotNull(userList52);
        org.junit.Assert.assertTrue("'" + int54 + "' != '" + 101 + "'", int54 == 101);
    }

    @Test
    public void test1637() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1637");
        com.reservation_system.model.Guest guest5 = new com.reservation_system.model.Guest(97, "guest", "Faculty", "Guest", false);
    }

    @Test
    public void test1638() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1638");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("data/test-userrepo.csv");
        com.reservation_system.model.Researcher researcher7 = new com.reservation_system.model.Researcher(5, "hi!", "labmanager", "Guest", false);
        userRepository1.addUser((com.reservation_system.model.User) researcher7);
        java.util.List<com.reservation_system.model.User> userList9 = userRepository1.getAllUsers();
        com.reservation_system.model.Guest guest15 = new com.reservation_system.model.Guest(0, "Password1!", "data/test-userrepo.csv", "researcher", false);
        boolean boolean16 = guest15.requiresDepartmentApproval();
        userRepository1.addUser((com.reservation_system.model.User) guest15);
        java.util.Optional<com.reservation_system.model.User> userOptional19 = userRepository1.findByEmail("Student");
        boolean boolean21 = userRepository1.emailExists("Student");
        java.util.Optional<com.reservation_system.model.User> userOptional23 = userRepository1.findByEmail("alice@example.com");
        com.reservation_system.model.LabManager labManager29 = new com.reservation_system.model.LabManager((int) '#', "faculty", "data/test-userrepo.csv", "labmanager", true);
        boolean boolean30 = labManager29.isApproved();
        userRepository1.addUser((com.reservation_system.model.User) labManager29);
        org.junit.Assert.assertNotNull(userList9);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(userOptional19);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(userOptional23);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
    }

    @Test
    public void test1639() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1639");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("data/test-userrepo.csv");
        boolean boolean3 = userRepository1.emailExists("Alice");
        java.util.List<com.reservation_system.model.User> userList4 = userRepository1.getAllUsers();
        int int5 = userRepository1.getNextID();
        boolean boolean6 = userRepository1.headLabCoordinatorExists();
        com.reservation_system.model.Student student12 = new com.reservation_system.model.Student((int) (byte) 100, "", "data/test-userrepo.csv", "researcher", false);
        userRepository1.addUser((com.reservation_system.model.User) student12);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(userList4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 101 + "'", int5 == 101);
// flaky "17) test1639(com.reservation_system.randoop.userrepository.RegressionTest3)":         org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test1640() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1640");
        com.reservation_system.model.Researcher researcher5 = new com.reservation_system.model.Researcher((int) (short) -1, "", "alice@example.com", "alice@example.com", false);
    }

    @Test
    public void test1641() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1641");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("data/test-userrepo.csv");
        java.util.List<com.reservation_system.model.User> userList2 = userRepository1.getAllUsers();
        int int3 = userRepository1.getNextID();
        boolean boolean5 = userRepository1.emailExists("headlabcoordinator");
        boolean boolean6 = userRepository1.headLabCoordinatorExists();
        java.util.Optional<com.reservation_system.model.User> userOptional8 = userRepository1.findByEmail("Alice");
        boolean boolean10 = userRepository1.emailExists("Alice");
        boolean boolean12 = userRepository1.emailExists("Guest");
        boolean boolean14 = userRepository1.emailExists("headlabcoordinator");
        com.reservation_system.repository.UserRepository userRepository16 = new com.reservation_system.repository.UserRepository("data/test-userrepo.csv");
        boolean boolean18 = userRepository16.emailExists("Alice");
        com.reservation_system.model.Researcher researcher24 = new com.reservation_system.model.Researcher((int) 'a', "labmanager", "faculty", "", false);
        boolean boolean25 = researcher24.isApproved();
        java.lang.String str26 = researcher24.getName();
        userRepository16.addUser((com.reservation_system.model.User) researcher24);
        boolean boolean28 = userRepository16.headLabCoordinatorExists();
        java.util.List<com.reservation_system.model.User> userList29 = userRepository16.getAllUsers();
        userRepository1.saveAllUsers(userList29);
        com.reservation_system.model.HeadLabCoordinator headLabCoordinator36 = new com.reservation_system.model.HeadLabCoordinator((int) (byte) 10, "Alice", "guest", "alice@example.com", true);
        java.lang.String str37 = headLabCoordinator36.getUserType();
        java.lang.String str38 = headLabCoordinator36.getUserType();
        java.lang.String str39 = headLabCoordinator36.getUserType();
        java.lang.String str40 = headLabCoordinator36.getUserType();
        userRepository1.addUser((com.reservation_system.model.User) headLabCoordinator36);
        boolean boolean42 = headLabCoordinator36.requiresDepartmentApproval();
        org.junit.Assert.assertNotNull(userList2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 101 + "'", int3 == 101);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
// flaky "18) test1641(com.reservation_system.randoop.userrepository.RegressionTest3)":         org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(userOptional8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "labmanager" + "'", str26, "labmanager");
// flaky "12) test1641(com.reservation_system.randoop.userrepository.RegressionTest3)":         org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertNotNull(userList29);
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "headlabcoordinator" + "'", str37, "headlabcoordinator");
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "headlabcoordinator" + "'", str38, "headlabcoordinator");
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "headlabcoordinator" + "'", str39, "headlabcoordinator");
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "headlabcoordinator" + "'", str40, "headlabcoordinator");
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
    }

    @Test
    public void test1642() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1642");
        com.reservation_system.model.LabManager labManager5 = new com.reservation_system.model.LabManager(10, "Password1!", "Guest", "Alice", true);
        java.lang.String str6 = labManager5.getUserType();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "labmanager" + "'", str6, "labmanager");
    }

    @Test
    public void test1643() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1643");
        com.reservation_system.model.HeadLabCoordinator headLabCoordinator5 = new com.reservation_system.model.HeadLabCoordinator(5, "guest", "Faculty", "Alice", false);
    }

    @Test
    public void test1644() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1644");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("data/test-userrepo.csv");
        java.util.List<com.reservation_system.model.User> userList2 = userRepository1.getAllUsers();
        com.reservation_system.model.Guest guest8 = new com.reservation_system.model.Guest(0, "Password1!", "data/test-userrepo.csv", "researcher", false);
        boolean boolean9 = guest8.requiresDepartmentApproval();
        java.lang.String str10 = guest8.getUserType();
        java.lang.String str11 = guest8.getUserType();
        guest8.setApproved(true);
        java.lang.String str14 = guest8.getUserType();
        userRepository1.addUser((com.reservation_system.model.User) guest8);
        com.reservation_system.repository.UserRepository userRepository17 = new com.reservation_system.repository.UserRepository("data/test-userrepo.csv");
        java.util.List<com.reservation_system.model.User> userList18 = userRepository17.getAllUsers();
        int int19 = userRepository17.getNextID();
        boolean boolean21 = userRepository17.emailExists("headlabcoordinator");
        boolean boolean22 = userRepository17.headLabCoordinatorExists();
        java.util.Optional<com.reservation_system.model.User> userOptional24 = userRepository17.findByEmail("Alice");
        boolean boolean26 = userRepository17.emailExists("Alice");
        boolean boolean28 = userRepository17.emailExists("Guest");
        boolean boolean30 = userRepository17.emailExists("headlabcoordinator");
        com.reservation_system.repository.UserRepository userRepository32 = new com.reservation_system.repository.UserRepository("data/test-userrepo.csv");
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
        boolean boolean50 = userRepository1.emailExists("researcher");
        org.junit.Assert.assertNotNull(userList2);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Guest" + "'", str10, "Guest");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Guest" + "'", str11, "Guest");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Guest" + "'", str14, "Guest");
        org.junit.Assert.assertNotNull(userList18);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 101 + "'", int19 == 101);
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
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
    }

    @Test
    public void test1645() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1645");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("data/test-userrepo.csv");
        com.reservation_system.model.Researcher researcher7 = new com.reservation_system.model.Researcher(5, "hi!", "labmanager", "Guest", false);
        userRepository1.addUser((com.reservation_system.model.User) researcher7);
        java.util.List<com.reservation_system.model.User> userList9 = userRepository1.getAllUsers();
        com.reservation_system.model.Guest guest15 = new com.reservation_system.model.Guest(0, "Password1!", "data/test-userrepo.csv", "researcher", false);
        boolean boolean16 = guest15.requiresDepartmentApproval();
        userRepository1.addUser((com.reservation_system.model.User) guest15);
        boolean boolean19 = userRepository1.emailExists("Alice");
        java.util.Optional<com.reservation_system.model.User> userOptional21 = userRepository1.findByEmail("hi!");
        int int22 = userRepository1.getNextID();
        com.reservation_system.repository.UserRepository userRepository24 = new com.reservation_system.repository.UserRepository("data/test-userrepo.csv");
        com.reservation_system.model.Researcher researcher30 = new com.reservation_system.model.Researcher(5, "hi!", "labmanager", "Guest", false);
        userRepository24.addUser((com.reservation_system.model.User) researcher30);
        int int32 = userRepository24.getNextID();
        com.reservation_system.repository.UserRepository userRepository34 = new com.reservation_system.repository.UserRepository("data/test-userrepo.csv");
        int int35 = userRepository34.getNextID();
        boolean boolean36 = userRepository34.headLabCoordinatorExists();
        com.reservation_system.model.Guest guest42 = new com.reservation_system.model.Guest((int) (byte) -1, "hi!", "", "Password1!", false);
        userRepository34.addUser((com.reservation_system.model.User) guest42);
        int int44 = userRepository34.getNextID();
        boolean boolean46 = userRepository34.emailExists("headlabcoordinator");
        java.util.List<com.reservation_system.model.User> userList47 = userRepository34.getAllUsers();
        userRepository24.saveAllUsers(userList47);
        userRepository1.saveAllUsers(userList47);
        java.util.Optional<com.reservation_system.model.User> userOptional51 = userRepository1.findByEmail("Guest");
        int int52 = userRepository1.getNextID();
        org.junit.Assert.assertNotNull(userList9);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(userOptional21);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 101 + "'", int22 == 101);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 101 + "'", int32 == 101);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 101 + "'", int35 == 101);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 101 + "'", int44 == 101);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertNotNull(userList47);
        org.junit.Assert.assertNotNull(userOptional51);
        org.junit.Assert.assertTrue("'" + int52 + "' != '" + 101 + "'", int52 == 101);
    }

    @Test
    public void test1646() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1646");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("data/test-userrepo.csv");
        com.reservation_system.model.Researcher researcher7 = new com.reservation_system.model.Researcher(5, "hi!", "labmanager", "Guest", false);
        userRepository1.addUser((com.reservation_system.model.User) researcher7);
        java.util.List<com.reservation_system.model.User> userList9 = userRepository1.getAllUsers();
        boolean boolean11 = userRepository1.emailExists("hi!");
        java.util.Optional<com.reservation_system.model.User> userOptional13 = userRepository1.findByEmail("alice@example.com");
        org.junit.Assert.assertNotNull(userList9);
// flaky "19) test1646(com.reservation_system.randoop.userrepository.RegressionTest3)":         org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(userOptional13);
    }

    @Test
    public void test1647() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1647");
        com.reservation_system.model.Student student5 = new com.reservation_system.model.Student(0, "Guest", "faculty", "alice@example.com", false);
    }

    @Test
    public void test1648() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1648");
        com.reservation_system.model.Researcher researcher5 = new com.reservation_system.model.Researcher((int) (byte) 100, "guest", "", "Password1!", true);
    }

    @Test
    public void test1649() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1649");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("data/test-userrepo.csv");
        boolean boolean3 = userRepository1.emailExists("Alice");
        com.reservation_system.model.Researcher researcher9 = new com.reservation_system.model.Researcher((int) 'a', "labmanager", "faculty", "", false);
        boolean boolean10 = researcher9.isApproved();
        java.lang.String str11 = researcher9.getName();
        userRepository1.addUser((com.reservation_system.model.User) researcher9);
        boolean boolean13 = userRepository1.headLabCoordinatorExists();
        int int14 = userRepository1.getNextID();
        java.util.Optional<com.reservation_system.model.User> userOptional16 = userRepository1.findByEmail("guest");
        int int17 = userRepository1.getNextID();
        java.util.Optional<com.reservation_system.model.User> userOptional19 = userRepository1.findByEmail("Password1!");
        java.lang.Class<?> wildcardClass20 = userOptional19.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "labmanager" + "'", str11, "labmanager");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 101 + "'", int14 == 101);
        org.junit.Assert.assertNotNull(userOptional16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 101 + "'", int17 == 101);
        org.junit.Assert.assertNotNull(userOptional19);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test1650() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1650");
        com.reservation_system.model.HeadLabCoordinator headLabCoordinator5 = new com.reservation_system.model.HeadLabCoordinator((int) (byte) 1, "Password1!", "Student", "hi!", true);
        java.lang.String str6 = headLabCoordinator5.getUserType();
        java.lang.String str7 = headLabCoordinator5.getEmail();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "headlabcoordinator" + "'", str6, "headlabcoordinator");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Student" + "'", str7, "Student");
    }

    @Test
    public void test1651() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1651");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("data/test-userrepo.csv");
        com.reservation_system.model.Researcher researcher7 = new com.reservation_system.model.Researcher(5, "hi!", "labmanager", "Guest", false);
        userRepository1.addUser((com.reservation_system.model.User) researcher7);
        java.util.List<com.reservation_system.model.User> userList9 = userRepository1.getAllUsers();
        boolean boolean11 = userRepository1.emailExists("faculty");
        org.junit.Assert.assertNotNull(userList9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test1652() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1652");
        com.reservation_system.model.LabManager labManager5 = new com.reservation_system.model.LabManager((int) (byte) 1, "labmanager", "Faculty", "labmanager", false);
    }

    @Test
    public void test1653() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1653");
        com.reservation_system.model.Guest guest5 = new com.reservation_system.model.Guest(6, "Guest", "alice@example.com", "Password1!", true);
    }

    @Test
    public void test1654() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1654");
        // The following exception was thrown during execution in test generation
        try {
            com.reservation_system.model.User user6 = com.reservation_system.patterns.factory.UserFactory.createUser("", (int) ' ', "alice@example.com", "Alice", "hi!", false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid user type: ");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1655() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1655");
        com.reservation_system.model.Student student5 = new com.reservation_system.model.Student(1, "data/test-userrepo.csv", "alice@example.com", "guest", false);
        java.lang.String str6 = student5.getUserType();
        java.lang.String str7 = student5.getUserType();
        java.lang.String str8 = student5.getName();
        java.lang.String str9 = student5.getPassword();
        java.lang.String str10 = student5.getUserType();
        int int11 = student5.getID();
        boolean boolean12 = student5.isApproved();
        student5.setApproved(true);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Student" + "'", str6, "Student");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Student" + "'", str7, "Student");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "data/test-userrepo.csv" + "'", str8, "data/test-userrepo.csv");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "guest" + "'", str9, "guest");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Student" + "'", str10, "Student");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test1656() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1656");
        com.reservation_system.model.User user6 = com.reservation_system.patterns.factory.UserFactory.createUser("faculty", (int) ' ', "faculty", "Alice", "guest", false);
        org.junit.Assert.assertNotNull(user6);
    }

    @Test
    public void test1657() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1657");
        com.reservation_system.model.Faculty faculty5 = new com.reservation_system.model.Faculty((int) (byte) 10, "Password1!", "Alice", "student", false);
    }

    @Test
    public void test1658() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1658");
        com.reservation_system.model.Student student5 = new com.reservation_system.model.Student((int) (byte) 10, "Researcher", "alice@example.com", "headlabcoordinator", true);
    }

    @Test
    public void test1659() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1659");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("data/test-userrepo.csv");
        int int2 = userRepository1.getNextID();
        boolean boolean3 = userRepository1.headLabCoordinatorExists();
        com.reservation_system.model.Guest guest9 = new com.reservation_system.model.Guest((int) (byte) -1, "hi!", "", "Password1!", false);
        userRepository1.addUser((com.reservation_system.model.User) guest9);
        com.reservation_system.repository.UserRepository userRepository12 = new com.reservation_system.repository.UserRepository("data/test-userrepo.csv");
        com.reservation_system.model.Researcher researcher18 = new com.reservation_system.model.Researcher(5, "hi!", "labmanager", "Guest", false);
        userRepository12.addUser((com.reservation_system.model.User) researcher18);
        java.util.Optional<com.reservation_system.model.User> userOptional21 = userRepository12.findByEmail("alice@example.com");
        java.util.List<com.reservation_system.model.User> userList22 = userRepository12.getAllUsers();
        java.util.Optional<com.reservation_system.model.User> userOptional24 = userRepository12.findByEmail("Password1!");
        int int25 = userRepository12.getNextID();
        boolean boolean27 = userRepository12.emailExists("Guest");
        java.util.Optional<com.reservation_system.model.User> userOptional29 = userRepository12.findByEmail("faculty");
        java.util.List<com.reservation_system.model.User> userList30 = userRepository12.getAllUsers();
        userRepository1.saveAllUsers(userList30);
        boolean boolean32 = userRepository1.headLabCoordinatorExists();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 101 + "'", int2 == 101);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(userOptional21);
        org.junit.Assert.assertNotNull(userList22);
        org.junit.Assert.assertNotNull(userOptional24);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 101 + "'", int25 == 101);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertNotNull(userOptional29);
        org.junit.Assert.assertNotNull(userList30);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
    }

    @Test
    public void test1660() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1660");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("data/test-userrepo.csv");
        java.util.List<com.reservation_system.model.User> userList2 = userRepository1.getAllUsers();
        int int3 = userRepository1.getNextID();
        boolean boolean5 = userRepository1.emailExists("headlabcoordinator");
        com.reservation_system.repository.UserRepository userRepository7 = new com.reservation_system.repository.UserRepository("data/test-userrepo.csv");
        com.reservation_system.model.Researcher researcher13 = new com.reservation_system.model.Researcher(5, "hi!", "labmanager", "Guest", false);
        userRepository7.addUser((com.reservation_system.model.User) researcher13);
        java.util.List<com.reservation_system.model.User> userList15 = userRepository7.getAllUsers();
        com.reservation_system.model.Guest guest21 = new com.reservation_system.model.Guest(0, "Password1!", "data/test-userrepo.csv", "researcher", false);
        boolean boolean22 = guest21.requiresDepartmentApproval();
        userRepository7.addUser((com.reservation_system.model.User) guest21);
        boolean boolean25 = userRepository7.emailExists("Alice");
        int int26 = userRepository7.getNextID();
        com.reservation_system.repository.UserRepository userRepository28 = new com.reservation_system.repository.UserRepository("data/test-userrepo.csv");
        boolean boolean30 = userRepository28.emailExists("Alice");
        com.reservation_system.repository.UserRepository userRepository32 = new com.reservation_system.repository.UserRepository("data/test-userrepo.csv");
        java.util.List<com.reservation_system.model.User> userList33 = userRepository32.getAllUsers();
        int int34 = userRepository32.getNextID();
        java.util.List<com.reservation_system.model.User> userList35 = userRepository32.getAllUsers();
        userRepository28.saveAllUsers(userList35);
        userRepository7.saveAllUsers(userList35);
        com.reservation_system.repository.UserRepository userRepository39 = new com.reservation_system.repository.UserRepository("data/test-userrepo.csv");
        boolean boolean41 = userRepository39.emailExists("Alice");
        com.reservation_system.repository.UserRepository userRepository43 = new com.reservation_system.repository.UserRepository("data/test-userrepo.csv");
        java.util.List<com.reservation_system.model.User> userList44 = userRepository43.getAllUsers();
        int int45 = userRepository43.getNextID();
        java.util.List<com.reservation_system.model.User> userList46 = userRepository43.getAllUsers();
        userRepository39.saveAllUsers(userList46);
        userRepository7.saveAllUsers(userList46);
        userRepository1.saveAllUsers(userList46);
        boolean boolean51 = userRepository1.emailExists("labmanager");
        com.reservation_system.model.Faculty faculty57 = new com.reservation_system.model.Faculty((int) (byte) 0, "faculty", "", "labmanager", true);
        userRepository1.addUser((com.reservation_system.model.User) faculty57);
        com.reservation_system.model.Student student64 = new com.reservation_system.model.Student(98, "guest", "data/test-userrepo.csv", "guest", false);
        userRepository1.addUser((com.reservation_system.model.User) student64);
        org.junit.Assert.assertNotNull(userList2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 101 + "'", int3 == 101);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(userList15);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 101 + "'", int26 == 101);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNotNull(userList33);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 101 + "'", int34 == 101);
        org.junit.Assert.assertNotNull(userList35);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertNotNull(userList44);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 101 + "'", int45 == 101);
        org.junit.Assert.assertNotNull(userList46);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + true + "'", boolean51 == true);
    }

    @Test
    public void test1661() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1661");
        com.reservation_system.model.Student student5 = new com.reservation_system.model.Student(0, "Faculty", "", "Researcher", false);
        java.lang.String str6 = student5.getUserType();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Student" + "'", str6, "Student");
    }

    @Test
    public void test1662() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1662");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("data/test-userrepo.csv");
        java.util.List<com.reservation_system.model.User> userList2 = userRepository1.getAllUsers();
        int int3 = userRepository1.getNextID();
        com.reservation_system.repository.UserRepository userRepository5 = new com.reservation_system.repository.UserRepository("data/test-userrepo.csv");
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
        java.util.Optional<com.reservation_system.model.User> userOptional24 = userRepository1.findByEmail("Faculty");
        org.junit.Assert.assertNotNull(userList2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 101 + "'", int3 == 101);
        org.junit.Assert.assertNotNull(userList6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 101 + "'", int7 == 101);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(userOptional12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(userList19);
// flaky "20) test1662(com.reservation_system.randoop.userrepository.RegressionTest3)":         org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertNotNull(userOptional24);
    }

    @Test
    public void test1663() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1663");
        com.reservation_system.model.Guest guest5 = new com.reservation_system.model.Guest((int) (byte) -1, "hi!", "", "Password1!", false);
        boolean boolean6 = guest5.isApproved();
        boolean boolean7 = guest5.requiresDepartmentApproval();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test1664() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1664");
        com.reservation_system.model.LabManager labManager5 = new com.reservation_system.model.LabManager((int) (short) 0, "Guest", "hi!", "faculty", false);
        java.lang.String str6 = labManager5.getPassword();
        java.lang.String str7 = labManager5.getUserType();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "faculty" + "'", str6, "faculty");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "labmanager" + "'", str7, "labmanager");
    }

    @Test
    public void test1665() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1665");
        com.reservation_system.model.LabManager labManager5 = new com.reservation_system.model.LabManager(52, "researcher", "Password1!", "researcher", false);
    }

    @Test
    public void test1666() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1666");
        com.reservation_system.model.HeadLabCoordinator headLabCoordinator5 = new com.reservation_system.model.HeadLabCoordinator(0, "Guest", "Faculty", "guest", false);
        java.lang.String str6 = headLabCoordinator5.getUserType();
        java.lang.String str7 = headLabCoordinator5.getName();
        java.lang.String str8 = headLabCoordinator5.getEmail();
        boolean boolean9 = headLabCoordinator5.isApproved();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "headlabcoordinator" + "'", str6, "headlabcoordinator");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Guest" + "'", str7, "Guest");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Faculty" + "'", str8, "Faculty");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test1667() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1667");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("data/test-userrepo.csv");
        com.reservation_system.model.Researcher researcher7 = new com.reservation_system.model.Researcher(5, "hi!", "labmanager", "Guest", false);
        userRepository1.addUser((com.reservation_system.model.User) researcher7);
        int int9 = userRepository1.getNextID();
        java.util.Optional<com.reservation_system.model.User> userOptional11 = userRepository1.findByEmail("headlabcoordinator");
        int int12 = userRepository1.getNextID();
        java.util.Optional<com.reservation_system.model.User> userOptional14 = userRepository1.findByEmail("Faculty");
        java.util.List<com.reservation_system.model.User> userList15 = userRepository1.getAllUsers();
        java.util.Optional<com.reservation_system.model.User> userOptional17 = userRepository1.findByEmail("data/test-userrepo.csv");
        int int18 = userRepository1.getNextID();
        boolean boolean19 = userRepository1.headLabCoordinatorExists();
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 101 + "'", int9 == 101);
        org.junit.Assert.assertNotNull(userOptional11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 101 + "'", int12 == 101);
        org.junit.Assert.assertNotNull(userOptional14);
        org.junit.Assert.assertNotNull(userList15);
        org.junit.Assert.assertNotNull(userOptional17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 101 + "'", int18 == 101);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
    }

    @Test
    public void test1668() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1668");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("data/test-userrepo.csv");
        com.reservation_system.model.Researcher researcher7 = new com.reservation_system.model.Researcher(5, "hi!", "labmanager", "Guest", false);
        userRepository1.addUser((com.reservation_system.model.User) researcher7);
        java.util.List<com.reservation_system.model.User> userList9 = userRepository1.getAllUsers();
        com.reservation_system.model.Guest guest15 = new com.reservation_system.model.Guest(0, "Password1!", "data/test-userrepo.csv", "researcher", false);
        boolean boolean16 = guest15.requiresDepartmentApproval();
        userRepository1.addUser((com.reservation_system.model.User) guest15);
        boolean boolean19 = userRepository1.emailExists("Alice");
        int int20 = userRepository1.getNextID();
        com.reservation_system.repository.UserRepository userRepository22 = new com.reservation_system.repository.UserRepository("data/test-userrepo.csv");
        java.util.List<com.reservation_system.model.User> userList23 = userRepository22.getAllUsers();
        userRepository1.saveAllUsers(userList23);
        java.util.Optional<com.reservation_system.model.User> userOptional26 = userRepository1.findByEmail("Password1!");
        int int27 = userRepository1.getNextID();
        java.util.Optional<com.reservation_system.model.User> userOptional29 = userRepository1.findByEmail("data/test-userrepo.csv");
        java.util.List<com.reservation_system.model.User> userList30 = userRepository1.getAllUsers();
        com.reservation_system.model.LabManager labManager36 = new com.reservation_system.model.LabManager(10, "Password1!", "data/test-userrepo.csv", "Guest", true);
        java.lang.String str37 = labManager36.getUserType();
        java.lang.String str38 = labManager36.getPassword();
        java.lang.String str39 = labManager36.getPassword();
        java.lang.String str40 = labManager36.getUserType();
        userRepository1.addUser((com.reservation_system.model.User) labManager36);
        int int42 = userRepository1.getNextID();
        java.util.Optional<com.reservation_system.model.User> userOptional44 = userRepository1.findByEmail("Alice");
        org.junit.Assert.assertNotNull(userList9);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 101 + "'", int20 == 101);
        org.junit.Assert.assertNotNull(userList23);
        org.junit.Assert.assertNotNull(userOptional26);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 101 + "'", int27 == 101);
        org.junit.Assert.assertNotNull(userOptional29);
        org.junit.Assert.assertNotNull(userList30);
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "labmanager" + "'", str37, "labmanager");
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "Guest" + "'", str38, "Guest");
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "Guest" + "'", str39, "Guest");
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "labmanager" + "'", str40, "labmanager");
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 101 + "'", int42 == 101);
        org.junit.Assert.assertNotNull(userOptional44);
    }

    @Test
    public void test1669() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1669");
        com.reservation_system.model.Researcher researcher5 = new com.reservation_system.model.Researcher((int) 'a', "Password1!", "hi!", "Alice", false);
        java.lang.String str6 = researcher5.getUserType();
        boolean boolean7 = researcher5.isApproved();
        java.lang.String str8 = researcher5.getName();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Researcher" + "'", str6, "Researcher");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Password1!" + "'", str8, "Password1!");
    }

    @Test
    public void test1670() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1670");
        com.reservation_system.model.LabManager labManager5 = new com.reservation_system.model.LabManager((int) '#', "researcher", "Guest", "headlabcoordinator", true);
        boolean boolean6 = labManager5.isApproved();
        java.lang.String str7 = labManager5.getEmail();
        boolean boolean8 = labManager5.isApproved();
        java.lang.String str9 = labManager5.getEmail();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Guest" + "'", str7, "Guest");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Guest" + "'", str9, "Guest");
    }

    @Test
    public void test1671() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1671");
        // The following exception was thrown during execution in test generation
        try {
            com.reservation_system.model.User user6 = com.reservation_system.patterns.factory.UserFactory.createUser("", 52, "labmanager", "hi!", "Faculty", true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid user type: ");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1672() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1672");
        com.reservation_system.model.Researcher researcher5 = new com.reservation_system.model.Researcher(100, "data/test-userrepo.csv", "Faculty", "Researcher", false);
    }

    @Test
    public void test1673() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1673");
        com.reservation_system.model.Faculty faculty5 = new com.reservation_system.model.Faculty(98, "Alice", "headlabcoordinator", "Password1!", true);
    }

    @Test
    public void test1674() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1674");
        com.reservation_system.model.Student student5 = new com.reservation_system.model.Student(1, "Researcher", "labmanager", "Guest", false);
    }

    @Test
    public void test1675() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1675");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("data/test-userrepo.csv");
        java.util.List<com.reservation_system.model.User> userList2 = userRepository1.getAllUsers();
        int int3 = userRepository1.getNextID();
        boolean boolean5 = userRepository1.emailExists("headlabcoordinator");
        boolean boolean6 = userRepository1.headLabCoordinatorExists();
        java.util.Optional<com.reservation_system.model.User> userOptional8 = userRepository1.findByEmail("Alice");
        boolean boolean10 = userRepository1.emailExists("Alice");
        boolean boolean12 = userRepository1.emailExists("Guest");
        boolean boolean14 = userRepository1.emailExists("headlabcoordinator");
        com.reservation_system.model.Student student20 = new com.reservation_system.model.Student(0, "Guest", "Password1!", "data/test-userrepo.csv", true);
        userRepository1.addUser((com.reservation_system.model.User) student20);
        com.reservation_system.repository.UserRepository userRepository23 = new com.reservation_system.repository.UserRepository("data/test-userrepo.csv");
        int int24 = userRepository23.getNextID();
        int int25 = userRepository23.getNextID();
        com.reservation_system.model.HeadLabCoordinator headLabCoordinator31 = new com.reservation_system.model.HeadLabCoordinator((int) (byte) 1, "", "", "guest", false);
        userRepository23.addUser((com.reservation_system.model.User) headLabCoordinator31);
        java.util.List<com.reservation_system.model.User> userList33 = userRepository23.getAllUsers();
        int int34 = userRepository23.getNextID();
        java.util.List<com.reservation_system.model.User> userList35 = userRepository23.getAllUsers();
        userRepository1.saveAllUsers(userList35);
        boolean boolean37 = userRepository1.headLabCoordinatorExists();
        java.util.List<com.reservation_system.model.User> userList38 = userRepository1.getAllUsers();
        org.junit.Assert.assertNotNull(userList2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 101 + "'", int3 == 101);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(userOptional8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 101 + "'", int24 == 101);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 101 + "'", int25 == 101);
        org.junit.Assert.assertNotNull(userList33);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 101 + "'", int34 == 101);
        org.junit.Assert.assertNotNull(userList35);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
        org.junit.Assert.assertNotNull(userList38);
    }

    @Test
    public void test1676() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1676");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("data/test-userrepo.csv");
        java.util.List<com.reservation_system.model.User> userList2 = userRepository1.getAllUsers();
        int int3 = userRepository1.getNextID();
        boolean boolean5 = userRepository1.emailExists("headlabcoordinator");
        boolean boolean6 = userRepository1.headLabCoordinatorExists();
        java.util.Optional<com.reservation_system.model.User> userOptional8 = userRepository1.findByEmail("Alice");
        java.util.Optional<com.reservation_system.model.User> userOptional10 = userRepository1.findByEmail("Student");
        com.reservation_system.repository.UserRepository userRepository12 = new com.reservation_system.repository.UserRepository("data/test-userrepo.csv");
        java.util.List<com.reservation_system.model.User> userList13 = userRepository12.getAllUsers();
        int int14 = userRepository12.getNextID();
        boolean boolean16 = userRepository12.emailExists("headlabcoordinator");
        boolean boolean17 = userRepository12.headLabCoordinatorExists();
        java.util.Optional<com.reservation_system.model.User> userOptional19 = userRepository12.findByEmail("Alice");
        boolean boolean21 = userRepository12.emailExists("Alice");
        boolean boolean23 = userRepository12.emailExists("Guest");
        boolean boolean25 = userRepository12.emailExists("headlabcoordinator");
        com.reservation_system.model.Student student31 = new com.reservation_system.model.Student(0, "Guest", "Password1!", "data/test-userrepo.csv", true);
        userRepository12.addUser((com.reservation_system.model.User) student31);
        boolean boolean33 = student31.isApproved();
        java.lang.String str34 = student31.getUserType();
        java.lang.String str35 = student31.getUserType();
        userRepository1.addUser((com.reservation_system.model.User) student31);
        org.junit.Assert.assertNotNull(userList2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 101 + "'", int3 == 101);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(userOptional8);
        org.junit.Assert.assertNotNull(userOptional10);
        org.junit.Assert.assertNotNull(userList13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 101 + "'", int14 == 101);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNotNull(userOptional19);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "Student" + "'", str34, "Student");
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "Student" + "'", str35, "Student");
    }

    @Test
    public void test1677() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1677");
        com.reservation_system.model.HeadLabCoordinator headLabCoordinator5 = new com.reservation_system.model.HeadLabCoordinator(0, "Faculty", "labmanager", "researcher", true);
        java.lang.String str6 = headLabCoordinator5.getUserType();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "headlabcoordinator" + "'", str6, "headlabcoordinator");
    }

    @Test
    public void test1678() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1678");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("data/test-userrepo.csv");
        com.reservation_system.model.Researcher researcher7 = new com.reservation_system.model.Researcher(5, "hi!", "labmanager", "Guest", false);
        userRepository1.addUser((com.reservation_system.model.User) researcher7);
        java.util.List<com.reservation_system.model.User> userList9 = userRepository1.getAllUsers();
        com.reservation_system.model.Guest guest15 = new com.reservation_system.model.Guest(0, "Password1!", "data/test-userrepo.csv", "researcher", false);
        boolean boolean16 = guest15.requiresDepartmentApproval();
        userRepository1.addUser((com.reservation_system.model.User) guest15);
        boolean boolean19 = userRepository1.emailExists("Alice");
        java.util.Optional<com.reservation_system.model.User> userOptional21 = userRepository1.findByEmail("hi!");
        int int22 = userRepository1.getNextID();
        com.reservation_system.repository.UserRepository userRepository24 = new com.reservation_system.repository.UserRepository("data/test-userrepo.csv");
        com.reservation_system.model.Researcher researcher30 = new com.reservation_system.model.Researcher(5, "hi!", "labmanager", "Guest", false);
        userRepository24.addUser((com.reservation_system.model.User) researcher30);
        int int32 = userRepository24.getNextID();
        com.reservation_system.repository.UserRepository userRepository34 = new com.reservation_system.repository.UserRepository("data/test-userrepo.csv");
        int int35 = userRepository34.getNextID();
        boolean boolean36 = userRepository34.headLabCoordinatorExists();
        com.reservation_system.model.Guest guest42 = new com.reservation_system.model.Guest((int) (byte) -1, "hi!", "", "Password1!", false);
        userRepository34.addUser((com.reservation_system.model.User) guest42);
        int int44 = userRepository34.getNextID();
        boolean boolean46 = userRepository34.emailExists("headlabcoordinator");
        java.util.List<com.reservation_system.model.User> userList47 = userRepository34.getAllUsers();
        userRepository24.saveAllUsers(userList47);
        userRepository1.saveAllUsers(userList47);
        int int50 = userRepository1.getNextID();
        int int51 = userRepository1.getNextID();
        int int52 = userRepository1.getNextID();
        org.junit.Assert.assertNotNull(userList9);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(userOptional21);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 101 + "'", int22 == 101);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 101 + "'", int32 == 101);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 101 + "'", int35 == 101);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 101 + "'", int44 == 101);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertNotNull(userList47);
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + 101 + "'", int50 == 101);
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + 101 + "'", int51 == 101);
        org.junit.Assert.assertTrue("'" + int52 + "' != '" + 101 + "'", int52 == 101);
    }

    @Test
    public void test1679() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1679");
        com.reservation_system.model.LabManager labManager5 = new com.reservation_system.model.LabManager((int) (short) -1, "labmanager", "hi!", "", false);
        java.lang.String str6 = labManager5.getEmail();
        java.lang.String str7 = labManager5.getUserType();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "labmanager" + "'", str7, "labmanager");
    }

    @Test
    public void test1680() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1680");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("data/test-userrepo.csv");
        int int2 = userRepository1.getNextID();
        boolean boolean3 = userRepository1.headLabCoordinatorExists();
        com.reservation_system.model.Guest guest9 = new com.reservation_system.model.Guest((int) (byte) -1, "hi!", "", "Password1!", false);
        userRepository1.addUser((com.reservation_system.model.User) guest9);
        int int11 = userRepository1.getNextID();
        boolean boolean13 = userRepository1.emailExists("headlabcoordinator");
        boolean boolean14 = userRepository1.headLabCoordinatorExists();
        boolean boolean15 = userRepository1.headLabCoordinatorExists();
        boolean boolean17 = userRepository1.emailExists("faculty");
        com.reservation_system.repository.UserRepository userRepository19 = new com.reservation_system.repository.UserRepository("data/test-userrepo.csv");
        boolean boolean21 = userRepository19.emailExists("Password1!");
        com.reservation_system.model.Faculty faculty27 = new com.reservation_system.model.Faculty((-1), "headlabcoordinator", "Student", "", false);
        userRepository19.addUser((com.reservation_system.model.User) faculty27);
        faculty27.setApproved(false);
        userRepository1.addUser((com.reservation_system.model.User) faculty27);
        boolean boolean33 = userRepository1.emailExists("alice@example.com");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 101 + "'", int2 == 101);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 101 + "'", int11 == 101);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
    }

    @Test
    public void test1681() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1681");
        com.reservation_system.model.Faculty faculty5 = new com.reservation_system.model.Faculty((int) (short) 10, "labmanager", "faculty", "alice@example.com", false);
        java.lang.String str6 = faculty5.getUserType();
        boolean boolean7 = faculty5.isApproved();
        java.lang.String str8 = faculty5.getEmail();
        java.lang.String str9 = faculty5.getPassword();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Faculty" + "'", str6, "Faculty");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "faculty" + "'", str8, "faculty");
    }

    @Test
    public void test1682() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1682");
        com.reservation_system.model.User user6 = com.reservation_system.patterns.factory.UserFactory.createUser("Faculty", (int) '4', "Guest", "Student", "data/test-userrepo.csv", false);
        java.lang.String str7 = user6.getPassword();
        org.junit.Assert.assertNotNull(user6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "data/test-userrepo.csv" + "'", str7, "data/test-userrepo.csv");
    }

    @Test
    public void test1683() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1683");
        com.reservation_system.model.Student student5 = new com.reservation_system.model.Student(1, "data/test-userrepo.csv", "alice@example.com", "guest", false);
        java.lang.String str6 = student5.getUserType();
        java.lang.String str7 = student5.getUserType();
        java.lang.String str8 = student5.getUserType();
        java.lang.String str9 = student5.getUserType();
        boolean boolean10 = student5.requiresDepartmentApproval();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Student" + "'", str6, "Student");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Student" + "'", str7, "Student");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Student" + "'", str8, "Student");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Student" + "'", str9, "Student");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test1684() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1684");
        com.reservation_system.model.HeadLabCoordinator headLabCoordinator5 = new com.reservation_system.model.HeadLabCoordinator((int) (byte) -1, "data/test-userrepo.csv", "alice@example.com", "student", true);
        int int6 = headLabCoordinator5.getID();
        java.lang.String str7 = headLabCoordinator5.getUserType();
        java.lang.String str8 = headLabCoordinator5.getUserType();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "headlabcoordinator" + "'", str7, "headlabcoordinator");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "headlabcoordinator" + "'", str8, "headlabcoordinator");
    }

    @Test
    public void test1685() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1685");
        com.reservation_system.model.LabManager labManager5 = new com.reservation_system.model.LabManager((int) (short) 10, "Student", "Guest", "Faculty", true);
    }

    @Test
    public void test1686() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1686");
        com.reservation_system.model.User user6 = com.reservation_system.patterns.factory.UserFactory.createUser("guest", (int) '4', "", "labmanager", "", false);
        org.junit.Assert.assertNotNull(user6);
    }

    @Test
    public void test1687() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1687");
        com.reservation_system.model.Guest guest5 = new com.reservation_system.model.Guest((int) (byte) 100, "Password1!", "faculty", "Student", false);
        java.lang.String str6 = guest5.getUserType();
        java.lang.String str7 = guest5.getUserType();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Guest" + "'", str6, "Guest");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Guest" + "'", str7, "Guest");
    }

    @Test
    public void test1688() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1688");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("data/test-userrepo.csv");
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
        java.util.Optional<com.reservation_system.model.User> userOptional26 = userRepository1.findByEmail("Guest");
        boolean boolean27 = userRepository1.headLabCoordinatorExists();
        int int28 = userRepository1.getNextID();
        com.reservation_system.model.HeadLabCoordinator headLabCoordinator34 = new com.reservation_system.model.HeadLabCoordinator(6, "Faculty", "", "faculty", true);
        java.lang.String str35 = headLabCoordinator34.getUserType();
        userRepository1.addUser((com.reservation_system.model.User) headLabCoordinator34);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 101 + "'", int2 == 101);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 101 + "'", int11 == 101);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 101 + "'", int24 == 101);
        org.junit.Assert.assertNotNull(userOptional26);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 101 + "'", int28 == 101);
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "headlabcoordinator" + "'", str35, "headlabcoordinator");
    }

    @Test
    public void test1689() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1689");
        com.reservation_system.model.Student student5 = new com.reservation_system.model.Student(0, "headlabcoordinator", "", "data/test-userrepo.csv", true);
    }

    @Test
    public void test1690() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1690");
        com.reservation_system.model.Student student5 = new com.reservation_system.model.Student(33, "Password1!", "guest", "headlabcoordinator", false);
    }

    @Test
    public void test1691() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1691");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("data/test-userrepo.csv");
        boolean boolean3 = userRepository1.emailExists("Alice");
        com.reservation_system.model.Researcher researcher9 = new com.reservation_system.model.Researcher((int) 'a', "labmanager", "faculty", "", false);
        boolean boolean10 = researcher9.isApproved();
        java.lang.String str11 = researcher9.getName();
        userRepository1.addUser((com.reservation_system.model.User) researcher9);
        boolean boolean13 = researcher9.requiresDepartmentApproval();
        java.lang.String str14 = researcher9.getName();
        boolean boolean15 = researcher9.isApproved();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "labmanager" + "'", str11, "labmanager");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "labmanager" + "'", str14, "labmanager");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test1692() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1692");
        com.reservation_system.model.LabManager labManager5 = new com.reservation_system.model.LabManager(35, "alice@example.com", "Guest", "Alice", false);
    }

    @Test
    public void test1693() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1693");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("data/test-userrepo.csv");
        com.reservation_system.model.Researcher researcher7 = new com.reservation_system.model.Researcher(5, "hi!", "labmanager", "Guest", false);
        userRepository1.addUser((com.reservation_system.model.User) researcher7);
        int int9 = userRepository1.getNextID();
        java.util.Optional<com.reservation_system.model.User> userOptional11 = userRepository1.findByEmail("headlabcoordinator");
        int int12 = userRepository1.getNextID();
        java.util.Optional<com.reservation_system.model.User> userOptional14 = userRepository1.findByEmail("Faculty");
        com.reservation_system.repository.UserRepository userRepository16 = new com.reservation_system.repository.UserRepository("data/test-userrepo.csv");
        java.util.List<com.reservation_system.model.User> userList17 = userRepository16.getAllUsers();
        userRepository1.saveAllUsers(userList17);
        java.util.List<com.reservation_system.model.User> userList19 = userRepository1.getAllUsers();
        com.reservation_system.model.User user26 = com.reservation_system.patterns.factory.UserFactory.createUser("labmanager", (int) (short) 10, "Faculty", "hi!", "Password1!", true);
        userRepository1.addUser(user26);
        boolean boolean28 = userRepository1.headLabCoordinatorExists();
        java.util.List<com.reservation_system.model.User> userList29 = userRepository1.getAllUsers();
        boolean boolean30 = userRepository1.headLabCoordinatorExists();
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 101 + "'", int9 == 101);
        org.junit.Assert.assertNotNull(userOptional11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 101 + "'", int12 == 101);
        org.junit.Assert.assertNotNull(userOptional14);
        org.junit.Assert.assertNotNull(userList17);
        org.junit.Assert.assertNotNull(userList19);
        org.junit.Assert.assertNotNull(user26);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertNotNull(userList29);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
    }

    @Test
    public void test1694() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1694");
        com.reservation_system.model.Guest guest5 = new com.reservation_system.model.Guest(10, "Password1!", "alice@example.com", "", false);
    }

    @Test
    public void test1695() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1695");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("data/test-userrepo.csv");
        java.util.List<com.reservation_system.model.User> userList2 = userRepository1.getAllUsers();
        int int3 = userRepository1.getNextID();
        boolean boolean5 = userRepository1.emailExists("headlabcoordinator");
        boolean boolean6 = userRepository1.headLabCoordinatorExists();
        java.util.Optional<com.reservation_system.model.User> userOptional8 = userRepository1.findByEmail("Alice");
        boolean boolean10 = userRepository1.emailExists("Alice");
        boolean boolean12 = userRepository1.emailExists("Guest");
        boolean boolean14 = userRepository1.emailExists("headlabcoordinator");
        java.util.List<com.reservation_system.model.User> userList15 = userRepository1.getAllUsers();
        int int16 = userRepository1.getNextID();
        com.reservation_system.repository.UserRepository userRepository18 = new com.reservation_system.repository.UserRepository("data/test-userrepo.csv");
        boolean boolean20 = userRepository18.emailExists("Password1!");
        boolean boolean22 = userRepository18.emailExists("hi!");
        com.reservation_system.repository.UserRepository userRepository24 = new com.reservation_system.repository.UserRepository("data/test-userrepo.csv");
        java.util.Optional<com.reservation_system.model.User> userOptional26 = userRepository24.findByEmail("hi!");
        java.util.List<com.reservation_system.model.User> userList27 = userRepository24.getAllUsers();
        userRepository18.saveAllUsers(userList27);
        userRepository1.saveAllUsers(userList27);
        com.reservation_system.repository.UserRepository userRepository31 = new com.reservation_system.repository.UserRepository("data/test-userrepo.csv");
        com.reservation_system.model.Researcher researcher37 = new com.reservation_system.model.Researcher(5, "hi!", "labmanager", "Guest", false);
        userRepository31.addUser((com.reservation_system.model.User) researcher37);
        java.util.List<com.reservation_system.model.User> userList39 = userRepository31.getAllUsers();
        com.reservation_system.model.Guest guest45 = new com.reservation_system.model.Guest(0, "Password1!", "data/test-userrepo.csv", "researcher", false);
        boolean boolean46 = guest45.requiresDepartmentApproval();
        userRepository31.addUser((com.reservation_system.model.User) guest45);
        boolean boolean49 = userRepository31.emailExists("Alice");
        int int50 = userRepository31.getNextID();
        com.reservation_system.repository.UserRepository userRepository52 = new com.reservation_system.repository.UserRepository("data/test-userrepo.csv");
        boolean boolean54 = userRepository52.emailExists("Alice");
        com.reservation_system.repository.UserRepository userRepository56 = new com.reservation_system.repository.UserRepository("data/test-userrepo.csv");
        java.util.List<com.reservation_system.model.User> userList57 = userRepository56.getAllUsers();
        int int58 = userRepository56.getNextID();
        java.util.List<com.reservation_system.model.User> userList59 = userRepository56.getAllUsers();
        userRepository52.saveAllUsers(userList59);
        userRepository31.saveAllUsers(userList59);
        java.util.Optional<com.reservation_system.model.User> userOptional63 = userRepository31.findByEmail("alice@example.com");
        com.reservation_system.repository.UserRepository userRepository65 = new com.reservation_system.repository.UserRepository("data/test-userrepo.csv");
        boolean boolean67 = userRepository65.emailExists("Alice");
        com.reservation_system.repository.UserRepository userRepository69 = new com.reservation_system.repository.UserRepository("data/test-userrepo.csv");
        java.util.List<com.reservation_system.model.User> userList70 = userRepository69.getAllUsers();
        int int71 = userRepository69.getNextID();
        java.util.List<com.reservation_system.model.User> userList72 = userRepository69.getAllUsers();
        userRepository65.saveAllUsers(userList72);
        userRepository31.saveAllUsers(userList72);
        userRepository1.saveAllUsers(userList72);
        boolean boolean77 = userRepository1.emailExists("Faculty");
        java.util.List<com.reservation_system.model.User> userList78 = userRepository1.getAllUsers();
        boolean boolean80 = userRepository1.emailExists("student");
        org.junit.Assert.assertNotNull(userList2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 101 + "'", int3 == 101);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(userOptional8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(userList15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 101 + "'", int16 == 101);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertNotNull(userOptional26);
        org.junit.Assert.assertNotNull(userList27);
        org.junit.Assert.assertNotNull(userList39);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + 101 + "'", int50 == 101);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertNotNull(userList57);
        org.junit.Assert.assertTrue("'" + int58 + "' != '" + 101 + "'", int58 == 101);
        org.junit.Assert.assertNotNull(userList59);
        org.junit.Assert.assertNotNull(userOptional63);
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + false + "'", boolean67 == false);
        org.junit.Assert.assertNotNull(userList70);
        org.junit.Assert.assertTrue("'" + int71 + "' != '" + 101 + "'", int71 == 101);
        org.junit.Assert.assertNotNull(userList72);
        org.junit.Assert.assertTrue("'" + boolean77 + "' != '" + true + "'", boolean77 == true);
        org.junit.Assert.assertNotNull(userList78);
        org.junit.Assert.assertTrue("'" + boolean80 + "' != '" + true + "'", boolean80 == true);
    }

    @Test
    public void test1696() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1696");
        com.reservation_system.model.User user6 = com.reservation_system.patterns.factory.UserFactory.createUser("headlabcoordinator", 10, "Researcher", "guest", "Password1!", false);
        user6.setApproved(true);
        boolean boolean9 = user6.requiresDepartmentApproval();
        org.junit.Assert.assertNotNull(user6);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test1697() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1697");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("data/test-userrepo.csv");
        int int2 = userRepository1.getNextID();
        int int3 = userRepository1.getNextID();
        com.reservation_system.model.HeadLabCoordinator headLabCoordinator9 = new com.reservation_system.model.HeadLabCoordinator((int) (byte) 1, "", "", "guest", false);
        userRepository1.addUser((com.reservation_system.model.User) headLabCoordinator9);
        java.util.List<com.reservation_system.model.User> userList11 = userRepository1.getAllUsers();
        boolean boolean13 = userRepository1.emailExists("Faculty");
        boolean boolean15 = userRepository1.emailExists("Alice");
        com.reservation_system.model.User user16 = null;
        // The following exception was thrown during execution in test generation
        try {
            userRepository1.addUser(user16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 101 + "'", int2 == 101);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 101 + "'", int3 == 101);
        org.junit.Assert.assertNotNull(userList11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test1698() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1698");
        com.reservation_system.model.Guest guest5 = new com.reservation_system.model.Guest(6, "faculty", "Researcher", "alice@example.com", false);
    }

    @Test
    public void test1699() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1699");
        com.reservation_system.model.Student student5 = new com.reservation_system.model.Student(5, "Guest", "Student", "faculty", true);
        java.lang.String str6 = student5.getPassword();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "faculty" + "'", str6, "faculty");
    }

    @Test
    public void test1700() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1700");
        com.reservation_system.model.User user6 = com.reservation_system.patterns.factory.UserFactory.createUser("headlabcoordinator", 97, "student", "hi!", "data/test-userrepo.csv", false);
        org.junit.Assert.assertNotNull(user6);
    }

    @Test
    public void test1701() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1701");
        com.reservation_system.model.Faculty faculty5 = new com.reservation_system.model.Faculty((int) (byte) 100, "data/test-userrepo.csv", "Password1!", "student", false);
    }

    @Test
    public void test1702() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1702");
        // The following exception was thrown during execution in test generation
        try {
            com.reservation_system.model.User user6 = com.reservation_system.patterns.factory.UserFactory.createUser("hi!", (int) (byte) 0, "alice@example.com", "Faculty", "Student", false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid user type: hi!");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1703() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1703");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("data/test-userrepo.csv");
        com.reservation_system.model.Researcher researcher7 = new com.reservation_system.model.Researcher(5, "hi!", "labmanager", "Guest", false);
        userRepository1.addUser((com.reservation_system.model.User) researcher7);
        java.util.List<com.reservation_system.model.User> userList9 = userRepository1.getAllUsers();
        com.reservation_system.repository.UserRepository userRepository11 = new com.reservation_system.repository.UserRepository("data/test-userrepo.csv");
        com.reservation_system.model.Researcher researcher17 = new com.reservation_system.model.Researcher(5, "hi!", "labmanager", "Guest", false);
        userRepository11.addUser((com.reservation_system.model.User) researcher17);
        java.util.Optional<com.reservation_system.model.User> userOptional20 = userRepository11.findByEmail("alice@example.com");
        java.util.List<com.reservation_system.model.User> userList21 = userRepository11.getAllUsers();
        userRepository1.saveAllUsers(userList21);
        boolean boolean23 = userRepository1.headLabCoordinatorExists();
        int int24 = userRepository1.getNextID();
        java.util.Optional<com.reservation_system.model.User> userOptional26 = userRepository1.findByEmail("Faculty");
        com.reservation_system.repository.UserRepository userRepository28 = new com.reservation_system.repository.UserRepository("data/test-userrepo.csv");
        boolean boolean30 = userRepository28.emailExists("Password1!");
        com.reservation_system.model.Faculty faculty36 = new com.reservation_system.model.Faculty((-1), "headlabcoordinator", "Student", "", false);
        userRepository28.addUser((com.reservation_system.model.User) faculty36);
        faculty36.setApproved(false);
        userRepository1.addUser((com.reservation_system.model.User) faculty36);
        java.util.List<com.reservation_system.model.User> userList41 = userRepository1.getAllUsers();
        java.util.Optional<com.reservation_system.model.User> userOptional43 = userRepository1.findByEmail("Alice");
        org.junit.Assert.assertNotNull(userList9);
        org.junit.Assert.assertNotNull(userOptional20);
        org.junit.Assert.assertNotNull(userList21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 101 + "'", int24 == 101);
        org.junit.Assert.assertNotNull(userOptional26);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertNotNull(userList41);
        org.junit.Assert.assertNotNull(userOptional43);
    }

    @Test
    public void test1704() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1704");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("data/test-userrepo.csv");
        com.reservation_system.model.Researcher researcher7 = new com.reservation_system.model.Researcher(5, "hi!", "labmanager", "Guest", false);
        userRepository1.addUser((com.reservation_system.model.User) researcher7);
        java.util.List<com.reservation_system.model.User> userList9 = userRepository1.getAllUsers();
        com.reservation_system.repository.UserRepository userRepository11 = new com.reservation_system.repository.UserRepository("data/test-userrepo.csv");
        com.reservation_system.model.Researcher researcher17 = new com.reservation_system.model.Researcher(5, "hi!", "labmanager", "Guest", false);
        userRepository11.addUser((com.reservation_system.model.User) researcher17);
        java.util.List<com.reservation_system.model.User> userList19 = userRepository11.getAllUsers();
        userRepository1.saveAllUsers(userList19);
        boolean boolean21 = userRepository1.headLabCoordinatorExists();
        boolean boolean23 = userRepository1.emailExists("labmanager");
        com.reservation_system.model.Guest guest29 = new com.reservation_system.model.Guest(1, "labmanager", "guest", "faculty", true);
        userRepository1.addUser((com.reservation_system.model.User) guest29);
        org.junit.Assert.assertNotNull(userList9);
        org.junit.Assert.assertNotNull(userList19);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
    }

    @Test
    public void test1705() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1705");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("data/test-userrepo.csv");
        int int2 = userRepository1.getNextID();
        boolean boolean3 = userRepository1.headLabCoordinatorExists();
        com.reservation_system.model.Guest guest9 = new com.reservation_system.model.Guest((int) (byte) -1, "hi!", "", "Password1!", false);
        userRepository1.addUser((com.reservation_system.model.User) guest9);
        int int11 = userRepository1.getNextID();
        boolean boolean13 = userRepository1.emailExists("headlabcoordinator");
        java.util.List<com.reservation_system.model.User> userList14 = userRepository1.getAllUsers();
        java.util.List<com.reservation_system.model.User> userList15 = userRepository1.getAllUsers();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 101 + "'", int2 == 101);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 101 + "'", int11 == 101);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(userList14);
        org.junit.Assert.assertNotNull(userList15);
    }

    @Test
    public void test1706() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1706");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("data/test-userrepo.csv");
        com.reservation_system.model.Researcher researcher7 = new com.reservation_system.model.Researcher(5, "hi!", "labmanager", "Guest", false);
        userRepository1.addUser((com.reservation_system.model.User) researcher7);
        java.util.List<com.reservation_system.model.User> userList9 = userRepository1.getAllUsers();
        boolean boolean10 = userRepository1.headLabCoordinatorExists();
        java.util.Optional<com.reservation_system.model.User> userOptional12 = userRepository1.findByEmail("data/test-userrepo.csv");
        java.lang.Class<?> wildcardClass13 = userOptional12.getClass();
        org.junit.Assert.assertNotNull(userList9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(userOptional12);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test1707() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1707");
        com.reservation_system.model.Guest guest5 = new com.reservation_system.model.Guest((int) (byte) -1, "hi!", "", "Password1!", false);
        int int6 = guest5.getID();
        java.lang.String str7 = guest5.getUserType();
        java.lang.String str8 = guest5.getUserType();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Guest" + "'", str7, "Guest");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Guest" + "'", str8, "Guest");
    }

    @Test
    public void test1708() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1708");
        com.reservation_system.model.LabManager labManager5 = new com.reservation_system.model.LabManager((int) '#', "researcher", "Guest", "headlabcoordinator", true);
        boolean boolean6 = labManager5.isApproved();
        java.lang.String str7 = labManager5.getEmail();
        boolean boolean8 = labManager5.isApproved();
        labManager5.setApproved(false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Guest" + "'", str7, "Guest");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test1709() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1709");
        com.reservation_system.model.Faculty faculty5 = new com.reservation_system.model.Faculty(1, "Password1!", "guest", "Student", false);
    }

    @Test
    public void test1710() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1710");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("data/test-userrepo.csv");
        com.reservation_system.model.Researcher researcher7 = new com.reservation_system.model.Researcher(5, "hi!", "labmanager", "Guest", false);
        userRepository1.addUser((com.reservation_system.model.User) researcher7);
        java.util.List<com.reservation_system.model.User> userList9 = userRepository1.getAllUsers();
        boolean boolean10 = userRepository1.headLabCoordinatorExists();
        com.reservation_system.model.LabManager labManager16 = new com.reservation_system.model.LabManager((int) '#', "researcher", "Guest", "headlabcoordinator", true);
        int int17 = labManager16.getID();
        userRepository1.addUser((com.reservation_system.model.User) labManager16);
        boolean boolean19 = userRepository1.headLabCoordinatorExists();
        java.util.List<com.reservation_system.model.User> userList20 = userRepository1.getAllUsers();
        org.junit.Assert.assertNotNull(userList9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 35 + "'", int17 == 35);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNotNull(userList20);
    }

    @Test
    public void test1711() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1711");
        com.reservation_system.model.HeadLabCoordinator headLabCoordinator5 = new com.reservation_system.model.HeadLabCoordinator((int) 'a', "Researcher", "", "headlabcoordinator", true);
    }

    @Test
    public void test1712() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1712");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("data/test-userrepo.csv");
        java.util.List<com.reservation_system.model.User> userList2 = userRepository1.getAllUsers();
        int int3 = userRepository1.getNextID();
        boolean boolean5 = userRepository1.emailExists("headlabcoordinator");
        boolean boolean6 = userRepository1.headLabCoordinatorExists();
        java.util.Optional<com.reservation_system.model.User> userOptional8 = userRepository1.findByEmail("Alice");
        boolean boolean9 = userRepository1.headLabCoordinatorExists();
        com.reservation_system.repository.UserRepository userRepository11 = new com.reservation_system.repository.UserRepository("data/test-userrepo.csv");
        com.reservation_system.model.Researcher researcher17 = new com.reservation_system.model.Researcher(5, "hi!", "labmanager", "Guest", false);
        userRepository11.addUser((com.reservation_system.model.User) researcher17);
        java.util.List<com.reservation_system.model.User> userList19 = userRepository11.getAllUsers();
        com.reservation_system.model.Guest guest25 = new com.reservation_system.model.Guest(0, "Password1!", "data/test-userrepo.csv", "researcher", false);
        boolean boolean26 = guest25.requiresDepartmentApproval();
        userRepository11.addUser((com.reservation_system.model.User) guest25);
        boolean boolean29 = userRepository11.emailExists("Alice");
        int int30 = userRepository11.getNextID();
        com.reservation_system.repository.UserRepository userRepository32 = new com.reservation_system.repository.UserRepository("data/test-userrepo.csv");
        boolean boolean34 = userRepository32.emailExists("Alice");
        com.reservation_system.repository.UserRepository userRepository36 = new com.reservation_system.repository.UserRepository("data/test-userrepo.csv");
        java.util.List<com.reservation_system.model.User> userList37 = userRepository36.getAllUsers();
        int int38 = userRepository36.getNextID();
        java.util.List<com.reservation_system.model.User> userList39 = userRepository36.getAllUsers();
        userRepository32.saveAllUsers(userList39);
        userRepository11.saveAllUsers(userList39);
        com.reservation_system.repository.UserRepository userRepository43 = new com.reservation_system.repository.UserRepository("data/test-userrepo.csv");
        boolean boolean45 = userRepository43.emailExists("Alice");
        com.reservation_system.repository.UserRepository userRepository47 = new com.reservation_system.repository.UserRepository("data/test-userrepo.csv");
        java.util.List<com.reservation_system.model.User> userList48 = userRepository47.getAllUsers();
        int int49 = userRepository47.getNextID();
        java.util.List<com.reservation_system.model.User> userList50 = userRepository47.getAllUsers();
        userRepository43.saveAllUsers(userList50);
        userRepository11.saveAllUsers(userList50);
        userRepository1.saveAllUsers(userList50);
        int int54 = userRepository1.getNextID();
        boolean boolean56 = userRepository1.emailExists("hi!");
        org.junit.Assert.assertNotNull(userList2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 101 + "'", int3 == 101);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(userOptional8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(userList19);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 101 + "'", int30 == 101);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertNotNull(userList37);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 101 + "'", int38 == 101);
        org.junit.Assert.assertNotNull(userList39);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertNotNull(userList48);
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + 101 + "'", int49 == 101);
        org.junit.Assert.assertNotNull(userList50);
        org.junit.Assert.assertTrue("'" + int54 + "' != '" + 101 + "'", int54 == 101);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + true + "'", boolean56 == true);
    }

    @Test
    public void test1713() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1713");
        com.reservation_system.model.Guest guest5 = new com.reservation_system.model.Guest((int) (byte) -1, "Researcher", "faculty", "", false);
    }

    @Test
    public void test1714() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1714");
        com.reservation_system.model.LabManager labManager5 = new com.reservation_system.model.LabManager(52, "hi!", "", "Guest", true);
        labManager5.setApproved(false);
    }

    @Test
    public void test1715() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1715");
        com.reservation_system.model.Guest guest5 = new com.reservation_system.model.Guest(99, "labmanager", "", "Faculty", false);
    }

    @Test
    public void test1716() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1716");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("data/test-userrepo.csv");
        boolean boolean3 = userRepository1.emailExists("Password1!");
        boolean boolean5 = userRepository1.emailExists("hi!");
        java.util.List<com.reservation_system.model.User> userList6 = userRepository1.getAllUsers();
        java.util.Optional<com.reservation_system.model.User> userOptional8 = userRepository1.findByEmail("headlabcoordinator");
        com.reservation_system.model.Researcher researcher14 = new com.reservation_system.model.Researcher((int) 'a', "", "labmanager", "data/test-userrepo.csv", true);
        researcher14.setApproved(false);
        java.lang.String str17 = researcher14.getUserType();
        userRepository1.addUser((com.reservation_system.model.User) researcher14);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(userList6);
        org.junit.Assert.assertNotNull(userOptional8);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "Researcher" + "'", str17, "Researcher");
    }

    @Test
    public void test1717() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1717");
        com.reservation_system.model.Researcher researcher5 = new com.reservation_system.model.Researcher(35, "guest", "Researcher", "guest", false);
        java.lang.String str6 = researcher5.getUserType();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Researcher" + "'", str6, "Researcher");
    }

    @Test
    public void test1718() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1718");
        com.reservation_system.model.Student student5 = new com.reservation_system.model.Student((int) ' ', "Researcher", "", "guest", true);
    }

    @Test
    public void test1719() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1719");
        com.reservation_system.model.LabManager labManager5 = new com.reservation_system.model.LabManager((int) (short) 10, "student", "Faculty", "guest", false);
    }

    @Test
    public void test1720() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1720");
        com.reservation_system.model.Faculty faculty5 = new com.reservation_system.model.Faculty((int) ' ', "labmanager", "Guest", "headlabcoordinator", false);
    }

    @Test
    public void test1721() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1721");
        com.reservation_system.model.User user6 = com.reservation_system.patterns.factory.UserFactory.createUser("guest", 100, "headlabcoordinator", "labmanager", "", true);
        int int7 = user6.getID();
        int int8 = user6.getID();
        java.lang.Class<?> wildcardClass9 = user6.getClass();
        org.junit.Assert.assertNotNull(user6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 100 + "'", int7 == 100);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8 == 100);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test1722() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1722");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("data/test-userrepo.csv");
        com.reservation_system.model.Researcher researcher7 = new com.reservation_system.model.Researcher(5, "hi!", "labmanager", "Guest", false);
        userRepository1.addUser((com.reservation_system.model.User) researcher7);
        java.util.List<com.reservation_system.model.User> userList9 = userRepository1.getAllUsers();
        com.reservation_system.model.Guest guest15 = new com.reservation_system.model.Guest(0, "Password1!", "data/test-userrepo.csv", "researcher", false);
        boolean boolean16 = guest15.requiresDepartmentApproval();
        userRepository1.addUser((com.reservation_system.model.User) guest15);
        boolean boolean19 = userRepository1.emailExists("Alice");
        java.util.Optional<com.reservation_system.model.User> userOptional21 = userRepository1.findByEmail("hi!");
        java.util.List<com.reservation_system.model.User> userList22 = userRepository1.getAllUsers();
        int int23 = userRepository1.getNextID();
        boolean boolean25 = userRepository1.emailExists("Faculty");
        boolean boolean27 = userRepository1.emailExists("hi!");
        org.junit.Assert.assertNotNull(userList9);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(userOptional21);
        org.junit.Assert.assertNotNull(userList22);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 101 + "'", int23 == 101);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
    }

    @Test
    public void test1723() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1723");
        com.reservation_system.model.LabManager labManager5 = new com.reservation_system.model.LabManager(99, "", "headlabcoordinator", "labmanager", true);
    }

    @Test
    public void test1724() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1724");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("data/test-userrepo.csv");
        int int2 = userRepository1.getNextID();
        int int3 = userRepository1.getNextID();
        com.reservation_system.model.HeadLabCoordinator headLabCoordinator9 = new com.reservation_system.model.HeadLabCoordinator((int) (byte) 1, "", "", "guest", false);
        userRepository1.addUser((com.reservation_system.model.User) headLabCoordinator9);
        java.lang.String str11 = headLabCoordinator9.getEmail();
        boolean boolean12 = headLabCoordinator9.isApproved();
        java.lang.String str13 = headLabCoordinator9.getUserType();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 101 + "'", int2 == 101);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 101 + "'", int3 == 101);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "headlabcoordinator" + "'", str13, "headlabcoordinator");
    }

    @Test
    public void test1725() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1725");
        com.reservation_system.model.Guest guest5 = new com.reservation_system.model.Guest((int) '#', "hi!", "data/test-userrepo.csv", "", false);
        guest5.setApproved(true);
    }

    @Test
    public void test1726() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1726");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("data/test-userrepo.csv");
        int int2 = userRepository1.getNextID();
        boolean boolean3 = userRepository1.headLabCoordinatorExists();
        com.reservation_system.model.Guest guest9 = new com.reservation_system.model.Guest((int) (byte) -1, "hi!", "", "Password1!", false);
        userRepository1.addUser((com.reservation_system.model.User) guest9);
        int int11 = userRepository1.getNextID();
        boolean boolean13 = userRepository1.emailExists("headlabcoordinator");
        java.util.List<com.reservation_system.model.User> userList14 = userRepository1.getAllUsers();
        int int15 = userRepository1.getNextID();
        java.util.List<com.reservation_system.model.User> userList16 = userRepository1.getAllUsers();
        boolean boolean18 = userRepository1.emailExists("alice@example.com");
        boolean boolean19 = userRepository1.headLabCoordinatorExists();
        java.util.Optional<com.reservation_system.model.User> userOptional21 = userRepository1.findByEmail("student");
        boolean boolean23 = userRepository1.emailExists("");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 101 + "'", int2 == 101);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 101 + "'", int11 == 101);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(userList14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 101 + "'", int15 == 101);
        org.junit.Assert.assertNotNull(userList16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNotNull(userOptional21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
    }

    @Test
    public void test1727() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1727");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("data/test-userrepo.csv");
        com.reservation_system.model.Researcher researcher7 = new com.reservation_system.model.Researcher(5, "hi!", "labmanager", "Guest", false);
        userRepository1.addUser((com.reservation_system.model.User) researcher7);
        java.lang.String str9 = researcher7.getUserType();
        java.lang.String str10 = researcher7.getUserType();
        researcher7.setApproved(true);
        java.lang.String str13 = researcher7.getUserType();
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Researcher" + "'", str9, "Researcher");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Researcher" + "'", str10, "Researcher");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Researcher" + "'", str13, "Researcher");
    }

    @Test
    public void test1728() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1728");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("data/test-userrepo.csv");
        com.reservation_system.model.Researcher researcher7 = new com.reservation_system.model.Researcher(5, "hi!", "labmanager", "Guest", false);
        userRepository1.addUser((com.reservation_system.model.User) researcher7);
        int int9 = userRepository1.getNextID();
        java.util.Optional<com.reservation_system.model.User> userOptional11 = userRepository1.findByEmail("headlabcoordinator");
        int int12 = userRepository1.getNextID();
        java.util.Optional<com.reservation_system.model.User> userOptional14 = userRepository1.findByEmail("Faculty");
        java.util.Optional<com.reservation_system.model.User> userOptional16 = userRepository1.findByEmail("researcher");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 101 + "'", int9 == 101);
        org.junit.Assert.assertNotNull(userOptional11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 101 + "'", int12 == 101);
        org.junit.Assert.assertNotNull(userOptional14);
        org.junit.Assert.assertNotNull(userOptional16);
    }

    @Test
    public void test1729() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1729");
        com.reservation_system.model.Researcher researcher5 = new com.reservation_system.model.Researcher((int) '#', "", "researcher", "alice@example.com", false);
        java.lang.String str6 = researcher5.getUserType();
        java.lang.String str7 = researcher5.getUserType();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Researcher" + "'", str6, "Researcher");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Researcher" + "'", str7, "Researcher");
    }

    @Test
    public void test1730() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1730");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("data/test-userrepo.csv");
        java.util.List<com.reservation_system.model.User> userList2 = userRepository1.getAllUsers();
        boolean boolean3 = userRepository1.headLabCoordinatorExists();
        com.reservation_system.model.Faculty faculty9 = new com.reservation_system.model.Faculty((-1), "Researcher", "hi!", "headlabcoordinator", false);
        java.lang.String str10 = faculty9.getUserType();
        userRepository1.addUser((com.reservation_system.model.User) faculty9);
        java.lang.String str12 = faculty9.getUserType();
        org.junit.Assert.assertNotNull(userList2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Faculty" + "'", str10, "Faculty");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Faculty" + "'", str12, "Faculty");
    }

    @Test
    public void test1731() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1731");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("data/test-userrepo.csv");
        int int2 = userRepository1.getNextID();
        int int3 = userRepository1.getNextID();
        com.reservation_system.model.HeadLabCoordinator headLabCoordinator9 = new com.reservation_system.model.HeadLabCoordinator((int) (byte) 1, "", "", "guest", false);
        userRepository1.addUser((com.reservation_system.model.User) headLabCoordinator9);
        java.util.List<com.reservation_system.model.User> userList11 = userRepository1.getAllUsers();
        int int12 = userRepository1.getNextID();
        java.util.List<com.reservation_system.model.User> userList13 = userRepository1.getAllUsers();
        boolean boolean15 = userRepository1.emailExists("researcher");
        com.reservation_system.model.Guest guest21 = new com.reservation_system.model.Guest((int) (byte) -1, "hi!", "", "Password1!", false);
        java.lang.String str22 = guest21.getEmail();
        java.lang.String str23 = guest21.getUserType();
        userRepository1.addUser((com.reservation_system.model.User) guest21);
        int int25 = userRepository1.getNextID();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 101 + "'", int2 == 101);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 101 + "'", int3 == 101);
        org.junit.Assert.assertNotNull(userList11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 101 + "'", int12 == 101);
        org.junit.Assert.assertNotNull(userList13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "Guest" + "'", str23, "Guest");
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 101 + "'", int25 == 101);
    }

    @Test
    public void test1732() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1732");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("data/test-userrepo.csv");
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
        java.util.List<com.reservation_system.model.User> userList24 = userRepository1.getAllUsers();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 101 + "'", int2 == 101);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 101 + "'", int11 == 101);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(userList24);
    }

    @Test
    public void test1733() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1733");
        com.reservation_system.model.Student student5 = new com.reservation_system.model.Student(100, "headlabcoordinator", "headlabcoordinator", "", true);
    }

    @Test
    public void test1734() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1734");
        com.reservation_system.model.Guest guest5 = new com.reservation_system.model.Guest((int) (short) 100, "", "student", "Researcher", true);
        int int6 = guest5.getID();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
    }

    @Test
    public void test1735() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1735");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("data/test-userrepo.csv");
        boolean boolean3 = userRepository1.emailExists("Alice");
        int int4 = userRepository1.getNextID();
        boolean boolean5 = userRepository1.headLabCoordinatorExists();
        boolean boolean6 = userRepository1.headLabCoordinatorExists();
        boolean boolean8 = userRepository1.emailExists("Researcher");
        boolean boolean10 = userRepository1.emailExists("Password1!");
        boolean boolean11 = userRepository1.headLabCoordinatorExists();
        com.reservation_system.model.HeadLabCoordinator headLabCoordinator17 = new com.reservation_system.model.HeadLabCoordinator(0, "alice@example.com", "labmanager", "", true);
        userRepository1.addUser((com.reservation_system.model.User) headLabCoordinator17);
        java.lang.Class<?> wildcardClass19 = userRepository1.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 101 + "'", int4 == 101);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test1736() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1736");
        com.reservation_system.model.Faculty faculty5 = new com.reservation_system.model.Faculty((-1), "headlabcoordinator", "Student", "", false);
        java.lang.String str6 = faculty5.getUserType();
        boolean boolean7 = faculty5.isApproved();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Faculty" + "'", str6, "Faculty");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test1737() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1737");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("data/test-userrepo.csv");
        java.util.List<com.reservation_system.model.User> userList2 = userRepository1.getAllUsers();
        int int3 = userRepository1.getNextID();
        boolean boolean5 = userRepository1.emailExists("headlabcoordinator");
        boolean boolean6 = userRepository1.headLabCoordinatorExists();
        java.util.Optional<com.reservation_system.model.User> userOptional8 = userRepository1.findByEmail("Alice");
        boolean boolean10 = userRepository1.emailExists("Alice");
        java.util.Optional<com.reservation_system.model.User> userOptional12 = userRepository1.findByEmail("Alice");
        boolean boolean14 = userRepository1.emailExists("researcher");
        int int15 = userRepository1.getNextID();
        com.reservation_system.repository.UserRepository userRepository17 = new com.reservation_system.repository.UserRepository("data/test-userrepo.csv");
        java.util.List<com.reservation_system.model.User> userList18 = userRepository17.getAllUsers();
        int int19 = userRepository17.getNextID();
        boolean boolean21 = userRepository17.emailExists("headlabcoordinator");
        boolean boolean22 = userRepository17.headLabCoordinatorExists();
        java.util.Optional<com.reservation_system.model.User> userOptional24 = userRepository17.findByEmail("Alice");
        boolean boolean26 = userRepository17.emailExists("Alice");
        com.reservation_system.repository.UserRepository userRepository28 = new com.reservation_system.repository.UserRepository("data/test-userrepo.csv");
        java.util.List<com.reservation_system.model.User> userList29 = userRepository28.getAllUsers();
        int int30 = userRepository28.getNextID();
        boolean boolean32 = userRepository28.emailExists("headlabcoordinator");
        boolean boolean33 = userRepository28.headLabCoordinatorExists();
        java.util.Optional<com.reservation_system.model.User> userOptional35 = userRepository28.findByEmail("Alice");
        boolean boolean37 = userRepository28.emailExists("Alice");
        int int38 = userRepository28.getNextID();
        java.util.List<com.reservation_system.model.User> userList39 = userRepository28.getAllUsers();
        userRepository17.saveAllUsers(userList39);
        com.reservation_system.repository.UserRepository userRepository42 = new com.reservation_system.repository.UserRepository("data/test-userrepo.csv");
        com.reservation_system.model.Researcher researcher48 = new com.reservation_system.model.Researcher(5, "hi!", "labmanager", "Guest", false);
        userRepository42.addUser((com.reservation_system.model.User) researcher48);
        java.util.List<com.reservation_system.model.User> userList50 = userRepository42.getAllUsers();
        com.reservation_system.repository.UserRepository userRepository52 = new com.reservation_system.repository.UserRepository("data/test-userrepo.csv");
        com.reservation_system.model.Researcher researcher58 = new com.reservation_system.model.Researcher(5, "hi!", "labmanager", "Guest", false);
        userRepository52.addUser((com.reservation_system.model.User) researcher58);
        java.util.Optional<com.reservation_system.model.User> userOptional61 = userRepository52.findByEmail("alice@example.com");
        java.util.List<com.reservation_system.model.User> userList62 = userRepository52.getAllUsers();
        userRepository42.saveAllUsers(userList62);
        com.reservation_system.model.Student student69 = new com.reservation_system.model.Student((int) (short) 100, "guest", "Guest", "faculty", false);
        userRepository42.addUser((com.reservation_system.model.User) student69);
        int int71 = student69.getID();
        userRepository17.addUser((com.reservation_system.model.User) student69);
        userRepository1.addUser((com.reservation_system.model.User) student69);
        org.junit.Assert.assertNotNull(userList2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 101 + "'", int3 == 101);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(userOptional8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(userOptional12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 101 + "'", int15 == 101);
        org.junit.Assert.assertNotNull(userList18);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 101 + "'", int19 == 101);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertNotNull(userOptional24);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(userList29);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 101 + "'", int30 == 101);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertNotNull(userOptional35);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 101 + "'", int38 == 101);
        org.junit.Assert.assertNotNull(userList39);
        org.junit.Assert.assertNotNull(userList50);
        org.junit.Assert.assertNotNull(userOptional61);
        org.junit.Assert.assertNotNull(userList62);
        org.junit.Assert.assertTrue("'" + int71 + "' != '" + 100 + "'", int71 == 100);
    }

    @Test
    public void test1738() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1738");
        com.reservation_system.model.LabManager labManager5 = new com.reservation_system.model.LabManager(98, "", "alice@example.com", "researcher", false);
    }

    @Test
    public void test1739() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1739");
        com.reservation_system.model.Guest guest5 = new com.reservation_system.model.Guest((int) 'a', "", "", "Researcher", true);
        java.lang.String str6 = guest5.getUserType();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Guest" + "'", str6, "Guest");
    }

    @Test
    public void test1740() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1740");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("data/test-userrepo.csv");
        java.util.List<com.reservation_system.model.User> userList2 = userRepository1.getAllUsers();
        int int3 = userRepository1.getNextID();
        boolean boolean5 = userRepository1.emailExists("headlabcoordinator");
        boolean boolean6 = userRepository1.headLabCoordinatorExists();
        java.util.Optional<com.reservation_system.model.User> userOptional8 = userRepository1.findByEmail("Alice");
        java.util.List<com.reservation_system.model.User> userList9 = userRepository1.getAllUsers();
        com.reservation_system.repository.UserRepository userRepository11 = new com.reservation_system.repository.UserRepository("data/test-userrepo.csv");
        java.util.List<com.reservation_system.model.User> userList12 = userRepository11.getAllUsers();
        int int13 = userRepository11.getNextID();
        boolean boolean15 = userRepository11.emailExists("headlabcoordinator");
        com.reservation_system.model.Researcher researcher21 = new com.reservation_system.model.Researcher((int) (byte) 1, "data/test-userrepo.csv", "alice@example.com", "", false);
        userRepository11.addUser((com.reservation_system.model.User) researcher21);
        userRepository1.addUser((com.reservation_system.model.User) researcher21);
        java.lang.String str24 = researcher21.getUserType();
        researcher21.setApproved(true);
        org.junit.Assert.assertNotNull(userList2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 101 + "'", int3 == 101);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(userOptional8);
        org.junit.Assert.assertNotNull(userList9);
        org.junit.Assert.assertNotNull(userList12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 101 + "'", int13 == 101);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "Researcher" + "'", str24, "Researcher");
    }

    @Test
    public void test1741() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1741");
        com.reservation_system.model.Guest guest5 = new com.reservation_system.model.Guest((int) (short) 10, "hi!", "Guest", "Faculty", false);
    }

    @Test
    public void test1742() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1742");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("data/test-userrepo.csv");
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
        com.reservation_system.model.Student student23 = new com.reservation_system.model.Student(1, "data/test-userrepo.csv", "alice@example.com", "guest", false);
        java.lang.String str24 = student23.getUserType();
        java.lang.String str25 = student23.getUserType();
        userRepository1.addUser((com.reservation_system.model.User) student23);
        int int27 = userRepository1.getNextID();
        boolean boolean29 = userRepository1.emailExists("researcher");
        java.lang.Class<?> wildcardClass30 = userRepository1.getClass();
        org.junit.Assert.assertNotNull(userList2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 101 + "'", int3 == 101);
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
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 101 + "'", int27 == 101);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(wildcardClass30);
    }

    @Test
    public void test1743() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1743");
        com.reservation_system.model.Student student5 = new com.reservation_system.model.Student((int) 'a', "Researcher", "guest", "Guest", true);
        java.lang.String str6 = student5.getUserType();
        java.lang.String str7 = student5.getUserType();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Student" + "'", str6, "Student");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Student" + "'", str7, "Student");
    }

    @Test
    public void test1744() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1744");
        com.reservation_system.model.LabManager labManager5 = new com.reservation_system.model.LabManager((int) '#', "researcher", "Guest", "headlabcoordinator", true);
        java.lang.String str6 = labManager5.getEmail();
        java.lang.String str7 = labManager5.getEmail();
        java.lang.String str8 = labManager5.getUserType();
        java.lang.String str9 = labManager5.getEmail();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Guest" + "'", str6, "Guest");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Guest" + "'", str7, "Guest");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "labmanager" + "'", str8, "labmanager");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Guest" + "'", str9, "Guest");
    }

    @Test
    public void test1745() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1745");
        com.reservation_system.model.Researcher researcher5 = new com.reservation_system.model.Researcher((int) (byte) 100, "Password1!", "student", "", true);
        researcher5.setApproved(false);
    }

    @Test
    public void test1746() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1746");
        com.reservation_system.model.Faculty faculty5 = new com.reservation_system.model.Faculty((int) (byte) -1, "faculty", "data/test-userrepo.csv", "Student", false);
        java.lang.String str6 = faculty5.getName();
        boolean boolean7 = faculty5.requiresDepartmentApproval();
        java.lang.String str8 = faculty5.getPassword();
        java.lang.String str9 = faculty5.getPassword();
        java.lang.String str10 = faculty5.getPassword();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "faculty" + "'", str6, "faculty");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Student" + "'", str8, "Student");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Student" + "'", str9, "Student");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Student" + "'", str10, "Student");
    }

    @Test
    public void test1747() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1747");
        com.reservation_system.model.Faculty faculty5 = new com.reservation_system.model.Faculty(5, "researcher", "guest", "faculty", true);
        java.lang.String str6 = faculty5.getUserType();
        java.lang.String str7 = faculty5.getUserType();
        java.lang.String str8 = faculty5.getUserType();
        faculty5.setApproved(false);
        int int11 = faculty5.getID();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Faculty" + "'", str6, "Faculty");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Faculty" + "'", str7, "Faculty");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Faculty" + "'", str8, "Faculty");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 5 + "'", int11 == 5);
    }

    @Test
    public void test1748() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1748");
        com.reservation_system.model.Guest guest5 = new com.reservation_system.model.Guest((int) (byte) 10, "Guest", "guest", "", false);
        java.lang.String str6 = guest5.getUserType();
        guest5.setApproved(true);
        boolean boolean9 = guest5.isApproved();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Guest" + "'", str6, "Guest");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test1749() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1749");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("data/test-userrepo.csv");
        com.reservation_system.model.Researcher researcher7 = new com.reservation_system.model.Researcher(5, "hi!", "labmanager", "Guest", false);
        userRepository1.addUser((com.reservation_system.model.User) researcher7);
        java.util.List<com.reservation_system.model.User> userList9 = userRepository1.getAllUsers();
        com.reservation_system.model.Guest guest15 = new com.reservation_system.model.Guest(0, "Password1!", "data/test-userrepo.csv", "researcher", false);
        boolean boolean16 = guest15.requiresDepartmentApproval();
        userRepository1.addUser((com.reservation_system.model.User) guest15);
        boolean boolean19 = userRepository1.emailExists("Alice");
        int int20 = userRepository1.getNextID();
        com.reservation_system.repository.UserRepository userRepository22 = new com.reservation_system.repository.UserRepository("data/test-userrepo.csv");
        java.util.List<com.reservation_system.model.User> userList23 = userRepository22.getAllUsers();
        userRepository1.saveAllUsers(userList23);
        com.reservation_system.model.HeadLabCoordinator headLabCoordinator30 = new com.reservation_system.model.HeadLabCoordinator(0, "researcher", "guest", "Alice", false);
        headLabCoordinator30.setApproved(false);
        userRepository1.addUser((com.reservation_system.model.User) headLabCoordinator30);
        org.junit.Assert.assertNotNull(userList9);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 101 + "'", int20 == 101);
        org.junit.Assert.assertNotNull(userList23);
    }

    @Test
    public void test1750() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1750");
        com.reservation_system.model.LabManager labManager5 = new com.reservation_system.model.LabManager(0, "researcher", "Student", "hi!", true);
        java.lang.String str6 = labManager5.getUserType();
        boolean boolean7 = labManager5.isApproved();
        java.lang.Class<?> wildcardClass8 = labManager5.getClass();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "labmanager" + "'", str6, "labmanager");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test1751() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1751");
        com.reservation_system.model.Student student5 = new com.reservation_system.model.Student(101, "labmanager", "researcher", "hi!", true);
    }

    @Test
    public void test1752() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1752");
        com.reservation_system.model.Faculty faculty5 = new com.reservation_system.model.Faculty(0, "Student", "hi!", "data/test-userrepo.csv", true);
        java.lang.String str6 = faculty5.getName();
        java.lang.String str7 = faculty5.getUserType();
        boolean boolean8 = faculty5.isApproved();
        java.lang.String str9 = faculty5.getUserType();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Student" + "'", str6, "Student");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Faculty" + "'", str7, "Faculty");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Faculty" + "'", str9, "Faculty");
    }

    @Test
    public void test1753() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1753");
        // The following exception was thrown during execution in test generation
        try {
            com.reservation_system.model.User user6 = com.reservation_system.patterns.factory.UserFactory.createUser("data/test-userrepo.csv", (int) (byte) -1, "Password1!", "researcher", "Password1!", false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid user type: data/test-userrepo.csv");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1754() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1754");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("data/test-userrepo.csv");
        java.util.List<com.reservation_system.model.User> userList2 = userRepository1.getAllUsers();
        int int3 = userRepository1.getNextID();
        boolean boolean5 = userRepository1.emailExists("headlabcoordinator");
        boolean boolean7 = userRepository1.emailExists("Faculty");
        java.util.Optional<com.reservation_system.model.User> userOptional9 = userRepository1.findByEmail("Password1!");
        org.junit.Assert.assertNotNull(userList2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 101 + "'", int3 == 101);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(userOptional9);
    }

    @Test
    public void test1755() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1755");
        com.reservation_system.model.User user6 = com.reservation_system.patterns.factory.UserFactory.createUser("guest", 0, "hi!", "researcher", "Student", false);
        org.junit.Assert.assertNotNull(user6);
    }

    @Test
    public void test1756() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1756");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("data/test-userrepo.csv");
        int int2 = userRepository1.getNextID();
        int int3 = userRepository1.getNextID();
        com.reservation_system.model.HeadLabCoordinator headLabCoordinator9 = new com.reservation_system.model.HeadLabCoordinator((int) (byte) 1, "", "", "guest", false);
        userRepository1.addUser((com.reservation_system.model.User) headLabCoordinator9);
        java.util.List<com.reservation_system.model.User> userList11 = userRepository1.getAllUsers();
        int int12 = userRepository1.getNextID();
        java.util.List<com.reservation_system.model.User> userList13 = userRepository1.getAllUsers();
        boolean boolean15 = userRepository1.emailExists("researcher");
        boolean boolean17 = userRepository1.emailExists("faculty");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 101 + "'", int2 == 101);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 101 + "'", int3 == 101);
        org.junit.Assert.assertNotNull(userList11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 101 + "'", int12 == 101);
        org.junit.Assert.assertNotNull(userList13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
    }

    @Test
    public void test1757() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1757");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("data/test-userrepo.csv");
        com.reservation_system.model.Researcher researcher7 = new com.reservation_system.model.Researcher(5, "hi!", "labmanager", "Guest", false);
        userRepository1.addUser((com.reservation_system.model.User) researcher7);
        boolean boolean10 = userRepository1.emailExists("headlabcoordinator");
        boolean boolean12 = userRepository1.emailExists("guest");
        boolean boolean13 = userRepository1.headLabCoordinatorExists();
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test1758() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1758");
        com.reservation_system.model.Faculty faculty5 = new com.reservation_system.model.Faculty((int) (byte) -1, "Alice", "researcher", "Password1!", false);
        java.lang.String str6 = faculty5.getName();
        java.lang.String str7 = faculty5.getUserType();
        java.lang.String str8 = faculty5.getUserType();
        java.lang.String str9 = faculty5.getPassword();
        java.lang.String str10 = faculty5.getEmail();
        boolean boolean11 = faculty5.requiresDepartmentApproval();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Alice" + "'", str6, "Alice");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Faculty" + "'", str7, "Faculty");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Faculty" + "'", str8, "Faculty");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Password1!" + "'", str9, "Password1!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "researcher" + "'", str10, "researcher");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test1759() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1759");
        com.reservation_system.model.Guest guest5 = new com.reservation_system.model.Guest((int) (byte) -1, "guest", "data/test-userrepo.csv", "headlabcoordinator", false);
        int int6 = guest5.getID();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
    }

    @Test
    public void test1760() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1760");
        com.reservation_system.model.HeadLabCoordinator headLabCoordinator5 = new com.reservation_system.model.HeadLabCoordinator((int) (short) 100, "headlabcoordinator", "", "Alice", false);
    }

    @Test
    public void test1761() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1761");
        com.reservation_system.model.Guest guest5 = new com.reservation_system.model.Guest((int) (byte) 1, "faculty", "Faculty", "alice@example.com", true);
        java.lang.String str6 = guest5.getUserType();
        java.lang.String str7 = guest5.getPassword();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Guest" + "'", str6, "Guest");
    }

    @Test
    public void test1762() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1762");
        com.reservation_system.model.Guest guest5 = new com.reservation_system.model.Guest((int) (byte) 100, "Guest", "student", "Guest", false);
    }

    @Test
    public void test1763() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1763");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("data/test-userrepo.csv");
        int int2 = userRepository1.getNextID();
        int int3 = userRepository1.getNextID();
        com.reservation_system.model.HeadLabCoordinator headLabCoordinator9 = new com.reservation_system.model.HeadLabCoordinator((int) (byte) 1, "", "", "guest", false);
        userRepository1.addUser((com.reservation_system.model.User) headLabCoordinator9);
        java.util.List<com.reservation_system.model.User> userList11 = userRepository1.getAllUsers();
        java.util.List<com.reservation_system.model.User> userList12 = userRepository1.getAllUsers();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 101 + "'", int2 == 101);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 101 + "'", int3 == 101);
        org.junit.Assert.assertNotNull(userList11);
        org.junit.Assert.assertNotNull(userList12);
    }

    @Test
    public void test1764() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1764");
        com.reservation_system.model.LabManager labManager5 = new com.reservation_system.model.LabManager((int) '#', "researcher", "", "Researcher", true);
        java.lang.String str6 = labManager5.getUserType();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "labmanager" + "'", str6, "labmanager");
    }

    @Test
    public void test1765() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1765");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("data/test-userrepo.csv");
        boolean boolean3 = userRepository1.emailExists("Alice");
        com.reservation_system.model.Researcher researcher9 = new com.reservation_system.model.Researcher((int) 'a', "labmanager", "faculty", "", false);
        boolean boolean10 = researcher9.isApproved();
        java.lang.String str11 = researcher9.getName();
        userRepository1.addUser((com.reservation_system.model.User) researcher9);
        java.util.List<com.reservation_system.model.User> userList13 = userRepository1.getAllUsers();
        boolean boolean14 = userRepository1.headLabCoordinatorExists();
        java.util.Optional<com.reservation_system.model.User> userOptional16 = userRepository1.findByEmail("alice@example.com");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "labmanager" + "'", str11, "labmanager");
        org.junit.Assert.assertNotNull(userList13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(userOptional16);
    }

    @Test
    public void test1766() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1766");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("data/test-userrepo.csv");
        int int2 = userRepository1.getNextID();
        boolean boolean3 = userRepository1.headLabCoordinatorExists();
        com.reservation_system.model.Guest guest9 = new com.reservation_system.model.Guest((int) (byte) -1, "hi!", "", "Password1!", false);
        userRepository1.addUser((com.reservation_system.model.User) guest9);
        int int11 = userRepository1.getNextID();
        boolean boolean13 = userRepository1.emailExists("headlabcoordinator");
        java.util.List<com.reservation_system.model.User> userList14 = userRepository1.getAllUsers();
        int int15 = userRepository1.getNextID();
        java.util.List<com.reservation_system.model.User> userList16 = userRepository1.getAllUsers();
        boolean boolean18 = userRepository1.emailExists("alice@example.com");
        boolean boolean19 = userRepository1.headLabCoordinatorExists();
        com.reservation_system.repository.UserRepository userRepository21 = new com.reservation_system.repository.UserRepository("data/test-userrepo.csv");
        int int22 = userRepository21.getNextID();
        boolean boolean23 = userRepository21.headLabCoordinatorExists();
        java.util.List<com.reservation_system.model.User> userList24 = userRepository21.getAllUsers();
        userRepository1.saveAllUsers(userList24);
        boolean boolean26 = userRepository1.headLabCoordinatorExists();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 101 + "'", int2 == 101);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 101 + "'", int11 == 101);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(userList14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 101 + "'", int15 == 101);
        org.junit.Assert.assertNotNull(userList16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 101 + "'", int22 == 101);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertNotNull(userList24);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
    }

    @Test
    public void test1767() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1767");
        com.reservation_system.model.Guest guest5 = new com.reservation_system.model.Guest((int) (short) 0, "labmanager", "Student", "Alice", true);
    }

    @Test
    public void test1768() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1768");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("data/test-userrepo.csv");
        int int2 = userRepository1.getNextID();
        boolean boolean3 = userRepository1.headLabCoordinatorExists();
        com.reservation_system.model.Guest guest9 = new com.reservation_system.model.Guest((int) (byte) -1, "hi!", "", "Password1!", false);
        userRepository1.addUser((com.reservation_system.model.User) guest9);
        java.util.Optional<com.reservation_system.model.User> userOptional12 = userRepository1.findByEmail("Faculty");
        boolean boolean14 = userRepository1.emailExists("hi!");
        int int15 = userRepository1.getNextID();
        java.util.Optional<com.reservation_system.model.User> userOptional17 = userRepository1.findByEmail("alice@example.com");
        int int18 = userRepository1.getNextID();
        boolean boolean20 = userRepository1.emailExists("");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 101 + "'", int2 == 101);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(userOptional12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 101 + "'", int15 == 101);
        org.junit.Assert.assertNotNull(userOptional17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 101 + "'", int18 == 101);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
    }

    @Test
    public void test1769() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1769");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("data/test-userrepo.csv");
        com.reservation_system.model.Researcher researcher7 = new com.reservation_system.model.Researcher(5, "hi!", "labmanager", "Guest", false);
        userRepository1.addUser((com.reservation_system.model.User) researcher7);
        java.util.List<com.reservation_system.model.User> userList9 = userRepository1.getAllUsers();
        boolean boolean10 = userRepository1.headLabCoordinatorExists();
        boolean boolean12 = userRepository1.emailExists("guest");
        java.util.Optional<com.reservation_system.model.User> userOptional14 = userRepository1.findByEmail("researcher");
        java.util.Optional<com.reservation_system.model.User> userOptional16 = userRepository1.findByEmail("alice@example.com");
        boolean boolean18 = userRepository1.emailExists("Student");
        com.reservation_system.model.LabManager labManager24 = new com.reservation_system.model.LabManager(10, "Password1!", "data/test-userrepo.csv", "Guest", true);
        java.lang.String str25 = labManager24.getUserType();
        boolean boolean26 = labManager24.requiresDepartmentApproval();
        userRepository1.addUser((com.reservation_system.model.User) labManager24);
        java.lang.String str28 = labManager24.getName();
        org.junit.Assert.assertNotNull(userList9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(userOptional14);
        org.junit.Assert.assertNotNull(userOptional16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "labmanager" + "'", str25, "labmanager");
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "Password1!" + "'", str28, "Password1!");
    }

    @Test
    public void test1770() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1770");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("data/test-userrepo.csv");
        int int2 = userRepository1.getNextID();
        int int3 = userRepository1.getNextID();
        java.util.List<com.reservation_system.model.User> userList4 = userRepository1.getAllUsers();
        java.util.List<com.reservation_system.model.User> userList5 = userRepository1.getAllUsers();
        com.reservation_system.model.HeadLabCoordinator headLabCoordinator11 = new com.reservation_system.model.HeadLabCoordinator(5, "Faculty", "", "Alice", false);
        java.lang.String str12 = headLabCoordinator11.getUserType();
        java.lang.String str13 = headLabCoordinator11.getUserType();
        java.lang.String str14 = headLabCoordinator11.getName();
        userRepository1.addUser((com.reservation_system.model.User) headLabCoordinator11);
        boolean boolean16 = userRepository1.headLabCoordinatorExists();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 101 + "'", int2 == 101);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 101 + "'", int3 == 101);
        org.junit.Assert.assertNotNull(userList4);
        org.junit.Assert.assertNotNull(userList5);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "headlabcoordinator" + "'", str12, "headlabcoordinator");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "headlabcoordinator" + "'", str13, "headlabcoordinator");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Faculty" + "'", str14, "Faculty");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
    }

    @Test
    public void test1771() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1771");
        com.reservation_system.model.Researcher researcher5 = new com.reservation_system.model.Researcher((int) (short) 1, "data/test-userrepo.csv", "researcher", "Guest", false);
        java.lang.String str6 = researcher5.getUserType();
        boolean boolean7 = researcher5.requiresDepartmentApproval();
        java.lang.String str8 = researcher5.getUserType();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Researcher" + "'", str6, "Researcher");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Researcher" + "'", str8, "Researcher");
    }

    @Test
    public void test1772() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1772");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("data/test-userrepo.csv");
        java.util.List<com.reservation_system.model.User> userList2 = userRepository1.getAllUsers();
        int int3 = userRepository1.getNextID();
        boolean boolean5 = userRepository1.emailExists("headlabcoordinator");
        boolean boolean6 = userRepository1.headLabCoordinatorExists();
        java.util.Optional<com.reservation_system.model.User> userOptional8 = userRepository1.findByEmail("Alice");
        boolean boolean10 = userRepository1.emailExists("Alice");
        boolean boolean12 = userRepository1.emailExists("Guest");
        boolean boolean14 = userRepository1.emailExists("headlabcoordinator");
        com.reservation_system.model.Student student20 = new com.reservation_system.model.Student(0, "Guest", "Password1!", "data/test-userrepo.csv", true);
        userRepository1.addUser((com.reservation_system.model.User) student20);
        int int22 = student20.getID();
        java.lang.String str23 = student20.getUserType();
        java.lang.String str24 = student20.getUserType();
        org.junit.Assert.assertNotNull(userList2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 101 + "'", int3 == 101);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(userOptional8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "Student" + "'", str23, "Student");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "Student" + "'", str24, "Student");
    }

    @Test
    public void test1773() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1773");
        com.reservation_system.model.Student student5 = new com.reservation_system.model.Student(100, "Researcher", "", "Password1!", false);
        boolean boolean6 = student5.isApproved();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test1774() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1774");
        com.reservation_system.model.Guest guest5 = new com.reservation_system.model.Guest(99, "Student", "headlabcoordinator", "Password1!", false);
    }

    @Test
    public void test1775() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1775");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("data/test-userrepo.csv");
        com.reservation_system.model.Researcher researcher7 = new com.reservation_system.model.Researcher(5, "hi!", "labmanager", "Guest", false);
        userRepository1.addUser((com.reservation_system.model.User) researcher7);
        int int9 = userRepository1.getNextID();
        java.util.Optional<com.reservation_system.model.User> userOptional11 = userRepository1.findByEmail("headlabcoordinator");
        com.reservation_system.repository.UserRepository userRepository13 = new com.reservation_system.repository.UserRepository("data/test-userrepo.csv");
        java.util.List<com.reservation_system.model.User> userList14 = userRepository13.getAllUsers();
        int int15 = userRepository13.getNextID();
        boolean boolean17 = userRepository13.emailExists("headlabcoordinator");
        boolean boolean18 = userRepository13.headLabCoordinatorExists();
        java.util.Optional<com.reservation_system.model.User> userOptional20 = userRepository13.findByEmail("Alice");
        boolean boolean22 = userRepository13.emailExists("Alice");
        boolean boolean24 = userRepository13.emailExists("Guest");
        boolean boolean26 = userRepository13.emailExists("headlabcoordinator");
        com.reservation_system.model.Student student32 = new com.reservation_system.model.Student(0, "Guest", "Password1!", "data/test-userrepo.csv", true);
        userRepository13.addUser((com.reservation_system.model.User) student32);
        userRepository1.addUser((com.reservation_system.model.User) student32);
        boolean boolean36 = userRepository1.emailExists("student");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 101 + "'", int9 == 101);
        org.junit.Assert.assertNotNull(userOptional11);
        org.junit.Assert.assertNotNull(userList14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 101 + "'", int15 == 101);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(userOptional20);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
    }

    @Test
    public void test1776() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1776");
        com.reservation_system.model.Student student5 = new com.reservation_system.model.Student(5, "faculty", "headlabcoordinator", "guest", false);
    }

    @Test
    public void test1777() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1777");
        com.reservation_system.model.Guest guest5 = new com.reservation_system.model.Guest(10, "", "guest", "headlabcoordinator", false);
        guest5.setApproved(true);
        int int8 = guest5.getID();
        boolean boolean9 = guest5.isApproved();
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 10 + "'", int8 == 10);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test1778() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1778");
        com.reservation_system.model.Guest guest5 = new com.reservation_system.model.Guest(6, "alice@example.com", "Student", "hi!", true);
        java.lang.String str6 = guest5.getUserType();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Guest" + "'", str6, "Guest");
    }

    @Test
    public void test1779() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1779");
        com.reservation_system.model.Student student5 = new com.reservation_system.model.Student(1, "data/test-userrepo.csv", "alice@example.com", "guest", false);
        java.lang.String str6 = student5.getUserType();
        java.lang.String str7 = student5.getUserType();
        java.lang.String str8 = student5.getName();
        java.lang.String str9 = student5.getPassword();
        java.lang.String str10 = student5.getUserType();
        int int11 = student5.getID();
        boolean boolean12 = student5.requiresDepartmentApproval();
        java.lang.String str13 = student5.getUserType();
        boolean boolean14 = student5.requiresDepartmentApproval();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Student" + "'", str6, "Student");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Student" + "'", str7, "Student");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "data/test-userrepo.csv" + "'", str8, "data/test-userrepo.csv");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "guest" + "'", str9, "guest");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Student" + "'", str10, "Student");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Student" + "'", str13, "Student");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test1780() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1780");
        com.reservation_system.model.Faculty faculty5 = new com.reservation_system.model.Faculty(5, "researcher", "guest", "faculty", true);
        java.lang.String str6 = faculty5.getUserType();
        java.lang.String str7 = faculty5.getPassword();
        java.lang.String str8 = faculty5.getUserType();
        int int9 = faculty5.getID();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Faculty" + "'", str6, "Faculty");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "faculty" + "'", str7, "faculty");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Faculty" + "'", str8, "Faculty");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 5 + "'", int9 == 5);
    }

    @Test
    public void test1781() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1781");
        com.reservation_system.model.Faculty faculty5 = new com.reservation_system.model.Faculty(99, "Faculty", "Student", "Researcher", false);
    }

    @Test
    public void test1782() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1782");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("data/test-userrepo.csv");
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
        com.reservation_system.model.Student student23 = new com.reservation_system.model.Student(1, "data/test-userrepo.csv", "alice@example.com", "guest", false);
        java.lang.String str24 = student23.getUserType();
        java.lang.String str25 = student23.getUserType();
        userRepository1.addUser((com.reservation_system.model.User) student23);
        boolean boolean28 = userRepository1.emailExists("faculty");
        boolean boolean30 = userRepository1.emailExists("data/test-userrepo.csv");
        boolean boolean31 = userRepository1.headLabCoordinatorExists();
        org.junit.Assert.assertNotNull(userList2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 101 + "'", int3 == 101);
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
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
    }

    @Test
    public void test1783() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1783");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("data/test-userrepo.csv");
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
        com.reservation_system.model.Student student23 = new com.reservation_system.model.Student(1, "data/test-userrepo.csv", "alice@example.com", "guest", false);
        java.lang.String str24 = student23.getUserType();
        java.lang.String str25 = student23.getUserType();
        userRepository1.addUser((com.reservation_system.model.User) student23);
        boolean boolean28 = userRepository1.emailExists("faculty");
        boolean boolean30 = userRepository1.emailExists("data/test-userrepo.csv");
        com.reservation_system.model.Researcher researcher36 = new com.reservation_system.model.Researcher((int) (byte) 1, "Faculty", "", "Guest", false);
        userRepository1.addUser((com.reservation_system.model.User) researcher36);
        java.util.Optional<com.reservation_system.model.User> userOptional39 = userRepository1.findByEmail("Password1!");
        com.reservation_system.model.Guest guest45 = new com.reservation_system.model.Guest((int) 'a', "student", "", "labmanager", false);
        java.lang.String str46 = guest45.getUserType();
        java.lang.String str47 = guest45.getUserType();
        userRepository1.addUser((com.reservation_system.model.User) guest45);
        org.junit.Assert.assertNotNull(userList2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 101 + "'", int3 == 101);
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
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertNotNull(userOptional39);
        org.junit.Assert.assertEquals("'" + str46 + "' != '" + "Guest" + "'", str46, "Guest");
        org.junit.Assert.assertEquals("'" + str47 + "' != '" + "Guest" + "'", str47, "Guest");
    }

    @Test
    public void test1784() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1784");
        com.reservation_system.model.Student student5 = new com.reservation_system.model.Student(100, "labmanager", "hi!", "Alice", false);
        java.lang.String str6 = student5.getPassword();
        java.lang.String str7 = student5.getUserType();
        boolean boolean8 = student5.requiresDepartmentApproval();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Alice" + "'", str6, "Alice");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Student" + "'", str7, "Student");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test1785() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1785");
        com.reservation_system.model.Researcher researcher5 = new com.reservation_system.model.Researcher((int) '#', "student", "student", "Guest", true);
        int int6 = researcher5.getID();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 35 + "'", int6 == 35);
    }

    @Test
    public void test1786() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1786");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("data/test-userrepo.csv");
        java.util.List<com.reservation_system.model.User> userList2 = userRepository1.getAllUsers();
        boolean boolean3 = userRepository1.headLabCoordinatorExists();
        boolean boolean5 = userRepository1.emailExists("Researcher");
        boolean boolean7 = userRepository1.emailExists("Guest");
        org.junit.Assert.assertNotNull(userList2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test1787() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1787");
        com.reservation_system.model.Guest guest5 = new com.reservation_system.model.Guest(5, "guest", "data/test-userrepo.csv", "Faculty", false);
        java.lang.String str6 = guest5.getUserType();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Guest" + "'", str6, "Guest");
    }

    @Test
    public void test1788() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1788");
        com.reservation_system.model.Student student5 = new com.reservation_system.model.Student((int) (byte) 0, "student", "student", "faculty", false);
        java.lang.String str6 = student5.getUserType();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Student" + "'", str6, "Student");
    }

    @Test
    public void test1789() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1789");
        com.reservation_system.model.Guest guest5 = new com.reservation_system.model.Guest((int) (byte) 1, "labmanager", "headlabcoordinator", "headlabcoordinator", true);
    }

    @Test
    public void test1790() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1790");
        com.reservation_system.model.Researcher researcher5 = new com.reservation_system.model.Researcher((-1), "researcher", "Alice", "", true);
    }

    @Test
    public void test1791() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1791");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("data/test-userrepo.csv");
        java.util.List<com.reservation_system.model.User> userList2 = userRepository1.getAllUsers();
        int int3 = userRepository1.getNextID();
        boolean boolean5 = userRepository1.emailExists("headlabcoordinator");
        boolean boolean6 = userRepository1.headLabCoordinatorExists();
        java.util.Optional<com.reservation_system.model.User> userOptional8 = userRepository1.findByEmail("Alice");
        boolean boolean10 = userRepository1.emailExists("Alice");
        boolean boolean12 = userRepository1.emailExists("Guest");
        boolean boolean14 = userRepository1.emailExists("headlabcoordinator");
        java.util.List<com.reservation_system.model.User> userList15 = userRepository1.getAllUsers();
        java.util.List<com.reservation_system.model.User> userList16 = userRepository1.getAllUsers();
        boolean boolean17 = userRepository1.headLabCoordinatorExists();
        org.junit.Assert.assertNotNull(userList2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 101 + "'", int3 == 101);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(userOptional8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(userList15);
        org.junit.Assert.assertNotNull(userList16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
    }

    @Test
    public void test1792() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1792");
        com.reservation_system.model.Student student5 = new com.reservation_system.model.Student((int) ' ', "Guest", "faculty", "Guest", false);
    }

    @Test
    public void test1793() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1793");
        com.reservation_system.model.Researcher researcher5 = new com.reservation_system.model.Researcher((int) 'a', "labmanager", "faculty", "", false);
        boolean boolean6 = researcher5.isApproved();
        java.lang.String str7 = researcher5.getName();
        java.lang.String str8 = researcher5.getName();
        researcher5.setApproved(false);
        int int11 = researcher5.getID();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "labmanager" + "'", str7, "labmanager");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "labmanager" + "'", str8, "labmanager");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 97 + "'", int11 == 97);
    }

    @Test
    public void test1794() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1794");
        com.reservation_system.model.Faculty faculty5 = new com.reservation_system.model.Faculty(98, "Researcher", "Guest", "Alice", false);
    }

    @Test
    public void test1795() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1795");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("data/test-userrepo.csv");
        com.reservation_system.model.Researcher researcher7 = new com.reservation_system.model.Researcher(5, "hi!", "labmanager", "Guest", false);
        userRepository1.addUser((com.reservation_system.model.User) researcher7);
        java.util.List<com.reservation_system.model.User> userList9 = userRepository1.getAllUsers();
        com.reservation_system.model.Guest guest15 = new com.reservation_system.model.Guest(0, "Password1!", "data/test-userrepo.csv", "researcher", false);
        boolean boolean16 = guest15.requiresDepartmentApproval();
        userRepository1.addUser((com.reservation_system.model.User) guest15);
        java.util.Optional<com.reservation_system.model.User> userOptional19 = userRepository1.findByEmail("Student");
        boolean boolean21 = userRepository1.emailExists("Student");
        java.util.Optional<com.reservation_system.model.User> userOptional23 = userRepository1.findByEmail("alice@example.com");
        boolean boolean25 = userRepository1.emailExists("hi!");
        org.junit.Assert.assertNotNull(userList9);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(userOptional19);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertNotNull(userOptional23);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
    }

    @Test
    public void test1796() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1796");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("data/test-userrepo.csv");
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
        com.reservation_system.model.Student student23 = new com.reservation_system.model.Student(1, "data/test-userrepo.csv", "alice@example.com", "guest", false);
        java.lang.String str24 = student23.getUserType();
        java.lang.String str25 = student23.getUserType();
        userRepository1.addUser((com.reservation_system.model.User) student23);
        java.lang.String str27 = student23.getUserType();
        java.lang.String str28 = student23.getUserType();
        org.junit.Assert.assertNotNull(userList2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 101 + "'", int3 == 101);
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
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "Student" + "'", str27, "Student");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "Student" + "'", str28, "Student");
    }

    @Test
    public void test1797() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1797");
        com.reservation_system.model.Guest guest5 = new com.reservation_system.model.Guest((int) (short) 0, "Password1!", "data/test-userrepo.csv", "student", false);
        java.lang.String str6 = guest5.getUserType();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Guest" + "'", str6, "Guest");
    }

    @Test
    public void test1798() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1798");
        com.reservation_system.model.User user6 = com.reservation_system.patterns.factory.UserFactory.createUser("guest", 101, "alice@example.com", "Guest", "Student", false);
        org.junit.Assert.assertNotNull(user6);
    }

    @Test
    public void test1799() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1799");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("data/test-userrepo.csv");
        int int2 = userRepository1.getNextID();
        boolean boolean3 = userRepository1.headLabCoordinatorExists();
        com.reservation_system.model.Guest guest9 = new com.reservation_system.model.Guest((int) (byte) -1, "hi!", "", "Password1!", false);
        userRepository1.addUser((com.reservation_system.model.User) guest9);
        int int11 = userRepository1.getNextID();
        boolean boolean13 = userRepository1.emailExists("headlabcoordinator");
        java.util.List<com.reservation_system.model.User> userList14 = userRepository1.getAllUsers();
        int int15 = userRepository1.getNextID();
        java.util.List<com.reservation_system.model.User> userList16 = userRepository1.getAllUsers();
        boolean boolean18 = userRepository1.emailExists("alice@example.com");
        boolean boolean19 = userRepository1.headLabCoordinatorExists();
        boolean boolean20 = userRepository1.headLabCoordinatorExists();
        com.reservation_system.repository.UserRepository userRepository22 = new com.reservation_system.repository.UserRepository("data/test-userrepo.csv");
        com.reservation_system.model.Researcher researcher28 = new com.reservation_system.model.Researcher(5, "hi!", "labmanager", "Guest", false);
        userRepository22.addUser((com.reservation_system.model.User) researcher28);
        java.util.List<com.reservation_system.model.User> userList30 = userRepository22.getAllUsers();
        com.reservation_system.model.Guest guest36 = new com.reservation_system.model.Guest(0, "Password1!", "data/test-userrepo.csv", "researcher", false);
        boolean boolean37 = guest36.requiresDepartmentApproval();
        userRepository22.addUser((com.reservation_system.model.User) guest36);
        boolean boolean40 = userRepository22.emailExists("Alice");
        int int41 = userRepository22.getNextID();
        com.reservation_system.repository.UserRepository userRepository43 = new com.reservation_system.repository.UserRepository("data/test-userrepo.csv");
        boolean boolean45 = userRepository43.emailExists("Alice");
        com.reservation_system.repository.UserRepository userRepository47 = new com.reservation_system.repository.UserRepository("data/test-userrepo.csv");
        java.util.List<com.reservation_system.model.User> userList48 = userRepository47.getAllUsers();
        int int49 = userRepository47.getNextID();
        java.util.List<com.reservation_system.model.User> userList50 = userRepository47.getAllUsers();
        userRepository43.saveAllUsers(userList50);
        userRepository22.saveAllUsers(userList50);
        java.util.Optional<com.reservation_system.model.User> userOptional54 = userRepository22.findByEmail("alice@example.com");
        com.reservation_system.repository.UserRepository userRepository56 = new com.reservation_system.repository.UserRepository("data/test-userrepo.csv");
        int int57 = userRepository56.getNextID();
        int int58 = userRepository56.getNextID();
        com.reservation_system.model.HeadLabCoordinator headLabCoordinator64 = new com.reservation_system.model.HeadLabCoordinator((int) (byte) 1, "", "", "guest", false);
        userRepository56.addUser((com.reservation_system.model.User) headLabCoordinator64);
        java.util.List<com.reservation_system.model.User> userList66 = userRepository56.getAllUsers();
        com.reservation_system.repository.UserRepository userRepository68 = new com.reservation_system.repository.UserRepository("data/test-userrepo.csv");
        java.util.List<com.reservation_system.model.User> userList69 = userRepository68.getAllUsers();
        int int70 = userRepository68.getNextID();
        com.reservation_system.repository.UserRepository userRepository72 = new com.reservation_system.repository.UserRepository("data/test-userrepo.csv");
        java.util.List<com.reservation_system.model.User> userList73 = userRepository72.getAllUsers();
        int int74 = userRepository72.getNextID();
        boolean boolean76 = userRepository72.emailExists("headlabcoordinator");
        boolean boolean77 = userRepository72.headLabCoordinatorExists();
        java.util.Optional<com.reservation_system.model.User> userOptional79 = userRepository72.findByEmail("Alice");
        boolean boolean81 = userRepository72.emailExists("Alice");
        boolean boolean83 = userRepository72.emailExists("Guest");
        boolean boolean85 = userRepository72.emailExists("headlabcoordinator");
        java.util.List<com.reservation_system.model.User> userList86 = userRepository72.getAllUsers();
        userRepository68.saveAllUsers(userList86);
        userRepository56.saveAllUsers(userList86);
        userRepository22.saveAllUsers(userList86);
        userRepository1.saveAllUsers(userList86);
        int int91 = userRepository1.getNextID();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 101 + "'", int2 == 101);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 101 + "'", int11 == 101);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(userList14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 101 + "'", int15 == 101);
        org.junit.Assert.assertNotNull(userList16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertNotNull(userList30);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 101 + "'", int41 == 101);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertNotNull(userList48);
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + 101 + "'", int49 == 101);
        org.junit.Assert.assertNotNull(userList50);
        org.junit.Assert.assertNotNull(userOptional54);
        org.junit.Assert.assertTrue("'" + int57 + "' != '" + 101 + "'", int57 == 101);
        org.junit.Assert.assertTrue("'" + int58 + "' != '" + 101 + "'", int58 == 101);
        org.junit.Assert.assertNotNull(userList66);
        org.junit.Assert.assertNotNull(userList69);
        org.junit.Assert.assertTrue("'" + int70 + "' != '" + 101 + "'", int70 == 101);
        org.junit.Assert.assertNotNull(userList73);
        org.junit.Assert.assertTrue("'" + int74 + "' != '" + 101 + "'", int74 == 101);
        org.junit.Assert.assertTrue("'" + boolean76 + "' != '" + false + "'", boolean76 == false);
        org.junit.Assert.assertTrue("'" + boolean77 + "' != '" + true + "'", boolean77 == true);
        org.junit.Assert.assertNotNull(userOptional79);
        org.junit.Assert.assertTrue("'" + boolean81 + "' != '" + false + "'", boolean81 == false);
        org.junit.Assert.assertTrue("'" + boolean83 + "' != '" + true + "'", boolean83 == true);
        org.junit.Assert.assertTrue("'" + boolean85 + "' != '" + false + "'", boolean85 == false);
        org.junit.Assert.assertNotNull(userList86);
        org.junit.Assert.assertTrue("'" + int91 + "' != '" + 101 + "'", int91 == 101);
    }

    @Test
    public void test1800() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1800");
        com.reservation_system.model.LabManager labManager5 = new com.reservation_system.model.LabManager((int) (short) -1, "Researcher", "", "guest", false);
        labManager5.setApproved(false);
        boolean boolean8 = labManager5.requiresDepartmentApproval();
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test1801() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1801");
        com.reservation_system.model.Faculty faculty5 = new com.reservation_system.model.Faculty(0, "Student", "hi!", "data/test-userrepo.csv", true);
        java.lang.String str6 = faculty5.getName();
        java.lang.String str7 = faculty5.getEmail();
        java.lang.String str8 = faculty5.getEmail();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Student" + "'", str6, "Student");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
    }

    @Test
    public void test1802() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1802");
        com.reservation_system.model.Guest guest5 = new com.reservation_system.model.Guest((int) (short) -1, "Faculty", "Faculty", "Alice", false);
        java.lang.String str6 = guest5.getPassword();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Alice" + "'", str6, "Alice");
    }

    @Test
    public void test1803() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1803");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("data/test-userrepo.csv");
        com.reservation_system.model.Researcher researcher7 = new com.reservation_system.model.Researcher(5, "hi!", "labmanager", "Guest", false);
        userRepository1.addUser((com.reservation_system.model.User) researcher7);
        java.util.List<com.reservation_system.model.User> userList9 = userRepository1.getAllUsers();
        com.reservation_system.model.Guest guest15 = new com.reservation_system.model.Guest(0, "Password1!", "data/test-userrepo.csv", "researcher", false);
        boolean boolean16 = guest15.requiresDepartmentApproval();
        userRepository1.addUser((com.reservation_system.model.User) guest15);
        boolean boolean19 = userRepository1.emailExists("Alice");
        int int20 = userRepository1.getNextID();
        com.reservation_system.repository.UserRepository userRepository22 = new com.reservation_system.repository.UserRepository("data/test-userrepo.csv");
        java.util.List<com.reservation_system.model.User> userList23 = userRepository22.getAllUsers();
        userRepository1.saveAllUsers(userList23);
        java.util.Optional<com.reservation_system.model.User> userOptional26 = userRepository1.findByEmail("Password1!");
        int int27 = userRepository1.getNextID();
        java.util.Optional<com.reservation_system.model.User> userOptional29 = userRepository1.findByEmail("data/test-userrepo.csv");
        java.util.Optional<com.reservation_system.model.User> userOptional31 = userRepository1.findByEmail("researcher");
        org.junit.Assert.assertNotNull(userList9);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 101 + "'", int20 == 101);
        org.junit.Assert.assertNotNull(userList23);
        org.junit.Assert.assertNotNull(userOptional26);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 101 + "'", int27 == 101);
        org.junit.Assert.assertNotNull(userOptional29);
        org.junit.Assert.assertNotNull(userOptional31);
    }

    @Test
    public void test1804() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1804");
        com.reservation_system.model.Researcher researcher5 = new com.reservation_system.model.Researcher((int) (short) 1, "Guest", "", "Password1!", true);
        java.lang.String str6 = researcher5.getUserType();
        int int7 = researcher5.getID();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Researcher" + "'", str6, "Researcher");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
    }

    @Test
    public void test1805() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1805");
        com.reservation_system.model.LabManager labManager5 = new com.reservation_system.model.LabManager(10, "Password1!", "data/test-userrepo.csv", "Guest", true);
        java.lang.String str6 = labManager5.getEmail();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "data/test-userrepo.csv" + "'", str6, "data/test-userrepo.csv");
    }

    @Test
    public void test1806() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1806");
        com.reservation_system.model.User user6 = com.reservation_system.patterns.factory.UserFactory.createUser("Researcher", (int) (short) -1, "guest", "Password1!", "guest", false);
        java.lang.String str7 = user6.getName();
        org.junit.Assert.assertNotNull(user6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "guest" + "'", str7, "guest");
    }

    @Test
    public void test1807() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1807");
        com.reservation_system.model.LabManager labManager5 = new com.reservation_system.model.LabManager(102, "", "student", "", true);
        java.lang.String str6 = labManager5.getUserType();
        java.lang.String str7 = labManager5.getUserType();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "labmanager" + "'", str6, "labmanager");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "labmanager" + "'", str7, "labmanager");
    }

    @Test
    public void test1808() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1808");
        com.reservation_system.model.LabManager labManager5 = new com.reservation_system.model.LabManager(0, "faculty", "Guest", "researcher", false);
        java.lang.String str6 = labManager5.getUserType();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "labmanager" + "'", str6, "labmanager");
    }

    @Test
    public void test1809() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1809");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("data/test-userrepo.csv");
        boolean boolean3 = userRepository1.emailExists("Alice");
        com.reservation_system.model.Faculty faculty9 = new com.reservation_system.model.Faculty((int) (byte) -1, "Alice", "researcher", "Password1!", false);
        java.lang.String str10 = faculty9.getName();
        java.lang.String str11 = faculty9.getUserType();
        java.lang.String str12 = faculty9.getUserType();
        faculty9.setApproved(false);
        userRepository1.addUser((com.reservation_system.model.User) faculty9);
        java.lang.String str16 = faculty9.getUserType();
        java.lang.String str17 = faculty9.getUserType();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Alice" + "'", str10, "Alice");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Faculty" + "'", str11, "Faculty");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Faculty" + "'", str12, "Faculty");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Faculty" + "'", str16, "Faculty");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "Faculty" + "'", str17, "Faculty");
    }

    @Test
    public void test1810() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1810");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("data/test-userrepo.csv");
        int int2 = userRepository1.getNextID();
        int int3 = userRepository1.getNextID();
        java.util.List<com.reservation_system.model.User> userList4 = userRepository1.getAllUsers();
        com.reservation_system.model.Guest guest10 = new com.reservation_system.model.Guest(0, "student", "", "alice@example.com", false);
        java.lang.String str11 = guest10.getEmail();
        userRepository1.addUser((com.reservation_system.model.User) guest10);
        boolean boolean13 = userRepository1.headLabCoordinatorExists();
        com.reservation_system.repository.UserRepository userRepository15 = new com.reservation_system.repository.UserRepository("data/test-userrepo.csv");
        java.util.List<com.reservation_system.model.User> userList16 = userRepository15.getAllUsers();
        int int17 = userRepository15.getNextID();
        java.util.List<com.reservation_system.model.User> userList18 = userRepository15.getAllUsers();
        userRepository1.saveAllUsers(userList18);
        java.util.List<com.reservation_system.model.User> userList20 = userRepository1.getAllUsers();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 101 + "'", int2 == 101);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 101 + "'", int3 == 101);
        org.junit.Assert.assertNotNull(userList4);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(userList16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 101 + "'", int17 == 101);
        org.junit.Assert.assertNotNull(userList18);
        org.junit.Assert.assertNotNull(userList20);
    }

    @Test
    public void test1811() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1811");
        com.reservation_system.model.Researcher researcher5 = new com.reservation_system.model.Researcher((-1), "student", "Guest", "researcher", false);
        java.lang.String str6 = researcher5.getUserType();
        java.lang.String str7 = researcher5.getPassword();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Researcher" + "'", str6, "Researcher");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "researcher" + "'", str7, "researcher");
    }

    @Test
    public void test1812() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1812");
        com.reservation_system.model.Student student5 = new com.reservation_system.model.Student((int) (short) 10, "Password1!", "Alice", "Student", true);
        java.lang.String str6 = student5.getUserType();
        java.lang.String str7 = student5.getUserType();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Student" + "'", str6, "Student");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Student" + "'", str7, "Student");
    }

    @Test
    public void test1813() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1813");
        com.reservation_system.model.Researcher researcher5 = new com.reservation_system.model.Researcher(33, "researcher", "Guest", "alice@example.com", false);
    }

    @Test
    public void test1814() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1814");
        com.reservation_system.model.Faculty faculty5 = new com.reservation_system.model.Faculty((int) (short) 0, "student", "faculty", "Student", true);
        java.lang.Class<?> wildcardClass6 = faculty5.getClass();
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test1815() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1815");
        com.reservation_system.model.Faculty faculty5 = new com.reservation_system.model.Faculty(0, "faculty", "Researcher", "labmanager", false);
    }

    @Test
    public void test1816() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1816");
        com.reservation_system.model.HeadLabCoordinator headLabCoordinator5 = new com.reservation_system.model.HeadLabCoordinator(10, "faculty", "", "researcher", false);
        java.lang.String str6 = headLabCoordinator5.getUserType();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "headlabcoordinator" + "'", str6, "headlabcoordinator");
    }

    @Test
    public void test1817() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1817");
        com.reservation_system.model.LabManager labManager5 = new com.reservation_system.model.LabManager(101, "guest", "headlabcoordinator", "faculty", true);
        java.lang.String str6 = labManager5.getUserType();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "labmanager" + "'", str6, "labmanager");
    }

    @Test
    public void test1818() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1818");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("data/test-userrepo.csv");
        com.reservation_system.model.Researcher researcher7 = new com.reservation_system.model.Researcher(5, "hi!", "labmanager", "Guest", false);
        userRepository1.addUser((com.reservation_system.model.User) researcher7);
        int int9 = userRepository1.getNextID();
        com.reservation_system.repository.UserRepository userRepository11 = new com.reservation_system.repository.UserRepository("data/test-userrepo.csv");
        com.reservation_system.model.Researcher researcher17 = new com.reservation_system.model.Researcher(5, "hi!", "labmanager", "Guest", false);
        userRepository11.addUser((com.reservation_system.model.User) researcher17);
        java.util.List<com.reservation_system.model.User> userList19 = userRepository11.getAllUsers();
        boolean boolean20 = userRepository11.headLabCoordinatorExists();
        boolean boolean22 = userRepository11.emailExists("guest");
        com.reservation_system.repository.UserRepository userRepository24 = new com.reservation_system.repository.UserRepository("data/test-userrepo.csv");
        boolean boolean26 = userRepository24.emailExists("Alice");
        com.reservation_system.repository.UserRepository userRepository28 = new com.reservation_system.repository.UserRepository("data/test-userrepo.csv");
        java.util.List<com.reservation_system.model.User> userList29 = userRepository28.getAllUsers();
        int int30 = userRepository28.getNextID();
        java.util.List<com.reservation_system.model.User> userList31 = userRepository28.getAllUsers();
        userRepository24.saveAllUsers(userList31);
        userRepository11.saveAllUsers(userList31);
        java.util.List<com.reservation_system.model.User> userList34 = userRepository11.getAllUsers();
        userRepository1.saveAllUsers(userList34);
        java.util.List<com.reservation_system.model.User> userList36 = userRepository1.getAllUsers();
        boolean boolean37 = userRepository1.headLabCoordinatorExists();
        com.reservation_system.model.Researcher researcher43 = new com.reservation_system.model.Researcher((-1), "", "", "Student", true);
        userRepository1.addUser((com.reservation_system.model.User) researcher43);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 101 + "'", int9 == 101);
        org.junit.Assert.assertNotNull(userList19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(userList29);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 101 + "'", int30 == 101);
        org.junit.Assert.assertNotNull(userList31);
        org.junit.Assert.assertNotNull(userList34);
        org.junit.Assert.assertNotNull(userList36);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
    }

    @Test
    public void test1819() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1819");
        com.reservation_system.model.Student student5 = new com.reservation_system.model.Student(101, "Student", "student", "Password1!", false);
        boolean boolean6 = student5.requiresDepartmentApproval();
        java.lang.String str7 = student5.getUserType();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Student" + "'", str7, "Student");
    }

    @Test
    public void test1820() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1820");
        com.reservation_system.model.Guest guest5 = new com.reservation_system.model.Guest(98, "Researcher", "Faculty", "Student", true);
        java.lang.String str6 = guest5.getPassword();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Student" + "'", str6, "Student");
    }

    @Test
    public void test1821() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1821");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("data/test-userrepo.csv");
        com.reservation_system.model.Researcher researcher7 = new com.reservation_system.model.Researcher(5, "hi!", "labmanager", "Guest", false);
        userRepository1.addUser((com.reservation_system.model.User) researcher7);
        com.reservation_system.repository.UserRepository userRepository10 = new com.reservation_system.repository.UserRepository("data/test-userrepo.csv");
        com.reservation_system.model.Researcher researcher16 = new com.reservation_system.model.Researcher(5, "hi!", "labmanager", "Guest", false);
        userRepository10.addUser((com.reservation_system.model.User) researcher16);
        int int18 = userRepository10.getNextID();
        java.util.List<com.reservation_system.model.User> userList19 = userRepository10.getAllUsers();
        userRepository1.saveAllUsers(userList19);
        boolean boolean21 = userRepository1.headLabCoordinatorExists();
        java.util.List<com.reservation_system.model.User> userList22 = userRepository1.getAllUsers();
        com.reservation_system.repository.UserRepository userRepository24 = new com.reservation_system.repository.UserRepository("data/test-userrepo.csv");
        java.util.List<com.reservation_system.model.User> userList25 = userRepository24.getAllUsers();
        int int26 = userRepository24.getNextID();
        java.util.List<com.reservation_system.model.User> userList27 = userRepository24.getAllUsers();
        userRepository1.saveAllUsers(userList27);
        int int29 = userRepository1.getNextID();
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 101 + "'", int18 == 101);
        org.junit.Assert.assertNotNull(userList19);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertNotNull(userList22);
        org.junit.Assert.assertNotNull(userList25);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 101 + "'", int26 == 101);
        org.junit.Assert.assertNotNull(userList27);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 101 + "'", int29 == 101);
    }

    @Test
    public void test1822() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1822");
        com.reservation_system.model.Student student5 = new com.reservation_system.model.Student((int) (short) 0, "researcher", "hi!", "headlabcoordinator", false);
        student5.setApproved(true);
        java.lang.String str8 = student5.getUserType();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Student" + "'", str8, "Student");
    }

    @Test
    public void test1823() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1823");
        com.reservation_system.model.Researcher researcher5 = new com.reservation_system.model.Researcher(5, "", "Alice", "researcher", false);
        boolean boolean6 = researcher5.requiresDepartmentApproval();
        java.lang.String str7 = researcher5.getUserType();
        java.lang.Class<?> wildcardClass8 = researcher5.getClass();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Researcher" + "'", str7, "Researcher");
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test1824() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1824");
        com.reservation_system.model.Faculty faculty5 = new com.reservation_system.model.Faculty(102, "Student", "student", "", false);
    }

    @Test
    public void test1825() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1825");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("data/test-userrepo.csv");
        boolean boolean3 = userRepository1.emailExists("Password1!");
        boolean boolean5 = userRepository1.emailExists("hi!");
        com.reservation_system.model.HeadLabCoordinator headLabCoordinator11 = new com.reservation_system.model.HeadLabCoordinator(1, "Guest", "student", "researcher", true);
        userRepository1.addUser((com.reservation_system.model.User) headLabCoordinator11);
        boolean boolean13 = userRepository1.headLabCoordinatorExists();
        java.util.List<com.reservation_system.model.User> userList14 = userRepository1.getAllUsers();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(userList14);
    }

    @Test
    public void test1826() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1826");
        com.reservation_system.model.HeadLabCoordinator headLabCoordinator5 = new com.reservation_system.model.HeadLabCoordinator(1, "Guest", "student", "researcher", true);
        java.lang.String str6 = headLabCoordinator5.getUserType();
        int int7 = headLabCoordinator5.getID();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "headlabcoordinator" + "'", str6, "headlabcoordinator");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
    }

    @Test
    public void test1827() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1827");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("data/test-userrepo.csv");
        int int2 = userRepository1.getNextID();
        int int3 = userRepository1.getNextID();
        com.reservation_system.model.HeadLabCoordinator headLabCoordinator9 = new com.reservation_system.model.HeadLabCoordinator((int) (byte) 1, "", "", "guest", false);
        userRepository1.addUser((com.reservation_system.model.User) headLabCoordinator9);
        java.util.List<com.reservation_system.model.User> userList11 = userRepository1.getAllUsers();
        com.reservation_system.repository.UserRepository userRepository13 = new com.reservation_system.repository.UserRepository("data/test-userrepo.csv");
        java.util.List<com.reservation_system.model.User> userList14 = userRepository13.getAllUsers();
        int int15 = userRepository13.getNextID();
        com.reservation_system.repository.UserRepository userRepository17 = new com.reservation_system.repository.UserRepository("data/test-userrepo.csv");
        java.util.List<com.reservation_system.model.User> userList18 = userRepository17.getAllUsers();
        int int19 = userRepository17.getNextID();
        boolean boolean21 = userRepository17.emailExists("headlabcoordinator");
        boolean boolean22 = userRepository17.headLabCoordinatorExists();
        java.util.Optional<com.reservation_system.model.User> userOptional24 = userRepository17.findByEmail("Alice");
        boolean boolean26 = userRepository17.emailExists("Alice");
        boolean boolean28 = userRepository17.emailExists("Guest");
        boolean boolean30 = userRepository17.emailExists("headlabcoordinator");
        java.util.List<com.reservation_system.model.User> userList31 = userRepository17.getAllUsers();
        userRepository13.saveAllUsers(userList31);
        userRepository1.saveAllUsers(userList31);
        java.util.List<com.reservation_system.model.User> userList34 = userRepository1.getAllUsers();
        boolean boolean35 = userRepository1.headLabCoordinatorExists();
        boolean boolean36 = userRepository1.headLabCoordinatorExists();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 101 + "'", int2 == 101);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 101 + "'", int3 == 101);
        org.junit.Assert.assertNotNull(userList11);
        org.junit.Assert.assertNotNull(userList14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 101 + "'", int15 == 101);
        org.junit.Assert.assertNotNull(userList18);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 101 + "'", int19 == 101);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertNotNull(userOptional24);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNotNull(userList31);
        org.junit.Assert.assertNotNull(userList34);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
    }

    @Test
    public void test1828() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1828");
        com.reservation_system.model.Faculty faculty5 = new com.reservation_system.model.Faculty((int) (byte) -1, "Alice", "researcher", "Password1!", false);
        int int6 = faculty5.getID();
        boolean boolean7 = faculty5.isApproved();
        java.lang.Class<?> wildcardClass8 = faculty5.getClass();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test1829() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1829");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("data/test-userrepo.csv");
        boolean boolean3 = userRepository1.emailExists("Alice");
        com.reservation_system.model.Researcher researcher9 = new com.reservation_system.model.Researcher((int) 'a', "labmanager", "faculty", "", false);
        boolean boolean10 = researcher9.isApproved();
        java.lang.String str11 = researcher9.getName();
        userRepository1.addUser((com.reservation_system.model.User) researcher9);
        boolean boolean13 = userRepository1.headLabCoordinatorExists();
        java.util.Optional<com.reservation_system.model.User> userOptional15 = userRepository1.findByEmail("");
        com.reservation_system.repository.UserRepository userRepository17 = new com.reservation_system.repository.UserRepository("data/test-userrepo.csv");
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
        boolean boolean34 = userRepository1.emailExists("faculty");
        int int35 = userRepository1.getNextID();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "labmanager" + "'", str11, "labmanager");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(userOptional15);
        org.junit.Assert.assertNotNull(userList18);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 101 + "'", int19 == 101);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertNotNull(userOptional24);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNotNull(userList31);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 101 + "'", int35 == 101);
    }

    @Test
    public void test1830() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1830");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("data/test-userrepo.csv");
        java.util.List<com.reservation_system.model.User> userList2 = userRepository1.getAllUsers();
        int int3 = userRepository1.getNextID();
        boolean boolean5 = userRepository1.emailExists("headlabcoordinator");
        boolean boolean6 = userRepository1.headLabCoordinatorExists();
        java.util.Optional<com.reservation_system.model.User> userOptional8 = userRepository1.findByEmail("Alice");
        java.util.Optional<com.reservation_system.model.User> userOptional10 = userRepository1.findByEmail("Student");
        com.reservation_system.model.Guest guest16 = new com.reservation_system.model.Guest((-1), "Alice", "guest", "hi!", false);
        userRepository1.addUser((com.reservation_system.model.User) guest16);
        java.lang.Class<?> wildcardClass18 = userRepository1.getClass();
        org.junit.Assert.assertNotNull(userList2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 101 + "'", int3 == 101);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(userOptional8);
        org.junit.Assert.assertNotNull(userOptional10);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test1831() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1831");
        com.reservation_system.model.Faculty faculty5 = new com.reservation_system.model.Faculty(33, "alice@example.com", "", "hi!", true);
    }

    @Test
    public void test1832() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1832");
        com.reservation_system.model.LabManager labManager5 = new com.reservation_system.model.LabManager((int) 'a', "", "labmanager", "hi!", true);
        boolean boolean6 = labManager5.isApproved();
        java.lang.String str7 = labManager5.getUserType();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "labmanager" + "'", str7, "labmanager");
    }

    @Test
    public void test1833() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1833");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("data/test-userrepo.csv");
        com.reservation_system.model.Researcher researcher7 = new com.reservation_system.model.Researcher(5, "hi!", "labmanager", "Guest", false);
        userRepository1.addUser((com.reservation_system.model.User) researcher7);
        java.util.List<com.reservation_system.model.User> userList9 = userRepository1.getAllUsers();
        com.reservation_system.model.Guest guest15 = new com.reservation_system.model.Guest(0, "Password1!", "data/test-userrepo.csv", "researcher", false);
        boolean boolean16 = guest15.requiresDepartmentApproval();
        userRepository1.addUser((com.reservation_system.model.User) guest15);
        boolean boolean19 = userRepository1.emailExists("Alice");
        int int20 = userRepository1.getNextID();
        com.reservation_system.repository.UserRepository userRepository22 = new com.reservation_system.repository.UserRepository("data/test-userrepo.csv");
        boolean boolean24 = userRepository22.emailExists("Alice");
        com.reservation_system.repository.UserRepository userRepository26 = new com.reservation_system.repository.UserRepository("data/test-userrepo.csv");
        java.util.List<com.reservation_system.model.User> userList27 = userRepository26.getAllUsers();
        int int28 = userRepository26.getNextID();
        java.util.List<com.reservation_system.model.User> userList29 = userRepository26.getAllUsers();
        userRepository22.saveAllUsers(userList29);
        userRepository1.saveAllUsers(userList29);
        boolean boolean33 = userRepository1.emailExists("Alice");
        org.junit.Assert.assertNotNull(userList9);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 101 + "'", int20 == 101);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(userList27);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 101 + "'", int28 == 101);
        org.junit.Assert.assertNotNull(userList29);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
    }

    @Test
    public void test1834() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1834");
        com.reservation_system.model.LabManager labManager5 = new com.reservation_system.model.LabManager((int) '#', "data/test-userrepo.csv", "headlabcoordinator", "researcher", false);
        java.lang.String str6 = labManager5.getEmail();
        java.lang.String str7 = labManager5.getUserType();
        java.lang.String str8 = labManager5.getEmail();
        java.lang.String str9 = labManager5.getUserType();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "headlabcoordinator" + "'", str6, "headlabcoordinator");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "labmanager" + "'", str7, "labmanager");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "headlabcoordinator" + "'", str8, "headlabcoordinator");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "labmanager" + "'", str9, "labmanager");
    }

    @Test
    public void test1835() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1835");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("data/test-userrepo.csv");
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
        boolean boolean25 = userRepository1.emailExists("Faculty");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "labmanager" + "'", str11, "labmanager");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 101 + "'", int14 == 101);
        org.junit.Assert.assertNotNull(user21);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 101 + "'", int23 == 101);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
    }

    @Test
    public void test1836() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1836");
        com.reservation_system.model.LabManager labManager5 = new com.reservation_system.model.LabManager(101, "Guest", "", "data/test-userrepo.csv", false);
    }

    @Test
    public void test1837() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1837");
        com.reservation_system.model.Faculty faculty5 = new com.reservation_system.model.Faculty(5, "guest", "Faculty", "labmanager", true);
    }

    @Test
    public void test1838() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1838");
        com.reservation_system.model.LabManager labManager5 = new com.reservation_system.model.LabManager(1, "headlabcoordinator", "Alice", "faculty", false);
        labManager5.setApproved(false);
        java.lang.String str8 = labManager5.getEmail();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Alice" + "'", str8, "Alice");
    }

    @Test
    public void test1839() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1839");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("data/test-userrepo.csv");
        com.reservation_system.model.Researcher researcher7 = new com.reservation_system.model.Researcher(5, "hi!", "labmanager", "Guest", false);
        userRepository1.addUser((com.reservation_system.model.User) researcher7);
        int int9 = userRepository1.getNextID();
        java.util.Optional<com.reservation_system.model.User> userOptional11 = userRepository1.findByEmail("headlabcoordinator");
        int int12 = userRepository1.getNextID();
        java.util.Optional<com.reservation_system.model.User> userOptional14 = userRepository1.findByEmail("Faculty");
        com.reservation_system.repository.UserRepository userRepository16 = new com.reservation_system.repository.UserRepository("data/test-userrepo.csv");
        java.util.List<com.reservation_system.model.User> userList17 = userRepository16.getAllUsers();
        userRepository1.saveAllUsers(userList17);
        boolean boolean20 = userRepository1.emailExists("alice@example.com");
        java.util.List<com.reservation_system.model.User> userList21 = userRepository1.getAllUsers();
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 101 + "'", int9 == 101);
        org.junit.Assert.assertNotNull(userOptional11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 101 + "'", int12 == 101);
        org.junit.Assert.assertNotNull(userOptional14);
        org.junit.Assert.assertNotNull(userList17);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertNotNull(userList21);
    }

    @Test
    public void test1840() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1840");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("data/test-userrepo.csv");
        com.reservation_system.model.Researcher researcher7 = new com.reservation_system.model.Researcher(5, "hi!", "labmanager", "Guest", false);
        userRepository1.addUser((com.reservation_system.model.User) researcher7);
        java.util.Optional<com.reservation_system.model.User> userOptional10 = userRepository1.findByEmail("alice@example.com");
        com.reservation_system.model.Researcher researcher16 = new com.reservation_system.model.Researcher((int) 'a', "Password1!", "hi!", "Alice", false);
        java.lang.String str17 = researcher16.getUserType();
        boolean boolean18 = researcher16.isApproved();
        java.lang.String str19 = researcher16.getUserType();
        userRepository1.addUser((com.reservation_system.model.User) researcher16);
        org.junit.Assert.assertNotNull(userOptional10);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "Researcher" + "'", str17, "Researcher");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "Researcher" + "'", str19, "Researcher");
    }

    @Test
    public void test1841() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1841");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("data/test-userrepo.csv");
        com.reservation_system.model.Researcher researcher7 = new com.reservation_system.model.Researcher(5, "hi!", "labmanager", "Guest", false);
        userRepository1.addUser((com.reservation_system.model.User) researcher7);
        java.util.List<com.reservation_system.model.User> userList9 = userRepository1.getAllUsers();
        com.reservation_system.model.Guest guest15 = new com.reservation_system.model.Guest(0, "Password1!", "data/test-userrepo.csv", "researcher", false);
        boolean boolean16 = guest15.requiresDepartmentApproval();
        userRepository1.addUser((com.reservation_system.model.User) guest15);
        boolean boolean19 = userRepository1.emailExists("Alice");
        java.util.Optional<com.reservation_system.model.User> userOptional21 = userRepository1.findByEmail("hi!");
        java.util.List<com.reservation_system.model.User> userList22 = userRepository1.getAllUsers();
        int int23 = userRepository1.getNextID();
        java.util.Optional<com.reservation_system.model.User> userOptional25 = userRepository1.findByEmail("Faculty");
        boolean boolean27 = userRepository1.emailExists("headlabcoordinator");
        org.junit.Assert.assertNotNull(userList9);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(userOptional21);
        org.junit.Assert.assertNotNull(userList22);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 101 + "'", int23 == 101);
        org.junit.Assert.assertNotNull(userOptional25);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
    }

    @Test
    public void test1842() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1842");
        com.reservation_system.model.HeadLabCoordinator headLabCoordinator5 = new com.reservation_system.model.HeadLabCoordinator((int) (byte) -1, "Password1!", "Password1!", "Password1!", false);
    }

    @Test
    public void test1843() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1843");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("data/test-userrepo.csv");
        com.reservation_system.model.Researcher researcher7 = new com.reservation_system.model.Researcher(5, "hi!", "labmanager", "Guest", false);
        userRepository1.addUser((com.reservation_system.model.User) researcher7);
        java.util.List<com.reservation_system.model.User> userList9 = userRepository1.getAllUsers();
        com.reservation_system.repository.UserRepository userRepository11 = new com.reservation_system.repository.UserRepository("data/test-userrepo.csv");
        com.reservation_system.model.Researcher researcher17 = new com.reservation_system.model.Researcher(5, "hi!", "labmanager", "Guest", false);
        userRepository11.addUser((com.reservation_system.model.User) researcher17);
        java.util.List<com.reservation_system.model.User> userList19 = userRepository11.getAllUsers();
        userRepository1.saveAllUsers(userList19);
        boolean boolean21 = userRepository1.headLabCoordinatorExists();
        boolean boolean23 = userRepository1.emailExists("guest");
        org.junit.Assert.assertNotNull(userList9);
        org.junit.Assert.assertNotNull(userList19);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
    }

    @Test
    public void test1844() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1844");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("data/test-userrepo.csv");
        java.util.List<com.reservation_system.model.User> userList2 = userRepository1.getAllUsers();
        com.reservation_system.model.Guest guest8 = new com.reservation_system.model.Guest(0, "Password1!", "data/test-userrepo.csv", "researcher", false);
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
        boolean boolean28 = userRepository1.headLabCoordinatorExists();
        boolean boolean29 = userRepository1.headLabCoordinatorExists();
        org.junit.Assert.assertNotNull(userList2);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Guest" + "'", str10, "Guest");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Guest" + "'", str11, "Guest");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Guest" + "'", str14, "Guest");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "Faculty" + "'", str22, "Faculty");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "Faculty" + "'", str23, "Faculty");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "Faculty" + "'", str24, "Faculty");
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
    }

    @Test
    public void test1845() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1845");
        com.reservation_system.model.Student student5 = new com.reservation_system.model.Student(101, "alice@example.com", "Guest", "researcher", false);
    }

    @Test
    public void test1846() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1846");
        com.reservation_system.model.Faculty faculty5 = new com.reservation_system.model.Faculty((-1), "Faculty", "Password1!", "Guest", true);
    }

    @Test
    public void test1847() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1847");
        com.reservation_system.model.HeadLabCoordinator headLabCoordinator5 = new com.reservation_system.model.HeadLabCoordinator(100, "hi!", "alice@example.com", "hi!", false);
    }

    @Test
    public void test1848() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1848");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("data/test-userrepo.csv");
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
        java.util.Optional<com.reservation_system.model.User> userOptional26 = userRepository1.findByEmail("Guest");
        com.reservation_system.repository.UserRepository userRepository28 = new com.reservation_system.repository.UserRepository("data/test-userrepo.csv");
        com.reservation_system.model.Researcher researcher34 = new com.reservation_system.model.Researcher(5, "hi!", "labmanager", "Guest", false);
        userRepository28.addUser((com.reservation_system.model.User) researcher34);
        java.util.Optional<com.reservation_system.model.User> userOptional37 = userRepository28.findByEmail("alice@example.com");
        java.util.List<com.reservation_system.model.User> userList38 = userRepository28.getAllUsers();
        java.util.Optional<com.reservation_system.model.User> userOptional40 = userRepository28.findByEmail("Password1!");
        int int41 = userRepository28.getNextID();
        boolean boolean43 = userRepository28.emailExists("Guest");
        java.util.Optional<com.reservation_system.model.User> userOptional45 = userRepository28.findByEmail("faculty");
        java.util.List<com.reservation_system.model.User> userList46 = userRepository28.getAllUsers();
        userRepository1.saveAllUsers(userList46);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 101 + "'", int2 == 101);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 101 + "'", int11 == 101);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 101 + "'", int24 == 101);
        org.junit.Assert.assertNotNull(userOptional26);
        org.junit.Assert.assertNotNull(userOptional37);
        org.junit.Assert.assertNotNull(userList38);
        org.junit.Assert.assertNotNull(userOptional40);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 101 + "'", int41 == 101);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + true + "'", boolean43 == true);
        org.junit.Assert.assertNotNull(userOptional45);
        org.junit.Assert.assertNotNull(userList46);
    }

    @Test
    public void test1849() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1849");
        com.reservation_system.model.Faculty faculty5 = new com.reservation_system.model.Faculty((int) (byte) 1, "faculty", "student", "labmanager", true);
        boolean boolean6 = faculty5.requiresDepartmentApproval();
        boolean boolean7 = faculty5.requiresDepartmentApproval();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test1850() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1850");
        com.reservation_system.model.Student student5 = new com.reservation_system.model.Student(6, "Researcher", "labmanager", "headlabcoordinator", false);
    }

    @Test
    public void test1851() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1851");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("data/test-userrepo.csv");
        com.reservation_system.model.Faculty faculty7 = new com.reservation_system.model.Faculty(5, "researcher", "guest", "faculty", true);
        java.lang.String str8 = faculty7.getUserType();
        java.lang.String str9 = faculty7.getUserType();
        userRepository1.addUser((com.reservation_system.model.User) faculty7);
        com.reservation_system.repository.UserRepository userRepository12 = new com.reservation_system.repository.UserRepository("data/test-userrepo.csv");
        boolean boolean14 = userRepository12.emailExists("Alice");
        com.reservation_system.repository.UserRepository userRepository16 = new com.reservation_system.repository.UserRepository("data/test-userrepo.csv");
        java.util.List<com.reservation_system.model.User> userList17 = userRepository16.getAllUsers();
        int int18 = userRepository16.getNextID();
        java.util.List<com.reservation_system.model.User> userList19 = userRepository16.getAllUsers();
        userRepository12.saveAllUsers(userList19);
        userRepository1.saveAllUsers(userList19);
        boolean boolean22 = userRepository1.headLabCoordinatorExists();
        int int23 = userRepository1.getNextID();
        java.util.List<com.reservation_system.model.User> userList24 = userRepository1.getAllUsers();
        java.lang.Class<?> wildcardClass25 = userRepository1.getClass();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Faculty" + "'", str8, "Faculty");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Faculty" + "'", str9, "Faculty");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(userList17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 101 + "'", int18 == 101);
        org.junit.Assert.assertNotNull(userList19);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 101 + "'", int23 == 101);
        org.junit.Assert.assertNotNull(userList24);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test1852() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1852");
        com.reservation_system.model.Guest guest5 = new com.reservation_system.model.Guest((int) (short) 10, "Student", "", "", true);
    }

    @Test
    public void test1853() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1853");
        com.reservation_system.model.LabManager labManager5 = new com.reservation_system.model.LabManager(10, "labmanager", "Researcher", "guest", true);
    }

    @Test
    public void test1854() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1854");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("data/test-userrepo.csv");
        int int2 = userRepository1.getNextID();
        boolean boolean3 = userRepository1.headLabCoordinatorExists();
        com.reservation_system.model.Guest guest9 = new com.reservation_system.model.Guest((int) (byte) -1, "hi!", "", "Password1!", false);
        userRepository1.addUser((com.reservation_system.model.User) guest9);
        java.util.Optional<com.reservation_system.model.User> userOptional12 = userRepository1.findByEmail("Faculty");
        boolean boolean14 = userRepository1.emailExists("hi!");
        int int15 = userRepository1.getNextID();
        java.util.Optional<com.reservation_system.model.User> userOptional17 = userRepository1.findByEmail("alice@example.com");
        java.util.List<com.reservation_system.model.User> userList18 = userRepository1.getAllUsers();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 101 + "'", int2 == 101);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(userOptional12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 101 + "'", int15 == 101);
        org.junit.Assert.assertNotNull(userOptional17);
        org.junit.Assert.assertNotNull(userList18);
    }

    @Test
    public void test1855() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1855");
        com.reservation_system.model.HeadLabCoordinator headLabCoordinator5 = new com.reservation_system.model.HeadLabCoordinator(52, "researcher", "Faculty", "data/test-userrepo.csv", true);
    }

    @Test
    public void test1856() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1856");
        com.reservation_system.model.LabManager labManager5 = new com.reservation_system.model.LabManager(11, "Guest", "Researcher", "faculty", true);
        java.lang.String str6 = labManager5.getPassword();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "faculty" + "'", str6, "faculty");
    }

    @Test
    public void test1857() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1857");
        // The following exception was thrown during execution in test generation
        try {
            com.reservation_system.model.User user6 = com.reservation_system.patterns.factory.UserFactory.createUser("hi!", (int) (byte) 10, "guest", "", "faculty", true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid user type: hi!");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1858() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1858");
        com.reservation_system.model.Researcher researcher5 = new com.reservation_system.model.Researcher(100, "student", "guest", "headlabcoordinator", false);
        java.lang.String str6 = researcher5.getUserType();
        java.lang.String str7 = researcher5.getEmail();
        java.lang.String str8 = researcher5.getName();
        boolean boolean9 = researcher5.isApproved();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Researcher" + "'", str6, "Researcher");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "guest" + "'", str7, "guest");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "student" + "'", str8, "student");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test1859() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1859");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("data/test-userrepo.csv");
        java.util.List<com.reservation_system.model.User> userList2 = userRepository1.getAllUsers();
        int int3 = userRepository1.getNextID();
        java.util.List<com.reservation_system.model.User> userList4 = userRepository1.getAllUsers();
        boolean boolean5 = userRepository1.headLabCoordinatorExists();
        boolean boolean7 = userRepository1.emailExists("researcher");
        org.junit.Assert.assertNotNull(userList2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 101 + "'", int3 == 101);
        org.junit.Assert.assertNotNull(userList4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test1860() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1860");
        com.reservation_system.model.Student student5 = new com.reservation_system.model.Student(102, "guest", "", "", true);
        java.lang.String str6 = student5.getUserType();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Student" + "'", str6, "Student");
    }

    @Test
    public void test1861() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1861");
        com.reservation_system.model.Student student5 = new com.reservation_system.model.Student((int) (short) 10, "Password1!", "Alice", "Student", true);
        java.lang.String str6 = student5.getPassword();
        int int7 = student5.getID();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Student" + "'", str6, "Student");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 10 + "'", int7 == 10);
    }

    @Test
    public void test1862() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1862");
        com.reservation_system.model.HeadLabCoordinator headLabCoordinator5 = new com.reservation_system.model.HeadLabCoordinator(0, "hi!", "Password1!", "guest", true);
    }

    @Test
    public void test1863() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1863");
        com.reservation_system.model.Guest guest5 = new com.reservation_system.model.Guest(0, "Password1!", "data/test-userrepo.csv", "researcher", false);
        java.lang.String str6 = guest5.getUserType();
        java.lang.String str7 = guest5.getPassword();
        guest5.setApproved(true);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Guest" + "'", str6, "Guest");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "researcher" + "'", str7, "researcher");
    }

    @Test
    public void test1864() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1864");
        com.reservation_system.model.Faculty faculty5 = new com.reservation_system.model.Faculty((int) (short) 1, "researcher", "alice@example.com", "Student", false);
        java.lang.String str6 = faculty5.getUserType();
        java.lang.String str7 = faculty5.getEmail();
        int int8 = faculty5.getID();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Faculty" + "'", str6, "Faculty");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
    }

    @Test
    public void test1865() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1865");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("data/test-userrepo.csv");
        boolean boolean3 = userRepository1.emailExists("Alice");
        com.reservation_system.model.Researcher researcher9 = new com.reservation_system.model.Researcher((int) 'a', "labmanager", "faculty", "", false);
        boolean boolean10 = researcher9.isApproved();
        java.lang.String str11 = researcher9.getName();
        userRepository1.addUser((com.reservation_system.model.User) researcher9);
        java.util.List<com.reservation_system.model.User> userList13 = userRepository1.getAllUsers();
        boolean boolean14 = userRepository1.headLabCoordinatorExists();
        java.util.Optional<com.reservation_system.model.User> userOptional16 = userRepository1.findByEmail("Alice");
        com.reservation_system.model.Student student22 = new com.reservation_system.model.Student((int) (byte) 0, "Researcher", "Student", "Guest", true);
        java.lang.String str23 = student22.getPassword();
        userRepository1.addUser((com.reservation_system.model.User) student22);
        java.util.Optional<com.reservation_system.model.User> userOptional26 = userRepository1.findByEmail("");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "labmanager" + "'", str11, "labmanager");
        org.junit.Assert.assertNotNull(userList13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(userOptional16);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "Guest" + "'", str23, "Guest");
        org.junit.Assert.assertNotNull(userOptional26);
    }

    @Test
    public void test1866() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1866");
        com.reservation_system.model.Guest guest5 = new com.reservation_system.model.Guest(10, "", "guest", "headlabcoordinator", false);
        guest5.setApproved(true);
        java.lang.String str8 = guest5.getEmail();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "guest" + "'", str8, "guest");
    }

    @Test
    public void test1867() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1867");
        com.reservation_system.model.Researcher researcher5 = new com.reservation_system.model.Researcher((int) (short) 100, "Guest", "Student", "labmanager", false);
        java.lang.String str6 = researcher5.getUserType();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Researcher" + "'", str6, "Researcher");
    }

    @Test
    public void test1868() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1868");
        com.reservation_system.model.Guest guest5 = new com.reservation_system.model.Guest((int) '#', "guest", "Student", "", true);
        java.lang.String str6 = guest5.getUserType();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Guest" + "'", str6, "Guest");
    }

    @Test
    public void test1869() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1869");
        com.reservation_system.model.User user6 = com.reservation_system.patterns.factory.UserFactory.createUser("guest", 11, "data/test-userrepo.csv", "student", "alice@example.com", false);
        org.junit.Assert.assertNotNull(user6);
    }

    @Test
    public void test1870() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1870");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("data/test-userrepo.csv");
        int int2 = userRepository1.getNextID();
        int int3 = userRepository1.getNextID();
        java.util.List<com.reservation_system.model.User> userList4 = userRepository1.getAllUsers();
        com.reservation_system.repository.UserRepository userRepository6 = new com.reservation_system.repository.UserRepository("data/test-userrepo.csv");
        int int7 = userRepository6.getNextID();
        int int8 = userRepository6.getNextID();
        java.util.List<com.reservation_system.model.User> userList9 = userRepository6.getAllUsers();
        com.reservation_system.model.Guest guest15 = new com.reservation_system.model.Guest(0, "student", "", "alice@example.com", false);
        java.lang.String str16 = guest15.getEmail();
        userRepository6.addUser((com.reservation_system.model.User) guest15);
        boolean boolean18 = userRepository6.headLabCoordinatorExists();
        com.reservation_system.repository.UserRepository userRepository20 = new com.reservation_system.repository.UserRepository("data/test-userrepo.csv");
        java.util.List<com.reservation_system.model.User> userList21 = userRepository20.getAllUsers();
        int int22 = userRepository20.getNextID();
        java.util.List<com.reservation_system.model.User> userList23 = userRepository20.getAllUsers();
        userRepository6.saveAllUsers(userList23);
        userRepository1.saveAllUsers(userList23);
        boolean boolean27 = userRepository1.emailExists("Researcher");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 101 + "'", int2 == 101);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 101 + "'", int3 == 101);
        org.junit.Assert.assertNotNull(userList4);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 101 + "'", int7 == 101);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 101 + "'", int8 == 101);
        org.junit.Assert.assertNotNull(userList9);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(userList21);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 101 + "'", int22 == 101);
        org.junit.Assert.assertNotNull(userList23);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
    }

    @Test
    public void test1871() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1871");
        com.reservation_system.model.LabManager labManager5 = new com.reservation_system.model.LabManager((int) (short) -1, "faculty", "Guest", "Guest", true);
        int int6 = labManager5.getID();
        java.lang.String str7 = labManager5.getUserType();
        java.lang.String str8 = labManager5.getUserType();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "labmanager" + "'", str7, "labmanager");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "labmanager" + "'", str8, "labmanager");
    }

    @Test
    public void test1872() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1872");
        com.reservation_system.model.Faculty faculty5 = new com.reservation_system.model.Faculty((int) (byte) 100, "Alice", "Alice", "faculty", true);
        java.lang.String str6 = faculty5.getUserType();
        boolean boolean7 = faculty5.isApproved();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Faculty" + "'", str6, "Faculty");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test1873() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1873");
        com.reservation_system.model.Guest guest5 = new com.reservation_system.model.Guest(52, "data/test-userrepo.csv", "data/test-userrepo.csv", "faculty", true);
    }

    @Test
    public void test1874() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1874");
        com.reservation_system.model.HeadLabCoordinator headLabCoordinator5 = new com.reservation_system.model.HeadLabCoordinator(5, "headlabcoordinator", "faculty", "guest", true);
    }

    @Test
    public void test1875() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1875");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("data/test-userrepo.csv");
        com.reservation_system.model.Faculty faculty7 = new com.reservation_system.model.Faculty(5, "researcher", "guest", "faculty", true);
        java.lang.String str8 = faculty7.getUserType();
        java.lang.String str9 = faculty7.getUserType();
        userRepository1.addUser((com.reservation_system.model.User) faculty7);
        com.reservation_system.repository.UserRepository userRepository12 = new com.reservation_system.repository.UserRepository("data/test-userrepo.csv");
        boolean boolean14 = userRepository12.emailExists("Alice");
        com.reservation_system.repository.UserRepository userRepository16 = new com.reservation_system.repository.UserRepository("data/test-userrepo.csv");
        java.util.List<com.reservation_system.model.User> userList17 = userRepository16.getAllUsers();
        int int18 = userRepository16.getNextID();
        java.util.List<com.reservation_system.model.User> userList19 = userRepository16.getAllUsers();
        userRepository12.saveAllUsers(userList19);
        userRepository1.saveAllUsers(userList19);
        boolean boolean22 = userRepository1.headLabCoordinatorExists();
        boolean boolean24 = userRepository1.emailExists("data/test-userrepo.csv");
        java.util.Optional<com.reservation_system.model.User> userOptional26 = userRepository1.findByEmail("alice@example.com");
        com.reservation_system.model.Guest guest32 = new com.reservation_system.model.Guest(5, "guest", "data/test-userrepo.csv", "Faculty", false);
        userRepository1.addUser((com.reservation_system.model.User) guest32);
        com.reservation_system.repository.UserRepository userRepository35 = new com.reservation_system.repository.UserRepository("data/test-userrepo.csv");
        boolean boolean37 = userRepository35.emailExists("Alice");
        com.reservation_system.repository.UserRepository userRepository39 = new com.reservation_system.repository.UserRepository("data/test-userrepo.csv");
        java.util.List<com.reservation_system.model.User> userList40 = userRepository39.getAllUsers();
        int int41 = userRepository39.getNextID();
        java.util.List<com.reservation_system.model.User> userList42 = userRepository39.getAllUsers();
        userRepository35.saveAllUsers(userList42);
        userRepository1.saveAllUsers(userList42);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Faculty" + "'", str8, "Faculty");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Faculty" + "'", str9, "Faculty");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(userList17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 101 + "'", int18 == 101);
        org.junit.Assert.assertNotNull(userList19);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertNotNull(userOptional26);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertNotNull(userList40);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 101 + "'", int41 == 101);
        org.junit.Assert.assertNotNull(userList42);
    }

    @Test
    public void test1876() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1876");
        com.reservation_system.model.Student student5 = new com.reservation_system.model.Student((int) '#', "headlabcoordinator", "headlabcoordinator", "", true);
    }

    @Test
    public void test1877() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1877");
        com.reservation_system.model.User user6 = com.reservation_system.patterns.factory.UserFactory.createUser("guest", 100, "headlabcoordinator", "labmanager", "", true);
        int int7 = user6.getID();
        int int8 = user6.getID();
        boolean boolean9 = user6.requiresDepartmentApproval();
        org.junit.Assert.assertNotNull(user6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 100 + "'", int7 == 100);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8 == 100);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test1878() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1878");
        com.reservation_system.model.Researcher researcher5 = new com.reservation_system.model.Researcher((int) (short) -1, "Student", "Alice", "labmanager", false);
        int int6 = researcher5.getID();
        java.lang.String str7 = researcher5.getUserType();
        java.lang.String str8 = researcher5.getUserType();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Researcher" + "'", str7, "Researcher");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Researcher" + "'", str8, "Researcher");
    }

    @Test
    public void test1879() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1879");
        com.reservation_system.model.Faculty faculty5 = new com.reservation_system.model.Faculty(99, "Password1!", "", "guest", false);
    }

    @Test
    public void test1880() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1880");
        com.reservation_system.model.Guest guest5 = new com.reservation_system.model.Guest(0, "Password1!", "data/test-userrepo.csv", "researcher", false);
        boolean boolean6 = guest5.requiresDepartmentApproval();
        java.lang.String str7 = guest5.getUserType();
        java.lang.String str8 = guest5.getUserType();
        java.lang.String str9 = guest5.getUserType();
        guest5.setApproved(false);
        java.lang.String str12 = guest5.getUserType();
        java.lang.String str13 = guest5.getUserType();
        java.lang.String str14 = guest5.getUserType();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Guest" + "'", str7, "Guest");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Guest" + "'", str8, "Guest");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Guest" + "'", str9, "Guest");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Guest" + "'", str12, "Guest");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Guest" + "'", str13, "Guest");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Guest" + "'", str14, "Guest");
    }

    @Test
    public void test1881() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1881");
        com.reservation_system.model.Student student5 = new com.reservation_system.model.Student((int) '4', "", "Researcher", "hi!", false);
        int int6 = student5.getID();
        student5.setApproved(true);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 52 + "'", int6 == 52);
    }

    @Test
    public void test1882() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1882");
        com.reservation_system.model.Student student5 = new com.reservation_system.model.Student((int) (short) 100, "faculty", "researcher", "alice@example.com", true);
        boolean boolean6 = student5.requiresDepartmentApproval();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test1883() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1883");
        com.reservation_system.model.Researcher researcher5 = new com.reservation_system.model.Researcher((int) (byte) 0, "", "Researcher", "student", true);
    }

    @Test
    public void test1884() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1884");
        com.reservation_system.model.Student student5 = new com.reservation_system.model.Student(0, "Guest", "Password1!", "data/test-userrepo.csv", true);
        java.lang.String str6 = student5.getEmail();
        java.lang.String str7 = student5.getUserType();
        java.lang.String str8 = student5.getUserType();
        java.lang.String str9 = student5.getUserType();
        java.lang.String str10 = student5.getPassword();
        boolean boolean11 = student5.isApproved();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Password1!" + "'", str6, "Password1!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Student" + "'", str7, "Student");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Student" + "'", str8, "Student");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Student" + "'", str9, "Student");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "data/test-userrepo.csv" + "'", str10, "data/test-userrepo.csv");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test1885() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1885");
        com.reservation_system.model.LabManager labManager5 = new com.reservation_system.model.LabManager((int) (short) -1, "labmanager", "hi!", "", false);
        java.lang.String str6 = labManager5.getEmail();
        java.lang.String str7 = labManager5.getPassword();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
    }

    @Test
    public void test1886() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1886");
        com.reservation_system.model.Guest guest5 = new com.reservation_system.model.Guest(100, "Researcher", "data/test-userrepo.csv", "data/test-userrepo.csv", true);
        java.lang.String str6 = guest5.getUserType();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Guest" + "'", str6, "Guest");
    }

    @Test
    public void test1887() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1887");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("data/test-userrepo.csv");
        java.util.List<com.reservation_system.model.User> userList2 = userRepository1.getAllUsers();
        int int3 = userRepository1.getNextID();
        boolean boolean5 = userRepository1.emailExists("headlabcoordinator");
        boolean boolean6 = userRepository1.headLabCoordinatorExists();
        java.util.Optional<com.reservation_system.model.User> userOptional8 = userRepository1.findByEmail("Alice");
        boolean boolean10 = userRepository1.emailExists("Alice");
        com.reservation_system.repository.UserRepository userRepository12 = new com.reservation_system.repository.UserRepository("data/test-userrepo.csv");
        java.util.List<com.reservation_system.model.User> userList13 = userRepository12.getAllUsers();
        int int14 = userRepository12.getNextID();
        boolean boolean16 = userRepository12.emailExists("headlabcoordinator");
        boolean boolean17 = userRepository12.headLabCoordinatorExists();
        java.util.Optional<com.reservation_system.model.User> userOptional19 = userRepository12.findByEmail("Alice");
        boolean boolean21 = userRepository12.emailExists("Alice");
        int int22 = userRepository12.getNextID();
        java.util.List<com.reservation_system.model.User> userList23 = userRepository12.getAllUsers();
        userRepository1.saveAllUsers(userList23);
        java.util.Optional<com.reservation_system.model.User> userOptional26 = userRepository1.findByEmail("guest");
        int int27 = userRepository1.getNextID();
        org.junit.Assert.assertNotNull(userList2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 101 + "'", int3 == 101);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(userOptional8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(userList13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 101 + "'", int14 == 101);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNotNull(userOptional19);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 101 + "'", int22 == 101);
        org.junit.Assert.assertNotNull(userList23);
        org.junit.Assert.assertNotNull(userOptional26);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 101 + "'", int27 == 101);
    }

    @Test
    public void test1888() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1888");
        com.reservation_system.model.HeadLabCoordinator headLabCoordinator5 = new com.reservation_system.model.HeadLabCoordinator((int) (byte) 100, "Password1!", "guest", "Faculty", true);
        boolean boolean6 = headLabCoordinator5.isApproved();
        java.lang.String str7 = headLabCoordinator5.getPassword();
        java.lang.String str8 = headLabCoordinator5.getUserType();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Faculty" + "'", str7, "Faculty");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "headlabcoordinator" + "'", str8, "headlabcoordinator");
    }

    @Test
    public void test1889() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1889");
        com.reservation_system.model.Researcher researcher5 = new com.reservation_system.model.Researcher(99, "student", "Student", "alice@example.com", false);
        java.lang.String str6 = researcher5.getUserType();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Researcher" + "'", str6, "Researcher");
    }

    @Test
    public void test1890() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1890");
        com.reservation_system.model.LabManager labManager5 = new com.reservation_system.model.LabManager(1, "Researcher", "labmanager", "data/test-userrepo.csv", false);
        int int6 = labManager5.getID();
        labManager5.setApproved(false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
    }

    @Test
    public void test1891() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1891");
        com.reservation_system.model.Student student5 = new com.reservation_system.model.Student(52, "Student", "Password1!", "", true);
        java.lang.String str6 = student5.getPassword();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
    }

    @Test
    public void test1892() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1892");
        com.reservation_system.model.Researcher researcher5 = new com.reservation_system.model.Researcher((int) '4', "student", "Guest", "Password1!", true);
    }

    @Test
    public void test1893() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1893");
        com.reservation_system.model.Student student5 = new com.reservation_system.model.Student((int) (short) 10, "Student", "", "guest", true);
        java.lang.String str6 = student5.getUserType();
        java.lang.String str7 = student5.getUserType();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Student" + "'", str6, "Student");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Student" + "'", str7, "Student");
    }

    @Test
    public void test1894() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1894");
        com.reservation_system.model.HeadLabCoordinator headLabCoordinator5 = new com.reservation_system.model.HeadLabCoordinator((int) '#', "researcher", "", "Student", true);
        java.lang.String str6 = headLabCoordinator5.getUserType();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "headlabcoordinator" + "'", str6, "headlabcoordinator");
    }

    @Test
    public void test1895() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1895");
        com.reservation_system.model.Faculty faculty5 = new com.reservation_system.model.Faculty(5, "Faculty", "faculty", "labmanager", false);
        boolean boolean6 = faculty5.requiresDepartmentApproval();
        boolean boolean7 = faculty5.requiresDepartmentApproval();
        int int8 = faculty5.getID();
        java.lang.String str9 = faculty5.getName();
        int int10 = faculty5.getID();
        java.lang.String str11 = faculty5.getEmail();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 5 + "'", int8 == 5);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Faculty" + "'", str9, "Faculty");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 5 + "'", int10 == 5);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "faculty" + "'", str11, "faculty");
    }

    @Test
    public void test1896() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1896");
        com.reservation_system.model.Researcher researcher5 = new com.reservation_system.model.Researcher((int) (byte) 1, "researcher", "", "Student", false);
        java.lang.Class<?> wildcardClass6 = researcher5.getClass();
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test1897() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1897");
        com.reservation_system.model.LabManager labManager5 = new com.reservation_system.model.LabManager((int) (short) -1, "faculty", "Guest", "Guest", true);
        int int6 = labManager5.getID();
        java.lang.String str7 = labManager5.getEmail();
        java.lang.String str8 = labManager5.getUserType();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Guest" + "'", str7, "Guest");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "labmanager" + "'", str8, "labmanager");
    }

    @Test
    public void test1898() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1898");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("data/test-userrepo.csv");
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
        com.reservation_system.repository.UserRepository userRepository25 = new com.reservation_system.repository.UserRepository("data/test-userrepo.csv");
        java.util.List<com.reservation_system.model.User> userList26 = userRepository25.getAllUsers();
        int int27 = userRepository25.getNextID();
        boolean boolean29 = userRepository25.emailExists("headlabcoordinator");
        java.util.Optional<com.reservation_system.model.User> userOptional31 = userRepository25.findByEmail("student");
        com.reservation_system.repository.UserRepository userRepository33 = new com.reservation_system.repository.UserRepository("data/test-userrepo.csv");
        java.util.List<com.reservation_system.model.User> userList34 = userRepository33.getAllUsers();
        int int35 = userRepository33.getNextID();
        boolean boolean37 = userRepository33.emailExists("headlabcoordinator");
        boolean boolean38 = userRepository33.headLabCoordinatorExists();
        java.util.Optional<com.reservation_system.model.User> userOptional40 = userRepository33.findByEmail("Alice");
        boolean boolean42 = userRepository33.emailExists("guest");
        java.util.List<com.reservation_system.model.User> userList43 = userRepository33.getAllUsers();
        userRepository25.saveAllUsers(userList43);
        java.util.List<com.reservation_system.model.User> userList45 = userRepository25.getAllUsers();
        userRepository1.saveAllUsers(userList45);
        com.reservation_system.repository.UserRepository userRepository48 = new com.reservation_system.repository.UserRepository("data/test-userrepo.csv");
        int int49 = userRepository48.getNextID();
        int int50 = userRepository48.getNextID();
        java.util.List<com.reservation_system.model.User> userList51 = userRepository48.getAllUsers();
        com.reservation_system.repository.UserRepository userRepository53 = new com.reservation_system.repository.UserRepository("data/test-userrepo.csv");
        int int54 = userRepository53.getNextID();
        int int55 = userRepository53.getNextID();
        java.util.List<com.reservation_system.model.User> userList56 = userRepository53.getAllUsers();
        com.reservation_system.model.Guest guest62 = new com.reservation_system.model.Guest(0, "student", "", "alice@example.com", false);
        java.lang.String str63 = guest62.getEmail();
        userRepository53.addUser((com.reservation_system.model.User) guest62);
        boolean boolean65 = userRepository53.headLabCoordinatorExists();
        com.reservation_system.repository.UserRepository userRepository67 = new com.reservation_system.repository.UserRepository("data/test-userrepo.csv");
        java.util.List<com.reservation_system.model.User> userList68 = userRepository67.getAllUsers();
        int int69 = userRepository67.getNextID();
        java.util.List<com.reservation_system.model.User> userList70 = userRepository67.getAllUsers();
        userRepository53.saveAllUsers(userList70);
        userRepository48.saveAllUsers(userList70);
        userRepository1.saveAllUsers(userList70);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 101 + "'", int2 == 101);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 101 + "'", int11 == 101);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(userList26);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 101 + "'", int27 == 101);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(userOptional31);
        org.junit.Assert.assertNotNull(userList34);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 101 + "'", int35 == 101);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + true + "'", boolean38 == true);
        org.junit.Assert.assertNotNull(userOptional40);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + true + "'", boolean42 == true);
        org.junit.Assert.assertNotNull(userList43);
        org.junit.Assert.assertNotNull(userList45);
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + 101 + "'", int49 == 101);
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + 101 + "'", int50 == 101);
        org.junit.Assert.assertNotNull(userList51);
        org.junit.Assert.assertTrue("'" + int54 + "' != '" + 101 + "'", int54 == 101);
        org.junit.Assert.assertTrue("'" + int55 + "' != '" + 101 + "'", int55 == 101);
        org.junit.Assert.assertNotNull(userList56);
        org.junit.Assert.assertEquals("'" + str63 + "' != '" + "" + "'", str63, "");
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + true + "'", boolean65 == true);
        org.junit.Assert.assertNotNull(userList68);
        org.junit.Assert.assertTrue("'" + int69 + "' != '" + 101 + "'", int69 == 101);
        org.junit.Assert.assertNotNull(userList70);
    }

    @Test
    public void test1899() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1899");
        com.reservation_system.model.User user6 = com.reservation_system.patterns.factory.UserFactory.createUser("guest", 0, "faculty", "headlabcoordinator", "headlabcoordinator", true);
        org.junit.Assert.assertNotNull(user6);
    }

    @Test
    public void test1900() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1900");
        com.reservation_system.model.Guest guest5 = new com.reservation_system.model.Guest((int) 'a', "student", "", "labmanager", false);
        java.lang.String str6 = guest5.getUserType();
        java.lang.String str7 = guest5.getUserType();
        boolean boolean8 = guest5.requiresDepartmentApproval();
        boolean boolean9 = guest5.requiresDepartmentApproval();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Guest" + "'", str6, "Guest");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Guest" + "'", str7, "Guest");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test1901() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1901");
        com.reservation_system.model.Student student5 = new com.reservation_system.model.Student(1, "data/test-userrepo.csv", "alice@example.com", "guest", false);
        java.lang.String str6 = student5.getUserType();
        java.lang.String str7 = student5.getUserType();
        java.lang.String str8 = student5.getName();
        boolean boolean9 = student5.requiresDepartmentApproval();
        java.lang.String str10 = student5.getUserType();
        java.lang.String str11 = student5.getName();
        java.lang.String str12 = student5.getUserType();
        java.lang.String str13 = student5.getPassword();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Student" + "'", str6, "Student");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Student" + "'", str7, "Student");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "data/test-userrepo.csv" + "'", str8, "data/test-userrepo.csv");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Student" + "'", str10, "Student");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "data/test-userrepo.csv" + "'", str11, "data/test-userrepo.csv");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Student" + "'", str12, "Student");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "guest" + "'", str13, "guest");
    }

    @Test
    public void test1902() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1902");
        com.reservation_system.model.LabManager labManager5 = new com.reservation_system.model.LabManager(10, "Password1!", "data/test-userrepo.csv", "Guest", true);
        java.lang.String str6 = labManager5.getUserType();
        java.lang.String str7 = labManager5.getPassword();
        java.lang.String str8 = labManager5.getEmail();
        java.lang.String str9 = labManager5.getName();
        java.lang.String str10 = labManager5.getPassword();
        java.lang.String str11 = labManager5.getUserType();
        java.lang.String str12 = labManager5.getUserType();
        java.lang.String str13 = labManager5.getUserType();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "labmanager" + "'", str6, "labmanager");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Guest" + "'", str7, "Guest");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "data/test-userrepo.csv" + "'", str8, "data/test-userrepo.csv");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Password1!" + "'", str9, "Password1!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Guest" + "'", str10, "Guest");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "labmanager" + "'", str11, "labmanager");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "labmanager" + "'", str12, "labmanager");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "labmanager" + "'", str13, "labmanager");
    }

    @Test
    public void test1903() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1903");
        com.reservation_system.model.Researcher researcher5 = new com.reservation_system.model.Researcher((int) (short) -1, "Student", "Alice", "labmanager", false);
        java.lang.String str6 = researcher5.getEmail();
        java.lang.String str7 = researcher5.getUserType();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Alice" + "'", str6, "Alice");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Researcher" + "'", str7, "Researcher");
    }

    @Test
    public void test1904() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1904");
        com.reservation_system.model.Researcher researcher5 = new com.reservation_system.model.Researcher((int) (short) -1, "Password1!", "Alice", "Password1!", false);
    }

    @Test
    public void test1905() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1905");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("data/test-userrepo.csv");
        java.util.List<com.reservation_system.model.User> userList2 = userRepository1.getAllUsers();
        int int3 = userRepository1.getNextID();
        boolean boolean5 = userRepository1.emailExists("headlabcoordinator");
        boolean boolean6 = userRepository1.headLabCoordinatorExists();
        java.util.Optional<com.reservation_system.model.User> userOptional8 = userRepository1.findByEmail("Alice");
        boolean boolean9 = userRepository1.headLabCoordinatorExists();
        java.util.List<com.reservation_system.model.User> userList10 = userRepository1.getAllUsers();
        java.util.List<com.reservation_system.model.User> userList11 = userRepository1.getAllUsers();
        java.util.List<com.reservation_system.model.User> userList12 = userRepository1.getAllUsers();
        org.junit.Assert.assertNotNull(userList2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 101 + "'", int3 == 101);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(userOptional8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(userList10);
        org.junit.Assert.assertNotNull(userList11);
        org.junit.Assert.assertNotNull(userList12);
    }

    @Test
    public void test1906() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1906");
        com.reservation_system.model.HeadLabCoordinator headLabCoordinator5 = new com.reservation_system.model.HeadLabCoordinator(6, "researcher", "Alice", "researcher", true);
        java.lang.String str6 = headLabCoordinator5.getUserType();
        java.lang.String str7 = headLabCoordinator5.getUserType();
        java.lang.String str8 = headLabCoordinator5.getUserType();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "headlabcoordinator" + "'", str6, "headlabcoordinator");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "headlabcoordinator" + "'", str7, "headlabcoordinator");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "headlabcoordinator" + "'", str8, "headlabcoordinator");
    }

    @Test
    public void test1907() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1907");
        com.reservation_system.model.LabManager labManager5 = new com.reservation_system.model.LabManager(10, "Guest", "Guest", "faculty", true);
        java.lang.String str6 = labManager5.getUserType();
        java.lang.Class<?> wildcardClass7 = labManager5.getClass();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "labmanager" + "'", str6, "labmanager");
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test1908() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1908");
        com.reservation_system.model.Faculty faculty5 = new com.reservation_system.model.Faculty(97, "headlabcoordinator", "Student", "student", false);
    }

    @Test
    public void test1909() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1909");
        com.reservation_system.model.Guest guest5 = new com.reservation_system.model.Guest(5, "hi!", "Password1!", "", true);
        java.lang.String str6 = guest5.getEmail();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Password1!" + "'", str6, "Password1!");
    }

    @Test
    public void test1910() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1910");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("data/test-userrepo.csv");
        com.reservation_system.model.Researcher researcher7 = new com.reservation_system.model.Researcher(5, "hi!", "labmanager", "Guest", false);
        userRepository1.addUser((com.reservation_system.model.User) researcher7);
        java.util.List<com.reservation_system.model.User> userList9 = userRepository1.getAllUsers();
        boolean boolean10 = userRepository1.headLabCoordinatorExists();
        com.reservation_system.model.LabManager labManager16 = new com.reservation_system.model.LabManager((int) '#', "researcher", "Guest", "headlabcoordinator", true);
        int int17 = labManager16.getID();
        userRepository1.addUser((com.reservation_system.model.User) labManager16);
        com.reservation_system.repository.UserRepository userRepository20 = new com.reservation_system.repository.UserRepository("data/test-userrepo.csv");
        boolean boolean22 = userRepository20.emailExists("Alice");
        java.util.List<com.reservation_system.model.User> userList23 = userRepository20.getAllUsers();
        java.util.Optional<com.reservation_system.model.User> userOptional25 = userRepository20.findByEmail("faculty");
        com.reservation_system.repository.UserRepository userRepository27 = new com.reservation_system.repository.UserRepository("data/test-userrepo.csv");
        int int28 = userRepository27.getNextID();
        int int29 = userRepository27.getNextID();
        com.reservation_system.model.HeadLabCoordinator headLabCoordinator35 = new com.reservation_system.model.HeadLabCoordinator((int) (byte) 1, "", "", "guest", false);
        userRepository27.addUser((com.reservation_system.model.User) headLabCoordinator35);
        java.util.List<com.reservation_system.model.User> userList37 = userRepository27.getAllUsers();
        boolean boolean39 = userRepository27.emailExists("Faculty");
        java.util.List<com.reservation_system.model.User> userList40 = userRepository27.getAllUsers();
        userRepository20.saveAllUsers(userList40);
        userRepository1.saveAllUsers(userList40);
        com.reservation_system.model.User user43 = null;
        // The following exception was thrown during execution in test generation
        try {
            userRepository1.addUser(user43);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(userList9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 35 + "'", int17 == 35);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(userList23);
        org.junit.Assert.assertNotNull(userOptional25);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 101 + "'", int28 == 101);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 101 + "'", int29 == 101);
        org.junit.Assert.assertNotNull(userList37);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
        org.junit.Assert.assertNotNull(userList40);
    }

    @Test
    public void test1911() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1911");
        com.reservation_system.model.LabManager labManager5 = new com.reservation_system.model.LabManager(33, "guest", "guest", "Alice", true);
    }

    @Test
    public void test1912() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1912");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("data/test-userrepo.csv");
        com.reservation_system.model.Researcher researcher7 = new com.reservation_system.model.Researcher(5, "hi!", "labmanager", "Guest", false);
        userRepository1.addUser((com.reservation_system.model.User) researcher7);
        java.util.List<com.reservation_system.model.User> userList9 = userRepository1.getAllUsers();
        boolean boolean11 = userRepository1.emailExists("hi!");
        com.reservation_system.repository.UserRepository userRepository13 = new com.reservation_system.repository.UserRepository("data/test-userrepo.csv");
        com.reservation_system.model.Researcher researcher19 = new com.reservation_system.model.Researcher(5, "hi!", "labmanager", "Guest", false);
        userRepository13.addUser((com.reservation_system.model.User) researcher19);
        java.util.List<com.reservation_system.model.User> userList21 = userRepository13.getAllUsers();
        com.reservation_system.model.Guest guest27 = new com.reservation_system.model.Guest(0, "Password1!", "data/test-userrepo.csv", "researcher", false);
        boolean boolean28 = guest27.requiresDepartmentApproval();
        userRepository13.addUser((com.reservation_system.model.User) guest27);
        boolean boolean31 = userRepository13.emailExists("Alice");
        int int32 = userRepository13.getNextID();
        com.reservation_system.repository.UserRepository userRepository34 = new com.reservation_system.repository.UserRepository("data/test-userrepo.csv");
        boolean boolean36 = userRepository34.emailExists("Alice");
        com.reservation_system.repository.UserRepository userRepository38 = new com.reservation_system.repository.UserRepository("data/test-userrepo.csv");
        java.util.List<com.reservation_system.model.User> userList39 = userRepository38.getAllUsers();
        int int40 = userRepository38.getNextID();
        java.util.List<com.reservation_system.model.User> userList41 = userRepository38.getAllUsers();
        userRepository34.saveAllUsers(userList41);
        userRepository13.saveAllUsers(userList41);
        userRepository1.saveAllUsers(userList41);
        com.reservation_system.model.HeadLabCoordinator headLabCoordinator50 = new com.reservation_system.model.HeadLabCoordinator(5, "faculty", "faculty", "hi!", true);
        int int51 = headLabCoordinator50.getID();
        headLabCoordinator50.setApproved(true);
        userRepository1.addUser((com.reservation_system.model.User) headLabCoordinator50);
        java.lang.String str55 = headLabCoordinator50.getUserType();
        org.junit.Assert.assertNotNull(userList9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(userList21);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 101 + "'", int32 == 101);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertNotNull(userList39);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 101 + "'", int40 == 101);
        org.junit.Assert.assertNotNull(userList41);
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + 5 + "'", int51 == 5);
        org.junit.Assert.assertEquals("'" + str55 + "' != '" + "headlabcoordinator" + "'", str55, "headlabcoordinator");
    }

    @Test
    public void test1913() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1913");
        com.reservation_system.model.LabManager labManager5 = new com.reservation_system.model.LabManager((int) (short) -1, "researcher", "data/test-userrepo.csv", "hi!", true);
    }

    @Test
    public void test1914() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1914");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("data/test-userrepo.csv");
        com.reservation_system.model.Researcher researcher7 = new com.reservation_system.model.Researcher(5, "hi!", "labmanager", "Guest", false);
        userRepository1.addUser((com.reservation_system.model.User) researcher7);
        int int9 = userRepository1.getNextID();
        boolean boolean11 = userRepository1.emailExists("Researcher");
        boolean boolean12 = userRepository1.headLabCoordinatorExists();
        java.util.Optional<com.reservation_system.model.User> userOptional14 = userRepository1.findByEmail("researcher");
        int int15 = userRepository1.getNextID();
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 101 + "'", int9 == 101);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(userOptional14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 101 + "'", int15 == 101);
    }

    @Test
    public void test1915() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1915");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("data/test-userrepo.csv");
        java.util.List<com.reservation_system.model.User> userList2 = userRepository1.getAllUsers();
        com.reservation_system.model.Guest guest8 = new com.reservation_system.model.Guest(0, "Password1!", "data/test-userrepo.csv", "researcher", false);
        boolean boolean9 = guest8.requiresDepartmentApproval();
        java.lang.String str10 = guest8.getUserType();
        java.lang.String str11 = guest8.getUserType();
        guest8.setApproved(true);
        java.lang.String str14 = guest8.getUserType();
        userRepository1.addUser((com.reservation_system.model.User) guest8);
        com.reservation_system.repository.UserRepository userRepository17 = new com.reservation_system.repository.UserRepository("data/test-userrepo.csv");
        java.util.List<com.reservation_system.model.User> userList18 = userRepository17.getAllUsers();
        int int19 = userRepository17.getNextID();
        boolean boolean21 = userRepository17.emailExists("headlabcoordinator");
        boolean boolean22 = userRepository17.headLabCoordinatorExists();
        java.util.Optional<com.reservation_system.model.User> userOptional24 = userRepository17.findByEmail("Alice");
        boolean boolean26 = userRepository17.emailExists("Alice");
        boolean boolean28 = userRepository17.emailExists("Guest");
        boolean boolean30 = userRepository17.emailExists("headlabcoordinator");
        com.reservation_system.repository.UserRepository userRepository32 = new com.reservation_system.repository.UserRepository("data/test-userrepo.csv");
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
        com.reservation_system.model.Faculty faculty54 = new com.reservation_system.model.Faculty(1, "faculty", "Student", "", false);
        boolean boolean55 = faculty54.requiresDepartmentApproval();
        faculty54.setApproved(true);
        userRepository1.addUser((com.reservation_system.model.User) faculty54);
        org.junit.Assert.assertNotNull(userList2);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Guest" + "'", str10, "Guest");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Guest" + "'", str11, "Guest");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Guest" + "'", str14, "Guest");
        org.junit.Assert.assertNotNull(userList18);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 101 + "'", int19 == 101);
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
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + true + "'", boolean55 == true);
    }

    @Test
    public void test1916() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1916");
        com.reservation_system.model.Guest guest5 = new com.reservation_system.model.Guest((int) (byte) -1, "hi!", "", "Password1!", false);
        java.lang.String str6 = guest5.getEmail();
        java.lang.String str7 = guest5.getUserType();
        int int8 = guest5.getID();
        java.lang.String str9 = guest5.getEmail();
        java.lang.String str10 = guest5.getUserType();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Guest" + "'", str7, "Guest");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Guest" + "'", str10, "Guest");
    }

    @Test
    public void test1917() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1917");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("data/test-userrepo.csv");
        int int2 = userRepository1.getNextID();
        boolean boolean3 = userRepository1.headLabCoordinatorExists();
        com.reservation_system.repository.UserRepository userRepository5 = new com.reservation_system.repository.UserRepository("data/test-userrepo.csv");
        boolean boolean7 = userRepository5.emailExists("Alice");
        com.reservation_system.model.Researcher researcher13 = new com.reservation_system.model.Researcher((int) 'a', "labmanager", "faculty", "", false);
        boolean boolean14 = researcher13.isApproved();
        java.lang.String str15 = researcher13.getName();
        userRepository5.addUser((com.reservation_system.model.User) researcher13);
        boolean boolean17 = userRepository5.headLabCoordinatorExists();
        java.util.List<com.reservation_system.model.User> userList18 = userRepository5.getAllUsers();
        userRepository1.saveAllUsers(userList18);
        com.reservation_system.repository.UserRepository userRepository21 = new com.reservation_system.repository.UserRepository("data/test-userrepo.csv");
        boolean boolean23 = userRepository21.emailExists("Alice");
        java.util.List<com.reservation_system.model.User> userList24 = userRepository21.getAllUsers();
        userRepository1.saveAllUsers(userList24);
        java.util.Optional<com.reservation_system.model.User> userOptional27 = userRepository1.findByEmail("Researcher");
        boolean boolean29 = userRepository1.emailExists("researcher");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 101 + "'", int2 == 101);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "labmanager" + "'", str15, "labmanager");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNotNull(userList18);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(userList24);
        org.junit.Assert.assertNotNull(userOptional27);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
    }

    @Test
    public void test1918() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1918");
        com.reservation_system.model.Faculty faculty5 = new com.reservation_system.model.Faculty((int) (short) 10, "labmanager", "faculty", "alice@example.com", false);
        java.lang.String str6 = faculty5.getUserType();
        boolean boolean7 = faculty5.requiresDepartmentApproval();
        java.lang.String str8 = faculty5.getUserType();
        boolean boolean9 = faculty5.requiresDepartmentApproval();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Faculty" + "'", str6, "Faculty");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Faculty" + "'", str8, "Faculty");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test1919() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1919");
        com.reservation_system.model.HeadLabCoordinator headLabCoordinator5 = new com.reservation_system.model.HeadLabCoordinator(35, "Password1!", "Guest", "Password1!", true);
        int int6 = headLabCoordinator5.getID();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 35 + "'", int6 == 35);
    }

    @Test
    public void test1920() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1920");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("data/test-userrepo.csv");
        java.util.List<com.reservation_system.model.User> userList2 = userRepository1.getAllUsers();
        int int3 = userRepository1.getNextID();
        boolean boolean5 = userRepository1.emailExists("headlabcoordinator");
        boolean boolean6 = userRepository1.headLabCoordinatorExists();
        java.util.Optional<com.reservation_system.model.User> userOptional8 = userRepository1.findByEmail("Alice");
        boolean boolean10 = userRepository1.emailExists("Alice");
        boolean boolean12 = userRepository1.emailExists("Guest");
        boolean boolean14 = userRepository1.emailExists("headlabcoordinator");
        com.reservation_system.model.Student student20 = new com.reservation_system.model.Student(0, "Guest", "Password1!", "data/test-userrepo.csv", true);
        userRepository1.addUser((com.reservation_system.model.User) student20);
        boolean boolean23 = userRepository1.emailExists("researcher");
        boolean boolean25 = userRepository1.emailExists("Alice");
        org.junit.Assert.assertNotNull(userList2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 101 + "'", int3 == 101);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(userOptional8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
    }

    @Test
    public void test1921() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1921");
        com.reservation_system.model.Faculty faculty5 = new com.reservation_system.model.Faculty(102, "researcher", "", "Faculty", false);
    }

    @Test
    public void test1922() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1922");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("data/test-userrepo.csv");
        boolean boolean3 = userRepository1.emailExists("Alice");
        com.reservation_system.repository.UserRepository userRepository5 = new com.reservation_system.repository.UserRepository("data/test-userrepo.csv");
        java.util.List<com.reservation_system.model.User> userList6 = userRepository5.getAllUsers();
        int int7 = userRepository5.getNextID();
        java.util.List<com.reservation_system.model.User> userList8 = userRepository5.getAllUsers();
        userRepository1.saveAllUsers(userList8);
        boolean boolean11 = userRepository1.emailExists("Password1!");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(userList6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 101 + "'", int7 == 101);
        org.junit.Assert.assertNotNull(userList8);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test1923() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1923");
        com.reservation_system.model.Student student5 = new com.reservation_system.model.Student(0, "labmanager", "researcher", "guest", false);
        java.lang.String str6 = student5.getUserType();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Student" + "'", str6, "Student");
    }

    @Test
    public void test1924() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1924");
        com.reservation_system.model.User user6 = com.reservation_system.patterns.factory.UserFactory.createUser("Faculty", (int) (byte) 100, "alice@example.com", "researcher", "student", true);
        org.junit.Assert.assertNotNull(user6);
    }

    @Test
    public void test1925() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1925");
        com.reservation_system.model.Faculty faculty5 = new com.reservation_system.model.Faculty((int) (byte) 0, "", "faculty", "", false);
        boolean boolean6 = faculty5.isApproved();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test1926() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1926");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("data/test-userrepo.csv");
        com.reservation_system.model.Researcher researcher7 = new com.reservation_system.model.Researcher(5, "hi!", "labmanager", "Guest", false);
        userRepository1.addUser((com.reservation_system.model.User) researcher7);
        int int9 = userRepository1.getNextID();
        boolean boolean11 = userRepository1.emailExists("Researcher");
        java.util.List<com.reservation_system.model.User> userList12 = userRepository1.getAllUsers();
        com.reservation_system.repository.UserRepository userRepository14 = new com.reservation_system.repository.UserRepository("data/test-userrepo.csv");
        java.util.List<com.reservation_system.model.User> userList15 = userRepository14.getAllUsers();
        int int16 = userRepository14.getNextID();
        boolean boolean18 = userRepository14.emailExists("headlabcoordinator");
        boolean boolean19 = userRepository14.headLabCoordinatorExists();
        java.util.Optional<com.reservation_system.model.User> userOptional21 = userRepository14.findByEmail("Alice");
        boolean boolean23 = userRepository14.emailExists("Alice");
        boolean boolean25 = userRepository14.emailExists("Guest");
        boolean boolean27 = userRepository14.emailExists("headlabcoordinator");
        java.util.List<com.reservation_system.model.User> userList28 = userRepository14.getAllUsers();
        userRepository1.saveAllUsers(userList28);
        boolean boolean30 = userRepository1.headLabCoordinatorExists();
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 101 + "'", int9 == 101);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(userList12);
        org.junit.Assert.assertNotNull(userList15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 101 + "'", int16 == 101);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNotNull(userOptional21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(userList28);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
    }

    @Test
    public void test1927() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1927");
        com.reservation_system.model.User user6 = com.reservation_system.patterns.factory.UserFactory.createUser("student", (int) (short) 0, "labmanager", "student", "guest", false);
        org.junit.Assert.assertNotNull(user6);
    }

    @Test
    public void test1928() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1928");
        com.reservation_system.model.Researcher researcher5 = new com.reservation_system.model.Researcher((int) (short) -1, "", "alice@example.com", "Student", false);
    }

    @Test
    public void test1929() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1929");
        com.reservation_system.model.Faculty faculty5 = new com.reservation_system.model.Faculty((int) (short) -1, "Faculty", "Guest", "Researcher", true);
        java.lang.String str6 = faculty5.getUserType();
        faculty5.setApproved(true);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Faculty" + "'", str6, "Faculty");
    }

    @Test
    public void test1930() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1930");
        com.reservation_system.model.HeadLabCoordinator headLabCoordinator5 = new com.reservation_system.model.HeadLabCoordinator((int) (short) 100, "alice@example.com", "Guest", "labmanager", true);
        java.lang.String str6 = headLabCoordinator5.getUserType();
        java.lang.String str7 = headLabCoordinator5.getName();
        boolean boolean8 = headLabCoordinator5.isApproved();
        java.lang.Class<?> wildcardClass9 = headLabCoordinator5.getClass();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "headlabcoordinator" + "'", str6, "headlabcoordinator");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test1931() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1931");
        com.reservation_system.model.LabManager labManager5 = new com.reservation_system.model.LabManager(35, "Password1!", "Password1!", "Guest", true);
    }

    @Test
    public void test1932() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1932");
        com.reservation_system.model.Student student5 = new com.reservation_system.model.Student(98, "labmanager", "", "student", false);
        java.lang.String str6 = student5.getPassword();
        student5.setApproved(false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "student" + "'", str6, "student");
    }

    @Test
    public void test1933() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1933");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("data/test-userrepo.csv");
        java.util.List<com.reservation_system.model.User> userList2 = userRepository1.getAllUsers();
        int int3 = userRepository1.getNextID();
        boolean boolean5 = userRepository1.emailExists("headlabcoordinator");
        boolean boolean6 = userRepository1.headLabCoordinatorExists();
        int int7 = userRepository1.getNextID();
        java.util.Optional<com.reservation_system.model.User> userOptional9 = userRepository1.findByEmail("faculty");
        int int10 = userRepository1.getNextID();
        com.reservation_system.repository.UserRepository userRepository12 = new com.reservation_system.repository.UserRepository("data/test-userrepo.csv");
        com.reservation_system.model.Researcher researcher18 = new com.reservation_system.model.Researcher(5, "hi!", "labmanager", "Guest", false);
        userRepository12.addUser((com.reservation_system.model.User) researcher18);
        java.util.List<com.reservation_system.model.User> userList20 = userRepository12.getAllUsers();
        boolean boolean21 = userRepository12.headLabCoordinatorExists();
        com.reservation_system.model.LabManager labManager27 = new com.reservation_system.model.LabManager((int) '#', "researcher", "Guest", "headlabcoordinator", true);
        int int28 = labManager27.getID();
        userRepository12.addUser((com.reservation_system.model.User) labManager27);
        com.reservation_system.repository.UserRepository userRepository31 = new com.reservation_system.repository.UserRepository("data/test-userrepo.csv");
        boolean boolean33 = userRepository31.emailExists("Alice");
        java.util.List<com.reservation_system.model.User> userList34 = userRepository31.getAllUsers();
        java.util.Optional<com.reservation_system.model.User> userOptional36 = userRepository31.findByEmail("faculty");
        com.reservation_system.repository.UserRepository userRepository38 = new com.reservation_system.repository.UserRepository("data/test-userrepo.csv");
        int int39 = userRepository38.getNextID();
        int int40 = userRepository38.getNextID();
        com.reservation_system.model.HeadLabCoordinator headLabCoordinator46 = new com.reservation_system.model.HeadLabCoordinator((int) (byte) 1, "", "", "guest", false);
        userRepository38.addUser((com.reservation_system.model.User) headLabCoordinator46);
        java.util.List<com.reservation_system.model.User> userList48 = userRepository38.getAllUsers();
        boolean boolean50 = userRepository38.emailExists("Faculty");
        java.util.List<com.reservation_system.model.User> userList51 = userRepository38.getAllUsers();
        userRepository31.saveAllUsers(userList51);
        userRepository12.saveAllUsers(userList51);
        userRepository1.saveAllUsers(userList51);
        org.junit.Assert.assertNotNull(userList2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 101 + "'", int3 == 101);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 101 + "'", int7 == 101);
        org.junit.Assert.assertNotNull(userOptional9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 101 + "'", int10 == 101);
        org.junit.Assert.assertNotNull(userList20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 35 + "'", int28 == 35);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertNotNull(userList34);
        org.junit.Assert.assertNotNull(userOptional36);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 101 + "'", int39 == 101);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 101 + "'", int40 == 101);
        org.junit.Assert.assertNotNull(userList48);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + true + "'", boolean50 == true);
        org.junit.Assert.assertNotNull(userList51);
    }

    @Test
    public void test1934() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1934");
        com.reservation_system.model.Researcher researcher5 = new com.reservation_system.model.Researcher((int) (short) 1, "data/test-userrepo.csv", "researcher", "Guest", false);
        java.lang.String str6 = researcher5.getUserType();
        java.lang.String str7 = researcher5.getPassword();
        java.lang.String str8 = researcher5.getUserType();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Researcher" + "'", str6, "Researcher");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Guest" + "'", str7, "Guest");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Researcher" + "'", str8, "Researcher");
    }

    @Test
    public void test1935() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1935");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("data/test-userrepo.csv");
        int int2 = userRepository1.getNextID();
        boolean boolean4 = userRepository1.emailExists("Alice");
        boolean boolean5 = userRepository1.headLabCoordinatorExists();
        com.reservation_system.model.Guest guest11 = new com.reservation_system.model.Guest(98, "Researcher", "Faculty", "Student", true);
        userRepository1.addUser((com.reservation_system.model.User) guest11);
        boolean boolean13 = userRepository1.headLabCoordinatorExists();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 101 + "'", int2 == 101);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test1936() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1936");
        com.reservation_system.model.Researcher researcher5 = new com.reservation_system.model.Researcher((int) '4', "Student", "", "guest", true);
    }

    @Test
    public void test1937() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1937");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("data/test-userrepo.csv");
        com.reservation_system.model.Researcher researcher7 = new com.reservation_system.model.Researcher(5, "hi!", "labmanager", "Guest", false);
        userRepository1.addUser((com.reservation_system.model.User) researcher7);
        java.util.List<com.reservation_system.model.User> userList9 = userRepository1.getAllUsers();
        boolean boolean10 = userRepository1.headLabCoordinatorExists();
        boolean boolean12 = userRepository1.emailExists("guest");
        com.reservation_system.repository.UserRepository userRepository14 = new com.reservation_system.repository.UserRepository("data/test-userrepo.csv");
        boolean boolean16 = userRepository14.emailExists("Alice");
        com.reservation_system.repository.UserRepository userRepository18 = new com.reservation_system.repository.UserRepository("data/test-userrepo.csv");
        java.util.List<com.reservation_system.model.User> userList19 = userRepository18.getAllUsers();
        int int20 = userRepository18.getNextID();
        java.util.List<com.reservation_system.model.User> userList21 = userRepository18.getAllUsers();
        userRepository14.saveAllUsers(userList21);
        userRepository1.saveAllUsers(userList21);
        com.reservation_system.repository.UserRepository userRepository25 = new com.reservation_system.repository.UserRepository("data/test-userrepo.csv");
        java.util.List<com.reservation_system.model.User> userList26 = userRepository25.getAllUsers();
        int int27 = userRepository25.getNextID();
        boolean boolean29 = userRepository25.emailExists("headlabcoordinator");
        boolean boolean30 = userRepository25.headLabCoordinatorExists();
        java.util.Optional<com.reservation_system.model.User> userOptional32 = userRepository25.findByEmail("Alice");
        boolean boolean34 = userRepository25.emailExists("Alice");
        boolean boolean36 = userRepository25.emailExists("Guest");
        boolean boolean38 = userRepository25.emailExists("headlabcoordinator");
        java.util.List<com.reservation_system.model.User> userList39 = userRepository25.getAllUsers();
        java.util.List<com.reservation_system.model.User> userList40 = userRepository25.getAllUsers();
        userRepository1.saveAllUsers(userList40);
        int int42 = userRepository1.getNextID();
        org.junit.Assert.assertNotNull(userList9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(userList19);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 101 + "'", int20 == 101);
        org.junit.Assert.assertNotNull(userList21);
        org.junit.Assert.assertNotNull(userList26);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 101 + "'", int27 == 101);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertNotNull(userOptional32);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertNotNull(userList39);
        org.junit.Assert.assertNotNull(userList40);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 101 + "'", int42 == 101);
    }

    @Test
    public void test1938() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1938");
        com.reservation_system.model.Guest guest5 = new com.reservation_system.model.Guest((int) 'a', "", "Alice", "guest", true);
    }

    @Test
    public void test1939() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1939");
        com.reservation_system.model.Guest guest5 = new com.reservation_system.model.Guest(0, "Password1!", "data/test-userrepo.csv", "researcher", false);
        boolean boolean6 = guest5.requiresDepartmentApproval();
        java.lang.String str7 = guest5.getUserType();
        java.lang.String str8 = guest5.getPassword();
        java.lang.String str9 = guest5.getPassword();
        java.lang.String str10 = guest5.getUserType();
        java.lang.String str11 = guest5.getUserType();
        java.lang.String str12 = guest5.getEmail();
        boolean boolean13 = guest5.requiresDepartmentApproval();
        int int14 = guest5.getID();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Guest" + "'", str7, "Guest");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "researcher" + "'", str8, "researcher");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "researcher" + "'", str9, "researcher");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Guest" + "'", str10, "Guest");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Guest" + "'", str11, "Guest");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "data/test-userrepo.csv" + "'", str12, "data/test-userrepo.csv");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
    }

    @Test
    public void test1940() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1940");
        com.reservation_system.model.Researcher researcher5 = new com.reservation_system.model.Researcher((int) (short) 100, "Password1!", "Researcher", "", true);
        boolean boolean6 = researcher5.requiresDepartmentApproval();
        java.lang.String str7 = researcher5.getEmail();
        java.lang.String str8 = researcher5.getPassword();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Researcher" + "'", str7, "Researcher");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test1941() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1941");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("data/test-userrepo.csv");
        int int2 = userRepository1.getNextID();
        boolean boolean3 = userRepository1.headLabCoordinatorExists();
        com.reservation_system.repository.UserRepository userRepository5 = new com.reservation_system.repository.UserRepository("data/test-userrepo.csv");
        boolean boolean7 = userRepository5.emailExists("Alice");
        com.reservation_system.model.Researcher researcher13 = new com.reservation_system.model.Researcher((int) 'a', "labmanager", "faculty", "", false);
        boolean boolean14 = researcher13.isApproved();
        java.lang.String str15 = researcher13.getName();
        userRepository5.addUser((com.reservation_system.model.User) researcher13);
        boolean boolean17 = userRepository5.headLabCoordinatorExists();
        java.util.List<com.reservation_system.model.User> userList18 = userRepository5.getAllUsers();
        userRepository1.saveAllUsers(userList18);
        com.reservation_system.repository.UserRepository userRepository21 = new com.reservation_system.repository.UserRepository("data/test-userrepo.csv");
        int int22 = userRepository21.getNextID();
        com.reservation_system.repository.UserRepository userRepository24 = new com.reservation_system.repository.UserRepository("data/test-userrepo.csv");
        com.reservation_system.model.Researcher researcher30 = new com.reservation_system.model.Researcher(5, "hi!", "labmanager", "Guest", false);
        userRepository24.addUser((com.reservation_system.model.User) researcher30);
        java.util.List<com.reservation_system.model.User> userList32 = userRepository24.getAllUsers();
        com.reservation_system.model.Guest guest38 = new com.reservation_system.model.Guest(0, "Password1!", "data/test-userrepo.csv", "researcher", false);
        boolean boolean39 = guest38.requiresDepartmentApproval();
        userRepository24.addUser((com.reservation_system.model.User) guest38);
        boolean boolean42 = userRepository24.emailExists("Alice");
        int int43 = userRepository24.getNextID();
        com.reservation_system.repository.UserRepository userRepository45 = new com.reservation_system.repository.UserRepository("data/test-userrepo.csv");
        boolean boolean47 = userRepository45.emailExists("Alice");
        com.reservation_system.repository.UserRepository userRepository49 = new com.reservation_system.repository.UserRepository("data/test-userrepo.csv");
        java.util.List<com.reservation_system.model.User> userList50 = userRepository49.getAllUsers();
        int int51 = userRepository49.getNextID();
        java.util.List<com.reservation_system.model.User> userList52 = userRepository49.getAllUsers();
        userRepository45.saveAllUsers(userList52);
        userRepository24.saveAllUsers(userList52);
        userRepository21.saveAllUsers(userList52);
        userRepository1.saveAllUsers(userList52);
        com.reservation_system.model.Guest guest62 = new com.reservation_system.model.Guest(1, "data/test-userrepo.csv", "", "Alice", false);
        java.lang.String str63 = guest62.getUserType();
        userRepository1.addUser((com.reservation_system.model.User) guest62);
        java.lang.String str65 = guest62.getUserType();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 101 + "'", int2 == 101);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "labmanager" + "'", str15, "labmanager");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNotNull(userList18);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 101 + "'", int22 == 101);
        org.junit.Assert.assertNotNull(userList32);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 101 + "'", int43 == 101);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertNotNull(userList50);
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + 101 + "'", int51 == 101);
        org.junit.Assert.assertNotNull(userList52);
        org.junit.Assert.assertEquals("'" + str63 + "' != '" + "Guest" + "'", str63, "Guest");
        org.junit.Assert.assertEquals("'" + str65 + "' != '" + "Guest" + "'", str65, "Guest");
    }

    @Test
    public void test1942() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1942");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("data/test-userrepo.csv");
        java.util.List<com.reservation_system.model.User> userList2 = userRepository1.getAllUsers();
        int int3 = userRepository1.getNextID();
        boolean boolean5 = userRepository1.emailExists("headlabcoordinator");
        boolean boolean6 = userRepository1.headLabCoordinatorExists();
        java.util.Optional<com.reservation_system.model.User> userOptional8 = userRepository1.findByEmail("Alice");
        boolean boolean10 = userRepository1.emailExists("Alice");
        boolean boolean12 = userRepository1.emailExists("Guest");
        boolean boolean14 = userRepository1.emailExists("headlabcoordinator");
        boolean boolean15 = userRepository1.headLabCoordinatorExists();
        boolean boolean17 = userRepository1.emailExists("");
        org.junit.Assert.assertNotNull(userList2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 101 + "'", int3 == 101);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(userOptional8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
    }

    @Test
    public void test1943() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1943");
        com.reservation_system.model.Student student5 = new com.reservation_system.model.Student(11, "faculty", "hi!", "Password1!", false);
    }

    @Test
    public void test1944() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1944");
        com.reservation_system.model.Faculty faculty5 = new com.reservation_system.model.Faculty(52, "Guest", "Alice", "faculty", false);
        boolean boolean6 = faculty5.requiresDepartmentApproval();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test1945() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1945");
        // The following exception was thrown during execution in test generation
        try {
            com.reservation_system.model.User user6 = com.reservation_system.patterns.factory.UserFactory.createUser("alice@example.com", (int) (short) -1, "data/test-userrepo.csv", "labmanager", "researcher", false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid user type: alice@example.com");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1946() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1946");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("data/test-userrepo.csv");
        com.reservation_system.model.Researcher researcher7 = new com.reservation_system.model.Researcher(5, "hi!", "labmanager", "Guest", false);
        userRepository1.addUser((com.reservation_system.model.User) researcher7);
        int int9 = userRepository1.getNextID();
        java.util.Optional<com.reservation_system.model.User> userOptional11 = userRepository1.findByEmail("headlabcoordinator");
        java.util.Optional<com.reservation_system.model.User> userOptional13 = userRepository1.findByEmail("");
        com.reservation_system.model.LabManager labManager19 = new com.reservation_system.model.LabManager(10, "Password1!", "data/test-userrepo.csv", "Guest", true);
        java.lang.String str20 = labManager19.getUserType();
        java.lang.String str21 = labManager19.getPassword();
        java.lang.String str22 = labManager19.getPassword();
        userRepository1.addUser((com.reservation_system.model.User) labManager19);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 101 + "'", int9 == 101);
        org.junit.Assert.assertNotNull(userOptional11);
        org.junit.Assert.assertNotNull(userOptional13);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "labmanager" + "'", str20, "labmanager");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "Guest" + "'", str21, "Guest");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "Guest" + "'", str22, "Guest");
    }

    @Test
    public void test1947() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1947");
        com.reservation_system.model.Guest guest5 = new com.reservation_system.model.Guest((int) (byte) 10, "Guest", "guest", "", false);
        java.lang.String str6 = guest5.getUserType();
        guest5.setApproved(true);
        java.lang.String str9 = guest5.getName();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Guest" + "'", str6, "Guest");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Guest" + "'", str9, "Guest");
    }

    @Test
    public void test1948() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1948");
        com.reservation_system.model.LabManager labManager5 = new com.reservation_system.model.LabManager((int) (byte) 0, "Password1!", "Alice", "Guest", false);
        boolean boolean6 = labManager5.isApproved();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test1949() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1949");
        com.reservation_system.model.Student student5 = new com.reservation_system.model.Student(102, "", "data/test-userrepo.csv", "researcher", false);
    }

    @Test
    public void test1950() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1950");
        com.reservation_system.model.Student student5 = new com.reservation_system.model.Student(35, "data/test-userrepo.csv", "headlabcoordinator", "Alice", false);
    }

    @Test
    public void test1951() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1951");
        com.reservation_system.model.LabManager labManager5 = new com.reservation_system.model.LabManager((int) (byte) 10, "", "", "data/test-userrepo.csv", true);
        java.lang.String str6 = labManager5.getUserType();
        java.lang.String str7 = labManager5.getUserType();
        java.lang.String str8 = labManager5.getPassword();
        int int9 = labManager5.getID();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "labmanager" + "'", str6, "labmanager");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "labmanager" + "'", str7, "labmanager");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "data/test-userrepo.csv" + "'", str8, "data/test-userrepo.csv");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10 + "'", int9 == 10);
    }

    @Test
    public void test1952() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1952");
        com.reservation_system.model.Researcher researcher5 = new com.reservation_system.model.Researcher((int) 'a', "labmanager", "faculty", "", false);
        boolean boolean6 = researcher5.isApproved();
        java.lang.String str7 = researcher5.getName();
        boolean boolean8 = researcher5.requiresDepartmentApproval();
        java.lang.String str9 = researcher5.getName();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "labmanager" + "'", str7, "labmanager");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "labmanager" + "'", str9, "labmanager");
    }

    @Test
    public void test1953() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1953");
        com.reservation_system.model.HeadLabCoordinator headLabCoordinator5 = new com.reservation_system.model.HeadLabCoordinator((int) (byte) 100, "alice@example.com", "Password1!", "", true);
        java.lang.String str6 = headLabCoordinator5.getEmail();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Password1!" + "'", str6, "Password1!");
    }

    @Test
    public void test1954() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1954");
        com.reservation_system.model.Guest guest5 = new com.reservation_system.model.Guest(0, "Password1!", "data/test-userrepo.csv", "researcher", false);
        java.lang.String str6 = guest5.getUserType();
        guest5.setApproved(true);
        java.lang.String str9 = guest5.getUserType();
        boolean boolean10 = guest5.requiresDepartmentApproval();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Guest" + "'", str6, "Guest");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Guest" + "'", str9, "Guest");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test1955() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1955");
        com.reservation_system.model.LabManager labManager5 = new com.reservation_system.model.LabManager((int) (byte) 10, "", "", "data/test-userrepo.csv", true);
        java.lang.String str6 = labManager5.getEmail();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
    }

    @Test
    public void test1956() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1956");
        com.reservation_system.model.Faculty faculty5 = new com.reservation_system.model.Faculty((int) (short) 100, "", "Student", "researcher", false);
    }

    @Test
    public void test1957() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1957");
        com.reservation_system.model.Researcher researcher5 = new com.reservation_system.model.Researcher(99, "", "student", "Faculty", false);
        boolean boolean6 = researcher5.isApproved();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test1958() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1958");
        com.reservation_system.model.Researcher researcher5 = new com.reservation_system.model.Researcher((int) (byte) -1, "student", "alice@example.com", "Researcher", false);
    }

    @Test
    public void test1959() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1959");
        com.reservation_system.model.Student student5 = new com.reservation_system.model.Student(0, "faculty", "Guest", "", true);
    }

    @Test
    public void test1960() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1960");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("data/test-userrepo.csv");
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
        headLabCoordinator21.setApproved(false);
        java.lang.String str26 = headLabCoordinator21.getUserType();
        boolean boolean27 = headLabCoordinator21.requiresDepartmentApproval();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 101 + "'", int2 == 101);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 101 + "'", int11 == 101);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "headlabcoordinator" + "'", str26, "headlabcoordinator");
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
    }

    @Test
    public void test1961() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1961");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("data/test-userrepo.csv");
        com.reservation_system.model.Researcher researcher7 = new com.reservation_system.model.Researcher(5, "hi!", "labmanager", "Guest", false);
        userRepository1.addUser((com.reservation_system.model.User) researcher7);
        java.util.List<com.reservation_system.model.User> userList9 = userRepository1.getAllUsers();
        com.reservation_system.model.Guest guest15 = new com.reservation_system.model.Guest(0, "Password1!", "data/test-userrepo.csv", "researcher", false);
        boolean boolean16 = guest15.requiresDepartmentApproval();
        userRepository1.addUser((com.reservation_system.model.User) guest15);
        java.util.Optional<com.reservation_system.model.User> userOptional19 = userRepository1.findByEmail("Student");
        boolean boolean21 = userRepository1.emailExists("Student");
        java.util.Optional<com.reservation_system.model.User> userOptional23 = userRepository1.findByEmail("alice@example.com");
        boolean boolean25 = userRepository1.emailExists("Alice");
        org.junit.Assert.assertNotNull(userList9);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(userOptional19);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertNotNull(userOptional23);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
    }

    @Test
    public void test1962() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1962");
        com.reservation_system.model.Student student5 = new com.reservation_system.model.Student(101, "headlabcoordinator", "Guest", "data/test-userrepo.csv", false);
        student5.setApproved(false);
        java.lang.String str8 = student5.getUserType();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Student" + "'", str8, "Student");
    }

    @Test
    public void test1963() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1963");
        com.reservation_system.model.HeadLabCoordinator headLabCoordinator5 = new com.reservation_system.model.HeadLabCoordinator(101, "", "faculty", "Faculty", true);
    }

    @Test
    public void test1964() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1964");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("data/test-userrepo.csv");
        com.reservation_system.model.Researcher researcher7 = new com.reservation_system.model.Researcher(5, "hi!", "labmanager", "Guest", false);
        userRepository1.addUser((com.reservation_system.model.User) researcher7);
        java.lang.String str9 = researcher7.getUserType();
        boolean boolean10 = researcher7.requiresDepartmentApproval();
        java.lang.String str11 = researcher7.getPassword();
        java.lang.String str12 = researcher7.getUserType();
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Researcher" + "'", str9, "Researcher");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Guest" + "'", str11, "Guest");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Researcher" + "'", str12, "Researcher");
    }

    @Test
    public void test1965() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1965");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("data/test-userrepo.csv");
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
        int int24 = userRepository1.getNextID();
        boolean boolean26 = userRepository1.emailExists("Alice");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "labmanager" + "'", str11, "labmanager");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 101 + "'", int14 == 101);
        org.junit.Assert.assertNotNull(user21);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 101 + "'", int23 == 101);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 101 + "'", int24 == 101);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
    }

    @Test
    public void test1966() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1966");
        com.reservation_system.model.Researcher researcher5 = new com.reservation_system.model.Researcher((int) (short) 0, "Guest", "labmanager", "headlabcoordinator", false);
        java.lang.String str6 = researcher5.getPassword();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "headlabcoordinator" + "'", str6, "headlabcoordinator");
    }

    @Test
    public void test1967() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1967");
        com.reservation_system.model.Faculty faculty5 = new com.reservation_system.model.Faculty(0, "guest", "guest", "", false);
    }

    @Test
    public void test1968() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1968");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("data/test-userrepo.csv");
        boolean boolean3 = userRepository1.emailExists("Alice");
        int int4 = userRepository1.getNextID();
        boolean boolean5 = userRepository1.headLabCoordinatorExists();
        boolean boolean6 = userRepository1.headLabCoordinatorExists();
        boolean boolean8 = userRepository1.emailExists("Researcher");
        boolean boolean10 = userRepository1.emailExists("headlabcoordinator");
        boolean boolean11 = userRepository1.headLabCoordinatorExists();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 101 + "'", int4 == 101);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test1969() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1969");
        com.reservation_system.model.LabManager labManager5 = new com.reservation_system.model.LabManager((int) (short) 100, "alice@example.com", "data/test-userrepo.csv", "researcher", false);
        boolean boolean6 = labManager5.requiresDepartmentApproval();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test1970() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1970");
        com.reservation_system.model.Student student5 = new com.reservation_system.model.Student(1, "data/test-userrepo.csv", "alice@example.com", "guest", false);
        java.lang.String str6 = student5.getUserType();
        student5.setApproved(true);
        boolean boolean9 = student5.requiresDepartmentApproval();
        student5.setApproved(false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Student" + "'", str6, "Student");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test1971() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1971");
        com.reservation_system.model.Student student5 = new com.reservation_system.model.Student((int) (short) 100, "faculty", "Researcher", "Researcher", true);
        boolean boolean6 = student5.requiresDepartmentApproval();
        java.lang.String str7 = student5.getUserType();
        java.lang.String str8 = student5.getUserType();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Student" + "'", str7, "Student");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Student" + "'", str8, "Student");
    }

    @Test
    public void test1972() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1972");
        com.reservation_system.model.Faculty faculty5 = new com.reservation_system.model.Faculty((int) (byte) -1, "faculty", "data/test-userrepo.csv", "Student", false);
        boolean boolean6 = faculty5.isApproved();
        java.lang.String str7 = faculty5.getName();
        java.lang.String str8 = faculty5.getUserType();
        java.lang.String str9 = faculty5.getUserType();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "faculty" + "'", str7, "faculty");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Faculty" + "'", str8, "Faculty");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Faculty" + "'", str9, "Faculty");
    }

    @Test
    public void test1973() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1973");
        com.reservation_system.model.Guest guest5 = new com.reservation_system.model.Guest((int) (short) 10, "labmanager", "Student", "data/test-userrepo.csv", true);
        boolean boolean6 = guest5.isApproved();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test1974() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1974");
        com.reservation_system.model.Guest guest5 = new com.reservation_system.model.Guest(0, "Password1!", "data/test-userrepo.csv", "researcher", false);
        boolean boolean6 = guest5.requiresDepartmentApproval();
        java.lang.String str7 = guest5.getUserType();
        java.lang.String str8 = guest5.getUserType();
        java.lang.String str9 = guest5.getUserType();
        guest5.setApproved(false);
        java.lang.String str12 = guest5.getName();
        java.lang.String str13 = guest5.getName();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Guest" + "'", str7, "Guest");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Guest" + "'", str8, "Guest");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Guest" + "'", str9, "Guest");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Password1!" + "'", str12, "Password1!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Password1!" + "'", str13, "Password1!");
    }

    @Test
    public void test1975() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1975");
        com.reservation_system.model.LabManager labManager5 = new com.reservation_system.model.LabManager(33, "faculty", "Password1!", "alice@example.com", false);
    }

    @Test
    public void test1976() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1976");
        com.reservation_system.model.Guest guest5 = new com.reservation_system.model.Guest(0, "Password1!", "data/test-userrepo.csv", "researcher", false);
        guest5.setApproved(false);
        int int8 = guest5.getID();
        guest5.setApproved(true);
        boolean boolean11 = guest5.requiresDepartmentApproval();
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test1977() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1977");
        com.reservation_system.model.Faculty faculty5 = new com.reservation_system.model.Faculty(0, "hi!", "labmanager", "labmanager", false);
        java.lang.String str6 = faculty5.getPassword();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "labmanager" + "'", str6, "labmanager");
    }

    @Test
    public void test1978() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1978");
        com.reservation_system.model.Guest guest5 = new com.reservation_system.model.Guest(100, "Researcher", "data/test-userrepo.csv", "data/test-userrepo.csv", true);
        java.lang.String str6 = guest5.getName();
        java.lang.Class<?> wildcardClass7 = guest5.getClass();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Researcher" + "'", str6, "Researcher");
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test1979() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1979");
        com.reservation_system.model.Researcher researcher5 = new com.reservation_system.model.Researcher(35, "Guest", "guest", "Guest", false);
    }

    @Test
    public void test1980() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1980");
        com.reservation_system.model.LabManager labManager5 = new com.reservation_system.model.LabManager(35, "Guest", "labmanager", "researcher", true);
        boolean boolean6 = labManager5.requiresDepartmentApproval();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test1981() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1981");
        com.reservation_system.model.Guest guest5 = new com.reservation_system.model.Guest(0, "Password1!", "data/test-userrepo.csv", "researcher", false);
        guest5.setApproved(false);
        int int8 = guest5.getID();
        guest5.setApproved(true);
        boolean boolean11 = guest5.isApproved();
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test1982() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1982");
        com.reservation_system.model.Student student5 = new com.reservation_system.model.Student(0, "Faculty", "Student", "headlabcoordinator", true);
    }

    @Test
    public void test1983() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1983");
        com.reservation_system.model.HeadLabCoordinator headLabCoordinator5 = new com.reservation_system.model.HeadLabCoordinator((int) (short) 1, "hi!", "guest", "Alice", false);
        boolean boolean6 = headLabCoordinator5.requiresDepartmentApproval();
        java.lang.String str7 = headLabCoordinator5.getUserType();
        headLabCoordinator5.setApproved(false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "headlabcoordinator" + "'", str7, "headlabcoordinator");
    }

    @Test
    public void test1984() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1984");
        com.reservation_system.model.Faculty faculty5 = new com.reservation_system.model.Faculty((int) (byte) -1, "student", "labmanager", "hi!", false);
        boolean boolean6 = faculty5.isApproved();
        java.lang.String str7 = faculty5.getUserType();
        java.lang.String str8 = faculty5.getEmail();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Faculty" + "'", str7, "Faculty");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "labmanager" + "'", str8, "labmanager");
    }

    @Test
    public void test1985() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1985");
        com.reservation_system.model.LabManager labManager5 = new com.reservation_system.model.LabManager(6, "data/test-userrepo.csv", "student", "labmanager", true);
        java.lang.String str6 = labManager5.getUserType();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "labmanager" + "'", str6, "labmanager");
    }

    @Test
    public void test1986() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1986");
        com.reservation_system.model.LabManager labManager5 = new com.reservation_system.model.LabManager((int) (short) 0, "", "data/test-userrepo.csv", "student", false);
    }

    @Test
    public void test1987() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1987");
        com.reservation_system.model.HeadLabCoordinator headLabCoordinator5 = new com.reservation_system.model.HeadLabCoordinator(11, "labmanager", "Alice", "labmanager", false);
        java.lang.String str6 = headLabCoordinator5.getPassword();
        java.lang.String str7 = headLabCoordinator5.getUserType();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "labmanager" + "'", str6, "labmanager");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "headlabcoordinator" + "'", str7, "headlabcoordinator");
    }

    @Test
    public void test1988() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1988");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("data/test-userrepo.csv");
        boolean boolean3 = userRepository1.emailExists("Alice");
        int int4 = userRepository1.getNextID();
        boolean boolean5 = userRepository1.headLabCoordinatorExists();
        boolean boolean6 = userRepository1.headLabCoordinatorExists();
        boolean boolean8 = userRepository1.emailExists("Researcher");
        boolean boolean10 = userRepository1.emailExists("headlabcoordinator");
        com.reservation_system.repository.UserRepository userRepository12 = new com.reservation_system.repository.UserRepository("data/test-userrepo.csv");
        com.reservation_system.model.Researcher researcher18 = new com.reservation_system.model.Researcher(5, "hi!", "labmanager", "Guest", false);
        userRepository12.addUser((com.reservation_system.model.User) researcher18);
        java.util.List<com.reservation_system.model.User> userList20 = userRepository12.getAllUsers();
        boolean boolean21 = userRepository12.headLabCoordinatorExists();
        boolean boolean23 = userRepository12.emailExists("guest");
        com.reservation_system.repository.UserRepository userRepository25 = new com.reservation_system.repository.UserRepository("data/test-userrepo.csv");
        boolean boolean27 = userRepository25.emailExists("Alice");
        com.reservation_system.repository.UserRepository userRepository29 = new com.reservation_system.repository.UserRepository("data/test-userrepo.csv");
        java.util.List<com.reservation_system.model.User> userList30 = userRepository29.getAllUsers();
        int int31 = userRepository29.getNextID();
        java.util.List<com.reservation_system.model.User> userList32 = userRepository29.getAllUsers();
        userRepository25.saveAllUsers(userList32);
        userRepository12.saveAllUsers(userList32);
        java.util.List<com.reservation_system.model.User> userList35 = userRepository12.getAllUsers();
        userRepository1.saveAllUsers(userList35);
        java.util.Optional<com.reservation_system.model.User> userOptional38 = userRepository1.findByEmail("headlabcoordinator");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 101 + "'", int4 == 101);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(userList20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(userList30);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 101 + "'", int31 == 101);
        org.junit.Assert.assertNotNull(userList32);
        org.junit.Assert.assertNotNull(userList35);
        org.junit.Assert.assertNotNull(userOptional38);
    }

    @Test
    public void test1989() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1989");
        com.reservation_system.model.Researcher researcher5 = new com.reservation_system.model.Researcher(102, "guest", "Faculty", "Researcher", true);
    }

    @Test
    public void test1990() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1990");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("data/test-userrepo.csv");
        com.reservation_system.model.Researcher researcher7 = new com.reservation_system.model.Researcher(5, "hi!", "labmanager", "Guest", false);
        userRepository1.addUser((com.reservation_system.model.User) researcher7);
        boolean boolean9 = userRepository1.headLabCoordinatorExists();
        int int10 = userRepository1.getNextID();
        int int11 = userRepository1.getNextID();
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 101 + "'", int10 == 101);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 101 + "'", int11 == 101);
    }

    @Test
    public void test1991() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1991");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("data/test-userrepo.csv");
        java.util.List<com.reservation_system.model.User> userList2 = userRepository1.getAllUsers();
        int int3 = userRepository1.getNextID();
        boolean boolean5 = userRepository1.emailExists("headlabcoordinator");
        boolean boolean6 = userRepository1.headLabCoordinatorExists();
        int int7 = userRepository1.getNextID();
        java.util.Optional<com.reservation_system.model.User> userOptional9 = userRepository1.findByEmail("faculty");
        int int10 = userRepository1.getNextID();
        java.util.Optional<com.reservation_system.model.User> userOptional12 = userRepository1.findByEmail("Faculty");
        org.junit.Assert.assertNotNull(userList2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 101 + "'", int3 == 101);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 101 + "'", int7 == 101);
        org.junit.Assert.assertNotNull(userOptional9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 101 + "'", int10 == 101);
        org.junit.Assert.assertNotNull(userOptional12);
    }

    @Test
    public void test1992() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1992");
        com.reservation_system.model.Guest guest5 = new com.reservation_system.model.Guest(97, "hi!", "researcher", "", false);
        java.lang.String str6 = guest5.getPassword();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
    }

    @Test
    public void test1993() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1993");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("data/test-userrepo.csv");
        com.reservation_system.model.Faculty faculty7 = new com.reservation_system.model.Faculty(5, "researcher", "guest", "faculty", true);
        java.lang.String str8 = faculty7.getUserType();
        java.lang.String str9 = faculty7.getUserType();
        userRepository1.addUser((com.reservation_system.model.User) faculty7);
        com.reservation_system.repository.UserRepository userRepository12 = new com.reservation_system.repository.UserRepository("data/test-userrepo.csv");
        boolean boolean14 = userRepository12.emailExists("Alice");
        com.reservation_system.repository.UserRepository userRepository16 = new com.reservation_system.repository.UserRepository("data/test-userrepo.csv");
        java.util.List<com.reservation_system.model.User> userList17 = userRepository16.getAllUsers();
        int int18 = userRepository16.getNextID();
        java.util.List<com.reservation_system.model.User> userList19 = userRepository16.getAllUsers();
        userRepository12.saveAllUsers(userList19);
        userRepository1.saveAllUsers(userList19);
        com.reservation_system.repository.UserRepository userRepository23 = new com.reservation_system.repository.UserRepository("data/test-userrepo.csv");
        java.util.List<com.reservation_system.model.User> userList24 = userRepository23.getAllUsers();
        com.reservation_system.model.Guest guest30 = new com.reservation_system.model.Guest(0, "Password1!", "data/test-userrepo.csv", "researcher", false);
        boolean boolean31 = guest30.requiresDepartmentApproval();
        java.lang.String str32 = guest30.getUserType();
        java.lang.String str33 = guest30.getUserType();
        guest30.setApproved(true);
        java.lang.String str36 = guest30.getUserType();
        userRepository23.addUser((com.reservation_system.model.User) guest30);
        com.reservation_system.repository.UserRepository userRepository39 = new com.reservation_system.repository.UserRepository("data/test-userrepo.csv");
        java.util.List<com.reservation_system.model.User> userList40 = userRepository39.getAllUsers();
        int int41 = userRepository39.getNextID();
        boolean boolean43 = userRepository39.emailExists("headlabcoordinator");
        boolean boolean44 = userRepository39.headLabCoordinatorExists();
        java.util.Optional<com.reservation_system.model.User> userOptional46 = userRepository39.findByEmail("Alice");
        boolean boolean48 = userRepository39.emailExists("Alice");
        boolean boolean50 = userRepository39.emailExists("Guest");
        boolean boolean52 = userRepository39.emailExists("headlabcoordinator");
        com.reservation_system.repository.UserRepository userRepository54 = new com.reservation_system.repository.UserRepository("data/test-userrepo.csv");
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
        java.util.List<com.reservation_system.model.User> userList71 = userRepository1.getAllUsers();
        java.util.Optional<com.reservation_system.model.User> userOptional73 = userRepository1.findByEmail("Student");
        int int74 = userRepository1.getNextID();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Faculty" + "'", str8, "Faculty");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Faculty" + "'", str9, "Faculty");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(userList17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 101 + "'", int18 == 101);
        org.junit.Assert.assertNotNull(userList19);
        org.junit.Assert.assertNotNull(userList24);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "Guest" + "'", str32, "Guest");
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "Guest" + "'", str33, "Guest");
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "Guest" + "'", str36, "Guest");
        org.junit.Assert.assertNotNull(userList40);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 101 + "'", int41 == 101);
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
        org.junit.Assert.assertNotNull(userList71);
        org.junit.Assert.assertNotNull(userOptional73);
        org.junit.Assert.assertTrue("'" + int74 + "' != '" + 101 + "'", int74 == 101);
    }

    @Test
    public void test1994() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1994");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("data/test-userrepo.csv");
        boolean boolean3 = userRepository1.emailExists("Alice");
        java.util.List<com.reservation_system.model.User> userList4 = userRepository1.getAllUsers();
        java.util.Optional<com.reservation_system.model.User> userOptional6 = userRepository1.findByEmail("faculty");
        int int7 = userRepository1.getNextID();
        java.util.Optional<com.reservation_system.model.User> userOptional9 = userRepository1.findByEmail("Alice");
        boolean boolean10 = userRepository1.headLabCoordinatorExists();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(userList4);
        org.junit.Assert.assertNotNull(userOptional6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 101 + "'", int7 == 101);
        org.junit.Assert.assertNotNull(userOptional9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test1995() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1995");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("data/test-userrepo.csv");
        java.util.List<com.reservation_system.model.User> userList2 = userRepository1.getAllUsers();
        boolean boolean4 = userRepository1.emailExists("Researcher");
        com.reservation_system.repository.UserRepository userRepository6 = new com.reservation_system.repository.UserRepository("data/test-userrepo.csv");
        java.util.List<com.reservation_system.model.User> userList7 = userRepository6.getAllUsers();
        int int8 = userRepository6.getNextID();
        boolean boolean10 = userRepository6.emailExists("headlabcoordinator");
        boolean boolean11 = userRepository6.headLabCoordinatorExists();
        int int12 = userRepository6.getNextID();
        java.util.Optional<com.reservation_system.model.User> userOptional14 = userRepository6.findByEmail("faculty");
        com.reservation_system.repository.UserRepository userRepository16 = new com.reservation_system.repository.UserRepository("data/test-userrepo.csv");
        boolean boolean18 = userRepository16.emailExists("Alice");
        com.reservation_system.model.Researcher researcher24 = new com.reservation_system.model.Researcher((int) 'a', "labmanager", "faculty", "", false);
        boolean boolean25 = researcher24.isApproved();
        java.lang.String str26 = researcher24.getName();
        userRepository16.addUser((com.reservation_system.model.User) researcher24);
        boolean boolean28 = userRepository16.headLabCoordinatorExists();
        java.util.Optional<com.reservation_system.model.User> userOptional30 = userRepository16.findByEmail("");
        int int31 = userRepository16.getNextID();
        java.util.List<com.reservation_system.model.User> userList32 = userRepository16.getAllUsers();
        userRepository6.saveAllUsers(userList32);
        userRepository1.saveAllUsers(userList32);
        org.junit.Assert.assertNotNull(userList2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(userList7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 101 + "'", int8 == 101);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 101 + "'", int12 == 101);
        org.junit.Assert.assertNotNull(userOptional14);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "labmanager" + "'", str26, "labmanager");
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertNotNull(userOptional30);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 101 + "'", int31 == 101);
        org.junit.Assert.assertNotNull(userList32);
    }

    @Test
    public void test1996() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1996");
        com.reservation_system.model.Student student5 = new com.reservation_system.model.Student((int) (short) -1, "alice@example.com", "student", "student", true);
        boolean boolean6 = student5.requiresDepartmentApproval();
        boolean boolean7 = student5.requiresDepartmentApproval();
        java.lang.String str8 = student5.getUserType();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Student" + "'", str8, "Student");
    }

    @Test
    public void test1997() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1997");
        com.reservation_system.model.LabManager labManager5 = new com.reservation_system.model.LabManager((int) (byte) 0, "", "hi!", "alice@example.com", false);
    }

    @Test
    public void test1998() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1998");
        com.reservation_system.model.HeadLabCoordinator headLabCoordinator5 = new com.reservation_system.model.HeadLabCoordinator((int) ' ', "Student", "data/test-userrepo.csv", "hi!", true);
    }

    @Test
    public void test1999() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1999");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("data/test-userrepo.csv");
        int int2 = userRepository1.getNextID();
        boolean boolean3 = userRepository1.headLabCoordinatorExists();
        com.reservation_system.model.Guest guest9 = new com.reservation_system.model.Guest((int) (byte) -1, "hi!", "", "Password1!", false);
        userRepository1.addUser((com.reservation_system.model.User) guest9);
        com.reservation_system.repository.UserRepository userRepository12 = new com.reservation_system.repository.UserRepository("data/test-userrepo.csv");
        com.reservation_system.model.Researcher researcher18 = new com.reservation_system.model.Researcher(5, "hi!", "labmanager", "Guest", false);
        userRepository12.addUser((com.reservation_system.model.User) researcher18);
        java.util.List<com.reservation_system.model.User> userList20 = userRepository12.getAllUsers();
        com.reservation_system.repository.UserRepository userRepository22 = new com.reservation_system.repository.UserRepository("data/test-userrepo.csv");
        com.reservation_system.model.Researcher researcher28 = new com.reservation_system.model.Researcher(5, "hi!", "labmanager", "Guest", false);
        userRepository22.addUser((com.reservation_system.model.User) researcher28);
        java.util.Optional<com.reservation_system.model.User> userOptional31 = userRepository22.findByEmail("alice@example.com");
        java.util.List<com.reservation_system.model.User> userList32 = userRepository22.getAllUsers();
        userRepository12.saveAllUsers(userList32);
        userRepository1.saveAllUsers(userList32);
        int int35 = userRepository1.getNextID();
        java.util.List<com.reservation_system.model.User> userList36 = userRepository1.getAllUsers();
        java.util.Optional<com.reservation_system.model.User> userOptional38 = userRepository1.findByEmail("Student");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 101 + "'", int2 == 101);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(userList20);
        org.junit.Assert.assertNotNull(userOptional31);
        org.junit.Assert.assertNotNull(userList32);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 101 + "'", int35 == 101);
        org.junit.Assert.assertNotNull(userList36);
        org.junit.Assert.assertNotNull(userOptional38);
    }

    @Test
    public void test2000() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test2000");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("data/test-userrepo.csv");
        com.reservation_system.model.Researcher researcher7 = new com.reservation_system.model.Researcher(5, "hi!", "labmanager", "Guest", false);
        userRepository1.addUser((com.reservation_system.model.User) researcher7);
        boolean boolean10 = userRepository1.emailExists("labmanager");
        com.reservation_system.model.LabManager labManager16 = new com.reservation_system.model.LabManager((int) (byte) -1, "faculty", "Student", "data/test-userrepo.csv", true);
        userRepository1.addUser((com.reservation_system.model.User) labManager16);
        java.util.Optional<com.reservation_system.model.User> userOptional19 = userRepository1.findByEmail("student");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(userOptional19);
    }
}
