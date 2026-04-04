package com.reservation_system.Randoop.registrationservice;

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
        com.reservation_system.services.RegistrationService registrationService25 = new com.reservation_system.services.RegistrationService(userRepository1);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Password1!" + "'", str9, "Password1!");
// flaky "1) test2001(com.reservation_system.randoop.registrationservice.RegressionTest4)":         org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
// flaky "1) test2001(com.reservation_system.randoop.registrationservice.RegressionTest4)":         org.junit.Assert.assertTrue("'" + int12 + "' != '" + 103 + "'", int12 == 103);
// flaky "1) test2001(com.reservation_system.randoop.registrationservice.RegressionTest4)":         org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
// flaky "1) test2001(com.reservation_system.randoop.registrationservice.RegressionTest4)":         org.junit.Assert.assertTrue("'" + int21 + "' != '" + 103 + "'", int21 == 103);
        org.junit.Assert.assertNotNull(userList22);
        org.junit.Assert.assertNotNull(userOptional24);
    }

    @Test
    public void test2002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2002");
        com.reservation_system.model.Faculty faculty5 = new com.reservation_system.model.Faculty(10, "researcher", "faculty", "", false);
        java.lang.String str6 = faculty5.getEmail();
        java.lang.String str7 = faculty5.getUserType();
        boolean boolean8 = faculty5.isApproved();
        java.lang.String str9 = faculty5.getUserType();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "faculty" + "'", str6, "faculty");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Faculty" + "'", str7, "Faculty");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Faculty" + "'", str9, "Faculty");
    }

    @Test
    public void test2003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2003");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("demo/data/test-users.csv");
        boolean boolean2 = userRepository1.headLabCoordinatorExists();
        com.reservation_system.services.RegistrationService registrationService3 = new com.reservation_system.services.RegistrationService(userRepository1);
        boolean boolean5 = userRepository1.emailExists("");
        java.util.List<com.reservation_system.model.User> userList6 = userRepository1.getAllUsers();
        com.reservation_system.services.RegistrationService registrationService7 = new com.reservation_system.services.RegistrationService(userRepository1);
        com.reservation_system.model.LabManager labManager13 = new com.reservation_system.model.LabManager(0, "guest", "student", "faculty", false);
        userRepository1.addUser((com.reservation_system.model.User) labManager13);
        java.lang.String str15 = labManager13.getUserType();
        boolean boolean16 = labManager13.requiresDepartmentApproval();
// flaky "2) test2003(com.reservation_system.randoop.registrationservice.RegressionTest4)":         org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
// flaky "2) test2003(com.reservation_system.randoop.registrationservice.RegressionTest4)":         org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(userList6);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "labmanager" + "'", str15, "labmanager");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test2004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2004");
        com.reservation_system.model.HeadLabCoordinator headLabCoordinator5 = new com.reservation_system.model.HeadLabCoordinator((int) (byte) 1, "hi!", "Guest", "Andrew", false);
        boolean boolean6 = headLabCoordinator5.isApproved();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test2005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2005");
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
        java.lang.String str75 = labManager69.getUserType();
// flaky "3) test2005(com.reservation_system.randoop.registrationservice.RegressionTest4)":         org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
// flaky "3) test2005(com.reservation_system.randoop.registrationservice.RegressionTest4)":         org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
// flaky "2) test2005(com.reservation_system.randoop.registrationservice.RegressionTest4)":         org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(userOptional9);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "Password1!" + "'", str20, "Password1!");
// flaky "2) test2005(com.reservation_system.randoop.registrationservice.RegressionTest4)":         org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
// flaky "1) test2005(com.reservation_system.randoop.registrationservice.RegressionTest4)":         org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "Password1!" + "'", str41, "Password1!");
// flaky "1) test2005(com.reservation_system.randoop.registrationservice.RegressionTest4)":         org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + true + "'", boolean43 == true);
        org.junit.Assert.assertNotNull(userList45);
        org.junit.Assert.assertEquals("'" + str55 + "' != '" + "Password1!" + "'", str55, "Password1!");
// flaky "1) test2005(com.reservation_system.randoop.registrationservice.RegressionTest4)":         org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + true + "'", boolean57 == true);
        org.junit.Assert.assertNotNull(userList59);
        org.junit.Assert.assertNotNull(userList62);
        org.junit.Assert.assertEquals("'" + str70 + "' != '" + "Researcher" + "'", str70, "Researcher");
        org.junit.Assert.assertEquals("'" + str74 + "' != '" + "Andrew" + "'", str74, "Andrew");
        org.junit.Assert.assertEquals("'" + str75 + "' != '" + "labmanager" + "'", str75, "labmanager");
    }

    @Test
    public void test2006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2006");
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
        int int93 = userRepository1.getNextID();
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Password1!" + "'", str9, "Password1!");
// flaky "4) test2006(com.reservation_system.randoop.registrationservice.RegressionTest4)":         org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
// flaky "4) test2006(com.reservation_system.randoop.registrationservice.RegressionTest4)":         org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
// flaky "3) test2006(com.reservation_system.randoop.registrationservice.RegressionTest4)":         org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
// flaky "3) test2006(com.reservation_system.randoop.registrationservice.RegressionTest4)":         org.junit.Assert.assertTrue("'" + int23 + "' != '" + 103 + "'", int23 == 103);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "Password1!" + "'", str33, "Password1!");
// flaky "2) test2006(com.reservation_system.randoop.registrationservice.RegressionTest4)":         org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
// flaky "2) test2006(com.reservation_system.randoop.registrationservice.RegressionTest4)":         org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + true + "'", boolean43 == true);
        org.junit.Assert.assertEquals("'" + str53 + "' != '" + "Password1!" + "'", str53, "Password1!");
// flaky "2) test2006(com.reservation_system.randoop.registrationservice.RegressionTest4)":         org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + true + "'", boolean55 == true);
        org.junit.Assert.assertEquals("'" + str65 + "' != '" + "Password1!" + "'", str65, "Password1!");
        org.junit.Assert.assertNotNull(userList67);
// flaky "1) test2006(com.reservation_system.randoop.registrationservice.RegressionTest4)":         org.junit.Assert.assertTrue("'" + boolean71 + "' != '" + true + "'", boolean71 == true);
        org.junit.Assert.assertEquals("'" + str81 + "' != '" + "Password1!" + "'", str81, "Password1!");
// flaky "1) test2006(com.reservation_system.randoop.registrationservice.RegressionTest4)":         org.junit.Assert.assertTrue("'" + boolean83 + "' != '" + true + "'", boolean83 == true);
        org.junit.Assert.assertNotNull(userList85);
// flaky "1) test2006(com.reservation_system.randoop.registrationservice.RegressionTest4)":         org.junit.Assert.assertTrue("'" + boolean89 + "' != '" + true + "'", boolean89 == true);
        org.junit.Assert.assertNotNull(userList90);
        org.junit.Assert.assertTrue("'" + boolean92 + "' != '" + true + "'", boolean92 == true);
// flaky "1) test2006(com.reservation_system.randoop.registrationservice.RegressionTest4)":         org.junit.Assert.assertTrue("'" + int93 + "' != '" + 103 + "'", int93 == 103);
    }

    @Test
    public void test2007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2007");
        com.reservation_system.model.LabManager labManager5 = new com.reservation_system.model.LabManager(0, "Andrew", "researcher", "Password1!", true);
    }

    @Test
    public void test2008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2008");
        com.reservation_system.model.Faculty faculty5 = new com.reservation_system.model.Faculty(1, "Student", "Guest", "", true);
    }

    @Test
    public void test2009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2009");
        com.reservation_system.model.Guest guest5 = new com.reservation_system.model.Guest((int) (byte) 100, "andrew@example.com", "student", "Researcher", false);
        java.lang.String str6 = guest5.getUserType();
        java.lang.String str7 = guest5.getPassword();
        boolean boolean8 = guest5.requiresDepartmentApproval();
        java.lang.String str9 = guest5.getUserType();
        java.lang.String str10 = guest5.getUserType();
        java.lang.String str11 = guest5.getUserType();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Guest" + "'", str6, "Guest");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Researcher" + "'", str7, "Researcher");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Guest" + "'", str9, "Guest");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Guest" + "'", str10, "Guest");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Guest" + "'", str11, "Guest");
    }

    @Test
    public void test2010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2010");
        com.reservation_system.model.Researcher researcher5 = new com.reservation_system.model.Researcher((int) (short) -1, "andrew@example.com", "guest", "labmanager", false);
        java.lang.String str6 = researcher5.getEmail();
        researcher5.setApproved(false);
        boolean boolean9 = researcher5.isApproved();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "guest" + "'", str6, "guest");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test2011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2011");
        com.reservation_system.model.LabManager labManager5 = new com.reservation_system.model.LabManager((int) (byte) 100, "faculty", "guest", "labmanager", false);
    }

    @Test
    public void test2012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2012");
        com.reservation_system.model.Student student5 = new com.reservation_system.model.Student((int) (short) 10, "guest", "student", "", false);
        java.lang.String str6 = student5.getPassword();
        java.lang.String str7 = student5.getUserType();
        java.lang.String str8 = student5.getPassword();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Student" + "'", str7, "Student");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test2013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2013");
        com.reservation_system.model.User user6 = com.reservation_system.patterns.factory.UserFactory.createUser("labmanager", 100, "Andrew", "headlabcoordinator", "Faculty", true);
        user6.setApproved(true);
        org.junit.Assert.assertNotNull(user6);
    }

    @Test
    public void test2014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2014");
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
        boolean boolean24 = userRepository1.headLabCoordinatorExists();
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Password1!" + "'", str9, "Password1!");
// flaky "5) test2014(com.reservation_system.randoop.registrationservice.RegressionTest4)":         org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
// flaky "5) test2014(com.reservation_system.randoop.registrationservice.RegressionTest4)":         org.junit.Assert.assertTrue("'" + int13 + "' != '" + 103 + "'", int13 == 103);
        org.junit.Assert.assertNotNull(userList15);
// flaky "4) test2014(com.reservation_system.randoop.registrationservice.RegressionTest4)":         org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
    }

    @Test
    public void test2015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2015");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("demo/data/test-users.csv");
        java.util.Optional<com.reservation_system.model.User> userOptional3 = userRepository1.findByEmail("hi!");
        boolean boolean5 = userRepository1.emailExists("Faculty");
        java.util.List<com.reservation_system.model.User> userList6 = userRepository1.getAllUsers();
        java.util.Optional<com.reservation_system.model.User> userOptional8 = userRepository1.findByEmail("Password1!");
        int int9 = userRepository1.getNextID();
        org.junit.Assert.assertNotNull(userOptional3);
// flaky "6) test2015(com.reservation_system.randoop.registrationservice.RegressionTest4)":         org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(userList6);
        org.junit.Assert.assertNotNull(userOptional8);
// flaky "6) test2015(com.reservation_system.randoop.registrationservice.RegressionTest4)":         org.junit.Assert.assertTrue("'" + int9 + "' != '" + 103 + "'", int9 == 103);
    }

    @Test
    public void test2016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2016");
        com.reservation_system.model.Researcher researcher5 = new com.reservation_system.model.Researcher((-1), "", "student", "student", false);
    }

    @Test
    public void test2017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2017");
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
        java.util.List<com.reservation_system.model.User> userList52 = null;
        // The following exception was thrown during execution in test generation
        try {
            userRepository1.saveAllUsers(userList52);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky "7) test2017(com.reservation_system.randoop.registrationservice.RegressionTest4)":         org.junit.Assert.assertTrue("'" + int2 + "' != '" + 103 + "'", int2 == 103);
// flaky "7) test2017(com.reservation_system.randoop.registrationservice.RegressionTest4)":         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 103 + "'", int3 == 103);
// flaky "5) test2017(com.reservation_system.randoop.registrationservice.RegressionTest4)":         org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(userOptional14);
        org.junit.Assert.assertNotNull(userList22);
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "Password1!" + "'", str39, "Password1!");
// flaky "4) test2017(com.reservation_system.randoop.registrationservice.RegressionTest4)":         org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + true + "'", boolean41 == true);
        org.junit.Assert.assertNotNull(userList43);
    }

    @Test
    public void test2018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2018");
        com.reservation_system.model.HeadLabCoordinator headLabCoordinator5 = new com.reservation_system.model.HeadLabCoordinator(98, "Password1!", "Researcher", "guest", false);
    }

    @Test
    public void test2019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2019");
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
            com.reservation_system.model.User user21 = registrationService16.registerUser("guest", "Guest", "Guest", "");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid email format.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Password1!" + "'", str9, "Password1!");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertNotNull(userList15);
    }

    @Test
    public void test2020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2020");
        com.reservation_system.model.Guest guest5 = new com.reservation_system.model.Guest(36, "demo/data/test-users.csv", "Password1!", "Faculty", true);
    }

    @Test
    public void test2021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2021");
        com.reservation_system.model.Researcher researcher5 = new com.reservation_system.model.Researcher(0, "Password1!", "Faculty", "student", true);
        boolean boolean6 = researcher5.isApproved();
        int int7 = researcher5.getID();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test2022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2022");
        com.reservation_system.model.HeadLabCoordinator headLabCoordinator5 = new com.reservation_system.model.HeadLabCoordinator(10, "researcher", "headlabcoordinator", "faculty", false);
        java.lang.String str6 = headLabCoordinator5.getUserType();
        java.lang.String str7 = headLabCoordinator5.getEmail();
        java.lang.String str8 = headLabCoordinator5.getUserType();
        java.lang.Class<?> wildcardClass9 = headLabCoordinator5.getClass();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "headlabcoordinator" + "'", str6, "headlabcoordinator");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "headlabcoordinator" + "'", str7, "headlabcoordinator");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "headlabcoordinator" + "'", str8, "headlabcoordinator");
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test2023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2023");
        com.reservation_system.model.Student student5 = new com.reservation_system.model.Student((int) (short) -1, "labmanager", "", "Faculty", true);
        java.lang.String str6 = student5.getPassword();
        java.lang.String str7 = student5.getUserType();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Faculty" + "'", str6, "Faculty");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Student" + "'", str7, "Student");
    }

    @Test
    public void test2024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2024");
        com.reservation_system.model.Guest guest5 = new com.reservation_system.model.Guest((int) (byte) 1, "labmanager", "student", "faculty", false);
        int int6 = guest5.getID();
        java.lang.String str7 = guest5.getUserType();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Guest" + "'", str7, "Guest");
    }

    @Test
    public void test2025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2025");
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
        int int93 = userRepository1.getNextID();
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Password1!" + "'", str9, "Password1!");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 1 + "'", int23 == 1);
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
        org.junit.Assert.assertNotNull(userList89);
        org.junit.Assert.assertNotNull(userOptional91);
        org.junit.Assert.assertTrue("'" + int93 + "' != '" + 1 + "'", int93 == 1);
    }

    @Test
    public void test2026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2026");
        // The following exception was thrown during execution in test generation
        try {
            com.reservation_system.model.User user6 = com.reservation_system.patterns.factory.UserFactory.createUser("demo/data/test-users.csv", 53, "headlabcoordinator", "Andrew", "Password1!", false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid user type: demo/data/test-users.csv");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2027");
        com.reservation_system.model.HeadLabCoordinator headLabCoordinator5 = new com.reservation_system.model.HeadLabCoordinator(1, "student", "Researcher", "", false);
        java.lang.String str6 = headLabCoordinator5.getUserType();
        java.lang.String str7 = headLabCoordinator5.getUserType();
        java.lang.String str8 = headLabCoordinator5.getUserType();
        java.lang.String str9 = headLabCoordinator5.getUserType();
        boolean boolean10 = headLabCoordinator5.isApproved();
        headLabCoordinator5.setApproved(false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "headlabcoordinator" + "'", str6, "headlabcoordinator");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "headlabcoordinator" + "'", str7, "headlabcoordinator");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "headlabcoordinator" + "'", str8, "headlabcoordinator");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "headlabcoordinator" + "'", str9, "headlabcoordinator");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test2028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2028");
        com.reservation_system.model.Researcher researcher5 = new com.reservation_system.model.Researcher((int) (short) -1, "Andrew", "headlabcoordinator", "Guest", false);
        boolean boolean6 = researcher5.requiresDepartmentApproval();
        int int7 = researcher5.getID();
        java.lang.String str8 = researcher5.getName();
        researcher5.setApproved(true);
        java.lang.String str11 = researcher5.getEmail();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Andrew" + "'", str8, "Andrew");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "headlabcoordinator" + "'", str11, "headlabcoordinator");
    }

    @Test
    public void test2029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2029");
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
        boolean boolean17 = faculty11.requiresDepartmentApproval();
        java.lang.String str18 = faculty11.getEmail();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "faculty" + "'", str12, "faculty");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Faculty" + "'", str13, "Faculty");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 10 + "'", int14 == 10);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "faculty" + "'", str16, "faculty");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "faculty" + "'", str18, "faculty");
    }

    @Test
    public void test2030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2030");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("demo/data/test-users.csv");
        java.util.List<com.reservation_system.model.User> userList2 = userRepository1.getAllUsers();
        com.reservation_system.services.RegistrationService registrationService3 = new com.reservation_system.services.RegistrationService(userRepository1);
        com.reservation_system.services.RegistrationService registrationService4 = new com.reservation_system.services.RegistrationService(userRepository1);
        int int5 = userRepository1.getNextID();
        com.reservation_system.model.LabManager labManager11 = new com.reservation_system.model.LabManager((int) (short) 100, "Password1!", "faculty", "Andrew", true);
        userRepository1.addUser((com.reservation_system.model.User) labManager11);
        org.junit.Assert.assertNotNull(userList2);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 11 + "'", int5 == 11);
    }

    @Test
    public void test2031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2031");
        com.reservation_system.model.Guest guest5 = new com.reservation_system.model.Guest(0, "andrew@example.com", "Guest", "student", false);
        java.lang.String str6 = guest5.getUserType();
        java.lang.String str7 = guest5.getUserType();
        java.lang.String str8 = guest5.getUserType();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Guest" + "'", str6, "Guest");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Guest" + "'", str7, "Guest");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Guest" + "'", str8, "Guest");
    }

    @Test
    public void test2032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2032");
        com.reservation_system.model.Guest guest5 = new com.reservation_system.model.Guest((int) (byte) 0, "hi!", "", "student", false);
    }

    @Test
    public void test2033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2033");
        com.reservation_system.model.Faculty faculty5 = new com.reservation_system.model.Faculty((int) (short) 10, "Student", "labmanager", "Researcher", false);
        boolean boolean6 = faculty5.requiresDepartmentApproval();
        java.lang.String str7 = faculty5.getUserType();
        int int8 = faculty5.getID();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Faculty" + "'", str7, "Faculty");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 10 + "'", int8 == 10);
    }

    @Test
    public void test2034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2034");
        com.reservation_system.model.LabManager labManager5 = new com.reservation_system.model.LabManager(0, "guest", "student", "faculty", false);
        java.lang.String str6 = labManager5.getName();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "guest" + "'", str6, "guest");
    }

    @Test
    public void test2035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2035");
        com.reservation_system.model.Student student5 = new com.reservation_system.model.Student(11, "Andrew", "Guest", "headlabcoordinator", false);
    }

    @Test
    public void test2036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2036");
        com.reservation_system.model.Student student5 = new com.reservation_system.model.Student(10, "Password1!", "Student", "Student", false);
    }

    @Test
    public void test2037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2037");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("demo/data/test-users.csv");
        com.reservation_system.services.RegistrationService registrationService2 = new com.reservation_system.services.RegistrationService(userRepository1);
        com.reservation_system.model.Faculty faculty8 = new com.reservation_system.model.Faculty(0, "Password1!", "demo/data/test-users.csv", "researcher", false);
        java.lang.String str9 = faculty8.getName();
        userRepository1.addUser((com.reservation_system.model.User) faculty8);
        boolean boolean12 = userRepository1.emailExists("Faculty");
        int int13 = userRepository1.getNextID();
        com.reservation_system.services.RegistrationService registrationService14 = new com.reservation_system.services.RegistrationService(userRepository1);
        com.reservation_system.services.RegistrationService registrationService15 = new com.reservation_system.services.RegistrationService(userRepository1);
        // The following exception was thrown during execution in test generation
        try {
            com.reservation_system.model.User user20 = registrationService15.registerUser("faculty", "", "faculty", "researcher");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Name is required.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Password1!" + "'", str9, "Password1!");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 101 + "'", int13 == 101);
    }

    @Test
    public void test2038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2038");
        com.reservation_system.model.Student student5 = new com.reservation_system.model.Student((int) (byte) 1, "Andrew", "demo/data/test-users.csv", "Student", false);
        java.lang.String str6 = student5.getUserType();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Student" + "'", str6, "Student");
    }

    @Test
    public void test2039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2039");
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
        java.lang.Class<?> wildcardClass99 = userRepository1.getClass();
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Password1!" + "'", str9, "Password1!");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 101 + "'", int23 == 101);
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
        org.junit.Assert.assertTrue("'" + int89 + "' != '" + 101 + "'", int89 == 101);
        org.junit.Assert.assertNotNull(userList92);
        org.junit.Assert.assertNotNull(userList94);
        org.junit.Assert.assertTrue("'" + boolean96 + "' != '" + false + "'", boolean96 == false);
        org.junit.Assert.assertNotNull(userList97);
        org.junit.Assert.assertNotNull(wildcardClass99);
    }

    @Test
    public void test2040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2040");
        com.reservation_system.model.Guest guest5 = new com.reservation_system.model.Guest(2, "Password1!", "researcher", "headlabcoordinator", true);
    }

    @Test
    public void test2041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2041");
        com.reservation_system.model.Faculty faculty5 = new com.reservation_system.model.Faculty((int) (byte) 10, "Student", "labmanager", "hi!", true);
        java.lang.String str6 = faculty5.getEmail();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "labmanager" + "'", str6, "labmanager");
    }

    @Test
    public void test2042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2042");
        com.reservation_system.model.User user6 = com.reservation_system.patterns.factory.UserFactory.createUser("headlabcoordinator", (int) '#', "Faculty", "student", "guest", false);
        org.junit.Assert.assertNotNull(user6);
    }

    @Test
    public void test2043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2043");
        // The following exception was thrown during execution in test generation
        try {
            com.reservation_system.model.User user6 = com.reservation_system.patterns.factory.UserFactory.createUser("Password1!", (int) (byte) 100, "Student", "student", "demo/data/test-users.csv", true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid user type: Password1!");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2044");
        com.reservation_system.model.LabManager labManager5 = new com.reservation_system.model.LabManager(10, "Faculty", "faculty", "Password1!", true);
        boolean boolean6 = labManager5.requiresDepartmentApproval();
        java.lang.String str7 = labManager5.getUserType();
        java.lang.String str8 = labManager5.getUserType();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "labmanager" + "'", str7, "labmanager");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "labmanager" + "'", str8, "labmanager");
    }

    @Test
    public void test2045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2045");
        com.reservation_system.model.HeadLabCoordinator headLabCoordinator5 = new com.reservation_system.model.HeadLabCoordinator((int) (short) 100, "andrew@example.com", "student", "headlabcoordinator", true);
    }

    @Test
    public void test2046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2046");
        com.reservation_system.model.LabManager labManager5 = new com.reservation_system.model.LabManager(0, "guest", "student", "faculty", false);
        java.lang.String str6 = labManager5.getUserType();
        int int7 = labManager5.getID();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "labmanager" + "'", str6, "labmanager");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test2047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2047");
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
        java.lang.String str34 = student32.getEmail();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Password1!" + "'", str15, "Password1!");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 101 + "'", int18 == 101);
        org.junit.Assert.assertNotNull(userList21);
        org.junit.Assert.assertNotNull(userList23);
        org.junit.Assert.assertNotNull(userList26);
    }

    @Test
    public void test2048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2048");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("demo/data/test-users.csv");
        int int2 = userRepository1.getNextID();
        int int3 = userRepository1.getNextID();
        boolean boolean5 = userRepository1.emailExists("faculty");
        com.reservation_system.model.Faculty faculty11 = new com.reservation_system.model.Faculty(10, "researcher", "faculty", "", false);
        java.lang.String str12 = faculty11.getEmail();
        java.lang.String str13 = faculty11.getUserType();
        int int14 = faculty11.getID();
        userRepository1.addUser((com.reservation_system.model.User) faculty11);
        java.util.List<com.reservation_system.model.User> userList16 = userRepository1.getAllUsers();
        com.reservation_system.services.RegistrationService registrationService17 = new com.reservation_system.services.RegistrationService(userRepository1);
        // The following exception was thrown during execution in test generation
        try {
            com.reservation_system.model.User user22 = registrationService17.registerUser("student", "Student", "Faculty", "andrew@example.com");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid email format.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 101 + "'", int2 == 101);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 101 + "'", int3 == 101);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "faculty" + "'", str12, "faculty");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Faculty" + "'", str13, "Faculty");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 10 + "'", int14 == 10);
        org.junit.Assert.assertNotNull(userList16);
    }

    @Test
    public void test2049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2049");
        com.reservation_system.model.LabManager labManager5 = new com.reservation_system.model.LabManager(102, "andrew@example.com", "researcher", "guest", true);
        java.lang.String str6 = labManager5.getEmail();
        labManager5.setApproved(false);
        java.lang.String str9 = labManager5.getUserType();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "researcher" + "'", str6, "researcher");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "labmanager" + "'", str9, "labmanager");
    }

    @Test
    public void test2050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2050");
        com.reservation_system.model.HeadLabCoordinator headLabCoordinator5 = new com.reservation_system.model.HeadLabCoordinator(11, "hi!", "Andrew", "Student", true);
    }

    @Test
    public void test2051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2051");
        com.reservation_system.model.User user6 = com.reservation_system.patterns.factory.UserFactory.createUser("Guest", 98, "guest", "Faculty", "faculty", true);
        org.junit.Assert.assertNotNull(user6);
    }

    @Test
    public void test2052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2052");
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
        com.reservation_system.services.RegistrationService registrationService55 = new com.reservation_system.services.RegistrationService(userRepository1);
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
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertNotNull(userList48);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
    }

    @Test
    public void test2053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2053");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("demo/data/test-users.csv");
        java.util.Optional<com.reservation_system.model.User> userOptional3 = userRepository1.findByEmail("hi!");
        int int4 = userRepository1.getNextID();
        com.reservation_system.services.RegistrationService registrationService5 = new com.reservation_system.services.RegistrationService(userRepository1);
        java.util.Optional<com.reservation_system.model.User> userOptional7 = userRepository1.findByEmail("guest");
        java.util.Optional<com.reservation_system.model.User> userOptional9 = userRepository1.findByEmail("researcher");
        org.junit.Assert.assertNotNull(userOptional3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 101 + "'", int4 == 101);
        org.junit.Assert.assertNotNull(userOptional7);
        org.junit.Assert.assertNotNull(userOptional9);
    }

    @Test
    public void test2054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2054");
        com.reservation_system.model.Student student5 = new com.reservation_system.model.Student((int) ' ', "Password1!", "andrew@example.com", "researcher", false);
        java.lang.String str6 = student5.getUserType();
        java.lang.String str7 = student5.getEmail();
        java.lang.String str8 = student5.getName();
        java.lang.String str9 = student5.getUserType();
        java.lang.String str10 = student5.getUserType();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Student" + "'", str6, "Student");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Password1!" + "'", str8, "Password1!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Student" + "'", str9, "Student");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Student" + "'", str10, "Student");
    }

    @Test
    public void test2055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2055");
        com.reservation_system.model.Student student5 = new com.reservation_system.model.Student((int) (short) 10, "guest", "", "", true);
        java.lang.String str6 = student5.getUserType();
        java.lang.String str7 = student5.getUserType();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Student" + "'", str6, "Student");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Student" + "'", str7, "Student");
    }

    @Test
    public void test2056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2056");
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
        java.lang.String str33 = faculty26.getUserType();
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
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "Faculty" + "'", str33, "Faculty");
    }

    @Test
    public void test2057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2057");
        com.reservation_system.model.Faculty faculty5 = new com.reservation_system.model.Faculty(102, "Andrew", "labmanager", "Andrew", true);
        boolean boolean6 = faculty5.requiresDepartmentApproval();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test2058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2058");
        com.reservation_system.model.Guest guest5 = new com.reservation_system.model.Guest(32, "", "researcher", "Guest", false);
    }

    @Test
    public void test2059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2059");
        com.reservation_system.model.User user6 = com.reservation_system.patterns.factory.UserFactory.createUser("faculty", 11, "Researcher", "headlabcoordinator", "faculty", false);
        org.junit.Assert.assertNotNull(user6);
    }

    @Test
    public void test2060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2060");
        com.reservation_system.model.Guest guest5 = new com.reservation_system.model.Guest((int) (byte) 100, "andrew@example.com", "student", "Researcher", false);
        java.lang.String str6 = guest5.getUserType();
        java.lang.String str7 = guest5.getPassword();
        java.lang.String str8 = guest5.getUserType();
        java.lang.String str9 = guest5.getUserType();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Guest" + "'", str6, "Guest");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Researcher" + "'", str7, "Researcher");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Guest" + "'", str8, "Guest");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Guest" + "'", str9, "Guest");
    }

    @Test
    public void test2061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2061");
        com.reservation_system.model.Faculty faculty5 = new com.reservation_system.model.Faculty((int) ' ', "Andrew", "Guest", "Andrew", true);
    }

    @Test
    public void test2062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2062");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("demo/data/test-users.csv");
        java.util.List<com.reservation_system.model.User> userList2 = userRepository1.getAllUsers();
        com.reservation_system.services.RegistrationService registrationService3 = new com.reservation_system.services.RegistrationService(userRepository1);
        int int4 = userRepository1.getNextID();
        com.reservation_system.model.Researcher researcher10 = new com.reservation_system.model.Researcher(100, "demo/data/test-users.csv", "andrew@example.com", "guest", false);
        java.lang.String str11 = researcher10.getEmail();
        userRepository1.addUser((com.reservation_system.model.User) researcher10);
        java.lang.String str13 = researcher10.getEmail();
        int int14 = researcher10.getID();
        int int15 = researcher10.getID();
        org.junit.Assert.assertNotNull(userList2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 101 + "'", int4 == 101);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 100 + "'", int14 == 100);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 100 + "'", int15 == 100);
    }

    @Test
    public void test2063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2063");
        com.reservation_system.model.Researcher researcher5 = new com.reservation_system.model.Researcher(32, "researcher", "andrew@example.com", "Andrew", true);
    }

    @Test
    public void test2064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2064");
        com.reservation_system.model.Guest guest5 = new com.reservation_system.model.Guest((int) (short) 1, "", "labmanager", "labmanager", false);
    }

    @Test
    public void test2065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2065");
        com.reservation_system.model.Researcher researcher5 = new com.reservation_system.model.Researcher((int) (short) -1, "faculty", "researcher", "hi!", true);
        java.lang.String str6 = researcher5.getUserType();
        int int7 = researcher5.getID();
        researcher5.setApproved(false);
        java.lang.String str10 = researcher5.getUserType();
        boolean boolean11 = researcher5.requiresDepartmentApproval();
        java.lang.String str12 = researcher5.getUserType();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Researcher" + "'", str6, "Researcher");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Researcher" + "'", str10, "Researcher");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Researcher" + "'", str12, "Researcher");
    }

    @Test
    public void test2066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2066");
        com.reservation_system.model.Faculty faculty5 = new com.reservation_system.model.Faculty(35, "Faculty", "Password1!", "Researcher", true);
    }

    @Test
    public void test2067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2067");
        com.reservation_system.model.Guest guest5 = new com.reservation_system.model.Guest((-1), "researcher", "labmanager", "headlabcoordinator", true);
        java.lang.String str6 = guest5.getUserType();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Guest" + "'", str6, "Guest");
    }

    @Test
    public void test2068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2068");
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
        com.reservation_system.model.Student student81 = new com.reservation_system.model.Student((int) (byte) 100, "Researcher", "", "", false);
        boolean boolean82 = student81.isApproved();
        boolean boolean83 = student81.isApproved();
        java.lang.String str84 = student81.getName();
        userRepository1.addUser((com.reservation_system.model.User) student81);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
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
        org.junit.Assert.assertEquals("'" + str70 + "' != '" + "Researcher" + "'", str70, "Researcher");
        org.junit.Assert.assertTrue("'" + boolean74 + "' != '" + false + "'", boolean74 == false);
        org.junit.Assert.assertTrue("'" + boolean82 + "' != '" + false + "'", boolean82 == false);
        org.junit.Assert.assertTrue("'" + boolean83 + "' != '" + false + "'", boolean83 == false);
        org.junit.Assert.assertEquals("'" + str84 + "' != '" + "Researcher" + "'", str84, "Researcher");
    }

    @Test
    public void test2069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2069");
        com.reservation_system.model.Guest guest5 = new com.reservation_system.model.Guest(0, "headlabcoordinator", "demo/data/test-users.csv", "Andrew", true);
    }

    @Test
    public void test2070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2070");
        com.reservation_system.model.User user6 = com.reservation_system.patterns.factory.UserFactory.createUser("headlabcoordinator", (-1), "researcher", "faculty", "andrew@example.com", true);
        org.junit.Assert.assertNotNull(user6);
    }

    @Test
    public void test2071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2071");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("demo/data/test-users.csv");
        com.reservation_system.services.RegistrationService registrationService2 = new com.reservation_system.services.RegistrationService(userRepository1);
        com.reservation_system.model.Faculty faculty8 = new com.reservation_system.model.Faculty(0, "Password1!", "demo/data/test-users.csv", "researcher", false);
        java.lang.String str9 = faculty8.getName();
        userRepository1.addUser((com.reservation_system.model.User) faculty8);
        boolean boolean12 = userRepository1.emailExists("Faculty");
        int int13 = userRepository1.getNextID();
        com.reservation_system.services.RegistrationService registrationService14 = new com.reservation_system.services.RegistrationService(userRepository1);
        com.reservation_system.services.RegistrationService registrationService15 = new com.reservation_system.services.RegistrationService(userRepository1);
        java.util.List<com.reservation_system.model.User> userList16 = userRepository1.getAllUsers();
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Password1!" + "'", str9, "Password1!");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 101 + "'", int13 == 101);
        org.junit.Assert.assertNotNull(userList16);
    }

    @Test
    public void test2072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2072");
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
        // The following exception was thrown during execution in test generation
        try {
            com.reservation_system.model.User user80 = registrationService75.registerUser("demo/data/test-users.csv", "Faculty", "Student", "Guest");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid user type.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
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
        org.junit.Assert.assertEquals("'" + str70 + "' != '" + "Researcher" + "'", str70, "Researcher");
        org.junit.Assert.assertTrue("'" + boolean74 + "' != '" + false + "'", boolean74 == false);
    }

    @Test
    public void test2073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2073");
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
        boolean boolean27 = userRepository1.headLabCoordinatorExists();
        com.reservation_system.model.LabManager labManager33 = new com.reservation_system.model.LabManager((int) (short) 10, "demo/data/test-users.csv", "Guest", "andrew@example.com", false);
        java.lang.String str34 = labManager33.getUserType();
        userRepository1.addUser((com.reservation_system.model.User) labManager33);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Password1!" + "'", str14, "Password1!");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(userList24);
        org.junit.Assert.assertNotNull(userList26);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "labmanager" + "'", str34, "labmanager");
    }
}
