package com.reservation_system.Randoop.registrationservice;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest2Test {

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
        com.reservation_system.model.Researcher researcher5 = new com.reservation_system.model.Researcher((int) '4', "labmanager", "Andrew", "researcher", true);
        java.lang.String str6 = researcher5.getPassword();
        java.lang.String str7 = researcher5.getPassword();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "researcher" + "'", str6, "researcher");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "researcher" + "'", str7, "researcher");
    }

    @Test
    public void test1002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1002");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("demo/data/test-users.csv");
        com.reservation_system.services.RegistrationService registrationService2 = new com.reservation_system.services.RegistrationService(userRepository1);
        com.reservation_system.model.Faculty faculty8 = new com.reservation_system.model.Faculty(0, "Password1!", "demo/data/test-users.csv", "researcher", false);
        java.lang.String str9 = faculty8.getName();
        userRepository1.addUser((com.reservation_system.model.User) faculty8);
        java.util.List<com.reservation_system.model.User> userList11 = userRepository1.getAllUsers();
        com.reservation_system.model.LabManager labManager17 = new com.reservation_system.model.LabManager((int) (short) -1, "labmanager", "demo/data/test-users.csv", "Student", false);
        userRepository1.addUser((com.reservation_system.model.User) labManager17);
        com.reservation_system.services.RegistrationService registrationService19 = new com.reservation_system.services.RegistrationService(userRepository1);
        boolean boolean21 = userRepository1.emailExists("demo/data/test-users.csv");
        java.util.List<com.reservation_system.model.User> userList22 = userRepository1.getAllUsers();
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Password1!" + "'", str9, "Password1!");
        org.junit.Assert.assertNotNull(userList11);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertNotNull(userList22);
    }

    @Test
    public void test1003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1003");
        com.reservation_system.model.Faculty faculty5 = new com.reservation_system.model.Faculty(0, "Password1!", "demo/data/test-users.csv", "researcher", false);
        boolean boolean6 = faculty5.requiresDepartmentApproval();
        java.lang.String str7 = faculty5.getUserType();
        int int8 = faculty5.getID();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Faculty" + "'", str7, "Faculty");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test1004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1004");
        com.reservation_system.model.Researcher researcher5 = new com.reservation_system.model.Researcher((int) (short) 0, "faculty", "researcher", "", false);
    }

    @Test
    public void test1005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1005");
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
        com.reservation_system.repository.UserRepository userRepository24 = new com.reservation_system.repository.UserRepository("demo/data/test-users.csv");
        com.reservation_system.services.RegistrationService registrationService25 = new com.reservation_system.services.RegistrationService(userRepository24);
        com.reservation_system.model.Faculty faculty31 = new com.reservation_system.model.Faculty(0, "Password1!", "demo/data/test-users.csv", "researcher", false);
        java.lang.String str32 = faculty31.getName();
        userRepository24.addUser((com.reservation_system.model.User) faculty31);
        boolean boolean34 = userRepository24.headLabCoordinatorExists();
        com.reservation_system.services.RegistrationService registrationService35 = new com.reservation_system.services.RegistrationService(userRepository24);
        java.util.List<com.reservation_system.model.User> userList36 = userRepository24.getAllUsers();
        userRepository1.saveAllUsers(userList36);
        com.reservation_system.repository.UserRepository userRepository39 = new com.reservation_system.repository.UserRepository("demo/data/test-users.csv");
        com.reservation_system.services.RegistrationService registrationService40 = new com.reservation_system.services.RegistrationService(userRepository39);
        com.reservation_system.model.Faculty faculty46 = new com.reservation_system.model.Faculty(0, "Password1!", "demo/data/test-users.csv", "researcher", false);
        java.lang.String str47 = faculty46.getName();
        userRepository39.addUser((com.reservation_system.model.User) faculty46);
        boolean boolean49 = userRepository39.headLabCoordinatorExists();
        com.reservation_system.model.Guest guest55 = new com.reservation_system.model.Guest((int) (byte) -1, "guest", "Researcher", "Faculty", true);
        userRepository39.addUser((com.reservation_system.model.User) guest55);
        boolean boolean58 = userRepository39.emailExists("headlabcoordinator");
        boolean boolean59 = userRepository39.headLabCoordinatorExists();
        java.util.List<com.reservation_system.model.User> userList60 = userRepository39.getAllUsers();
        userRepository1.saveAllUsers(userList60);
// flaky "1) test1005(com.reservation_system.randoop.registrationservice.RegressionTest2)":         org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Password1!" + "'", str12, "Password1!");
        org.junit.Assert.assertNotNull(userList14);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "Password1!" + "'", str32, "Password1!");
// flaky "1) test1005(com.reservation_system.randoop.registrationservice.RegressionTest2)":         org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertNotNull(userList36);
        org.junit.Assert.assertEquals("'" + str47 + "' != '" + "Password1!" + "'", str47, "Password1!");
// flaky "1) test1005(com.reservation_system.randoop.registrationservice.RegressionTest2)":         org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + true + "'", boolean49 == true);
// flaky "1) test1005(com.reservation_system.randoop.registrationservice.RegressionTest2)":         org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + true + "'", boolean58 == true);
// flaky "1) test1005(com.reservation_system.randoop.registrationservice.RegressionTest2)":         org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + true + "'", boolean59 == true);
        org.junit.Assert.assertNotNull(userList60);
    }

    @Test
    public void test1006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1006");
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
        boolean boolean27 = researcher25.requiresDepartmentApproval();
        org.junit.Assert.assertNotNull(userOptional3);
// flaky "2) test1006(com.reservation_system.randoop.registrationservice.RegressionTest2)":         org.junit.Assert.assertTrue("'" + int4 + "' != '" + 101 + "'", int4 == 101);
        org.junit.Assert.assertNotNull(userList12);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
    }

    @Test
    public void test1007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1007");
        // The following exception was thrown during execution in test generation
        try {
            com.reservation_system.model.User user6 = com.reservation_system.patterns.factory.UserFactory.createUser("", (int) (byte) 1, "student", "", "Password1!", false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid user type: ");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1008");
        com.reservation_system.model.Researcher researcher5 = new com.reservation_system.model.Researcher((int) (short) -1, "andrew@example.com", "guest", "labmanager", false);
        java.lang.String str6 = researcher5.getUserType();
        java.lang.String str7 = researcher5.getName();
        boolean boolean8 = researcher5.requiresDepartmentApproval();
        java.lang.String str9 = researcher5.getUserType();
        int int10 = researcher5.getID();
        java.lang.String str11 = researcher5.getPassword();
        researcher5.setApproved(false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Researcher" + "'", str6, "Researcher");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Researcher" + "'", str9, "Researcher");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "labmanager" + "'", str11, "labmanager");
    }

    @Test
    public void test1009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1009");
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
        com.reservation_system.repository.UserRepository userRepository24 = new com.reservation_system.repository.UserRepository("demo/data/test-users.csv");
        boolean boolean25 = userRepository24.headLabCoordinatorExists();
        com.reservation_system.services.RegistrationService registrationService26 = new com.reservation_system.services.RegistrationService(userRepository24);
        boolean boolean27 = userRepository24.headLabCoordinatorExists();
        boolean boolean29 = userRepository24.emailExists("Andrew");
        com.reservation_system.services.RegistrationService registrationService30 = new com.reservation_system.services.RegistrationService(userRepository24);
        java.util.Optional<com.reservation_system.model.User> userOptional32 = userRepository24.findByEmail("faculty");
        com.reservation_system.services.RegistrationService registrationService33 = new com.reservation_system.services.RegistrationService(userRepository24);
        com.reservation_system.repository.UserRepository userRepository35 = new com.reservation_system.repository.UserRepository("demo/data/test-users.csv");
        com.reservation_system.services.RegistrationService registrationService36 = new com.reservation_system.services.RegistrationService(userRepository35);
        com.reservation_system.model.Faculty faculty42 = new com.reservation_system.model.Faculty(0, "Password1!", "demo/data/test-users.csv", "researcher", false);
        java.lang.String str43 = faculty42.getName();
        userRepository35.addUser((com.reservation_system.model.User) faculty42);
        boolean boolean45 = userRepository35.headLabCoordinatorExists();
        com.reservation_system.model.Guest guest51 = new com.reservation_system.model.Guest((int) (byte) -1, "guest", "Researcher", "Faculty", true);
        userRepository35.addUser((com.reservation_system.model.User) guest51);
        boolean boolean54 = userRepository35.emailExists("Password1!");
        com.reservation_system.repository.UserRepository userRepository56 = new com.reservation_system.repository.UserRepository("demo/data/test-users.csv");
        com.reservation_system.services.RegistrationService registrationService57 = new com.reservation_system.services.RegistrationService(userRepository56);
        com.reservation_system.model.Faculty faculty63 = new com.reservation_system.model.Faculty(0, "Password1!", "demo/data/test-users.csv", "researcher", false);
        java.lang.String str64 = faculty63.getName();
        userRepository56.addUser((com.reservation_system.model.User) faculty63);
        boolean boolean66 = userRepository56.headLabCoordinatorExists();
        com.reservation_system.services.RegistrationService registrationService67 = new com.reservation_system.services.RegistrationService(userRepository56);
        java.util.List<com.reservation_system.model.User> userList68 = userRepository56.getAllUsers();
        com.reservation_system.repository.UserRepository userRepository70 = new com.reservation_system.repository.UserRepository("demo/data/test-users.csv");
        com.reservation_system.services.RegistrationService registrationService71 = new com.reservation_system.services.RegistrationService(userRepository70);
        com.reservation_system.model.Faculty faculty77 = new com.reservation_system.model.Faculty(0, "Password1!", "demo/data/test-users.csv", "researcher", false);
        java.lang.String str78 = faculty77.getName();
        userRepository70.addUser((com.reservation_system.model.User) faculty77);
        boolean boolean80 = userRepository70.headLabCoordinatorExists();
        com.reservation_system.services.RegistrationService registrationService81 = new com.reservation_system.services.RegistrationService(userRepository70);
        java.util.List<com.reservation_system.model.User> userList82 = userRepository70.getAllUsers();
        userRepository56.saveAllUsers(userList82);
        userRepository35.saveAllUsers(userList82);
        java.util.List<com.reservation_system.model.User> userList85 = userRepository35.getAllUsers();
        userRepository24.saveAllUsers(userList85);
        userRepository1.saveAllUsers(userList85);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Password1!" + "'", str9, "Password1!");
// flaky "3) test1009(com.reservation_system.randoop.registrationservice.RegressionTest2)":         org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
// flaky "2) test1009(com.reservation_system.randoop.registrationservice.RegressionTest2)":         org.junit.Assert.assertTrue("'" + int13 + "' != '" + 101 + "'", int13 == 101);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "Researcher" + "'", str20, "Researcher");
// flaky "2) test1009(com.reservation_system.randoop.registrationservice.RegressionTest2)":         org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
// flaky "2) test1009(com.reservation_system.randoop.registrationservice.RegressionTest2)":         org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertNotNull(userOptional32);
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "Password1!" + "'", str43, "Password1!");
// flaky "2) test1009(com.reservation_system.randoop.registrationservice.RegressionTest2)":         org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + true + "'", boolean45 == true);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + true + "'", boolean54 == true);
        org.junit.Assert.assertEquals("'" + str64 + "' != '" + "Password1!" + "'", str64, "Password1!");
// flaky "1) test1009(com.reservation_system.randoop.registrationservice.RegressionTest2)":         org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + true + "'", boolean66 == true);
        org.junit.Assert.assertNotNull(userList68);
        org.junit.Assert.assertEquals("'" + str78 + "' != '" + "Password1!" + "'", str78, "Password1!");
// flaky "1) test1009(com.reservation_system.randoop.registrationservice.RegressionTest2)":         org.junit.Assert.assertTrue("'" + boolean80 + "' != '" + true + "'", boolean80 == true);
        org.junit.Assert.assertNotNull(userList82);
        org.junit.Assert.assertNotNull(userList85);
    }

    @Test
    public void test1010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1010");
        com.reservation_system.model.Researcher researcher5 = new com.reservation_system.model.Researcher((int) (short) -1, "andrew@example.com", "guest", "labmanager", false);
        java.lang.String str6 = researcher5.getPassword();
        boolean boolean7 = researcher5.requiresDepartmentApproval();
        boolean boolean8 = researcher5.requiresDepartmentApproval();
        java.lang.String str9 = researcher5.getUserType();
        java.lang.String str10 = researcher5.getName();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "labmanager" + "'", str6, "labmanager");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Researcher" + "'", str9, "Researcher");
    }

    @Test
    public void test1011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1011");
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
        boolean boolean51 = userRepository1.headLabCoordinatorExists();
        boolean boolean52 = userRepository1.headLabCoordinatorExists();
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Password1!" + "'", str9, "Password1!");
// flaky "4) test1011(com.reservation_system.randoop.registrationservice.RegressionTest2)":         org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "Password1!" + "'", str30, "Password1!");
// flaky "3) test1011(com.reservation_system.randoop.registrationservice.RegressionTest2)":         org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertNotNull(userList34);
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "Password1!" + "'", str44, "Password1!");
// flaky "3) test1011(com.reservation_system.randoop.registrationservice.RegressionTest2)":         org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + true + "'", boolean46 == true);
        org.junit.Assert.assertNotNull(userList48);
// flaky "3) test1011(com.reservation_system.randoop.registrationservice.RegressionTest2)":         org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + true + "'", boolean51 == true);
// flaky "3) test1011(com.reservation_system.randoop.registrationservice.RegressionTest2)":         org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + true + "'", boolean52 == true);
    }

    @Test
    public void test1012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1012");
        com.reservation_system.model.Guest guest5 = new com.reservation_system.model.Guest((int) '#', "demo/data/test-users.csv", "student", "", false);
    }

    @Test
    public void test1013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1013");
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
        com.reservation_system.model.Faculty faculty35 = new com.reservation_system.model.Faculty((int) (short) 0, "hi!", "Password1!", "", false);
        java.lang.String str36 = faculty35.getUserType();
        userRepository1.addUser((com.reservation_system.model.User) faculty35);
        com.reservation_system.repository.UserRepository userRepository39 = new com.reservation_system.repository.UserRepository("demo/data/test-users.csv");
        int int40 = userRepository39.getNextID();
        com.reservation_system.repository.UserRepository userRepository42 = new com.reservation_system.repository.UserRepository("demo/data/test-users.csv");
        boolean boolean43 = userRepository42.headLabCoordinatorExists();
        com.reservation_system.repository.UserRepository userRepository45 = new com.reservation_system.repository.UserRepository("demo/data/test-users.csv");
        com.reservation_system.services.RegistrationService registrationService46 = new com.reservation_system.services.RegistrationService(userRepository45);
        com.reservation_system.model.Faculty faculty52 = new com.reservation_system.model.Faculty(0, "Password1!", "demo/data/test-users.csv", "researcher", false);
        java.lang.String str53 = faculty52.getName();
        userRepository45.addUser((com.reservation_system.model.User) faculty52);
        java.util.List<com.reservation_system.model.User> userList55 = userRepository45.getAllUsers();
        userRepository42.saveAllUsers(userList55);
        com.reservation_system.services.RegistrationService registrationService57 = new com.reservation_system.services.RegistrationService(userRepository42);
        java.util.List<com.reservation_system.model.User> userList58 = userRepository42.getAllUsers();
        java.util.List<com.reservation_system.model.User> userList59 = userRepository42.getAllUsers();
        userRepository39.saveAllUsers(userList59);
        com.reservation_system.repository.UserRepository userRepository62 = new com.reservation_system.repository.UserRepository("demo/data/test-users.csv");
        com.reservation_system.services.RegistrationService registrationService63 = new com.reservation_system.services.RegistrationService(userRepository62);
        com.reservation_system.model.Faculty faculty69 = new com.reservation_system.model.Faculty(0, "Password1!", "demo/data/test-users.csv", "researcher", false);
        java.lang.String str70 = faculty69.getName();
        userRepository62.addUser((com.reservation_system.model.User) faculty69);
        boolean boolean72 = userRepository62.headLabCoordinatorExists();
        int int73 = userRepository62.getNextID();
        com.reservation_system.repository.UserRepository userRepository75 = new com.reservation_system.repository.UserRepository("demo/data/test-users.csv");
        com.reservation_system.services.RegistrationService registrationService76 = new com.reservation_system.services.RegistrationService(userRepository75);
        int int77 = userRepository75.getNextID();
        boolean boolean79 = userRepository75.emailExists("labmanager");
        java.util.List<com.reservation_system.model.User> userList80 = userRepository75.getAllUsers();
        userRepository62.saveAllUsers(userList80);
        userRepository39.saveAllUsers(userList80);
        userRepository1.saveAllUsers(userList80);
        com.reservation_system.services.RegistrationService registrationService84 = new com.reservation_system.services.RegistrationService(userRepository1);
// flaky "5) test1013(com.reservation_system.randoop.registrationservice.RegressionTest2)":         org.junit.Assert.assertTrue("'" + int2 + "' != '" + 101 + "'", int2 == 101);
// flaky "4) test1013(com.reservation_system.randoop.registrationservice.RegressionTest2)":         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 101 + "'", int3 == 101);
// flaky "4) test1013(com.reservation_system.randoop.registrationservice.RegressionTest2)":         org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(userOptional14);
        org.junit.Assert.assertNotNull(userList22);
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "Faculty" + "'", str36, "Faculty");
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 101 + "'", int40 == 101);
// flaky "4) test1013(com.reservation_system.randoop.registrationservice.RegressionTest2)":         org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + true + "'", boolean43 == true);
        org.junit.Assert.assertEquals("'" + str53 + "' != '" + "Password1!" + "'", str53, "Password1!");
        org.junit.Assert.assertNotNull(userList55);
        org.junit.Assert.assertNotNull(userList58);
        org.junit.Assert.assertNotNull(userList59);
        org.junit.Assert.assertEquals("'" + str70 + "' != '" + "Password1!" + "'", str70, "Password1!");
// flaky "4) test1013(com.reservation_system.randoop.registrationservice.RegressionTest2)":         org.junit.Assert.assertTrue("'" + boolean72 + "' != '" + true + "'", boolean72 == true);
        org.junit.Assert.assertTrue("'" + int73 + "' != '" + 101 + "'", int73 == 101);
        org.junit.Assert.assertTrue("'" + int77 + "' != '" + 101 + "'", int77 == 101);
        org.junit.Assert.assertTrue("'" + boolean79 + "' != '" + true + "'", boolean79 == true);
        org.junit.Assert.assertNotNull(userList80);
    }

    @Test
    public void test1014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1014");
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
        boolean boolean81 = userRepository1.emailExists("headlabcoordinator");
        boolean boolean82 = userRepository1.headLabCoordinatorExists();
// flaky "6) test1014(com.reservation_system.randoop.registrationservice.RegressionTest2)":         org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
// flaky "5) test1014(com.reservation_system.randoop.registrationservice.RegressionTest2)":         org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
// flaky "5) test1014(com.reservation_system.randoop.registrationservice.RegressionTest2)":         org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Password1!" + "'", str15, "Password1!");
// flaky "5) test1014(com.reservation_system.randoop.registrationservice.RegressionTest2)":         org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 101 + "'", int18 == 101);
        org.junit.Assert.assertNotNull(userList21);
        org.junit.Assert.assertNotNull(userList23);
        org.junit.Assert.assertNotNull(userList26);
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "Password1!" + "'", str36, "Password1!");
// flaky "5) test1014(com.reservation_system.randoop.registrationservice.RegressionTest2)":         org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + true + "'", boolean38 == true);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + true + "'", boolean47 == true);
        org.junit.Assert.assertEquals("'" + str57 + "' != '" + "Password1!" + "'", str57, "Password1!");
// flaky "2) test1014(com.reservation_system.randoop.registrationservice.RegressionTest2)":         org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + true + "'", boolean59 == true);
        org.junit.Assert.assertNotNull(userList61);
        org.junit.Assert.assertEquals("'" + str71 + "' != '" + "Password1!" + "'", str71, "Password1!");
// flaky "2) test1014(com.reservation_system.randoop.registrationservice.RegressionTest2)":         org.junit.Assert.assertTrue("'" + boolean73 + "' != '" + true + "'", boolean73 == true);
        org.junit.Assert.assertNotNull(userList75);
        org.junit.Assert.assertTrue("'" + boolean81 + "' != '" + true + "'", boolean81 == true);
// flaky "1) test1014(com.reservation_system.randoop.registrationservice.RegressionTest2)":         org.junit.Assert.assertTrue("'" + boolean82 + "' != '" + true + "'", boolean82 == true);
    }

    @Test
    public void test1015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1015");
        com.reservation_system.model.User user6 = com.reservation_system.patterns.factory.UserFactory.createUser("student", (int) (byte) 0, "guest", "researcher", "", false);
        org.junit.Assert.assertNotNull(user6);
    }

    @Test
    public void test1016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1016");
        com.reservation_system.model.Guest guest5 = new com.reservation_system.model.Guest((int) (byte) 1, "demo/data/test-users.csv", "Andrew", "faculty", true);
        java.lang.String str6 = guest5.getPassword();
        boolean boolean7 = guest5.isApproved();
        java.lang.String str8 = guest5.getUserType();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "faculty" + "'", str6, "faculty");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Guest" + "'", str8, "Guest");
    }

    @Test
    public void test1017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1017");
        com.reservation_system.model.Faculty faculty5 = new com.reservation_system.model.Faculty(102, "Faculty", "Researcher", "Student", true);
    }

    @Test
    public void test1018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1018");
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
        com.reservation_system.services.RegistrationService registrationService32 = new com.reservation_system.services.RegistrationService(userRepository1);
        java.util.List<com.reservation_system.model.User> userList33 = userRepository1.getAllUsers();
// flaky "7) test1018(com.reservation_system.randoop.registrationservice.RegressionTest2)":         org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
// flaky "6) test1018(com.reservation_system.randoop.registrationservice.RegressionTest2)":         org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "Password1!" + "'", str17, "Password1!");
// flaky "6) test1018(com.reservation_system.randoop.registrationservice.RegressionTest2)":         org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNotNull(userList27);
// flaky "6) test1018(com.reservation_system.randoop.registrationservice.RegressionTest2)":         org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertNotNull(userOptional31);
        org.junit.Assert.assertNotNull(userList33);
    }

    @Test
    public void test1019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1019");
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
        // The following exception was thrown during execution in test generation
        try {
            com.reservation_system.model.User user27 = registrationService22.registerUser("Researcher", "", "Guest", "guest");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Name is required.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Password1!" + "'", str9, "Password1!");
// flaky "8) test1019(com.reservation_system.randoop.registrationservice.RegressionTest2)":         org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 101 + "'", int12 == 101);
// flaky "7) test1019(com.reservation_system.randoop.registrationservice.RegressionTest2)":         org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test1020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1020");
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
        java.lang.String str19 = faculty11.getUserType();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 101 + "'", int2 == 101);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 101 + "'", int3 == 101);
// flaky "9) test1020(com.reservation_system.randoop.registrationservice.RegressionTest2)":         org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "faculty" + "'", str12, "faculty");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Faculty" + "'", str13, "Faculty");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 10 + "'", int14 == 10);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "faculty" + "'", str16, "faculty");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "Faculty" + "'", str17, "Faculty");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "researcher" + "'", str18, "researcher");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "Faculty" + "'", str19, "Faculty");
    }

    @Test
    public void test1021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1021");
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
        java.lang.Class<?> wildcardClass97 = userList95.getClass();
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Password1!" + "'", str9, "Password1!");
// flaky "10) test1021(com.reservation_system.randoop.registrationservice.RegressionTest2)":         org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 101 + "'", int23 == 101);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "Password1!" + "'", str33, "Password1!");
// flaky "8) test1021(com.reservation_system.randoop.registrationservice.RegressionTest2)":         org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
// flaky "7) test1021(com.reservation_system.randoop.registrationservice.RegressionTest2)":         org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + true + "'", boolean43 == true);
        org.junit.Assert.assertEquals("'" + str53 + "' != '" + "Password1!" + "'", str53, "Password1!");
// flaky "7) test1021(com.reservation_system.randoop.registrationservice.RegressionTest2)":         org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + true + "'", boolean55 == true);
        org.junit.Assert.assertEquals("'" + str65 + "' != '" + "Password1!" + "'", str65, "Password1!");
        org.junit.Assert.assertNotNull(userList67);
        org.junit.Assert.assertTrue("'" + boolean71 + "' != '" + false + "'", boolean71 == false);
        org.junit.Assert.assertEquals("'" + str81 + "' != '" + "Password1!" + "'", str81, "Password1!");
// flaky "6) test1021(com.reservation_system.randoop.registrationservice.RegressionTest2)":         org.junit.Assert.assertTrue("'" + boolean83 + "' != '" + true + "'", boolean83 == true);
        org.junit.Assert.assertNotNull(userList85);
        org.junit.Assert.assertNotNull(userList89);
        org.junit.Assert.assertNotNull(userOptional93);
        org.junit.Assert.assertTrue("'" + int94 + "' != '" + 101 + "'", int94 == 101);
        org.junit.Assert.assertNotNull(userList95);
        org.junit.Assert.assertNotNull(wildcardClass97);
    }

    @Test
    public void test1022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1022");
        com.reservation_system.model.User user6 = com.reservation_system.patterns.factory.UserFactory.createUser("Faculty", 35, "", "headlabcoordinator", "", true);
        org.junit.Assert.assertNotNull(user6);
    }

    @Test
    public void test1023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1023");
        com.reservation_system.model.Student student5 = new com.reservation_system.model.Student(0, "Researcher", "Password1!", "Guest", false);
    }

    @Test
    public void test1024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1024");
        com.reservation_system.model.Researcher researcher5 = new com.reservation_system.model.Researcher(97, "", "faculty", "hi!", false);
        java.lang.Class<?> wildcardClass6 = researcher5.getClass();
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test1025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1025");
        com.reservation_system.model.Researcher researcher5 = new com.reservation_system.model.Researcher(10, "", "faculty", "Faculty", false);
        java.lang.String str6 = researcher5.getEmail();
        java.lang.String str7 = researcher5.getUserType();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "faculty" + "'", str6, "faculty");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Researcher" + "'", str7, "Researcher");
    }

    @Test
    public void test1026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1026");
        com.reservation_system.model.Student student5 = new com.reservation_system.model.Student(97, "", "", "Student", true);
    }

    @Test
    public void test1027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1027");
        com.reservation_system.model.LabManager labManager5 = new com.reservation_system.model.LabManager((int) (byte) 10, "", "andrew@example.com", "Password1!", true);
    }

    @Test
    public void test1028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1028");
        com.reservation_system.model.LabManager labManager5 = new com.reservation_system.model.LabManager(10, "Student", "student", "labmanager", true);
        boolean boolean6 = labManager5.requiresDepartmentApproval();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test1029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1029");
        com.reservation_system.model.LabManager labManager5 = new com.reservation_system.model.LabManager(0, "headlabcoordinator", "", "hi!", true);
        boolean boolean6 = labManager5.requiresDepartmentApproval();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test1030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1030");
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
        java.util.Optional<com.reservation_system.model.User> userOptional46 = userRepository1.findByEmail("Guest");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 101 + "'", int2 == 101);
// flaky "11) test1030(com.reservation_system.randoop.registrationservice.RegressionTest2)":         org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Password1!" + "'", str15, "Password1!");
        org.junit.Assert.assertNotNull(userList17);
        org.junit.Assert.assertNotNull(userList20);
        org.junit.Assert.assertNotNull(userList21);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "Password1!" + "'", str32, "Password1!");
// flaky "9) test1030(com.reservation_system.randoop.registrationservice.RegressionTest2)":         org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 101 + "'", int35 == 101);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 101 + "'", int39 == 101);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + true + "'", boolean41 == true);
        org.junit.Assert.assertNotNull(userList42);
        org.junit.Assert.assertNotNull(userOptional46);
    }

    @Test
    public void test1031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1031");
        com.reservation_system.model.Faculty faculty5 = new com.reservation_system.model.Faculty((int) (byte) -1, "Faculty", "Guest", "Faculty", false);
        java.lang.String str6 = faculty5.getUserType();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Faculty" + "'", str6, "Faculty");
    }

    @Test
    public void test1032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1032");
        com.reservation_system.model.User user6 = com.reservation_system.patterns.factory.UserFactory.createUser("Student", (int) (short) 10, "headlabcoordinator", "demo/data/test-users.csv", "Andrew", true);
        org.junit.Assert.assertNotNull(user6);
    }

    @Test
    public void test1033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1033");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("demo/data/test-users.csv");
        com.reservation_system.services.RegistrationService registrationService2 = new com.reservation_system.services.RegistrationService(userRepository1);
        com.reservation_system.model.Faculty faculty8 = new com.reservation_system.model.Faculty(0, "Password1!", "demo/data/test-users.csv", "researcher", false);
        java.lang.String str9 = faculty8.getName();
        userRepository1.addUser((com.reservation_system.model.User) faculty8);
        boolean boolean11 = userRepository1.headLabCoordinatorExists();
        boolean boolean13 = userRepository1.emailExists("guest");
        java.util.Optional<com.reservation_system.model.User> userOptional15 = userRepository1.findByEmail("Password1!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Password1!" + "'", str9, "Password1!");
// flaky "12) test1033(com.reservation_system.randoop.registrationservice.RegressionTest2)":         org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(userOptional15);
    }

    @Test
    public void test1034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1034");
        // The following exception was thrown during execution in test generation
        try {
            com.reservation_system.model.User user6 = com.reservation_system.patterns.factory.UserFactory.createUser("Andrew", (int) (byte) 0, "", "", "Guest", true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid user type: Andrew");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1035");
        com.reservation_system.model.Researcher researcher5 = new com.reservation_system.model.Researcher((int) '#', "researcher", "Password1!", "Password1!", false);
        java.lang.String str6 = researcher5.getUserType();
        boolean boolean7 = researcher5.isApproved();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Researcher" + "'", str6, "Researcher");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test1036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1036");
        com.reservation_system.model.LabManager labManager5 = new com.reservation_system.model.LabManager((int) '4', "", "researcher", "researcher", true);
        int int6 = labManager5.getID();
        java.lang.String str7 = labManager5.getUserType();
        java.lang.String str8 = labManager5.getPassword();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 52 + "'", int6 == 52);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "labmanager" + "'", str7, "labmanager");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "researcher" + "'", str8, "researcher");
    }

    @Test
    public void test1037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1037");
        // The following exception was thrown during execution in test generation
        try {
            com.reservation_system.model.User user6 = com.reservation_system.patterns.factory.UserFactory.createUser("andrew@example.com", (int) (short) 100, "guest", "Password1!", "guest", true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid user type: andrew@example.com");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1038");
        com.reservation_system.model.Guest guest5 = new com.reservation_system.model.Guest((int) ' ', "guest", "Password1!", "Faculty", true);
        java.lang.String str6 = guest5.getUserType();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Guest" + "'", str6, "Guest");
    }

    @Test
    public void test1039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1039");
        com.reservation_system.model.HeadLabCoordinator headLabCoordinator5 = new com.reservation_system.model.HeadLabCoordinator(102, "faculty", "Faculty", "Faculty", true);
    }

    @Test
    public void test1040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1040");
        com.reservation_system.model.HeadLabCoordinator headLabCoordinator5 = new com.reservation_system.model.HeadLabCoordinator(52, "researcher", "Faculty", "headlabcoordinator", false);
        java.lang.String str6 = headLabCoordinator5.getUserType();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "headlabcoordinator" + "'", str6, "headlabcoordinator");
    }

    @Test
    public void test1041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1041");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("demo/data/test-users.csv");
        java.util.List<com.reservation_system.model.User> userList2 = userRepository1.getAllUsers();
        com.reservation_system.services.RegistrationService registrationService3 = new com.reservation_system.services.RegistrationService(userRepository1);
        java.util.List<com.reservation_system.model.User> userList4 = userRepository1.getAllUsers();
        java.util.Optional<com.reservation_system.model.User> userOptional6 = userRepository1.findByEmail("researcher");
        com.reservation_system.model.Faculty faculty12 = new com.reservation_system.model.Faculty((int) (byte) 1, "researcher", "Andrew", "", false);
        userRepository1.addUser((com.reservation_system.model.User) faculty12);
        com.reservation_system.model.Student student19 = new com.reservation_system.model.Student((int) ' ', "", "labmanager", "headlabcoordinator", true);
        student19.setApproved(false);
        boolean boolean22 = student19.isApproved();
        userRepository1.addUser((com.reservation_system.model.User) student19);
        java.util.Optional<com.reservation_system.model.User> userOptional25 = userRepository1.findByEmail("");
        org.junit.Assert.assertNotNull(userList2);
        org.junit.Assert.assertNotNull(userList4);
        org.junit.Assert.assertNotNull(userOptional6);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(userOptional25);
    }

    @Test
    public void test1042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1042");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("demo/data/test-users.csv");
        com.reservation_system.services.RegistrationService registrationService2 = new com.reservation_system.services.RegistrationService(userRepository1);
        com.reservation_system.model.Faculty faculty8 = new com.reservation_system.model.Faculty(0, "Password1!", "demo/data/test-users.csv", "researcher", false);
        java.lang.String str9 = faculty8.getName();
        userRepository1.addUser((com.reservation_system.model.User) faculty8);
        java.util.List<com.reservation_system.model.User> userList11 = userRepository1.getAllUsers();
        com.reservation_system.model.LabManager labManager17 = new com.reservation_system.model.LabManager((int) (short) -1, "labmanager", "demo/data/test-users.csv", "Student", false);
        userRepository1.addUser((com.reservation_system.model.User) labManager17);
        com.reservation_system.services.RegistrationService registrationService19 = new com.reservation_system.services.RegistrationService(userRepository1);
        com.reservation_system.repository.UserRepository userRepository21 = new com.reservation_system.repository.UserRepository("demo/data/test-users.csv");
        com.reservation_system.services.RegistrationService registrationService22 = new com.reservation_system.services.RegistrationService(userRepository21);
        com.reservation_system.model.Faculty faculty28 = new com.reservation_system.model.Faculty(0, "Password1!", "demo/data/test-users.csv", "researcher", false);
        java.lang.String str29 = faculty28.getName();
        userRepository21.addUser((com.reservation_system.model.User) faculty28);
        boolean boolean31 = userRepository21.headLabCoordinatorExists();
        com.reservation_system.model.Guest guest37 = new com.reservation_system.model.Guest((int) (byte) -1, "guest", "Researcher", "Faculty", true);
        userRepository21.addUser((com.reservation_system.model.User) guest37);
        boolean boolean40 = userRepository21.emailExists("Password1!");
        boolean boolean42 = userRepository21.emailExists("hi!");
        int int43 = userRepository21.getNextID();
        int int44 = userRepository21.getNextID();
        com.reservation_system.model.Faculty faculty50 = new com.reservation_system.model.Faculty(10, "researcher", "faculty", "", false);
        java.lang.String str51 = faculty50.getUserType();
        java.lang.String str52 = faculty50.getUserType();
        userRepository21.addUser((com.reservation_system.model.User) faculty50);
        java.util.List<com.reservation_system.model.User> userList54 = userRepository21.getAllUsers();
        userRepository1.saveAllUsers(userList54);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Password1!" + "'", str9, "Password1!");
        org.junit.Assert.assertNotNull(userList11);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "Password1!" + "'", str29, "Password1!");
// flaky "13) test1042(com.reservation_system.randoop.registrationservice.RegressionTest2)":         org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + true + "'", boolean40 == true);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 101 + "'", int43 == 101);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 101 + "'", int44 == 101);
        org.junit.Assert.assertEquals("'" + str51 + "' != '" + "Faculty" + "'", str51, "Faculty");
        org.junit.Assert.assertEquals("'" + str52 + "' != '" + "Faculty" + "'", str52, "Faculty");
        org.junit.Assert.assertNotNull(userList54);
    }

    @Test
    public void test1043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1043");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("demo/data/test-users.csv");
        boolean boolean2 = userRepository1.headLabCoordinatorExists();
        com.reservation_system.services.RegistrationService registrationService3 = new com.reservation_system.services.RegistrationService(userRepository1);
        boolean boolean5 = userRepository1.emailExists("");
        java.util.Optional<com.reservation_system.model.User> userOptional7 = userRepository1.findByEmail("");
        java.util.Optional<com.reservation_system.model.User> userOptional9 = userRepository1.findByEmail("hi!");
        java.util.List<com.reservation_system.model.User> userList10 = userRepository1.getAllUsers();
        com.reservation_system.repository.UserRepository userRepository12 = new com.reservation_system.repository.UserRepository("demo/data/test-users.csv");
        int int13 = userRepository12.getNextID();
        int int14 = userRepository12.getNextID();
        com.reservation_system.repository.UserRepository userRepository16 = new com.reservation_system.repository.UserRepository("demo/data/test-users.csv");
        com.reservation_system.services.RegistrationService registrationService17 = new com.reservation_system.services.RegistrationService(userRepository16);
        int int18 = userRepository16.getNextID();
        boolean boolean20 = userRepository16.emailExists("labmanager");
        java.util.List<com.reservation_system.model.User> userList21 = userRepository16.getAllUsers();
        userRepository12.saveAllUsers(userList21);
        userRepository1.saveAllUsers(userList21);
// flaky "14) test1043(com.reservation_system.randoop.registrationservice.RegressionTest2)":         org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
// flaky "10) test1043(com.reservation_system.randoop.registrationservice.RegressionTest2)":         org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(userOptional7);
        org.junit.Assert.assertNotNull(userOptional9);
        org.junit.Assert.assertNotNull(userList10);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 101 + "'", int13 == 101);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 101 + "'", int14 == 101);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 101 + "'", int18 == 101);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertNotNull(userList21);
    }

    @Test
    public void test1044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1044");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("demo/data/test-users.csv");
        com.reservation_system.services.RegistrationService registrationService2 = new com.reservation_system.services.RegistrationService(userRepository1);
        com.reservation_system.model.Faculty faculty8 = new com.reservation_system.model.Faculty(0, "Password1!", "demo/data/test-users.csv", "researcher", false);
        java.lang.String str9 = faculty8.getName();
        userRepository1.addUser((com.reservation_system.model.User) faculty8);
        boolean boolean12 = userRepository1.emailExists("Faculty");
        int int13 = userRepository1.getNextID();
        java.util.Optional<com.reservation_system.model.User> userOptional15 = userRepository1.findByEmail("Andrew");
        com.reservation_system.repository.UserRepository userRepository17 = new com.reservation_system.repository.UserRepository("demo/data/test-users.csv");
        com.reservation_system.services.RegistrationService registrationService18 = new com.reservation_system.services.RegistrationService(userRepository17);
        int int19 = userRepository17.getNextID();
        boolean boolean21 = userRepository17.emailExists("Andrew");
        com.reservation_system.model.Researcher researcher27 = new com.reservation_system.model.Researcher((int) (short) -1, "faculty", "researcher", "hi!", true);
        java.lang.String str28 = researcher27.getUserType();
        int int29 = researcher27.getID();
        java.lang.String str30 = researcher27.getUserType();
        userRepository17.addUser((com.reservation_system.model.User) researcher27);
        java.util.List<com.reservation_system.model.User> userList32 = userRepository17.getAllUsers();
        userRepository1.saveAllUsers(userList32);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Password1!" + "'", str9, "Password1!");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 101 + "'", int13 == 101);
        org.junit.Assert.assertNotNull(userOptional15);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 101 + "'", int19 == 101);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "Researcher" + "'", str28, "Researcher");
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + (-1) + "'", int29 == (-1));
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "Researcher" + "'", str30, "Researcher");
        org.junit.Assert.assertNotNull(userList32);
    }

    @Test
    public void test1045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1045");
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
        boolean boolean33 = userRepository1.headLabCoordinatorExists();
        java.util.List<com.reservation_system.model.User> userList34 = userRepository1.getAllUsers();
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Password1!" + "'", str9, "Password1!");
// flaky "15) test1045(com.reservation_system.randoop.registrationservice.RegressionTest2)":         org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 101 + "'", int23 == 101);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertNotNull(userList34);
    }

    @Test
    public void test1046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1046");
        com.reservation_system.model.HeadLabCoordinator headLabCoordinator5 = new com.reservation_system.model.HeadLabCoordinator(10, "researcher", "headlabcoordinator", "faculty", false);
        java.lang.String str6 = headLabCoordinator5.getPassword();
        java.lang.String str7 = headLabCoordinator5.getUserType();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "faculty" + "'", str6, "faculty");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "headlabcoordinator" + "'", str7, "headlabcoordinator");
    }

    @Test
    public void test1047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1047");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("demo/data/test-users.csv");
        java.util.List<com.reservation_system.model.User> userList2 = userRepository1.getAllUsers();
        com.reservation_system.services.RegistrationService registrationService3 = new com.reservation_system.services.RegistrationService(userRepository1);
        com.reservation_system.services.RegistrationService registrationService4 = new com.reservation_system.services.RegistrationService(userRepository1);
        java.util.List<com.reservation_system.model.User> userList5 = userRepository1.getAllUsers();
        java.util.Optional<com.reservation_system.model.User> userOptional7 = userRepository1.findByEmail("Researcher");
        com.reservation_system.model.Student student13 = new com.reservation_system.model.Student((int) ' ', "", "labmanager", "headlabcoordinator", true);
        java.lang.String str14 = student13.getUserType();
        boolean boolean15 = student13.isApproved();
        int int16 = student13.getID();
        java.lang.String str17 = student13.getUserType();
        userRepository1.addUser((com.reservation_system.model.User) student13);
        org.junit.Assert.assertNotNull(userList2);
        org.junit.Assert.assertNotNull(userList5);
        org.junit.Assert.assertNotNull(userOptional7);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Student" + "'", str14, "Student");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 32 + "'", int16 == 32);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "Student" + "'", str17, "Student");
    }

    @Test
    public void test1048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1048");
        com.reservation_system.model.Guest guest5 = new com.reservation_system.model.Guest(100, "headlabcoordinator", "faculty", "Faculty", true);
        boolean boolean6 = guest5.requiresDepartmentApproval();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test1049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1049");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("demo/data/test-users.csv");
        int int2 = userRepository1.getNextID();
        int int3 = userRepository1.getNextID();
        boolean boolean5 = userRepository1.emailExists("");
        boolean boolean7 = userRepository1.emailExists("faculty");
        java.util.Optional<com.reservation_system.model.User> userOptional9 = userRepository1.findByEmail("Password1!");
        boolean boolean11 = userRepository1.emailExists("headlabcoordinator");
        boolean boolean13 = userRepository1.emailExists("Andrew");
        int int14 = userRepository1.getNextID();
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
        com.reservation_system.model.Researcher researcher43 = new com.reservation_system.model.Researcher((int) (short) -1, "headlabcoordinator", "Guest", "student", false);
        userRepository16.addUser((com.reservation_system.model.User) researcher43);
        com.reservation_system.model.Faculty faculty50 = new com.reservation_system.model.Faculty((int) (short) 0, "hi!", "Password1!", "", false);
        java.lang.String str51 = faculty50.getUserType();
        userRepository16.addUser((com.reservation_system.model.User) faculty50);
        com.reservation_system.repository.UserRepository userRepository54 = new com.reservation_system.repository.UserRepository("demo/data/test-users.csv");
        int int55 = userRepository54.getNextID();
        com.reservation_system.repository.UserRepository userRepository57 = new com.reservation_system.repository.UserRepository("demo/data/test-users.csv");
        boolean boolean58 = userRepository57.headLabCoordinatorExists();
        com.reservation_system.repository.UserRepository userRepository60 = new com.reservation_system.repository.UserRepository("demo/data/test-users.csv");
        com.reservation_system.services.RegistrationService registrationService61 = new com.reservation_system.services.RegistrationService(userRepository60);
        com.reservation_system.model.Faculty faculty67 = new com.reservation_system.model.Faculty(0, "Password1!", "demo/data/test-users.csv", "researcher", false);
        java.lang.String str68 = faculty67.getName();
        userRepository60.addUser((com.reservation_system.model.User) faculty67);
        java.util.List<com.reservation_system.model.User> userList70 = userRepository60.getAllUsers();
        userRepository57.saveAllUsers(userList70);
        com.reservation_system.services.RegistrationService registrationService72 = new com.reservation_system.services.RegistrationService(userRepository57);
        java.util.List<com.reservation_system.model.User> userList73 = userRepository57.getAllUsers();
        java.util.List<com.reservation_system.model.User> userList74 = userRepository57.getAllUsers();
        userRepository54.saveAllUsers(userList74);
        com.reservation_system.repository.UserRepository userRepository77 = new com.reservation_system.repository.UserRepository("demo/data/test-users.csv");
        com.reservation_system.services.RegistrationService registrationService78 = new com.reservation_system.services.RegistrationService(userRepository77);
        com.reservation_system.model.Faculty faculty84 = new com.reservation_system.model.Faculty(0, "Password1!", "demo/data/test-users.csv", "researcher", false);
        java.lang.String str85 = faculty84.getName();
        userRepository77.addUser((com.reservation_system.model.User) faculty84);
        boolean boolean87 = userRepository77.headLabCoordinatorExists();
        int int88 = userRepository77.getNextID();
        com.reservation_system.repository.UserRepository userRepository90 = new com.reservation_system.repository.UserRepository("demo/data/test-users.csv");
        com.reservation_system.services.RegistrationService registrationService91 = new com.reservation_system.services.RegistrationService(userRepository90);
        int int92 = userRepository90.getNextID();
        boolean boolean94 = userRepository90.emailExists("labmanager");
        java.util.List<com.reservation_system.model.User> userList95 = userRepository90.getAllUsers();
        userRepository77.saveAllUsers(userList95);
        userRepository54.saveAllUsers(userList95);
        userRepository16.saveAllUsers(userList95);
        userRepository1.saveAllUsers(userList95);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 101 + "'", int2 == 101);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 101 + "'", int3 == 101);
// flaky "16) test1049(com.reservation_system.randoop.registrationservice.RegressionTest2)":         org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(userOptional9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 101 + "'", int14 == 101);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 101 + "'", int17 == 101);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 101 + "'", int18 == 101);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertNotNull(userOptional29);
        org.junit.Assert.assertNotNull(userList37);
        org.junit.Assert.assertEquals("'" + str51 + "' != '" + "Faculty" + "'", str51, "Faculty");
        org.junit.Assert.assertTrue("'" + int55 + "' != '" + 101 + "'", int55 == 101);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + true + "'", boolean58 == true);
        org.junit.Assert.assertEquals("'" + str68 + "' != '" + "Password1!" + "'", str68, "Password1!");
        org.junit.Assert.assertNotNull(userList70);
        org.junit.Assert.assertNotNull(userList73);
        org.junit.Assert.assertNotNull(userList74);
        org.junit.Assert.assertEquals("'" + str85 + "' != '" + "Password1!" + "'", str85, "Password1!");
        org.junit.Assert.assertTrue("'" + boolean87 + "' != '" + true + "'", boolean87 == true);
        org.junit.Assert.assertTrue("'" + int88 + "' != '" + 101 + "'", int88 == 101);
        org.junit.Assert.assertTrue("'" + int92 + "' != '" + 101 + "'", int92 == 101);
        org.junit.Assert.assertTrue("'" + boolean94 + "' != '" + true + "'", boolean94 == true);
        org.junit.Assert.assertNotNull(userList95);
    }

    @Test
    public void test1050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1050");
        com.reservation_system.model.Guest guest5 = new com.reservation_system.model.Guest(1, "labmanager", "Student", "Researcher", true);
        java.lang.String str6 = guest5.getName();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "labmanager" + "'", str6, "labmanager");
    }

    @Test
    public void test1051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1051");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("demo/data/test-users.csv");
        java.util.List<com.reservation_system.model.User> userList2 = userRepository1.getAllUsers();
        com.reservation_system.services.RegistrationService registrationService3 = new com.reservation_system.services.RegistrationService(userRepository1);
        com.reservation_system.services.RegistrationService registrationService4 = new com.reservation_system.services.RegistrationService(userRepository1);
        // The following exception was thrown during execution in test generation
        try {
            com.reservation_system.model.User user9 = registrationService4.registerUser("Guest", "Guest", "Guest", "andrew@example.com");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid email format.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(userList2);
    }

    @Test
    public void test1052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1052");
        com.reservation_system.model.LabManager labManager5 = new com.reservation_system.model.LabManager(103, "", "guest", "hi!", false);
        java.lang.String str6 = labManager5.getUserType();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "labmanager" + "'", str6, "labmanager");
    }

    @Test
    public void test1053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1053");
        com.reservation_system.model.Student student5 = new com.reservation_system.model.Student(10, "Password1!", "Researcher", "Password1!", false);
        java.lang.Class<?> wildcardClass6 = student5.getClass();
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test1054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1054");
        com.reservation_system.model.User user6 = com.reservation_system.patterns.factory.UserFactory.createUser("student", (int) (short) -1, "hi!", "Andrew", "researcher", false);
        org.junit.Assert.assertNotNull(user6);
    }

    @Test
    public void test1055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1055");
        com.reservation_system.model.HeadLabCoordinator headLabCoordinator5 = new com.reservation_system.model.HeadLabCoordinator((int) (short) -1, "Researcher", "andrew@example.com", "headlabcoordinator", false);
        int int6 = headLabCoordinator5.getID();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
    }

    @Test
    public void test1056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1056");
        com.reservation_system.model.Student student5 = new com.reservation_system.model.Student(98, "Faculty", "Student", "guest", false);
    }

    @Test
    public void test1057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1057");
        com.reservation_system.model.Faculty faculty5 = new com.reservation_system.model.Faculty((int) (short) 0, "guest", "Andrew", "guest", true);
        faculty5.setApproved(false);
        java.lang.String str8 = faculty5.getUserType();
        java.lang.String str9 = faculty5.getEmail();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Faculty" + "'", str8, "Faculty");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Andrew" + "'", str9, "Andrew");
    }

    @Test
    public void test1058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1058");
        com.reservation_system.model.Guest guest5 = new com.reservation_system.model.Guest((int) ' ', "Guest", "Faculty", "", false);
    }

    @Test
    public void test1059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1059");
        com.reservation_system.model.Faculty faculty5 = new com.reservation_system.model.Faculty(0, "Password1!", "demo/data/test-users.csv", "researcher", false);
        boolean boolean6 = faculty5.requiresDepartmentApproval();
        java.lang.String str7 = faculty5.getUserType();
        java.lang.String str8 = faculty5.getUserType();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Faculty" + "'", str7, "Faculty");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Faculty" + "'", str8, "Faculty");
    }

    @Test
    public void test1060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1060");
        com.reservation_system.model.Guest guest5 = new com.reservation_system.model.Guest((int) ' ', "faculty", "researcher", "Guest", true);
    }

    @Test
    public void test1061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1061");
        com.reservation_system.model.Researcher researcher5 = new com.reservation_system.model.Researcher((int) (short) 1, "labmanager", "labmanager", "headlabcoordinator", true);
    }

    @Test
    public void test1062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1062");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("demo/data/test-users.csv");
        com.reservation_system.services.RegistrationService registrationService2 = new com.reservation_system.services.RegistrationService(userRepository1);
        com.reservation_system.model.Faculty faculty8 = new com.reservation_system.model.Faculty(0, "Password1!", "demo/data/test-users.csv", "researcher", false);
        java.lang.String str9 = faculty8.getName();
        userRepository1.addUser((com.reservation_system.model.User) faculty8);
        java.util.List<com.reservation_system.model.User> userList11 = userRepository1.getAllUsers();
        int int12 = userRepository1.getNextID();
        java.util.List<com.reservation_system.model.User> userList13 = userRepository1.getAllUsers();
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Password1!" + "'", str9, "Password1!");
        org.junit.Assert.assertNotNull(userList11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 101 + "'", int12 == 101);
        org.junit.Assert.assertNotNull(userList13);
    }

    @Test
    public void test1063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1063");
        com.reservation_system.model.Guest guest5 = new com.reservation_system.model.Guest((-1), "Student", "andrew@example.com", "faculty", false);
        java.lang.String str6 = guest5.getName();
        java.lang.String str7 = guest5.getUserType();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Student" + "'", str6, "Student");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Guest" + "'", str7, "Guest");
    }

    @Test
    public void test1064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1064");
        com.reservation_system.model.User user6 = com.reservation_system.patterns.factory.UserFactory.createUser("Faculty", 103, "hi!", "researcher", "Faculty", true);
        org.junit.Assert.assertNotNull(user6);
    }

    @Test
    public void test1065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1065");
        com.reservation_system.model.LabManager labManager5 = new com.reservation_system.model.LabManager(0, "guest", "student", "faculty", false);
        boolean boolean6 = labManager5.requiresDepartmentApproval();
        boolean boolean7 = labManager5.isApproved();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test1066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1066");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("demo/data/test-users.csv");
        boolean boolean2 = userRepository1.headLabCoordinatorExists();
        com.reservation_system.services.RegistrationService registrationService3 = new com.reservation_system.services.RegistrationService(userRepository1);
        boolean boolean5 = userRepository1.emailExists("");
        java.util.Optional<com.reservation_system.model.User> userOptional7 = userRepository1.findByEmail("");
        boolean boolean8 = userRepository1.headLabCoordinatorExists();
        java.util.List<com.reservation_system.model.User> userList9 = userRepository1.getAllUsers();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
// flaky "17) test1066(com.reservation_system.randoop.registrationservice.RegressionTest2)":         org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(userOptional7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(userList9);
    }

    @Test
    public void test1067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1067");
        com.reservation_system.model.Guest guest5 = new com.reservation_system.model.Guest(32, "Andrew", "researcher", "Student", true);
        int int6 = guest5.getID();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 32 + "'", int6 == 32);
    }

    @Test
    public void test1068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1068");
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
        java.lang.String str33 = student31.getUserType();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Password1!" + "'", str15, "Password1!");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 101 + "'", int18 == 101);
        org.junit.Assert.assertNotNull(userList21);
        org.junit.Assert.assertNotNull(userList23);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "Student" + "'", str33, "Student");
    }

    @Test
    public void test1069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1069");
        com.reservation_system.model.Faculty faculty5 = new com.reservation_system.model.Faculty(97, "Guest", "Password1!", "headlabcoordinator", true);
    }

    @Test
    public void test1070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1070");
        com.reservation_system.model.Guest guest5 = new com.reservation_system.model.Guest((int) (byte) 100, "andrew@example.com", "student", "Researcher", false);
        java.lang.String str6 = guest5.getUserType();
        int int7 = guest5.getID();
        java.lang.String str8 = guest5.getName();
        java.lang.String str9 = guest5.getUserType();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Guest" + "'", str6, "Guest");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 100 + "'", int7 == 100);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Guest" + "'", str9, "Guest");
    }

    @Test
    public void test1071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1071");
        com.reservation_system.model.HeadLabCoordinator headLabCoordinator5 = new com.reservation_system.model.HeadLabCoordinator((-1), "researcher", "researcher", "hi!", true);
    }

    @Test
    public void test1072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1072");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("demo/data/test-users.csv");
        boolean boolean2 = userRepository1.headLabCoordinatorExists();
        com.reservation_system.services.RegistrationService registrationService3 = new com.reservation_system.services.RegistrationService(userRepository1);
        java.util.Optional<com.reservation_system.model.User> userOptional5 = userRepository1.findByEmail("researcher");
        com.reservation_system.services.RegistrationService registrationService6 = new com.reservation_system.services.RegistrationService(userRepository1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(userOptional5);
    }

    @Test
    public void test1073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1073");
        com.reservation_system.model.HeadLabCoordinator headLabCoordinator5 = new com.reservation_system.model.HeadLabCoordinator(97, "labmanager", "guest", "Password1!", false);
    }

    @Test
    public void test1074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1074");
        com.reservation_system.model.HeadLabCoordinator headLabCoordinator5 = new com.reservation_system.model.HeadLabCoordinator((int) '#', "researcher", "Password1!", "faculty", false);
        java.lang.String str6 = headLabCoordinator5.getUserType();
        java.lang.String str7 = headLabCoordinator5.getUserType();
        boolean boolean8 = headLabCoordinator5.requiresDepartmentApproval();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "headlabcoordinator" + "'", str6, "headlabcoordinator");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "headlabcoordinator" + "'", str7, "headlabcoordinator");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test1075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1075");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("demo/data/test-users.csv");
        com.reservation_system.services.RegistrationService registrationService2 = new com.reservation_system.services.RegistrationService(userRepository1);
        com.reservation_system.model.Faculty faculty8 = new com.reservation_system.model.Faculty(0, "Password1!", "demo/data/test-users.csv", "researcher", false);
        java.lang.String str9 = faculty8.getName();
        userRepository1.addUser((com.reservation_system.model.User) faculty8);
        boolean boolean11 = userRepository1.headLabCoordinatorExists();
        com.reservation_system.model.Guest guest17 = new com.reservation_system.model.Guest((int) (byte) -1, "guest", "Researcher", "Faculty", true);
        userRepository1.addUser((com.reservation_system.model.User) guest17);
        java.util.List<com.reservation_system.model.User> userList19 = userRepository1.getAllUsers();
        java.util.List<com.reservation_system.model.User> userList20 = userRepository1.getAllUsers();
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Password1!" + "'", str9, "Password1!");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(userList19);
        org.junit.Assert.assertNotNull(userList20);
    }

    @Test
    public void test1076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1076");
        com.reservation_system.model.LabManager labManager5 = new com.reservation_system.model.LabManager(102, "andrew@example.com", "researcher", "guest", true);
        java.lang.String str6 = labManager5.getEmail();
        java.lang.String str7 = labManager5.getUserType();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "researcher" + "'", str6, "researcher");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "labmanager" + "'", str7, "labmanager");
    }

    @Test
    public void test1077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1077");
        com.reservation_system.model.User user6 = com.reservation_system.patterns.factory.UserFactory.createUser("Researcher", (int) (byte) 0, "labmanager", "", "Guest", true);
        org.junit.Assert.assertNotNull(user6);
    }

    @Test
    public void test1078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1078");
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
        boolean boolean20 = userRepository9.emailExists("Faculty");
        int int21 = userRepository9.getNextID();
        com.reservation_system.model.Researcher researcher27 = new com.reservation_system.model.Researcher((int) (short) 10, "hi!", "Andrew", "Guest", false);
        java.lang.String str28 = researcher27.getUserType();
        userRepository9.addUser((com.reservation_system.model.User) researcher27);
        userRepository1.addUser((com.reservation_system.model.User) researcher27);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 101 + "'", int2 == 101);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 101 + "'", int3 == 101);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(userOptional7);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "Password1!" + "'", str17, "Password1!");
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 101 + "'", int21 == 101);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "Researcher" + "'", str28, "Researcher");
    }

    @Test
    public void test1079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1079");
        com.reservation_system.model.Guest guest5 = new com.reservation_system.model.Guest((int) ' ', "guest", "Password1!", "Faculty", true);
        java.lang.String str6 = guest5.getPassword();
        java.lang.String str7 = guest5.getUserType();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Faculty" + "'", str6, "Faculty");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Guest" + "'", str7, "Guest");
    }

    @Test
    public void test1080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1080");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("demo/data/test-users.csv");
        java.util.Optional<com.reservation_system.model.User> userOptional3 = userRepository1.findByEmail("hi!");
        boolean boolean5 = userRepository1.emailExists("Faculty");
        java.util.List<com.reservation_system.model.User> userList6 = userRepository1.getAllUsers();
        java.util.Optional<com.reservation_system.model.User> userOptional8 = userRepository1.findByEmail("");
        java.util.Optional<com.reservation_system.model.User> userOptional10 = userRepository1.findByEmail("faculty");
        org.junit.Assert.assertNotNull(userOptional3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(userList6);
        org.junit.Assert.assertNotNull(userOptional8);
        org.junit.Assert.assertNotNull(userOptional10);
    }

    @Test
    public void test1081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1081");
        com.reservation_system.model.Researcher researcher5 = new com.reservation_system.model.Researcher((int) (short) 1, "Password1!", "headlabcoordinator", "", false);
        researcher5.setApproved(true);
        boolean boolean8 = researcher5.requiresDepartmentApproval();
        int int9 = researcher5.getID();
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
    }

    @Test
    public void test1082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1082");
        com.reservation_system.model.Researcher researcher5 = new com.reservation_system.model.Researcher((int) (short) 10, "demo/data/test-users.csv", "", "Student", true);
    }

    @Test
    public void test1083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1083");
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
        java.util.List<com.reservation_system.model.User> userList16 = userRepository1.getAllUsers();
        com.reservation_system.repository.UserRepository userRepository18 = new com.reservation_system.repository.UserRepository("demo/data/test-users.csv");
        com.reservation_system.services.RegistrationService registrationService19 = new com.reservation_system.services.RegistrationService(userRepository18);
        com.reservation_system.model.Faculty faculty25 = new com.reservation_system.model.Faculty(0, "Password1!", "demo/data/test-users.csv", "researcher", false);
        java.lang.String str26 = faculty25.getName();
        userRepository18.addUser((com.reservation_system.model.User) faculty25);
        boolean boolean28 = userRepository18.headLabCoordinatorExists();
        int int29 = userRepository18.getNextID();
        com.reservation_system.repository.UserRepository userRepository31 = new com.reservation_system.repository.UserRepository("demo/data/test-users.csv");
        java.util.List<com.reservation_system.model.User> userList32 = userRepository31.getAllUsers();
        com.reservation_system.services.RegistrationService registrationService33 = new com.reservation_system.services.RegistrationService(userRepository31);
        java.util.List<com.reservation_system.model.User> userList34 = userRepository31.getAllUsers();
        userRepository18.saveAllUsers(userList34);
        userRepository1.saveAllUsers(userList34);
        boolean boolean38 = userRepository1.emailExists("guest");
        int int39 = userRepository1.getNextID();
        com.reservation_system.services.RegistrationService registrationService40 = new com.reservation_system.services.RegistrationService(userRepository1);
        // The following exception was thrown during execution in test generation
        try {
            com.reservation_system.model.User user45 = registrationService40.registerUser("Researcher", "", "labmanager", "faculty");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Name is required.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Password1!" + "'", str9, "Password1!");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(userList15);
        org.junit.Assert.assertNotNull(userList16);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "Password1!" + "'", str26, "Password1!");
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 101 + "'", int29 == 101);
        org.junit.Assert.assertNotNull(userList32);
        org.junit.Assert.assertNotNull(userList34);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + true + "'", boolean38 == true);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 101 + "'", int39 == 101);
    }

    @Test
    public void test1084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1084");
        com.reservation_system.model.Student student5 = new com.reservation_system.model.Student(32, "andrew@example.com", "hi!", "Faculty", true);
        java.lang.String str6 = student5.getPassword();
        boolean boolean7 = student5.isApproved();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Faculty" + "'", str6, "Faculty");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test1085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1085");
        com.reservation_system.model.Faculty faculty5 = new com.reservation_system.model.Faculty((int) (short) 0, "Faculty", "Password1!", "Faculty", true);
        boolean boolean6 = faculty5.isApproved();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test1086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1086");
        com.reservation_system.model.HeadLabCoordinator headLabCoordinator5 = new com.reservation_system.model.HeadLabCoordinator((int) (short) -1, "Student", "demo/data/test-users.csv", "Guest", true);
        java.lang.String str6 = headLabCoordinator5.getEmail();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "demo/data/test-users.csv" + "'", str6, "demo/data/test-users.csv");
    }

    @Test
    public void test1087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1087");
        com.reservation_system.model.Faculty faculty5 = new com.reservation_system.model.Faculty((-1), "Andrew", "hi!", "Andrew", true);
        java.lang.String str6 = faculty5.getUserType();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Faculty" + "'", str6, "Faculty");
    }

    @Test
    public void test1088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1088");
        com.reservation_system.model.User user6 = com.reservation_system.patterns.factory.UserFactory.createUser("researcher", (int) (short) 0, "hi!", "headlabcoordinator", "Researcher", false);
        org.junit.Assert.assertNotNull(user6);
    }

    @Test
    public void test1089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1089");
        com.reservation_system.model.LabManager labManager5 = new com.reservation_system.model.LabManager((int) (short) 10, "demo/data/test-users.csv", "Guest", "andrew@example.com", false);
        java.lang.String str6 = labManager5.getUserType();
        java.lang.String str7 = labManager5.getUserType();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "labmanager" + "'", str6, "labmanager");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "labmanager" + "'", str7, "labmanager");
    }

    @Test
    public void test1090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1090");
        com.reservation_system.model.HeadLabCoordinator headLabCoordinator5 = new com.reservation_system.model.HeadLabCoordinator((int) (byte) 1, "student", "Researcher", "", true);
        int int6 = headLabCoordinator5.getID();
        java.lang.String str7 = headLabCoordinator5.getUserType();
        int int8 = headLabCoordinator5.getID();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "headlabcoordinator" + "'", str7, "headlabcoordinator");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
    }

    @Test
    public void test1091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1091");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("demo/data/test-users.csv");
        java.util.List<com.reservation_system.model.User> userList2 = userRepository1.getAllUsers();
        com.reservation_system.services.RegistrationService registrationService3 = new com.reservation_system.services.RegistrationService(userRepository1);
        // The following exception was thrown during execution in test generation
        try {
            com.reservation_system.model.User user8 = registrationService3.registerUser("Researcher", "headlabcoordinator", "", "Guest");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Email is required.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(userList2);
    }

    @Test
    public void test1092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1092");
        com.reservation_system.model.Student student5 = new com.reservation_system.model.Student((int) '4', "", "headlabcoordinator", "student", false);
        java.lang.String str6 = student5.getUserType();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Student" + "'", str6, "Student");
    }

    @Test
    public void test1093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1093");
        com.reservation_system.model.Guest guest5 = new com.reservation_system.model.Guest((int) (short) 0, "Faculty", "Andrew", "andrew@example.com", true);
        java.lang.String str6 = guest5.getPassword();
        java.lang.String str7 = guest5.getUserType();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Guest" + "'", str7, "Guest");
    }

    @Test
    public void test1094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1094");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("demo/data/test-users.csv");
        com.reservation_system.services.RegistrationService registrationService2 = new com.reservation_system.services.RegistrationService(userRepository1);
        com.reservation_system.model.Faculty faculty8 = new com.reservation_system.model.Faculty(0, "Password1!", "demo/data/test-users.csv", "researcher", false);
        java.lang.String str9 = faculty8.getName();
        userRepository1.addUser((com.reservation_system.model.User) faculty8);
        boolean boolean12 = userRepository1.emailExists("Faculty");
        int int13 = userRepository1.getNextID();
        boolean boolean14 = userRepository1.headLabCoordinatorExists();
        boolean boolean16 = userRepository1.emailExists("Guest");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Password1!" + "'", str9, "Password1!");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 101 + "'", int13 == 101);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
    }

    @Test
    public void test1095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1095");
        com.reservation_system.model.HeadLabCoordinator headLabCoordinator5 = new com.reservation_system.model.HeadLabCoordinator(101, "Faculty", "labmanager", "Andrew", false);
    }

    @Test
    public void test1096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1096");
        com.reservation_system.model.Researcher researcher5 = new com.reservation_system.model.Researcher(98, "Student", "faculty", "hi!", false);
    }

    @Test
    public void test1097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1097");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("demo/data/test-users.csv");
        java.util.List<com.reservation_system.model.User> userList2 = userRepository1.getAllUsers();
        com.reservation_system.services.RegistrationService registrationService3 = new com.reservation_system.services.RegistrationService(userRepository1);
        java.util.List<com.reservation_system.model.User> userList4 = userRepository1.getAllUsers();
        boolean boolean6 = userRepository1.emailExists("Guest");
        java.util.List<com.reservation_system.model.User> userList7 = userRepository1.getAllUsers();
        java.util.Optional<com.reservation_system.model.User> userOptional9 = userRepository1.findByEmail("Password1!");
        java.util.Optional<com.reservation_system.model.User> userOptional11 = userRepository1.findByEmail("faculty");
        org.junit.Assert.assertNotNull(userList2);
        org.junit.Assert.assertNotNull(userList4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(userList7);
        org.junit.Assert.assertNotNull(userOptional9);
        org.junit.Assert.assertNotNull(userOptional11);
    }

    @Test
    public void test1098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1098");
        com.reservation_system.model.LabManager labManager5 = new com.reservation_system.model.LabManager((int) (short) 0, "headlabcoordinator", "hi!", "Faculty", false);
        boolean boolean6 = labManager5.isApproved();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test1099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1099");
        com.reservation_system.model.Faculty faculty5 = new com.reservation_system.model.Faculty((int) (byte) -1, "guest", "Student", "faculty", false);
        int int6 = faculty5.getID();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
    }

    @Test
    public void test1100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1100");
        com.reservation_system.model.Student student5 = new com.reservation_system.model.Student((int) '#', "labmanager", "Password1!", "student", false);
        java.lang.String str6 = student5.getUserType();
        java.lang.String str7 = student5.getUserType();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Student" + "'", str6, "Student");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Student" + "'", str7, "Student");
    }

    @Test
    public void test1101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1101");
        com.reservation_system.model.Researcher researcher5 = new com.reservation_system.model.Researcher((int) '#', "andrew@example.com", "demo/data/test-users.csv", "Andrew", false);
    }

    @Test
    public void test1102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1102");
        com.reservation_system.model.LabManager labManager5 = new com.reservation_system.model.LabManager(101, "student", "Faculty", "student", true);
    }

    @Test
    public void test1103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1103");
        com.reservation_system.model.Researcher researcher5 = new com.reservation_system.model.Researcher((int) (short) -1, "faculty", "researcher", "hi!", true);
        java.lang.String str6 = researcher5.getUserType();
        int int7 = researcher5.getID();
        boolean boolean8 = researcher5.requiresDepartmentApproval();
        java.lang.String str9 = researcher5.getUserType();
        java.lang.String str10 = researcher5.getEmail();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Researcher" + "'", str6, "Researcher");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Researcher" + "'", str9, "Researcher");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "researcher" + "'", str10, "researcher");
    }

    @Test
    public void test1104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1104");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("demo/data/test-users.csv");
        java.util.Optional<com.reservation_system.model.User> userOptional3 = userRepository1.findByEmail("hi!");
        int int4 = userRepository1.getNextID();
        boolean boolean5 = userRepository1.headLabCoordinatorExists();
        int int6 = userRepository1.getNextID();
        boolean boolean8 = userRepository1.emailExists("headlabcoordinator");
        com.reservation_system.services.RegistrationService registrationService9 = new com.reservation_system.services.RegistrationService(userRepository1);
        // The following exception was thrown during execution in test generation
        try {
            com.reservation_system.model.User user14 = registrationService9.registerUser("", "hi!", "guest", "demo/data/test-users.csv");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid user type.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(userOptional3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 101 + "'", int4 == 101);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 101 + "'", int6 == 101);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test1105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1105");
        com.reservation_system.model.Faculty faculty5 = new com.reservation_system.model.Faculty(0, "guest", "demo/data/test-users.csv", "guest", false);
    }

    @Test
    public void test1106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1106");
        com.reservation_system.model.Guest guest5 = new com.reservation_system.model.Guest((int) '#', "student", "demo/data/test-users.csv", "faculty", false);
        java.lang.String str6 = guest5.getUserType();
        java.lang.String str7 = guest5.getName();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Guest" + "'", str6, "Guest");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "student" + "'", str7, "student");
    }

    @Test
    public void test1107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1107");
        com.reservation_system.model.Guest guest5 = new com.reservation_system.model.Guest(52, "Faculty", "Faculty", "researcher", false);
        java.lang.String str6 = guest5.getUserType();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Guest" + "'", str6, "Guest");
    }

    @Test
    public void test1108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1108");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("demo/data/test-users.csv");
        java.util.List<com.reservation_system.model.User> userList2 = userRepository1.getAllUsers();
        com.reservation_system.services.RegistrationService registrationService3 = new com.reservation_system.services.RegistrationService(userRepository1);
        com.reservation_system.services.RegistrationService registrationService4 = new com.reservation_system.services.RegistrationService(userRepository1);
        // The following exception was thrown during execution in test generation
        try {
            com.reservation_system.model.User user9 = registrationService4.registerUser("student", "faculty", "Faculty", "Password1!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid email format.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(userList2);
    }

    @Test
    public void test1109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1109");
        com.reservation_system.model.Student student5 = new com.reservation_system.model.Student(0, "headlabcoordinator", "Researcher", "Researcher", true);
    }

    @Test
    public void test1110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1110");
        com.reservation_system.model.LabManager labManager5 = new com.reservation_system.model.LabManager((int) 'a', "Andrew", "andrew@example.com", "", true);
    }

    @Test
    public void test1111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1111");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("demo/data/test-users.csv");
        int int2 = userRepository1.getNextID();
        int int3 = userRepository1.getNextID();
        boolean boolean5 = userRepository1.emailExists("");
        boolean boolean7 = userRepository1.emailExists("faculty");
        java.util.Optional<com.reservation_system.model.User> userOptional9 = userRepository1.findByEmail("Password1!");
        boolean boolean11 = userRepository1.emailExists("headlabcoordinator");
        boolean boolean13 = userRepository1.emailExists("Andrew");
        int int14 = userRepository1.getNextID();
        java.lang.Class<?> wildcardClass15 = userRepository1.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 101 + "'", int2 == 101);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 101 + "'", int3 == 101);
// flaky "18) test1111(com.reservation_system.randoop.registrationservice.RegressionTest2)":         org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(userOptional9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 101 + "'", int14 == 101);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test1112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1112");
        com.reservation_system.model.Researcher researcher5 = new com.reservation_system.model.Researcher((-1), "demo/data/test-users.csv", "Guest", "Andrew", true);
        java.lang.String str6 = researcher5.getPassword();
        java.lang.String str7 = researcher5.getUserType();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Andrew" + "'", str6, "Andrew");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Researcher" + "'", str7, "Researcher");
    }

    @Test
    public void test1113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1113");
        com.reservation_system.model.Faculty faculty5 = new com.reservation_system.model.Faculty((int) '4', "labmanager", "hi!", "researcher", false);
        java.lang.String str6 = faculty5.getUserType();
        java.lang.String str7 = faculty5.getEmail();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Faculty" + "'", str6, "Faculty");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
    }

    @Test
    public void test1114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1114");
        com.reservation_system.model.Faculty faculty5 = new com.reservation_system.model.Faculty((int) (short) 10, "Student", "labmanager", "Researcher", false);
        java.lang.String str6 = faculty5.getUserType();
        java.lang.String str7 = faculty5.getUserType();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Faculty" + "'", str6, "Faculty");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Faculty" + "'", str7, "Faculty");
    }

    @Test
    public void test1115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1115");
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
        com.reservation_system.repository.UserRepository userRepository91 = new com.reservation_system.repository.UserRepository("demo/data/test-users.csv");
        java.util.List<com.reservation_system.model.User> userList92 = userRepository91.getAllUsers();
        com.reservation_system.services.RegistrationService registrationService93 = new com.reservation_system.services.RegistrationService(userRepository91);
        java.util.List<com.reservation_system.model.User> userList94 = userRepository91.getAllUsers();
        boolean boolean96 = userRepository91.emailExists("Guest");
        java.util.List<com.reservation_system.model.User> userList97 = userRepository91.getAllUsers();
        userRepository1.saveAllUsers(userList97);
        int int99 = userRepository1.getNextID();
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
        org.junit.Assert.assertTrue("'" + int89 + "' != '" + 101 + "'", int89 == 101);
        org.junit.Assert.assertNotNull(userList92);
        org.junit.Assert.assertNotNull(userList94);
        org.junit.Assert.assertTrue("'" + boolean96 + "' != '" + true + "'", boolean96 == true);
        org.junit.Assert.assertNotNull(userList97);
        org.junit.Assert.assertTrue("'" + int99 + "' != '" + 101 + "'", int99 == 101);
    }

    @Test
    public void test1116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1116");
        com.reservation_system.model.Researcher researcher5 = new com.reservation_system.model.Researcher((int) (short) -1, "andrew@example.com", "guest", "labmanager", false);
        java.lang.String str6 = researcher5.getPassword();
        boolean boolean7 = researcher5.requiresDepartmentApproval();
        boolean boolean8 = researcher5.requiresDepartmentApproval();
        java.lang.String str9 = researcher5.getUserType();
        java.lang.String str10 = researcher5.getUserType();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "labmanager" + "'", str6, "labmanager");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Researcher" + "'", str9, "Researcher");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Researcher" + "'", str10, "Researcher");
    }

    @Test
    public void test1117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1117");
        com.reservation_system.model.LabManager labManager5 = new com.reservation_system.model.LabManager(0, "guest", "", "Faculty", true);
        java.lang.String str6 = labManager5.getUserType();
        java.lang.String str7 = labManager5.getPassword();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "labmanager" + "'", str6, "labmanager");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Faculty" + "'", str7, "Faculty");
    }

    @Test
    public void test1118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1118");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("demo/data/test-users.csv");
        java.util.List<com.reservation_system.model.User> userList2 = userRepository1.getAllUsers();
        com.reservation_system.services.RegistrationService registrationService3 = new com.reservation_system.services.RegistrationService(userRepository1);
        java.util.List<com.reservation_system.model.User> userList4 = userRepository1.getAllUsers();
        boolean boolean6 = userRepository1.emailExists("Guest");
        java.util.List<com.reservation_system.model.User> userList7 = userRepository1.getAllUsers();
        java.util.Optional<com.reservation_system.model.User> userOptional9 = userRepository1.findByEmail("Password1!");
        boolean boolean10 = userRepository1.headLabCoordinatorExists();
        org.junit.Assert.assertNotNull(userList2);
        org.junit.Assert.assertNotNull(userList4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(userList7);
        org.junit.Assert.assertNotNull(userOptional9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test1119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1119");
        com.reservation_system.model.User user6 = com.reservation_system.patterns.factory.UserFactory.createUser("labmanager", (int) '4', "Guest", "faculty", "student", false);
        boolean boolean7 = user6.requiresDepartmentApproval();
        org.junit.Assert.assertNotNull(user6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test1120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1120");
        com.reservation_system.model.Guest guest5 = new com.reservation_system.model.Guest(0, "Andrew", "Faculty", "faculty", true);
    }

    @Test
    public void test1121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1121");
        com.reservation_system.model.Guest guest5 = new com.reservation_system.model.Guest((int) '#', "Guest", "researcher", "headlabcoordinator", true);
        java.lang.String str6 = guest5.getUserType();
        java.lang.String str7 = guest5.getUserType();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Guest" + "'", str6, "Guest");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Guest" + "'", str7, "Guest");
    }

    @Test
    public void test1122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1122");
        com.reservation_system.model.Researcher researcher5 = new com.reservation_system.model.Researcher((int) (byte) 10, "", "Guest", "headlabcoordinator", true);
        java.lang.String str6 = researcher5.getEmail();
        java.lang.String str7 = researcher5.getName();
        java.lang.String str8 = researcher5.getName();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Guest" + "'", str6, "Guest");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test1123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1123");
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
        boolean boolean20 = headLabCoordinator18.isApproved();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
// flaky "19) test1123(com.reservation_system.randoop.registrationservice.RegressionTest2)":         org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(userOptional7);
        org.junit.Assert.assertNotNull(userOptional9);
        org.junit.Assert.assertNotNull(userOptional12);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
    }

    @Test
    public void test1124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1124");
        com.reservation_system.model.Student student5 = new com.reservation_system.model.Student((int) (short) 100, "", "", "", true);
    }

    @Test
    public void test1125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1125");
        com.reservation_system.model.HeadLabCoordinator headLabCoordinator5 = new com.reservation_system.model.HeadLabCoordinator(10, "andrew@example.com", "faculty", "demo/data/test-users.csv", false);
        java.lang.String str6 = headLabCoordinator5.getUserType();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "headlabcoordinator" + "'", str6, "headlabcoordinator");
    }

    @Test
    public void test1126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1126");
        com.reservation_system.model.Student student5 = new com.reservation_system.model.Student(35, "student", "student", "guest", true);
    }

    @Test
    public void test1127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1127");
        com.reservation_system.model.Student student5 = new com.reservation_system.model.Student((int) (byte) 100, "Researcher", "", "", false);
        int int6 = student5.getID();
        int int7 = student5.getID();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 100 + "'", int7 == 100);
    }

    @Test
    public void test1128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1128");
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
        java.util.Optional<com.reservation_system.model.User> userOptional31 = userRepository1.findByEmail("");
        org.junit.Assert.assertNotNull(userList2);
        org.junit.Assert.assertNotNull(userList4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(userList7);
        org.junit.Assert.assertNotNull(userOptional9);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "Password1!" + "'", str19, "Password1!");
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 101 + "'", int22 == 101);
        org.junit.Assert.assertNotNull(userList25);
        org.junit.Assert.assertNotNull(userList27);
        org.junit.Assert.assertNotNull(userOptional31);
    }

    @Test
    public void test1129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1129");
        com.reservation_system.model.Faculty faculty5 = new com.reservation_system.model.Faculty(97, "faculty", "andrew@example.com", "headlabcoordinator", false);
    }

    @Test
    public void test1130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1130");
        com.reservation_system.model.Guest guest5 = new com.reservation_system.model.Guest((int) (byte) 100, "andrew@example.com", "Researcher", "Researcher", true);
        guest5.setApproved(true);
        java.lang.String str8 = guest5.getUserType();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Guest" + "'", str8, "Guest");
    }

    @Test
    public void test1131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1131");
        com.reservation_system.model.HeadLabCoordinator headLabCoordinator5 = new com.reservation_system.model.HeadLabCoordinator((int) (byte) 100, "researcher", "Researcher", "Student", true);
        java.lang.String str6 = headLabCoordinator5.getPassword();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Student" + "'", str6, "Student");
    }

    @Test
    public void test1132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1132");
        com.reservation_system.model.Guest guest5 = new com.reservation_system.model.Guest(0, "headlabcoordinator", "Faculty", "researcher", false);
    }

    @Test
    public void test1133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1133");
        com.reservation_system.model.Guest guest5 = new com.reservation_system.model.Guest(100, "headlabcoordinator", "faculty", "Faculty", true);
        java.lang.String str6 = guest5.getUserType();
        java.lang.String str7 = guest5.getUserType();
        boolean boolean8 = guest5.isApproved();
        java.lang.String str9 = guest5.getUserType();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Guest" + "'", str6, "Guest");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Guest" + "'", str7, "Guest");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Guest" + "'", str9, "Guest");
    }

    @Test
    public void test1134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1134");
        com.reservation_system.model.Faculty faculty5 = new com.reservation_system.model.Faculty((int) '4', "Andrew", "", "faculty", false);
        java.lang.String str6 = faculty5.getUserType();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Faculty" + "'", str6, "Faculty");
    }

    @Test
    public void test1135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1135");
        com.reservation_system.model.Student student5 = new com.reservation_system.model.Student(52, "hi!", "Guest", "Researcher", false);
        boolean boolean6 = student5.requiresDepartmentApproval();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test1136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1136");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("demo/data/test-users.csv");
        com.reservation_system.services.RegistrationService registrationService2 = new com.reservation_system.services.RegistrationService(userRepository1);
        com.reservation_system.model.Faculty faculty8 = new com.reservation_system.model.Faculty(0, "Password1!", "demo/data/test-users.csv", "researcher", false);
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
        boolean boolean29 = faculty27.isApproved();
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Password1!" + "'", str9, "Password1!");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(userList13);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
    }

    @Test
    public void test1137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1137");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("demo/data/test-users.csv");
        boolean boolean2 = userRepository1.headLabCoordinatorExists();
        com.reservation_system.services.RegistrationService registrationService3 = new com.reservation_system.services.RegistrationService(userRepository1);
        boolean boolean5 = userRepository1.emailExists("");
        java.util.Optional<com.reservation_system.model.User> userOptional7 = userRepository1.findByEmail("");
        boolean boolean8 = userRepository1.headLabCoordinatorExists();
        boolean boolean9 = userRepository1.headLabCoordinatorExists();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(userOptional7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test1138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1138");
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
        com.reservation_system.repository.UserRepository userRepository51 = new com.reservation_system.repository.UserRepository("demo/data/test-users.csv");
        int int52 = userRepository51.getNextID();
        int int53 = userRepository51.getNextID();
        boolean boolean55 = userRepository51.emailExists("faculty");
        com.reservation_system.model.LabManager labManager61 = new com.reservation_system.model.LabManager((int) (short) 0, "", "labmanager", "Password1!", true);
        userRepository51.addUser((com.reservation_system.model.User) labManager61);
        java.util.Optional<com.reservation_system.model.User> userOptional64 = userRepository51.findByEmail("");
        com.reservation_system.model.Researcher researcher70 = new com.reservation_system.model.Researcher((int) (byte) 100, "Password1!", "Password1!", "headlabcoordinator", true);
        userRepository51.addUser((com.reservation_system.model.User) researcher70);
        java.util.List<com.reservation_system.model.User> userList72 = userRepository51.getAllUsers();
        userRepository1.saveAllUsers(userList72);
        com.reservation_system.services.RegistrationService registrationService74 = new com.reservation_system.services.RegistrationService(userRepository1);
        // The following exception was thrown during execution in test generation
        try {
            com.reservation_system.model.User user79 = registrationService74.registerUser("andrew@example.com", "researcher", "faculty", "guest");
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
        org.junit.Assert.assertTrue("'" + int52 + "' != '" + 101 + "'", int52 == 101);
        org.junit.Assert.assertTrue("'" + int53 + "' != '" + 101 + "'", int53 == 101);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + true + "'", boolean55 == true);
        org.junit.Assert.assertNotNull(userOptional64);
        org.junit.Assert.assertNotNull(userList72);
    }

    @Test
    public void test1139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1139");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("demo/data/test-users.csv");
        int int2 = userRepository1.getNextID();
        int int3 = userRepository1.getNextID();
        boolean boolean5 = userRepository1.emailExists("faculty");
        com.reservation_system.model.Faculty faculty11 = new com.reservation_system.model.Faculty(10, "researcher", "faculty", "", false);
        java.lang.String str12 = faculty11.getEmail();
        java.lang.String str13 = faculty11.getUserType();
        int int14 = faculty11.getID();
        userRepository1.addUser((com.reservation_system.model.User) faculty11);
        java.lang.String str16 = faculty11.getUserType();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 101 + "'", int2 == 101);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 101 + "'", int3 == 101);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "faculty" + "'", str12, "faculty");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Faculty" + "'", str13, "Faculty");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 10 + "'", int14 == 10);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Faculty" + "'", str16, "Faculty");
    }

    @Test
    public void test1140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1140");
        com.reservation_system.model.Faculty faculty5 = new com.reservation_system.model.Faculty(10, "researcher", "faculty", "", false);
        java.lang.String str6 = faculty5.getEmail();
        java.lang.String str7 = faculty5.getUserType();
        faculty5.setApproved(true);
        faculty5.setApproved(true);
        int int12 = faculty5.getID();
        boolean boolean13 = faculty5.isApproved();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "faculty" + "'", str6, "faculty");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Faculty" + "'", str7, "Faculty");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 10 + "'", int12 == 10);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test1141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1141");
        com.reservation_system.model.Student student5 = new com.reservation_system.model.Student((int) (byte) 10, "Password1!", "Andrew", "faculty", false);
        java.lang.String str6 = student5.getPassword();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "faculty" + "'", str6, "faculty");
    }

    @Test
    public void test1142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1142");
        com.reservation_system.model.Student student5 = new com.reservation_system.model.Student((int) (byte) -1, "demo/data/test-users.csv", "Student", "andrew@example.com", true);
    }

    @Test
    public void test1143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1143");
        com.reservation_system.model.LabManager labManager5 = new com.reservation_system.model.LabManager(33, "researcher", "", "hi!", true);
    }

    @Test
    public void test1144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1144");
        com.reservation_system.model.Faculty faculty5 = new com.reservation_system.model.Faculty((int) (byte) 1, "guest", "", "headlabcoordinator", false);
        boolean boolean6 = faculty5.requiresDepartmentApproval();
        java.lang.String str7 = faculty5.getUserType();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Faculty" + "'", str7, "Faculty");
    }

    @Test
    public void test1145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1145");
        com.reservation_system.model.Guest guest5 = new com.reservation_system.model.Guest((int) (short) -1, "Andrew", "Researcher", "Student", true);
    }

    @Test
    public void test1146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1146");
        // The following exception was thrown during execution in test generation
        try {
            com.reservation_system.model.User user6 = com.reservation_system.patterns.factory.UserFactory.createUser("", (int) (short) 10, "Password1!", "hi!", "headlabcoordinator", false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid user type: ");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1147");
        com.reservation_system.model.Researcher researcher5 = new com.reservation_system.model.Researcher(0, "demo/data/test-users.csv", "Andrew", "Password1!", false);
        java.lang.String str6 = researcher5.getUserType();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Researcher" + "'", str6, "Researcher");
    }

    @Test
    public void test1148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1148");
        com.reservation_system.model.LabManager labManager5 = new com.reservation_system.model.LabManager((int) (short) -1, "headlabcoordinator", "faculty", "andrew@example.com", false);
        java.lang.String str6 = labManager5.getUserType();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "labmanager" + "'", str6, "labmanager");
    }

    @Test
    public void test1149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1149");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("demo/data/test-users.csv");
        java.util.List<com.reservation_system.model.User> userList2 = userRepository1.getAllUsers();
        com.reservation_system.services.RegistrationService registrationService3 = new com.reservation_system.services.RegistrationService(userRepository1);
        java.util.List<com.reservation_system.model.User> userList4 = userRepository1.getAllUsers();
        boolean boolean6 = userRepository1.emailExists("Guest");
        com.reservation_system.model.HeadLabCoordinator headLabCoordinator12 = new com.reservation_system.model.HeadLabCoordinator((int) (byte) -1, "", "", "Faculty", true);
        userRepository1.addUser((com.reservation_system.model.User) headLabCoordinator12);
        java.lang.String str14 = headLabCoordinator12.getUserType();
        org.junit.Assert.assertNotNull(userList2);
        org.junit.Assert.assertNotNull(userList4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "headlabcoordinator" + "'", str14, "headlabcoordinator");
    }

    @Test
    public void test1150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1150");
        com.reservation_system.model.LabManager labManager5 = new com.reservation_system.model.LabManager(100, "", "andrew@example.com", "hi!", true);
    }

    @Test
    public void test1151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1151");
        // The following exception was thrown during execution in test generation
        try {
            com.reservation_system.model.User user6 = com.reservation_system.patterns.factory.UserFactory.createUser("hi!", 97, "faculty", "demo/data/test-users.csv", "student", true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid user type: hi!");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1152");
        com.reservation_system.model.Researcher researcher5 = new com.reservation_system.model.Researcher(100, "demo/data/test-users.csv", "Faculty", "hi!", false);
    }

    @Test
    public void test1153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1153");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("demo/data/test-users.csv");
        java.util.Optional<com.reservation_system.model.User> userOptional3 = userRepository1.findByEmail("hi!");
        boolean boolean5 = userRepository1.emailExists("");
        java.lang.Class<?> wildcardClass6 = userRepository1.getClass();
        org.junit.Assert.assertNotNull(userOptional3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test1154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1154");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("demo/data/test-users.csv");
        java.util.Optional<com.reservation_system.model.User> userOptional3 = userRepository1.findByEmail("hi!");
        int int4 = userRepository1.getNextID();
        boolean boolean5 = userRepository1.headLabCoordinatorExists();
        java.util.List<com.reservation_system.model.User> userList6 = userRepository1.getAllUsers();
        com.reservation_system.services.RegistrationService registrationService7 = new com.reservation_system.services.RegistrationService(userRepository1);
        // The following exception was thrown during execution in test generation
        try {
            com.reservation_system.model.User user12 = registrationService7.registerUser("Faculty", "labmanager", "Guest", "Researcher");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid email format.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(userOptional3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 101 + "'", int4 == 101);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(userList6);
    }

    @Test
    public void test1155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1155");
        com.reservation_system.model.HeadLabCoordinator headLabCoordinator5 = new com.reservation_system.model.HeadLabCoordinator(33, "guest", "student", "", true);
    }

    @Test
    public void test1156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1156");
        com.reservation_system.model.Student student5 = new com.reservation_system.model.Student((int) 'a', "Faculty", "researcher", "faculty", true);
    }

    @Test
    public void test1157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1157");
        com.reservation_system.model.Guest guest5 = new com.reservation_system.model.Guest((int) (byte) -1, "labmanager", "Guest", "faculty", false);
        java.lang.String str6 = guest5.getName();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "labmanager" + "'", str6, "labmanager");
    }

    @Test
    public void test1158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1158");
        com.reservation_system.model.Guest guest5 = new com.reservation_system.model.Guest(0, "demo/data/test-users.csv", "student", "Researcher", true);
        guest5.setApproved(false);
    }

    @Test
    public void test1159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1159");
        com.reservation_system.model.Researcher researcher5 = new com.reservation_system.model.Researcher((int) (byte) -1, "labmanager", "Guest", "andrew@example.com", false);
        boolean boolean6 = researcher5.isApproved();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test1160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1160");
        com.reservation_system.model.LabManager labManager5 = new com.reservation_system.model.LabManager((int) (byte) 100, "researcher", "demo/data/test-users.csv", "Student", false);
        boolean boolean6 = labManager5.requiresDepartmentApproval();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test1161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1161");
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
        java.util.List<com.reservation_system.model.User> userList92 = userRepository1.getAllUsers();
        java.util.List<com.reservation_system.model.User> userList93 = userRepository1.getAllUsers();
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Password1!" + "'", str9, "Password1!");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 101 + "'", int23 == 101);
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
        org.junit.Assert.assertNotNull(userList89);
        org.junit.Assert.assertNotNull(userOptional91);
        org.junit.Assert.assertNotNull(userList92);
        org.junit.Assert.assertNotNull(userList93);
    }

    @Test
    public void test1162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1162");
        com.reservation_system.model.LabManager labManager5 = new com.reservation_system.model.LabManager(10, "Student", "researcher", "labmanager", false);
        java.lang.String str6 = labManager5.getUserType();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "labmanager" + "'", str6, "labmanager");
    }

    @Test
    public void test1163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1163");
        com.reservation_system.model.Student student5 = new com.reservation_system.model.Student(0, "Guest", "", "Student", true);
    }

    @Test
    public void test1164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1164");
        com.reservation_system.model.Student student5 = new com.reservation_system.model.Student((int) '4', "student", "Guest", "labmanager", true);
        java.lang.Class<?> wildcardClass6 = student5.getClass();
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test1165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1165");
        com.reservation_system.model.Guest guest5 = new com.reservation_system.model.Guest((-1), "Student", "andrew@example.com", "faculty", false);
        java.lang.String str6 = guest5.getPassword();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "faculty" + "'", str6, "faculty");
    }

    @Test
    public void test1166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1166");
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
        // The following exception was thrown during execution in test generation
        try {
            com.reservation_system.model.User user22 = registrationService17.registerUser("Andrew", "Guest", "Researcher", "");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid user type.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Password1!" + "'", str12, "Password1!");
        org.junit.Assert.assertNotNull(userList14);
    }

    @Test
    public void test1167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1167");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("demo/data/test-users.csv");
        int int2 = userRepository1.getNextID();
        int int3 = userRepository1.getNextID();
        boolean boolean5 = userRepository1.emailExists("faculty");
        com.reservation_system.model.LabManager labManager11 = new com.reservation_system.model.LabManager((int) (short) 0, "", "labmanager", "Password1!", true);
        userRepository1.addUser((com.reservation_system.model.User) labManager11);
        java.util.Optional<com.reservation_system.model.User> userOptional14 = userRepository1.findByEmail("");
        com.reservation_system.model.Researcher researcher20 = new com.reservation_system.model.Researcher((int) (byte) 100, "Password1!", "Password1!", "headlabcoordinator", true);
        userRepository1.addUser((com.reservation_system.model.User) researcher20);
        boolean boolean22 = userRepository1.headLabCoordinatorExists();
        java.util.Optional<com.reservation_system.model.User> userOptional24 = userRepository1.findByEmail("headlabcoordinator");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 101 + "'", int2 == 101);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 101 + "'", int3 == 101);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(userOptional14);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertNotNull(userOptional24);
    }

    @Test
    public void test1168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1168");
        // The following exception was thrown during execution in test generation
        try {
            com.reservation_system.model.User user6 = com.reservation_system.patterns.factory.UserFactory.createUser("Andrew", 35, "", "Researcher", "Andrew", false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid user type: Andrew");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1169");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("demo/data/test-users.csv");
        java.util.Optional<com.reservation_system.model.User> userOptional3 = userRepository1.findByEmail("hi!");
        int int4 = userRepository1.getNextID();
        com.reservation_system.model.Researcher researcher10 = new com.reservation_system.model.Researcher((int) (byte) 10, "", "Guest", "headlabcoordinator", true);
        userRepository1.addUser((com.reservation_system.model.User) researcher10);
        boolean boolean12 = userRepository1.headLabCoordinatorExists();
        boolean boolean14 = userRepository1.emailExists("Andrew");
        org.junit.Assert.assertNotNull(userOptional3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 101 + "'", int4 == 101);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test1170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1170");
        com.reservation_system.model.Student student5 = new com.reservation_system.model.Student(100, "Faculty", "Student", "hi!", true);
        java.lang.String str6 = student5.getUserType();
        int int7 = student5.getID();
        boolean boolean8 = student5.requiresDepartmentApproval();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Student" + "'", str6, "Student");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 100 + "'", int7 == 100);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test1171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1171");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("demo/data/test-users.csv");
        com.reservation_system.services.RegistrationService registrationService2 = new com.reservation_system.services.RegistrationService(userRepository1);
        com.reservation_system.model.Faculty faculty8 = new com.reservation_system.model.Faculty(0, "Password1!", "demo/data/test-users.csv", "researcher", false);
        java.lang.String str9 = faculty8.getName();
        userRepository1.addUser((com.reservation_system.model.User) faculty8);
        boolean boolean12 = userRepository1.emailExists("Faculty");
        int int13 = userRepository1.getNextID();
        com.reservation_system.services.RegistrationService registrationService14 = new com.reservation_system.services.RegistrationService(userRepository1);
        boolean boolean16 = userRepository1.emailExists("student");
        com.reservation_system.services.RegistrationService registrationService17 = new com.reservation_system.services.RegistrationService(userRepository1);
        com.reservation_system.repository.UserRepository userRepository19 = new com.reservation_system.repository.UserRepository("demo/data/test-users.csv");
        java.util.List<com.reservation_system.model.User> userList20 = userRepository19.getAllUsers();
        com.reservation_system.services.RegistrationService registrationService21 = new com.reservation_system.services.RegistrationService(userRepository19);
        java.util.List<com.reservation_system.model.User> userList22 = userRepository19.getAllUsers();
        boolean boolean24 = userRepository19.emailExists("Guest");
        java.util.List<com.reservation_system.model.User> userList25 = userRepository19.getAllUsers();
        userRepository1.saveAllUsers(userList25);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Password1!" + "'", str9, "Password1!");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 101 + "'", int13 == 101);
// flaky "20) test1171(com.reservation_system.randoop.registrationservice.RegressionTest2)":         org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNotNull(userList20);
        org.junit.Assert.assertNotNull(userList22);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertNotNull(userList25);
    }

    @Test
    public void test1172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1172");
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
        com.reservation_system.model.User user43 = com.reservation_system.patterns.factory.UserFactory.createUser("Guest", (-1), "researcher", "researcher", "demo/data/test-users.csv", true);
        userRepository1.addUser(user43);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Password1!" + "'", str14, "Password1!");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
        org.junit.Assert.assertNotNull(userList26);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertNotNull(user43);
    }

    @Test
    public void test1173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1173");
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
        java.util.Optional<com.reservation_system.model.User> userOptional49 = userRepository1.findByEmail("student");
        boolean boolean51 = userRepository1.emailExists("andrew@example.com");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Password1!" + "'", str9, "Password1!");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "Password1!" + "'", str29, "Password1!");
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "Password1!" + "'", str41, "Password1!");
        org.junit.Assert.assertNotNull(userList43);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + true + "'", boolean47 == true);
        org.junit.Assert.assertNotNull(userOptional49);
// flaky "21) test1173(com.reservation_system.randoop.registrationservice.RegressionTest2)":         org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + true + "'", boolean51 == true);
    }

    @Test
    public void test1174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1174");
        com.reservation_system.model.LabManager labManager5 = new com.reservation_system.model.LabManager((int) (short) -1, "labmanager", "demo/data/test-users.csv", "Student", false);
        java.lang.String str6 = labManager5.getEmail();
        java.lang.String str7 = labManager5.getUserType();
        java.lang.String str8 = labManager5.getEmail();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "demo/data/test-users.csv" + "'", str6, "demo/data/test-users.csv");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "labmanager" + "'", str7, "labmanager");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "demo/data/test-users.csv" + "'", str8, "demo/data/test-users.csv");
    }

    @Test
    public void test1175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1175");
        com.reservation_system.model.HeadLabCoordinator headLabCoordinator5 = new com.reservation_system.model.HeadLabCoordinator((int) (byte) 1, "Password1!", "Password1!", "headlabcoordinator", true);
    }

    @Test
    public void test1176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1176");
        com.reservation_system.model.LabManager labManager5 = new com.reservation_system.model.LabManager(103, "guest", "student", "Student", true);
        int int6 = labManager5.getID();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 103 + "'", int6 == 103);
    }

    @Test
    public void test1177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1177");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("demo/data/test-users.csv");
        java.util.Optional<com.reservation_system.model.User> userOptional3 = userRepository1.findByEmail("hi!");
        int int4 = userRepository1.getNextID();
        com.reservation_system.model.Researcher researcher10 = new com.reservation_system.model.Researcher((int) (byte) 10, "", "Guest", "headlabcoordinator", true);
        userRepository1.addUser((com.reservation_system.model.User) researcher10);
        java.util.List<com.reservation_system.model.User> userList12 = userRepository1.getAllUsers();
        int int13 = userRepository1.getNextID();
        com.reservation_system.repository.UserRepository userRepository15 = new com.reservation_system.repository.UserRepository("demo/data/test-users.csv");
        com.reservation_system.services.RegistrationService registrationService16 = new com.reservation_system.services.RegistrationService(userRepository15);
        int int17 = userRepository15.getNextID();
        boolean boolean19 = userRepository15.emailExists("labmanager");
        java.util.List<com.reservation_system.model.User> userList20 = userRepository15.getAllUsers();
        userRepository1.saveAllUsers(userList20);
        java.util.List<com.reservation_system.model.User> userList22 = userRepository1.getAllUsers();
        org.junit.Assert.assertNotNull(userOptional3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 101 + "'", int4 == 101);
        org.junit.Assert.assertNotNull(userList12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 101 + "'", int13 == 101);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 101 + "'", int17 == 101);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNotNull(userList20);
        org.junit.Assert.assertNotNull(userList22);
    }

    @Test
    public void test1178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1178");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("demo/data/test-users.csv");
        com.reservation_system.services.RegistrationService registrationService2 = new com.reservation_system.services.RegistrationService(userRepository1);
        com.reservation_system.model.Faculty faculty8 = new com.reservation_system.model.Faculty(0, "Password1!", "demo/data/test-users.csv", "researcher", false);
        java.lang.String str9 = faculty8.getName();
        userRepository1.addUser((com.reservation_system.model.User) faculty8);
        boolean boolean11 = userRepository1.headLabCoordinatorExists();
        com.reservation_system.services.RegistrationService registrationService12 = new com.reservation_system.services.RegistrationService(userRepository1);
        com.reservation_system.model.Researcher researcher18 = new com.reservation_system.model.Researcher((int) '4', "labmanager", "Andrew", "researcher", true);
        userRepository1.addUser((com.reservation_system.model.User) researcher18);
        boolean boolean20 = userRepository1.headLabCoordinatorExists();
        java.util.Optional<com.reservation_system.model.User> userOptional22 = userRepository1.findByEmail("Student");
        com.reservation_system.repository.UserRepository userRepository24 = new com.reservation_system.repository.UserRepository("demo/data/test-users.csv");
        boolean boolean25 = userRepository24.headLabCoordinatorExists();
        com.reservation_system.services.RegistrationService registrationService26 = new com.reservation_system.services.RegistrationService(userRepository24);
        boolean boolean28 = userRepository24.emailExists("");
        java.util.Optional<com.reservation_system.model.User> userOptional30 = userRepository24.findByEmail("");
        java.util.Optional<com.reservation_system.model.User> userOptional32 = userRepository24.findByEmail("hi!");
        java.util.List<com.reservation_system.model.User> userList33 = userRepository24.getAllUsers();
        userRepository1.saveAllUsers(userList33);
        com.reservation_system.services.RegistrationService registrationService35 = new com.reservation_system.services.RegistrationService(userRepository1);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Password1!" + "'", str9, "Password1!");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertNotNull(userOptional22);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertNotNull(userOptional30);
        org.junit.Assert.assertNotNull(userOptional32);
        org.junit.Assert.assertNotNull(userList33);
    }

    @Test
    public void test1179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1179");
        com.reservation_system.model.Guest guest5 = new com.reservation_system.model.Guest((int) '#', "Andrew", "student", "Faculty", false);
        java.lang.String str6 = guest5.getUserType();
        guest5.setApproved(true);
        java.lang.String str9 = guest5.getUserType();
        java.lang.String str10 = guest5.getName();
        boolean boolean11 = guest5.isApproved();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Guest" + "'", str6, "Guest");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Guest" + "'", str9, "Guest");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Andrew" + "'", str10, "Andrew");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test1180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1180");
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
        int int44 = userRepository25.getNextID();
        java.util.List<com.reservation_system.model.User> userList45 = userRepository25.getAllUsers();
        userRepository1.saveAllUsers(userList45);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Password1!" + "'", str12, "Password1!");
        org.junit.Assert.assertNotNull(userList14);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 101 + "'", int23 == 101);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "Password1!" + "'", str33, "Password1!");
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + true + "'", boolean43 == true);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 101 + "'", int44 == 101);
        org.junit.Assert.assertNotNull(userList45);
    }

    @Test
    public void test1181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1181");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("demo/data/test-users.csv");
        java.util.Optional<com.reservation_system.model.User> userOptional3 = userRepository1.findByEmail("hi!");
        int int4 = userRepository1.getNextID();
        com.reservation_system.model.Researcher researcher10 = new com.reservation_system.model.Researcher((int) (byte) 10, "", "Guest", "headlabcoordinator", true);
        userRepository1.addUser((com.reservation_system.model.User) researcher10);
        java.util.List<com.reservation_system.model.User> userList12 = userRepository1.getAllUsers();
        java.util.Optional<com.reservation_system.model.User> userOptional14 = userRepository1.findByEmail("andrew@example.com");
        com.reservation_system.services.RegistrationService registrationService15 = new com.reservation_system.services.RegistrationService(userRepository1);
        // The following exception was thrown during execution in test generation
        try {
            com.reservation_system.model.User user20 = registrationService15.registerUser("student", "labmanager", "demo/data/test-users.csv", "Guest");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid email format.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(userOptional3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 101 + "'", int4 == 101);
        org.junit.Assert.assertNotNull(userList12);
        org.junit.Assert.assertNotNull(userOptional14);
    }

    @Test
    public void test1182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1182");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("demo/data/test-users.csv");
        int int2 = userRepository1.getNextID();
        int int3 = userRepository1.getNextID();
        boolean boolean5 = userRepository1.emailExists("faculty");
        java.util.List<com.reservation_system.model.User> userList6 = userRepository1.getAllUsers();
        boolean boolean8 = userRepository1.emailExists("andrew@example.com");
        boolean boolean9 = userRepository1.headLabCoordinatorExists();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 101 + "'", int2 == 101);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 101 + "'", int3 == 101);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(userList6);
// flaky "22) test1182(com.reservation_system.randoop.registrationservice.RegressionTest2)":         org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test1183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1183");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("demo/data/test-users.csv");
        com.reservation_system.services.RegistrationService registrationService2 = new com.reservation_system.services.RegistrationService(userRepository1);
        com.reservation_system.model.Faculty faculty8 = new com.reservation_system.model.Faculty(0, "Password1!", "demo/data/test-users.csv", "researcher", false);
        java.lang.String str9 = faculty8.getName();
        userRepository1.addUser((com.reservation_system.model.User) faculty8);
        java.util.List<com.reservation_system.model.User> userList11 = userRepository1.getAllUsers();
        com.reservation_system.model.LabManager labManager17 = new com.reservation_system.model.LabManager((int) (short) -1, "labmanager", "demo/data/test-users.csv", "Student", false);
        userRepository1.addUser((com.reservation_system.model.User) labManager17);
        com.reservation_system.services.RegistrationService registrationService19 = new com.reservation_system.services.RegistrationService(userRepository1);
        boolean boolean21 = userRepository1.emailExists("demo/data/test-users.csv");
        int int22 = userRepository1.getNextID();
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Password1!" + "'", str9, "Password1!");
        org.junit.Assert.assertNotNull(userList11);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 101 + "'", int22 == 101);
    }

    @Test
    public void test1184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1184");
        com.reservation_system.model.Guest guest5 = new com.reservation_system.model.Guest((-1), "demo/data/test-users.csv", "", "Researcher", true);
        java.lang.String str6 = guest5.getEmail();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
    }

    @Test
    public void test1185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1185");
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
        boolean boolean37 = userRepository1.headLabCoordinatorExists();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Password1!" + "'", str14, "Password1!");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
        org.junit.Assert.assertNotNull(userList26);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
    }

    @Test
    public void test1186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1186");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("demo/data/test-users.csv");
        com.reservation_system.services.RegistrationService registrationService2 = new com.reservation_system.services.RegistrationService(userRepository1);
        com.reservation_system.model.Faculty faculty8 = new com.reservation_system.model.Faculty(0, "Password1!", "demo/data/test-users.csv", "researcher", false);
        java.lang.String str9 = faculty8.getName();
        userRepository1.addUser((com.reservation_system.model.User) faculty8);
        boolean boolean12 = userRepository1.emailExists("Faculty");
        int int13 = userRepository1.getNextID();
        com.reservation_system.services.RegistrationService registrationService14 = new com.reservation_system.services.RegistrationService(userRepository1);
        boolean boolean16 = userRepository1.emailExists("student");
        com.reservation_system.services.RegistrationService registrationService17 = new com.reservation_system.services.RegistrationService(userRepository1);
        com.reservation_system.model.User user18 = null;
        // The following exception was thrown during execution in test generation
        try {
            userRepository1.addUser(user18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Password1!" + "'", str9, "Password1!");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 101 + "'", int13 == 101);
// flaky "23) test1186(com.reservation_system.randoop.registrationservice.RegressionTest2)":         org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
    }

    @Test
    public void test1187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1187");
        com.reservation_system.model.Researcher researcher5 = new com.reservation_system.model.Researcher(102, "andrew@example.com", "Andrew", "hi!", true);
        java.lang.String str6 = researcher5.getEmail();
        java.lang.Class<?> wildcardClass7 = researcher5.getClass();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Andrew" + "'", str6, "Andrew");
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test1188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1188");
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
        boolean boolean30 = userRepository1.headLabCoordinatorExists();
        com.reservation_system.services.RegistrationService registrationService31 = new com.reservation_system.services.RegistrationService(userRepository1);
        // The following exception was thrown during execution in test generation
        try {
            com.reservation_system.model.User user36 = registrationService31.registerUser("labmanager", "Student", "Password1!", "Guest");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Lab manager accounts must be generated by the head lab coordinator.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 101 + "'", int2 == 101);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 101 + "'", int3 == 101);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(userOptional14);
        org.junit.Assert.assertNotNull(userList22);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
    }

    @Test
    public void test1189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1189");
        com.reservation_system.model.LabManager labManager5 = new com.reservation_system.model.LabManager((int) (byte) 10, "student", "Andrew", "Guest", false);
    }

    @Test
    public void test1190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1190");
        com.reservation_system.model.Faculty faculty5 = new com.reservation_system.model.Faculty(0, "Researcher", "researcher", "researcher", false);
    }

    @Test
    public void test1191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1191");
        com.reservation_system.model.Student student5 = new com.reservation_system.model.Student(10, "Password1!", "Researcher", "Password1!", false);
        int int6 = student5.getID();
        java.lang.String str7 = student5.getUserType();
        java.lang.String str8 = student5.getEmail();
        java.lang.String str9 = student5.getUserType();
        java.lang.String str10 = student5.getPassword();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Student" + "'", str7, "Student");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Researcher" + "'", str8, "Researcher");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Student" + "'", str9, "Student");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Password1!" + "'", str10, "Password1!");
    }

    @Test
    public void test1192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1192");
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
        boolean boolean27 = student22.requiresDepartmentApproval();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 101 + "'", int3 == 101);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Researcher" + "'", str12, "Researcher");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Researcher" + "'", str14, "Researcher");
        org.junit.Assert.assertNotNull(userList16);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "Student" + "'", str23, "Student");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 1 + "'", int25 == 1);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
    }

    @Test
    public void test1193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1193");
        com.reservation_system.model.Researcher researcher5 = new com.reservation_system.model.Researcher((int) '4', "labmanager", "researcher", "", false);
    }

    @Test
    public void test1194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1194");
        com.reservation_system.model.LabManager labManager5 = new com.reservation_system.model.LabManager((int) '#', "researcher", "Faculty", "guest", false);
        java.lang.String str6 = labManager5.getPassword();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "guest" + "'", str6, "guest");
    }

    @Test
    public void test1195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1195");
        com.reservation_system.model.Faculty faculty5 = new com.reservation_system.model.Faculty((int) (byte) 1, "guest", "", "headlabcoordinator", false);
        java.lang.String str6 = faculty5.getUserType();
        faculty5.setApproved(true);
        java.lang.String str9 = faculty5.getEmail();
        java.lang.String str10 = faculty5.getEmail();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Faculty" + "'", str6, "Faculty");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test1196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1196");
        com.reservation_system.model.Faculty faculty5 = new com.reservation_system.model.Faculty(102, "Andrew", "labmanager", "Andrew", true);
        java.lang.String str6 = faculty5.getUserType();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Faculty" + "'", str6, "Faculty");
    }

    @Test
    public void test1197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1197");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("demo/data/test-users.csv");
        java.util.Optional<com.reservation_system.model.User> userOptional3 = userRepository1.findByEmail("hi!");
        boolean boolean5 = userRepository1.emailExists("Faculty");
        com.reservation_system.services.RegistrationService registrationService6 = new com.reservation_system.services.RegistrationService(userRepository1);
        org.junit.Assert.assertNotNull(userOptional3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
    }

    @Test
    public void test1198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1198");
        com.reservation_system.model.LabManager labManager5 = new com.reservation_system.model.LabManager((int) (short) 100, "Faculty", "student", "Researcher", false);
        int int6 = labManager5.getID();
        java.lang.String str7 = labManager5.getPassword();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Researcher" + "'", str7, "Researcher");
    }

    @Test
    public void test1199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1199");
        com.reservation_system.model.User user6 = com.reservation_system.patterns.factory.UserFactory.createUser("Guest", 52, "demo/data/test-users.csv", "headlabcoordinator", "Andrew", false);
        org.junit.Assert.assertNotNull(user6);
    }

    @Test
    public void test1200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1200");
        com.reservation_system.model.Researcher researcher5 = new com.reservation_system.model.Researcher((int) ' ', "demo/data/test-users.csv", "labmanager", "Student", true);
        java.lang.String str6 = researcher5.getPassword();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Student" + "'", str6, "Student");
    }

    @Test
    public void test1201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1201");
        com.reservation_system.model.Researcher researcher5 = new com.reservation_system.model.Researcher((int) 'a', "guest", "Student", "Password1!", false);
    }

    @Test
    public void test1202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1202");
        com.reservation_system.model.Guest guest5 = new com.reservation_system.model.Guest((int) (byte) 0, "Faculty", "student", "Researcher", false);
        boolean boolean6 = guest5.requiresDepartmentApproval();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test1203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1203");
        com.reservation_system.model.User user6 = com.reservation_system.patterns.factory.UserFactory.createUser("faculty", (int) (short) -1, "", "student", "andrew@example.com", false);
        boolean boolean7 = user6.isApproved();
        org.junit.Assert.assertNotNull(user6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test1204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1204");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("demo/data/test-users.csv");
        java.util.List<com.reservation_system.model.User> userList2 = userRepository1.getAllUsers();
        com.reservation_system.services.RegistrationService registrationService3 = new com.reservation_system.services.RegistrationService(userRepository1);
        com.reservation_system.services.RegistrationService registrationService4 = new com.reservation_system.services.RegistrationService(userRepository1);
        java.util.Optional<com.reservation_system.model.User> userOptional6 = userRepository1.findByEmail("andrew@example.com");
        java.util.List<com.reservation_system.model.User> userList7 = userRepository1.getAllUsers();
        com.reservation_system.model.LabManager labManager13 = new com.reservation_system.model.LabManager((int) (short) -1, "labmanager", "demo/data/test-users.csv", "Student", false);
        java.lang.String str14 = labManager13.getUserType();
        userRepository1.addUser((com.reservation_system.model.User) labManager13);
        org.junit.Assert.assertNotNull(userList2);
        org.junit.Assert.assertNotNull(userOptional6);
        org.junit.Assert.assertNotNull(userList7);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "labmanager" + "'", str14, "labmanager");
    }

    @Test
    public void test1205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1205");
        com.reservation_system.model.LabManager labManager5 = new com.reservation_system.model.LabManager((int) (byte) 0, "Password1!", "Student", "demo/data/test-users.csv", false);
    }

    @Test
    public void test1206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1206");
        com.reservation_system.model.Guest guest5 = new com.reservation_system.model.Guest(0, "hi!", "Faculty", "Andrew", false);
    }

    @Test
    public void test1207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1207");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("demo/data/test-users.csv");
        java.util.Optional<com.reservation_system.model.User> userOptional3 = userRepository1.findByEmail("hi!");
        int int4 = userRepository1.getNextID();
        com.reservation_system.model.Researcher researcher10 = new com.reservation_system.model.Researcher((int) (byte) 10, "", "Guest", "headlabcoordinator", true);
        userRepository1.addUser((com.reservation_system.model.User) researcher10);
        java.util.List<com.reservation_system.model.User> userList12 = userRepository1.getAllUsers();
        java.util.Optional<com.reservation_system.model.User> userOptional14 = userRepository1.findByEmail("");
        boolean boolean15 = userRepository1.headLabCoordinatorExists();
        int int16 = userRepository1.getNextID();
        org.junit.Assert.assertNotNull(userOptional3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 101 + "'", int4 == 101);
        org.junit.Assert.assertNotNull(userList12);
        org.junit.Assert.assertNotNull(userOptional14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 101 + "'", int16 == 101);
    }

    @Test
    public void test1208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1208");
        com.reservation_system.model.User user6 = com.reservation_system.patterns.factory.UserFactory.createUser("Faculty", (int) (short) -1, "Faculty", "headlabcoordinator", "Andrew", true);
        org.junit.Assert.assertNotNull(user6);
    }

    @Test
    public void test1209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1209");
        com.reservation_system.model.Guest guest5 = new com.reservation_system.model.Guest(32, "researcher", "demo/data/test-users.csv", "Student", false);
        java.lang.String str6 = guest5.getPassword();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Student" + "'", str6, "Student");
    }

    @Test
    public void test1210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1210");
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
        boolean boolean81 = userRepository1.emailExists("headlabcoordinator");
        com.reservation_system.services.RegistrationService registrationService82 = new com.reservation_system.services.RegistrationService(userRepository1);
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
        org.junit.Assert.assertTrue("'" + boolean81 + "' != '" + true + "'", boolean81 == true);
    }

    @Test
    public void test1211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1211");
        com.reservation_system.model.Student student5 = new com.reservation_system.model.Student(0, "", "Faculty", "Andrew", false);
    }

    @Test
    public void test1212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1212");
        com.reservation_system.model.Researcher researcher5 = new com.reservation_system.model.Researcher(0, "", "", "demo/data/test-users.csv", false);
        int int6 = researcher5.getID();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test1213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1213");
        com.reservation_system.model.Researcher researcher5 = new com.reservation_system.model.Researcher((int) (short) -1, "andrew@example.com", "guest", "labmanager", false);
        java.lang.String str6 = researcher5.getPassword();
        java.lang.String str7 = researcher5.getUserType();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "labmanager" + "'", str6, "labmanager");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Researcher" + "'", str7, "Researcher");
    }

    @Test
    public void test1214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1214");
        com.reservation_system.model.Faculty faculty5 = new com.reservation_system.model.Faculty(32, "", "headlabcoordinator", "Student", false);
    }

    @Test
    public void test1215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1215");
        com.reservation_system.model.Faculty faculty5 = new com.reservation_system.model.Faculty(101, "demo/data/test-users.csv", "researcher", "Andrew", false);
    }

    @Test
    public void test1216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1216");
        com.reservation_system.model.Guest guest5 = new com.reservation_system.model.Guest((int) (short) 10, "demo/data/test-users.csv", "Password1!", "Password1!", true);
    }

    @Test
    public void test1217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1217");
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
        boolean boolean28 = userRepository1.emailExists("Faculty");
        int int29 = userRepository1.getNextID();
        com.reservation_system.services.RegistrationService registrationService30 = new com.reservation_system.services.RegistrationService(userRepository1);
        com.reservation_system.model.HeadLabCoordinator headLabCoordinator36 = new com.reservation_system.model.HeadLabCoordinator((int) (short) 100, "", "headlabcoordinator", "headlabcoordinator", false);
        java.lang.String str37 = headLabCoordinator36.getUserType();
        userRepository1.addUser((com.reservation_system.model.User) headLabCoordinator36);
        org.junit.Assert.assertNotNull(userOptional3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 101 + "'", int4 == 101);
        org.junit.Assert.assertNotNull(userList12);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 101 + "'", int29 == 101);
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "headlabcoordinator" + "'", str37, "headlabcoordinator");
    }

    @Test
    public void test1218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1218");
        com.reservation_system.model.HeadLabCoordinator headLabCoordinator5 = new com.reservation_system.model.HeadLabCoordinator((int) (byte) 1, "Student", "Faculty", "", false);
    }

    @Test
    public void test1219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1219");
        com.reservation_system.model.Faculty faculty5 = new com.reservation_system.model.Faculty(1, "Faculty", "faculty", "faculty", false);
    }

    @Test
    public void test1220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1220");
        com.reservation_system.model.Faculty faculty5 = new com.reservation_system.model.Faculty((int) (byte) 0, "", "Andrew", "Andrew", false);
    }

    @Test
    public void test1221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1221");
        // The following exception was thrown during execution in test generation
        try {
            com.reservation_system.model.User user6 = com.reservation_system.patterns.factory.UserFactory.createUser("Andrew", 100, "Password1!", "andrew@example.com", "", true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid user type: Andrew");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1222");
        com.reservation_system.model.Student student5 = new com.reservation_system.model.Student(100, "Faculty", "Student", "hi!", true);
        java.lang.String str6 = student5.getEmail();
        java.lang.String str7 = student5.getUserType();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Student" + "'", str6, "Student");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Student" + "'", str7, "Student");
    }

    @Test
    public void test1223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1223");
        com.reservation_system.model.HeadLabCoordinator headLabCoordinator5 = new com.reservation_system.model.HeadLabCoordinator(0, "Guest", "Faculty", "demo/data/test-users.csv", false);
        java.lang.String str6 = headLabCoordinator5.getEmail();
        java.lang.String str7 = headLabCoordinator5.getUserType();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Faculty" + "'", str6, "Faculty");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "headlabcoordinator" + "'", str7, "headlabcoordinator");
    }

    @Test
    public void test1224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1224");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("demo/data/test-users.csv");
        int int2 = userRepository1.getNextID();
        int int3 = userRepository1.getNextID();
        boolean boolean5 = userRepository1.emailExists("faculty");
        com.reservation_system.model.LabManager labManager11 = new com.reservation_system.model.LabManager((int) (short) 0, "", "labmanager", "Password1!", true);
        userRepository1.addUser((com.reservation_system.model.User) labManager11);
        java.util.List<com.reservation_system.model.User> userList13 = userRepository1.getAllUsers();
        java.util.List<com.reservation_system.model.User> userList14 = userRepository1.getAllUsers();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 101 + "'", int2 == 101);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 101 + "'", int3 == 101);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(userList13);
        org.junit.Assert.assertNotNull(userList14);
    }

    @Test
    public void test1225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1225");
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
        java.lang.String str18 = faculty11.getUserType();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 101 + "'", int2 == 101);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 101 + "'", int3 == 101);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "faculty" + "'", str12, "faculty");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Faculty" + "'", str13, "Faculty");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 10 + "'", int14 == 10);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "faculty" + "'", str16, "faculty");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "Faculty" + "'", str17, "Faculty");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Faculty" + "'", str18, "Faculty");
    }

    @Test
    public void test1226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1226");
        com.reservation_system.model.Student student5 = new com.reservation_system.model.Student((int) (byte) -1, "Password1!", "", "headlabcoordinator", true);
        java.lang.String str6 = student5.getName();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Password1!" + "'", str6, "Password1!");
    }

    @Test
    public void test1227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1227");
        com.reservation_system.model.Faculty faculty5 = new com.reservation_system.model.Faculty(32, "student", "Student", "hi!", true);
        java.lang.String str6 = faculty5.getEmail();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Student" + "'", str6, "Student");
    }

    @Test
    public void test1228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1228");
        com.reservation_system.model.Faculty faculty5 = new com.reservation_system.model.Faculty((int) (short) -1, "Researcher", "Password1!", "demo/data/test-users.csv", true);
    }

    @Test
    public void test1229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1229");
        com.reservation_system.model.Guest guest5 = new com.reservation_system.model.Guest((int) (byte) -1, "demo/data/test-users.csv", "Guest", "", true);
        java.lang.String str6 = guest5.getUserType();
        java.lang.String str7 = guest5.getEmail();
        java.lang.String str8 = guest5.getUserType();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Guest" + "'", str6, "Guest");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Guest" + "'", str7, "Guest");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Guest" + "'", str8, "Guest");
    }

    @Test
    public void test1230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1230");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("demo/data/test-users.csv");
        com.reservation_system.services.RegistrationService registrationService2 = new com.reservation_system.services.RegistrationService(userRepository1);
        com.reservation_system.services.RegistrationService registrationService3 = new com.reservation_system.services.RegistrationService(userRepository1);
        boolean boolean5 = userRepository1.emailExists("faculty");
        java.util.Optional<com.reservation_system.model.User> userOptional7 = userRepository1.findByEmail("researcher");
        boolean boolean8 = userRepository1.headLabCoordinatorExists();
        java.util.List<com.reservation_system.model.User> userList9 = userRepository1.getAllUsers();
        java.util.Optional<com.reservation_system.model.User> userOptional11 = userRepository1.findByEmail("student");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(userOptional7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(userList9);
        org.junit.Assert.assertNotNull(userOptional11);
    }

    @Test
    public void test1231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1231");
        com.reservation_system.model.LabManager labManager5 = new com.reservation_system.model.LabManager((int) (short) -1, "labmanager", "demo/data/test-users.csv", "Student", false);
        java.lang.String str6 = labManager5.getEmail();
        int int7 = labManager5.getID();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "demo/data/test-users.csv" + "'", str6, "demo/data/test-users.csv");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
    }

    @Test
    public void test1232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1232");
        com.reservation_system.model.Researcher researcher5 = new com.reservation_system.model.Researcher(33, "labmanager", "faculty", "Researcher", true);
    }

    @Test
    public void test1233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1233");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("demo/data/test-users.csv");
        java.util.Optional<com.reservation_system.model.User> userOptional3 = userRepository1.findByEmail("hi!");
        int int4 = userRepository1.getNextID();
        boolean boolean5 = userRepository1.headLabCoordinatorExists();
        java.util.List<com.reservation_system.model.User> userList6 = userRepository1.getAllUsers();
        boolean boolean8 = userRepository1.emailExists("student");
        java.lang.Class<?> wildcardClass9 = userRepository1.getClass();
        org.junit.Assert.assertNotNull(userOptional3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 101 + "'", int4 == 101);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(userList6);
// flaky "24) test1233(com.reservation_system.randoop.registrationservice.RegressionTest2)":         org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test1234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1234");
        com.reservation_system.model.LabManager labManager5 = new com.reservation_system.model.LabManager((int) (short) 10, "Researcher", "", "guest", true);
    }

    @Test
    public void test1235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1235");
        com.reservation_system.model.Student student5 = new com.reservation_system.model.Student((int) 'a', "Password1!", "andrew@example.com", "hi!", true);
        boolean boolean6 = student5.isApproved();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test1236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1236");
        com.reservation_system.model.LabManager labManager5 = new com.reservation_system.model.LabManager(1, "faculty", "Andrew", "headlabcoordinator", true);
        boolean boolean6 = labManager5.isApproved();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test1237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1237");
        com.reservation_system.model.HeadLabCoordinator headLabCoordinator5 = new com.reservation_system.model.HeadLabCoordinator(98, "Student", "demo/data/test-users.csv", "demo/data/test-users.csv", false);
    }

    @Test
    public void test1238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1238");
        com.reservation_system.model.Student student5 = new com.reservation_system.model.Student((int) (short) 0, "hi!", "", "Student", true);
        java.lang.String str6 = student5.getPassword();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Student" + "'", str6, "Student");
    }

    @Test
    public void test1239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1239");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("demo/data/test-users.csv");
        boolean boolean2 = userRepository1.headLabCoordinatorExists();
        com.reservation_system.services.RegistrationService registrationService3 = new com.reservation_system.services.RegistrationService(userRepository1);
        boolean boolean4 = userRepository1.headLabCoordinatorExists();
        boolean boolean6 = userRepository1.emailExists("Andrew");
        com.reservation_system.services.RegistrationService registrationService7 = new com.reservation_system.services.RegistrationService(userRepository1);
        // The following exception was thrown during execution in test generation
        try {
            com.reservation_system.model.User user12 = registrationService7.registerUser("", "", "Guest", "Andrew");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid user type.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test1240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1240");
        com.reservation_system.model.Faculty faculty5 = new com.reservation_system.model.Faculty((int) (byte) 1, "researcher", "Andrew", "", false);
        java.lang.String str6 = faculty5.getUserType();
        java.lang.String str7 = faculty5.getPassword();
        java.lang.String str8 = faculty5.getPassword();
        java.lang.String str9 = faculty5.getName();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Faculty" + "'", str6, "Faculty");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "researcher" + "'", str9, "researcher");
    }

    @Test
    public void test1241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1241");
        com.reservation_system.model.Researcher researcher5 = new com.reservation_system.model.Researcher((int) (byte) 1, "Student", "Student", "Password1!", false);
        java.lang.String str6 = researcher5.getUserType();
        researcher5.setApproved(false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Researcher" + "'", str6, "Researcher");
    }

    @Test
    public void test1242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1242");
        com.reservation_system.model.HeadLabCoordinator headLabCoordinator5 = new com.reservation_system.model.HeadLabCoordinator((int) '4', "Password1!", "", "Faculty", true);
        java.lang.String str6 = headLabCoordinator5.getName();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Password1!" + "'", str6, "Password1!");
    }

    @Test
    public void test1243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1243");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("demo/data/test-users.csv");
        com.reservation_system.services.RegistrationService registrationService2 = new com.reservation_system.services.RegistrationService(userRepository1);
        com.reservation_system.model.Faculty faculty8 = new com.reservation_system.model.Faculty(0, "Password1!", "demo/data/test-users.csv", "researcher", false);
        java.lang.String str9 = faculty8.getName();
        userRepository1.addUser((com.reservation_system.model.User) faculty8);
        boolean boolean11 = userRepository1.headLabCoordinatorExists();
        com.reservation_system.repository.UserRepository userRepository13 = new com.reservation_system.repository.UserRepository("demo/data/test-users.csv");
        com.reservation_system.services.RegistrationService registrationService14 = new com.reservation_system.services.RegistrationService(userRepository13);
        com.reservation_system.model.Faculty faculty20 = new com.reservation_system.model.Faculty(0, "Password1!", "demo/data/test-users.csv", "researcher", false);
        java.lang.String str21 = faculty20.getName();
        userRepository13.addUser((com.reservation_system.model.User) faculty20);
        java.util.List<com.reservation_system.model.User> userList23 = userRepository13.getAllUsers();
        userRepository1.saveAllUsers(userList23);
        java.util.Optional<com.reservation_system.model.User> userOptional26 = userRepository1.findByEmail("Andrew");
        com.reservation_system.repository.UserRepository userRepository28 = new com.reservation_system.repository.UserRepository("demo/data/test-users.csv");
        java.util.Optional<com.reservation_system.model.User> userOptional30 = userRepository28.findByEmail("hi!");
        int int31 = userRepository28.getNextID();
        boolean boolean32 = userRepository28.headLabCoordinatorExists();
        java.util.List<com.reservation_system.model.User> userList33 = userRepository28.getAllUsers();
        com.reservation_system.repository.UserRepository userRepository35 = new com.reservation_system.repository.UserRepository("demo/data/test-users.csv");
        java.util.List<com.reservation_system.model.User> userList36 = userRepository35.getAllUsers();
        com.reservation_system.services.RegistrationService registrationService37 = new com.reservation_system.services.RegistrationService(userRepository35);
        java.util.List<com.reservation_system.model.User> userList38 = userRepository35.getAllUsers();
        boolean boolean40 = userRepository35.emailExists("Guest");
        java.util.List<com.reservation_system.model.User> userList41 = userRepository35.getAllUsers();
        java.util.Optional<com.reservation_system.model.User> userOptional43 = userRepository35.findByEmail("Password1!");
        com.reservation_system.repository.UserRepository userRepository45 = new com.reservation_system.repository.UserRepository("demo/data/test-users.csv");
        com.reservation_system.services.RegistrationService registrationService46 = new com.reservation_system.services.RegistrationService(userRepository45);
        com.reservation_system.model.Faculty faculty52 = new com.reservation_system.model.Faculty(0, "Password1!", "demo/data/test-users.csv", "researcher", false);
        java.lang.String str53 = faculty52.getName();
        userRepository45.addUser((com.reservation_system.model.User) faculty52);
        boolean boolean55 = userRepository45.headLabCoordinatorExists();
        int int56 = userRepository45.getNextID();
        com.reservation_system.repository.UserRepository userRepository58 = new com.reservation_system.repository.UserRepository("demo/data/test-users.csv");
        java.util.List<com.reservation_system.model.User> userList59 = userRepository58.getAllUsers();
        com.reservation_system.services.RegistrationService registrationService60 = new com.reservation_system.services.RegistrationService(userRepository58);
        java.util.List<com.reservation_system.model.User> userList61 = userRepository58.getAllUsers();
        userRepository45.saveAllUsers(userList61);
        userRepository35.saveAllUsers(userList61);
        userRepository28.saveAllUsers(userList61);
        userRepository1.saveAllUsers(userList61);
        boolean boolean66 = userRepository1.headLabCoordinatorExists();
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Password1!" + "'", str9, "Password1!");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "Password1!" + "'", str21, "Password1!");
        org.junit.Assert.assertNotNull(userList23);
        org.junit.Assert.assertNotNull(userOptional26);
        org.junit.Assert.assertNotNull(userOptional30);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 101 + "'", int31 == 101);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertNotNull(userList33);
        org.junit.Assert.assertNotNull(userList36);
        org.junit.Assert.assertNotNull(userList38);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + true + "'", boolean40 == true);
        org.junit.Assert.assertNotNull(userList41);
        org.junit.Assert.assertNotNull(userOptional43);
        org.junit.Assert.assertEquals("'" + str53 + "' != '" + "Password1!" + "'", str53, "Password1!");
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + true + "'", boolean55 == true);
        org.junit.Assert.assertTrue("'" + int56 + "' != '" + 101 + "'", int56 == 101);
        org.junit.Assert.assertNotNull(userList59);
        org.junit.Assert.assertNotNull(userList61);
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + true + "'", boolean66 == true);
    }

    @Test
    public void test1244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1244");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("demo/data/test-users.csv");
        com.reservation_system.services.RegistrationService registrationService2 = new com.reservation_system.services.RegistrationService(userRepository1);
        com.reservation_system.services.RegistrationService registrationService3 = new com.reservation_system.services.RegistrationService(userRepository1);
        boolean boolean5 = userRepository1.emailExists("faculty");
        java.util.Optional<com.reservation_system.model.User> userOptional7 = userRepository1.findByEmail("researcher");
        java.util.Optional<com.reservation_system.model.User> userOptional9 = userRepository1.findByEmail("");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(userOptional7);
        org.junit.Assert.assertNotNull(userOptional9);
    }

    @Test
    public void test1245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1245");
        com.reservation_system.model.Guest guest5 = new com.reservation_system.model.Guest((int) ' ', "Guest", "student", "Researcher", false);
    }

    @Test
    public void test1246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1246");
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
        // The following exception was thrown during execution in test generation
        try {
            com.reservation_system.model.User user22 = registrationService17.registerUser("Researcher", "headlabcoordinator", "andrew@example.com", "Guest");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Password must contain uppercase, lowercase, number, and symbol, and be at least 8 characters long.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Password1!" + "'", str12, "Password1!");
        org.junit.Assert.assertNotNull(userList14);
    }

    @Test
    public void test1247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1247");
        com.reservation_system.model.Faculty faculty5 = new com.reservation_system.model.Faculty((int) (byte) 1, "headlabcoordinator", "guest", "student", true);
        boolean boolean6 = faculty5.requiresDepartmentApproval();
        java.lang.Class<?> wildcardClass7 = faculty5.getClass();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test1248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1248");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("demo/data/test-users.csv");
        java.util.Optional<com.reservation_system.model.User> userOptional3 = userRepository1.findByEmail("hi!");
        java.util.List<com.reservation_system.model.User> userList4 = userRepository1.getAllUsers();
        com.reservation_system.services.RegistrationService registrationService5 = new com.reservation_system.services.RegistrationService(userRepository1);
        boolean boolean7 = userRepository1.emailExists("Student");
        org.junit.Assert.assertNotNull(userOptional3);
        org.junit.Assert.assertNotNull(userList4);
// flaky "25) test1248(com.reservation_system.randoop.registrationservice.RegressionTest2)":         org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test1249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1249");
        com.reservation_system.model.Student student5 = new com.reservation_system.model.Student((int) (byte) 100, "researcher", "Researcher", "researcher", true);
    }

    @Test
    public void test1250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1250");
        com.reservation_system.model.Student student5 = new com.reservation_system.model.Student((int) (byte) 10, "", "Researcher", "Andrew", true);
    }

    @Test
    public void test1251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1251");
        com.reservation_system.model.Guest guest5 = new com.reservation_system.model.Guest((int) 'a', "hi!", "", "headlabcoordinator", true);
        java.lang.String str6 = guest5.getUserType();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Guest" + "'", str6, "Guest");
    }

    @Test
    public void test1252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1252");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("demo/data/test-users.csv");
        java.util.List<com.reservation_system.model.User> userList2 = userRepository1.getAllUsers();
        com.reservation_system.services.RegistrationService registrationService3 = new com.reservation_system.services.RegistrationService(userRepository1);
        com.reservation_system.services.RegistrationService registrationService4 = new com.reservation_system.services.RegistrationService(userRepository1);
        java.util.Optional<com.reservation_system.model.User> userOptional6 = userRepository1.findByEmail("andrew@example.com");
        com.reservation_system.services.RegistrationService registrationService7 = new com.reservation_system.services.RegistrationService(userRepository1);
        org.junit.Assert.assertNotNull(userList2);
        org.junit.Assert.assertNotNull(userOptional6);
    }

    @Test
    public void test1253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1253");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("demo/data/test-users.csv");
        boolean boolean2 = userRepository1.headLabCoordinatorExists();
        com.reservation_system.services.RegistrationService registrationService3 = new com.reservation_system.services.RegistrationService(userRepository1);
        boolean boolean5 = userRepository1.emailExists("");
        com.reservation_system.model.Student student11 = new com.reservation_system.model.Student((int) (short) 1, "labmanager", "", "", true);
        java.lang.String str12 = student11.getUserType();
        java.lang.String str13 = student11.getEmail();
        int int14 = student11.getID();
        userRepository1.addUser((com.reservation_system.model.User) student11);
        boolean boolean16 = userRepository1.headLabCoordinatorExists();
        com.reservation_system.model.Student student22 = new com.reservation_system.model.Student((int) (short) 1, "labmanager", "", "", true);
        java.lang.String str23 = student22.getUserType();
        java.lang.String str24 = student22.getUserType();
        java.lang.String str25 = student22.getEmail();
        userRepository1.addUser((com.reservation_system.model.User) student22);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Student" + "'", str12, "Student");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "Student" + "'", str23, "Student");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "Student" + "'", str24, "Student");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
    }

    @Test
    public void test1254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1254");
        com.reservation_system.model.Guest guest5 = new com.reservation_system.model.Guest((int) (byte) 100, "student", "Guest", "Andrew", false);
    }

    @Test
    public void test1255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1255");
        com.reservation_system.model.LabManager labManager5 = new com.reservation_system.model.LabManager((int) (byte) 10, "labmanager", "researcher", "Student", true);
    }

    @Test
    public void test1256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1256");
        com.reservation_system.model.Researcher researcher5 = new com.reservation_system.model.Researcher(52, "", "headlabcoordinator", "hi!", false);
    }

    @Test
    public void test1257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1257");
        com.reservation_system.model.LabManager labManager5 = new com.reservation_system.model.LabManager((int) (short) 0, "headlabcoordinator", "hi!", "Faculty", false);
        int int6 = labManager5.getID();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test1258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1258");
        com.reservation_system.model.Researcher researcher5 = new com.reservation_system.model.Researcher((int) (byte) 1, "Andrew", "guest", "Password1!", false);
        java.lang.String str6 = researcher5.getUserType();
        int int7 = researcher5.getID();
        java.lang.String str8 = researcher5.getUserType();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Researcher" + "'", str6, "Researcher");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Researcher" + "'", str8, "Researcher");
    }

    @Test
    public void test1259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1259");
        com.reservation_system.model.Researcher researcher5 = new com.reservation_system.model.Researcher((int) '4', "hi!", "hi!", "labmanager", false);
        java.lang.String str6 = researcher5.getUserType();
        java.lang.String str7 = researcher5.getUserType();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Researcher" + "'", str6, "Researcher");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Researcher" + "'", str7, "Researcher");
    }

    @Test
    public void test1260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1260");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("demo/data/test-users.csv");
        int int2 = userRepository1.getNextID();
        int int3 = userRepository1.getNextID();
        boolean boolean5 = userRepository1.emailExists("faculty");
        com.reservation_system.model.LabManager labManager11 = new com.reservation_system.model.LabManager((int) (short) 0, "", "labmanager", "Password1!", true);
        userRepository1.addUser((com.reservation_system.model.User) labManager11);
        java.util.Optional<com.reservation_system.model.User> userOptional14 = userRepository1.findByEmail("");
        com.reservation_system.model.Researcher researcher20 = new com.reservation_system.model.Researcher((int) (byte) 100, "Password1!", "Password1!", "headlabcoordinator", true);
        userRepository1.addUser((com.reservation_system.model.User) researcher20);
        int int22 = userRepository1.getNextID();
        boolean boolean23 = userRepository1.headLabCoordinatorExists();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 101 + "'", int2 == 101);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 101 + "'", int3 == 101);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(userOptional14);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 101 + "'", int22 == 101);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
    }

    @Test
    public void test1261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1261");
        com.reservation_system.model.HeadLabCoordinator headLabCoordinator5 = new com.reservation_system.model.HeadLabCoordinator(10, "researcher", "headlabcoordinator", "faculty", false);
        java.lang.String str6 = headLabCoordinator5.getUserType();
        java.lang.String str7 = headLabCoordinator5.getEmail();
        boolean boolean8 = headLabCoordinator5.isApproved();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "headlabcoordinator" + "'", str6, "headlabcoordinator");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "headlabcoordinator" + "'", str7, "headlabcoordinator");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test1262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1262");
        com.reservation_system.model.Faculty faculty5 = new com.reservation_system.model.Faculty(100, "", "andrew@example.com", "Guest", true);
        java.lang.String str6 = faculty5.getPassword();
        java.lang.String str7 = faculty5.getName();
        java.lang.String str8 = faculty5.getUserType();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Guest" + "'", str6, "Guest");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Faculty" + "'", str8, "Faculty");
    }

    @Test
    public void test1263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1263");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("demo/data/test-users.csv");
        com.reservation_system.services.RegistrationService registrationService2 = new com.reservation_system.services.RegistrationService(userRepository1);
        com.reservation_system.model.Faculty faculty8 = new com.reservation_system.model.Faculty(0, "Password1!", "demo/data/test-users.csv", "researcher", false);
        java.lang.String str9 = faculty8.getName();
        userRepository1.addUser((com.reservation_system.model.User) faculty8);
        boolean boolean11 = userRepository1.headLabCoordinatorExists();
        com.reservation_system.services.RegistrationService registrationService12 = new com.reservation_system.services.RegistrationService(userRepository1);
        com.reservation_system.model.Researcher researcher18 = new com.reservation_system.model.Researcher((int) '4', "labmanager", "Andrew", "researcher", true);
        userRepository1.addUser((com.reservation_system.model.User) researcher18);
        com.reservation_system.repository.UserRepository userRepository21 = new com.reservation_system.repository.UserRepository("demo/data/test-users.csv");
        com.reservation_system.services.RegistrationService registrationService22 = new com.reservation_system.services.RegistrationService(userRepository21);
        com.reservation_system.model.Faculty faculty28 = new com.reservation_system.model.Faculty(0, "Password1!", "demo/data/test-users.csv", "researcher", false);
        java.lang.String str29 = faculty28.getName();
        userRepository21.addUser((com.reservation_system.model.User) faculty28);
        java.util.List<com.reservation_system.model.User> userList31 = userRepository21.getAllUsers();
        com.reservation_system.repository.UserRepository userRepository33 = new com.reservation_system.repository.UserRepository("demo/data/test-users.csv");
        boolean boolean34 = userRepository33.headLabCoordinatorExists();
        com.reservation_system.services.RegistrationService registrationService35 = new com.reservation_system.services.RegistrationService(userRepository33);
        boolean boolean37 = userRepository33.emailExists("");
        com.reservation_system.repository.UserRepository userRepository39 = new com.reservation_system.repository.UserRepository("demo/data/test-users.csv");
        com.reservation_system.services.RegistrationService registrationService40 = new com.reservation_system.services.RegistrationService(userRepository39);
        com.reservation_system.model.Faculty faculty46 = new com.reservation_system.model.Faculty(0, "Password1!", "demo/data/test-users.csv", "researcher", false);
        java.lang.String str47 = faculty46.getName();
        userRepository39.addUser((com.reservation_system.model.User) faculty46);
        java.util.List<com.reservation_system.model.User> userList49 = userRepository39.getAllUsers();
        userRepository33.saveAllUsers(userList49);
        userRepository21.saveAllUsers(userList49);
        com.reservation_system.repository.UserRepository userRepository53 = new com.reservation_system.repository.UserRepository("demo/data/test-users.csv");
        com.reservation_system.services.RegistrationService registrationService54 = new com.reservation_system.services.RegistrationService(userRepository53);
        com.reservation_system.model.Researcher researcher60 = new com.reservation_system.model.Researcher((int) (short) 1, "Password1!", "headlabcoordinator", "", false);
        userRepository53.addUser((com.reservation_system.model.User) researcher60);
        com.reservation_system.services.RegistrationService registrationService62 = new com.reservation_system.services.RegistrationService(userRepository53);
        com.reservation_system.repository.UserRepository userRepository64 = new com.reservation_system.repository.UserRepository("demo/data/test-users.csv");
        com.reservation_system.services.RegistrationService registrationService65 = new com.reservation_system.services.RegistrationService(userRepository64);
        com.reservation_system.model.Faculty faculty71 = new com.reservation_system.model.Faculty(0, "Password1!", "demo/data/test-users.csv", "researcher", false);
        java.lang.String str72 = faculty71.getName();
        userRepository64.addUser((com.reservation_system.model.User) faculty71);
        boolean boolean74 = userRepository64.headLabCoordinatorExists();
        com.reservation_system.model.Guest guest80 = new com.reservation_system.model.Guest((int) (byte) -1, "guest", "Researcher", "Faculty", true);
        userRepository64.addUser((com.reservation_system.model.User) guest80);
        com.reservation_system.repository.UserRepository userRepository83 = new com.reservation_system.repository.UserRepository("demo/data/test-users.csv");
        java.util.List<com.reservation_system.model.User> userList84 = userRepository83.getAllUsers();
        com.reservation_system.services.RegistrationService registrationService85 = new com.reservation_system.services.RegistrationService(userRepository83);
        java.util.List<com.reservation_system.model.User> userList86 = userRepository83.getAllUsers();
        userRepository64.saveAllUsers(userList86);
        userRepository53.saveAllUsers(userList86);
        userRepository21.saveAllUsers(userList86);
        userRepository1.saveAllUsers(userList86);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Password1!" + "'", str9, "Password1!");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "Password1!" + "'", str29, "Password1!");
        org.junit.Assert.assertNotNull(userList31);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
        org.junit.Assert.assertEquals("'" + str47 + "' != '" + "Password1!" + "'", str47, "Password1!");
        org.junit.Assert.assertNotNull(userList49);
        org.junit.Assert.assertEquals("'" + str72 + "' != '" + "Password1!" + "'", str72, "Password1!");
        org.junit.Assert.assertTrue("'" + boolean74 + "' != '" + true + "'", boolean74 == true);
        org.junit.Assert.assertNotNull(userList84);
        org.junit.Assert.assertNotNull(userList86);
    }

    @Test
    public void test1264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1264");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("demo/data/test-users.csv");
        com.reservation_system.services.RegistrationService registrationService2 = new com.reservation_system.services.RegistrationService(userRepository1);
        com.reservation_system.model.Faculty faculty8 = new com.reservation_system.model.Faculty(0, "Password1!", "demo/data/test-users.csv", "researcher", false);
        java.lang.String str9 = faculty8.getName();
        userRepository1.addUser((com.reservation_system.model.User) faculty8);
        boolean boolean11 = userRepository1.headLabCoordinatorExists();
        com.reservation_system.services.RegistrationService registrationService12 = new com.reservation_system.services.RegistrationService(userRepository1);
        // The following exception was thrown during execution in test generation
        try {
            com.reservation_system.model.User user17 = registrationService12.registerUser("researcher", "", "labmanager", "Guest");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Name is required.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Password1!" + "'", str9, "Password1!");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test1265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1265");
        com.reservation_system.model.Faculty faculty5 = new com.reservation_system.model.Faculty(52, "student", "headlabcoordinator", "andrew@example.com", true);
    }

    @Test
    public void test1266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1266");
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
        int int22 = userRepository21.getNextID();
        int int23 = userRepository21.getNextID();
        boolean boolean25 = userRepository21.emailExists("faculty");
        java.util.List<com.reservation_system.model.User> userList26 = userRepository21.getAllUsers();
        userRepository1.saveAllUsers(userList26);
        com.reservation_system.repository.UserRepository userRepository29 = new com.reservation_system.repository.UserRepository("demo/data/test-users.csv");
        com.reservation_system.services.RegistrationService registrationService30 = new com.reservation_system.services.RegistrationService(userRepository29);
        com.reservation_system.model.Faculty faculty36 = new com.reservation_system.model.Faculty(0, "Password1!", "demo/data/test-users.csv", "researcher", false);
        java.lang.String str37 = faculty36.getName();
        userRepository29.addUser((com.reservation_system.model.User) faculty36);
        java.util.List<com.reservation_system.model.User> userList39 = userRepository29.getAllUsers();
        userRepository1.saveAllUsers(userList39);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Password1!" + "'", str9, "Password1!");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 101 + "'", int22 == 101);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 101 + "'", int23 == 101);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertNotNull(userList26);
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "Password1!" + "'", str37, "Password1!");
        org.junit.Assert.assertNotNull(userList39);
    }

    @Test
    public void test1267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1267");
        com.reservation_system.model.LabManager labManager5 = new com.reservation_system.model.LabManager(10, "researcher", "demo/data/test-users.csv", "Guest", true);
    }

    @Test
    public void test1268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1268");
        com.reservation_system.model.Researcher researcher5 = new com.reservation_system.model.Researcher((int) (short) -1, "Andrew", "headlabcoordinator", "Guest", false);
        boolean boolean6 = researcher5.requiresDepartmentApproval();
        int int7 = researcher5.getID();
        java.lang.String str8 = researcher5.getName();
        researcher5.setApproved(true);
        int int11 = researcher5.getID();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Andrew" + "'", str8, "Andrew");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
    }

    @Test
    public void test1269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1269");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("demo/data/test-users.csv");
        java.util.Optional<com.reservation_system.model.User> userOptional3 = userRepository1.findByEmail("hi!");
        int int4 = userRepository1.getNextID();
        com.reservation_system.model.Researcher researcher10 = new com.reservation_system.model.Researcher((int) (byte) 10, "", "Guest", "headlabcoordinator", true);
        userRepository1.addUser((com.reservation_system.model.User) researcher10);
        java.util.List<com.reservation_system.model.User> userList12 = userRepository1.getAllUsers();
        int int13 = userRepository1.getNextID();
        boolean boolean15 = userRepository1.emailExists("guest");
        org.junit.Assert.assertNotNull(userOptional3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 101 + "'", int4 == 101);
        org.junit.Assert.assertNotNull(userList12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 101 + "'", int13 == 101);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
    }

    @Test
    public void test1270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1270");
        com.reservation_system.model.LabManager labManager5 = new com.reservation_system.model.LabManager((-1), "labmanager", "Password1!", "faculty", true);
    }

    @Test
    public void test1271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1271");
        com.reservation_system.model.LabManager labManager5 = new com.reservation_system.model.LabManager(0, "student", "andrew@example.com", "Student", false);
    }

    @Test
    public void test1272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1272");
        com.reservation_system.model.HeadLabCoordinator headLabCoordinator5 = new com.reservation_system.model.HeadLabCoordinator(32, "guest", "", "Andrew", false);
    }

    @Test
    public void test1273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1273");
        com.reservation_system.model.Faculty faculty5 = new com.reservation_system.model.Faculty(1, "Guest", "Guest", "headlabcoordinator", false);
    }

    @Test
    public void test1274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1274");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("demo/data/test-users.csv");
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
        java.util.Optional<com.reservation_system.model.User> userOptional19 = userRepository1.findByEmail("faculty");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Researcher" + "'", str14, "Researcher");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Researcher" + "'", str16, "Researcher");
        org.junit.Assert.assertNotNull(userOptional19);
    }

    @Test
    public void test1275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1275");
        com.reservation_system.model.Researcher researcher5 = new com.reservation_system.model.Researcher((-1), "researcher", "student", "researcher", false);
        java.lang.String str6 = researcher5.getUserType();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Researcher" + "'", str6, "Researcher");
    }

    @Test
    public void test1276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1276");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("demo/data/test-users.csv");
        java.util.List<com.reservation_system.model.User> userList2 = userRepository1.getAllUsers();
        com.reservation_system.services.RegistrationService registrationService3 = new com.reservation_system.services.RegistrationService(userRepository1);
        int int4 = userRepository1.getNextID();
        int int5 = userRepository1.getNextID();
        boolean boolean7 = userRepository1.emailExists("Guest");
        org.junit.Assert.assertNotNull(userList2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 101 + "'", int4 == 101);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 101 + "'", int5 == 101);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test1277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1277");
        com.reservation_system.model.Guest guest5 = new com.reservation_system.model.Guest(52, "headlabcoordinator", "Researcher", "Andrew", false);
        java.lang.String str6 = guest5.getUserType();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Guest" + "'", str6, "Guest");
    }

    @Test
    public void test1278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1278");
        com.reservation_system.model.Faculty faculty5 = new com.reservation_system.model.Faculty((int) (byte) 0, "andrew@example.com", "Student", "researcher", true);
    }

    @Test
    public void test1279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1279");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("demo/data/test-users.csv");
        java.util.Optional<com.reservation_system.model.User> userOptional3 = userRepository1.findByEmail("hi!");
        java.util.List<com.reservation_system.model.User> userList4 = userRepository1.getAllUsers();
        java.util.Optional<com.reservation_system.model.User> userOptional6 = userRepository1.findByEmail("andrew@example.com");
        java.util.List<com.reservation_system.model.User> userList7 = userRepository1.getAllUsers();
        org.junit.Assert.assertNotNull(userOptional3);
        org.junit.Assert.assertNotNull(userList4);
        org.junit.Assert.assertNotNull(userOptional6);
        org.junit.Assert.assertNotNull(userList7);
    }

    @Test
    public void test1280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1280");
        com.reservation_system.model.Guest guest5 = new com.reservation_system.model.Guest((-1), "student", "labmanager", "andrew@example.com", false);
        java.lang.String str6 = guest5.getEmail();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "labmanager" + "'", str6, "labmanager");
    }

    @Test
    public void test1281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1281");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("demo/data/test-users.csv");
        com.reservation_system.services.RegistrationService registrationService2 = new com.reservation_system.services.RegistrationService(userRepository1);
        com.reservation_system.model.Faculty faculty8 = new com.reservation_system.model.Faculty(0, "Password1!", "demo/data/test-users.csv", "researcher", false);
        java.lang.String str9 = faculty8.getName();
        userRepository1.addUser((com.reservation_system.model.User) faculty8);
        boolean boolean11 = userRepository1.headLabCoordinatorExists();
        int int12 = userRepository1.getNextID();
        int int13 = userRepository1.getNextID();
        java.lang.Class<?> wildcardClass14 = userRepository1.getClass();
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Password1!" + "'", str9, "Password1!");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 101 + "'", int12 == 101);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 101 + "'", int13 == 101);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test1282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1282");
        com.reservation_system.model.Researcher researcher5 = new com.reservation_system.model.Researcher(52, "Faculty", "demo/data/test-users.csv", "", false);
        java.lang.String str6 = researcher5.getUserType();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Researcher" + "'", str6, "Researcher");
    }

    @Test
    public void test1283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1283");
        com.reservation_system.model.LabManager labManager5 = new com.reservation_system.model.LabManager(101, "Student", "headlabcoordinator", "guest", false);
    }

    @Test
    public void test1284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1284");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("demo/data/test-users.csv");
        int int2 = userRepository1.getNextID();
        int int3 = userRepository1.getNextID();
        boolean boolean5 = userRepository1.emailExists("faculty");
        com.reservation_system.model.LabManager labManager11 = new com.reservation_system.model.LabManager((int) (short) 0, "", "labmanager", "Password1!", true);
        userRepository1.addUser((com.reservation_system.model.User) labManager11);
        java.util.Optional<com.reservation_system.model.User> userOptional14 = userRepository1.findByEmail("");
        com.reservation_system.model.Researcher researcher20 = new com.reservation_system.model.Researcher((int) (byte) 100, "Password1!", "Password1!", "headlabcoordinator", true);
        userRepository1.addUser((com.reservation_system.model.User) researcher20);
        java.util.Optional<com.reservation_system.model.User> userOptional23 = userRepository1.findByEmail("headlabcoordinator");
        boolean boolean25 = userRepository1.emailExists("hi!");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 101 + "'", int2 == 101);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 101 + "'", int3 == 101);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(userOptional14);
        org.junit.Assert.assertNotNull(userOptional23);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
    }

    @Test
    public void test1285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1285");
        com.reservation_system.model.LabManager labManager5 = new com.reservation_system.model.LabManager((int) 'a', "Researcher", "Faculty", "headlabcoordinator", true);
    }

    @Test
    public void test1286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1286");
        com.reservation_system.model.Student student5 = new com.reservation_system.model.Student((int) '#', "student", "hi!", "guest", true);
        java.lang.String str6 = student5.getName();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "student" + "'", str6, "student");
    }

    @Test
    public void test1287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1287");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("demo/data/test-users.csv");
        com.reservation_system.services.RegistrationService registrationService2 = new com.reservation_system.services.RegistrationService(userRepository1);
        com.reservation_system.model.Faculty faculty8 = new com.reservation_system.model.Faculty(0, "Password1!", "demo/data/test-users.csv", "researcher", false);
        java.lang.String str9 = faculty8.getName();
        userRepository1.addUser((com.reservation_system.model.User) faculty8);
        java.util.List<com.reservation_system.model.User> userList11 = userRepository1.getAllUsers();
        com.reservation_system.repository.UserRepository userRepository13 = new com.reservation_system.repository.UserRepository("demo/data/test-users.csv");
        boolean boolean14 = userRepository13.headLabCoordinatorExists();
        com.reservation_system.services.RegistrationService registrationService15 = new com.reservation_system.services.RegistrationService(userRepository13);
        boolean boolean17 = userRepository13.emailExists("");
        com.reservation_system.repository.UserRepository userRepository19 = new com.reservation_system.repository.UserRepository("demo/data/test-users.csv");
        com.reservation_system.services.RegistrationService registrationService20 = new com.reservation_system.services.RegistrationService(userRepository19);
        com.reservation_system.model.Faculty faculty26 = new com.reservation_system.model.Faculty(0, "Password1!", "demo/data/test-users.csv", "researcher", false);
        java.lang.String str27 = faculty26.getName();
        userRepository19.addUser((com.reservation_system.model.User) faculty26);
        java.util.List<com.reservation_system.model.User> userList29 = userRepository19.getAllUsers();
        userRepository13.saveAllUsers(userList29);
        userRepository1.saveAllUsers(userList29);
        java.lang.Class<?> wildcardClass32 = userList29.getClass();
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Password1!" + "'", str9, "Password1!");
        org.junit.Assert.assertNotNull(userList11);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "Password1!" + "'", str27, "Password1!");
        org.junit.Assert.assertNotNull(userList29);
        org.junit.Assert.assertNotNull(wildcardClass32);
    }

    @Test
    public void test1288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1288");
        com.reservation_system.model.Guest guest5 = new com.reservation_system.model.Guest((int) (short) 10, "faculty", "researcher", "researcher", true);
        java.lang.String str6 = guest5.getEmail();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "researcher" + "'", str6, "researcher");
    }

    @Test
    public void test1289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1289");
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
        java.lang.String str21 = headLabCoordinator18.getEmail();
        java.lang.String str22 = headLabCoordinator18.getUserType();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(userOptional7);
        org.junit.Assert.assertNotNull(userOptional9);
        org.junit.Assert.assertNotNull(userOptional12);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "headlabcoordinator" + "'", str20, "headlabcoordinator");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "headlabcoordinator" + "'", str22, "headlabcoordinator");
    }

    @Test
    public void test1290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1290");
        com.reservation_system.model.Faculty faculty5 = new com.reservation_system.model.Faculty((int) '#', "Student", "student", "demo/data/test-users.csv", true);
        boolean boolean6 = faculty5.requiresDepartmentApproval();
        java.lang.String str7 = faculty5.getUserType();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Faculty" + "'", str7, "Faculty");
    }

    @Test
    public void test1291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1291");
        com.reservation_system.model.LabManager labManager5 = new com.reservation_system.model.LabManager(97, "Researcher", "labmanager", "Faculty", false);
    }

    @Test
    public void test1292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1292");
        com.reservation_system.model.Student student5 = new com.reservation_system.model.Student((int) (byte) 100, "Student", "researcher", "andrew@example.com", true);
        java.lang.String str6 = student5.getUserType();
        java.lang.String str7 = student5.getName();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Student" + "'", str6, "Student");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Student" + "'", str7, "Student");
    }

    @Test
    public void test1293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1293");
        com.reservation_system.model.Researcher researcher5 = new com.reservation_system.model.Researcher((int) 'a', "labmanager", "student", "researcher", false);
    }

    @Test
    public void test1294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1294");
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
        com.reservation_system.services.RegistrationService registrationService16 = new com.reservation_system.services.RegistrationService(userRepository1);
        boolean boolean18 = userRepository1.emailExists("researcher");
        com.reservation_system.services.RegistrationService registrationService19 = new com.reservation_system.services.RegistrationService(userRepository1);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Password1!" + "'", str9, "Password1!");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(userList15);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
    }

    @Test
    public void test1295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1295");
        com.reservation_system.model.Researcher researcher5 = new com.reservation_system.model.Researcher((int) (byte) 0, "headlabcoordinator", "guest", "labmanager", true);
    }

    @Test
    public void test1296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1296");
        com.reservation_system.model.Student student5 = new com.reservation_system.model.Student((int) ' ', "Researcher", "andrew@example.com", "Researcher", true);
        boolean boolean6 = student5.isApproved();
        boolean boolean7 = student5.isApproved();
        java.lang.String str8 = student5.getUserType();
        int int9 = student5.getID();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Student" + "'", str8, "Student");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 32 + "'", int9 == 32);
    }

    @Test
    public void test1297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1297");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("demo/data/test-users.csv");
        java.util.List<com.reservation_system.model.User> userList2 = userRepository1.getAllUsers();
        com.reservation_system.services.RegistrationService registrationService3 = new com.reservation_system.services.RegistrationService(userRepository1);
        java.util.List<com.reservation_system.model.User> userList4 = userRepository1.getAllUsers();
        boolean boolean6 = userRepository1.emailExists("Guest");
        java.util.List<com.reservation_system.model.User> userList7 = userRepository1.getAllUsers();
        java.util.Optional<com.reservation_system.model.User> userOptional9 = userRepository1.findByEmail("Password1!");
        java.util.Optional<com.reservation_system.model.User> userOptional11 = userRepository1.findByEmail("Andrew");
        com.reservation_system.repository.UserRepository userRepository13 = new com.reservation_system.repository.UserRepository("demo/data/test-users.csv");
        com.reservation_system.services.RegistrationService registrationService14 = new com.reservation_system.services.RegistrationService(userRepository13);
        com.reservation_system.model.Faculty faculty20 = new com.reservation_system.model.Faculty(0, "Password1!", "demo/data/test-users.csv", "researcher", false);
        java.lang.String str21 = faculty20.getName();
        userRepository13.addUser((com.reservation_system.model.User) faculty20);
        boolean boolean23 = userRepository13.headLabCoordinatorExists();
        com.reservation_system.model.Guest guest29 = new com.reservation_system.model.Guest((int) (byte) -1, "guest", "Researcher", "Faculty", true);
        userRepository13.addUser((com.reservation_system.model.User) guest29);
        boolean boolean32 = userRepository13.emailExists("Password1!");
        com.reservation_system.repository.UserRepository userRepository34 = new com.reservation_system.repository.UserRepository("demo/data/test-users.csv");
        com.reservation_system.services.RegistrationService registrationService35 = new com.reservation_system.services.RegistrationService(userRepository34);
        com.reservation_system.model.Faculty faculty41 = new com.reservation_system.model.Faculty(0, "Password1!", "demo/data/test-users.csv", "researcher", false);
        java.lang.String str42 = faculty41.getName();
        userRepository34.addUser((com.reservation_system.model.User) faculty41);
        boolean boolean44 = userRepository34.headLabCoordinatorExists();
        com.reservation_system.services.RegistrationService registrationService45 = new com.reservation_system.services.RegistrationService(userRepository34);
        java.util.List<com.reservation_system.model.User> userList46 = userRepository34.getAllUsers();
        com.reservation_system.repository.UserRepository userRepository48 = new com.reservation_system.repository.UserRepository("demo/data/test-users.csv");
        com.reservation_system.services.RegistrationService registrationService49 = new com.reservation_system.services.RegistrationService(userRepository48);
        com.reservation_system.model.Faculty faculty55 = new com.reservation_system.model.Faculty(0, "Password1!", "demo/data/test-users.csv", "researcher", false);
        java.lang.String str56 = faculty55.getName();
        userRepository48.addUser((com.reservation_system.model.User) faculty55);
        boolean boolean58 = userRepository48.headLabCoordinatorExists();
        com.reservation_system.services.RegistrationService registrationService59 = new com.reservation_system.services.RegistrationService(userRepository48);
        java.util.List<com.reservation_system.model.User> userList60 = userRepository48.getAllUsers();
        userRepository34.saveAllUsers(userList60);
        userRepository13.saveAllUsers(userList60);
        java.util.List<com.reservation_system.model.User> userList63 = userRepository13.getAllUsers();
        userRepository1.saveAllUsers(userList63);
        org.junit.Assert.assertNotNull(userList2);
        org.junit.Assert.assertNotNull(userList4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(userList7);
        org.junit.Assert.assertNotNull(userOptional9);
        org.junit.Assert.assertNotNull(userOptional11);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "Password1!" + "'", str21, "Password1!");
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "Password1!" + "'", str42, "Password1!");
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + true + "'", boolean44 == true);
        org.junit.Assert.assertNotNull(userList46);
        org.junit.Assert.assertEquals("'" + str56 + "' != '" + "Password1!" + "'", str56, "Password1!");
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + true + "'", boolean58 == true);
        org.junit.Assert.assertNotNull(userList60);
        org.junit.Assert.assertNotNull(userList63);
    }

    @Test
    public void test1298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1298");
        com.reservation_system.model.Researcher researcher5 = new com.reservation_system.model.Researcher((int) (short) 1, "Password1!", "headlabcoordinator", "", false);
        researcher5.setApproved(true);
        researcher5.setApproved(false);
        java.lang.String str10 = researcher5.getPassword();
        java.lang.String str11 = researcher5.getUserType();
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Researcher" + "'", str11, "Researcher");
    }

    @Test
    public void test1299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1299");
        com.reservation_system.model.Guest guest5 = new com.reservation_system.model.Guest(98, "faculty", "", "Student", true);
    }

    @Test
    public void test1300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1300");
        com.reservation_system.model.User user6 = com.reservation_system.patterns.factory.UserFactory.createUser("guest", 52, "Student", "faculty", "student", false);
        user6.setApproved(false);
        org.junit.Assert.assertNotNull(user6);
    }

    @Test
    public void test1301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1301");
        com.reservation_system.model.LabManager labManager5 = new com.reservation_system.model.LabManager(10, "Faculty", "faculty", "Password1!", true);
        java.lang.String str6 = labManager5.getUserType();
        java.lang.String str7 = labManager5.getUserType();
        java.lang.String str8 = labManager5.getUserType();
        labManager5.setApproved(false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "labmanager" + "'", str6, "labmanager");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "labmanager" + "'", str7, "labmanager");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "labmanager" + "'", str8, "labmanager");
    }

    @Test
    public void test1302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1302");
        com.reservation_system.model.Guest guest5 = new com.reservation_system.model.Guest((int) '#', "labmanager", "headlabcoordinator", "faculty", false);
        java.lang.String str6 = guest5.getUserType();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Guest" + "'", str6, "Guest");
    }

    @Test
    public void test1303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1303");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("demo/data/test-users.csv");
        int int2 = userRepository1.getNextID();
        int int3 = userRepository1.getNextID();
        boolean boolean5 = userRepository1.emailExists("faculty");
        com.reservation_system.model.LabManager labManager11 = new com.reservation_system.model.LabManager((int) (short) 0, "", "labmanager", "Password1!", true);
        userRepository1.addUser((com.reservation_system.model.User) labManager11);
        java.util.Optional<com.reservation_system.model.User> userOptional14 = userRepository1.findByEmail("");
        com.reservation_system.model.Researcher researcher20 = new com.reservation_system.model.Researcher((int) (byte) 100, "Password1!", "Password1!", "headlabcoordinator", true);
        userRepository1.addUser((com.reservation_system.model.User) researcher20);
        int int22 = userRepository1.getNextID();
        com.reservation_system.services.RegistrationService registrationService23 = new com.reservation_system.services.RegistrationService(userRepository1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 101 + "'", int2 == 101);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 101 + "'", int3 == 101);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(userOptional14);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 101 + "'", int22 == 101);
    }

    @Test
    public void test1304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1304");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("demo/data/test-users.csv");
        com.reservation_system.services.RegistrationService registrationService2 = new com.reservation_system.services.RegistrationService(userRepository1);
        com.reservation_system.model.Faculty faculty8 = new com.reservation_system.model.Faculty(0, "Password1!", "demo/data/test-users.csv", "researcher", false);
        java.lang.String str9 = faculty8.getName();
        userRepository1.addUser((com.reservation_system.model.User) faculty8);
        boolean boolean12 = userRepository1.emailExists("Faculty");
        int int13 = userRepository1.getNextID();
        com.reservation_system.services.RegistrationService registrationService14 = new com.reservation_system.services.RegistrationService(userRepository1);
        int int15 = userRepository1.getNextID();
        com.reservation_system.services.RegistrationService registrationService16 = new com.reservation_system.services.RegistrationService(userRepository1);
        // The following exception was thrown during execution in test generation
        try {
            com.reservation_system.model.User user21 = registrationService16.registerUser("researcher", "Researcher", "Student", "demo/data/test-users.csv");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid email format.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Password1!" + "'", str9, "Password1!");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 101 + "'", int13 == 101);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 101 + "'", int15 == 101);
    }

    @Test
    public void test1305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1305");
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
            com.reservation_system.model.User user18 = registrationService13.registerUser("Student", "andrew@example.com", "andrew@example.com", "Guest");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Password must contain uppercase, lowercase, number, and symbol, and be at least 8 characters long.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Password1!" + "'", str9, "Password1!");
    }

    @Test
    public void test1306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1306");
        com.reservation_system.model.Guest guest5 = new com.reservation_system.model.Guest((int) (short) -1, "", "hi!", "Guest", true);
        java.lang.String str6 = guest5.getUserType();
        java.lang.String str7 = guest5.getUserType();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Guest" + "'", str6, "Guest");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Guest" + "'", str7, "Guest");
    }

    @Test
    public void test1307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1307");
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
        boolean boolean51 = userRepository1.headLabCoordinatorExists();
        java.util.List<com.reservation_system.model.User> userList52 = userRepository1.getAllUsers();
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Password1!" + "'", str9, "Password1!");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "Password1!" + "'", str30, "Password1!");
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertNotNull(userList34);
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "Password1!" + "'", str44, "Password1!");
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + true + "'", boolean46 == true);
        org.junit.Assert.assertNotNull(userList48);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + true + "'", boolean51 == true);
        org.junit.Assert.assertNotNull(userList52);
    }

    @Test
    public void test1308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1308");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("demo/data/test-users.csv");
        java.util.Optional<com.reservation_system.model.User> userOptional3 = userRepository1.findByEmail("hi!");
        int int4 = userRepository1.getNextID();
        boolean boolean5 = userRepository1.headLabCoordinatorExists();
        com.reservation_system.model.User user6 = null;
        // The following exception was thrown during execution in test generation
        try {
            userRepository1.addUser(user6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(userOptional3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 101 + "'", int4 == 101);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
    }

    @Test
    public void test1309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1309");
        com.reservation_system.model.HeadLabCoordinator headLabCoordinator5 = new com.reservation_system.model.HeadLabCoordinator((int) (short) 100, "hi!", "Password1!", "Andrew", false);
        java.lang.String str6 = headLabCoordinator5.getEmail();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Password1!" + "'", str6, "Password1!");
    }

    @Test
    public void test1310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1310");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("demo/data/test-users.csv");
        boolean boolean2 = userRepository1.headLabCoordinatorExists();
        com.reservation_system.services.RegistrationService registrationService3 = new com.reservation_system.services.RegistrationService(userRepository1);
        boolean boolean5 = userRepository1.emailExists("");
        com.reservation_system.model.Guest guest11 = new com.reservation_system.model.Guest((int) '#', "Guest", "researcher", "headlabcoordinator", true);
        userRepository1.addUser((com.reservation_system.model.User) guest11);
        boolean boolean13 = userRepository1.headLabCoordinatorExists();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test1311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1311");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("demo/data/test-users.csv");
        com.reservation_system.services.RegistrationService registrationService2 = new com.reservation_system.services.RegistrationService(userRepository1);
        com.reservation_system.model.Faculty faculty8 = new com.reservation_system.model.Faculty(0, "Password1!", "demo/data/test-users.csv", "researcher", false);
        java.lang.String str9 = faculty8.getName();
        userRepository1.addUser((com.reservation_system.model.User) faculty8);
        boolean boolean11 = userRepository1.headLabCoordinatorExists();
        com.reservation_system.services.RegistrationService registrationService12 = new com.reservation_system.services.RegistrationService(userRepository1);
        com.reservation_system.services.RegistrationService registrationService13 = new com.reservation_system.services.RegistrationService(userRepository1);
        com.reservation_system.services.RegistrationService registrationService14 = new com.reservation_system.services.RegistrationService(userRepository1);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Password1!" + "'", str9, "Password1!");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test1312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1312");
        com.reservation_system.model.Student student5 = new com.reservation_system.model.Student(97, "demo/data/test-users.csv", "", "faculty", true);
    }

    @Test
    public void test1313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1313");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("demo/data/test-users.csv");
        com.reservation_system.services.RegistrationService registrationService2 = new com.reservation_system.services.RegistrationService(userRepository1);
        com.reservation_system.services.RegistrationService registrationService3 = new com.reservation_system.services.RegistrationService(userRepository1);
        boolean boolean5 = userRepository1.emailExists("faculty");
        java.util.Optional<com.reservation_system.model.User> userOptional7 = userRepository1.findByEmail("researcher");
        com.reservation_system.model.Student student13 = new com.reservation_system.model.Student(0, "Student", "Faculty", "hi!", false);
        userRepository1.addUser((com.reservation_system.model.User) student13);
        java.util.Optional<com.reservation_system.model.User> userOptional16 = userRepository1.findByEmail("hi!");
        com.reservation_system.services.RegistrationService registrationService17 = new com.reservation_system.services.RegistrationService(userRepository1);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(userOptional7);
        org.junit.Assert.assertNotNull(userOptional16);
    }

    @Test
    public void test1314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1314");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("demo/data/test-users.csv");
        com.reservation_system.services.RegistrationService registrationService2 = new com.reservation_system.services.RegistrationService(userRepository1);
        // The following exception was thrown during execution in test generation
        try {
            com.reservation_system.model.User user7 = registrationService2.registerUser("Andrew", "Researcher", "hi!", "student");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid user type.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1315");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("demo/data/test-users.csv");
        com.reservation_system.services.RegistrationService registrationService2 = new com.reservation_system.services.RegistrationService(userRepository1);
        com.reservation_system.model.Faculty faculty8 = new com.reservation_system.model.Faculty(0, "Password1!", "demo/data/test-users.csv", "researcher", false);
        java.lang.String str9 = faculty8.getName();
        userRepository1.addUser((com.reservation_system.model.User) faculty8);
        boolean boolean11 = userRepository1.headLabCoordinatorExists();
        com.reservation_system.services.RegistrationService registrationService12 = new com.reservation_system.services.RegistrationService(userRepository1);
        java.util.List<com.reservation_system.model.User> userList13 = userRepository1.getAllUsers();
        com.reservation_system.repository.UserRepository userRepository15 = new com.reservation_system.repository.UserRepository("demo/data/test-users.csv");
        com.reservation_system.services.RegistrationService registrationService16 = new com.reservation_system.services.RegistrationService(userRepository15);
        com.reservation_system.model.Faculty faculty22 = new com.reservation_system.model.Faculty(0, "Password1!", "demo/data/test-users.csv", "researcher", false);
        java.lang.String str23 = faculty22.getName();
        userRepository15.addUser((com.reservation_system.model.User) faculty22);
        boolean boolean25 = userRepository15.headLabCoordinatorExists();
        com.reservation_system.services.RegistrationService registrationService26 = new com.reservation_system.services.RegistrationService(userRepository15);
        java.util.List<com.reservation_system.model.User> userList27 = userRepository15.getAllUsers();
        userRepository1.saveAllUsers(userList27);
        java.util.Optional<com.reservation_system.model.User> userOptional30 = userRepository1.findByEmail("faculty");
        com.reservation_system.services.RegistrationService registrationService31 = new com.reservation_system.services.RegistrationService(userRepository1);
        // The following exception was thrown during execution in test generation
        try {
            com.reservation_system.model.User user36 = registrationService31.registerUser("andrew@example.com", "", "student", "andrew@example.com");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid user type.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Password1!" + "'", str9, "Password1!");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(userList13);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "Password1!" + "'", str23, "Password1!");
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertNotNull(userList27);
        org.junit.Assert.assertNotNull(userOptional30);
    }

    @Test
    public void test1316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1316");
        // The following exception was thrown during execution in test generation
        try {
            com.reservation_system.model.User user6 = com.reservation_system.patterns.factory.UserFactory.createUser("hi!", (int) (short) 1, "Researcher", "hi!", "headlabcoordinator", true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid user type: hi!");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1317");
        com.reservation_system.model.Researcher researcher5 = new com.reservation_system.model.Researcher(102, "Guest", "Guest", "faculty", false);
    }

    @Test
    public void test1318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1318");
        com.reservation_system.model.Student student5 = new com.reservation_system.model.Student((int) (byte) 0, "Student", "Andrew", "labmanager", false);
        java.lang.String str6 = student5.getUserType();
        boolean boolean7 = student5.requiresDepartmentApproval();
        java.lang.String str8 = student5.getUserType();
        java.lang.String str9 = student5.getEmail();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Student" + "'", str6, "Student");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Student" + "'", str8, "Student");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Andrew" + "'", str9, "Andrew");
    }

    @Test
    public void test1319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1319");
        com.reservation_system.model.LabManager labManager5 = new com.reservation_system.model.LabManager((int) (short) 1, "Researcher", "student", "student", true);
        java.lang.String str6 = labManager5.getUserType();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "labmanager" + "'", str6, "labmanager");
    }

    @Test
    public void test1320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1320");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("demo/data/test-users.csv");
        com.reservation_system.services.RegistrationService registrationService2 = new com.reservation_system.services.RegistrationService(userRepository1);
        com.reservation_system.model.Faculty faculty8 = new com.reservation_system.model.Faculty(0, "Password1!", "demo/data/test-users.csv", "researcher", false);
        java.lang.String str9 = faculty8.getName();
        userRepository1.addUser((com.reservation_system.model.User) faculty8);
        boolean boolean12 = userRepository1.emailExists("Faculty");
        int int13 = userRepository1.getNextID();
        com.reservation_system.services.RegistrationService registrationService14 = new com.reservation_system.services.RegistrationService(userRepository1);
        boolean boolean16 = userRepository1.emailExists("student");
        com.reservation_system.services.RegistrationService registrationService17 = new com.reservation_system.services.RegistrationService(userRepository1);
        boolean boolean18 = userRepository1.headLabCoordinatorExists();
        int int19 = userRepository1.getNextID();
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Password1!" + "'", str9, "Password1!");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 101 + "'", int13 == 101);
// flaky "26) test1320(com.reservation_system.randoop.registrationservice.RegressionTest2)":         org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 101 + "'", int19 == 101);
    }

    @Test
    public void test1321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1321");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("demo/data/test-users.csv");
        com.reservation_system.services.RegistrationService registrationService2 = new com.reservation_system.services.RegistrationService(userRepository1);
        com.reservation_system.model.Faculty faculty8 = new com.reservation_system.model.Faculty(0, "Password1!", "demo/data/test-users.csv", "researcher", false);
        java.lang.String str9 = faculty8.getName();
        userRepository1.addUser((com.reservation_system.model.User) faculty8);
        java.util.List<com.reservation_system.model.User> userList11 = userRepository1.getAllUsers();
        com.reservation_system.model.LabManager labManager17 = new com.reservation_system.model.LabManager((int) (short) -1, "labmanager", "demo/data/test-users.csv", "Student", false);
        userRepository1.addUser((com.reservation_system.model.User) labManager17);
        com.reservation_system.services.RegistrationService registrationService19 = new com.reservation_system.services.RegistrationService(userRepository1);
        java.util.List<com.reservation_system.model.User> userList20 = userRepository1.getAllUsers();
        java.lang.Class<?> wildcardClass21 = userList20.getClass();
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Password1!" + "'", str9, "Password1!");
        org.junit.Assert.assertNotNull(userList11);
        org.junit.Assert.assertNotNull(userList20);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test1322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1322");
        com.reservation_system.model.Faculty faculty5 = new com.reservation_system.model.Faculty(10, "researcher", "faculty", "", false);
        java.lang.String str6 = faculty5.getUserType();
        java.lang.String str7 = faculty5.getPassword();
        java.lang.String str8 = faculty5.getUserType();
        faculty5.setApproved(true);
        java.lang.String str11 = faculty5.getUserType();
        java.lang.String str12 = faculty5.getUserType();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Faculty" + "'", str6, "Faculty");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Faculty" + "'", str8, "Faculty");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Faculty" + "'", str11, "Faculty");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Faculty" + "'", str12, "Faculty");
    }

    @Test
    public void test1323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1323");
        com.reservation_system.model.Guest guest5 = new com.reservation_system.model.Guest((int) 'a', "labmanager", "headlabcoordinator", "Researcher", true);
        int int6 = guest5.getID();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 97 + "'", int6 == 97);
    }

    @Test
    public void test1324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1324");
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
        java.util.Optional<com.reservation_system.model.User> userOptional25 = userRepository1.findByEmail("Faculty");
        int int26 = userRepository1.getNextID();
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Password1!" + "'", str9, "Password1!");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertNotNull(userList21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertNotNull(userOptional25);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 101 + "'", int26 == 101);
    }

    @Test
    public void test1325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1325");
        com.reservation_system.model.Researcher researcher5 = new com.reservation_system.model.Researcher((int) (byte) 10, "researcher", "andrew@example.com", "hi!", true);
        int int6 = researcher5.getID();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
    }

    @Test
    public void test1326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1326");
        com.reservation_system.model.LabManager labManager5 = new com.reservation_system.model.LabManager(33, "", "", "faculty", false);
    }

    @Test
    public void test1327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1327");
        com.reservation_system.model.Guest guest5 = new com.reservation_system.model.Guest(33, "Andrew", "Password1!", "researcher", true);
        java.lang.String str6 = guest5.getUserType();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Guest" + "'", str6, "Guest");
    }

    @Test
    public void test1328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1328");
        com.reservation_system.model.Faculty faculty5 = new com.reservation_system.model.Faculty((int) (byte) -1, "researcher", "hi!", "Andrew", false);
    }

    @Test
    public void test1329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1329");
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
        int int45 = userRepository1.getNextID();
        com.reservation_system.repository.UserRepository userRepository47 = new com.reservation_system.repository.UserRepository("demo/data/test-users.csv");
        int int48 = userRepository47.getNextID();
        int int49 = userRepository47.getNextID();
        boolean boolean51 = userRepository47.emailExists("faculty");
        com.reservation_system.model.LabManager labManager57 = new com.reservation_system.model.LabManager((int) (short) 0, "", "labmanager", "Password1!", true);
        userRepository47.addUser((com.reservation_system.model.User) labManager57);
        java.util.Optional<com.reservation_system.model.User> userOptional60 = userRepository47.findByEmail("");
        com.reservation_system.model.Researcher researcher66 = new com.reservation_system.model.Researcher((int) (byte) 100, "Password1!", "Password1!", "headlabcoordinator", true);
        userRepository47.addUser((com.reservation_system.model.User) researcher66);
        java.util.List<com.reservation_system.model.User> userList68 = userRepository47.getAllUsers();
        userRepository1.saveAllUsers(userList68);
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
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 101 + "'", int45 == 101);
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 101 + "'", int48 == 101);
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + 101 + "'", int49 == 101);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + true + "'", boolean51 == true);
        org.junit.Assert.assertNotNull(userOptional60);
        org.junit.Assert.assertNotNull(userList68);
    }

    @Test
    public void test1330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1330");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("demo/data/test-users.csv");
        java.util.List<com.reservation_system.model.User> userList2 = userRepository1.getAllUsers();
        com.reservation_system.services.RegistrationService registrationService3 = new com.reservation_system.services.RegistrationService(userRepository1);
        com.reservation_system.services.RegistrationService registrationService4 = new com.reservation_system.services.RegistrationService(userRepository1);
        java.util.Optional<com.reservation_system.model.User> userOptional6 = userRepository1.findByEmail("andrew@example.com");
        java.util.List<com.reservation_system.model.User> userList7 = userRepository1.getAllUsers();
        int int8 = userRepository1.getNextID();
        org.junit.Assert.assertNotNull(userList2);
        org.junit.Assert.assertNotNull(userOptional6);
        org.junit.Assert.assertNotNull(userList7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 101 + "'", int8 == 101);
    }

    @Test
    public void test1331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1331");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("demo/data/test-users.csv");
        com.reservation_system.services.RegistrationService registrationService2 = new com.reservation_system.services.RegistrationService(userRepository1);
        com.reservation_system.model.Faculty faculty8 = new com.reservation_system.model.Faculty(0, "Password1!", "demo/data/test-users.csv", "researcher", false);
        java.lang.String str9 = faculty8.getName();
        userRepository1.addUser((com.reservation_system.model.User) faculty8);
        boolean boolean11 = userRepository1.headLabCoordinatorExists();
        com.reservation_system.model.Guest guest17 = new com.reservation_system.model.Guest((int) (byte) -1, "guest", "Researcher", "Faculty", true);
        userRepository1.addUser((com.reservation_system.model.User) guest17);
        java.util.List<com.reservation_system.model.User> userList19 = userRepository1.getAllUsers();
        boolean boolean21 = userRepository1.emailExists("labmanager");
        boolean boolean23 = userRepository1.emailExists("Password1!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Password1!" + "'", str9, "Password1!");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(userList19);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
    }

    @Test
    public void test1332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1332");
        com.reservation_system.model.Guest guest5 = new com.reservation_system.model.Guest(102, "headlabcoordinator", "Student", "Andrew", true);
        boolean boolean6 = guest5.requiresDepartmentApproval();
        java.lang.String str7 = guest5.getName();
        int int8 = guest5.getID();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "headlabcoordinator" + "'", str7, "headlabcoordinator");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 102 + "'", int8 == 102);
    }

    @Test
    public void test1333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1333");
        com.reservation_system.model.Researcher researcher5 = new com.reservation_system.model.Researcher((int) (short) -1, "andrew@example.com", "guest", "labmanager", false);
        java.lang.String str6 = researcher5.getPassword();
        boolean boolean7 = researcher5.requiresDepartmentApproval();
        java.lang.String str8 = researcher5.getUserType();
        int int9 = researcher5.getID();
        researcher5.setApproved(false);
        researcher5.setApproved(false);
        java.lang.String str14 = researcher5.getUserType();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "labmanager" + "'", str6, "labmanager");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Researcher" + "'", str8, "Researcher");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Researcher" + "'", str14, "Researcher");
    }

    @Test
    public void test1334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1334");
        com.reservation_system.model.Guest guest5 = new com.reservation_system.model.Guest(0, "Faculty", "demo/data/test-users.csv", "labmanager", false);
    }

    @Test
    public void test1335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1335");
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
        com.reservation_system.repository.UserRepository userRepository28 = new com.reservation_system.repository.UserRepository("demo/data/test-users.csv");
        java.util.List<com.reservation_system.model.User> userList29 = userRepository28.getAllUsers();
        com.reservation_system.services.RegistrationService registrationService30 = new com.reservation_system.services.RegistrationService(userRepository28);
        int int31 = userRepository28.getNextID();
        com.reservation_system.model.Student student37 = new com.reservation_system.model.Student(100, "Faculty", "Student", "hi!", true);
        java.lang.String str38 = student37.getUserType();
        java.lang.String str39 = student37.getUserType();
        userRepository28.addUser((com.reservation_system.model.User) student37);
        userRepository1.addUser((com.reservation_system.model.User) student37);
        java.lang.String str42 = student37.getPassword();
        java.lang.String str43 = student37.getUserType();
        org.junit.Assert.assertNotNull(userOptional3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 101 + "'", int4 == 101);
        org.junit.Assert.assertNotNull(userList12);
        org.junit.Assert.assertNotNull(userList29);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 101 + "'", int31 == 101);
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "Student" + "'", str38, "Student");
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "Student" + "'", str39, "Student");
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "hi!" + "'", str42, "hi!");
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "Student" + "'", str43, "Student");
    }

    @Test
    public void test1336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1336");
        com.reservation_system.model.Guest guest5 = new com.reservation_system.model.Guest((int) '4', "hi!", "Faculty", "Password1!", false);
        int int6 = guest5.getID();
        java.lang.String str7 = guest5.getUserType();
        java.lang.String str8 = guest5.getUserType();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 52 + "'", int6 == 52);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Guest" + "'", str7, "Guest");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Guest" + "'", str8, "Guest");
    }

    @Test
    public void test1337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1337");
        com.reservation_system.model.HeadLabCoordinator headLabCoordinator5 = new com.reservation_system.model.HeadLabCoordinator((int) (short) -1, "student", "Faculty", "", false);
    }

    @Test
    public void test1338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1338");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("demo/data/test-users.csv");
        java.util.List<com.reservation_system.model.User> userList2 = userRepository1.getAllUsers();
        com.reservation_system.services.RegistrationService registrationService3 = new com.reservation_system.services.RegistrationService(userRepository1);
        java.util.List<com.reservation_system.model.User> userList4 = userRepository1.getAllUsers();
        boolean boolean6 = userRepository1.emailExists("Guest");
        java.util.List<com.reservation_system.model.User> userList7 = userRepository1.getAllUsers();
        java.util.Optional<com.reservation_system.model.User> userOptional9 = userRepository1.findByEmail("Password1!");
        java.util.Optional<com.reservation_system.model.User> userOptional11 = userRepository1.findByEmail("Andrew");
        boolean boolean12 = userRepository1.headLabCoordinatorExists();
        boolean boolean14 = userRepository1.emailExists("Andrew");
        org.junit.Assert.assertNotNull(userList2);
        org.junit.Assert.assertNotNull(userList4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(userList7);
        org.junit.Assert.assertNotNull(userOptional9);
        org.junit.Assert.assertNotNull(userOptional11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test1339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1339");
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
        java.util.Optional<com.reservation_system.model.User> userOptional24 = userRepository1.findByEmail("Faculty");
        com.reservation_system.services.RegistrationService registrationService25 = new com.reservation_system.services.RegistrationService(userRepository1);
        // The following exception was thrown during execution in test generation
        try {
            com.reservation_system.model.User user30 = registrationService25.registerUser("Guest", "Guest", "labmanager", "Faculty");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid email format.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Password1!" + "'", str9, "Password1!");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertNotNull(userOptional24);
    }

    @Test
    public void test1340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1340");
        com.reservation_system.model.HeadLabCoordinator headLabCoordinator5 = new com.reservation_system.model.HeadLabCoordinator((int) '4', "hi!", "demo/data/test-users.csv", "Researcher", false);
    }

    @Test
    public void test1341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1341");
        com.reservation_system.model.Faculty faculty5 = new com.reservation_system.model.Faculty(100, "guest", "student", "headlabcoordinator", true);
        boolean boolean6 = faculty5.isApproved();
        java.lang.String str7 = faculty5.getUserType();
        java.lang.String str8 = faculty5.getUserType();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Faculty" + "'", str7, "Faculty");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Faculty" + "'", str8, "Faculty");
    }

    @Test
    public void test1342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1342");
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
        com.reservation_system.services.RegistrationService registrationService90 = new com.reservation_system.services.RegistrationService(userRepository1);
        boolean boolean92 = userRepository1.emailExists("guest");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Password1!" + "'", str9, "Password1!");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 101 + "'", int23 == 101);
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
        org.junit.Assert.assertTrue("'" + boolean89 + "' != '" + true + "'", boolean89 == true);
        org.junit.Assert.assertTrue("'" + boolean92 + "' != '" + true + "'", boolean92 == true);
    }

    @Test
    public void test1343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1343");
        com.reservation_system.model.Guest guest5 = new com.reservation_system.model.Guest((int) (byte) -1, "Guest", "faculty", "Faculty", true);
        java.lang.String str6 = guest5.getUserType();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Guest" + "'", str6, "Guest");
    }

    @Test
    public void test1344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1344");
        com.reservation_system.model.HeadLabCoordinator headLabCoordinator5 = new com.reservation_system.model.HeadLabCoordinator((int) 'a', "labmanager", "Researcher", "Guest", true);
    }

    @Test
    public void test1345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1345");
        com.reservation_system.model.Student student5 = new com.reservation_system.model.Student((int) (short) 0, "researcher", "headlabcoordinator", "researcher", false);
        java.lang.String str6 = student5.getEmail();
        int int7 = student5.getID();
        java.lang.String str8 = student5.getName();
        boolean boolean9 = student5.isApproved();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "headlabcoordinator" + "'", str6, "headlabcoordinator");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "researcher" + "'", str8, "researcher");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test1346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1346");
        com.reservation_system.model.Researcher researcher5 = new com.reservation_system.model.Researcher(103, "Andrew", "Student", "guest", false);
    }

    @Test
    public void test1347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1347");
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
        com.reservation_system.services.RegistrationService registrationService51 = new com.reservation_system.services.RegistrationService(userRepository1);
        com.reservation_system.model.Guest guest57 = new com.reservation_system.model.Guest(32, "", "Faculty", "Password1!", false);
        userRepository1.addUser((com.reservation_system.model.User) guest57);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "Password1!" + "'", str17, "Password1!");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNotNull(userList27);
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "Password1!" + "'", str38, "Password1!");
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + true + "'", boolean40 == true);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 101 + "'", int41 == 101);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 101 + "'", int45 == 101);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + true + "'", boolean47 == true);
        org.junit.Assert.assertNotNull(userList48);
    }

    @Test
    public void test1348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1348");
        com.reservation_system.model.HeadLabCoordinator headLabCoordinator5 = new com.reservation_system.model.HeadLabCoordinator(1, "student", "Researcher", "", false);
        java.lang.String str6 = headLabCoordinator5.getUserType();
        java.lang.String str7 = headLabCoordinator5.getPassword();
        boolean boolean8 = headLabCoordinator5.requiresDepartmentApproval();
        java.lang.String str9 = headLabCoordinator5.getUserType();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "headlabcoordinator" + "'", str6, "headlabcoordinator");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "headlabcoordinator" + "'", str9, "headlabcoordinator");
    }

    @Test
    public void test1349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1349");
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
        boolean boolean26 = userRepository1.emailExists("Password1!");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 101 + "'", int2 == 101);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "labmanager" + "'", str9, "labmanager");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "guest" + "'", str12, "guest");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "Password1!" + "'", str20, "Password1!");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "Password1!" + "'", str21, "Password1!");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "Password1!" + "'", str22, "Password1!");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "demo/data/test-users.csv" + "'", str23, "demo/data/test-users.csv");
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
    }

    @Test
    public void test1350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1350");
        com.reservation_system.model.User user6 = com.reservation_system.patterns.factory.UserFactory.createUser("researcher", 0, "Researcher", "demo/data/test-users.csv", "student", true);
        org.junit.Assert.assertNotNull(user6);
    }

    @Test
    public void test1351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1351");
        com.reservation_system.model.HeadLabCoordinator headLabCoordinator5 = new com.reservation_system.model.HeadLabCoordinator((int) (byte) 100, "researcher", "Researcher", "Student", true);
        java.lang.String str6 = headLabCoordinator5.getUserType();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "headlabcoordinator" + "'", str6, "headlabcoordinator");
    }

    @Test
    public void test1352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1352");
        com.reservation_system.model.Faculty faculty5 = new com.reservation_system.model.Faculty((int) (short) 10, "Student", "labmanager", "Researcher", false);
        java.lang.String str6 = faculty5.getUserType();
        boolean boolean7 = faculty5.isApproved();
        boolean boolean8 = faculty5.isApproved();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Faculty" + "'", str6, "Faculty");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test1353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1353");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("demo/data/test-users.csv");
        boolean boolean2 = userRepository1.headLabCoordinatorExists();
        com.reservation_system.services.RegistrationService registrationService3 = new com.reservation_system.services.RegistrationService(userRepository1);
        boolean boolean4 = userRepository1.headLabCoordinatorExists();
        boolean boolean6 = userRepository1.emailExists("Andrew");
        com.reservation_system.services.RegistrationService registrationService7 = new com.reservation_system.services.RegistrationService(userRepository1);
        java.util.Optional<com.reservation_system.model.User> userOptional9 = userRepository1.findByEmail("faculty");
        com.reservation_system.services.RegistrationService registrationService10 = new com.reservation_system.services.RegistrationService(userRepository1);
        // The following exception was thrown during execution in test generation
        try {
            com.reservation_system.model.User user15 = registrationService10.registerUser("labmanager", "headlabcoordinator", "andrew@example.com", "Faculty");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Lab manager accounts must be generated by the head lab coordinator.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(userOptional9);
    }

    @Test
    public void test1354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1354");
        com.reservation_system.model.Faculty faculty5 = new com.reservation_system.model.Faculty((int) (short) 0, "guest", "Andrew", "guest", true);
        java.lang.String str6 = faculty5.getName();
        java.lang.String str7 = faculty5.getUserType();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "guest" + "'", str6, "guest");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Faculty" + "'", str7, "Faculty");
    }

    @Test
    public void test1355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1355");
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
        com.reservation_system.repository.UserRepository userRepository27 = new com.reservation_system.repository.UserRepository("demo/data/test-users.csv");
        boolean boolean28 = userRepository27.headLabCoordinatorExists();
        com.reservation_system.repository.UserRepository userRepository30 = new com.reservation_system.repository.UserRepository("demo/data/test-users.csv");
        com.reservation_system.services.RegistrationService registrationService31 = new com.reservation_system.services.RegistrationService(userRepository30);
        com.reservation_system.model.Faculty faculty37 = new com.reservation_system.model.Faculty(0, "Password1!", "demo/data/test-users.csv", "researcher", false);
        java.lang.String str38 = faculty37.getName();
        userRepository30.addUser((com.reservation_system.model.User) faculty37);
        java.util.List<com.reservation_system.model.User> userList40 = userRepository30.getAllUsers();
        userRepository27.saveAllUsers(userList40);
        userRepository1.saveAllUsers(userList40);
        boolean boolean43 = userRepository1.headLabCoordinatorExists();
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Password1!" + "'", str14, "Password1!");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNotNull(userList24);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "Password1!" + "'", str38, "Password1!");
        org.junit.Assert.assertNotNull(userList40);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + true + "'", boolean43 == true);
    }

    @Test
    public void test1356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1356");
        com.reservation_system.model.LabManager labManager5 = new com.reservation_system.model.LabManager((int) (byte) 1, "Password1!", "researcher", "student", true);
    }

    @Test
    public void test1357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1357");
        com.reservation_system.model.LabManager labManager5 = new com.reservation_system.model.LabManager((int) (byte) 10, "researcher", "guest", "researcher", false);
        java.lang.String str6 = labManager5.getUserType();
        java.lang.String str7 = labManager5.getUserType();
        labManager5.setApproved(true);
        int int10 = labManager5.getID();
        java.lang.String str11 = labManager5.getName();
        java.lang.String str12 = labManager5.getUserType();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "labmanager" + "'", str6, "labmanager");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "labmanager" + "'", str7, "labmanager");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 10 + "'", int10 == 10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "researcher" + "'", str11, "researcher");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "labmanager" + "'", str12, "labmanager");
    }

    @Test
    public void test1358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1358");
        // The following exception was thrown during execution in test generation
        try {
            com.reservation_system.model.User user6 = com.reservation_system.patterns.factory.UserFactory.createUser("", (int) (short) 1, "faculty", "student", "hi!", true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid user type: ");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1359() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1359");
        com.reservation_system.model.Faculty faculty5 = new com.reservation_system.model.Faculty((int) (short) 1, "guest", "Faculty", "hi!", true);
    }

    @Test
    public void test1360() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1360");
        com.reservation_system.model.HeadLabCoordinator headLabCoordinator5 = new com.reservation_system.model.HeadLabCoordinator((int) (byte) 0, "Password1!", "guest", "headlabcoordinator", true);
    }

    @Test
    public void test1361() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1361");
        com.reservation_system.model.Faculty faculty5 = new com.reservation_system.model.Faculty(0, "demo/data/test-users.csv", "Andrew", "", true);
    }

    @Test
    public void test1362() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1362");
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
        com.reservation_system.model.Researcher researcher53 = new com.reservation_system.model.Researcher((int) (short) -1, "faculty", "researcher", "hi!", true);
        java.lang.String str54 = researcher53.getUserType();
        int int55 = researcher53.getID();
        researcher53.setApproved(false);
        userRepository1.addUser((com.reservation_system.model.User) researcher53);
        researcher53.setApproved(false);
        researcher53.setApproved(true);
        java.lang.String str63 = researcher53.getUserType();
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Password1!" + "'", str9, "Password1!");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "Password1!" + "'", str29, "Password1!");
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "Password1!" + "'", str41, "Password1!");
        org.junit.Assert.assertNotNull(userList43);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + true + "'", boolean47 == true);
        org.junit.Assert.assertEquals("'" + str54 + "' != '" + "Researcher" + "'", str54, "Researcher");
        org.junit.Assert.assertTrue("'" + int55 + "' != '" + (-1) + "'", int55 == (-1));
        org.junit.Assert.assertEquals("'" + str63 + "' != '" + "Researcher" + "'", str63, "Researcher");
    }

    @Test
    public void test1363() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1363");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("demo/data/test-users.csv");
        com.reservation_system.services.RegistrationService registrationService2 = new com.reservation_system.services.RegistrationService(userRepository1);
        com.reservation_system.model.Faculty faculty8 = new com.reservation_system.model.Faculty(0, "Password1!", "demo/data/test-users.csv", "researcher", false);
        java.lang.String str9 = faculty8.getName();
        userRepository1.addUser((com.reservation_system.model.User) faculty8);
        boolean boolean11 = userRepository1.headLabCoordinatorExists();
        java.util.Optional<com.reservation_system.model.User> userOptional13 = userRepository1.findByEmail("andrew@example.com");
        java.lang.Class<?> wildcardClass14 = userOptional13.getClass();
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Password1!" + "'", str9, "Password1!");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(userOptional13);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test1364() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1364");
        com.reservation_system.model.User user6 = com.reservation_system.patterns.factory.UserFactory.createUser("headlabcoordinator", (int) '4', "Student", "demo/data/test-users.csv", "Password1!", true);
        org.junit.Assert.assertNotNull(user6);
    }

    @Test
    public void test1365() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1365");
        com.reservation_system.model.Student student5 = new com.reservation_system.model.Student((int) (byte) 0, "Student", "Andrew", "labmanager", false);
        student5.setApproved(false);
        java.lang.String str8 = student5.getPassword();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "labmanager" + "'", str8, "labmanager");
    }

    @Test
    public void test1366() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1366");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("demo/data/test-users.csv");
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
        java.util.Optional<com.reservation_system.model.User> userOptional19 = userRepository1.findByEmail("Faculty");
        java.util.Optional<com.reservation_system.model.User> userOptional21 = userRepository1.findByEmail("student");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Researcher" + "'", str14, "Researcher");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Researcher" + "'", str16, "Researcher");
        org.junit.Assert.assertNotNull(userOptional19);
        org.junit.Assert.assertNotNull(userOptional21);
    }

    @Test
    public void test1367() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1367");
        com.reservation_system.model.HeadLabCoordinator headLabCoordinator5 = new com.reservation_system.model.HeadLabCoordinator((int) (short) 1, "", "hi!", "Guest", false);
    }

    @Test
    public void test1368() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1368");
        com.reservation_system.model.Student student5 = new com.reservation_system.model.Student(1, "Faculty", "faculty", "faculty", true);
    }

    @Test
    public void test1369() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1369");
        com.reservation_system.model.Student student5 = new com.reservation_system.model.Student(97, "Password1!", "hi!", "Guest", false);
    }

    @Test
    public void test1370() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1370");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("demo/data/test-users.csv");
        int int2 = userRepository1.getNextID();
        int int3 = userRepository1.getNextID();
        boolean boolean5 = userRepository1.emailExists("faculty");
        com.reservation_system.model.LabManager labManager11 = new com.reservation_system.model.LabManager((int) (short) 0, "", "labmanager", "Password1!", true);
        userRepository1.addUser((com.reservation_system.model.User) labManager11);
        java.util.Optional<com.reservation_system.model.User> userOptional14 = userRepository1.findByEmail("");
        com.reservation_system.model.Researcher researcher20 = new com.reservation_system.model.Researcher((int) (byte) 100, "Password1!", "Password1!", "headlabcoordinator", true);
        userRepository1.addUser((com.reservation_system.model.User) researcher20);
        boolean boolean22 = userRepository1.headLabCoordinatorExists();
        java.util.Optional<com.reservation_system.model.User> userOptional24 = userRepository1.findByEmail("labmanager");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 101 + "'", int2 == 101);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 101 + "'", int3 == 101);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(userOptional14);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertNotNull(userOptional24);
    }

    @Test
    public void test1371() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1371");
        com.reservation_system.model.Guest guest5 = new com.reservation_system.model.Guest(0, "Guest", "guest", "faculty", true);
    }

    @Test
    public void test1372() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1372");
        com.reservation_system.model.Researcher researcher5 = new com.reservation_system.model.Researcher((int) (byte) 100, "andrew@example.com", "guest", "student", true);
    }

    @Test
    public void test1373() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1373");
        // The following exception was thrown during execution in test generation
        try {
            com.reservation_system.model.User user6 = com.reservation_system.patterns.factory.UserFactory.createUser("", (int) (byte) -1, "hi!", "headlabcoordinator", "Andrew", false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid user type: ");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1374() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1374");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("demo/data/test-users.csv");
        int int2 = userRepository1.getNextID();
        int int3 = userRepository1.getNextID();
        boolean boolean5 = userRepository1.emailExists("faculty");
        java.util.List<com.reservation_system.model.User> userList6 = userRepository1.getAllUsers();
        boolean boolean8 = userRepository1.emailExists("andrew@example.com");
        java.util.List<com.reservation_system.model.User> userList9 = userRepository1.getAllUsers();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 101 + "'", int2 == 101);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 101 + "'", int3 == 101);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(userList6);
// flaky "27) test1374(com.reservation_system.randoop.registrationservice.RegressionTest2)":         org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(userList9);
    }

    @Test
    public void test1375() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1375");
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
        int int30 = researcher25.getID();
        java.lang.String str31 = researcher25.getUserType();
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Password1!" + "'", str9, "Password1!");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "Researcher" + "'", str26, "Researcher");
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + (-1) + "'", int30 == (-1));
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "Researcher" + "'", str31, "Researcher");
    }

    @Test
    public void test1376() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1376");
        com.reservation_system.model.Researcher researcher5 = new com.reservation_system.model.Researcher((int) '#', "Student", "andrew@example.com", "demo/data/test-users.csv", false);
    }

    @Test
    public void test1377() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1377");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("demo/data/test-users.csv");
        java.util.Optional<com.reservation_system.model.User> userOptional3 = userRepository1.findByEmail("hi!");
        int int4 = userRepository1.getNextID();
        int int5 = userRepository1.getNextID();
        com.reservation_system.model.Researcher researcher11 = new com.reservation_system.model.Researcher((int) 'a', "student", "", "researcher", true);
        userRepository1.addUser((com.reservation_system.model.User) researcher11);
        java.lang.String str13 = researcher11.getUserType();
        java.lang.String str14 = researcher11.getUserType();
        org.junit.Assert.assertNotNull(userOptional3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 101 + "'", int4 == 101);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 101 + "'", int5 == 101);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Researcher" + "'", str13, "Researcher");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Researcher" + "'", str14, "Researcher");
    }

    @Test
    public void test1378() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1378");
        com.reservation_system.model.Guest guest5 = new com.reservation_system.model.Guest(52, "student", "demo/data/test-users.csv", "researcher", true);
        boolean boolean6 = guest5.isApproved();
        boolean boolean7 = guest5.requiresDepartmentApproval();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test1379() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1379");
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
        // The following exception was thrown during execution in test generation
        try {
            com.reservation_system.model.User user21 = registrationService16.registerUser("Password1!", "Password1!", "Faculty", "Password1!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid user type.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Password1!" + "'", str9, "Password1!");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 101 + "'", int13 == 101);
        org.junit.Assert.assertNotNull(userList15);
    }

    @Test
    public void test1380() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1380");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("demo/data/test-users.csv");
        com.reservation_system.services.RegistrationService registrationService2 = new com.reservation_system.services.RegistrationService(userRepository1);
        com.reservation_system.model.Researcher researcher8 = new com.reservation_system.model.Researcher((int) (short) 1, "Password1!", "headlabcoordinator", "", false);
        userRepository1.addUser((com.reservation_system.model.User) researcher8);
        com.reservation_system.services.RegistrationService registrationService10 = new com.reservation_system.services.RegistrationService(userRepository1);
        boolean boolean12 = userRepository1.emailExists("");
        com.reservation_system.services.RegistrationService registrationService13 = new com.reservation_system.services.RegistrationService(userRepository1);
        java.util.List<com.reservation_system.model.User> userList14 = userRepository1.getAllUsers();
        com.reservation_system.repository.UserRepository userRepository16 = new com.reservation_system.repository.UserRepository("demo/data/test-users.csv");
        boolean boolean17 = userRepository16.headLabCoordinatorExists();
        com.reservation_system.repository.UserRepository userRepository19 = new com.reservation_system.repository.UserRepository("demo/data/test-users.csv");
        com.reservation_system.services.RegistrationService registrationService20 = new com.reservation_system.services.RegistrationService(userRepository19);
        com.reservation_system.model.Faculty faculty26 = new com.reservation_system.model.Faculty(0, "Password1!", "demo/data/test-users.csv", "researcher", false);
        java.lang.String str27 = faculty26.getName();
        userRepository19.addUser((com.reservation_system.model.User) faculty26);
        java.util.List<com.reservation_system.model.User> userList29 = userRepository19.getAllUsers();
        userRepository16.saveAllUsers(userList29);
        com.reservation_system.services.RegistrationService registrationService31 = new com.reservation_system.services.RegistrationService(userRepository16);
        java.util.List<com.reservation_system.model.User> userList32 = userRepository16.getAllUsers();
        java.util.List<com.reservation_system.model.User> userList33 = userRepository16.getAllUsers();
        userRepository1.saveAllUsers(userList33);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(userList14);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "Password1!" + "'", str27, "Password1!");
        org.junit.Assert.assertNotNull(userList29);
        org.junit.Assert.assertNotNull(userList32);
        org.junit.Assert.assertNotNull(userList33);
    }

    @Test
    public void test1381() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1381");
        com.reservation_system.model.Guest guest5 = new com.reservation_system.model.Guest(52, "hi!", "hi!", "headlabcoordinator", false);
    }

    @Test
    public void test1382() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1382");
        com.reservation_system.model.Researcher researcher5 = new com.reservation_system.model.Researcher((int) (byte) 1, "Student", "Student", "Password1!", false);
        java.lang.String str6 = researcher5.getEmail();
        boolean boolean7 = researcher5.isApproved();
        java.lang.String str8 = researcher5.getUserType();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Student" + "'", str6, "Student");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Researcher" + "'", str8, "Researcher");
    }

    @Test
    public void test1383() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1383");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("demo/data/test-users.csv");
        com.reservation_system.services.RegistrationService registrationService2 = new com.reservation_system.services.RegistrationService(userRepository1);
        com.reservation_system.model.Faculty faculty8 = new com.reservation_system.model.Faculty(0, "Password1!", "demo/data/test-users.csv", "researcher", false);
        java.lang.String str9 = faculty8.getName();
        userRepository1.addUser((com.reservation_system.model.User) faculty8);
        boolean boolean12 = userRepository1.emailExists("Faculty");
        int int13 = userRepository1.getNextID();
        com.reservation_system.services.RegistrationService registrationService14 = new com.reservation_system.services.RegistrationService(userRepository1);
        java.util.Optional<com.reservation_system.model.User> userOptional16 = userRepository1.findByEmail("hi!");
        com.reservation_system.services.RegistrationService registrationService17 = new com.reservation_system.services.RegistrationService(userRepository1);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Password1!" + "'", str9, "Password1!");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 101 + "'", int13 == 101);
        org.junit.Assert.assertNotNull(userOptional16);
    }

    @Test
    public void test1384() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1384");
        com.reservation_system.model.Researcher researcher5 = new com.reservation_system.model.Researcher((int) (short) -1, "researcher", "demo/data/test-users.csv", "student", false);
    }

    @Test
    public void test1385() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1385");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("demo/data/test-users.csv");
        boolean boolean2 = userRepository1.headLabCoordinatorExists();
        com.reservation_system.services.RegistrationService registrationService3 = new com.reservation_system.services.RegistrationService(userRepository1);
        boolean boolean5 = userRepository1.emailExists("");
        boolean boolean6 = userRepository1.headLabCoordinatorExists();
        java.util.List<com.reservation_system.model.User> userList7 = userRepository1.getAllUsers();
        int int8 = userRepository1.getNextID();
        com.reservation_system.repository.UserRepository userRepository10 = new com.reservation_system.repository.UserRepository("demo/data/test-users.csv");
        java.util.Optional<com.reservation_system.model.User> userOptional12 = userRepository10.findByEmail("hi!");
        boolean boolean14 = userRepository10.emailExists("Faculty");
        com.reservation_system.model.Faculty faculty20 = new com.reservation_system.model.Faculty((int) (byte) 1, "guest", "", "headlabcoordinator", false);
        boolean boolean21 = faculty20.requiresDepartmentApproval();
        userRepository10.addUser((com.reservation_system.model.User) faculty20);
        userRepository1.addUser((com.reservation_system.model.User) faculty20);
        java.util.List<com.reservation_system.model.User> userList24 = userRepository1.getAllUsers();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(userList7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 101 + "'", int8 == 101);
        org.junit.Assert.assertNotNull(userOptional12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertNotNull(userList24);
    }

    @Test
    public void test1386() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1386");
        com.reservation_system.model.Faculty faculty5 = new com.reservation_system.model.Faculty((int) ' ', "", "headlabcoordinator", "faculty", false);
    }

    @Test
    public void test1387() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1387");
        com.reservation_system.model.Faculty faculty5 = new com.reservation_system.model.Faculty((int) ' ', "Guest", "Guest", "andrew@example.com", false);
    }

    @Test
    public void test1388() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1388");
        com.reservation_system.model.LabManager labManager5 = new com.reservation_system.model.LabManager((int) (short) 0, "", "labmanager", "Password1!", true);
        boolean boolean6 = labManager5.requiresDepartmentApproval();
        boolean boolean7 = labManager5.requiresDepartmentApproval();
        java.lang.String str8 = labManager5.getUserType();
        java.lang.String str9 = labManager5.getUserType();
        boolean boolean10 = labManager5.isApproved();
        java.lang.String str11 = labManager5.getUserType();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "labmanager" + "'", str8, "labmanager");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "labmanager" + "'", str9, "labmanager");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "labmanager" + "'", str11, "labmanager");
    }

    @Test
    public void test1389() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1389");
        com.reservation_system.model.Faculty faculty5 = new com.reservation_system.model.Faculty((int) (short) 0, "hi!", "Researcher", "researcher", true);
    }

    @Test
    public void test1390() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1390");
        com.reservation_system.model.LabManager labManager5 = new com.reservation_system.model.LabManager((int) '4', "", "researcher", "researcher", true);
        java.lang.String str6 = labManager5.getUserType();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "labmanager" + "'", str6, "labmanager");
    }

    @Test
    public void test1391() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1391");
        com.reservation_system.model.Guest guest5 = new com.reservation_system.model.Guest(52, "student", "demo/data/test-users.csv", "researcher", true);
        java.lang.String str6 = guest5.getUserType();
        java.lang.String str7 = guest5.getName();
        java.lang.String str8 = guest5.getName();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Guest" + "'", str6, "Guest");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "student" + "'", str7, "student");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "student" + "'", str8, "student");
    }

    @Test
    public void test1392() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1392");
        com.reservation_system.model.LabManager labManager5 = new com.reservation_system.model.LabManager((int) (byte) 10, "researcher", "guest", "researcher", false);
        java.lang.String str6 = labManager5.getUserType();
        int int7 = labManager5.getID();
        java.lang.String str8 = labManager5.getEmail();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "labmanager" + "'", str6, "labmanager");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 10 + "'", int7 == 10);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "guest" + "'", str8, "guest");
    }

    @Test
    public void test1393() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1393");
        com.reservation_system.model.LabManager labManager5 = new com.reservation_system.model.LabManager(10, "Faculty", "hi!", "", true);
    }

    @Test
    public void test1394() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1394");
        com.reservation_system.model.HeadLabCoordinator headLabCoordinator5 = new com.reservation_system.model.HeadLabCoordinator((int) (byte) 1, "faculty", "labmanager", "labmanager", false);
    }

    @Test
    public void test1395() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1395");
        com.reservation_system.model.Guest guest5 = new com.reservation_system.model.Guest(100, "labmanager", "guest", "demo/data/test-users.csv", true);
    }

    @Test
    public void test1396() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1396");
        com.reservation_system.model.Faculty faculty5 = new com.reservation_system.model.Faculty((int) (byte) 1, "researcher", "Andrew", "", false);
        boolean boolean6 = faculty5.isApproved();
        java.lang.String str7 = faculty5.getUserType();
        java.lang.String str8 = faculty5.getUserType();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Faculty" + "'", str7, "Faculty");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Faculty" + "'", str8, "Faculty");
    }

    @Test
    public void test1397() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1397");
        com.reservation_system.model.Student student5 = new com.reservation_system.model.Student((int) (short) 0, "researcher", "headlabcoordinator", "researcher", false);
        java.lang.String str6 = student5.getEmail();
        int int7 = student5.getID();
        java.lang.String str8 = student5.getUserType();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "headlabcoordinator" + "'", str6, "headlabcoordinator");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Student" + "'", str8, "Student");
    }

    @Test
    public void test1398() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1398");
        com.reservation_system.model.Student student5 = new com.reservation_system.model.Student((int) 'a', "demo/data/test-users.csv", "hi!", "Password1!", false);
    }

    @Test
    public void test1399() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1399");
        com.reservation_system.model.User user6 = com.reservation_system.patterns.factory.UserFactory.createUser("Researcher", 0, "headlabcoordinator", "Faculty", "Researcher", false);
        org.junit.Assert.assertNotNull(user6);
    }

    @Test
    public void test1400() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1400");
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
        com.reservation_system.model.LabManager labManager25 = new com.reservation_system.model.LabManager(98, "demo/data/test-users.csv", "researcher", "Password1!", true);
        userRepository1.addUser((com.reservation_system.model.User) labManager25);
        org.junit.Assert.assertNotNull(userList2);
        org.junit.Assert.assertNotNull(userList4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(userList7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNotNull(userOptional19);
    }

    @Test
    public void test1401() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1401");
        com.reservation_system.model.Student student5 = new com.reservation_system.model.Student((int) (byte) 0, "Student", "Andrew", "labmanager", false);
        student5.setApproved(false);
        java.lang.String str8 = student5.getEmail();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Andrew" + "'", str8, "Andrew");
    }

    @Test
    public void test1402() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1402");
        com.reservation_system.model.Guest guest5 = new com.reservation_system.model.Guest(52, "labmanager", "guest", "Student", false);
    }

    @Test
    public void test1403() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1403");
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
        boolean boolean73 = userRepository1.headLabCoordinatorExists();
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
        org.junit.Assert.assertTrue("'" + boolean73 + "' != '" + true + "'", boolean73 == true);
    }

    @Test
    public void test1404() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1404");
        com.reservation_system.model.Guest guest5 = new com.reservation_system.model.Guest(102, "headlabcoordinator", "Student", "Andrew", true);
        boolean boolean6 = guest5.requiresDepartmentApproval();
        java.lang.String str7 = guest5.getUserType();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Guest" + "'", str7, "Guest");
    }

    @Test
    public void test1405() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1405");
        com.reservation_system.model.HeadLabCoordinator headLabCoordinator5 = new com.reservation_system.model.HeadLabCoordinator(33, "", "student", "andrew@example.com", false);
    }

    @Test
    public void test1406() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1406");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("demo/data/test-users.csv");
        java.util.List<com.reservation_system.model.User> userList2 = userRepository1.getAllUsers();
        com.reservation_system.services.RegistrationService registrationService3 = new com.reservation_system.services.RegistrationService(userRepository1);
        int int4 = userRepository1.getNextID();
        int int5 = userRepository1.getNextID();
        boolean boolean7 = userRepository1.emailExists("Password1!");
        org.junit.Assert.assertNotNull(userList2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 101 + "'", int4 == 101);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 101 + "'", int5 == 101);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test1407() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1407");
        com.reservation_system.model.LabManager labManager5 = new com.reservation_system.model.LabManager((int) (byte) 10, "demo/data/test-users.csv", "faculty", "Password1!", true);
        int int6 = labManager5.getID();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
    }

    @Test
    public void test1408() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1408");
        com.reservation_system.model.User user6 = com.reservation_system.patterns.factory.UserFactory.createUser("student", (int) ' ', "student", "Password1!", "", false);
        org.junit.Assert.assertNotNull(user6);
    }

    @Test
    public void test1409() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1409");
        com.reservation_system.model.LabManager labManager5 = new com.reservation_system.model.LabManager(0, "headlabcoordinator", "Password1!", "headlabcoordinator", false);
        java.lang.String str6 = labManager5.getUserType();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "labmanager" + "'", str6, "labmanager");
    }

    @Test
    public void test1410() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1410");
        com.reservation_system.model.HeadLabCoordinator headLabCoordinator5 = new com.reservation_system.model.HeadLabCoordinator((int) 'a', "Guest", "headlabcoordinator", "guest", false);
    }

    @Test
    public void test1411() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1411");
        com.reservation_system.model.User user6 = com.reservation_system.patterns.factory.UserFactory.createUser("labmanager", (int) '4', "andrew@example.com", "Andrew", "demo/data/test-users.csv", false);
        org.junit.Assert.assertNotNull(user6);
    }

    @Test
    public void test1412() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1412");
        com.reservation_system.model.Faculty faculty5 = new com.reservation_system.model.Faculty((int) '#', "researcher", "Andrew", "student", false);
    }

    @Test
    public void test1413() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1413");
        com.reservation_system.model.HeadLabCoordinator headLabCoordinator5 = new com.reservation_system.model.HeadLabCoordinator((int) (byte) 0, "hi!", "labmanager", "Andrew", false);
    }

    @Test
    public void test1414() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1414");
        com.reservation_system.model.Faculty faculty5 = new com.reservation_system.model.Faculty((int) (byte) 1, "researcher", "Andrew", "", false);
        java.lang.String str6 = faculty5.getUserType();
        java.lang.String str7 = faculty5.getName();
        java.lang.Class<?> wildcardClass8 = faculty5.getClass();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Faculty" + "'", str6, "Faculty");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "researcher" + "'", str7, "researcher");
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test1415() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1415");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("demo/data/test-users.csv");
        com.reservation_system.services.RegistrationService registrationService2 = new com.reservation_system.services.RegistrationService(userRepository1);
        com.reservation_system.model.Faculty faculty8 = new com.reservation_system.model.Faculty(0, "Password1!", "demo/data/test-users.csv", "researcher", false);
        java.lang.String str9 = faculty8.getName();
        userRepository1.addUser((com.reservation_system.model.User) faculty8);
        com.reservation_system.services.RegistrationService registrationService11 = new com.reservation_system.services.RegistrationService(userRepository1);
        com.reservation_system.services.RegistrationService registrationService12 = new com.reservation_system.services.RegistrationService(userRepository1);
        com.reservation_system.services.RegistrationService registrationService13 = new com.reservation_system.services.RegistrationService(userRepository1);
        java.util.Optional<com.reservation_system.model.User> userOptional15 = userRepository1.findByEmail("Researcher");
        boolean boolean17 = userRepository1.emailExists("Student");
        boolean boolean19 = userRepository1.emailExists("student");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Password1!" + "'", str9, "Password1!");
        org.junit.Assert.assertNotNull(userOptional15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
    }

    @Test
    public void test1416() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1416");
        com.reservation_system.model.Researcher researcher5 = new com.reservation_system.model.Researcher((int) (byte) 0, "", "Guest", "Faculty", false);
    }

    @Test
    public void test1417() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1417");
        com.reservation_system.model.User user6 = com.reservation_system.patterns.factory.UserFactory.createUser("researcher", (int) (byte) 1, "headlabcoordinator", "Student", "demo/data/test-users.csv", true);
        org.junit.Assert.assertNotNull(user6);
    }

    @Test
    public void test1418() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1418");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("demo/data/test-users.csv");
        int int2 = userRepository1.getNextID();
        int int3 = userRepository1.getNextID();
        java.util.List<com.reservation_system.model.User> userList4 = userRepository1.getAllUsers();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 101 + "'", int2 == 101);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 101 + "'", int3 == 101);
        org.junit.Assert.assertNotNull(userList4);
    }

    @Test
    public void test1419() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1419");
        com.reservation_system.model.LabManager labManager5 = new com.reservation_system.model.LabManager((-1), "Password1!", "Password1!", "Researcher", true);
    }

    @Test
    public void test1420() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1420");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("demo/data/test-users.csv");
        boolean boolean2 = userRepository1.headLabCoordinatorExists();
        com.reservation_system.services.RegistrationService registrationService3 = new com.reservation_system.services.RegistrationService(userRepository1);
        boolean boolean4 = userRepository1.headLabCoordinatorExists();
        boolean boolean6 = userRepository1.emailExists("Andrew");
        int int7 = userRepository1.getNextID();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 101 + "'", int7 == 101);
    }

    @Test
    public void test1421() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1421");
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
        researcher18.setApproved(false);
        java.lang.String str23 = researcher18.getUserType();
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Password1!" + "'", str9, "Password1!");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "Researcher" + "'", str20, "Researcher");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "Researcher" + "'", str23, "Researcher");
    }

    @Test
    public void test1422() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1422");
        com.reservation_system.model.Student student5 = new com.reservation_system.model.Student(10, "Password1!", "Researcher", "Password1!", false);
        int int6 = student5.getID();
        java.lang.String str7 = student5.getUserType();
        java.lang.String str8 = student5.getEmail();
        java.lang.String str9 = student5.getName();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Student" + "'", str7, "Student");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Researcher" + "'", str8, "Researcher");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Password1!" + "'", str9, "Password1!");
    }

    @Test
    public void test1423() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1423");
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
        boolean boolean28 = userRepository1.emailExists("Faculty");
        int int29 = userRepository1.getNextID();
        com.reservation_system.services.RegistrationService registrationService30 = new com.reservation_system.services.RegistrationService(userRepository1);
        // The following exception was thrown during execution in test generation
        try {
            com.reservation_system.model.User user35 = registrationService30.registerUser("Password1!", "Researcher", "", "Faculty");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid user type.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(userOptional3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 101 + "'", int4 == 101);
        org.junit.Assert.assertNotNull(userList12);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 101 + "'", int29 == 101);
    }

    @Test
    public void test1424() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1424");
        com.reservation_system.model.LabManager labManager5 = new com.reservation_system.model.LabManager((int) (byte) 10, "Student", "student", "", false);
        boolean boolean6 = labManager5.isApproved();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test1425() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1425");
        com.reservation_system.model.Faculty faculty5 = new com.reservation_system.model.Faculty(32, "student", "Student", "hi!", true);
        java.lang.String str6 = faculty5.getPassword();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
    }

    @Test
    public void test1426() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1426");
        com.reservation_system.model.Researcher researcher5 = new com.reservation_system.model.Researcher((int) (short) 10, "demo/data/test-users.csv", "demo/data/test-users.csv", "demo/data/test-users.csv", true);
    }

    @Test
    public void test1427() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1427");
        com.reservation_system.model.Faculty faculty5 = new com.reservation_system.model.Faculty((int) (short) 0, "Faculty", "Password1!", "Faculty", true);
        int int6 = faculty5.getID();
        java.lang.String str7 = faculty5.getEmail();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Password1!" + "'", str7, "Password1!");
    }

    @Test
    public void test1428() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1428");
        com.reservation_system.model.Researcher researcher5 = new com.reservation_system.model.Researcher(102, "researcher", "faculty", "", true);
        java.lang.String str6 = researcher5.getName();
        int int7 = researcher5.getID();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "researcher" + "'", str6, "researcher");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 102 + "'", int7 == 102);
    }

    @Test
    public void test1429() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1429");
        com.reservation_system.model.LabManager labManager5 = new com.reservation_system.model.LabManager(100, "Guest", "", "researcher", true);
    }

    @Test
    public void test1430() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1430");
        com.reservation_system.model.LabManager labManager5 = new com.reservation_system.model.LabManager(102, "Password1!", "hi!", "student", true);
        java.lang.String str6 = labManager5.getPassword();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "student" + "'", str6, "student");
    }

    @Test
    public void test1431() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1431");
        com.reservation_system.model.Researcher researcher5 = new com.reservation_system.model.Researcher((int) (short) -1, "andrew@example.com", "guest", "labmanager", false);
        java.lang.String str6 = researcher5.getPassword();
        researcher5.setApproved(true);
        java.lang.String str9 = researcher5.getEmail();
        java.lang.String str10 = researcher5.getUserType();
        boolean boolean11 = researcher5.isApproved();
        java.lang.String str12 = researcher5.getPassword();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "labmanager" + "'", str6, "labmanager");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "guest" + "'", str9, "guest");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Researcher" + "'", str10, "Researcher");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "labmanager" + "'", str12, "labmanager");
    }

    @Test
    public void test1432() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1432");
        com.reservation_system.model.Guest guest5 = new com.reservation_system.model.Guest((int) (byte) 100, "hi!", "headlabcoordinator", "Researcher", true);
    }

    @Test
    public void test1433() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1433");
        com.reservation_system.model.Faculty faculty5 = new com.reservation_system.model.Faculty(0, "Password1!", "demo/data/test-users.csv", "researcher", false);
        boolean boolean6 = faculty5.isApproved();
        java.lang.String str7 = faculty5.getUserType();
        java.lang.String str8 = faculty5.getUserType();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Faculty" + "'", str7, "Faculty");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Faculty" + "'", str8, "Faculty");
    }

    @Test
    public void test1434() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1434");
        com.reservation_system.model.Student student5 = new com.reservation_system.model.Student(98, "Student", "", "demo/data/test-users.csv", true);
    }

    @Test
    public void test1435() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1435");
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
        boolean boolean21 = userRepository1.headLabCoordinatorExists();
        int int22 = userRepository1.getNextID();
        java.util.List<com.reservation_system.model.User> userList23 = userRepository1.getAllUsers();
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Password1!" + "'", str9, "Password1!");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 101 + "'", int20 == 101);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 101 + "'", int22 == 101);
        org.junit.Assert.assertNotNull(userList23);
    }

    @Test
    public void test1436() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1436");
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
        java.util.List<com.reservation_system.model.User> userList26 = userRepository1.getAllUsers();
        java.util.List<com.reservation_system.model.User> userList27 = userRepository1.getAllUsers();
        boolean boolean28 = userRepository1.headLabCoordinatorExists();
        com.reservation_system.repository.UserRepository userRepository30 = new com.reservation_system.repository.UserRepository("demo/data/test-users.csv");
        com.reservation_system.services.RegistrationService registrationService31 = new com.reservation_system.services.RegistrationService(userRepository30);
        com.reservation_system.model.Researcher researcher37 = new com.reservation_system.model.Researcher((int) (short) 1, "Password1!", "headlabcoordinator", "", false);
        userRepository30.addUser((com.reservation_system.model.User) researcher37);
        java.util.List<com.reservation_system.model.User> userList39 = userRepository30.getAllUsers();
        userRepository1.saveAllUsers(userList39);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Password1!" + "'", str9, "Password1!");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 101 + "'", int23 == 101);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 101 + "'", int24 == 101);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertNotNull(userList26);
        org.junit.Assert.assertNotNull(userList27);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertNotNull(userList39);
    }

    @Test
    public void test1437() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1437");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("demo/data/test-users.csv");
        java.util.List<com.reservation_system.model.User> userList2 = userRepository1.getAllUsers();
        com.reservation_system.services.RegistrationService registrationService3 = new com.reservation_system.services.RegistrationService(userRepository1);
        java.util.List<com.reservation_system.model.User> userList4 = userRepository1.getAllUsers();
        boolean boolean6 = userRepository1.emailExists("Guest");
        java.util.List<com.reservation_system.model.User> userList7 = userRepository1.getAllUsers();
        java.util.Optional<com.reservation_system.model.User> userOptional9 = userRepository1.findByEmail("Password1!");
        boolean boolean11 = userRepository1.emailExists("demo/data/test-users.csv");
        com.reservation_system.model.Student student17 = new com.reservation_system.model.Student((int) (short) -1, "Guest", "", "andrew@example.com", false);
        userRepository1.addUser((com.reservation_system.model.User) student17);
        org.junit.Assert.assertNotNull(userList2);
        org.junit.Assert.assertNotNull(userList4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(userList7);
        org.junit.Assert.assertNotNull(userOptional9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test1438() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1438");
        com.reservation_system.model.Researcher researcher5 = new com.reservation_system.model.Researcher((int) (short) -1, "faculty", "researcher", "hi!", true);
        java.lang.String str6 = researcher5.getUserType();
        java.lang.String str7 = researcher5.getEmail();
        researcher5.setApproved(false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Researcher" + "'", str6, "Researcher");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "researcher" + "'", str7, "researcher");
    }

    @Test
    public void test1439() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1439");
        com.reservation_system.model.Researcher researcher5 = new com.reservation_system.model.Researcher(103, "Faculty", "researcher", "", true);
        java.lang.String str6 = researcher5.getEmail();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "researcher" + "'", str6, "researcher");
    }

    @Test
    public void test1440() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1440");
        com.reservation_system.model.HeadLabCoordinator headLabCoordinator5 = new com.reservation_system.model.HeadLabCoordinator(32, "Researcher", "Andrew", "guest", false);
        boolean boolean6 = headLabCoordinator5.isApproved();
        headLabCoordinator5.setApproved(true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test1441() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1441");
        com.reservation_system.model.HeadLabCoordinator headLabCoordinator5 = new com.reservation_system.model.HeadLabCoordinator((-1), "", "Faculty", "Guest", false);
        java.lang.String str6 = headLabCoordinator5.getPassword();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Guest" + "'", str6, "Guest");
    }

    @Test
    public void test1442() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1442");
        com.reservation_system.model.LabManager labManager5 = new com.reservation_system.model.LabManager((int) 'a', "headlabcoordinator", "Researcher", "Andrew", false);
        java.lang.String str6 = labManager5.getEmail();
        java.lang.String str7 = labManager5.getName();
        java.lang.String str8 = labManager5.getUserType();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Researcher" + "'", str6, "Researcher");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "headlabcoordinator" + "'", str7, "headlabcoordinator");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "labmanager" + "'", str8, "labmanager");
    }

    @Test
    public void test1443() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1443");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("demo/data/test-users.csv");
        java.util.List<com.reservation_system.model.User> userList2 = userRepository1.getAllUsers();
        com.reservation_system.services.RegistrationService registrationService3 = new com.reservation_system.services.RegistrationService(userRepository1);
        com.reservation_system.services.RegistrationService registrationService4 = new com.reservation_system.services.RegistrationService(userRepository1);
        java.util.List<com.reservation_system.model.User> userList5 = userRepository1.getAllUsers();
        java.util.Optional<com.reservation_system.model.User> userOptional7 = userRepository1.findByEmail("Researcher");
        java.util.List<com.reservation_system.model.User> userList8 = userRepository1.getAllUsers();
        int int9 = userRepository1.getNextID();
        org.junit.Assert.assertNotNull(userList2);
        org.junit.Assert.assertNotNull(userList5);
        org.junit.Assert.assertNotNull(userOptional7);
        org.junit.Assert.assertNotNull(userList8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 101 + "'", int9 == 101);
    }

    @Test
    public void test1444() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1444");
        com.reservation_system.model.Researcher researcher5 = new com.reservation_system.model.Researcher(102, "andrew@example.com", "Andrew", "hi!", true);
        java.lang.String str6 = researcher5.getEmail();
        java.lang.String str7 = researcher5.getUserType();
        java.lang.String str8 = researcher5.getUserType();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Andrew" + "'", str6, "Andrew");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Researcher" + "'", str7, "Researcher");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Researcher" + "'", str8, "Researcher");
    }

    @Test
    public void test1445() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1445");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("demo/data/test-users.csv");
        com.reservation_system.services.RegistrationService registrationService2 = new com.reservation_system.services.RegistrationService(userRepository1);
        com.reservation_system.services.RegistrationService registrationService3 = new com.reservation_system.services.RegistrationService(userRepository1);
        boolean boolean4 = userRepository1.headLabCoordinatorExists();
        com.reservation_system.model.Faculty faculty10 = new com.reservation_system.model.Faculty((int) (short) 10, "Student", "labmanager", "Researcher", false);
        boolean boolean11 = faculty10.requiresDepartmentApproval();
        userRepository1.addUser((com.reservation_system.model.User) faculty10);
        boolean boolean13 = userRepository1.headLabCoordinatorExists();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test1446() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1446");
        com.reservation_system.model.User user6 = com.reservation_system.patterns.factory.UserFactory.createUser("researcher", (int) (byte) -1, "demo/data/test-users.csv", "Faculty", "Faculty", true);
        org.junit.Assert.assertNotNull(user6);
    }

    @Test
    public void test1447() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1447");
        com.reservation_system.model.Researcher researcher5 = new com.reservation_system.model.Researcher((int) (byte) 1, "Andrew", "guest", "Password1!", false);
        java.lang.String str6 = researcher5.getUserType();
        researcher5.setApproved(false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Researcher" + "'", str6, "Researcher");
    }

    @Test
    public void test1448() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1448");
        com.reservation_system.model.User user6 = com.reservation_system.patterns.factory.UserFactory.createUser("student", (int) (byte) 1, "researcher", "andrew@example.com", "", false);
        org.junit.Assert.assertNotNull(user6);
    }

    @Test
    public void test1449() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1449");
        com.reservation_system.model.Guest guest5 = new com.reservation_system.model.Guest((int) 'a', "andrew@example.com", "Guest", "", true);
    }

    @Test
    public void test1450() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1450");
        com.reservation_system.model.LabManager labManager5 = new com.reservation_system.model.LabManager(10, "Faculty", "faculty", "Password1!", true);
        java.lang.String str6 = labManager5.getUserType();
        java.lang.String str7 = labManager5.getUserType();
        java.lang.String str8 = labManager5.getUserType();
        boolean boolean9 = labManager5.requiresDepartmentApproval();
        java.lang.String str10 = labManager5.getEmail();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "labmanager" + "'", str6, "labmanager");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "labmanager" + "'", str7, "labmanager");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "labmanager" + "'", str8, "labmanager");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "faculty" + "'", str10, "faculty");
    }

    @Test
    public void test1451() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1451");
        com.reservation_system.model.Guest guest5 = new com.reservation_system.model.Guest((int) (short) 1, "", "faculty", "labmanager", true);
    }

    @Test
    public void test1452() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1452");
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
        int int27 = userRepository1.getNextID();
        java.util.List<com.reservation_system.model.User> userList28 = userRepository1.getAllUsers();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Password1!" + "'", str15, "Password1!");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 101 + "'", int18 == 101);
        org.junit.Assert.assertNotNull(userList21);
        org.junit.Assert.assertNotNull(userList23);
        org.junit.Assert.assertNotNull(userList26);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 101 + "'", int27 == 101);
        org.junit.Assert.assertNotNull(userList28);
    }

    @Test
    public void test1453() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1453");
        com.reservation_system.model.Researcher researcher5 = new com.reservation_system.model.Researcher(0, "demo/data/test-users.csv", "Andrew", "guest", false);
    }

    @Test
    public void test1454() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1454");
        com.reservation_system.model.HeadLabCoordinator headLabCoordinator5 = new com.reservation_system.model.HeadLabCoordinator((int) (byte) -1, "", "", "Faculty", true);
        java.lang.String str6 = headLabCoordinator5.getUserType();
        boolean boolean7 = headLabCoordinator5.requiresDepartmentApproval();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "headlabcoordinator" + "'", str6, "headlabcoordinator");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test1455() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1455");
        com.reservation_system.model.LabManager labManager5 = new com.reservation_system.model.LabManager((int) (short) -1, "Andrew", "labmanager", "headlabcoordinator", true);
    }

    @Test
    public void test1456() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1456");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("demo/data/test-users.csv");
        com.reservation_system.services.RegistrationService registrationService2 = new com.reservation_system.services.RegistrationService(userRepository1);
        int int3 = userRepository1.getNextID();
        boolean boolean5 = userRepository1.emailExists("Andrew");
        com.reservation_system.model.Researcher researcher11 = new com.reservation_system.model.Researcher((int) (short) -1, "faculty", "researcher", "hi!", true);
        java.lang.String str12 = researcher11.getUserType();
        int int13 = researcher11.getID();
        java.lang.String str14 = researcher11.getUserType();
        userRepository1.addUser((com.reservation_system.model.User) researcher11);
        com.reservation_system.repository.UserRepository userRepository17 = new com.reservation_system.repository.UserRepository("demo/data/test-users.csv");
        com.reservation_system.services.RegistrationService registrationService18 = new com.reservation_system.services.RegistrationService(userRepository17);
        com.reservation_system.model.Faculty faculty24 = new com.reservation_system.model.Faculty(0, "Password1!", "demo/data/test-users.csv", "researcher", false);
        java.lang.String str25 = faculty24.getName();
        userRepository17.addUser((com.reservation_system.model.User) faculty24);
        boolean boolean27 = userRepository17.headLabCoordinatorExists();
        com.reservation_system.model.Guest guest33 = new com.reservation_system.model.Guest((int) (byte) -1, "guest", "Researcher", "Faculty", true);
        userRepository17.addUser((com.reservation_system.model.User) guest33);
        boolean boolean35 = userRepository17.headLabCoordinatorExists();
        com.reservation_system.repository.UserRepository userRepository37 = new com.reservation_system.repository.UserRepository("demo/data/test-users.csv");
        com.reservation_system.services.RegistrationService registrationService38 = new com.reservation_system.services.RegistrationService(userRepository37);
        com.reservation_system.model.Faculty faculty44 = new com.reservation_system.model.Faculty(0, "Password1!", "demo/data/test-users.csv", "researcher", false);
        java.lang.String str45 = faculty44.getName();
        userRepository37.addUser((com.reservation_system.model.User) faculty44);
        boolean boolean47 = userRepository37.headLabCoordinatorExists();
        com.reservation_system.repository.UserRepository userRepository49 = new com.reservation_system.repository.UserRepository("demo/data/test-users.csv");
        com.reservation_system.services.RegistrationService registrationService50 = new com.reservation_system.services.RegistrationService(userRepository49);
        com.reservation_system.model.Faculty faculty56 = new com.reservation_system.model.Faculty(0, "Password1!", "demo/data/test-users.csv", "researcher", false);
        java.lang.String str57 = faculty56.getName();
        userRepository49.addUser((com.reservation_system.model.User) faculty56);
        java.util.List<com.reservation_system.model.User> userList59 = userRepository49.getAllUsers();
        userRepository37.saveAllUsers(userList59);
        userRepository17.saveAllUsers(userList59);
        userRepository1.saveAllUsers(userList59);
        boolean boolean64 = userRepository1.emailExists("");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 101 + "'", int3 == 101);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Researcher" + "'", str12, "Researcher");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Researcher" + "'", str14, "Researcher");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "Password1!" + "'", str25, "Password1!");
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + "Password1!" + "'", str45, "Password1!");
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + true + "'", boolean47 == true);
        org.junit.Assert.assertEquals("'" + str57 + "' != '" + "Password1!" + "'", str57, "Password1!");
        org.junit.Assert.assertNotNull(userList59);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + true + "'", boolean64 == true);
    }

    @Test
    public void test1457() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1457");
        com.reservation_system.model.Researcher researcher5 = new com.reservation_system.model.Researcher(102, "guest", "hi!", "Password1!", false);
        java.lang.String str6 = researcher5.getPassword();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Password1!" + "'", str6, "Password1!");
    }

    @Test
    public void test1458() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1458");
        com.reservation_system.model.Guest guest5 = new com.reservation_system.model.Guest(52, "Password1!", "Faculty", "Faculty", true);
    }

    @Test
    public void test1459() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1459");
        com.reservation_system.model.Student student5 = new com.reservation_system.model.Student(98, "researcher", "Password1!", "faculty", false);
    }

    @Test
    public void test1460() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1460");
        com.reservation_system.model.Guest guest5 = new com.reservation_system.model.Guest((int) (byte) 0, "", "Andrew", "Researcher", false);
    }

    @Test
    public void test1461() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1461");
        com.reservation_system.model.Guest guest5 = new com.reservation_system.model.Guest((int) '#', "student", "demo/data/test-users.csv", "faculty", false);
        java.lang.String str6 = guest5.getEmail();
        java.lang.String str7 = guest5.getUserType();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "demo/data/test-users.csv" + "'", str6, "demo/data/test-users.csv");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Guest" + "'", str7, "Guest");
    }

    @Test
    public void test1462() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1462");
        com.reservation_system.model.HeadLabCoordinator headLabCoordinator5 = new com.reservation_system.model.HeadLabCoordinator(1, "student", "Researcher", "", false);
        java.lang.String str6 = headLabCoordinator5.getUserType();
        java.lang.String str7 = headLabCoordinator5.getUserType();
        java.lang.String str8 = headLabCoordinator5.getName();
        java.lang.String str9 = headLabCoordinator5.getUserType();
        boolean boolean10 = headLabCoordinator5.requiresDepartmentApproval();
        java.lang.String str11 = headLabCoordinator5.getUserType();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "headlabcoordinator" + "'", str6, "headlabcoordinator");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "headlabcoordinator" + "'", str7, "headlabcoordinator");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "student" + "'", str8, "student");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "headlabcoordinator" + "'", str9, "headlabcoordinator");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "headlabcoordinator" + "'", str11, "headlabcoordinator");
    }

    @Test
    public void test1463() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1463");
        com.reservation_system.model.Guest guest5 = new com.reservation_system.model.Guest((int) (short) 100, "faculty", "Researcher", "", false);
    }

    @Test
    public void test1464() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1464");
        com.reservation_system.model.Researcher researcher5 = new com.reservation_system.model.Researcher((int) (short) -1, "faculty", "researcher", "hi!", true);
        java.lang.String str6 = researcher5.getUserType();
        int int7 = researcher5.getID();
        researcher5.setApproved(false);
        java.lang.String str10 = researcher5.getUserType();
        java.lang.String str11 = researcher5.getName();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Researcher" + "'", str6, "Researcher");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Researcher" + "'", str10, "Researcher");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "faculty" + "'", str11, "faculty");
    }

    @Test
    public void test1465() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1465");
        com.reservation_system.model.LabManager labManager5 = new com.reservation_system.model.LabManager((int) (short) 0, "", "labmanager", "Password1!", true);
        boolean boolean6 = labManager5.requiresDepartmentApproval();
        boolean boolean7 = labManager5.requiresDepartmentApproval();
        boolean boolean8 = labManager5.isApproved();
        labManager5.setApproved(false);
        java.lang.String str11 = labManager5.getPassword();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Password1!" + "'", str11, "Password1!");
    }

    @Test
    public void test1466() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1466");
        com.reservation_system.model.Faculty faculty5 = new com.reservation_system.model.Faculty((int) (byte) 1, "researcher", "Andrew", "", false);
        boolean boolean6 = faculty5.isApproved();
        java.lang.String str7 = faculty5.getPassword();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
    }

    @Test
    public void test1467() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1467");
        com.reservation_system.model.LabManager labManager5 = new com.reservation_system.model.LabManager(33, "faculty", "labmanager", "Andrew", true);
        java.lang.String str6 = labManager5.getEmail();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "labmanager" + "'", str6, "labmanager");
    }

    @Test
    public void test1468() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1468");
        com.reservation_system.model.LabManager labManager5 = new com.reservation_system.model.LabManager((int) (short) 0, "", "labmanager", "Password1!", true);
        boolean boolean6 = labManager5.requiresDepartmentApproval();
        java.lang.String str7 = labManager5.getUserType();
        java.lang.String str8 = labManager5.getEmail();
        boolean boolean9 = labManager5.isApproved();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "labmanager" + "'", str7, "labmanager");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "labmanager" + "'", str8, "labmanager");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test1469() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1469");
        com.reservation_system.model.Faculty faculty5 = new com.reservation_system.model.Faculty((int) ' ', "Andrew", "hi!", "labmanager", false);
        faculty5.setApproved(true);
    }

    @Test
    public void test1470() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1470");
        com.reservation_system.model.LabManager labManager5 = new com.reservation_system.model.LabManager(1, "headlabcoordinator", "demo/data/test-users.csv", "researcher", false);
    }

    @Test
    public void test1471() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1471");
        com.reservation_system.model.Student student5 = new com.reservation_system.model.Student(100, "Faculty", "Student", "hi!", true);
        java.lang.String str6 = student5.getUserType();
        int int7 = student5.getID();
        java.lang.String str8 = student5.getUserType();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Student" + "'", str6, "Student");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 100 + "'", int7 == 100);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Student" + "'", str8, "Student");
    }

    @Test
    public void test1472() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1472");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("demo/data/test-users.csv");
        com.reservation_system.services.RegistrationService registrationService2 = new com.reservation_system.services.RegistrationService(userRepository1);
        com.reservation_system.model.Faculty faculty8 = new com.reservation_system.model.Faculty(0, "Password1!", "demo/data/test-users.csv", "researcher", false);
        java.lang.String str9 = faculty8.getName();
        userRepository1.addUser((com.reservation_system.model.User) faculty8);
        boolean boolean11 = userRepository1.headLabCoordinatorExists();
        int int12 = userRepository1.getNextID();
        boolean boolean13 = userRepository1.headLabCoordinatorExists();
        java.util.Optional<com.reservation_system.model.User> userOptional15 = userRepository1.findByEmail("Researcher");
        boolean boolean16 = userRepository1.headLabCoordinatorExists();
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Password1!" + "'", str9, "Password1!");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 101 + "'", int12 == 101);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(userOptional15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
    }

    @Test
    public void test1473() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1473");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("demo/data/test-users.csv");
        java.util.Optional<com.reservation_system.model.User> userOptional3 = userRepository1.findByEmail("hi!");
        int int4 = userRepository1.getNextID();
        com.reservation_system.model.Researcher researcher10 = new com.reservation_system.model.Researcher((int) (byte) 10, "", "Guest", "headlabcoordinator", true);
        userRepository1.addUser((com.reservation_system.model.User) researcher10);
        boolean boolean13 = userRepository1.emailExists("Password1!");
        com.reservation_system.services.RegistrationService registrationService14 = new com.reservation_system.services.RegistrationService(userRepository1);
        org.junit.Assert.assertNotNull(userOptional3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 101 + "'", int4 == 101);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test1474() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1474");
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
        java.util.Optional<com.reservation_system.model.User> userOptional31 = userRepository1.findByEmail("");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Password1!" + "'", str9, "Password1!");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "Researcher" + "'", str26, "Researcher");
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertNotNull(userOptional31);
    }

    @Test
    public void test1475() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1475");
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
        com.reservation_system.repository.UserRepository userRepository91 = new com.reservation_system.repository.UserRepository("demo/data/test-users.csv");
        java.util.List<com.reservation_system.model.User> userList92 = userRepository91.getAllUsers();
        com.reservation_system.services.RegistrationService registrationService93 = new com.reservation_system.services.RegistrationService(userRepository91);
        java.util.List<com.reservation_system.model.User> userList94 = userRepository91.getAllUsers();
        boolean boolean96 = userRepository91.emailExists("Guest");
        java.util.List<com.reservation_system.model.User> userList97 = userRepository91.getAllUsers();
        userRepository1.saveAllUsers(userList97);
        com.reservation_system.services.RegistrationService registrationService99 = new com.reservation_system.services.RegistrationService(userRepository1);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Password1!" + "'", str9, "Password1!");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 101 + "'", int23 == 101);
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
        org.junit.Assert.assertTrue("'" + int89 + "' != '" + 101 + "'", int89 == 101);
        org.junit.Assert.assertNotNull(userList92);
        org.junit.Assert.assertNotNull(userList94);
        org.junit.Assert.assertTrue("'" + boolean96 + "' != '" + true + "'", boolean96 == true);
        org.junit.Assert.assertNotNull(userList97);
    }

    @Test
    public void test1476() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1476");
        com.reservation_system.model.LabManager labManager5 = new com.reservation_system.model.LabManager(32, "", "student", "Guest", true);
        java.lang.String str6 = labManager5.getUserType();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "labmanager" + "'", str6, "labmanager");
    }

    @Test
    public void test1477() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1477");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("demo/data/test-users.csv");
        com.reservation_system.services.RegistrationService registrationService2 = new com.reservation_system.services.RegistrationService(userRepository1);
        com.reservation_system.model.Faculty faculty8 = new com.reservation_system.model.Faculty(0, "Password1!", "demo/data/test-users.csv", "researcher", false);
        java.lang.String str9 = faculty8.getName();
        userRepository1.addUser((com.reservation_system.model.User) faculty8);
        java.util.List<com.reservation_system.model.User> userList11 = userRepository1.getAllUsers();
        com.reservation_system.repository.UserRepository userRepository13 = new com.reservation_system.repository.UserRepository("demo/data/test-users.csv");
        boolean boolean14 = userRepository13.headLabCoordinatorExists();
        com.reservation_system.services.RegistrationService registrationService15 = new com.reservation_system.services.RegistrationService(userRepository13);
        boolean boolean17 = userRepository13.emailExists("");
        com.reservation_system.repository.UserRepository userRepository19 = new com.reservation_system.repository.UserRepository("demo/data/test-users.csv");
        com.reservation_system.services.RegistrationService registrationService20 = new com.reservation_system.services.RegistrationService(userRepository19);
        com.reservation_system.model.Faculty faculty26 = new com.reservation_system.model.Faculty(0, "Password1!", "demo/data/test-users.csv", "researcher", false);
        java.lang.String str27 = faculty26.getName();
        userRepository19.addUser((com.reservation_system.model.User) faculty26);
        java.util.List<com.reservation_system.model.User> userList29 = userRepository19.getAllUsers();
        userRepository13.saveAllUsers(userList29);
        userRepository1.saveAllUsers(userList29);
        com.reservation_system.repository.UserRepository userRepository33 = new com.reservation_system.repository.UserRepository("demo/data/test-users.csv");
        com.reservation_system.services.RegistrationService registrationService34 = new com.reservation_system.services.RegistrationService(userRepository33);
        com.reservation_system.model.Researcher researcher40 = new com.reservation_system.model.Researcher((int) (short) 1, "Password1!", "headlabcoordinator", "", false);
        userRepository33.addUser((com.reservation_system.model.User) researcher40);
        com.reservation_system.services.RegistrationService registrationService42 = new com.reservation_system.services.RegistrationService(userRepository33);
        com.reservation_system.repository.UserRepository userRepository44 = new com.reservation_system.repository.UserRepository("demo/data/test-users.csv");
        com.reservation_system.services.RegistrationService registrationService45 = new com.reservation_system.services.RegistrationService(userRepository44);
        com.reservation_system.model.Faculty faculty51 = new com.reservation_system.model.Faculty(0, "Password1!", "demo/data/test-users.csv", "researcher", false);
        java.lang.String str52 = faculty51.getName();
        userRepository44.addUser((com.reservation_system.model.User) faculty51);
        boolean boolean54 = userRepository44.headLabCoordinatorExists();
        com.reservation_system.model.Guest guest60 = new com.reservation_system.model.Guest((int) (byte) -1, "guest", "Researcher", "Faculty", true);
        userRepository44.addUser((com.reservation_system.model.User) guest60);
        com.reservation_system.repository.UserRepository userRepository63 = new com.reservation_system.repository.UserRepository("demo/data/test-users.csv");
        java.util.List<com.reservation_system.model.User> userList64 = userRepository63.getAllUsers();
        com.reservation_system.services.RegistrationService registrationService65 = new com.reservation_system.services.RegistrationService(userRepository63);
        java.util.List<com.reservation_system.model.User> userList66 = userRepository63.getAllUsers();
        userRepository44.saveAllUsers(userList66);
        userRepository33.saveAllUsers(userList66);
        userRepository1.saveAllUsers(userList66);
        java.util.Optional<com.reservation_system.model.User> userOptional71 = userRepository1.findByEmail("Password1!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Password1!" + "'", str9, "Password1!");
        org.junit.Assert.assertNotNull(userList11);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "Password1!" + "'", str27, "Password1!");
        org.junit.Assert.assertNotNull(userList29);
        org.junit.Assert.assertEquals("'" + str52 + "' != '" + "Password1!" + "'", str52, "Password1!");
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + true + "'", boolean54 == true);
        org.junit.Assert.assertNotNull(userList64);
        org.junit.Assert.assertNotNull(userList66);
        org.junit.Assert.assertNotNull(userOptional71);
    }

    @Test
    public void test1478() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1478");
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
        boolean boolean47 = userRepository1.emailExists("Researcher");
        int int48 = userRepository1.getNextID();
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Password1!" + "'", str9, "Password1!");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "Password1!" + "'", str29, "Password1!");
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "Password1!" + "'", str41, "Password1!");
        org.junit.Assert.assertNotNull(userList43);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + true + "'", boolean47 == true);
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 101 + "'", int48 == 101);
    }

    @Test
    public void test1479() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1479");
        com.reservation_system.model.Guest guest5 = new com.reservation_system.model.Guest((int) '#', "demo/data/test-users.csv", "Password1!", "", true);
    }

    @Test
    public void test1480() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1480");
        com.reservation_system.model.Researcher researcher5 = new com.reservation_system.model.Researcher((int) (byte) 1, "guest", "researcher", "demo/data/test-users.csv", false);
        java.lang.String str6 = researcher5.getName();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "guest" + "'", str6, "guest");
    }

    @Test
    public void test1481() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1481");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("demo/data/test-users.csv");
        java.util.Optional<com.reservation_system.model.User> userOptional3 = userRepository1.findByEmail("hi!");
        int int4 = userRepository1.getNextID();
        boolean boolean5 = userRepository1.headLabCoordinatorExists();
        java.util.List<com.reservation_system.model.User> userList6 = userRepository1.getAllUsers();
        com.reservation_system.services.RegistrationService registrationService7 = new com.reservation_system.services.RegistrationService(userRepository1);
        // The following exception was thrown during execution in test generation
        try {
            com.reservation_system.model.User user12 = registrationService7.registerUser("andrew@example.com", "hi!", "Guest", "guest");
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
    public void test1482() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1482");
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
        java.util.Optional<com.reservation_system.model.User> userOptional28 = userRepository1.findByEmail("headlabcoordinator");
        int int29 = userRepository1.getNextID();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Password1!" + "'", str15, "Password1!");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 101 + "'", int18 == 101);
        org.junit.Assert.assertNotNull(userList21);
        org.junit.Assert.assertNotNull(userList23);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 101 + "'", int26 == 101);
        org.junit.Assert.assertNotNull(userOptional28);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 101 + "'", int29 == 101);
    }

    @Test
    public void test1483() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1483");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("demo/data/test-users.csv");
        java.util.List<com.reservation_system.model.User> userList2 = userRepository1.getAllUsers();
        com.reservation_system.services.RegistrationService registrationService3 = new com.reservation_system.services.RegistrationService(userRepository1);
        java.util.List<com.reservation_system.model.User> userList4 = userRepository1.getAllUsers();
        java.util.Optional<com.reservation_system.model.User> userOptional6 = userRepository1.findByEmail("researcher");
        com.reservation_system.model.Faculty faculty12 = new com.reservation_system.model.Faculty((int) (byte) 1, "researcher", "Andrew", "", false);
        userRepository1.addUser((com.reservation_system.model.User) faculty12);
        java.lang.String str14 = faculty12.getEmail();
        java.lang.String str15 = faculty12.getUserType();
        java.lang.String str16 = faculty12.getUserType();
        org.junit.Assert.assertNotNull(userList2);
        org.junit.Assert.assertNotNull(userList4);
        org.junit.Assert.assertNotNull(userOptional6);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Andrew" + "'", str14, "Andrew");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Faculty" + "'", str15, "Faculty");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Faculty" + "'", str16, "Faculty");
    }

    @Test
    public void test1484() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1484");
        com.reservation_system.model.Faculty faculty5 = new com.reservation_system.model.Faculty((int) (byte) 10, "faculty", "", "researcher", false);
    }

    @Test
    public void test1485() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1485");
        com.reservation_system.model.HeadLabCoordinator headLabCoordinator5 = new com.reservation_system.model.HeadLabCoordinator(102, "Faculty", "", "andrew@example.com", false);
    }

    @Test
    public void test1486() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1486");
        com.reservation_system.model.Student student5 = new com.reservation_system.model.Student(102, "labmanager", "Faculty", "hi!", true);
    }

    @Test
    public void test1487() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1487");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("demo/data/test-users.csv");
        java.util.List<com.reservation_system.model.User> userList2 = userRepository1.getAllUsers();
        com.reservation_system.services.RegistrationService registrationService3 = new com.reservation_system.services.RegistrationService(userRepository1);
        java.util.List<com.reservation_system.model.User> userList4 = userRepository1.getAllUsers();
        java.util.Optional<com.reservation_system.model.User> userOptional6 = userRepository1.findByEmail("");
        java.lang.Class<?> wildcardClass7 = userOptional6.getClass();
        org.junit.Assert.assertNotNull(userList2);
        org.junit.Assert.assertNotNull(userList4);
        org.junit.Assert.assertNotNull(userOptional6);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test1488() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1488");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("demo/data/test-users.csv");
        java.util.Optional<com.reservation_system.model.User> userOptional3 = userRepository1.findByEmail("hi!");
        int int4 = userRepository1.getNextID();
        int int5 = userRepository1.getNextID();
        com.reservation_system.model.Researcher researcher11 = new com.reservation_system.model.Researcher((int) 'a', "student", "", "researcher", true);
        userRepository1.addUser((com.reservation_system.model.User) researcher11);
        java.util.Optional<com.reservation_system.model.User> userOptional14 = userRepository1.findByEmail("student");
        org.junit.Assert.assertNotNull(userOptional3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 101 + "'", int4 == 101);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 101 + "'", int5 == 101);
        org.junit.Assert.assertNotNull(userOptional14);
    }

    @Test
    public void test1489() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1489");
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
        int int17 = userRepository1.getNextID();
        java.util.Optional<com.reservation_system.model.User> userOptional19 = userRepository1.findByEmail("faculty");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Password1!" + "'", str12, "Password1!");
        org.junit.Assert.assertNotNull(userList14);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 101 + "'", int17 == 101);
        org.junit.Assert.assertNotNull(userOptional19);
    }

    @Test
    public void test1490() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1490");
        com.reservation_system.model.Guest guest5 = new com.reservation_system.model.Guest(103, "Andrew", "labmanager", "Andrew", false);
    }

    @Test
    public void test1491() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1491");
        // The following exception was thrown during execution in test generation
        try {
            com.reservation_system.model.User user6 = com.reservation_system.patterns.factory.UserFactory.createUser("Password1!", 98, "", "faculty", "student", true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid user type: Password1!");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1492() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1492");
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
        boolean boolean21 = userRepository1.headLabCoordinatorExists();
        int int22 = userRepository1.getNextID();
        boolean boolean23 = userRepository1.headLabCoordinatorExists();
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Password1!" + "'", str9, "Password1!");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 101 + "'", int20 == 101);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 101 + "'", int22 == 101);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
    }

    @Test
    public void test1493() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1493");
        com.reservation_system.model.Student student5 = new com.reservation_system.model.Student(0, "Student", "Faculty", "hi!", false);
        java.lang.String str6 = student5.getName();
        boolean boolean7 = student5.requiresDepartmentApproval();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Student" + "'", str6, "Student");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test1494() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1494");
        com.reservation_system.model.Faculty faculty5 = new com.reservation_system.model.Faculty((-1), "Andrew", "guest", "labmanager", true);
        faculty5.setApproved(true);
    }

    @Test
    public void test1495() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1495");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("demo/data/test-users.csv");
        boolean boolean2 = userRepository1.headLabCoordinatorExists();
        com.reservation_system.services.RegistrationService registrationService3 = new com.reservation_system.services.RegistrationService(userRepository1);
        java.util.Optional<com.reservation_system.model.User> userOptional5 = userRepository1.findByEmail("researcher");
        java.util.List<com.reservation_system.model.User> userList6 = userRepository1.getAllUsers();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(userOptional5);
        org.junit.Assert.assertNotNull(userList6);
    }

    @Test
    public void test1496() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1496");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("demo/data/test-users.csv");
        com.reservation_system.services.RegistrationService registrationService2 = new com.reservation_system.services.RegistrationService(userRepository1);
        com.reservation_system.model.Faculty faculty8 = new com.reservation_system.model.Faculty(0, "Password1!", "demo/data/test-users.csv", "researcher", false);
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
        java.lang.String str30 = faculty27.getEmail();
        java.lang.String str31 = faculty27.getUserType();
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Password1!" + "'", str9, "Password1!");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(userList13);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "Faculty" + "'", str29, "Faculty");
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "Faculty" + "'", str30, "Faculty");
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "Faculty" + "'", str31, "Faculty");
    }

    @Test
    public void test1497() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1497");
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
        boolean boolean33 = student31.isApproved();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Password1!" + "'", str15, "Password1!");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 101 + "'", int18 == 101);
        org.junit.Assert.assertNotNull(userList21);
        org.junit.Assert.assertNotNull(userList23);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
    }

    @Test
    public void test1498() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1498");
        com.reservation_system.model.Student student5 = new com.reservation_system.model.Student(97, "Guest", "Andrew", "demo/data/test-users.csv", true);
    }

    @Test
    public void test1499() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1499");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("demo/data/test-users.csv");
        com.reservation_system.model.Faculty faculty7 = new com.reservation_system.model.Faculty((int) '4', "labmanager", "hi!", "researcher", false);
        userRepository1.addUser((com.reservation_system.model.User) faculty7);
    }

    @Test
    public void test1500() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1500");
        com.reservation_system.model.Faculty faculty5 = new com.reservation_system.model.Faculty(10, "student", "Student", "labmanager", false);
        java.lang.String str6 = faculty5.getUserType();
        java.lang.String str7 = faculty5.getUserType();
        java.lang.String str8 = faculty5.getUserType();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Faculty" + "'", str6, "Faculty");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Faculty" + "'", str7, "Faculty");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Faculty" + "'", str8, "Faculty");
    }
}
