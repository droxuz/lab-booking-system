package com.reservation_system.Randoop.AuthService;

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
        com.reservation_system.model.Student student5 = new com.reservation_system.model.Student((int) (byte) 100, "labmanager", "Password1!", "researcher", false);
    }

    @Test
    public void test1002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1002");
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
        java.util.List<com.reservation_system.model.User> userList23 = userRepository1.getAllUsers();
        org.junit.Assert.assertNotNull(userList2);
// flaky "1) test1002(com.reservation_system.Randoop.AuthService.RegressionTest2)":         org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
// flaky "1) test1002(com.reservation_system.Randoop.AuthService.RegressionTest2)":         org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(userOptional7);
// flaky "1) test1002(com.reservation_system.Randoop.AuthService.RegressionTest2)":         org.junit.Assert.assertTrue("'" + int8 + "' != '" + 101 + "'", int8 == 101);
// flaky "1) test1002(com.reservation_system.Randoop.AuthService.RegressionTest2)":         org.junit.Assert.assertTrue("'" + int9 + "' != '" + 101 + "'", int9 == 101);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
// flaky "1) test1002(com.reservation_system.Randoop.AuthService.RegressionTest2)":         org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(user19);
        org.junit.Assert.assertNotNull(userList23);
    }

    @Test
    public void test1003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1003");
        com.reservation_system.model.Faculty faculty5 = new com.reservation_system.model.Faculty(0, "headlabcoordinator", "student", "labmanager", false);
        java.lang.String str6 = faculty5.getName();
        java.lang.String str7 = faculty5.getName();
        java.lang.String str8 = faculty5.getUserType();
        boolean boolean9 = faculty5.requiresDepartmentApproval();
        java.lang.String str10 = faculty5.getName();
        java.lang.String str11 = faculty5.getName();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "headlabcoordinator" + "'", str6, "headlabcoordinator");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "headlabcoordinator" + "'", str7, "headlabcoordinator");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Faculty" + "'", str8, "Faculty");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "headlabcoordinator" + "'", str10, "headlabcoordinator");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "headlabcoordinator" + "'", str11, "headlabcoordinator");
    }

    @Test
    public void test1004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1004");
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
        java.util.List<com.reservation_system.model.User> userList18 = userRepository1.getAllUsers();
        org.junit.Assert.assertNotNull(userList2);
        org.junit.Assert.assertNotNull(userList3);
        org.junit.Assert.assertNotNull(userList6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(userList10);
        org.junit.Assert.assertNotNull(userList11);
// flaky "2) test1004(com.reservation_system.Randoop.AuthService.RegressionTest2)":         org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(userList18);
    }

    @Test
    public void test1005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1005");
        com.reservation_system.model.HeadLabCoordinator headLabCoordinator5 = new com.reservation_system.model.HeadLabCoordinator((int) (byte) 0, "test@example.com", "Guest", "WrongPassword1!", false);
        boolean boolean6 = headLabCoordinator5.isApproved();
        java.lang.String str7 = headLabCoordinator5.getName();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test1006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1006");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("data/test-users.csv");
        java.util.List<com.reservation_system.model.User> userList2 = userRepository1.getAllUsers();
        boolean boolean3 = userRepository1.headLabCoordinatorExists();
        com.reservation_system.repository.UserRepository userRepository5 = new com.reservation_system.repository.UserRepository("data/test-users.csv");
        java.util.List<com.reservation_system.model.User> userList6 = userRepository5.getAllUsers();
        java.util.List<com.reservation_system.model.User> userList7 = userRepository5.getAllUsers();
        userRepository1.saveAllUsers(userList7);
        int int9 = userRepository1.getNextID();
        boolean boolean10 = userRepository1.headLabCoordinatorExists();
        org.junit.Assert.assertNotNull(userList2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(userList6);
        org.junit.Assert.assertNotNull(userList7);
// flaky "3) test1006(com.reservation_system.Randoop.AuthService.RegressionTest2)":         org.junit.Assert.assertTrue("'" + int9 + "' != '" + 101 + "'", int9 == 101);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test1007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1007");
        com.reservation_system.model.LabManager labManager5 = new com.reservation_system.model.LabManager((int) (short) 0, "data/test-users.csv", "Faculty", "Researcher", true);
        int int6 = labManager5.getID();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test1008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1008");
        com.reservation_system.model.Researcher researcher5 = new com.reservation_system.model.Researcher((int) (short) -1, "faculty", "faculty", "labmanager", true);
    }

    @Test
    public void test1009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1009");
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
        int int19 = userRepository1.getNextID();
        org.junit.Assert.assertNotNull(userList2);
        org.junit.Assert.assertNotNull(userList3);
        org.junit.Assert.assertNotNull(userList6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(userList10);
        org.junit.Assert.assertNotNull(userList11);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(userOptional16);
        org.junit.Assert.assertNotNull(userOptional18);
// flaky "4) test1009(com.reservation_system.Randoop.AuthService.RegressionTest2)":         org.junit.Assert.assertTrue("'" + int19 + "' != '" + 101 + "'", int19 == 101);
    }

    @Test
    public void test1010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1010");
        com.reservation_system.model.Faculty faculty5 = new com.reservation_system.model.Faculty(98, "guest", "Researcher", "student", true);
        java.lang.String str6 = faculty5.getUserType();
        java.lang.String str7 = faculty5.getUserType();
        java.lang.String str8 = faculty5.getName();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Faculty" + "'", str6, "Faculty");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Faculty" + "'", str7, "Faculty");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "guest" + "'", str8, "guest");
    }

    @Test
    public void test1011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1011");
        com.reservation_system.model.User user6 = com.reservation_system.patterns.factory.UserFactory.createUser("headlabcoordinator", (int) '4', "student", "WrongPassword1!", "Researcher", true);
        java.lang.String str7 = user6.getPassword();
        org.junit.Assert.assertNotNull(user6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Researcher" + "'", str7, "Researcher");
    }

    @Test
    public void test1012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1012");
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
        java.lang.String str25 = headLabCoordinator20.getUserType();
        org.junit.Assert.assertNotNull(userList2);
        org.junit.Assert.assertNotNull(userList3);
        org.junit.Assert.assertNotNull(userList6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(userList10);
        org.junit.Assert.assertNotNull(userList11);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "headlabcoordinator" + "'", str21, "headlabcoordinator");
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 98 + "'", int22 == 98);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "headlabcoordinator" + "'", str24, "headlabcoordinator");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "headlabcoordinator" + "'", str25, "headlabcoordinator");
    }

    @Test
    public void test1013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1013");
        com.reservation_system.model.Student student5 = new com.reservation_system.model.Student((int) ' ', "Password1!", "researcher", "researcher", true);
        java.lang.String str6 = student5.getUserType();
        java.lang.String str7 = student5.getUserType();
        java.lang.String str8 = student5.getEmail();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Student" + "'", str6, "Student");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Student" + "'", str7, "Student");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "researcher" + "'", str8, "researcher");
    }

    @Test
    public void test1014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1014");
        com.reservation_system.model.Researcher researcher5 = new com.reservation_system.model.Researcher(97, "Andrew", "", "Student", true);
    }

    @Test
    public void test1015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1015");
        com.reservation_system.model.Faculty faculty5 = new com.reservation_system.model.Faculty((int) '#', "researcher", "", "student", true);
        java.lang.String str6 = faculty5.getUserType();
        faculty5.setApproved(true);
        java.lang.String str9 = faculty5.getUserType();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Faculty" + "'", str6, "Faculty");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Faculty" + "'", str9, "Faculty");
    }

    @Test
    public void test1016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1016");
        com.reservation_system.model.Researcher researcher5 = new com.reservation_system.model.Researcher(99, "guest", "Student", "headlabcoordinator", true);
    }

    @Test
    public void test1017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1017");
        com.reservation_system.model.Student student5 = new com.reservation_system.model.Student((int) (byte) 100, "researcher", "Password1!", "Student", true);
    }

    @Test
    public void test1018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1018");
        com.reservation_system.model.Faculty faculty5 = new com.reservation_system.model.Faculty((int) 'a', "data/test-users.csv", "faculty", "WrongPassword1!", false);
        faculty5.setApproved(false);
        java.lang.String str8 = faculty5.getEmail();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "faculty" + "'", str8, "faculty");
    }

    @Test
    public void test1019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1019");
        com.reservation_system.model.LabManager labManager5 = new com.reservation_system.model.LabManager(1, "Andrew", "data/test-users.csv", "labmanager", false);
    }

    @Test
    public void test1020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1020");
        com.reservation_system.model.LabManager labManager5 = new com.reservation_system.model.LabManager(10, "faculty", "Student", "faculty", true);
        labManager5.setApproved(true);
        boolean boolean8 = labManager5.isApproved();
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test1021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1021");
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
        com.reservation_system.model.Faculty faculty91 = new com.reservation_system.model.Faculty((int) (byte) 10, "labmanager", "Guest", "", false);
        java.lang.String str92 = faculty91.getPassword();
        userRepository1.addUser((com.reservation_system.model.User) faculty91);
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
        org.junit.Assert.assertEquals("'" + str92 + "' != '" + "" + "'", str92, "");
    }

    @Test
    public void test1022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1022");
        com.reservation_system.model.LabManager labManager5 = new com.reservation_system.model.LabManager(10, "faculty", "Student", "faculty", true);
        labManager5.setApproved(true);
        java.lang.String str8 = labManager5.getName();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "faculty" + "'", str8, "faculty");
    }

    @Test
    public void test1023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1023");
        com.reservation_system.model.Researcher researcher5 = new com.reservation_system.model.Researcher((int) (byte) 1, "labmanager", "labmanager", "", false);
    }

    @Test
    public void test1024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1024");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("data/test-users.csv");
        java.util.List<com.reservation_system.model.User> userList2 = userRepository1.getAllUsers();
        com.reservation_system.services.AuthService authService3 = new com.reservation_system.services.AuthService(userRepository1);
        java.util.Optional<com.reservation_system.model.User> userOptional5 = userRepository1.findByEmail("");
        java.util.List<com.reservation_system.model.User> userList6 = userRepository1.getAllUsers();
        boolean boolean8 = userRepository1.emailExists("Andrew");
        boolean boolean10 = userRepository1.emailExists("headlabcoordinator");
        int int11 = userRepository1.getNextID();
        org.junit.Assert.assertNotNull(userList2);
        org.junit.Assert.assertNotNull(userOptional5);
        org.junit.Assert.assertNotNull(userList6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 98 + "'", int11 == 98);
    }

    @Test
    public void test1025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1025");
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
        boolean boolean26 = userRepository1.emailExists("Student");
        java.lang.Class<?> wildcardClass27 = userRepository1.getClass();
        org.junit.Assert.assertNotNull(userList2);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 98 + "'", int22 == 98);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertNotNull(wildcardClass27);
    }

    @Test
    public void test1026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1026");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("data/test-users.csv");
        java.util.List<com.reservation_system.model.User> userList2 = userRepository1.getAllUsers();
        boolean boolean3 = userRepository1.headLabCoordinatorExists();
        boolean boolean5 = userRepository1.emailExists("hi!");
        java.util.Optional<com.reservation_system.model.User> userOptional7 = userRepository1.findByEmail("Faculty");
        int int8 = userRepository1.getNextID();
        java.util.List<com.reservation_system.model.User> userList9 = userRepository1.getAllUsers();
        com.reservation_system.repository.UserRepository userRepository11 = new com.reservation_system.repository.UserRepository("data/test-users.csv");
        java.util.List<com.reservation_system.model.User> userList12 = userRepository11.getAllUsers();
        com.reservation_system.services.AuthService authService13 = new com.reservation_system.services.AuthService(userRepository11);
        com.reservation_system.model.LabManager labManager19 = new com.reservation_system.model.LabManager((int) (short) 0, "", "student", "Andrew", true);
        boolean boolean20 = labManager19.isApproved();
        userRepository11.addUser((com.reservation_system.model.User) labManager19);
        com.reservation_system.model.Faculty faculty27 = new com.reservation_system.model.Faculty((int) '#', "researcher", "", "student", true);
        userRepository11.addUser((com.reservation_system.model.User) faculty27);
        int int29 = userRepository11.getNextID();
        int int30 = userRepository11.getNextID();
        java.util.List<com.reservation_system.model.User> userList31 = userRepository11.getAllUsers();
        com.reservation_system.repository.UserRepository userRepository33 = new com.reservation_system.repository.UserRepository("data/test-users.csv");
        boolean boolean34 = userRepository33.headLabCoordinatorExists();
        int int35 = userRepository33.getNextID();
        com.reservation_system.repository.UserRepository userRepository37 = new com.reservation_system.repository.UserRepository("data/test-users.csv");
        boolean boolean38 = userRepository37.headLabCoordinatorExists();
        int int39 = userRepository37.getNextID();
        java.util.List<com.reservation_system.model.User> userList40 = userRepository37.getAllUsers();
        userRepository33.saveAllUsers(userList40);
        userRepository11.saveAllUsers(userList40);
        userRepository1.saveAllUsers(userList40);
        org.junit.Assert.assertNotNull(userList2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(userOptional7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 98 + "'", int8 == 98);
        org.junit.Assert.assertNotNull(userList9);
        org.junit.Assert.assertNotNull(userList12);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 98 + "'", int29 == 98);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 98 + "'", int30 == 98);
        org.junit.Assert.assertNotNull(userList31);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 98 + "'", int35 == 98);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 98 + "'", int39 == 98);
        org.junit.Assert.assertNotNull(userList40);
    }

    @Test
    public void test1027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1027");
        com.reservation_system.model.Guest guest5 = new com.reservation_system.model.Guest((int) '#', "test@example.com", "Password1!", "test@example.com", true);
        java.lang.String str6 = guest5.getName();
        java.lang.String str7 = guest5.getName();
        java.lang.String str8 = guest5.getEmail();
        guest5.setApproved(true);
        guest5.setApproved(true);
        java.lang.String str13 = guest5.getPassword();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Password1!" + "'", str8, "Password1!");
    }

    @Test
    public void test1028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1028");
        com.reservation_system.model.Faculty faculty5 = new com.reservation_system.model.Faculty((int) (byte) 1, "", "hi!", "headlabcoordinator", false);
        java.lang.String str6 = faculty5.getUserType();
        java.lang.String str7 = faculty5.getName();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Faculty" + "'", str6, "Faculty");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
    }

    @Test
    public void test1029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1029");
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
        java.lang.String str24 = researcher21.getUserType();
        java.lang.String str25 = researcher21.getName();
        java.lang.String str26 = researcher21.getEmail();
        org.junit.Assert.assertNotNull(userList2);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(userList14);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "Researcher" + "'", str24, "Researcher");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "researcher" + "'", str25, "researcher");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "Researcher" + "'", str26, "Researcher");
    }

    @Test
    public void test1030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1030");
        com.reservation_system.model.HeadLabCoordinator headLabCoordinator5 = new com.reservation_system.model.HeadLabCoordinator((-1), "test@example.com", "researcher", "faculty", false);
        boolean boolean6 = headLabCoordinator5.requiresDepartmentApproval();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test1031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1031");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("data/test-users.csv");
        boolean boolean2 = userRepository1.headLabCoordinatorExists();
        com.reservation_system.model.Faculty faculty8 = new com.reservation_system.model.Faculty(0, "headlabcoordinator", "student", "labmanager", false);
        userRepository1.addUser((com.reservation_system.model.User) faculty8);
        com.reservation_system.model.HeadLabCoordinator headLabCoordinator15 = new com.reservation_system.model.HeadLabCoordinator(10, "headlabcoordinator", "data/test-users.csv", "faculty", false);
        java.lang.String str16 = headLabCoordinator15.getEmail();
        java.lang.String str17 = headLabCoordinator15.getUserType();
        userRepository1.addUser((com.reservation_system.model.User) headLabCoordinator15);
        boolean boolean19 = userRepository1.headLabCoordinatorExists();
        boolean boolean20 = userRepository1.headLabCoordinatorExists();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "data/test-users.csv" + "'", str16, "data/test-users.csv");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "headlabcoordinator" + "'", str17, "headlabcoordinator");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
    }

    @Test
    public void test1032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1032");
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
        boolean boolean18 = userRepository1.emailExists("Researcher");
        boolean boolean19 = userRepository1.headLabCoordinatorExists();
        org.junit.Assert.assertNotNull(userList2);
        org.junit.Assert.assertNotNull(userOptional5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 98 + "'", int6 == 98);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(userList13);
        org.junit.Assert.assertNotNull(userList14);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
    }

    @Test
    public void test1033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1033");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("data/test-users.csv");
        java.util.List<com.reservation_system.model.User> userList2 = userRepository1.getAllUsers();
        java.util.List<com.reservation_system.model.User> userList3 = userRepository1.getAllUsers();
        com.reservation_system.model.Faculty faculty9 = new com.reservation_system.model.Faculty(10, "data/test-users.csv", "hi!", "", false);
        java.lang.String str10 = faculty9.getUserType();
        userRepository1.addUser((com.reservation_system.model.User) faculty9);
        boolean boolean12 = faculty9.requiresDepartmentApproval();
        java.lang.String str13 = faculty9.getUserType();
        java.lang.String str14 = faculty9.getPassword();
        java.lang.String str15 = faculty9.getUserType();
        org.junit.Assert.assertNotNull(userList2);
        org.junit.Assert.assertNotNull(userList3);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Faculty" + "'", str10, "Faculty");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Faculty" + "'", str13, "Faculty");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Faculty" + "'", str15, "Faculty");
    }

    @Test
    public void test1034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1034");
        com.reservation_system.model.Faculty faculty5 = new com.reservation_system.model.Faculty(0, "faculty", "Faculty", "Faculty", false);
    }

    @Test
    public void test1035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1035");
        com.reservation_system.model.Faculty faculty5 = new com.reservation_system.model.Faculty((int) (byte) 0, "student", "headlabcoordinator", "student", true);
    }

    @Test
    public void test1036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1036");
        com.reservation_system.model.Student student5 = new com.reservation_system.model.Student((int) 'a', "headlabcoordinator", "labmanager", "headlabcoordinator", false);
    }

    @Test
    public void test1037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1037");
        com.reservation_system.model.Faculty faculty5 = new com.reservation_system.model.Faculty((int) (byte) 100, "Researcher", "Researcher", "", true);
    }

    @Test
    public void test1038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1038");
        com.reservation_system.model.Researcher researcher5 = new com.reservation_system.model.Researcher((int) (short) -1, "headlabcoordinator", "student", "", false);
        java.lang.String str6 = researcher5.getUserType();
        boolean boolean7 = researcher5.isApproved();
        java.lang.String str8 = researcher5.getName();
        java.lang.String str9 = researcher5.getUserType();
        boolean boolean10 = researcher5.isApproved();
        java.lang.String str11 = researcher5.getUserType();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Researcher" + "'", str6, "Researcher");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "headlabcoordinator" + "'", str8, "headlabcoordinator");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Researcher" + "'", str9, "Researcher");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Researcher" + "'", str11, "Researcher");
    }

    @Test
    public void test1039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1039");
        com.reservation_system.repository.UserRepository userRepository0 = null;
        com.reservation_system.services.AuthService authService1 = new com.reservation_system.services.AuthService(userRepository0);
        // The following exception was thrown during execution in test generation
        try {
            com.reservation_system.model.User user4 = authService1.login("guest", "faculty");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.reservation_system.repository.UserRepository.findByEmail(String)\" because \"this.userRepository\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1040");
        com.reservation_system.model.LabManager labManager5 = new com.reservation_system.model.LabManager(0, "WrongPassword1!", "Password1!", "WrongPassword1!", false);
        java.lang.String str6 = labManager5.getUserType();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "labmanager" + "'", str6, "labmanager");
    }

    @Test
    public void test1041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1041");
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
        int int19 = userRepository1.getNextID();
        org.junit.Assert.assertNotNull(userList2);
        org.junit.Assert.assertNotNull(userOptional5);
        org.junit.Assert.assertNotNull(userList6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "student" + "'", str16, "student");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "Researcher" + "'", str17, "Researcher");
// flaky "5) test1041(com.reservation_system.Randoop.AuthService.RegressionTest2)":         org.junit.Assert.assertTrue("'" + int19 + "' != '" + 101 + "'", int19 == 101);
    }

    @Test
    public void test1042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1042");
        // The following exception was thrown during execution in test generation
        try {
            com.reservation_system.model.User user6 = com.reservation_system.patterns.factory.UserFactory.createUser("Andrew", (int) (short) 10, "", "hi!", "hi!", false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid user type: Andrew");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1043");
        com.reservation_system.model.Researcher researcher5 = new com.reservation_system.model.Researcher(35, "headlabcoordinator", "data/test-users.csv", "headlabcoordinator", false);
        java.lang.String str6 = researcher5.getUserType();
        researcher5.setApproved(false);
        java.lang.String str9 = researcher5.getUserType();
        java.lang.String str10 = researcher5.getUserType();
        java.lang.String str11 = researcher5.getUserType();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Researcher" + "'", str6, "Researcher");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Researcher" + "'", str9, "Researcher");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Researcher" + "'", str10, "Researcher");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Researcher" + "'", str11, "Researcher");
    }

    @Test
    public void test1044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1044");
        com.reservation_system.model.User user6 = com.reservation_system.patterns.factory.UserFactory.createUser("Researcher", (int) ' ', "", "faculty", "Guest", false);
        java.lang.String str7 = user6.getPassword();
        org.junit.Assert.assertNotNull(user6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Guest" + "'", str7, "Guest");
    }

    @Test
    public void test1045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1045");
        com.reservation_system.model.Guest guest5 = new com.reservation_system.model.Guest(52, "Researcher", "Andrew", "data/test-users.csv", false);
        java.lang.String str6 = guest5.getUserType();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Guest" + "'", str6, "Guest");
    }

    @Test
    public void test1046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1046");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("data/test-users.csv");
        java.util.List<com.reservation_system.model.User> userList2 = userRepository1.getAllUsers();
        com.reservation_system.services.AuthService authService3 = new com.reservation_system.services.AuthService(userRepository1);
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
        com.reservation_system.services.AuthService authService18 = new com.reservation_system.services.AuthService(userRepository5);
        int int19 = userRepository5.getNextID();
        com.reservation_system.repository.UserRepository userRepository21 = new com.reservation_system.repository.UserRepository("data/test-users.csv");
        java.util.List<com.reservation_system.model.User> userList22 = userRepository21.getAllUsers();
        boolean boolean23 = userRepository21.headLabCoordinatorExists();
        boolean boolean24 = userRepository21.headLabCoordinatorExists();
        java.util.List<com.reservation_system.model.User> userList25 = userRepository21.getAllUsers();
        com.reservation_system.repository.UserRepository userRepository27 = new com.reservation_system.repository.UserRepository("data/test-users.csv");
        java.util.List<com.reservation_system.model.User> userList28 = userRepository27.getAllUsers();
        java.util.List<com.reservation_system.model.User> userList29 = userRepository27.getAllUsers();
        com.reservation_system.repository.UserRepository userRepository31 = new com.reservation_system.repository.UserRepository("data/test-users.csv");
        java.util.List<com.reservation_system.model.User> userList32 = userRepository31.getAllUsers();
        boolean boolean33 = userRepository31.headLabCoordinatorExists();
        com.reservation_system.repository.UserRepository userRepository35 = new com.reservation_system.repository.UserRepository("data/test-users.csv");
        java.util.List<com.reservation_system.model.User> userList36 = userRepository35.getAllUsers();
        java.util.List<com.reservation_system.model.User> userList37 = userRepository35.getAllUsers();
        userRepository31.saveAllUsers(userList37);
        userRepository27.saveAllUsers(userList37);
        com.reservation_system.repository.UserRepository userRepository41 = new com.reservation_system.repository.UserRepository("data/test-users.csv");
        java.util.List<com.reservation_system.model.User> userList42 = userRepository41.getAllUsers();
        com.reservation_system.services.AuthService authService43 = new com.reservation_system.services.AuthService(userRepository41);
        com.reservation_system.model.LabManager labManager49 = new com.reservation_system.model.LabManager((int) (short) 0, "", "student", "Andrew", true);
        boolean boolean50 = labManager49.isApproved();
        userRepository41.addUser((com.reservation_system.model.User) labManager49);
        com.reservation_system.repository.UserRepository userRepository53 = new com.reservation_system.repository.UserRepository("data/test-users.csv");
        java.util.List<com.reservation_system.model.User> userList54 = userRepository53.getAllUsers();
        java.util.List<com.reservation_system.model.User> userList55 = userRepository53.getAllUsers();
        userRepository41.saveAllUsers(userList55);
        userRepository27.saveAllUsers(userList55);
        userRepository21.saveAllUsers(userList55);
        userRepository5.saveAllUsers(userList55);
        userRepository1.saveAllUsers(userList55);
        org.junit.Assert.assertNotNull(userList2);
        org.junit.Assert.assertNotNull(userList6);
        org.junit.Assert.assertNotNull(userList7);
        org.junit.Assert.assertNotNull(userList10);
// flaky "6) test1046(com.reservation_system.Randoop.AuthService.RegressionTest2)":         org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(userList14);
        org.junit.Assert.assertNotNull(userList15);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 98 + "'", int19 == 98);
        org.junit.Assert.assertNotNull(userList22);
// flaky "2) test1046(com.reservation_system.Randoop.AuthService.RegressionTest2)":         org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
// flaky "2) test1046(com.reservation_system.Randoop.AuthService.RegressionTest2)":         org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(userList25);
        org.junit.Assert.assertNotNull(userList28);
        org.junit.Assert.assertNotNull(userList29);
        org.junit.Assert.assertNotNull(userList32);
// flaky "2) test1046(com.reservation_system.Randoop.AuthService.RegressionTest2)":         org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertNotNull(userList36);
        org.junit.Assert.assertNotNull(userList37);
        org.junit.Assert.assertNotNull(userList42);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + true + "'", boolean50 == true);
        org.junit.Assert.assertNotNull(userList54);
        org.junit.Assert.assertNotNull(userList55);
    }

    @Test
    public void test1047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1047");
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
        java.lang.String str17 = guest10.getEmail();
        java.lang.String str18 = guest10.getUserType();
        org.junit.Assert.assertNotNull(userList2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 98 + "'", int4 == 98);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Password1!" + "'", str13, "Password1!");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "Password1!" + "'", str17, "Password1!");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Guest" + "'", str18, "Guest");
    }

    @Test
    public void test1048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1048");
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
        boolean boolean27 = userRepository1.emailExists("Faculty");
        org.junit.Assert.assertNotNull(userList2);
        org.junit.Assert.assertNotNull(userOptional5);
        org.junit.Assert.assertNotNull(userList6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(userList11);
        org.junit.Assert.assertNotNull(userList12);
        org.junit.Assert.assertNotNull(userList15);
// flaky "7) test1048(com.reservation_system.Randoop.AuthService.RegressionTest2)":         org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(userList19);
        org.junit.Assert.assertNotNull(userList20);
// flaky "3) test1048(com.reservation_system.Randoop.AuthService.RegressionTest2)":         org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(userList24);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
    }

    @Test
    public void test1049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1049");
        com.reservation_system.model.LabManager labManager5 = new com.reservation_system.model.LabManager(10, "Student", "Researcher", "Andrew", false);
        labManager5.setApproved(false);
        java.lang.String str8 = labManager5.getUserType();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "labmanager" + "'", str8, "labmanager");
    }

    @Test
    public void test1050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1050");
        com.reservation_system.model.Faculty faculty5 = new com.reservation_system.model.Faculty((int) (byte) -1, "Guest", "Password1!", "Guest", true);
    }

    @Test
    public void test1051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1051");
        com.reservation_system.model.Researcher researcher5 = new com.reservation_system.model.Researcher((int) (byte) -1, "Andrew", "Student", "data/test-users.csv", false);
        int int6 = researcher5.getID();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
    }

    @Test
    public void test1052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1052");
        com.reservation_system.model.Student student5 = new com.reservation_system.model.Student(100, "WrongPassword1!", "data/test-users.csv", "data/test-users.csv", false);
    }

    @Test
    public void test1053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1053");
        com.reservation_system.model.LabManager labManager5 = new com.reservation_system.model.LabManager(99, "Password1!", "labmanager", "Student", false);
        java.lang.String str6 = labManager5.getUserType();
        java.lang.String str7 = labManager5.getPassword();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "labmanager" + "'", str6, "labmanager");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Student" + "'", str7, "Student");
    }

    @Test
    public void test1054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1054");
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
        com.reservation_system.repository.UserRepository userRepository20 = new com.reservation_system.repository.UserRepository("data/test-users.csv");
        boolean boolean21 = userRepository20.headLabCoordinatorExists();
        int int22 = userRepository20.getNextID();
        boolean boolean24 = userRepository20.emailExists("test@example.com");
        java.util.List<com.reservation_system.model.User> userList25 = userRepository20.getAllUsers();
        userRepository1.saveAllUsers(userList25);
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
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
// flaky "8) test1054(com.reservation_system.Randoop.AuthService.RegressionTest2)":         org.junit.Assert.assertTrue("'" + int22 + "' != '" + 99 + "'", int22 == 99);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertNotNull(userList25);
    }

    @Test
    public void test1055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1055");
        com.reservation_system.model.Student student5 = new com.reservation_system.model.Student((int) (byte) -1, "faculty", "", "guest", false);
    }

    @Test
    public void test1056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1056");
        com.reservation_system.model.Guest guest5 = new com.reservation_system.model.Guest((int) (byte) 100, "headlabcoordinator", "faculty", "Andrew", false);
        java.lang.String str6 = guest5.getName();
        java.lang.String str7 = guest5.getUserType();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "headlabcoordinator" + "'", str6, "headlabcoordinator");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Guest" + "'", str7, "Guest");
    }

    @Test
    public void test1057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1057");
        com.reservation_system.model.Faculty faculty5 = new com.reservation_system.model.Faculty((int) (byte) 0, "researcher", "Andrew", "WrongPassword1!", false);
        java.lang.String str6 = faculty5.getUserType();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Faculty" + "'", str6, "Faculty");
    }

    @Test
    public void test1058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1058");
        com.reservation_system.model.LabManager labManager5 = new com.reservation_system.model.LabManager((int) (byte) 1, "Password1!", "test@example.com", "", false);
    }

    @Test
    public void test1059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1059");
        com.reservation_system.model.Student student5 = new com.reservation_system.model.Student(1, "Researcher", "Andrew", "labmanager", false);
        java.lang.Class<?> wildcardClass6 = student5.getClass();
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test1060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1060");
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
        com.reservation_system.model.Researcher researcher21 = new com.reservation_system.model.Researcher(35, "headlabcoordinator", "data/test-users.csv", "headlabcoordinator", false);
        userRepository1.addUser((com.reservation_system.model.User) researcher21);
        org.junit.Assert.assertNotNull(userList2);
        org.junit.Assert.assertNotNull(userList3);
        org.junit.Assert.assertNotNull(userList6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(userList10);
        org.junit.Assert.assertNotNull(userList11);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
    }

    @Test
    public void test1061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1061");
        com.reservation_system.model.Guest guest5 = new com.reservation_system.model.Guest(98, "faculty", "student", "Andrew", false);
        java.lang.String str6 = guest5.getPassword();
        java.lang.String str7 = guest5.getUserType();
        java.lang.String str8 = guest5.getEmail();
        int int9 = guest5.getID();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Andrew" + "'", str6, "Andrew");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Guest" + "'", str7, "Guest");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "student" + "'", str8, "student");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 98 + "'", int9 == 98);
    }

    @Test
    public void test1062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1062");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("data/test-users.csv");
        java.util.List<com.reservation_system.model.User> userList2 = userRepository1.getAllUsers();
        com.reservation_system.services.AuthService authService3 = new com.reservation_system.services.AuthService(userRepository1);
        java.util.Optional<com.reservation_system.model.User> userOptional5 = userRepository1.findByEmail("");
        java.util.List<com.reservation_system.model.User> userList6 = userRepository1.getAllUsers();
        boolean boolean8 = userRepository1.emailExists("Andrew");
        boolean boolean10 = userRepository1.emailExists("headlabcoordinator");
        boolean boolean12 = userRepository1.emailExists("");
        org.junit.Assert.assertNotNull(userList2);
        org.junit.Assert.assertNotNull(userOptional5);
        org.junit.Assert.assertNotNull(userList6);
// flaky "9) test1062(com.reservation_system.Randoop.AuthService.RegressionTest2)":         org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test1063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1063");
        com.reservation_system.model.LabManager labManager5 = new com.reservation_system.model.LabManager(52, "test@example.com", "Guest", "Student", true);
        int int6 = labManager5.getID();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 52 + "'", int6 == 52);
    }

    @Test
    public void test1064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1064");
        com.reservation_system.model.Researcher researcher5 = new com.reservation_system.model.Researcher((int) 'a', "Andrew", "labmanager", "Researcher", false);
    }

    @Test
    public void test1065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1065");
        com.reservation_system.model.Guest guest5 = new com.reservation_system.model.Guest((int) (short) 100, "researcher", "labmanager", "guest", false);
    }

    @Test
    public void test1066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1066");
        com.reservation_system.model.Researcher researcher5 = new com.reservation_system.model.Researcher((int) (short) 1, "researcher", "", "", false);
        researcher5.setApproved(false);
        java.lang.String str8 = researcher5.getUserType();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Researcher" + "'", str8, "Researcher");
    }

    @Test
    public void test1067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1067");
        com.reservation_system.model.Student student5 = new com.reservation_system.model.Student(101, "Student", "", "", true);
    }

    @Test
    public void test1068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1068");
        com.reservation_system.model.LabManager labManager5 = new com.reservation_system.model.LabManager((int) (byte) 10, "", "labmanager", "WrongPassword1!", true);
    }

    @Test
    public void test1069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1069");
        com.reservation_system.model.Researcher researcher5 = new com.reservation_system.model.Researcher((int) (short) -1, "Guest", "Andrew", "Student", true);
        int int6 = researcher5.getID();
        boolean boolean7 = researcher5.requiresDepartmentApproval();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test1070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1070");
        com.reservation_system.model.Faculty faculty5 = new com.reservation_system.model.Faculty(0, "hi!", "Student", "Researcher", true);
        boolean boolean6 = faculty5.requiresDepartmentApproval();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test1071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1071");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("data/test-users.csv");
        java.util.List<com.reservation_system.model.User> userList2 = userRepository1.getAllUsers();
        boolean boolean3 = userRepository1.headLabCoordinatorExists();
        boolean boolean4 = userRepository1.headLabCoordinatorExists();
        java.util.List<com.reservation_system.model.User> userList5 = userRepository1.getAllUsers();
        java.util.Optional<com.reservation_system.model.User> userOptional7 = userRepository1.findByEmail("WrongPassword1!");
        java.util.Optional<com.reservation_system.model.User> userOptional9 = userRepository1.findByEmail("faculty");
        org.junit.Assert.assertNotNull(userList2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(userList5);
        org.junit.Assert.assertNotNull(userOptional7);
        org.junit.Assert.assertNotNull(userOptional9);
    }

    @Test
    public void test1072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1072");
        com.reservation_system.model.Faculty faculty5 = new com.reservation_system.model.Faculty((int) 'a', "Password1!", "guest", "Andrew", false);
        java.lang.String str6 = faculty5.getUserType();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Faculty" + "'", str6, "Faculty");
    }

    @Test
    public void test1073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1073");
        com.reservation_system.model.LabManager labManager5 = new com.reservation_system.model.LabManager(1, "data/test-users.csv", "researcher", "test@example.com", true);
    }

    @Test
    public void test1074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1074");
        com.reservation_system.model.User user6 = com.reservation_system.patterns.factory.UserFactory.createUser("Student", (int) (short) 10, "Andrew", "Guest", "Guest", true);
        org.junit.Assert.assertNotNull(user6);
    }

    @Test
    public void test1075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1075");
        com.reservation_system.model.User user6 = com.reservation_system.patterns.factory.UserFactory.createUser("guest", (int) (byte) 0, "labmanager", "", "student", true);
        org.junit.Assert.assertNotNull(user6);
    }

    @Test
    public void test1076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1076");
        com.reservation_system.model.Faculty faculty5 = new com.reservation_system.model.Faculty((int) '#', "researcher", "", "student", true);
        java.lang.String str6 = faculty5.getUserType();
        java.lang.String str7 = faculty5.getPassword();
        java.lang.String str8 = faculty5.getPassword();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Faculty" + "'", str6, "Faculty");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "student" + "'", str7, "student");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "student" + "'", str8, "student");
    }

    @Test
    public void test1077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1077");
        // The following exception was thrown during execution in test generation
        try {
            com.reservation_system.model.User user6 = com.reservation_system.patterns.factory.UserFactory.createUser("data/test-users.csv", (int) (short) 100, "Guest", "headlabcoordinator", "hi!", true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid user type: data/test-users.csv");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1078");
        com.reservation_system.model.Guest guest5 = new com.reservation_system.model.Guest(0, "test@example.com", "faculty", "faculty", true);
        java.lang.String str6 = guest5.getName();
        java.lang.String str7 = guest5.getUserType();
        java.lang.String str8 = guest5.getUserType();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Guest" + "'", str7, "Guest");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Guest" + "'", str8, "Guest");
    }

    @Test
    public void test1079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1079");
        com.reservation_system.model.Researcher researcher5 = new com.reservation_system.model.Researcher((-1), "Guest", "data/test-users.csv", "", true);
        java.lang.String str6 = researcher5.getUserType();
        java.lang.String str7 = researcher5.getUserType();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Researcher" + "'", str6, "Researcher");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Researcher" + "'", str7, "Researcher");
    }

    @Test
    public void test1080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1080");
        com.reservation_system.model.Guest guest5 = new com.reservation_system.model.Guest(98, "faculty", "Password1!", "WrongPassword1!", false);
        guest5.setApproved(false);
    }

    @Test
    public void test1081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1081");
        com.reservation_system.model.HeadLabCoordinator headLabCoordinator5 = new com.reservation_system.model.HeadLabCoordinator(98, "Faculty", "Password1!", "WrongPassword1!", true);
    }

    @Test
    public void test1082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1082");
        com.reservation_system.model.LabManager labManager5 = new com.reservation_system.model.LabManager((int) 'a', "hi!", "Password1!", "student", false);
        java.lang.String str6 = labManager5.getUserType();
        boolean boolean7 = labManager5.requiresDepartmentApproval();
        labManager5.setApproved(false);
        boolean boolean10 = labManager5.requiresDepartmentApproval();
        java.lang.String str11 = labManager5.getUserType();
        boolean boolean12 = labManager5.isApproved();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "labmanager" + "'", str6, "labmanager");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "labmanager" + "'", str11, "labmanager");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test1083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1083");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("data/test-users.csv");
        java.util.List<com.reservation_system.model.User> userList2 = userRepository1.getAllUsers();
        com.reservation_system.services.AuthService authService3 = new com.reservation_system.services.AuthService(userRepository1);
        com.reservation_system.model.LabManager labManager9 = new com.reservation_system.model.LabManager((int) (short) 0, "", "student", "Andrew", true);
        boolean boolean10 = labManager9.isApproved();
        userRepository1.addUser((com.reservation_system.model.User) labManager9);
        com.reservation_system.services.AuthService authService12 = new com.reservation_system.services.AuthService(userRepository1);
        int int13 = userRepository1.getNextID();
        com.reservation_system.repository.UserRepository userRepository15 = new com.reservation_system.repository.UserRepository("data/test-users.csv");
        java.util.List<com.reservation_system.model.User> userList16 = userRepository15.getAllUsers();
        com.reservation_system.services.AuthService authService17 = new com.reservation_system.services.AuthService(userRepository15);
        com.reservation_system.services.AuthService authService18 = new com.reservation_system.services.AuthService(userRepository15);
        com.reservation_system.services.AuthService authService19 = new com.reservation_system.services.AuthService(userRepository15);
        boolean boolean21 = userRepository15.emailExists("researcher");
        com.reservation_system.services.AuthService authService22 = new com.reservation_system.services.AuthService(userRepository15);
        com.reservation_system.repository.UserRepository userRepository24 = new com.reservation_system.repository.UserRepository("data/test-users.csv");
        java.util.List<com.reservation_system.model.User> userList25 = userRepository24.getAllUsers();
        boolean boolean26 = userRepository24.headLabCoordinatorExists();
        com.reservation_system.repository.UserRepository userRepository28 = new com.reservation_system.repository.UserRepository("data/test-users.csv");
        java.util.List<com.reservation_system.model.User> userList29 = userRepository28.getAllUsers();
        java.util.List<com.reservation_system.model.User> userList30 = userRepository28.getAllUsers();
        userRepository24.saveAllUsers(userList30);
        com.reservation_system.repository.UserRepository userRepository33 = new com.reservation_system.repository.UserRepository("data/test-users.csv");
        java.util.List<com.reservation_system.model.User> userList34 = userRepository33.getAllUsers();
        boolean boolean35 = userRepository33.headLabCoordinatorExists();
        boolean boolean36 = userRepository33.headLabCoordinatorExists();
        java.util.List<com.reservation_system.model.User> userList37 = userRepository33.getAllUsers();
        userRepository24.saveAllUsers(userList37);
        boolean boolean39 = userRepository24.headLabCoordinatorExists();
        com.reservation_system.services.AuthService authService40 = new com.reservation_system.services.AuthService(userRepository24);
        java.util.List<com.reservation_system.model.User> userList41 = userRepository24.getAllUsers();
        userRepository15.saveAllUsers(userList41);
        userRepository1.saveAllUsers(userList41);
        org.junit.Assert.assertNotNull(userList2);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
// flaky "10) test1083(com.reservation_system.Randoop.AuthService.RegressionTest2)":         org.junit.Assert.assertTrue("'" + int13 + "' != '" + 99 + "'", int13 == 99);
        org.junit.Assert.assertNotNull(userList16);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertNotNull(userList25);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertNotNull(userList29);
        org.junit.Assert.assertNotNull(userList30);
        org.junit.Assert.assertNotNull(userList34);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertNotNull(userList37);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
        org.junit.Assert.assertNotNull(userList41);
    }

    @Test
    public void test1084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1084");
        com.reservation_system.model.Student student5 = new com.reservation_system.model.Student(36, "faculty", "headlabcoordinator", "labmanager", true);
        java.lang.String str6 = student5.getUserType();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Student" + "'", str6, "Student");
    }

    @Test
    public void test1085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1085");
        com.reservation_system.model.Faculty faculty5 = new com.reservation_system.model.Faculty(35, "Student", "faculty", "Andrew", true);
    }

    @Test
    public void test1086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1086");
        com.reservation_system.model.Researcher researcher5 = new com.reservation_system.model.Researcher(98, "", "", "faculty", false);
    }

    @Test
    public void test1087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1087");
        com.reservation_system.model.Student student5 = new com.reservation_system.model.Student((int) (short) -1, "Password1!", "Guest", "guest", true);
        java.lang.String str6 = student5.getUserType();
        java.lang.String str7 = student5.getUserType();
        java.lang.String str8 = student5.getPassword();
        java.lang.String str9 = student5.getUserType();
        java.lang.String str10 = student5.getName();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Student" + "'", str6, "Student");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Student" + "'", str7, "Student");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "guest" + "'", str8, "guest");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Student" + "'", str9, "Student");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Password1!" + "'", str10, "Password1!");
    }

    @Test
    public void test1088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1088");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("data/test-users.csv");
        boolean boolean2 = userRepository1.headLabCoordinatorExists();
        int int3 = userRepository1.getNextID();
        boolean boolean5 = userRepository1.emailExists("test@example.com");
        java.util.List<com.reservation_system.model.User> userList6 = userRepository1.getAllUsers();
        int int7 = userRepository1.getNextID();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
// flaky "11) test1088(com.reservation_system.Randoop.AuthService.RegressionTest2)":         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 99 + "'", int3 == 99);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(userList6);
// flaky "4) test1088(com.reservation_system.Randoop.AuthService.RegressionTest2)":         org.junit.Assert.assertTrue("'" + int7 + "' != '" + 99 + "'", int7 == 99);
    }

    @Test
    public void test1089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1089");
        com.reservation_system.model.LabManager labManager5 = new com.reservation_system.model.LabManager(99, "Andrew", "guest", "labmanager", false);
        java.lang.String str6 = labManager5.getUserType();
        java.lang.String str7 = labManager5.getName();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "labmanager" + "'", str6, "labmanager");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Andrew" + "'", str7, "Andrew");
    }

    @Test
    public void test1090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1090");
        com.reservation_system.model.Guest guest5 = new com.reservation_system.model.Guest((int) ' ', "Andrew", "Andrew", "labmanager", true);
    }

    @Test
    public void test1091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1091");
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
        com.reservation_system.repository.UserRepository userRepository30 = new com.reservation_system.repository.UserRepository("data/test-users.csv");
        java.util.List<com.reservation_system.model.User> userList31 = userRepository30.getAllUsers();
        com.reservation_system.services.AuthService authService32 = new com.reservation_system.services.AuthService(userRepository30);
        com.reservation_system.services.AuthService authService33 = new com.reservation_system.services.AuthService(userRepository30);
        boolean boolean34 = userRepository30.headLabCoordinatorExists();
        java.util.List<com.reservation_system.model.User> userList35 = userRepository30.getAllUsers();
        java.util.List<com.reservation_system.model.User> userList36 = userRepository30.getAllUsers();
        userRepository1.saveAllUsers(userList36);
        org.junit.Assert.assertNotNull(userList2);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
// flaky "12) test1091(com.reservation_system.Randoop.AuthService.RegressionTest2)":         org.junit.Assert.assertTrue("'" + int13 + "' != '" + 99 + "'", int13 == 99);
// flaky "5) test1091(com.reservation_system.Randoop.AuthService.RegressionTest2)":         org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(userOptional17);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "Researcher" + "'", str24, "Researcher");
// flaky "3) test1091(com.reservation_system.Randoop.AuthService.RegressionTest2)":         org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(userList28);
        org.junit.Assert.assertNotNull(userList31);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertNotNull(userList35);
        org.junit.Assert.assertNotNull(userList36);
    }

    @Test
    public void test1092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1092");
        com.reservation_system.model.Researcher researcher5 = new com.reservation_system.model.Researcher((int) (byte) -1, "", "Guest", "hi!", true);
    }

    @Test
    public void test1093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1093");
        com.reservation_system.model.User user6 = com.reservation_system.patterns.factory.UserFactory.createUser("researcher", (int) (short) 100, "Password1!", "hi!", "WrongPassword1!", false);
        org.junit.Assert.assertNotNull(user6);
    }

    @Test
    public void test1094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1094");
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
        boolean boolean25 = userRepository1.emailExists("student");
        org.junit.Assert.assertNotNull(userList2);
        org.junit.Assert.assertNotNull(userList3);
        org.junit.Assert.assertNotNull(userList6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(userList10);
        org.junit.Assert.assertNotNull(userList11);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
    }

    @Test
    public void test1095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1095");
        com.reservation_system.model.Researcher researcher5 = new com.reservation_system.model.Researcher((int) (short) -1, "researcher", "test@example.com", "Faculty", true);
        java.lang.String str6 = researcher5.getUserType();
        boolean boolean7 = researcher5.requiresDepartmentApproval();
        java.lang.String str8 = researcher5.getUserType();
        java.lang.String str9 = researcher5.getPassword();
        boolean boolean10 = researcher5.isApproved();
        java.lang.String str11 = researcher5.getPassword();
        boolean boolean12 = researcher5.isApproved();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Researcher" + "'", str6, "Researcher");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Researcher" + "'", str8, "Researcher");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Faculty" + "'", str9, "Faculty");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Faculty" + "'", str11, "Faculty");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test1096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1096");
        com.reservation_system.model.Student student5 = new com.reservation_system.model.Student((int) (short) 10, "labmanager", "test@example.com", "data/test-users.csv", true);
        java.lang.String str6 = student5.getPassword();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "data/test-users.csv" + "'", str6, "data/test-users.csv");
    }

    @Test
    public void test1097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1097");
        com.reservation_system.model.Researcher researcher5 = new com.reservation_system.model.Researcher((int) (byte) -1, "researcher", "Faculty", "Student", true);
    }

    @Test
    public void test1098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1098");
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
        com.reservation_system.services.AuthService authService16 = new com.reservation_system.services.AuthService(userRepository1);
        // The following exception was thrown during execution in test generation
        try {
            com.reservation_system.model.User user19 = authService16.login("data/test-users.csv", "student");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Incorrect password.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 101 + "'", int3 == 101);
        org.junit.Assert.assertNotNull(userList4);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "labmanager" + "'", str11, "labmanager");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
    }

    @Test
    public void test1099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1099");
        com.reservation_system.model.Researcher researcher5 = new com.reservation_system.model.Researcher(1, "WrongPassword1!", "faculty", "Guest", false);
    }

    @Test
    public void test1100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1100");
        com.reservation_system.model.HeadLabCoordinator headLabCoordinator5 = new com.reservation_system.model.HeadLabCoordinator((int) 'a', "Student", "hi!", "Andrew", true);
        java.lang.String str6 = headLabCoordinator5.getName();
        java.lang.String str7 = headLabCoordinator5.getUserType();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Student" + "'", str6, "Student");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "headlabcoordinator" + "'", str7, "headlabcoordinator");
    }

    @Test
    public void test1101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1101");
        com.reservation_system.model.Researcher researcher5 = new com.reservation_system.model.Researcher(35, "headlabcoordinator", "data/test-users.csv", "headlabcoordinator", false);
        java.lang.String str6 = researcher5.getUserType();
        java.lang.String str7 = researcher5.getUserType();
        java.lang.String str8 = researcher5.getName();
        java.lang.String str9 = researcher5.getEmail();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Researcher" + "'", str6, "Researcher");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Researcher" + "'", str7, "Researcher");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "headlabcoordinator" + "'", str8, "headlabcoordinator");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "data/test-users.csv" + "'", str9, "data/test-users.csv");
    }

    @Test
    public void test1102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1102");
        com.reservation_system.model.Student student5 = new com.reservation_system.model.Student(0, "student", "Andrew", "guest", false);
        java.lang.String str6 = student5.getPassword();
        java.lang.String str7 = student5.getUserType();
        java.lang.String str8 = student5.getUserType();
        java.lang.String str9 = student5.getUserType();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "guest" + "'", str6, "guest");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Student" + "'", str7, "Student");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Student" + "'", str8, "Student");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Student" + "'", str9, "Student");
    }

    @Test
    public void test1103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1103");
        com.reservation_system.model.HeadLabCoordinator headLabCoordinator5 = new com.reservation_system.model.HeadLabCoordinator((int) (short) -1, "Faculty", "WrongPassword1!", "WrongPassword1!", true);
    }

    @Test
    public void test1104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1104");
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
        java.lang.String str26 = researcher18.getUserType();
        org.junit.Assert.assertNotNull(userList2);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "Researcher" + "'", str19, "Researcher");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "Researcher" + "'", str20, "Researcher");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "Researcher" + "'", str21, "Researcher");
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "Researcher" + "'", str26, "Researcher");
    }

    @Test
    public void test1105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1105");
        com.reservation_system.model.Guest guest5 = new com.reservation_system.model.Guest(98, "faculty", "student", "Andrew", false);
        java.lang.String str6 = guest5.getPassword();
        java.lang.String str7 = guest5.getUserType();
        java.lang.String str8 = guest5.getEmail();
        java.lang.String str9 = guest5.getEmail();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Andrew" + "'", str6, "Andrew");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Guest" + "'", str7, "Guest");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "student" + "'", str8, "student");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "student" + "'", str9, "student");
    }

    @Test
    public void test1106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1106");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("data/test-users.csv");
        java.util.List<com.reservation_system.model.User> userList2 = userRepository1.getAllUsers();
        boolean boolean3 = userRepository1.headLabCoordinatorExists();
        boolean boolean4 = userRepository1.headLabCoordinatorExists();
        java.util.List<com.reservation_system.model.User> userList5 = userRepository1.getAllUsers();
        java.util.Optional<com.reservation_system.model.User> userOptional7 = userRepository1.findByEmail("headlabcoordinator");
        com.reservation_system.repository.UserRepository userRepository9 = new com.reservation_system.repository.UserRepository("data/test-users.csv");
        java.util.List<com.reservation_system.model.User> userList10 = userRepository9.getAllUsers();
        boolean boolean11 = userRepository9.headLabCoordinatorExists();
        com.reservation_system.repository.UserRepository userRepository13 = new com.reservation_system.repository.UserRepository("data/test-users.csv");
        java.util.List<com.reservation_system.model.User> userList14 = userRepository13.getAllUsers();
        java.util.List<com.reservation_system.model.User> userList15 = userRepository13.getAllUsers();
        userRepository9.saveAllUsers(userList15);
        com.reservation_system.repository.UserRepository userRepository18 = new com.reservation_system.repository.UserRepository("data/test-users.csv");
        java.util.List<com.reservation_system.model.User> userList19 = userRepository18.getAllUsers();
        boolean boolean20 = userRepository18.headLabCoordinatorExists();
        boolean boolean21 = userRepository18.headLabCoordinatorExists();
        java.util.List<com.reservation_system.model.User> userList22 = userRepository18.getAllUsers();
        userRepository9.saveAllUsers(userList22);
        boolean boolean24 = userRepository9.headLabCoordinatorExists();
        boolean boolean26 = userRepository9.emailExists("Student");
        com.reservation_system.repository.UserRepository userRepository28 = new com.reservation_system.repository.UserRepository("data/test-users.csv");
        java.util.List<com.reservation_system.model.User> userList29 = userRepository28.getAllUsers();
        java.util.List<com.reservation_system.model.User> userList30 = userRepository28.getAllUsers();
        com.reservation_system.services.AuthService authService31 = new com.reservation_system.services.AuthService(userRepository28);
        java.util.Optional<com.reservation_system.model.User> userOptional33 = userRepository28.findByEmail("faculty");
        com.reservation_system.services.AuthService authService34 = new com.reservation_system.services.AuthService(userRepository28);
        java.util.List<com.reservation_system.model.User> userList35 = userRepository28.getAllUsers();
        userRepository9.saveAllUsers(userList35);
        userRepository1.saveAllUsers(userList35);
        java.util.Optional<com.reservation_system.model.User> userOptional39 = userRepository1.findByEmail("Student");
        com.reservation_system.model.Researcher researcher45 = new com.reservation_system.model.Researcher((int) (short) -1, "researcher", "test@example.com", "Faculty", true);
        boolean boolean46 = researcher45.requiresDepartmentApproval();
        boolean boolean47 = researcher45.isApproved();
        java.lang.String str48 = researcher45.getEmail();
        userRepository1.addUser((com.reservation_system.model.User) researcher45);
        researcher45.setApproved(false);
        org.junit.Assert.assertNotNull(userList2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(userList5);
        org.junit.Assert.assertNotNull(userOptional7);
        org.junit.Assert.assertNotNull(userList10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(userList14);
        org.junit.Assert.assertNotNull(userList15);
        org.junit.Assert.assertNotNull(userList19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertNotNull(userList22);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertNotNull(userList29);
        org.junit.Assert.assertNotNull(userList30);
        org.junit.Assert.assertNotNull(userOptional33);
        org.junit.Assert.assertNotNull(userList35);
        org.junit.Assert.assertNotNull(userOptional39);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + true + "'", boolean46 == true);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + true + "'", boolean47 == true);
    }

    @Test
    public void test1107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1107");
        com.reservation_system.model.Researcher researcher5 = new com.reservation_system.model.Researcher((int) (short) -1, "headlabcoordinator", "student", "", false);
        boolean boolean6 = researcher5.isApproved();
        java.lang.String str7 = researcher5.getEmail();
        java.lang.String str8 = researcher5.getUserType();
        java.lang.String str9 = researcher5.getUserType();
        java.lang.String str10 = researcher5.getUserType();
        boolean boolean11 = researcher5.requiresDepartmentApproval();
        java.lang.String str12 = researcher5.getUserType();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "student" + "'", str7, "student");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Researcher" + "'", str8, "Researcher");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Researcher" + "'", str9, "Researcher");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Researcher" + "'", str10, "Researcher");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Researcher" + "'", str12, "Researcher");
    }

    @Test
    public void test1108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1108");
        com.reservation_system.model.Faculty faculty5 = new com.reservation_system.model.Faculty((int) (byte) -1, "", "", "WrongPassword1!", true);
        faculty5.setApproved(true);
        java.lang.String str8 = faculty5.getUserType();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Faculty" + "'", str8, "Faculty");
    }

    @Test
    public void test1109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1109");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("data/test-users.csv");
        java.util.List<com.reservation_system.model.User> userList2 = userRepository1.getAllUsers();
        com.reservation_system.services.AuthService authService3 = new com.reservation_system.services.AuthService(userRepository1);
        com.reservation_system.services.AuthService authService4 = new com.reservation_system.services.AuthService(userRepository1);
        com.reservation_system.services.AuthService authService5 = new com.reservation_system.services.AuthService(userRepository1);
        int int6 = userRepository1.getNextID();
        boolean boolean7 = userRepository1.headLabCoordinatorExists();
        java.util.Optional<com.reservation_system.model.User> userOptional9 = userRepository1.findByEmail("");
        org.junit.Assert.assertNotNull(userList2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 101 + "'", int6 == 101);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(userOptional9);
    }

    @Test
    public void test1110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1110");
        com.reservation_system.model.LabManager labManager5 = new com.reservation_system.model.LabManager(0, "student", "data/test-users.csv", "headlabcoordinator", true);
        int int6 = labManager5.getID();
        java.lang.String str7 = labManager5.getUserType();
        labManager5.setApproved(true);
        labManager5.setApproved(false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "labmanager" + "'", str7, "labmanager");
    }

    @Test
    public void test1111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1111");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("data/test-users.csv");
        java.util.List<com.reservation_system.model.User> userList2 = userRepository1.getAllUsers();
        com.reservation_system.services.AuthService authService3 = new com.reservation_system.services.AuthService(userRepository1);
        com.reservation_system.services.AuthService authService4 = new com.reservation_system.services.AuthService(userRepository1);
        com.reservation_system.services.AuthService authService5 = new com.reservation_system.services.AuthService(userRepository1);
        com.reservation_system.model.LabManager labManager11 = new com.reservation_system.model.LabManager((int) (short) 0, "", "student", "Andrew", true);
        java.lang.String str12 = labManager11.getUserType();
        userRepository1.addUser((com.reservation_system.model.User) labManager11);
        int int14 = userRepository1.getNextID();
        com.reservation_system.model.HeadLabCoordinator headLabCoordinator20 = new com.reservation_system.model.HeadLabCoordinator((int) '#', "headlabcoordinator", "Andrew", "Faculty", false);
        java.lang.String str21 = headLabCoordinator20.getPassword();
        headLabCoordinator20.setApproved(false);
        userRepository1.addUser((com.reservation_system.model.User) headLabCoordinator20);
        org.junit.Assert.assertNotNull(userList2);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "labmanager" + "'", str12, "labmanager");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 101 + "'", int14 == 101);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "Faculty" + "'", str21, "Faculty");
    }

    @Test
    public void test1112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1112");
        com.reservation_system.model.Student student5 = new com.reservation_system.model.Student(32, "guest", "Password1!", "student", false);
    }

    @Test
    public void test1113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1113");
        com.reservation_system.model.HeadLabCoordinator headLabCoordinator5 = new com.reservation_system.model.HeadLabCoordinator(98, "headlabcoordinator", "Andrew", "guest", false);
        java.lang.String str6 = headLabCoordinator5.getUserType();
        java.lang.String str7 = headLabCoordinator5.getPassword();
        java.lang.String str8 = headLabCoordinator5.getEmail();
        java.lang.String str9 = headLabCoordinator5.getUserType();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "headlabcoordinator" + "'", str6, "headlabcoordinator");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "guest" + "'", str7, "guest");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Andrew" + "'", str8, "Andrew");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "headlabcoordinator" + "'", str9, "headlabcoordinator");
    }

    @Test
    public void test1114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1114");
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
        com.reservation_system.model.Student student38 = new com.reservation_system.model.Student((int) (byte) -1, "", "faculty", "test@example.com", true);
        java.lang.String str39 = student38.getUserType();
        userRepository1.addUser((com.reservation_system.model.User) student38);
        java.util.Optional<com.reservation_system.model.User> userOptional42 = userRepository1.findByEmail("Student");
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
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "Student" + "'", str39, "Student");
        org.junit.Assert.assertNotNull(userOptional42);
    }

    @Test
    public void test1115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1115");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("data/test-users.csv");
        java.util.List<com.reservation_system.model.User> userList2 = userRepository1.getAllUsers();
        boolean boolean3 = userRepository1.headLabCoordinatorExists();
        boolean boolean4 = userRepository1.headLabCoordinatorExists();
        com.reservation_system.model.HeadLabCoordinator headLabCoordinator10 = new com.reservation_system.model.HeadLabCoordinator(1, "faculty", "Faculty", "", true);
        userRepository1.addUser((com.reservation_system.model.User) headLabCoordinator10);
        java.lang.String str12 = headLabCoordinator10.getEmail();
        java.lang.String str13 = headLabCoordinator10.getUserType();
        org.junit.Assert.assertNotNull(userList2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Faculty" + "'", str12, "Faculty");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "headlabcoordinator" + "'", str13, "headlabcoordinator");
    }

    @Test
    public void test1116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1116");
        com.reservation_system.model.Researcher researcher5 = new com.reservation_system.model.Researcher((int) (short) -1, "Guest", "Andrew", "Student", true);
        java.lang.String str6 = researcher5.getPassword();
        int int7 = researcher5.getID();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Student" + "'", str6, "Student");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
    }

    @Test
    public void test1117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1117");
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
        com.reservation_system.repository.UserRepository userRepository17 = new com.reservation_system.repository.UserRepository("data/test-users.csv");
        java.util.List<com.reservation_system.model.User> userList18 = userRepository17.getAllUsers();
        com.reservation_system.services.AuthService authService19 = new com.reservation_system.services.AuthService(userRepository17);
        java.util.Optional<com.reservation_system.model.User> userOptional21 = userRepository17.findByEmail("");
        java.util.List<com.reservation_system.model.User> userList22 = userRepository17.getAllUsers();
        userRepository1.saveAllUsers(userList22);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 101 + "'", int3 == 101);
        org.junit.Assert.assertNotNull(userList4);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "labmanager" + "'", str11, "labmanager");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertNotNull(userList18);
        org.junit.Assert.assertNotNull(userOptional21);
        org.junit.Assert.assertNotNull(userList22);
    }

    @Test
    public void test1118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1118");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("data/test-users.csv");
        java.util.List<com.reservation_system.model.User> userList2 = userRepository1.getAllUsers();
        boolean boolean3 = userRepository1.headLabCoordinatorExists();
        com.reservation_system.services.AuthService authService4 = new com.reservation_system.services.AuthService(userRepository1);
        int int5 = userRepository1.getNextID();
        java.lang.Class<?> wildcardClass6 = userRepository1.getClass();
        org.junit.Assert.assertNotNull(userList2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 101 + "'", int5 == 101);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test1119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1119");
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
        com.reservation_system.services.AuthService authService24 = new com.reservation_system.services.AuthService(userRepository1);
        // The following exception was thrown during execution in test generation
        try {
            com.reservation_system.model.User user27 = authService24.login("guest", "test@example.com");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: No user found with that email.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(userList2);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(userList14);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
    }

    @Test
    public void test1120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1120");
        com.reservation_system.model.User user6 = com.reservation_system.patterns.factory.UserFactory.createUser("Faculty", (int) (short) 1, "Guest", "Researcher", "WrongPassword1!", true);
        org.junit.Assert.assertNotNull(user6);
    }

    @Test
    public void test1121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1121");
        com.reservation_system.model.Faculty faculty5 = new com.reservation_system.model.Faculty((int) (short) 0, "guest", "researcher", "faculty", false);
    }

    @Test
    public void test1122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1122");
        com.reservation_system.model.User user6 = com.reservation_system.patterns.factory.UserFactory.createUser("student", (int) (byte) 0, "", "researcher", "Password1!", true);
        java.lang.String str7 = user6.getPassword();
        org.junit.Assert.assertNotNull(user6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Password1!" + "'", str7, "Password1!");
    }

    @Test
    public void test1123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1123");
        com.reservation_system.model.LabManager labManager5 = new com.reservation_system.model.LabManager(32, "Guest", "", "", true);
    }

    @Test
    public void test1124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1124");
        com.reservation_system.model.LabManager labManager5 = new com.reservation_system.model.LabManager((-1), "hi!", "Faculty", "student", true);
    }

    @Test
    public void test1125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1125");
        com.reservation_system.model.Guest guest5 = new com.reservation_system.model.Guest((int) (short) -1, "data/test-users.csv", "Faculty", "guest", true);
    }

    @Test
    public void test1126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1126");
        // The following exception was thrown during execution in test generation
        try {
            com.reservation_system.model.User user6 = com.reservation_system.patterns.factory.UserFactory.createUser("Andrew", (int) (short) 10, "hi!", "Andrew", "Andrew", false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid user type: Andrew");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1127");
        com.reservation_system.model.Faculty faculty5 = new com.reservation_system.model.Faculty((int) (byte) 10, "labmanager", "Guest", "", false);
        boolean boolean6 = faculty5.requiresDepartmentApproval();
        java.lang.String str7 = faculty5.getUserType();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Faculty" + "'", str7, "Faculty");
    }

    @Test
    public void test1128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1128");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("data/test-users.csv");
        java.util.List<com.reservation_system.model.User> userList2 = userRepository1.getAllUsers();
        com.reservation_system.services.AuthService authService3 = new com.reservation_system.services.AuthService(userRepository1);
        java.util.Optional<com.reservation_system.model.User> userOptional5 = userRepository1.findByEmail("");
        java.util.List<com.reservation_system.model.User> userList6 = userRepository1.getAllUsers();
        boolean boolean8 = userRepository1.emailExists("labmanager");
        com.reservation_system.model.Researcher researcher14 = new com.reservation_system.model.Researcher(10, "Password1!", "Password1!", "headlabcoordinator", true);
        java.lang.String str15 = researcher14.getUserType();
        java.lang.String str16 = researcher14.getUserType();
        java.lang.String str17 = researcher14.getUserType();
        researcher14.setApproved(true);
        java.lang.String str20 = researcher14.getPassword();
        userRepository1.addUser((com.reservation_system.model.User) researcher14);
        boolean boolean23 = userRepository1.emailExists("Researcher");
        org.junit.Assert.assertNotNull(userList2);
        org.junit.Assert.assertNotNull(userOptional5);
        org.junit.Assert.assertNotNull(userList6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Researcher" + "'", str15, "Researcher");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Researcher" + "'", str16, "Researcher");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "Researcher" + "'", str17, "Researcher");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "headlabcoordinator" + "'", str20, "headlabcoordinator");
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
    }

    @Test
    public void test1129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1129");
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
        java.lang.String str21 = labManager19.getUserType();
        org.junit.Assert.assertNotNull(userList2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 101 + "'", int4 == 101);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(userList8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(userList11);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "labmanager" + "'", str21, "labmanager");
    }

    @Test
    public void test1130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1130");
        com.reservation_system.model.LabManager labManager5 = new com.reservation_system.model.LabManager(100, "", "Andrew", "Faculty", true);
    }

    @Test
    public void test1131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1131");
        com.reservation_system.model.User user6 = com.reservation_system.patterns.factory.UserFactory.createUser("Researcher", 101, "Student", "Password1!", "", true);
        org.junit.Assert.assertNotNull(user6);
    }

    @Test
    public void test1132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1132");
        com.reservation_system.model.Researcher researcher5 = new com.reservation_system.model.Researcher(100, "hi!", "Researcher", "Researcher", false);
    }

    @Test
    public void test1133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1133");
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
        java.lang.Class<?> wildcardClass38 = userList36.getClass();
        org.junit.Assert.assertNotNull(userList2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 101 + "'", int4 == 101);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(userList8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(userList11);
        org.junit.Assert.assertNotNull(userList24);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
        org.junit.Assert.assertNotNull(userList36);
        org.junit.Assert.assertNotNull(wildcardClass38);
    }

    @Test
    public void test1134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1134");
        com.reservation_system.model.Researcher researcher5 = new com.reservation_system.model.Researcher(36, "faculty", "student", "Researcher", false);
    }

    @Test
    public void test1135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1135");
        com.reservation_system.model.HeadLabCoordinator headLabCoordinator5 = new com.reservation_system.model.HeadLabCoordinator((int) '4', "faculty", "student", "WrongPassword1!", true);
        java.lang.String str6 = headLabCoordinator5.getUserType();
        java.lang.String str7 = headLabCoordinator5.getPassword();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "headlabcoordinator" + "'", str6, "headlabcoordinator");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "WrongPassword1!" + "'", str7, "WrongPassword1!");
    }

    @Test
    public void test1136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1136");
        com.reservation_system.model.HeadLabCoordinator headLabCoordinator5 = new com.reservation_system.model.HeadLabCoordinator(32, "Andrew", "Faculty", "", true);
    }

    @Test
    public void test1137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1137");
        com.reservation_system.model.Student student5 = new com.reservation_system.model.Student((int) 'a', "Guest", "Researcher", "Researcher", true);
    }

    @Test
    public void test1138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1138");
        com.reservation_system.model.HeadLabCoordinator headLabCoordinator5 = new com.reservation_system.model.HeadLabCoordinator(10, "headlabcoordinator", "data/test-users.csv", "faculty", false);
        java.lang.String str6 = headLabCoordinator5.getUserType();
        java.lang.String str7 = headLabCoordinator5.getPassword();
        java.lang.String str8 = headLabCoordinator5.getUserType();
        java.lang.String str9 = headLabCoordinator5.getName();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "headlabcoordinator" + "'", str6, "headlabcoordinator");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "faculty" + "'", str7, "faculty");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "headlabcoordinator" + "'", str8, "headlabcoordinator");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "headlabcoordinator" + "'", str9, "headlabcoordinator");
    }

    @Test
    public void test1139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1139");
        com.reservation_system.model.LabManager labManager5 = new com.reservation_system.model.LabManager((int) 'a', "hi!", "Password1!", "student", false);
        java.lang.String str6 = labManager5.getUserType();
        labManager5.setApproved(false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "labmanager" + "'", str6, "labmanager");
    }

    @Test
    public void test1140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1140");
        com.reservation_system.model.HeadLabCoordinator headLabCoordinator5 = new com.reservation_system.model.HeadLabCoordinator((int) 'a', "data/test-users.csv", "headlabcoordinator", "hi!", true);
        boolean boolean6 = headLabCoordinator5.requiresDepartmentApproval();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test1141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1141");
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
        boolean boolean24 = userRepository1.headLabCoordinatorExists();
        java.util.List<com.reservation_system.model.User> userList25 = userRepository1.getAllUsers();
        java.util.List<com.reservation_system.model.User> userList26 = userRepository1.getAllUsers();
        org.junit.Assert.assertNotNull(userList2);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertNotNull(userList25);
        org.junit.Assert.assertNotNull(userList26);
    }

    @Test
    public void test1142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1142");
        com.reservation_system.model.LabManager labManager5 = new com.reservation_system.model.LabManager((int) (short) -1, "guest", "Student", "WrongPassword1!", false);
        java.lang.String str6 = labManager5.getUserType();
        boolean boolean7 = labManager5.requiresDepartmentApproval();
        java.lang.String str8 = labManager5.getUserType();
        java.lang.String str9 = labManager5.getUserType();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "labmanager" + "'", str6, "labmanager");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "labmanager" + "'", str8, "labmanager");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "labmanager" + "'", str9, "labmanager");
    }

    @Test
    public void test1143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1143");
        com.reservation_system.model.Student student5 = new com.reservation_system.model.Student(0, "data/test-users.csv", "headlabcoordinator", "faculty", true);
    }

    @Test
    public void test1144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1144");
        com.reservation_system.model.Student student5 = new com.reservation_system.model.Student(0, "Researcher", "student", "Guest", true);
        java.lang.Class<?> wildcardClass6 = student5.getClass();
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test1145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1145");
        com.reservation_system.model.LabManager labManager5 = new com.reservation_system.model.LabManager((int) (short) 0, "", "student", "Andrew", true);
        boolean boolean6 = labManager5.isApproved();
        labManager5.setApproved(true);
        java.lang.String str9 = labManager5.getUserType();
        java.lang.String str10 = labManager5.getPassword();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "labmanager" + "'", str9, "labmanager");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Andrew" + "'", str10, "Andrew");
    }

    @Test
    public void test1146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1146");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("data/test-users.csv");
        java.util.List<com.reservation_system.model.User> userList2 = userRepository1.getAllUsers();
        boolean boolean3 = userRepository1.headLabCoordinatorExists();
        com.reservation_system.services.AuthService authService4 = new com.reservation_system.services.AuthService(userRepository1);
        // The following exception was thrown during execution in test generation
        try {
            com.reservation_system.model.User user7 = authService4.login("data/test-users.csv", "student");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Incorrect password.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(userList2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
    }

    @Test
    public void test1147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1147");
        com.reservation_system.model.Guest guest5 = new com.reservation_system.model.Guest(52, "headlabcoordinator", "", "Researcher", false);
    }

    @Test
    public void test1148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1148");
        com.reservation_system.model.LabManager labManager5 = new com.reservation_system.model.LabManager((int) (short) -1, "guest", "Student", "WrongPassword1!", false);
        java.lang.String str6 = labManager5.getName();
        int int7 = labManager5.getID();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "guest" + "'", str6, "guest");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
    }

    @Test
    public void test1149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1149");
        com.reservation_system.model.HeadLabCoordinator headLabCoordinator5 = new com.reservation_system.model.HeadLabCoordinator((int) (short) 0, "test@example.com", "faculty", "student", false);
    }

    @Test
    public void test1150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1150");
        com.reservation_system.model.Researcher researcher5 = new com.reservation_system.model.Researcher((int) (short) 10, "Guest", "", "test@example.com", true);
        java.lang.Class<?> wildcardClass6 = researcher5.getClass();
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test1151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1151");
        com.reservation_system.model.HeadLabCoordinator headLabCoordinator5 = new com.reservation_system.model.HeadLabCoordinator(98, "headlabcoordinator", "Andrew", "guest", false);
        java.lang.String str6 = headLabCoordinator5.getUserType();
        int int7 = headLabCoordinator5.getID();
        boolean boolean8 = headLabCoordinator5.isApproved();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "headlabcoordinator" + "'", str6, "headlabcoordinator");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 98 + "'", int7 == 98);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test1152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1152");
        com.reservation_system.model.Guest guest5 = new com.reservation_system.model.Guest(1, "Guest", "Password1!", "Password1!", true);
        java.lang.String str6 = guest5.getUserType();
        boolean boolean7 = guest5.requiresDepartmentApproval();
        java.lang.String str8 = guest5.getUserType();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Guest" + "'", str6, "Guest");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Guest" + "'", str8, "Guest");
    }

    @Test
    public void test1153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1153");
        com.reservation_system.model.Student student5 = new com.reservation_system.model.Student(102, "hi!", "headlabcoordinator", "headlabcoordinator", true);
    }

    @Test
    public void test1154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1154");
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
        boolean boolean17 = userRepository1.headLabCoordinatorExists();
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
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
    }

    @Test
    public void test1155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1155");
        com.reservation_system.model.User user6 = com.reservation_system.patterns.factory.UserFactory.createUser("Student", 98, "labmanager", "guest", "Researcher", true);
        org.junit.Assert.assertNotNull(user6);
    }

    @Test
    public void test1156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1156");
        com.reservation_system.model.User user6 = com.reservation_system.patterns.factory.UserFactory.createUser("Researcher", (int) (short) 10, "hi!", "faculty", "faculty", false);
        org.junit.Assert.assertNotNull(user6);
    }

    @Test
    public void test1157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1157");
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
        java.util.Optional<com.reservation_system.model.User> userOptional89 = userRepository1.findByEmail("WrongPassword1!");
        org.junit.Assert.assertNotNull(userList2);
// flaky "13) test1157(com.reservation_system.Randoop.AuthService.RegressionTest2)":         org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
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
        org.junit.Assert.assertNotNull(userOptional89);
    }

    @Test
    public void test1158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1158");
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
            com.reservation_system.model.User user13 = authService10.login("data/test-users.csv", "guest");
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
    public void test1159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1159");
        com.reservation_system.model.HeadLabCoordinator headLabCoordinator5 = new com.reservation_system.model.HeadLabCoordinator(98, "headlabcoordinator", "Andrew", "guest", false);
        java.lang.String str6 = headLabCoordinator5.getUserType();
        java.lang.String str7 = headLabCoordinator5.getEmail();
        boolean boolean8 = headLabCoordinator5.isApproved();
        headLabCoordinator5.setApproved(true);
        java.lang.String str11 = headLabCoordinator5.getUserType();
        java.lang.Class<?> wildcardClass12 = headLabCoordinator5.getClass();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "headlabcoordinator" + "'", str6, "headlabcoordinator");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Andrew" + "'", str7, "Andrew");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "headlabcoordinator" + "'", str11, "headlabcoordinator");
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test1160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1160");
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
        // The following exception was thrown during execution in test generation
        try {
            com.reservation_system.model.User user17 = authService14.login("Guest", "Password1!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: No user found with that email.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(userList2);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 98 + "'", int9 == 98);
        org.junit.Assert.assertNotNull(userList10);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test1161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1161");
        com.reservation_system.model.Faculty faculty5 = new com.reservation_system.model.Faculty(0, "headlabcoordinator", "student", "labmanager", false);
        java.lang.String str6 = faculty5.getName();
        java.lang.String str7 = faculty5.getName();
        java.lang.String str8 = faculty5.getName();
        java.lang.String str9 = faculty5.getUserType();
        java.lang.String str10 = faculty5.getUserType();
        java.lang.String str11 = faculty5.getUserType();
        faculty5.setApproved(false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "headlabcoordinator" + "'", str6, "headlabcoordinator");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "headlabcoordinator" + "'", str7, "headlabcoordinator");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "headlabcoordinator" + "'", str8, "headlabcoordinator");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Faculty" + "'", str9, "Faculty");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Faculty" + "'", str10, "Faculty");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Faculty" + "'", str11, "Faculty");
    }

    @Test
    public void test1162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1162");
        com.reservation_system.model.LabManager labManager5 = new com.reservation_system.model.LabManager(52, "faculty", "Guest", "", true);
    }

    @Test
    public void test1163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1163");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("data/test-users.csv");
        java.util.List<com.reservation_system.model.User> userList2 = userRepository1.getAllUsers();
        com.reservation_system.services.AuthService authService3 = new com.reservation_system.services.AuthService(userRepository1);
        com.reservation_system.model.LabManager labManager9 = new com.reservation_system.model.LabManager((int) (short) 0, "", "student", "Andrew", true);
        boolean boolean10 = labManager9.isApproved();
        userRepository1.addUser((com.reservation_system.model.User) labManager9);
        com.reservation_system.model.Faculty faculty17 = new com.reservation_system.model.Faculty((int) '#', "researcher", "", "student", true);
        userRepository1.addUser((com.reservation_system.model.User) faculty17);
        boolean boolean19 = userRepository1.headLabCoordinatorExists();
        boolean boolean21 = userRepository1.emailExists("Guest");
        com.reservation_system.services.AuthService authService22 = new com.reservation_system.services.AuthService(userRepository1);
        com.reservation_system.repository.UserRepository userRepository24 = new com.reservation_system.repository.UserRepository("data/test-users.csv");
        java.util.List<com.reservation_system.model.User> userList25 = userRepository24.getAllUsers();
        com.reservation_system.services.AuthService authService26 = new com.reservation_system.services.AuthService(userRepository24);
        int int27 = userRepository24.getNextID();
        boolean boolean28 = userRepository24.headLabCoordinatorExists();
        com.reservation_system.repository.UserRepository userRepository30 = new com.reservation_system.repository.UserRepository("data/test-users.csv");
        java.util.List<com.reservation_system.model.User> userList31 = userRepository30.getAllUsers();
        boolean boolean32 = userRepository30.headLabCoordinatorExists();
        boolean boolean33 = userRepository30.headLabCoordinatorExists();
        java.util.List<com.reservation_system.model.User> userList34 = userRepository30.getAllUsers();
        userRepository24.saveAllUsers(userList34);
        com.reservation_system.services.AuthService authService36 = new com.reservation_system.services.AuthService(userRepository24);
        com.reservation_system.repository.UserRepository userRepository38 = new com.reservation_system.repository.UserRepository("data/test-users.csv");
        java.util.List<com.reservation_system.model.User> userList39 = userRepository38.getAllUsers();
        boolean boolean40 = userRepository38.headLabCoordinatorExists();
        boolean boolean42 = userRepository38.emailExists("hi!");
        java.util.Optional<com.reservation_system.model.User> userOptional44 = userRepository38.findByEmail("Faculty");
        int int45 = userRepository38.getNextID();
        java.util.List<com.reservation_system.model.User> userList46 = userRepository38.getAllUsers();
        userRepository24.saveAllUsers(userList46);
        userRepository1.saveAllUsers(userList46);
        org.junit.Assert.assertNotNull(userList2);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(userList25);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 98 + "'", int27 == 98);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNotNull(userList31);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertNotNull(userList34);
        org.junit.Assert.assertNotNull(userList39);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + true + "'", boolean42 == true);
        org.junit.Assert.assertNotNull(userOptional44);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 98 + "'", int45 == 98);
        org.junit.Assert.assertNotNull(userList46);
    }

    @Test
    public void test1164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1164");
        com.reservation_system.model.Researcher researcher5 = new com.reservation_system.model.Researcher((int) (short) -1, "headlabcoordinator", "student", "", false);
        boolean boolean6 = researcher5.isApproved();
        java.lang.String str7 = researcher5.getEmail();
        java.lang.String str8 = researcher5.getPassword();
        boolean boolean9 = researcher5.requiresDepartmentApproval();
        int int10 = researcher5.getID();
        java.lang.String str11 = researcher5.getEmail();
        java.lang.String str12 = researcher5.getEmail();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "student" + "'", str7, "student");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "student" + "'", str11, "student");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "student" + "'", str12, "student");
    }

    @Test
    public void test1165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1165");
        com.reservation_system.model.Student student5 = new com.reservation_system.model.Student(32, "data/test-users.csv", "guest", "labmanager", false);
    }

    @Test
    public void test1166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1166");
        com.reservation_system.model.Guest guest5 = new com.reservation_system.model.Guest(0, "Researcher", "Student", "researcher", false);
    }

    @Test
    public void test1167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1167");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("data/test-users.csv");
        java.util.List<com.reservation_system.model.User> userList2 = userRepository1.getAllUsers();
        com.reservation_system.services.AuthService authService3 = new com.reservation_system.services.AuthService(userRepository1);
        com.reservation_system.services.AuthService authService4 = new com.reservation_system.services.AuthService(userRepository1);
        com.reservation_system.services.AuthService authService5 = new com.reservation_system.services.AuthService(userRepository1);
        boolean boolean6 = userRepository1.headLabCoordinatorExists();
        boolean boolean8 = userRepository1.emailExists("Faculty");
        int int9 = userRepository1.getNextID();
        org.junit.Assert.assertNotNull(userList2);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 98 + "'", int9 == 98);
    }

    @Test
    public void test1168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1168");
        // The following exception was thrown during execution in test generation
        try {
            com.reservation_system.model.User user6 = com.reservation_system.patterns.factory.UserFactory.createUser("test@example.com", (int) (short) -1, "labmanager", "Password1!", "Researcher", true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid user type: test@example.com");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1169");
        com.reservation_system.model.HeadLabCoordinator headLabCoordinator5 = new com.reservation_system.model.HeadLabCoordinator((int) '#', "Guest", "Researcher", "labmanager", false);
        java.lang.String str6 = headLabCoordinator5.getUserType();
        java.lang.String str7 = headLabCoordinator5.getPassword();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "headlabcoordinator" + "'", str6, "headlabcoordinator");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "labmanager" + "'", str7, "labmanager");
    }

    @Test
    public void test1170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1170");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("data/test-users.csv");
        java.util.List<com.reservation_system.model.User> userList2 = userRepository1.getAllUsers();
        boolean boolean3 = userRepository1.headLabCoordinatorExists();
        boolean boolean4 = userRepository1.headLabCoordinatorExists();
        java.util.List<com.reservation_system.model.User> userList5 = userRepository1.getAllUsers();
        java.util.Optional<com.reservation_system.model.User> userOptional7 = userRepository1.findByEmail("WrongPassword1!");
        boolean boolean8 = userRepository1.headLabCoordinatorExists();
        com.reservation_system.model.HeadLabCoordinator headLabCoordinator14 = new com.reservation_system.model.HeadLabCoordinator(99, "Andrew", "guest", "Researcher", false);
        userRepository1.addUser((com.reservation_system.model.User) headLabCoordinator14);
        int int16 = userRepository1.getNextID();
        com.reservation_system.services.AuthService authService17 = new com.reservation_system.services.AuthService(userRepository1);
        org.junit.Assert.assertNotNull(userList2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(userList5);
        org.junit.Assert.assertNotNull(userOptional7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 100 + "'", int16 == 100);
    }

    @Test
    public void test1171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1171");
        // The following exception was thrown during execution in test generation
        try {
            com.reservation_system.model.User user6 = com.reservation_system.patterns.factory.UserFactory.createUser("test@example.com", (int) 'a', "Student", "Password1!", "student", true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid user type: test@example.com");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1172");
        com.reservation_system.model.LabManager labManager5 = new com.reservation_system.model.LabManager((int) (short) 0, "", "student", "Andrew", true);
        java.lang.String str6 = labManager5.getUserType();
        java.lang.String str7 = labManager5.getUserType();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "labmanager" + "'", str6, "labmanager");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "labmanager" + "'", str7, "labmanager");
    }

    @Test
    public void test1173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1173");
        com.reservation_system.model.HeadLabCoordinator headLabCoordinator5 = new com.reservation_system.model.HeadLabCoordinator(1, "hi!", "labmanager", "faculty", false);
    }

    @Test
    public void test1174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1174");
        com.reservation_system.model.Researcher researcher5 = new com.reservation_system.model.Researcher((int) (short) -1, "headlabcoordinator", "student", "", false);
        boolean boolean6 = researcher5.isApproved();
        java.lang.String str7 = researcher5.getEmail();
        java.lang.String str8 = researcher5.getUserType();
        java.lang.String str9 = researcher5.getEmail();
        java.lang.String str10 = researcher5.getUserType();
        java.lang.String str11 = researcher5.getName();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "student" + "'", str7, "student");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Researcher" + "'", str8, "Researcher");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "student" + "'", str9, "student");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Researcher" + "'", str10, "Researcher");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "headlabcoordinator" + "'", str11, "headlabcoordinator");
    }

    @Test
    public void test1175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1175");
        com.reservation_system.model.Faculty faculty5 = new com.reservation_system.model.Faculty(0, "headlabcoordinator", "student", "labmanager", false);
        java.lang.String str6 = faculty5.getName();
        java.lang.String str7 = faculty5.getName();
        java.lang.String str8 = faculty5.getName();
        java.lang.String str9 = faculty5.getUserType();
        java.lang.String str10 = faculty5.getUserType();
        java.lang.String str11 = faculty5.getName();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "headlabcoordinator" + "'", str6, "headlabcoordinator");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "headlabcoordinator" + "'", str7, "headlabcoordinator");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "headlabcoordinator" + "'", str8, "headlabcoordinator");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Faculty" + "'", str9, "Faculty");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Faculty" + "'", str10, "Faculty");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "headlabcoordinator" + "'", str11, "headlabcoordinator");
    }

    @Test
    public void test1176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1176");
        com.reservation_system.model.LabManager labManager5 = new com.reservation_system.model.LabManager(52, "data/test-users.csv", "Researcher", "Faculty", false);
        java.lang.String str6 = labManager5.getEmail();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Researcher" + "'", str6, "Researcher");
    }

    @Test
    public void test1177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1177");
        com.reservation_system.model.Guest guest5 = new com.reservation_system.model.Guest(98, "faculty", "student", "Andrew", false);
        java.lang.String str6 = guest5.getPassword();
        java.lang.String str7 = guest5.getEmail();
        java.lang.String str8 = guest5.getUserType();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Andrew" + "'", str6, "Andrew");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "student" + "'", str7, "student");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Guest" + "'", str8, "Guest");
    }

    @Test
    public void test1178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1178");
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
        com.reservation_system.model.User user23 = com.reservation_system.patterns.factory.UserFactory.createUser("Researcher", (int) '#', "student", "", "data/test-users.csv", true);
        userRepository1.addUser(user23);
        org.junit.Assert.assertNotNull(userList2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(userList6);
        org.junit.Assert.assertNotNull(userList7);
        org.junit.Assert.assertNotNull(userList11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(userList14);
        org.junit.Assert.assertNotNull(user23);
    }

    @Test
    public void test1179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1179");
        com.reservation_system.model.LabManager labManager5 = new com.reservation_system.model.LabManager(102, "Researcher", "guest", "Andrew", false);
    }

    @Test
    public void test1180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1180");
        com.reservation_system.model.Researcher researcher5 = new com.reservation_system.model.Researcher(52, "Researcher", "guest", "guest", true);
        java.lang.String str6 = researcher5.getPassword();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "guest" + "'", str6, "guest");
    }

    @Test
    public void test1181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1181");
        // The following exception was thrown during execution in test generation
        try {
            com.reservation_system.model.User user6 = com.reservation_system.patterns.factory.UserFactory.createUser("data/test-users.csv", (int) ' ', "researcher", "Student", "Researcher", true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid user type: data/test-users.csv");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1182");
        com.reservation_system.model.Guest guest5 = new com.reservation_system.model.Guest(98, "faculty", "student", "Andrew", false);
        java.lang.String str6 = guest5.getPassword();
        java.lang.String str7 = guest5.getEmail();
        int int8 = guest5.getID();
        java.lang.String str9 = guest5.getName();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Andrew" + "'", str6, "Andrew");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "student" + "'", str7, "student");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 98 + "'", int8 == 98);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "faculty" + "'", str9, "faculty");
    }

    @Test
    public void test1183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1183");
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
        // The following exception was thrown during execution in test generation
        try {
            com.reservation_system.model.User user25 = authService22.login("researcher", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: No user found with that email.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(userList2);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 100 + "'", int19 == 100);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 100 + "'", int20 == 100);
        org.junit.Assert.assertNotNull(userList21);
    }

    @Test
    public void test1184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1184");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("data/test-users.csv");
        boolean boolean2 = userRepository1.headLabCoordinatorExists();
        com.reservation_system.model.Faculty faculty8 = new com.reservation_system.model.Faculty(0, "headlabcoordinator", "student", "labmanager", false);
        userRepository1.addUser((com.reservation_system.model.User) faculty8);
        faculty8.setApproved(false);
        java.lang.String str12 = faculty8.getUserType();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Faculty" + "'", str12, "Faculty");
    }

    @Test
    public void test1185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1185");
        com.reservation_system.model.Guest guest5 = new com.reservation_system.model.Guest(1, "data/test-users.csv", "WrongPassword1!", "Researcher", false);
    }

    @Test
    public void test1186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1186");
        com.reservation_system.model.Researcher researcher5 = new com.reservation_system.model.Researcher((int) ' ', "headlabcoordinator", "Password1!", "", true);
        boolean boolean6 = researcher5.isApproved();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test1187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1187");
        com.reservation_system.model.Student student5 = new com.reservation_system.model.Student(0, "student", "Andrew", "guest", false);
        java.lang.String str6 = student5.getEmail();
        java.lang.Class<?> wildcardClass7 = student5.getClass();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Andrew" + "'", str6, "Andrew");
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test1188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1188");
        com.reservation_system.model.Faculty faculty5 = new com.reservation_system.model.Faculty((int) (byte) 10, "Password1!", "hi!", "labmanager", true);
        boolean boolean6 = faculty5.isApproved();
        boolean boolean7 = faculty5.requiresDepartmentApproval();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test1189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1189");
        com.reservation_system.model.HeadLabCoordinator headLabCoordinator5 = new com.reservation_system.model.HeadLabCoordinator((int) 'a', "data/test-users.csv", "headlabcoordinator", "hi!", true);
        java.lang.Class<?> wildcardClass6 = headLabCoordinator5.getClass();
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test1190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1190");
        com.reservation_system.model.HeadLabCoordinator headLabCoordinator5 = new com.reservation_system.model.HeadLabCoordinator((-1), "test@example.com", "researcher", "faculty", false);
        java.lang.String str6 = headLabCoordinator5.getUserType();
        headLabCoordinator5.setApproved(true);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "headlabcoordinator" + "'", str6, "headlabcoordinator");
    }

    @Test
    public void test1191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1191");
        com.reservation_system.model.HeadLabCoordinator headLabCoordinator5 = new com.reservation_system.model.HeadLabCoordinator((int) (byte) 1, "Guest", "data/test-users.csv", "Researcher", false);
    }

    @Test
    public void test1192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1192");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("data/test-users.csv");
        java.util.List<com.reservation_system.model.User> userList2 = userRepository1.getAllUsers();
        com.reservation_system.services.AuthService authService3 = new com.reservation_system.services.AuthService(userRepository1);
        com.reservation_system.services.AuthService authService4 = new com.reservation_system.services.AuthService(userRepository1);
        boolean boolean5 = userRepository1.headLabCoordinatorExists();
        com.reservation_system.services.AuthService authService6 = new com.reservation_system.services.AuthService(userRepository1);
        com.reservation_system.services.AuthService authService7 = new com.reservation_system.services.AuthService(userRepository1);
        org.junit.Assert.assertNotNull(userList2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
    }

    @Test
    public void test1193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1193");
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
        com.reservation_system.repository.UserRepository userRepository24 = new com.reservation_system.repository.UserRepository("data/test-users.csv");
        java.util.List<com.reservation_system.model.User> userList25 = userRepository24.getAllUsers();
        com.reservation_system.services.AuthService authService26 = new com.reservation_system.services.AuthService(userRepository24);
        com.reservation_system.model.LabManager labManager32 = new com.reservation_system.model.LabManager((int) (short) 0, "", "student", "Andrew", true);
        boolean boolean33 = labManager32.isApproved();
        userRepository24.addUser((com.reservation_system.model.User) labManager32);
        boolean boolean36 = userRepository24.emailExists("Researcher");
        java.util.List<com.reservation_system.model.User> userList37 = userRepository24.getAllUsers();
        userRepository1.saveAllUsers(userList37);
        com.reservation_system.services.AuthService authService39 = new com.reservation_system.services.AuthService(userRepository1);
        // The following exception was thrown during execution in test generation
        try {
            com.reservation_system.model.User user42 = authService39.login("faculty", "Faculty");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: No user found with that email.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(userList2);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(userOptional22);
        org.junit.Assert.assertNotNull(userList25);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertNotNull(userList37);
    }

    @Test
    public void test1194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1194");
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
        java.util.Optional<com.reservation_system.model.User> userOptional30 = userRepository1.findByEmail("headlabcoordinator");
        com.reservation_system.repository.UserRepository userRepository32 = new com.reservation_system.repository.UserRepository("data/test-users.csv");
        java.util.List<com.reservation_system.model.User> userList33 = userRepository32.getAllUsers();
        com.reservation_system.services.AuthService authService34 = new com.reservation_system.services.AuthService(userRepository32);
        com.reservation_system.model.LabManager labManager40 = new com.reservation_system.model.LabManager((int) (short) 0, "", "student", "Andrew", true);
        boolean boolean41 = labManager40.isApproved();
        userRepository32.addUser((com.reservation_system.model.User) labManager40);
        com.reservation_system.model.Faculty faculty48 = new com.reservation_system.model.Faculty((int) '#', "researcher", "", "student", true);
        userRepository32.addUser((com.reservation_system.model.User) faculty48);
        int int50 = userRepository32.getNextID();
        int int51 = userRepository32.getNextID();
        java.util.List<com.reservation_system.model.User> userList52 = userRepository32.getAllUsers();
        java.util.List<com.reservation_system.model.User> userList53 = userRepository32.getAllUsers();
        userRepository1.saveAllUsers(userList53);
        org.junit.Assert.assertNotNull(userList2);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 100 + "'", int19 == 100);
        org.junit.Assert.assertNotNull(userOptional21);
        org.junit.Assert.assertNotNull(userOptional30);
        org.junit.Assert.assertNotNull(userList33);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + true + "'", boolean41 == true);
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + 100 + "'", int50 == 100);
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + 100 + "'", int51 == 100);
        org.junit.Assert.assertNotNull(userList52);
        org.junit.Assert.assertNotNull(userList53);
    }

    @Test
    public void test1195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1195");
        com.reservation_system.model.Guest guest5 = new com.reservation_system.model.Guest((int) '4', "Andrew", "data/test-users.csv", "headlabcoordinator", true);
        java.lang.String str6 = guest5.getUserType();
        java.lang.String str7 = guest5.getUserType();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Guest" + "'", str6, "Guest");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Guest" + "'", str7, "Guest");
    }

    @Test
    public void test1196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1196");
        com.reservation_system.model.LabManager labManager5 = new com.reservation_system.model.LabManager((int) 'a', "Faculty", "", "", false);
        java.lang.String str6 = labManager5.getEmail();
        labManager5.setApproved(true);
        boolean boolean9 = labManager5.isApproved();
        java.lang.String str10 = labManager5.getUserType();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "labmanager" + "'", str10, "labmanager");
    }

    @Test
    public void test1197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1197");
        com.reservation_system.model.HeadLabCoordinator headLabCoordinator5 = new com.reservation_system.model.HeadLabCoordinator((int) '4', "test@example.com", "data/test-users.csv", "", false);
        boolean boolean6 = headLabCoordinator5.requiresDepartmentApproval();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test1198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1198");
        com.reservation_system.model.HeadLabCoordinator headLabCoordinator5 = new com.reservation_system.model.HeadLabCoordinator(10, "headlabcoordinator", "data/test-users.csv", "faculty", false);
        java.lang.String str6 = headLabCoordinator5.getEmail();
        java.lang.String str7 = headLabCoordinator5.getUserType();
        java.lang.String str8 = headLabCoordinator5.getUserType();
        java.lang.String str9 = headLabCoordinator5.getUserType();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "data/test-users.csv" + "'", str6, "data/test-users.csv");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "headlabcoordinator" + "'", str7, "headlabcoordinator");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "headlabcoordinator" + "'", str8, "headlabcoordinator");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "headlabcoordinator" + "'", str9, "headlabcoordinator");
    }

    @Test
    public void test1199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1199");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("data/test-users.csv");
        java.util.List<com.reservation_system.model.User> userList2 = userRepository1.getAllUsers();
        java.util.List<com.reservation_system.model.User> userList3 = userRepository1.getAllUsers();
        com.reservation_system.services.AuthService authService4 = new com.reservation_system.services.AuthService(userRepository1);
        java.util.Optional<com.reservation_system.model.User> userOptional6 = userRepository1.findByEmail("faculty");
        boolean boolean7 = userRepository1.headLabCoordinatorExists();
        java.util.List<com.reservation_system.model.User> userList8 = userRepository1.getAllUsers();
        com.reservation_system.model.LabManager labManager14 = new com.reservation_system.model.LabManager((int) 'a', "labmanager", "Password1!", "faculty", true);
        userRepository1.addUser((com.reservation_system.model.User) labManager14);
        java.lang.String str16 = labManager14.getEmail();
        java.lang.String str17 = labManager14.getUserType();
        org.junit.Assert.assertNotNull(userList2);
        org.junit.Assert.assertNotNull(userList3);
        org.junit.Assert.assertNotNull(userOptional6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(userList8);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Password1!" + "'", str16, "Password1!");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "labmanager" + "'", str17, "labmanager");
    }

    @Test
    public void test1200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1200");
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
        com.reservation_system.model.Faculty faculty22 = new com.reservation_system.model.Faculty(10, "data/test-users.csv", "hi!", "", false);
        java.lang.String str23 = faculty22.getUserType();
        java.lang.String str24 = faculty22.getUserType();
        java.lang.String str25 = faculty22.getUserType();
        boolean boolean26 = faculty22.requiresDepartmentApproval();
        boolean boolean27 = faculty22.requiresDepartmentApproval();
        userRepository1.addUser((com.reservation_system.model.User) faculty22);
        java.util.Optional<com.reservation_system.model.User> userOptional30 = userRepository1.findByEmail("Researcher");
        org.junit.Assert.assertNotNull(userList2);
        org.junit.Assert.assertNotNull(userList3);
        org.junit.Assert.assertNotNull(userList6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(userList10);
        org.junit.Assert.assertNotNull(userList11);
        org.junit.Assert.assertNotNull(userList14);
        org.junit.Assert.assertNotNull(userList15);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "Faculty" + "'", str23, "Faculty");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "Faculty" + "'", str24, "Faculty");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "Faculty" + "'", str25, "Faculty");
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertNotNull(userOptional30);
    }

    @Test
    public void test1201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1201");
        com.reservation_system.model.Student student5 = new com.reservation_system.model.Student((int) (short) 1, "Researcher", "test@example.com", "data/test-users.csv", false);
    }

    @Test
    public void test1202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1202");
        com.reservation_system.model.Guest guest5 = new com.reservation_system.model.Guest((-1), "data/test-users.csv", "faculty", "", false);
    }

    @Test
    public void test1203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1203");
        com.reservation_system.model.Student student5 = new com.reservation_system.model.Student((int) (byte) 100, "headlabcoordinator", "data/test-users.csv", "Password1!", false);
    }

    @Test
    public void test1204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1204");
        com.reservation_system.model.Guest guest5 = new com.reservation_system.model.Guest((int) '#', "test@example.com", "Password1!", "test@example.com", true);
        guest5.setApproved(true);
        java.lang.String str8 = guest5.getEmail();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Password1!" + "'", str8, "Password1!");
    }

    @Test
    public void test1205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1205");
        com.reservation_system.model.Guest guest5 = new com.reservation_system.model.Guest((int) '4', "Researcher", "student", "WrongPassword1!", false);
        java.lang.String str6 = guest5.getPassword();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "WrongPassword1!" + "'", str6, "WrongPassword1!");
    }

    @Test
    public void test1206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1206");
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
        java.util.Optional<com.reservation_system.model.User> userOptional26 = userRepository1.findByEmail("");
        int int27 = userRepository1.getNextID();
        org.junit.Assert.assertNotNull(userList2);
        org.junit.Assert.assertNotNull(userList3);
        org.junit.Assert.assertNotNull(userOptional6);
        org.junit.Assert.assertNotNull(userList8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 100 + "'", int9 == 100);
        org.junit.Assert.assertNotNull(userList12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertNotNull(userList23);
        org.junit.Assert.assertNotNull(userOptional26);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 100 + "'", int27 == 100);
    }

    @Test
    public void test1207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1207");
        com.reservation_system.model.Guest guest5 = new com.reservation_system.model.Guest(0, "Researcher", "student", "Guest", false);
    }

    @Test
    public void test1208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1208");
        com.reservation_system.model.Researcher researcher5 = new com.reservation_system.model.Researcher(52, "headlabcoordinator", "WrongPassword1!", "Student", false);
    }

    @Test
    public void test1209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1209");
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
            com.reservation_system.model.User user21 = authService18.login("data/test-users.csv", "test@example.com");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: No user found with that email.");
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
    public void test1210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1210");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("data/test-users.csv");
        java.util.List<com.reservation_system.model.User> userList2 = userRepository1.getAllUsers();
        java.util.List<com.reservation_system.model.User> userList3 = userRepository1.getAllUsers();
        com.reservation_system.services.AuthService authService4 = new com.reservation_system.services.AuthService(userRepository1);
        com.reservation_system.services.AuthService authService5 = new com.reservation_system.services.AuthService(userRepository1);
        com.reservation_system.model.LabManager labManager11 = new com.reservation_system.model.LabManager(100, "WrongPassword1!", "", "faculty", true);
        java.lang.String str12 = labManager11.getUserType();
        userRepository1.addUser((com.reservation_system.model.User) labManager11);
        int int14 = userRepository1.getNextID();
        org.junit.Assert.assertNotNull(userList2);
        org.junit.Assert.assertNotNull(userList3);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "labmanager" + "'", str12, "labmanager");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 101 + "'", int14 == 101);
    }

    @Test
    public void test1211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1211");
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
        boolean boolean39 = userRepository1.emailExists("test@example.com");
        int int40 = userRepository1.getNextID();
        org.junit.Assert.assertNotNull(userList2);
        org.junit.Assert.assertNotNull(userList3);
        org.junit.Assert.assertNotNull(userList7);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 101 + "'", int24 == 101);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 101 + "'", int25 == 101);
        org.junit.Assert.assertNotNull(userList26);
        org.junit.Assert.assertNotNull(userOptional29);
        org.junit.Assert.assertNotNull(userList37);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 101 + "'", int40 == 101);
    }

    @Test
    public void test1212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1212");
        com.reservation_system.model.LabManager labManager5 = new com.reservation_system.model.LabManager((int) (byte) 100, "Faculty", "Password1!", "Student", true);
        java.lang.String str6 = labManager5.getEmail();
        java.lang.String str7 = labManager5.getUserType();
        java.lang.String str8 = labManager5.getName();
        boolean boolean9 = labManager5.requiresDepartmentApproval();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Password1!" + "'", str6, "Password1!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "labmanager" + "'", str7, "labmanager");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Faculty" + "'", str8, "Faculty");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test1213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1213");
        com.reservation_system.model.Faculty faculty5 = new com.reservation_system.model.Faculty((int) (short) 100, "Faculty", "test@example.com", "Password1!", true);
    }

    @Test
    public void test1214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1214");
        com.reservation_system.model.LabManager labManager5 = new com.reservation_system.model.LabManager(35, "student", "test@example.com", "Student", true);
        java.lang.String str6 = labManager5.getUserType();
        int int7 = labManager5.getID();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "labmanager" + "'", str6, "labmanager");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 35 + "'", int7 == 35);
    }

    @Test
    public void test1215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1215");
        com.reservation_system.model.Student student5 = new com.reservation_system.model.Student((int) (short) 10, "Student", "researcher", "Guest", true);
        java.lang.String str6 = student5.getUserType();
        java.lang.String str7 = student5.getUserType();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Student" + "'", str6, "Student");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Student" + "'", str7, "Student");
    }

    @Test
    public void test1216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1216");
        com.reservation_system.model.Researcher researcher5 = new com.reservation_system.model.Researcher((int) (short) -1, "headlabcoordinator", "student", "", false);
        researcher5.setApproved(false);
        boolean boolean8 = researcher5.requiresDepartmentApproval();
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test1217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1217");
        com.reservation_system.model.HeadLabCoordinator headLabCoordinator5 = new com.reservation_system.model.HeadLabCoordinator((int) (short) -1, "guest", "WrongPassword1!", "faculty", false);
    }

    @Test
    public void test1218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1218");
        com.reservation_system.model.Researcher researcher5 = new com.reservation_system.model.Researcher((int) (byte) -1, "", "", "Andrew", true);
    }

    @Test
    public void test1219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1219");
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
            com.reservation_system.model.User user13 = authService10.login("data/test-users.csv", "faculty");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: No user found with that email.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(userList2);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(userOptional8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 101 + "'", int9 == 101);
    }

    @Test
    public void test1220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1220");
        com.reservation_system.model.HeadLabCoordinator headLabCoordinator5 = new com.reservation_system.model.HeadLabCoordinator(52, "researcher", "Guest", "Guest", true);
    }

    @Test
    public void test1221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1221");
        com.reservation_system.model.Researcher researcher5 = new com.reservation_system.model.Researcher(1, "Researcher", "", "faculty", true);
        java.lang.String str6 = researcher5.getUserType();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Researcher" + "'", str6, "Researcher");
    }

    @Test
    public void test1222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1222");
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
        java.lang.Class<?> wildcardClass17 = userOptional16.getClass();
        org.junit.Assert.assertNotNull(userList2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 101 + "'", int4 == 101);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(userList8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(userList11);
        org.junit.Assert.assertNotNull(userOptional14);
        org.junit.Assert.assertNotNull(userOptional16);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test1223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1223");
        com.reservation_system.model.LabManager labManager5 = new com.reservation_system.model.LabManager(99, "researcher", "headlabcoordinator", "", false);
        java.lang.String str6 = labManager5.getUserType();
        java.lang.String str7 = labManager5.getUserType();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "labmanager" + "'", str6, "labmanager");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "labmanager" + "'", str7, "labmanager");
    }

    @Test
    public void test1224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1224");
        com.reservation_system.model.Faculty faculty5 = new com.reservation_system.model.Faculty(100, "", "labmanager", "Guest", true);
        java.lang.String str6 = faculty5.getUserType();
        java.lang.String str7 = faculty5.getUserType();
        boolean boolean8 = faculty5.requiresDepartmentApproval();
        java.lang.String str9 = faculty5.getName();
        java.lang.String str10 = faculty5.getUserType();
        java.lang.Class<?> wildcardClass11 = faculty5.getClass();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Faculty" + "'", str6, "Faculty");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Faculty" + "'", str7, "Faculty");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Faculty" + "'", str10, "Faculty");
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test1225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1225");
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
        boolean boolean27 = userRepository1.emailExists("");
        boolean boolean29 = userRepository1.emailExists("");
        org.junit.Assert.assertNotNull(userList2);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(userList14);
        org.junit.Assert.assertNotNull(userList15);
        org.junit.Assert.assertNotNull(userList18);
        org.junit.Assert.assertNotNull(userList19);
        org.junit.Assert.assertNotNull(userOptional22);
        org.junit.Assert.assertNotNull(userList24);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
    }

    @Test
    public void test1226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1226");
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
        boolean boolean57 = userRepository1.emailExists("Faculty");
        java.lang.Class<?> wildcardClass58 = userRepository1.getClass();
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
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + 101 + "'", int51 == 101);
        org.junit.Assert.assertTrue("'" + int52 + "' != '" + 101 + "'", int52 == 101);
        org.junit.Assert.assertNotNull(userList53);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + true + "'", boolean57 == true);
        org.junit.Assert.assertNotNull(wildcardClass58);
    }

    @Test
    public void test1227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1227");
        com.reservation_system.model.HeadLabCoordinator headLabCoordinator5 = new com.reservation_system.model.HeadLabCoordinator((int) ' ', "WrongPassword1!", "student", "researcher", false);
        java.lang.String str6 = headLabCoordinator5.getUserType();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "headlabcoordinator" + "'", str6, "headlabcoordinator");
    }

    @Test
    public void test1228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1228");
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
        boolean boolean24 = userRepository1.emailExists("labmanager");
        java.util.Optional<com.reservation_system.model.User> userOptional26 = userRepository1.findByEmail("Password1!");
        org.junit.Assert.assertNotNull(userList2);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(userOptional22);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(userOptional26);
    }

    @Test
    public void test1229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1229");
        com.reservation_system.model.Researcher researcher5 = new com.reservation_system.model.Researcher((int) (short) -1, "headlabcoordinator", "student", "", false);
        java.lang.String str6 = researcher5.getUserType();
        boolean boolean7 = researcher5.isApproved();
        researcher5.setApproved(true);
        java.lang.String str10 = researcher5.getName();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Researcher" + "'", str6, "Researcher");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "headlabcoordinator" + "'", str10, "headlabcoordinator");
    }

    @Test
    public void test1230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1230");
        com.reservation_system.model.Faculty faculty5 = new com.reservation_system.model.Faculty((int) (byte) 0, "", "Researcher", "labmanager", false);
        java.lang.String str6 = faculty5.getUserType();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Faculty" + "'", str6, "Faculty");
    }

    @Test
    public void test1231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1231");
        com.reservation_system.model.LabManager labManager5 = new com.reservation_system.model.LabManager((int) '4', "hi!", "labmanager", "Student", false);
        java.lang.String str6 = labManager5.getEmail();
        int int7 = labManager5.getID();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "labmanager" + "'", str6, "labmanager");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 52 + "'", int7 == 52);
    }

    @Test
    public void test1232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1232");
        com.reservation_system.model.HeadLabCoordinator headLabCoordinator5 = new com.reservation_system.model.HeadLabCoordinator((int) (short) 0, "WrongPassword1!", "headlabcoordinator", "WrongPassword1!", false);
        java.lang.String str6 = headLabCoordinator5.getUserType();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "headlabcoordinator" + "'", str6, "headlabcoordinator");
    }

    @Test
    public void test1233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1233");
        com.reservation_system.model.LabManager labManager5 = new com.reservation_system.model.LabManager((int) 'a', "hi!", "Password1!", "student", false);
        boolean boolean6 = labManager5.requiresDepartmentApproval();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test1234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1234");
        com.reservation_system.model.Guest guest5 = new com.reservation_system.model.Guest(0, "hi!", "test@example.com", "Researcher", false);
        guest5.setApproved(false);
    }

    @Test
    public void test1235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1235");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("data/test-users.csv");
        java.util.List<com.reservation_system.model.User> userList2 = userRepository1.getAllUsers();
        com.reservation_system.services.AuthService authService3 = new com.reservation_system.services.AuthService(userRepository1);
        // The following exception was thrown during execution in test generation
        try {
            com.reservation_system.model.User user6 = authService3.login("test@example.com", "");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Password is required.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(userList2);
    }

    @Test
    public void test1236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1236");
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
        boolean boolean54 = userRepository1.emailExists("Faculty");
        com.reservation_system.model.Researcher researcher60 = new com.reservation_system.model.Researcher((int) (short) -1, "headlabcoordinator", "student", "", false);
        boolean boolean61 = researcher60.isApproved();
        java.lang.String str62 = researcher60.getEmail();
        java.lang.String str63 = researcher60.getUserType();
        int int64 = researcher60.getID();
        boolean boolean65 = researcher60.isApproved();
        userRepository1.addUser((com.reservation_system.model.User) researcher60);
        org.junit.Assert.assertNotNull(userList2);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 101 + "'", int19 == 101);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 101 + "'", int20 == 101);
        org.junit.Assert.assertNotNull(userList23);
        org.junit.Assert.assertNotNull(userList24);
        org.junit.Assert.assertNotNull(userList28);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 101 + "'", int45 == 101);
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + 101 + "'", int46 == 101);
        org.junit.Assert.assertNotNull(userList47);
        org.junit.Assert.assertNotNull(userList49);
        org.junit.Assert.assertNotNull(userList51);
        org.junit.Assert.assertTrue("'" + int52 + "' != '" + 101 + "'", int52 == 101);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + true + "'", boolean54 == true);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + false + "'", boolean61 == false);
        org.junit.Assert.assertEquals("'" + str62 + "' != '" + "student" + "'", str62, "student");
        org.junit.Assert.assertEquals("'" + str63 + "' != '" + "Researcher" + "'", str63, "Researcher");
        org.junit.Assert.assertTrue("'" + int64 + "' != '" + (-1) + "'", int64 == (-1));
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + false + "'", boolean65 == false);
    }

    @Test
    public void test1237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1237");
        com.reservation_system.model.LabManager labManager5 = new com.reservation_system.model.LabManager(35, "student", "test@example.com", "Student", true);
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
    public void test1238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1238");
        com.reservation_system.model.Researcher researcher5 = new com.reservation_system.model.Researcher((int) (short) -1, "headlabcoordinator", "student", "", false);
        boolean boolean6 = researcher5.isApproved();
        java.lang.String str7 = researcher5.getEmail();
        java.lang.String str8 = researcher5.getPassword();
        boolean boolean9 = researcher5.requiresDepartmentApproval();
        int int10 = researcher5.getID();
        java.lang.String str11 = researcher5.getEmail();
        java.lang.String str12 = researcher5.getUserType();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "student" + "'", str7, "student");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "student" + "'", str11, "student");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Researcher" + "'", str12, "Researcher");
    }

    @Test
    public void test1239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1239");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("data/test-users.csv");
        java.util.List<com.reservation_system.model.User> userList2 = userRepository1.getAllUsers();
        boolean boolean3 = userRepository1.headLabCoordinatorExists();
        boolean boolean4 = userRepository1.headLabCoordinatorExists();
        java.util.List<com.reservation_system.model.User> userList5 = userRepository1.getAllUsers();
        java.util.Optional<com.reservation_system.model.User> userOptional7 = userRepository1.findByEmail("headlabcoordinator");
        com.reservation_system.repository.UserRepository userRepository9 = new com.reservation_system.repository.UserRepository("data/test-users.csv");
        java.util.List<com.reservation_system.model.User> userList10 = userRepository9.getAllUsers();
        boolean boolean11 = userRepository9.headLabCoordinatorExists();
        com.reservation_system.repository.UserRepository userRepository13 = new com.reservation_system.repository.UserRepository("data/test-users.csv");
        java.util.List<com.reservation_system.model.User> userList14 = userRepository13.getAllUsers();
        java.util.List<com.reservation_system.model.User> userList15 = userRepository13.getAllUsers();
        userRepository9.saveAllUsers(userList15);
        com.reservation_system.repository.UserRepository userRepository18 = new com.reservation_system.repository.UserRepository("data/test-users.csv");
        java.util.List<com.reservation_system.model.User> userList19 = userRepository18.getAllUsers();
        boolean boolean20 = userRepository18.headLabCoordinatorExists();
        boolean boolean21 = userRepository18.headLabCoordinatorExists();
        java.util.List<com.reservation_system.model.User> userList22 = userRepository18.getAllUsers();
        userRepository9.saveAllUsers(userList22);
        boolean boolean24 = userRepository9.headLabCoordinatorExists();
        boolean boolean26 = userRepository9.emailExists("Student");
        boolean boolean27 = userRepository9.headLabCoordinatorExists();
        java.util.List<com.reservation_system.model.User> userList28 = userRepository9.getAllUsers();
        com.reservation_system.repository.UserRepository userRepository30 = new com.reservation_system.repository.UserRepository("data/test-users.csv");
        java.util.List<com.reservation_system.model.User> userList31 = userRepository30.getAllUsers();
        boolean boolean32 = userRepository30.headLabCoordinatorExists();
        boolean boolean34 = userRepository30.emailExists("hi!");
        java.util.Optional<com.reservation_system.model.User> userOptional36 = userRepository30.findByEmail("Faculty");
        int int37 = userRepository30.getNextID();
        boolean boolean38 = userRepository30.headLabCoordinatorExists();
        com.reservation_system.repository.UserRepository userRepository40 = new com.reservation_system.repository.UserRepository("data/test-users.csv");
        java.util.List<com.reservation_system.model.User> userList41 = userRepository40.getAllUsers();
        com.reservation_system.services.AuthService authService42 = new com.reservation_system.services.AuthService(userRepository40);
        com.reservation_system.model.LabManager labManager48 = new com.reservation_system.model.LabManager((int) (short) 0, "", "student", "Andrew", true);
        boolean boolean49 = labManager48.isApproved();
        userRepository40.addUser((com.reservation_system.model.User) labManager48);
        com.reservation_system.model.Faculty faculty56 = new com.reservation_system.model.Faculty((int) '#', "researcher", "", "student", true);
        userRepository40.addUser((com.reservation_system.model.User) faculty56);
        boolean boolean59 = userRepository40.emailExists("data/test-users.csv");
        java.util.Optional<com.reservation_system.model.User> userOptional61 = userRepository40.findByEmail("researcher");
        com.reservation_system.repository.UserRepository userRepository63 = new com.reservation_system.repository.UserRepository("data/test-users.csv");
        java.util.List<com.reservation_system.model.User> userList64 = userRepository63.getAllUsers();
        com.reservation_system.services.AuthService authService65 = new com.reservation_system.services.AuthService(userRepository63);
        com.reservation_system.model.LabManager labManager71 = new com.reservation_system.model.LabManager((int) (short) 0, "", "student", "Andrew", true);
        boolean boolean72 = labManager71.isApproved();
        userRepository63.addUser((com.reservation_system.model.User) labManager71);
        boolean boolean75 = userRepository63.emailExists("Researcher");
        java.util.List<com.reservation_system.model.User> userList76 = userRepository63.getAllUsers();
        userRepository40.saveAllUsers(userList76);
        userRepository30.saveAllUsers(userList76);
        userRepository9.saveAllUsers(userList76);
        com.reservation_system.repository.UserRepository userRepository81 = new com.reservation_system.repository.UserRepository("data/test-users.csv");
        java.util.List<com.reservation_system.model.User> userList82 = userRepository81.getAllUsers();
        com.reservation_system.services.AuthService authService83 = new com.reservation_system.services.AuthService(userRepository81);
        java.util.Optional<com.reservation_system.model.User> userOptional85 = userRepository81.findByEmail("");
        int int86 = userRepository81.getNextID();
        com.reservation_system.services.AuthService authService87 = new com.reservation_system.services.AuthService(userRepository81);
        com.reservation_system.repository.UserRepository userRepository89 = new com.reservation_system.repository.UserRepository("data/test-users.csv");
        boolean boolean90 = userRepository89.headLabCoordinatorExists();
        com.reservation_system.repository.UserRepository userRepository92 = new com.reservation_system.repository.UserRepository("data/test-users.csv");
        java.util.List<com.reservation_system.model.User> userList93 = userRepository92.getAllUsers();
        java.util.List<com.reservation_system.model.User> userList94 = userRepository92.getAllUsers();
        userRepository89.saveAllUsers(userList94);
        userRepository81.saveAllUsers(userList94);
        userRepository9.saveAllUsers(userList94);
        userRepository1.saveAllUsers(userList94);
        int int99 = userRepository1.getNextID();
        org.junit.Assert.assertNotNull(userList2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(userList5);
        org.junit.Assert.assertNotNull(userOptional7);
        org.junit.Assert.assertNotNull(userList10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(userList14);
        org.junit.Assert.assertNotNull(userList15);
        org.junit.Assert.assertNotNull(userList19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertNotNull(userList22);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertNotNull(userList28);
        org.junit.Assert.assertNotNull(userList31);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertNotNull(userOptional36);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 101 + "'", int37 == 101);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + true + "'", boolean38 == true);
        org.junit.Assert.assertNotNull(userList41);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + true + "'", boolean49 == true);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + false + "'", boolean59 == false);
        org.junit.Assert.assertNotNull(userOptional61);
        org.junit.Assert.assertNotNull(userList64);
        org.junit.Assert.assertTrue("'" + boolean72 + "' != '" + true + "'", boolean72 == true);
        org.junit.Assert.assertTrue("'" + boolean75 + "' != '" + false + "'", boolean75 == false);
        org.junit.Assert.assertNotNull(userList76);
        org.junit.Assert.assertNotNull(userList82);
        org.junit.Assert.assertNotNull(userOptional85);
        org.junit.Assert.assertTrue("'" + int86 + "' != '" + 101 + "'", int86 == 101);
        org.junit.Assert.assertTrue("'" + boolean90 + "' != '" + true + "'", boolean90 == true);
        org.junit.Assert.assertNotNull(userList93);
        org.junit.Assert.assertNotNull(userList94);
        org.junit.Assert.assertTrue("'" + int99 + "' != '" + 101 + "'", int99 == 101);
    }

    @Test
    public void test1240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1240");
        com.reservation_system.model.LabManager labManager5 = new com.reservation_system.model.LabManager((-1), "guest", "researcher", "Faculty", true);
        labManager5.setApproved(true);
        java.lang.String str8 = labManager5.getEmail();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "researcher" + "'", str8, "researcher");
    }

    @Test
    public void test1241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1241");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("data/test-users.csv");
        java.util.List<com.reservation_system.model.User> userList2 = userRepository1.getAllUsers();
        boolean boolean3 = userRepository1.headLabCoordinatorExists();
        boolean boolean4 = userRepository1.headLabCoordinatorExists();
        com.reservation_system.model.HeadLabCoordinator headLabCoordinator10 = new com.reservation_system.model.HeadLabCoordinator(1, "faculty", "Faculty", "", true);
        userRepository1.addUser((com.reservation_system.model.User) headLabCoordinator10);
        java.util.Optional<com.reservation_system.model.User> userOptional13 = userRepository1.findByEmail("Faculty");
        java.util.Optional<com.reservation_system.model.User> userOptional15 = userRepository1.findByEmail("hi!");
        com.reservation_system.services.AuthService authService16 = new com.reservation_system.services.AuthService(userRepository1);
        // The following exception was thrown during execution in test generation
        try {
            com.reservation_system.model.User user19 = authService16.login("Guest", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Incorrect password.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(userList2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(userOptional13);
        org.junit.Assert.assertNotNull(userOptional15);
    }

    @Test
    public void test1242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1242");
        com.reservation_system.model.Researcher researcher5 = new com.reservation_system.model.Researcher(98, "Researcher", "Student", "guest", true);
        java.lang.String str6 = researcher5.getPassword();
        java.lang.String str7 = researcher5.getUserType();
        researcher5.setApproved(false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "guest" + "'", str6, "guest");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Researcher" + "'", str7, "Researcher");
    }

    @Test
    public void test1243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1243");
        com.reservation_system.model.Faculty faculty5 = new com.reservation_system.model.Faculty(0, "Faculty", "test@example.com", "faculty", true);
    }

    @Test
    public void test1244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1244");
        com.reservation_system.model.Faculty faculty5 = new com.reservation_system.model.Faculty(100, "", "labmanager", "Guest", true);
        boolean boolean6 = faculty5.isApproved();
        java.lang.String str7 = faculty5.getEmail();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "labmanager" + "'", str7, "labmanager");
    }

    @Test
    public void test1245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1245");
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
        boolean boolean25 = userRepository1.emailExists("Researcher");
        org.junit.Assert.assertNotNull(userList2);
        org.junit.Assert.assertNotNull(userList3);
        org.junit.Assert.assertNotNull(userList6);
// flaky "14) test1245(com.reservation_system.Randoop.AuthService.RegressionTest2)":         org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(userList10);
        org.junit.Assert.assertNotNull(userList11);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
// flaky "6) test1245(com.reservation_system.Randoop.AuthService.RegressionTest2)":         org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
    }

    @Test
    public void test1246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1246");
        com.reservation_system.model.Guest guest5 = new com.reservation_system.model.Guest((int) (byte) 100, "Password1!", "Guest", "Guest", true);
        java.lang.String str6 = guest5.getUserType();
        java.lang.String str7 = guest5.getPassword();
        java.lang.String str8 = guest5.getUserType();
        guest5.setApproved(true);
        guest5.setApproved(false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Guest" + "'", str6, "Guest");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Guest" + "'", str7, "Guest");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Guest" + "'", str8, "Guest");
    }

    @Test
    public void test1247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1247");
        com.reservation_system.model.User user6 = com.reservation_system.patterns.factory.UserFactory.createUser("Faculty", 0, "data/test-users.csv", "researcher", "student", false);
        org.junit.Assert.assertNotNull(user6);
    }

    @Test
    public void test1248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1248");
        com.reservation_system.model.Guest guest5 = new com.reservation_system.model.Guest(97, "Andrew", "", "Faculty", false);
        boolean boolean6 = guest5.isApproved();
        java.lang.String str7 = guest5.getUserType();
        boolean boolean8 = guest5.requiresDepartmentApproval();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Guest" + "'", str7, "Guest");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test1249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1249");
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
        boolean boolean17 = userRepository1.emailExists("student");
// flaky "15) test1249(com.reservation_system.Randoop.AuthService.RegressionTest2)":         org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
// flaky "7) test1249(com.reservation_system.Randoop.AuthService.RegressionTest2)":         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 99 + "'", int3 == 99);
        org.junit.Assert.assertNotNull(userList4);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "labmanager" + "'", str11, "labmanager");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
    }

    @Test
    public void test1250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1250");
        com.reservation_system.model.Faculty faculty5 = new com.reservation_system.model.Faculty((int) (short) 0, "labmanager", "faculty", "WrongPassword1!", true);
        java.lang.String str6 = faculty5.getEmail();
        java.lang.String str7 = faculty5.getName();
        java.lang.String str8 = faculty5.getUserType();
        faculty5.setApproved(true);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "faculty" + "'", str6, "faculty");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "labmanager" + "'", str7, "labmanager");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Faculty" + "'", str8, "Faculty");
    }

    @Test
    public void test1251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1251");
        com.reservation_system.model.Researcher researcher5 = new com.reservation_system.model.Researcher(52, "Researcher", "guest", "guest", true);
        java.lang.String str6 = researcher5.getUserType();
        java.lang.String str7 = researcher5.getUserType();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Researcher" + "'", str6, "Researcher");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Researcher" + "'", str7, "Researcher");
    }

    @Test
    public void test1252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1252");
        com.reservation_system.model.HeadLabCoordinator headLabCoordinator5 = new com.reservation_system.model.HeadLabCoordinator(102, "Student", "test@example.com", "test@example.com", false);
    }

    @Test
    public void test1253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1253");
        com.reservation_system.model.Student student5 = new com.reservation_system.model.Student((int) (byte) 0, "headlabcoordinator", "", "test@example.com", true);
        student5.setApproved(false);
    }

    @Test
    public void test1254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1254");
        com.reservation_system.model.Faculty faculty5 = new com.reservation_system.model.Faculty(0, "headlabcoordinator", "student", "labmanager", false);
        java.lang.String str6 = faculty5.getName();
        java.lang.String str7 = faculty5.getName();
        java.lang.String str8 = faculty5.getUserType();
        java.lang.String str9 = faculty5.getUserType();
        java.lang.String str10 = faculty5.getUserType();
        faculty5.setApproved(false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "headlabcoordinator" + "'", str6, "headlabcoordinator");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "headlabcoordinator" + "'", str7, "headlabcoordinator");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Faculty" + "'", str8, "Faculty");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Faculty" + "'", str9, "Faculty");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Faculty" + "'", str10, "Faculty");
    }

    @Test
    public void test1255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1255");
        com.reservation_system.model.User user6 = com.reservation_system.patterns.factory.UserFactory.createUser("guest", 100, "hi!", "student", "Andrew", true);
        org.junit.Assert.assertNotNull(user6);
    }

    @Test
    public void test1256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1256");
        com.reservation_system.model.HeadLabCoordinator headLabCoordinator5 = new com.reservation_system.model.HeadLabCoordinator((int) (byte) 100, "", "", "data/test-users.csv", false);
        java.lang.Class<?> wildcardClass6 = headLabCoordinator5.getClass();
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test1257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1257");
        com.reservation_system.model.Researcher researcher5 = new com.reservation_system.model.Researcher((int) (short) 10, "Andrew", "student", "faculty", false);
    }

    @Test
    public void test1258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1258");
        com.reservation_system.model.HeadLabCoordinator headLabCoordinator5 = new com.reservation_system.model.HeadLabCoordinator(100, "guest", "guest", "Password1!", true);
        java.lang.String str6 = headLabCoordinator5.getUserType();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "headlabcoordinator" + "'", str6, "headlabcoordinator");
    }

    @Test
    public void test1259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1259");
        com.reservation_system.model.Researcher researcher5 = new com.reservation_system.model.Researcher(0, "hi!", "", "faculty", false);
    }

    @Test
    public void test1260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1260");
        com.reservation_system.model.HeadLabCoordinator headLabCoordinator5 = new com.reservation_system.model.HeadLabCoordinator(10, "researcher", "Student", "guest", true);
    }

    @Test
    public void test1261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1261");
        com.reservation_system.model.HeadLabCoordinator headLabCoordinator5 = new com.reservation_system.model.HeadLabCoordinator(98, "Student", "", "labmanager", true);
    }

    @Test
    public void test1262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1262");
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
        com.reservation_system.services.AuthService authService18 = new com.reservation_system.services.AuthService(userRepository1);
        // The following exception was thrown during execution in test generation
        try {
            com.reservation_system.model.User user21 = authService18.login("faculty", "Researcher");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: No user found with that email.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(userList2);
        org.junit.Assert.assertNotNull(userList3);
        org.junit.Assert.assertNotNull(userOptional6);
        org.junit.Assert.assertNotNull(userList8);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 101 + "'", int17 == 101);
    }

    @Test
    public void test1263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1263");
        com.reservation_system.model.LabManager labManager5 = new com.reservation_system.model.LabManager(35, "student", "test@example.com", "Student", true);
        java.lang.String str6 = labManager5.getUserType();
        java.lang.Class<?> wildcardClass7 = labManager5.getClass();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "labmanager" + "'", str6, "labmanager");
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test1264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1264");
        com.reservation_system.model.Guest guest5 = new com.reservation_system.model.Guest(0, "test@example.com", "Student", "student", false);
    }

    @Test
    public void test1265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1265");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("data/test-users.csv");
        java.util.List<com.reservation_system.model.User> userList2 = userRepository1.getAllUsers();
        com.reservation_system.services.AuthService authService3 = new com.reservation_system.services.AuthService(userRepository1);
        com.reservation_system.services.AuthService authService4 = new com.reservation_system.services.AuthService(userRepository1);
        com.reservation_system.services.AuthService authService5 = new com.reservation_system.services.AuthService(userRepository1);
        boolean boolean6 = userRepository1.headLabCoordinatorExists();
        java.util.Optional<com.reservation_system.model.User> userOptional8 = userRepository1.findByEmail("faculty");
        int int9 = userRepository1.getNextID();
        com.reservation_system.services.AuthService authService10 = new com.reservation_system.services.AuthService(userRepository1);
        java.util.Optional<com.reservation_system.model.User> userOptional12 = userRepository1.findByEmail("guest");
        org.junit.Assert.assertNotNull(userList2);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(userOptional8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 101 + "'", int9 == 101);
        org.junit.Assert.assertNotNull(userOptional12);
    }

    @Test
    public void test1266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1266");
        com.reservation_system.model.Guest guest5 = new com.reservation_system.model.Guest((int) ' ', "Andrew", "", "Andrew", false);
    }

    @Test
    public void test1267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1267");
        com.reservation_system.model.HeadLabCoordinator headLabCoordinator5 = new com.reservation_system.model.HeadLabCoordinator((int) (byte) 1, "data/test-users.csv", "Researcher", "researcher", false);
        java.lang.String str6 = headLabCoordinator5.getUserType();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "headlabcoordinator" + "'", str6, "headlabcoordinator");
    }

    @Test
    public void test1268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1268");
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
        int int95 = userRepository1.getNextID();
        java.util.Optional<com.reservation_system.model.User> userOptional97 = userRepository1.findByEmail("Researcher");
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
        org.junit.Assert.assertTrue("'" + int94 + "' != '" + 98 + "'", int94 == 98);
        org.junit.Assert.assertTrue("'" + int95 + "' != '" + 98 + "'", int95 == 98);
        org.junit.Assert.assertNotNull(userOptional97);
    }

    @Test
    public void test1269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1269");
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
        // The following exception was thrown during execution in test generation
        try {
            com.reservation_system.model.User user20 = authService17.login("Faculty", "Student");
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
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(userOptional16);
    }

    @Test
    public void test1270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1270");
        // The following exception was thrown during execution in test generation
        try {
            com.reservation_system.model.User user6 = com.reservation_system.patterns.factory.UserFactory.createUser("data/test-users.csv", 102, "headlabcoordinator", "Guest", "WrongPassword1!", false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid user type: data/test-users.csv");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1271");
        com.reservation_system.model.User user6 = com.reservation_system.patterns.factory.UserFactory.createUser("guest", 102, "Student", "Student", "student", false);
        org.junit.Assert.assertNotNull(user6);
    }

    @Test
    public void test1272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1272");
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
        com.reservation_system.repository.UserRepository userRepository24 = new com.reservation_system.repository.UserRepository("data/test-users.csv");
        java.util.List<com.reservation_system.model.User> userList25 = userRepository24.getAllUsers();
        com.reservation_system.services.AuthService authService26 = new com.reservation_system.services.AuthService(userRepository24);
        com.reservation_system.model.LabManager labManager32 = new com.reservation_system.model.LabManager((int) (short) 0, "", "student", "Andrew", true);
        boolean boolean33 = labManager32.isApproved();
        userRepository24.addUser((com.reservation_system.model.User) labManager32);
        boolean boolean36 = userRepository24.emailExists("Researcher");
        java.util.List<com.reservation_system.model.User> userList37 = userRepository24.getAllUsers();
        userRepository1.saveAllUsers(userList37);
        java.util.Optional<com.reservation_system.model.User> userOptional40 = userRepository1.findByEmail("researcher");
        org.junit.Assert.assertNotNull(userList2);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(userOptional22);
        org.junit.Assert.assertNotNull(userList25);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertNotNull(userList37);
        org.junit.Assert.assertNotNull(userOptional40);
    }

    @Test
    public void test1273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1273");
        com.reservation_system.model.Guest guest5 = new com.reservation_system.model.Guest((int) (byte) 100, "Password1!", "Guest", "Guest", true);
        java.lang.String str6 = guest5.getUserType();
        int int7 = guest5.getID();
        java.lang.String str8 = guest5.getEmail();
        java.lang.String str9 = guest5.getUserType();
        java.lang.String str10 = guest5.getUserType();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Guest" + "'", str6, "Guest");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 100 + "'", int7 == 100);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Guest" + "'", str8, "Guest");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Guest" + "'", str9, "Guest");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Guest" + "'", str10, "Guest");
    }

    @Test
    public void test1274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1274");
        com.reservation_system.model.Researcher researcher5 = new com.reservation_system.model.Researcher((int) ' ', "faculty", "student", "student", false);
        int int6 = researcher5.getID();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 32 + "'", int6 == 32);
    }

    @Test
    public void test1275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1275");
        com.reservation_system.model.Faculty faculty5 = new com.reservation_system.model.Faculty((int) (short) 10, "Andrew", "", "", true);
    }

    @Test
    public void test1276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1276");
        com.reservation_system.model.User user6 = com.reservation_system.patterns.factory.UserFactory.createUser("Faculty", (int) (short) 100, "", "Guest", "hi!", true);
        org.junit.Assert.assertNotNull(user6);
    }

    @Test
    public void test1277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1277");
        com.reservation_system.model.Guest guest5 = new com.reservation_system.model.Guest((int) (byte) 1, "data/test-users.csv", "test@example.com", "WrongPassword1!", false);
        java.lang.String str6 = guest5.getUserType();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Guest" + "'", str6, "Guest");
    }

    @Test
    public void test1278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1278");
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
        boolean boolean26 = userRepository1.emailExists("labmanager");
        com.reservation_system.model.Researcher researcher32 = new com.reservation_system.model.Researcher((int) (short) -1, "researcher", "test@example.com", "Faculty", true);
        boolean boolean33 = researcher32.requiresDepartmentApproval();
        boolean boolean34 = researcher32.isApproved();
        java.lang.String str35 = researcher32.getUserType();
        boolean boolean36 = researcher32.requiresDepartmentApproval();
        userRepository1.addUser((com.reservation_system.model.User) researcher32);
        int int38 = researcher32.getID();
        org.junit.Assert.assertNotNull(userList2);
        org.junit.Assert.assertNotNull(userList3);
        org.junit.Assert.assertNotNull(userOptional6);
        org.junit.Assert.assertNotNull(userList8);
// flaky "16) test1278(com.reservation_system.Randoop.AuthService.RegressionTest2)":         org.junit.Assert.assertTrue("'" + int9 + "' != '" + 100 + "'", int9 == 100);
        org.junit.Assert.assertNotNull(userList12);
// flaky "8) test1278(com.reservation_system.Randoop.AuthService.RegressionTest2)":         org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
// flaky "4) test1278(com.reservation_system.Randoop.AuthService.RegressionTest2)":         org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertNotNull(userList23);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "Researcher" + "'", str35, "Researcher");
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + (-1) + "'", int38 == (-1));
    }

    @Test
    public void test1279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1279");
        com.reservation_system.model.LabManager labManager5 = new com.reservation_system.model.LabManager(0, "WrongPassword1!", "Password1!", "WrongPassword1!", false);
        boolean boolean6 = labManager5.isApproved();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test1280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1280");
        com.reservation_system.model.LabManager labManager5 = new com.reservation_system.model.LabManager(36, "test@example.com", "Password1!", "hi!", false);
        boolean boolean6 = labManager5.isApproved();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test1281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1281");
        com.reservation_system.model.Guest guest5 = new com.reservation_system.model.Guest((int) '#', "test@example.com", "Password1!", "test@example.com", true);
        java.lang.String str6 = guest5.getName();
        java.lang.String str7 = guest5.getName();
        boolean boolean8 = guest5.requiresDepartmentApproval();
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test1282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1282");
        // The following exception was thrown during execution in test generation
        try {
            com.reservation_system.model.User user6 = com.reservation_system.patterns.factory.UserFactory.createUser("", 102, "test@example.com", "student", "data/test-users.csv", true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid user type: ");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1283");
        com.reservation_system.model.Researcher researcher5 = new com.reservation_system.model.Researcher((int) (byte) 10, "researcher", "Researcher", "", false);
        boolean boolean6 = researcher5.isApproved();
        java.lang.String str7 = researcher5.getPassword();
        java.lang.String str8 = researcher5.getUserType();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Researcher" + "'", str8, "Researcher");
    }

    @Test
    public void test1284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1284");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("data/test-users.csv");
        java.util.List<com.reservation_system.model.User> userList2 = userRepository1.getAllUsers();
        com.reservation_system.services.AuthService authService3 = new com.reservation_system.services.AuthService(userRepository1);
        com.reservation_system.services.AuthService authService4 = new com.reservation_system.services.AuthService(userRepository1);
        boolean boolean5 = userRepository1.headLabCoordinatorExists();
        com.reservation_system.services.AuthService authService6 = new com.reservation_system.services.AuthService(userRepository1);
        // The following exception was thrown during execution in test generation
        try {
            com.reservation_system.model.User user9 = authService6.login("labmanager", "WrongPassword1!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: No user found with that email.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(userList2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
    }

    @Test
    public void test1285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1285");
        com.reservation_system.model.Guest guest5 = new com.reservation_system.model.Guest(97, "Andrew", "student", "researcher", true);
        boolean boolean6 = guest5.requiresDepartmentApproval();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test1286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1286");
        com.reservation_system.model.HeadLabCoordinator headLabCoordinator5 = new com.reservation_system.model.HeadLabCoordinator(0, "researcher", "Password1!", "headlabcoordinator", true);
        java.lang.String str6 = headLabCoordinator5.getUserType();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "headlabcoordinator" + "'", str6, "headlabcoordinator");
    }

    @Test
    public void test1287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1287");
        com.reservation_system.model.HeadLabCoordinator headLabCoordinator5 = new com.reservation_system.model.HeadLabCoordinator(98, "headlabcoordinator", "Andrew", "guest", false);
        java.lang.String str6 = headLabCoordinator5.getUserType();
        int int7 = headLabCoordinator5.getID();
        java.lang.String str8 = headLabCoordinator5.getName();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "headlabcoordinator" + "'", str6, "headlabcoordinator");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 98 + "'", int7 == 98);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "headlabcoordinator" + "'", str8, "headlabcoordinator");
    }

    @Test
    public void test1288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1288");
        com.reservation_system.model.Researcher researcher5 = new com.reservation_system.model.Researcher((int) (short) -1, "faculty", "", "labmanager", false);
    }

    @Test
    public void test1289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1289");
        com.reservation_system.model.HeadLabCoordinator headLabCoordinator5 = new com.reservation_system.model.HeadLabCoordinator(98, "headlabcoordinator", "Andrew", "guest", false);
        java.lang.String str6 = headLabCoordinator5.getUserType();
        java.lang.String str7 = headLabCoordinator5.getPassword();
        int int8 = headLabCoordinator5.getID();
        java.lang.String str9 = headLabCoordinator5.getUserType();
        java.lang.String str10 = headLabCoordinator5.getUserType();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "headlabcoordinator" + "'", str6, "headlabcoordinator");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "guest" + "'", str7, "guest");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 98 + "'", int8 == 98);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "headlabcoordinator" + "'", str9, "headlabcoordinator");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "headlabcoordinator" + "'", str10, "headlabcoordinator");
    }

    @Test
    public void test1290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1290");
        com.reservation_system.model.HeadLabCoordinator headLabCoordinator5 = new com.reservation_system.model.HeadLabCoordinator(98, "headlabcoordinator", "Andrew", "guest", false);
        java.lang.String str6 = headLabCoordinator5.getUserType();
        java.lang.String str7 = headLabCoordinator5.getEmail();
        boolean boolean8 = headLabCoordinator5.isApproved();
        java.lang.String str9 = headLabCoordinator5.getUserType();
        java.lang.String str10 = headLabCoordinator5.getUserType();
        java.lang.String str11 = headLabCoordinator5.getEmail();
        boolean boolean12 = headLabCoordinator5.isApproved();
        java.lang.String str13 = headLabCoordinator5.getName();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "headlabcoordinator" + "'", str6, "headlabcoordinator");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Andrew" + "'", str7, "Andrew");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "headlabcoordinator" + "'", str9, "headlabcoordinator");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "headlabcoordinator" + "'", str10, "headlabcoordinator");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Andrew" + "'", str11, "Andrew");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "headlabcoordinator" + "'", str13, "headlabcoordinator");
    }

    @Test
    public void test1291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1291");
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
        int int24 = userRepository1.getNextID();
        org.junit.Assert.assertNotNull(userList2);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
// flaky "17) test1291(com.reservation_system.Randoop.AuthService.RegressionTest2)":         org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
// flaky "9) test1291(com.reservation_system.Randoop.AuthService.RegressionTest2)":         org.junit.Assert.assertTrue("'" + int22 + "' != '" + 100 + "'", int22 == 100);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
// flaky "5) test1291(com.reservation_system.Randoop.AuthService.RegressionTest2)":         org.junit.Assert.assertTrue("'" + int24 + "' != '" + 100 + "'", int24 == 100);
    }

    @Test
    public void test1292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1292");
        com.reservation_system.model.HeadLabCoordinator headLabCoordinator5 = new com.reservation_system.model.HeadLabCoordinator(1, "faculty", "Faculty", "", true);
        java.lang.String str6 = headLabCoordinator5.getUserType();
        headLabCoordinator5.setApproved(false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "headlabcoordinator" + "'", str6, "headlabcoordinator");
    }

    @Test
    public void test1293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1293");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("data/test-users.csv");
        boolean boolean2 = userRepository1.headLabCoordinatorExists();
        int int3 = userRepository1.getNextID();
        int int4 = userRepository1.getNextID();
        com.reservation_system.services.AuthService authService5 = new com.reservation_system.services.AuthService(userRepository1);
        // The following exception was thrown during execution in test generation
        try {
            com.reservation_system.model.User user8 = authService5.login("Researcher", "student");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: No user found with that email.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
// flaky "18) test1293(com.reservation_system.Randoop.AuthService.RegressionTest2)":         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
// flaky "10) test1293(com.reservation_system.Randoop.AuthService.RegressionTest2)":         org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
    }

    @Test
    public void test1294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1294");
        com.reservation_system.model.Faculty faculty5 = new com.reservation_system.model.Faculty(0, "Andrew", "", "Faculty", true);
    }

    @Test
    public void test1295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1295");
        com.reservation_system.model.Researcher researcher5 = new com.reservation_system.model.Researcher((int) (short) -1, "headlabcoordinator", "student", "", false);
        boolean boolean6 = researcher5.isApproved();
        java.lang.String str7 = researcher5.getEmail();
        java.lang.String str8 = researcher5.getUserType();
        java.lang.String str9 = researcher5.getUserType();
        java.lang.String str10 = researcher5.getName();
        java.lang.String str11 = researcher5.getUserType();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "student" + "'", str7, "student");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Researcher" + "'", str8, "Researcher");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Researcher" + "'", str9, "Researcher");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "headlabcoordinator" + "'", str10, "headlabcoordinator");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Researcher" + "'", str11, "Researcher");
    }

    @Test
    public void test1296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1296");
        com.reservation_system.model.Student student5 = new com.reservation_system.model.Student((int) (short) 100, "test@example.com", "Andrew", "Researcher", true);
    }

    @Test
    public void test1297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1297");
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
        com.reservation_system.model.Student student28 = new com.reservation_system.model.Student(10, "Password1!", "test@example.com", "researcher", false);
        java.lang.String str29 = student28.getPassword();
        java.lang.String str30 = student28.getPassword();
        java.lang.String str31 = student28.getUserType();
        userRepository1.addUser((com.reservation_system.model.User) student28);
        org.junit.Assert.assertNotNull(userList2);
        org.junit.Assert.assertNotNull(userList5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(userOptional10);
// flaky "19) test1297(com.reservation_system.Randoop.AuthService.RegressionTest2)":         org.junit.Assert.assertTrue("'" + int11 + "' != '" + 100 + "'", int11 == 100);
        org.junit.Assert.assertNotNull(userList14);
        org.junit.Assert.assertNotNull(userOptional17);
        org.junit.Assert.assertNotNull(userList18);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "researcher" + "'", str29, "researcher");
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "researcher" + "'", str30, "researcher");
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "Student" + "'", str31, "Student");
    }

    @Test
    public void test1298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1298");
        com.reservation_system.model.Researcher researcher5 = new com.reservation_system.model.Researcher((int) (byte) 0, "Researcher", "Guest", "", true);
    }

    @Test
    public void test1299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1299");
        com.reservation_system.model.Researcher researcher5 = new com.reservation_system.model.Researcher(0, "headlabcoordinator", "hi!", "Guest", false);
    }

    @Test
    public void test1300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1300");
        com.reservation_system.model.Researcher researcher5 = new com.reservation_system.model.Researcher((int) (byte) -1, "Andrew", "Student", "data/test-users.csv", false);
        java.lang.String str6 = researcher5.getName();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Andrew" + "'", str6, "Andrew");
    }

    @Test
    public void test1301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1301");
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
        com.reservation_system.services.AuthService authService44 = new com.reservation_system.services.AuthService(userRepository1);
        org.junit.Assert.assertNotNull(userList2);
// flaky "20) test1301(com.reservation_system.Randoop.AuthService.RegressionTest2)":         org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
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
    }

    @Test
    public void test1302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1302");
        com.reservation_system.model.Researcher researcher5 = new com.reservation_system.model.Researcher((int) (short) -1, "researcher", "test@example.com", "Faculty", true);
        java.lang.String str6 = researcher5.getUserType();
        boolean boolean7 = researcher5.requiresDepartmentApproval();
        java.lang.String str8 = researcher5.getUserType();
        java.lang.String str9 = researcher5.getPassword();
        boolean boolean10 = researcher5.isApproved();
        researcher5.setApproved(false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Researcher" + "'", str6, "Researcher");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Researcher" + "'", str8, "Researcher");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Faculty" + "'", str9, "Faculty");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test1303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1303");
        com.reservation_system.model.Student student5 = new com.reservation_system.model.Student((int) (short) 1, "WrongPassword1!", "labmanager", "Faculty", false);
    }

    @Test
    public void test1304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1304");
        com.reservation_system.model.Faculty faculty5 = new com.reservation_system.model.Faculty((int) ' ', "headlabcoordinator", "", "", true);
    }

    @Test
    public void test1305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1305");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("data/test-users.csv");
        boolean boolean2 = userRepository1.headLabCoordinatorExists();
        com.reservation_system.model.Faculty faculty8 = new com.reservation_system.model.Faculty(0, "headlabcoordinator", "student", "labmanager", false);
        userRepository1.addUser((com.reservation_system.model.User) faculty8);
        com.reservation_system.model.HeadLabCoordinator headLabCoordinator15 = new com.reservation_system.model.HeadLabCoordinator(10, "headlabcoordinator", "data/test-users.csv", "faculty", false);
        java.lang.String str16 = headLabCoordinator15.getEmail();
        java.lang.String str17 = headLabCoordinator15.getUserType();
        userRepository1.addUser((com.reservation_system.model.User) headLabCoordinator15);
        boolean boolean19 = userRepository1.headLabCoordinatorExists();
        java.util.List<com.reservation_system.model.User> userList20 = userRepository1.getAllUsers();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "data/test-users.csv" + "'", str16, "data/test-users.csv");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "headlabcoordinator" + "'", str17, "headlabcoordinator");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNotNull(userList20);
    }

    @Test
    public void test1306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1306");
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
        boolean boolean23 = user19.requiresDepartmentApproval();
        boolean boolean24 = user19.requiresDepartmentApproval();
        org.junit.Assert.assertNotNull(userList2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(userOptional7);
// flaky "21) test1306(com.reservation_system.Randoop.AuthService.RegressionTest2)":         org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8 == 100);
// flaky "11) test1306(com.reservation_system.Randoop.AuthService.RegressionTest2)":         org.junit.Assert.assertTrue("'" + int9 + "' != '" + 100 + "'", int9 == 100);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(user19);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
    }

    @Test
    public void test1307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1307");
        com.reservation_system.model.Guest guest5 = new com.reservation_system.model.Guest(102, "Researcher", "", "researcher", false);
    }

    @Test
    public void test1308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1308");
        com.reservation_system.model.User user6 = com.reservation_system.patterns.factory.UserFactory.createUser("guest", 97, "", "headlabcoordinator", "Password1!", false);
        boolean boolean7 = user6.isApproved();
        boolean boolean8 = user6.isApproved();
        org.junit.Assert.assertNotNull(user6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test1309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1309");
        com.reservation_system.model.Faculty faculty5 = new com.reservation_system.model.Faculty((int) (short) 100, "", "hi!", "Andrew", false);
        java.lang.String str6 = faculty5.getUserType();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Faculty" + "'", str6, "Faculty");
    }

    @Test
    public void test1310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1310");
        com.reservation_system.model.Student student5 = new com.reservation_system.model.Student((int) (byte) 10, "faculty", "Guest", "Researcher", true);
        java.lang.String str6 = student5.getPassword();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Researcher" + "'", str6, "Researcher");
    }

    @Test
    public void test1311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1311");
        com.reservation_system.model.Faculty faculty5 = new com.reservation_system.model.Faculty((int) '4', "labmanager", "", "Password1!", false);
    }

    @Test
    public void test1312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1312");
        com.reservation_system.model.LabManager labManager5 = new com.reservation_system.model.LabManager(0, "researcher", "headlabcoordinator", "Andrew", true);
        java.lang.String str6 = labManager5.getName();
        java.lang.String str7 = labManager5.getPassword();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "researcher" + "'", str6, "researcher");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Andrew" + "'", str7, "Andrew");
    }

    @Test
    public void test1313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1313");
        // The following exception was thrown during execution in test generation
        try {
            com.reservation_system.model.User user6 = com.reservation_system.patterns.factory.UserFactory.createUser("Andrew", (int) '4', "Password1!", "Andrew", "labmanager", false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid user type: Andrew");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1314");
        com.reservation_system.model.HeadLabCoordinator headLabCoordinator5 = new com.reservation_system.model.HeadLabCoordinator(52, "", "Faculty", "test@example.com", false);
        java.lang.String str6 = headLabCoordinator5.getPassword();
    }

    @Test
    public void test1315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1315");
        com.reservation_system.model.Student student5 = new com.reservation_system.model.Student((int) (byte) -1, "test@example.com", "headlabcoordinator", "student", false);
        java.lang.String str6 = student5.getUserType();
        java.lang.String str7 = student5.getUserType();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Student" + "'", str6, "Student");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Student" + "'", str7, "Student");
    }

    @Test
    public void test1316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1316");
        com.reservation_system.model.LabManager labManager5 = new com.reservation_system.model.LabManager(100, "headlabcoordinator", "Password1!", "Password1!", true);
        java.lang.String str6 = labManager5.getName();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "headlabcoordinator" + "'", str6, "headlabcoordinator");
    }

    @Test
    public void test1317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1317");
        com.reservation_system.model.Guest guest5 = new com.reservation_system.model.Guest(98, "hi!", "Researcher", "WrongPassword1!", false);
    }

    @Test
    public void test1318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1318");
        com.reservation_system.model.LabManager labManager5 = new com.reservation_system.model.LabManager(0, "Researcher", "guest", "Andrew", false);
        java.lang.Class<?> wildcardClass6 = labManager5.getClass();
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test1319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1319");
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
        com.reservation_system.repository.UserRepository userRepository19 = new com.reservation_system.repository.UserRepository("data/test-users.csv");
        java.util.List<com.reservation_system.model.User> userList20 = userRepository19.getAllUsers();
        com.reservation_system.services.AuthService authService21 = new com.reservation_system.services.AuthService(userRepository19);
        com.reservation_system.services.AuthService authService22 = new com.reservation_system.services.AuthService(userRepository19);
        com.reservation_system.services.AuthService authService23 = new com.reservation_system.services.AuthService(userRepository19);
        com.reservation_system.repository.UserRepository userRepository25 = new com.reservation_system.repository.UserRepository("data/test-users.csv");
        boolean boolean26 = userRepository25.headLabCoordinatorExists();
        int int27 = userRepository25.getNextID();
        java.util.List<com.reservation_system.model.User> userList28 = userRepository25.getAllUsers();
        userRepository19.saveAllUsers(userList28);
        java.util.List<com.reservation_system.model.User> userList30 = userRepository19.getAllUsers();
        userRepository1.saveAllUsers(userList30);
        org.junit.Assert.assertNotNull(userList2);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(userList14);
        org.junit.Assert.assertNotNull(userList15);
        org.junit.Assert.assertNotNull(userList17);
        org.junit.Assert.assertNotNull(userList20);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
// flaky "22) test1319(com.reservation_system.Randoop.AuthService.RegressionTest2)":         org.junit.Assert.assertTrue("'" + int27 + "' != '" + 100 + "'", int27 == 100);
        org.junit.Assert.assertNotNull(userList28);
        org.junit.Assert.assertNotNull(userList30);
    }

    @Test
    public void test1320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1320");
        com.reservation_system.model.Faculty faculty5 = new com.reservation_system.model.Faculty((int) (short) 0, "labmanager", "WrongPassword1!", "data/test-users.csv", true);
    }

    @Test
    public void test1321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1321");
        com.reservation_system.model.HeadLabCoordinator headLabCoordinator5 = new com.reservation_system.model.HeadLabCoordinator((int) (short) 100, "Researcher", "guest", "researcher", true);
        java.lang.String str6 = headLabCoordinator5.getUserType();
        java.lang.String str7 = headLabCoordinator5.getUserType();
        boolean boolean8 = headLabCoordinator5.requiresDepartmentApproval();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "headlabcoordinator" + "'", str6, "headlabcoordinator");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "headlabcoordinator" + "'", str7, "headlabcoordinator");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test1322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1322");
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
            com.reservation_system.model.User user89 = authService86.login("Andrew", "labmanager");
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
    public void test1323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1323");
        com.reservation_system.model.Researcher researcher5 = new com.reservation_system.model.Researcher((int) (short) -1, "headlabcoordinator", "student", "", false);
        java.lang.String str6 = researcher5.getUserType();
        boolean boolean7 = researcher5.isApproved();
        java.lang.String str8 = researcher5.getEmail();
        boolean boolean9 = researcher5.requiresDepartmentApproval();
        boolean boolean10 = researcher5.isApproved();
        java.lang.String str11 = researcher5.getPassword();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Researcher" + "'", str6, "Researcher");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "student" + "'", str8, "student");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
    }

    @Test
    public void test1324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1324");
        com.reservation_system.model.Student student5 = new com.reservation_system.model.Student(0, "student", "Andrew", "guest", false);
        java.lang.String str6 = student5.getPassword();
        java.lang.String str7 = student5.getUserType();
        java.lang.String str8 = student5.getUserType();
        java.lang.String str9 = student5.getPassword();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "guest" + "'", str6, "guest");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Student" + "'", str7, "Student");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Student" + "'", str8, "Student");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "guest" + "'", str9, "guest");
    }

    @Test
    public void test1325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1325");
        com.reservation_system.model.Guest guest5 = new com.reservation_system.model.Guest((int) '4', "Andrew", "data/test-users.csv", "headlabcoordinator", true);
        guest5.setApproved(true);
        java.lang.String str8 = guest5.getUserType();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Guest" + "'", str8, "Guest");
    }

    @Test
    public void test1326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1326");
        com.reservation_system.model.HeadLabCoordinator headLabCoordinator5 = new com.reservation_system.model.HeadLabCoordinator((-1), "labmanager", "Student", "labmanager", true);
    }

    @Test
    public void test1327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1327");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("data/test-users.csv");
        java.util.Optional<com.reservation_system.model.User> userOptional3 = userRepository1.findByEmail("Password1!");
        boolean boolean5 = userRepository1.emailExists("Guest");
        com.reservation_system.repository.UserRepository userRepository7 = new com.reservation_system.repository.UserRepository("data/test-users.csv");
        java.util.List<com.reservation_system.model.User> userList8 = userRepository7.getAllUsers();
        com.reservation_system.services.AuthService authService9 = new com.reservation_system.services.AuthService(userRepository7);
        java.util.Optional<com.reservation_system.model.User> userOptional11 = userRepository7.findByEmail("");
        java.util.List<com.reservation_system.model.User> userList12 = userRepository7.getAllUsers();
        boolean boolean14 = userRepository7.emailExists("labmanager");
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
        boolean boolean29 = userRepository16.headLabCoordinatorExists();
        java.util.List<com.reservation_system.model.User> userList30 = userRepository16.getAllUsers();
        userRepository7.saveAllUsers(userList30);
        userRepository1.saveAllUsers(userList30);
        org.junit.Assert.assertNotNull(userOptional3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(userList8);
        org.junit.Assert.assertNotNull(userOptional11);
        org.junit.Assert.assertNotNull(userList12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(userList17);
        org.junit.Assert.assertNotNull(userList18);
        org.junit.Assert.assertNotNull(userList21);
// flaky "23) test1327(com.reservation_system.Randoop.AuthService.RegressionTest2)":         org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertNotNull(userList25);
        org.junit.Assert.assertNotNull(userList26);
// flaky "12) test1327(com.reservation_system.Randoop.AuthService.RegressionTest2)":         org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertNotNull(userList30);
    }

    @Test
    public void test1328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1328");
        com.reservation_system.model.Researcher researcher5 = new com.reservation_system.model.Researcher((int) (short) -1, "headlabcoordinator", "student", "", false);
        java.lang.String str6 = researcher5.getUserType();
        boolean boolean7 = researcher5.isApproved();
        researcher5.setApproved(true);
        int int10 = researcher5.getID();
        java.lang.String str11 = researcher5.getUserType();
        java.lang.String str12 = researcher5.getPassword();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Researcher" + "'", str6, "Researcher");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Researcher" + "'", str11, "Researcher");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test1329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1329");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("data/test-users.csv");
        java.util.List<com.reservation_system.model.User> userList2 = userRepository1.getAllUsers();
        com.reservation_system.services.AuthService authService3 = new com.reservation_system.services.AuthService(userRepository1);
        java.util.Optional<com.reservation_system.model.User> userOptional5 = userRepository1.findByEmail("");
        java.util.List<com.reservation_system.model.User> userList6 = userRepository1.getAllUsers();
        boolean boolean8 = userRepository1.emailExists("labmanager");
        java.util.Optional<com.reservation_system.model.User> userOptional10 = userRepository1.findByEmail("faculty");
        java.util.List<com.reservation_system.model.User> userList11 = userRepository1.getAllUsers();
        org.junit.Assert.assertNotNull(userList2);
        org.junit.Assert.assertNotNull(userOptional5);
        org.junit.Assert.assertNotNull(userList6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(userOptional10);
        org.junit.Assert.assertNotNull(userList11);
    }

    @Test
    public void test1330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1330");
        com.reservation_system.model.Guest guest5 = new com.reservation_system.model.Guest((int) '4', "researcher", "Password1!", "Password1!", false);
    }

    @Test
    public void test1331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1331");
        com.reservation_system.model.Student student5 = new com.reservation_system.model.Student(0, "guest", "faculty", "faculty", true);
        java.lang.String str6 = student5.getName();
        java.lang.String str7 = student5.getUserType();
        boolean boolean8 = student5.requiresDepartmentApproval();
        int int9 = student5.getID();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "guest" + "'", str6, "guest");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Student" + "'", str7, "Student");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test1332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1332");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("data/test-users.csv");
        java.util.List<com.reservation_system.model.User> userList2 = userRepository1.getAllUsers();
        com.reservation_system.services.AuthService authService3 = new com.reservation_system.services.AuthService(userRepository1);
        com.reservation_system.model.LabManager labManager9 = new com.reservation_system.model.LabManager((int) (short) 0, "", "student", "Andrew", true);
        boolean boolean10 = labManager9.isApproved();
        userRepository1.addUser((com.reservation_system.model.User) labManager9);
        com.reservation_system.repository.UserRepository userRepository13 = new com.reservation_system.repository.UserRepository("data/test-users.csv");
        java.util.List<com.reservation_system.model.User> userList14 = userRepository13.getAllUsers();
        com.reservation_system.services.AuthService authService15 = new com.reservation_system.services.AuthService(userRepository13);
        java.util.Optional<com.reservation_system.model.User> userOptional17 = userRepository13.findByEmail("");
        java.util.List<com.reservation_system.model.User> userList18 = userRepository13.getAllUsers();
        com.reservation_system.model.Researcher researcher24 = new com.reservation_system.model.Researcher(10, "Password1!", "", "WrongPassword1!", false);
        userRepository13.addUser((com.reservation_system.model.User) researcher24);
        userRepository1.addUser((com.reservation_system.model.User) researcher24);
        boolean boolean27 = researcher24.requiresDepartmentApproval();
        org.junit.Assert.assertNotNull(userList2);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(userList14);
        org.junit.Assert.assertNotNull(userOptional17);
        org.junit.Assert.assertNotNull(userList18);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
    }

    @Test
    public void test1333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1333");
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
        boolean boolean28 = userRepository1.emailExists("Student");
        com.reservation_system.repository.UserRepository userRepository30 = new com.reservation_system.repository.UserRepository("data/test-users.csv");
        java.util.List<com.reservation_system.model.User> userList31 = userRepository30.getAllUsers();
        com.reservation_system.services.AuthService authService32 = new com.reservation_system.services.AuthService(userRepository30);
        com.reservation_system.model.LabManager labManager38 = new com.reservation_system.model.LabManager((int) (short) 0, "", "student", "Andrew", true);
        boolean boolean39 = labManager38.isApproved();
        userRepository30.addUser((com.reservation_system.model.User) labManager38);
        com.reservation_system.repository.UserRepository userRepository42 = new com.reservation_system.repository.UserRepository("data/test-users.csv");
        java.util.List<com.reservation_system.model.User> userList43 = userRepository42.getAllUsers();
        java.util.List<com.reservation_system.model.User> userList44 = userRepository42.getAllUsers();
        userRepository30.saveAllUsers(userList44);
        java.util.List<com.reservation_system.model.User> userList46 = userRepository30.getAllUsers();
        userRepository1.saveAllUsers(userList46);
        boolean boolean49 = userRepository1.emailExists("labmanager");
        org.junit.Assert.assertNotNull(userList2);
        org.junit.Assert.assertNotNull(userOptional5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 98 + "'", int6 == 98);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "student" + "'", str15, "student");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Researcher" + "'", str16, "Researcher");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "student" + "'", str17, "student");
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 10 + "'", int25 == 10);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertNotNull(userList31);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
        org.junit.Assert.assertNotNull(userList43);
        org.junit.Assert.assertNotNull(userList44);
        org.junit.Assert.assertNotNull(userList46);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
    }

    @Test
    public void test1334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1334");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("data/test-users.csv");
        java.util.List<com.reservation_system.model.User> userList2 = userRepository1.getAllUsers();
        com.reservation_system.services.AuthService authService3 = new com.reservation_system.services.AuthService(userRepository1);
        com.reservation_system.services.AuthService authService4 = new com.reservation_system.services.AuthService(userRepository1);
        com.reservation_system.services.AuthService authService5 = new com.reservation_system.services.AuthService(userRepository1);
        java.util.List<com.reservation_system.model.User> userList6 = userRepository1.getAllUsers();
        boolean boolean8 = userRepository1.emailExists("WrongPassword1!");
        boolean boolean10 = userRepository1.emailExists("hi!");
        org.junit.Assert.assertNotNull(userList2);
        org.junit.Assert.assertNotNull(userList6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test1335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1335");
        com.reservation_system.model.Guest guest5 = new com.reservation_system.model.Guest((int) (byte) 1, "headlabcoordinator", "data/test-users.csv", "", false);
    }

    @Test
    public void test1336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1336");
        com.reservation_system.model.Student student5 = new com.reservation_system.model.Student((int) (byte) 10, "WrongPassword1!", "data/test-users.csv", "", true);
        java.lang.String str6 = student5.getEmail();
        java.lang.String str7 = student5.getUserType();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "data/test-users.csv" + "'", str6, "data/test-users.csv");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Student" + "'", str7, "Student");
    }

    @Test
    public void test1337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1337");
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
        com.reservation_system.services.AuthService authService61 = new com.reservation_system.services.AuthService(userRepository1);
        com.reservation_system.model.HeadLabCoordinator headLabCoordinator67 = new com.reservation_system.model.HeadLabCoordinator((-1), "test@example.com", "researcher", "faculty", false);
        java.lang.String str68 = headLabCoordinator67.getUserType();
        userRepository1.addUser((com.reservation_system.model.User) headLabCoordinator67);
        org.junit.Assert.assertNotNull(userList2);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 98 + "'", int19 == 98);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 98 + "'", int20 == 98);
        org.junit.Assert.assertNotNull(userList21);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "Researcher" + "'", str28, "Researcher");
        org.junit.Assert.assertNotNull(userList32);
// flaky "24) test1337(com.reservation_system.Randoop.AuthService.RegressionTest2)":         org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertNotNull(userList36);
        org.junit.Assert.assertNotNull(userList37);
        org.junit.Assert.assertNotNull(userList41);
// flaky "13) test1337(com.reservation_system.Randoop.AuthService.RegressionTest2)":         org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + true + "'", boolean42 == true);
// flaky "6) test1337(com.reservation_system.Randoop.AuthService.RegressionTest2)":         org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + true + "'", boolean43 == true);
        org.junit.Assert.assertNotNull(userList44);
// flaky "3) test1337(com.reservation_system.Randoop.AuthService.RegressionTest2)":         org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + true + "'", boolean46 == true);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + true + "'", boolean48 == true);
        org.junit.Assert.assertNotNull(userList51);
        org.junit.Assert.assertNotNull(userList52);
        org.junit.Assert.assertNotNull(userOptional55);
        org.junit.Assert.assertNotNull(userList57);
        org.junit.Assert.assertTrue("'" + int60 + "' != '" + 98 + "'", int60 == 98);
        org.junit.Assert.assertEquals("'" + str68 + "' != '" + "headlabcoordinator" + "'", str68, "headlabcoordinator");
    }

    @Test
    public void test1338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1338");
        com.reservation_system.model.Student student5 = new com.reservation_system.model.Student(10, "Andrew", "test@example.com", "headlabcoordinator", false);
        int int6 = student5.getID();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
    }

    @Test
    public void test1339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1339");
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
        com.reservation_system.repository.UserRepository userRepository14 = new com.reservation_system.repository.UserRepository("data/test-users.csv");
        java.util.List<com.reservation_system.model.User> userList15 = userRepository14.getAllUsers();
        com.reservation_system.services.AuthService authService16 = new com.reservation_system.services.AuthService(userRepository14);
        java.util.Optional<com.reservation_system.model.User> userOptional18 = userRepository14.findByEmail("");
        java.util.List<com.reservation_system.model.User> userList19 = userRepository14.getAllUsers();
        boolean boolean21 = userRepository14.emailExists("labmanager");
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
        boolean boolean36 = userRepository23.headLabCoordinatorExists();
        java.util.List<com.reservation_system.model.User> userList37 = userRepository23.getAllUsers();
        userRepository14.saveAllUsers(userList37);
        userRepository1.saveAllUsers(userList37);
        org.junit.Assert.assertNotNull(userList2);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 98 + "'", int9 == 98);
        org.junit.Assert.assertNotNull(userList10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 98 + "'", int12 == 98);
        org.junit.Assert.assertNotNull(userList15);
        org.junit.Assert.assertNotNull(userOptional18);
        org.junit.Assert.assertNotNull(userList19);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(userList24);
        org.junit.Assert.assertNotNull(userList25);
        org.junit.Assert.assertNotNull(userList28);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertNotNull(userList32);
        org.junit.Assert.assertNotNull(userList33);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertNotNull(userList37);
    }

    @Test
    public void test1340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1340");
        com.reservation_system.model.Guest guest5 = new com.reservation_system.model.Guest(99, "WrongPassword1!", "guest", "Guest", true);
    }

    @Test
    public void test1341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1341");
        com.reservation_system.model.Faculty faculty5 = new com.reservation_system.model.Faculty((int) '#', "researcher", "", "student", true);
        faculty5.setApproved(false);
        java.lang.String str8 = faculty5.getUserType();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Faculty" + "'", str8, "Faculty");
    }

    @Test
    public void test1342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1342");
        com.reservation_system.model.HeadLabCoordinator headLabCoordinator5 = new com.reservation_system.model.HeadLabCoordinator(98, "headlabcoordinator", "Andrew", "guest", false);
        java.lang.String str6 = headLabCoordinator5.getUserType();
        java.lang.String str7 = headLabCoordinator5.getEmail();
        java.lang.String str8 = headLabCoordinator5.getUserType();
        java.lang.String str9 = headLabCoordinator5.getUserType();
        java.lang.String str10 = headLabCoordinator5.getName();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "headlabcoordinator" + "'", str6, "headlabcoordinator");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Andrew" + "'", str7, "Andrew");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "headlabcoordinator" + "'", str8, "headlabcoordinator");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "headlabcoordinator" + "'", str9, "headlabcoordinator");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "headlabcoordinator" + "'", str10, "headlabcoordinator");
    }

    @Test
    public void test1343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1343");
        com.reservation_system.model.Faculty faculty5 = new com.reservation_system.model.Faculty(1, "", "student", "labmanager", false);
    }

    @Test
    public void test1344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1344");
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
        java.lang.String str17 = headLabCoordinator14.getUserType();
        org.junit.Assert.assertNotNull(userList2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(userList5);
        org.junit.Assert.assertNotNull(userOptional7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 99 + "'", int16 == 99);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "headlabcoordinator" + "'", str17, "headlabcoordinator");
    }

    @Test
    public void test1345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1345");
        com.reservation_system.model.Guest guest5 = new com.reservation_system.model.Guest(98, "faculty", "student", "Andrew", false);
        java.lang.String str6 = guest5.getPassword();
        java.lang.String str7 = guest5.getUserType();
        boolean boolean8 = guest5.requiresDepartmentApproval();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Andrew" + "'", str6, "Andrew");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Guest" + "'", str7, "Guest");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test1346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1346");
        com.reservation_system.model.Guest guest5 = new com.reservation_system.model.Guest(0, "researcher", "test@example.com", "labmanager", false);
        java.lang.String str6 = guest5.getEmail();
    }

    @Test
    public void test1347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1347");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("data/test-users.csv");
        java.util.List<com.reservation_system.model.User> userList2 = userRepository1.getAllUsers();
        com.reservation_system.services.AuthService authService3 = new com.reservation_system.services.AuthService(userRepository1);
        com.reservation_system.model.LabManager labManager9 = new com.reservation_system.model.LabManager((int) (short) 0, "", "student", "Andrew", true);
        boolean boolean10 = labManager9.isApproved();
        userRepository1.addUser((com.reservation_system.model.User) labManager9);
        com.reservation_system.model.Faculty faculty17 = new com.reservation_system.model.Faculty((int) '#', "researcher", "", "student", true);
        userRepository1.addUser((com.reservation_system.model.User) faculty17);
        boolean boolean19 = userRepository1.headLabCoordinatorExists();
        boolean boolean21 = userRepository1.emailExists("Guest");
        com.reservation_system.services.AuthService authService22 = new com.reservation_system.services.AuthService(userRepository1);
        // The following exception was thrown during execution in test generation
        try {
            com.reservation_system.model.User user25 = authService22.login("researcher", "researcher");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Incorrect password.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(userList2);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
    }

    @Test
    public void test1348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1348");
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
        boolean boolean29 = userRepository1.emailExists("researcher");
        org.junit.Assert.assertNotNull(userList2);
        org.junit.Assert.assertNotNull(userList3);
        org.junit.Assert.assertNotNull(userList7);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 100 + "'", int24 == 100);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 100 + "'", int25 == 100);
        org.junit.Assert.assertNotNull(userList26);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
    }

    @Test
    public void test1349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1349");
        com.reservation_system.model.LabManager labManager5 = new com.reservation_system.model.LabManager((int) (short) 100, "guest", "hi!", "Password1!", true);
    }

    @Test
    public void test1350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1350");
        com.reservation_system.model.LabManager labManager5 = new com.reservation_system.model.LabManager((int) '#', "Andrew", "data/test-users.csv", "Researcher", true);
    }

    @Test
    public void test1351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1351");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("data/test-users.csv");
        java.util.List<com.reservation_system.model.User> userList2 = userRepository1.getAllUsers();
        com.reservation_system.services.AuthService authService3 = new com.reservation_system.services.AuthService(userRepository1);
        com.reservation_system.model.LabManager labManager9 = new com.reservation_system.model.LabManager((int) (short) 0, "", "student", "Andrew", true);
        boolean boolean10 = labManager9.isApproved();
        userRepository1.addUser((com.reservation_system.model.User) labManager9);
        int int12 = labManager9.getID();
        java.lang.String str13 = labManager9.getEmail();
        org.junit.Assert.assertNotNull(userList2);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "student" + "'", str13, "student");
    }

    @Test
    public void test1352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1352");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("data/test-users.csv");
        java.util.List<com.reservation_system.model.User> userList2 = userRepository1.getAllUsers();
        java.util.List<com.reservation_system.model.User> userList3 = userRepository1.getAllUsers();
        com.reservation_system.model.Faculty faculty9 = new com.reservation_system.model.Faculty(10, "data/test-users.csv", "hi!", "", false);
        java.lang.String str10 = faculty9.getUserType();
        userRepository1.addUser((com.reservation_system.model.User) faculty9);
        java.util.Optional<com.reservation_system.model.User> userOptional13 = userRepository1.findByEmail("Student");
        java.util.Optional<com.reservation_system.model.User> userOptional15 = userRepository1.findByEmail("hi!");
        java.lang.Class<?> wildcardClass16 = userRepository1.getClass();
        org.junit.Assert.assertNotNull(userList2);
        org.junit.Assert.assertNotNull(userList3);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Faculty" + "'", str10, "Faculty");
        org.junit.Assert.assertNotNull(userOptional13);
        org.junit.Assert.assertNotNull(userOptional15);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test1353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1353");
        com.reservation_system.model.Researcher researcher5 = new com.reservation_system.model.Researcher((int) (byte) 10, "", "data/test-users.csv", "test@example.com", true);
        java.lang.String str6 = researcher5.getUserType();
        boolean boolean7 = researcher5.isApproved();
        java.lang.String str8 = researcher5.getUserType();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Researcher" + "'", str6, "Researcher");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Researcher" + "'", str8, "Researcher");
    }

    @Test
    public void test1354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1354");
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
        boolean boolean38 = userRepository1.headLabCoordinatorExists();
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
        org.junit.Assert.assertNotNull(userList28);
        org.junit.Assert.assertNotNull(userList29);
        org.junit.Assert.assertNotNull(userOptional32);
        org.junit.Assert.assertNotNull(userList34);
        org.junit.Assert.assertNotNull(userList37);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + true + "'", boolean38 == true);
    }

    @Test
    public void test1355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1355");
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
        // The following exception was thrown during execution in test generation
        try {
            com.reservation_system.model.User user16 = authService13.login("WrongPassword1!", "Password1!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Incorrect password.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(userList2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(userList8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(userList11);
    }

    @Test
    public void test1356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1356");
        com.reservation_system.model.LabManager labManager5 = new com.reservation_system.model.LabManager((int) 'a', "test@example.com", "WrongPassword1!", "", false);
        java.lang.String str6 = labManager5.getUserType();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "labmanager" + "'", str6, "labmanager");
    }

    @Test
    public void test1357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1357");
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
            com.reservation_system.model.User user98 = authService95.login("", "researcher");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Email is required.");
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
    public void test1358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1358");
        com.reservation_system.model.LabManager labManager5 = new com.reservation_system.model.LabManager(35, "Student", "Guest", "", false);
        java.lang.String str6 = labManager5.getUserType();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "labmanager" + "'", str6, "labmanager");
    }

    @Test
    public void test1359() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1359");
        com.reservation_system.model.Student student5 = new com.reservation_system.model.Student(32, "Andrew", "guest", "Password1!", false);
        java.lang.String str6 = student5.getName();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Andrew" + "'", str6, "Andrew");
    }

    @Test
    public void test1360() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1360");
        com.reservation_system.model.Researcher researcher5 = new com.reservation_system.model.Researcher((int) ' ', "researcher", "labmanager", "researcher", false);
    }

    @Test
    public void test1361() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1361");
        com.reservation_system.model.Faculty faculty5 = new com.reservation_system.model.Faculty(0, "Researcher", "WrongPassword1!", "test@example.com", true);
        int int6 = faculty5.getID();
        java.lang.String str7 = faculty5.getName();
        java.lang.String str8 = faculty5.getUserType();
        java.lang.String str9 = faculty5.getUserType();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Researcher" + "'", str7, "Researcher");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Faculty" + "'", str8, "Faculty");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Faculty" + "'", str9, "Faculty");
    }

    @Test
    public void test1362() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1362");
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
        java.util.Optional<com.reservation_system.model.User> userOptional19 = userRepository1.findByEmail("headlabcoordinator");
        boolean boolean21 = userRepository1.emailExists("Faculty");
        com.reservation_system.model.Guest guest27 = new com.reservation_system.model.Guest((int) (byte) 100, "Password1!", "Guest", "Guest", true);
        java.lang.String str28 = guest27.getUserType();
        int int29 = guest27.getID();
        java.lang.String str30 = guest27.getEmail();
        java.lang.String str31 = guest27.getUserType();
        boolean boolean32 = guest27.requiresDepartmentApproval();
        userRepository1.addUser((com.reservation_system.model.User) guest27);
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
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "Guest" + "'", str28, "Guest");
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 100 + "'", int29 == 100);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "Guest" + "'", str30, "Guest");
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "Guest" + "'", str31, "Guest");
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
    }

    @Test
    public void test1363() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1363");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("data/test-users.csv");
        java.util.List<com.reservation_system.model.User> userList2 = userRepository1.getAllUsers();
        com.reservation_system.services.AuthService authService3 = new com.reservation_system.services.AuthService(userRepository1);
        java.util.Optional<com.reservation_system.model.User> userOptional5 = userRepository1.findByEmail("");
        java.util.List<com.reservation_system.model.User> userList6 = userRepository1.getAllUsers();
        boolean boolean8 = userRepository1.emailExists("Andrew");
        boolean boolean10 = userRepository1.emailExists("headlabcoordinator");
        boolean boolean12 = userRepository1.emailExists("data/test-users.csv");
        java.lang.Class<?> wildcardClass13 = userRepository1.getClass();
        org.junit.Assert.assertNotNull(userList2);
        org.junit.Assert.assertNotNull(userOptional5);
        org.junit.Assert.assertNotNull(userList6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test1364() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1364");
        com.reservation_system.model.LabManager labManager5 = new com.reservation_system.model.LabManager(52, "Guest", "Faculty", "Researcher", false);
    }

    @Test
    public void test1365() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1365");
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
        boolean boolean23 = userRepository1.headLabCoordinatorExists();
        com.reservation_system.services.AuthService authService24 = new com.reservation_system.services.AuthService(userRepository1);
        com.reservation_system.repository.UserRepository userRepository26 = new com.reservation_system.repository.UserRepository("data/test-users.csv");
        java.util.List<com.reservation_system.model.User> userList27 = userRepository26.getAllUsers();
        com.reservation_system.services.AuthService authService28 = new com.reservation_system.services.AuthService(userRepository26);
        com.reservation_system.model.LabManager labManager34 = new com.reservation_system.model.LabManager((int) (short) 0, "", "student", "Andrew", true);
        boolean boolean35 = labManager34.isApproved();
        userRepository26.addUser((com.reservation_system.model.User) labManager34);
        com.reservation_system.repository.UserRepository userRepository38 = new com.reservation_system.repository.UserRepository("data/test-users.csv");
        java.util.List<com.reservation_system.model.User> userList39 = userRepository38.getAllUsers();
        java.util.List<com.reservation_system.model.User> userList40 = userRepository38.getAllUsers();
        userRepository26.saveAllUsers(userList40);
        boolean boolean43 = userRepository26.emailExists("labmanager");
        com.reservation_system.model.Researcher researcher49 = new com.reservation_system.model.Researcher((int) (short) -1, "headlabcoordinator", "student", "", false);
        java.lang.String str50 = researcher49.getUserType();
        boolean boolean51 = researcher49.isApproved();
        java.lang.String str52 = researcher49.getEmail();
        userRepository26.addUser((com.reservation_system.model.User) researcher49);
        java.util.Optional<com.reservation_system.model.User> userOptional55 = userRepository26.findByEmail("test@example.com");
        java.util.Optional<com.reservation_system.model.User> userOptional57 = userRepository26.findByEmail("WrongPassword1!");
        boolean boolean59 = userRepository26.emailExists("Student");
        com.reservation_system.model.Guest guest65 = new com.reservation_system.model.Guest(0, "labmanager", "researcher", "data/test-users.csv", true);
        int int66 = guest65.getID();
        userRepository26.addUser((com.reservation_system.model.User) guest65);
        com.reservation_system.repository.UserRepository userRepository69 = new com.reservation_system.repository.UserRepository("data/test-users.csv");
        java.util.List<com.reservation_system.model.User> userList70 = userRepository69.getAllUsers();
        java.util.List<com.reservation_system.model.User> userList71 = userRepository69.getAllUsers();
        userRepository26.saveAllUsers(userList71);
        userRepository1.saveAllUsers(userList71);
        java.util.Optional<com.reservation_system.model.User> userOptional75 = userRepository1.findByEmail("hi!");
        org.junit.Assert.assertNotNull(userList2);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(userOptional22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(userList27);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
        org.junit.Assert.assertNotNull(userList39);
        org.junit.Assert.assertNotNull(userList40);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertEquals("'" + str50 + "' != '" + "Researcher" + "'", str50, "Researcher");
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertEquals("'" + str52 + "' != '" + "student" + "'", str52, "student");
        org.junit.Assert.assertNotNull(userOptional55);
        org.junit.Assert.assertNotNull(userOptional57);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + true + "'", boolean59 == true);
        org.junit.Assert.assertTrue("'" + int66 + "' != '" + 0 + "'", int66 == 0);
        org.junit.Assert.assertNotNull(userList70);
        org.junit.Assert.assertNotNull(userList71);
        org.junit.Assert.assertNotNull(userOptional75);
    }

    @Test
    public void test1366() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1366");
        com.reservation_system.model.Faculty faculty5 = new com.reservation_system.model.Faculty((int) (short) -1, "researcher", "hi!", "data/test-users.csv", true);
    }

    @Test
    public void test1367() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1367");
        com.reservation_system.model.Guest guest5 = new com.reservation_system.model.Guest(1, "Guest", "Password1!", "Password1!", true);
        java.lang.String str6 = guest5.getUserType();
        boolean boolean7 = guest5.requiresDepartmentApproval();
        java.lang.String str8 = guest5.getPassword();
        java.lang.String str9 = guest5.getPassword();
        java.lang.String str10 = guest5.getUserType();
        java.lang.String str11 = guest5.getUserType();
        boolean boolean12 = guest5.isApproved();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Guest" + "'", str6, "Guest");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Password1!" + "'", str8, "Password1!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Password1!" + "'", str9, "Password1!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Guest" + "'", str10, "Guest");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Guest" + "'", str11, "Guest");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test1368() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1368");
        com.reservation_system.model.Student student5 = new com.reservation_system.model.Student(1, "Guest", "Andrew", "WrongPassword1!", false);
        java.lang.String str6 = student5.getPassword();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "WrongPassword1!" + "'", str6, "WrongPassword1!");
    }

    @Test
    public void test1369() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1369");
        com.reservation_system.model.LabManager labManager5 = new com.reservation_system.model.LabManager((int) (byte) 100, "Faculty", "Password1!", "Student", true);
        int int6 = labManager5.getID();
        boolean boolean7 = labManager5.requiresDepartmentApproval();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test1370() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1370");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("data/test-users.csv");
        java.util.List<com.reservation_system.model.User> userList2 = userRepository1.getAllUsers();
        com.reservation_system.services.AuthService authService3 = new com.reservation_system.services.AuthService(userRepository1);
        com.reservation_system.services.AuthService authService4 = new com.reservation_system.services.AuthService(userRepository1);
        boolean boolean5 = userRepository1.headLabCoordinatorExists();
        java.util.List<com.reservation_system.model.User> userList6 = userRepository1.getAllUsers();
        com.reservation_system.services.AuthService authService7 = new com.reservation_system.services.AuthService(userRepository1);
        // The following exception was thrown during execution in test generation
        try {
            com.reservation_system.model.User user10 = authService7.login("hi!", "Andrew");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Incorrect password.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(userList2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(userList6);
    }

    @Test
    public void test1371() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1371");
        com.reservation_system.model.LabManager labManager5 = new com.reservation_system.model.LabManager(10, "faculty", "", "Student", true);
    }

    @Test
    public void test1372() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1372");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("data/test-users.csv");
        java.util.List<com.reservation_system.model.User> userList2 = userRepository1.getAllUsers();
        com.reservation_system.services.AuthService authService3 = new com.reservation_system.services.AuthService(userRepository1);
        java.util.Optional<com.reservation_system.model.User> userOptional5 = userRepository1.findByEmail("");
        java.util.List<com.reservation_system.model.User> userList6 = userRepository1.getAllUsers();
        boolean boolean8 = userRepository1.emailExists("labmanager");
        java.util.Optional<com.reservation_system.model.User> userOptional10 = userRepository1.findByEmail("faculty");
        com.reservation_system.services.AuthService authService11 = new com.reservation_system.services.AuthService(userRepository1);
        com.reservation_system.model.User user14 = authService11.login("Guest", "Guest");
        org.junit.Assert.assertNotNull(userList2);
        org.junit.Assert.assertNotNull(userOptional5);
        org.junit.Assert.assertNotNull(userList6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(userOptional10);
        org.junit.Assert.assertNotNull(user14);
    }

    @Test
    public void test1373() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1373");
        com.reservation_system.model.Student student5 = new com.reservation_system.model.Student((int) (byte) 100, "faculty", "WrongPassword1!", "", false);
        boolean boolean6 = student5.requiresDepartmentApproval();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test1374() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1374");
        com.reservation_system.model.HeadLabCoordinator headLabCoordinator5 = new com.reservation_system.model.HeadLabCoordinator((int) 'a', "Faculty", "guest", "guest", true);
        int int6 = headLabCoordinator5.getID();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 97 + "'", int6 == 97);
    }

    @Test
    public void test1375() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1375");
        com.reservation_system.model.HeadLabCoordinator headLabCoordinator5 = new com.reservation_system.model.HeadLabCoordinator((int) '4', "faculty", "student", "WrongPassword1!", true);
        java.lang.String str6 = headLabCoordinator5.getUserType();
        int int7 = headLabCoordinator5.getID();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "headlabcoordinator" + "'", str6, "headlabcoordinator");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 52 + "'", int7 == 52);
    }

    @Test
    public void test1376() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1376");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("data/test-users.csv");
        java.util.List<com.reservation_system.model.User> userList2 = userRepository1.getAllUsers();
        com.reservation_system.services.AuthService authService3 = new com.reservation_system.services.AuthService(userRepository1);
        int int4 = userRepository1.getNextID();
        boolean boolean5 = userRepository1.headLabCoordinatorExists();
        boolean boolean7 = userRepository1.emailExists("data/test-users.csv");
        boolean boolean9 = userRepository1.emailExists("Password1!");
        org.junit.Assert.assertNotNull(userList2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 101 + "'", int4 == 101);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
// flaky "25) test1376(com.reservation_system.Randoop.AuthService.RegressionTest2)":         org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test1377() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1377");
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
            com.reservation_system.model.User user37 = authService34.login("labmanager", "");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Password is required.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
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
    }

    @Test
    public void test1378() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1378");
        com.reservation_system.model.HeadLabCoordinator headLabCoordinator5 = new com.reservation_system.model.HeadLabCoordinator((int) (byte) 0, "test@example.com", "", "test@example.com", true);
        java.lang.String str6 = headLabCoordinator5.getUserType();
        java.lang.String str7 = headLabCoordinator5.getUserType();
        java.lang.String str8 = headLabCoordinator5.getUserType();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "headlabcoordinator" + "'", str6, "headlabcoordinator");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "headlabcoordinator" + "'", str7, "headlabcoordinator");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "headlabcoordinator" + "'", str8, "headlabcoordinator");
    }

    @Test
    public void test1379() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1379");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("data/test-users.csv");
        java.util.List<com.reservation_system.model.User> userList2 = userRepository1.getAllUsers();
        java.util.List<com.reservation_system.model.User> userList3 = userRepository1.getAllUsers();
        com.reservation_system.model.Faculty faculty9 = new com.reservation_system.model.Faculty(10, "data/test-users.csv", "hi!", "", false);
        java.lang.String str10 = faculty9.getUserType();
        userRepository1.addUser((com.reservation_system.model.User) faculty9);
        java.lang.String str12 = faculty9.getUserType();
        java.lang.String str13 = faculty9.getUserType();
        org.junit.Assert.assertNotNull(userList2);
        org.junit.Assert.assertNotNull(userList3);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Faculty" + "'", str10, "Faculty");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Faculty" + "'", str12, "Faculty");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Faculty" + "'", str13, "Faculty");
    }

    @Test
    public void test1380() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1380");
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
        // The following exception was thrown during execution in test generation
        try {
            com.reservation_system.model.User user16 = authService13.login("labmanager", "faculty");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: No user found with that email.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(userList2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 101 + "'", int4 == 101);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(userList8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(userList11);
    }

    @Test
    public void test1381() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1381");
        com.reservation_system.model.Guest guest5 = new com.reservation_system.model.Guest((int) (short) 0, "test@example.com", "researcher", "Student", true);
        guest5.setApproved(true);
        java.lang.String str8 = guest5.getName();
    }

    @Test
    public void test1382() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1382");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("data/test-users.csv");
        java.util.List<com.reservation_system.model.User> userList2 = userRepository1.getAllUsers();
        java.util.List<com.reservation_system.model.User> userList3 = userRepository1.getAllUsers();
        com.reservation_system.services.AuthService authService4 = new com.reservation_system.services.AuthService(userRepository1);
        java.util.Optional<com.reservation_system.model.User> userOptional6 = userRepository1.findByEmail("faculty");
        com.reservation_system.services.AuthService authService7 = new com.reservation_system.services.AuthService(userRepository1);
        boolean boolean9 = userRepository1.emailExists("researcher");
        java.util.Optional<com.reservation_system.model.User> userOptional11 = userRepository1.findByEmail("student");
        boolean boolean12 = userRepository1.headLabCoordinatorExists();
        org.junit.Assert.assertNotNull(userList2);
        org.junit.Assert.assertNotNull(userList3);
        org.junit.Assert.assertNotNull(userOptional6);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(userOptional11);
// flaky "26) test1382(com.reservation_system.Randoop.AuthService.RegressionTest2)":         org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test1383() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1383");
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
        java.lang.String str35 = labManager32.getName();
        org.junit.Assert.assertNotNull(userList2);
        org.junit.Assert.assertNotNull(userOptional5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 101 + "'", int6 == 101);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "student" + "'", str15, "student");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Researcher" + "'", str16, "Researcher");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "student" + "'", str17, "student");
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 10 + "'", int25 == 10);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "Password1!" + "'", str33, "Password1!");
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "Faculty" + "'", str35, "Faculty");
    }

    @Test
    public void test1384() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1384");
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
        com.reservation_system.model.LabManager labManager29 = new com.reservation_system.model.LabManager((int) 'a', "Faculty", "", "", false);
        java.lang.String str30 = labManager29.getUserType();
        java.lang.String str31 = labManager29.getEmail();
        java.lang.String str32 = labManager29.getPassword();
        java.lang.String str33 = labManager29.getName();
        java.lang.String str34 = labManager29.getUserType();
        userRepository1.addUser((com.reservation_system.model.User) labManager29);
        org.junit.Assert.assertNotNull(userList2);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 101 + "'", int22 == 101);
// flaky "27) test1384(com.reservation_system.Randoop.AuthService.RegressionTest2)":         org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "labmanager" + "'", str30, "labmanager");
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "" + "'", str31, "");
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "" + "'", str32, "");
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "Faculty" + "'", str33, "Faculty");
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "labmanager" + "'", str34, "labmanager");
    }

    @Test
    public void test1385() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1385");
        com.reservation_system.model.Researcher researcher5 = new com.reservation_system.model.Researcher((int) (short) -1, "headlabcoordinator", "student", "", false);
        java.lang.String str6 = researcher5.getUserType();
        boolean boolean7 = researcher5.isApproved();
        java.lang.String str8 = researcher5.getName();
        java.lang.String str9 = researcher5.getUserType();
        java.lang.String str10 = researcher5.getUserType();
        java.lang.String str11 = researcher5.getUserType();
        java.lang.String str12 = researcher5.getName();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Researcher" + "'", str6, "Researcher");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "headlabcoordinator" + "'", str8, "headlabcoordinator");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Researcher" + "'", str9, "Researcher");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Researcher" + "'", str10, "Researcher");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Researcher" + "'", str11, "Researcher");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "headlabcoordinator" + "'", str12, "headlabcoordinator");
    }

    @Test
    public void test1386() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1386");
        com.reservation_system.model.Guest guest5 = new com.reservation_system.model.Guest(98, "faculty", "student", "Andrew", false);
        java.lang.String str6 = guest5.getPassword();
        java.lang.String str7 = guest5.getUserType();
        java.lang.String str8 = guest5.getUserType();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Andrew" + "'", str6, "Andrew");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Guest" + "'", str7, "Guest");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Guest" + "'", str8, "Guest");
    }

    @Test
    public void test1387() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1387");
        com.reservation_system.model.LabManager labManager5 = new com.reservation_system.model.LabManager((int) '4', "hi!", "labmanager", "Student", false);
        int int6 = labManager5.getID();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 52 + "'", int6 == 52);
    }

    @Test
    public void test1388() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1388");
        com.reservation_system.model.LabManager labManager5 = new com.reservation_system.model.LabManager((int) '#', "guest", "guest", "guest", false);
        boolean boolean6 = labManager5.requiresDepartmentApproval();
        java.lang.String str7 = labManager5.getUserType();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "labmanager" + "'", str7, "labmanager");
    }

    @Test
    public void test1389() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1389");
        com.reservation_system.model.Guest guest5 = new com.reservation_system.model.Guest(100, "headlabcoordinator", "Andrew", "Researcher", true);
    }

    @Test
    public void test1390() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1390");
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
        com.reservation_system.model.Researcher researcher22 = new com.reservation_system.model.Researcher((int) (byte) 10, "headlabcoordinator", "Guest", "", true);
        userRepository1.addUser((com.reservation_system.model.User) researcher22);
        com.reservation_system.model.LabManager labManager29 = new com.reservation_system.model.LabManager((int) (byte) 100, "Faculty", "Password1!", "Student", true);
        boolean boolean30 = labManager29.isApproved();
        userRepository1.addUser((com.reservation_system.model.User) labManager29);
        org.junit.Assert.assertNotNull(userList2);
// flaky "28) test1390(com.reservation_system.Randoop.AuthService.RegressionTest2)":         org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(userList6);
        org.junit.Assert.assertNotNull(userList7);
        org.junit.Assert.assertNotNull(userList11);
// flaky "14) test1390(com.reservation_system.Randoop.AuthService.RegressionTest2)":         org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
// flaky "7) test1390(com.reservation_system.Randoop.AuthService.RegressionTest2)":         org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(userList14);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
    }

    @Test
    public void test1391() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1391");
        com.reservation_system.model.Guest guest5 = new com.reservation_system.model.Guest(36, "Faculty", "Student", "faculty", false);
        int int6 = guest5.getID();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 36 + "'", int6 == 36);
    }

    @Test
    public void test1392() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1392");
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
        // The following exception was thrown during execution in test generation
        try {
            com.reservation_system.model.User user16 = authService13.login("Andrew", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: No user found with that email.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(userList2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 101 + "'", int4 == 101);
// flaky "29) test1392(com.reservation_system.Randoop.AuthService.RegressionTest2)":         org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(userList8);
// flaky "15) test1392(com.reservation_system.Randoop.AuthService.RegressionTest2)":         org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
// flaky "8) test1392(com.reservation_system.Randoop.AuthService.RegressionTest2)":         org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(userList11);
    }

    @Test
    public void test1393() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1393");
        com.reservation_system.model.Researcher researcher5 = new com.reservation_system.model.Researcher(35, "data/test-users.csv", "", "labmanager", true);
    }

    @Test
    public void test1394() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1394");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("data/test-users.csv");
        java.util.List<com.reservation_system.model.User> userList2 = userRepository1.getAllUsers();
        java.util.List<com.reservation_system.model.User> userList3 = userRepository1.getAllUsers();
        com.reservation_system.services.AuthService authService4 = new com.reservation_system.services.AuthService(userRepository1);
        java.util.Optional<com.reservation_system.model.User> userOptional6 = userRepository1.findByEmail("faculty");
        com.reservation_system.repository.UserRepository userRepository8 = new com.reservation_system.repository.UserRepository("data/test-users.csv");
        java.util.List<com.reservation_system.model.User> userList9 = userRepository8.getAllUsers();
        java.util.List<com.reservation_system.model.User> userList10 = userRepository8.getAllUsers();
        com.reservation_system.repository.UserRepository userRepository12 = new com.reservation_system.repository.UserRepository("data/test-users.csv");
        java.util.List<com.reservation_system.model.User> userList13 = userRepository12.getAllUsers();
        boolean boolean14 = userRepository12.headLabCoordinatorExists();
        com.reservation_system.repository.UserRepository userRepository16 = new com.reservation_system.repository.UserRepository("data/test-users.csv");
        java.util.List<com.reservation_system.model.User> userList17 = userRepository16.getAllUsers();
        java.util.List<com.reservation_system.model.User> userList18 = userRepository16.getAllUsers();
        userRepository12.saveAllUsers(userList18);
        userRepository8.saveAllUsers(userList18);
        com.reservation_system.model.Faculty faculty26 = new com.reservation_system.model.Faculty(98, "guest", "Researcher", "student", true);
        userRepository8.addUser((com.reservation_system.model.User) faculty26);
        com.reservation_system.repository.UserRepository userRepository29 = new com.reservation_system.repository.UserRepository("data/test-users.csv");
        java.util.List<com.reservation_system.model.User> userList30 = userRepository29.getAllUsers();
        java.util.List<com.reservation_system.model.User> userList31 = userRepository29.getAllUsers();
        com.reservation_system.repository.UserRepository userRepository33 = new com.reservation_system.repository.UserRepository("data/test-users.csv");
        java.util.List<com.reservation_system.model.User> userList34 = userRepository33.getAllUsers();
        boolean boolean35 = userRepository33.headLabCoordinatorExists();
        com.reservation_system.repository.UserRepository userRepository37 = new com.reservation_system.repository.UserRepository("data/test-users.csv");
        java.util.List<com.reservation_system.model.User> userList38 = userRepository37.getAllUsers();
        java.util.List<com.reservation_system.model.User> userList39 = userRepository37.getAllUsers();
        userRepository33.saveAllUsers(userList39);
        userRepository29.saveAllUsers(userList39);
        java.util.List<com.reservation_system.model.User> userList42 = userRepository29.getAllUsers();
        userRepository8.saveAllUsers(userList42);
        userRepository1.saveAllUsers(userList42);
        org.junit.Assert.assertNotNull(userList2);
        org.junit.Assert.assertNotNull(userList3);
        org.junit.Assert.assertNotNull(userOptional6);
        org.junit.Assert.assertNotNull(userList9);
        org.junit.Assert.assertNotNull(userList10);
        org.junit.Assert.assertNotNull(userList13);
// flaky "30) test1394(com.reservation_system.Randoop.AuthService.RegressionTest2)":         org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(userList17);
        org.junit.Assert.assertNotNull(userList18);
        org.junit.Assert.assertNotNull(userList30);
        org.junit.Assert.assertNotNull(userList31);
        org.junit.Assert.assertNotNull(userList34);
// flaky "16) test1394(com.reservation_system.Randoop.AuthService.RegressionTest2)":         org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
        org.junit.Assert.assertNotNull(userList38);
        org.junit.Assert.assertNotNull(userList39);
        org.junit.Assert.assertNotNull(userList42);
    }

    @Test
    public void test1395() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1395");
        com.reservation_system.model.Faculty faculty5 = new com.reservation_system.model.Faculty((int) '#', "test@example.com", "Password1!", "data/test-users.csv", false);
        boolean boolean6 = faculty5.requiresDepartmentApproval();
        int int7 = faculty5.getID();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 35 + "'", int7 == 35);
    }

    @Test
    public void test1396() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1396");
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
        boolean boolean23 = userRepository1.headLabCoordinatorExists();
        com.reservation_system.services.AuthService authService24 = new com.reservation_system.services.AuthService(userRepository1);
        com.reservation_system.repository.UserRepository userRepository26 = new com.reservation_system.repository.UserRepository("data/test-users.csv");
        java.util.List<com.reservation_system.model.User> userList27 = userRepository26.getAllUsers();
        com.reservation_system.services.AuthService authService28 = new com.reservation_system.services.AuthService(userRepository26);
        com.reservation_system.model.LabManager labManager34 = new com.reservation_system.model.LabManager((int) (short) 0, "", "student", "Andrew", true);
        boolean boolean35 = labManager34.isApproved();
        userRepository26.addUser((com.reservation_system.model.User) labManager34);
        com.reservation_system.repository.UserRepository userRepository38 = new com.reservation_system.repository.UserRepository("data/test-users.csv");
        java.util.List<com.reservation_system.model.User> userList39 = userRepository38.getAllUsers();
        java.util.List<com.reservation_system.model.User> userList40 = userRepository38.getAllUsers();
        userRepository26.saveAllUsers(userList40);
        boolean boolean43 = userRepository26.emailExists("labmanager");
        com.reservation_system.model.Researcher researcher49 = new com.reservation_system.model.Researcher((int) (short) -1, "headlabcoordinator", "student", "", false);
        java.lang.String str50 = researcher49.getUserType();
        boolean boolean51 = researcher49.isApproved();
        java.lang.String str52 = researcher49.getEmail();
        userRepository26.addUser((com.reservation_system.model.User) researcher49);
        java.util.Optional<com.reservation_system.model.User> userOptional55 = userRepository26.findByEmail("test@example.com");
        java.util.Optional<com.reservation_system.model.User> userOptional57 = userRepository26.findByEmail("WrongPassword1!");
        boolean boolean59 = userRepository26.emailExists("Student");
        com.reservation_system.model.Guest guest65 = new com.reservation_system.model.Guest(0, "labmanager", "researcher", "data/test-users.csv", true);
        int int66 = guest65.getID();
        userRepository26.addUser((com.reservation_system.model.User) guest65);
        com.reservation_system.repository.UserRepository userRepository69 = new com.reservation_system.repository.UserRepository("data/test-users.csv");
        java.util.List<com.reservation_system.model.User> userList70 = userRepository69.getAllUsers();
        java.util.List<com.reservation_system.model.User> userList71 = userRepository69.getAllUsers();
        userRepository26.saveAllUsers(userList71);
        userRepository1.saveAllUsers(userList71);
        boolean boolean75 = userRepository1.emailExists("researcher");
        org.junit.Assert.assertNotNull(userList2);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertNotNull(userOptional22);
// flaky "31) test1396(com.reservation_system.Randoop.AuthService.RegressionTest2)":         org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertNotNull(userList27);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
        org.junit.Assert.assertNotNull(userList39);
        org.junit.Assert.assertNotNull(userList40);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertEquals("'" + str50 + "' != '" + "Researcher" + "'", str50, "Researcher");
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertEquals("'" + str52 + "' != '" + "student" + "'", str52, "student");
        org.junit.Assert.assertNotNull(userOptional55);
        org.junit.Assert.assertNotNull(userOptional57);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + true + "'", boolean59 == true);
        org.junit.Assert.assertTrue("'" + int66 + "' != '" + 0 + "'", int66 == 0);
        org.junit.Assert.assertNotNull(userList70);
        org.junit.Assert.assertNotNull(userList71);
        org.junit.Assert.assertTrue("'" + boolean75 + "' != '" + true + "'", boolean75 == true);
    }

    @Test
    public void test1397() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1397");
        com.reservation_system.model.Faculty faculty5 = new com.reservation_system.model.Faculty(52, "data/test-users.csv", "researcher", "Student", true);
        java.lang.String str6 = faculty5.getUserType();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Faculty" + "'", str6, "Faculty");
    }

    @Test
    public void test1398() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1398");
        com.reservation_system.model.Faculty faculty5 = new com.reservation_system.model.Faculty((int) (byte) 1, "researcher", "faculty", "hi!", false);
        java.lang.String str6 = faculty5.getUserType();
        java.lang.String str7 = faculty5.getUserType();
        java.lang.String str8 = faculty5.getPassword();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Faculty" + "'", str6, "Faculty");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Faculty" + "'", str7, "Faculty");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
    }

    @Test
    public void test1399() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1399");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("data/test-users.csv");
        java.util.List<com.reservation_system.model.User> userList2 = userRepository1.getAllUsers();
        boolean boolean3 = userRepository1.headLabCoordinatorExists();
        boolean boolean4 = userRepository1.headLabCoordinatorExists();
        java.util.List<com.reservation_system.model.User> userList5 = userRepository1.getAllUsers();
        java.util.Optional<com.reservation_system.model.User> userOptional7 = userRepository1.findByEmail("WrongPassword1!");
        boolean boolean8 = userRepository1.headLabCoordinatorExists();
        com.reservation_system.model.HeadLabCoordinator headLabCoordinator14 = new com.reservation_system.model.HeadLabCoordinator(99, "Andrew", "guest", "Researcher", false);
        userRepository1.addUser((com.reservation_system.model.User) headLabCoordinator14);
        int int16 = userRepository1.getNextID();
        java.util.Optional<com.reservation_system.model.User> userOptional18 = userRepository1.findByEmail("");
        com.reservation_system.model.HeadLabCoordinator headLabCoordinator24 = new com.reservation_system.model.HeadLabCoordinator((int) (byte) 100, "", "", "data/test-users.csv", true);
        userRepository1.addUser((com.reservation_system.model.User) headLabCoordinator24);
        org.junit.Assert.assertNotNull(userList2);
// flaky "32) test1399(com.reservation_system.Randoop.AuthService.RegressionTest2)":         org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
// flaky "17) test1399(com.reservation_system.Randoop.AuthService.RegressionTest2)":         org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(userList5);
        org.junit.Assert.assertNotNull(userOptional7);
// flaky "9) test1399(com.reservation_system.Randoop.AuthService.RegressionTest2)":         org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 101 + "'", int16 == 101);
        org.junit.Assert.assertNotNull(userOptional18);
    }

    @Test
    public void test1400() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1400");
        com.reservation_system.model.Researcher researcher5 = new com.reservation_system.model.Researcher(10, "faculty", "Student", "Researcher", false);
        java.lang.String str6 = researcher5.getName();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "faculty" + "'", str6, "faculty");
    }

    @Test
    public void test1401() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1401");
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
        int int95 = userRepository1.getNextID();
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
        org.junit.Assert.assertEquals("'" + str92 + "' != '" + "Faculty" + "'", str92, "Faculty");
        org.junit.Assert.assertTrue("'" + int95 + "' != '" + 98 + "'", int95 == 98);
    }

    @Test
    public void test1402() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1402");
        com.reservation_system.model.Faculty faculty5 = new com.reservation_system.model.Faculty((int) 'a', "WrongPassword1!", "test@example.com", "test@example.com", false);
        java.lang.String str6 = faculty5.getEmail();
        java.lang.String str7 = faculty5.getUserType();
        java.lang.String str8 = faculty5.getName();
        boolean boolean9 = faculty5.requiresDepartmentApproval();
        java.lang.String str10 = faculty5.getUserType();
        java.lang.String str11 = faculty5.getUserType();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Faculty" + "'", str7, "Faculty");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "WrongPassword1!" + "'", str8, "WrongPassword1!");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Faculty" + "'", str10, "Faculty");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Faculty" + "'", str11, "Faculty");
    }

    @Test
    public void test1403() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1403");
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
        boolean boolean20 = userRepository1.emailExists("headlabcoordinator");
        boolean boolean22 = userRepository1.emailExists("hi!");
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
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
    }

    @Test
    public void test1404() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1404");
        com.reservation_system.model.Guest guest5 = new com.reservation_system.model.Guest(52, "test@example.com", "test@example.com", "", true);
        boolean boolean6 = guest5.isApproved();
        java.lang.String str7 = guest5.getName();
        int int8 = guest5.getID();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 52 + "'", int8 == 52);
    }

    @Test
    public void test1405() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1405");
        com.reservation_system.model.Guest guest5 = new com.reservation_system.model.Guest(0, "WrongPassword1!", "researcher", "guest", false);
    }

    @Test
    public void test1406() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1406");
        com.reservation_system.model.Researcher researcher5 = new com.reservation_system.model.Researcher((int) (byte) 10, "headlabcoordinator", "Guest", "", true);
        java.lang.String str6 = researcher5.getPassword();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
    }

    @Test
    public void test1407() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1407");
        com.reservation_system.model.Student student5 = new com.reservation_system.model.Student(1, "guest", "Faculty", "labmanager", true);
        java.lang.String str6 = student5.getEmail();
        java.lang.String str7 = student5.getUserType();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Faculty" + "'", str6, "Faculty");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Student" + "'", str7, "Student");
    }

    @Test
    public void test1408() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1408");
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
        java.lang.String str24 = guest20.getUserType();
        org.junit.Assert.assertNotNull(userList2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 98 + "'", int4 == 98);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(userList8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(userList11);
        org.junit.Assert.assertNotNull(userOptional14);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "Guest" + "'", str21, "Guest");
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "Guest" + "'", str24, "Guest");
    }

    @Test
    public void test1409() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1409");
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
        boolean boolean97 = userRepository1.emailExists("data/test-users.csv");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 98 + "'", int2 == 98);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(userList9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
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
        org.junit.Assert.assertTrue("'" + boolean97 + "' != '" + false + "'", boolean97 == false);
    }

    @Test
    public void test1410() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1410");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("data/test-users.csv");
        java.util.List<com.reservation_system.model.User> userList2 = userRepository1.getAllUsers();
        boolean boolean3 = userRepository1.headLabCoordinatorExists();
        boolean boolean4 = userRepository1.headLabCoordinatorExists();
        com.reservation_system.model.HeadLabCoordinator headLabCoordinator10 = new com.reservation_system.model.HeadLabCoordinator(1, "faculty", "Faculty", "", true);
        userRepository1.addUser((com.reservation_system.model.User) headLabCoordinator10);
        java.lang.String str12 = headLabCoordinator10.getUserType();
        java.lang.String str13 = headLabCoordinator10.getUserType();
        org.junit.Assert.assertNotNull(userList2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "headlabcoordinator" + "'", str12, "headlabcoordinator");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "headlabcoordinator" + "'", str13, "headlabcoordinator");
    }

    @Test
    public void test1411() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1411");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("data/test-users.csv");
        java.util.List<com.reservation_system.model.User> userList2 = userRepository1.getAllUsers();
        com.reservation_system.services.AuthService authService3 = new com.reservation_system.services.AuthService(userRepository1);
        com.reservation_system.model.LabManager labManager9 = new com.reservation_system.model.LabManager((int) (short) 0, "", "student", "Andrew", true);
        boolean boolean10 = labManager9.isApproved();
        userRepository1.addUser((com.reservation_system.model.User) labManager9);
        com.reservation_system.model.Faculty faculty17 = new com.reservation_system.model.Faculty((int) '#', "researcher", "", "student", true);
        userRepository1.addUser((com.reservation_system.model.User) faculty17);
        boolean boolean19 = userRepository1.headLabCoordinatorExists();
        boolean boolean21 = userRepository1.emailExists("Guest");
        com.reservation_system.services.AuthService authService22 = new com.reservation_system.services.AuthService(userRepository1);
        // The following exception was thrown during execution in test generation
        try {
            com.reservation_system.model.User user25 = authService22.login("test@example.com", "researcher");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Incorrect password.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(userList2);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    }

    @Test
    public void test1412() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1412");
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
        com.reservation_system.services.AuthService authService16 = new com.reservation_system.services.AuthService(userRepository1);
        java.util.List<com.reservation_system.model.User> userList17 = userRepository1.getAllUsers();
        org.junit.Assert.assertNotNull(userList2);
        org.junit.Assert.assertNotNull(userList3);
        org.junit.Assert.assertNotNull(userList6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(userList10);
        org.junit.Assert.assertNotNull(userList11);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(userList15);
        org.junit.Assert.assertNotNull(userList17);
    }

    @Test
    public void test1413() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1413");
        com.reservation_system.model.User user6 = com.reservation_system.patterns.factory.UserFactory.createUser("researcher", 98, "", "Password1!", "Faculty", false);
        org.junit.Assert.assertNotNull(user6);
    }

    @Test
    public void test1414() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1414");
        com.reservation_system.model.Researcher researcher5 = new com.reservation_system.model.Researcher((int) '#', "Researcher", "researcher", "headlabcoordinator", true);
        java.lang.String str6 = researcher5.getPassword();
        java.lang.String str7 = researcher5.getName();
        int int8 = researcher5.getID();
        java.lang.String str9 = researcher5.getUserType();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "headlabcoordinator" + "'", str6, "headlabcoordinator");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Researcher" + "'", str7, "Researcher");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 35 + "'", int8 == 35);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Researcher" + "'", str9, "Researcher");
    }

    @Test
    public void test1415() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1415");
        com.reservation_system.model.Researcher researcher5 = new com.reservation_system.model.Researcher((int) '4', "researcher", "", "faculty", false);
    }

    @Test
    public void test1416() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1416");
        com.reservation_system.model.LabManager labManager5 = new com.reservation_system.model.LabManager(0, "guest", "Researcher", "Faculty", false);
    }

    @Test
    public void test1417() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1417");
        com.reservation_system.model.Researcher researcher5 = new com.reservation_system.model.Researcher((int) (short) -1, "researcher", "test@example.com", "Faculty", true);
        boolean boolean6 = researcher5.requiresDepartmentApproval();
        java.lang.String str7 = researcher5.getName();
        java.lang.String str8 = researcher5.getEmail();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "researcher" + "'", str7, "researcher");
    }

    @Test
    public void test1418() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1418");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("data/test-users.csv");
        java.util.List<com.reservation_system.model.User> userList2 = userRepository1.getAllUsers();
        boolean boolean3 = userRepository1.headLabCoordinatorExists();
        boolean boolean4 = userRepository1.headLabCoordinatorExists();
        com.reservation_system.model.HeadLabCoordinator headLabCoordinator10 = new com.reservation_system.model.HeadLabCoordinator(1, "faculty", "Faculty", "", true);
        userRepository1.addUser((com.reservation_system.model.User) headLabCoordinator10);
        java.util.Optional<com.reservation_system.model.User> userOptional13 = userRepository1.findByEmail("Faculty");
        boolean boolean15 = userRepository1.emailExists("researcher");
        com.reservation_system.services.AuthService authService16 = new com.reservation_system.services.AuthService(userRepository1);
        org.junit.Assert.assertNotNull(userList2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(userOptional13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test1419() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1419");
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
        java.lang.String str30 = researcher27.getUserType();
        java.lang.String str31 = researcher27.getEmail();
        org.junit.Assert.assertNotNull(userList2);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 98 + "'", int19 == 98);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 98 + "'", int20 == 98);
        org.junit.Assert.assertNotNull(userList21);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "Researcher" + "'", str28, "Researcher");
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "Researcher" + "'", str30, "Researcher");
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "Andrew" + "'", str31, "Andrew");
    }

    @Test
    public void test1420() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1420");
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
        java.util.Optional<com.reservation_system.model.User> userOptional18 = userRepository1.findByEmail("guest");
        com.reservation_system.model.HeadLabCoordinator headLabCoordinator24 = new com.reservation_system.model.HeadLabCoordinator((-1), "test@example.com", "researcher", "faculty", false);
        java.lang.String str25 = headLabCoordinator24.getUserType();
        java.lang.String str26 = headLabCoordinator24.getUserType();
        userRepository1.addUser((com.reservation_system.model.User) headLabCoordinator24);
        org.junit.Assert.assertNotNull(userList2);
        org.junit.Assert.assertNotNull(userList3);
        org.junit.Assert.assertNotNull(userList6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(userList10);
        org.junit.Assert.assertNotNull(userList11);
        org.junit.Assert.assertNotNull(userList14);
        org.junit.Assert.assertNotNull(userList15);
        org.junit.Assert.assertNotNull(userOptional18);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "headlabcoordinator" + "'", str25, "headlabcoordinator");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "headlabcoordinator" + "'", str26, "headlabcoordinator");
    }

    @Test
    public void test1421() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1421");
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
        int int17 = labManager10.getID();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 98 + "'", int3 == 98);
        org.junit.Assert.assertNotNull(userList4);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "labmanager" + "'", str11, "labmanager");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "labmanager" + "'", str16, "labmanager");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 97 + "'", int17 == 97);
    }

    @Test
    public void test1422() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1422");
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
        boolean boolean23 = userRepository1.headLabCoordinatorExists();
        com.reservation_system.services.AuthService authService24 = new com.reservation_system.services.AuthService(userRepository1);
        boolean boolean26 = userRepository1.emailExists("Researcher");
        org.junit.Assert.assertNotNull(userList2);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(userOptional22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
    }

    @Test
    public void test1423() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1423");
        com.reservation_system.model.Researcher researcher5 = new com.reservation_system.model.Researcher(52, "data/test-users.csv", "Student", "test@example.com", false);
        java.lang.String str6 = researcher5.getEmail();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Student" + "'", str6, "Student");
    }

    @Test
    public void test1424() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1424");
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
        com.reservation_system.services.AuthService authService24 = new com.reservation_system.services.AuthService(userRepository1);
        // The following exception was thrown during execution in test generation
        try {
            com.reservation_system.model.User user27 = authService24.login("data/test-users.csv", "Faculty");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: No user found with that email.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(userList2);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(userList14);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
    }

    @Test
    public void test1425() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1425");
        com.reservation_system.model.Guest guest5 = new com.reservation_system.model.Guest(0, "test@example.com", "faculty", "faculty", true);
        java.lang.String str6 = guest5.getUserType();
        guest5.setApproved(false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Guest" + "'", str6, "Guest");
    }

    @Test
    public void test1426() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1426");
        com.reservation_system.model.Researcher researcher5 = new com.reservation_system.model.Researcher((int) (short) -1, "researcher", "test@example.com", "Faculty", true);
        java.lang.String str6 = researcher5.getUserType();
        researcher5.setApproved(false);
        java.lang.Class<?> wildcardClass9 = researcher5.getClass();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Researcher" + "'", str6, "Researcher");
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test1427() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1427");
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
        com.reservation_system.services.AuthService authService25 = new com.reservation_system.services.AuthService(userRepository1);
        org.junit.Assert.assertNotNull(userList2);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "Researcher" + "'", str19, "Researcher");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "Researcher" + "'", str20, "Researcher");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "Researcher" + "'", str21, "Researcher");
    }

    @Test
    public void test1428() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1428");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("data/test-users.csv");
        java.util.List<com.reservation_system.model.User> userList2 = userRepository1.getAllUsers();
        com.reservation_system.services.AuthService authService3 = new com.reservation_system.services.AuthService(userRepository1);
        java.util.Optional<com.reservation_system.model.User> userOptional5 = userRepository1.findByEmail("");
        int int6 = userRepository1.getNextID();
        com.reservation_system.services.AuthService authService7 = new com.reservation_system.services.AuthService(userRepository1);
        com.reservation_system.model.LabManager labManager13 = new com.reservation_system.model.LabManager((int) ' ', "test@example.com", "Password1!", "guest", true);
        userRepository1.addUser((com.reservation_system.model.User) labManager13);
        java.util.Optional<com.reservation_system.model.User> userOptional16 = userRepository1.findByEmail("test@example.com");
        org.junit.Assert.assertNotNull(userList2);
        org.junit.Assert.assertNotNull(userOptional5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 98 + "'", int6 == 98);
        org.junit.Assert.assertNotNull(userOptional16);
    }

    @Test
    public void test1429() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1429");
        com.reservation_system.model.Faculty faculty5 = new com.reservation_system.model.Faculty((int) ' ', "Faculty", "Guest", "data/test-users.csv", false);
    }

    @Test
    public void test1430() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1430");
        com.reservation_system.model.Researcher researcher5 = new com.reservation_system.model.Researcher(32, "Guest", "data/test-users.csv", "Researcher", false);
    }

    @Test
    public void test1431() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1431");
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
        com.reservation_system.model.Student student24 = new com.reservation_system.model.Student(10, "Password1!", "test@example.com", "researcher", false);
        userRepository1.addUser((com.reservation_system.model.User) student24);
        java.lang.String str26 = student24.getUserType();
        org.junit.Assert.assertNotNull(userList2);
        org.junit.Assert.assertNotNull(userOptional5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 98 + "'", int6 == 98);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "student" + "'", str15, "student");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Researcher" + "'", str16, "Researcher");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "student" + "'", str17, "student");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "Student" + "'", str26, "Student");
    }

    @Test
    public void test1432() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1432");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("data/test-users.csv");
        boolean boolean2 = userRepository1.headLabCoordinatorExists();
        int int3 = userRepository1.getNextID();
        int int4 = userRepository1.getNextID();
        com.reservation_system.services.AuthService authService5 = new com.reservation_system.services.AuthService(userRepository1);
        // The following exception was thrown during execution in test generation
        try {
            com.reservation_system.model.User user8 = authService5.login("hi!", "Password1!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Incorrect password.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 98 + "'", int3 == 98);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 98 + "'", int4 == 98);
    }

    @Test
    public void test1433() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1433");
        com.reservation_system.model.LabManager labManager5 = new com.reservation_system.model.LabManager((int) '4', "test@example.com", "", "faculty", true);
        java.lang.String str6 = labManager5.getUserType();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "labmanager" + "'", str6, "labmanager");
    }

    @Test
    public void test1434() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1434");
        com.reservation_system.model.LabManager labManager5 = new com.reservation_system.model.LabManager(52, "Guest", "Faculty", "researcher", false);
        java.lang.String str6 = labManager5.getUserType();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "labmanager" + "'", str6, "labmanager");
    }

    @Test
    public void test1435() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1435");
        com.reservation_system.model.Researcher researcher5 = new com.reservation_system.model.Researcher((int) (short) -1, "headlabcoordinator", "student", "", false);
        boolean boolean6 = researcher5.isApproved();
        java.lang.String str7 = researcher5.getEmail();
        java.lang.String str8 = researcher5.getPassword();
        boolean boolean9 = researcher5.requiresDepartmentApproval();
        researcher5.setApproved(false);
        java.lang.Class<?> wildcardClass12 = researcher5.getClass();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "student" + "'", str7, "student");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test1436() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1436");
        com.reservation_system.model.HeadLabCoordinator headLabCoordinator5 = new com.reservation_system.model.HeadLabCoordinator((int) (short) -1, "student", "labmanager", "faculty", false);
        java.lang.String str6 = headLabCoordinator5.getUserType();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "headlabcoordinator" + "'", str6, "headlabcoordinator");
    }

    @Test
    public void test1437() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1437");
        com.reservation_system.model.HeadLabCoordinator headLabCoordinator5 = new com.reservation_system.model.HeadLabCoordinator((int) (byte) 0, "student", "data/test-users.csv", "Faculty", true);
    }

    @Test
    public void test1438() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1438");
        com.reservation_system.model.Faculty faculty5 = new com.reservation_system.model.Faculty(0, "student", "guest", "Researcher", true);
    }

    @Test
    public void test1439() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1439");
        com.reservation_system.model.Researcher researcher5 = new com.reservation_system.model.Researcher((int) (short) -1, "researcher", "test@example.com", "Faculty", true);
        java.lang.String str6 = researcher5.getUserType();
        boolean boolean7 = researcher5.requiresDepartmentApproval();
        java.lang.String str8 = researcher5.getUserType();
        java.lang.String str9 = researcher5.getPassword();
        java.lang.String str10 = researcher5.getUserType();
        java.lang.String str11 = researcher5.getUserType();
        java.lang.String str12 = researcher5.getUserType();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Researcher" + "'", str6, "Researcher");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Researcher" + "'", str8, "Researcher");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Faculty" + "'", str9, "Faculty");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Researcher" + "'", str10, "Researcher");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Researcher" + "'", str11, "Researcher");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Researcher" + "'", str12, "Researcher");
    }

    @Test
    public void test1440() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1440");
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
        com.reservation_system.model.Researcher researcher22 = new com.reservation_system.model.Researcher((int) (byte) 10, "headlabcoordinator", "Guest", "", true);
        userRepository1.addUser((com.reservation_system.model.User) researcher22);
        java.lang.Class<?> wildcardClass24 = userRepository1.getClass();
        org.junit.Assert.assertNotNull(userList2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(userList6);
        org.junit.Assert.assertNotNull(userList7);
        org.junit.Assert.assertNotNull(userList11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(userList14);
        org.junit.Assert.assertNotNull(wildcardClass24);
    }

    @Test
    public void test1441() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1441");
        com.reservation_system.model.Guest guest5 = new com.reservation_system.model.Guest(0, "student", "researcher", "faculty", true);
    }

    @Test
    public void test1442() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1442");
        // The following exception was thrown during execution in test generation
        try {
            com.reservation_system.model.User user6 = com.reservation_system.patterns.factory.UserFactory.createUser("Andrew", (int) '4', "labmanager", "Guest", "faculty", true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid user type: Andrew");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1443() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1443");
        com.reservation_system.model.Faculty faculty5 = new com.reservation_system.model.Faculty((int) 'a', "WrongPassword1!", "test@example.com", "test@example.com", false);
        java.lang.String str6 = faculty5.getEmail();
        java.lang.String str7 = faculty5.getUserType();
        java.lang.String str8 = faculty5.getName();
        boolean boolean9 = faculty5.requiresDepartmentApproval();
        java.lang.String str10 = faculty5.getPassword();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Faculty" + "'", str7, "Faculty");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "WrongPassword1!" + "'", str8, "WrongPassword1!");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test1444() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1444");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("data/test-users.csv");
        java.util.List<com.reservation_system.model.User> userList2 = userRepository1.getAllUsers();
        java.util.List<com.reservation_system.model.User> userList3 = userRepository1.getAllUsers();
        com.reservation_system.services.AuthService authService4 = new com.reservation_system.services.AuthService(userRepository1);
        java.util.Optional<com.reservation_system.model.User> userOptional6 = userRepository1.findByEmail("faculty");
        com.reservation_system.services.AuthService authService7 = new com.reservation_system.services.AuthService(userRepository1);
        java.util.Optional<com.reservation_system.model.User> userOptional9 = userRepository1.findByEmail("student");
        java.util.Optional<com.reservation_system.model.User> userOptional11 = userRepository1.findByEmail("labmanager");
        org.junit.Assert.assertNotNull(userList2);
        org.junit.Assert.assertNotNull(userList3);
        org.junit.Assert.assertNotNull(userOptional6);
        org.junit.Assert.assertNotNull(userOptional9);
        org.junit.Assert.assertNotNull(userOptional11);
    }

    @Test
    public void test1445() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1445");
        com.reservation_system.model.HeadLabCoordinator headLabCoordinator5 = new com.reservation_system.model.HeadLabCoordinator((int) (short) 1, "faculty", "researcher", "labmanager", false);
    }

    @Test
    public void test1446() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1446");
        com.reservation_system.model.User user6 = com.reservation_system.patterns.factory.UserFactory.createUser("student", 102, "hi!", "researcher", "Andrew", false);
        org.junit.Assert.assertNotNull(user6);
    }

    @Test
    public void test1447() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1447");
        com.reservation_system.model.Student student5 = new com.reservation_system.model.Student(1, "labmanager", "", "student", true);
    }

    @Test
    public void test1448() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1448");
        com.reservation_system.model.Student student5 = new com.reservation_system.model.Student(101, "WrongPassword1!", "Researcher", "Password1!", false);
    }

    @Test
    public void test1449() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1449");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("data/test-users.csv");
        java.util.List<com.reservation_system.model.User> userList2 = userRepository1.getAllUsers();
        boolean boolean3 = userRepository1.headLabCoordinatorExists();
        boolean boolean5 = userRepository1.emailExists("guest");
        java.util.Optional<com.reservation_system.model.User> userOptional7 = userRepository1.findByEmail("data/test-users.csv");
        org.junit.Assert.assertNotNull(userList2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(userOptional7);
    }

    @Test
    public void test1450() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1450");
        com.reservation_system.model.Student student5 = new com.reservation_system.model.Student(0, "student", "Andrew", "guest", false);
        java.lang.String str6 = student5.getUserType();
        java.lang.String str7 = student5.getUserType();
        boolean boolean8 = student5.isApproved();
        student5.setApproved(false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Student" + "'", str6, "Student");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Student" + "'", str7, "Student");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test1451() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1451");
        com.reservation_system.model.Researcher researcher5 = new com.reservation_system.model.Researcher((int) (byte) 100, "Student", "researcher", "Student", true);
    }

    @Test
    public void test1452() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1452");
        // The following exception was thrown during execution in test generation
        try {
            com.reservation_system.model.User user6 = com.reservation_system.patterns.factory.UserFactory.createUser("", (int) (byte) -1, "WrongPassword1!", "faculty", "Researcher", false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid user type: ");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1453() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1453");
        com.reservation_system.model.Guest guest5 = new com.reservation_system.model.Guest((int) (byte) 100, "Password1!", "Guest", "Guest", true);
        java.lang.String str6 = guest5.getUserType();
        int int7 = guest5.getID();
        java.lang.String str8 = guest5.getEmail();
        java.lang.String str9 = guest5.getUserType();
        boolean boolean10 = guest5.requiresDepartmentApproval();
        java.lang.String str11 = guest5.getUserType();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Guest" + "'", str6, "Guest");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 100 + "'", int7 == 100);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Guest" + "'", str8, "Guest");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Guest" + "'", str9, "Guest");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Guest" + "'", str11, "Guest");
    }

    @Test
    public void test1454() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1454");
        com.reservation_system.model.Researcher researcher5 = new com.reservation_system.model.Researcher(98, "Password1!", "WrongPassword1!", "student", true);
        java.lang.String str6 = researcher5.getUserType();
        java.lang.String str7 = researcher5.getUserType();
        java.lang.String str8 = researcher5.getUserType();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Researcher" + "'", str6, "Researcher");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Researcher" + "'", str7, "Researcher");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Researcher" + "'", str8, "Researcher");
    }

    @Test
    public void test1455() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1455");
        com.reservation_system.model.Faculty faculty5 = new com.reservation_system.model.Faculty((int) 'a', "Faculty", "", "hi!", true);
        boolean boolean6 = faculty5.requiresDepartmentApproval();
        java.lang.String str7 = faculty5.getUserType();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Faculty" + "'", str7, "Faculty");
    }

    @Test
    public void test1456() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1456");
        com.reservation_system.model.Researcher researcher5 = new com.reservation_system.model.Researcher(98, "Researcher", "Student", "guest", true);
        java.lang.String str6 = researcher5.getPassword();
        java.lang.String str7 = researcher5.getUserType();
        java.lang.String str8 = researcher5.getEmail();
        java.lang.String str9 = researcher5.getUserType();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "guest" + "'", str6, "guest");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Researcher" + "'", str7, "Researcher");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Student" + "'", str8, "Student");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Researcher" + "'", str9, "Researcher");
    }

    @Test
    public void test1457() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1457");
        com.reservation_system.model.Faculty faculty5 = new com.reservation_system.model.Faculty(0, "headlabcoordinator", "student", "labmanager", false);
        java.lang.String str6 = faculty5.getName();
        boolean boolean7 = faculty5.requiresDepartmentApproval();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "headlabcoordinator" + "'", str6, "headlabcoordinator");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test1458() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1458");
        com.reservation_system.model.Researcher researcher5 = new com.reservation_system.model.Researcher((int) (short) -1, "researcher", "test@example.com", "Faculty", true);
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
    public void test1459() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1459");
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
            com.reservation_system.model.User user17 = authService14.login("student", "headlabcoordinator");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Incorrect password.");
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
    public void test1460() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1460");
        com.reservation_system.model.LabManager labManager5 = new com.reservation_system.model.LabManager(36, "WrongPassword1!", "headlabcoordinator", "Guest", true);
        java.lang.String str6 = labManager5.getUserType();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "labmanager" + "'", str6, "labmanager");
    }

    @Test
    public void test1461() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1461");
        com.reservation_system.model.LabManager labManager5 = new com.reservation_system.model.LabManager((int) (byte) 0, "labmanager", "", "Guest", false);
    }

    @Test
    public void test1462() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1462");
        com.reservation_system.model.Guest guest5 = new com.reservation_system.model.Guest(1, "Guest", "Password1!", "Password1!", true);
        java.lang.String str6 = guest5.getPassword();
        java.lang.String str7 = guest5.getEmail();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Password1!" + "'", str6, "Password1!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Password1!" + "'", str7, "Password1!");
    }

    @Test
    public void test1463() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1463");
        com.reservation_system.model.Faculty faculty5 = new com.reservation_system.model.Faculty(10, "faculty", "", "Researcher", false);
    }

    @Test
    public void test1464() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1464");
        com.reservation_system.model.LabManager labManager5 = new com.reservation_system.model.LabManager((int) (short) -1, "headlabcoordinator", "guest", "Andrew", false);
    }

    @Test
    public void test1465() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1465");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("data/test-users.csv");
        java.util.List<com.reservation_system.model.User> userList2 = userRepository1.getAllUsers();
        java.util.List<com.reservation_system.model.User> userList3 = userRepository1.getAllUsers();
        com.reservation_system.services.AuthService authService4 = new com.reservation_system.services.AuthService(userRepository1);
        java.util.Optional<com.reservation_system.model.User> userOptional6 = userRepository1.findByEmail("faculty");
        com.reservation_system.services.AuthService authService7 = new com.reservation_system.services.AuthService(userRepository1);
        boolean boolean9 = userRepository1.emailExists("researcher");
        java.util.Optional<com.reservation_system.model.User> userOptional11 = userRepository1.findByEmail("student");
        com.reservation_system.services.AuthService authService12 = new com.reservation_system.services.AuthService(userRepository1);
        org.junit.Assert.assertNotNull(userList2);
        org.junit.Assert.assertNotNull(userList3);
        org.junit.Assert.assertNotNull(userOptional6);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(userOptional11);
    }

    @Test
    public void test1466() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1466");
        // The following exception was thrown during execution in test generation
        try {
            com.reservation_system.model.User user6 = com.reservation_system.patterns.factory.UserFactory.createUser("", (-1), "Student", "Andrew", "Password1!", false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid user type: ");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1467() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1467");
        com.reservation_system.model.Researcher researcher5 = new com.reservation_system.model.Researcher((int) (byte) 0, "Guest", "hi!", "Researcher", false);
    }

    @Test
    public void test1468() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1468");
        com.reservation_system.model.Guest guest5 = new com.reservation_system.model.Guest((int) (short) -1, "headlabcoordinator", "data/test-users.csv", "WrongPassword1!", false);
        java.lang.String str6 = guest5.getUserType();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Guest" + "'", str6, "Guest");
    }

    @Test
    public void test1469() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1469");
        com.reservation_system.model.Student student5 = new com.reservation_system.model.Student(1, "guest", "Faculty", "labmanager", true);
        java.lang.String str6 = student5.getEmail();
        boolean boolean7 = student5.isApproved();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Faculty" + "'", str6, "Faculty");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test1470() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1470");
        com.reservation_system.model.LabManager labManager5 = new com.reservation_system.model.LabManager(0, "student", "data/test-users.csv", "headlabcoordinator", true);
        boolean boolean6 = labManager5.isApproved();
        int int7 = labManager5.getID();
        boolean boolean8 = labManager5.requiresDepartmentApproval();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test1471() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1471");
        // The following exception was thrown during execution in test generation
        try {
            com.reservation_system.model.User user6 = com.reservation_system.patterns.factory.UserFactory.createUser("", (int) (byte) 100, "", "guest", "test@example.com", true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid user type: ");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1472() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1472");
        com.reservation_system.model.User user6 = com.reservation_system.patterns.factory.UserFactory.createUser("faculty", (int) (byte) 0, "WrongPassword1!", "headlabcoordinator", "test@example.com", false);
        org.junit.Assert.assertNotNull(user6);
    }

    @Test
    public void test1473() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1473");
        com.reservation_system.model.Faculty faculty5 = new com.reservation_system.model.Faculty((int) (byte) 0, "", "", "faculty", true);
    }

    @Test
    public void test1474() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1474");
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
        boolean boolean17 = userRepository1.emailExists("Password1!");
        java.util.List<com.reservation_system.model.User> userList18 = userRepository1.getAllUsers();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
// flaky "33) test1474(com.reservation_system.Randoop.AuthService.RegressionTest2)":         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 99 + "'", int3 == 99);
        org.junit.Assert.assertNotNull(userList4);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "labmanager" + "'", str11, "labmanager");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNotNull(userList18);
    }

    @Test
    public void test1475() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1475");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("data/test-users.csv");
        java.util.List<com.reservation_system.model.User> userList2 = userRepository1.getAllUsers();
        com.reservation_system.services.AuthService authService3 = new com.reservation_system.services.AuthService(userRepository1);
        com.reservation_system.services.AuthService authService4 = new com.reservation_system.services.AuthService(userRepository1);
        boolean boolean6 = userRepository1.emailExists("student");
        org.junit.Assert.assertNotNull(userList2);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test1476() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1476");
        com.reservation_system.model.Researcher researcher5 = new com.reservation_system.model.Researcher((int) (short) -1, "researcher", "test@example.com", "Faculty", true);
        java.lang.String str6 = researcher5.getUserType();
        boolean boolean7 = researcher5.requiresDepartmentApproval();
        java.lang.String str8 = researcher5.getUserType();
        java.lang.String str9 = researcher5.getPassword();
        java.lang.String str10 = researcher5.getUserType();
        java.lang.String str11 = researcher5.getEmail();
        researcher5.setApproved(true);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Researcher" + "'", str6, "Researcher");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Researcher" + "'", str8, "Researcher");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Faculty" + "'", str9, "Faculty");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Researcher" + "'", str10, "Researcher");
    }

    @Test
    public void test1477() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1477");
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
        // The following exception was thrown during execution in test generation
        try {
            com.reservation_system.model.User user20 = authService17.login("hi!", "");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Password is required.");
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
    public void test1478() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1478");
        com.reservation_system.model.LabManager labManager5 = new com.reservation_system.model.LabManager((int) (byte) -1, "guest", "Password1!", "Password1!", false);
    }

    @Test
    public void test1479() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1479");
        com.reservation_system.model.Student student5 = new com.reservation_system.model.Student(1, "Guest", "Andrew", "WrongPassword1!", false);
        int int6 = student5.getID();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
    }

    @Test
    public void test1480() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1480");
        com.reservation_system.model.Faculty faculty5 = new com.reservation_system.model.Faculty((int) ' ', "WrongPassword1!", "guest", "Guest", false);
        java.lang.String str6 = faculty5.getPassword();
        boolean boolean7 = faculty5.requiresDepartmentApproval();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Guest" + "'", str6, "Guest");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test1481() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1481");
        com.reservation_system.model.Student student5 = new com.reservation_system.model.Student(0, "student", "Andrew", "guest", false);
        java.lang.String str6 = student5.getUserType();
        boolean boolean7 = student5.isApproved();
        java.lang.String str8 = student5.getEmail();
        java.lang.String str9 = student5.getUserType();
        java.lang.String str10 = student5.getUserType();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Student" + "'", str6, "Student");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Andrew" + "'", str8, "Andrew");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Student" + "'", str9, "Student");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Student" + "'", str10, "Student");
    }

    @Test
    public void test1482() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1482");
        com.reservation_system.model.Student student5 = new com.reservation_system.model.Student((int) 'a', "labmanager", "Password1!", "Faculty", false);
    }

    @Test
    public void test1483() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1483");
        com.reservation_system.model.User user6 = com.reservation_system.patterns.factory.UserFactory.createUser("Student", 0, "Researcher", "Guest", "Faculty", false);
        org.junit.Assert.assertNotNull(user6);
    }

    @Test
    public void test1484() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1484");
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
        com.reservation_system.model.Faculty faculty58 = new com.reservation_system.model.Faculty(0, "headlabcoordinator", "student", "labmanager", false);
        java.lang.String str59 = faculty58.getName();
        java.lang.String str60 = faculty58.getName();
        java.lang.String str61 = faculty58.getName();
        java.lang.String str62 = faculty58.getUserType();
        int int63 = faculty58.getID();
        userRepository1.addUser((com.reservation_system.model.User) faculty58);
        org.junit.Assert.assertNotNull(userList2);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
// flaky "34) test1484(com.reservation_system.Randoop.AuthService.RegressionTest2)":         org.junit.Assert.assertTrue("'" + int9 + "' != '" + 99 + "'", int9 == 99);
        org.junit.Assert.assertNotNull(userList10);
// flaky "18) test1484(com.reservation_system.Randoop.AuthService.RegressionTest2)":         org.junit.Assert.assertTrue("'" + int12 + "' != '" + 99 + "'", int12 == 99);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(userList17);
        org.junit.Assert.assertNotNull(userList18);
        org.junit.Assert.assertNotNull(userList21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertNotNull(userList25);
        org.junit.Assert.assertNotNull(userList26);
        org.junit.Assert.assertNotNull(userList38);
        org.junit.Assert.assertNotNull(userList39);
        org.junit.Assert.assertNotNull(userList42);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + true + "'", boolean43 == true);
        org.junit.Assert.assertNotNull(userList46);
        org.junit.Assert.assertNotNull(userList47);
        org.junit.Assert.assertNotNull(userList50);
        org.junit.Assert.assertEquals("'" + str59 + "' != '" + "headlabcoordinator" + "'", str59, "headlabcoordinator");
        org.junit.Assert.assertEquals("'" + str60 + "' != '" + "headlabcoordinator" + "'", str60, "headlabcoordinator");
        org.junit.Assert.assertEquals("'" + str61 + "' != '" + "headlabcoordinator" + "'", str61, "headlabcoordinator");
        org.junit.Assert.assertEquals("'" + str62 + "' != '" + "Faculty" + "'", str62, "Faculty");
        org.junit.Assert.assertTrue("'" + int63 + "' != '" + 0 + "'", int63 == 0);
    }

    @Test
    public void test1485() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1485");
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
        boolean boolean14 = userRepository1.emailExists("Password1!");
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
        boolean boolean29 = userRepository16.headLabCoordinatorExists();
        java.util.List<com.reservation_system.model.User> userList30 = userRepository16.getAllUsers();
        com.reservation_system.repository.UserRepository userRepository32 = new com.reservation_system.repository.UserRepository("data/test-users.csv");
        java.util.List<com.reservation_system.model.User> userList33 = userRepository32.getAllUsers();
        com.reservation_system.services.AuthService authService34 = new com.reservation_system.services.AuthService(userRepository32);
        java.util.Optional<com.reservation_system.model.User> userOptional36 = userRepository32.findByEmail("");
        int int37 = userRepository32.getNextID();
        com.reservation_system.services.AuthService authService38 = new com.reservation_system.services.AuthService(userRepository32);
        com.reservation_system.model.Researcher researcher44 = new com.reservation_system.model.Researcher((int) (short) -1, "headlabcoordinator", "student", "", false);
        boolean boolean45 = researcher44.isApproved();
        java.lang.String str46 = researcher44.getEmail();
        java.lang.String str47 = researcher44.getUserType();
        java.lang.String str48 = researcher44.getEmail();
        userRepository32.addUser((com.reservation_system.model.User) researcher44);
        java.util.List<com.reservation_system.model.User> userList50 = userRepository32.getAllUsers();
        userRepository16.saveAllUsers(userList50);
        userRepository1.saveAllUsers(userList50);
        org.junit.Assert.assertNotNull(userList2);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 99 + "'", int9 == 99);
        org.junit.Assert.assertNotNull(userList10);
        org.junit.Assert.assertNotNull(userList12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(userList17);
        org.junit.Assert.assertNotNull(userList18);
        org.junit.Assert.assertNotNull(userList21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertNotNull(userList25);
        org.junit.Assert.assertNotNull(userList26);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertNotNull(userList30);
        org.junit.Assert.assertNotNull(userList33);
        org.junit.Assert.assertNotNull(userOptional36);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 99 + "'", int37 == 99);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertEquals("'" + str46 + "' != '" + "student" + "'", str46, "student");
        org.junit.Assert.assertEquals("'" + str47 + "' != '" + "Researcher" + "'", str47, "Researcher");
        org.junit.Assert.assertEquals("'" + str48 + "' != '" + "student" + "'", str48, "student");
        org.junit.Assert.assertNotNull(userList50);
    }

    @Test
    public void test1486() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1486");
        com.reservation_system.model.User user6 = com.reservation_system.patterns.factory.UserFactory.createUser("headlabcoordinator", (int) '#', "student", "Student", "data/test-users.csv", true);
        org.junit.Assert.assertNotNull(user6);
    }

    @Test
    public void test1487() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1487");
        com.reservation_system.model.Faculty faculty5 = new com.reservation_system.model.Faculty((int) (byte) 100, "Faculty", "guest", "", true);
    }

    @Test
    public void test1488() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1488");
        com.reservation_system.model.HeadLabCoordinator headLabCoordinator5 = new com.reservation_system.model.HeadLabCoordinator(0, "WrongPassword1!", "Guest", "data/test-users.csv", true);
        java.lang.String str6 = headLabCoordinator5.getEmail();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Guest" + "'", str6, "Guest");
    }

    @Test
    public void test1489() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1489");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("data/test-users.csv");
        java.util.List<com.reservation_system.model.User> userList2 = userRepository1.getAllUsers();
        com.reservation_system.services.AuthService authService3 = new com.reservation_system.services.AuthService(userRepository1);
        com.reservation_system.model.LabManager labManager9 = new com.reservation_system.model.LabManager((int) (short) 0, "", "student", "Andrew", true);
        boolean boolean10 = labManager9.isApproved();
        userRepository1.addUser((com.reservation_system.model.User) labManager9);
        com.reservation_system.model.Faculty faculty17 = new com.reservation_system.model.Faculty((int) '#', "researcher", "", "student", true);
        userRepository1.addUser((com.reservation_system.model.User) faculty17);
        boolean boolean20 = userRepository1.emailExists("data/test-users.csv");
        com.reservation_system.repository.UserRepository userRepository22 = new com.reservation_system.repository.UserRepository("data/test-users.csv");
        java.util.List<com.reservation_system.model.User> userList23 = userRepository22.getAllUsers();
        com.reservation_system.repository.UserRepository userRepository25 = new com.reservation_system.repository.UserRepository("data/test-users.csv");
        java.util.List<com.reservation_system.model.User> userList26 = userRepository25.getAllUsers();
        com.reservation_system.services.AuthService authService27 = new com.reservation_system.services.AuthService(userRepository25);
        int int28 = userRepository25.getNextID();
        boolean boolean29 = userRepository25.headLabCoordinatorExists();
        com.reservation_system.repository.UserRepository userRepository31 = new com.reservation_system.repository.UserRepository("data/test-users.csv");
        java.util.List<com.reservation_system.model.User> userList32 = userRepository31.getAllUsers();
        boolean boolean33 = userRepository31.headLabCoordinatorExists();
        boolean boolean34 = userRepository31.headLabCoordinatorExists();
        java.util.List<com.reservation_system.model.User> userList35 = userRepository31.getAllUsers();
        userRepository25.saveAllUsers(userList35);
        userRepository22.saveAllUsers(userList35);
        userRepository1.saveAllUsers(userList35);
        com.reservation_system.repository.UserRepository userRepository40 = new com.reservation_system.repository.UserRepository("data/test-users.csv");
        java.util.List<com.reservation_system.model.User> userList41 = userRepository40.getAllUsers();
        boolean boolean42 = userRepository40.headLabCoordinatorExists();
        boolean boolean44 = userRepository40.emailExists("hi!");
        java.util.Optional<com.reservation_system.model.User> userOptional46 = userRepository40.findByEmail("Faculty");
        int int47 = userRepository40.getNextID();
        java.util.List<com.reservation_system.model.User> userList48 = userRepository40.getAllUsers();
        java.util.List<com.reservation_system.model.User> userList49 = userRepository40.getAllUsers();
        userRepository1.saveAllUsers(userList49);
        org.junit.Assert.assertNotNull(userList2);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(userList23);
        org.junit.Assert.assertNotNull(userList26);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 99 + "'", int28 == 99);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertNotNull(userList32);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertNotNull(userList35);
        org.junit.Assert.assertNotNull(userList41);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + true + "'", boolean42 == true);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + true + "'", boolean44 == true);
        org.junit.Assert.assertNotNull(userOptional46);
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + 99 + "'", int47 == 99);
        org.junit.Assert.assertNotNull(userList48);
        org.junit.Assert.assertNotNull(userList49);
    }

    @Test
    public void test1490() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1490");
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
        com.reservation_system.services.AuthService authService27 = new com.reservation_system.services.AuthService(userRepository1);
        // The following exception was thrown during execution in test generation
        try {
            com.reservation_system.model.User user30 = authService27.login("student", "hi!");
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
        org.junit.Assert.assertNotNull(user24);
    }

    @Test
    public void test1491() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1491");
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
        boolean boolean21 = userRepository1.headLabCoordinatorExists();
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
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
    }

    @Test
    public void test1492() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1492");
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
        java.util.List<com.reservation_system.model.User> userList28 = userRepository1.getAllUsers();
        com.reservation_system.repository.UserRepository userRepository30 = new com.reservation_system.repository.UserRepository("data/test-users.csv");
        java.util.List<com.reservation_system.model.User> userList31 = userRepository30.getAllUsers();
        boolean boolean32 = userRepository30.headLabCoordinatorExists();
        boolean boolean34 = userRepository30.emailExists("hi!");
        java.util.Optional<com.reservation_system.model.User> userOptional36 = userRepository30.findByEmail("Faculty");
        int int37 = userRepository30.getNextID();
        boolean boolean38 = userRepository30.headLabCoordinatorExists();
        com.reservation_system.repository.UserRepository userRepository40 = new com.reservation_system.repository.UserRepository("data/test-users.csv");
        java.util.List<com.reservation_system.model.User> userList41 = userRepository40.getAllUsers();
        com.reservation_system.services.AuthService authService42 = new com.reservation_system.services.AuthService(userRepository40);
        com.reservation_system.model.LabManager labManager48 = new com.reservation_system.model.LabManager((int) (short) 0, "", "student", "Andrew", true);
        boolean boolean49 = labManager48.isApproved();
        userRepository40.addUser((com.reservation_system.model.User) labManager48);
        com.reservation_system.model.Faculty faculty56 = new com.reservation_system.model.Faculty((int) '#', "researcher", "", "student", true);
        userRepository40.addUser((com.reservation_system.model.User) faculty56);
        boolean boolean59 = userRepository40.emailExists("data/test-users.csv");
        java.util.Optional<com.reservation_system.model.User> userOptional61 = userRepository40.findByEmail("researcher");
        com.reservation_system.repository.UserRepository userRepository63 = new com.reservation_system.repository.UserRepository("data/test-users.csv");
        java.util.List<com.reservation_system.model.User> userList64 = userRepository63.getAllUsers();
        com.reservation_system.services.AuthService authService65 = new com.reservation_system.services.AuthService(userRepository63);
        com.reservation_system.model.LabManager labManager71 = new com.reservation_system.model.LabManager((int) (short) 0, "", "student", "Andrew", true);
        boolean boolean72 = labManager71.isApproved();
        userRepository63.addUser((com.reservation_system.model.User) labManager71);
        boolean boolean75 = userRepository63.emailExists("Researcher");
        java.util.List<com.reservation_system.model.User> userList76 = userRepository63.getAllUsers();
        userRepository40.saveAllUsers(userList76);
        userRepository30.saveAllUsers(userList76);
        userRepository1.saveAllUsers(userList76);
        java.util.Optional<com.reservation_system.model.User> userOptional81 = userRepository1.findByEmail("headlabcoordinator");
        org.junit.Assert.assertNotNull(userList2);
        org.junit.Assert.assertNotNull(userList3);
        org.junit.Assert.assertNotNull(userList7);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 99 + "'", int24 == 99);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 99 + "'", int25 == 99);
        org.junit.Assert.assertNotNull(userList26);
        org.junit.Assert.assertNotNull(userList28);
        org.junit.Assert.assertNotNull(userList31);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertNotNull(userOptional36);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 99 + "'", int37 == 99);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + true + "'", boolean38 == true);
        org.junit.Assert.assertNotNull(userList41);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + true + "'", boolean49 == true);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + false + "'", boolean59 == false);
        org.junit.Assert.assertNotNull(userOptional61);
        org.junit.Assert.assertNotNull(userList64);
        org.junit.Assert.assertTrue("'" + boolean72 + "' != '" + true + "'", boolean72 == true);
        org.junit.Assert.assertTrue("'" + boolean75 + "' != '" + true + "'", boolean75 == true);
        org.junit.Assert.assertNotNull(userList76);
        org.junit.Assert.assertNotNull(userOptional81);
    }

    @Test
    public void test1493() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1493");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("data/test-users.csv");
        boolean boolean2 = userRepository1.headLabCoordinatorExists();
        int int3 = userRepository1.getNextID();
        boolean boolean5 = userRepository1.emailExists("test@example.com");
        int int6 = userRepository1.getNextID();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 99 + "'", int3 == 99);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 99 + "'", int6 == 99);
    }

    @Test
    public void test1494() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1494");
        com.reservation_system.model.Student student5 = new com.reservation_system.model.Student(35, "WrongPassword1!", "researcher", "Faculty", false);
    }

    @Test
    public void test1495() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1495");
        com.reservation_system.model.LabManager labManager5 = new com.reservation_system.model.LabManager((int) '4', "researcher", "Guest", "", true);
    }

    @Test
    public void test1496() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1496");
        com.reservation_system.model.Guest guest5 = new com.reservation_system.model.Guest(97, "Andrew", "", "headlabcoordinator", false);
    }

    @Test
    public void test1497() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1497");
        com.reservation_system.model.LabManager labManager5 = new com.reservation_system.model.LabManager((int) (short) 1, "data/test-users.csv", "labmanager", "faculty", false);
    }

    @Test
    public void test1498() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1498");
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
        java.util.Optional<com.reservation_system.model.User> userOptional20 = userRepository1.findByEmail("Faculty");
        java.util.List<com.reservation_system.model.User> userList21 = userRepository1.getAllUsers();
        com.reservation_system.repository.UserRepository userRepository23 = new com.reservation_system.repository.UserRepository("data/test-users.csv");
        java.util.List<com.reservation_system.model.User> userList24 = userRepository23.getAllUsers();
        java.util.List<com.reservation_system.model.User> userList25 = userRepository23.getAllUsers();
        com.reservation_system.model.Faculty faculty31 = new com.reservation_system.model.Faculty(10, "data/test-users.csv", "hi!", "", false);
        java.lang.String str32 = faculty31.getUserType();
        userRepository23.addUser((com.reservation_system.model.User) faculty31);
        java.util.Optional<com.reservation_system.model.User> userOptional35 = userRepository23.findByEmail("Student");
        boolean boolean36 = userRepository23.headLabCoordinatorExists();
        com.reservation_system.repository.UserRepository userRepository38 = new com.reservation_system.repository.UserRepository("data/test-users.csv");
        java.util.List<com.reservation_system.model.User> userList39 = userRepository38.getAllUsers();
        java.util.List<com.reservation_system.model.User> userList40 = userRepository38.getAllUsers();
        com.reservation_system.repository.UserRepository userRepository42 = new com.reservation_system.repository.UserRepository("data/test-users.csv");
        java.util.List<com.reservation_system.model.User> userList43 = userRepository42.getAllUsers();
        boolean boolean44 = userRepository42.headLabCoordinatorExists();
        com.reservation_system.repository.UserRepository userRepository46 = new com.reservation_system.repository.UserRepository("data/test-users.csv");
        java.util.List<com.reservation_system.model.User> userList47 = userRepository46.getAllUsers();
        java.util.List<com.reservation_system.model.User> userList48 = userRepository46.getAllUsers();
        userRepository42.saveAllUsers(userList48);
        userRepository38.saveAllUsers(userList48);
        com.reservation_system.repository.UserRepository userRepository52 = new com.reservation_system.repository.UserRepository("data/test-users.csv");
        java.util.List<com.reservation_system.model.User> userList53 = userRepository52.getAllUsers();
        com.reservation_system.services.AuthService authService54 = new com.reservation_system.services.AuthService(userRepository52);
        com.reservation_system.model.LabManager labManager60 = new com.reservation_system.model.LabManager((int) (short) 0, "", "student", "Andrew", true);
        boolean boolean61 = labManager60.isApproved();
        userRepository52.addUser((com.reservation_system.model.User) labManager60);
        com.reservation_system.repository.UserRepository userRepository64 = new com.reservation_system.repository.UserRepository("data/test-users.csv");
        java.util.List<com.reservation_system.model.User> userList65 = userRepository64.getAllUsers();
        java.util.List<com.reservation_system.model.User> userList66 = userRepository64.getAllUsers();
        userRepository52.saveAllUsers(userList66);
        userRepository38.saveAllUsers(userList66);
        userRepository23.saveAllUsers(userList66);
        userRepository1.saveAllUsers(userList66);
        org.junit.Assert.assertNotNull(userList2);
        org.junit.Assert.assertNotNull(userOptional5);
        org.junit.Assert.assertNotNull(userList6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "student" + "'", str16, "student");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "Researcher" + "'", str17, "Researcher");
        org.junit.Assert.assertNotNull(userOptional20);
        org.junit.Assert.assertNotNull(userList21);
        org.junit.Assert.assertNotNull(userList24);
        org.junit.Assert.assertNotNull(userList25);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "Faculty" + "'", str32, "Faculty");
        org.junit.Assert.assertNotNull(userOptional35);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertNotNull(userList39);
        org.junit.Assert.assertNotNull(userList40);
        org.junit.Assert.assertNotNull(userList43);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + true + "'", boolean44 == true);
        org.junit.Assert.assertNotNull(userList47);
        org.junit.Assert.assertNotNull(userList48);
        org.junit.Assert.assertNotNull(userList53);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + true + "'", boolean61 == true);
        org.junit.Assert.assertNotNull(userList65);
        org.junit.Assert.assertNotNull(userList66);
    }

    @Test
    public void test1499() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1499");
        com.reservation_system.model.Student student5 = new com.reservation_system.model.Student(0, "labmanager", "WrongPassword1!", "labmanager", false);
        boolean boolean6 = student5.requiresDepartmentApproval();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test1500() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1500");
        com.reservation_system.model.User user6 = com.reservation_system.patterns.factory.UserFactory.createUser("Researcher", 99, "Researcher", "data/test-users.csv", "hi!", true);
        java.lang.Class<?> wildcardClass7 = user6.getClass();
        org.junit.Assert.assertNotNull(user6);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }
}
