package com.reservation_system.Randoop.registrationservice;

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
        com.reservation_system.model.Researcher researcher5 = new com.reservation_system.model.Researcher((int) 'a', "headlabcoordinator", "headlabcoordinator", "Guest", true);
    }

    @Test
    public void test0502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0502");
        com.reservation_system.model.Student student5 = new com.reservation_system.model.Student((int) (short) -1, "labmanager", "", "Faculty", true);
        int int6 = student5.getID();
        java.lang.String str7 = student5.getEmail();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
    }

    @Test
    public void test0503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0503");
        com.reservation_system.model.Faculty faculty5 = new com.reservation_system.model.Faculty(0, "Password1!", "data/test-userrepo.csv", "researcher", false);
        java.lang.String str6 = faculty5.getName();
        java.lang.String str7 = faculty5.getUserType();
        java.lang.String str8 = faculty5.getEmail();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Password1!" + "'", str6, "Password1!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Faculty" + "'", str7, "Faculty");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "data/test-userrepo.csv" + "'", str8, "data/test-userrepo.csv");
    }

    @Test
    public void test0504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0504");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("data/test-userrepo.csv");
        java.util.Optional<com.reservation_system.model.User> userOptional3 = userRepository1.findByEmail("hi!");
        int int4 = userRepository1.getNextID();
        boolean boolean5 = userRepository1.headLabCoordinatorExists();
        int int6 = userRepository1.getNextID();
        com.reservation_system.model.User user7 = null;
        // The following exception was thrown during execution in test generation
        try {
            userRepository1.addUser(user7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(userOptional3);
// flaky "1) test0504(com.reservation_system.randoop.registrationservice.RegressionTest1)":         org.junit.Assert.assertTrue("'" + int4 + "' != '" + 101 + "'", int4 == 101);
// flaky "1) test0504(com.reservation_system.randoop.registrationservice.RegressionTest1)":         org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
// flaky "1) test0504(com.reservation_system.randoop.registrationservice.RegressionTest1)":         org.junit.Assert.assertTrue("'" + int6 + "' != '" + 101 + "'", int6 == 101);
    }

    @Test
    public void test0505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0505");
        com.reservation_system.model.Researcher researcher5 = new com.reservation_system.model.Researcher(102, "hi!", "Faculty", "researcher", true);
        java.lang.String str6 = researcher5.getEmail();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Faculty" + "'", str6, "Faculty");
    }

    @Test
    public void test0506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0506");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("data/test-userrepo.csv");
        java.util.Optional<com.reservation_system.model.User> userOptional3 = userRepository1.findByEmail("hi!");
        java.util.List<com.reservation_system.model.User> userList4 = userRepository1.getAllUsers();
        java.util.Optional<com.reservation_system.model.User> userOptional6 = userRepository1.findByEmail("headlabcoordinator");
        org.junit.Assert.assertNotNull(userOptional3);
        org.junit.Assert.assertNotNull(userList4);
        org.junit.Assert.assertNotNull(userOptional6);
    }

    @Test
    public void test0507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0507");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("data/test-userrepo.csv");
        java.util.Optional<com.reservation_system.model.User> userOptional3 = userRepository1.findByEmail("hi!");
        int int4 = userRepository1.getNextID();
        int int5 = userRepository1.getNextID();
        com.reservation_system.model.Researcher researcher11 = new com.reservation_system.model.Researcher((int) 'a', "student", "", "researcher", true);
        userRepository1.addUser((com.reservation_system.model.User) researcher11);
        com.reservation_system.model.Guest guest18 = new com.reservation_system.model.Guest((int) (byte) 10, "Andrew", "Student", "guest", true);
        boolean boolean19 = guest18.isApproved();
        userRepository1.addUser((com.reservation_system.model.User) guest18);
        boolean boolean22 = userRepository1.emailExists("hi!");
        org.junit.Assert.assertNotNull(userOptional3);
// flaky "2) test0507(com.reservation_system.randoop.registrationservice.RegressionTest1)":         org.junit.Assert.assertTrue("'" + int4 + "' != '" + 101 + "'", int4 == 101);
// flaky "2) test0507(com.reservation_system.randoop.registrationservice.RegressionTest1)":         org.junit.Assert.assertTrue("'" + int5 + "' != '" + 101 + "'", int5 == 101);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
// flaky "2) test0507(com.reservation_system.randoop.registrationservice.RegressionTest1)":         org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
    }

    @Test
    public void test0508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0508");
        com.reservation_system.model.HeadLabCoordinator headLabCoordinator5 = new com.reservation_system.model.HeadLabCoordinator((int) (byte) 100, "data/test-userrepo.csv", "Guest", "data/test-userrepo.csv", true);
    }

    @Test
    public void test0509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0509");
        com.reservation_system.model.HeadLabCoordinator headLabCoordinator5 = new com.reservation_system.model.HeadLabCoordinator((int) (short) 0, "", "Andrew", "andrew@example.com", true);
        int int6 = headLabCoordinator5.getID();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test0510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0510");
        com.reservation_system.model.HeadLabCoordinator headLabCoordinator5 = new com.reservation_system.model.HeadLabCoordinator(102, "faculty", "Guest", "labmanager", true);
    }

    @Test
    public void test0511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0511");
        com.reservation_system.model.Faculty faculty5 = new com.reservation_system.model.Faculty((int) '#', "Student", "student", "data/test-userrepo.csv", true);
        boolean boolean6 = faculty5.requiresDepartmentApproval();
        java.lang.String str7 = faculty5.getName();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Student" + "'", str7, "Student");
    }

    @Test
    public void test0512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0512");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("data/test-userrepo.csv");
        com.reservation_system.services.RegistrationService registrationService2 = new com.reservation_system.services.RegistrationService(userRepository1);
        com.reservation_system.model.Faculty faculty8 = new com.reservation_system.model.Faculty(0, "Password1!", "data/test-userrepo.csv", "researcher", false);
        java.lang.String str9 = faculty8.getName();
        userRepository1.addUser((com.reservation_system.model.User) faculty8);
        boolean boolean11 = userRepository1.headLabCoordinatorExists();
        com.reservation_system.services.RegistrationService registrationService12 = new com.reservation_system.services.RegistrationService(userRepository1);
        com.reservation_system.services.RegistrationService registrationService13 = new com.reservation_system.services.RegistrationService(userRepository1);
        boolean boolean14 = userRepository1.headLabCoordinatorExists();
        java.util.Optional<com.reservation_system.model.User> userOptional16 = userRepository1.findByEmail("student");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Password1!" + "'", str9, "Password1!");
// flaky "3) test0512(com.reservation_system.randoop.registrationservice.RegressionTest1)":         org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
// flaky "3) test0512(com.reservation_system.randoop.registrationservice.RegressionTest1)":         org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(userOptional16);
    }

    @Test
    public void test0513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0513");
        com.reservation_system.model.Faculty faculty5 = new com.reservation_system.model.Faculty(32, "student", "Student", "hi!", true);
        java.lang.String str6 = faculty5.getUserType();
        java.lang.Class<?> wildcardClass7 = faculty5.getClass();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Faculty" + "'", str6, "Faculty");
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0514");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("data/test-userrepo.csv");
        com.reservation_system.services.RegistrationService registrationService2 = new com.reservation_system.services.RegistrationService(userRepository1);
        com.reservation_system.model.Faculty faculty8 = new com.reservation_system.model.Faculty(0, "Password1!", "data/test-userrepo.csv", "researcher", false);
        java.lang.String str9 = faculty8.getName();
        userRepository1.addUser((com.reservation_system.model.User) faculty8);
        boolean boolean11 = userRepository1.headLabCoordinatorExists();
        com.reservation_system.services.RegistrationService registrationService12 = new com.reservation_system.services.RegistrationService(userRepository1);
        com.reservation_system.services.RegistrationService registrationService13 = new com.reservation_system.services.RegistrationService(userRepository1);
        boolean boolean14 = userRepository1.headLabCoordinatorExists();
        java.util.List<com.reservation_system.model.User> userList15 = userRepository1.getAllUsers();
        boolean boolean17 = userRepository1.emailExists("guest");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Password1!" + "'", str9, "Password1!");
// flaky "4) test0514(com.reservation_system.randoop.registrationservice.RegressionTest1)":         org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
// flaky "4) test0514(com.reservation_system.randoop.registrationservice.RegressionTest1)":         org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(userList15);
// flaky "3) test0514(com.reservation_system.randoop.registrationservice.RegressionTest1)":         org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
    }

    @Test
    public void test0515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0515");
        com.reservation_system.model.Faculty faculty5 = new com.reservation_system.model.Faculty(0, "Password1!", "data/test-userrepo.csv", "researcher", false);
        java.lang.String str6 = faculty5.getEmail();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "data/test-userrepo.csv" + "'", str6, "data/test-userrepo.csv");
    }

    @Test
    public void test0516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0516");
        com.reservation_system.model.Faculty faculty5 = new com.reservation_system.model.Faculty(102, "Guest", "Password1!", "faculty", false);
        boolean boolean6 = faculty5.isApproved();
        java.lang.String str7 = faculty5.getName();
        java.lang.String str8 = faculty5.getPassword();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Guest" + "'", str7, "Guest");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "faculty" + "'", str8, "faculty");
    }

    @Test
    public void test0517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0517");
        com.reservation_system.model.Student student5 = new com.reservation_system.model.Student((-1), "Researcher", "headlabcoordinator", "data/test-userrepo.csv", false);
    }

    @Test
    public void test0518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0518");
        com.reservation_system.model.Researcher researcher5 = new com.reservation_system.model.Researcher((int) (byte) 1, "Password1!", "hi!", "", true);
        boolean boolean6 = researcher5.isApproved();
        java.lang.String str7 = researcher5.getUserType();
        java.lang.Class<?> wildcardClass8 = researcher5.getClass();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Researcher" + "'", str7, "Researcher");
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0519");
        com.reservation_system.model.Student student5 = new com.reservation_system.model.Student((int) (short) 0, "data/test-userrepo.csv", "Guest", "Andrew", true);
    }

    @Test
    public void test0520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0520");
        com.reservation_system.model.Faculty faculty5 = new com.reservation_system.model.Faculty(1, "andrew@example.com", "andrew@example.com", "guest", false);
        java.lang.String str6 = faculty5.getUserType();
        boolean boolean7 = faculty5.requiresDepartmentApproval();
        java.lang.String str8 = faculty5.getPassword();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Faculty" + "'", str6, "Faculty");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "guest" + "'", str8, "guest");
    }

    @Test
    public void test0521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0521");
        com.reservation_system.model.Faculty faculty5 = new com.reservation_system.model.Faculty(100, "guest", "student", "headlabcoordinator", true);
        java.lang.Class<?> wildcardClass6 = faculty5.getClass();
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0522");
        com.reservation_system.model.Faculty faculty5 = new com.reservation_system.model.Faculty((-1), "student", "Student", "andrew@example.com", true);
        int int6 = faculty5.getID();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
    }

    @Test
    public void test0523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0523");
        com.reservation_system.model.Faculty faculty5 = new com.reservation_system.model.Faculty((int) ' ', "hi!", "", "hi!", true);
        java.lang.String str6 = faculty5.getUserType();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Faculty" + "'", str6, "Faculty");
    }

    @Test
    public void test0524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0524");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("data/test-userrepo.csv");
        com.reservation_system.services.RegistrationService registrationService2 = new com.reservation_system.services.RegistrationService(userRepository1);
        com.reservation_system.model.Faculty faculty8 = new com.reservation_system.model.Faculty(0, "Password1!", "data/test-userrepo.csv", "researcher", false);
        java.lang.String str9 = faculty8.getName();
        userRepository1.addUser((com.reservation_system.model.User) faculty8);
        boolean boolean11 = userRepository1.headLabCoordinatorExists();
        com.reservation_system.services.RegistrationService registrationService12 = new com.reservation_system.services.RegistrationService(userRepository1);
        com.reservation_system.services.RegistrationService registrationService13 = new com.reservation_system.services.RegistrationService(userRepository1);
        boolean boolean14 = userRepository1.headLabCoordinatorExists();
        java.util.List<com.reservation_system.model.User> userList15 = userRepository1.getAllUsers();
        java.util.List<com.reservation_system.model.User> userList16 = userRepository1.getAllUsers();
        com.reservation_system.repository.UserRepository userRepository18 = new com.reservation_system.repository.UserRepository("data/test-userrepo.csv");
        com.reservation_system.services.RegistrationService registrationService19 = new com.reservation_system.services.RegistrationService(userRepository18);
        com.reservation_system.model.Faculty faculty25 = new com.reservation_system.model.Faculty(0, "Password1!", "data/test-userrepo.csv", "researcher", false);
        java.lang.String str26 = faculty25.getName();
        userRepository18.addUser((com.reservation_system.model.User) faculty25);
        boolean boolean28 = userRepository18.headLabCoordinatorExists();
        int int29 = userRepository18.getNextID();
        com.reservation_system.repository.UserRepository userRepository31 = new com.reservation_system.repository.UserRepository("data/test-userrepo.csv");
        java.util.List<com.reservation_system.model.User> userList32 = userRepository31.getAllUsers();
        com.reservation_system.services.RegistrationService registrationService33 = new com.reservation_system.services.RegistrationService(userRepository31);
        java.util.List<com.reservation_system.model.User> userList34 = userRepository31.getAllUsers();
        userRepository18.saveAllUsers(userList34);
        userRepository1.saveAllUsers(userList34);
        java.util.List<com.reservation_system.model.User> userList37 = userRepository1.getAllUsers();
        boolean boolean39 = userRepository1.emailExists("data/test-userrepo.csv");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Password1!" + "'", str9, "Password1!");
// flaky "5) test0524(com.reservation_system.randoop.registrationservice.RegressionTest1)":         org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
// flaky "5) test0524(com.reservation_system.randoop.registrationservice.RegressionTest1)":         org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(userList15);
        org.junit.Assert.assertNotNull(userList16);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "Password1!" + "'", str26, "Password1!");
// flaky "4) test0524(com.reservation_system.randoop.registrationservice.RegressionTest1)":         org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
// flaky "1) test0524(com.reservation_system.randoop.registrationservice.RegressionTest1)":         org.junit.Assert.assertTrue("'" + int29 + "' != '" + 101 + "'", int29 == 101);
        org.junit.Assert.assertNotNull(userList32);
        org.junit.Assert.assertNotNull(userList34);
        org.junit.Assert.assertNotNull(userList37);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
    }

    @Test
    public void test0525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0525");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("data/test-userrepo.csv");
        com.reservation_system.services.RegistrationService registrationService2 = new com.reservation_system.services.RegistrationService(userRepository1);
        com.reservation_system.model.Faculty faculty8 = new com.reservation_system.model.Faculty(0, "Password1!", "data/test-userrepo.csv", "researcher", false);
        java.lang.String str9 = faculty8.getName();
        userRepository1.addUser((com.reservation_system.model.User) faculty8);
        boolean boolean11 = userRepository1.headLabCoordinatorExists();
        com.reservation_system.model.Guest guest17 = new com.reservation_system.model.Guest((int) (byte) -1, "guest", "Researcher", "Faculty", true);
        userRepository1.addUser((com.reservation_system.model.User) guest17);
        boolean boolean20 = userRepository1.emailExists("Password1!");
        boolean boolean22 = userRepository1.emailExists("hi!");
        int int23 = userRepository1.getNextID();
        int int24 = userRepository1.getNextID();
        com.reservation_system.model.Faculty faculty30 = new com.reservation_system.model.Faculty(10, "researcher", "faculty", "", false);
        java.lang.String str31 = faculty30.getUserType();
        java.lang.String str32 = faculty30.getUserType();
        userRepository1.addUser((com.reservation_system.model.User) faculty30);
        java.lang.String str34 = faculty30.getEmail();
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Password1!" + "'", str9, "Password1!");
// flaky "6) test0525(com.reservation_system.randoop.registrationservice.RegressionTest1)":         org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
// flaky "6) test0525(com.reservation_system.randoop.registrationservice.RegressionTest1)":         org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
// flaky "5) test0525(com.reservation_system.randoop.registrationservice.RegressionTest1)":         org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
// flaky "2) test0525(com.reservation_system.randoop.registrationservice.RegressionTest1)":         org.junit.Assert.assertTrue("'" + int23 + "' != '" + 101 + "'", int23 == 101);
// flaky "1) test0525(com.reservation_system.randoop.registrationservice.RegressionTest1)":         org.junit.Assert.assertTrue("'" + int24 + "' != '" + 101 + "'", int24 == 101);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "Faculty" + "'", str31, "Faculty");
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "Faculty" + "'", str32, "Faculty");
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "faculty" + "'", str34, "faculty");
    }

    @Test
    public void test0526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0526");
        com.reservation_system.model.Student student5 = new com.reservation_system.model.Student((int) (short) -1, "Faculty", "Andrew", "researcher", true);
    }

    @Test
    public void test0527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0527");
        com.reservation_system.model.Researcher researcher5 = new com.reservation_system.model.Researcher((int) (byte) 100, "Password1!", "Password1!", "headlabcoordinator", true);
        boolean boolean6 = researcher5.requiresDepartmentApproval();
        java.lang.String str7 = researcher5.getUserType();
        java.lang.String str8 = researcher5.getUserType();
        int int9 = researcher5.getID();
        java.lang.String str10 = researcher5.getEmail();
        java.lang.String str11 = researcher5.getUserType();
        boolean boolean12 = researcher5.isApproved();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Researcher" + "'", str7, "Researcher");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Researcher" + "'", str8, "Researcher");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 100 + "'", int9 == 100);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Password1!" + "'", str10, "Password1!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Researcher" + "'", str11, "Researcher");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test0528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0528");
        com.reservation_system.model.Faculty faculty5 = new com.reservation_system.model.Faculty((int) ' ', "hi!", "", "hi!", true);
        faculty5.setApproved(true);
    }

    @Test
    public void test0529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0529");
        com.reservation_system.model.Faculty faculty5 = new com.reservation_system.model.Faculty((int) (byte) 1, "researcher", "Andrew", "", false);
        java.lang.String str6 = faculty5.getUserType();
        java.lang.String str7 = faculty5.getName();
        java.lang.String str8 = faculty5.getName();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Faculty" + "'", str6, "Faculty");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "researcher" + "'", str7, "researcher");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "researcher" + "'", str8, "researcher");
    }

    @Test
    public void test0530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0530");
        com.reservation_system.model.HeadLabCoordinator headLabCoordinator5 = new com.reservation_system.model.HeadLabCoordinator((int) (short) 0, "Researcher", "Researcher", "", true);
    }

    @Test
    public void test0531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0531");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("data/test-userrepo.csv");
        com.reservation_system.services.RegistrationService registrationService2 = new com.reservation_system.services.RegistrationService(userRepository1);
        com.reservation_system.model.Faculty faculty8 = new com.reservation_system.model.Faculty(0, "Password1!", "data/test-userrepo.csv", "researcher", false);
        java.lang.String str9 = faculty8.getName();
        userRepository1.addUser((com.reservation_system.model.User) faculty8);
        boolean boolean12 = userRepository1.emailExists("Faculty");
        int int13 = userRepository1.getNextID();
        com.reservation_system.services.RegistrationService registrationService14 = new com.reservation_system.services.RegistrationService(userRepository1);
        com.reservation_system.services.RegistrationService registrationService15 = new com.reservation_system.services.RegistrationService(userRepository1);
        // The following exception was thrown during execution in test generation
        try {
            com.reservation_system.model.User user20 = registrationService15.registerUser("data/test-userrepo.csv", "headlabcoordinator", "student", "student");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid user type.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Password1!" + "'", str9, "Password1!");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
// flaky "7) test0531(com.reservation_system.randoop.registrationservice.RegressionTest1)":         org.junit.Assert.assertTrue("'" + int13 + "' != '" + 101 + "'", int13 == 101);
    }

    @Test
    public void test0532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0532");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("data/test-userrepo.csv");
        com.reservation_system.services.RegistrationService registrationService2 = new com.reservation_system.services.RegistrationService(userRepository1);
        com.reservation_system.model.Faculty faculty8 = new com.reservation_system.model.Faculty(0, "Password1!", "data/test-userrepo.csv", "researcher", false);
        java.lang.String str9 = faculty8.getName();
        userRepository1.addUser((com.reservation_system.model.User) faculty8);
        com.reservation_system.services.RegistrationService registrationService11 = new com.reservation_system.services.RegistrationService(userRepository1);
        com.reservation_system.services.RegistrationService registrationService12 = new com.reservation_system.services.RegistrationService(userRepository1);
        com.reservation_system.services.RegistrationService registrationService13 = new com.reservation_system.services.RegistrationService(userRepository1);
        java.lang.Class<?> wildcardClass14 = userRepository1.getClass();
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Password1!" + "'", str9, "Password1!");
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test0533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0533");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("data/test-userrepo.csv");
        com.reservation_system.services.RegistrationService registrationService2 = new com.reservation_system.services.RegistrationService(userRepository1);
        com.reservation_system.model.Faculty faculty8 = new com.reservation_system.model.Faculty(0, "Password1!", "data/test-userrepo.csv", "researcher", false);
        java.lang.String str9 = faculty8.getName();
        userRepository1.addUser((com.reservation_system.model.User) faculty8);
        com.reservation_system.model.Researcher researcher16 = new com.reservation_system.model.Researcher((int) '4', "hi!", "hi!", "labmanager", false);
        java.lang.String str17 = researcher16.getUserType();
        userRepository1.addUser((com.reservation_system.model.User) researcher16);
        boolean boolean19 = userRepository1.headLabCoordinatorExists();
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Password1!" + "'", str9, "Password1!");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "Researcher" + "'", str17, "Researcher");
// flaky "8) test0533(com.reservation_system.randoop.registrationservice.RegressionTest1)":         org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
    }

    @Test
    public void test0534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0534");
        com.reservation_system.model.LabManager labManager5 = new com.reservation_system.model.LabManager((int) (byte) 10, "", "headlabcoordinator", "andrew@example.com", true);
    }

    @Test
    public void test0535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0535");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("data/test-userrepo.csv");
        boolean boolean2 = userRepository1.headLabCoordinatorExists();
        com.reservation_system.repository.UserRepository userRepository4 = new com.reservation_system.repository.UserRepository("data/test-userrepo.csv");
        com.reservation_system.services.RegistrationService registrationService5 = new com.reservation_system.services.RegistrationService(userRepository4);
        com.reservation_system.model.Faculty faculty11 = new com.reservation_system.model.Faculty(0, "Password1!", "data/test-userrepo.csv", "researcher", false);
        java.lang.String str12 = faculty11.getName();
        userRepository4.addUser((com.reservation_system.model.User) faculty11);
        java.util.List<com.reservation_system.model.User> userList14 = userRepository4.getAllUsers();
        userRepository1.saveAllUsers(userList14);
        com.reservation_system.model.Student student21 = new com.reservation_system.model.Student((int) (byte) 10, "Researcher", "Password1!", "headlabcoordinator", true);
        userRepository1.addUser((com.reservation_system.model.User) student21);
        java.lang.String str23 = student21.getUserType();
        java.lang.String str24 = student21.getUserType();
        int int25 = student21.getID();
// flaky "9) test0535(com.reservation_system.randoop.registrationservice.RegressionTest1)":         org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Password1!" + "'", str12, "Password1!");
        org.junit.Assert.assertNotNull(userList14);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "Student" + "'", str23, "Student");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "Student" + "'", str24, "Student");
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 10 + "'", int25 == 10);
    }

    @Test
    public void test0536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0536");
        com.reservation_system.model.LabManager labManager5 = new com.reservation_system.model.LabManager((int) (byte) -1, "guest", "faculty", "labmanager", false);
        java.lang.Class<?> wildcardClass6 = labManager5.getClass();
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0537");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("data/test-userrepo.csv");
        boolean boolean2 = userRepository1.headLabCoordinatorExists();
        com.reservation_system.services.RegistrationService registrationService3 = new com.reservation_system.services.RegistrationService(userRepository1);
        boolean boolean4 = userRepository1.headLabCoordinatorExists();
        boolean boolean6 = userRepository1.emailExists("Andrew");
        com.reservation_system.services.RegistrationService registrationService7 = new com.reservation_system.services.RegistrationService(userRepository1);
        java.util.Optional<com.reservation_system.model.User> userOptional9 = userRepository1.findByEmail("faculty");
        com.reservation_system.services.RegistrationService registrationService10 = new com.reservation_system.services.RegistrationService(userRepository1);
        // The following exception was thrown during execution in test generation
        try {
            com.reservation_system.model.User user15 = registrationService10.registerUser("guest", "Researcher", "hi!", "");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid email format.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
// flaky "10) test0537(com.reservation_system.randoop.registrationservice.RegressionTest1)":         org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
// flaky "7) test0537(com.reservation_system.randoop.registrationservice.RegressionTest1)":         org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
// flaky "6) test0537(com.reservation_system.randoop.registrationservice.RegressionTest1)":         org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(userOptional9);
    }

    @Test
    public void test0538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0538");
        com.reservation_system.model.Guest guest5 = new com.reservation_system.model.Guest(52, "student", "data/test-userrepo.csv", "researcher", true);
        java.lang.String str6 = guest5.getUserType();
        java.lang.Class<?> wildcardClass7 = guest5.getClass();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Guest" + "'", str6, "Guest");
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0539");
        com.reservation_system.model.Guest guest5 = new com.reservation_system.model.Guest((int) (short) -1, "labmanager", "", "Password1!", true);
    }

    @Test
    public void test0540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0540");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("data/test-userrepo.csv");
        com.reservation_system.services.RegistrationService registrationService2 = new com.reservation_system.services.RegistrationService(userRepository1);
        com.reservation_system.model.Faculty faculty8 = new com.reservation_system.model.Faculty(0, "Password1!", "data/test-userrepo.csv", "researcher", false);
        java.lang.String str9 = faculty8.getName();
        userRepository1.addUser((com.reservation_system.model.User) faculty8);
        boolean boolean11 = userRepository1.headLabCoordinatorExists();
        com.reservation_system.services.RegistrationService registrationService12 = new com.reservation_system.services.RegistrationService(userRepository1);
        boolean boolean14 = userRepository1.emailExists("Guest");
        boolean boolean16 = userRepository1.emailExists("faculty");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Password1!" + "'", str9, "Password1!");
// flaky "11) test0540(com.reservation_system.randoop.registrationservice.RegressionTest1)":         org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
// flaky "8) test0540(com.reservation_system.randoop.registrationservice.RegressionTest1)":         org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
    }

    @Test
    public void test0541() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0541");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("data/test-userrepo.csv");
        com.reservation_system.services.RegistrationService registrationService2 = new com.reservation_system.services.RegistrationService(userRepository1);
        com.reservation_system.model.Faculty faculty8 = new com.reservation_system.model.Faculty(0, "Password1!", "data/test-userrepo.csv", "researcher", false);
        java.lang.String str9 = faculty8.getName();
        userRepository1.addUser((com.reservation_system.model.User) faculty8);
        boolean boolean11 = userRepository1.headLabCoordinatorExists();
        com.reservation_system.services.RegistrationService registrationService12 = new com.reservation_system.services.RegistrationService(userRepository1);
        com.reservation_system.model.Researcher researcher18 = new com.reservation_system.model.Researcher((int) '4', "labmanager", "Andrew", "researcher", true);
        userRepository1.addUser((com.reservation_system.model.User) researcher18);
        com.reservation_system.model.Researcher researcher25 = new com.reservation_system.model.Researcher((int) (short) -1, "andrew@example.com", "guest", "labmanager", false);
        java.lang.String str26 = researcher25.getUserType();
        java.lang.String str27 = researcher25.getName();
        boolean boolean28 = researcher25.requiresDepartmentApproval();
        userRepository1.addUser((com.reservation_system.model.User) researcher25);
        com.reservation_system.model.HeadLabCoordinator headLabCoordinator35 = new com.reservation_system.model.HeadLabCoordinator(102, "Student", "faculty", "Faculty", false);
        java.lang.String str36 = headLabCoordinator35.getUserType();
        java.lang.String str37 = headLabCoordinator35.getPassword();
        java.lang.String str38 = headLabCoordinator35.getName();
        userRepository1.addUser((com.reservation_system.model.User) headLabCoordinator35);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Password1!" + "'", str9, "Password1!");
// flaky "12) test0541(com.reservation_system.randoop.registrationservice.RegressionTest1)":         org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "Researcher" + "'", str26, "Researcher");
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "headlabcoordinator" + "'", str36, "headlabcoordinator");
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "Faculty" + "'", str37, "Faculty");
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "Student" + "'", str38, "Student");
    }

    @Test
    public void test0542() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0542");
        // The following exception was thrown during execution in test generation
        try {
            com.reservation_system.model.User user6 = com.reservation_system.patterns.factory.UserFactory.createUser("Password1!", (int) (byte) -1, "andrew@example.com", "Guest", "Guest", false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid user type: Password1!");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0543() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0543");
        com.reservation_system.model.Guest guest5 = new com.reservation_system.model.Guest((int) (byte) -1, "labmanager", "Guest", "faculty", false);
        java.lang.String str6 = guest5.getUserType();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Guest" + "'", str6, "Guest");
    }

    @Test
    public void test0544() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0544");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("data/test-userrepo.csv");
        com.reservation_system.services.RegistrationService registrationService2 = new com.reservation_system.services.RegistrationService(userRepository1);
        com.reservation_system.model.Faculty faculty8 = new com.reservation_system.model.Faculty(0, "Password1!", "data/test-userrepo.csv", "researcher", false);
        java.lang.String str9 = faculty8.getName();
        userRepository1.addUser((com.reservation_system.model.User) faculty8);
        boolean boolean11 = userRepository1.headLabCoordinatorExists();
        int int12 = userRepository1.getNextID();
        boolean boolean13 = userRepository1.headLabCoordinatorExists();
        com.reservation_system.model.Guest guest19 = new com.reservation_system.model.Guest((int) '4', "researcher", "data/test-userrepo.csv", "andrew@example.com", false);
        userRepository1.addUser((com.reservation_system.model.User) guest19);
        boolean boolean21 = guest19.isApproved();
        java.lang.Class<?> wildcardClass22 = guest19.getClass();
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Password1!" + "'", str9, "Password1!");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 103 + "'", int12 == 103);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test0545() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0545");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("data/test-userrepo.csv");
        com.reservation_system.services.RegistrationService registrationService2 = new com.reservation_system.services.RegistrationService(userRepository1);
        com.reservation_system.model.Faculty faculty8 = new com.reservation_system.model.Faculty(0, "Password1!", "data/test-userrepo.csv", "researcher", false);
        java.lang.String str9 = faculty8.getName();
        userRepository1.addUser((com.reservation_system.model.User) faculty8);
        boolean boolean11 = userRepository1.headLabCoordinatorExists();
        com.reservation_system.model.Guest guest17 = new com.reservation_system.model.Guest((int) (byte) -1, "guest", "Researcher", "Faculty", true);
        userRepository1.addUser((com.reservation_system.model.User) guest17);
        boolean boolean20 = userRepository1.emailExists("Password1!");
        boolean boolean22 = userRepository1.emailExists("hi!");
        int int23 = userRepository1.getNextID();
        com.reservation_system.repository.UserRepository userRepository25 = new com.reservation_system.repository.UserRepository("data/test-userrepo.csv");
        com.reservation_system.services.RegistrationService registrationService26 = new com.reservation_system.services.RegistrationService(userRepository25);
        com.reservation_system.model.Faculty faculty32 = new com.reservation_system.model.Faculty(0, "Password1!", "data/test-userrepo.csv", "researcher", false);
        java.lang.String str33 = faculty32.getName();
        userRepository25.addUser((com.reservation_system.model.User) faculty32);
        boolean boolean35 = userRepository25.headLabCoordinatorExists();
        com.reservation_system.model.Guest guest41 = new com.reservation_system.model.Guest((int) (byte) -1, "guest", "Researcher", "Faculty", true);
        userRepository25.addUser((com.reservation_system.model.User) guest41);
        boolean boolean43 = userRepository25.headLabCoordinatorExists();
        com.reservation_system.repository.UserRepository userRepository45 = new com.reservation_system.repository.UserRepository("data/test-userrepo.csv");
        com.reservation_system.services.RegistrationService registrationService46 = new com.reservation_system.services.RegistrationService(userRepository45);
        com.reservation_system.model.Faculty faculty52 = new com.reservation_system.model.Faculty(0, "Password1!", "data/test-userrepo.csv", "researcher", false);
        java.lang.String str53 = faculty52.getName();
        userRepository45.addUser((com.reservation_system.model.User) faculty52);
        boolean boolean55 = userRepository45.headLabCoordinatorExists();
        com.reservation_system.repository.UserRepository userRepository57 = new com.reservation_system.repository.UserRepository("data/test-userrepo.csv");
        com.reservation_system.services.RegistrationService registrationService58 = new com.reservation_system.services.RegistrationService(userRepository57);
        com.reservation_system.model.Faculty faculty64 = new com.reservation_system.model.Faculty(0, "Password1!", "data/test-userrepo.csv", "researcher", false);
        java.lang.String str65 = faculty64.getName();
        userRepository57.addUser((com.reservation_system.model.User) faculty64);
        java.util.List<com.reservation_system.model.User> userList67 = userRepository57.getAllUsers();
        userRepository45.saveAllUsers(userList67);
        userRepository25.saveAllUsers(userList67);
        boolean boolean71 = userRepository25.emailExists("hi!");
        com.reservation_system.repository.UserRepository userRepository73 = new com.reservation_system.repository.UserRepository("data/test-userrepo.csv");
        com.reservation_system.services.RegistrationService registrationService74 = new com.reservation_system.services.RegistrationService(userRepository73);
        com.reservation_system.model.Faculty faculty80 = new com.reservation_system.model.Faculty(0, "Password1!", "data/test-userrepo.csv", "researcher", false);
        java.lang.String str81 = faculty80.getName();
        userRepository73.addUser((com.reservation_system.model.User) faculty80);
        boolean boolean83 = userRepository73.headLabCoordinatorExists();
        com.reservation_system.services.RegistrationService registrationService84 = new com.reservation_system.services.RegistrationService(userRepository73);
        java.util.List<com.reservation_system.model.User> userList85 = userRepository73.getAllUsers();
        userRepository25.saveAllUsers(userList85);
        userRepository1.saveAllUsers(userList85);
        com.reservation_system.services.RegistrationService registrationService88 = new com.reservation_system.services.RegistrationService(userRepository1);
        int int89 = userRepository1.getNextID();
        com.reservation_system.repository.UserRepository userRepository91 = new com.reservation_system.repository.UserRepository("data/test-userrepo.csv");
        java.util.List<com.reservation_system.model.User> userList92 = userRepository91.getAllUsers();
        com.reservation_system.services.RegistrationService registrationService93 = new com.reservation_system.services.RegistrationService(userRepository91);
        java.util.List<com.reservation_system.model.User> userList94 = userRepository91.getAllUsers();
        boolean boolean96 = userRepository91.emailExists("Guest");
        java.util.List<com.reservation_system.model.User> userList97 = userRepository91.getAllUsers();
        userRepository1.saveAllUsers(userList97);
        boolean boolean99 = userRepository1.headLabCoordinatorExists();
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Password1!" + "'", str9, "Password1!");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 103 + "'", int23 == 103);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "Password1!" + "'", str33, "Password1!");
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + true + "'", boolean43 == true);
        org.junit.Assert.assertEquals("'" + str53 + "' != '" + "Password1!" + "'", str53, "Password1!");
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + true + "'", boolean55 == true);
        org.junit.Assert.assertEquals("'" + str65 + "' != '" + "Password1!" + "'", str65, "Password1!");
        org.junit.Assert.assertNotNull(userList67);
        org.junit.Assert.assertTrue("'" + boolean71 + "' != '" + true + "'", boolean71 == true);
        org.junit.Assert.assertEquals("'" + str81 + "' != '" + "Password1!" + "'", str81, "Password1!");
        org.junit.Assert.assertTrue("'" + boolean83 + "' != '" + true + "'", boolean83 == true);
        org.junit.Assert.assertNotNull(userList85);
        org.junit.Assert.assertTrue("'" + int89 + "' != '" + 103 + "'", int89 == 103);
        org.junit.Assert.assertNotNull(userList92);
        org.junit.Assert.assertNotNull(userList94);
        org.junit.Assert.assertTrue("'" + boolean96 + "' != '" + true + "'", boolean96 == true);
        org.junit.Assert.assertNotNull(userList97);
        org.junit.Assert.assertTrue("'" + boolean99 + "' != '" + true + "'", boolean99 == true);
    }

    @Test
    public void test0546() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0546");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("data/test-userrepo.csv");
        java.util.List<com.reservation_system.model.User> userList2 = userRepository1.getAllUsers();
        com.reservation_system.services.RegistrationService registrationService3 = new com.reservation_system.services.RegistrationService(userRepository1);
        java.util.List<com.reservation_system.model.User> userList4 = userRepository1.getAllUsers();
        java.util.Optional<com.reservation_system.model.User> userOptional6 = userRepository1.findByEmail("researcher");
        int int7 = userRepository1.getNextID();
        com.reservation_system.model.Student student13 = new com.reservation_system.model.Student(10, "Password1!", "Researcher", "Password1!", false);
        userRepository1.addUser((com.reservation_system.model.User) student13);
        java.util.Optional<com.reservation_system.model.User> userOptional16 = userRepository1.findByEmail("headlabcoordinator");
        org.junit.Assert.assertNotNull(userList2);
        org.junit.Assert.assertNotNull(userList4);
        org.junit.Assert.assertNotNull(userOptional6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 103 + "'", int7 == 103);
        org.junit.Assert.assertNotNull(userOptional16);
    }

    @Test
    public void test0547() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0547");
        com.reservation_system.model.LabManager labManager5 = new com.reservation_system.model.LabManager(103, "labmanager", "Password1!", "Andrew", false);
    }

    @Test
    public void test0548() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0548");
        com.reservation_system.model.LabManager labManager5 = new com.reservation_system.model.LabManager((int) (short) 100, "faculty", "Researcher", "", false);
    }

    @Test
    public void test0549() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0549");
        com.reservation_system.model.LabManager labManager5 = new com.reservation_system.model.LabManager((int) '#', "headlabcoordinator", "", "Guest", true);
        java.lang.String str6 = labManager5.getUserType();
        java.lang.String str7 = labManager5.getUserType();
        java.lang.String str8 = labManager5.getUserType();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "labmanager" + "'", str6, "labmanager");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "labmanager" + "'", str7, "labmanager");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "labmanager" + "'", str8, "labmanager");
    }

    @Test
    public void test0550() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0550");
        com.reservation_system.model.HeadLabCoordinator headLabCoordinator5 = new com.reservation_system.model.HeadLabCoordinator(102, "headlabcoordinator", "student", "Researcher", false);
    }

    @Test
    public void test0551() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0551");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("data/test-userrepo.csv");
        boolean boolean2 = userRepository1.headLabCoordinatorExists();
        com.reservation_system.repository.UserRepository userRepository4 = new com.reservation_system.repository.UserRepository("data/test-userrepo.csv");
        com.reservation_system.services.RegistrationService registrationService5 = new com.reservation_system.services.RegistrationService(userRepository4);
        com.reservation_system.model.Faculty faculty11 = new com.reservation_system.model.Faculty(0, "Password1!", "data/test-userrepo.csv", "researcher", false);
        java.lang.String str12 = faculty11.getName();
        userRepository4.addUser((com.reservation_system.model.User) faculty11);
        java.util.List<com.reservation_system.model.User> userList14 = userRepository4.getAllUsers();
        userRepository1.saveAllUsers(userList14);
        com.reservation_system.services.RegistrationService registrationService16 = new com.reservation_system.services.RegistrationService(userRepository1);
        com.reservation_system.services.RegistrationService registrationService17 = new com.reservation_system.services.RegistrationService(userRepository1);
        // The following exception was thrown during execution in test generation
        try {
            com.reservation_system.model.User user22 = registrationService17.registerUser("hi!", "researcher", "hi!", "");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid user type.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Password1!" + "'", str12, "Password1!");
        org.junit.Assert.assertNotNull(userList14);
    }

    @Test
    public void test0552() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0552");
        com.reservation_system.model.Faculty faculty5 = new com.reservation_system.model.Faculty(52, "", "Faculty", "Faculty", false);
    }

    @Test
    public void test0553() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0553");
        com.reservation_system.model.Student student5 = new com.reservation_system.model.Student(0, "Student", "Faculty", "hi!", false);
        int int6 = student5.getID();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test0554() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0554");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("data/test-userrepo.csv");
        com.reservation_system.services.RegistrationService registrationService2 = new com.reservation_system.services.RegistrationService(userRepository1);
        com.reservation_system.model.Faculty faculty8 = new com.reservation_system.model.Faculty(0, "Password1!", "data/test-userrepo.csv", "researcher", false);
        java.lang.String str9 = faculty8.getName();
        userRepository1.addUser((com.reservation_system.model.User) faculty8);
        boolean boolean11 = userRepository1.headLabCoordinatorExists();
        java.util.Optional<com.reservation_system.model.User> userOptional13 = userRepository1.findByEmail("andrew@example.com");
        java.util.Optional<com.reservation_system.model.User> userOptional15 = userRepository1.findByEmail("Guest");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Password1!" + "'", str9, "Password1!");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(userOptional13);
        org.junit.Assert.assertNotNull(userOptional15);
    }

    @Test
    public void test0555() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0555");
        com.reservation_system.model.HeadLabCoordinator headLabCoordinator5 = new com.reservation_system.model.HeadLabCoordinator((int) (byte) 1, "hi!", "Guest", "Andrew", false);
        java.lang.String str6 = headLabCoordinator5.getEmail();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Guest" + "'", str6, "Guest");
    }

    @Test
    public void test0556() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0556");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("data/test-userrepo.csv");
        int int2 = userRepository1.getNextID();
        int int3 = userRepository1.getNextID();
        boolean boolean5 = userRepository1.emailExists("faculty");
        com.reservation_system.model.LabManager labManager11 = new com.reservation_system.model.LabManager((int) (short) 0, "", "labmanager", "Password1!", true);
        userRepository1.addUser((com.reservation_system.model.User) labManager11);
        java.util.Optional<com.reservation_system.model.User> userOptional14 = userRepository1.findByEmail("");
        com.reservation_system.model.Researcher researcher20 = new com.reservation_system.model.Researcher((int) (byte) 100, "Password1!", "Password1!", "headlabcoordinator", true);
        userRepository1.addUser((com.reservation_system.model.User) researcher20);
        java.util.List<com.reservation_system.model.User> userList22 = userRepository1.getAllUsers();
        boolean boolean23 = userRepository1.headLabCoordinatorExists();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 103 + "'", int2 == 103);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 103 + "'", int3 == 103);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(userOptional14);
        org.junit.Assert.assertNotNull(userList22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
    }

    @Test
    public void test0557() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0557");
        // The following exception was thrown during execution in test generation
        try {
            com.reservation_system.model.User user6 = com.reservation_system.patterns.factory.UserFactory.createUser("hi!", (int) (short) 1, "data/test-userrepo.csv", "", "Andrew", true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid user type: hi!");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0558() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0558");
        com.reservation_system.model.LabManager labManager5 = new com.reservation_system.model.LabManager((int) (byte) 1, "faculty", "researcher", "guest", false);
        java.lang.String str6 = labManager5.getUserType();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "labmanager" + "'", str6, "labmanager");
    }

    @Test
    public void test0559() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0559");
        com.reservation_system.model.User user6 = com.reservation_system.patterns.factory.UserFactory.createUser("Researcher", (int) 'a', "student", "guest", "labmanager", false);
        user6.setApproved(false);
        org.junit.Assert.assertNotNull(user6);
    }

    @Test
    public void test0560() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0560");
        com.reservation_system.model.Student student5 = new com.reservation_system.model.Student((int) '#', "student", "hi!", "guest", true);
        java.lang.String str6 = student5.getUserType();
        java.lang.String str7 = student5.getUserType();
        student5.setApproved(true);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Student" + "'", str6, "Student");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Student" + "'", str7, "Student");
    }

    @Test
    public void test0561() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0561");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("data/test-userrepo.csv");
        com.reservation_system.services.RegistrationService registrationService2 = new com.reservation_system.services.RegistrationService(userRepository1);
        com.reservation_system.model.Faculty faculty8 = new com.reservation_system.model.Faculty(0, "Password1!", "data/test-userrepo.csv", "researcher", false);
        java.lang.String str9 = faculty8.getName();
        userRepository1.addUser((com.reservation_system.model.User) faculty8);
        boolean boolean11 = userRepository1.headLabCoordinatorExists();
        com.reservation_system.services.RegistrationService registrationService12 = new com.reservation_system.services.RegistrationService(userRepository1);
        com.reservation_system.services.RegistrationService registrationService13 = new com.reservation_system.services.RegistrationService(userRepository1);
        boolean boolean14 = userRepository1.headLabCoordinatorExists();
        boolean boolean15 = userRepository1.headLabCoordinatorExists();
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Password1!" + "'", str9, "Password1!");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
    }

    @Test
    public void test0562() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0562");
        com.reservation_system.model.Researcher researcher5 = new com.reservation_system.model.Researcher(52, "faculty", "Guest", "faculty", false);
    }

    @Test
    public void test0563() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0563");
        com.reservation_system.model.Faculty faculty5 = new com.reservation_system.model.Faculty((int) (byte) -1, "Faculty", "Guest", "Faculty", false);
        java.lang.String str6 = faculty5.getPassword();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Faculty" + "'", str6, "Faculty");
    }

    @Test
    public void test0564() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0564");
        com.reservation_system.model.Guest guest5 = new com.reservation_system.model.Guest((int) (byte) 1, "data/test-userrepo.csv", "Andrew", "faculty", true);
        java.lang.String str6 = guest5.getPassword();
        java.lang.String str7 = guest5.getUserType();
        java.lang.String str8 = guest5.getUserType();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "faculty" + "'", str6, "faculty");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Guest" + "'", str7, "Guest");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Guest" + "'", str8, "Guest");
    }

    @Test
    public void test0565() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0565");
        com.reservation_system.model.Faculty faculty5 = new com.reservation_system.model.Faculty(101, "labmanager", "labmanager", "student", false);
    }

    @Test
    public void test0566() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0566");
        com.reservation_system.model.LabManager labManager5 = new com.reservation_system.model.LabManager((int) (byte) -1, "faculty", "labmanager", "faculty", false);
        java.lang.String str6 = labManager5.getUserType();
        java.lang.Class<?> wildcardClass7 = labManager5.getClass();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "labmanager" + "'", str6, "labmanager");
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0567() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0567");
        com.reservation_system.model.Researcher researcher5 = new com.reservation_system.model.Researcher(1, "guest", "Student", "Faculty", true);
        java.lang.Class<?> wildcardClass6 = researcher5.getClass();
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0568() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0568");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("data/test-userrepo.csv");
        com.reservation_system.services.RegistrationService registrationService2 = new com.reservation_system.services.RegistrationService(userRepository1);
        com.reservation_system.model.Faculty faculty8 = new com.reservation_system.model.Faculty(0, "Password1!", "data/test-userrepo.csv", "researcher", false);
        java.lang.String str9 = faculty8.getName();
        userRepository1.addUser((com.reservation_system.model.User) faculty8);
        boolean boolean11 = userRepository1.headLabCoordinatorExists();
        com.reservation_system.repository.UserRepository userRepository13 = new com.reservation_system.repository.UserRepository("data/test-userrepo.csv");
        com.reservation_system.services.RegistrationService registrationService14 = new com.reservation_system.services.RegistrationService(userRepository13);
        com.reservation_system.model.Faculty faculty20 = new com.reservation_system.model.Faculty(0, "Password1!", "data/test-userrepo.csv", "researcher", false);
        java.lang.String str21 = faculty20.getName();
        userRepository13.addUser((com.reservation_system.model.User) faculty20);
        java.util.List<com.reservation_system.model.User> userList23 = userRepository13.getAllUsers();
        userRepository1.saveAllUsers(userList23);
        java.util.List<com.reservation_system.model.User> userList25 = userRepository1.getAllUsers();
        boolean boolean27 = userRepository1.emailExists("labmanager");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Password1!" + "'", str9, "Password1!");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "Password1!" + "'", str21, "Password1!");
        org.junit.Assert.assertNotNull(userList23);
        org.junit.Assert.assertNotNull(userList25);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
    }

    @Test
    public void test0569() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0569");
        com.reservation_system.model.Student student5 = new com.reservation_system.model.Student(101, "headlabcoordinator", "", "Faculty", false);
    }

    @Test
    public void test0570() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0570");
        com.reservation_system.model.Researcher researcher5 = new com.reservation_system.model.Researcher((int) (short) -1, "faculty", "researcher", "hi!", true);
        java.lang.String str6 = researcher5.getUserType();
        java.lang.String str7 = researcher5.getEmail();
        java.lang.String str8 = researcher5.getPassword();
        java.lang.String str9 = researcher5.getUserType();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Researcher" + "'", str6, "Researcher");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "researcher" + "'", str7, "researcher");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Researcher" + "'", str9, "Researcher");
    }

    @Test
    public void test0571() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0571");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("data/test-userrepo.csv");
        boolean boolean2 = userRepository1.headLabCoordinatorExists();
        com.reservation_system.services.RegistrationService registrationService3 = new com.reservation_system.services.RegistrationService(userRepository1);
        boolean boolean4 = userRepository1.headLabCoordinatorExists();
        boolean boolean6 = userRepository1.emailExists("Andrew");
        com.reservation_system.repository.UserRepository userRepository8 = new com.reservation_system.repository.UserRepository("data/test-userrepo.csv");
        java.util.List<com.reservation_system.model.User> userList9 = userRepository8.getAllUsers();
        com.reservation_system.services.RegistrationService registrationService10 = new com.reservation_system.services.RegistrationService(userRepository8);
        com.reservation_system.services.RegistrationService registrationService11 = new com.reservation_system.services.RegistrationService(userRepository8);
        java.util.Optional<com.reservation_system.model.User> userOptional13 = userRepository8.findByEmail("andrew@example.com");
        java.util.List<com.reservation_system.model.User> userList14 = userRepository8.getAllUsers();
        userRepository1.saveAllUsers(userList14);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(userList9);
        org.junit.Assert.assertNotNull(userOptional13);
        org.junit.Assert.assertNotNull(userList14);
    }

    @Test
    public void test0572() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0572");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("data/test-userrepo.csv");
        com.reservation_system.services.RegistrationService registrationService2 = new com.reservation_system.services.RegistrationService(userRepository1);
        com.reservation_system.model.Faculty faculty8 = new com.reservation_system.model.Faculty(0, "Password1!", "data/test-userrepo.csv", "researcher", false);
        java.lang.String str9 = faculty8.getName();
        userRepository1.addUser((com.reservation_system.model.User) faculty8);
        boolean boolean12 = userRepository1.emailExists("Faculty");
        int int13 = userRepository1.getNextID();
        com.reservation_system.services.RegistrationService registrationService14 = new com.reservation_system.services.RegistrationService(userRepository1);
        com.reservation_system.services.RegistrationService registrationService15 = new com.reservation_system.services.RegistrationService(userRepository1);
        // The following exception was thrown during execution in test generation
        try {
            com.reservation_system.model.User user20 = registrationService15.registerUser("", "guest", "faculty", "data/test-userrepo.csv");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid user type.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Password1!" + "'", str9, "Password1!");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 103 + "'", int13 == 103);
    }

    @Test
    public void test0573() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0573");
        com.reservation_system.model.Student student5 = new com.reservation_system.model.Student((int) (byte) 1, "headlabcoordinator", "Guest", "hi!", true);
        boolean boolean6 = student5.isApproved();
        int int7 = student5.getID();
        java.lang.String str8 = student5.getUserType();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Student" + "'", str8, "Student");
    }

    @Test
    public void test0574() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0574");
        com.reservation_system.model.HeadLabCoordinator headLabCoordinator5 = new com.reservation_system.model.HeadLabCoordinator(1, "student", "Researcher", "", false);
        java.lang.String str6 = headLabCoordinator5.getUserType();
        java.lang.String str7 = headLabCoordinator5.getUserType();
        java.lang.String str8 = headLabCoordinator5.getUserType();
        java.lang.String str9 = headLabCoordinator5.getPassword();
        boolean boolean10 = headLabCoordinator5.requiresDepartmentApproval();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "headlabcoordinator" + "'", str6, "headlabcoordinator");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "headlabcoordinator" + "'", str7, "headlabcoordinator");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "headlabcoordinator" + "'", str8, "headlabcoordinator");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test0575() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0575");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("data/test-userrepo.csv");
        boolean boolean2 = userRepository1.headLabCoordinatorExists();
        com.reservation_system.services.RegistrationService registrationService3 = new com.reservation_system.services.RegistrationService(userRepository1);
        boolean boolean4 = userRepository1.headLabCoordinatorExists();
        boolean boolean6 = userRepository1.emailExists("Andrew");
        com.reservation_system.services.RegistrationService registrationService7 = new com.reservation_system.services.RegistrationService(userRepository1);
        com.reservation_system.repository.UserRepository userRepository9 = new com.reservation_system.repository.UserRepository("data/test-userrepo.csv");
        com.reservation_system.services.RegistrationService registrationService10 = new com.reservation_system.services.RegistrationService(userRepository9);
        com.reservation_system.model.Faculty faculty16 = new com.reservation_system.model.Faculty(0, "Password1!", "data/test-userrepo.csv", "researcher", false);
        java.lang.String str17 = faculty16.getName();
        userRepository9.addUser((com.reservation_system.model.User) faculty16);
        boolean boolean19 = userRepository9.headLabCoordinatorExists();
        com.reservation_system.model.Guest guest25 = new com.reservation_system.model.Guest((int) (byte) -1, "guest", "Researcher", "Faculty", true);
        userRepository9.addUser((com.reservation_system.model.User) guest25);
        java.util.List<com.reservation_system.model.User> userList27 = userRepository9.getAllUsers();
        userRepository1.saveAllUsers(userList27);
        boolean boolean29 = userRepository1.headLabCoordinatorExists();
        java.util.Optional<com.reservation_system.model.User> userOptional31 = userRepository1.findByEmail("hi!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "Password1!" + "'", str17, "Password1!");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNotNull(userList27);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertNotNull(userOptional31);
    }

    @Test
    public void test0576() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0576");
        com.reservation_system.model.Researcher researcher5 = new com.reservation_system.model.Researcher(0, "", "", "data/test-userrepo.csv", false);
        java.lang.String str6 = researcher5.getUserType();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Researcher" + "'", str6, "Researcher");
    }

    @Test
    public void test0577() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0577");
        com.reservation_system.model.Researcher researcher5 = new com.reservation_system.model.Researcher((int) (byte) 1, "Andrew", "guest", "Password1!", false);
        java.lang.String str6 = researcher5.getEmail();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "guest" + "'", str6, "guest");
    }

    @Test
    public void test0578() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0578");
        com.reservation_system.model.HeadLabCoordinator headLabCoordinator5 = new com.reservation_system.model.HeadLabCoordinator((int) (byte) 100, "researcher", "Researcher", "Student", true);
        java.lang.Class<?> wildcardClass6 = headLabCoordinator5.getClass();
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0579() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0579");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("data/test-userrepo.csv");
        com.reservation_system.services.RegistrationService registrationService2 = new com.reservation_system.services.RegistrationService(userRepository1);
        com.reservation_system.model.Faculty faculty8 = new com.reservation_system.model.Faculty(0, "Password1!", "data/test-userrepo.csv", "researcher", false);
        java.lang.String str9 = faculty8.getName();
        userRepository1.addUser((com.reservation_system.model.User) faculty8);
        com.reservation_system.services.RegistrationService registrationService11 = new com.reservation_system.services.RegistrationService(userRepository1);
        // The following exception was thrown during execution in test generation
        try {
            com.reservation_system.model.User user16 = registrationService11.registerUser("", "", "labmanager", "Guest");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid user type.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Password1!" + "'", str9, "Password1!");
    }

    @Test
    public void test0580() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0580");
        com.reservation_system.model.Student student5 = new com.reservation_system.model.Student((int) (short) 10, "headlabcoordinator", "student", "data/test-userrepo.csv", true);
    }

    @Test
    public void test0581() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0581");
        // The following exception was thrown during execution in test generation
        try {
            com.reservation_system.model.User user6 = com.reservation_system.patterns.factory.UserFactory.createUser("Andrew", 1, "student", "researcher", "student", false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid user type: Andrew");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0582() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0582");
        com.reservation_system.model.HeadLabCoordinator headLabCoordinator5 = new com.reservation_system.model.HeadLabCoordinator((int) '4', "", "Password1!", "Researcher", false);
    }

    @Test
    public void test0583() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0583");
        com.reservation_system.model.LabManager labManager5 = new com.reservation_system.model.LabManager((int) 'a', "headlabcoordinator", "Researcher", "Andrew", false);
        java.lang.String str6 = labManager5.getName();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "headlabcoordinator" + "'", str6, "headlabcoordinator");
    }

    @Test
    public void test0584() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0584");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("data/test-userrepo.csv");
        boolean boolean2 = userRepository1.headLabCoordinatorExists();
        com.reservation_system.services.RegistrationService registrationService3 = new com.reservation_system.services.RegistrationService(userRepository1);
        boolean boolean5 = userRepository1.emailExists("");
        java.util.List<com.reservation_system.model.User> userList6 = userRepository1.getAllUsers();
        com.reservation_system.services.RegistrationService registrationService7 = new com.reservation_system.services.RegistrationService(userRepository1);
        // The following exception was thrown during execution in test generation
        try {
            com.reservation_system.model.User user12 = registrationService7.registerUser("andrew@example.com", "headlabcoordinator", "guest", "Andrew");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid user type.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(userList6);
    }

    @Test
    public void test0585() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0585");
        com.reservation_system.model.Guest guest5 = new com.reservation_system.model.Guest(1, "Faculty", "Student", "researcher", false);
    }

    @Test
    public void test0586() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0586");
        com.reservation_system.model.HeadLabCoordinator headLabCoordinator5 = new com.reservation_system.model.HeadLabCoordinator((int) (byte) 10, "Faculty", "Student", "Guest", false);
    }

    @Test
    public void test0587() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0587");
        com.reservation_system.model.Guest guest5 = new com.reservation_system.model.Guest((int) '#', "Andrew", "student", "Faculty", false);
        java.lang.String str6 = guest5.getUserType();
        guest5.setApproved(true);
        java.lang.String str9 = guest5.getUserType();
        java.lang.String str10 = guest5.getName();
        java.lang.String str11 = guest5.getPassword();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Guest" + "'", str6, "Guest");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Guest" + "'", str9, "Guest");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Andrew" + "'", str10, "Andrew");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Faculty" + "'", str11, "Faculty");
    }

    @Test
    public void test0588() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0588");
        com.reservation_system.model.Guest guest5 = new com.reservation_system.model.Guest((int) (byte) 10, "Andrew", "Student", "guest", true);
        java.lang.String str6 = guest5.getUserType();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Guest" + "'", str6, "Guest");
    }

    @Test
    public void test0589() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0589");
        com.reservation_system.model.HeadLabCoordinator headLabCoordinator5 = new com.reservation_system.model.HeadLabCoordinator((int) (short) 100, "", "andrew@example.com", "", false);
    }

    @Test
    public void test0590() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0590");
        com.reservation_system.model.Guest guest5 = new com.reservation_system.model.Guest((int) (short) 0, "Guest", "headlabcoordinator", "", true);
        java.lang.String str6 = guest5.getUserType();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Guest" + "'", str6, "Guest");
    }

    @Test
    public void test0591() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0591");
        com.reservation_system.model.User user6 = com.reservation_system.patterns.factory.UserFactory.createUser("student", (int) (byte) 100, "faculty", "", "labmanager", false);
        boolean boolean7 = user6.requiresDepartmentApproval();
        org.junit.Assert.assertNotNull(user6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test0592() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0592");
        com.reservation_system.model.Faculty faculty5 = new com.reservation_system.model.Faculty(10, "student", "Researcher", "Researcher", true);
    }

    @Test
    public void test0593() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0593");
        com.reservation_system.model.Student student5 = new com.reservation_system.model.Student((int) (byte) 10, "Researcher", "Password1!", "headlabcoordinator", true);
        java.lang.String str6 = student5.getUserType();
        java.lang.String str7 = student5.getEmail();
        java.lang.String str8 = student5.getUserType();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Student" + "'", str6, "Student");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Password1!" + "'", str7, "Password1!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Student" + "'", str8, "Student");
    }

    @Test
    public void test0594() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0594");
        com.reservation_system.model.Faculty faculty5 = new com.reservation_system.model.Faculty(0, "Password1!", "data/test-userrepo.csv", "researcher", false);
        java.lang.String str6 = faculty5.getUserType();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Faculty" + "'", str6, "Faculty");
    }

    @Test
    public void test0595() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0595");
        com.reservation_system.model.HeadLabCoordinator headLabCoordinator5 = new com.reservation_system.model.HeadLabCoordinator(1, "student", "Researcher", "", false);
        int int6 = headLabCoordinator5.getID();
        java.lang.String str7 = headLabCoordinator5.getUserType();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "headlabcoordinator" + "'", str7, "headlabcoordinator");
    }

    @Test
    public void test0596() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0596");
        com.reservation_system.model.LabManager labManager5 = new com.reservation_system.model.LabManager((int) 'a', "headlabcoordinator", "Researcher", "Andrew", false);
        java.lang.String str6 = labManager5.getEmail();
        java.lang.String str7 = labManager5.getEmail();
        java.lang.String str8 = labManager5.getPassword();
        int int9 = labManager5.getID();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Researcher" + "'", str6, "Researcher");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Researcher" + "'", str7, "Researcher");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Andrew" + "'", str8, "Andrew");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 97 + "'", int9 == 97);
    }

    @Test
    public void test0597() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0597");
        com.reservation_system.model.Researcher researcher5 = new com.reservation_system.model.Researcher((int) (short) -1, "andrew@example.com", "guest", "labmanager", false);
        java.lang.String str6 = researcher5.getEmail();
        researcher5.setApproved(true);
        java.lang.String str9 = researcher5.getUserType();
        java.lang.String str10 = researcher5.getUserType();
        java.lang.String str11 = researcher5.getPassword();
        java.lang.String str12 = researcher5.getUserType();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "guest" + "'", str6, "guest");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Researcher" + "'", str9, "Researcher");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Researcher" + "'", str10, "Researcher");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "labmanager" + "'", str11, "labmanager");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Researcher" + "'", str12, "Researcher");
    }

    @Test
    public void test0598() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0598");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("data/test-userrepo.csv");
        java.util.Optional<com.reservation_system.model.User> userOptional3 = userRepository1.findByEmail("hi!");
        int int4 = userRepository1.getNextID();
        com.reservation_system.model.Researcher researcher10 = new com.reservation_system.model.Researcher((int) (byte) 10, "", "Guest", "headlabcoordinator", true);
        userRepository1.addUser((com.reservation_system.model.User) researcher10);
        java.util.List<com.reservation_system.model.User> userList12 = userRepository1.getAllUsers();
        com.reservation_system.model.Student student18 = new com.reservation_system.model.Student((int) (byte) 10, "hi!", "labmanager", "Password1!", false);
        userRepository1.addUser((com.reservation_system.model.User) student18);
        java.util.Optional<com.reservation_system.model.User> userOptional21 = userRepository1.findByEmail("researcher");
        com.reservation_system.model.Faculty faculty27 = new com.reservation_system.model.Faculty((int) '4', "labmanager", "guest", "", false);
        java.lang.String str28 = faculty27.getUserType();
        userRepository1.addUser((com.reservation_system.model.User) faculty27);
        org.junit.Assert.assertNotNull(userOptional3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 103 + "'", int4 == 103);
        org.junit.Assert.assertNotNull(userList12);
        org.junit.Assert.assertNotNull(userOptional21);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "Faculty" + "'", str28, "Faculty");
    }

    @Test
    public void test0599() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0599");
        com.reservation_system.model.Faculty faculty5 = new com.reservation_system.model.Faculty((int) 'a', "Password1!", "andrew@example.com", "Andrew", true);
        java.lang.String str6 = faculty5.getUserType();
        java.lang.String str7 = faculty5.getName();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Faculty" + "'", str6, "Faculty");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Password1!" + "'", str7, "Password1!");
    }

    @Test
    public void test0600() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0600");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("data/test-userrepo.csv");
        boolean boolean2 = userRepository1.headLabCoordinatorExists();
        com.reservation_system.repository.UserRepository userRepository4 = new com.reservation_system.repository.UserRepository("data/test-userrepo.csv");
        com.reservation_system.services.RegistrationService registrationService5 = new com.reservation_system.services.RegistrationService(userRepository4);
        com.reservation_system.model.Faculty faculty11 = new com.reservation_system.model.Faculty(0, "Password1!", "data/test-userrepo.csv", "researcher", false);
        java.lang.String str12 = faculty11.getName();
        userRepository4.addUser((com.reservation_system.model.User) faculty11);
        java.util.List<com.reservation_system.model.User> userList14 = userRepository4.getAllUsers();
        userRepository1.saveAllUsers(userList14);
        com.reservation_system.services.RegistrationService registrationService16 = new com.reservation_system.services.RegistrationService(userRepository1);
        com.reservation_system.services.RegistrationService registrationService17 = new com.reservation_system.services.RegistrationService(userRepository1);
        // The following exception was thrown during execution in test generation
        try {
            com.reservation_system.model.User user22 = registrationService17.registerUser("", "andrew@example.com", "Faculty", "Researcher");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid user type.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Password1!" + "'", str12, "Password1!");
        org.junit.Assert.assertNotNull(userList14);
    }

    @Test
    public void test0601() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0601");
        com.reservation_system.model.Student student5 = new com.reservation_system.model.Student((int) ' ', "", "labmanager", "headlabcoordinator", true);
        student5.setApproved(false);
        boolean boolean8 = student5.isApproved();
        boolean boolean9 = student5.isApproved();
        int int10 = student5.getID();
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 32 + "'", int10 == 32);
    }

    @Test
    public void test0602() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0602");
        com.reservation_system.model.Faculty faculty5 = new com.reservation_system.model.Faculty((int) (short) 1, "labmanager", "Student", "andrew@example.com", true);
    }

    @Test
    public void test0603() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0603");
        com.reservation_system.model.Guest guest5 = new com.reservation_system.model.Guest((int) (byte) 100, "andrew@example.com", "student", "Researcher", false);
        java.lang.String str6 = guest5.getEmail();
        java.lang.String str7 = guest5.getUserType();
        int int8 = guest5.getID();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "student" + "'", str6, "student");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Guest" + "'", str7, "Guest");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8 == 100);
    }

    @Test
    public void test0604() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0604");
        com.reservation_system.model.Guest guest5 = new com.reservation_system.model.Guest(101, "Guest", "Researcher", "andrew@example.com", true);
        java.lang.String str6 = guest5.getUserType();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Guest" + "'", str6, "Guest");
    }

    @Test
    public void test0605() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0605");
        com.reservation_system.model.Student student5 = new com.reservation_system.model.Student((int) (byte) 100, "Researcher", "", "", false);
        boolean boolean6 = student5.isApproved();
        java.lang.String str7 = student5.getPassword();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
    }

    @Test
    public void test0606() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0606");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("data/test-userrepo.csv");
        com.reservation_system.services.RegistrationService registrationService2 = new com.reservation_system.services.RegistrationService(userRepository1);
        com.reservation_system.model.Faculty faculty8 = new com.reservation_system.model.Faculty(0, "Password1!", "data/test-userrepo.csv", "researcher", false);
        java.lang.String str9 = faculty8.getName();
        userRepository1.addUser((com.reservation_system.model.User) faculty8);
        boolean boolean12 = userRepository1.emailExists("Faculty");
        int int13 = userRepository1.getNextID();
        int int14 = userRepository1.getNextID();
        com.reservation_system.model.Guest guest20 = new com.reservation_system.model.Guest((int) '#', "Guest", "researcher", "headlabcoordinator", true);
        userRepository1.addUser((com.reservation_system.model.User) guest20);
        java.lang.String str22 = guest20.getUserType();
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Password1!" + "'", str9, "Password1!");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 103 + "'", int13 == 103);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 103 + "'", int14 == 103);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "Guest" + "'", str22, "Guest");
    }

    @Test
    public void test0607() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0607");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("data/test-userrepo.csv");
        java.util.Optional<com.reservation_system.model.User> userOptional3 = userRepository1.findByEmail("hi!");
        int int4 = userRepository1.getNextID();
        com.reservation_system.services.RegistrationService registrationService5 = new com.reservation_system.services.RegistrationService(userRepository1);
        // The following exception was thrown during execution in test generation
        try {
            com.reservation_system.model.User user10 = registrationService5.registerUser("", "Andrew", "Researcher", "Password1!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid user type.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(userOptional3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 103 + "'", int4 == 103);
    }

    @Test
    public void test0608() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0608");
        com.reservation_system.model.User user6 = com.reservation_system.patterns.factory.UserFactory.createUser("headlabcoordinator", 103, "researcher", "", "", true);
        org.junit.Assert.assertNotNull(user6);
    }

    @Test
    public void test0609() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0609");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("data/test-userrepo.csv");
        boolean boolean2 = userRepository1.headLabCoordinatorExists();
        com.reservation_system.services.RegistrationService registrationService3 = new com.reservation_system.services.RegistrationService(userRepository1);
        boolean boolean5 = userRepository1.emailExists("");
        boolean boolean6 = userRepository1.headLabCoordinatorExists();
        com.reservation_system.services.RegistrationService registrationService7 = new com.reservation_system.services.RegistrationService(userRepository1);
        // The following exception was thrown during execution in test generation
        try {
            com.reservation_system.model.User user12 = registrationService7.registerUser("Researcher", "Guest", "Researcher", "Faculty");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid email format.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test0610() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0610");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("data/test-userrepo.csv");
        com.reservation_system.services.RegistrationService registrationService2 = new com.reservation_system.services.RegistrationService(userRepository1);
        com.reservation_system.model.Faculty faculty8 = new com.reservation_system.model.Faculty(0, "Password1!", "data/test-userrepo.csv", "researcher", false);
        java.lang.String str9 = faculty8.getName();
        userRepository1.addUser((com.reservation_system.model.User) faculty8);
        boolean boolean11 = userRepository1.headLabCoordinatorExists();
        com.reservation_system.model.Guest guest17 = new com.reservation_system.model.Guest((int) (byte) -1, "guest", "Researcher", "Faculty", true);
        userRepository1.addUser((com.reservation_system.model.User) guest17);
        boolean boolean19 = userRepository1.headLabCoordinatorExists();
        com.reservation_system.repository.UserRepository userRepository21 = new com.reservation_system.repository.UserRepository("data/test-userrepo.csv");
        com.reservation_system.services.RegistrationService registrationService22 = new com.reservation_system.services.RegistrationService(userRepository21);
        com.reservation_system.model.Faculty faculty28 = new com.reservation_system.model.Faculty(0, "Password1!", "data/test-userrepo.csv", "researcher", false);
        java.lang.String str29 = faculty28.getName();
        userRepository21.addUser((com.reservation_system.model.User) faculty28);
        boolean boolean31 = userRepository21.headLabCoordinatorExists();
        com.reservation_system.repository.UserRepository userRepository33 = new com.reservation_system.repository.UserRepository("data/test-userrepo.csv");
        com.reservation_system.services.RegistrationService registrationService34 = new com.reservation_system.services.RegistrationService(userRepository33);
        com.reservation_system.model.Faculty faculty40 = new com.reservation_system.model.Faculty(0, "Password1!", "data/test-userrepo.csv", "researcher", false);
        java.lang.String str41 = faculty40.getName();
        userRepository33.addUser((com.reservation_system.model.User) faculty40);
        java.util.List<com.reservation_system.model.User> userList43 = userRepository33.getAllUsers();
        userRepository21.saveAllUsers(userList43);
        userRepository1.saveAllUsers(userList43);
        java.util.List<com.reservation_system.model.User> userList46 = userRepository1.getAllUsers();
        com.reservation_system.repository.UserRepository userRepository48 = new com.reservation_system.repository.UserRepository("data/test-userrepo.csv");
        boolean boolean49 = userRepository48.headLabCoordinatorExists();
        com.reservation_system.services.RegistrationService registrationService50 = new com.reservation_system.services.RegistrationService(userRepository48);
        boolean boolean51 = userRepository48.headLabCoordinatorExists();
        boolean boolean52 = userRepository48.headLabCoordinatorExists();
        com.reservation_system.repository.UserRepository userRepository54 = new com.reservation_system.repository.UserRepository("data/test-userrepo.csv");
        com.reservation_system.services.RegistrationService registrationService55 = new com.reservation_system.services.RegistrationService(userRepository54);
        com.reservation_system.model.Faculty faculty61 = new com.reservation_system.model.Faculty(0, "Password1!", "data/test-userrepo.csv", "researcher", false);
        java.lang.String str62 = faculty61.getName();
        userRepository54.addUser((com.reservation_system.model.User) faculty61);
        boolean boolean64 = userRepository54.headLabCoordinatorExists();
        int int65 = userRepository54.getNextID();
        com.reservation_system.repository.UserRepository userRepository67 = new com.reservation_system.repository.UserRepository("data/test-userrepo.csv");
        java.util.List<com.reservation_system.model.User> userList68 = userRepository67.getAllUsers();
        com.reservation_system.services.RegistrationService registrationService69 = new com.reservation_system.services.RegistrationService(userRepository67);
        java.util.List<com.reservation_system.model.User> userList70 = userRepository67.getAllUsers();
        userRepository54.saveAllUsers(userList70);
        userRepository48.saveAllUsers(userList70);
        java.util.List<com.reservation_system.model.User> userList73 = userRepository48.getAllUsers();
        userRepository1.saveAllUsers(userList73);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Password1!" + "'", str9, "Password1!");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "Password1!" + "'", str29, "Password1!");
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "Password1!" + "'", str41, "Password1!");
        org.junit.Assert.assertNotNull(userList43);
        org.junit.Assert.assertNotNull(userList46);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + true + "'", boolean49 == true);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + true + "'", boolean51 == true);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + true + "'", boolean52 == true);
        org.junit.Assert.assertEquals("'" + str62 + "' != '" + "Password1!" + "'", str62, "Password1!");
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + true + "'", boolean64 == true);
        org.junit.Assert.assertTrue("'" + int65 + "' != '" + 103 + "'", int65 == 103);
        org.junit.Assert.assertNotNull(userList68);
        org.junit.Assert.assertNotNull(userList70);
        org.junit.Assert.assertNotNull(userList73);
    }

    @Test
    public void test0611() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0611");
        com.reservation_system.model.Guest guest5 = new com.reservation_system.model.Guest((int) (byte) 1, "data/test-userrepo.csv", "Andrew", "faculty", true);
        java.lang.String str6 = guest5.getUserType();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Guest" + "'", str6, "Guest");
    }

    @Test
    public void test0612() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0612");
        com.reservation_system.model.Guest guest5 = new com.reservation_system.model.Guest((int) (byte) 100, "andrew@example.com", "student", "Researcher", false);
        java.lang.String str6 = guest5.getEmail();
        java.lang.String str7 = guest5.getUserType();
        java.lang.String str8 = guest5.getUserType();
        java.lang.String str9 = guest5.getUserType();
        int int10 = guest5.getID();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "student" + "'", str6, "student");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Guest" + "'", str7, "Guest");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Guest" + "'", str8, "Guest");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Guest" + "'", str9, "Guest");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 100 + "'", int10 == 100);
    }

    @Test
    public void test0613() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0613");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("data/test-userrepo.csv");
        java.util.Optional<com.reservation_system.model.User> userOptional3 = userRepository1.findByEmail("hi!");
        int int4 = userRepository1.getNextID();
        com.reservation_system.model.Researcher researcher10 = new com.reservation_system.model.Researcher((int) (byte) 10, "", "Guest", "headlabcoordinator", true);
        userRepository1.addUser((com.reservation_system.model.User) researcher10);
        java.util.List<com.reservation_system.model.User> userList12 = userRepository1.getAllUsers();
        com.reservation_system.model.Student student18 = new com.reservation_system.model.Student((int) (byte) 10, "hi!", "labmanager", "Password1!", false);
        userRepository1.addUser((com.reservation_system.model.User) student18);
        com.reservation_system.model.Researcher researcher25 = new com.reservation_system.model.Researcher((-1), "data/test-userrepo.csv", "headlabcoordinator", "", false);
        userRepository1.addUser((com.reservation_system.model.User) researcher25);
        com.reservation_system.repository.UserRepository userRepository28 = new com.reservation_system.repository.UserRepository("data/test-userrepo.csv");
        java.util.List<com.reservation_system.model.User> userList29 = userRepository28.getAllUsers();
        com.reservation_system.services.RegistrationService registrationService30 = new com.reservation_system.services.RegistrationService(userRepository28);
        int int31 = userRepository28.getNextID();
        com.reservation_system.model.Student student37 = new com.reservation_system.model.Student(100, "Faculty", "Student", "hi!", true);
        java.lang.String str38 = student37.getUserType();
        java.lang.String str39 = student37.getUserType();
        userRepository28.addUser((com.reservation_system.model.User) student37);
        userRepository1.addUser((com.reservation_system.model.User) student37);
        com.reservation_system.model.HeadLabCoordinator headLabCoordinator47 = new com.reservation_system.model.HeadLabCoordinator(97, "guest", "researcher", "andrew@example.com", true);
        userRepository1.addUser((com.reservation_system.model.User) headLabCoordinator47);
        org.junit.Assert.assertNotNull(userOptional3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 103 + "'", int4 == 103);
        org.junit.Assert.assertNotNull(userList12);
        org.junit.Assert.assertNotNull(userList29);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 103 + "'", int31 == 103);
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "Student" + "'", str38, "Student");
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "Student" + "'", str39, "Student");
    }

    @Test
    public void test0614() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0614");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("data/test-userrepo.csv");
        com.reservation_system.services.RegistrationService registrationService2 = new com.reservation_system.services.RegistrationService(userRepository1);
        com.reservation_system.model.Faculty faculty8 = new com.reservation_system.model.Faculty(0, "Password1!", "data/test-userrepo.csv", "researcher", false);
        java.lang.String str9 = faculty8.getName();
        userRepository1.addUser((com.reservation_system.model.User) faculty8);
        int int11 = userRepository1.getNextID();
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Password1!" + "'", str9, "Password1!");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 103 + "'", int11 == 103);
    }

    @Test
    public void test0615() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0615");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("data/test-userrepo.csv");
        int int2 = userRepository1.getNextID();
        com.reservation_system.repository.UserRepository userRepository4 = new com.reservation_system.repository.UserRepository("data/test-userrepo.csv");
        boolean boolean5 = userRepository4.headLabCoordinatorExists();
        com.reservation_system.repository.UserRepository userRepository7 = new com.reservation_system.repository.UserRepository("data/test-userrepo.csv");
        com.reservation_system.services.RegistrationService registrationService8 = new com.reservation_system.services.RegistrationService(userRepository7);
        com.reservation_system.model.Faculty faculty14 = new com.reservation_system.model.Faculty(0, "Password1!", "data/test-userrepo.csv", "researcher", false);
        java.lang.String str15 = faculty14.getName();
        userRepository7.addUser((com.reservation_system.model.User) faculty14);
        java.util.List<com.reservation_system.model.User> userList17 = userRepository7.getAllUsers();
        userRepository4.saveAllUsers(userList17);
        com.reservation_system.services.RegistrationService registrationService19 = new com.reservation_system.services.RegistrationService(userRepository4);
        java.util.List<com.reservation_system.model.User> userList20 = userRepository4.getAllUsers();
        java.util.List<com.reservation_system.model.User> userList21 = userRepository4.getAllUsers();
        userRepository1.saveAllUsers(userList21);
        com.reservation_system.repository.UserRepository userRepository24 = new com.reservation_system.repository.UserRepository("data/test-userrepo.csv");
        com.reservation_system.services.RegistrationService registrationService25 = new com.reservation_system.services.RegistrationService(userRepository24);
        com.reservation_system.model.Faculty faculty31 = new com.reservation_system.model.Faculty(0, "Password1!", "data/test-userrepo.csv", "researcher", false);
        java.lang.String str32 = faculty31.getName();
        userRepository24.addUser((com.reservation_system.model.User) faculty31);
        boolean boolean34 = userRepository24.headLabCoordinatorExists();
        int int35 = userRepository24.getNextID();
        com.reservation_system.repository.UserRepository userRepository37 = new com.reservation_system.repository.UserRepository("data/test-userrepo.csv");
        com.reservation_system.services.RegistrationService registrationService38 = new com.reservation_system.services.RegistrationService(userRepository37);
        int int39 = userRepository37.getNextID();
        boolean boolean41 = userRepository37.emailExists("labmanager");
        java.util.List<com.reservation_system.model.User> userList42 = userRepository37.getAllUsers();
        userRepository24.saveAllUsers(userList42);
        userRepository1.saveAllUsers(userList42);
        com.reservation_system.services.RegistrationService registrationService45 = new com.reservation_system.services.RegistrationService(userRepository1);
        // The following exception was thrown during execution in test generation
        try {
            com.reservation_system.model.User user50 = registrationService45.registerUser("researcher", "andrew@example.com", "Guest", "");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid email format.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 103 + "'", int2 == 103);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Password1!" + "'", str15, "Password1!");
        org.junit.Assert.assertNotNull(userList17);
        org.junit.Assert.assertNotNull(userList20);
        org.junit.Assert.assertNotNull(userList21);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "Password1!" + "'", str32, "Password1!");
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 103 + "'", int35 == 103);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 103 + "'", int39 == 103);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + true + "'", boolean41 == true);
        org.junit.Assert.assertNotNull(userList42);
    }

    @Test
    public void test0616() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0616");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("data/test-userrepo.csv");
        com.reservation_system.services.RegistrationService registrationService2 = new com.reservation_system.services.RegistrationService(userRepository1);
        com.reservation_system.model.Faculty faculty8 = new com.reservation_system.model.Faculty(0, "Password1!", "data/test-userrepo.csv", "researcher", false);
        java.lang.String str9 = faculty8.getName();
        userRepository1.addUser((com.reservation_system.model.User) faculty8);
        boolean boolean12 = userRepository1.emailExists("Faculty");
        int int13 = userRepository1.getNextID();
        com.reservation_system.services.RegistrationService registrationService14 = new com.reservation_system.services.RegistrationService(userRepository1);
        java.util.Optional<com.reservation_system.model.User> userOptional16 = userRepository1.findByEmail("Andrew");
        java.util.List<com.reservation_system.model.User> userList17 = userRepository1.getAllUsers();
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Password1!" + "'", str9, "Password1!");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 103 + "'", int13 == 103);
        org.junit.Assert.assertNotNull(userOptional16);
        org.junit.Assert.assertNotNull(userList17);
    }

    @Test
    public void test0617() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0617");
        com.reservation_system.model.User user6 = com.reservation_system.patterns.factory.UserFactory.createUser("Student", (int) '4', "Password1!", "Guest", "Researcher", true);
        boolean boolean7 = user6.isApproved();
        boolean boolean8 = user6.requiresDepartmentApproval();
        org.junit.Assert.assertNotNull(user6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test0618() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0618");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("data/test-userrepo.csv");
        boolean boolean2 = userRepository1.headLabCoordinatorExists();
        com.reservation_system.repository.UserRepository userRepository4 = new com.reservation_system.repository.UserRepository("data/test-userrepo.csv");
        com.reservation_system.services.RegistrationService registrationService5 = new com.reservation_system.services.RegistrationService(userRepository4);
        com.reservation_system.model.Faculty faculty11 = new com.reservation_system.model.Faculty(0, "Password1!", "data/test-userrepo.csv", "researcher", false);
        java.lang.String str12 = faculty11.getName();
        userRepository4.addUser((com.reservation_system.model.User) faculty11);
        boolean boolean14 = userRepository4.headLabCoordinatorExists();
        com.reservation_system.model.Guest guest20 = new com.reservation_system.model.Guest((int) (byte) -1, "guest", "Researcher", "Faculty", true);
        userRepository4.addUser((com.reservation_system.model.User) guest20);
        boolean boolean22 = userRepository4.headLabCoordinatorExists();
        com.reservation_system.repository.UserRepository userRepository24 = new com.reservation_system.repository.UserRepository("data/test-userrepo.csv");
        com.reservation_system.services.RegistrationService registrationService25 = new com.reservation_system.services.RegistrationService(userRepository24);
        com.reservation_system.model.Faculty faculty31 = new com.reservation_system.model.Faculty(0, "Password1!", "data/test-userrepo.csv", "researcher", false);
        java.lang.String str32 = faculty31.getName();
        userRepository24.addUser((com.reservation_system.model.User) faculty31);
        boolean boolean34 = userRepository24.headLabCoordinatorExists();
        com.reservation_system.repository.UserRepository userRepository36 = new com.reservation_system.repository.UserRepository("data/test-userrepo.csv");
        com.reservation_system.services.RegistrationService registrationService37 = new com.reservation_system.services.RegistrationService(userRepository36);
        com.reservation_system.model.Faculty faculty43 = new com.reservation_system.model.Faculty(0, "Password1!", "data/test-userrepo.csv", "researcher", false);
        java.lang.String str44 = faculty43.getName();
        userRepository36.addUser((com.reservation_system.model.User) faculty43);
        java.util.List<com.reservation_system.model.User> userList46 = userRepository36.getAllUsers();
        userRepository24.saveAllUsers(userList46);
        userRepository4.saveAllUsers(userList46);
        userRepository1.saveAllUsers(userList46);
        com.reservation_system.services.RegistrationService registrationService50 = new com.reservation_system.services.RegistrationService(userRepository1);
        // The following exception was thrown during execution in test generation
        try {
            com.reservation_system.model.User user55 = registrationService50.registerUser("headlabcoordinator", "hi!", "student", "student");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: A head lab coordinator account already exists.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Password1!" + "'", str12, "Password1!");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "Password1!" + "'", str32, "Password1!");
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "Password1!" + "'", str44, "Password1!");
        org.junit.Assert.assertNotNull(userList46);
    }

    @Test
    public void test0619() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0619");
        com.reservation_system.model.Researcher researcher5 = new com.reservation_system.model.Researcher(102, "Password1!", "hi!", "andrew@example.com", true);
        java.lang.String str6 = researcher5.getUserType();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Researcher" + "'", str6, "Researcher");
    }

    @Test
    public void test0620() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0620");
        com.reservation_system.model.Guest guest5 = new com.reservation_system.model.Guest((int) (byte) -1, "Andrew", "faculty", "guest", false);
    }

    @Test
    public void test0621() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0621");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("data/test-userrepo.csv");
        boolean boolean2 = userRepository1.headLabCoordinatorExists();
        com.reservation_system.services.RegistrationService registrationService3 = new com.reservation_system.services.RegistrationService(userRepository1);
        boolean boolean4 = userRepository1.headLabCoordinatorExists();
        boolean boolean6 = userRepository1.emailExists("Andrew");
        com.reservation_system.services.RegistrationService registrationService7 = new com.reservation_system.services.RegistrationService(userRepository1);
        com.reservation_system.repository.UserRepository userRepository9 = new com.reservation_system.repository.UserRepository("data/test-userrepo.csv");
        com.reservation_system.services.RegistrationService registrationService10 = new com.reservation_system.services.RegistrationService(userRepository9);
        com.reservation_system.model.Faculty faculty16 = new com.reservation_system.model.Faculty(0, "Password1!", "data/test-userrepo.csv", "researcher", false);
        java.lang.String str17 = faculty16.getName();
        userRepository9.addUser((com.reservation_system.model.User) faculty16);
        boolean boolean19 = userRepository9.headLabCoordinatorExists();
        com.reservation_system.model.Guest guest25 = new com.reservation_system.model.Guest((int) (byte) -1, "guest", "Researcher", "Faculty", true);
        userRepository9.addUser((com.reservation_system.model.User) guest25);
        java.util.List<com.reservation_system.model.User> userList27 = userRepository9.getAllUsers();
        userRepository1.saveAllUsers(userList27);
        boolean boolean29 = userRepository1.headLabCoordinatorExists();
        java.util.Optional<com.reservation_system.model.User> userOptional31 = userRepository1.findByEmail("student");
        com.reservation_system.services.RegistrationService registrationService32 = new com.reservation_system.services.RegistrationService(userRepository1);
        // The following exception was thrown during execution in test generation
        try {
            com.reservation_system.model.User user37 = registrationService32.registerUser("Guest", "hi!", "Student", "");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid email format.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "Password1!" + "'", str17, "Password1!");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNotNull(userList27);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertNotNull(userOptional31);
    }

    @Test
    public void test0622() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0622");
        com.reservation_system.model.HeadLabCoordinator headLabCoordinator5 = new com.reservation_system.model.HeadLabCoordinator(102, "faculty", "Faculty", "faculty", true);
        java.lang.String str6 = headLabCoordinator5.getPassword();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "faculty" + "'", str6, "faculty");
    }

    @Test
    public void test0623() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0623");
        com.reservation_system.model.HeadLabCoordinator headLabCoordinator5 = new com.reservation_system.model.HeadLabCoordinator((int) (short) -1, "Researcher", "andrew@example.com", "headlabcoordinator", false);
        java.lang.String str6 = headLabCoordinator5.getUserType();
        headLabCoordinator5.setApproved(true);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "headlabcoordinator" + "'", str6, "headlabcoordinator");
    }

    @Test
    public void test0624() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0624");
        com.reservation_system.model.LabManager labManager5 = new com.reservation_system.model.LabManager((int) '4', "Guest", "Faculty", "hi!", true);
    }

    @Test
    public void test0625() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0625");
        com.reservation_system.model.Faculty faculty5 = new com.reservation_system.model.Faculty(100, "andrew@example.com", "faculty", "Guest", false);
    }

    @Test
    public void test0626() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0626");
        com.reservation_system.model.LabManager labManager5 = new com.reservation_system.model.LabManager(52, "Guest", "", "student", false);
    }

    @Test
    public void test0627() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0627");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("data/test-userrepo.csv");
        java.util.List<com.reservation_system.model.User> userList2 = userRepository1.getAllUsers();
        com.reservation_system.services.RegistrationService registrationService3 = new com.reservation_system.services.RegistrationService(userRepository1);
        java.util.List<com.reservation_system.model.User> userList4 = userRepository1.getAllUsers();
        boolean boolean6 = userRepository1.emailExists("Guest");
        java.util.List<com.reservation_system.model.User> userList7 = userRepository1.getAllUsers();
        java.util.Optional<com.reservation_system.model.User> userOptional9 = userRepository1.findByEmail("Password1!");
        com.reservation_system.services.RegistrationService registrationService10 = new com.reservation_system.services.RegistrationService(userRepository1);
        // The following exception was thrown during execution in test generation
        try {
            com.reservation_system.model.User user15 = registrationService10.registerUser("headlabcoordinator", "student", "data/test-userrepo.csv", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: A head lab coordinator account already exists.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(userList2);
        org.junit.Assert.assertNotNull(userList4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(userList7);
        org.junit.Assert.assertNotNull(userOptional9);
    }

    @Test
    public void test0628() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0628");
        com.reservation_system.model.Researcher researcher5 = new com.reservation_system.model.Researcher(0, "faculty", "hi!", "Faculty", false);
        java.lang.String str6 = researcher5.getUserType();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Researcher" + "'", str6, "Researcher");
    }

    @Test
    public void test0629() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0629");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("data/test-userrepo.csv");
        boolean boolean2 = userRepository1.headLabCoordinatorExists();
        com.reservation_system.services.RegistrationService registrationService3 = new com.reservation_system.services.RegistrationService(userRepository1);
        boolean boolean4 = userRepository1.headLabCoordinatorExists();
        boolean boolean6 = userRepository1.emailExists("Andrew");
        com.reservation_system.services.RegistrationService registrationService7 = new com.reservation_system.services.RegistrationService(userRepository1);
        com.reservation_system.repository.UserRepository userRepository9 = new com.reservation_system.repository.UserRepository("data/test-userrepo.csv");
        com.reservation_system.services.RegistrationService registrationService10 = new com.reservation_system.services.RegistrationService(userRepository9);
        com.reservation_system.model.Faculty faculty16 = new com.reservation_system.model.Faculty(0, "Password1!", "data/test-userrepo.csv", "researcher", false);
        java.lang.String str17 = faculty16.getName();
        userRepository9.addUser((com.reservation_system.model.User) faculty16);
        boolean boolean19 = userRepository9.headLabCoordinatorExists();
        com.reservation_system.model.Guest guest25 = new com.reservation_system.model.Guest((int) (byte) -1, "guest", "Researcher", "Faculty", true);
        userRepository9.addUser((com.reservation_system.model.User) guest25);
        java.util.List<com.reservation_system.model.User> userList27 = userRepository9.getAllUsers();
        userRepository1.saveAllUsers(userList27);
        com.reservation_system.repository.UserRepository userRepository30 = new com.reservation_system.repository.UserRepository("data/test-userrepo.csv");
        com.reservation_system.services.RegistrationService registrationService31 = new com.reservation_system.services.RegistrationService(userRepository30);
        com.reservation_system.model.Faculty faculty37 = new com.reservation_system.model.Faculty(0, "Password1!", "data/test-userrepo.csv", "researcher", false);
        java.lang.String str38 = faculty37.getName();
        userRepository30.addUser((com.reservation_system.model.User) faculty37);
        boolean boolean40 = userRepository30.headLabCoordinatorExists();
        int int41 = userRepository30.getNextID();
        com.reservation_system.repository.UserRepository userRepository43 = new com.reservation_system.repository.UserRepository("data/test-userrepo.csv");
        com.reservation_system.services.RegistrationService registrationService44 = new com.reservation_system.services.RegistrationService(userRepository43);
        int int45 = userRepository43.getNextID();
        boolean boolean47 = userRepository43.emailExists("labmanager");
        java.util.List<com.reservation_system.model.User> userList48 = userRepository43.getAllUsers();
        userRepository30.saveAllUsers(userList48);
        userRepository1.saveAllUsers(userList48);
        com.reservation_system.model.Faculty faculty56 = new com.reservation_system.model.Faculty(10, "researcher", "faculty", "", false);
        java.lang.String str57 = faculty56.getUserType();
        java.lang.String str58 = faculty56.getUserType();
        userRepository1.addUser((com.reservation_system.model.User) faculty56);
        java.lang.String str60 = faculty56.getUserType();
        faculty56.setApproved(true);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "Password1!" + "'", str17, "Password1!");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNotNull(userList27);
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "Password1!" + "'", str38, "Password1!");
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + true + "'", boolean40 == true);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 103 + "'", int41 == 103);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 103 + "'", int45 == 103);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + true + "'", boolean47 == true);
        org.junit.Assert.assertNotNull(userList48);
        org.junit.Assert.assertEquals("'" + str57 + "' != '" + "Faculty" + "'", str57, "Faculty");
        org.junit.Assert.assertEquals("'" + str58 + "' != '" + "Faculty" + "'", str58, "Faculty");
        org.junit.Assert.assertEquals("'" + str60 + "' != '" + "Faculty" + "'", str60, "Faculty");
    }

    @Test
    public void test0630() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0630");
        com.reservation_system.model.Student student5 = new com.reservation_system.model.Student((int) (short) 1, "labmanager", "", "", true);
        java.lang.String str6 = student5.getUserType();
        java.lang.String str7 = student5.getEmail();
        student5.setApproved(true);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Student" + "'", str6, "Student");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
    }

    @Test
    public void test0631() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0631");
        com.reservation_system.model.Guest guest5 = new com.reservation_system.model.Guest((int) (byte) 10, "researcher", "Student", "researcher", true);
    }

    @Test
    public void test0632() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0632");
        // The following exception was thrown during execution in test generation
        try {
            com.reservation_system.model.User user6 = com.reservation_system.patterns.factory.UserFactory.createUser("", 100, "Guest", "Andrew", "Password1!", false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid user type: ");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0633() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0633");
        com.reservation_system.model.Student student5 = new com.reservation_system.model.Student((int) (short) 0, "data/test-userrepo.csv", "", "researcher", true);
        java.lang.String str6 = student5.getUserType();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Student" + "'", str6, "Student");
    }

    @Test
    public void test0634() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0634");
        com.reservation_system.model.Student student5 = new com.reservation_system.model.Student((int) ' ', "", "labmanager", "headlabcoordinator", true);
        java.lang.String str6 = student5.getUserType();
        java.lang.String str7 = student5.getUserType();
        int int8 = student5.getID();
        java.lang.String str9 = student5.getUserType();
        student5.setApproved(true);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Student" + "'", str6, "Student");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Student" + "'", str7, "Student");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 32 + "'", int8 == 32);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Student" + "'", str9, "Student");
    }

    @Test
    public void test0635() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0635");
        com.reservation_system.model.Researcher researcher5 = new com.reservation_system.model.Researcher((int) (byte) 10, "Guest", "Guest", "guest", false);
    }

    @Test
    public void test0636() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0636");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("data/test-userrepo.csv");
        com.reservation_system.services.RegistrationService registrationService2 = new com.reservation_system.services.RegistrationService(userRepository1);
        com.reservation_system.model.Faculty faculty8 = new com.reservation_system.model.Faculty(0, "Password1!", "data/test-userrepo.csv", "researcher", false);
        java.lang.String str9 = faculty8.getName();
        userRepository1.addUser((com.reservation_system.model.User) faculty8);
        boolean boolean12 = userRepository1.emailExists("Faculty");
        int int13 = userRepository1.getNextID();
        com.reservation_system.model.Researcher researcher19 = new com.reservation_system.model.Researcher((int) (short) 10, "hi!", "Andrew", "Guest", false);
        java.lang.String str20 = researcher19.getUserType();
        userRepository1.addUser((com.reservation_system.model.User) researcher19);
        com.reservation_system.services.RegistrationService registrationService22 = new com.reservation_system.services.RegistrationService(userRepository1);
        // The following exception was thrown during execution in test generation
        try {
            com.reservation_system.model.User user27 = registrationService22.registerUser("Andrew", "", "Student", "Faculty");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid user type.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Password1!" + "'", str9, "Password1!");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 103 + "'", int13 == 103);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "Researcher" + "'", str20, "Researcher");
    }

    @Test
    public void test0637() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0637");
        com.reservation_system.model.Researcher researcher5 = new com.reservation_system.model.Researcher((int) (byte) 10, "Guest", "headlabcoordinator", "data/test-userrepo.csv", false);
        int int6 = researcher5.getID();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
    }

    @Test
    public void test0638() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0638");
        com.reservation_system.model.Researcher researcher5 = new com.reservation_system.model.Researcher((int) (short) -1, "Andrew", "headlabcoordinator", "Guest", false);
        boolean boolean6 = researcher5.requiresDepartmentApproval();
        java.lang.String str7 = researcher5.getPassword();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Guest" + "'", str7, "Guest");
    }

    @Test
    public void test0639() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0639");
        com.reservation_system.model.Guest guest5 = new com.reservation_system.model.Guest((int) (byte) 10, "Andrew", "Student", "guest", true);
        java.lang.String str6 = guest5.getEmail();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Student" + "'", str6, "Student");
    }

    @Test
    public void test0640() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0640");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("data/test-userrepo.csv");
        com.reservation_system.services.RegistrationService registrationService2 = new com.reservation_system.services.RegistrationService(userRepository1);
        com.reservation_system.model.Faculty faculty8 = new com.reservation_system.model.Faculty(0, "Password1!", "data/test-userrepo.csv", "researcher", false);
        java.lang.String str9 = faculty8.getName();
        userRepository1.addUser((com.reservation_system.model.User) faculty8);
        boolean boolean11 = userRepository1.headLabCoordinatorExists();
        com.reservation_system.model.Guest guest17 = new com.reservation_system.model.Guest((int) (byte) -1, "guest", "Researcher", "Faculty", true);
        userRepository1.addUser((com.reservation_system.model.User) guest17);
        boolean boolean20 = userRepository1.emailExists("headlabcoordinator");
        boolean boolean21 = userRepository1.headLabCoordinatorExists();
        java.util.List<com.reservation_system.model.User> userList22 = userRepository1.getAllUsers();
        java.util.List<com.reservation_system.model.User> userList23 = userRepository1.getAllUsers();
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Password1!" + "'", str9, "Password1!");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertNotNull(userList22);
        org.junit.Assert.assertNotNull(userList23);
    }

    @Test
    public void test0641() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0641");
        com.reservation_system.model.Researcher researcher5 = new com.reservation_system.model.Researcher((int) '4', "faculty", "data/test-userrepo.csv", "Guest", true);
    }

    @Test
    public void test0642() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0642");
        // The following exception was thrown during execution in test generation
        try {
            com.reservation_system.model.User user6 = com.reservation_system.patterns.factory.UserFactory.createUser("Password1!", (-1), "", "labmanager", "Password1!", false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid user type: Password1!");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0643() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0643");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("data/test-userrepo.csv");
        com.reservation_system.services.RegistrationService registrationService2 = new com.reservation_system.services.RegistrationService(userRepository1);
        com.reservation_system.model.Faculty faculty8 = new com.reservation_system.model.Faculty(0, "Password1!", "data/test-userrepo.csv", "researcher", false);
        java.lang.String str9 = faculty8.getName();
        userRepository1.addUser((com.reservation_system.model.User) faculty8);
        boolean boolean11 = userRepository1.headLabCoordinatorExists();
        boolean boolean13 = userRepository1.emailExists("guest");
        com.reservation_system.model.Faculty faculty19 = new com.reservation_system.model.Faculty(0, "Password1!", "data/test-userrepo.csv", "researcher", false);
        boolean boolean20 = faculty19.requiresDepartmentApproval();
        userRepository1.addUser((com.reservation_system.model.User) faculty19);
        int int22 = faculty19.getID();
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Password1!" + "'", str9, "Password1!");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
    }

    @Test
    public void test0644() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0644");
        com.reservation_system.model.User user6 = com.reservation_system.patterns.factory.UserFactory.createUser("Faculty", (int) (byte) 10, "Faculty", "andrew@example.com", "student", true);
        org.junit.Assert.assertNotNull(user6);
    }

    @Test
    public void test0645() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0645");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("data/test-userrepo.csv");
        com.reservation_system.services.RegistrationService registrationService2 = new com.reservation_system.services.RegistrationService(userRepository1);
        com.reservation_system.model.Researcher researcher8 = new com.reservation_system.model.Researcher((int) (short) 1, "Password1!", "headlabcoordinator", "", false);
        userRepository1.addUser((com.reservation_system.model.User) researcher8);
        com.reservation_system.services.RegistrationService registrationService10 = new com.reservation_system.services.RegistrationService(userRepository1);
        boolean boolean12 = userRepository1.emailExists("");
        java.util.Optional<com.reservation_system.model.User> userOptional14 = userRepository1.findByEmail("");
        int int15 = userRepository1.getNextID();
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(userOptional14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 103 + "'", int15 == 103);
    }

    @Test
    public void test0646() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0646");
        com.reservation_system.model.Researcher researcher5 = new com.reservation_system.model.Researcher((int) (byte) 100, "Password1!", "Password1!", "headlabcoordinator", true);
        boolean boolean6 = researcher5.requiresDepartmentApproval();
        java.lang.String str7 = researcher5.getUserType();
        boolean boolean8 = researcher5.isApproved();
        java.lang.String str9 = researcher5.getPassword();
        java.lang.String str10 = researcher5.getUserType();
        researcher5.setApproved(false);
        java.lang.String str13 = researcher5.getUserType();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Researcher" + "'", str7, "Researcher");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "headlabcoordinator" + "'", str9, "headlabcoordinator");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Researcher" + "'", str10, "Researcher");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Researcher" + "'", str13, "Researcher");
    }

    @Test
    public void test0647() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0647");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("data/test-userrepo.csv");
        java.util.List<com.reservation_system.model.User> userList2 = userRepository1.getAllUsers();
        com.reservation_system.services.RegistrationService registrationService3 = new com.reservation_system.services.RegistrationService(userRepository1);
        int int4 = userRepository1.getNextID();
        com.reservation_system.model.Researcher researcher10 = new com.reservation_system.model.Researcher(100, "data/test-userrepo.csv", "andrew@example.com", "guest", false);
        java.lang.String str11 = researcher10.getEmail();
        userRepository1.addUser((com.reservation_system.model.User) researcher10);
        java.lang.Class<?> wildcardClass13 = researcher10.getClass();
        org.junit.Assert.assertNotNull(userList2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 103 + "'", int4 == 103);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0648() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0648");
        com.reservation_system.model.Guest guest5 = new com.reservation_system.model.Guest((int) (byte) 10, "faculty", "faculty", "hi!", false);
    }

    @Test
    public void test0649() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0649");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("data/test-userrepo.csv");
        boolean boolean2 = userRepository1.headLabCoordinatorExists();
        com.reservation_system.services.RegistrationService registrationService3 = new com.reservation_system.services.RegistrationService(userRepository1);
        boolean boolean4 = userRepository1.headLabCoordinatorExists();
        boolean boolean6 = userRepository1.emailExists("Andrew");
        com.reservation_system.services.RegistrationService registrationService7 = new com.reservation_system.services.RegistrationService(userRepository1);
        java.util.Optional<com.reservation_system.model.User> userOptional9 = userRepository1.findByEmail("faculty");
        com.reservation_system.services.RegistrationService registrationService10 = new com.reservation_system.services.RegistrationService(userRepository1);
        com.reservation_system.repository.UserRepository userRepository12 = new com.reservation_system.repository.UserRepository("data/test-userrepo.csv");
        com.reservation_system.services.RegistrationService registrationService13 = new com.reservation_system.services.RegistrationService(userRepository12);
        com.reservation_system.model.Faculty faculty19 = new com.reservation_system.model.Faculty(0, "Password1!", "data/test-userrepo.csv", "researcher", false);
        java.lang.String str20 = faculty19.getName();
        userRepository12.addUser((com.reservation_system.model.User) faculty19);
        boolean boolean22 = userRepository12.headLabCoordinatorExists();
        com.reservation_system.model.Guest guest28 = new com.reservation_system.model.Guest((int) (byte) -1, "guest", "Researcher", "Faculty", true);
        userRepository12.addUser((com.reservation_system.model.User) guest28);
        boolean boolean31 = userRepository12.emailExists("Password1!");
        com.reservation_system.repository.UserRepository userRepository33 = new com.reservation_system.repository.UserRepository("data/test-userrepo.csv");
        com.reservation_system.services.RegistrationService registrationService34 = new com.reservation_system.services.RegistrationService(userRepository33);
        com.reservation_system.model.Faculty faculty40 = new com.reservation_system.model.Faculty(0, "Password1!", "data/test-userrepo.csv", "researcher", false);
        java.lang.String str41 = faculty40.getName();
        userRepository33.addUser((com.reservation_system.model.User) faculty40);
        boolean boolean43 = userRepository33.headLabCoordinatorExists();
        com.reservation_system.services.RegistrationService registrationService44 = new com.reservation_system.services.RegistrationService(userRepository33);
        java.util.List<com.reservation_system.model.User> userList45 = userRepository33.getAllUsers();
        com.reservation_system.repository.UserRepository userRepository47 = new com.reservation_system.repository.UserRepository("data/test-userrepo.csv");
        com.reservation_system.services.RegistrationService registrationService48 = new com.reservation_system.services.RegistrationService(userRepository47);
        com.reservation_system.model.Faculty faculty54 = new com.reservation_system.model.Faculty(0, "Password1!", "data/test-userrepo.csv", "researcher", false);
        java.lang.String str55 = faculty54.getName();
        userRepository47.addUser((com.reservation_system.model.User) faculty54);
        boolean boolean57 = userRepository47.headLabCoordinatorExists();
        com.reservation_system.services.RegistrationService registrationService58 = new com.reservation_system.services.RegistrationService(userRepository47);
        java.util.List<com.reservation_system.model.User> userList59 = userRepository47.getAllUsers();
        userRepository33.saveAllUsers(userList59);
        userRepository12.saveAllUsers(userList59);
        java.util.List<com.reservation_system.model.User> userList62 = userRepository12.getAllUsers();
        userRepository1.saveAllUsers(userList62);
        com.reservation_system.model.Researcher researcher69 = new com.reservation_system.model.Researcher((int) (short) -1, "Andrew", "student", "Guest", false);
        java.lang.String str70 = researcher69.getName();
        userRepository1.addUser((com.reservation_system.model.User) researcher69);
        researcher69.setApproved(true);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(userOptional9);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "Password1!" + "'", str20, "Password1!");
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "Password1!" + "'", str41, "Password1!");
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + true + "'", boolean43 == true);
        org.junit.Assert.assertNotNull(userList45);
        org.junit.Assert.assertEquals("'" + str55 + "' != '" + "Password1!" + "'", str55, "Password1!");
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + true + "'", boolean57 == true);
        org.junit.Assert.assertNotNull(userList59);
        org.junit.Assert.assertNotNull(userList62);
        org.junit.Assert.assertEquals("'" + str70 + "' != '" + "Andrew" + "'", str70, "Andrew");
    }

    @Test
    public void test0650() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0650");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("data/test-userrepo.csv");
        com.reservation_system.services.RegistrationService registrationService2 = new com.reservation_system.services.RegistrationService(userRepository1);
        com.reservation_system.model.Faculty faculty8 = new com.reservation_system.model.Faculty(0, "Password1!", "data/test-userrepo.csv", "researcher", false);
        java.lang.String str9 = faculty8.getName();
        userRepository1.addUser((com.reservation_system.model.User) faculty8);
        boolean boolean11 = userRepository1.headLabCoordinatorExists();
        com.reservation_system.model.Guest guest17 = new com.reservation_system.model.Guest((int) (byte) -1, "guest", "Researcher", "Faculty", true);
        userRepository1.addUser((com.reservation_system.model.User) guest17);
        boolean boolean19 = userRepository1.headLabCoordinatorExists();
        com.reservation_system.repository.UserRepository userRepository21 = new com.reservation_system.repository.UserRepository("data/test-userrepo.csv");
        com.reservation_system.services.RegistrationService registrationService22 = new com.reservation_system.services.RegistrationService(userRepository21);
        com.reservation_system.model.Faculty faculty28 = new com.reservation_system.model.Faculty(0, "Password1!", "data/test-userrepo.csv", "researcher", false);
        java.lang.String str29 = faculty28.getName();
        userRepository21.addUser((com.reservation_system.model.User) faculty28);
        boolean boolean31 = userRepository21.headLabCoordinatorExists();
        com.reservation_system.repository.UserRepository userRepository33 = new com.reservation_system.repository.UserRepository("data/test-userrepo.csv");
        com.reservation_system.services.RegistrationService registrationService34 = new com.reservation_system.services.RegistrationService(userRepository33);
        com.reservation_system.model.Faculty faculty40 = new com.reservation_system.model.Faculty(0, "Password1!", "data/test-userrepo.csv", "researcher", false);
        java.lang.String str41 = faculty40.getName();
        userRepository33.addUser((com.reservation_system.model.User) faculty40);
        java.util.List<com.reservation_system.model.User> userList43 = userRepository33.getAllUsers();
        userRepository21.saveAllUsers(userList43);
        userRepository1.saveAllUsers(userList43);
        java.util.List<com.reservation_system.model.User> userList46 = userRepository1.getAllUsers();
        int int47 = userRepository1.getNextID();
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Password1!" + "'", str9, "Password1!");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "Password1!" + "'", str29, "Password1!");
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "Password1!" + "'", str41, "Password1!");
        org.junit.Assert.assertNotNull(userList43);
        org.junit.Assert.assertNotNull(userList46);
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + 103 + "'", int47 == 103);
    }

    @Test
    public void test0651() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0651");
        com.reservation_system.model.Researcher researcher5 = new com.reservation_system.model.Researcher((int) (byte) 1, "Student", "Student", "Password1!", false);
        java.lang.String str6 = researcher5.getEmail();
        boolean boolean7 = researcher5.isApproved();
        java.lang.String str8 = researcher5.getName();
        java.lang.String str9 = researcher5.getUserType();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Student" + "'", str6, "Student");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Student" + "'", str8, "Student");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Researcher" + "'", str9, "Researcher");
    }

    @Test
    public void test0652() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0652");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("data/test-userrepo.csv");
        com.reservation_system.services.RegistrationService registrationService2 = new com.reservation_system.services.RegistrationService(userRepository1);
        com.reservation_system.model.Faculty faculty8 = new com.reservation_system.model.Faculty(0, "Password1!", "data/test-userrepo.csv", "researcher", false);
        java.lang.String str9 = faculty8.getName();
        userRepository1.addUser((com.reservation_system.model.User) faculty8);
        boolean boolean11 = userRepository1.headLabCoordinatorExists();
        com.reservation_system.model.Guest guest17 = new com.reservation_system.model.Guest((int) (byte) -1, "guest", "Researcher", "Faculty", true);
        userRepository1.addUser((com.reservation_system.model.User) guest17);
        boolean boolean20 = userRepository1.emailExists("Password1!");
        boolean boolean22 = userRepository1.emailExists("hi!");
        int int23 = userRepository1.getNextID();
        com.reservation_system.services.RegistrationService registrationService24 = new com.reservation_system.services.RegistrationService(userRepository1);
        // The following exception was thrown during execution in test generation
        try {
            com.reservation_system.model.User user29 = registrationService24.registerUser("researcher", "researcher", "hi!", "guest");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid email format.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Password1!" + "'", str9, "Password1!");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 103 + "'", int23 == 103);
    }

    @Test
    public void test0653() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0653");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("data/test-userrepo.csv");
        java.util.Optional<com.reservation_system.model.User> userOptional3 = userRepository1.findByEmail("hi!");
        int int4 = userRepository1.getNextID();
        int int5 = userRepository1.getNextID();
        java.util.Optional<com.reservation_system.model.User> userOptional7 = userRepository1.findByEmail("");
        int int8 = userRepository1.getNextID();
        org.junit.Assert.assertNotNull(userOptional3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 103 + "'", int4 == 103);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 103 + "'", int5 == 103);
        org.junit.Assert.assertNotNull(userOptional7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 103 + "'", int8 == 103);
    }

    @Test
    public void test0654() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0654");
        com.reservation_system.model.Researcher researcher5 = new com.reservation_system.model.Researcher((int) (short) -1, "faculty", "researcher", "hi!", true);
        researcher5.setApproved(false);
        java.lang.String str8 = researcher5.getEmail();
        java.lang.String str9 = researcher5.getUserType();
        java.lang.String str10 = researcher5.getUserType();
        java.lang.String str11 = researcher5.getUserType();
        java.lang.String str12 = researcher5.getPassword();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "researcher" + "'", str8, "researcher");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Researcher" + "'", str9, "Researcher");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Researcher" + "'", str10, "Researcher");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Researcher" + "'", str11, "Researcher");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
    }

    @Test
    public void test0655() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0655");
        com.reservation_system.model.HeadLabCoordinator headLabCoordinator5 = new com.reservation_system.model.HeadLabCoordinator((int) (byte) -1, "", "Andrew", "Andrew", false);
        boolean boolean6 = headLabCoordinator5.requiresDepartmentApproval();
        headLabCoordinator5.setApproved(false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test0656() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0656");
        com.reservation_system.model.Researcher researcher5 = new com.reservation_system.model.Researcher((int) (short) -1, "andrew@example.com", "guest", "labmanager", false);
        java.lang.String str6 = researcher5.getPassword();
        researcher5.setApproved(true);
        java.lang.String str9 = researcher5.getPassword();
        boolean boolean10 = researcher5.requiresDepartmentApproval();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "labmanager" + "'", str6, "labmanager");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "labmanager" + "'", str9, "labmanager");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test0657() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0657");
        com.reservation_system.model.HeadLabCoordinator headLabCoordinator5 = new com.reservation_system.model.HeadLabCoordinator(10, "Faculty", "researcher", "student", true);
        int int6 = headLabCoordinator5.getID();
        java.lang.String str7 = headLabCoordinator5.getUserType();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "headlabcoordinator" + "'", str7, "headlabcoordinator");
    }

    @Test
    public void test0658() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0658");
        com.reservation_system.model.HeadLabCoordinator headLabCoordinator5 = new com.reservation_system.model.HeadLabCoordinator(102, "data/test-userrepo.csv", "", "Andrew", false);
        java.lang.String str6 = headLabCoordinator5.getEmail();
        java.lang.Class<?> wildcardClass7 = headLabCoordinator5.getClass();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0659() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0659");
        com.reservation_system.model.Guest guest5 = new com.reservation_system.model.Guest(52, "labmanager", "Researcher", "Faculty", false);
        java.lang.Class<?> wildcardClass6 = guest5.getClass();
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0660() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0660");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("data/test-userrepo.csv");
        boolean boolean2 = userRepository1.headLabCoordinatorExists();
        com.reservation_system.repository.UserRepository userRepository4 = new com.reservation_system.repository.UserRepository("data/test-userrepo.csv");
        com.reservation_system.services.RegistrationService registrationService5 = new com.reservation_system.services.RegistrationService(userRepository4);
        com.reservation_system.model.Faculty faculty11 = new com.reservation_system.model.Faculty(0, "Password1!", "data/test-userrepo.csv", "researcher", false);
        java.lang.String str12 = faculty11.getName();
        userRepository4.addUser((com.reservation_system.model.User) faculty11);
        boolean boolean14 = userRepository4.headLabCoordinatorExists();
        com.reservation_system.model.Guest guest20 = new com.reservation_system.model.Guest((int) (byte) -1, "guest", "Researcher", "Faculty", true);
        userRepository4.addUser((com.reservation_system.model.User) guest20);
        boolean boolean22 = userRepository4.headLabCoordinatorExists();
        com.reservation_system.repository.UserRepository userRepository24 = new com.reservation_system.repository.UserRepository("data/test-userrepo.csv");
        com.reservation_system.services.RegistrationService registrationService25 = new com.reservation_system.services.RegistrationService(userRepository24);
        com.reservation_system.model.Faculty faculty31 = new com.reservation_system.model.Faculty(0, "Password1!", "data/test-userrepo.csv", "researcher", false);
        java.lang.String str32 = faculty31.getName();
        userRepository24.addUser((com.reservation_system.model.User) faculty31);
        boolean boolean34 = userRepository24.headLabCoordinatorExists();
        com.reservation_system.repository.UserRepository userRepository36 = new com.reservation_system.repository.UserRepository("data/test-userrepo.csv");
        com.reservation_system.services.RegistrationService registrationService37 = new com.reservation_system.services.RegistrationService(userRepository36);
        com.reservation_system.model.Faculty faculty43 = new com.reservation_system.model.Faculty(0, "Password1!", "data/test-userrepo.csv", "researcher", false);
        java.lang.String str44 = faculty43.getName();
        userRepository36.addUser((com.reservation_system.model.User) faculty43);
        java.util.List<com.reservation_system.model.User> userList46 = userRepository36.getAllUsers();
        userRepository24.saveAllUsers(userList46);
        userRepository4.saveAllUsers(userList46);
        userRepository1.saveAllUsers(userList46);
        com.reservation_system.services.RegistrationService registrationService50 = new com.reservation_system.services.RegistrationService(userRepository1);
        int int51 = userRepository1.getNextID();
        java.util.Optional<com.reservation_system.model.User> userOptional53 = userRepository1.findByEmail("faculty");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Password1!" + "'", str12, "Password1!");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "Password1!" + "'", str32, "Password1!");
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "Password1!" + "'", str44, "Password1!");
        org.junit.Assert.assertNotNull(userList46);
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + 103 + "'", int51 == 103);
        org.junit.Assert.assertNotNull(userOptional53);
    }

    @Test
    public void test0661() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0661");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("data/test-userrepo.csv");
        java.util.Optional<com.reservation_system.model.User> userOptional3 = userRepository1.findByEmail("hi!");
        java.util.List<com.reservation_system.model.User> userList4 = userRepository1.getAllUsers();
        com.reservation_system.services.RegistrationService registrationService5 = new com.reservation_system.services.RegistrationService(userRepository1);
        com.reservation_system.repository.UserRepository userRepository7 = new com.reservation_system.repository.UserRepository("data/test-userrepo.csv");
        boolean boolean8 = userRepository7.headLabCoordinatorExists();
        com.reservation_system.repository.UserRepository userRepository10 = new com.reservation_system.repository.UserRepository("data/test-userrepo.csv");
        com.reservation_system.services.RegistrationService registrationService11 = new com.reservation_system.services.RegistrationService(userRepository10);
        com.reservation_system.model.Faculty faculty17 = new com.reservation_system.model.Faculty(0, "Password1!", "data/test-userrepo.csv", "researcher", false);
        java.lang.String str18 = faculty17.getName();
        userRepository10.addUser((com.reservation_system.model.User) faculty17);
        boolean boolean20 = userRepository10.headLabCoordinatorExists();
        com.reservation_system.model.Guest guest26 = new com.reservation_system.model.Guest((int) (byte) -1, "guest", "Researcher", "Faculty", true);
        userRepository10.addUser((com.reservation_system.model.User) guest26);
        boolean boolean28 = userRepository10.headLabCoordinatorExists();
        com.reservation_system.repository.UserRepository userRepository30 = new com.reservation_system.repository.UserRepository("data/test-userrepo.csv");
        com.reservation_system.services.RegistrationService registrationService31 = new com.reservation_system.services.RegistrationService(userRepository30);
        com.reservation_system.model.Faculty faculty37 = new com.reservation_system.model.Faculty(0, "Password1!", "data/test-userrepo.csv", "researcher", false);
        java.lang.String str38 = faculty37.getName();
        userRepository30.addUser((com.reservation_system.model.User) faculty37);
        boolean boolean40 = userRepository30.headLabCoordinatorExists();
        com.reservation_system.repository.UserRepository userRepository42 = new com.reservation_system.repository.UserRepository("data/test-userrepo.csv");
        com.reservation_system.services.RegistrationService registrationService43 = new com.reservation_system.services.RegistrationService(userRepository42);
        com.reservation_system.model.Faculty faculty49 = new com.reservation_system.model.Faculty(0, "Password1!", "data/test-userrepo.csv", "researcher", false);
        java.lang.String str50 = faculty49.getName();
        userRepository42.addUser((com.reservation_system.model.User) faculty49);
        java.util.List<com.reservation_system.model.User> userList52 = userRepository42.getAllUsers();
        userRepository30.saveAllUsers(userList52);
        userRepository10.saveAllUsers(userList52);
        userRepository7.saveAllUsers(userList52);
        userRepository1.saveAllUsers(userList52);
        org.junit.Assert.assertNotNull(userOptional3);
        org.junit.Assert.assertNotNull(userList4);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Password1!" + "'", str18, "Password1!");
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "Password1!" + "'", str38, "Password1!");
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + true + "'", boolean40 == true);
        org.junit.Assert.assertEquals("'" + str50 + "' != '" + "Password1!" + "'", str50, "Password1!");
        org.junit.Assert.assertNotNull(userList52);
    }

    @Test
    public void test0662() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0662");
        com.reservation_system.model.HeadLabCoordinator headLabCoordinator5 = new com.reservation_system.model.HeadLabCoordinator((int) (byte) -1, "Password1!", "hi!", "", true);
        int int6 = headLabCoordinator5.getID();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
    }

    @Test
    public void test0663() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0663");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("data/test-userrepo.csv");
        int int2 = userRepository1.getNextID();
        int int3 = userRepository1.getNextID();
        boolean boolean5 = userRepository1.emailExists("faculty");
        com.reservation_system.model.LabManager labManager11 = new com.reservation_system.model.LabManager((int) (short) 0, "", "labmanager", "Password1!", true);
        userRepository1.addUser((com.reservation_system.model.User) labManager11);
        java.util.Optional<com.reservation_system.model.User> userOptional14 = userRepository1.findByEmail("");
        com.reservation_system.model.Researcher researcher20 = new com.reservation_system.model.Researcher((int) (byte) 100, "Password1!", "Password1!", "headlabcoordinator", true);
        userRepository1.addUser((com.reservation_system.model.User) researcher20);
        java.util.List<com.reservation_system.model.User> userList22 = userRepository1.getAllUsers();
        com.reservation_system.model.Researcher researcher28 = new com.reservation_system.model.Researcher((int) (short) -1, "headlabcoordinator", "Guest", "student", false);
        userRepository1.addUser((com.reservation_system.model.User) researcher28);
        com.reservation_system.model.Faculty faculty35 = new com.reservation_system.model.Faculty((int) (short) 0, "hi!", "Password1!", "", false);
        java.lang.String str36 = faculty35.getUserType();
        userRepository1.addUser((com.reservation_system.model.User) faculty35);
        java.util.Optional<com.reservation_system.model.User> userOptional39 = userRepository1.findByEmail("headlabcoordinator");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 103 + "'", int2 == 103);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 103 + "'", int3 == 103);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(userOptional14);
        org.junit.Assert.assertNotNull(userList22);
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "Faculty" + "'", str36, "Faculty");
        org.junit.Assert.assertNotNull(userOptional39);
    }

    @Test
    public void test0664() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0664");
        com.reservation_system.model.LabManager labManager5 = new com.reservation_system.model.LabManager(103, "guest", "student", "Student", true);
        java.lang.String str6 = labManager5.getEmail();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "student" + "'", str6, "student");
    }

    @Test
    public void test0665() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0665");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("data/test-userrepo.csv");
        boolean boolean2 = userRepository1.headLabCoordinatorExists();
        com.reservation_system.services.RegistrationService registrationService3 = new com.reservation_system.services.RegistrationService(userRepository1);
        boolean boolean4 = userRepository1.headLabCoordinatorExists();
        boolean boolean6 = userRepository1.emailExists("Andrew");
        com.reservation_system.services.RegistrationService registrationService7 = new com.reservation_system.services.RegistrationService(userRepository1);
        com.reservation_system.model.Researcher researcher13 = new com.reservation_system.model.Researcher((int) (short) -1, "andrew@example.com", "guest", "labmanager", false);
        java.lang.String str14 = researcher13.getUserType();
        java.lang.String str15 = researcher13.getName();
        java.lang.String str16 = researcher13.getUserType();
        userRepository1.addUser((com.reservation_system.model.User) researcher13);
        com.reservation_system.model.LabManager labManager23 = new com.reservation_system.model.LabManager((int) 'a', "headlabcoordinator", "Researcher", "Andrew", false);
        java.lang.String str24 = labManager23.getEmail();
        labManager23.setApproved(false);
        userRepository1.addUser((com.reservation_system.model.User) labManager23);
        com.reservation_system.services.RegistrationService registrationService28 = new com.reservation_system.services.RegistrationService(userRepository1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Researcher" + "'", str14, "Researcher");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Researcher" + "'", str16, "Researcher");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "Researcher" + "'", str24, "Researcher");
    }

    @Test
    public void test0666() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0666");
        com.reservation_system.model.LabManager labManager5 = new com.reservation_system.model.LabManager((int) (byte) 10, "researcher", "guest", "researcher", false);
        java.lang.String str6 = labManager5.getUserType();
        java.lang.String str7 = labManager5.getUserType();
        labManager5.setApproved(true);
        int int10 = labManager5.getID();
        java.lang.String str11 = labManager5.getUserType();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "labmanager" + "'", str6, "labmanager");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "labmanager" + "'", str7, "labmanager");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 10 + "'", int10 == 10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "labmanager" + "'", str11, "labmanager");
    }

    @Test
    public void test0667() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0667");
        com.reservation_system.model.User user6 = com.reservation_system.patterns.factory.UserFactory.createUser("Guest", 97, "labmanager", "data/test-userrepo.csv", "headlabcoordinator", false);
        org.junit.Assert.assertNotNull(user6);
    }

    @Test
    public void test0668() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0668");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("data/test-userrepo.csv");
        boolean boolean2 = userRepository1.headLabCoordinatorExists();
        com.reservation_system.services.RegistrationService registrationService3 = new com.reservation_system.services.RegistrationService(userRepository1);
        boolean boolean5 = userRepository1.emailExists("");
        java.util.Optional<com.reservation_system.model.User> userOptional7 = userRepository1.findByEmail("");
        java.util.Optional<com.reservation_system.model.User> userOptional9 = userRepository1.findByEmail("hi!");
        com.reservation_system.services.RegistrationService registrationService10 = new com.reservation_system.services.RegistrationService(userRepository1);
        int int11 = userRepository1.getNextID();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(userOptional7);
        org.junit.Assert.assertNotNull(userOptional9);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 103 + "'", int11 == 103);
    }

    @Test
    public void test0669() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0669");
        com.reservation_system.model.LabManager labManager5 = new com.reservation_system.model.LabManager(0, "hi!", "headlabcoordinator", "Student", false);
    }

    @Test
    public void test0670() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0670");
        com.reservation_system.model.User user6 = com.reservation_system.patterns.factory.UserFactory.createUser("guest", 52, "faculty", "guest", "Password1!", true);
        org.junit.Assert.assertNotNull(user6);
    }

    @Test
    public void test0671() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0671");
        com.reservation_system.model.Guest guest5 = new com.reservation_system.model.Guest((int) (byte) 100, "andrew@example.com", "student", "Researcher", false);
        java.lang.String str6 = guest5.getUserType();
        int int7 = guest5.getID();
        java.lang.String str8 = guest5.getEmail();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Guest" + "'", str6, "Guest");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 100 + "'", int7 == 100);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "student" + "'", str8, "student");
    }

    @Test
    public void test0672() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0672");
        // The following exception was thrown during execution in test generation
        try {
            com.reservation_system.model.User user6 = com.reservation_system.patterns.factory.UserFactory.createUser("hi!", 100, "", "guest", "Guest", true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid user type: hi!");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0673() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0673");
        com.reservation_system.model.Faculty faculty5 = new com.reservation_system.model.Faculty(100, "student", "Andrew", "researcher", true);
        boolean boolean6 = faculty5.requiresDepartmentApproval();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test0674() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0674");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("data/test-userrepo.csv");
        boolean boolean2 = userRepository1.headLabCoordinatorExists();
        com.reservation_system.services.RegistrationService registrationService3 = new com.reservation_system.services.RegistrationService(userRepository1);
        boolean boolean4 = userRepository1.headLabCoordinatorExists();
        boolean boolean6 = userRepository1.emailExists("Andrew");
        com.reservation_system.services.RegistrationService registrationService7 = new com.reservation_system.services.RegistrationService(userRepository1);
        java.util.Optional<com.reservation_system.model.User> userOptional9 = userRepository1.findByEmail("faculty");
        com.reservation_system.services.RegistrationService registrationService10 = new com.reservation_system.services.RegistrationService(userRepository1);
        com.reservation_system.repository.UserRepository userRepository12 = new com.reservation_system.repository.UserRepository("data/test-userrepo.csv");
        com.reservation_system.services.RegistrationService registrationService13 = new com.reservation_system.services.RegistrationService(userRepository12);
        com.reservation_system.model.Faculty faculty19 = new com.reservation_system.model.Faculty(0, "Password1!", "data/test-userrepo.csv", "researcher", false);
        java.lang.String str20 = faculty19.getName();
        userRepository12.addUser((com.reservation_system.model.User) faculty19);
        boolean boolean22 = userRepository12.headLabCoordinatorExists();
        com.reservation_system.model.Guest guest28 = new com.reservation_system.model.Guest((int) (byte) -1, "guest", "Researcher", "Faculty", true);
        userRepository12.addUser((com.reservation_system.model.User) guest28);
        boolean boolean31 = userRepository12.emailExists("Password1!");
        com.reservation_system.repository.UserRepository userRepository33 = new com.reservation_system.repository.UserRepository("data/test-userrepo.csv");
        com.reservation_system.services.RegistrationService registrationService34 = new com.reservation_system.services.RegistrationService(userRepository33);
        com.reservation_system.model.Faculty faculty40 = new com.reservation_system.model.Faculty(0, "Password1!", "data/test-userrepo.csv", "researcher", false);
        java.lang.String str41 = faculty40.getName();
        userRepository33.addUser((com.reservation_system.model.User) faculty40);
        boolean boolean43 = userRepository33.headLabCoordinatorExists();
        com.reservation_system.services.RegistrationService registrationService44 = new com.reservation_system.services.RegistrationService(userRepository33);
        java.util.List<com.reservation_system.model.User> userList45 = userRepository33.getAllUsers();
        com.reservation_system.repository.UserRepository userRepository47 = new com.reservation_system.repository.UserRepository("data/test-userrepo.csv");
        com.reservation_system.services.RegistrationService registrationService48 = new com.reservation_system.services.RegistrationService(userRepository47);
        com.reservation_system.model.Faculty faculty54 = new com.reservation_system.model.Faculty(0, "Password1!", "data/test-userrepo.csv", "researcher", false);
        java.lang.String str55 = faculty54.getName();
        userRepository47.addUser((com.reservation_system.model.User) faculty54);
        boolean boolean57 = userRepository47.headLabCoordinatorExists();
        com.reservation_system.services.RegistrationService registrationService58 = new com.reservation_system.services.RegistrationService(userRepository47);
        java.util.List<com.reservation_system.model.User> userList59 = userRepository47.getAllUsers();
        userRepository33.saveAllUsers(userList59);
        userRepository12.saveAllUsers(userList59);
        java.util.List<com.reservation_system.model.User> userList62 = userRepository12.getAllUsers();
        userRepository1.saveAllUsers(userList62);
        com.reservation_system.model.Researcher researcher69 = new com.reservation_system.model.Researcher((int) (short) -1, "Andrew", "student", "Guest", false);
        java.lang.String str70 = researcher69.getName();
        userRepository1.addUser((com.reservation_system.model.User) researcher69);
        boolean boolean72 = userRepository1.headLabCoordinatorExists();
        java.lang.Class<?> wildcardClass73 = userRepository1.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(userOptional9);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "Password1!" + "'", str20, "Password1!");
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "Password1!" + "'", str41, "Password1!");
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + true + "'", boolean43 == true);
        org.junit.Assert.assertNotNull(userList45);
        org.junit.Assert.assertEquals("'" + str55 + "' != '" + "Password1!" + "'", str55, "Password1!");
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + true + "'", boolean57 == true);
        org.junit.Assert.assertNotNull(userList59);
        org.junit.Assert.assertNotNull(userList62);
        org.junit.Assert.assertEquals("'" + str70 + "' != '" + "Andrew" + "'", str70, "Andrew");
        org.junit.Assert.assertTrue("'" + boolean72 + "' != '" + true + "'", boolean72 == true);
        org.junit.Assert.assertNotNull(wildcardClass73);
    }

    @Test
    public void test0675() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0675");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("data/test-userrepo.csv");
        int int2 = userRepository1.getNextID();
        int int3 = userRepository1.getNextID();
        boolean boolean5 = userRepository1.emailExists("faculty");
        com.reservation_system.model.LabManager labManager11 = new com.reservation_system.model.LabManager((int) (short) 0, "", "labmanager", "Password1!", true);
        userRepository1.addUser((com.reservation_system.model.User) labManager11);
        labManager11.setApproved(false);
        int int15 = labManager11.getID();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 103 + "'", int2 == 103);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 103 + "'", int3 == 103);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
    }

    @Test
    public void test0676() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0676");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("data/test-userrepo.csv");
        java.util.List<com.reservation_system.model.User> userList2 = userRepository1.getAllUsers();
        com.reservation_system.services.RegistrationService registrationService3 = new com.reservation_system.services.RegistrationService(userRepository1);
        int int4 = userRepository1.getNextID();
        java.util.Optional<com.reservation_system.model.User> userOptional6 = userRepository1.findByEmail("guest");
        java.lang.Class<?> wildcardClass7 = userRepository1.getClass();
        org.junit.Assert.assertNotNull(userList2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 103 + "'", int4 == 103);
        org.junit.Assert.assertNotNull(userOptional6);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0677() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0677");
        com.reservation_system.model.HeadLabCoordinator headLabCoordinator5 = new com.reservation_system.model.HeadLabCoordinator((int) (short) -1, "Student", "data/test-userrepo.csv", "Guest", true);
        java.lang.Class<?> wildcardClass6 = headLabCoordinator5.getClass();
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0678() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0678");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("data/test-userrepo.csv");
        java.util.Optional<com.reservation_system.model.User> userOptional3 = userRepository1.findByEmail("hi!");
        int int4 = userRepository1.getNextID();
        com.reservation_system.model.Researcher researcher10 = new com.reservation_system.model.Researcher((int) (byte) 10, "", "Guest", "headlabcoordinator", true);
        userRepository1.addUser((com.reservation_system.model.User) researcher10);
        java.util.List<com.reservation_system.model.User> userList12 = userRepository1.getAllUsers();
        com.reservation_system.model.Student student18 = new com.reservation_system.model.Student((int) (byte) 10, "hi!", "labmanager", "Password1!", false);
        userRepository1.addUser((com.reservation_system.model.User) student18);
        com.reservation_system.model.Researcher researcher25 = new com.reservation_system.model.Researcher((-1), "data/test-userrepo.csv", "headlabcoordinator", "", false);
        userRepository1.addUser((com.reservation_system.model.User) researcher25);
        java.lang.String str27 = researcher25.getUserType();
        org.junit.Assert.assertNotNull(userOptional3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 103 + "'", int4 == 103);
        org.junit.Assert.assertNotNull(userList12);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "Researcher" + "'", str27, "Researcher");
    }

    @Test
    public void test0679() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0679");
        // The following exception was thrown during execution in test generation
        try {
            com.reservation_system.model.User user6 = com.reservation_system.patterns.factory.UserFactory.createUser("Andrew", (int) (byte) 0, "Student", "faculty", "Guest", true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid user type: Andrew");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0680() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0680");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("data/test-userrepo.csv");
        com.reservation_system.services.RegistrationService registrationService2 = new com.reservation_system.services.RegistrationService(userRepository1);
        com.reservation_system.model.Faculty faculty8 = new com.reservation_system.model.Faculty(0, "Password1!", "data/test-userrepo.csv", "researcher", false);
        java.lang.String str9 = faculty8.getName();
        userRepository1.addUser((com.reservation_system.model.User) faculty8);
        boolean boolean11 = userRepository1.headLabCoordinatorExists();
        com.reservation_system.model.Guest guest17 = new com.reservation_system.model.Guest((int) (byte) -1, "guest", "Researcher", "Faculty", true);
        userRepository1.addUser((com.reservation_system.model.User) guest17);
        boolean boolean20 = userRepository1.emailExists("Password1!");
        boolean boolean22 = userRepository1.emailExists("hi!");
        int int23 = userRepository1.getNextID();
        com.reservation_system.services.RegistrationService registrationService24 = new com.reservation_system.services.RegistrationService(userRepository1);
        // The following exception was thrown during execution in test generation
        try {
            com.reservation_system.model.User user29 = registrationService24.registerUser("Guest", "Researcher", "faculty", "labmanager");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid email format.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Password1!" + "'", str9, "Password1!");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 103 + "'", int23 == 103);
    }

    @Test
    public void test0681() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0681");
        com.reservation_system.model.Student student5 = new com.reservation_system.model.Student((int) (byte) 1, "hi!", "Guest", "student", false);
    }

    @Test
    public void test0682() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0682");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("data/test-userrepo.csv");
        int int2 = userRepository1.getNextID();
        int int3 = userRepository1.getNextID();
        boolean boolean5 = userRepository1.emailExists("faculty");
        com.reservation_system.model.LabManager labManager11 = new com.reservation_system.model.LabManager((int) (short) 0, "", "labmanager", "Password1!", true);
        userRepository1.addUser((com.reservation_system.model.User) labManager11);
        com.reservation_system.services.RegistrationService registrationService13 = new com.reservation_system.services.RegistrationService(userRepository1);
        // The following exception was thrown during execution in test generation
        try {
            com.reservation_system.model.User user18 = registrationService13.registerUser("guest", "labmanager", "headlabcoordinator", "data/test-userrepo.csv");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid email format.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 103 + "'", int2 == 103);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 103 + "'", int3 == 103);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
    }

    @Test
    public void test0683() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0683");
        com.reservation_system.model.Guest guest5 = new com.reservation_system.model.Guest(1, "researcher", "faculty", "student", true);
        java.lang.String str6 = guest5.getUserType();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Guest" + "'", str6, "Guest");
    }

    @Test
    public void test0684() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0684");
        com.reservation_system.model.LabManager labManager5 = new com.reservation_system.model.LabManager(32, "Student", "", "Researcher", false);
    }

    @Test
    public void test0685() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0685");
        com.reservation_system.model.HeadLabCoordinator headLabCoordinator5 = new com.reservation_system.model.HeadLabCoordinator((int) (byte) -1, "Password1!", "hi!", "", true);
        java.lang.String str6 = headLabCoordinator5.getUserType();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "headlabcoordinator" + "'", str6, "headlabcoordinator");
    }

    @Test
    public void test0686() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0686");
        com.reservation_system.model.Faculty faculty5 = new com.reservation_system.model.Faculty((int) (byte) 10, "researcher", "headlabcoordinator", "researcher", true);
        boolean boolean6 = faculty5.isApproved();
        faculty5.setApproved(true);
        java.lang.String str9 = faculty5.getPassword();
        faculty5.setApproved(true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "researcher" + "'", str9, "researcher");
    }

    @Test
    public void test0687() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0687");
        com.reservation_system.model.HeadLabCoordinator headLabCoordinator5 = new com.reservation_system.model.HeadLabCoordinator(0, "Password1!", "Faculty", "Faculty", false);
        java.lang.String str6 = headLabCoordinator5.getEmail();
        java.lang.String str7 = headLabCoordinator5.getUserType();
        boolean boolean8 = headLabCoordinator5.requiresDepartmentApproval();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Faculty" + "'", str6, "Faculty");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "headlabcoordinator" + "'", str7, "headlabcoordinator");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test0688() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0688");
        com.reservation_system.model.Guest guest5 = new com.reservation_system.model.Guest(102, "faculty", "andrew@example.com", "headlabcoordinator", false);
    }

    @Test
    public void test0689() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0689");
        com.reservation_system.model.HeadLabCoordinator headLabCoordinator5 = new com.reservation_system.model.HeadLabCoordinator((int) (short) 100, "Guest", "researcher", "headlabcoordinator", true);
        java.lang.String str6 = headLabCoordinator5.getUserType();
        headLabCoordinator5.setApproved(true);
        java.lang.String str9 = headLabCoordinator5.getUserType();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "headlabcoordinator" + "'", str6, "headlabcoordinator");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "headlabcoordinator" + "'", str9, "headlabcoordinator");
    }

    @Test
    public void test0690() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0690");
        com.reservation_system.model.Researcher researcher5 = new com.reservation_system.model.Researcher((int) '4', "labmanager", "Andrew", "researcher", true);
        java.lang.String str6 = researcher5.getPassword();
        java.lang.String str7 = researcher5.getUserType();
        java.lang.String str8 = researcher5.getUserType();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "researcher" + "'", str6, "researcher");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Researcher" + "'", str7, "Researcher");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Researcher" + "'", str8, "Researcher");
    }

    @Test
    public void test0691() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0691");
        com.reservation_system.model.Faculty faculty5 = new com.reservation_system.model.Faculty((-1), "Student", "guest", "Student", true);
    }

    @Test
    public void test0692() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0692");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("data/test-userrepo.csv");
        boolean boolean2 = userRepository1.headLabCoordinatorExists();
        com.reservation_system.services.RegistrationService registrationService3 = new com.reservation_system.services.RegistrationService(userRepository1);
        boolean boolean4 = userRepository1.headLabCoordinatorExists();
        boolean boolean6 = userRepository1.emailExists("Andrew");
        com.reservation_system.services.RegistrationService registrationService7 = new com.reservation_system.services.RegistrationService(userRepository1);
        com.reservation_system.repository.UserRepository userRepository9 = new com.reservation_system.repository.UserRepository("data/test-userrepo.csv");
        com.reservation_system.services.RegistrationService registrationService10 = new com.reservation_system.services.RegistrationService(userRepository9);
        com.reservation_system.model.Faculty faculty16 = new com.reservation_system.model.Faculty(0, "Password1!", "data/test-userrepo.csv", "researcher", false);
        java.lang.String str17 = faculty16.getName();
        userRepository9.addUser((com.reservation_system.model.User) faculty16);
        boolean boolean19 = userRepository9.headLabCoordinatorExists();
        com.reservation_system.model.Guest guest25 = new com.reservation_system.model.Guest((int) (byte) -1, "guest", "Researcher", "Faculty", true);
        userRepository9.addUser((com.reservation_system.model.User) guest25);
        java.util.List<com.reservation_system.model.User> userList27 = userRepository9.getAllUsers();
        userRepository1.saveAllUsers(userList27);
        java.util.List<com.reservation_system.model.User> userList29 = userRepository1.getAllUsers();
        java.util.Optional<com.reservation_system.model.User> userOptional31 = userRepository1.findByEmail("headlabcoordinator");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "Password1!" + "'", str17, "Password1!");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNotNull(userList27);
        org.junit.Assert.assertNotNull(userList29);
        org.junit.Assert.assertNotNull(userOptional31);
    }

    @Test
    public void test0693() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0693");
        com.reservation_system.model.HeadLabCoordinator headLabCoordinator5 = new com.reservation_system.model.HeadLabCoordinator(102, "faculty", "Andrew", "researcher", false);
    }

    @Test
    public void test0694() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0694");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("data/test-userrepo.csv");
        int int2 = userRepository1.getNextID();
        int int3 = userRepository1.getNextID();
        boolean boolean5 = userRepository1.emailExists("faculty");
        com.reservation_system.model.LabManager labManager11 = new com.reservation_system.model.LabManager((int) (short) 0, "", "labmanager", "Password1!", true);
        userRepository1.addUser((com.reservation_system.model.User) labManager11);
        java.util.Optional<com.reservation_system.model.User> userOptional14 = userRepository1.findByEmail("");
        com.reservation_system.model.Researcher researcher20 = new com.reservation_system.model.Researcher((int) (byte) 100, "Password1!", "Password1!", "headlabcoordinator", true);
        userRepository1.addUser((com.reservation_system.model.User) researcher20);
        java.util.List<com.reservation_system.model.User> userList22 = userRepository1.getAllUsers();
        com.reservation_system.services.RegistrationService registrationService23 = new com.reservation_system.services.RegistrationService(userRepository1);
        java.util.List<com.reservation_system.model.User> userList24 = null;
        // The following exception was thrown during execution in test generation
        try {
            userRepository1.saveAllUsers(userList24);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 103 + "'", int2 == 103);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 103 + "'", int3 == 103);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(userOptional14);
        org.junit.Assert.assertNotNull(userList22);
    }

    @Test
    public void test0695() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0695");
        com.reservation_system.model.Student student5 = new com.reservation_system.model.Student((int) (short) -1, "guest", "hi!", "", false);
        java.lang.String str6 = student5.getEmail();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
    }

    @Test
    public void test0696() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0696");
        // The following exception was thrown during execution in test generation
        try {
            com.reservation_system.model.User user6 = com.reservation_system.patterns.factory.UserFactory.createUser("andrew@example.com", (int) 'a', "Andrew", "andrew@example.com", "Researcher", false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid user type: andrew@example.com");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0697() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0697");
        com.reservation_system.model.HeadLabCoordinator headLabCoordinator5 = new com.reservation_system.model.HeadLabCoordinator(102, "Student", "faculty", "Faculty", false);
        java.lang.String str6 = headLabCoordinator5.getUserType();
        java.lang.String str7 = headLabCoordinator5.getPassword();
        java.lang.String str8 = headLabCoordinator5.getUserType();
        boolean boolean9 = headLabCoordinator5.isApproved();
        java.lang.String str10 = headLabCoordinator5.getUserType();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "headlabcoordinator" + "'", str6, "headlabcoordinator");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Faculty" + "'", str7, "Faculty");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "headlabcoordinator" + "'", str8, "headlabcoordinator");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "headlabcoordinator" + "'", str10, "headlabcoordinator");
    }

    @Test
    public void test0698() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0698");
        com.reservation_system.model.HeadLabCoordinator headLabCoordinator5 = new com.reservation_system.model.HeadLabCoordinator(10, "faculty", "Faculty", "data/test-userrepo.csv", false);
        java.lang.String str6 = headLabCoordinator5.getUserType();
        java.lang.String str7 = headLabCoordinator5.getUserType();
        boolean boolean8 = headLabCoordinator5.requiresDepartmentApproval();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "headlabcoordinator" + "'", str6, "headlabcoordinator");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "headlabcoordinator" + "'", str7, "headlabcoordinator");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test0699() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0699");
        com.reservation_system.model.Researcher researcher5 = new com.reservation_system.model.Researcher(0, "labmanager", "", "labmanager", false);
        java.lang.String str6 = researcher5.getName();
        java.lang.String str7 = researcher5.getEmail();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "labmanager" + "'", str6, "labmanager");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
    }

    @Test
    public void test0700() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0700");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("data/test-userrepo.csv");
        boolean boolean2 = userRepository1.headLabCoordinatorExists();
        com.reservation_system.services.RegistrationService registrationService3 = new com.reservation_system.services.RegistrationService(userRepository1);
        boolean boolean4 = userRepository1.headLabCoordinatorExists();
        boolean boolean6 = userRepository1.emailExists("Andrew");
        com.reservation_system.services.RegistrationService registrationService7 = new com.reservation_system.services.RegistrationService(userRepository1);
        com.reservation_system.model.Researcher researcher13 = new com.reservation_system.model.Researcher((int) (short) -1, "andrew@example.com", "guest", "labmanager", false);
        java.lang.String str14 = researcher13.getUserType();
        java.lang.String str15 = researcher13.getName();
        java.lang.String str16 = researcher13.getUserType();
        userRepository1.addUser((com.reservation_system.model.User) researcher13);
        com.reservation_system.model.LabManager labManager23 = new com.reservation_system.model.LabManager((int) 'a', "headlabcoordinator", "Researcher", "Andrew", false);
        java.lang.String str24 = labManager23.getEmail();
        labManager23.setApproved(false);
        userRepository1.addUser((com.reservation_system.model.User) labManager23);
        int int28 = labManager23.getID();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Researcher" + "'", str14, "Researcher");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Researcher" + "'", str16, "Researcher");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "Researcher" + "'", str24, "Researcher");
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 97 + "'", int28 == 97);
    }

    @Test
    public void test0701() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0701");
        com.reservation_system.model.User user6 = com.reservation_system.patterns.factory.UserFactory.createUser("researcher", 32, "Password1!", "data/test-userrepo.csv", "", false);
        java.lang.Class<?> wildcardClass7 = user6.getClass();
        org.junit.Assert.assertNotNull(user6);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0702() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0702");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("data/test-userrepo.csv");
        com.reservation_system.services.RegistrationService registrationService2 = new com.reservation_system.services.RegistrationService(userRepository1);
        com.reservation_system.model.Faculty faculty8 = new com.reservation_system.model.Faculty(0, "Password1!", "data/test-userrepo.csv", "researcher", false);
        java.lang.String str9 = faculty8.getName();
        userRepository1.addUser((com.reservation_system.model.User) faculty8);
        boolean boolean11 = userRepository1.headLabCoordinatorExists();
        com.reservation_system.model.Guest guest17 = new com.reservation_system.model.Guest((int) (byte) -1, "guest", "Researcher", "Faculty", true);
        userRepository1.addUser((com.reservation_system.model.User) guest17);
        boolean boolean19 = userRepository1.headLabCoordinatorExists();
        com.reservation_system.services.RegistrationService registrationService20 = new com.reservation_system.services.RegistrationService(userRepository1);
        java.util.Optional<com.reservation_system.model.User> userOptional22 = userRepository1.findByEmail("labmanager");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Password1!" + "'", str9, "Password1!");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(userOptional22);
    }

    @Test
    public void test0703() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0703");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("data/test-userrepo.csv");
        com.reservation_system.services.RegistrationService registrationService2 = new com.reservation_system.services.RegistrationService(userRepository1);
        com.reservation_system.model.Faculty faculty8 = new com.reservation_system.model.Faculty(0, "Password1!", "data/test-userrepo.csv", "researcher", false);
        java.lang.String str9 = faculty8.getName();
        userRepository1.addUser((com.reservation_system.model.User) faculty8);
        boolean boolean11 = userRepository1.headLabCoordinatorExists();
        int int12 = userRepository1.getNextID();
        com.reservation_system.repository.UserRepository userRepository14 = new com.reservation_system.repository.UserRepository("data/test-userrepo.csv");
        java.util.List<com.reservation_system.model.User> userList15 = userRepository14.getAllUsers();
        com.reservation_system.services.RegistrationService registrationService16 = new com.reservation_system.services.RegistrationService(userRepository14);
        java.util.List<com.reservation_system.model.User> userList17 = userRepository14.getAllUsers();
        userRepository1.saveAllUsers(userList17);
        com.reservation_system.model.Faculty faculty24 = new com.reservation_system.model.Faculty((int) '#', "Andrew", "guest", "labmanager", true);
        userRepository1.addUser((com.reservation_system.model.User) faculty24);
        java.lang.String str26 = faculty24.getUserType();
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Password1!" + "'", str9, "Password1!");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 98 + "'", int12 == 98);
        org.junit.Assert.assertNotNull(userList15);
        org.junit.Assert.assertNotNull(userList17);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "Faculty" + "'", str26, "Faculty");
    }

    @Test
    public void test0704() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0704");
        com.reservation_system.model.Researcher researcher5 = new com.reservation_system.model.Researcher((int) '4', "labmanager", "Andrew", "researcher", true);
        java.lang.String str6 = researcher5.getUserType();
        researcher5.setApproved(false);
        java.lang.String str9 = researcher5.getEmail();
        java.lang.String str10 = researcher5.getUserType();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Researcher" + "'", str6, "Researcher");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Andrew" + "'", str9, "Andrew");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Researcher" + "'", str10, "Researcher");
    }

    @Test
    public void test0705() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0705");
        com.reservation_system.model.Guest guest5 = new com.reservation_system.model.Guest((int) (short) 1, "Guest", "", "student", true);
    }

    @Test
    public void test0706() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0706");
        com.reservation_system.model.Guest guest5 = new com.reservation_system.model.Guest((int) (byte) 100, "andrew@example.com", "student", "Researcher", false);
        java.lang.String str6 = guest5.getUserType();
        guest5.setApproved(false);
        java.lang.String str9 = guest5.getUserType();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Guest" + "'", str6, "Guest");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Guest" + "'", str9, "Guest");
    }

    @Test
    public void test0707() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0707");
        com.reservation_system.model.LabManager labManager5 = new com.reservation_system.model.LabManager((int) ' ', "", "hi!", "headlabcoordinator", true);
    }

    @Test
    public void test0708() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0708");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("data/test-userrepo.csv");
        com.reservation_system.services.RegistrationService registrationService2 = new com.reservation_system.services.RegistrationService(userRepository1);
        com.reservation_system.model.Faculty faculty8 = new com.reservation_system.model.Faculty(0, "Password1!", "data/test-userrepo.csv", "researcher", false);
        java.lang.String str9 = faculty8.getName();
        userRepository1.addUser((com.reservation_system.model.User) faculty8);
        boolean boolean11 = userRepository1.headLabCoordinatorExists();
        int int12 = userRepository1.getNextID();
        boolean boolean13 = userRepository1.headLabCoordinatorExists();
        com.reservation_system.model.Guest guest19 = new com.reservation_system.model.Guest((int) '4', "researcher", "data/test-userrepo.csv", "andrew@example.com", false);
        userRepository1.addUser((com.reservation_system.model.User) guest19);
        com.reservation_system.services.RegistrationService registrationService21 = new com.reservation_system.services.RegistrationService(userRepository1);
        com.reservation_system.services.RegistrationService registrationService22 = new com.reservation_system.services.RegistrationService(userRepository1);
        // The following exception was thrown during execution in test generation
        try {
            com.reservation_system.model.User user27 = registrationService22.registerUser("guest", "student", "faculty", "andrew@example.com");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid email format.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Password1!" + "'", str9, "Password1!");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 98 + "'", int12 == 98);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test0709() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0709");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("data/test-userrepo.csv");
        com.reservation_system.services.RegistrationService registrationService2 = new com.reservation_system.services.RegistrationService(userRepository1);
        com.reservation_system.model.Faculty faculty8 = new com.reservation_system.model.Faculty(0, "Password1!", "data/test-userrepo.csv", "researcher", false);
        java.lang.String str9 = faculty8.getName();
        userRepository1.addUser((com.reservation_system.model.User) faculty8);
        boolean boolean12 = userRepository1.emailExists("Faculty");
        int int13 = userRepository1.getNextID();
        java.util.List<com.reservation_system.model.User> userList14 = userRepository1.getAllUsers();
        boolean boolean16 = userRepository1.emailExists("student");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Password1!" + "'", str9, "Password1!");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 98 + "'", int13 == 98);
        org.junit.Assert.assertNotNull(userList14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test0710() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0710");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("data/test-userrepo.csv");
        com.reservation_system.services.RegistrationService registrationService2 = new com.reservation_system.services.RegistrationService(userRepository1);
        com.reservation_system.model.Faculty faculty8 = new com.reservation_system.model.Faculty(0, "Password1!", "data/test-userrepo.csv", "researcher", false);
        java.lang.String str9 = faculty8.getName();
        userRepository1.addUser((com.reservation_system.model.User) faculty8);
        java.util.List<com.reservation_system.model.User> userList11 = userRepository1.getAllUsers();
        com.reservation_system.model.LabManager labManager17 = new com.reservation_system.model.LabManager((int) (short) -1, "labmanager", "data/test-userrepo.csv", "Student", false);
        userRepository1.addUser((com.reservation_system.model.User) labManager17);
        com.reservation_system.services.RegistrationService registrationService19 = new com.reservation_system.services.RegistrationService(userRepository1);
        boolean boolean21 = userRepository1.emailExists("labmanager");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Password1!" + "'", str9, "Password1!");
        org.junit.Assert.assertNotNull(userList11);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    }

    @Test
    public void test0711() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0711");
        com.reservation_system.model.Guest guest5 = new com.reservation_system.model.Guest((int) (short) 10, "researcher", "", "andrew@example.com", false);
    }

    @Test
    public void test0712() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0712");
        com.reservation_system.model.User user6 = com.reservation_system.patterns.factory.UserFactory.createUser("headlabcoordinator", 0, "andrew@example.com", "Student", "", true);
        org.junit.Assert.assertNotNull(user6);
    }

    @Test
    public void test0713() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0713");
        com.reservation_system.model.Faculty faculty5 = new com.reservation_system.model.Faculty((int) '#', "data/test-userrepo.csv", "hi!", "Guest", false);
        boolean boolean6 = faculty5.requiresDepartmentApproval();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test0714() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0714");
        com.reservation_system.model.Researcher researcher5 = new com.reservation_system.model.Researcher((int) (short) -1, "faculty", "researcher", "hi!", true);
        java.lang.String str6 = researcher5.getUserType();
        int int7 = researcher5.getID();
        researcher5.setApproved(true);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Researcher" + "'", str6, "Researcher");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
    }

    @Test
    public void test0715() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0715");
        com.reservation_system.model.Student student5 = new com.reservation_system.model.Student(0, "labmanager", "Student", "andrew@example.com", false);
        boolean boolean6 = student5.requiresDepartmentApproval();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test0716() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0716");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("data/test-userrepo.csv");
        boolean boolean2 = userRepository1.headLabCoordinatorExists();
        com.reservation_system.services.RegistrationService registrationService3 = new com.reservation_system.services.RegistrationService(userRepository1);
        boolean boolean4 = userRepository1.headLabCoordinatorExists();
        boolean boolean6 = userRepository1.emailExists("Andrew");
        com.reservation_system.services.RegistrationService registrationService7 = new com.reservation_system.services.RegistrationService(userRepository1);
        java.util.Optional<com.reservation_system.model.User> userOptional9 = userRepository1.findByEmail("faculty");
        java.util.Optional<com.reservation_system.model.User> userOptional11 = userRepository1.findByEmail("Faculty");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(userOptional9);
        org.junit.Assert.assertNotNull(userOptional11);
    }

    @Test
    public void test0717() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0717");
        com.reservation_system.model.Faculty faculty5 = new com.reservation_system.model.Faculty((int) (byte) 1, "researcher", "Andrew", "", false);
        java.lang.String str6 = faculty5.getUserType();
        java.lang.String str7 = faculty5.getUserType();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Faculty" + "'", str6, "Faculty");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Faculty" + "'", str7, "Faculty");
    }

    @Test
    public void test0718() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0718");
        com.reservation_system.model.Faculty faculty5 = new com.reservation_system.model.Faculty(10, "student", "Student", "labmanager", false);
        java.lang.String str6 = faculty5.getUserType();
        java.lang.String str7 = faculty5.getUserType();
        faculty5.setApproved(false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Faculty" + "'", str6, "Faculty");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Faculty" + "'", str7, "Faculty");
    }

    @Test
    public void test0719() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0719");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("data/test-userrepo.csv");
        boolean boolean2 = userRepository1.headLabCoordinatorExists();
        com.reservation_system.services.RegistrationService registrationService3 = new com.reservation_system.services.RegistrationService(userRepository1);
        boolean boolean4 = userRepository1.headLabCoordinatorExists();
        boolean boolean5 = userRepository1.headLabCoordinatorExists();
        com.reservation_system.repository.UserRepository userRepository7 = new com.reservation_system.repository.UserRepository("data/test-userrepo.csv");
        com.reservation_system.services.RegistrationService registrationService8 = new com.reservation_system.services.RegistrationService(userRepository7);
        com.reservation_system.model.Faculty faculty14 = new com.reservation_system.model.Faculty(0, "Password1!", "data/test-userrepo.csv", "researcher", false);
        java.lang.String str15 = faculty14.getName();
        userRepository7.addUser((com.reservation_system.model.User) faculty14);
        boolean boolean17 = userRepository7.headLabCoordinatorExists();
        int int18 = userRepository7.getNextID();
        com.reservation_system.repository.UserRepository userRepository20 = new com.reservation_system.repository.UserRepository("data/test-userrepo.csv");
        java.util.List<com.reservation_system.model.User> userList21 = userRepository20.getAllUsers();
        com.reservation_system.services.RegistrationService registrationService22 = new com.reservation_system.services.RegistrationService(userRepository20);
        java.util.List<com.reservation_system.model.User> userList23 = userRepository20.getAllUsers();
        userRepository7.saveAllUsers(userList23);
        userRepository1.saveAllUsers(userList23);
        java.util.List<com.reservation_system.model.User> userList26 = userRepository1.getAllUsers();
        com.reservation_system.model.Student student32 = new com.reservation_system.model.Student(32, "Faculty", "andrew@example.com", "Researcher", false);
        userRepository1.addUser((com.reservation_system.model.User) student32);
        boolean boolean34 = userRepository1.headLabCoordinatorExists();
        java.util.Optional<com.reservation_system.model.User> userOptional36 = userRepository1.findByEmail("guest");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Password1!" + "'", str15, "Password1!");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 98 + "'", int18 == 98);
        org.junit.Assert.assertNotNull(userList21);
        org.junit.Assert.assertNotNull(userList23);
        org.junit.Assert.assertNotNull(userList26);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertNotNull(userOptional36);
    }

    @Test
    public void test0720() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0720");
        com.reservation_system.model.Guest guest5 = new com.reservation_system.model.Guest((int) (byte) 10, "Andrew", "Student", "guest", true);
        java.lang.String str6 = guest5.getPassword();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "guest" + "'", str6, "guest");
    }

    @Test
    public void test0721() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0721");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("data/test-userrepo.csv");
        com.reservation_system.services.RegistrationService registrationService2 = new com.reservation_system.services.RegistrationService(userRepository1);
        com.reservation_system.model.Faculty faculty8 = new com.reservation_system.model.Faculty(0, "Password1!", "data/test-userrepo.csv", "researcher", false);
        java.lang.String str9 = faculty8.getName();
        userRepository1.addUser((com.reservation_system.model.User) faculty8);
        com.reservation_system.services.RegistrationService registrationService11 = new com.reservation_system.services.RegistrationService(userRepository1);
        // The following exception was thrown during execution in test generation
        try {
            com.reservation_system.model.User user16 = registrationService11.registerUser("Andrew", "", "labmanager", "");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid user type.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Password1!" + "'", str9, "Password1!");
    }

    @Test
    public void test0722() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0722");
        com.reservation_system.model.HeadLabCoordinator headLabCoordinator5 = new com.reservation_system.model.HeadLabCoordinator(10, "Faculty", "researcher", "student", true);
        java.lang.String str6 = headLabCoordinator5.getUserType();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "headlabcoordinator" + "'", str6, "headlabcoordinator");
    }

    @Test
    public void test0723() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0723");
        com.reservation_system.model.Faculty faculty5 = new com.reservation_system.model.Faculty((int) '#', "Student", "student", "data/test-userrepo.csv", true);
        java.lang.String str6 = faculty5.getName();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Student" + "'", str6, "Student");
    }

    @Test
    public void test0724() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0724");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("data/test-userrepo.csv");
        com.reservation_system.services.RegistrationService registrationService2 = new com.reservation_system.services.RegistrationService(userRepository1);
        com.reservation_system.model.Faculty faculty8 = new com.reservation_system.model.Faculty(0, "Password1!", "data/test-userrepo.csv", "researcher", false);
        java.lang.String str9 = faculty8.getName();
        userRepository1.addUser((com.reservation_system.model.User) faculty8);
        boolean boolean11 = userRepository1.headLabCoordinatorExists();
        com.reservation_system.services.RegistrationService registrationService12 = new com.reservation_system.services.RegistrationService(userRepository1);
        com.reservation_system.services.RegistrationService registrationService13 = new com.reservation_system.services.RegistrationService(userRepository1);
        boolean boolean14 = userRepository1.headLabCoordinatorExists();
        java.util.List<com.reservation_system.model.User> userList15 = userRepository1.getAllUsers();
        boolean boolean16 = userRepository1.headLabCoordinatorExists();
        java.lang.Class<?> wildcardClass17 = userRepository1.getClass();
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Password1!" + "'", str9, "Password1!");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(userList15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test0725() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0725");
        com.reservation_system.model.Faculty faculty5 = new com.reservation_system.model.Faculty(10, "Password1!", "Password1!", "data/test-userrepo.csv", false);
        boolean boolean6 = faculty5.requiresDepartmentApproval();
        java.lang.Class<?> wildcardClass7 = faculty5.getClass();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0726() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0726");
        com.reservation_system.model.Student student5 = new com.reservation_system.model.Student((int) ' ', "student", "andrew@example.com", "data/test-userrepo.csv", false);
    }

    @Test
    public void test0727() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0727");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("data/test-userrepo.csv");
        boolean boolean2 = userRepository1.headLabCoordinatorExists();
        com.reservation_system.services.RegistrationService registrationService3 = new com.reservation_system.services.RegistrationService(userRepository1);
        boolean boolean4 = userRepository1.headLabCoordinatorExists();
        boolean boolean6 = userRepository1.emailExists("Andrew");
        com.reservation_system.services.RegistrationService registrationService7 = new com.reservation_system.services.RegistrationService(userRepository1);
        com.reservation_system.repository.UserRepository userRepository9 = new com.reservation_system.repository.UserRepository("data/test-userrepo.csv");
        com.reservation_system.services.RegistrationService registrationService10 = new com.reservation_system.services.RegistrationService(userRepository9);
        com.reservation_system.model.Faculty faculty16 = new com.reservation_system.model.Faculty(0, "Password1!", "data/test-userrepo.csv", "researcher", false);
        java.lang.String str17 = faculty16.getName();
        userRepository9.addUser((com.reservation_system.model.User) faculty16);
        boolean boolean19 = userRepository9.headLabCoordinatorExists();
        com.reservation_system.model.Guest guest25 = new com.reservation_system.model.Guest((int) (byte) -1, "guest", "Researcher", "Faculty", true);
        userRepository9.addUser((com.reservation_system.model.User) guest25);
        java.util.List<com.reservation_system.model.User> userList27 = userRepository9.getAllUsers();
        userRepository1.saveAllUsers(userList27);
        com.reservation_system.repository.UserRepository userRepository30 = new com.reservation_system.repository.UserRepository("data/test-userrepo.csv");
        com.reservation_system.services.RegistrationService registrationService31 = new com.reservation_system.services.RegistrationService(userRepository30);
        com.reservation_system.model.Faculty faculty37 = new com.reservation_system.model.Faculty(0, "Password1!", "data/test-userrepo.csv", "researcher", false);
        java.lang.String str38 = faculty37.getName();
        userRepository30.addUser((com.reservation_system.model.User) faculty37);
        boolean boolean40 = userRepository30.headLabCoordinatorExists();
        int int41 = userRepository30.getNextID();
        com.reservation_system.repository.UserRepository userRepository43 = new com.reservation_system.repository.UserRepository("data/test-userrepo.csv");
        com.reservation_system.services.RegistrationService registrationService44 = new com.reservation_system.services.RegistrationService(userRepository43);
        int int45 = userRepository43.getNextID();
        boolean boolean47 = userRepository43.emailExists("labmanager");
        java.util.List<com.reservation_system.model.User> userList48 = userRepository43.getAllUsers();
        userRepository30.saveAllUsers(userList48);
        userRepository1.saveAllUsers(userList48);
        com.reservation_system.services.RegistrationService registrationService51 = new com.reservation_system.services.RegistrationService(userRepository1);
        // The following exception was thrown during execution in test generation
        try {
            com.reservation_system.model.User user56 = registrationService51.registerUser("data/test-userrepo.csv", "Student", "Researcher", "faculty");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid user type.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "Password1!" + "'", str17, "Password1!");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(userList27);
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "Password1!" + "'", str38, "Password1!");
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 98 + "'", int41 == 98);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 98 + "'", int45 == 98);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertNotNull(userList48);
    }

    @Test
    public void test0728() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0728");
        com.reservation_system.model.Faculty faculty5 = new com.reservation_system.model.Faculty((int) (short) 0, "guest", "Andrew", "guest", true);
        faculty5.setApproved(false);
        java.lang.String str8 = faculty5.getUserType();
        java.lang.String str9 = faculty5.getUserType();
        java.lang.String str10 = faculty5.getUserType();
        java.lang.String str11 = faculty5.getEmail();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Faculty" + "'", str8, "Faculty");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Faculty" + "'", str9, "Faculty");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Faculty" + "'", str10, "Faculty");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Andrew" + "'", str11, "Andrew");
    }

    @Test
    public void test0729() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0729");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("data/test-userrepo.csv");
        com.reservation_system.services.RegistrationService registrationService2 = new com.reservation_system.services.RegistrationService(userRepository1);
        com.reservation_system.model.Faculty faculty8 = new com.reservation_system.model.Faculty(0, "Password1!", "data/test-userrepo.csv", "researcher", false);
        java.lang.String str9 = faculty8.getName();
        userRepository1.addUser((com.reservation_system.model.User) faculty8);
        boolean boolean12 = userRepository1.emailExists("Faculty");
        int int13 = userRepository1.getNextID();
        com.reservation_system.model.Researcher researcher19 = new com.reservation_system.model.Researcher((int) (short) 10, "hi!", "Andrew", "Guest", false);
        java.lang.String str20 = researcher19.getUserType();
        userRepository1.addUser((com.reservation_system.model.User) researcher19);
        com.reservation_system.model.Faculty faculty27 = new com.reservation_system.model.Faculty((int) '4', "labmanager", "hi!", "researcher", false);
        java.lang.String str28 = faculty27.getUserType();
        userRepository1.addUser((com.reservation_system.model.User) faculty27);
        java.util.List<com.reservation_system.model.User> userList30 = userRepository1.getAllUsers();
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Password1!" + "'", str9, "Password1!");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 98 + "'", int13 == 98);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "Researcher" + "'", str20, "Researcher");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "Faculty" + "'", str28, "Faculty");
        org.junit.Assert.assertNotNull(userList30);
    }

    @Test
    public void test0730() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0730");
        com.reservation_system.model.User user6 = com.reservation_system.patterns.factory.UserFactory.createUser("Researcher", (int) '4', "Guest", "Password1!", "guest", true);
        org.junit.Assert.assertNotNull(user6);
    }

    @Test
    public void test0731() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0731");
        com.reservation_system.model.Faculty faculty5 = new com.reservation_system.model.Faculty(0, "", "researcher", "Researcher", false);
        int int6 = faculty5.getID();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test0732() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0732");
        com.reservation_system.model.LabManager labManager5 = new com.reservation_system.model.LabManager((int) (byte) 10, "Student", "student", "", false);
        java.lang.String str6 = labManager5.getUserType();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "labmanager" + "'", str6, "labmanager");
    }

    @Test
    public void test0733() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0733");
        com.reservation_system.model.LabManager labManager5 = new com.reservation_system.model.LabManager((int) (byte) 1, "Guest", "", "hi!", false);
    }

    @Test
    public void test0734() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0734");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("data/test-userrepo.csv");
        com.reservation_system.services.RegistrationService registrationService2 = new com.reservation_system.services.RegistrationService(userRepository1);
        com.reservation_system.model.Faculty faculty8 = new com.reservation_system.model.Faculty(0, "Password1!", "data/test-userrepo.csv", "researcher", false);
        java.lang.String str9 = faculty8.getName();
        userRepository1.addUser((com.reservation_system.model.User) faculty8);
        boolean boolean11 = userRepository1.headLabCoordinatorExists();
        com.reservation_system.model.Guest guest17 = new com.reservation_system.model.Guest((int) (byte) -1, "guest", "Researcher", "Faculty", true);
        userRepository1.addUser((com.reservation_system.model.User) guest17);
        boolean boolean20 = userRepository1.emailExists("Password1!");
        boolean boolean22 = userRepository1.emailExists("hi!");
        int int23 = userRepository1.getNextID();
        com.reservation_system.repository.UserRepository userRepository25 = new com.reservation_system.repository.UserRepository("data/test-userrepo.csv");
        com.reservation_system.services.RegistrationService registrationService26 = new com.reservation_system.services.RegistrationService(userRepository25);
        com.reservation_system.model.Faculty faculty32 = new com.reservation_system.model.Faculty(0, "Password1!", "data/test-userrepo.csv", "researcher", false);
        java.lang.String str33 = faculty32.getName();
        userRepository25.addUser((com.reservation_system.model.User) faculty32);
        boolean boolean35 = userRepository25.headLabCoordinatorExists();
        com.reservation_system.model.Guest guest41 = new com.reservation_system.model.Guest((int) (byte) -1, "guest", "Researcher", "Faculty", true);
        userRepository25.addUser((com.reservation_system.model.User) guest41);
        boolean boolean43 = userRepository25.headLabCoordinatorExists();
        com.reservation_system.repository.UserRepository userRepository45 = new com.reservation_system.repository.UserRepository("data/test-userrepo.csv");
        com.reservation_system.services.RegistrationService registrationService46 = new com.reservation_system.services.RegistrationService(userRepository45);
        com.reservation_system.model.Faculty faculty52 = new com.reservation_system.model.Faculty(0, "Password1!", "data/test-userrepo.csv", "researcher", false);
        java.lang.String str53 = faculty52.getName();
        userRepository45.addUser((com.reservation_system.model.User) faculty52);
        boolean boolean55 = userRepository45.headLabCoordinatorExists();
        com.reservation_system.repository.UserRepository userRepository57 = new com.reservation_system.repository.UserRepository("data/test-userrepo.csv");
        com.reservation_system.services.RegistrationService registrationService58 = new com.reservation_system.services.RegistrationService(userRepository57);
        com.reservation_system.model.Faculty faculty64 = new com.reservation_system.model.Faculty(0, "Password1!", "data/test-userrepo.csv", "researcher", false);
        java.lang.String str65 = faculty64.getName();
        userRepository57.addUser((com.reservation_system.model.User) faculty64);
        java.util.List<com.reservation_system.model.User> userList67 = userRepository57.getAllUsers();
        userRepository45.saveAllUsers(userList67);
        userRepository25.saveAllUsers(userList67);
        boolean boolean71 = userRepository25.emailExists("hi!");
        com.reservation_system.repository.UserRepository userRepository73 = new com.reservation_system.repository.UserRepository("data/test-userrepo.csv");
        com.reservation_system.services.RegistrationService registrationService74 = new com.reservation_system.services.RegistrationService(userRepository73);
        com.reservation_system.model.Faculty faculty80 = new com.reservation_system.model.Faculty(0, "Password1!", "data/test-userrepo.csv", "researcher", false);
        java.lang.String str81 = faculty80.getName();
        userRepository73.addUser((com.reservation_system.model.User) faculty80);
        boolean boolean83 = userRepository73.headLabCoordinatorExists();
        com.reservation_system.services.RegistrationService registrationService84 = new com.reservation_system.services.RegistrationService(userRepository73);
        java.util.List<com.reservation_system.model.User> userList85 = userRepository73.getAllUsers();
        userRepository25.saveAllUsers(userList85);
        userRepository1.saveAllUsers(userList85);
        com.reservation_system.services.RegistrationService registrationService88 = new com.reservation_system.services.RegistrationService(userRepository1);
        boolean boolean89 = userRepository1.headLabCoordinatorExists();
        java.util.List<com.reservation_system.model.User> userList90 = userRepository1.getAllUsers();
        com.reservation_system.model.Faculty faculty96 = new com.reservation_system.model.Faculty((int) (short) 0, "guest", "Andrew", "guest", true);
        faculty96.setApproved(false);
        userRepository1.addUser((com.reservation_system.model.User) faculty96);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Password1!" + "'", str9, "Password1!");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 98 + "'", int23 == 98);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "Password1!" + "'", str33, "Password1!");
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertEquals("'" + str53 + "' != '" + "Password1!" + "'", str53, "Password1!");
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
        org.junit.Assert.assertEquals("'" + str65 + "' != '" + "Password1!" + "'", str65, "Password1!");
        org.junit.Assert.assertNotNull(userList67);
        org.junit.Assert.assertTrue("'" + boolean71 + "' != '" + true + "'", boolean71 == true);
        org.junit.Assert.assertEquals("'" + str81 + "' != '" + "Password1!" + "'", str81, "Password1!");
        org.junit.Assert.assertTrue("'" + boolean83 + "' != '" + false + "'", boolean83 == false);
        org.junit.Assert.assertNotNull(userList85);
        org.junit.Assert.assertTrue("'" + boolean89 + "' != '" + false + "'", boolean89 == false);
        org.junit.Assert.assertNotNull(userList90);
    }

    @Test
    public void test0735() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0735");
        com.reservation_system.model.Faculty faculty5 = new com.reservation_system.model.Faculty((int) '#', "Student", "student", "data/test-userrepo.csv", true);
        java.lang.String str6 = faculty5.getPassword();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "data/test-userrepo.csv" + "'", str6, "data/test-userrepo.csv");
    }

    @Test
    public void test0736() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0736");
        com.reservation_system.model.LabManager labManager5 = new com.reservation_system.model.LabManager((int) '#', "headlabcoordinator", "", "Guest", true);
        java.lang.String str6 = labManager5.getUserType();
        labManager5.setApproved(true);
        java.lang.String str9 = labManager5.getUserType();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "labmanager" + "'", str6, "labmanager");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "labmanager" + "'", str9, "labmanager");
    }

    @Test
    public void test0737() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0737");
        com.reservation_system.model.Student student5 = new com.reservation_system.model.Student((int) (byte) 10, "Researcher", "Password1!", "headlabcoordinator", true);
        java.lang.String str6 = student5.getUserType();
        java.lang.String str7 = student5.getUserType();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Student" + "'", str6, "Student");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Student" + "'", str7, "Student");
    }

    @Test
    public void test0738() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0738");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("data/test-userrepo.csv");
        com.reservation_system.services.RegistrationService registrationService2 = new com.reservation_system.services.RegistrationService(userRepository1);
        com.reservation_system.model.Faculty faculty8 = new com.reservation_system.model.Faculty(0, "Password1!", "data/test-userrepo.csv", "researcher", false);
        java.lang.String str9 = faculty8.getName();
        userRepository1.addUser((com.reservation_system.model.User) faculty8);
        boolean boolean12 = userRepository1.emailExists("Faculty");
        int int13 = userRepository1.getNextID();
        com.reservation_system.services.RegistrationService registrationService14 = new com.reservation_system.services.RegistrationService(userRepository1);
        com.reservation_system.services.RegistrationService registrationService15 = new com.reservation_system.services.RegistrationService(userRepository1);
        // The following exception was thrown during execution in test generation
        try {
            com.reservation_system.model.User user20 = registrationService15.registerUser("data/test-userrepo.csv", "Andrew", "Student", "Password1!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid user type.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Password1!" + "'", str9, "Password1!");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 98 + "'", int13 == 98);
    }

    @Test
    public void test0739() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0739");
        com.reservation_system.model.Guest guest5 = new com.reservation_system.model.Guest(97, "Password1!", "faculty", "student", true);
    }

    @Test
    public void test0740() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0740");
        com.reservation_system.model.Researcher researcher5 = new com.reservation_system.model.Researcher(102, "hi!", "Faculty", "researcher", true);
        java.lang.String str6 = researcher5.getUserType();
        java.lang.String str7 = researcher5.getUserType();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Researcher" + "'", str6, "Researcher");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Researcher" + "'", str7, "Researcher");
    }

    @Test
    public void test0741() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0741");
        com.reservation_system.model.LabManager labManager5 = new com.reservation_system.model.LabManager(10, "Faculty", "faculty", "Password1!", true);
        java.lang.String str6 = labManager5.getPassword();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Password1!" + "'", str6, "Password1!");
    }

    @Test
    public void test0742() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0742");
        com.reservation_system.model.Faculty faculty5 = new com.reservation_system.model.Faculty((int) (byte) 100, "student", "", "researcher", false);
        java.lang.String str6 = faculty5.getUserType();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Faculty" + "'", str6, "Faculty");
    }

    @Test
    public void test0743() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0743");
        com.reservation_system.model.Researcher researcher5 = new com.reservation_system.model.Researcher((int) (short) -1, "faculty", "researcher", "hi!", true);
        researcher5.setApproved(false);
        java.lang.String str8 = researcher5.getEmail();
        java.lang.String str9 = researcher5.getUserType();
        java.lang.String str10 = researcher5.getUserType();
        researcher5.setApproved(true);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "researcher" + "'", str8, "researcher");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Researcher" + "'", str9, "Researcher");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Researcher" + "'", str10, "Researcher");
    }

    @Test
    public void test0744() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0744");
        com.reservation_system.model.Researcher researcher5 = new com.reservation_system.model.Researcher((int) (short) 10, "researcher", "Andrew", "guest", false);
    }

    @Test
    public void test0745() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0745");
        com.reservation_system.model.Faculty faculty5 = new com.reservation_system.model.Faculty((int) (short) 100, "data/test-userrepo.csv", "Password1!", "faculty", true);
    }

    @Test
    public void test0746() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0746");
        com.reservation_system.model.LabManager labManager5 = new com.reservation_system.model.LabManager(102, "andrew@example.com", "researcher", "guest", true);
        java.lang.String str6 = labManager5.getUserType();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "labmanager" + "'", str6, "labmanager");
    }

    @Test
    public void test0747() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0747");
        com.reservation_system.model.Faculty faculty5 = new com.reservation_system.model.Faculty(10, "researcher", "faculty", "", false);
        java.lang.String str6 = faculty5.getUserType();
        java.lang.String str7 = faculty5.getPassword();
        java.lang.String str8 = faculty5.getUserType();
        java.lang.String str9 = faculty5.getUserType();
        java.lang.String str10 = faculty5.getEmail();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Faculty" + "'", str6, "Faculty");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Faculty" + "'", str8, "Faculty");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Faculty" + "'", str9, "Faculty");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "faculty" + "'", str10, "faculty");
    }

    @Test
    public void test0748() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0748");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("data/test-userrepo.csv");
        com.reservation_system.services.RegistrationService registrationService2 = new com.reservation_system.services.RegistrationService(userRepository1);
        com.reservation_system.model.Faculty faculty8 = new com.reservation_system.model.Faculty(0, "Password1!", "data/test-userrepo.csv", "researcher", false);
        java.lang.String str9 = faculty8.getName();
        userRepository1.addUser((com.reservation_system.model.User) faculty8);
        boolean boolean11 = faculty8.isApproved();
        int int12 = faculty8.getID();
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Password1!" + "'", str9, "Password1!");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test0749() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0749");
        com.reservation_system.model.Researcher researcher5 = new com.reservation_system.model.Researcher((int) (byte) 100, "faculty", "andrew@example.com", "andrew@example.com", true);
    }

    @Test
    public void test0750() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0750");
        com.reservation_system.model.Faculty faculty5 = new com.reservation_system.model.Faculty(0, "andrew@example.com", "Researcher", "faculty", false);
    }

    @Test
    public void test0751() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0751");
        com.reservation_system.model.User user6 = com.reservation_system.patterns.factory.UserFactory.createUser("student", (int) (short) 100, "data/test-userrepo.csv", "headlabcoordinator", "labmanager", true);
        org.junit.Assert.assertNotNull(user6);
    }

    @Test
    public void test0752() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0752");
        com.reservation_system.model.User user6 = com.reservation_system.patterns.factory.UserFactory.createUser("Researcher", (int) (byte) -1, "Researcher", "headlabcoordinator", "student", true);
        org.junit.Assert.assertNotNull(user6);
    }

    @Test
    public void test0753() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0753");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("data/test-userrepo.csv");
        int int2 = userRepository1.getNextID();
        int int3 = userRepository1.getNextID();
        boolean boolean5 = userRepository1.emailExists("faculty");
        java.util.Optional<com.reservation_system.model.User> userOptional7 = userRepository1.findByEmail("");
        com.reservation_system.repository.UserRepository userRepository9 = new com.reservation_system.repository.UserRepository("data/test-userrepo.csv");
        java.util.List<com.reservation_system.model.User> userList10 = userRepository9.getAllUsers();
        java.util.List<com.reservation_system.model.User> userList11 = userRepository9.getAllUsers();
        userRepository1.saveAllUsers(userList11);
        boolean boolean13 = userRepository1.headLabCoordinatorExists();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 98 + "'", int2 == 98);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 98 + "'", int3 == 98);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(userOptional7);
        org.junit.Assert.assertNotNull(userList10);
        org.junit.Assert.assertNotNull(userList11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test0754() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0754");
        com.reservation_system.model.Faculty faculty5 = new com.reservation_system.model.Faculty((int) (byte) -1, "Faculty", "Guest", "Faculty", false);
        faculty5.setApproved(false);
        boolean boolean8 = faculty5.isApproved();
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test0755() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0755");
        com.reservation_system.model.LabManager labManager5 = new com.reservation_system.model.LabManager((int) (short) 10, "hi!", "", "student", true);
    }

    @Test
    public void test0756() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0756");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("data/test-userrepo.csv");
        int int2 = userRepository1.getNextID();
        int int3 = userRepository1.getNextID();
        boolean boolean5 = userRepository1.emailExists("faculty");
        boolean boolean6 = userRepository1.headLabCoordinatorExists();
        boolean boolean8 = userRepository1.emailExists("");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 98 + "'", int2 == 98);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 98 + "'", int3 == 98);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
// flaky "13) test0756(com.reservation_system.randoop.registrationservice.RegressionTest1)":         org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test0757() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0757");
        com.reservation_system.model.User user6 = com.reservation_system.patterns.factory.UserFactory.createUser("Student", 10, "", "", "", true);
        java.lang.Class<?> wildcardClass7 = user6.getClass();
        org.junit.Assert.assertNotNull(user6);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0758() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0758");
        com.reservation_system.model.Guest guest5 = new com.reservation_system.model.Guest(52, "student", "data/test-userrepo.csv", "researcher", true);
        boolean boolean6 = guest5.isApproved();
        java.lang.String str7 = guest5.getUserType();
        java.lang.Class<?> wildcardClass8 = guest5.getClass();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Guest" + "'", str7, "Guest");
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0759() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0759");
        // The following exception was thrown during execution in test generation
        try {
            com.reservation_system.model.User user6 = com.reservation_system.patterns.factory.UserFactory.createUser("", (int) ' ', "", "", "data/test-userrepo.csv", true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid user type: ");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0760() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0760");
        // The following exception was thrown during execution in test generation
        try {
            com.reservation_system.model.User user6 = com.reservation_system.patterns.factory.UserFactory.createUser("", (int) '#', "Password1!", "Student", "Student", true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid user type: ");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0761() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0761");
        com.reservation_system.model.Student student5 = new com.reservation_system.model.Student(0, "student", "data/test-userrepo.csv", "Faculty", true);
    }

    @Test
    public void test0762() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0762");
        com.reservation_system.model.LabManager labManager5 = new com.reservation_system.model.LabManager(0, "", "headlabcoordinator", "", true);
    }

    @Test
    public void test0763() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0763");
        com.reservation_system.model.User user6 = com.reservation_system.patterns.factory.UserFactory.createUser("student", (int) '4', "", "researcher", "hi!", true);
        org.junit.Assert.assertNotNull(user6);
    }

    @Test
    public void test0764() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0764");
        com.reservation_system.model.Researcher researcher5 = new com.reservation_system.model.Researcher((int) (short) -1, "andrew@example.com", "guest", "labmanager", false);
        java.lang.String str6 = researcher5.getPassword();
        boolean boolean7 = researcher5.requiresDepartmentApproval();
        java.lang.String str8 = researcher5.getUserType();
        int int9 = researcher5.getID();
        int int10 = researcher5.getID();
        int int11 = researcher5.getID();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "labmanager" + "'", str6, "labmanager");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Researcher" + "'", str8, "Researcher");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
    }

    @Test
    public void test0765() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0765");
        com.reservation_system.model.Researcher researcher5 = new com.reservation_system.model.Researcher((int) (byte) 0, "researcher", "Andrew", "andrew@example.com", false);
    }

    @Test
    public void test0766() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0766");
        com.reservation_system.model.User user6 = com.reservation_system.patterns.factory.UserFactory.createUser("faculty", (int) (short) -1, "", "student", "andrew@example.com", false);
        int int7 = user6.getID();
        org.junit.Assert.assertNotNull(user6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
    }

    @Test
    public void test0767() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0767");
        com.reservation_system.model.Guest guest5 = new com.reservation_system.model.Guest(52, "student", "data/test-userrepo.csv", "researcher", true);
        boolean boolean6 = guest5.isApproved();
        java.lang.String str7 = guest5.getEmail();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "data/test-userrepo.csv" + "'", str7, "data/test-userrepo.csv");
    }

    @Test
    public void test0768() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0768");
        com.reservation_system.model.Researcher researcher5 = new com.reservation_system.model.Researcher((int) (short) 1, "Password1!", "headlabcoordinator", "", false);
        researcher5.setApproved(true);
        researcher5.setApproved(false);
        java.lang.String str10 = researcher5.getUserType();
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Researcher" + "'", str10, "Researcher");
    }

    @Test
    public void test0769() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0769");
        com.reservation_system.model.Faculty faculty5 = new com.reservation_system.model.Faculty(10, "researcher", "faculty", "", false);
        java.lang.String str6 = faculty5.getUserType();
        java.lang.String str7 = faculty5.getPassword();
        java.lang.String str8 = faculty5.getUserType();
        java.lang.String str9 = faculty5.getUserType();
        java.lang.String str10 = faculty5.getUserType();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Faculty" + "'", str6, "Faculty");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Faculty" + "'", str8, "Faculty");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Faculty" + "'", str9, "Faculty");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Faculty" + "'", str10, "Faculty");
    }

    @Test
    public void test0770() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0770");
        com.reservation_system.model.Researcher researcher5 = new com.reservation_system.model.Researcher(101, "Researcher", "Andrew", "Student", true);
    }

    @Test
    public void test0771() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0771");
        com.reservation_system.model.Guest guest5 = new com.reservation_system.model.Guest((-1), "researcher", "labmanager", "headlabcoordinator", true);
        java.lang.String str6 = guest5.getEmail();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "labmanager" + "'", str6, "labmanager");
    }

    @Test
    public void test0772() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0772");
        // The following exception was thrown during execution in test generation
        try {
            com.reservation_system.model.User user6 = com.reservation_system.patterns.factory.UserFactory.createUser("", (int) 'a', "Researcher", "labmanager", "headlabcoordinator", false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid user type: ");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0773() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0773");
        com.reservation_system.model.HeadLabCoordinator headLabCoordinator5 = new com.reservation_system.model.HeadLabCoordinator(10, "researcher", "headlabcoordinator", "faculty", false);
        java.lang.String str6 = headLabCoordinator5.getUserType();
        java.lang.String str7 = headLabCoordinator5.getEmail();
        java.lang.String str8 = headLabCoordinator5.getPassword();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "headlabcoordinator" + "'", str6, "headlabcoordinator");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "headlabcoordinator" + "'", str7, "headlabcoordinator");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "faculty" + "'", str8, "faculty");
    }

    @Test
    public void test0774() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0774");
        com.reservation_system.model.HeadLabCoordinator headLabCoordinator5 = new com.reservation_system.model.HeadLabCoordinator(1, "guest", "Researcher", "Student", true);
        java.lang.String str6 = headLabCoordinator5.getEmail();
        java.lang.String str7 = headLabCoordinator5.getEmail();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Researcher" + "'", str6, "Researcher");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Researcher" + "'", str7, "Researcher");
    }

    @Test
    public void test0775() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0775");
        com.reservation_system.model.HeadLabCoordinator headLabCoordinator5 = new com.reservation_system.model.HeadLabCoordinator((int) (short) 100, "Guest", "researcher", "headlabcoordinator", true);
        java.lang.String str6 = headLabCoordinator5.getUserType();
        int int7 = headLabCoordinator5.getID();
        headLabCoordinator5.setApproved(true);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "headlabcoordinator" + "'", str6, "headlabcoordinator");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 100 + "'", int7 == 100);
    }

    @Test
    public void test0776() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0776");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("data/test-userrepo.csv");
        com.reservation_system.services.RegistrationService registrationService2 = new com.reservation_system.services.RegistrationService(userRepository1);
        com.reservation_system.model.Faculty faculty8 = new com.reservation_system.model.Faculty(0, "Password1!", "data/test-userrepo.csv", "researcher", false);
        java.lang.String str9 = faculty8.getName();
        userRepository1.addUser((com.reservation_system.model.User) faculty8);
        boolean boolean11 = userRepository1.headLabCoordinatorExists();
        com.reservation_system.services.RegistrationService registrationService12 = new com.reservation_system.services.RegistrationService(userRepository1);
        com.reservation_system.services.RegistrationService registrationService13 = new com.reservation_system.services.RegistrationService(userRepository1);
        boolean boolean14 = userRepository1.headLabCoordinatorExists();
        java.util.List<com.reservation_system.model.User> userList15 = userRepository1.getAllUsers();
        java.util.List<com.reservation_system.model.User> userList16 = userRepository1.getAllUsers();
        com.reservation_system.repository.UserRepository userRepository18 = new com.reservation_system.repository.UserRepository("data/test-userrepo.csv");
        com.reservation_system.services.RegistrationService registrationService19 = new com.reservation_system.services.RegistrationService(userRepository18);
        com.reservation_system.model.Faculty faculty25 = new com.reservation_system.model.Faculty(0, "Password1!", "data/test-userrepo.csv", "researcher", false);
        java.lang.String str26 = faculty25.getName();
        userRepository18.addUser((com.reservation_system.model.User) faculty25);
        boolean boolean28 = userRepository18.headLabCoordinatorExists();
        int int29 = userRepository18.getNextID();
        com.reservation_system.repository.UserRepository userRepository31 = new com.reservation_system.repository.UserRepository("data/test-userrepo.csv");
        java.util.List<com.reservation_system.model.User> userList32 = userRepository31.getAllUsers();
        com.reservation_system.services.RegistrationService registrationService33 = new com.reservation_system.services.RegistrationService(userRepository31);
        java.util.List<com.reservation_system.model.User> userList34 = userRepository31.getAllUsers();
        userRepository18.saveAllUsers(userList34);
        userRepository1.saveAllUsers(userList34);
        boolean boolean37 = userRepository1.headLabCoordinatorExists();
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Password1!" + "'", str9, "Password1!");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(userList15);
        org.junit.Assert.assertNotNull(userList16);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "Password1!" + "'", str26, "Password1!");
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 98 + "'", int29 == 98);
        org.junit.Assert.assertNotNull(userList32);
        org.junit.Assert.assertNotNull(userList34);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
    }

    @Test
    public void test0777() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0777");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("data/test-userrepo.csv");
        com.reservation_system.services.RegistrationService registrationService2 = new com.reservation_system.services.RegistrationService(userRepository1);
        com.reservation_system.model.Faculty faculty8 = new com.reservation_system.model.Faculty(0, "Password1!", "data/test-userrepo.csv", "researcher", false);
        java.lang.String str9 = faculty8.getName();
        userRepository1.addUser((com.reservation_system.model.User) faculty8);
        boolean boolean11 = userRepository1.headLabCoordinatorExists();
        int int12 = userRepository1.getNextID();
        boolean boolean13 = userRepository1.headLabCoordinatorExists();
        com.reservation_system.model.Guest guest19 = new com.reservation_system.model.Guest((int) '4', "researcher", "data/test-userrepo.csv", "andrew@example.com", false);
        userRepository1.addUser((com.reservation_system.model.User) guest19);
        com.reservation_system.services.RegistrationService registrationService21 = new com.reservation_system.services.RegistrationService(userRepository1);
        com.reservation_system.services.RegistrationService registrationService22 = new com.reservation_system.services.RegistrationService(userRepository1);
        // The following exception was thrown during execution in test generation
        try {
            com.reservation_system.model.User user27 = registrationService22.registerUser("andrew@example.com", "", "Researcher", "Guest");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid user type.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Password1!" + "'", str9, "Password1!");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 98 + "'", int12 == 98);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test0778() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0778");
        com.reservation_system.model.Guest guest5 = new com.reservation_system.model.Guest((int) (byte) -1, "Faculty", "Password1!", "Researcher", true);
    }

    @Test
    public void test0779() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0779");
        com.reservation_system.model.Faculty faculty5 = new com.reservation_system.model.Faculty((int) ' ', "", "guest", "Andrew", false);
        java.lang.String str6 = faculty5.getUserType();
        java.lang.Class<?> wildcardClass7 = faculty5.getClass();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Faculty" + "'", str6, "Faculty");
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0780() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0780");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("data/test-userrepo.csv");
        com.reservation_system.services.RegistrationService registrationService2 = new com.reservation_system.services.RegistrationService(userRepository1);
        com.reservation_system.model.Faculty faculty8 = new com.reservation_system.model.Faculty(0, "Password1!", "data/test-userrepo.csv", "researcher", false);
        java.lang.String str9 = faculty8.getName();
        userRepository1.addUser((com.reservation_system.model.User) faculty8);
        boolean boolean11 = userRepository1.headLabCoordinatorExists();
        com.reservation_system.services.RegistrationService registrationService12 = new com.reservation_system.services.RegistrationService(userRepository1);
        com.reservation_system.services.RegistrationService registrationService13 = new com.reservation_system.services.RegistrationService(userRepository1);
        java.util.Optional<com.reservation_system.model.User> userOptional15 = userRepository1.findByEmail("Andrew");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Password1!" + "'", str9, "Password1!");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(userOptional15);
    }

    @Test
    public void test0781() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0781");
        com.reservation_system.model.LabManager labManager5 = new com.reservation_system.model.LabManager((int) (short) 0, "", "labmanager", "Password1!", true);
        boolean boolean6 = labManager5.requiresDepartmentApproval();
        boolean boolean7 = labManager5.requiresDepartmentApproval();
        java.lang.String str8 = labManager5.getUserType();
        java.lang.String str9 = labManager5.getName();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "labmanager" + "'", str8, "labmanager");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test0782() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0782");
        com.reservation_system.model.Student student5 = new com.reservation_system.model.Student(52, "Andrew", "hi!", "headlabcoordinator", false);
    }

    @Test
    public void test0783() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0783");
        com.reservation_system.model.HeadLabCoordinator headLabCoordinator5 = new com.reservation_system.model.HeadLabCoordinator(10, "", "Researcher", "hi!", true);
    }

    @Test
    public void test0784() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0784");
        com.reservation_system.model.LabManager labManager5 = new com.reservation_system.model.LabManager((int) (short) 100, "Faculty", "student", "Researcher", false);
        int int6 = labManager5.getID();
        java.lang.String str7 = labManager5.getUserType();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "labmanager" + "'", str7, "labmanager");
    }

    @Test
    public void test0785() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0785");
        com.reservation_system.model.Faculty faculty5 = new com.reservation_system.model.Faculty(100, "student", "Andrew", "researcher", true);
        java.lang.String str6 = faculty5.getEmail();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Andrew" + "'", str6, "Andrew");
    }

    @Test
    public void test0786() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0786");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("data/test-userrepo.csv");
        boolean boolean2 = userRepository1.headLabCoordinatorExists();
        com.reservation_system.services.RegistrationService registrationService3 = new com.reservation_system.services.RegistrationService(userRepository1);
        boolean boolean4 = userRepository1.headLabCoordinatorExists();
        boolean boolean6 = userRepository1.emailExists("Andrew");
        com.reservation_system.services.RegistrationService registrationService7 = new com.reservation_system.services.RegistrationService(userRepository1);
        java.util.Optional<com.reservation_system.model.User> userOptional9 = userRepository1.findByEmail("faculty");
        com.reservation_system.services.RegistrationService registrationService10 = new com.reservation_system.services.RegistrationService(userRepository1);
        com.reservation_system.repository.UserRepository userRepository12 = new com.reservation_system.repository.UserRepository("data/test-userrepo.csv");
        com.reservation_system.services.RegistrationService registrationService13 = new com.reservation_system.services.RegistrationService(userRepository12);
        com.reservation_system.model.Faculty faculty19 = new com.reservation_system.model.Faculty(0, "Password1!", "data/test-userrepo.csv", "researcher", false);
        java.lang.String str20 = faculty19.getName();
        userRepository12.addUser((com.reservation_system.model.User) faculty19);
        boolean boolean22 = userRepository12.headLabCoordinatorExists();
        com.reservation_system.model.Guest guest28 = new com.reservation_system.model.Guest((int) (byte) -1, "guest", "Researcher", "Faculty", true);
        userRepository12.addUser((com.reservation_system.model.User) guest28);
        boolean boolean31 = userRepository12.emailExists("Password1!");
        com.reservation_system.repository.UserRepository userRepository33 = new com.reservation_system.repository.UserRepository("data/test-userrepo.csv");
        com.reservation_system.services.RegistrationService registrationService34 = new com.reservation_system.services.RegistrationService(userRepository33);
        com.reservation_system.model.Faculty faculty40 = new com.reservation_system.model.Faculty(0, "Password1!", "data/test-userrepo.csv", "researcher", false);
        java.lang.String str41 = faculty40.getName();
        userRepository33.addUser((com.reservation_system.model.User) faculty40);
        boolean boolean43 = userRepository33.headLabCoordinatorExists();
        com.reservation_system.services.RegistrationService registrationService44 = new com.reservation_system.services.RegistrationService(userRepository33);
        java.util.List<com.reservation_system.model.User> userList45 = userRepository33.getAllUsers();
        com.reservation_system.repository.UserRepository userRepository47 = new com.reservation_system.repository.UserRepository("data/test-userrepo.csv");
        com.reservation_system.services.RegistrationService registrationService48 = new com.reservation_system.services.RegistrationService(userRepository47);
        com.reservation_system.model.Faculty faculty54 = new com.reservation_system.model.Faculty(0, "Password1!", "data/test-userrepo.csv", "researcher", false);
        java.lang.String str55 = faculty54.getName();
        userRepository47.addUser((com.reservation_system.model.User) faculty54);
        boolean boolean57 = userRepository47.headLabCoordinatorExists();
        com.reservation_system.services.RegistrationService registrationService58 = new com.reservation_system.services.RegistrationService(userRepository47);
        java.util.List<com.reservation_system.model.User> userList59 = userRepository47.getAllUsers();
        userRepository33.saveAllUsers(userList59);
        userRepository12.saveAllUsers(userList59);
        java.util.List<com.reservation_system.model.User> userList62 = userRepository12.getAllUsers();
        userRepository1.saveAllUsers(userList62);
        com.reservation_system.model.Researcher researcher69 = new com.reservation_system.model.Researcher((int) (short) -1, "Andrew", "student", "Guest", false);
        java.lang.String str70 = researcher69.getName();
        userRepository1.addUser((com.reservation_system.model.User) researcher69);
        com.reservation_system.services.RegistrationService registrationService72 = new com.reservation_system.services.RegistrationService(userRepository1);
        // The following exception was thrown during execution in test generation
        try {
            com.reservation_system.model.User user77 = registrationService72.registerUser("guest", "data/test-userrepo.csv", "Guest", "Student");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid email format.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(userOptional9);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "Password1!" + "'", str20, "Password1!");
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "Password1!" + "'", str41, "Password1!");
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertNotNull(userList45);
        org.junit.Assert.assertEquals("'" + str55 + "' != '" + "Password1!" + "'", str55, "Password1!");
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
        org.junit.Assert.assertNotNull(userList59);
        org.junit.Assert.assertNotNull(userList62);
        org.junit.Assert.assertEquals("'" + str70 + "' != '" + "Andrew" + "'", str70, "Andrew");
    }

    @Test
    public void test0787() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0787");
        com.reservation_system.model.Guest guest5 = new com.reservation_system.model.Guest((int) (byte) 100, "andrew@example.com", "student", "Researcher", false);
        java.lang.String str6 = guest5.getUserType();
        boolean boolean7 = guest5.requiresDepartmentApproval();
        java.lang.String str8 = guest5.getUserType();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Guest" + "'", str6, "Guest");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Guest" + "'", str8, "Guest");
    }

    @Test
    public void test0788() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0788");
        com.reservation_system.model.Faculty faculty5 = new com.reservation_system.model.Faculty(101, "hi!", "hi!", "Student", false);
    }

    @Test
    public void test0789() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0789");
        com.reservation_system.model.Student student5 = new com.reservation_system.model.Student(100, "Faculty", "Student", "hi!", true);
        java.lang.String str6 = student5.getUserType();
        boolean boolean7 = student5.isApproved();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Student" + "'", str6, "Student");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test0790() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0790");
        // The following exception was thrown during execution in test generation
        try {
            com.reservation_system.model.User user6 = com.reservation_system.patterns.factory.UserFactory.createUser("data/test-userrepo.csv", 103, "hi!", "labmanager", "headlabcoordinator", true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid user type: data/test-userrepo.csv");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0791() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0791");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("data/test-userrepo.csv");
        com.reservation_system.services.RegistrationService registrationService2 = new com.reservation_system.services.RegistrationService(userRepository1);
        com.reservation_system.model.Faculty faculty8 = new com.reservation_system.model.Faculty(0, "Password1!", "data/test-userrepo.csv", "researcher", false);
        java.lang.String str9 = faculty8.getName();
        userRepository1.addUser((com.reservation_system.model.User) faculty8);
        boolean boolean11 = userRepository1.headLabCoordinatorExists();
        com.reservation_system.services.RegistrationService registrationService12 = new com.reservation_system.services.RegistrationService(userRepository1);
        com.reservation_system.services.RegistrationService registrationService13 = new com.reservation_system.services.RegistrationService(userRepository1);
        // The following exception was thrown during execution in test generation
        try {
            com.reservation_system.model.User user18 = registrationService13.registerUser("", "guest", "guest", "data/test-userrepo.csv");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid user type.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Password1!" + "'", str9, "Password1!");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test0792() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0792");
        com.reservation_system.model.User user6 = com.reservation_system.patterns.factory.UserFactory.createUser("guest", 10, "hi!", "Guest", "Guest", false);
        org.junit.Assert.assertNotNull(user6);
    }

    @Test
    public void test0793() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0793");
        com.reservation_system.model.User user6 = com.reservation_system.patterns.factory.UserFactory.createUser("headlabcoordinator", 10, "researcher", "headlabcoordinator", "researcher", true);
        boolean boolean7 = user6.isApproved();
        org.junit.Assert.assertNotNull(user6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test0794() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0794");
        com.reservation_system.model.Student student5 = new com.reservation_system.model.Student((int) (short) 1, "labmanager", "", "", true);
        java.lang.String str6 = student5.getUserType();
        java.lang.String str7 = student5.getEmail();
        java.lang.String str8 = student5.getEmail();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Student" + "'", str6, "Student");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test0795() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0795");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("data/test-userrepo.csv");
        java.util.List<com.reservation_system.model.User> userList2 = userRepository1.getAllUsers();
        com.reservation_system.services.RegistrationService registrationService3 = new com.reservation_system.services.RegistrationService(userRepository1);
        com.reservation_system.services.RegistrationService registrationService4 = new com.reservation_system.services.RegistrationService(userRepository1);
        java.util.Optional<com.reservation_system.model.User> userOptional6 = userRepository1.findByEmail("andrew@example.com");
        java.util.List<com.reservation_system.model.User> userList7 = userRepository1.getAllUsers();
        boolean boolean9 = userRepository1.emailExists("data/test-userrepo.csv");
        com.reservation_system.repository.UserRepository userRepository11 = new com.reservation_system.repository.UserRepository("data/test-userrepo.csv");
        java.util.List<com.reservation_system.model.User> userList12 = userRepository11.getAllUsers();
        userRepository1.saveAllUsers(userList12);
        boolean boolean14 = userRepository1.headLabCoordinatorExists();
        org.junit.Assert.assertNotNull(userList2);
        org.junit.Assert.assertNotNull(userOptional6);
        org.junit.Assert.assertNotNull(userList7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(userList12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test0796() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0796");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("data/test-userrepo.csv");
        boolean boolean2 = userRepository1.headLabCoordinatorExists();
        com.reservation_system.repository.UserRepository userRepository4 = new com.reservation_system.repository.UserRepository("data/test-userrepo.csv");
        com.reservation_system.services.RegistrationService registrationService5 = new com.reservation_system.services.RegistrationService(userRepository4);
        com.reservation_system.model.Faculty faculty11 = new com.reservation_system.model.Faculty(0, "Password1!", "data/test-userrepo.csv", "researcher", false);
        java.lang.String str12 = faculty11.getName();
        userRepository4.addUser((com.reservation_system.model.User) faculty11);
        boolean boolean14 = userRepository4.headLabCoordinatorExists();
        com.reservation_system.model.Guest guest20 = new com.reservation_system.model.Guest((int) (byte) -1, "guest", "Researcher", "Faculty", true);
        userRepository4.addUser((com.reservation_system.model.User) guest20);
        boolean boolean22 = userRepository4.headLabCoordinatorExists();
        com.reservation_system.repository.UserRepository userRepository24 = new com.reservation_system.repository.UserRepository("data/test-userrepo.csv");
        com.reservation_system.services.RegistrationService registrationService25 = new com.reservation_system.services.RegistrationService(userRepository24);
        com.reservation_system.model.Faculty faculty31 = new com.reservation_system.model.Faculty(0, "Password1!", "data/test-userrepo.csv", "researcher", false);
        java.lang.String str32 = faculty31.getName();
        userRepository24.addUser((com.reservation_system.model.User) faculty31);
        boolean boolean34 = userRepository24.headLabCoordinatorExists();
        com.reservation_system.repository.UserRepository userRepository36 = new com.reservation_system.repository.UserRepository("data/test-userrepo.csv");
        com.reservation_system.services.RegistrationService registrationService37 = new com.reservation_system.services.RegistrationService(userRepository36);
        com.reservation_system.model.Faculty faculty43 = new com.reservation_system.model.Faculty(0, "Password1!", "data/test-userrepo.csv", "researcher", false);
        java.lang.String str44 = faculty43.getName();
        userRepository36.addUser((com.reservation_system.model.User) faculty43);
        java.util.List<com.reservation_system.model.User> userList46 = userRepository36.getAllUsers();
        userRepository24.saveAllUsers(userList46);
        userRepository4.saveAllUsers(userList46);
        userRepository1.saveAllUsers(userList46);
        com.reservation_system.repository.UserRepository userRepository51 = new com.reservation_system.repository.UserRepository("data/test-userrepo.csv");
        com.reservation_system.services.RegistrationService registrationService52 = new com.reservation_system.services.RegistrationService(userRepository51);
        com.reservation_system.services.RegistrationService registrationService53 = new com.reservation_system.services.RegistrationService(userRepository51);
        com.reservation_system.services.RegistrationService registrationService54 = new com.reservation_system.services.RegistrationService(userRepository51);
        com.reservation_system.repository.UserRepository userRepository56 = new com.reservation_system.repository.UserRepository("data/test-userrepo.csv");
        com.reservation_system.services.RegistrationService registrationService57 = new com.reservation_system.services.RegistrationService(userRepository56);
        com.reservation_system.model.Faculty faculty63 = new com.reservation_system.model.Faculty(0, "Password1!", "data/test-userrepo.csv", "researcher", false);
        java.lang.String str64 = faculty63.getName();
        userRepository56.addUser((com.reservation_system.model.User) faculty63);
        boolean boolean66 = userRepository56.headLabCoordinatorExists();
        com.reservation_system.model.Guest guest72 = new com.reservation_system.model.Guest((int) (byte) -1, "guest", "Researcher", "Faculty", true);
        userRepository56.addUser((com.reservation_system.model.User) guest72);
        java.util.List<com.reservation_system.model.User> userList74 = userRepository56.getAllUsers();
        userRepository51.saveAllUsers(userList74);
        com.reservation_system.repository.UserRepository userRepository77 = new com.reservation_system.repository.UserRepository("data/test-userrepo.csv");
        com.reservation_system.services.RegistrationService registrationService78 = new com.reservation_system.services.RegistrationService(userRepository77);
        com.reservation_system.model.Faculty faculty84 = new com.reservation_system.model.Faculty(0, "Password1!", "data/test-userrepo.csv", "researcher", false);
        java.lang.String str85 = faculty84.getName();
        userRepository77.addUser((com.reservation_system.model.User) faculty84);
        boolean boolean87 = userRepository77.headLabCoordinatorExists();
        com.reservation_system.model.Guest guest93 = new com.reservation_system.model.Guest((int) (byte) -1, "guest", "Researcher", "Faculty", true);
        userRepository77.addUser((com.reservation_system.model.User) guest93);
        java.util.List<com.reservation_system.model.User> userList95 = userRepository77.getAllUsers();
        userRepository51.saveAllUsers(userList95);
        userRepository1.saveAllUsers(userList95);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Password1!" + "'", str12, "Password1!");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "Password1!" + "'", str32, "Password1!");
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "Password1!" + "'", str44, "Password1!");
        org.junit.Assert.assertNotNull(userList46);
        org.junit.Assert.assertEquals("'" + str64 + "' != '" + "Password1!" + "'", str64, "Password1!");
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + false + "'", boolean66 == false);
        org.junit.Assert.assertNotNull(userList74);
        org.junit.Assert.assertEquals("'" + str85 + "' != '" + "Password1!" + "'", str85, "Password1!");
        org.junit.Assert.assertTrue("'" + boolean87 + "' != '" + false + "'", boolean87 == false);
        org.junit.Assert.assertNotNull(userList95);
    }

    @Test
    public void test0797() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0797");
        com.reservation_system.model.LabManager labManager5 = new com.reservation_system.model.LabManager((int) 'a', "headlabcoordinator", "Researcher", "Andrew", false);
        java.lang.String str6 = labManager5.getEmail();
        java.lang.String str7 = labManager5.getName();
        boolean boolean8 = labManager5.requiresDepartmentApproval();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Researcher" + "'", str6, "Researcher");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "headlabcoordinator" + "'", str7, "headlabcoordinator");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test0798() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0798");
        com.reservation_system.model.Faculty faculty5 = new com.reservation_system.model.Faculty(103, "data/test-userrepo.csv", "Password1!", "andrew@example.com", true);
    }

    @Test
    public void test0799() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0799");
        com.reservation_system.model.Guest guest5 = new com.reservation_system.model.Guest((int) 'a', "headlabcoordinator", "guest", "student", true);
    }

    @Test
    public void test0800() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0800");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("data/test-userrepo.csv");
        boolean boolean2 = userRepository1.headLabCoordinatorExists();
        java.util.Optional<com.reservation_system.model.User> userOptional4 = userRepository1.findByEmail("student");
        boolean boolean5 = userRepository1.headLabCoordinatorExists();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(userOptional4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test0801() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0801");
        com.reservation_system.model.LabManager labManager5 = new com.reservation_system.model.LabManager(0, "", "student", "faculty", true);
        java.lang.String str6 = labManager5.getUserType();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "labmanager" + "'", str6, "labmanager");
    }

    @Test
    public void test0802() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0802");
        com.reservation_system.model.Faculty faculty5 = new com.reservation_system.model.Faculty(100, "guest", "faculty", "Guest", true);
        java.lang.String str6 = faculty5.getUserType();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Faculty" + "'", str6, "Faculty");
    }

    @Test
    public void test0803() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0803");
        com.reservation_system.model.HeadLabCoordinator headLabCoordinator5 = new com.reservation_system.model.HeadLabCoordinator((-1), "Faculty", "Researcher", "faculty", true);
    }

    @Test
    public void test0804() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0804");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("data/test-userrepo.csv");
        boolean boolean2 = userRepository1.headLabCoordinatorExists();
        com.reservation_system.services.RegistrationService registrationService3 = new com.reservation_system.services.RegistrationService(userRepository1);
        boolean boolean4 = userRepository1.headLabCoordinatorExists();
        boolean boolean6 = userRepository1.emailExists("Andrew");
        com.reservation_system.services.RegistrationService registrationService7 = new com.reservation_system.services.RegistrationService(userRepository1);
        // The following exception was thrown during execution in test generation
        try {
            com.reservation_system.model.User user12 = registrationService7.registerUser("", "researcher", "Researcher", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid user type.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test0805() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0805");
        com.reservation_system.model.Researcher researcher5 = new com.reservation_system.model.Researcher((int) (short) -1, "Andrew", "headlabcoordinator", "Guest", false);
        boolean boolean6 = researcher5.requiresDepartmentApproval();
        boolean boolean7 = researcher5.isApproved();
        java.lang.String str8 = researcher5.getUserType();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Researcher" + "'", str8, "Researcher");
    }

    @Test
    public void test0806() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0806");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("data/test-userrepo.csv");
        com.reservation_system.services.RegistrationService registrationService2 = new com.reservation_system.services.RegistrationService(userRepository1);
        com.reservation_system.model.Faculty faculty8 = new com.reservation_system.model.Faculty(0, "Password1!", "data/test-userrepo.csv", "researcher", false);
        java.lang.String str9 = faculty8.getName();
        userRepository1.addUser((com.reservation_system.model.User) faculty8);
        boolean boolean11 = userRepository1.headLabCoordinatorExists();
        boolean boolean13 = userRepository1.emailExists("guest");
        com.reservation_system.model.Faculty faculty19 = new com.reservation_system.model.Faculty(0, "Password1!", "data/test-userrepo.csv", "researcher", false);
        boolean boolean20 = faculty19.requiresDepartmentApproval();
        userRepository1.addUser((com.reservation_system.model.User) faculty19);
        com.reservation_system.repository.UserRepository userRepository23 = new com.reservation_system.repository.UserRepository("data/test-userrepo.csv");
        boolean boolean24 = userRepository23.headLabCoordinatorExists();
        com.reservation_system.services.RegistrationService registrationService25 = new com.reservation_system.services.RegistrationService(userRepository23);
        boolean boolean26 = userRepository23.headLabCoordinatorExists();
        boolean boolean27 = userRepository23.headLabCoordinatorExists();
        com.reservation_system.repository.UserRepository userRepository29 = new com.reservation_system.repository.UserRepository("data/test-userrepo.csv");
        com.reservation_system.services.RegistrationService registrationService30 = new com.reservation_system.services.RegistrationService(userRepository29);
        com.reservation_system.model.Faculty faculty36 = new com.reservation_system.model.Faculty(0, "Password1!", "data/test-userrepo.csv", "researcher", false);
        java.lang.String str37 = faculty36.getName();
        userRepository29.addUser((com.reservation_system.model.User) faculty36);
        boolean boolean39 = userRepository29.headLabCoordinatorExists();
        int int40 = userRepository29.getNextID();
        com.reservation_system.repository.UserRepository userRepository42 = new com.reservation_system.repository.UserRepository("data/test-userrepo.csv");
        java.util.List<com.reservation_system.model.User> userList43 = userRepository42.getAllUsers();
        com.reservation_system.services.RegistrationService registrationService44 = new com.reservation_system.services.RegistrationService(userRepository42);
        java.util.List<com.reservation_system.model.User> userList45 = userRepository42.getAllUsers();
        userRepository29.saveAllUsers(userList45);
        userRepository23.saveAllUsers(userList45);
        userRepository1.saveAllUsers(userList45);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Password1!" + "'", str9, "Password1!");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "Password1!" + "'", str37, "Password1!");
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 98 + "'", int40 == 98);
        org.junit.Assert.assertNotNull(userList43);
        org.junit.Assert.assertNotNull(userList45);
    }

    @Test
    public void test0807() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0807");
        com.reservation_system.model.Researcher researcher5 = new com.reservation_system.model.Researcher((int) (byte) 100, "Password1!", "Password1!", "headlabcoordinator", true);
        boolean boolean6 = researcher5.requiresDepartmentApproval();
        java.lang.String str7 = researcher5.getUserType();
        boolean boolean8 = researcher5.isApproved();
        java.lang.String str9 = researcher5.getPassword();
        java.lang.String str10 = researcher5.getUserType();
        java.lang.Class<?> wildcardClass11 = researcher5.getClass();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Researcher" + "'", str7, "Researcher");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "headlabcoordinator" + "'", str9, "headlabcoordinator");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Researcher" + "'", str10, "Researcher");
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0808() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0808");
        com.reservation_system.model.Researcher researcher5 = new com.reservation_system.model.Researcher(102, "Andrew", "guest", "Researcher", true);
        java.lang.String str6 = researcher5.getName();
        researcher5.setApproved(false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Andrew" + "'", str6, "Andrew");
    }

    @Test
    public void test0809() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0809");
        com.reservation_system.model.Researcher researcher5 = new com.reservation_system.model.Researcher((int) (short) -1, "faculty", "researcher", "hi!", true);
        researcher5.setApproved(false);
        boolean boolean8 = researcher5.isApproved();
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test0810() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0810");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("data/test-userrepo.csv");
        java.util.List<com.reservation_system.model.User> userList2 = userRepository1.getAllUsers();
        com.reservation_system.services.RegistrationService registrationService3 = new com.reservation_system.services.RegistrationService(userRepository1);
        java.util.List<com.reservation_system.model.User> userList4 = userRepository1.getAllUsers();
        boolean boolean6 = userRepository1.emailExists("Guest");
        java.util.List<com.reservation_system.model.User> userList7 = userRepository1.getAllUsers();
        boolean boolean9 = userRepository1.emailExists("guest");
        org.junit.Assert.assertNotNull(userList2);
        org.junit.Assert.assertNotNull(userList4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(userList7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test0811() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0811");
        com.reservation_system.model.Student student5 = new com.reservation_system.model.Student((int) (short) -1, "labmanager", "", "Faculty", true);
        java.lang.String str6 = student5.getUserType();
        int int7 = student5.getID();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Student" + "'", str6, "Student");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
    }

    @Test
    public void test0812() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0812");
        com.reservation_system.model.Researcher researcher5 = new com.reservation_system.model.Researcher((int) (byte) 1, "Andrew", "guest", "Password1!", false);
        boolean boolean6 = researcher5.isApproved();
        java.lang.String str7 = researcher5.getUserType();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Researcher" + "'", str7, "Researcher");
    }

    @Test
    public void test0813() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0813");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("data/test-userrepo.csv");
        int int2 = userRepository1.getNextID();
        int int3 = userRepository1.getNextID();
        boolean boolean5 = userRepository1.emailExists("faculty");
        com.reservation_system.model.LabManager labManager11 = new com.reservation_system.model.LabManager((int) (short) 0, "", "labmanager", "Password1!", true);
        userRepository1.addUser((com.reservation_system.model.User) labManager11);
        java.util.Optional<com.reservation_system.model.User> userOptional14 = userRepository1.findByEmail("");
        com.reservation_system.model.Researcher researcher20 = new com.reservation_system.model.Researcher((int) (byte) 100, "Password1!", "Password1!", "headlabcoordinator", true);
        userRepository1.addUser((com.reservation_system.model.User) researcher20);
        java.util.List<com.reservation_system.model.User> userList22 = userRepository1.getAllUsers();
        com.reservation_system.model.Researcher researcher28 = new com.reservation_system.model.Researcher((int) (short) -1, "headlabcoordinator", "Guest", "student", false);
        userRepository1.addUser((com.reservation_system.model.User) researcher28);
        com.reservation_system.repository.UserRepository userRepository31 = new com.reservation_system.repository.UserRepository("data/test-userrepo.csv");
        com.reservation_system.services.RegistrationService registrationService32 = new com.reservation_system.services.RegistrationService(userRepository31);
        com.reservation_system.model.Faculty faculty38 = new com.reservation_system.model.Faculty(0, "Password1!", "data/test-userrepo.csv", "researcher", false);
        java.lang.String str39 = faculty38.getName();
        userRepository31.addUser((com.reservation_system.model.User) faculty38);
        boolean boolean41 = userRepository31.headLabCoordinatorExists();
        com.reservation_system.services.RegistrationService registrationService42 = new com.reservation_system.services.RegistrationService(userRepository31);
        java.util.List<com.reservation_system.model.User> userList43 = userRepository31.getAllUsers();
        userRepository1.saveAllUsers(userList43);
        boolean boolean46 = userRepository1.emailExists("labmanager");
// flaky "14) test0813(com.reservation_system.randoop.registrationservice.RegressionTest1)":         org.junit.Assert.assertTrue("'" + int2 + "' != '" + 101 + "'", int2 == 101);
// flaky "9) test0813(com.reservation_system.randoop.registrationservice.RegressionTest1)":         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 101 + "'", int3 == 101);
// flaky "7) test0813(com.reservation_system.randoop.registrationservice.RegressionTest1)":         org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(userOptional14);
        org.junit.Assert.assertNotNull(userList22);
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "Password1!" + "'", str39, "Password1!");
// flaky "3) test0813(com.reservation_system.randoop.registrationservice.RegressionTest1)":         org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + true + "'", boolean41 == true);
        org.junit.Assert.assertNotNull(userList43);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + true + "'", boolean46 == true);
    }

    @Test
    public void test0814() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0814");
        com.reservation_system.model.LabManager labManager5 = new com.reservation_system.model.LabManager(1, "student", "Password1!", "andrew@example.com", false);
    }

    @Test
    public void test0815() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0815");
        com.reservation_system.model.Faculty faculty5 = new com.reservation_system.model.Faculty(97, "data/test-userrepo.csv", "researcher", "andrew@example.com", true);
    }

    @Test
    public void test0816() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0816");
        com.reservation_system.model.Student student5 = new com.reservation_system.model.Student((int) (byte) 10, "Researcher", "data/test-userrepo.csv", "faculty", true);
    }

    @Test
    public void test0817() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0817");
        com.reservation_system.model.Guest guest5 = new com.reservation_system.model.Guest(102, "labmanager", "headlabcoordinator", "guest", false);
    }

    @Test
    public void test0818() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0818");
        com.reservation_system.model.Researcher researcher5 = new com.reservation_system.model.Researcher((int) (byte) 10, "Guest", "guest", "", false);
    }

    @Test
    public void test0819() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0819");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("data/test-userrepo.csv");
        java.util.List<com.reservation_system.model.User> userList2 = userRepository1.getAllUsers();
        com.reservation_system.services.RegistrationService registrationService3 = new com.reservation_system.services.RegistrationService(userRepository1);
        java.util.List<com.reservation_system.model.User> userList4 = userRepository1.getAllUsers();
        boolean boolean6 = userRepository1.emailExists("Guest");
        java.util.List<com.reservation_system.model.User> userList7 = userRepository1.getAllUsers();
        java.util.Optional<com.reservation_system.model.User> userOptional9 = userRepository1.findByEmail("Password1!");
        com.reservation_system.services.RegistrationService registrationService10 = new com.reservation_system.services.RegistrationService(userRepository1);
        // The following exception was thrown during execution in test generation
        try {
            com.reservation_system.model.User user15 = registrationService10.registerUser("", "Faculty", "student", "labmanager");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid user type.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(userList2);
        org.junit.Assert.assertNotNull(userList4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(userList7);
        org.junit.Assert.assertNotNull(userOptional9);
    }

    @Test
    public void test0820() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0820");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("data/test-userrepo.csv");
        com.reservation_system.services.RegistrationService registrationService2 = new com.reservation_system.services.RegistrationService(userRepository1);
        com.reservation_system.model.Faculty faculty8 = new com.reservation_system.model.Faculty(0, "Password1!", "data/test-userrepo.csv", "researcher", false);
        java.lang.String str9 = faculty8.getName();
        userRepository1.addUser((com.reservation_system.model.User) faculty8);
        boolean boolean12 = userRepository1.emailExists("Faculty");
        int int13 = userRepository1.getNextID();
        com.reservation_system.model.Researcher researcher19 = new com.reservation_system.model.Researcher((int) (short) 10, "hi!", "Andrew", "Guest", false);
        java.lang.String str20 = researcher19.getUserType();
        userRepository1.addUser((com.reservation_system.model.User) researcher19);
        com.reservation_system.services.RegistrationService registrationService22 = new com.reservation_system.services.RegistrationService(userRepository1);
        // The following exception was thrown during execution in test generation
        try {
            com.reservation_system.model.User user27 = registrationService22.registerUser("", "Andrew", "guest", "Researcher");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid user type.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Password1!" + "'", str9, "Password1!");
// flaky "15) test0820(com.reservation_system.randoop.registrationservice.RegressionTest1)":         org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 101 + "'", int13 == 101);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "Researcher" + "'", str20, "Researcher");
    }

    @Test
    public void test0821() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0821");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("data/test-userrepo.csv");
        com.reservation_system.services.RegistrationService registrationService2 = new com.reservation_system.services.RegistrationService(userRepository1);
        com.reservation_system.model.Faculty faculty8 = new com.reservation_system.model.Faculty(0, "Password1!", "data/test-userrepo.csv", "researcher", false);
        java.lang.String str9 = faculty8.getName();
        userRepository1.addUser((com.reservation_system.model.User) faculty8);
        boolean boolean12 = userRepository1.emailExists("Faculty");
        int int13 = userRepository1.getNextID();
        com.reservation_system.services.RegistrationService registrationService14 = new com.reservation_system.services.RegistrationService(userRepository1);
        com.reservation_system.services.RegistrationService registrationService15 = new com.reservation_system.services.RegistrationService(userRepository1);
        // The following exception was thrown during execution in test generation
        try {
            com.reservation_system.model.User user20 = registrationService15.registerUser("hi!", "researcher", "faculty", "labmanager");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid user type.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Password1!" + "'", str9, "Password1!");
// flaky "16) test0821(com.reservation_system.randoop.registrationservice.RegressionTest1)":         org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 101 + "'", int13 == 101);
    }

    @Test
    public void test0822() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0822");
        com.reservation_system.model.Student student5 = new com.reservation_system.model.Student((int) 'a', "data/test-userrepo.csv", "hi!", "Researcher", true);
    }

    @Test
    public void test0823() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0823");
        com.reservation_system.model.Guest guest5 = new com.reservation_system.model.Guest((int) '#', "Andrew", "student", "Faculty", false);
        java.lang.String str6 = guest5.getUserType();
        java.lang.String str7 = guest5.getName();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Guest" + "'", str6, "Guest");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Andrew" + "'", str7, "Andrew");
    }

    @Test
    public void test0824() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0824");
        com.reservation_system.model.Researcher researcher5 = new com.reservation_system.model.Researcher(52, "Password1!", "", "Guest", true);
    }

    @Test
    public void test0825() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0825");
        com.reservation_system.model.LabManager labManager5 = new com.reservation_system.model.LabManager(97, "headlabcoordinator", "guest", "researcher", true);
        java.lang.String str6 = labManager5.getUserType();
        java.lang.String str7 = labManager5.getUserType();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "labmanager" + "'", str6, "labmanager");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "labmanager" + "'", str7, "labmanager");
    }

    @Test
    public void test0826() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0826");
        com.reservation_system.model.Researcher researcher5 = new com.reservation_system.model.Researcher((int) (short) -1, "andrew@example.com", "guest", "labmanager", false);
        java.lang.String str6 = researcher5.getPassword();
        boolean boolean7 = researcher5.requiresDepartmentApproval();
        boolean boolean8 = researcher5.requiresDepartmentApproval();
        java.lang.String str9 = researcher5.getName();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "labmanager" + "'", str6, "labmanager");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test0827() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0827");
        // The following exception was thrown during execution in test generation
        try {
            com.reservation_system.model.User user6 = com.reservation_system.patterns.factory.UserFactory.createUser("", (int) (byte) 0, "guest", "headlabcoordinator", "Guest", true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid user type: ");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0828() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0828");
        com.reservation_system.model.Researcher researcher5 = new com.reservation_system.model.Researcher((int) (byte) 1, "Faculty", "Student", "Student", false);
    }

    @Test
    public void test0829() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0829");
        com.reservation_system.model.Faculty faculty5 = new com.reservation_system.model.Faculty(10, "researcher", "faculty", "", false);
        java.lang.String str6 = faculty5.getUserType();
        java.lang.String str7 = faculty5.getPassword();
        int int8 = faculty5.getID();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Faculty" + "'", str6, "Faculty");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 10 + "'", int8 == 10);
    }

    @Test
    public void test0830() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0830");
        com.reservation_system.model.Student student5 = new com.reservation_system.model.Student((int) (short) 10, "guest", "student", "", false);
        boolean boolean6 = student5.isApproved();
        java.lang.String str7 = student5.getUserType();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Student" + "'", str7, "Student");
    }

    @Test
    public void test0831() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0831");
        // The following exception was thrown during execution in test generation
        try {
            com.reservation_system.model.User user6 = com.reservation_system.patterns.factory.UserFactory.createUser("data/test-userrepo.csv", 101, "faculty", "data/test-userrepo.csv", "headlabcoordinator", true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid user type: data/test-userrepo.csv");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0832() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0832");
        com.reservation_system.model.Researcher researcher5 = new com.reservation_system.model.Researcher((int) (short) -1, "andrew@example.com", "guest", "labmanager", false);
        java.lang.String str6 = researcher5.getUserType();
        boolean boolean7 = researcher5.isApproved();
        boolean boolean8 = researcher5.isApproved();
        java.lang.String str9 = researcher5.getPassword();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Researcher" + "'", str6, "Researcher");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "labmanager" + "'", str9, "labmanager");
    }

    @Test
    public void test0833() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0833");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("data/test-userrepo.csv");
        com.reservation_system.services.RegistrationService registrationService2 = new com.reservation_system.services.RegistrationService(userRepository1);
        com.reservation_system.model.Faculty faculty8 = new com.reservation_system.model.Faculty(0, "Password1!", "data/test-userrepo.csv", "researcher", false);
        java.lang.String str9 = faculty8.getName();
        userRepository1.addUser((com.reservation_system.model.User) faculty8);
        boolean boolean11 = userRepository1.headLabCoordinatorExists();
        com.reservation_system.services.RegistrationService registrationService12 = new com.reservation_system.services.RegistrationService(userRepository1);
        com.reservation_system.model.Researcher researcher18 = new com.reservation_system.model.Researcher((int) '4', "labmanager", "Andrew", "researcher", true);
        userRepository1.addUser((com.reservation_system.model.User) researcher18);
        java.lang.String str20 = researcher18.getUserType();
        java.lang.String str21 = researcher18.getName();
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Password1!" + "'", str9, "Password1!");
// flaky "17) test0833(com.reservation_system.randoop.registrationservice.RegressionTest1)":         org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "Researcher" + "'", str20, "Researcher");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "labmanager" + "'", str21, "labmanager");
    }

    @Test
    public void test0834() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0834");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("data/test-userrepo.csv");
        com.reservation_system.services.RegistrationService registrationService2 = new com.reservation_system.services.RegistrationService(userRepository1);
        com.reservation_system.model.Faculty faculty8 = new com.reservation_system.model.Faculty(0, "Password1!", "data/test-userrepo.csv", "researcher", false);
        java.lang.String str9 = faculty8.getName();
        userRepository1.addUser((com.reservation_system.model.User) faculty8);
        boolean boolean11 = userRepository1.headLabCoordinatorExists();
        com.reservation_system.services.RegistrationService registrationService12 = new com.reservation_system.services.RegistrationService(userRepository1);
        java.util.List<com.reservation_system.model.User> userList13 = userRepository1.getAllUsers();
        com.reservation_system.model.Researcher researcher19 = new com.reservation_system.model.Researcher(0, "faculty", "hi!", "Faculty", false);
        int int20 = researcher19.getID();
        userRepository1.addUser((com.reservation_system.model.User) researcher19);
        com.reservation_system.model.Faculty faculty27 = new com.reservation_system.model.Faculty(10, "hi!", "Faculty", "Faculty", true);
        userRepository1.addUser((com.reservation_system.model.User) faculty27);
        java.lang.String str29 = faculty27.getUserType();
        int int30 = faculty27.getID();
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Password1!" + "'", str9, "Password1!");
// flaky "18) test0834(com.reservation_system.randoop.registrationservice.RegressionTest1)":         org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(userList13);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "Faculty" + "'", str29, "Faculty");
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 10 + "'", int30 == 10);
    }

    @Test
    public void test0835() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0835");
        com.reservation_system.model.LabManager labManager5 = new com.reservation_system.model.LabManager((int) ' ', "", "", "", false);
    }

    @Test
    public void test0836() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0836");
        com.reservation_system.model.Guest guest5 = new com.reservation_system.model.Guest((int) (short) 0, "Faculty", "Andrew", "andrew@example.com", true);
        java.lang.String str6 = guest5.getUserType();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Guest" + "'", str6, "Guest");
    }

    @Test
    public void test0837() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0837");
        // The following exception was thrown during execution in test generation
        try {
            com.reservation_system.model.User user6 = com.reservation_system.patterns.factory.UserFactory.createUser("data/test-userrepo.csv", (int) '#', "Researcher", "student", "", false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid user type: data/test-userrepo.csv");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0838() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0838");
        com.reservation_system.model.Faculty faculty5 = new com.reservation_system.model.Faculty(0, "headlabcoordinator", "data/test-userrepo.csv", "hi!", true);
    }

    @Test
    public void test0839() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0839");
        com.reservation_system.model.Faculty faculty5 = new com.reservation_system.model.Faculty(10, "", "guest", "guest", false);
    }

    @Test
    public void test0840() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0840");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("data/test-userrepo.csv");
        com.reservation_system.services.RegistrationService registrationService2 = new com.reservation_system.services.RegistrationService(userRepository1);
        com.reservation_system.model.Faculty faculty8 = new com.reservation_system.model.Faculty(0, "Password1!", "data/test-userrepo.csv", "researcher", false);
        java.lang.String str9 = faculty8.getName();
        userRepository1.addUser((com.reservation_system.model.User) faculty8);
        boolean boolean11 = userRepository1.headLabCoordinatorExists();
        com.reservation_system.model.Guest guest17 = new com.reservation_system.model.Guest((int) (byte) -1, "guest", "Researcher", "Faculty", true);
        userRepository1.addUser((com.reservation_system.model.User) guest17);
        boolean boolean20 = userRepository1.emailExists("Password1!");
        boolean boolean22 = userRepository1.emailExists("hi!");
        int int23 = userRepository1.getNextID();
        com.reservation_system.repository.UserRepository userRepository25 = new com.reservation_system.repository.UserRepository("data/test-userrepo.csv");
        com.reservation_system.services.RegistrationService registrationService26 = new com.reservation_system.services.RegistrationService(userRepository25);
        com.reservation_system.model.Faculty faculty32 = new com.reservation_system.model.Faculty(0, "Password1!", "data/test-userrepo.csv", "researcher", false);
        java.lang.String str33 = faculty32.getName();
        userRepository25.addUser((com.reservation_system.model.User) faculty32);
        boolean boolean35 = userRepository25.headLabCoordinatorExists();
        com.reservation_system.model.Guest guest41 = new com.reservation_system.model.Guest((int) (byte) -1, "guest", "Researcher", "Faculty", true);
        userRepository25.addUser((com.reservation_system.model.User) guest41);
        boolean boolean43 = userRepository25.headLabCoordinatorExists();
        com.reservation_system.repository.UserRepository userRepository45 = new com.reservation_system.repository.UserRepository("data/test-userrepo.csv");
        com.reservation_system.services.RegistrationService registrationService46 = new com.reservation_system.services.RegistrationService(userRepository45);
        com.reservation_system.model.Faculty faculty52 = new com.reservation_system.model.Faculty(0, "Password1!", "data/test-userrepo.csv", "researcher", false);
        java.lang.String str53 = faculty52.getName();
        userRepository45.addUser((com.reservation_system.model.User) faculty52);
        boolean boolean55 = userRepository45.headLabCoordinatorExists();
        com.reservation_system.repository.UserRepository userRepository57 = new com.reservation_system.repository.UserRepository("data/test-userrepo.csv");
        com.reservation_system.services.RegistrationService registrationService58 = new com.reservation_system.services.RegistrationService(userRepository57);
        com.reservation_system.model.Faculty faculty64 = new com.reservation_system.model.Faculty(0, "Password1!", "data/test-userrepo.csv", "researcher", false);
        java.lang.String str65 = faculty64.getName();
        userRepository57.addUser((com.reservation_system.model.User) faculty64);
        java.util.List<com.reservation_system.model.User> userList67 = userRepository57.getAllUsers();
        userRepository45.saveAllUsers(userList67);
        userRepository25.saveAllUsers(userList67);
        boolean boolean71 = userRepository25.emailExists("hi!");
        com.reservation_system.repository.UserRepository userRepository73 = new com.reservation_system.repository.UserRepository("data/test-userrepo.csv");
        com.reservation_system.services.RegistrationService registrationService74 = new com.reservation_system.services.RegistrationService(userRepository73);
        com.reservation_system.model.Faculty faculty80 = new com.reservation_system.model.Faculty(0, "Password1!", "data/test-userrepo.csv", "researcher", false);
        java.lang.String str81 = faculty80.getName();
        userRepository73.addUser((com.reservation_system.model.User) faculty80);
        boolean boolean83 = userRepository73.headLabCoordinatorExists();
        com.reservation_system.services.RegistrationService registrationService84 = new com.reservation_system.services.RegistrationService(userRepository73);
        java.util.List<com.reservation_system.model.User> userList85 = userRepository73.getAllUsers();
        userRepository25.saveAllUsers(userList85);
        userRepository1.saveAllUsers(userList85);
        com.reservation_system.services.RegistrationService registrationService88 = new com.reservation_system.services.RegistrationService(userRepository1);
        int int89 = userRepository1.getNextID();
        java.util.Optional<com.reservation_system.model.User> userOptional91 = userRepository1.findByEmail("Faculty");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Password1!" + "'", str9, "Password1!");
// flaky "19) test0840(com.reservation_system.randoop.registrationservice.RegressionTest1)":         org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 101 + "'", int23 == 101);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "Password1!" + "'", str33, "Password1!");
// flaky "10) test0840(com.reservation_system.randoop.registrationservice.RegressionTest1)":         org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
// flaky "8) test0840(com.reservation_system.randoop.registrationservice.RegressionTest1)":         org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + true + "'", boolean43 == true);
        org.junit.Assert.assertEquals("'" + str53 + "' != '" + "Password1!" + "'", str53, "Password1!");
// flaky "4) test0840(com.reservation_system.randoop.registrationservice.RegressionTest1)":         org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + true + "'", boolean55 == true);
        org.junit.Assert.assertEquals("'" + str65 + "' != '" + "Password1!" + "'", str65, "Password1!");
        org.junit.Assert.assertNotNull(userList67);
        org.junit.Assert.assertTrue("'" + boolean71 + "' != '" + true + "'", boolean71 == true);
        org.junit.Assert.assertEquals("'" + str81 + "' != '" + "Password1!" + "'", str81, "Password1!");
// flaky "2) test0840(com.reservation_system.randoop.registrationservice.RegressionTest1)":         org.junit.Assert.assertTrue("'" + boolean83 + "' != '" + true + "'", boolean83 == true);
        org.junit.Assert.assertNotNull(userList85);
        org.junit.Assert.assertTrue("'" + int89 + "' != '" + 101 + "'", int89 == 101);
        org.junit.Assert.assertNotNull(userOptional91);
    }

    @Test
    public void test0841() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0841");
        com.reservation_system.model.HeadLabCoordinator headLabCoordinator5 = new com.reservation_system.model.HeadLabCoordinator(0, "Password1!", "Faculty", "Faculty", false);
        headLabCoordinator5.setApproved(true);
        java.lang.String str8 = headLabCoordinator5.getPassword();
        java.lang.String str9 = headLabCoordinator5.getName();
        java.lang.String str10 = headLabCoordinator5.getUserType();
        java.lang.String str11 = headLabCoordinator5.getUserType();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Faculty" + "'", str8, "Faculty");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Password1!" + "'", str9, "Password1!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "headlabcoordinator" + "'", str10, "headlabcoordinator");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "headlabcoordinator" + "'", str11, "headlabcoordinator");
    }

    @Test
    public void test0842() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0842");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("data/test-userrepo.csv");
        boolean boolean2 = userRepository1.headLabCoordinatorExists();
        com.reservation_system.services.RegistrationService registrationService3 = new com.reservation_system.services.RegistrationService(userRepository1);
        boolean boolean4 = userRepository1.headLabCoordinatorExists();
        boolean boolean6 = userRepository1.emailExists("Andrew");
        com.reservation_system.services.RegistrationService registrationService7 = new com.reservation_system.services.RegistrationService(userRepository1);
        java.util.Optional<com.reservation_system.model.User> userOptional9 = userRepository1.findByEmail("faculty");
        com.reservation_system.services.RegistrationService registrationService10 = new com.reservation_system.services.RegistrationService(userRepository1);
        com.reservation_system.repository.UserRepository userRepository12 = new com.reservation_system.repository.UserRepository("data/test-userrepo.csv");
        com.reservation_system.services.RegistrationService registrationService13 = new com.reservation_system.services.RegistrationService(userRepository12);
        com.reservation_system.model.Faculty faculty19 = new com.reservation_system.model.Faculty(0, "Password1!", "data/test-userrepo.csv", "researcher", false);
        java.lang.String str20 = faculty19.getName();
        userRepository12.addUser((com.reservation_system.model.User) faculty19);
        boolean boolean22 = userRepository12.headLabCoordinatorExists();
        com.reservation_system.model.Guest guest28 = new com.reservation_system.model.Guest((int) (byte) -1, "guest", "Researcher", "Faculty", true);
        userRepository12.addUser((com.reservation_system.model.User) guest28);
        boolean boolean31 = userRepository12.emailExists("Password1!");
        com.reservation_system.repository.UserRepository userRepository33 = new com.reservation_system.repository.UserRepository("data/test-userrepo.csv");
        com.reservation_system.services.RegistrationService registrationService34 = new com.reservation_system.services.RegistrationService(userRepository33);
        com.reservation_system.model.Faculty faculty40 = new com.reservation_system.model.Faculty(0, "Password1!", "data/test-userrepo.csv", "researcher", false);
        java.lang.String str41 = faculty40.getName();
        userRepository33.addUser((com.reservation_system.model.User) faculty40);
        boolean boolean43 = userRepository33.headLabCoordinatorExists();
        com.reservation_system.services.RegistrationService registrationService44 = new com.reservation_system.services.RegistrationService(userRepository33);
        java.util.List<com.reservation_system.model.User> userList45 = userRepository33.getAllUsers();
        com.reservation_system.repository.UserRepository userRepository47 = new com.reservation_system.repository.UserRepository("data/test-userrepo.csv");
        com.reservation_system.services.RegistrationService registrationService48 = new com.reservation_system.services.RegistrationService(userRepository47);
        com.reservation_system.model.Faculty faculty54 = new com.reservation_system.model.Faculty(0, "Password1!", "data/test-userrepo.csv", "researcher", false);
        java.lang.String str55 = faculty54.getName();
        userRepository47.addUser((com.reservation_system.model.User) faculty54);
        boolean boolean57 = userRepository47.headLabCoordinatorExists();
        com.reservation_system.services.RegistrationService registrationService58 = new com.reservation_system.services.RegistrationService(userRepository47);
        java.util.List<com.reservation_system.model.User> userList59 = userRepository47.getAllUsers();
        userRepository33.saveAllUsers(userList59);
        userRepository12.saveAllUsers(userList59);
        java.util.List<com.reservation_system.model.User> userList62 = userRepository12.getAllUsers();
        userRepository1.saveAllUsers(userList62);
        com.reservation_system.model.LabManager labManager69 = new com.reservation_system.model.LabManager((int) 'a', "headlabcoordinator", "Researcher", "Andrew", false);
        java.lang.String str70 = labManager69.getEmail();
        labManager69.setApproved(false);
        userRepository1.addUser((com.reservation_system.model.User) labManager69);
        boolean boolean74 = userRepository1.headLabCoordinatorExists();
        com.reservation_system.services.RegistrationService registrationService75 = new com.reservation_system.services.RegistrationService(userRepository1);
        // The following exception was thrown during execution in test generation
        try {
            com.reservation_system.model.User user80 = registrationService75.registerUser("labmanager", "Student", "data/test-userrepo.csv", "Andrew");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Lab manager accounts must be generated by the head lab coordinator.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
// flaky "20) test0842(com.reservation_system.randoop.registrationservice.RegressionTest1)":         org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
// flaky "11) test0842(com.reservation_system.randoop.registrationservice.RegressionTest1)":         org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(userOptional9);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "Password1!" + "'", str20, "Password1!");
// flaky "9) test0842(com.reservation_system.randoop.registrationservice.RegressionTest1)":         org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "Password1!" + "'", str41, "Password1!");
// flaky "5) test0842(com.reservation_system.randoop.registrationservice.RegressionTest1)":         org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + true + "'", boolean43 == true);
        org.junit.Assert.assertNotNull(userList45);
        org.junit.Assert.assertEquals("'" + str55 + "' != '" + "Password1!" + "'", str55, "Password1!");
// flaky "3) test0842(com.reservation_system.randoop.registrationservice.RegressionTest1)":         org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + true + "'", boolean57 == true);
        org.junit.Assert.assertNotNull(userList59);
        org.junit.Assert.assertNotNull(userList62);
        org.junit.Assert.assertEquals("'" + str70 + "' != '" + "Researcher" + "'", str70, "Researcher");
// flaky "1) test0842(com.reservation_system.randoop.registrationservice.RegressionTest1)":         org.junit.Assert.assertTrue("'" + boolean74 + "' != '" + true + "'", boolean74 == true);
    }

    @Test
    public void test0843() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0843");
        com.reservation_system.model.HeadLabCoordinator headLabCoordinator5 = new com.reservation_system.model.HeadLabCoordinator(102, "researcher", "data/test-userrepo.csv", "data/test-userrepo.csv", false);
        boolean boolean6 = headLabCoordinator5.isApproved();
        java.lang.String str7 = headLabCoordinator5.getUserType();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "headlabcoordinator" + "'", str7, "headlabcoordinator");
    }

    @Test
    public void test0844() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0844");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("data/test-userrepo.csv");
        com.reservation_system.services.RegistrationService registrationService2 = new com.reservation_system.services.RegistrationService(userRepository1);
        com.reservation_system.model.Faculty faculty8 = new com.reservation_system.model.Faculty(0, "Password1!", "data/test-userrepo.csv", "researcher", false);
        java.lang.String str9 = faculty8.getName();
        userRepository1.addUser((com.reservation_system.model.User) faculty8);
        boolean boolean12 = userRepository1.emailExists("Faculty");
        int int13 = userRepository1.getNextID();
        com.reservation_system.services.RegistrationService registrationService14 = new com.reservation_system.services.RegistrationService(userRepository1);
        boolean boolean16 = userRepository1.emailExists("student");
        com.reservation_system.services.RegistrationService registrationService17 = new com.reservation_system.services.RegistrationService(userRepository1);
        boolean boolean19 = userRepository1.emailExists("data/test-userrepo.csv");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Password1!" + "'", str9, "Password1!");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 101 + "'", int13 == 101);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
    }

    @Test
    public void test0845() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0845");
        com.reservation_system.model.User user6 = com.reservation_system.patterns.factory.UserFactory.createUser("student", (int) (byte) -1, "labmanager", "Password1!", "labmanager", true);
        org.junit.Assert.assertNotNull(user6);
    }

    @Test
    public void test0846() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0846");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("data/test-userrepo.csv");
        com.reservation_system.services.RegistrationService registrationService2 = new com.reservation_system.services.RegistrationService(userRepository1);
        com.reservation_system.model.Faculty faculty8 = new com.reservation_system.model.Faculty(0, "Password1!", "data/test-userrepo.csv", "researcher", false);
        java.lang.String str9 = faculty8.getName();
        userRepository1.addUser((com.reservation_system.model.User) faculty8);
        boolean boolean11 = userRepository1.headLabCoordinatorExists();
        int int12 = userRepository1.getNextID();
        boolean boolean13 = userRepository1.headLabCoordinatorExists();
        com.reservation_system.model.Guest guest19 = new com.reservation_system.model.Guest((int) '4', "researcher", "data/test-userrepo.csv", "andrew@example.com", false);
        userRepository1.addUser((com.reservation_system.model.User) guest19);
        int int21 = userRepository1.getNextID();
        java.util.List<com.reservation_system.model.User> userList22 = userRepository1.getAllUsers();
        boolean boolean23 = userRepository1.headLabCoordinatorExists();
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Password1!" + "'", str9, "Password1!");
// flaky "21) test0846(com.reservation_system.randoop.registrationservice.RegressionTest1)":         org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 101 + "'", int12 == 101);
// flaky "12) test0846(com.reservation_system.randoop.registrationservice.RegressionTest1)":         org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 101 + "'", int21 == 101);
        org.junit.Assert.assertNotNull(userList22);
// flaky "10) test0846(com.reservation_system.randoop.registrationservice.RegressionTest1)":         org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
    }

    @Test
    public void test0847() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0847");
        com.reservation_system.model.Student student5 = new com.reservation_system.model.Student((-1), "faculty", "guest", "labmanager", false);
        int int6 = student5.getID();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
    }

    @Test
    public void test0848() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0848");
        com.reservation_system.model.User user6 = com.reservation_system.patterns.factory.UserFactory.createUser("guest", 97, "Guest", "Researcher", "hi!", true);
        int int7 = user6.getID();
        org.junit.Assert.assertNotNull(user6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 97 + "'", int7 == 97);
    }

    @Test
    public void test0849() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0849");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("data/test-userrepo.csv");
        boolean boolean2 = userRepository1.headLabCoordinatorExists();
        com.reservation_system.services.RegistrationService registrationService3 = new com.reservation_system.services.RegistrationService(userRepository1);
        // The following exception was thrown during execution in test generation
        try {
            com.reservation_system.model.User user8 = registrationService3.registerUser("Researcher", "hi!", "Password1!", "Student");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid email format.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
// flaky "22) test0849(com.reservation_system.randoop.registrationservice.RegressionTest1)":         org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test0850() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0850");
        com.reservation_system.model.LabManager labManager5 = new com.reservation_system.model.LabManager(0, "Researcher", "Researcher", "labmanager", true);
        java.lang.String str6 = labManager5.getName();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Researcher" + "'", str6, "Researcher");
    }

    @Test
    public void test0851() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0851");
        com.reservation_system.model.LabManager labManager5 = new com.reservation_system.model.LabManager(0, "researcher", "Faculty", "", false);
    }

    @Test
    public void test0852() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0852");
        com.reservation_system.model.User user6 = com.reservation_system.patterns.factory.UserFactory.createUser("faculty", 97, "Student", "andrew@example.com", "student", true);
        org.junit.Assert.assertNotNull(user6);
    }

    @Test
    public void test0853() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0853");
        com.reservation_system.model.LabManager labManager5 = new com.reservation_system.model.LabManager((int) (short) -1, "Andrew", "", "faculty", true);
    }

    @Test
    public void test0854() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0854");
        com.reservation_system.model.Researcher researcher5 = new com.reservation_system.model.Researcher(102, "guest", "andrew@example.com", "Faculty", false);
    }

    @Test
    public void test0855() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0855");
        com.reservation_system.model.Researcher researcher5 = new com.reservation_system.model.Researcher((int) (short) -1, "andrew@example.com", "guest", "labmanager", false);
        java.lang.String str6 = researcher5.getEmail();
        researcher5.setApproved(true);
        java.lang.String str9 = researcher5.getPassword();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "guest" + "'", str6, "guest");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "labmanager" + "'", str9, "labmanager");
    }

    @Test
    public void test0856() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0856");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("data/test-userrepo.csv");
        int int2 = userRepository1.getNextID();
        int int3 = userRepository1.getNextID();
        boolean boolean5 = userRepository1.emailExists("");
        java.util.Optional<com.reservation_system.model.User> userOptional7 = userRepository1.findByEmail("Password1!");
        java.util.Optional<com.reservation_system.model.User> userOptional9 = userRepository1.findByEmail("Student");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 101 + "'", int2 == 101);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 101 + "'", int3 == 101);
// flaky "23) test0856(com.reservation_system.randoop.registrationservice.RegressionTest1)":         org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(userOptional7);
        org.junit.Assert.assertNotNull(userOptional9);
    }

    @Test
    public void test0857() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0857");
        com.reservation_system.model.HeadLabCoordinator headLabCoordinator5 = new com.reservation_system.model.HeadLabCoordinator(0, "Password1!", "labmanager", "researcher", false);
    }

    @Test
    public void test0858() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0858");
        com.reservation_system.model.HeadLabCoordinator headLabCoordinator5 = new com.reservation_system.model.HeadLabCoordinator((int) (short) -1, "Password1!", "student", "hi!", true);
    }

    @Test
    public void test0859() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0859");
        com.reservation_system.model.LabManager labManager5 = new com.reservation_system.model.LabManager(32, "Guest", "headlabcoordinator", "Andrew", true);
        boolean boolean6 = labManager5.requiresDepartmentApproval();
        java.lang.String str7 = labManager5.getUserType();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "labmanager" + "'", str7, "labmanager");
    }

    @Test
    public void test0860() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0860");
        com.reservation_system.model.Faculty faculty5 = new com.reservation_system.model.Faculty(52, "researcher", "guest", "Faculty", false);
        java.lang.String str6 = faculty5.getPassword();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Faculty" + "'", str6, "Faculty");
    }

    @Test
    public void test0861() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0861");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("data/test-userrepo.csv");
        com.reservation_system.services.RegistrationService registrationService2 = new com.reservation_system.services.RegistrationService(userRepository1);
        com.reservation_system.model.Faculty faculty8 = new com.reservation_system.model.Faculty(0, "Password1!", "data/test-userrepo.csv", "researcher", false);
        java.lang.String str9 = faculty8.getName();
        userRepository1.addUser((com.reservation_system.model.User) faculty8);
        boolean boolean11 = userRepository1.headLabCoordinatorExists();
        com.reservation_system.model.Guest guest17 = new com.reservation_system.model.Guest((int) (byte) -1, "guest", "Researcher", "Faculty", true);
        userRepository1.addUser((com.reservation_system.model.User) guest17);
        boolean boolean20 = userRepository1.emailExists("Password1!");
        com.reservation_system.repository.UserRepository userRepository22 = new com.reservation_system.repository.UserRepository("data/test-userrepo.csv");
        com.reservation_system.services.RegistrationService registrationService23 = new com.reservation_system.services.RegistrationService(userRepository22);
        com.reservation_system.model.Faculty faculty29 = new com.reservation_system.model.Faculty(0, "Password1!", "data/test-userrepo.csv", "researcher", false);
        java.lang.String str30 = faculty29.getName();
        userRepository22.addUser((com.reservation_system.model.User) faculty29);
        boolean boolean32 = userRepository22.headLabCoordinatorExists();
        com.reservation_system.services.RegistrationService registrationService33 = new com.reservation_system.services.RegistrationService(userRepository22);
        java.util.List<com.reservation_system.model.User> userList34 = userRepository22.getAllUsers();
        com.reservation_system.repository.UserRepository userRepository36 = new com.reservation_system.repository.UserRepository("data/test-userrepo.csv");
        com.reservation_system.services.RegistrationService registrationService37 = new com.reservation_system.services.RegistrationService(userRepository36);
        com.reservation_system.model.Faculty faculty43 = new com.reservation_system.model.Faculty(0, "Password1!", "data/test-userrepo.csv", "researcher", false);
        java.lang.String str44 = faculty43.getName();
        userRepository36.addUser((com.reservation_system.model.User) faculty43);
        boolean boolean46 = userRepository36.headLabCoordinatorExists();
        com.reservation_system.services.RegistrationService registrationService47 = new com.reservation_system.services.RegistrationService(userRepository36);
        java.util.List<com.reservation_system.model.User> userList48 = userRepository36.getAllUsers();
        userRepository22.saveAllUsers(userList48);
        userRepository1.saveAllUsers(userList48);
        int int51 = userRepository1.getNextID();
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Password1!" + "'", str9, "Password1!");
// flaky "24) test0861(com.reservation_system.randoop.registrationservice.RegressionTest1)":         org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "Password1!" + "'", str30, "Password1!");
// flaky "13) test0861(com.reservation_system.randoop.registrationservice.RegressionTest1)":         org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertNotNull(userList34);
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "Password1!" + "'", str44, "Password1!");
// flaky "11) test0861(com.reservation_system.randoop.registrationservice.RegressionTest1)":         org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + true + "'", boolean46 == true);
        org.junit.Assert.assertNotNull(userList48);
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + 101 + "'", int51 == 101);
    }

    @Test
    public void test0862() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0862");
        com.reservation_system.model.Researcher researcher5 = new com.reservation_system.model.Researcher((int) (short) -1, "Andrew", "headlabcoordinator", "Guest", false);
        boolean boolean6 = researcher5.requiresDepartmentApproval();
        int int7 = researcher5.getID();
        java.lang.String str8 = researcher5.getPassword();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Guest" + "'", str8, "Guest");
    }

    @Test
    public void test0863() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0863");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("data/test-userrepo.csv");
        boolean boolean2 = userRepository1.headLabCoordinatorExists();
        com.reservation_system.services.RegistrationService registrationService3 = new com.reservation_system.services.RegistrationService(userRepository1);
        boolean boolean5 = userRepository1.emailExists("");
        boolean boolean6 = userRepository1.headLabCoordinatorExists();
        java.util.List<com.reservation_system.model.User> userList7 = userRepository1.getAllUsers();
        java.util.List<com.reservation_system.model.User> userList8 = userRepository1.getAllUsers();
        boolean boolean10 = userRepository1.emailExists("student");
// flaky "25) test0863(com.reservation_system.randoop.registrationservice.RegressionTest1)":         org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
// flaky "14) test0863(com.reservation_system.randoop.registrationservice.RegressionTest1)":         org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
// flaky "12) test0863(com.reservation_system.randoop.registrationservice.RegressionTest1)":         org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(userList7);
        org.junit.Assert.assertNotNull(userList8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test0864() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0864");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("data/test-userrepo.csv");
        boolean boolean2 = userRepository1.headLabCoordinatorExists();
        com.reservation_system.repository.UserRepository userRepository4 = new com.reservation_system.repository.UserRepository("data/test-userrepo.csv");
        com.reservation_system.services.RegistrationService registrationService5 = new com.reservation_system.services.RegistrationService(userRepository4);
        com.reservation_system.model.Faculty faculty11 = new com.reservation_system.model.Faculty(0, "Password1!", "data/test-userrepo.csv", "researcher", false);
        java.lang.String str12 = faculty11.getName();
        userRepository4.addUser((com.reservation_system.model.User) faculty11);
        java.util.List<com.reservation_system.model.User> userList14 = userRepository4.getAllUsers();
        userRepository1.saveAllUsers(userList14);
        boolean boolean16 = userRepository1.headLabCoordinatorExists();
// flaky "26) test0864(com.reservation_system.randoop.registrationservice.RegressionTest1)":         org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Password1!" + "'", str12, "Password1!");
        org.junit.Assert.assertNotNull(userList14);
// flaky "15) test0864(com.reservation_system.randoop.registrationservice.RegressionTest1)":         org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
    }

    @Test
    public void test0865() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0865");
        com.reservation_system.model.Researcher researcher5 = new com.reservation_system.model.Researcher((int) '#', "guest", "andrew@example.com", "Researcher", false);
        int int6 = researcher5.getID();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 35 + "'", int6 == 35);
    }

    @Test
    public void test0866() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0866");
        com.reservation_system.model.User user6 = com.reservation_system.patterns.factory.UserFactory.createUser("Student", 32, "researcher", "headlabcoordinator", "guest", false);
        org.junit.Assert.assertNotNull(user6);
    }

    @Test
    public void test0867() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0867");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("data/test-userrepo.csv");
        com.reservation_system.services.RegistrationService registrationService2 = new com.reservation_system.services.RegistrationService(userRepository1);
        com.reservation_system.model.Faculty faculty8 = new com.reservation_system.model.Faculty(0, "Password1!", "data/test-userrepo.csv", "researcher", false);
        java.lang.String str9 = faculty8.getName();
        userRepository1.addUser((com.reservation_system.model.User) faculty8);
        boolean boolean11 = userRepository1.headLabCoordinatorExists();
        com.reservation_system.model.Guest guest17 = new com.reservation_system.model.Guest((int) (byte) -1, "guest", "Researcher", "Faculty", true);
        userRepository1.addUser((com.reservation_system.model.User) guest17);
        boolean boolean20 = userRepository1.emailExists("Password1!");
        java.util.List<com.reservation_system.model.User> userList21 = userRepository1.getAllUsers();
        com.reservation_system.model.Researcher researcher27 = new com.reservation_system.model.Researcher((int) 'a', "Researcher", "", "student", false);
        userRepository1.addUser((com.reservation_system.model.User) researcher27);
        com.reservation_system.services.RegistrationService registrationService29 = new com.reservation_system.services.RegistrationService(userRepository1);
        com.reservation_system.model.Guest guest35 = new com.reservation_system.model.Guest((int) (short) 0, "Faculty", "faculty", "", true);
        userRepository1.addUser((com.reservation_system.model.User) guest35);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Password1!" + "'", str9, "Password1!");
// flaky "27) test0867(com.reservation_system.randoop.registrationservice.RegressionTest1)":         org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertNotNull(userList21);
    }

    @Test
    public void test0868() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0868");
        com.reservation_system.model.HeadLabCoordinator headLabCoordinator5 = new com.reservation_system.model.HeadLabCoordinator((int) (byte) 0, "student", "", "faculty", false);
        java.lang.String str6 = headLabCoordinator5.getName();
        java.lang.String str7 = headLabCoordinator5.getUserType();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "student" + "'", str6, "student");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "headlabcoordinator" + "'", str7, "headlabcoordinator");
    }

    @Test
    public void test0869() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0869");
        com.reservation_system.model.HeadLabCoordinator headLabCoordinator5 = new com.reservation_system.model.HeadLabCoordinator(101, "headlabcoordinator", "", "data/test-userrepo.csv", true);
        java.lang.String str6 = headLabCoordinator5.getUserType();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "headlabcoordinator" + "'", str6, "headlabcoordinator");
    }

    @Test
    public void test0870() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0870");
        com.reservation_system.model.Researcher researcher5 = new com.reservation_system.model.Researcher((int) (short) 1, "Password1!", "headlabcoordinator", "", false);
        researcher5.setApproved(true);
        boolean boolean8 = researcher5.requiresDepartmentApproval();
        java.lang.String str9 = researcher5.getUserType();
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Researcher" + "'", str9, "Researcher");
    }

    @Test
    public void test0871() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0871");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("data/test-userrepo.csv");
        com.reservation_system.services.RegistrationService registrationService2 = new com.reservation_system.services.RegistrationService(userRepository1);
        com.reservation_system.model.Faculty faculty8 = new com.reservation_system.model.Faculty(0, "Password1!", "data/test-userrepo.csv", "researcher", false);
        java.lang.String str9 = faculty8.getName();
        userRepository1.addUser((com.reservation_system.model.User) faculty8);
        boolean boolean11 = userRepository1.headLabCoordinatorExists();
        com.reservation_system.repository.UserRepository userRepository13 = new com.reservation_system.repository.UserRepository("data/test-userrepo.csv");
        com.reservation_system.services.RegistrationService registrationService14 = new com.reservation_system.services.RegistrationService(userRepository13);
        com.reservation_system.model.Faculty faculty20 = new com.reservation_system.model.Faculty(0, "Password1!", "data/test-userrepo.csv", "researcher", false);
        java.lang.String str21 = faculty20.getName();
        userRepository13.addUser((com.reservation_system.model.User) faculty20);
        java.util.List<com.reservation_system.model.User> userList23 = userRepository13.getAllUsers();
        userRepository1.saveAllUsers(userList23);
        java.util.List<com.reservation_system.model.User> userList25 = userRepository1.getAllUsers();
        java.lang.Class<?> wildcardClass26 = userList25.getClass();
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Password1!" + "'", str9, "Password1!");
// flaky "28) test0871(com.reservation_system.randoop.registrationservice.RegressionTest1)":         org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "Password1!" + "'", str21, "Password1!");
        org.junit.Assert.assertNotNull(userList23);
        org.junit.Assert.assertNotNull(userList25);
        org.junit.Assert.assertNotNull(wildcardClass26);
    }

    @Test
    public void test0872() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0872");
        com.reservation_system.model.HeadLabCoordinator headLabCoordinator5 = new com.reservation_system.model.HeadLabCoordinator(0, "labmanager", "hi!", "andrew@example.com", true);
    }

    @Test
    public void test0873() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0873");
        com.reservation_system.model.Student student5 = new com.reservation_system.model.Student((int) (short) -1, "Andrew", "Guest", "Faculty", true);
        java.lang.String str6 = student5.getName();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Andrew" + "'", str6, "Andrew");
    }

    @Test
    public void test0874() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0874");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("data/test-userrepo.csv");
        com.reservation_system.services.RegistrationService registrationService2 = new com.reservation_system.services.RegistrationService(userRepository1);
        com.reservation_system.model.Faculty faculty8 = new com.reservation_system.model.Faculty(0, "Password1!", "data/test-userrepo.csv", "researcher", false);
        java.lang.String str9 = faculty8.getName();
        userRepository1.addUser((com.reservation_system.model.User) faculty8);
        boolean boolean11 = userRepository1.headLabCoordinatorExists();
        com.reservation_system.model.Guest guest17 = new com.reservation_system.model.Guest((int) (byte) -1, "guest", "Researcher", "Faculty", true);
        userRepository1.addUser((com.reservation_system.model.User) guest17);
        boolean boolean20 = userRepository1.emailExists("Password1!");
        boolean boolean22 = userRepository1.emailExists("hi!");
        int int23 = userRepository1.getNextID();
        com.reservation_system.services.RegistrationService registrationService24 = new com.reservation_system.services.RegistrationService(userRepository1);
        com.reservation_system.model.HeadLabCoordinator headLabCoordinator30 = new com.reservation_system.model.HeadLabCoordinator(10, "faculty", "Faculty", "data/test-userrepo.csv", false);
        boolean boolean31 = headLabCoordinator30.isApproved();
        userRepository1.addUser((com.reservation_system.model.User) headLabCoordinator30);
        java.lang.String str33 = headLabCoordinator30.getEmail();
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Password1!" + "'", str9, "Password1!");
// flaky "29) test0874(com.reservation_system.randoop.registrationservice.RegressionTest1)":         org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 101 + "'", int23 == 101);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "Faculty" + "'", str33, "Faculty");
    }

    @Test
    public void test0875() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0875");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("data/test-userrepo.csv");
        com.reservation_system.services.RegistrationService registrationService2 = new com.reservation_system.services.RegistrationService(userRepository1);
        com.reservation_system.model.Faculty faculty8 = new com.reservation_system.model.Faculty(0, "Password1!", "data/test-userrepo.csv", "researcher", false);
        java.lang.String str9 = faculty8.getName();
        userRepository1.addUser((com.reservation_system.model.User) faculty8);
        com.reservation_system.services.RegistrationService registrationService11 = new com.reservation_system.services.RegistrationService(userRepository1);
        com.reservation_system.services.RegistrationService registrationService12 = new com.reservation_system.services.RegistrationService(userRepository1);
        // The following exception was thrown during execution in test generation
        try {
            com.reservation_system.model.User user17 = registrationService12.registerUser("guest", "researcher", "researcher", "Password1!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid email format.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Password1!" + "'", str9, "Password1!");
    }

    @Test
    public void test0876() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0876");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("data/test-userrepo.csv");
        boolean boolean2 = userRepository1.headLabCoordinatorExists();
        java.util.Optional<com.reservation_system.model.User> userOptional4 = userRepository1.findByEmail("student");
        java.util.Optional<com.reservation_system.model.User> userOptional6 = userRepository1.findByEmail("guest");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(userOptional4);
        org.junit.Assert.assertNotNull(userOptional6);
    }

    @Test
    public void test0877() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0877");
        com.reservation_system.model.Guest guest5 = new com.reservation_system.model.Guest(0, "researcher", "andrew@example.com", "Guest", false);
    }

    @Test
    public void test0878() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0878");
        com.reservation_system.model.Student student5 = new com.reservation_system.model.Student((int) ' ', "Researcher", "andrew@example.com", "Researcher", true);
        boolean boolean6 = student5.isApproved();
        java.lang.Class<?> wildcardClass7 = student5.getClass();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0879() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0879");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("data/test-userrepo.csv");
        int int2 = userRepository1.getNextID();
        int int3 = userRepository1.getNextID();
        boolean boolean5 = userRepository1.emailExists("faculty");
        com.reservation_system.model.LabManager labManager11 = new com.reservation_system.model.LabManager((int) (short) 0, "", "labmanager", "Password1!", true);
        userRepository1.addUser((com.reservation_system.model.User) labManager11);
        labManager11.setApproved(false);
        java.lang.String str15 = labManager11.getUserType();
        java.lang.String str16 = labManager11.getUserType();
        int int17 = labManager11.getID();
        java.lang.String str18 = labManager11.getUserType();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 101 + "'", int2 == 101);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 101 + "'", int3 == 101);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "labmanager" + "'", str15, "labmanager");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "labmanager" + "'", str16, "labmanager");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "labmanager" + "'", str18, "labmanager");
    }

    @Test
    public void test0880() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0880");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("data/test-userrepo.csv");
        java.util.Optional<com.reservation_system.model.User> userOptional3 = userRepository1.findByEmail("hi!");
        int int4 = userRepository1.getNextID();
        boolean boolean5 = userRepository1.headLabCoordinatorExists();
        int int6 = userRepository1.getNextID();
        java.util.Optional<com.reservation_system.model.User> userOptional8 = userRepository1.findByEmail("guest");
        org.junit.Assert.assertNotNull(userOptional3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 101 + "'", int4 == 101);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 101 + "'", int6 == 101);
        org.junit.Assert.assertNotNull(userOptional8);
    }

    @Test
    public void test0881() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0881");
        com.reservation_system.model.HeadLabCoordinator headLabCoordinator5 = new com.reservation_system.model.HeadLabCoordinator((int) (byte) 1, "andrew@example.com", "student", "labmanager", true);
        java.lang.String str6 = headLabCoordinator5.getUserType();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "headlabcoordinator" + "'", str6, "headlabcoordinator");
    }

    @Test
    public void test0882() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0882");
        com.reservation_system.model.Student student5 = new com.reservation_system.model.Student((int) (short) 1, "labmanager", "", "", true);
        java.lang.String str6 = student5.getUserType();
        java.lang.String str7 = student5.getUserType();
        java.lang.String str8 = student5.getName();
        java.lang.String str9 = student5.getUserType();
        boolean boolean10 = student5.requiresDepartmentApproval();
        java.lang.String str11 = student5.getUserType();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Student" + "'", str6, "Student");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Student" + "'", str7, "Student");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "labmanager" + "'", str8, "labmanager");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Student" + "'", str9, "Student");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Student" + "'", str11, "Student");
    }

    @Test
    public void test0883() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0883");
        com.reservation_system.model.HeadLabCoordinator headLabCoordinator5 = new com.reservation_system.model.HeadLabCoordinator((int) (byte) -1, "guest", "Guest", "labmanager", false);
        boolean boolean6 = headLabCoordinator5.isApproved();
        java.lang.String str7 = headLabCoordinator5.getUserType();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "headlabcoordinator" + "'", str7, "headlabcoordinator");
    }

    @Test
    public void test0884() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0884");
        com.reservation_system.model.Researcher researcher5 = new com.reservation_system.model.Researcher((int) (byte) 1, "Researcher", "headlabcoordinator", "Researcher", true);
    }

    @Test
    public void test0885() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0885");
        com.reservation_system.model.Researcher researcher5 = new com.reservation_system.model.Researcher((int) '#', "", "student", "student", false);
        java.lang.String str6 = researcher5.getEmail();
        java.lang.String str7 = researcher5.getUserType();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "student" + "'", str6, "student");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Researcher" + "'", str7, "Researcher");
    }

    @Test
    public void test0886() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0886");
        com.reservation_system.model.Researcher researcher5 = new com.reservation_system.model.Researcher((int) (byte) 100, "Password1!", "Password1!", "headlabcoordinator", true);
        boolean boolean6 = researcher5.requiresDepartmentApproval();
        java.lang.String str7 = researcher5.getUserType();
        java.lang.String str8 = researcher5.getUserType();
        int int9 = researcher5.getID();
        java.lang.String str10 = researcher5.getEmail();
        java.lang.String str11 = researcher5.getPassword();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Researcher" + "'", str7, "Researcher");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Researcher" + "'", str8, "Researcher");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 100 + "'", int9 == 100);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Password1!" + "'", str10, "Password1!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "headlabcoordinator" + "'", str11, "headlabcoordinator");
    }

    @Test
    public void test0887() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0887");
        com.reservation_system.model.LabManager labManager5 = new com.reservation_system.model.LabManager(0, "", "student", "faculty", true);
        labManager5.setApproved(true);
    }

    @Test
    public void test0888() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0888");
        com.reservation_system.model.HeadLabCoordinator headLabCoordinator5 = new com.reservation_system.model.HeadLabCoordinator((int) (byte) -1, "", "Andrew", "Andrew", false);
        java.lang.String str6 = headLabCoordinator5.getPassword();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Andrew" + "'", str6, "Andrew");
    }

    @Test
    public void test0889() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0889");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("data/test-userrepo.csv");
        com.reservation_system.services.RegistrationService registrationService2 = new com.reservation_system.services.RegistrationService(userRepository1);
        com.reservation_system.model.Faculty faculty8 = new com.reservation_system.model.Faculty(0, "Password1!", "data/test-userrepo.csv", "researcher", false);
        java.lang.String str9 = faculty8.getName();
        userRepository1.addUser((com.reservation_system.model.User) faculty8);
        boolean boolean11 = userRepository1.headLabCoordinatorExists();
        int int12 = userRepository1.getNextID();
        com.reservation_system.repository.UserRepository userRepository14 = new com.reservation_system.repository.UserRepository("data/test-userrepo.csv");
        java.util.List<com.reservation_system.model.User> userList15 = userRepository14.getAllUsers();
        com.reservation_system.services.RegistrationService registrationService16 = new com.reservation_system.services.RegistrationService(userRepository14);
        java.util.List<com.reservation_system.model.User> userList17 = userRepository14.getAllUsers();
        userRepository1.saveAllUsers(userList17);
        boolean boolean19 = userRepository1.headLabCoordinatorExists();
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Password1!" + "'", str9, "Password1!");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 101 + "'", int12 == 101);
        org.junit.Assert.assertNotNull(userList15);
        org.junit.Assert.assertNotNull(userList17);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
    }

    @Test
    public void test0890() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0890");
        com.reservation_system.model.Researcher researcher5 = new com.reservation_system.model.Researcher((int) '4', "hi!", "hi!", "labmanager", false);
        java.lang.String str6 = researcher5.getName();
        java.lang.String str7 = researcher5.getUserType();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Researcher" + "'", str7, "Researcher");
    }

    @Test
    public void test0891() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0891");
        com.reservation_system.model.Student student5 = new com.reservation_system.model.Student((int) (short) 100, "Researcher", "Faculty", "", false);
    }

    @Test
    public void test0892() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0892");
        // The following exception was thrown during execution in test generation
        try {
            com.reservation_system.model.User user6 = com.reservation_system.patterns.factory.UserFactory.createUser("data/test-userrepo.csv", 10, "Guest", "Guest", "student", true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid user type: data/test-userrepo.csv");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0893() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0893");
        com.reservation_system.model.Guest guest5 = new com.reservation_system.model.Guest(0, "headlabcoordinator", "labmanager", "labmanager", false);
    }

    @Test
    public void test0894() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0894");
        com.reservation_system.model.Student student5 = new com.reservation_system.model.Student(100, "Password1!", "Student", "Andrew", true);
        java.lang.String str6 = student5.getUserType();
        java.lang.String str7 = student5.getUserType();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Student" + "'", str6, "Student");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Student" + "'", str7, "Student");
    }

    @Test
    public void test0895() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0895");
        com.reservation_system.model.Student student5 = new com.reservation_system.model.Student((int) ' ', "Password1!", "andrew@example.com", "researcher", false);
        java.lang.String str6 = student5.getUserType();
        java.lang.String str7 = student5.getUserType();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Student" + "'", str6, "Student");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Student" + "'", str7, "Student");
    }

    @Test
    public void test0896() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0896");
        com.reservation_system.model.HeadLabCoordinator headLabCoordinator5 = new com.reservation_system.model.HeadLabCoordinator(35, "guest", "Password1!", "andrew@example.com", true);
    }

    @Test
    public void test0897() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0897");
        com.reservation_system.model.HeadLabCoordinator headLabCoordinator5 = new com.reservation_system.model.HeadLabCoordinator((int) (short) 100, "", "Andrew", "Researcher", true);
    }

    @Test
    public void test0898() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0898");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("data/test-userrepo.csv");
        java.util.Optional<com.reservation_system.model.User> userOptional3 = userRepository1.findByEmail("hi!");
        int int4 = userRepository1.getNextID();
        int int5 = userRepository1.getNextID();
        com.reservation_system.model.Researcher researcher11 = new com.reservation_system.model.Researcher((int) 'a', "student", "", "researcher", true);
        userRepository1.addUser((com.reservation_system.model.User) researcher11);
        boolean boolean14 = userRepository1.emailExists("Guest");
        org.junit.Assert.assertNotNull(userOptional3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 101 + "'", int4 == 101);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 101 + "'", int5 == 101);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test0899() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0899");
        com.reservation_system.model.Faculty faculty5 = new com.reservation_system.model.Faculty(1, "andrew@example.com", "andrew@example.com", "guest", false);
        java.lang.String str6 = faculty5.getName();
        java.lang.String str7 = faculty5.getEmail();
    }

    @Test
    public void test0900() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0900");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("data/test-userrepo.csv");
        boolean boolean2 = userRepository1.headLabCoordinatorExists();
        com.reservation_system.repository.UserRepository userRepository4 = new com.reservation_system.repository.UserRepository("data/test-userrepo.csv");
        com.reservation_system.services.RegistrationService registrationService5 = new com.reservation_system.services.RegistrationService(userRepository4);
        com.reservation_system.model.Faculty faculty11 = new com.reservation_system.model.Faculty(0, "Password1!", "data/test-userrepo.csv", "researcher", false);
        java.lang.String str12 = faculty11.getName();
        userRepository4.addUser((com.reservation_system.model.User) faculty11);
        boolean boolean14 = userRepository4.headLabCoordinatorExists();
        com.reservation_system.model.Guest guest20 = new com.reservation_system.model.Guest((int) (byte) -1, "guest", "Researcher", "Faculty", true);
        userRepository4.addUser((com.reservation_system.model.User) guest20);
        boolean boolean22 = userRepository4.headLabCoordinatorExists();
        com.reservation_system.repository.UserRepository userRepository24 = new com.reservation_system.repository.UserRepository("data/test-userrepo.csv");
        com.reservation_system.services.RegistrationService registrationService25 = new com.reservation_system.services.RegistrationService(userRepository24);
        com.reservation_system.model.Faculty faculty31 = new com.reservation_system.model.Faculty(0, "Password1!", "data/test-userrepo.csv", "researcher", false);
        java.lang.String str32 = faculty31.getName();
        userRepository24.addUser((com.reservation_system.model.User) faculty31);
        boolean boolean34 = userRepository24.headLabCoordinatorExists();
        com.reservation_system.repository.UserRepository userRepository36 = new com.reservation_system.repository.UserRepository("data/test-userrepo.csv");
        com.reservation_system.services.RegistrationService registrationService37 = new com.reservation_system.services.RegistrationService(userRepository36);
        com.reservation_system.model.Faculty faculty43 = new com.reservation_system.model.Faculty(0, "Password1!", "data/test-userrepo.csv", "researcher", false);
        java.lang.String str44 = faculty43.getName();
        userRepository36.addUser((com.reservation_system.model.User) faculty43);
        java.util.List<com.reservation_system.model.User> userList46 = userRepository36.getAllUsers();
        userRepository24.saveAllUsers(userList46);
        userRepository4.saveAllUsers(userList46);
        userRepository1.saveAllUsers(userList46);
        com.reservation_system.services.RegistrationService registrationService50 = new com.reservation_system.services.RegistrationService(userRepository1);
        int int51 = userRepository1.getNextID();
        com.reservation_system.model.Faculty faculty57 = new com.reservation_system.model.Faculty((int) (byte) 1, "guest", "", "headlabcoordinator", false);
        java.lang.String str58 = faculty57.getUserType();
        userRepository1.addUser((com.reservation_system.model.User) faculty57);
        java.util.List<com.reservation_system.model.User> userList60 = userRepository1.getAllUsers();
        boolean boolean61 = userRepository1.headLabCoordinatorExists();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Password1!" + "'", str12, "Password1!");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "Password1!" + "'", str32, "Password1!");
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "Password1!" + "'", str44, "Password1!");
        org.junit.Assert.assertNotNull(userList46);
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + 101 + "'", int51 == 101);
        org.junit.Assert.assertEquals("'" + str58 + "' != '" + "Faculty" + "'", str58, "Faculty");
        org.junit.Assert.assertNotNull(userList60);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + true + "'", boolean61 == true);
    }

    @Test
    public void test0901() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0901");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("data/test-userrepo.csv");
        java.util.Optional<com.reservation_system.model.User> userOptional3 = userRepository1.findByEmail("hi!");
        int int4 = userRepository1.getNextID();
        int int5 = userRepository1.getNextID();
        com.reservation_system.model.Researcher researcher11 = new com.reservation_system.model.Researcher((int) 'a', "student", "", "researcher", true);
        userRepository1.addUser((com.reservation_system.model.User) researcher11);
        java.lang.String str13 = researcher11.getUserType();
        researcher11.setApproved(false);
        org.junit.Assert.assertNotNull(userOptional3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 101 + "'", int4 == 101);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 101 + "'", int5 == 101);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Researcher" + "'", str13, "Researcher");
    }

    @Test
    public void test0902() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0902");
        com.reservation_system.model.Researcher researcher5 = new com.reservation_system.model.Researcher(98, "Student", "andrew@example.com", "researcher", false);
    }

    @Test
    public void test0903() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0903");
        com.reservation_system.model.Guest guest5 = new com.reservation_system.model.Guest(10, "faculty", "Faculty", "Student", false);
    }

    @Test
    public void test0904() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0904");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("data/test-userrepo.csv");
        boolean boolean2 = userRepository1.headLabCoordinatorExists();
        com.reservation_system.services.RegistrationService registrationService3 = new com.reservation_system.services.RegistrationService(userRepository1);
        boolean boolean5 = userRepository1.emailExists("");
        java.util.Optional<com.reservation_system.model.User> userOptional7 = userRepository1.findByEmail("");
        java.util.Optional<com.reservation_system.model.User> userOptional9 = userRepository1.findByEmail("hi!");
        com.reservation_system.services.RegistrationService registrationService10 = new com.reservation_system.services.RegistrationService(userRepository1);
        com.reservation_system.services.RegistrationService registrationService11 = new com.reservation_system.services.RegistrationService(userRepository1);
        // The following exception was thrown during execution in test generation
        try {
            com.reservation_system.model.User user16 = registrationService11.registerUser("Password1!", "Andrew", "headlabcoordinator", "Andrew");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid user type.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(userOptional7);
        org.junit.Assert.assertNotNull(userOptional9);
    }

    @Test
    public void test0905() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0905");
        com.reservation_system.model.HeadLabCoordinator headLabCoordinator5 = new com.reservation_system.model.HeadLabCoordinator((int) (byte) -1, "Guest", "", "researcher", false);
        java.lang.String str6 = headLabCoordinator5.getUserType();
        java.lang.String str7 = headLabCoordinator5.getPassword();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "headlabcoordinator" + "'", str6, "headlabcoordinator");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "researcher" + "'", str7, "researcher");
    }

    @Test
    public void test0906() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0906");
        com.reservation_system.model.HeadLabCoordinator headLabCoordinator5 = new com.reservation_system.model.HeadLabCoordinator(102, "data/test-userrepo.csv", "", "Andrew", false);
        int int6 = headLabCoordinator5.getID();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 102 + "'", int6 == 102);
    }

    @Test
    public void test0907() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0907");
        com.reservation_system.model.LabManager labManager5 = new com.reservation_system.model.LabManager((int) (byte) 100, "researcher", "andrew@example.com", "Researcher", false);
        java.lang.String str6 = labManager5.getUserType();
        java.lang.String str7 = labManager5.getUserType();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "labmanager" + "'", str6, "labmanager");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "labmanager" + "'", str7, "labmanager");
    }

    @Test
    public void test0908() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0908");
        com.reservation_system.model.Faculty faculty5 = new com.reservation_system.model.Faculty(0, "Password1!", "data/test-userrepo.csv", "researcher", false);
        java.lang.String str6 = faculty5.getName();
        java.lang.String str7 = faculty5.getUserType();
        int int8 = faculty5.getID();
        java.lang.String str9 = faculty5.getUserType();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Password1!" + "'", str6, "Password1!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Faculty" + "'", str7, "Faculty");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Faculty" + "'", str9, "Faculty");
    }

    @Test
    public void test0909() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0909");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("data/test-userrepo.csv");
        com.reservation_system.services.RegistrationService registrationService2 = new com.reservation_system.services.RegistrationService(userRepository1);
        com.reservation_system.model.Faculty faculty8 = new com.reservation_system.model.Faculty(0, "Password1!", "data/test-userrepo.csv", "researcher", false);
        java.lang.String str9 = faculty8.getName();
        userRepository1.addUser((com.reservation_system.model.User) faculty8);
        boolean boolean12 = userRepository1.emailExists("Faculty");
        int int13 = userRepository1.getNextID();
        java.util.List<com.reservation_system.model.User> userList14 = userRepository1.getAllUsers();
        java.util.Optional<com.reservation_system.model.User> userOptional16 = userRepository1.findByEmail("hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Password1!" + "'", str9, "Password1!");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 101 + "'", int13 == 101);
        org.junit.Assert.assertNotNull(userList14);
        org.junit.Assert.assertNotNull(userOptional16);
    }

    @Test
    public void test0910() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0910");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("data/test-userrepo.csv");
        boolean boolean2 = userRepository1.headLabCoordinatorExists();
        com.reservation_system.services.RegistrationService registrationService3 = new com.reservation_system.services.RegistrationService(userRepository1);
        boolean boolean4 = userRepository1.headLabCoordinatorExists();
        boolean boolean6 = userRepository1.emailExists("Andrew");
        com.reservation_system.services.RegistrationService registrationService7 = new com.reservation_system.services.RegistrationService(userRepository1);
        java.util.Optional<com.reservation_system.model.User> userOptional9 = userRepository1.findByEmail("faculty");
        com.reservation_system.services.RegistrationService registrationService10 = new com.reservation_system.services.RegistrationService(userRepository1);
        com.reservation_system.repository.UserRepository userRepository12 = new com.reservation_system.repository.UserRepository("data/test-userrepo.csv");
        com.reservation_system.services.RegistrationService registrationService13 = new com.reservation_system.services.RegistrationService(userRepository12);
        com.reservation_system.model.Faculty faculty19 = new com.reservation_system.model.Faculty(0, "Password1!", "data/test-userrepo.csv", "researcher", false);
        java.lang.String str20 = faculty19.getName();
        userRepository12.addUser((com.reservation_system.model.User) faculty19);
        boolean boolean22 = userRepository12.headLabCoordinatorExists();
        com.reservation_system.model.Guest guest28 = new com.reservation_system.model.Guest((int) (byte) -1, "guest", "Researcher", "Faculty", true);
        userRepository12.addUser((com.reservation_system.model.User) guest28);
        boolean boolean31 = userRepository12.emailExists("Password1!");
        com.reservation_system.repository.UserRepository userRepository33 = new com.reservation_system.repository.UserRepository("data/test-userrepo.csv");
        com.reservation_system.services.RegistrationService registrationService34 = new com.reservation_system.services.RegistrationService(userRepository33);
        com.reservation_system.model.Faculty faculty40 = new com.reservation_system.model.Faculty(0, "Password1!", "data/test-userrepo.csv", "researcher", false);
        java.lang.String str41 = faculty40.getName();
        userRepository33.addUser((com.reservation_system.model.User) faculty40);
        boolean boolean43 = userRepository33.headLabCoordinatorExists();
        com.reservation_system.services.RegistrationService registrationService44 = new com.reservation_system.services.RegistrationService(userRepository33);
        java.util.List<com.reservation_system.model.User> userList45 = userRepository33.getAllUsers();
        com.reservation_system.repository.UserRepository userRepository47 = new com.reservation_system.repository.UserRepository("data/test-userrepo.csv");
        com.reservation_system.services.RegistrationService registrationService48 = new com.reservation_system.services.RegistrationService(userRepository47);
        com.reservation_system.model.Faculty faculty54 = new com.reservation_system.model.Faculty(0, "Password1!", "data/test-userrepo.csv", "researcher", false);
        java.lang.String str55 = faculty54.getName();
        userRepository47.addUser((com.reservation_system.model.User) faculty54);
        boolean boolean57 = userRepository47.headLabCoordinatorExists();
        com.reservation_system.services.RegistrationService registrationService58 = new com.reservation_system.services.RegistrationService(userRepository47);
        java.util.List<com.reservation_system.model.User> userList59 = userRepository47.getAllUsers();
        userRepository33.saveAllUsers(userList59);
        userRepository12.saveAllUsers(userList59);
        java.util.List<com.reservation_system.model.User> userList62 = userRepository12.getAllUsers();
        userRepository1.saveAllUsers(userList62);
        com.reservation_system.model.LabManager labManager69 = new com.reservation_system.model.LabManager((int) 'a', "headlabcoordinator", "Researcher", "Andrew", false);
        java.lang.String str70 = labManager69.getEmail();
        labManager69.setApproved(false);
        userRepository1.addUser((com.reservation_system.model.User) labManager69);
        boolean boolean74 = userRepository1.headLabCoordinatorExists();
        boolean boolean76 = userRepository1.emailExists("Password1!");
        com.reservation_system.model.HeadLabCoordinator headLabCoordinator82 = new com.reservation_system.model.HeadLabCoordinator((int) ' ', "", "guest", "data/test-userrepo.csv", true);
        userRepository1.addUser((com.reservation_system.model.User) headLabCoordinator82);
        java.util.List<com.reservation_system.model.User> userList84 = null;
        // The following exception was thrown during execution in test generation
        try {
            userRepository1.saveAllUsers(userList84);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(userOptional9);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "Password1!" + "'", str20, "Password1!");
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "Password1!" + "'", str41, "Password1!");
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + true + "'", boolean43 == true);
        org.junit.Assert.assertNotNull(userList45);
        org.junit.Assert.assertEquals("'" + str55 + "' != '" + "Password1!" + "'", str55, "Password1!");
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + true + "'", boolean57 == true);
        org.junit.Assert.assertNotNull(userList59);
        org.junit.Assert.assertNotNull(userList62);
        org.junit.Assert.assertEquals("'" + str70 + "' != '" + "Researcher" + "'", str70, "Researcher");
        org.junit.Assert.assertTrue("'" + boolean74 + "' != '" + true + "'", boolean74 == true);
        org.junit.Assert.assertTrue("'" + boolean76 + "' != '" + true + "'", boolean76 == true);
    }

    @Test
    public void test0911() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0911");
        com.reservation_system.model.Faculty faculty5 = new com.reservation_system.model.Faculty((int) ' ', "hi!", "", "hi!", true);
        boolean boolean6 = faculty5.isApproved();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test0912() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0912");
        com.reservation_system.model.Student student5 = new com.reservation_system.model.Student((int) (byte) 0, "labmanager", "Andrew", "researcher", false);
    }

    @Test
    public void test0913() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0913");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("data/test-userrepo.csv");
        boolean boolean2 = userRepository1.headLabCoordinatorExists();
        com.reservation_system.services.RegistrationService registrationService3 = new com.reservation_system.services.RegistrationService(userRepository1);
        boolean boolean4 = userRepository1.headLabCoordinatorExists();
        boolean boolean5 = userRepository1.headLabCoordinatorExists();
        com.reservation_system.repository.UserRepository userRepository7 = new com.reservation_system.repository.UserRepository("data/test-userrepo.csv");
        com.reservation_system.services.RegistrationService registrationService8 = new com.reservation_system.services.RegistrationService(userRepository7);
        com.reservation_system.model.Faculty faculty14 = new com.reservation_system.model.Faculty(0, "Password1!", "data/test-userrepo.csv", "researcher", false);
        java.lang.String str15 = faculty14.getName();
        userRepository7.addUser((com.reservation_system.model.User) faculty14);
        boolean boolean17 = userRepository7.headLabCoordinatorExists();
        int int18 = userRepository7.getNextID();
        com.reservation_system.repository.UserRepository userRepository20 = new com.reservation_system.repository.UserRepository("data/test-userrepo.csv");
        java.util.List<com.reservation_system.model.User> userList21 = userRepository20.getAllUsers();
        com.reservation_system.services.RegistrationService registrationService22 = new com.reservation_system.services.RegistrationService(userRepository20);
        java.util.List<com.reservation_system.model.User> userList23 = userRepository20.getAllUsers();
        userRepository7.saveAllUsers(userList23);
        userRepository1.saveAllUsers(userList23);
        java.util.List<com.reservation_system.model.User> userList26 = userRepository1.getAllUsers();
        com.reservation_system.model.Student student32 = new com.reservation_system.model.Student(32, "Faculty", "andrew@example.com", "Researcher", false);
        userRepository1.addUser((com.reservation_system.model.User) student32);
        java.lang.String str34 = student32.getPassword();
        java.lang.String str35 = student32.getName();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Password1!" + "'", str15, "Password1!");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertNotNull(userList21);
        org.junit.Assert.assertNotNull(userList23);
        org.junit.Assert.assertNotNull(userList26);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "Researcher" + "'", str34, "Researcher");
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "Faculty" + "'", str35, "Faculty");
    }

    @Test
    public void test0914() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0914");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("data/test-userrepo.csv");
        java.util.List<com.reservation_system.model.User> userList2 = userRepository1.getAllUsers();
        com.reservation_system.services.RegistrationService registrationService3 = new com.reservation_system.services.RegistrationService(userRepository1);
        int int4 = userRepository1.getNextID();
        com.reservation_system.model.Researcher researcher10 = new com.reservation_system.model.Researcher(100, "data/test-userrepo.csv", "andrew@example.com", "guest", false);
        java.lang.String str11 = researcher10.getEmail();
        userRepository1.addUser((com.reservation_system.model.User) researcher10);
        boolean boolean14 = userRepository1.emailExists("researcher");
        org.junit.Assert.assertNotNull(userList2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 33 + "'", int4 == 33);
// flaky "30) test0914(com.reservation_system.randoop.registrationservice.RegressionTest1)":         org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test0915() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0915");
        com.reservation_system.model.Faculty faculty5 = new com.reservation_system.model.Faculty(1, "andrew@example.com", "andrew@example.com", "guest", false);
        java.lang.String str6 = faculty5.getUserType();
        boolean boolean7 = faculty5.isApproved();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Faculty" + "'", str6, "Faculty");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test0916() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0916");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("data/test-userrepo.csv");
        int int2 = userRepository1.getNextID();
        int int3 = userRepository1.getNextID();
        boolean boolean5 = userRepository1.emailExists("faculty");
        com.reservation_system.model.LabManager labManager11 = new com.reservation_system.model.LabManager((int) (short) 0, "", "labmanager", "Password1!", true);
        userRepository1.addUser((com.reservation_system.model.User) labManager11);
        java.util.Optional<com.reservation_system.model.User> userOptional14 = userRepository1.findByEmail("");
        com.reservation_system.model.Researcher researcher20 = new com.reservation_system.model.Researcher((int) (byte) 100, "Password1!", "Password1!", "headlabcoordinator", true);
        userRepository1.addUser((com.reservation_system.model.User) researcher20);
        int int22 = researcher20.getID();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 101 + "'", int2 == 101);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 101 + "'", int3 == 101);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(userOptional14);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 100 + "'", int22 == 100);
    }

    @Test
    public void test0917() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0917");
        // The following exception was thrown during execution in test generation
        try {
            com.reservation_system.model.User user6 = com.reservation_system.patterns.factory.UserFactory.createUser("Andrew", 35, "Student", "Student", "", true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid user type: Andrew");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0918() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0918");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("data/test-userrepo.csv");
        java.util.Optional<com.reservation_system.model.User> userOptional3 = userRepository1.findByEmail("hi!");
        int int4 = userRepository1.getNextID();
        com.reservation_system.model.Researcher researcher10 = new com.reservation_system.model.Researcher((int) (byte) 10, "", "Guest", "headlabcoordinator", true);
        userRepository1.addUser((com.reservation_system.model.User) researcher10);
        java.util.List<com.reservation_system.model.User> userList12 = userRepository1.getAllUsers();
        int int13 = userRepository1.getNextID();
        com.reservation_system.repository.UserRepository userRepository15 = new com.reservation_system.repository.UserRepository("data/test-userrepo.csv");
        com.reservation_system.services.RegistrationService registrationService16 = new com.reservation_system.services.RegistrationService(userRepository15);
        int int17 = userRepository15.getNextID();
        boolean boolean19 = userRepository15.emailExists("labmanager");
        java.util.List<com.reservation_system.model.User> userList20 = userRepository15.getAllUsers();
        userRepository1.saveAllUsers(userList20);
        boolean boolean23 = userRepository1.emailExists("Faculty");
        org.junit.Assert.assertNotNull(userOptional3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 101 + "'", int4 == 101);
        org.junit.Assert.assertNotNull(userList12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 101 + "'", int13 == 101);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 101 + "'", int17 == 101);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNotNull(userList20);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
    }

    @Test
    public void test0919() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0919");
        com.reservation_system.model.Researcher researcher5 = new com.reservation_system.model.Researcher((int) (short) 100, "headlabcoordinator", "faculty", "", true);
        java.lang.String str6 = researcher5.getPassword();
        java.lang.String str7 = researcher5.getUserType();
        java.lang.String str8 = researcher5.getUserType();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Researcher" + "'", str7, "Researcher");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Researcher" + "'", str8, "Researcher");
    }

    @Test
    public void test0920() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0920");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("data/test-userrepo.csv");
        boolean boolean2 = userRepository1.headLabCoordinatorExists();
        com.reservation_system.services.RegistrationService registrationService3 = new com.reservation_system.services.RegistrationService(userRepository1);
        boolean boolean4 = userRepository1.headLabCoordinatorExists();
        boolean boolean6 = userRepository1.emailExists("Andrew");
        com.reservation_system.services.RegistrationService registrationService7 = new com.reservation_system.services.RegistrationService(userRepository1);
        com.reservation_system.repository.UserRepository userRepository9 = new com.reservation_system.repository.UserRepository("data/test-userrepo.csv");
        com.reservation_system.services.RegistrationService registrationService10 = new com.reservation_system.services.RegistrationService(userRepository9);
        com.reservation_system.model.Faculty faculty16 = new com.reservation_system.model.Faculty(0, "Password1!", "data/test-userrepo.csv", "researcher", false);
        java.lang.String str17 = faculty16.getName();
        userRepository9.addUser((com.reservation_system.model.User) faculty16);
        boolean boolean19 = userRepository9.headLabCoordinatorExists();
        com.reservation_system.model.Guest guest25 = new com.reservation_system.model.Guest((int) (byte) -1, "guest", "Researcher", "Faculty", true);
        userRepository9.addUser((com.reservation_system.model.User) guest25);
        java.util.List<com.reservation_system.model.User> userList27 = userRepository9.getAllUsers();
        userRepository1.saveAllUsers(userList27);
        com.reservation_system.repository.UserRepository userRepository30 = new com.reservation_system.repository.UserRepository("data/test-userrepo.csv");
        com.reservation_system.services.RegistrationService registrationService31 = new com.reservation_system.services.RegistrationService(userRepository30);
        com.reservation_system.model.Faculty faculty37 = new com.reservation_system.model.Faculty(0, "Password1!", "data/test-userrepo.csv", "researcher", false);
        java.lang.String str38 = faculty37.getName();
        userRepository30.addUser((com.reservation_system.model.User) faculty37);
        boolean boolean40 = userRepository30.headLabCoordinatorExists();
        int int41 = userRepository30.getNextID();
        com.reservation_system.repository.UserRepository userRepository43 = new com.reservation_system.repository.UserRepository("data/test-userrepo.csv");
        com.reservation_system.services.RegistrationService registrationService44 = new com.reservation_system.services.RegistrationService(userRepository43);
        int int45 = userRepository43.getNextID();
        boolean boolean47 = userRepository43.emailExists("labmanager");
        java.util.List<com.reservation_system.model.User> userList48 = userRepository43.getAllUsers();
        userRepository30.saveAllUsers(userList48);
        userRepository1.saveAllUsers(userList48);
        com.reservation_system.model.Faculty faculty56 = new com.reservation_system.model.Faculty(10, "researcher", "faculty", "", false);
        java.lang.String str57 = faculty56.getUserType();
        java.lang.String str58 = faculty56.getUserType();
        userRepository1.addUser((com.reservation_system.model.User) faculty56);
        java.lang.String str60 = faculty56.getEmail();
        java.lang.String str61 = faculty56.getUserType();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "Password1!" + "'", str17, "Password1!");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(userList27);
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "Password1!" + "'", str38, "Password1!");
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 101 + "'", int41 == 101);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 101 + "'", int45 == 101);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + true + "'", boolean47 == true);
        org.junit.Assert.assertNotNull(userList48);
        org.junit.Assert.assertEquals("'" + str57 + "' != '" + "Faculty" + "'", str57, "Faculty");
        org.junit.Assert.assertEquals("'" + str58 + "' != '" + "Faculty" + "'", str58, "Faculty");
        org.junit.Assert.assertEquals("'" + str60 + "' != '" + "faculty" + "'", str60, "faculty");
        org.junit.Assert.assertEquals("'" + str61 + "' != '" + "Faculty" + "'", str61, "Faculty");
    }

    @Test
    public void test0921() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0921");
        com.reservation_system.model.Faculty faculty5 = new com.reservation_system.model.Faculty(10, "researcher", "faculty", "", false);
        java.lang.String str6 = faculty5.getUserType();
        java.lang.String str7 = faculty5.getPassword();
        boolean boolean8 = faculty5.requiresDepartmentApproval();
        int int9 = faculty5.getID();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Faculty" + "'", str6, "Faculty");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10 + "'", int9 == 10);
    }

    @Test
    public void test0922() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0922");
        // The following exception was thrown during execution in test generation
        try {
            com.reservation_system.model.User user6 = com.reservation_system.patterns.factory.UserFactory.createUser("hi!", (int) (byte) 100, "Guest", "faculty", "", true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid user type: hi!");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0923() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0923");
        com.reservation_system.model.HeadLabCoordinator headLabCoordinator5 = new com.reservation_system.model.HeadLabCoordinator((int) 'a', "hi!", "andrew@example.com", "andrew@example.com", false);
        java.lang.String str6 = headLabCoordinator5.getPassword();
    }

    @Test
    public void test0924() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0924");
        com.reservation_system.model.LabManager labManager5 = new com.reservation_system.model.LabManager(10, "Researcher", "Password1!", "Andrew", false);
    }

    @Test
    public void test0925() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0925");
        com.reservation_system.model.Faculty faculty5 = new com.reservation_system.model.Faculty(102, "Guest", "Password1!", "faculty", false);
        java.lang.String str6 = faculty5.getName();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Guest" + "'", str6, "Guest");
    }

    @Test
    public void test0926() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0926");
        com.reservation_system.model.Researcher researcher5 = new com.reservation_system.model.Researcher((int) (short) -1, "faculty", "researcher", "hi!", true);
        java.lang.String str6 = researcher5.getUserType();
        java.lang.String str7 = researcher5.getEmail();
        java.lang.String str8 = researcher5.getEmail();
        java.lang.String str9 = researcher5.getUserType();
        researcher5.setApproved(false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Researcher" + "'", str6, "Researcher");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "researcher" + "'", str7, "researcher");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "researcher" + "'", str8, "researcher");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Researcher" + "'", str9, "Researcher");
    }

    @Test
    public void test0927() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0927");
        com.reservation_system.model.Guest guest5 = new com.reservation_system.model.Guest((int) (byte) 0, "researcher", "labmanager", "headlabcoordinator", true);
        java.lang.String str6 = guest5.getName();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "researcher" + "'", str6, "researcher");
    }

    @Test
    public void test0928() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0928");
        com.reservation_system.model.Guest guest5 = new com.reservation_system.model.Guest((int) (short) 0, "Guest", "headlabcoordinator", "", true);
        boolean boolean6 = guest5.requiresDepartmentApproval();
        java.lang.String str7 = guest5.getUserType();
        boolean boolean8 = guest5.requiresDepartmentApproval();
        java.lang.String str9 = guest5.getUserType();
        java.lang.String str10 = guest5.getUserType();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Guest" + "'", str7, "Guest");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Guest" + "'", str9, "Guest");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Guest" + "'", str10, "Guest");
    }

    @Test
    public void test0929() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0929");
        com.reservation_system.model.Faculty faculty5 = new com.reservation_system.model.Faculty((int) ' ', "", "guest", "Andrew", false);
        java.lang.String str6 = faculty5.getUserType();
        java.lang.String str7 = faculty5.getPassword();
        boolean boolean8 = faculty5.requiresDepartmentApproval();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Faculty" + "'", str6, "Faculty");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Andrew" + "'", str7, "Andrew");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test0930() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0930");
        com.reservation_system.model.LabManager labManager5 = new com.reservation_system.model.LabManager((int) (short) 0, "", "labmanager", "Password1!", true);
        boolean boolean6 = labManager5.requiresDepartmentApproval();
        boolean boolean7 = labManager5.requiresDepartmentApproval();
        boolean boolean8 = labManager5.isApproved();
        labManager5.setApproved(false);
        java.lang.String str11 = labManager5.getEmail();
        java.lang.String str12 = labManager5.getPassword();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "labmanager" + "'", str11, "labmanager");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Password1!" + "'", str12, "Password1!");
    }

    @Test
    public void test0931() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0931");
        com.reservation_system.model.LabManager labManager5 = new com.reservation_system.model.LabManager(1, "student", "", "Researcher", false);
        boolean boolean6 = labManager5.isApproved();
        java.lang.String str7 = labManager5.getUserType();
        java.lang.String str8 = labManager5.getName();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "labmanager" + "'", str7, "labmanager");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "student" + "'", str8, "student");
    }

    @Test
    public void test0932() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0932");
        com.reservation_system.model.LabManager labManager5 = new com.reservation_system.model.LabManager((int) (byte) 1, "faculty", "researcher", "guest", false);
        labManager5.setApproved(true);
    }

    @Test
    public void test0933() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0933");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("data/test-userrepo.csv");
        com.reservation_system.services.RegistrationService registrationService2 = new com.reservation_system.services.RegistrationService(userRepository1);
        com.reservation_system.model.Faculty faculty8 = new com.reservation_system.model.Faculty(0, "Password1!", "data/test-userrepo.csv", "researcher", false);
        java.lang.String str9 = faculty8.getName();
        userRepository1.addUser((com.reservation_system.model.User) faculty8);
        boolean boolean11 = userRepository1.headLabCoordinatorExists();
        com.reservation_system.model.Guest guest17 = new com.reservation_system.model.Guest((int) (byte) -1, "guest", "Researcher", "Faculty", true);
        userRepository1.addUser((com.reservation_system.model.User) guest17);
        boolean boolean19 = userRepository1.headLabCoordinatorExists();
        com.reservation_system.repository.UserRepository userRepository21 = new com.reservation_system.repository.UserRepository("data/test-userrepo.csv");
        int int22 = userRepository21.getNextID();
        int int23 = userRepository21.getNextID();
        boolean boolean25 = userRepository21.emailExists("faculty");
        java.util.List<com.reservation_system.model.User> userList26 = userRepository21.getAllUsers();
        userRepository1.saveAllUsers(userList26);
        boolean boolean28 = userRepository1.headLabCoordinatorExists();
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Password1!" + "'", str9, "Password1!");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 101 + "'", int22 == 101);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 101 + "'", int23 == 101);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertNotNull(userList26);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
    }

    @Test
    public void test0934() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0934");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("data/test-userrepo.csv");
        java.util.List<com.reservation_system.model.User> userList2 = userRepository1.getAllUsers();
        com.reservation_system.services.RegistrationService registrationService3 = new com.reservation_system.services.RegistrationService(userRepository1);
        java.util.List<com.reservation_system.model.User> userList4 = userRepository1.getAllUsers();
        boolean boolean6 = userRepository1.emailExists("Guest");
        java.util.List<com.reservation_system.model.User> userList7 = userRepository1.getAllUsers();
        boolean boolean8 = userRepository1.headLabCoordinatorExists();
        com.reservation_system.model.Faculty faculty14 = new com.reservation_system.model.Faculty((int) (short) 0, "guest", "Andrew", "guest", true);
        int int15 = faculty14.getID();
        boolean boolean16 = faculty14.isApproved();
        userRepository1.addUser((com.reservation_system.model.User) faculty14);
        boolean boolean18 = userRepository1.headLabCoordinatorExists();
        org.junit.Assert.assertNotNull(userList2);
        org.junit.Assert.assertNotNull(userList4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(userList7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test0935() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0935");
        com.reservation_system.model.Guest guest5 = new com.reservation_system.model.Guest(32, "Student", "Password1!", "hi!", false);
    }

    @Test
    public void test0936() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0936");
        com.reservation_system.model.Guest guest5 = new com.reservation_system.model.Guest((-1), "Student", "andrew@example.com", "faculty", false);
        boolean boolean6 = guest5.isApproved();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test0937() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0937");
        com.reservation_system.model.Faculty faculty5 = new com.reservation_system.model.Faculty((int) (byte) -1, "Password1!", "guest", "faculty", true);
    }

    @Test
    public void test0938() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0938");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("data/test-userrepo.csv");
        boolean boolean2 = userRepository1.headLabCoordinatorExists();
        com.reservation_system.services.RegistrationService registrationService3 = new com.reservation_system.services.RegistrationService(userRepository1);
        boolean boolean4 = userRepository1.headLabCoordinatorExists();
        boolean boolean5 = userRepository1.headLabCoordinatorExists();
        com.reservation_system.repository.UserRepository userRepository7 = new com.reservation_system.repository.UserRepository("data/test-userrepo.csv");
        com.reservation_system.services.RegistrationService registrationService8 = new com.reservation_system.services.RegistrationService(userRepository7);
        com.reservation_system.model.Faculty faculty14 = new com.reservation_system.model.Faculty(0, "Password1!", "data/test-userrepo.csv", "researcher", false);
        java.lang.String str15 = faculty14.getName();
        userRepository7.addUser((com.reservation_system.model.User) faculty14);
        boolean boolean17 = userRepository7.headLabCoordinatorExists();
        int int18 = userRepository7.getNextID();
        com.reservation_system.repository.UserRepository userRepository20 = new com.reservation_system.repository.UserRepository("data/test-userrepo.csv");
        java.util.List<com.reservation_system.model.User> userList21 = userRepository20.getAllUsers();
        com.reservation_system.services.RegistrationService registrationService22 = new com.reservation_system.services.RegistrationService(userRepository20);
        java.util.List<com.reservation_system.model.User> userList23 = userRepository20.getAllUsers();
        userRepository7.saveAllUsers(userList23);
        userRepository1.saveAllUsers(userList23);
        java.util.List<com.reservation_system.model.User> userList26 = userRepository1.getAllUsers();
        com.reservation_system.model.Student student32 = new com.reservation_system.model.Student(32, "Faculty", "andrew@example.com", "Researcher", false);
        userRepository1.addUser((com.reservation_system.model.User) student32);
        java.lang.Class<?> wildcardClass34 = userRepository1.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Password1!" + "'", str15, "Password1!");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 101 + "'", int18 == 101);
        org.junit.Assert.assertNotNull(userList21);
        org.junit.Assert.assertNotNull(userList23);
        org.junit.Assert.assertNotNull(userList26);
        org.junit.Assert.assertNotNull(wildcardClass34);
    }

    @Test
    public void test0939() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0939");
        // The following exception was thrown during execution in test generation
        try {
            com.reservation_system.model.User user6 = com.reservation_system.patterns.factory.UserFactory.createUser("Password1!", 52, "hi!", "guest", "researcher", true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid user type: Password1!");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0940() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0940");
        com.reservation_system.model.User user6 = com.reservation_system.patterns.factory.UserFactory.createUser("headlabcoordinator", (int) (byte) 100, "Researcher", "student", "Password1!", false);
        user6.setApproved(false);
        org.junit.Assert.assertNotNull(user6);
    }

    @Test
    public void test0941() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0941");
        com.reservation_system.model.Faculty faculty5 = new com.reservation_system.model.Faculty((int) 'a', "Password1!", "andrew@example.com", "Andrew", true);
        java.lang.String str6 = faculty5.getPassword();
        faculty5.setApproved(false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Andrew" + "'", str6, "Andrew");
    }

    @Test
    public void test0942() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0942");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("data/test-userrepo.csv");
        boolean boolean2 = userRepository1.headLabCoordinatorExists();
        com.reservation_system.services.RegistrationService registrationService3 = new com.reservation_system.services.RegistrationService(userRepository1);
        boolean boolean5 = userRepository1.emailExists("");
        com.reservation_system.repository.UserRepository userRepository7 = new com.reservation_system.repository.UserRepository("data/test-userrepo.csv");
        com.reservation_system.services.RegistrationService registrationService8 = new com.reservation_system.services.RegistrationService(userRepository7);
        com.reservation_system.model.Faculty faculty14 = new com.reservation_system.model.Faculty(0, "Password1!", "data/test-userrepo.csv", "researcher", false);
        java.lang.String str15 = faculty14.getName();
        userRepository7.addUser((com.reservation_system.model.User) faculty14);
        java.util.List<com.reservation_system.model.User> userList17 = userRepository7.getAllUsers();
        userRepository1.saveAllUsers(userList17);
        java.lang.Class<?> wildcardClass19 = userList17.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Password1!" + "'", str15, "Password1!");
        org.junit.Assert.assertNotNull(userList17);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test0943() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0943");
        com.reservation_system.model.Student student5 = new com.reservation_system.model.Student(32, "Faculty", "andrew@example.com", "Researcher", false);
        boolean boolean6 = student5.requiresDepartmentApproval();
        java.lang.String str7 = student5.getUserType();
        student5.setApproved(true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Student" + "'", str7, "Student");
    }

    @Test
    public void test0944() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0944");
        com.reservation_system.model.Faculty faculty5 = new com.reservation_system.model.Faculty((int) (short) 0, "hi!", "Password1!", "", false);
        boolean boolean6 = faculty5.isApproved();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test0945() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0945");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("data/test-userrepo.csv");
        int int2 = userRepository1.getNextID();
        int int3 = userRepository1.getNextID();
        boolean boolean5 = userRepository1.emailExists("faculty");
        com.reservation_system.model.LabManager labManager11 = new com.reservation_system.model.LabManager((int) (short) 0, "", "labmanager", "Password1!", true);
        userRepository1.addUser((com.reservation_system.model.User) labManager11);
        java.util.Optional<com.reservation_system.model.User> userOptional14 = userRepository1.findByEmail("");
        com.reservation_system.model.Researcher researcher20 = new com.reservation_system.model.Researcher((int) (byte) 100, "Password1!", "Password1!", "headlabcoordinator", true);
        userRepository1.addUser((com.reservation_system.model.User) researcher20);
        java.util.List<com.reservation_system.model.User> userList22 = userRepository1.getAllUsers();
        com.reservation_system.model.Researcher researcher28 = new com.reservation_system.model.Researcher((int) (short) -1, "headlabcoordinator", "Guest", "student", false);
        userRepository1.addUser((com.reservation_system.model.User) researcher28);
        com.reservation_system.repository.UserRepository userRepository31 = new com.reservation_system.repository.UserRepository("data/test-userrepo.csv");
        com.reservation_system.services.RegistrationService registrationService32 = new com.reservation_system.services.RegistrationService(userRepository31);
        com.reservation_system.model.Faculty faculty38 = new com.reservation_system.model.Faculty(0, "Password1!", "data/test-userrepo.csv", "researcher", false);
        java.lang.String str39 = faculty38.getName();
        userRepository31.addUser((com.reservation_system.model.User) faculty38);
        boolean boolean41 = userRepository31.headLabCoordinatorExists();
        com.reservation_system.services.RegistrationService registrationService42 = new com.reservation_system.services.RegistrationService(userRepository31);
        java.util.List<com.reservation_system.model.User> userList43 = userRepository31.getAllUsers();
        userRepository1.saveAllUsers(userList43);
        com.reservation_system.model.Guest guest50 = new com.reservation_system.model.Guest((int) ' ', "student", "Password1!", "Researcher", true);
        userRepository1.addUser((com.reservation_system.model.User) guest50);
        com.reservation_system.services.RegistrationService registrationService52 = new com.reservation_system.services.RegistrationService(userRepository1);
        boolean boolean53 = userRepository1.headLabCoordinatorExists();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 101 + "'", int2 == 101);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 101 + "'", int3 == 101);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(userOptional14);
        org.junit.Assert.assertNotNull(userList22);
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "Password1!" + "'", str39, "Password1!");
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertNotNull(userList43);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
    }

    @Test
    public void test0946() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0946");
        com.reservation_system.model.User user6 = com.reservation_system.patterns.factory.UserFactory.createUser("labmanager", (int) '4', "Faculty", "", "", true);
        org.junit.Assert.assertNotNull(user6);
    }

    @Test
    public void test0947() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0947");
        com.reservation_system.model.HeadLabCoordinator headLabCoordinator5 = new com.reservation_system.model.HeadLabCoordinator(97, "researcher", "headlabcoordinator", "", false);
    }

    @Test
    public void test0948() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0948");
        com.reservation_system.model.Faculty faculty5 = new com.reservation_system.model.Faculty((int) (byte) -1, "andrew@example.com", "Researcher", "Password1!", false);
    }

    @Test
    public void test0949() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0949");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("data/test-userrepo.csv");
        com.reservation_system.services.RegistrationService registrationService2 = new com.reservation_system.services.RegistrationService(userRepository1);
        boolean boolean4 = userRepository1.emailExists("Password1!");
        boolean boolean6 = userRepository1.emailExists("Password1!");
        boolean boolean8 = userRepository1.emailExists("andrew@example.com");
        int int9 = userRepository1.getNextID();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 101 + "'", int9 == 101);
    }

    @Test
    public void test0950() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0950");
        com.reservation_system.model.Student student5 = new com.reservation_system.model.Student((int) (short) 1, "Researcher", "", "andrew@example.com", true);
    }

    @Test
    public void test0951() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0951");
        com.reservation_system.model.Faculty faculty5 = new com.reservation_system.model.Faculty(10, "researcher", "faculty", "", false);
        java.lang.String str6 = faculty5.getEmail();
        java.lang.String str7 = faculty5.getUserType();
        faculty5.setApproved(false);
        int int10 = faculty5.getID();
        boolean boolean11 = faculty5.requiresDepartmentApproval();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "faculty" + "'", str6, "faculty");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Faculty" + "'", str7, "Faculty");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 10 + "'", int10 == 10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test0952() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0952");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("data/test-userrepo.csv");
        boolean boolean2 = userRepository1.headLabCoordinatorExists();
        com.reservation_system.services.RegistrationService registrationService3 = new com.reservation_system.services.RegistrationService(userRepository1);
        boolean boolean5 = userRepository1.emailExists("");
        boolean boolean6 = userRepository1.headLabCoordinatorExists();
        java.util.List<com.reservation_system.model.User> userList7 = userRepository1.getAllUsers();
        int int8 = userRepository1.getNextID();
        com.reservation_system.repository.UserRepository userRepository10 = new com.reservation_system.repository.UserRepository("data/test-userrepo.csv");
        com.reservation_system.services.RegistrationService registrationService11 = new com.reservation_system.services.RegistrationService(userRepository10);
        com.reservation_system.model.Faculty faculty17 = new com.reservation_system.model.Faculty(0, "Password1!", "data/test-userrepo.csv", "researcher", false);
        java.lang.String str18 = faculty17.getName();
        userRepository10.addUser((com.reservation_system.model.User) faculty17);
        com.reservation_system.services.RegistrationService registrationService20 = new com.reservation_system.services.RegistrationService(userRepository10);
        com.reservation_system.services.RegistrationService registrationService21 = new com.reservation_system.services.RegistrationService(userRepository10);
        com.reservation_system.services.RegistrationService registrationService22 = new com.reservation_system.services.RegistrationService(userRepository10);
        com.reservation_system.repository.UserRepository userRepository24 = new com.reservation_system.repository.UserRepository("data/test-userrepo.csv");
        int int25 = userRepository24.getNextID();
        int int26 = userRepository24.getNextID();
        boolean boolean28 = userRepository24.emailExists("faculty");
        java.util.Optional<com.reservation_system.model.User> userOptional30 = userRepository24.findByEmail("");
        com.reservation_system.repository.UserRepository userRepository32 = new com.reservation_system.repository.UserRepository("data/test-userrepo.csv");
        java.util.List<com.reservation_system.model.User> userList33 = userRepository32.getAllUsers();
        java.util.List<com.reservation_system.model.User> userList34 = userRepository32.getAllUsers();
        userRepository24.saveAllUsers(userList34);
        userRepository10.saveAllUsers(userList34);
        userRepository1.saveAllUsers(userList34);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(userList7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 101 + "'", int8 == 101);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Password1!" + "'", str18, "Password1!");
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 101 + "'", int25 == 101);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 101 + "'", int26 == 101);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertNotNull(userOptional30);
        org.junit.Assert.assertNotNull(userList33);
        org.junit.Assert.assertNotNull(userList34);
    }

    @Test
    public void test0953() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0953");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("data/test-userrepo.csv");
        boolean boolean2 = userRepository1.headLabCoordinatorExists();
        com.reservation_system.services.RegistrationService registrationService3 = new com.reservation_system.services.RegistrationService(userRepository1);
        boolean boolean5 = userRepository1.emailExists("");
        java.util.Optional<com.reservation_system.model.User> userOptional7 = userRepository1.findByEmail("");
        java.util.Optional<com.reservation_system.model.User> userOptional9 = userRepository1.findByEmail("hi!");
        com.reservation_system.services.RegistrationService registrationService10 = new com.reservation_system.services.RegistrationService(userRepository1);
        com.reservation_system.services.RegistrationService registrationService11 = new com.reservation_system.services.RegistrationService(userRepository1);
        // The following exception was thrown during execution in test generation
        try {
            com.reservation_system.model.User user16 = registrationService11.registerUser("Faculty", "headlabcoordinator", "Student", "student");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid email format.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(userOptional7);
        org.junit.Assert.assertNotNull(userOptional9);
    }

    @Test
    public void test0954() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0954");
        com.reservation_system.model.HeadLabCoordinator headLabCoordinator5 = new com.reservation_system.model.HeadLabCoordinator(1, "student", "Researcher", "", false);
        java.lang.String str6 = headLabCoordinator5.getUserType();
        java.lang.String str7 = headLabCoordinator5.getUserType();
        java.lang.String str8 = headLabCoordinator5.getUserType();
        java.lang.String str9 = headLabCoordinator5.getPassword();
        int int10 = headLabCoordinator5.getID();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "headlabcoordinator" + "'", str6, "headlabcoordinator");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "headlabcoordinator" + "'", str7, "headlabcoordinator");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "headlabcoordinator" + "'", str8, "headlabcoordinator");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
    }

    @Test
    public void test0955() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0955");
        // The following exception was thrown during execution in test generation
        try {
            com.reservation_system.model.User user6 = com.reservation_system.patterns.factory.UserFactory.createUser("andrew@example.com", 100, "Student", "Guest", "hi!", false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid user type: andrew@example.com");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0956() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0956");
        com.reservation_system.model.Student student5 = new com.reservation_system.model.Student(100, "Password1!", "Student", "Andrew", true);
        int int6 = student5.getID();
        java.lang.String str7 = student5.getUserType();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Student" + "'", str7, "Student");
    }

    @Test
    public void test0957() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0957");
        com.reservation_system.model.Student student5 = new com.reservation_system.model.Student(101, "Researcher", "data/test-userrepo.csv", "data/test-userrepo.csv", true);
        student5.setApproved(true);
    }

    @Test
    public void test0958() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0958");
        com.reservation_system.model.Researcher researcher5 = new com.reservation_system.model.Researcher((int) (short) 100, "Researcher", "student", "Andrew", true);
    }

    @Test
    public void test0959() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0959");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("data/test-userrepo.csv");
        com.reservation_system.services.RegistrationService registrationService2 = new com.reservation_system.services.RegistrationService(userRepository1);
        com.reservation_system.model.Faculty faculty8 = new com.reservation_system.model.Faculty(0, "Password1!", "data/test-userrepo.csv", "researcher", false);
        java.lang.String str9 = faculty8.getName();
        userRepository1.addUser((com.reservation_system.model.User) faculty8);
        boolean boolean11 = userRepository1.headLabCoordinatorExists();
        com.reservation_system.model.Guest guest17 = new com.reservation_system.model.Guest((int) (byte) -1, "guest", "Researcher", "Faculty", true);
        userRepository1.addUser((com.reservation_system.model.User) guest17);
        boolean boolean20 = userRepository1.emailExists("Password1!");
        boolean boolean22 = userRepository1.emailExists("researcher");
        com.reservation_system.model.HeadLabCoordinator headLabCoordinator28 = new com.reservation_system.model.HeadLabCoordinator(1, "student", "Researcher", "", false);
        java.lang.String str29 = headLabCoordinator28.getUserType();
        userRepository1.addUser((com.reservation_system.model.User) headLabCoordinator28);
        java.lang.String str31 = headLabCoordinator28.getUserType();
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Password1!" + "'", str9, "Password1!");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "headlabcoordinator" + "'", str29, "headlabcoordinator");
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "headlabcoordinator" + "'", str31, "headlabcoordinator");
    }

    @Test
    public void test0960() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0960");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("data/test-userrepo.csv");
        com.reservation_system.services.RegistrationService registrationService2 = new com.reservation_system.services.RegistrationService(userRepository1);
        com.reservation_system.model.Faculty faculty8 = new com.reservation_system.model.Faculty(0, "Password1!", "data/test-userrepo.csv", "researcher", false);
        java.lang.String str9 = faculty8.getName();
        userRepository1.addUser((com.reservation_system.model.User) faculty8);
        boolean boolean12 = userRepository1.emailExists("Faculty");
        int int13 = userRepository1.getNextID();
        com.reservation_system.services.RegistrationService registrationService14 = new com.reservation_system.services.RegistrationService(userRepository1);
        java.util.Optional<com.reservation_system.model.User> userOptional16 = userRepository1.findByEmail("Andrew");
        int int17 = userRepository1.getNextID();
        com.reservation_system.model.Researcher researcher23 = new com.reservation_system.model.Researcher((int) (short) -1, "faculty", "researcher", "hi!", true);
        researcher23.setApproved(false);
        java.lang.String str26 = researcher23.getEmail();
        userRepository1.addUser((com.reservation_system.model.User) researcher23);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Password1!" + "'", str9, "Password1!");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 101 + "'", int13 == 101);
        org.junit.Assert.assertNotNull(userOptional16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 101 + "'", int17 == 101);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "researcher" + "'", str26, "researcher");
    }

    @Test
    public void test0961() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0961");
        com.reservation_system.model.HeadLabCoordinator headLabCoordinator5 = new com.reservation_system.model.HeadLabCoordinator(1, "headlabcoordinator", "labmanager", "Researcher", true);
        java.lang.String str6 = headLabCoordinator5.getUserType();
        int int7 = headLabCoordinator5.getID();
        java.lang.String str8 = headLabCoordinator5.getUserType();
        java.lang.String str9 = headLabCoordinator5.getName();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "headlabcoordinator" + "'", str6, "headlabcoordinator");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "headlabcoordinator" + "'", str8, "headlabcoordinator");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "headlabcoordinator" + "'", str9, "headlabcoordinator");
    }

    @Test
    public void test0962() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0962");
        com.reservation_system.model.Student student5 = new com.reservation_system.model.Student(0, "Student", "Faculty", "hi!", false);
        java.lang.String str6 = student5.getEmail();
        int int7 = student5.getID();
        java.lang.String str8 = student5.getUserType();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Faculty" + "'", str6, "Faculty");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Student" + "'", str8, "Student");
    }

    @Test
    public void test0963() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0963");
        com.reservation_system.model.Student student5 = new com.reservation_system.model.Student((int) (short) 1, "andrew@example.com", "researcher", "headlabcoordinator", false);
    }

    @Test
    public void test0964() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0964");
        com.reservation_system.model.Researcher researcher5 = new com.reservation_system.model.Researcher((int) (short) 0, "Andrew", "Researcher", "data/test-userrepo.csv", false);
        java.lang.String str6 = researcher5.getUserType();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Researcher" + "'", str6, "Researcher");
    }

    @Test
    public void test0965() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0965");
        com.reservation_system.model.LabManager labManager5 = new com.reservation_system.model.LabManager((int) (short) 100, "student", "faculty", "Researcher", true);
    }

    @Test
    public void test0966() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0966");
        // The following exception was thrown during execution in test generation
        try {
            com.reservation_system.model.User user6 = com.reservation_system.patterns.factory.UserFactory.createUser("hi!", (int) (short) 1, "researcher", "andrew@example.com", "headlabcoordinator", false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid user type: hi!");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0967() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0967");
        com.reservation_system.model.Guest guest5 = new com.reservation_system.model.Guest((int) (byte) 100, "andrew@example.com", "student", "Researcher", false);
        java.lang.String str6 = guest5.getEmail();
        java.lang.String str7 = guest5.getUserType();
        guest5.setApproved(false);
        java.lang.String str10 = guest5.getUserType();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "student" + "'", str6, "student");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Guest" + "'", str7, "Guest");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Guest" + "'", str10, "Guest");
    }

    @Test
    public void test0968() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0968");
        com.reservation_system.model.Student student5 = new com.reservation_system.model.Student(0, "Student", "Faculty", "hi!", false);
        java.lang.String str6 = student5.getEmail();
        java.lang.String str7 = student5.getUserType();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Faculty" + "'", str6, "Faculty");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Student" + "'", str7, "Student");
    }

    @Test
    public void test0969() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0969");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("data/test-userrepo.csv");
        boolean boolean2 = userRepository1.headLabCoordinatorExists();
        java.util.Optional<com.reservation_system.model.User> userOptional4 = userRepository1.findByEmail("data/test-userrepo.csv");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(userOptional4);
    }

    @Test
    public void test0970() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0970");
        com.reservation_system.model.HeadLabCoordinator headLabCoordinator5 = new com.reservation_system.model.HeadLabCoordinator(32, "", "", "hi!", true);
    }

    @Test
    public void test0971() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0971");
        com.reservation_system.model.Researcher researcher5 = new com.reservation_system.model.Researcher((int) 'a', "Researcher", "", "student", false);
        java.lang.String str6 = researcher5.getEmail();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
    }

    @Test
    public void test0972() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0972");
        com.reservation_system.model.Student student5 = new com.reservation_system.model.Student((int) (short) 0, "researcher", "headlabcoordinator", "researcher", false);
        java.lang.String str6 = student5.getUserType();
        java.lang.Class<?> wildcardClass7 = student5.getClass();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Student" + "'", str6, "Student");
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0973() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0973");
        // The following exception was thrown during execution in test generation
        try {
            com.reservation_system.model.User user6 = com.reservation_system.patterns.factory.UserFactory.createUser("Andrew", (int) (byte) 0, "", "Student", "Student", false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid user type: Andrew");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0974() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0974");
        com.reservation_system.model.HeadLabCoordinator headLabCoordinator5 = new com.reservation_system.model.HeadLabCoordinator((int) (short) 10, "researcher", "student", "Faculty", false);
        java.lang.String str6 = headLabCoordinator5.getUserType();
        java.lang.String str7 = headLabCoordinator5.getUserType();
        java.lang.String str8 = headLabCoordinator5.getUserType();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "headlabcoordinator" + "'", str6, "headlabcoordinator");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "headlabcoordinator" + "'", str7, "headlabcoordinator");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "headlabcoordinator" + "'", str8, "headlabcoordinator");
    }

    @Test
    public void test0975() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0975");
        com.reservation_system.model.Faculty faculty5 = new com.reservation_system.model.Faculty((int) (short) -1, "student", "Faculty", "faculty", true);
        java.lang.String str6 = faculty5.getUserType();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Faculty" + "'", str6, "Faculty");
    }

    @Test
    public void test0976() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0976");
        com.reservation_system.model.Faculty faculty5 = new com.reservation_system.model.Faculty((int) ' ', "", "Faculty", "data/test-userrepo.csv", false);
        java.lang.String str6 = faculty5.getUserType();
        java.lang.String str7 = faculty5.getUserType();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Faculty" + "'", str6, "Faculty");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Faculty" + "'", str7, "Faculty");
    }

    @Test
    public void test0977() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0977");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("data/test-userrepo.csv");
        com.reservation_system.services.RegistrationService registrationService2 = new com.reservation_system.services.RegistrationService(userRepository1);
        com.reservation_system.model.Faculty faculty8 = new com.reservation_system.model.Faculty(0, "Password1!", "data/test-userrepo.csv", "researcher", false);
        java.lang.String str9 = faculty8.getName();
        userRepository1.addUser((com.reservation_system.model.User) faculty8);
        boolean boolean11 = userRepository1.headLabCoordinatorExists();
        boolean boolean13 = userRepository1.emailExists("guest");
        com.reservation_system.repository.UserRepository userRepository15 = new com.reservation_system.repository.UserRepository("data/test-userrepo.csv");
        com.reservation_system.services.RegistrationService registrationService16 = new com.reservation_system.services.RegistrationService(userRepository15);
        com.reservation_system.model.Faculty faculty22 = new com.reservation_system.model.Faculty(0, "Password1!", "data/test-userrepo.csv", "researcher", false);
        java.lang.String str23 = faculty22.getName();
        userRepository15.addUser((com.reservation_system.model.User) faculty22);
        boolean boolean25 = userRepository15.headLabCoordinatorExists();
        com.reservation_system.model.Guest guest31 = new com.reservation_system.model.Guest((int) (byte) -1, "guest", "Researcher", "Faculty", true);
        userRepository15.addUser((com.reservation_system.model.User) guest31);
        boolean boolean34 = userRepository15.emailExists("Password1!");
        boolean boolean36 = userRepository15.emailExists("hi!");
        int int37 = userRepository15.getNextID();
        com.reservation_system.repository.UserRepository userRepository39 = new com.reservation_system.repository.UserRepository("data/test-userrepo.csv");
        boolean boolean40 = userRepository39.headLabCoordinatorExists();
        com.reservation_system.services.RegistrationService registrationService41 = new com.reservation_system.services.RegistrationService(userRepository39);
        boolean boolean42 = userRepository39.headLabCoordinatorExists();
        boolean boolean43 = userRepository39.headLabCoordinatorExists();
        com.reservation_system.repository.UserRepository userRepository45 = new com.reservation_system.repository.UserRepository("data/test-userrepo.csv");
        com.reservation_system.services.RegistrationService registrationService46 = new com.reservation_system.services.RegistrationService(userRepository45);
        com.reservation_system.model.Faculty faculty52 = new com.reservation_system.model.Faculty(0, "Password1!", "data/test-userrepo.csv", "researcher", false);
        java.lang.String str53 = faculty52.getName();
        userRepository45.addUser((com.reservation_system.model.User) faculty52);
        boolean boolean55 = userRepository45.headLabCoordinatorExists();
        int int56 = userRepository45.getNextID();
        com.reservation_system.repository.UserRepository userRepository58 = new com.reservation_system.repository.UserRepository("data/test-userrepo.csv");
        java.util.List<com.reservation_system.model.User> userList59 = userRepository58.getAllUsers();
        com.reservation_system.services.RegistrationService registrationService60 = new com.reservation_system.services.RegistrationService(userRepository58);
        java.util.List<com.reservation_system.model.User> userList61 = userRepository58.getAllUsers();
        userRepository45.saveAllUsers(userList61);
        userRepository39.saveAllUsers(userList61);
        userRepository15.saveAllUsers(userList61);
        userRepository1.saveAllUsers(userList61);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Password1!" + "'", str9, "Password1!");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "Password1!" + "'", str23, "Password1!");
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 101 + "'", int37 == 101);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + true + "'", boolean40 == true);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + true + "'", boolean42 == true);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + true + "'", boolean43 == true);
        org.junit.Assert.assertEquals("'" + str53 + "' != '" + "Password1!" + "'", str53, "Password1!");
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + true + "'", boolean55 == true);
        org.junit.Assert.assertTrue("'" + int56 + "' != '" + 101 + "'", int56 == 101);
        org.junit.Assert.assertNotNull(userList59);
        org.junit.Assert.assertNotNull(userList61);
    }

    @Test
    public void test0978() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0978");
        com.reservation_system.model.LabManager labManager5 = new com.reservation_system.model.LabManager((int) '#', "", "headlabcoordinator", "Researcher", false);
        java.lang.Class<?> wildcardClass6 = labManager5.getClass();
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0979() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0979");
        com.reservation_system.model.User user6 = com.reservation_system.patterns.factory.UserFactory.createUser("guest", 0, "", "Student", "hi!", false);
        org.junit.Assert.assertNotNull(user6);
    }

    @Test
    public void test0980() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0980");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("data/test-userrepo.csv");
        java.util.List<com.reservation_system.model.User> userList2 = userRepository1.getAllUsers();
        com.reservation_system.services.RegistrationService registrationService3 = new com.reservation_system.services.RegistrationService(userRepository1);
        com.reservation_system.services.RegistrationService registrationService4 = new com.reservation_system.services.RegistrationService(userRepository1);
        java.util.Optional<com.reservation_system.model.User> userOptional6 = userRepository1.findByEmail("andrew@example.com");
        java.util.List<com.reservation_system.model.User> userList7 = userRepository1.getAllUsers();
        boolean boolean9 = userRepository1.emailExists("data/test-userrepo.csv");
        com.reservation_system.services.RegistrationService registrationService10 = new com.reservation_system.services.RegistrationService(userRepository1);
        // The following exception was thrown during execution in test generation
        try {
            com.reservation_system.model.User user15 = registrationService10.registerUser("", "student", "Password1!", "Faculty");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid user type.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(userList2);
        org.junit.Assert.assertNotNull(userOptional6);
        org.junit.Assert.assertNotNull(userList7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test0981() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0981");
        com.reservation_system.model.Student student5 = new com.reservation_system.model.Student((int) (short) 10, "guest", "", "", true);
        java.lang.String str6 = student5.getUserType();
        student5.setApproved(false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Student" + "'", str6, "Student");
    }

    @Test
    public void test0982() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0982");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("data/test-userrepo.csv");
        com.reservation_system.services.RegistrationService registrationService2 = new com.reservation_system.services.RegistrationService(userRepository1);
        com.reservation_system.services.RegistrationService registrationService3 = new com.reservation_system.services.RegistrationService(userRepository1);
        boolean boolean5 = userRepository1.emailExists("faculty");
        java.util.Optional<com.reservation_system.model.User> userOptional7 = userRepository1.findByEmail("researcher");
        boolean boolean8 = userRepository1.headLabCoordinatorExists();
        boolean boolean9 = userRepository1.headLabCoordinatorExists();
        com.reservation_system.services.RegistrationService registrationService10 = new com.reservation_system.services.RegistrationService(userRepository1);
        int int11 = userRepository1.getNextID();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(userOptional7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 101 + "'", int11 == 101);
    }

    @Test
    public void test0983() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0983");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("data/test-userrepo.csv");
        int int2 = userRepository1.getNextID();
        int int3 = userRepository1.getNextID();
        boolean boolean5 = userRepository1.emailExists("faculty");
        com.reservation_system.model.LabManager labManager11 = new com.reservation_system.model.LabManager((int) (short) 0, "", "labmanager", "Password1!", true);
        userRepository1.addUser((com.reservation_system.model.User) labManager11);
        java.util.Optional<com.reservation_system.model.User> userOptional14 = userRepository1.findByEmail("");
        com.reservation_system.model.Researcher researcher20 = new com.reservation_system.model.Researcher((int) (byte) 100, "Password1!", "Password1!", "headlabcoordinator", true);
        userRepository1.addUser((com.reservation_system.model.User) researcher20);
        java.util.List<com.reservation_system.model.User> userList22 = userRepository1.getAllUsers();
        com.reservation_system.model.Researcher researcher28 = new com.reservation_system.model.Researcher((int) (short) -1, "headlabcoordinator", "Guest", "student", false);
        userRepository1.addUser((com.reservation_system.model.User) researcher28);
        com.reservation_system.repository.UserRepository userRepository31 = new com.reservation_system.repository.UserRepository("data/test-userrepo.csv");
        com.reservation_system.services.RegistrationService registrationService32 = new com.reservation_system.services.RegistrationService(userRepository31);
        com.reservation_system.model.Faculty faculty38 = new com.reservation_system.model.Faculty(0, "Password1!", "data/test-userrepo.csv", "researcher", false);
        java.lang.String str39 = faculty38.getName();
        userRepository31.addUser((com.reservation_system.model.User) faculty38);
        boolean boolean41 = userRepository31.headLabCoordinatorExists();
        com.reservation_system.services.RegistrationService registrationService42 = new com.reservation_system.services.RegistrationService(userRepository31);
        java.util.List<com.reservation_system.model.User> userList43 = userRepository31.getAllUsers();
        userRepository1.saveAllUsers(userList43);
        com.reservation_system.repository.UserRepository userRepository46 = new com.reservation_system.repository.UserRepository("data/test-userrepo.csv");
        com.reservation_system.services.RegistrationService registrationService47 = new com.reservation_system.services.RegistrationService(userRepository46);
        com.reservation_system.model.Faculty faculty53 = new com.reservation_system.model.Faculty(0, "Password1!", "data/test-userrepo.csv", "researcher", false);
        java.lang.String str54 = faculty53.getName();
        userRepository46.addUser((com.reservation_system.model.User) faculty53);
        boolean boolean56 = userRepository46.headLabCoordinatorExists();
        com.reservation_system.model.Guest guest62 = new com.reservation_system.model.Guest((int) (byte) -1, "guest", "Researcher", "Faculty", true);
        userRepository46.addUser((com.reservation_system.model.User) guest62);
        boolean boolean64 = userRepository46.headLabCoordinatorExists();
        com.reservation_system.repository.UserRepository userRepository66 = new com.reservation_system.repository.UserRepository("data/test-userrepo.csv");
        int int67 = userRepository66.getNextID();
        int int68 = userRepository66.getNextID();
        boolean boolean70 = userRepository66.emailExists("faculty");
        java.util.List<com.reservation_system.model.User> userList71 = userRepository66.getAllUsers();
        userRepository46.saveAllUsers(userList71);
        userRepository1.saveAllUsers(userList71);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 101 + "'", int2 == 101);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 101 + "'", int3 == 101);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(userOptional14);
        org.junit.Assert.assertNotNull(userList22);
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "Password1!" + "'", str39, "Password1!");
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + true + "'", boolean41 == true);
        org.junit.Assert.assertNotNull(userList43);
        org.junit.Assert.assertEquals("'" + str54 + "' != '" + "Password1!" + "'", str54, "Password1!");
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + true + "'", boolean56 == true);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + true + "'", boolean64 == true);
        org.junit.Assert.assertTrue("'" + int67 + "' != '" + 101 + "'", int67 == 101);
        org.junit.Assert.assertTrue("'" + int68 + "' != '" + 101 + "'", int68 == 101);
        org.junit.Assert.assertTrue("'" + boolean70 + "' != '" + true + "'", boolean70 == true);
        org.junit.Assert.assertNotNull(userList71);
    }

    @Test
    public void test0984() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0984");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("data/test-userrepo.csv");
        com.reservation_system.services.RegistrationService registrationService2 = new com.reservation_system.services.RegistrationService(userRepository1);
        com.reservation_system.services.RegistrationService registrationService3 = new com.reservation_system.services.RegistrationService(userRepository1);
        // The following exception was thrown during execution in test generation
        try {
            com.reservation_system.model.User user8 = registrationService3.registerUser("headlabcoordinator", "Researcher", "Researcher", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: A head lab coordinator account already exists.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0985() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0985");
        com.reservation_system.model.Student student5 = new com.reservation_system.model.Student((int) '#', "labmanager", "Password1!", "student", false);
        java.lang.Class<?> wildcardClass6 = student5.getClass();
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0986() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0986");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("data/test-userrepo.csv");
        com.reservation_system.services.RegistrationService registrationService2 = new com.reservation_system.services.RegistrationService(userRepository1);
        com.reservation_system.model.Faculty faculty8 = new com.reservation_system.model.Faculty(0, "Password1!", "data/test-userrepo.csv", "researcher", false);
        java.lang.String str9 = faculty8.getName();
        userRepository1.addUser((com.reservation_system.model.User) faculty8);
        boolean boolean11 = userRepository1.headLabCoordinatorExists();
        com.reservation_system.model.Guest guest17 = new com.reservation_system.model.Guest((int) (byte) -1, "guest", "Researcher", "Faculty", true);
        userRepository1.addUser((com.reservation_system.model.User) guest17);
        boolean boolean19 = userRepository1.headLabCoordinatorExists();
        com.reservation_system.repository.UserRepository userRepository21 = new com.reservation_system.repository.UserRepository("data/test-userrepo.csv");
        com.reservation_system.services.RegistrationService registrationService22 = new com.reservation_system.services.RegistrationService(userRepository21);
        com.reservation_system.model.Faculty faculty28 = new com.reservation_system.model.Faculty(0, "Password1!", "data/test-userrepo.csv", "researcher", false);
        java.lang.String str29 = faculty28.getName();
        userRepository21.addUser((com.reservation_system.model.User) faculty28);
        boolean boolean31 = userRepository21.headLabCoordinatorExists();
        com.reservation_system.repository.UserRepository userRepository33 = new com.reservation_system.repository.UserRepository("data/test-userrepo.csv");
        com.reservation_system.services.RegistrationService registrationService34 = new com.reservation_system.services.RegistrationService(userRepository33);
        com.reservation_system.model.Faculty faculty40 = new com.reservation_system.model.Faculty(0, "Password1!", "data/test-userrepo.csv", "researcher", false);
        java.lang.String str41 = faculty40.getName();
        userRepository33.addUser((com.reservation_system.model.User) faculty40);
        java.util.List<com.reservation_system.model.User> userList43 = userRepository33.getAllUsers();
        userRepository21.saveAllUsers(userList43);
        userRepository1.saveAllUsers(userList43);
        boolean boolean46 = userRepository1.headLabCoordinatorExists();
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Password1!" + "'", str9, "Password1!");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "Password1!" + "'", str29, "Password1!");
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "Password1!" + "'", str41, "Password1!");
        org.junit.Assert.assertNotNull(userList43);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + true + "'", boolean46 == true);
    }

    @Test
    public void test0987() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0987");
        com.reservation_system.model.LabManager labManager5 = new com.reservation_system.model.LabManager(52, "Student", "hi!", "student", false);
    }

    @Test
    public void test0988() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0988");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("data/test-userrepo.csv");
        boolean boolean2 = userRepository1.headLabCoordinatorExists();
        com.reservation_system.services.RegistrationService registrationService3 = new com.reservation_system.services.RegistrationService(userRepository1);
        boolean boolean4 = userRepository1.headLabCoordinatorExists();
        boolean boolean6 = userRepository1.emailExists("Andrew");
        com.reservation_system.services.RegistrationService registrationService7 = new com.reservation_system.services.RegistrationService(userRepository1);
        java.util.Optional<com.reservation_system.model.User> userOptional9 = userRepository1.findByEmail("faculty");
        com.reservation_system.services.RegistrationService registrationService10 = new com.reservation_system.services.RegistrationService(userRepository1);
        java.util.List<com.reservation_system.model.User> userList11 = userRepository1.getAllUsers();
        com.reservation_system.model.Student student17 = new com.reservation_system.model.Student((int) ' ', "", "labmanager", "headlabcoordinator", true);
        java.lang.String str18 = student17.getUserType();
        boolean boolean19 = student17.isApproved();
        int int20 = student17.getID();
        userRepository1.addUser((com.reservation_system.model.User) student17);
        int int22 = userRepository1.getNextID();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(userOptional9);
        org.junit.Assert.assertNotNull(userList11);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Student" + "'", str18, "Student");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 32 + "'", int20 == 32);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 101 + "'", int22 == 101);
    }

    @Test
    public void test0989() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0989");
        com.reservation_system.model.Faculty faculty5 = new com.reservation_system.model.Faculty(102, "", "labmanager", "andrew@example.com", false);
    }

    @Test
    public void test0990() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0990");
        com.reservation_system.model.Researcher researcher5 = new com.reservation_system.model.Researcher((int) (short) 1, "Password1!", "hi!", "hi!", true);
        java.lang.String str6 = researcher5.getUserType();
        java.lang.String str7 = researcher5.getName();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Researcher" + "'", str6, "Researcher");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Password1!" + "'", str7, "Password1!");
    }

    @Test
    public void test0991() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0991");
        com.reservation_system.model.HeadLabCoordinator headLabCoordinator5 = new com.reservation_system.model.HeadLabCoordinator((int) ' ', "data/test-userrepo.csv", "Password1!", "headlabcoordinator", true);
    }

    @Test
    public void test0992() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0992");
        com.reservation_system.model.Student student5 = new com.reservation_system.model.Student((int) (short) -1, "Andrew", "Guest", "Faculty", true);
        java.lang.String str6 = student5.getUserType();
        boolean boolean7 = student5.requiresDepartmentApproval();
        java.lang.String str8 = student5.getUserType();
        java.lang.String str9 = student5.getUserType();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Student" + "'", str6, "Student");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Student" + "'", str8, "Student");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Student" + "'", str9, "Student");
    }

    @Test
    public void test0993() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0993");
        com.reservation_system.model.Researcher researcher5 = new com.reservation_system.model.Researcher((int) (short) 1, "guest", "researcher", "", false);
    }

    @Test
    public void test0994() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0994");
        com.reservation_system.model.Researcher researcher5 = new com.reservation_system.model.Researcher(98, "Student", "guest", "Password1!", true);
    }

    @Test
    public void test0995() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0995");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("data/test-userrepo.csv");
        int int2 = userRepository1.getNextID();
        int int3 = userRepository1.getNextID();
        boolean boolean5 = userRepository1.emailExists("faculty");
        com.reservation_system.model.Faculty faculty11 = new com.reservation_system.model.Faculty(10, "researcher", "faculty", "", false);
        java.lang.String str12 = faculty11.getEmail();
        java.lang.String str13 = faculty11.getUserType();
        int int14 = faculty11.getID();
        userRepository1.addUser((com.reservation_system.model.User) faculty11);
        com.reservation_system.repository.UserRepository userRepository17 = new com.reservation_system.repository.UserRepository("data/test-userrepo.csv");
        com.reservation_system.services.RegistrationService registrationService18 = new com.reservation_system.services.RegistrationService(userRepository17);
        com.reservation_system.model.Faculty faculty24 = new com.reservation_system.model.Faculty(0, "Password1!", "data/test-userrepo.csv", "researcher", false);
        java.lang.String str25 = faculty24.getName();
        userRepository17.addUser((com.reservation_system.model.User) faculty24);
        boolean boolean27 = userRepository17.headLabCoordinatorExists();
        com.reservation_system.model.Guest guest33 = new com.reservation_system.model.Guest((int) (byte) -1, "guest", "Researcher", "Faculty", true);
        userRepository17.addUser((com.reservation_system.model.User) guest33);
        boolean boolean36 = userRepository17.emailExists("Password1!");
        boolean boolean38 = userRepository17.emailExists("hi!");
        int int39 = userRepository17.getNextID();
        int int40 = userRepository17.getNextID();
        boolean boolean41 = userRepository17.headLabCoordinatorExists();
        java.util.List<com.reservation_system.model.User> userList42 = userRepository17.getAllUsers();
        java.util.List<com.reservation_system.model.User> userList43 = userRepository17.getAllUsers();
        userRepository1.saveAllUsers(userList43);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 101 + "'", int2 == 101);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 101 + "'", int3 == 101);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "faculty" + "'", str12, "faculty");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Faculty" + "'", str13, "Faculty");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 10 + "'", int14 == 10);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "Password1!" + "'", str25, "Password1!");
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 101 + "'", int39 == 101);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 101 + "'", int40 == 101);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + true + "'", boolean41 == true);
        org.junit.Assert.assertNotNull(userList42);
        org.junit.Assert.assertNotNull(userList43);
    }

    @Test
    public void test0996() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0996");
        com.reservation_system.model.Student student5 = new com.reservation_system.model.Student(100, "Faculty", "Student", "hi!", true);
        java.lang.String str6 = student5.getUserType();
        java.lang.String str7 = student5.getPassword();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Student" + "'", str6, "Student");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
    }

    @Test
    public void test0997() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0997");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("data/test-userrepo.csv");
        int int2 = userRepository1.getNextID();
        int int3 = userRepository1.getNextID();
        boolean boolean5 = userRepository1.emailExists("");
        boolean boolean7 = userRepository1.emailExists("faculty");
        java.util.Optional<com.reservation_system.model.User> userOptional9 = userRepository1.findByEmail("headlabcoordinator");
        com.reservation_system.model.Student student15 = new com.reservation_system.model.Student((int) (byte) 0, "Student", "Andrew", "labmanager", false);
        java.lang.String str16 = student15.getUserType();
        boolean boolean17 = student15.requiresDepartmentApproval();
        userRepository1.addUser((com.reservation_system.model.User) student15);
        java.util.Optional<com.reservation_system.model.User> userOptional20 = userRepository1.findByEmail("Faculty");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 101 + "'", int2 == 101);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 101 + "'", int3 == 101);
// flaky "31) test0997(com.reservation_system.randoop.registrationservice.RegressionTest1)":         org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(userOptional9);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Student" + "'", str16, "Student");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNotNull(userOptional20);
    }

    @Test
    public void test0998() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0998");
        com.reservation_system.model.LabManager labManager5 = new com.reservation_system.model.LabManager(10, "Faculty", "faculty", "Password1!", true);
        java.lang.String str6 = labManager5.getUserType();
        java.lang.String str7 = labManager5.getUserType();
        java.lang.String str8 = labManager5.getUserType();
        java.lang.Class<?> wildcardClass9 = labManager5.getClass();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "labmanager" + "'", str6, "labmanager");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "labmanager" + "'", str7, "labmanager");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "labmanager" + "'", str8, "labmanager");
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0999() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0999");
        com.reservation_system.model.LabManager labManager5 = new com.reservation_system.model.LabManager(0, "guest", "Faculty", "researcher", false);
        java.lang.String str6 = labManager5.getUserType();
        java.lang.String str7 = labManager5.getPassword();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "labmanager" + "'", str6, "labmanager");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "researcher" + "'", str7, "researcher");
    }

    @Test
    public void test1000() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test1000");
        com.reservation_system.model.LabManager labManager5 = new com.reservation_system.model.LabManager(97, "Guest", "researcher", "Faculty", true);
    }
}
