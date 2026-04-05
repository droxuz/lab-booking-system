package com.reservation_system.Randoop.registrationservice;

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
        com.reservation_system.model.Researcher researcher5 = new com.reservation_system.model.Researcher((int) 'a', "demo/data/test-users.csv", "guest", "Researcher", true);
        java.lang.String str6 = researcher5.getEmail();
        java.lang.String str7 = researcher5.getUserType();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "guest" + "'", str6, "guest");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Researcher" + "'", str7, "Researcher");
    }

    @Test
    public void test1502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1502");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("demo/data/test-users.csv");
        boolean boolean2 = userRepository1.headLabCoordinatorExists();
        com.reservation_system.services.RegistrationService registrationService3 = new com.reservation_system.services.RegistrationService(userRepository1);
        boolean boolean4 = userRepository1.headLabCoordinatorExists();
        boolean boolean5 = userRepository1.headLabCoordinatorExists();
        com.reservation_system.repository.UserRepository userRepository7 = new com.reservation_system.repository.UserRepository("demo/data/test-users.csv");
        com.reservation_system.services.RegistrationService registrationService8 = new com.reservation_system.services.RegistrationService(userRepository7);
        com.reservation_system.model.Faculty faculty14 = new com.reservation_system.model.Faculty(0, "Password1!", "demo/data/test-users.csv", "researcher", false);
        java.lang.String str15 = faculty14.getName();
        userRepository7.addUser((com.reservation_system.model.User) faculty14);
        boolean boolean17 = userRepository7.headLabCoordinatorExists();
        int int18 = userRepository7.getNextID();
        com.reservation_system.repository.UserRepository userRepository20 = new com.reservation_system.repository.UserRepository("demo/data/test-users.csv");
        java.util.List<com.reservation_system.model.User> userList21 = userRepository20.getAllUsers();
        com.reservation_system.services.RegistrationService registrationService22 = new com.reservation_system.services.RegistrationService(userRepository20);
        java.util.List<com.reservation_system.model.User> userList23 = userRepository20.getAllUsers();
        userRepository7.saveAllUsers(userList23);
        userRepository1.saveAllUsers(userList23);
        java.util.List<com.reservation_system.model.User> userList26 = userRepository1.getAllUsers();
        com.reservation_system.model.Student student32 = new com.reservation_system.model.Student(32, "Faculty", "andrew@example.com", "Researcher", false);
        userRepository1.addUser((com.reservation_system.model.User) student32);
        java.lang.String str34 = student32.getPassword();
        java.lang.String str35 = student32.getEmail();
        java.lang.String str36 = student32.getUserType();
// flaky "1) test1502(com.reservation_system.randoop.registrationservice.RegressionTest3)":         org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
// flaky "1) test1502(com.reservation_system.randoop.registrationservice.RegressionTest3)":         org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
// flaky "1) test1502(com.reservation_system.randoop.registrationservice.RegressionTest3)":         org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Password1!" + "'", str15, "Password1!");
// flaky "1) test1502(com.reservation_system.randoop.registrationservice.RegressionTest3)":         org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
// flaky "1) test1502(com.reservation_system.randoop.registrationservice.RegressionTest3)":         org.junit.Assert.assertTrue("'" + int18 + "' != '" + 101 + "'", int18 == 101);
        org.junit.Assert.assertNotNull(userList21);
        org.junit.Assert.assertNotNull(userList23);
        org.junit.Assert.assertNotNull(userList26);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "Researcher" + "'", str34, "Researcher");
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "Student" + "'", str36, "Student");
    }

    @Test
    public void test1503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1503");
        com.reservation_system.model.Student student5 = new com.reservation_system.model.Student((int) (short) 0, "", "guest", "", true);
    }

    @Test
    public void test1504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1504");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("demo/data/test-users.csv");
        boolean boolean2 = userRepository1.headLabCoordinatorExists();
        com.reservation_system.services.RegistrationService registrationService3 = new com.reservation_system.services.RegistrationService(userRepository1);
        boolean boolean4 = userRepository1.headLabCoordinatorExists();
        boolean boolean6 = userRepository1.emailExists("Andrew");
        com.reservation_system.services.RegistrationService registrationService7 = new com.reservation_system.services.RegistrationService(userRepository1);
        java.util.Optional<com.reservation_system.model.User> userOptional9 = userRepository1.findByEmail("faculty");
        com.reservation_system.services.RegistrationService registrationService10 = new com.reservation_system.services.RegistrationService(userRepository1);
        java.util.List<com.reservation_system.model.User> userList11 = userRepository1.getAllUsers();
        java.util.List<com.reservation_system.model.User> userList12 = userRepository1.getAllUsers();
// flaky "2) test1504(com.reservation_system.randoop.registrationservice.RegressionTest3)":         org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
// flaky "2) test1504(com.reservation_system.randoop.registrationservice.RegressionTest3)":         org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
// flaky "2) test1504(com.reservation_system.randoop.registrationservice.RegressionTest3)":         org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(userOptional9);
        org.junit.Assert.assertNotNull(userList11);
        org.junit.Assert.assertNotNull(userList12);
    }

    @Test
    public void test1505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1505");
        com.reservation_system.model.Researcher researcher5 = new com.reservation_system.model.Researcher((int) (byte) 10, "", "labmanager", "headlabcoordinator", true);
    }

    @Test
    public void test1506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1506");
        com.reservation_system.model.LabManager labManager5 = new com.reservation_system.model.LabManager((int) '4', "Student", "", "guest", false);
        java.lang.String str6 = labManager5.getEmail();
        java.lang.String str7 = labManager5.getUserType();
        int int8 = labManager5.getID();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "labmanager" + "'", str7, "labmanager");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 52 + "'", int8 == 52);
    }

    @Test
    public void test1507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1507");
        com.reservation_system.model.Researcher researcher5 = new com.reservation_system.model.Researcher((int) (short) -1, "andrew@example.com", "guest", "labmanager", false);
        java.lang.String str6 = researcher5.getPassword();
        boolean boolean7 = researcher5.requiresDepartmentApproval();
        java.lang.String str8 = researcher5.getUserType();
        java.lang.String str9 = researcher5.getEmail();
        java.lang.String str10 = researcher5.getUserType();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "labmanager" + "'", str6, "labmanager");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Researcher" + "'", str8, "Researcher");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "guest" + "'", str9, "guest");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Researcher" + "'", str10, "Researcher");
    }

    @Test
    public void test1508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1508");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("demo/data/test-users.csv");
        java.util.List<com.reservation_system.model.User> userList2 = userRepository1.getAllUsers();
        com.reservation_system.services.RegistrationService registrationService3 = new com.reservation_system.services.RegistrationService(userRepository1);
        java.util.List<com.reservation_system.model.User> userList4 = userRepository1.getAllUsers();
        boolean boolean6 = userRepository1.emailExists("Guest");
        java.util.List<com.reservation_system.model.User> userList7 = userRepository1.getAllUsers();
        java.util.Optional<com.reservation_system.model.User> userOptional9 = userRepository1.findByEmail("Password1!");
        com.reservation_system.repository.UserRepository userRepository11 = new com.reservation_system.repository.UserRepository("demo/data/test-users.csv");
        com.reservation_system.services.RegistrationService registrationService12 = new com.reservation_system.services.RegistrationService(userRepository11);
        com.reservation_system.model.Faculty faculty18 = new com.reservation_system.model.Faculty(0, "Password1!", "demo/data/test-users.csv", "researcher", false);
        java.lang.String str19 = faculty18.getName();
        userRepository11.addUser((com.reservation_system.model.User) faculty18);
        boolean boolean21 = userRepository11.headLabCoordinatorExists();
        int int22 = userRepository11.getNextID();
        com.reservation_system.repository.UserRepository userRepository24 = new com.reservation_system.repository.UserRepository("demo/data/test-users.csv");
        java.util.List<com.reservation_system.model.User> userList25 = userRepository24.getAllUsers();
        com.reservation_system.services.RegistrationService registrationService26 = new com.reservation_system.services.RegistrationService(userRepository24);
        java.util.List<com.reservation_system.model.User> userList27 = userRepository24.getAllUsers();
        userRepository11.saveAllUsers(userList27);
        userRepository1.saveAllUsers(userList27);
        com.reservation_system.model.HeadLabCoordinator headLabCoordinator35 = new com.reservation_system.model.HeadLabCoordinator(10, "faculty", "Faculty", "demo/data/test-users.csv", false);
        int int36 = headLabCoordinator35.getID();
        java.lang.String str37 = headLabCoordinator35.getUserType();
        userRepository1.addUser((com.reservation_system.model.User) headLabCoordinator35);
        com.reservation_system.repository.UserRepository userRepository40 = new com.reservation_system.repository.UserRepository("demo/data/test-users.csv");
        java.util.List<com.reservation_system.model.User> userList41 = userRepository40.getAllUsers();
        com.reservation_system.services.RegistrationService registrationService42 = new com.reservation_system.services.RegistrationService(userRepository40);
        int int43 = userRepository40.getNextID();
        com.reservation_system.model.Researcher researcher49 = new com.reservation_system.model.Researcher(100, "demo/data/test-users.csv", "andrew@example.com", "guest", false);
        java.lang.String str50 = researcher49.getEmail();
        userRepository40.addUser((com.reservation_system.model.User) researcher49);
        userRepository1.addUser((com.reservation_system.model.User) researcher49);
        com.reservation_system.repository.UserRepository userRepository54 = new com.reservation_system.repository.UserRepository("demo/data/test-users.csv");
        com.reservation_system.services.RegistrationService registrationService55 = new com.reservation_system.services.RegistrationService(userRepository54);
        com.reservation_system.model.Faculty faculty61 = new com.reservation_system.model.Faculty(0, "Password1!", "demo/data/test-users.csv", "researcher", false);
        java.lang.String str62 = faculty61.getName();
        userRepository54.addUser((com.reservation_system.model.User) faculty61);
        boolean boolean64 = userRepository54.headLabCoordinatorExists();
        int int65 = userRepository54.getNextID();
        com.reservation_system.repository.UserRepository userRepository67 = new com.reservation_system.repository.UserRepository("demo/data/test-users.csv");
        java.util.List<com.reservation_system.model.User> userList68 = userRepository67.getAllUsers();
        com.reservation_system.services.RegistrationService registrationService69 = new com.reservation_system.services.RegistrationService(userRepository67);
        java.util.List<com.reservation_system.model.User> userList70 = userRepository67.getAllUsers();
        userRepository54.saveAllUsers(userList70);
        userRepository1.saveAllUsers(userList70);
        com.reservation_system.services.RegistrationService registrationService73 = new com.reservation_system.services.RegistrationService(userRepository1);
        // The following exception was thrown during execution in test generation
        try {
            com.reservation_system.model.User user78 = registrationService73.registerUser("andrew@example.com", "Guest", "Password1!", "headlabcoordinator");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid user type.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(userList2);
        org.junit.Assert.assertNotNull(userList4);
// flaky "3) test1508(com.reservation_system.randoop.registrationservice.RegressionTest3)":         org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(userList7);
        org.junit.Assert.assertNotNull(userOptional9);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "Password1!" + "'", str19, "Password1!");
// flaky "3) test1508(com.reservation_system.randoop.registrationservice.RegressionTest3)":         org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
// flaky "3) test1508(com.reservation_system.randoop.registrationservice.RegressionTest3)":         org.junit.Assert.assertTrue("'" + int22 + "' != '" + 101 + "'", int22 == 101);
        org.junit.Assert.assertNotNull(userList25);
        org.junit.Assert.assertNotNull(userList27);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 10 + "'", int36 == 10);
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "headlabcoordinator" + "'", str37, "headlabcoordinator");
        org.junit.Assert.assertNotNull(userList41);
// flaky "2) test1508(com.reservation_system.randoop.registrationservice.RegressionTest3)":         org.junit.Assert.assertTrue("'" + int43 + "' != '" + 101 + "'", int43 == 101);
        org.junit.Assert.assertEquals("'" + str62 + "' != '" + "Password1!" + "'", str62, "Password1!");
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + true + "'", boolean64 == true);
        org.junit.Assert.assertTrue("'" + int65 + "' != '" + 101 + "'", int65 == 101);
        org.junit.Assert.assertNotNull(userList68);
        org.junit.Assert.assertNotNull(userList70);
    }

    @Test
    public void test1509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1509");
        com.reservation_system.model.Researcher researcher5 = new com.reservation_system.model.Researcher((-1), "Guest", "demo/data/test-users.csv", "Guest", false);
    }

    @Test
    public void test1510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1510");
        com.reservation_system.model.Researcher researcher5 = new com.reservation_system.model.Researcher((int) (short) -1, "andrew@example.com", "guest", "labmanager", false);
        java.lang.String str6 = researcher5.getEmail();
        researcher5.setApproved(false);
        java.lang.String str9 = researcher5.getUserType();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "guest" + "'", str6, "guest");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Researcher" + "'", str9, "Researcher");
    }

    @Test
    public void test1511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1511");
        com.reservation_system.model.Faculty faculty5 = new com.reservation_system.model.Faculty(100, "student", "Andrew", "researcher", true);
        java.lang.String str6 = faculty5.getPassword();
        boolean boolean7 = faculty5.requiresDepartmentApproval();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "researcher" + "'", str6, "researcher");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test1512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1512");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("demo/data/test-users.csv");
        com.reservation_system.services.RegistrationService registrationService2 = new com.reservation_system.services.RegistrationService(userRepository1);
        com.reservation_system.model.Faculty faculty8 = new com.reservation_system.model.Faculty(0, "Password1!", "demo/data/test-users.csv", "researcher", false);
        java.lang.String str9 = faculty8.getName();
        userRepository1.addUser((com.reservation_system.model.User) faculty8);
        boolean boolean11 = userRepository1.headLabCoordinatorExists();
        com.reservation_system.model.Guest guest17 = new com.reservation_system.model.Guest((int) (byte) -1, "guest", "Researcher", "Faculty", true);
        userRepository1.addUser((com.reservation_system.model.User) guest17);
        boolean boolean20 = userRepository1.emailExists("Password1!");
        boolean boolean22 = userRepository1.emailExists("hi!");
        int int23 = userRepository1.getNextID();
        int int24 = userRepository1.getNextID();
        boolean boolean25 = userRepository1.headLabCoordinatorExists();
        com.reservation_system.repository.UserRepository userRepository27 = new com.reservation_system.repository.UserRepository("demo/data/test-users.csv");
        com.reservation_system.services.RegistrationService registrationService28 = new com.reservation_system.services.RegistrationService(userRepository27);
        com.reservation_system.model.Faculty faculty34 = new com.reservation_system.model.Faculty(0, "Password1!", "demo/data/test-users.csv", "researcher", false);
        java.lang.String str35 = faculty34.getName();
        userRepository27.addUser((com.reservation_system.model.User) faculty34);
        boolean boolean37 = userRepository27.headLabCoordinatorExists();
        com.reservation_system.services.RegistrationService registrationService38 = new com.reservation_system.services.RegistrationService(userRepository27);
        com.reservation_system.model.Researcher researcher44 = new com.reservation_system.model.Researcher((int) '4', "labmanager", "Andrew", "researcher", true);
        userRepository27.addUser((com.reservation_system.model.User) researcher44);
        java.lang.String str46 = researcher44.getEmail();
        int int47 = researcher44.getID();
        userRepository1.addUser((com.reservation_system.model.User) researcher44);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Password1!" + "'", str9, "Password1!");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
// flaky "4) test1512(com.reservation_system.randoop.registrationservice.RegressionTest3)":         org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
// flaky "4) test1512(com.reservation_system.randoop.registrationservice.RegressionTest3)":         org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 101 + "'", int23 == 101);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 101 + "'", int24 == 101);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "Password1!" + "'", str35, "Password1!");
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
        org.junit.Assert.assertEquals("'" + str46 + "' != '" + "Andrew" + "'", str46, "Andrew");
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + 52 + "'", int47 == 52);
    }

    @Test
    public void test1513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1513");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("demo/data/test-users.csv");
        com.reservation_system.services.RegistrationService registrationService2 = new com.reservation_system.services.RegistrationService(userRepository1);
        com.reservation_system.services.RegistrationService registrationService3 = new com.reservation_system.services.RegistrationService(userRepository1);
        boolean boolean5 = userRepository1.emailExists("faculty");
        java.util.Optional<com.reservation_system.model.User> userOptional7 = userRepository1.findByEmail("researcher");
        com.reservation_system.model.Student student13 = new com.reservation_system.model.Student(0, "Student", "Faculty", "hi!", false);
        userRepository1.addUser((com.reservation_system.model.User) student13);
        java.lang.String str15 = student13.getEmail();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(userOptional7);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Faculty" + "'", str15, "Faculty");
    }

    @Test
    public void test1514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1514");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("demo/data/test-users.csv");
        java.util.List<com.reservation_system.model.User> userList2 = userRepository1.getAllUsers();
        com.reservation_system.services.RegistrationService registrationService3 = new com.reservation_system.services.RegistrationService(userRepository1);
        java.util.List<com.reservation_system.model.User> userList4 = userRepository1.getAllUsers();
        boolean boolean6 = userRepository1.emailExists("Guest");
        java.util.List<com.reservation_system.model.User> userList7 = userRepository1.getAllUsers();
        java.util.Optional<com.reservation_system.model.User> userOptional9 = userRepository1.findByEmail("Password1!");
        com.reservation_system.repository.UserRepository userRepository11 = new com.reservation_system.repository.UserRepository("demo/data/test-users.csv");
        com.reservation_system.services.RegistrationService registrationService12 = new com.reservation_system.services.RegistrationService(userRepository11);
        com.reservation_system.model.Faculty faculty18 = new com.reservation_system.model.Faculty(0, "Password1!", "demo/data/test-users.csv", "researcher", false);
        java.lang.String str19 = faculty18.getName();
        userRepository11.addUser((com.reservation_system.model.User) faculty18);
        boolean boolean21 = userRepository11.headLabCoordinatorExists();
        int int22 = userRepository11.getNextID();
        com.reservation_system.repository.UserRepository userRepository24 = new com.reservation_system.repository.UserRepository("demo/data/test-users.csv");
        java.util.List<com.reservation_system.model.User> userList25 = userRepository24.getAllUsers();
        com.reservation_system.services.RegistrationService registrationService26 = new com.reservation_system.services.RegistrationService(userRepository24);
        java.util.List<com.reservation_system.model.User> userList27 = userRepository24.getAllUsers();
        userRepository11.saveAllUsers(userList27);
        userRepository1.saveAllUsers(userList27);
        com.reservation_system.model.HeadLabCoordinator headLabCoordinator35 = new com.reservation_system.model.HeadLabCoordinator(10, "faculty", "Faculty", "demo/data/test-users.csv", false);
        int int36 = headLabCoordinator35.getID();
        java.lang.String str37 = headLabCoordinator35.getUserType();
        userRepository1.addUser((com.reservation_system.model.User) headLabCoordinator35);
        java.lang.String str39 = headLabCoordinator35.getName();
        org.junit.Assert.assertNotNull(userList2);
        org.junit.Assert.assertNotNull(userList4);
// flaky "5) test1514(com.reservation_system.randoop.registrationservice.RegressionTest3)":         org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(userList7);
        org.junit.Assert.assertNotNull(userOptional9);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "Password1!" + "'", str19, "Password1!");
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 101 + "'", int22 == 101);
        org.junit.Assert.assertNotNull(userList25);
        org.junit.Assert.assertNotNull(userList27);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 10 + "'", int36 == 10);
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "headlabcoordinator" + "'", str37, "headlabcoordinator");
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "faculty" + "'", str39, "faculty");
    }

    @Test
    public void test1515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1515");
        com.reservation_system.model.Researcher researcher5 = new com.reservation_system.model.Researcher((int) (byte) 0, "andrew@example.com", "", "faculty", false);
    }

    @Test
    public void test1516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1516");
        com.reservation_system.model.HeadLabCoordinator headLabCoordinator5 = new com.reservation_system.model.HeadLabCoordinator(0, "Password1!", "Faculty", "Faculty", false);
        java.lang.String str6 = headLabCoordinator5.getEmail();
        java.lang.Class<?> wildcardClass7 = headLabCoordinator5.getClass();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Faculty" + "'", str6, "Faculty");
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test1517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1517");
        com.reservation_system.model.Guest guest5 = new com.reservation_system.model.Guest((int) (byte) 100, "andrew@example.com", "student", "Researcher", false);
        java.lang.String str6 = guest5.getUserType();
        int int7 = guest5.getID();
        java.lang.String str8 = guest5.getName();
        java.lang.String str9 = guest5.getName();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Guest" + "'", str6, "Guest");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 100 + "'", int7 == 100);
    }

    @Test
    public void test1518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1518");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("demo/data/test-users.csv");
        boolean boolean2 = userRepository1.headLabCoordinatorExists();
        com.reservation_system.services.RegistrationService registrationService3 = new com.reservation_system.services.RegistrationService(userRepository1);
        boolean boolean4 = userRepository1.headLabCoordinatorExists();
        boolean boolean6 = userRepository1.emailExists("Andrew");
        com.reservation_system.services.RegistrationService registrationService7 = new com.reservation_system.services.RegistrationService(userRepository1);
        java.util.Optional<com.reservation_system.model.User> userOptional9 = userRepository1.findByEmail("faculty");
        com.reservation_system.services.RegistrationService registrationService10 = new com.reservation_system.services.RegistrationService(userRepository1);
        com.reservation_system.repository.UserRepository userRepository12 = new com.reservation_system.repository.UserRepository("demo/data/test-users.csv");
        com.reservation_system.services.RegistrationService registrationService13 = new com.reservation_system.services.RegistrationService(userRepository12);
        com.reservation_system.model.Faculty faculty19 = new com.reservation_system.model.Faculty(0, "Password1!", "demo/data/test-users.csv", "researcher", false);
        java.lang.String str20 = faculty19.getName();
        userRepository12.addUser((com.reservation_system.model.User) faculty19);
        boolean boolean22 = userRepository12.headLabCoordinatorExists();
        com.reservation_system.model.Guest guest28 = new com.reservation_system.model.Guest((int) (byte) -1, "guest", "Researcher", "Faculty", true);
        userRepository12.addUser((com.reservation_system.model.User) guest28);
        boolean boolean31 = userRepository12.emailExists("Password1!");
        com.reservation_system.repository.UserRepository userRepository33 = new com.reservation_system.repository.UserRepository("demo/data/test-users.csv");
        com.reservation_system.services.RegistrationService registrationService34 = new com.reservation_system.services.RegistrationService(userRepository33);
        com.reservation_system.model.Faculty faculty40 = new com.reservation_system.model.Faculty(0, "Password1!", "demo/data/test-users.csv", "researcher", false);
        java.lang.String str41 = faculty40.getName();
        userRepository33.addUser((com.reservation_system.model.User) faculty40);
        boolean boolean43 = userRepository33.headLabCoordinatorExists();
        com.reservation_system.services.RegistrationService registrationService44 = new com.reservation_system.services.RegistrationService(userRepository33);
        java.util.List<com.reservation_system.model.User> userList45 = userRepository33.getAllUsers();
        com.reservation_system.repository.UserRepository userRepository47 = new com.reservation_system.repository.UserRepository("demo/data/test-users.csv");
        com.reservation_system.services.RegistrationService registrationService48 = new com.reservation_system.services.RegistrationService(userRepository47);
        com.reservation_system.model.Faculty faculty54 = new com.reservation_system.model.Faculty(0, "Password1!", "demo/data/test-users.csv", "researcher", false);
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
        com.reservation_system.services.RegistrationService registrationService73 = new com.reservation_system.services.RegistrationService(userRepository1);
        // The following exception was thrown during execution in test generation
        try {
            com.reservation_system.model.User user78 = registrationService73.registerUser("guest", "headlabcoordinator", "", "Student");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Email is required.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(userOptional9);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "Password1!" + "'", str20, "Password1!");
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
// flaky "6) test1518(com.reservation_system.randoop.registrationservice.RegressionTest3)":         org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
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
    public void test1519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1519");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("demo/data/test-users.csv");
        com.reservation_system.services.RegistrationService registrationService2 = new com.reservation_system.services.RegistrationService(userRepository1);
        com.reservation_system.model.Faculty faculty8 = new com.reservation_system.model.Faculty(0, "Password1!", "demo/data/test-users.csv", "researcher", false);
        java.lang.String str9 = faculty8.getName();
        userRepository1.addUser((com.reservation_system.model.User) faculty8);
        boolean boolean11 = userRepository1.headLabCoordinatorExists();
        com.reservation_system.services.RegistrationService registrationService12 = new com.reservation_system.services.RegistrationService(userRepository1);
        com.reservation_system.model.Researcher researcher18 = new com.reservation_system.model.Researcher(0, "labmanager", "", "labmanager", false);
        java.lang.String str19 = researcher18.getEmail();
        userRepository1.addUser((com.reservation_system.model.User) researcher18);
        java.util.List<com.reservation_system.model.User> userList21 = userRepository1.getAllUsers();
        java.util.Optional<com.reservation_system.model.User> userOptional23 = userRepository1.findByEmail("");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Password1!" + "'", str9, "Password1!");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertNotNull(userList21);
        org.junit.Assert.assertNotNull(userOptional23);
    }

    @Test
    public void test1520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1520");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("demo/data/test-users.csv");
        com.reservation_system.services.RegistrationService registrationService2 = new com.reservation_system.services.RegistrationService(userRepository1);
        com.reservation_system.model.Faculty faculty8 = new com.reservation_system.model.Faculty(0, "Password1!", "demo/data/test-users.csv", "researcher", false);
        java.lang.String str9 = faculty8.getName();
        userRepository1.addUser((com.reservation_system.model.User) faculty8);
        boolean boolean11 = userRepository1.headLabCoordinatorExists();
        com.reservation_system.services.RegistrationService registrationService12 = new com.reservation_system.services.RegistrationService(userRepository1);
        com.reservation_system.model.Researcher researcher18 = new com.reservation_system.model.Researcher((int) '4', "labmanager", "Andrew", "researcher", true);
        userRepository1.addUser((com.reservation_system.model.User) researcher18);
        java.lang.String str20 = researcher18.getUserType();
        int int21 = researcher18.getID();
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Password1!" + "'", str9, "Password1!");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "Researcher" + "'", str20, "Researcher");
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 52 + "'", int21 == 52);
    }

    @Test
    public void test1521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1521");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("demo/data/test-users.csv");
        com.reservation_system.services.RegistrationService registrationService2 = new com.reservation_system.services.RegistrationService(userRepository1);
        com.reservation_system.model.Faculty faculty8 = new com.reservation_system.model.Faculty(0, "Password1!", "demo/data/test-users.csv", "researcher", false);
        java.lang.String str9 = faculty8.getName();
        userRepository1.addUser((com.reservation_system.model.User) faculty8);
        boolean boolean11 = userRepository1.headLabCoordinatorExists();
        com.reservation_system.model.Guest guest17 = new com.reservation_system.model.Guest((int) (byte) -1, "guest", "Researcher", "Faculty", true);
        userRepository1.addUser((com.reservation_system.model.User) guest17);
        boolean boolean20 = userRepository1.emailExists("Password1!");
        boolean boolean22 = userRepository1.emailExists("hi!");
        int int23 = userRepository1.getNextID();
        com.reservation_system.repository.UserRepository userRepository25 = new com.reservation_system.repository.UserRepository("demo/data/test-users.csv");
        com.reservation_system.services.RegistrationService registrationService26 = new com.reservation_system.services.RegistrationService(userRepository25);
        com.reservation_system.model.Faculty faculty32 = new com.reservation_system.model.Faculty(0, "Password1!", "demo/data/test-users.csv", "researcher", false);
        java.lang.String str33 = faculty32.getName();
        userRepository25.addUser((com.reservation_system.model.User) faculty32);
        boolean boolean35 = userRepository25.headLabCoordinatorExists();
        com.reservation_system.model.Guest guest41 = new com.reservation_system.model.Guest((int) (byte) -1, "guest", "Researcher", "Faculty", true);
        userRepository25.addUser((com.reservation_system.model.User) guest41);
        boolean boolean43 = userRepository25.headLabCoordinatorExists();
        com.reservation_system.repository.UserRepository userRepository45 = new com.reservation_system.repository.UserRepository("demo/data/test-users.csv");
        com.reservation_system.services.RegistrationService registrationService46 = new com.reservation_system.services.RegistrationService(userRepository45);
        com.reservation_system.model.Faculty faculty52 = new com.reservation_system.model.Faculty(0, "Password1!", "demo/data/test-users.csv", "researcher", false);
        java.lang.String str53 = faculty52.getName();
        userRepository45.addUser((com.reservation_system.model.User) faculty52);
        boolean boolean55 = userRepository45.headLabCoordinatorExists();
        com.reservation_system.repository.UserRepository userRepository57 = new com.reservation_system.repository.UserRepository("demo/data/test-users.csv");
        com.reservation_system.services.RegistrationService registrationService58 = new com.reservation_system.services.RegistrationService(userRepository57);
        com.reservation_system.model.Faculty faculty64 = new com.reservation_system.model.Faculty(0, "Password1!", "demo/data/test-users.csv", "researcher", false);
        java.lang.String str65 = faculty64.getName();
        userRepository57.addUser((com.reservation_system.model.User) faculty64);
        java.util.List<com.reservation_system.model.User> userList67 = userRepository57.getAllUsers();
        userRepository45.saveAllUsers(userList67);
        userRepository25.saveAllUsers(userList67);
        boolean boolean71 = userRepository25.emailExists("hi!");
        com.reservation_system.repository.UserRepository userRepository73 = new com.reservation_system.repository.UserRepository("demo/data/test-users.csv");
        com.reservation_system.services.RegistrationService registrationService74 = new com.reservation_system.services.RegistrationService(userRepository73);
        com.reservation_system.model.Faculty faculty80 = new com.reservation_system.model.Faculty(0, "Password1!", "demo/data/test-users.csv", "researcher", false);
        java.lang.String str81 = faculty80.getName();
        userRepository73.addUser((com.reservation_system.model.User) faculty80);
        boolean boolean83 = userRepository73.headLabCoordinatorExists();
        com.reservation_system.services.RegistrationService registrationService84 = new com.reservation_system.services.RegistrationService(userRepository73);
        java.util.List<com.reservation_system.model.User> userList85 = userRepository73.getAllUsers();
        userRepository25.saveAllUsers(userList85);
        userRepository1.saveAllUsers(userList85);
        com.reservation_system.services.RegistrationService registrationService88 = new com.reservation_system.services.RegistrationService(userRepository1);
        java.util.List<com.reservation_system.model.User> userList89 = userRepository1.getAllUsers();
        com.reservation_system.repository.UserRepository userRepository91 = new com.reservation_system.repository.UserRepository("demo/data/test-users.csv");
        java.util.Optional<com.reservation_system.model.User> userOptional93 = userRepository91.findByEmail("hi!");
        int int94 = userRepository91.getNextID();
        java.util.List<com.reservation_system.model.User> userList95 = userRepository91.getAllUsers();
        userRepository1.saveAllUsers(userList95);
        boolean boolean98 = userRepository1.emailExists("researcher");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Password1!" + "'", str9, "Password1!");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
// flaky "7) test1521(com.reservation_system.randoop.registrationservice.RegressionTest3)":         org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
// flaky "5) test1521(com.reservation_system.randoop.registrationservice.RegressionTest3)":         org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 101 + "'", int23 == 101);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "Password1!" + "'", str33, "Password1!");
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + true + "'", boolean43 == true);
        org.junit.Assert.assertEquals("'" + str53 + "' != '" + "Password1!" + "'", str53, "Password1!");
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + true + "'", boolean55 == true);
        org.junit.Assert.assertEquals("'" + str65 + "' != '" + "Password1!" + "'", str65, "Password1!");
        org.junit.Assert.assertNotNull(userList67);
// flaky "4) test1521(com.reservation_system.randoop.registrationservice.RegressionTest3)":         org.junit.Assert.assertTrue("'" + boolean71 + "' != '" + true + "'", boolean71 == true);
        org.junit.Assert.assertEquals("'" + str81 + "' != '" + "Password1!" + "'", str81, "Password1!");
        org.junit.Assert.assertTrue("'" + boolean83 + "' != '" + true + "'", boolean83 == true);
        org.junit.Assert.assertNotNull(userList85);
        org.junit.Assert.assertNotNull(userList89);
        org.junit.Assert.assertNotNull(userOptional93);
        org.junit.Assert.assertTrue("'" + int94 + "' != '" + 101 + "'", int94 == 101);
        org.junit.Assert.assertNotNull(userList95);
        org.junit.Assert.assertTrue("'" + boolean98 + "' != '" + true + "'", boolean98 == true);
    }

    @Test
    public void test1522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1522");
        com.reservation_system.model.Researcher researcher5 = new com.reservation_system.model.Researcher(0, "Password1!", "", "andrew@example.com", true);
    }

    @Test
    public void test1523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1523");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("demo/data/test-users.csv");
        boolean boolean2 = userRepository1.headLabCoordinatorExists();
        com.reservation_system.services.RegistrationService registrationService3 = new com.reservation_system.services.RegistrationService(userRepository1);
        boolean boolean4 = userRepository1.headLabCoordinatorExists();
        boolean boolean6 = userRepository1.emailExists("Andrew");
        com.reservation_system.services.RegistrationService registrationService7 = new com.reservation_system.services.RegistrationService(userRepository1);
        java.util.Optional<com.reservation_system.model.User> userOptional9 = userRepository1.findByEmail("faculty");
        com.reservation_system.services.RegistrationService registrationService10 = new com.reservation_system.services.RegistrationService(userRepository1);
        com.reservation_system.repository.UserRepository userRepository12 = new com.reservation_system.repository.UserRepository("demo/data/test-users.csv");
        com.reservation_system.services.RegistrationService registrationService13 = new com.reservation_system.services.RegistrationService(userRepository12);
        com.reservation_system.model.Faculty faculty19 = new com.reservation_system.model.Faculty(0, "Password1!", "demo/data/test-users.csv", "researcher", false);
        java.lang.String str20 = faculty19.getName();
        userRepository12.addUser((com.reservation_system.model.User) faculty19);
        boolean boolean22 = userRepository12.headLabCoordinatorExists();
        com.reservation_system.model.Guest guest28 = new com.reservation_system.model.Guest((int) (byte) -1, "guest", "Researcher", "Faculty", true);
        userRepository12.addUser((com.reservation_system.model.User) guest28);
        boolean boolean31 = userRepository12.emailExists("Password1!");
        com.reservation_system.repository.UserRepository userRepository33 = new com.reservation_system.repository.UserRepository("demo/data/test-users.csv");
        com.reservation_system.services.RegistrationService registrationService34 = new com.reservation_system.services.RegistrationService(userRepository33);
        com.reservation_system.model.Faculty faculty40 = new com.reservation_system.model.Faculty(0, "Password1!", "demo/data/test-users.csv", "researcher", false);
        java.lang.String str41 = faculty40.getName();
        userRepository33.addUser((com.reservation_system.model.User) faculty40);
        boolean boolean43 = userRepository33.headLabCoordinatorExists();
        com.reservation_system.services.RegistrationService registrationService44 = new com.reservation_system.services.RegistrationService(userRepository33);
        java.util.List<com.reservation_system.model.User> userList45 = userRepository33.getAllUsers();
        com.reservation_system.repository.UserRepository userRepository47 = new com.reservation_system.repository.UserRepository("demo/data/test-users.csv");
        com.reservation_system.services.RegistrationService registrationService48 = new com.reservation_system.services.RegistrationService(userRepository47);
        com.reservation_system.model.Faculty faculty54 = new com.reservation_system.model.Faculty(0, "Password1!", "demo/data/test-users.csv", "researcher", false);
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
        boolean boolean76 = userRepository1.headLabCoordinatorExists();
        com.reservation_system.services.RegistrationService registrationService77 = new com.reservation_system.services.RegistrationService(userRepository1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(userOptional9);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "Password1!" + "'", str20, "Password1!");
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
// flaky "8) test1523(com.reservation_system.randoop.registrationservice.RegressionTest3)":         org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
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
    public void test1524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1524");
        com.reservation_system.model.Guest guest5 = new com.reservation_system.model.Guest((int) (short) -1, "headlabcoordinator", "demo/data/test-users.csv", "faculty", false);
    }

    @Test
    public void test1525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1525");
        com.reservation_system.model.Guest guest5 = new com.reservation_system.model.Guest((int) (byte) 0, "hi!", "Andrew", "headlabcoordinator", true);
        java.lang.String str6 = guest5.getName();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
    }

    @Test
    public void test1526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1526");
        com.reservation_system.model.HeadLabCoordinator headLabCoordinator5 = new com.reservation_system.model.HeadLabCoordinator(33, "andrew@example.com", "researcher", "Andrew", true);
    }

    @Test
    public void test1527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1527");
        com.reservation_system.model.LabManager labManager5 = new com.reservation_system.model.LabManager((int) (short) 1, "Andrew", "faculty", "Faculty", true);
        java.lang.String str6 = labManager5.getName();
        java.lang.String str7 = labManager5.getUserType();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Andrew" + "'", str6, "Andrew");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "labmanager" + "'", str7, "labmanager");
    }

    @Test
    public void test1528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1528");
        com.reservation_system.model.Guest guest5 = new com.reservation_system.model.Guest(52, "labmanager", "researcher", "Faculty", false);
    }

    @Test
    public void test1529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1529");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("demo/data/test-users.csv");
        boolean boolean2 = userRepository1.headLabCoordinatorExists();
        com.reservation_system.services.RegistrationService registrationService3 = new com.reservation_system.services.RegistrationService(userRepository1);
        boolean boolean4 = userRepository1.headLabCoordinatorExists();
        boolean boolean5 = userRepository1.headLabCoordinatorExists();
        com.reservation_system.repository.UserRepository userRepository7 = new com.reservation_system.repository.UserRepository("demo/data/test-users.csv");
        com.reservation_system.services.RegistrationService registrationService8 = new com.reservation_system.services.RegistrationService(userRepository7);
        com.reservation_system.model.Faculty faculty14 = new com.reservation_system.model.Faculty(0, "Password1!", "demo/data/test-users.csv", "researcher", false);
        java.lang.String str15 = faculty14.getName();
        userRepository7.addUser((com.reservation_system.model.User) faculty14);
        boolean boolean17 = userRepository7.headLabCoordinatorExists();
        int int18 = userRepository7.getNextID();
        com.reservation_system.repository.UserRepository userRepository20 = new com.reservation_system.repository.UserRepository("demo/data/test-users.csv");
        java.util.List<com.reservation_system.model.User> userList21 = userRepository20.getAllUsers();
        com.reservation_system.services.RegistrationService registrationService22 = new com.reservation_system.services.RegistrationService(userRepository20);
        java.util.List<com.reservation_system.model.User> userList23 = userRepository20.getAllUsers();
        userRepository7.saveAllUsers(userList23);
        userRepository1.saveAllUsers(userList23);
        com.reservation_system.model.Student student31 = new com.reservation_system.model.Student((int) (byte) 100, "Student", "researcher", "andrew@example.com", true);
        userRepository1.addUser((com.reservation_system.model.User) student31);
        java.util.Optional<com.reservation_system.model.User> userOptional34 = userRepository1.findByEmail("demo/data/test-users.csv");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Password1!" + "'", str15, "Password1!");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 101 + "'", int18 == 101);
        org.junit.Assert.assertNotNull(userList21);
        org.junit.Assert.assertNotNull(userList23);
        org.junit.Assert.assertNotNull(userOptional34);
    }

    @Test
    public void test1530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1530");
        com.reservation_system.model.LabManager labManager5 = new com.reservation_system.model.LabManager((int) '#', "faculty", "guest", "labmanager", true);
    }

    @Test
    public void test1531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1531");
        com.reservation_system.model.Faculty faculty5 = new com.reservation_system.model.Faculty(102, "faculty", "headlabcoordinator", "faculty", false);
    }

    @Test
    public void test1532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1532");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("demo/data/test-users.csv");
        java.util.Optional<com.reservation_system.model.User> userOptional3 = userRepository1.findByEmail("hi!");
        int int4 = userRepository1.getNextID();
        java.util.List<com.reservation_system.model.User> userList5 = userRepository1.getAllUsers();
        java.util.Optional<com.reservation_system.model.User> userOptional7 = userRepository1.findByEmail("hi!");
        java.lang.Class<?> wildcardClass8 = userOptional7.getClass();
        org.junit.Assert.assertNotNull(userOptional3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 101 + "'", int4 == 101);
        org.junit.Assert.assertNotNull(userList5);
        org.junit.Assert.assertNotNull(userOptional7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test1533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1533");
        com.reservation_system.model.Guest guest5 = new com.reservation_system.model.Guest((int) '4', "Password1!", "demo/data/test-users.csv", "headlabcoordinator", false);
    }

    @Test
    public void test1534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1534");
        com.reservation_system.model.Student student5 = new com.reservation_system.model.Student(1, "", "andrew@example.com", "demo/data/test-users.csv", true);
    }

    @Test
    public void test1535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1535");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("demo/data/test-users.csv");
        com.reservation_system.services.RegistrationService registrationService2 = new com.reservation_system.services.RegistrationService(userRepository1);
        com.reservation_system.model.Faculty faculty8 = new com.reservation_system.model.Faculty(0, "Password1!", "demo/data/test-users.csv", "researcher", false);
        java.lang.String str9 = faculty8.getName();
        userRepository1.addUser((com.reservation_system.model.User) faculty8);
        boolean boolean11 = userRepository1.headLabCoordinatorExists();
        int int12 = userRepository1.getNextID();
        com.reservation_system.services.RegistrationService registrationService13 = new com.reservation_system.services.RegistrationService(userRepository1);
        // The following exception was thrown during execution in test generation
        try {
            com.reservation_system.model.User user18 = registrationService13.registerUser("Guest", "headlabcoordinator", "andrew@example.com", "");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Password is required.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Password1!" + "'", str9, "Password1!");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 101 + "'", int12 == 101);
    }

    @Test
    public void test1536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1536");
        com.reservation_system.model.LabManager labManager5 = new com.reservation_system.model.LabManager((int) '#', "headlabcoordinator", "", "Guest", true);
        java.lang.String str6 = labManager5.getEmail();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
    }

    @Test
    public void test1537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1537");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("demo/data/test-users.csv");
        com.reservation_system.services.RegistrationService registrationService2 = new com.reservation_system.services.RegistrationService(userRepository1);
        com.reservation_system.model.Faculty faculty8 = new com.reservation_system.model.Faculty(0, "Password1!", "demo/data/test-users.csv", "researcher", false);
        java.lang.String str9 = faculty8.getName();
        userRepository1.addUser((com.reservation_system.model.User) faculty8);
        com.reservation_system.services.RegistrationService registrationService11 = new com.reservation_system.services.RegistrationService(userRepository1);
        com.reservation_system.services.RegistrationService registrationService12 = new com.reservation_system.services.RegistrationService(userRepository1);
        com.reservation_system.services.RegistrationService registrationService13 = new com.reservation_system.services.RegistrationService(userRepository1);
        java.util.Optional<com.reservation_system.model.User> userOptional15 = userRepository1.findByEmail("Researcher");
        com.reservation_system.repository.UserRepository userRepository17 = new com.reservation_system.repository.UserRepository("demo/data/test-users.csv");
        boolean boolean18 = userRepository17.headLabCoordinatorExists();
        com.reservation_system.services.RegistrationService registrationService19 = new com.reservation_system.services.RegistrationService(userRepository17);
        boolean boolean20 = userRepository17.headLabCoordinatorExists();
        boolean boolean21 = userRepository17.headLabCoordinatorExists();
        boolean boolean22 = userRepository17.headLabCoordinatorExists();
        boolean boolean24 = userRepository17.emailExists("Student");
        java.util.Optional<com.reservation_system.model.User> userOptional26 = userRepository17.findByEmail("student");
        com.reservation_system.repository.UserRepository userRepository28 = new com.reservation_system.repository.UserRepository("demo/data/test-users.csv");
        com.reservation_system.services.RegistrationService registrationService29 = new com.reservation_system.services.RegistrationService(userRepository28);
        com.reservation_system.model.Faculty faculty35 = new com.reservation_system.model.Faculty(0, "Password1!", "demo/data/test-users.csv", "researcher", false);
        java.lang.String str36 = faculty35.getName();
        userRepository28.addUser((com.reservation_system.model.User) faculty35);
        com.reservation_system.services.RegistrationService registrationService38 = new com.reservation_system.services.RegistrationService(userRepository28);
        com.reservation_system.services.RegistrationService registrationService39 = new com.reservation_system.services.RegistrationService(userRepository28);
        com.reservation_system.services.RegistrationService registrationService40 = new com.reservation_system.services.RegistrationService(userRepository28);
        java.util.Optional<com.reservation_system.model.User> userOptional42 = userRepository28.findByEmail("Researcher");
        java.util.List<com.reservation_system.model.User> userList43 = userRepository28.getAllUsers();
        userRepository17.saveAllUsers(userList43);
        userRepository1.saveAllUsers(userList43);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Password1!" + "'", str9, "Password1!");
        org.junit.Assert.assertNotNull(userOptional15);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertNotNull(userOptional26);
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "Password1!" + "'", str36, "Password1!");
        org.junit.Assert.assertNotNull(userOptional42);
        org.junit.Assert.assertNotNull(userList43);
    }

    @Test
    public void test1538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1538");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("demo/data/test-users.csv");
        int int2 = userRepository1.getNextID();
        int int3 = userRepository1.getNextID();
        boolean boolean5 = userRepository1.emailExists("faculty");
        com.reservation_system.model.Faculty faculty11 = new com.reservation_system.model.Faculty(10, "researcher", "faculty", "", false);
        java.lang.String str12 = faculty11.getEmail();
        java.lang.String str13 = faculty11.getUserType();
        int int14 = faculty11.getID();
        userRepository1.addUser((com.reservation_system.model.User) faculty11);
        java.lang.String str16 = faculty11.getEmail();
        java.lang.String str17 = faculty11.getUserType();
        java.lang.String str18 = faculty11.getName();
        java.lang.String str19 = faculty11.getPassword();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 101 + "'", int2 == 101);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 101 + "'", int3 == 101);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "faculty" + "'", str12, "faculty");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Faculty" + "'", str13, "Faculty");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 10 + "'", int14 == 10);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "faculty" + "'", str16, "faculty");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "Faculty" + "'", str17, "Faculty");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "researcher" + "'", str18, "researcher");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
    }

    @Test
    public void test1539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1539");
        com.reservation_system.model.Researcher researcher5 = new com.reservation_system.model.Researcher(102, "Password1!", "hi!", "andrew@example.com", true);
        researcher5.setApproved(false);
        int int8 = researcher5.getID();
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 102 + "'", int8 == 102);
    }

    @Test
    public void test1540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1540");
        com.reservation_system.model.HeadLabCoordinator headLabCoordinator5 = new com.reservation_system.model.HeadLabCoordinator(1, "student", "Researcher", "", false);
        java.lang.String str6 = headLabCoordinator5.getUserType();
        java.lang.String str7 = headLabCoordinator5.getUserType();
        java.lang.String str8 = headLabCoordinator5.getName();
        java.lang.String str9 = headLabCoordinator5.getUserType();
        int int10 = headLabCoordinator5.getID();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "headlabcoordinator" + "'", str6, "headlabcoordinator");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "headlabcoordinator" + "'", str7, "headlabcoordinator");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "student" + "'", str8, "student");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "headlabcoordinator" + "'", str9, "headlabcoordinator");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
    }

    @Test
    public void test1541() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1541");
        // The following exception was thrown during execution in test generation
        try {
            com.reservation_system.model.User user6 = com.reservation_system.patterns.factory.UserFactory.createUser("demo/data/test-users.csv", (int) (short) 10, "demo/data/test-users.csv", "Guest", "hi!", true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid user type: demo/data/test-users.csv");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1542() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1542");
        com.reservation_system.model.HeadLabCoordinator headLabCoordinator5 = new com.reservation_system.model.HeadLabCoordinator((int) (byte) 1, "student", "faculty", "", false);
        java.lang.String str6 = headLabCoordinator5.getPassword();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
    }

    @Test
    public void test1543() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1543");
        com.reservation_system.model.Researcher researcher5 = new com.reservation_system.model.Researcher(32, "faculty", "andrew@example.com", "hi!", true);
    }

    @Test
    public void test1544() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1544");
        com.reservation_system.model.User user6 = com.reservation_system.patterns.factory.UserFactory.createUser("Researcher", (int) (short) 10, "Password1!", "labmanager", "Guest", false);
        org.junit.Assert.assertNotNull(user6);
    }

    @Test
    public void test1545() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1545");
        com.reservation_system.model.Faculty faculty5 = new com.reservation_system.model.Faculty((int) (short) 10, "", "demo/data/test-users.csv", "", false);
    }

    @Test
    public void test1546() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1546");
        com.reservation_system.model.Faculty faculty5 = new com.reservation_system.model.Faculty((int) (short) 0, "Student", "hi!", "guest", false);
    }

    @Test
    public void test1547() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1547");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("demo/data/test-users.csv");
        int int2 = userRepository1.getNextID();
        int int3 = userRepository1.getNextID();
        boolean boolean5 = userRepository1.emailExists("faculty");
        com.reservation_system.model.LabManager labManager11 = new com.reservation_system.model.LabManager(10, "Faculty", "faculty", "Password1!", true);
        java.lang.String str12 = labManager11.getUserType();
        userRepository1.addUser((com.reservation_system.model.User) labManager11);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 101 + "'", int2 == 101);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 101 + "'", int3 == 101);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "labmanager" + "'", str12, "labmanager");
    }

    @Test
    public void test1548() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1548");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("demo/data/test-users.csv");
        com.reservation_system.services.RegistrationService registrationService2 = new com.reservation_system.services.RegistrationService(userRepository1);
        com.reservation_system.model.Faculty faculty8 = new com.reservation_system.model.Faculty(0, "Password1!", "demo/data/test-users.csv", "researcher", false);
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
            com.reservation_system.model.User user29 = registrationService24.registerUser("Andrew", "Researcher", "guest", "Password1!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid user type.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Password1!" + "'", str9, "Password1!");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
// flaky "9) test1548(com.reservation_system.randoop.registrationservice.RegressionTest3)":         org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
// flaky "6) test1548(com.reservation_system.randoop.registrationservice.RegressionTest3)":         org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 101 + "'", int23 == 101);
    }

    @Test
    public void test1549() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1549");
        com.reservation_system.model.User user6 = com.reservation_system.patterns.factory.UserFactory.createUser("labmanager", 100, "student", "", "guest", true);
        org.junit.Assert.assertNotNull(user6);
    }

    @Test
    public void test1550() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1550");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("demo/data/test-users.csv");
        boolean boolean2 = userRepository1.headLabCoordinatorExists();
        com.reservation_system.services.RegistrationService registrationService3 = new com.reservation_system.services.RegistrationService(userRepository1);
        boolean boolean5 = userRepository1.emailExists("");
        boolean boolean6 = userRepository1.headLabCoordinatorExists();
        java.util.List<com.reservation_system.model.User> userList7 = userRepository1.getAllUsers();
        boolean boolean9 = userRepository1.emailExists("faculty");
        java.util.List<com.reservation_system.model.User> userList10 = userRepository1.getAllUsers();
        com.reservation_system.services.RegistrationService registrationService11 = new com.reservation_system.services.RegistrationService(userRepository1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(userList7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(userList10);
    }

    @Test
    public void test1551() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1551");
        com.reservation_system.model.Faculty faculty5 = new com.reservation_system.model.Faculty((int) (short) 0, "faculty", "Student", "", true);
    }

    @Test
    public void test1552() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1552");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("demo/data/test-users.csv");
        int int2 = userRepository1.getNextID();
        com.reservation_system.model.Researcher researcher8 = new com.reservation_system.model.Researcher((int) (short) -1, "andrew@example.com", "guest", "labmanager", false);
        java.lang.String str9 = researcher8.getPassword();
        researcher8.setApproved(true);
        java.lang.String str12 = researcher8.getEmail();
        userRepository1.addUser((com.reservation_system.model.User) researcher8);
        boolean boolean15 = userRepository1.emailExists("Student");
        boolean boolean16 = userRepository1.headLabCoordinatorExists();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 101 + "'", int2 == 101);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "labmanager" + "'", str9, "labmanager");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "guest" + "'", str12, "guest");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
    }

    @Test
    public void test1553() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1553");
        com.reservation_system.model.Faculty faculty5 = new com.reservation_system.model.Faculty(10, "researcher", "Guest", "andrew@example.com", true);
        java.lang.String str6 = faculty5.getUserType();
        faculty5.setApproved(true);
        java.lang.String str9 = faculty5.getName();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Faculty" + "'", str6, "Faculty");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "researcher" + "'", str9, "researcher");
    }

    @Test
    public void test1554() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1554");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("demo/data/test-users.csv");
        com.reservation_system.services.RegistrationService registrationService2 = new com.reservation_system.services.RegistrationService(userRepository1);
        com.reservation_system.model.Faculty faculty8 = new com.reservation_system.model.Faculty(0, "Password1!", "demo/data/test-users.csv", "researcher", false);
        java.lang.String str9 = faculty8.getName();
        userRepository1.addUser((com.reservation_system.model.User) faculty8);
        boolean boolean11 = userRepository1.headLabCoordinatorExists();
        com.reservation_system.model.Guest guest17 = new com.reservation_system.model.Guest((int) (byte) -1, "guest", "Researcher", "Faculty", true);
        userRepository1.addUser((com.reservation_system.model.User) guest17);
        boolean boolean20 = userRepository1.emailExists("Password1!");
        boolean boolean22 = userRepository1.emailExists("hi!");
        int int23 = userRepository1.getNextID();
        int int24 = userRepository1.getNextID();
        java.util.List<com.reservation_system.model.User> userList25 = userRepository1.getAllUsers();
        boolean boolean26 = userRepository1.headLabCoordinatorExists();
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Password1!" + "'", str9, "Password1!");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
// flaky "10) test1554(com.reservation_system.randoop.registrationservice.RegressionTest3)":         org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
// flaky "7) test1554(com.reservation_system.randoop.registrationservice.RegressionTest3)":         org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 101 + "'", int23 == 101);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 101 + "'", int24 == 101);
        org.junit.Assert.assertNotNull(userList25);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
    }

    @Test
    public void test1555() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1555");
        com.reservation_system.model.Researcher researcher5 = new com.reservation_system.model.Researcher((int) (short) 100, "headlabcoordinator", "faculty", "", true);
        int int6 = researcher5.getID();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
    }

    @Test
    public void test1556() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1556");
        com.reservation_system.model.Student student5 = new com.reservation_system.model.Student((int) '#', "faculty", "Faculty", "andrew@example.com", true);
        java.lang.String str6 = student5.getUserType();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Student" + "'", str6, "Student");
    }

    @Test
    public void test1557() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1557");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("demo/data/test-users.csv");
        com.reservation_system.services.RegistrationService registrationService2 = new com.reservation_system.services.RegistrationService(userRepository1);
        com.reservation_system.model.Faculty faculty8 = new com.reservation_system.model.Faculty(0, "Password1!", "demo/data/test-users.csv", "researcher", false);
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
        int int30 = userRepository1.getNextID();
        java.util.Optional<com.reservation_system.model.User> userOptional32 = userRepository1.findByEmail("Researcher");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Password1!" + "'", str9, "Password1!");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "Researcher" + "'", str26, "Researcher");
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 101 + "'", int30 == 101);
        org.junit.Assert.assertNotNull(userOptional32);
    }

    @Test
    public void test1558() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1558");
        com.reservation_system.model.Student student5 = new com.reservation_system.model.Student(33, "demo/data/test-users.csv", "Student", "researcher", true);
    }

    @Test
    public void test1559() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1559");
        com.reservation_system.model.LabManager labManager5 = new com.reservation_system.model.LabManager(0, "guest", "student", "faculty", false);
        boolean boolean6 = labManager5.requiresDepartmentApproval();
        java.lang.String str7 = labManager5.getUserType();
        boolean boolean8 = labManager5.isApproved();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "labmanager" + "'", str7, "labmanager");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test1560() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1560");
        com.reservation_system.model.LabManager labManager5 = new com.reservation_system.model.LabManager((int) (short) 0, "", "labmanager", "Password1!", true);
        labManager5.setApproved(false);
        java.lang.String str8 = labManager5.getEmail();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "labmanager" + "'", str8, "labmanager");
    }

    @Test
    public void test1561() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1561");
        com.reservation_system.model.LabManager labManager5 = new com.reservation_system.model.LabManager((int) (short) 10, "Andrew", "Researcher", "Researcher", false);
        int int6 = labManager5.getID();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
    }

    @Test
    public void test1562() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1562");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("demo/data/test-users.csv");
        boolean boolean2 = userRepository1.headLabCoordinatorExists();
        com.reservation_system.services.RegistrationService registrationService3 = new com.reservation_system.services.RegistrationService(userRepository1);
        boolean boolean4 = userRepository1.headLabCoordinatorExists();
        boolean boolean6 = userRepository1.emailExists("Andrew");
        com.reservation_system.services.RegistrationService registrationService7 = new com.reservation_system.services.RegistrationService(userRepository1);
        com.reservation_system.repository.UserRepository userRepository9 = new com.reservation_system.repository.UserRepository("demo/data/test-users.csv");
        com.reservation_system.services.RegistrationService registrationService10 = new com.reservation_system.services.RegistrationService(userRepository9);
        com.reservation_system.model.Faculty faculty16 = new com.reservation_system.model.Faculty(0, "Password1!", "demo/data/test-users.csv", "researcher", false);
        java.lang.String str17 = faculty16.getName();
        userRepository9.addUser((com.reservation_system.model.User) faculty16);
        boolean boolean19 = userRepository9.headLabCoordinatorExists();
        com.reservation_system.model.Guest guest25 = new com.reservation_system.model.Guest((int) (byte) -1, "guest", "Researcher", "Faculty", true);
        userRepository9.addUser((com.reservation_system.model.User) guest25);
        java.util.List<com.reservation_system.model.User> userList27 = userRepository9.getAllUsers();
        userRepository1.saveAllUsers(userList27);
        boolean boolean29 = userRepository1.headLabCoordinatorExists();
        java.util.Optional<com.reservation_system.model.User> userOptional31 = userRepository1.findByEmail("student");
        int int32 = userRepository1.getNextID();
        java.util.List<com.reservation_system.model.User> userList33 = userRepository1.getAllUsers();
        com.reservation_system.services.RegistrationService registrationService34 = new com.reservation_system.services.RegistrationService(userRepository1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "Password1!" + "'", str17, "Password1!");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNotNull(userList27);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertNotNull(userOptional31);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 101 + "'", int32 == 101);
        org.junit.Assert.assertNotNull(userList33);
    }

    @Test
    public void test1563() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1563");
        com.reservation_system.model.Guest guest5 = new com.reservation_system.model.Guest((int) (byte) 1, "labmanager", "student", "faculty", false);
        boolean boolean6 = guest5.isApproved();
        java.lang.String str7 = guest5.getUserType();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Guest" + "'", str7, "Guest");
    }

    @Test
    public void test1564() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1564");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("demo/data/test-users.csv");
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
        // The following exception was thrown during execution in test generation
        try {
            com.reservation_system.model.User user28 = registrationService23.registerUser("guest", "demo/data/test-users.csv", "Password1!", "Faculty");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid email format.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 101 + "'", int2 == 101);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 101 + "'", int3 == 101);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(userOptional14);
        org.junit.Assert.assertNotNull(userList22);
    }

    @Test
    public void test1565() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1565");
        com.reservation_system.model.LabManager labManager5 = new com.reservation_system.model.LabManager(100, "Researcher", "faculty", "Password1!", true);
        java.lang.Class<?> wildcardClass6 = labManager5.getClass();
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test1566() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1566");
        // The following exception was thrown during execution in test generation
        try {
            com.reservation_system.model.User user6 = com.reservation_system.patterns.factory.UserFactory.createUser("", 102, "Faculty", "guest", "andrew@example.com", false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid user type: ");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1567() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1567");
        com.reservation_system.model.HeadLabCoordinator headLabCoordinator5 = new com.reservation_system.model.HeadLabCoordinator((int) (byte) 1, "student", "faculty", "", false);
        java.lang.String str6 = headLabCoordinator5.getUserType();
        java.lang.String str7 = headLabCoordinator5.getUserType();
        java.lang.String str8 = headLabCoordinator5.getUserType();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "headlabcoordinator" + "'", str6, "headlabcoordinator");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "headlabcoordinator" + "'", str7, "headlabcoordinator");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "headlabcoordinator" + "'", str8, "headlabcoordinator");
    }

    @Test
    public void test1568() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1568");
        com.reservation_system.model.Researcher researcher5 = new com.reservation_system.model.Researcher((int) (short) -1, "labmanager", "Faculty", "Guest", true);
        java.lang.String str6 = researcher5.getEmail();
        java.lang.String str7 = researcher5.getEmail();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Faculty" + "'", str6, "Faculty");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Faculty" + "'", str7, "Faculty");
    }

    @Test
    public void test1569() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1569");
        com.reservation_system.model.Student student5 = new com.reservation_system.model.Student(52, "", "Faculty", "Faculty", true);
        java.lang.String str6 = student5.getName();
        java.lang.String str7 = student5.getUserType();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Student" + "'", str7, "Student");
    }

    @Test
    public void test1570() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1570");
        com.reservation_system.model.Student student5 = new com.reservation_system.model.Student(97, "student", "Guest", "researcher", false);
    }

    @Test
    public void test1571() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1571");
        com.reservation_system.model.HeadLabCoordinator headLabCoordinator5 = new com.reservation_system.model.HeadLabCoordinator((int) (byte) -1, "guest", "Guest", "labmanager", false);
        headLabCoordinator5.setApproved(false);
    }

    @Test
    public void test1572() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1572");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("demo/data/test-users.csv");
        int int2 = userRepository1.getNextID();
        int int3 = userRepository1.getNextID();
        boolean boolean5 = userRepository1.emailExists("faculty");
        java.util.Optional<com.reservation_system.model.User> userOptional7 = userRepository1.findByEmail("");
        java.util.List<com.reservation_system.model.User> userList8 = userRepository1.getAllUsers();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 101 + "'", int2 == 101);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 101 + "'", int3 == 101);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(userOptional7);
        org.junit.Assert.assertNotNull(userList8);
    }

    @Test
    public void test1573() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1573");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("demo/data/test-users.csv");
        boolean boolean2 = userRepository1.headLabCoordinatorExists();
        java.util.Optional<com.reservation_system.model.User> userOptional4 = userRepository1.findByEmail("student");
        int int5 = userRepository1.getNextID();
        java.util.Optional<com.reservation_system.model.User> userOptional7 = userRepository1.findByEmail("Andrew");
        boolean boolean9 = userRepository1.emailExists("guest");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(userOptional4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 101 + "'", int5 == 101);
        org.junit.Assert.assertNotNull(userOptional7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test1574() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1574");
        // The following exception was thrown during execution in test generation
        try {
            com.reservation_system.model.User user6 = com.reservation_system.patterns.factory.UserFactory.createUser("andrew@example.com", 33, "demo/data/test-users.csv", "researcher", "Guest", false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid user type: andrew@example.com");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1575() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1575");
        com.reservation_system.model.Guest guest5 = new com.reservation_system.model.Guest((int) 'a', "labmanager", "headlabcoordinator", "Researcher", true);
        java.lang.Class<?> wildcardClass6 = guest5.getClass();
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test1576() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1576");
        com.reservation_system.model.LabManager labManager5 = new com.reservation_system.model.LabManager((int) 'a', "headlabcoordinator", "Researcher", "Andrew", false);
        java.lang.String str6 = labManager5.getEmail();
        java.lang.String str7 = labManager5.getName();
        java.lang.String str8 = labManager5.getName();
        java.lang.String str9 = labManager5.getUserType();
        java.lang.String str10 = labManager5.getUserType();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Researcher" + "'", str6, "Researcher");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "headlabcoordinator" + "'", str7, "headlabcoordinator");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "headlabcoordinator" + "'", str8, "headlabcoordinator");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "labmanager" + "'", str9, "labmanager");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "labmanager" + "'", str10, "labmanager");
    }

    @Test
    public void test1577() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1577");
        com.reservation_system.model.HeadLabCoordinator headLabCoordinator5 = new com.reservation_system.model.HeadLabCoordinator(0, "Password1!", "Faculty", "Faculty", false);
        headLabCoordinator5.setApproved(true);
        boolean boolean8 = headLabCoordinator5.requiresDepartmentApproval();
        java.lang.String str9 = headLabCoordinator5.getUserType();
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "headlabcoordinator" + "'", str9, "headlabcoordinator");
    }

    @Test
    public void test1578() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1578");
        com.reservation_system.model.User user6 = com.reservation_system.patterns.factory.UserFactory.createUser("faculty", 100, "", "guest", "researcher", true);
        java.lang.String str7 = user6.getPassword();
        org.junit.Assert.assertNotNull(user6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "researcher" + "'", str7, "researcher");
    }

    @Test
    public void test1579() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1579");
        com.reservation_system.model.Guest guest5 = new com.reservation_system.model.Guest(100, "headlabcoordinator", "faculty", "Faculty", true);
        java.lang.String str6 = guest5.getUserType();
        java.lang.String str7 = guest5.getUserType();
        boolean boolean8 = guest5.isApproved();
        java.lang.String str9 = guest5.getPassword();
        java.lang.String str10 = guest5.getUserType();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Guest" + "'", str6, "Guest");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Guest" + "'", str7, "Guest");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Faculty" + "'", str9, "Faculty");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Guest" + "'", str10, "Guest");
    }

    @Test
    public void test1580() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1580");
        com.reservation_system.model.Student student5 = new com.reservation_system.model.Student((int) (byte) 10, "Password1!", "Faculty", "demo/data/test-users.csv", false);
        java.lang.String str6 = student5.getUserType();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Student" + "'", str6, "Student");
    }

    @Test
    public void test1581() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1581");
        com.reservation_system.model.Faculty faculty5 = new com.reservation_system.model.Faculty(10, "researcher", "faculty", "", false);
        java.lang.String str6 = faculty5.getEmail();
        java.lang.String str7 = faculty5.getUserType();
        faculty5.setApproved(false);
        int int10 = faculty5.getID();
        java.lang.String str11 = faculty5.getEmail();
        java.lang.String str12 = faculty5.getUserType();
        java.lang.String str13 = faculty5.getUserType();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "faculty" + "'", str6, "faculty");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Faculty" + "'", str7, "Faculty");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 10 + "'", int10 == 10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "faculty" + "'", str11, "faculty");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Faculty" + "'", str12, "Faculty");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Faculty" + "'", str13, "Faculty");
    }

    @Test
    public void test1582() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1582");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("demo/data/test-users.csv");
        boolean boolean2 = userRepository1.headLabCoordinatorExists();
        com.reservation_system.services.RegistrationService registrationService3 = new com.reservation_system.services.RegistrationService(userRepository1);
        boolean boolean5 = userRepository1.emailExists("");
        boolean boolean6 = userRepository1.headLabCoordinatorExists();
        java.util.List<com.reservation_system.model.User> userList7 = userRepository1.getAllUsers();
        int int8 = userRepository1.getNextID();
        com.reservation_system.repository.UserRepository userRepository10 = new com.reservation_system.repository.UserRepository("demo/data/test-users.csv");
        java.util.List<com.reservation_system.model.User> userList11 = userRepository10.getAllUsers();
        com.reservation_system.services.RegistrationService registrationService12 = new com.reservation_system.services.RegistrationService(userRepository10);
        com.reservation_system.services.RegistrationService registrationService13 = new com.reservation_system.services.RegistrationService(userRepository10);
        java.util.List<com.reservation_system.model.User> userList14 = userRepository10.getAllUsers();
        userRepository1.saveAllUsers(userList14);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(userList7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 101 + "'", int8 == 101);
        org.junit.Assert.assertNotNull(userList11);
        org.junit.Assert.assertNotNull(userList14);
    }

    @Test
    public void test1583() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1583");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("demo/data/test-users.csv");
        boolean boolean2 = userRepository1.headLabCoordinatorExists();
        com.reservation_system.services.RegistrationService registrationService3 = new com.reservation_system.services.RegistrationService(userRepository1);
        boolean boolean4 = userRepository1.headLabCoordinatorExists();
        boolean boolean6 = userRepository1.emailExists("Andrew");
        com.reservation_system.services.RegistrationService registrationService7 = new com.reservation_system.services.RegistrationService(userRepository1);
        java.util.Optional<com.reservation_system.model.User> userOptional9 = userRepository1.findByEmail("faculty");
        com.reservation_system.services.RegistrationService registrationService10 = new com.reservation_system.services.RegistrationService(userRepository1);
        com.reservation_system.repository.UserRepository userRepository12 = new com.reservation_system.repository.UserRepository("demo/data/test-users.csv");
        com.reservation_system.services.RegistrationService registrationService13 = new com.reservation_system.services.RegistrationService(userRepository12);
        com.reservation_system.model.Faculty faculty19 = new com.reservation_system.model.Faculty(0, "Password1!", "demo/data/test-users.csv", "researcher", false);
        java.lang.String str20 = faculty19.getName();
        userRepository12.addUser((com.reservation_system.model.User) faculty19);
        boolean boolean22 = userRepository12.headLabCoordinatorExists();
        com.reservation_system.model.Guest guest28 = new com.reservation_system.model.Guest((int) (byte) -1, "guest", "Researcher", "Faculty", true);
        userRepository12.addUser((com.reservation_system.model.User) guest28);
        boolean boolean31 = userRepository12.emailExists("Password1!");
        com.reservation_system.repository.UserRepository userRepository33 = new com.reservation_system.repository.UserRepository("demo/data/test-users.csv");
        com.reservation_system.services.RegistrationService registrationService34 = new com.reservation_system.services.RegistrationService(userRepository33);
        com.reservation_system.model.Faculty faculty40 = new com.reservation_system.model.Faculty(0, "Password1!", "demo/data/test-users.csv", "researcher", false);
        java.lang.String str41 = faculty40.getName();
        userRepository33.addUser((com.reservation_system.model.User) faculty40);
        boolean boolean43 = userRepository33.headLabCoordinatorExists();
        com.reservation_system.services.RegistrationService registrationService44 = new com.reservation_system.services.RegistrationService(userRepository33);
        java.util.List<com.reservation_system.model.User> userList45 = userRepository33.getAllUsers();
        com.reservation_system.repository.UserRepository userRepository47 = new com.reservation_system.repository.UserRepository("demo/data/test-users.csv");
        com.reservation_system.services.RegistrationService registrationService48 = new com.reservation_system.services.RegistrationService(userRepository47);
        com.reservation_system.model.Faculty faculty54 = new com.reservation_system.model.Faculty(0, "Password1!", "demo/data/test-users.csv", "researcher", false);
        java.lang.String str55 = faculty54.getName();
        userRepository47.addUser((com.reservation_system.model.User) faculty54);
        boolean boolean57 = userRepository47.headLabCoordinatorExists();
        com.reservation_system.services.RegistrationService registrationService58 = new com.reservation_system.services.RegistrationService(userRepository47);
        java.util.List<com.reservation_system.model.User> userList59 = userRepository47.getAllUsers();
        userRepository33.saveAllUsers(userList59);
        userRepository12.saveAllUsers(userList59);
        java.util.List<com.reservation_system.model.User> userList62 = userRepository12.getAllUsers();
        userRepository1.saveAllUsers(userList62);
        com.reservation_system.repository.UserRepository userRepository65 = new com.reservation_system.repository.UserRepository("demo/data/test-users.csv");
        java.util.List<com.reservation_system.model.User> userList66 = userRepository65.getAllUsers();
        com.reservation_system.services.RegistrationService registrationService67 = new com.reservation_system.services.RegistrationService(userRepository65);
        java.util.List<com.reservation_system.model.User> userList68 = userRepository65.getAllUsers();
        userRepository1.saveAllUsers(userList68);
        com.reservation_system.repository.UserRepository userRepository71 = new com.reservation_system.repository.UserRepository("demo/data/test-users.csv");
        com.reservation_system.services.RegistrationService registrationService72 = new com.reservation_system.services.RegistrationService(userRepository71);
        com.reservation_system.model.Faculty faculty78 = new com.reservation_system.model.Faculty(0, "Password1!", "demo/data/test-users.csv", "researcher", false);
        java.lang.String str79 = faculty78.getName();
        userRepository71.addUser((com.reservation_system.model.User) faculty78);
        boolean boolean81 = userRepository71.headLabCoordinatorExists();
        com.reservation_system.model.Guest guest87 = new com.reservation_system.model.Guest((int) (byte) -1, "guest", "Researcher", "Faculty", true);
        userRepository71.addUser((com.reservation_system.model.User) guest87);
        boolean boolean90 = userRepository71.emailExists("Password1!");
        boolean boolean92 = userRepository71.emailExists("hi!");
        int int93 = userRepository71.getNextID();
        int int94 = userRepository71.getNextID();
        boolean boolean95 = userRepository71.headLabCoordinatorExists();
        java.util.List<com.reservation_system.model.User> userList96 = userRepository71.getAllUsers();
        userRepository1.saveAllUsers(userList96);
        boolean boolean99 = userRepository1.emailExists("labmanager");
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
        org.junit.Assert.assertNotNull(userList66);
        org.junit.Assert.assertNotNull(userList68);
        org.junit.Assert.assertEquals("'" + str79 + "' != '" + "Password1!" + "'", str79, "Password1!");
        org.junit.Assert.assertTrue("'" + boolean81 + "' != '" + true + "'", boolean81 == true);
        org.junit.Assert.assertTrue("'" + boolean90 + "' != '" + true + "'", boolean90 == true);
// flaky "11) test1583(com.reservation_system.randoop.registrationservice.RegressionTest3)":         org.junit.Assert.assertTrue("'" + boolean92 + "' != '" + true + "'", boolean92 == true);
        org.junit.Assert.assertTrue("'" + int93 + "' != '" + 101 + "'", int93 == 101);
        org.junit.Assert.assertTrue("'" + int94 + "' != '" + 101 + "'", int94 == 101);
        org.junit.Assert.assertTrue("'" + boolean95 + "' != '" + true + "'", boolean95 == true);
        org.junit.Assert.assertNotNull(userList96);
        org.junit.Assert.assertTrue("'" + boolean99 + "' != '" + true + "'", boolean99 == true);
    }

    @Test
    public void test1584() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1584");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("demo/data/test-users.csv");
        com.reservation_system.services.RegistrationService registrationService2 = new com.reservation_system.services.RegistrationService(userRepository1);
        com.reservation_system.model.Faculty faculty8 = new com.reservation_system.model.Faculty(0, "Password1!", "demo/data/test-users.csv", "researcher", false);
        java.lang.String str9 = faculty8.getName();
        userRepository1.addUser((com.reservation_system.model.User) faculty8);
        com.reservation_system.services.RegistrationService registrationService11 = new com.reservation_system.services.RegistrationService(userRepository1);
        com.reservation_system.services.RegistrationService registrationService12 = new com.reservation_system.services.RegistrationService(userRepository1);
        com.reservation_system.services.RegistrationService registrationService13 = new com.reservation_system.services.RegistrationService(userRepository1);
        // The following exception was thrown during execution in test generation
        try {
            com.reservation_system.model.User user18 = registrationService13.registerUser("andrew@example.com", "hi!", "student", "");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid user type.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Password1!" + "'", str9, "Password1!");
    }

    @Test
    public void test1585() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1585");
        com.reservation_system.model.LabManager labManager5 = new com.reservation_system.model.LabManager(10, "Faculty", "faculty", "Password1!", true);
        java.lang.String str6 = labManager5.getUserType();
        java.lang.String str7 = labManager5.getUserType();
        java.lang.String str8 = labManager5.getUserType();
        boolean boolean9 = labManager5.isApproved();
        boolean boolean10 = labManager5.requiresDepartmentApproval();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "labmanager" + "'", str6, "labmanager");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "labmanager" + "'", str7, "labmanager");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "labmanager" + "'", str8, "labmanager");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test1586() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1586");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("demo/data/test-users.csv");
        com.reservation_system.services.RegistrationService registrationService2 = new com.reservation_system.services.RegistrationService(userRepository1);
        com.reservation_system.model.Faculty faculty8 = new com.reservation_system.model.Faculty(0, "Password1!", "demo/data/test-users.csv", "researcher", false);
        java.lang.String str9 = faculty8.getName();
        userRepository1.addUser((com.reservation_system.model.User) faculty8);
        boolean boolean12 = userRepository1.emailExists("Faculty");
        int int13 = userRepository1.getNextID();
        int int14 = userRepository1.getNextID();
        com.reservation_system.model.Guest guest20 = new com.reservation_system.model.Guest((int) '#', "Guest", "researcher", "headlabcoordinator", true);
        userRepository1.addUser((com.reservation_system.model.User) guest20);
        int int22 = userRepository1.getNextID();
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Password1!" + "'", str9, "Password1!");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 101 + "'", int13 == 101);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 101 + "'", int14 == 101);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 101 + "'", int22 == 101);
    }

    @Test
    public void test1587() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1587");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("demo/data/test-users.csv");
        java.util.List<com.reservation_system.model.User> userList2 = userRepository1.getAllUsers();
        com.reservation_system.services.RegistrationService registrationService3 = new com.reservation_system.services.RegistrationService(userRepository1);
        int int4 = userRepository1.getNextID();
        com.reservation_system.services.RegistrationService registrationService5 = new com.reservation_system.services.RegistrationService(userRepository1);
        org.junit.Assert.assertNotNull(userList2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 101 + "'", int4 == 101);
    }

    @Test
    public void test1588() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1588");
        com.reservation_system.model.LabManager labManager5 = new com.reservation_system.model.LabManager((int) (short) -1, "Andrew", "Andrew", "labmanager", true);
        java.lang.String str6 = labManager5.getUserType();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "labmanager" + "'", str6, "labmanager");
    }

    @Test
    public void test1589() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1589");
        com.reservation_system.model.Guest guest5 = new com.reservation_system.model.Guest((int) (byte) 100, "andrew@example.com", "student", "Researcher", false);
        java.lang.String str6 = guest5.getUserType();
        java.lang.String str7 = guest5.getPassword();
        java.lang.String str8 = guest5.getUserType();
        java.lang.String str9 = guest5.getName();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Guest" + "'", str6, "Guest");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Researcher" + "'", str7, "Researcher");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Guest" + "'", str8, "Guest");
    }

    @Test
    public void test1590() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1590");
        com.reservation_system.model.Student student5 = new com.reservation_system.model.Student((int) (short) -1, "Andrew", "Guest", "Faculty", true);
        java.lang.String str6 = student5.getUserType();
        int int7 = student5.getID();
        boolean boolean8 = student5.isApproved();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Student" + "'", str6, "Student");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test1591() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1591");
        com.reservation_system.model.LabManager labManager5 = new com.reservation_system.model.LabManager(52, "Researcher", "andrew@example.com", "Password1!", true);
        java.lang.String str6 = labManager5.getUserType();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "labmanager" + "'", str6, "labmanager");
    }

    @Test
    public void test1592() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1592");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("demo/data/test-users.csv");
        java.util.List<com.reservation_system.model.User> userList2 = userRepository1.getAllUsers();
        com.reservation_system.services.RegistrationService registrationService3 = new com.reservation_system.services.RegistrationService(userRepository1);
        com.reservation_system.services.RegistrationService registrationService4 = new com.reservation_system.services.RegistrationService(userRepository1);
        java.util.List<com.reservation_system.model.User> userList5 = userRepository1.getAllUsers();
        java.util.List<com.reservation_system.model.User> userList6 = userRepository1.getAllUsers();
        java.util.List<com.reservation_system.model.User> userList7 = null;
        // The following exception was thrown during execution in test generation
        try {
            userRepository1.saveAllUsers(userList7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(userList2);
        org.junit.Assert.assertNotNull(userList5);
        org.junit.Assert.assertNotNull(userList6);
    }

    @Test
    public void test1593() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1593");
        com.reservation_system.model.HeadLabCoordinator headLabCoordinator5 = new com.reservation_system.model.HeadLabCoordinator((int) (byte) 100, "demo/data/test-users.csv", "Guest", "Andrew", false);
        boolean boolean6 = headLabCoordinator5.requiresDepartmentApproval();
        java.lang.String str7 = headLabCoordinator5.getUserType();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "headlabcoordinator" + "'", str7, "headlabcoordinator");
    }

    @Test
    public void test1594() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1594");
        com.reservation_system.model.Faculty faculty5 = new com.reservation_system.model.Faculty((int) (byte) -1, "Faculty", "Guest", "Faculty", false);
        java.lang.String str6 = faculty5.getName();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Faculty" + "'", str6, "Faculty");
    }

    @Test
    public void test1595() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1595");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("demo/data/test-users.csv");
        java.util.List<com.reservation_system.model.User> userList2 = userRepository1.getAllUsers();
        com.reservation_system.services.RegistrationService registrationService3 = new com.reservation_system.services.RegistrationService(userRepository1);
        java.util.List<com.reservation_system.model.User> userList4 = userRepository1.getAllUsers();
        com.reservation_system.services.RegistrationService registrationService5 = new com.reservation_system.services.RegistrationService(userRepository1);
        com.reservation_system.repository.UserRepository userRepository7 = new com.reservation_system.repository.UserRepository("demo/data/test-users.csv");
        boolean boolean8 = userRepository7.headLabCoordinatorExists();
        com.reservation_system.services.RegistrationService registrationService9 = new com.reservation_system.services.RegistrationService(userRepository7);
        boolean boolean10 = userRepository7.headLabCoordinatorExists();
        boolean boolean12 = userRepository7.emailExists("Andrew");
        com.reservation_system.services.RegistrationService registrationService13 = new com.reservation_system.services.RegistrationService(userRepository7);
        com.reservation_system.repository.UserRepository userRepository15 = new com.reservation_system.repository.UserRepository("demo/data/test-users.csv");
        com.reservation_system.services.RegistrationService registrationService16 = new com.reservation_system.services.RegistrationService(userRepository15);
        com.reservation_system.model.Faculty faculty22 = new com.reservation_system.model.Faculty(0, "Password1!", "demo/data/test-users.csv", "researcher", false);
        java.lang.String str23 = faculty22.getName();
        userRepository15.addUser((com.reservation_system.model.User) faculty22);
        boolean boolean25 = userRepository15.headLabCoordinatorExists();
        com.reservation_system.model.Guest guest31 = new com.reservation_system.model.Guest((int) (byte) -1, "guest", "Researcher", "Faculty", true);
        userRepository15.addUser((com.reservation_system.model.User) guest31);
        java.util.List<com.reservation_system.model.User> userList33 = userRepository15.getAllUsers();
        userRepository7.saveAllUsers(userList33);
        userRepository1.saveAllUsers(userList33);
        java.lang.Class<?> wildcardClass36 = userList33.getClass();
        org.junit.Assert.assertNotNull(userList2);
        org.junit.Assert.assertNotNull(userList4);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "Password1!" + "'", str23, "Password1!");
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(userList33);
        org.junit.Assert.assertNotNull(wildcardClass36);
    }

    @Test
    public void test1596() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1596");
        com.reservation_system.model.Faculty faculty5 = new com.reservation_system.model.Faculty((int) '4', "student", "andrew@example.com", "Guest", true);
        boolean boolean6 = faculty5.isApproved();
        faculty5.setApproved(false);
        int int9 = faculty5.getID();
        int int10 = faculty5.getID();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 52 + "'", int9 == 52);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 52 + "'", int10 == 52);
    }

    @Test
    public void test1597() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1597");
        com.reservation_system.model.Guest guest5 = new com.reservation_system.model.Guest((int) (short) 100, "guest", "faculty", "student", false);
        java.lang.String str6 = guest5.getUserType();
        java.lang.String str7 = guest5.getUserType();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Guest" + "'", str6, "Guest");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Guest" + "'", str7, "Guest");
    }

    @Test
    public void test1598() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1598");
        // The following exception was thrown during execution in test generation
        try {
            com.reservation_system.model.User user6 = com.reservation_system.patterns.factory.UserFactory.createUser("andrew@example.com", (int) (byte) 10, "andrew@example.com", "Andrew", "Researcher", true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid user type: andrew@example.com");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1599() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1599");
        com.reservation_system.model.Student student5 = new com.reservation_system.model.Student((int) (short) 0, "demo/data/test-users.csv", "", "researcher", true);
        int int6 = student5.getID();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test1600() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1600");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("demo/data/test-users.csv");
        boolean boolean2 = userRepository1.headLabCoordinatorExists();
        com.reservation_system.services.RegistrationService registrationService3 = new com.reservation_system.services.RegistrationService(userRepository1);
        boolean boolean4 = userRepository1.headLabCoordinatorExists();
        boolean boolean6 = userRepository1.emailExists("Andrew");
        com.reservation_system.services.RegistrationService registrationService7 = new com.reservation_system.services.RegistrationService(userRepository1);
        java.util.Optional<com.reservation_system.model.User> userOptional9 = userRepository1.findByEmail("faculty");
        com.reservation_system.services.RegistrationService registrationService10 = new com.reservation_system.services.RegistrationService(userRepository1);
        java.util.List<com.reservation_system.model.User> userList11 = userRepository1.getAllUsers();
        boolean boolean13 = userRepository1.emailExists("guest");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(userOptional9);
        org.junit.Assert.assertNotNull(userList11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test1601() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1601");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("demo/data/test-users.csv");
        com.reservation_system.services.RegistrationService registrationService2 = new com.reservation_system.services.RegistrationService(userRepository1);
        com.reservation_system.model.Faculty faculty8 = new com.reservation_system.model.Faculty(0, "Password1!", "demo/data/test-users.csv", "researcher", false);
        java.lang.String str9 = faculty8.getName();
        userRepository1.addUser((com.reservation_system.model.User) faculty8);
        boolean boolean11 = userRepository1.headLabCoordinatorExists();
        int int12 = userRepository1.getNextID();
        boolean boolean13 = userRepository1.headLabCoordinatorExists();
        boolean boolean15 = userRepository1.emailExists("student");
        int int16 = userRepository1.getNextID();
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Password1!" + "'", str9, "Password1!");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
    }

    @Test
    public void test1602() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1602");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("demo/data/test-users.csv");
        java.util.Optional<com.reservation_system.model.User> userOptional3 = userRepository1.findByEmail("hi!");
        boolean boolean5 = userRepository1.emailExists("Faculty");
        com.reservation_system.model.Faculty faculty11 = new com.reservation_system.model.Faculty((int) (byte) 1, "guest", "", "headlabcoordinator", false);
        boolean boolean12 = faculty11.requiresDepartmentApproval();
        userRepository1.addUser((com.reservation_system.model.User) faculty11);
        com.reservation_system.services.RegistrationService registrationService14 = new com.reservation_system.services.RegistrationService(userRepository1);
        java.util.Optional<com.reservation_system.model.User> userOptional16 = userRepository1.findByEmail("Password1!");
        org.junit.Assert.assertNotNull(userOptional3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(userOptional16);
    }

    @Test
    public void test1603() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1603");
        com.reservation_system.model.LabManager labManager5 = new com.reservation_system.model.LabManager((int) (short) 0, "demo/data/test-users.csv", "Faculty", "Andrew", false);
        java.lang.String str6 = labManager5.getUserType();
        int int7 = labManager5.getID();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "labmanager" + "'", str6, "labmanager");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test1604() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1604");
        com.reservation_system.model.Researcher researcher5 = new com.reservation_system.model.Researcher((int) (byte) 10, "Password1!", "Researcher", "hi!", true);
    }

    @Test
    public void test1605() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1605");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("demo/data/test-users.csv");
        java.util.List<com.reservation_system.model.User> userList2 = userRepository1.getAllUsers();
        com.reservation_system.services.RegistrationService registrationService3 = new com.reservation_system.services.RegistrationService(userRepository1);
        java.util.List<com.reservation_system.model.User> userList4 = userRepository1.getAllUsers();
        boolean boolean6 = userRepository1.emailExists("Guest");
        java.util.List<com.reservation_system.model.User> userList7 = userRepository1.getAllUsers();
        java.util.Optional<com.reservation_system.model.User> userOptional9 = userRepository1.findByEmail("Password1!");
        java.util.Optional<com.reservation_system.model.User> userOptional11 = userRepository1.findByEmail("Andrew");
        com.reservation_system.repository.UserRepository userRepository13 = new com.reservation_system.repository.UserRepository("demo/data/test-users.csv");
        boolean boolean14 = userRepository13.headLabCoordinatorExists();
        com.reservation_system.services.RegistrationService registrationService15 = new com.reservation_system.services.RegistrationService(userRepository13);
        boolean boolean16 = userRepository13.headLabCoordinatorExists();
        boolean boolean18 = userRepository13.emailExists("Andrew");
        com.reservation_system.services.RegistrationService registrationService19 = new com.reservation_system.services.RegistrationService(userRepository13);
        com.reservation_system.repository.UserRepository userRepository21 = new com.reservation_system.repository.UserRepository("demo/data/test-users.csv");
        com.reservation_system.services.RegistrationService registrationService22 = new com.reservation_system.services.RegistrationService(userRepository21);
        com.reservation_system.model.Faculty faculty28 = new com.reservation_system.model.Faculty(0, "Password1!", "demo/data/test-users.csv", "researcher", false);
        java.lang.String str29 = faculty28.getName();
        userRepository21.addUser((com.reservation_system.model.User) faculty28);
        boolean boolean31 = userRepository21.headLabCoordinatorExists();
        com.reservation_system.model.Guest guest37 = new com.reservation_system.model.Guest((int) (byte) -1, "guest", "Researcher", "Faculty", true);
        userRepository21.addUser((com.reservation_system.model.User) guest37);
        java.util.List<com.reservation_system.model.User> userList39 = userRepository21.getAllUsers();
        userRepository13.saveAllUsers(userList39);
        com.reservation_system.repository.UserRepository userRepository42 = new com.reservation_system.repository.UserRepository("demo/data/test-users.csv");
        com.reservation_system.services.RegistrationService registrationService43 = new com.reservation_system.services.RegistrationService(userRepository42);
        com.reservation_system.model.Faculty faculty49 = new com.reservation_system.model.Faculty(0, "Password1!", "demo/data/test-users.csv", "researcher", false);
        java.lang.String str50 = faculty49.getName();
        userRepository42.addUser((com.reservation_system.model.User) faculty49);
        boolean boolean52 = userRepository42.headLabCoordinatorExists();
        int int53 = userRepository42.getNextID();
        com.reservation_system.repository.UserRepository userRepository55 = new com.reservation_system.repository.UserRepository("demo/data/test-users.csv");
        com.reservation_system.services.RegistrationService registrationService56 = new com.reservation_system.services.RegistrationService(userRepository55);
        int int57 = userRepository55.getNextID();
        boolean boolean59 = userRepository55.emailExists("labmanager");
        java.util.List<com.reservation_system.model.User> userList60 = userRepository55.getAllUsers();
        userRepository42.saveAllUsers(userList60);
        userRepository13.saveAllUsers(userList60);
        userRepository1.saveAllUsers(userList60);
        org.junit.Assert.assertNotNull(userList2);
        org.junit.Assert.assertNotNull(userList4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(userList7);
        org.junit.Assert.assertNotNull(userOptional9);
        org.junit.Assert.assertNotNull(userOptional11);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "Password1!" + "'", str29, "Password1!");
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNotNull(userList39);
        org.junit.Assert.assertEquals("'" + str50 + "' != '" + "Password1!" + "'", str50, "Password1!");
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertTrue("'" + int53 + "' != '" + 2 + "'", int53 == 2);
        org.junit.Assert.assertTrue("'" + int57 + "' != '" + 2 + "'", int57 == 2);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + false + "'", boolean59 == false);
        org.junit.Assert.assertNotNull(userList60);
    }

    @Test
    public void test1606() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1606");
        com.reservation_system.model.Researcher researcher5 = new com.reservation_system.model.Researcher(10, "", "Student", "hi!", false);
    }

    @Test
    public void test1607() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1607");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("demo/data/test-users.csv");
        com.reservation_system.services.RegistrationService registrationService2 = new com.reservation_system.services.RegistrationService(userRepository1);
        com.reservation_system.model.Faculty faculty8 = new com.reservation_system.model.Faculty(0, "Password1!", "demo/data/test-users.csv", "researcher", false);
        java.lang.String str9 = faculty8.getName();
        userRepository1.addUser((com.reservation_system.model.User) faculty8);
        boolean boolean11 = userRepository1.headLabCoordinatorExists();
        com.reservation_system.model.Guest guest17 = new com.reservation_system.model.Guest((int) (byte) -1, "guest", "Researcher", "Faculty", true);
        userRepository1.addUser((com.reservation_system.model.User) guest17);
        boolean boolean20 = userRepository1.emailExists("Password1!");
        com.reservation_system.repository.UserRepository userRepository22 = new com.reservation_system.repository.UserRepository("demo/data/test-users.csv");
        com.reservation_system.services.RegistrationService registrationService23 = new com.reservation_system.services.RegistrationService(userRepository22);
        com.reservation_system.model.Faculty faculty29 = new com.reservation_system.model.Faculty(0, "Password1!", "demo/data/test-users.csv", "researcher", false);
        java.lang.String str30 = faculty29.getName();
        userRepository22.addUser((com.reservation_system.model.User) faculty29);
        boolean boolean32 = userRepository22.headLabCoordinatorExists();
        com.reservation_system.services.RegistrationService registrationService33 = new com.reservation_system.services.RegistrationService(userRepository22);
        java.util.List<com.reservation_system.model.User> userList34 = userRepository22.getAllUsers();
        com.reservation_system.repository.UserRepository userRepository36 = new com.reservation_system.repository.UserRepository("demo/data/test-users.csv");
        com.reservation_system.services.RegistrationService registrationService37 = new com.reservation_system.services.RegistrationService(userRepository36);
        com.reservation_system.model.Faculty faculty43 = new com.reservation_system.model.Faculty(0, "Password1!", "demo/data/test-users.csv", "researcher", false);
        java.lang.String str44 = faculty43.getName();
        userRepository36.addUser((com.reservation_system.model.User) faculty43);
        boolean boolean46 = userRepository36.headLabCoordinatorExists();
        com.reservation_system.services.RegistrationService registrationService47 = new com.reservation_system.services.RegistrationService(userRepository36);
        java.util.List<com.reservation_system.model.User> userList48 = userRepository36.getAllUsers();
        userRepository22.saveAllUsers(userList48);
        userRepository1.saveAllUsers(userList48);
        java.util.List<com.reservation_system.model.User> userList51 = userRepository1.getAllUsers();
        boolean boolean52 = userRepository1.headLabCoordinatorExists();
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Password1!" + "'", str9, "Password1!");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "Password1!" + "'", str30, "Password1!");
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNotNull(userList34);
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "Password1!" + "'", str44, "Password1!");
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertNotNull(userList48);
        org.junit.Assert.assertNotNull(userList51);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
    }

    @Test
    public void test1608() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1608");
        com.reservation_system.model.Faculty faculty5 = new com.reservation_system.model.Faculty((int) (short) 0, "Faculty", "Password1!", "Faculty", true);
        int int6 = faculty5.getID();
        java.lang.String str7 = faculty5.getUserType();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Faculty" + "'", str7, "Faculty");
    }

    @Test
    public void test1609() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1609");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("demo/data/test-users.csv");
        boolean boolean2 = userRepository1.headLabCoordinatorExists();
        com.reservation_system.services.RegistrationService registrationService3 = new com.reservation_system.services.RegistrationService(userRepository1);
        // The following exception was thrown during execution in test generation
        try {
            com.reservation_system.model.User user8 = registrationService3.registerUser("Researcher", "student", "demo/data/test-users.csv", "researcher");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid email format.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test1610() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1610");
        com.reservation_system.model.Faculty faculty5 = new com.reservation_system.model.Faculty(32, "researcher", "researcher", "guest", true);
    }

    @Test
    public void test1611() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1611");
        com.reservation_system.model.LabManager labManager5 = new com.reservation_system.model.LabManager((int) (short) 0, "Password1!", "headlabcoordinator", "Password1!", true);
    }

    @Test
    public void test1612() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1612");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("demo/data/test-users.csv");
        boolean boolean2 = userRepository1.headLabCoordinatorExists();
        com.reservation_system.services.RegistrationService registrationService3 = new com.reservation_system.services.RegistrationService(userRepository1);
        boolean boolean5 = userRepository1.emailExists("");
        java.util.Optional<com.reservation_system.model.User> userOptional7 = userRepository1.findByEmail("");
        java.util.Optional<com.reservation_system.model.User> userOptional9 = userRepository1.findByEmail("hi!");
        com.reservation_system.services.RegistrationService registrationService10 = new com.reservation_system.services.RegistrationService(userRepository1);
        java.util.Optional<com.reservation_system.model.User> userOptional12 = userRepository1.findByEmail("demo/data/test-users.csv");
        com.reservation_system.model.Student student18 = new com.reservation_system.model.Student((int) ' ', "Password1!", "andrew@example.com", "researcher", false);
        java.lang.String str19 = student18.getUserType();
        java.lang.String str20 = student18.getEmail();
        java.lang.String str21 = student18.getUserType();
        userRepository1.addUser((com.reservation_system.model.User) student18);
        boolean boolean24 = userRepository1.emailExists("Faculty");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(userOptional7);
        org.junit.Assert.assertNotNull(userOptional9);
        org.junit.Assert.assertNotNull(userOptional12);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "Student" + "'", str19, "Student");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "Student" + "'", str21, "Student");
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
    }

    @Test
    public void test1613() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1613");
        com.reservation_system.model.Faculty faculty5 = new com.reservation_system.model.Faculty(10, "researcher", "faculty", "", false);
        java.lang.String str6 = faculty5.getEmail();
        java.lang.String str7 = faculty5.getUserType();
        faculty5.setApproved(false);
        int int10 = faculty5.getID();
        java.lang.String str11 = faculty5.getUserType();
        boolean boolean12 = faculty5.isApproved();
        java.lang.String str13 = faculty5.getUserType();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "faculty" + "'", str6, "faculty");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Faculty" + "'", str7, "Faculty");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 10 + "'", int10 == 10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Faculty" + "'", str11, "Faculty");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Faculty" + "'", str13, "Faculty");
    }

    @Test
    public void test1614() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1614");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("demo/data/test-users.csv");
        com.reservation_system.services.RegistrationService registrationService2 = new com.reservation_system.services.RegistrationService(userRepository1);
        com.reservation_system.model.Faculty faculty8 = new com.reservation_system.model.Faculty(0, "Password1!", "demo/data/test-users.csv", "researcher", false);
        java.lang.String str9 = faculty8.getName();
        userRepository1.addUser((com.reservation_system.model.User) faculty8);
        boolean boolean11 = userRepository1.headLabCoordinatorExists();
        int int12 = userRepository1.getNextID();
        boolean boolean13 = userRepository1.headLabCoordinatorExists();
        com.reservation_system.model.Guest guest19 = new com.reservation_system.model.Guest((int) '4', "researcher", "demo/data/test-users.csv", "andrew@example.com", false);
        userRepository1.addUser((com.reservation_system.model.User) guest19);
        com.reservation_system.services.RegistrationService registrationService21 = new com.reservation_system.services.RegistrationService(userRepository1);
        com.reservation_system.services.RegistrationService registrationService22 = new com.reservation_system.services.RegistrationService(userRepository1);
        com.reservation_system.repository.UserRepository userRepository24 = new com.reservation_system.repository.UserRepository("demo/data/test-users.csv");
        boolean boolean25 = userRepository24.headLabCoordinatorExists();
        com.reservation_system.services.RegistrationService registrationService26 = new com.reservation_system.services.RegistrationService(userRepository24);
        java.util.List<com.reservation_system.model.User> userList27 = userRepository24.getAllUsers();
        userRepository1.saveAllUsers(userList27);
        java.util.List<com.reservation_system.model.User> userList29 = userRepository1.getAllUsers();
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Password1!" + "'", str9, "Password1!");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 33 + "'", int12 == 33);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(userList27);
        org.junit.Assert.assertNotNull(userList29);
    }

    @Test
    public void test1615() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1615");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("demo/data/test-users.csv");
        com.reservation_system.services.RegistrationService registrationService2 = new com.reservation_system.services.RegistrationService(userRepository1);
        com.reservation_system.model.Faculty faculty8 = new com.reservation_system.model.Faculty(0, "Password1!", "demo/data/test-users.csv", "researcher", false);
        java.lang.String str9 = faculty8.getName();
        userRepository1.addUser((com.reservation_system.model.User) faculty8);
        boolean boolean11 = userRepository1.headLabCoordinatorExists();
        com.reservation_system.model.Guest guest17 = new com.reservation_system.model.Guest((int) (byte) -1, "guest", "Researcher", "Faculty", true);
        userRepository1.addUser((com.reservation_system.model.User) guest17);
        boolean boolean20 = userRepository1.emailExists("Password1!");
        boolean boolean22 = userRepository1.emailExists("hi!");
        int int23 = userRepository1.getNextID();
        com.reservation_system.repository.UserRepository userRepository25 = new com.reservation_system.repository.UserRepository("demo/data/test-users.csv");
        com.reservation_system.services.RegistrationService registrationService26 = new com.reservation_system.services.RegistrationService(userRepository25);
        com.reservation_system.model.Faculty faculty32 = new com.reservation_system.model.Faculty(0, "Password1!", "demo/data/test-users.csv", "researcher", false);
        java.lang.String str33 = faculty32.getName();
        userRepository25.addUser((com.reservation_system.model.User) faculty32);
        boolean boolean35 = userRepository25.headLabCoordinatorExists();
        com.reservation_system.model.Guest guest41 = new com.reservation_system.model.Guest((int) (byte) -1, "guest", "Researcher", "Faculty", true);
        userRepository25.addUser((com.reservation_system.model.User) guest41);
        boolean boolean43 = userRepository25.headLabCoordinatorExists();
        com.reservation_system.repository.UserRepository userRepository45 = new com.reservation_system.repository.UserRepository("demo/data/test-users.csv");
        com.reservation_system.services.RegistrationService registrationService46 = new com.reservation_system.services.RegistrationService(userRepository45);
        com.reservation_system.model.Faculty faculty52 = new com.reservation_system.model.Faculty(0, "Password1!", "demo/data/test-users.csv", "researcher", false);
        java.lang.String str53 = faculty52.getName();
        userRepository45.addUser((com.reservation_system.model.User) faculty52);
        boolean boolean55 = userRepository45.headLabCoordinatorExists();
        com.reservation_system.repository.UserRepository userRepository57 = new com.reservation_system.repository.UserRepository("demo/data/test-users.csv");
        com.reservation_system.services.RegistrationService registrationService58 = new com.reservation_system.services.RegistrationService(userRepository57);
        com.reservation_system.model.Faculty faculty64 = new com.reservation_system.model.Faculty(0, "Password1!", "demo/data/test-users.csv", "researcher", false);
        java.lang.String str65 = faculty64.getName();
        userRepository57.addUser((com.reservation_system.model.User) faculty64);
        java.util.List<com.reservation_system.model.User> userList67 = userRepository57.getAllUsers();
        userRepository45.saveAllUsers(userList67);
        userRepository25.saveAllUsers(userList67);
        boolean boolean71 = userRepository25.emailExists("hi!");
        com.reservation_system.repository.UserRepository userRepository73 = new com.reservation_system.repository.UserRepository("demo/data/test-users.csv");
        com.reservation_system.services.RegistrationService registrationService74 = new com.reservation_system.services.RegistrationService(userRepository73);
        com.reservation_system.model.Faculty faculty80 = new com.reservation_system.model.Faculty(0, "Password1!", "demo/data/test-users.csv", "researcher", false);
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
        boolean boolean92 = userRepository1.emailExists("Researcher");
        boolean boolean93 = userRepository1.headLabCoordinatorExists();
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Password1!" + "'", str9, "Password1!");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 53 + "'", int23 == 53);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "Password1!" + "'", str33, "Password1!");
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertEquals("'" + str53 + "' != '" + "Password1!" + "'", str53, "Password1!");
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
        org.junit.Assert.assertEquals("'" + str65 + "' != '" + "Password1!" + "'", str65, "Password1!");
        org.junit.Assert.assertNotNull(userList67);
        org.junit.Assert.assertTrue("'" + boolean71 + "' != '" + false + "'", boolean71 == false);
        org.junit.Assert.assertEquals("'" + str81 + "' != '" + "Password1!" + "'", str81, "Password1!");
        org.junit.Assert.assertTrue("'" + boolean83 + "' != '" + false + "'", boolean83 == false);
        org.junit.Assert.assertNotNull(userList85);
        org.junit.Assert.assertTrue("'" + boolean89 + "' != '" + false + "'", boolean89 == false);
        org.junit.Assert.assertNotNull(userList90);
        org.junit.Assert.assertTrue("'" + boolean92 + "' != '" + true + "'", boolean92 == true);
        org.junit.Assert.assertTrue("'" + boolean93 + "' != '" + false + "'", boolean93 == false);
    }

    @Test
    public void test1616() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1616");
        com.reservation_system.model.Guest guest5 = new com.reservation_system.model.Guest(35, "Andrew", "Faculty", "Andrew", false);
    }

    @Test
    public void test1617() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1617");
        com.reservation_system.model.Researcher researcher5 = new com.reservation_system.model.Researcher(97, "guest", "student", "headlabcoordinator", true);
    }

    @Test
    public void test1618() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1618");
        com.reservation_system.model.Faculty faculty5 = new com.reservation_system.model.Faculty((int) (byte) 1, "guest", "", "headlabcoordinator", false);
        java.lang.String str6 = faculty5.getUserType();
        java.lang.String str7 = faculty5.getUserType();
        java.lang.String str8 = faculty5.getName();
        faculty5.setApproved(true);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Faculty" + "'", str6, "Faculty");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Faculty" + "'", str7, "Faculty");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "guest" + "'", str8, "guest");
    }

    @Test
    public void test1619() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1619");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("demo/data/test-users.csv");
        java.util.Optional<com.reservation_system.model.User> userOptional3 = userRepository1.findByEmail("hi!");
        int int4 = userRepository1.getNextID();
        com.reservation_system.model.Researcher researcher10 = new com.reservation_system.model.Researcher((int) (byte) 10, "", "Guest", "headlabcoordinator", true);
        userRepository1.addUser((com.reservation_system.model.User) researcher10);
        java.util.List<com.reservation_system.model.User> userList12 = userRepository1.getAllUsers();
        com.reservation_system.model.Student student18 = new com.reservation_system.model.Student((int) (byte) 10, "hi!", "labmanager", "Password1!", false);
        userRepository1.addUser((com.reservation_system.model.User) student18);
        com.reservation_system.model.Researcher researcher25 = new com.reservation_system.model.Researcher((-1), "demo/data/test-users.csv", "headlabcoordinator", "", false);
        userRepository1.addUser((com.reservation_system.model.User) researcher25);
        int int27 = userRepository1.getNextID();
        org.junit.Assert.assertNotNull(userOptional3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 53 + "'", int4 == 53);
        org.junit.Assert.assertNotNull(userList12);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 53 + "'", int27 == 53);
    }

    @Test
    public void test1620() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1620");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("demo/data/test-users.csv");
        com.reservation_system.services.RegistrationService registrationService2 = new com.reservation_system.services.RegistrationService(userRepository1);
        com.reservation_system.model.Faculty faculty8 = new com.reservation_system.model.Faculty(0, "Password1!", "demo/data/test-users.csv", "researcher", false);
        java.lang.String str9 = faculty8.getName();
        userRepository1.addUser((com.reservation_system.model.User) faculty8);
        boolean boolean11 = userRepository1.headLabCoordinatorExists();
        com.reservation_system.model.Guest guest17 = new com.reservation_system.model.Guest((int) (byte) -1, "guest", "Researcher", "Faculty", true);
        userRepository1.addUser((com.reservation_system.model.User) guest17);
        boolean boolean19 = userRepository1.headLabCoordinatorExists();
        int int20 = userRepository1.getNextID();
        int int21 = userRepository1.getNextID();
        boolean boolean23 = userRepository1.emailExists("Guest");
        int int24 = userRepository1.getNextID();
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Password1!" + "'", str9, "Password1!");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 53 + "'", int20 == 53);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 53 + "'", int21 == 53);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 53 + "'", int24 == 53);
    }

    @Test
    public void test1621() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1621");
        com.reservation_system.model.HeadLabCoordinator headLabCoordinator5 = new com.reservation_system.model.HeadLabCoordinator((-1), "", "Faculty", "Guest", false);
        int int6 = headLabCoordinator5.getID();
        headLabCoordinator5.setApproved(false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
    }

    @Test
    public void test1622() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1622");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("demo/data/test-users.csv");
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
        com.reservation_system.model.Faculty faculty23 = new com.reservation_system.model.Faculty((int) (byte) 1, "guest", "", "headlabcoordinator", false);
        java.lang.String str24 = faculty23.getUserType();
        java.lang.String str25 = faculty23.getUserType();
        java.lang.String str26 = faculty23.getName();
        userRepository1.addUser((com.reservation_system.model.User) faculty23);
        int int28 = userRepository1.getNextID();
        org.junit.Assert.assertNotNull(userList2);
        org.junit.Assert.assertNotNull(userList4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(userList7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "Faculty" + "'", str24, "Faculty");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "Faculty" + "'", str25, "Faculty");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "guest" + "'", str26, "guest");
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 53 + "'", int28 == 53);
    }

    @Test
    public void test1623() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1623");
        com.reservation_system.model.Researcher researcher5 = new com.reservation_system.model.Researcher((int) '#', "", "faculty", "demo/data/test-users.csv", false);
    }

    @Test
    public void test1624() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1624");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("demo/data/test-users.csv");
        com.reservation_system.services.RegistrationService registrationService2 = new com.reservation_system.services.RegistrationService(userRepository1);
        com.reservation_system.model.Faculty faculty8 = new com.reservation_system.model.Faculty(0, "Password1!", "demo/data/test-users.csv", "researcher", false);
        java.lang.String str9 = faculty8.getName();
        userRepository1.addUser((com.reservation_system.model.User) faculty8);
        boolean boolean11 = userRepository1.headLabCoordinatorExists();
        com.reservation_system.services.RegistrationService registrationService12 = new com.reservation_system.services.RegistrationService(userRepository1);
        com.reservation_system.services.RegistrationService registrationService13 = new com.reservation_system.services.RegistrationService(userRepository1);
        boolean boolean14 = userRepository1.headLabCoordinatorExists();
        java.util.List<com.reservation_system.model.User> userList15 = userRepository1.getAllUsers();
        boolean boolean16 = userRepository1.headLabCoordinatorExists();
        com.reservation_system.repository.UserRepository userRepository18 = new com.reservation_system.repository.UserRepository("demo/data/test-users.csv");
        com.reservation_system.services.RegistrationService registrationService19 = new com.reservation_system.services.RegistrationService(userRepository18);
        com.reservation_system.model.Faculty faculty25 = new com.reservation_system.model.Faculty(0, "Password1!", "demo/data/test-users.csv", "researcher", false);
        java.lang.String str26 = faculty25.getName();
        userRepository18.addUser((com.reservation_system.model.User) faculty25);
        boolean boolean28 = userRepository18.headLabCoordinatorExists();
        com.reservation_system.model.Guest guest34 = new com.reservation_system.model.Guest((int) (byte) -1, "guest", "Researcher", "Faculty", true);
        userRepository18.addUser((com.reservation_system.model.User) guest34);
        boolean boolean37 = userRepository18.emailExists("Password1!");
        boolean boolean39 = userRepository18.emailExists("hi!");
        int int40 = userRepository18.getNextID();
        int int41 = userRepository18.getNextID();
        boolean boolean42 = userRepository18.headLabCoordinatorExists();
        java.util.List<com.reservation_system.model.User> userList43 = userRepository18.getAllUsers();
        java.util.List<com.reservation_system.model.User> userList44 = userRepository18.getAllUsers();
        userRepository1.saveAllUsers(userList44);
        com.reservation_system.services.RegistrationService registrationService46 = new com.reservation_system.services.RegistrationService(userRepository1);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Password1!" + "'", str9, "Password1!");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(userList15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "Password1!" + "'", str26, "Password1!");
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 53 + "'", int40 == 53);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 53 + "'", int41 == 53);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertNotNull(userList43);
        org.junit.Assert.assertNotNull(userList44);
    }

    @Test
    public void test1625() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1625");
        com.reservation_system.model.Student student5 = new com.reservation_system.model.Student((int) (short) 1, "labmanager", "", "", true);
        java.lang.String str6 = student5.getUserType();
        boolean boolean7 = student5.isApproved();
        boolean boolean8 = student5.requiresDepartmentApproval();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Student" + "'", str6, "Student");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test1626() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1626");
        com.reservation_system.model.HeadLabCoordinator headLabCoordinator5 = new com.reservation_system.model.HeadLabCoordinator(0, "Student", "guest", "hi!", true);
    }

    @Test
    public void test1627() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1627");
        com.reservation_system.model.LabManager labManager5 = new com.reservation_system.model.LabManager((int) 'a', "headlabcoordinator", "Guest", "researcher", false);
        java.lang.String str6 = labManager5.getUserType();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "labmanager" + "'", str6, "labmanager");
    }

    @Test
    public void test1628() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1628");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("demo/data/test-users.csv");
        com.reservation_system.services.RegistrationService registrationService2 = new com.reservation_system.services.RegistrationService(userRepository1);
        com.reservation_system.model.Faculty faculty8 = new com.reservation_system.model.Faculty(0, "Password1!", "demo/data/test-users.csv", "researcher", false);
        java.lang.String str9 = faculty8.getName();
        userRepository1.addUser((com.reservation_system.model.User) faculty8);
        boolean boolean11 = userRepository1.headLabCoordinatorExists();
        int int12 = userRepository1.getNextID();
        boolean boolean13 = userRepository1.headLabCoordinatorExists();
        com.reservation_system.model.Guest guest19 = new com.reservation_system.model.Guest((int) '4', "researcher", "demo/data/test-users.csv", "andrew@example.com", false);
        userRepository1.addUser((com.reservation_system.model.User) guest19);
        int int21 = userRepository1.getNextID();
        java.util.List<com.reservation_system.model.User> userList22 = userRepository1.getAllUsers();
        java.util.Optional<com.reservation_system.model.User> userOptional24 = userRepository1.findByEmail("Student");
        boolean boolean26 = userRepository1.emailExists("Andrew");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Password1!" + "'", str9, "Password1!");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 53 + "'", int12 == 53);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 53 + "'", int21 == 53);
        org.junit.Assert.assertNotNull(userList22);
        org.junit.Assert.assertNotNull(userOptional24);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
    }

    @Test
    public void test1629() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1629");
        com.reservation_system.model.Guest guest5 = new com.reservation_system.model.Guest((int) 'a', "student", "headlabcoordinator", "Guest", false);
    }

    @Test
    public void test1630() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1630");
        com.reservation_system.model.Researcher researcher5 = new com.reservation_system.model.Researcher((int) (byte) 1, "Student", "Student", "Password1!", false);
        java.lang.String str6 = researcher5.getUserType();
        java.lang.String str7 = researcher5.getEmail();
        researcher5.setApproved(false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Researcher" + "'", str6, "Researcher");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Student" + "'", str7, "Student");
    }

    @Test
    public void test1631() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1631");
        com.reservation_system.model.LabManager labManager5 = new com.reservation_system.model.LabManager((-1), "guest", "guest", "researcher", true);
    }

    @Test
    public void test1632() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1632");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("demo/data/test-users.csv");
        int int2 = userRepository1.getNextID();
        int int3 = userRepository1.getNextID();
        boolean boolean5 = userRepository1.emailExists("");
        boolean boolean7 = userRepository1.emailExists("faculty");
        java.util.Optional<com.reservation_system.model.User> userOptional9 = userRepository1.findByEmail("Password1!");
        boolean boolean11 = userRepository1.emailExists("headlabcoordinator");
        com.reservation_system.repository.UserRepository userRepository13 = new com.reservation_system.repository.UserRepository("demo/data/test-users.csv");
        com.reservation_system.services.RegistrationService registrationService14 = new com.reservation_system.services.RegistrationService(userRepository13);
        com.reservation_system.model.Faculty faculty20 = new com.reservation_system.model.Faculty(0, "Password1!", "demo/data/test-users.csv", "researcher", false);
        java.lang.String str21 = faculty20.getName();
        userRepository13.addUser((com.reservation_system.model.User) faculty20);
        boolean boolean23 = userRepository13.headLabCoordinatorExists();
        com.reservation_system.services.RegistrationService registrationService24 = new com.reservation_system.services.RegistrationService(userRepository13);
        com.reservation_system.services.RegistrationService registrationService25 = new com.reservation_system.services.RegistrationService(userRepository13);
        boolean boolean26 = userRepository13.headLabCoordinatorExists();
        java.util.List<com.reservation_system.model.User> userList27 = userRepository13.getAllUsers();
        java.util.List<com.reservation_system.model.User> userList28 = userRepository13.getAllUsers();
        com.reservation_system.repository.UserRepository userRepository30 = new com.reservation_system.repository.UserRepository("demo/data/test-users.csv");
        com.reservation_system.services.RegistrationService registrationService31 = new com.reservation_system.services.RegistrationService(userRepository30);
        com.reservation_system.model.Faculty faculty37 = new com.reservation_system.model.Faculty(0, "Password1!", "demo/data/test-users.csv", "researcher", false);
        java.lang.String str38 = faculty37.getName();
        userRepository30.addUser((com.reservation_system.model.User) faculty37);
        boolean boolean40 = userRepository30.headLabCoordinatorExists();
        int int41 = userRepository30.getNextID();
        com.reservation_system.repository.UserRepository userRepository43 = new com.reservation_system.repository.UserRepository("demo/data/test-users.csv");
        java.util.List<com.reservation_system.model.User> userList44 = userRepository43.getAllUsers();
        com.reservation_system.services.RegistrationService registrationService45 = new com.reservation_system.services.RegistrationService(userRepository43);
        java.util.List<com.reservation_system.model.User> userList46 = userRepository43.getAllUsers();
        userRepository30.saveAllUsers(userList46);
        userRepository13.saveAllUsers(userList46);
        java.util.List<com.reservation_system.model.User> userList49 = userRepository13.getAllUsers();
        userRepository1.saveAllUsers(userList49);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 53 + "'", int2 == 53);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 53 + "'", int3 == 53);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(userOptional9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "Password1!" + "'", str21, "Password1!");
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(userList27);
        org.junit.Assert.assertNotNull(userList28);
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "Password1!" + "'", str38, "Password1!");
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 53 + "'", int41 == 53);
        org.junit.Assert.assertNotNull(userList44);
        org.junit.Assert.assertNotNull(userList46);
        org.junit.Assert.assertNotNull(userList49);
    }

    @Test
    public void test1633() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1633");
        com.reservation_system.model.User user6 = com.reservation_system.patterns.factory.UserFactory.createUser("guest", (int) (byte) 0, "Researcher", "student", "Andrew", true);
        org.junit.Assert.assertNotNull(user6);
    }

    @Test
    public void test1634() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1634");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("demo/data/test-users.csv");
        boolean boolean2 = userRepository1.headLabCoordinatorExists();
        com.reservation_system.repository.UserRepository userRepository4 = new com.reservation_system.repository.UserRepository("demo/data/test-users.csv");
        com.reservation_system.services.RegistrationService registrationService5 = new com.reservation_system.services.RegistrationService(userRepository4);
        com.reservation_system.model.Faculty faculty11 = new com.reservation_system.model.Faculty(0, "Password1!", "demo/data/test-users.csv", "researcher", false);
        java.lang.String str12 = faculty11.getName();
        userRepository4.addUser((com.reservation_system.model.User) faculty11);
        java.util.List<com.reservation_system.model.User> userList14 = userRepository4.getAllUsers();
        userRepository1.saveAllUsers(userList14);
        com.reservation_system.model.Student student21 = new com.reservation_system.model.Student((int) (byte) 10, "Researcher", "Password1!", "headlabcoordinator", true);
        userRepository1.addUser((com.reservation_system.model.User) student21);
        com.reservation_system.model.Student student28 = new com.reservation_system.model.Student(52, "Password1!", "Researcher", "labmanager", false);
        userRepository1.addUser((com.reservation_system.model.User) student28);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Password1!" + "'", str12, "Password1!");
        org.junit.Assert.assertNotNull(userList14);
    }

    @Test
    public void test1635() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1635");
        com.reservation_system.model.HeadLabCoordinator headLabCoordinator5 = new com.reservation_system.model.HeadLabCoordinator((int) 'a', "Faculty", "guest", "demo/data/test-users.csv", false);
    }

    @Test
    public void test1636() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1636");
        com.reservation_system.model.LabManager labManager5 = new com.reservation_system.model.LabManager((int) ' ', "", "headlabcoordinator", "andrew@example.com", false);
    }

    @Test
    public void test1637() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1637");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("demo/data/test-users.csv");
        int int2 = userRepository1.getNextID();
        int int3 = userRepository1.getNextID();
        boolean boolean5 = userRepository1.emailExists("faculty");
        java.util.List<com.reservation_system.model.User> userList6 = userRepository1.getAllUsers();
        java.util.Optional<com.reservation_system.model.User> userOptional8 = userRepository1.findByEmail("guest");
        java.util.Optional<com.reservation_system.model.User> userOptional10 = userRepository1.findByEmail("demo/data/test-users.csv");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 53 + "'", int2 == 53);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 53 + "'", int3 == 53);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(userList6);
        org.junit.Assert.assertNotNull(userOptional8);
        org.junit.Assert.assertNotNull(userOptional10);
    }

    @Test
    public void test1638() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1638");
        // The following exception was thrown during execution in test generation
        try {
            com.reservation_system.model.User user6 = com.reservation_system.patterns.factory.UserFactory.createUser("Andrew", (int) (byte) 100, "researcher", "guest", "andrew@example.com", false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid user type: Andrew");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1639() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1639");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("demo/data/test-users.csv");
        java.util.Optional<com.reservation_system.model.User> userOptional3 = userRepository1.findByEmail("hi!");
        int int4 = userRepository1.getNextID();
        int int5 = userRepository1.getNextID();
        int int6 = userRepository1.getNextID();
        java.util.List<com.reservation_system.model.User> userList7 = userRepository1.getAllUsers();
        com.reservation_system.model.Student student13 = new com.reservation_system.model.Student((int) (byte) 1, "Andrew", "demo/data/test-users.csv", "Student", false);
        userRepository1.addUser((com.reservation_system.model.User) student13);
        boolean boolean16 = userRepository1.emailExists("faculty");
        org.junit.Assert.assertNotNull(userOptional3);
// flaky "12) test1639(com.reservation_system.randoop.registrationservice.RegressionTest3)":         org.junit.Assert.assertTrue("'" + int4 + "' != '" + 98 + "'", int4 == 98);
// flaky "8) test1639(com.reservation_system.randoop.registrationservice.RegressionTest3)":         org.junit.Assert.assertTrue("'" + int5 + "' != '" + 98 + "'", int5 == 98);
// flaky "5) test1639(com.reservation_system.randoop.registrationservice.RegressionTest3)":         org.junit.Assert.assertTrue("'" + int6 + "' != '" + 98 + "'", int6 == 98);
        org.junit.Assert.assertNotNull(userList7);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test1640() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1640");
        com.reservation_system.model.User user6 = com.reservation_system.patterns.factory.UserFactory.createUser("Guest", 103, "Faculty", "andrew@example.com", "Researcher", true);
        org.junit.Assert.assertNotNull(user6);
    }

    @Test
    public void test1641() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1641");
        com.reservation_system.model.Student student5 = new com.reservation_system.model.Student((int) (byte) 0, "Student", "Andrew", "labmanager", false);
        java.lang.String str6 = student5.getUserType();
        boolean boolean7 = student5.requiresDepartmentApproval();
        java.lang.String str8 = student5.getName();
        java.lang.String str9 = student5.getUserType();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Student" + "'", str6, "Student");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Student" + "'", str8, "Student");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Student" + "'", str9, "Student");
    }

    @Test
    public void test1642() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1642");
        com.reservation_system.model.Faculty faculty5 = new com.reservation_system.model.Faculty((int) '#', "headlabcoordinator", "Faculty", "researcher", false);
    }

    @Test
    public void test1643() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1643");
        com.reservation_system.model.Faculty faculty5 = new com.reservation_system.model.Faculty((-1), "Student", "hi!", "hi!", true);
    }

    @Test
    public void test1644() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1644");
        com.reservation_system.model.Researcher researcher5 = new com.reservation_system.model.Researcher((int) (short) -1, "andrew@example.com", "guest", "labmanager", false);
        java.lang.String str6 = researcher5.getPassword();
        researcher5.setApproved(true);
        researcher5.setApproved(true);
        java.lang.String str11 = researcher5.getUserType();
        java.lang.String str12 = researcher5.getUserType();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "labmanager" + "'", str6, "labmanager");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Researcher" + "'", str11, "Researcher");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Researcher" + "'", str12, "Researcher");
    }

    @Test
    public void test1645() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1645");
        com.reservation_system.model.HeadLabCoordinator headLabCoordinator5 = new com.reservation_system.model.HeadLabCoordinator((int) (short) -1, "Researcher", "andrew@example.com", "headlabcoordinator", false);
        java.lang.String str6 = headLabCoordinator5.getUserType();
        boolean boolean7 = headLabCoordinator5.isApproved();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "headlabcoordinator" + "'", str6, "headlabcoordinator");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test1646() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1646");
        com.reservation_system.model.HeadLabCoordinator headLabCoordinator5 = new com.reservation_system.model.HeadLabCoordinator((int) (byte) 100, "labmanager", "headlabcoordinator", "Password1!", true);
    }

    @Test
    public void test1647() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1647");
        com.reservation_system.model.Researcher researcher5 = new com.reservation_system.model.Researcher((int) '4', "hi!", "hi!", "labmanager", false);
        java.lang.String str6 = researcher5.getUserType();
        int int7 = researcher5.getID();
        java.lang.String str8 = researcher5.getUserType();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Researcher" + "'", str6, "Researcher");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 52 + "'", int7 == 52);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Researcher" + "'", str8, "Researcher");
    }

    @Test
    public void test1648() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1648");
        com.reservation_system.model.Researcher researcher5 = new com.reservation_system.model.Researcher((int) (byte) 1, "andrew@example.com", "andrew@example.com", "hi!", true);
        java.lang.Class<?> wildcardClass6 = researcher5.getClass();
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test1649() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1649");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("demo/data/test-users.csv");
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
        java.lang.String str30 = researcher28.getUserType();
        java.lang.String str31 = researcher28.getUserType();
// flaky "13) test1649(com.reservation_system.randoop.registrationservice.RegressionTest3)":         org.junit.Assert.assertTrue("'" + int2 + "' != '" + 101 + "'", int2 == 101);
// flaky "9) test1649(com.reservation_system.randoop.registrationservice.RegressionTest3)":         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 101 + "'", int3 == 101);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(userOptional14);
        org.junit.Assert.assertNotNull(userList22);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "Researcher" + "'", str30, "Researcher");
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "Researcher" + "'", str31, "Researcher");
    }

    @Test
    public void test1650() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1650");
        com.reservation_system.model.LabManager labManager5 = new com.reservation_system.model.LabManager(33, "faculty", "labmanager", "Andrew", true);
        java.lang.String str6 = labManager5.getUserType();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "labmanager" + "'", str6, "labmanager");
    }

    @Test
    public void test1651() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1651");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("demo/data/test-users.csv");
        com.reservation_system.services.RegistrationService registrationService2 = new com.reservation_system.services.RegistrationService(userRepository1);
        com.reservation_system.services.RegistrationService registrationService3 = new com.reservation_system.services.RegistrationService(userRepository1);
        boolean boolean5 = userRepository1.emailExists("faculty");
        java.util.Optional<com.reservation_system.model.User> userOptional7 = userRepository1.findByEmail("researcher");
        boolean boolean8 = userRepository1.headLabCoordinatorExists();
        boolean boolean9 = userRepository1.headLabCoordinatorExists();
        com.reservation_system.services.RegistrationService registrationService10 = new com.reservation_system.services.RegistrationService(userRepository1);
        boolean boolean11 = userRepository1.headLabCoordinatorExists();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(userOptional7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test1652() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1652");
        com.reservation_system.model.LabManager labManager5 = new com.reservation_system.model.LabManager(10, "Faculty", "headlabcoordinator", "headlabcoordinator", true);
    }

    @Test
    public void test1653() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1653");
        com.reservation_system.model.Researcher researcher5 = new com.reservation_system.model.Researcher(102, "Andrew", "guest", "Researcher", true);
        java.lang.String str6 = researcher5.getEmail();
        java.lang.String str7 = researcher5.getEmail();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "guest" + "'", str6, "guest");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "guest" + "'", str7, "guest");
    }

    @Test
    public void test1654() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1654");
        com.reservation_system.model.Faculty faculty5 = new com.reservation_system.model.Faculty((int) 'a', "Student", "Student", "Guest", true);
    }

    @Test
    public void test1655() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1655");
        com.reservation_system.model.LabManager labManager5 = new com.reservation_system.model.LabManager(33, "Password1!", "Guest", "", false);
    }

    @Test
    public void test1656() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1656");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("demo/data/test-users.csv");
        boolean boolean2 = userRepository1.headLabCoordinatorExists();
        com.reservation_system.services.RegistrationService registrationService3 = new com.reservation_system.services.RegistrationService(userRepository1);
        boolean boolean5 = userRepository1.emailExists("");
        boolean boolean6 = userRepository1.headLabCoordinatorExists();
        java.util.List<com.reservation_system.model.User> userList7 = userRepository1.getAllUsers();
        com.reservation_system.model.Faculty faculty13 = new com.reservation_system.model.Faculty((int) '4', "Andrew", "", "faculty", false);
        userRepository1.addUser((com.reservation_system.model.User) faculty13);
        boolean boolean15 = userRepository1.headLabCoordinatorExists();
        boolean boolean16 = userRepository1.headLabCoordinatorExists();
        boolean boolean17 = userRepository1.headLabCoordinatorExists();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(userList7);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test1657() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1657");
        com.reservation_system.model.HeadLabCoordinator headLabCoordinator5 = new com.reservation_system.model.HeadLabCoordinator((int) (byte) 1, "hi!", "Guest", "Andrew", false);
        boolean boolean6 = headLabCoordinator5.requiresDepartmentApproval();
        java.lang.String str7 = headLabCoordinator5.getUserType();
        boolean boolean8 = headLabCoordinator5.isApproved();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "headlabcoordinator" + "'", str7, "headlabcoordinator");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test1658() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1658");
        com.reservation_system.model.Student student5 = new com.reservation_system.model.Student(0, "Student", "Faculty", "hi!", false);
        java.lang.String str6 = student5.getUserType();
        java.lang.String str7 = student5.getEmail();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Student" + "'", str6, "Student");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Faculty" + "'", str7, "Faculty");
    }

    @Test
    public void test1659() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1659");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("demo/data/test-users.csv");
        com.reservation_system.services.RegistrationService registrationService2 = new com.reservation_system.services.RegistrationService(userRepository1);
        int int3 = userRepository1.getNextID();
        boolean boolean5 = userRepository1.emailExists("labmanager");
        java.util.List<com.reservation_system.model.User> userList6 = userRepository1.getAllUsers();
        boolean boolean7 = userRepository1.headLabCoordinatorExists();
        java.util.Optional<com.reservation_system.model.User> userOptional9 = userRepository1.findByEmail("researcher");
        boolean boolean11 = userRepository1.emailExists("Andrew");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 101 + "'", int3 == 101);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(userList6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(userOptional9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test1660() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1660");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("demo/data/test-users.csv");
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
        java.util.Optional<com.reservation_system.model.User> userOptional19 = userRepository1.findByEmail("headlabcoordinator");
        java.util.List<com.reservation_system.model.User> userList20 = userRepository1.getAllUsers();
        boolean boolean22 = userRepository1.emailExists("guest");
        int int23 = userRepository1.getNextID();
        org.junit.Assert.assertNotNull(userList2);
        org.junit.Assert.assertNotNull(userList4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(userList7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNotNull(userOptional19);
        org.junit.Assert.assertNotNull(userList20);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 101 + "'", int23 == 101);
    }

    @Test
    public void test1661() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1661");
        com.reservation_system.model.Faculty faculty5 = new com.reservation_system.model.Faculty(0, "researcher", "researcher", "guest", false);
    }

    @Test
    public void test1662() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1662");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("demo/data/test-users.csv");
        boolean boolean2 = userRepository1.headLabCoordinatorExists();
        com.reservation_system.repository.UserRepository userRepository4 = new com.reservation_system.repository.UserRepository("demo/data/test-users.csv");
        com.reservation_system.services.RegistrationService registrationService5 = new com.reservation_system.services.RegistrationService(userRepository4);
        com.reservation_system.model.Faculty faculty11 = new com.reservation_system.model.Faculty(0, "Password1!", "demo/data/test-users.csv", "researcher", false);
        java.lang.String str12 = faculty11.getName();
        userRepository4.addUser((com.reservation_system.model.User) faculty11);
        java.util.List<com.reservation_system.model.User> userList14 = userRepository4.getAllUsers();
        userRepository1.saveAllUsers(userList14);
        com.reservation_system.services.RegistrationService registrationService16 = new com.reservation_system.services.RegistrationService(userRepository1);
        com.reservation_system.services.RegistrationService registrationService17 = new com.reservation_system.services.RegistrationService(userRepository1);
        boolean boolean19 = userRepository1.emailExists("Student");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Password1!" + "'", str12, "Password1!");
        org.junit.Assert.assertNotNull(userList14);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test1663() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1663");
        com.reservation_system.model.LabManager labManager5 = new com.reservation_system.model.LabManager(10, "", "Researcher", "student", false);
    }

    @Test
    public void test1664() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1664");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("demo/data/test-users.csv");
        boolean boolean2 = userRepository1.headLabCoordinatorExists();
        com.reservation_system.services.RegistrationService registrationService3 = new com.reservation_system.services.RegistrationService(userRepository1);
        boolean boolean4 = userRepository1.headLabCoordinatorExists();
        boolean boolean6 = userRepository1.emailExists("Andrew");
        com.reservation_system.services.RegistrationService registrationService7 = new com.reservation_system.services.RegistrationService(userRepository1);
        java.util.Optional<com.reservation_system.model.User> userOptional9 = userRepository1.findByEmail("faculty");
        java.lang.Class<?> wildcardClass10 = userRepository1.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(userOptional9);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test1665() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1665");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("demo/data/test-users.csv");
        int int2 = userRepository1.getNextID();
        int int3 = userRepository1.getNextID();
        boolean boolean5 = userRepository1.emailExists("");
        java.util.Optional<com.reservation_system.model.User> userOptional7 = userRepository1.findByEmail("Password1!");
        boolean boolean9 = userRepository1.emailExists("Faculty");
        com.reservation_system.repository.UserRepository userRepository11 = new com.reservation_system.repository.UserRepository("demo/data/test-users.csv");
        com.reservation_system.services.RegistrationService registrationService12 = new com.reservation_system.services.RegistrationService(userRepository11);
        com.reservation_system.model.Faculty faculty18 = new com.reservation_system.model.Faculty(0, "Password1!", "demo/data/test-users.csv", "researcher", false);
        java.lang.String str19 = faculty18.getName();
        userRepository11.addUser((com.reservation_system.model.User) faculty18);
        boolean boolean21 = userRepository11.headLabCoordinatorExists();
        int int22 = userRepository11.getNextID();
        boolean boolean23 = userRepository11.headLabCoordinatorExists();
        com.reservation_system.model.Guest guest29 = new com.reservation_system.model.Guest((int) '4', "researcher", "demo/data/test-users.csv", "andrew@example.com", false);
        userRepository11.addUser((com.reservation_system.model.User) guest29);
        com.reservation_system.services.RegistrationService registrationService31 = new com.reservation_system.services.RegistrationService(userRepository11);
        com.reservation_system.services.RegistrationService registrationService32 = new com.reservation_system.services.RegistrationService(userRepository11);
        com.reservation_system.repository.UserRepository userRepository34 = new com.reservation_system.repository.UserRepository("demo/data/test-users.csv");
        boolean boolean35 = userRepository34.headLabCoordinatorExists();
        com.reservation_system.repository.UserRepository userRepository37 = new com.reservation_system.repository.UserRepository("demo/data/test-users.csv");
        com.reservation_system.services.RegistrationService registrationService38 = new com.reservation_system.services.RegistrationService(userRepository37);
        com.reservation_system.model.Faculty faculty44 = new com.reservation_system.model.Faculty(0, "Password1!", "demo/data/test-users.csv", "researcher", false);
        java.lang.String str45 = faculty44.getName();
        userRepository37.addUser((com.reservation_system.model.User) faculty44);
        java.util.List<com.reservation_system.model.User> userList47 = userRepository37.getAllUsers();
        userRepository34.saveAllUsers(userList47);
        com.reservation_system.services.RegistrationService registrationService49 = new com.reservation_system.services.RegistrationService(userRepository34);
        java.util.List<com.reservation_system.model.User> userList50 = userRepository34.getAllUsers();
        userRepository11.saveAllUsers(userList50);
        userRepository1.saveAllUsers(userList50);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 101 + "'", int2 == 101);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 101 + "'", int3 == 101);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(userOptional7);
// flaky "14) test1665(com.reservation_system.randoop.registrationservice.RegressionTest3)":         org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "Password1!" + "'", str19, "Password1!");
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 101 + "'", int22 == 101);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + "Password1!" + "'", str45, "Password1!");
        org.junit.Assert.assertNotNull(userList47);
        org.junit.Assert.assertNotNull(userList50);
    }

    @Test
    public void test1666() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1666");
        com.reservation_system.model.Student student5 = new com.reservation_system.model.Student(2, "Andrew", "hi!", "", false);
    }

    @Test
    public void test1667() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1667");
        com.reservation_system.model.User user6 = com.reservation_system.patterns.factory.UserFactory.createUser("headlabcoordinator", (int) (byte) 100, "Researcher", "student", "Password1!", false);
        java.lang.String str7 = user6.getEmail();
        java.lang.String str8 = user6.getName();
        org.junit.Assert.assertNotNull(user6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "student" + "'", str7, "student");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Researcher" + "'", str8, "Researcher");
    }

    @Test
    public void test1668() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1668");
        com.reservation_system.model.Researcher researcher5 = new com.reservation_system.model.Researcher((int) (short) -1, "faculty", "researcher", "hi!", true);
        java.lang.String str6 = researcher5.getUserType();
        java.lang.String str7 = researcher5.getEmail();
        java.lang.String str8 = researcher5.getEmail();
        java.lang.String str9 = researcher5.getUserType();
        java.lang.String str10 = researcher5.getName();
        java.lang.String str11 = researcher5.getUserType();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Researcher" + "'", str6, "Researcher");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "researcher" + "'", str7, "researcher");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "researcher" + "'", str8, "researcher");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Researcher" + "'", str9, "Researcher");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "faculty" + "'", str10, "faculty");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Researcher" + "'", str11, "Researcher");
    }

    @Test
    public void test1669() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1669");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("demo/data/test-users.csv");
        java.util.List<com.reservation_system.model.User> userList2 = userRepository1.getAllUsers();
        com.reservation_system.services.RegistrationService registrationService3 = new com.reservation_system.services.RegistrationService(userRepository1);
        com.reservation_system.services.RegistrationService registrationService4 = new com.reservation_system.services.RegistrationService(userRepository1);
        java.util.List<com.reservation_system.model.User> userList5 = userRepository1.getAllUsers();
        com.reservation_system.model.User user6 = null;
        // The following exception was thrown during execution in test generation
        try {
            userRepository1.addUser(user6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(userList2);
        org.junit.Assert.assertNotNull(userList5);
    }

    @Test
    public void test1670() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1670");
        com.reservation_system.model.HeadLabCoordinator headLabCoordinator5 = new com.reservation_system.model.HeadLabCoordinator((int) 'a', "guest", "", "andrew@example.com", true);
        boolean boolean6 = headLabCoordinator5.isApproved();
        boolean boolean7 = headLabCoordinator5.isApproved();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test1671() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1671");
        com.reservation_system.model.Researcher researcher5 = new com.reservation_system.model.Researcher((int) (byte) 100, "Password1!", "Password1!", "headlabcoordinator", true);
        boolean boolean6 = researcher5.requiresDepartmentApproval();
        researcher5.setApproved(false);
        boolean boolean9 = researcher5.isApproved();
        java.lang.String str10 = researcher5.getUserType();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Researcher" + "'", str10, "Researcher");
    }

    @Test
    public void test1672() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1672");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("demo/data/test-users.csv");
        com.reservation_system.services.RegistrationService registrationService2 = new com.reservation_system.services.RegistrationService(userRepository1);
        com.reservation_system.model.Faculty faculty8 = new com.reservation_system.model.Faculty(0, "Password1!", "demo/data/test-users.csv", "researcher", false);
        java.lang.String str9 = faculty8.getName();
        userRepository1.addUser((com.reservation_system.model.User) faculty8);
        boolean boolean11 = userRepository1.headLabCoordinatorExists();
        com.reservation_system.model.Guest guest17 = new com.reservation_system.model.Guest((int) (byte) -1, "guest", "Researcher", "Faculty", true);
        userRepository1.addUser((com.reservation_system.model.User) guest17);
        boolean boolean20 = userRepository1.emailExists("Password1!");
        java.util.List<com.reservation_system.model.User> userList21 = userRepository1.getAllUsers();
        java.util.List<com.reservation_system.model.User> userList22 = userRepository1.getAllUsers();
        boolean boolean24 = userRepository1.emailExists("");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Password1!" + "'", str9, "Password1!");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertNotNull(userList21);
        org.junit.Assert.assertNotNull(userList22);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
    }

    @Test
    public void test1673() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1673");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("demo/data/test-users.csv");
        com.reservation_system.services.RegistrationService registrationService2 = new com.reservation_system.services.RegistrationService(userRepository1);
        com.reservation_system.model.Faculty faculty8 = new com.reservation_system.model.Faculty(0, "Password1!", "demo/data/test-users.csv", "researcher", false);
        java.lang.String str9 = faculty8.getName();
        userRepository1.addUser((com.reservation_system.model.User) faculty8);
        boolean boolean12 = userRepository1.emailExists("Faculty");
        int int13 = userRepository1.getNextID();
        com.reservation_system.model.Researcher researcher19 = new com.reservation_system.model.Researcher((int) (short) 10, "hi!", "Andrew", "Guest", false);
        java.lang.String str20 = researcher19.getUserType();
        userRepository1.addUser((com.reservation_system.model.User) researcher19);
        com.reservation_system.services.RegistrationService registrationService22 = new com.reservation_system.services.RegistrationService(userRepository1);
        com.reservation_system.model.Faculty faculty28 = new com.reservation_system.model.Faculty(100, "guest", "faculty", "Guest", true);
        userRepository1.addUser((com.reservation_system.model.User) faculty28);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Password1!" + "'", str9, "Password1!");
// flaky "15) test1673(com.reservation_system.randoop.registrationservice.RegressionTest3)":         org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 101 + "'", int13 == 101);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "Researcher" + "'", str20, "Researcher");
    }

    @Test
    public void test1674() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1674");
        com.reservation_system.model.LabManager labManager5 = new com.reservation_system.model.LabManager(1, "researcher", "student", "Andrew", true);
        labManager5.setApproved(false);
        java.lang.String str8 = labManager5.getUserType();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "labmanager" + "'", str8, "labmanager");
    }

    @Test
    public void test1675() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1675");
        com.reservation_system.model.Researcher researcher5 = new com.reservation_system.model.Researcher((int) '4', "andrew@example.com", "faculty", "guest", true);
    }

    @Test
    public void test1676() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1676");
        com.reservation_system.model.Student student5 = new com.reservation_system.model.Student(32, "Faculty", "researcher", "faculty", false);
    }

    @Test
    public void test1677() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1677");
        // The following exception was thrown during execution in test generation
        try {
            com.reservation_system.model.User user6 = com.reservation_system.patterns.factory.UserFactory.createUser("demo/data/test-users.csv", (int) (short) 10, "researcher", "student", "headlabcoordinator", false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid user type: demo/data/test-users.csv");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1678() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1678");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("demo/data/test-users.csv");
        java.util.Optional<com.reservation_system.model.User> userOptional3 = userRepository1.findByEmail("hi!");
        int int4 = userRepository1.getNextID();
        int int5 = userRepository1.getNextID();
        com.reservation_system.model.Researcher researcher11 = new com.reservation_system.model.Researcher((int) 'a', "student", "", "researcher", true);
        userRepository1.addUser((com.reservation_system.model.User) researcher11);
        com.reservation_system.model.Student student18 = new com.reservation_system.model.Student((int) '#', "labmanager", "demo/data/test-users.csv", "labmanager", false);
        userRepository1.addUser((com.reservation_system.model.User) student18);
        boolean boolean21 = userRepository1.emailExists("Researcher");
        boolean boolean23 = userRepository1.emailExists("Researcher");
        org.junit.Assert.assertNotNull(userOptional3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 101 + "'", int4 == 101);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 101 + "'", int5 == 101);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
    }

    @Test
    public void test1679() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1679");
        com.reservation_system.model.HeadLabCoordinator headLabCoordinator5 = new com.reservation_system.model.HeadLabCoordinator((int) (byte) 1, "hi!", "Guest", "Andrew", false);
        boolean boolean6 = headLabCoordinator5.requiresDepartmentApproval();
        java.lang.String str7 = headLabCoordinator5.getUserType();
        java.lang.String str8 = headLabCoordinator5.getPassword();
        boolean boolean9 = headLabCoordinator5.isApproved();
        java.lang.String str10 = headLabCoordinator5.getUserType();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "headlabcoordinator" + "'", str7, "headlabcoordinator");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Andrew" + "'", str8, "Andrew");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "headlabcoordinator" + "'", str10, "headlabcoordinator");
    }

    @Test
    public void test1680() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1680");
        com.reservation_system.model.Guest guest5 = new com.reservation_system.model.Guest(52, "Guest", "faculty", "researcher", false);
    }

    @Test
    public void test1681() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1681");
        com.reservation_system.model.LabManager labManager5 = new com.reservation_system.model.LabManager((int) '#', "", "headlabcoordinator", "Researcher", false);
        java.lang.String str6 = labManager5.getUserType();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "labmanager" + "'", str6, "labmanager");
    }

    @Test
    public void test1682() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1682");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("demo/data/test-users.csv");
        com.reservation_system.services.RegistrationService registrationService2 = new com.reservation_system.services.RegistrationService(userRepository1);
        com.reservation_system.model.Faculty faculty8 = new com.reservation_system.model.Faculty(0, "Password1!", "demo/data/test-users.csv", "researcher", false);
        java.lang.String str9 = faculty8.getName();
        userRepository1.addUser((com.reservation_system.model.User) faculty8);
        boolean boolean11 = userRepository1.headLabCoordinatorExists();
        com.reservation_system.model.Guest guest17 = new com.reservation_system.model.Guest((int) (byte) -1, "guest", "Researcher", "Faculty", true);
        userRepository1.addUser((com.reservation_system.model.User) guest17);
        boolean boolean19 = userRepository1.headLabCoordinatorExists();
        com.reservation_system.repository.UserRepository userRepository21 = new com.reservation_system.repository.UserRepository("demo/data/test-users.csv");
        com.reservation_system.services.RegistrationService registrationService22 = new com.reservation_system.services.RegistrationService(userRepository21);
        com.reservation_system.model.Faculty faculty28 = new com.reservation_system.model.Faculty(0, "Password1!", "demo/data/test-users.csv", "researcher", false);
        java.lang.String str29 = faculty28.getName();
        userRepository21.addUser((com.reservation_system.model.User) faculty28);
        boolean boolean31 = userRepository21.headLabCoordinatorExists();
        com.reservation_system.repository.UserRepository userRepository33 = new com.reservation_system.repository.UserRepository("demo/data/test-users.csv");
        com.reservation_system.services.RegistrationService registrationService34 = new com.reservation_system.services.RegistrationService(userRepository33);
        com.reservation_system.model.Faculty faculty40 = new com.reservation_system.model.Faculty(0, "Password1!", "demo/data/test-users.csv", "researcher", false);
        java.lang.String str41 = faculty40.getName();
        userRepository33.addUser((com.reservation_system.model.User) faculty40);
        java.util.List<com.reservation_system.model.User> userList43 = userRepository33.getAllUsers();
        userRepository21.saveAllUsers(userList43);
        userRepository1.saveAllUsers(userList43);
        boolean boolean47 = userRepository1.emailExists("hi!");
        com.reservation_system.repository.UserRepository userRepository49 = new com.reservation_system.repository.UserRepository("demo/data/test-users.csv");
        com.reservation_system.services.RegistrationService registrationService50 = new com.reservation_system.services.RegistrationService(userRepository49);
        com.reservation_system.model.Faculty faculty56 = new com.reservation_system.model.Faculty(0, "Password1!", "demo/data/test-users.csv", "researcher", false);
        java.lang.String str57 = faculty56.getName();
        userRepository49.addUser((com.reservation_system.model.User) faculty56);
        boolean boolean59 = userRepository49.headLabCoordinatorExists();
        com.reservation_system.services.RegistrationService registrationService60 = new com.reservation_system.services.RegistrationService(userRepository49);
        java.util.List<com.reservation_system.model.User> userList61 = userRepository49.getAllUsers();
        userRepository1.saveAllUsers(userList61);
        boolean boolean63 = userRepository1.headLabCoordinatorExists();
        boolean boolean65 = userRepository1.emailExists("Faculty");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Password1!" + "'", str9, "Password1!");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "Password1!" + "'", str29, "Password1!");
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "Password1!" + "'", str41, "Password1!");
        org.junit.Assert.assertNotNull(userList43);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertEquals("'" + str57 + "' != '" + "Password1!" + "'", str57, "Password1!");
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + false + "'", boolean59 == false);
        org.junit.Assert.assertNotNull(userList61);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + false + "'", boolean63 == false);
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + true + "'", boolean65 == true);
    }

    @Test
    public void test1683() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1683");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("demo/data/test-users.csv");
        int int2 = userRepository1.getNextID();
        int int3 = userRepository1.getNextID();
        boolean boolean5 = userRepository1.emailExists("faculty");
        java.util.Optional<com.reservation_system.model.User> userOptional7 = userRepository1.findByEmail("");
        com.reservation_system.repository.UserRepository userRepository9 = new com.reservation_system.repository.UserRepository("demo/data/test-users.csv");
        com.reservation_system.services.RegistrationService registrationService10 = new com.reservation_system.services.RegistrationService(userRepository9);
        com.reservation_system.model.Faculty faculty16 = new com.reservation_system.model.Faculty(0, "Password1!", "demo/data/test-users.csv", "researcher", false);
        java.lang.String str17 = faculty16.getName();
        userRepository9.addUser((com.reservation_system.model.User) faculty16);
        boolean boolean19 = userRepository9.headLabCoordinatorExists();
        int int20 = userRepository9.getNextID();
        boolean boolean21 = userRepository9.headLabCoordinatorExists();
        com.reservation_system.model.Guest guest27 = new com.reservation_system.model.Guest((int) '4', "researcher", "demo/data/test-users.csv", "andrew@example.com", false);
        userRepository9.addUser((com.reservation_system.model.User) guest27);
        com.reservation_system.services.RegistrationService registrationService29 = new com.reservation_system.services.RegistrationService(userRepository9);
        com.reservation_system.services.RegistrationService registrationService30 = new com.reservation_system.services.RegistrationService(userRepository9);
        com.reservation_system.repository.UserRepository userRepository32 = new com.reservation_system.repository.UserRepository("demo/data/test-users.csv");
        boolean boolean33 = userRepository32.headLabCoordinatorExists();
        com.reservation_system.services.RegistrationService registrationService34 = new com.reservation_system.services.RegistrationService(userRepository32);
        java.util.List<com.reservation_system.model.User> userList35 = userRepository32.getAllUsers();
        userRepository9.saveAllUsers(userList35);
        com.reservation_system.repository.UserRepository userRepository38 = new com.reservation_system.repository.UserRepository("demo/data/test-users.csv");
        com.reservation_system.services.RegistrationService registrationService39 = new com.reservation_system.services.RegistrationService(userRepository38);
        int int40 = userRepository38.getNextID();
        boolean boolean42 = userRepository38.emailExists("labmanager");
        java.util.List<com.reservation_system.model.User> userList43 = userRepository38.getAllUsers();
        userRepository9.saveAllUsers(userList43);
        userRepository1.saveAllUsers(userList43);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 101 + "'", int2 == 101);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 101 + "'", int3 == 101);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(userOptional7);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "Password1!" + "'", str17, "Password1!");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 101 + "'", int20 == 101);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertNotNull(userList35);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 101 + "'", int40 == 101);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + true + "'", boolean42 == true);
        org.junit.Assert.assertNotNull(userList43);
    }

    @Test
    public void test1684() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1684");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("demo/data/test-users.csv");
        java.util.Optional<com.reservation_system.model.User> userOptional3 = userRepository1.findByEmail("hi!");
        boolean boolean5 = userRepository1.emailExists("Faculty");
        java.util.List<com.reservation_system.model.User> userList6 = userRepository1.getAllUsers();
        java.util.Optional<com.reservation_system.model.User> userOptional8 = userRepository1.findByEmail("");
        boolean boolean9 = userRepository1.headLabCoordinatorExists();
        org.junit.Assert.assertNotNull(userOptional3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(userList6);
        org.junit.Assert.assertNotNull(userOptional8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test1685() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1685");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("demo/data/test-users.csv");
        com.reservation_system.services.RegistrationService registrationService2 = new com.reservation_system.services.RegistrationService(userRepository1);
        com.reservation_system.model.Faculty faculty8 = new com.reservation_system.model.Faculty(0, "Password1!", "demo/data/test-users.csv", "researcher", false);
        java.lang.String str9 = faculty8.getName();
        userRepository1.addUser((com.reservation_system.model.User) faculty8);
        boolean boolean11 = userRepository1.headLabCoordinatorExists();
        int int12 = userRepository1.getNextID();
        boolean boolean13 = userRepository1.headLabCoordinatorExists();
        com.reservation_system.model.Guest guest19 = new com.reservation_system.model.Guest((int) '4', "researcher", "demo/data/test-users.csv", "andrew@example.com", false);
        userRepository1.addUser((com.reservation_system.model.User) guest19);
        int int21 = userRepository1.getNextID();
        com.reservation_system.repository.UserRepository userRepository23 = new com.reservation_system.repository.UserRepository("demo/data/test-users.csv");
        boolean boolean24 = userRepository23.headLabCoordinatorExists();
        com.reservation_system.services.RegistrationService registrationService25 = new com.reservation_system.services.RegistrationService(userRepository23);
        boolean boolean26 = userRepository23.headLabCoordinatorExists();
        boolean boolean28 = userRepository23.emailExists("Andrew");
        com.reservation_system.services.RegistrationService registrationService29 = new com.reservation_system.services.RegistrationService(userRepository23);
        com.reservation_system.model.Researcher researcher35 = new com.reservation_system.model.Researcher((int) (short) -1, "andrew@example.com", "guest", "labmanager", false);
        java.lang.String str36 = researcher35.getUserType();
        java.lang.String str37 = researcher35.getName();
        java.lang.String str38 = researcher35.getUserType();
        userRepository23.addUser((com.reservation_system.model.User) researcher35);
        java.util.Optional<com.reservation_system.model.User> userOptional41 = userRepository23.findByEmail("Faculty");
        java.util.List<com.reservation_system.model.User> userList42 = userRepository23.getAllUsers();
        userRepository1.saveAllUsers(userList42);
        int int44 = userRepository1.getNextID();
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Password1!" + "'", str9, "Password1!");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 101 + "'", int12 == 101);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 101 + "'", int21 == 101);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "Researcher" + "'", str36, "Researcher");
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "Researcher" + "'", str38, "Researcher");
        org.junit.Assert.assertNotNull(userOptional41);
        org.junit.Assert.assertNotNull(userList42);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 101 + "'", int44 == 101);
    }

    @Test
    public void test1686() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1686");
        com.reservation_system.model.Researcher researcher5 = new com.reservation_system.model.Researcher((int) (short) -1, "faculty", "researcher", "hi!", true);
        java.lang.String str6 = researcher5.getUserType();
        int int7 = researcher5.getID();
        researcher5.setApproved(false);
        java.lang.String str10 = researcher5.getUserType();
        boolean boolean11 = researcher5.requiresDepartmentApproval();
        java.lang.String str12 = researcher5.getEmail();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Researcher" + "'", str6, "Researcher");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Researcher" + "'", str10, "Researcher");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "researcher" + "'", str12, "researcher");
    }

    @Test
    public void test1687() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1687");
        com.reservation_system.model.LabManager labManager5 = new com.reservation_system.model.LabManager(0, "guest", "Faculty", "researcher", false);
        java.lang.String str6 = labManager5.getUserType();
        java.lang.String str7 = labManager5.getUserType();
        java.lang.String str8 = labManager5.getUserType();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "labmanager" + "'", str6, "labmanager");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "labmanager" + "'", str7, "labmanager");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "labmanager" + "'", str8, "labmanager");
    }

    @Test
    public void test1688() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1688");
        com.reservation_system.model.User user6 = com.reservation_system.patterns.factory.UserFactory.createUser("researcher", 35, "researcher", "Faculty", "guest", false);
        java.lang.String str7 = user6.getName();
        org.junit.Assert.assertNotNull(user6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "researcher" + "'", str7, "researcher");
    }

    @Test
    public void test1689() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1689");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("demo/data/test-users.csv");
        boolean boolean2 = userRepository1.headLabCoordinatorExists();
        com.reservation_system.services.RegistrationService registrationService3 = new com.reservation_system.services.RegistrationService(userRepository1);
        boolean boolean4 = userRepository1.headLabCoordinatorExists();
        boolean boolean5 = userRepository1.headLabCoordinatorExists();
        com.reservation_system.repository.UserRepository userRepository7 = new com.reservation_system.repository.UserRepository("demo/data/test-users.csv");
        com.reservation_system.services.RegistrationService registrationService8 = new com.reservation_system.services.RegistrationService(userRepository7);
        com.reservation_system.model.Faculty faculty14 = new com.reservation_system.model.Faculty(0, "Password1!", "demo/data/test-users.csv", "researcher", false);
        java.lang.String str15 = faculty14.getName();
        userRepository7.addUser((com.reservation_system.model.User) faculty14);
        boolean boolean17 = userRepository7.headLabCoordinatorExists();
        int int18 = userRepository7.getNextID();
        com.reservation_system.repository.UserRepository userRepository20 = new com.reservation_system.repository.UserRepository("demo/data/test-users.csv");
        java.util.List<com.reservation_system.model.User> userList21 = userRepository20.getAllUsers();
        com.reservation_system.services.RegistrationService registrationService22 = new com.reservation_system.services.RegistrationService(userRepository20);
        java.util.List<com.reservation_system.model.User> userList23 = userRepository20.getAllUsers();
        userRepository7.saveAllUsers(userList23);
        userRepository1.saveAllUsers(userList23);
        java.util.List<com.reservation_system.model.User> userList26 = userRepository1.getAllUsers();
        boolean boolean27 = userRepository1.headLabCoordinatorExists();
        boolean boolean28 = userRepository1.headLabCoordinatorExists();
        int int29 = userRepository1.getNextID();
        java.util.Optional<com.reservation_system.model.User> userOptional31 = userRepository1.findByEmail("andrew@example.com");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Password1!" + "'", str15, "Password1!");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 101 + "'", int18 == 101);
        org.junit.Assert.assertNotNull(userList21);
        org.junit.Assert.assertNotNull(userList23);
        org.junit.Assert.assertNotNull(userList26);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 101 + "'", int29 == 101);
        org.junit.Assert.assertNotNull(userOptional31);
    }

    @Test
    public void test1690() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1690");
        com.reservation_system.model.Guest guest5 = new com.reservation_system.model.Guest((int) (short) 100, "demo/data/test-users.csv", "", "faculty", true);
        java.lang.String str6 = guest5.getName();
        boolean boolean7 = guest5.requiresDepartmentApproval();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "demo/data/test-users.csv" + "'", str6, "demo/data/test-users.csv");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test1691() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1691");
        com.reservation_system.model.Researcher researcher5 = new com.reservation_system.model.Researcher((int) (short) -1, "faculty", "researcher", "hi!", true);
        java.lang.String str6 = researcher5.getUserType();
        int int7 = researcher5.getID();
        java.lang.String str8 = researcher5.getUserType();
        researcher5.setApproved(false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Researcher" + "'", str6, "Researcher");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Researcher" + "'", str8, "Researcher");
    }

    @Test
    public void test1692() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1692");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("demo/data/test-users.csv");
        java.util.Optional<com.reservation_system.model.User> userOptional3 = userRepository1.findByEmail("hi!");
        int int4 = userRepository1.getNextID();
        int int5 = userRepository1.getNextID();
        java.util.Optional<com.reservation_system.model.User> userOptional7 = userRepository1.findByEmail("");
        java.util.List<com.reservation_system.model.User> userList8 = userRepository1.getAllUsers();
        org.junit.Assert.assertNotNull(userOptional3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 101 + "'", int4 == 101);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 101 + "'", int5 == 101);
        org.junit.Assert.assertNotNull(userOptional7);
        org.junit.Assert.assertNotNull(userList8);
    }

    @Test
    public void test1693() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1693");
        com.reservation_system.model.Researcher researcher5 = new com.reservation_system.model.Researcher(10, "", "faculty", "Faculty", false);
        java.lang.String str6 = researcher5.getEmail();
        java.lang.String str7 = researcher5.getPassword();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "faculty" + "'", str6, "faculty");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Faculty" + "'", str7, "Faculty");
    }

    @Test
    public void test1694() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1694");
        com.reservation_system.model.Researcher researcher5 = new com.reservation_system.model.Researcher((int) 'a', "guest", "", "faculty", true);
    }

    @Test
    public void test1695() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1695");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("demo/data/test-users.csv");
        com.reservation_system.services.RegistrationService registrationService2 = new com.reservation_system.services.RegistrationService(userRepository1);
        com.reservation_system.services.RegistrationService registrationService3 = new com.reservation_system.services.RegistrationService(userRepository1);
        boolean boolean5 = userRepository1.emailExists("faculty");
        java.util.Optional<com.reservation_system.model.User> userOptional7 = userRepository1.findByEmail("researcher");
        int int8 = userRepository1.getNextID();
        java.util.List<com.reservation_system.model.User> userList9 = userRepository1.getAllUsers();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(userOptional7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 101 + "'", int8 == 101);
        org.junit.Assert.assertNotNull(userList9);
    }

    @Test
    public void test1696() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1696");
        com.reservation_system.model.Researcher researcher5 = new com.reservation_system.model.Researcher((int) (short) -1, "Andrew", "headlabcoordinator", "Guest", false);
        boolean boolean6 = researcher5.requiresDepartmentApproval();
        int int7 = researcher5.getID();
        java.lang.String str8 = researcher5.getUserType();
        java.lang.String str9 = researcher5.getUserType();
        java.lang.String str10 = researcher5.getUserType();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Researcher" + "'", str8, "Researcher");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Researcher" + "'", str9, "Researcher");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Researcher" + "'", str10, "Researcher");
    }

    @Test
    public void test1697() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1697");
        com.reservation_system.model.LabManager labManager5 = new com.reservation_system.model.LabManager(2, "andrew@example.com", "labmanager", "researcher", false);
    }

    @Test
    public void test1698() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1698");
        com.reservation_system.model.LabManager labManager5 = new com.reservation_system.model.LabManager((-1), "demo/data/test-users.csv", "researcher", "andrew@example.com", false);
        java.lang.String str6 = labManager5.getPassword();
    }

    @Test
    public void test1699() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1699");
        com.reservation_system.model.Researcher researcher5 = new com.reservation_system.model.Researcher(33, "", "Student", "student", false);
    }

    @Test
    public void test1700() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1700");
        com.reservation_system.model.Guest guest5 = new com.reservation_system.model.Guest((int) '#', "Andrew", "student", "Faculty", false);
        java.lang.String str6 = guest5.getUserType();
        guest5.setApproved(true);
        java.lang.String str9 = guest5.getUserType();
        java.lang.String str10 = guest5.getEmail();
        java.lang.String str11 = guest5.getPassword();
        boolean boolean12 = guest5.requiresDepartmentApproval();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Guest" + "'", str6, "Guest");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Guest" + "'", str9, "Guest");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "student" + "'", str10, "student");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Faculty" + "'", str11, "Faculty");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test1701() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1701");
        com.reservation_system.model.Researcher researcher5 = new com.reservation_system.model.Researcher(33, "Researcher", "Guest", "faculty", false);
    }

    @Test
    public void test1702() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1702");
        com.reservation_system.model.Faculty faculty5 = new com.reservation_system.model.Faculty(52, "hi!", "Guest", "Password1!", false);
    }

    @Test
    public void test1703() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1703");
        com.reservation_system.model.Guest guest5 = new com.reservation_system.model.Guest(101, "faculty", "Password1!", "hi!", true);
        java.lang.String str6 = guest5.getUserType();
        java.lang.String str7 = guest5.getName();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Guest" + "'", str6, "Guest");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "faculty" + "'", str7, "faculty");
    }

    @Test
    public void test1704() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1704");
        com.reservation_system.model.Researcher researcher5 = new com.reservation_system.model.Researcher((int) (short) -1, "faculty", "researcher", "hi!", true);
        java.lang.String str6 = researcher5.getUserType();
        int int7 = researcher5.getID();
        researcher5.setApproved(false);
        java.lang.String str10 = researcher5.getName();
        boolean boolean11 = researcher5.isApproved();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Researcher" + "'", str6, "Researcher");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "faculty" + "'", str10, "faculty");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test1705() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1705");
        com.reservation_system.model.LabManager labManager5 = new com.reservation_system.model.LabManager((int) (byte) 1, "Guest", "hi!", "", false);
    }

    @Test
    public void test1706() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1706");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("demo/data/test-users.csv");
        com.reservation_system.services.RegistrationService registrationService2 = new com.reservation_system.services.RegistrationService(userRepository1);
        com.reservation_system.services.RegistrationService registrationService3 = new com.reservation_system.services.RegistrationService(userRepository1);
        boolean boolean5 = userRepository1.emailExists("faculty");
        com.reservation_system.model.Faculty faculty11 = new com.reservation_system.model.Faculty((int) (byte) 1, "guest", "", "headlabcoordinator", false);
        java.lang.String str12 = faculty11.getUserType();
        faculty11.setApproved(true);
        userRepository1.addUser((com.reservation_system.model.User) faculty11);
        java.lang.String str16 = faculty11.getUserType();
        java.lang.String str17 = faculty11.getEmail();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Faculty" + "'", str12, "Faculty");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Faculty" + "'", str16, "Faculty");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
    }

    @Test
    public void test1707() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1707");
        com.reservation_system.model.LabManager labManager5 = new com.reservation_system.model.LabManager((int) (short) 0, "", "labmanager", "Password1!", true);
        boolean boolean6 = labManager5.requiresDepartmentApproval();
        boolean boolean7 = labManager5.requiresDepartmentApproval();
        boolean boolean8 = labManager5.isApproved();
        java.lang.String str9 = labManager5.getName();
        java.lang.String str10 = labManager5.getUserType();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "labmanager" + "'", str10, "labmanager");
    }

    @Test
    public void test1708() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1708");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("demo/data/test-users.csv");
        java.util.List<com.reservation_system.model.User> userList2 = userRepository1.getAllUsers();
        com.reservation_system.services.RegistrationService registrationService3 = new com.reservation_system.services.RegistrationService(userRepository1);
        java.util.List<com.reservation_system.model.User> userList4 = userRepository1.getAllUsers();
        com.reservation_system.services.RegistrationService registrationService5 = new com.reservation_system.services.RegistrationService(userRepository1);
        // The following exception was thrown during execution in test generation
        try {
            com.reservation_system.model.User user10 = registrationService5.registerUser("Andrew", "", "Andrew", "Faculty");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid user type.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(userList2);
        org.junit.Assert.assertNotNull(userList4);
    }

    @Test
    public void test1709() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1709");
        com.reservation_system.model.Guest guest5 = new com.reservation_system.model.Guest((int) (short) -1, "faculty", "guest", "Researcher", false);
        java.lang.String str6 = guest5.getUserType();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Guest" + "'", str6, "Guest");
    }

    @Test
    public void test1710() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1710");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("demo/data/test-users.csv");
        java.util.List<com.reservation_system.model.User> userList2 = userRepository1.getAllUsers();
        com.reservation_system.services.RegistrationService registrationService3 = new com.reservation_system.services.RegistrationService(userRepository1);
        java.util.List<com.reservation_system.model.User> userList4 = userRepository1.getAllUsers();
        boolean boolean6 = userRepository1.emailExists("Guest");
        java.util.List<com.reservation_system.model.User> userList7 = userRepository1.getAllUsers();
        java.util.Optional<com.reservation_system.model.User> userOptional9 = userRepository1.findByEmail("Password1!");
        boolean boolean11 = userRepository1.emailExists("demo/data/test-users.csv");
        com.reservation_system.model.Faculty faculty17 = new com.reservation_system.model.Faculty((int) (short) 0, "guest", "Andrew", "guest", true);
        int int18 = faculty17.getID();
        userRepository1.addUser((com.reservation_system.model.User) faculty17);
        boolean boolean21 = userRepository1.emailExists("Researcher");
        com.reservation_system.model.HeadLabCoordinator headLabCoordinator27 = new com.reservation_system.model.HeadLabCoordinator(10, "faculty", "Faculty", "demo/data/test-users.csv", false);
        int int28 = headLabCoordinator27.getID();
        java.lang.String str29 = headLabCoordinator27.getUserType();
        int int30 = headLabCoordinator27.getID();
        userRepository1.addUser((com.reservation_system.model.User) headLabCoordinator27);
        org.junit.Assert.assertNotNull(userList2);
        org.junit.Assert.assertNotNull(userList4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(userList7);
        org.junit.Assert.assertNotNull(userOptional9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 10 + "'", int28 == 10);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "headlabcoordinator" + "'", str29, "headlabcoordinator");
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 10 + "'", int30 == 10);
    }

    @Test
    public void test1711() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1711");
        com.reservation_system.model.Student student5 = new com.reservation_system.model.Student(1, "demo/data/test-users.csv", "faculty", "researcher", true);
        boolean boolean6 = student5.isApproved();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test1712() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1712");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("demo/data/test-users.csv");
        boolean boolean2 = userRepository1.headLabCoordinatorExists();
        com.reservation_system.repository.UserRepository userRepository4 = new com.reservation_system.repository.UserRepository("demo/data/test-users.csv");
        com.reservation_system.services.RegistrationService registrationService5 = new com.reservation_system.services.RegistrationService(userRepository4);
        com.reservation_system.model.Faculty faculty11 = new com.reservation_system.model.Faculty(0, "Password1!", "demo/data/test-users.csv", "researcher", false);
        java.lang.String str12 = faculty11.getName();
        userRepository4.addUser((com.reservation_system.model.User) faculty11);
        boolean boolean14 = userRepository4.headLabCoordinatorExists();
        com.reservation_system.model.Guest guest20 = new com.reservation_system.model.Guest((int) (byte) -1, "guest", "Researcher", "Faculty", true);
        userRepository4.addUser((com.reservation_system.model.User) guest20);
        boolean boolean22 = userRepository4.headLabCoordinatorExists();
        com.reservation_system.repository.UserRepository userRepository24 = new com.reservation_system.repository.UserRepository("demo/data/test-users.csv");
        com.reservation_system.services.RegistrationService registrationService25 = new com.reservation_system.services.RegistrationService(userRepository24);
        com.reservation_system.model.Faculty faculty31 = new com.reservation_system.model.Faculty(0, "Password1!", "demo/data/test-users.csv", "researcher", false);
        java.lang.String str32 = faculty31.getName();
        userRepository24.addUser((com.reservation_system.model.User) faculty31);
        boolean boolean34 = userRepository24.headLabCoordinatorExists();
        com.reservation_system.repository.UserRepository userRepository36 = new com.reservation_system.repository.UserRepository("demo/data/test-users.csv");
        com.reservation_system.services.RegistrationService registrationService37 = new com.reservation_system.services.RegistrationService(userRepository36);
        com.reservation_system.model.Faculty faculty43 = new com.reservation_system.model.Faculty(0, "Password1!", "demo/data/test-users.csv", "researcher", false);
        java.lang.String str44 = faculty43.getName();
        userRepository36.addUser((com.reservation_system.model.User) faculty43);
        java.util.List<com.reservation_system.model.User> userList46 = userRepository36.getAllUsers();
        userRepository24.saveAllUsers(userList46);
        userRepository4.saveAllUsers(userList46);
        userRepository1.saveAllUsers(userList46);
        com.reservation_system.services.RegistrationService registrationService50 = new com.reservation_system.services.RegistrationService(userRepository1);
        // The following exception was thrown during execution in test generation
        try {
            com.reservation_system.model.User user55 = registrationService50.registerUser("Password1!", "researcher", "Password1!", "headlabcoordinator");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid user type.");
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
    public void test1713() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1713");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("demo/data/test-users.csv");
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
        com.reservation_system.repository.UserRepository userRepository31 = new com.reservation_system.repository.UserRepository("demo/data/test-users.csv");
        com.reservation_system.services.RegistrationService registrationService32 = new com.reservation_system.services.RegistrationService(userRepository31);
        com.reservation_system.model.Faculty faculty38 = new com.reservation_system.model.Faculty(0, "Password1!", "demo/data/test-users.csv", "researcher", false);
        java.lang.String str39 = faculty38.getName();
        userRepository31.addUser((com.reservation_system.model.User) faculty38);
        boolean boolean41 = userRepository31.headLabCoordinatorExists();
        com.reservation_system.services.RegistrationService registrationService42 = new com.reservation_system.services.RegistrationService(userRepository31);
        java.util.List<com.reservation_system.model.User> userList43 = userRepository31.getAllUsers();
        userRepository1.saveAllUsers(userList43);
        com.reservation_system.model.Guest guest50 = new com.reservation_system.model.Guest((int) ' ', "student", "Password1!", "Researcher", true);
        userRepository1.addUser((com.reservation_system.model.User) guest50);
        com.reservation_system.services.RegistrationService registrationService52 = new com.reservation_system.services.RegistrationService(userRepository1);
        // The following exception was thrown during execution in test generation
        try {
            com.reservation_system.model.User user57 = registrationService52.registerUser("faculty", "guest", "Password1!", "Student");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid email format.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 101 + "'", int2 == 101);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 101 + "'", int3 == 101);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(userOptional14);
        org.junit.Assert.assertNotNull(userList22);
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "Password1!" + "'", str39, "Password1!");
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + true + "'", boolean41 == true);
        org.junit.Assert.assertNotNull(userList43);
    }

    @Test
    public void test1714() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1714");
        com.reservation_system.model.Faculty faculty5 = new com.reservation_system.model.Faculty(52, "labmanager", "Guest", "Student", true);
        boolean boolean6 = faculty5.requiresDepartmentApproval();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test1715() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1715");
        com.reservation_system.model.Student student5 = new com.reservation_system.model.Student((int) '#', "Faculty", "demo/data/test-users.csv", "faculty", false);
    }

    @Test
    public void test1716() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1716");
        com.reservation_system.model.LabManager labManager5 = new com.reservation_system.model.LabManager((int) (byte) 100, "researcher", "andrew@example.com", "Researcher", false);
        java.lang.String str6 = labManager5.getName();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "researcher" + "'", str6, "researcher");
    }

    @Test
    public void test1717() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1717");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("demo/data/test-users.csv");
        boolean boolean2 = userRepository1.headLabCoordinatorExists();
        com.reservation_system.services.RegistrationService registrationService3 = new com.reservation_system.services.RegistrationService(userRepository1);
        boolean boolean4 = userRepository1.headLabCoordinatorExists();
        boolean boolean5 = userRepository1.headLabCoordinatorExists();
        java.util.List<com.reservation_system.model.User> userList6 = userRepository1.getAllUsers();
        int int7 = userRepository1.getNextID();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(userList6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 101 + "'", int7 == 101);
    }

    @Test
    public void test1718() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1718");
        com.reservation_system.model.Student student5 = new com.reservation_system.model.Student((int) (short) 10, "Faculty", "demo/data/test-users.csv", "Researcher", false);
        student5.setApproved(false);
        java.lang.Class<?> wildcardClass8 = student5.getClass();
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test1719() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1719");
        com.reservation_system.model.Guest guest5 = new com.reservation_system.model.Guest((int) (byte) 100, "hi!", "labmanager", "demo/data/test-users.csv", true);
    }

    @Test
    public void test1720() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1720");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("demo/data/test-users.csv");
        boolean boolean2 = userRepository1.headLabCoordinatorExists();
        com.reservation_system.services.RegistrationService registrationService3 = new com.reservation_system.services.RegistrationService(userRepository1);
        boolean boolean4 = userRepository1.headLabCoordinatorExists();
        boolean boolean5 = userRepository1.headLabCoordinatorExists();
        com.reservation_system.repository.UserRepository userRepository7 = new com.reservation_system.repository.UserRepository("demo/data/test-users.csv");
        com.reservation_system.services.RegistrationService registrationService8 = new com.reservation_system.services.RegistrationService(userRepository7);
        com.reservation_system.model.Faculty faculty14 = new com.reservation_system.model.Faculty(0, "Password1!", "demo/data/test-users.csv", "researcher", false);
        java.lang.String str15 = faculty14.getName();
        userRepository7.addUser((com.reservation_system.model.User) faculty14);
        boolean boolean17 = userRepository7.headLabCoordinatorExists();
        int int18 = userRepository7.getNextID();
        com.reservation_system.repository.UserRepository userRepository20 = new com.reservation_system.repository.UserRepository("demo/data/test-users.csv");
        java.util.List<com.reservation_system.model.User> userList21 = userRepository20.getAllUsers();
        com.reservation_system.services.RegistrationService registrationService22 = new com.reservation_system.services.RegistrationService(userRepository20);
        java.util.List<com.reservation_system.model.User> userList23 = userRepository20.getAllUsers();
        userRepository7.saveAllUsers(userList23);
        userRepository1.saveAllUsers(userList23);
        int int26 = userRepository1.getNextID();
        boolean boolean27 = userRepository1.headLabCoordinatorExists();
        boolean boolean28 = userRepository1.headLabCoordinatorExists();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Password1!" + "'", str15, "Password1!");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 101 + "'", int18 == 101);
        org.junit.Assert.assertNotNull(userList21);
        org.junit.Assert.assertNotNull(userList23);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 101 + "'", int26 == 101);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
    }

    @Test
    public void test1721() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1721");
        com.reservation_system.model.LabManager labManager5 = new com.reservation_system.model.LabManager((int) ' ', "Faculty", "Andrew", "", true);
    }

    @Test
    public void test1722() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1722");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("demo/data/test-users.csv");
        int int2 = userRepository1.getNextID();
        int int3 = userRepository1.getNextID();
        boolean boolean5 = userRepository1.emailExists("");
        boolean boolean7 = userRepository1.emailExists("faculty");
        java.lang.Class<?> wildcardClass8 = userRepository1.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 101 + "'", int2 == 101);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 101 + "'", int3 == 101);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test1723() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1723");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("demo/data/test-users.csv");
        boolean boolean2 = userRepository1.headLabCoordinatorExists();
        com.reservation_system.services.RegistrationService registrationService3 = new com.reservation_system.services.RegistrationService(userRepository1);
        boolean boolean4 = userRepository1.headLabCoordinatorExists();
        boolean boolean5 = userRepository1.headLabCoordinatorExists();
        com.reservation_system.repository.UserRepository userRepository7 = new com.reservation_system.repository.UserRepository("demo/data/test-users.csv");
        com.reservation_system.services.RegistrationService registrationService8 = new com.reservation_system.services.RegistrationService(userRepository7);
        com.reservation_system.model.Faculty faculty14 = new com.reservation_system.model.Faculty(0, "Password1!", "demo/data/test-users.csv", "researcher", false);
        java.lang.String str15 = faculty14.getName();
        userRepository7.addUser((com.reservation_system.model.User) faculty14);
        boolean boolean17 = userRepository7.headLabCoordinatorExists();
        int int18 = userRepository7.getNextID();
        com.reservation_system.repository.UserRepository userRepository20 = new com.reservation_system.repository.UserRepository("demo/data/test-users.csv");
        java.util.List<com.reservation_system.model.User> userList21 = userRepository20.getAllUsers();
        com.reservation_system.services.RegistrationService registrationService22 = new com.reservation_system.services.RegistrationService(userRepository20);
        java.util.List<com.reservation_system.model.User> userList23 = userRepository20.getAllUsers();
        userRepository7.saveAllUsers(userList23);
        userRepository1.saveAllUsers(userList23);
        java.util.List<com.reservation_system.model.User> userList26 = userRepository1.getAllUsers();
        com.reservation_system.repository.UserRepository userRepository28 = new com.reservation_system.repository.UserRepository("demo/data/test-users.csv");
        com.reservation_system.services.RegistrationService registrationService29 = new com.reservation_system.services.RegistrationService(userRepository28);
        com.reservation_system.model.Faculty faculty35 = new com.reservation_system.model.Faculty(0, "Password1!", "demo/data/test-users.csv", "researcher", false);
        java.lang.String str36 = faculty35.getName();
        userRepository28.addUser((com.reservation_system.model.User) faculty35);
        boolean boolean38 = userRepository28.headLabCoordinatorExists();
        com.reservation_system.model.Guest guest44 = new com.reservation_system.model.Guest((int) (byte) -1, "guest", "Researcher", "Faculty", true);
        userRepository28.addUser((com.reservation_system.model.User) guest44);
        boolean boolean47 = userRepository28.emailExists("Password1!");
        com.reservation_system.repository.UserRepository userRepository49 = new com.reservation_system.repository.UserRepository("demo/data/test-users.csv");
        com.reservation_system.services.RegistrationService registrationService50 = new com.reservation_system.services.RegistrationService(userRepository49);
        com.reservation_system.model.Faculty faculty56 = new com.reservation_system.model.Faculty(0, "Password1!", "demo/data/test-users.csv", "researcher", false);
        java.lang.String str57 = faculty56.getName();
        userRepository49.addUser((com.reservation_system.model.User) faculty56);
        boolean boolean59 = userRepository49.headLabCoordinatorExists();
        com.reservation_system.services.RegistrationService registrationService60 = new com.reservation_system.services.RegistrationService(userRepository49);
        java.util.List<com.reservation_system.model.User> userList61 = userRepository49.getAllUsers();
        com.reservation_system.repository.UserRepository userRepository63 = new com.reservation_system.repository.UserRepository("demo/data/test-users.csv");
        com.reservation_system.services.RegistrationService registrationService64 = new com.reservation_system.services.RegistrationService(userRepository63);
        com.reservation_system.model.Faculty faculty70 = new com.reservation_system.model.Faculty(0, "Password1!", "demo/data/test-users.csv", "researcher", false);
        java.lang.String str71 = faculty70.getName();
        userRepository63.addUser((com.reservation_system.model.User) faculty70);
        boolean boolean73 = userRepository63.headLabCoordinatorExists();
        com.reservation_system.services.RegistrationService registrationService74 = new com.reservation_system.services.RegistrationService(userRepository63);
        java.util.List<com.reservation_system.model.User> userList75 = userRepository63.getAllUsers();
        userRepository49.saveAllUsers(userList75);
        userRepository28.saveAllUsers(userList75);
        userRepository1.saveAllUsers(userList75);
        com.reservation_system.services.RegistrationService registrationService79 = new com.reservation_system.services.RegistrationService(userRepository1);
        com.reservation_system.model.Researcher researcher85 = new com.reservation_system.model.Researcher(100, "demo/data/test-users.csv", "andrew@example.com", "guest", false);
        java.lang.String str86 = researcher85.getUserType();
        java.lang.String str87 = researcher85.getUserType();
        userRepository1.addUser((com.reservation_system.model.User) researcher85);
        researcher85.setApproved(false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Password1!" + "'", str15, "Password1!");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 101 + "'", int18 == 101);
        org.junit.Assert.assertNotNull(userList21);
        org.junit.Assert.assertNotNull(userList23);
        org.junit.Assert.assertNotNull(userList26);
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "Password1!" + "'", str36, "Password1!");
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + true + "'", boolean38 == true);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + true + "'", boolean47 == true);
        org.junit.Assert.assertEquals("'" + str57 + "' != '" + "Password1!" + "'", str57, "Password1!");
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + true + "'", boolean59 == true);
        org.junit.Assert.assertNotNull(userList61);
        org.junit.Assert.assertEquals("'" + str71 + "' != '" + "Password1!" + "'", str71, "Password1!");
        org.junit.Assert.assertTrue("'" + boolean73 + "' != '" + true + "'", boolean73 == true);
        org.junit.Assert.assertNotNull(userList75);
        org.junit.Assert.assertEquals("'" + str86 + "' != '" + "Researcher" + "'", str86, "Researcher");
        org.junit.Assert.assertEquals("'" + str87 + "' != '" + "Researcher" + "'", str87, "Researcher");
    }

    @Test
    public void test1724() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1724");
        com.reservation_system.model.HeadLabCoordinator headLabCoordinator5 = new com.reservation_system.model.HeadLabCoordinator((int) (short) 10, "student", "", "", true);
        java.lang.String str6 = headLabCoordinator5.getName();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "student" + "'", str6, "student");
    }

    @Test
    public void test1725() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1725");
        com.reservation_system.model.Researcher researcher5 = new com.reservation_system.model.Researcher((int) (short) -1, "student", "hi!", "student", true);
        java.lang.String str6 = researcher5.getEmail();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
    }

    @Test
    public void test1726() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1726");
        com.reservation_system.model.LabManager labManager5 = new com.reservation_system.model.LabManager((int) (byte) -1, "Student", "Student", "Andrew", true);
    }

    @Test
    public void test1727() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1727");
        com.reservation_system.model.User user6 = com.reservation_system.patterns.factory.UserFactory.createUser("Researcher", 53, "Password1!", "Faculty", "Andrew", false);
        org.junit.Assert.assertNotNull(user6);
    }

    @Test
    public void test1728() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1728");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("demo/data/test-users.csv");
        java.util.List<com.reservation_system.model.User> userList2 = userRepository1.getAllUsers();
        com.reservation_system.services.RegistrationService registrationService3 = new com.reservation_system.services.RegistrationService(userRepository1);
        java.util.List<com.reservation_system.model.User> userList4 = userRepository1.getAllUsers();
        boolean boolean6 = userRepository1.emailExists("Guest");
        java.util.List<com.reservation_system.model.User> userList7 = userRepository1.getAllUsers();
        java.util.Optional<com.reservation_system.model.User> userOptional9 = userRepository1.findByEmail("Password1!");
        boolean boolean11 = userRepository1.emailExists("demo/data/test-users.csv");
        com.reservation_system.model.Faculty faculty17 = new com.reservation_system.model.Faculty((int) (short) 0, "guest", "Andrew", "guest", true);
        int int18 = faculty17.getID();
        userRepository1.addUser((com.reservation_system.model.User) faculty17);
        boolean boolean21 = userRepository1.emailExists("Researcher");
        int int22 = userRepository1.getNextID();
        org.junit.Assert.assertNotNull(userList2);
        org.junit.Assert.assertNotNull(userList4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(userList7);
        org.junit.Assert.assertNotNull(userOptional9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 101 + "'", int22 == 101);
    }

    @Test
    public void test1729() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1729");
        com.reservation_system.model.HeadLabCoordinator headLabCoordinator5 = new com.reservation_system.model.HeadLabCoordinator((int) ' ', "", "", "andrew@example.com", true);
        boolean boolean6 = headLabCoordinator5.requiresDepartmentApproval();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test1730() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1730");
        com.reservation_system.model.Guest guest5 = new com.reservation_system.model.Guest(53, "Student", "headlabcoordinator", "labmanager", false);
    }

    @Test
    public void test1731() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1731");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("demo/data/test-users.csv");
        com.reservation_system.services.RegistrationService registrationService2 = new com.reservation_system.services.RegistrationService(userRepository1);
        com.reservation_system.model.Faculty faculty8 = new com.reservation_system.model.Faculty(0, "Password1!", "demo/data/test-users.csv", "researcher", false);
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
            com.reservation_system.model.User user27 = registrationService22.registerUser("Password1!", "Password1!", "headlabcoordinator", "faculty");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid user type.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Password1!" + "'", str9, "Password1!");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 101 + "'", int13 == 101);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "Researcher" + "'", str20, "Researcher");
    }

    @Test
    public void test1732() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1732");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("demo/data/test-users.csv");
        com.reservation_system.services.RegistrationService registrationService2 = new com.reservation_system.services.RegistrationService(userRepository1);
        com.reservation_system.model.Faculty faculty8 = new com.reservation_system.model.Faculty(0, "Password1!", "demo/data/test-users.csv", "researcher", false);
        java.lang.String str9 = faculty8.getName();
        userRepository1.addUser((com.reservation_system.model.User) faculty8);
        boolean boolean11 = userRepository1.headLabCoordinatorExists();
        com.reservation_system.model.Guest guest17 = new com.reservation_system.model.Guest((int) (byte) -1, "guest", "Researcher", "Faculty", true);
        userRepository1.addUser((com.reservation_system.model.User) guest17);
        boolean boolean19 = userRepository1.headLabCoordinatorExists();
        com.reservation_system.services.RegistrationService registrationService20 = new com.reservation_system.services.RegistrationService(userRepository1);
        boolean boolean21 = userRepository1.headLabCoordinatorExists();
        boolean boolean22 = userRepository1.headLabCoordinatorExists();
        com.reservation_system.model.Faculty faculty28 = new com.reservation_system.model.Faculty((int) ' ', "", "Faculty", "demo/data/test-users.csv", false);
        java.lang.String str29 = faculty28.getUserType();
        boolean boolean30 = faculty28.requiresDepartmentApproval();
        userRepository1.addUser((com.reservation_system.model.User) faculty28);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Password1!" + "'", str9, "Password1!");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "Faculty" + "'", str29, "Faculty");
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
    }

    @Test
    public void test1733() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1733");
        com.reservation_system.model.LabManager labManager5 = new com.reservation_system.model.LabManager((int) (short) 0, "", "labmanager", "Password1!", true);
        java.lang.String str6 = labManager5.getUserType();
        java.lang.String str7 = labManager5.getUserType();
        boolean boolean8 = labManager5.requiresDepartmentApproval();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "labmanager" + "'", str6, "labmanager");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "labmanager" + "'", str7, "labmanager");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test1734() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1734");
        com.reservation_system.model.Guest guest5 = new com.reservation_system.model.Guest(53, "", "Password1!", "hi!", true);
    }

    @Test
    public void test1735() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1735");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("demo/data/test-users.csv");
        com.reservation_system.services.RegistrationService registrationService2 = new com.reservation_system.services.RegistrationService(userRepository1);
        com.reservation_system.services.RegistrationService registrationService3 = new com.reservation_system.services.RegistrationService(userRepository1);
        com.reservation_system.services.RegistrationService registrationService4 = new com.reservation_system.services.RegistrationService(userRepository1);
        com.reservation_system.repository.UserRepository userRepository6 = new com.reservation_system.repository.UserRepository("demo/data/test-users.csv");
        com.reservation_system.services.RegistrationService registrationService7 = new com.reservation_system.services.RegistrationService(userRepository6);
        com.reservation_system.model.Faculty faculty13 = new com.reservation_system.model.Faculty(0, "Password1!", "demo/data/test-users.csv", "researcher", false);
        java.lang.String str14 = faculty13.getName();
        userRepository6.addUser((com.reservation_system.model.User) faculty13);
        boolean boolean16 = userRepository6.headLabCoordinatorExists();
        com.reservation_system.model.Guest guest22 = new com.reservation_system.model.Guest((int) (byte) -1, "guest", "Researcher", "Faculty", true);
        userRepository6.addUser((com.reservation_system.model.User) guest22);
        java.util.List<com.reservation_system.model.User> userList24 = userRepository6.getAllUsers();
        userRepository1.saveAllUsers(userList24);
        java.util.List<com.reservation_system.model.User> userList26 = userRepository1.getAllUsers();
        java.util.List<com.reservation_system.model.User> userList27 = userRepository1.getAllUsers();
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Password1!" + "'", str14, "Password1!");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNotNull(userList24);
        org.junit.Assert.assertNotNull(userList26);
        org.junit.Assert.assertNotNull(userList27);
    }

    @Test
    public void test1736() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1736");
        com.reservation_system.model.Guest guest5 = new com.reservation_system.model.Guest(52, "Faculty", "Password1!", "Student", false);
    }

    @Test
    public void test1737() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1737");
        com.reservation_system.model.LabManager labManager5 = new com.reservation_system.model.LabManager((int) (short) 0, "", "labmanager", "Password1!", true);
        boolean boolean6 = labManager5.requiresDepartmentApproval();
        boolean boolean7 = labManager5.requiresDepartmentApproval();
        boolean boolean8 = labManager5.isApproved();
        labManager5.setApproved(false);
        java.lang.String str11 = labManager5.getUserType();
        boolean boolean12 = labManager5.requiresDepartmentApproval();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "labmanager" + "'", str11, "labmanager");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test1738() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1738");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("demo/data/test-users.csv");
        com.reservation_system.services.RegistrationService registrationService2 = new com.reservation_system.services.RegistrationService(userRepository1);
        com.reservation_system.model.Faculty faculty8 = new com.reservation_system.model.Faculty(0, "Password1!", "demo/data/test-users.csv", "researcher", false);
        java.lang.String str9 = faculty8.getName();
        userRepository1.addUser((com.reservation_system.model.User) faculty8);
        boolean boolean11 = userRepository1.headLabCoordinatorExists();
        com.reservation_system.model.Guest guest17 = new com.reservation_system.model.Guest((int) (byte) -1, "guest", "Researcher", "Faculty", true);
        userRepository1.addUser((com.reservation_system.model.User) guest17);
        boolean boolean20 = userRepository1.emailExists("Password1!");
        boolean boolean22 = userRepository1.emailExists("hi!");
        int int23 = userRepository1.getNextID();
        com.reservation_system.repository.UserRepository userRepository25 = new com.reservation_system.repository.UserRepository("demo/data/test-users.csv");
        com.reservation_system.services.RegistrationService registrationService26 = new com.reservation_system.services.RegistrationService(userRepository25);
        com.reservation_system.model.Faculty faculty32 = new com.reservation_system.model.Faculty(0, "Password1!", "demo/data/test-users.csv", "researcher", false);
        java.lang.String str33 = faculty32.getName();
        userRepository25.addUser((com.reservation_system.model.User) faculty32);
        boolean boolean35 = userRepository25.headLabCoordinatorExists();
        com.reservation_system.model.Guest guest41 = new com.reservation_system.model.Guest((int) (byte) -1, "guest", "Researcher", "Faculty", true);
        userRepository25.addUser((com.reservation_system.model.User) guest41);
        boolean boolean43 = userRepository25.headLabCoordinatorExists();
        com.reservation_system.repository.UserRepository userRepository45 = new com.reservation_system.repository.UserRepository("demo/data/test-users.csv");
        com.reservation_system.services.RegistrationService registrationService46 = new com.reservation_system.services.RegistrationService(userRepository45);
        com.reservation_system.model.Faculty faculty52 = new com.reservation_system.model.Faculty(0, "Password1!", "demo/data/test-users.csv", "researcher", false);
        java.lang.String str53 = faculty52.getName();
        userRepository45.addUser((com.reservation_system.model.User) faculty52);
        boolean boolean55 = userRepository45.headLabCoordinatorExists();
        com.reservation_system.repository.UserRepository userRepository57 = new com.reservation_system.repository.UserRepository("demo/data/test-users.csv");
        com.reservation_system.services.RegistrationService registrationService58 = new com.reservation_system.services.RegistrationService(userRepository57);
        com.reservation_system.model.Faculty faculty64 = new com.reservation_system.model.Faculty(0, "Password1!", "demo/data/test-users.csv", "researcher", false);
        java.lang.String str65 = faculty64.getName();
        userRepository57.addUser((com.reservation_system.model.User) faculty64);
        java.util.List<com.reservation_system.model.User> userList67 = userRepository57.getAllUsers();
        userRepository45.saveAllUsers(userList67);
        userRepository25.saveAllUsers(userList67);
        boolean boolean71 = userRepository25.emailExists("hi!");
        com.reservation_system.repository.UserRepository userRepository73 = new com.reservation_system.repository.UserRepository("demo/data/test-users.csv");
        com.reservation_system.services.RegistrationService registrationService74 = new com.reservation_system.services.RegistrationService(userRepository73);
        com.reservation_system.model.Faculty faculty80 = new com.reservation_system.model.Faculty(0, "Password1!", "demo/data/test-users.csv", "researcher", false);
        java.lang.String str81 = faculty80.getName();
        userRepository73.addUser((com.reservation_system.model.User) faculty80);
        boolean boolean83 = userRepository73.headLabCoordinatorExists();
        com.reservation_system.services.RegistrationService registrationService84 = new com.reservation_system.services.RegistrationService(userRepository73);
        java.util.List<com.reservation_system.model.User> userList85 = userRepository73.getAllUsers();
        userRepository25.saveAllUsers(userList85);
        userRepository1.saveAllUsers(userList85);
        com.reservation_system.services.RegistrationService registrationService88 = new com.reservation_system.services.RegistrationService(userRepository1);
        java.util.List<com.reservation_system.model.User> userList89 = userRepository1.getAllUsers();
        java.util.Optional<com.reservation_system.model.User> userOptional91 = userRepository1.findByEmail("labmanager");
        com.reservation_system.services.RegistrationService registrationService92 = new com.reservation_system.services.RegistrationService(userRepository1);
        // The following exception was thrown during execution in test generation
        try {
            com.reservation_system.model.User user97 = registrationService92.registerUser("hi!", "labmanager", "headlabcoordinator", "Andrew");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid user type.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Password1!" + "'", str9, "Password1!");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 101 + "'", int23 == 101);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "Password1!" + "'", str33, "Password1!");
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + true + "'", boolean43 == true);
        org.junit.Assert.assertEquals("'" + str53 + "' != '" + "Password1!" + "'", str53, "Password1!");
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + true + "'", boolean55 == true);
        org.junit.Assert.assertEquals("'" + str65 + "' != '" + "Password1!" + "'", str65, "Password1!");
        org.junit.Assert.assertNotNull(userList67);
        org.junit.Assert.assertTrue("'" + boolean71 + "' != '" + false + "'", boolean71 == false);
        org.junit.Assert.assertEquals("'" + str81 + "' != '" + "Password1!" + "'", str81, "Password1!");
        org.junit.Assert.assertTrue("'" + boolean83 + "' != '" + true + "'", boolean83 == true);
        org.junit.Assert.assertNotNull(userList85);
        org.junit.Assert.assertNotNull(userList89);
        org.junit.Assert.assertNotNull(userOptional91);
    }

    @Test
    public void test1739() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1739");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("demo/data/test-users.csv");
        java.util.List<com.reservation_system.model.User> userList2 = userRepository1.getAllUsers();
        java.util.List<com.reservation_system.model.User> userList3 = userRepository1.getAllUsers();
        java.util.Optional<com.reservation_system.model.User> userOptional5 = userRepository1.findByEmail("faculty");
        com.reservation_system.services.RegistrationService registrationService6 = new com.reservation_system.services.RegistrationService(userRepository1);
        org.junit.Assert.assertNotNull(userList2);
        org.junit.Assert.assertNotNull(userList3);
        org.junit.Assert.assertNotNull(userOptional5);
    }

    @Test
    public void test1740() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1740");
        com.reservation_system.model.HeadLabCoordinator headLabCoordinator5 = new com.reservation_system.model.HeadLabCoordinator((int) (short) 0, "labmanager", "Guest", "Faculty", false);
        java.lang.String str6 = headLabCoordinator5.getUserType();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "headlabcoordinator" + "'", str6, "headlabcoordinator");
    }

    @Test
    public void test1741() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1741");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("demo/data/test-users.csv");
        boolean boolean2 = userRepository1.headLabCoordinatorExists();
        com.reservation_system.services.RegistrationService registrationService3 = new com.reservation_system.services.RegistrationService(userRepository1);
        boolean boolean5 = userRepository1.emailExists("");
        java.util.Optional<com.reservation_system.model.User> userOptional7 = userRepository1.findByEmail("");
        java.util.Optional<com.reservation_system.model.User> userOptional9 = userRepository1.findByEmail("hi!");
        com.reservation_system.services.RegistrationService registrationService10 = new com.reservation_system.services.RegistrationService(userRepository1);
        java.util.Optional<com.reservation_system.model.User> userOptional12 = userRepository1.findByEmail("demo/data/test-users.csv");
        com.reservation_system.model.HeadLabCoordinator headLabCoordinator18 = new com.reservation_system.model.HeadLabCoordinator((int) ' ', "", "", "andrew@example.com", true);
        userRepository1.addUser((com.reservation_system.model.User) headLabCoordinator18);
        java.lang.String str20 = headLabCoordinator18.getUserType();
        java.lang.String str21 = headLabCoordinator18.getUserType();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(userOptional7);
        org.junit.Assert.assertNotNull(userOptional9);
        org.junit.Assert.assertNotNull(userOptional12);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "headlabcoordinator" + "'", str20, "headlabcoordinator");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "headlabcoordinator" + "'", str21, "headlabcoordinator");
    }

    @Test
    public void test1742() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1742");
        com.reservation_system.model.Student student5 = new com.reservation_system.model.Student(2, "andrew@example.com", "researcher", "faculty", true);
    }

    @Test
    public void test1743() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1743");
        com.reservation_system.model.LabManager labManager5 = new com.reservation_system.model.LabManager((int) '4', "Faculty", "andrew@example.com", "andrew@example.com", true);
        java.lang.String str6 = labManager5.getUserType();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "labmanager" + "'", str6, "labmanager");
    }

    @Test
    public void test1744() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1744");
        com.reservation_system.model.Guest guest5 = new com.reservation_system.model.Guest(1, "guest", "", "Guest", false);
        boolean boolean6 = guest5.isApproved();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test1745() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1745");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("demo/data/test-users.csv");
        java.util.Optional<com.reservation_system.model.User> userOptional3 = userRepository1.findByEmail("hi!");
        int int4 = userRepository1.getNextID();
        com.reservation_system.model.Researcher researcher10 = new com.reservation_system.model.Researcher((int) (byte) 10, "", "Guest", "headlabcoordinator", true);
        userRepository1.addUser((com.reservation_system.model.User) researcher10);
        java.util.List<com.reservation_system.model.User> userList12 = userRepository1.getAllUsers();
        com.reservation_system.model.Student student18 = new com.reservation_system.model.Student((int) (byte) 10, "hi!", "labmanager", "Password1!", false);
        userRepository1.addUser((com.reservation_system.model.User) student18);
        com.reservation_system.model.Researcher researcher25 = new com.reservation_system.model.Researcher((-1), "demo/data/test-users.csv", "headlabcoordinator", "", false);
        userRepository1.addUser((com.reservation_system.model.User) researcher25);
        java.lang.String str27 = researcher25.getName();
        java.lang.String str28 = researcher25.getUserType();
        org.junit.Assert.assertNotNull(userOptional3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 101 + "'", int4 == 101);
        org.junit.Assert.assertNotNull(userList12);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "demo/data/test-users.csv" + "'", str27, "demo/data/test-users.csv");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "Researcher" + "'", str28, "Researcher");
    }

    @Test
    public void test1746() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1746");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("demo/data/test-users.csv");
        boolean boolean2 = userRepository1.headLabCoordinatorExists();
        com.reservation_system.services.RegistrationService registrationService3 = new com.reservation_system.services.RegistrationService(userRepository1);
        boolean boolean5 = userRepository1.emailExists("");
        boolean boolean7 = userRepository1.emailExists("andrew@example.com");
        int int8 = userRepository1.getNextID();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 101 + "'", int8 == 101);
    }

    @Test
    public void test1747() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1747");
        com.reservation_system.model.HeadLabCoordinator headLabCoordinator5 = new com.reservation_system.model.HeadLabCoordinator(103, "researcher", "Faculty", "headlabcoordinator", true);
    }

    @Test
    public void test1748() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1748");
        com.reservation_system.model.Guest guest5 = new com.reservation_system.model.Guest((int) (short) 100, "Password1!", "Password1!", "guest", true);
        java.lang.String str6 = guest5.getUserType();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Guest" + "'", str6, "Guest");
    }

    @Test
    public void test1749() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1749");
        com.reservation_system.model.LabManager labManager5 = new com.reservation_system.model.LabManager(0, "Student", "faculty", "", false);
        boolean boolean6 = labManager5.isApproved();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test1750() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1750");
        com.reservation_system.model.Guest guest5 = new com.reservation_system.model.Guest((int) '#', "labmanager", "headlabcoordinator", "faculty", false);
        guest5.setApproved(false);
        java.lang.String str8 = guest5.getUserType();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Guest" + "'", str8, "Guest");
    }

    @Test
    public void test1751() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1751");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("demo/data/test-users.csv");
        boolean boolean2 = userRepository1.headLabCoordinatorExists();
        java.util.Optional<com.reservation_system.model.User> userOptional4 = userRepository1.findByEmail("student");
        int int5 = userRepository1.getNextID();
        java.util.Optional<com.reservation_system.model.User> userOptional7 = userRepository1.findByEmail("Andrew");
        com.reservation_system.services.RegistrationService registrationService8 = new com.reservation_system.services.RegistrationService(userRepository1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(userOptional4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 101 + "'", int5 == 101);
        org.junit.Assert.assertNotNull(userOptional7);
    }

    @Test
    public void test1752() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1752");
        com.reservation_system.model.Faculty faculty5 = new com.reservation_system.model.Faculty(1, "", "Andrew", "Researcher", true);
        int int6 = faculty5.getID();
        java.lang.String str7 = faculty5.getUserType();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Faculty" + "'", str7, "Faculty");
    }

    @Test
    public void test1753() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1753");
        com.reservation_system.model.HeadLabCoordinator headLabCoordinator5 = new com.reservation_system.model.HeadLabCoordinator((int) (short) 10, "researcher", "student", "Faculty", false);
        java.lang.String str6 = headLabCoordinator5.getUserType();
        java.lang.String str7 = headLabCoordinator5.getUserType();
        headLabCoordinator5.setApproved(false);
        java.lang.String str10 = headLabCoordinator5.getName();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "headlabcoordinator" + "'", str6, "headlabcoordinator");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "headlabcoordinator" + "'", str7, "headlabcoordinator");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "researcher" + "'", str10, "researcher");
    }

    @Test
    public void test1754() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1754");
        com.reservation_system.model.Researcher researcher5 = new com.reservation_system.model.Researcher((int) (short) -1, "andrew@example.com", "guest", "labmanager", false);
        java.lang.String str6 = researcher5.getUserType();
        java.lang.String str7 = researcher5.getName();
        java.lang.String str8 = researcher5.getUserType();
        boolean boolean9 = researcher5.isApproved();
        java.lang.String str10 = researcher5.getUserType();
        int int11 = researcher5.getID();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Researcher" + "'", str6, "Researcher");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Researcher" + "'", str8, "Researcher");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Researcher" + "'", str10, "Researcher");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
    }

    @Test
    public void test1755() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1755");
        com.reservation_system.model.Faculty faculty5 = new com.reservation_system.model.Faculty((int) (byte) 10, "", "researcher", "", true);
    }

    @Test
    public void test1756() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1756");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("demo/data/test-users.csv");
        boolean boolean2 = userRepository1.headLabCoordinatorExists();
        com.reservation_system.services.RegistrationService registrationService3 = new com.reservation_system.services.RegistrationService(userRepository1);
        boolean boolean4 = userRepository1.headLabCoordinatorExists();
        boolean boolean6 = userRepository1.emailExists("Andrew");
        com.reservation_system.services.RegistrationService registrationService7 = new com.reservation_system.services.RegistrationService(userRepository1);
        com.reservation_system.repository.UserRepository userRepository9 = new com.reservation_system.repository.UserRepository("demo/data/test-users.csv");
        com.reservation_system.services.RegistrationService registrationService10 = new com.reservation_system.services.RegistrationService(userRepository9);
        com.reservation_system.model.Faculty faculty16 = new com.reservation_system.model.Faculty(0, "Password1!", "demo/data/test-users.csv", "researcher", false);
        java.lang.String str17 = faculty16.getName();
        userRepository9.addUser((com.reservation_system.model.User) faculty16);
        boolean boolean19 = userRepository9.headLabCoordinatorExists();
        com.reservation_system.model.Guest guest25 = new com.reservation_system.model.Guest((int) (byte) -1, "guest", "Researcher", "Faculty", true);
        userRepository9.addUser((com.reservation_system.model.User) guest25);
        java.util.List<com.reservation_system.model.User> userList27 = userRepository9.getAllUsers();
        userRepository1.saveAllUsers(userList27);
        boolean boolean29 = userRepository1.headLabCoordinatorExists();
        java.util.Optional<com.reservation_system.model.User> userOptional31 = userRepository1.findByEmail("student");
        int int32 = userRepository1.getNextID();
        java.util.List<com.reservation_system.model.User> userList33 = userRepository1.getAllUsers();
        boolean boolean35 = userRepository1.emailExists("andrew@example.com");
        com.reservation_system.model.HeadLabCoordinator headLabCoordinator41 = new com.reservation_system.model.HeadLabCoordinator(0, "Password1!", "Faculty", "Faculty", false);
        headLabCoordinator41.setApproved(true);
        userRepository1.addUser((com.reservation_system.model.User) headLabCoordinator41);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "Password1!" + "'", str17, "Password1!");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNotNull(userList27);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertNotNull(userOptional31);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 101 + "'", int32 == 101);
        org.junit.Assert.assertNotNull(userList33);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
    }

    @Test
    public void test1757() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1757");
        com.reservation_system.model.HeadLabCoordinator headLabCoordinator5 = new com.reservation_system.model.HeadLabCoordinator(0, "Password1!", "Faculty", "Faculty", false);
        headLabCoordinator5.setApproved(true);
        java.lang.String str8 = headLabCoordinator5.getPassword();
        boolean boolean9 = headLabCoordinator5.requiresDepartmentApproval();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Faculty" + "'", str8, "Faculty");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test1758() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1758");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("demo/data/test-users.csv");
        boolean boolean2 = userRepository1.headLabCoordinatorExists();
        com.reservation_system.services.RegistrationService registrationService3 = new com.reservation_system.services.RegistrationService(userRepository1);
        boolean boolean4 = userRepository1.headLabCoordinatorExists();
        boolean boolean6 = userRepository1.emailExists("Andrew");
        com.reservation_system.services.RegistrationService registrationService7 = new com.reservation_system.services.RegistrationService(userRepository1);
        java.util.Optional<com.reservation_system.model.User> userOptional9 = userRepository1.findByEmail("faculty");
        com.reservation_system.services.RegistrationService registrationService10 = new com.reservation_system.services.RegistrationService(userRepository1);
        com.reservation_system.repository.UserRepository userRepository12 = new com.reservation_system.repository.UserRepository("demo/data/test-users.csv");
        com.reservation_system.services.RegistrationService registrationService13 = new com.reservation_system.services.RegistrationService(userRepository12);
        com.reservation_system.model.Faculty faculty19 = new com.reservation_system.model.Faculty(0, "Password1!", "demo/data/test-users.csv", "researcher", false);
        java.lang.String str20 = faculty19.getName();
        userRepository12.addUser((com.reservation_system.model.User) faculty19);
        boolean boolean22 = userRepository12.headLabCoordinatorExists();
        com.reservation_system.model.Guest guest28 = new com.reservation_system.model.Guest((int) (byte) -1, "guest", "Researcher", "Faculty", true);
        userRepository12.addUser((com.reservation_system.model.User) guest28);
        boolean boolean31 = userRepository12.emailExists("Password1!");
        com.reservation_system.repository.UserRepository userRepository33 = new com.reservation_system.repository.UserRepository("demo/data/test-users.csv");
        com.reservation_system.services.RegistrationService registrationService34 = new com.reservation_system.services.RegistrationService(userRepository33);
        com.reservation_system.model.Faculty faculty40 = new com.reservation_system.model.Faculty(0, "Password1!", "demo/data/test-users.csv", "researcher", false);
        java.lang.String str41 = faculty40.getName();
        userRepository33.addUser((com.reservation_system.model.User) faculty40);
        boolean boolean43 = userRepository33.headLabCoordinatorExists();
        com.reservation_system.services.RegistrationService registrationService44 = new com.reservation_system.services.RegistrationService(userRepository33);
        java.util.List<com.reservation_system.model.User> userList45 = userRepository33.getAllUsers();
        com.reservation_system.repository.UserRepository userRepository47 = new com.reservation_system.repository.UserRepository("demo/data/test-users.csv");
        com.reservation_system.services.RegistrationService registrationService48 = new com.reservation_system.services.RegistrationService(userRepository47);
        com.reservation_system.model.Faculty faculty54 = new com.reservation_system.model.Faculty(0, "Password1!", "demo/data/test-users.csv", "researcher", false);
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
        com.reservation_system.model.Researcher researcher78 = new com.reservation_system.model.Researcher((int) (byte) 10, "", "hi!", "headlabcoordinator", true);
        userRepository1.addUser((com.reservation_system.model.User) researcher78);
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
    }

    @Test
    public void test1759() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1759");
        com.reservation_system.model.Faculty faculty5 = new com.reservation_system.model.Faculty(102, "Student", "hi!", "Password1!", false);
        int int6 = faculty5.getID();
        int int7 = faculty5.getID();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 102 + "'", int6 == 102);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 102 + "'", int7 == 102);
    }

    @Test
    public void test1760() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1760");
        com.reservation_system.model.Guest guest5 = new com.reservation_system.model.Guest((int) '#', "Andrew", "student", "Faculty", false);
        java.lang.String str6 = guest5.getUserType();
        guest5.setApproved(true);
        java.lang.String str9 = guest5.getUserType();
        java.lang.String str10 = guest5.getUserType();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Guest" + "'", str6, "Guest");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Guest" + "'", str9, "Guest");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Guest" + "'", str10, "Guest");
    }

    @Test
    public void test1761() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1761");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("demo/data/test-users.csv");
        boolean boolean2 = userRepository1.headLabCoordinatorExists();
        com.reservation_system.services.RegistrationService registrationService3 = new com.reservation_system.services.RegistrationService(userRepository1);
        boolean boolean4 = userRepository1.headLabCoordinatorExists();
        boolean boolean6 = userRepository1.emailExists("Andrew");
        com.reservation_system.services.RegistrationService registrationService7 = new com.reservation_system.services.RegistrationService(userRepository1);
        com.reservation_system.repository.UserRepository userRepository9 = new com.reservation_system.repository.UserRepository("demo/data/test-users.csv");
        com.reservation_system.services.RegistrationService registrationService10 = new com.reservation_system.services.RegistrationService(userRepository9);
        com.reservation_system.model.Faculty faculty16 = new com.reservation_system.model.Faculty(0, "Password1!", "demo/data/test-users.csv", "researcher", false);
        java.lang.String str17 = faculty16.getName();
        userRepository9.addUser((com.reservation_system.model.User) faculty16);
        boolean boolean19 = userRepository9.headLabCoordinatorExists();
        com.reservation_system.model.Guest guest25 = new com.reservation_system.model.Guest((int) (byte) -1, "guest", "Researcher", "Faculty", true);
        userRepository9.addUser((com.reservation_system.model.User) guest25);
        java.util.List<com.reservation_system.model.User> userList27 = userRepository9.getAllUsers();
        userRepository1.saveAllUsers(userList27);
        java.util.Optional<com.reservation_system.model.User> userOptional30 = userRepository1.findByEmail("hi!");
        com.reservation_system.repository.UserRepository userRepository32 = new com.reservation_system.repository.UserRepository("demo/data/test-users.csv");
        com.reservation_system.services.RegistrationService registrationService33 = new com.reservation_system.services.RegistrationService(userRepository32);
        boolean boolean35 = userRepository32.emailExists("Password1!");
        boolean boolean37 = userRepository32.emailExists("Password1!");
        boolean boolean39 = userRepository32.emailExists("andrew@example.com");
        java.util.List<com.reservation_system.model.User> userList40 = userRepository32.getAllUsers();
        userRepository1.saveAllUsers(userList40);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "Password1!" + "'", str17, "Password1!");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNotNull(userList27);
        org.junit.Assert.assertNotNull(userOptional30);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
        org.junit.Assert.assertNotNull(userList40);
    }

    @Test
    public void test1762() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1762");
        com.reservation_system.model.Student student5 = new com.reservation_system.model.Student(100, "Faculty", "Student", "hi!", true);
        java.lang.String str6 = student5.getUserType();
        int int7 = student5.getID();
        java.lang.String str8 = student5.getPassword();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Student" + "'", str6, "Student");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 100 + "'", int7 == 100);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
    }

    @Test
    public void test1763() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1763");
        com.reservation_system.model.Student student5 = new com.reservation_system.model.Student((int) '4', "", "headlabcoordinator", "student", false);
        int int6 = student5.getID();
        java.lang.String str7 = student5.getUserType();
        student5.setApproved(true);
        java.lang.String str10 = student5.getUserType();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 52 + "'", int6 == 52);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Student" + "'", str7, "Student");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Student" + "'", str10, "Student");
    }

    @Test
    public void test1764() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1764");
        com.reservation_system.model.Student student5 = new com.reservation_system.model.Student((int) (short) -1, "Andrew", "Guest", "Faculty", true);
        java.lang.String str6 = student5.getUserType();
        boolean boolean7 = student5.requiresDepartmentApproval();
        int int8 = student5.getID();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Student" + "'", str6, "Student");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
    }

    @Test
    public void test1765() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1765");
        com.reservation_system.model.LabManager labManager5 = new com.reservation_system.model.LabManager((int) '#', "researcher", "Faculty", "guest", false);
        java.lang.String str6 = labManager5.getEmail();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Faculty" + "'", str6, "Faculty");
    }

    @Test
    public void test1766() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1766");
        com.reservation_system.model.LabManager labManager5 = new com.reservation_system.model.LabManager(1, "student", "", "Researcher", false);
        boolean boolean6 = labManager5.isApproved();
        java.lang.String str7 = labManager5.getUserType();
        labManager5.setApproved(true);
        java.lang.String str10 = labManager5.getUserType();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "labmanager" + "'", str7, "labmanager");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "labmanager" + "'", str10, "labmanager");
    }

    @Test
    public void test1767() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1767");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("demo/data/test-users.csv");
        com.reservation_system.services.RegistrationService registrationService2 = new com.reservation_system.services.RegistrationService(userRepository1);
        int int3 = userRepository1.getNextID();
        boolean boolean5 = userRepository1.emailExists("labmanager");
        java.util.List<com.reservation_system.model.User> userList6 = userRepository1.getAllUsers();
        com.reservation_system.repository.UserRepository userRepository8 = new com.reservation_system.repository.UserRepository("demo/data/test-users.csv");
        java.util.List<com.reservation_system.model.User> userList9 = userRepository8.getAllUsers();
        com.reservation_system.services.RegistrationService registrationService10 = new com.reservation_system.services.RegistrationService(userRepository8);
        com.reservation_system.services.RegistrationService registrationService11 = new com.reservation_system.services.RegistrationService(userRepository8);
        java.util.List<com.reservation_system.model.User> userList12 = userRepository8.getAllUsers();
        userRepository1.saveAllUsers(userList12);
        com.reservation_system.model.Faculty faculty19 = new com.reservation_system.model.Faculty(0, "", "researcher", "Researcher", false);
        userRepository1.addUser((com.reservation_system.model.User) faculty19);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 101 + "'", int3 == 101);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(userList6);
        org.junit.Assert.assertNotNull(userList9);
        org.junit.Assert.assertNotNull(userList12);
    }

    @Test
    public void test1768() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1768");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("demo/data/test-users.csv");
        com.reservation_system.services.RegistrationService registrationService2 = new com.reservation_system.services.RegistrationService(userRepository1);
        com.reservation_system.model.Faculty faculty8 = new com.reservation_system.model.Faculty(0, "Password1!", "demo/data/test-users.csv", "researcher", false);
        java.lang.String str9 = faculty8.getName();
        userRepository1.addUser((com.reservation_system.model.User) faculty8);
        boolean boolean12 = userRepository1.emailExists("Faculty");
        int int13 = userRepository1.getNextID();
        int int14 = userRepository1.getNextID();
        com.reservation_system.model.Guest guest20 = new com.reservation_system.model.Guest((int) '#', "Guest", "researcher", "headlabcoordinator", true);
        userRepository1.addUser((com.reservation_system.model.User) guest20);
        java.util.Optional<com.reservation_system.model.User> userOptional23 = userRepository1.findByEmail("Student");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Password1!" + "'", str9, "Password1!");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 101 + "'", int13 == 101);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 101 + "'", int14 == 101);
        org.junit.Assert.assertNotNull(userOptional23);
    }

    @Test
    public void test1769() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1769");
        com.reservation_system.model.Faculty faculty5 = new com.reservation_system.model.Faculty((int) (byte) 1, "guest", "", "headlabcoordinator", false);
        boolean boolean6 = faculty5.requiresDepartmentApproval();
        boolean boolean7 = faculty5.isApproved();
        java.lang.String str8 = faculty5.getUserType();
        java.lang.String str9 = faculty5.getPassword();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Faculty" + "'", str8, "Faculty");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "headlabcoordinator" + "'", str9, "headlabcoordinator");
    }

    @Test
    public void test1770() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1770");
        com.reservation_system.model.Researcher researcher5 = new com.reservation_system.model.Researcher((int) (short) -1, "andrew@example.com", "guest", "labmanager", false);
        java.lang.String str6 = researcher5.getUserType();
        boolean boolean7 = researcher5.isApproved();
        boolean boolean8 = researcher5.isApproved();
        boolean boolean9 = researcher5.requiresDepartmentApproval();
        java.lang.String str10 = researcher5.getUserType();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Researcher" + "'", str6, "Researcher");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Researcher" + "'", str10, "Researcher");
    }

    @Test
    public void test1771() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1771");
        com.reservation_system.model.Faculty faculty5 = new com.reservation_system.model.Faculty(100, "andrew@example.com", "", "faculty", true);
        boolean boolean6 = faculty5.isApproved();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test1772() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1772");
        com.reservation_system.model.Student student5 = new com.reservation_system.model.Student((int) (byte) 10, "guest", "student", "Student", false);
    }

    @Test
    public void test1773() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1773");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("demo/data/test-users.csv");
        com.reservation_system.services.RegistrationService registrationService2 = new com.reservation_system.services.RegistrationService(userRepository1);
        int int3 = userRepository1.getNextID();
        boolean boolean5 = userRepository1.emailExists("Andrew");
        com.reservation_system.model.Researcher researcher11 = new com.reservation_system.model.Researcher((int) (short) -1, "faculty", "researcher", "hi!", true);
        java.lang.String str12 = researcher11.getUserType();
        int int13 = researcher11.getID();
        java.lang.String str14 = researcher11.getUserType();
        userRepository1.addUser((com.reservation_system.model.User) researcher11);
        java.util.List<com.reservation_system.model.User> userList16 = userRepository1.getAllUsers();
        boolean boolean17 = userRepository1.headLabCoordinatorExists();
        java.lang.Class<?> wildcardClass18 = userRepository1.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 101 + "'", int3 == 101);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Researcher" + "'", str12, "Researcher");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Researcher" + "'", str14, "Researcher");
        org.junit.Assert.assertNotNull(userList16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test1774() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1774");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("demo/data/test-users.csv");
        boolean boolean2 = userRepository1.headLabCoordinatorExists();
        com.reservation_system.services.RegistrationService registrationService3 = new com.reservation_system.services.RegistrationService(userRepository1);
        boolean boolean5 = userRepository1.emailExists("");
        boolean boolean6 = userRepository1.headLabCoordinatorExists();
        com.reservation_system.services.RegistrationService registrationService7 = new com.reservation_system.services.RegistrationService(userRepository1);
        com.reservation_system.repository.UserRepository userRepository9 = new com.reservation_system.repository.UserRepository("demo/data/test-users.csv");
        com.reservation_system.services.RegistrationService registrationService10 = new com.reservation_system.services.RegistrationService(userRepository9);
        com.reservation_system.model.Faculty faculty16 = new com.reservation_system.model.Faculty(0, "Password1!", "demo/data/test-users.csv", "researcher", false);
        java.lang.String str17 = faculty16.getName();
        userRepository9.addUser((com.reservation_system.model.User) faculty16);
        boolean boolean19 = userRepository9.headLabCoordinatorExists();
        com.reservation_system.repository.UserRepository userRepository21 = new com.reservation_system.repository.UserRepository("demo/data/test-users.csv");
        com.reservation_system.services.RegistrationService registrationService22 = new com.reservation_system.services.RegistrationService(userRepository21);
        com.reservation_system.model.Faculty faculty28 = new com.reservation_system.model.Faculty(0, "Password1!", "demo/data/test-users.csv", "researcher", false);
        java.lang.String str29 = faculty28.getName();
        userRepository21.addUser((com.reservation_system.model.User) faculty28);
        java.util.List<com.reservation_system.model.User> userList31 = userRepository21.getAllUsers();
        userRepository9.saveAllUsers(userList31);
        userRepository1.saveAllUsers(userList31);
        int int34 = userRepository1.getNextID();
        boolean boolean35 = userRepository1.headLabCoordinatorExists();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "Password1!" + "'", str17, "Password1!");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "Password1!" + "'", str29, "Password1!");
        org.junit.Assert.assertNotNull(userList31);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 101 + "'", int34 == 101);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
    }

    @Test
    public void test1775() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1775");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("demo/data/test-users.csv");
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
        com.reservation_system.repository.UserRepository userRepository31 = new com.reservation_system.repository.UserRepository("demo/data/test-users.csv");
        com.reservation_system.services.RegistrationService registrationService32 = new com.reservation_system.services.RegistrationService(userRepository31);
        com.reservation_system.model.Faculty faculty38 = new com.reservation_system.model.Faculty(0, "Password1!", "demo/data/test-users.csv", "researcher", false);
        java.lang.String str39 = faculty38.getName();
        userRepository31.addUser((com.reservation_system.model.User) faculty38);
        boolean boolean41 = userRepository31.headLabCoordinatorExists();
        com.reservation_system.services.RegistrationService registrationService42 = new com.reservation_system.services.RegistrationService(userRepository31);
        java.util.List<com.reservation_system.model.User> userList43 = userRepository31.getAllUsers();
        userRepository1.saveAllUsers(userList43);
        boolean boolean46 = userRepository1.emailExists("");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 101 + "'", int2 == 101);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 101 + "'", int3 == 101);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(userOptional14);
        org.junit.Assert.assertNotNull(userList22);
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "Password1!" + "'", str39, "Password1!");
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + true + "'", boolean41 == true);
        org.junit.Assert.assertNotNull(userList43);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + true + "'", boolean46 == true);
    }

    @Test
    public void test1776() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1776");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("demo/data/test-users.csv");
        java.util.Optional<com.reservation_system.model.User> userOptional3 = userRepository1.findByEmail("hi!");
        int int4 = userRepository1.getNextID();
        int int5 = userRepository1.getNextID();
        java.util.Optional<com.reservation_system.model.User> userOptional7 = userRepository1.findByEmail("");
        java.util.List<com.reservation_system.model.User> userList8 = null;
        // The following exception was thrown during execution in test generation
        try {
            userRepository1.saveAllUsers(userList8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(userOptional3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 101 + "'", int4 == 101);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 101 + "'", int5 == 101);
        org.junit.Assert.assertNotNull(userOptional7);
    }

    @Test
    public void test1777() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1777");
        com.reservation_system.model.Faculty faculty5 = new com.reservation_system.model.Faculty((int) (short) -1, "", "", "Faculty", true);
    }

    @Test
    public void test1778() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1778");
        com.reservation_system.model.Researcher researcher5 = new com.reservation_system.model.Researcher((int) (byte) 100, "Password1!", "Password1!", "headlabcoordinator", true);
        boolean boolean6 = researcher5.requiresDepartmentApproval();
        java.lang.String str7 = researcher5.getEmail();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Password1!" + "'", str7, "Password1!");
    }

    @Test
    public void test1779() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1779");
        com.reservation_system.model.Guest guest5 = new com.reservation_system.model.Guest(0, "demo/data/test-users.csv", "", "faculty", false);
    }

    @Test
    public void test1780() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1780");
        com.reservation_system.model.HeadLabCoordinator headLabCoordinator5 = new com.reservation_system.model.HeadLabCoordinator((int) (byte) 1, "hi!", "Guest", "Andrew", false);
        boolean boolean6 = headLabCoordinator5.requiresDepartmentApproval();
        java.lang.String str7 = headLabCoordinator5.getUserType();
        boolean boolean8 = headLabCoordinator5.requiresDepartmentApproval();
        int int9 = headLabCoordinator5.getID();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "headlabcoordinator" + "'", str7, "headlabcoordinator");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
    }

    @Test
    public void test1781() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1781");
        com.reservation_system.model.Faculty faculty5 = new com.reservation_system.model.Faculty(0, "Faculty", "Faculty", "andrew@example.com", true);
    }

    @Test
    public void test1782() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1782");
        com.reservation_system.model.Faculty faculty5 = new com.reservation_system.model.Faculty((int) (byte) 10, "guest", "demo/data/test-users.csv", "headlabcoordinator", false);
    }

    @Test
    public void test1783() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1783");
        com.reservation_system.model.Guest guest5 = new com.reservation_system.model.Guest((int) '#', "Andrew", "student", "Faculty", false);
        java.lang.String str6 = guest5.getUserType();
        guest5.setApproved(true);
        java.lang.String str9 = guest5.getUserType();
        java.lang.String str10 = guest5.getName();
        java.lang.String str11 = guest5.getName();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Guest" + "'", str6, "Guest");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Guest" + "'", str9, "Guest");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Andrew" + "'", str10, "Andrew");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Andrew" + "'", str11, "Andrew");
    }

    @Test
    public void test1784() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1784");
        com.reservation_system.model.LabManager labManager5 = new com.reservation_system.model.LabManager((int) '4', "Student", "", "guest", false);
        labManager5.setApproved(false);
    }

    @Test
    public void test1785() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1785");
        com.reservation_system.model.LabManager labManager5 = new com.reservation_system.model.LabManager(0, "guest", "student", "faculty", false);
        java.lang.String str6 = labManager5.getPassword();
        java.lang.String str7 = labManager5.getUserType();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "faculty" + "'", str6, "faculty");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "labmanager" + "'", str7, "labmanager");
    }

    @Test
    public void test1786() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1786");
        com.reservation_system.model.HeadLabCoordinator headLabCoordinator5 = new com.reservation_system.model.HeadLabCoordinator(10, "Faculty", "researcher", "student", true);
        boolean boolean6 = headLabCoordinator5.isApproved();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test1787() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1787");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("demo/data/test-users.csv");
        com.reservation_system.services.RegistrationService registrationService2 = new com.reservation_system.services.RegistrationService(userRepository1);
        int int3 = userRepository1.getNextID();
        boolean boolean5 = userRepository1.emailExists("labmanager");
        java.util.List<com.reservation_system.model.User> userList6 = userRepository1.getAllUsers();
        boolean boolean7 = userRepository1.headLabCoordinatorExists();
        java.util.List<com.reservation_system.model.User> userList8 = userRepository1.getAllUsers();
        com.reservation_system.services.RegistrationService registrationService9 = new com.reservation_system.services.RegistrationService(userRepository1);
        java.util.Optional<com.reservation_system.model.User> userOptional11 = userRepository1.findByEmail("Researcher");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(userList6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(userList8);
        org.junit.Assert.assertNotNull(userOptional11);
    }

    @Test
    public void test1788() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1788");
        com.reservation_system.model.Guest guest5 = new com.reservation_system.model.Guest((int) (byte) -1, "demo/data/test-users.csv", "Guest", "", true);
        java.lang.String str6 = guest5.getPassword();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
    }

    @Test
    public void test1789() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1789");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("demo/data/test-users.csv");
        com.reservation_system.services.RegistrationService registrationService2 = new com.reservation_system.services.RegistrationService(userRepository1);
        com.reservation_system.model.Faculty faculty8 = new com.reservation_system.model.Faculty(0, "Password1!", "demo/data/test-users.csv", "researcher", false);
        java.lang.String str9 = faculty8.getName();
        userRepository1.addUser((com.reservation_system.model.User) faculty8);
        boolean boolean12 = userRepository1.emailExists("Faculty");
        int int13 = userRepository1.getNextID();
        int int14 = userRepository1.getNextID();
        java.util.Optional<com.reservation_system.model.User> userOptional16 = userRepository1.findByEmail("Faculty");
        int int17 = userRepository1.getNextID();
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Password1!" + "'", str9, "Password1!");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertNotNull(userOptional16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
    }

    @Test
    public void test1790() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1790");
        com.reservation_system.model.Student student5 = new com.reservation_system.model.Student((int) ' ', "Password1!", "andrew@example.com", "researcher", false);
        java.lang.String str6 = student5.getUserType();
        student5.setApproved(false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Student" + "'", str6, "Student");
    }

    @Test
    public void test1791() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1791");
        com.reservation_system.model.LabManager labManager5 = new com.reservation_system.model.LabManager((int) (byte) 100, "hi!", "Researcher", "Andrew", true);
    }

    @Test
    public void test1792() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1792");
        com.reservation_system.model.HeadLabCoordinator headLabCoordinator5 = new com.reservation_system.model.HeadLabCoordinator(97, "guest", "researcher", "andrew@example.com", true);
        headLabCoordinator5.setApproved(false);
    }

    @Test
    public void test1793() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1793");
        com.reservation_system.model.Researcher researcher5 = new com.reservation_system.model.Researcher((int) (byte) 100, "demo/data/test-users.csv", "Faculty", "Student", false);
        java.lang.String str6 = researcher5.getUserType();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Researcher" + "'", str6, "Researcher");
    }

    @Test
    public void test1794() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1794");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("demo/data/test-users.csv");
        boolean boolean2 = userRepository1.headLabCoordinatorExists();
        com.reservation_system.services.RegistrationService registrationService3 = new com.reservation_system.services.RegistrationService(userRepository1);
        boolean boolean4 = userRepository1.headLabCoordinatorExists();
        boolean boolean6 = userRepository1.emailExists("Andrew");
        com.reservation_system.services.RegistrationService registrationService7 = new com.reservation_system.services.RegistrationService(userRepository1);
        com.reservation_system.repository.UserRepository userRepository9 = new com.reservation_system.repository.UserRepository("demo/data/test-users.csv");
        com.reservation_system.services.RegistrationService registrationService10 = new com.reservation_system.services.RegistrationService(userRepository9);
        com.reservation_system.model.Faculty faculty16 = new com.reservation_system.model.Faculty(0, "Password1!", "demo/data/test-users.csv", "researcher", false);
        java.lang.String str17 = faculty16.getName();
        userRepository9.addUser((com.reservation_system.model.User) faculty16);
        boolean boolean19 = userRepository9.headLabCoordinatorExists();
        com.reservation_system.model.Guest guest25 = new com.reservation_system.model.Guest((int) (byte) -1, "guest", "Researcher", "Faculty", true);
        userRepository9.addUser((com.reservation_system.model.User) guest25);
        java.util.List<com.reservation_system.model.User> userList27 = userRepository9.getAllUsers();
        userRepository1.saveAllUsers(userList27);
        com.reservation_system.repository.UserRepository userRepository30 = new com.reservation_system.repository.UserRepository("demo/data/test-users.csv");
        com.reservation_system.services.RegistrationService registrationService31 = new com.reservation_system.services.RegistrationService(userRepository30);
        com.reservation_system.model.Faculty faculty37 = new com.reservation_system.model.Faculty(0, "Password1!", "demo/data/test-users.csv", "researcher", false);
        java.lang.String str38 = faculty37.getName();
        userRepository30.addUser((com.reservation_system.model.User) faculty37);
        boolean boolean40 = userRepository30.headLabCoordinatorExists();
        int int41 = userRepository30.getNextID();
        com.reservation_system.repository.UserRepository userRepository43 = new com.reservation_system.repository.UserRepository("demo/data/test-users.csv");
        com.reservation_system.services.RegistrationService registrationService44 = new com.reservation_system.services.RegistrationService(userRepository43);
        int int45 = userRepository43.getNextID();
        boolean boolean47 = userRepository43.emailExists("labmanager");
        java.util.List<com.reservation_system.model.User> userList48 = userRepository43.getAllUsers();
        userRepository30.saveAllUsers(userList48);
        userRepository1.saveAllUsers(userList48);
        boolean boolean52 = userRepository1.emailExists("Guest");
        com.reservation_system.services.RegistrationService registrationService53 = new com.reservation_system.services.RegistrationService(userRepository1);
        boolean boolean54 = userRepository1.headLabCoordinatorExists();
        com.reservation_system.model.User user61 = com.reservation_system.patterns.factory.UserFactory.createUser("headlabcoordinator", (int) (byte) 100, "Researcher", "student", "Password1!", false);
        userRepository1.addUser(user61);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "Password1!" + "'", str17, "Password1!");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(userList27);
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "Password1!" + "'", str38, "Password1!");
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 1 + "'", int41 == 1);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 1 + "'", int45 == 1);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertNotNull(userList48);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertNotNull(user61);
    }

    @Test
    public void test1795() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1795");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("demo/data/test-users.csv");
        java.util.Optional<com.reservation_system.model.User> userOptional3 = userRepository1.findByEmail("hi!");
        int int4 = userRepository1.getNextID();
        com.reservation_system.services.RegistrationService registrationService5 = new com.reservation_system.services.RegistrationService(userRepository1);
        int int6 = userRepository1.getNextID();
        boolean boolean7 = userRepository1.headLabCoordinatorExists();
        org.junit.Assert.assertNotNull(userOptional3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 101 + "'", int4 == 101);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 101 + "'", int6 == 101);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test1796() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1796");
        com.reservation_system.model.Faculty faculty5 = new com.reservation_system.model.Faculty(10, "andrew@example.com", "student", "demo/data/test-users.csv", true);
    }

    @Test
    public void test1797() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1797");
        com.reservation_system.model.Researcher researcher5 = new com.reservation_system.model.Researcher((int) (short) -1, "faculty", "researcher", "hi!", true);
        java.lang.String str6 = researcher5.getUserType();
        int int7 = researcher5.getID();
        boolean boolean8 = researcher5.requiresDepartmentApproval();
        java.lang.String str9 = researcher5.getUserType();
        java.lang.String str10 = researcher5.getUserType();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Researcher" + "'", str6, "Researcher");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Researcher" + "'", str9, "Researcher");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Researcher" + "'", str10, "Researcher");
    }

    @Test
    public void test1798() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1798");
        com.reservation_system.model.HeadLabCoordinator headLabCoordinator5 = new com.reservation_system.model.HeadLabCoordinator(32, "Andrew", "hi!", "demo/data/test-users.csv", false);
    }

    @Test
    public void test1799() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1799");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("demo/data/test-users.csv");
        java.util.Optional<com.reservation_system.model.User> userOptional3 = userRepository1.findByEmail("hi!");
        int int4 = userRepository1.getNextID();
        boolean boolean5 = userRepository1.headLabCoordinatorExists();
        java.util.List<com.reservation_system.model.User> userList6 = userRepository1.getAllUsers();
        com.reservation_system.services.RegistrationService registrationService7 = new com.reservation_system.services.RegistrationService(userRepository1);
        // The following exception was thrown during execution in test generation
        try {
            com.reservation_system.model.User user12 = registrationService7.registerUser("andrew@example.com", "andrew@example.com", "Student", "researcher");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid user type.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(userOptional3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 101 + "'", int4 == 101);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(userList6);
    }

    @Test
    public void test1800() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1800");
        com.reservation_system.model.Faculty faculty5 = new com.reservation_system.model.Faculty(0, "", "Guest", "headlabcoordinator", true);
    }

    @Test
    public void test1801() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1801");
        com.reservation_system.model.Researcher researcher5 = new com.reservation_system.model.Researcher((int) 'a', "demo/data/test-users.csv", "guest", "Researcher", true);
        java.lang.String str6 = researcher5.getEmail();
        java.lang.String str7 = researcher5.getEmail();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "guest" + "'", str6, "guest");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "guest" + "'", str7, "guest");
    }

    @Test
    public void test1802() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1802");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("demo/data/test-users.csv");
        int int2 = userRepository1.getNextID();
        int int3 = userRepository1.getNextID();
        boolean boolean5 = userRepository1.emailExists("");
        boolean boolean7 = userRepository1.emailExists("faculty");
        java.util.Optional<com.reservation_system.model.User> userOptional9 = userRepository1.findByEmail("headlabcoordinator");
        com.reservation_system.model.Student student15 = new com.reservation_system.model.Student((int) (byte) 0, "Student", "Andrew", "labmanager", false);
        java.lang.String str16 = student15.getUserType();
        boolean boolean17 = student15.requiresDepartmentApproval();
        userRepository1.addUser((com.reservation_system.model.User) student15);
        com.reservation_system.services.RegistrationService registrationService19 = new com.reservation_system.services.RegistrationService(userRepository1);
        java.util.List<com.reservation_system.model.User> userList20 = null;
        // The following exception was thrown during execution in test generation
        try {
            userRepository1.saveAllUsers(userList20);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 101 + "'", int2 == 101);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 101 + "'", int3 == 101);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(userOptional9);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Student" + "'", str16, "Student");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
    }

    @Test
    public void test1803() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1803");
        com.reservation_system.model.Researcher researcher5 = new com.reservation_system.model.Researcher(32, "Andrew", "guest", "guest", false);
        researcher5.setApproved(true);
        int int8 = researcher5.getID();
        java.lang.String str9 = researcher5.getName();
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 32 + "'", int8 == 32);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Andrew" + "'", str9, "Andrew");
    }

    @Test
    public void test1804() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1804");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("demo/data/test-users.csv");
        boolean boolean2 = userRepository1.headLabCoordinatorExists();
        com.reservation_system.repository.UserRepository userRepository4 = new com.reservation_system.repository.UserRepository("demo/data/test-users.csv");
        boolean boolean5 = userRepository4.headLabCoordinatorExists();
        com.reservation_system.services.RegistrationService registrationService6 = new com.reservation_system.services.RegistrationService(userRepository4);
        boolean boolean8 = userRepository4.emailExists("");
        com.reservation_system.repository.UserRepository userRepository10 = new com.reservation_system.repository.UserRepository("demo/data/test-users.csv");
        com.reservation_system.services.RegistrationService registrationService11 = new com.reservation_system.services.RegistrationService(userRepository10);
        com.reservation_system.model.Faculty faculty17 = new com.reservation_system.model.Faculty(0, "Password1!", "demo/data/test-users.csv", "researcher", false);
        java.lang.String str18 = faculty17.getName();
        userRepository10.addUser((com.reservation_system.model.User) faculty17);
        java.util.List<com.reservation_system.model.User> userList20 = userRepository10.getAllUsers();
        userRepository4.saveAllUsers(userList20);
        userRepository1.saveAllUsers(userList20);
        com.reservation_system.model.LabManager labManager28 = new com.reservation_system.model.LabManager((int) '#', "demo/data/test-users.csv", "hi!", "", false);
        userRepository1.addUser((com.reservation_system.model.User) labManager28);
        java.util.List<com.reservation_system.model.User> userList30 = userRepository1.getAllUsers();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Password1!" + "'", str18, "Password1!");
        org.junit.Assert.assertNotNull(userList20);
        org.junit.Assert.assertNotNull(userList30);
    }

    @Test
    public void test1805() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1805");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("demo/data/test-users.csv");
        com.reservation_system.services.RegistrationService registrationService2 = new com.reservation_system.services.RegistrationService(userRepository1);
        com.reservation_system.model.Faculty faculty8 = new com.reservation_system.model.Faculty(0, "Password1!", "demo/data/test-users.csv", "researcher", false);
        java.lang.String str9 = faculty8.getName();
        userRepository1.addUser((com.reservation_system.model.User) faculty8);
        boolean boolean11 = userRepository1.headLabCoordinatorExists();
        com.reservation_system.services.RegistrationService registrationService12 = new com.reservation_system.services.RegistrationService(userRepository1);
        com.reservation_system.services.RegistrationService registrationService13 = new com.reservation_system.services.RegistrationService(userRepository1);
        java.util.List<com.reservation_system.model.User> userList14 = userRepository1.getAllUsers();
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Password1!" + "'", str9, "Password1!");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(userList14);
    }

    @Test
    public void test1806() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1806");
        com.reservation_system.model.LabManager labManager5 = new com.reservation_system.model.LabManager((-1), "guest", "Faculty", "Password1!", true);
        java.lang.String str6 = labManager5.getUserType();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "labmanager" + "'", str6, "labmanager");
    }

    @Test
    public void test1807() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1807");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("demo/data/test-users.csv");
        com.reservation_system.services.RegistrationService registrationService2 = new com.reservation_system.services.RegistrationService(userRepository1);
        com.reservation_system.services.RegistrationService registrationService3 = new com.reservation_system.services.RegistrationService(userRepository1);
        boolean boolean5 = userRepository1.emailExists("faculty");
        java.util.Optional<com.reservation_system.model.User> userOptional7 = userRepository1.findByEmail("researcher");
        boolean boolean8 = userRepository1.headLabCoordinatorExists();
        boolean boolean9 = userRepository1.headLabCoordinatorExists();
        java.util.Optional<com.reservation_system.model.User> userOptional11 = userRepository1.findByEmail("andrew@example.com");
        boolean boolean13 = userRepository1.emailExists("faculty");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(userOptional7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(userOptional11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test1808() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1808");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("demo/data/test-users.csv");
        com.reservation_system.services.RegistrationService registrationService2 = new com.reservation_system.services.RegistrationService(userRepository1);
        com.reservation_system.model.Faculty faculty8 = new com.reservation_system.model.Faculty(0, "Password1!", "demo/data/test-users.csv", "researcher", false);
        java.lang.String str9 = faculty8.getName();
        userRepository1.addUser((com.reservation_system.model.User) faculty8);
        boolean boolean12 = userRepository1.emailExists("Faculty");
        int int13 = userRepository1.getNextID();
        com.reservation_system.services.RegistrationService registrationService14 = new com.reservation_system.services.RegistrationService(userRepository1);
        java.util.List<com.reservation_system.model.User> userList15 = userRepository1.getAllUsers();
        com.reservation_system.services.RegistrationService registrationService16 = new com.reservation_system.services.RegistrationService(userRepository1);
        com.reservation_system.model.Researcher researcher22 = new com.reservation_system.model.Researcher((int) (byte) 100, "Password1!", "Password1!", "headlabcoordinator", true);
        userRepository1.addUser((com.reservation_system.model.User) researcher22);
        java.lang.String str24 = researcher22.getUserType();
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Password1!" + "'", str9, "Password1!");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 36 + "'", int13 == 36);
        org.junit.Assert.assertNotNull(userList15);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "Researcher" + "'", str24, "Researcher");
    }

    @Test
    public void test1809() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1809");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("demo/data/test-users.csv");
        boolean boolean2 = userRepository1.headLabCoordinatorExists();
        com.reservation_system.services.RegistrationService registrationService3 = new com.reservation_system.services.RegistrationService(userRepository1);
        boolean boolean4 = userRepository1.headLabCoordinatorExists();
        boolean boolean6 = userRepository1.emailExists("Andrew");
        com.reservation_system.services.RegistrationService registrationService7 = new com.reservation_system.services.RegistrationService(userRepository1);
        java.util.Optional<com.reservation_system.model.User> userOptional9 = userRepository1.findByEmail("faculty");
        com.reservation_system.services.RegistrationService registrationService10 = new com.reservation_system.services.RegistrationService(userRepository1);
        com.reservation_system.repository.UserRepository userRepository12 = new com.reservation_system.repository.UserRepository("demo/data/test-users.csv");
        com.reservation_system.services.RegistrationService registrationService13 = new com.reservation_system.services.RegistrationService(userRepository12);
        com.reservation_system.model.Faculty faculty19 = new com.reservation_system.model.Faculty(0, "Password1!", "demo/data/test-users.csv", "researcher", false);
        java.lang.String str20 = faculty19.getName();
        userRepository12.addUser((com.reservation_system.model.User) faculty19);
        boolean boolean22 = userRepository12.headLabCoordinatorExists();
        com.reservation_system.model.Guest guest28 = new com.reservation_system.model.Guest((int) (byte) -1, "guest", "Researcher", "Faculty", true);
        userRepository12.addUser((com.reservation_system.model.User) guest28);
        boolean boolean31 = userRepository12.emailExists("Password1!");
        com.reservation_system.repository.UserRepository userRepository33 = new com.reservation_system.repository.UserRepository("demo/data/test-users.csv");
        com.reservation_system.services.RegistrationService registrationService34 = new com.reservation_system.services.RegistrationService(userRepository33);
        com.reservation_system.model.Faculty faculty40 = new com.reservation_system.model.Faculty(0, "Password1!", "demo/data/test-users.csv", "researcher", false);
        java.lang.String str41 = faculty40.getName();
        userRepository33.addUser((com.reservation_system.model.User) faculty40);
        boolean boolean43 = userRepository33.headLabCoordinatorExists();
        com.reservation_system.services.RegistrationService registrationService44 = new com.reservation_system.services.RegistrationService(userRepository33);
        java.util.List<com.reservation_system.model.User> userList45 = userRepository33.getAllUsers();
        com.reservation_system.repository.UserRepository userRepository47 = new com.reservation_system.repository.UserRepository("demo/data/test-users.csv");
        com.reservation_system.services.RegistrationService registrationService48 = new com.reservation_system.services.RegistrationService(userRepository47);
        com.reservation_system.model.Faculty faculty54 = new com.reservation_system.model.Faculty(0, "Password1!", "demo/data/test-users.csv", "researcher", false);
        java.lang.String str55 = faculty54.getName();
        userRepository47.addUser((com.reservation_system.model.User) faculty54);
        boolean boolean57 = userRepository47.headLabCoordinatorExists();
        com.reservation_system.services.RegistrationService registrationService58 = new com.reservation_system.services.RegistrationService(userRepository47);
        java.util.List<com.reservation_system.model.User> userList59 = userRepository47.getAllUsers();
        userRepository33.saveAllUsers(userList59);
        userRepository12.saveAllUsers(userList59);
        java.util.List<com.reservation_system.model.User> userList62 = userRepository12.getAllUsers();
        userRepository1.saveAllUsers(userList62);
        com.reservation_system.repository.UserRepository userRepository65 = new com.reservation_system.repository.UserRepository("demo/data/test-users.csv");
        java.util.List<com.reservation_system.model.User> userList66 = userRepository65.getAllUsers();
        com.reservation_system.services.RegistrationService registrationService67 = new com.reservation_system.services.RegistrationService(userRepository65);
        java.util.List<com.reservation_system.model.User> userList68 = userRepository65.getAllUsers();
        userRepository1.saveAllUsers(userList68);
        com.reservation_system.repository.UserRepository userRepository71 = new com.reservation_system.repository.UserRepository("demo/data/test-users.csv");
        com.reservation_system.services.RegistrationService registrationService72 = new com.reservation_system.services.RegistrationService(userRepository71);
        com.reservation_system.model.Faculty faculty78 = new com.reservation_system.model.Faculty(0, "Password1!", "demo/data/test-users.csv", "researcher", false);
        java.lang.String str79 = faculty78.getName();
        userRepository71.addUser((com.reservation_system.model.User) faculty78);
        boolean boolean81 = userRepository71.headLabCoordinatorExists();
        com.reservation_system.model.Guest guest87 = new com.reservation_system.model.Guest((int) (byte) -1, "guest", "Researcher", "Faculty", true);
        userRepository71.addUser((com.reservation_system.model.User) guest87);
        boolean boolean90 = userRepository71.emailExists("Password1!");
        boolean boolean92 = userRepository71.emailExists("hi!");
        int int93 = userRepository71.getNextID();
        int int94 = userRepository71.getNextID();
        boolean boolean95 = userRepository71.headLabCoordinatorExists();
        java.util.List<com.reservation_system.model.User> userList96 = userRepository71.getAllUsers();
        userRepository1.saveAllUsers(userList96);
        boolean boolean99 = userRepository1.emailExists("");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(userOptional9);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "Password1!" + "'", str20, "Password1!");
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "Password1!" + "'", str41, "Password1!");
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertNotNull(userList45);
        org.junit.Assert.assertEquals("'" + str55 + "' != '" + "Password1!" + "'", str55, "Password1!");
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
        org.junit.Assert.assertNotNull(userList59);
        org.junit.Assert.assertNotNull(userList62);
        org.junit.Assert.assertNotNull(userList66);
        org.junit.Assert.assertNotNull(userList68);
        org.junit.Assert.assertEquals("'" + str79 + "' != '" + "Password1!" + "'", str79, "Password1!");
        org.junit.Assert.assertTrue("'" + boolean81 + "' != '" + false + "'", boolean81 == false);
        org.junit.Assert.assertTrue("'" + boolean90 + "' != '" + true + "'", boolean90 == true);
        org.junit.Assert.assertTrue("'" + boolean92 + "' != '" + true + "'", boolean92 == true);
        org.junit.Assert.assertTrue("'" + int93 + "' != '" + 101 + "'", int93 == 101);
        org.junit.Assert.assertTrue("'" + int94 + "' != '" + 101 + "'", int94 == 101);
        org.junit.Assert.assertTrue("'" + boolean95 + "' != '" + false + "'", boolean95 == false);
        org.junit.Assert.assertNotNull(userList96);
        org.junit.Assert.assertTrue("'" + boolean99 + "' != '" + false + "'", boolean99 == false);
    }

    @Test
    public void test1810() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1810");
        com.reservation_system.model.Student student5 = new com.reservation_system.model.Student((int) (short) 1, "labmanager", "", "", true);
        int int6 = student5.getID();
        java.lang.String str7 = student5.getUserType();
        boolean boolean8 = student5.isApproved();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Student" + "'", str7, "Student");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test1811() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1811");
        com.reservation_system.model.Student student5 = new com.reservation_system.model.Student((int) (short) 1, "labmanager", "", "", true);
        java.lang.String str6 = student5.getUserType();
        java.lang.String str7 = student5.getEmail();
        boolean boolean8 = student5.isApproved();
        java.lang.String str9 = student5.getUserType();
        java.lang.String str10 = student5.getUserType();
        java.lang.String str11 = student5.getEmail();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Student" + "'", str6, "Student");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Student" + "'", str9, "Student");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Student" + "'", str10, "Student");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
    }

    @Test
    public void test1812() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1812");
        // The following exception was thrown during execution in test generation
        try {
            com.reservation_system.model.User user6 = com.reservation_system.patterns.factory.UserFactory.createUser("Andrew", (int) (byte) 1, "researcher", "andrew@example.com", "", true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid user type: Andrew");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1813() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1813");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("demo/data/test-users.csv");
        com.reservation_system.services.RegistrationService registrationService2 = new com.reservation_system.services.RegistrationService(userRepository1);
        com.reservation_system.services.RegistrationService registrationService3 = new com.reservation_system.services.RegistrationService(userRepository1);
        boolean boolean4 = userRepository1.headLabCoordinatorExists();
        com.reservation_system.repository.UserRepository userRepository6 = new com.reservation_system.repository.UserRepository("demo/data/test-users.csv");
        com.reservation_system.services.RegistrationService registrationService7 = new com.reservation_system.services.RegistrationService(userRepository6);
        com.reservation_system.model.Faculty faculty13 = new com.reservation_system.model.Faculty(0, "Password1!", "demo/data/test-users.csv", "researcher", false);
        java.lang.String str14 = faculty13.getName();
        userRepository6.addUser((com.reservation_system.model.User) faculty13);
        boolean boolean16 = userRepository6.headLabCoordinatorExists();
        com.reservation_system.services.RegistrationService registrationService17 = new com.reservation_system.services.RegistrationService(userRepository6);
        com.reservation_system.model.Researcher researcher23 = new com.reservation_system.model.Researcher(0, "labmanager", "", "labmanager", false);
        java.lang.String str24 = researcher23.getEmail();
        userRepository6.addUser((com.reservation_system.model.User) researcher23);
        java.util.List<com.reservation_system.model.User> userList26 = userRepository6.getAllUsers();
        userRepository1.saveAllUsers(userList26);
        boolean boolean29 = userRepository1.emailExists("hi!");
        com.reservation_system.model.HeadLabCoordinator headLabCoordinator35 = new com.reservation_system.model.HeadLabCoordinator((int) '#', "researcher", "Password1!", "faculty", false);
        userRepository1.addUser((com.reservation_system.model.User) headLabCoordinator35);
        boolean boolean38 = userRepository1.emailExists("");
        boolean boolean39 = userRepository1.headLabCoordinatorExists();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Password1!" + "'", str14, "Password1!");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
        org.junit.Assert.assertNotNull(userList26);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + true + "'", boolean38 == true);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
    }

    @Test
    public void test1814() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1814");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("demo/data/test-users.csv");
        java.util.List<com.reservation_system.model.User> userList2 = userRepository1.getAllUsers();
        com.reservation_system.services.RegistrationService registrationService3 = new com.reservation_system.services.RegistrationService(userRepository1);
        java.util.List<com.reservation_system.model.User> userList4 = userRepository1.getAllUsers();
        boolean boolean6 = userRepository1.emailExists("Guest");
        java.util.List<com.reservation_system.model.User> userList7 = userRepository1.getAllUsers();
        java.util.Optional<com.reservation_system.model.User> userOptional9 = userRepository1.findByEmail("Password1!");
        com.reservation_system.repository.UserRepository userRepository11 = new com.reservation_system.repository.UserRepository("demo/data/test-users.csv");
        com.reservation_system.services.RegistrationService registrationService12 = new com.reservation_system.services.RegistrationService(userRepository11);
        com.reservation_system.model.Faculty faculty18 = new com.reservation_system.model.Faculty(0, "Password1!", "demo/data/test-users.csv", "researcher", false);
        java.lang.String str19 = faculty18.getName();
        userRepository11.addUser((com.reservation_system.model.User) faculty18);
        boolean boolean21 = userRepository11.headLabCoordinatorExists();
        int int22 = userRepository11.getNextID();
        com.reservation_system.repository.UserRepository userRepository24 = new com.reservation_system.repository.UserRepository("demo/data/test-users.csv");
        java.util.List<com.reservation_system.model.User> userList25 = userRepository24.getAllUsers();
        com.reservation_system.services.RegistrationService registrationService26 = new com.reservation_system.services.RegistrationService(userRepository24);
        java.util.List<com.reservation_system.model.User> userList27 = userRepository24.getAllUsers();
        userRepository11.saveAllUsers(userList27);
        userRepository1.saveAllUsers(userList27);
        com.reservation_system.model.HeadLabCoordinator headLabCoordinator35 = new com.reservation_system.model.HeadLabCoordinator(10, "faculty", "Faculty", "demo/data/test-users.csv", false);
        int int36 = headLabCoordinator35.getID();
        java.lang.String str37 = headLabCoordinator35.getUserType();
        userRepository1.addUser((com.reservation_system.model.User) headLabCoordinator35);
        com.reservation_system.repository.UserRepository userRepository40 = new com.reservation_system.repository.UserRepository("demo/data/test-users.csv");
        java.util.List<com.reservation_system.model.User> userList41 = userRepository40.getAllUsers();
        com.reservation_system.services.RegistrationService registrationService42 = new com.reservation_system.services.RegistrationService(userRepository40);
        int int43 = userRepository40.getNextID();
        com.reservation_system.model.Researcher researcher49 = new com.reservation_system.model.Researcher(100, "demo/data/test-users.csv", "andrew@example.com", "guest", false);
        java.lang.String str50 = researcher49.getEmail();
        userRepository40.addUser((com.reservation_system.model.User) researcher49);
        userRepository1.addUser((com.reservation_system.model.User) researcher49);
        com.reservation_system.repository.UserRepository userRepository54 = new com.reservation_system.repository.UserRepository("demo/data/test-users.csv");
        com.reservation_system.services.RegistrationService registrationService55 = new com.reservation_system.services.RegistrationService(userRepository54);
        com.reservation_system.model.Faculty faculty61 = new com.reservation_system.model.Faculty(0, "Password1!", "demo/data/test-users.csv", "researcher", false);
        java.lang.String str62 = faculty61.getName();
        userRepository54.addUser((com.reservation_system.model.User) faculty61);
        boolean boolean64 = userRepository54.headLabCoordinatorExists();
        int int65 = userRepository54.getNextID();
        com.reservation_system.repository.UserRepository userRepository67 = new com.reservation_system.repository.UserRepository("demo/data/test-users.csv");
        java.util.List<com.reservation_system.model.User> userList68 = userRepository67.getAllUsers();
        com.reservation_system.services.RegistrationService registrationService69 = new com.reservation_system.services.RegistrationService(userRepository67);
        java.util.List<com.reservation_system.model.User> userList70 = userRepository67.getAllUsers();
        userRepository54.saveAllUsers(userList70);
        userRepository1.saveAllUsers(userList70);
        com.reservation_system.services.RegistrationService registrationService73 = new com.reservation_system.services.RegistrationService(userRepository1);
        // The following exception was thrown during execution in test generation
        try {
            com.reservation_system.model.User user78 = registrationService73.registerUser("Password1!", "faculty", "labmanager", "");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid user type.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(userList2);
        org.junit.Assert.assertNotNull(userList4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(userList7);
        org.junit.Assert.assertNotNull(userOptional9);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "Password1!" + "'", str19, "Password1!");
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 101 + "'", int22 == 101);
        org.junit.Assert.assertNotNull(userList25);
        org.junit.Assert.assertNotNull(userList27);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 10 + "'", int36 == 10);
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "headlabcoordinator" + "'", str37, "headlabcoordinator");
        org.junit.Assert.assertNotNull(userList41);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 101 + "'", int43 == 101);
        org.junit.Assert.assertEquals("'" + str62 + "' != '" + "Password1!" + "'", str62, "Password1!");
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + true + "'", boolean64 == true);
        org.junit.Assert.assertTrue("'" + int65 + "' != '" + 101 + "'", int65 == 101);
        org.junit.Assert.assertNotNull(userList68);
        org.junit.Assert.assertNotNull(userList70);
    }

    @Test
    public void test1815() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1815");
        com.reservation_system.model.User user6 = com.reservation_system.patterns.factory.UserFactory.createUser("headlabcoordinator", 35, "Guest", "guest", "faculty", false);
        java.lang.Class<?> wildcardClass7 = user6.getClass();
        org.junit.Assert.assertNotNull(user6);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test1816() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1816");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("demo/data/test-users.csv");
        com.reservation_system.services.RegistrationService registrationService2 = new com.reservation_system.services.RegistrationService(userRepository1);
        com.reservation_system.model.Faculty faculty8 = new com.reservation_system.model.Faculty(0, "Password1!", "demo/data/test-users.csv", "researcher", false);
        java.lang.String str9 = faculty8.getName();
        userRepository1.addUser((com.reservation_system.model.User) faculty8);
        java.lang.String str11 = faculty8.getUserType();
        java.lang.String str12 = faculty8.getUserType();
        java.lang.String str13 = faculty8.getEmail();
        boolean boolean14 = faculty8.requiresDepartmentApproval();
        java.lang.String str15 = faculty8.getUserType();
        java.lang.String str16 = faculty8.getEmail();
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Password1!" + "'", str9, "Password1!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Faculty" + "'", str11, "Faculty");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Faculty" + "'", str12, "Faculty");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "demo/data/test-users.csv" + "'", str13, "demo/data/test-users.csv");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Faculty" + "'", str15, "Faculty");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "demo/data/test-users.csv" + "'", str16, "demo/data/test-users.csv");
    }

    @Test
    public void test1817() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1817");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("demo/data/test-users.csv");
        com.reservation_system.services.RegistrationService registrationService2 = new com.reservation_system.services.RegistrationService(userRepository1);
        com.reservation_system.model.Faculty faculty8 = new com.reservation_system.model.Faculty(0, "Password1!", "demo/data/test-users.csv", "researcher", false);
        java.lang.String str9 = faculty8.getName();
        userRepository1.addUser((com.reservation_system.model.User) faculty8);
        boolean boolean12 = userRepository1.emailExists("Faculty");
        int int13 = userRepository1.getNextID();
        int int14 = userRepository1.getNextID();
        com.reservation_system.model.Guest guest20 = new com.reservation_system.model.Guest((int) '#', "Guest", "researcher", "headlabcoordinator", true);
        userRepository1.addUser((com.reservation_system.model.User) guest20);
        com.reservation_system.model.Student student27 = new com.reservation_system.model.Student((int) ' ', "", "labmanager", "headlabcoordinator", true);
        student27.setApproved(false);
        student27.setApproved(false);
        userRepository1.addUser((com.reservation_system.model.User) student27);
        boolean boolean33 = userRepository1.headLabCoordinatorExists();
        com.reservation_system.repository.UserRepository userRepository35 = new com.reservation_system.repository.UserRepository("demo/data/test-users.csv");
        com.reservation_system.services.RegistrationService registrationService36 = new com.reservation_system.services.RegistrationService(userRepository35);
        com.reservation_system.model.Faculty faculty42 = new com.reservation_system.model.Faculty(0, "Password1!", "demo/data/test-users.csv", "researcher", false);
        java.lang.String str43 = faculty42.getName();
        userRepository35.addUser((com.reservation_system.model.User) faculty42);
        boolean boolean45 = userRepository35.headLabCoordinatorExists();
        com.reservation_system.model.Guest guest51 = new com.reservation_system.model.Guest((int) (byte) -1, "guest", "Researcher", "Faculty", true);
        userRepository35.addUser((com.reservation_system.model.User) guest51);
        boolean boolean53 = userRepository35.headLabCoordinatorExists();
        com.reservation_system.repository.UserRepository userRepository55 = new com.reservation_system.repository.UserRepository("demo/data/test-users.csv");
        com.reservation_system.services.RegistrationService registrationService56 = new com.reservation_system.services.RegistrationService(userRepository55);
        com.reservation_system.model.Faculty faculty62 = new com.reservation_system.model.Faculty(0, "Password1!", "demo/data/test-users.csv", "researcher", false);
        java.lang.String str63 = faculty62.getName();
        userRepository55.addUser((com.reservation_system.model.User) faculty62);
        boolean boolean65 = userRepository55.headLabCoordinatorExists();
        com.reservation_system.repository.UserRepository userRepository67 = new com.reservation_system.repository.UserRepository("demo/data/test-users.csv");
        com.reservation_system.services.RegistrationService registrationService68 = new com.reservation_system.services.RegistrationService(userRepository67);
        com.reservation_system.model.Faculty faculty74 = new com.reservation_system.model.Faculty(0, "Password1!", "demo/data/test-users.csv", "researcher", false);
        java.lang.String str75 = faculty74.getName();
        userRepository67.addUser((com.reservation_system.model.User) faculty74);
        java.util.List<com.reservation_system.model.User> userList77 = userRepository67.getAllUsers();
        userRepository55.saveAllUsers(userList77);
        userRepository35.saveAllUsers(userList77);
        boolean boolean81 = userRepository35.emailExists("hi!");
        com.reservation_system.repository.UserRepository userRepository83 = new com.reservation_system.repository.UserRepository("demo/data/test-users.csv");
        com.reservation_system.services.RegistrationService registrationService84 = new com.reservation_system.services.RegistrationService(userRepository83);
        com.reservation_system.model.Faculty faculty90 = new com.reservation_system.model.Faculty(0, "Password1!", "demo/data/test-users.csv", "researcher", false);
        java.lang.String str91 = faculty90.getName();
        userRepository83.addUser((com.reservation_system.model.User) faculty90);
        boolean boolean93 = userRepository83.headLabCoordinatorExists();
        com.reservation_system.services.RegistrationService registrationService94 = new com.reservation_system.services.RegistrationService(userRepository83);
        java.util.List<com.reservation_system.model.User> userList95 = userRepository83.getAllUsers();
        userRepository35.saveAllUsers(userList95);
        userRepository1.saveAllUsers(userList95);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Password1!" + "'", str9, "Password1!");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 101 + "'", int13 == 101);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 101 + "'", int14 == 101);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "Password1!" + "'", str43, "Password1!");
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + true + "'", boolean45 == true);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + true + "'", boolean53 == true);
        org.junit.Assert.assertEquals("'" + str63 + "' != '" + "Password1!" + "'", str63, "Password1!");
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + true + "'", boolean65 == true);
        org.junit.Assert.assertEquals("'" + str75 + "' != '" + "Password1!" + "'", str75, "Password1!");
        org.junit.Assert.assertNotNull(userList77);
        org.junit.Assert.assertTrue("'" + boolean81 + "' != '" + true + "'", boolean81 == true);
        org.junit.Assert.assertEquals("'" + str91 + "' != '" + "Password1!" + "'", str91, "Password1!");
        org.junit.Assert.assertTrue("'" + boolean93 + "' != '" + true + "'", boolean93 == true);
        org.junit.Assert.assertNotNull(userList95);
    }

    @Test
    public void test1818() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1818");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("demo/data/test-users.csv");
        int int2 = userRepository1.getNextID();
        int int3 = userRepository1.getNextID();
        boolean boolean5 = userRepository1.emailExists("faculty");
        java.util.Optional<com.reservation_system.model.User> userOptional7 = userRepository1.findByEmail("");
        com.reservation_system.repository.UserRepository userRepository9 = new com.reservation_system.repository.UserRepository("demo/data/test-users.csv");
        java.util.List<com.reservation_system.model.User> userList10 = userRepository9.getAllUsers();
        java.util.List<com.reservation_system.model.User> userList11 = userRepository9.getAllUsers();
        userRepository1.saveAllUsers(userList11);
        com.reservation_system.model.User user19 = com.reservation_system.patterns.factory.UserFactory.createUser("guest", 97, "Guest", "Researcher", "hi!", true);
        userRepository1.addUser(user19);
        com.reservation_system.model.Faculty faculty26 = new com.reservation_system.model.Faculty(10, "researcher", "faculty", "", false);
        java.lang.String str27 = faculty26.getEmail();
        java.lang.String str28 = faculty26.getUserType();
        faculty26.setApproved(false);
        java.lang.String str31 = faculty26.getUserType();
        userRepository1.addUser((com.reservation_system.model.User) faculty26);
        faculty26.setApproved(false);
        int int35 = faculty26.getID();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 101 + "'", int2 == 101);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 101 + "'", int3 == 101);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(userOptional7);
        org.junit.Assert.assertNotNull(userList10);
        org.junit.Assert.assertNotNull(userList11);
        org.junit.Assert.assertNotNull(user19);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "faculty" + "'", str27, "faculty");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "Faculty" + "'", str28, "Faculty");
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "Faculty" + "'", str31, "Faculty");
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 10 + "'", int35 == 10);
    }

    @Test
    public void test1819() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1819");
        com.reservation_system.model.Guest guest5 = new com.reservation_system.model.Guest((int) (byte) 10, "faculty", "andrew@example.com", "", true);
        boolean boolean6 = guest5.requiresDepartmentApproval();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test1820() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1820");
        com.reservation_system.model.User user6 = com.reservation_system.patterns.factory.UserFactory.createUser("labmanager", 36, "Researcher", "Researcher", "guest", false);
        org.junit.Assert.assertNotNull(user6);
    }

    @Test
    public void test1821() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1821");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("demo/data/test-users.csv");
        boolean boolean2 = userRepository1.headLabCoordinatorExists();
        com.reservation_system.repository.UserRepository userRepository4 = new com.reservation_system.repository.UserRepository("demo/data/test-users.csv");
        com.reservation_system.services.RegistrationService registrationService5 = new com.reservation_system.services.RegistrationService(userRepository4);
        com.reservation_system.model.Faculty faculty11 = new com.reservation_system.model.Faculty(0, "Password1!", "demo/data/test-users.csv", "researcher", false);
        java.lang.String str12 = faculty11.getName();
        userRepository4.addUser((com.reservation_system.model.User) faculty11);
        java.util.List<com.reservation_system.model.User> userList14 = userRepository4.getAllUsers();
        userRepository1.saveAllUsers(userList14);
        com.reservation_system.services.RegistrationService registrationService16 = new com.reservation_system.services.RegistrationService(userRepository1);
        // The following exception was thrown during execution in test generation
        try {
            com.reservation_system.model.User user21 = registrationService16.registerUser("headlabcoordinator", "faculty", "Student", "labmanager");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: A head lab coordinator account already exists.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Password1!" + "'", str12, "Password1!");
        org.junit.Assert.assertNotNull(userList14);
    }

    @Test
    public void test1822() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1822");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("demo/data/test-users.csv");
        java.util.List<com.reservation_system.model.User> userList2 = userRepository1.getAllUsers();
        com.reservation_system.services.RegistrationService registrationService3 = new com.reservation_system.services.RegistrationService(userRepository1);
        java.util.List<com.reservation_system.model.User> userList4 = userRepository1.getAllUsers();
        boolean boolean6 = userRepository1.emailExists("Guest");
        com.reservation_system.repository.UserRepository userRepository8 = new com.reservation_system.repository.UserRepository("demo/data/test-users.csv");
        boolean boolean9 = userRepository8.headLabCoordinatorExists();
        com.reservation_system.services.RegistrationService registrationService10 = new com.reservation_system.services.RegistrationService(userRepository8);
        boolean boolean11 = userRepository8.headLabCoordinatorExists();
        boolean boolean13 = userRepository8.emailExists("Andrew");
        com.reservation_system.services.RegistrationService registrationService14 = new com.reservation_system.services.RegistrationService(userRepository8);
        java.util.Optional<com.reservation_system.model.User> userOptional16 = userRepository8.findByEmail("faculty");
        com.reservation_system.services.RegistrationService registrationService17 = new com.reservation_system.services.RegistrationService(userRepository8);
        com.reservation_system.repository.UserRepository userRepository19 = new com.reservation_system.repository.UserRepository("demo/data/test-users.csv");
        com.reservation_system.services.RegistrationService registrationService20 = new com.reservation_system.services.RegistrationService(userRepository19);
        com.reservation_system.model.Faculty faculty26 = new com.reservation_system.model.Faculty(0, "Password1!", "demo/data/test-users.csv", "researcher", false);
        java.lang.String str27 = faculty26.getName();
        userRepository19.addUser((com.reservation_system.model.User) faculty26);
        boolean boolean29 = userRepository19.headLabCoordinatorExists();
        com.reservation_system.model.Guest guest35 = new com.reservation_system.model.Guest((int) (byte) -1, "guest", "Researcher", "Faculty", true);
        userRepository19.addUser((com.reservation_system.model.User) guest35);
        boolean boolean38 = userRepository19.emailExists("Password1!");
        com.reservation_system.repository.UserRepository userRepository40 = new com.reservation_system.repository.UserRepository("demo/data/test-users.csv");
        com.reservation_system.services.RegistrationService registrationService41 = new com.reservation_system.services.RegistrationService(userRepository40);
        com.reservation_system.model.Faculty faculty47 = new com.reservation_system.model.Faculty(0, "Password1!", "demo/data/test-users.csv", "researcher", false);
        java.lang.String str48 = faculty47.getName();
        userRepository40.addUser((com.reservation_system.model.User) faculty47);
        boolean boolean50 = userRepository40.headLabCoordinatorExists();
        com.reservation_system.services.RegistrationService registrationService51 = new com.reservation_system.services.RegistrationService(userRepository40);
        java.util.List<com.reservation_system.model.User> userList52 = userRepository40.getAllUsers();
        com.reservation_system.repository.UserRepository userRepository54 = new com.reservation_system.repository.UserRepository("demo/data/test-users.csv");
        com.reservation_system.services.RegistrationService registrationService55 = new com.reservation_system.services.RegistrationService(userRepository54);
        com.reservation_system.model.Faculty faculty61 = new com.reservation_system.model.Faculty(0, "Password1!", "demo/data/test-users.csv", "researcher", false);
        java.lang.String str62 = faculty61.getName();
        userRepository54.addUser((com.reservation_system.model.User) faculty61);
        boolean boolean64 = userRepository54.headLabCoordinatorExists();
        com.reservation_system.services.RegistrationService registrationService65 = new com.reservation_system.services.RegistrationService(userRepository54);
        java.util.List<com.reservation_system.model.User> userList66 = userRepository54.getAllUsers();
        userRepository40.saveAllUsers(userList66);
        userRepository19.saveAllUsers(userList66);
        java.util.List<com.reservation_system.model.User> userList69 = userRepository19.getAllUsers();
        userRepository8.saveAllUsers(userList69);
        com.reservation_system.model.LabManager labManager76 = new com.reservation_system.model.LabManager((int) 'a', "headlabcoordinator", "Researcher", "Andrew", false);
        java.lang.String str77 = labManager76.getEmail();
        labManager76.setApproved(false);
        userRepository8.addUser((com.reservation_system.model.User) labManager76);
        com.reservation_system.model.Faculty faculty86 = new com.reservation_system.model.Faculty((int) (short) -1, "student", "Faculty", "faculty", true);
        userRepository8.addUser((com.reservation_system.model.User) faculty86);
        userRepository1.addUser((com.reservation_system.model.User) faculty86);
        org.junit.Assert.assertNotNull(userList2);
        org.junit.Assert.assertNotNull(userList4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(userOptional16);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "Password1!" + "'", str27, "Password1!");
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + true + "'", boolean38 == true);
        org.junit.Assert.assertEquals("'" + str48 + "' != '" + "Password1!" + "'", str48, "Password1!");
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + true + "'", boolean50 == true);
        org.junit.Assert.assertNotNull(userList52);
        org.junit.Assert.assertEquals("'" + str62 + "' != '" + "Password1!" + "'", str62, "Password1!");
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + true + "'", boolean64 == true);
        org.junit.Assert.assertNotNull(userList66);
        org.junit.Assert.assertNotNull(userList69);
        org.junit.Assert.assertEquals("'" + str77 + "' != '" + "Researcher" + "'", str77, "Researcher");
    }

    @Test
    public void test1823() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1823");
        com.reservation_system.model.Student student5 = new com.reservation_system.model.Student((int) (short) -1, "Andrew", "Guest", "Faculty", true);
        java.lang.String str6 = student5.getUserType();
        boolean boolean7 = student5.requiresDepartmentApproval();
        boolean boolean8 = student5.requiresDepartmentApproval();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Student" + "'", str6, "Student");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test1824() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1824");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("demo/data/test-users.csv");
        int int2 = userRepository1.getNextID();
        com.reservation_system.repository.UserRepository userRepository4 = new com.reservation_system.repository.UserRepository("demo/data/test-users.csv");
        boolean boolean5 = userRepository4.headLabCoordinatorExists();
        com.reservation_system.repository.UserRepository userRepository7 = new com.reservation_system.repository.UserRepository("demo/data/test-users.csv");
        com.reservation_system.services.RegistrationService registrationService8 = new com.reservation_system.services.RegistrationService(userRepository7);
        com.reservation_system.model.Faculty faculty14 = new com.reservation_system.model.Faculty(0, "Password1!", "demo/data/test-users.csv", "researcher", false);
        java.lang.String str15 = faculty14.getName();
        userRepository7.addUser((com.reservation_system.model.User) faculty14);
        java.util.List<com.reservation_system.model.User> userList17 = userRepository7.getAllUsers();
        userRepository4.saveAllUsers(userList17);
        com.reservation_system.services.RegistrationService registrationService19 = new com.reservation_system.services.RegistrationService(userRepository4);
        java.util.List<com.reservation_system.model.User> userList20 = userRepository4.getAllUsers();
        java.util.List<com.reservation_system.model.User> userList21 = userRepository4.getAllUsers();
        userRepository1.saveAllUsers(userList21);
        com.reservation_system.repository.UserRepository userRepository24 = new com.reservation_system.repository.UserRepository("demo/data/test-users.csv");
        com.reservation_system.services.RegistrationService registrationService25 = new com.reservation_system.services.RegistrationService(userRepository24);
        com.reservation_system.model.Faculty faculty31 = new com.reservation_system.model.Faculty(0, "Password1!", "demo/data/test-users.csv", "researcher", false);
        java.lang.String str32 = faculty31.getName();
        userRepository24.addUser((com.reservation_system.model.User) faculty31);
        boolean boolean34 = userRepository24.headLabCoordinatorExists();
        int int35 = userRepository24.getNextID();
        com.reservation_system.repository.UserRepository userRepository37 = new com.reservation_system.repository.UserRepository("demo/data/test-users.csv");
        com.reservation_system.services.RegistrationService registrationService38 = new com.reservation_system.services.RegistrationService(userRepository37);
        int int39 = userRepository37.getNextID();
        boolean boolean41 = userRepository37.emailExists("labmanager");
        java.util.List<com.reservation_system.model.User> userList42 = userRepository37.getAllUsers();
        userRepository24.saveAllUsers(userList42);
        userRepository1.saveAllUsers(userList42);
        com.reservation_system.services.RegistrationService registrationService45 = new com.reservation_system.services.RegistrationService(userRepository1);
        boolean boolean47 = userRepository1.emailExists("");
        java.util.Optional<com.reservation_system.model.User> userOptional49 = userRepository1.findByEmail("Student");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 101 + "'", int2 == 101);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Password1!" + "'", str15, "Password1!");
        org.junit.Assert.assertNotNull(userList17);
        org.junit.Assert.assertNotNull(userList20);
        org.junit.Assert.assertNotNull(userList21);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "Password1!" + "'", str32, "Password1!");
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 101 + "'", int35 == 101);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 101 + "'", int39 == 101);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + true + "'", boolean41 == true);
        org.junit.Assert.assertNotNull(userList42);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + true + "'", boolean47 == true);
        org.junit.Assert.assertNotNull(userOptional49);
    }

    @Test
    public void test1825() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1825");
        com.reservation_system.model.Faculty faculty5 = new com.reservation_system.model.Faculty((int) ' ', "", "guest", "Andrew", false);
        faculty5.setApproved(false);
    }

    @Test
    public void test1826() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1826");
        com.reservation_system.model.LabManager labManager5 = new com.reservation_system.model.LabManager(1, "student", "", "Researcher", false);
        java.lang.String str6 = labManager5.getName();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "student" + "'", str6, "student");
    }

    @Test
    public void test1827() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1827");
        com.reservation_system.model.LabManager labManager5 = new com.reservation_system.model.LabManager((int) (short) 10, "Andrew", "Researcher", "Researcher", false);
        java.lang.String str6 = labManager5.getPassword();
        java.lang.String str7 = labManager5.getUserType();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Researcher" + "'", str6, "Researcher");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "labmanager" + "'", str7, "labmanager");
    }

    @Test
    public void test1828() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1828");
        com.reservation_system.model.Researcher researcher5 = new com.reservation_system.model.Researcher((int) (byte) 100, "demo/data/test-users.csv", "Faculty", "Student", false);
        java.lang.String str6 = researcher5.getPassword();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Student" + "'", str6, "Student");
    }

    @Test
    public void test1829() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1829");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("demo/data/test-users.csv");
        boolean boolean2 = userRepository1.headLabCoordinatorExists();
        com.reservation_system.services.RegistrationService registrationService3 = new com.reservation_system.services.RegistrationService(userRepository1);
        boolean boolean5 = userRepository1.emailExists("");
        boolean boolean6 = userRepository1.headLabCoordinatorExists();
        java.util.List<com.reservation_system.model.User> userList7 = userRepository1.getAllUsers();
        com.reservation_system.model.Faculty faculty13 = new com.reservation_system.model.Faculty((int) '4', "Andrew", "", "faculty", false);
        userRepository1.addUser((com.reservation_system.model.User) faculty13);
        java.util.List<com.reservation_system.model.User> userList15 = userRepository1.getAllUsers();
        com.reservation_system.repository.UserRepository userRepository17 = new com.reservation_system.repository.UserRepository("demo/data/test-users.csv");
        com.reservation_system.services.RegistrationService registrationService18 = new com.reservation_system.services.RegistrationService(userRepository17);
        com.reservation_system.model.Researcher researcher24 = new com.reservation_system.model.Researcher((int) (short) 1, "Password1!", "headlabcoordinator", "", false);
        userRepository17.addUser((com.reservation_system.model.User) researcher24);
        com.reservation_system.services.RegistrationService registrationService26 = new com.reservation_system.services.RegistrationService(userRepository17);
        com.reservation_system.repository.UserRepository userRepository28 = new com.reservation_system.repository.UserRepository("demo/data/test-users.csv");
        com.reservation_system.services.RegistrationService registrationService29 = new com.reservation_system.services.RegistrationService(userRepository28);
        com.reservation_system.model.Faculty faculty35 = new com.reservation_system.model.Faculty(0, "Password1!", "demo/data/test-users.csv", "researcher", false);
        java.lang.String str36 = faculty35.getName();
        userRepository28.addUser((com.reservation_system.model.User) faculty35);
        boolean boolean38 = userRepository28.headLabCoordinatorExists();
        com.reservation_system.model.Guest guest44 = new com.reservation_system.model.Guest((int) (byte) -1, "guest", "Researcher", "Faculty", true);
        userRepository28.addUser((com.reservation_system.model.User) guest44);
        com.reservation_system.repository.UserRepository userRepository47 = new com.reservation_system.repository.UserRepository("demo/data/test-users.csv");
        java.util.List<com.reservation_system.model.User> userList48 = userRepository47.getAllUsers();
        com.reservation_system.services.RegistrationService registrationService49 = new com.reservation_system.services.RegistrationService(userRepository47);
        java.util.List<com.reservation_system.model.User> userList50 = userRepository47.getAllUsers();
        userRepository28.saveAllUsers(userList50);
        userRepository17.saveAllUsers(userList50);
        userRepository1.saveAllUsers(userList50);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(userList7);
        org.junit.Assert.assertNotNull(userList15);
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "Password1!" + "'", str36, "Password1!");
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + true + "'", boolean38 == true);
        org.junit.Assert.assertNotNull(userList48);
        org.junit.Assert.assertNotNull(userList50);
    }

    @Test
    public void test1830() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1830");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("demo/data/test-users.csv");
        com.reservation_system.services.RegistrationService registrationService2 = new com.reservation_system.services.RegistrationService(userRepository1);
        com.reservation_system.model.Faculty faculty8 = new com.reservation_system.model.Faculty(0, "Password1!", "demo/data/test-users.csv", "researcher", false);
        java.lang.String str9 = faculty8.getName();
        userRepository1.addUser((com.reservation_system.model.User) faculty8);
        boolean boolean11 = userRepository1.headLabCoordinatorExists();
        com.reservation_system.model.Guest guest17 = new com.reservation_system.model.Guest((int) (byte) -1, "guest", "Researcher", "Faculty", true);
        userRepository1.addUser((com.reservation_system.model.User) guest17);
        java.util.List<com.reservation_system.model.User> userList19 = userRepository1.getAllUsers();
        boolean boolean21 = userRepository1.emailExists("Password1!");
        boolean boolean22 = userRepository1.headLabCoordinatorExists();
        boolean boolean23 = userRepository1.headLabCoordinatorExists();
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Password1!" + "'", str9, "Password1!");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(userList19);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
    }

    @Test
    public void test1831() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1831");
        com.reservation_system.model.Faculty faculty5 = new com.reservation_system.model.Faculty((int) (byte) 1, "guest", "", "headlabcoordinator", false);
        java.lang.String str6 = faculty5.getUserType();
        faculty5.setApproved(true);
        java.lang.String str9 = faculty5.getEmail();
        java.lang.String str10 = faculty5.getUserType();
        boolean boolean11 = faculty5.requiresDepartmentApproval();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Faculty" + "'", str6, "Faculty");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Faculty" + "'", str10, "Faculty");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test1832() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1832");
        com.reservation_system.model.Researcher researcher5 = new com.reservation_system.model.Researcher(2, "andrew@example.com", "headlabcoordinator", "demo/data/test-users.csv", true);
    }

    @Test
    public void test1833() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1833");
        com.reservation_system.model.Researcher researcher5 = new com.reservation_system.model.Researcher((int) (short) -1, "andrew@example.com", "guest", "labmanager", false);
        java.lang.String str6 = researcher5.getEmail();
        researcher5.setApproved(true);
        java.lang.String str9 = researcher5.getUserType();
        java.lang.String str10 = researcher5.getUserType();
        java.lang.String str11 = researcher5.getUserType();
        int int12 = researcher5.getID();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "guest" + "'", str6, "guest");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Researcher" + "'", str9, "Researcher");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Researcher" + "'", str10, "Researcher");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Researcher" + "'", str11, "Researcher");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
    }

    @Test
    public void test1834() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1834");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("demo/data/test-users.csv");
        com.reservation_system.services.RegistrationService registrationService2 = new com.reservation_system.services.RegistrationService(userRepository1);
        com.reservation_system.model.Researcher researcher8 = new com.reservation_system.model.Researcher((int) (short) 1, "Password1!", "headlabcoordinator", "", false);
        userRepository1.addUser((com.reservation_system.model.User) researcher8);
        java.util.Optional<com.reservation_system.model.User> userOptional11 = userRepository1.findByEmail("researcher");
        int int12 = userRepository1.getNextID();
        org.junit.Assert.assertNotNull(userOptional11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 101 + "'", int12 == 101);
    }

    @Test
    public void test1835() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1835");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("demo/data/test-users.csv");
        java.util.Optional<com.reservation_system.model.User> userOptional3 = userRepository1.findByEmail("hi!");
        int int4 = userRepository1.getNextID();
        com.reservation_system.model.Researcher researcher10 = new com.reservation_system.model.Researcher((int) (byte) 10, "", "Guest", "headlabcoordinator", true);
        userRepository1.addUser((com.reservation_system.model.User) researcher10);
        java.util.List<com.reservation_system.model.User> userList12 = userRepository1.getAllUsers();
        java.util.Optional<com.reservation_system.model.User> userOptional14 = userRepository1.findByEmail("andrew@example.com");
        com.reservation_system.services.RegistrationService registrationService15 = new com.reservation_system.services.RegistrationService(userRepository1);
        boolean boolean17 = userRepository1.emailExists("Faculty");
        java.util.List<com.reservation_system.model.User> userList18 = userRepository1.getAllUsers();
        org.junit.Assert.assertNotNull(userOptional3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 101 + "'", int4 == 101);
        org.junit.Assert.assertNotNull(userList12);
        org.junit.Assert.assertNotNull(userOptional14);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNotNull(userList18);
    }

    @Test
    public void test1836() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1836");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("demo/data/test-users.csv");
        com.reservation_system.services.RegistrationService registrationService2 = new com.reservation_system.services.RegistrationService(userRepository1);
        com.reservation_system.model.Faculty faculty8 = new com.reservation_system.model.Faculty(0, "Password1!", "demo/data/test-users.csv", "researcher", false);
        java.lang.String str9 = faculty8.getName();
        userRepository1.addUser((com.reservation_system.model.User) faculty8);
        boolean boolean11 = userRepository1.headLabCoordinatorExists();
        com.reservation_system.model.Guest guest17 = new com.reservation_system.model.Guest((int) (byte) -1, "guest", "Researcher", "Faculty", true);
        userRepository1.addUser((com.reservation_system.model.User) guest17);
        boolean boolean20 = userRepository1.emailExists("Password1!");
        boolean boolean22 = userRepository1.emailExists("hi!");
        int int23 = userRepository1.getNextID();
        int int24 = userRepository1.getNextID();
        java.util.List<com.reservation_system.model.User> userList25 = userRepository1.getAllUsers();
        boolean boolean27 = userRepository1.emailExists("labmanager");
        java.util.Optional<com.reservation_system.model.User> userOptional29 = userRepository1.findByEmail("Andrew");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Password1!" + "'", str9, "Password1!");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 101 + "'", int23 == 101);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 101 + "'", int24 == 101);
        org.junit.Assert.assertNotNull(userList25);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertNotNull(userOptional29);
    }

    @Test
    public void test1837() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1837");
        com.reservation_system.model.Guest guest5 = new com.reservation_system.model.Guest((int) '#', "", "headlabcoordinator", "andrew@example.com", false);
        java.lang.String str6 = guest5.getUserType();
        java.lang.String str7 = guest5.getName();
        java.lang.String str8 = guest5.getUserType();
        java.lang.String str9 = guest5.getUserType();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Guest" + "'", str6, "Guest");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Guest" + "'", str8, "Guest");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Guest" + "'", str9, "Guest");
    }

    @Test
    public void test1838() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1838");
        com.reservation_system.model.LabManager labManager5 = new com.reservation_system.model.LabManager((int) (short) 100, "guest", "", "faculty", false);
    }

    @Test
    public void test1839() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1839");
        com.reservation_system.model.Student student5 = new com.reservation_system.model.Student((int) (byte) -1, "Student", "", "Student", true);
        java.lang.String str6 = student5.getUserType();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Student" + "'", str6, "Student");
    }

    @Test
    public void test1840() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1840");
        com.reservation_system.model.HeadLabCoordinator headLabCoordinator5 = new com.reservation_system.model.HeadLabCoordinator((int) (byte) 0, "", "hi!", "headlabcoordinator", false);
    }

    @Test
    public void test1841() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1841");
        com.reservation_system.model.Guest guest5 = new com.reservation_system.model.Guest((int) ' ', "Andrew", "guest", "demo/data/test-users.csv", false);
        java.lang.String str6 = guest5.getUserType();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Guest" + "'", str6, "Guest");
    }

    @Test
    public void test1842() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1842");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("demo/data/test-users.csv");
        int int2 = userRepository1.getNextID();
        int int3 = userRepository1.getNextID();
        boolean boolean5 = userRepository1.emailExists("faculty");
        java.util.Optional<com.reservation_system.model.User> userOptional7 = userRepository1.findByEmail("");
        com.reservation_system.repository.UserRepository userRepository9 = new com.reservation_system.repository.UserRepository("demo/data/test-users.csv");
        java.util.List<com.reservation_system.model.User> userList10 = userRepository9.getAllUsers();
        java.util.List<com.reservation_system.model.User> userList11 = userRepository9.getAllUsers();
        userRepository1.saveAllUsers(userList11);
        java.util.Optional<com.reservation_system.model.User> userOptional14 = userRepository1.findByEmail("");
        com.reservation_system.repository.UserRepository userRepository16 = new com.reservation_system.repository.UserRepository("demo/data/test-users.csv");
        int int17 = userRepository16.getNextID();
        int int18 = userRepository16.getNextID();
        boolean boolean20 = userRepository16.emailExists("faculty");
        com.reservation_system.model.LabManager labManager26 = new com.reservation_system.model.LabManager((int) (short) 0, "", "labmanager", "Password1!", true);
        userRepository16.addUser((com.reservation_system.model.User) labManager26);
        java.util.Optional<com.reservation_system.model.User> userOptional29 = userRepository16.findByEmail("");
        com.reservation_system.model.Researcher researcher35 = new com.reservation_system.model.Researcher((int) (byte) 100, "Password1!", "Password1!", "headlabcoordinator", true);
        userRepository16.addUser((com.reservation_system.model.User) researcher35);
        java.util.List<com.reservation_system.model.User> userList37 = userRepository16.getAllUsers();
        userRepository1.saveAllUsers(userList37);
        java.lang.Class<?> wildcardClass39 = userRepository1.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 101 + "'", int2 == 101);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 101 + "'", int3 == 101);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(userOptional7);
        org.junit.Assert.assertNotNull(userList10);
        org.junit.Assert.assertNotNull(userList11);
        org.junit.Assert.assertNotNull(userOptional14);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 101 + "'", int17 == 101);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 101 + "'", int18 == 101);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertNotNull(userOptional29);
        org.junit.Assert.assertNotNull(userList37);
        org.junit.Assert.assertNotNull(wildcardClass39);
    }

    @Test
    public void test1843() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1843");
        com.reservation_system.model.LabManager labManager5 = new com.reservation_system.model.LabManager((int) (byte) 100, "hi!", "Student", "Faculty", false);
        java.lang.String str6 = labManager5.getUserType();
        boolean boolean7 = labManager5.isApproved();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "labmanager" + "'", str6, "labmanager");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test1844() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1844");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("demo/data/test-users.csv");
        boolean boolean2 = userRepository1.headLabCoordinatorExists();
        com.reservation_system.services.RegistrationService registrationService3 = new com.reservation_system.services.RegistrationService(userRepository1);
        boolean boolean5 = userRepository1.emailExists("");
        boolean boolean6 = userRepository1.headLabCoordinatorExists();
        java.util.List<com.reservation_system.model.User> userList7 = userRepository1.getAllUsers();
        boolean boolean9 = userRepository1.emailExists("faculty");
        java.util.List<com.reservation_system.model.User> userList10 = userRepository1.getAllUsers();
        boolean boolean11 = userRepository1.headLabCoordinatorExists();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(userList7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(userList10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test1845() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1845");
        com.reservation_system.model.Guest guest5 = new com.reservation_system.model.Guest(101, "", "headlabcoordinator", "Andrew", false);
    }

    @Test
    public void test1846() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1846");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("demo/data/test-users.csv");
        boolean boolean2 = userRepository1.headLabCoordinatorExists();
        com.reservation_system.services.RegistrationService registrationService3 = new com.reservation_system.services.RegistrationService(userRepository1);
        boolean boolean4 = userRepository1.headLabCoordinatorExists();
        boolean boolean6 = userRepository1.emailExists("Andrew");
        com.reservation_system.services.RegistrationService registrationService7 = new com.reservation_system.services.RegistrationService(userRepository1);
        java.util.Optional<com.reservation_system.model.User> userOptional9 = userRepository1.findByEmail("faculty");
        com.reservation_system.services.RegistrationService registrationService10 = new com.reservation_system.services.RegistrationService(userRepository1);
        com.reservation_system.repository.UserRepository userRepository12 = new com.reservation_system.repository.UserRepository("demo/data/test-users.csv");
        com.reservation_system.services.RegistrationService registrationService13 = new com.reservation_system.services.RegistrationService(userRepository12);
        com.reservation_system.model.Faculty faculty19 = new com.reservation_system.model.Faculty(0, "Password1!", "demo/data/test-users.csv", "researcher", false);
        java.lang.String str20 = faculty19.getName();
        userRepository12.addUser((com.reservation_system.model.User) faculty19);
        boolean boolean22 = userRepository12.headLabCoordinatorExists();
        com.reservation_system.model.Guest guest28 = new com.reservation_system.model.Guest((int) (byte) -1, "guest", "Researcher", "Faculty", true);
        userRepository12.addUser((com.reservation_system.model.User) guest28);
        boolean boolean31 = userRepository12.emailExists("Password1!");
        com.reservation_system.repository.UserRepository userRepository33 = new com.reservation_system.repository.UserRepository("demo/data/test-users.csv");
        com.reservation_system.services.RegistrationService registrationService34 = new com.reservation_system.services.RegistrationService(userRepository33);
        com.reservation_system.model.Faculty faculty40 = new com.reservation_system.model.Faculty(0, "Password1!", "demo/data/test-users.csv", "researcher", false);
        java.lang.String str41 = faculty40.getName();
        userRepository33.addUser((com.reservation_system.model.User) faculty40);
        boolean boolean43 = userRepository33.headLabCoordinatorExists();
        com.reservation_system.services.RegistrationService registrationService44 = new com.reservation_system.services.RegistrationService(userRepository33);
        java.util.List<com.reservation_system.model.User> userList45 = userRepository33.getAllUsers();
        com.reservation_system.repository.UserRepository userRepository47 = new com.reservation_system.repository.UserRepository("demo/data/test-users.csv");
        com.reservation_system.services.RegistrationService registrationService48 = new com.reservation_system.services.RegistrationService(userRepository47);
        com.reservation_system.model.Faculty faculty54 = new com.reservation_system.model.Faculty(0, "Password1!", "demo/data/test-users.csv", "researcher", false);
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
        boolean boolean74 = userRepository1.emailExists("labmanager");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
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
        org.junit.Assert.assertTrue("'" + boolean74 + "' != '" + true + "'", boolean74 == true);
    }

    @Test
    public void test1847() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1847");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("demo/data/test-users.csv");
        com.reservation_system.services.RegistrationService registrationService2 = new com.reservation_system.services.RegistrationService(userRepository1);
        com.reservation_system.model.Faculty faculty8 = new com.reservation_system.model.Faculty(0, "Password1!", "demo/data/test-users.csv", "researcher", false);
        java.lang.String str9 = faculty8.getName();
        userRepository1.addUser((com.reservation_system.model.User) faculty8);
        boolean boolean11 = userRepository1.headLabCoordinatorExists();
        com.reservation_system.model.Guest guest17 = new com.reservation_system.model.Guest((int) (byte) -1, "guest", "Researcher", "Faculty", true);
        userRepository1.addUser((com.reservation_system.model.User) guest17);
        boolean boolean20 = userRepository1.emailExists("Password1!");
        boolean boolean22 = userRepository1.emailExists("hi!");
        int int23 = userRepository1.getNextID();
        int int24 = userRepository1.getNextID();
        boolean boolean26 = userRepository1.emailExists("Researcher");
        boolean boolean28 = userRepository1.emailExists("Researcher");
        com.reservation_system.repository.UserRepository userRepository30 = new com.reservation_system.repository.UserRepository("demo/data/test-users.csv");
        com.reservation_system.services.RegistrationService registrationService31 = new com.reservation_system.services.RegistrationService(userRepository30);
        com.reservation_system.services.RegistrationService registrationService32 = new com.reservation_system.services.RegistrationService(userRepository30);
        com.reservation_system.services.RegistrationService registrationService33 = new com.reservation_system.services.RegistrationService(userRepository30);
        com.reservation_system.repository.UserRepository userRepository35 = new com.reservation_system.repository.UserRepository("demo/data/test-users.csv");
        com.reservation_system.services.RegistrationService registrationService36 = new com.reservation_system.services.RegistrationService(userRepository35);
        com.reservation_system.model.Faculty faculty42 = new com.reservation_system.model.Faculty(0, "Password1!", "demo/data/test-users.csv", "researcher", false);
        java.lang.String str43 = faculty42.getName();
        userRepository35.addUser((com.reservation_system.model.User) faculty42);
        boolean boolean45 = userRepository35.headLabCoordinatorExists();
        com.reservation_system.model.Guest guest51 = new com.reservation_system.model.Guest((int) (byte) -1, "guest", "Researcher", "Faculty", true);
        userRepository35.addUser((com.reservation_system.model.User) guest51);
        java.util.List<com.reservation_system.model.User> userList53 = userRepository35.getAllUsers();
        userRepository30.saveAllUsers(userList53);
        com.reservation_system.repository.UserRepository userRepository56 = new com.reservation_system.repository.UserRepository("demo/data/test-users.csv");
        boolean boolean57 = userRepository56.headLabCoordinatorExists();
        com.reservation_system.repository.UserRepository userRepository59 = new com.reservation_system.repository.UserRepository("demo/data/test-users.csv");
        com.reservation_system.services.RegistrationService registrationService60 = new com.reservation_system.services.RegistrationService(userRepository59);
        com.reservation_system.model.Faculty faculty66 = new com.reservation_system.model.Faculty(0, "Password1!", "demo/data/test-users.csv", "researcher", false);
        java.lang.String str67 = faculty66.getName();
        userRepository59.addUser((com.reservation_system.model.User) faculty66);
        java.util.List<com.reservation_system.model.User> userList69 = userRepository59.getAllUsers();
        userRepository56.saveAllUsers(userList69);
        userRepository30.saveAllUsers(userList69);
        userRepository1.saveAllUsers(userList69);
        boolean boolean74 = userRepository1.emailExists("student");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Password1!" + "'", str9, "Password1!");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 101 + "'", int23 == 101);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 101 + "'", int24 == 101);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "Password1!" + "'", str43, "Password1!");
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + true + "'", boolean45 == true);
        org.junit.Assert.assertNotNull(userList53);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + true + "'", boolean57 == true);
        org.junit.Assert.assertEquals("'" + str67 + "' != '" + "Password1!" + "'", str67, "Password1!");
        org.junit.Assert.assertNotNull(userList69);
        org.junit.Assert.assertTrue("'" + boolean74 + "' != '" + true + "'", boolean74 == true);
    }

    @Test
    public void test1848() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1848");
        com.reservation_system.model.Faculty faculty5 = new com.reservation_system.model.Faculty(100, "student", "Andrew", "researcher", true);
        java.lang.String str6 = faculty5.getPassword();
        java.lang.String str7 = faculty5.getUserType();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "researcher" + "'", str6, "researcher");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Faculty" + "'", str7, "Faculty");
    }

    @Test
    public void test1849() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1849");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("demo/data/test-users.csv");
        java.util.List<com.reservation_system.model.User> userList2 = userRepository1.getAllUsers();
        com.reservation_system.services.RegistrationService registrationService3 = new com.reservation_system.services.RegistrationService(userRepository1);
        java.util.List<com.reservation_system.model.User> userList4 = userRepository1.getAllUsers();
        boolean boolean6 = userRepository1.emailExists("Guest");
        java.util.List<com.reservation_system.model.User> userList7 = userRepository1.getAllUsers();
        java.util.Optional<com.reservation_system.model.User> userOptional9 = userRepository1.findByEmail("Password1!");
        boolean boolean11 = userRepository1.emailExists("demo/data/test-users.csv");
        com.reservation_system.model.Faculty faculty17 = new com.reservation_system.model.Faculty((int) (short) 0, "guest", "Andrew", "guest", true);
        int int18 = faculty17.getID();
        userRepository1.addUser((com.reservation_system.model.User) faculty17);
        boolean boolean20 = faculty17.requiresDepartmentApproval();
        org.junit.Assert.assertNotNull(userList2);
        org.junit.Assert.assertNotNull(userList4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(userList7);
        org.junit.Assert.assertNotNull(userOptional9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
    }

    @Test
    public void test1850() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1850");
        com.reservation_system.model.LabManager labManager5 = new com.reservation_system.model.LabManager((int) (byte) 10, "demo/data/test-users.csv", "faculty", "Password1!", true);
        java.lang.String str6 = labManager5.getUserType();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "labmanager" + "'", str6, "labmanager");
    }

    @Test
    public void test1851() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1851");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("demo/data/test-users.csv");
        int int2 = userRepository1.getNextID();
        com.reservation_system.model.Researcher researcher8 = new com.reservation_system.model.Researcher((int) (short) -1, "andrew@example.com", "guest", "labmanager", false);
        java.lang.String str9 = researcher8.getPassword();
        researcher8.setApproved(true);
        java.lang.String str12 = researcher8.getEmail();
        userRepository1.addUser((com.reservation_system.model.User) researcher8);
        com.reservation_system.repository.UserRepository userRepository15 = new com.reservation_system.repository.UserRepository("demo/data/test-users.csv");
        boolean boolean16 = userRepository15.headLabCoordinatorExists();
        com.reservation_system.services.RegistrationService registrationService17 = new com.reservation_system.services.RegistrationService(userRepository15);
        boolean boolean19 = userRepository15.emailExists("");
        java.util.List<com.reservation_system.model.User> userList20 = userRepository15.getAllUsers();
        com.reservation_system.repository.UserRepository userRepository22 = new com.reservation_system.repository.UserRepository("demo/data/test-users.csv");
        boolean boolean23 = userRepository22.headLabCoordinatorExists();
        com.reservation_system.repository.UserRepository userRepository25 = new com.reservation_system.repository.UserRepository("demo/data/test-users.csv");
        com.reservation_system.services.RegistrationService registrationService26 = new com.reservation_system.services.RegistrationService(userRepository25);
        com.reservation_system.model.Faculty faculty32 = new com.reservation_system.model.Faculty(0, "Password1!", "demo/data/test-users.csv", "researcher", false);
        java.lang.String str33 = faculty32.getName();
        userRepository25.addUser((com.reservation_system.model.User) faculty32);
        boolean boolean35 = userRepository25.headLabCoordinatorExists();
        com.reservation_system.model.Guest guest41 = new com.reservation_system.model.Guest((int) (byte) -1, "guest", "Researcher", "Faculty", true);
        userRepository25.addUser((com.reservation_system.model.User) guest41);
        boolean boolean43 = userRepository25.headLabCoordinatorExists();
        com.reservation_system.repository.UserRepository userRepository45 = new com.reservation_system.repository.UserRepository("demo/data/test-users.csv");
        com.reservation_system.services.RegistrationService registrationService46 = new com.reservation_system.services.RegistrationService(userRepository45);
        com.reservation_system.model.Faculty faculty52 = new com.reservation_system.model.Faculty(0, "Password1!", "demo/data/test-users.csv", "researcher", false);
        java.lang.String str53 = faculty52.getName();
        userRepository45.addUser((com.reservation_system.model.User) faculty52);
        boolean boolean55 = userRepository45.headLabCoordinatorExists();
        com.reservation_system.repository.UserRepository userRepository57 = new com.reservation_system.repository.UserRepository("demo/data/test-users.csv");
        com.reservation_system.services.RegistrationService registrationService58 = new com.reservation_system.services.RegistrationService(userRepository57);
        com.reservation_system.model.Faculty faculty64 = new com.reservation_system.model.Faculty(0, "Password1!", "demo/data/test-users.csv", "researcher", false);
        java.lang.String str65 = faculty64.getName();
        userRepository57.addUser((com.reservation_system.model.User) faculty64);
        java.util.List<com.reservation_system.model.User> userList67 = userRepository57.getAllUsers();
        userRepository45.saveAllUsers(userList67);
        userRepository25.saveAllUsers(userList67);
        userRepository22.saveAllUsers(userList67);
        userRepository15.saveAllUsers(userList67);
        userRepository1.saveAllUsers(userList67);
        com.reservation_system.model.Faculty faculty78 = new com.reservation_system.model.Faculty((int) (byte) 1, "researcher", "Andrew", "", false);
        java.lang.String str79 = faculty78.getUserType();
        java.lang.String str80 = faculty78.getName();
        userRepository1.addUser((com.reservation_system.model.User) faculty78);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 101 + "'", int2 == 101);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "labmanager" + "'", str9, "labmanager");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "guest" + "'", str12, "guest");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNotNull(userList20);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "Password1!" + "'", str33, "Password1!");
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + true + "'", boolean43 == true);
        org.junit.Assert.assertEquals("'" + str53 + "' != '" + "Password1!" + "'", str53, "Password1!");
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + true + "'", boolean55 == true);
        org.junit.Assert.assertEquals("'" + str65 + "' != '" + "Password1!" + "'", str65, "Password1!");
        org.junit.Assert.assertNotNull(userList67);
        org.junit.Assert.assertEquals("'" + str79 + "' != '" + "Faculty" + "'", str79, "Faculty");
        org.junit.Assert.assertEquals("'" + str80 + "' != '" + "researcher" + "'", str80, "researcher");
    }

    @Test
    public void test1852() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1852");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("demo/data/test-users.csv");
        com.reservation_system.services.RegistrationService registrationService2 = new com.reservation_system.services.RegistrationService(userRepository1);
        com.reservation_system.model.Faculty faculty8 = new com.reservation_system.model.Faculty(0, "Password1!", "demo/data/test-users.csv", "researcher", false);
        java.lang.String str9 = faculty8.getName();
        userRepository1.addUser((com.reservation_system.model.User) faculty8);
        boolean boolean12 = userRepository1.emailExists("Faculty");
        int int13 = userRepository1.getNextID();
        com.reservation_system.services.RegistrationService registrationService14 = new com.reservation_system.services.RegistrationService(userRepository1);
        java.util.Optional<com.reservation_system.model.User> userOptional16 = userRepository1.findByEmail("Andrew");
        com.reservation_system.services.RegistrationService registrationService17 = new com.reservation_system.services.RegistrationService(userRepository1);
        // The following exception was thrown during execution in test generation
        try {
            com.reservation_system.model.User user22 = registrationService17.registerUser("", "researcher", "hi!", "Researcher");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid user type.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Password1!" + "'", str9, "Password1!");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 101 + "'", int13 == 101);
        org.junit.Assert.assertNotNull(userOptional16);
    }

    @Test
    public void test1853() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1853");
        // The following exception was thrown during execution in test generation
        try {
            com.reservation_system.model.User user6 = com.reservation_system.patterns.factory.UserFactory.createUser("Andrew", (int) (byte) 100, "Researcher", "labmanager", "student", false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid user type: Andrew");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1854() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1854");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("demo/data/test-users.csv");
        java.util.List<com.reservation_system.model.User> userList2 = userRepository1.getAllUsers();
        com.reservation_system.services.RegistrationService registrationService3 = new com.reservation_system.services.RegistrationService(userRepository1);
        java.util.List<com.reservation_system.model.User> userList4 = userRepository1.getAllUsers();
        com.reservation_system.services.RegistrationService registrationService5 = new com.reservation_system.services.RegistrationService(userRepository1);
        boolean boolean7 = userRepository1.emailExists("demo/data/test-users.csv");
        java.util.Optional<com.reservation_system.model.User> userOptional9 = userRepository1.findByEmail("Andrew");
        org.junit.Assert.assertNotNull(userList2);
        org.junit.Assert.assertNotNull(userList4);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(userOptional9);
    }

    @Test
    public void test1855() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1855");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("demo/data/test-users.csv");
        boolean boolean2 = userRepository1.headLabCoordinatorExists();
        com.reservation_system.services.RegistrationService registrationService3 = new com.reservation_system.services.RegistrationService(userRepository1);
        boolean boolean4 = userRepository1.headLabCoordinatorExists();
        boolean boolean6 = userRepository1.emailExists("Andrew");
        com.reservation_system.services.RegistrationService registrationService7 = new com.reservation_system.services.RegistrationService(userRepository1);
        java.util.Optional<com.reservation_system.model.User> userOptional9 = userRepository1.findByEmail("faculty");
        com.reservation_system.services.RegistrationService registrationService10 = new com.reservation_system.services.RegistrationService(userRepository1);
        com.reservation_system.repository.UserRepository userRepository12 = new com.reservation_system.repository.UserRepository("demo/data/test-users.csv");
        com.reservation_system.services.RegistrationService registrationService13 = new com.reservation_system.services.RegistrationService(userRepository12);
        com.reservation_system.model.Faculty faculty19 = new com.reservation_system.model.Faculty(0, "Password1!", "demo/data/test-users.csv", "researcher", false);
        java.lang.String str20 = faculty19.getName();
        userRepository12.addUser((com.reservation_system.model.User) faculty19);
        boolean boolean22 = userRepository12.headLabCoordinatorExists();
        com.reservation_system.model.Guest guest28 = new com.reservation_system.model.Guest((int) (byte) -1, "guest", "Researcher", "Faculty", true);
        userRepository12.addUser((com.reservation_system.model.User) guest28);
        boolean boolean31 = userRepository12.emailExists("Password1!");
        com.reservation_system.repository.UserRepository userRepository33 = new com.reservation_system.repository.UserRepository("demo/data/test-users.csv");
        com.reservation_system.services.RegistrationService registrationService34 = new com.reservation_system.services.RegistrationService(userRepository33);
        com.reservation_system.model.Faculty faculty40 = new com.reservation_system.model.Faculty(0, "Password1!", "demo/data/test-users.csv", "researcher", false);
        java.lang.String str41 = faculty40.getName();
        userRepository33.addUser((com.reservation_system.model.User) faculty40);
        boolean boolean43 = userRepository33.headLabCoordinatorExists();
        com.reservation_system.services.RegistrationService registrationService44 = new com.reservation_system.services.RegistrationService(userRepository33);
        java.util.List<com.reservation_system.model.User> userList45 = userRepository33.getAllUsers();
        com.reservation_system.repository.UserRepository userRepository47 = new com.reservation_system.repository.UserRepository("demo/data/test-users.csv");
        com.reservation_system.services.RegistrationService registrationService48 = new com.reservation_system.services.RegistrationService(userRepository47);
        com.reservation_system.model.Faculty faculty54 = new com.reservation_system.model.Faculty(0, "Password1!", "demo/data/test-users.csv", "researcher", false);
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
        java.util.List<com.reservation_system.model.User> userList76 = userRepository1.getAllUsers();
        com.reservation_system.repository.UserRepository userRepository78 = new com.reservation_system.repository.UserRepository("demo/data/test-users.csv");
        java.util.List<com.reservation_system.model.User> userList79 = userRepository78.getAllUsers();
        com.reservation_system.services.RegistrationService registrationService80 = new com.reservation_system.services.RegistrationService(userRepository78);
        java.util.List<com.reservation_system.model.User> userList81 = userRepository78.getAllUsers();
        boolean boolean83 = userRepository78.emailExists("Guest");
        java.util.List<com.reservation_system.model.User> userList84 = userRepository78.getAllUsers();
        userRepository1.saveAllUsers(userList84);
        java.util.Optional<com.reservation_system.model.User> userOptional87 = userRepository1.findByEmail("Researcher");
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
        org.junit.Assert.assertNotNull(userList76);
        org.junit.Assert.assertNotNull(userList79);
        org.junit.Assert.assertNotNull(userList81);
        org.junit.Assert.assertTrue("'" + boolean83 + "' != '" + true + "'", boolean83 == true);
        org.junit.Assert.assertNotNull(userList84);
        org.junit.Assert.assertNotNull(userOptional87);
    }

    @Test
    public void test1856() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1856");
        com.reservation_system.model.Researcher researcher5 = new com.reservation_system.model.Researcher(0, "Password1!", "Faculty", "student", true);
        java.lang.String str6 = researcher5.getUserType();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Researcher" + "'", str6, "Researcher");
    }

    @Test
    public void test1857() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1857");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("demo/data/test-users.csv");
        java.util.List<com.reservation_system.model.User> userList2 = userRepository1.getAllUsers();
        com.reservation_system.services.RegistrationService registrationService3 = new com.reservation_system.services.RegistrationService(userRepository1);
        int int4 = userRepository1.getNextID();
        java.util.Optional<com.reservation_system.model.User> userOptional6 = userRepository1.findByEmail("Student");
        java.util.Optional<com.reservation_system.model.User> userOptional8 = userRepository1.findByEmail("researcher");
        org.junit.Assert.assertNotNull(userList2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 101 + "'", int4 == 101);
        org.junit.Assert.assertNotNull(userOptional6);
        org.junit.Assert.assertNotNull(userOptional8);
    }

    @Test
    public void test1858() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1858");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("demo/data/test-users.csv");
        java.util.List<com.reservation_system.model.User> userList2 = userRepository1.getAllUsers();
        boolean boolean3 = userRepository1.headLabCoordinatorExists();
        org.junit.Assert.assertNotNull(userList2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
    }

    @Test
    public void test1859() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1859");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("demo/data/test-users.csv");
        java.util.Optional<com.reservation_system.model.User> userOptional3 = userRepository1.findByEmail("hi!");
        int int4 = userRepository1.getNextID();
        com.reservation_system.services.RegistrationService registrationService5 = new com.reservation_system.services.RegistrationService(userRepository1);
        // The following exception was thrown during execution in test generation
        try {
            com.reservation_system.model.User user10 = registrationService5.registerUser("Password1!", "Password1!", "hi!", "demo/data/test-users.csv");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid user type.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(userOptional3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 101 + "'", int4 == 101);
    }

    @Test
    public void test1860() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1860");
        com.reservation_system.model.Researcher researcher5 = new com.reservation_system.model.Researcher(53, "demo/data/test-users.csv", "Student", "headlabcoordinator", true);
    }

    @Test
    public void test1861() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1861");
        com.reservation_system.model.Faculty faculty5 = new com.reservation_system.model.Faculty((int) '4', "student", "andrew@example.com", "Guest", true);
        boolean boolean6 = faculty5.isApproved();
        java.lang.String str7 = faculty5.getPassword();
        java.lang.String str8 = faculty5.getPassword();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Guest" + "'", str7, "Guest");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Guest" + "'", str8, "Guest");
    }

    @Test
    public void test1862() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1862");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("demo/data/test-users.csv");
        boolean boolean2 = userRepository1.headLabCoordinatorExists();
        com.reservation_system.services.RegistrationService registrationService3 = new com.reservation_system.services.RegistrationService(userRepository1);
        boolean boolean5 = userRepository1.emailExists("");
        java.util.Optional<com.reservation_system.model.User> userOptional7 = userRepository1.findByEmail("");
        java.util.Optional<com.reservation_system.model.User> userOptional9 = userRepository1.findByEmail("hi!");
        com.reservation_system.services.RegistrationService registrationService10 = new com.reservation_system.services.RegistrationService(userRepository1);
        com.reservation_system.services.RegistrationService registrationService11 = new com.reservation_system.services.RegistrationService(userRepository1);
        // The following exception was thrown during execution in test generation
        try {
            com.reservation_system.model.User user16 = registrationService11.registerUser("demo/data/test-users.csv", "Faculty", "Student", "faculty");
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
    public void test1863() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1863");
        com.reservation_system.model.Researcher researcher5 = new com.reservation_system.model.Researcher((int) (short) -1, "andrew@example.com", "guest", "labmanager", false);
        java.lang.String str6 = researcher5.getUserType();
        boolean boolean7 = researcher5.isApproved();
        boolean boolean8 = researcher5.isApproved();
        researcher5.setApproved(true);
        java.lang.String str11 = researcher5.getUserType();
        boolean boolean12 = researcher5.isApproved();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Researcher" + "'", str6, "Researcher");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Researcher" + "'", str11, "Researcher");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test1864() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1864");
        com.reservation_system.model.Researcher researcher5 = new com.reservation_system.model.Researcher((int) (byte) 100, "Student", "", "Student", false);
    }

    @Test
    public void test1865() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1865");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("demo/data/test-users.csv");
        java.util.Optional<com.reservation_system.model.User> userOptional3 = userRepository1.findByEmail("hi!");
        int int4 = userRepository1.getNextID();
        com.reservation_system.model.Researcher researcher10 = new com.reservation_system.model.Researcher((int) (byte) 10, "", "Guest", "headlabcoordinator", true);
        userRepository1.addUser((com.reservation_system.model.User) researcher10);
        java.util.List<com.reservation_system.model.User> userList12 = userRepository1.getAllUsers();
        com.reservation_system.model.Student student18 = new com.reservation_system.model.Student((int) (byte) 10, "hi!", "labmanager", "Password1!", false);
        userRepository1.addUser((com.reservation_system.model.User) student18);
        com.reservation_system.model.Researcher researcher25 = new com.reservation_system.model.Researcher((-1), "demo/data/test-users.csv", "headlabcoordinator", "", false);
        userRepository1.addUser((com.reservation_system.model.User) researcher25);
        java.util.Optional<com.reservation_system.model.User> userOptional28 = userRepository1.findByEmail("andrew@example.com");
        org.junit.Assert.assertNotNull(userOptional3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 101 + "'", int4 == 101);
        org.junit.Assert.assertNotNull(userList12);
        org.junit.Assert.assertNotNull(userOptional28);
    }

    @Test
    public void test1866() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1866");
        com.reservation_system.model.Guest guest5 = new com.reservation_system.model.Guest((int) (byte) 100, "faculty", "", "Guest", false);
        java.lang.String str6 = guest5.getUserType();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Guest" + "'", str6, "Guest");
    }

    @Test
    public void test1867() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1867");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("demo/data/test-users.csv");
        com.reservation_system.services.RegistrationService registrationService2 = new com.reservation_system.services.RegistrationService(userRepository1);
        com.reservation_system.model.Researcher researcher8 = new com.reservation_system.model.Researcher((int) (short) 1, "Password1!", "headlabcoordinator", "", false);
        userRepository1.addUser((com.reservation_system.model.User) researcher8);
        com.reservation_system.services.RegistrationService registrationService10 = new com.reservation_system.services.RegistrationService(userRepository1);
        boolean boolean12 = userRepository1.emailExists("");
        java.util.List<com.reservation_system.model.User> userList13 = userRepository1.getAllUsers();
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(userList13);
    }

    @Test
    public void test1868() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1868");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("demo/data/test-users.csv");
        com.reservation_system.services.RegistrationService registrationService2 = new com.reservation_system.services.RegistrationService(userRepository1);
        com.reservation_system.model.Faculty faculty8 = new com.reservation_system.model.Faculty(0, "Password1!", "demo/data/test-users.csv", "researcher", false);
        java.lang.String str9 = faculty8.getName();
        userRepository1.addUser((com.reservation_system.model.User) faculty8);
        boolean boolean12 = userRepository1.emailExists("Faculty");
        int int13 = userRepository1.getNextID();
        com.reservation_system.services.RegistrationService registrationService14 = new com.reservation_system.services.RegistrationService(userRepository1);
        // The following exception was thrown during execution in test generation
        try {
            com.reservation_system.model.User user19 = registrationService14.registerUser("researcher", "", "hi!", "demo/data/test-users.csv");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Name is required.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Password1!" + "'", str9, "Password1!");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 101 + "'", int13 == 101);
    }

    @Test
    public void test1869() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1869");
        com.reservation_system.model.Student student5 = new com.reservation_system.model.Student(53, "Guest", "faculty", "faculty", true);
        java.lang.String str6 = student5.getUserType();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Student" + "'", str6, "Student");
    }

    @Test
    public void test1870() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1870");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("demo/data/test-users.csv");
        java.util.List<com.reservation_system.model.User> userList2 = userRepository1.getAllUsers();
        com.reservation_system.services.RegistrationService registrationService3 = new com.reservation_system.services.RegistrationService(userRepository1);
        com.reservation_system.services.RegistrationService registrationService4 = new com.reservation_system.services.RegistrationService(userRepository1);
        java.util.Optional<com.reservation_system.model.User> userOptional6 = userRepository1.findByEmail("andrew@example.com");
        java.util.List<com.reservation_system.model.User> userList7 = userRepository1.getAllUsers();
        boolean boolean9 = userRepository1.emailExists("demo/data/test-users.csv");
        com.reservation_system.repository.UserRepository userRepository11 = new com.reservation_system.repository.UserRepository("demo/data/test-users.csv");
        java.util.List<com.reservation_system.model.User> userList12 = userRepository11.getAllUsers();
        userRepository1.saveAllUsers(userList12);
        com.reservation_system.repository.UserRepository userRepository15 = new com.reservation_system.repository.UserRepository("demo/data/test-users.csv");
        com.reservation_system.services.RegistrationService registrationService16 = new com.reservation_system.services.RegistrationService(userRepository15);
        com.reservation_system.model.Researcher researcher22 = new com.reservation_system.model.Researcher((int) (short) 1, "Password1!", "headlabcoordinator", "", false);
        userRepository15.addUser((com.reservation_system.model.User) researcher22);
        com.reservation_system.services.RegistrationService registrationService24 = new com.reservation_system.services.RegistrationService(userRepository15);
        boolean boolean26 = userRepository15.emailExists("");
        com.reservation_system.services.RegistrationService registrationService27 = new com.reservation_system.services.RegistrationService(userRepository15);
        java.util.List<com.reservation_system.model.User> userList28 = userRepository15.getAllUsers();
        userRepository1.saveAllUsers(userList28);
        org.junit.Assert.assertNotNull(userList2);
        org.junit.Assert.assertNotNull(userOptional6);
        org.junit.Assert.assertNotNull(userList7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(userList12);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertNotNull(userList28);
    }

    @Test
    public void test1871() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1871");
        com.reservation_system.model.Guest guest5 = new com.reservation_system.model.Guest((int) ' ', "Guest", "guest", "Student", false);
    }

    @Test
    public void test1872() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1872");
        com.reservation_system.model.Researcher researcher5 = new com.reservation_system.model.Researcher((int) (short) -1, "Password1!", "andrew@example.com", "Faculty", false);
        java.lang.String str6 = researcher5.getEmail();
        java.lang.String str7 = researcher5.getUserType();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Researcher" + "'", str7, "Researcher");
    }

    @Test
    public void test1873() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1873");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("demo/data/test-users.csv");
        com.reservation_system.services.RegistrationService registrationService2 = new com.reservation_system.services.RegistrationService(userRepository1);
        com.reservation_system.services.RegistrationService registrationService3 = new com.reservation_system.services.RegistrationService(userRepository1);
        com.reservation_system.services.RegistrationService registrationService4 = new com.reservation_system.services.RegistrationService(userRepository1);
        com.reservation_system.repository.UserRepository userRepository6 = new com.reservation_system.repository.UserRepository("demo/data/test-users.csv");
        com.reservation_system.services.RegistrationService registrationService7 = new com.reservation_system.services.RegistrationService(userRepository6);
        com.reservation_system.model.Faculty faculty13 = new com.reservation_system.model.Faculty(0, "Password1!", "demo/data/test-users.csv", "researcher", false);
        java.lang.String str14 = faculty13.getName();
        userRepository6.addUser((com.reservation_system.model.User) faculty13);
        boolean boolean16 = userRepository6.headLabCoordinatorExists();
        com.reservation_system.model.Guest guest22 = new com.reservation_system.model.Guest((int) (byte) -1, "guest", "Researcher", "Faculty", true);
        userRepository6.addUser((com.reservation_system.model.User) guest22);
        java.util.List<com.reservation_system.model.User> userList24 = userRepository6.getAllUsers();
        userRepository1.saveAllUsers(userList24);
        java.util.Optional<com.reservation_system.model.User> userOptional27 = userRepository1.findByEmail("Andrew");
        java.util.List<com.reservation_system.model.User> userList28 = null;
        // The following exception was thrown during execution in test generation
        try {
            userRepository1.saveAllUsers(userList28);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Password1!" + "'", str14, "Password1!");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNotNull(userList24);
        org.junit.Assert.assertNotNull(userOptional27);
    }

    @Test
    public void test1874() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1874");
        com.reservation_system.model.Researcher researcher5 = new com.reservation_system.model.Researcher(102, "Password1!", "hi!", "andrew@example.com", true);
        researcher5.setApproved(false);
        java.lang.String str8 = researcher5.getUserType();
        java.lang.String str9 = researcher5.getName();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Researcher" + "'", str8, "Researcher");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Password1!" + "'", str9, "Password1!");
    }

    @Test
    public void test1875() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1875");
        com.reservation_system.model.Guest guest5 = new com.reservation_system.model.Guest(101, "faculty", "Password1!", "hi!", true);
        java.lang.String str6 = guest5.getUserType();
        java.lang.String str7 = guest5.getUserType();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Guest" + "'", str6, "Guest");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Guest" + "'", str7, "Guest");
    }

    @Test
    public void test1876() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1876");
        com.reservation_system.model.Guest guest5 = new com.reservation_system.model.Guest(52, "Student", "labmanager", "Guest", true);
    }

    @Test
    public void test1877() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1877");
        com.reservation_system.model.Researcher researcher5 = new com.reservation_system.model.Researcher(102, "Password1!", "hi!", "andrew@example.com", true);
        researcher5.setApproved(false);
        java.lang.String str8 = researcher5.getEmail();
        researcher5.setApproved(false);
        boolean boolean11 = researcher5.isApproved();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test1878() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1878");
        // The following exception was thrown during execution in test generation
        try {
            com.reservation_system.model.User user6 = com.reservation_system.patterns.factory.UserFactory.createUser("hi!", 53, "Student", "Guest", "Guest", false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid user type: hi!");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1879() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1879");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("demo/data/test-users.csv");
        int int2 = userRepository1.getNextID();
        int int3 = userRepository1.getNextID();
        boolean boolean5 = userRepository1.emailExists("faculty");
        java.util.Optional<com.reservation_system.model.User> userOptional7 = userRepository1.findByEmail("");
        com.reservation_system.repository.UserRepository userRepository9 = new com.reservation_system.repository.UserRepository("demo/data/test-users.csv");
        java.util.List<com.reservation_system.model.User> userList10 = userRepository9.getAllUsers();
        java.util.List<com.reservation_system.model.User> userList11 = userRepository9.getAllUsers();
        userRepository1.saveAllUsers(userList11);
        java.util.Optional<com.reservation_system.model.User> userOptional14 = userRepository1.findByEmail("");
        com.reservation_system.repository.UserRepository userRepository16 = new com.reservation_system.repository.UserRepository("demo/data/test-users.csv");
        int int17 = userRepository16.getNextID();
        int int18 = userRepository16.getNextID();
        boolean boolean20 = userRepository16.emailExists("faculty");
        com.reservation_system.model.LabManager labManager26 = new com.reservation_system.model.LabManager((int) (short) 0, "", "labmanager", "Password1!", true);
        userRepository16.addUser((com.reservation_system.model.User) labManager26);
        java.util.Optional<com.reservation_system.model.User> userOptional29 = userRepository16.findByEmail("");
        com.reservation_system.model.Researcher researcher35 = new com.reservation_system.model.Researcher((int) (byte) 100, "Password1!", "Password1!", "headlabcoordinator", true);
        userRepository16.addUser((com.reservation_system.model.User) researcher35);
        java.util.List<com.reservation_system.model.User> userList37 = userRepository16.getAllUsers();
        userRepository1.saveAllUsers(userList37);
        int int39 = userRepository1.getNextID();
        java.lang.Class<?> wildcardClass40 = userRepository1.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(userOptional7);
        org.junit.Assert.assertNotNull(userList10);
        org.junit.Assert.assertNotNull(userList11);
        org.junit.Assert.assertNotNull(userOptional14);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(userOptional29);
        org.junit.Assert.assertNotNull(userList37);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 101 + "'", int39 == 101);
        org.junit.Assert.assertNotNull(wildcardClass40);
    }

    @Test
    public void test1880() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1880");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("demo/data/test-users.csv");
        java.util.Optional<com.reservation_system.model.User> userOptional3 = userRepository1.findByEmail("hi!");
        int int4 = userRepository1.getNextID();
        int int5 = userRepository1.getNextID();
        com.reservation_system.model.Researcher researcher11 = new com.reservation_system.model.Researcher((int) 'a', "student", "", "researcher", true);
        userRepository1.addUser((com.reservation_system.model.User) researcher11);
        com.reservation_system.model.Student student18 = new com.reservation_system.model.Student((int) '#', "labmanager", "demo/data/test-users.csv", "labmanager", false);
        userRepository1.addUser((com.reservation_system.model.User) student18);
        boolean boolean21 = userRepository1.emailExists("Researcher");
        com.reservation_system.model.Guest guest27 = new com.reservation_system.model.Guest((int) '4', "Researcher", "demo/data/test-users.csv", "guest", true);
        java.lang.String str28 = guest27.getPassword();
        java.lang.String str29 = guest27.getUserType();
        java.lang.String str30 = guest27.getUserType();
        userRepository1.addUser((com.reservation_system.model.User) guest27);
        org.junit.Assert.assertNotNull(userOptional3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 101 + "'", int4 == 101);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 101 + "'", int5 == 101);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "guest" + "'", str28, "guest");
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "Guest" + "'", str29, "Guest");
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "Guest" + "'", str30, "Guest");
    }

    @Test
    public void test1881() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1881");
        com.reservation_system.model.Researcher researcher5 = new com.reservation_system.model.Researcher((int) (byte) 10, "", "andrew@example.com", "faculty", true);
    }

    @Test
    public void test1882() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1882");
        com.reservation_system.model.Researcher researcher5 = new com.reservation_system.model.Researcher((int) '#', "", "demo/data/test-users.csv", "Password1!", false);
        boolean boolean6 = researcher5.isApproved();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test1883() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1883");
        com.reservation_system.model.Researcher researcher5 = new com.reservation_system.model.Researcher((int) (byte) 1, "headlabcoordinator", "Andrew", "", true);
        java.lang.String str6 = researcher5.getUserType();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Researcher" + "'", str6, "Researcher");
    }

    @Test
    public void test1884() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1884");
        com.reservation_system.model.Guest guest5 = new com.reservation_system.model.Guest((int) '4', "hi!", "Faculty", "Password1!", false);
        java.lang.String str6 = guest5.getName();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
    }

    @Test
    public void test1885() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1885");
        com.reservation_system.model.Student student5 = new com.reservation_system.model.Student((int) (short) 10, "Faculty", "demo/data/test-users.csv", "Researcher", false);
        student5.setApproved(false);
        boolean boolean8 = student5.isApproved();
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test1886() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1886");
        com.reservation_system.model.Student student5 = new com.reservation_system.model.Student((int) (short) 0, "Researcher", "Student", "researcher", true);
    }

    @Test
    public void test1887() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1887");
        com.reservation_system.model.Faculty faculty5 = new com.reservation_system.model.Faculty(35, "faculty", "", "Andrew", false);
    }

    @Test
    public void test1888() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1888");
        com.reservation_system.model.HeadLabCoordinator headLabCoordinator5 = new com.reservation_system.model.HeadLabCoordinator(10, "researcher", "headlabcoordinator", "faculty", false);
        java.lang.String str6 = headLabCoordinator5.getUserType();
        headLabCoordinator5.setApproved(false);
        java.lang.String str9 = headLabCoordinator5.getUserType();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "headlabcoordinator" + "'", str6, "headlabcoordinator");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "headlabcoordinator" + "'", str9, "headlabcoordinator");
    }

    @Test
    public void test1889() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1889");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("demo/data/test-users.csv");
        com.reservation_system.services.RegistrationService registrationService2 = new com.reservation_system.services.RegistrationService(userRepository1);
        com.reservation_system.model.Faculty faculty8 = new com.reservation_system.model.Faculty(0, "Password1!", "demo/data/test-users.csv", "researcher", false);
        java.lang.String str9 = faculty8.getName();
        userRepository1.addUser((com.reservation_system.model.User) faculty8);
        boolean boolean11 = userRepository1.headLabCoordinatorExists();
        com.reservation_system.model.Guest guest17 = new com.reservation_system.model.Guest((int) (byte) -1, "guest", "Researcher", "Faculty", true);
        userRepository1.addUser((com.reservation_system.model.User) guest17);
        boolean boolean20 = userRepository1.emailExists("Password1!");
        boolean boolean22 = userRepository1.emailExists("hi!");
        int int23 = userRepository1.getNextID();
        int int24 = userRepository1.getNextID();
        boolean boolean26 = userRepository1.emailExists("Researcher");
        boolean boolean28 = userRepository1.emailExists("Researcher");
        com.reservation_system.repository.UserRepository userRepository30 = new com.reservation_system.repository.UserRepository("demo/data/test-users.csv");
        com.reservation_system.services.RegistrationService registrationService31 = new com.reservation_system.services.RegistrationService(userRepository30);
        com.reservation_system.services.RegistrationService registrationService32 = new com.reservation_system.services.RegistrationService(userRepository30);
        com.reservation_system.services.RegistrationService registrationService33 = new com.reservation_system.services.RegistrationService(userRepository30);
        com.reservation_system.repository.UserRepository userRepository35 = new com.reservation_system.repository.UserRepository("demo/data/test-users.csv");
        com.reservation_system.services.RegistrationService registrationService36 = new com.reservation_system.services.RegistrationService(userRepository35);
        com.reservation_system.model.Faculty faculty42 = new com.reservation_system.model.Faculty(0, "Password1!", "demo/data/test-users.csv", "researcher", false);
        java.lang.String str43 = faculty42.getName();
        userRepository35.addUser((com.reservation_system.model.User) faculty42);
        boolean boolean45 = userRepository35.headLabCoordinatorExists();
        com.reservation_system.model.Guest guest51 = new com.reservation_system.model.Guest((int) (byte) -1, "guest", "Researcher", "Faculty", true);
        userRepository35.addUser((com.reservation_system.model.User) guest51);
        java.util.List<com.reservation_system.model.User> userList53 = userRepository35.getAllUsers();
        userRepository30.saveAllUsers(userList53);
        com.reservation_system.repository.UserRepository userRepository56 = new com.reservation_system.repository.UserRepository("demo/data/test-users.csv");
        boolean boolean57 = userRepository56.headLabCoordinatorExists();
        com.reservation_system.repository.UserRepository userRepository59 = new com.reservation_system.repository.UserRepository("demo/data/test-users.csv");
        com.reservation_system.services.RegistrationService registrationService60 = new com.reservation_system.services.RegistrationService(userRepository59);
        com.reservation_system.model.Faculty faculty66 = new com.reservation_system.model.Faculty(0, "Password1!", "demo/data/test-users.csv", "researcher", false);
        java.lang.String str67 = faculty66.getName();
        userRepository59.addUser((com.reservation_system.model.User) faculty66);
        java.util.List<com.reservation_system.model.User> userList69 = userRepository59.getAllUsers();
        userRepository56.saveAllUsers(userList69);
        userRepository30.saveAllUsers(userList69);
        userRepository1.saveAllUsers(userList69);
        com.reservation_system.model.HeadLabCoordinator headLabCoordinator78 = new com.reservation_system.model.HeadLabCoordinator(1, "student", "Researcher", "", false);
        java.lang.String str79 = headLabCoordinator78.getUserType();
        java.lang.String str80 = headLabCoordinator78.getUserType();
        java.lang.String str81 = headLabCoordinator78.getUserType();
        java.lang.String str82 = headLabCoordinator78.getUserType();
        boolean boolean83 = headLabCoordinator78.isApproved();
        userRepository1.addUser((com.reservation_system.model.User) headLabCoordinator78);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Password1!" + "'", str9, "Password1!");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 101 + "'", int23 == 101);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 101 + "'", int24 == 101);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "Password1!" + "'", str43, "Password1!");
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertNotNull(userList53);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
        org.junit.Assert.assertEquals("'" + str67 + "' != '" + "Password1!" + "'", str67, "Password1!");
        org.junit.Assert.assertNotNull(userList69);
        org.junit.Assert.assertEquals("'" + str79 + "' != '" + "headlabcoordinator" + "'", str79, "headlabcoordinator");
        org.junit.Assert.assertEquals("'" + str80 + "' != '" + "headlabcoordinator" + "'", str80, "headlabcoordinator");
        org.junit.Assert.assertEquals("'" + str81 + "' != '" + "headlabcoordinator" + "'", str81, "headlabcoordinator");
        org.junit.Assert.assertEquals("'" + str82 + "' != '" + "headlabcoordinator" + "'", str82, "headlabcoordinator");
        org.junit.Assert.assertTrue("'" + boolean83 + "' != '" + false + "'", boolean83 == false);
    }

    @Test
    public void test1890() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1890");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("demo/data/test-users.csv");
        int int2 = userRepository1.getNextID();
        com.reservation_system.model.Researcher researcher8 = new com.reservation_system.model.Researcher((int) (short) -1, "andrew@example.com", "guest", "labmanager", false);
        java.lang.String str9 = researcher8.getPassword();
        researcher8.setApproved(true);
        java.lang.String str12 = researcher8.getEmail();
        userRepository1.addUser((com.reservation_system.model.User) researcher8);
        com.reservation_system.repository.UserRepository userRepository15 = new com.reservation_system.repository.UserRepository("demo/data/test-users.csv");
        boolean boolean16 = userRepository15.headLabCoordinatorExists();
        com.reservation_system.services.RegistrationService registrationService17 = new com.reservation_system.services.RegistrationService(userRepository15);
        boolean boolean19 = userRepository15.emailExists("");
        java.util.List<com.reservation_system.model.User> userList20 = userRepository15.getAllUsers();
        com.reservation_system.repository.UserRepository userRepository22 = new com.reservation_system.repository.UserRepository("demo/data/test-users.csv");
        boolean boolean23 = userRepository22.headLabCoordinatorExists();
        com.reservation_system.repository.UserRepository userRepository25 = new com.reservation_system.repository.UserRepository("demo/data/test-users.csv");
        com.reservation_system.services.RegistrationService registrationService26 = new com.reservation_system.services.RegistrationService(userRepository25);
        com.reservation_system.model.Faculty faculty32 = new com.reservation_system.model.Faculty(0, "Password1!", "demo/data/test-users.csv", "researcher", false);
        java.lang.String str33 = faculty32.getName();
        userRepository25.addUser((com.reservation_system.model.User) faculty32);
        boolean boolean35 = userRepository25.headLabCoordinatorExists();
        com.reservation_system.model.Guest guest41 = new com.reservation_system.model.Guest((int) (byte) -1, "guest", "Researcher", "Faculty", true);
        userRepository25.addUser((com.reservation_system.model.User) guest41);
        boolean boolean43 = userRepository25.headLabCoordinatorExists();
        com.reservation_system.repository.UserRepository userRepository45 = new com.reservation_system.repository.UserRepository("demo/data/test-users.csv");
        com.reservation_system.services.RegistrationService registrationService46 = new com.reservation_system.services.RegistrationService(userRepository45);
        com.reservation_system.model.Faculty faculty52 = new com.reservation_system.model.Faculty(0, "Password1!", "demo/data/test-users.csv", "researcher", false);
        java.lang.String str53 = faculty52.getName();
        userRepository45.addUser((com.reservation_system.model.User) faculty52);
        boolean boolean55 = userRepository45.headLabCoordinatorExists();
        com.reservation_system.repository.UserRepository userRepository57 = new com.reservation_system.repository.UserRepository("demo/data/test-users.csv");
        com.reservation_system.services.RegistrationService registrationService58 = new com.reservation_system.services.RegistrationService(userRepository57);
        com.reservation_system.model.Faculty faculty64 = new com.reservation_system.model.Faculty(0, "Password1!", "demo/data/test-users.csv", "researcher", false);
        java.lang.String str65 = faculty64.getName();
        userRepository57.addUser((com.reservation_system.model.User) faculty64);
        java.util.List<com.reservation_system.model.User> userList67 = userRepository57.getAllUsers();
        userRepository45.saveAllUsers(userList67);
        userRepository25.saveAllUsers(userList67);
        userRepository22.saveAllUsers(userList67);
        userRepository15.saveAllUsers(userList67);
        userRepository1.saveAllUsers(userList67);
        java.util.List<com.reservation_system.model.User> userList73 = userRepository1.getAllUsers();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 101 + "'", int2 == 101);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "labmanager" + "'", str9, "labmanager");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "guest" + "'", str12, "guest");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNotNull(userList20);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "Password1!" + "'", str33, "Password1!");
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + true + "'", boolean43 == true);
        org.junit.Assert.assertEquals("'" + str53 + "' != '" + "Password1!" + "'", str53, "Password1!");
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + true + "'", boolean55 == true);
        org.junit.Assert.assertEquals("'" + str65 + "' != '" + "Password1!" + "'", str65, "Password1!");
        org.junit.Assert.assertNotNull(userList67);
        org.junit.Assert.assertNotNull(userList73);
    }

    @Test
    public void test1891() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1891");
        com.reservation_system.model.Guest guest5 = new com.reservation_system.model.Guest(52, "Researcher", "hi!", "hi!", false);
    }

    @Test
    public void test1892() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1892");
        com.reservation_system.model.Researcher researcher5 = new com.reservation_system.model.Researcher((int) (short) -1, "faculty", "researcher", "hi!", true);
        researcher5.setApproved(false);
        java.lang.String str8 = researcher5.getEmail();
        java.lang.String str9 = researcher5.getUserType();
        java.lang.String str10 = researcher5.getUserType();
        boolean boolean11 = researcher5.isApproved();
        java.lang.String str12 = researcher5.getUserType();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "researcher" + "'", str8, "researcher");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Researcher" + "'", str9, "Researcher");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Researcher" + "'", str10, "Researcher");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Researcher" + "'", str12, "Researcher");
    }

    @Test
    public void test1893() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1893");
        com.reservation_system.model.Researcher researcher5 = new com.reservation_system.model.Researcher((int) ' ', "Password1!", "researcher", "guest", true);
    }

    @Test
    public void test1894() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1894");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("demo/data/test-users.csv");
        boolean boolean2 = userRepository1.headLabCoordinatorExists();
        com.reservation_system.services.RegistrationService registrationService3 = new com.reservation_system.services.RegistrationService(userRepository1);
        boolean boolean5 = userRepository1.emailExists("");
        com.reservation_system.model.Guest guest11 = new com.reservation_system.model.Guest((int) '#', "Guest", "researcher", "headlabcoordinator", true);
        userRepository1.addUser((com.reservation_system.model.User) guest11);
        java.lang.String str13 = guest11.getName();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Guest" + "'", str13, "Guest");
    }

    @Test
    public void test1895() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1895");
        com.reservation_system.model.Researcher researcher5 = new com.reservation_system.model.Researcher((int) (short) -1, "andrew@example.com", "guest", "labmanager", false);
        java.lang.String str6 = researcher5.getPassword();
        boolean boolean7 = researcher5.requiresDepartmentApproval();
        int int8 = researcher5.getID();
        java.lang.String str9 = researcher5.getEmail();
        java.lang.String str10 = researcher5.getUserType();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "labmanager" + "'", str6, "labmanager");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "guest" + "'", str9, "guest");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Researcher" + "'", str10, "Researcher");
    }

    @Test
    public void test1896() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1896");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("demo/data/test-users.csv");
        com.reservation_system.services.RegistrationService registrationService2 = new com.reservation_system.services.RegistrationService(userRepository1);
        com.reservation_system.model.Faculty faculty8 = new com.reservation_system.model.Faculty(0, "Password1!", "demo/data/test-users.csv", "researcher", false);
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
        java.lang.String str30 = faculty27.getUserType();
        java.lang.String str31 = faculty27.getPassword();
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Password1!" + "'", str9, "Password1!");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 101 + "'", int13 == 101);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "Researcher" + "'", str20, "Researcher");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "Faculty" + "'", str28, "Faculty");
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "Faculty" + "'", str30, "Faculty");
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "researcher" + "'", str31, "researcher");
    }

    @Test
    public void test1897() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1897");
        com.reservation_system.model.Researcher researcher5 = new com.reservation_system.model.Researcher(35, "Student", "student", "labmanager", true);
    }

    @Test
    public void test1898() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1898");
        com.reservation_system.model.Student student5 = new com.reservation_system.model.Student(101, "Student", "guest", "Faculty", true);
        java.lang.String str6 = student5.getUserType();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Student" + "'", str6, "Student");
    }

    @Test
    public void test1899() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1899");
        com.reservation_system.model.Student student5 = new com.reservation_system.model.Student((int) (short) -1, "Guest", "Student", "faculty", false);
        java.lang.String str6 = student5.getUserType();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Student" + "'", str6, "Student");
    }

    @Test
    public void test1900() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1900");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("demo/data/test-users.csv");
        boolean boolean2 = userRepository1.headLabCoordinatorExists();
        com.reservation_system.repository.UserRepository userRepository4 = new com.reservation_system.repository.UserRepository("demo/data/test-users.csv");
        com.reservation_system.services.RegistrationService registrationService5 = new com.reservation_system.services.RegistrationService(userRepository4);
        com.reservation_system.model.Faculty faculty11 = new com.reservation_system.model.Faculty(0, "Password1!", "demo/data/test-users.csv", "researcher", false);
        java.lang.String str12 = faculty11.getName();
        userRepository4.addUser((com.reservation_system.model.User) faculty11);
        boolean boolean14 = userRepository4.headLabCoordinatorExists();
        com.reservation_system.model.Guest guest20 = new com.reservation_system.model.Guest((int) (byte) -1, "guest", "Researcher", "Faculty", true);
        userRepository4.addUser((com.reservation_system.model.User) guest20);
        boolean boolean22 = userRepository4.headLabCoordinatorExists();
        com.reservation_system.repository.UserRepository userRepository24 = new com.reservation_system.repository.UserRepository("demo/data/test-users.csv");
        com.reservation_system.services.RegistrationService registrationService25 = new com.reservation_system.services.RegistrationService(userRepository24);
        com.reservation_system.model.Faculty faculty31 = new com.reservation_system.model.Faculty(0, "Password1!", "demo/data/test-users.csv", "researcher", false);
        java.lang.String str32 = faculty31.getName();
        userRepository24.addUser((com.reservation_system.model.User) faculty31);
        boolean boolean34 = userRepository24.headLabCoordinatorExists();
        com.reservation_system.repository.UserRepository userRepository36 = new com.reservation_system.repository.UserRepository("demo/data/test-users.csv");
        com.reservation_system.services.RegistrationService registrationService37 = new com.reservation_system.services.RegistrationService(userRepository36);
        com.reservation_system.model.Faculty faculty43 = new com.reservation_system.model.Faculty(0, "Password1!", "demo/data/test-users.csv", "researcher", false);
        java.lang.String str44 = faculty43.getName();
        userRepository36.addUser((com.reservation_system.model.User) faculty43);
        java.util.List<com.reservation_system.model.User> userList46 = userRepository36.getAllUsers();
        userRepository24.saveAllUsers(userList46);
        userRepository4.saveAllUsers(userList46);
        userRepository1.saveAllUsers(userList46);
        com.reservation_system.services.RegistrationService registrationService50 = new com.reservation_system.services.RegistrationService(userRepository1);
        com.reservation_system.services.RegistrationService registrationService51 = new com.reservation_system.services.RegistrationService(userRepository1);
        java.util.Optional<com.reservation_system.model.User> userOptional53 = userRepository1.findByEmail("student");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Password1!" + "'", str12, "Password1!");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "Password1!" + "'", str32, "Password1!");
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "Password1!" + "'", str44, "Password1!");
        org.junit.Assert.assertNotNull(userList46);
        org.junit.Assert.assertNotNull(userOptional53);
    }

    @Test
    public void test1901() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1901");
        com.reservation_system.model.Guest guest5 = new com.reservation_system.model.Guest(97, "hi!", "labmanager", "Student", false);
    }

    @Test
    public void test1902() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1902");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("demo/data/test-users.csv");
        boolean boolean2 = userRepository1.headLabCoordinatorExists();
        com.reservation_system.services.RegistrationService registrationService3 = new com.reservation_system.services.RegistrationService(userRepository1);
        boolean boolean5 = userRepository1.emailExists("");
        java.util.Optional<com.reservation_system.model.User> userOptional7 = userRepository1.findByEmail("");
        java.util.Optional<com.reservation_system.model.User> userOptional9 = userRepository1.findByEmail("hi!");
        com.reservation_system.services.RegistrationService registrationService10 = new com.reservation_system.services.RegistrationService(userRepository1);
        com.reservation_system.services.RegistrationService registrationService11 = new com.reservation_system.services.RegistrationService(userRepository1);
        // The following exception was thrown during execution in test generation
        try {
            com.reservation_system.model.User user16 = registrationService11.registerUser("", "Andrew", "labmanager", "hi!");
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
    public void test1903() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1903");
        com.reservation_system.model.Researcher researcher5 = new com.reservation_system.model.Researcher(52, "", "researcher", "labmanager", true);
    }

    @Test
    public void test1904() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1904");
        com.reservation_system.model.User user6 = com.reservation_system.patterns.factory.UserFactory.createUser("Student", (int) '4', "researcher", "faculty", "Guest", true);
        org.junit.Assert.assertNotNull(user6);
    }

    @Test
    public void test1905() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1905");
        com.reservation_system.model.Researcher researcher5 = new com.reservation_system.model.Researcher(0, "", "", "demo/data/test-users.csv", false);
        java.lang.String str6 = researcher5.getName();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
    }

    @Test
    public void test1906() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1906");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("demo/data/test-users.csv");
        boolean boolean2 = userRepository1.headLabCoordinatorExists();
        com.reservation_system.services.RegistrationService registrationService3 = new com.reservation_system.services.RegistrationService(userRepository1);
        boolean boolean5 = userRepository1.emailExists("");
        boolean boolean6 = userRepository1.headLabCoordinatorExists();
        com.reservation_system.services.RegistrationService registrationService7 = new com.reservation_system.services.RegistrationService(userRepository1);
        int int8 = userRepository1.getNextID();
        boolean boolean10 = userRepository1.emailExists("");
        com.reservation_system.services.RegistrationService registrationService11 = new com.reservation_system.services.RegistrationService(userRepository1);
        com.reservation_system.model.Researcher researcher17 = new com.reservation_system.model.Researcher((int) (byte) 100, "Password1!", "Password1!", "headlabcoordinator", true);
        boolean boolean18 = researcher17.requiresDepartmentApproval();
        java.lang.String str19 = researcher17.getUserType();
        java.lang.String str20 = researcher17.getUserType();
        java.lang.String str21 = researcher17.getName();
        userRepository1.addUser((com.reservation_system.model.User) researcher17);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 101 + "'", int8 == 101);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "Researcher" + "'", str19, "Researcher");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "Researcher" + "'", str20, "Researcher");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "Password1!" + "'", str21, "Password1!");
    }

    @Test
    public void test1907() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1907");
        com.reservation_system.model.Student student5 = new com.reservation_system.model.Student((int) ' ', "faculty", "guest", "headlabcoordinator", false);
    }

    @Test
    public void test1908() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1908");
        com.reservation_system.model.Guest guest5 = new com.reservation_system.model.Guest(33, "labmanager", "researcher", "researcher", false);
    }

    @Test
    public void test1909() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1909");
        com.reservation_system.model.Researcher researcher5 = new com.reservation_system.model.Researcher((int) (short) 100, "headlabcoordinator", "faculty", "", true);
        java.lang.String str6 = researcher5.getPassword();
        researcher5.setApproved(false);
        java.lang.String str9 = researcher5.getUserType();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Researcher" + "'", str9, "Researcher");
    }

    @Test
    public void test1910() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1910");
        com.reservation_system.model.Guest guest5 = new com.reservation_system.model.Guest((int) (byte) 100, "andrew@example.com", "student", "Researcher", false);
        java.lang.String str6 = guest5.getUserType();
        int int7 = guest5.getID();
        java.lang.String str8 = guest5.getPassword();
        java.lang.String str9 = guest5.getPassword();
        java.lang.String str10 = guest5.getEmail();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Guest" + "'", str6, "Guest");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 100 + "'", int7 == 100);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Researcher" + "'", str8, "Researcher");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Researcher" + "'", str9, "Researcher");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "student" + "'", str10, "student");
    }

    @Test
    public void test1911() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1911");
        com.reservation_system.model.Researcher researcher5 = new com.reservation_system.model.Researcher((int) ' ', "guest", "researcher", "Faculty", true);
        boolean boolean6 = researcher5.isApproved();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test1912() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1912");
        com.reservation_system.model.LabManager labManager5 = new com.reservation_system.model.LabManager(35, "Andrew", "Guest", "labmanager", false);
    }

    @Test
    public void test1913() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1913");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("demo/data/test-users.csv");
        int int2 = userRepository1.getNextID();
        int int3 = userRepository1.getNextID();
        boolean boolean5 = userRepository1.emailExists("faculty");
        java.util.List<com.reservation_system.model.User> userList6 = userRepository1.getAllUsers();
        java.util.Optional<com.reservation_system.model.User> userOptional8 = userRepository1.findByEmail("guest");
        boolean boolean10 = userRepository1.emailExists("andrew@example.com");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 101 + "'", int2 == 101);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 101 + "'", int3 == 101);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(userList6);
        org.junit.Assert.assertNotNull(userOptional8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test1914() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1914");
        com.reservation_system.model.Guest guest5 = new com.reservation_system.model.Guest(0, "researcher", "researcher", "Andrew", true);
        java.lang.String str6 = guest5.getUserType();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Guest" + "'", str6, "Guest");
    }

    @Test
    public void test1915() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1915");
        com.reservation_system.model.Researcher researcher5 = new com.reservation_system.model.Researcher((int) (short) -1, "andrew@example.com", "guest", "labmanager", false);
        java.lang.String str6 = researcher5.getUserType();
        boolean boolean7 = researcher5.isApproved();
        boolean boolean8 = researcher5.isApproved();
        boolean boolean9 = researcher5.isApproved();
        java.lang.String str10 = researcher5.getUserType();
        java.lang.String str11 = researcher5.getPassword();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Researcher" + "'", str6, "Researcher");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Researcher" + "'", str10, "Researcher");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "labmanager" + "'", str11, "labmanager");
    }

    @Test
    public void test1916() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1916");
        com.reservation_system.model.Student student5 = new com.reservation_system.model.Student((int) (short) 0, "guest", "Guest", "hi!", true);
        java.lang.String str6 = student5.getUserType();
        boolean boolean7 = student5.isApproved();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Student" + "'", str6, "Student");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test1917() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1917");
        com.reservation_system.model.LabManager labManager5 = new com.reservation_system.model.LabManager((int) (byte) 10, "researcher", "guest", "researcher", false);
        java.lang.String str6 = labManager5.getUserType();
        boolean boolean7 = labManager5.isApproved();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "labmanager" + "'", str6, "labmanager");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test1918() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1918");
        com.reservation_system.model.HeadLabCoordinator headLabCoordinator5 = new com.reservation_system.model.HeadLabCoordinator(1, "guest", "Researcher", "Student", true);
        java.lang.String str6 = headLabCoordinator5.getEmail();
        java.lang.String str7 = headLabCoordinator5.getUserType();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Researcher" + "'", str6, "Researcher");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "headlabcoordinator" + "'", str7, "headlabcoordinator");
    }

    @Test
    public void test1919() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1919");
        com.reservation_system.model.Student student5 = new com.reservation_system.model.Student((int) (byte) 1, "Andrew", "andrew@example.com", "headlabcoordinator", true);
        java.lang.String str6 = student5.getUserType();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Student" + "'", str6, "Student");
    }

    @Test
    public void test1920() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1920");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("demo/data/test-users.csv");
        com.reservation_system.services.RegistrationService registrationService2 = new com.reservation_system.services.RegistrationService(userRepository1);
        com.reservation_system.services.RegistrationService registrationService3 = new com.reservation_system.services.RegistrationService(userRepository1);
        java.util.List<com.reservation_system.model.User> userList4 = userRepository1.getAllUsers();
        com.reservation_system.model.Student student10 = new com.reservation_system.model.Student((int) ' ', "Password1!", "andrew@example.com", "researcher", false);
        java.lang.String str11 = student10.getUserType();
        userRepository1.addUser((com.reservation_system.model.User) student10);
        boolean boolean13 = student10.requiresDepartmentApproval();
        org.junit.Assert.assertNotNull(userList4);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Student" + "'", str11, "Student");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test1921() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1921");
        com.reservation_system.model.Faculty faculty5 = new com.reservation_system.model.Faculty(102, "Student", "hi!", "Password1!", false);
        java.lang.String str6 = faculty5.getPassword();
        java.lang.String str7 = faculty5.getUserType();
        java.lang.String str8 = faculty5.getUserType();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Password1!" + "'", str6, "Password1!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Faculty" + "'", str7, "Faculty");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Faculty" + "'", str8, "Faculty");
    }

    @Test
    public void test1922() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1922");
        com.reservation_system.model.Guest guest5 = new com.reservation_system.model.Guest(2, "Faculty", "guest", "student", false);
    }

    @Test
    public void test1923() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1923");
        com.reservation_system.model.HeadLabCoordinator headLabCoordinator5 = new com.reservation_system.model.HeadLabCoordinator(53, "", "Guest", "andrew@example.com", false);
        java.lang.String str6 = headLabCoordinator5.getUserType();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "headlabcoordinator" + "'", str6, "headlabcoordinator");
    }

    @Test
    public void test1924() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1924");
        com.reservation_system.model.Researcher researcher5 = new com.reservation_system.model.Researcher((-1), "labmanager", "Faculty", "faculty", true);
    }

    @Test
    public void test1925() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1925");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("demo/data/test-users.csv");
        java.util.Optional<com.reservation_system.model.User> userOptional3 = userRepository1.findByEmail("hi!");
        int int4 = userRepository1.getNextID();
        int int5 = userRepository1.getNextID();
        com.reservation_system.model.Researcher researcher11 = new com.reservation_system.model.Researcher((int) 'a', "student", "", "researcher", true);
        userRepository1.addUser((com.reservation_system.model.User) researcher11);
        boolean boolean13 = userRepository1.headLabCoordinatorExists();
        java.util.Optional<com.reservation_system.model.User> userOptional15 = userRepository1.findByEmail("Andrew");
        org.junit.Assert.assertNotNull(userOptional3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 101 + "'", int4 == 101);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 101 + "'", int5 == 101);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(userOptional15);
    }

    @Test
    public void test1926() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1926");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("demo/data/test-users.csv");
        java.util.List<com.reservation_system.model.User> userList2 = userRepository1.getAllUsers();
        com.reservation_system.services.RegistrationService registrationService3 = new com.reservation_system.services.RegistrationService(userRepository1);
        java.util.List<com.reservation_system.model.User> userList4 = userRepository1.getAllUsers();
        boolean boolean6 = userRepository1.emailExists("Guest");
        java.util.List<com.reservation_system.model.User> userList7 = userRepository1.getAllUsers();
        java.util.Optional<com.reservation_system.model.User> userOptional9 = userRepository1.findByEmail("Password1!");
        java.util.Optional<com.reservation_system.model.User> userOptional11 = userRepository1.findByEmail("Andrew");
        boolean boolean12 = userRepository1.headLabCoordinatorExists();
        com.reservation_system.services.RegistrationService registrationService13 = new com.reservation_system.services.RegistrationService(userRepository1);
        org.junit.Assert.assertNotNull(userList2);
        org.junit.Assert.assertNotNull(userList4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(userList7);
        org.junit.Assert.assertNotNull(userOptional9);
        org.junit.Assert.assertNotNull(userOptional11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test1927() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1927");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("demo/data/test-users.csv");
        boolean boolean2 = userRepository1.headLabCoordinatorExists();
        com.reservation_system.services.RegistrationService registrationService3 = new com.reservation_system.services.RegistrationService(userRepository1);
        boolean boolean5 = userRepository1.emailExists("");
        java.util.List<com.reservation_system.model.User> userList6 = userRepository1.getAllUsers();
        com.reservation_system.services.RegistrationService registrationService7 = new com.reservation_system.services.RegistrationService(userRepository1);
        com.reservation_system.model.LabManager labManager13 = new com.reservation_system.model.LabManager(0, "guest", "student", "faculty", false);
        userRepository1.addUser((com.reservation_system.model.User) labManager13);
        java.lang.String str15 = labManager13.getUserType();
        java.lang.String str16 = labManager13.getUserType();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(userList6);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "labmanager" + "'", str15, "labmanager");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "labmanager" + "'", str16, "labmanager");
    }

    @Test
    public void test1928() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1928");
        com.reservation_system.model.Student student5 = new com.reservation_system.model.Student(1, "", "demo/data/test-users.csv", "headlabcoordinator", true);
    }

    @Test
    public void test1929() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1929");
        com.reservation_system.model.Faculty faculty5 = new com.reservation_system.model.Faculty((int) ' ', "", "guest", "Andrew", false);
        java.lang.String str6 = faculty5.getUserType();
        java.lang.String str7 = faculty5.getUserType();
        java.lang.String str8 = faculty5.getUserType();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Faculty" + "'", str6, "Faculty");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Faculty" + "'", str7, "Faculty");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Faculty" + "'", str8, "Faculty");
    }

    @Test
    public void test1930() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1930");
        com.reservation_system.model.HeadLabCoordinator headLabCoordinator5 = new com.reservation_system.model.HeadLabCoordinator((int) (short) 0, "Student", "faculty", "Andrew", false);
    }

    @Test
    public void test1931() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1931");
        com.reservation_system.model.LabManager labManager5 = new com.reservation_system.model.LabManager(35, "headlabcoordinator", "andrew@example.com", "", true);
    }

    @Test
    public void test1932() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1932");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("demo/data/test-users.csv");
        int int2 = userRepository1.getNextID();
        com.reservation_system.model.Researcher researcher8 = new com.reservation_system.model.Researcher((int) (short) -1, "andrew@example.com", "guest", "labmanager", false);
        java.lang.String str9 = researcher8.getPassword();
        researcher8.setApproved(true);
        java.lang.String str12 = researcher8.getEmail();
        userRepository1.addUser((com.reservation_system.model.User) researcher8);
        com.reservation_system.repository.UserRepository userRepository15 = new com.reservation_system.repository.UserRepository("demo/data/test-users.csv");
        boolean boolean16 = userRepository15.headLabCoordinatorExists();
        com.reservation_system.services.RegistrationService registrationService17 = new com.reservation_system.services.RegistrationService(userRepository15);
        boolean boolean19 = userRepository15.emailExists("");
        java.util.List<com.reservation_system.model.User> userList20 = userRepository15.getAllUsers();
        com.reservation_system.repository.UserRepository userRepository22 = new com.reservation_system.repository.UserRepository("demo/data/test-users.csv");
        boolean boolean23 = userRepository22.headLabCoordinatorExists();
        com.reservation_system.repository.UserRepository userRepository25 = new com.reservation_system.repository.UserRepository("demo/data/test-users.csv");
        com.reservation_system.services.RegistrationService registrationService26 = new com.reservation_system.services.RegistrationService(userRepository25);
        com.reservation_system.model.Faculty faculty32 = new com.reservation_system.model.Faculty(0, "Password1!", "demo/data/test-users.csv", "researcher", false);
        java.lang.String str33 = faculty32.getName();
        userRepository25.addUser((com.reservation_system.model.User) faculty32);
        boolean boolean35 = userRepository25.headLabCoordinatorExists();
        com.reservation_system.model.Guest guest41 = new com.reservation_system.model.Guest((int) (byte) -1, "guest", "Researcher", "Faculty", true);
        userRepository25.addUser((com.reservation_system.model.User) guest41);
        boolean boolean43 = userRepository25.headLabCoordinatorExists();
        com.reservation_system.repository.UserRepository userRepository45 = new com.reservation_system.repository.UserRepository("demo/data/test-users.csv");
        com.reservation_system.services.RegistrationService registrationService46 = new com.reservation_system.services.RegistrationService(userRepository45);
        com.reservation_system.model.Faculty faculty52 = new com.reservation_system.model.Faculty(0, "Password1!", "demo/data/test-users.csv", "researcher", false);
        java.lang.String str53 = faculty52.getName();
        userRepository45.addUser((com.reservation_system.model.User) faculty52);
        boolean boolean55 = userRepository45.headLabCoordinatorExists();
        com.reservation_system.repository.UserRepository userRepository57 = new com.reservation_system.repository.UserRepository("demo/data/test-users.csv");
        com.reservation_system.services.RegistrationService registrationService58 = new com.reservation_system.services.RegistrationService(userRepository57);
        com.reservation_system.model.Faculty faculty64 = new com.reservation_system.model.Faculty(0, "Password1!", "demo/data/test-users.csv", "researcher", false);
        java.lang.String str65 = faculty64.getName();
        userRepository57.addUser((com.reservation_system.model.User) faculty64);
        java.util.List<com.reservation_system.model.User> userList67 = userRepository57.getAllUsers();
        userRepository45.saveAllUsers(userList67);
        userRepository25.saveAllUsers(userList67);
        userRepository22.saveAllUsers(userList67);
        userRepository15.saveAllUsers(userList67);
        userRepository1.saveAllUsers(userList67);
        int int73 = userRepository1.getNextID();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 101 + "'", int2 == 101);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "labmanager" + "'", str9, "labmanager");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "guest" + "'", str12, "guest");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNotNull(userList20);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "Password1!" + "'", str33, "Password1!");
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + true + "'", boolean43 == true);
        org.junit.Assert.assertEquals("'" + str53 + "' != '" + "Password1!" + "'", str53, "Password1!");
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + true + "'", boolean55 == true);
        org.junit.Assert.assertEquals("'" + str65 + "' != '" + "Password1!" + "'", str65, "Password1!");
        org.junit.Assert.assertNotNull(userList67);
        org.junit.Assert.assertTrue("'" + int73 + "' != '" + 101 + "'", int73 == 101);
    }

    @Test
    public void test1933() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1933");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("demo/data/test-users.csv");
        com.reservation_system.services.RegistrationService registrationService2 = new com.reservation_system.services.RegistrationService(userRepository1);
        com.reservation_system.model.Faculty faculty8 = new com.reservation_system.model.Faculty(0, "Password1!", "demo/data/test-users.csv", "researcher", false);
        java.lang.String str9 = faculty8.getName();
        userRepository1.addUser((com.reservation_system.model.User) faculty8);
        boolean boolean11 = userRepository1.headLabCoordinatorExists();
        int int12 = userRepository1.getNextID();
        boolean boolean13 = userRepository1.headLabCoordinatorExists();
        com.reservation_system.model.Guest guest19 = new com.reservation_system.model.Guest((int) '4', "researcher", "demo/data/test-users.csv", "andrew@example.com", false);
        userRepository1.addUser((com.reservation_system.model.User) guest19);
        int int21 = userRepository1.getNextID();
        java.util.List<com.reservation_system.model.User> userList22 = userRepository1.getAllUsers();
        java.util.Optional<com.reservation_system.model.User> userOptional24 = userRepository1.findByEmail("Student");
        com.reservation_system.repository.UserRepository userRepository26 = new com.reservation_system.repository.UserRepository("demo/data/test-users.csv");
        com.reservation_system.services.RegistrationService registrationService27 = new com.reservation_system.services.RegistrationService(userRepository26);
        com.reservation_system.model.Faculty faculty33 = new com.reservation_system.model.Faculty(0, "Password1!", "demo/data/test-users.csv", "researcher", false);
        java.lang.String str34 = faculty33.getName();
        userRepository26.addUser((com.reservation_system.model.User) faculty33);
        boolean boolean37 = userRepository26.emailExists("Faculty");
        int int38 = userRepository26.getNextID();
        java.util.Optional<com.reservation_system.model.User> userOptional40 = userRepository26.findByEmail("Andrew");
        java.util.List<com.reservation_system.model.User> userList41 = userRepository26.getAllUsers();
        userRepository1.saveAllUsers(userList41);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Password1!" + "'", str9, "Password1!");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 101 + "'", int12 == 101);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 101 + "'", int21 == 101);
        org.junit.Assert.assertNotNull(userList22);
        org.junit.Assert.assertNotNull(userOptional24);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "Password1!" + "'", str34, "Password1!");
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 101 + "'", int38 == 101);
        org.junit.Assert.assertNotNull(userOptional40);
        org.junit.Assert.assertNotNull(userList41);
    }

    @Test
    public void test1934() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1934");
        com.reservation_system.model.HeadLabCoordinator headLabCoordinator5 = new com.reservation_system.model.HeadLabCoordinator((-1), "", "Faculty", "Guest", false);
        java.lang.String str6 = headLabCoordinator5.getUserType();
        int int7 = headLabCoordinator5.getID();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "headlabcoordinator" + "'", str6, "headlabcoordinator");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
    }

    @Test
    public void test1935() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1935");
        com.reservation_system.model.Faculty faculty5 = new com.reservation_system.model.Faculty(36, "Student", "Password1!", "guest", true);
    }

    @Test
    public void test1936() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1936");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("demo/data/test-users.csv");
        com.reservation_system.services.RegistrationService registrationService2 = new com.reservation_system.services.RegistrationService(userRepository1);
        com.reservation_system.model.Faculty faculty8 = new com.reservation_system.model.Faculty(0, "Password1!", "demo/data/test-users.csv", "researcher", false);
        java.lang.String str9 = faculty8.getName();
        userRepository1.addUser((com.reservation_system.model.User) faculty8);
        boolean boolean11 = userRepository1.headLabCoordinatorExists();
        com.reservation_system.model.Guest guest17 = new com.reservation_system.model.Guest((int) (byte) -1, "guest", "Researcher", "Faculty", true);
        userRepository1.addUser((com.reservation_system.model.User) guest17);
        boolean boolean20 = userRepository1.emailExists("Password1!");
        boolean boolean22 = userRepository1.emailExists("hi!");
        int int23 = userRepository1.getNextID();
        int int24 = userRepository1.getNextID();
        boolean boolean26 = userRepository1.emailExists("Researcher");
        boolean boolean28 = userRepository1.emailExists("Researcher");
        com.reservation_system.repository.UserRepository userRepository30 = new com.reservation_system.repository.UserRepository("demo/data/test-users.csv");
        com.reservation_system.services.RegistrationService registrationService31 = new com.reservation_system.services.RegistrationService(userRepository30);
        com.reservation_system.services.RegistrationService registrationService32 = new com.reservation_system.services.RegistrationService(userRepository30);
        com.reservation_system.services.RegistrationService registrationService33 = new com.reservation_system.services.RegistrationService(userRepository30);
        com.reservation_system.repository.UserRepository userRepository35 = new com.reservation_system.repository.UserRepository("demo/data/test-users.csv");
        com.reservation_system.services.RegistrationService registrationService36 = new com.reservation_system.services.RegistrationService(userRepository35);
        com.reservation_system.model.Faculty faculty42 = new com.reservation_system.model.Faculty(0, "Password1!", "demo/data/test-users.csv", "researcher", false);
        java.lang.String str43 = faculty42.getName();
        userRepository35.addUser((com.reservation_system.model.User) faculty42);
        boolean boolean45 = userRepository35.headLabCoordinatorExists();
        com.reservation_system.model.Guest guest51 = new com.reservation_system.model.Guest((int) (byte) -1, "guest", "Researcher", "Faculty", true);
        userRepository35.addUser((com.reservation_system.model.User) guest51);
        java.util.List<com.reservation_system.model.User> userList53 = userRepository35.getAllUsers();
        userRepository30.saveAllUsers(userList53);
        com.reservation_system.repository.UserRepository userRepository56 = new com.reservation_system.repository.UserRepository("demo/data/test-users.csv");
        boolean boolean57 = userRepository56.headLabCoordinatorExists();
        com.reservation_system.repository.UserRepository userRepository59 = new com.reservation_system.repository.UserRepository("demo/data/test-users.csv");
        com.reservation_system.services.RegistrationService registrationService60 = new com.reservation_system.services.RegistrationService(userRepository59);
        com.reservation_system.model.Faculty faculty66 = new com.reservation_system.model.Faculty(0, "Password1!", "demo/data/test-users.csv", "researcher", false);
        java.lang.String str67 = faculty66.getName();
        userRepository59.addUser((com.reservation_system.model.User) faculty66);
        java.util.List<com.reservation_system.model.User> userList69 = userRepository59.getAllUsers();
        userRepository56.saveAllUsers(userList69);
        userRepository30.saveAllUsers(userList69);
        userRepository1.saveAllUsers(userList69);
        com.reservation_system.services.RegistrationService registrationService73 = new com.reservation_system.services.RegistrationService(userRepository1);
        java.util.Optional<com.reservation_system.model.User> userOptional75 = userRepository1.findByEmail("Faculty");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Password1!" + "'", str9, "Password1!");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 101 + "'", int23 == 101);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 101 + "'", int24 == 101);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "Password1!" + "'", str43, "Password1!");
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + true + "'", boolean45 == true);
        org.junit.Assert.assertNotNull(userList53);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + true + "'", boolean57 == true);
        org.junit.Assert.assertEquals("'" + str67 + "' != '" + "Password1!" + "'", str67, "Password1!");
        org.junit.Assert.assertNotNull(userList69);
        org.junit.Assert.assertNotNull(userOptional75);
    }

    @Test
    public void test1937() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1937");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("demo/data/test-users.csv");
        java.util.List<com.reservation_system.model.User> userList2 = userRepository1.getAllUsers();
        com.reservation_system.services.RegistrationService registrationService3 = new com.reservation_system.services.RegistrationService(userRepository1);
        java.util.List<com.reservation_system.model.User> userList4 = userRepository1.getAllUsers();
        boolean boolean6 = userRepository1.emailExists("Guest");
        com.reservation_system.model.HeadLabCoordinator headLabCoordinator12 = new com.reservation_system.model.HeadLabCoordinator((int) (byte) -1, "", "", "Faculty", true);
        userRepository1.addUser((com.reservation_system.model.User) headLabCoordinator12);
        com.reservation_system.model.Faculty faculty19 = new com.reservation_system.model.Faculty(102, "Student", "hi!", "Password1!", false);
        java.lang.String str20 = faculty19.getPassword();
        int int21 = faculty19.getID();
        userRepository1.addUser((com.reservation_system.model.User) faculty19);
        org.junit.Assert.assertNotNull(userList2);
        org.junit.Assert.assertNotNull(userList4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "Password1!" + "'", str20, "Password1!");
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 102 + "'", int21 == 102);
    }

    @Test
    public void test1938() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1938");
        com.reservation_system.model.User user6 = com.reservation_system.patterns.factory.UserFactory.createUser("guest", (int) (short) -1, "labmanager", "Guest", "researcher", true);
        org.junit.Assert.assertNotNull(user6);
    }

    @Test
    public void test1939() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1939");
        com.reservation_system.model.Student student5 = new com.reservation_system.model.Student(0, "", "Password1!", "Andrew", true);
    }

    @Test
    public void test1940() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1940");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("demo/data/test-users.csv");
        boolean boolean2 = userRepository1.headLabCoordinatorExists();
        com.reservation_system.services.RegistrationService registrationService3 = new com.reservation_system.services.RegistrationService(userRepository1);
        boolean boolean5 = userRepository1.emailExists("");
        boolean boolean6 = userRepository1.headLabCoordinatorExists();
        java.util.List<com.reservation_system.model.User> userList7 = userRepository1.getAllUsers();
        boolean boolean9 = userRepository1.emailExists("faculty");
        java.util.List<com.reservation_system.model.User> userList10 = userRepository1.getAllUsers();
        java.lang.Class<?> wildcardClass11 = userRepository1.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(userList7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(userList10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test1941() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1941");
        com.reservation_system.model.Student student5 = new com.reservation_system.model.Student((int) '4', "Student", "student", "guest", true);
        java.lang.String str6 = student5.getEmail();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "student" + "'", str6, "student");
    }

    @Test
    public void test1942() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1942");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("demo/data/test-users.csv");
        com.reservation_system.services.RegistrationService registrationService2 = new com.reservation_system.services.RegistrationService(userRepository1);
        int int3 = userRepository1.getNextID();
        boolean boolean5 = userRepository1.emailExists("Andrew");
        com.reservation_system.model.Researcher researcher11 = new com.reservation_system.model.Researcher((int) (short) -1, "faculty", "researcher", "hi!", true);
        java.lang.String str12 = researcher11.getUserType();
        int int13 = researcher11.getID();
        java.lang.String str14 = researcher11.getUserType();
        userRepository1.addUser((com.reservation_system.model.User) researcher11);
        java.util.List<com.reservation_system.model.User> userList16 = userRepository1.getAllUsers();
        com.reservation_system.model.Student student22 = new com.reservation_system.model.Student((int) (short) 1, "labmanager", "", "", true);
        java.lang.String str23 = student22.getUserType();
        java.lang.String str24 = student22.getEmail();
        int int25 = student22.getID();
        userRepository1.addUser((com.reservation_system.model.User) student22);
        com.reservation_system.repository.UserRepository userRepository28 = new com.reservation_system.repository.UserRepository("demo/data/test-users.csv");
        java.util.Optional<com.reservation_system.model.User> userOptional30 = userRepository28.findByEmail("hi!");
        java.util.List<com.reservation_system.model.User> userList31 = userRepository28.getAllUsers();
        userRepository1.saveAllUsers(userList31);
        java.util.Optional<com.reservation_system.model.User> userOptional34 = userRepository1.findByEmail("Guest");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 103 + "'", int3 == 103);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Researcher" + "'", str12, "Researcher");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Researcher" + "'", str14, "Researcher");
        org.junit.Assert.assertNotNull(userList16);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "Student" + "'", str23, "Student");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 1 + "'", int25 == 1);
        org.junit.Assert.assertNotNull(userOptional30);
        org.junit.Assert.assertNotNull(userList31);
        org.junit.Assert.assertNotNull(userOptional34);
    }

    @Test
    public void test1943() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1943");
        com.reservation_system.model.HeadLabCoordinator headLabCoordinator5 = new com.reservation_system.model.HeadLabCoordinator((int) 'a', "guest", "", "andrew@example.com", true);
        boolean boolean6 = headLabCoordinator5.isApproved();
        java.lang.String str7 = headLabCoordinator5.getUserType();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "headlabcoordinator" + "'", str7, "headlabcoordinator");
    }

    @Test
    public void test1944() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1944");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("demo/data/test-users.csv");
        com.reservation_system.services.RegistrationService registrationService2 = new com.reservation_system.services.RegistrationService(userRepository1);
        com.reservation_system.model.Faculty faculty8 = new com.reservation_system.model.Faculty(0, "Password1!", "demo/data/test-users.csv", "researcher", false);
        java.lang.String str9 = faculty8.getName();
        userRepository1.addUser((com.reservation_system.model.User) faculty8);
        boolean boolean12 = userRepository1.emailExists("Faculty");
        int int13 = userRepository1.getNextID();
        com.reservation_system.model.Researcher researcher19 = new com.reservation_system.model.Researcher((int) (byte) 10, "", "hi!", "headlabcoordinator", true);
        userRepository1.addUser((com.reservation_system.model.User) researcher19);
        com.reservation_system.repository.UserRepository userRepository22 = new com.reservation_system.repository.UserRepository("demo/data/test-users.csv");
        boolean boolean23 = userRepository22.headLabCoordinatorExists();
        com.reservation_system.services.RegistrationService registrationService24 = new com.reservation_system.services.RegistrationService(userRepository22);
        boolean boolean26 = userRepository22.emailExists("");
        boolean boolean27 = userRepository22.headLabCoordinatorExists();
        java.util.List<com.reservation_system.model.User> userList28 = userRepository22.getAllUsers();
        int int29 = userRepository22.getNextID();
        com.reservation_system.repository.UserRepository userRepository31 = new com.reservation_system.repository.UserRepository("demo/data/test-users.csv");
        java.util.Optional<com.reservation_system.model.User> userOptional33 = userRepository31.findByEmail("hi!");
        boolean boolean35 = userRepository31.emailExists("Faculty");
        com.reservation_system.model.Faculty faculty41 = new com.reservation_system.model.Faculty((int) (byte) 1, "guest", "", "headlabcoordinator", false);
        boolean boolean42 = faculty41.requiresDepartmentApproval();
        userRepository31.addUser((com.reservation_system.model.User) faculty41);
        userRepository22.addUser((com.reservation_system.model.User) faculty41);
        com.reservation_system.repository.UserRepository userRepository46 = new com.reservation_system.repository.UserRepository("demo/data/test-users.csv");
        int int47 = userRepository46.getNextID();
        int int48 = userRepository46.getNextID();
        boolean boolean50 = userRepository46.emailExists("faculty");
        com.reservation_system.model.LabManager labManager56 = new com.reservation_system.model.LabManager((int) (short) 0, "", "labmanager", "Password1!", true);
        userRepository46.addUser((com.reservation_system.model.User) labManager56);
        java.util.Optional<com.reservation_system.model.User> userOptional59 = userRepository46.findByEmail("");
        com.reservation_system.model.Researcher researcher65 = new com.reservation_system.model.Researcher((int) (byte) 100, "Password1!", "Password1!", "headlabcoordinator", true);
        userRepository46.addUser((com.reservation_system.model.User) researcher65);
        java.util.List<com.reservation_system.model.User> userList67 = userRepository46.getAllUsers();
        com.reservation_system.model.Researcher researcher73 = new com.reservation_system.model.Researcher((int) (short) -1, "headlabcoordinator", "Guest", "student", false);
        userRepository46.addUser((com.reservation_system.model.User) researcher73);
        java.util.List<com.reservation_system.model.User> userList75 = userRepository46.getAllUsers();
        userRepository22.saveAllUsers(userList75);
        userRepository1.saveAllUsers(userList75);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Password1!" + "'", str9, "Password1!");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 103 + "'", int13 == 103);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertNotNull(userList28);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 103 + "'", int29 == 103);
        org.junit.Assert.assertNotNull(userOptional33);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + true + "'", boolean42 == true);
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + 103 + "'", int47 == 103);
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 103 + "'", int48 == 103);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertNotNull(userOptional59);
        org.junit.Assert.assertNotNull(userList67);
        org.junit.Assert.assertNotNull(userList75);
    }

    @Test
    public void test1945() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1945");
        com.reservation_system.model.User user6 = com.reservation_system.patterns.factory.UserFactory.createUser("faculty", (int) (byte) 100, "Student", "labmanager", "Guest", true);
        org.junit.Assert.assertNotNull(user6);
    }

    @Test
    public void test1946() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1946");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("demo/data/test-users.csv");
        int int2 = userRepository1.getNextID();
        int int3 = userRepository1.getNextID();
        boolean boolean5 = userRepository1.emailExists("faculty");
        com.reservation_system.model.LabManager labManager11 = new com.reservation_system.model.LabManager((int) (short) 0, "", "labmanager", "Password1!", true);
        userRepository1.addUser((com.reservation_system.model.User) labManager11);
        java.util.List<com.reservation_system.model.User> userList13 = userRepository1.getAllUsers();
        boolean boolean14 = userRepository1.headLabCoordinatorExists();
        com.reservation_system.services.RegistrationService registrationService15 = new com.reservation_system.services.RegistrationService(userRepository1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 103 + "'", int2 == 103);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 103 + "'", int3 == 103);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(userList13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test1947() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1947");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("demo/data/test-users.csv");
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
        com.reservation_system.repository.UserRepository userRepository31 = new com.reservation_system.repository.UserRepository("demo/data/test-users.csv");
        com.reservation_system.services.RegistrationService registrationService32 = new com.reservation_system.services.RegistrationService(userRepository31);
        com.reservation_system.model.Faculty faculty38 = new com.reservation_system.model.Faculty(0, "Password1!", "demo/data/test-users.csv", "researcher", false);
        java.lang.String str39 = faculty38.getName();
        userRepository31.addUser((com.reservation_system.model.User) faculty38);
        boolean boolean41 = userRepository31.headLabCoordinatorExists();
        com.reservation_system.services.RegistrationService registrationService42 = new com.reservation_system.services.RegistrationService(userRepository31);
        java.util.List<com.reservation_system.model.User> userList43 = userRepository31.getAllUsers();
        userRepository1.saveAllUsers(userList43);
        com.reservation_system.model.Guest guest50 = new com.reservation_system.model.Guest((int) ' ', "student", "Password1!", "Researcher", true);
        userRepository1.addUser((com.reservation_system.model.User) guest50);
        com.reservation_system.services.RegistrationService registrationService52 = new com.reservation_system.services.RegistrationService(userRepository1);
        // The following exception was thrown during execution in test generation
        try {
            com.reservation_system.model.User user57 = registrationService52.registerUser("Guest", "demo/data/test-users.csv", "Password1!", "Faculty");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid email format.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 103 + "'", int2 == 103);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 103 + "'", int3 == 103);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(userOptional14);
        org.junit.Assert.assertNotNull(userList22);
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "Password1!" + "'", str39, "Password1!");
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + true + "'", boolean41 == true);
        org.junit.Assert.assertNotNull(userList43);
    }

    @Test
    public void test1948() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1948");
        com.reservation_system.model.Researcher researcher5 = new com.reservation_system.model.Researcher((int) (short) 100, "Faculty", "demo/data/test-users.csv", "Student", false);
    }

    @Test
    public void test1949() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1949");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("demo/data/test-users.csv");
        java.util.Optional<com.reservation_system.model.User> userOptional3 = userRepository1.findByEmail("hi!");
        int int4 = userRepository1.getNextID();
        int int5 = userRepository1.getNextID();
        com.reservation_system.model.Researcher researcher11 = new com.reservation_system.model.Researcher((int) 'a', "student", "", "researcher", true);
        userRepository1.addUser((com.reservation_system.model.User) researcher11);
        com.reservation_system.model.Student student18 = new com.reservation_system.model.Student((int) '#', "labmanager", "demo/data/test-users.csv", "labmanager", false);
        userRepository1.addUser((com.reservation_system.model.User) student18);
        boolean boolean21 = userRepository1.emailExists("Researcher");
        java.util.Optional<com.reservation_system.model.User> userOptional23 = userRepository1.findByEmail("");
        java.util.List<com.reservation_system.model.User> userList24 = userRepository1.getAllUsers();
        boolean boolean26 = userRepository1.emailExists("");
        java.util.Optional<com.reservation_system.model.User> userOptional28 = userRepository1.findByEmail("andrew@example.com");
        org.junit.Assert.assertNotNull(userOptional3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 103 + "'", int4 == 103);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 103 + "'", int5 == 103);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertNotNull(userOptional23);
        org.junit.Assert.assertNotNull(userList24);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertNotNull(userOptional28);
    }

    @Test
    public void test1950() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1950");
        com.reservation_system.model.LabManager labManager5 = new com.reservation_system.model.LabManager((-1), "Researcher", "Andrew", "Faculty", true);
    }

    @Test
    public void test1951() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1951");
        com.reservation_system.model.Guest guest5 = new com.reservation_system.model.Guest((int) (byte) 0, "andrew@example.com", "Researcher", "guest", true);
    }

    @Test
    public void test1952() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1952");
        com.reservation_system.model.Student student5 = new com.reservation_system.model.Student((int) (byte) 0, "student", "Researcher", "andrew@example.com", true);
    }

    @Test
    public void test1953() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1953");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("demo/data/test-users.csv");
        boolean boolean2 = userRepository1.headLabCoordinatorExists();
        com.reservation_system.services.RegistrationService registrationService3 = new com.reservation_system.services.RegistrationService(userRepository1);
        boolean boolean4 = userRepository1.headLabCoordinatorExists();
        boolean boolean6 = userRepository1.emailExists("Andrew");
        com.reservation_system.services.RegistrationService registrationService7 = new com.reservation_system.services.RegistrationService(userRepository1);
        com.reservation_system.repository.UserRepository userRepository9 = new com.reservation_system.repository.UserRepository("demo/data/test-users.csv");
        com.reservation_system.services.RegistrationService registrationService10 = new com.reservation_system.services.RegistrationService(userRepository9);
        com.reservation_system.model.Faculty faculty16 = new com.reservation_system.model.Faculty(0, "Password1!", "demo/data/test-users.csv", "researcher", false);
        java.lang.String str17 = faculty16.getName();
        userRepository9.addUser((com.reservation_system.model.User) faculty16);
        boolean boolean19 = userRepository9.headLabCoordinatorExists();
        com.reservation_system.model.Guest guest25 = new com.reservation_system.model.Guest((int) (byte) -1, "guest", "Researcher", "Faculty", true);
        userRepository9.addUser((com.reservation_system.model.User) guest25);
        java.util.List<com.reservation_system.model.User> userList27 = userRepository9.getAllUsers();
        userRepository1.saveAllUsers(userList27);
        boolean boolean29 = userRepository1.headLabCoordinatorExists();
        java.util.Optional<com.reservation_system.model.User> userOptional31 = userRepository1.findByEmail("student");
        int int32 = userRepository1.getNextID();
        java.util.List<com.reservation_system.model.User> userList33 = userRepository1.getAllUsers();
        boolean boolean35 = userRepository1.emailExists("hi!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "Password1!" + "'", str17, "Password1!");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNotNull(userList27);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertNotNull(userOptional31);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 103 + "'", int32 == 103);
        org.junit.Assert.assertNotNull(userList33);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
    }

    @Test
    public void test1954() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1954");
        com.reservation_system.model.LabManager labManager5 = new com.reservation_system.model.LabManager(101, "demo/data/test-users.csv", "demo/data/test-users.csv", "demo/data/test-users.csv", false);
        java.lang.String str6 = labManager5.getUserType();
        java.lang.String str7 = labManager5.getUserType();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "labmanager" + "'", str6, "labmanager");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "labmanager" + "'", str7, "labmanager");
    }

    @Test
    public void test1955() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1955");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("demo/data/test-users.csv");
        com.reservation_system.services.RegistrationService registrationService2 = new com.reservation_system.services.RegistrationService(userRepository1);
        com.reservation_system.model.Faculty faculty8 = new com.reservation_system.model.Faculty(0, "Password1!", "demo/data/test-users.csv", "researcher", false);
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
            com.reservation_system.model.User user27 = registrationService22.registerUser("guest", "", "Faculty", "headlabcoordinator");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Name is required.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Password1!" + "'", str9, "Password1!");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 103 + "'", int13 == 103);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "Researcher" + "'", str20, "Researcher");
    }

    @Test
    public void test1956() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1956");
        com.reservation_system.model.Guest guest5 = new com.reservation_system.model.Guest(10, "researcher", "andrew@example.com", "student", true);
    }

    @Test
    public void test1957() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1957");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("demo/data/test-users.csv");
        java.util.List<com.reservation_system.model.User> userList2 = userRepository1.getAllUsers();
        com.reservation_system.services.RegistrationService registrationService3 = new com.reservation_system.services.RegistrationService(userRepository1);
        com.reservation_system.services.RegistrationService registrationService4 = new com.reservation_system.services.RegistrationService(userRepository1);
        java.util.List<com.reservation_system.model.User> userList5 = userRepository1.getAllUsers();
        java.util.List<com.reservation_system.model.User> userList6 = userRepository1.getAllUsers();
        int int7 = userRepository1.getNextID();
        java.util.List<com.reservation_system.model.User> userList8 = userRepository1.getAllUsers();
        com.reservation_system.model.Guest guest14 = new com.reservation_system.model.Guest(10, "labmanager", "demo/data/test-users.csv", "Faculty", true);
        userRepository1.addUser((com.reservation_system.model.User) guest14);
        com.reservation_system.services.RegistrationService registrationService16 = new com.reservation_system.services.RegistrationService(userRepository1);
        org.junit.Assert.assertNotNull(userList2);
        org.junit.Assert.assertNotNull(userList5);
        org.junit.Assert.assertNotNull(userList6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 103 + "'", int7 == 103);
        org.junit.Assert.assertNotNull(userList8);
    }

    @Test
    public void test1958() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1958");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("demo/data/test-users.csv");
        java.util.List<com.reservation_system.model.User> userList2 = userRepository1.getAllUsers();
        com.reservation_system.services.RegistrationService registrationService3 = new com.reservation_system.services.RegistrationService(userRepository1);
        java.util.List<com.reservation_system.model.User> userList4 = userRepository1.getAllUsers();
        boolean boolean6 = userRepository1.emailExists("Guest");
        java.util.List<com.reservation_system.model.User> userList7 = userRepository1.getAllUsers();
        java.util.Optional<com.reservation_system.model.User> userOptional9 = userRepository1.findByEmail("Password1!");
        com.reservation_system.repository.UserRepository userRepository11 = new com.reservation_system.repository.UserRepository("demo/data/test-users.csv");
        com.reservation_system.services.RegistrationService registrationService12 = new com.reservation_system.services.RegistrationService(userRepository11);
        com.reservation_system.model.Faculty faculty18 = new com.reservation_system.model.Faculty(0, "Password1!", "demo/data/test-users.csv", "researcher", false);
        java.lang.String str19 = faculty18.getName();
        userRepository11.addUser((com.reservation_system.model.User) faculty18);
        boolean boolean21 = userRepository11.headLabCoordinatorExists();
        int int22 = userRepository11.getNextID();
        com.reservation_system.repository.UserRepository userRepository24 = new com.reservation_system.repository.UserRepository("demo/data/test-users.csv");
        java.util.List<com.reservation_system.model.User> userList25 = userRepository24.getAllUsers();
        com.reservation_system.services.RegistrationService registrationService26 = new com.reservation_system.services.RegistrationService(userRepository24);
        java.util.List<com.reservation_system.model.User> userList27 = userRepository24.getAllUsers();
        userRepository11.saveAllUsers(userList27);
        userRepository1.saveAllUsers(userList27);
        java.util.List<com.reservation_system.model.User> userList30 = userRepository1.getAllUsers();
        com.reservation_system.services.RegistrationService registrationService31 = new com.reservation_system.services.RegistrationService(userRepository1);
        // The following exception was thrown during execution in test generation
        try {
            com.reservation_system.model.User user36 = registrationService31.registerUser("Andrew", "researcher", "Password1!", "andrew@example.com");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid user type.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(userList2);
        org.junit.Assert.assertNotNull(userList4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(userList7);
        org.junit.Assert.assertNotNull(userOptional9);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "Password1!" + "'", str19, "Password1!");
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 103 + "'", int22 == 103);
        org.junit.Assert.assertNotNull(userList25);
        org.junit.Assert.assertNotNull(userList27);
        org.junit.Assert.assertNotNull(userList30);
    }

    @Test
    public void test1959() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1959");
        com.reservation_system.model.Guest guest5 = new com.reservation_system.model.Guest((int) ' ', "student", "Password1!", "Researcher", true);
        int int6 = guest5.getID();
        java.lang.String str7 = guest5.getUserType();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 32 + "'", int6 == 32);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Guest" + "'", str7, "Guest");
    }

    @Test
    public void test1960() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1960");
        com.reservation_system.model.LabManager labManager5 = new com.reservation_system.model.LabManager((int) '#', "headlabcoordinator", "", "Guest", true);
        java.lang.String str6 = labManager5.getPassword();
        labManager5.setApproved(false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Guest" + "'", str6, "Guest");
    }

    @Test
    public void test1961() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1961");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("demo/data/test-users.csv");
        int int2 = userRepository1.getNextID();
        int int3 = userRepository1.getNextID();
        boolean boolean5 = userRepository1.emailExists("faculty");
        com.reservation_system.model.LabManager labManager11 = new com.reservation_system.model.LabManager((int) (short) 0, "", "labmanager", "Password1!", true);
        userRepository1.addUser((com.reservation_system.model.User) labManager11);
        labManager11.setApproved(true);
        java.lang.String str15 = labManager11.getUserType();
        labManager11.setApproved(false);
        java.lang.String str18 = labManager11.getUserType();
        java.lang.Class<?> wildcardClass19 = labManager11.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 103 + "'", int2 == 103);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 103 + "'", int3 == 103);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "labmanager" + "'", str15, "labmanager");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "labmanager" + "'", str18, "labmanager");
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test1962() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1962");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("demo/data/test-users.csv");
        com.reservation_system.services.RegistrationService registrationService2 = new com.reservation_system.services.RegistrationService(userRepository1);
        com.reservation_system.model.Researcher researcher8 = new com.reservation_system.model.Researcher((int) (short) 1, "Password1!", "headlabcoordinator", "", false);
        userRepository1.addUser((com.reservation_system.model.User) researcher8);
        java.util.Optional<com.reservation_system.model.User> userOptional11 = userRepository1.findByEmail("researcher");
        java.lang.Class<?> wildcardClass12 = userRepository1.getClass();
        org.junit.Assert.assertNotNull(userOptional11);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test1963() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1963");
        com.reservation_system.model.LabManager labManager5 = new com.reservation_system.model.LabManager((int) (short) 10, "hi!", "Faculty", "guest", true);
        java.lang.String str6 = labManager5.getName();
        java.lang.String str7 = labManager5.getUserType();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "labmanager" + "'", str7, "labmanager");
    }

    @Test
    public void test1964() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1964");
        com.reservation_system.model.HeadLabCoordinator headLabCoordinator5 = new com.reservation_system.model.HeadLabCoordinator(102, "researcher", "andrew@example.com", "Guest", true);
    }

    @Test
    public void test1965() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1965");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("demo/data/test-users.csv");
        boolean boolean2 = userRepository1.headLabCoordinatorExists();
        com.reservation_system.services.RegistrationService registrationService3 = new com.reservation_system.services.RegistrationService(userRepository1);
        boolean boolean4 = userRepository1.headLabCoordinatorExists();
        boolean boolean6 = userRepository1.emailExists("Andrew");
        com.reservation_system.services.RegistrationService registrationService7 = new com.reservation_system.services.RegistrationService(userRepository1);
        com.reservation_system.repository.UserRepository userRepository9 = new com.reservation_system.repository.UserRepository("demo/data/test-users.csv");
        com.reservation_system.services.RegistrationService registrationService10 = new com.reservation_system.services.RegistrationService(userRepository9);
        com.reservation_system.model.Faculty faculty16 = new com.reservation_system.model.Faculty(0, "Password1!", "demo/data/test-users.csv", "researcher", false);
        java.lang.String str17 = faculty16.getName();
        userRepository9.addUser((com.reservation_system.model.User) faculty16);
        boolean boolean19 = userRepository9.headLabCoordinatorExists();
        com.reservation_system.model.Guest guest25 = new com.reservation_system.model.Guest((int) (byte) -1, "guest", "Researcher", "Faculty", true);
        userRepository9.addUser((com.reservation_system.model.User) guest25);
        java.util.List<com.reservation_system.model.User> userList27 = userRepository9.getAllUsers();
        userRepository1.saveAllUsers(userList27);
        com.reservation_system.repository.UserRepository userRepository30 = new com.reservation_system.repository.UserRepository("demo/data/test-users.csv");
        com.reservation_system.services.RegistrationService registrationService31 = new com.reservation_system.services.RegistrationService(userRepository30);
        com.reservation_system.model.Faculty faculty37 = new com.reservation_system.model.Faculty(0, "Password1!", "demo/data/test-users.csv", "researcher", false);
        java.lang.String str38 = faculty37.getName();
        userRepository30.addUser((com.reservation_system.model.User) faculty37);
        boolean boolean40 = userRepository30.headLabCoordinatorExists();
        int int41 = userRepository30.getNextID();
        com.reservation_system.repository.UserRepository userRepository43 = new com.reservation_system.repository.UserRepository("demo/data/test-users.csv");
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
        java.lang.String str61 = faculty56.getUserType();
        faculty56.setApproved(false);
        java.lang.String str64 = faculty56.getUserType();
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
        org.junit.Assert.assertEquals("'" + str61 + "' != '" + "Faculty" + "'", str61, "Faculty");
        org.junit.Assert.assertEquals("'" + str64 + "' != '" + "Faculty" + "'", str64, "Faculty");
    }

    @Test
    public void test1966() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1966");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("demo/data/test-users.csv");
        int int2 = userRepository1.getNextID();
        com.reservation_system.model.Researcher researcher8 = new com.reservation_system.model.Researcher((int) (short) -1, "andrew@example.com", "guest", "labmanager", false);
        java.lang.String str9 = researcher8.getPassword();
        researcher8.setApproved(true);
        java.lang.String str12 = researcher8.getEmail();
        userRepository1.addUser((com.reservation_system.model.User) researcher8);
        com.reservation_system.model.Faculty faculty19 = new com.reservation_system.model.Faculty(0, "Password1!", "demo/data/test-users.csv", "researcher", false);
        java.lang.String str20 = faculty19.getName();
        java.lang.String str21 = faculty19.getName();
        java.lang.String str22 = faculty19.getName();
        java.lang.String str23 = faculty19.getEmail();
        userRepository1.addUser((com.reservation_system.model.User) faculty19);
        com.reservation_system.services.RegistrationService registrationService25 = new com.reservation_system.services.RegistrationService(userRepository1);
        // The following exception was thrown during execution in test generation
        try {
            com.reservation_system.model.User user30 = registrationService25.registerUser("student", "headlabcoordinator", "demo/data/test-users.csv", "student");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid email format.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 103 + "'", int2 == 103);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "labmanager" + "'", str9, "labmanager");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "guest" + "'", str12, "guest");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "Password1!" + "'", str20, "Password1!");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "Password1!" + "'", str21, "Password1!");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "Password1!" + "'", str22, "Password1!");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "demo/data/test-users.csv" + "'", str23, "demo/data/test-users.csv");
    }

    @Test
    public void test1967() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1967");
        com.reservation_system.model.Student student5 = new com.reservation_system.model.Student(1, "Guest", "guest", "Andrew", false);
    }

    @Test
    public void test1968() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1968");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("demo/data/test-users.csv");
        boolean boolean2 = userRepository1.headLabCoordinatorExists();
        com.reservation_system.services.RegistrationService registrationService3 = new com.reservation_system.services.RegistrationService(userRepository1);
        boolean boolean4 = userRepository1.headLabCoordinatorExists();
        boolean boolean6 = userRepository1.emailExists("Andrew");
        com.reservation_system.services.RegistrationService registrationService7 = new com.reservation_system.services.RegistrationService(userRepository1);
        com.reservation_system.repository.UserRepository userRepository9 = new com.reservation_system.repository.UserRepository("demo/data/test-users.csv");
        com.reservation_system.services.RegistrationService registrationService10 = new com.reservation_system.services.RegistrationService(userRepository9);
        com.reservation_system.model.Faculty faculty16 = new com.reservation_system.model.Faculty(0, "Password1!", "demo/data/test-users.csv", "researcher", false);
        java.lang.String str17 = faculty16.getName();
        userRepository9.addUser((com.reservation_system.model.User) faculty16);
        boolean boolean19 = userRepository9.headLabCoordinatorExists();
        com.reservation_system.model.Guest guest25 = new com.reservation_system.model.Guest((int) (byte) -1, "guest", "Researcher", "Faculty", true);
        userRepository9.addUser((com.reservation_system.model.User) guest25);
        java.util.List<com.reservation_system.model.User> userList27 = userRepository9.getAllUsers();
        userRepository1.saveAllUsers(userList27);
        com.reservation_system.repository.UserRepository userRepository30 = new com.reservation_system.repository.UserRepository("demo/data/test-users.csv");
        com.reservation_system.services.RegistrationService registrationService31 = new com.reservation_system.services.RegistrationService(userRepository30);
        com.reservation_system.model.Faculty faculty37 = new com.reservation_system.model.Faculty(0, "Password1!", "demo/data/test-users.csv", "researcher", false);
        java.lang.String str38 = faculty37.getName();
        userRepository30.addUser((com.reservation_system.model.User) faculty37);
        boolean boolean40 = userRepository30.headLabCoordinatorExists();
        int int41 = userRepository30.getNextID();
        com.reservation_system.repository.UserRepository userRepository43 = new com.reservation_system.repository.UserRepository("demo/data/test-users.csv");
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
        boolean boolean60 = faculty56.isApproved();
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
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + false + "'", boolean60 == false);
    }

    @Test
    public void test1969() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1969");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("demo/data/test-users.csv");
        com.reservation_system.services.RegistrationService registrationService2 = new com.reservation_system.services.RegistrationService(userRepository1);
        com.reservation_system.model.Faculty faculty8 = new com.reservation_system.model.Faculty(0, "Password1!", "demo/data/test-users.csv", "researcher", false);
        java.lang.String str9 = faculty8.getName();
        userRepository1.addUser((com.reservation_system.model.User) faculty8);
        boolean boolean11 = userRepository1.headLabCoordinatorExists();
        com.reservation_system.model.Guest guest17 = new com.reservation_system.model.Guest((int) (byte) -1, "guest", "Researcher", "Faculty", true);
        userRepository1.addUser((com.reservation_system.model.User) guest17);
        java.lang.String str19 = guest17.getUserType();
        guest17.setApproved(true);
        java.lang.String str22 = guest17.getUserType();
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Password1!" + "'", str9, "Password1!");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "Guest" + "'", str19, "Guest");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "Guest" + "'", str22, "Guest");
    }

    @Test
    public void test1970() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1970");
        com.reservation_system.model.Guest guest5 = new com.reservation_system.model.Guest((-1), "Student", "andrew@example.com", "faculty", false);
        java.lang.String str6 = guest5.getUserType();
        java.lang.String str7 = guest5.getEmail();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Guest" + "'", str6, "Guest");
    }

    @Test
    public void test1971() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1971");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("demo/data/test-users.csv");
        java.util.Optional<com.reservation_system.model.User> userOptional3 = userRepository1.findByEmail("hi!");
        int int4 = userRepository1.getNextID();
        int int5 = userRepository1.getNextID();
        com.reservation_system.model.Researcher researcher11 = new com.reservation_system.model.Researcher((int) 'a', "student", "", "researcher", true);
        userRepository1.addUser((com.reservation_system.model.User) researcher11);
        com.reservation_system.model.Student student18 = new com.reservation_system.model.Student((int) '#', "labmanager", "demo/data/test-users.csv", "labmanager", false);
        userRepository1.addUser((com.reservation_system.model.User) student18);
        boolean boolean21 = userRepository1.emailExists("Researcher");
        java.util.List<com.reservation_system.model.User> userList22 = userRepository1.getAllUsers();
        org.junit.Assert.assertNotNull(userOptional3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 103 + "'", int4 == 103);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 103 + "'", int5 == 103);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertNotNull(userList22);
    }

    @Test
    public void test1972() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1972");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("demo/data/test-users.csv");
        boolean boolean2 = userRepository1.headLabCoordinatorExists();
        com.reservation_system.services.RegistrationService registrationService3 = new com.reservation_system.services.RegistrationService(userRepository1);
        boolean boolean4 = userRepository1.headLabCoordinatorExists();
        boolean boolean6 = userRepository1.emailExists("Andrew");
        com.reservation_system.services.RegistrationService registrationService7 = new com.reservation_system.services.RegistrationService(userRepository1);
        java.util.Optional<com.reservation_system.model.User> userOptional9 = userRepository1.findByEmail("faculty");
        com.reservation_system.services.RegistrationService registrationService10 = new com.reservation_system.services.RegistrationService(userRepository1);
        com.reservation_system.repository.UserRepository userRepository12 = new com.reservation_system.repository.UserRepository("demo/data/test-users.csv");
        com.reservation_system.services.RegistrationService registrationService13 = new com.reservation_system.services.RegistrationService(userRepository12);
        com.reservation_system.model.Faculty faculty19 = new com.reservation_system.model.Faculty(0, "Password1!", "demo/data/test-users.csv", "researcher", false);
        java.lang.String str20 = faculty19.getName();
        userRepository12.addUser((com.reservation_system.model.User) faculty19);
        boolean boolean22 = userRepository12.headLabCoordinatorExists();
        com.reservation_system.model.Guest guest28 = new com.reservation_system.model.Guest((int) (byte) -1, "guest", "Researcher", "Faculty", true);
        userRepository12.addUser((com.reservation_system.model.User) guest28);
        boolean boolean31 = userRepository12.emailExists("Password1!");
        com.reservation_system.repository.UserRepository userRepository33 = new com.reservation_system.repository.UserRepository("demo/data/test-users.csv");
        com.reservation_system.services.RegistrationService registrationService34 = new com.reservation_system.services.RegistrationService(userRepository33);
        com.reservation_system.model.Faculty faculty40 = new com.reservation_system.model.Faculty(0, "Password1!", "demo/data/test-users.csv", "researcher", false);
        java.lang.String str41 = faculty40.getName();
        userRepository33.addUser((com.reservation_system.model.User) faculty40);
        boolean boolean43 = userRepository33.headLabCoordinatorExists();
        com.reservation_system.services.RegistrationService registrationService44 = new com.reservation_system.services.RegistrationService(userRepository33);
        java.util.List<com.reservation_system.model.User> userList45 = userRepository33.getAllUsers();
        com.reservation_system.repository.UserRepository userRepository47 = new com.reservation_system.repository.UserRepository("demo/data/test-users.csv");
        com.reservation_system.services.RegistrationService registrationService48 = new com.reservation_system.services.RegistrationService(userRepository47);
        com.reservation_system.model.Faculty faculty54 = new com.reservation_system.model.Faculty(0, "Password1!", "demo/data/test-users.csv", "researcher", false);
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
        int int74 = labManager69.getID();
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
        org.junit.Assert.assertTrue("'" + int74 + "' != '" + 97 + "'", int74 == 97);
    }

    @Test
    public void test1973() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1973");
        com.reservation_system.model.Guest guest5 = new com.reservation_system.model.Guest((int) (short) 0, "Guest", "", "Andrew", true);
    }

    @Test
    public void test1974() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1974");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("demo/data/test-users.csv");
        boolean boolean2 = userRepository1.headLabCoordinatorExists();
        com.reservation_system.services.RegistrationService registrationService3 = new com.reservation_system.services.RegistrationService(userRepository1);
        boolean boolean4 = userRepository1.headLabCoordinatorExists();
        boolean boolean5 = userRepository1.headLabCoordinatorExists();
        com.reservation_system.repository.UserRepository userRepository7 = new com.reservation_system.repository.UserRepository("demo/data/test-users.csv");
        com.reservation_system.services.RegistrationService registrationService8 = new com.reservation_system.services.RegistrationService(userRepository7);
        com.reservation_system.model.Faculty faculty14 = new com.reservation_system.model.Faculty(0, "Password1!", "demo/data/test-users.csv", "researcher", false);
        java.lang.String str15 = faculty14.getName();
        userRepository7.addUser((com.reservation_system.model.User) faculty14);
        boolean boolean17 = userRepository7.headLabCoordinatorExists();
        int int18 = userRepository7.getNextID();
        com.reservation_system.repository.UserRepository userRepository20 = new com.reservation_system.repository.UserRepository("demo/data/test-users.csv");
        java.util.List<com.reservation_system.model.User> userList21 = userRepository20.getAllUsers();
        com.reservation_system.services.RegistrationService registrationService22 = new com.reservation_system.services.RegistrationService(userRepository20);
        java.util.List<com.reservation_system.model.User> userList23 = userRepository20.getAllUsers();
        userRepository7.saveAllUsers(userList23);
        userRepository1.saveAllUsers(userList23);
        java.util.List<com.reservation_system.model.User> userList26 = userRepository1.getAllUsers();
        com.reservation_system.model.Student student32 = new com.reservation_system.model.Student(32, "Faculty", "andrew@example.com", "Researcher", false);
        userRepository1.addUser((com.reservation_system.model.User) student32);
        java.lang.String str34 = student32.getUserType();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Password1!" + "'", str15, "Password1!");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 103 + "'", int18 == 103);
        org.junit.Assert.assertNotNull(userList21);
        org.junit.Assert.assertNotNull(userList23);
        org.junit.Assert.assertNotNull(userList26);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "Student" + "'", str34, "Student");
    }

    @Test
    public void test1975() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1975");
        com.reservation_system.model.Researcher researcher5 = new com.reservation_system.model.Researcher((int) (short) 1, "Password1!", "hi!", "hi!", true);
        boolean boolean6 = researcher5.isApproved();
        researcher5.setApproved(true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test1976() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1976");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("demo/data/test-users.csv");
        com.reservation_system.services.RegistrationService registrationService2 = new com.reservation_system.services.RegistrationService(userRepository1);
        com.reservation_system.model.Faculty faculty8 = new com.reservation_system.model.Faculty(0, "Password1!", "demo/data/test-users.csv", "researcher", false);
        java.lang.String str9 = faculty8.getName();
        userRepository1.addUser((com.reservation_system.model.User) faculty8);
        boolean boolean11 = userRepository1.headLabCoordinatorExists();
        com.reservation_system.model.Guest guest17 = new com.reservation_system.model.Guest((int) (byte) -1, "guest", "Researcher", "Faculty", true);
        userRepository1.addUser((com.reservation_system.model.User) guest17);
        boolean boolean20 = userRepository1.emailExists("Password1!");
        boolean boolean22 = userRepository1.emailExists("hi!");
        int int23 = userRepository1.getNextID();
        com.reservation_system.repository.UserRepository userRepository25 = new com.reservation_system.repository.UserRepository("demo/data/test-users.csv");
        com.reservation_system.services.RegistrationService registrationService26 = new com.reservation_system.services.RegistrationService(userRepository25);
        com.reservation_system.model.Faculty faculty32 = new com.reservation_system.model.Faculty(0, "Password1!", "demo/data/test-users.csv", "researcher", false);
        java.lang.String str33 = faculty32.getName();
        userRepository25.addUser((com.reservation_system.model.User) faculty32);
        boolean boolean35 = userRepository25.headLabCoordinatorExists();
        com.reservation_system.model.Guest guest41 = new com.reservation_system.model.Guest((int) (byte) -1, "guest", "Researcher", "Faculty", true);
        userRepository25.addUser((com.reservation_system.model.User) guest41);
        boolean boolean43 = userRepository25.headLabCoordinatorExists();
        com.reservation_system.repository.UserRepository userRepository45 = new com.reservation_system.repository.UserRepository("demo/data/test-users.csv");
        com.reservation_system.services.RegistrationService registrationService46 = new com.reservation_system.services.RegistrationService(userRepository45);
        com.reservation_system.model.Faculty faculty52 = new com.reservation_system.model.Faculty(0, "Password1!", "demo/data/test-users.csv", "researcher", false);
        java.lang.String str53 = faculty52.getName();
        userRepository45.addUser((com.reservation_system.model.User) faculty52);
        boolean boolean55 = userRepository45.headLabCoordinatorExists();
        com.reservation_system.repository.UserRepository userRepository57 = new com.reservation_system.repository.UserRepository("demo/data/test-users.csv");
        com.reservation_system.services.RegistrationService registrationService58 = new com.reservation_system.services.RegistrationService(userRepository57);
        com.reservation_system.model.Faculty faculty64 = new com.reservation_system.model.Faculty(0, "Password1!", "demo/data/test-users.csv", "researcher", false);
        java.lang.String str65 = faculty64.getName();
        userRepository57.addUser((com.reservation_system.model.User) faculty64);
        java.util.List<com.reservation_system.model.User> userList67 = userRepository57.getAllUsers();
        userRepository45.saveAllUsers(userList67);
        userRepository25.saveAllUsers(userList67);
        boolean boolean71 = userRepository25.emailExists("hi!");
        com.reservation_system.repository.UserRepository userRepository73 = new com.reservation_system.repository.UserRepository("demo/data/test-users.csv");
        com.reservation_system.services.RegistrationService registrationService74 = new com.reservation_system.services.RegistrationService(userRepository73);
        com.reservation_system.model.Faculty faculty80 = new com.reservation_system.model.Faculty(0, "Password1!", "demo/data/test-users.csv", "researcher", false);
        java.lang.String str81 = faculty80.getName();
        userRepository73.addUser((com.reservation_system.model.User) faculty80);
        boolean boolean83 = userRepository73.headLabCoordinatorExists();
        com.reservation_system.services.RegistrationService registrationService84 = new com.reservation_system.services.RegistrationService(userRepository73);
        java.util.List<com.reservation_system.model.User> userList85 = userRepository73.getAllUsers();
        userRepository25.saveAllUsers(userList85);
        userRepository1.saveAllUsers(userList85);
        com.reservation_system.services.RegistrationService registrationService88 = new com.reservation_system.services.RegistrationService(userRepository1);
        int int89 = userRepository1.getNextID();
        java.util.List<com.reservation_system.model.User> userList90 = userRepository1.getAllUsers();
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
        org.junit.Assert.assertNotNull(userList90);
    }

    @Test
    public void test1977() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1977");
        com.reservation_system.model.HeadLabCoordinator headLabCoordinator5 = new com.reservation_system.model.HeadLabCoordinator(102, "faculty", "Faculty", "faculty", true);
        java.lang.String str6 = headLabCoordinator5.getUserType();
        java.lang.String str7 = headLabCoordinator5.getUserType();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "headlabcoordinator" + "'", str6, "headlabcoordinator");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "headlabcoordinator" + "'", str7, "headlabcoordinator");
    }

    @Test
    public void test1978() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1978");
        com.reservation_system.model.Student student5 = new com.reservation_system.model.Student(10, "Password1!", "Researcher", "Password1!", false);
        java.lang.String str6 = student5.getUserType();
        boolean boolean7 = student5.requiresDepartmentApproval();
        java.lang.String str8 = student5.getUserType();
        java.lang.String str9 = student5.getUserType();
        java.lang.String str10 = student5.getName();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Student" + "'", str6, "Student");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Student" + "'", str8, "Student");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Student" + "'", str9, "Student");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Password1!" + "'", str10, "Password1!");
    }

    @Test
    public void test1979() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1979");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("demo/data/test-users.csv");
        com.reservation_system.services.RegistrationService registrationService2 = new com.reservation_system.services.RegistrationService(userRepository1);
        com.reservation_system.model.Faculty faculty8 = new com.reservation_system.model.Faculty(0, "Password1!", "demo/data/test-users.csv", "researcher", false);
        java.lang.String str9 = faculty8.getName();
        userRepository1.addUser((com.reservation_system.model.User) faculty8);
        boolean boolean12 = userRepository1.emailExists("Faculty");
        int int13 = userRepository1.getNextID();
        java.util.Optional<com.reservation_system.model.User> userOptional15 = userRepository1.findByEmail("Andrew");
        java.util.List<com.reservation_system.model.User> userList16 = userRepository1.getAllUsers();
        java.util.Optional<com.reservation_system.model.User> userOptional18 = userRepository1.findByEmail("faculty");
        boolean boolean20 = userRepository1.emailExists("headlabcoordinator");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Password1!" + "'", str9, "Password1!");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 103 + "'", int13 == 103);
        org.junit.Assert.assertNotNull(userOptional15);
        org.junit.Assert.assertNotNull(userList16);
        org.junit.Assert.assertNotNull(userOptional18);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
    }

    @Test
    public void test1980() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1980");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("demo/data/test-users.csv");
        com.reservation_system.services.RegistrationService registrationService2 = new com.reservation_system.services.RegistrationService(userRepository1);
        com.reservation_system.model.Faculty faculty8 = new com.reservation_system.model.Faculty(0, "Password1!", "demo/data/test-users.csv", "researcher", false);
        java.lang.String str9 = faculty8.getName();
        userRepository1.addUser((com.reservation_system.model.User) faculty8);
        java.util.List<com.reservation_system.model.User> userList11 = userRepository1.getAllUsers();
        com.reservation_system.model.HeadLabCoordinator headLabCoordinator17 = new com.reservation_system.model.HeadLabCoordinator((int) (byte) -1, "Password1!", "hi!", "", true);
        userRepository1.addUser((com.reservation_system.model.User) headLabCoordinator17);
        boolean boolean19 = userRepository1.headLabCoordinatorExists();
        boolean boolean21 = userRepository1.emailExists("headlabcoordinator");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Password1!" + "'", str9, "Password1!");
        org.junit.Assert.assertNotNull(userList11);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
    }

    @Test
    public void test1981() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1981");
        com.reservation_system.model.LabManager labManager5 = new com.reservation_system.model.LabManager((int) (byte) 100, "hi!", "Student", "Faculty", false);
        java.lang.String str6 = labManager5.getUserType();
        java.lang.String str7 = labManager5.getUserType();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "labmanager" + "'", str6, "labmanager");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "labmanager" + "'", str7, "labmanager");
    }

    @Test
    public void test1982() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1982");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("demo/data/test-users.csv");
        com.reservation_system.services.RegistrationService registrationService2 = new com.reservation_system.services.RegistrationService(userRepository1);
        com.reservation_system.model.Faculty faculty8 = new com.reservation_system.model.Faculty(0, "Password1!", "demo/data/test-users.csv", "researcher", false);
        java.lang.String str9 = faculty8.getName();
        userRepository1.addUser((com.reservation_system.model.User) faculty8);
        boolean boolean11 = userRepository1.headLabCoordinatorExists();
        com.reservation_system.services.RegistrationService registrationService12 = new com.reservation_system.services.RegistrationService(userRepository1);
        com.reservation_system.model.Researcher researcher18 = new com.reservation_system.model.Researcher(0, "labmanager", "", "labmanager", false);
        java.lang.String str19 = researcher18.getEmail();
        userRepository1.addUser((com.reservation_system.model.User) researcher18);
        java.util.List<com.reservation_system.model.User> userList21 = userRepository1.getAllUsers();
        boolean boolean23 = userRepository1.emailExists("headlabcoordinator");
        com.reservation_system.model.Faculty faculty29 = new com.reservation_system.model.Faculty(100, "guest", "student", "headlabcoordinator", true);
        java.lang.String str30 = faculty29.getUserType();
        userRepository1.addUser((com.reservation_system.model.User) faculty29);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Password1!" + "'", str9, "Password1!");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertNotNull(userList21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "Faculty" + "'", str30, "Faculty");
    }

    @Test
    public void test1983() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1983");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("demo/data/test-users.csv");
        com.reservation_system.services.RegistrationService registrationService2 = new com.reservation_system.services.RegistrationService(userRepository1);
        com.reservation_system.model.Faculty faculty8 = new com.reservation_system.model.Faculty(0, "Password1!", "demo/data/test-users.csv", "researcher", false);
        java.lang.String str9 = faculty8.getName();
        userRepository1.addUser((com.reservation_system.model.User) faculty8);
        boolean boolean11 = userRepository1.headLabCoordinatorExists();
        com.reservation_system.model.Guest guest17 = new com.reservation_system.model.Guest((int) (byte) -1, "guest", "Researcher", "Faculty", true);
        userRepository1.addUser((com.reservation_system.model.User) guest17);
        boolean boolean20 = userRepository1.emailExists("Password1!");
        boolean boolean22 = userRepository1.emailExists("hi!");
        int int23 = userRepository1.getNextID();
        com.reservation_system.services.RegistrationService registrationService24 = new com.reservation_system.services.RegistrationService(userRepository1);
        com.reservation_system.model.HeadLabCoordinator headLabCoordinator30 = new com.reservation_system.model.HeadLabCoordinator(10, "faculty", "Faculty", "demo/data/test-users.csv", false);
        boolean boolean31 = headLabCoordinator30.isApproved();
        userRepository1.addUser((com.reservation_system.model.User) headLabCoordinator30);
        int int33 = userRepository1.getNextID();
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Password1!" + "'", str9, "Password1!");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 103 + "'", int23 == 103);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 103 + "'", int33 == 103);
    }

    @Test
    public void test1984() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1984");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("demo/data/test-users.csv");
        int int2 = userRepository1.getNextID();
        com.reservation_system.repository.UserRepository userRepository4 = new com.reservation_system.repository.UserRepository("demo/data/test-users.csv");
        boolean boolean5 = userRepository4.headLabCoordinatorExists();
        com.reservation_system.repository.UserRepository userRepository7 = new com.reservation_system.repository.UserRepository("demo/data/test-users.csv");
        com.reservation_system.services.RegistrationService registrationService8 = new com.reservation_system.services.RegistrationService(userRepository7);
        com.reservation_system.model.Faculty faculty14 = new com.reservation_system.model.Faculty(0, "Password1!", "demo/data/test-users.csv", "researcher", false);
        java.lang.String str15 = faculty14.getName();
        userRepository7.addUser((com.reservation_system.model.User) faculty14);
        java.util.List<com.reservation_system.model.User> userList17 = userRepository7.getAllUsers();
        userRepository4.saveAllUsers(userList17);
        com.reservation_system.services.RegistrationService registrationService19 = new com.reservation_system.services.RegistrationService(userRepository4);
        java.util.List<com.reservation_system.model.User> userList20 = userRepository4.getAllUsers();
        java.util.List<com.reservation_system.model.User> userList21 = userRepository4.getAllUsers();
        userRepository1.saveAllUsers(userList21);
        com.reservation_system.repository.UserRepository userRepository24 = new com.reservation_system.repository.UserRepository("demo/data/test-users.csv");
        com.reservation_system.services.RegistrationService registrationService25 = new com.reservation_system.services.RegistrationService(userRepository24);
        com.reservation_system.model.Faculty faculty31 = new com.reservation_system.model.Faculty(0, "Password1!", "demo/data/test-users.csv", "researcher", false);
        java.lang.String str32 = faculty31.getName();
        userRepository24.addUser((com.reservation_system.model.User) faculty31);
        boolean boolean34 = userRepository24.headLabCoordinatorExists();
        int int35 = userRepository24.getNextID();
        com.reservation_system.repository.UserRepository userRepository37 = new com.reservation_system.repository.UserRepository("demo/data/test-users.csv");
        com.reservation_system.services.RegistrationService registrationService38 = new com.reservation_system.services.RegistrationService(userRepository37);
        int int39 = userRepository37.getNextID();
        boolean boolean41 = userRepository37.emailExists("labmanager");
        java.util.List<com.reservation_system.model.User> userList42 = userRepository37.getAllUsers();
        userRepository24.saveAllUsers(userList42);
        userRepository1.saveAllUsers(userList42);
        com.reservation_system.services.RegistrationService registrationService45 = new com.reservation_system.services.RegistrationService(userRepository1);
        // The following exception was thrown during execution in test generation
        try {
            com.reservation_system.model.User user50 = registrationService45.registerUser("Student", "faculty", "headlabcoordinator", "Andrew");
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
    public void test1985() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1985");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("demo/data/test-users.csv");
        boolean boolean2 = userRepository1.headLabCoordinatorExists();
        com.reservation_system.services.RegistrationService registrationService3 = new com.reservation_system.services.RegistrationService(userRepository1);
        boolean boolean4 = userRepository1.headLabCoordinatorExists();
        boolean boolean6 = userRepository1.emailExists("Andrew");
        com.reservation_system.services.RegistrationService registrationService7 = new com.reservation_system.services.RegistrationService(userRepository1);
        java.util.Optional<com.reservation_system.model.User> userOptional9 = userRepository1.findByEmail("faculty");
        com.reservation_system.services.RegistrationService registrationService10 = new com.reservation_system.services.RegistrationService(userRepository1);
        com.reservation_system.repository.UserRepository userRepository12 = new com.reservation_system.repository.UserRepository("demo/data/test-users.csv");
        com.reservation_system.services.RegistrationService registrationService13 = new com.reservation_system.services.RegistrationService(userRepository12);
        com.reservation_system.model.Faculty faculty19 = new com.reservation_system.model.Faculty(0, "Password1!", "demo/data/test-users.csv", "researcher", false);
        java.lang.String str20 = faculty19.getName();
        userRepository12.addUser((com.reservation_system.model.User) faculty19);
        boolean boolean22 = userRepository12.headLabCoordinatorExists();
        com.reservation_system.model.Guest guest28 = new com.reservation_system.model.Guest((int) (byte) -1, "guest", "Researcher", "Faculty", true);
        userRepository12.addUser((com.reservation_system.model.User) guest28);
        boolean boolean31 = userRepository12.emailExists("Password1!");
        com.reservation_system.repository.UserRepository userRepository33 = new com.reservation_system.repository.UserRepository("demo/data/test-users.csv");
        com.reservation_system.services.RegistrationService registrationService34 = new com.reservation_system.services.RegistrationService(userRepository33);
        com.reservation_system.model.Faculty faculty40 = new com.reservation_system.model.Faculty(0, "Password1!", "demo/data/test-users.csv", "researcher", false);
        java.lang.String str41 = faculty40.getName();
        userRepository33.addUser((com.reservation_system.model.User) faculty40);
        boolean boolean43 = userRepository33.headLabCoordinatorExists();
        com.reservation_system.services.RegistrationService registrationService44 = new com.reservation_system.services.RegistrationService(userRepository33);
        java.util.List<com.reservation_system.model.User> userList45 = userRepository33.getAllUsers();
        com.reservation_system.repository.UserRepository userRepository47 = new com.reservation_system.repository.UserRepository("demo/data/test-users.csv");
        com.reservation_system.services.RegistrationService registrationService48 = new com.reservation_system.services.RegistrationService(userRepository47);
        com.reservation_system.model.Faculty faculty54 = new com.reservation_system.model.Faculty(0, "Password1!", "demo/data/test-users.csv", "researcher", false);
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
        java.lang.String str74 = labManager69.getPassword();
        boolean boolean75 = labManager69.isApproved();
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
        org.junit.Assert.assertEquals("'" + str74 + "' != '" + "Andrew" + "'", str74, "Andrew");
        org.junit.Assert.assertTrue("'" + boolean75 + "' != '" + false + "'", boolean75 == false);
    }

    @Test
    public void test1986() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1986");
        com.reservation_system.model.Researcher researcher5 = new com.reservation_system.model.Researcher((int) '4', "labmanager", "Andrew", "researcher", true);
        java.lang.String str6 = researcher5.getUserType();
        researcher5.setApproved(false);
        int int9 = researcher5.getID();
        researcher5.setApproved(true);
        java.lang.String str12 = researcher5.getEmail();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Researcher" + "'", str6, "Researcher");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 52 + "'", int9 == 52);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Andrew" + "'", str12, "Andrew");
    }

    @Test
    public void test1987() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1987");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("demo/data/test-users.csv");
        boolean boolean2 = userRepository1.headLabCoordinatorExists();
        com.reservation_system.services.RegistrationService registrationService3 = new com.reservation_system.services.RegistrationService(userRepository1);
        boolean boolean5 = userRepository1.emailExists("");
        java.util.Optional<com.reservation_system.model.User> userOptional7 = userRepository1.findByEmail("");
        boolean boolean9 = userRepository1.emailExists("faculty");
        java.util.Optional<com.reservation_system.model.User> userOptional11 = userRepository1.findByEmail("andrew@example.com");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(userOptional7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(userOptional11);
    }

    @Test
    public void test1988() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1988");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("demo/data/test-users.csv");
        com.reservation_system.services.RegistrationService registrationService2 = new com.reservation_system.services.RegistrationService(userRepository1);
        com.reservation_system.model.Faculty faculty8 = new com.reservation_system.model.Faculty(0, "Password1!", "demo/data/test-users.csv", "researcher", false);
        java.lang.String str9 = faculty8.getName();
        userRepository1.addUser((com.reservation_system.model.User) faculty8);
        boolean boolean11 = userRepository1.headLabCoordinatorExists();
        com.reservation_system.model.Guest guest17 = new com.reservation_system.model.Guest((int) (byte) -1, "guest", "Researcher", "Faculty", true);
        userRepository1.addUser((com.reservation_system.model.User) guest17);
        boolean boolean20 = userRepository1.emailExists("Password1!");
        boolean boolean22 = userRepository1.emailExists("hi!");
        int int23 = userRepository1.getNextID();
        int int24 = userRepository1.getNextID();
        boolean boolean25 = userRepository1.headLabCoordinatorExists();
        com.reservation_system.services.RegistrationService registrationService26 = new com.reservation_system.services.RegistrationService(userRepository1);
        boolean boolean27 = userRepository1.headLabCoordinatorExists();
        com.reservation_system.model.HeadLabCoordinator headLabCoordinator33 = new com.reservation_system.model.HeadLabCoordinator(1, "guest", "Researcher", "Student", true);
        userRepository1.addUser((com.reservation_system.model.User) headLabCoordinator33);
        java.lang.Class<?> wildcardClass35 = headLabCoordinator33.getClass();
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Password1!" + "'", str9, "Password1!");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 103 + "'", int23 == 103);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 103 + "'", int24 == 103);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertNotNull(wildcardClass35);
    }

    @Test
    public void test1989() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1989");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("demo/data/test-users.csv");
        int int2 = userRepository1.getNextID();
        int int3 = userRepository1.getNextID();
        boolean boolean5 = userRepository1.emailExists("faculty");
        com.reservation_system.model.LabManager labManager11 = new com.reservation_system.model.LabManager((int) (short) 0, "", "labmanager", "Password1!", true);
        userRepository1.addUser((com.reservation_system.model.User) labManager11);
        labManager11.setApproved(false);
        boolean boolean15 = labManager11.isApproved();
        java.lang.String str16 = labManager11.getUserType();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 103 + "'", int2 == 103);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 103 + "'", int3 == 103);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "labmanager" + "'", str16, "labmanager");
    }

    @Test
    public void test1990() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1990");
        com.reservation_system.model.HeadLabCoordinator headLabCoordinator5 = new com.reservation_system.model.HeadLabCoordinator(10, "faculty", "Faculty", "Andrew", true);
    }

    @Test
    public void test1991() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1991");
        com.reservation_system.model.Researcher researcher5 = new com.reservation_system.model.Researcher((int) (short) 100, "headlabcoordinator", "faculty", "", true);
        java.lang.String str6 = researcher5.getUserType();
        boolean boolean7 = researcher5.isApproved();
        java.lang.String str8 = researcher5.getName();
        researcher5.setApproved(false);
        java.lang.Class<?> wildcardClass11 = researcher5.getClass();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Researcher" + "'", str6, "Researcher");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "headlabcoordinator" + "'", str8, "headlabcoordinator");
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test1992() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1992");
        com.reservation_system.model.HeadLabCoordinator headLabCoordinator5 = new com.reservation_system.model.HeadLabCoordinator((int) (short) 1, "", "faculty", "Password1!", false);
        java.lang.String str6 = headLabCoordinator5.getUserType();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "headlabcoordinator" + "'", str6, "headlabcoordinator");
    }

    @Test
    public void test1993() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1993");
        com.reservation_system.model.Researcher researcher5 = new com.reservation_system.model.Researcher((int) (byte) 100, "student", "Researcher", "demo/data/test-users.csv", true);
    }

    @Test
    public void test1994() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1994");
        com.reservation_system.model.Guest guest5 = new com.reservation_system.model.Guest(33, "Andrew", "Password1!", "researcher", true);
        java.lang.Class<?> wildcardClass6 = guest5.getClass();
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test1995() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1995");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("demo/data/test-users.csv");
        java.util.List<com.reservation_system.model.User> userList2 = userRepository1.getAllUsers();
        java.util.List<com.reservation_system.model.User> userList3 = userRepository1.getAllUsers();
        com.reservation_system.services.RegistrationService registrationService4 = new com.reservation_system.services.RegistrationService(userRepository1);
        org.junit.Assert.assertNotNull(userList2);
        org.junit.Assert.assertNotNull(userList3);
    }

    @Test
    public void test1996() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1996");
        com.reservation_system.model.LabManager labManager5 = new com.reservation_system.model.LabManager(53, "Researcher", "andrew@example.com", "student", false);
    }

    @Test
    public void test1997() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1997");
        com.reservation_system.model.LabManager labManager5 = new com.reservation_system.model.LabManager((-1), "guest", "Faculty", "Password1!", true);
        boolean boolean6 = labManager5.requiresDepartmentApproval();
        java.lang.String str7 = labManager5.getUserType();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "labmanager" + "'", str7, "labmanager");
    }

    @Test
    public void test1998() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1998");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("demo/data/test-users.csv");
        boolean boolean2 = userRepository1.headLabCoordinatorExists();
        com.reservation_system.services.RegistrationService registrationService3 = new com.reservation_system.services.RegistrationService(userRepository1);
        boolean boolean5 = userRepository1.emailExists("");
        boolean boolean6 = userRepository1.headLabCoordinatorExists();
        java.util.List<com.reservation_system.model.User> userList7 = userRepository1.getAllUsers();
        com.reservation_system.model.Faculty faculty13 = new com.reservation_system.model.Faculty((int) '4', "Andrew", "", "faculty", false);
        userRepository1.addUser((com.reservation_system.model.User) faculty13);
        int int15 = faculty13.getID();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(userList7);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 52 + "'", int15 == 52);
    }

    @Test
    public void test1999() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1999");
        com.reservation_system.model.LabManager labManager5 = new com.reservation_system.model.LabManager(52, "faculty", "faculty", "Guest", true);
        java.lang.String str6 = labManager5.getUserType();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "labmanager" + "'", str6, "labmanager");
    }

    @Test
    public void test2000() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test2000");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("demo/data/test-users.csv");
        com.reservation_system.services.RegistrationService registrationService2 = new com.reservation_system.services.RegistrationService(userRepository1);
        com.reservation_system.model.Faculty faculty8 = new com.reservation_system.model.Faculty(0, "Password1!", "demo/data/test-users.csv", "researcher", false);
        java.lang.String str9 = faculty8.getName();
        userRepository1.addUser((com.reservation_system.model.User) faculty8);
        boolean boolean11 = userRepository1.headLabCoordinatorExists();
        com.reservation_system.model.Guest guest17 = new com.reservation_system.model.Guest((int) (byte) -1, "guest", "Researcher", "Faculty", true);
        userRepository1.addUser((com.reservation_system.model.User) guest17);
        boolean boolean19 = userRepository1.headLabCoordinatorExists();
        com.reservation_system.repository.UserRepository userRepository21 = new com.reservation_system.repository.UserRepository("demo/data/test-users.csv");
        com.reservation_system.services.RegistrationService registrationService22 = new com.reservation_system.services.RegistrationService(userRepository21);
        com.reservation_system.model.Faculty faculty28 = new com.reservation_system.model.Faculty(0, "Password1!", "demo/data/test-users.csv", "researcher", false);
        java.lang.String str29 = faculty28.getName();
        userRepository21.addUser((com.reservation_system.model.User) faculty28);
        boolean boolean31 = userRepository21.headLabCoordinatorExists();
        com.reservation_system.repository.UserRepository userRepository33 = new com.reservation_system.repository.UserRepository("demo/data/test-users.csv");
        com.reservation_system.services.RegistrationService registrationService34 = new com.reservation_system.services.RegistrationService(userRepository33);
        com.reservation_system.model.Faculty faculty40 = new com.reservation_system.model.Faculty(0, "Password1!", "demo/data/test-users.csv", "researcher", false);
        java.lang.String str41 = faculty40.getName();
        userRepository33.addUser((com.reservation_system.model.User) faculty40);
        java.util.List<com.reservation_system.model.User> userList43 = userRepository33.getAllUsers();
        userRepository21.saveAllUsers(userList43);
        userRepository1.saveAllUsers(userList43);
        boolean boolean47 = userRepository1.emailExists("hi!");
        boolean boolean48 = userRepository1.headLabCoordinatorExists();
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Password1!" + "'", str9, "Password1!");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "Password1!" + "'", str29, "Password1!");
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "Password1!" + "'", str41, "Password1!");
        org.junit.Assert.assertNotNull(userList43);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + true + "'", boolean47 == true);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + true + "'", boolean48 == true);
    }
}
