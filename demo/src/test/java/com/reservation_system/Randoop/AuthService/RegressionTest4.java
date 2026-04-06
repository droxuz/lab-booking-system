package com.reservation_system.Randoop.AuthService;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest4 {

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
        com.reservation_system.model.Researcher researcher5 = new com.reservation_system.model.Researcher(10, "Password1!", "Password1!", "headlabcoordinator", true);
        java.lang.String str6 = researcher5.getUserType();
        java.lang.String str7 = researcher5.getUserType();
        java.lang.String str8 = researcher5.getUserType();
        java.lang.String str9 = researcher5.getName();
        java.lang.String str10 = researcher5.getUserType();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Researcher" + "'", str6, "Researcher");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Researcher" + "'", str7, "Researcher");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Researcher" + "'", str8, "Researcher");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Password1!" + "'", str9, "Password1!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Researcher" + "'", str10, "Researcher");
    }

    @Test
    public void test2002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2002");
        com.reservation_system.model.LabManager labManager5 = new com.reservation_system.model.LabManager((int) 'a', "Faculty", "", "", false);
        java.lang.String str6 = labManager5.getUserType();
        java.lang.String str7 = labManager5.getEmail();
        boolean boolean8 = labManager5.requiresDepartmentApproval();
        java.lang.String str9 = labManager5.getPassword();
        int int10 = labManager5.getID();
        java.lang.String str11 = labManager5.getUserType();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "labmanager" + "'", str6, "labmanager");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 97 + "'", int10 == 97);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "labmanager" + "'", str11, "labmanager");
    }

    @Test
    public void test2003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2003");
        com.reservation_system.model.HeadLabCoordinator headLabCoordinator5 = new com.reservation_system.model.HeadLabCoordinator((int) '4', "faculty", "student", "Guest", false);
    }

    @Test
    public void test2004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2004");
        com.reservation_system.model.Student student5 = new com.reservation_system.model.Student(100, "headlabcoordinator", "test@example.com", "faculty", false);
        boolean boolean6 = student5.requiresDepartmentApproval();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test2005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2005");
        com.reservation_system.model.HeadLabCoordinator headLabCoordinator5 = new com.reservation_system.model.HeadLabCoordinator(32, "researcher", "labmanager", "test@example.com", false);
    }

    @Test
    public void test2006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2006");
        com.reservation_system.model.Faculty faculty5 = new com.reservation_system.model.Faculty((int) ' ', "", "faculty", "faculty", false);
    }

    @Test
    public void test2007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2007");
        com.reservation_system.model.Student student5 = new com.reservation_system.model.Student((int) ' ', "student", "Researcher", "faculty", false);
        java.lang.String str6 = student5.getName();
        java.lang.String str7 = student5.getUserType();
        java.lang.String str8 = student5.getUserType();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "student" + "'", str6, "student");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Student" + "'", str7, "Student");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Student" + "'", str8, "Student");
    }

    @Test
    public void test2008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2008");
        com.reservation_system.model.Researcher researcher5 = new com.reservation_system.model.Researcher(100, "Password1!", "WrongPassword1!", "headlabcoordinator", false);
        java.lang.String str6 = researcher5.getEmail();
        int int7 = researcher5.getID();
        java.lang.String str8 = researcher5.getName();
        java.lang.String str9 = researcher5.getUserType();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "WrongPassword1!" + "'", str6, "WrongPassword1!");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 100 + "'", int7 == 100);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Password1!" + "'", str8, "Password1!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Researcher" + "'", str9, "Researcher");
    }

    @Test
    public void test2009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2009");
        com.reservation_system.model.LabManager labManager5 = new com.reservation_system.model.LabManager(1, "hi!", "hi!", "Andrew", false);
    }

    @Test
    public void test2010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2010");
        com.reservation_system.model.LabManager labManager5 = new com.reservation_system.model.LabManager(35, "headlabcoordinator", "hi!", "hi!", false);
        java.lang.String str6 = labManager5.getUserType();
        labManager5.setApproved(false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "labmanager" + "'", str6, "labmanager");
    }

    @Test
    public void test2011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2011");
        com.reservation_system.model.Guest guest5 = new com.reservation_system.model.Guest((int) '#', "", "Faculty", "", true);
    }

    @Test
    public void test2012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2012");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("data/test-users.csv");
        java.util.List<com.reservation_system.model.User> userList2 = userRepository1.getAllUsers();
        java.util.List<com.reservation_system.model.User> userList3 = userRepository1.getAllUsers();
        com.reservation_system.services.AuthService authService4 = new com.reservation_system.services.AuthService(userRepository1);
        java.util.Optional<com.reservation_system.model.User> userOptional6 = userRepository1.findByEmail("faculty");
        int int7 = userRepository1.getNextID();
        java.util.Optional<com.reservation_system.model.User> userOptional9 = userRepository1.findByEmail("WrongPassword1!");
        boolean boolean11 = userRepository1.emailExists("");
        org.junit.Assert.assertNotNull(userList2);
        org.junit.Assert.assertNotNull(userList3);
        org.junit.Assert.assertNotNull(userOptional6);
// flaky "1) test2012(com.reservation_system.Randoop.AuthService.RegressionTest4)":         org.junit.Assert.assertTrue("'" + int7 + "' != '" + 101 + "'", int7 == 101);
        org.junit.Assert.assertNotNull(userOptional9);
// flaky "1) test2012(com.reservation_system.Randoop.AuthService.RegressionTest4)":         org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test2013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2013");
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
        boolean boolean40 = userRepository1.headLabCoordinatorExists();
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
// flaky "2) test2013(com.reservation_system.Randoop.AuthService.RegressionTest4)":         org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + true + "'", boolean40 == true);
    }

    @Test
    public void test2014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2014");
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
        com.reservation_system.repository.UserRepository userRepository32 = new com.reservation_system.repository.UserRepository("data/test-users.csv");
        java.util.List<com.reservation_system.model.User> userList33 = userRepository32.getAllUsers();
        java.util.List<com.reservation_system.model.User> userList34 = userRepository32.getAllUsers();
        com.reservation_system.repository.UserRepository userRepository36 = new com.reservation_system.repository.UserRepository("data/test-users.csv");
        java.util.List<com.reservation_system.model.User> userList37 = userRepository36.getAllUsers();
        boolean boolean38 = userRepository36.headLabCoordinatorExists();
        com.reservation_system.repository.UserRepository userRepository40 = new com.reservation_system.repository.UserRepository("data/test-users.csv");
        java.util.List<com.reservation_system.model.User> userList41 = userRepository40.getAllUsers();
        java.util.List<com.reservation_system.model.User> userList42 = userRepository40.getAllUsers();
        userRepository36.saveAllUsers(userList42);
        userRepository32.saveAllUsers(userList42);
        com.reservation_system.model.Faculty faculty50 = new com.reservation_system.model.Faculty(98, "guest", "Researcher", "student", true);
        userRepository32.addUser((com.reservation_system.model.User) faculty50);
        com.reservation_system.repository.UserRepository userRepository53 = new com.reservation_system.repository.UserRepository("data/test-users.csv");
        java.util.List<com.reservation_system.model.User> userList54 = userRepository53.getAllUsers();
        java.util.List<com.reservation_system.model.User> userList55 = userRepository53.getAllUsers();
        com.reservation_system.repository.UserRepository userRepository57 = new com.reservation_system.repository.UserRepository("data/test-users.csv");
        java.util.List<com.reservation_system.model.User> userList58 = userRepository57.getAllUsers();
        boolean boolean59 = userRepository57.headLabCoordinatorExists();
        com.reservation_system.repository.UserRepository userRepository61 = new com.reservation_system.repository.UserRepository("data/test-users.csv");
        java.util.List<com.reservation_system.model.User> userList62 = userRepository61.getAllUsers();
        java.util.List<com.reservation_system.model.User> userList63 = userRepository61.getAllUsers();
        userRepository57.saveAllUsers(userList63);
        userRepository53.saveAllUsers(userList63);
        java.util.List<com.reservation_system.model.User> userList66 = userRepository53.getAllUsers();
        userRepository32.saveAllUsers(userList66);
        userRepository1.saveAllUsers(userList66);
        com.reservation_system.model.Guest guest74 = new com.reservation_system.model.Guest(0, "Password1!", "Password1!", "Guest", true);
        userRepository1.addUser((com.reservation_system.model.User) guest74);
        org.junit.Assert.assertNotNull(userList2);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
// flaky "3) test2014(com.reservation_system.Randoop.AuthService.RegressionTest4)":         org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertNotNull(userOptional22);
// flaky "2) test2014(com.reservation_system.Randoop.AuthService.RegressionTest4)":         org.junit.Assert.assertTrue("'" + int23 + "' != '" + 101 + "'", int23 == 101);
        org.junit.Assert.assertNotNull(userList33);
        org.junit.Assert.assertNotNull(userList34);
        org.junit.Assert.assertNotNull(userList37);
// flaky "1) test2014(com.reservation_system.Randoop.AuthService.RegressionTest4)":         org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + true + "'", boolean38 == true);
        org.junit.Assert.assertNotNull(userList41);
        org.junit.Assert.assertNotNull(userList42);
        org.junit.Assert.assertNotNull(userList54);
        org.junit.Assert.assertNotNull(userList55);
        org.junit.Assert.assertNotNull(userList58);
// flaky "1) test2014(com.reservation_system.Randoop.AuthService.RegressionTest4)":         org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + true + "'", boolean59 == true);
        org.junit.Assert.assertNotNull(userList62);
        org.junit.Assert.assertNotNull(userList63);
        org.junit.Assert.assertNotNull(userList66);
    }

    @Test
    public void test2015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2015");
        com.reservation_system.model.Guest guest5 = new com.reservation_system.model.Guest((int) '#', "test@example.com", "Password1!", "test@example.com", true);
        java.lang.String str6 = guest5.getName();
        java.lang.String str7 = guest5.getName();
        java.lang.String str8 = guest5.getEmail();
        guest5.setApproved(true);
        guest5.setApproved(true);
        java.lang.String str13 = guest5.getUserType();
        java.lang.String str14 = guest5.getPassword();
        java.lang.String str15 = guest5.getUserType();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Password1!" + "'", str8, "Password1!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Guest" + "'", str13, "Guest");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Guest" + "'", str15, "Guest");
    }

    @Test
    public void test2016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2016");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("data/test-users.csv");
        java.util.List<com.reservation_system.model.User> userList2 = userRepository1.getAllUsers();
        java.util.List<com.reservation_system.model.User> userList3 = userRepository1.getAllUsers();
        com.reservation_system.model.Faculty faculty9 = new com.reservation_system.model.Faculty(10, "data/test-users.csv", "hi!", "", false);
        java.lang.String str10 = faculty9.getUserType();
        userRepository1.addUser((com.reservation_system.model.User) faculty9);
        java.util.List<com.reservation_system.model.User> userList12 = userRepository1.getAllUsers();
        com.reservation_system.model.HeadLabCoordinator headLabCoordinator18 = new com.reservation_system.model.HeadLabCoordinator(99, "Student", "WrongPassword1!", "faculty", false);
        userRepository1.addUser((com.reservation_system.model.User) headLabCoordinator18);
        boolean boolean20 = headLabCoordinator18.isApproved();
        java.lang.String str21 = headLabCoordinator18.getPassword();
        org.junit.Assert.assertNotNull(userList2);
        org.junit.Assert.assertNotNull(userList3);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Faculty" + "'", str10, "Faculty");
        org.junit.Assert.assertNotNull(userList12);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "faculty" + "'", str21, "faculty");
    }

    @Test
    public void test2017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2017");
        com.reservation_system.model.LabManager labManager5 = new com.reservation_system.model.LabManager((int) (byte) -1, "Researcher", "student", "", false);
    }

    @Test
    public void test2018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2018");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("data/test-users.csv");
        java.util.List<com.reservation_system.model.User> userList2 = userRepository1.getAllUsers();
        com.reservation_system.services.AuthService authService3 = new com.reservation_system.services.AuthService(userRepository1);
        com.reservation_system.services.AuthService authService4 = new com.reservation_system.services.AuthService(userRepository1);
        com.reservation_system.services.AuthService authService5 = new com.reservation_system.services.AuthService(userRepository1);
        boolean boolean6 = userRepository1.headLabCoordinatorExists();
        boolean boolean7 = userRepository1.headLabCoordinatorExists();
        com.reservation_system.model.HeadLabCoordinator headLabCoordinator13 = new com.reservation_system.model.HeadLabCoordinator((int) (byte) 1, "Guest", "", "", false);
        userRepository1.addUser((com.reservation_system.model.User) headLabCoordinator13);
        com.reservation_system.model.HeadLabCoordinator headLabCoordinator20 = new com.reservation_system.model.HeadLabCoordinator((int) 'a', "data/test-users.csv", "headlabcoordinator", "hi!", true);
        userRepository1.addUser((com.reservation_system.model.User) headLabCoordinator20);
        java.lang.String str22 = headLabCoordinator20.getUserType();
        org.junit.Assert.assertNotNull(userList2);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "headlabcoordinator" + "'", str22, "headlabcoordinator");
    }

    @Test
    public void test2019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2019");
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
            com.reservation_system.model.User user21 = authService18.login("test@example.com", "");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Password is required.");
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
    public void test2020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2020");
        com.reservation_system.model.User user6 = com.reservation_system.patterns.factory.UserFactory.createUser("Researcher", (int) (byte) 100, "guest", "Researcher", "test@example.com", false);
        java.lang.String str7 = user6.getEmail();
        java.lang.String str8 = user6.getPassword();
        org.junit.Assert.assertNotNull(user6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Researcher" + "'", str7, "Researcher");
    }

    @Test
    public void test2021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2021");
        com.reservation_system.model.HeadLabCoordinator headLabCoordinator5 = new com.reservation_system.model.HeadLabCoordinator(100, "", "Researcher", "", true);
    }

    @Test
    public void test2022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2022");
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
        com.reservation_system.services.AuthService authService41 = new com.reservation_system.services.AuthService(userRepository1);
        java.util.Optional<com.reservation_system.model.User> userOptional43 = userRepository1.findByEmail("guest");
        java.util.List<com.reservation_system.model.User> userList44 = userRepository1.getAllUsers();
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
        org.junit.Assert.assertNotNull(userOptional43);
        org.junit.Assert.assertNotNull(userList44);
    }

    @Test
    public void test2023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2023");
        com.reservation_system.model.LabManager labManager5 = new com.reservation_system.model.LabManager((int) (byte) 100, "data/test-users.csv", "test@example.com", "headlabcoordinator", false);
    }

    @Test
    public void test2024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2024");
        com.reservation_system.model.Researcher researcher5 = new com.reservation_system.model.Researcher((int) ' ', "Guest", "faculty", "faculty", true);
        java.lang.String str6 = researcher5.getEmail();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "faculty" + "'", str6, "faculty");
    }

    @Test
    public void test2025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2025");
        com.reservation_system.model.HeadLabCoordinator headLabCoordinator5 = new com.reservation_system.model.HeadLabCoordinator((int) 'a', "hi!", "faculty", "", true);
        int int6 = headLabCoordinator5.getID();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 97 + "'", int6 == 97);
    }

    @Test
    public void test2026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2026");
        com.reservation_system.model.User user6 = com.reservation_system.patterns.factory.UserFactory.createUser("labmanager", (-1), "guest", "Guest", "headlabcoordinator", false);
        org.junit.Assert.assertNotNull(user6);
    }

    @Test
    public void test2027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2027");
        com.reservation_system.model.Faculty faculty5 = new com.reservation_system.model.Faculty((int) '#', "test@example.com", "Password1!", "data/test-users.csv", false);
        boolean boolean6 = faculty5.requiresDepartmentApproval();
        java.lang.String str7 = faculty5.getEmail();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Password1!" + "'", str7, "Password1!");
    }

    @Test
    public void test2028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2028");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("data/test-users.csv");
        java.util.List<com.reservation_system.model.User> userList2 = userRepository1.getAllUsers();
        com.reservation_system.services.AuthService authService3 = new com.reservation_system.services.AuthService(userRepository1);
        com.reservation_system.model.LabManager labManager9 = new com.reservation_system.model.LabManager((int) (short) 0, "", "student", "Andrew", true);
        boolean boolean10 = labManager9.isApproved();
        userRepository1.addUser((com.reservation_system.model.User) labManager9);
        com.reservation_system.model.Faculty faculty17 = new com.reservation_system.model.Faculty((int) '#', "researcher", "", "student", true);
        userRepository1.addUser((com.reservation_system.model.User) faculty17);
        boolean boolean19 = userRepository1.headLabCoordinatorExists();
        boolean boolean20 = userRepository1.headLabCoordinatorExists();
        org.junit.Assert.assertNotNull(userList2);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
    }

    @Test
    public void test2029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2029");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("data/test-users.csv");
        java.util.List<com.reservation_system.model.User> userList2 = userRepository1.getAllUsers();
        java.util.List<com.reservation_system.model.User> userList3 = userRepository1.getAllUsers();
        com.reservation_system.services.AuthService authService4 = new com.reservation_system.services.AuthService(userRepository1);
        java.util.List<com.reservation_system.model.User> userList5 = userRepository1.getAllUsers();
        java.util.List<com.reservation_system.model.User> userList6 = null;
        // The following exception was thrown during execution in test generation
        try {
            userRepository1.saveAllUsers(userList6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(userList2);
        org.junit.Assert.assertNotNull(userList3);
        org.junit.Assert.assertNotNull(userList5);
    }

    @Test
    public void test2030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2030");
        com.reservation_system.model.Researcher researcher5 = new com.reservation_system.model.Researcher(98, "Password1!", "WrongPassword1!", "student", true);
        researcher5.setApproved(false);
    }

    @Test
    public void test2031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2031");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("data/test-users.csv");
        boolean boolean2 = userRepository1.headLabCoordinatorExists();
        com.reservation_system.repository.UserRepository userRepository4 = new com.reservation_system.repository.UserRepository("data/test-users.csv");
        java.util.List<com.reservation_system.model.User> userList5 = userRepository4.getAllUsers();
        java.util.List<com.reservation_system.model.User> userList6 = userRepository4.getAllUsers();
        userRepository1.saveAllUsers(userList6);
        java.util.List<com.reservation_system.model.User> userList8 = userRepository1.getAllUsers();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(userList5);
        org.junit.Assert.assertNotNull(userList6);
        org.junit.Assert.assertNotNull(userList8);
    }

    @Test
    public void test2032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2032");
        com.reservation_system.model.LabManager labManager5 = new com.reservation_system.model.LabManager(0, "student", "data/test-users.csv", "headlabcoordinator", true);
        boolean boolean6 = labManager5.isApproved();
        java.lang.String str7 = labManager5.getUserType();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "labmanager" + "'", str7, "labmanager");
    }

    @Test
    public void test2033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2033");
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
        com.reservation_system.repository.UserRepository userRepository73 = new com.reservation_system.repository.UserRepository("data/test-users.csv");
        java.util.List<com.reservation_system.model.User> userList74 = userRepository73.getAllUsers();
        com.reservation_system.services.AuthService authService75 = new com.reservation_system.services.AuthService(userRepository73);
        java.util.Optional<com.reservation_system.model.User> userOptional77 = userRepository73.findByEmail("");
        int int78 = userRepository73.getNextID();
        com.reservation_system.services.AuthService authService79 = new com.reservation_system.services.AuthService(userRepository73);
        com.reservation_system.repository.UserRepository userRepository81 = new com.reservation_system.repository.UserRepository("data/test-users.csv");
        boolean boolean82 = userRepository81.headLabCoordinatorExists();
        com.reservation_system.repository.UserRepository userRepository84 = new com.reservation_system.repository.UserRepository("data/test-users.csv");
        java.util.List<com.reservation_system.model.User> userList85 = userRepository84.getAllUsers();
        java.util.List<com.reservation_system.model.User> userList86 = userRepository84.getAllUsers();
        userRepository81.saveAllUsers(userList86);
        userRepository73.saveAllUsers(userList86);
        userRepository1.saveAllUsers(userList86);
        int int90 = userRepository1.getNextID();
        java.util.Optional<com.reservation_system.model.User> userOptional92 = userRepository1.findByEmail("");
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
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(userList20);
        org.junit.Assert.assertNotNull(userList23);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(userOptional28);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 1 + "'", int29 == 1);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNotNull(userList33);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + true + "'", boolean41 == true);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertNotNull(userOptional53);
        org.junit.Assert.assertNotNull(userList56);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + true + "'", boolean64 == true);
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + false + "'", boolean67 == false);
        org.junit.Assert.assertNotNull(userList68);
        org.junit.Assert.assertNotNull(userList74);
        org.junit.Assert.assertNotNull(userOptional77);
        org.junit.Assert.assertTrue("'" + int78 + "' != '" + 36 + "'", int78 == 36);
        org.junit.Assert.assertTrue("'" + boolean82 + "' != '" + false + "'", boolean82 == false);
        org.junit.Assert.assertNotNull(userList85);
        org.junit.Assert.assertNotNull(userList86);
        org.junit.Assert.assertTrue("'" + int90 + "' != '" + 36 + "'", int90 == 36);
        org.junit.Assert.assertNotNull(userOptional92);
    }

    @Test
    public void test2034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2034");
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
        boolean boolean18 = userRepository1.emailExists("labmanager");
        boolean boolean20 = userRepository1.emailExists("faculty");
        com.reservation_system.repository.UserRepository userRepository22 = new com.reservation_system.repository.UserRepository("data/test-users.csv");
        java.util.List<com.reservation_system.model.User> userList23 = userRepository22.getAllUsers();
        com.reservation_system.services.AuthService authService24 = new com.reservation_system.services.AuthService(userRepository22);
        com.reservation_system.services.AuthService authService25 = new com.reservation_system.services.AuthService(userRepository22);
        boolean boolean26 = userRepository22.headLabCoordinatorExists();
        java.util.List<com.reservation_system.model.User> userList27 = userRepository22.getAllUsers();
        java.util.List<com.reservation_system.model.User> userList28 = userRepository22.getAllUsers();
        userRepository1.saveAllUsers(userList28);
        java.lang.Class<?> wildcardClass30 = userList28.getClass();
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
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(userList23);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(userList27);
        org.junit.Assert.assertNotNull(userList28);
        org.junit.Assert.assertNotNull(wildcardClass30);
    }

    @Test
    public void test2035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2035");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("data/test-users.csv");
        java.util.List<com.reservation_system.model.User> userList2 = userRepository1.getAllUsers();
        boolean boolean3 = userRepository1.headLabCoordinatorExists();
        com.reservation_system.services.AuthService authService4 = new com.reservation_system.services.AuthService(userRepository1);
        int int5 = userRepository1.getNextID();
        java.util.List<com.reservation_system.model.User> userList6 = userRepository1.getAllUsers();
        boolean boolean7 = userRepository1.headLabCoordinatorExists();
        java.util.List<com.reservation_system.model.User> userList8 = userRepository1.getAllUsers();
        int int9 = userRepository1.getNextID();
        org.junit.Assert.assertNotNull(userList2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 36 + "'", int5 == 36);
        org.junit.Assert.assertNotNull(userList6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(userList8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 36 + "'", int9 == 36);
    }

    @Test
    public void test2036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2036");
        com.reservation_system.model.HeadLabCoordinator headLabCoordinator5 = new com.reservation_system.model.HeadLabCoordinator((int) (short) 1, "headlabcoordinator", "labmanager", "", true);
        java.lang.String str6 = headLabCoordinator5.getPassword();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
    }

    @Test
    public void test2037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2037");
        com.reservation_system.model.LabManager labManager5 = new com.reservation_system.model.LabManager((int) (byte) 1, "WrongPassword1!", "Student", "researcher", true);
        boolean boolean6 = labManager5.requiresDepartmentApproval();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test2038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2038");
        com.reservation_system.model.Guest guest5 = new com.reservation_system.model.Guest((-1), "", "guest", "", true);
        java.lang.String str6 = guest5.getUserType();
        java.lang.String str7 = guest5.getUserType();
        java.lang.String str8 = guest5.getEmail();
        java.lang.String str9 = guest5.getUserType();
        java.lang.String str10 = guest5.getUserType();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Guest" + "'", str6, "Guest");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Guest" + "'", str7, "Guest");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "guest" + "'", str8, "guest");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Guest" + "'", str9, "Guest");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Guest" + "'", str10, "Guest");
    }

    @Test
    public void test2039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2039");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("data/test-users.csv");
        java.util.List<com.reservation_system.model.User> userList2 = userRepository1.getAllUsers();
        boolean boolean4 = userRepository1.emailExists("Researcher");
        boolean boolean5 = userRepository1.headLabCoordinatorExists();
        org.junit.Assert.assertNotNull(userList2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test2040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2040");
        com.reservation_system.model.Faculty faculty5 = new com.reservation_system.model.Faculty((int) (byte) 10, "guest", "labmanager", "Password1!", true);
        faculty5.setApproved(false);
    }

    @Test
    public void test2041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2041");
        com.reservation_system.model.Faculty faculty5 = new com.reservation_system.model.Faculty((int) (short) 100, "", "headlabcoordinator", "test@example.com", true);
    }

    @Test
    public void test2042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2042");
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
        com.reservation_system.model.LabManager labManager40 = new com.reservation_system.model.LabManager((int) 'a', "Faculty", "", "", false);
        java.lang.String str41 = labManager40.getUserType();
        java.lang.String str42 = labManager40.getEmail();
        boolean boolean43 = labManager40.requiresDepartmentApproval();
        userRepository1.addUser((com.reservation_system.model.User) labManager40);
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
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 53 + "'", int26 == 53);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "headlabcoordinator" + "'", str33, "headlabcoordinator");
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "labmanager" + "'", str41, "labmanager");
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "" + "'", str42, "");
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
    }

    @Test
    public void test2043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2043");
        com.reservation_system.model.Student student5 = new com.reservation_system.model.Student(0, "Andrew", "headlabcoordinator", "WrongPassword1!", false);
    }

    @Test
    public void test2044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2044");
        com.reservation_system.model.Researcher researcher5 = new com.reservation_system.model.Researcher(0, "headlabcoordinator", "Student", "student", true);
        java.lang.String str6 = researcher5.getUserType();
        boolean boolean7 = researcher5.requiresDepartmentApproval();
        java.lang.String str8 = researcher5.getUserType();
        boolean boolean9 = researcher5.isApproved();
        java.lang.String str10 = researcher5.getUserType();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Researcher" + "'", str6, "Researcher");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Researcher" + "'", str8, "Researcher");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Researcher" + "'", str10, "Researcher");
    }

    @Test
    public void test2045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2045");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("data/test-users.csv");
        java.util.List<com.reservation_system.model.User> userList2 = userRepository1.getAllUsers();
        com.reservation_system.services.AuthService authService3 = new com.reservation_system.services.AuthService(userRepository1);
        com.reservation_system.model.LabManager labManager9 = new com.reservation_system.model.LabManager((int) (short) 0, "", "student", "Andrew", true);
        boolean boolean10 = labManager9.isApproved();
        userRepository1.addUser((com.reservation_system.model.User) labManager9);
        boolean boolean13 = userRepository1.emailExists("Researcher");
        com.reservation_system.services.AuthService authService14 = new com.reservation_system.services.AuthService(userRepository1);
        org.junit.Assert.assertNotNull(userList2);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test2046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2046");
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
        com.reservation_system.services.AuthService authService18 = new com.reservation_system.services.AuthService(userRepository1);
        boolean boolean20 = userRepository1.emailExists("Guest");
        org.junit.Assert.assertNotNull(userList2);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(userList14);
        org.junit.Assert.assertNotNull(userList15);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
    }

    @Test
    public void test2047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2047");
        com.reservation_system.model.Guest guest5 = new com.reservation_system.model.Guest(1, "Guest", "Password1!", "Password1!", true);
        java.lang.String str6 = guest5.getPassword();
        java.lang.String str7 = guest5.getName();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Password1!" + "'", str6, "Password1!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Guest" + "'", str7, "Guest");
    }

    @Test
    public void test2048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2048");
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
        com.reservation_system.services.AuthService authService19 = new com.reservation_system.services.AuthService(userRepository1);
        org.junit.Assert.assertNotNull(userList2);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(userList14);
        org.junit.Assert.assertNotNull(userList15);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test2049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2049");
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
        boolean boolean39 = userRepository1.headLabCoordinatorExists();
        int int40 = userRepository1.getNextID();
        org.junit.Assert.assertNotNull(userList2);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(userList23);
        org.junit.Assert.assertNotNull(userList26);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 101 + "'", int28 == 101);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertNotNull(userList32);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertNotNull(userList35);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 101 + "'", int40 == 101);
    }

    @Test
    public void test2050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2050");
        com.reservation_system.model.User user6 = com.reservation_system.patterns.factory.UserFactory.createUser("Faculty", (int) (short) 10, "data/test-users.csv", "faculty", "Guest", true);
        user6.setApproved(false);
        org.junit.Assert.assertNotNull(user6);
    }

    @Test
    public void test2051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2051");
        com.reservation_system.model.Student student5 = new com.reservation_system.model.Student((int) (byte) 0, "headlabcoordinator", "", "test@example.com", true);
        java.lang.String str6 = student5.getUserType();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Student" + "'", str6, "Student");
    }

    @Test
    public void test2052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2052");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("data/test-users.csv");
        java.util.List<com.reservation_system.model.User> userList2 = userRepository1.getAllUsers();
        com.reservation_system.services.AuthService authService3 = new com.reservation_system.services.AuthService(userRepository1);
        com.reservation_system.model.LabManager labManager9 = new com.reservation_system.model.LabManager((int) (short) 0, "", "student", "Andrew", true);
        boolean boolean10 = labManager9.isApproved();
        userRepository1.addUser((com.reservation_system.model.User) labManager9);
        com.reservation_system.services.AuthService authService12 = new com.reservation_system.services.AuthService(userRepository1);
        // The following exception was thrown during execution in test generation
        try {
            com.reservation_system.model.User user15 = authService12.login("hi!", "faculty");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: No user found with that email.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(userList2);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test2053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2053");
        com.reservation_system.model.Faculty faculty5 = new com.reservation_system.model.Faculty(99, "headlabcoordinator", "data/test-users.csv", "labmanager", false);
        int int6 = faculty5.getID();
        java.lang.String str7 = faculty5.getName();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 99 + "'", int6 == 99);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "headlabcoordinator" + "'", str7, "headlabcoordinator");
    }

    @Test
    public void test2054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2054");
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
        boolean boolean21 = userRepository1.emailExists("Researcher");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 101 + "'", int3 == 101);
        org.junit.Assert.assertNotNull(userList6);
        org.junit.Assert.assertNotNull(userList7);
        org.junit.Assert.assertNotNull(userList10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(userList14);
        org.junit.Assert.assertNotNull(userList15);
        org.junit.Assert.assertNotNull(userList18);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    }

    @Test
    public void test2055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2055");
        com.reservation_system.model.HeadLabCoordinator headLabCoordinator5 = new com.reservation_system.model.HeadLabCoordinator((int) 'a', "student", "headlabcoordinator", "data/test-users.csv", false);
        java.lang.String str6 = headLabCoordinator5.getUserType();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "headlabcoordinator" + "'", str6, "headlabcoordinator");
    }

    @Test
    public void test2056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2056");
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
        com.reservation_system.repository.UserRepository userRepository25 = new com.reservation_system.repository.UserRepository("data/test-users.csv");
        java.util.List<com.reservation_system.model.User> userList26 = userRepository25.getAllUsers();
        com.reservation_system.services.AuthService authService27 = new com.reservation_system.services.AuthService(userRepository25);
        com.reservation_system.services.AuthService authService28 = new com.reservation_system.services.AuthService(userRepository25);
        boolean boolean29 = userRepository25.headLabCoordinatorExists();
        java.util.List<com.reservation_system.model.User> userList30 = userRepository25.getAllUsers();
        java.util.List<com.reservation_system.model.User> userList31 = userRepository25.getAllUsers();
        java.util.List<com.reservation_system.model.User> userList32 = userRepository25.getAllUsers();
        userRepository1.saveAllUsers(userList32);
        org.junit.Assert.assertNotNull(userList2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(userList6);
        org.junit.Assert.assertNotNull(userList7);
        org.junit.Assert.assertNotNull(userList11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(userList14);
        org.junit.Assert.assertNotNull(userList26);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertNotNull(userList30);
        org.junit.Assert.assertNotNull(userList31);
        org.junit.Assert.assertNotNull(userList32);
    }

    @Test
    public void test2057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2057");
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
        com.reservation_system.services.AuthService authService15 = new com.reservation_system.services.AuthService(userRepository1);
        com.reservation_system.services.AuthService authService16 = new com.reservation_system.services.AuthService(userRepository1);
        // The following exception was thrown during execution in test generation
        try {
            com.reservation_system.model.User user19 = authService16.login("hi!", "headlabcoordinator");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: No user found with that email.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(userList2);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 101 + "'", int9 == 101);
        org.junit.Assert.assertNotNull(userList10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 101 + "'", int12 == 101);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test2058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2058");
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
        com.reservation_system.services.AuthService authService87 = new com.reservation_system.services.AuthService(userRepository1);
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
    }

    @Test
    public void test2059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2059");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("data/test-users.csv");
        java.util.List<com.reservation_system.model.User> userList2 = userRepository1.getAllUsers();
        com.reservation_system.services.AuthService authService3 = new com.reservation_system.services.AuthService(userRepository1);
        com.reservation_system.services.AuthService authService4 = new com.reservation_system.services.AuthService(userRepository1);
        com.reservation_system.services.AuthService authService5 = new com.reservation_system.services.AuthService(userRepository1);
        java.util.List<com.reservation_system.model.User> userList6 = userRepository1.getAllUsers();
        com.reservation_system.model.Faculty faculty12 = new com.reservation_system.model.Faculty(100, "", "labmanager", "Guest", true);
        boolean boolean13 = faculty12.isApproved();
        userRepository1.addUser((com.reservation_system.model.User) faculty12);
        java.util.Optional<com.reservation_system.model.User> userOptional16 = userRepository1.findByEmail("Guest");
        com.reservation_system.model.LabManager labManager22 = new com.reservation_system.model.LabManager((-1), "guest", "researcher", "Faculty", true);
        userRepository1.addUser((com.reservation_system.model.User) labManager22);
        org.junit.Assert.assertNotNull(userList2);
        org.junit.Assert.assertNotNull(userList6);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(userOptional16);
    }

    @Test
    public void test2060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2060");
        com.reservation_system.model.Researcher researcher5 = new com.reservation_system.model.Researcher(101, "", "Password1!", "guest", true);
        researcher5.setApproved(true);
        int int8 = researcher5.getID();
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 101 + "'", int8 == 101);
    }

    @Test
    public void test2061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2061");
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
        java.util.List<com.reservation_system.model.User> userList22 = userRepository1.getAllUsers();
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
        org.junit.Assert.assertNotNull(userList22);
    }

    @Test
    public void test2062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2062");
        com.reservation_system.model.Guest guest5 = new com.reservation_system.model.Guest((-1), "", "Guest", "guest", true);
    }

    @Test
    public void test2063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2063");
        com.reservation_system.model.Student student5 = new com.reservation_system.model.Student(0, "labmanager", "WrongPassword1!", "labmanager", false);
        java.lang.String str6 = student5.getUserType();
        java.lang.String str7 = student5.getEmail();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Student" + "'", str6, "Student");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "WrongPassword1!" + "'", str7, "WrongPassword1!");
    }

    @Test
    public void test2064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2064");
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
        java.lang.Class<?> wildcardClass15 = userList14.getClass();
        org.junit.Assert.assertNotNull(userList2);
        org.junit.Assert.assertNotNull(userList3);
        org.junit.Assert.assertNotNull(userList6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(userList10);
        org.junit.Assert.assertNotNull(userList11);
        org.junit.Assert.assertNotNull(userList14);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test2065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2065");
        com.reservation_system.model.User user6 = com.reservation_system.patterns.factory.UserFactory.createUser("Researcher", 0, "Faculty", "Andrew", "Faculty", false);
        org.junit.Assert.assertNotNull(user6);
    }

    @Test
    public void test2066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2066");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("data/test-users.csv");
        java.util.List<com.reservation_system.model.User> userList2 = userRepository1.getAllUsers();
        boolean boolean3 = userRepository1.headLabCoordinatorExists();
        boolean boolean5 = userRepository1.emailExists("hi!");
        boolean boolean7 = userRepository1.emailExists("student");
        int int8 = userRepository1.getNextID();
        com.reservation_system.services.AuthService authService9 = new com.reservation_system.services.AuthService(userRepository1);
        org.junit.Assert.assertNotNull(userList2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 101 + "'", int8 == 101);
    }

    @Test
    public void test2067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2067");
        com.reservation_system.model.Faculty faculty5 = new com.reservation_system.model.Faculty((int) (short) -1, "Student", "Andrew", "Researcher", false);
    }

    @Test
    public void test2068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2068");
        com.reservation_system.model.HeadLabCoordinator headLabCoordinator5 = new com.reservation_system.model.HeadLabCoordinator((-1), "Password1!", "data/test-users.csv", "Andrew", true);
    }

    @Test
    public void test2069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2069");
        com.reservation_system.model.Researcher researcher5 = new com.reservation_system.model.Researcher(32, "Researcher", "test@example.com", "Password1!", true);
    }

    @Test
    public void test2070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2070");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("data/test-users.csv");
        java.util.List<com.reservation_system.model.User> userList2 = userRepository1.getAllUsers();
        java.util.List<com.reservation_system.model.User> userList3 = userRepository1.getAllUsers();
        com.reservation_system.services.AuthService authService4 = new com.reservation_system.services.AuthService(userRepository1);
        java.util.Optional<com.reservation_system.model.User> userOptional6 = userRepository1.findByEmail("faculty");
        com.reservation_system.services.AuthService authService7 = new com.reservation_system.services.AuthService(userRepository1);
        java.util.Optional<com.reservation_system.model.User> userOptional9 = userRepository1.findByEmail("student");
        java.util.Optional<com.reservation_system.model.User> userOptional11 = userRepository1.findByEmail("guest");
        boolean boolean13 = userRepository1.emailExists("Guest");
        org.junit.Assert.assertNotNull(userList2);
        org.junit.Assert.assertNotNull(userList3);
        org.junit.Assert.assertNotNull(userOptional6);
        org.junit.Assert.assertNotNull(userOptional9);
        org.junit.Assert.assertNotNull(userOptional11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test2071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2071");
        com.reservation_system.model.Faculty faculty5 = new com.reservation_system.model.Faculty((int) (byte) 0, "", "Researcher", "hi!", false);
    }

    @Test
    public void test2072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2072");
        com.reservation_system.model.Researcher researcher5 = new com.reservation_system.model.Researcher(101, "faculty", "", "WrongPassword1!", false);
    }

    @Test
    public void test2073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2073");
        com.reservation_system.model.Researcher researcher5 = new com.reservation_system.model.Researcher((int) '4', "test@example.com", "faculty", "test@example.com", false);
    }

    @Test
    public void test2074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2074");
        com.reservation_system.model.Faculty faculty5 = new com.reservation_system.model.Faculty(0, "data/test-users.csv", "student", "labmanager", true);
        java.lang.String str6 = faculty5.getUserType();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Faculty" + "'", str6, "Faculty");
    }

    @Test
    public void test2075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2075");
        com.reservation_system.model.Faculty faculty5 = new com.reservation_system.model.Faculty(102, "Student", "faculty", "labmanager", false);
    }

    @Test
    public void test2076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2076");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("data/test-users.csv");
        java.util.List<com.reservation_system.model.User> userList2 = userRepository1.getAllUsers();
        com.reservation_system.services.AuthService authService3 = new com.reservation_system.services.AuthService(userRepository1);
        com.reservation_system.services.AuthService authService4 = new com.reservation_system.services.AuthService(userRepository1);
        com.reservation_system.services.AuthService authService5 = new com.reservation_system.services.AuthService(userRepository1);
        boolean boolean7 = userRepository1.emailExists("researcher");
        com.reservation_system.services.AuthService authService8 = new com.reservation_system.services.AuthService(userRepository1);
        // The following exception was thrown during execution in test generation
        try {
            com.reservation_system.model.User user11 = authService8.login("WrongPassword1!", "Researcher");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: No user found with that email.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(userList2);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test2077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2077");
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
        boolean boolean93 = userRepository1.emailExists("hi!");
        java.util.List<com.reservation_system.model.User> userList94 = userRepository1.getAllUsers();
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
        org.junit.Assert.assertTrue("'" + boolean93 + "' != '" + true + "'", boolean93 == true);
        org.junit.Assert.assertNotNull(userList94);
    }

    @Test
    public void test2078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2078");
        com.reservation_system.model.Researcher researcher5 = new com.reservation_system.model.Researcher((int) '#', "test@example.com", "researcher", "headlabcoordinator", true);
        java.lang.String str6 = researcher5.getPassword();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "headlabcoordinator" + "'", str6, "headlabcoordinator");
    }

    @Test
    public void test2079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2079");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("data/test-users.csv");
        boolean boolean2 = userRepository1.headLabCoordinatorExists();
        com.reservation_system.model.Faculty faculty8 = new com.reservation_system.model.Faculty(0, "headlabcoordinator", "student", "labmanager", false);
        userRepository1.addUser((com.reservation_system.model.User) faculty8);
        boolean boolean10 = faculty8.requiresDepartmentApproval();
        boolean boolean11 = faculty8.requiresDepartmentApproval();
        java.lang.Class<?> wildcardClass12 = faculty8.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test2080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2080");
        com.reservation_system.model.LabManager labManager5 = new com.reservation_system.model.LabManager((-1), "guest", "researcher", "Faculty", true);
        labManager5.setApproved(true);
        java.lang.String str8 = labManager5.getUserType();
        java.lang.String str9 = labManager5.getUserType();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "labmanager" + "'", str8, "labmanager");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "labmanager" + "'", str9, "labmanager");
    }

    @Test
    public void test2081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2081");
        com.reservation_system.model.HeadLabCoordinator headLabCoordinator5 = new com.reservation_system.model.HeadLabCoordinator((-1), "student", "faculty", "labmanager", true);
        java.lang.String str6 = headLabCoordinator5.getUserType();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "headlabcoordinator" + "'", str6, "headlabcoordinator");
    }

    @Test
    public void test2082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2082");
        com.reservation_system.model.Researcher researcher5 = new com.reservation_system.model.Researcher(99, "faculty", "researcher", "Student", true);
    }

    @Test
    public void test2083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2083");
        com.reservation_system.model.Guest guest5 = new com.reservation_system.model.Guest(99, "Guest", "data/test-users.csv", "Andrew", true);
    }

    @Test
    public void test2084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2084");
        com.reservation_system.model.Researcher researcher5 = new com.reservation_system.model.Researcher(98, "", "Guest", "WrongPassword1!", true);
        java.lang.String str6 = researcher5.getUserType();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Researcher" + "'", str6, "Researcher");
    }

    @Test
    public void test2085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2085");
        com.reservation_system.model.Researcher researcher5 = new com.reservation_system.model.Researcher((int) (byte) 10, "researcher", "Researcher", "", false);
        java.lang.String str6 = researcher5.getUserType();
        java.lang.String str7 = researcher5.getUserType();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Researcher" + "'", str6, "Researcher");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Researcher" + "'", str7, "Researcher");
    }

    @Test
    public void test2086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2086");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("data/test-users.csv");
        java.util.List<com.reservation_system.model.User> userList2 = userRepository1.getAllUsers();
        boolean boolean3 = userRepository1.headLabCoordinatorExists();
        boolean boolean4 = userRepository1.headLabCoordinatorExists();
        java.util.List<com.reservation_system.model.User> userList5 = userRepository1.getAllUsers();
        int int6 = userRepository1.getNextID();
        com.reservation_system.services.AuthService authService7 = new com.reservation_system.services.AuthService(userRepository1);
        // The following exception was thrown during execution in test generation
        try {
            com.reservation_system.model.User user10 = authService7.login("researcher", "Andrew");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: No user found with that email.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(userList2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(userList5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 98 + "'", int6 == 98);
    }

    @Test
    public void test2087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2087");
        com.reservation_system.model.Researcher researcher5 = new com.reservation_system.model.Researcher(100, "hi!", "faculty", "hi!", false);
    }

    @Test
    public void test2088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2088");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("data/test-users.csv");
        java.util.List<com.reservation_system.model.User> userList2 = userRepository1.getAllUsers();
        boolean boolean3 = userRepository1.headLabCoordinatorExists();
        boolean boolean4 = userRepository1.headLabCoordinatorExists();
        com.reservation_system.model.HeadLabCoordinator headLabCoordinator10 = new com.reservation_system.model.HeadLabCoordinator(1, "faculty", "Faculty", "", true);
        userRepository1.addUser((com.reservation_system.model.User) headLabCoordinator10);
        java.util.Optional<com.reservation_system.model.User> userOptional13 = userRepository1.findByEmail("Faculty");
        java.util.Optional<com.reservation_system.model.User> userOptional15 = userRepository1.findByEmail("hi!");
        com.reservation_system.repository.UserRepository userRepository17 = new com.reservation_system.repository.UserRepository("data/test-users.csv");
        java.util.List<com.reservation_system.model.User> userList18 = userRepository17.getAllUsers();
        com.reservation_system.services.AuthService authService19 = new com.reservation_system.services.AuthService(userRepository17);
        com.reservation_system.model.LabManager labManager25 = new com.reservation_system.model.LabManager((int) (short) 0, "", "student", "Andrew", true);
        boolean boolean26 = labManager25.isApproved();
        userRepository17.addUser((com.reservation_system.model.User) labManager25);
        java.lang.String str28 = labManager25.getUserType();
        userRepository1.addUser((com.reservation_system.model.User) labManager25);
        com.reservation_system.services.AuthService authService30 = new com.reservation_system.services.AuthService(userRepository1);
        org.junit.Assert.assertNotNull(userList2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(userOptional13);
        org.junit.Assert.assertNotNull(userOptional15);
        org.junit.Assert.assertNotNull(userList18);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "labmanager" + "'", str28, "labmanager");
    }

    @Test
    public void test2089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2089");
        com.reservation_system.model.Researcher researcher5 = new com.reservation_system.model.Researcher(0, "headlabcoordinator", "", "labmanager", false);
        java.lang.String str6 = researcher5.getEmail();
        java.lang.String str7 = researcher5.getUserType();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Researcher" + "'", str7, "Researcher");
    }

    @Test
    public void test2090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2090");
        com.reservation_system.model.HeadLabCoordinator headLabCoordinator5 = new com.reservation_system.model.HeadLabCoordinator((int) (byte) -1, "student", "", "Guest", false);
        java.lang.String str6 = headLabCoordinator5.getUserType();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "headlabcoordinator" + "'", str6, "headlabcoordinator");
    }

    @Test
    public void test2091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2091");
        com.reservation_system.model.Guest guest5 = new com.reservation_system.model.Guest((int) (short) 10, "Password1!", "faculty", "Student", true);
        java.lang.String str6 = guest5.getUserType();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Guest" + "'", str6, "Guest");
    }

    @Test
    public void test2092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2092");
        com.reservation_system.model.LabManager labManager5 = new com.reservation_system.model.LabManager((int) (short) 10, "Faculty", "headlabcoordinator", "Student", true);
        labManager5.setApproved(false);
    }

    @Test
    public void test2093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2093");
        com.reservation_system.model.LabManager labManager5 = new com.reservation_system.model.LabManager((int) 'a', "Faculty", "", "", false);
        labManager5.setApproved(false);
        int int8 = labManager5.getID();
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 97 + "'", int8 == 97);
    }

    @Test
    public void test2094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2094");
        com.reservation_system.model.HeadLabCoordinator headLabCoordinator5 = new com.reservation_system.model.HeadLabCoordinator(98, "WrongPassword1!", "researcher", "labmanager", true);
    }

    @Test
    public void test2095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2095");
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
        com.reservation_system.model.HeadLabCoordinator headLabCoordinator30 = new com.reservation_system.model.HeadLabCoordinator(101, "Researcher", "Researcher", "faculty", true);
        userRepository1.addUser((com.reservation_system.model.User) headLabCoordinator30);
        org.junit.Assert.assertNotNull(userList2);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(userOptional22);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
    }

    @Test
    public void test2096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2096");
        com.reservation_system.model.LabManager labManager5 = new com.reservation_system.model.LabManager(36, "data/test-users.csv", "headlabcoordinator", "WrongPassword1!", true);
        boolean boolean6 = labManager5.isApproved();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test2097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2097");
        com.reservation_system.model.Researcher researcher5 = new com.reservation_system.model.Researcher((int) (short) 1, "researcher", "", "", false);
        int int6 = researcher5.getID();
        java.lang.String str7 = researcher5.getUserType();
        java.lang.String str8 = researcher5.getEmail();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Researcher" + "'", str7, "Researcher");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test2098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2098");
        com.reservation_system.model.HeadLabCoordinator headLabCoordinator5 = new com.reservation_system.model.HeadLabCoordinator((int) (byte) 0, "test@example.com", "", "test@example.com", true);
        java.lang.String str6 = headLabCoordinator5.getUserType();
        java.lang.String str7 = headLabCoordinator5.getName();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "headlabcoordinator" + "'", str6, "headlabcoordinator");
    }

    @Test
    public void test2099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2099");
        com.reservation_system.model.LabManager labManager5 = new com.reservation_system.model.LabManager((int) '4', "hi!", "labmanager", "Student", false);
        java.lang.String str6 = labManager5.getEmail();
        java.lang.String str7 = labManager5.getPassword();
        labManager5.setApproved(false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "labmanager" + "'", str6, "labmanager");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Student" + "'", str7, "Student");
    }

    @Test
    public void test2100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2100");
        com.reservation_system.model.Guest guest5 = new com.reservation_system.model.Guest((int) '#', "test@example.com", "Password1!", "test@example.com", true);
        java.lang.String str6 = guest5.getEmail();
        java.lang.String str7 = guest5.getEmail();
        java.lang.String str8 = guest5.getUserType();
        java.lang.String str9 = guest5.getEmail();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Password1!" + "'", str6, "Password1!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Password1!" + "'", str7, "Password1!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Guest" + "'", str8, "Guest");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Password1!" + "'", str9, "Password1!");
    }

    @Test
    public void test2101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2101");
        com.reservation_system.model.Guest guest5 = new com.reservation_system.model.Guest((int) '#', "test@example.com", "Password1!", "test@example.com", true);
        java.lang.String str6 = guest5.getEmail();
        java.lang.String str7 = guest5.getEmail();
        java.lang.String str8 = guest5.getUserType();
        java.lang.String str9 = guest5.getUserType();
        java.lang.String str10 = guest5.getUserType();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Password1!" + "'", str6, "Password1!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Password1!" + "'", str7, "Password1!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Guest" + "'", str8, "Guest");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Guest" + "'", str9, "Guest");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Guest" + "'", str10, "Guest");
    }

    @Test
    public void test2102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2102");
        com.reservation_system.model.Researcher researcher5 = new com.reservation_system.model.Researcher(32, "hi!", "Researcher", "data/test-users.csv", true);
    }

    @Test
    public void test2103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2103");
        com.reservation_system.model.LabManager labManager5 = new com.reservation_system.model.LabManager((int) (byte) 100, "Faculty", "Password1!", "Student", true);
        java.lang.String str6 = labManager5.getEmail();
        java.lang.String str7 = labManager5.getUserType();
        java.lang.String str8 = labManager5.getName();
        java.lang.String str9 = labManager5.getPassword();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Password1!" + "'", str6, "Password1!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "labmanager" + "'", str7, "labmanager");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Faculty" + "'", str8, "Faculty");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Student" + "'", str9, "Student");
    }

    @Test
    public void test2104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2104");
        com.reservation_system.model.HeadLabCoordinator headLabCoordinator5 = new com.reservation_system.model.HeadLabCoordinator(1, "faculty", "Faculty", "Faculty", false);
    }

    @Test
    public void test2105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2105");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("data/test-users.csv");
        java.util.List<com.reservation_system.model.User> userList2 = userRepository1.getAllUsers();
        boolean boolean3 = userRepository1.headLabCoordinatorExists();
        boolean boolean4 = userRepository1.headLabCoordinatorExists();
        boolean boolean6 = userRepository1.emailExists("Faculty");
        java.util.Optional<com.reservation_system.model.User> userOptional8 = userRepository1.findByEmail("labmanager");
        org.junit.Assert.assertNotNull(userList2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(userOptional8);
    }

    @Test
    public void test2106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2106");
        com.reservation_system.model.LabManager labManager5 = new com.reservation_system.model.LabManager((int) (byte) 0, "test@example.com", "student", "Researcher", false);
        java.lang.String str6 = labManager5.getUserType();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "labmanager" + "'", str6, "labmanager");
    }

    @Test
    public void test2107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2107");
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
        java.util.List<com.reservation_system.model.User> userList40 = userRepository1.getAllUsers();
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
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 102 + "'", int39 == 102);
        org.junit.Assert.assertNotNull(userList40);
    }

    @Test
    public void test2108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2108");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("data/test-users.csv");
        java.util.List<com.reservation_system.model.User> userList2 = userRepository1.getAllUsers();
        com.reservation_system.services.AuthService authService3 = new com.reservation_system.services.AuthService(userRepository1);
        java.util.Optional<com.reservation_system.model.User> userOptional5 = userRepository1.findByEmail("");
        java.util.List<com.reservation_system.model.User> userList6 = userRepository1.getAllUsers();
        boolean boolean8 = userRepository1.emailExists("Andrew");
        com.reservation_system.services.AuthService authService9 = new com.reservation_system.services.AuthService(userRepository1);
        com.reservation_system.repository.UserRepository userRepository11 = new com.reservation_system.repository.UserRepository("data/test-users.csv");
        java.util.List<com.reservation_system.model.User> userList12 = userRepository11.getAllUsers();
        java.util.List<com.reservation_system.model.User> userList13 = userRepository11.getAllUsers();
        com.reservation_system.repository.UserRepository userRepository15 = new com.reservation_system.repository.UserRepository("data/test-users.csv");
        java.util.List<com.reservation_system.model.User> userList16 = userRepository15.getAllUsers();
        boolean boolean17 = userRepository15.headLabCoordinatorExists();
        com.reservation_system.repository.UserRepository userRepository19 = new com.reservation_system.repository.UserRepository("data/test-users.csv");
        java.util.List<com.reservation_system.model.User> userList20 = userRepository19.getAllUsers();
        java.util.List<com.reservation_system.model.User> userList21 = userRepository19.getAllUsers();
        userRepository15.saveAllUsers(userList21);
        userRepository11.saveAllUsers(userList21);
        com.reservation_system.services.AuthService authService24 = new com.reservation_system.services.AuthService(userRepository11);
        int int25 = userRepository11.getNextID();
        com.reservation_system.repository.UserRepository userRepository27 = new com.reservation_system.repository.UserRepository("data/test-users.csv");
        java.util.List<com.reservation_system.model.User> userList28 = userRepository27.getAllUsers();
        com.reservation_system.services.AuthService authService29 = new com.reservation_system.services.AuthService(userRepository27);
        com.reservation_system.model.LabManager labManager35 = new com.reservation_system.model.LabManager((int) (short) 0, "", "student", "Andrew", true);
        boolean boolean36 = labManager35.isApproved();
        userRepository27.addUser((com.reservation_system.model.User) labManager35);
        com.reservation_system.repository.UserRepository userRepository39 = new com.reservation_system.repository.UserRepository("data/test-users.csv");
        java.util.List<com.reservation_system.model.User> userList40 = userRepository39.getAllUsers();
        java.util.List<com.reservation_system.model.User> userList41 = userRepository39.getAllUsers();
        userRepository27.saveAllUsers(userList41);
        userRepository11.saveAllUsers(userList41);
        com.reservation_system.repository.UserRepository userRepository45 = new com.reservation_system.repository.UserRepository("data/test-users.csv");
        java.util.List<com.reservation_system.model.User> userList46 = userRepository45.getAllUsers();
        com.reservation_system.services.AuthService authService47 = new com.reservation_system.services.AuthService(userRepository45);
        int int48 = userRepository45.getNextID();
        boolean boolean49 = userRepository45.headLabCoordinatorExists();
        com.reservation_system.repository.UserRepository userRepository51 = new com.reservation_system.repository.UserRepository("data/test-users.csv");
        java.util.List<com.reservation_system.model.User> userList52 = userRepository51.getAllUsers();
        boolean boolean53 = userRepository51.headLabCoordinatorExists();
        boolean boolean54 = userRepository51.headLabCoordinatorExists();
        java.util.List<com.reservation_system.model.User> userList55 = userRepository51.getAllUsers();
        userRepository45.saveAllUsers(userList55);
        java.util.Optional<com.reservation_system.model.User> userOptional58 = userRepository45.findByEmail("guest");
        java.util.List<com.reservation_system.model.User> userList59 = userRepository45.getAllUsers();
        userRepository11.saveAllUsers(userList59);
        userRepository1.saveAllUsers(userList59);
        org.junit.Assert.assertNotNull(userList2);
        org.junit.Assert.assertNotNull(userOptional5);
        org.junit.Assert.assertNotNull(userList6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(userList12);
        org.junit.Assert.assertNotNull(userList13);
        org.junit.Assert.assertNotNull(userList16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNotNull(userList20);
        org.junit.Assert.assertNotNull(userList21);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 102 + "'", int25 == 102);
        org.junit.Assert.assertNotNull(userList28);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertNotNull(userList40);
        org.junit.Assert.assertNotNull(userList41);
        org.junit.Assert.assertNotNull(userList46);
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 102 + "'", int48 == 102);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + true + "'", boolean49 == true);
        org.junit.Assert.assertNotNull(userList52);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + true + "'", boolean53 == true);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + true + "'", boolean54 == true);
        org.junit.Assert.assertNotNull(userList55);
        org.junit.Assert.assertNotNull(userOptional58);
        org.junit.Assert.assertNotNull(userList59);
    }

    @Test
    public void test2109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2109");
        com.reservation_system.model.Student student5 = new com.reservation_system.model.Student((int) (byte) 0, "Password1!", "Faculty", "Student", true);
        java.lang.String str6 = student5.getUserType();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Student" + "'", str6, "Student");
    }

    @Test
    public void test2110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2110");
        com.reservation_system.model.Researcher researcher5 = new com.reservation_system.model.Researcher(32, "", "student", "Andrew", true);
    }

    @Test
    public void test2111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2111");
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
        int int35 = userRepository1.getNextID();
        org.junit.Assert.assertNotNull(userList2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 102 + "'", int4 == 102);
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
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 102 + "'", int35 == 102);
    }

    @Test
    public void test2112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2112");
        com.reservation_system.model.Student student5 = new com.reservation_system.model.Student((int) ' ', "student", "Researcher", "faculty", false);
        java.lang.String str6 = student5.getName();
        java.lang.String str7 = student5.getUserType();
        java.lang.Class<?> wildcardClass8 = student5.getClass();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "student" + "'", str6, "student");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Student" + "'", str7, "Student");
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test2113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2113");
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
        java.util.List<com.reservation_system.model.User> userList13 = userRepository1.getAllUsers();
        boolean boolean15 = userRepository1.emailExists("Student");
        org.junit.Assert.assertNotNull(userList2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 102 + "'", int4 == 102);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(userList8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(userList11);
        org.junit.Assert.assertNotNull(userList13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
    }

    @Test
    public void test2114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2114");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("data/test-users.csv");
        java.util.List<com.reservation_system.model.User> userList2 = userRepository1.getAllUsers();
        java.util.List<com.reservation_system.model.User> userList3 = userRepository1.getAllUsers();
        com.reservation_system.services.AuthService authService4 = new com.reservation_system.services.AuthService(userRepository1);
        java.util.Optional<com.reservation_system.model.User> userOptional6 = userRepository1.findByEmail("faculty");
        boolean boolean7 = userRepository1.headLabCoordinatorExists();
        java.util.List<com.reservation_system.model.User> userList8 = userRepository1.getAllUsers();
        boolean boolean10 = userRepository1.emailExists("test@example.com");
        boolean boolean12 = userRepository1.emailExists("hi!");
        com.reservation_system.repository.UserRepository userRepository14 = new com.reservation_system.repository.UserRepository("data/test-users.csv");
        java.util.List<com.reservation_system.model.User> userList15 = userRepository14.getAllUsers();
        java.util.List<com.reservation_system.model.User> userList16 = userRepository14.getAllUsers();
        com.reservation_system.repository.UserRepository userRepository18 = new com.reservation_system.repository.UserRepository("data/test-users.csv");
        java.util.List<com.reservation_system.model.User> userList19 = userRepository18.getAllUsers();
        boolean boolean20 = userRepository18.headLabCoordinatorExists();
        com.reservation_system.repository.UserRepository userRepository22 = new com.reservation_system.repository.UserRepository("data/test-users.csv");
        java.util.List<com.reservation_system.model.User> userList23 = userRepository22.getAllUsers();
        java.util.List<com.reservation_system.model.User> userList24 = userRepository22.getAllUsers();
        userRepository18.saveAllUsers(userList24);
        userRepository14.saveAllUsers(userList24);
        com.reservation_system.services.AuthService authService27 = new com.reservation_system.services.AuthService(userRepository14);
        int int28 = userRepository14.getNextID();
        com.reservation_system.repository.UserRepository userRepository30 = new com.reservation_system.repository.UserRepository("data/test-users.csv");
        java.util.List<com.reservation_system.model.User> userList31 = userRepository30.getAllUsers();
        boolean boolean32 = userRepository30.headLabCoordinatorExists();
        boolean boolean33 = userRepository30.headLabCoordinatorExists();
        java.util.List<com.reservation_system.model.User> userList34 = userRepository30.getAllUsers();
        com.reservation_system.repository.UserRepository userRepository36 = new com.reservation_system.repository.UserRepository("data/test-users.csv");
        java.util.List<com.reservation_system.model.User> userList37 = userRepository36.getAllUsers();
        java.util.List<com.reservation_system.model.User> userList38 = userRepository36.getAllUsers();
        com.reservation_system.repository.UserRepository userRepository40 = new com.reservation_system.repository.UserRepository("data/test-users.csv");
        java.util.List<com.reservation_system.model.User> userList41 = userRepository40.getAllUsers();
        boolean boolean42 = userRepository40.headLabCoordinatorExists();
        com.reservation_system.repository.UserRepository userRepository44 = new com.reservation_system.repository.UserRepository("data/test-users.csv");
        java.util.List<com.reservation_system.model.User> userList45 = userRepository44.getAllUsers();
        java.util.List<com.reservation_system.model.User> userList46 = userRepository44.getAllUsers();
        userRepository40.saveAllUsers(userList46);
        userRepository36.saveAllUsers(userList46);
        com.reservation_system.repository.UserRepository userRepository50 = new com.reservation_system.repository.UserRepository("data/test-users.csv");
        java.util.List<com.reservation_system.model.User> userList51 = userRepository50.getAllUsers();
        com.reservation_system.services.AuthService authService52 = new com.reservation_system.services.AuthService(userRepository50);
        com.reservation_system.model.LabManager labManager58 = new com.reservation_system.model.LabManager((int) (short) 0, "", "student", "Andrew", true);
        boolean boolean59 = labManager58.isApproved();
        userRepository50.addUser((com.reservation_system.model.User) labManager58);
        com.reservation_system.repository.UserRepository userRepository62 = new com.reservation_system.repository.UserRepository("data/test-users.csv");
        java.util.List<com.reservation_system.model.User> userList63 = userRepository62.getAllUsers();
        java.util.List<com.reservation_system.model.User> userList64 = userRepository62.getAllUsers();
        userRepository50.saveAllUsers(userList64);
        userRepository36.saveAllUsers(userList64);
        userRepository30.saveAllUsers(userList64);
        userRepository14.saveAllUsers(userList64);
        java.util.List<com.reservation_system.model.User> userList69 = userRepository14.getAllUsers();
        userRepository1.saveAllUsers(userList69);
        org.junit.Assert.assertNotNull(userList2);
        org.junit.Assert.assertNotNull(userList3);
        org.junit.Assert.assertNotNull(userOptional6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(userList8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(userList15);
        org.junit.Assert.assertNotNull(userList16);
        org.junit.Assert.assertNotNull(userList19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertNotNull(userList23);
        org.junit.Assert.assertNotNull(userList24);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 102 + "'", int28 == 102);
        org.junit.Assert.assertNotNull(userList31);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertNotNull(userList34);
        org.junit.Assert.assertNotNull(userList37);
        org.junit.Assert.assertNotNull(userList38);
        org.junit.Assert.assertNotNull(userList41);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + true + "'", boolean42 == true);
        org.junit.Assert.assertNotNull(userList45);
        org.junit.Assert.assertNotNull(userList46);
        org.junit.Assert.assertNotNull(userList51);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + true + "'", boolean59 == true);
        org.junit.Assert.assertNotNull(userList63);
        org.junit.Assert.assertNotNull(userList64);
        org.junit.Assert.assertNotNull(userList69);
    }

    @Test
    public void test2115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2115");
        com.reservation_system.model.Researcher researcher5 = new com.reservation_system.model.Researcher((int) (short) 1, "guest", "Password1!", "Student", false);
        int int6 = researcher5.getID();
        java.lang.Class<?> wildcardClass7 = researcher5.getClass();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test2116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2116");
        com.reservation_system.model.Guest guest5 = new com.reservation_system.model.Guest((int) '#', "test@example.com", "Password1!", "test@example.com", true);
        java.lang.String str6 = guest5.getName();
        java.lang.String str7 = guest5.getName();
        java.lang.String str8 = guest5.getUserType();
        java.lang.String str9 = guest5.getUserType();
        java.lang.String str10 = guest5.getUserType();
        java.lang.String str11 = guest5.getUserType();
        java.lang.String str12 = guest5.getUserType();
        java.lang.String str13 = guest5.getUserType();
        boolean boolean14 = guest5.isApproved();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Guest" + "'", str8, "Guest");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Guest" + "'", str9, "Guest");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Guest" + "'", str10, "Guest");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Guest" + "'", str11, "Guest");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Guest" + "'", str12, "Guest");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Guest" + "'", str13, "Guest");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test2117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2117");
        com.reservation_system.model.Guest guest5 = new com.reservation_system.model.Guest((int) (byte) -1, "Faculty", "Student", "", true);
    }

    @Test
    public void test2118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2118");
        com.reservation_system.model.Student student5 = new com.reservation_system.model.Student(0, "student", "Andrew", "guest", false);
        java.lang.String str6 = student5.getPassword();
        java.lang.String str7 = student5.getUserType();
        java.lang.String str8 = student5.getUserType();
        boolean boolean9 = student5.requiresDepartmentApproval();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "guest" + "'", str6, "guest");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Student" + "'", str7, "Student");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Student" + "'", str8, "Student");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test2119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2119");
        com.reservation_system.model.Student student5 = new com.reservation_system.model.Student((int) (byte) 1, "WrongPassword1!", "headlabcoordinator", "Student", true);
    }

    @Test
    public void test2120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2120");
        com.reservation_system.model.Student student5 = new com.reservation_system.model.Student((-1), "student", "Faculty", "hi!", true);
    }

    @Test
    public void test2121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2121");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("data/test-users.csv");
        java.util.List<com.reservation_system.model.User> userList2 = userRepository1.getAllUsers();
        boolean boolean3 = userRepository1.headLabCoordinatorExists();
        boolean boolean4 = userRepository1.headLabCoordinatorExists();
        com.reservation_system.model.HeadLabCoordinator headLabCoordinator10 = new com.reservation_system.model.HeadLabCoordinator(1, "faculty", "Faculty", "", true);
        userRepository1.addUser((com.reservation_system.model.User) headLabCoordinator10);
        java.util.Optional<com.reservation_system.model.User> userOptional13 = userRepository1.findByEmail("Faculty");
        boolean boolean15 = userRepository1.emailExists("guest");
        org.junit.Assert.assertNotNull(userList2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(userOptional13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test2122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2122");
        com.reservation_system.model.Faculty faculty5 = new com.reservation_system.model.Faculty((int) ' ', "Student", "hi!", "labmanager", true);
        boolean boolean6 = faculty5.isApproved();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test2123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2123");
        com.reservation_system.model.Student student5 = new com.reservation_system.model.Student((int) '#', "labmanager", "hi!", "student", false);
        int int6 = student5.getID();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 35 + "'", int6 == 35);
    }

    @Test
    public void test2124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2124");
        com.reservation_system.model.Student student5 = new com.reservation_system.model.Student((int) (short) 10, "labmanager", "student", "student", false);
        java.lang.String str6 = student5.getName();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "labmanager" + "'", str6, "labmanager");
    }

    @Test
    public void test2125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2125");
        com.reservation_system.model.Researcher researcher5 = new com.reservation_system.model.Researcher(102, "student", "labmanager", "faculty", false);
    }

    @Test
    public void test2126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2126");
        com.reservation_system.model.LabManager labManager5 = new com.reservation_system.model.LabManager(102, "labmanager", "Student", "Student", false);
    }

    @Test
    public void test2127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2127");
        // The following exception was thrown during execution in test generation
        try {
            com.reservation_system.model.User user6 = com.reservation_system.patterns.factory.UserFactory.createUser("WrongPassword1!", 0, "Andrew", "guest", "test@example.com", true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid user type: WrongPassword1!");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2128");
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
        java.util.List<com.reservation_system.model.User> userList13 = userRepository1.getAllUsers();
        java.util.List<com.reservation_system.model.User> userList14 = userRepository1.getAllUsers();
        org.junit.Assert.assertNotNull(userList2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 102 + "'", int4 == 102);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(userList8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(userList11);
        org.junit.Assert.assertNotNull(userList13);
        org.junit.Assert.assertNotNull(userList14);
    }

    @Test
    public void test2129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2129");
        com.reservation_system.model.Guest guest5 = new com.reservation_system.model.Guest((int) (short) 0, "test@example.com", "researcher", "Student", true);
        java.lang.String str6 = guest5.getUserType();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Guest" + "'", str6, "Guest");
    }

    @Test
    public void test2130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2130");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("data/test-users.csv");
        java.util.List<com.reservation_system.model.User> userList2 = userRepository1.getAllUsers();
        com.reservation_system.services.AuthService authService3 = new com.reservation_system.services.AuthService(userRepository1);
        com.reservation_system.services.AuthService authService4 = new com.reservation_system.services.AuthService(userRepository1);
        com.reservation_system.services.AuthService authService5 = new com.reservation_system.services.AuthService(userRepository1);
        boolean boolean7 = userRepository1.emailExists("");
        java.util.Optional<com.reservation_system.model.User> userOptional9 = userRepository1.findByEmail("student");
        org.junit.Assert.assertNotNull(userList2);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(userOptional9);
    }

    @Test
    public void test2131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2131");
        com.reservation_system.model.LabManager labManager5 = new com.reservation_system.model.LabManager(0, "", "researcher", "data/test-users.csv", false);
    }

    @Test
    public void test2132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2132");
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
        com.reservation_system.repository.UserRepository userRepository30 = new com.reservation_system.repository.UserRepository("data/test-users.csv");
        java.util.List<com.reservation_system.model.User> userList31 = userRepository30.getAllUsers();
        com.reservation_system.services.AuthService authService32 = new com.reservation_system.services.AuthService(userRepository30);
        com.reservation_system.model.LabManager labManager38 = new com.reservation_system.model.LabManager((int) (short) 0, "", "student", "Andrew", true);
        boolean boolean39 = labManager38.isApproved();
        userRepository30.addUser((com.reservation_system.model.User) labManager38);
        com.reservation_system.services.AuthService authService41 = new com.reservation_system.services.AuthService(userRepository30);
        boolean boolean43 = userRepository30.emailExists("");
        java.util.List<com.reservation_system.model.User> userList44 = userRepository30.getAllUsers();
        userRepository1.saveAllUsers(userList44);
        boolean boolean47 = userRepository1.emailExists("headlabcoordinator");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(userList5);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNotNull(userList17);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(userList27);
        org.junit.Assert.assertNotNull(userList31);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + true + "'", boolean43 == true);
        org.junit.Assert.assertNotNull(userList44);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + true + "'", boolean47 == true);
    }

    @Test
    public void test2133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2133");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("data/test-users.csv");
        java.util.List<com.reservation_system.model.User> userList2 = userRepository1.getAllUsers();
        com.reservation_system.services.AuthService authService3 = new com.reservation_system.services.AuthService(userRepository1);
        java.util.Optional<com.reservation_system.model.User> userOptional5 = userRepository1.findByEmail("");
        java.util.List<com.reservation_system.model.User> userList6 = userRepository1.getAllUsers();
        boolean boolean8 = userRepository1.emailExists("Andrew");
        boolean boolean10 = userRepository1.emailExists("headlabcoordinator");
        boolean boolean12 = userRepository1.emailExists("data/test-users.csv");
        java.util.List<com.reservation_system.model.User> userList13 = userRepository1.getAllUsers();
        org.junit.Assert.assertNotNull(userList2);
        org.junit.Assert.assertNotNull(userOptional5);
        org.junit.Assert.assertNotNull(userList6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(userList13);
    }

    @Test
    public void test2134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2134");
        com.reservation_system.model.HeadLabCoordinator headLabCoordinator5 = new com.reservation_system.model.HeadLabCoordinator(52, "", "guest", "guest", true);
        int int6 = headLabCoordinator5.getID();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 52 + "'", int6 == 52);
    }

    @Test
    public void test2135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2135");
        com.reservation_system.model.HeadLabCoordinator headLabCoordinator5 = new com.reservation_system.model.HeadLabCoordinator((int) 'a', "labmanager", "headlabcoordinator", "faculty", false);
        boolean boolean6 = headLabCoordinator5.requiresDepartmentApproval();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test2136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2136");
        com.reservation_system.model.HeadLabCoordinator headLabCoordinator5 = new com.reservation_system.model.HeadLabCoordinator(97, "data/test-users.csv", "headlabcoordinator", "student", false);
    }

    @Test
    public void test2137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2137");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("data/test-users.csv");
        java.util.List<com.reservation_system.model.User> userList2 = userRepository1.getAllUsers();
        com.reservation_system.services.AuthService authService3 = new com.reservation_system.services.AuthService(userRepository1);
        com.reservation_system.services.AuthService authService4 = new com.reservation_system.services.AuthService(userRepository1);
        com.reservation_system.services.AuthService authService5 = new com.reservation_system.services.AuthService(userRepository1);
        boolean boolean6 = userRepository1.headLabCoordinatorExists();
        boolean boolean8 = userRepository1.emailExists("Faculty");
        com.reservation_system.repository.UserRepository userRepository10 = new com.reservation_system.repository.UserRepository("data/test-users.csv");
        java.util.List<com.reservation_system.model.User> userList11 = userRepository10.getAllUsers();
        com.reservation_system.services.AuthService authService12 = new com.reservation_system.services.AuthService(userRepository10);
        int int13 = userRepository10.getNextID();
        boolean boolean14 = userRepository10.headLabCoordinatorExists();
        com.reservation_system.repository.UserRepository userRepository16 = new com.reservation_system.repository.UserRepository("data/test-users.csv");
        java.util.List<com.reservation_system.model.User> userList17 = userRepository16.getAllUsers();
        boolean boolean18 = userRepository16.headLabCoordinatorExists();
        boolean boolean19 = userRepository16.headLabCoordinatorExists();
        java.util.List<com.reservation_system.model.User> userList20 = userRepository16.getAllUsers();
        userRepository10.saveAllUsers(userList20);
        com.reservation_system.services.AuthService authService22 = new com.reservation_system.services.AuthService(userRepository10);
        com.reservation_system.model.LabManager labManager28 = new com.reservation_system.model.LabManager((int) 'a', "Guest", "Faculty", "test@example.com", false);
        userRepository10.addUser((com.reservation_system.model.User) labManager28);
        userRepository1.addUser((com.reservation_system.model.User) labManager28);
        java.lang.String str31 = labManager28.getUserType();
        org.junit.Assert.assertNotNull(userList2);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(userList11);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 102 + "'", int13 == 102);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(userList17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNotNull(userList20);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "labmanager" + "'", str31, "labmanager");
    }

    @Test
    public void test2138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2138");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("data/test-users.csv");
        java.util.List<com.reservation_system.model.User> userList2 = userRepository1.getAllUsers();
        boolean boolean3 = userRepository1.headLabCoordinatorExists();
        boolean boolean4 = userRepository1.headLabCoordinatorExists();
        java.util.List<com.reservation_system.model.User> userList5 = userRepository1.getAllUsers();
        java.util.Optional<com.reservation_system.model.User> userOptional7 = userRepository1.findByEmail("headlabcoordinator");
        com.reservation_system.services.AuthService authService8 = new com.reservation_system.services.AuthService(userRepository1);
        org.junit.Assert.assertNotNull(userList2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(userList5);
        org.junit.Assert.assertNotNull(userOptional7);
    }

    @Test
    public void test2139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2139");
        com.reservation_system.model.Researcher researcher5 = new com.reservation_system.model.Researcher((int) (byte) 0, "labmanager", "Andrew", "researcher", true);
        boolean boolean6 = researcher5.requiresDepartmentApproval();
        researcher5.setApproved(true);
        java.lang.Class<?> wildcardClass9 = researcher5.getClass();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test2140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2140");
        com.reservation_system.model.Researcher researcher5 = new com.reservation_system.model.Researcher((int) (short) -1, "headlabcoordinator", "student", "", false);
        researcher5.setApproved(false);
        java.lang.String str8 = researcher5.getUserType();
        java.lang.String str9 = researcher5.getUserType();
        java.lang.String str10 = researcher5.getUserType();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Researcher" + "'", str8, "Researcher");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Researcher" + "'", str9, "Researcher");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Researcher" + "'", str10, "Researcher");
    }

    @Test
    public void test2141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2141");
        com.reservation_system.model.Student student5 = new com.reservation_system.model.Student((int) (short) -1, "Password1!", "faculty", "faculty", true);
        java.lang.String str6 = student5.getEmail();
        java.lang.String str7 = student5.getUserType();
        int int8 = student5.getID();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "faculty" + "'", str6, "faculty");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Student" + "'", str7, "Student");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
    }

    @Test
    public void test2142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2142");
        com.reservation_system.model.HeadLabCoordinator headLabCoordinator5 = new com.reservation_system.model.HeadLabCoordinator(97, "guest", "WrongPassword1!", "researcher", true);
        java.lang.String str6 = headLabCoordinator5.getUserType();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "headlabcoordinator" + "'", str6, "headlabcoordinator");
    }

    @Test
    public void test2143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2143");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("data/test-users.csv");
        java.util.List<com.reservation_system.model.User> userList2 = userRepository1.getAllUsers();
        java.util.List<com.reservation_system.model.User> userList3 = userRepository1.getAllUsers();
        com.reservation_system.model.Faculty faculty9 = new com.reservation_system.model.Faculty(10, "data/test-users.csv", "hi!", "", false);
        java.lang.String str10 = faculty9.getUserType();
        userRepository1.addUser((com.reservation_system.model.User) faculty9);
        java.util.List<com.reservation_system.model.User> userList12 = userRepository1.getAllUsers();
        com.reservation_system.model.HeadLabCoordinator headLabCoordinator18 = new com.reservation_system.model.HeadLabCoordinator(99, "Student", "WrongPassword1!", "faculty", false);
        userRepository1.addUser((com.reservation_system.model.User) headLabCoordinator18);
        int int20 = userRepository1.getNextID();
        org.junit.Assert.assertNotNull(userList2);
        org.junit.Assert.assertNotNull(userList3);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Faculty" + "'", str10, "Faculty");
        org.junit.Assert.assertNotNull(userList12);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 102 + "'", int20 == 102);
    }

    @Test
    public void test2144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2144");
        com.reservation_system.model.Researcher researcher5 = new com.reservation_system.model.Researcher((int) (short) -1, "headlabcoordinator", "student", "", false);
        researcher5.setApproved(false);
        int int8 = researcher5.getID();
        java.lang.String str9 = researcher5.getUserType();
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Researcher" + "'", str9, "Researcher");
    }

    @Test
    public void test2145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2145");
        com.reservation_system.model.Guest guest5 = new com.reservation_system.model.Guest((int) (short) 10, "Password1!", "faculty", "Student", true);
        java.lang.String str6 = guest5.getEmail();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "faculty" + "'", str6, "faculty");
    }

    @Test
    public void test2146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2146");
        com.reservation_system.model.LabManager labManager5 = new com.reservation_system.model.LabManager(36, "test@example.com", "Student", "Password1!", true);
    }

    @Test
    public void test2147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2147");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("data/test-users.csv");
        java.util.List<com.reservation_system.model.User> userList2 = userRepository1.getAllUsers();
        com.reservation_system.services.AuthService authService3 = new com.reservation_system.services.AuthService(userRepository1);
        com.reservation_system.services.AuthService authService4 = new com.reservation_system.services.AuthService(userRepository1);
        com.reservation_system.services.AuthService authService5 = new com.reservation_system.services.AuthService(userRepository1);
        boolean boolean6 = userRepository1.headLabCoordinatorExists();
        boolean boolean7 = userRepository1.headLabCoordinatorExists();
        com.reservation_system.model.HeadLabCoordinator headLabCoordinator13 = new com.reservation_system.model.HeadLabCoordinator((int) (byte) 1, "Guest", "", "", false);
        userRepository1.addUser((com.reservation_system.model.User) headLabCoordinator13);
        boolean boolean15 = headLabCoordinator13.requiresDepartmentApproval();
        org.junit.Assert.assertNotNull(userList2);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test2148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2148");
        com.reservation_system.model.Researcher researcher5 = new com.reservation_system.model.Researcher(101, "", "Password1!", "guest", true);
        researcher5.setApproved(true);
        java.lang.String str8 = researcher5.getPassword();
        java.lang.String str9 = researcher5.getName();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "guest" + "'", str8, "guest");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test2149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2149");
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
        labManager36.setApproved(true);
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
    public void test2150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2150");
        com.reservation_system.model.Faculty faculty5 = new com.reservation_system.model.Faculty((int) ' ', "hi!", "Faculty", "", true);
    }

    @Test
    public void test2151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2151");
        com.reservation_system.model.HeadLabCoordinator headLabCoordinator5 = new com.reservation_system.model.HeadLabCoordinator((int) '4', "test@example.com", "data/test-users.csv", "", false);
        boolean boolean6 = headLabCoordinator5.isApproved();
        java.lang.String str7 = headLabCoordinator5.getName();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test2152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2152");
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
        int int25 = userRepository1.getNextID();
        com.reservation_system.model.Student student31 = new com.reservation_system.model.Student((int) (short) -1, "test@example.com", "Andrew", "labmanager", true);
        int int32 = student31.getID();
        userRepository1.addUser((com.reservation_system.model.User) student31);
        org.junit.Assert.assertNotNull(userList2);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(userOptional22);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 102 + "'", int25 == 102);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + (-1) + "'", int32 == (-1));
    }

    @Test
    public void test2153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2153");
        com.reservation_system.model.Faculty faculty5 = new com.reservation_system.model.Faculty(100, "student", "Student", "hi!", false);
    }

    @Test
    public void test2154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2154");
        com.reservation_system.model.Faculty faculty5 = new com.reservation_system.model.Faculty(10, "", "hi!", "student", true);
    }

    @Test
    public void test2155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2155");
        com.reservation_system.model.Student student5 = new com.reservation_system.model.Student((int) (byte) 100, "Password1!", "", "headlabcoordinator", false);
    }

    @Test
    public void test2156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2156");
        com.reservation_system.model.Faculty faculty5 = new com.reservation_system.model.Faculty((int) (short) 1, "Andrew", "Faculty", "Researcher", true);
    }

    @Test
    public void test2157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2157");
        com.reservation_system.model.Guest guest5 = new com.reservation_system.model.Guest(10, "WrongPassword1!", "faculty", "", true);
        java.lang.String str6 = guest5.getUserType();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Guest" + "'", str6, "Guest");
    }

    @Test
    public void test2158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2158");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("data/test-users.csv");
        java.util.List<com.reservation_system.model.User> userList2 = userRepository1.getAllUsers();
        com.reservation_system.services.AuthService authService3 = new com.reservation_system.services.AuthService(userRepository1);
        java.util.Optional<com.reservation_system.model.User> userOptional5 = userRepository1.findByEmail("");
        java.util.List<com.reservation_system.model.User> userList6 = userRepository1.getAllUsers();
        boolean boolean8 = userRepository1.emailExists("labmanager");
        com.reservation_system.services.AuthService authService9 = new com.reservation_system.services.AuthService(userRepository1);
        // The following exception was thrown during execution in test generation
        try {
            com.reservation_system.model.User user12 = authService9.login("", "Password1!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Email is required.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(userList2);
        org.junit.Assert.assertNotNull(userOptional5);
        org.junit.Assert.assertNotNull(userList6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test2159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2159");
        com.reservation_system.model.Researcher researcher5 = new com.reservation_system.model.Researcher(99, "student", "student", "test@example.com", false);
    }

    @Test
    public void test2160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2160");
        com.reservation_system.model.Student student5 = new com.reservation_system.model.Student((int) '4', "researcher", "headlabcoordinator", "Guest", true);
        java.lang.Class<?> wildcardClass6 = student5.getClass();
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test2161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2161");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("data/test-users.csv");
        java.util.List<com.reservation_system.model.User> userList2 = userRepository1.getAllUsers();
        java.util.List<com.reservation_system.model.User> userList3 = userRepository1.getAllUsers();
        com.reservation_system.services.AuthService authService4 = new com.reservation_system.services.AuthService(userRepository1);
        java.util.Optional<com.reservation_system.model.User> userOptional6 = userRepository1.findByEmail("faculty");
        int int7 = userRepository1.getNextID();
        java.util.Optional<com.reservation_system.model.User> userOptional9 = userRepository1.findByEmail("WrongPassword1!");
        boolean boolean10 = userRepository1.headLabCoordinatorExists();
        java.util.Optional<com.reservation_system.model.User> userOptional12 = userRepository1.findByEmail("headlabcoordinator");
        org.junit.Assert.assertNotNull(userList2);
        org.junit.Assert.assertNotNull(userList3);
        org.junit.Assert.assertNotNull(userOptional6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 102 + "'", int7 == 102);
        org.junit.Assert.assertNotNull(userOptional9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(userOptional12);
    }

    @Test
    public void test2162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2162");
        com.reservation_system.model.Researcher researcher5 = new com.reservation_system.model.Researcher((int) (short) -1, "researcher", "test@example.com", "Faculty", true);
        boolean boolean6 = researcher5.requiresDepartmentApproval();
        java.lang.String str7 = researcher5.getName();
        int int8 = researcher5.getID();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "researcher" + "'", str7, "researcher");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
    }

    @Test
    public void test2163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2163");
        com.reservation_system.model.Guest guest5 = new com.reservation_system.model.Guest(97, "Andrew", "student", "researcher", true);
        java.lang.String str6 = guest5.getUserType();
        java.lang.String str7 = guest5.getUserType();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Guest" + "'", str6, "Guest");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Guest" + "'", str7, "Guest");
    }

    @Test
    public void test2164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2164");
        com.reservation_system.model.Student student5 = new com.reservation_system.model.Student((int) ' ', "researcher", "data/test-users.csv", "WrongPassword1!", true);
        java.lang.String str6 = student5.getUserType();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Student" + "'", str6, "Student");
    }

    @Test
    public void test2165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2165");
        com.reservation_system.model.User user6 = com.reservation_system.patterns.factory.UserFactory.createUser("Guest", 0, "", "hi!", "Andrew", true);
        org.junit.Assert.assertNotNull(user6);
    }

    @Test
    public void test2166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2166");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("data/test-users.csv");
        java.util.List<com.reservation_system.model.User> userList2 = userRepository1.getAllUsers();
        com.reservation_system.services.AuthService authService3 = new com.reservation_system.services.AuthService(userRepository1);
        java.util.Optional<com.reservation_system.model.User> userOptional5 = userRepository1.findByEmail("");
        int int6 = userRepository1.getNextID();
        java.util.Optional<com.reservation_system.model.User> userOptional8 = userRepository1.findByEmail("data/test-users.csv");
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
        com.reservation_system.services.AuthService authService23 = new com.reservation_system.services.AuthService(userRepository10);
        com.reservation_system.model.HeadLabCoordinator headLabCoordinator29 = new com.reservation_system.model.HeadLabCoordinator(98, "headlabcoordinator", "Andrew", "guest", false);
        java.lang.String str30 = headLabCoordinator29.getUserType();
        int int31 = headLabCoordinator29.getID();
        userRepository10.addUser((com.reservation_system.model.User) headLabCoordinator29);
        com.reservation_system.repository.UserRepository userRepository34 = new com.reservation_system.repository.UserRepository("data/test-users.csv");
        java.util.List<com.reservation_system.model.User> userList35 = userRepository34.getAllUsers();
        boolean boolean36 = userRepository34.headLabCoordinatorExists();
        com.reservation_system.repository.UserRepository userRepository38 = new com.reservation_system.repository.UserRepository("data/test-users.csv");
        java.util.List<com.reservation_system.model.User> userList39 = userRepository38.getAllUsers();
        java.util.List<com.reservation_system.model.User> userList40 = userRepository38.getAllUsers();
        userRepository34.saveAllUsers(userList40);
        com.reservation_system.repository.UserRepository userRepository43 = new com.reservation_system.repository.UserRepository("data/test-users.csv");
        java.util.List<com.reservation_system.model.User> userList44 = userRepository43.getAllUsers();
        boolean boolean45 = userRepository43.headLabCoordinatorExists();
        boolean boolean46 = userRepository43.headLabCoordinatorExists();
        java.util.List<com.reservation_system.model.User> userList47 = userRepository43.getAllUsers();
        userRepository34.saveAllUsers(userList47);
        boolean boolean49 = userRepository34.headLabCoordinatorExists();
        com.reservation_system.services.AuthService authService50 = new com.reservation_system.services.AuthService(userRepository34);
        java.util.List<com.reservation_system.model.User> userList51 = userRepository34.getAllUsers();
        userRepository10.saveAllUsers(userList51);
        java.util.List<com.reservation_system.model.User> userList53 = userRepository10.getAllUsers();
        userRepository1.saveAllUsers(userList53);
        org.junit.Assert.assertNotNull(userList2);
        org.junit.Assert.assertNotNull(userOptional5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 102 + "'", int6 == 102);
        org.junit.Assert.assertNotNull(userOptional8);
        org.junit.Assert.assertNotNull(userList11);
        org.junit.Assert.assertNotNull(userList12);
        org.junit.Assert.assertNotNull(userList15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNotNull(userList19);
        org.junit.Assert.assertNotNull(userList20);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "headlabcoordinator" + "'", str30, "headlabcoordinator");
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 98 + "'", int31 == 98);
        org.junit.Assert.assertNotNull(userList35);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertNotNull(userList39);
        org.junit.Assert.assertNotNull(userList40);
        org.junit.Assert.assertNotNull(userList44);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + true + "'", boolean45 == true);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + true + "'", boolean46 == true);
        org.junit.Assert.assertNotNull(userList47);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + true + "'", boolean49 == true);
        org.junit.Assert.assertNotNull(userList51);
        org.junit.Assert.assertNotNull(userList53);
    }

    @Test
    public void test2167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2167");
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
        com.reservation_system.services.AuthService authService15 = new com.reservation_system.services.AuthService(userRepository1);
        org.junit.Assert.assertNotNull(userList2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 102 + "'", int4 == 102);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(userList8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(userList11);
        org.junit.Assert.assertNotNull(userOptional14);
    }

    @Test
    public void test2168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2168");
        com.reservation_system.model.Student student5 = new com.reservation_system.model.Student(10, "Faculty", "test@example.com", "Researcher", false);
        boolean boolean6 = student5.requiresDepartmentApproval();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test2169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2169");
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
        com.reservation_system.repository.UserRepository userRepository18 = new com.reservation_system.repository.UserRepository("data/test-users.csv");
        java.util.List<com.reservation_system.model.User> userList19 = userRepository18.getAllUsers();
        com.reservation_system.services.AuthService authService20 = new com.reservation_system.services.AuthService(userRepository18);
        int int21 = userRepository18.getNextID();
        boolean boolean22 = userRepository18.headLabCoordinatorExists();
        com.reservation_system.repository.UserRepository userRepository24 = new com.reservation_system.repository.UserRepository("data/test-users.csv");
        java.util.List<com.reservation_system.model.User> userList25 = userRepository24.getAllUsers();
        boolean boolean26 = userRepository24.headLabCoordinatorExists();
        boolean boolean27 = userRepository24.headLabCoordinatorExists();
        java.util.List<com.reservation_system.model.User> userList28 = userRepository24.getAllUsers();
        userRepository18.saveAllUsers(userList28);
        java.util.Optional<com.reservation_system.model.User> userOptional31 = userRepository18.findByEmail("guest");
        java.util.List<com.reservation_system.model.User> userList32 = userRepository18.getAllUsers();
        userRepository1.saveAllUsers(userList32);
        org.junit.Assert.assertNotNull(userList2);
        org.junit.Assert.assertNotNull(userOptional5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 102 + "'", int6 == 102);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(userList13);
        org.junit.Assert.assertNotNull(userList14);
        org.junit.Assert.assertNotNull(userList19);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 102 + "'", int21 == 102);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertNotNull(userList25);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertNotNull(userList28);
        org.junit.Assert.assertNotNull(userOptional31);
        org.junit.Assert.assertNotNull(userList32);
    }

    @Test
    public void test2170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2170");
        com.reservation_system.model.Researcher researcher5 = new com.reservation_system.model.Researcher((int) (short) 10, "Guest", "", "test@example.com", true);
        researcher5.setApproved(true);
        int int8 = researcher5.getID();
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 10 + "'", int8 == 10);
    }

    @Test
    public void test2171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2171");
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
        com.reservation_system.repository.UserRepository userRepository32 = new com.reservation_system.repository.UserRepository("data/test-users.csv");
        java.util.List<com.reservation_system.model.User> userList33 = userRepository32.getAllUsers();
        java.util.List<com.reservation_system.model.User> userList34 = userRepository32.getAllUsers();
        com.reservation_system.repository.UserRepository userRepository36 = new com.reservation_system.repository.UserRepository("data/test-users.csv");
        java.util.List<com.reservation_system.model.User> userList37 = userRepository36.getAllUsers();
        boolean boolean38 = userRepository36.headLabCoordinatorExists();
        com.reservation_system.repository.UserRepository userRepository40 = new com.reservation_system.repository.UserRepository("data/test-users.csv");
        java.util.List<com.reservation_system.model.User> userList41 = userRepository40.getAllUsers();
        java.util.List<com.reservation_system.model.User> userList42 = userRepository40.getAllUsers();
        userRepository36.saveAllUsers(userList42);
        userRepository32.saveAllUsers(userList42);
        com.reservation_system.model.Faculty faculty50 = new com.reservation_system.model.Faculty(98, "guest", "Researcher", "student", true);
        userRepository32.addUser((com.reservation_system.model.User) faculty50);
        com.reservation_system.repository.UserRepository userRepository53 = new com.reservation_system.repository.UserRepository("data/test-users.csv");
        java.util.List<com.reservation_system.model.User> userList54 = userRepository53.getAllUsers();
        java.util.List<com.reservation_system.model.User> userList55 = userRepository53.getAllUsers();
        com.reservation_system.repository.UserRepository userRepository57 = new com.reservation_system.repository.UserRepository("data/test-users.csv");
        java.util.List<com.reservation_system.model.User> userList58 = userRepository57.getAllUsers();
        boolean boolean59 = userRepository57.headLabCoordinatorExists();
        com.reservation_system.repository.UserRepository userRepository61 = new com.reservation_system.repository.UserRepository("data/test-users.csv");
        java.util.List<com.reservation_system.model.User> userList62 = userRepository61.getAllUsers();
        java.util.List<com.reservation_system.model.User> userList63 = userRepository61.getAllUsers();
        userRepository57.saveAllUsers(userList63);
        userRepository53.saveAllUsers(userList63);
        java.util.List<com.reservation_system.model.User> userList66 = userRepository53.getAllUsers();
        userRepository32.saveAllUsers(userList66);
        userRepository1.saveAllUsers(userList66);
        com.reservation_system.model.Guest guest74 = new com.reservation_system.model.Guest((int) ' ', "", "", "WrongPassword1!", true);
        userRepository1.addUser((com.reservation_system.model.User) guest74);
        java.lang.String str76 = guest74.getName();
        org.junit.Assert.assertNotNull(userList2);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(userOptional22);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 102 + "'", int23 == 102);
        org.junit.Assert.assertNotNull(userList33);
        org.junit.Assert.assertNotNull(userList34);
        org.junit.Assert.assertNotNull(userList37);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + true + "'", boolean38 == true);
        org.junit.Assert.assertNotNull(userList41);
        org.junit.Assert.assertNotNull(userList42);
        org.junit.Assert.assertNotNull(userList54);
        org.junit.Assert.assertNotNull(userList55);
        org.junit.Assert.assertNotNull(userList58);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + true + "'", boolean59 == true);
        org.junit.Assert.assertNotNull(userList62);
        org.junit.Assert.assertNotNull(userList63);
        org.junit.Assert.assertNotNull(userList66);
        org.junit.Assert.assertEquals("'" + str76 + "' != '" + "" + "'", str76, "");
    }

    @Test
    public void test2172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2172");
        com.reservation_system.model.LabManager labManager5 = new com.reservation_system.model.LabManager(0, "Faculty", "Student", "test@example.com", false);
    }

    @Test
    public void test2173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2173");
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
        int int29 = userRepository1.getNextID();
        org.junit.Assert.assertNotNull(userList2);
        org.junit.Assert.assertNotNull(userList3);
        org.junit.Assert.assertNotNull(userList7);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 102 + "'", int24 == 102);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 102 + "'", int25 == 102);
        org.junit.Assert.assertNotNull(userList26);
        org.junit.Assert.assertNotNull(userList28);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 102 + "'", int29 == 102);
    }

    @Test
    public void test2174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2174");
        com.reservation_system.model.Researcher researcher5 = new com.reservation_system.model.Researcher((int) ' ', "", "Faculty", "Faculty", true);
        java.lang.String str6 = researcher5.getUserType();
        java.lang.String str7 = researcher5.getUserType();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Researcher" + "'", str6, "Researcher");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Researcher" + "'", str7, "Researcher");
    }

    @Test
    public void test2175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2175");
        com.reservation_system.model.Researcher researcher5 = new com.reservation_system.model.Researcher((int) (short) 10, "Guest", "Andrew", "WrongPassword1!", false);
        java.lang.String str6 = researcher5.getUserType();
        java.lang.String str7 = researcher5.getName();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Researcher" + "'", str6, "Researcher");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Guest" + "'", str7, "Guest");
    }

    @Test
    public void test2176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2176");
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
        com.reservation_system.repository.UserRepository userRepository42 = new com.reservation_system.repository.UserRepository("data/test-users.csv");
        java.util.List<com.reservation_system.model.User> userList43 = userRepository42.getAllUsers();
        java.util.List<com.reservation_system.model.User> userList44 = userRepository42.getAllUsers();
        com.reservation_system.model.Faculty faculty50 = new com.reservation_system.model.Faculty(10, "data/test-users.csv", "hi!", "", false);
        java.lang.String str51 = faculty50.getUserType();
        userRepository42.addUser((com.reservation_system.model.User) faculty50);
        java.util.List<com.reservation_system.model.User> userList53 = userRepository42.getAllUsers();
        userRepository1.saveAllUsers(userList53);
        org.junit.Assert.assertNotNull(userList2);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 102 + "'", int19 == 102);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 102 + "'", int20 == 102);
        org.junit.Assert.assertNotNull(userList21);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "Researcher" + "'", str28, "Researcher");
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "Researcher" + "'", str36, "Researcher");
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "student" + "'", str38, "student");
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertNotNull(userList43);
        org.junit.Assert.assertNotNull(userList44);
        org.junit.Assert.assertEquals("'" + str51 + "' != '" + "Faculty" + "'", str51, "Faculty");
        org.junit.Assert.assertNotNull(userList53);
    }

    @Test
    public void test2177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2177");
        com.reservation_system.model.LabManager labManager5 = new com.reservation_system.model.LabManager((int) (short) 10, "headlabcoordinator", "WrongPassword1!", "test@example.com", true);
        java.lang.String str6 = labManager5.getUserType();
        java.lang.String str7 = labManager5.getUserType();
        java.lang.Class<?> wildcardClass8 = labManager5.getClass();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "labmanager" + "'", str6, "labmanager");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "labmanager" + "'", str7, "labmanager");
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test2178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2178");
        com.reservation_system.model.Faculty faculty5 = new com.reservation_system.model.Faculty(99, "Andrew", "Researcher", "hi!", false);
        java.lang.String str6 = faculty5.getEmail();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Researcher" + "'", str6, "Researcher");
    }

    @Test
    public void test2179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2179");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("data/test-users.csv");
        java.util.List<com.reservation_system.model.User> userList2 = userRepository1.getAllUsers();
        com.reservation_system.services.AuthService authService3 = new com.reservation_system.services.AuthService(userRepository1);
        com.reservation_system.model.LabManager labManager9 = new com.reservation_system.model.LabManager((int) (short) 0, "", "student", "Andrew", true);
        boolean boolean10 = labManager9.isApproved();
        userRepository1.addUser((com.reservation_system.model.User) labManager9);
        com.reservation_system.services.AuthService authService12 = new com.reservation_system.services.AuthService(userRepository1);
        boolean boolean14 = userRepository1.emailExists("");
        boolean boolean15 = userRepository1.headLabCoordinatorExists();
        java.util.Optional<com.reservation_system.model.User> userOptional17 = userRepository1.findByEmail("Student");
        java.util.Optional<com.reservation_system.model.User> userOptional19 = userRepository1.findByEmail("Researcher");
        java.util.List<com.reservation_system.model.User> userList20 = userRepository1.getAllUsers();
        org.junit.Assert.assertNotNull(userList2);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(userOptional17);
        org.junit.Assert.assertNotNull(userOptional19);
        org.junit.Assert.assertNotNull(userList20);
    }

    @Test
    public void test2180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2180");
        com.reservation_system.model.Researcher researcher5 = new com.reservation_system.model.Researcher(10, "data/test-users.csv", "Guest", "faculty", true);
        boolean boolean6 = researcher5.requiresDepartmentApproval();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test2181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2181");
        com.reservation_system.model.Faculty faculty5 = new com.reservation_system.model.Faculty(99, "Guest", "Password1!", "Faculty", true);
    }

    @Test
    public void test2182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2182");
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
        java.util.Optional<com.reservation_system.model.User> userOptional96 = userRepository1.findByEmail("Guest");
        java.util.List<com.reservation_system.model.User> userList97 = userRepository1.getAllUsers();
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
        org.junit.Assert.assertNotNull(userOptional96);
        org.junit.Assert.assertNotNull(userList97);
    }
}
