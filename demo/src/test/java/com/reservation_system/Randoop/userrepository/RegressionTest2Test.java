package com.reservation_system.Randoop.userrepository;

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
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("data/test-userrepo.csv");
        com.reservation_system.model.Researcher researcher7 = new com.reservation_system.model.Researcher(5, "hi!", "labmanager", "Guest", false);
        userRepository1.addUser((com.reservation_system.model.User) researcher7);
        java.util.List<com.reservation_system.model.User> userList9 = userRepository1.getAllUsers();
        boolean boolean10 = userRepository1.headLabCoordinatorExists();
        boolean boolean12 = userRepository1.emailExists("guest");
        java.util.Optional<com.reservation_system.model.User> userOptional14 = userRepository1.findByEmail("researcher");
        java.util.Optional<com.reservation_system.model.User> userOptional16 = userRepository1.findByEmail("headlabcoordinator");
        org.junit.Assert.assertNotNull(userList9);
// flaky "1) test1001(com.reservation_system.randoop.userrepository.RegressionTest2)":         org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
// flaky "1) test1001(com.reservation_system.randoop.userrepository.RegressionTest2)":         org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(userOptional14);
        org.junit.Assert.assertNotNull(userOptional16);
    }

    @Test
    public void test1002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1002");
        com.reservation_system.model.User user6 = com.reservation_system.patterns.factory.UserFactory.createUser("guest", (int) (byte) -1, "Student", "alice@example.com", "Faculty", false);
        java.lang.String str7 = user6.getEmail();
        org.junit.Assert.assertNotNull(user6);
    }

    @Test
    public void test1003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1003");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("data/test-userrepo.csv");
        int int2 = userRepository1.getNextID();
        int int3 = userRepository1.getNextID();
        com.reservation_system.model.HeadLabCoordinator headLabCoordinator9 = new com.reservation_system.model.HeadLabCoordinator((int) (byte) 1, "", "", "guest", false);
        userRepository1.addUser((com.reservation_system.model.User) headLabCoordinator9);
        java.util.List<com.reservation_system.model.User> userList11 = userRepository1.getAllUsers();
        boolean boolean12 = userRepository1.headLabCoordinatorExists();
        com.reservation_system.repository.UserRepository userRepository14 = new com.reservation_system.repository.UserRepository("data/test-userrepo.csv");
        int int15 = userRepository14.getNextID();
        int int16 = userRepository14.getNextID();
        java.util.List<com.reservation_system.model.User> userList17 = userRepository14.getAllUsers();
        com.reservation_system.repository.UserRepository userRepository19 = new com.reservation_system.repository.UserRepository("data/test-userrepo.csv");
        com.reservation_system.model.Researcher researcher25 = new com.reservation_system.model.Researcher(5, "hi!", "labmanager", "Guest", false);
        userRepository19.addUser((com.reservation_system.model.User) researcher25);
        java.util.List<com.reservation_system.model.User> userList27 = userRepository19.getAllUsers();
        com.reservation_system.model.Guest guest33 = new com.reservation_system.model.Guest(0, "Password1!", "data/test-userrepo.csv", "researcher", false);
        boolean boolean34 = guest33.requiresDepartmentApproval();
        userRepository19.addUser((com.reservation_system.model.User) guest33);
        boolean boolean37 = userRepository19.emailExists("Alice");
        int int38 = userRepository19.getNextID();
        com.reservation_system.repository.UserRepository userRepository40 = new com.reservation_system.repository.UserRepository("data/test-userrepo.csv");
        java.util.List<com.reservation_system.model.User> userList41 = userRepository40.getAllUsers();
        userRepository19.saveAllUsers(userList41);
        userRepository14.saveAllUsers(userList41);
        userRepository1.saveAllUsers(userList41);
        java.lang.Class<?> wildcardClass45 = userRepository1.getClass();
// flaky "2) test1003(com.reservation_system.randoop.userrepository.RegressionTest2)":         org.junit.Assert.assertTrue("'" + int2 + "' != '" + 102 + "'", int2 == 102);
// flaky "2) test1003(com.reservation_system.randoop.userrepository.RegressionTest2)":         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 102 + "'", int3 == 102);
        org.junit.Assert.assertNotNull(userList11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
// flaky "1) test1003(com.reservation_system.randoop.userrepository.RegressionTest2)":         org.junit.Assert.assertTrue("'" + int15 + "' != '" + 102 + "'", int15 == 102);
// flaky "1) test1003(com.reservation_system.randoop.userrepository.RegressionTest2)":         org.junit.Assert.assertTrue("'" + int16 + "' != '" + 102 + "'", int16 == 102);
        org.junit.Assert.assertNotNull(userList17);
        org.junit.Assert.assertNotNull(userList27);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
// flaky "1) test1003(com.reservation_system.randoop.userrepository.RegressionTest2)":         org.junit.Assert.assertTrue("'" + int38 + "' != '" + 102 + "'", int38 == 102);
        org.junit.Assert.assertNotNull(userList41);
        org.junit.Assert.assertNotNull(wildcardClass45);
    }

    @Test
    public void test1004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1004");
        com.reservation_system.model.LabManager labManager5 = new com.reservation_system.model.LabManager((int) (byte) 0, "labmanager", "Student", "", false);
        java.lang.String str6 = labManager5.getUserType();
        boolean boolean7 = labManager5.requiresDepartmentApproval();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "labmanager" + "'", str6, "labmanager");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test1005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1005");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("data/test-userrepo.csv");
        com.reservation_system.model.Researcher researcher7 = new com.reservation_system.model.Researcher(5, "hi!", "labmanager", "Guest", false);
        userRepository1.addUser((com.reservation_system.model.User) researcher7);
        com.reservation_system.repository.UserRepository userRepository10 = new com.reservation_system.repository.UserRepository("data/test-userrepo.csv");
        com.reservation_system.model.Researcher researcher16 = new com.reservation_system.model.Researcher(5, "hi!", "labmanager", "Guest", false);
        userRepository10.addUser((com.reservation_system.model.User) researcher16);
        java.util.List<com.reservation_system.model.User> userList18 = userRepository10.getAllUsers();
        boolean boolean20 = userRepository10.emailExists("hi!");
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
        userRepository10.saveAllUsers(userList50);
        java.util.List<com.reservation_system.model.User> userList54 = userRepository10.getAllUsers();
        userRepository1.saveAllUsers(userList54);
        boolean boolean57 = userRepository1.emailExists("Student");
        org.junit.Assert.assertNotNull(userList18);
// flaky "3) test1005(com.reservation_system.randoop.userrepository.RegressionTest2)":         org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertNotNull(userList30);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
// flaky "3) test1005(com.reservation_system.randoop.userrepository.RegressionTest2)":         org.junit.Assert.assertTrue("'" + int41 + "' != '" + 102 + "'", int41 == 102);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertNotNull(userList48);
// flaky "2) test1005(com.reservation_system.randoop.userrepository.RegressionTest2)":         org.junit.Assert.assertTrue("'" + int49 + "' != '" + 102 + "'", int49 == 102);
        org.junit.Assert.assertNotNull(userList50);
        org.junit.Assert.assertNotNull(userList54);
// flaky "2) test1005(com.reservation_system.randoop.userrepository.RegressionTest2)":         org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + true + "'", boolean57 == true);
    }

    @Test
    public void test1006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1006");
        com.reservation_system.model.LabManager labManager5 = new com.reservation_system.model.LabManager(0, "Password1!", "headlabcoordinator", "alice@example.com", false);
        java.lang.String str6 = labManager5.getPassword();
    }

    @Test
    public void test1007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1007");
        com.reservation_system.model.Faculty faculty5 = new com.reservation_system.model.Faculty((-1), "student", "Student", "student", true);
    }

    @Test
    public void test1008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1008");
        com.reservation_system.model.Guest guest5 = new com.reservation_system.model.Guest(35, "data/test-userrepo.csv", "Password1!", "Faculty", true);
    }

    @Test
    public void test1009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1009");
        com.reservation_system.model.Researcher researcher5 = new com.reservation_system.model.Researcher((int) (byte) 10, "hi!", "hi!", "alice@example.com", true);
    }

    @Test
    public void test1010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1010");
        com.reservation_system.model.Guest guest5 = new com.reservation_system.model.Guest((int) 'a', "labmanager", "headlabcoordinator", "researcher", true);
    }

    @Test
    public void test1011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1011");
        com.reservation_system.model.HeadLabCoordinator headLabCoordinator5 = new com.reservation_system.model.HeadLabCoordinator((int) (byte) 10, "Alice", "guest", "alice@example.com", true);
        java.lang.String str6 = headLabCoordinator5.getPassword();
    }

    @Test
    public void test1012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1012");
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
        boolean boolean58 = userRepository1.headLabCoordinatorExists();
        java.util.Optional<com.reservation_system.model.User> userOptional60 = userRepository1.findByEmail("student");
        boolean boolean62 = userRepository1.emailExists("Student");
        org.junit.Assert.assertNotNull(userOptional10);
        org.junit.Assert.assertNotNull(userList11);
        org.junit.Assert.assertNotNull(userList21);
// flaky "4) test1012(com.reservation_system.randoop.userrepository.RegressionTest2)":         org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertNotNull(userList33);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
// flaky "4) test1012(com.reservation_system.randoop.userrepository.RegressionTest2)":         org.junit.Assert.assertTrue("'" + int44 + "' != '" + 102 + "'", int44 == 102);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertNotNull(userList51);
// flaky "3) test1012(com.reservation_system.randoop.userrepository.RegressionTest2)":         org.junit.Assert.assertTrue("'" + int52 + "' != '" + 102 + "'", int52 == 102);
        org.junit.Assert.assertNotNull(userList53);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + true + "'", boolean58 == true);
        org.junit.Assert.assertNotNull(userOptional60);
// flaky "3) test1012(com.reservation_system.randoop.userrepository.RegressionTest2)":         org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + true + "'", boolean62 == true);
    }

    @Test
    public void test1013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1013");
        com.reservation_system.model.Student student5 = new com.reservation_system.model.Student((int) (byte) -1, "student", "headlabcoordinator", "Researcher", false);
    }

    @Test
    public void test1014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1014");
        com.reservation_system.model.User user6 = com.reservation_system.patterns.factory.UserFactory.createUser("Student", 0, "headlabcoordinator", "data/test-userrepo.csv", "Password1!", true);
        org.junit.Assert.assertNotNull(user6);
    }

    @Test
    public void test1015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1015");
        com.reservation_system.model.Student student5 = new com.reservation_system.model.Student(1, "data/test-userrepo.csv", "alice@example.com", "guest", false);
        java.lang.String str6 = student5.getUserType();
        student5.setApproved(false);
        java.lang.String str9 = student5.getUserType();
        java.lang.String str10 = student5.getPassword();
        int int11 = student5.getID();
        student5.setApproved(true);
        student5.setApproved(true);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Student" + "'", str6, "Student");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Student" + "'", str9, "Student");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "guest" + "'", str10, "guest");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
    }

    @Test
    public void test1016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1016");
        com.reservation_system.model.Faculty faculty5 = new com.reservation_system.model.Faculty((int) (byte) 0, "Student", "Researcher", "data/test-userrepo.csv", false);
        java.lang.String str6 = faculty5.getUserType();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Faculty" + "'", str6, "Faculty");
    }

    @Test
    public void test1017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1017");
        com.reservation_system.model.Researcher researcher5 = new com.reservation_system.model.Researcher(6, "researcher", "Researcher", "faculty", false);
    }

    @Test
    public void test1018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1018");
        com.reservation_system.model.LabManager labManager5 = new com.reservation_system.model.LabManager((int) (short) 0, "", "guest", "data/test-userrepo.csv", false);
    }

    @Test
    public void test1019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1019");
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
        com.reservation_system.repository.UserRepository userRepository54 = new com.reservation_system.repository.UserRepository("data/test-userrepo.csv");
        boolean boolean56 = userRepository54.emailExists("Alice");
        com.reservation_system.repository.UserRepository userRepository58 = new com.reservation_system.repository.UserRepository("data/test-userrepo.csv");
        java.util.List<com.reservation_system.model.User> userList59 = userRepository58.getAllUsers();
        int int60 = userRepository58.getNextID();
        java.util.List<com.reservation_system.model.User> userList61 = userRepository58.getAllUsers();
        userRepository54.saveAllUsers(userList61);
        userRepository22.saveAllUsers(userList61);
        userRepository1.saveAllUsers(userList61);
        java.util.List<com.reservation_system.model.User> userList65 = null;
        // The following exception was thrown during execution in test generation
        try {
            userRepository1.saveAllUsers(userList65);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(userList2);
// flaky "5) test1019(com.reservation_system.randoop.userrepository.RegressionTest2)":         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 102 + "'", int3 == 102);
        org.junit.Assert.assertNotNull(userList6);
// flaky "5) test1019(com.reservation_system.randoop.userrepository.RegressionTest2)":         org.junit.Assert.assertTrue("'" + int7 + "' != '" + 102 + "'", int7 == 102);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(userOptional12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
// flaky "4) test1019(com.reservation_system.randoop.userrepository.RegressionTest2)":         org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(userList19);
        org.junit.Assert.assertNotNull(userList30);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
// flaky "4) test1019(com.reservation_system.randoop.userrepository.RegressionTest2)":         org.junit.Assert.assertTrue("'" + int41 + "' != '" + 102 + "'", int41 == 102);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertNotNull(userList48);
// flaky "2) test1019(com.reservation_system.randoop.userrepository.RegressionTest2)":         org.junit.Assert.assertTrue("'" + int49 + "' != '" + 102 + "'", int49 == 102);
        org.junit.Assert.assertNotNull(userList50);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
        org.junit.Assert.assertNotNull(userList59);
// flaky "1) test1019(com.reservation_system.randoop.userrepository.RegressionTest2)":         org.junit.Assert.assertTrue("'" + int60 + "' != '" + 102 + "'", int60 == 102);
        org.junit.Assert.assertNotNull(userList61);
    }

    @Test
    public void test1020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1020");
        com.reservation_system.model.Faculty faculty5 = new com.reservation_system.model.Faculty(0, "Student", "hi!", "data/test-userrepo.csv", true);
        int int6 = faculty5.getID();
        faculty5.setApproved(false);
        java.lang.String str9 = faculty5.getPassword();
        faculty5.setApproved(false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "data/test-userrepo.csv" + "'", str9, "data/test-userrepo.csv");
    }

    @Test
    public void test1021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1021");
        com.reservation_system.model.HeadLabCoordinator headLabCoordinator5 = new com.reservation_system.model.HeadLabCoordinator(52, "headlabcoordinator", "labmanager", "Researcher", true);
    }

    @Test
    public void test1022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1022");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("data/test-userrepo.csv");
        boolean boolean3 = userRepository1.emailExists("Alice");
        com.reservation_system.model.Faculty faculty9 = new com.reservation_system.model.Faculty((int) (byte) -1, "Alice", "researcher", "Password1!", false);
        java.lang.String str10 = faculty9.getName();
        java.lang.String str11 = faculty9.getUserType();
        java.lang.String str12 = faculty9.getUserType();
        faculty9.setApproved(false);
        userRepository1.addUser((com.reservation_system.model.User) faculty9);
        java.lang.String str16 = faculty9.getUserType();
        java.lang.String str17 = faculty9.getEmail();
        java.lang.String str18 = faculty9.getEmail();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Alice" + "'", str10, "Alice");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Faculty" + "'", str11, "Faculty");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Faculty" + "'", str12, "Faculty");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Faculty" + "'", str16, "Faculty");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "researcher" + "'", str17, "researcher");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "researcher" + "'", str18, "researcher");
    }

    @Test
    public void test1023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1023");
        com.reservation_system.model.Faculty faculty5 = new com.reservation_system.model.Faculty((int) (short) -1, "Faculty", "Guest", "Researcher", true);
        java.lang.String str6 = faculty5.getUserType();
        int int7 = faculty5.getID();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Faculty" + "'", str6, "Faculty");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
    }

    @Test
    public void test1024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1024");
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
        int int22 = userRepository1.getNextID();
        com.reservation_system.model.Guest guest28 = new com.reservation_system.model.Guest((int) (byte) 10, "Alice", "student", "guest", false);
        int int29 = guest28.getID();
        userRepository1.addUser((com.reservation_system.model.User) guest28);
        org.junit.Assert.assertNotNull(userList9);
        org.junit.Assert.assertNotNull(userList19);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 6 + "'", int22 == 6);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 10 + "'", int29 == 10);
    }

    @Test
    public void test1025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1025");
        com.reservation_system.model.Researcher researcher5 = new com.reservation_system.model.Researcher((int) (short) -1, "data/test-userrepo.csv", "Faculty", "Faculty", true);
    }

    @Test
    public void test1026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1026");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("data/test-userrepo.csv");
        com.reservation_system.model.Researcher researcher7 = new com.reservation_system.model.Researcher(5, "hi!", "labmanager", "Guest", false);
        userRepository1.addUser((com.reservation_system.model.User) researcher7);
        java.util.List<com.reservation_system.model.User> userList9 = userRepository1.getAllUsers();
        java.util.Optional<com.reservation_system.model.User> userOptional11 = userRepository1.findByEmail("");
        boolean boolean12 = userRepository1.headLabCoordinatorExists();
        int int13 = userRepository1.getNextID();
        org.junit.Assert.assertNotNull(userList9);
        org.junit.Assert.assertNotNull(userOptional11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 11 + "'", int13 == 11);
    }

    @Test
    public void test1027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1027");
        com.reservation_system.model.Guest guest5 = new com.reservation_system.model.Guest(0, "Password1!", "data/test-userrepo.csv", "researcher", false);
        boolean boolean6 = guest5.requiresDepartmentApproval();
        java.lang.String str7 = guest5.getUserType();
        java.lang.String str8 = guest5.getPassword();
        java.lang.String str9 = guest5.getPassword();
        java.lang.String str10 = guest5.getUserType();
        java.lang.String str11 = guest5.getPassword();
        java.lang.String str12 = guest5.getUserType();
        boolean boolean13 = guest5.isApproved();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Guest" + "'", str7, "Guest");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "researcher" + "'", str8, "researcher");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "researcher" + "'", str9, "researcher");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Guest" + "'", str10, "Guest");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "researcher" + "'", str11, "researcher");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Guest" + "'", str12, "Guest");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test1028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1028");
        com.reservation_system.model.Researcher researcher5 = new com.reservation_system.model.Researcher(1, "hi!", "Student", "Researcher", false);
    }

    @Test
    public void test1029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1029");
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
        int int31 = userRepository1.getNextID();
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 11 + "'", int9 == 11);
        org.junit.Assert.assertNotNull(userOptional11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 11 + "'", int12 == 11);
        org.junit.Assert.assertNotNull(userOptional14);
        org.junit.Assert.assertNotNull(userList17);
        org.junit.Assert.assertNotNull(userList19);
        org.junit.Assert.assertNotNull(user26);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 11 + "'", int28 == 11);
        org.junit.Assert.assertNotNull(userOptional30);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 11 + "'", int31 == 11);
    }

    @Test
    public void test1030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1030");
        com.reservation_system.model.Guest guest5 = new com.reservation_system.model.Guest(0, "Password1!", "data/test-userrepo.csv", "researcher", false);
        boolean boolean6 = guest5.requiresDepartmentApproval();
        java.lang.String str7 = guest5.getUserType();
        java.lang.String str8 = guest5.getPassword();
        java.lang.String str9 = guest5.getPassword();
        java.lang.String str10 = guest5.getUserType();
        java.lang.String str11 = guest5.getUserType();
        java.lang.String str12 = guest5.getEmail();
        boolean boolean13 = guest5.requiresDepartmentApproval();
        guest5.setApproved(true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Guest" + "'", str7, "Guest");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "researcher" + "'", str8, "researcher");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "researcher" + "'", str9, "researcher");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Guest" + "'", str10, "Guest");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Guest" + "'", str11, "Guest");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "data/test-userrepo.csv" + "'", str12, "data/test-userrepo.csv");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test1031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1031");
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
        com.reservation_system.repository.UserRepository userRepository30 = new com.reservation_system.repository.UserRepository("data/test-userrepo.csv");
        java.util.List<com.reservation_system.model.User> userList31 = userRepository30.getAllUsers();
        int int32 = userRepository30.getNextID();
        boolean boolean34 = userRepository30.emailExists("headlabcoordinator");
        boolean boolean35 = userRepository30.headLabCoordinatorExists();
        int int36 = userRepository30.getNextID();
        com.reservation_system.repository.UserRepository userRepository38 = new com.reservation_system.repository.UserRepository("data/test-userrepo.csv");
        com.reservation_system.model.Researcher researcher44 = new com.reservation_system.model.Researcher(5, "hi!", "labmanager", "Guest", false);
        userRepository38.addUser((com.reservation_system.model.User) researcher44);
        int int46 = userRepository38.getNextID();
        com.reservation_system.repository.UserRepository userRepository48 = new com.reservation_system.repository.UserRepository("data/test-userrepo.csv");
        com.reservation_system.model.Researcher researcher54 = new com.reservation_system.model.Researcher(5, "hi!", "labmanager", "Guest", false);
        userRepository48.addUser((com.reservation_system.model.User) researcher54);
        java.util.List<com.reservation_system.model.User> userList56 = userRepository48.getAllUsers();
        boolean boolean57 = userRepository48.headLabCoordinatorExists();
        boolean boolean59 = userRepository48.emailExists("guest");
        com.reservation_system.repository.UserRepository userRepository61 = new com.reservation_system.repository.UserRepository("data/test-userrepo.csv");
        boolean boolean63 = userRepository61.emailExists("Alice");
        com.reservation_system.repository.UserRepository userRepository65 = new com.reservation_system.repository.UserRepository("data/test-userrepo.csv");
        java.util.List<com.reservation_system.model.User> userList66 = userRepository65.getAllUsers();
        int int67 = userRepository65.getNextID();
        java.util.List<com.reservation_system.model.User> userList68 = userRepository65.getAllUsers();
        userRepository61.saveAllUsers(userList68);
        userRepository48.saveAllUsers(userList68);
        java.util.List<com.reservation_system.model.User> userList71 = userRepository48.getAllUsers();
        userRepository38.saveAllUsers(userList71);
        userRepository30.saveAllUsers(userList71);
        userRepository1.saveAllUsers(userList71);
        java.util.Optional<com.reservation_system.model.User> userOptional76 = userRepository1.findByEmail("headlabcoordinator");
        org.junit.Assert.assertNotNull(userList2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 11 + "'", int3 == 11);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(userOptional8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(userList15);
        org.junit.Assert.assertNotNull(userOptional17);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "Student" + "'", str24, "Student");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "Student" + "'", str25, "Student");
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNotNull(userList31);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 11 + "'", int32 == 11);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 11 + "'", int36 == 11);
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + 11 + "'", int46 == 11);
        org.junit.Assert.assertNotNull(userList56);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + false + "'", boolean59 == false);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + false + "'", boolean63 == false);
        org.junit.Assert.assertNotNull(userList66);
        org.junit.Assert.assertTrue("'" + int67 + "' != '" + 11 + "'", int67 == 11);
        org.junit.Assert.assertNotNull(userList68);
        org.junit.Assert.assertNotNull(userList71);
        org.junit.Assert.assertNotNull(userOptional76);
    }

    @Test
    public void test1032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1032");
        com.reservation_system.model.LabManager labManager5 = new com.reservation_system.model.LabManager(10, "Password1!", "data/test-userrepo.csv", "Guest", true);
        java.lang.String str6 = labManager5.getUserType();
        java.lang.String str7 = labManager5.getPassword();
        java.lang.String str8 = labManager5.getEmail();
        java.lang.String str9 = labManager5.getName();
        java.lang.String str10 = labManager5.getPassword();
        java.lang.String str11 = labManager5.getUserType();
        boolean boolean12 = labManager5.requiresDepartmentApproval();
        java.lang.String str13 = labManager5.getUserType();
        int int14 = labManager5.getID();
        java.lang.String str15 = labManager5.getUserType();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "labmanager" + "'", str6, "labmanager");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Guest" + "'", str7, "Guest");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "data/test-userrepo.csv" + "'", str8, "data/test-userrepo.csv");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Password1!" + "'", str9, "Password1!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Guest" + "'", str10, "Guest");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "labmanager" + "'", str11, "labmanager");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "labmanager" + "'", str13, "labmanager");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 10 + "'", int14 == 10);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "labmanager" + "'", str15, "labmanager");
    }

    @Test
    public void test1033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1033");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("data/test-userrepo.csv");
        int int2 = userRepository1.getNextID();
        boolean boolean3 = userRepository1.headLabCoordinatorExists();
        com.reservation_system.model.Guest guest9 = new com.reservation_system.model.Guest((int) (byte) -1, "hi!", "", "Password1!", false);
        userRepository1.addUser((com.reservation_system.model.User) guest9);
        int int11 = userRepository1.getNextID();
        boolean boolean13 = userRepository1.emailExists("headlabcoordinator");
        java.util.List<com.reservation_system.model.User> userList14 = userRepository1.getAllUsers();
        boolean boolean15 = userRepository1.headLabCoordinatorExists();
        com.reservation_system.model.User user16 = null;
        // The following exception was thrown during execution in test generation
        try {
            userRepository1.addUser(user16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 11 + "'", int2 == 11);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 11 + "'", int11 == 11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(userList14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test1034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1034");
        com.reservation_system.model.HeadLabCoordinator headLabCoordinator5 = new com.reservation_system.model.HeadLabCoordinator((int) (byte) 10, "", "Alice", "guest", true);
        java.lang.String str6 = headLabCoordinator5.getUserType();
        headLabCoordinator5.setApproved(false);
        boolean boolean9 = headLabCoordinator5.isApproved();
        java.lang.String str10 = headLabCoordinator5.getPassword();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "headlabcoordinator" + "'", str6, "headlabcoordinator");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "guest" + "'", str10, "guest");
    }

    @Test
    public void test1035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1035");
        com.reservation_system.model.Student student5 = new com.reservation_system.model.Student((int) (short) 10, "Password1!", "Alice", "Student", true);
        java.lang.String str6 = student5.getPassword();
        java.lang.String str7 = student5.getUserType();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Student" + "'", str6, "Student");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Student" + "'", str7, "Student");
    }

    @Test
    public void test1036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1036");
        com.reservation_system.model.Researcher researcher5 = new com.reservation_system.model.Researcher((int) 'a', "alice@example.com", "data/test-userrepo.csv", "hi!", true);
        int int6 = researcher5.getID();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 97 + "'", int6 == 97);
    }

    @Test
    public void test1037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1037");
        com.reservation_system.model.Student student5 = new com.reservation_system.model.Student(98, "Password1!", "Password1!", "student", false);
        java.lang.String str6 = student5.getPassword();
        java.lang.String str7 = student5.getName();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "student" + "'", str6, "student");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Password1!" + "'", str7, "Password1!");
    }

    @Test
    public void test1038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1038");
        com.reservation_system.model.LabManager labManager5 = new com.reservation_system.model.LabManager((int) (short) -1, "", "Guest", "labmanager", false);
        java.lang.String str6 = labManager5.getUserType();
        java.lang.String str7 = labManager5.getUserType();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "labmanager" + "'", str6, "labmanager");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "labmanager" + "'", str7, "labmanager");
    }

    @Test
    public void test1039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1039");
        com.reservation_system.model.HeadLabCoordinator headLabCoordinator5 = new com.reservation_system.model.HeadLabCoordinator((int) '#', "Alice", "data/test-userrepo.csv", "faculty", false);
        java.lang.String str6 = headLabCoordinator5.getName();
        boolean boolean7 = headLabCoordinator5.isApproved();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Alice" + "'", str6, "Alice");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test1040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1040");
        com.reservation_system.model.Student student5 = new com.reservation_system.model.Student(10, "Alice", "labmanager", "Student", true);
        boolean boolean6 = student5.requiresDepartmentApproval();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test1041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1041");
        com.reservation_system.model.Faculty faculty5 = new com.reservation_system.model.Faculty((int) (short) -1, "Password1!", "faculty", "labmanager", true);
        java.lang.String str6 = faculty5.getUserType();
        boolean boolean7 = faculty5.isApproved();
        java.lang.String str8 = faculty5.getEmail();
        faculty5.setApproved(false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Faculty" + "'", str6, "Faculty");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "faculty" + "'", str8, "faculty");
    }

    @Test
    public void test1042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1042");
        com.reservation_system.model.LabManager labManager5 = new com.reservation_system.model.LabManager(36, "guest", "faculty", "Guest", false);
    }

    @Test
    public void test1043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1043");
        com.reservation_system.model.Guest guest5 = new com.reservation_system.model.Guest(100, "Student", "Researcher", "", false);
    }

    @Test
    public void test1044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1044");
        com.reservation_system.model.Student student5 = new com.reservation_system.model.Student((int) (short) 100, "Researcher", "hi!", "", true);
        boolean boolean6 = student5.isApproved();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test1045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1045");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("data/test-userrepo.csv");
        int int2 = userRepository1.getNextID();
        int int3 = userRepository1.getNextID();
        java.util.List<com.reservation_system.model.User> userList4 = userRepository1.getAllUsers();
        com.reservation_system.model.Guest guest10 = new com.reservation_system.model.Guest(0, "student", "", "alice@example.com", false);
        java.lang.String str11 = guest10.getEmail();
        userRepository1.addUser((com.reservation_system.model.User) guest10);
        java.lang.Class<?> wildcardClass13 = guest10.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 11 + "'", int2 == 11);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 11 + "'", int3 == 11);
        org.junit.Assert.assertNotNull(userList4);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test1046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1046");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("data/test-userrepo.csv");
        boolean boolean3 = userRepository1.emailExists("Password1!");
        boolean boolean5 = userRepository1.emailExists("hi!");
        java.util.List<com.reservation_system.model.User> userList6 = userRepository1.getAllUsers();
        java.util.Optional<com.reservation_system.model.User> userOptional8 = userRepository1.findByEmail("headlabcoordinator");
        boolean boolean10 = userRepository1.emailExists("Password1!");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(userList6);
        org.junit.Assert.assertNotNull(userOptional8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test1047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1047");
        com.reservation_system.model.Guest guest5 = new com.reservation_system.model.Guest((int) (byte) -1, "Faculty", "guest", "researcher", false);
        int int6 = guest5.getID();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
    }

    @Test
    public void test1048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1048");
        com.reservation_system.model.Faculty faculty5 = new com.reservation_system.model.Faculty(52, "Faculty", "Guest", "guest", false);
    }

    @Test
    public void test1049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1049");
        com.reservation_system.model.Researcher researcher5 = new com.reservation_system.model.Researcher((int) (short) 0, "student", "labmanager", "data/test-userrepo.csv", false);
        java.lang.String str6 = researcher5.getUserType();
        java.lang.String str7 = researcher5.getName();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Researcher" + "'", str6, "Researcher");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "student" + "'", str7, "student");
    }

    @Test
    public void test1050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1050");
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
        java.util.List<com.reservation_system.model.User> userList23 = userRepository1.getAllUsers();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "labmanager" + "'", str11, "labmanager");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 98 + "'", int14 == 98);
        org.junit.Assert.assertNotNull(user21);
        org.junit.Assert.assertNotNull(userList23);
    }

    @Test
    public void test1051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1051");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("data/test-userrepo.csv");
        com.reservation_system.model.Researcher researcher7 = new com.reservation_system.model.Researcher(5, "hi!", "labmanager", "Guest", false);
        userRepository1.addUser((com.reservation_system.model.User) researcher7);
        int int9 = userRepository1.getNextID();
        java.util.List<com.reservation_system.model.User> userList10 = userRepository1.getAllUsers();
        com.reservation_system.model.Student student16 = new com.reservation_system.model.Student(98, "Password1!", "Password1!", "student", false);
        java.lang.String str17 = student16.getUserType();
        java.lang.String str18 = student16.getEmail();
        boolean boolean19 = student16.requiresDepartmentApproval();
        userRepository1.addUser((com.reservation_system.model.User) student16);
        java.util.Optional<com.reservation_system.model.User> userOptional22 = userRepository1.findByEmail("headlabcoordinator");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 98 + "'", int9 == 98);
        org.junit.Assert.assertNotNull(userList10);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "Student" + "'", str17, "Student");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Password1!" + "'", str18, "Password1!");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNotNull(userOptional22);
    }

    @Test
    public void test1052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1052");
        com.reservation_system.model.LabManager labManager5 = new com.reservation_system.model.LabManager((int) '#', "researcher", "Guest", "headlabcoordinator", true);
        int int6 = labManager5.getID();
        java.lang.String str7 = labManager5.getUserType();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 35 + "'", int6 == 35);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "labmanager" + "'", str7, "labmanager");
    }

    @Test
    public void test1053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1053");
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
        java.util.Optional<com.reservation_system.model.User> userOptional26 = userRepository1.findByEmail("Student");
        int int27 = userRepository1.getNextID();
        org.junit.Assert.assertNotNull(userList2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 99 + "'", int3 == 99);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(userOptional8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(userList13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 99 + "'", int14 == 99);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(userOptional19);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 99 + "'", int22 == 99);
        org.junit.Assert.assertNotNull(userList23);
        org.junit.Assert.assertNotNull(userOptional26);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 99 + "'", int27 == 99);
    }

    @Test
    public void test1054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1054");
        com.reservation_system.model.LabManager labManager5 = new com.reservation_system.model.LabManager((int) (short) 100, "Faculty", "Researcher", "Alice", false);
        java.lang.String str6 = labManager5.getName();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Faculty" + "'", str6, "Faculty");
    }

    @Test
    public void test1055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1055");
        com.reservation_system.model.Student student5 = new com.reservation_system.model.Student(0, "Guest", "Password1!", "data/test-userrepo.csv", true);
        java.lang.String str6 = student5.getPassword();
        int int7 = student5.getID();
        java.lang.String str8 = student5.getEmail();
        java.lang.String str9 = student5.getUserType();
        boolean boolean10 = student5.isApproved();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "data/test-userrepo.csv" + "'", str6, "data/test-userrepo.csv");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Password1!" + "'", str8, "Password1!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Student" + "'", str9, "Student");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test1056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1056");
        com.reservation_system.model.LabManager labManager5 = new com.reservation_system.model.LabManager(102, "", "student", "", true);
        int int6 = labManager5.getID();
        boolean boolean7 = labManager5.requiresDepartmentApproval();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 102 + "'", int6 == 102);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test1057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1057");
        com.reservation_system.model.LabManager labManager5 = new com.reservation_system.model.LabManager(1, "Faculty", "data/test-userrepo.csv", "researcher", true);
        java.lang.String str6 = labManager5.getUserType();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "labmanager" + "'", str6, "labmanager");
    }

    @Test
    public void test1058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1058");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("data/test-userrepo.csv");
        boolean boolean3 = userRepository1.emailExists("Alice");
        com.reservation_system.model.Researcher researcher9 = new com.reservation_system.model.Researcher((int) 'a', "labmanager", "faculty", "", false);
        boolean boolean10 = researcher9.isApproved();
        java.lang.String str11 = researcher9.getName();
        userRepository1.addUser((com.reservation_system.model.User) researcher9);
        boolean boolean13 = researcher9.requiresDepartmentApproval();
        java.lang.String str14 = researcher9.getName();
        java.lang.String str15 = researcher9.getUserType();
        java.lang.String str16 = researcher9.getUserType();
        java.lang.String str17 = researcher9.getUserType();
        java.lang.String str18 = researcher9.getUserType();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "labmanager" + "'", str11, "labmanager");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "labmanager" + "'", str14, "labmanager");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Researcher" + "'", str15, "Researcher");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Researcher" + "'", str16, "Researcher");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "Researcher" + "'", str17, "Researcher");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Researcher" + "'", str18, "Researcher");
    }

    @Test
    public void test1059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1059");
        com.reservation_system.model.Guest guest5 = new com.reservation_system.model.Guest((int) (short) 10, "alice@example.com", "student", "", true);
        int int6 = guest5.getID();
        java.lang.String str7 = guest5.getUserType();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Guest" + "'", str7, "Guest");
    }

    @Test
    public void test1060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1060");
        com.reservation_system.model.HeadLabCoordinator headLabCoordinator5 = new com.reservation_system.model.HeadLabCoordinator(35, "Password1!", "faculty", "Alice", true);
    }

    @Test
    public void test1061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1061");
        com.reservation_system.model.Student student5 = new com.reservation_system.model.Student(10, "Alice", "labmanager", "Student", true);
        int int6 = student5.getID();
        java.lang.String str7 = student5.getEmail();
        java.lang.String str8 = student5.getUserType();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "labmanager" + "'", str7, "labmanager");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Student" + "'", str8, "Student");
    }

    @Test
    public void test1062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1062");
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
        com.reservation_system.repository.UserRepository userRepository24 = new com.reservation_system.repository.UserRepository("data/test-userrepo.csv");
        java.util.List<com.reservation_system.model.User> userList25 = userRepository24.getAllUsers();
        int int26 = userRepository24.getNextID();
        boolean boolean28 = userRepository24.emailExists("headlabcoordinator");
        boolean boolean29 = userRepository24.headLabCoordinatorExists();
        java.util.Optional<com.reservation_system.model.User> userOptional31 = userRepository24.findByEmail("Alice");
        boolean boolean33 = userRepository24.emailExists("Alice");
        boolean boolean35 = userRepository24.emailExists("Guest");
        com.reservation_system.repository.UserRepository userRepository37 = new com.reservation_system.repository.UserRepository("data/test-userrepo.csv");
        boolean boolean39 = userRepository37.emailExists("Alice");
        com.reservation_system.model.Researcher researcher45 = new com.reservation_system.model.Researcher((int) 'a', "labmanager", "faculty", "", false);
        boolean boolean46 = researcher45.isApproved();
        java.lang.String str47 = researcher45.getName();
        userRepository37.addUser((com.reservation_system.model.User) researcher45);
        java.util.List<com.reservation_system.model.User> userList49 = userRepository37.getAllUsers();
        userRepository24.saveAllUsers(userList49);
        userRepository1.saveAllUsers(userList49);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Faculty" + "'", str8, "Faculty");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Faculty" + "'", str9, "Faculty");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(userList17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 99 + "'", int18 == 99);
        org.junit.Assert.assertNotNull(userList19);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(userList25);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 99 + "'", int26 == 99);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(userOptional31);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertEquals("'" + str47 + "' != '" + "labmanager" + "'", str47, "labmanager");
        org.junit.Assert.assertNotNull(userList49);
    }

    @Test
    public void test1063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1063");
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
        researcher24.setApproved(false);
        org.junit.Assert.assertNotNull(userList2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 99 + "'", int3 == 99);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(userOptional8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(userList15);
        org.junit.Assert.assertNotNull(userList16);
        org.junit.Assert.assertNotNull(userOptional18);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "labmanager" + "'", str26, "labmanager");
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "Researcher" + "'", str28, "Researcher");
    }

    @Test
    public void test1064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1064");
        com.reservation_system.model.Student student5 = new com.reservation_system.model.Student((int) '4', "", "headlabcoordinator", "student", true);
        boolean boolean6 = student5.isApproved();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test1065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1065");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("data/test-userrepo.csv");
        boolean boolean3 = userRepository1.emailExists("Password1!");
        com.reservation_system.model.Researcher researcher9 = new com.reservation_system.model.Researcher(5, "", "Alice", "researcher", false);
        boolean boolean10 = researcher9.requiresDepartmentApproval();
        userRepository1.addUser((com.reservation_system.model.User) researcher9);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test1066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1066");
        com.reservation_system.model.HeadLabCoordinator headLabCoordinator5 = new com.reservation_system.model.HeadLabCoordinator((int) (short) -1, "data/test-userrepo.csv", "guest", "labmanager", true);
        java.lang.String str6 = headLabCoordinator5.getUserType();
        java.lang.String str7 = headLabCoordinator5.getUserType();
        java.lang.String str8 = headLabCoordinator5.getEmail();
        headLabCoordinator5.setApproved(false);
        java.lang.String str11 = headLabCoordinator5.getUserType();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "headlabcoordinator" + "'", str6, "headlabcoordinator");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "headlabcoordinator" + "'", str7, "headlabcoordinator");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "guest" + "'", str8, "guest");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "headlabcoordinator" + "'", str11, "headlabcoordinator");
    }

    @Test
    public void test1067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1067");
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
        java.util.List<com.reservation_system.model.User> userList45 = userRepository1.getAllUsers();
        java.util.Optional<com.reservation_system.model.User> userOptional47 = userRepository1.findByEmail("Guest");
        boolean boolean49 = userRepository1.emailExists("Researcher");
        org.junit.Assert.assertNotNull(userList9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(userList21);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 99 + "'", int32 == 99);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertNotNull(userList39);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 99 + "'", int40 == 99);
        org.junit.Assert.assertNotNull(userList41);
        org.junit.Assert.assertNotNull(userList45);
        org.junit.Assert.assertNotNull(userOptional47);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + true + "'", boolean49 == true);
    }

    @Test
    public void test1068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1068");
        com.reservation_system.model.Researcher researcher5 = new com.reservation_system.model.Researcher(1, "Guest", "headlabcoordinator", "alice@example.com", false);
    }

    @Test
    public void test1069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1069");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("data/test-userrepo.csv");
        java.util.List<com.reservation_system.model.User> userList2 = userRepository1.getAllUsers();
        int int3 = userRepository1.getNextID();
        boolean boolean5 = userRepository1.emailExists("headlabcoordinator");
        boolean boolean6 = userRepository1.headLabCoordinatorExists();
        java.util.Optional<com.reservation_system.model.User> userOptional8 = userRepository1.findByEmail("Alice");
        java.util.Optional<com.reservation_system.model.User> userOptional10 = userRepository1.findByEmail("Student");
        java.util.List<com.reservation_system.model.User> userList11 = userRepository1.getAllUsers();
        boolean boolean12 = userRepository1.headLabCoordinatorExists();
        org.junit.Assert.assertNotNull(userList2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 99 + "'", int3 == 99);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(userOptional8);
        org.junit.Assert.assertNotNull(userOptional10);
        org.junit.Assert.assertNotNull(userList11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test1070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1070");
        com.reservation_system.model.Researcher researcher5 = new com.reservation_system.model.Researcher(52, "Faculty", "Guest", "Student", true);
        researcher5.setApproved(false);
    }

    @Test
    public void test1071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1071");
        com.reservation_system.model.Researcher researcher5 = new com.reservation_system.model.Researcher((int) 'a', "labmanager", "faculty", "", false);
        boolean boolean6 = researcher5.isApproved();
        java.lang.String str7 = researcher5.getName();
        researcher5.setApproved(true);
        boolean boolean10 = researcher5.requiresDepartmentApproval();
        java.lang.String str11 = researcher5.getUserType();
        java.lang.String str12 = researcher5.getEmail();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "labmanager" + "'", str7, "labmanager");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Researcher" + "'", str11, "Researcher");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "faculty" + "'", str12, "faculty");
    }

    @Test
    public void test1072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1072");
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
        java.util.Optional<com.reservation_system.model.User> userOptional30 = userRepository1.findByEmail("");
        com.reservation_system.repository.UserRepository userRepository32 = new com.reservation_system.repository.UserRepository("data/test-userrepo.csv");
        com.reservation_system.model.Researcher researcher38 = new com.reservation_system.model.Researcher(5, "hi!", "labmanager", "Guest", false);
        userRepository32.addUser((com.reservation_system.model.User) researcher38);
        java.util.List<com.reservation_system.model.User> userList40 = userRepository32.getAllUsers();
        com.reservation_system.repository.UserRepository userRepository42 = new com.reservation_system.repository.UserRepository("data/test-userrepo.csv");
        com.reservation_system.model.Researcher researcher48 = new com.reservation_system.model.Researcher(5, "hi!", "labmanager", "Guest", false);
        userRepository42.addUser((com.reservation_system.model.User) researcher48);
        java.util.Optional<com.reservation_system.model.User> userOptional51 = userRepository42.findByEmail("alice@example.com");
        java.util.List<com.reservation_system.model.User> userList52 = userRepository42.getAllUsers();
        userRepository32.saveAllUsers(userList52);
        com.reservation_system.model.Student student59 = new com.reservation_system.model.Student((int) (short) 100, "guest", "Guest", "faculty", false);
        userRepository32.addUser((com.reservation_system.model.User) student59);
        com.reservation_system.repository.UserRepository userRepository62 = new com.reservation_system.repository.UserRepository("data/test-userrepo.csv");
        int int63 = userRepository62.getNextID();
        int int64 = userRepository62.getNextID();
        java.util.List<com.reservation_system.model.User> userList65 = userRepository62.getAllUsers();
        userRepository32.saveAllUsers(userList65);
        userRepository1.saveAllUsers(userList65);
        com.reservation_system.repository.UserRepository userRepository69 = new com.reservation_system.repository.UserRepository("data/test-userrepo.csv");
        com.reservation_system.model.Researcher researcher75 = new com.reservation_system.model.Researcher(5, "hi!", "labmanager", "Guest", false);
        userRepository69.addUser((com.reservation_system.model.User) researcher75);
        int int77 = userRepository69.getNextID();
        java.util.Optional<com.reservation_system.model.User> userOptional79 = userRepository69.findByEmail("headlabcoordinator");
        int int80 = userRepository69.getNextID();
        java.util.Optional<com.reservation_system.model.User> userOptional82 = userRepository69.findByEmail("Faculty");
        com.reservation_system.repository.UserRepository userRepository84 = new com.reservation_system.repository.UserRepository("data/test-userrepo.csv");
        java.util.List<com.reservation_system.model.User> userList85 = userRepository84.getAllUsers();
        userRepository69.saveAllUsers(userList85);
        userRepository1.saveAllUsers(userList85);
        org.junit.Assert.assertNotNull(userList2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 99 + "'", int3 == 99);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(userOptional8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(userList15);
        org.junit.Assert.assertNotNull(userOptional17);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "Student" + "'", str24, "Student");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "Student" + "'", str25, "Student");
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertNotNull(userOptional30);
        org.junit.Assert.assertNotNull(userList40);
        org.junit.Assert.assertNotNull(userOptional51);
        org.junit.Assert.assertNotNull(userList52);
        org.junit.Assert.assertTrue("'" + int63 + "' != '" + 101 + "'", int63 == 101);
        org.junit.Assert.assertTrue("'" + int64 + "' != '" + 101 + "'", int64 == 101);
        org.junit.Assert.assertNotNull(userList65);
        org.junit.Assert.assertTrue("'" + int77 + "' != '" + 101 + "'", int77 == 101);
        org.junit.Assert.assertNotNull(userOptional79);
        org.junit.Assert.assertTrue("'" + int80 + "' != '" + 101 + "'", int80 == 101);
        org.junit.Assert.assertNotNull(userOptional82);
        org.junit.Assert.assertNotNull(userList85);
    }

    @Test
    public void test1073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1073");
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
        boolean boolean30 = userRepository1.headLabCoordinatorExists();
        int int31 = userRepository1.getNextID();
        org.junit.Assert.assertNotNull(userList9);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 101 + "'", int20 == 101);
        org.junit.Assert.assertNotNull(userList23);
        org.junit.Assert.assertNotNull(userOptional26);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 101 + "'", int27 == 101);
        org.junit.Assert.assertNotNull(userOptional29);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 101 + "'", int31 == 101);
    }

    @Test
    public void test1074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1074");
        com.reservation_system.model.Student student5 = new com.reservation_system.model.Student(0, "Researcher", "Guest", "labmanager", true);
    }

    @Test
    public void test1075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1075");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("data/test-userrepo.csv");
        int int2 = userRepository1.getNextID();
        int int3 = userRepository1.getNextID();
        com.reservation_system.model.HeadLabCoordinator headLabCoordinator9 = new com.reservation_system.model.HeadLabCoordinator((int) (byte) 1, "", "", "guest", false);
        userRepository1.addUser((com.reservation_system.model.User) headLabCoordinator9);
        java.lang.String str11 = headLabCoordinator9.getEmail();
        java.lang.String str12 = headLabCoordinator9.getUserType();
        java.lang.String str13 = headLabCoordinator9.getUserType();
        headLabCoordinator9.setApproved(true);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 101 + "'", int2 == 101);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 101 + "'", int3 == 101);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "headlabcoordinator" + "'", str12, "headlabcoordinator");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "headlabcoordinator" + "'", str13, "headlabcoordinator");
    }

    @Test
    public void test1076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1076");
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
        boolean boolean58 = userRepository1.headLabCoordinatorExists();
        java.util.List<com.reservation_system.model.User> userList59 = userRepository1.getAllUsers();
        java.util.List<com.reservation_system.model.User> userList60 = null;
        // The following exception was thrown during execution in test generation
        try {
            userRepository1.saveAllUsers(userList60);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(userOptional10);
        org.junit.Assert.assertNotNull(userList11);
        org.junit.Assert.assertNotNull(userList21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertNotNull(userList33);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + true + "'", boolean43 == true);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 101 + "'", int44 == 101);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + true + "'", boolean48 == true);
        org.junit.Assert.assertNotNull(userList51);
        org.junit.Assert.assertTrue("'" + int52 + "' != '" + 101 + "'", int52 == 101);
        org.junit.Assert.assertNotNull(userList53);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + true + "'", boolean58 == true);
        org.junit.Assert.assertNotNull(userList59);
    }

    @Test
    public void test1077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1077");
        com.reservation_system.model.Student student5 = new com.reservation_system.model.Student(1, "data/test-userrepo.csv", "alice@example.com", "guest", false);
        java.lang.String str6 = student5.getUserType();
        java.lang.String str7 = student5.getUserType();
        java.lang.String str8 = student5.getUserType();
        java.lang.String str9 = student5.getUserType();
        java.lang.String str10 = student5.getUserType();
        java.lang.String str11 = student5.getPassword();
        int int12 = student5.getID();
        int int13 = student5.getID();
        java.lang.String str14 = student5.getUserType();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Student" + "'", str6, "Student");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Student" + "'", str7, "Student");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Student" + "'", str8, "Student");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Student" + "'", str9, "Student");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Student" + "'", str10, "Student");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "guest" + "'", str11, "guest");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Student" + "'", str14, "Student");
    }

    @Test
    public void test1078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1078");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("data/test-userrepo.csv");
        boolean boolean3 = userRepository1.emailExists("Alice");
        com.reservation_system.model.Researcher researcher9 = new com.reservation_system.model.Researcher((int) 'a', "labmanager", "faculty", "", false);
        boolean boolean10 = researcher9.isApproved();
        java.lang.String str11 = researcher9.getName();
        userRepository1.addUser((com.reservation_system.model.User) researcher9);
        boolean boolean14 = userRepository1.emailExists("Alice");
        boolean boolean16 = userRepository1.emailExists("labmanager");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "labmanager" + "'", str11, "labmanager");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test1079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1079");
        com.reservation_system.model.HeadLabCoordinator headLabCoordinator5 = new com.reservation_system.model.HeadLabCoordinator((int) (byte) -1, "Guest", "student", "alice@example.com", true);
        java.lang.String str6 = headLabCoordinator5.getEmail();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "student" + "'", str6, "student");
    }

    @Test
    public void test1080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1080");
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
        com.reservation_system.model.User user44 = com.reservation_system.patterns.factory.UserFactory.createUser("labmanager", 101, "hi!", "faculty", "", false);
        userRepository1.addUser(user44);
        int int46 = userRepository1.getNextID();
        org.junit.Assert.assertNotNull(userList2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 98 + "'", int3 == 98);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(userOptional8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(userList15);
        org.junit.Assert.assertNotNull(userOptional17);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "Student" + "'", str24, "Student");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "Student" + "'", str25, "Student");
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNotNull(user44);
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + 102 + "'", int46 == 102);
    }

    @Test
    public void test1081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1081");
        com.reservation_system.model.Researcher researcher5 = new com.reservation_system.model.Researcher((int) 'a', "Password1!", "hi!", "Alice", false);
        boolean boolean6 = researcher5.isApproved();
        boolean boolean7 = researcher5.isApproved();
        java.lang.String str8 = researcher5.getName();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Password1!" + "'", str8, "Password1!");
    }

    @Test
    public void test1082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1082");
        com.reservation_system.model.HeadLabCoordinator headLabCoordinator5 = new com.reservation_system.model.HeadLabCoordinator((int) (byte) 0, "Faculty", "headlabcoordinator", "guest", true);
        boolean boolean6 = headLabCoordinator5.requiresDepartmentApproval();
        java.lang.String str7 = headLabCoordinator5.getUserType();
        java.lang.String str8 = headLabCoordinator5.getUserType();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "headlabcoordinator" + "'", str7, "headlabcoordinator");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "headlabcoordinator" + "'", str8, "headlabcoordinator");
    }

    @Test
    public void test1083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1083");
        com.reservation_system.model.Student student5 = new com.reservation_system.model.Student(1, "Researcher", "alice@example.com", "student", false);
        boolean boolean6 = student5.isApproved();
        java.lang.String str7 = student5.getUserType();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Student" + "'", str7, "Student");
    }

    @Test
    public void test1084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1084");
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
        java.lang.String str38 = researcher36.getEmail();
        org.junit.Assert.assertNotNull(userList2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 102 + "'", int3 == 102);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(userOptional8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
// flaky "6) test1084(com.reservation_system.randoop.userrepository.RegressionTest2)":         org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(userList15);
        org.junit.Assert.assertNotNull(userOptional17);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "Student" + "'", str24, "Student");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "Student" + "'", str25, "Student");
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "" + "'", str38, "");
    }

    @Test
    public void test1085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1085");
        com.reservation_system.model.Researcher researcher5 = new com.reservation_system.model.Researcher((int) (short) -1, "labmanager", "Alice", "faculty", false);
    }

    @Test
    public void test1086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1086");
        com.reservation_system.model.Guest guest5 = new com.reservation_system.model.Guest((int) (byte) 100, "guest", "Faculty", "student", false);
        java.lang.String str6 = guest5.getPassword();
        boolean boolean7 = guest5.requiresDepartmentApproval();
        guest5.setApproved(false);
        guest5.setApproved(true);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "student" + "'", str6, "student");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test1087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1087");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("data/test-userrepo.csv");
        int int2 = userRepository1.getNextID();
        int int3 = userRepository1.getNextID();
        com.reservation_system.model.HeadLabCoordinator headLabCoordinator9 = new com.reservation_system.model.HeadLabCoordinator((int) (byte) 1, "", "", "guest", false);
        userRepository1.addUser((com.reservation_system.model.User) headLabCoordinator9);
        java.util.List<com.reservation_system.model.User> userList11 = userRepository1.getAllUsers();
        boolean boolean13 = userRepository1.emailExists("Faculty");
        com.reservation_system.model.LabManager labManager19 = new com.reservation_system.model.LabManager(10, "hi!", "Researcher", "alice@example.com", false);
        java.lang.String str20 = labManager19.getPassword();
        userRepository1.addUser((com.reservation_system.model.User) labManager19);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 102 + "'", int2 == 102);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 102 + "'", int3 == 102);
        org.junit.Assert.assertNotNull(userList11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test1088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1088");
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
        java.util.List<com.reservation_system.model.User> userList57 = userRepository1.getAllUsers();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 102 + "'", int2 == 102);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "labmanager" + "'", str15, "labmanager");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNotNull(userList18);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 102 + "'", int22 == 102);
        org.junit.Assert.assertNotNull(userList32);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 102 + "'", int43 == 102);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertNotNull(userList50);
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + 102 + "'", int51 == 102);
        org.junit.Assert.assertNotNull(userList52);
        org.junit.Assert.assertNotNull(userList57);
    }

    @Test
    public void test1089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1089");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("data/test-userrepo.csv");
        java.util.List<com.reservation_system.model.User> userList2 = userRepository1.getAllUsers();
        int int3 = userRepository1.getNextID();
        boolean boolean5 = userRepository1.emailExists("headlabcoordinator");
        boolean boolean6 = userRepository1.headLabCoordinatorExists();
        java.util.Optional<com.reservation_system.model.User> userOptional8 = userRepository1.findByEmail("Alice");
        com.reservation_system.repository.UserRepository userRepository10 = new com.reservation_system.repository.UserRepository("data/test-userrepo.csv");
        int int11 = userRepository10.getNextID();
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
        userRepository10.saveAllUsers(userList41);
        java.util.List<com.reservation_system.model.User> userList45 = userRepository10.getAllUsers();
        java.util.List<com.reservation_system.model.User> userList46 = userRepository10.getAllUsers();
        userRepository1.saveAllUsers(userList46);
        boolean boolean49 = userRepository1.emailExists("student");
        org.junit.Assert.assertNotNull(userList2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 102 + "'", int3 == 102);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(userOptional8);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 102 + "'", int11 == 102);
        org.junit.Assert.assertNotNull(userList21);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 102 + "'", int32 == 102);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertNotNull(userList39);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 102 + "'", int40 == 102);
        org.junit.Assert.assertNotNull(userList41);
        org.junit.Assert.assertNotNull(userList45);
        org.junit.Assert.assertNotNull(userList46);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
    }

    @Test
    public void test1090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1090");
        com.reservation_system.model.User user6 = com.reservation_system.patterns.factory.UserFactory.createUser("Guest", 1, "researcher", "alice@example.com", "Student", false);
        org.junit.Assert.assertNotNull(user6);
    }

    @Test
    public void test1091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1091");
        com.reservation_system.model.User user6 = com.reservation_system.patterns.factory.UserFactory.createUser("Guest", (int) (byte) -1, "Student", "headlabcoordinator", "faculty", false);
        org.junit.Assert.assertNotNull(user6);
    }

    @Test
    public void test1092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1092");
        com.reservation_system.model.Faculty faculty5 = new com.reservation_system.model.Faculty((-1), "headlabcoordinator", "Student", "", false);
        java.lang.String str6 = faculty5.getEmail();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Student" + "'", str6, "Student");
    }

    @Test
    public void test1093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1093");
        com.reservation_system.model.HeadLabCoordinator headLabCoordinator5 = new com.reservation_system.model.HeadLabCoordinator(5, "Student", "Faculty", "Alice", true);
        headLabCoordinator5.setApproved(false);
    }

    @Test
    public void test1094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1094");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("data/test-userrepo.csv");
        com.reservation_system.model.Researcher researcher7 = new com.reservation_system.model.Researcher(5, "hi!", "labmanager", "Guest", false);
        userRepository1.addUser((com.reservation_system.model.User) researcher7);
        com.reservation_system.repository.UserRepository userRepository10 = new com.reservation_system.repository.UserRepository("data/test-userrepo.csv");
        com.reservation_system.model.Researcher researcher16 = new com.reservation_system.model.Researcher(5, "hi!", "labmanager", "Guest", false);
        userRepository10.addUser((com.reservation_system.model.User) researcher16);
        int int18 = userRepository10.getNextID();
        java.util.List<com.reservation_system.model.User> userList19 = userRepository10.getAllUsers();
        userRepository1.saveAllUsers(userList19);
        int int21 = userRepository1.getNextID();
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 102 + "'", int18 == 102);
        org.junit.Assert.assertNotNull(userList19);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 102 + "'", int21 == 102);
    }

    @Test
    public void test1095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1095");
        com.reservation_system.model.Faculty faculty5 = new com.reservation_system.model.Faculty(5, "researcher", "guest", "faculty", true);
        java.lang.String str6 = faculty5.getUserType();
        java.lang.String str7 = faculty5.getUserType();
        java.lang.String str8 = faculty5.getPassword();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Faculty" + "'", str6, "Faculty");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Faculty" + "'", str7, "Faculty");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "faculty" + "'", str8, "faculty");
    }

    @Test
    public void test1096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1096");
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
        boolean boolean17 = userRepository1.emailExists("Alice");
        java.util.Optional<com.reservation_system.model.User> userOptional19 = userRepository1.findByEmail("hi!");
        java.util.Optional<com.reservation_system.model.User> userOptional21 = userRepository1.findByEmail("Password1!");
        org.junit.Assert.assertNotNull(userList2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 102 + "'", int3 == 102);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(userOptional8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
// flaky "7) test1096(com.reservation_system.randoop.userrepository.RegressionTest2)":         org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(userList15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(userOptional19);
        org.junit.Assert.assertNotNull(userOptional21);
    }

    @Test
    public void test1097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1097");
        com.reservation_system.model.HeadLabCoordinator headLabCoordinator5 = new com.reservation_system.model.HeadLabCoordinator(35, "hi!", "Student", "Student", true);
    }

    @Test
    public void test1098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1098");
        com.reservation_system.model.HeadLabCoordinator headLabCoordinator5 = new com.reservation_system.model.HeadLabCoordinator(100, "Password1!", "researcher", "Password1!", true);
        java.lang.String str6 = headLabCoordinator5.getEmail();
        java.lang.String str7 = headLabCoordinator5.getName();
        java.lang.String str8 = headLabCoordinator5.getUserType();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "researcher" + "'", str6, "researcher");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Password1!" + "'", str7, "Password1!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "headlabcoordinator" + "'", str8, "headlabcoordinator");
    }

    @Test
    public void test1099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1099");
        com.reservation_system.model.LabManager labManager5 = new com.reservation_system.model.LabManager((int) (short) -1, "researcher", "Guest", "Researcher", false);
        java.lang.String str6 = labManager5.getUserType();
        java.lang.String str7 = labManager5.getUserType();
        java.lang.String str8 = labManager5.getEmail();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "labmanager" + "'", str6, "labmanager");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "labmanager" + "'", str7, "labmanager");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Guest" + "'", str8, "Guest");
    }

    @Test
    public void test1100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1100");
        com.reservation_system.model.Student student5 = new com.reservation_system.model.Student(1, "data/test-userrepo.csv", "alice@example.com", "guest", false);
        java.lang.String str6 = student5.getUserType();
        java.lang.String str7 = student5.getUserType();
        java.lang.String str8 = student5.getUserType();
        boolean boolean9 = student5.isApproved();
        java.lang.String str10 = student5.getName();
        java.lang.String str11 = student5.getUserType();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Student" + "'", str6, "Student");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Student" + "'", str7, "Student");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Student" + "'", str8, "Student");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "data/test-userrepo.csv" + "'", str10, "data/test-userrepo.csv");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Student" + "'", str11, "Student");
    }

    @Test
    public void test1101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1101");
        com.reservation_system.model.Faculty faculty5 = new com.reservation_system.model.Faculty(100, "researcher", "student", "Student", false);
        boolean boolean6 = faculty5.isApproved();
        int int7 = faculty5.getID();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 100 + "'", int7 == 100);
    }

    @Test
    public void test1102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1102");
        com.reservation_system.model.Student student5 = new com.reservation_system.model.Student((int) (byte) 0, "guest", "Student", "headlabcoordinator", false);
        java.lang.String str6 = student5.getPassword();
        java.lang.String str7 = student5.getUserType();
        student5.setApproved(false);
        java.lang.String str10 = student5.getUserType();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "headlabcoordinator" + "'", str6, "headlabcoordinator");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Student" + "'", str7, "Student");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Student" + "'", str10, "Student");
    }

    @Test
    public void test1103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1103");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("data/test-userrepo.csv");
        java.util.List<com.reservation_system.model.User> userList2 = userRepository1.getAllUsers();
        int int3 = userRepository1.getNextID();
        boolean boolean5 = userRepository1.emailExists("headlabcoordinator");
        boolean boolean6 = userRepository1.headLabCoordinatorExists();
        java.util.Optional<com.reservation_system.model.User> userOptional8 = userRepository1.findByEmail("Alice");
        boolean boolean10 = userRepository1.emailExists("guest");
        java.util.List<com.reservation_system.model.User> userList11 = userRepository1.getAllUsers();
        java.util.Optional<com.reservation_system.model.User> userOptional13 = userRepository1.findByEmail("Guest");
        boolean boolean14 = userRepository1.headLabCoordinatorExists();
        com.reservation_system.repository.UserRepository userRepository16 = new com.reservation_system.repository.UserRepository("data/test-userrepo.csv");
        com.reservation_system.model.Researcher researcher22 = new com.reservation_system.model.Researcher(5, "hi!", "labmanager", "Guest", false);
        userRepository16.addUser((com.reservation_system.model.User) researcher22);
        int int24 = userRepository16.getNextID();
        int int25 = userRepository16.getNextID();
        int int26 = userRepository16.getNextID();
        java.util.List<com.reservation_system.model.User> userList27 = userRepository16.getAllUsers();
        com.reservation_system.repository.UserRepository userRepository29 = new com.reservation_system.repository.UserRepository("data/test-userrepo.csv");
        int int30 = userRepository29.getNextID();
        boolean boolean31 = userRepository29.headLabCoordinatorExists();
        com.reservation_system.model.Guest guest37 = new com.reservation_system.model.Guest((int) (byte) -1, "hi!", "", "Password1!", false);
        userRepository29.addUser((com.reservation_system.model.User) guest37);
        int int39 = userRepository29.getNextID();
        boolean boolean41 = userRepository29.emailExists("headlabcoordinator");
        java.util.List<com.reservation_system.model.User> userList42 = userRepository29.getAllUsers();
        int int43 = userRepository29.getNextID();
        java.util.List<com.reservation_system.model.User> userList44 = userRepository29.getAllUsers();
        userRepository16.saveAllUsers(userList44);
        userRepository1.saveAllUsers(userList44);
        org.junit.Assert.assertNotNull(userList2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 102 + "'", int3 == 102);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(userOptional8);
// flaky "8) test1103(com.reservation_system.randoop.userrepository.RegressionTest2)":         org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(userList11);
        org.junit.Assert.assertNotNull(userOptional13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 102 + "'", int24 == 102);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 102 + "'", int25 == 102);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 102 + "'", int26 == 102);
        org.junit.Assert.assertNotNull(userList27);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 102 + "'", int30 == 102);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 102 + "'", int39 == 102);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertNotNull(userList42);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 102 + "'", int43 == 102);
        org.junit.Assert.assertNotNull(userList44);
    }

    @Test
    public void test1104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1104");
        com.reservation_system.model.User user6 = com.reservation_system.patterns.factory.UserFactory.createUser("faculty", 6, "alice@example.com", "faculty", "faculty", true);
        java.lang.Class<?> wildcardClass7 = user6.getClass();
        org.junit.Assert.assertNotNull(user6);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test1105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1105");
        com.reservation_system.model.Student student5 = new com.reservation_system.model.Student(0, "headlabcoordinator", "Password1!", "Student", true);
    }

    @Test
    public void test1106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1106");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("data/test-userrepo.csv");
        int int2 = userRepository1.getNextID();
        boolean boolean3 = userRepository1.headLabCoordinatorExists();
        com.reservation_system.model.Guest guest9 = new com.reservation_system.model.Guest((int) (byte) -1, "hi!", "", "Password1!", false);
        userRepository1.addUser((com.reservation_system.model.User) guest9);
        int int11 = userRepository1.getNextID();
        boolean boolean13 = userRepository1.emailExists("headlabcoordinator");
        boolean boolean14 = userRepository1.headLabCoordinatorExists();
        int int15 = userRepository1.getNextID();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 102 + "'", int2 == 102);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 102 + "'", int11 == 102);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 102 + "'", int15 == 102);
    }

    @Test
    public void test1107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1107");
        com.reservation_system.model.Guest guest5 = new com.reservation_system.model.Guest(11, "alice@example.com", "headlabcoordinator", "student", true);
    }

    @Test
    public void test1108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1108");
        com.reservation_system.model.HeadLabCoordinator headLabCoordinator5 = new com.reservation_system.model.HeadLabCoordinator((int) (byte) 1, "student", "Password1!", "alice@example.com", true);
        java.lang.String str6 = headLabCoordinator5.getUserType();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "headlabcoordinator" + "'", str6, "headlabcoordinator");
    }

    @Test
    public void test1109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1109");
        com.reservation_system.model.LabManager labManager5 = new com.reservation_system.model.LabManager((int) (short) 0, "Alice", "alice@example.com", "alice@example.com", true);
    }

    @Test
    public void test1110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1110");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("data/test-userrepo.csv");
        com.reservation_system.model.Researcher researcher7 = new com.reservation_system.model.Researcher(5, "hi!", "labmanager", "Guest", false);
        userRepository1.addUser((com.reservation_system.model.User) researcher7);
        int int9 = userRepository1.getNextID();
        boolean boolean11 = userRepository1.emailExists("Researcher");
        boolean boolean12 = userRepository1.headLabCoordinatorExists();
        com.reservation_system.model.Faculty faculty18 = new com.reservation_system.model.Faculty(10, "", "alice@example.com", "Password1!", false);
        java.lang.String str19 = faculty18.getUserType();
        java.lang.String str20 = faculty18.getUserType();
        userRepository1.addUser((com.reservation_system.model.User) faculty18);
        java.util.Optional<com.reservation_system.model.User> userOptional23 = userRepository1.findByEmail("");
        int int24 = userRepository1.getNextID();
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 102 + "'", int9 == 102);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "Faculty" + "'", str19, "Faculty");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "Faculty" + "'", str20, "Faculty");
        org.junit.Assert.assertNotNull(userOptional23);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 102 + "'", int24 == 102);
    }

    @Test
    public void test1111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1111");
        com.reservation_system.model.HeadLabCoordinator headLabCoordinator5 = new com.reservation_system.model.HeadLabCoordinator(97, "researcher", "faculty", "data/test-userrepo.csv", false);
    }

    @Test
    public void test1112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1112");
        com.reservation_system.model.HeadLabCoordinator headLabCoordinator5 = new com.reservation_system.model.HeadLabCoordinator((int) (short) 100, "Faculty", "", "student", true);
    }

    @Test
    public void test1113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1113");
        com.reservation_system.model.Student student5 = new com.reservation_system.model.Student(1, "data/test-userrepo.csv", "alice@example.com", "guest", false);
        java.lang.String str6 = student5.getUserType();
        java.lang.String str7 = student5.getUserType();
        java.lang.String str8 = student5.getName();
        boolean boolean9 = student5.requiresDepartmentApproval();
        java.lang.String str10 = student5.getUserType();
        java.lang.String str11 = student5.getName();
        java.lang.String str12 = student5.getUserType();
        java.lang.String str13 = student5.getUserType();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Student" + "'", str6, "Student");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Student" + "'", str7, "Student");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "data/test-userrepo.csv" + "'", str8, "data/test-userrepo.csv");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Student" + "'", str10, "Student");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "data/test-userrepo.csv" + "'", str11, "data/test-userrepo.csv");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Student" + "'", str12, "Student");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Student" + "'", str13, "Student");
    }

    @Test
    public void test1114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1114");
        com.reservation_system.model.Researcher researcher5 = new com.reservation_system.model.Researcher(6, "labmanager", "Alice", "Alice", false);
        java.lang.String str6 = researcher5.getPassword();
        java.lang.String str7 = researcher5.getName();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Alice" + "'", str6, "Alice");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "labmanager" + "'", str7, "labmanager");
    }

    @Test
    public void test1115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1115");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("data/test-userrepo.csv");
        boolean boolean3 = userRepository1.emailExists("Alice");
        java.util.List<com.reservation_system.model.User> userList4 = userRepository1.getAllUsers();
        int int5 = userRepository1.getNextID();
        boolean boolean6 = userRepository1.headLabCoordinatorExists();
        int int7 = userRepository1.getNextID();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(userList4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 102 + "'", int5 == 102);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 102 + "'", int7 == 102);
    }

    @Test
    public void test1116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1116");
        com.reservation_system.model.Student student5 = new com.reservation_system.model.Student((int) (byte) 0, "Researcher", "headlabcoordinator", "faculty", false);
        java.lang.String str6 = student5.getPassword();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "faculty" + "'", str6, "faculty");
    }

    @Test
    public void test1117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1117");
        com.reservation_system.model.Faculty faculty5 = new com.reservation_system.model.Faculty(5, "researcher", "guest", "faculty", true);
        java.lang.String str6 = faculty5.getPassword();
        java.lang.String str7 = faculty5.getUserType();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "faculty" + "'", str6, "faculty");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Faculty" + "'", str7, "Faculty");
    }

    @Test
    public void test1118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1118");
        com.reservation_system.model.Guest guest5 = new com.reservation_system.model.Guest((int) '4', "Researcher", "faculty", "labmanager", true);
        boolean boolean6 = guest5.isApproved();
        java.lang.String str7 = guest5.getUserType();
        java.lang.String str8 = guest5.getUserType();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Guest" + "'", str7, "Guest");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Guest" + "'", str8, "Guest");
    }

    @Test
    public void test1119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1119");
        com.reservation_system.model.Guest guest5 = new com.reservation_system.model.Guest((int) (short) 10, "researcher", "", "", false);
    }

    @Test
    public void test1120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1120");
        com.reservation_system.model.Guest guest5 = new com.reservation_system.model.Guest(5, "guest", "data/test-userrepo.csv", "Faculty", false);
        java.lang.String str6 = guest5.getEmail();
        java.lang.Class<?> wildcardClass7 = guest5.getClass();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "data/test-userrepo.csv" + "'", str6, "data/test-userrepo.csv");
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test1121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1121");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("data/test-userrepo.csv");
        int int2 = userRepository1.getNextID();
        boolean boolean3 = userRepository1.headLabCoordinatorExists();
        com.reservation_system.model.Guest guest9 = new com.reservation_system.model.Guest((int) (byte) -1, "hi!", "", "Password1!", false);
        userRepository1.addUser((com.reservation_system.model.User) guest9);
        java.util.Optional<com.reservation_system.model.User> userOptional12 = userRepository1.findByEmail("Faculty");
        boolean boolean14 = userRepository1.emailExists("hi!");
        boolean boolean16 = userRepository1.emailExists("Password1!");
        java.util.List<com.reservation_system.model.User> userList17 = userRepository1.getAllUsers();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 102 + "'", int2 == 102);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(userOptional12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(userList17);
    }

    @Test
    public void test1122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1122");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("data/test-userrepo.csv");
        com.reservation_system.model.Researcher researcher7 = new com.reservation_system.model.Researcher(5, "hi!", "labmanager", "Guest", false);
        userRepository1.addUser((com.reservation_system.model.User) researcher7);
        int int9 = userRepository1.getNextID();
        boolean boolean11 = userRepository1.emailExists("faculty");
        java.util.List<com.reservation_system.model.User> userList12 = userRepository1.getAllUsers();
        java.util.Optional<com.reservation_system.model.User> userOptional14 = userRepository1.findByEmail("");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 102 + "'", int9 == 102);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(userList12);
        org.junit.Assert.assertNotNull(userOptional14);
    }

    @Test
    public void test1123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1123");
        com.reservation_system.model.Researcher researcher5 = new com.reservation_system.model.Researcher(0, "", "Password1!", "researcher", false);
        researcher5.setApproved(true);
        int int8 = researcher5.getID();
        java.lang.String str9 = researcher5.getPassword();
        boolean boolean10 = researcher5.requiresDepartmentApproval();
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "researcher" + "'", str9, "researcher");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test1124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1124");
        com.reservation_system.model.Student student5 = new com.reservation_system.model.Student(0, "Guest", "Password1!", "data/test-userrepo.csv", true);
        java.lang.String str6 = student5.getPassword();
        int int7 = student5.getID();
        java.lang.String str8 = student5.getEmail();
        java.lang.String str9 = student5.getUserType();
        java.lang.String str10 = student5.getUserType();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "data/test-userrepo.csv" + "'", str6, "data/test-userrepo.csv");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Password1!" + "'", str8, "Password1!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Student" + "'", str9, "Student");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Student" + "'", str10, "Student");
    }

    @Test
    public void test1125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1125");
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
        boolean boolean25 = userRepository1.headLabCoordinatorExists();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Faculty" + "'", str8, "Faculty");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Faculty" + "'", str9, "Faculty");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(userList17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 102 + "'", int18 == 102);
        org.junit.Assert.assertNotNull(userList19);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 102 + "'", int23 == 102);
        org.junit.Assert.assertNotNull(userList24);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
    }

    @Test
    public void test1126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1126");
        com.reservation_system.model.Student student5 = new com.reservation_system.model.Student((-1), "headlabcoordinator", "faculty", "Guest", false);
        java.lang.String str6 = student5.getUserType();
        java.lang.String str7 = student5.getUserType();
        java.lang.String str8 = student5.getEmail();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Student" + "'", str6, "Student");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Student" + "'", str7, "Student");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "faculty" + "'", str8, "faculty");
    }

    @Test
    public void test1127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1127");
        com.reservation_system.model.Guest guest5 = new com.reservation_system.model.Guest(10, "", "Faculty", "faculty", true);
        java.lang.String str6 = guest5.getUserType();
        java.lang.String str7 = guest5.getName();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Guest" + "'", str6, "Guest");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
    }

    @Test
    public void test1128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1128");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("data/test-userrepo.csv");
        boolean boolean3 = userRepository1.emailExists("Alice");
        int int4 = userRepository1.getNextID();
        boolean boolean5 = userRepository1.headLabCoordinatorExists();
        boolean boolean6 = userRepository1.headLabCoordinatorExists();
        boolean boolean8 = userRepository1.emailExists("Researcher");
        boolean boolean10 = userRepository1.emailExists("alice@example.com");
        java.util.List<com.reservation_system.model.User> userList11 = userRepository1.getAllUsers();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 102 + "'", int4 == 102);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(userList11);
    }

    @Test
    public void test1129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1129");
        com.reservation_system.model.User user6 = com.reservation_system.patterns.factory.UserFactory.createUser("guest", 99, "guest", "data/test-userrepo.csv", "guest", true);
        org.junit.Assert.assertNotNull(user6);
    }

    @Test
    public void test1130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1130");
        com.reservation_system.model.HeadLabCoordinator headLabCoordinator5 = new com.reservation_system.model.HeadLabCoordinator((int) (byte) 100, "alice@example.com", "hi!", "headlabcoordinator", true);
        java.lang.String str6 = headLabCoordinator5.getUserType();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "headlabcoordinator" + "'", str6, "headlabcoordinator");
    }

    @Test
    public void test1131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1131");
        com.reservation_system.model.LabManager labManager5 = new com.reservation_system.model.LabManager(10, "Guest", "Guest", "faculty", true);
        boolean boolean6 = labManager5.isApproved();
        java.lang.String str7 = labManager5.getUserType();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "labmanager" + "'", str7, "labmanager");
    }

    @Test
    public void test1132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1132");
        com.reservation_system.model.Guest guest5 = new com.reservation_system.model.Guest(0, "Password1!", "data/test-userrepo.csv", "researcher", false);
        guest5.setApproved(false);
        boolean boolean8 = guest5.requiresDepartmentApproval();
        java.lang.String str9 = guest5.getUserType();
        int int10 = guest5.getID();
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Guest" + "'", str9, "Guest");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test1133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1133");
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
        com.reservation_system.model.LabManager labManager22 = new com.reservation_system.model.LabManager(10, "Password1!", "data/test-userrepo.csv", "Guest", true);
        java.lang.String str23 = labManager22.getUserType();
        labManager22.setApproved(false);
        userRepository1.addUser((com.reservation_system.model.User) labManager22);
        com.reservation_system.repository.UserRepository userRepository28 = new com.reservation_system.repository.UserRepository("data/test-userrepo.csv");
        com.reservation_system.model.Researcher researcher34 = new com.reservation_system.model.Researcher(5, "hi!", "labmanager", "Guest", false);
        userRepository28.addUser((com.reservation_system.model.User) researcher34);
        int int36 = userRepository28.getNextID();
        com.reservation_system.repository.UserRepository userRepository38 = new com.reservation_system.repository.UserRepository("data/test-userrepo.csv");
        int int39 = userRepository38.getNextID();
        boolean boolean40 = userRepository38.headLabCoordinatorExists();
        com.reservation_system.model.Guest guest46 = new com.reservation_system.model.Guest((int) (byte) -1, "hi!", "", "Password1!", false);
        userRepository38.addUser((com.reservation_system.model.User) guest46);
        int int48 = userRepository38.getNextID();
        boolean boolean50 = userRepository38.emailExists("headlabcoordinator");
        java.util.List<com.reservation_system.model.User> userList51 = userRepository38.getAllUsers();
        userRepository28.saveAllUsers(userList51);
        userRepository1.saveAllUsers(userList51);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 102 + "'", int2 == 102);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 102 + "'", int11 == 102);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(userList14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 102 + "'", int15 == 102);
        org.junit.Assert.assertNotNull(userList16);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "labmanager" + "'", str23, "labmanager");
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 102 + "'", int36 == 102);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 102 + "'", int39 == 102);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + true + "'", boolean40 == true);
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 102 + "'", int48 == 102);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertNotNull(userList51);
    }

    @Test
    public void test1134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1134");
        com.reservation_system.model.Faculty faculty5 = new com.reservation_system.model.Faculty((int) (byte) -1, "Faculty", "Guest", "", true);
    }

    @Test
    public void test1135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1135");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("data/test-userrepo.csv");
        int int2 = userRepository1.getNextID();
        boolean boolean3 = userRepository1.headLabCoordinatorExists();
        com.reservation_system.model.Guest guest9 = new com.reservation_system.model.Guest((int) (byte) -1, "hi!", "", "Password1!", false);
        userRepository1.addUser((com.reservation_system.model.User) guest9);
        int int11 = userRepository1.getNextID();
        boolean boolean13 = userRepository1.emailExists("headlabcoordinator");
        boolean boolean14 = userRepository1.headLabCoordinatorExists();
        com.reservation_system.model.User user21 = com.reservation_system.patterns.factory.UserFactory.createUser("Guest", (int) '#', "guest", "Password1!", "hi!", false);
        userRepository1.addUser(user21);
        com.reservation_system.model.HeadLabCoordinator headLabCoordinator28 = new com.reservation_system.model.HeadLabCoordinator((int) (short) 1, "hi!", "guest", "Alice", false);
        userRepository1.addUser((com.reservation_system.model.User) headLabCoordinator28);
        java.lang.String str30 = headLabCoordinator28.getUserType();
        java.lang.String str31 = headLabCoordinator28.getUserType();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 102 + "'", int2 == 102);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 102 + "'", int11 == 102);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(user21);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "headlabcoordinator" + "'", str30, "headlabcoordinator");
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "headlabcoordinator" + "'", str31, "headlabcoordinator");
    }

    @Test
    public void test1136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1136");
        com.reservation_system.model.User user6 = com.reservation_system.patterns.factory.UserFactory.createUser("Faculty", 1, "Faculty", "Guest", "", false);
        java.lang.String str7 = user6.getPassword();
        org.junit.Assert.assertNotNull(user6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
    }

    @Test
    public void test1137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1137");
        com.reservation_system.model.HeadLabCoordinator headLabCoordinator5 = new com.reservation_system.model.HeadLabCoordinator((int) '#', "Faculty", "Alice", "data/test-userrepo.csv", false);
    }

    @Test
    public void test1138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1138");
        com.reservation_system.model.Researcher researcher5 = new com.reservation_system.model.Researcher(10, "faculty", "data/test-userrepo.csv", "alice@example.com", true);
        java.lang.String str6 = researcher5.getUserType();
        java.lang.String str7 = researcher5.getUserType();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Researcher" + "'", str6, "Researcher");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Researcher" + "'", str7, "Researcher");
    }

    @Test
    public void test1139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1139");
        com.reservation_system.model.Student student5 = new com.reservation_system.model.Student((int) (short) 100, "guest", "Password1!", "Password1!", false);
        java.lang.String str6 = student5.getUserType();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Student" + "'", str6, "Student");
    }

    @Test
    public void test1140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1140");
        com.reservation_system.model.Faculty faculty5 = new com.reservation_system.model.Faculty((int) (byte) -1, "faculty", "data/test-userrepo.csv", "Student", false);
        java.lang.String str6 = faculty5.getName();
        boolean boolean7 = faculty5.requiresDepartmentApproval();
        java.lang.String str8 = faculty5.getPassword();
        java.lang.String str9 = faculty5.getEmail();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "faculty" + "'", str6, "faculty");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Student" + "'", str8, "Student");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "data/test-userrepo.csv" + "'", str9, "data/test-userrepo.csv");
    }

    @Test
    public void test1141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1141");
        com.reservation_system.model.User user6 = com.reservation_system.patterns.factory.UserFactory.createUser("labmanager", (-1), "alice@example.com", "headlabcoordinator", "headlabcoordinator", false);
        org.junit.Assert.assertNotNull(user6);
    }

    @Test
    public void test1142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1142");
        com.reservation_system.model.Faculty faculty5 = new com.reservation_system.model.Faculty(0, "alice@example.com", "hi!", "headlabcoordinator", false);
    }

    @Test
    public void test1143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1143");
        com.reservation_system.model.LabManager labManager5 = new com.reservation_system.model.LabManager((int) '#', "data/test-userrepo.csv", "headlabcoordinator", "researcher", false);
        java.lang.String str6 = labManager5.getUserType();
        java.lang.String str7 = labManager5.getUserType();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "labmanager" + "'", str6, "labmanager");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "labmanager" + "'", str7, "labmanager");
    }

    @Test
    public void test1144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1144");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("data/test-userrepo.csv");
        com.reservation_system.model.Researcher researcher7 = new com.reservation_system.model.Researcher(5, "hi!", "labmanager", "Guest", false);
        userRepository1.addUser((com.reservation_system.model.User) researcher7);
        java.lang.String str9 = researcher7.getUserType();
        java.lang.String str10 = researcher7.getUserType();
        java.lang.String str11 = researcher7.getUserType();
        java.lang.String str12 = researcher7.getUserType();
        java.lang.Class<?> wildcardClass13 = researcher7.getClass();
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Researcher" + "'", str9, "Researcher");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Researcher" + "'", str10, "Researcher");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Researcher" + "'", str11, "Researcher");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Researcher" + "'", str12, "Researcher");
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test1145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1145");
        com.reservation_system.model.LabManager labManager5 = new com.reservation_system.model.LabManager(10, "Password1!", "data/test-userrepo.csv", "Guest", true);
        java.lang.String str6 = labManager5.getUserType();
        java.lang.String str7 = labManager5.getPassword();
        java.lang.String str8 = labManager5.getEmail();
        java.lang.String str9 = labManager5.getName();
        java.lang.String str10 = labManager5.getPassword();
        java.lang.String str11 = labManager5.getUserType();
        boolean boolean12 = labManager5.requiresDepartmentApproval();
        java.lang.String str13 = labManager5.getUserType();
        int int14 = labManager5.getID();
        int int15 = labManager5.getID();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "labmanager" + "'", str6, "labmanager");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Guest" + "'", str7, "Guest");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "data/test-userrepo.csv" + "'", str8, "data/test-userrepo.csv");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Password1!" + "'", str9, "Password1!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Guest" + "'", str10, "Guest");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "labmanager" + "'", str11, "labmanager");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "labmanager" + "'", str13, "labmanager");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 10 + "'", int14 == 10);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 10 + "'", int15 == 10);
    }

    @Test
    public void test1146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1146");
        com.reservation_system.model.Faculty faculty5 = new com.reservation_system.model.Faculty(1, "Student", "labmanager", "Student", true);
        faculty5.setApproved(false);
    }

    @Test
    public void test1147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1147");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("data/test-userrepo.csv");
        java.util.List<com.reservation_system.model.User> userList2 = userRepository1.getAllUsers();
        boolean boolean3 = userRepository1.headLabCoordinatorExists();
        com.reservation_system.model.Faculty faculty9 = new com.reservation_system.model.Faculty((-1), "Researcher", "hi!", "headlabcoordinator", false);
        java.lang.String str10 = faculty9.getUserType();
        userRepository1.addUser((com.reservation_system.model.User) faculty9);
        com.reservation_system.repository.UserRepository userRepository13 = new com.reservation_system.repository.UserRepository("data/test-userrepo.csv");
        com.reservation_system.model.Researcher researcher19 = new com.reservation_system.model.Researcher(5, "hi!", "labmanager", "Guest", false);
        userRepository13.addUser((com.reservation_system.model.User) researcher19);
        java.lang.String str21 = researcher19.getUserType();
        boolean boolean22 = researcher19.requiresDepartmentApproval();
        java.lang.String str23 = researcher19.getPassword();
        userRepository1.addUser((com.reservation_system.model.User) researcher19);
        boolean boolean25 = userRepository1.headLabCoordinatorExists();
        org.junit.Assert.assertNotNull(userList2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Faculty" + "'", str10, "Faculty");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "Researcher" + "'", str21, "Researcher");
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "Guest" + "'", str23, "Guest");
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
    }

    @Test
    public void test1148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1148");
        com.reservation_system.model.LabManager labManager5 = new com.reservation_system.model.LabManager(98, "hi!", "hi!", "alice@example.com", true);
        boolean boolean6 = labManager5.requiresDepartmentApproval();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test1149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1149");
        com.reservation_system.model.Faculty faculty5 = new com.reservation_system.model.Faculty((int) ' ', "Researcher", "Researcher", "Guest", false);
        java.lang.Class<?> wildcardClass6 = faculty5.getClass();
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test1150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1150");
        com.reservation_system.model.Guest guest5 = new com.reservation_system.model.Guest((int) (byte) 10, "labmanager", "student", "Faculty", false);
        int int6 = guest5.getID();
        java.lang.Class<?> wildcardClass7 = guest5.getClass();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test1151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1151");
        com.reservation_system.model.Researcher researcher5 = new com.reservation_system.model.Researcher((int) 'a', "labmanager", "faculty", "", false);
        boolean boolean6 = researcher5.requiresDepartmentApproval();
        java.lang.String str7 = researcher5.getUserType();
        boolean boolean8 = researcher5.isApproved();
        java.lang.String str9 = researcher5.getUserType();
        int int10 = researcher5.getID();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Researcher" + "'", str7, "Researcher");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Researcher" + "'", str9, "Researcher");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 97 + "'", int10 == 97);
    }

    @Test
    public void test1152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1152");
        com.reservation_system.model.LabManager labManager5 = new com.reservation_system.model.LabManager((int) (byte) 100, "researcher", "alice@example.com", "", false);
        boolean boolean6 = labManager5.requiresDepartmentApproval();
        int int7 = labManager5.getID();
        java.lang.String str8 = labManager5.getPassword();
        java.lang.String str9 = labManager5.getUserType();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 100 + "'", int7 == 100);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "labmanager" + "'", str9, "labmanager");
    }

    @Test
    public void test1153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1153");
        com.reservation_system.model.HeadLabCoordinator headLabCoordinator5 = new com.reservation_system.model.HeadLabCoordinator((int) (byte) 10, "researcher", "student", "Student", false);
    }

    @Test
    public void test1154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1154");
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
        java.util.Optional<com.reservation_system.model.User> userOptional59 = userRepository1.findByEmail("guest");
        boolean boolean61 = userRepository1.emailExists("data/test-userrepo.csv");
        org.junit.Assert.assertNotNull(userOptional10);
        org.junit.Assert.assertNotNull(userList11);
        org.junit.Assert.assertNotNull(userList21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertNotNull(userList33);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 102 + "'", int44 == 102);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertNotNull(userList51);
        org.junit.Assert.assertTrue("'" + int52 + "' != '" + 102 + "'", int52 == 102);
        org.junit.Assert.assertNotNull(userList53);
        org.junit.Assert.assertNotNull(userOptional59);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + true + "'", boolean61 == true);
    }

    @Test
    public void test1155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1155");
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
        com.reservation_system.repository.UserRepository userRepository51 = new com.reservation_system.repository.UserRepository("data/test-userrepo.csv");
        boolean boolean53 = userRepository51.emailExists("Password1!");
        com.reservation_system.model.Faculty faculty59 = new com.reservation_system.model.Faculty((-1), "headlabcoordinator", "Student", "", false);
        userRepository51.addUser((com.reservation_system.model.User) faculty59);
        faculty59.setApproved(true);
        java.lang.String str63 = faculty59.getUserType();
        userRepository1.addUser((com.reservation_system.model.User) faculty59);
        faculty59.setApproved(false);
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
    }

    @Test
    public void test1156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1156");
        com.reservation_system.model.Student student5 = new com.reservation_system.model.Student(10, "Faculty", "", "Password1!", false);
        boolean boolean6 = student5.isApproved();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test1157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1157");
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
        int int17 = userRepository1.getNextID();
        com.reservation_system.repository.UserRepository userRepository19 = new com.reservation_system.repository.UserRepository("data/test-userrepo.csv");
        int int20 = userRepository19.getNextID();
        boolean boolean21 = userRepository19.headLabCoordinatorExists();
        com.reservation_system.model.Guest guest27 = new com.reservation_system.model.Guest((int) (byte) -1, "hi!", "", "Password1!", false);
        userRepository19.addUser((com.reservation_system.model.User) guest27);
        com.reservation_system.repository.UserRepository userRepository30 = new com.reservation_system.repository.UserRepository("data/test-userrepo.csv");
        com.reservation_system.model.Researcher researcher36 = new com.reservation_system.model.Researcher(5, "hi!", "labmanager", "Guest", false);
        userRepository30.addUser((com.reservation_system.model.User) researcher36);
        java.util.List<com.reservation_system.model.User> userList38 = userRepository30.getAllUsers();
        com.reservation_system.repository.UserRepository userRepository40 = new com.reservation_system.repository.UserRepository("data/test-userrepo.csv");
        com.reservation_system.model.Researcher researcher46 = new com.reservation_system.model.Researcher(5, "hi!", "labmanager", "Guest", false);
        userRepository40.addUser((com.reservation_system.model.User) researcher46);
        java.util.Optional<com.reservation_system.model.User> userOptional49 = userRepository40.findByEmail("alice@example.com");
        java.util.List<com.reservation_system.model.User> userList50 = userRepository40.getAllUsers();
        userRepository30.saveAllUsers(userList50);
        userRepository19.saveAllUsers(userList50);
        userRepository1.saveAllUsers(userList50);
        boolean boolean54 = userRepository1.headLabCoordinatorExists();
        org.junit.Assert.assertNotNull(userList2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 102 + "'", int3 == 102);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(userOptional8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(userList15);
        org.junit.Assert.assertNotNull(userList16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 102 + "'", int17 == 102);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 102 + "'", int20 == 102);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertNotNull(userList38);
        org.junit.Assert.assertNotNull(userOptional49);
        org.junit.Assert.assertNotNull(userList50);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + true + "'", boolean54 == true);
    }

    @Test
    public void test1158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1158");
        com.reservation_system.model.HeadLabCoordinator headLabCoordinator5 = new com.reservation_system.model.HeadLabCoordinator(0, "Guest", "Faculty", "guest", false);
        java.lang.String str6 = headLabCoordinator5.getUserType();
        java.lang.String str7 = headLabCoordinator5.getName();
        java.lang.String str8 = headLabCoordinator5.getName();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "headlabcoordinator" + "'", str6, "headlabcoordinator");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Guest" + "'", str7, "Guest");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Guest" + "'", str8, "Guest");
    }

    @Test
    public void test1159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1159");
        com.reservation_system.model.Faculty faculty5 = new com.reservation_system.model.Faculty(5, "researcher", "guest", "faculty", true);
        java.lang.String str6 = faculty5.getUserType();
        java.lang.String str7 = faculty5.getEmail();
        java.lang.String str8 = faculty5.getName();
        java.lang.String str9 = faculty5.getUserType();
        java.lang.String str10 = faculty5.getUserType();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Faculty" + "'", str6, "Faculty");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "guest" + "'", str7, "guest");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "researcher" + "'", str8, "researcher");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Faculty" + "'", str9, "Faculty");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Faculty" + "'", str10, "Faculty");
    }

    @Test
    public void test1160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1160");
        com.reservation_system.model.Guest guest5 = new com.reservation_system.model.Guest((-1), "alice@example.com", "hi!", "labmanager", false);
    }

    @Test
    public void test1161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1161");
        com.reservation_system.model.Faculty faculty5 = new com.reservation_system.model.Faculty(101, "Password1!", "Faculty", "alice@example.com", true);
        java.lang.String str6 = faculty5.getUserType();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Faculty" + "'", str6, "Faculty");
    }

    @Test
    public void test1162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1162");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("data/test-userrepo.csv");
        int int2 = userRepository1.getNextID();
        int int3 = userRepository1.getNextID();
        com.reservation_system.model.HeadLabCoordinator headLabCoordinator9 = new com.reservation_system.model.HeadLabCoordinator((int) (byte) 1, "", "", "guest", false);
        userRepository1.addUser((com.reservation_system.model.User) headLabCoordinator9);
        java.util.List<com.reservation_system.model.User> userList11 = userRepository1.getAllUsers();
        int int12 = userRepository1.getNextID();
        int int13 = userRepository1.getNextID();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 102 + "'", int2 == 102);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 102 + "'", int3 == 102);
        org.junit.Assert.assertNotNull(userList11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 102 + "'", int12 == 102);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 102 + "'", int13 == 102);
    }

    @Test
    public void test1163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1163");
        com.reservation_system.model.LabManager labManager5 = new com.reservation_system.model.LabManager(98, "headlabcoordinator", "hi!", "Faculty", true);
    }

    @Test
    public void test1164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1164");
        com.reservation_system.model.Researcher researcher5 = new com.reservation_system.model.Researcher((int) (short) 1, "Guest", "", "Password1!", true);
        java.lang.String str6 = researcher5.getUserType();
        java.lang.String str7 = researcher5.getUserType();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Researcher" + "'", str6, "Researcher");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Researcher" + "'", str7, "Researcher");
    }

    @Test
    public void test1165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1165");
        com.reservation_system.model.LabManager labManager5 = new com.reservation_system.model.LabManager((int) '4', "student", "headlabcoordinator", "researcher", false);
        java.lang.String str6 = labManager5.getUserType();
        boolean boolean7 = labManager5.requiresDepartmentApproval();
        labManager5.setApproved(true);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "labmanager" + "'", str6, "labmanager");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test1166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1166");
        com.reservation_system.model.Guest guest5 = new com.reservation_system.model.Guest(11, "faculty", "Faculty", "Faculty", true);
    }

    @Test
    public void test1167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1167");
        com.reservation_system.model.LabManager labManager5 = new com.reservation_system.model.LabManager((int) (short) -1, "Student", "student", "hi!", true);
        int int6 = labManager5.getID();
        boolean boolean7 = labManager5.isApproved();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test1168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1168");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("data/test-userrepo.csv");
        com.reservation_system.model.Researcher researcher7 = new com.reservation_system.model.Researcher(5, "hi!", "labmanager", "Guest", false);
        userRepository1.addUser((com.reservation_system.model.User) researcher7);
        boolean boolean10 = userRepository1.emailExists("labmanager");
        com.reservation_system.model.Researcher researcher16 = new com.reservation_system.model.Researcher((int) 'a', "labmanager", "faculty", "", false);
        boolean boolean17 = researcher16.requiresDepartmentApproval();
        java.lang.String str18 = researcher16.getUserType();
        userRepository1.addUser((com.reservation_system.model.User) researcher16);
        java.lang.String str20 = researcher16.getPassword();
        java.lang.String str21 = researcher16.getUserType();
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Researcher" + "'", str18, "Researcher");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "Researcher" + "'", str21, "Researcher");
    }

    @Test
    public void test1169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1169");
        com.reservation_system.model.LabManager labManager5 = new com.reservation_system.model.LabManager(35, "Guest", "labmanager", "labmanager", false);
        java.lang.String str6 = labManager5.getUserType();
        java.lang.Class<?> wildcardClass7 = labManager5.getClass();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "labmanager" + "'", str6, "labmanager");
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test1170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1170");
        com.reservation_system.model.Guest guest5 = new com.reservation_system.model.Guest((int) (byte) -1, "hi!", "Password1!", "faculty", false);
        java.lang.String str6 = guest5.getUserType();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Guest" + "'", str6, "Guest");
    }

    @Test
    public void test1171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1171");
        com.reservation_system.model.Guest guest5 = new com.reservation_system.model.Guest((int) (short) -1, "Student", "Password1!", "Guest", false);
    }

    @Test
    public void test1172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1172");
        com.reservation_system.model.LabManager labManager5 = new com.reservation_system.model.LabManager((int) (byte) 100, "Researcher", "faculty", "Guest", true);
        java.lang.Class<?> wildcardClass6 = labManager5.getClass();
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test1173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1173");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("data/test-userrepo.csv");
        int int2 = userRepository1.getNextID();
        boolean boolean3 = userRepository1.headLabCoordinatorExists();
        boolean boolean4 = userRepository1.headLabCoordinatorExists();
        java.util.List<com.reservation_system.model.User> userList5 = userRepository1.getAllUsers();
        java.lang.Class<?> wildcardClass6 = userList5.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 102 + "'", int2 == 102);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(userList5);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test1174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1174");
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
        java.lang.String str32 = faculty27.getUserType();
        boolean boolean33 = faculty27.requiresDepartmentApproval();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 102 + "'", int2 == 102);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 102 + "'", int11 == 102);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "Faculty" + "'", str32, "Faculty");
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
    }

    @Test
    public void test1175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1175");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("data/test-userrepo.csv");
        boolean boolean3 = userRepository1.emailExists("Alice");
        com.reservation_system.model.Researcher researcher9 = new com.reservation_system.model.Researcher((int) 'a', "labmanager", "faculty", "", false);
        boolean boolean10 = researcher9.isApproved();
        java.lang.String str11 = researcher9.getName();
        userRepository1.addUser((com.reservation_system.model.User) researcher9);
        boolean boolean13 = researcher9.requiresDepartmentApproval();
        java.lang.String str14 = researcher9.getName();
        java.lang.String str15 = researcher9.getUserType();
        java.lang.String str16 = researcher9.getUserType();
        java.lang.String str17 = researcher9.getUserType();
        boolean boolean18 = researcher9.isApproved();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "labmanager" + "'", str11, "labmanager");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "labmanager" + "'", str14, "labmanager");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Researcher" + "'", str15, "Researcher");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Researcher" + "'", str16, "Researcher");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "Researcher" + "'", str17, "Researcher");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test1176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1176");
        com.reservation_system.model.HeadLabCoordinator headLabCoordinator5 = new com.reservation_system.model.HeadLabCoordinator((int) (short) 100, "alice@example.com", "Guest", "labmanager", true);
        java.lang.String str6 = headLabCoordinator5.getUserType();
        java.lang.String str7 = headLabCoordinator5.getUserType();
        java.lang.String str8 = headLabCoordinator5.getUserType();
        java.lang.String str9 = headLabCoordinator5.getUserType();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "headlabcoordinator" + "'", str6, "headlabcoordinator");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "headlabcoordinator" + "'", str7, "headlabcoordinator");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "headlabcoordinator" + "'", str8, "headlabcoordinator");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "headlabcoordinator" + "'", str9, "headlabcoordinator");
    }

    @Test
    public void test1177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1177");
        com.reservation_system.model.Researcher researcher5 = new com.reservation_system.model.Researcher(6, "data/test-userrepo.csv", "faculty", "Faculty", true);
        boolean boolean6 = researcher5.requiresDepartmentApproval();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test1178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1178");
        // The following exception was thrown during execution in test generation
        try {
            com.reservation_system.model.User user6 = com.reservation_system.patterns.factory.UserFactory.createUser("", 100, "alice@example.com", "alice@example.com", "Researcher", true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid user type: ");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1179");
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
        com.reservation_system.model.Student student28 = new com.reservation_system.model.Student((int) (short) 100, "guest", "Guest", "faculty", false);
        userRepository1.addUser((com.reservation_system.model.User) student28);
        boolean boolean30 = userRepository1.headLabCoordinatorExists();
        java.util.List<com.reservation_system.model.User> userList31 = userRepository1.getAllUsers();
        java.util.List<com.reservation_system.model.User> userList32 = userRepository1.getAllUsers();
        org.junit.Assert.assertNotNull(userList9);
        org.junit.Assert.assertNotNull(userOptional20);
        org.junit.Assert.assertNotNull(userList21);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertNotNull(userList31);
        org.junit.Assert.assertNotNull(userList32);
    }

    @Test
    public void test1180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1180");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("data/test-userrepo.csv");
        com.reservation_system.model.Researcher researcher7 = new com.reservation_system.model.Researcher(5, "hi!", "labmanager", "Guest", false);
        userRepository1.addUser((com.reservation_system.model.User) researcher7);
        java.util.List<com.reservation_system.model.User> userList9 = userRepository1.getAllUsers();
        boolean boolean10 = userRepository1.headLabCoordinatorExists();
        boolean boolean12 = userRepository1.emailExists("guest");
        java.util.Optional<com.reservation_system.model.User> userOptional14 = userRepository1.findByEmail("researcher");
        java.util.Optional<com.reservation_system.model.User> userOptional16 = userRepository1.findByEmail("alice@example.com");
        int int17 = userRepository1.getNextID();
        boolean boolean19 = userRepository1.emailExists("student");
        java.util.List<com.reservation_system.model.User> userList20 = null;
        // The following exception was thrown during execution in test generation
        try {
            userRepository1.saveAllUsers(userList20);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(userList9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(userOptional14);
        org.junit.Assert.assertNotNull(userOptional16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 102 + "'", int17 == 102);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
    }

    @Test
    public void test1181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1181");
        com.reservation_system.model.Faculty faculty5 = new com.reservation_system.model.Faculty((int) (byte) 10, "alice@example.com", "headlabcoordinator", "headlabcoordinator", false);
        faculty5.setApproved(true);
    }

    @Test
    public void test1182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1182");
        com.reservation_system.model.Faculty faculty5 = new com.reservation_system.model.Faculty(0, "Student", "hi!", "data/test-userrepo.csv", true);
        java.lang.String str6 = faculty5.getName();
        java.lang.String str7 = faculty5.getUserType();
        java.lang.String str8 = faculty5.getUserType();
        java.lang.String str9 = faculty5.getUserType();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Student" + "'", str6, "Student");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Faculty" + "'", str7, "Faculty");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Faculty" + "'", str8, "Faculty");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Faculty" + "'", str9, "Faculty");
    }

    @Test
    public void test1183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1183");
        com.reservation_system.model.Faculty faculty5 = new com.reservation_system.model.Faculty((int) (byte) 0, "Faculty", "Researcher", "headlabcoordinator", true);
        java.lang.String str6 = faculty5.getUserType();
        java.lang.String str7 = faculty5.getUserType();
        java.lang.String str8 = faculty5.getUserType();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Faculty" + "'", str6, "Faculty");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Faculty" + "'", str7, "Faculty");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Faculty" + "'", str8, "Faculty");
    }

    @Test
    public void test1184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1184");
        com.reservation_system.model.Guest guest5 = new com.reservation_system.model.Guest((int) (short) 100, "student", "student", "Student", true);
    }

    @Test
    public void test1185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1185");
        com.reservation_system.model.Student student5 = new com.reservation_system.model.Student((int) (byte) 1, "data/test-userrepo.csv", "faculty", "Password1!", true);
        java.lang.String str6 = student5.getUserType();
        java.lang.String str7 = student5.getUserType();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Student" + "'", str6, "Student");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Student" + "'", str7, "Student");
    }

    @Test
    public void test1186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1186");
        com.reservation_system.model.Faculty faculty5 = new com.reservation_system.model.Faculty((int) (byte) -1, "student", "labmanager", "hi!", false);
        boolean boolean6 = faculty5.isApproved();
        java.lang.String str7 = faculty5.getUserType();
        java.lang.String str8 = faculty5.getPassword();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Faculty" + "'", str7, "Faculty");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
    }

    @Test
    public void test1187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1187");
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
        java.util.Optional<com.reservation_system.model.User> userOptional37 = userRepository1.findByEmail("data/test-userrepo.csv");
        java.util.List<com.reservation_system.model.User> userList38 = userRepository1.getAllUsers();
        int int39 = userRepository1.getNextID();
// flaky "9) test1187(com.reservation_system.randoop.userrepository.RegressionTest2)":         org.junit.Assert.assertTrue("'" + int2 + "' != '" + 6 + "'", int2 == 6);
// flaky "6) test1187(com.reservation_system.randoop.userrepository.RegressionTest2)":         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 6 + "'", int3 == 6);
        org.junit.Assert.assertNotNull(userList11);
        org.junit.Assert.assertNotNull(userList14);
// flaky "5) test1187(com.reservation_system.randoop.userrepository.RegressionTest2)":         org.junit.Assert.assertTrue("'" + int15 + "' != '" + 6 + "'", int15 == 6);
        org.junit.Assert.assertNotNull(userList18);
// flaky "5) test1187(com.reservation_system.randoop.userrepository.RegressionTest2)":         org.junit.Assert.assertTrue("'" + int19 + "' != '" + 6 + "'", int19 == 6);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertNotNull(userOptional24);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
// flaky "3) test1187(com.reservation_system.randoop.userrepository.RegressionTest2)":         org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNotNull(userList31);
        org.junit.Assert.assertNotNull(userList34);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
        org.junit.Assert.assertNotNull(userOptional37);
        org.junit.Assert.assertNotNull(userList38);
// flaky "2) test1187(com.reservation_system.randoop.userrepository.RegressionTest2)":         org.junit.Assert.assertTrue("'" + int39 + "' != '" + 6 + "'", int39 == 6);
    }

    @Test
    public void test1188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1188");
        com.reservation_system.model.Researcher researcher5 = new com.reservation_system.model.Researcher((int) 'a', "", "labmanager", "data/test-userrepo.csv", true);
        researcher5.setApproved(false);
        java.lang.String str8 = researcher5.getUserType();
        java.lang.Class<?> wildcardClass9 = researcher5.getClass();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Researcher" + "'", str8, "Researcher");
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test1189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1189");
        com.reservation_system.model.Student student5 = new com.reservation_system.model.Student((-1), "alice@example.com", "", "Faculty", true);
    }

    @Test
    public void test1190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1190");
        com.reservation_system.model.Guest guest5 = new com.reservation_system.model.Guest(97, "Faculty", "Faculty", "data/test-userrepo.csv", true);
        java.lang.Class<?> wildcardClass6 = guest5.getClass();
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test1191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1191");
        com.reservation_system.model.User user6 = com.reservation_system.patterns.factory.UserFactory.createUser("headlabcoordinator", (int) (short) -1, "faculty", "Alice", "", true);
        user6.setApproved(false);
        user6.setApproved(true);
        org.junit.Assert.assertNotNull(user6);
    }

    @Test
    public void test1192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1192");
        com.reservation_system.model.HeadLabCoordinator headLabCoordinator5 = new com.reservation_system.model.HeadLabCoordinator((int) 'a', "Alice", "hi!", "researcher", false);
    }

    @Test
    public void test1193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1193");
        com.reservation_system.model.Faculty faculty5 = new com.reservation_system.model.Faculty(101, "Researcher", "Researcher", "hi!", true);
    }

    @Test
    public void test1194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1194");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("data/test-userrepo.csv");
        java.util.List<com.reservation_system.model.User> userList2 = userRepository1.getAllUsers();
        int int3 = userRepository1.getNextID();
        boolean boolean5 = userRepository1.emailExists("headlabcoordinator");
        boolean boolean6 = userRepository1.headLabCoordinatorExists();
        java.util.Optional<com.reservation_system.model.User> userOptional8 = userRepository1.findByEmail("Alice");
        boolean boolean10 = userRepository1.emailExists("Alice");
        boolean boolean12 = userRepository1.emailExists("Guest");
        boolean boolean14 = userRepository1.emailExists("headlabcoordinator");
        com.reservation_system.model.Researcher researcher20 = new com.reservation_system.model.Researcher((int) '#', "data/test-userrepo.csv", "Student", "faculty", false);
        userRepository1.addUser((com.reservation_system.model.User) researcher20);
        com.reservation_system.model.LabManager labManager27 = new com.reservation_system.model.LabManager((-1), "Alice", "guest", "data/test-userrepo.csv", true);
        userRepository1.addUser((com.reservation_system.model.User) labManager27);
        org.junit.Assert.assertNotNull(userList2);
// flaky "10) test1194(com.reservation_system.randoop.userrepository.RegressionTest2)":         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 6 + "'", int3 == 6);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(userOptional8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
// flaky "7) test1194(com.reservation_system.randoop.userrepository.RegressionTest2)":         org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test1195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1195");
        com.reservation_system.model.HeadLabCoordinator headLabCoordinator5 = new com.reservation_system.model.HeadLabCoordinator(0, "Student", "Alice", "labmanager", false);
    }

    @Test
    public void test1196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1196");
        com.reservation_system.model.Guest guest5 = new com.reservation_system.model.Guest(6, "hi!", "", "student", false);
    }

    @Test
    public void test1197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1197");
        com.reservation_system.model.Researcher researcher5 = new com.reservation_system.model.Researcher((int) 'a', "", "labmanager", "data/test-userrepo.csv", true);
        researcher5.setApproved(false);
        java.lang.String str8 = researcher5.getUserType();
        java.lang.String str9 = researcher5.getUserType();
        java.lang.String str10 = researcher5.getUserType();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Researcher" + "'", str8, "Researcher");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Researcher" + "'", str9, "Researcher");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Researcher" + "'", str10, "Researcher");
    }

    @Test
    public void test1198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1198");
        com.reservation_system.model.Researcher researcher5 = new com.reservation_system.model.Researcher((int) (short) 10, "guest", "", "researcher", true);
        java.lang.String str6 = researcher5.getName();
        boolean boolean7 = researcher5.requiresDepartmentApproval();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "guest" + "'", str6, "guest");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test1199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1199");
        com.reservation_system.model.Researcher researcher5 = new com.reservation_system.model.Researcher((int) 'a', "Password1!", "hi!", "Alice", false);
        boolean boolean6 = researcher5.isApproved();
        java.lang.String str7 = researcher5.getPassword();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Alice" + "'", str7, "Alice");
    }

    @Test
    public void test1200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1200");
        com.reservation_system.model.User user6 = com.reservation_system.patterns.factory.UserFactory.createUser("guest", (int) '4', "student", "Faculty", "labmanager", false);
        org.junit.Assert.assertNotNull(user6);
    }

    @Test
    public void test1201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1201");
        com.reservation_system.model.HeadLabCoordinator headLabCoordinator5 = new com.reservation_system.model.HeadLabCoordinator(102, "data/test-userrepo.csv", "Student", "", false);
    }

    @Test
    public void test1202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1202");
        com.reservation_system.model.HeadLabCoordinator headLabCoordinator5 = new com.reservation_system.model.HeadLabCoordinator(6, "Faculty", "", "faculty", true);
        java.lang.String str6 = headLabCoordinator5.getUserType();
        java.lang.String str7 = headLabCoordinator5.getUserType();
        java.lang.String str8 = headLabCoordinator5.getUserType();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "headlabcoordinator" + "'", str6, "headlabcoordinator");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "headlabcoordinator" + "'", str7, "headlabcoordinator");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "headlabcoordinator" + "'", str8, "headlabcoordinator");
    }

    @Test
    public void test1203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1203");
        com.reservation_system.model.User user6 = com.reservation_system.patterns.factory.UserFactory.createUser("headlabcoordinator", (int) (short) 0, "researcher", "data/test-userrepo.csv", "Student", true);
        org.junit.Assert.assertNotNull(user6);
    }

    @Test
    public void test1204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1204");
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
        boolean boolean26 = userRepository1.emailExists("Researcher");
        boolean boolean27 = userRepository1.headLabCoordinatorExists();
        boolean boolean28 = userRepository1.headLabCoordinatorExists();
        org.junit.Assert.assertNotNull(userList9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(userList19);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 36 + "'", int20 == 36);
        org.junit.Assert.assertNotNull(userList21);
        org.junit.Assert.assertNotNull(userList24);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
    }

    @Test
    public void test1205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1205");
        com.reservation_system.model.Researcher researcher5 = new com.reservation_system.model.Researcher(102, "labmanager", "hi!", "", true);
    }

    @Test
    public void test1206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1206");
        com.reservation_system.model.HeadLabCoordinator headLabCoordinator5 = new com.reservation_system.model.HeadLabCoordinator(97, "alice@example.com", "data/test-userrepo.csv", "Faculty", true);
    }

    @Test
    public void test1207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1207");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("data/test-userrepo.csv");
        java.util.List<com.reservation_system.model.User> userList2 = userRepository1.getAllUsers();
        int int3 = userRepository1.getNextID();
        boolean boolean5 = userRepository1.emailExists("headlabcoordinator");
        boolean boolean6 = userRepository1.headLabCoordinatorExists();
        int int7 = userRepository1.getNextID();
        com.reservation_system.repository.UserRepository userRepository9 = new com.reservation_system.repository.UserRepository("data/test-userrepo.csv");
        com.reservation_system.model.Researcher researcher15 = new com.reservation_system.model.Researcher(5, "hi!", "labmanager", "Guest", false);
        userRepository9.addUser((com.reservation_system.model.User) researcher15);
        java.util.List<com.reservation_system.model.User> userList17 = userRepository9.getAllUsers();
        com.reservation_system.repository.UserRepository userRepository19 = new com.reservation_system.repository.UserRepository("data/test-userrepo.csv");
        com.reservation_system.model.Researcher researcher25 = new com.reservation_system.model.Researcher(5, "hi!", "labmanager", "Guest", false);
        userRepository19.addUser((com.reservation_system.model.User) researcher25);
        java.util.List<com.reservation_system.model.User> userList27 = userRepository19.getAllUsers();
        userRepository9.saveAllUsers(userList27);
        userRepository1.saveAllUsers(userList27);
        boolean boolean31 = userRepository1.emailExists("data/test-userrepo.csv");
        org.junit.Assert.assertNotNull(userList2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 36 + "'", int3 == 36);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 36 + "'", int7 == 36);
        org.junit.Assert.assertNotNull(userList17);
        org.junit.Assert.assertNotNull(userList27);
// flaky "11) test1207(com.reservation_system.randoop.userrepository.RegressionTest2)":         org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
    }

    @Test
    public void test1208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1208");
        com.reservation_system.model.Researcher researcher5 = new com.reservation_system.model.Researcher((int) (short) 100, "labmanager", "headlabcoordinator", "Guest", false);
    }

    @Test
    public void test1209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1209");
        com.reservation_system.model.Faculty faculty5 = new com.reservation_system.model.Faculty((int) (short) 0, "Faculty", "Guest", "Faculty", false);
        java.lang.String str6 = faculty5.getName();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Faculty" + "'", str6, "Faculty");
    }

    @Test
    public void test1210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1210");
        com.reservation_system.model.User user6 = com.reservation_system.patterns.factory.UserFactory.createUser("researcher", (int) (byte) 1, "headlabcoordinator", "faculty", "researcher", true);
        org.junit.Assert.assertNotNull(user6);
    }

    @Test
    public void test1211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1211");
        com.reservation_system.model.Student student5 = new com.reservation_system.model.Student(6, "Student", "Faculty", "labmanager", false);
    }

    @Test
    public void test1212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1212");
        com.reservation_system.model.Guest guest5 = new com.reservation_system.model.Guest(0, "student", "Researcher", "Researcher", true);
    }

    @Test
    public void test1213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1213");
        com.reservation_system.model.Student student5 = new com.reservation_system.model.Student(0, "", "researcher", "researcher", false);
    }

    @Test
    public void test1214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1214");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("data/test-userrepo.csv");
        java.util.List<com.reservation_system.model.User> userList2 = userRepository1.getAllUsers();
        int int3 = userRepository1.getNextID();
        com.reservation_system.repository.UserRepository userRepository5 = new com.reservation_system.repository.UserRepository("data/test-userrepo.csv");
        java.util.List<com.reservation_system.model.User> userList6 = userRepository5.getAllUsers();
        int int7 = userRepository5.getNextID();
        int int8 = userRepository5.getNextID();
        java.util.List<com.reservation_system.model.User> userList9 = userRepository5.getAllUsers();
        userRepository1.saveAllUsers(userList9);
        boolean boolean12 = userRepository1.emailExists("student");
        org.junit.Assert.assertNotNull(userList2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 36 + "'", int3 == 36);
        org.junit.Assert.assertNotNull(userList6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 36 + "'", int7 == 36);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 36 + "'", int8 == 36);
        org.junit.Assert.assertNotNull(userList9);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test1215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1215");
        com.reservation_system.model.Faculty faculty5 = new com.reservation_system.model.Faculty(10, "", "alice@example.com", "Password1!", false);
        java.lang.String str6 = faculty5.getUserType();
        java.lang.String str7 = faculty5.getName();
        java.lang.String str8 = faculty5.getUserType();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Faculty" + "'", str6, "Faculty");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Faculty" + "'", str8, "Faculty");
    }

    @Test
    public void test1216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1216");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("data/test-userrepo.csv");
        boolean boolean3 = userRepository1.emailExists("Password1!");
        boolean boolean5 = userRepository1.emailExists("hi!");
        java.util.List<com.reservation_system.model.User> userList6 = userRepository1.getAllUsers();
        com.reservation_system.model.LabManager labManager12 = new com.reservation_system.model.LabManager(1, "student", "data/test-userrepo.csv", "hi!", false);
        java.lang.String str13 = labManager12.getPassword();
        userRepository1.addUser((com.reservation_system.model.User) labManager12);
        labManager12.setApproved(false);
        labManager12.setApproved(true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(userList6);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
    }

    @Test
    public void test1217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1217");
        com.reservation_system.model.User user6 = com.reservation_system.patterns.factory.UserFactory.createUser("guest", (int) (byte) -1, "Student", "alice@example.com", "Faculty", false);
        int int7 = user6.getID();
        org.junit.Assert.assertNotNull(user6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
    }

    @Test
    public void test1218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1218");
        com.reservation_system.model.Researcher researcher5 = new com.reservation_system.model.Researcher((int) (short) 1, "data/test-userrepo.csv", "researcher", "Guest", false);
        java.lang.String str6 = researcher5.getUserType();
        boolean boolean7 = researcher5.requiresDepartmentApproval();
        java.lang.String str8 = researcher5.getName();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Researcher" + "'", str6, "Researcher");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "data/test-userrepo.csv" + "'", str8, "data/test-userrepo.csv");
    }

    @Test
    public void test1219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1219");
        com.reservation_system.model.Student student5 = new com.reservation_system.model.Student(98, "guest", "data/test-userrepo.csv", "guest", false);
        java.lang.String str6 = student5.getUserType();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Student" + "'", str6, "Student");
    }

    @Test
    public void test1220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1220");
        com.reservation_system.model.LabManager labManager5 = new com.reservation_system.model.LabManager((int) (byte) 10, "alice@example.com", "Alice", "Guest", false);
        java.lang.String str6 = labManager5.getName();
    }

    @Test
    public void test1221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1221");
        com.reservation_system.model.Researcher researcher5 = new com.reservation_system.model.Researcher(5, "", "Alice", "researcher", false);
        boolean boolean6 = researcher5.requiresDepartmentApproval();
        researcher5.setApproved(false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test1222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1222");
        com.reservation_system.model.Researcher researcher5 = new com.reservation_system.model.Researcher((int) '#', "alice@example.com", "student", "guest", true);
    }

    @Test
    public void test1223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1223");
        com.reservation_system.model.Student student5 = new com.reservation_system.model.Student(0, "Guest", "Password1!", "data/test-userrepo.csv", true);
        java.lang.String str6 = student5.getPassword();
        int int7 = student5.getID();
        student5.setApproved(false);
        java.lang.String str10 = student5.getUserType();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "data/test-userrepo.csv" + "'", str6, "data/test-userrepo.csv");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Student" + "'", str10, "Student");
    }

    @Test
    public void test1224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1224");
        com.reservation_system.model.HeadLabCoordinator headLabCoordinator5 = new com.reservation_system.model.HeadLabCoordinator(0, "Faculty", "student", "student", true);
    }

    @Test
    public void test1225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1225");
        com.reservation_system.model.Researcher researcher5 = new com.reservation_system.model.Researcher((int) 'a', "Password1!", "hi!", "Alice", false);
        java.lang.String str6 = researcher5.getUserType();
        java.lang.String str7 = researcher5.getUserType();
        java.lang.String str8 = researcher5.getUserType();
        java.lang.String str9 = researcher5.getPassword();
        int int10 = researcher5.getID();
        java.lang.String str11 = researcher5.getPassword();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Researcher" + "'", str6, "Researcher");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Researcher" + "'", str7, "Researcher");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Researcher" + "'", str8, "Researcher");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Alice" + "'", str9, "Alice");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 97 + "'", int10 == 97);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Alice" + "'", str11, "Alice");
    }

    @Test
    public void test1226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1226");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("data/test-userrepo.csv");
        com.reservation_system.model.Researcher researcher7 = new com.reservation_system.model.Researcher(5, "hi!", "labmanager", "Guest", false);
        userRepository1.addUser((com.reservation_system.model.User) researcher7);
        java.util.List<com.reservation_system.model.User> userList9 = userRepository1.getAllUsers();
        com.reservation_system.model.Guest guest15 = new com.reservation_system.model.Guest(0, "Password1!", "data/test-userrepo.csv", "researcher", false);
        boolean boolean16 = guest15.requiresDepartmentApproval();
        userRepository1.addUser((com.reservation_system.model.User) guest15);
        boolean boolean19 = userRepository1.emailExists("Alice");
        java.util.List<com.reservation_system.model.User> userList20 = userRepository1.getAllUsers();
        java.util.Optional<com.reservation_system.model.User> userOptional22 = userRepository1.findByEmail("researcher");
        java.util.List<com.reservation_system.model.User> userList23 = userRepository1.getAllUsers();
        org.junit.Assert.assertNotNull(userList9);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(userList20);
        org.junit.Assert.assertNotNull(userOptional22);
        org.junit.Assert.assertNotNull(userList23);
    }

    @Test
    public void test1227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1227");
        com.reservation_system.model.Researcher researcher5 = new com.reservation_system.model.Researcher((int) (byte) -1, "labmanager", "faculty", "", false);
    }

    @Test
    public void test1228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1228");
        com.reservation_system.model.Faculty faculty5 = new com.reservation_system.model.Faculty((int) (short) -1, "Researcher", "alice@example.com", "alice@example.com", true);
    }

    @Test
    public void test1229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1229");
        com.reservation_system.model.Researcher researcher5 = new com.reservation_system.model.Researcher((int) '#', "hi!", "hi!", "Guest", true);
    }

    @Test
    public void test1230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1230");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("data/test-userrepo.csv");
        com.reservation_system.model.Researcher researcher7 = new com.reservation_system.model.Researcher(5, "hi!", "labmanager", "Guest", false);
        userRepository1.addUser((com.reservation_system.model.User) researcher7);
        java.util.List<com.reservation_system.model.User> userList9 = userRepository1.getAllUsers();
        com.reservation_system.model.Guest guest15 = new com.reservation_system.model.Guest(0, "Password1!", "data/test-userrepo.csv", "researcher", false);
        boolean boolean16 = guest15.requiresDepartmentApproval();
        userRepository1.addUser((com.reservation_system.model.User) guest15);
        java.util.Optional<com.reservation_system.model.User> userOptional19 = userRepository1.findByEmail("guest");
        boolean boolean21 = userRepository1.emailExists("Faculty");
        org.junit.Assert.assertNotNull(userList9);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(userOptional19);
// flaky "12) test1230(com.reservation_system.randoop.userrepository.RegressionTest2)":         org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
    }

    @Test
    public void test1231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1231");
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
        com.reservation_system.model.Student student25 = new com.reservation_system.model.Student(0, "Guest", "Password1!", "data/test-userrepo.csv", true);
        java.lang.String str26 = student25.getUserType();
        java.lang.String str27 = student25.getUserType();
        userRepository1.addUser((com.reservation_system.model.User) student25);
        student25.setApproved(true);
        boolean boolean31 = student25.requiresDepartmentApproval();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 36 + "'", int2 == 36);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 36 + "'", int11 == 36);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(userList14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 36 + "'", int15 == 36);
        org.junit.Assert.assertNotNull(userList16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "Student" + "'", str26, "Student");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "Student" + "'", str27, "Student");
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
    }

    @Test
    public void test1232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1232");
        com.reservation_system.model.User user6 = com.reservation_system.patterns.factory.UserFactory.createUser("faculty", 100, "student", "", "Guest", false);
        org.junit.Assert.assertNotNull(user6);
    }

    @Test
    public void test1233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1233");
        com.reservation_system.model.Faculty faculty5 = new com.reservation_system.model.Faculty(5, "Faculty", "faculty", "labmanager", false);
        boolean boolean6 = faculty5.requiresDepartmentApproval();
        boolean boolean7 = faculty5.requiresDepartmentApproval();
        int int8 = faculty5.getID();
        int int9 = faculty5.getID();
        boolean boolean10 = faculty5.requiresDepartmentApproval();
        java.lang.String str11 = faculty5.getUserType();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 5 + "'", int8 == 5);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 5 + "'", int9 == 5);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Faculty" + "'", str11, "Faculty");
    }

    @Test
    public void test1234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1234");
        com.reservation_system.model.User user6 = com.reservation_system.patterns.factory.UserFactory.createUser("Guest", (int) '#', "faculty", "alice@example.com", "", true);
        boolean boolean7 = user6.isApproved();
        org.junit.Assert.assertNotNull(user6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test1235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1235");
        com.reservation_system.model.Faculty faculty5 = new com.reservation_system.model.Faculty((-1), "Researcher", "Faculty", "headlabcoordinator", false);
        java.lang.String str6 = faculty5.getName();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Researcher" + "'", str6, "Researcher");
    }

    @Test
    public void test1236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1236");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("data/test-userrepo.csv");
        java.util.List<com.reservation_system.model.User> userList2 = userRepository1.getAllUsers();
        int int3 = userRepository1.getNextID();
        boolean boolean5 = userRepository1.emailExists("headlabcoordinator");
        boolean boolean6 = userRepository1.headLabCoordinatorExists();
        int int7 = userRepository1.getNextID();
        boolean boolean9 = userRepository1.emailExists("Researcher");
        java.util.List<com.reservation_system.model.User> userList10 = userRepository1.getAllUsers();
        org.junit.Assert.assertNotNull(userList2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 36 + "'", int3 == 36);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 36 + "'", int7 == 36);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(userList10);
    }

    @Test
    public void test1237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1237");
        com.reservation_system.model.Student student5 = new com.reservation_system.model.Student(10, "Alice", "labmanager", "Student", true);
        int int6 = student5.getID();
        java.lang.String str7 = student5.getUserType();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Student" + "'", str7, "Student");
    }

    @Test
    public void test1238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1238");
        com.reservation_system.model.HeadLabCoordinator headLabCoordinator5 = new com.reservation_system.model.HeadLabCoordinator(35, "hi!", "Researcher", "student", false);
        java.lang.String str6 = headLabCoordinator5.getUserType();
        boolean boolean7 = headLabCoordinator5.isApproved();
        java.lang.String str8 = headLabCoordinator5.getPassword();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "headlabcoordinator" + "'", str6, "headlabcoordinator");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "student" + "'", str8, "student");
    }

    @Test
    public void test1239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1239");
        com.reservation_system.model.Researcher researcher5 = new com.reservation_system.model.Researcher((-1), "alice@example.com", "Researcher", "student", true);
        boolean boolean6 = researcher5.isApproved();
        java.lang.String str7 = researcher5.getUserType();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Researcher" + "'", str7, "Researcher");
    }

    @Test
    public void test1240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1240");
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
        java.lang.String str47 = headLabCoordinator45.getEmail();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "labmanager" + "'", str11, "labmanager");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 98 + "'", int14 == 98);
        org.junit.Assert.assertNotNull(user21);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 98 + "'", int23 == 98);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 98 + "'", int24 == 98);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
        org.junit.Assert.assertNotNull(userList38);
        org.junit.Assert.assertEquals("'" + str47 + "' != '" + "guest" + "'", str47, "guest");
    }

    @Test
    public void test1241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1241");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("data/test-userrepo.csv");
        com.reservation_system.model.Researcher researcher7 = new com.reservation_system.model.Researcher(5, "hi!", "labmanager", "Guest", false);
        userRepository1.addUser((com.reservation_system.model.User) researcher7);
        java.util.Optional<com.reservation_system.model.User> userOptional10 = userRepository1.findByEmail("alice@example.com");
        java.util.List<com.reservation_system.model.User> userList11 = userRepository1.getAllUsers();
        com.reservation_system.repository.UserRepository userRepository13 = new com.reservation_system.repository.UserRepository("data/test-userrepo.csv");
        int int14 = userRepository13.getNextID();
        int int15 = userRepository13.getNextID();
        com.reservation_system.model.HeadLabCoordinator headLabCoordinator21 = new com.reservation_system.model.HeadLabCoordinator((int) (byte) 1, "", "", "guest", false);
        userRepository13.addUser((com.reservation_system.model.User) headLabCoordinator21);
        java.util.List<com.reservation_system.model.User> userList23 = userRepository13.getAllUsers();
        userRepository1.saveAllUsers(userList23);
        boolean boolean25 = userRepository1.headLabCoordinatorExists();
        boolean boolean26 = userRepository1.headLabCoordinatorExists();
        org.junit.Assert.assertNotNull(userOptional10);
        org.junit.Assert.assertNotNull(userList11);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 98 + "'", int14 == 98);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 98 + "'", int15 == 98);
        org.junit.Assert.assertNotNull(userList23);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
    }

    @Test
    public void test1242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1242");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("data/test-userrepo.csv");
        java.util.List<com.reservation_system.model.User> userList2 = userRepository1.getAllUsers();
        int int3 = userRepository1.getNextID();
        com.reservation_system.repository.UserRepository userRepository5 = new com.reservation_system.repository.UserRepository("data/test-userrepo.csv");
        com.reservation_system.model.Researcher researcher11 = new com.reservation_system.model.Researcher(5, "hi!", "labmanager", "Guest", false);
        userRepository5.addUser((com.reservation_system.model.User) researcher11);
        java.util.List<com.reservation_system.model.User> userList13 = userRepository5.getAllUsers();
        userRepository1.saveAllUsers(userList13);
        java.util.Optional<com.reservation_system.model.User> userOptional16 = userRepository1.findByEmail("student");
        java.util.List<com.reservation_system.model.User> userList17 = userRepository1.getAllUsers();
        org.junit.Assert.assertNotNull(userList2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 98 + "'", int3 == 98);
        org.junit.Assert.assertNotNull(userList13);
        org.junit.Assert.assertNotNull(userOptional16);
        org.junit.Assert.assertNotNull(userList17);
    }

    @Test
    public void test1243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1243");
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
        java.lang.Class<?> wildcardClass27 = userOptional26.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 98 + "'", int2 == 98);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 98 + "'", int11 == 98);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 98 + "'", int24 == 98);
        org.junit.Assert.assertNotNull(userOptional26);
        org.junit.Assert.assertNotNull(wildcardClass27);
    }

    @Test
    public void test1244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1244");
        com.reservation_system.model.User user6 = com.reservation_system.patterns.factory.UserFactory.createUser("headlabcoordinator", (int) (byte) 0, "", "headlabcoordinator", "Password1!", false);
        int int7 = user6.getID();
        org.junit.Assert.assertNotNull(user6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test1245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1245");
        com.reservation_system.model.Student student5 = new com.reservation_system.model.Student(1, "data/test-userrepo.csv", "alice@example.com", "guest", false);
        java.lang.String str6 = student5.getUserType();
        student5.setApproved(false);
        java.lang.String str9 = student5.getUserType();
        java.lang.String str10 = student5.getPassword();
        int int11 = student5.getID();
        java.lang.String str12 = student5.getEmail();
        boolean boolean13 = student5.isApproved();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Student" + "'", str6, "Student");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Student" + "'", str9, "Student");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "guest" + "'", str10, "guest");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test1246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1246");
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
        com.reservation_system.model.Student student28 = new com.reservation_system.model.Student((int) (short) 100, "guest", "Guest", "faculty", false);
        userRepository1.addUser((com.reservation_system.model.User) student28);
        com.reservation_system.model.Guest guest35 = new com.reservation_system.model.Guest(0, "", "Faculty", "Guest", false);
        guest35.setApproved(true);
        userRepository1.addUser((com.reservation_system.model.User) guest35);
        org.junit.Assert.assertNotNull(userList9);
        org.junit.Assert.assertNotNull(userOptional20);
        org.junit.Assert.assertNotNull(userList21);
    }

    @Test
    public void test1247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1247");
        com.reservation_system.model.Guest guest5 = new com.reservation_system.model.Guest((int) (short) 100, "hi!", "Password1!", "", true);
    }

    @Test
    public void test1248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1248");
        com.reservation_system.model.User user6 = com.reservation_system.patterns.factory.UserFactory.createUser("Guest", (int) '#', "guest", "Password1!", "hi!", false);
        java.lang.String str7 = user6.getName();
        org.junit.Assert.assertNotNull(user6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "guest" + "'", str7, "guest");
    }

    @Test
    public void test1249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1249");
        com.reservation_system.model.Student student5 = new com.reservation_system.model.Student((int) (short) 0, "student", "student", "faculty", false);
        boolean boolean6 = student5.isApproved();
        java.lang.String str7 = student5.getUserType();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Student" + "'", str7, "Student");
    }

    @Test
    public void test1250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1250");
        com.reservation_system.model.Faculty faculty5 = new com.reservation_system.model.Faculty(102, "guest", "Password1!", "guest", false);
    }

    @Test
    public void test1251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1251");
        com.reservation_system.model.Researcher researcher5 = new com.reservation_system.model.Researcher((int) '#', "Password1!", "Password1!", "headlabcoordinator", true);
        java.lang.String str6 = researcher5.getPassword();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "headlabcoordinator" + "'", str6, "headlabcoordinator");
    }

    @Test
    public void test1252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1252");
        com.reservation_system.model.Student student5 = new com.reservation_system.model.Student(0, "data/test-userrepo.csv", "Password1!", "Student", true);
    }

    @Test
    public void test1253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1253");
        com.reservation_system.model.Student student5 = new com.reservation_system.model.Student((int) (short) 10, "Password1!", "Alice", "Student", true);
        java.lang.String str6 = student5.getName();
        java.lang.String str7 = student5.getUserType();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Password1!" + "'", str6, "Password1!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Student" + "'", str7, "Student");
    }

    @Test
    public void test1254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1254");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("data/test-userrepo.csv");
        java.util.List<com.reservation_system.model.User> userList2 = userRepository1.getAllUsers();
        int int3 = userRepository1.getNextID();
        java.util.List<com.reservation_system.model.User> userList4 = userRepository1.getAllUsers();
        java.util.Optional<com.reservation_system.model.User> userOptional6 = userRepository1.findByEmail("headlabcoordinator");
        org.junit.Assert.assertNotNull(userList2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 101 + "'", int3 == 101);
        org.junit.Assert.assertNotNull(userList4);
        org.junit.Assert.assertNotNull(userOptional6);
    }

    @Test
    public void test1255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1255");
        com.reservation_system.model.Guest guest5 = new com.reservation_system.model.Guest(1, "Password1!", "Faculty", "faculty", false);
        int int6 = guest5.getID();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
    }

    @Test
    public void test1256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1256");
        com.reservation_system.model.Faculty faculty5 = new com.reservation_system.model.Faculty(101, "", "faculty", "hi!", true);
    }

    @Test
    public void test1257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1257");
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
        java.util.Optional<com.reservation_system.model.User> userOptional33 = userRepository1.findByEmail("alice@example.com");
        java.util.Optional<com.reservation_system.model.User> userOptional35 = userRepository1.findByEmail("");
        java.util.Optional<com.reservation_system.model.User> userOptional37 = userRepository1.findByEmail("faculty");
        org.junit.Assert.assertNotNull(userList9);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 101 + "'", int20 == 101);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(userList27);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 101 + "'", int28 == 101);
        org.junit.Assert.assertNotNull(userList29);
        org.junit.Assert.assertNotNull(userOptional33);
        org.junit.Assert.assertNotNull(userOptional35);
        org.junit.Assert.assertNotNull(userOptional37);
    }

    @Test
    public void test1258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1258");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("data/test-userrepo.csv");
        boolean boolean3 = userRepository1.emailExists("Alice");
        int int4 = userRepository1.getNextID();
        com.reservation_system.repository.UserRepository userRepository6 = new com.reservation_system.repository.UserRepository("data/test-userrepo.csv");
        java.util.List<com.reservation_system.model.User> userList7 = userRepository6.getAllUsers();
        int int8 = userRepository6.getNextID();
        com.reservation_system.repository.UserRepository userRepository10 = new com.reservation_system.repository.UserRepository("data/test-userrepo.csv");
        java.util.List<com.reservation_system.model.User> userList11 = userRepository10.getAllUsers();
        int int12 = userRepository10.getNextID();
        boolean boolean14 = userRepository10.emailExists("headlabcoordinator");
        boolean boolean15 = userRepository10.headLabCoordinatorExists();
        java.util.Optional<com.reservation_system.model.User> userOptional17 = userRepository10.findByEmail("Alice");
        boolean boolean19 = userRepository10.emailExists("Alice");
        boolean boolean21 = userRepository10.emailExists("Guest");
        boolean boolean23 = userRepository10.emailExists("headlabcoordinator");
        java.util.List<com.reservation_system.model.User> userList24 = userRepository10.getAllUsers();
        userRepository6.saveAllUsers(userList24);
        com.reservation_system.repository.UserRepository userRepository27 = new com.reservation_system.repository.UserRepository("data/test-userrepo.csv");
        com.reservation_system.model.Researcher researcher33 = new com.reservation_system.model.Researcher(5, "hi!", "labmanager", "Guest", false);
        userRepository27.addUser((com.reservation_system.model.User) researcher33);
        java.util.List<com.reservation_system.model.User> userList35 = userRepository27.getAllUsers();
        com.reservation_system.model.Guest guest41 = new com.reservation_system.model.Guest(0, "Password1!", "data/test-userrepo.csv", "researcher", false);
        boolean boolean42 = guest41.requiresDepartmentApproval();
        userRepository27.addUser((com.reservation_system.model.User) guest41);
        boolean boolean45 = userRepository27.emailExists("Alice");
        int int46 = userRepository27.getNextID();
        com.reservation_system.repository.UserRepository userRepository48 = new com.reservation_system.repository.UserRepository("data/test-userrepo.csv");
        boolean boolean50 = userRepository48.emailExists("Alice");
        com.reservation_system.repository.UserRepository userRepository52 = new com.reservation_system.repository.UserRepository("data/test-userrepo.csv");
        java.util.List<com.reservation_system.model.User> userList53 = userRepository52.getAllUsers();
        int int54 = userRepository52.getNextID();
        java.util.List<com.reservation_system.model.User> userList55 = userRepository52.getAllUsers();
        userRepository48.saveAllUsers(userList55);
        userRepository27.saveAllUsers(userList55);
        com.reservation_system.repository.UserRepository userRepository59 = new com.reservation_system.repository.UserRepository("data/test-userrepo.csv");
        boolean boolean61 = userRepository59.emailExists("Alice");
        com.reservation_system.repository.UserRepository userRepository63 = new com.reservation_system.repository.UserRepository("data/test-userrepo.csv");
        java.util.List<com.reservation_system.model.User> userList64 = userRepository63.getAllUsers();
        int int65 = userRepository63.getNextID();
        java.util.List<com.reservation_system.model.User> userList66 = userRepository63.getAllUsers();
        userRepository59.saveAllUsers(userList66);
        userRepository27.saveAllUsers(userList66);
        userRepository6.saveAllUsers(userList66);
        com.reservation_system.repository.UserRepository userRepository71 = new com.reservation_system.repository.UserRepository("data/test-userrepo.csv");
        boolean boolean73 = userRepository71.emailExists("Alice");
        com.reservation_system.model.Researcher researcher79 = new com.reservation_system.model.Researcher((int) 'a', "labmanager", "faculty", "", false);
        boolean boolean80 = researcher79.isApproved();
        java.lang.String str81 = researcher79.getName();
        userRepository71.addUser((com.reservation_system.model.User) researcher79);
        java.util.List<com.reservation_system.model.User> userList83 = userRepository71.getAllUsers();
        userRepository6.saveAllUsers(userList83);
        userRepository1.saveAllUsers(userList83);
        boolean boolean86 = userRepository1.headLabCoordinatorExists();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 101 + "'", int4 == 101);
        org.junit.Assert.assertNotNull(userList7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 101 + "'", int8 == 101);
        org.junit.Assert.assertNotNull(userList11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 101 + "'", int12 == 101);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(userOptional17);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(userList24);
        org.junit.Assert.assertNotNull(userList35);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + 101 + "'", int46 == 101);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertNotNull(userList53);
        org.junit.Assert.assertTrue("'" + int54 + "' != '" + 101 + "'", int54 == 101);
        org.junit.Assert.assertNotNull(userList55);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + false + "'", boolean61 == false);
        org.junit.Assert.assertNotNull(userList64);
        org.junit.Assert.assertTrue("'" + int65 + "' != '" + 101 + "'", int65 == 101);
        org.junit.Assert.assertNotNull(userList66);
        org.junit.Assert.assertTrue("'" + boolean73 + "' != '" + false + "'", boolean73 == false);
        org.junit.Assert.assertTrue("'" + boolean80 + "' != '" + false + "'", boolean80 == false);
        org.junit.Assert.assertEquals("'" + str81 + "' != '" + "labmanager" + "'", str81, "labmanager");
        org.junit.Assert.assertNotNull(userList83);
        org.junit.Assert.assertTrue("'" + boolean86 + "' != '" + true + "'", boolean86 == true);
    }

    @Test
    public void test1259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1259");
        com.reservation_system.model.Faculty faculty5 = new com.reservation_system.model.Faculty((int) (byte) 100, "student", "Password1!", "Guest", false);
        java.lang.String str6 = faculty5.getUserType();
        java.lang.String str7 = faculty5.getUserType();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Faculty" + "'", str6, "Faculty");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Faculty" + "'", str7, "Faculty");
    }

    @Test
    public void test1260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1260");
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
        java.util.Optional<com.reservation_system.model.User> userOptional23 = userRepository1.findByEmail("student");
        com.reservation_system.model.User user30 = com.reservation_system.patterns.factory.UserFactory.createUser("Guest", 0, "faculty", "", "student", false);
        userRepository1.addUser(user30);
        boolean boolean33 = userRepository1.emailExists("researcher");
        org.junit.Assert.assertNotNull(userList2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 101 + "'", int3 == 101);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(userOptional8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(userOptional23);
        org.junit.Assert.assertNotNull(user30);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
    }

    @Test
    public void test1261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1261");
        com.reservation_system.model.HeadLabCoordinator headLabCoordinator5 = new com.reservation_system.model.HeadLabCoordinator(0, "student", "Password1!", "Alice", false);
    }

    @Test
    public void test1262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1262");
        com.reservation_system.model.HeadLabCoordinator headLabCoordinator5 = new com.reservation_system.model.HeadLabCoordinator(98, "researcher", "headlabcoordinator", "", false);
        java.lang.String str6 = headLabCoordinator5.getUserType();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "headlabcoordinator" + "'", str6, "headlabcoordinator");
    }

    @Test
    public void test1263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1263");
        com.reservation_system.model.Faculty faculty5 = new com.reservation_system.model.Faculty((int) '#', "hi!", "Student", "faculty", false);
    }

    @Test
    public void test1264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1264");
        com.reservation_system.model.Guest guest5 = new com.reservation_system.model.Guest((int) 'a', "", "guest", "guest", true);
    }

    @Test
    public void test1265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1265");
        com.reservation_system.model.Student student5 = new com.reservation_system.model.Student((int) (short) 100, "guest", "Guest", "faculty", false);
        boolean boolean6 = student5.isApproved();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test1266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1266");
        com.reservation_system.model.HeadLabCoordinator headLabCoordinator5 = new com.reservation_system.model.HeadLabCoordinator(5, "Faculty", "", "Alice", false);
        java.lang.String str6 = headLabCoordinator5.getUserType();
        java.lang.String str7 = headLabCoordinator5.getName();
        java.lang.String str8 = headLabCoordinator5.getUserType();
        java.lang.String str9 = headLabCoordinator5.getUserType();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "headlabcoordinator" + "'", str6, "headlabcoordinator");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Faculty" + "'", str7, "Faculty");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "headlabcoordinator" + "'", str8, "headlabcoordinator");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "headlabcoordinator" + "'", str9, "headlabcoordinator");
    }

    @Test
    public void test1267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1267");
        com.reservation_system.model.LabManager labManager5 = new com.reservation_system.model.LabManager((int) '#', "researcher", "Guest", "headlabcoordinator", true);
        boolean boolean6 = labManager5.isApproved();
        java.lang.String str7 = labManager5.getEmail();
        boolean boolean8 = labManager5.requiresDepartmentApproval();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Guest" + "'", str7, "Guest");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test1268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1268");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("data/test-userrepo.csv");
        java.util.Optional<com.reservation_system.model.User> userOptional3 = userRepository1.findByEmail("hi!");
        com.reservation_system.repository.UserRepository userRepository5 = new com.reservation_system.repository.UserRepository("data/test-userrepo.csv");
        int int6 = userRepository5.getNextID();
        int int7 = userRepository5.getNextID();
        com.reservation_system.model.HeadLabCoordinator headLabCoordinator13 = new com.reservation_system.model.HeadLabCoordinator((int) (byte) 1, "", "", "guest", false);
        userRepository5.addUser((com.reservation_system.model.User) headLabCoordinator13);
        java.util.List<com.reservation_system.model.User> userList15 = userRepository5.getAllUsers();
        int int16 = userRepository5.getNextID();
        java.util.List<com.reservation_system.model.User> userList17 = userRepository5.getAllUsers();
        userRepository1.saveAllUsers(userList17);
        org.junit.Assert.assertNotNull(userOptional3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 101 + "'", int6 == 101);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 101 + "'", int7 == 101);
        org.junit.Assert.assertNotNull(userList15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 101 + "'", int16 == 101);
        org.junit.Assert.assertNotNull(userList17);
    }

    @Test
    public void test1269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1269");
        com.reservation_system.model.Faculty faculty5 = new com.reservation_system.model.Faculty(99, "", "labmanager", "Alice", true);
    }

    @Test
    public void test1270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1270");
        com.reservation_system.model.Guest guest5 = new com.reservation_system.model.Guest(11, "guest", "Password1!", "Student", true);
    }

    @Test
    public void test1271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1271");
        com.reservation_system.model.HeadLabCoordinator headLabCoordinator5 = new com.reservation_system.model.HeadLabCoordinator((int) (byte) 1, "", "", "guest", false);
        java.lang.String str6 = headLabCoordinator5.getEmail();
        java.lang.String str7 = headLabCoordinator5.getUserType();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "headlabcoordinator" + "'", str7, "headlabcoordinator");
    }

    @Test
    public void test1272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1272");
        com.reservation_system.model.LabManager labManager5 = new com.reservation_system.model.LabManager(99, "guest", "Student", "labmanager", false);
    }

    @Test
    public void test1273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1273");
        com.reservation_system.model.Faculty faculty5 = new com.reservation_system.model.Faculty(0, "", "Student", "headlabcoordinator", false);
    }

    @Test
    public void test1274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1274");
        com.reservation_system.model.Researcher researcher5 = new com.reservation_system.model.Researcher((int) (byte) -1, "Faculty", "alice@example.com", "Student", true);
    }

    @Test
    public void test1275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1275");
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
        com.reservation_system.model.Student student25 = new com.reservation_system.model.Student(0, "Guest", "Password1!", "data/test-userrepo.csv", true);
        java.lang.String str26 = student25.getUserType();
        java.lang.String str27 = student25.getUserType();
        userRepository1.addUser((com.reservation_system.model.User) student25);
        java.util.Optional<com.reservation_system.model.User> userOptional30 = userRepository1.findByEmail("alice@example.com");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 101 + "'", int2 == 101);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 101 + "'", int11 == 101);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(userList14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 101 + "'", int15 == 101);
        org.junit.Assert.assertNotNull(userList16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "Student" + "'", str26, "Student");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "Student" + "'", str27, "Student");
        org.junit.Assert.assertNotNull(userOptional30);
    }

    @Test
    public void test1276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1276");
        com.reservation_system.model.Student student5 = new com.reservation_system.model.Student(98, "", "student", "faculty", true);
    }

    @Test
    public void test1277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1277");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("data/test-userrepo.csv");
        int int2 = userRepository1.getNextID();
        int int3 = userRepository1.getNextID();
        com.reservation_system.model.HeadLabCoordinator headLabCoordinator9 = new com.reservation_system.model.HeadLabCoordinator((int) (byte) 1, "", "", "guest", false);
        userRepository1.addUser((com.reservation_system.model.User) headLabCoordinator9);
        java.util.List<com.reservation_system.model.User> userList11 = userRepository1.getAllUsers();
        boolean boolean12 = userRepository1.headLabCoordinatorExists();
        com.reservation_system.repository.UserRepository userRepository14 = new com.reservation_system.repository.UserRepository("data/test-userrepo.csv");
        int int15 = userRepository14.getNextID();
        int int16 = userRepository14.getNextID();
        java.util.List<com.reservation_system.model.User> userList17 = userRepository14.getAllUsers();
        com.reservation_system.repository.UserRepository userRepository19 = new com.reservation_system.repository.UserRepository("data/test-userrepo.csv");
        com.reservation_system.model.Researcher researcher25 = new com.reservation_system.model.Researcher(5, "hi!", "labmanager", "Guest", false);
        userRepository19.addUser((com.reservation_system.model.User) researcher25);
        java.util.List<com.reservation_system.model.User> userList27 = userRepository19.getAllUsers();
        com.reservation_system.model.Guest guest33 = new com.reservation_system.model.Guest(0, "Password1!", "data/test-userrepo.csv", "researcher", false);
        boolean boolean34 = guest33.requiresDepartmentApproval();
        userRepository19.addUser((com.reservation_system.model.User) guest33);
        boolean boolean37 = userRepository19.emailExists("Alice");
        int int38 = userRepository19.getNextID();
        com.reservation_system.repository.UserRepository userRepository40 = new com.reservation_system.repository.UserRepository("data/test-userrepo.csv");
        java.util.List<com.reservation_system.model.User> userList41 = userRepository40.getAllUsers();
        userRepository19.saveAllUsers(userList41);
        userRepository14.saveAllUsers(userList41);
        userRepository1.saveAllUsers(userList41);
        boolean boolean45 = userRepository1.headLabCoordinatorExists();
        boolean boolean47 = userRepository1.emailExists("Faculty");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 101 + "'", int2 == 101);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 101 + "'", int3 == 101);
        org.junit.Assert.assertNotNull(userList11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 101 + "'", int15 == 101);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 101 + "'", int16 == 101);
        org.junit.Assert.assertNotNull(userList17);
        org.junit.Assert.assertNotNull(userList27);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 101 + "'", int38 == 101);
        org.junit.Assert.assertNotNull(userList41);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + true + "'", boolean45 == true);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + true + "'", boolean47 == true);
    }

    @Test
    public void test1278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1278");
        com.reservation_system.model.LabManager labManager5 = new com.reservation_system.model.LabManager(98, "Faculty", "Password1!", "", true);
    }

    @Test
    public void test1279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1279");
        com.reservation_system.model.Researcher researcher5 = new com.reservation_system.model.Researcher(98, "Alice", "Student", "guest", false);
        java.lang.String str6 = researcher5.getEmail();
        java.lang.String str7 = researcher5.getEmail();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Student" + "'", str6, "Student");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Student" + "'", str7, "Student");
    }

    @Test
    public void test1280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1280");
        // The following exception was thrown during execution in test generation
        try {
            com.reservation_system.model.User user6 = com.reservation_system.patterns.factory.UserFactory.createUser("hi!", 0, "Password1!", "student", "student", false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid user type: hi!");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1281");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("data/test-userrepo.csv");
        int int2 = userRepository1.getNextID();
        int int3 = userRepository1.getNextID();
        com.reservation_system.model.Researcher researcher9 = new com.reservation_system.model.Researcher((int) (byte) 1, "Faculty", "", "Guest", false);
        userRepository1.addUser((com.reservation_system.model.User) researcher9);
        boolean boolean12 = userRepository1.emailExists("Password1!");
        int int13 = userRepository1.getNextID();
        boolean boolean14 = userRepository1.headLabCoordinatorExists();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 101 + "'", int2 == 101);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 101 + "'", int3 == 101);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 101 + "'", int13 == 101);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test1282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1282");
        // The following exception was thrown during execution in test generation
        try {
            com.reservation_system.model.User user6 = com.reservation_system.patterns.factory.UserFactory.createUser("", (int) (short) 100, "hi!", "researcher", "guest", true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid user type: ");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1283");
        com.reservation_system.model.HeadLabCoordinator headLabCoordinator5 = new com.reservation_system.model.HeadLabCoordinator((int) (byte) -1, "data/test-userrepo.csv", "alice@example.com", "student", true);
        java.lang.String str6 = headLabCoordinator5.getUserType();
        boolean boolean7 = headLabCoordinator5.isApproved();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "headlabcoordinator" + "'", str6, "headlabcoordinator");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test1284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1284");
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
        java.util.Optional<com.reservation_system.model.User> userOptional18 = userRepository1.findByEmail("Faculty");
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
        org.junit.Assert.assertNotNull(userOptional18);
    }

    @Test
    public void test1285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1285");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("data/test-userrepo.csv");
        com.reservation_system.model.Researcher researcher7 = new com.reservation_system.model.Researcher(5, "hi!", "labmanager", "Guest", false);
        userRepository1.addUser((com.reservation_system.model.User) researcher7);
        java.util.List<com.reservation_system.model.User> userList9 = userRepository1.getAllUsers();
        boolean boolean10 = userRepository1.headLabCoordinatorExists();
        boolean boolean12 = userRepository1.emailExists("guest");
        java.util.Optional<com.reservation_system.model.User> userOptional14 = userRepository1.findByEmail("researcher");
        java.util.Optional<com.reservation_system.model.User> userOptional16 = userRepository1.findByEmail("alice@example.com");
        int int17 = userRepository1.getNextID();
        boolean boolean19 = userRepository1.emailExists("student");
        int int20 = userRepository1.getNextID();
        org.junit.Assert.assertNotNull(userList9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(userOptional14);
        org.junit.Assert.assertNotNull(userOptional16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 101 + "'", int17 == 101);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 101 + "'", int20 == 101);
    }

    @Test
    public void test1286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1286");
        com.reservation_system.model.Faculty faculty5 = new com.reservation_system.model.Faculty(5, "Faculty", "faculty", "labmanager", false);
        java.lang.String str6 = faculty5.getUserType();
        java.lang.String str7 = faculty5.getUserType();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Faculty" + "'", str6, "Faculty");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Faculty" + "'", str7, "Faculty");
    }

    @Test
    public void test1287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1287");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("data/test-userrepo.csv");
        com.reservation_system.model.Researcher researcher7 = new com.reservation_system.model.Researcher(5, "hi!", "labmanager", "Guest", false);
        userRepository1.addUser((com.reservation_system.model.User) researcher7);
        java.util.List<com.reservation_system.model.User> userList9 = userRepository1.getAllUsers();
        boolean boolean10 = userRepository1.headLabCoordinatorExists();
        com.reservation_system.model.LabManager labManager16 = new com.reservation_system.model.LabManager((int) '#', "researcher", "Guest", "headlabcoordinator", true);
        int int17 = labManager16.getID();
        userRepository1.addUser((com.reservation_system.model.User) labManager16);
        com.reservation_system.repository.UserRepository userRepository20 = new com.reservation_system.repository.UserRepository("data/test-userrepo.csv");
        java.util.List<com.reservation_system.model.User> userList21 = userRepository20.getAllUsers();
        int int22 = userRepository20.getNextID();
        com.reservation_system.repository.UserRepository userRepository24 = new com.reservation_system.repository.UserRepository("data/test-userrepo.csv");
        java.util.List<com.reservation_system.model.User> userList25 = userRepository24.getAllUsers();
        int int26 = userRepository24.getNextID();
        boolean boolean28 = userRepository24.emailExists("headlabcoordinator");
        boolean boolean29 = userRepository24.headLabCoordinatorExists();
        java.util.Optional<com.reservation_system.model.User> userOptional31 = userRepository24.findByEmail("Alice");
        boolean boolean33 = userRepository24.emailExists("Alice");
        boolean boolean35 = userRepository24.emailExists("Guest");
        boolean boolean37 = userRepository24.emailExists("headlabcoordinator");
        java.util.List<com.reservation_system.model.User> userList38 = userRepository24.getAllUsers();
        userRepository20.saveAllUsers(userList38);
        com.reservation_system.model.Researcher researcher45 = new com.reservation_system.model.Researcher((int) (short) -1, "labmanager", "faculty", "headlabcoordinator", true);
        userRepository20.addUser((com.reservation_system.model.User) researcher45);
        boolean boolean47 = userRepository20.headLabCoordinatorExists();
        com.reservation_system.repository.UserRepository userRepository49 = new com.reservation_system.repository.UserRepository("data/test-userrepo.csv");
        java.util.List<com.reservation_system.model.User> userList50 = userRepository49.getAllUsers();
        int int51 = userRepository49.getNextID();
        boolean boolean53 = userRepository49.emailExists("headlabcoordinator");
        boolean boolean54 = userRepository49.headLabCoordinatorExists();
        int int55 = userRepository49.getNextID();
        com.reservation_system.repository.UserRepository userRepository57 = new com.reservation_system.repository.UserRepository("data/test-userrepo.csv");
        com.reservation_system.model.Researcher researcher63 = new com.reservation_system.model.Researcher(5, "hi!", "labmanager", "Guest", false);
        userRepository57.addUser((com.reservation_system.model.User) researcher63);
        int int65 = userRepository57.getNextID();
        com.reservation_system.repository.UserRepository userRepository67 = new com.reservation_system.repository.UserRepository("data/test-userrepo.csv");
        com.reservation_system.model.Researcher researcher73 = new com.reservation_system.model.Researcher(5, "hi!", "labmanager", "Guest", false);
        userRepository67.addUser((com.reservation_system.model.User) researcher73);
        java.util.List<com.reservation_system.model.User> userList75 = userRepository67.getAllUsers();
        boolean boolean76 = userRepository67.headLabCoordinatorExists();
        boolean boolean78 = userRepository67.emailExists("guest");
        com.reservation_system.repository.UserRepository userRepository80 = new com.reservation_system.repository.UserRepository("data/test-userrepo.csv");
        boolean boolean82 = userRepository80.emailExists("Alice");
        com.reservation_system.repository.UserRepository userRepository84 = new com.reservation_system.repository.UserRepository("data/test-userrepo.csv");
        java.util.List<com.reservation_system.model.User> userList85 = userRepository84.getAllUsers();
        int int86 = userRepository84.getNextID();
        java.util.List<com.reservation_system.model.User> userList87 = userRepository84.getAllUsers();
        userRepository80.saveAllUsers(userList87);
        userRepository67.saveAllUsers(userList87);
        java.util.List<com.reservation_system.model.User> userList90 = userRepository67.getAllUsers();
        userRepository57.saveAllUsers(userList90);
        userRepository49.saveAllUsers(userList90);
        userRepository20.saveAllUsers(userList90);
        java.util.List<com.reservation_system.model.User> userList94 = userRepository20.getAllUsers();
        userRepository1.saveAllUsers(userList94);
        org.junit.Assert.assertNotNull(userList9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 35 + "'", int17 == 35);
        org.junit.Assert.assertNotNull(userList21);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 101 + "'", int22 == 101);
        org.junit.Assert.assertNotNull(userList25);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 101 + "'", int26 == 101);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertNotNull(userOptional31);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertNotNull(userList38);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + true + "'", boolean47 == true);
        org.junit.Assert.assertNotNull(userList50);
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + 101 + "'", int51 == 101);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + true + "'", boolean54 == true);
        org.junit.Assert.assertTrue("'" + int55 + "' != '" + 101 + "'", int55 == 101);
        org.junit.Assert.assertTrue("'" + int65 + "' != '" + 101 + "'", int65 == 101);
        org.junit.Assert.assertNotNull(userList75);
        org.junit.Assert.assertTrue("'" + boolean76 + "' != '" + true + "'", boolean76 == true);
        org.junit.Assert.assertTrue("'" + boolean78 + "' != '" + true + "'", boolean78 == true);
        org.junit.Assert.assertTrue("'" + boolean82 + "' != '" + false + "'", boolean82 == false);
        org.junit.Assert.assertNotNull(userList85);
        org.junit.Assert.assertTrue("'" + int86 + "' != '" + 101 + "'", int86 == 101);
        org.junit.Assert.assertNotNull(userList87);
        org.junit.Assert.assertNotNull(userList90);
        org.junit.Assert.assertNotNull(userList94);
    }

    @Test
    public void test1288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1288");
        com.reservation_system.model.HeadLabCoordinator headLabCoordinator5 = new com.reservation_system.model.HeadLabCoordinator((int) (byte) 100, "data/test-userrepo.csv", "", "labmanager", true);
    }

    @Test
    public void test1289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1289");
        com.reservation_system.model.HeadLabCoordinator headLabCoordinator5 = new com.reservation_system.model.HeadLabCoordinator((int) (short) 100, "alice@example.com", "Guest", "labmanager", true);
        boolean boolean6 = headLabCoordinator5.isApproved();
        java.lang.String str7 = headLabCoordinator5.getPassword();
        java.lang.String str8 = headLabCoordinator5.getUserType();
        java.lang.String str9 = headLabCoordinator5.getUserType();
        java.lang.String str10 = headLabCoordinator5.getUserType();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "labmanager" + "'", str7, "labmanager");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "headlabcoordinator" + "'", str8, "headlabcoordinator");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "headlabcoordinator" + "'", str9, "headlabcoordinator");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "headlabcoordinator" + "'", str10, "headlabcoordinator");
    }

    @Test
    public void test1290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1290");
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
        boolean boolean33 = userRepository1.headLabCoordinatorExists();
        java.util.Optional<com.reservation_system.model.User> userOptional35 = userRepository1.findByEmail("Faculty");
        boolean boolean37 = userRepository1.emailExists("Researcher");
        java.util.Optional<com.reservation_system.model.User> userOptional39 = userRepository1.findByEmail("student");
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
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertNotNull(userOptional35);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertNotNull(userOptional39);
    }

    @Test
    public void test1291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1291");
        com.reservation_system.model.Student student5 = new com.reservation_system.model.Student((int) (short) 0, "Password1!", "student", "Researcher", true);
    }

    @Test
    public void test1292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1292");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("data/test-userrepo.csv");
        int int2 = userRepository1.getNextID();
        int int3 = userRepository1.getNextID();
        com.reservation_system.model.HeadLabCoordinator headLabCoordinator9 = new com.reservation_system.model.HeadLabCoordinator((int) (byte) 1, "", "", "guest", false);
        userRepository1.addUser((com.reservation_system.model.User) headLabCoordinator9);
        java.util.List<com.reservation_system.model.User> userList11 = userRepository1.getAllUsers();
        boolean boolean13 = userRepository1.emailExists("Faculty");
        boolean boolean14 = userRepository1.headLabCoordinatorExists();
        com.reservation_system.repository.UserRepository userRepository16 = new com.reservation_system.repository.UserRepository("data/test-userrepo.csv");
        com.reservation_system.model.Researcher researcher22 = new com.reservation_system.model.Researcher(5, "hi!", "labmanager", "Guest", false);
        userRepository16.addUser((com.reservation_system.model.User) researcher22);
        int int24 = userRepository16.getNextID();
        boolean boolean26 = userRepository16.emailExists("Researcher");
        java.util.List<com.reservation_system.model.User> userList27 = userRepository16.getAllUsers();
        com.reservation_system.repository.UserRepository userRepository29 = new com.reservation_system.repository.UserRepository("data/test-userrepo.csv");
        com.reservation_system.model.Researcher researcher35 = new com.reservation_system.model.Researcher(5, "hi!", "labmanager", "Guest", false);
        userRepository29.addUser((com.reservation_system.model.User) researcher35);
        java.util.List<com.reservation_system.model.User> userList37 = userRepository29.getAllUsers();
        boolean boolean38 = userRepository29.headLabCoordinatorExists();
        boolean boolean40 = userRepository29.emailExists("guest");
        com.reservation_system.repository.UserRepository userRepository42 = new com.reservation_system.repository.UserRepository("data/test-userrepo.csv");
        boolean boolean44 = userRepository42.emailExists("Alice");
        com.reservation_system.repository.UserRepository userRepository46 = new com.reservation_system.repository.UserRepository("data/test-userrepo.csv");
        java.util.List<com.reservation_system.model.User> userList47 = userRepository46.getAllUsers();
        int int48 = userRepository46.getNextID();
        java.util.List<com.reservation_system.model.User> userList49 = userRepository46.getAllUsers();
        userRepository42.saveAllUsers(userList49);
        userRepository29.saveAllUsers(userList49);
        java.util.List<com.reservation_system.model.User> userList52 = userRepository29.getAllUsers();
        userRepository16.saveAllUsers(userList52);
        userRepository1.saveAllUsers(userList52);
        com.reservation_system.model.Student student60 = new com.reservation_system.model.Student(100, "labmanager", "hi!", "Alice", false);
        userRepository1.addUser((com.reservation_system.model.User) student60);
        int int62 = student60.getID();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 101 + "'", int2 == 101);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 101 + "'", int3 == 101);
        org.junit.Assert.assertNotNull(userList11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 101 + "'", int24 == 101);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(userList27);
        org.junit.Assert.assertNotNull(userList37);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + true + "'", boolean38 == true);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + true + "'", boolean40 == true);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertNotNull(userList47);
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 101 + "'", int48 == 101);
        org.junit.Assert.assertNotNull(userList49);
        org.junit.Assert.assertNotNull(userList52);
        org.junit.Assert.assertTrue("'" + int62 + "' != '" + 100 + "'", int62 == 100);
    }

    @Test
    public void test1293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1293");
        com.reservation_system.model.LabManager labManager5 = new com.reservation_system.model.LabManager((int) ' ', "researcher", "Researcher", "hi!", false);
    }

    @Test
    public void test1294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1294");
        // The following exception was thrown during execution in test generation
        try {
            com.reservation_system.model.User user6 = com.reservation_system.patterns.factory.UserFactory.createUser("hi!", (int) (byte) 1, "", "headlabcoordinator", "student", true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid user type: hi!");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1295");
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
        boolean boolean17 = userRepository1.emailExists("Alice");
        com.reservation_system.repository.UserRepository userRepository19 = new com.reservation_system.repository.UserRepository("data/test-userrepo.csv");
        int int20 = userRepository19.getNextID();
        int int21 = userRepository19.getNextID();
        com.reservation_system.model.HeadLabCoordinator headLabCoordinator27 = new com.reservation_system.model.HeadLabCoordinator((int) (byte) 1, "", "", "guest", false);
        userRepository19.addUser((com.reservation_system.model.User) headLabCoordinator27);
        java.util.List<com.reservation_system.model.User> userList29 = userRepository19.getAllUsers();
        userRepository1.saveAllUsers(userList29);
        int int31 = userRepository1.getNextID();
        org.junit.Assert.assertNotNull(userList2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 101 + "'", int3 == 101);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(userOptional8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(userList15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 101 + "'", int20 == 101);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 101 + "'", int21 == 101);
        org.junit.Assert.assertNotNull(userList29);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 101 + "'", int31 == 101);
    }

    @Test
    public void test1296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1296");
        com.reservation_system.model.Researcher researcher5 = new com.reservation_system.model.Researcher(100, "student", "guest", "headlabcoordinator", false);
        java.lang.String str6 = researcher5.getUserType();
        java.lang.String str7 = researcher5.getEmail();
        java.lang.String str8 = researcher5.getName();
        java.lang.String str9 = researcher5.getUserType();
        java.lang.String str10 = researcher5.getEmail();
        researcher5.setApproved(false);
        java.lang.String str13 = researcher5.getUserType();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Researcher" + "'", str6, "Researcher");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "guest" + "'", str7, "guest");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "student" + "'", str8, "student");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Researcher" + "'", str9, "Researcher");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "guest" + "'", str10, "guest");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Researcher" + "'", str13, "Researcher");
    }

    @Test
    public void test1297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1297");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("data/test-userrepo.csv");
        com.reservation_system.model.Researcher researcher7 = new com.reservation_system.model.Researcher(5, "hi!", "labmanager", "Guest", false);
        userRepository1.addUser((com.reservation_system.model.User) researcher7);
        java.util.List<com.reservation_system.model.User> userList9 = userRepository1.getAllUsers();
        com.reservation_system.model.Guest guest15 = new com.reservation_system.model.Guest(0, "Password1!", "data/test-userrepo.csv", "researcher", false);
        boolean boolean16 = guest15.requiresDepartmentApproval();
        userRepository1.addUser((com.reservation_system.model.User) guest15);
        guest15.setApproved(false);
        int int20 = guest15.getID();
        java.lang.String str21 = guest15.getUserType();
        org.junit.Assert.assertNotNull(userList9);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "Guest" + "'", str21, "Guest");
    }

    @Test
    public void test1298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1298");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("data/test-userrepo.csv");
        java.util.List<com.reservation_system.model.User> userList2 = userRepository1.getAllUsers();
        int int3 = userRepository1.getNextID();
        boolean boolean5 = userRepository1.emailExists("headlabcoordinator");
        boolean boolean6 = userRepository1.headLabCoordinatorExists();
        java.util.Optional<com.reservation_system.model.User> userOptional8 = userRepository1.findByEmail("Alice");
        boolean boolean10 = userRepository1.emailExists("");
        java.util.Optional<com.reservation_system.model.User> userOptional12 = userRepository1.findByEmail("student");
        java.util.Optional<com.reservation_system.model.User> userOptional14 = userRepository1.findByEmail("labmanager");
        java.util.Optional<com.reservation_system.model.User> userOptional16 = userRepository1.findByEmail("Alice");
        org.junit.Assert.assertNotNull(userList2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 101 + "'", int3 == 101);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(userOptional8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(userOptional12);
        org.junit.Assert.assertNotNull(userOptional14);
        org.junit.Assert.assertNotNull(userOptional16);
    }

    @Test
    public void test1299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1299");
        // The following exception was thrown during execution in test generation
        try {
            com.reservation_system.model.User user6 = com.reservation_system.patterns.factory.UserFactory.createUser("alice@example.com", 97, "Faculty", "labmanager", "hi!", false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid user type: alice@example.com");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1300");
        com.reservation_system.model.LabManager labManager5 = new com.reservation_system.model.LabManager((int) '4', "student", "headlabcoordinator", "researcher", false);
        java.lang.String str6 = labManager5.getUserType();
        java.lang.String str7 = labManager5.getUserType();
        boolean boolean8 = labManager5.isApproved();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "labmanager" + "'", str6, "labmanager");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "labmanager" + "'", str7, "labmanager");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test1301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1301");
        com.reservation_system.model.User user6 = com.reservation_system.patterns.factory.UserFactory.createUser("Researcher", 0, "Guest", "Alice", "alice@example.com", false);
        boolean boolean7 = user6.isApproved();
        boolean boolean8 = user6.requiresDepartmentApproval();
        java.lang.String str9 = user6.getEmail();
        org.junit.Assert.assertNotNull(user6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Alice" + "'", str9, "Alice");
    }

    @Test
    public void test1302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1302");
        com.reservation_system.model.User user6 = com.reservation_system.patterns.factory.UserFactory.createUser("Faculty", 6, "hi!", "", "headlabcoordinator", true);
        boolean boolean7 = user6.requiresDepartmentApproval();
        org.junit.Assert.assertNotNull(user6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test1303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1303");
        com.reservation_system.model.HeadLabCoordinator headLabCoordinator5 = new com.reservation_system.model.HeadLabCoordinator((int) (byte) 100, "headlabcoordinator", "headlabcoordinator", "Alice", true);
        headLabCoordinator5.setApproved(false);
    }

    @Test
    public void test1304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1304");
        com.reservation_system.model.HeadLabCoordinator headLabCoordinator5 = new com.reservation_system.model.HeadLabCoordinator((int) (byte) 10, "labmanager", "hi!", "headlabcoordinator", false);
    }

    @Test
    public void test1305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1305");
        com.reservation_system.model.Student student5 = new com.reservation_system.model.Student((-1), "headlabcoordinator", "faculty", "Guest", false);
        java.lang.String str6 = student5.getName();
        student5.setApproved(false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "headlabcoordinator" + "'", str6, "headlabcoordinator");
    }

    @Test
    public void test1306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1306");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("data/test-userrepo.csv");
        int int2 = userRepository1.getNextID();
        int int3 = userRepository1.getNextID();
        com.reservation_system.model.Researcher researcher9 = new com.reservation_system.model.Researcher((int) (byte) 1, "Faculty", "", "Guest", false);
        userRepository1.addUser((com.reservation_system.model.User) researcher9);
        int int11 = userRepository1.getNextID();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 101 + "'", int2 == 101);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 101 + "'", int3 == 101);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 101 + "'", int11 == 101);
    }

    @Test
    public void test1307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1307");
        com.reservation_system.model.Guest guest5 = new com.reservation_system.model.Guest(35, "Password1!", "guest", "guest", true);
        java.lang.String str6 = guest5.getUserType();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Guest" + "'", str6, "Guest");
    }

    @Test
    public void test1308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1308");
        com.reservation_system.model.HeadLabCoordinator headLabCoordinator5 = new com.reservation_system.model.HeadLabCoordinator((int) (short) 1, "Alice", "Student", "Password1!", false);
    }

    @Test
    public void test1309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1309");
        com.reservation_system.model.LabManager labManager5 = new com.reservation_system.model.LabManager(0, "Researcher", "Student", "Password1!", false);
    }

    @Test
    public void test1310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1310");
        com.reservation_system.model.User user6 = com.reservation_system.patterns.factory.UserFactory.createUser("headlabcoordinator", 102, "Student", "", "faculty", false);
        org.junit.Assert.assertNotNull(user6);
    }

    @Test
    public void test1311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1311");
        com.reservation_system.model.User user6 = com.reservation_system.patterns.factory.UserFactory.createUser("Guest", (int) (short) 10, "Password1!", "data/test-userrepo.csv", "researcher", false);
        boolean boolean7 = user6.requiresDepartmentApproval();
        user6.setApproved(true);
        boolean boolean10 = user6.requiresDepartmentApproval();
        org.junit.Assert.assertNotNull(user6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test1312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1312");
        com.reservation_system.model.Student student5 = new com.reservation_system.model.Student(5, "Student", "Student", "", true);
        student5.setApproved(false);
    }

    @Test
    public void test1313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1313");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("data/test-userrepo.csv");
        com.reservation_system.model.Researcher researcher7 = new com.reservation_system.model.Researcher(5, "hi!", "labmanager", "Guest", false);
        userRepository1.addUser((com.reservation_system.model.User) researcher7);
        int int9 = userRepository1.getNextID();
        java.util.List<com.reservation_system.model.User> userList10 = userRepository1.getAllUsers();
        boolean boolean11 = userRepository1.headLabCoordinatorExists();
        com.reservation_system.model.LabManager labManager17 = new com.reservation_system.model.LabManager((int) (short) 1, "Guest", "student", "labmanager", true);
        userRepository1.addUser((com.reservation_system.model.User) labManager17);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 101 + "'", int9 == 101);
        org.junit.Assert.assertNotNull(userList10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test1314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1314");
        com.reservation_system.model.LabManager labManager5 = new com.reservation_system.model.LabManager(6, "", "Researcher", "Researcher", true);
        java.lang.String str6 = labManager5.getUserType();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "labmanager" + "'", str6, "labmanager");
    }

    @Test
    public void test1315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1315");
        com.reservation_system.model.Faculty faculty5 = new com.reservation_system.model.Faculty((int) (short) 1, "alice@example.com", "Password1!", "Student", false);
        java.lang.String str6 = faculty5.getUserType();
        boolean boolean7 = faculty5.requiresDepartmentApproval();
        boolean boolean8 = faculty5.requiresDepartmentApproval();
        java.lang.String str9 = faculty5.getUserType();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Faculty" + "'", str6, "Faculty");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Faculty" + "'", str9, "Faculty");
    }

    @Test
    public void test1316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1316");
        com.reservation_system.model.LabManager labManager5 = new com.reservation_system.model.LabManager((int) (byte) 100, "researcher", "alice@example.com", "", false);
        boolean boolean6 = labManager5.requiresDepartmentApproval();
        java.lang.String str7 = labManager5.getEmail();
        boolean boolean8 = labManager5.isApproved();
        boolean boolean9 = labManager5.requiresDepartmentApproval();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test1317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1317");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("data/test-userrepo.csv");
        int int2 = userRepository1.getNextID();
        boolean boolean3 = userRepository1.headLabCoordinatorExists();
        com.reservation_system.model.Guest guest9 = new com.reservation_system.model.Guest((int) (byte) -1, "hi!", "", "Password1!", false);
        userRepository1.addUser((com.reservation_system.model.User) guest9);
        int int11 = userRepository1.getNextID();
        boolean boolean13 = userRepository1.emailExists("headlabcoordinator");
        java.util.List<com.reservation_system.model.User> userList14 = userRepository1.getAllUsers();
        com.reservation_system.model.LabManager labManager20 = new com.reservation_system.model.LabManager(10, "Password1!", "data/test-userrepo.csv", "Guest", true);
        java.lang.String str21 = labManager20.getUserType();
        java.lang.String str22 = labManager20.getPassword();
        java.lang.String str23 = labManager20.getEmail();
        userRepository1.addUser((com.reservation_system.model.User) labManager20);
        boolean boolean25 = userRepository1.headLabCoordinatorExists();
        com.reservation_system.repository.UserRepository userRepository27 = new com.reservation_system.repository.UserRepository("data/test-userrepo.csv");
        com.reservation_system.model.Researcher researcher33 = new com.reservation_system.model.Researcher(5, "hi!", "labmanager", "Guest", false);
        userRepository27.addUser((com.reservation_system.model.User) researcher33);
        int int35 = researcher33.getID();
        boolean boolean36 = researcher33.requiresDepartmentApproval();
        userRepository1.addUser((com.reservation_system.model.User) researcher33);
        java.lang.String str38 = researcher33.getUserType();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 101 + "'", int2 == 101);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 101 + "'", int11 == 101);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(userList14);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "labmanager" + "'", str21, "labmanager");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "Guest" + "'", str22, "Guest");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "data/test-userrepo.csv" + "'", str23, "data/test-userrepo.csv");
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 5 + "'", int35 == 5);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "Researcher" + "'", str38, "Researcher");
    }

    @Test
    public void test1318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1318");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("data/test-userrepo.csv");
        java.util.List<com.reservation_system.model.User> userList2 = userRepository1.getAllUsers();
        boolean boolean3 = userRepository1.headLabCoordinatorExists();
        int int4 = userRepository1.getNextID();
        org.junit.Assert.assertNotNull(userList2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 101 + "'", int4 == 101);
    }

    @Test
    public void test1319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1319");
        com.reservation_system.model.Student student5 = new com.reservation_system.model.Student(0, "data/test-userrepo.csv", "researcher", "", true);
        java.lang.String str6 = student5.getUserType();
        boolean boolean7 = student5.isApproved();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Student" + "'", str6, "Student");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test1320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1320");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("data/test-userrepo.csv");
        int int2 = userRepository1.getNextID();
        int int3 = userRepository1.getNextID();
        com.reservation_system.model.HeadLabCoordinator headLabCoordinator9 = new com.reservation_system.model.HeadLabCoordinator((int) (byte) 1, "", "", "guest", false);
        userRepository1.addUser((com.reservation_system.model.User) headLabCoordinator9);
        java.util.List<com.reservation_system.model.User> userList11 = userRepository1.getAllUsers();
        boolean boolean13 = userRepository1.emailExists("Faculty");
        java.util.List<com.reservation_system.model.User> userList14 = userRepository1.getAllUsers();
        com.reservation_system.model.Guest guest20 = new com.reservation_system.model.Guest(100, "Researcher", "data/test-userrepo.csv", "data/test-userrepo.csv", true);
        userRepository1.addUser((com.reservation_system.model.User) guest20);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 101 + "'", int2 == 101);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 101 + "'", int3 == 101);
        org.junit.Assert.assertNotNull(userList11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(userList14);
    }

    @Test
    public void test1321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1321");
        com.reservation_system.model.Researcher researcher5 = new com.reservation_system.model.Researcher((int) 'a', "labmanager", "faculty", "", false);
        boolean boolean6 = researcher5.isApproved();
        java.lang.String str7 = researcher5.getName();
        researcher5.setApproved(true);
        java.lang.String str10 = researcher5.getUserType();
        java.lang.String str11 = researcher5.getUserType();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "labmanager" + "'", str7, "labmanager");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Researcher" + "'", str10, "Researcher");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Researcher" + "'", str11, "Researcher");
    }

    @Test
    public void test1322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1322");
        com.reservation_system.model.Faculty faculty5 = new com.reservation_system.model.Faculty(10, "", "alice@example.com", "Password1!", false);
        java.lang.String str6 = faculty5.getUserType();
        java.lang.String str7 = faculty5.getPassword();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Faculty" + "'", str6, "Faculty");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Password1!" + "'", str7, "Password1!");
    }

    @Test
    public void test1323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1323");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("data/test-userrepo.csv");
        int int2 = userRepository1.getNextID();
        boolean boolean3 = userRepository1.headLabCoordinatorExists();
        com.reservation_system.model.Guest guest9 = new com.reservation_system.model.Guest((int) (byte) -1, "hi!", "", "Password1!", false);
        userRepository1.addUser((com.reservation_system.model.User) guest9);
        int int11 = userRepository1.getNextID();
        boolean boolean13 = userRepository1.emailExists("headlabcoordinator");
        boolean boolean14 = userRepository1.headLabCoordinatorExists();
        com.reservation_system.repository.UserRepository userRepository16 = new com.reservation_system.repository.UserRepository("data/test-userrepo.csv");
        boolean boolean18 = userRepository16.emailExists("Password1!");
        boolean boolean20 = userRepository16.emailExists("hi!");
        java.util.List<com.reservation_system.model.User> userList21 = userRepository16.getAllUsers();
        userRepository1.saveAllUsers(userList21);
        java.util.Optional<com.reservation_system.model.User> userOptional24 = userRepository1.findByEmail("guest");
        int int25 = userRepository1.getNextID();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 101 + "'", int2 == 101);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 101 + "'", int11 == 101);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertNotNull(userList21);
        org.junit.Assert.assertNotNull(userOptional24);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 101 + "'", int25 == 101);
    }

    @Test
    public void test1324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1324");
        com.reservation_system.model.Researcher researcher5 = new com.reservation_system.model.Researcher(5, "", "Alice", "researcher", false);
        boolean boolean6 = researcher5.requiresDepartmentApproval();
        java.lang.String str7 = researcher5.getUserType();
        java.lang.String str8 = researcher5.getEmail();
        java.lang.String str9 = researcher5.getUserType();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Researcher" + "'", str7, "Researcher");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Alice" + "'", str8, "Alice");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Researcher" + "'", str9, "Researcher");
    }

    @Test
    public void test1325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1325");
        com.reservation_system.model.Researcher researcher5 = new com.reservation_system.model.Researcher((int) (byte) 1, "data/test-userrepo.csv", "alice@example.com", "", false);
        boolean boolean6 = researcher5.isApproved();
        java.lang.String str7 = researcher5.getUserType();
        java.lang.String str8 = researcher5.getUserType();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Researcher" + "'", str7, "Researcher");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Researcher" + "'", str8, "Researcher");
    }

    @Test
    public void test1326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1326");
        com.reservation_system.model.Guest guest5 = new com.reservation_system.model.Guest((int) (byte) 1, "Researcher", "labmanager", "labmanager", true);
        java.lang.String str6 = guest5.getEmail();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "labmanager" + "'", str6, "labmanager");
    }

    @Test
    public void test1327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1327");
        // The following exception was thrown during execution in test generation
        try {
            com.reservation_system.model.User user6 = com.reservation_system.patterns.factory.UserFactory.createUser("data/test-userrepo.csv", 100, "", "faculty", "labmanager", true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid user type: data/test-userrepo.csv");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1328");
        com.reservation_system.model.Student student5 = new com.reservation_system.model.Student((int) (byte) 0, "guest", "student", "hi!", false);
    }

    @Test
    public void test1329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1329");
        com.reservation_system.model.Faculty faculty5 = new com.reservation_system.model.Faculty(5, "researcher", "guest", "faculty", true);
        java.lang.String str6 = faculty5.getUserType();
        boolean boolean7 = faculty5.isApproved();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Faculty" + "'", str6, "Faculty");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test1330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1330");
        com.reservation_system.model.User user6 = com.reservation_system.patterns.factory.UserFactory.createUser("labmanager", (int) (short) 10, "Faculty", "hi!", "Password1!", true);
        user6.setApproved(false);
        java.lang.String str9 = user6.getName();
        org.junit.Assert.assertNotNull(user6);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Faculty" + "'", str9, "Faculty");
    }

    @Test
    public void test1331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1331");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("data/test-userrepo.csv");
        int int2 = userRepository1.getNextID();
        boolean boolean4 = userRepository1.emailExists("Alice");
        java.util.Optional<com.reservation_system.model.User> userOptional6 = userRepository1.findByEmail("labmanager");
        java.util.List<com.reservation_system.model.User> userList7 = userRepository1.getAllUsers();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 101 + "'", int2 == 101);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(userOptional6);
        org.junit.Assert.assertNotNull(userList7);
    }

    @Test
    public void test1332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1332");
        com.reservation_system.model.LabManager labManager5 = new com.reservation_system.model.LabManager(0, "Student", "", "Password1!", true);
    }

    @Test
    public void test1333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1333");
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
        com.reservation_system.model.Guest guest30 = new com.reservation_system.model.Guest((int) '#', "alice@example.com", "data/test-userrepo.csv", "headlabcoordinator", true);
        java.lang.String str31 = guest30.getUserType();
        userRepository1.addUser((com.reservation_system.model.User) guest30);
        int int33 = userRepository1.getNextID();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Faculty" + "'", str8, "Faculty");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Faculty" + "'", str9, "Faculty");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(userList17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 101 + "'", int18 == 101);
        org.junit.Assert.assertNotNull(userList19);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 101 + "'", int23 == 101);
        org.junit.Assert.assertNotNull(userList24);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "Guest" + "'", str31, "Guest");
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 101 + "'", int33 == 101);
    }

    @Test
    public void test1334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1334");
        com.reservation_system.model.Researcher researcher5 = new com.reservation_system.model.Researcher(10, "faculty", "guest", "Student", false);
        java.lang.String str6 = researcher5.getUserType();
        java.lang.Class<?> wildcardClass7 = researcher5.getClass();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Researcher" + "'", str6, "Researcher");
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test1335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1335");
        com.reservation_system.model.HeadLabCoordinator headLabCoordinator5 = new com.reservation_system.model.HeadLabCoordinator(0, "Guest", "Faculty", "guest", false);
        java.lang.String str6 = headLabCoordinator5.getUserType();
        java.lang.String str7 = headLabCoordinator5.getName();
        java.lang.String str8 = headLabCoordinator5.getEmail();
        headLabCoordinator5.setApproved(true);
        java.lang.String str11 = headLabCoordinator5.getUserType();
        java.lang.String str12 = headLabCoordinator5.getPassword();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "headlabcoordinator" + "'", str6, "headlabcoordinator");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Guest" + "'", str7, "Guest");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Faculty" + "'", str8, "Faculty");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "headlabcoordinator" + "'", str11, "headlabcoordinator");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "guest" + "'", str12, "guest");
    }

    @Test
    public void test1336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1336");
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
        java.util.List<com.reservation_system.model.User> userList25 = userRepository1.getAllUsers();
        org.junit.Assert.assertNotNull(userList9);
        org.junit.Assert.assertNotNull(userOptional20);
        org.junit.Assert.assertNotNull(userList21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 101 + "'", int24 == 101);
        org.junit.Assert.assertNotNull(userList25);
    }

    @Test
    public void test1337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1337");
        com.reservation_system.model.Faculty faculty5 = new com.reservation_system.model.Faculty(0, "Alice", "guest", "student", false);
        int int6 = faculty5.getID();
        java.lang.String str7 = faculty5.getPassword();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "student" + "'", str7, "student");
    }

    @Test
    public void test1338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1338");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("data/test-userrepo.csv");
        com.reservation_system.model.Researcher researcher7 = new com.reservation_system.model.Researcher(5, "hi!", "labmanager", "Guest", false);
        userRepository1.addUser((com.reservation_system.model.User) researcher7);
        int int9 = userRepository1.getNextID();
        int int10 = userRepository1.getNextID();
        int int11 = userRepository1.getNextID();
        int int12 = userRepository1.getNextID();
        boolean boolean13 = userRepository1.headLabCoordinatorExists();
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 101 + "'", int9 == 101);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 101 + "'", int10 == 101);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 101 + "'", int11 == 101);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 101 + "'", int12 == 101);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test1339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1339");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("data/test-userrepo.csv");
        java.util.List<com.reservation_system.model.User> userList2 = userRepository1.getAllUsers();
        int int3 = userRepository1.getNextID();
        boolean boolean5 = userRepository1.emailExists("headlabcoordinator");
        boolean boolean6 = userRepository1.headLabCoordinatorExists();
        int int7 = userRepository1.getNextID();
        boolean boolean9 = userRepository1.emailExists("Researcher");
        java.util.Optional<com.reservation_system.model.User> userOptional11 = userRepository1.findByEmail("researcher");
        java.util.Optional<com.reservation_system.model.User> userOptional13 = userRepository1.findByEmail("student");
        org.junit.Assert.assertNotNull(userList2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 101 + "'", int3 == 101);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 101 + "'", int7 == 101);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(userOptional11);
        org.junit.Assert.assertNotNull(userOptional13);
    }

    @Test
    public void test1340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1340");
        com.reservation_system.model.HeadLabCoordinator headLabCoordinator5 = new com.reservation_system.model.HeadLabCoordinator((int) (byte) 100, "Faculty", "", "faculty", false);
    }

    @Test
    public void test1341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1341");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("data/test-userrepo.csv");
        com.reservation_system.model.Researcher researcher7 = new com.reservation_system.model.Researcher(5, "hi!", "labmanager", "Guest", false);
        userRepository1.addUser((com.reservation_system.model.User) researcher7);
        int int9 = userRepository1.getNextID();
        boolean boolean11 = userRepository1.emailExists("Researcher");
        com.reservation_system.repository.UserRepository userRepository13 = new com.reservation_system.repository.UserRepository("data/test-userrepo.csv");
        java.util.List<com.reservation_system.model.User> userList14 = userRepository13.getAllUsers();
        int int15 = userRepository13.getNextID();
        java.util.List<com.reservation_system.model.User> userList16 = userRepository13.getAllUsers();
        userRepository1.saveAllUsers(userList16);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 101 + "'", int9 == 101);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(userList14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 101 + "'", int15 == 101);
        org.junit.Assert.assertNotNull(userList16);
    }

    @Test
    public void test1342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1342");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("data/test-userrepo.csv");
        boolean boolean3 = userRepository1.emailExists("Alice");
        java.util.List<com.reservation_system.model.User> userList4 = userRepository1.getAllUsers();
        java.util.List<com.reservation_system.model.User> userList5 = userRepository1.getAllUsers();
        com.reservation_system.model.Faculty faculty11 = new com.reservation_system.model.Faculty((int) (byte) 100, "", "labmanager", "faculty", true);
        int int12 = faculty11.getID();
        int int13 = faculty11.getID();
        userRepository1.addUser((com.reservation_system.model.User) faculty11);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(userList4);
        org.junit.Assert.assertNotNull(userList5);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 100 + "'", int12 == 100);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 100 + "'", int13 == 100);
    }

    @Test
    public void test1343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1343");
        com.reservation_system.model.HeadLabCoordinator headLabCoordinator5 = new com.reservation_system.model.HeadLabCoordinator(97, "Alice", "student", "faculty", false);
        headLabCoordinator5.setApproved(true);
    }

    @Test
    public void test1344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1344");
        com.reservation_system.model.Student student5 = new com.reservation_system.model.Student(98, "labmanager", "data/test-userrepo.csv", "student", false);
        java.lang.String str6 = student5.getUserType();
        java.lang.String str7 = student5.getName();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Student" + "'", str6, "Student");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "labmanager" + "'", str7, "labmanager");
    }

    @Test
    public void test1345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1345");
        com.reservation_system.model.Guest guest5 = new com.reservation_system.model.Guest(0, "Password1!", "data/test-userrepo.csv", "researcher", false);
        boolean boolean6 = guest5.requiresDepartmentApproval();
        java.lang.String str7 = guest5.getUserType();
        java.lang.String str8 = guest5.getUserType();
        java.lang.String str9 = guest5.getUserType();
        java.lang.String str10 = guest5.getEmail();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Guest" + "'", str7, "Guest");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Guest" + "'", str8, "Guest");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Guest" + "'", str9, "Guest");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "data/test-userrepo.csv" + "'", str10, "data/test-userrepo.csv");
    }

    @Test
    public void test1346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1346");
        com.reservation_system.model.HeadLabCoordinator headLabCoordinator5 = new com.reservation_system.model.HeadLabCoordinator((int) (byte) 0, "labmanager", "Guest", "", false);
        java.lang.String str6 = headLabCoordinator5.getUserType();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "headlabcoordinator" + "'", str6, "headlabcoordinator");
    }

    @Test
    public void test1347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1347");
        com.reservation_system.model.User user6 = com.reservation_system.patterns.factory.UserFactory.createUser("headlabcoordinator", (int) ' ', "", "researcher", "headlabcoordinator", true);
        org.junit.Assert.assertNotNull(user6);
    }

    @Test
    public void test1348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1348");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("data/test-userrepo.csv");
        java.util.List<com.reservation_system.model.User> userList2 = userRepository1.getAllUsers();
        int int3 = userRepository1.getNextID();
        boolean boolean5 = userRepository1.emailExists("headlabcoordinator");
        boolean boolean6 = userRepository1.headLabCoordinatorExists();
        java.util.Optional<com.reservation_system.model.User> userOptional8 = userRepository1.findByEmail("Alice");
        boolean boolean10 = userRepository1.emailExists("Alice");
        java.util.Optional<com.reservation_system.model.User> userOptional12 = userRepository1.findByEmail("Alice");
        boolean boolean14 = userRepository1.emailExists("researcher");
        java.util.Optional<com.reservation_system.model.User> userOptional16 = userRepository1.findByEmail("data/test-userrepo.csv");
        java.util.List<com.reservation_system.model.User> userList17 = userRepository1.getAllUsers();
        boolean boolean19 = userRepository1.emailExists("Guest");
        org.junit.Assert.assertNotNull(userList2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 101 + "'", int3 == 101);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(userOptional8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(userOptional12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(userOptional16);
        org.junit.Assert.assertNotNull(userList17);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
    }

    @Test
    public void test1349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1349");
        com.reservation_system.model.Faculty faculty5 = new com.reservation_system.model.Faculty(5, "student", "labmanager", "researcher", false);
        int int6 = faculty5.getID();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 5 + "'", int6 == 5);
    }

    @Test
    public void test1350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1350");
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
        headLabCoordinator17.setApproved(false);
        java.lang.String str21 = headLabCoordinator17.getUserType();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 101 + "'", int4 == 101);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "headlabcoordinator" + "'", str21, "headlabcoordinator");
    }

    @Test
    public void test1351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1351");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("data/test-userrepo.csv");
        com.reservation_system.model.Researcher researcher7 = new com.reservation_system.model.Researcher(5, "hi!", "labmanager", "Guest", false);
        userRepository1.addUser((com.reservation_system.model.User) researcher7);
        java.util.Optional<com.reservation_system.model.User> userOptional10 = userRepository1.findByEmail("alice@example.com");
        java.util.List<com.reservation_system.model.User> userList11 = userRepository1.getAllUsers();
        java.util.Optional<com.reservation_system.model.User> userOptional13 = userRepository1.findByEmail("Password1!");
        int int14 = userRepository1.getNextID();
        boolean boolean16 = userRepository1.emailExists("Guest");
        java.util.Optional<com.reservation_system.model.User> userOptional18 = userRepository1.findByEmail("");
        org.junit.Assert.assertNotNull(userOptional10);
        org.junit.Assert.assertNotNull(userList11);
        org.junit.Assert.assertNotNull(userOptional13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 101 + "'", int14 == 101);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNotNull(userOptional18);
    }

    @Test
    public void test1352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1352");
        com.reservation_system.model.Researcher researcher5 = new com.reservation_system.model.Researcher(0, "", "Password1!", "researcher", false);
        researcher5.setApproved(true);
        int int8 = researcher5.getID();
        boolean boolean9 = researcher5.isApproved();
        java.lang.String str10 = researcher5.getUserType();
        java.lang.String str11 = researcher5.getUserType();
        researcher5.setApproved(true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Researcher" + "'", str10, "Researcher");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Researcher" + "'", str11, "Researcher");
    }

    @Test
    public void test1353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1353");
        com.reservation_system.model.HeadLabCoordinator headLabCoordinator5 = new com.reservation_system.model.HeadLabCoordinator(0, "Guest", "Faculty", "guest", false);
        java.lang.String str6 = headLabCoordinator5.getUserType();
        java.lang.String str7 = headLabCoordinator5.getName();
        java.lang.String str8 = headLabCoordinator5.getEmail();
        headLabCoordinator5.setApproved(true);
        java.lang.String str11 = headLabCoordinator5.getUserType();
        java.lang.String str12 = headLabCoordinator5.getUserType();
        java.lang.String str13 = headLabCoordinator5.getName();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "headlabcoordinator" + "'", str6, "headlabcoordinator");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Guest" + "'", str7, "Guest");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Faculty" + "'", str8, "Faculty");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "headlabcoordinator" + "'", str11, "headlabcoordinator");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "headlabcoordinator" + "'", str12, "headlabcoordinator");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Guest" + "'", str13, "Guest");
    }

    @Test
    public void test1354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1354");
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
        java.util.Optional<com.reservation_system.model.User> userOptional30 = userRepository1.findByEmail("labmanager");
        org.junit.Assert.assertNotNull(userList2);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Guest" + "'", str10, "Guest");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Guest" + "'", str11, "Guest");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Guest" + "'", str14, "Guest");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "Faculty" + "'", str22, "Faculty");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "Faculty" + "'", str23, "Faculty");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "Faculty" + "'", str24, "Faculty");
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertNotNull(userOptional30);
    }

    @Test
    public void test1355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1355");
        com.reservation_system.model.Faculty faculty5 = new com.reservation_system.model.Faculty(52, "Student", "Researcher", "", true);
    }

    @Test
    public void test1356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1356");
        // The following exception was thrown during execution in test generation
        try {
            com.reservation_system.model.User user6 = com.reservation_system.patterns.factory.UserFactory.createUser("Alice", (int) (byte) 10, "Faculty", "Student", "researcher", true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid user type: Alice");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1357");
        com.reservation_system.model.HeadLabCoordinator headLabCoordinator5 = new com.reservation_system.model.HeadLabCoordinator(35, "faculty", "guest", "guest", true);
        boolean boolean6 = headLabCoordinator5.requiresDepartmentApproval();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test1358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1358");
        com.reservation_system.model.User user6 = com.reservation_system.patterns.factory.UserFactory.createUser("Faculty", 98, "", "", "guest", false);
        org.junit.Assert.assertNotNull(user6);
    }

    @Test
    public void test1359() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1359");
        com.reservation_system.model.Researcher researcher5 = new com.reservation_system.model.Researcher((int) (byte) 1, "headlabcoordinator", "faculty", "Student", true);
    }

    @Test
    public void test1360() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1360");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("data/test-userrepo.csv");
        java.util.List<com.reservation_system.model.User> userList2 = userRepository1.getAllUsers();
        int int3 = userRepository1.getNextID();
        com.reservation_system.repository.UserRepository userRepository5 = new com.reservation_system.repository.UserRepository("data/test-userrepo.csv");
        boolean boolean7 = userRepository5.emailExists("Alice");
        int int8 = userRepository5.getNextID();
        boolean boolean9 = userRepository5.headLabCoordinatorExists();
        boolean boolean10 = userRepository5.headLabCoordinatorExists();
        boolean boolean12 = userRepository5.emailExists("Researcher");
        boolean boolean14 = userRepository5.emailExists("alice@example.com");
        com.reservation_system.repository.UserRepository userRepository16 = new com.reservation_system.repository.UserRepository("data/test-userrepo.csv");
        int int17 = userRepository16.getNextID();
        boolean boolean18 = userRepository16.headLabCoordinatorExists();
        com.reservation_system.model.Guest guest24 = new com.reservation_system.model.Guest((int) (byte) -1, "hi!", "", "Password1!", false);
        userRepository16.addUser((com.reservation_system.model.User) guest24);
        int int26 = userRepository16.getNextID();
        boolean boolean28 = userRepository16.emailExists("headlabcoordinator");
        java.util.List<com.reservation_system.model.User> userList29 = userRepository16.getAllUsers();
        int int30 = userRepository16.getNextID();
        java.util.List<com.reservation_system.model.User> userList31 = userRepository16.getAllUsers();
        userRepository5.saveAllUsers(userList31);
        userRepository1.saveAllUsers(userList31);
        org.junit.Assert.assertNotNull(userList2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 101 + "'", int3 == 101);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 101 + "'", int8 == 101);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
// flaky "13) test1360(com.reservation_system.randoop.userrepository.RegressionTest2)":         org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 101 + "'", int17 == 101);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 101 + "'", int26 == 101);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNotNull(userList29);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 101 + "'", int30 == 101);
        org.junit.Assert.assertNotNull(userList31);
    }

    @Test
    public void test1361() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1361");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("data/test-userrepo.csv");
        com.reservation_system.model.Researcher researcher7 = new com.reservation_system.model.Researcher(5, "hi!", "labmanager", "Guest", false);
        userRepository1.addUser((com.reservation_system.model.User) researcher7);
        int int9 = userRepository1.getNextID();
        boolean boolean11 = userRepository1.emailExists("Researcher");
        boolean boolean12 = userRepository1.headLabCoordinatorExists();
        com.reservation_system.model.Faculty faculty18 = new com.reservation_system.model.Faculty(10, "", "alice@example.com", "Password1!", false);
        java.lang.String str19 = faculty18.getUserType();
        java.lang.String str20 = faculty18.getUserType();
        userRepository1.addUser((com.reservation_system.model.User) faculty18);
        com.reservation_system.repository.UserRepository userRepository23 = new com.reservation_system.repository.UserRepository("data/test-userrepo.csv");
        int int24 = userRepository23.getNextID();
        boolean boolean25 = userRepository23.headLabCoordinatorExists();
        com.reservation_system.model.Guest guest31 = new com.reservation_system.model.Guest((int) (byte) -1, "hi!", "", "Password1!", false);
        userRepository23.addUser((com.reservation_system.model.User) guest31);
        int int33 = userRepository23.getNextID();
        boolean boolean35 = userRepository23.emailExists("headlabcoordinator");
        boolean boolean36 = userRepository23.headLabCoordinatorExists();
        com.reservation_system.repository.UserRepository userRepository38 = new com.reservation_system.repository.UserRepository("data/test-userrepo.csv");
        boolean boolean40 = userRepository38.emailExists("Password1!");
        boolean boolean42 = userRepository38.emailExists("hi!");
        java.util.List<com.reservation_system.model.User> userList43 = userRepository38.getAllUsers();
        userRepository23.saveAllUsers(userList43);
        userRepository1.saveAllUsers(userList43);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 101 + "'", int9 == 101);
// flaky "14) test1361(com.reservation_system.randoop.userrepository.RegressionTest2)":         org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "Faculty" + "'", str19, "Faculty");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "Faculty" + "'", str20, "Faculty");
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 101 + "'", int24 == 101);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 101 + "'", int33 == 101);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + true + "'", boolean40 == true);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + true + "'", boolean42 == true);
        org.junit.Assert.assertNotNull(userList43);
    }

    @Test
    public void test1362() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1362");
        com.reservation_system.model.Guest guest5 = new com.reservation_system.model.Guest((int) '4', "Password1!", "student", "researcher", false);
    }

    @Test
    public void test1363() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1363");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("data/test-userrepo.csv");
        com.reservation_system.model.Researcher researcher7 = new com.reservation_system.model.Researcher(5, "hi!", "labmanager", "Guest", false);
        userRepository1.addUser((com.reservation_system.model.User) researcher7);
        java.util.List<com.reservation_system.model.User> userList9 = userRepository1.getAllUsers();
        boolean boolean10 = userRepository1.headLabCoordinatorExists();
        boolean boolean12 = userRepository1.emailExists("guest");
        java.util.Optional<com.reservation_system.model.User> userOptional14 = userRepository1.findByEmail("researcher");
        java.util.Optional<com.reservation_system.model.User> userOptional16 = userRepository1.findByEmail("");
        com.reservation_system.model.User user23 = com.reservation_system.patterns.factory.UserFactory.createUser("headlabcoordinator", 10, "Researcher", "guest", "Password1!", false);
        userRepository1.addUser(user23);
        boolean boolean25 = user23.isApproved();
        org.junit.Assert.assertNotNull(userList9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(userOptional14);
        org.junit.Assert.assertNotNull(userOptional16);
        org.junit.Assert.assertNotNull(user23);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
    }

    @Test
    public void test1364() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1364");
        com.reservation_system.model.Student student5 = new com.reservation_system.model.Student(52, "guest", "alice@example.com", "guest", true);
        java.lang.String str6 = student5.getEmail();
    }

    @Test
    public void test1365() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1365");
        com.reservation_system.model.Faculty faculty5 = new com.reservation_system.model.Faculty(5, "researcher", "guest", "faculty", true);
        java.lang.String str6 = faculty5.getUserType();
        java.lang.String str7 = faculty5.getUserType();
        boolean boolean8 = faculty5.requiresDepartmentApproval();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Faculty" + "'", str6, "Faculty");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Faculty" + "'", str7, "Faculty");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test1366() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1366");
        com.reservation_system.model.HeadLabCoordinator headLabCoordinator5 = new com.reservation_system.model.HeadLabCoordinator(102, "alice@example.com", "guest", "student", false);
    }

    @Test
    public void test1367() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1367");
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
        int int21 = userRepository1.getNextID();
        java.util.List<com.reservation_system.model.User> userList22 = userRepository1.getAllUsers();
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
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 101 + "'", int21 == 101);
        org.junit.Assert.assertNotNull(userList22);
    }

    @Test
    public void test1368() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1368");
        com.reservation_system.model.HeadLabCoordinator headLabCoordinator5 = new com.reservation_system.model.HeadLabCoordinator((int) '#', "Alice", "data/test-userrepo.csv", "faculty", false);
        java.lang.String str6 = headLabCoordinator5.getName();
        java.lang.String str7 = headLabCoordinator5.getPassword();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Alice" + "'", str6, "Alice");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "faculty" + "'", str7, "faculty");
    }

    @Test
    public void test1369() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1369");
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
        com.reservation_system.repository.UserRepository userRepository32 = new com.reservation_system.repository.UserRepository("data/test-userrepo.csv");
        int int33 = userRepository32.getNextID();
        boolean boolean34 = userRepository32.headLabCoordinatorExists();
        com.reservation_system.repository.UserRepository userRepository36 = new com.reservation_system.repository.UserRepository("data/test-userrepo.csv");
        boolean boolean38 = userRepository36.emailExists("Alice");
        com.reservation_system.model.Researcher researcher44 = new com.reservation_system.model.Researcher((int) 'a', "labmanager", "faculty", "", false);
        boolean boolean45 = researcher44.isApproved();
        java.lang.String str46 = researcher44.getName();
        userRepository36.addUser((com.reservation_system.model.User) researcher44);
        boolean boolean48 = userRepository36.headLabCoordinatorExists();
        java.util.List<com.reservation_system.model.User> userList49 = userRepository36.getAllUsers();
        userRepository32.saveAllUsers(userList49);
        com.reservation_system.repository.UserRepository userRepository52 = new com.reservation_system.repository.UserRepository("data/test-userrepo.csv");
        int int53 = userRepository52.getNextID();
        com.reservation_system.repository.UserRepository userRepository55 = new com.reservation_system.repository.UserRepository("data/test-userrepo.csv");
        com.reservation_system.model.Researcher researcher61 = new com.reservation_system.model.Researcher(5, "hi!", "labmanager", "Guest", false);
        userRepository55.addUser((com.reservation_system.model.User) researcher61);
        java.util.List<com.reservation_system.model.User> userList63 = userRepository55.getAllUsers();
        com.reservation_system.model.Guest guest69 = new com.reservation_system.model.Guest(0, "Password1!", "data/test-userrepo.csv", "researcher", false);
        boolean boolean70 = guest69.requiresDepartmentApproval();
        userRepository55.addUser((com.reservation_system.model.User) guest69);
        boolean boolean73 = userRepository55.emailExists("Alice");
        int int74 = userRepository55.getNextID();
        com.reservation_system.repository.UserRepository userRepository76 = new com.reservation_system.repository.UserRepository("data/test-userrepo.csv");
        boolean boolean78 = userRepository76.emailExists("Alice");
        com.reservation_system.repository.UserRepository userRepository80 = new com.reservation_system.repository.UserRepository("data/test-userrepo.csv");
        java.util.List<com.reservation_system.model.User> userList81 = userRepository80.getAllUsers();
        int int82 = userRepository80.getNextID();
        java.util.List<com.reservation_system.model.User> userList83 = userRepository80.getAllUsers();
        userRepository76.saveAllUsers(userList83);
        userRepository55.saveAllUsers(userList83);
        userRepository52.saveAllUsers(userList83);
        userRepository32.saveAllUsers(userList83);
        userRepository1.saveAllUsers(userList83);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 101 + "'", int9 == 101);
        org.junit.Assert.assertNotNull(userOptional11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 101 + "'", int12 == 101);
        org.junit.Assert.assertNotNull(userOptional14);
        org.junit.Assert.assertNotNull(userList17);
        org.junit.Assert.assertNotNull(userList19);
        org.junit.Assert.assertNotNull(user26);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 101 + "'", int28 == 101);
        org.junit.Assert.assertNotNull(userOptional30);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 101 + "'", int33 == 101);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertEquals("'" + str46 + "' != '" + "labmanager" + "'", str46, "labmanager");
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + true + "'", boolean48 == true);
        org.junit.Assert.assertNotNull(userList49);
        org.junit.Assert.assertTrue("'" + int53 + "' != '" + 101 + "'", int53 == 101);
        org.junit.Assert.assertNotNull(userList63);
        org.junit.Assert.assertTrue("'" + boolean70 + "' != '" + false + "'", boolean70 == false);
        org.junit.Assert.assertTrue("'" + boolean73 + "' != '" + false + "'", boolean73 == false);
        org.junit.Assert.assertTrue("'" + int74 + "' != '" + 101 + "'", int74 == 101);
        org.junit.Assert.assertTrue("'" + boolean78 + "' != '" + false + "'", boolean78 == false);
        org.junit.Assert.assertNotNull(userList81);
        org.junit.Assert.assertTrue("'" + int82 + "' != '" + 101 + "'", int82 == 101);
        org.junit.Assert.assertNotNull(userList83);
    }

    @Test
    public void test1370() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1370");
        com.reservation_system.model.Faculty faculty5 = new com.reservation_system.model.Faculty(0, "student", "headlabcoordinator", "guest", true);
    }

    @Test
    public void test1371() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1371");
        com.reservation_system.model.Student student5 = new com.reservation_system.model.Student(1, "data/test-userrepo.csv", "alice@example.com", "guest", false);
        java.lang.String str6 = student5.getUserType();
        student5.setApproved(false);
        java.lang.String str9 = student5.getUserType();
        java.lang.String str10 = student5.getUserType();
        java.lang.String str11 = student5.getUserType();
        java.lang.String str12 = student5.getUserType();
        boolean boolean13 = student5.requiresDepartmentApproval();
        boolean boolean14 = student5.isApproved();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Student" + "'", str6, "Student");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Student" + "'", str9, "Student");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Student" + "'", str10, "Student");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Student" + "'", str11, "Student");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Student" + "'", str12, "Student");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test1372() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1372");
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
        java.util.Optional<com.reservation_system.model.User> userOptional17 = userRepository1.findByEmail("hi!");
        org.junit.Assert.assertNotNull(userList2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 101 + "'", int3 == 101);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(userOptional8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(userOptional17);
    }

    @Test
    public void test1373() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1373");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("data/test-userrepo.csv");
        java.util.List<com.reservation_system.model.User> userList2 = userRepository1.getAllUsers();
        boolean boolean3 = userRepository1.headLabCoordinatorExists();
        com.reservation_system.repository.UserRepository userRepository5 = new com.reservation_system.repository.UserRepository("data/test-userrepo.csv");
        java.util.List<com.reservation_system.model.User> userList6 = userRepository5.getAllUsers();
        com.reservation_system.model.Guest guest12 = new com.reservation_system.model.Guest(0, "Password1!", "data/test-userrepo.csv", "researcher", false);
        boolean boolean13 = guest12.requiresDepartmentApproval();
        java.lang.String str14 = guest12.getUserType();
        java.lang.String str15 = guest12.getUserType();
        guest12.setApproved(true);
        java.lang.String str18 = guest12.getUserType();
        userRepository5.addUser((com.reservation_system.model.User) guest12);
        com.reservation_system.repository.UserRepository userRepository21 = new com.reservation_system.repository.UserRepository("data/test-userrepo.csv");
        java.util.List<com.reservation_system.model.User> userList22 = userRepository21.getAllUsers();
        int int23 = userRepository21.getNextID();
        boolean boolean25 = userRepository21.emailExists("headlabcoordinator");
        boolean boolean26 = userRepository21.headLabCoordinatorExists();
        java.util.Optional<com.reservation_system.model.User> userOptional28 = userRepository21.findByEmail("Alice");
        boolean boolean30 = userRepository21.emailExists("Alice");
        boolean boolean32 = userRepository21.emailExists("Guest");
        boolean boolean34 = userRepository21.emailExists("headlabcoordinator");
        com.reservation_system.repository.UserRepository userRepository36 = new com.reservation_system.repository.UserRepository("data/test-userrepo.csv");
        boolean boolean38 = userRepository36.emailExists("Alice");
        com.reservation_system.model.Researcher researcher44 = new com.reservation_system.model.Researcher((int) 'a', "labmanager", "faculty", "", false);
        boolean boolean45 = researcher44.isApproved();
        java.lang.String str46 = researcher44.getName();
        userRepository36.addUser((com.reservation_system.model.User) researcher44);
        boolean boolean48 = userRepository36.headLabCoordinatorExists();
        java.util.List<com.reservation_system.model.User> userList49 = userRepository36.getAllUsers();
        userRepository21.saveAllUsers(userList49);
        userRepository5.saveAllUsers(userList49);
        java.util.List<com.reservation_system.model.User> userList52 = userRepository5.getAllUsers();
        userRepository1.saveAllUsers(userList52);
        java.lang.Class<?> wildcardClass54 = userList52.getClass();
        org.junit.Assert.assertNotNull(userList2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(userList6);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Guest" + "'", str14, "Guest");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Guest" + "'", str15, "Guest");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Guest" + "'", str18, "Guest");
        org.junit.Assert.assertNotNull(userList22);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 101 + "'", int23 == 101);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertNotNull(userOptional28);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertEquals("'" + str46 + "' != '" + "labmanager" + "'", str46, "labmanager");
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + true + "'", boolean48 == true);
        org.junit.Assert.assertNotNull(userList49);
        org.junit.Assert.assertNotNull(userList52);
        org.junit.Assert.assertNotNull(wildcardClass54);
    }

    @Test
    public void test1374() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1374");
        com.reservation_system.model.Student student5 = new com.reservation_system.model.Student(100, "data/test-userrepo.csv", "", "Guest", true);
    }

    @Test
    public void test1375() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1375");
        com.reservation_system.model.Faculty faculty5 = new com.reservation_system.model.Faculty((int) ' ', "headlabcoordinator", "student", "headlabcoordinator", false);
        java.lang.String str6 = faculty5.getName();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "headlabcoordinator" + "'", str6, "headlabcoordinator");
    }

    @Test
    public void test1376() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1376");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("data/test-userrepo.csv");
        com.reservation_system.model.Researcher researcher7 = new com.reservation_system.model.Researcher(5, "hi!", "labmanager", "Guest", false);
        userRepository1.addUser((com.reservation_system.model.User) researcher7);
        int int9 = userRepository1.getNextID();
        boolean boolean11 = userRepository1.emailExists("Researcher");
        boolean boolean12 = userRepository1.headLabCoordinatorExists();
        java.util.Optional<com.reservation_system.model.User> userOptional14 = userRepository1.findByEmail("researcher");
        boolean boolean15 = userRepository1.headLabCoordinatorExists();
        int int16 = userRepository1.getNextID();
        com.reservation_system.repository.UserRepository userRepository18 = new com.reservation_system.repository.UserRepository("data/test-userrepo.csv");
        int int19 = userRepository18.getNextID();
        int int20 = userRepository18.getNextID();
        java.util.List<com.reservation_system.model.User> userList21 = userRepository18.getAllUsers();
        java.util.List<com.reservation_system.model.User> userList22 = userRepository18.getAllUsers();
        userRepository1.saveAllUsers(userList22);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 101 + "'", int9 == 101);
// flaky "15) test1376(com.reservation_system.randoop.userrepository.RegressionTest2)":         org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(userOptional14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 101 + "'", int16 == 101);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 101 + "'", int19 == 101);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 101 + "'", int20 == 101);
        org.junit.Assert.assertNotNull(userList21);
        org.junit.Assert.assertNotNull(userList22);
    }

    @Test
    public void test1377() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1377");
        com.reservation_system.model.HeadLabCoordinator headLabCoordinator5 = new com.reservation_system.model.HeadLabCoordinator(101, "Student", "researcher", "", false);
        int int6 = headLabCoordinator5.getID();
        java.lang.String str7 = headLabCoordinator5.getUserType();
        headLabCoordinator5.setApproved(false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 101 + "'", int6 == 101);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "headlabcoordinator" + "'", str7, "headlabcoordinator");
    }

    @Test
    public void test1378() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1378");
        com.reservation_system.model.Faculty faculty5 = new com.reservation_system.model.Faculty(52, "Alice", "Student", "", true);
    }

    @Test
    public void test1379() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1379");
        com.reservation_system.model.Researcher researcher5 = new com.reservation_system.model.Researcher(100, "student", "guest", "headlabcoordinator", false);
        java.lang.String str6 = researcher5.getUserType();
        java.lang.String str7 = researcher5.getName();
        java.lang.Class<?> wildcardClass8 = researcher5.getClass();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Researcher" + "'", str6, "Researcher");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "student" + "'", str7, "student");
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test1380() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1380");
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
        java.util.List<com.reservation_system.model.User> userList35 = userRepository1.getAllUsers();
        com.reservation_system.model.Faculty faculty41 = new com.reservation_system.model.Faculty((int) (short) 10, "labmanager", "faculty", "alice@example.com", false);
        java.lang.String str42 = faculty41.getUserType();
        boolean boolean43 = faculty41.isApproved();
        boolean boolean44 = faculty41.isApproved();
        userRepository1.addUser((com.reservation_system.model.User) faculty41);
        java.lang.String str46 = faculty41.getUserType();
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
        org.junit.Assert.assertNotNull(userList35);
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "Faculty" + "'", str42, "Faculty");
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertEquals("'" + str46 + "' != '" + "Faculty" + "'", str46, "Faculty");
    }

    @Test
    public void test1381() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1381");
        com.reservation_system.model.LabManager labManager5 = new com.reservation_system.model.LabManager(98, "Password1!", "headlabcoordinator", "", true);
    }

    @Test
    public void test1382() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1382");
        com.reservation_system.model.Faculty faculty5 = new com.reservation_system.model.Faculty((int) (byte) 0, "Faculty", "Researcher", "headlabcoordinator", true);
        int int6 = faculty5.getID();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test1383() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1383");
        // The following exception was thrown during execution in test generation
        try {
            com.reservation_system.model.User user6 = com.reservation_system.patterns.factory.UserFactory.createUser("", 52, "headlabcoordinator", "", "faculty", false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid user type: ");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1384() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1384");
        com.reservation_system.model.Student student5 = new com.reservation_system.model.Student(5, "student", "data/test-userrepo.csv", "Researcher", true);
        int int6 = student5.getID();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 5 + "'", int6 == 5);
    }

    @Test
    public void test1385() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1385");
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
        com.reservation_system.repository.UserRepository userRepository23 = new com.reservation_system.repository.UserRepository("data/test-userrepo.csv");
        java.util.List<com.reservation_system.model.User> userList24 = userRepository23.getAllUsers();
        int int25 = userRepository23.getNextID();
        boolean boolean27 = userRepository23.emailExists("headlabcoordinator");
        java.util.Optional<com.reservation_system.model.User> userOptional29 = userRepository23.findByEmail("student");
        com.reservation_system.repository.UserRepository userRepository31 = new com.reservation_system.repository.UserRepository("data/test-userrepo.csv");
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
        java.lang.Class<?> wildcardClass45 = userList43.getClass();
        org.junit.Assert.assertNotNull(userList9);
        org.junit.Assert.assertNotNull(userList19);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertNotNull(userList24);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 101 + "'", int25 == 101);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(userOptional29);
        org.junit.Assert.assertNotNull(userList32);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 101 + "'", int33 == 101);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertNotNull(userOptional38);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + true + "'", boolean40 == true);
        org.junit.Assert.assertNotNull(userList41);
        org.junit.Assert.assertNotNull(userList43);
        org.junit.Assert.assertNotNull(wildcardClass45);
    }

    @Test
    public void test1386() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1386");
        com.reservation_system.model.HeadLabCoordinator headLabCoordinator5 = new com.reservation_system.model.HeadLabCoordinator((int) (byte) 10, "Alice", "guest", "alice@example.com", true);
        java.lang.String str6 = headLabCoordinator5.getUserType();
        java.lang.String str7 = headLabCoordinator5.getUserType();
        java.lang.String str8 = headLabCoordinator5.getName();
        headLabCoordinator5.setApproved(true);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "headlabcoordinator" + "'", str6, "headlabcoordinator");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "headlabcoordinator" + "'", str7, "headlabcoordinator");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Alice" + "'", str8, "Alice");
    }

    @Test
    public void test1387() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1387");
        com.reservation_system.model.HeadLabCoordinator headLabCoordinator5 = new com.reservation_system.model.HeadLabCoordinator(100, "data/test-userrepo.csv", "Faculty", "data/test-userrepo.csv", false);
        java.lang.String str6 = headLabCoordinator5.getUserType();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "headlabcoordinator" + "'", str6, "headlabcoordinator");
    }

    @Test
    public void test1388() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1388");
        com.reservation_system.model.Student student5 = new com.reservation_system.model.Student(35, "alice@example.com", "faculty", "researcher", false);
    }

    @Test
    public void test1389() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1389");
        com.reservation_system.model.User user6 = com.reservation_system.patterns.factory.UserFactory.createUser("labmanager", 97, "Password1!", "guest", "Guest", false);
        org.junit.Assert.assertNotNull(user6);
    }

    @Test
    public void test1390() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1390");
        com.reservation_system.model.Student student5 = new com.reservation_system.model.Student(98, "guest", "Researcher", "Guest", false);
    }

    @Test
    public void test1391() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1391");
        com.reservation_system.model.Researcher researcher5 = new com.reservation_system.model.Researcher(100, "student", "guest", "headlabcoordinator", false);
        java.lang.String str6 = researcher5.getUserType();
        java.lang.String str7 = researcher5.getEmail();
        java.lang.String str8 = researcher5.getName();
        java.lang.String str9 = researcher5.getUserType();
        boolean boolean10 = researcher5.isApproved();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Researcher" + "'", str6, "Researcher");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "guest" + "'", str7, "guest");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "student" + "'", str8, "student");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Researcher" + "'", str9, "Researcher");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test1392() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1392");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("data/test-userrepo.csv");
        boolean boolean3 = userRepository1.emailExists("Password1!");
        boolean boolean5 = userRepository1.emailExists("hi!");
        com.reservation_system.model.HeadLabCoordinator headLabCoordinator11 = new com.reservation_system.model.HeadLabCoordinator(1, "Guest", "student", "researcher", true);
        userRepository1.addUser((com.reservation_system.model.User) headLabCoordinator11);
        java.lang.String str13 = headLabCoordinator11.getPassword();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "researcher" + "'", str13, "researcher");
    }

    @Test
    public void test1393() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1393");
        com.reservation_system.model.Researcher researcher5 = new com.reservation_system.model.Researcher(5, "", "Alice", "researcher", false);
        java.lang.String str6 = researcher5.getName();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
    }

    @Test
    public void test1394() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1394");
        com.reservation_system.model.LabManager labManager5 = new com.reservation_system.model.LabManager((-1), "student", "researcher", "researcher", true);
    }

    @Test
    public void test1395() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1395");
        com.reservation_system.model.Student student5 = new com.reservation_system.model.Student((-1), "headlabcoordinator", "faculty", "Guest", false);
        java.lang.String str6 = student5.getUserType();
        java.lang.String str7 = student5.getUserType();
        java.lang.String str8 = student5.getUserType();
        java.lang.String str9 = student5.getUserType();
        int int10 = student5.getID();
        java.lang.Class<?> wildcardClass11 = student5.getClass();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Student" + "'", str6, "Student");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Student" + "'", str7, "Student");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Student" + "'", str8, "Student");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Student" + "'", str9, "Student");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test1396() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1396");
        com.reservation_system.model.Faculty faculty5 = new com.reservation_system.model.Faculty((int) (byte) 10, "", "", "hi!", false);
        boolean boolean6 = faculty5.requiresDepartmentApproval();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test1397() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1397");
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
        int int32 = userRepository1.getNextID();
        java.util.Optional<com.reservation_system.model.User> userOptional34 = userRepository1.findByEmail("data/test-userrepo.csv");
        org.junit.Assert.assertNotNull(userList9);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 101 + "'", int20 == 101);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(userList27);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 101 + "'", int28 == 101);
        org.junit.Assert.assertNotNull(userList29);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 101 + "'", int32 == 101);
        org.junit.Assert.assertNotNull(userOptional34);
    }

    @Test
    public void test1398() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1398");
        com.reservation_system.model.Student student5 = new com.reservation_system.model.Student(100, "hi!", "faculty", "labmanager", false);
        boolean boolean6 = student5.isApproved();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test1399() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1399");
        com.reservation_system.model.User user6 = com.reservation_system.patterns.factory.UserFactory.createUser("faculty", 6, "guest", "Faculty", "", false);
        org.junit.Assert.assertNotNull(user6);
    }

    @Test
    public void test1400() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1400");
        com.reservation_system.model.Student student5 = new com.reservation_system.model.Student(6, "Student", "Password1!", "Faculty", false);
    }

    @Test
    public void test1401() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1401");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("data/test-userrepo.csv");
        int int2 = userRepository1.getNextID();
        boolean boolean3 = userRepository1.headLabCoordinatorExists();
        com.reservation_system.model.Guest guest9 = new com.reservation_system.model.Guest((int) (byte) -1, "hi!", "", "Password1!", false);
        userRepository1.addUser((com.reservation_system.model.User) guest9);
        int int11 = userRepository1.getNextID();
        boolean boolean13 = userRepository1.emailExists("headlabcoordinator");
        java.util.List<com.reservation_system.model.User> userList14 = userRepository1.getAllUsers();
        boolean boolean15 = userRepository1.headLabCoordinatorExists();
        java.lang.Class<?> wildcardClass16 = userRepository1.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 101 + "'", int2 == 101);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 101 + "'", int11 == 101);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(userList14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test1402() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1402");
        com.reservation_system.model.Guest guest5 = new com.reservation_system.model.Guest(99, "hi!", "labmanager", "headlabcoordinator", false);
    }

    @Test
    public void test1403() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1403");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("data/test-userrepo.csv");
        com.reservation_system.model.Researcher researcher7 = new com.reservation_system.model.Researcher(5, "hi!", "labmanager", "Guest", false);
        userRepository1.addUser((com.reservation_system.model.User) researcher7);
        int int9 = userRepository1.getNextID();
        boolean boolean11 = userRepository1.emailExists("Researcher");
        boolean boolean12 = userRepository1.headLabCoordinatorExists();
        java.util.Optional<com.reservation_system.model.User> userOptional14 = userRepository1.findByEmail("researcher");
        boolean boolean15 = userRepository1.headLabCoordinatorExists();
        int int16 = userRepository1.getNextID();
        boolean boolean18 = userRepository1.emailExists("Guest");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 101 + "'", int9 == 101);
// flaky "16) test1403(com.reservation_system.randoop.userrepository.RegressionTest2)":         org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(userOptional14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 101 + "'", int16 == 101);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
    }

    @Test
    public void test1404() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1404");
        com.reservation_system.model.Guest guest5 = new com.reservation_system.model.Guest((int) (byte) 100, "guest", "Faculty", "student", false);
        java.lang.String str6 = guest5.getPassword();
        boolean boolean7 = guest5.requiresDepartmentApproval();
        guest5.setApproved(false);
        java.lang.String str10 = guest5.getUserType();
        guest5.setApproved(true);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "student" + "'", str6, "student");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Guest" + "'", str10, "Guest");
    }

    @Test
    public void test1405() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1405");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("data/test-userrepo.csv");
        java.util.List<com.reservation_system.model.User> userList2 = userRepository1.getAllUsers();
        int int3 = userRepository1.getNextID();
        boolean boolean5 = userRepository1.emailExists("headlabcoordinator");
        boolean boolean6 = userRepository1.headLabCoordinatorExists();
        java.util.Optional<com.reservation_system.model.User> userOptional8 = userRepository1.findByEmail("Alice");
        java.util.Optional<com.reservation_system.model.User> userOptional10 = userRepository1.findByEmail("Student");
        com.reservation_system.repository.UserRepository userRepository12 = new com.reservation_system.repository.UserRepository("data/test-userrepo.csv");
        int int13 = userRepository12.getNextID();
        int int14 = userRepository12.getNextID();
        com.reservation_system.model.HeadLabCoordinator headLabCoordinator20 = new com.reservation_system.model.HeadLabCoordinator((int) (byte) 1, "", "", "guest", false);
        userRepository12.addUser((com.reservation_system.model.User) headLabCoordinator20);
        java.util.List<com.reservation_system.model.User> userList22 = userRepository12.getAllUsers();
        boolean boolean24 = userRepository12.emailExists("Faculty");
        boolean boolean26 = userRepository12.emailExists("Alice");
        java.util.List<com.reservation_system.model.User> userList27 = userRepository12.getAllUsers();
        com.reservation_system.repository.UserRepository userRepository29 = new com.reservation_system.repository.UserRepository("data/test-userrepo.csv");
        com.reservation_system.model.Researcher researcher35 = new com.reservation_system.model.Researcher(5, "hi!", "labmanager", "Guest", false);
        userRepository29.addUser((com.reservation_system.model.User) researcher35);
        java.util.List<com.reservation_system.model.User> userList37 = userRepository29.getAllUsers();
        com.reservation_system.repository.UserRepository userRepository39 = new com.reservation_system.repository.UserRepository("data/test-userrepo.csv");
        com.reservation_system.model.Researcher researcher45 = new com.reservation_system.model.Researcher(5, "hi!", "labmanager", "Guest", false);
        userRepository39.addUser((com.reservation_system.model.User) researcher45);
        java.util.Optional<com.reservation_system.model.User> userOptional48 = userRepository39.findByEmail("alice@example.com");
        java.util.List<com.reservation_system.model.User> userList49 = userRepository39.getAllUsers();
        userRepository29.saveAllUsers(userList49);
        com.reservation_system.repository.UserRepository userRepository52 = new com.reservation_system.repository.UserRepository("data/test-userrepo.csv");
        com.reservation_system.model.Researcher researcher58 = new com.reservation_system.model.Researcher(5, "hi!", "labmanager", "Guest", false);
        userRepository52.addUser((com.reservation_system.model.User) researcher58);
        java.util.List<com.reservation_system.model.User> userList60 = userRepository52.getAllUsers();
        com.reservation_system.repository.UserRepository userRepository62 = new com.reservation_system.repository.UserRepository("data/test-userrepo.csv");
        com.reservation_system.model.Researcher researcher68 = new com.reservation_system.model.Researcher(5, "hi!", "labmanager", "Guest", false);
        userRepository62.addUser((com.reservation_system.model.User) researcher68);
        java.util.List<com.reservation_system.model.User> userList70 = userRepository62.getAllUsers();
        userRepository52.saveAllUsers(userList70);
        userRepository29.saveAllUsers(userList70);
        userRepository12.saveAllUsers(userList70);
        userRepository1.saveAllUsers(userList70);
        org.junit.Assert.assertNotNull(userList2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 101 + "'", int3 == 101);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(userOptional8);
        org.junit.Assert.assertNotNull(userOptional10);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 101 + "'", int13 == 101);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 101 + "'", int14 == 101);
        org.junit.Assert.assertNotNull(userList22);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(userList27);
        org.junit.Assert.assertNotNull(userList37);
        org.junit.Assert.assertNotNull(userOptional48);
        org.junit.Assert.assertNotNull(userList49);
        org.junit.Assert.assertNotNull(userList60);
        org.junit.Assert.assertNotNull(userList70);
    }

    @Test
    public void test1406() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1406");
        com.reservation_system.model.Student student5 = new com.reservation_system.model.Student((int) (byte) 0, "", "Researcher", "Password1!", false);
        java.lang.String str6 = student5.getUserType();
        boolean boolean7 = student5.isApproved();
        student5.setApproved(false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Student" + "'", str6, "Student");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test1407() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1407");
        com.reservation_system.model.HeadLabCoordinator headLabCoordinator5 = new com.reservation_system.model.HeadLabCoordinator(0, "Student", "labmanager", "faculty", false);
    }

    @Test
    public void test1408() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1408");
        com.reservation_system.model.LabManager labManager5 = new com.reservation_system.model.LabManager((int) (short) -1, "", "Guest", "labmanager", false);
        labManager5.setApproved(false);
        boolean boolean8 = labManager5.requiresDepartmentApproval();
        java.lang.String str9 = labManager5.getName();
        java.lang.String str10 = labManager5.getEmail();
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Guest" + "'", str10, "Guest");
    }

    @Test
    public void test1409() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1409");
        com.reservation_system.model.Faculty faculty5 = new com.reservation_system.model.Faculty(5, "Faculty", "faculty", "labmanager", false);
        boolean boolean6 = faculty5.requiresDepartmentApproval();
        boolean boolean7 = faculty5.requiresDepartmentApproval();
        faculty5.setApproved(false);
        java.lang.String str10 = faculty5.getUserType();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Faculty" + "'", str10, "Faculty");
    }

    @Test
    public void test1410() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1410");
        com.reservation_system.model.LabManager labManager5 = new com.reservation_system.model.LabManager((int) (short) -1, "Student", "student", "labmanager", false);
    }

    @Test
    public void test1411() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1411");
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
        boolean boolean58 = userRepository1.emailExists("headlabcoordinator");
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
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + false + "'", boolean58 == false);
    }

    @Test
    public void test1412() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1412");
        com.reservation_system.model.Researcher researcher5 = new com.reservation_system.model.Researcher(0, "", "hi!", "Password1!", true);
        java.lang.String str6 = researcher5.getUserType();
        java.lang.String str7 = researcher5.getEmail();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Researcher" + "'", str6, "Researcher");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
    }

    @Test
    public void test1413() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1413");
        com.reservation_system.model.Faculty faculty5 = new com.reservation_system.model.Faculty(0, "", "Guest", "Faculty", true);
        java.lang.Class<?> wildcardClass6 = faculty5.getClass();
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test1414() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1414");
        // The following exception was thrown during execution in test generation
        try {
            com.reservation_system.model.User user6 = com.reservation_system.patterns.factory.UserFactory.createUser("Alice", 11, "faculty", "headlabcoordinator", "Faculty", true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid user type: Alice");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1415() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1415");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("data/test-userrepo.csv");
        boolean boolean3 = userRepository1.emailExists("Alice");
        int int4 = userRepository1.getNextID();
        boolean boolean5 = userRepository1.headLabCoordinatorExists();
        boolean boolean6 = userRepository1.headLabCoordinatorExists();
        com.reservation_system.repository.UserRepository userRepository8 = new com.reservation_system.repository.UserRepository("data/test-userrepo.csv");
        com.reservation_system.model.Researcher researcher14 = new com.reservation_system.model.Researcher(5, "hi!", "labmanager", "Guest", false);
        userRepository8.addUser((com.reservation_system.model.User) researcher14);
        java.util.List<com.reservation_system.model.User> userList16 = userRepository8.getAllUsers();
        com.reservation_system.repository.UserRepository userRepository18 = new com.reservation_system.repository.UserRepository("data/test-userrepo.csv");
        com.reservation_system.model.Researcher researcher24 = new com.reservation_system.model.Researcher(5, "hi!", "labmanager", "Guest", false);
        userRepository18.addUser((com.reservation_system.model.User) researcher24);
        java.util.List<com.reservation_system.model.User> userList26 = userRepository18.getAllUsers();
        userRepository8.saveAllUsers(userList26);
        userRepository1.saveAllUsers(userList26);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 101 + "'", int4 == 101);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(userList16);
        org.junit.Assert.assertNotNull(userList26);
    }

    @Test
    public void test1416() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1416");
        com.reservation_system.model.HeadLabCoordinator headLabCoordinator5 = new com.reservation_system.model.HeadLabCoordinator(0, "Guest", "Faculty", "guest", false);
        java.lang.String str6 = headLabCoordinator5.getUserType();
        headLabCoordinator5.setApproved(false);
        java.lang.String str9 = headLabCoordinator5.getUserType();
        java.lang.String str10 = headLabCoordinator5.getUserType();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "headlabcoordinator" + "'", str6, "headlabcoordinator");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "headlabcoordinator" + "'", str9, "headlabcoordinator");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "headlabcoordinator" + "'", str10, "headlabcoordinator");
    }

    @Test
    public void test1417() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1417");
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
        java.util.Optional<com.reservation_system.model.User> userOptional28 = userRepository1.findByEmail("");
        boolean boolean29 = userRepository1.headLabCoordinatorExists();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Faculty" + "'", str8, "Faculty");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Faculty" + "'", str9, "Faculty");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(userList17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 101 + "'", int18 == 101);
        org.junit.Assert.assertNotNull(userList19);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertNotNull(userOptional26);
        org.junit.Assert.assertNotNull(userOptional28);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
    }

    @Test
    public void test1418() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1418");
        com.reservation_system.model.Researcher researcher5 = new com.reservation_system.model.Researcher((int) (short) 10, "Researcher", "", "data/test-userrepo.csv", true);
        java.lang.String str6 = researcher5.getUserType();
        java.lang.String str7 = researcher5.getUserType();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Researcher" + "'", str6, "Researcher");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Researcher" + "'", str7, "Researcher");
    }

    @Test
    public void test1419() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1419");
        com.reservation_system.model.Researcher researcher5 = new com.reservation_system.model.Researcher((int) (byte) 1, "headlabcoordinator", "data/test-userrepo.csv", "Faculty", false);
        java.lang.String str6 = researcher5.getEmail();
        boolean boolean7 = researcher5.isApproved();
        java.lang.String str8 = researcher5.getUserType();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "data/test-userrepo.csv" + "'", str6, "data/test-userrepo.csv");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Researcher" + "'", str8, "Researcher");
    }

    @Test
    public void test1420() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1420");
        com.reservation_system.model.Guest guest5 = new com.reservation_system.model.Guest((int) (byte) -1, "guest", "data/test-userrepo.csv", "headlabcoordinator", false);
        java.lang.String str6 = guest5.getEmail();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "data/test-userrepo.csv" + "'", str6, "data/test-userrepo.csv");
    }

    @Test
    public void test1421() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1421");
        com.reservation_system.model.LabManager labManager5 = new com.reservation_system.model.LabManager((int) (byte) 100, "researcher", "alice@example.com", "", false);
        labManager5.setApproved(false);
        boolean boolean8 = labManager5.requiresDepartmentApproval();
        java.lang.Class<?> wildcardClass9 = labManager5.getClass();
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test1422() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1422");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("data/test-userrepo.csv");
        boolean boolean3 = userRepository1.emailExists("Password1!");
        boolean boolean5 = userRepository1.emailExists("hi!");
        com.reservation_system.model.Student student11 = new com.reservation_system.model.Student((int) (short) -1, "alice@example.com", "student", "student", true);
        boolean boolean12 = student11.requiresDepartmentApproval();
        userRepository1.addUser((com.reservation_system.model.User) student11);
        java.util.List<com.reservation_system.model.User> userList14 = userRepository1.getAllUsers();
        java.util.List<com.reservation_system.model.User> userList15 = userRepository1.getAllUsers();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(userList14);
        org.junit.Assert.assertNotNull(userList15);
    }

    @Test
    public void test1423() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1423");
        com.reservation_system.model.Guest guest5 = new com.reservation_system.model.Guest((int) (short) 100, "alice@example.com", "Student", "student", true);
    }

    @Test
    public void test1424() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1424");
        com.reservation_system.model.LabManager labManager5 = new com.reservation_system.model.LabManager(102, "headlabcoordinator", "Faculty", "Student", true);
    }

    @Test
    public void test1425() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1425");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("data/test-userrepo.csv");
        int int2 = userRepository1.getNextID();
        int int3 = userRepository1.getNextID();
        com.reservation_system.model.HeadLabCoordinator headLabCoordinator9 = new com.reservation_system.model.HeadLabCoordinator((int) (byte) 1, "", "", "guest", false);
        userRepository1.addUser((com.reservation_system.model.User) headLabCoordinator9);
        java.util.List<com.reservation_system.model.User> userList11 = userRepository1.getAllUsers();
        boolean boolean13 = userRepository1.emailExists("Faculty");
        boolean boolean15 = userRepository1.emailExists("Alice");
        java.util.List<com.reservation_system.model.User> userList16 = userRepository1.getAllUsers();
        com.reservation_system.repository.UserRepository userRepository18 = new com.reservation_system.repository.UserRepository("data/test-userrepo.csv");
        com.reservation_system.model.Researcher researcher24 = new com.reservation_system.model.Researcher(5, "hi!", "labmanager", "Guest", false);
        userRepository18.addUser((com.reservation_system.model.User) researcher24);
        java.util.List<com.reservation_system.model.User> userList26 = userRepository18.getAllUsers();
        com.reservation_system.repository.UserRepository userRepository28 = new com.reservation_system.repository.UserRepository("data/test-userrepo.csv");
        com.reservation_system.model.Researcher researcher34 = new com.reservation_system.model.Researcher(5, "hi!", "labmanager", "Guest", false);
        userRepository28.addUser((com.reservation_system.model.User) researcher34);
        java.util.Optional<com.reservation_system.model.User> userOptional37 = userRepository28.findByEmail("alice@example.com");
        java.util.List<com.reservation_system.model.User> userList38 = userRepository28.getAllUsers();
        userRepository18.saveAllUsers(userList38);
        com.reservation_system.repository.UserRepository userRepository41 = new com.reservation_system.repository.UserRepository("data/test-userrepo.csv");
        com.reservation_system.model.Researcher researcher47 = new com.reservation_system.model.Researcher(5, "hi!", "labmanager", "Guest", false);
        userRepository41.addUser((com.reservation_system.model.User) researcher47);
        java.util.List<com.reservation_system.model.User> userList49 = userRepository41.getAllUsers();
        com.reservation_system.repository.UserRepository userRepository51 = new com.reservation_system.repository.UserRepository("data/test-userrepo.csv");
        com.reservation_system.model.Researcher researcher57 = new com.reservation_system.model.Researcher(5, "hi!", "labmanager", "Guest", false);
        userRepository51.addUser((com.reservation_system.model.User) researcher57);
        java.util.List<com.reservation_system.model.User> userList59 = userRepository51.getAllUsers();
        userRepository41.saveAllUsers(userList59);
        userRepository18.saveAllUsers(userList59);
        userRepository1.saveAllUsers(userList59);
        boolean boolean64 = userRepository1.emailExists("Faculty");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 101 + "'", int2 == 101);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 101 + "'", int3 == 101);
        org.junit.Assert.assertNotNull(userList11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(userList16);
        org.junit.Assert.assertNotNull(userList26);
        org.junit.Assert.assertNotNull(userOptional37);
        org.junit.Assert.assertNotNull(userList38);
        org.junit.Assert.assertNotNull(userList49);
        org.junit.Assert.assertNotNull(userList59);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + true + "'", boolean64 == true);
    }

    @Test
    public void test1426() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1426");
        // The following exception was thrown during execution in test generation
        try {
            com.reservation_system.model.User user6 = com.reservation_system.patterns.factory.UserFactory.createUser("data/test-userrepo.csv", 102, "faculty", "Guest", "researcher", false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid user type: data/test-userrepo.csv");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1427() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1427");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("data/test-userrepo.csv");
        com.reservation_system.model.Researcher researcher7 = new com.reservation_system.model.Researcher(5, "hi!", "labmanager", "Guest", false);
        userRepository1.addUser((com.reservation_system.model.User) researcher7);
        int int9 = userRepository1.getNextID();
        java.util.List<com.reservation_system.model.User> userList10 = userRepository1.getAllUsers();
        boolean boolean11 = userRepository1.headLabCoordinatorExists();
        java.util.Optional<com.reservation_system.model.User> userOptional13 = userRepository1.findByEmail("Student");
        com.reservation_system.model.Student student19 = new com.reservation_system.model.Student(98, "Password1!", "Password1!", "student", false);
        java.lang.String str20 = student19.getPassword();
        userRepository1.addUser((com.reservation_system.model.User) student19);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 101 + "'", int9 == 101);
        org.junit.Assert.assertNotNull(userList10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(userOptional13);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "student" + "'", str20, "student");
    }

    @Test
    public void test1428() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1428");
        com.reservation_system.model.Student student5 = new com.reservation_system.model.Student((int) (short) 1, "faculty", "Researcher", "hi!", false);
        java.lang.String str6 = student5.getEmail();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Researcher" + "'", str6, "Researcher");
    }

    @Test
    public void test1429() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1429");
        com.reservation_system.model.Guest guest5 = new com.reservation_system.model.Guest((int) (byte) 10, "Guest", "guest", "", false);
        java.lang.String str6 = guest5.getUserType();
        java.lang.String str7 = guest5.getUserType();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Guest" + "'", str6, "Guest");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Guest" + "'", str7, "Guest");
    }

    @Test
    public void test1430() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1430");
        com.reservation_system.model.Researcher researcher5 = new com.reservation_system.model.Researcher(0, "data/test-userrepo.csv", "faculty", "headlabcoordinator", true);
        java.lang.String str6 = researcher5.getUserType();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Researcher" + "'", str6, "Researcher");
    }

    @Test
    public void test1431() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1431");
        com.reservation_system.model.HeadLabCoordinator headLabCoordinator5 = new com.reservation_system.model.HeadLabCoordinator(101, "Student", "researcher", "", false);
        int int6 = headLabCoordinator5.getID();
        java.lang.String str7 = headLabCoordinator5.getUserType();
        java.lang.String str8 = headLabCoordinator5.getPassword();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 101 + "'", int6 == 101);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "headlabcoordinator" + "'", str7, "headlabcoordinator");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test1432() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1432");
        com.reservation_system.model.HeadLabCoordinator headLabCoordinator5 = new com.reservation_system.model.HeadLabCoordinator((int) (byte) -1, "data/test-userrepo.csv", "alice@example.com", "student", true);
        int int6 = headLabCoordinator5.getID();
        boolean boolean7 = headLabCoordinator5.requiresDepartmentApproval();
        int int8 = headLabCoordinator5.getID();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
    }

    @Test
    public void test1433() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1433");
        com.reservation_system.model.LabManager labManager5 = new com.reservation_system.model.LabManager((int) (short) -1, "labmanager", "hi!", "", false);
        java.lang.String str6 = labManager5.getUserType();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "labmanager" + "'", str6, "labmanager");
    }

    @Test
    public void test1434() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1434");
        com.reservation_system.model.Faculty faculty5 = new com.reservation_system.model.Faculty(0, "Student", "faculty", "labmanager", true);
    }

    @Test
    public void test1435() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1435");
        com.reservation_system.model.Guest guest5 = new com.reservation_system.model.Guest(35, "Faculty", "Researcher", "Researcher", true);
    }

    @Test
    public void test1436() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1436");
        com.reservation_system.model.Student student5 = new com.reservation_system.model.Student(101, "headlabcoordinator", "Password1!", "student", true);
        java.lang.String str6 = student5.getUserType();
        java.lang.String str7 = student5.getName();
        java.lang.String str8 = student5.getUserType();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Student" + "'", str6, "Student");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "headlabcoordinator" + "'", str7, "headlabcoordinator");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Student" + "'", str8, "Student");
    }

    @Test
    public void test1437() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1437");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("data/test-userrepo.csv");
        java.util.List<com.reservation_system.model.User> userList2 = userRepository1.getAllUsers();
        int int3 = userRepository1.getNextID();
        boolean boolean5 = userRepository1.emailExists("headlabcoordinator");
        boolean boolean6 = userRepository1.headLabCoordinatorExists();
        java.util.Optional<com.reservation_system.model.User> userOptional8 = userRepository1.findByEmail("Alice");
        java.util.Optional<com.reservation_system.model.User> userOptional10 = userRepository1.findByEmail("Student");
        boolean boolean11 = userRepository1.headLabCoordinatorExists();
        org.junit.Assert.assertNotNull(userList2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 101 + "'", int3 == 101);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(userOptional8);
        org.junit.Assert.assertNotNull(userOptional10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test1438() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1438");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("data/test-userrepo.csv");
        com.reservation_system.model.Researcher researcher7 = new com.reservation_system.model.Researcher(5, "hi!", "labmanager", "Guest", false);
        userRepository1.addUser((com.reservation_system.model.User) researcher7);
        boolean boolean10 = userRepository1.emailExists("headlabcoordinator");
        boolean boolean12 = userRepository1.emailExists("Researcher");
        int int13 = userRepository1.getNextID();
        boolean boolean14 = userRepository1.headLabCoordinatorExists();
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
// flaky "17) test1438(com.reservation_system.randoop.userrepository.RegressionTest2)":         org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 101 + "'", int13 == 101);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test1439() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1439");
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
        com.reservation_system.model.Faculty faculty35 = new com.reservation_system.model.Faculty(5, "researcher", "guest", "faculty", true);
        java.lang.String str36 = faculty35.getUserType();
        java.lang.String str37 = faculty35.getEmail();
        java.lang.String str38 = faculty35.getUserType();
        userRepository1.addUser((com.reservation_system.model.User) faculty35);
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
// flaky "18) test1439(com.reservation_system.randoop.userrepository.RegressionTest2)":         org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "Faculty" + "'", str36, "Faculty");
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "guest" + "'", str37, "guest");
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "Faculty" + "'", str38, "Faculty");
    }

    @Test
    public void test1440() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1440");
        com.reservation_system.model.Researcher researcher5 = new com.reservation_system.model.Researcher(100, "guest", "student", "Faculty", true);
    }

    @Test
    public void test1441() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1441");
        com.reservation_system.model.LabManager labManager5 = new com.reservation_system.model.LabManager((int) (short) -1, "faculty", "Guest", "Guest", true);
        java.lang.String str6 = labManager5.getName();
        java.lang.Class<?> wildcardClass7 = labManager5.getClass();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "faculty" + "'", str6, "faculty");
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test1442() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1442");
        com.reservation_system.model.User user6 = com.reservation_system.patterns.factory.UserFactory.createUser("Guest", (-1), "labmanager", "Student", "headlabcoordinator", false);
        java.lang.String str7 = user6.getEmail();
        org.junit.Assert.assertNotNull(user6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Student" + "'", str7, "Student");
    }

    @Test
    public void test1443() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1443");
        // The following exception was thrown during execution in test generation
        try {
            com.reservation_system.model.User user6 = com.reservation_system.patterns.factory.UserFactory.createUser("alice@example.com", 36, "alice@example.com", "data/test-userrepo.csv", "headlabcoordinator", true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid user type: alice@example.com");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1444() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1444");
        com.reservation_system.model.User user6 = com.reservation_system.patterns.factory.UserFactory.createUser("Guest", 36, "", "researcher", "faculty", false);
        org.junit.Assert.assertNotNull(user6);
    }

    @Test
    public void test1445() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1445");
        com.reservation_system.model.Faculty faculty5 = new com.reservation_system.model.Faculty((int) (short) -1, "Researcher", "student", "Researcher", true);
        boolean boolean6 = faculty5.isApproved();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test1446() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1446");
        com.reservation_system.model.Guest guest5 = new com.reservation_system.model.Guest((int) 'a', "alice@example.com", "Guest", "data/test-userrepo.csv", true);
    }

    @Test
    public void test1447() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1447");
        com.reservation_system.model.Faculty faculty5 = new com.reservation_system.model.Faculty(0, "data/test-userrepo.csv", "Alice", "labmanager", true);
        java.lang.String str6 = faculty5.getUserType();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Faculty" + "'", str6, "Faculty");
    }

    @Test
    public void test1448() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1448");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("data/test-userrepo.csv");
        boolean boolean3 = userRepository1.emailExists("Alice");
        java.util.List<com.reservation_system.model.User> userList4 = userRepository1.getAllUsers();
        com.reservation_system.model.Researcher researcher10 = new com.reservation_system.model.Researcher(0, "", "Password1!", "researcher", false);
        researcher10.setApproved(true);
        int int13 = researcher10.getID();
        java.lang.String str14 = researcher10.getEmail();
        java.lang.String str15 = researcher10.getUserType();
        int int16 = researcher10.getID();
        java.lang.String str17 = researcher10.getName();
        userRepository1.addUser((com.reservation_system.model.User) researcher10);
        java.lang.String str19 = researcher10.getName();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(userList4);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Password1!" + "'", str14, "Password1!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Researcher" + "'", str15, "Researcher");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
    }

    @Test
    public void test1449() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1449");
        com.reservation_system.model.Student student5 = new com.reservation_system.model.Student((int) 'a', "headlabcoordinator", "headlabcoordinator", "Alice", false);
    }

    @Test
    public void test1450() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1450");
        com.reservation_system.model.HeadLabCoordinator headLabCoordinator5 = new com.reservation_system.model.HeadLabCoordinator(0, "Alice", "headlabcoordinator", "Student", false);
        java.lang.String str6 = headLabCoordinator5.getName();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Alice" + "'", str6, "Alice");
    }

    @Test
    public void test1451() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1451");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("data/test-userrepo.csv");
        int int2 = userRepository1.getNextID();
        boolean boolean3 = userRepository1.headLabCoordinatorExists();
        com.reservation_system.model.Guest guest9 = new com.reservation_system.model.Guest((int) (byte) -1, "hi!", "", "Password1!", false);
        userRepository1.addUser((com.reservation_system.model.User) guest9);
        java.util.Optional<com.reservation_system.model.User> userOptional12 = userRepository1.findByEmail("Faculty");
        boolean boolean14 = userRepository1.emailExists("hi!");
        int int15 = userRepository1.getNextID();
        java.util.Optional<com.reservation_system.model.User> userOptional17 = userRepository1.findByEmail("Researcher");
        boolean boolean18 = userRepository1.headLabCoordinatorExists();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 101 + "'", int2 == 101);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(userOptional12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 101 + "'", int15 == 101);
        org.junit.Assert.assertNotNull(userOptional17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
    }

    @Test
    public void test1452() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1452");
        com.reservation_system.model.Faculty faculty5 = new com.reservation_system.model.Faculty(6, "Guest", "Alice", "Student", false);
    }

    @Test
    public void test1453() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1453");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("data/test-userrepo.csv");
        java.util.List<com.reservation_system.model.User> userList2 = userRepository1.getAllUsers();
        int int3 = userRepository1.getNextID();
        boolean boolean5 = userRepository1.emailExists("headlabcoordinator");
        boolean boolean6 = userRepository1.headLabCoordinatorExists();
        java.util.Optional<com.reservation_system.model.User> userOptional8 = userRepository1.findByEmail("Alice");
        boolean boolean10 = userRepository1.emailExists("Alice");
        java.util.Optional<com.reservation_system.model.User> userOptional12 = userRepository1.findByEmail("Alice");
        boolean boolean14 = userRepository1.emailExists("researcher");
        boolean boolean16 = userRepository1.emailExists("alice@example.com");
        org.junit.Assert.assertNotNull(userList2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 101 + "'", int3 == 101);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(userOptional8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(userOptional12);
// flaky "19) test1453(com.reservation_system.randoop.userrepository.RegressionTest2)":         org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
    }

    @Test
    public void test1454() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1454");
        com.reservation_system.model.Guest guest5 = new com.reservation_system.model.Guest((int) (short) 10, "student", "labmanager", "researcher", true);
        java.lang.String str6 = guest5.getPassword();
        java.lang.String str7 = guest5.getName();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "researcher" + "'", str6, "researcher");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "student" + "'", str7, "student");
    }

    @Test
    public void test1455() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1455");
        com.reservation_system.model.LabManager labManager5 = new com.reservation_system.model.LabManager((int) (byte) 10, "Guest", "guest", "faculty", true);
    }

    @Test
    public void test1456() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1456");
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
        com.reservation_system.repository.UserRepository userRepository51 = new com.reservation_system.repository.UserRepository("data/test-userrepo.csv");
        boolean boolean53 = userRepository51.emailExists("Password1!");
        com.reservation_system.model.Faculty faculty59 = new com.reservation_system.model.Faculty((-1), "headlabcoordinator", "Student", "", false);
        userRepository51.addUser((com.reservation_system.model.User) faculty59);
        faculty59.setApproved(true);
        java.lang.String str63 = faculty59.getUserType();
        userRepository1.addUser((com.reservation_system.model.User) faculty59);
        int int65 = userRepository1.getNextID();
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
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + true + "'", boolean53 == true);
        org.junit.Assert.assertEquals("'" + str63 + "' != '" + "Faculty" + "'", str63, "Faculty");
        org.junit.Assert.assertTrue("'" + int65 + "' != '" + 101 + "'", int65 == 101);
    }

    @Test
    public void test1457() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1457");
        com.reservation_system.model.HeadLabCoordinator headLabCoordinator5 = new com.reservation_system.model.HeadLabCoordinator(97, "Alice", "student", "faculty", false);
        java.lang.String str6 = headLabCoordinator5.getUserType();
        java.lang.String str7 = headLabCoordinator5.getUserType();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "headlabcoordinator" + "'", str6, "headlabcoordinator");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "headlabcoordinator" + "'", str7, "headlabcoordinator");
    }

    @Test
    public void test1458() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1458");
        com.reservation_system.model.Faculty faculty5 = new com.reservation_system.model.Faculty((int) (byte) 10, "student", "labmanager", "hi!", true);
        faculty5.setApproved(false);
        java.lang.String str8 = faculty5.getEmail();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "labmanager" + "'", str8, "labmanager");
    }

    @Test
    public void test1459() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1459");
        com.reservation_system.model.Student student5 = new com.reservation_system.model.Student(1, "data/test-userrepo.csv", "alice@example.com", "guest", false);
        java.lang.String str6 = student5.getUserType();
        java.lang.String str7 = student5.getName();
        java.lang.String str8 = student5.getEmail();
        java.lang.Class<?> wildcardClass9 = student5.getClass();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Student" + "'", str6, "Student");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "data/test-userrepo.csv" + "'", str7, "data/test-userrepo.csv");
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test1460() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1460");
        com.reservation_system.model.Student student5 = new com.reservation_system.model.Student((int) (short) 10, "Student", "Researcher", "Alice", false);
    }

    @Test
    public void test1461() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1461");
        com.reservation_system.model.LabManager labManager5 = new com.reservation_system.model.LabManager(10, "Password1!", "data/test-userrepo.csv", "Guest", true);
        java.lang.String str6 = labManager5.getUserType();
        boolean boolean7 = labManager5.requiresDepartmentApproval();
        java.lang.String str8 = labManager5.getUserType();
        java.lang.String str9 = labManager5.getEmail();
        java.lang.String str10 = labManager5.getUserType();
        java.lang.Class<?> wildcardClass11 = labManager5.getClass();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "labmanager" + "'", str6, "labmanager");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "labmanager" + "'", str8, "labmanager");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "data/test-userrepo.csv" + "'", str9, "data/test-userrepo.csv");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "labmanager" + "'", str10, "labmanager");
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test1462() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1462");
        com.reservation_system.model.Student student5 = new com.reservation_system.model.Student(1, "data/test-userrepo.csv", "alice@example.com", "guest", false);
        java.lang.String str6 = student5.getUserType();
        student5.setApproved(false);
        java.lang.String str9 = student5.getUserType();
        java.lang.String str10 = student5.getPassword();
        int int11 = student5.getID();
        java.lang.String str12 = student5.getEmail();
        java.lang.String str13 = student5.getUserType();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Student" + "'", str6, "Student");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Student" + "'", str9, "Student");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "guest" + "'", str10, "guest");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Student" + "'", str13, "Student");
    }

    @Test
    public void test1463() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1463");
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
        boolean boolean38 = userRepository1.headLabCoordinatorExists();
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
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + true + "'", boolean38 == true);
    }

    @Test
    public void test1464() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1464");
        com.reservation_system.model.Faculty faculty5 = new com.reservation_system.model.Faculty((int) (short) 10, "labmanager", "faculty", "alice@example.com", false);
        java.lang.String str6 = faculty5.getUserType();
        boolean boolean7 = faculty5.isApproved();
        java.lang.String str8 = faculty5.getEmail();
        java.lang.String str9 = faculty5.getEmail();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Faculty" + "'", str6, "Faculty");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "faculty" + "'", str8, "faculty");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "faculty" + "'", str9, "faculty");
    }

    @Test
    public void test1465() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1465");
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
        java.lang.Class<?> wildcardClass20 = userList19.getClass();
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
        org.junit.Assert.assertNotNull(userOptional18);
        org.junit.Assert.assertNotNull(userList19);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test1466() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1466");
        com.reservation_system.model.HeadLabCoordinator headLabCoordinator5 = new com.reservation_system.model.HeadLabCoordinator((int) (short) 100, "alice@example.com", "Guest", "labmanager", true);
        boolean boolean6 = headLabCoordinator5.isApproved();
        java.lang.String str7 = headLabCoordinator5.getUserType();
        java.lang.String str8 = headLabCoordinator5.getUserType();
        java.lang.String str9 = headLabCoordinator5.getPassword();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "headlabcoordinator" + "'", str7, "headlabcoordinator");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "headlabcoordinator" + "'", str8, "headlabcoordinator");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "labmanager" + "'", str9, "labmanager");
    }

    @Test
    public void test1467() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1467");
        com.reservation_system.model.Student student5 = new com.reservation_system.model.Student((int) 'a', "headlabcoordinator", "Faculty", "hi!", true);
    }

    @Test
    public void test1468() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1468");
        com.reservation_system.model.HeadLabCoordinator headLabCoordinator5 = new com.reservation_system.model.HeadLabCoordinator((int) (short) 100, "alice@example.com", "headlabcoordinator", "Guest", false);
    }

    @Test
    public void test1469() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1469");
        com.reservation_system.model.Guest guest5 = new com.reservation_system.model.Guest((int) (byte) 10, "labmanager", "", "faculty", true);
    }

    @Test
    public void test1470() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1470");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("data/test-userrepo.csv");
        com.reservation_system.model.Researcher researcher7 = new com.reservation_system.model.Researcher(5, "hi!", "labmanager", "Guest", false);
        userRepository1.addUser((com.reservation_system.model.User) researcher7);
        java.util.List<com.reservation_system.model.User> userList9 = userRepository1.getAllUsers();
        boolean boolean10 = userRepository1.headLabCoordinatorExists();
        boolean boolean12 = userRepository1.emailExists("guest");
        java.util.Optional<com.reservation_system.model.User> userOptional14 = userRepository1.findByEmail("researcher");
        java.util.Optional<com.reservation_system.model.User> userOptional16 = userRepository1.findByEmail("alice@example.com");
        boolean boolean18 = userRepository1.emailExists("Student");
        com.reservation_system.repository.UserRepository userRepository20 = new com.reservation_system.repository.UserRepository("data/test-userrepo.csv");
        boolean boolean22 = userRepository20.emailExists("Alice");
        java.util.List<com.reservation_system.model.User> userList23 = userRepository20.getAllUsers();
        userRepository1.saveAllUsers(userList23);
        int int25 = userRepository1.getNextID();
        org.junit.Assert.assertNotNull(userList9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(userOptional14);
        org.junit.Assert.assertNotNull(userOptional16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(userList23);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 101 + "'", int25 == 101);
    }

    @Test
    public void test1471() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1471");
        com.reservation_system.model.Faculty faculty5 = new com.reservation_system.model.Faculty((int) (short) -1, "Password1!", "faculty", "labmanager", true);
        java.lang.String str6 = faculty5.getUserType();
        boolean boolean7 = faculty5.isApproved();
        java.lang.String str8 = faculty5.getEmail();
        java.lang.String str9 = faculty5.getUserType();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Faculty" + "'", str6, "Faculty");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "faculty" + "'", str8, "faculty");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Faculty" + "'", str9, "Faculty");
    }

    @Test
    public void test1472() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1472");
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
        java.util.Optional<com.reservation_system.model.User> userOptional55 = userRepository1.findByEmail("student");
        boolean boolean57 = userRepository1.emailExists("headlabcoordinator");
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
        org.junit.Assert.assertNotNull(userOptional55);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
    }

    @Test
    public void test1473() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1473");
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
        com.reservation_system.model.Student student25 = new com.reservation_system.model.Student(0, "Guest", "Password1!", "data/test-userrepo.csv", true);
        java.lang.String str26 = student25.getUserType();
        java.lang.String str27 = student25.getUserType();
        userRepository1.addUser((com.reservation_system.model.User) student25);
        int int29 = student25.getID();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 101 + "'", int2 == 101);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 101 + "'", int11 == 101);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(userList14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 101 + "'", int15 == 101);
        org.junit.Assert.assertNotNull(userList16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "Student" + "'", str26, "Student");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "Student" + "'", str27, "Student");
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
    }

    @Test
    public void test1474() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1474");
        com.reservation_system.model.LabManager labManager5 = new com.reservation_system.model.LabManager((int) (byte) -1, "faculty", "Student", "data/test-userrepo.csv", true);
        java.lang.String str6 = labManager5.getUserType();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "labmanager" + "'", str6, "labmanager");
    }

    @Test
    public void test1475() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1475");
        com.reservation_system.model.LabManager labManager5 = new com.reservation_system.model.LabManager(0, "hi!", "alice@example.com", "", false);
        boolean boolean6 = labManager5.isApproved();
        boolean boolean7 = labManager5.isApproved();
        java.lang.String str8 = labManager5.getUserType();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "labmanager" + "'", str8, "labmanager");
    }

    @Test
    public void test1476() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1476");
        com.reservation_system.model.Student student5 = new com.reservation_system.model.Student((int) (byte) 1, "data/test-userrepo.csv", "faculty", "Password1!", true);
        java.lang.String str6 = student5.getUserType();
        java.lang.String str7 = student5.getPassword();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Student" + "'", str6, "Student");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Password1!" + "'", str7, "Password1!");
    }

    @Test
    public void test1477() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1477");
        com.reservation_system.model.Researcher researcher5 = new com.reservation_system.model.Researcher((int) '4', "Guest", "Faculty", "headlabcoordinator", false);
        java.lang.String str6 = researcher5.getUserType();
        java.lang.Class<?> wildcardClass7 = researcher5.getClass();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Researcher" + "'", str6, "Researcher");
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test1478() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1478");
        com.reservation_system.model.Faculty faculty5 = new com.reservation_system.model.Faculty(98, "Password1!", "Faculty", "headlabcoordinator", false);
    }

    @Test
    public void test1479() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1479");
        com.reservation_system.model.Researcher researcher5 = new com.reservation_system.model.Researcher(5, "", "Alice", "researcher", false);
        int int6 = researcher5.getID();
        boolean boolean7 = researcher5.isApproved();
        java.lang.String str8 = researcher5.getUserType();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 5 + "'", int6 == 5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Researcher" + "'", str8, "Researcher");
    }

    @Test
    public void test1480() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1480");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("data/test-userrepo.csv");
        com.reservation_system.model.Faculty faculty7 = new com.reservation_system.model.Faculty(5, "researcher", "guest", "faculty", true);
        java.lang.String str8 = faculty7.getUserType();
        java.lang.String str9 = faculty7.getUserType();
        userRepository1.addUser((com.reservation_system.model.User) faculty7);
        boolean boolean11 = userRepository1.headLabCoordinatorExists();
        boolean boolean13 = userRepository1.emailExists("Faculty");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Faculty" + "'", str8, "Faculty");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Faculty" + "'", str9, "Faculty");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test1481() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1481");
        com.reservation_system.model.Student student5 = new com.reservation_system.model.Student(99, "", "data/test-userrepo.csv", "labmanager", true);
    }

    @Test
    public void test1482() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1482");
        com.reservation_system.model.LabManager labManager5 = new com.reservation_system.model.LabManager(98, "student", "data/test-userrepo.csv", "Alice", true);
    }

    @Test
    public void test1483() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1483");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("data/test-userrepo.csv");
        com.reservation_system.model.Researcher researcher7 = new com.reservation_system.model.Researcher(5, "hi!", "labmanager", "Guest", false);
        userRepository1.addUser((com.reservation_system.model.User) researcher7);
        java.util.List<com.reservation_system.model.User> userList9 = userRepository1.getAllUsers();
        com.reservation_system.repository.UserRepository userRepository11 = new com.reservation_system.repository.UserRepository("data/test-userrepo.csv");
        com.reservation_system.model.Researcher researcher17 = new com.reservation_system.model.Researcher(5, "hi!", "labmanager", "Guest", false);
        userRepository11.addUser((com.reservation_system.model.User) researcher17);
        java.util.List<com.reservation_system.model.User> userList19 = userRepository11.getAllUsers();
        userRepository1.saveAllUsers(userList19);
        com.reservation_system.repository.UserRepository userRepository22 = new com.reservation_system.repository.UserRepository("data/test-userrepo.csv");
        com.reservation_system.model.Researcher researcher28 = new com.reservation_system.model.Researcher(5, "hi!", "labmanager", "Guest", false);
        userRepository22.addUser((com.reservation_system.model.User) researcher28);
        java.util.List<com.reservation_system.model.User> userList30 = userRepository22.getAllUsers();
        com.reservation_system.repository.UserRepository userRepository32 = new com.reservation_system.repository.UserRepository("data/test-userrepo.csv");
        com.reservation_system.model.Researcher researcher38 = new com.reservation_system.model.Researcher(5, "hi!", "labmanager", "Guest", false);
        userRepository32.addUser((com.reservation_system.model.User) researcher38);
        java.util.List<com.reservation_system.model.User> userList40 = userRepository32.getAllUsers();
        userRepository22.saveAllUsers(userList40);
        userRepository1.saveAllUsers(userList40);
        com.reservation_system.model.Faculty faculty48 = new com.reservation_system.model.Faculty((int) (byte) -1, "faculty", "data/test-userrepo.csv", "Student", false);
        boolean boolean49 = faculty48.isApproved();
        userRepository1.addUser((com.reservation_system.model.User) faculty48);
        boolean boolean52 = userRepository1.emailExists("");
        org.junit.Assert.assertNotNull(userList9);
        org.junit.Assert.assertNotNull(userList19);
        org.junit.Assert.assertNotNull(userList30);
        org.junit.Assert.assertNotNull(userList40);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + true + "'", boolean52 == true);
    }

    @Test
    public void test1484() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1484");
        com.reservation_system.model.Guest guest5 = new com.reservation_system.model.Guest(0, "data/test-userrepo.csv", "labmanager", "Password1!", true);
    }

    @Test
    public void test1485() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1485");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("data/test-userrepo.csv");
        com.reservation_system.model.Researcher researcher7 = new com.reservation_system.model.Researcher(5, "hi!", "labmanager", "Guest", false);
        userRepository1.addUser((com.reservation_system.model.User) researcher7);
        java.util.Optional<com.reservation_system.model.User> userOptional10 = userRepository1.findByEmail("alice@example.com");
        java.util.List<com.reservation_system.model.User> userList11 = userRepository1.getAllUsers();
        java.util.Optional<com.reservation_system.model.User> userOptional13 = userRepository1.findByEmail("Password1!");
        java.util.Optional<com.reservation_system.model.User> userOptional15 = userRepository1.findByEmail("labmanager");
        boolean boolean16 = userRepository1.headLabCoordinatorExists();
        org.junit.Assert.assertNotNull(userOptional10);
        org.junit.Assert.assertNotNull(userList11);
        org.junit.Assert.assertNotNull(userOptional13);
        org.junit.Assert.assertNotNull(userOptional15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
    }

    @Test
    public void test1486() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1486");
        com.reservation_system.model.HeadLabCoordinator headLabCoordinator5 = new com.reservation_system.model.HeadLabCoordinator(97, "", "Alice", "alice@example.com", false);
    }

    @Test
    public void test1487() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1487");
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
        com.reservation_system.model.LabManager labManager29 = new com.reservation_system.model.LabManager((int) '#', "researcher", "Guest", "headlabcoordinator", true);
        boolean boolean30 = labManager29.isApproved();
        java.lang.String str31 = labManager29.getEmail();
        userRepository1.addUser((com.reservation_system.model.User) labManager29);
        java.lang.String str33 = labManager29.getUserType();
        java.lang.String str34 = labManager29.getEmail();
        java.lang.String str35 = labManager29.getUserType();
        org.junit.Assert.assertNotNull(userList9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(userList19);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 101 + "'", int20 == 101);
        org.junit.Assert.assertNotNull(userList21);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "Guest" + "'", str31, "Guest");
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "labmanager" + "'", str33, "labmanager");
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "Guest" + "'", str34, "Guest");
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "labmanager" + "'", str35, "labmanager");
    }

    @Test
    public void test1488() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1488");
        com.reservation_system.model.Student student5 = new com.reservation_system.model.Student((int) (byte) 0, "guest", "Student", "headlabcoordinator", false);
        java.lang.String str6 = student5.getPassword();
        java.lang.String str7 = student5.getUserType();
        boolean boolean8 = student5.isApproved();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "headlabcoordinator" + "'", str6, "headlabcoordinator");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Student" + "'", str7, "Student");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test1489() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1489");
        com.reservation_system.model.Student student5 = new com.reservation_system.model.Student((int) (short) 0, "student", "student", "faculty", false);
        boolean boolean6 = student5.isApproved();
        boolean boolean7 = student5.isApproved();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test1490() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1490");
        com.reservation_system.model.Student student5 = new com.reservation_system.model.Student((int) (byte) 0, "guest", "", "hi!", true);
        java.lang.String str6 = student5.getEmail();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
    }

    @Test
    public void test1491() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1491");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("data/test-userrepo.csv");
        com.reservation_system.model.Researcher researcher7 = new com.reservation_system.model.Researcher(5, "hi!", "labmanager", "Guest", false);
        userRepository1.addUser((com.reservation_system.model.User) researcher7);
        java.util.List<com.reservation_system.model.User> userList9 = userRepository1.getAllUsers();
        boolean boolean11 = userRepository1.emailExists("hi!");
        com.reservation_system.model.LabManager labManager17 = new com.reservation_system.model.LabManager(1, "Researcher", "labmanager", "data/test-userrepo.csv", false);
        userRepository1.addUser((com.reservation_system.model.User) labManager17);
        java.lang.String str19 = labManager17.getUserType();
        java.lang.String str20 = labManager17.getUserType();
        java.lang.String str21 = labManager17.getUserType();
        org.junit.Assert.assertNotNull(userList9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "labmanager" + "'", str19, "labmanager");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "labmanager" + "'", str20, "labmanager");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "labmanager" + "'", str21, "labmanager");
    }

    @Test
    public void test1492() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1492");
        com.reservation_system.model.User user6 = com.reservation_system.patterns.factory.UserFactory.createUser("researcher", (int) (short) 1, "hi!", "", "guest", false);
        org.junit.Assert.assertNotNull(user6);
    }

    @Test
    public void test1493() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1493");
        com.reservation_system.model.Student student5 = new com.reservation_system.model.Student((int) (short) -1, "alice@example.com", "student", "student", true);
        java.lang.String str6 = student5.getUserType();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Student" + "'", str6, "Student");
    }

    @Test
    public void test1494() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1494");
        com.reservation_system.model.Student student5 = new com.reservation_system.model.Student((int) (byte) 1, "data/test-userrepo.csv", "Student", "Student", false);
    }

    @Test
    public void test1495() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1495");
        com.reservation_system.model.Student student5 = new com.reservation_system.model.Student(5, "labmanager", "Password1!", "hi!", false);
        int int6 = student5.getID();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 5 + "'", int6 == 5);
    }

    @Test
    public void test1496() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1496");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("data/test-userrepo.csv");
        int int2 = userRepository1.getNextID();
        boolean boolean3 = userRepository1.headLabCoordinatorExists();
        com.reservation_system.model.Guest guest9 = new com.reservation_system.model.Guest((int) (byte) -1, "hi!", "", "Password1!", false);
        userRepository1.addUser((com.reservation_system.model.User) guest9);
        int int11 = userRepository1.getNextID();
        boolean boolean13 = userRepository1.emailExists("headlabcoordinator");
        java.util.List<com.reservation_system.model.User> userList14 = userRepository1.getAllUsers();
        com.reservation_system.model.LabManager labManager20 = new com.reservation_system.model.LabManager(10, "Password1!", "data/test-userrepo.csv", "Guest", true);
        java.lang.String str21 = labManager20.getUserType();
        java.lang.String str22 = labManager20.getPassword();
        java.lang.String str23 = labManager20.getEmail();
        userRepository1.addUser((com.reservation_system.model.User) labManager20);
        boolean boolean25 = userRepository1.headLabCoordinatorExists();
        com.reservation_system.repository.UserRepository userRepository27 = new com.reservation_system.repository.UserRepository("data/test-userrepo.csv");
        com.reservation_system.model.Researcher researcher33 = new com.reservation_system.model.Researcher(5, "hi!", "labmanager", "Guest", false);
        userRepository27.addUser((com.reservation_system.model.User) researcher33);
        int int35 = researcher33.getID();
        boolean boolean36 = researcher33.requiresDepartmentApproval();
        userRepository1.addUser((com.reservation_system.model.User) researcher33);
        java.util.List<com.reservation_system.model.User> userList38 = userRepository1.getAllUsers();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 101 + "'", int2 == 101);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 101 + "'", int11 == 101);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(userList14);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "labmanager" + "'", str21, "labmanager");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "Guest" + "'", str22, "Guest");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "data/test-userrepo.csv" + "'", str23, "data/test-userrepo.csv");
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 5 + "'", int35 == 5);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertNotNull(userList38);
    }

    @Test
    public void test1497() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1497");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("data/test-userrepo.csv");
        com.reservation_system.model.Researcher researcher7 = new com.reservation_system.model.Researcher(5, "hi!", "labmanager", "Guest", false);
        userRepository1.addUser((com.reservation_system.model.User) researcher7);
        java.util.List<com.reservation_system.model.User> userList9 = userRepository1.getAllUsers();
        boolean boolean10 = userRepository1.headLabCoordinatorExists();
        boolean boolean12 = userRepository1.emailExists("guest");
        java.util.Optional<com.reservation_system.model.User> userOptional14 = userRepository1.findByEmail("researcher");
        java.util.Optional<com.reservation_system.model.User> userOptional16 = userRepository1.findByEmail("");
        java.lang.Class<?> wildcardClass17 = userRepository1.getClass();
        org.junit.Assert.assertNotNull(userList9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(userOptional14);
        org.junit.Assert.assertNotNull(userOptional16);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test1498() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1498");
        com.reservation_system.model.Faculty faculty5 = new com.reservation_system.model.Faculty(5, "researcher", "guest", "faculty", true);
        java.lang.String str6 = faculty5.getUserType();
        java.lang.String str7 = faculty5.getEmail();
        java.lang.String str8 = faculty5.getUserType();
        java.lang.String str9 = faculty5.getUserType();
        java.lang.Class<?> wildcardClass10 = faculty5.getClass();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Faculty" + "'", str6, "Faculty");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "guest" + "'", str7, "guest");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Faculty" + "'", str8, "Faculty");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Faculty" + "'", str9, "Faculty");
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test1499() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1499");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("data/test-userrepo.csv");
        java.util.List<com.reservation_system.model.User> userList2 = userRepository1.getAllUsers();
        boolean boolean3 = userRepository1.headLabCoordinatorExists();
        java.util.Optional<com.reservation_system.model.User> userOptional5 = userRepository1.findByEmail("hi!");
        org.junit.Assert.assertNotNull(userList2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(userOptional5);
    }

    @Test
    public void test1500() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1500");
        com.reservation_system.model.Faculty faculty5 = new com.reservation_system.model.Faculty((int) (byte) -1, "Alice", "researcher", "Password1!", false);
        java.lang.String str6 = faculty5.getEmail();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "researcher" + "'", str6, "researcher");
    }
}
