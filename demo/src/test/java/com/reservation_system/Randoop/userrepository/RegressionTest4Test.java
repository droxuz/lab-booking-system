package com.reservation_system.Randoop.userrepository;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest4Test {

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
    public void test2001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2001");
        com.reservation_system.model.Researcher researcher5 = new com.reservation_system.model.Researcher((int) (byte) -1, "Student", "", "data/test-userrepo.csv", true);
    }

    @Test
    public void test2002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2002");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("data/test-userrepo.csv");
        boolean boolean3 = userRepository1.emailExists("Alice");
        int int4 = userRepository1.getNextID();
        boolean boolean5 = userRepository1.headLabCoordinatorExists();
        boolean boolean6 = userRepository1.headLabCoordinatorExists();
        boolean boolean7 = userRepository1.headLabCoordinatorExists();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
// flaky "1) test2002(com.reservation_system.randoop.userrepository.RegressionTest4)":         org.junit.Assert.assertTrue("'" + int4 + "' != '" + 101 + "'", int4 == 101);
// flaky "1) test2002(com.reservation_system.randoop.userrepository.RegressionTest4)":         org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
// flaky "1) test2002(com.reservation_system.randoop.userrepository.RegressionTest4)":         org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
// flaky "1) test2002(com.reservation_system.randoop.userrepository.RegressionTest4)":         org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test2003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2003");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("data/test-userrepo.csv");
        boolean boolean3 = userRepository1.emailExists("Password1!");
        boolean boolean5 = userRepository1.emailExists("hi!");
        com.reservation_system.model.Student student11 = new com.reservation_system.model.Student((int) (short) -1, "alice@example.com", "student", "student", true);
        boolean boolean12 = student11.requiresDepartmentApproval();
        userRepository1.addUser((com.reservation_system.model.User) student11);
        boolean boolean15 = userRepository1.emailExists("Student");
        java.util.Optional<com.reservation_system.model.User> userOptional17 = userRepository1.findByEmail("Alice");
        boolean boolean18 = userRepository1.headLabCoordinatorExists();
// flaky "2) test2003(com.reservation_system.randoop.userrepository.RegressionTest4)":         org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
// flaky "2) test2003(com.reservation_system.randoop.userrepository.RegressionTest4)":         org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(userOptional17);
// flaky "2) test2003(com.reservation_system.randoop.userrepository.RegressionTest4)":         org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
    }

    @Test
    public void test2004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2004");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("data/test-userrepo.csv");
        com.reservation_system.model.Researcher researcher7 = new com.reservation_system.model.Researcher(5, "hi!", "labmanager", "Guest", false);
        userRepository1.addUser((com.reservation_system.model.User) researcher7);
        boolean boolean10 = userRepository1.emailExists("headlabcoordinator");
        boolean boolean12 = userRepository1.emailExists("guest");
        java.util.Optional<com.reservation_system.model.User> userOptional14 = userRepository1.findByEmail("Faculty");
        com.reservation_system.model.LabManager labManager20 = new com.reservation_system.model.LabManager(10, "Password1!", "data/test-userrepo.csv", "Guest", true);
        java.lang.String str21 = labManager20.getUserType();
        boolean boolean22 = labManager20.requiresDepartmentApproval();
        boolean boolean23 = labManager20.isApproved();
        java.lang.String str24 = labManager20.getUserType();
        java.lang.String str25 = labManager20.getUserType();
        boolean boolean26 = labManager20.requiresDepartmentApproval();
        userRepository1.addUser((com.reservation_system.model.User) labManager20);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
// flaky "3) test2004(com.reservation_system.randoop.userrepository.RegressionTest4)":         org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(userOptional14);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "labmanager" + "'", str21, "labmanager");
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "labmanager" + "'", str24, "labmanager");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "labmanager" + "'", str25, "labmanager");
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
    }

    @Test
    public void test2005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2005");
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
        com.reservation_system.model.Researcher researcher21 = new com.reservation_system.model.Researcher(101, "data/test-userrepo.csv", "Faculty", "Researcher", false);
        java.lang.String str22 = researcher21.getEmail();
        userRepository1.addUser((com.reservation_system.model.User) researcher21);
        org.junit.Assert.assertNotNull(userList2);
// flaky "4) test2005(com.reservation_system.randoop.userrepository.RegressionTest4)":         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 101 + "'", int3 == 101);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
// flaky "3) test2005(com.reservation_system.randoop.userrepository.RegressionTest4)":         org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(userOptional8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
// flaky "3) test2005(com.reservation_system.randoop.userrepository.RegressionTest4)":         org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(userList15);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "Faculty" + "'", str22, "Faculty");
    }

    @Test
    public void test2006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2006");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("data/test-userrepo.csv");
        int int2 = userRepository1.getNextID();
        int int3 = userRepository1.getNextID();
        com.reservation_system.model.HeadLabCoordinator headLabCoordinator9 = new com.reservation_system.model.HeadLabCoordinator((int) (byte) 1, "", "", "guest", false);
        userRepository1.addUser((com.reservation_system.model.User) headLabCoordinator9);
        java.lang.String str11 = headLabCoordinator9.getEmail();
        java.lang.String str12 = headLabCoordinator9.getUserType();
        java.lang.String str13 = headLabCoordinator9.getUserType();
        int int14 = headLabCoordinator9.getID();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 102 + "'", int2 == 102);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 102 + "'", int3 == 102);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "headlabcoordinator" + "'", str12, "headlabcoordinator");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "headlabcoordinator" + "'", str13, "headlabcoordinator");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
    }

    @Test
    public void test2007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2007");
        com.reservation_system.model.Student student5 = new com.reservation_system.model.Student((int) (byte) 100, "alice@example.com", "headlabcoordinator", "headlabcoordinator", true);
    }

    @Test
    public void test2008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2008");
        com.reservation_system.model.HeadLabCoordinator headLabCoordinator5 = new com.reservation_system.model.HeadLabCoordinator((int) (byte) 100, "Password1!", "student", "student", true);
    }

    @Test
    public void test2009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2009");
        com.reservation_system.model.User user6 = com.reservation_system.patterns.factory.UserFactory.createUser("Researcher", 5, "alice@example.com", "Student", "researcher", false);
        java.lang.String str7 = user6.getEmail();
        java.lang.String str8 = user6.getEmail();
        org.junit.Assert.assertNotNull(user6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Student" + "'", str7, "Student");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Student" + "'", str8, "Student");
    }

    @Test
    public void test2010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2010");
        com.reservation_system.model.LabManager labManager5 = new com.reservation_system.model.LabManager(99, "student", "alice@example.com", "researcher", false);
    }

    @Test
    public void test2011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2011");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("data/test-userrepo.csv");
        com.reservation_system.model.Researcher researcher7 = new com.reservation_system.model.Researcher(5, "hi!", "labmanager", "Guest", false);
        userRepository1.addUser((com.reservation_system.model.User) researcher7);
        java.util.List<com.reservation_system.model.User> userList9 = userRepository1.getAllUsers();
        com.reservation_system.repository.UserRepository userRepository11 = new com.reservation_system.repository.UserRepository("data/test-userrepo.csv");
        com.reservation_system.model.Researcher researcher17 = new com.reservation_system.model.Researcher(5, "hi!", "labmanager", "Guest", false);
        userRepository11.addUser((com.reservation_system.model.User) researcher17);
        java.util.List<com.reservation_system.model.User> userList19 = userRepository11.getAllUsers();
        userRepository1.saveAllUsers(userList19);
        boolean boolean22 = userRepository1.emailExists("alice@example.com");
        org.junit.Assert.assertNotNull(userList9);
        org.junit.Assert.assertNotNull(userList19);
// flaky "5) test2011(com.reservation_system.randoop.userrepository.RegressionTest4)":         org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
    }

    @Test
    public void test2012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2012");
        com.reservation_system.model.LabManager labManager5 = new com.reservation_system.model.LabManager((int) (short) 10, "researcher", "Guest", "", false);
        java.lang.String str6 = labManager5.getUserType();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "labmanager" + "'", str6, "labmanager");
    }

    @Test
    public void test2013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2013");
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
        java.util.Optional<com.reservation_system.model.User> userOptional29 = userRepository1.findByEmail("Student");
        org.junit.Assert.assertNotNull(userList9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
// flaky "6) test2013(com.reservation_system.randoop.userrepository.RegressionTest4)":         org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(userOptional14);
        org.junit.Assert.assertNotNull(userOptional16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "labmanager" + "'", str25, "labmanager");
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(userOptional29);
    }

    @Test
    public void test2014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2014");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("data/test-userrepo.csv");
        java.util.List<com.reservation_system.model.User> userList2 = userRepository1.getAllUsers();
        int int3 = userRepository1.getNextID();
        boolean boolean5 = userRepository1.emailExists("headlabcoordinator");
        boolean boolean6 = userRepository1.headLabCoordinatorExists();
        java.util.Optional<com.reservation_system.model.User> userOptional8 = userRepository1.findByEmail("Alice");
        boolean boolean10 = userRepository1.emailExists("");
        java.util.Optional<com.reservation_system.model.User> userOptional12 = userRepository1.findByEmail("student");
        com.reservation_system.repository.UserRepository userRepository14 = new com.reservation_system.repository.UserRepository("data/test-userrepo.csv");
        int int15 = userRepository14.getNextID();
        boolean boolean16 = userRepository14.headLabCoordinatorExists();
        com.reservation_system.model.Guest guest22 = new com.reservation_system.model.Guest((int) (byte) -1, "hi!", "", "Password1!", false);
        userRepository14.addUser((com.reservation_system.model.User) guest22);
        int int24 = userRepository14.getNextID();
        boolean boolean26 = userRepository14.emailExists("headlabcoordinator");
        boolean boolean27 = userRepository14.headLabCoordinatorExists();
        com.reservation_system.repository.UserRepository userRepository29 = new com.reservation_system.repository.UserRepository("data/test-userrepo.csv");
        boolean boolean31 = userRepository29.emailExists("Password1!");
        boolean boolean33 = userRepository29.emailExists("hi!");
        java.util.List<com.reservation_system.model.User> userList34 = userRepository29.getAllUsers();
        userRepository14.saveAllUsers(userList34);
        userRepository1.saveAllUsers(userList34);
        org.junit.Assert.assertNotNull(userList2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 102 + "'", int3 == 102);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(userOptional8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(userOptional12);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 102 + "'", int15 == 102);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 102 + "'", int24 == 102);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
// flaky "7) test2014(com.reservation_system.randoop.userrepository.RegressionTest4)":         org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
// flaky "4) test2014(com.reservation_system.randoop.userrepository.RegressionTest4)":         org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertNotNull(userList34);
    }

    @Test
    public void test2015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2015");
        com.reservation_system.model.Faculty faculty5 = new com.reservation_system.model.Faculty((int) (byte) -1, "Alice", "researcher", "Password1!", false);
        java.lang.String str6 = faculty5.getName();
        int int7 = faculty5.getID();
        java.lang.String str8 = faculty5.getUserType();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Alice" + "'", str6, "Alice");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Faculty" + "'", str8, "Faculty");
    }

    @Test
    public void test2016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2016");
        com.reservation_system.model.Guest guest5 = new com.reservation_system.model.Guest((int) (byte) -1, "Student", "Guest", "Password1!", true);
    }

    @Test
    public void test2017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2017");
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
        java.util.List<com.reservation_system.model.User> userList24 = userRepository1.getAllUsers();
        java.util.List<com.reservation_system.model.User> userList25 = userRepository1.getAllUsers();
        boolean boolean27 = userRepository1.emailExists("hi!");
        org.junit.Assert.assertNotNull(userList9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
// flaky "8) test2017(com.reservation_system.randoop.userrepository.RegressionTest4)":         org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(userList19);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 102 + "'", int20 == 102);
        org.junit.Assert.assertNotNull(userList21);
        org.junit.Assert.assertNotNull(userList24);
        org.junit.Assert.assertNotNull(userList25);
// flaky "5) test2017(com.reservation_system.randoop.userrepository.RegressionTest4)":         org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
    }

    @Test
    public void test2018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2018");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("data/test-userrepo.csv");
        boolean boolean3 = userRepository1.emailExists("Alice");
        com.reservation_system.model.Researcher researcher9 = new com.reservation_system.model.Researcher((int) 'a', "labmanager", "faculty", "", false);
        boolean boolean10 = researcher9.isApproved();
        java.lang.String str11 = researcher9.getName();
        userRepository1.addUser((com.reservation_system.model.User) researcher9);
        boolean boolean14 = userRepository1.emailExists("Faculty");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "labmanager" + "'", str11, "labmanager");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test2019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2019");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("data/test-userrepo.csv");
        java.util.Optional<com.reservation_system.model.User> userOptional3 = userRepository1.findByEmail("hi!");
        boolean boolean4 = userRepository1.headLabCoordinatorExists();
        java.util.Optional<com.reservation_system.model.User> userOptional6 = userRepository1.findByEmail("");
        boolean boolean8 = userRepository1.emailExists("Faculty");
        com.reservation_system.repository.UserRepository userRepository10 = new com.reservation_system.repository.UserRepository("data/test-userrepo.csv");
        java.util.List<com.reservation_system.model.User> userList11 = userRepository10.getAllUsers();
        int int12 = userRepository10.getNextID();
        boolean boolean14 = userRepository10.emailExists("headlabcoordinator");
        java.util.Optional<com.reservation_system.model.User> userOptional16 = userRepository10.findByEmail("student");
        com.reservation_system.repository.UserRepository userRepository18 = new com.reservation_system.repository.UserRepository("data/test-userrepo.csv");
        java.util.List<com.reservation_system.model.User> userList19 = userRepository18.getAllUsers();
        int int20 = userRepository18.getNextID();
        boolean boolean22 = userRepository18.emailExists("headlabcoordinator");
        boolean boolean23 = userRepository18.headLabCoordinatorExists();
        java.util.Optional<com.reservation_system.model.User> userOptional25 = userRepository18.findByEmail("Alice");
        boolean boolean27 = userRepository18.emailExists("guest");
        java.util.List<com.reservation_system.model.User> userList28 = userRepository18.getAllUsers();
        java.util.Optional<com.reservation_system.model.User> userOptional30 = userRepository18.findByEmail("Guest");
        java.util.List<com.reservation_system.model.User> userList31 = userRepository18.getAllUsers();
        com.reservation_system.repository.UserRepository userRepository33 = new com.reservation_system.repository.UserRepository("data/test-userrepo.csv");
        int int34 = userRepository33.getNextID();
        int int35 = userRepository33.getNextID();
        com.reservation_system.model.HeadLabCoordinator headLabCoordinator41 = new com.reservation_system.model.HeadLabCoordinator((int) (byte) 1, "", "", "guest", false);
        userRepository33.addUser((com.reservation_system.model.User) headLabCoordinator41);
        java.util.List<com.reservation_system.model.User> userList43 = userRepository33.getAllUsers();
        boolean boolean45 = userRepository33.emailExists("Faculty");
        java.util.List<com.reservation_system.model.User> userList46 = userRepository33.getAllUsers();
        userRepository18.saveAllUsers(userList46);
        userRepository10.saveAllUsers(userList46);
        userRepository1.saveAllUsers(userList46);
        org.junit.Assert.assertNotNull(userOptional3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(userOptional6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(userList11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 102 + "'", int12 == 102);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(userOptional16);
        org.junit.Assert.assertNotNull(userList19);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 102 + "'", int20 == 102);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertNotNull(userOptional25);
// flaky "9) test2019(com.reservation_system.randoop.userrepository.RegressionTest4)":         org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertNotNull(userList28);
        org.junit.Assert.assertNotNull(userOptional30);
        org.junit.Assert.assertNotNull(userList31);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 102 + "'", int34 == 102);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 102 + "'", int35 == 102);
        org.junit.Assert.assertNotNull(userList43);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + true + "'", boolean45 == true);
        org.junit.Assert.assertNotNull(userList46);
    }

    @Test
    public void test2020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2020");
        com.reservation_system.model.Guest guest5 = new com.reservation_system.model.Guest(1, "data/test-userrepo.csv", "hi!", "alice@example.com", true);
    }

    @Test
    public void test2021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2021");
        com.reservation_system.model.Faculty faculty5 = new com.reservation_system.model.Faculty((int) (byte) -1, "faculty", "data/test-userrepo.csv", "Student", false);
        java.lang.String str6 = faculty5.getEmail();
        boolean boolean7 = faculty5.requiresDepartmentApproval();
        int int8 = faculty5.getID();
        java.lang.String str9 = faculty5.getPassword();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "data/test-userrepo.csv" + "'", str6, "data/test-userrepo.csv");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Student" + "'", str9, "Student");
    }

    @Test
    public void test2022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2022");
        com.reservation_system.model.LabManager labManager5 = new com.reservation_system.model.LabManager(102, "Alice", "Alice", "Guest", false);
    }

    @Test
    public void test2023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2023");
        com.reservation_system.model.LabManager labManager5 = new com.reservation_system.model.LabManager(99, "guest", "headlabcoordinator", "labmanager", true);
    }

    @Test
    public void test2024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2024");
        com.reservation_system.model.Researcher researcher5 = new com.reservation_system.model.Researcher(101, "student", "alice@example.com", "Password1!", false);
        boolean boolean6 = researcher5.isApproved();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test2025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2025");
        com.reservation_system.model.LabManager labManager5 = new com.reservation_system.model.LabManager(10, "Password1!", "data/test-userrepo.csv", "Guest", true);
        boolean boolean6 = labManager5.requiresDepartmentApproval();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test2026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2026");
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
        com.reservation_system.model.LabManager labManager21 = new com.reservation_system.model.LabManager((int) '#', "researcher", "Guest", "headlabcoordinator", true);
        java.lang.String str22 = labManager21.getEmail();
        java.lang.String str23 = labManager21.getUserType();
        java.lang.String str24 = labManager21.getUserType();
        labManager21.setApproved(true);
        userRepository1.addUser((com.reservation_system.model.User) labManager21);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 102 + "'", int2 == 102);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 102 + "'", int3 == 102);
        org.junit.Assert.assertNotNull(userList4);
        org.junit.Assert.assertNotNull(userList5);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "headlabcoordinator" + "'", str12, "headlabcoordinator");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "headlabcoordinator" + "'", str13, "headlabcoordinator");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Faculty" + "'", str14, "Faculty");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "Guest" + "'", str22, "Guest");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "labmanager" + "'", str23, "labmanager");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "labmanager" + "'", str24, "labmanager");
    }

    @Test
    public void test2027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2027");
        com.reservation_system.model.Faculty faculty5 = new com.reservation_system.model.Faculty((int) (byte) 10, "Faculty", "faculty", "alice@example.com", false);
    }

    @Test
    public void test2028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2028");
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
        com.reservation_system.repository.UserRepository userRepository26 = new com.reservation_system.repository.UserRepository("data/test-userrepo.csv");
        com.reservation_system.model.Researcher researcher32 = new com.reservation_system.model.Researcher(5, "hi!", "labmanager", "Guest", false);
        userRepository26.addUser((com.reservation_system.model.User) researcher32);
        boolean boolean35 = userRepository26.emailExists("headlabcoordinator");
        boolean boolean37 = userRepository26.emailExists("Guest");
        java.util.List<com.reservation_system.model.User> userList38 = userRepository26.getAllUsers();
        userRepository1.saveAllUsers(userList38);
        com.reservation_system.model.HeadLabCoordinator headLabCoordinator45 = new com.reservation_system.model.HeadLabCoordinator((int) (byte) 10, "Alice", "guest", "alice@example.com", true);
        userRepository1.addUser((com.reservation_system.model.User) headLabCoordinator45);
        com.reservation_system.model.User user47 = null;
        // The following exception was thrown during execution in test generation
        try {
            userRepository1.addUser(user47);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "labmanager" + "'", str11, "labmanager");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 102 + "'", int14 == 102);
        org.junit.Assert.assertNotNull(user21);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 102 + "'", int23 == 102);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 102 + "'", int24 == 102);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
        org.junit.Assert.assertNotNull(userList38);
    }

    @Test
    public void test2029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2029");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("data/test-userrepo.csv");
        java.util.List<com.reservation_system.model.User> userList2 = userRepository1.getAllUsers();
        int int3 = userRepository1.getNextID();
        boolean boolean5 = userRepository1.emailExists("headlabcoordinator");
        boolean boolean6 = userRepository1.headLabCoordinatorExists();
        java.util.Optional<com.reservation_system.model.User> userOptional8 = userRepository1.findByEmail("Alice");
        boolean boolean10 = userRepository1.emailExists("Alice");
        boolean boolean12 = userRepository1.emailExists("Guest");
        boolean boolean14 = userRepository1.emailExists("");
        java.util.List<com.reservation_system.model.User> userList15 = userRepository1.getAllUsers();
        org.junit.Assert.assertNotNull(userList2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 102 + "'", int3 == 102);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(userOptional8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(userList15);
    }

    @Test
    public void test2030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2030");
        com.reservation_system.model.Researcher researcher5 = new com.reservation_system.model.Researcher(52, "Password1!", "researcher", "faculty", false);
        java.lang.String str6 = researcher5.getUserType();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Researcher" + "'", str6, "Researcher");
    }

    @Test
    public void test2031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2031");
        // The following exception was thrown during execution in test generation
        try {
            com.reservation_system.model.User user6 = com.reservation_system.patterns.factory.UserFactory.createUser("", 5, "data/test-userrepo.csv", "Password1!", "researcher", true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid user type: ");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2032");
        com.reservation_system.model.LabManager labManager5 = new com.reservation_system.model.LabManager(0, "data/test-userrepo.csv", "labmanager", "researcher", false);
        java.lang.String str6 = labManager5.getEmail();
        java.lang.String str7 = labManager5.getUserType();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "labmanager" + "'", str6, "labmanager");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "labmanager" + "'", str7, "labmanager");
    }

    @Test
    public void test2033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2033");
        com.reservation_system.model.Guest guest5 = new com.reservation_system.model.Guest(5, "headlabcoordinator", "", "faculty", true);
    }

    @Test
    public void test2034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2034");
        com.reservation_system.model.Student student5 = new com.reservation_system.model.Student((int) (byte) 10, "faculty", "guest", "Alice", false);
        student5.setApproved(false);
    }

    @Test
    public void test2035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2035");
        com.reservation_system.model.Researcher researcher5 = new com.reservation_system.model.Researcher(99, "headlabcoordinator", "researcher", "", false);
        java.lang.String str6 = researcher5.getName();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "headlabcoordinator" + "'", str6, "headlabcoordinator");
    }

    @Test
    public void test2036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2036");
        com.reservation_system.model.Guest guest5 = new com.reservation_system.model.Guest((int) 'a', "Password1!", "guest", "faculty", true);
    }

    @Test
    public void test2037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2037");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("data/test-userrepo.csv");
        java.util.List<com.reservation_system.model.User> userList2 = userRepository1.getAllUsers();
        int int3 = userRepository1.getNextID();
        boolean boolean5 = userRepository1.emailExists("headlabcoordinator");
        boolean boolean6 = userRepository1.headLabCoordinatorExists();
        java.util.Optional<com.reservation_system.model.User> userOptional8 = userRepository1.findByEmail("Alice");
        java.util.Optional<com.reservation_system.model.User> userOptional10 = userRepository1.findByEmail("Student");
        com.reservation_system.model.Guest guest16 = new com.reservation_system.model.Guest((-1), "Alice", "guest", "hi!", false);
        userRepository1.addUser((com.reservation_system.model.User) guest16);
        java.lang.Class<?> wildcardClass18 = guest16.getClass();
        org.junit.Assert.assertNotNull(userList2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 102 + "'", int3 == 102);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(userOptional8);
        org.junit.Assert.assertNotNull(userOptional10);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test2038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2038");
        com.reservation_system.model.Researcher researcher5 = new com.reservation_system.model.Researcher(5, "researcher", "researcher", "Student", true);
        java.lang.String str6 = researcher5.getUserType();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Researcher" + "'", str6, "Researcher");
    }

    @Test
    public void test2039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2039");
        com.reservation_system.model.Guest guest5 = new com.reservation_system.model.Guest(101, "alice@example.com", "student", "Alice", true);
    }

    @Test
    public void test2040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2040");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("data/test-userrepo.csv");
        java.util.List<com.reservation_system.model.User> userList2 = userRepository1.getAllUsers();
        int int3 = userRepository1.getNextID();
        boolean boolean5 = userRepository1.emailExists("headlabcoordinator");
        java.util.Optional<com.reservation_system.model.User> userOptional7 = userRepository1.findByEmail("student");
        com.reservation_system.repository.UserRepository userRepository9 = new com.reservation_system.repository.UserRepository("data/test-userrepo.csv");
        java.util.List<com.reservation_system.model.User> userList10 = userRepository9.getAllUsers();
        userRepository1.saveAllUsers(userList10);
        boolean boolean12 = userRepository1.headLabCoordinatorExists();
        com.reservation_system.repository.UserRepository userRepository14 = new com.reservation_system.repository.UserRepository("data/test-userrepo.csv");
        java.util.List<com.reservation_system.model.User> userList15 = userRepository14.getAllUsers();
        int int16 = userRepository14.getNextID();
        boolean boolean18 = userRepository14.emailExists("headlabcoordinator");
        boolean boolean19 = userRepository14.headLabCoordinatorExists();
        java.util.Optional<com.reservation_system.model.User> userOptional21 = userRepository14.findByEmail("Alice");
        boolean boolean22 = userRepository14.headLabCoordinatorExists();
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
        com.reservation_system.repository.UserRepository userRepository56 = new com.reservation_system.repository.UserRepository("data/test-userrepo.csv");
        boolean boolean58 = userRepository56.emailExists("Alice");
        com.reservation_system.repository.UserRepository userRepository60 = new com.reservation_system.repository.UserRepository("data/test-userrepo.csv");
        java.util.List<com.reservation_system.model.User> userList61 = userRepository60.getAllUsers();
        int int62 = userRepository60.getNextID();
        java.util.List<com.reservation_system.model.User> userList63 = userRepository60.getAllUsers();
        userRepository56.saveAllUsers(userList63);
        userRepository24.saveAllUsers(userList63);
        userRepository14.saveAllUsers(userList63);
        userRepository1.saveAllUsers(userList63);
        org.junit.Assert.assertNotNull(userList2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 102 + "'", int3 == 102);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(userOptional7);
        org.junit.Assert.assertNotNull(userList10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(userList15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 102 + "'", int16 == 102);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNotNull(userOptional21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertNotNull(userList32);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 102 + "'", int43 == 102);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertNotNull(userList50);
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + 102 + "'", int51 == 102);
        org.junit.Assert.assertNotNull(userList52);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + false + "'", boolean58 == false);
        org.junit.Assert.assertNotNull(userList61);
        org.junit.Assert.assertTrue("'" + int62 + "' != '" + 102 + "'", int62 == 102);
        org.junit.Assert.assertNotNull(userList63);
    }

    @Test
    public void test2041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2041");
        com.reservation_system.model.User user6 = com.reservation_system.patterns.factory.UserFactory.createUser("Guest", (int) '#', "faculty", "alice@example.com", "", true);
        user6.setApproved(false);
        org.junit.Assert.assertNotNull(user6);
    }

    @Test
    public void test2042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2042");
        com.reservation_system.model.Researcher researcher5 = new com.reservation_system.model.Researcher(100, "student", "guest", "headlabcoordinator", false);
        java.lang.String str6 = researcher5.getUserType();
        java.lang.String str7 = researcher5.getEmail();
        java.lang.String str8 = researcher5.getName();
        java.lang.String str9 = researcher5.getEmail();
        java.lang.String str10 = researcher5.getUserType();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Researcher" + "'", str6, "Researcher");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "guest" + "'", str7, "guest");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "student" + "'", str8, "student");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "guest" + "'", str9, "guest");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Researcher" + "'", str10, "Researcher");
    }

    @Test
    public void test2043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2043");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("data/test-userrepo.csv");
        java.util.List<com.reservation_system.model.User> userList2 = userRepository1.getAllUsers();
        int int3 = userRepository1.getNextID();
        boolean boolean5 = userRepository1.emailExists("headlabcoordinator");
        boolean boolean6 = userRepository1.headLabCoordinatorExists();
        java.util.Optional<com.reservation_system.model.User> userOptional8 = userRepository1.findByEmail("Alice");
        boolean boolean10 = userRepository1.emailExists("guest");
        java.util.List<com.reservation_system.model.User> userList11 = userRepository1.getAllUsers();
        java.util.Optional<com.reservation_system.model.User> userOptional13 = userRepository1.findByEmail("Guest");
        java.util.List<com.reservation_system.model.User> userList14 = userRepository1.getAllUsers();
        com.reservation_system.repository.UserRepository userRepository16 = new com.reservation_system.repository.UserRepository("data/test-userrepo.csv");
        int int17 = userRepository16.getNextID();
        int int18 = userRepository16.getNextID();
        com.reservation_system.model.HeadLabCoordinator headLabCoordinator24 = new com.reservation_system.model.HeadLabCoordinator((int) (byte) 1, "", "", "guest", false);
        userRepository16.addUser((com.reservation_system.model.User) headLabCoordinator24);
        java.util.List<com.reservation_system.model.User> userList26 = userRepository16.getAllUsers();
        boolean boolean28 = userRepository16.emailExists("Faculty");
        java.util.List<com.reservation_system.model.User> userList29 = userRepository16.getAllUsers();
        userRepository1.saveAllUsers(userList29);
        int int31 = userRepository1.getNextID();
        org.junit.Assert.assertNotNull(userList2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 102 + "'", int3 == 102);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(userOptional8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(userList11);
        org.junit.Assert.assertNotNull(userOptional13);
        org.junit.Assert.assertNotNull(userList14);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 102 + "'", int17 == 102);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 102 + "'", int18 == 102);
        org.junit.Assert.assertNotNull(userList26);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertNotNull(userList29);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 102 + "'", int31 == 102);
    }

    @Test
    public void test2044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2044");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("data/test-userrepo.csv");
        com.reservation_system.model.Researcher researcher7 = new com.reservation_system.model.Researcher(5, "hi!", "labmanager", "Guest", false);
        userRepository1.addUser((com.reservation_system.model.User) researcher7);
        java.util.Optional<com.reservation_system.model.User> userOptional10 = userRepository1.findByEmail("alice@example.com");
        java.util.List<com.reservation_system.model.User> userList11 = userRepository1.getAllUsers();
        java.util.Optional<com.reservation_system.model.User> userOptional13 = userRepository1.findByEmail("Password1!");
        boolean boolean15 = userRepository1.emailExists("guest");
        com.reservation_system.repository.UserRepository userRepository17 = new com.reservation_system.repository.UserRepository("data/test-userrepo.csv");
        com.reservation_system.model.Researcher researcher23 = new com.reservation_system.model.Researcher(5, "hi!", "labmanager", "Guest", false);
        userRepository17.addUser((com.reservation_system.model.User) researcher23);
        java.util.List<com.reservation_system.model.User> userList25 = userRepository17.getAllUsers();
        com.reservation_system.model.Guest guest31 = new com.reservation_system.model.Guest(0, "Password1!", "data/test-userrepo.csv", "researcher", false);
        boolean boolean32 = guest31.requiresDepartmentApproval();
        userRepository17.addUser((com.reservation_system.model.User) guest31);
        boolean boolean35 = userRepository17.emailExists("Alice");
        int int36 = userRepository17.getNextID();
        com.reservation_system.repository.UserRepository userRepository38 = new com.reservation_system.repository.UserRepository("data/test-userrepo.csv");
        java.util.List<com.reservation_system.model.User> userList39 = userRepository38.getAllUsers();
        userRepository17.saveAllUsers(userList39);
        userRepository1.saveAllUsers(userList39);
        org.junit.Assert.assertNotNull(userOptional10);
        org.junit.Assert.assertNotNull(userList11);
        org.junit.Assert.assertNotNull(userOptional13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(userList25);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 102 + "'", int36 == 102);
        org.junit.Assert.assertNotNull(userList39);
    }

    @Test
    public void test2045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2045");
        com.reservation_system.model.Researcher researcher5 = new com.reservation_system.model.Researcher(33, "labmanager", "data/test-userrepo.csv", "hi!", true);
    }

    @Test
    public void test2046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2046");
        com.reservation_system.model.Student student5 = new com.reservation_system.model.Student((int) '4', "student", "data/test-userrepo.csv", "Guest", false);
        java.lang.String str6 = student5.getPassword();
        java.lang.String str7 = student5.getName();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Guest" + "'", str6, "Guest");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "student" + "'", str7, "student");
    }

    @Test
    public void test2047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2047");
        com.reservation_system.model.Guest guest5 = new com.reservation_system.model.Guest((int) (byte) 10, "labmanager", "student", "Faculty", false);
        java.lang.String str6 = guest5.getUserType();
        java.lang.String str7 = guest5.getPassword();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Guest" + "'", str6, "Guest");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Faculty" + "'", str7, "Faculty");
    }

    @Test
    public void test2048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2048");
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
        com.reservation_system.model.LabManager labManager37 = new com.reservation_system.model.LabManager(10, "Password1!", "data/test-userrepo.csv", "Guest", true);
        java.lang.String str38 = labManager37.getUserType();
        boolean boolean39 = labManager37.requiresDepartmentApproval();
        boolean boolean40 = labManager37.isApproved();
        java.lang.String str41 = labManager37.getUserType();
        java.lang.String str42 = labManager37.getUserType();
        userRepository1.addUser((com.reservation_system.model.User) labManager37);
        com.reservation_system.model.Faculty faculty49 = new com.reservation_system.model.Faculty((int) '4', "Researcher", "Guest", "hi!", true);
        java.lang.String str50 = faculty49.getEmail();
        userRepository1.addUser((com.reservation_system.model.User) faculty49);
        org.junit.Assert.assertNotNull(userList9);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 102 + "'", int20 == 102);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(userList27);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 102 + "'", int28 == 102);
        org.junit.Assert.assertNotNull(userList29);
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "labmanager" + "'", str38, "labmanager");
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + true + "'", boolean40 == true);
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "labmanager" + "'", str41, "labmanager");
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "labmanager" + "'", str42, "labmanager");
        org.junit.Assert.assertEquals("'" + str50 + "' != '" + "Guest" + "'", str50, "Guest");
    }

    @Test
    public void test2049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2049");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("data/test-userrepo.csv");
        boolean boolean3 = userRepository1.emailExists("Alice");
        com.reservation_system.model.Faculty faculty9 = new com.reservation_system.model.Faculty((int) (byte) -1, "Alice", "researcher", "Password1!", false);
        java.lang.String str10 = faculty9.getName();
        java.lang.String str11 = faculty9.getUserType();
        java.lang.String str12 = faculty9.getUserType();
        faculty9.setApproved(false);
        userRepository1.addUser((com.reservation_system.model.User) faculty9);
        java.lang.Class<?> wildcardClass16 = faculty9.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Alice" + "'", str10, "Alice");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Faculty" + "'", str11, "Faculty");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Faculty" + "'", str12, "Faculty");
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test2050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2050");
        com.reservation_system.model.User user6 = com.reservation_system.patterns.factory.UserFactory.createUser("guest", (int) (byte) 10, "researcher", "", "", false);
        org.junit.Assert.assertNotNull(user6);
    }

    @Test
    public void test2051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2051");
        com.reservation_system.model.Researcher researcher5 = new com.reservation_system.model.Researcher((int) (byte) 1, "Faculty", "headlabcoordinator", "guest", true);
        boolean boolean6 = researcher5.requiresDepartmentApproval();
        boolean boolean7 = researcher5.requiresDepartmentApproval();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test2052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2052");
        com.reservation_system.model.Student student5 = new com.reservation_system.model.Student(98, "alice@example.com", "student", "Alice", false);
    }

    @Test
    public void test2053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2053");
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
        java.util.Optional<com.reservation_system.model.User> userOptional24 = userRepository1.findByEmail("labmanager");
        int int25 = userRepository1.getNextID();
        org.junit.Assert.assertNotNull(userList9);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(userOptional21);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 102 + "'", int22 == 102);
        org.junit.Assert.assertNotNull(userOptional24);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 102 + "'", int25 == 102);
    }

    @Test
    public void test2054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2054");
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
        researcher21.setApproved(false);
        org.junit.Assert.assertNotNull(userList2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 102 + "'", int3 == 102);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(userOptional8);
        org.junit.Assert.assertNotNull(userList9);
        org.junit.Assert.assertNotNull(userList12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 102 + "'", int13 == 102);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test2055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2055");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("data/test-userrepo.csv");
        com.reservation_system.model.Faculty faculty7 = new com.reservation_system.model.Faculty(5, "researcher", "guest", "faculty", true);
        java.lang.String str8 = faculty7.getUserType();
        java.lang.String str9 = faculty7.getUserType();
        userRepository1.addUser((com.reservation_system.model.User) faculty7);
        boolean boolean11 = userRepository1.headLabCoordinatorExists();
        java.util.List<com.reservation_system.model.User> userList12 = userRepository1.getAllUsers();
        int int13 = userRepository1.getNextID();
        com.reservation_system.model.Faculty faculty19 = new com.reservation_system.model.Faculty((int) (short) 1, "alice@example.com", "Password1!", "Student", false);
        java.lang.String str20 = faculty19.getUserType();
        java.lang.String str21 = faculty19.getUserType();
        userRepository1.addUser((com.reservation_system.model.User) faculty19);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Faculty" + "'", str8, "Faculty");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Faculty" + "'", str9, "Faculty");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(userList12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 102 + "'", int13 == 102);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "Faculty" + "'", str20, "Faculty");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "Faculty" + "'", str21, "Faculty");
    }

    @Test
    public void test2056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2056");
        com.reservation_system.model.HeadLabCoordinator headLabCoordinator5 = new com.reservation_system.model.HeadLabCoordinator(0, "data/test-userrepo.csv", "student", "headlabcoordinator", false);
    }

    @Test
    public void test2057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2057");
        com.reservation_system.model.LabManager labManager5 = new com.reservation_system.model.LabManager(33, "faculty", "researcher", "Faculty", false);
    }

    @Test
    public void test2058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2058");
        com.reservation_system.model.Researcher researcher5 = new com.reservation_system.model.Researcher((int) (byte) 100, "Password1!", "hi!", "Student", false);
        int int6 = researcher5.getID();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
    }

    @Test
    public void test2059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2059");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("data/test-userrepo.csv");
        boolean boolean3 = userRepository1.emailExists("Alice");
        com.reservation_system.model.Faculty faculty9 = new com.reservation_system.model.Faculty((int) (byte) -1, "Alice", "researcher", "Password1!", false);
        java.lang.String str10 = faculty9.getName();
        java.lang.String str11 = faculty9.getUserType();
        java.lang.String str12 = faculty9.getUserType();
        faculty9.setApproved(false);
        userRepository1.addUser((com.reservation_system.model.User) faculty9);
        java.lang.String str16 = faculty9.getUserType();
        java.lang.String str17 = faculty9.getName();
        java.lang.String str18 = faculty9.getUserType();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Alice" + "'", str10, "Alice");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Faculty" + "'", str11, "Faculty");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Faculty" + "'", str12, "Faculty");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Faculty" + "'", str16, "Faculty");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "Alice" + "'", str17, "Alice");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Faculty" + "'", str18, "Faculty");
    }

    @Test
    public void test2060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2060");
        com.reservation_system.model.Faculty faculty5 = new com.reservation_system.model.Faculty(6, "hi!", "Student", "Student", true);
        boolean boolean6 = faculty5.requiresDepartmentApproval();
        java.lang.String str7 = faculty5.getPassword();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Student" + "'", str7, "Student");
    }

    @Test
    public void test2061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2061");
        com.reservation_system.model.Researcher researcher5 = new com.reservation_system.model.Researcher(100, "student", "guest", "headlabcoordinator", false);
        java.lang.String str6 = researcher5.getUserType();
        java.lang.String str7 = researcher5.getEmail();
        java.lang.String str8 = researcher5.getName();
        java.lang.String str9 = researcher5.getUserType();
        java.lang.String str10 = researcher5.getEmail();
        java.lang.String str11 = researcher5.getName();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Researcher" + "'", str6, "Researcher");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "guest" + "'", str7, "guest");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "student" + "'", str8, "student");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Researcher" + "'", str9, "Researcher");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "guest" + "'", str10, "guest");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "student" + "'", str11, "student");
    }

    @Test
    public void test2062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2062");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("data/test-userrepo.csv");
        boolean boolean3 = userRepository1.emailExists("Password1!");
        boolean boolean5 = userRepository1.emailExists("hi!");
        java.util.List<com.reservation_system.model.User> userList6 = userRepository1.getAllUsers();
        com.reservation_system.repository.UserRepository userRepository8 = new com.reservation_system.repository.UserRepository("data/test-userrepo.csv");
        java.util.List<com.reservation_system.model.User> userList9 = userRepository8.getAllUsers();
        int int10 = userRepository8.getNextID();
        java.util.List<com.reservation_system.model.User> userList11 = userRepository8.getAllUsers();
        userRepository1.saveAllUsers(userList11);
        int int13 = userRepository1.getNextID();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
// flaky "10) test2062(com.reservation_system.randoop.userrepository.RegressionTest4)":         org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(userList6);
        org.junit.Assert.assertNotNull(userList9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 102 + "'", int10 == 102);
        org.junit.Assert.assertNotNull(userList11);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 102 + "'", int13 == 102);
    }

    @Test
    public void test2063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2063");
        com.reservation_system.model.Student student5 = new com.reservation_system.model.Student((int) (byte) 0, "", "Researcher", "Password1!", false);
        java.lang.String str6 = student5.getUserType();
        java.lang.String str7 = student5.getName();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Student" + "'", str6, "Student");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
    }

    @Test
    public void test2064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2064");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("data/test-userrepo.csv");
        com.reservation_system.model.Researcher researcher7 = new com.reservation_system.model.Researcher(5, "hi!", "labmanager", "Guest", false);
        userRepository1.addUser((com.reservation_system.model.User) researcher7);
        java.util.List<com.reservation_system.model.User> userList9 = userRepository1.getAllUsers();
        boolean boolean11 = userRepository1.emailExists("hi!");
        com.reservation_system.model.LabManager labManager17 = new com.reservation_system.model.LabManager(1, "Researcher", "labmanager", "data/test-userrepo.csv", false);
        userRepository1.addUser((com.reservation_system.model.User) labManager17);
        com.reservation_system.model.LabManager labManager24 = new com.reservation_system.model.LabManager((int) (byte) 1, "Password1!", "hi!", "Alice", true);
        userRepository1.addUser((com.reservation_system.model.User) labManager24);
        java.lang.String str26 = labManager24.getUserType();
        org.junit.Assert.assertNotNull(userList9);
// flaky "11) test2064(com.reservation_system.randoop.userrepository.RegressionTest4)":         org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "labmanager" + "'", str26, "labmanager");
    }

    @Test
    public void test2065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2065");
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
        com.reservation_system.repository.UserRepository userRepository24 = new com.reservation_system.repository.UserRepository("data/test-userrepo.csv");
        int int25 = userRepository24.getNextID();
        int int26 = userRepository24.getNextID();
        java.util.List<com.reservation_system.model.User> userList27 = userRepository24.getAllUsers();
        com.reservation_system.repository.UserRepository userRepository29 = new com.reservation_system.repository.UserRepository("data/test-userrepo.csv");
        int int30 = userRepository29.getNextID();
        int int31 = userRepository29.getNextID();
        java.util.List<com.reservation_system.model.User> userList32 = userRepository29.getAllUsers();
        com.reservation_system.model.Guest guest38 = new com.reservation_system.model.Guest(0, "student", "", "alice@example.com", false);
        java.lang.String str39 = guest38.getEmail();
        userRepository29.addUser((com.reservation_system.model.User) guest38);
        boolean boolean41 = userRepository29.headLabCoordinatorExists();
        com.reservation_system.repository.UserRepository userRepository43 = new com.reservation_system.repository.UserRepository("data/test-userrepo.csv");
        java.util.List<com.reservation_system.model.User> userList44 = userRepository43.getAllUsers();
        int int45 = userRepository43.getNextID();
        java.util.List<com.reservation_system.model.User> userList46 = userRepository43.getAllUsers();
        userRepository29.saveAllUsers(userList46);
        userRepository24.saveAllUsers(userList46);
        userRepository1.saveAllUsers(userList46);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "labmanager" + "'", str11, "labmanager");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 102 + "'", int14 == 102);
        org.junit.Assert.assertNotNull(user21);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 102 + "'", int25 == 102);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 102 + "'", int26 == 102);
        org.junit.Assert.assertNotNull(userList27);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 102 + "'", int30 == 102);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 102 + "'", int31 == 102);
        org.junit.Assert.assertNotNull(userList32);
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "" + "'", str39, "");
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + true + "'", boolean41 == true);
        org.junit.Assert.assertNotNull(userList44);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 102 + "'", int45 == 102);
        org.junit.Assert.assertNotNull(userList46);
    }

    @Test
    public void test2066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2066");
        com.reservation_system.model.Researcher researcher5 = new com.reservation_system.model.Researcher(10, "data/test-userrepo.csv", "student", "data/test-userrepo.csv", false);
        java.lang.String str6 = researcher5.getUserType();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Researcher" + "'", str6, "Researcher");
    }

    @Test
    public void test2067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2067");
        com.reservation_system.model.Faculty faculty5 = new com.reservation_system.model.Faculty((int) (short) -1, "hi!", "headlabcoordinator", "Guest", true);
    }

    @Test
    public void test2068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2068");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("data/test-userrepo.csv");
        java.util.List<com.reservation_system.model.User> userList2 = userRepository1.getAllUsers();
        int int3 = userRepository1.getNextID();
        boolean boolean5 = userRepository1.emailExists("headlabcoordinator");
        boolean boolean6 = userRepository1.headLabCoordinatorExists();
        java.util.Optional<com.reservation_system.model.User> userOptional8 = userRepository1.findByEmail("Alice");
        java.util.Optional<com.reservation_system.model.User> userOptional10 = userRepository1.findByEmail("Student");
        com.reservation_system.model.Guest guest16 = new com.reservation_system.model.Guest((-1), "Alice", "guest", "hi!", false);
        userRepository1.addUser((com.reservation_system.model.User) guest16);
        java.lang.String str18 = guest16.getPassword();
        java.lang.String str19 = guest16.getPassword();
        java.lang.String str20 = guest16.getUserType();
        org.junit.Assert.assertNotNull(userList2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 102 + "'", int3 == 102);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(userOptional8);
        org.junit.Assert.assertNotNull(userOptional10);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "Guest" + "'", str20, "Guest");
    }

    @Test
    public void test2069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2069");
        com.reservation_system.model.LabManager labManager5 = new com.reservation_system.model.LabManager(0, "labmanager", "guest", "Alice", false);
    }

    @Test
    public void test2070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2070");
        com.reservation_system.model.Student student5 = new com.reservation_system.model.Student((int) (byte) -1, "alice@example.com", "guest", "Password1!", false);
    }

    @Test
    public void test2071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2071");
        com.reservation_system.model.Guest guest5 = new com.reservation_system.model.Guest(1, "data/test-userrepo.csv", "alice@example.com", "faculty", true);
        java.lang.String str6 = guest5.getUserType();
        java.lang.String str7 = guest5.getUserType();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Guest" + "'", str6, "Guest");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Guest" + "'", str7, "Guest");
    }

    @Test
    public void test2072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2072");
        com.reservation_system.model.Faculty faculty5 = new com.reservation_system.model.Faculty(100, "guest", "Faculty", "faculty", true);
        java.lang.String str6 = faculty5.getUserType();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Faculty" + "'", str6, "Faculty");
    }

    @Test
    public void test2073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2073");
        com.reservation_system.model.Guest guest5 = new com.reservation_system.model.Guest((int) (byte) -1, "hi!", "", "Password1!", false);
        java.lang.String str6 = guest5.getUserType();
        java.lang.String str7 = guest5.getPassword();
        boolean boolean8 = guest5.isApproved();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Guest" + "'", str6, "Guest");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Password1!" + "'", str7, "Password1!");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test2074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2074");
        com.reservation_system.model.Student student5 = new com.reservation_system.model.Student(100, "Alice", "researcher", "alice@example.com", true);
    }

    @Test
    public void test2075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2075");
        com.reservation_system.model.LabManager labManager5 = new com.reservation_system.model.LabManager(5, "hi!", "Researcher", "", true);
    }

    @Test
    public void test2076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2076");
        com.reservation_system.model.Guest guest5 = new com.reservation_system.model.Guest((int) (short) 10, "Alice", "Faculty", "Alice", false);
        java.lang.String str6 = guest5.getPassword();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Alice" + "'", str6, "Alice");
    }

    @Test
    public void test2077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2077");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("data/test-userrepo.csv");
        boolean boolean3 = userRepository1.emailExists("Alice");
        java.util.List<com.reservation_system.model.User> userList4 = userRepository1.getAllUsers();
        int int5 = userRepository1.getNextID();
        boolean boolean6 = userRepository1.headLabCoordinatorExists();
        boolean boolean8 = userRepository1.emailExists("Guest");
        java.util.Optional<com.reservation_system.model.User> userOptional10 = userRepository1.findByEmail("");
        com.reservation_system.model.LabManager labManager16 = new com.reservation_system.model.LabManager(0, "hi!", "", "", false);
        java.lang.String str17 = labManager16.getUserType();
        java.lang.String str18 = labManager16.getUserType();
        userRepository1.addUser((com.reservation_system.model.User) labManager16);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(userList4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 102 + "'", int5 == 102);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(userOptional10);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "labmanager" + "'", str17, "labmanager");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "labmanager" + "'", str18, "labmanager");
    }

    @Test
    public void test2078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2078");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("data/test-userrepo.csv");
        boolean boolean3 = userRepository1.emailExists("Alice");
        com.reservation_system.model.Researcher researcher9 = new com.reservation_system.model.Researcher((int) 'a', "labmanager", "faculty", "", false);
        boolean boolean10 = researcher9.isApproved();
        java.lang.String str11 = researcher9.getName();
        userRepository1.addUser((com.reservation_system.model.User) researcher9);
        java.util.Optional<com.reservation_system.model.User> userOptional14 = userRepository1.findByEmail("Password1!");
        com.reservation_system.model.Researcher researcher20 = new com.reservation_system.model.Researcher((int) (byte) 10, "alice@example.com", "researcher", "Researcher", false);
        userRepository1.addUser((com.reservation_system.model.User) researcher20);
        java.lang.String str22 = researcher20.getUserType();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "labmanager" + "'", str11, "labmanager");
        org.junit.Assert.assertNotNull(userOptional14);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "Researcher" + "'", str22, "Researcher");
    }

    @Test
    public void test2079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2079");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("data/test-userrepo.csv");
        java.util.List<com.reservation_system.model.User> userList2 = userRepository1.getAllUsers();
        int int3 = userRepository1.getNextID();
        java.util.List<com.reservation_system.model.User> userList4 = userRepository1.getAllUsers();
        java.util.List<com.reservation_system.model.User> userList5 = userRepository1.getAllUsers();
        org.junit.Assert.assertNotNull(userList2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 102 + "'", int3 == 102);
        org.junit.Assert.assertNotNull(userList4);
        org.junit.Assert.assertNotNull(userList5);
    }

    @Test
    public void test2080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2080");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("data/test-userrepo.csv");
        com.reservation_system.model.Researcher researcher7 = new com.reservation_system.model.Researcher(5, "hi!", "labmanager", "Guest", false);
        userRepository1.addUser((com.reservation_system.model.User) researcher7);
        java.util.List<com.reservation_system.model.User> userList9 = userRepository1.getAllUsers();
        com.reservation_system.model.Guest guest15 = new com.reservation_system.model.Guest(0, "Password1!", "data/test-userrepo.csv", "researcher", false);
        boolean boolean16 = guest15.requiresDepartmentApproval();
        userRepository1.addUser((com.reservation_system.model.User) guest15);
        boolean boolean19 = userRepository1.emailExists("Alice");
        com.reservation_system.repository.UserRepository userRepository21 = new com.reservation_system.repository.UserRepository("data/test-userrepo.csv");
        java.util.List<com.reservation_system.model.User> userList22 = userRepository21.getAllUsers();
        int int23 = userRepository21.getNextID();
        boolean boolean25 = userRepository21.emailExists("headlabcoordinator");
        boolean boolean26 = userRepository21.headLabCoordinatorExists();
        java.util.Optional<com.reservation_system.model.User> userOptional28 = userRepository21.findByEmail("Alice");
        boolean boolean30 = userRepository21.emailExists("Alice");
        boolean boolean32 = userRepository21.emailExists("Guest");
        boolean boolean34 = userRepository21.emailExists("headlabcoordinator");
        java.util.List<com.reservation_system.model.User> userList35 = userRepository21.getAllUsers();
        java.util.List<com.reservation_system.model.User> userList36 = userRepository21.getAllUsers();
        java.util.Optional<com.reservation_system.model.User> userOptional38 = userRepository21.findByEmail("labmanager");
        com.reservation_system.model.Researcher researcher44 = new com.reservation_system.model.Researcher((int) 'a', "labmanager", "faculty", "", false);
        boolean boolean45 = researcher44.isApproved();
        java.lang.String str46 = researcher44.getName();
        boolean boolean47 = researcher44.requiresDepartmentApproval();
        java.lang.String str48 = researcher44.getUserType();
        userRepository21.addUser((com.reservation_system.model.User) researcher44);
        userRepository1.addUser((com.reservation_system.model.User) researcher44);
        org.junit.Assert.assertNotNull(userList9);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(userList22);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 102 + "'", int23 == 102);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertNotNull(userOptional28);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertNotNull(userList35);
        org.junit.Assert.assertNotNull(userList36);
        org.junit.Assert.assertNotNull(userOptional38);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertEquals("'" + str46 + "' != '" + "labmanager" + "'", str46, "labmanager");
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + true + "'", boolean47 == true);
        org.junit.Assert.assertEquals("'" + str48 + "' != '" + "Researcher" + "'", str48, "Researcher");
    }

    @Test
    public void test2081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2081");
        com.reservation_system.model.Student student5 = new com.reservation_system.model.Student((int) (byte) 1, "Researcher", "Student", "headlabcoordinator", true);
        java.lang.String str6 = student5.getUserType();
        boolean boolean7 = student5.requiresDepartmentApproval();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Student" + "'", str6, "Student");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test2082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2082");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("data/test-userrepo.csv");
        int int2 = userRepository1.getNextID();
        boolean boolean3 = userRepository1.headLabCoordinatorExists();
        com.reservation_system.model.Guest guest9 = new com.reservation_system.model.Guest((int) (byte) -1, "hi!", "", "Password1!", false);
        userRepository1.addUser((com.reservation_system.model.User) guest9);
        boolean boolean12 = userRepository1.emailExists("researcher");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 102 + "'", int2 == 102);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test2083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2083");
        com.reservation_system.model.LabManager labManager5 = new com.reservation_system.model.LabManager(10, "student", "", "labmanager", true);
        java.lang.String str6 = labManager5.getUserType();
        java.lang.String str7 = labManager5.getUserType();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "labmanager" + "'", str6, "labmanager");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "labmanager" + "'", str7, "labmanager");
    }

    @Test
    public void test2084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2084");
        com.reservation_system.model.Student student5 = new com.reservation_system.model.Student(5, "labmanager", "guest", "Student", false);
        java.lang.String str6 = student5.getEmail();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "guest" + "'", str6, "guest");
    }

    @Test
    public void test2085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2085");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("data/test-userrepo.csv");
        int int2 = userRepository1.getNextID();
        int int3 = userRepository1.getNextID();
        java.util.List<com.reservation_system.model.User> userList4 = userRepository1.getAllUsers();
        com.reservation_system.model.Guest guest10 = new com.reservation_system.model.Guest(0, "student", "", "alice@example.com", false);
        java.lang.String str11 = guest10.getEmail();
        userRepository1.addUser((com.reservation_system.model.User) guest10);
        boolean boolean13 = userRepository1.headLabCoordinatorExists();
        boolean boolean15 = userRepository1.emailExists("faculty");
        java.util.List<com.reservation_system.model.User> userList16 = userRepository1.getAllUsers();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 102 + "'", int2 == 102);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 102 + "'", int3 == 102);
        org.junit.Assert.assertNotNull(userList4);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(userList16);
    }

    @Test
    public void test2086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2086");
        com.reservation_system.model.Student student5 = new com.reservation_system.model.Student(0, "Faculty", "student", "Guest", true);
        java.lang.String str6 = student5.getUserType();
        java.lang.String str7 = student5.getUserType();
        int int8 = student5.getID();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Student" + "'", str6, "Student");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Student" + "'", str7, "Student");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test2087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2087");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("data/test-userrepo.csv");
        java.util.Optional<com.reservation_system.model.User> userOptional3 = userRepository1.findByEmail("hi!");
        boolean boolean4 = userRepository1.headLabCoordinatorExists();
        java.util.Optional<com.reservation_system.model.User> userOptional6 = userRepository1.findByEmail("");
        int int7 = userRepository1.getNextID();
        com.reservation_system.model.Guest guest13 = new com.reservation_system.model.Guest(0, "Password1!", "data/test-userrepo.csv", "researcher", false);
        boolean boolean14 = guest13.requiresDepartmentApproval();
        java.lang.String str15 = guest13.getUserType();
        java.lang.String str16 = guest13.getPassword();
        java.lang.String str17 = guest13.getPassword();
        userRepository1.addUser((com.reservation_system.model.User) guest13);
        org.junit.Assert.assertNotNull(userOptional3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(userOptional6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 102 + "'", int7 == 102);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Guest" + "'", str15, "Guest");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "researcher" + "'", str16, "researcher");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "researcher" + "'", str17, "researcher");
    }

    @Test
    public void test2088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2088");
        com.reservation_system.model.Student student5 = new com.reservation_system.model.Student(98, "Password1!", "Password1!", "student", false);
        java.lang.String str6 = student5.getUserType();
        java.lang.String str7 = student5.getUserType();
        java.lang.String str8 = student5.getUserType();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Student" + "'", str6, "Student");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Student" + "'", str7, "Student");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Student" + "'", str8, "Student");
    }

    @Test
    public void test2089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2089");
        com.reservation_system.model.Guest guest5 = new com.reservation_system.model.Guest(0, "Password1!", "data/test-userrepo.csv", "researcher", false);
        java.lang.String str6 = guest5.getUserType();
        guest5.setApproved(true);
        java.lang.String str9 = guest5.getUserType();
        java.lang.String str10 = guest5.getUserType();
        boolean boolean11 = guest5.isApproved();
        java.lang.String str12 = guest5.getUserType();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Guest" + "'", str6, "Guest");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Guest" + "'", str9, "Guest");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Guest" + "'", str10, "Guest");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Guest" + "'", str12, "Guest");
    }

    @Test
    public void test2090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2090");
        com.reservation_system.model.LabManager labManager5 = new com.reservation_system.model.LabManager((int) 'a', "Researcher", "headlabcoordinator", "data/test-userrepo.csv", true);
    }

    @Test
    public void test2091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2091");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("data/test-userrepo.csv");
        java.util.Optional<com.reservation_system.model.User> userOptional3 = userRepository1.findByEmail("hi!");
        boolean boolean4 = userRepository1.headLabCoordinatorExists();
        java.util.Optional<com.reservation_system.model.User> userOptional6 = userRepository1.findByEmail("");
        com.reservation_system.model.Researcher researcher12 = new com.reservation_system.model.Researcher(0, "", "Password1!", "researcher", false);
        researcher12.setApproved(true);
        int int15 = researcher12.getID();
        boolean boolean16 = researcher12.isApproved();
        userRepository1.addUser((com.reservation_system.model.User) researcher12);
        java.lang.Class<?> wildcardClass18 = userRepository1.getClass();
        org.junit.Assert.assertNotNull(userOptional3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(userOptional6);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test2092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2092");
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
        com.reservation_system.model.Researcher researcher25 = new com.reservation_system.model.Researcher((int) 'a', "labmanager", "faculty", "", false);
        boolean boolean26 = researcher25.requiresDepartmentApproval();
        java.lang.String str27 = researcher25.getUserType();
        researcher25.setApproved(true);
        java.lang.String str30 = researcher25.getUserType();
        userRepository1.addUser((com.reservation_system.model.User) researcher25);
        researcher25.setApproved(true);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 102 + "'", int2 == 102);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 102 + "'", int3 == 102);
        org.junit.Assert.assertNotNull(userList4);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(userList16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 102 + "'", int17 == 102);
        org.junit.Assert.assertNotNull(userList18);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "Researcher" + "'", str27, "Researcher");
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "Researcher" + "'", str30, "Researcher");
    }

    @Test
    public void test2093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2093");
        com.reservation_system.model.Guest guest5 = new com.reservation_system.model.Guest((int) (byte) 100, "guest", "Faculty", "student", false);
        java.lang.String str6 = guest5.getPassword();
        boolean boolean7 = guest5.requiresDepartmentApproval();
        java.lang.String str8 = guest5.getName();
        java.lang.String str9 = guest5.getUserType();
        java.lang.String str10 = guest5.getEmail();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "student" + "'", str6, "student");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "guest" + "'", str8, "guest");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Guest" + "'", str9, "Guest");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Faculty" + "'", str10, "Faculty");
    }

    @Test
    public void test2094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2094");
        // The following exception was thrown during execution in test generation
        try {
            com.reservation_system.model.User user6 = com.reservation_system.patterns.factory.UserFactory.createUser("", 5, "faculty", "hi!", "student", false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid user type: ");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2095");
        com.reservation_system.model.Researcher researcher5 = new com.reservation_system.model.Researcher((int) '#', "hi!", "alice@example.com", "Student", false);
    }

    @Test
    public void test2096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2096");
        com.reservation_system.model.HeadLabCoordinator headLabCoordinator5 = new com.reservation_system.model.HeadLabCoordinator((int) (byte) 1, "guest", "data/test-userrepo.csv", "researcher", true);
    }

    @Test
    public void test2097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2097");
        com.reservation_system.model.LabManager labManager5 = new com.reservation_system.model.LabManager(0, "Alice", "hi!", "Guest", true);
        java.lang.String str6 = labManager5.getUserType();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "labmanager" + "'", str6, "labmanager");
    }

    @Test
    public void test2098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2098");
        com.reservation_system.model.LabManager labManager5 = new com.reservation_system.model.LabManager(36, "alice@example.com", "headlabcoordinator", "researcher", false);
        java.lang.String str6 = labManager5.getUserType();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "labmanager" + "'", str6, "labmanager");
    }

    @Test
    public void test2099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2099");
        com.reservation_system.model.Guest guest5 = new com.reservation_system.model.Guest((int) (short) 10, "Researcher", "alice@example.com", "researcher", true);
        java.lang.String str6 = guest5.getPassword();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "researcher" + "'", str6, "researcher");
    }

    @Test
    public void test2100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2100");
        com.reservation_system.model.Guest guest5 = new com.reservation_system.model.Guest(33, "guest", "researcher", "Student", true);
    }

    @Test
    public void test2101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2101");
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
        com.reservation_system.model.Student student26 = new com.reservation_system.model.Student((int) (byte) 0, "Alice", "student", "Alice", true);
        userRepository1.addUser((com.reservation_system.model.User) student26);
        boolean boolean28 = student26.isApproved();
        java.lang.String str29 = student26.getUserType();
        org.junit.Assert.assertNotNull(userList2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 102 + "'", int3 == 102);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(userOptional7);
        org.junit.Assert.assertNotNull(userList10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 102 + "'", int11 == 102);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(userOptional16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(userList19);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "Student" + "'", str29, "Student");
    }

    @Test
    public void test2102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2102");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("data/test-userrepo.csv");
        com.reservation_system.model.Researcher researcher7 = new com.reservation_system.model.Researcher(5, "hi!", "labmanager", "Guest", false);
        userRepository1.addUser((com.reservation_system.model.User) researcher7);
        int int9 = userRepository1.getNextID();
        boolean boolean11 = userRepository1.emailExists("Researcher");
        java.util.List<com.reservation_system.model.User> userList12 = userRepository1.getAllUsers();
        boolean boolean13 = userRepository1.headLabCoordinatorExists();
        boolean boolean14 = userRepository1.headLabCoordinatorExists();
        java.util.List<com.reservation_system.model.User> userList15 = userRepository1.getAllUsers();
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 102 + "'", int9 == 102);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(userList12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(userList15);
    }

    @Test
    public void test2103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2103");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("data/test-userrepo.csv");
        com.reservation_system.model.Researcher researcher7 = new com.reservation_system.model.Researcher(5, "hi!", "labmanager", "Guest", false);
        userRepository1.addUser((com.reservation_system.model.User) researcher7);
        int int9 = userRepository1.getNextID();
        boolean boolean11 = userRepository1.emailExists("Researcher");
        boolean boolean12 = userRepository1.headLabCoordinatorExists();
        java.util.Optional<com.reservation_system.model.User> userOptional14 = userRepository1.findByEmail("researcher");
        boolean boolean15 = userRepository1.headLabCoordinatorExists();
        com.reservation_system.repository.UserRepository userRepository17 = new com.reservation_system.repository.UserRepository("data/test-userrepo.csv");
        com.reservation_system.model.Researcher researcher23 = new com.reservation_system.model.Researcher(5, "hi!", "labmanager", "Guest", false);
        userRepository17.addUser((com.reservation_system.model.User) researcher23);
        java.util.List<com.reservation_system.model.User> userList25 = userRepository17.getAllUsers();
        boolean boolean26 = userRepository17.headLabCoordinatorExists();
        boolean boolean28 = userRepository17.emailExists("guest");
        com.reservation_system.repository.UserRepository userRepository30 = new com.reservation_system.repository.UserRepository("data/test-userrepo.csv");
        boolean boolean32 = userRepository30.emailExists("Alice");
        com.reservation_system.repository.UserRepository userRepository34 = new com.reservation_system.repository.UserRepository("data/test-userrepo.csv");
        java.util.List<com.reservation_system.model.User> userList35 = userRepository34.getAllUsers();
        int int36 = userRepository34.getNextID();
        java.util.List<com.reservation_system.model.User> userList37 = userRepository34.getAllUsers();
        userRepository30.saveAllUsers(userList37);
        userRepository17.saveAllUsers(userList37);
        java.util.List<com.reservation_system.model.User> userList40 = userRepository17.getAllUsers();
        java.util.List<com.reservation_system.model.User> userList41 = userRepository17.getAllUsers();
        userRepository1.saveAllUsers(userList41);
        com.reservation_system.model.User user49 = com.reservation_system.patterns.factory.UserFactory.createUser("Researcher", 0, "Guest", "Alice", "alice@example.com", false);
        java.lang.String str50 = user49.getEmail();
        boolean boolean51 = user49.isApproved();
        int int52 = user49.getID();
        userRepository1.addUser(user49);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 102 + "'", int9 == 102);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(userOptional14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(userList25);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNotNull(userList35);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 102 + "'", int36 == 102);
        org.junit.Assert.assertNotNull(userList37);
        org.junit.Assert.assertNotNull(userList40);
        org.junit.Assert.assertNotNull(userList41);
        org.junit.Assert.assertNotNull(user49);
        org.junit.Assert.assertEquals("'" + str50 + "' != '" + "Alice" + "'", str50, "Alice");
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertTrue("'" + int52 + "' != '" + 0 + "'", int52 == 0);
    }

    @Test
    public void test2104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2104");
        com.reservation_system.model.Guest guest5 = new com.reservation_system.model.Guest(98, "Student", "Student", "guest", false);
    }

    @Test
    public void test2105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2105");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("data/test-userrepo.csv");
        boolean boolean3 = userRepository1.emailExists("Alice");
        com.reservation_system.model.Researcher researcher9 = new com.reservation_system.model.Researcher((int) 'a', "labmanager", "faculty", "", false);
        boolean boolean10 = researcher9.isApproved();
        java.lang.String str11 = researcher9.getName();
        userRepository1.addUser((com.reservation_system.model.User) researcher9);
        boolean boolean14 = userRepository1.emailExists("Alice");
        boolean boolean16 = userRepository1.emailExists("headlabcoordinator");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "labmanager" + "'", str11, "labmanager");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test2106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2106");
        com.reservation_system.model.Researcher researcher5 = new com.reservation_system.model.Researcher((int) (short) 0, "Guest", "labmanager", "headlabcoordinator", false);
        boolean boolean6 = researcher5.isApproved();
        java.lang.String str7 = researcher5.getUserType();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Researcher" + "'", str7, "Researcher");
    }

    @Test
    public void test2107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2107");
        com.reservation_system.model.LabManager labManager5 = new com.reservation_system.model.LabManager(98, "Faculty", "alice@example.com", "guest", false);
        java.lang.String str6 = labManager5.getUserType();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "labmanager" + "'", str6, "labmanager");
    }

    @Test
    public void test2108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2108");
        com.reservation_system.model.Guest guest5 = new com.reservation_system.model.Guest(102, "Faculty", "alice@example.com", "researcher", true);
    }

    @Test
    public void test2109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2109");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("data/test-userrepo.csv");
        com.reservation_system.model.Faculty faculty7 = new com.reservation_system.model.Faculty(5, "researcher", "guest", "faculty", true);
        java.lang.String str8 = faculty7.getUserType();
        java.lang.String str9 = faculty7.getUserType();
        userRepository1.addUser((com.reservation_system.model.User) faculty7);
        java.util.List<com.reservation_system.model.User> userList11 = userRepository1.getAllUsers();
        java.util.Optional<com.reservation_system.model.User> userOptional13 = userRepository1.findByEmail("Faculty");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Faculty" + "'", str8, "Faculty");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Faculty" + "'", str9, "Faculty");
        org.junit.Assert.assertNotNull(userList11);
        org.junit.Assert.assertNotNull(userOptional13);
    }

    @Test
    public void test2110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2110");
        com.reservation_system.model.Researcher researcher5 = new com.reservation_system.model.Researcher(10, "faculty", "guest", "Student", false);
        java.lang.String str6 = researcher5.getUserType();
        java.lang.String str7 = researcher5.getName();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Researcher" + "'", str6, "Researcher");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "faculty" + "'", str7, "faculty");
    }

    @Test
    public void test2111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2111");
        com.reservation_system.model.Guest guest5 = new com.reservation_system.model.Guest(0, "Password1!", "data/test-userrepo.csv", "researcher", false);
        boolean boolean6 = guest5.requiresDepartmentApproval();
        java.lang.String str7 = guest5.getUserType();
        java.lang.String str8 = guest5.getUserType();
        java.lang.String str9 = guest5.getName();
        boolean boolean10 = guest5.isApproved();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Guest" + "'", str7, "Guest");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Guest" + "'", str8, "Guest");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Password1!" + "'", str9, "Password1!");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test2112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2112");
        com.reservation_system.model.LabManager labManager5 = new com.reservation_system.model.LabManager((int) (byte) 100, "researcher", "alice@example.com", "", false);
        boolean boolean6 = labManager5.requiresDepartmentApproval();
        java.lang.String str7 = labManager5.getEmail();
        java.lang.String str8 = labManager5.getUserType();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "labmanager" + "'", str8, "labmanager");
    }

    @Test
    public void test2113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2113");
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
        java.util.Optional<com.reservation_system.model.User> userOptional66 = userRepository1.findByEmail("student");
        java.util.Optional<com.reservation_system.model.User> userOptional68 = userRepository1.findByEmail("headlabcoordinator");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 102 + "'", int2 == 102);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "labmanager" + "'", str15, "labmanager");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNotNull(userList18);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 102 + "'", int22 == 102);
        org.junit.Assert.assertNotNull(userList32);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + true + "'", boolean42 == true);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 102 + "'", int43 == 102);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + true + "'", boolean47 == true);
        org.junit.Assert.assertNotNull(userList50);
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + 102 + "'", int51 == 102);
        org.junit.Assert.assertNotNull(userList52);
        org.junit.Assert.assertEquals("'" + str63 + "' != '" + "Guest" + "'", str63, "Guest");
        org.junit.Assert.assertNotNull(userOptional66);
        org.junit.Assert.assertNotNull(userOptional68);
    }

    @Test
    public void test2114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2114");
        com.reservation_system.model.Researcher researcher5 = new com.reservation_system.model.Researcher((int) '4', "Guest", "Faculty", "headlabcoordinator", false);
        boolean boolean6 = researcher5.isApproved();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test2115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2115");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("data/test-userrepo.csv");
        com.reservation_system.model.Researcher researcher7 = new com.reservation_system.model.Researcher(5, "hi!", "labmanager", "Guest", false);
        userRepository1.addUser((com.reservation_system.model.User) researcher7);
        boolean boolean10 = userRepository1.emailExists("headlabcoordinator");
        java.util.List<com.reservation_system.model.User> userList11 = userRepository1.getAllUsers();
        java.util.List<com.reservation_system.model.User> userList12 = userRepository1.getAllUsers();
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(userList11);
        org.junit.Assert.assertNotNull(userList12);
    }

    @Test
    public void test2116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2116");
        com.reservation_system.model.Faculty faculty5 = new com.reservation_system.model.Faculty(5, "researcher", "guest", "faculty", true);
        java.lang.String str6 = faculty5.getUserType();
        java.lang.String str7 = faculty5.getPassword();
        java.lang.String str8 = faculty5.getUserType();
        java.lang.String str9 = faculty5.getPassword();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Faculty" + "'", str6, "Faculty");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "faculty" + "'", str7, "faculty");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Faculty" + "'", str8, "Faculty");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "faculty" + "'", str9, "faculty");
    }

    @Test
    public void test2117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2117");
        com.reservation_system.model.Faculty faculty5 = new com.reservation_system.model.Faculty(0, "Faculty", "labmanager", "", true);
        java.lang.String str6 = faculty5.getUserType();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Faculty" + "'", str6, "Faculty");
    }

    @Test
    public void test2118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2118");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("data/test-userrepo.csv");
        boolean boolean3 = userRepository1.emailExists("Alice");
        int int4 = userRepository1.getNextID();
        boolean boolean5 = userRepository1.headLabCoordinatorExists();
        boolean boolean6 = userRepository1.headLabCoordinatorExists();
        boolean boolean8 = userRepository1.emailExists("Researcher");
        boolean boolean10 = userRepository1.emailExists("alice@example.com");
        com.reservation_system.repository.UserRepository userRepository12 = new com.reservation_system.repository.UserRepository("data/test-userrepo.csv");
        int int13 = userRepository12.getNextID();
        int int14 = userRepository12.getNextID();
        java.util.List<com.reservation_system.model.User> userList15 = userRepository12.getAllUsers();
        userRepository1.saveAllUsers(userList15);
        int int17 = userRepository1.getNextID();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 102 + "'", int4 == 102);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 102 + "'", int13 == 102);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 102 + "'", int14 == 102);
        org.junit.Assert.assertNotNull(userList15);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 102 + "'", int17 == 102);
    }

    @Test
    public void test2119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2119");
        com.reservation_system.model.Researcher researcher5 = new com.reservation_system.model.Researcher(10, "faculty", "data/test-userrepo.csv", "alice@example.com", true);
        researcher5.setApproved(false);
    }

    @Test
    public void test2120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2120");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("data/test-userrepo.csv");
        com.reservation_system.model.Researcher researcher7 = new com.reservation_system.model.Researcher(5, "hi!", "labmanager", "Guest", false);
        userRepository1.addUser((com.reservation_system.model.User) researcher7);
        java.util.List<com.reservation_system.model.User> userList9 = userRepository1.getAllUsers();
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
        java.util.List<com.reservation_system.model.User> userList33 = userRepository32.getAllUsers();
        userRepository11.saveAllUsers(userList33);
        userRepository1.saveAllUsers(userList33);
        com.reservation_system.repository.UserRepository userRepository37 = new com.reservation_system.repository.UserRepository("data/test-userrepo.csv");
        com.reservation_system.model.Faculty faculty43 = new com.reservation_system.model.Faculty(5, "researcher", "guest", "faculty", true);
        java.lang.String str44 = faculty43.getUserType();
        java.lang.String str45 = faculty43.getUserType();
        userRepository37.addUser((com.reservation_system.model.User) faculty43);
        com.reservation_system.repository.UserRepository userRepository48 = new com.reservation_system.repository.UserRepository("data/test-userrepo.csv");
        boolean boolean50 = userRepository48.emailExists("Alice");
        com.reservation_system.repository.UserRepository userRepository52 = new com.reservation_system.repository.UserRepository("data/test-userrepo.csv");
        java.util.List<com.reservation_system.model.User> userList53 = userRepository52.getAllUsers();
        int int54 = userRepository52.getNextID();
        java.util.List<com.reservation_system.model.User> userList55 = userRepository52.getAllUsers();
        userRepository48.saveAllUsers(userList55);
        userRepository37.saveAllUsers(userList55);
        boolean boolean58 = userRepository37.headLabCoordinatorExists();
        int int59 = userRepository37.getNextID();
        java.util.List<com.reservation_system.model.User> userList60 = userRepository37.getAllUsers();
        com.reservation_system.model.Guest guest66 = new com.reservation_system.model.Guest((int) '#', "alice@example.com", "data/test-userrepo.csv", "headlabcoordinator", true);
        java.lang.String str67 = guest66.getUserType();
        userRepository37.addUser((com.reservation_system.model.User) guest66);
        userRepository1.addUser((com.reservation_system.model.User) guest66);
        com.reservation_system.model.Student student75 = new com.reservation_system.model.Student(52, "alice@example.com", "", "", false);
        java.lang.String str76 = student75.getPassword();
        userRepository1.addUser((com.reservation_system.model.User) student75);
        org.junit.Assert.assertNotNull(userList9);
        org.junit.Assert.assertNotNull(userList19);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 102 + "'", int30 == 102);
        org.junit.Assert.assertNotNull(userList33);
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "Faculty" + "'", str44, "Faculty");
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + "Faculty" + "'", str45, "Faculty");
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + true + "'", boolean50 == true);
        org.junit.Assert.assertNotNull(userList53);
        org.junit.Assert.assertTrue("'" + int54 + "' != '" + 102 + "'", int54 == 102);
        org.junit.Assert.assertNotNull(userList55);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + true + "'", boolean58 == true);
        org.junit.Assert.assertTrue("'" + int59 + "' != '" + 102 + "'", int59 == 102);
        org.junit.Assert.assertNotNull(userList60);
        org.junit.Assert.assertEquals("'" + str67 + "' != '" + "Guest" + "'", str67, "Guest");
        org.junit.Assert.assertEquals("'" + str76 + "' != '" + "" + "'", str76, "");
    }

    @Test
    public void test2121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2121");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("data/test-userrepo.csv");
        boolean boolean3 = userRepository1.emailExists("Alice");
        int int4 = userRepository1.getNextID();
        boolean boolean5 = userRepository1.headLabCoordinatorExists();
        boolean boolean6 = userRepository1.headLabCoordinatorExists();
        boolean boolean8 = userRepository1.emailExists("Researcher");
        boolean boolean10 = userRepository1.emailExists("Password1!");
        int int11 = userRepository1.getNextID();
        java.util.List<com.reservation_system.model.User> userList12 = userRepository1.getAllUsers();
        com.reservation_system.repository.UserRepository userRepository14 = new com.reservation_system.repository.UserRepository("data/test-userrepo.csv");
        com.reservation_system.model.Researcher researcher20 = new com.reservation_system.model.Researcher(5, "hi!", "labmanager", "Guest", false);
        userRepository14.addUser((com.reservation_system.model.User) researcher20);
        java.util.List<com.reservation_system.model.User> userList22 = userRepository14.getAllUsers();
        com.reservation_system.repository.UserRepository userRepository24 = new com.reservation_system.repository.UserRepository("data/test-userrepo.csv");
        com.reservation_system.model.Researcher researcher30 = new com.reservation_system.model.Researcher(5, "hi!", "labmanager", "Guest", false);
        userRepository24.addUser((com.reservation_system.model.User) researcher30);
        java.util.Optional<com.reservation_system.model.User> userOptional33 = userRepository24.findByEmail("alice@example.com");
        java.util.List<com.reservation_system.model.User> userList34 = userRepository24.getAllUsers();
        userRepository14.saveAllUsers(userList34);
        com.reservation_system.model.Student student41 = new com.reservation_system.model.Student((int) (short) 100, "guest", "Guest", "faculty", false);
        userRepository14.addUser((com.reservation_system.model.User) student41);
        boolean boolean43 = userRepository14.headLabCoordinatorExists();
        java.util.List<com.reservation_system.model.User> userList44 = userRepository14.getAllUsers();
        userRepository1.saveAllUsers(userList44);
        com.reservation_system.model.Student student51 = new com.reservation_system.model.Student((int) (byte) 0, "data/test-userrepo.csv", "data/test-userrepo.csv", "Student", false);
        java.lang.String str52 = student51.getName();
        java.lang.String str53 = student51.getUserType();
        userRepository1.addUser((com.reservation_system.model.User) student51);
        com.reservation_system.model.User user61 = com.reservation_system.patterns.factory.UserFactory.createUser("Researcher", (int) (short) -1, "Alice", "Guest", "", false);
        java.lang.String str62 = user61.getEmail();
        userRepository1.addUser(user61);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 102 + "'", int4 == 102);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 102 + "'", int11 == 102);
        org.junit.Assert.assertNotNull(userList12);
        org.junit.Assert.assertNotNull(userList22);
        org.junit.Assert.assertNotNull(userOptional33);
        org.junit.Assert.assertNotNull(userList34);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + true + "'", boolean43 == true);
        org.junit.Assert.assertNotNull(userList44);
        org.junit.Assert.assertEquals("'" + str52 + "' != '" + "data/test-userrepo.csv" + "'", str52, "data/test-userrepo.csv");
        org.junit.Assert.assertEquals("'" + str53 + "' != '" + "Student" + "'", str53, "Student");
        org.junit.Assert.assertNotNull(user61);
        org.junit.Assert.assertEquals("'" + str62 + "' != '" + "Guest" + "'", str62, "Guest");
    }

    @Test
    public void test2122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2122");
        com.reservation_system.model.LabManager labManager5 = new com.reservation_system.model.LabManager((int) (byte) -1, "faculty", "Student", "student", false);
        java.lang.String str6 = labManager5.getUserType();
        java.lang.String str7 = labManager5.getUserType();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "labmanager" + "'", str6, "labmanager");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "labmanager" + "'", str7, "labmanager");
    }

    @Test
    public void test2123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2123");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("data/test-userrepo.csv");
        com.reservation_system.model.Researcher researcher7 = new com.reservation_system.model.Researcher(5, "hi!", "labmanager", "Guest", false);
        userRepository1.addUser((com.reservation_system.model.User) researcher7);
        java.util.Optional<com.reservation_system.model.User> userOptional10 = userRepository1.findByEmail("alice@example.com");
        java.util.List<com.reservation_system.model.User> userList11 = userRepository1.getAllUsers();
        com.reservation_system.repository.UserRepository userRepository13 = new com.reservation_system.repository.UserRepository("data/test-userrepo.csv");
        com.reservation_system.model.Researcher researcher19 = new com.reservation_system.model.Researcher(5, "hi!", "labmanager", "Guest", false);
        userRepository13.addUser((com.reservation_system.model.User) researcher19);
        java.util.List<com.reservation_system.model.User> userList21 = userRepository13.getAllUsers();
        boolean boolean23 = userRepository13.emailExists("hi!");
        com.reservation_system.repository.UserRepository userRepository25 = new com.reservation_system.repository.UserRepository("data/test-userrepo.csv");
        com.reservation_system.model.Researcher researcher31 = new com.reservation_system.model.Researcher(5, "hi!", "labmanager", "Guest", false);
        userRepository25.addUser((com.reservation_system.model.User) researcher31);
        java.util.List<com.reservation_system.model.User> userList33 = userRepository25.getAllUsers();
        com.reservation_system.model.Guest guest39 = new com.reservation_system.model.Guest(0, "Password1!", "data/test-userrepo.csv", "researcher", false);
        boolean boolean40 = guest39.requiresDepartmentApproval();
        userRepository25.addUser((com.reservation_system.model.User) guest39);
        boolean boolean43 = userRepository25.emailExists("Alice");
        int int44 = userRepository25.getNextID();
        com.reservation_system.repository.UserRepository userRepository46 = new com.reservation_system.repository.UserRepository("data/test-userrepo.csv");
        boolean boolean48 = userRepository46.emailExists("Alice");
        com.reservation_system.repository.UserRepository userRepository50 = new com.reservation_system.repository.UserRepository("data/test-userrepo.csv");
        java.util.List<com.reservation_system.model.User> userList51 = userRepository50.getAllUsers();
        int int52 = userRepository50.getNextID();
        java.util.List<com.reservation_system.model.User> userList53 = userRepository50.getAllUsers();
        userRepository46.saveAllUsers(userList53);
        userRepository25.saveAllUsers(userList53);
        userRepository13.saveAllUsers(userList53);
        userRepository1.saveAllUsers(userList53);
        java.util.Optional<com.reservation_system.model.User> userOptional59 = userRepository1.findByEmail("headlabcoordinator");
        com.reservation_system.repository.UserRepository userRepository61 = new com.reservation_system.repository.UserRepository("data/test-userrepo.csv");
        com.reservation_system.model.Faculty faculty67 = new com.reservation_system.model.Faculty(5, "researcher", "guest", "faculty", true);
        java.lang.String str68 = faculty67.getUserType();
        java.lang.String str69 = faculty67.getUserType();
        userRepository61.addUser((com.reservation_system.model.User) faculty67);
        java.lang.String str71 = faculty67.getEmail();
        java.lang.String str72 = faculty67.getUserType();
        userRepository1.addUser((com.reservation_system.model.User) faculty67);
        org.junit.Assert.assertNotNull(userOptional10);
        org.junit.Assert.assertNotNull(userList11);
        org.junit.Assert.assertNotNull(userList21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertNotNull(userList33);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + true + "'", boolean43 == true);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 102 + "'", int44 == 102);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + true + "'", boolean48 == true);
        org.junit.Assert.assertNotNull(userList51);
        org.junit.Assert.assertTrue("'" + int52 + "' != '" + 102 + "'", int52 == 102);
        org.junit.Assert.assertNotNull(userList53);
        org.junit.Assert.assertNotNull(userOptional59);
        org.junit.Assert.assertEquals("'" + str68 + "' != '" + "Faculty" + "'", str68, "Faculty");
        org.junit.Assert.assertEquals("'" + str69 + "' != '" + "Faculty" + "'", str69, "Faculty");
        org.junit.Assert.assertEquals("'" + str71 + "' != '" + "guest" + "'", str71, "guest");
        org.junit.Assert.assertEquals("'" + str72 + "' != '" + "Faculty" + "'", str72, "Faculty");
    }

    @Test
    public void test2124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2124");
        com.reservation_system.model.Student student5 = new com.reservation_system.model.Student(1, "data/test-userrepo.csv", "alice@example.com", "guest", false);
        java.lang.String str6 = student5.getUserType();
        java.lang.String str7 = student5.getName();
        java.lang.String str8 = student5.getEmail();
        java.lang.String str9 = student5.getUserType();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Student" + "'", str6, "Student");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "data/test-userrepo.csv" + "'", str7, "data/test-userrepo.csv");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Student" + "'", str9, "Student");
    }

    @Test
    public void test2125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2125");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("data/test-userrepo.csv");
        int int2 = userRepository1.getNextID();
        int int3 = userRepository1.getNextID();
        java.util.List<com.reservation_system.model.User> userList4 = userRepository1.getAllUsers();
        boolean boolean6 = userRepository1.emailExists("Guest");
        java.util.List<com.reservation_system.model.User> userList7 = userRepository1.getAllUsers();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 102 + "'", int2 == 102);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 102 + "'", int3 == 102);
        org.junit.Assert.assertNotNull(userList4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(userList7);
    }

    @Test
    public void test2126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2126");
        com.reservation_system.model.Researcher researcher5 = new com.reservation_system.model.Researcher(0, "", "Password1!", "researcher", false);
        researcher5.setApproved(true);
        int int8 = researcher5.getID();
        java.lang.String str9 = researcher5.getUserType();
        boolean boolean10 = researcher5.isApproved();
        java.lang.Class<?> wildcardClass11 = researcher5.getClass();
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Researcher" + "'", str9, "Researcher");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test2127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2127");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("data/test-userrepo.csv");
        com.reservation_system.model.Faculty faculty7 = new com.reservation_system.model.Faculty(5, "researcher", "guest", "faculty", true);
        java.lang.String str8 = faculty7.getUserType();
        java.lang.String str9 = faculty7.getUserType();
        userRepository1.addUser((com.reservation_system.model.User) faculty7);
        faculty7.setApproved(true);
        java.lang.String str13 = faculty7.getPassword();
        java.lang.String str14 = faculty7.getUserType();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Faculty" + "'", str8, "Faculty");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Faculty" + "'", str9, "Faculty");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "faculty" + "'", str13, "faculty");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Faculty" + "'", str14, "Faculty");
    }

    @Test
    public void test2128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2128");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("data/test-userrepo.csv");
        int int2 = userRepository1.getNextID();
        boolean boolean3 = userRepository1.headLabCoordinatorExists();
        com.reservation_system.model.Guest guest9 = new com.reservation_system.model.Guest((int) (byte) -1, "hi!", "", "Password1!", false);
        userRepository1.addUser((com.reservation_system.model.User) guest9);
        java.util.Optional<com.reservation_system.model.User> userOptional12 = userRepository1.findByEmail("Faculty");
        boolean boolean14 = userRepository1.emailExists("hi!");
        boolean boolean15 = userRepository1.headLabCoordinatorExists();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 102 + "'", int2 == 102);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(userOptional12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
    }

    @Test
    public void test2129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2129");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("data/test-userrepo.csv");
        int int2 = userRepository1.getNextID();
        int int3 = userRepository1.getNextID();
        java.util.List<com.reservation_system.model.User> userList4 = userRepository1.getAllUsers();
        boolean boolean6 = userRepository1.emailExists("Guest");
        com.reservation_system.repository.UserRepository userRepository8 = new com.reservation_system.repository.UserRepository("data/test-userrepo.csv");
        int int9 = userRepository8.getNextID();
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
        userRepository8.saveAllUsers(userList39);
        userRepository1.saveAllUsers(userList39);
        com.reservation_system.repository.UserRepository userRepository45 = new com.reservation_system.repository.UserRepository("data/test-userrepo.csv");
        java.util.List<com.reservation_system.model.User> userList46 = userRepository45.getAllUsers();
        int int47 = userRepository45.getNextID();
        boolean boolean49 = userRepository45.emailExists("headlabcoordinator");
        com.reservation_system.repository.UserRepository userRepository51 = new com.reservation_system.repository.UserRepository("data/test-userrepo.csv");
        com.reservation_system.model.Researcher researcher57 = new com.reservation_system.model.Researcher(5, "hi!", "labmanager", "Guest", false);
        userRepository51.addUser((com.reservation_system.model.User) researcher57);
        java.util.List<com.reservation_system.model.User> userList59 = userRepository51.getAllUsers();
        com.reservation_system.model.Guest guest65 = new com.reservation_system.model.Guest(0, "Password1!", "data/test-userrepo.csv", "researcher", false);
        boolean boolean66 = guest65.requiresDepartmentApproval();
        userRepository51.addUser((com.reservation_system.model.User) guest65);
        boolean boolean69 = userRepository51.emailExists("Alice");
        int int70 = userRepository51.getNextID();
        com.reservation_system.repository.UserRepository userRepository72 = new com.reservation_system.repository.UserRepository("data/test-userrepo.csv");
        boolean boolean74 = userRepository72.emailExists("Alice");
        com.reservation_system.repository.UserRepository userRepository76 = new com.reservation_system.repository.UserRepository("data/test-userrepo.csv");
        java.util.List<com.reservation_system.model.User> userList77 = userRepository76.getAllUsers();
        int int78 = userRepository76.getNextID();
        java.util.List<com.reservation_system.model.User> userList79 = userRepository76.getAllUsers();
        userRepository72.saveAllUsers(userList79);
        userRepository51.saveAllUsers(userList79);
        com.reservation_system.repository.UserRepository userRepository83 = new com.reservation_system.repository.UserRepository("data/test-userrepo.csv");
        boolean boolean85 = userRepository83.emailExists("Alice");
        com.reservation_system.repository.UserRepository userRepository87 = new com.reservation_system.repository.UserRepository("data/test-userrepo.csv");
        java.util.List<com.reservation_system.model.User> userList88 = userRepository87.getAllUsers();
        int int89 = userRepository87.getNextID();
        java.util.List<com.reservation_system.model.User> userList90 = userRepository87.getAllUsers();
        userRepository83.saveAllUsers(userList90);
        userRepository51.saveAllUsers(userList90);
        userRepository45.saveAllUsers(userList90);
        userRepository1.saveAllUsers(userList90);
        int int95 = userRepository1.getNextID();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 102 + "'", int2 == 102);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 102 + "'", int3 == 102);
        org.junit.Assert.assertNotNull(userList4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 102 + "'", int9 == 102);
        org.junit.Assert.assertNotNull(userList19);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 102 + "'", int30 == 102);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertNotNull(userList37);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 102 + "'", int38 == 102);
        org.junit.Assert.assertNotNull(userList39);
        org.junit.Assert.assertNotNull(userList46);
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + 102 + "'", int47 == 102);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertNotNull(userList59);
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + false + "'", boolean66 == false);
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + true + "'", boolean69 == true);
        org.junit.Assert.assertTrue("'" + int70 + "' != '" + 102 + "'", int70 == 102);
        org.junit.Assert.assertTrue("'" + boolean74 + "' != '" + true + "'", boolean74 == true);
        org.junit.Assert.assertNotNull(userList77);
        org.junit.Assert.assertTrue("'" + int78 + "' != '" + 102 + "'", int78 == 102);
        org.junit.Assert.assertNotNull(userList79);
        org.junit.Assert.assertTrue("'" + boolean85 + "' != '" + true + "'", boolean85 == true);
        org.junit.Assert.assertNotNull(userList88);
        org.junit.Assert.assertTrue("'" + int89 + "' != '" + 102 + "'", int89 == 102);
        org.junit.Assert.assertNotNull(userList90);
        org.junit.Assert.assertTrue("'" + int95 + "' != '" + 102 + "'", int95 == 102);
    }

    @Test
    public void test2130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2130");
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
        com.reservation_system.repository.UserRepository userRepository25 = new com.reservation_system.repository.UserRepository("data/test-userrepo.csv");
        boolean boolean27 = userRepository25.emailExists("Password1!");
        boolean boolean29 = userRepository25.emailExists("hi!");
        java.util.List<com.reservation_system.model.User> userList30 = userRepository25.getAllUsers();
        userRepository1.saveAllUsers(userList30);
        com.reservation_system.repository.UserRepository userRepository33 = new com.reservation_system.repository.UserRepository("data/test-userrepo.csv");
        boolean boolean35 = userRepository33.emailExists("Alice");
        com.reservation_system.model.Researcher researcher41 = new com.reservation_system.model.Researcher((int) 'a', "labmanager", "faculty", "", false);
        boolean boolean42 = researcher41.isApproved();
        java.lang.String str43 = researcher41.getName();
        userRepository33.addUser((com.reservation_system.model.User) researcher41);
        boolean boolean45 = userRepository33.headLabCoordinatorExists();
        int int46 = userRepository33.getNextID();
        com.reservation_system.model.User user53 = com.reservation_system.patterns.factory.UserFactory.createUser("Guest", (int) (short) 1, "", "alice@example.com", "labmanager", true);
        userRepository33.addUser(user53);
        int int55 = userRepository33.getNextID();
        int int56 = userRepository33.getNextID();
        com.reservation_system.repository.UserRepository userRepository58 = new com.reservation_system.repository.UserRepository("data/test-userrepo.csv");
        com.reservation_system.model.Researcher researcher64 = new com.reservation_system.model.Researcher(5, "hi!", "labmanager", "Guest", false);
        userRepository58.addUser((com.reservation_system.model.User) researcher64);
        boolean boolean67 = userRepository58.emailExists("headlabcoordinator");
        boolean boolean69 = userRepository58.emailExists("Guest");
        java.util.List<com.reservation_system.model.User> userList70 = userRepository58.getAllUsers();
        userRepository33.saveAllUsers(userList70);
        userRepository1.saveAllUsers(userList70);
        org.junit.Assert.assertNotNull(userList9);
        org.junit.Assert.assertNotNull(userOptional20);
        org.junit.Assert.assertNotNull(userList21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertNotNull(userList30);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "labmanager" + "'", str43, "labmanager");
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + true + "'", boolean45 == true);
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + 102 + "'", int46 == 102);
        org.junit.Assert.assertNotNull(user53);
        org.junit.Assert.assertTrue("'" + int55 + "' != '" + 102 + "'", int55 == 102);
        org.junit.Assert.assertTrue("'" + int56 + "' != '" + 102 + "'", int56 == 102);
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + false + "'", boolean67 == false);
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + true + "'", boolean69 == true);
        org.junit.Assert.assertNotNull(userList70);
    }

    @Test
    public void test2131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2131");
        com.reservation_system.model.LabManager labManager5 = new com.reservation_system.model.LabManager(10, "Password1!", "Guest", "Alice", true);
        java.lang.String str6 = labManager5.getName();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Password1!" + "'", str6, "Password1!");
    }

    @Test
    public void test2132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2132");
        com.reservation_system.model.Student student5 = new com.reservation_system.model.Student((int) (byte) 0, "", "Researcher", "Password1!", false);
        java.lang.String str6 = student5.getUserType();
        boolean boolean7 = student5.isApproved();
        java.lang.String str8 = student5.getEmail();
        int int9 = student5.getID();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Student" + "'", str6, "Student");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Researcher" + "'", str8, "Researcher");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test2133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2133");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("data/test-userrepo.csv");
        com.reservation_system.model.Researcher researcher7 = new com.reservation_system.model.Researcher(5, "hi!", "labmanager", "Guest", false);
        userRepository1.addUser((com.reservation_system.model.User) researcher7);
        java.util.List<com.reservation_system.model.User> userList9 = userRepository1.getAllUsers();
        boolean boolean10 = userRepository1.headLabCoordinatorExists();
        boolean boolean12 = userRepository1.emailExists("guest");
        java.util.Optional<com.reservation_system.model.User> userOptional14 = userRepository1.findByEmail("researcher");
        java.util.Optional<com.reservation_system.model.User> userOptional16 = userRepository1.findByEmail("alice@example.com");
        boolean boolean17 = userRepository1.headLabCoordinatorExists();
        org.junit.Assert.assertNotNull(userList9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(userOptional14);
        org.junit.Assert.assertNotNull(userOptional16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
    }

    @Test
    public void test2134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2134");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("data/test-userrepo.csv");
        com.reservation_system.model.Researcher researcher7 = new com.reservation_system.model.Researcher(5, "hi!", "labmanager", "Guest", false);
        userRepository1.addUser((com.reservation_system.model.User) researcher7);
        int int9 = userRepository1.getNextID();
        boolean boolean11 = userRepository1.emailExists("faculty");
        boolean boolean12 = userRepository1.headLabCoordinatorExists();
        java.util.List<com.reservation_system.model.User> userList13 = userRepository1.getAllUsers();
        com.reservation_system.repository.UserRepository userRepository15 = new com.reservation_system.repository.UserRepository("data/test-userrepo.csv");
        int int16 = userRepository15.getNextID();
        int int17 = userRepository15.getNextID();
        java.util.List<com.reservation_system.model.User> userList18 = userRepository15.getAllUsers();
        com.reservation_system.model.Guest guest24 = new com.reservation_system.model.Guest(0, "student", "", "alice@example.com", false);
        java.lang.String str25 = guest24.getEmail();
        userRepository15.addUser((com.reservation_system.model.User) guest24);
        java.lang.String str27 = guest24.getUserType();
        userRepository1.addUser((com.reservation_system.model.User) guest24);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 102 + "'", int9 == 102);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(userList13);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 102 + "'", int16 == 102);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 102 + "'", int17 == 102);
        org.junit.Assert.assertNotNull(userList18);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "Guest" + "'", str27, "Guest");
    }

    @Test
    public void test2135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2135");
        com.reservation_system.model.Guest guest5 = new com.reservation_system.model.Guest(98, "Researcher", "Faculty", "Student", true);
        java.lang.String str6 = guest5.getUserType();
        java.lang.String str7 = guest5.getUserType();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Guest" + "'", str6, "Guest");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Guest" + "'", str7, "Guest");
    }

    @Test
    public void test2136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2136");
        com.reservation_system.model.Student student5 = new com.reservation_system.model.Student(102, "Researcher", "faculty", "faculty", false);
        int int6 = student5.getID();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 102 + "'", int6 == 102);
    }

    @Test
    public void test2137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2137");
        com.reservation_system.model.Guest guest5 = new com.reservation_system.model.Guest(35, "faculty", "", "", true);
    }

    @Test
    public void test2138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2138");
        com.reservation_system.model.LabManager labManager5 = new com.reservation_system.model.LabManager((int) (short) -1, "faculty", "Guest", "Guest", true);
        java.lang.String str6 = labManager5.getName();
        java.lang.String str7 = labManager5.getUserType();
        java.lang.String str8 = labManager5.getName();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "faculty" + "'", str6, "faculty");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "labmanager" + "'", str7, "labmanager");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "faculty" + "'", str8, "faculty");
    }

    @Test
    public void test2139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2139");
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
        boolean boolean19 = userRepository1.emailExists("student");
        boolean boolean21 = userRepository1.emailExists("Password1!");
        com.reservation_system.repository.UserRepository userRepository23 = new com.reservation_system.repository.UserRepository("data/test-userrepo.csv");
        com.reservation_system.model.Researcher researcher29 = new com.reservation_system.model.Researcher(5, "hi!", "labmanager", "Guest", false);
        userRepository23.addUser((com.reservation_system.model.User) researcher29);
        java.util.List<com.reservation_system.model.User> userList31 = userRepository23.getAllUsers();
        boolean boolean33 = userRepository23.emailExists("hi!");
        com.reservation_system.repository.UserRepository userRepository35 = new com.reservation_system.repository.UserRepository("data/test-userrepo.csv");
        boolean boolean37 = userRepository35.emailExists("Password1!");
        boolean boolean39 = userRepository35.emailExists("hi!");
        java.util.List<com.reservation_system.model.User> userList40 = userRepository35.getAllUsers();
        java.util.Optional<com.reservation_system.model.User> userOptional42 = userRepository35.findByEmail("headlabcoordinator");
        java.util.List<com.reservation_system.model.User> userList43 = userRepository35.getAllUsers();
        com.reservation_system.repository.UserRepository userRepository45 = new com.reservation_system.repository.UserRepository("data/test-userrepo.csv");
        com.reservation_system.model.Researcher researcher51 = new com.reservation_system.model.Researcher(5, "hi!", "labmanager", "Guest", false);
        userRepository45.addUser((com.reservation_system.model.User) researcher51);
        int int53 = userRepository45.getNextID();
        com.reservation_system.repository.UserRepository userRepository55 = new com.reservation_system.repository.UserRepository("data/test-userrepo.csv");
        int int56 = userRepository55.getNextID();
        boolean boolean57 = userRepository55.headLabCoordinatorExists();
        com.reservation_system.model.Guest guest63 = new com.reservation_system.model.Guest((int) (byte) -1, "hi!", "", "Password1!", false);
        userRepository55.addUser((com.reservation_system.model.User) guest63);
        int int65 = userRepository55.getNextID();
        boolean boolean67 = userRepository55.emailExists("headlabcoordinator");
        java.util.List<com.reservation_system.model.User> userList68 = userRepository55.getAllUsers();
        userRepository45.saveAllUsers(userList68);
        userRepository35.saveAllUsers(userList68);
        userRepository23.saveAllUsers(userList68);
        userRepository1.saveAllUsers(userList68);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 102 + "'", int2 == 102);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 102 + "'", int11 == 102);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertNotNull(userList31);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
        org.junit.Assert.assertNotNull(userList40);
        org.junit.Assert.assertNotNull(userOptional42);
        org.junit.Assert.assertNotNull(userList43);
        org.junit.Assert.assertTrue("'" + int53 + "' != '" + 102 + "'", int53 == 102);
        org.junit.Assert.assertTrue("'" + int56 + "' != '" + 102 + "'", int56 == 102);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + true + "'", boolean57 == true);
        org.junit.Assert.assertTrue("'" + int65 + "' != '" + 102 + "'", int65 == 102);
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + false + "'", boolean67 == false);
        org.junit.Assert.assertNotNull(userList68);
    }
}
