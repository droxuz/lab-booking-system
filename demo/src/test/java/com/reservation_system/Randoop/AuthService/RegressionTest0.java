package com.reservation_system.Randoop.AuthService;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest0 {

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
        // The following exception was thrown during execution in test generation
        try {
            com.reservation_system.model.User user6 = com.reservation_system.patterns.factory.UserFactory.createUser("data/test-users.csv", (-1), "Password1!", "test@example.com", "test@example.com", true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid user type: data/test-users.csv");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0002");
        com.reservation_system.model.Researcher researcher5 = new com.reservation_system.model.Researcher((int) (short) -1, "headlabcoordinator", "student", "", false);
        java.lang.Class<?> wildcardClass6 = researcher5.getClass();
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0003");
        com.reservation_system.model.Faculty faculty5 = new com.reservation_system.model.Faculty(0, "headlabcoordinator", "student", "labmanager", false);
        boolean boolean6 = faculty5.requiresDepartmentApproval();
        java.lang.Class<?> wildcardClass7 = faculty5.getClass();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0004");
        com.reservation_system.model.Researcher researcher5 = new com.reservation_system.model.Researcher((int) (short) -1, "headlabcoordinator", "student", "", false);
        java.lang.String str6 = researcher5.getUserType();
        java.lang.Class<?> wildcardClass7 = researcher5.getClass();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Researcher" + "'", str6, "Researcher");
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0005");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("data/test-users.csv");
        java.lang.Class<?> wildcardClass2 = userRepository1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test0006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0006");
        com.reservation_system.model.Researcher researcher5 = new com.reservation_system.model.Researcher((int) (short) -1, "researcher", "test@example.com", "Faculty", true);
        boolean boolean6 = researcher5.requiresDepartmentApproval();
        researcher5.setApproved(false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test0007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0007");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("data/test-users.csv");
        java.util.List<com.reservation_system.model.User> userList2 = userRepository1.getAllUsers();
        com.reservation_system.services.AuthService authService3 = new com.reservation_system.services.AuthService(userRepository1);
        // The following exception was thrown during execution in test generation
        try {
            com.reservation_system.model.User user6 = authService3.login("hi!", "");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Password is required.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(userList2);
    }

    @Test
    public void test0008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0008");
        com.reservation_system.model.Researcher researcher5 = new com.reservation_system.model.Researcher((int) (short) -1, "headlabcoordinator", "student", "", false);
        boolean boolean6 = researcher5.isApproved();
        java.lang.String str7 = researcher5.getEmail();
        researcher5.setApproved(true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "student" + "'", str7, "student");
    }

    @Test
    public void test0009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0009");
        com.reservation_system.patterns.factory.UserFactory userFactory0 = new com.reservation_system.patterns.factory.UserFactory();
    }

    @Test
    public void test0010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0010");
        com.reservation_system.model.Researcher researcher5 = new com.reservation_system.model.Researcher((int) (short) -1, "researcher", "test@example.com", "Faculty", true);
        boolean boolean6 = researcher5.requiresDepartmentApproval();
        java.lang.String str7 = researcher5.getEmail();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test0011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0011");
        com.reservation_system.model.Student student5 = new com.reservation_system.model.Student((int) (short) -1, "Password1!", "faculty", "faculty", true);
        student5.setApproved(true);
    }

    @Test
    public void test0012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0012");
        // The following exception was thrown during execution in test generation
        try {
            com.reservation_system.model.User user6 = com.reservation_system.patterns.factory.UserFactory.createUser("Password1!", (int) (short) -1, "student", "Researcher", "researcher", false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid user type: Password1!");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0013");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("data/test-users.csv");
        java.util.List<com.reservation_system.model.User> userList2 = userRepository1.getAllUsers();
        com.reservation_system.services.AuthService authService3 = new com.reservation_system.services.AuthService(userRepository1);
        com.reservation_system.services.AuthService authService4 = new com.reservation_system.services.AuthService(userRepository1);
        // The following exception was thrown during execution in test generation
        try {
            com.reservation_system.model.User user7 = authService4.login("hi!", "");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Password is required.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(userList2);
    }

    @Test
    public void test0014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0014");
        com.reservation_system.model.Guest guest5 = new com.reservation_system.model.Guest((int) '#', "test@example.com", "Password1!", "test@example.com", true);
        java.lang.String str6 = guest5.getName();
        java.lang.String str7 = guest5.getName();
        java.lang.String str8 = guest5.getUserType();
        java.lang.String str9 = guest5.getUserType();
        java.lang.Class<?> wildcardClass10 = guest5.getClass();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Guest" + "'", str8, "Guest");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Guest" + "'", str9, "Guest");
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0015");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("data/test-users.csv");
        java.util.List<com.reservation_system.model.User> userList2 = userRepository1.getAllUsers();
        com.reservation_system.services.AuthService authService3 = new com.reservation_system.services.AuthService(userRepository1);
        // The following exception was thrown during execution in test generation
        try {
            com.reservation_system.model.User user6 = authService3.login("Guest", "test@example.com");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: No user found with that email.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(userList2);
    }

    @Test
    public void test0016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0016");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("data/test-users.csv");
        java.util.List<com.reservation_system.model.User> userList2 = userRepository1.getAllUsers();
        com.reservation_system.services.AuthService authService3 = new com.reservation_system.services.AuthService(userRepository1);
        com.reservation_system.services.AuthService authService4 = new com.reservation_system.services.AuthService(userRepository1);
        // The following exception was thrown during execution in test generation
        try {
            com.reservation_system.model.User user7 = authService4.login("WrongPassword1!", "Researcher");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: No user found with that email.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(userList2);
    }

    @Test
    public void test0017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0017");
        com.reservation_system.model.Faculty faculty5 = new com.reservation_system.model.Faculty((int) (short) 0, "Faculty", "headlabcoordinator", "", true);
        boolean boolean6 = faculty5.requiresDepartmentApproval();
        java.lang.Class<?> wildcardClass7 = faculty5.getClass();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0018");
        com.reservation_system.model.Faculty faculty5 = new com.reservation_system.model.Faculty(0, "headlabcoordinator", "student", "labmanager", false);
        java.lang.String str6 = faculty5.getName();
        faculty5.setApproved(false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "headlabcoordinator" + "'", str6, "headlabcoordinator");
    }

    @Test
    public void test0019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0019");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("data/test-users.csv");
        java.util.List<com.reservation_system.model.User> userList2 = userRepository1.getAllUsers();
        java.util.List<com.reservation_system.model.User> userList3 = userRepository1.getAllUsers();
        com.reservation_system.services.AuthService authService4 = new com.reservation_system.services.AuthService(userRepository1);
        // The following exception was thrown during execution in test generation
        try {
            com.reservation_system.model.User user7 = authService4.login("Researcher", "Researcher");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: No user found with that email.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(userList2);
        org.junit.Assert.assertNotNull(userList3);
    }

    @Test
    public void test0020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0020");
        com.reservation_system.model.Guest guest5 = new com.reservation_system.model.Guest((int) '#', "test@example.com", "Password1!", "test@example.com", true);
        java.lang.String str6 = guest5.getName();
        java.lang.Class<?> wildcardClass7 = guest5.getClass();
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0021");
        com.reservation_system.model.LabManager labManager5 = new com.reservation_system.model.LabManager((int) (short) 100, "faculty", "data/test-users.csv", "headlabcoordinator", true);
    }

    @Test
    public void test0022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0022");
        com.reservation_system.model.Researcher researcher5 = new com.reservation_system.model.Researcher((int) (short) -1, "researcher", "test@example.com", "Faculty", true);
        boolean boolean6 = researcher5.requiresDepartmentApproval();
        boolean boolean7 = researcher5.isApproved();
        java.lang.Class<?> wildcardClass8 = researcher5.getClass();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0023");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("data/test-users.csv");
        java.util.List<com.reservation_system.model.User> userList2 = userRepository1.getAllUsers();
        java.util.List<com.reservation_system.model.User> userList3 = userRepository1.getAllUsers();
        com.reservation_system.services.AuthService authService4 = new com.reservation_system.services.AuthService(userRepository1);
        // The following exception was thrown during execution in test generation
        try {
            com.reservation_system.model.User user7 = authService4.login("labmanager", "Researcher");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: No user found with that email.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(userList2);
        org.junit.Assert.assertNotNull(userList3);
    }

    @Test
    public void test0024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0024");
        com.reservation_system.model.Faculty faculty5 = new com.reservation_system.model.Faculty((int) (byte) 1, "Password1!", "Faculty", "researcher", true);
        boolean boolean6 = faculty5.isApproved();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test0025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0025");
        com.reservation_system.model.Faculty faculty5 = new com.reservation_system.model.Faculty(0, "headlabcoordinator", "student", "labmanager", false);
        java.lang.Class<?> wildcardClass6 = faculty5.getClass();
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0026");
        com.reservation_system.model.Researcher researcher5 = new com.reservation_system.model.Researcher(0, "WrongPassword1!", "researcher", "", true);
    }

    @Test
    public void test0027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0027");
        com.reservation_system.model.Researcher researcher5 = new com.reservation_system.model.Researcher((int) (short) -1, "headlabcoordinator", "student", "", false);
        boolean boolean6 = researcher5.isApproved();
        java.lang.String str7 = researcher5.getEmail();
        java.lang.String str8 = researcher5.getUserType();
        java.lang.String str9 = researcher5.getUserType();
        boolean boolean10 = researcher5.requiresDepartmentApproval();
        java.lang.String str11 = researcher5.getName();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "student" + "'", str7, "student");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Researcher" + "'", str8, "Researcher");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Researcher" + "'", str9, "Researcher");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "headlabcoordinator" + "'", str11, "headlabcoordinator");
    }

    @Test
    public void test0028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0028");
        com.reservation_system.model.Researcher researcher5 = new com.reservation_system.model.Researcher((int) '4', "Andrew", "labmanager", "WrongPassword1!", false);
    }

    @Test
    public void test0029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0029");
        com.reservation_system.model.Researcher researcher5 = new com.reservation_system.model.Researcher((int) (short) -1, "headlabcoordinator", "student", "", false);
        java.lang.String str6 = researcher5.getUserType();
        boolean boolean7 = researcher5.isApproved();
        java.lang.Class<?> wildcardClass8 = researcher5.getClass();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Researcher" + "'", str6, "Researcher");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0030");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("data/test-users.csv");
        java.util.List<com.reservation_system.model.User> userList2 = userRepository1.getAllUsers();
        java.util.List<com.reservation_system.model.User> userList3 = userRepository1.getAllUsers();
        com.reservation_system.services.AuthService authService4 = new com.reservation_system.services.AuthService(userRepository1);
        // The following exception was thrown during execution in test generation
        try {
            com.reservation_system.model.User user7 = authService4.login("researcher", "student");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: No user found with that email.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(userList2);
        org.junit.Assert.assertNotNull(userList3);
    }

    @Test
    public void test0031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0031");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("data/test-users.csv");
        java.util.List<com.reservation_system.model.User> userList2 = userRepository1.getAllUsers();
        boolean boolean3 = userRepository1.headLabCoordinatorExists();
        boolean boolean5 = userRepository1.emailExists("hi!");
        com.reservation_system.model.User user6 = null;
        // The following exception was thrown during execution in test generation
        try {
            userRepository1.addUser(user6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.reservation_system.model.User.getName()\" because \"user\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(userList2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
// flaky "1) test0031(com.reservation_system.Randoop.AuthService.RegressionTest0)":         org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
    }

    @Test
    public void test0032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0032");
        com.reservation_system.model.Faculty faculty5 = new com.reservation_system.model.Faculty((int) (byte) 1, "Password1!", "Faculty", "researcher", true);
        java.lang.Class<?> wildcardClass6 = faculty5.getClass();
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0033");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("data/test-users.csv");
        java.util.List<com.reservation_system.model.User> userList2 = userRepository1.getAllUsers();
        com.reservation_system.services.AuthService authService3 = new com.reservation_system.services.AuthService(userRepository1);
        com.reservation_system.services.AuthService authService4 = new com.reservation_system.services.AuthService(userRepository1);
        com.reservation_system.services.AuthService authService5 = new com.reservation_system.services.AuthService(userRepository1);
        // The following exception was thrown during execution in test generation
        try {
            com.reservation_system.model.User user8 = authService5.login("labmanager", "researcher");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: No user found with that email.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(userList2);
    }

    @Test
    public void test0034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0034");
        com.reservation_system.model.Student student5 = new com.reservation_system.model.Student(0, "student", "Andrew", "guest", false);
        java.lang.String str6 = student5.getEmail();
        java.lang.String str7 = student5.getUserType();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Andrew" + "'", str6, "Andrew");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Student" + "'", str7, "Student");
    }

    @Test
    public void test0035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0035");
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
        // The following exception was thrown during execution in test generation
        try {
            com.reservation_system.model.User user17 = authService14.login("faculty", "test@example.com");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: No user found with that email.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(userList2);
        org.junit.Assert.assertNotNull(userList3);
        org.junit.Assert.assertNotNull(userList6);
// flaky "2) test0035(com.reservation_system.Randoop.AuthService.RegressionTest0)":         org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(userList10);
        org.junit.Assert.assertNotNull(userList11);
    }

    @Test
    public void test0036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0036");
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
        // The following exception was thrown during execution in test generation
        try {
            com.reservation_system.model.User user17 = authService14.login("headlabcoordinator", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Incorrect password.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(userList2);
        org.junit.Assert.assertNotNull(userList3);
        org.junit.Assert.assertNotNull(userList6);
// flaky "3) test0036(com.reservation_system.Randoop.AuthService.RegressionTest0)":         org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(userList10);
        org.junit.Assert.assertNotNull(userList11);
    }

    @Test
    public void test0037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0037");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("data/test-users.csv");
        java.util.List<com.reservation_system.model.User> userList2 = userRepository1.getAllUsers();
        com.reservation_system.services.AuthService authService3 = new com.reservation_system.services.AuthService(userRepository1);
        com.reservation_system.model.LabManager labManager9 = new com.reservation_system.model.LabManager((int) (short) 0, "", "student", "Andrew", true);
        boolean boolean10 = labManager9.isApproved();
        userRepository1.addUser((com.reservation_system.model.User) labManager9);
        com.reservation_system.model.Faculty faculty17 = new com.reservation_system.model.Faculty((int) '#', "researcher", "", "student", true);
        userRepository1.addUser((com.reservation_system.model.User) faculty17);
        com.reservation_system.services.AuthService authService19 = new com.reservation_system.services.AuthService(userRepository1);
        // The following exception was thrown during execution in test generation
        try {
            com.reservation_system.model.User user22 = authService19.login("data/test-users.csv", "Faculty");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: No user found with that email.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(userList2);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test0038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0038");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("data/test-users.csv");
        java.util.List<com.reservation_system.model.User> userList2 = userRepository1.getAllUsers();
        com.reservation_system.services.AuthService authService3 = new com.reservation_system.services.AuthService(userRepository1);
        com.reservation_system.model.LabManager labManager9 = new com.reservation_system.model.LabManager((int) (short) 0, "", "student", "Andrew", true);
        boolean boolean10 = labManager9.isApproved();
        userRepository1.addUser((com.reservation_system.model.User) labManager9);
        com.reservation_system.model.Faculty faculty17 = new com.reservation_system.model.Faculty((int) '#', "researcher", "", "student", true);
        userRepository1.addUser((com.reservation_system.model.User) faculty17);
        com.reservation_system.services.AuthService authService19 = new com.reservation_system.services.AuthService(userRepository1);
        // The following exception was thrown during execution in test generation
        try {
            com.reservation_system.model.User user22 = authService19.login("test@example.com", "Researcher");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Incorrect password.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(userList2);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test0039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0039");
        com.reservation_system.model.Student student5 = new com.reservation_system.model.Student(10, "researcher", "Guest", "Password1!", true);
    }

    @Test
    public void test0040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0040");
        com.reservation_system.model.Guest guest5 = new com.reservation_system.model.Guest((int) (byte) 100, "Password1!", "Guest", "Guest", true);
        java.lang.String str6 = guest5.getUserType();
        java.lang.String str7 = guest5.getUserType();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Guest" + "'", str6, "Guest");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Guest" + "'", str7, "Guest");
    }

    @Test
    public void test0041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0041");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("data/test-users.csv");
        java.util.List<com.reservation_system.model.User> userList2 = userRepository1.getAllUsers();
        com.reservation_system.services.AuthService authService3 = new com.reservation_system.services.AuthService(userRepository1);
        com.reservation_system.services.AuthService authService4 = new com.reservation_system.services.AuthService(userRepository1);
        com.reservation_system.services.AuthService authService5 = new com.reservation_system.services.AuthService(userRepository1);
        // The following exception was thrown during execution in test generation
        try {
            com.reservation_system.model.User user8 = authService5.login("researcher", "Andrew");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Incorrect password.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(userList2);
    }

    @Test
    public void test0042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0042");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("data/test-users.csv");
        java.util.List<com.reservation_system.model.User> userList2 = userRepository1.getAllUsers();
        java.util.List<com.reservation_system.model.User> userList3 = userRepository1.getAllUsers();
        com.reservation_system.services.AuthService authService4 = new com.reservation_system.services.AuthService(userRepository1);
        java.util.Optional<com.reservation_system.model.User> userOptional6 = userRepository1.findByEmail("faculty");
        java.lang.Class<?> wildcardClass7 = userRepository1.getClass();
        org.junit.Assert.assertNotNull(userList2);
        org.junit.Assert.assertNotNull(userList3);
        org.junit.Assert.assertNotNull(userOptional6);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0043");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("data/test-users.csv");
        java.util.List<com.reservation_system.model.User> userList2 = userRepository1.getAllUsers();
        boolean boolean3 = userRepository1.headLabCoordinatorExists();
        java.lang.Class<?> wildcardClass4 = userRepository1.getClass();
        org.junit.Assert.assertNotNull(userList2);
// flaky "4) test0043(com.reservation_system.Randoop.AuthService.RegressionTest0)":         org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test0044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0044");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("data/test-users.csv");
        java.util.List<com.reservation_system.model.User> userList2 = userRepository1.getAllUsers();
        java.util.List<com.reservation_system.model.User> userList3 = userRepository1.getAllUsers();
        com.reservation_system.services.AuthService authService4 = new com.reservation_system.services.AuthService(userRepository1);
        java.util.Optional<com.reservation_system.model.User> userOptional6 = userRepository1.findByEmail("faculty");
        com.reservation_system.services.AuthService authService7 = new com.reservation_system.services.AuthService(userRepository1);
        // The following exception was thrown during execution in test generation
        try {
            com.reservation_system.model.User user10 = authService7.login("WrongPassword1!", "faculty");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: No user found with that email.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(userList2);
        org.junit.Assert.assertNotNull(userList3);
        org.junit.Assert.assertNotNull(userOptional6);
    }

    @Test
    public void test0045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0045");
        // The following exception was thrown during execution in test generation
        try {
            com.reservation_system.model.User user6 = com.reservation_system.patterns.factory.UserFactory.createUser("", 10, "researcher", "hi!", "researcher", true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid user type: ");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0046");
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
        com.reservation_system.model.User user15 = null;
        // The following exception was thrown during execution in test generation
        try {
            userRepository1.addUser(user15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.reservation_system.model.User.getName()\" because \"user\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(userList2);
        org.junit.Assert.assertNotNull(userList3);
        org.junit.Assert.assertNotNull(userList6);
// flaky "5) test0046(com.reservation_system.Randoop.AuthService.RegressionTest0)":         org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(userList10);
        org.junit.Assert.assertNotNull(userList11);
// flaky "1) test0046(com.reservation_system.Randoop.AuthService.RegressionTest0)":         org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test0047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0047");
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
        // The following exception was thrown during execution in test generation
        try {
            com.reservation_system.model.User user17 = authService14.login("student", "Student");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Incorrect password.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(userList2);
        org.junit.Assert.assertNotNull(userList3);
        org.junit.Assert.assertNotNull(userList6);
// flaky "6) test0047(com.reservation_system.Randoop.AuthService.RegressionTest0)":         org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(userList10);
        org.junit.Assert.assertNotNull(userList11);
    }

    @Test
    public void test0048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0048");
        com.reservation_system.model.Student student5 = new com.reservation_system.model.Student(1, "guest", "Guest", "Guest", false);
    }

    @Test
    public void test0049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0049");
        com.reservation_system.model.Faculty faculty5 = new com.reservation_system.model.Faculty(10, "data/test-users.csv", "hi!", "", false);
        java.lang.String str6 = faculty5.getUserType();
        java.lang.String str7 = faculty5.getUserType();
        java.lang.String str8 = faculty5.getUserType();
        java.lang.String str9 = faculty5.getUserType();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Faculty" + "'", str6, "Faculty");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Faculty" + "'", str7, "Faculty");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Faculty" + "'", str8, "Faculty");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Faculty" + "'", str9, "Faculty");
    }

    @Test
    public void test0050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0050");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("data/test-users.csv");
        java.util.List<com.reservation_system.model.User> userList2 = userRepository1.getAllUsers();
        com.reservation_system.services.AuthService authService3 = new com.reservation_system.services.AuthService(userRepository1);
        java.util.Optional<com.reservation_system.model.User> userOptional5 = userRepository1.findByEmail("");
        java.util.List<com.reservation_system.model.User> userList6 = userRepository1.getAllUsers();
        boolean boolean8 = userRepository1.emailExists("labmanager");
        com.reservation_system.services.AuthService authService9 = new com.reservation_system.services.AuthService(userRepository1);
        // The following exception was thrown during execution in test generation
        try {
            com.reservation_system.model.User user12 = authService9.login("", "");
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
    public void test0051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0051");
        com.reservation_system.model.Researcher researcher5 = new com.reservation_system.model.Researcher((int) (short) -1, "headlabcoordinator", "student", "", false);
        java.lang.String str6 = researcher5.getUserType();
        boolean boolean7 = researcher5.isApproved();
        java.lang.String str8 = researcher5.getName();
        java.lang.String str9 = researcher5.getUserType();
        researcher5.setApproved(true);
        java.lang.Class<?> wildcardClass12 = researcher5.getClass();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Researcher" + "'", str6, "Researcher");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "headlabcoordinator" + "'", str8, "headlabcoordinator");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Researcher" + "'", str9, "Researcher");
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0052");
        com.reservation_system.model.Faculty faculty5 = new com.reservation_system.model.Faculty((int) (short) 10, "", "", "", true);
    }

    @Test
    public void test0053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0053");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("data/test-users.csv");
        java.util.List<com.reservation_system.model.User> userList2 = userRepository1.getAllUsers();
        com.reservation_system.services.AuthService authService3 = new com.reservation_system.services.AuthService(userRepository1);
        java.util.Optional<com.reservation_system.model.User> userOptional5 = userRepository1.findByEmail("");
        java.util.List<com.reservation_system.model.User> userList6 = userRepository1.getAllUsers();
        boolean boolean8 = userRepository1.emailExists("labmanager");
        com.reservation_system.services.AuthService authService9 = new com.reservation_system.services.AuthService(userRepository1);
        // The following exception was thrown during execution in test generation
        try {
            com.reservation_system.model.User user12 = authService9.login("Password1!", "Faculty");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: No user found with that email.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(userList2);
        org.junit.Assert.assertNotNull(userOptional5);
        org.junit.Assert.assertNotNull(userList6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test0054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0054");
        com.reservation_system.model.Faculty faculty5 = new com.reservation_system.model.Faculty(98, "hi!", "Researcher", "Password1!", false);
    }

    @Test
    public void test0055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0055");
        com.reservation_system.model.HeadLabCoordinator headLabCoordinator5 = new com.reservation_system.model.HeadLabCoordinator(98, "headlabcoordinator", "Andrew", "guest", false);
        java.lang.String str6 = headLabCoordinator5.getUserType();
        int int7 = headLabCoordinator5.getID();
        java.lang.String str8 = headLabCoordinator5.getPassword();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "headlabcoordinator" + "'", str6, "headlabcoordinator");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 98 + "'", int7 == 98);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "guest" + "'", str8, "guest");
    }

    @Test
    public void test0056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0056");
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
        java.lang.Class<?> wildcardClass19 = userRepository1.getClass();
        org.junit.Assert.assertNotNull(userList2);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(userList14);
        org.junit.Assert.assertNotNull(userList15);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test0057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0057");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("data/test-users.csv");
        java.util.List<com.reservation_system.model.User> userList2 = userRepository1.getAllUsers();
        com.reservation_system.services.AuthService authService3 = new com.reservation_system.services.AuthService(userRepository1);
        com.reservation_system.model.LabManager labManager9 = new com.reservation_system.model.LabManager((int) (short) 0, "", "student", "Andrew", true);
        boolean boolean10 = labManager9.isApproved();
        userRepository1.addUser((com.reservation_system.model.User) labManager9);
        boolean boolean13 = userRepository1.emailExists("Researcher");
        java.util.List<com.reservation_system.model.User> userList14 = userRepository1.getAllUsers();
        java.util.List<com.reservation_system.model.User> userList15 = null;
        // The following exception was thrown during execution in test generation
        try {
            userRepository1.saveAllUsers(userList15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.List.iterator()\" because \"users\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(userList2);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(userList14);
    }

    @Test
    public void test0058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0058");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("data/test-users.csv");
        java.util.List<com.reservation_system.model.User> userList2 = userRepository1.getAllUsers();
        boolean boolean3 = userRepository1.headLabCoordinatorExists();
        boolean boolean5 = userRepository1.emailExists("hi!");
        java.util.Optional<com.reservation_system.model.User> userOptional7 = userRepository1.findByEmail("Faculty");
        int int8 = userRepository1.getNextID();
        com.reservation_system.repository.UserRepository userRepository10 = new com.reservation_system.repository.UserRepository("data/test-users.csv");
        java.util.List<com.reservation_system.model.User> userList11 = userRepository10.getAllUsers();
        com.reservation_system.services.AuthService authService12 = new com.reservation_system.services.AuthService(userRepository10);
        java.util.Optional<com.reservation_system.model.User> userOptional14 = userRepository10.findByEmail("");
        java.util.List<com.reservation_system.model.User> userList15 = userRepository10.getAllUsers();
        userRepository1.saveAllUsers(userList15);
        java.lang.Class<?> wildcardClass17 = userRepository1.getClass();
        org.junit.Assert.assertNotNull(userList2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
// flaky "7) test0058(com.reservation_system.Randoop.AuthService.RegressionTest0)":         org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(userOptional7);
// flaky "2) test0058(com.reservation_system.Randoop.AuthService.RegressionTest0)":         org.junit.Assert.assertTrue("'" + int8 + "' != '" + 99 + "'", int8 == 99);
        org.junit.Assert.assertNotNull(userList11);
        org.junit.Assert.assertNotNull(userOptional14);
        org.junit.Assert.assertNotNull(userList15);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test0059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0059");
        // The following exception was thrown during execution in test generation
        try {
            com.reservation_system.model.User user6 = com.reservation_system.patterns.factory.UserFactory.createUser("Password1!", 0, "data/test-users.csv", "data/test-users.csv", "faculty", true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid user type: Password1!");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0060");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("data/test-users.csv");
        java.util.List<com.reservation_system.model.User> userList2 = userRepository1.getAllUsers();
        boolean boolean3 = userRepository1.headLabCoordinatorExists();
        boolean boolean5 = userRepository1.emailExists("hi!");
        java.util.Optional<com.reservation_system.model.User> userOptional7 = userRepository1.findByEmail("Faculty");
        int int8 = userRepository1.getNextID();
        com.reservation_system.repository.UserRepository userRepository10 = new com.reservation_system.repository.UserRepository("data/test-users.csv");
        java.util.List<com.reservation_system.model.User> userList11 = userRepository10.getAllUsers();
        com.reservation_system.services.AuthService authService12 = new com.reservation_system.services.AuthService(userRepository10);
        java.util.Optional<com.reservation_system.model.User> userOptional14 = userRepository10.findByEmail("");
        java.util.List<com.reservation_system.model.User> userList15 = userRepository10.getAllUsers();
        userRepository1.saveAllUsers(userList15);
        boolean boolean18 = userRepository1.emailExists("");
        org.junit.Assert.assertNotNull(userList2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
// flaky "8) test0060(com.reservation_system.Randoop.AuthService.RegressionTest0)":         org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(userOptional7);
// flaky "3) test0060(com.reservation_system.Randoop.AuthService.RegressionTest0)":         org.junit.Assert.assertTrue("'" + int8 + "' != '" + 99 + "'", int8 == 99);
        org.junit.Assert.assertNotNull(userList11);
        org.junit.Assert.assertNotNull(userOptional14);
        org.junit.Assert.assertNotNull(userList15);
// flaky "1) test0060(com.reservation_system.Randoop.AuthService.RegressionTest0)":         org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
    }

    @Test
    public void test0061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0061");
        com.reservation_system.model.User user6 = com.reservation_system.patterns.factory.UserFactory.createUser("guest", (int) '#', "Guest", "hi!", "guest", false);
        org.junit.Assert.assertNotNull(user6);
    }

    @Test
    public void test0062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0062");
        com.reservation_system.model.Guest guest5 = new com.reservation_system.model.Guest((int) (byte) 10, "data/test-users.csv", "test@example.com", "researcher", false);
    }

    @Test
    public void test0063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0063");
        com.reservation_system.model.Guest guest5 = new com.reservation_system.model.Guest((int) (byte) -1, "Student", "faculty", "", false);
        java.lang.String str6 = guest5.getUserType();
        guest5.setApproved(false);
        java.lang.String str9 = guest5.getUserType();
        java.lang.Class<?> wildcardClass10 = guest5.getClass();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Guest" + "'", str6, "Guest");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Guest" + "'", str9, "Guest");
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0064");
        com.reservation_system.model.User user6 = com.reservation_system.patterns.factory.UserFactory.createUser("headlabcoordinator", (int) (short) 10, "Password1!", "headlabcoordinator", "faculty", false);
        org.junit.Assert.assertNotNull(user6);
    }

    @Test
    public void test0065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0065");
        com.reservation_system.model.Researcher researcher5 = new com.reservation_system.model.Researcher((int) (short) -1, "headlabcoordinator", "student", "", false);
        boolean boolean6 = researcher5.isApproved();
        researcher5.setApproved(false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test0066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0066");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("data/test-users.csv");
        java.util.List<com.reservation_system.model.User> userList2 = userRepository1.getAllUsers();
        com.reservation_system.services.AuthService authService3 = new com.reservation_system.services.AuthService(userRepository1);
        int int4 = userRepository1.getNextID();
        com.reservation_system.services.AuthService authService5 = new com.reservation_system.services.AuthService(userRepository1);
        // The following exception was thrown during execution in test generation
        try {
            com.reservation_system.model.User user8 = authService5.login("Researcher", "Andrew");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Incorrect password.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(userList2);
// flaky "9) test0066(com.reservation_system.Randoop.AuthService.RegressionTest0)":         org.junit.Assert.assertTrue("'" + int4 + "' != '" + 99 + "'", int4 == 99);
    }

    @Test
    public void test0067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0067");
        // The following exception was thrown during execution in test generation
        try {
            com.reservation_system.model.User user6 = com.reservation_system.patterns.factory.UserFactory.createUser("test@example.com", (int) (short) -1, "Password1!", "researcher", "Guest", false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid user type: test@example.com");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0068");
        com.reservation_system.model.Researcher researcher5 = new com.reservation_system.model.Researcher((int) (byte) 10, "researcher", "Researcher", "", false);
        boolean boolean6 = researcher5.isApproved();
        java.lang.String str7 = researcher5.getUserType();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Researcher" + "'", str7, "Researcher");
    }

    @Test
    public void test0069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0069");
        com.reservation_system.model.Researcher researcher5 = new com.reservation_system.model.Researcher((int) (short) -1, "headlabcoordinator", "student", "", false);
        boolean boolean6 = researcher5.isApproved();
        java.lang.String str7 = researcher5.getEmail();
        java.lang.String str8 = researcher5.getUserType();
        java.lang.String str9 = researcher5.getUserType();
        java.lang.String str10 = researcher5.getUserType();
        java.lang.String str11 = researcher5.getUserType();
        java.lang.String str12 = researcher5.getUserType();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "student" + "'", str7, "student");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Researcher" + "'", str8, "Researcher");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Researcher" + "'", str9, "Researcher");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Researcher" + "'", str10, "Researcher");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Researcher" + "'", str11, "Researcher");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Researcher" + "'", str12, "Researcher");
    }

    @Test
    public void test0070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0070");
        com.reservation_system.model.Guest guest5 = new com.reservation_system.model.Guest(100, "hi!", "headlabcoordinator", "headlabcoordinator", false);
    }

    @Test
    public void test0071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0071");
        com.reservation_system.model.Student student5 = new com.reservation_system.model.Student((int) (short) -1, "Password1!", "faculty", "faculty", true);
        java.lang.String str6 = student5.getEmail();
        java.lang.String str7 = student5.getUserType();
        java.lang.String str8 = student5.getUserType();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "faculty" + "'", str6, "faculty");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Student" + "'", str7, "Student");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Student" + "'", str8, "Student");
    }

    @Test
    public void test0072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0072");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("data/test-users.csv");
        java.util.List<com.reservation_system.model.User> userList2 = userRepository1.getAllUsers();
        com.reservation_system.services.AuthService authService3 = new com.reservation_system.services.AuthService(userRepository1);
        int int4 = userRepository1.getNextID();
        com.reservation_system.services.AuthService authService5 = new com.reservation_system.services.AuthService(userRepository1);
        // The following exception was thrown during execution in test generation
        try {
            com.reservation_system.model.User user8 = authService5.login("WrongPassword1!", "data/test-users.csv");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: No user found with that email.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(userList2);
// flaky "10) test0072(com.reservation_system.Randoop.AuthService.RegressionTest0)":         org.junit.Assert.assertTrue("'" + int4 + "' != '" + 99 + "'", int4 == 99);
    }

    @Test
    public void test0073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0073");
        // The following exception was thrown during execution in test generation
        try {
            com.reservation_system.model.User user6 = com.reservation_system.patterns.factory.UserFactory.createUser("hi!", 0, "", "faculty", "Student", true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid user type: hi!");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0074");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("data/test-users.csv");
        java.util.List<com.reservation_system.model.User> userList2 = userRepository1.getAllUsers();
        com.reservation_system.services.AuthService authService3 = new com.reservation_system.services.AuthService(userRepository1);
        // The following exception was thrown during execution in test generation
        try {
            com.reservation_system.model.User user6 = authService3.login("Faculty", "data/test-users.csv");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: No user found with that email.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(userList2);
    }

    @Test
    public void test0075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0075");
        com.reservation_system.model.Researcher researcher5 = new com.reservation_system.model.Researcher(10, "student", "WrongPassword1!", "Guest", true);
    }

    @Test
    public void test0076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0076");
        com.reservation_system.model.HeadLabCoordinator headLabCoordinator5 = new com.reservation_system.model.HeadLabCoordinator(1, "faculty", "Faculty", "", true);
        boolean boolean6 = headLabCoordinator5.isApproved();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test0077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0077");
        com.reservation_system.model.Guest guest5 = new com.reservation_system.model.Guest(1, "Researcher", "student", "faculty", true);
    }

    @Test
    public void test0078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0078");
        // The following exception was thrown during execution in test generation
        try {
            com.reservation_system.model.User user6 = com.reservation_system.patterns.factory.UserFactory.createUser("test@example.com", (int) (byte) 1, "", "WrongPassword1!", "", true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid user type: test@example.com");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0079");
        // The following exception was thrown during execution in test generation
        try {
            com.reservation_system.model.User user6 = com.reservation_system.patterns.factory.UserFactory.createUser("test@example.com", (int) (byte) 100, "Guest", "hi!", "test@example.com", false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid user type: test@example.com");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0080");
        com.reservation_system.model.HeadLabCoordinator headLabCoordinator5 = new com.reservation_system.model.HeadLabCoordinator(100, "labmanager", "Andrew", "", false);
    }

    @Test
    public void test0081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0081");
        com.reservation_system.model.Faculty faculty5 = new com.reservation_system.model.Faculty(0, "test@example.com", "Guest", "", false);
    }

    @Test
    public void test0082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0082");
        com.reservation_system.model.LabManager labManager5 = new com.reservation_system.model.LabManager((int) (short) -1, "guest", "Student", "WrongPassword1!", false);
        java.lang.String str6 = labManager5.getUserType();
        boolean boolean7 = labManager5.requiresDepartmentApproval();
        labManager5.setApproved(false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "labmanager" + "'", str6, "labmanager");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test0083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0083");
        com.reservation_system.model.Researcher researcher5 = new com.reservation_system.model.Researcher((int) (short) -1, "Guest", "Andrew", "Student", true);
        int int6 = researcher5.getID();
        java.lang.String str7 = researcher5.getEmail();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Andrew" + "'", str7, "Andrew");
    }

    @Test
    public void test0084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0084");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("data/test-users.csv");
        java.util.List<com.reservation_system.model.User> userList2 = userRepository1.getAllUsers();
        com.reservation_system.services.AuthService authService3 = new com.reservation_system.services.AuthService(userRepository1);
        com.reservation_system.services.AuthService authService4 = new com.reservation_system.services.AuthService(userRepository1);
        boolean boolean5 = userRepository1.headLabCoordinatorExists();
        java.util.Optional<com.reservation_system.model.User> userOptional7 = userRepository1.findByEmail("test@example.com");
        org.junit.Assert.assertNotNull(userList2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(userOptional7);
    }

    @Test
    public void test0085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0085");
        // The following exception was thrown during execution in test generation
        try {
            com.reservation_system.model.User user6 = com.reservation_system.patterns.factory.UserFactory.createUser("Andrew", (-1), "", "Student", "labmanager", false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid user type: Andrew");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0086");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("data/test-users.csv");
        java.util.List<com.reservation_system.model.User> userList2 = userRepository1.getAllUsers();
        boolean boolean3 = userRepository1.headLabCoordinatorExists();
        boolean boolean4 = userRepository1.headLabCoordinatorExists();
        boolean boolean6 = userRepository1.emailExists("Faculty");
        com.reservation_system.model.User user7 = null;
        // The following exception was thrown during execution in test generation
        try {
            userRepository1.addUser(user7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.reservation_system.model.User.getName()\" because \"user\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(userList2);
// flaky "11) test0086(com.reservation_system.Randoop.AuthService.RegressionTest0)":         org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
// flaky "4) test0086(com.reservation_system.Randoop.AuthService.RegressionTest0)":         org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
// flaky "2) test0086(com.reservation_system.Randoop.AuthService.RegressionTest0)":         org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test0087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0087");
        com.reservation_system.model.Guest guest5 = new com.reservation_system.model.Guest((int) (byte) 100, "Password1!", "Guest", "Guest", true);
        java.lang.Class<?> wildcardClass6 = guest5.getClass();
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0088");
        com.reservation_system.model.Faculty faculty5 = new com.reservation_system.model.Faculty(0, "headlabcoordinator", "student", "labmanager", false);
        java.lang.String str6 = faculty5.getName();
        java.lang.String str7 = faculty5.getName();
        java.lang.String str8 = faculty5.getUserType();
        boolean boolean9 = faculty5.requiresDepartmentApproval();
        java.lang.String str10 = faculty5.getUserType();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "headlabcoordinator" + "'", str6, "headlabcoordinator");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "headlabcoordinator" + "'", str7, "headlabcoordinator");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Faculty" + "'", str8, "Faculty");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Faculty" + "'", str10, "Faculty");
    }

    @Test
    public void test0089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0089");
        com.reservation_system.model.Faculty faculty5 = new com.reservation_system.model.Faculty(98, "guest", "Researcher", "student", true);
        boolean boolean6 = faculty5.isApproved();
        java.lang.String str7 = faculty5.getUserType();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Faculty" + "'", str7, "Faculty");
    }

    @Test
    public void test0090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0090");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("data/test-users.csv");
        java.util.List<com.reservation_system.model.User> userList2 = userRepository1.getAllUsers();
        com.reservation_system.services.AuthService authService3 = new com.reservation_system.services.AuthService(userRepository1);
        com.reservation_system.model.LabManager labManager9 = new com.reservation_system.model.LabManager((int) (short) 0, "", "student", "Andrew", true);
        boolean boolean10 = labManager9.isApproved();
        userRepository1.addUser((com.reservation_system.model.User) labManager9);
        boolean boolean13 = userRepository1.emailExists("Researcher");
        java.util.List<com.reservation_system.model.User> userList14 = userRepository1.getAllUsers();
        com.reservation_system.services.AuthService authService15 = new com.reservation_system.services.AuthService(userRepository1);
        // The following exception was thrown during execution in test generation
        try {
            com.reservation_system.model.User user18 = authService15.login("", "Guest");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Email is required.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(userList2);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(userList14);
    }

    @Test
    public void test0091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0091");
        com.reservation_system.model.Guest guest5 = new com.reservation_system.model.Guest((int) (byte) -1, "Student", "faculty", "", false);
        java.lang.String str6 = guest5.getUserType();
        guest5.setApproved(false);
        java.lang.String str9 = guest5.getName();
        java.lang.String str10 = guest5.getUserType();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Guest" + "'", str6, "Guest");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Student" + "'", str9, "Student");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Guest" + "'", str10, "Guest");
    }

    @Test
    public void test0092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0092");
        com.reservation_system.model.LabManager labManager5 = new com.reservation_system.model.LabManager((int) (short) 10, "faculty", "Researcher", "", false);
        int int6 = labManager5.getID();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
    }

    @Test
    public void test0093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0093");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("data/test-users.csv");
        java.util.List<com.reservation_system.model.User> userList2 = userRepository1.getAllUsers();
        java.util.List<com.reservation_system.model.User> userList3 = userRepository1.getAllUsers();
        com.reservation_system.services.AuthService authService4 = new com.reservation_system.services.AuthService(userRepository1);
        java.lang.Class<?> wildcardClass5 = userRepository1.getClass();
        org.junit.Assert.assertNotNull(userList2);
        org.junit.Assert.assertNotNull(userList3);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0094");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("data/test-users.csv");
        java.util.List<com.reservation_system.model.User> userList2 = userRepository1.getAllUsers();
        com.reservation_system.services.AuthService authService3 = new com.reservation_system.services.AuthService(userRepository1);
        com.reservation_system.model.LabManager labManager9 = new com.reservation_system.model.LabManager((int) (short) 0, "", "student", "Andrew", true);
        boolean boolean10 = labManager9.isApproved();
        userRepository1.addUser((com.reservation_system.model.User) labManager9);
        com.reservation_system.model.Faculty faculty17 = new com.reservation_system.model.Faculty((int) '#', "researcher", "", "student", true);
        userRepository1.addUser((com.reservation_system.model.User) faculty17);
        com.reservation_system.services.AuthService authService19 = new com.reservation_system.services.AuthService(userRepository1);
        // The following exception was thrown during execution in test generation
        try {
            com.reservation_system.model.User user22 = authService19.login("researcher", "Researcher");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Incorrect password.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(userList2);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test0095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0095");
        com.reservation_system.model.HeadLabCoordinator headLabCoordinator5 = new com.reservation_system.model.HeadLabCoordinator(10, "researcher", "researcher", "Password1!", false);
        headLabCoordinator5.setApproved(false);
    }

    @Test
    public void test0096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0096");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("data/test-users.csv");
        java.util.List<com.reservation_system.model.User> userList2 = userRepository1.getAllUsers();
        com.reservation_system.repository.UserRepository userRepository4 = new com.reservation_system.repository.UserRepository("data/test-users.csv");
        java.util.List<com.reservation_system.model.User> userList5 = userRepository4.getAllUsers();
        com.reservation_system.services.AuthService authService6 = new com.reservation_system.services.AuthService(userRepository4);
        int int7 = userRepository4.getNextID();
        boolean boolean8 = userRepository4.headLabCoordinatorExists();
        com.reservation_system.repository.UserRepository userRepository10 = new com.reservation_system.repository.UserRepository("data/test-users.csv");
        java.util.List<com.reservation_system.model.User> userList11 = userRepository10.getAllUsers();
        boolean boolean12 = userRepository10.headLabCoordinatorExists();
        boolean boolean13 = userRepository10.headLabCoordinatorExists();
        java.util.List<com.reservation_system.model.User> userList14 = userRepository10.getAllUsers();
        userRepository4.saveAllUsers(userList14);
        userRepository1.saveAllUsers(userList14);
        java.util.List<com.reservation_system.model.User> userList17 = userRepository1.getAllUsers();
        java.lang.Class<?> wildcardClass18 = userRepository1.getClass();
        org.junit.Assert.assertNotNull(userList2);
        org.junit.Assert.assertNotNull(userList5);
// flaky "12) test0096(com.reservation_system.Randoop.AuthService.RegressionTest0)":         org.junit.Assert.assertTrue("'" + int7 + "' != '" + 98 + "'", int7 == 98);
// flaky "5) test0096(com.reservation_system.Randoop.AuthService.RegressionTest0)":         org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(userList11);
// flaky "3) test0096(com.reservation_system.Randoop.AuthService.RegressionTest0)":         org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
// flaky "1) test0096(com.reservation_system.Randoop.AuthService.RegressionTest0)":         org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(userList14);
        org.junit.Assert.assertNotNull(userList17);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test0097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0097");
        // The following exception was thrown during execution in test generation
        try {
            com.reservation_system.model.User user6 = com.reservation_system.patterns.factory.UserFactory.createUser("data/test-users.csv", (-1), "Student", "Researcher", "Faculty", true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid user type: data/test-users.csv");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0098");
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
        java.lang.String str24 = headLabCoordinator20.getUserType();
        org.junit.Assert.assertNotNull(userList2);
        org.junit.Assert.assertNotNull(userList3);
        org.junit.Assert.assertNotNull(userList6);
// flaky "13) test0098(com.reservation_system.Randoop.AuthService.RegressionTest0)":         org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(userList10);
        org.junit.Assert.assertNotNull(userList11);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "headlabcoordinator" + "'", str21, "headlabcoordinator");
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 98 + "'", int22 == 98);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "headlabcoordinator" + "'", str24, "headlabcoordinator");
    }

    @Test
    public void test0099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0099");
        com.reservation_system.model.Faculty faculty5 = new com.reservation_system.model.Faculty((int) (short) 10, "Andrew", "labmanager", "", false);
    }

    @Test
    public void test0100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0100");
        com.reservation_system.model.Guest guest5 = new com.reservation_system.model.Guest((int) '#', "test@example.com", "Password1!", "test@example.com", true);
        java.lang.String str6 = guest5.getName();
        java.lang.String str7 = guest5.getName();
        java.lang.String str8 = guest5.getEmail();
        java.lang.String str9 = guest5.getUserType();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Password1!" + "'", str8, "Password1!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Guest" + "'", str9, "Guest");
    }

    @Test
    public void test0101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0101");
        com.reservation_system.model.Faculty faculty5 = new com.reservation_system.model.Faculty(100, "", "guest", "Andrew", false);
        java.lang.String str6 = faculty5.getUserType();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Faculty" + "'", str6, "Faculty");
    }

    @Test
    public void test0102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0102");
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
        java.lang.Class<?> wildcardClass17 = userOptional16.getClass();
        org.junit.Assert.assertNotNull(userList2);
        org.junit.Assert.assertNotNull(userList3);
        org.junit.Assert.assertNotNull(userList6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(userList10);
        org.junit.Assert.assertNotNull(userList11);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(userOptional16);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test0103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0103");
        com.reservation_system.model.User user6 = com.reservation_system.patterns.factory.UserFactory.createUser("headlabcoordinator", (int) '#', "Researcher", "", "researcher", false);
        org.junit.Assert.assertNotNull(user6);
    }

    @Test
    public void test0104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0104");
        com.reservation_system.model.Researcher researcher5 = new com.reservation_system.model.Researcher((int) (byte) 0, "labmanager", "Andrew", "researcher", true);
        java.lang.String str6 = researcher5.getUserType();
        boolean boolean7 = researcher5.requiresDepartmentApproval();
        researcher5.setApproved(false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Researcher" + "'", str6, "Researcher");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test0105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0105");
        com.reservation_system.model.Faculty faculty5 = new com.reservation_system.model.Faculty(1, "data/test-users.csv", "Password1!", "", false);
    }

    @Test
    public void test0106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0106");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("data/test-users.csv");
        java.util.List<com.reservation_system.model.User> userList2 = userRepository1.getAllUsers();
        boolean boolean3 = userRepository1.headLabCoordinatorExists();
        boolean boolean5 = userRepository1.emailExists("hi!");
        java.util.Optional<com.reservation_system.model.User> userOptional7 = userRepository1.findByEmail("Faculty");
        int int8 = userRepository1.getNextID();
        com.reservation_system.services.AuthService authService9 = new com.reservation_system.services.AuthService(userRepository1);
        // The following exception was thrown during execution in test generation
        try {
            com.reservation_system.model.User user12 = authService9.login("", "data/test-users.csv");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Email is required.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(userList2);
// flaky "14) test0106(com.reservation_system.Randoop.AuthService.RegressionTest0)":         org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
// flaky "6) test0106(com.reservation_system.Randoop.AuthService.RegressionTest0)":         org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(userOptional7);
// flaky "4) test0106(com.reservation_system.Randoop.AuthService.RegressionTest0)":         org.junit.Assert.assertTrue("'" + int8 + "' != '" + 98 + "'", int8 == 98);
    }

    @Test
    public void test0107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0107");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("data/test-users.csv");
        java.util.List<com.reservation_system.model.User> userList2 = userRepository1.getAllUsers();
        com.reservation_system.services.AuthService authService3 = new com.reservation_system.services.AuthService(userRepository1);
        com.reservation_system.model.LabManager labManager9 = new com.reservation_system.model.LabManager((int) (short) 0, "", "student", "Andrew", true);
        boolean boolean10 = labManager9.isApproved();
        userRepository1.addUser((com.reservation_system.model.User) labManager9);
        boolean boolean13 = userRepository1.emailExists("Researcher");
        java.util.List<com.reservation_system.model.User> userList14 = userRepository1.getAllUsers();
        java.util.List<com.reservation_system.model.User> userList15 = userRepository1.getAllUsers();
        java.lang.Class<?> wildcardClass16 = userList15.getClass();
        org.junit.Assert.assertNotNull(userList2);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(userList14);
        org.junit.Assert.assertNotNull(userList15);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test0108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0108");
        com.reservation_system.model.LabManager labManager5 = new com.reservation_system.model.LabManager(0, "student", "data/test-users.csv", "headlabcoordinator", true);
        int int6 = labManager5.getID();
        boolean boolean7 = labManager5.requiresDepartmentApproval();
        boolean boolean8 = labManager5.isApproved();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test0109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0109");
        com.reservation_system.model.Faculty faculty5 = new com.reservation_system.model.Faculty((int) (short) 1, "researcher", "", "Andrew", true);
    }

    @Test
    public void test0110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0110");
        com.reservation_system.model.Faculty faculty5 = new com.reservation_system.model.Faculty(0, "headlabcoordinator", "student", "labmanager", false);
        boolean boolean6 = faculty5.requiresDepartmentApproval();
        java.lang.String str7 = faculty5.getUserType();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Faculty" + "'", str7, "Faculty");
    }

    @Test
    public void test0111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0111");
        com.reservation_system.model.Faculty faculty5 = new com.reservation_system.model.Faculty((int) (byte) 1, "Password1!", "Faculty", "researcher", true);
        java.lang.String str6 = faculty5.getUserType();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Faculty" + "'", str6, "Faculty");
    }

    @Test
    public void test0112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0112");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("data/test-users.csv");
        java.util.List<com.reservation_system.model.User> userList2 = userRepository1.getAllUsers();
        com.reservation_system.services.AuthService authService3 = new com.reservation_system.services.AuthService(userRepository1);
        com.reservation_system.model.LabManager labManager9 = new com.reservation_system.model.LabManager((int) (short) 0, "", "student", "Andrew", true);
        boolean boolean10 = labManager9.isApproved();
        userRepository1.addUser((com.reservation_system.model.User) labManager9);
        com.reservation_system.model.Faculty faculty17 = new com.reservation_system.model.Faculty((int) '#', "researcher", "", "student", true);
        userRepository1.addUser((com.reservation_system.model.User) faculty17);
        boolean boolean19 = faculty17.isApproved();
        java.lang.String str20 = faculty17.getUserType();
        org.junit.Assert.assertNotNull(userList2);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "Faculty" + "'", str20, "Faculty");
    }

    @Test
    public void test0113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0113");
        // The following exception was thrown during execution in test generation
        try {
            com.reservation_system.model.User user6 = com.reservation_system.patterns.factory.UserFactory.createUser("", 10, "student", "Researcher", "", false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid user type: ");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0114");
        com.reservation_system.model.Student student5 = new com.reservation_system.model.Student((int) (short) -1, "Password1!", "Guest", "guest", true);
        int int6 = student5.getID();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
    }

    @Test
    public void test0115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0115");
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
        boolean boolean16 = userRepository1.headLabCoordinatorExists();
        org.junit.Assert.assertNotNull(userList2);
        org.junit.Assert.assertNotNull(userList3);
        org.junit.Assert.assertNotNull(userList6);
// flaky "15) test0115(com.reservation_system.Randoop.AuthService.RegressionTest0)":         org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(userList10);
        org.junit.Assert.assertNotNull(userList11);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
// flaky "7) test0115(com.reservation_system.Randoop.AuthService.RegressionTest0)":         org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test0116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0116");
        com.reservation_system.model.User user6 = com.reservation_system.patterns.factory.UserFactory.createUser("researcher", (int) 'a', "headlabcoordinator", "labmanager", "faculty", true);
        org.junit.Assert.assertNotNull(user6);
    }

    @Test
    public void test0117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0117");
        com.reservation_system.model.Researcher researcher5 = new com.reservation_system.model.Researcher((int) (short) -1, "headlabcoordinator", "student", "", false);
        boolean boolean6 = researcher5.isApproved();
        java.lang.String str7 = researcher5.getEmail();
        java.lang.String str8 = researcher5.getUserType();
        java.lang.String str9 = researcher5.getEmail();
        java.lang.String str10 = researcher5.getName();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "student" + "'", str7, "student");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Researcher" + "'", str8, "Researcher");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "student" + "'", str9, "student");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "headlabcoordinator" + "'", str10, "headlabcoordinator");
    }

    @Test
    public void test0118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0118");
        com.reservation_system.model.Faculty faculty5 = new com.reservation_system.model.Faculty((int) '#', "student", "hi!", "headlabcoordinator", true);
    }

    @Test
    public void test0119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0119");
        com.reservation_system.model.Guest guest5 = new com.reservation_system.model.Guest((int) (byte) 0, "WrongPassword1!", "headlabcoordinator", "WrongPassword1!", false);
    }

    @Test
    public void test0120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0120");
        com.reservation_system.model.Researcher researcher5 = new com.reservation_system.model.Researcher(0, "faculty", "guest", "", false);
    }

    @Test
    public void test0121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0121");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("data/test-users.csv");
        java.util.List<com.reservation_system.model.User> userList2 = userRepository1.getAllUsers();
        com.reservation_system.services.AuthService authService3 = new com.reservation_system.services.AuthService(userRepository1);
        com.reservation_system.model.LabManager labManager9 = new com.reservation_system.model.LabManager((int) (short) 0, "", "student", "Andrew", true);
        boolean boolean10 = labManager9.isApproved();
        userRepository1.addUser((com.reservation_system.model.User) labManager9);
        boolean boolean12 = labManager9.isApproved();
        java.lang.String str13 = labManager9.getUserType();
        org.junit.Assert.assertNotNull(userList2);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "labmanager" + "'", str13, "labmanager");
    }

    @Test
    public void test0122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0122");
        com.reservation_system.model.Faculty faculty5 = new com.reservation_system.model.Faculty(97, "Password1!", "Andrew", "Student", false);
    }

    @Test
    public void test0123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0123");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("data/test-users.csv");
        java.util.List<com.reservation_system.model.User> userList2 = userRepository1.getAllUsers();
        boolean boolean3 = userRepository1.headLabCoordinatorExists();
        boolean boolean5 = userRepository1.emailExists("hi!");
        java.util.Optional<com.reservation_system.model.User> userOptional7 = userRepository1.findByEmail("Faculty");
        int int8 = userRepository1.getNextID();
        com.reservation_system.services.AuthService authService9 = new com.reservation_system.services.AuthService(userRepository1);
        // The following exception was thrown during execution in test generation
        try {
            com.reservation_system.model.User user12 = authService9.login("Andrew", "guest");
// flaky "16) test0123(com.reservation_system.Randoop.AuthService.RegressionTest0)":             org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: No user found with that email.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(userList2);
// flaky "8) test0123(com.reservation_system.Randoop.AuthService.RegressionTest0)":         org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
// flaky "5) test0123(com.reservation_system.Randoop.AuthService.RegressionTest0)":         org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(userOptional7);
// flaky "2) test0123(com.reservation_system.Randoop.AuthService.RegressionTest0)":         org.junit.Assert.assertTrue("'" + int8 + "' != '" + 98 + "'", int8 == 98);
    }

    @Test
    public void test0124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0124");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("data/test-users.csv");
        java.util.List<com.reservation_system.model.User> userList2 = userRepository1.getAllUsers();
        com.reservation_system.services.AuthService authService3 = new com.reservation_system.services.AuthService(userRepository1);
        com.reservation_system.model.LabManager labManager9 = new com.reservation_system.model.LabManager((int) (short) 0, "", "student", "Andrew", true);
        boolean boolean10 = labManager9.isApproved();
        userRepository1.addUser((com.reservation_system.model.User) labManager9);
        com.reservation_system.services.AuthService authService12 = new com.reservation_system.services.AuthService(userRepository1);
        // The following exception was thrown during execution in test generation
        try {
            com.reservation_system.model.User user15 = authService12.login("faculty", "test@example.com");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: No user found with that email.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(userList2);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test0125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0125");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("data/test-users.csv");
        boolean boolean2 = userRepository1.headLabCoordinatorExists();
        boolean boolean3 = userRepository1.headLabCoordinatorExists();
        com.reservation_system.repository.UserRepository userRepository5 = new com.reservation_system.repository.UserRepository("data/test-users.csv");
        java.util.List<com.reservation_system.model.User> userList6 = userRepository5.getAllUsers();
        boolean boolean7 = userRepository5.headLabCoordinatorExists();
        com.reservation_system.model.Faculty faculty13 = new com.reservation_system.model.Faculty((int) 'a', "Faculty", "", "hi!", true);
        java.lang.String str14 = faculty13.getUserType();
        com.reservation_system.model.LabManager labManager20 = new com.reservation_system.model.LabManager((int) 'a', "Faculty", "", "", false);
        java.lang.String str21 = labManager20.getEmail();
        com.reservation_system.model.Researcher researcher27 = new com.reservation_system.model.Researcher((int) (short) -1, "headlabcoordinator", "student", "", false);
        boolean boolean28 = researcher27.isApproved();
        com.reservation_system.model.Faculty faculty34 = new com.reservation_system.model.Faculty((int) (short) 0, "Faculty", "headlabcoordinator", "", true);
        com.reservation_system.model.LabManager labManager40 = new com.reservation_system.model.LabManager((int) 'a', "Faculty", "", "", false);
        java.lang.String str41 = labManager40.getEmail();
        com.reservation_system.model.Faculty faculty47 = new com.reservation_system.model.Faculty(0, "headlabcoordinator", "student", "labmanager", false);
        java.lang.String str48 = faculty47.getName();
        java.lang.String str49 = faculty47.getName();
        com.reservation_system.model.LabManager labManager55 = new com.reservation_system.model.LabManager((int) 'a', "Faculty", "", "", false);
        java.lang.String str56 = labManager55.getEmail();
        com.reservation_system.model.Faculty faculty62 = new com.reservation_system.model.Faculty(10, "data/test-users.csv", "hi!", "", false);
        com.reservation_system.model.Faculty faculty68 = new com.reservation_system.model.Faculty(0, "headlabcoordinator", "student", "labmanager", false);
        java.lang.String str69 = faculty68.getName();
        java.lang.String str70 = faculty68.getName();
        java.lang.String str71 = faculty68.getName();
        com.reservation_system.model.Researcher researcher77 = new com.reservation_system.model.Researcher((int) (short) -1, "researcher", "test@example.com", "Faculty", true);
        boolean boolean78 = researcher77.requiresDepartmentApproval();
        com.reservation_system.model.Faculty faculty84 = new com.reservation_system.model.Faculty((int) 'a', "Faculty", "", "hi!", true);
        com.reservation_system.model.User[] userArray85 = new com.reservation_system.model.User[] { faculty13, labManager20, researcher27, faculty34, labManager40, faculty47, labManager55, faculty62, faculty68, researcher77, faculty84 };
        java.util.ArrayList<com.reservation_system.model.User> userList86 = new java.util.ArrayList<com.reservation_system.model.User>();
        boolean boolean87 = java.util.Collections.addAll((java.util.Collection<com.reservation_system.model.User>) userList86, userArray85);
        userRepository5.saveAllUsers((java.util.List<com.reservation_system.model.User>) userList86);
        int int89 = userRepository5.getNextID();
        java.util.List<com.reservation_system.model.User> userList90 = userRepository5.getAllUsers();
        userRepository1.saveAllUsers(userList90);
        java.lang.Class<?> wildcardClass92 = userRepository1.getClass();
// flaky "17) test0125(com.reservation_system.Randoop.AuthService.RegressionTest0)":         org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
// flaky "9) test0125(com.reservation_system.Randoop.AuthService.RegressionTest0)":         org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(userList6);
// flaky "6) test0125(com.reservation_system.Randoop.AuthService.RegressionTest0)":         org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Faculty" + "'", str14, "Faculty");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "" + "'", str41, "");
        org.junit.Assert.assertEquals("'" + str48 + "' != '" + "headlabcoordinator" + "'", str48, "headlabcoordinator");
        org.junit.Assert.assertEquals("'" + str49 + "' != '" + "headlabcoordinator" + "'", str49, "headlabcoordinator");
        org.junit.Assert.assertEquals("'" + str56 + "' != '" + "" + "'", str56, "");
        org.junit.Assert.assertEquals("'" + str69 + "' != '" + "headlabcoordinator" + "'", str69, "headlabcoordinator");
        org.junit.Assert.assertEquals("'" + str70 + "' != '" + "headlabcoordinator" + "'", str70, "headlabcoordinator");
        org.junit.Assert.assertEquals("'" + str71 + "' != '" + "headlabcoordinator" + "'", str71, "headlabcoordinator");
        org.junit.Assert.assertTrue("'" + boolean78 + "' != '" + true + "'", boolean78 == true);
        org.junit.Assert.assertNotNull(userArray85);
        org.junit.Assert.assertTrue("'" + boolean87 + "' != '" + true + "'", boolean87 == true);
        org.junit.Assert.assertTrue("'" + int89 + "' != '" + 98 + "'", int89 == 98);
        org.junit.Assert.assertNotNull(userList90);
        org.junit.Assert.assertNotNull(wildcardClass92);
    }

    @Test
    public void test0126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0126");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("data/test-users.csv");
        java.util.List<com.reservation_system.model.User> userList2 = userRepository1.getAllUsers();
        com.reservation_system.services.AuthService authService3 = new com.reservation_system.services.AuthService(userRepository1);
        com.reservation_system.services.AuthService authService4 = new com.reservation_system.services.AuthService(userRepository1);
        // The following exception was thrown during execution in test generation
        try {
            com.reservation_system.model.User user7 = authService4.login("Andrew", "Student");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: No user found with that email.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(userList2);
    }

    @Test
    public void test0127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0127");
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
        headLabCoordinator20.setApproved(true);
        org.junit.Assert.assertNotNull(userList2);
        org.junit.Assert.assertNotNull(userList3);
        org.junit.Assert.assertNotNull(userList6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(userList10);
        org.junit.Assert.assertNotNull(userList11);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "headlabcoordinator" + "'", str21, "headlabcoordinator");
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 98 + "'", int22 == 98);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "headlabcoordinator" + "'", str24, "headlabcoordinator");
    }

    @Test
    public void test0128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0128");
        com.reservation_system.model.Researcher researcher5 = new com.reservation_system.model.Researcher(1, "", "Guest", "Researcher", true);
    }

    @Test
    public void test0129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0129");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("data/test-users.csv");
        java.util.List<com.reservation_system.model.User> userList2 = userRepository1.getAllUsers();
        java.util.List<com.reservation_system.model.User> userList3 = userRepository1.getAllUsers();
        com.reservation_system.services.AuthService authService4 = new com.reservation_system.services.AuthService(userRepository1);
        java.util.Optional<com.reservation_system.model.User> userOptional6 = userRepository1.findByEmail("faculty");
        com.reservation_system.services.AuthService authService7 = new com.reservation_system.services.AuthService(userRepository1);
        // The following exception was thrown during execution in test generation
        try {
            com.reservation_system.model.User user10 = authService7.login("WrongPassword1!", "test@example.com");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: No user found with that email.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(userList2);
        org.junit.Assert.assertNotNull(userList3);
        org.junit.Assert.assertNotNull(userOptional6);
    }

    @Test
    public void test0130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0130");
        // The following exception was thrown during execution in test generation
        try {
            com.reservation_system.model.User user6 = com.reservation_system.patterns.factory.UserFactory.createUser("WrongPassword1!", (int) (short) 100, "headlabcoordinator", "", "hi!", false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid user type: WrongPassword1!");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0131");
        com.reservation_system.model.Student student5 = new com.reservation_system.model.Student((int) (short) -1, "Password1!", "Guest", "guest", true);
        java.lang.String str6 = student5.getUserType();
        java.lang.String str7 = student5.getName();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Student" + "'", str6, "Student");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Password1!" + "'", str7, "Password1!");
    }

    @Test
    public void test0132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0132");
        com.reservation_system.model.Faculty faculty5 = new com.reservation_system.model.Faculty(100, "", "Guest", "Password1!", true);
        faculty5.setApproved(false);
    }

    @Test
    public void test0133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0133");
        com.reservation_system.model.Researcher researcher5 = new com.reservation_system.model.Researcher((int) (short) -1, "headlabcoordinator", "student", "", false);
        java.lang.String str6 = researcher5.getUserType();
        boolean boolean7 = researcher5.isApproved();
        java.lang.String str8 = researcher5.getName();
        java.lang.String str9 = researcher5.getUserType();
        boolean boolean10 = researcher5.requiresDepartmentApproval();
        java.lang.String str11 = researcher5.getPassword();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Researcher" + "'", str6, "Researcher");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "headlabcoordinator" + "'", str8, "headlabcoordinator");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Researcher" + "'", str9, "Researcher");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
    }

    @Test
    public void test0134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0134");
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
        // The following exception was thrown during execution in test generation
        try {
            com.reservation_system.model.User user17 = authService14.login("", "guest");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Email is required.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(userList2);
        org.junit.Assert.assertNotNull(userList3);
        org.junit.Assert.assertNotNull(userList6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(userList10);
        org.junit.Assert.assertNotNull(userList11);
    }

    @Test
    public void test0135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0135");
        com.reservation_system.model.HeadLabCoordinator headLabCoordinator5 = new com.reservation_system.model.HeadLabCoordinator((int) (short) 100, "Andrew", "test@example.com", "Student", true);
    }

    @Test
    public void test0136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0136");
        com.reservation_system.model.HeadLabCoordinator headLabCoordinator5 = new com.reservation_system.model.HeadLabCoordinator((int) (short) 100, "faculty", "labmanager", "WrongPassword1!", true);
    }

    @Test
    public void test0137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0137");
        com.reservation_system.model.Faculty faculty5 = new com.reservation_system.model.Faculty((int) 'a', "Faculty", "", "hi!", true);
        java.lang.String str6 = faculty5.getUserType();
        boolean boolean7 = faculty5.isApproved();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Faculty" + "'", str6, "Faculty");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test0138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0138");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("data/test-users.csv");
        java.util.List<com.reservation_system.model.User> userList2 = userRepository1.getAllUsers();
        com.reservation_system.services.AuthService authService3 = new com.reservation_system.services.AuthService(userRepository1);
        com.reservation_system.services.AuthService authService4 = new com.reservation_system.services.AuthService(userRepository1);
        boolean boolean5 = userRepository1.headLabCoordinatorExists();
        com.reservation_system.services.AuthService authService6 = new com.reservation_system.services.AuthService(userRepository1);
        // The following exception was thrown during execution in test generation
        try {
            com.reservation_system.model.User user9 = authService6.login("hi!", "");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Password is required.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(userList2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
    }

    @Test
    public void test0139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0139");
        com.reservation_system.model.Faculty faculty5 = new com.reservation_system.model.Faculty((int) (short) 1, "Researcher", "Andrew", "headlabcoordinator", true);
        boolean boolean6 = faculty5.requiresDepartmentApproval();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test0140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0140");
        com.reservation_system.model.Faculty faculty5 = new com.reservation_system.model.Faculty((int) (byte) 1, "researcher", "faculty", "hi!", false);
        java.lang.String str6 = faculty5.getPassword();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
    }

    @Test
    public void test0141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0141");
        com.reservation_system.model.Researcher researcher5 = new com.reservation_system.model.Researcher((int) (short) -1, "headlabcoordinator", "student", "", false);
        researcher5.setApproved(false);
        int int8 = researcher5.getID();
        java.lang.Class<?> wildcardClass9 = researcher5.getClass();
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0142");
        com.reservation_system.model.Researcher researcher5 = new com.reservation_system.model.Researcher(99, "test@example.com", "student", "guest", false);
        java.lang.String str6 = researcher5.getUserType();
        java.lang.String str7 = researcher5.getName();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Researcher" + "'", str6, "Researcher");
    }

    @Test
    public void test0143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0143");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("data/test-users.csv");
        java.util.List<com.reservation_system.model.User> userList2 = userRepository1.getAllUsers();
        com.reservation_system.services.AuthService authService3 = new com.reservation_system.services.AuthService(userRepository1);
        int int4 = userRepository1.getNextID();
        com.reservation_system.services.AuthService authService5 = new com.reservation_system.services.AuthService(userRepository1);
        // The following exception was thrown during execution in test generation
        try {
            com.reservation_system.model.User user8 = authService5.login("hi!", "headlabcoordinator");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Incorrect password.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(userList2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 99 + "'", int4 == 99);
    }

    @Test
    public void test0144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0144");
        com.reservation_system.model.LabManager labManager5 = new com.reservation_system.model.LabManager((int) (short) 1, "Andrew", "Researcher", "Andrew", false);
    }

    @Test
    public void test0145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0145");
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
        java.lang.Class<?> wildcardClass19 = userRepository1.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test0146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0146");
        com.reservation_system.model.Researcher researcher5 = new com.reservation_system.model.Researcher((int) (short) -1, "headlabcoordinator", "student", "", false);
        java.lang.String str6 = researcher5.getUserType();
        boolean boolean7 = researcher5.isApproved();
        java.lang.String str8 = researcher5.getName();
        java.lang.String str9 = researcher5.getUserType();
        researcher5.setApproved(true);
        java.lang.String str12 = researcher5.getUserType();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Researcher" + "'", str6, "Researcher");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "headlabcoordinator" + "'", str8, "headlabcoordinator");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Researcher" + "'", str9, "Researcher");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Researcher" + "'", str12, "Researcher");
    }

    @Test
    public void test0147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0147");
        com.reservation_system.model.HeadLabCoordinator headLabCoordinator5 = new com.reservation_system.model.HeadLabCoordinator((int) (short) 0, "WrongPassword1!", "headlabcoordinator", "WrongPassword1!", false);
        java.lang.Class<?> wildcardClass6 = headLabCoordinator5.getClass();
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0148");
        com.reservation_system.model.Faculty faculty5 = new com.reservation_system.model.Faculty((int) '#', "researcher", "", "student", true);
        java.lang.String str6 = faculty5.getUserType();
        java.lang.String str7 = faculty5.getPassword();
        java.lang.String str8 = faculty5.getUserType();
        java.lang.String str9 = faculty5.getUserType();
        java.lang.String str10 = faculty5.getUserType();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Faculty" + "'", str6, "Faculty");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "student" + "'", str7, "student");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Faculty" + "'", str8, "Faculty");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Faculty" + "'", str9, "Faculty");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Faculty" + "'", str10, "Faculty");
    }

    @Test
    public void test0149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0149");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("data/test-users.csv");
        java.util.List<com.reservation_system.model.User> userList2 = userRepository1.getAllUsers();
        java.util.List<com.reservation_system.model.User> userList3 = userRepository1.getAllUsers();
        com.reservation_system.model.Faculty faculty9 = new com.reservation_system.model.Faculty(10, "data/test-users.csv", "hi!", "", false);
        java.lang.String str10 = faculty9.getUserType();
        userRepository1.addUser((com.reservation_system.model.User) faculty9);
        java.util.Optional<com.reservation_system.model.User> userOptional13 = userRepository1.findByEmail("Student");
        boolean boolean14 = userRepository1.headLabCoordinatorExists();
        int int15 = userRepository1.getNextID();
        org.junit.Assert.assertNotNull(userList2);
        org.junit.Assert.assertNotNull(userList3);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Faculty" + "'", str10, "Faculty");
        org.junit.Assert.assertNotNull(userOptional13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 99 + "'", int15 == 99);
    }

    @Test
    public void test0150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0150");
        com.reservation_system.model.Student student5 = new com.reservation_system.model.Student((int) ' ', "guest", "guest", "student", true);
    }

    @Test
    public void test0151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0151");
        com.reservation_system.model.Student student5 = new com.reservation_system.model.Student(0, "student", "Andrew", "guest", false);
        java.lang.String str6 = student5.getUserType();
        java.lang.String str7 = student5.getUserType();
        java.lang.String str8 = student5.getUserType();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Student" + "'", str6, "Student");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Student" + "'", str7, "Student");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Student" + "'", str8, "Student");
    }

    @Test
    public void test0152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0152");
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
        com.reservation_system.model.Researcher researcher27 = new com.reservation_system.model.Researcher((int) (byte) 0, "labmanager", "Andrew", "researcher", true);
        boolean boolean28 = researcher27.requiresDepartmentApproval();
        userRepository1.addUser((com.reservation_system.model.User) researcher27);
        org.junit.Assert.assertNotNull(userList2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 99 + "'", int4 == 99);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(userList8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(userList11);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
    }

    @Test
    public void test0153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0153");
        com.reservation_system.model.Student student5 = new com.reservation_system.model.Student(35, "Guest", "WrongPassword1!", "labmanager", false);
        java.lang.String str6 = student5.getUserType();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Student" + "'", str6, "Student");
    }

    @Test
    public void test0154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0154");
        com.reservation_system.model.Researcher researcher5 = new com.reservation_system.model.Researcher((int) (short) -1, "researcher", "test@example.com", "Faculty", true);
        java.lang.String str6 = researcher5.getUserType();
        boolean boolean7 = researcher5.requiresDepartmentApproval();
        int int8 = researcher5.getID();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Researcher" + "'", str6, "Researcher");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
    }

    @Test
    public void test0155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0155");
        com.reservation_system.model.LabManager labManager5 = new com.reservation_system.model.LabManager(0, "", "student", "Student", true);
    }

    @Test
    public void test0156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0156");
        com.reservation_system.model.Researcher researcher5 = new com.reservation_system.model.Researcher((int) ' ', "Student", "Password1!", "Password1!", false);
        researcher5.setApproved(false);
    }

    @Test
    public void test0157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0157");
        com.reservation_system.model.Guest guest5 = new com.reservation_system.model.Guest((int) '#', "test@example.com", "Password1!", "test@example.com", true);
        guest5.setApproved(true);
        java.lang.String str8 = guest5.getUserType();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Guest" + "'", str8, "Guest");
    }

    @Test
    public void test0158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0158");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("data/test-users.csv");
        java.util.List<com.reservation_system.model.User> userList2 = userRepository1.getAllUsers();
        com.reservation_system.services.AuthService authService3 = new com.reservation_system.services.AuthService(userRepository1);
        java.util.Optional<com.reservation_system.model.User> userOptional5 = userRepository1.findByEmail("");
        java.util.List<com.reservation_system.model.User> userList6 = userRepository1.getAllUsers();
        boolean boolean8 = userRepository1.emailExists("Andrew");
        com.reservation_system.services.AuthService authService9 = new com.reservation_system.services.AuthService(userRepository1);
        // The following exception was thrown during execution in test generation
        try {
            com.reservation_system.model.User user12 = authService9.login("Student", "Student");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Incorrect password.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(userList2);
        org.junit.Assert.assertNotNull(userOptional5);
        org.junit.Assert.assertNotNull(userList6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test0159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0159");
        com.reservation_system.model.User user6 = com.reservation_system.patterns.factory.UserFactory.createUser("Faculty", (int) (short) 1, "", "Guest", "", false);
        user6.setApproved(true);
        org.junit.Assert.assertNotNull(user6);
    }

    @Test
    public void test0160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0160");
        com.reservation_system.model.Researcher researcher5 = new com.reservation_system.model.Researcher(100, "Password1!", "WrongPassword1!", "headlabcoordinator", false);
        java.lang.String str6 = researcher5.getUserType();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Researcher" + "'", str6, "Researcher");
    }

    @Test
    public void test0161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0161");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("data/test-users.csv");
        java.util.List<com.reservation_system.model.User> userList2 = userRepository1.getAllUsers();
        boolean boolean4 = userRepository1.emailExists("Researcher");
        boolean boolean6 = userRepository1.emailExists("Andrew");
        org.junit.Assert.assertNotNull(userList2);
// flaky "18) test0161(com.reservation_system.Randoop.AuthService.RegressionTest0)":         org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test0162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0162");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("data/test-users.csv");
        java.util.List<com.reservation_system.model.User> userList2 = userRepository1.getAllUsers();
        com.reservation_system.services.AuthService authService3 = new com.reservation_system.services.AuthService(userRepository1);
        com.reservation_system.services.AuthService authService4 = new com.reservation_system.services.AuthService(userRepository1);
        com.reservation_system.services.AuthService authService5 = new com.reservation_system.services.AuthService(userRepository1);
        java.util.List<com.reservation_system.model.User> userList6 = userRepository1.getAllUsers();
        boolean boolean8 = userRepository1.emailExists("faculty");
        org.junit.Assert.assertNotNull(userList2);
        org.junit.Assert.assertNotNull(userList6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test0163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0163");
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
        java.lang.String str24 = headLabCoordinator20.getEmail();
        org.junit.Assert.assertNotNull(userList2);
        org.junit.Assert.assertNotNull(userList3);
        org.junit.Assert.assertNotNull(userList6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(userList10);
        org.junit.Assert.assertNotNull(userList11);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "headlabcoordinator" + "'", str21, "headlabcoordinator");
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 98 + "'", int22 == 98);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "Andrew" + "'", str24, "Andrew");
    }

    @Test
    public void test0164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0164");
        com.reservation_system.model.LabManager labManager5 = new com.reservation_system.model.LabManager(0, "student", "data/test-users.csv", "headlabcoordinator", true);
        int int6 = labManager5.getID();
        java.lang.String str7 = labManager5.getUserType();
        labManager5.setApproved(false);
        boolean boolean10 = labManager5.isApproved();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "labmanager" + "'", str7, "labmanager");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test0165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0165");
        // The following exception was thrown during execution in test generation
        try {
            com.reservation_system.model.User user6 = com.reservation_system.patterns.factory.UserFactory.createUser("", (-1), "Guest", "Andrew", "Researcher", false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid user type: ");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0166");
        com.reservation_system.model.HeadLabCoordinator headLabCoordinator5 = new com.reservation_system.model.HeadLabCoordinator(10, "headlabcoordinator", "data/test-users.csv", "faculty", false);
        java.lang.String str6 = headLabCoordinator5.getEmail();
        java.lang.String str7 = headLabCoordinator5.getUserType();
        java.lang.Class<?> wildcardClass8 = headLabCoordinator5.getClass();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "data/test-users.csv" + "'", str6, "data/test-users.csv");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "headlabcoordinator" + "'", str7, "headlabcoordinator");
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0167");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("data/test-users.csv");
        boolean boolean2 = userRepository1.headLabCoordinatorExists();
        com.reservation_system.model.Faculty faculty8 = new com.reservation_system.model.Faculty(0, "headlabcoordinator", "student", "labmanager", false);
        userRepository1.addUser((com.reservation_system.model.User) faculty8);
        java.lang.String str10 = faculty8.getName();
        faculty8.setApproved(false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "headlabcoordinator" + "'", str10, "headlabcoordinator");
    }

    @Test
    public void test0168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0168");
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
        java.util.List<com.reservation_system.model.User> userList16 = userRepository1.getAllUsers();
        boolean boolean18 = userRepository1.emailExists("hi!");
        org.junit.Assert.assertNotNull(userList2);
        org.junit.Assert.assertNotNull(userList3);
        org.junit.Assert.assertNotNull(userList6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(userList10);
        org.junit.Assert.assertNotNull(userList11);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(userList15);
        org.junit.Assert.assertNotNull(userList16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
    }

    @Test
    public void test0169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0169");
        com.reservation_system.model.Researcher researcher5 = new com.reservation_system.model.Researcher((-1), "Student", "researcher", "Andrew", false);
        java.lang.String str6 = researcher5.getUserType();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Researcher" + "'", str6, "Researcher");
    }

    @Test
    public void test0170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0170");
        com.reservation_system.model.Researcher researcher5 = new com.reservation_system.model.Researcher(0, "headlabcoordinator", "Student", "student", true);
        java.lang.String str6 = researcher5.getUserType();
        boolean boolean7 = researcher5.requiresDepartmentApproval();
        java.lang.String str8 = researcher5.getName();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Researcher" + "'", str6, "Researcher");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "headlabcoordinator" + "'", str8, "headlabcoordinator");
    }

    @Test
    public void test0171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0171");
        com.reservation_system.model.Researcher researcher5 = new com.reservation_system.model.Researcher((int) (short) -1, "headlabcoordinator", "student", "", false);
        java.lang.String str6 = researcher5.getUserType();
        boolean boolean7 = researcher5.isApproved();
        java.lang.String str8 = researcher5.getEmail();
        java.lang.String str9 = researcher5.getUserType();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Researcher" + "'", str6, "Researcher");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "student" + "'", str8, "student");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Researcher" + "'", str9, "Researcher");
    }

    @Test
    public void test0172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0172");
        com.reservation_system.model.Guest guest5 = new com.reservation_system.model.Guest(1, "Guest", "Password1!", "Password1!", true);
        boolean boolean6 = guest5.isApproved();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test0173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0173");
        com.reservation_system.model.Faculty faculty5 = new com.reservation_system.model.Faculty(0, "headlabcoordinator", "student", "labmanager", false);
        java.lang.String str6 = faculty5.getName();
        java.lang.String str7 = faculty5.getName();
        java.lang.String str8 = faculty5.getName();
        java.lang.String str9 = faculty5.getUserType();
        java.lang.String str10 = faculty5.getUserType();
        java.lang.String str11 = faculty5.getPassword();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "headlabcoordinator" + "'", str6, "headlabcoordinator");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "headlabcoordinator" + "'", str7, "headlabcoordinator");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "headlabcoordinator" + "'", str8, "headlabcoordinator");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Faculty" + "'", str9, "Faculty");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Faculty" + "'", str10, "Faculty");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "labmanager" + "'", str11, "labmanager");
    }

    @Test
    public void test0174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0174");
        com.reservation_system.model.Researcher researcher5 = new com.reservation_system.model.Researcher(52, "Researcher", "test@example.com", "Andrew", false);
    }

    @Test
    public void test0175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0175");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("data/test-users.csv");
        boolean boolean2 = userRepository1.headLabCoordinatorExists();
        int int3 = userRepository1.getNextID();
        java.util.List<com.reservation_system.model.User> userList4 = userRepository1.getAllUsers();
        boolean boolean6 = userRepository1.emailExists("Password1!");
// flaky "19) test0175(com.reservation_system.Randoop.AuthService.RegressionTest0)":         org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
// flaky "10) test0175(com.reservation_system.Randoop.AuthService.RegressionTest0)":         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 98 + "'", int3 == 98);
        org.junit.Assert.assertNotNull(userList4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test0176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0176");
        com.reservation_system.model.Student student5 = new com.reservation_system.model.Student((int) (short) 0, "labmanager", "Student", "Student", false);
    }

    @Test
    public void test0177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0177");
        // The following exception was thrown during execution in test generation
        try {
            com.reservation_system.model.User user6 = com.reservation_system.patterns.factory.UserFactory.createUser("Andrew", (int) (short) 100, "", "Password1!", "student", false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid user type: Andrew");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0178");
        com.reservation_system.model.Researcher researcher5 = new com.reservation_system.model.Researcher(0, "headlabcoordinator", "", "test@example.com", false);
        java.lang.String str6 = researcher5.getUserType();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Researcher" + "'", str6, "Researcher");
    }

    @Test
    public void test0179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0179");
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
        // The following exception was thrown during execution in test generation
        try {
            com.reservation_system.model.User user17 = authService14.login("labmanager", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: No user found with that email.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(userList2);
        org.junit.Assert.assertNotNull(userList3);
        org.junit.Assert.assertNotNull(userList6);
// flaky "20) test0179(com.reservation_system.Randoop.AuthService.RegressionTest0)":         org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(userList10);
        org.junit.Assert.assertNotNull(userList11);
    }

    @Test
    public void test0180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0180");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("data/test-users.csv");
        java.util.List<com.reservation_system.model.User> userList2 = userRepository1.getAllUsers();
        com.reservation_system.services.AuthService authService3 = new com.reservation_system.services.AuthService(userRepository1);
        com.reservation_system.services.AuthService authService4 = new com.reservation_system.services.AuthService(userRepository1);
        boolean boolean5 = userRepository1.headLabCoordinatorExists();
        java.util.List<com.reservation_system.model.User> userList6 = userRepository1.getAllUsers();
        com.reservation_system.services.AuthService authService7 = new com.reservation_system.services.AuthService(userRepository1);
        // The following exception was thrown during execution in test generation
        try {
            com.reservation_system.model.User user10 = authService7.login("Student", "faculty");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Incorrect password.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(userList2);
// flaky "21) test0180(com.reservation_system.Randoop.AuthService.RegressionTest0)":         org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(userList6);
    }

    @Test
    public void test0181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0181");
        com.reservation_system.model.HeadLabCoordinator headLabCoordinator5 = new com.reservation_system.model.HeadLabCoordinator(10, "data/test-users.csv", "labmanager", "", false);
    }

    @Test
    public void test0182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0182");
        com.reservation_system.model.Researcher researcher5 = new com.reservation_system.model.Researcher((int) (short) -1, "headlabcoordinator", "student", "", false);
        java.lang.String str6 = researcher5.getUserType();
        boolean boolean7 = researcher5.isApproved();
        java.lang.String str8 = researcher5.getUserType();
        java.lang.String str9 = researcher5.getUserType();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Researcher" + "'", str6, "Researcher");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Researcher" + "'", str8, "Researcher");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Researcher" + "'", str9, "Researcher");
    }

    @Test
    public void test0183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0183");
        com.reservation_system.model.HeadLabCoordinator headLabCoordinator5 = new com.reservation_system.model.HeadLabCoordinator(98, "test@example.com", "Student", "", false);
        java.lang.String str6 = headLabCoordinator5.getEmail();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Student" + "'", str6, "Student");
    }

    @Test
    public void test0184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0184");
        com.reservation_system.model.Guest guest5 = new com.reservation_system.model.Guest((int) '#', "test@example.com", "Password1!", "test@example.com", true);
        java.lang.String str6 = guest5.getName();
        java.lang.String str7 = guest5.getName();
        java.lang.String str8 = guest5.getUserType();
        java.lang.String str9 = guest5.getUserType();
        java.lang.String str10 = guest5.getUserType();
        java.lang.String str11 = guest5.getUserType();
        java.lang.String str12 = guest5.getPassword();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Guest" + "'", str8, "Guest");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Guest" + "'", str9, "Guest");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Guest" + "'", str10, "Guest");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Guest" + "'", str11, "Guest");
    }

    @Test
    public void test0185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0185");
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
        java.util.Optional<com.reservation_system.model.User> userOptional23 = userRepository1.findByEmail("Guest");
        org.junit.Assert.assertNotNull(userList2);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(userOptional23);
    }

    @Test
    public void test0186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0186");
        com.reservation_system.model.Faculty faculty5 = new com.reservation_system.model.Faculty(0, "headlabcoordinator", "student", "labmanager", false);
        java.lang.String str6 = faculty5.getName();
        boolean boolean7 = faculty5.isApproved();
        java.lang.Class<?> wildcardClass8 = faculty5.getClass();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "headlabcoordinator" + "'", str6, "headlabcoordinator");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0187");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("data/test-users.csv");
        java.util.List<com.reservation_system.model.User> userList2 = userRepository1.getAllUsers();
        com.reservation_system.services.AuthService authService3 = new com.reservation_system.services.AuthService(userRepository1);
        com.reservation_system.services.AuthService authService4 = new com.reservation_system.services.AuthService(userRepository1);
        com.reservation_system.services.AuthService authService5 = new com.reservation_system.services.AuthService(userRepository1);
        int int6 = userRepository1.getNextID();
        int int7 = userRepository1.getNextID();
        boolean boolean8 = userRepository1.headLabCoordinatorExists();
        org.junit.Assert.assertNotNull(userList2);
// flaky "22) test0187(com.reservation_system.Randoop.AuthService.RegressionTest0)":         org.junit.Assert.assertTrue("'" + int6 + "' != '" + 98 + "'", int6 == 98);
// flaky "11) test0187(com.reservation_system.Randoop.AuthService.RegressionTest0)":         org.junit.Assert.assertTrue("'" + int7 + "' != '" + 98 + "'", int7 == 98);
// flaky "7) test0187(com.reservation_system.Randoop.AuthService.RegressionTest0)":         org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test0188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0188");
        com.reservation_system.model.Guest guest5 = new com.reservation_system.model.Guest((int) '#', "test@example.com", "Password1!", "test@example.com", true);
        java.lang.String str6 = guest5.getEmail();
        java.lang.String str7 = guest5.getName();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Password1!" + "'", str6, "Password1!");
    }

    @Test
    public void test0189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0189");
        com.reservation_system.model.Faculty faculty5 = new com.reservation_system.model.Faculty((int) (byte) 1, "Student", "student", "data/test-users.csv", false);
    }

    @Test
    public void test0190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0190");
        com.reservation_system.model.Guest guest5 = new com.reservation_system.model.Guest((int) (byte) -1, "Student", "faculty", "", false);
        java.lang.String str6 = guest5.getUserType();
        java.lang.String str7 = guest5.getUserType();
        java.lang.String str8 = guest5.getName();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Guest" + "'", str6, "Guest");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Guest" + "'", str7, "Guest");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Student" + "'", str8, "Student");
    }

    @Test
    public void test0191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0191");
        com.reservation_system.model.HeadLabCoordinator headLabCoordinator5 = new com.reservation_system.model.HeadLabCoordinator((int) '4', "faculty", "student", "WrongPassword1!", true);
        java.lang.String str6 = headLabCoordinator5.getPassword();
        java.lang.String str7 = headLabCoordinator5.getUserType();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "WrongPassword1!" + "'", str6, "WrongPassword1!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "headlabcoordinator" + "'", str7, "headlabcoordinator");
    }

    @Test
    public void test0192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0192");
        com.reservation_system.model.HeadLabCoordinator headLabCoordinator5 = new com.reservation_system.model.HeadLabCoordinator(0, "researcher", "", "labmanager", true);
    }

    @Test
    public void test0193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0193");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("data/test-users.csv");
        java.util.List<com.reservation_system.model.User> userList2 = userRepository1.getAllUsers();
        com.reservation_system.services.AuthService authService3 = new com.reservation_system.services.AuthService(userRepository1);
        int int4 = userRepository1.getNextID();
        com.reservation_system.services.AuthService authService5 = new com.reservation_system.services.AuthService(userRepository1);
        // The following exception was thrown during execution in test generation
        try {
            com.reservation_system.model.User user8 = authService5.login("", "headlabcoordinator");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Email is required.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(userList2);
// flaky "23) test0193(com.reservation_system.Randoop.AuthService.RegressionTest0)":         org.junit.Assert.assertTrue("'" + int4 + "' != '" + 98 + "'", int4 == 98);
    }

    @Test
    public void test0194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0194");
        com.reservation_system.model.Guest guest5 = new com.reservation_system.model.Guest((-1), "student", "Guest", "test@example.com", false);
    }

    @Test
    public void test0195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0195");
        // The following exception was thrown during execution in test generation
        try {
            com.reservation_system.model.User user6 = com.reservation_system.patterns.factory.UserFactory.createUser("test@example.com", (-1), "Researcher", "WrongPassword1!", "labmanager", false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid user type: test@example.com");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0196");
        com.reservation_system.model.Student student5 = new com.reservation_system.model.Student((int) (byte) -1, "faculty", "WrongPassword1!", "student", false);
        java.lang.String str6 = student5.getUserType();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Student" + "'", str6, "Student");
    }

    @Test
    public void test0197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0197");
        com.reservation_system.model.Guest guest5 = new com.reservation_system.model.Guest(1, "guest", "Password1!", "Guest", false);
    }

    @Test
    public void test0198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0198");
        com.reservation_system.model.Student student5 = new com.reservation_system.model.Student((int) '#', "Faculty", "", "", false);
        java.lang.String str6 = student5.getUserType();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Student" + "'", str6, "Student");
    }

    @Test
    public void test0199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0199");
        com.reservation_system.model.HeadLabCoordinator headLabCoordinator5 = new com.reservation_system.model.HeadLabCoordinator((int) ' ', "guest", "Student", "test@example.com", false);
    }

    @Test
    public void test0200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0200");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("data/test-users.csv");
        boolean boolean2 = userRepository1.headLabCoordinatorExists();
        int int3 = userRepository1.getNextID();
        int int4 = userRepository1.getNextID();
        com.reservation_system.services.AuthService authService5 = new com.reservation_system.services.AuthService(userRepository1);
        // The following exception was thrown during execution in test generation
        try {
            com.reservation_system.model.User user8 = authService5.login("labmanager", "headlabcoordinator");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: No user found with that email.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
// flaky "24) test0200(com.reservation_system.Randoop.AuthService.RegressionTest0)":         org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
// flaky "12) test0200(com.reservation_system.Randoop.AuthService.RegressionTest0)":         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 98 + "'", int3 == 98);
// flaky "8) test0200(com.reservation_system.Randoop.AuthService.RegressionTest0)":         org.junit.Assert.assertTrue("'" + int4 + "' != '" + 98 + "'", int4 == 98);
    }

    @Test
    public void test0201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0201");
        com.reservation_system.model.Guest guest5 = new com.reservation_system.model.Guest((int) (byte) 0, "Guest", "data/test-users.csv", "hi!", false);
    }

    @Test
    public void test0202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0202");
        com.reservation_system.model.Student student5 = new com.reservation_system.model.Student(0, "student", "Andrew", "guest", false);
        java.lang.String str6 = student5.getUserType();
        boolean boolean7 = student5.isApproved();
        boolean boolean8 = student5.requiresDepartmentApproval();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Student" + "'", str6, "Student");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test0203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0203");
        com.reservation_system.model.Faculty faculty5 = new com.reservation_system.model.Faculty(10, "data/test-users.csv", "hi!", "", false);
        java.lang.String str6 = faculty5.getUserType();
        java.lang.String str7 = faculty5.getUserType();
        java.lang.String str8 = faculty5.getUserType();
        boolean boolean9 = faculty5.requiresDepartmentApproval();
        boolean boolean10 = faculty5.isApproved();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Faculty" + "'", str6, "Faculty");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Faculty" + "'", str7, "Faculty");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Faculty" + "'", str8, "Faculty");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test0204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0204");
        com.reservation_system.model.Researcher researcher5 = new com.reservation_system.model.Researcher((int) (byte) 10, "data/test-users.csv", "faculty", "", true);
        java.lang.String str6 = researcher5.getUserType();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Researcher" + "'", str6, "Researcher");
    }

    @Test
    public void test0205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0205");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("data/test-users.csv");
        java.util.List<com.reservation_system.model.User> userList2 = userRepository1.getAllUsers();
        com.reservation_system.services.AuthService authService3 = new com.reservation_system.services.AuthService(userRepository1);
        com.reservation_system.model.LabManager labManager9 = new com.reservation_system.model.LabManager((int) (short) 0, "", "student", "Andrew", true);
        boolean boolean10 = labManager9.isApproved();
        userRepository1.addUser((com.reservation_system.model.User) labManager9);
        com.reservation_system.model.Faculty faculty17 = new com.reservation_system.model.Faculty((int) '#', "researcher", "", "student", true);
        userRepository1.addUser((com.reservation_system.model.User) faculty17);
        com.reservation_system.services.AuthService authService19 = new com.reservation_system.services.AuthService(userRepository1);
        // The following exception was thrown during execution in test generation
        try {
            com.reservation_system.model.User user22 = authService19.login("Password1!", "data/test-users.csv");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: No user found with that email.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(userList2);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test0206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0206");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("data/test-users.csv");
        java.util.List<com.reservation_system.model.User> userList2 = userRepository1.getAllUsers();
        com.reservation_system.services.AuthService authService3 = new com.reservation_system.services.AuthService(userRepository1);
        com.reservation_system.model.LabManager labManager9 = new com.reservation_system.model.LabManager((int) (short) 0, "", "student", "Andrew", true);
        boolean boolean10 = labManager9.isApproved();
        userRepository1.addUser((com.reservation_system.model.User) labManager9);
        com.reservation_system.model.Faculty faculty17 = new com.reservation_system.model.Faculty((int) '#', "researcher", "", "student", true);
        userRepository1.addUser((com.reservation_system.model.User) faculty17);
        com.reservation_system.services.AuthService authService19 = new com.reservation_system.services.AuthService(userRepository1);
        // The following exception was thrown during execution in test generation
        try {
            com.reservation_system.model.User user22 = authService19.login("researcher", "Password1!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: No user found with that email.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(userList2);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test0207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0207");
        com.reservation_system.model.Faculty faculty5 = new com.reservation_system.model.Faculty((int) (byte) 0, "guest", "WrongPassword1!", "Andrew", true);
        java.lang.String str6 = faculty5.getUserType();
        java.lang.String str7 = faculty5.getEmail();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Faculty" + "'", str6, "Faculty");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "WrongPassword1!" + "'", str7, "WrongPassword1!");
    }

    @Test
    public void test0208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0208");
        com.reservation_system.model.Researcher researcher5 = new com.reservation_system.model.Researcher((int) ' ', "Student", "Password1!", "Password1!", false);
        java.lang.String str6 = researcher5.getUserType();
        researcher5.setApproved(true);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Researcher" + "'", str6, "Researcher");
    }

    @Test
    public void test0209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0209");
        com.reservation_system.model.Researcher researcher5 = new com.reservation_system.model.Researcher((int) 'a', "WrongPassword1!", "guest", "Faculty", true);
    }

    @Test
    public void test0210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0210");
        com.reservation_system.model.LabManager labManager5 = new com.reservation_system.model.LabManager((int) '#', "Researcher", "", "guest", false);
        int int6 = labManager5.getID();
        boolean boolean7 = labManager5.isApproved();
        java.lang.String str8 = labManager5.getUserType();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 35 + "'", int6 == 35);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "labmanager" + "'", str8, "labmanager");
    }

    @Test
    public void test0211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0211");
        com.reservation_system.model.User user6 = com.reservation_system.patterns.factory.UserFactory.createUser("researcher", (int) (byte) -1, "Researcher", "", "Andrew", false);
        boolean boolean7 = user6.isApproved();
        org.junit.Assert.assertNotNull(user6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test0212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0212");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("data/test-users.csv");
        java.util.List<com.reservation_system.model.User> userList2 = userRepository1.getAllUsers();
        java.util.List<com.reservation_system.model.User> userList3 = userRepository1.getAllUsers();
        com.reservation_system.services.AuthService authService4 = new com.reservation_system.services.AuthService(userRepository1);
        java.util.Optional<com.reservation_system.model.User> userOptional6 = userRepository1.findByEmail("faculty");
        com.reservation_system.services.AuthService authService7 = new com.reservation_system.services.AuthService(userRepository1);
        java.util.List<com.reservation_system.model.User> userList8 = userRepository1.getAllUsers();
        com.reservation_system.services.AuthService authService9 = new com.reservation_system.services.AuthService(userRepository1);
        // The following exception was thrown during execution in test generation
        try {
            com.reservation_system.model.User user12 = authService9.login("Researcher", "Guest");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: No user found with that email.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(userList2);
        org.junit.Assert.assertNotNull(userList3);
        org.junit.Assert.assertNotNull(userOptional6);
        org.junit.Assert.assertNotNull(userList8);
    }

    @Test
    public void test0213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0213");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("data/test-users.csv");
        java.util.Optional<com.reservation_system.model.User> userOptional3 = userRepository1.findByEmail("Password1!");
        int int4 = userRepository1.getNextID();
        org.junit.Assert.assertNotNull(userOptional3);
// flaky "25) test0213(com.reservation_system.Randoop.AuthService.RegressionTest0)":         org.junit.Assert.assertTrue("'" + int4 + "' != '" + 98 + "'", int4 == 98);
    }

    @Test
    public void test0214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0214");
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
        com.reservation_system.model.User user13 = null;
        // The following exception was thrown during execution in test generation
        try {
            userRepository1.addUser(user13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.reservation_system.model.User.getName()\" because \"user\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(userList2);
// flaky "26) test0214(com.reservation_system.Randoop.AuthService.RegressionTest0)":         org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
// flaky "13) test0214(com.reservation_system.Randoop.AuthService.RegressionTest0)":         org.junit.Assert.assertTrue("'" + int9 + "' != '" + 98 + "'", int9 == 98);
        org.junit.Assert.assertNotNull(userList10);
        org.junit.Assert.assertNotNull(userList12);
    }

    @Test
    public void test0215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0215");
        com.reservation_system.model.Faculty faculty5 = new com.reservation_system.model.Faculty((int) (short) 0, "Faculty", "headlabcoordinator", "", true);
        java.lang.String str6 = faculty5.getUserType();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Faculty" + "'", str6, "Faculty");
    }

    @Test
    public void test0216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0216");
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
        java.util.Optional<com.reservation_system.model.User> userOptional17 = userRepository1.findByEmail("data/test-users.csv");
        com.reservation_system.model.HeadLabCoordinator headLabCoordinator23 = new com.reservation_system.model.HeadLabCoordinator(98, "headlabcoordinator", "Andrew", "guest", false);
        java.lang.String str24 = headLabCoordinator23.getUserType();
        java.lang.String str25 = headLabCoordinator23.getEmail();
        boolean boolean26 = headLabCoordinator23.isApproved();
        headLabCoordinator23.setApproved(true);
        userRepository1.addUser((com.reservation_system.model.User) headLabCoordinator23);
        org.junit.Assert.assertNotNull(userList2);
        org.junit.Assert.assertNotNull(userList3);
        org.junit.Assert.assertNotNull(userList6);
// flaky "27) test0216(com.reservation_system.Randoop.AuthService.RegressionTest0)":         org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(userList10);
        org.junit.Assert.assertNotNull(userList11);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(userOptional17);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "headlabcoordinator" + "'", str24, "headlabcoordinator");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "Andrew" + "'", str25, "Andrew");
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
    }

    @Test
    public void test0217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0217");
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
        boolean boolean15 = userRepository1.emailExists("Researcher");
        java.util.List<com.reservation_system.model.User> userList16 = userRepository1.getAllUsers();
        com.reservation_system.model.User user17 = null;
        // The following exception was thrown during execution in test generation
        try {
            userRepository1.addUser(user17);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.reservation_system.model.User.getName()\" because \"user\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(userList2);
        org.junit.Assert.assertNotNull(userList3);
        org.junit.Assert.assertNotNull(userList6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(userList10);
        org.junit.Assert.assertNotNull(userList11);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(userList16);
    }

    @Test
    public void test0218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0218");
        com.reservation_system.model.HeadLabCoordinator headLabCoordinator5 = new com.reservation_system.model.HeadLabCoordinator((int) '4', "faculty", "student", "WrongPassword1!", true);
        boolean boolean6 = headLabCoordinator5.isApproved();
        java.lang.String str7 = headLabCoordinator5.getName();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "faculty" + "'", str7, "faculty");
    }

    @Test
    public void test0219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0219");
        com.reservation_system.model.Guest guest5 = new com.reservation_system.model.Guest((int) '#', "WrongPassword1!", "test@example.com", "data/test-users.csv", false);
        boolean boolean6 = guest5.isApproved();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test0220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0220");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("data/test-users.csv");
        java.util.List<com.reservation_system.model.User> userList2 = userRepository1.getAllUsers();
        com.reservation_system.services.AuthService authService3 = new com.reservation_system.services.AuthService(userRepository1);
        com.reservation_system.services.AuthService authService4 = new com.reservation_system.services.AuthService(userRepository1);
        // The following exception was thrown during execution in test generation
        try {
            com.reservation_system.model.User user7 = authService4.login("", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Email is required.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(userList2);
    }

    @Test
    public void test0221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0221");
        com.reservation_system.model.Student student5 = new com.reservation_system.model.Student((int) (byte) 0, "data/test-users.csv", "", "student", false);
        student5.setApproved(false);
        java.lang.String str8 = student5.getUserType();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Student" + "'", str8, "Student");
    }

    @Test
    public void test0222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0222");
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
        boolean boolean30 = researcher27.requiresDepartmentApproval();
        org.junit.Assert.assertNotNull(userList2);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
// flaky "28) test0222(com.reservation_system.Randoop.AuthService.RegressionTest0)":         org.junit.Assert.assertTrue("'" + int19 + "' != '" + 98 + "'", int19 == 98);
// flaky "14) test0222(com.reservation_system.Randoop.AuthService.RegressionTest0)":         org.junit.Assert.assertTrue("'" + int20 + "' != '" + 98 + "'", int20 == 98);
        org.junit.Assert.assertNotNull(userList21);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "Researcher" + "'", str28, "Researcher");
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
    }

    @Test
    public void test0223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0223");
        com.reservation_system.model.Faculty faculty5 = new com.reservation_system.model.Faculty(1, "Researcher", "hi!", "faculty", false);
        java.lang.String str6 = faculty5.getUserType();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Faculty" + "'", str6, "Faculty");
    }

    @Test
    public void test0224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0224");
        com.reservation_system.model.Student student5 = new com.reservation_system.model.Student(0, "student", "Andrew", "guest", false);
        java.lang.String str6 = student5.getPassword();
        boolean boolean7 = student5.requiresDepartmentApproval();
        int int8 = student5.getID();
        java.lang.String str9 = student5.getUserType();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "guest" + "'", str6, "guest");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Student" + "'", str9, "Student");
    }

    @Test
    public void test0225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0225");
        com.reservation_system.model.Researcher researcher5 = new com.reservation_system.model.Researcher((int) '#', "Researcher", "researcher", "headlabcoordinator", true);
        boolean boolean6 = researcher5.requiresDepartmentApproval();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test0226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0226");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("data/test-users.csv");
        java.util.List<com.reservation_system.model.User> userList2 = userRepository1.getAllUsers();
        java.util.List<com.reservation_system.model.User> userList3 = userRepository1.getAllUsers();
        com.reservation_system.services.AuthService authService4 = new com.reservation_system.services.AuthService(userRepository1);
        java.util.Optional<com.reservation_system.model.User> userOptional6 = userRepository1.findByEmail("faculty");
        com.reservation_system.services.AuthService authService7 = new com.reservation_system.services.AuthService(userRepository1);
        boolean boolean9 = userRepository1.emailExists("researcher");
        boolean boolean11 = userRepository1.emailExists("Password1!");
        org.junit.Assert.assertNotNull(userList2);
        org.junit.Assert.assertNotNull(userList3);
        org.junit.Assert.assertNotNull(userOptional6);
// flaky "29) test0226(com.reservation_system.Randoop.AuthService.RegressionTest0)":         org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test0227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0227");
        com.reservation_system.model.Researcher researcher5 = new com.reservation_system.model.Researcher((-1), "Guest", "data/test-users.csv", "", true);
        java.lang.Class<?> wildcardClass6 = researcher5.getClass();
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0228");
        com.reservation_system.model.Student student5 = new com.reservation_system.model.Student((int) (byte) 0, "data/test-users.csv", "", "student", false);
        java.lang.Class<?> wildcardClass6 = student5.getClass();
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0229");
        // The following exception was thrown during execution in test generation
        try {
            com.reservation_system.model.User user6 = com.reservation_system.patterns.factory.UserFactory.createUser("", (int) 'a', "headlabcoordinator", "Researcher", "Password1!", false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid user type: ");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0230");
        com.reservation_system.model.Guest guest5 = new com.reservation_system.model.Guest((int) '#', "faculty", "Researcher", "Guest", false);
        java.lang.String str6 = guest5.getPassword();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Guest" + "'", str6, "Guest");
    }

    @Test
    public void test0231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0231");
        com.reservation_system.model.Faculty faculty5 = new com.reservation_system.model.Faculty((int) (byte) 1, "researcher", "faculty", "hi!", false);
        java.lang.Class<?> wildcardClass6 = faculty5.getClass();
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0232");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("data/test-users.csv");
        java.util.List<com.reservation_system.model.User> userList2 = userRepository1.getAllUsers();
        com.reservation_system.services.AuthService authService3 = new com.reservation_system.services.AuthService(userRepository1);
        com.reservation_system.model.LabManager labManager9 = new com.reservation_system.model.LabManager((int) (short) 0, "", "student", "Andrew", true);
        boolean boolean10 = labManager9.isApproved();
        userRepository1.addUser((com.reservation_system.model.User) labManager9);
        boolean boolean12 = labManager9.isApproved();
        labManager9.setApproved(true);
        java.lang.String str15 = labManager9.getUserType();
        org.junit.Assert.assertNotNull(userList2);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "labmanager" + "'", str15, "labmanager");
    }

    @Test
    public void test0233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0233");
        com.reservation_system.model.Student student5 = new com.reservation_system.model.Student((int) (short) 10, "Student", "researcher", "Guest", true);
        java.lang.String str6 = student5.getEmail();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "researcher" + "'", str6, "researcher");
    }

    @Test
    public void test0234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0234");
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
        boolean boolean86 = userRepository1.headLabCoordinatorExists();
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
        org.junit.Assert.assertTrue("'" + boolean86 + "' != '" + false + "'", boolean86 == false);
    }

    @Test
    public void test0235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0235");
        com.reservation_system.model.Student student5 = new com.reservation_system.model.Student(1, "Researcher", "Andrew", "labmanager", false);
        java.lang.String str6 = student5.getUserType();
        java.lang.String str7 = student5.getUserType();
        java.lang.String str8 = student5.getUserType();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Student" + "'", str6, "Student");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Student" + "'", str7, "Student");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Student" + "'", str8, "Student");
    }

    @Test
    public void test0236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0236");
        com.reservation_system.model.Faculty faculty5 = new com.reservation_system.model.Faculty(10, "data/test-users.csv", "hi!", "", false);
        boolean boolean6 = faculty5.isApproved();
        java.lang.String str7 = faculty5.getUserType();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Faculty" + "'", str7, "Faculty");
    }

    @Test
    public void test0237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0237");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("data/test-users.csv");
        java.util.List<com.reservation_system.model.User> userList2 = userRepository1.getAllUsers();
        boolean boolean3 = userRepository1.headLabCoordinatorExists();
        com.reservation_system.services.AuthService authService4 = new com.reservation_system.services.AuthService(userRepository1);
        int int5 = userRepository1.getNextID();
        java.util.Optional<com.reservation_system.model.User> userOptional7 = userRepository1.findByEmail("Guest");
        org.junit.Assert.assertNotNull(userList2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 98 + "'", int5 == 98);
        org.junit.Assert.assertNotNull(userOptional7);
    }

    @Test
    public void test0238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0238");
        com.reservation_system.model.Student student5 = new com.reservation_system.model.Student(97, "headlabcoordinator", "test@example.com", "faculty", false);
    }

    @Test
    public void test0239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0239");
        // The following exception was thrown during execution in test generation
        try {
            com.reservation_system.model.User user6 = com.reservation_system.patterns.factory.UserFactory.createUser("data/test-users.csv", (-1), "Faculty", "faculty", "data/test-users.csv", false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid user type: data/test-users.csv");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0240");
        com.reservation_system.model.Faculty faculty5 = new com.reservation_system.model.Faculty((int) (short) 100, "", "labmanager", "labmanager", true);
        java.lang.String str6 = faculty5.getUserType();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Faculty" + "'", str6, "Faculty");
    }

    @Test
    public void test0241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0241");
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
        int int21 = userRepository1.getNextID();
        org.junit.Assert.assertNotNull(userList2);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
// flaky "30) test0241(com.reservation_system.Randoop.AuthService.RegressionTest0)":         org.junit.Assert.assertTrue("'" + int19 + "' != '" + 101 + "'", int19 == 101);
// flaky "15) test0241(com.reservation_system.Randoop.AuthService.RegressionTest0)":         org.junit.Assert.assertTrue("'" + int20 + "' != '" + 101 + "'", int20 == 101);
// flaky "9) test0241(com.reservation_system.Randoop.AuthService.RegressionTest0)":         org.junit.Assert.assertTrue("'" + int21 + "' != '" + 101 + "'", int21 == 101);
    }

    @Test
    public void test0242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0242");
        com.reservation_system.model.Faculty faculty5 = new com.reservation_system.model.Faculty((int) (short) 100, "data/test-users.csv", "", "test@example.com", false);
        int int6 = faculty5.getID();
        java.lang.String str7 = faculty5.getUserType();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Faculty" + "'", str7, "Faculty");
    }

    @Test
    public void test0243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0243");
        com.reservation_system.model.Student student5 = new com.reservation_system.model.Student((int) (short) -1, "Password1!", "Guest", "guest", true);
        java.lang.String str6 = student5.getUserType();
        java.lang.String str7 = student5.getUserType();
        java.lang.String str8 = student5.getUserType();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Student" + "'", str6, "Student");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Student" + "'", str7, "Student");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Student" + "'", str8, "Student");
    }

    @Test
    public void test0244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0244");
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
        java.lang.Class<?> wildcardClass96 = authService95.getClass();
        org.junit.Assert.assertNotNull(userList2);
// flaky "31) test0244(com.reservation_system.Randoop.AuthService.RegressionTest0)":         org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
// flaky "16) test0244(com.reservation_system.Randoop.AuthService.RegressionTest0)":         org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
// flaky "10) test0244(com.reservation_system.Randoop.AuthService.RegressionTest0)":         org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(userList8);
// flaky "3) test0244(com.reservation_system.Randoop.AuthService.RegressionTest0)":         org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
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
        org.junit.Assert.assertNotNull(wildcardClass96);
    }

    @Test
    public void test0245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0245");
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
        com.reservation_system.model.Researcher researcher27 = new com.reservation_system.model.Researcher((int) (short) -1, "researcher", "test@example.com", "Faculty", true);
        java.lang.String str28 = researcher27.getUserType();
        boolean boolean29 = researcher27.requiresDepartmentApproval();
        java.lang.String str30 = researcher27.getUserType();
        userRepository1.addUser((com.reservation_system.model.User) researcher27);
        int int32 = researcher27.getID();
        org.junit.Assert.assertNotNull(userList2);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 98 + "'", int19 == 98);
        org.junit.Assert.assertNotNull(userOptional21);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "Researcher" + "'", str28, "Researcher");
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "Researcher" + "'", str30, "Researcher");
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + (-1) + "'", int32 == (-1));
    }

    @Test
    public void test0246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0246");
        com.reservation_system.model.Student student5 = new com.reservation_system.model.Student((int) ' ', "Faculty", "guest", "headlabcoordinator", false);
    }

    @Test
    public void test0247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0247");
        com.reservation_system.model.Researcher researcher5 = new com.reservation_system.model.Researcher((int) (short) -1, "headlabcoordinator", "student", "", false);
        boolean boolean6 = researcher5.isApproved();
        java.lang.String str7 = researcher5.getEmail();
        java.lang.String str8 = researcher5.getPassword();
        java.lang.String str9 = researcher5.getUserType();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "student" + "'", str7, "student");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Researcher" + "'", str9, "Researcher");
    }

    @Test
    public void test0248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0248");
        com.reservation_system.model.Student student5 = new com.reservation_system.model.Student((int) ' ', "student", "Researcher", "faculty", false);
        boolean boolean6 = student5.requiresDepartmentApproval();
        java.lang.String str7 = student5.getEmail();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Researcher" + "'", str7, "Researcher");
    }

    @Test
    public void test0249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0249");
        com.reservation_system.model.User user6 = com.reservation_system.patterns.factory.UserFactory.createUser("labmanager", (int) (byte) -1, "headlabcoordinator", "test@example.com", "student", false);
        org.junit.Assert.assertNotNull(user6);
    }

    @Test
    public void test0250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0250");
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
        java.lang.String str19 = researcher14.getUserType();
        org.junit.Assert.assertNotNull(userList2);
        org.junit.Assert.assertNotNull(userOptional5);
        org.junit.Assert.assertNotNull(userList6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "student" + "'", str16, "student");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "Researcher" + "'", str17, "Researcher");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "Researcher" + "'", str19, "Researcher");
    }

    @Test
    public void test0251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0251");
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
        java.lang.Class<?> wildcardClass16 = userList14.getClass();
        org.junit.Assert.assertNotNull(userList2);
// flaky "32) test0251(com.reservation_system.Randoop.AuthService.RegressionTest0)":         org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(userList6);
        org.junit.Assert.assertNotNull(userList7);
        org.junit.Assert.assertNotNull(userList11);
// flaky "17) test0251(com.reservation_system.Randoop.AuthService.RegressionTest0)":         org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
// flaky "11) test0251(com.reservation_system.Randoop.AuthService.RegressionTest0)":         org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(userList14);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test0252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0252");
        com.reservation_system.model.Faculty faculty5 = new com.reservation_system.model.Faculty(10, "data/test-users.csv", "hi!", "", false);
        java.lang.String str6 = faculty5.getUserType();
        java.lang.String str7 = faculty5.getUserType();
        boolean boolean8 = faculty5.requiresDepartmentApproval();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Faculty" + "'", str6, "Faculty");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Faculty" + "'", str7, "Faculty");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test0253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0253");
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
        // The following exception was thrown during execution in test generation
        try {
            com.reservation_system.model.User user17 = authService14.login("student", "researcher");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Incorrect password.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(userList2);
        org.junit.Assert.assertNotNull(userList3);
        org.junit.Assert.assertNotNull(userList6);
// flaky "33) test0253(com.reservation_system.Randoop.AuthService.RegressionTest0)":         org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(userList10);
        org.junit.Assert.assertNotNull(userList11);
    }

    @Test
    public void test0254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0254");
        com.reservation_system.model.Guest guest5 = new com.reservation_system.model.Guest(0, "data/test-users.csv", "WrongPassword1!", "labmanager", true);
    }

    @Test
    public void test0255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0255");
        com.reservation_system.model.HeadLabCoordinator headLabCoordinator5 = new com.reservation_system.model.HeadLabCoordinator((int) (short) -1, "Andrew", "Faculty", "WrongPassword1!", true);
        boolean boolean6 = headLabCoordinator5.isApproved();
        java.lang.String str7 = headLabCoordinator5.getUserType();
        java.lang.String str8 = headLabCoordinator5.getEmail();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "headlabcoordinator" + "'", str7, "headlabcoordinator");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Faculty" + "'", str8, "Faculty");
    }

    @Test
    public void test0256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0256");
        com.reservation_system.model.User user6 = com.reservation_system.patterns.factory.UserFactory.createUser("Researcher", (int) (byte) 100, "guest", "Researcher", "test@example.com", false);
        boolean boolean7 = user6.requiresDepartmentApproval();
        org.junit.Assert.assertNotNull(user6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test0257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0257");
        com.reservation_system.model.HeadLabCoordinator headLabCoordinator5 = new com.reservation_system.model.HeadLabCoordinator((int) '#', "Student", "test@example.com", "Andrew", true);
        headLabCoordinator5.setApproved(true);
    }

    @Test
    public void test0258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0258");
        // The following exception was thrown during execution in test generation
        try {
            com.reservation_system.model.User user6 = com.reservation_system.patterns.factory.UserFactory.createUser("", (int) '#', "", "", "data/test-users.csv", true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid user type: ");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0259");
        com.reservation_system.model.Student student5 = new com.reservation_system.model.Student(0, "", "headlabcoordinator", "Password1!", true);
    }

    @Test
    public void test0260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0260");
        com.reservation_system.model.HeadLabCoordinator headLabCoordinator5 = new com.reservation_system.model.HeadLabCoordinator((int) '4', "faculty", "student", "WrongPassword1!", true);
        java.lang.String str6 = headLabCoordinator5.getPassword();
        java.lang.Class<?> wildcardClass7 = headLabCoordinator5.getClass();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "WrongPassword1!" + "'", str6, "WrongPassword1!");
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0261");
        com.reservation_system.model.Faculty faculty5 = new com.reservation_system.model.Faculty((int) (short) 10, "hi!", "test@example.com", "", false);
    }

    @Test
    public void test0262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0262");
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
        com.reservation_system.model.User user96 = null;
        // The following exception was thrown during execution in test generation
        try {
            userRepository1.addUser(user96);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.reservation_system.model.User.getName()\" because \"user\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(userList2);
// flaky "34) test0262(com.reservation_system.Randoop.AuthService.RegressionTest0)":         org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
// flaky "18) test0262(com.reservation_system.Randoop.AuthService.RegressionTest0)":         org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
// flaky "12) test0262(com.reservation_system.Randoop.AuthService.RegressionTest0)":         org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(userList8);
// flaky "4) test0262(com.reservation_system.Randoop.AuthService.RegressionTest0)":         org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
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
    public void test0263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0263");
        com.reservation_system.model.Guest guest5 = new com.reservation_system.model.Guest((int) '4', "Researcher", "faculty", "Andrew", true);
        java.lang.String str6 = guest5.getUserType();
        java.lang.Class<?> wildcardClass7 = guest5.getClass();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Guest" + "'", str6, "Guest");
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0264");
        com.reservation_system.model.Faculty faculty5 = new com.reservation_system.model.Faculty((int) (short) 100, "WrongPassword1!", "student", "student", false);
    }

    @Test
    public void test0265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0265");
        com.reservation_system.model.Faculty faculty5 = new com.reservation_system.model.Faculty((int) 'a', "Faculty", "", "hi!", true);
        java.lang.String str6 = faculty5.getUserType();
        java.lang.String str7 = faculty5.getPassword();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Faculty" + "'", str6, "Faculty");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
    }

    @Test
    public void test0266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0266");
        com.reservation_system.model.Guest guest5 = new com.reservation_system.model.Guest((int) '#', "test@example.com", "Password1!", "test@example.com", true);
        java.lang.String str6 = guest5.getName();
        java.lang.String str7 = guest5.getName();
        java.lang.String str8 = guest5.getEmail();
        guest5.setApproved(true);
        java.lang.String str11 = guest5.getUserType();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Password1!" + "'", str8, "Password1!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Guest" + "'", str11, "Guest");
    }

    @Test
    public void test0267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0267");
        com.reservation_system.model.Researcher researcher5 = new com.reservation_system.model.Researcher((int) (short) 1, "data/test-users.csv", "Student", "", true);
    }

    @Test
    public void test0268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0268");
        com.reservation_system.model.Guest guest5 = new com.reservation_system.model.Guest((int) (byte) -1, "Student", "faculty", "", false);
        java.lang.String str6 = guest5.getUserType();
        guest5.setApproved(false);
        java.lang.String str9 = guest5.getName();
        int int10 = guest5.getID();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Guest" + "'", str6, "Guest");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Student" + "'", str9, "Student");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
    }

    @Test
    public void test0269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0269");
        com.reservation_system.model.Faculty faculty5 = new com.reservation_system.model.Faculty((int) ' ', "WrongPassword1!", "hi!", "hi!", false);
    }

    @Test
    public void test0270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0270");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("data/test-users.csv");
        java.util.List<com.reservation_system.model.User> userList2 = userRepository1.getAllUsers();
        com.reservation_system.services.AuthService authService3 = new com.reservation_system.services.AuthService(userRepository1);
        int int4 = userRepository1.getNextID();
        com.reservation_system.services.AuthService authService5 = new com.reservation_system.services.AuthService(userRepository1);
        com.reservation_system.services.AuthService authService6 = new com.reservation_system.services.AuthService(userRepository1);
        java.lang.Class<?> wildcardClass7 = authService6.getClass();
        org.junit.Assert.assertNotNull(userList2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 98 + "'", int4 == 98);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0271");
        com.reservation_system.model.Guest guest5 = new com.reservation_system.model.Guest((int) '#', "test@example.com", "Password1!", "test@example.com", true);
        java.lang.String str6 = guest5.getName();
        java.lang.String str7 = guest5.getName();
        java.lang.String str8 = guest5.getUserType();
        java.lang.String str9 = guest5.getUserType();
        boolean boolean10 = guest5.isApproved();
        boolean boolean11 = guest5.isApproved();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Guest" + "'", str8, "Guest");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Guest" + "'", str9, "Guest");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test0272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0272");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("data/test-users.csv");
        java.util.List<com.reservation_system.model.User> userList2 = userRepository1.getAllUsers();
        com.reservation_system.services.AuthService authService3 = new com.reservation_system.services.AuthService(userRepository1);
        com.reservation_system.model.LabManager labManager9 = new com.reservation_system.model.LabManager((int) (short) 0, "", "student", "Andrew", true);
        boolean boolean10 = labManager9.isApproved();
        userRepository1.addUser((com.reservation_system.model.User) labManager9);
        com.reservation_system.model.Faculty faculty17 = new com.reservation_system.model.Faculty((int) '#', "researcher", "", "student", true);
        userRepository1.addUser((com.reservation_system.model.User) faculty17);
        boolean boolean19 = faculty17.isApproved();
        faculty17.setApproved(true);
        java.lang.String str22 = faculty17.getPassword();
        int int23 = faculty17.getID();
        org.junit.Assert.assertNotNull(userList2);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "student" + "'", str22, "student");
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 35 + "'", int23 == 35);
    }

    @Test
    public void test0273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0273");
        com.reservation_system.model.HeadLabCoordinator headLabCoordinator5 = new com.reservation_system.model.HeadLabCoordinator(10, "headlabcoordinator", "data/test-users.csv", "faculty", false);
        int int6 = headLabCoordinator5.getID();
        java.lang.String str7 = headLabCoordinator5.getEmail();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "data/test-users.csv" + "'", str7, "data/test-users.csv");
    }

    @Test
    public void test0274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0274");
        com.reservation_system.model.Faculty faculty5 = new com.reservation_system.model.Faculty((int) (short) -1, "Password1!", "", "Andrew", false);
        java.lang.Class<?> wildcardClass6 = faculty5.getClass();
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0275");
        com.reservation_system.model.Guest guest5 = new com.reservation_system.model.Guest(98, "labmanager", "Student", "WrongPassword1!", false);
    }

    @Test
    public void test0276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0276");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("data/test-users.csv");
        java.util.List<com.reservation_system.model.User> userList2 = userRepository1.getAllUsers();
        com.reservation_system.services.AuthService authService3 = new com.reservation_system.services.AuthService(userRepository1);
        java.util.Optional<com.reservation_system.model.User> userOptional5 = userRepository1.findByEmail("");
        java.util.List<com.reservation_system.model.User> userList6 = userRepository1.getAllUsers();
        boolean boolean8 = userRepository1.emailExists("labmanager");
        com.reservation_system.services.AuthService authService9 = new com.reservation_system.services.AuthService(userRepository1);
        // The following exception was thrown during execution in test generation
        try {
            com.reservation_system.model.User user12 = authService9.login("Andrew", "Guest");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: No user found with that email.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(userList2);
        org.junit.Assert.assertNotNull(userOptional5);
        org.junit.Assert.assertNotNull(userList6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test0277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0277");
        com.reservation_system.model.Faculty faculty5 = new com.reservation_system.model.Faculty((int) (short) 100, "data/test-users.csv", "", "test@example.com", false);
        boolean boolean6 = faculty5.isApproved();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test0278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0278");
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
        boolean boolean29 = userRepository1.headLabCoordinatorExists();
        org.junit.Assert.assertNotNull(userList2);
        org.junit.Assert.assertNotNull(userList3);
        org.junit.Assert.assertNotNull(userList7);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 98 + "'", int24 == 98);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 98 + "'", int25 == 98);
        org.junit.Assert.assertNotNull(userList26);
        org.junit.Assert.assertNotNull(userList28);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
    }

    @Test
    public void test0279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0279");
        com.reservation_system.model.Guest guest5 = new com.reservation_system.model.Guest(10, "hi!", "labmanager", "data/test-users.csv", false);
    }

    @Test
    public void test0280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0280");
        com.reservation_system.model.LabManager labManager5 = new com.reservation_system.model.LabManager((int) '4', "hi!", "labmanager", "Student", false);
        java.lang.String str6 = labManager5.getName();
        java.lang.String str7 = labManager5.getUserType();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "labmanager" + "'", str7, "labmanager");
    }

    @Test
    public void test0281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0281");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("data/test-users.csv");
        java.util.List<com.reservation_system.model.User> userList2 = userRepository1.getAllUsers();
        com.reservation_system.services.AuthService authService3 = new com.reservation_system.services.AuthService(userRepository1);
        int int4 = userRepository1.getNextID();
        com.reservation_system.services.AuthService authService5 = new com.reservation_system.services.AuthService(userRepository1);
        // The following exception was thrown during execution in test generation
        try {
            com.reservation_system.model.User user8 = authService5.login("hi!", "guest");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Incorrect password.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(userList2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 98 + "'", int4 == 98);
    }

    @Test
    public void test0282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0282");
        com.reservation_system.model.User user6 = com.reservation_system.patterns.factory.UserFactory.createUser("faculty", (int) (short) -1, "Guest", "researcher", "", true);
        java.lang.String str7 = user6.getName();
        org.junit.Assert.assertNotNull(user6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Guest" + "'", str7, "Guest");
    }

    @Test
    public void test0283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0283");
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
        researcher27.setApproved(true);
        org.junit.Assert.assertNotNull(userList2);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 98 + "'", int19 == 98);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 98 + "'", int20 == 98);
        org.junit.Assert.assertNotNull(userList21);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "Researcher" + "'", str28, "Researcher");
    }

    @Test
    public void test0284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0284");
        com.reservation_system.model.Faculty faculty5 = new com.reservation_system.model.Faculty((int) (byte) 1, "researcher", "faculty", "hi!", false);
        java.lang.String str6 = faculty5.getUserType();
        faculty5.setApproved(false);
        java.lang.String str9 = faculty5.getUserType();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Faculty" + "'", str6, "Faculty");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Faculty" + "'", str9, "Faculty");
    }

    @Test
    public void test0285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0285");
        com.reservation_system.model.LabManager labManager5 = new com.reservation_system.model.LabManager((int) (short) 10, "WrongPassword1!", "Student", "Guest", false);
    }

    @Test
    public void test0286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0286");
        com.reservation_system.model.Guest guest5 = new com.reservation_system.model.Guest((int) (short) 10, "Password1!", "test@example.com", "faculty", true);
        java.lang.String str6 = guest5.getEmail();
        java.lang.Class<?> wildcardClass7 = guest5.getClass();
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0287");
        // The following exception was thrown during execution in test generation
        try {
            com.reservation_system.model.User user6 = com.reservation_system.patterns.factory.UserFactory.createUser("Andrew", (int) (short) -1, "data/test-users.csv", "", "student", false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid user type: Andrew");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0288");
        com.reservation_system.model.HeadLabCoordinator headLabCoordinator5 = new com.reservation_system.model.HeadLabCoordinator(98, "headlabcoordinator", "Andrew", "guest", false);
        java.lang.String str6 = headLabCoordinator5.getUserType();
        int int7 = headLabCoordinator5.getID();
        java.lang.String str8 = headLabCoordinator5.getUserType();
        java.lang.String str9 = headLabCoordinator5.getUserType();
        java.lang.String str10 = headLabCoordinator5.getUserType();
        boolean boolean11 = headLabCoordinator5.requiresDepartmentApproval();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "headlabcoordinator" + "'", str6, "headlabcoordinator");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 98 + "'", int7 == 98);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "headlabcoordinator" + "'", str8, "headlabcoordinator");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "headlabcoordinator" + "'", str9, "headlabcoordinator");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "headlabcoordinator" + "'", str10, "headlabcoordinator");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test0289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0289");
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
        // The following exception was thrown during execution in test generation
        try {
            com.reservation_system.model.User user20 = authService17.login("Student", "Faculty");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Incorrect password.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(userList2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(userList6);
        org.junit.Assert.assertNotNull(userList7);
        org.junit.Assert.assertNotNull(userList11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(userList14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test0290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0290");
        com.reservation_system.model.Student student5 = new com.reservation_system.model.Student(0, "Faculty", "Andrew", "faculty", true);
    }

    @Test
    public void test0291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0291");
        com.reservation_system.model.LabManager labManager5 = new com.reservation_system.model.LabManager((int) 'a', "hi!", "Password1!", "student", false);
        java.lang.String str6 = labManager5.getUserType();
        java.lang.String str7 = labManager5.getUserType();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "labmanager" + "'", str6, "labmanager");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "labmanager" + "'", str7, "labmanager");
    }

    @Test
    public void test0292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0292");
        com.reservation_system.model.HeadLabCoordinator headLabCoordinator5 = new com.reservation_system.model.HeadLabCoordinator((int) (byte) 0, "test@example.com", "Guest", "WrongPassword1!", false);
        headLabCoordinator5.setApproved(true);
    }

    @Test
    public void test0293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0293");
        com.reservation_system.model.Guest guest5 = new com.reservation_system.model.Guest((int) (short) 1, "labmanager", "Andrew", "test@example.com", false);
    }

    @Test
    public void test0294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0294");
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
        com.reservation_system.repository.UserRepository userRepository20 = new com.reservation_system.repository.UserRepository("data/test-users.csv");
        java.util.List<com.reservation_system.model.User> userList21 = userRepository20.getAllUsers();
        java.util.List<com.reservation_system.model.User> userList22 = userRepository20.getAllUsers();
        com.reservation_system.services.AuthService authService23 = new com.reservation_system.services.AuthService(userRepository20);
        java.util.Optional<com.reservation_system.model.User> userOptional25 = userRepository20.findByEmail("faculty");
        com.reservation_system.services.AuthService authService26 = new com.reservation_system.services.AuthService(userRepository20);
        java.util.List<com.reservation_system.model.User> userList27 = userRepository20.getAllUsers();
        userRepository1.saveAllUsers(userList27);
        java.util.List<com.reservation_system.model.User> userList29 = null;
        // The following exception was thrown during execution in test generation
        try {
            userRepository1.saveAllUsers(userList29);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.List.iterator()\" because \"users\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
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
        org.junit.Assert.assertNotNull(userList21);
        org.junit.Assert.assertNotNull(userList22);
        org.junit.Assert.assertNotNull(userOptional25);
        org.junit.Assert.assertNotNull(userList27);
    }

    @Test
    public void test0295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0295");
        com.reservation_system.model.Researcher researcher5 = new com.reservation_system.model.Researcher((int) 'a', "hi!", "student", "labmanager", false);
        boolean boolean6 = researcher5.requiresDepartmentApproval();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test0296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0296");
        com.reservation_system.model.Faculty faculty5 = new com.reservation_system.model.Faculty((int) (byte) 1, "researcher", "faculty", "hi!", false);
        java.lang.String str6 = faculty5.getUserType();
        java.lang.String str7 = faculty5.getName();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Faculty" + "'", str6, "Faculty");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "researcher" + "'", str7, "researcher");
    }

    @Test
    public void test0297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0297");
        com.reservation_system.model.Guest guest5 = new com.reservation_system.model.Guest((int) 'a', "faculty", "guest", "headlabcoordinator", false);
    }

    @Test
    public void test0298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0298");
        com.reservation_system.model.LabManager labManager5 = new com.reservation_system.model.LabManager((int) '4', "hi!", "labmanager", "Student", false);
        java.lang.String str6 = labManager5.getName();
        java.lang.String str7 = labManager5.getPassword();
        java.lang.String str8 = labManager5.getUserType();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Student" + "'", str7, "Student");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "labmanager" + "'", str8, "labmanager");
    }

    @Test
    public void test0299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0299");
        com.reservation_system.model.Guest guest5 = new com.reservation_system.model.Guest((int) '#', "test@example.com", "Password1!", "test@example.com", true);
        java.lang.String str6 = guest5.getEmail();
        java.lang.Class<?> wildcardClass7 = guest5.getClass();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Password1!" + "'", str6, "Password1!");
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0300");
        com.reservation_system.model.HeadLabCoordinator headLabCoordinator5 = new com.reservation_system.model.HeadLabCoordinator(98, "headlabcoordinator", "Andrew", "guest", false);
        java.lang.String str6 = headLabCoordinator5.getUserType();
        int int7 = headLabCoordinator5.getID();
        java.lang.String str8 = headLabCoordinator5.getUserType();
        java.lang.String str9 = headLabCoordinator5.getUserType();
        java.lang.String str10 = headLabCoordinator5.getUserType();
        java.lang.String str11 = headLabCoordinator5.getUserType();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "headlabcoordinator" + "'", str6, "headlabcoordinator");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 98 + "'", int7 == 98);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "headlabcoordinator" + "'", str8, "headlabcoordinator");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "headlabcoordinator" + "'", str9, "headlabcoordinator");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "headlabcoordinator" + "'", str10, "headlabcoordinator");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "headlabcoordinator" + "'", str11, "headlabcoordinator");
    }

    @Test
    public void test0301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0301");
        com.reservation_system.model.User user6 = com.reservation_system.patterns.factory.UserFactory.createUser("researcher", 0, "test@example.com", "headlabcoordinator", "Student", false);
        org.junit.Assert.assertNotNull(user6);
    }

    @Test
    public void test0302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0302");
        com.reservation_system.model.LabManager labManager5 = new com.reservation_system.model.LabManager((int) '4', "labmanager", "hi!", "Faculty", true);
    }

    @Test
    public void test0303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0303");
        com.reservation_system.model.Student student5 = new com.reservation_system.model.Student(1, "guest", "Faculty", "labmanager", true);
        java.lang.String str6 = student5.getUserType();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Student" + "'", str6, "Student");
    }

    @Test
    public void test0304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0304");
        com.reservation_system.model.Faculty faculty5 = new com.reservation_system.model.Faculty((int) (byte) 1, "Password1!", "Faculty", "researcher", true);
        faculty5.setApproved(true);
    }

    @Test
    public void test0305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0305");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("data/test-users.csv");
        java.util.List<com.reservation_system.model.User> userList2 = userRepository1.getAllUsers();
        com.reservation_system.services.AuthService authService3 = new com.reservation_system.services.AuthService(userRepository1);
        com.reservation_system.model.LabManager labManager9 = new com.reservation_system.model.LabManager((int) (short) 0, "", "student", "Andrew", true);
        boolean boolean10 = labManager9.isApproved();
        userRepository1.addUser((com.reservation_system.model.User) labManager9);
        boolean boolean13 = userRepository1.emailExists("Researcher");
        java.util.List<com.reservation_system.model.User> userList14 = userRepository1.getAllUsers();
        com.reservation_system.services.AuthService authService15 = new com.reservation_system.services.AuthService(userRepository1);
        // The following exception was thrown during execution in test generation
        try {
            com.reservation_system.model.User user18 = authService15.login("headlabcoordinator", "student");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: No user found with that email.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(userList2);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(userList14);
    }

    @Test
    public void test0306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0306");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("data/test-users.csv");
        java.util.List<com.reservation_system.model.User> userList2 = userRepository1.getAllUsers();
        com.reservation_system.services.AuthService authService3 = new com.reservation_system.services.AuthService(userRepository1);
        com.reservation_system.services.AuthService authService4 = new com.reservation_system.services.AuthService(userRepository1);
        com.reservation_system.services.AuthService authService5 = new com.reservation_system.services.AuthService(userRepository1);
        // The following exception was thrown during execution in test generation
        try {
            com.reservation_system.model.User user8 = authService5.login("Faculty", "headlabcoordinator");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Incorrect password.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(userList2);
    }

    @Test
    public void test0307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0307");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("data/test-users.csv");
        java.util.List<com.reservation_system.model.User> userList2 = userRepository1.getAllUsers();
        com.reservation_system.services.AuthService authService3 = new com.reservation_system.services.AuthService(userRepository1);
        com.reservation_system.model.LabManager labManager9 = new com.reservation_system.model.LabManager((int) (short) 0, "", "student", "Andrew", true);
        boolean boolean10 = labManager9.isApproved();
        userRepository1.addUser((com.reservation_system.model.User) labManager9);
        com.reservation_system.model.Faculty faculty17 = new com.reservation_system.model.Faculty((int) '#', "researcher", "", "student", true);
        userRepository1.addUser((com.reservation_system.model.User) faculty17);
        boolean boolean19 = faculty17.isApproved();
        faculty17.setApproved(true);
        java.lang.String str22 = faculty17.getUserType();
        org.junit.Assert.assertNotNull(userList2);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "Faculty" + "'", str22, "Faculty");
    }

    @Test
    public void test0308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0308");
        com.reservation_system.model.Faculty faculty5 = new com.reservation_system.model.Faculty(1, "Student", "Password1!", "data/test-users.csv", false);
    }

    @Test
    public void test0309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0309");
        com.reservation_system.model.Faculty faculty5 = new com.reservation_system.model.Faculty((int) (byte) 0, "WrongPassword1!", "", "guest", true);
        java.lang.String str6 = faculty5.getUserType();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Faculty" + "'", str6, "Faculty");
    }

    @Test
    public void test0310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0310");
        com.reservation_system.model.Guest guest5 = new com.reservation_system.model.Guest(98, "Researcher", "Faculty", "guest", false);
        java.lang.String str6 = guest5.getName();
        int int7 = guest5.getID();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Researcher" + "'", str6, "Researcher");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 98 + "'", int7 == 98);
    }

    @Test
    public void test0311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0311");
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
        boolean boolean41 = userRepository1.headLabCoordinatorExists();
        org.junit.Assert.assertNotNull(userList2);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
// flaky "35) test0311(com.reservation_system.Randoop.AuthService.RegressionTest0)":         org.junit.Assert.assertTrue("'" + int19 + "' != '" + 101 + "'", int19 == 101);
// flaky "19) test0311(com.reservation_system.Randoop.AuthService.RegressionTest0)":         org.junit.Assert.assertTrue("'" + int20 + "' != '" + 101 + "'", int20 == 101);
        org.junit.Assert.assertNotNull(userList21);
// flaky "13) test0311(com.reservation_system.Randoop.AuthService.RegressionTest0)":         org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
// flaky "5) test0311(com.reservation_system.Randoop.AuthService.RegressionTest0)":         org.junit.Assert.assertTrue("'" + int25 + "' != '" + 101 + "'", int25 == 101);
// flaky "1) test0311(com.reservation_system.Randoop.AuthService.RegressionTest0)":         org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
// flaky "1) test0311(com.reservation_system.Randoop.AuthService.RegressionTest0)":         org.junit.Assert.assertTrue("'" + int29 + "' != '" + 101 + "'", int29 == 101);
        org.junit.Assert.assertNotNull(userList30);
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "Student" + "'", str39, "Student");
// flaky "1) test0311(com.reservation_system.Randoop.AuthService.RegressionTest0)":         org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + true + "'", boolean41 == true);
    }

    @Test
    public void test0312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0312");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("data/test-users.csv");
        boolean boolean2 = userRepository1.headLabCoordinatorExists();
        int int3 = userRepository1.getNextID();
        boolean boolean5 = userRepository1.emailExists("test@example.com");
        java.lang.Class<?> wildcardClass6 = userRepository1.getClass();
// flaky "36) test0312(com.reservation_system.Randoop.AuthService.RegressionTest0)":         org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
// flaky "20) test0312(com.reservation_system.Randoop.AuthService.RegressionTest0)":         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 101 + "'", int3 == 101);
// flaky "14) test0312(com.reservation_system.Randoop.AuthService.RegressionTest0)":         org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0313");
        com.reservation_system.model.LabManager labManager5 = new com.reservation_system.model.LabManager(10, "Guest", "guest", "WrongPassword1!", true);
        java.lang.String str6 = labManager5.getPassword();
        java.lang.String str7 = labManager5.getUserType();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "WrongPassword1!" + "'", str6, "WrongPassword1!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "labmanager" + "'", str7, "labmanager");
    }

    @Test
    public void test0314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0314");
        com.reservation_system.model.Student student5 = new com.reservation_system.model.Student(1, "guest", "Faculty", "labmanager", true);
        java.lang.String str6 = student5.getPassword();
        java.lang.String str7 = student5.getUserType();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "labmanager" + "'", str6, "labmanager");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Student" + "'", str7, "Student");
    }

    @Test
    public void test0315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0315");
        com.reservation_system.model.Researcher researcher5 = new com.reservation_system.model.Researcher(10, "Password1!", "Password1!", "headlabcoordinator", true);
        java.lang.String str6 = researcher5.getUserType();
        researcher5.setApproved(false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Researcher" + "'", str6, "Researcher");
    }

    @Test
    public void test0316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0316");
        com.reservation_system.model.Researcher researcher5 = new com.reservation_system.model.Researcher(97, "Andrew", "Researcher", "Guest", true);
    }

    @Test
    public void test0317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0317");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("data/test-users.csv");
        java.util.List<com.reservation_system.model.User> userList2 = userRepository1.getAllUsers();
        java.util.List<com.reservation_system.model.User> userList3 = userRepository1.getAllUsers();
        com.reservation_system.services.AuthService authService4 = new com.reservation_system.services.AuthService(userRepository1);
        java.util.Optional<com.reservation_system.model.User> userOptional6 = userRepository1.findByEmail("faculty");
        com.reservation_system.services.AuthService authService7 = new com.reservation_system.services.AuthService(userRepository1);
        java.util.List<com.reservation_system.model.User> userList8 = userRepository1.getAllUsers();
        com.reservation_system.services.AuthService authService9 = new com.reservation_system.services.AuthService(userRepository1);
        com.reservation_system.model.Faculty faculty15 = new com.reservation_system.model.Faculty((int) '4', "Faculty", "guest", "hi!", false);
        userRepository1.addUser((com.reservation_system.model.User) faculty15);
        int int17 = faculty15.getID();
        org.junit.Assert.assertNotNull(userList2);
        org.junit.Assert.assertNotNull(userList3);
        org.junit.Assert.assertNotNull(userOptional6);
        org.junit.Assert.assertNotNull(userList8);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 52 + "'", int17 == 52);
    }

    @Test
    public void test0318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0318");
        com.reservation_system.model.Faculty faculty5 = new com.reservation_system.model.Faculty((int) '#', "researcher", "hi!", "Andrew", false);
    }

    @Test
    public void test0319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0319");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("data/test-users.csv");
        java.util.List<com.reservation_system.model.User> userList2 = userRepository1.getAllUsers();
        java.util.List<com.reservation_system.model.User> userList3 = userRepository1.getAllUsers();
        com.reservation_system.services.AuthService authService4 = new com.reservation_system.services.AuthService(userRepository1);
        java.util.Optional<com.reservation_system.model.User> userOptional6 = userRepository1.findByEmail("faculty");
        com.reservation_system.services.AuthService authService7 = new com.reservation_system.services.AuthService(userRepository1);
        boolean boolean8 = userRepository1.headLabCoordinatorExists();
        com.reservation_system.model.User user15 = com.reservation_system.patterns.factory.UserFactory.createUser("researcher", (int) (short) 10, "WrongPassword1!", "", "guest", true);
        userRepository1.addUser(user15);
        org.junit.Assert.assertNotNull(userList2);
        org.junit.Assert.assertNotNull(userList3);
        org.junit.Assert.assertNotNull(userOptional6);
// flaky "37) test0319(com.reservation_system.Randoop.AuthService.RegressionTest0)":         org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(user15);
    }

    @Test
    public void test0320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0320");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("data/test-users.csv");
        java.util.List<com.reservation_system.model.User> userList2 = userRepository1.getAllUsers();
        com.reservation_system.services.AuthService authService3 = new com.reservation_system.services.AuthService(userRepository1);
        com.reservation_system.model.LabManager labManager9 = new com.reservation_system.model.LabManager((int) (short) 0, "", "student", "Andrew", true);
        boolean boolean10 = labManager9.isApproved();
        userRepository1.addUser((com.reservation_system.model.User) labManager9);
        com.reservation_system.model.Faculty faculty17 = new com.reservation_system.model.Faculty((int) '#', "researcher", "", "student", true);
        userRepository1.addUser((com.reservation_system.model.User) faculty17);
        com.reservation_system.services.AuthService authService19 = new com.reservation_system.services.AuthService(userRepository1);
        // The following exception was thrown during execution in test generation
        try {
            com.reservation_system.model.User user22 = authService19.login("researcher", "test@example.com");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Incorrect password.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(userList2);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test0321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0321");
        com.reservation_system.model.Guest guest5 = new com.reservation_system.model.Guest(98, "student", "", "Faculty", false);
    }

    @Test
    public void test0322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0322");
        com.reservation_system.model.Student student5 = new com.reservation_system.model.Student((int) ' ', "student", "Researcher", "faculty", false);
        boolean boolean6 = student5.requiresDepartmentApproval();
        java.lang.String str7 = student5.getUserType();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Student" + "'", str7, "Student");
    }

    @Test
    public void test0323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0323");
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
        com.reservation_system.model.Researcher researcher27 = new com.reservation_system.model.Researcher((int) (short) -1, "researcher", "test@example.com", "Faculty", true);
        java.lang.String str28 = researcher27.getUserType();
        boolean boolean29 = researcher27.requiresDepartmentApproval();
        java.lang.String str30 = researcher27.getUserType();
        userRepository1.addUser((com.reservation_system.model.User) researcher27);
        boolean boolean33 = userRepository1.emailExists("researcher");
        org.junit.Assert.assertNotNull(userList2);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
// flaky "38) test0323(com.reservation_system.Randoop.AuthService.RegressionTest0)":         org.junit.Assert.assertTrue("'" + int19 + "' != '" + 101 + "'", int19 == 101);
        org.junit.Assert.assertNotNull(userOptional21);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "Researcher" + "'", str28, "Researcher");
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "Researcher" + "'", str30, "Researcher");
// flaky "21) test0323(com.reservation_system.Randoop.AuthService.RegressionTest0)":         org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
    }

    @Test
    public void test0324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0324");
        com.reservation_system.model.Faculty faculty5 = new com.reservation_system.model.Faculty((int) 'a', "WrongPassword1!", "test@example.com", "test@example.com", false);
        faculty5.setApproved(false);
        java.lang.Class<?> wildcardClass8 = faculty5.getClass();
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0325");
        com.reservation_system.model.Researcher researcher5 = new com.reservation_system.model.Researcher((int) (byte) 10, "researcher", "Researcher", "", false);
        java.lang.Class<?> wildcardClass6 = researcher5.getClass();
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0326");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("data/test-users.csv");
        boolean boolean2 = userRepository1.headLabCoordinatorExists();
        com.reservation_system.model.Faculty faculty8 = new com.reservation_system.model.Faculty(0, "headlabcoordinator", "student", "labmanager", false);
        userRepository1.addUser((com.reservation_system.model.User) faculty8);
        java.lang.String str10 = faculty8.getName();
        boolean boolean11 = faculty8.requiresDepartmentApproval();
        java.lang.String str12 = faculty8.getEmail();
// flaky "39) test0326(com.reservation_system.Randoop.AuthService.RegressionTest0)":         org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "headlabcoordinator" + "'", str10, "headlabcoordinator");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "student" + "'", str12, "student");
    }

    @Test
    public void test0327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0327");
        com.reservation_system.model.Researcher researcher5 = new com.reservation_system.model.Researcher((int) (short) -1, "researcher", "test@example.com", "Faculty", true);
        boolean boolean6 = researcher5.requiresDepartmentApproval();
        int int7 = researcher5.getID();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
    }

    @Test
    public void test0328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0328");
        com.reservation_system.model.Guest guest5 = new com.reservation_system.model.Guest((int) '#', "test@example.com", "Password1!", "test@example.com", true);
        guest5.setApproved(true);
        boolean boolean8 = guest5.requiresDepartmentApproval();
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test0329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0329");
        com.reservation_system.model.Guest guest5 = new com.reservation_system.model.Guest((int) 'a', "Andrew", "faculty", "faculty", true);
    }

    @Test
    public void test0330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0330");
        com.reservation_system.model.Guest guest5 = new com.reservation_system.model.Guest(101, "hi!", "Password1!", "Andrew", true);
        java.lang.Class<?> wildcardClass6 = guest5.getClass();
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0331");
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
        java.lang.String str35 = headLabCoordinator32.getEmail();
        java.lang.String str36 = headLabCoordinator32.getUserType();
        org.junit.Assert.assertNotNull(userList2);
// flaky "40) test0331(com.reservation_system.Randoop.AuthService.RegressionTest0)":         org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(userList6);
        org.junit.Assert.assertNotNull(userList7);
        org.junit.Assert.assertNotNull(userList11);
// flaky "22) test0331(com.reservation_system.Randoop.AuthService.RegressionTest0)":         org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
// flaky "15) test0331(com.reservation_system.Randoop.AuthService.RegressionTest0)":         org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(userList14);
// flaky "6) test0331(com.reservation_system.Randoop.AuthService.RegressionTest0)":         org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNotNull(user24);
// flaky "2) test0331(com.reservation_system.Randoop.AuthService.RegressionTest0)":         org.junit.Assert.assertTrue("'" + int26 + "' != '" + 101 + "'", int26 == 101);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "headlabcoordinator" + "'", str33, "headlabcoordinator");
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "guest" + "'", str35, "guest");
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "headlabcoordinator" + "'", str36, "headlabcoordinator");
    }

    @Test
    public void test0332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0332");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("data/test-users.csv");
        java.util.List<com.reservation_system.model.User> userList2 = userRepository1.getAllUsers();
        com.reservation_system.services.AuthService authService3 = new com.reservation_system.services.AuthService(userRepository1);
        java.util.Optional<com.reservation_system.model.User> userOptional5 = userRepository1.findByEmail("");
        int int6 = userRepository1.getNextID();
        java.util.Optional<com.reservation_system.model.User> userOptional8 = userRepository1.findByEmail("data/test-users.csv");
        java.util.Optional<com.reservation_system.model.User> userOptional10 = userRepository1.findByEmail("Andrew");
        org.junit.Assert.assertNotNull(userList2);
        org.junit.Assert.assertNotNull(userOptional5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 101 + "'", int6 == 101);
        org.junit.Assert.assertNotNull(userOptional8);
        org.junit.Assert.assertNotNull(userOptional10);
    }

    @Test
    public void test0333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0333");
        com.reservation_system.model.Faculty faculty5 = new com.reservation_system.model.Faculty((-1), "Student", "Password1!", "faculty", true);
    }

    @Test
    public void test0334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0334");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("data/test-users.csv");
        java.util.List<com.reservation_system.model.User> userList2 = userRepository1.getAllUsers();
        com.reservation_system.services.AuthService authService3 = new com.reservation_system.services.AuthService(userRepository1);
        com.reservation_system.model.LabManager labManager9 = new com.reservation_system.model.LabManager((int) (short) 0, "", "student", "Andrew", true);
        boolean boolean10 = labManager9.isApproved();
        userRepository1.addUser((com.reservation_system.model.User) labManager9);
        com.reservation_system.services.AuthService authService12 = new com.reservation_system.services.AuthService(userRepository1);
        // The following exception was thrown during execution in test generation
        try {
            com.reservation_system.model.User user15 = authService12.login("student", "WrongPassword1!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Incorrect password.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(userList2);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test0335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0335");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("data/test-users.csv");
        java.util.List<com.reservation_system.model.User> userList2 = userRepository1.getAllUsers();
        com.reservation_system.services.AuthService authService3 = new com.reservation_system.services.AuthService(userRepository1);
        com.reservation_system.services.AuthService authService4 = new com.reservation_system.services.AuthService(userRepository1);
        com.reservation_system.services.AuthService authService5 = new com.reservation_system.services.AuthService(userRepository1);
        boolean boolean6 = userRepository1.headLabCoordinatorExists();
        boolean boolean7 = userRepository1.headLabCoordinatorExists();
        java.util.List<com.reservation_system.model.User> userList8 = userRepository1.getAllUsers();
        java.lang.Class<?> wildcardClass9 = userList8.getClass();
        org.junit.Assert.assertNotNull(userList2);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(userList8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0336");
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
        java.util.Optional<com.reservation_system.model.User> userOptional42 = userRepository1.findByEmail("headlabcoordinator");
        org.junit.Assert.assertNotNull(userList2);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 101 + "'", int19 == 101);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 101 + "'", int20 == 101);
        org.junit.Assert.assertNotNull(userList21);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "Researcher" + "'", str28, "Researcher");
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "Researcher" + "'", str36, "Researcher");
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "student" + "'", str38, "student");
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertNotNull(userOptional42);
    }

    @Test
    public void test0337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0337");
        com.reservation_system.model.LabManager labManager5 = new com.reservation_system.model.LabManager((int) (byte) 100, "Faculty", "Password1!", "Student", true);
        java.lang.String str6 = labManager5.getEmail();
        boolean boolean7 = labManager5.requiresDepartmentApproval();
        java.lang.String str8 = labManager5.getUserType();
        labManager5.setApproved(false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Password1!" + "'", str6, "Password1!");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "labmanager" + "'", str8, "labmanager");
    }

    @Test
    public void test0338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0338");
        com.reservation_system.model.Student student5 = new com.reservation_system.model.Student((int) ' ', "student", "Student", "WrongPassword1!", true);
        student5.setApproved(false);
    }

    @Test
    public void test0339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0339");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("data/test-users.csv");
        java.util.List<com.reservation_system.model.User> userList2 = userRepository1.getAllUsers();
        com.reservation_system.services.AuthService authService3 = new com.reservation_system.services.AuthService(userRepository1);
        java.util.Optional<com.reservation_system.model.User> userOptional5 = userRepository1.findByEmail("");
        java.util.List<com.reservation_system.model.User> userList6 = userRepository1.getAllUsers();
        boolean boolean8 = userRepository1.emailExists("Andrew");
        com.reservation_system.services.AuthService authService9 = new com.reservation_system.services.AuthService(userRepository1);
        // The following exception was thrown during execution in test generation
        try {
            com.reservation_system.model.User user12 = authService9.login("test@example.com", "WrongPassword1!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Incorrect password.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(userList2);
        org.junit.Assert.assertNotNull(userOptional5);
        org.junit.Assert.assertNotNull(userList6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test0340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0340");
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
        int int17 = userRepository1.getNextID();
        int int18 = userRepository1.getNextID();
        org.junit.Assert.assertNotNull(userList2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(userList6);
        org.junit.Assert.assertNotNull(userList7);
        org.junit.Assert.assertNotNull(userList11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(userList14);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 101 + "'", int17 == 101);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 101 + "'", int18 == 101);
    }

    @Test
    public void test0341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0341");
        com.reservation_system.model.Guest guest5 = new com.reservation_system.model.Guest(0, "test@example.com", "faculty", "faculty", true);
        java.lang.String str6 = guest5.getUserType();
        java.lang.String str7 = guest5.getName();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Guest" + "'", str6, "Guest");
    }

    @Test
    public void test0342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0342");
        com.reservation_system.model.Faculty faculty5 = new com.reservation_system.model.Faculty((int) (byte) 0, "", "faculty", "Researcher", false);
        java.lang.String str6 = faculty5.getUserType();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Faculty" + "'", str6, "Faculty");
    }

    @Test
    public void test0343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0343");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("data/test-users.csv");
        java.util.List<com.reservation_system.model.User> userList2 = userRepository1.getAllUsers();
        java.util.List<com.reservation_system.model.User> userList3 = userRepository1.getAllUsers();
        com.reservation_system.services.AuthService authService4 = new com.reservation_system.services.AuthService(userRepository1);
        java.util.Optional<com.reservation_system.model.User> userOptional6 = userRepository1.findByEmail("faculty");
        com.reservation_system.services.AuthService authService7 = new com.reservation_system.services.AuthService(userRepository1);
        java.util.Optional<com.reservation_system.model.User> userOptional9 = userRepository1.findByEmail("student");
        java.util.Optional<com.reservation_system.model.User> userOptional11 = userRepository1.findByEmail("guest");
        java.util.List<com.reservation_system.model.User> userList12 = userRepository1.getAllUsers();
        org.junit.Assert.assertNotNull(userList2);
        org.junit.Assert.assertNotNull(userList3);
        org.junit.Assert.assertNotNull(userOptional6);
        org.junit.Assert.assertNotNull(userOptional9);
        org.junit.Assert.assertNotNull(userOptional11);
        org.junit.Assert.assertNotNull(userList12);
    }

    @Test
    public void test0344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0344");
        com.reservation_system.model.LabManager labManager5 = new com.reservation_system.model.LabManager((int) '#', "headlabcoordinator", "WrongPassword1!", "WrongPassword1!", false);
        java.lang.String str6 = labManager5.getUserType();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "labmanager" + "'", str6, "labmanager");
    }

    @Test
    public void test0345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0345");
        com.reservation_system.model.Student student5 = new com.reservation_system.model.Student((int) (byte) 0, "Faculty", "", "Student", false);
        java.lang.String str6 = student5.getUserType();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Student" + "'", str6, "Student");
    }

    @Test
    public void test0346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0346");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("data/test-users.csv");
        java.util.List<com.reservation_system.model.User> userList2 = userRepository1.getAllUsers();
        java.util.List<com.reservation_system.model.User> userList3 = userRepository1.getAllUsers();
        com.reservation_system.model.Faculty faculty9 = new com.reservation_system.model.Faculty(10, "data/test-users.csv", "hi!", "", false);
        java.lang.String str10 = faculty9.getUserType();
        userRepository1.addUser((com.reservation_system.model.User) faculty9);
        java.util.Optional<com.reservation_system.model.User> userOptional13 = userRepository1.findByEmail("Student");
        boolean boolean14 = userRepository1.headLabCoordinatorExists();
        boolean boolean16 = userRepository1.emailExists("labmanager");
        java.util.Optional<com.reservation_system.model.User> userOptional18 = userRepository1.findByEmail("hi!");
        boolean boolean20 = userRepository1.emailExists("data/test-users.csv");
        com.reservation_system.repository.UserRepository userRepository22 = new com.reservation_system.repository.UserRepository("data/test-users.csv");
        boolean boolean23 = userRepository22.headLabCoordinatorExists();
        int int24 = userRepository22.getNextID();
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
        java.util.List<com.reservation_system.model.User> userList39 = userRepository26.getAllUsers();
        userRepository22.saveAllUsers(userList39);
        userRepository1.saveAllUsers(userList39);
        org.junit.Assert.assertNotNull(userList2);
        org.junit.Assert.assertNotNull(userList3);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Faculty" + "'", str10, "Faculty");
        org.junit.Assert.assertNotNull(userOptional13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(userOptional18);
// flaky "41) test0346(com.reservation_system.Randoop.AuthService.RegressionTest0)":         org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 101 + "'", int24 == 101);
        org.junit.Assert.assertNotNull(userList27);
        org.junit.Assert.assertNotNull(userList28);
        org.junit.Assert.assertNotNull(userList31);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertNotNull(userList35);
        org.junit.Assert.assertNotNull(userList36);
        org.junit.Assert.assertNotNull(userList39);
    }

    @Test
    public void test0347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0347");
        com.reservation_system.model.Guest guest5 = new com.reservation_system.model.Guest((int) (short) 0, "data/test-users.csv", "faculty", "Researcher", true);
    }

    @Test
    public void test0348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0348");
        com.reservation_system.model.Researcher researcher5 = new com.reservation_system.model.Researcher(98, "Password1!", "WrongPassword1!", "student", true);
        java.lang.String str6 = researcher5.getUserType();
        boolean boolean7 = researcher5.isApproved();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Researcher" + "'", str6, "Researcher");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test0349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0349");
        com.reservation_system.model.Guest guest5 = new com.reservation_system.model.Guest((int) (short) -1, "headlabcoordinator", "data/test-users.csv", "WrongPassword1!", false);
        java.lang.Class<?> wildcardClass6 = guest5.getClass();
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0350");
        com.reservation_system.model.Student student5 = new com.reservation_system.model.Student((int) (byte) -1, "guest", "", "guest", true);
        student5.setApproved(false);
    }

    @Test
    public void test0351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0351");
        com.reservation_system.model.User user6 = com.reservation_system.patterns.factory.UserFactory.createUser("faculty", (int) (short) -1, "Guest", "researcher", "", true);
        user6.setApproved(true);
        boolean boolean9 = user6.requiresDepartmentApproval();
        org.junit.Assert.assertNotNull(user6);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test0352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0352");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("data/test-users.csv");
        java.util.List<com.reservation_system.model.User> userList2 = userRepository1.getAllUsers();
        boolean boolean3 = userRepository1.headLabCoordinatorExists();
        boolean boolean4 = userRepository1.headLabCoordinatorExists();
        boolean boolean5 = userRepository1.headLabCoordinatorExists();
        java.util.List<com.reservation_system.model.User> userList6 = null;
        // The following exception was thrown during execution in test generation
        try {
            userRepository1.saveAllUsers(userList6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(userList2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
    }

    @Test
    public void test0353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0353");
        com.reservation_system.model.LabManager labManager5 = new com.reservation_system.model.LabManager((int) (byte) 100, "", "Guest", "faculty", false);
    }

    @Test
    public void test0354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0354");
        com.reservation_system.model.Researcher researcher5 = new com.reservation_system.model.Researcher((int) (short) -1, "labmanager", "test@example.com", "guest", false);
        boolean boolean6 = researcher5.isApproved();
        boolean boolean7 = researcher5.requiresDepartmentApproval();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test0355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0355");
        com.reservation_system.model.Student student5 = new com.reservation_system.model.Student(0, "Researcher", "student", "Guest", true);
        java.lang.String str6 = student5.getUserType();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Student" + "'", str6, "Student");
    }

    @Test
    public void test0356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0356");
        com.reservation_system.model.Researcher researcher5 = new com.reservation_system.model.Researcher(36, "faculty", "Password1!", "Andrew", true);
    }

    @Test
    public void test0357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0357");
        com.reservation_system.model.LabManager labManager5 = new com.reservation_system.model.LabManager((int) (short) 1, "faculty", "Password1!", "Student", false);
        java.lang.String str6 = labManager5.getName();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "faculty" + "'", str6, "faculty");
    }

    @Test
    public void test0358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0358");
        com.reservation_system.model.LabManager labManager5 = new com.reservation_system.model.LabManager((int) (short) -1, "Guest", "Andrew", "Student", false);
        java.lang.String str6 = labManager5.getName();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Guest" + "'", str6, "Guest");
    }

    @Test
    public void test0359() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0359");
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
        boolean boolean27 = userRepository1.headLabCoordinatorExists();
        org.junit.Assert.assertNotNull(userList2);
        org.junit.Assert.assertNotNull(userOptional5);
// flaky "42) test0359(com.reservation_system.Randoop.AuthService.RegressionTest0)":         org.junit.Assert.assertTrue("'" + int6 + "' != '" + 98 + "'", int6 == 98);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "student" + "'", str15, "student");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Researcher" + "'", str16, "Researcher");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "student" + "'", str17, "student");
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 10 + "'", int25 == 10);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
    }

    @Test
    public void test0360() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0360");
        com.reservation_system.model.Faculty faculty5 = new com.reservation_system.model.Faculty((int) '4', "Faculty", "guest", "hi!", false);
        java.lang.String str6 = faculty5.getUserType();
        faculty5.setApproved(false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Faculty" + "'", str6, "Faculty");
    }

    @Test
    public void test0361() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0361");
        com.reservation_system.model.Guest guest5 = new com.reservation_system.model.Guest((int) '#', "WrongPassword1!", "test@example.com", "data/test-users.csv", false);
        java.lang.String str6 = guest5.getPassword();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "data/test-users.csv" + "'", str6, "data/test-users.csv");
    }

    @Test
    public void test0362() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0362");
        com.reservation_system.model.Faculty faculty5 = new com.reservation_system.model.Faculty(100, "", "labmanager", "Guest", true);
        java.lang.String str6 = faculty5.getUserType();
        faculty5.setApproved(false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Faculty" + "'", str6, "Faculty");
    }

    @Test
    public void test0363() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0363");
        com.reservation_system.model.Faculty faculty5 = new com.reservation_system.model.Faculty((int) (byte) -1, "Researcher", "test@example.com", "Student", false);
    }

    @Test
    public void test0364() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0364");
        com.reservation_system.model.User user6 = com.reservation_system.patterns.factory.UserFactory.createUser("labmanager", (int) (byte) 100, "Password1!", "faculty", "data/test-users.csv", false);
        org.junit.Assert.assertNotNull(user6);
    }

    @Test
    public void test0365() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0365");
        com.reservation_system.model.User user6 = com.reservation_system.patterns.factory.UserFactory.createUser("Researcher", (int) (byte) 100, "guest", "Researcher", "test@example.com", false);
        java.lang.String str7 = user6.getEmail();
        java.lang.Class<?> wildcardClass8 = user6.getClass();
        org.junit.Assert.assertNotNull(user6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Researcher" + "'", str7, "Researcher");
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0366() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0366");
        com.reservation_system.model.User user6 = com.reservation_system.patterns.factory.UserFactory.createUser("Student", (int) ' ', "WrongPassword1!", "Guest", "data/test-users.csv", false);
        java.lang.Class<?> wildcardClass7 = user6.getClass();
        org.junit.Assert.assertNotNull(user6);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0367() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0367");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("data/test-users.csv");
        boolean boolean2 = userRepository1.headLabCoordinatorExists();
        boolean boolean3 = userRepository1.headLabCoordinatorExists();
        com.reservation_system.repository.UserRepository userRepository5 = new com.reservation_system.repository.UserRepository("data/test-users.csv");
        java.util.List<com.reservation_system.model.User> userList6 = userRepository5.getAllUsers();
        boolean boolean7 = userRepository5.headLabCoordinatorExists();
        com.reservation_system.model.Faculty faculty13 = new com.reservation_system.model.Faculty((int) 'a', "Faculty", "", "hi!", true);
        java.lang.String str14 = faculty13.getUserType();
        com.reservation_system.model.LabManager labManager20 = new com.reservation_system.model.LabManager((int) 'a', "Faculty", "", "", false);
        java.lang.String str21 = labManager20.getEmail();
        com.reservation_system.model.Researcher researcher27 = new com.reservation_system.model.Researcher((int) (short) -1, "headlabcoordinator", "student", "", false);
        boolean boolean28 = researcher27.isApproved();
        com.reservation_system.model.Faculty faculty34 = new com.reservation_system.model.Faculty((int) (short) 0, "Faculty", "headlabcoordinator", "", true);
        com.reservation_system.model.LabManager labManager40 = new com.reservation_system.model.LabManager((int) 'a', "Faculty", "", "", false);
        java.lang.String str41 = labManager40.getEmail();
        com.reservation_system.model.Faculty faculty47 = new com.reservation_system.model.Faculty(0, "headlabcoordinator", "student", "labmanager", false);
        java.lang.String str48 = faculty47.getName();
        java.lang.String str49 = faculty47.getName();
        com.reservation_system.model.LabManager labManager55 = new com.reservation_system.model.LabManager((int) 'a', "Faculty", "", "", false);
        java.lang.String str56 = labManager55.getEmail();
        com.reservation_system.model.Faculty faculty62 = new com.reservation_system.model.Faculty(10, "data/test-users.csv", "hi!", "", false);
        com.reservation_system.model.Faculty faculty68 = new com.reservation_system.model.Faculty(0, "headlabcoordinator", "student", "labmanager", false);
        java.lang.String str69 = faculty68.getName();
        java.lang.String str70 = faculty68.getName();
        java.lang.String str71 = faculty68.getName();
        com.reservation_system.model.Researcher researcher77 = new com.reservation_system.model.Researcher((int) (short) -1, "researcher", "test@example.com", "Faculty", true);
        boolean boolean78 = researcher77.requiresDepartmentApproval();
        com.reservation_system.model.Faculty faculty84 = new com.reservation_system.model.Faculty((int) 'a', "Faculty", "", "hi!", true);
        com.reservation_system.model.User[] userArray85 = new com.reservation_system.model.User[] { faculty13, labManager20, researcher27, faculty34, labManager40, faculty47, labManager55, faculty62, faculty68, researcher77, faculty84 };
        java.util.ArrayList<com.reservation_system.model.User> userList86 = new java.util.ArrayList<com.reservation_system.model.User>();
        boolean boolean87 = java.util.Collections.addAll((java.util.Collection<com.reservation_system.model.User>) userList86, userArray85);
        userRepository5.saveAllUsers((java.util.List<com.reservation_system.model.User>) userList86);
        int int89 = userRepository5.getNextID();
        java.util.List<com.reservation_system.model.User> userList90 = userRepository5.getAllUsers();
        userRepository1.saveAllUsers(userList90);
        boolean boolean92 = userRepository1.headLabCoordinatorExists();
        java.util.Optional<com.reservation_system.model.User> userOptional94 = userRepository1.findByEmail("student");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(userList6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Faculty" + "'", str14, "Faculty");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "" + "'", str41, "");
        org.junit.Assert.assertEquals("'" + str48 + "' != '" + "headlabcoordinator" + "'", str48, "headlabcoordinator");
        org.junit.Assert.assertEquals("'" + str49 + "' != '" + "headlabcoordinator" + "'", str49, "headlabcoordinator");
        org.junit.Assert.assertEquals("'" + str56 + "' != '" + "" + "'", str56, "");
        org.junit.Assert.assertEquals("'" + str69 + "' != '" + "headlabcoordinator" + "'", str69, "headlabcoordinator");
        org.junit.Assert.assertEquals("'" + str70 + "' != '" + "headlabcoordinator" + "'", str70, "headlabcoordinator");
        org.junit.Assert.assertEquals("'" + str71 + "' != '" + "headlabcoordinator" + "'", str71, "headlabcoordinator");
        org.junit.Assert.assertTrue("'" + boolean78 + "' != '" + true + "'", boolean78 == true);
        org.junit.Assert.assertNotNull(userArray85);
        org.junit.Assert.assertTrue("'" + boolean87 + "' != '" + true + "'", boolean87 == true);
        org.junit.Assert.assertTrue("'" + int89 + "' != '" + 98 + "'", int89 == 98);
        org.junit.Assert.assertNotNull(userList90);
        org.junit.Assert.assertTrue("'" + boolean92 + "' != '" + false + "'", boolean92 == false);
        org.junit.Assert.assertNotNull(userOptional94);
    }

    @Test
    public void test0368() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0368");
        com.reservation_system.model.Guest guest5 = new com.reservation_system.model.Guest((int) '#', "test@example.com", "Password1!", "test@example.com", true);
        java.lang.String str6 = guest5.getUserType();
        java.lang.String str7 = guest5.getUserType();
        java.lang.String str8 = guest5.getUserType();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Guest" + "'", str6, "Guest");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Guest" + "'", str7, "Guest");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Guest" + "'", str8, "Guest");
    }

    @Test
    public void test0369() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0369");
        com.reservation_system.model.Student student5 = new com.reservation_system.model.Student((int) (short) -1, "Andrew", "headlabcoordinator", "Faculty", true);
    }

    @Test
    public void test0370() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0370");
        com.reservation_system.model.Researcher researcher5 = new com.reservation_system.model.Researcher((int) (short) -1, "headlabcoordinator", "student", "", false);
        java.lang.String str6 = researcher5.getUserType();
        java.lang.String str7 = researcher5.getUserType();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Researcher" + "'", str6, "Researcher");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Researcher" + "'", str7, "Researcher");
    }

    @Test
    public void test0371() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0371");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("data/test-users.csv");
        java.util.List<com.reservation_system.model.User> userList2 = userRepository1.getAllUsers();
        com.reservation_system.repository.UserRepository userRepository4 = new com.reservation_system.repository.UserRepository("data/test-users.csv");
        java.util.List<com.reservation_system.model.User> userList5 = userRepository4.getAllUsers();
        com.reservation_system.services.AuthService authService6 = new com.reservation_system.services.AuthService(userRepository4);
        int int7 = userRepository4.getNextID();
        boolean boolean8 = userRepository4.headLabCoordinatorExists();
        com.reservation_system.repository.UserRepository userRepository10 = new com.reservation_system.repository.UserRepository("data/test-users.csv");
        java.util.List<com.reservation_system.model.User> userList11 = userRepository10.getAllUsers();
        boolean boolean12 = userRepository10.headLabCoordinatorExists();
        boolean boolean13 = userRepository10.headLabCoordinatorExists();
        java.util.List<com.reservation_system.model.User> userList14 = userRepository10.getAllUsers();
        userRepository4.saveAllUsers(userList14);
        userRepository1.saveAllUsers(userList14);
        com.reservation_system.services.AuthService authService17 = new com.reservation_system.services.AuthService(userRepository1);
        com.reservation_system.services.AuthService authService18 = new com.reservation_system.services.AuthService(userRepository1);
        // The following exception was thrown during execution in test generation
        try {
            com.reservation_system.model.User user21 = authService18.login("Researcher", "Student");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: No user found with that email.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(userList2);
        org.junit.Assert.assertNotNull(userList5);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 98 + "'", int7 == 98);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(userList11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(userList14);
    }

    @Test
    public void test0372() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0372");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("data/test-users.csv");
        java.util.List<com.reservation_system.model.User> userList2 = userRepository1.getAllUsers();
        boolean boolean3 = userRepository1.headLabCoordinatorExists();
        boolean boolean5 = userRepository1.emailExists("hi!");
        java.util.Optional<com.reservation_system.model.User> userOptional7 = userRepository1.findByEmail("Faculty");
        int int8 = userRepository1.getNextID();
        com.reservation_system.services.AuthService authService9 = new com.reservation_system.services.AuthService(userRepository1);
        com.reservation_system.model.LabManager labManager15 = new com.reservation_system.model.LabManager((int) (short) -1, "guest", "Student", "WrongPassword1!", false);
        java.lang.String str16 = labManager15.getUserType();
        boolean boolean17 = labManager15.requiresDepartmentApproval();
        userRepository1.addUser((com.reservation_system.model.User) labManager15);
        java.lang.String str19 = labManager15.getUserType();
        org.junit.Assert.assertNotNull(userList2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(userOptional7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 98 + "'", int8 == 98);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "labmanager" + "'", str16, "labmanager");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "labmanager" + "'", str19, "labmanager");
    }

    @Test
    public void test0373() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0373");
        com.reservation_system.model.Guest guest5 = new com.reservation_system.model.Guest(1, "Guest", "Password1!", "Password1!", true);
        java.lang.String str6 = guest5.getUserType();
        boolean boolean7 = guest5.requiresDepartmentApproval();
        java.lang.String str8 = guest5.getEmail();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Guest" + "'", str6, "Guest");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Password1!" + "'", str8, "Password1!");
    }

    @Test
    public void test0374() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0374");
        com.reservation_system.model.Student student5 = new com.reservation_system.model.Student(1, "researcher", "faculty", "Researcher", false);
    }

    @Test
    public void test0375() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0375");
        com.reservation_system.model.User user6 = com.reservation_system.patterns.factory.UserFactory.createUser("Faculty", (int) (byte) 1, "WrongPassword1!", "", "WrongPassword1!", false);
        org.junit.Assert.assertNotNull(user6);
    }

    @Test
    public void test0376() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0376");
        com.reservation_system.model.Student student5 = new com.reservation_system.model.Student((int) 'a', "headlabcoordinator", "Faculty", "Guest", false);
        java.lang.String str6 = student5.getUserType();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Student" + "'", str6, "Student");
    }

    @Test
    public void test0377() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0377");
        com.reservation_system.model.Faculty faculty5 = new com.reservation_system.model.Faculty(0, "headlabcoordinator", "student", "labmanager", false);
        boolean boolean6 = faculty5.requiresDepartmentApproval();
        int int7 = faculty5.getID();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test0378() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0378");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("data/test-users.csv");
        java.util.List<com.reservation_system.model.User> userList2 = userRepository1.getAllUsers();
        com.reservation_system.services.AuthService authService3 = new com.reservation_system.services.AuthService(userRepository1);
        com.reservation_system.model.LabManager labManager9 = new com.reservation_system.model.LabManager((int) (short) 0, "", "student", "Andrew", true);
        boolean boolean10 = labManager9.isApproved();
        userRepository1.addUser((com.reservation_system.model.User) labManager9);
        boolean boolean13 = userRepository1.emailExists("Researcher");
        java.util.List<com.reservation_system.model.User> userList14 = userRepository1.getAllUsers();
        com.reservation_system.services.AuthService authService15 = new com.reservation_system.services.AuthService(userRepository1);
        // The following exception was thrown during execution in test generation
        try {
            com.reservation_system.model.User user18 = authService15.login("data/test-users.csv", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: No user found with that email.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(userList2);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(userList14);
    }

    @Test
    public void test0379() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0379");
        com.reservation_system.model.Guest guest5 = new com.reservation_system.model.Guest((-1), "test@example.com", "test@example.com", "student", false);
    }

    @Test
    public void test0380() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0380");
        com.reservation_system.model.Guest guest5 = new com.reservation_system.model.Guest((int) '#', "test@example.com", "Password1!", "test@example.com", true);
        java.lang.String str6 = guest5.getName();
        java.lang.String str7 = guest5.getName();
        java.lang.String str8 = guest5.getUserType();
        java.lang.String str9 = guest5.getUserType();
        java.lang.String str10 = guest5.getUserType();
        java.lang.String str11 = guest5.getPassword();
        java.lang.String str12 = guest5.getUserType();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Guest" + "'", str8, "Guest");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Guest" + "'", str9, "Guest");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Guest" + "'", str10, "Guest");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Guest" + "'", str12, "Guest");
    }

    @Test
    public void test0381() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0381");
        com.reservation_system.model.HeadLabCoordinator headLabCoordinator5 = new com.reservation_system.model.HeadLabCoordinator((int) '#', "Guest", "labmanager", "student", false);
    }

    @Test
    public void test0382() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0382");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("data/test-users.csv");
        java.util.List<com.reservation_system.model.User> userList2 = userRepository1.getAllUsers();
        com.reservation_system.services.AuthService authService3 = new com.reservation_system.services.AuthService(userRepository1);
        java.util.Optional<com.reservation_system.model.User> userOptional5 = userRepository1.findByEmail("");
        java.util.List<com.reservation_system.model.User> userList6 = userRepository1.getAllUsers();
        boolean boolean8 = userRepository1.emailExists("labmanager");
        boolean boolean10 = userRepository1.emailExists("test@example.com");
        org.junit.Assert.assertNotNull(userList2);
        org.junit.Assert.assertNotNull(userOptional5);
        org.junit.Assert.assertNotNull(userList6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test0383() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0383");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("data/test-users.csv");
        java.util.List<com.reservation_system.model.User> userList2 = userRepository1.getAllUsers();
        boolean boolean3 = userRepository1.headLabCoordinatorExists();
        boolean boolean5 = userRepository1.emailExists("hi!");
        boolean boolean6 = userRepository1.headLabCoordinatorExists();
        org.junit.Assert.assertNotNull(userList2);
// flaky "43) test0383(com.reservation_system.Randoop.AuthService.RegressionTest0)":         org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
// flaky "23) test0383(com.reservation_system.Randoop.AuthService.RegressionTest0)":         org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test0384() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0384");
        com.reservation_system.model.Researcher researcher5 = new com.reservation_system.model.Researcher(98, "Guest", "researcher", "hi!", true);
    }

    @Test
    public void test0385() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0385");
        com.reservation_system.model.Researcher researcher5 = new com.reservation_system.model.Researcher((int) '4', "", "", "labmanager", false);
        boolean boolean6 = researcher5.isApproved();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test0386() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0386");
        com.reservation_system.model.LabManager labManager5 = new com.reservation_system.model.LabManager(99, "Researcher", "faculty", "faculty", false);
    }

    @Test
    public void test0387() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0387");
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
        boolean boolean93 = userRepository1.emailExists("labmanager");
        org.junit.Assert.assertNotNull(userList2);
// flaky "44) test0387(com.reservation_system.Randoop.AuthService.RegressionTest0)":         org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
// flaky "24) test0387(com.reservation_system.Randoop.AuthService.RegressionTest0)":         org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
// flaky "16) test0387(com.reservation_system.Randoop.AuthService.RegressionTest0)":         org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(userList8);
// flaky "7) test0387(com.reservation_system.Randoop.AuthService.RegressionTest0)":         org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
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
        org.junit.Assert.assertTrue("'" + boolean93 + "' != '" + false + "'", boolean93 == false);
    }

    @Test
    public void test0388() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0388");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("data/test-users.csv");
        java.util.List<com.reservation_system.model.User> userList2 = userRepository1.getAllUsers();
        com.reservation_system.services.AuthService authService3 = new com.reservation_system.services.AuthService(userRepository1);
        com.reservation_system.services.AuthService authService4 = new com.reservation_system.services.AuthService(userRepository1);
        com.reservation_system.services.AuthService authService5 = new com.reservation_system.services.AuthService(userRepository1);
        boolean boolean6 = userRepository1.headLabCoordinatorExists();
        java.util.Optional<com.reservation_system.model.User> userOptional8 = userRepository1.findByEmail("faculty");
        java.lang.Class<?> wildcardClass9 = userRepository1.getClass();
        org.junit.Assert.assertNotNull(userList2);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(userOptional8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0389() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0389");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("data/test-users.csv");
        java.util.List<com.reservation_system.model.User> userList2 = userRepository1.getAllUsers();
        com.reservation_system.services.AuthService authService3 = new com.reservation_system.services.AuthService(userRepository1);
        com.reservation_system.model.LabManager labManager9 = new com.reservation_system.model.LabManager((int) (short) 0, "", "student", "Andrew", true);
        boolean boolean10 = labManager9.isApproved();
        userRepository1.addUser((com.reservation_system.model.User) labManager9);
        com.reservation_system.services.AuthService authService12 = new com.reservation_system.services.AuthService(userRepository1);
        int int13 = userRepository1.getNextID();
        boolean boolean15 = userRepository1.emailExists("");
        org.junit.Assert.assertNotNull(userList2);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 98 + "'", int13 == 98);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
    }

    @Test
    public void test0390() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0390");
        com.reservation_system.model.HeadLabCoordinator headLabCoordinator5 = new com.reservation_system.model.HeadLabCoordinator(10, "headlabcoordinator", "data/test-users.csv", "faculty", false);
        int int6 = headLabCoordinator5.getID();
        boolean boolean7 = headLabCoordinator5.isApproved();
        boolean boolean8 = headLabCoordinator5.isApproved();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test0391() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0391");
        com.reservation_system.model.Faculty faculty5 = new com.reservation_system.model.Faculty(0, "headlabcoordinator", "student", "labmanager", false);
        java.lang.String str6 = faculty5.getName();
        java.lang.String str7 = faculty5.getName();
        java.lang.String str8 = faculty5.getName();
        java.lang.String str9 = faculty5.getUserType();
        java.lang.String str10 = faculty5.getUserType();
        java.lang.Class<?> wildcardClass11 = faculty5.getClass();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "headlabcoordinator" + "'", str6, "headlabcoordinator");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "headlabcoordinator" + "'", str7, "headlabcoordinator");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "headlabcoordinator" + "'", str8, "headlabcoordinator");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Faculty" + "'", str9, "Faculty");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Faculty" + "'", str10, "Faculty");
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0392() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0392");
        com.reservation_system.model.Guest guest5 = new com.reservation_system.model.Guest((int) (short) 10, "hi!", "faculty", "student", true);
    }

    @Test
    public void test0393() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0393");
        com.reservation_system.model.HeadLabCoordinator headLabCoordinator5 = new com.reservation_system.model.HeadLabCoordinator((int) (byte) 0, "test@example.com", "Guest", "WrongPassword1!", false);
        boolean boolean6 = headLabCoordinator5.isApproved();
        java.lang.String str7 = headLabCoordinator5.getUserType();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "headlabcoordinator" + "'", str7, "headlabcoordinator");
    }

    @Test
    public void test0394() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0394");
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
        java.util.Optional<com.reservation_system.model.User> userOptional17 = userRepository1.findByEmail("data/test-users.csv");
        boolean boolean18 = userRepository1.headLabCoordinatorExists();
        java.util.List<com.reservation_system.model.User> userList19 = userRepository1.getAllUsers();
        org.junit.Assert.assertNotNull(userList2);
        org.junit.Assert.assertNotNull(userList3);
        org.junit.Assert.assertNotNull(userList6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(userList10);
        org.junit.Assert.assertNotNull(userList11);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(userOptional17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(userList19);
    }

    @Test
    public void test0395() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0395");
        com.reservation_system.model.Faculty faculty5 = new com.reservation_system.model.Faculty(100, "", "Guest", "Password1!", true);
        java.lang.String str6 = faculty5.getUserType();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Faculty" + "'", str6, "Faculty");
    }

    @Test
    public void test0396() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0396");
        com.reservation_system.model.Researcher researcher5 = new com.reservation_system.model.Researcher((int) (byte) 10, "Password1!", "Andrew", "hi!", true);
    }

    @Test
    public void test0397() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0397");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("data/test-users.csv");
        java.util.List<com.reservation_system.model.User> userList2 = userRepository1.getAllUsers();
        boolean boolean3 = userRepository1.headLabCoordinatorExists();
        boolean boolean5 = userRepository1.emailExists("hi!");
        java.util.Optional<com.reservation_system.model.User> userOptional7 = userRepository1.findByEmail("Faculty");
        int int8 = userRepository1.getNextID();
        com.reservation_system.services.AuthService authService9 = new com.reservation_system.services.AuthService(userRepository1);
        // The following exception was thrown during execution in test generation
        try {
            com.reservation_system.model.User user12 = authService9.login("headlabcoordinator", "Faculty");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Incorrect password.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(userList2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(userOptional7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 98 + "'", int8 == 98);
    }

    @Test
    public void test0398() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0398");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("data/test-users.csv");
        java.util.List<com.reservation_system.model.User> userList2 = userRepository1.getAllUsers();
        java.util.List<com.reservation_system.model.User> userList3 = userRepository1.getAllUsers();
        com.reservation_system.model.Faculty faculty9 = new com.reservation_system.model.Faculty(10, "data/test-users.csv", "hi!", "", false);
        java.lang.String str10 = faculty9.getUserType();
        userRepository1.addUser((com.reservation_system.model.User) faculty9);
        java.util.Optional<com.reservation_system.model.User> userOptional13 = userRepository1.findByEmail("faculty");
        java.util.List<com.reservation_system.model.User> userList14 = userRepository1.getAllUsers();
        int int15 = userRepository1.getNextID();
        org.junit.Assert.assertNotNull(userList2);
        org.junit.Assert.assertNotNull(userList3);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Faculty" + "'", str10, "Faculty");
        org.junit.Assert.assertNotNull(userOptional13);
        org.junit.Assert.assertNotNull(userList14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 98 + "'", int15 == 98);
    }

    @Test
    public void test0399() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0399");
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
        com.reservation_system.repository.UserRepository userRepository20 = new com.reservation_system.repository.UserRepository("data/test-users.csv");
        java.util.List<com.reservation_system.model.User> userList21 = userRepository20.getAllUsers();
        userRepository1.saveAllUsers(userList21);
        java.lang.Class<?> wildcardClass23 = userRepository1.getClass();
        org.junit.Assert.assertNotNull(userList2);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(userList14);
        org.junit.Assert.assertNotNull(userList15);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(userList21);
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test0400() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0400");
        com.reservation_system.model.Guest guest5 = new com.reservation_system.model.Guest((int) '#', "test@example.com", "Password1!", "test@example.com", true);
        java.lang.String str6 = guest5.getName();
        java.lang.String str7 = guest5.getName();
        java.lang.String str8 = guest5.getUserType();
        java.lang.String str9 = guest5.getUserType();
        java.lang.String str10 = guest5.getUserType();
        java.lang.String str11 = guest5.getPassword();
        java.lang.Class<?> wildcardClass12 = guest5.getClass();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Guest" + "'", str8, "Guest");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Guest" + "'", str9, "Guest");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Guest" + "'", str10, "Guest");
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0401() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0401");
        // The following exception was thrown during execution in test generation
        try {
            com.reservation_system.model.User user6 = com.reservation_system.patterns.factory.UserFactory.createUser("hi!", (int) (byte) 0, "labmanager", "Andrew", "Password1!", false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid user type: hi!");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0402() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0402");
        com.reservation_system.model.Researcher researcher5 = new com.reservation_system.model.Researcher(52, "researcher", "test@example.com", "", false);
    }

    @Test
    public void test0403() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0403");
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
        boolean boolean23 = userRepository1.emailExists("test@example.com");
        org.junit.Assert.assertNotNull(userList2);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
    }

    @Test
    public void test0404() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0404");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("data/test-users.csv");
        java.util.List<com.reservation_system.model.User> userList2 = userRepository1.getAllUsers();
        java.util.List<com.reservation_system.model.User> userList3 = userRepository1.getAllUsers();
        com.reservation_system.services.AuthService authService4 = new com.reservation_system.services.AuthService(userRepository1);
        java.util.Optional<com.reservation_system.model.User> userOptional6 = userRepository1.findByEmail("faculty");
        boolean boolean7 = userRepository1.headLabCoordinatorExists();
        boolean boolean9 = userRepository1.emailExists("headlabcoordinator");
        org.junit.Assert.assertNotNull(userList2);
        org.junit.Assert.assertNotNull(userList3);
        org.junit.Assert.assertNotNull(userOptional6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test0405() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0405");
        com.reservation_system.model.HeadLabCoordinator headLabCoordinator5 = new com.reservation_system.model.HeadLabCoordinator((int) (short) 100, "Researcher", "guest", "researcher", true);
        java.lang.String str6 = headLabCoordinator5.getUserType();
        java.lang.String str7 = headLabCoordinator5.getPassword();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "headlabcoordinator" + "'", str6, "headlabcoordinator");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "researcher" + "'", str7, "researcher");
    }

    @Test
    public void test0406() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0406");
        com.reservation_system.model.Researcher researcher5 = new com.reservation_system.model.Researcher(52, "Andrew", "test@example.com", "WrongPassword1!", true);
    }

    @Test
    public void test0407() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0407");
        com.reservation_system.model.LabManager labManager5 = new com.reservation_system.model.LabManager((int) (byte) 100, "Faculty", "Password1!", "Student", true);
        java.lang.String str6 = labManager5.getEmail();
        labManager5.setApproved(true);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Password1!" + "'", str6, "Password1!");
    }

    @Test
    public void test0408() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0408");
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
            com.reservation_system.model.User user98 = authService95.login("student", "data/test-users.csv");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Incorrect password.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(userList2);
// flaky "45) test0408(com.reservation_system.Randoop.AuthService.RegressionTest0)":         org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
// flaky "25) test0408(com.reservation_system.Randoop.AuthService.RegressionTest0)":         org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
// flaky "17) test0408(com.reservation_system.Randoop.AuthService.RegressionTest0)":         org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(userList8);
// flaky "8) test0408(com.reservation_system.Randoop.AuthService.RegressionTest0)":         org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
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
    public void test0409() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0409");
        com.reservation_system.model.LabManager labManager5 = new com.reservation_system.model.LabManager(0, "researcher", "headlabcoordinator", "Andrew", true);
        java.lang.String str6 = labManager5.getUserType();
        java.lang.String str7 = labManager5.getUserType();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "labmanager" + "'", str6, "labmanager");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "labmanager" + "'", str7, "labmanager");
    }

    @Test
    public void test0410() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0410");
        com.reservation_system.model.Faculty faculty5 = new com.reservation_system.model.Faculty((int) (short) 1, "Researcher", "Researcher", "Andrew", false);
    }

    @Test
    public void test0411() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0411");
        com.reservation_system.model.Guest guest5 = new com.reservation_system.model.Guest((int) (byte) 100, "Password1!", "Guest", "Guest", true);
        java.lang.String str6 = guest5.getUserType();
        int int7 = guest5.getID();
        java.lang.String str8 = guest5.getUserType();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Guest" + "'", str6, "Guest");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 100 + "'", int7 == 100);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Guest" + "'", str8, "Guest");
    }

    @Test
    public void test0412() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0412");
        com.reservation_system.model.Student student5 = new com.reservation_system.model.Student((int) (short) -1, "", "data/test-users.csv", "test@example.com", false);
    }

    @Test
    public void test0413() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0413");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("data/test-users.csv");
        java.util.List<com.reservation_system.model.User> userList2 = userRepository1.getAllUsers();
        boolean boolean3 = userRepository1.headLabCoordinatorExists();
        boolean boolean5 = userRepository1.emailExists("hi!");
        java.util.Optional<com.reservation_system.model.User> userOptional7 = userRepository1.findByEmail("Faculty");
        int int8 = userRepository1.getNextID();
        com.reservation_system.services.AuthService authService9 = new com.reservation_system.services.AuthService(userRepository1);
        // The following exception was thrown during execution in test generation
        try {
            com.reservation_system.model.User user12 = authService9.login("", "guest");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Email is required.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(userList2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(userOptional7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 98 + "'", int8 == 98);
    }

    @Test
    public void test0414() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0414");
        com.reservation_system.model.HeadLabCoordinator headLabCoordinator5 = new com.reservation_system.model.HeadLabCoordinator((int) (short) 100, "Researcher", "guest", "researcher", true);
        java.lang.String str6 = headLabCoordinator5.getUserType();
        java.lang.String str7 = headLabCoordinator5.getUserType();
        java.lang.String str8 = headLabCoordinator5.getEmail();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "headlabcoordinator" + "'", str6, "headlabcoordinator");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "headlabcoordinator" + "'", str7, "headlabcoordinator");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "guest" + "'", str8, "guest");
    }

    @Test
    public void test0415() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0415");
        com.reservation_system.model.Student student5 = new com.reservation_system.model.Student(52, "Faculty", "Andrew", "guest", false);
    }

    @Test
    public void test0416() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0416");
        com.reservation_system.model.HeadLabCoordinator headLabCoordinator5 = new com.reservation_system.model.HeadLabCoordinator(98, "WrongPassword1!", "faculty", "Andrew", false);
    }

    @Test
    public void test0417() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0417");
        com.reservation_system.model.Faculty faculty5 = new com.reservation_system.model.Faculty(97, "Researcher", "hi!", "", true);
    }

    @Test
    public void test0418() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0418");
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
        faculty91.setApproved(false);
        boolean boolean96 = faculty91.requiresDepartmentApproval();
        org.junit.Assert.assertNotNull(userList2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
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
        org.junit.Assert.assertTrue("'" + boolean96 + "' != '" + true + "'", boolean96 == true);
    }

    @Test
    public void test0419() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0419");
        com.reservation_system.model.HeadLabCoordinator headLabCoordinator5 = new com.reservation_system.model.HeadLabCoordinator((int) (byte) 1, "Faculty", "", "labmanager", true);
    }

    @Test
    public void test0420() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0420");
        com.reservation_system.model.LabManager labManager5 = new com.reservation_system.model.LabManager(99, "Password1!", "labmanager", "Student", false);
        boolean boolean6 = labManager5.requiresDepartmentApproval();
        java.lang.String str7 = labManager5.getUserType();
        java.lang.Class<?> wildcardClass8 = labManager5.getClass();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "labmanager" + "'", str7, "labmanager");
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0421() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0421");
        com.reservation_system.model.LabManager labManager5 = new com.reservation_system.model.LabManager((int) (byte) 100, "Andrew", "data/test-users.csv", "Faculty", false);
    }

    @Test
    public void test0422() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0422");
        com.reservation_system.model.Faculty faculty5 = new com.reservation_system.model.Faculty(10, "", "guest", "Andrew", true);
    }

    @Test
    public void test0423() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0423");
        com.reservation_system.model.Faculty faculty5 = new com.reservation_system.model.Faculty((int) (byte) 0, "WrongPassword1!", "Andrew", "Student", true);
    }

    @Test
    public void test0424() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0424");
        // The following exception was thrown during execution in test generation
        try {
            com.reservation_system.model.User user6 = com.reservation_system.patterns.factory.UserFactory.createUser("Password1!", (int) ' ', "headlabcoordinator", "Faculty", "Researcher", false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid user type: Password1!");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0425() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0425");
        com.reservation_system.model.LabManager labManager5 = new com.reservation_system.model.LabManager((int) (byte) 10, "data/test-users.csv", "headlabcoordinator", "Andrew", true);
    }

    @Test
    public void test0426() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0426");
        com.reservation_system.model.LabManager labManager5 = new com.reservation_system.model.LabManager((int) 'a', "Faculty", "", "", false);
        java.lang.String str6 = labManager5.getUserType();
        java.lang.String str7 = labManager5.getEmail();
        java.lang.String str8 = labManager5.getEmail();
        java.lang.String str9 = labManager5.getName();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "labmanager" + "'", str6, "labmanager");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Faculty" + "'", str9, "Faculty");
    }

    @Test
    public void test0427() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0427");
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
        java.lang.Class<?> wildcardClass19 = authService18.getClass();
        org.junit.Assert.assertNotNull(userList2);
// flaky "46) test0427(com.reservation_system.Randoop.AuthService.RegressionTest0)":         org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(userList6);
        org.junit.Assert.assertNotNull(userList7);
        org.junit.Assert.assertNotNull(userList11);
// flaky "26) test0427(com.reservation_system.Randoop.AuthService.RegressionTest0)":         org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
// flaky "18) test0427(com.reservation_system.Randoop.AuthService.RegressionTest0)":         org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(userList14);
// flaky "9) test0427(com.reservation_system.Randoop.AuthService.RegressionTest0)":         org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
// flaky "3) test0427(com.reservation_system.Randoop.AuthService.RegressionTest0)":         org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test0428() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0428");
        com.reservation_system.model.Faculty faculty5 = new com.reservation_system.model.Faculty((int) (short) 1, "", "test@example.com", "student", false);
        int int6 = faculty5.getID();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
    }

    @Test
    public void test0429() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0429");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("data/test-users.csv");
        java.util.List<com.reservation_system.model.User> userList2 = userRepository1.getAllUsers();
        com.reservation_system.services.AuthService authService3 = new com.reservation_system.services.AuthService(userRepository1);
        com.reservation_system.services.AuthService authService4 = new com.reservation_system.services.AuthService(userRepository1);
        com.reservation_system.services.AuthService authService5 = new com.reservation_system.services.AuthService(userRepository1);
        com.reservation_system.model.LabManager labManager11 = new com.reservation_system.model.LabManager((int) (short) 0, "", "student", "Andrew", true);
        java.lang.String str12 = labManager11.getUserType();
        userRepository1.addUser((com.reservation_system.model.User) labManager11);
        java.lang.String str14 = labManager11.getUserType();
        org.junit.Assert.assertNotNull(userList2);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "labmanager" + "'", str12, "labmanager");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "labmanager" + "'", str14, "labmanager");
    }

    @Test
    public void test0430() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0430");
        com.reservation_system.model.Faculty faculty5 = new com.reservation_system.model.Faculty((int) (byte) 0, "guest", "WrongPassword1!", "Andrew", true);
        java.lang.String str6 = faculty5.getUserType();
        int int7 = faculty5.getID();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Faculty" + "'", str6, "Faculty");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test0431() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0431");
        com.reservation_system.model.LabManager labManager5 = new com.reservation_system.model.LabManager((int) '4', "Student", "faculty", "WrongPassword1!", true);
    }

    @Test
    public void test0432() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0432");
        com.reservation_system.model.Student student5 = new com.reservation_system.model.Student((int) (short) 0, "WrongPassword1!", "guest", "hi!", true);
    }

    @Test
    public void test0433() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0433");
        com.reservation_system.model.Guest guest5 = new com.reservation_system.model.Guest(97, "faculty", "", "guest", true);
    }

    @Test
    public void test0434() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0434");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("data/test-users.csv");
        java.util.List<com.reservation_system.model.User> userList2 = userRepository1.getAllUsers();
        com.reservation_system.services.AuthService authService3 = new com.reservation_system.services.AuthService(userRepository1);
        java.util.Optional<com.reservation_system.model.User> userOptional5 = userRepository1.findByEmail("");
        java.util.List<com.reservation_system.model.User> userList6 = userRepository1.getAllUsers();
        boolean boolean8 = userRepository1.emailExists("labmanager");
        com.reservation_system.services.AuthService authService9 = new com.reservation_system.services.AuthService(userRepository1);
        // The following exception was thrown during execution in test generation
        try {
            com.reservation_system.model.User user12 = authService9.login("Guest", "");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Password is required.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(userList2);
        org.junit.Assert.assertNotNull(userOptional5);
        org.junit.Assert.assertNotNull(userList6);
// flaky "47) test0434(com.reservation_system.Randoop.AuthService.RegressionTest0)":         org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test0435() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0435");
        com.reservation_system.model.Researcher researcher5 = new com.reservation_system.model.Researcher((int) (short) 1, "researcher", "", "", false);
        researcher5.setApproved(false);
        java.lang.Class<?> wildcardClass8 = researcher5.getClass();
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0436() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0436");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("data/test-users.csv");
        java.util.List<com.reservation_system.model.User> userList2 = userRepository1.getAllUsers();
        java.util.Optional<com.reservation_system.model.User> userOptional4 = userRepository1.findByEmail("headlabcoordinator");
        org.junit.Assert.assertNotNull(userList2);
        org.junit.Assert.assertNotNull(userOptional4);
    }

    @Test
    public void test0437() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0437");
        com.reservation_system.model.Guest guest5 = new com.reservation_system.model.Guest((int) (short) 100, "guest", "student", "Faculty", false);
    }

    @Test
    public void test0438() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0438");
        com.reservation_system.model.HeadLabCoordinator headLabCoordinator5 = new com.reservation_system.model.HeadLabCoordinator((int) (byte) 0, "test@example.com", "", "test@example.com", true);
        java.lang.Class<?> wildcardClass6 = headLabCoordinator5.getClass();
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0439() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0439");
        com.reservation_system.model.LabManager labManager5 = new com.reservation_system.model.LabManager((int) (short) -1, "Student", "test@example.com", "hi!", true);
    }

    @Test
    public void test0440() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0440");
        com.reservation_system.model.LabManager labManager5 = new com.reservation_system.model.LabManager((int) (byte) 0, "guest", "test@example.com", "hi!", false);
        java.lang.String str6 = labManager5.getUserType();
        int int7 = labManager5.getID();
        java.lang.String str8 = labManager5.getName();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "labmanager" + "'", str6, "labmanager");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "guest" + "'", str8, "guest");
    }

    @Test
    public void test0441() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0441");
        com.reservation_system.model.User user6 = com.reservation_system.patterns.factory.UserFactory.createUser("Guest", 101, "hi!", "researcher", "test@example.com", true);
        org.junit.Assert.assertNotNull(user6);
    }

    @Test
    public void test0442() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0442");
        com.reservation_system.model.Researcher researcher5 = new com.reservation_system.model.Researcher(101, "data/test-users.csv", "data/test-users.csv", "test@example.com", false);
        java.lang.String str6 = researcher5.getUserType();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Researcher" + "'", str6, "Researcher");
    }

    @Test
    public void test0443() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0443");
        com.reservation_system.model.Researcher researcher5 = new com.reservation_system.model.Researcher((int) 'a', "hi!", "researcher", "researcher", false);
        java.lang.String str6 = researcher5.getEmail();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "researcher" + "'", str6, "researcher");
    }

    @Test
    public void test0444() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0444");
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
        java.lang.String str19 = researcher13.getUserType();
        org.junit.Assert.assertNotNull(userList2);
        org.junit.Assert.assertNotNull(userOptional5);
// flaky "48) test0444(com.reservation_system.Randoop.AuthService.RegressionTest0)":         org.junit.Assert.assertTrue("'" + int6 + "' != '" + 101 + "'", int6 == 101);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "student" + "'", str15, "student");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Researcher" + "'", str16, "Researcher");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "student" + "'", str17, "student");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "Researcher" + "'", str19, "Researcher");
    }

    @Test
    public void test0445() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0445");
        com.reservation_system.model.Guest guest5 = new com.reservation_system.model.Guest(1, "Guest", "Password1!", "Password1!", true);
        java.lang.String str6 = guest5.getUserType();
        java.lang.String str7 = guest5.getUserType();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Guest" + "'", str6, "Guest");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Guest" + "'", str7, "Guest");
    }

    @Test
    public void test0446() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0446");
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
        java.util.Optional<com.reservation_system.model.User> userOptional18 = userRepository1.findByEmail("guest");
        org.junit.Assert.assertNotNull(userList2);
// flaky "49) test0446(com.reservation_system.Randoop.AuthService.RegressionTest0)":         org.junit.Assert.assertTrue("'" + int4 + "' != '" + 101 + "'", int4 == 101);
// flaky "27) test0446(com.reservation_system.Randoop.AuthService.RegressionTest0)":         org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(userList8);
// flaky "19) test0446(com.reservation_system.Randoop.AuthService.RegressionTest0)":         org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
// flaky "10) test0446(com.reservation_system.Randoop.AuthService.RegressionTest0)":         org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(userList11);
        org.junit.Assert.assertNotNull(userOptional14);
        org.junit.Assert.assertNotNull(userOptional16);
        org.junit.Assert.assertNotNull(userOptional18);
    }

    @Test
    public void test0447() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0447");
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
        java.lang.Class<?> wildcardClass52 = userList51.getClass();
        org.junit.Assert.assertNotNull(userList2);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
// flaky "50) test0447(com.reservation_system.Randoop.AuthService.RegressionTest0)":         org.junit.Assert.assertTrue("'" + int19 + "' != '" + 101 + "'", int19 == 101);
// flaky "28) test0447(com.reservation_system.Randoop.AuthService.RegressionTest0)":         org.junit.Assert.assertTrue("'" + int20 + "' != '" + 101 + "'", int20 == 101);
        org.junit.Assert.assertNotNull(userList23);
        org.junit.Assert.assertNotNull(userList24);
        org.junit.Assert.assertNotNull(userList28);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
// flaky "20) test0447(com.reservation_system.Randoop.AuthService.RegressionTest0)":         org.junit.Assert.assertTrue("'" + int45 + "' != '" + 101 + "'", int45 == 101);
// flaky "11) test0447(com.reservation_system.Randoop.AuthService.RegressionTest0)":         org.junit.Assert.assertTrue("'" + int46 + "' != '" + 101 + "'", int46 == 101);
        org.junit.Assert.assertNotNull(userList47);
        org.junit.Assert.assertNotNull(userList49);
        org.junit.Assert.assertNotNull(userList51);
        org.junit.Assert.assertNotNull(wildcardClass52);
    }

    @Test
    public void test0448() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0448");
        com.reservation_system.model.Guest guest5 = new com.reservation_system.model.Guest((int) (short) 0, "hi!", "data/test-users.csv", "", false);
    }

    @Test
    public void test0449() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0449");
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
        java.util.Optional<com.reservation_system.model.User> userOptional16 = userRepository1.findByEmail("faculty");
        org.junit.Assert.assertNotNull(userList2);
        org.junit.Assert.assertNotNull(userList3);
        org.junit.Assert.assertNotNull(userList6);
// flaky "51) test0449(com.reservation_system.Randoop.AuthService.RegressionTest0)":         org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(userList10);
        org.junit.Assert.assertNotNull(userList11);
        org.junit.Assert.assertNotNull(userList14);
        org.junit.Assert.assertNotNull(userOptional16);
    }

    @Test
    public void test0450() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0450");
        com.reservation_system.model.Faculty faculty5 = new com.reservation_system.model.Faculty(52, "Researcher", "data/test-users.csv", "WrongPassword1!", true);
    }

    @Test
    public void test0451() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0451");
        com.reservation_system.model.Faculty faculty5 = new com.reservation_system.model.Faculty(98, "WrongPassword1!", "researcher", "Password1!", true);
    }

    @Test
    public void test0452() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0452");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("data/test-users.csv");
        java.util.List<com.reservation_system.model.User> userList2 = userRepository1.getAllUsers();
        com.reservation_system.services.AuthService authService3 = new com.reservation_system.services.AuthService(userRepository1);
        com.reservation_system.services.AuthService authService4 = new com.reservation_system.services.AuthService(userRepository1);
        boolean boolean5 = userRepository1.headLabCoordinatorExists();
        com.reservation_system.model.Faculty faculty11 = new com.reservation_system.model.Faculty((int) 'a', "Faculty", "", "hi!", true);
        int int12 = faculty11.getID();
        userRepository1.addUser((com.reservation_system.model.User) faculty11);
        java.lang.String str14 = faculty11.getUserType();
        org.junit.Assert.assertNotNull(userList2);
// flaky "52) test0452(com.reservation_system.Randoop.AuthService.RegressionTest0)":         org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 97 + "'", int12 == 97);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Faculty" + "'", str14, "Faculty");
    }

    @Test
    public void test0453() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0453");
        com.reservation_system.model.Researcher researcher5 = new com.reservation_system.model.Researcher((int) (short) -1, "headlabcoordinator", "student", "", false);
        boolean boolean6 = researcher5.isApproved();
        java.lang.String str7 = researcher5.getEmail();
        java.lang.String str8 = researcher5.getUserType();
        java.lang.String str9 = researcher5.getEmail();
        boolean boolean10 = researcher5.isApproved();
        java.lang.Class<?> wildcardClass11 = researcher5.getClass();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "student" + "'", str7, "student");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Researcher" + "'", str8, "Researcher");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "student" + "'", str9, "student");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0454() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0454");
        com.reservation_system.model.Researcher researcher5 = new com.reservation_system.model.Researcher((int) (short) -1, "headlabcoordinator", "student", "", false);
        java.lang.String str6 = researcher5.getUserType();
        boolean boolean7 = researcher5.isApproved();
        java.lang.String str8 = researcher5.getEmail();
        boolean boolean9 = researcher5.requiresDepartmentApproval();
        boolean boolean10 = researcher5.isApproved();
        boolean boolean11 = researcher5.isApproved();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Researcher" + "'", str6, "Researcher");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "student" + "'", str8, "student");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test0455() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0455");
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
        java.lang.String str29 = faculty22.getUserType();
        org.junit.Assert.assertNotNull(userList2);
        org.junit.Assert.assertNotNull(userList3);
        org.junit.Assert.assertNotNull(userList6);
// flaky "53) test0455(com.reservation_system.Randoop.AuthService.RegressionTest0)":         org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(userList10);
        org.junit.Assert.assertNotNull(userList11);
        org.junit.Assert.assertNotNull(userList14);
        org.junit.Assert.assertNotNull(userList15);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "Faculty" + "'", str23, "Faculty");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "Faculty" + "'", str24, "Faculty");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "Faculty" + "'", str25, "Faculty");
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "Faculty" + "'", str29, "Faculty");
    }

    @Test
    public void test0456() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0456");
        // The following exception was thrown during execution in test generation
        try {
            com.reservation_system.model.User user6 = com.reservation_system.patterns.factory.UserFactory.createUser("WrongPassword1!", (-1), "guest", "Student", "WrongPassword1!", false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid user type: WrongPassword1!");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0457() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0457");
        com.reservation_system.model.HeadLabCoordinator headLabCoordinator5 = new com.reservation_system.model.HeadLabCoordinator(98, "headlabcoordinator", "Andrew", "guest", false);
        java.lang.String str6 = headLabCoordinator5.getUserType();
        java.lang.String str7 = headLabCoordinator5.getPassword();
        java.lang.String str8 = headLabCoordinator5.getEmail();
        int int9 = headLabCoordinator5.getID();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "headlabcoordinator" + "'", str6, "headlabcoordinator");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "guest" + "'", str7, "guest");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Andrew" + "'", str8, "Andrew");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 98 + "'", int9 == 98);
    }

    @Test
    public void test0458() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0458");
        com.reservation_system.model.User user6 = com.reservation_system.patterns.factory.UserFactory.createUser("guest", 10, "", "labmanager", "hi!", true);
        org.junit.Assert.assertNotNull(user6);
    }

    @Test
    public void test0459() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0459");
        com.reservation_system.model.LabManager labManager5 = new com.reservation_system.model.LabManager((int) 'a', "labmanager", "Guest", "test@example.com", true);
        java.lang.String str6 = labManager5.getPassword();
    }

    @Test
    public void test0460() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0460");
        // The following exception was thrown during execution in test generation
        try {
            com.reservation_system.model.User user6 = com.reservation_system.patterns.factory.UserFactory.createUser("test@example.com", 100, "headlabcoordinator", "Student", "Student", true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid user type: test@example.com");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0461() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0461");
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
        int int95 = userRepository1.getNextID();
        org.junit.Assert.assertNotNull(userList2);
// flaky "54) test0461(com.reservation_system.Randoop.AuthService.RegressionTest0)":         org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
// flaky "29) test0461(com.reservation_system.Randoop.AuthService.RegressionTest0)":         org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
// flaky "21) test0461(com.reservation_system.Randoop.AuthService.RegressionTest0)":         org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(userList8);
// flaky "12) test0461(com.reservation_system.Randoop.AuthService.RegressionTest0)":         org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
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
        org.junit.Assert.assertTrue("'" + int95 + "' != '" + 98 + "'", int95 == 98);
    }

    @Test
    public void test0462() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0462");
        com.reservation_system.model.Student student5 = new com.reservation_system.model.Student((int) ' ', "student", "Researcher", "faculty", false);
        java.lang.String str6 = student5.getUserType();
        java.lang.String str7 = student5.getUserType();
        boolean boolean8 = student5.isApproved();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Student" + "'", str6, "Student");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Student" + "'", str7, "Student");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test0463() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0463");
        com.reservation_system.model.Researcher researcher5 = new com.reservation_system.model.Researcher((-1), "data/test-users.csv", "", "guest", false);
    }

    @Test
    public void test0464() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0464");
        com.reservation_system.model.Researcher researcher5 = new com.reservation_system.model.Researcher((int) (short) 100, "researcher", "Password1!", "hi!", true);
        int int6 = researcher5.getID();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
    }

    @Test
    public void test0465() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0465");
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
        java.util.Optional<com.reservation_system.model.User> userOptional94 = userRepository1.findByEmail("");
        org.junit.Assert.assertNotNull(userList2);
// flaky "55) test0465(com.reservation_system.Randoop.AuthService.RegressionTest0)":         org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
// flaky "30) test0465(com.reservation_system.Randoop.AuthService.RegressionTest0)":         org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
// flaky "22) test0465(com.reservation_system.Randoop.AuthService.RegressionTest0)":         org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(userList8);
// flaky "13) test0465(com.reservation_system.Randoop.AuthService.RegressionTest0)":         org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
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
    public void test0466() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0466");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("data/test-users.csv");
        java.util.List<com.reservation_system.model.User> userList2 = userRepository1.getAllUsers();
        com.reservation_system.services.AuthService authService3 = new com.reservation_system.services.AuthService(userRepository1);
        com.reservation_system.model.LabManager labManager9 = new com.reservation_system.model.LabManager((int) (short) 0, "", "student", "Andrew", true);
        boolean boolean10 = labManager9.isApproved();
        userRepository1.addUser((com.reservation_system.model.User) labManager9);
        com.reservation_system.services.AuthService authService12 = new com.reservation_system.services.AuthService(userRepository1);
        boolean boolean14 = userRepository1.emailExists("");
        java.util.List<com.reservation_system.model.User> userList15 = userRepository1.getAllUsers();
        boolean boolean17 = userRepository1.emailExists("WrongPassword1!");
        org.junit.Assert.assertNotNull(userList2);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(userList15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test0467() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0467");
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
        // The following exception was thrown during execution in test generation
        try {
            com.reservation_system.model.User user19 = authService16.login("Faculty", "Student");
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
        org.junit.Assert.assertNotNull(userList14);
        org.junit.Assert.assertNotNull(userList15);
    }

    @Test
    public void test0468() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0468");
        com.reservation_system.model.Guest guest5 = new com.reservation_system.model.Guest(0, "faculty", "WrongPassword1!", "Guest", true);
    }

    @Test
    public void test0469() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0469");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("data/test-users.csv");
        java.util.List<com.reservation_system.model.User> userList2 = userRepository1.getAllUsers();
        boolean boolean3 = userRepository1.headLabCoordinatorExists();
        boolean boolean4 = userRepository1.headLabCoordinatorExists();
        boolean boolean6 = userRepository1.emailExists("Faculty");
        java.lang.Class<?> wildcardClass7 = userRepository1.getClass();
        org.junit.Assert.assertNotNull(userList2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0470() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0470");
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
        com.reservation_system.model.Researcher researcher27 = new com.reservation_system.model.Researcher((int) (short) -1, "researcher", "test@example.com", "Faculty", true);
        java.lang.String str28 = researcher27.getUserType();
        boolean boolean29 = researcher27.requiresDepartmentApproval();
        java.lang.String str30 = researcher27.getUserType();
        userRepository1.addUser((com.reservation_system.model.User) researcher27);
        com.reservation_system.repository.UserRepository userRepository33 = new com.reservation_system.repository.UserRepository("data/test-users.csv");
        java.util.List<com.reservation_system.model.User> userList34 = userRepository33.getAllUsers();
        com.reservation_system.services.AuthService authService35 = new com.reservation_system.services.AuthService(userRepository33);
        com.reservation_system.model.LabManager labManager41 = new com.reservation_system.model.LabManager((int) (short) 0, "", "student", "Andrew", true);
        boolean boolean42 = labManager41.isApproved();
        userRepository33.addUser((com.reservation_system.model.User) labManager41);
        boolean boolean45 = userRepository33.emailExists("Researcher");
        com.reservation_system.repository.UserRepository userRepository47 = new com.reservation_system.repository.UserRepository("data/test-users.csv");
        java.util.List<com.reservation_system.model.User> userList48 = userRepository47.getAllUsers();
        java.util.List<com.reservation_system.model.User> userList49 = userRepository47.getAllUsers();
        com.reservation_system.services.AuthService authService50 = new com.reservation_system.services.AuthService(userRepository47);
        com.reservation_system.repository.UserRepository userRepository52 = new com.reservation_system.repository.UserRepository("data/test-users.csv");
        java.util.List<com.reservation_system.model.User> userList53 = userRepository52.getAllUsers();
        com.reservation_system.services.AuthService authService54 = new com.reservation_system.services.AuthService(userRepository52);
        com.reservation_system.model.LabManager labManager60 = new com.reservation_system.model.LabManager((int) (short) 0, "", "student", "Andrew", true);
        boolean boolean61 = labManager60.isApproved();
        userRepository52.addUser((com.reservation_system.model.User) labManager60);
        com.reservation_system.model.Faculty faculty68 = new com.reservation_system.model.Faculty((int) '#', "researcher", "", "student", true);
        userRepository52.addUser((com.reservation_system.model.User) faculty68);
        int int70 = userRepository52.getNextID();
        int int71 = userRepository52.getNextID();
        java.util.List<com.reservation_system.model.User> userList72 = userRepository52.getAllUsers();
        userRepository47.saveAllUsers(userList72);
        java.util.List<com.reservation_system.model.User> userList74 = userRepository47.getAllUsers();
        userRepository33.saveAllUsers(userList74);
        userRepository1.saveAllUsers(userList74);
        org.junit.Assert.assertNotNull(userList2);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 98 + "'", int19 == 98);
        org.junit.Assert.assertNotNull(userOptional21);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "Researcher" + "'", str28, "Researcher");
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "Researcher" + "'", str30, "Researcher");
        org.junit.Assert.assertNotNull(userList34);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + true + "'", boolean42 == true);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertNotNull(userList48);
        org.junit.Assert.assertNotNull(userList49);
        org.junit.Assert.assertNotNull(userList53);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + true + "'", boolean61 == true);
        org.junit.Assert.assertTrue("'" + int70 + "' != '" + 98 + "'", int70 == 98);
        org.junit.Assert.assertTrue("'" + int71 + "' != '" + 98 + "'", int71 == 98);
        org.junit.Assert.assertNotNull(userList72);
        org.junit.Assert.assertNotNull(userList74);
    }

    @Test
    public void test0471() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0471");
        com.reservation_system.model.LabManager labManager5 = new com.reservation_system.model.LabManager(1, "Password1!", "hi!", "Password1!", true);
    }

    @Test
    public void test0472() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0472");
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
        boolean boolean20 = userRepository1.emailExists("WrongPassword1!");
        org.junit.Assert.assertNotNull(userList2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(userList6);
        org.junit.Assert.assertNotNull(userList7);
        org.junit.Assert.assertNotNull(userList11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(userList14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test0473() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0473");
        com.reservation_system.model.LabManager labManager5 = new com.reservation_system.model.LabManager(0, "hi!", "headlabcoordinator", "faculty", true);
    }

    @Test
    public void test0474() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0474");
        com.reservation_system.model.HeadLabCoordinator headLabCoordinator5 = new com.reservation_system.model.HeadLabCoordinator((int) (byte) 100, "hi!", "", "headlabcoordinator", true);
    }

    @Test
    public void test0475() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0475");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("data/test-users.csv");
        java.util.List<com.reservation_system.model.User> userList2 = userRepository1.getAllUsers();
        com.reservation_system.services.AuthService authService3 = new com.reservation_system.services.AuthService(userRepository1);
        com.reservation_system.model.LabManager labManager9 = new com.reservation_system.model.LabManager((int) (short) 0, "", "student", "Andrew", true);
        boolean boolean10 = labManager9.isApproved();
        userRepository1.addUser((com.reservation_system.model.User) labManager9);
        com.reservation_system.model.Faculty faculty17 = new com.reservation_system.model.Faculty((int) '#', "researcher", "", "student", true);
        userRepository1.addUser((com.reservation_system.model.User) faculty17);
        boolean boolean19 = userRepository1.headLabCoordinatorExists();
        java.util.Optional<com.reservation_system.model.User> userOptional21 = userRepository1.findByEmail("");
        org.junit.Assert.assertNotNull(userList2);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(userOptional21);
    }

    @Test
    public void test0476() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0476");
        com.reservation_system.model.Researcher researcher5 = new com.reservation_system.model.Researcher(100, "Password1!", "WrongPassword1!", "headlabcoordinator", false);
        java.lang.String str6 = researcher5.getEmail();
        int int7 = researcher5.getID();
        java.lang.Class<?> wildcardClass8 = researcher5.getClass();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "WrongPassword1!" + "'", str6, "WrongPassword1!");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 100 + "'", int7 == 100);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0477() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0477");
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
        researcher27.setApproved(false);
        org.junit.Assert.assertNotNull(userList2);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 98 + "'", int19 == 98);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 98 + "'", int20 == 98);
        org.junit.Assert.assertNotNull(userList21);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "Researcher" + "'", str28, "Researcher");
    }

    @Test
    public void test0478() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0478");
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
        boolean boolean16 = userRepository1.headLabCoordinatorExists();
        java.util.Optional<com.reservation_system.model.User> userOptional18 = userRepository1.findByEmail("researcher");
        org.junit.Assert.assertNotNull(userList2);
        org.junit.Assert.assertNotNull(userList3);
        org.junit.Assert.assertNotNull(userList6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(userList10);
        org.junit.Assert.assertNotNull(userList11);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(userList15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(userOptional18);
    }

    @Test
    public void test0479() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0479");
        com.reservation_system.model.Guest guest5 = new com.reservation_system.model.Guest((int) (byte) 100, "Password1!", "Guest", "Guest", true);
        java.lang.String str6 = guest5.getUserType();
        java.lang.String str7 = guest5.getPassword();
        java.lang.String str8 = guest5.getUserType();
        boolean boolean9 = guest5.requiresDepartmentApproval();
        java.lang.String str10 = guest5.getEmail();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Guest" + "'", str6, "Guest");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Guest" + "'", str7, "Guest");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Guest" + "'", str8, "Guest");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Guest" + "'", str10, "Guest");
    }

    @Test
    public void test0480() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0480");
        com.reservation_system.model.HeadLabCoordinator headLabCoordinator5 = new com.reservation_system.model.HeadLabCoordinator(10, "headlabcoordinator", "data/test-users.csv", "faculty", false);
        java.lang.String str6 = headLabCoordinator5.getUserType();
        java.lang.String str7 = headLabCoordinator5.getPassword();
        java.lang.String str8 = headLabCoordinator5.getUserType();
        java.lang.String str9 = headLabCoordinator5.getPassword();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "headlabcoordinator" + "'", str6, "headlabcoordinator");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "faculty" + "'", str7, "faculty");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "headlabcoordinator" + "'", str8, "headlabcoordinator");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "faculty" + "'", str9, "faculty");
    }

    @Test
    public void test0481() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0481");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("data/test-users.csv");
        java.util.List<com.reservation_system.model.User> userList2 = userRepository1.getAllUsers();
        java.util.List<com.reservation_system.model.User> userList3 = userRepository1.getAllUsers();
        com.reservation_system.services.AuthService authService4 = new com.reservation_system.services.AuthService(userRepository1);
        java.util.Optional<com.reservation_system.model.User> userOptional6 = userRepository1.findByEmail("faculty");
        com.reservation_system.services.AuthService authService7 = new com.reservation_system.services.AuthService(userRepository1);
        boolean boolean9 = userRepository1.emailExists("researcher");
        java.util.Optional<com.reservation_system.model.User> userOptional11 = userRepository1.findByEmail("student");
        com.reservation_system.model.Faculty faculty17 = new com.reservation_system.model.Faculty((int) 'a', "Faculty", "", "hi!", true);
        java.lang.String str18 = faculty17.getEmail();
        userRepository1.addUser((com.reservation_system.model.User) faculty17);
        org.junit.Assert.assertNotNull(userList2);
        org.junit.Assert.assertNotNull(userList3);
        org.junit.Assert.assertNotNull(userOptional6);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(userOptional11);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
    }

    @Test
    public void test0482() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0482");
        com.reservation_system.model.Researcher researcher5 = new com.reservation_system.model.Researcher((int) (short) -1, "Guest", "Andrew", "Student", true);
        java.lang.Class<?> wildcardClass6 = researcher5.getClass();
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0483() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0483");
        com.reservation_system.model.LabManager labManager5 = new com.reservation_system.model.LabManager(0, "test@example.com", "student", "WrongPassword1!", true);
        java.lang.String str6 = labManager5.getUserType();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "labmanager" + "'", str6, "labmanager");
    }

    @Test
    public void test0484() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0484");
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
        boolean boolean42 = userRepository1.emailExists("Guest");
        org.junit.Assert.assertNotNull(userList2);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 98 + "'", int19 == 98);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 98 + "'", int20 == 98);
        org.junit.Assert.assertNotNull(userList21);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 98 + "'", int25 == 98);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 98 + "'", int29 == 98);
        org.junit.Assert.assertNotNull(userList30);
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "Student" + "'", str39, "Student");
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
    }

    @Test
    public void test0485() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0485");
        com.reservation_system.model.HeadLabCoordinator headLabCoordinator5 = new com.reservation_system.model.HeadLabCoordinator(98, "headlabcoordinator", "Andrew", "guest", false);
        java.lang.String str6 = headLabCoordinator5.getUserType();
        java.lang.String str7 = headLabCoordinator5.getEmail();
        java.lang.String str8 = headLabCoordinator5.getUserType();
        java.lang.String str9 = headLabCoordinator5.getUserType();
        boolean boolean10 = headLabCoordinator5.requiresDepartmentApproval();
        java.lang.String str11 = headLabCoordinator5.getName();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "headlabcoordinator" + "'", str6, "headlabcoordinator");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Andrew" + "'", str7, "Andrew");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "headlabcoordinator" + "'", str8, "headlabcoordinator");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "headlabcoordinator" + "'", str9, "headlabcoordinator");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "headlabcoordinator" + "'", str11, "headlabcoordinator");
    }

    @Test
    public void test0486() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0486");
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
        com.reservation_system.model.Researcher researcher24 = new com.reservation_system.model.Researcher((int) (short) -1, "headlabcoordinator", "student", "", false);
        java.lang.String str25 = researcher24.getUserType();
        boolean boolean26 = researcher24.isApproved();
        java.lang.String str27 = researcher24.getEmail();
        userRepository1.addUser((com.reservation_system.model.User) researcher24);
        java.util.Optional<com.reservation_system.model.User> userOptional30 = userRepository1.findByEmail("test@example.com");
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
        boolean boolean45 = userRepository32.headLabCoordinatorExists();
        java.util.List<com.reservation_system.model.User> userList46 = userRepository32.getAllUsers();
        java.util.List<com.reservation_system.model.User> userList47 = userRepository32.getAllUsers();
        userRepository1.saveAllUsers(userList47);
        org.junit.Assert.assertNotNull(userList2);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(userList14);
        org.junit.Assert.assertNotNull(userList15);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "Researcher" + "'", str25, "Researcher");
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "student" + "'", str27, "student");
        org.junit.Assert.assertNotNull(userOptional30);
        org.junit.Assert.assertNotNull(userList33);
        org.junit.Assert.assertNotNull(userList34);
        org.junit.Assert.assertNotNull(userList37);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertNotNull(userList41);
        org.junit.Assert.assertNotNull(userList42);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertNotNull(userList46);
        org.junit.Assert.assertNotNull(userList47);
    }

    @Test
    public void test0487() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0487");
        com.reservation_system.model.Researcher researcher5 = new com.reservation_system.model.Researcher(98, "Researcher", "Student", "guest", true);
        int int6 = researcher5.getID();
        java.lang.String str7 = researcher5.getPassword();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 98 + "'", int6 == 98);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "guest" + "'", str7, "guest");
    }

    @Test
    public void test0488() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0488");
        com.reservation_system.model.Faculty faculty5 = new com.reservation_system.model.Faculty(36, "guest", "student", "data/test-users.csv", true);
    }

    @Test
    public void test0489() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0489");
        com.reservation_system.model.Researcher researcher5 = new com.reservation_system.model.Researcher((int) (short) 100, "guest", "hi!", "data/test-users.csv", true);
        java.lang.String str6 = researcher5.getUserType();
        java.lang.String str7 = researcher5.getPassword();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Researcher" + "'", str6, "Researcher");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "data/test-users.csv" + "'", str7, "data/test-users.csv");
    }

    @Test
    public void test0490() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0490");
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
        int int37 = userRepository1.getNextID();
        org.junit.Assert.assertNotNull(userList2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(userList6);
        org.junit.Assert.assertNotNull(userList9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(userList13);
        org.junit.Assert.assertNotNull(userList14);
        org.junit.Assert.assertNotNull(userList18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(userList21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertNotNull(userList28);
        org.junit.Assert.assertNotNull(userList29);
        org.junit.Assert.assertNotNull(userOptional32);
        org.junit.Assert.assertNotNull(userList34);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 98 + "'", int37 == 98);
    }

    @Test
    public void test0491() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0491");
        com.reservation_system.model.HeadLabCoordinator headLabCoordinator5 = new com.reservation_system.model.HeadLabCoordinator(98, "headlabcoordinator", "Andrew", "guest", false);
        java.lang.String str6 = headLabCoordinator5.getUserType();
        int int7 = headLabCoordinator5.getID();
        java.lang.String str8 = headLabCoordinator5.getUserType();
        java.lang.String str9 = headLabCoordinator5.getUserType();
        java.lang.String str10 = headLabCoordinator5.getUserType();
        java.lang.Class<?> wildcardClass11 = headLabCoordinator5.getClass();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "headlabcoordinator" + "'", str6, "headlabcoordinator");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 98 + "'", int7 == 98);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "headlabcoordinator" + "'", str8, "headlabcoordinator");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "headlabcoordinator" + "'", str9, "headlabcoordinator");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "headlabcoordinator" + "'", str10, "headlabcoordinator");
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0492() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0492");
        com.reservation_system.model.LabManager labManager5 = new com.reservation_system.model.LabManager((int) (byte) 100, "Faculty", "Password1!", "Student", true);
        java.lang.String str6 = labManager5.getEmail();
        java.lang.String str7 = labManager5.getUserType();
        java.lang.String str8 = labManager5.getName();
        java.lang.String str9 = labManager5.getName();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Password1!" + "'", str6, "Password1!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "labmanager" + "'", str7, "labmanager");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Faculty" + "'", str8, "Faculty");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Faculty" + "'", str9, "Faculty");
    }

    @Test
    public void test0493() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0493");
        com.reservation_system.repository.UserRepository userRepository0 = null;
        com.reservation_system.services.AuthService authService1 = new com.reservation_system.services.AuthService(userRepository0);
        // The following exception was thrown during execution in test generation
        try {
            com.reservation_system.model.User user4 = authService1.login("Guest", "Student");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.reservation_system.repository.UserRepository.findByEmail(String)\" because \"this.userRepository\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0494() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0494");
        com.reservation_system.model.Faculty faculty5 = new com.reservation_system.model.Faculty(98, "guest", "Researcher", "student", true);
        java.lang.Class<?> wildcardClass6 = faculty5.getClass();
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0495() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0495");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("data/test-users.csv");
        java.util.List<com.reservation_system.model.User> userList2 = userRepository1.getAllUsers();
        com.reservation_system.services.AuthService authService3 = new com.reservation_system.services.AuthService(userRepository1);
        java.util.Optional<com.reservation_system.model.User> userOptional5 = userRepository1.findByEmail("");
        java.util.List<com.reservation_system.model.User> userList6 = userRepository1.getAllUsers();
        boolean boolean8 = userRepository1.emailExists("Andrew");
        com.reservation_system.services.AuthService authService9 = new com.reservation_system.services.AuthService(userRepository1);
        // The following exception was thrown during execution in test generation
        try {
            com.reservation_system.model.User user12 = authService9.login("Andrew", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Incorrect password.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(userList2);
        org.junit.Assert.assertNotNull(userOptional5);
        org.junit.Assert.assertNotNull(userList6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test0496() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0496");
        com.reservation_system.model.Researcher researcher5 = new com.reservation_system.model.Researcher((int) (short) -1, "headlabcoordinator", "student", "", false);
        boolean boolean6 = researcher5.isApproved();
        java.lang.String str7 = researcher5.getEmail();
        java.lang.String str8 = researcher5.getUserType();
        java.lang.String str9 = researcher5.getUserType();
        boolean boolean10 = researcher5.requiresDepartmentApproval();
        java.lang.Class<?> wildcardClass11 = researcher5.getClass();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "student" + "'", str7, "student");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Researcher" + "'", str8, "Researcher");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Researcher" + "'", str9, "Researcher");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0497() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0497");
        com.reservation_system.model.Guest guest5 = new com.reservation_system.model.Guest((int) (byte) 100, "Password1!", "Guest", "Guest", true);
        java.lang.String str6 = guest5.getUserType();
        java.lang.String str7 = guest5.getPassword();
        java.lang.String str8 = guest5.getUserType();
        boolean boolean9 = guest5.requiresDepartmentApproval();
        java.lang.String str10 = guest5.getUserType();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Guest" + "'", str6, "Guest");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Guest" + "'", str7, "Guest");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Guest" + "'", str8, "Guest");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Guest" + "'", str10, "Guest");
    }

    @Test
    public void test0498() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0498");
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
        java.lang.String str29 = student27.getName();
        java.lang.String str30 = student27.getUserType();
        org.junit.Assert.assertNotNull(userList2);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 98 + "'", int19 == 98);
        org.junit.Assert.assertNotNull(userOptional21);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "Guest" + "'", str29, "Guest");
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "Student" + "'", str30, "Student");
    }

    @Test
    public void test0499() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0499");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("data/test-users.csv");
        java.util.List<com.reservation_system.model.User> userList2 = userRepository1.getAllUsers();
        com.reservation_system.repository.UserRepository userRepository4 = new com.reservation_system.repository.UserRepository("data/test-users.csv");
        java.util.List<com.reservation_system.model.User> userList5 = userRepository4.getAllUsers();
        com.reservation_system.services.AuthService authService6 = new com.reservation_system.services.AuthService(userRepository4);
        int int7 = userRepository4.getNextID();
        boolean boolean8 = userRepository4.headLabCoordinatorExists();
        com.reservation_system.repository.UserRepository userRepository10 = new com.reservation_system.repository.UserRepository("data/test-users.csv");
        java.util.List<com.reservation_system.model.User> userList11 = userRepository10.getAllUsers();
        boolean boolean12 = userRepository10.headLabCoordinatorExists();
        boolean boolean13 = userRepository10.headLabCoordinatorExists();
        java.util.List<com.reservation_system.model.User> userList14 = userRepository10.getAllUsers();
        userRepository4.saveAllUsers(userList14);
        userRepository1.saveAllUsers(userList14);
        java.util.List<com.reservation_system.model.User> userList17 = userRepository1.getAllUsers();
        java.util.List<com.reservation_system.model.User> userList18 = userRepository1.getAllUsers();
        org.junit.Assert.assertNotNull(userList2);
        org.junit.Assert.assertNotNull(userList5);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 98 + "'", int7 == 98);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(userList11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(userList14);
        org.junit.Assert.assertNotNull(userList17);
        org.junit.Assert.assertNotNull(userList18);
    }

    @Test
    public void test0500() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0500");
        com.reservation_system.model.Faculty faculty5 = new com.reservation_system.model.Faculty((-1), "faculty", "", "", false);
    }
}
