package com.reservation_system.Randoop.userrepository;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest0Test {

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
    public void test0001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0001");
        com.reservation_system.model.Guest guest5 = new com.reservation_system.model.Guest(0, "Password1!", "data/test-userrepo.csv", "researcher", false);
        java.lang.Class<?> wildcardClass6 = guest5.getClass();
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0002");
        com.reservation_system.patterns.factory.UserFactory userFactory0 = new com.reservation_system.patterns.factory.UserFactory();
    }

    @Test
    public void test0003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0003");
        com.reservation_system.model.Student student5 = new com.reservation_system.model.Student(1, "data/test-userrepo.csv", "alice@example.com", "guest", false);
        java.lang.String str6 = student5.getUserType();
        student5.setApproved(false);
        java.lang.Class<?> wildcardClass9 = student5.getClass();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Student" + "'", str6, "Student");
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0004");
        com.reservation_system.model.Researcher researcher5 = new com.reservation_system.model.Researcher((int) 'a', "labmanager", "faculty", "", false);
        boolean boolean6 = researcher5.isApproved();
        java.lang.String str7 = researcher5.getName();
        java.lang.Class<?> wildcardClass8 = researcher5.getClass();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "labmanager" + "'", str7, "labmanager");
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0005");
        com.reservation_system.model.Student student5 = new com.reservation_system.model.Student(0, "Guest", "Password1!", "data/test-userrepo.csv", true);
        java.lang.Class<?> wildcardClass6 = student5.getClass();
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0006");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("data/test-userrepo.csv");
        com.reservation_system.model.Researcher researcher7 = new com.reservation_system.model.Researcher(5, "hi!", "labmanager", "Guest", false);
        userRepository1.addUser((com.reservation_system.model.User) researcher7);
        java.util.Optional<com.reservation_system.model.User> userOptional10 = userRepository1.findByEmail("alice@example.com");
        java.util.List<com.reservation_system.model.User> userList11 = null;
        // The following exception was thrown during execution in test generation
        try {
            userRepository1.saveAllUsers(userList11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.List.iterator()\" because \"users\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(userOptional10);
    }

    @Test
    public void test0007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0007");
        // The following exception was thrown during execution in test generation
        try {
            com.reservation_system.model.User user6 = com.reservation_system.patterns.factory.UserFactory.createUser("hi!", 0, "", "Guest", "faculty", false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid user type: hi!");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0008");
        com.reservation_system.model.Student student5 = new com.reservation_system.model.Student(1, "data/test-userrepo.csv", "alice@example.com", "guest", false);
        java.lang.String str6 = student5.getUserType();
        java.lang.Class<?> wildcardClass7 = student5.getClass();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Student" + "'", str6, "Student");
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0009");
        com.reservation_system.model.LabManager labManager5 = new com.reservation_system.model.LabManager(10, "Password1!", "data/test-userrepo.csv", "Guest", true);
        java.lang.Class<?> wildcardClass6 = labManager5.getClass();
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0010");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("data/test-userrepo.csv");
        com.reservation_system.model.Researcher researcher7 = new com.reservation_system.model.Researcher(5, "hi!", "labmanager", "Guest", false);
        userRepository1.addUser((com.reservation_system.model.User) researcher7);
        java.util.Optional<com.reservation_system.model.User> userOptional10 = userRepository1.findByEmail("alice@example.com");
        java.lang.Class<?> wildcardClass11 = userRepository1.getClass();
        org.junit.Assert.assertNotNull(userOptional10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0011");
        // The following exception was thrown during execution in test generation
        try {
            com.reservation_system.model.User user6 = com.reservation_system.patterns.factory.UserFactory.createUser("hi!", 10, "student", "student", "hi!", true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid user type: hi!");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0012");
        com.reservation_system.model.Student student5 = new com.reservation_system.model.Student(1, "data/test-userrepo.csv", "alice@example.com", "guest", false);
        java.lang.String str6 = student5.getUserType();
        java.lang.String str7 = student5.getUserType();
        java.lang.Class<?> wildcardClass8 = student5.getClass();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Student" + "'", str6, "Student");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Student" + "'", str7, "Student");
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0013");
        com.reservation_system.model.Guest guest5 = new com.reservation_system.model.Guest(0, "Password1!", "data/test-userrepo.csv", "researcher", false);
        boolean boolean6 = guest5.requiresDepartmentApproval();
        java.lang.String str7 = guest5.getUserType();
        java.lang.String str8 = guest5.getUserType();
        guest5.setApproved(false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Guest" + "'", str7, "Guest");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Guest" + "'", str8, "Guest");
    }

    @Test
    public void test0014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0014");
        com.reservation_system.model.User user6 = com.reservation_system.patterns.factory.UserFactory.createUser("guest", 100, "headlabcoordinator", "labmanager", "", true);
        java.lang.String str7 = user6.getName();
        org.junit.Assert.assertNotNull(user6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "headlabcoordinator" + "'", str7, "headlabcoordinator");
    }

    @Test
    public void test0015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0015");
        com.reservation_system.model.LabManager labManager5 = new com.reservation_system.model.LabManager(10, "Password1!", "data/test-userrepo.csv", "Guest", true);
        java.lang.String str6 = labManager5.getUserType();
        java.lang.String str7 = labManager5.getPassword();
        boolean boolean8 = labManager5.isApproved();
        java.lang.String str9 = labManager5.getUserType();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "labmanager" + "'", str6, "labmanager");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Guest" + "'", str7, "Guest");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "labmanager" + "'", str9, "labmanager");
    }

    @Test
    public void test0016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0016");
        com.reservation_system.model.User user6 = com.reservation_system.patterns.factory.UserFactory.createUser("guest", 100, "headlabcoordinator", "labmanager", "", true);
        user6.setApproved(true);
        org.junit.Assert.assertNotNull(user6);
    }

    @Test
    public void test0017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0017");
        com.reservation_system.model.Researcher researcher5 = new com.reservation_system.model.Researcher((int) (byte) 1, "headlabcoordinator", "data/test-userrepo.csv", "Faculty", false);
        java.lang.String str6 = researcher5.getUserType();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Researcher" + "'", str6, "Researcher");
    }

    @Test
    public void test0018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0018");
        // The following exception was thrown during execution in test generation
        try {
            com.reservation_system.model.User user6 = com.reservation_system.patterns.factory.UserFactory.createUser("", (int) (byte) 0, "headlabcoordinator", "Student", "Researcher", false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid user type: ");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0019");
        com.reservation_system.model.Faculty faculty5 = new com.reservation_system.model.Faculty(5, "researcher", "guest", "faculty", true);
        java.lang.String str6 = faculty5.getEmail();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "guest" + "'", str6, "guest");
    }

    @Test
    public void test0020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0020");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("data/test-userrepo.csv");
        com.reservation_system.model.Researcher researcher7 = new com.reservation_system.model.Researcher(5, "hi!", "labmanager", "Guest", false);
        userRepository1.addUser((com.reservation_system.model.User) researcher7);
        java.util.List<com.reservation_system.model.User> userList9 = userRepository1.getAllUsers();
        com.reservation_system.model.Guest guest15 = new com.reservation_system.model.Guest(0, "Password1!", "data/test-userrepo.csv", "researcher", false);
        boolean boolean16 = guest15.requiresDepartmentApproval();
        userRepository1.addUser((com.reservation_system.model.User) guest15);
        java.lang.Class<?> wildcardClass18 = userRepository1.getClass();
        org.junit.Assert.assertNotNull(userList9);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test0021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0021");
        com.reservation_system.model.LabManager labManager5 = new com.reservation_system.model.LabManager(10, "Password1!", "data/test-userrepo.csv", "Guest", true);
        java.lang.String str6 = labManager5.getUserType();
        boolean boolean7 = labManager5.requiresDepartmentApproval();
        java.lang.String str8 = labManager5.getName();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "labmanager" + "'", str6, "labmanager");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Password1!" + "'", str8, "Password1!");
    }

    @Test
    public void test0022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0022");
        com.reservation_system.model.Student student5 = new com.reservation_system.model.Student(0, "Student", "Guest", "guest", false);
    }

    @Test
    public void test0023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0023");
        com.reservation_system.model.Faculty faculty5 = new com.reservation_system.model.Faculty(0, "Faculty", "faculty", "hi!", true);
    }

    @Test
    public void test0024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0024");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("data/test-userrepo.csv");
        com.reservation_system.model.Researcher researcher7 = new com.reservation_system.model.Researcher(5, "hi!", "labmanager", "Guest", false);
        userRepository1.addUser((com.reservation_system.model.User) researcher7);
        int int9 = userRepository1.getNextID();
        boolean boolean11 = userRepository1.emailExists("Researcher");
        boolean boolean12 = userRepository1.headLabCoordinatorExists();
        java.lang.Class<?> wildcardClass13 = userRepository1.getClass();
// flaky "1) test0024(com.reservation_system.randoop.userrepository.RegressionTest0)":         org.junit.Assert.assertTrue("'" + int9 + "' != '" + 98 + "'", int9 == 98);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0025");
        com.reservation_system.model.LabManager labManager5 = new com.reservation_system.model.LabManager((int) '#', "researcher", "Guest", "headlabcoordinator", true);
        boolean boolean6 = labManager5.isApproved();
        boolean boolean7 = labManager5.isApproved();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test0026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0026");
        com.reservation_system.model.Researcher researcher5 = new com.reservation_system.model.Researcher(0, "", "Password1!", "researcher", false);
        researcher5.setApproved(true);
        int int8 = researcher5.getID();
        boolean boolean9 = researcher5.requiresDepartmentApproval();
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test0027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0027");
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
        java.util.Optional<com.reservation_system.model.User> userOptional36 = userRepository1.findByEmail("Password1!");
// flaky "2) test0027(com.reservation_system.randoop.userrepository.RegressionTest0)":         org.junit.Assert.assertTrue("'" + int2 + "' != '" + 98 + "'", int2 == 98);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(userList20);
        org.junit.Assert.assertNotNull(userOptional31);
        org.junit.Assert.assertNotNull(userList32);
        org.junit.Assert.assertNotNull(userOptional36);
    }

    @Test
    public void test0028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0028");
        com.reservation_system.model.HeadLabCoordinator headLabCoordinator5 = new com.reservation_system.model.HeadLabCoordinator((int) (short) 10, "Password1!", "labmanager", "labmanager", false);
    }

    @Test
    public void test0029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0029");
        com.reservation_system.model.Researcher researcher5 = new com.reservation_system.model.Researcher((int) 'a', "Password1!", "hi!", "Alice", false);
        boolean boolean6 = researcher5.isApproved();
        java.lang.String str7 = researcher5.getUserType();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Researcher" + "'", str7, "Researcher");
    }

    @Test
    public void test0030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0030");
        com.reservation_system.model.Researcher researcher5 = new com.reservation_system.model.Researcher((int) (short) 10, "Password1!", "Faculty", "hi!", false);
    }

    @Test
    public void test0031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0031");
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
        java.util.List<com.reservation_system.model.User> userList16 = null;
        // The following exception was thrown during execution in test generation
        try {
            userRepository1.saveAllUsers(userList16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.List.iterator()\" because \"users\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(userList2);
// flaky "3) test0031(com.reservation_system.randoop.userrepository.RegressionTest0)":         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 98 + "'", int3 == 98);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
// flaky "1) test0031(com.reservation_system.randoop.userrepository.RegressionTest0)":         org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(userOptional8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
// flaky "1) test0031(com.reservation_system.randoop.userrepository.RegressionTest0)":         org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(userList15);
    }

    @Test
    public void test0032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0032");
        java.lang.Object obj0 = new java.lang.Object();
        java.lang.Class<?> wildcardClass1 = obj0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test0033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0033");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("data/test-userrepo.csv");
        com.reservation_system.model.Researcher researcher7 = new com.reservation_system.model.Researcher(5, "hi!", "labmanager", "Guest", false);
        userRepository1.addUser((com.reservation_system.model.User) researcher7);
        java.util.List<com.reservation_system.model.User> userList9 = userRepository1.getAllUsers();
        java.lang.Class<?> wildcardClass10 = userRepository1.getClass();
        org.junit.Assert.assertNotNull(userList9);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0034");
        com.reservation_system.model.LabManager labManager5 = new com.reservation_system.model.LabManager(10, "Password1!", "data/test-userrepo.csv", "Guest", true);
        java.lang.String str6 = labManager5.getUserType();
        labManager5.setApproved(false);
        java.lang.String str9 = labManager5.getUserType();
        java.lang.String str10 = labManager5.getUserType();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "labmanager" + "'", str6, "labmanager");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "labmanager" + "'", str9, "labmanager");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "labmanager" + "'", str10, "labmanager");
    }

    @Test
    public void test0035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0035");
        com.reservation_system.model.Researcher researcher5 = new com.reservation_system.model.Researcher((int) (short) 0, "hi!", "hi!", "headlabcoordinator", false);
    }

    @Test
    public void test0036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0036");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("data/test-userrepo.csv");
        com.reservation_system.model.Researcher researcher7 = new com.reservation_system.model.Researcher(5, "hi!", "labmanager", "Guest", false);
        userRepository1.addUser((com.reservation_system.model.User) researcher7);
        java.lang.Class<?> wildcardClass9 = researcher7.getClass();
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0037");
        com.reservation_system.model.User user6 = com.reservation_system.patterns.factory.UserFactory.createUser("Guest", (int) (short) 1, "", "alice@example.com", "labmanager", true);
        java.lang.String str7 = user6.getEmail();
        java.lang.Class<?> wildcardClass8 = user6.getClass();
        org.junit.Assert.assertNotNull(user6);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0038");
        // The following exception was thrown during execution in test generation
        try {
            com.reservation_system.model.User user6 = com.reservation_system.patterns.factory.UserFactory.createUser("", (int) (short) 1, "faculty", "Faculty", "faculty", true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid user type: ");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0039");
        // The following exception was thrown during execution in test generation
        try {
            com.reservation_system.model.User user6 = com.reservation_system.patterns.factory.UserFactory.createUser("alice@example.com", (int) (byte) -1, "Guest", "student", "student", true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid user type: alice@example.com");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0040");
        com.reservation_system.model.Researcher researcher5 = new com.reservation_system.model.Researcher((int) 'a', "Password1!", "hi!", "Alice", false);
        researcher5.setApproved(false);
    }

    @Test
    public void test0041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0041");
        com.reservation_system.model.Student student5 = new com.reservation_system.model.Student((int) (short) 100, "faculty", "researcher", "alice@example.com", true);
        java.lang.String str6 = student5.getEmail();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "researcher" + "'", str6, "researcher");
    }

    @Test
    public void test0042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0042");
        // The following exception was thrown during execution in test generation
        try {
            com.reservation_system.model.User user6 = com.reservation_system.patterns.factory.UserFactory.createUser("Password1!", (int) (short) 10, "Password1!", "", "Faculty", false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid user type: Password1!");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0043");
        // The following exception was thrown during execution in test generation
        try {
            com.reservation_system.model.User user6 = com.reservation_system.patterns.factory.UserFactory.createUser("alice@example.com", (int) (byte) 0, "Guest", "Student", "faculty", false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid user type: alice@example.com");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0044");
        com.reservation_system.model.Researcher researcher5 = new com.reservation_system.model.Researcher((int) (byte) 1, "labmanager", "Password1!", "Student", true);
    }

    @Test
    public void test0045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0045");
        com.reservation_system.model.Researcher researcher5 = new com.reservation_system.model.Researcher(5, "", "Alice", "researcher", false);
        boolean boolean6 = researcher5.requiresDepartmentApproval();
        java.lang.String str7 = researcher5.getUserType();
        java.lang.String str8 = researcher5.getUserType();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Researcher" + "'", str7, "Researcher");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Researcher" + "'", str8, "Researcher");
    }

    @Test
    public void test0046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0046");
        com.reservation_system.model.LabManager labManager5 = new com.reservation_system.model.LabManager(1, "headlabcoordinator", "Alice", "faculty", false);
        java.lang.String str6 = labManager5.getName();
        int int7 = labManager5.getID();
        java.lang.Class<?> wildcardClass8 = labManager5.getClass();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "headlabcoordinator" + "'", str6, "headlabcoordinator");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0047");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("data/test-userrepo.csv");
        int int2 = userRepository1.getNextID();
        boolean boolean4 = userRepository1.emailExists("Alice");
        int int5 = userRepository1.getNextID();
// flaky "4) test0047(com.reservation_system.randoop.userrepository.RegressionTest0)":         org.junit.Assert.assertTrue("'" + int2 + "' != '" + 101 + "'", int2 == 101);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
// flaky "2) test0047(com.reservation_system.randoop.userrepository.RegressionTest0)":         org.junit.Assert.assertTrue("'" + int5 + "' != '" + 101 + "'", int5 == 101);
    }

    @Test
    public void test0048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0048");
        // The following exception was thrown during execution in test generation
        try {
            com.reservation_system.model.User user6 = com.reservation_system.patterns.factory.UserFactory.createUser("", 101, "hi!", "headlabcoordinator", "data/test-userrepo.csv", true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid user type: ");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0049");
        com.reservation_system.model.Guest guest5 = new com.reservation_system.model.Guest((int) (byte) 0, "data/test-userrepo.csv", "Password1!", "Student", false);
    }

    @Test
    public void test0050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0050");
        com.reservation_system.model.Researcher researcher5 = new com.reservation_system.model.Researcher((int) '#', "guest", "labmanager", "hi!", false);
    }

    @Test
    public void test0051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0051");
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
        com.reservation_system.repository.UserRepository userRepository33 = new com.reservation_system.repository.UserRepository("data/test-userrepo.csv");
        boolean boolean35 = userRepository33.emailExists("Alice");
        com.reservation_system.repository.UserRepository userRepository37 = new com.reservation_system.repository.UserRepository("data/test-userrepo.csv");
        java.util.List<com.reservation_system.model.User> userList38 = userRepository37.getAllUsers();
        int int39 = userRepository37.getNextID();
        java.util.List<com.reservation_system.model.User> userList40 = userRepository37.getAllUsers();
        userRepository33.saveAllUsers(userList40);
        userRepository1.saveAllUsers(userList40);
        int int43 = userRepository1.getNextID();
        org.junit.Assert.assertNotNull(userList9);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
// flaky "5) test0051(com.reservation_system.randoop.userrepository.RegressionTest0)":         org.junit.Assert.assertTrue("'" + int20 + "' != '" + 101 + "'", int20 == 101);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(userList27);
// flaky "3) test0051(com.reservation_system.randoop.userrepository.RegressionTest0)":         org.junit.Assert.assertTrue("'" + int28 + "' != '" + 101 + "'", int28 == 101);
        org.junit.Assert.assertNotNull(userList29);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertNotNull(userList38);
// flaky "2) test0051(com.reservation_system.randoop.userrepository.RegressionTest0)":         org.junit.Assert.assertTrue("'" + int39 + "' != '" + 101 + "'", int39 == 101);
        org.junit.Assert.assertNotNull(userList40);
// flaky "1) test0051(com.reservation_system.randoop.userrepository.RegressionTest0)":         org.junit.Assert.assertTrue("'" + int43 + "' != '" + 101 + "'", int43 == 101);
    }

    @Test
    public void test0052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0052");
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
        java.util.List<com.reservation_system.model.User> userList23 = userRepository1.getAllUsers();
        java.lang.Class<?> wildcardClass24 = userList23.getClass();
        org.junit.Assert.assertNotNull(userList9);
        org.junit.Assert.assertNotNull(userOptional20);
        org.junit.Assert.assertNotNull(userList21);
        org.junit.Assert.assertNotNull(userList23);
        org.junit.Assert.assertNotNull(wildcardClass24);
    }

    @Test
    public void test0053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0053");
        com.reservation_system.model.Student student5 = new com.reservation_system.model.Student((int) (short) -1, "Faculty", "Researcher", "Faculty", false);
    }

    @Test
    public void test0054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0054");
        com.reservation_system.model.Student student5 = new com.reservation_system.model.Student(5, "data/test-userrepo.csv", "Alice", "guest", true);
    }

    @Test
    public void test0055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0055");
        com.reservation_system.model.Guest guest5 = new com.reservation_system.model.Guest(0, "Password1!", "data/test-userrepo.csv", "researcher", false);
        boolean boolean6 = guest5.requiresDepartmentApproval();
        java.lang.String str7 = guest5.getUserType();
        java.lang.String str8 = guest5.getPassword();
        guest5.setApproved(false);
        java.lang.String str11 = guest5.getPassword();
        java.lang.String str12 = guest5.getUserType();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Guest" + "'", str7, "Guest");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "researcher" + "'", str8, "researcher");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "researcher" + "'", str11, "researcher");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Guest" + "'", str12, "Guest");
    }

    @Test
    public void test0056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0056");
        com.reservation_system.model.Guest guest5 = new com.reservation_system.model.Guest(0, "student", "", "alice@example.com", false);
        java.lang.String str6 = guest5.getUserType();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Guest" + "'", str6, "Guest");
    }

    @Test
    public void test0057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0057");
        com.reservation_system.model.User user6 = com.reservation_system.patterns.factory.UserFactory.createUser("researcher", (int) ' ', "guest", "alice@example.com", "alice@example.com", false);
        org.junit.Assert.assertNotNull(user6);
    }

    @Test
    public void test0058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0058");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("data/test-userrepo.csv");
        int int2 = userRepository1.getNextID();
        java.util.Optional<com.reservation_system.model.User> userOptional4 = userRepository1.findByEmail("Alice");
// flaky "6) test0058(com.reservation_system.randoop.userrepository.RegressionTest0)":         org.junit.Assert.assertTrue("'" + int2 + "' != '" + 101 + "'", int2 == 101);
        org.junit.Assert.assertNotNull(userOptional4);
    }

    @Test
    public void test0059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0059");
        com.reservation_system.model.Faculty faculty5 = new com.reservation_system.model.Faculty(5, "Faculty", "faculty", "labmanager", false);
        boolean boolean6 = faculty5.requiresDepartmentApproval();
        java.lang.String str7 = faculty5.getUserType();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Faculty" + "'", str7, "Faculty");
    }

    @Test
    public void test0060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0060");
        com.reservation_system.model.Student student5 = new com.reservation_system.model.Student(0, "student", "", "", false);
        boolean boolean6 = student5.requiresDepartmentApproval();
        java.lang.String str7 = student5.getUserType();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Student" + "'", str7, "Student");
    }

    @Test
    public void test0061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0061");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("data/test-userrepo.csv");
        boolean boolean3 = userRepository1.emailExists("Alice");
        com.reservation_system.repository.UserRepository userRepository5 = new com.reservation_system.repository.UserRepository("data/test-userrepo.csv");
        java.util.List<com.reservation_system.model.User> userList6 = userRepository5.getAllUsers();
        int int7 = userRepository5.getNextID();
        java.util.List<com.reservation_system.model.User> userList8 = userRepository5.getAllUsers();
        userRepository1.saveAllUsers(userList8);
        java.lang.Class<?> wildcardClass10 = userRepository1.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(userList6);
// flaky "7) test0061(com.reservation_system.randoop.userrepository.RegressionTest0)":         org.junit.Assert.assertTrue("'" + int7 + "' != '" + 101 + "'", int7 == 101);
        org.junit.Assert.assertNotNull(userList8);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0062");
        com.reservation_system.model.Student student5 = new com.reservation_system.model.Student((int) 'a', "alice@example.com", "", "", true);
    }

    @Test
    public void test0063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0063");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("data/test-userrepo.csv");
        int int2 = userRepository1.getNextID();
        boolean boolean3 = userRepository1.headLabCoordinatorExists();
        com.reservation_system.model.Guest guest9 = new com.reservation_system.model.Guest((int) (byte) -1, "hi!", "", "Password1!", false);
        userRepository1.addUser((com.reservation_system.model.User) guest9);
        int int11 = userRepository1.getNextID();
        boolean boolean13 = userRepository1.emailExists("hi!");
// flaky "8) test0063(com.reservation_system.randoop.userrepository.RegressionTest0)":         org.junit.Assert.assertTrue("'" + int2 + "' != '" + 101 + "'", int2 == 101);
// flaky "4) test0063(com.reservation_system.randoop.userrepository.RegressionTest0)":         org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
// flaky "3) test0063(com.reservation_system.randoop.userrepository.RegressionTest0)":         org.junit.Assert.assertTrue("'" + int11 + "' != '" + 101 + "'", int11 == 101);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test0064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0064");
        com.reservation_system.model.User user6 = com.reservation_system.patterns.factory.UserFactory.createUser("Researcher", 5, "alice@example.com", "Student", "researcher", false);
        java.lang.String str7 = user6.getPassword();
        org.junit.Assert.assertNotNull(user6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "researcher" + "'", str7, "researcher");
    }

    @Test
    public void test0065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0065");
        com.reservation_system.model.LabManager labManager5 = new com.reservation_system.model.LabManager((int) '#', "researcher", "Guest", "headlabcoordinator", true);
        boolean boolean6 = labManager5.isApproved();
        java.lang.String str7 = labManager5.getEmail();
        java.lang.String str8 = labManager5.getName();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Guest" + "'", str7, "Guest");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "researcher" + "'", str8, "researcher");
    }

    @Test
    public void test0066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0066");
        com.reservation_system.model.Guest guest5 = new com.reservation_system.model.Guest(0, "Password1!", "data/test-userrepo.csv", "researcher", false);
        boolean boolean6 = guest5.requiresDepartmentApproval();
        java.lang.String str7 = guest5.getUserType();
        java.lang.String str8 = guest5.getUserType();
        java.lang.String str9 = guest5.getUserType();
        java.lang.String str10 = guest5.getPassword();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Guest" + "'", str7, "Guest");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Guest" + "'", str8, "Guest");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Guest" + "'", str9, "Guest");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "researcher" + "'", str10, "researcher");
    }

    @Test
    public void test0067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0067");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("data/test-userrepo.csv");
        com.reservation_system.model.Researcher researcher7 = new com.reservation_system.model.Researcher(5, "hi!", "labmanager", "Guest", false);
        userRepository1.addUser((com.reservation_system.model.User) researcher7);
        java.util.List<com.reservation_system.model.User> userList9 = userRepository1.getAllUsers();
        com.reservation_system.repository.UserRepository userRepository11 = new com.reservation_system.repository.UserRepository("data/test-userrepo.csv");
        com.reservation_system.model.Researcher researcher17 = new com.reservation_system.model.Researcher(5, "hi!", "labmanager", "Guest", false);
        userRepository11.addUser((com.reservation_system.model.User) researcher17);
        java.util.List<com.reservation_system.model.User> userList19 = userRepository11.getAllUsers();
        userRepository1.saveAllUsers(userList19);
        java.lang.Class<?> wildcardClass21 = userList19.getClass();
        org.junit.Assert.assertNotNull(userList9);
        org.junit.Assert.assertNotNull(userList19);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test0068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0068");
        com.reservation_system.model.Researcher researcher5 = new com.reservation_system.model.Researcher(5, "", "Alice", "researcher", false);
        java.lang.String str6 = researcher5.getUserType();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Researcher" + "'", str6, "Researcher");
    }

    @Test
    public void test0069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0069");
        com.reservation_system.model.HeadLabCoordinator headLabCoordinator5 = new com.reservation_system.model.HeadLabCoordinator((int) (byte) 1, "Password1!", "Student", "hi!", true);
        java.lang.String str6 = headLabCoordinator5.getUserType();
        java.lang.String str7 = headLabCoordinator5.getUserType();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "headlabcoordinator" + "'", str6, "headlabcoordinator");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "headlabcoordinator" + "'", str7, "headlabcoordinator");
    }

    @Test
    public void test0070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0070");
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
        boolean boolean25 = userRepository1.emailExists("alice@example.com");
// flaky "9) test0070(com.reservation_system.randoop.userrepository.RegressionTest0)":         org.junit.Assert.assertTrue("'" + int2 + "' != '" + 101 + "'", int2 == 101);
// flaky "5) test0070(com.reservation_system.randoop.userrepository.RegressionTest0)":         org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
// flaky "4) test0070(com.reservation_system.randoop.userrepository.RegressionTest0)":         org.junit.Assert.assertTrue("'" + int11 + "' != '" + 101 + "'", int11 == 101);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
// flaky "2) test0070(com.reservation_system.randoop.userrepository.RegressionTest0)":         org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
// flaky "1) test0070(com.reservation_system.randoop.userrepository.RegressionTest0)":         org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
// flaky "1) test0070(com.reservation_system.randoop.userrepository.RegressionTest0)":         org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
    }

    @Test
    public void test0071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0071");
        com.reservation_system.model.HeadLabCoordinator headLabCoordinator5 = new com.reservation_system.model.HeadLabCoordinator((int) (byte) 1, "", "", "guest", false);
        int int6 = headLabCoordinator5.getID();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
    }

    @Test
    public void test0072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0072");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("data/test-userrepo.csv");
        java.util.List<com.reservation_system.model.User> userList2 = userRepository1.getAllUsers();
        int int3 = userRepository1.getNextID();
        boolean boolean5 = userRepository1.emailExists("headlabcoordinator");
        boolean boolean6 = userRepository1.headLabCoordinatorExists();
        java.util.Optional<com.reservation_system.model.User> userOptional8 = userRepository1.findByEmail("Alice");
        java.lang.Class<?> wildcardClass9 = userRepository1.getClass();
        org.junit.Assert.assertNotNull(userList2);
// flaky "10) test0072(com.reservation_system.randoop.userrepository.RegressionTest0)":         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 101 + "'", int3 == 101);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(userOptional8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0073");
        com.reservation_system.model.LabManager labManager5 = new com.reservation_system.model.LabManager((int) (short) -1, "", "Guest", "labmanager", false);
        labManager5.setApproved(false);
        boolean boolean8 = labManager5.requiresDepartmentApproval();
        java.lang.Class<?> wildcardClass9 = labManager5.getClass();
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0074");
        com.reservation_system.model.Student student5 = new com.reservation_system.model.Student(1, "data/test-userrepo.csv", "alice@example.com", "guest", false);
        java.lang.String str6 = student5.getUserType();
        student5.setApproved(false);
        student5.setApproved(false);
        java.lang.String str11 = student5.getUserType();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Student" + "'", str6, "Student");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Student" + "'", str11, "Student");
    }

    @Test
    public void test0075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0075");
        // The following exception was thrown during execution in test generation
        try {
            com.reservation_system.model.User user6 = com.reservation_system.patterns.factory.UserFactory.createUser("", (int) (short) 10, "Guest", "headlabcoordinator", "faculty", true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid user type: ");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0076");
        com.reservation_system.model.User user6 = com.reservation_system.patterns.factory.UserFactory.createUser("Guest", (int) (short) 1, "", "alice@example.com", "labmanager", true);
        int int7 = user6.getID();
        int int8 = user6.getID();
        java.lang.String str9 = user6.getName();
        org.junit.Assert.assertNotNull(user6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test0077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0077");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("data/test-userrepo.csv");
        boolean boolean3 = userRepository1.emailExists("Alice");
        com.reservation_system.model.Researcher researcher9 = new com.reservation_system.model.Researcher((int) 'a', "labmanager", "faculty", "", false);
        boolean boolean10 = researcher9.isApproved();
        java.lang.String str11 = researcher9.getName();
        userRepository1.addUser((com.reservation_system.model.User) researcher9);
        boolean boolean13 = userRepository1.headLabCoordinatorExists();
        int int14 = userRepository1.getNextID();
        java.util.Optional<com.reservation_system.model.User> userOptional16 = userRepository1.findByEmail("guest");
        java.lang.Class<?> wildcardClass17 = userRepository1.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "labmanager" + "'", str11, "labmanager");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
// flaky "11) test0077(com.reservation_system.randoop.userrepository.RegressionTest0)":         org.junit.Assert.assertTrue("'" + int14 + "' != '" + 101 + "'", int14 == 101);
        org.junit.Assert.assertNotNull(userOptional16);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test0078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0078");
        com.reservation_system.model.Student student5 = new com.reservation_system.model.Student((int) (short) -1, "alice@example.com", "student", "student", true);
        boolean boolean6 = student5.requiresDepartmentApproval();
        student5.setApproved(true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test0079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0079");
        com.reservation_system.model.Researcher researcher5 = new com.reservation_system.model.Researcher((int) (short) -1, "Student", "Alice", "labmanager", false);
        java.lang.String str6 = researcher5.getEmail();
        java.lang.String str7 = researcher5.getName();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Alice" + "'", str6, "Alice");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Student" + "'", str7, "Student");
    }

    @Test
    public void test0080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0080");
        com.reservation_system.model.Faculty faculty5 = new com.reservation_system.model.Faculty((-1), "", "Password1!", "student", true);
    }

    @Test
    public void test0081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0081");
        com.reservation_system.model.User user6 = com.reservation_system.patterns.factory.UserFactory.createUser("headlabcoordinator", 0, "researcher", "Student", "researcher", false);
        org.junit.Assert.assertNotNull(user6);
    }

    @Test
    public void test0082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0082");
        com.reservation_system.model.Student student5 = new com.reservation_system.model.Student(1, "data/test-userrepo.csv", "alice@example.com", "guest", false);
        java.lang.String str6 = student5.getUserType();
        student5.setApproved(false);
        java.lang.String str9 = student5.getUserType();
        java.lang.String str10 = student5.getPassword();
        java.lang.String str11 = student5.getPassword();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Student" + "'", str6, "Student");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Student" + "'", str9, "Student");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "guest" + "'", str10, "guest");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "guest" + "'", str11, "guest");
    }

    @Test
    public void test0083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0083");
        com.reservation_system.model.Faculty faculty5 = new com.reservation_system.model.Faculty((int) (short) -1, "labmanager", "Faculty", "alice@example.com", true);
    }

    @Test
    public void test0084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0084");
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
        java.lang.Class<?> wildcardClass23 = userList21.getClass();
// flaky "12) test0084(com.reservation_system.randoop.userrepository.RegressionTest0)":         org.junit.Assert.assertTrue("'" + int2 + "' != '" + 101 + "'", int2 == 101);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
// flaky "6) test0084(com.reservation_system.randoop.userrepository.RegressionTest0)":         org.junit.Assert.assertTrue("'" + int11 + "' != '" + 101 + "'", int11 == 101);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(userList21);
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test0085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0085");
        com.reservation_system.model.LabManager labManager5 = new com.reservation_system.model.LabManager((int) '4', "Alice", "Student", "researcher", false);
    }

    @Test
    public void test0086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0086");
        com.reservation_system.model.Researcher researcher5 = new com.reservation_system.model.Researcher((int) '4', "guest", "Alice", "faculty", false);
        java.lang.String str6 = researcher5.getName();
        java.lang.String str7 = researcher5.getPassword();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "guest" + "'", str6, "guest");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "faculty" + "'", str7, "faculty");
    }

    @Test
    public void test0087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0087");
        com.reservation_system.model.LabManager labManager5 = new com.reservation_system.model.LabManager(10, "Password1!", "data/test-userrepo.csv", "Guest", true);
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
    public void test0088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0088");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("data/test-userrepo.csv");
        java.util.List<com.reservation_system.model.User> userList2 = userRepository1.getAllUsers();
        int int3 = userRepository1.getNextID();
        boolean boolean5 = userRepository1.emailExists("headlabcoordinator");
        boolean boolean6 = userRepository1.headLabCoordinatorExists();
        java.util.Optional<com.reservation_system.model.User> userOptional8 = userRepository1.findByEmail("Alice");
        boolean boolean10 = userRepository1.emailExists("Alice");
        boolean boolean12 = userRepository1.emailExists("Guest");
        boolean boolean14 = userRepository1.emailExists("headlabcoordinator");
        int int15 = userRepository1.getNextID();
        org.junit.Assert.assertNotNull(userList2);
// flaky "13) test0088(com.reservation_system.randoop.userrepository.RegressionTest0)":         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 101 + "'", int3 == 101);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(userOptional8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
// flaky "7) test0088(com.reservation_system.randoop.userrepository.RegressionTest0)":         org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
// flaky "5) test0088(com.reservation_system.randoop.userrepository.RegressionTest0)":         org.junit.Assert.assertTrue("'" + int15 + "' != '" + 101 + "'", int15 == 101);
    }

    @Test
    public void test0089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0089");
        com.reservation_system.model.Researcher researcher5 = new com.reservation_system.model.Researcher((int) 'a', "labmanager", "faculty", "", false);
        boolean boolean6 = researcher5.isApproved();
        boolean boolean7 = researcher5.requiresDepartmentApproval();
        boolean boolean8 = researcher5.isApproved();
        java.lang.String str9 = researcher5.getPassword();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test0090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0090");
        com.reservation_system.model.LabManager labManager5 = new com.reservation_system.model.LabManager(10, "Password1!", "data/test-userrepo.csv", "Guest", true);
        java.lang.String str6 = labManager5.getUserType();
        java.lang.String str7 = labManager5.getPassword();
        java.lang.String str8 = labManager5.getEmail();
        java.lang.String str9 = labManager5.getName();
        java.lang.String str10 = labManager5.getPassword();
        java.lang.String str11 = labManager5.getUserType();
        boolean boolean12 = labManager5.requiresDepartmentApproval();
        java.lang.Class<?> wildcardClass13 = labManager5.getClass();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "labmanager" + "'", str6, "labmanager");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Guest" + "'", str7, "Guest");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "data/test-userrepo.csv" + "'", str8, "data/test-userrepo.csv");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Password1!" + "'", str9, "Password1!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Guest" + "'", str10, "Guest");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "labmanager" + "'", str11, "labmanager");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0091");
        com.reservation_system.model.HeadLabCoordinator headLabCoordinator5 = new com.reservation_system.model.HeadLabCoordinator((int) (short) 10, "", "Researcher", "Student", false);
    }

    @Test
    public void test0092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0092");
        com.reservation_system.model.HeadLabCoordinator headLabCoordinator5 = new com.reservation_system.model.HeadLabCoordinator(98, "student", "labmanager", "", true);
    }

    @Test
    public void test0093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0093");
        com.reservation_system.model.Guest guest5 = new com.reservation_system.model.Guest(10, "Alice", "faculty", "alice@example.com", false);
    }

    @Test
    public void test0094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0094");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("data/test-userrepo.csv");
        java.util.List<com.reservation_system.model.User> userList2 = userRepository1.getAllUsers();
        int int3 = userRepository1.getNextID();
        boolean boolean5 = userRepository1.emailExists("headlabcoordinator");
        boolean boolean6 = userRepository1.headLabCoordinatorExists();
        java.util.Optional<com.reservation_system.model.User> userOptional8 = userRepository1.findByEmail("Alice");
        boolean boolean10 = userRepository1.emailExists("Alice");
        int int11 = userRepository1.getNextID();
        java.util.List<com.reservation_system.model.User> userList12 = userRepository1.getAllUsers();
        com.reservation_system.model.User user13 = null;
        // The following exception was thrown during execution in test generation
        try {
            userRepository1.addUser(user13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.reservation_system.model.User.getName()\" because \"user\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(userList2);
// flaky "14) test0094(com.reservation_system.randoop.userrepository.RegressionTest0)":         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 101 + "'", int3 == 101);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(userOptional8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
// flaky "8) test0094(com.reservation_system.randoop.userrepository.RegressionTest0)":         org.junit.Assert.assertTrue("'" + int11 + "' != '" + 101 + "'", int11 == 101);
        org.junit.Assert.assertNotNull(userList12);
    }

    @Test
    public void test0095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0095");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("data/test-userrepo.csv");
        boolean boolean3 = userRepository1.emailExists("Alice");
        com.reservation_system.model.Researcher researcher9 = new com.reservation_system.model.Researcher((int) 'a', "labmanager", "faculty", "", false);
        boolean boolean10 = researcher9.isApproved();
        java.lang.String str11 = researcher9.getName();
        userRepository1.addUser((com.reservation_system.model.User) researcher9);
        boolean boolean13 = researcher9.requiresDepartmentApproval();
        java.lang.Class<?> wildcardClass14 = researcher9.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "labmanager" + "'", str11, "labmanager");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test0096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0096");
        com.reservation_system.model.Guest guest5 = new com.reservation_system.model.Guest(0, "Password1!", "data/test-userrepo.csv", "researcher", false);
        boolean boolean6 = guest5.requiresDepartmentApproval();
        java.lang.String str7 = guest5.getUserType();
        java.lang.String str8 = guest5.getPassword();
        java.lang.String str9 = guest5.getUserType();
        int int10 = guest5.getID();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Guest" + "'", str7, "Guest");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "researcher" + "'", str8, "researcher");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Guest" + "'", str9, "Guest");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test0097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0097");
        com.reservation_system.model.Faculty faculty5 = new com.reservation_system.model.Faculty((int) (byte) -1, "Alice", "researcher", "Password1!", false);
        java.lang.String str6 = faculty5.getName();
        java.lang.String str7 = faculty5.getUserType();
        java.lang.String str8 = faculty5.getUserType();
        java.lang.String str9 = faculty5.getEmail();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Alice" + "'", str6, "Alice");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Faculty" + "'", str7, "Faculty");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Faculty" + "'", str8, "Faculty");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "researcher" + "'", str9, "researcher");
    }

    @Test
    public void test0098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0098");
        com.reservation_system.model.Faculty faculty5 = new com.reservation_system.model.Faculty((int) '4', "labmanager", "alice@example.com", "alice@example.com", true);
    }

    @Test
    public void test0099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0099");
        // The following exception was thrown during execution in test generation
        try {
            com.reservation_system.model.User user6 = com.reservation_system.patterns.factory.UserFactory.createUser("hi!", (int) ' ', "Researcher", "hi!", "student", false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid user type: hi!");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0100");
        com.reservation_system.model.Guest guest5 = new com.reservation_system.model.Guest(98, "data/test-userrepo.csv", "guest", "Guest", false);
    }

    @Test
    public void test0101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0101");
        com.reservation_system.model.Faculty faculty5 = new com.reservation_system.model.Faculty((int) (byte) 10, "alice@example.com", "headlabcoordinator", "headlabcoordinator", false);
        java.lang.String str6 = faculty5.getUserType();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Faculty" + "'", str6, "Faculty");
    }

    @Test
    public void test0102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0102");
        com.reservation_system.model.LabManager labManager5 = new com.reservation_system.model.LabManager((int) '#', "data/test-userrepo.csv", "headlabcoordinator", "researcher", false);
        java.lang.String str6 = labManager5.getEmail();
        java.lang.String str7 = labManager5.getUserType();
        java.lang.String str8 = labManager5.getUserType();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "headlabcoordinator" + "'", str6, "headlabcoordinator");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "labmanager" + "'", str7, "labmanager");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "labmanager" + "'", str8, "labmanager");
    }

    @Test
    public void test0103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0103");
        // The following exception was thrown during execution in test generation
        try {
            com.reservation_system.model.User user6 = com.reservation_system.patterns.factory.UserFactory.createUser("hi!", (int) (byte) -1, "faculty", "data/test-userrepo.csv", "labmanager", true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid user type: hi!");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0104");
        com.reservation_system.model.Guest guest5 = new com.reservation_system.model.Guest((int) '#', "Password1!", "Alice", "Student", true);
    }

    @Test
    public void test0105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0105");
        com.reservation_system.model.LabManager labManager5 = new com.reservation_system.model.LabManager(1, "headlabcoordinator", "Alice", "faculty", false);
        java.lang.String str6 = labManager5.getName();
        int int7 = labManager5.getID();
        java.lang.String str8 = labManager5.getEmail();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "headlabcoordinator" + "'", str6, "headlabcoordinator");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Alice" + "'", str8, "Alice");
    }

    @Test
    public void test0106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0106");
        com.reservation_system.model.Researcher researcher5 = new com.reservation_system.model.Researcher((int) (short) 0, "labmanager", "Researcher", "Researcher", true);
    }

    @Test
    public void test0107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0107");
        com.reservation_system.model.HeadLabCoordinator headLabCoordinator5 = new com.reservation_system.model.HeadLabCoordinator((int) ' ', "alice@example.com", "Faculty", "hi!", true);
        java.lang.Class<?> wildcardClass6 = headLabCoordinator5.getClass();
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0108");
        // The following exception was thrown during execution in test generation
        try {
            com.reservation_system.model.User user6 = com.reservation_system.patterns.factory.UserFactory.createUser("alice@example.com", (int) (byte) -1, "researcher", "Student", "Faculty", false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid user type: alice@example.com");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0109");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("data/test-userrepo.csv");
        com.reservation_system.model.Researcher researcher7 = new com.reservation_system.model.Researcher(5, "hi!", "labmanager", "Guest", false);
        userRepository1.addUser((com.reservation_system.model.User) researcher7);
        int int9 = userRepository1.getNextID();
        boolean boolean11 = userRepository1.emailExists("Researcher");
        java.util.List<com.reservation_system.model.User> userList12 = userRepository1.getAllUsers();
        java.util.Optional<com.reservation_system.model.User> userOptional14 = userRepository1.findByEmail("Faculty");
// flaky "15) test0109(com.reservation_system.randoop.userrepository.RegressionTest0)":         org.junit.Assert.assertTrue("'" + int9 + "' != '" + 101 + "'", int9 == 101);
// flaky "9) test0109(com.reservation_system.randoop.userrepository.RegressionTest0)":         org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(userList12);
        org.junit.Assert.assertNotNull(userOptional14);
    }

    @Test
    public void test0110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0110");
        // The following exception was thrown during execution in test generation
        try {
            com.reservation_system.model.User user6 = com.reservation_system.patterns.factory.UserFactory.createUser("Password1!", (int) (byte) 10, "", "faculty", "data/test-userrepo.csv", true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid user type: Password1!");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0111");
        com.reservation_system.model.Researcher researcher5 = new com.reservation_system.model.Researcher((int) (byte) 1, "Faculty", "", "Guest", false);
        java.lang.String str6 = researcher5.getPassword();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Guest" + "'", str6, "Guest");
    }

    @Test
    public void test0112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0112");
        com.reservation_system.model.Guest guest5 = new com.reservation_system.model.Guest((int) (byte) 100, "guest", "Faculty", "student", false);
        java.lang.String str6 = guest5.getEmail();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Faculty" + "'", str6, "Faculty");
    }

    @Test
    public void test0113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0113");
        com.reservation_system.model.Faculty faculty5 = new com.reservation_system.model.Faculty((int) (short) 10, "researcher", "guest", "Student", false);
    }

    @Test
    public void test0114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0114");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("data/test-userrepo.csv");
        int int2 = userRepository1.getNextID();
        boolean boolean4 = userRepository1.emailExists("Alice");
        java.util.Optional<com.reservation_system.model.User> userOptional6 = userRepository1.findByEmail("");
// flaky "16) test0114(com.reservation_system.randoop.userrepository.RegressionTest0)":         org.junit.Assert.assertTrue("'" + int2 + "' != '" + 101 + "'", int2 == 101);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(userOptional6);
    }

    @Test
    public void test0115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0115");
        com.reservation_system.model.Faculty faculty5 = new com.reservation_system.model.Faculty((int) (byte) -1, "faculty", "data/test-userrepo.csv", "Student", false);
        java.lang.String str6 = faculty5.getName();
        java.lang.String str7 = faculty5.getPassword();
        java.lang.Class<?> wildcardClass8 = faculty5.getClass();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "faculty" + "'", str6, "faculty");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Student" + "'", str7, "Student");
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0116");
        com.reservation_system.model.Student student5 = new com.reservation_system.model.Student(1, "data/test-userrepo.csv", "alice@example.com", "guest", false);
        java.lang.String str6 = student5.getUserType();
        student5.setApproved(false);
        java.lang.String str9 = student5.getUserType();
        student5.setApproved(true);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Student" + "'", str6, "Student");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Student" + "'", str9, "Student");
    }

    @Test
    public void test0117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0117");
        com.reservation_system.model.Student student5 = new com.reservation_system.model.Student((-1), "hi!", "data/test-userrepo.csv", "alice@example.com", true);
        java.lang.String str6 = student5.getUserType();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Student" + "'", str6, "Student");
    }

    @Test
    public void test0118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0118");
        com.reservation_system.model.Faculty faculty5 = new com.reservation_system.model.Faculty(0, "faculty", "alice@example.com", "guest", true);
    }

    @Test
    public void test0119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0119");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("data/test-userrepo.csv");
        com.reservation_system.model.Researcher researcher7 = new com.reservation_system.model.Researcher(5, "hi!", "labmanager", "Guest", false);
        userRepository1.addUser((com.reservation_system.model.User) researcher7);
        int int9 = userRepository1.getNextID();
        java.util.Optional<com.reservation_system.model.User> userOptional11 = userRepository1.findByEmail("headlabcoordinator");
        int int12 = userRepository1.getNextID();
        java.util.Optional<com.reservation_system.model.User> userOptional14 = userRepository1.findByEmail("Faculty");
        java.lang.Class<?> wildcardClass15 = userOptional14.getClass();
// flaky "17) test0119(com.reservation_system.randoop.userrepository.RegressionTest0)":         org.junit.Assert.assertTrue("'" + int9 + "' != '" + 101 + "'", int9 == 101);
        org.junit.Assert.assertNotNull(userOptional11);
// flaky "10) test0119(com.reservation_system.randoop.userrepository.RegressionTest0)":         org.junit.Assert.assertTrue("'" + int12 + "' != '" + 101 + "'", int12 == 101);
        org.junit.Assert.assertNotNull(userOptional14);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0120");
        com.reservation_system.model.Student student5 = new com.reservation_system.model.Student(1, "data/test-userrepo.csv", "alice@example.com", "guest", false);
        java.lang.String str6 = student5.getUserType();
        java.lang.String str7 = student5.getUserType();
        java.lang.String str8 = student5.getUserType();
        java.lang.String str9 = student5.getUserType();
        java.lang.String str10 = student5.getUserType();
        java.lang.String str11 = student5.getName();
        java.lang.String str12 = student5.getUserType();
        java.lang.String str13 = student5.getUserType();
        java.lang.String str14 = student5.getUserType();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Student" + "'", str6, "Student");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Student" + "'", str7, "Student");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Student" + "'", str8, "Student");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Student" + "'", str9, "Student");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Student" + "'", str10, "Student");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "data/test-userrepo.csv" + "'", str11, "data/test-userrepo.csv");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Student" + "'", str12, "Student");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Student" + "'", str13, "Student");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Student" + "'", str14, "Student");
    }

    @Test
    public void test0121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0121");
        com.reservation_system.model.Researcher researcher5 = new com.reservation_system.model.Researcher((int) (byte) 1, "Faculty", "", "Guest", false);
        boolean boolean6 = researcher5.isApproved();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test0122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0122");
        com.reservation_system.model.Researcher researcher5 = new com.reservation_system.model.Researcher((int) (short) -1, "Student", "Alice", "labmanager", false);
        boolean boolean6 = researcher5.requiresDepartmentApproval();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test0123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0123");
        com.reservation_system.model.Researcher researcher5 = new com.reservation_system.model.Researcher((int) 'a', "Password1!", "hi!", "Alice", false);
        java.lang.String str6 = researcher5.getUserType();
        java.lang.String str7 = researcher5.getUserType();
        java.lang.Class<?> wildcardClass8 = researcher5.getClass();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Researcher" + "'", str6, "Researcher");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Researcher" + "'", str7, "Researcher");
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0124");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("data/test-userrepo.csv");
        int int2 = userRepository1.getNextID();
        boolean boolean3 = userRepository1.headLabCoordinatorExists();
        com.reservation_system.model.Guest guest9 = new com.reservation_system.model.Guest((int) (byte) -1, "hi!", "", "Password1!", false);
        userRepository1.addUser((com.reservation_system.model.User) guest9);
        int int11 = userRepository1.getNextID();
        boolean boolean13 = userRepository1.emailExists("headlabcoordinator");
        java.util.Optional<com.reservation_system.model.User> userOptional15 = userRepository1.findByEmail("labmanager");
// flaky "18) test0124(com.reservation_system.randoop.userrepository.RegressionTest0)":         org.junit.Assert.assertTrue("'" + int2 + "' != '" + 101 + "'", int2 == 101);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
// flaky "11) test0124(com.reservation_system.randoop.userrepository.RegressionTest0)":         org.junit.Assert.assertTrue("'" + int11 + "' != '" + 101 + "'", int11 == 101);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(userOptional15);
    }

    @Test
    public void test0125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0125");
        com.reservation_system.model.Faculty faculty5 = new com.reservation_system.model.Faculty((int) (byte) 100, "student", "Password1!", "Guest", false);
        java.lang.String str6 = faculty5.getUserType();
        java.lang.String str7 = faculty5.getName();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Faculty" + "'", str6, "Faculty");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "student" + "'", str7, "student");
    }

    @Test
    public void test0126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0126");
        com.reservation_system.model.LabManager labManager5 = new com.reservation_system.model.LabManager(6, "Password1!", "Guest", "faculty", false);
    }

    @Test
    public void test0127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0127");
        com.reservation_system.model.Student student5 = new com.reservation_system.model.Student(101, "guest", "alice@example.com", "labmanager", true);
    }

    @Test
    public void test0128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0128");
        com.reservation_system.model.Guest guest5 = new com.reservation_system.model.Guest(10, "Faculty", "Student", "hi!", true);
        java.lang.String str6 = guest5.getEmail();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Student" + "'", str6, "Student");
    }

    @Test
    public void test0129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0129");
        com.reservation_system.model.HeadLabCoordinator headLabCoordinator5 = new com.reservation_system.model.HeadLabCoordinator((int) (byte) -1, "data/test-userrepo.csv", "alice@example.com", "student", true);
        boolean boolean6 = headLabCoordinator5.requiresDepartmentApproval();
        headLabCoordinator5.setApproved(true);
        headLabCoordinator5.setApproved(true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test0130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0130");
        com.reservation_system.model.Researcher researcher5 = new com.reservation_system.model.Researcher(0, "Researcher", "Student", "Guest", true);
    }

    @Test
    public void test0131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0131");
        com.reservation_system.model.Guest guest5 = new com.reservation_system.model.Guest(0, "Password1!", "data/test-userrepo.csv", "researcher", false);
        boolean boolean6 = guest5.requiresDepartmentApproval();
        java.lang.String str7 = guest5.getUserType();
        java.lang.String str8 = guest5.getUserType();
        java.lang.String str9 = guest5.getUserType();
        java.lang.Class<?> wildcardClass10 = guest5.getClass();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Guest" + "'", str7, "Guest");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Guest" + "'", str8, "Guest");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Guest" + "'", str9, "Guest");
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0132");
        // The following exception was thrown during execution in test generation
        try {
            com.reservation_system.model.User user6 = com.reservation_system.patterns.factory.UserFactory.createUser("hi!", 0, "student", "Guest", "researcher", true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid user type: hi!");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0133");
        com.reservation_system.model.Guest guest5 = new com.reservation_system.model.Guest((int) (byte) -1, "hi!", "", "Password1!", false);
        java.lang.String str6 = guest5.getUserType();
        java.lang.String str7 = guest5.getPassword();
        java.lang.String str8 = guest5.getEmail();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Guest" + "'", str6, "Guest");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Password1!" + "'", str7, "Password1!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test0134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0134");
        com.reservation_system.model.Guest guest5 = new com.reservation_system.model.Guest((int) (byte) 0, "data/test-userrepo.csv", "data/test-userrepo.csv", "Researcher", false);
        guest5.setApproved(false);
        java.lang.Class<?> wildcardClass8 = guest5.getClass();
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0135");
        com.reservation_system.model.Faculty faculty5 = new com.reservation_system.model.Faculty(5, "Guest", "faculty", "", false);
    }

    @Test
    public void test0136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0136");
        com.reservation_system.model.HeadLabCoordinator headLabCoordinator5 = new com.reservation_system.model.HeadLabCoordinator((int) '4', "Password1!", "labmanager", "guest", false);
        java.lang.String str6 = headLabCoordinator5.getUserType();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "headlabcoordinator" + "'", str6, "headlabcoordinator");
    }

    @Test
    public void test0137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0137");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("data/test-userrepo.csv");
        com.reservation_system.model.Researcher researcher7 = new com.reservation_system.model.Researcher(5, "hi!", "labmanager", "Guest", false);
        userRepository1.addUser((com.reservation_system.model.User) researcher7);
        java.util.List<com.reservation_system.model.User> userList9 = userRepository1.getAllUsers();
        boolean boolean11 = userRepository1.emailExists("hi!");
        com.reservation_system.model.LabManager labManager17 = new com.reservation_system.model.LabManager(1, "Researcher", "labmanager", "data/test-userrepo.csv", false);
        userRepository1.addUser((com.reservation_system.model.User) labManager17);
        java.lang.String str19 = labManager17.getUserType();
        java.lang.Class<?> wildcardClass20 = labManager17.getClass();
        org.junit.Assert.assertNotNull(userList9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "labmanager" + "'", str19, "labmanager");
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test0138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0138");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("data/test-userrepo.csv");
        com.reservation_system.model.Researcher researcher7 = new com.reservation_system.model.Researcher(5, "hi!", "labmanager", "Guest", false);
        userRepository1.addUser((com.reservation_system.model.User) researcher7);
        java.util.Optional<com.reservation_system.model.User> userOptional10 = userRepository1.findByEmail("alice@example.com");
        java.util.List<com.reservation_system.model.User> userList11 = userRepository1.getAllUsers();
        java.util.Optional<com.reservation_system.model.User> userOptional13 = userRepository1.findByEmail("Password1!");
        int int14 = userRepository1.getNextID();
        java.lang.Class<?> wildcardClass15 = userRepository1.getClass();
        org.junit.Assert.assertNotNull(userOptional10);
        org.junit.Assert.assertNotNull(userList11);
        org.junit.Assert.assertNotNull(userOptional13);
// flaky "19) test0138(com.reservation_system.randoop.userrepository.RegressionTest0)":         org.junit.Assert.assertTrue("'" + int14 + "' != '" + 101 + "'", int14 == 101);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0139");
        com.reservation_system.model.Faculty faculty5 = new com.reservation_system.model.Faculty(100, "researcher", "student", "Student", false);
        faculty5.setApproved(true);
        faculty5.setApproved(true);
    }

    @Test
    public void test0140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0140");
        com.reservation_system.model.LabManager labManager5 = new com.reservation_system.model.LabManager(1, "Researcher", "labmanager", "data/test-userrepo.csv", false);
        java.lang.Class<?> wildcardClass6 = labManager5.getClass();
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0141");
        com.reservation_system.model.Guest guest5 = new com.reservation_system.model.Guest(0, "Password1!", "data/test-userrepo.csv", "researcher", false);
        boolean boolean6 = guest5.requiresDepartmentApproval();
        java.lang.String str7 = guest5.getUserType();
        java.lang.String str8 = guest5.getPassword();
        guest5.setApproved(false);
        java.lang.String str11 = guest5.getUserType();
        java.lang.String str12 = guest5.getName();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Guest" + "'", str7, "Guest");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "researcher" + "'", str8, "researcher");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Guest" + "'", str11, "Guest");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Password1!" + "'", str12, "Password1!");
    }

    @Test
    public void test0142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0142");
        com.reservation_system.model.Researcher researcher5 = new com.reservation_system.model.Researcher((int) (short) 1, "", "headlabcoordinator", "Student", false);
    }

    @Test
    public void test0143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0143");
        com.reservation_system.model.Researcher researcher5 = new com.reservation_system.model.Researcher(5, "", "Alice", "researcher", false);
        boolean boolean6 = researcher5.requiresDepartmentApproval();
        boolean boolean7 = researcher5.requiresDepartmentApproval();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test0144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0144");
        com.reservation_system.model.Researcher researcher5 = new com.reservation_system.model.Researcher((int) '#', "student", "student", "Guest", true);
        java.lang.Class<?> wildcardClass6 = researcher5.getClass();
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0145");
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
        int int51 = userRepository1.getNextID();
        org.junit.Assert.assertNotNull(userList9);
        org.junit.Assert.assertNotNull(userList19);
        org.junit.Assert.assertNotNull(userList30);
        org.junit.Assert.assertNotNull(userList40);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
// flaky "20) test0145(com.reservation_system.randoop.userrepository.RegressionTest0)":         org.junit.Assert.assertTrue("'" + int51 + "' != '" + 101 + "'", int51 == 101);
    }

    @Test
    public void test0146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0146");
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
        com.reservation_system.model.Researcher researcher40 = new com.reservation_system.model.Researcher(0, "", "Password1!", "researcher", false);
        researcher40.setApproved(true);
        int int43 = researcher40.getID();
        userRepository1.addUser((com.reservation_system.model.User) researcher40);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "labmanager" + "'", str11, "labmanager");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(userOptional15);
        org.junit.Assert.assertNotNull(userList18);
// flaky "21) test0146(com.reservation_system.randoop.userrepository.RegressionTest0)":         org.junit.Assert.assertTrue("'" + int19 + "' != '" + 101 + "'", int19 == 101);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertNotNull(userOptional24);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
// flaky "12) test0146(com.reservation_system.randoop.userrepository.RegressionTest0)":         org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNotNull(userList31);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 0 + "'", int43 == 0);
    }

    @Test
    public void test0147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0147");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("data/test-userrepo.csv");
        boolean boolean3 = userRepository1.emailExists("Alice");
        com.reservation_system.model.Researcher researcher9 = new com.reservation_system.model.Researcher((int) 'a', "labmanager", "faculty", "", false);
        boolean boolean10 = researcher9.isApproved();
        java.lang.String str11 = researcher9.getName();
        userRepository1.addUser((com.reservation_system.model.User) researcher9);
        boolean boolean13 = researcher9.isApproved();
        java.lang.String str14 = researcher9.getUserType();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "labmanager" + "'", str11, "labmanager");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Researcher" + "'", str14, "Researcher");
    }

    @Test
    public void test0148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0148");
        com.reservation_system.model.Guest guest5 = new com.reservation_system.model.Guest((int) '4', "Guest", "Student", "Faculty", false);
    }

    @Test
    public void test0149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0149");
        com.reservation_system.model.Guest guest5 = new com.reservation_system.model.Guest((int) (short) 10, "alice@example.com", "student", "", true);
        java.lang.String str6 = guest5.getEmail();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "student" + "'", str6, "student");
    }

    @Test
    public void test0150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0150");
        com.reservation_system.model.LabManager labManager5 = new com.reservation_system.model.LabManager(1, "student", "data/test-userrepo.csv", "hi!", false);
        java.lang.String str6 = labManager5.getUserType();
        labManager5.setApproved(false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "labmanager" + "'", str6, "labmanager");
    }

    @Test
    public void test0151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0151");
        com.reservation_system.model.LabManager labManager5 = new com.reservation_system.model.LabManager(5, "", "faculty", "Guest", false);
    }

    @Test
    public void test0152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0152");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("data/test-userrepo.csv");
        int int2 = userRepository1.getNextID();
        com.reservation_system.repository.UserRepository userRepository4 = new com.reservation_system.repository.UserRepository("data/test-userrepo.csv");
        com.reservation_system.model.Researcher researcher10 = new com.reservation_system.model.Researcher(5, "hi!", "labmanager", "Guest", false);
        userRepository4.addUser((com.reservation_system.model.User) researcher10);
        java.util.List<com.reservation_system.model.User> userList12 = userRepository4.getAllUsers();
        com.reservation_system.model.Guest guest18 = new com.reservation_system.model.Guest(0, "Password1!", "data/test-userrepo.csv", "researcher", false);
        boolean boolean19 = guest18.requiresDepartmentApproval();
        userRepository4.addUser((com.reservation_system.model.User) guest18);
        boolean boolean22 = userRepository4.emailExists("Alice");
        int int23 = userRepository4.getNextID();
        com.reservation_system.repository.UserRepository userRepository25 = new com.reservation_system.repository.UserRepository("data/test-userrepo.csv");
        boolean boolean27 = userRepository25.emailExists("Alice");
        com.reservation_system.repository.UserRepository userRepository29 = new com.reservation_system.repository.UserRepository("data/test-userrepo.csv");
        java.util.List<com.reservation_system.model.User> userList30 = userRepository29.getAllUsers();
        int int31 = userRepository29.getNextID();
        java.util.List<com.reservation_system.model.User> userList32 = userRepository29.getAllUsers();
        userRepository25.saveAllUsers(userList32);
        userRepository4.saveAllUsers(userList32);
        userRepository1.saveAllUsers(userList32);
        java.lang.Class<?> wildcardClass36 = userRepository1.getClass();
// flaky "22) test0152(com.reservation_system.randoop.userrepository.RegressionTest0)":         org.junit.Assert.assertTrue("'" + int2 + "' != '" + 101 + "'", int2 == 101);
        org.junit.Assert.assertNotNull(userList12);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
// flaky "13) test0152(com.reservation_system.randoop.userrepository.RegressionTest0)":         org.junit.Assert.assertTrue("'" + int23 + "' != '" + 101 + "'", int23 == 101);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(userList30);
// flaky "6) test0152(com.reservation_system.randoop.userrepository.RegressionTest0)":         org.junit.Assert.assertTrue("'" + int31 + "' != '" + 101 + "'", int31 == 101);
        org.junit.Assert.assertNotNull(userList32);
        org.junit.Assert.assertNotNull(wildcardClass36);
    }

    @Test
    public void test0153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0153");
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
        int int34 = userRepository1.getNextID();
// flaky "23) test0153(com.reservation_system.randoop.userrepository.RegressionTest0)":         org.junit.Assert.assertTrue("'" + int2 + "' != '" + 101 + "'", int2 == 101);
// flaky "14) test0153(com.reservation_system.randoop.userrepository.RegressionTest0)":         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 101 + "'", int3 == 101);
        org.junit.Assert.assertNotNull(userList11);
        org.junit.Assert.assertNotNull(userList14);
// flaky "7) test0153(com.reservation_system.randoop.userrepository.RegressionTest0)":         org.junit.Assert.assertTrue("'" + int15 + "' != '" + 101 + "'", int15 == 101);
        org.junit.Assert.assertNotNull(userList18);
// flaky "3) test0153(com.reservation_system.randoop.userrepository.RegressionTest0)":         org.junit.Assert.assertTrue("'" + int19 + "' != '" + 101 + "'", int19 == 101);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertNotNull(userOptional24);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
// flaky "2) test0153(com.reservation_system.randoop.userrepository.RegressionTest0)":         org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNotNull(userList31);
// flaky "2) test0153(com.reservation_system.randoop.userrepository.RegressionTest0)":         org.junit.Assert.assertTrue("'" + int34 + "' != '" + 101 + "'", int34 == 101);
    }

    @Test
    public void test0154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0154");
        com.reservation_system.model.Researcher researcher5 = new com.reservation_system.model.Researcher((int) 'a', "labmanager", "faculty", "", false);
        boolean boolean6 = researcher5.requiresDepartmentApproval();
        java.lang.String str7 = researcher5.getUserType();
        researcher5.setApproved(true);
        boolean boolean10 = researcher5.isApproved();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Researcher" + "'", str7, "Researcher");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test0155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0155");
        com.reservation_system.model.Guest guest5 = new com.reservation_system.model.Guest(100, "Researcher", "data/test-userrepo.csv", "data/test-userrepo.csv", true);
        guest5.setApproved(true);
    }

    @Test
    public void test0156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0156");
        com.reservation_system.model.LabManager labManager5 = new com.reservation_system.model.LabManager(1, "Researcher", "labmanager", "data/test-userrepo.csv", false);
        java.lang.String str6 = labManager5.getUserType();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "labmanager" + "'", str6, "labmanager");
    }

    @Test
    public void test0157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0157");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("data/test-userrepo.csv");
        java.util.List<com.reservation_system.model.User> userList2 = userRepository1.getAllUsers();
        int int3 = userRepository1.getNextID();
        boolean boolean5 = userRepository1.emailExists("headlabcoordinator");
        boolean boolean6 = userRepository1.headLabCoordinatorExists();
        java.util.Optional<com.reservation_system.model.User> userOptional8 = userRepository1.findByEmail("Alice");
        boolean boolean10 = userRepository1.emailExists("Alice");
        boolean boolean12 = userRepository1.emailExists("Guest");
        java.util.Optional<com.reservation_system.model.User> userOptional14 = userRepository1.findByEmail("headlabcoordinator");
        java.util.Optional<com.reservation_system.model.User> userOptional16 = userRepository1.findByEmail("headlabcoordinator");
        org.junit.Assert.assertNotNull(userList2);
// flaky "24) test0157(com.reservation_system.randoop.userrepository.RegressionTest0)":         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 101 + "'", int3 == 101);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(userOptional8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
// flaky "15) test0157(com.reservation_system.randoop.userrepository.RegressionTest0)":         org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(userOptional14);
        org.junit.Assert.assertNotNull(userOptional16);
    }

    @Test
    public void test0158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0158");
        com.reservation_system.model.Faculty faculty5 = new com.reservation_system.model.Faculty((int) (byte) -1, "faculty", "data/test-userrepo.csv", "Student", false);
        java.lang.String str6 = faculty5.getName();
        faculty5.setApproved(false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "faculty" + "'", str6, "faculty");
    }

    @Test
    public void test0159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0159");
        com.reservation_system.model.LabManager labManager5 = new com.reservation_system.model.LabManager((int) (byte) 10, "", "labmanager", "Faculty", false);
    }

    @Test
    public void test0160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0160");
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
        int int48 = userRepository1.getNextID();
        org.junit.Assert.assertNotNull(userList2);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Guest" + "'", str10, "Guest");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Guest" + "'", str11, "Guest");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Guest" + "'", str14, "Guest");
        org.junit.Assert.assertNotNull(userList18);
// flaky "25) test0160(com.reservation_system.randoop.userrepository.RegressionTest0)":         org.junit.Assert.assertTrue("'" + int19 + "' != '" + 101 + "'", int19 == 101);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertNotNull(userOptional24);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
// flaky "16) test0160(com.reservation_system.randoop.userrepository.RegressionTest0)":         org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "labmanager" + "'", str42, "labmanager");
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + true + "'", boolean44 == true);
        org.junit.Assert.assertNotNull(userList45);
// flaky "8) test0160(com.reservation_system.randoop.userrepository.RegressionTest0)":         org.junit.Assert.assertTrue("'" + int48 + "' != '" + 101 + "'", int48 == 101);
    }

    @Test
    public void test0161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0161");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("data/test-userrepo.csv");
        int int2 = userRepository1.getNextID();
        int int3 = userRepository1.getNextID();
        com.reservation_system.model.HeadLabCoordinator headLabCoordinator9 = new com.reservation_system.model.HeadLabCoordinator((int) (byte) 1, "", "", "guest", false);
        userRepository1.addUser((com.reservation_system.model.User) headLabCoordinator9);
        java.lang.String str11 = headLabCoordinator9.getEmail();
        int int12 = headLabCoordinator9.getID();
// flaky "26) test0161(com.reservation_system.randoop.userrepository.RegressionTest0)":         org.junit.Assert.assertTrue("'" + int2 + "' != '" + 101 + "'", int2 == 101);
// flaky "17) test0161(com.reservation_system.randoop.userrepository.RegressionTest0)":         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 101 + "'", int3 == 101);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
    }

    @Test
    public void test0162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0162");
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
        com.reservation_system.repository.UserRepository userRepository24 = new com.reservation_system.repository.UserRepository("data/test-userrepo.csv");
        com.reservation_system.model.Researcher researcher30 = new com.reservation_system.model.Researcher(5, "hi!", "labmanager", "Guest", false);
        userRepository24.addUser((com.reservation_system.model.User) researcher30);
        java.util.List<com.reservation_system.model.User> userList32 = userRepository24.getAllUsers();
        com.reservation_system.repository.UserRepository userRepository34 = new com.reservation_system.repository.UserRepository("data/test-userrepo.csv");
        com.reservation_system.model.Researcher researcher40 = new com.reservation_system.model.Researcher(5, "hi!", "labmanager", "Guest", false);
        userRepository34.addUser((com.reservation_system.model.User) researcher40);
        java.util.List<com.reservation_system.model.User> userList42 = userRepository34.getAllUsers();
        userRepository24.saveAllUsers(userList42);
        userRepository1.saveAllUsers(userList42);
        java.util.Optional<com.reservation_system.model.User> userOptional46 = userRepository1.findByEmail("alice@example.com");
        org.junit.Assert.assertNotNull(userList9);
        org.junit.Assert.assertNotNull(userOptional20);
        org.junit.Assert.assertNotNull(userList21);
        org.junit.Assert.assertNotNull(userList32);
        org.junit.Assert.assertNotNull(userList42);
        org.junit.Assert.assertNotNull(userOptional46);
    }

    @Test
    public void test0163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0163");
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
        boolean boolean24 = headLabCoordinator21.requiresDepartmentApproval();
// flaky "27) test0163(com.reservation_system.randoop.userrepository.RegressionTest0)":         org.junit.Assert.assertTrue("'" + int2 + "' != '" + 101 + "'", int2 == 101);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
// flaky "18) test0163(com.reservation_system.randoop.userrepository.RegressionTest0)":         org.junit.Assert.assertTrue("'" + int11 + "' != '" + 101 + "'", int11 == 101);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
    }

    @Test
    public void test0164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0164");
        com.reservation_system.model.LabManager labManager5 = new com.reservation_system.model.LabManager(98, "headlabcoordinator", "Alice", "Password1!", true);
        java.lang.String str6 = labManager5.getUserType();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "labmanager" + "'", str6, "labmanager");
    }

    @Test
    public void test0165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0165");
        com.reservation_system.model.Student student5 = new com.reservation_system.model.Student(1, "data/test-userrepo.csv", "alice@example.com", "guest", false);
        java.lang.String str6 = student5.getUserType();
        java.lang.String str7 = student5.getUserType();
        java.lang.String str8 = student5.getName();
        int int9 = student5.getID();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Student" + "'", str6, "Student");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Student" + "'", str7, "Student");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "data/test-userrepo.csv" + "'", str8, "data/test-userrepo.csv");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
    }

    @Test
    public void test0166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0166");
        com.reservation_system.model.Researcher researcher5 = new com.reservation_system.model.Researcher((int) 'a', "labmanager", "faculty", "", false);
        boolean boolean6 = researcher5.requiresDepartmentApproval();
        java.lang.String str7 = researcher5.getUserType();
        researcher5.setApproved(true);
        java.lang.String str10 = researcher5.getUserType();
        java.lang.String str11 = researcher5.getUserType();
        java.lang.String str12 = researcher5.getName();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Researcher" + "'", str7, "Researcher");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Researcher" + "'", str10, "Researcher");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Researcher" + "'", str11, "Researcher");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "labmanager" + "'", str12, "labmanager");
    }

    @Test
    public void test0167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0167");
        com.reservation_system.model.Faculty faculty5 = new com.reservation_system.model.Faculty(5, "alice@example.com", "Researcher", "data/test-userrepo.csv", false);
    }

    @Test
    public void test0168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0168");
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
        int int20 = userRepository1.getNextID();
// flaky "28) test0168(com.reservation_system.randoop.userrepository.RegressionTest0)":         org.junit.Assert.assertTrue("'" + int9 + "' != '" + 101 + "'", int9 == 101);
        org.junit.Assert.assertNotNull(userOptional11);
// flaky "19) test0168(com.reservation_system.randoop.userrepository.RegressionTest0)":         org.junit.Assert.assertTrue("'" + int12 + "' != '" + 101 + "'", int12 == 101);
        org.junit.Assert.assertNotNull(userOptional14);
        org.junit.Assert.assertNotNull(userList17);
        org.junit.Assert.assertNotNull(userList19);
// flaky "9) test0168(com.reservation_system.randoop.userrepository.RegressionTest0)":         org.junit.Assert.assertTrue("'" + int20 + "' != '" + 101 + "'", int20 == 101);
    }

    @Test
    public void test0169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0169");
        com.reservation_system.model.Guest guest5 = new com.reservation_system.model.Guest((int) (short) 100, "Alice", "Alice", "researcher", false);
    }

    @Test
    public void test0170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0170");
        com.reservation_system.model.Faculty faculty5 = new com.reservation_system.model.Faculty(10, "headlabcoordinator", "faculty", "labmanager", true);
    }

    @Test
    public void test0171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0171");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("data/test-userrepo.csv");
        boolean boolean3 = userRepository1.emailExists("Password1!");
        com.reservation_system.repository.UserRepository userRepository5 = new com.reservation_system.repository.UserRepository("data/test-userrepo.csv");
        java.util.List<com.reservation_system.model.User> userList6 = userRepository5.getAllUsers();
        userRepository1.saveAllUsers(userList6);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(userList6);
    }

    @Test
    public void test0172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0172");
        com.reservation_system.model.Student student5 = new com.reservation_system.model.Student(0, "Guest", "Password1!", "data/test-userrepo.csv", true);
        java.lang.String str6 = student5.getPassword();
        int int7 = student5.getID();
        student5.setApproved(false);
        java.lang.String str10 = student5.getEmail();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "data/test-userrepo.csv" + "'", str6, "data/test-userrepo.csv");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Password1!" + "'", str10, "Password1!");
    }

    @Test
    public void test0173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0173");
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
        java.util.Optional<com.reservation_system.model.User> userOptional26 = userRepository1.findByEmail("");
        org.junit.Assert.assertNotNull(userList9);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
// flaky "29) test0173(com.reservation_system.randoop.userrepository.RegressionTest0)":         org.junit.Assert.assertTrue("'" + int20 + "' != '" + 101 + "'", int20 == 101);
        org.junit.Assert.assertNotNull(userList23);
        org.junit.Assert.assertNotNull(userOptional26);
    }

    @Test
    public void test0174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0174");
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
        boolean boolean50 = userRepository1.headLabCoordinatorExists();
        org.junit.Assert.assertNotNull(userList9);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(userOptional21);
// flaky "30) test0174(com.reservation_system.randoop.userrepository.RegressionTest0)":         org.junit.Assert.assertTrue("'" + int22 + "' != '" + 101 + "'", int22 == 101);
// flaky "20) test0174(com.reservation_system.randoop.userrepository.RegressionTest0)":         org.junit.Assert.assertTrue("'" + int32 + "' != '" + 101 + "'", int32 == 101);
// flaky "10) test0174(com.reservation_system.randoop.userrepository.RegressionTest0)":         org.junit.Assert.assertTrue("'" + int35 + "' != '" + 101 + "'", int35 == 101);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
// flaky "4) test0174(com.reservation_system.randoop.userrepository.RegressionTest0)":         org.junit.Assert.assertTrue("'" + int44 + "' != '" + 101 + "'", int44 == 101);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertNotNull(userList47);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + true + "'", boolean50 == true);
    }

    @Test
    public void test0175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0175");
        com.reservation_system.model.LabManager labManager5 = new com.reservation_system.model.LabManager(98, "data/test-userrepo.csv", "headlabcoordinator", "Guest", true);
    }

    @Test
    public void test0176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0176");
        com.reservation_system.model.HeadLabCoordinator headLabCoordinator5 = new com.reservation_system.model.HeadLabCoordinator((int) (byte) 10, "data/test-userrepo.csv", "alice@example.com", "researcher", false);
    }

    @Test
    public void test0177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0177");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("data/test-userrepo.csv");
        java.util.List<com.reservation_system.model.User> userList2 = userRepository1.getAllUsers();
        int int3 = userRepository1.getNextID();
        com.reservation_system.repository.UserRepository userRepository5 = new com.reservation_system.repository.UserRepository("data/test-userrepo.csv");
        java.util.List<com.reservation_system.model.User> userList6 = userRepository5.getAllUsers();
        int int7 = userRepository5.getNextID();
        java.util.List<com.reservation_system.model.User> userList8 = userRepository5.getAllUsers();
        userRepository1.saveAllUsers(userList8);
        org.junit.Assert.assertNotNull(userList2);
// flaky "31) test0177(com.reservation_system.randoop.userrepository.RegressionTest0)":         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 101 + "'", int3 == 101);
        org.junit.Assert.assertNotNull(userList6);
// flaky "21) test0177(com.reservation_system.randoop.userrepository.RegressionTest0)":         org.junit.Assert.assertTrue("'" + int7 + "' != '" + 101 + "'", int7 == 101);
        org.junit.Assert.assertNotNull(userList8);
    }

    @Test
    public void test0178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0178");
        com.reservation_system.model.LabManager labManager5 = new com.reservation_system.model.LabManager(35, "alice@example.com", "Researcher", "Password1!", true);
    }

    @Test
    public void test0179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0179");
        com.reservation_system.model.Guest guest5 = new com.reservation_system.model.Guest(0, "Password1!", "data/test-userrepo.csv", "researcher", false);
        boolean boolean6 = guest5.requiresDepartmentApproval();
        java.lang.String str7 = guest5.getUserType();
        java.lang.String str8 = guest5.getUserType();
        java.lang.String str9 = guest5.getName();
        guest5.setApproved(false);
        java.lang.String str12 = guest5.getUserType();
        guest5.setApproved(false);
        java.lang.String str15 = guest5.getUserType();
        java.lang.String str16 = guest5.getUserType();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Guest" + "'", str7, "Guest");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Guest" + "'", str8, "Guest");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Password1!" + "'", str9, "Password1!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Guest" + "'", str12, "Guest");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Guest" + "'", str15, "Guest");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Guest" + "'", str16, "Guest");
    }

    @Test
    public void test0180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0180");
        com.reservation_system.model.Faculty faculty5 = new com.reservation_system.model.Faculty((int) (short) 1, "headlabcoordinator", "data/test-userrepo.csv", "Student", true);
        java.lang.String str6 = faculty5.getUserType();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Faculty" + "'", str6, "Faculty");
    }

    @Test
    public void test0181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0181");
        com.reservation_system.model.Student student5 = new com.reservation_system.model.Student(98, "Password1!", "Password1!", "student", false);
        java.lang.String str6 = student5.getUserType();
        java.lang.String str7 = student5.getEmail();
        java.lang.String str8 = student5.getEmail();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Student" + "'", str6, "Student");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Password1!" + "'", str7, "Password1!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Password1!" + "'", str8, "Password1!");
    }

    @Test
    public void test0182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0182");
        com.reservation_system.model.Student student5 = new com.reservation_system.model.Student((int) (short) 10, "headlabcoordinator", "Faculty", "headlabcoordinator", false);
    }

    @Test
    public void test0183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0183");
        com.reservation_system.model.HeadLabCoordinator headLabCoordinator5 = new com.reservation_system.model.HeadLabCoordinator(98, "researcher", "faculty", "Alice", false);
    }

    @Test
    public void test0184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0184");
        com.reservation_system.model.HeadLabCoordinator headLabCoordinator5 = new com.reservation_system.model.HeadLabCoordinator(6, "Guest", "Guest", "labmanager", true);
        java.lang.String str6 = headLabCoordinator5.getUserType();
        int int7 = headLabCoordinator5.getID();
        headLabCoordinator5.setApproved(false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "headlabcoordinator" + "'", str6, "headlabcoordinator");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 6 + "'", int7 == 6);
    }

    @Test
    public void test0185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0185");
        com.reservation_system.model.Researcher researcher5 = new com.reservation_system.model.Researcher(5, "", "Alice", "researcher", false);
        boolean boolean6 = researcher5.isApproved();
        java.lang.String str7 = researcher5.getUserType();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Researcher" + "'", str7, "Researcher");
    }

    @Test
    public void test0186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0186");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("data/test-userrepo.csv");
        com.reservation_system.model.Researcher researcher7 = new com.reservation_system.model.Researcher(5, "hi!", "labmanager", "Guest", false);
        userRepository1.addUser((com.reservation_system.model.User) researcher7);
        int int9 = userRepository1.getNextID();
        boolean boolean11 = userRepository1.emailExists("Researcher");
        java.util.List<com.reservation_system.model.User> userList12 = userRepository1.getAllUsers();
        java.util.Optional<com.reservation_system.model.User> userOptional14 = userRepository1.findByEmail("Guest");
// flaky "32) test0186(com.reservation_system.randoop.userrepository.RegressionTest0)":         org.junit.Assert.assertTrue("'" + int9 + "' != '" + 101 + "'", int9 == 101);
// flaky "22) test0186(com.reservation_system.randoop.userrepository.RegressionTest0)":         org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(userList12);
        org.junit.Assert.assertNotNull(userOptional14);
    }

    @Test
    public void test0187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0187");
        com.reservation_system.model.Faculty faculty5 = new com.reservation_system.model.Faculty((int) (byte) 0, "Faculty", "Researcher", "headlabcoordinator", true);
        java.lang.String str6 = faculty5.getEmail();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Researcher" + "'", str6, "Researcher");
    }

    @Test
    public void test0188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0188");
        com.reservation_system.model.Faculty faculty5 = new com.reservation_system.model.Faculty((int) (short) 1, "researcher", "alice@example.com", "Student", false);
        faculty5.setApproved(false);
        java.lang.String str8 = faculty5.getName();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "researcher" + "'", str8, "researcher");
    }

    @Test
    public void test0189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0189");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("data/test-userrepo.csv");
        java.util.List<com.reservation_system.model.User> userList2 = userRepository1.getAllUsers();
        int int3 = userRepository1.getNextID();
        boolean boolean5 = userRepository1.emailExists("headlabcoordinator");
        boolean boolean6 = userRepository1.headLabCoordinatorExists();
        java.util.Optional<com.reservation_system.model.User> userOptional8 = userRepository1.findByEmail("Alice");
        boolean boolean9 = userRepository1.headLabCoordinatorExists();
        boolean boolean11 = userRepository1.emailExists("Alice");
        org.junit.Assert.assertNotNull(userList2);
// flaky "33) test0189(com.reservation_system.randoop.userrepository.RegressionTest0)":         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 101 + "'", int3 == 101);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(userOptional8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test0190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0190");
        com.reservation_system.model.Researcher researcher5 = new com.reservation_system.model.Researcher(10, "alice@example.com", "guest", "headlabcoordinator", true);
    }

    @Test
    public void test0191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0191");
        com.reservation_system.model.Faculty faculty5 = new com.reservation_system.model.Faculty((int) (byte) -1, "Alice", "researcher", "Password1!", false);
        java.lang.String str6 = faculty5.getName();
        java.lang.String str7 = faculty5.getUserType();
        java.lang.String str8 = faculty5.getUserType();
        faculty5.setApproved(false);
        java.lang.String str11 = faculty5.getUserType();
        java.lang.String str12 = faculty5.getUserType();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Alice" + "'", str6, "Alice");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Faculty" + "'", str7, "Faculty");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Faculty" + "'", str8, "Faculty");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Faculty" + "'", str11, "Faculty");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Faculty" + "'", str12, "Faculty");
    }

    @Test
    public void test0192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0192");
        com.reservation_system.model.User user6 = com.reservation_system.patterns.factory.UserFactory.createUser("Guest", (int) (short) 10, "Password1!", "data/test-userrepo.csv", "researcher", false);
        int int7 = user6.getID();
        org.junit.Assert.assertNotNull(user6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 10 + "'", int7 == 10);
    }

    @Test
    public void test0193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0193");
        com.reservation_system.model.User user6 = com.reservation_system.patterns.factory.UserFactory.createUser("Researcher", 5, "alice@example.com", "Student", "researcher", false);
        java.lang.String str7 = user6.getEmail();
        java.lang.String str8 = user6.getName();
        boolean boolean9 = user6.requiresDepartmentApproval();
        java.lang.String str10 = user6.getEmail();
        org.junit.Assert.assertNotNull(user6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Student" + "'", str7, "Student");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Student" + "'", str10, "Student");
    }

    @Test
    public void test0194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0194");
        com.reservation_system.model.Faculty faculty5 = new com.reservation_system.model.Faculty(0, "Guest", "researcher", "Faculty", false);
    }

    @Test
    public void test0195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0195");
        com.reservation_system.model.User user6 = com.reservation_system.patterns.factory.UserFactory.createUser("Researcher", 10, "", "researcher", "guest", true);
        org.junit.Assert.assertNotNull(user6);
    }

    @Test
    public void test0196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0196");
        com.reservation_system.model.Researcher researcher5 = new com.reservation_system.model.Researcher(0, "", "Password1!", "researcher", false);
        researcher5.setApproved(true);
        int int8 = researcher5.getID();
        boolean boolean9 = researcher5.isApproved();
        java.lang.String str10 = researcher5.getUserType();
        java.lang.String str11 = researcher5.getUserType();
        java.lang.String str12 = researcher5.getUserType();
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Researcher" + "'", str10, "Researcher");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Researcher" + "'", str11, "Researcher");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Researcher" + "'", str12, "Researcher");
    }

    @Test
    public void test0197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0197");
        com.reservation_system.model.Student student5 = new com.reservation_system.model.Student(1, "data/test-userrepo.csv", "alice@example.com", "guest", false);
        java.lang.String str6 = student5.getUserType();
        java.lang.String str7 = student5.getUserType();
        java.lang.String str8 = student5.getUserType();
        java.lang.String str9 = student5.getUserType();
        java.lang.String str10 = student5.getUserType();
        student5.setApproved(false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Student" + "'", str6, "Student");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Student" + "'", str7, "Student");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Student" + "'", str8, "Student");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Student" + "'", str9, "Student");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Student" + "'", str10, "Student");
    }

    @Test
    public void test0198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0198");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("data/test-userrepo.csv");
        boolean boolean3 = userRepository1.emailExists("Alice");
        com.reservation_system.model.Researcher researcher9 = new com.reservation_system.model.Researcher((int) 'a', "labmanager", "faculty", "", false);
        boolean boolean10 = researcher9.isApproved();
        java.lang.String str11 = researcher9.getName();
        userRepository1.addUser((com.reservation_system.model.User) researcher9);
        java.lang.String str13 = researcher9.getUserType();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "labmanager" + "'", str11, "labmanager");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Researcher" + "'", str13, "Researcher");
    }

    @Test
    public void test0199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0199");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("data/test-userrepo.csv");
        java.util.List<com.reservation_system.model.User> userList2 = userRepository1.getAllUsers();
        int int3 = userRepository1.getNextID();
        boolean boolean5 = userRepository1.emailExists("headlabcoordinator");
        boolean boolean6 = userRepository1.headLabCoordinatorExists();
        int int7 = userRepository1.getNextID();
        com.reservation_system.model.Faculty faculty13 = new com.reservation_system.model.Faculty((int) (byte) -1, "Alice", "researcher", "Password1!", false);
        java.lang.String str14 = faculty13.getName();
        java.lang.String str15 = faculty13.getUserType();
        java.lang.String str16 = faculty13.getUserType();
        faculty13.setApproved(false);
        java.lang.String str19 = faculty13.getUserType();
        java.lang.String str20 = faculty13.getPassword();
        int int21 = faculty13.getID();
        userRepository1.addUser((com.reservation_system.model.User) faculty13);
        org.junit.Assert.assertNotNull(userList2);
// flaky "34) test0199(com.reservation_system.randoop.userrepository.RegressionTest0)":         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 101 + "'", int3 == 101);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
// flaky "23) test0199(com.reservation_system.randoop.userrepository.RegressionTest0)":         org.junit.Assert.assertTrue("'" + int7 + "' != '" + 101 + "'", int7 == 101);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Alice" + "'", str14, "Alice");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Faculty" + "'", str15, "Faculty");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Faculty" + "'", str16, "Faculty");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "Faculty" + "'", str19, "Faculty");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "Password1!" + "'", str20, "Password1!");
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
    }

    @Test
    public void test0200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0200");
        com.reservation_system.model.Guest guest5 = new com.reservation_system.model.Guest(35, "", "Guest", "student", true);
    }

    @Test
    public void test0201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0201");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("data/test-userrepo.csv");
        int int2 = userRepository1.getNextID();
        boolean boolean3 = userRepository1.headLabCoordinatorExists();
        com.reservation_system.model.Guest guest9 = new com.reservation_system.model.Guest((int) (byte) -1, "hi!", "", "Password1!", false);
        userRepository1.addUser((com.reservation_system.model.User) guest9);
        java.util.Optional<com.reservation_system.model.User> userOptional12 = userRepository1.findByEmail("Password1!");
        boolean boolean13 = userRepository1.headLabCoordinatorExists();
// flaky "35) test0201(com.reservation_system.randoop.userrepository.RegressionTest0)":         org.junit.Assert.assertTrue("'" + int2 + "' != '" + 101 + "'", int2 == 101);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(userOptional12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test0202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0202");
        com.reservation_system.model.Faculty faculty5 = new com.reservation_system.model.Faculty(100, "Password1!", "", "Student", false);
    }

    @Test
    public void test0203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0203");
        com.reservation_system.model.LabManager labManager5 = new com.reservation_system.model.LabManager((int) (byte) 100, "researcher", "alice@example.com", "", false);
        int int6 = labManager5.getID();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
    }

    @Test
    public void test0204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0204");
        // The following exception was thrown during execution in test generation
        try {
            com.reservation_system.model.User user6 = com.reservation_system.patterns.factory.UserFactory.createUser("data/test-userrepo.csv", 5, "alice@example.com", "Student", "Faculty", false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid user type: data/test-userrepo.csv");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0205");
        // The following exception was thrown during execution in test generation
        try {
            com.reservation_system.model.User user6 = com.reservation_system.patterns.factory.UserFactory.createUser("hi!", 100, "alice@example.com", "data/test-userrepo.csv", "Faculty", true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid user type: hi!");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0206");
        com.reservation_system.model.Researcher researcher5 = new com.reservation_system.model.Researcher(0, "", "Password1!", "researcher", false);
        researcher5.setApproved(true);
        int int8 = researcher5.getID();
        java.lang.String str9 = researcher5.getEmail();
        java.lang.String str10 = researcher5.getUserType();
        int int11 = researcher5.getID();
        boolean boolean12 = researcher5.requiresDepartmentApproval();
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Password1!" + "'", str9, "Password1!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Researcher" + "'", str10, "Researcher");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test0207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0207");
        com.reservation_system.model.LabManager labManager5 = new com.reservation_system.model.LabManager(10, "Password1!", "data/test-userrepo.csv", "Guest", true);
        java.lang.String str6 = labManager5.getUserType();
        java.lang.String str7 = labManager5.getPassword();
        java.lang.String str8 = labManager5.getPassword();
        int int9 = labManager5.getID();
        java.lang.String str10 = labManager5.getUserType();
        java.lang.Class<?> wildcardClass11 = labManager5.getClass();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "labmanager" + "'", str6, "labmanager");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Guest" + "'", str7, "Guest");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Guest" + "'", str8, "Guest");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10 + "'", int9 == 10);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "labmanager" + "'", str10, "labmanager");
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0208");
        com.reservation_system.model.User user6 = com.reservation_system.patterns.factory.UserFactory.createUser("faculty", (int) (byte) 1, "hi!", "", "alice@example.com", false);
        org.junit.Assert.assertNotNull(user6);
    }

    @Test
    public void test0209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0209");
        com.reservation_system.model.Researcher researcher5 = new com.reservation_system.model.Researcher((int) (short) -1, "guest", "Researcher", "Faculty", true);
    }

    @Test
    public void test0210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0210");
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
        com.reservation_system.model.Student student27 = new com.reservation_system.model.Student(1, "data/test-userrepo.csv", "alice@example.com", "guest", false);
        java.lang.String str28 = student27.getUserType();
        student27.setApproved(false);
        java.lang.String str31 = student27.getUserType();
        java.lang.String str32 = student27.getUserType();
        java.lang.String str33 = student27.getUserType();
        userRepository1.addUser((com.reservation_system.model.User) student27);
        org.junit.Assert.assertNotNull(userList9);
        org.junit.Assert.assertNotNull(userList19);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "Student" + "'", str28, "Student");
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "Student" + "'", str31, "Student");
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "Student" + "'", str32, "Student");
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "Student" + "'", str33, "Student");
    }

    @Test
    public void test0211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0211");
        com.reservation_system.model.Student student5 = new com.reservation_system.model.Student(1, "data/test-userrepo.csv", "alice@example.com", "guest", false);
        java.lang.String str6 = student5.getUserType();
        java.lang.String str7 = student5.getUserType();
        java.lang.String str8 = student5.getName();
        java.lang.Class<?> wildcardClass9 = student5.getClass();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Student" + "'", str6, "Student");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Student" + "'", str7, "Student");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "data/test-userrepo.csv" + "'", str8, "data/test-userrepo.csv");
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0212");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("data/test-userrepo.csv");
        java.util.List<com.reservation_system.model.User> userList2 = userRepository1.getAllUsers();
        int int3 = userRepository1.getNextID();
        boolean boolean5 = userRepository1.emailExists("headlabcoordinator");
        com.reservation_system.model.HeadLabCoordinator headLabCoordinator11 = new com.reservation_system.model.HeadLabCoordinator(6, "Guest", "Guest", "labmanager", true);
        userRepository1.addUser((com.reservation_system.model.User) headLabCoordinator11);
        java.lang.String str13 = headLabCoordinator11.getUserType();
        org.junit.Assert.assertNotNull(userList2);
// flaky "36) test0212(com.reservation_system.randoop.userrepository.RegressionTest0)":         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 101 + "'", int3 == 101);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "headlabcoordinator" + "'", str13, "headlabcoordinator");
    }

    @Test
    public void test0213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0213");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("data/test-userrepo.csv");
        int int2 = userRepository1.getNextID();
        boolean boolean3 = userRepository1.headLabCoordinatorExists();
        com.reservation_system.model.Guest guest9 = new com.reservation_system.model.Guest((int) (byte) -1, "hi!", "", "Password1!", false);
        userRepository1.addUser((com.reservation_system.model.User) guest9);
        com.reservation_system.repository.UserRepository userRepository12 = new com.reservation_system.repository.UserRepository("data/test-userrepo.csv");
        java.util.Optional<com.reservation_system.model.User> userOptional14 = userRepository12.findByEmail("hi!");
        java.util.List<com.reservation_system.model.User> userList15 = userRepository12.getAllUsers();
        userRepository1.saveAllUsers(userList15);
// flaky "37) test0213(com.reservation_system.randoop.userrepository.RegressionTest0)":         org.junit.Assert.assertTrue("'" + int2 + "' != '" + 101 + "'", int2 == 101);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(userOptional14);
        org.junit.Assert.assertNotNull(userList15);
    }

    @Test
    public void test0214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0214");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("data/test-userrepo.csv");
        com.reservation_system.model.Faculty faculty7 = new com.reservation_system.model.Faculty(5, "researcher", "guest", "faculty", true);
        java.lang.String str8 = faculty7.getUserType();
        java.lang.String str9 = faculty7.getUserType();
        userRepository1.addUser((com.reservation_system.model.User) faculty7);
        faculty7.setApproved(true);
        boolean boolean13 = faculty7.isApproved();
        java.lang.String str14 = faculty7.getUserType();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Faculty" + "'", str8, "Faculty");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Faculty" + "'", str9, "Faculty");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Faculty" + "'", str14, "Faculty");
    }

    @Test
    public void test0215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0215");
        com.reservation_system.model.User user6 = com.reservation_system.patterns.factory.UserFactory.createUser("headlabcoordinator", 10, "Researcher", "guest", "Password1!", false);
        user6.setApproved(true);
        java.lang.String str9 = user6.getName();
        org.junit.Assert.assertNotNull(user6);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Researcher" + "'", str9, "Researcher");
    }

    @Test
    public void test0216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0216");
        com.reservation_system.model.LabManager labManager5 = new com.reservation_system.model.LabManager((int) (byte) 1, "Password1!", "Password1!", "", true);
    }

    @Test
    public void test0217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0217");
        com.reservation_system.model.User user6 = com.reservation_system.patterns.factory.UserFactory.createUser("Guest", 0, "faculty", "Password1!", "Guest", false);
        org.junit.Assert.assertNotNull(user6);
    }

    @Test
    public void test0218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0218");
        com.reservation_system.model.HeadLabCoordinator headLabCoordinator5 = new com.reservation_system.model.HeadLabCoordinator((int) (short) 1, "hi!", "guest", "Alice", false);
        boolean boolean6 = headLabCoordinator5.requiresDepartmentApproval();
        java.lang.String str7 = headLabCoordinator5.getUserType();
        java.lang.String str8 = headLabCoordinator5.getUserType();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "headlabcoordinator" + "'", str7, "headlabcoordinator");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "headlabcoordinator" + "'", str8, "headlabcoordinator");
    }

    @Test
    public void test0219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0219");
        // The following exception was thrown during execution in test generation
        try {
            com.reservation_system.model.User user6 = com.reservation_system.patterns.factory.UserFactory.createUser("data/test-userrepo.csv", 101, "Researcher", "guest", "labmanager", false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid user type: data/test-userrepo.csv");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0220");
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
        boolean boolean24 = userRepository1.emailExists("researcher");
// flaky "38) test0220(com.reservation_system.randoop.userrepository.RegressionTest0)":         org.junit.Assert.assertTrue("'" + int2 + "' != '" + 101 + "'", int2 == 101);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
// flaky "24) test0220(com.reservation_system.randoop.userrepository.RegressionTest0)":         org.junit.Assert.assertTrue("'" + int11 + "' != '" + 101 + "'", int11 == 101);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
// flaky "11) test0220(com.reservation_system.randoop.userrepository.RegressionTest0)":         org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertNotNull(userList21);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
    }

    @Test
    public void test0221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0221");
        // The following exception was thrown during execution in test generation
        try {
            com.reservation_system.model.User user6 = com.reservation_system.patterns.factory.UserFactory.createUser("", 0, "guest", "researcher", "guest", true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid user type: ");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0222");
        com.reservation_system.model.Guest guest5 = new com.reservation_system.model.Guest(0, "Password1!", "data/test-userrepo.csv", "researcher", false);
        boolean boolean6 = guest5.requiresDepartmentApproval();
        java.lang.String str7 = guest5.getUserType();
        java.lang.String str8 = guest5.getUserType();
        java.lang.String str9 = guest5.getName();
        guest5.setApproved(false);
        java.lang.String str12 = guest5.getUserType();
        java.lang.String str13 = guest5.getEmail();
        java.lang.String str14 = guest5.getUserType();
        java.lang.String str15 = guest5.getName();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Guest" + "'", str7, "Guest");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Guest" + "'", str8, "Guest");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Password1!" + "'", str9, "Password1!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Guest" + "'", str12, "Guest");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "data/test-userrepo.csv" + "'", str13, "data/test-userrepo.csv");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Guest" + "'", str14, "Guest");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Password1!" + "'", str15, "Password1!");
    }

    @Test
    public void test0223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0223");
        com.reservation_system.model.Researcher researcher5 = new com.reservation_system.model.Researcher(5, "", "Alice", "researcher", false);
        int int6 = researcher5.getID();
        java.lang.String str7 = researcher5.getUserType();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 5 + "'", int6 == 5);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Researcher" + "'", str7, "Researcher");
    }

    @Test
    public void test0224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0224");
        com.reservation_system.model.Guest guest5 = new com.reservation_system.model.Guest(0, "Password1!", "data/test-userrepo.csv", "researcher", false);
        boolean boolean6 = guest5.requiresDepartmentApproval();
        java.lang.String str7 = guest5.getUserType();
        java.lang.String str8 = guest5.getUserType();
        java.lang.Class<?> wildcardClass9 = guest5.getClass();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Guest" + "'", str7, "Guest");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Guest" + "'", str8, "Guest");
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0225");
        com.reservation_system.model.HeadLabCoordinator headLabCoordinator5 = new com.reservation_system.model.HeadLabCoordinator((int) (short) -1, "data/test-userrepo.csv", "guest", "labmanager", true);
        java.lang.String str6 = headLabCoordinator5.getUserType();
        int int7 = headLabCoordinator5.getID();
        java.lang.String str8 = headLabCoordinator5.getUserType();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "headlabcoordinator" + "'", str6, "headlabcoordinator");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "headlabcoordinator" + "'", str8, "headlabcoordinator");
    }

    @Test
    public void test0226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0226");
        com.reservation_system.model.User user6 = com.reservation_system.patterns.factory.UserFactory.createUser("guest", (int) 'a', "guest", "Alice", "student", false);
        org.junit.Assert.assertNotNull(user6);
    }

    @Test
    public void test0227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0227");
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
        java.util.Optional<com.reservation_system.model.User> userOptional25 = userRepository1.findByEmail("researcher");
        int int26 = userRepository1.getNextID();
// flaky "39) test0227(com.reservation_system.randoop.userrepository.RegressionTest0)":         org.junit.Assert.assertTrue("'" + int2 + "' != '" + 101 + "'", int2 == 101);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
// flaky "25) test0227(com.reservation_system.randoop.userrepository.RegressionTest0)":         org.junit.Assert.assertTrue("'" + int11 + "' != '" + 101 + "'", int11 == 101);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(userOptional25);
// flaky "12) test0227(com.reservation_system.randoop.userrepository.RegressionTest0)":         org.junit.Assert.assertTrue("'" + int26 + "' != '" + 101 + "'", int26 == 101);
    }

    @Test
    public void test0228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0228");
        com.reservation_system.model.Faculty faculty5 = new com.reservation_system.model.Faculty((int) (byte) 100, "", "labmanager", "faculty", true);
        java.lang.String str6 = faculty5.getUserType();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Faculty" + "'", str6, "Faculty");
    }

    @Test
    public void test0229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0229");
        com.reservation_system.model.Faculty faculty5 = new com.reservation_system.model.Faculty(6, "Faculty", "Faculty", "Student", true);
    }

    @Test
    public void test0230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0230");
        com.reservation_system.model.Faculty faculty5 = new com.reservation_system.model.Faculty((int) (short) -1, "Faculty", "hi!", "alice@example.com", true);
        java.lang.String str6 = faculty5.getUserType();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Faculty" + "'", str6, "Faculty");
    }

    @Test
    public void test0231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0231");
        com.reservation_system.model.LabManager labManager5 = new com.reservation_system.model.LabManager((int) '#', "data/test-userrepo.csv", "headlabcoordinator", "researcher", false);
        boolean boolean6 = labManager5.requiresDepartmentApproval();
        java.lang.String str7 = labManager5.getUserType();
        java.lang.String str8 = labManager5.getPassword();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "labmanager" + "'", str7, "labmanager");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "researcher" + "'", str8, "researcher");
    }

    @Test
    public void test0232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0232");
        com.reservation_system.model.HeadLabCoordinator headLabCoordinator5 = new com.reservation_system.model.HeadLabCoordinator(6, "labmanager", "faculty", "Faculty", false);
    }

    @Test
    public void test0233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0233");
        com.reservation_system.model.LabManager labManager5 = new com.reservation_system.model.LabManager((int) (short) 100, "labmanager", "student", "Guest", false);
    }

    @Test
    public void test0234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0234");
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
        boolean boolean20 = userRepository1.emailExists("headlabcoordinator");
// flaky "40) test0234(com.reservation_system.randoop.userrepository.RegressionTest0)":         org.junit.Assert.assertTrue("'" + int9 + "' != '" + 101 + "'", int9 == 101);
        org.junit.Assert.assertNotNull(userOptional11);
// flaky "26) test0234(com.reservation_system.randoop.userrepository.RegressionTest0)":         org.junit.Assert.assertTrue("'" + int12 + "' != '" + 101 + "'", int12 == 101);
        org.junit.Assert.assertNotNull(userOptional14);
        org.junit.Assert.assertNotNull(userList17);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test0235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0235");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("data/test-userrepo.csv");
        java.util.List<com.reservation_system.model.User> userList2 = userRepository1.getAllUsers();
        int int3 = userRepository1.getNextID();
        boolean boolean5 = userRepository1.emailExists("headlabcoordinator");
        com.reservation_system.model.Researcher researcher11 = new com.reservation_system.model.Researcher((int) (byte) 1, "data/test-userrepo.csv", "alice@example.com", "", false);
        userRepository1.addUser((com.reservation_system.model.User) researcher11);
        int int13 = researcher11.getID();
        org.junit.Assert.assertNotNull(userList2);
// flaky "41) test0235(com.reservation_system.randoop.userrepository.RegressionTest0)":         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 101 + "'", int3 == 101);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
    }

    @Test
    public void test0236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0236");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("data/test-userrepo.csv");
        java.util.List<com.reservation_system.model.User> userList2 = userRepository1.getAllUsers();
        int int3 = userRepository1.getNextID();
        boolean boolean5 = userRepository1.emailExists("headlabcoordinator");
        boolean boolean6 = userRepository1.headLabCoordinatorExists();
        java.util.Optional<com.reservation_system.model.User> userOptional8 = userRepository1.findByEmail("Alice");
        boolean boolean10 = userRepository1.emailExists("Alice");
        boolean boolean12 = userRepository1.emailExists("");
        org.junit.Assert.assertNotNull(userList2);
// flaky "42) test0236(com.reservation_system.randoop.userrepository.RegressionTest0)":         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 101 + "'", int3 == 101);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(userOptional8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test0237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0237");
        // The following exception was thrown during execution in test generation
        try {
            com.reservation_system.model.User user6 = com.reservation_system.patterns.factory.UserFactory.createUser("data/test-userrepo.csv", 0, "guest", "Guest", "alice@example.com", false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid user type: data/test-userrepo.csv");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0238");
        com.reservation_system.model.Researcher researcher5 = new com.reservation_system.model.Researcher(100, "researcher", "", "Student", true);
    }

    @Test
    public void test0239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0239");
        com.reservation_system.model.User user6 = com.reservation_system.patterns.factory.UserFactory.createUser("Guest", (-1), "Researcher", "student", "researcher", true);
        org.junit.Assert.assertNotNull(user6);
    }

    @Test
    public void test0240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0240");
        com.reservation_system.model.HeadLabCoordinator headLabCoordinator5 = new com.reservation_system.model.HeadLabCoordinator((int) (byte) 100, "Password1!", "guest", "Faculty", true);
        java.lang.String str6 = headLabCoordinator5.getUserType();
        java.lang.String str7 = headLabCoordinator5.getUserType();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "headlabcoordinator" + "'", str6, "headlabcoordinator");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "headlabcoordinator" + "'", str7, "headlabcoordinator");
    }

    @Test
    public void test0241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0241");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("data/test-userrepo.csv");
        boolean boolean3 = userRepository1.emailExists("Password1!");
        boolean boolean5 = userRepository1.emailExists("hi!");
        java.util.List<com.reservation_system.model.User> userList6 = userRepository1.getAllUsers();
        java.util.Optional<com.reservation_system.model.User> userOptional8 = userRepository1.findByEmail("headlabcoordinator");
        java.util.List<com.reservation_system.model.User> userList9 = userRepository1.getAllUsers();
        java.lang.Class<?> wildcardClass10 = userList9.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
// flaky "43) test0241(com.reservation_system.randoop.userrepository.RegressionTest0)":         org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(userList6);
        org.junit.Assert.assertNotNull(userOptional8);
        org.junit.Assert.assertNotNull(userList9);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0242");
        com.reservation_system.model.HeadLabCoordinator headLabCoordinator5 = new com.reservation_system.model.HeadLabCoordinator(0, "labmanager", "labmanager", "labmanager", false);
    }

    @Test
    public void test0243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0243");
        com.reservation_system.model.Student student5 = new com.reservation_system.model.Student(98, "Password1!", "Password1!", "student", false);
        java.lang.String str6 = student5.getPassword();
        java.lang.String str7 = student5.getUserType();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "student" + "'", str6, "student");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Student" + "'", str7, "Student");
    }

    @Test
    public void test0244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0244");
        com.reservation_system.model.Researcher researcher5 = new com.reservation_system.model.Researcher(5, "", "Alice", "researcher", false);
        boolean boolean6 = researcher5.requiresDepartmentApproval();
        java.lang.String str7 = researcher5.getUserType();
        boolean boolean8 = researcher5.isApproved();
        int int9 = researcher5.getID();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Researcher" + "'", str7, "Researcher");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 5 + "'", int9 == 5);
    }

    @Test
    public void test0245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0245");
        com.reservation_system.model.Student student5 = new com.reservation_system.model.Student(1, "data/test-userrepo.csv", "alice@example.com", "guest", false);
        java.lang.String str6 = student5.getUserType();
        student5.setApproved(false);
        java.lang.String str9 = student5.getUserType();
        java.lang.String str10 = student5.getPassword();
        java.lang.String str11 = student5.getUserType();
        student5.setApproved(true);
        student5.setApproved(false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Student" + "'", str6, "Student");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Student" + "'", str9, "Student");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "guest" + "'", str10, "guest");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Student" + "'", str11, "Student");
    }

    @Test
    public void test0246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0246");
        com.reservation_system.model.HeadLabCoordinator headLabCoordinator5 = new com.reservation_system.model.HeadLabCoordinator(0, "Guest", "Faculty", "guest", false);
        java.lang.String str6 = headLabCoordinator5.getUserType();
        java.lang.String str7 = headLabCoordinator5.getName();
        java.lang.String str8 = headLabCoordinator5.getUserType();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "headlabcoordinator" + "'", str6, "headlabcoordinator");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Guest" + "'", str7, "Guest");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "headlabcoordinator" + "'", str8, "headlabcoordinator");
    }

    @Test
    public void test0247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0247");
        com.reservation_system.model.Guest guest5 = new com.reservation_system.model.Guest((int) '#', "", "Student", "guest", true);
        java.lang.String str6 = guest5.getPassword();
        boolean boolean7 = guest5.requiresDepartmentApproval();
        java.lang.String str8 = guest5.getUserType();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "guest" + "'", str6, "guest");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Guest" + "'", str8, "Guest");
    }

    @Test
    public void test0248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0248");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("data/test-userrepo.csv");
        com.reservation_system.model.Researcher researcher7 = new com.reservation_system.model.Researcher(5, "hi!", "labmanager", "Guest", false);
        userRepository1.addUser((com.reservation_system.model.User) researcher7);
        java.util.List<com.reservation_system.model.User> userList9 = userRepository1.getAllUsers();
        boolean boolean10 = userRepository1.headLabCoordinatorExists();
        boolean boolean12 = userRepository1.emailExists("guest");
        int int13 = userRepository1.getNextID();
        java.lang.Class<?> wildcardClass14 = userRepository1.getClass();
        org.junit.Assert.assertNotNull(userList9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
// flaky "44) test0248(com.reservation_system.randoop.userrepository.RegressionTest0)":         org.junit.Assert.assertTrue("'" + int13 + "' != '" + 101 + "'", int13 == 101);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test0249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0249");
        com.reservation_system.model.Student student5 = new com.reservation_system.model.Student(52, "faculty", "faculty", "student", true);
    }

    @Test
    public void test0250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0250");
        com.reservation_system.model.Researcher researcher5 = new com.reservation_system.model.Researcher(10, "Guest", "Password1!", "student", false);
    }

    @Test
    public void test0251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0251");
        com.reservation_system.model.LabManager labManager5 = new com.reservation_system.model.LabManager(100, "faculty", "", "Faculty", true);
    }

    @Test
    public void test0252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0252");
        com.reservation_system.model.Student student5 = new com.reservation_system.model.Student(98, "student", "researcher", "guest", true);
    }

    @Test
    public void test0253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0253");
        com.reservation_system.model.User user6 = com.reservation_system.patterns.factory.UserFactory.createUser("faculty", (int) (short) 0, "", "data/test-userrepo.csv", "Guest", false);
        org.junit.Assert.assertNotNull(user6);
    }

    @Test
    public void test0254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0254");
        com.reservation_system.model.Researcher researcher5 = new com.reservation_system.model.Researcher((int) (short) -1, "labmanager", "faculty", "headlabcoordinator", true);
        java.lang.String str6 = researcher5.getPassword();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "headlabcoordinator" + "'", str6, "headlabcoordinator");
    }

    @Test
    public void test0255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0255");
        com.reservation_system.model.User user6 = com.reservation_system.patterns.factory.UserFactory.createUser("guest", (int) (byte) 0, "labmanager", "headlabcoordinator", "data/test-userrepo.csv", true);
        org.junit.Assert.assertNotNull(user6);
    }

    @Test
    public void test0256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0256");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("data/test-userrepo.csv");
        com.reservation_system.model.Researcher researcher7 = new com.reservation_system.model.Researcher(5, "hi!", "labmanager", "Guest", false);
        userRepository1.addUser((com.reservation_system.model.User) researcher7);
        com.reservation_system.repository.UserRepository userRepository10 = new com.reservation_system.repository.UserRepository("data/test-userrepo.csv");
        com.reservation_system.model.Researcher researcher16 = new com.reservation_system.model.Researcher(5, "hi!", "labmanager", "Guest", false);
        userRepository10.addUser((com.reservation_system.model.User) researcher16);
        int int18 = userRepository10.getNextID();
        java.util.List<com.reservation_system.model.User> userList19 = userRepository10.getAllUsers();
        userRepository1.saveAllUsers(userList19);
        java.lang.Class<?> wildcardClass21 = userList19.getClass();
// flaky "45) test0256(com.reservation_system.randoop.userrepository.RegressionTest0)":         org.junit.Assert.assertTrue("'" + int18 + "' != '" + 101 + "'", int18 == 101);
        org.junit.Assert.assertNotNull(userList19);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test0257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0257");
        com.reservation_system.model.Student student5 = new com.reservation_system.model.Student(0, "Guest", "Password1!", "data/test-userrepo.csv", true);
        int int6 = student5.getID();
        student5.setApproved(true);
        java.lang.String str9 = student5.getUserType();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Student" + "'", str9, "Student");
    }

    @Test
    public void test0258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0258");
        com.reservation_system.model.LabManager labManager5 = new com.reservation_system.model.LabManager(10, "Password1!", "data/test-userrepo.csv", "Guest", true);
        java.lang.String str6 = labManager5.getUserType();
        java.lang.String str7 = labManager5.getPassword();
        java.lang.String str8 = labManager5.getPassword();
        int int9 = labManager5.getID();
        java.lang.String str10 = labManager5.getUserType();
        java.lang.String str11 = labManager5.getUserType();
        int int12 = labManager5.getID();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "labmanager" + "'", str6, "labmanager");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Guest" + "'", str7, "Guest");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Guest" + "'", str8, "Guest");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10 + "'", int9 == 10);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "labmanager" + "'", str10, "labmanager");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "labmanager" + "'", str11, "labmanager");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 10 + "'", int12 == 10);
    }

    @Test
    public void test0259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0259");
        com.reservation_system.model.Faculty faculty5 = new com.reservation_system.model.Faculty(1, "Faculty", "Student", "Student", false);
    }

    @Test
    public void test0260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0260");
        com.reservation_system.model.Student student5 = new com.reservation_system.model.Student((-1), "hi!", "Student", "Guest", true);
    }

    @Test
    public void test0261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0261");
        com.reservation_system.model.LabManager labManager5 = new com.reservation_system.model.LabManager((int) '#', "researcher", "Guest", "headlabcoordinator", true);
        boolean boolean6 = labManager5.isApproved();
        java.lang.String str7 = labManager5.getEmail();
        labManager5.setApproved(true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Guest" + "'", str7, "Guest");
    }

    @Test
    public void test0262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0262");
        com.reservation_system.model.Student student5 = new com.reservation_system.model.Student((int) '#', "data/test-userrepo.csv", "guest", "guest", true);
    }

    @Test
    public void test0263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0263");
        com.reservation_system.model.LabManager labManager5 = new com.reservation_system.model.LabManager((int) '#', "researcher", "Guest", "headlabcoordinator", true);
        boolean boolean6 = labManager5.isApproved();
        java.lang.String str7 = labManager5.getUserType();
        boolean boolean8 = labManager5.requiresDepartmentApproval();
        java.lang.String str9 = labManager5.getName();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "labmanager" + "'", str7, "labmanager");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "researcher" + "'", str9, "researcher");
    }

    @Test
    public void test0264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0264");
        com.reservation_system.model.Researcher researcher5 = new com.reservation_system.model.Researcher(5, "", "Alice", "researcher", false);
        java.lang.String str6 = researcher5.getPassword();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "researcher" + "'", str6, "researcher");
    }

    @Test
    public void test0265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0265");
        com.reservation_system.model.Student student5 = new com.reservation_system.model.Student(35, "faculty", "hi!", "", false);
    }

    @Test
    public void test0266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0266");
        com.reservation_system.model.HeadLabCoordinator headLabCoordinator5 = new com.reservation_system.model.HeadLabCoordinator((int) (short) 100, "alice@example.com", "Guest", "labmanager", true);
        boolean boolean6 = headLabCoordinator5.isApproved();
        boolean boolean7 = headLabCoordinator5.requiresDepartmentApproval();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test0267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0267");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("data/test-userrepo.csv");
        com.reservation_system.model.Researcher researcher7 = new com.reservation_system.model.Researcher(5, "hi!", "labmanager", "Guest", false);
        userRepository1.addUser((com.reservation_system.model.User) researcher7);
        java.util.List<com.reservation_system.model.User> userList9 = userRepository1.getAllUsers();
        boolean boolean11 = userRepository1.emailExists("hi!");
        com.reservation_system.model.LabManager labManager17 = new com.reservation_system.model.LabManager(1, "Researcher", "labmanager", "data/test-userrepo.csv", false);
        userRepository1.addUser((com.reservation_system.model.User) labManager17);
        java.lang.String str19 = labManager17.getUserType();
        boolean boolean20 = labManager17.isApproved();
        org.junit.Assert.assertNotNull(userList9);
// flaky "46) test0267(com.reservation_system.randoop.userrepository.RegressionTest0)":         org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "labmanager" + "'", str19, "labmanager");
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test0268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0268");
        com.reservation_system.model.LabManager labManager5 = new com.reservation_system.model.LabManager(10, "Password1!", "data/test-userrepo.csv", "Guest", true);
        java.lang.String str6 = labManager5.getUserType();
        java.lang.String str7 = labManager5.getPassword();
        java.lang.String str8 = labManager5.getEmail();
        java.lang.String str9 = labManager5.getName();
        java.lang.String str10 = labManager5.getPassword();
        java.lang.String str11 = labManager5.getUserType();
        boolean boolean12 = labManager5.requiresDepartmentApproval();
        boolean boolean13 = labManager5.isApproved();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "labmanager" + "'", str6, "labmanager");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Guest" + "'", str7, "Guest");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "data/test-userrepo.csv" + "'", str8, "data/test-userrepo.csv");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Password1!" + "'", str9, "Password1!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Guest" + "'", str10, "Guest");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "labmanager" + "'", str11, "labmanager");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test0269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0269");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("data/test-userrepo.csv");
        com.reservation_system.model.Researcher researcher7 = new com.reservation_system.model.Researcher(5, "hi!", "labmanager", "Guest", false);
        userRepository1.addUser((com.reservation_system.model.User) researcher7);
        java.util.List<com.reservation_system.model.User> userList9 = userRepository1.getAllUsers();
        boolean boolean11 = userRepository1.emailExists("hi!");
        com.reservation_system.model.LabManager labManager17 = new com.reservation_system.model.LabManager(1, "Researcher", "labmanager", "data/test-userrepo.csv", false);
        userRepository1.addUser((com.reservation_system.model.User) labManager17);
        java.lang.Class<?> wildcardClass19 = labManager17.getClass();
        org.junit.Assert.assertNotNull(userList9);
// flaky "47) test0269(com.reservation_system.randoop.userrepository.RegressionTest0)":         org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test0270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0270");
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
        java.lang.Class<?> wildcardClass65 = userList61.getClass();
        org.junit.Assert.assertNotNull(userList2);
// flaky "48) test0270(com.reservation_system.randoop.userrepository.RegressionTest0)":         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 101 + "'", int3 == 101);
        org.junit.Assert.assertNotNull(userList6);
// flaky "27) test0270(com.reservation_system.randoop.userrepository.RegressionTest0)":         org.junit.Assert.assertTrue("'" + int7 + "' != '" + 101 + "'", int7 == 101);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(userOptional12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(userList19);
        org.junit.Assert.assertNotNull(userList30);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
// flaky "13) test0270(com.reservation_system.randoop.userrepository.RegressionTest0)":         org.junit.Assert.assertTrue("'" + int41 + "' != '" + 101 + "'", int41 == 101);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertNotNull(userList48);
// flaky "5) test0270(com.reservation_system.randoop.userrepository.RegressionTest0)":         org.junit.Assert.assertTrue("'" + int49 + "' != '" + 101 + "'", int49 == 101);
        org.junit.Assert.assertNotNull(userList50);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
        org.junit.Assert.assertNotNull(userList59);
// flaky "3) test0270(com.reservation_system.randoop.userrepository.RegressionTest0)":         org.junit.Assert.assertTrue("'" + int60 + "' != '" + 101 + "'", int60 == 101);
        org.junit.Assert.assertNotNull(userList61);
        org.junit.Assert.assertNotNull(wildcardClass65);
    }

    @Test
    public void test0271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0271");
        com.reservation_system.model.HeadLabCoordinator headLabCoordinator5 = new com.reservation_system.model.HeadLabCoordinator((int) (short) -1, "data/test-userrepo.csv", "guest", "labmanager", true);
        boolean boolean6 = headLabCoordinator5.requiresDepartmentApproval();
        int int7 = headLabCoordinator5.getID();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
    }

    @Test
    public void test0272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0272");
        com.reservation_system.model.HeadLabCoordinator headLabCoordinator5 = new com.reservation_system.model.HeadLabCoordinator(98, "Researcher", "Password1!", "researcher", true);
    }

    @Test
    public void test0273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0273");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("data/test-userrepo.csv");
        com.reservation_system.model.Researcher researcher7 = new com.reservation_system.model.Researcher(5, "hi!", "labmanager", "Guest", false);
        userRepository1.addUser((com.reservation_system.model.User) researcher7);
        int int9 = userRepository1.getNextID();
        int int10 = userRepository1.getNextID();
        int int11 = userRepository1.getNextID();
        boolean boolean12 = userRepository1.headLabCoordinatorExists();
// flaky "49) test0273(com.reservation_system.randoop.userrepository.RegressionTest0)":         org.junit.Assert.assertTrue("'" + int9 + "' != '" + 101 + "'", int9 == 101);
// flaky "28) test0273(com.reservation_system.randoop.userrepository.RegressionTest0)":         org.junit.Assert.assertTrue("'" + int10 + "' != '" + 101 + "'", int10 == 101);
// flaky "14) test0273(com.reservation_system.randoop.userrepository.RegressionTest0)":         org.junit.Assert.assertTrue("'" + int11 + "' != '" + 101 + "'", int11 == 101);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test0274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0274");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("data/test-userrepo.csv");
        com.reservation_system.model.Researcher researcher7 = new com.reservation_system.model.Researcher(5, "hi!", "labmanager", "Guest", false);
        userRepository1.addUser((com.reservation_system.model.User) researcher7);
        int int9 = userRepository1.getNextID();
        com.reservation_system.repository.UserRepository userRepository11 = new com.reservation_system.repository.UserRepository("data/test-userrepo.csv");
        int int12 = userRepository11.getNextID();
        boolean boolean13 = userRepository11.headLabCoordinatorExists();
        com.reservation_system.model.Guest guest19 = new com.reservation_system.model.Guest((int) (byte) -1, "hi!", "", "Password1!", false);
        userRepository11.addUser((com.reservation_system.model.User) guest19);
        int int21 = userRepository11.getNextID();
        boolean boolean23 = userRepository11.emailExists("headlabcoordinator");
        java.util.List<com.reservation_system.model.User> userList24 = userRepository11.getAllUsers();
        userRepository1.saveAllUsers(userList24);
        com.reservation_system.repository.UserRepository userRepository27 = new com.reservation_system.repository.UserRepository("data/test-userrepo.csv");
        com.reservation_system.model.Researcher researcher33 = new com.reservation_system.model.Researcher(5, "hi!", "labmanager", "Guest", false);
        userRepository27.addUser((com.reservation_system.model.User) researcher33);
        java.lang.String str35 = researcher33.getUserType();
        userRepository1.addUser((com.reservation_system.model.User) researcher33);
// flaky "50) test0274(com.reservation_system.randoop.userrepository.RegressionTest0)":         org.junit.Assert.assertTrue("'" + int9 + "' != '" + 101 + "'", int9 == 101);
// flaky "29) test0274(com.reservation_system.randoop.userrepository.RegressionTest0)":         org.junit.Assert.assertTrue("'" + int12 + "' != '" + 101 + "'", int12 == 101);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
// flaky "15) test0274(com.reservation_system.randoop.userrepository.RegressionTest0)":         org.junit.Assert.assertTrue("'" + int21 + "' != '" + 101 + "'", int21 == 101);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(userList24);
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "Researcher" + "'", str35, "Researcher");
    }

    @Test
    public void test0275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0275");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("data/test-userrepo.csv");
        com.reservation_system.model.Researcher researcher7 = new com.reservation_system.model.Researcher(5, "hi!", "labmanager", "Guest", false);
        userRepository1.addUser((com.reservation_system.model.User) researcher7);
        java.util.Optional<com.reservation_system.model.User> userOptional10 = userRepository1.findByEmail("alice@example.com");
        java.util.List<com.reservation_system.model.User> userList11 = userRepository1.getAllUsers();
        java.util.Optional<com.reservation_system.model.User> userOptional13 = userRepository1.findByEmail("Password1!");
        int int14 = userRepository1.getNextID();
        java.util.List<com.reservation_system.model.User> userList15 = userRepository1.getAllUsers();
        org.junit.Assert.assertNotNull(userOptional10);
        org.junit.Assert.assertNotNull(userList11);
        org.junit.Assert.assertNotNull(userOptional13);
// flaky "51) test0275(com.reservation_system.randoop.userrepository.RegressionTest0)":         org.junit.Assert.assertTrue("'" + int14 + "' != '" + 101 + "'", int14 == 101);
        org.junit.Assert.assertNotNull(userList15);
    }

    @Test
    public void test0276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0276");
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
        boolean boolean23 = user21.requiresDepartmentApproval();
        boolean boolean24 = user21.isApproved();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "labmanager" + "'", str11, "labmanager");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
// flaky "52) test0276(com.reservation_system.randoop.userrepository.RegressionTest0)":         org.junit.Assert.assertTrue("'" + int14 + "' != '" + 101 + "'", int14 == 101);
        org.junit.Assert.assertNotNull(user21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
    }

    @Test
    public void test0277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0277");
        com.reservation_system.model.Faculty faculty5 = new com.reservation_system.model.Faculty(1, "Faculty", "headlabcoordinator", "data/test-userrepo.csv", false);
    }

    @Test
    public void test0278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0278");
        com.reservation_system.model.HeadLabCoordinator headLabCoordinator5 = new com.reservation_system.model.HeadLabCoordinator((int) (byte) 0, "student", "researcher", "", false);
    }

    @Test
    public void test0279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0279");
        com.reservation_system.model.Guest guest5 = new com.reservation_system.model.Guest(0, "Password1!", "data/test-userrepo.csv", "researcher", false);
        java.lang.String str6 = guest5.getUserType();
        guest5.setApproved(true);
        boolean boolean9 = guest5.requiresDepartmentApproval();
        int int10 = guest5.getID();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Guest" + "'", str6, "Guest");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test0280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0280");
        com.reservation_system.model.LabManager labManager5 = new com.reservation_system.model.LabManager((int) '#', "data/test-userrepo.csv", "headlabcoordinator", "researcher", false);
        java.lang.String str6 = labManager5.getEmail();
        boolean boolean7 = labManager5.requiresDepartmentApproval();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "headlabcoordinator" + "'", str6, "headlabcoordinator");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test0281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0281");
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
        java.util.List<com.reservation_system.model.User> userList26 = userRepository25.getAllUsers();
        int int27 = userRepository25.getNextID();
        boolean boolean29 = userRepository25.emailExists("headlabcoordinator");
        boolean boolean30 = userRepository25.headLabCoordinatorExists();
        com.reservation_system.repository.UserRepository userRepository32 = new com.reservation_system.repository.UserRepository("data/test-userrepo.csv");
        java.util.List<com.reservation_system.model.User> userList33 = userRepository32.getAllUsers();
        userRepository25.saveAllUsers(userList33);
        userRepository1.saveAllUsers(userList33);
        org.junit.Assert.assertNotNull(userList9);
        org.junit.Assert.assertNotNull(userOptional20);
        org.junit.Assert.assertNotNull(userList21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertNotNull(userList26);
// flaky "53) test0281(com.reservation_system.randoop.userrepository.RegressionTest0)":         org.junit.Assert.assertTrue("'" + int27 + "' != '" + 101 + "'", int27 == 101);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertNotNull(userList33);
    }

    @Test
    public void test0282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0282");
        com.reservation_system.model.Student student5 = new com.reservation_system.model.Student((int) (short) 100, "guest", "Guest", "Researcher", true);
    }

    @Test
    public void test0283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0283");
        com.reservation_system.model.Faculty faculty5 = new com.reservation_system.model.Faculty((int) '4', "Researcher", "Guest", "hi!", true);
        java.lang.String str6 = faculty5.getEmail();
        boolean boolean7 = faculty5.requiresDepartmentApproval();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Guest" + "'", str6, "Guest");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test0284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0284");
        com.reservation_system.model.Guest guest5 = new com.reservation_system.model.Guest(35, "Alice", "headlabcoordinator", "faculty", true);
    }

    @Test
    public void test0285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0285");
        com.reservation_system.model.HeadLabCoordinator headLabCoordinator5 = new com.reservation_system.model.HeadLabCoordinator((int) (byte) 100, "Password1!", "guest", "Faculty", true);
        java.lang.String str6 = headLabCoordinator5.getUserType();
        boolean boolean7 = headLabCoordinator5.isApproved();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "headlabcoordinator" + "'", str6, "headlabcoordinator");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test0286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0286");
        com.reservation_system.model.Guest guest5 = new com.reservation_system.model.Guest((int) (short) 10, "student", "labmanager", "researcher", true);
        java.lang.String str6 = guest5.getUserType();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Guest" + "'", str6, "Guest");
    }

    @Test
    public void test0287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0287");
        com.reservation_system.model.Researcher researcher5 = new com.reservation_system.model.Researcher((int) (short) 1, "researcher", "data/test-userrepo.csv", "hi!", false);
    }

    @Test
    public void test0288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0288");
        com.reservation_system.model.User user6 = com.reservation_system.patterns.factory.UserFactory.createUser("Faculty", (int) (byte) 1, "Faculty", "student", "Password1!", true);
        boolean boolean7 = user6.requiresDepartmentApproval();
        org.junit.Assert.assertNotNull(user6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test0289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0289");
        com.reservation_system.model.Faculty faculty5 = new com.reservation_system.model.Faculty((int) (short) 1, "researcher", "alice@example.com", "Student", false);
        java.lang.String str6 = faculty5.getUserType();
        java.lang.String str7 = faculty5.getEmail();
        java.lang.String str8 = faculty5.getPassword();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Faculty" + "'", str6, "Faculty");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Student" + "'", str8, "Student");
    }

    @Test
    public void test0290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0290");
        com.reservation_system.model.Faculty faculty5 = new com.reservation_system.model.Faculty((int) '#', "researcher", "labmanager", "", false);
        faculty5.setApproved(true);
        java.lang.String str8 = faculty5.getEmail();
        java.lang.Class<?> wildcardClass9 = faculty5.getClass();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "labmanager" + "'", str8, "labmanager");
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0291");
        com.reservation_system.model.HeadLabCoordinator headLabCoordinator5 = new com.reservation_system.model.HeadLabCoordinator(6, "Guest", "Guest", "labmanager", true);
        java.lang.String str6 = headLabCoordinator5.getUserType();
        int int7 = headLabCoordinator5.getID();
        java.lang.String str8 = headLabCoordinator5.getPassword();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "headlabcoordinator" + "'", str6, "headlabcoordinator");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 6 + "'", int7 == 6);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "labmanager" + "'", str8, "labmanager");
    }

    @Test
    public void test0292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0292");
        com.reservation_system.model.User user6 = com.reservation_system.patterns.factory.UserFactory.createUser("labmanager", 100, "labmanager", "data/test-userrepo.csv", "researcher", true);
        org.junit.Assert.assertNotNull(user6);
    }

    @Test
    public void test0293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0293");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("data/test-userrepo.csv");
        java.util.List<com.reservation_system.model.User> userList2 = userRepository1.getAllUsers();
        int int3 = userRepository1.getNextID();
        boolean boolean5 = userRepository1.emailExists("headlabcoordinator");
        boolean boolean6 = userRepository1.headLabCoordinatorExists();
        int int7 = userRepository1.getNextID();
        boolean boolean9 = userRepository1.emailExists("Researcher");
        boolean boolean10 = userRepository1.headLabCoordinatorExists();
        java.lang.Class<?> wildcardClass11 = userRepository1.getClass();
        org.junit.Assert.assertNotNull(userList2);
// flaky "54) test0293(com.reservation_system.randoop.userrepository.RegressionTest0)":         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 101 + "'", int3 == 101);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
// flaky "30) test0293(com.reservation_system.randoop.userrepository.RegressionTest0)":         org.junit.Assert.assertTrue("'" + int7 + "' != '" + 101 + "'", int7 == 101);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0294");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("data/test-userrepo.csv");
        int int2 = userRepository1.getNextID();
        boolean boolean3 = userRepository1.headLabCoordinatorExists();
        com.reservation_system.model.Guest guest9 = new com.reservation_system.model.Guest((int) (byte) -1, "hi!", "", "Password1!", false);
        userRepository1.addUser((com.reservation_system.model.User) guest9);
        int int11 = userRepository1.getNextID();
        boolean boolean13 = userRepository1.emailExists("headlabcoordinator");
        java.util.List<com.reservation_system.model.User> userList14 = userRepository1.getAllUsers();
        boolean boolean16 = userRepository1.emailExists("data/test-userrepo.csv");
// flaky "55) test0294(com.reservation_system.randoop.userrepository.RegressionTest0)":         org.junit.Assert.assertTrue("'" + int2 + "' != '" + 101 + "'", int2 == 101);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
// flaky "31) test0294(com.reservation_system.randoop.userrepository.RegressionTest0)":         org.junit.Assert.assertTrue("'" + int11 + "' != '" + 101 + "'", int11 == 101);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(userList14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
    }

    @Test
    public void test0295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0295");
        com.reservation_system.model.Researcher researcher5 = new com.reservation_system.model.Researcher((int) (byte) -1, "headlabcoordinator", "Researcher", "alice@example.com", false);
    }

    @Test
    public void test0296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0296");
        com.reservation_system.model.LabManager labManager5 = new com.reservation_system.model.LabManager((int) (short) 1, "researcher", "guest", "researcher", true);
    }

    @Test
    public void test0297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0297");
        com.reservation_system.model.Researcher researcher5 = new com.reservation_system.model.Researcher((int) 'a', "labmanager", "faculty", "", false);
        boolean boolean6 = researcher5.requiresDepartmentApproval();
        java.lang.String str7 = researcher5.getUserType();
        researcher5.setApproved(true);
        java.lang.String str10 = researcher5.getUserType();
        boolean boolean11 = researcher5.isApproved();
        java.lang.String str12 = researcher5.getUserType();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Researcher" + "'", str7, "Researcher");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Researcher" + "'", str10, "Researcher");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Researcher" + "'", str12, "Researcher");
    }

    @Test
    public void test0298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0298");
        com.reservation_system.model.User user6 = com.reservation_system.patterns.factory.UserFactory.createUser("headlabcoordinator", (int) ' ', "alice@example.com", "alice@example.com", "Alice", true);
        org.junit.Assert.assertNotNull(user6);
    }

    @Test
    public void test0299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0299");
        com.reservation_system.model.LabManager labManager5 = new com.reservation_system.model.LabManager(5, "Alice", "", "Guest", true);
    }

    @Test
    public void test0300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0300");
        com.reservation_system.model.Researcher researcher5 = new com.reservation_system.model.Researcher(0, "", "Password1!", "researcher", false);
        researcher5.setApproved(true);
        int int8 = researcher5.getID();
        java.lang.String str9 = researcher5.getPassword();
        java.lang.Class<?> wildcardClass10 = researcher5.getClass();
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "researcher" + "'", str9, "researcher");
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0301");
        com.reservation_system.model.Student student5 = new com.reservation_system.model.Student((-1), "headlabcoordinator", "faculty", "Guest", false);
        java.lang.Class<?> wildcardClass6 = student5.getClass();
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0302");
        com.reservation_system.model.Student student5 = new com.reservation_system.model.Student((int) (short) 100, "data/test-userrepo.csv", "Guest", "guest", false);
        boolean boolean6 = student5.isApproved();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test0303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0303");
        com.reservation_system.model.LabManager labManager5 = new com.reservation_system.model.LabManager(35, "labmanager", "Alice", "Password1!", true);
    }

    @Test
    public void test0304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0304");
        com.reservation_system.model.User user6 = com.reservation_system.patterns.factory.UserFactory.createUser("Student", (-1), "researcher", "data/test-userrepo.csv", "alice@example.com", false);
        org.junit.Assert.assertNotNull(user6);
    }

    @Test
    public void test0305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0305");
        com.reservation_system.model.Researcher researcher5 = new com.reservation_system.model.Researcher((int) (byte) 0, "guest", "", "Alice", true);
    }

    @Test
    public void test0306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0306");
        com.reservation_system.model.Researcher researcher5 = new com.reservation_system.model.Researcher((int) 'a', "", "labmanager", "data/test-userrepo.csv", true);
        int int6 = researcher5.getID();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 97 + "'", int6 == 97);
    }

    @Test
    public void test0307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0307");
        com.reservation_system.model.Researcher researcher5 = new com.reservation_system.model.Researcher(100, "student", "guest", "headlabcoordinator", false);
        java.lang.String str6 = researcher5.getUserType();
        java.lang.String str7 = researcher5.getEmail();
        java.lang.String str8 = researcher5.getName();
        java.lang.String str9 = researcher5.getUserType();
        java.lang.String str10 = researcher5.getName();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Researcher" + "'", str6, "Researcher");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "guest" + "'", str7, "guest");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "student" + "'", str8, "student");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Researcher" + "'", str9, "Researcher");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "student" + "'", str10, "student");
    }

    @Test
    public void test0308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0308");
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
        java.lang.String str24 = headLabCoordinator21.getUserType();
// flaky "56) test0308(com.reservation_system.randoop.userrepository.RegressionTest0)":         org.junit.Assert.assertTrue("'" + int2 + "' != '" + 101 + "'", int2 == 101);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
// flaky "32) test0308(com.reservation_system.randoop.userrepository.RegressionTest0)":         org.junit.Assert.assertTrue("'" + int11 + "' != '" + 101 + "'", int11 == 101);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "headlabcoordinator" + "'", str24, "headlabcoordinator");
    }

    @Test
    public void test0309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0309");
        com.reservation_system.model.Guest guest5 = new com.reservation_system.model.Guest((int) '4', "Student", "Alice", "guest", true);
    }

    @Test
    public void test0310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0310");
        com.reservation_system.model.User user6 = com.reservation_system.patterns.factory.UserFactory.createUser("guest", (int) (byte) 10, "guest", "faculty", "Faculty", false);
        org.junit.Assert.assertNotNull(user6);
    }

    @Test
    public void test0311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0311");
        com.reservation_system.model.LabManager labManager5 = new com.reservation_system.model.LabManager((int) (byte) 100, "", "Researcher", "", true);
    }

    @Test
    public void test0312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0312");
        com.reservation_system.model.Guest guest5 = new com.reservation_system.model.Guest((int) '#', "hi!", "data/test-userrepo.csv", "", false);
        java.lang.String str6 = guest5.getUserType();
        java.lang.Class<?> wildcardClass7 = guest5.getClass();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Guest" + "'", str6, "Guest");
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0313");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("data/test-userrepo.csv");
        boolean boolean3 = userRepository1.emailExists("Password1!");
        com.reservation_system.model.Faculty faculty9 = new com.reservation_system.model.Faculty((-1), "headlabcoordinator", "Student", "", false);
        userRepository1.addUser((com.reservation_system.model.User) faculty9);
        faculty9.setApproved(false);
        faculty9.setApproved(false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
    }

    @Test
    public void test0314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0314");
        com.reservation_system.model.Researcher researcher5 = new com.reservation_system.model.Researcher((int) '#', "data/test-userrepo.csv", "Student", "faculty", false);
        boolean boolean6 = researcher5.requiresDepartmentApproval();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test0315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0315");
        com.reservation_system.model.Researcher researcher5 = new com.reservation_system.model.Researcher(0, "", "headlabcoordinator", "Alice", true);
    }

    @Test
    public void test0316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0316");
        com.reservation_system.model.HeadLabCoordinator headLabCoordinator5 = new com.reservation_system.model.HeadLabCoordinator(5, "student", "headlabcoordinator", "Guest", true);
    }

    @Test
    public void test0317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0317");
        com.reservation_system.model.Guest guest5 = new com.reservation_system.model.Guest((int) (byte) 10, "Guest", "guest", "", false);
        boolean boolean6 = guest5.isApproved();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test0318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0318");
        com.reservation_system.model.LabManager labManager5 = new com.reservation_system.model.LabManager((int) (short) 1, "Password1!", "Guest", "faculty", true);
    }

    @Test
    public void test0319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0319");
        com.reservation_system.model.LabManager labManager5 = new com.reservation_system.model.LabManager(10, "Guest", "Guest", "faculty", true);
        java.lang.String str6 = labManager5.getUserType();
        java.lang.String str7 = labManager5.getPassword();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "labmanager" + "'", str6, "labmanager");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "faculty" + "'", str7, "faculty");
    }

    @Test
    public void test0320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0320");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("data/test-userrepo.csv");
        int int2 = userRepository1.getNextID();
        int int3 = userRepository1.getNextID();
        com.reservation_system.model.HeadLabCoordinator headLabCoordinator9 = new com.reservation_system.model.HeadLabCoordinator((int) (byte) 1, "", "", "guest", false);
        userRepository1.addUser((com.reservation_system.model.User) headLabCoordinator9);
        java.util.List<com.reservation_system.model.User> userList11 = userRepository1.getAllUsers();
        boolean boolean13 = userRepository1.emailExists("Faculty");
        java.util.List<com.reservation_system.model.User> userList14 = userRepository1.getAllUsers();
        boolean boolean16 = userRepository1.emailExists("labmanager");
// flaky "57) test0320(com.reservation_system.randoop.userrepository.RegressionTest0)":         org.junit.Assert.assertTrue("'" + int2 + "' != '" + 101 + "'", int2 == 101);
// flaky "33) test0320(com.reservation_system.randoop.userrepository.RegressionTest0)":         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 101 + "'", int3 == 101);
        org.junit.Assert.assertNotNull(userList11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(userList14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
    }

    @Test
    public void test0321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0321");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("data/test-userrepo.csv");
        com.reservation_system.model.Researcher researcher7 = new com.reservation_system.model.Researcher(5, "hi!", "labmanager", "Guest", false);
        userRepository1.addUser((com.reservation_system.model.User) researcher7);
        java.util.List<com.reservation_system.model.User> userList9 = userRepository1.getAllUsers();
        com.reservation_system.model.Guest guest15 = new com.reservation_system.model.Guest(0, "Password1!", "data/test-userrepo.csv", "researcher", false);
        boolean boolean16 = guest15.requiresDepartmentApproval();
        userRepository1.addUser((com.reservation_system.model.User) guest15);
        java.lang.String str18 = guest15.getUserType();
        java.lang.String str19 = guest15.getUserType();
        org.junit.Assert.assertNotNull(userList9);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Guest" + "'", str18, "Guest");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "Guest" + "'", str19, "Guest");
    }

    @Test
    public void test0322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0322");
        com.reservation_system.model.Faculty faculty5 = new com.reservation_system.model.Faculty(5, "researcher", "guest", "faculty", true);
        java.lang.String str6 = faculty5.getUserType();
        java.lang.String str7 = faculty5.getEmail();
        java.lang.String str8 = faculty5.getUserType();
        java.lang.String str9 = faculty5.getUserType();
        java.lang.String str10 = faculty5.getUserType();
        java.lang.String str11 = faculty5.getUserType();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Faculty" + "'", str6, "Faculty");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "guest" + "'", str7, "guest");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Faculty" + "'", str8, "Faculty");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Faculty" + "'", str9, "Faculty");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Faculty" + "'", str10, "Faculty");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Faculty" + "'", str11, "Faculty");
    }

    @Test
    public void test0323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0323");
        com.reservation_system.model.Student student5 = new com.reservation_system.model.Student((int) (short) 0, "Student", "data/test-userrepo.csv", "data/test-userrepo.csv", false);
    }

    @Test
    public void test0324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0324");
        com.reservation_system.model.Researcher researcher5 = new com.reservation_system.model.Researcher(6, "data/test-userrepo.csv", "faculty", "Faculty", true);
        java.lang.String str6 = researcher5.getUserType();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Researcher" + "'", str6, "Researcher");
    }

    @Test
    public void test0325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0325");
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
        java.util.Optional<com.reservation_system.model.User> userOptional49 = userRepository1.findByEmail("Faculty");
        org.junit.Assert.assertNotNull(userList2);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Guest" + "'", str10, "Guest");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Guest" + "'", str11, "Guest");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Guest" + "'", str14, "Guest");
        org.junit.Assert.assertNotNull(userList18);
// flaky "58) test0325(com.reservation_system.randoop.userrepository.RegressionTest0)":         org.junit.Assert.assertTrue("'" + int19 + "' != '" + 101 + "'", int19 == 101);
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
        org.junit.Assert.assertNotNull(userOptional49);
    }

    @Test
    public void test0326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0326");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("data/test-userrepo.csv");
        java.util.Optional<com.reservation_system.model.User> userOptional3 = userRepository1.findByEmail("hi!");
        com.reservation_system.repository.UserRepository userRepository5 = new com.reservation_system.repository.UserRepository("data/test-userrepo.csv");
        com.reservation_system.model.Researcher researcher11 = new com.reservation_system.model.Researcher(5, "hi!", "labmanager", "Guest", false);
        userRepository5.addUser((com.reservation_system.model.User) researcher11);
        java.util.List<com.reservation_system.model.User> userList13 = userRepository5.getAllUsers();
        com.reservation_system.model.Guest guest19 = new com.reservation_system.model.Guest(0, "Password1!", "data/test-userrepo.csv", "researcher", false);
        boolean boolean20 = guest19.requiresDepartmentApproval();
        userRepository5.addUser((com.reservation_system.model.User) guest19);
        boolean boolean23 = userRepository5.emailExists("Alice");
        int int24 = userRepository5.getNextID();
        com.reservation_system.repository.UserRepository userRepository26 = new com.reservation_system.repository.UserRepository("data/test-userrepo.csv");
        boolean boolean28 = userRepository26.emailExists("Alice");
        com.reservation_system.repository.UserRepository userRepository30 = new com.reservation_system.repository.UserRepository("data/test-userrepo.csv");
        java.util.List<com.reservation_system.model.User> userList31 = userRepository30.getAllUsers();
        int int32 = userRepository30.getNextID();
        java.util.List<com.reservation_system.model.User> userList33 = userRepository30.getAllUsers();
        userRepository26.saveAllUsers(userList33);
        userRepository5.saveAllUsers(userList33);
        userRepository1.saveAllUsers(userList33);
        org.junit.Assert.assertNotNull(userOptional3);
        org.junit.Assert.assertNotNull(userList13);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
// flaky "59) test0326(com.reservation_system.randoop.userrepository.RegressionTest0)":         org.junit.Assert.assertTrue("'" + int24 + "' != '" + 101 + "'", int24 == 101);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNotNull(userList31);
// flaky "34) test0326(com.reservation_system.randoop.userrepository.RegressionTest0)":         org.junit.Assert.assertTrue("'" + int32 + "' != '" + 101 + "'", int32 == 101);
        org.junit.Assert.assertNotNull(userList33);
    }

    @Test
    public void test0327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0327");
        com.reservation_system.model.LabManager labManager5 = new com.reservation_system.model.LabManager((int) '#', "data/test-userrepo.csv", "headlabcoordinator", "researcher", false);
        java.lang.String str6 = labManager5.getEmail();
        java.lang.String str7 = labManager5.getPassword();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "headlabcoordinator" + "'", str6, "headlabcoordinator");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "researcher" + "'", str7, "researcher");
    }

    @Test
    public void test0328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0328");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("data/test-userrepo.csv");
        boolean boolean3 = userRepository1.emailExists("Alice");
        int int4 = userRepository1.getNextID();
        boolean boolean5 = userRepository1.headLabCoordinatorExists();
        boolean boolean6 = userRepository1.headLabCoordinatorExists();
        boolean boolean8 = userRepository1.emailExists("Researcher");
        com.reservation_system.model.Student student14 = new com.reservation_system.model.Student(1, "data/test-userrepo.csv", "alice@example.com", "guest", false);
        java.lang.String str15 = student14.getUserType();
        student14.setApproved(false);
        boolean boolean18 = student14.requiresDepartmentApproval();
        java.lang.String str19 = student14.getUserType();
        boolean boolean20 = student14.isApproved();
        userRepository1.addUser((com.reservation_system.model.User) student14);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
// flaky "60) test0328(com.reservation_system.randoop.userrepository.RegressionTest0)":         org.junit.Assert.assertTrue("'" + int4 + "' != '" + 101 + "'", int4 == 101);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Student" + "'", str15, "Student");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "Student" + "'", str19, "Student");
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test0329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0329");
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
        com.reservation_system.repository.UserRepository userRepository31 = new com.reservation_system.repository.UserRepository("data/test-userrepo.csv");
        int int32 = userRepository31.getNextID();
        int int33 = userRepository31.getNextID();
        java.util.List<com.reservation_system.model.User> userList34 = userRepository31.getAllUsers();
        userRepository1.saveAllUsers(userList34);
        java.lang.Class<?> wildcardClass36 = userList34.getClass();
        org.junit.Assert.assertNotNull(userList9);
        org.junit.Assert.assertNotNull(userOptional20);
        org.junit.Assert.assertNotNull(userList21);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 101 + "'", int32 == 101);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 101 + "'", int33 == 101);
        org.junit.Assert.assertNotNull(userList34);
        org.junit.Assert.assertNotNull(wildcardClass36);
    }

    @Test
    public void test0330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0330");
        com.reservation_system.model.Researcher researcher5 = new com.reservation_system.model.Researcher((int) 'a', "", "labmanager", "data/test-userrepo.csv", true);
        researcher5.setApproved(false);
        java.lang.String str8 = researcher5.getEmail();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "labmanager" + "'", str8, "labmanager");
    }

    @Test
    public void test0331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0331");
        com.reservation_system.model.Guest guest5 = new com.reservation_system.model.Guest(0, "Password1!", "data/test-userrepo.csv", "researcher", false);
        boolean boolean6 = guest5.requiresDepartmentApproval();
        java.lang.String str7 = guest5.getEmail();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "data/test-userrepo.csv" + "'", str7, "data/test-userrepo.csv");
    }

    @Test
    public void test0332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0332");
        com.reservation_system.model.Student student5 = new com.reservation_system.model.Student(1, "labmanager", "data/test-userrepo.csv", "Researcher", false);
        boolean boolean6 = student5.isApproved();
        java.lang.String str7 = student5.getUserType();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Student" + "'", str7, "Student");
    }

    @Test
    public void test0333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0333");
        com.reservation_system.model.User user6 = com.reservation_system.patterns.factory.UserFactory.createUser("student", (-1), "Alice", "researcher", "Faculty", true);
        org.junit.Assert.assertNotNull(user6);
    }

    @Test
    public void test0334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0334");
        com.reservation_system.model.Student student5 = new com.reservation_system.model.Student(100, "hi!", "Student", "Researcher", false);
        java.lang.Class<?> wildcardClass6 = student5.getClass();
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0335");
        com.reservation_system.model.LabManager labManager5 = new com.reservation_system.model.LabManager((int) (byte) -1, "faculty", "Student", "student", false);
        labManager5.setApproved(true);
    }

    @Test
    public void test0336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0336");
        com.reservation_system.model.HeadLabCoordinator headLabCoordinator5 = new com.reservation_system.model.HeadLabCoordinator(101, "Student", "researcher", "", false);
        int int6 = headLabCoordinator5.getID();
        java.lang.String str7 = headLabCoordinator5.getUserType();
        java.lang.String str8 = headLabCoordinator5.getUserType();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 101 + "'", int6 == 101);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "headlabcoordinator" + "'", str7, "headlabcoordinator");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "headlabcoordinator" + "'", str8, "headlabcoordinator");
    }

    @Test
    public void test0337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0337");
        com.reservation_system.model.Guest guest5 = new com.reservation_system.model.Guest((int) (short) 10, "researcher", "Guest", "labmanager", true);
        java.lang.String str6 = guest5.getEmail();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Guest" + "'", str6, "Guest");
    }

    @Test
    public void test0338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0338");
        com.reservation_system.model.LabManager labManager5 = new com.reservation_system.model.LabManager((int) '#', "researcher", "Guest", "headlabcoordinator", true);
        labManager5.setApproved(false);
    }

    @Test
    public void test0339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0339");
        com.reservation_system.model.Researcher researcher5 = new com.reservation_system.model.Researcher(100, "student", "guest", "headlabcoordinator", false);
        java.lang.String str6 = researcher5.getUserType();
        int int7 = researcher5.getID();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Researcher" + "'", str6, "Researcher");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 100 + "'", int7 == 100);
    }

    @Test
    public void test0340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0340");
        com.reservation_system.model.LabManager labManager5 = new com.reservation_system.model.LabManager((int) (byte) -1, "Password1!", "student", "alice@example.com", true);
    }

    @Test
    public void test0341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0341");
        com.reservation_system.model.Researcher researcher5 = new com.reservation_system.model.Researcher(98, "faculty", "Alice", "Password1!", false);
    }

    @Test
    public void test0342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0342");
        com.reservation_system.model.HeadLabCoordinator headLabCoordinator5 = new com.reservation_system.model.HeadLabCoordinator((int) (byte) -1, "data/test-userrepo.csv", "alice@example.com", "student", true);
        java.lang.Class<?> wildcardClass6 = headLabCoordinator5.getClass();
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0343");
        com.reservation_system.model.Student student5 = new com.reservation_system.model.Student(1, "data/test-userrepo.csv", "alice@example.com", "guest", false);
        java.lang.String str6 = student5.getUserType();
        student5.setApproved(true);
        boolean boolean9 = student5.requiresDepartmentApproval();
        java.lang.String str10 = student5.getUserType();
        java.lang.String str11 = student5.getPassword();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Student" + "'", str6, "Student");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Student" + "'", str10, "Student");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "guest" + "'", str11, "guest");
    }

    @Test
    public void test0344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0344");
        com.reservation_system.model.Student student5 = new com.reservation_system.model.Student(1, "data/test-userrepo.csv", "alice@example.com", "guest", false);
        java.lang.String str6 = student5.getUserType();
        student5.setApproved(true);
        boolean boolean9 = student5.isApproved();
        boolean boolean10 = student5.isApproved();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Student" + "'", str6, "Student");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test0345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0345");
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
        boolean boolean49 = userRepository1.emailExists("alice@example.com");
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
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + true + "'", boolean49 == true);
    }

    @Test
    public void test0346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0346");
        com.reservation_system.model.LabManager labManager5 = new com.reservation_system.model.LabManager((int) '#', "guest", "Guest", "guest", true);
        java.lang.String str6 = labManager5.getUserType();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "labmanager" + "'", str6, "labmanager");
    }

    @Test
    public void test0347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0347");
        com.reservation_system.model.User user6 = com.reservation_system.patterns.factory.UserFactory.createUser("researcher", (int) (short) 100, "Password1!", "Researcher", "Researcher", false);
        org.junit.Assert.assertNotNull(user6);
    }

    @Test
    public void test0348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0348");
        com.reservation_system.model.Student student5 = new com.reservation_system.model.Student(1, "data/test-userrepo.csv", "alice@example.com", "guest", false);
        java.lang.String str6 = student5.getUserType();
        java.lang.String str7 = student5.getUserType();
        java.lang.String str8 = student5.getName();
        java.lang.String str9 = student5.getPassword();
        java.lang.String str10 = student5.getUserType();
        int int11 = student5.getID();
        boolean boolean12 = student5.isApproved();
        student5.setApproved(false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Student" + "'", str6, "Student");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Student" + "'", str7, "Student");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "data/test-userrepo.csv" + "'", str8, "data/test-userrepo.csv");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "guest" + "'", str9, "guest");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Student" + "'", str10, "Student");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test0349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0349");
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
        int int36 = userRepository1.getNextID();
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
        org.junit.Assert.assertNotNull(userOptional35);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 101 + "'", int36 == 101);
    }

    @Test
    public void test0350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0350");
        com.reservation_system.model.Researcher researcher5 = new com.reservation_system.model.Researcher((int) (short) 10, "Faculty", "headlabcoordinator", "", false);
        java.lang.String str6 = researcher5.getUserType();
        java.lang.String str7 = researcher5.getUserType();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Researcher" + "'", str6, "Researcher");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Researcher" + "'", str7, "Researcher");
    }

    @Test
    public void test0351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0351");
        com.reservation_system.model.Student student5 = new com.reservation_system.model.Student((int) 'a', "Alice", "Faculty", "headlabcoordinator", false);
    }

    @Test
    public void test0352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0352");
        com.reservation_system.model.LabManager labManager5 = new com.reservation_system.model.LabManager(10, "Password1!", "data/test-userrepo.csv", "Guest", true);
        java.lang.String str6 = labManager5.getUserType();
        java.lang.String str7 = labManager5.getPassword();
        java.lang.String str8 = labManager5.getEmail();
        java.lang.String str9 = labManager5.getName();
        java.lang.String str10 = labManager5.getUserType();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "labmanager" + "'", str6, "labmanager");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Guest" + "'", str7, "Guest");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "data/test-userrepo.csv" + "'", str8, "data/test-userrepo.csv");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Password1!" + "'", str9, "Password1!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "labmanager" + "'", str10, "labmanager");
    }

    @Test
    public void test0353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0353");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("data/test-userrepo.csv");
        java.util.List<com.reservation_system.model.User> userList2 = userRepository1.getAllUsers();
        int int3 = userRepository1.getNextID();
        boolean boolean5 = userRepository1.emailExists("headlabcoordinator");
        boolean boolean6 = userRepository1.headLabCoordinatorExists();
        java.util.Optional<com.reservation_system.model.User> userOptional8 = userRepository1.findByEmail("Alice");
        boolean boolean10 = userRepository1.emailExists("guest");
        java.util.List<com.reservation_system.model.User> userList11 = userRepository1.getAllUsers();
        boolean boolean12 = userRepository1.headLabCoordinatorExists();
        org.junit.Assert.assertNotNull(userList2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 101 + "'", int3 == 101);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(userOptional8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(userList11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test0354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0354");
        com.reservation_system.model.HeadLabCoordinator headLabCoordinator5 = new com.reservation_system.model.HeadLabCoordinator((int) (byte) 100, "data/test-userrepo.csv", "Guest", "Student", true);
    }

    @Test
    public void test0355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0355");
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
        java.util.List<com.reservation_system.model.User> userList43 = userRepository1.getAllUsers();
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
        org.junit.Assert.assertNotNull(userList43);
    }

    @Test
    public void test0356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0356");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("data/test-userrepo.csv");
        java.util.List<com.reservation_system.model.User> userList2 = userRepository1.getAllUsers();
        int int3 = userRepository1.getNextID();
        boolean boolean5 = userRepository1.emailExists("headlabcoordinator");
        boolean boolean6 = userRepository1.headLabCoordinatorExists();
        int int7 = userRepository1.getNextID();
        boolean boolean9 = userRepository1.emailExists("Researcher");
        boolean boolean11 = userRepository1.emailExists("guest");
        org.junit.Assert.assertNotNull(userList2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 101 + "'", int3 == 101);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 101 + "'", int7 == 101);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test0357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0357");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("data/test-userrepo.csv");
        boolean boolean3 = userRepository1.emailExists("Password1!");
        boolean boolean5 = userRepository1.emailExists("hi!");
        java.util.List<com.reservation_system.model.User> userList6 = userRepository1.getAllUsers();
        java.util.Optional<com.reservation_system.model.User> userOptional8 = userRepository1.findByEmail("headlabcoordinator");
        java.util.List<com.reservation_system.model.User> userList9 = userRepository1.getAllUsers();
        java.lang.Class<?> wildcardClass10 = userRepository1.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
// flaky "61) test0357(com.reservation_system.randoop.userrepository.RegressionTest0)":         org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(userList6);
        org.junit.Assert.assertNotNull(userOptional8);
        org.junit.Assert.assertNotNull(userList9);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0358");
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
        int int28 = userRepository1.getNextID();
        org.junit.Assert.assertNotNull(userList9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(userList19);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 101 + "'", int20 == 101);
        org.junit.Assert.assertNotNull(userList21);
        org.junit.Assert.assertNotNull(userList24);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 101 + "'", int28 == 101);
    }

    @Test
    public void test0359() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0359");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("data/test-userrepo.csv");
        com.reservation_system.model.Researcher researcher7 = new com.reservation_system.model.Researcher(5, "hi!", "labmanager", "Guest", false);
        userRepository1.addUser((com.reservation_system.model.User) researcher7);
        boolean boolean10 = userRepository1.emailExists("headlabcoordinator");
        java.lang.Class<?> wildcardClass11 = userRepository1.getClass();
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0360() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0360");
        com.reservation_system.model.Student student5 = new com.reservation_system.model.Student((int) (byte) 0, "guest", "Student", "headlabcoordinator", false);
        java.lang.String str6 = student5.getUserType();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Student" + "'", str6, "Student");
    }

    @Test
    public void test0361() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0361");
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
        int int24 = userRepository1.getNextID();
        com.reservation_system.model.Researcher researcher30 = new com.reservation_system.model.Researcher(98, "Alice", "Student", "guest", false);
        java.lang.String str31 = researcher30.getUserType();
        int int32 = researcher30.getID();
        userRepository1.addUser((com.reservation_system.model.User) researcher30);
        java.lang.Class<?> wildcardClass34 = researcher30.getClass();
        org.junit.Assert.assertNotNull(userList9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(userList19);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 101 + "'", int20 == 101);
        org.junit.Assert.assertNotNull(userList21);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 101 + "'", int24 == 101);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "Researcher" + "'", str31, "Researcher");
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 98 + "'", int32 == 98);
        org.junit.Assert.assertNotNull(wildcardClass34);
    }

    @Test
    public void test0362() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0362");
        com.reservation_system.model.Student student5 = new com.reservation_system.model.Student((int) (short) 0, "labmanager", "", "faculty", true);
    }

    @Test
    public void test0363() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0363");
        com.reservation_system.model.LabManager labManager5 = new com.reservation_system.model.LabManager(1, "student", "data/test-userrepo.csv", "hi!", false);
        java.lang.String str6 = labManager5.getUserType();
        java.lang.String str7 = labManager5.getName();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "labmanager" + "'", str6, "labmanager");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "student" + "'", str7, "student");
    }

    @Test
    public void test0364() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0364");
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
        user26.setApproved(true);
        java.lang.String str30 = user26.getName();
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 101 + "'", int9 == 101);
        org.junit.Assert.assertNotNull(userOptional11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 101 + "'", int12 == 101);
        org.junit.Assert.assertNotNull(userOptional14);
        org.junit.Assert.assertNotNull(userList17);
        org.junit.Assert.assertNotNull(userList19);
        org.junit.Assert.assertNotNull(user26);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "Faculty" + "'", str30, "Faculty");
    }

    @Test
    public void test0365() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0365");
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
        boolean boolean46 = userRepository1.headLabCoordinatorExists();
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
        org.junit.Assert.assertNotNull(userList45);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + true + "'", boolean46 == true);
    }

    @Test
    public void test0366() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0366");
        com.reservation_system.model.Student student5 = new com.reservation_system.model.Student(1, "data/test-userrepo.csv", "alice@example.com", "guest", false);
        java.lang.String str6 = student5.getUserType();
        java.lang.String str7 = student5.getUserType();
        java.lang.String str8 = student5.getName();
        java.lang.String str9 = student5.getPassword();
        boolean boolean10 = student5.requiresDepartmentApproval();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Student" + "'", str6, "Student");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Student" + "'", str7, "Student");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "data/test-userrepo.csv" + "'", str8, "data/test-userrepo.csv");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "guest" + "'", str9, "guest");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test0367() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0367");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("data/test-userrepo.csv");
        boolean boolean3 = userRepository1.emailExists("Password1!");
        boolean boolean5 = userRepository1.emailExists("hi!");
        java.util.List<com.reservation_system.model.User> userList6 = userRepository1.getAllUsers();
        com.reservation_system.model.LabManager labManager12 = new com.reservation_system.model.LabManager(1, "student", "data/test-userrepo.csv", "hi!", false);
        java.lang.String str13 = labManager12.getPassword();
        userRepository1.addUser((com.reservation_system.model.User) labManager12);
        com.reservation_system.repository.UserRepository userRepository16 = new com.reservation_system.repository.UserRepository("data/test-userrepo.csv");
        java.util.List<com.reservation_system.model.User> userList17 = userRepository16.getAllUsers();
        com.reservation_system.model.Guest guest23 = new com.reservation_system.model.Guest(0, "Password1!", "data/test-userrepo.csv", "researcher", false);
        boolean boolean24 = guest23.requiresDepartmentApproval();
        java.lang.String str25 = guest23.getUserType();
        java.lang.String str26 = guest23.getUserType();
        guest23.setApproved(true);
        java.lang.String str29 = guest23.getUserType();
        userRepository16.addUser((com.reservation_system.model.User) guest23);
        com.reservation_system.repository.UserRepository userRepository32 = new com.reservation_system.repository.UserRepository("data/test-userrepo.csv");
        java.util.List<com.reservation_system.model.User> userList33 = userRepository32.getAllUsers();
        int int34 = userRepository32.getNextID();
        boolean boolean36 = userRepository32.emailExists("headlabcoordinator");
        boolean boolean37 = userRepository32.headLabCoordinatorExists();
        java.util.Optional<com.reservation_system.model.User> userOptional39 = userRepository32.findByEmail("Alice");
        boolean boolean41 = userRepository32.emailExists("Alice");
        boolean boolean43 = userRepository32.emailExists("Guest");
        boolean boolean45 = userRepository32.emailExists("headlabcoordinator");
        com.reservation_system.repository.UserRepository userRepository47 = new com.reservation_system.repository.UserRepository("data/test-userrepo.csv");
        boolean boolean49 = userRepository47.emailExists("Alice");
        com.reservation_system.model.Researcher researcher55 = new com.reservation_system.model.Researcher((int) 'a', "labmanager", "faculty", "", false);
        boolean boolean56 = researcher55.isApproved();
        java.lang.String str57 = researcher55.getName();
        userRepository47.addUser((com.reservation_system.model.User) researcher55);
        boolean boolean59 = userRepository47.headLabCoordinatorExists();
        java.util.List<com.reservation_system.model.User> userList60 = userRepository47.getAllUsers();
        userRepository32.saveAllUsers(userList60);
        userRepository16.saveAllUsers(userList60);
        java.util.List<com.reservation_system.model.User> userList63 = userRepository16.getAllUsers();
        userRepository1.saveAllUsers(userList63);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(userList6);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertNotNull(userList17);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "Guest" + "'", str25, "Guest");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "Guest" + "'", str26, "Guest");
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "Guest" + "'", str29, "Guest");
        org.junit.Assert.assertNotNull(userList33);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 101 + "'", int34 == 101);
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
        org.junit.Assert.assertNotNull(userList63);
    }

    @Test
    public void test0368() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0368");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("data/test-userrepo.csv");
        int int2 = userRepository1.getNextID();
        int int3 = userRepository1.getNextID();
        com.reservation_system.model.HeadLabCoordinator headLabCoordinator9 = new com.reservation_system.model.HeadLabCoordinator((int) (byte) 1, "", "", "guest", false);
        userRepository1.addUser((com.reservation_system.model.User) headLabCoordinator9);
        java.util.List<com.reservation_system.model.User> userList11 = userRepository1.getAllUsers();
        boolean boolean13 = userRepository1.emailExists("Faculty");
        boolean boolean15 = userRepository1.emailExists("Alice");
        int int16 = userRepository1.getNextID();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 101 + "'", int2 == 101);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 101 + "'", int3 == 101);
        org.junit.Assert.assertNotNull(userList11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 101 + "'", int16 == 101);
    }

    @Test
    public void test0369() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0369");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("data/test-userrepo.csv");
        java.util.List<com.reservation_system.model.User> userList2 = userRepository1.getAllUsers();
        com.reservation_system.model.Guest guest8 = new com.reservation_system.model.Guest(0, "Password1!", "data/test-userrepo.csv", "researcher", false);
        boolean boolean9 = guest8.requiresDepartmentApproval();
        java.lang.String str10 = guest8.getUserType();
        java.lang.String str11 = guest8.getUserType();
        guest8.setApproved(true);
        java.lang.String str14 = guest8.getUserType();
        userRepository1.addUser((com.reservation_system.model.User) guest8);
        java.util.Optional<com.reservation_system.model.User> userOptional17 = userRepository1.findByEmail("Researcher");
        int int18 = userRepository1.getNextID();
        org.junit.Assert.assertNotNull(userList2);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Guest" + "'", str10, "Guest");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Guest" + "'", str11, "Guest");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Guest" + "'", str14, "Guest");
        org.junit.Assert.assertNotNull(userOptional17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 101 + "'", int18 == 101);
    }

    @Test
    public void test0370() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0370");
        com.reservation_system.model.HeadLabCoordinator headLabCoordinator5 = new com.reservation_system.model.HeadLabCoordinator((int) ' ', "faculty", "Researcher", "Password1!", true);
    }

    @Test
    public void test0371() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0371");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("data/test-userrepo.csv");
        int int2 = userRepository1.getNextID();
        int int3 = userRepository1.getNextID();
        com.reservation_system.model.Researcher researcher9 = new com.reservation_system.model.Researcher((int) (byte) 1, "Faculty", "", "Guest", false);
        userRepository1.addUser((com.reservation_system.model.User) researcher9);
        java.lang.String str11 = researcher9.getUserType();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 101 + "'", int2 == 101);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 101 + "'", int3 == 101);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Researcher" + "'", str11, "Researcher");
    }

    @Test
    public void test0372() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0372");
        com.reservation_system.model.HeadLabCoordinator headLabCoordinator5 = new com.reservation_system.model.HeadLabCoordinator(100, "Student", "", "Guest", false);
        boolean boolean6 = headLabCoordinator5.isApproved();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test0373() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0373");
        com.reservation_system.model.LabManager labManager5 = new com.reservation_system.model.LabManager((int) '#', "faculty", "data/test-userrepo.csv", "labmanager", true);
        java.lang.String str6 = labManager5.getUserType();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "labmanager" + "'", str6, "labmanager");
    }

    @Test
    public void test0374() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0374");
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
        com.reservation_system.repository.UserRepository userRepository20 = new com.reservation_system.repository.UserRepository("data/test-userrepo.csv");
        com.reservation_system.model.Researcher researcher26 = new com.reservation_system.model.Researcher(5, "hi!", "labmanager", "Guest", false);
        userRepository20.addUser((com.reservation_system.model.User) researcher26);
        int int28 = userRepository20.getNextID();
        java.util.Optional<com.reservation_system.model.User> userOptional30 = userRepository20.findByEmail("headlabcoordinator");
        int int31 = userRepository20.getNextID();
        java.util.Optional<com.reservation_system.model.User> userOptional33 = userRepository20.findByEmail("Faculty");
        java.util.List<com.reservation_system.model.User> userList34 = userRepository20.getAllUsers();
        userRepository1.saveAllUsers(userList34);
        org.junit.Assert.assertNotNull(userList9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(userOptional14);
        org.junit.Assert.assertNotNull(userOptional16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 101 + "'", int17 == 101);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 101 + "'", int28 == 101);
        org.junit.Assert.assertNotNull(userOptional30);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 101 + "'", int31 == 101);
        org.junit.Assert.assertNotNull(userOptional33);
        org.junit.Assert.assertNotNull(userList34);
    }

    @Test
    public void test0375() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0375");
        com.reservation_system.model.Faculty faculty5 = new com.reservation_system.model.Faculty(1, "Student", "labmanager", "Student", true);
        java.lang.String str6 = faculty5.getEmail();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "labmanager" + "'", str6, "labmanager");
    }

    @Test
    public void test0376() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0376");
        com.reservation_system.model.Student student5 = new com.reservation_system.model.Student((int) (short) -1, "alice@example.com", "student", "student", true);
        boolean boolean6 = student5.requiresDepartmentApproval();
        java.lang.Class<?> wildcardClass7 = student5.getClass();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0377() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0377");
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
        java.util.Optional<com.reservation_system.model.User> userOptional32 = userRepository1.findByEmail("labmanager");
        org.junit.Assert.assertNotNull(userList9);
        org.junit.Assert.assertNotNull(userOptional20);
        org.junit.Assert.assertNotNull(userList21);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertNotNull(userOptional32);
    }

    @Test
    public void test0378() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0378");
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
        java.lang.Class<?> wildcardClass24 = headLabCoordinator21.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 101 + "'", int2 == 101);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 101 + "'", int11 == 101);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(wildcardClass24);
    }

    @Test
    public void test0379() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0379");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("data/test-userrepo.csv");
        com.reservation_system.model.Researcher researcher7 = new com.reservation_system.model.Researcher(5, "hi!", "labmanager", "Guest", false);
        userRepository1.addUser((com.reservation_system.model.User) researcher7);
        java.util.List<com.reservation_system.model.User> userList9 = userRepository1.getAllUsers();
        com.reservation_system.model.Guest guest15 = new com.reservation_system.model.Guest(0, "Password1!", "data/test-userrepo.csv", "researcher", false);
        boolean boolean16 = guest15.requiresDepartmentApproval();
        userRepository1.addUser((com.reservation_system.model.User) guest15);
        boolean boolean19 = userRepository1.emailExists("Alice");
        java.util.Optional<com.reservation_system.model.User> userOptional21 = userRepository1.findByEmail("hi!");
        boolean boolean23 = userRepository1.emailExists("Password1!");
        org.junit.Assert.assertNotNull(userList9);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(userOptional21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
    }

    @Test
    public void test0380() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0380");
        com.reservation_system.model.HeadLabCoordinator headLabCoordinator5 = new com.reservation_system.model.HeadLabCoordinator(101, "", "Faculty", "researcher", true);
    }

    @Test
    public void test0381() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0381");
        com.reservation_system.model.LabManager labManager5 = new com.reservation_system.model.LabManager(0, "labmanager", "guest", "", false);
    }

    @Test
    public void test0382() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0382");
        com.reservation_system.model.Researcher researcher5 = new com.reservation_system.model.Researcher((int) '4', "guest", "Alice", "faculty", false);
        java.lang.String str6 = researcher5.getName();
        java.lang.String str7 = researcher5.getName();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "guest" + "'", str6, "guest");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "guest" + "'", str7, "guest");
    }

    @Test
    public void test0383() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0383");
        com.reservation_system.model.Guest guest5 = new com.reservation_system.model.Guest(100, "labmanager", "labmanager", "faculty", true);
    }

    @Test
    public void test0384() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0384");
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
        boolean boolean26 = headLabCoordinator21.isApproved();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 101 + "'", int2 == 101);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 101 + "'", int11 == 101);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
    }

    @Test
    public void test0385() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0385");
        com.reservation_system.model.HeadLabCoordinator headLabCoordinator5 = new com.reservation_system.model.HeadLabCoordinator((int) (short) -1, "data/test-userrepo.csv", "guest", "labmanager", true);
        java.lang.String str6 = headLabCoordinator5.getUserType();
        java.lang.String str7 = headLabCoordinator5.getName();
        boolean boolean8 = headLabCoordinator5.isApproved();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "headlabcoordinator" + "'", str6, "headlabcoordinator");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "data/test-userrepo.csv" + "'", str7, "data/test-userrepo.csv");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test0386() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0386");
        com.reservation_system.model.HeadLabCoordinator headLabCoordinator5 = new com.reservation_system.model.HeadLabCoordinator((int) ' ', "Student", "Researcher", "hi!", false);
    }

    @Test
    public void test0387() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0387");
        com.reservation_system.model.LabManager labManager5 = new com.reservation_system.model.LabManager(10, "Password1!", "data/test-userrepo.csv", "Guest", true);
        java.lang.String str6 = labManager5.getUserType();
        java.lang.String str7 = labManager5.getPassword();
        java.lang.String str8 = labManager5.getPassword();
        int int9 = labManager5.getID();
        int int10 = labManager5.getID();
        java.lang.String str11 = labManager5.getUserType();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "labmanager" + "'", str6, "labmanager");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Guest" + "'", str7, "Guest");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Guest" + "'", str8, "Guest");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10 + "'", int9 == 10);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 10 + "'", int10 == 10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "labmanager" + "'", str11, "labmanager");
    }

    @Test
    public void test0388() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0388");
        // The following exception was thrown during execution in test generation
        try {
            com.reservation_system.model.User user6 = com.reservation_system.patterns.factory.UserFactory.createUser("", (int) ' ', "faculty", "Researcher", "student", true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid user type: ");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0389() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0389");
        com.reservation_system.model.Student student5 = new com.reservation_system.model.Student(0, "Guest", "Password1!", "data/test-userrepo.csv", true);
        java.lang.String str6 = student5.getPassword();
        int int7 = student5.getID();
        java.lang.String str8 = student5.getUserType();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "data/test-userrepo.csv" + "'", str6, "data/test-userrepo.csv");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Student" + "'", str8, "Student");
    }

    @Test
    public void test0390() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0390");
        com.reservation_system.model.Student student5 = new com.reservation_system.model.Student((int) (byte) 100, "", "data/test-userrepo.csv", "researcher", false);
        java.lang.String str6 = student5.getUserType();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Student" + "'", str6, "Student");
    }

    @Test
    public void test0391() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0391");
        com.reservation_system.model.Guest guest5 = new com.reservation_system.model.Guest((int) (short) -1, "data/test-userrepo.csv", "Guest", "faculty", false);
        java.lang.String str6 = guest5.getUserType();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Guest" + "'", str6, "Guest");
    }

    @Test
    public void test0392() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0392");
        com.reservation_system.model.HeadLabCoordinator headLabCoordinator5 = new com.reservation_system.model.HeadLabCoordinator((int) (byte) 1, "student", "Password1!", "alice@example.com", true);
        java.lang.String str6 = headLabCoordinator5.getEmail();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Password1!" + "'", str6, "Password1!");
    }

    @Test
    public void test0393() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0393");
        com.reservation_system.model.Faculty faculty5 = new com.reservation_system.model.Faculty(5, "researcher", "guest", "faculty", true);
        java.lang.String str6 = faculty5.getUserType();
        java.lang.String str7 = faculty5.getEmail();
        java.lang.String str8 = faculty5.getUserType();
        java.lang.String str9 = faculty5.getUserType();
        boolean boolean10 = faculty5.isApproved();
        int int11 = faculty5.getID();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Faculty" + "'", str6, "Faculty");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "guest" + "'", str7, "guest");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Faculty" + "'", str8, "Faculty");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Faculty" + "'", str9, "Faculty");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 5 + "'", int11 == 5);
    }

    @Test
    public void test0394() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0394");
        com.reservation_system.model.Guest guest5 = new com.reservation_system.model.Guest((int) (byte) -1, "guest", "data/test-userrepo.csv", "headlabcoordinator", false);
        java.lang.String str6 = guest5.getUserType();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Guest" + "'", str6, "Guest");
    }

    @Test
    public void test0395() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0395");
        com.reservation_system.model.Student student5 = new com.reservation_system.model.Student((-1), "hi!", "Researcher", "Password1!", true);
    }

    @Test
    public void test0396() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0396");
        com.reservation_system.model.Faculty faculty5 = new com.reservation_system.model.Faculty(98, "hi!", "headlabcoordinator", "data/test-userrepo.csv", false);
        java.lang.String str6 = faculty5.getUserType();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Faculty" + "'", str6, "Faculty");
    }

    @Test
    public void test0397() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0397");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("data/test-userrepo.csv");
        java.util.List<com.reservation_system.model.User> userList2 = userRepository1.getAllUsers();
        int int3 = userRepository1.getNextID();
        boolean boolean5 = userRepository1.emailExists("headlabcoordinator");
        boolean boolean6 = userRepository1.headLabCoordinatorExists();
        java.util.Optional<com.reservation_system.model.User> userOptional8 = userRepository1.findByEmail("Alice");
        java.util.List<com.reservation_system.model.User> userList9 = userRepository1.getAllUsers();
        boolean boolean11 = userRepository1.emailExists("student");
        org.junit.Assert.assertNotNull(userList2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 101 + "'", int3 == 101);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(userOptional8);
        org.junit.Assert.assertNotNull(userList9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test0398() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0398");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("data/test-userrepo.csv");
        com.reservation_system.model.Researcher researcher7 = new com.reservation_system.model.Researcher(5, "hi!", "labmanager", "Guest", false);
        userRepository1.addUser((com.reservation_system.model.User) researcher7);
        java.util.List<com.reservation_system.model.User> userList9 = userRepository1.getAllUsers();
        java.util.Optional<com.reservation_system.model.User> userOptional11 = userRepository1.findByEmail("");
        boolean boolean12 = userRepository1.headLabCoordinatorExists();
        java.util.Optional<com.reservation_system.model.User> userOptional14 = userRepository1.findByEmail("Password1!");
        org.junit.Assert.assertNotNull(userList9);
        org.junit.Assert.assertNotNull(userOptional11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(userOptional14);
    }

    @Test
    public void test0399() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0399");
        com.reservation_system.model.Student student5 = new com.reservation_system.model.Student(1, "data/test-userrepo.csv", "alice@example.com", "guest", false);
        java.lang.String str6 = student5.getUserType();
        java.lang.String str7 = student5.getUserType();
        java.lang.String str8 = student5.getName();
        boolean boolean9 = student5.isApproved();
        java.lang.String str10 = student5.getName();
        java.lang.String str11 = student5.getUserType();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Student" + "'", str6, "Student");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Student" + "'", str7, "Student");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "data/test-userrepo.csv" + "'", str8, "data/test-userrepo.csv");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "data/test-userrepo.csv" + "'", str10, "data/test-userrepo.csv");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Student" + "'", str11, "Student");
    }

    @Test
    public void test0400() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0400");
        com.reservation_system.model.Guest guest5 = new com.reservation_system.model.Guest((int) (byte) -1, "Researcher", "Researcher", "", true);
        java.lang.String str6 = guest5.getName();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Researcher" + "'", str6, "Researcher");
    }

    @Test
    public void test0401() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0401");
        com.reservation_system.model.HeadLabCoordinator headLabCoordinator5 = new com.reservation_system.model.HeadLabCoordinator(6, "researcher", "Alice", "researcher", true);
        int int6 = headLabCoordinator5.getID();
        int int7 = headLabCoordinator5.getID();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 6 + "'", int6 == 6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 6 + "'", int7 == 6);
    }

    @Test
    public void test0402() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0402");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("data/test-userrepo.csv");
        java.util.List<com.reservation_system.model.User> userList2 = userRepository1.getAllUsers();
        int int3 = userRepository1.getNextID();
        boolean boolean5 = userRepository1.emailExists("headlabcoordinator");
        boolean boolean6 = userRepository1.headLabCoordinatorExists();
        java.util.Optional<com.reservation_system.model.User> userOptional8 = userRepository1.findByEmail("Alice");
        boolean boolean10 = userRepository1.emailExists("Alice");
        boolean boolean12 = userRepository1.emailExists("Guest");
        boolean boolean13 = userRepository1.headLabCoordinatorExists();
        boolean boolean14 = userRepository1.headLabCoordinatorExists();
        org.junit.Assert.assertNotNull(userList2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 101 + "'", int3 == 101);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(userOptional8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test0403() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0403");
        // The following exception was thrown during execution in test generation
        try {
            com.reservation_system.model.User user6 = com.reservation_system.patterns.factory.UserFactory.createUser("Alice", 101, "labmanager", "data/test-userrepo.csv", "Researcher", true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid user type: Alice");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0404() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0404");
        com.reservation_system.model.Researcher researcher5 = new com.reservation_system.model.Researcher(1, "Student", "guest", "researcher", true);
        java.lang.String str6 = researcher5.getUserType();
        researcher5.setApproved(false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Researcher" + "'", str6, "Researcher");
    }

    @Test
    public void test0405() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0405");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("data/test-userrepo.csv");
        com.reservation_system.model.Researcher researcher7 = new com.reservation_system.model.Researcher(5, "hi!", "labmanager", "Guest", false);
        userRepository1.addUser((com.reservation_system.model.User) researcher7);
        java.util.List<com.reservation_system.model.User> userList9 = userRepository1.getAllUsers();
        com.reservation_system.model.Guest guest15 = new com.reservation_system.model.Guest(0, "Password1!", "data/test-userrepo.csv", "researcher", false);
        boolean boolean16 = guest15.requiresDepartmentApproval();
        userRepository1.addUser((com.reservation_system.model.User) guest15);
        java.util.Optional<com.reservation_system.model.User> userOptional19 = userRepository1.findByEmail("Student");
        com.reservation_system.repository.UserRepository userRepository21 = new com.reservation_system.repository.UserRepository("data/test-userrepo.csv");
        java.util.List<com.reservation_system.model.User> userList22 = userRepository21.getAllUsers();
        int int23 = userRepository21.getNextID();
        boolean boolean25 = userRepository21.emailExists("headlabcoordinator");
        boolean boolean26 = userRepository21.headLabCoordinatorExists();
        java.util.Optional<com.reservation_system.model.User> userOptional28 = userRepository21.findByEmail("Alice");
        java.util.List<com.reservation_system.model.User> userList29 = userRepository21.getAllUsers();
        userRepository1.saveAllUsers(userList29);
        org.junit.Assert.assertNotNull(userList9);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(userOptional19);
        org.junit.Assert.assertNotNull(userList22);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 101 + "'", int23 == 101);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertNotNull(userOptional28);
        org.junit.Assert.assertNotNull(userList29);
    }

    @Test
    public void test0406() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0406");
        com.reservation_system.model.Student student5 = new com.reservation_system.model.Student(101, "headlabcoordinator", "Guest", "data/test-userrepo.csv", false);
        java.lang.String str6 = student5.getPassword();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "data/test-userrepo.csv" + "'", str6, "data/test-userrepo.csv");
    }

    @Test
    public void test0407() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0407");
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
        java.util.Optional<com.reservation_system.model.User> userOptional19 = userRepository1.findByEmail("headlabcoordinator");
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
        org.junit.Assert.assertNotNull(userOptional19);
    }

    @Test
    public void test0408() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0408");
        com.reservation_system.model.HeadLabCoordinator headLabCoordinator5 = new com.reservation_system.model.HeadLabCoordinator((int) (byte) 1, "labmanager", "Student", "Guest", false);
        java.lang.String str6 = headLabCoordinator5.getUserType();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "headlabcoordinator" + "'", str6, "headlabcoordinator");
    }

    @Test
    public void test0409() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0409");
        com.reservation_system.model.User user6 = com.reservation_system.patterns.factory.UserFactory.createUser("Student", (int) (short) 1, "", "researcher", "Researcher", false);
        org.junit.Assert.assertNotNull(user6);
    }

    @Test
    public void test0410() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0410");
        com.reservation_system.model.LabManager labManager5 = new com.reservation_system.model.LabManager(1, "headlabcoordinator", "Alice", "faculty", false);
        java.lang.String str6 = labManager5.getName();
        int int7 = labManager5.getID();
        java.lang.String str8 = labManager5.getUserType();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "headlabcoordinator" + "'", str6, "headlabcoordinator");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "labmanager" + "'", str8, "labmanager");
    }

    @Test
    public void test0411() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0411");
        com.reservation_system.model.Faculty faculty5 = new com.reservation_system.model.Faculty(98, "Faculty", "headlabcoordinator", "Guest", true);
    }

    @Test
    public void test0412() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0412");
        com.reservation_system.model.HeadLabCoordinator headLabCoordinator5 = new com.reservation_system.model.HeadLabCoordinator(5, "faculty", "faculty", "hi!", true);
        int int6 = headLabCoordinator5.getID();
        headLabCoordinator5.setApproved(true);
        java.lang.Class<?> wildcardClass9 = headLabCoordinator5.getClass();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 5 + "'", int6 == 5);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0413() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0413");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("data/test-userrepo.csv");
        com.reservation_system.model.Researcher researcher7 = new com.reservation_system.model.Researcher(5, "hi!", "labmanager", "Guest", false);
        userRepository1.addUser((com.reservation_system.model.User) researcher7);
        int int9 = userRepository1.getNextID();
        boolean boolean11 = userRepository1.emailExists("Researcher");
        java.lang.Class<?> wildcardClass12 = userRepository1.getClass();
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 101 + "'", int9 == 101);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0414() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0414");
        com.reservation_system.model.LabManager labManager5 = new com.reservation_system.model.LabManager((int) '4', "labmanager", "Alice", "headlabcoordinator", false);
        java.lang.String str6 = labManager5.getUserType();
        java.lang.String str7 = labManager5.getUserType();
        java.lang.Class<?> wildcardClass8 = labManager5.getClass();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "labmanager" + "'", str6, "labmanager");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "labmanager" + "'", str7, "labmanager");
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0415() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0415");
        com.reservation_system.model.HeadLabCoordinator headLabCoordinator5 = new com.reservation_system.model.HeadLabCoordinator((-1), "hi!", "Student", "labmanager", true);
        java.lang.String str6 = headLabCoordinator5.getUserType();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "headlabcoordinator" + "'", str6, "headlabcoordinator");
    }

    @Test
    public void test0416() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0416");
        com.reservation_system.model.LabManager labManager5 = new com.reservation_system.model.LabManager((int) (short) -1, "faculty", "Guest", "Guest", true);
        boolean boolean6 = labManager5.requiresDepartmentApproval();
        boolean boolean7 = labManager5.requiresDepartmentApproval();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test0417() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0417");
        com.reservation_system.model.Faculty faculty5 = new com.reservation_system.model.Faculty((int) 'a', "Password1!", "Student", "Password1!", true);
    }

    @Test
    public void test0418() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0418");
        // The following exception was thrown during execution in test generation
        try {
            com.reservation_system.model.User user6 = com.reservation_system.patterns.factory.UserFactory.createUser("Password1!", 98, "Student", "faculty", "Faculty", true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid user type: Password1!");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0419() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0419");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("data/test-userrepo.csv");
        boolean boolean3 = userRepository1.emailExists("Password1!");
        com.reservation_system.model.Faculty faculty9 = new com.reservation_system.model.Faculty((-1), "headlabcoordinator", "Student", "", false);
        userRepository1.addUser((com.reservation_system.model.User) faculty9);
        faculty9.setApproved(false);
        java.lang.String str13 = faculty9.getName();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "headlabcoordinator" + "'", str13, "headlabcoordinator");
    }

    @Test
    public void test0420() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0420");
        com.reservation_system.model.Guest guest5 = new com.reservation_system.model.Guest(0, "Password1!", "data/test-userrepo.csv", "researcher", false);
        boolean boolean6 = guest5.requiresDepartmentApproval();
        java.lang.String str7 = guest5.getUserType();
        java.lang.String str8 = guest5.getUserType();
        java.lang.String str9 = guest5.getUserType();
        guest5.setApproved(false);
        java.lang.String str12 = guest5.getUserType();
        java.lang.Class<?> wildcardClass13 = guest5.getClass();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Guest" + "'", str7, "Guest");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Guest" + "'", str8, "Guest");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Guest" + "'", str9, "Guest");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Guest" + "'", str12, "Guest");
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0421() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0421");
        com.reservation_system.model.Student student5 = new com.reservation_system.model.Student((int) (byte) 1, "Faculty", "guest", "alice@example.com", true);
    }

    @Test
    public void test0422() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0422");
        com.reservation_system.model.Researcher researcher5 = new com.reservation_system.model.Researcher((int) (byte) 0, "headlabcoordinator", "labmanager", "researcher", false);
    }

    @Test
    public void test0423() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0423");
        com.reservation_system.model.LabManager labManager5 = new com.reservation_system.model.LabManager((int) (byte) 10, "", "", "data/test-userrepo.csv", true);
        java.lang.String str6 = labManager5.getUserType();
        java.lang.String str7 = labManager5.getUserType();
        java.lang.String str8 = labManager5.getPassword();
        java.lang.String str9 = labManager5.getUserType();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "labmanager" + "'", str6, "labmanager");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "labmanager" + "'", str7, "labmanager");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "data/test-userrepo.csv" + "'", str8, "data/test-userrepo.csv");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "labmanager" + "'", str9, "labmanager");
    }

    @Test
    public void test0424() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0424");
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
        java.lang.String str22 = faculty18.getUserType();
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 101 + "'", int9 == 101);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "Faculty" + "'", str19, "Faculty");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "Faculty" + "'", str20, "Faculty");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "Faculty" + "'", str22, "Faculty");
    }

    @Test
    public void test0425() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0425");
        com.reservation_system.model.User user6 = com.reservation_system.patterns.factory.UserFactory.createUser("Guest", (int) (short) 1, "", "alice@example.com", "labmanager", true);
        int int7 = user6.getID();
        int int8 = user6.getID();
        boolean boolean9 = user6.isApproved();
        org.junit.Assert.assertNotNull(user6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test0426() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0426");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("data/test-userrepo.csv");
        boolean boolean3 = userRepository1.emailExists("Alice");
        java.util.List<com.reservation_system.model.User> userList4 = userRepository1.getAllUsers();
        java.util.Optional<com.reservation_system.model.User> userOptional6 = userRepository1.findByEmail("faculty");
        java.lang.Class<?> wildcardClass7 = userOptional6.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(userList4);
        org.junit.Assert.assertNotNull(userOptional6);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0427() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0427");
        com.reservation_system.model.LabManager labManager5 = new com.reservation_system.model.LabManager((int) (short) 0, "Researcher", "labmanager", "data/test-userrepo.csv", true);
    }

    @Test
    public void test0428() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0428");
        com.reservation_system.model.Researcher researcher5 = new com.reservation_system.model.Researcher(5, "hi!", "labmanager", "Guest", false);
        java.lang.String str6 = researcher5.getUserType();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Researcher" + "'", str6, "Researcher");
    }

    @Test
    public void test0429() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0429");
        com.reservation_system.model.User user6 = com.reservation_system.patterns.factory.UserFactory.createUser("guest", 35, "Student", "faculty", "Faculty", false);
        org.junit.Assert.assertNotNull(user6);
    }

    @Test
    public void test0430() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0430");
        // The following exception was thrown during execution in test generation
        try {
            com.reservation_system.model.User user6 = com.reservation_system.patterns.factory.UserFactory.createUser("data/test-userrepo.csv", (int) (byte) 100, "alice@example.com", "guest", "hi!", false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid user type: data/test-userrepo.csv");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0431() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0431");
        com.reservation_system.model.Student student5 = new com.reservation_system.model.Student(0, "Guest", "Password1!", "data/test-userrepo.csv", true);
        java.lang.String str6 = student5.getEmail();
        java.lang.String str7 = student5.getUserType();
        java.lang.String str8 = student5.getName();
        java.lang.String str9 = student5.getPassword();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Password1!" + "'", str6, "Password1!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Student" + "'", str7, "Student");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Guest" + "'", str8, "Guest");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "data/test-userrepo.csv" + "'", str9, "data/test-userrepo.csv");
    }

    @Test
    public void test0432() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0432");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("data/test-userrepo.csv");
        com.reservation_system.model.Researcher researcher7 = new com.reservation_system.model.Researcher(5, "hi!", "labmanager", "Guest", false);
        userRepository1.addUser((com.reservation_system.model.User) researcher7);
        boolean boolean10 = userRepository1.emailExists("headlabcoordinator");
        java.util.Optional<com.reservation_system.model.User> userOptional12 = userRepository1.findByEmail("student");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(userOptional12);
    }

    @Test
    public void test0433() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0433");
        com.reservation_system.model.HeadLabCoordinator headLabCoordinator5 = new com.reservation_system.model.HeadLabCoordinator((int) (short) 1, "Researcher", "headlabcoordinator", "alice@example.com", false);
    }

    @Test
    public void test0434() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0434");
        com.reservation_system.model.User user6 = com.reservation_system.patterns.factory.UserFactory.createUser("headlabcoordinator", (int) (short) -1, "faculty", "Alice", "", true);
        boolean boolean7 = user6.requiresDepartmentApproval();
        org.junit.Assert.assertNotNull(user6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test0435() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0435");
        com.reservation_system.model.Guest guest5 = new com.reservation_system.model.Guest(35, "", "data/test-userrepo.csv", "Password1!", false);
    }

    @Test
    public void test0436() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0436");
        com.reservation_system.model.LabManager labManager5 = new com.reservation_system.model.LabManager(10, "Password1!", "data/test-userrepo.csv", "Guest", true);
        java.lang.String str6 = labManager5.getUserType();
        java.lang.String str7 = labManager5.getPassword();
        java.lang.String str8 = labManager5.getEmail();
        boolean boolean9 = labManager5.isApproved();
        java.lang.String str10 = labManager5.getPassword();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "labmanager" + "'", str6, "labmanager");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Guest" + "'", str7, "Guest");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "data/test-userrepo.csv" + "'", str8, "data/test-userrepo.csv");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Guest" + "'", str10, "Guest");
    }

    @Test
    public void test0437() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0437");
        com.reservation_system.model.HeadLabCoordinator headLabCoordinator5 = new com.reservation_system.model.HeadLabCoordinator((int) (byte) 0, "Faculty", "headlabcoordinator", "guest", true);
        int int6 = headLabCoordinator5.getID();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test0438() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0438");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("data/test-userrepo.csv");
        java.util.List<com.reservation_system.model.User> userList2 = userRepository1.getAllUsers();
        int int3 = userRepository1.getNextID();
        boolean boolean5 = userRepository1.emailExists("headlabcoordinator");
        boolean boolean6 = userRepository1.headLabCoordinatorExists();
        java.util.Optional<com.reservation_system.model.User> userOptional8 = userRepository1.findByEmail("Alice");
        boolean boolean10 = userRepository1.emailExists("Alice");
        java.util.Optional<com.reservation_system.model.User> userOptional12 = userRepository1.findByEmail("Alice");
        com.reservation_system.model.Faculty faculty18 = new com.reservation_system.model.Faculty(5, "researcher", "guest", "faculty", true);
        java.lang.String str19 = faculty18.getUserType();
        java.lang.String str20 = faculty18.getPassword();
        java.lang.String str21 = faculty18.getName();
        userRepository1.addUser((com.reservation_system.model.User) faculty18);
        org.junit.Assert.assertNotNull(userList2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 101 + "'", int3 == 101);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(userOptional8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(userOptional12);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "Faculty" + "'", str19, "Faculty");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "faculty" + "'", str20, "faculty");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "researcher" + "'", str21, "researcher");
    }

    @Test
    public void test0439() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0439");
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
        boolean boolean20 = userRepository1.headLabCoordinatorExists();
        com.reservation_system.model.User user27 = com.reservation_system.patterns.factory.UserFactory.createUser("Researcher", 5, "alice@example.com", "Student", "researcher", false);
        java.lang.String str28 = user27.getEmail();
        java.lang.String str29 = user27.getName();
        boolean boolean30 = user27.requiresDepartmentApproval();
        userRepository1.addUser(user27);
        java.lang.String str32 = user27.getEmail();
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 101 + "'", int9 == 101);
        org.junit.Assert.assertNotNull(userOptional11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 101 + "'", int12 == 101);
        org.junit.Assert.assertNotNull(userOptional14);
        org.junit.Assert.assertNotNull(userList17);
        org.junit.Assert.assertNotNull(userList19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertNotNull(user27);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "Student" + "'", str28, "Student");
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "Student" + "'", str32, "Student");
    }

    @Test
    public void test0440() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0440");
        com.reservation_system.model.Researcher researcher5 = new com.reservation_system.model.Researcher((int) 'a', "", "labmanager", "data/test-userrepo.csv", true);
        java.lang.String str6 = researcher5.getEmail();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "labmanager" + "'", str6, "labmanager");
    }

    @Test
    public void test0441() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0441");
        com.reservation_system.model.Guest guest5 = new com.reservation_system.model.Guest(0, "Student", "Alice", "headlabcoordinator", false);
    }

    @Test
    public void test0442() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0442");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("data/test-userrepo.csv");
        boolean boolean3 = userRepository1.emailExists("Alice");
        int int4 = userRepository1.getNextID();
        boolean boolean5 = userRepository1.headLabCoordinatorExists();
        boolean boolean6 = userRepository1.headLabCoordinatorExists();
        com.reservation_system.model.User user7 = null;
        // The following exception was thrown during execution in test generation
        try {
            userRepository1.addUser(user7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 101 + "'", int4 == 101);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test0443() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0443");
        com.reservation_system.model.LabManager labManager5 = new com.reservation_system.model.LabManager((int) '4', "researcher", "", "alice@example.com", true);
        java.lang.String str6 = labManager5.getUserType();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "labmanager" + "'", str6, "labmanager");
    }

    @Test
    public void test0444() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0444");
        com.reservation_system.model.Researcher researcher5 = new com.reservation_system.model.Researcher((-1), "student", "Guest", "researcher", false);
        int int6 = researcher5.getID();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
    }

    @Test
    public void test0445() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0445");
        com.reservation_system.model.HeadLabCoordinator headLabCoordinator5 = new com.reservation_system.model.HeadLabCoordinator(0, "Guest", "Faculty", "guest", false);
        java.lang.String str6 = headLabCoordinator5.getPassword();
        java.lang.String str7 = headLabCoordinator5.getUserType();
        java.lang.String str8 = headLabCoordinator5.getUserType();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "guest" + "'", str6, "guest");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "headlabcoordinator" + "'", str7, "headlabcoordinator");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "headlabcoordinator" + "'", str8, "headlabcoordinator");
    }

    @Test
    public void test0446() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0446");
        com.reservation_system.model.HeadLabCoordinator headLabCoordinator5 = new com.reservation_system.model.HeadLabCoordinator((int) (short) -1, "data/test-userrepo.csv", "guest", "labmanager", true);
        java.lang.String str6 = headLabCoordinator5.getUserType();
        java.lang.String str7 = headLabCoordinator5.getUserType();
        java.lang.String str8 = headLabCoordinator5.getUserType();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "headlabcoordinator" + "'", str6, "headlabcoordinator");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "headlabcoordinator" + "'", str7, "headlabcoordinator");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "headlabcoordinator" + "'", str8, "headlabcoordinator");
    }

    @Test
    public void test0447() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0447");
        com.reservation_system.model.LabManager labManager5 = new com.reservation_system.model.LabManager((int) (byte) 1, "Guest", "Password1!", "guest", true);
    }

    @Test
    public void test0448() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0448");
        com.reservation_system.model.Student student5 = new com.reservation_system.model.Student(5, "Guest", "Student", "faculty", true);
        java.lang.String str6 = student5.getUserType();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Student" + "'", str6, "Student");
    }

    @Test
    public void test0449() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0449");
        com.reservation_system.model.LabManager labManager5 = new com.reservation_system.model.LabManager((int) (byte) 10, "student", "Alice", "student", false);
    }

    @Test
    public void test0450() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0450");
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
        boolean boolean26 = userRepository1.emailExists("");
        org.junit.Assert.assertNotNull(userList9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(userOptional14);
        org.junit.Assert.assertNotNull(userOptional16);
        org.junit.Assert.assertNotNull(user23);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
    }

    @Test
    public void test0451() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0451");
        com.reservation_system.model.Guest guest5 = new com.reservation_system.model.Guest(0, "Password1!", "data/test-userrepo.csv", "researcher", false);
        boolean boolean6 = guest5.requiresDepartmentApproval();
        java.lang.String str7 = guest5.getUserType();
        java.lang.String str8 = guest5.getUserType();
        java.lang.String str9 = guest5.getName();
        guest5.setApproved(false);
        java.lang.String str12 = guest5.getUserType();
        java.lang.String str13 = guest5.getEmail();
        java.lang.String str14 = guest5.getUserType();
        java.lang.String str15 = guest5.getUserType();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Guest" + "'", str7, "Guest");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Guest" + "'", str8, "Guest");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Password1!" + "'", str9, "Password1!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Guest" + "'", str12, "Guest");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "data/test-userrepo.csv" + "'", str13, "data/test-userrepo.csv");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Guest" + "'", str14, "Guest");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Guest" + "'", str15, "Guest");
    }

    @Test
    public void test0452() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0452");
        com.reservation_system.model.Researcher researcher5 = new com.reservation_system.model.Researcher((int) (short) -1, "labmanager", "faculty", "headlabcoordinator", true);
        java.lang.String str6 = researcher5.getUserType();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Researcher" + "'", str6, "Researcher");
    }

    @Test
    public void test0453() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0453");
        com.reservation_system.model.HeadLabCoordinator headLabCoordinator5 = new com.reservation_system.model.HeadLabCoordinator((int) (byte) 100, "Password1!", "guest", "Faculty", true);
        int int6 = headLabCoordinator5.getID();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
    }

    @Test
    public void test0454() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0454");
        com.reservation_system.model.Researcher researcher5 = new com.reservation_system.model.Researcher((-1), "alice@example.com", "Researcher", "student", true);
        boolean boolean6 = researcher5.isApproved();
        researcher5.setApproved(false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test0455() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0455");
        com.reservation_system.model.HeadLabCoordinator headLabCoordinator5 = new com.reservation_system.model.HeadLabCoordinator((int) (short) 100, "Alice", "student", "data/test-userrepo.csv", false);
    }

    @Test
    public void test0456() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0456");
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
        com.reservation_system.model.Faculty faculty25 = new com.reservation_system.model.Faculty((int) (short) 10, "labmanager", "faculty", "alice@example.com", false);
        java.lang.String str26 = faculty25.getUserType();
        boolean boolean27 = faculty25.requiresDepartmentApproval();
        userRepository1.addUser((com.reservation_system.model.User) faculty25);
        java.lang.String str29 = faculty25.getUserType();
// flaky "62) test0456(com.reservation_system.randoop.userrepository.RegressionTest0)":         org.junit.Assert.assertTrue("'" + int2 + "' != '" + 102 + "'", int2 == 102);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "labmanager" + "'", str15, "labmanager");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNotNull(userList18);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "Faculty" + "'", str26, "Faculty");
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "Faculty" + "'", str29, "Faculty");
    }

    @Test
    public void test0457() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0457");
        com.reservation_system.model.Researcher researcher5 = new com.reservation_system.model.Researcher((-1), "student", "Guest", "researcher", false);
        java.lang.String str6 = researcher5.getName();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "student" + "'", str6, "student");
    }

    @Test
    public void test0458() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0458");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("data/test-userrepo.csv");
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
        int int19 = userRepository1.getNextID();
        java.util.List<com.reservation_system.model.User> userList20 = userRepository1.getAllUsers();
        org.junit.Assert.assertNotNull(userList2);
// flaky "63) test0458(com.reservation_system.randoop.userrepository.RegressionTest0)":         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 102 + "'", int3 == 102);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
// flaky "35) test0458(com.reservation_system.randoop.userrepository.RegressionTest0)":         org.junit.Assert.assertTrue("'" + int7 + "' != '" + 102 + "'", int7 == 102);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
// flaky "16) test0458(com.reservation_system.randoop.userrepository.RegressionTest0)":         org.junit.Assert.assertTrue("'" + int19 + "' != '" + 102 + "'", int19 == 102);
        org.junit.Assert.assertNotNull(userList20);
    }

    @Test
    public void test0459() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0459");
        com.reservation_system.model.Faculty faculty5 = new com.reservation_system.model.Faculty((int) ' ', "labmanager", "student", "data/test-userrepo.csv", true);
        java.lang.Class<?> wildcardClass6 = faculty5.getClass();
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0460() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0460");
        com.reservation_system.model.HeadLabCoordinator headLabCoordinator5 = new com.reservation_system.model.HeadLabCoordinator(0, "Faculty", "student", "Faculty", false);
    }

    @Test
    public void test0461() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0461");
        com.reservation_system.model.Student student5 = new com.reservation_system.model.Student((int) (short) -1, "alice@example.com", "student", "student", true);
        boolean boolean6 = student5.isApproved();
        int int7 = student5.getID();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
    }

    @Test
    public void test0462() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0462");
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
        com.reservation_system.repository.UserRepository userRepository23 = new com.reservation_system.repository.UserRepository("data/test-userrepo.csv");
        int int24 = userRepository23.getNextID();
        boolean boolean25 = userRepository23.headLabCoordinatorExists();
        com.reservation_system.model.Guest guest31 = new com.reservation_system.model.Guest((int) (byte) -1, "hi!", "", "Password1!", false);
        userRepository23.addUser((com.reservation_system.model.User) guest31);
        java.util.List<com.reservation_system.model.User> userList33 = userRepository23.getAllUsers();
        userRepository1.saveAllUsers(userList33);
// flaky "64) test0462(com.reservation_system.randoop.userrepository.RegressionTest0)":         org.junit.Assert.assertTrue("'" + int18 + "' != '" + 102 + "'", int18 == 102);
        org.junit.Assert.assertNotNull(userList19);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
// flaky "36) test0462(com.reservation_system.randoop.userrepository.RegressionTest0)":         org.junit.Assert.assertTrue("'" + int24 + "' != '" + 102 + "'", int24 == 102);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertNotNull(userList33);
    }

    @Test
    public void test0463() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0463");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("data/test-userrepo.csv");
        int int2 = userRepository1.getNextID();
        boolean boolean3 = userRepository1.headLabCoordinatorExists();
        com.reservation_system.model.Guest guest9 = new com.reservation_system.model.Guest((int) (byte) -1, "hi!", "", "Password1!", false);
        userRepository1.addUser((com.reservation_system.model.User) guest9);
        int int11 = userRepository1.getNextID();
        boolean boolean13 = userRepository1.emailExists("headlabcoordinator");
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
// flaky "65) test0463(com.reservation_system.randoop.userrepository.RegressionTest0)":         org.junit.Assert.assertTrue("'" + int2 + "' != '" + 102 + "'", int2 == 102);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
// flaky "37) test0463(com.reservation_system.randoop.userrepository.RegressionTest0)":         org.junit.Assert.assertTrue("'" + int11 + "' != '" + 102 + "'", int11 == 102);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(userList14);
// flaky "17) test0463(com.reservation_system.randoop.userrepository.RegressionTest0)":         org.junit.Assert.assertTrue("'" + int17 + "' != '" + 102 + "'", int17 == 102);
// flaky "6) test0463(com.reservation_system.randoop.userrepository.RegressionTest0)":         org.junit.Assert.assertTrue("'" + int18 + "' != '" + 102 + "'", int18 == 102);
        org.junit.Assert.assertNotNull(userList26);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertNotNull(userList29);
    }

    @Test
    public void test0464() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0464");
        com.reservation_system.model.Researcher researcher5 = new com.reservation_system.model.Researcher((-1), "student", "Guest", "researcher", false);
        java.lang.String str6 = researcher5.getPassword();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "researcher" + "'", str6, "researcher");
    }

    @Test
    public void test0465() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0465");
        com.reservation_system.model.HeadLabCoordinator headLabCoordinator5 = new com.reservation_system.model.HeadLabCoordinator(101, "Student", "researcher", "", false);
        int int6 = headLabCoordinator5.getID();
        java.lang.String str7 = headLabCoordinator5.getUserType();
        java.lang.Class<?> wildcardClass8 = headLabCoordinator5.getClass();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 101 + "'", int6 == 101);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "headlabcoordinator" + "'", str7, "headlabcoordinator");
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0466() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0466");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("data/test-userrepo.csv");
        com.reservation_system.model.Researcher researcher7 = new com.reservation_system.model.Researcher(5, "hi!", "labmanager", "Guest", false);
        userRepository1.addUser((com.reservation_system.model.User) researcher7);
        java.util.List<com.reservation_system.model.User> userList9 = userRepository1.getAllUsers();
        com.reservation_system.model.Guest guest15 = new com.reservation_system.model.Guest(0, "Password1!", "data/test-userrepo.csv", "researcher", false);
        boolean boolean16 = guest15.requiresDepartmentApproval();
        userRepository1.addUser((com.reservation_system.model.User) guest15);
        boolean boolean19 = userRepository1.emailExists("Alice");
        java.util.Optional<com.reservation_system.model.User> userOptional21 = userRepository1.findByEmail("hi!");
        boolean boolean23 = userRepository1.emailExists("Guest");
        org.junit.Assert.assertNotNull(userList9);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(userOptional21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
    }

    @Test
    public void test0467() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0467");
        com.reservation_system.model.Guest guest5 = new com.reservation_system.model.Guest(0, "Password1!", "data/test-userrepo.csv", "researcher", false);
        guest5.setApproved(false);
        int int8 = guest5.getID();
        guest5.setApproved(true);
        java.lang.String str11 = guest5.getUserType();
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Guest" + "'", str11, "Guest");
    }

    @Test
    public void test0468() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0468");
        com.reservation_system.model.Student student5 = new com.reservation_system.model.Student((int) (byte) 100, "Guest", "labmanager", "student", true);
    }

    @Test
    public void test0469() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0469");
        com.reservation_system.model.LabManager labManager5 = new com.reservation_system.model.LabManager((int) (byte) 0, "labmanager", "Student", "", false);
        java.lang.Class<?> wildcardClass6 = labManager5.getClass();
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0470() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0470");
        com.reservation_system.model.Researcher researcher5 = new com.reservation_system.model.Researcher((int) (byte) -1, "data/test-userrepo.csv", "Alice", "faculty", true);
        boolean boolean6 = researcher5.isApproved();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test0471() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0471");
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
        com.reservation_system.model.User user19 = null;
        // The following exception was thrown during execution in test generation
        try {
            userRepository1.addUser(user19);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky "66) test0471(com.reservation_system.randoop.userrepository.RegressionTest0)":         org.junit.Assert.assertTrue("'" + int9 + "' != '" + 102 + "'", int9 == 102);
        org.junit.Assert.assertNotNull(userOptional11);
// flaky "38) test0471(com.reservation_system.randoop.userrepository.RegressionTest0)":         org.junit.Assert.assertTrue("'" + int12 + "' != '" + 102 + "'", int12 == 102);
        org.junit.Assert.assertNotNull(userOptional14);
        org.junit.Assert.assertNotNull(userList17);
    }

    @Test
    public void test0472() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0472");
        com.reservation_system.model.Faculty faculty5 = new com.reservation_system.model.Faculty(98, "hi!", "headlabcoordinator", "data/test-userrepo.csv", false);
        int int6 = faculty5.getID();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 98 + "'", int6 == 98);
    }

    @Test
    public void test0473() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0473");
        com.reservation_system.model.Faculty faculty5 = new com.reservation_system.model.Faculty(102, "researcher", "labmanager", "Password1!", true);
    }

    @Test
    public void test0474() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0474");
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
        com.reservation_system.model.Researcher researcher26 = new com.reservation_system.model.Researcher((int) (short) -1, "labmanager", "faculty", "headlabcoordinator", true);
        userRepository1.addUser((com.reservation_system.model.User) researcher26);
        java.lang.String str28 = researcher26.getName();
        org.junit.Assert.assertNotNull(userList2);
// flaky "67) test0474(com.reservation_system.randoop.userrepository.RegressionTest0)":         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 102 + "'", int3 == 102);
        org.junit.Assert.assertNotNull(userList6);
// flaky "39) test0474(com.reservation_system.randoop.userrepository.RegressionTest0)":         org.junit.Assert.assertTrue("'" + int7 + "' != '" + 102 + "'", int7 == 102);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(userOptional12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(userList19);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "labmanager" + "'", str28, "labmanager");
    }

    @Test
    public void test0475() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0475");
        // The following exception was thrown during execution in test generation
        try {
            com.reservation_system.model.User user6 = com.reservation_system.patterns.factory.UserFactory.createUser("hi!", 35, "labmanager", "Alice", "hi!", true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid user type: hi!");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0476() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0476");
        com.reservation_system.model.Guest guest5 = new com.reservation_system.model.Guest(0, "Password1!", "data/test-userrepo.csv", "researcher", false);
        boolean boolean6 = guest5.requiresDepartmentApproval();
        java.lang.String str7 = guest5.getUserType();
        java.lang.String str8 = guest5.getUserType();
        java.lang.String str9 = guest5.getName();
        guest5.setApproved(false);
        java.lang.String str12 = guest5.getPassword();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Guest" + "'", str7, "Guest");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Guest" + "'", str8, "Guest");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Password1!" + "'", str9, "Password1!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "researcher" + "'", str12, "researcher");
    }

    @Test
    public void test0477() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0477");
        com.reservation_system.model.Researcher researcher5 = new com.reservation_system.model.Researcher((int) (byte) 100, "alice@example.com", "Faculty", "guest", false);
    }

    @Test
    public void test0478() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0478");
        com.reservation_system.model.User user6 = com.reservation_system.patterns.factory.UserFactory.createUser("Faculty", (int) (short) 10, "", "labmanager", "guest", false);
        org.junit.Assert.assertNotNull(user6);
    }

    @Test
    public void test0479() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0479");
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
        com.reservation_system.model.Researcher researcher26 = new com.reservation_system.model.Researcher((int) (short) -1, "labmanager", "faculty", "headlabcoordinator", true);
        userRepository1.addUser((com.reservation_system.model.User) researcher26);
        java.lang.String str28 = researcher26.getUserType();
        org.junit.Assert.assertNotNull(userList2);
// flaky "68) test0479(com.reservation_system.randoop.userrepository.RegressionTest0)":         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 102 + "'", int3 == 102);
        org.junit.Assert.assertNotNull(userList6);
// flaky "40) test0479(com.reservation_system.randoop.userrepository.RegressionTest0)":         org.junit.Assert.assertTrue("'" + int7 + "' != '" + 102 + "'", int7 == 102);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(userOptional12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(userList19);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "Researcher" + "'", str28, "Researcher");
    }

    @Test
    public void test0480() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0480");
        com.reservation_system.model.Faculty faculty5 = new com.reservation_system.model.Faculty((int) (byte) -1, "Alice", "researcher", "Password1!", false);
        java.lang.String str6 = faculty5.getName();
        java.lang.String str7 = faculty5.getUserType();
        java.lang.String str8 = faculty5.getUserType();
        java.lang.String str9 = faculty5.getUserType();
        faculty5.setApproved(true);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Alice" + "'", str6, "Alice");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Faculty" + "'", str7, "Faculty");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Faculty" + "'", str8, "Faculty");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Faculty" + "'", str9, "Faculty");
    }

    @Test
    public void test0481() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0481");
        com.reservation_system.model.Researcher researcher5 = new com.reservation_system.model.Researcher(1, "researcher", "Faculty", "student", false);
    }

    @Test
    public void test0482() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0482");
        com.reservation_system.model.Faculty faculty5 = new com.reservation_system.model.Faculty((int) '4', "hi!", "Researcher", "Guest", false);
        java.lang.String str6 = faculty5.getUserType();
        java.lang.String str7 = faculty5.getUserType();
        java.lang.String str8 = faculty5.getUserType();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Faculty" + "'", str6, "Faculty");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Faculty" + "'", str7, "Faculty");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Faculty" + "'", str8, "Faculty");
    }

    @Test
    public void test0483() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0483");
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
        boolean boolean45 = userRepository1.headLabCoordinatorExists();
        org.junit.Assert.assertNotNull(userList9);
        org.junit.Assert.assertNotNull(userList19);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertNotNull(userList24);
// flaky "69) test0483(com.reservation_system.randoop.userrepository.RegressionTest0)":         org.junit.Assert.assertTrue("'" + int25 + "' != '" + 102 + "'", int25 == 102);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(userOptional29);
        org.junit.Assert.assertNotNull(userList32);
// flaky "41) test0483(com.reservation_system.randoop.userrepository.RegressionTest0)":         org.junit.Assert.assertTrue("'" + int33 + "' != '" + 102 + "'", int33 == 102);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertNotNull(userOptional38);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + true + "'", boolean40 == true);
        org.junit.Assert.assertNotNull(userList41);
        org.junit.Assert.assertNotNull(userList43);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + true + "'", boolean45 == true);
    }

    @Test
    public void test0484() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0484");
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
        com.reservation_system.repository.UserRepository userRepository18 = new com.reservation_system.repository.UserRepository("data/test-userrepo.csv");
        com.reservation_system.model.Researcher researcher24 = new com.reservation_system.model.Researcher(5, "hi!", "labmanager", "Guest", false);
        userRepository18.addUser((com.reservation_system.model.User) researcher24);
        int int26 = userRepository18.getNextID();
        com.reservation_system.repository.UserRepository userRepository28 = new com.reservation_system.repository.UserRepository("data/test-userrepo.csv");
        com.reservation_system.model.Researcher researcher34 = new com.reservation_system.model.Researcher(5, "hi!", "labmanager", "Guest", false);
        userRepository28.addUser((com.reservation_system.model.User) researcher34);
        java.util.List<com.reservation_system.model.User> userList36 = userRepository28.getAllUsers();
        boolean boolean37 = userRepository28.headLabCoordinatorExists();
        boolean boolean39 = userRepository28.emailExists("guest");
        com.reservation_system.repository.UserRepository userRepository41 = new com.reservation_system.repository.UserRepository("data/test-userrepo.csv");
        boolean boolean43 = userRepository41.emailExists("Alice");
        com.reservation_system.repository.UserRepository userRepository45 = new com.reservation_system.repository.UserRepository("data/test-userrepo.csv");
        java.util.List<com.reservation_system.model.User> userList46 = userRepository45.getAllUsers();
        int int47 = userRepository45.getNextID();
        java.util.List<com.reservation_system.model.User> userList48 = userRepository45.getAllUsers();
        userRepository41.saveAllUsers(userList48);
        userRepository28.saveAllUsers(userList48);
        java.util.List<com.reservation_system.model.User> userList51 = userRepository28.getAllUsers();
        userRepository18.saveAllUsers(userList51);
        java.util.List<com.reservation_system.model.User> userList53 = userRepository18.getAllUsers();
        userRepository1.saveAllUsers(userList53);
// flaky "70) test0484(com.reservation_system.randoop.userrepository.RegressionTest0)":         org.junit.Assert.assertTrue("'" + int2 + "' != '" + 102 + "'", int2 == 102);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
// flaky "42) test0484(com.reservation_system.randoop.userrepository.RegressionTest0)":         org.junit.Assert.assertTrue("'" + int11 + "' != '" + 102 + "'", int11 == 102);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(userList14);
// flaky "18) test0484(com.reservation_system.randoop.userrepository.RegressionTest0)":         org.junit.Assert.assertTrue("'" + int15 + "' != '" + 102 + "'", int15 == 102);
        org.junit.Assert.assertNotNull(userList16);
// flaky "7) test0484(com.reservation_system.randoop.userrepository.RegressionTest0)":         org.junit.Assert.assertTrue("'" + int26 + "' != '" + 102 + "'", int26 == 102);
        org.junit.Assert.assertNotNull(userList36);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertNotNull(userList46);
// flaky "4) test0484(com.reservation_system.randoop.userrepository.RegressionTest0)":         org.junit.Assert.assertTrue("'" + int47 + "' != '" + 102 + "'", int47 == 102);
        org.junit.Assert.assertNotNull(userList48);
        org.junit.Assert.assertNotNull(userList51);
        org.junit.Assert.assertNotNull(userList53);
    }

    @Test
    public void test0485() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0485");
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
        boolean boolean31 = userRepository1.headLabCoordinatorExists();
        org.junit.Assert.assertNotNull(userList9);
        org.junit.Assert.assertNotNull(userOptional20);
        org.junit.Assert.assertNotNull(userList21);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
    }

    @Test
    public void test0486() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0486");
        com.reservation_system.model.LabManager labManager5 = new com.reservation_system.model.LabManager((int) '#', "", "labmanager", "headlabcoordinator", true);
    }

    @Test
    public void test0487() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0487");
        com.reservation_system.model.Researcher researcher5 = new com.reservation_system.model.Researcher((int) 'a', "labmanager", "faculty", "", false);
        boolean boolean6 = researcher5.isApproved();
        boolean boolean7 = researcher5.requiresDepartmentApproval();
        boolean boolean8 = researcher5.isApproved();
        java.lang.String str9 = researcher5.getName();
        java.lang.String str10 = researcher5.getEmail();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "labmanager" + "'", str9, "labmanager");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "faculty" + "'", str10, "faculty");
    }

    @Test
    public void test0488() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0488");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("data/test-userrepo.csv");
        com.reservation_system.model.Researcher researcher7 = new com.reservation_system.model.Researcher(5, "hi!", "labmanager", "Guest", false);
        userRepository1.addUser((com.reservation_system.model.User) researcher7);
        int int9 = userRepository1.getNextID();
        boolean boolean11 = userRepository1.emailExists("Researcher");
        java.util.List<com.reservation_system.model.User> userList12 = userRepository1.getAllUsers();
        com.reservation_system.repository.UserRepository userRepository14 = new com.reservation_system.repository.UserRepository("data/test-userrepo.csv");
        com.reservation_system.model.Researcher researcher20 = new com.reservation_system.model.Researcher(5, "hi!", "labmanager", "Guest", false);
        userRepository14.addUser((com.reservation_system.model.User) researcher20);
        java.util.List<com.reservation_system.model.User> userList22 = userRepository14.getAllUsers();
        boolean boolean23 = userRepository14.headLabCoordinatorExists();
        boolean boolean25 = userRepository14.emailExists("guest");
        com.reservation_system.repository.UserRepository userRepository27 = new com.reservation_system.repository.UserRepository("data/test-userrepo.csv");
        boolean boolean29 = userRepository27.emailExists("Alice");
        com.reservation_system.repository.UserRepository userRepository31 = new com.reservation_system.repository.UserRepository("data/test-userrepo.csv");
        java.util.List<com.reservation_system.model.User> userList32 = userRepository31.getAllUsers();
        int int33 = userRepository31.getNextID();
        java.util.List<com.reservation_system.model.User> userList34 = userRepository31.getAllUsers();
        userRepository27.saveAllUsers(userList34);
        userRepository14.saveAllUsers(userList34);
        java.util.List<com.reservation_system.model.User> userList37 = userRepository14.getAllUsers();
        userRepository1.saveAllUsers(userList37);
        int int39 = userRepository1.getNextID();
// flaky "71) test0488(com.reservation_system.randoop.userrepository.RegressionTest0)":         org.junit.Assert.assertTrue("'" + int9 + "' != '" + 102 + "'", int9 == 102);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(userList12);
        org.junit.Assert.assertNotNull(userList22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(userList32);
// flaky "43) test0488(com.reservation_system.randoop.userrepository.RegressionTest0)":         org.junit.Assert.assertTrue("'" + int33 + "' != '" + 102 + "'", int33 == 102);
        org.junit.Assert.assertNotNull(userList34);
        org.junit.Assert.assertNotNull(userList37);
// flaky "19) test0488(com.reservation_system.randoop.userrepository.RegressionTest0)":         org.junit.Assert.assertTrue("'" + int39 + "' != '" + 102 + "'", int39 == 102);
    }

    @Test
    public void test0489() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0489");
        com.reservation_system.model.Researcher researcher5 = new com.reservation_system.model.Researcher((int) (byte) 1, "headlabcoordinator", "data/test-userrepo.csv", "Faculty", false);
        researcher5.setApproved(true);
    }

    @Test
    public void test0490() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0490");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("data/test-userrepo.csv");
        com.reservation_system.model.Researcher researcher7 = new com.reservation_system.model.Researcher(5, "hi!", "labmanager", "Guest", false);
        userRepository1.addUser((com.reservation_system.model.User) researcher7);
        com.reservation_system.model.Faculty faculty14 = new com.reservation_system.model.Faculty(5, "researcher", "guest", "faculty", true);
        java.lang.String str15 = faculty14.getUserType();
        java.lang.String str16 = faculty14.getUserType();
        userRepository1.addUser((com.reservation_system.model.User) faculty14);
        boolean boolean19 = userRepository1.emailExists("hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Faculty" + "'", str15, "Faculty");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Faculty" + "'", str16, "Faculty");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
    }

    @Test
    public void test0491() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0491");
        com.reservation_system.model.Guest guest5 = new com.reservation_system.model.Guest((int) '4', "labmanager", "alice@example.com", "Password1!", true);
    }

    @Test
    public void test0492() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0492");
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
        com.reservation_system.model.User user51 = null;
        // The following exception was thrown during execution in test generation
        try {
            userRepository1.addUser(user51);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(userList9);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(userOptional21);
// flaky "72) test0492(com.reservation_system.randoop.userrepository.RegressionTest0)":         org.junit.Assert.assertTrue("'" + int22 + "' != '" + 102 + "'", int22 == 102);
// flaky "44) test0492(com.reservation_system.randoop.userrepository.RegressionTest0)":         org.junit.Assert.assertTrue("'" + int32 + "' != '" + 102 + "'", int32 == 102);
// flaky "20) test0492(com.reservation_system.randoop.userrepository.RegressionTest0)":         org.junit.Assert.assertTrue("'" + int35 + "' != '" + 102 + "'", int35 == 102);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
// flaky "8) test0492(com.reservation_system.randoop.userrepository.RegressionTest0)":         org.junit.Assert.assertTrue("'" + int44 + "' != '" + 102 + "'", int44 == 102);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertNotNull(userList47);
// flaky "5) test0492(com.reservation_system.randoop.userrepository.RegressionTest0)":         org.junit.Assert.assertTrue("'" + int50 + "' != '" + 102 + "'", int50 == 102);
    }

    @Test
    public void test0493() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0493");
        com.reservation_system.model.Faculty faculty5 = new com.reservation_system.model.Faculty((int) (short) 1, "Password1!", "faculty", "Researcher", true);
    }

    @Test
    public void test0494() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0494");
        com.reservation_system.model.Faculty faculty5 = new com.reservation_system.model.Faculty((int) '4', "faculty", "researcher", "", true);
        java.lang.String str6 = faculty5.getPassword();
        java.lang.String str7 = faculty5.getUserType();
        java.lang.String str8 = faculty5.getUserType();
        faculty5.setApproved(true);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Faculty" + "'", str7, "Faculty");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Faculty" + "'", str8, "Faculty");
    }

    @Test
    public void test0495() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0495");
        com.reservation_system.model.Researcher researcher5 = new com.reservation_system.model.Researcher((int) (byte) 0, "headlabcoordinator", "Student", "hi!", false);
    }

    @Test
    public void test0496() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0496");
        com.reservation_system.model.Student student5 = new com.reservation_system.model.Student((int) (byte) 100, "guest", "Guest", "Researcher", true);
    }

    @Test
    public void test0497() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0497");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("data/test-userrepo.csv");
        boolean boolean3 = userRepository1.emailExists("Password1!");
        boolean boolean5 = userRepository1.emailExists("hi!");
        java.util.List<com.reservation_system.model.User> userList6 = userRepository1.getAllUsers();
        java.util.Optional<com.reservation_system.model.User> userOptional8 = userRepository1.findByEmail("headlabcoordinator");
        java.util.List<com.reservation_system.model.User> userList9 = userRepository1.getAllUsers();
        boolean boolean10 = userRepository1.headLabCoordinatorExists();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(userList6);
        org.junit.Assert.assertNotNull(userOptional8);
        org.junit.Assert.assertNotNull(userList9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test0498() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0498");
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
        java.lang.String str28 = faculty21.getName();
        faculty21.setApproved(false);
        org.junit.Assert.assertNotNull(userList2);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Guest" + "'", str10, "Guest");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Guest" + "'", str11, "Guest");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Guest" + "'", str14, "Guest");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "Faculty" + "'", str22, "Faculty");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "Faculty" + "'", str23, "Faculty");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "Faculty" + "'", str24, "Faculty");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "researcher" + "'", str28, "researcher");
    }

    @Test
    public void test0499() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0499");
        com.reservation_system.model.Researcher researcher5 = new com.reservation_system.model.Researcher(0, "Faculty", "labmanager", "faculty", false);
        boolean boolean6 = researcher5.isApproved();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test0500() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0500");
        com.reservation_system.model.Researcher researcher5 = new com.reservation_system.model.Researcher(98, "Alice", "Student", "guest", false);
        java.lang.String str6 = researcher5.getUserType();
        researcher5.setApproved(false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Researcher" + "'", str6, "Researcher");
    }
}
