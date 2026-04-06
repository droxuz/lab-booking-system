package com.reservation_system.Randoop.CoordinatorService;

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
        com.reservation_system.patterns.factory.UserFactory userFactory0 = new com.reservation_system.patterns.factory.UserFactory();
    }

    @Test
    public void test0002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0002");
        com.reservation_system.model.Guest guest5 = new com.reservation_system.model.Guest((int) (short) 0, "Manager1", "Coordinator2", "", true);
        java.lang.String str6 = guest5.getPassword();
        java.lang.Class<?> wildcardClass7 = guest5.getClass();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0003");
        com.reservation_system.model.Faculty faculty5 = new com.reservation_system.model.Faculty((int) (short) 0, "coord@yorku.ca", "Researcher", "hi!", true);
        java.lang.Class<?> wildcardClass6 = faculty5.getClass();
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0004");
        com.reservation_system.model.Researcher researcher5 = new com.reservation_system.model.Researcher((int) (short) -1, "coord@yorku.ca", "data/test-users.csv", "coord2@yorku.ca", false);
        java.lang.String str6 = researcher5.getUserType();
        java.lang.Class<?> wildcardClass7 = researcher5.getClass();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Researcher" + "'", str6, "Researcher");
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0005");
        com.reservation_system.model.Faculty faculty5 = new com.reservation_system.model.Faculty((int) (short) 0, "coord@yorku.ca", "Researcher", "hi!", true);
        java.lang.String str6 = faculty5.getName();
        java.lang.String str7 = faculty5.getUserType();
        java.lang.String str8 = faculty5.getUserType();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "coord@yorku.ca" + "'", str6, "coord@yorku.ca");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Faculty" + "'", str7, "Faculty");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Faculty" + "'", str8, "Faculty");
    }

    @Test
    public void test0006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0006");
        com.reservation_system.model.Faculty faculty5 = new com.reservation_system.model.Faculty((int) (short) 0, "data/test-users.csv", "Coordinator2", "hi!", true);
    }

    @Test
    public void test0007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0007");
        com.reservation_system.repository.UserRepository userRepository0 = null;
        com.reservation_system.services.CoordinatorAccountService coordinatorAccountService1 = new com.reservation_system.services.CoordinatorAccountService(userRepository0);
        com.reservation_system.model.Student student7 = new com.reservation_system.model.Student((int) '#', "Coordinator", "Coordinator", "", false);
        // The following exception was thrown during execution in test generation
        try {
            com.reservation_system.model.User user11 = coordinatorAccountService1.autoGenerateLabManagerAccount((com.reservation_system.model.User) student7, "coord2@yorku.ca", "Coordinator2", "data/test-users.csv");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Only the head lab coordinator can generate lab manager accounts.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0008");
        com.reservation_system.model.Guest guest5 = new com.reservation_system.model.Guest((int) (short) 0, "Manager1", "Coordinator2", "", true);
        int int6 = guest5.getID();
        java.lang.Class<?> wildcardClass7 = guest5.getClass();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0009");
        // The following exception was thrown during execution in test generation
        try {
            com.reservation_system.model.User user6 = com.reservation_system.patterns.factory.UserFactory.createUser("Coordinator", (int) (short) 100, "data/test-users.csv", "Coordinator", "Researcher", false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid user type: Coordinator");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0010");
        // The following exception was thrown during execution in test generation
        try {
            com.reservation_system.model.User user6 = com.reservation_system.patterns.factory.UserFactory.createUser("Manager1", (int) (byte) -1, "hi!", "", "Guest", false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid user type: Manager1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0011");
        com.reservation_system.model.Guest guest5 = new com.reservation_system.model.Guest((int) (byte) -1, "coord2@yorku.ca", "coord2@yorku.ca", "hi!", true);
        java.lang.String str6 = guest5.getUserType();
        java.lang.String str7 = guest5.getEmail();
        guest5.setApproved(true);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Guest" + "'", str6, "Guest");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "coord2@yorku.ca" + "'", str7, "coord2@yorku.ca");
    }

    @Test
    public void test0012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0012");
        com.reservation_system.repository.UserRepository userRepository0 = null;
        com.reservation_system.services.CoordinatorAccountService coordinatorAccountService1 = new com.reservation_system.services.CoordinatorAccountService(userRepository0);
        // The following exception was thrown during execution in test generation
        try {
            com.reservation_system.model.User user5 = coordinatorAccountService1.createHeadLabCoordinator("Guest", "coord@yorku.ca", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.reservation_system.repository.UserRepository.headLabCoordinatorExists()\" because \"this.userRepository\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0013");
        com.reservation_system.model.Researcher researcher5 = new com.reservation_system.model.Researcher((int) (short) -1, "data/test-users.csv", "data/test-users.csv", "Student", true);
        java.lang.String str6 = researcher5.getUserType();
        boolean boolean7 = researcher5.requiresDepartmentApproval();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Researcher" + "'", str6, "Researcher");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test0014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0014");
        com.reservation_system.model.Student student5 = new com.reservation_system.model.Student((int) (short) -1, "coord2@yorku.ca", "Student", "Coordinator", true);
        student5.setApproved(true);
        java.lang.String str8 = student5.getPassword();
        java.lang.String str9 = student5.getName();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Coordinator" + "'", str8, "Coordinator");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "coord2@yorku.ca" + "'", str9, "coord2@yorku.ca");
    }

    @Test
    public void test0015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0015");
        com.reservation_system.model.LabManager labManager5 = new com.reservation_system.model.LabManager(100, "", "labmanager", "hi!", true);
        java.lang.String str6 = labManager5.getUserType();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "labmanager" + "'", str6, "labmanager");
    }

    @Test
    public void test0016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0016");
        com.reservation_system.repository.UserRepository userRepository0 = null;
        com.reservation_system.services.CoordinatorAccountService coordinatorAccountService1 = new com.reservation_system.services.CoordinatorAccountService(userRepository0);
        com.reservation_system.model.Student student7 = new com.reservation_system.model.Student((int) '#', "Coordinator", "Coordinator", "", false);
        boolean boolean8 = student7.requiresDepartmentApproval();
        java.lang.String str9 = student7.getPassword();
        // The following exception was thrown during execution in test generation
        try {
            com.reservation_system.model.User user13 = coordinatorAccountService1.autoGenerateLabManagerAccount((com.reservation_system.model.User) student7, "data/test-users.csv", "", "");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Email is required.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test0017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0017");
        com.reservation_system.model.Researcher researcher5 = new com.reservation_system.model.Researcher((int) (short) -1, "data/test-users.csv", "data/test-users.csv", "Student", true);
        java.lang.String str6 = researcher5.getUserType();
        java.lang.String str7 = researcher5.getUserType();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Researcher" + "'", str6, "Researcher");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Researcher" + "'", str7, "Researcher");
    }

    @Test
    public void test0018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0018");
        com.reservation_system.repository.UserRepository userRepository0 = null;
        com.reservation_system.services.CoordinatorAccountService coordinatorAccountService1 = new com.reservation_system.services.CoordinatorAccountService(userRepository0);
        // The following exception was thrown during execution in test generation
        try {
            com.reservation_system.model.User user5 = coordinatorAccountService1.createHeadLabCoordinator("Student", "Coordinator2", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.reservation_system.repository.UserRepository.headLabCoordinatorExists()\" because \"this.userRepository\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0019");
        com.reservation_system.repository.UserRepository userRepository0 = null;
        com.reservation_system.services.CoordinatorAccountService coordinatorAccountService1 = new com.reservation_system.services.CoordinatorAccountService(userRepository0);
        com.reservation_system.model.Guest guest7 = new com.reservation_system.model.Guest((int) ' ', "data/test-users.csv", "coord2@yorku.ca", "data/test-users.csv", false);
        java.lang.String str8 = guest7.getPassword();
        // The following exception was thrown during execution in test generation
        try {
            com.reservation_system.model.User user12 = coordinatorAccountService1.autoGenerateLabManagerAccount((com.reservation_system.model.User) guest7, "Student", "manager1@yorku.ca", "Manager1");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Only the head lab coordinator can generate lab manager accounts.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "data/test-users.csv" + "'", str8, "data/test-users.csv");
    }

    @Test
    public void test0020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0020");
        com.reservation_system.model.Student student5 = new com.reservation_system.model.Student((int) '#', "Coordinator", "Coordinator", "", false);
        boolean boolean6 = student5.requiresDepartmentApproval();
        boolean boolean7 = student5.requiresDepartmentApproval();
        java.lang.String str8 = student5.getUserType();
        student5.setApproved(false);
        java.lang.Class<?> wildcardClass11 = student5.getClass();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Student" + "'", str8, "Student");
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0021");
        // The following exception was thrown during execution in test generation
        try {
            com.reservation_system.model.User user6 = com.reservation_system.patterns.factory.UserFactory.createUser("", (int) '4', "coord@yorku.ca", "", "coord2@yorku.ca", true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid user type: ");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0022");
        com.reservation_system.model.Guest guest5 = new com.reservation_system.model.Guest((int) (byte) -1, "coord2@yorku.ca", "coord2@yorku.ca", "hi!", true);
        java.lang.String str6 = guest5.getUserType();
        java.lang.Class<?> wildcardClass7 = guest5.getClass();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Guest" + "'", str6, "Guest");
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0023");
        com.reservation_system.model.LabManager labManager5 = new com.reservation_system.model.LabManager((int) 'a', "Manager1", "hi!", "Coordinator2", false);
        java.lang.String str6 = labManager5.getEmail();
        int int7 = labManager5.getID();
        java.lang.String str8 = labManager5.getEmail();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 97 + "'", int7 == 97);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
    }

    @Test
    public void test0024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0024");
        com.reservation_system.model.Student student5 = new com.reservation_system.model.Student((int) '#', "Coordinator", "Coordinator", "", false);
        boolean boolean6 = student5.requiresDepartmentApproval();
        boolean boolean7 = student5.requiresDepartmentApproval();
        int int8 = student5.getID();
        java.lang.Class<?> wildcardClass9 = student5.getClass();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 35 + "'", int8 == 35);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0025");
        com.reservation_system.model.LabManager labManager5 = new com.reservation_system.model.LabManager((int) (byte) 0, "", "Student", "Faculty", false);
        java.lang.String str6 = labManager5.getUserType();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "labmanager" + "'", str6, "labmanager");
    }

    @Test
    public void test0026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0026");
        com.reservation_system.model.HeadLabCoordinator headLabCoordinator5 = new com.reservation_system.model.HeadLabCoordinator((int) (byte) 100, "labmanager", "manager1@yorku.ca", "Researcher", true);
        java.lang.Class<?> wildcardClass6 = headLabCoordinator5.getClass();
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0027");
        com.reservation_system.repository.UserRepository userRepository0 = null;
        com.reservation_system.services.CoordinatorAccountService coordinatorAccountService1 = new com.reservation_system.services.CoordinatorAccountService(userRepository0);
        // The following exception was thrown during execution in test generation
        try {
            com.reservation_system.model.User user5 = coordinatorAccountService1.createHeadLabCoordinator("data/test-users.csv", "labmanager", "data/test-users.csv");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.reservation_system.repository.UserRepository.headLabCoordinatorExists()\" because \"this.userRepository\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0028");
        com.reservation_system.model.Researcher researcher5 = new com.reservation_system.model.Researcher((int) '#', "data/test-users.csv", "", "Coordinator", false);
        researcher5.setApproved(true);
    }

    @Test
    public void test0029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0029");
        com.reservation_system.repository.UserRepository userRepository0 = null;
        com.reservation_system.services.CoordinatorAccountService coordinatorAccountService1 = new com.reservation_system.services.CoordinatorAccountService(userRepository0);
        // The following exception was thrown during execution in test generation
        try {
            com.reservation_system.model.User user5 = coordinatorAccountService1.createHeadLabCoordinator("coord@yorku.ca", "Student", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.reservation_system.repository.UserRepository.headLabCoordinatorExists()\" because \"this.userRepository\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0030");
        // The following exception was thrown during execution in test generation
        try {
            com.reservation_system.model.User user6 = com.reservation_system.patterns.factory.UserFactory.createUser("", 100, "manager1@yorku.ca", "Coordinator2", "manager1@yorku.ca", false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid user type: ");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0031");
        com.reservation_system.model.User user6 = com.reservation_system.patterns.factory.UserFactory.createUser("Guest", (int) (short) 1, "labmanager", "hi!", "hi!", false);
        org.junit.Assert.assertNotNull(user6);
    }

    @Test
    public void test0032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0032");
        com.reservation_system.repository.UserRepository userRepository0 = null;
        com.reservation_system.services.CoordinatorAccountService coordinatorAccountService1 = new com.reservation_system.services.CoordinatorAccountService(userRepository0);
        com.reservation_system.model.User user8 = com.reservation_system.patterns.factory.UserFactory.createUser("Guest", (int) 'a', "coord@yorku.ca", "coord2@yorku.ca", "Strong1!", false);
        // The following exception was thrown during execution in test generation
        try {
            com.reservation_system.model.User user12 = coordinatorAccountService1.autoGenerateLabManagerAccount(user8, "Student", "coord@yorku.ca", "coord@yorku.ca");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Only the head lab coordinator can generate lab manager accounts.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(user8);
    }

    @Test
    public void test0033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0033");
        // The following exception was thrown during execution in test generation
        try {
            com.reservation_system.model.User user6 = com.reservation_system.patterns.factory.UserFactory.createUser("data/test-users.csv", (-1), "Manager1", "Faculty", "headlabcoordinator", false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid user type: data/test-users.csv");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0034");
        // The following exception was thrown during execution in test generation
        try {
            com.reservation_system.model.User user6 = com.reservation_system.patterns.factory.UserFactory.createUser("manager1@yorku.ca", (int) '#', "Guest", "Student", "Strong1!", true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid user type: manager1@yorku.ca");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0035");
        com.reservation_system.model.Faculty faculty5 = new com.reservation_system.model.Faculty((int) (short) 0, "labmanager", "Researcher", "hi!", true);
        int int6 = faculty5.getID();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test0036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0036");
        com.reservation_system.repository.UserRepository userRepository0 = null;
        com.reservation_system.services.CoordinatorAccountService coordinatorAccountService1 = new com.reservation_system.services.CoordinatorAccountService(userRepository0);
        // The following exception was thrown during execution in test generation
        try {
            com.reservation_system.model.User user5 = coordinatorAccountService1.createHeadLabCoordinator("", "hi!", "headlabcoordinator");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Name is required.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0037");
        com.reservation_system.repository.UserRepository userRepository0 = null;
        com.reservation_system.services.CoordinatorAccountService coordinatorAccountService1 = new com.reservation_system.services.CoordinatorAccountService(userRepository0);
        com.reservation_system.model.User user8 = com.reservation_system.patterns.factory.UserFactory.createUser("Student", (int) (byte) 10, "Faculty", "Manager1", "Manager1", true);
        // The following exception was thrown during execution in test generation
        try {
            com.reservation_system.model.User user12 = coordinatorAccountService1.autoGenerateLabManagerAccount(user8, "Faculty", "Researcher", "Faculty");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Only the head lab coordinator can generate lab manager accounts.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(user8);
    }

    @Test
    public void test0038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0038");
        // The following exception was thrown during execution in test generation
        try {
            com.reservation_system.model.User user6 = com.reservation_system.patterns.factory.UserFactory.createUser("hi!", 10, "data/test-users.csv", "Strong1!", "Researcher", false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid user type: hi!");
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
            com.reservation_system.model.User user6 = com.reservation_system.patterns.factory.UserFactory.createUser("", (int) (byte) 0, "manager1@yorku.ca", "Manager1", "data/test-users.csv", false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid user type: ");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0040");
        com.reservation_system.repository.UserRepository userRepository0 = null;
        com.reservation_system.services.CoordinatorAccountService coordinatorAccountService1 = new com.reservation_system.services.CoordinatorAccountService(userRepository0);
        // The following exception was thrown during execution in test generation
        try {
            com.reservation_system.model.User user5 = coordinatorAccountService1.createHeadLabCoordinator("Guest", "Coordinator2", "coord@yorku.ca");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.reservation_system.repository.UserRepository.headLabCoordinatorExists()\" because \"this.userRepository\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0041");
        com.reservation_system.repository.UserRepository userRepository0 = null;
        com.reservation_system.services.CoordinatorAccountService coordinatorAccountService1 = new com.reservation_system.services.CoordinatorAccountService(userRepository0);
        com.reservation_system.model.Guest guest7 = new com.reservation_system.model.Guest((int) (byte) -1, "coord2@yorku.ca", "coord2@yorku.ca", "hi!", true);
        boolean boolean8 = guest7.isApproved();
        // The following exception was thrown during execution in test generation
        try {
            com.reservation_system.model.User user12 = coordinatorAccountService1.autoGenerateLabManagerAccount((com.reservation_system.model.User) guest7, "Guest", "Guest", "Student");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Only the head lab coordinator can generate lab manager accounts.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test0042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0042");
        com.reservation_system.repository.UserRepository userRepository0 = null;
        com.reservation_system.services.CoordinatorAccountService coordinatorAccountService1 = new com.reservation_system.services.CoordinatorAccountService(userRepository0);
        // The following exception was thrown during execution in test generation
        try {
            com.reservation_system.model.User user5 = coordinatorAccountService1.createHeadLabCoordinator("hi!", "Manager1", "Faculty");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.reservation_system.repository.UserRepository.headLabCoordinatorExists()\" because \"this.userRepository\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0043");
        com.reservation_system.model.HeadLabCoordinator headLabCoordinator5 = new com.reservation_system.model.HeadLabCoordinator(35, "Manager1", "manager1@yorku.ca", "Faculty", false);
    }

    @Test
    public void test0044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0044");
        com.reservation_system.model.Guest guest5 = new com.reservation_system.model.Guest((int) (byte) 100, "Faculty", "hi!", "coord@yorku.ca", true);
        java.lang.Class<?> wildcardClass6 = guest5.getClass();
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0045");
        com.reservation_system.model.Guest guest5 = new com.reservation_system.model.Guest((int) (short) 0, "Manager1", "Coordinator2", "", true);
        boolean boolean6 = guest5.isApproved();
        java.lang.String str7 = guest5.getUserType();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Guest" + "'", str7, "Guest");
    }

    @Test
    public void test0046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0046");
        com.reservation_system.model.Student student5 = new com.reservation_system.model.Student(97, "headlabcoordinator", "Manager1", "manager1@yorku.ca", false);
    }

    @Test
    public void test0047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0047");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("data/test-users.csv");
        boolean boolean3 = userRepository1.emailExists("headlabcoordinator");
        com.reservation_system.services.CoordinatorAccountService coordinatorAccountService4 = new com.reservation_system.services.CoordinatorAccountService(userRepository1);
        com.reservation_system.model.Student student10 = new com.reservation_system.model.Student((int) '#', "Coordinator", "Coordinator", "", false);
        boolean boolean11 = student10.requiresDepartmentApproval();
        java.lang.String str12 = student10.getUserType();
        java.lang.String str13 = student10.getUserType();
        java.lang.String str14 = student10.getUserType();
        // The following exception was thrown during execution in test generation
        try {
            com.reservation_system.model.User user18 = coordinatorAccountService4.autoGenerateLabManagerAccount((com.reservation_system.model.User) student10, "Student", "manager1@yorku.ca", "data/test-users.csv");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Only the head lab coordinator can generate lab manager accounts.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
// flaky "1) test0047(com.reservation_system.Randoop.CoordinatorService.RegressionTest0)":         org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Student" + "'", str12, "Student");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Student" + "'", str13, "Student");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Student" + "'", str14, "Student");
    }

    @Test
    public void test0048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0048");
        com.reservation_system.model.Guest guest5 = new com.reservation_system.model.Guest((int) (short) 0, "Manager1", "Coordinator2", "", true);
        java.lang.String str6 = guest5.getPassword();
        guest5.setApproved(false);
        guest5.setApproved(false);
        java.lang.String str11 = guest5.getUserType();
        java.lang.String str12 = guest5.getEmail();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Guest" + "'", str11, "Guest");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Coordinator2" + "'", str12, "Coordinator2");
    }

    @Test
    public void test0049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0049");
        com.reservation_system.model.LabManager labManager5 = new com.reservation_system.model.LabManager((int) 'a', "Coordinator2", "", "", false);
        boolean boolean6 = labManager5.isApproved();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test0050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0050");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("data/test-users.csv");
        boolean boolean3 = userRepository1.emailExists("headlabcoordinator");
        com.reservation_system.services.CoordinatorAccountService coordinatorAccountService4 = new com.reservation_system.services.CoordinatorAccountService(userRepository1);
        com.reservation_system.model.User user8 = coordinatorAccountService4.createHeadLabCoordinator("Coordinator", "Strong1!", "coord2@yorku.ca");
// flaky "2) test0050(com.reservation_system.Randoop.CoordinatorService.RegressionTest0)":         org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(user8);
    }

    @Test
    public void test0051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0051");
        com.reservation_system.model.Researcher researcher5 = new com.reservation_system.model.Researcher((int) (short) -1, "coord@yorku.ca", "data/test-users.csv", "coord2@yorku.ca", false);
        java.lang.String str6 = researcher5.getUserType();
        java.lang.String str7 = researcher5.getName();
        java.lang.Class<?> wildcardClass8 = researcher5.getClass();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Researcher" + "'", str6, "Researcher");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "coord@yorku.ca" + "'", str7, "coord@yorku.ca");
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0052");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("data/test-users.csv");
        boolean boolean3 = userRepository1.emailExists("headlabcoordinator");
        com.reservation_system.services.CoordinatorAccountService coordinatorAccountService4 = new com.reservation_system.services.CoordinatorAccountService(userRepository1);
        com.reservation_system.repository.UserRepository userRepository6 = new com.reservation_system.repository.UserRepository("data/test-users.csv");
        com.reservation_system.model.Faculty faculty12 = new com.reservation_system.model.Faculty((int) (byte) 1, "", "Guest", "Student", true);
        userRepository6.addUser((com.reservation_system.model.User) faculty12);
        // The following exception was thrown during execution in test generation
        try {
            com.reservation_system.model.User user17 = coordinatorAccountService4.autoGenerateLabManagerAccount((com.reservation_system.model.User) faculty12, "", "Faculty", "coord2@yorku.ca");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Name is required.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
// flaky "3) test0052(com.reservation_system.Randoop.CoordinatorService.RegressionTest0)":         org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
    }

    @Test
    public void test0053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0053");
        com.reservation_system.model.Faculty faculty5 = new com.reservation_system.model.Faculty((int) (short) -1, "Student", "manager1@yorku.ca", "", false);
    }

    @Test
    public void test0054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0054");
        com.reservation_system.repository.UserRepository userRepository0 = null;
        com.reservation_system.services.CoordinatorAccountService coordinatorAccountService1 = new com.reservation_system.services.CoordinatorAccountService(userRepository0);
        // The following exception was thrown during execution in test generation
        try {
            com.reservation_system.model.User user5 = coordinatorAccountService1.createHeadLabCoordinator("Strong1!", "data/test-users.csv", "Coordinator");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.reservation_system.repository.UserRepository.headLabCoordinatorExists()\" because \"this.userRepository\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0055");
        com.reservation_system.model.Researcher researcher5 = new com.reservation_system.model.Researcher(0, "", "data/test-users.csv", "manager1@yorku.ca", false);
    }

    @Test
    public void test0056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0056");
        // The following exception was thrown during execution in test generation
        try {
            com.reservation_system.model.User user6 = com.reservation_system.patterns.factory.UserFactory.createUser("Manager1", 10, "Strong1!", "Researcher", "Strong1!", true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid user type: Manager1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0057");
        com.reservation_system.model.Guest guest5 = new com.reservation_system.model.Guest((int) (short) 100, "Researcher", "Student", "Coordinator2", true);
        boolean boolean6 = guest5.requiresDepartmentApproval();
        java.lang.String str7 = guest5.getName();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Researcher" + "'", str7, "Researcher");
    }

    @Test
    public void test0058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0058");
        // The following exception was thrown during execution in test generation
        try {
            com.reservation_system.model.User user6 = com.reservation_system.patterns.factory.UserFactory.createUser("Coordinator", 10, "Strong1!", "", "Researcher", false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid user type: Coordinator");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0059");
        com.reservation_system.model.HeadLabCoordinator headLabCoordinator5 = new com.reservation_system.model.HeadLabCoordinator(1, "hi!", "manager1@yorku.ca", "Manager1", true);
        int int6 = headLabCoordinator5.getID();
        java.lang.Class<?> wildcardClass7 = headLabCoordinator5.getClass();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0060");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("data/test-users.csv");
        boolean boolean3 = userRepository1.emailExists("headlabcoordinator");
        com.reservation_system.services.CoordinatorAccountService coordinatorAccountService4 = new com.reservation_system.services.CoordinatorAccountService(userRepository1);
        // The following exception was thrown during execution in test generation
        try {
            com.reservation_system.model.User user8 = coordinatorAccountService4.createHeadLabCoordinator("Strong1!", "Coordinator2", "Strong1!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Only one head lab coordinator account is allowed.");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
// flaky "4) test0060(com.reservation_system.Randoop.CoordinatorService.RegressionTest0)":         org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
    }

    @Test
    public void test0061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0061");
        com.reservation_system.model.Guest guest5 = new com.reservation_system.model.Guest(97, "headlabcoordinator", "data/test-users.csv", "Strong1!", false);
        java.lang.String str6 = guest5.getName();
        java.lang.Class<?> wildcardClass7 = guest5.getClass();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "headlabcoordinator" + "'", str6, "headlabcoordinator");
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0062");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("data/test-users.csv");
        boolean boolean3 = userRepository1.emailExists("headlabcoordinator");
        com.reservation_system.services.CoordinatorAccountService coordinatorAccountService4 = new com.reservation_system.services.CoordinatorAccountService(userRepository1);
        java.lang.Class<?> wildcardClass5 = coordinatorAccountService4.getClass();
// flaky "5) test0062(com.reservation_system.Randoop.CoordinatorService.RegressionTest0)":         org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0063");
        com.reservation_system.model.Student student5 = new com.reservation_system.model.Student((int) '#', "Coordinator", "Coordinator", "", false);
        boolean boolean6 = student5.requiresDepartmentApproval();
        java.lang.String str7 = student5.getPassword();
        java.lang.String str8 = student5.getUserType();
        boolean boolean9 = student5.isApproved();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Student" + "'", str8, "Student");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test0064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0064");
        com.reservation_system.model.Guest guest5 = new com.reservation_system.model.Guest((int) (short) 0, "Manager1", "Coordinator2", "", true);
        int int6 = guest5.getID();
        boolean boolean7 = guest5.requiresDepartmentApproval();
        java.lang.Class<?> wildcardClass8 = guest5.getClass();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0065");
        com.reservation_system.repository.UserRepository userRepository0 = null;
        com.reservation_system.services.CoordinatorAccountService coordinatorAccountService1 = new com.reservation_system.services.CoordinatorAccountService(userRepository0);
        // The following exception was thrown during execution in test generation
        try {
            com.reservation_system.model.User user5 = coordinatorAccountService1.createHeadLabCoordinator("headlabcoordinator", "Student", "");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Password is required.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0066");
        com.reservation_system.model.Student student5 = new com.reservation_system.model.Student(97, "manager1@yorku.ca", "Coordinator2", "hi!", true);
        boolean boolean6 = student5.requiresDepartmentApproval();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test0067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0067");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("data/test-users.csv");
        com.reservation_system.model.LabManager labManager7 = new com.reservation_system.model.LabManager((int) (short) 0, "", "Faculty", "Student", true);
        java.lang.String str8 = labManager7.getUserType();
        java.lang.String str9 = labManager7.getPassword();
        userRepository1.addUser((com.reservation_system.model.User) labManager7);
        boolean boolean11 = userRepository1.headLabCoordinatorExists();
        com.reservation_system.model.Researcher researcher17 = new com.reservation_system.model.Researcher(0, "Student", "Faculty", "Faculty", false);
        userRepository1.addUser((com.reservation_system.model.User) researcher17);
        java.util.Optional<com.reservation_system.model.User> userOptional20 = userRepository1.findByEmail("data/test-users.csv");
        com.reservation_system.services.CoordinatorAccountService coordinatorAccountService21 = new com.reservation_system.services.CoordinatorAccountService(userRepository1);
        // The following exception was thrown during execution in test generation
        try {
            com.reservation_system.model.User user25 = coordinatorAccountService21.createHeadLabCoordinator("Coordinator2", "Researcher", "");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Password is required.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "labmanager" + "'", str8, "labmanager");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Student" + "'", str9, "Student");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(userOptional20);
    }

    @Test
    public void test0068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0068");
        com.reservation_system.model.LabManager labManager5 = new com.reservation_system.model.LabManager((int) (short) 0, "", "Faculty", "Student", true);
        boolean boolean6 = labManager5.isApproved();
        java.lang.String str7 = labManager5.getUserType();
        java.lang.String str8 = labManager5.getUserType();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "labmanager" + "'", str7, "labmanager");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "labmanager" + "'", str8, "labmanager");
    }

    @Test
    public void test0069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0069");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("data/test-users.csv");
        com.reservation_system.model.LabManager labManager7 = new com.reservation_system.model.LabManager((int) (short) 0, "", "Faculty", "Student", true);
        java.lang.String str8 = labManager7.getUserType();
        java.lang.String str9 = labManager7.getPassword();
        userRepository1.addUser((com.reservation_system.model.User) labManager7);
        boolean boolean11 = userRepository1.headLabCoordinatorExists();
        com.reservation_system.model.Researcher researcher17 = new com.reservation_system.model.Researcher(0, "Student", "Faculty", "Faculty", false);
        userRepository1.addUser((com.reservation_system.model.User) researcher17);
        java.util.Optional<com.reservation_system.model.User> userOptional20 = userRepository1.findByEmail("data/test-users.csv");
        com.reservation_system.services.CoordinatorAccountService coordinatorAccountService21 = new com.reservation_system.services.CoordinatorAccountService(userRepository1);
        // The following exception was thrown during execution in test generation
        try {
            com.reservation_system.model.User user25 = coordinatorAccountService21.createHeadLabCoordinator("coord2@yorku.ca", "Guest", "coord2@yorku.ca");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Only one head lab coordinator account is allowed.");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "labmanager" + "'", str8, "labmanager");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Student" + "'", str9, "Student");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(userOptional20);
    }

    @Test
    public void test0070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0070");
        // The following exception was thrown during execution in test generation
        try {
            com.reservation_system.model.User user6 = com.reservation_system.patterns.factory.UserFactory.createUser("Coordinator", (int) (byte) 0, "Researcher", "Strong1!", "Researcher", true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid user type: Coordinator");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0071");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("data/test-users.csv");
        java.util.Optional<com.reservation_system.model.User> userOptional3 = userRepository1.findByEmail("Faculty");
        com.reservation_system.model.Student student9 = new com.reservation_system.model.Student((int) '#', "Coordinator", "Coordinator", "", false);
        boolean boolean10 = student9.isApproved();
        java.lang.String str11 = student9.getName();
        userRepository1.addUser((com.reservation_system.model.User) student9);
        int int13 = userRepository1.getNextID();
        boolean boolean14 = userRepository1.headLabCoordinatorExists();
        org.junit.Assert.assertNotNull(userOptional3);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Coordinator" + "'", str11, "Coordinator");
// flaky "6) test0071(com.reservation_system.Randoop.CoordinatorService.RegressionTest0)":         org.junit.Assert.assertTrue("'" + int13 + "' != '" + 99 + "'", int13 == 99);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test0072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0072");
        com.reservation_system.model.LabManager labManager5 = new com.reservation_system.model.LabManager(10, "", "Student", "Researcher", true);
        boolean boolean6 = labManager5.isApproved();
        java.lang.String str7 = labManager5.getUserType();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "labmanager" + "'", str7, "labmanager");
    }

    @Test
    public void test0073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0073");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("data/test-users.csv");
        boolean boolean3 = userRepository1.emailExists("headlabcoordinator");
        java.lang.Class<?> wildcardClass4 = userRepository1.getClass();
// flaky "7) test0073(com.reservation_system.Randoop.CoordinatorService.RegressionTest0)":         org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test0074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0074");
        com.reservation_system.model.Student student5 = new com.reservation_system.model.Student((int) '#', "Coordinator", "Coordinator", "", false);
        boolean boolean6 = student5.requiresDepartmentApproval();
        java.lang.String str7 = student5.getUserType();
        java.lang.String str8 = student5.getUserType();
        java.lang.String str9 = student5.getUserType();
        java.lang.String str10 = student5.getUserType();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Student" + "'", str7, "Student");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Student" + "'", str8, "Student");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Student" + "'", str9, "Student");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Student" + "'", str10, "Student");
    }

    @Test
    public void test0075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0075");
        com.reservation_system.model.Researcher researcher5 = new com.reservation_system.model.Researcher(0, "Student", "Faculty", "Faculty", false);
        java.lang.String str6 = researcher5.getUserType();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Researcher" + "'", str6, "Researcher");
    }

    @Test
    public void test0076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0076");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("data/test-users.csv");
        boolean boolean2 = userRepository1.headLabCoordinatorExists();
        boolean boolean3 = userRepository1.headLabCoordinatorExists();
        com.reservation_system.model.Guest guest9 = new com.reservation_system.model.Guest((int) (short) 0, "Manager1", "Coordinator2", "", true);
        java.lang.String str10 = guest9.getPassword();
        boolean boolean11 = guest9.isApproved();
        int int12 = guest9.getID();
        java.lang.String str13 = guest9.getUserType();
        userRepository1.addUser((com.reservation_system.model.User) guest9);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Guest" + "'", str13, "Guest");
    }

    @Test
    public void test0077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0077");
        com.reservation_system.model.Guest guest5 = new com.reservation_system.model.Guest((int) (short) 100, "Researcher", "Student", "Coordinator2", true);
        boolean boolean6 = guest5.requiresDepartmentApproval();
        java.lang.String str7 = guest5.getEmail();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Student" + "'", str7, "Student");
    }

    @Test
    public void test0078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0078");
        // The following exception was thrown during execution in test generation
        try {
            com.reservation_system.model.User user6 = com.reservation_system.patterns.factory.UserFactory.createUser("manager1@yorku.ca", 1, "Strong1!", "data/test-users.csv", "Coordinator", false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid user type: manager1@yorku.ca");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0079");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("data/test-users.csv");
        boolean boolean3 = userRepository1.emailExists("headlabcoordinator");
        com.reservation_system.services.CoordinatorAccountService coordinatorAccountService4 = new com.reservation_system.services.CoordinatorAccountService(userRepository1);
        com.reservation_system.model.LabManager labManager10 = new com.reservation_system.model.LabManager((int) (short) 0, "", "Faculty", "Student", true);
        java.lang.String str11 = labManager10.getUserType();
        // The following exception was thrown during execution in test generation
        try {
            com.reservation_system.model.User user15 = coordinatorAccountService4.autoGenerateLabManagerAccount((com.reservation_system.model.User) labManager10, "Coordinator", "Coordinator", "Guest");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Only the head lab coordinator can generate lab manager accounts.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
// flaky "8) test0079(com.reservation_system.Randoop.CoordinatorService.RegressionTest0)":         org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "labmanager" + "'", str11, "labmanager");
    }

    @Test
    public void test0080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0080");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("data/test-users.csv");
        boolean boolean3 = userRepository1.emailExists("headlabcoordinator");
        com.reservation_system.services.CoordinatorAccountService coordinatorAccountService4 = new com.reservation_system.services.CoordinatorAccountService(userRepository1);
        // The following exception was thrown during execution in test generation
        try {
            com.reservation_system.model.User user8 = coordinatorAccountService4.createHeadLabCoordinator("data/test-users.csv", "labmanager", "manager1@yorku.ca");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Only one head lab coordinator account is allowed.");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
// flaky "9) test0080(com.reservation_system.Randoop.CoordinatorService.RegressionTest0)":         org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
    }

    @Test
    public void test0081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0081");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("data/test-users.csv");
        com.reservation_system.model.LabManager labManager7 = new com.reservation_system.model.LabManager((int) 'a', "Manager1", "hi!", "Coordinator2", false);
        java.lang.String str8 = labManager7.getUserType();
        java.lang.String str9 = labManager7.getUserType();
        java.lang.String str10 = labManager7.getUserType();
        userRepository1.addUser((com.reservation_system.model.User) labManager7);
        labManager7.setApproved(false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "labmanager" + "'", str8, "labmanager");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "labmanager" + "'", str9, "labmanager");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "labmanager" + "'", str10, "labmanager");
    }

    @Test
    public void test0082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0082");
        com.reservation_system.model.Guest guest5 = new com.reservation_system.model.Guest((int) (byte) -1, "coord2@yorku.ca", "coord2@yorku.ca", "hi!", true);
        java.lang.String str6 = guest5.getUserType();
        java.lang.String str7 = guest5.getName();
        java.lang.String str8 = guest5.getEmail();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Guest" + "'", str6, "Guest");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "coord2@yorku.ca" + "'", str7, "coord2@yorku.ca");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "coord2@yorku.ca" + "'", str8, "coord2@yorku.ca");
    }

    @Test
    public void test0083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0083");
        com.reservation_system.model.User user6 = com.reservation_system.patterns.factory.UserFactory.createUser("Guest", (int) (byte) 0, "Manager1", "Guest", "Guest", false);
        org.junit.Assert.assertNotNull(user6);
    }

    @Test
    public void test0084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0084");
        com.reservation_system.model.Faculty faculty5 = new com.reservation_system.model.Faculty((int) ' ', "Student", "Coordinator2", "data/test-users.csv", true);
        java.lang.Class<?> wildcardClass6 = faculty5.getClass();
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0085");
        com.reservation_system.model.LabManager labManager5 = new com.reservation_system.model.LabManager(10, "manager1@yorku.ca", "Manager1", "", true);
        java.lang.String str6 = labManager5.getUserType();
        java.lang.String str7 = labManager5.getUserType();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "labmanager" + "'", str6, "labmanager");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "labmanager" + "'", str7, "labmanager");
    }

    @Test
    public void test0086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0086");
        com.reservation_system.model.Researcher researcher5 = new com.reservation_system.model.Researcher((int) 'a', "headlabcoordinator", "", "coord2@yorku.ca", false);
        java.lang.String str6 = researcher5.getPassword();
        researcher5.setApproved(false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "coord2@yorku.ca" + "'", str6, "coord2@yorku.ca");
    }

    @Test
    public void test0087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0087");
        // The following exception was thrown during execution in test generation
        try {
            com.reservation_system.model.User user6 = com.reservation_system.patterns.factory.UserFactory.createUser("Coordinator", 10, "coord@yorku.ca", "Student", "coord@yorku.ca", true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid user type: Coordinator");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0088");
        com.reservation_system.model.Researcher researcher5 = new com.reservation_system.model.Researcher((int) (byte) -1, "labmanager", "Strong1!", "Coordinator2", true);
    }

    @Test
    public void test0089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0089");
        com.reservation_system.model.Faculty faculty5 = new com.reservation_system.model.Faculty((int) (short) 1, "labmanager", "data/test-users.csv", "Guest", true);
    }

    @Test
    public void test0090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0090");
        // The following exception was thrown during execution in test generation
        try {
            com.reservation_system.model.User user6 = com.reservation_system.patterns.factory.UserFactory.createUser("", 32, "data/test-users.csv", "Coordinator2", "Guest", false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid user type: ");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0091");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("data/test-users.csv");
        boolean boolean2 = userRepository1.headLabCoordinatorExists();
        java.util.List<com.reservation_system.model.User> userList3 = userRepository1.getAllUsers();
        int int4 = userRepository1.getNextID();
        boolean boolean5 = userRepository1.headLabCoordinatorExists();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(userList3);
// flaky "10) test0091(com.reservation_system.Randoop.CoordinatorService.RegressionTest0)":         org.junit.Assert.assertTrue("'" + int4 + "' != '" + 101 + "'", int4 == 101);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
    }

    @Test
    public void test0092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0092");
        com.reservation_system.model.Researcher researcher5 = new com.reservation_system.model.Researcher(1, "headlabcoordinator", "hi!", "Guest", true);
        java.lang.String str6 = researcher5.getUserType();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Researcher" + "'", str6, "Researcher");
    }

    @Test
    public void test0093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0093");
        com.reservation_system.model.Researcher researcher5 = new com.reservation_system.model.Researcher((int) (short) 10, "Coordinator", "", "", true);
    }

    @Test
    public void test0094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0094");
        com.reservation_system.model.User user6 = com.reservation_system.patterns.factory.UserFactory.createUser("Guest", 1, "labmanager", "coord2@yorku.ca", "coord2@yorku.ca", false);
        org.junit.Assert.assertNotNull(user6);
    }

    @Test
    public void test0095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0095");
        com.reservation_system.model.Researcher researcher5 = new com.reservation_system.model.Researcher(10, "coord@yorku.ca", "Faculty", "Faculty", true);
        java.lang.String str6 = researcher5.getUserType();
        boolean boolean7 = researcher5.requiresDepartmentApproval();
        java.lang.String str8 = researcher5.getEmail();
        java.lang.Class<?> wildcardClass9 = researcher5.getClass();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Researcher" + "'", str6, "Researcher");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Faculty" + "'", str8, "Faculty");
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0096");
        com.reservation_system.model.Student student5 = new com.reservation_system.model.Student((-1), "Guest", "data/test-users.csv", "coord2@yorku.ca", true);
        int int6 = student5.getID();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
    }

    @Test
    public void test0097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0097");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("data/test-users.csv");
        boolean boolean3 = userRepository1.emailExists("headlabcoordinator");
        com.reservation_system.services.CoordinatorAccountService coordinatorAccountService4 = new com.reservation_system.services.CoordinatorAccountService(userRepository1);
        com.reservation_system.services.CoordinatorAccountService coordinatorAccountService5 = new com.reservation_system.services.CoordinatorAccountService(userRepository1);
        com.reservation_system.model.Researcher researcher11 = new com.reservation_system.model.Researcher(10, "coord@yorku.ca", "Faculty", "Faculty", true);
        java.lang.String str12 = researcher11.getUserType();
        java.lang.String str13 = researcher11.getEmail();
        // The following exception was thrown during execution in test generation
        try {
            com.reservation_system.model.User user17 = coordinatorAccountService5.autoGenerateLabManagerAccount((com.reservation_system.model.User) researcher11, "hi!", "Coordinator", "");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Password is required.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
// flaky "11) test0097(com.reservation_system.Randoop.CoordinatorService.RegressionTest0)":         org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Researcher" + "'", str12, "Researcher");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Faculty" + "'", str13, "Faculty");
    }

    @Test
    public void test0098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0098");
        com.reservation_system.model.Student student5 = new com.reservation_system.model.Student((int) (short) -1, "coord2@yorku.ca", "Student", "Coordinator", true);
        student5.setApproved(true);
        java.lang.String str8 = student5.getPassword();
        java.lang.String str9 = student5.getUserType();
        java.lang.String str10 = student5.getUserType();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Coordinator" + "'", str8, "Coordinator");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Student" + "'", str9, "Student");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Student" + "'", str10, "Student");
    }

    @Test
    public void test0099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0099");
        com.reservation_system.model.Student student5 = new com.reservation_system.model.Student((int) '#', "Coordinator", "Coordinator", "", false);
        boolean boolean6 = student5.requiresDepartmentApproval();
        java.lang.String str7 = student5.getUserType();
        java.lang.String str8 = student5.getUserType();
        java.lang.String str9 = student5.getUserType();
        boolean boolean10 = student5.isApproved();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Student" + "'", str7, "Student");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Student" + "'", str8, "Student");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Student" + "'", str9, "Student");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test0100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0100");
        com.reservation_system.model.Guest guest5 = new com.reservation_system.model.Guest(100, "Coordinator2", "Coordinator", "Guest", false);
        java.lang.String str6 = guest5.getUserType();
        java.lang.String str7 = guest5.getUserType();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Guest" + "'", str6, "Guest");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Guest" + "'", str7, "Guest");
    }

    @Test
    public void test0101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0101");
        com.reservation_system.model.HeadLabCoordinator headLabCoordinator5 = new com.reservation_system.model.HeadLabCoordinator((int) (short) 100, "manager1@yorku.ca", "hi!", "data/test-users.csv", true);
        java.lang.String str6 = headLabCoordinator5.getUserType();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "headlabcoordinator" + "'", str6, "headlabcoordinator");
    }

    @Test
    public void test0102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0102");
        com.reservation_system.repository.UserRepository userRepository0 = null;
        com.reservation_system.services.CoordinatorAccountService coordinatorAccountService1 = new com.reservation_system.services.CoordinatorAccountService(userRepository0);
        com.reservation_system.model.Researcher researcher7 = new com.reservation_system.model.Researcher((int) (short) -1, "data/test-users.csv", "data/test-users.csv", "Student", true);
        java.lang.String str8 = researcher7.getUserType();
        // The following exception was thrown during execution in test generation
        try {
            com.reservation_system.model.User user12 = coordinatorAccountService1.autoGenerateLabManagerAccount((com.reservation_system.model.User) researcher7, "Faculty", "Coordinator", "Guest");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Only the head lab coordinator can generate lab manager accounts.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Researcher" + "'", str8, "Researcher");
    }

    @Test
    public void test0103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0103");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("data/test-users.csv");
        java.util.Optional<com.reservation_system.model.User> userOptional3 = userRepository1.findByEmail("Faculty");
        java.util.Optional<com.reservation_system.model.User> userOptional5 = userRepository1.findByEmail("headlabcoordinator");
        java.util.List<com.reservation_system.model.User> userList6 = userRepository1.getAllUsers();
        int int7 = userRepository1.getNextID();
        java.util.List<com.reservation_system.model.User> userList8 = userRepository1.getAllUsers();
        com.reservation_system.services.CoordinatorAccountService coordinatorAccountService9 = new com.reservation_system.services.CoordinatorAccountService(userRepository1);
        java.lang.Class<?> wildcardClass10 = coordinatorAccountService9.getClass();
        org.junit.Assert.assertNotNull(userOptional3);
        org.junit.Assert.assertNotNull(userOptional5);
        org.junit.Assert.assertNotNull(userList6);
// flaky "12) test0103(com.reservation_system.Randoop.CoordinatorService.RegressionTest0)":         org.junit.Assert.assertTrue("'" + int7 + "' != '" + 101 + "'", int7 == 101);
        org.junit.Assert.assertNotNull(userList8);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0104");
        com.reservation_system.model.Guest guest5 = new com.reservation_system.model.Guest((int) (byte) 0, "coord2@yorku.ca", "Manager1", "manager1@yorku.ca", true);
    }

    @Test
    public void test0105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0105");
        com.reservation_system.model.Student student5 = new com.reservation_system.model.Student((-1), "Guest", "data/test-users.csv", "coord2@yorku.ca", true);
        boolean boolean6 = student5.isApproved();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test0106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0106");
        com.reservation_system.model.Faculty faculty5 = new com.reservation_system.model.Faculty((int) '4', "Coordinator2", "labmanager", "hi!", true);
    }

    @Test
    public void test0107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0107");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("data/test-users.csv");
        com.reservation_system.model.LabManager labManager7 = new com.reservation_system.model.LabManager((int) 'a', "Manager1", "hi!", "Coordinator2", false);
        java.lang.String str8 = labManager7.getUserType();
        java.lang.String str9 = labManager7.getUserType();
        java.lang.String str10 = labManager7.getUserType();
        userRepository1.addUser((com.reservation_system.model.User) labManager7);
        int int12 = userRepository1.getNextID();
        com.reservation_system.services.CoordinatorAccountService coordinatorAccountService13 = new com.reservation_system.services.CoordinatorAccountService(userRepository1);
        java.lang.Class<?> wildcardClass14 = coordinatorAccountService13.getClass();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "labmanager" + "'", str8, "labmanager");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "labmanager" + "'", str9, "labmanager");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "labmanager" + "'", str10, "labmanager");
// flaky "13) test0107(com.reservation_system.Randoop.CoordinatorService.RegressionTest0)":         org.junit.Assert.assertTrue("'" + int12 + "' != '" + 101 + "'", int12 == 101);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test0108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0108");
        com.reservation_system.model.Researcher researcher5 = new com.reservation_system.model.Researcher((int) (byte) -1, "Manager1", "", "Strong1!", true);
        java.lang.Class<?> wildcardClass6 = researcher5.getClass();
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0109");
        com.reservation_system.model.User user6 = com.reservation_system.patterns.factory.UserFactory.createUser("Researcher", 10, "data/test-users.csv", "Researcher", "data/test-users.csv", false);
        org.junit.Assert.assertNotNull(user6);
    }

    @Test
    public void test0110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0110");
        com.reservation_system.repository.UserRepository userRepository0 = null;
        com.reservation_system.services.CoordinatorAccountService coordinatorAccountService1 = new com.reservation_system.services.CoordinatorAccountService(userRepository0);
        // The following exception was thrown during execution in test generation
        try {
            com.reservation_system.model.User user5 = coordinatorAccountService1.createHeadLabCoordinator("Strong1!", "Strong1!", "Researcher");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.reservation_system.repository.UserRepository.headLabCoordinatorExists()\" because \"this.userRepository\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0111");
        com.reservation_system.model.HeadLabCoordinator headLabCoordinator5 = new com.reservation_system.model.HeadLabCoordinator(1, "hi!", "manager1@yorku.ca", "Manager1", true);
        java.lang.Class<?> wildcardClass6 = headLabCoordinator5.getClass();
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0112");
        com.reservation_system.model.LabManager labManager5 = new com.reservation_system.model.LabManager((int) (short) 0, "", "Faculty", "Student", true);
        java.lang.String str6 = labManager5.getEmail();
        boolean boolean7 = labManager5.requiresDepartmentApproval();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Faculty" + "'", str6, "Faculty");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test0113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0113");
        com.reservation_system.model.Student student5 = new com.reservation_system.model.Student((-1), "headlabcoordinator", "data/test-users.csv", "manager1@yorku.ca", false);
    }

    @Test
    public void test0114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0114");
        com.reservation_system.model.HeadLabCoordinator headLabCoordinator5 = new com.reservation_system.model.HeadLabCoordinator((int) (byte) 100, "labmanager", "manager1@yorku.ca", "Researcher", true);
        headLabCoordinator5.setApproved(true);
        java.lang.String str8 = headLabCoordinator5.getUserType();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "headlabcoordinator" + "'", str8, "headlabcoordinator");
    }

    @Test
    public void test0115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0115");
        com.reservation_system.model.LabManager labManager5 = new com.reservation_system.model.LabManager((int) '#', "Faculty", "manager1@yorku.ca", "", true);
        java.lang.String str6 = labManager5.getUserType();
        boolean boolean7 = labManager5.requiresDepartmentApproval();
        java.lang.String str8 = labManager5.getName();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "labmanager" + "'", str6, "labmanager");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Faculty" + "'", str8, "Faculty");
    }

    @Test
    public void test0116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0116");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("data/test-users.csv");
        boolean boolean2 = userRepository1.headLabCoordinatorExists();
        boolean boolean3 = userRepository1.headLabCoordinatorExists();
        java.util.Optional<com.reservation_system.model.User> userOptional5 = userRepository1.findByEmail("");
        com.reservation_system.services.CoordinatorAccountService coordinatorAccountService6 = new com.reservation_system.services.CoordinatorAccountService(userRepository1);
        // The following exception was thrown during execution in test generation
        try {
            com.reservation_system.model.User user10 = coordinatorAccountService6.createHeadLabCoordinator("coord@yorku.ca", "Coordinator2", "Researcher");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Only one head lab coordinator account is allowed.");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(userOptional5);
    }

    @Test
    public void test0117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0117");
        com.reservation_system.model.Researcher researcher5 = new com.reservation_system.model.Researcher((int) (short) -1, "coord@yorku.ca", "data/test-users.csv", "coord2@yorku.ca", false);
        java.lang.String str6 = researcher5.getUserType();
        java.lang.String str7 = researcher5.getName();
        java.lang.String str8 = researcher5.getName();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Researcher" + "'", str6, "Researcher");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "coord@yorku.ca" + "'", str7, "coord@yorku.ca");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "coord@yorku.ca" + "'", str8, "coord@yorku.ca");
    }

    @Test
    public void test0118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0118");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("data/test-users.csv");
        java.util.Optional<com.reservation_system.model.User> userOptional3 = userRepository1.findByEmail("Faculty");
        boolean boolean5 = userRepository1.emailExists("");
        java.lang.Class<?> wildcardClass6 = userRepository1.getClass();
        org.junit.Assert.assertNotNull(userOptional3);
// flaky "14) test0118(com.reservation_system.Randoop.CoordinatorService.RegressionTest0)":         org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0119");
        com.reservation_system.model.LabManager labManager5 = new com.reservation_system.model.LabManager((int) (byte) 10, "headlabcoordinator", "Student", "", false);
        boolean boolean6 = labManager5.requiresDepartmentApproval();
        boolean boolean7 = labManager5.isApproved();
        java.lang.Class<?> wildcardClass8 = labManager5.getClass();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0120");
        com.reservation_system.model.User user6 = com.reservation_system.patterns.factory.UserFactory.createUser("Guest", (int) (short) 1, "Manager1", "data/test-users.csv", "Researcher", true);
        org.junit.Assert.assertNotNull(user6);
    }

    @Test
    public void test0121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0121");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("data/test-users.csv");
        java.util.Optional<com.reservation_system.model.User> userOptional3 = userRepository1.findByEmail("Faculty");
        java.util.Optional<com.reservation_system.model.User> userOptional5 = userRepository1.findByEmail("headlabcoordinator");
        boolean boolean7 = userRepository1.emailExists("Manager1");
        java.util.List<com.reservation_system.model.User> userList8 = userRepository1.getAllUsers();
        boolean boolean10 = userRepository1.emailExists("");
        java.util.List<com.reservation_system.model.User> userList11 = userRepository1.getAllUsers();
        boolean boolean13 = userRepository1.emailExists("coord2@yorku.ca");
        org.junit.Assert.assertNotNull(userOptional3);
        org.junit.Assert.assertNotNull(userOptional5);
// flaky "15) test0121(com.reservation_system.Randoop.CoordinatorService.RegressionTest0)":         org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(userList8);
// flaky "1) test0121(com.reservation_system.Randoop.CoordinatorService.RegressionTest0)":         org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(userList11);
// flaky "1) test0121(com.reservation_system.Randoop.CoordinatorService.RegressionTest0)":         org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test0122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0122");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("data/test-users.csv");
        java.util.Optional<com.reservation_system.model.User> userOptional3 = userRepository1.findByEmail("Faculty");
        java.util.Optional<com.reservation_system.model.User> userOptional5 = userRepository1.findByEmail("headlabcoordinator");
        boolean boolean7 = userRepository1.emailExists("Manager1");
        java.util.List<com.reservation_system.model.User> userList8 = userRepository1.getAllUsers();
        boolean boolean10 = userRepository1.emailExists("");
        com.reservation_system.model.LabManager labManager16 = new com.reservation_system.model.LabManager((int) (short) 0, "", "Faculty", "Student", true);
        java.lang.String str17 = labManager16.getEmail();
        java.lang.String str18 = labManager16.getUserType();
        userRepository1.addUser((com.reservation_system.model.User) labManager16);
        int int20 = labManager16.getID();
        org.junit.Assert.assertNotNull(userOptional3);
        org.junit.Assert.assertNotNull(userOptional5);
// flaky "16) test0122(com.reservation_system.Randoop.CoordinatorService.RegressionTest0)":         org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(userList8);
// flaky "2) test0122(com.reservation_system.Randoop.CoordinatorService.RegressionTest0)":         org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "Faculty" + "'", str17, "Faculty");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "labmanager" + "'", str18, "labmanager");
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
    }

    @Test
    public void test0123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0123");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("data/test-users.csv");
        boolean boolean2 = userRepository1.headLabCoordinatorExists();
        java.util.List<com.reservation_system.model.User> userList3 = userRepository1.getAllUsers();
        java.lang.Class<?> wildcardClass4 = userRepository1.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(userList3);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test0124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0124");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("data/test-users.csv");
        java.util.Optional<com.reservation_system.model.User> userOptional3 = userRepository1.findByEmail("Faculty");
        java.util.Optional<com.reservation_system.model.User> userOptional5 = userRepository1.findByEmail("headlabcoordinator");
        java.util.List<com.reservation_system.model.User> userList6 = userRepository1.getAllUsers();
        int int7 = userRepository1.getNextID();
        java.util.List<com.reservation_system.model.User> userList8 = userRepository1.getAllUsers();
        com.reservation_system.services.CoordinatorAccountService coordinatorAccountService9 = new com.reservation_system.services.CoordinatorAccountService(userRepository1);
        // The following exception was thrown during execution in test generation
        try {
            com.reservation_system.model.User user13 = coordinatorAccountService9.createHeadLabCoordinator("Faculty", "headlabcoordinator", "manager1@yorku.ca");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Only one head lab coordinator account is allowed.");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(userOptional3);
        org.junit.Assert.assertNotNull(userOptional5);
        org.junit.Assert.assertNotNull(userList6);
// flaky "17) test0124(com.reservation_system.Randoop.CoordinatorService.RegressionTest0)":         org.junit.Assert.assertTrue("'" + int7 + "' != '" + 101 + "'", int7 == 101);
        org.junit.Assert.assertNotNull(userList8);
    }

    @Test
    public void test0125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0125");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("data/test-users.csv");
        com.reservation_system.model.LabManager labManager7 = new com.reservation_system.model.LabManager((int) (short) 0, "", "Faculty", "Student", true);
        java.lang.String str8 = labManager7.getUserType();
        java.lang.String str9 = labManager7.getPassword();
        userRepository1.addUser((com.reservation_system.model.User) labManager7);
        boolean boolean11 = userRepository1.headLabCoordinatorExists();
        com.reservation_system.model.Researcher researcher17 = new com.reservation_system.model.Researcher(0, "Student", "Faculty", "Faculty", false);
        userRepository1.addUser((com.reservation_system.model.User) researcher17);
        java.util.Optional<com.reservation_system.model.User> userOptional20 = userRepository1.findByEmail("data/test-users.csv");
        int int21 = userRepository1.getNextID();
        boolean boolean22 = userRepository1.headLabCoordinatorExists();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "labmanager" + "'", str8, "labmanager");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Student" + "'", str9, "Student");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(userOptional20);
// flaky "18) test0125(com.reservation_system.Randoop.CoordinatorService.RegressionTest0)":         org.junit.Assert.assertTrue("'" + int21 + "' != '" + 101 + "'", int21 == 101);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
    }

    @Test
    public void test0126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0126");
        com.reservation_system.model.Researcher researcher5 = new com.reservation_system.model.Researcher((int) (byte) -1, "Manager1", "", "Strong1!", true);
        boolean boolean6 = researcher5.isApproved();
        int int7 = researcher5.getID();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
    }

    @Test
    public void test0127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0127");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("data/test-users.csv");
        com.reservation_system.model.LabManager labManager7 = new com.reservation_system.model.LabManager((int) 'a', "Manager1", "hi!", "Coordinator2", false);
        java.lang.String str8 = labManager7.getUserType();
        java.lang.String str9 = labManager7.getUserType();
        java.lang.String str10 = labManager7.getUserType();
        userRepository1.addUser((com.reservation_system.model.User) labManager7);
        int int12 = userRepository1.getNextID();
        com.reservation_system.services.CoordinatorAccountService coordinatorAccountService13 = new com.reservation_system.services.CoordinatorAccountService(userRepository1);
        boolean boolean15 = userRepository1.emailExists("Researcher");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "labmanager" + "'", str8, "labmanager");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "labmanager" + "'", str9, "labmanager");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "labmanager" + "'", str10, "labmanager");
// flaky "19) test0127(com.reservation_system.Randoop.CoordinatorService.RegressionTest0)":         org.junit.Assert.assertTrue("'" + int12 + "' != '" + 101 + "'", int12 == 101);
// flaky "3) test0127(com.reservation_system.Randoop.CoordinatorService.RegressionTest0)":         org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
    }

    @Test
    public void test0128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0128");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("data/test-users.csv");
        com.reservation_system.model.Faculty faculty7 = new com.reservation_system.model.Faculty((int) (byte) 1, "", "Guest", "Student", true);
        userRepository1.addUser((com.reservation_system.model.User) faculty7);
        java.util.List<com.reservation_system.model.User> userList9 = userRepository1.getAllUsers();
        com.reservation_system.services.CoordinatorAccountService coordinatorAccountService10 = new com.reservation_system.services.CoordinatorAccountService(userRepository1);
        // The following exception was thrown during execution in test generation
        try {
            com.reservation_system.model.User user14 = coordinatorAccountService10.createHeadLabCoordinator("coord2@yorku.ca", "hi!", "manager1@yorku.ca");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Only one head lab coordinator account is allowed.");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(userList9);
    }

    @Test
    public void test0129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0129");
        // The following exception was thrown during execution in test generation
        try {
            com.reservation_system.model.User user6 = com.reservation_system.patterns.factory.UserFactory.createUser("coord@yorku.ca", (int) (byte) 0, "hi!", "manager1@yorku.ca", "Coordinator", true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid user type: coord@yorku.ca");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0130");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("data/test-users.csv");
        com.reservation_system.model.LabManager labManager7 = new com.reservation_system.model.LabManager((int) (short) 0, "", "Faculty", "Student", true);
        java.lang.String str8 = labManager7.getUserType();
        java.lang.String str9 = labManager7.getPassword();
        userRepository1.addUser((com.reservation_system.model.User) labManager7);
        boolean boolean11 = userRepository1.headLabCoordinatorExists();
        com.reservation_system.model.Researcher researcher17 = new com.reservation_system.model.Researcher(0, "Student", "Faculty", "Faculty", false);
        userRepository1.addUser((com.reservation_system.model.User) researcher17);
        java.util.Optional<com.reservation_system.model.User> userOptional20 = userRepository1.findByEmail("data/test-users.csv");
        com.reservation_system.model.User user27 = com.reservation_system.patterns.factory.UserFactory.createUser("Student", (int) (byte) 10, "Faculty", "Manager1", "Manager1", true);
        int int28 = user27.getID();
        userRepository1.addUser(user27);
        com.reservation_system.repository.UserRepository userRepository31 = new com.reservation_system.repository.UserRepository("data/test-users.csv");
        com.reservation_system.model.LabManager labManager37 = new com.reservation_system.model.LabManager((int) (short) 0, "", "Faculty", "Student", true);
        java.lang.String str38 = labManager37.getUserType();
        java.lang.String str39 = labManager37.getPassword();
        userRepository31.addUser((com.reservation_system.model.User) labManager37);
        boolean boolean41 = userRepository31.headLabCoordinatorExists();
        com.reservation_system.model.Researcher researcher47 = new com.reservation_system.model.Researcher(0, "Student", "Faculty", "Faculty", false);
        userRepository31.addUser((com.reservation_system.model.User) researcher47);
        java.util.Optional<com.reservation_system.model.User> userOptional50 = userRepository31.findByEmail("data/test-users.csv");
        com.reservation_system.services.CoordinatorAccountService coordinatorAccountService51 = new com.reservation_system.services.CoordinatorAccountService(userRepository31);
        int int52 = userRepository31.getNextID();
        java.util.List<com.reservation_system.model.User> userList53 = userRepository31.getAllUsers();
        userRepository1.saveAllUsers(userList53);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "labmanager" + "'", str8, "labmanager");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Student" + "'", str9, "Student");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(userOptional20);
        org.junit.Assert.assertNotNull(user27);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 10 + "'", int28 == 10);
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "labmanager" + "'", str38, "labmanager");
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "Student" + "'", str39, "Student");
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + true + "'", boolean41 == true);
        org.junit.Assert.assertNotNull(userOptional50);
// flaky "20) test0130(com.reservation_system.Randoop.CoordinatorService.RegressionTest0)":         org.junit.Assert.assertTrue("'" + int52 + "' != '" + 101 + "'", int52 == 101);
        org.junit.Assert.assertNotNull(userList53);
    }

    @Test
    public void test0131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0131");
        com.reservation_system.model.HeadLabCoordinator headLabCoordinator5 = new com.reservation_system.model.HeadLabCoordinator((int) (byte) -1, "data/test-users.csv", "Coordinator", "Researcher", true);
        java.lang.String str6 = headLabCoordinator5.getUserType();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "headlabcoordinator" + "'", str6, "headlabcoordinator");
    }

    @Test
    public void test0132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0132");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("data/test-users.csv");
        java.util.Optional<com.reservation_system.model.User> userOptional3 = userRepository1.findByEmail("Faculty");
        java.util.Optional<com.reservation_system.model.User> userOptional5 = userRepository1.findByEmail("headlabcoordinator");
        com.reservation_system.model.Researcher researcher11 = new com.reservation_system.model.Researcher((int) '#', "Student", "coord2@yorku.ca", "labmanager", false);
        researcher11.setApproved(true);
        userRepository1.addUser((com.reservation_system.model.User) researcher11);
        java.lang.Class<?> wildcardClass15 = userRepository1.getClass();
        org.junit.Assert.assertNotNull(userOptional3);
        org.junit.Assert.assertNotNull(userOptional5);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0133");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("data/test-users.csv");
        java.util.Optional<com.reservation_system.model.User> userOptional3 = userRepository1.findByEmail("Faculty");
        java.util.Optional<com.reservation_system.model.User> userOptional5 = userRepository1.findByEmail("headlabcoordinator");
        boolean boolean7 = userRepository1.emailExists("Manager1");
        java.util.List<com.reservation_system.model.User> userList8 = userRepository1.getAllUsers();
        boolean boolean10 = userRepository1.emailExists("");
        com.reservation_system.model.LabManager labManager16 = new com.reservation_system.model.LabManager((int) (short) 0, "", "Faculty", "Student", true);
        java.lang.String str17 = labManager16.getEmail();
        java.lang.String str18 = labManager16.getUserType();
        userRepository1.addUser((com.reservation_system.model.User) labManager16);
        boolean boolean20 = userRepository1.headLabCoordinatorExists();
        com.reservation_system.model.Student student26 = new com.reservation_system.model.Student((int) (short) 0, "coord@yorku.ca", "headlabcoordinator", "Strong1!", true);
        java.lang.String str27 = student26.getPassword();
        userRepository1.addUser((com.reservation_system.model.User) student26);
        boolean boolean29 = userRepository1.headLabCoordinatorExists();
        com.reservation_system.repository.UserRepository userRepository31 = new com.reservation_system.repository.UserRepository("data/test-users.csv");
        boolean boolean32 = userRepository31.headLabCoordinatorExists();
        boolean boolean33 = userRepository31.headLabCoordinatorExists();
        boolean boolean35 = userRepository31.emailExists("Manager1");
        java.util.Optional<com.reservation_system.model.User> userOptional37 = userRepository31.findByEmail("Strong1!");
        java.util.List<com.reservation_system.model.User> userList38 = userRepository31.getAllUsers();
        userRepository1.saveAllUsers(userList38);
        boolean boolean40 = userRepository1.headLabCoordinatorExists();
        boolean boolean41 = userRepository1.headLabCoordinatorExists();
        org.junit.Assert.assertNotNull(userOptional3);
        org.junit.Assert.assertNotNull(userOptional5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(userList8);
// flaky "21) test0133(com.reservation_system.Randoop.CoordinatorService.RegressionTest0)":         org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "Faculty" + "'", str17, "Faculty");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "labmanager" + "'", str18, "labmanager");
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "Strong1!" + "'", str27, "Strong1!");
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
        org.junit.Assert.assertNotNull(userOptional37);
        org.junit.Assert.assertNotNull(userList38);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + true + "'", boolean40 == true);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + true + "'", boolean41 == true);
    }

    @Test
    public void test0134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0134");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("data/test-users.csv");
        com.reservation_system.model.Faculty faculty7 = new com.reservation_system.model.Faculty((int) (byte) 1, "", "Guest", "Student", true);
        userRepository1.addUser((com.reservation_system.model.User) faculty7);
        java.util.List<com.reservation_system.model.User> userList9 = userRepository1.getAllUsers();
        com.reservation_system.services.CoordinatorAccountService coordinatorAccountService10 = new com.reservation_system.services.CoordinatorAccountService(userRepository1);
        int int11 = userRepository1.getNextID();
        org.junit.Assert.assertNotNull(userList9);
// flaky "22) test0134(com.reservation_system.Randoop.CoordinatorService.RegressionTest0)":         org.junit.Assert.assertTrue("'" + int11 + "' != '" + 101 + "'", int11 == 101);
    }

    @Test
    public void test0135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0135");
        com.reservation_system.model.LabManager labManager5 = new com.reservation_system.model.LabManager((int) 'a', "Coordinator2", "", "", false);
        java.lang.String str6 = labManager5.getEmail();
        java.lang.Class<?> wildcardClass7 = labManager5.getClass();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0136");
        // The following exception was thrown during execution in test generation
        try {
            com.reservation_system.model.User user6 = com.reservation_system.patterns.factory.UserFactory.createUser("hi!", 10, "Student", "", "", true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid user type: hi!");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0137");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("data/test-users.csv");
        boolean boolean3 = userRepository1.emailExists("headlabcoordinator");
        com.reservation_system.services.CoordinatorAccountService coordinatorAccountService4 = new com.reservation_system.services.CoordinatorAccountService(userRepository1);
        com.reservation_system.services.CoordinatorAccountService coordinatorAccountService5 = new com.reservation_system.services.CoordinatorAccountService(userRepository1);
        // The following exception was thrown during execution in test generation
        try {
            com.reservation_system.model.User user9 = coordinatorAccountService5.createHeadLabCoordinator("Manager1", "labmanager", "Coordinator2");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Only one head lab coordinator account is allowed.");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
    }

    @Test
    public void test0138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0138");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("data/test-users.csv");
        com.reservation_system.model.LabManager labManager7 = new com.reservation_system.model.LabManager((int) (short) 0, "", "Faculty", "Student", true);
        java.lang.String str8 = labManager7.getUserType();
        java.lang.String str9 = labManager7.getPassword();
        userRepository1.addUser((com.reservation_system.model.User) labManager7);
        boolean boolean11 = userRepository1.headLabCoordinatorExists();
        com.reservation_system.model.Researcher researcher17 = new com.reservation_system.model.Researcher(0, "Student", "Faculty", "Faculty", false);
        userRepository1.addUser((com.reservation_system.model.User) researcher17);
        researcher17.setApproved(false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "labmanager" + "'", str8, "labmanager");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Student" + "'", str9, "Student");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test0139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0139");
        com.reservation_system.model.Researcher researcher5 = new com.reservation_system.model.Researcher((int) '#', "Researcher", "coord2@yorku.ca", "labmanager", false);
    }

    @Test
    public void test0140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0140");
        // The following exception was thrown during execution in test generation
        try {
            com.reservation_system.model.User user6 = com.reservation_system.patterns.factory.UserFactory.createUser("Coordinator", (int) (short) 10, "", "hi!", "Coordinator", false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid user type: Coordinator");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0141");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("data/test-users.csv");
        java.util.Optional<com.reservation_system.model.User> userOptional3 = userRepository1.findByEmail("Faculty");
        java.util.Optional<com.reservation_system.model.User> userOptional5 = userRepository1.findByEmail("headlabcoordinator");
        boolean boolean7 = userRepository1.emailExists("Manager1");
        java.util.List<com.reservation_system.model.User> userList8 = userRepository1.getAllUsers();
        boolean boolean9 = userRepository1.headLabCoordinatorExists();
        java.lang.Class<?> wildcardClass10 = userRepository1.getClass();
        org.junit.Assert.assertNotNull(userOptional3);
        org.junit.Assert.assertNotNull(userOptional5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(userList8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0142");
        com.reservation_system.model.User user6 = com.reservation_system.patterns.factory.UserFactory.createUser("Student", (int) 'a', "hi!", "Faculty", "headlabcoordinator", true);
        boolean boolean7 = user6.isApproved();
        org.junit.Assert.assertNotNull(user6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test0143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0143");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("data/test-users.csv");
        java.util.Optional<com.reservation_system.model.User> userOptional3 = userRepository1.findByEmail("Faculty");
        java.util.Optional<com.reservation_system.model.User> userOptional5 = userRepository1.findByEmail("headlabcoordinator");
        boolean boolean7 = userRepository1.emailExists("Manager1");
        java.util.List<com.reservation_system.model.User> userList8 = userRepository1.getAllUsers();
        boolean boolean10 = userRepository1.emailExists("");
        com.reservation_system.model.LabManager labManager16 = new com.reservation_system.model.LabManager((int) (short) 0, "", "Faculty", "Student", true);
        java.lang.String str17 = labManager16.getEmail();
        java.lang.String str18 = labManager16.getUserType();
        userRepository1.addUser((com.reservation_system.model.User) labManager16);
        boolean boolean20 = userRepository1.headLabCoordinatorExists();
        com.reservation_system.model.Student student26 = new com.reservation_system.model.Student((int) (short) 0, "coord@yorku.ca", "headlabcoordinator", "Strong1!", true);
        java.lang.String str27 = student26.getPassword();
        userRepository1.addUser((com.reservation_system.model.User) student26);
        com.reservation_system.model.Student student34 = new com.reservation_system.model.Student((int) '#', "Coordinator", "Coordinator", "", false);
        boolean boolean35 = student34.requiresDepartmentApproval();
        java.lang.String str36 = student34.getUserType();
        int int37 = student34.getID();
        userRepository1.addUser((com.reservation_system.model.User) student34);
        int int39 = userRepository1.getNextID();
        java.util.Optional<com.reservation_system.model.User> userOptional41 = userRepository1.findByEmail("manager1@yorku.ca");
        org.junit.Assert.assertNotNull(userOptional3);
        org.junit.Assert.assertNotNull(userOptional5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(userList8);
// flaky "23) test0143(com.reservation_system.Randoop.CoordinatorService.RegressionTest0)":         org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "Faculty" + "'", str17, "Faculty");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "labmanager" + "'", str18, "labmanager");
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "Strong1!" + "'", str27, "Strong1!");
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "Student" + "'", str36, "Student");
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 35 + "'", int37 == 35);
// flaky "4) test0143(com.reservation_system.Randoop.CoordinatorService.RegressionTest0)":         org.junit.Assert.assertTrue("'" + int39 + "' != '" + 101 + "'", int39 == 101);
        org.junit.Assert.assertNotNull(userOptional41);
    }

    @Test
    public void test0144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0144");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("data/test-users.csv");
        com.reservation_system.model.LabManager labManager7 = new com.reservation_system.model.LabManager((int) (short) 0, "", "Faculty", "Student", true);
        java.lang.String str8 = labManager7.getUserType();
        java.lang.String str9 = labManager7.getPassword();
        userRepository1.addUser((com.reservation_system.model.User) labManager7);
        com.reservation_system.services.CoordinatorAccountService coordinatorAccountService11 = new com.reservation_system.services.CoordinatorAccountService(userRepository1);
        // The following exception was thrown during execution in test generation
        try {
            com.reservation_system.model.User user15 = coordinatorAccountService11.createHeadLabCoordinator("hi!", "hi!", "Guest");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Only one head lab coordinator account is allowed.");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "labmanager" + "'", str8, "labmanager");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Student" + "'", str9, "Student");
    }

    @Test
    public void test0145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0145");
        com.reservation_system.model.Student student5 = new com.reservation_system.model.Student((int) (short) 0, "coord@yorku.ca", "headlabcoordinator", "Strong1!", true);
        java.lang.String str6 = student5.getUserType();
        java.lang.String str7 = student5.getName();
        student5.setApproved(false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Student" + "'", str6, "Student");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "coord@yorku.ca" + "'", str7, "coord@yorku.ca");
    }

    @Test
    public void test0146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0146");
        // The following exception was thrown during execution in test generation
        try {
            com.reservation_system.model.User user6 = com.reservation_system.patterns.factory.UserFactory.createUser("manager1@yorku.ca", (int) (byte) 0, "labmanager", "headlabcoordinator", "Manager1", true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid user type: manager1@yorku.ca");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0147");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("data/test-users.csv");
        boolean boolean2 = userRepository1.headLabCoordinatorExists();
        java.util.List<com.reservation_system.model.User> userList3 = userRepository1.getAllUsers();
        int int4 = userRepository1.getNextID();
        java.util.Optional<com.reservation_system.model.User> userOptional6 = userRepository1.findByEmail("Coordinator");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(userList3);
// flaky "24) test0147(com.reservation_system.Randoop.CoordinatorService.RegressionTest0)":         org.junit.Assert.assertTrue("'" + int4 + "' != '" + 101 + "'", int4 == 101);
        org.junit.Assert.assertNotNull(userOptional6);
    }

    @Test
    public void test0148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0148");
        com.reservation_system.model.Faculty faculty5 = new com.reservation_system.model.Faculty((int) (byte) 1, "", "Guest", "Student", true);
        java.lang.String str6 = faculty5.getUserType();
        java.lang.String str7 = faculty5.getUserType();
        java.lang.String str8 = faculty5.getUserType();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Faculty" + "'", str6, "Faculty");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Faculty" + "'", str7, "Faculty");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Faculty" + "'", str8, "Faculty");
    }

    @Test
    public void test0149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0149");
        com.reservation_system.model.User user6 = com.reservation_system.patterns.factory.UserFactory.createUser("labmanager", (int) (short) 10, "Researcher", "Faculty", "coord2@yorku.ca", false);
        org.junit.Assert.assertNotNull(user6);
    }

    @Test
    public void test0150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0150");
        // The following exception was thrown during execution in test generation
        try {
            com.reservation_system.model.User user6 = com.reservation_system.patterns.factory.UserFactory.createUser("coord@yorku.ca", (int) (byte) -1, "Student", "coord@yorku.ca", "hi!", true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid user type: coord@yorku.ca");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0151");
        com.reservation_system.model.Researcher researcher5 = new com.reservation_system.model.Researcher((int) (short) 10, "Coordinator", "headlabcoordinator", "headlabcoordinator", true);
        int int6 = researcher5.getID();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
    }

    @Test
    public void test0152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0152");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("data/test-users.csv");
        boolean boolean2 = userRepository1.headLabCoordinatorExists();
        java.util.List<com.reservation_system.model.User> userList3 = userRepository1.getAllUsers();
        int int4 = userRepository1.getNextID();
        com.reservation_system.repository.UserRepository userRepository6 = new com.reservation_system.repository.UserRepository("data/test-users.csv");
        boolean boolean7 = userRepository6.headLabCoordinatorExists();
        boolean boolean8 = userRepository6.headLabCoordinatorExists();
        java.util.Optional<com.reservation_system.model.User> userOptional10 = userRepository6.findByEmail("");
        com.reservation_system.services.CoordinatorAccountService coordinatorAccountService11 = new com.reservation_system.services.CoordinatorAccountService(userRepository6);
        com.reservation_system.repository.UserRepository userRepository13 = new com.reservation_system.repository.UserRepository("data/test-users.csv");
        java.util.Optional<com.reservation_system.model.User> userOptional15 = userRepository13.findByEmail("Faculty");
        java.util.Optional<com.reservation_system.model.User> userOptional17 = userRepository13.findByEmail("headlabcoordinator");
        java.util.List<com.reservation_system.model.User> userList18 = userRepository13.getAllUsers();
        int int19 = userRepository13.getNextID();
        java.util.List<com.reservation_system.model.User> userList20 = userRepository13.getAllUsers();
        userRepository6.saveAllUsers(userList20);
        userRepository1.saveAllUsers(userList20);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(userList3);
// flaky "25) test0152(com.reservation_system.Randoop.CoordinatorService.RegressionTest0)":         org.junit.Assert.assertTrue("'" + int4 + "' != '" + 101 + "'", int4 == 101);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(userOptional10);
        org.junit.Assert.assertNotNull(userOptional15);
        org.junit.Assert.assertNotNull(userOptional17);
        org.junit.Assert.assertNotNull(userList18);
// flaky "5) test0152(com.reservation_system.Randoop.CoordinatorService.RegressionTest0)":         org.junit.Assert.assertTrue("'" + int19 + "' != '" + 101 + "'", int19 == 101);
        org.junit.Assert.assertNotNull(userList20);
    }

    @Test
    public void test0153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0153");
        com.reservation_system.model.Faculty faculty5 = new com.reservation_system.model.Faculty(97, "Researcher", "Coordinator", "coord@yorku.ca", false);
    }

    @Test
    public void test0154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0154");
        com.reservation_system.model.Researcher researcher5 = new com.reservation_system.model.Researcher((int) (short) 0, "hi!", "Researcher", "Manager1", false);
    }

    @Test
    public void test0155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0155");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("data/test-users.csv");
        com.reservation_system.model.LabManager labManager7 = new com.reservation_system.model.LabManager((int) (short) 0, "", "Faculty", "Student", true);
        java.lang.String str8 = labManager7.getUserType();
        java.lang.String str9 = labManager7.getPassword();
        userRepository1.addUser((com.reservation_system.model.User) labManager7);
        boolean boolean11 = userRepository1.headLabCoordinatorExists();
        com.reservation_system.model.Researcher researcher17 = new com.reservation_system.model.Researcher(0, "Student", "Faculty", "Faculty", false);
        userRepository1.addUser((com.reservation_system.model.User) researcher17);
        java.lang.String str19 = researcher17.getUserType();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "labmanager" + "'", str8, "labmanager");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Student" + "'", str9, "Student");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "Researcher" + "'", str19, "Researcher");
    }

    @Test
    public void test0156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0156");
        com.reservation_system.model.HeadLabCoordinator headLabCoordinator5 = new com.reservation_system.model.HeadLabCoordinator(10, "Manager1", "Coordinator", "coord@yorku.ca", true);
        java.lang.String str6 = headLabCoordinator5.getUserType();
        java.lang.String str7 = headLabCoordinator5.getUserType();
        java.lang.String str8 = headLabCoordinator5.getPassword();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "headlabcoordinator" + "'", str6, "headlabcoordinator");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "headlabcoordinator" + "'", str7, "headlabcoordinator");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "coord@yorku.ca" + "'", str8, "coord@yorku.ca");
    }

    @Test
    public void test0157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0157");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("data/test-users.csv");
        java.util.Optional<com.reservation_system.model.User> userOptional3 = userRepository1.findByEmail("Faculty");
        java.util.Optional<com.reservation_system.model.User> userOptional5 = userRepository1.findByEmail("headlabcoordinator");
        boolean boolean7 = userRepository1.emailExists("Manager1");
        java.util.List<com.reservation_system.model.User> userList8 = userRepository1.getAllUsers();
        boolean boolean10 = userRepository1.emailExists("");
        com.reservation_system.model.LabManager labManager16 = new com.reservation_system.model.LabManager((int) (short) 0, "", "Faculty", "Student", true);
        java.lang.String str17 = labManager16.getEmail();
        java.lang.String str18 = labManager16.getUserType();
        userRepository1.addUser((com.reservation_system.model.User) labManager16);
        boolean boolean20 = userRepository1.headLabCoordinatorExists();
        com.reservation_system.model.Student student26 = new com.reservation_system.model.Student((int) (short) 0, "coord@yorku.ca", "headlabcoordinator", "Strong1!", true);
        java.lang.String str27 = student26.getPassword();
        userRepository1.addUser((com.reservation_system.model.User) student26);
        boolean boolean29 = userRepository1.headLabCoordinatorExists();
        com.reservation_system.repository.UserRepository userRepository31 = new com.reservation_system.repository.UserRepository("data/test-users.csv");
        boolean boolean32 = userRepository31.headLabCoordinatorExists();
        boolean boolean33 = userRepository31.headLabCoordinatorExists();
        boolean boolean35 = userRepository31.emailExists("Manager1");
        java.util.Optional<com.reservation_system.model.User> userOptional37 = userRepository31.findByEmail("Strong1!");
        java.util.List<com.reservation_system.model.User> userList38 = userRepository31.getAllUsers();
        userRepository1.saveAllUsers(userList38);
        com.reservation_system.model.LabManager labManager45 = new com.reservation_system.model.LabManager((int) (short) 0, "", "Faculty", "Student", true);
        java.lang.String str46 = labManager45.getUserType();
        java.lang.String str47 = labManager45.getPassword();
        userRepository1.addUser((com.reservation_system.model.User) labManager45);
        com.reservation_system.services.CoordinatorAccountService coordinatorAccountService49 = new com.reservation_system.services.CoordinatorAccountService(userRepository1);
        com.reservation_system.model.Researcher researcher55 = new com.reservation_system.model.Researcher((int) 'a', "headlabcoordinator", "", "coord2@yorku.ca", false);
        java.lang.String str56 = researcher55.getUserType();
        // The following exception was thrown during execution in test generation
        try {
            com.reservation_system.model.User user60 = coordinatorAccountService49.autoGenerateLabManagerAccount((com.reservation_system.model.User) researcher55, "", "manager1@yorku.ca", "Coordinator");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Name is required.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(userOptional3);
        org.junit.Assert.assertNotNull(userOptional5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(userList8);
// flaky "26) test0157(com.reservation_system.Randoop.CoordinatorService.RegressionTest0)":         org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "Faculty" + "'", str17, "Faculty");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "labmanager" + "'", str18, "labmanager");
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "Strong1!" + "'", str27, "Strong1!");
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
        org.junit.Assert.assertNotNull(userOptional37);
        org.junit.Assert.assertNotNull(userList38);
        org.junit.Assert.assertEquals("'" + str46 + "' != '" + "labmanager" + "'", str46, "labmanager");
        org.junit.Assert.assertEquals("'" + str47 + "' != '" + "Student" + "'", str47, "Student");
        org.junit.Assert.assertEquals("'" + str56 + "' != '" + "Researcher" + "'", str56, "Researcher");
    }

    @Test
    public void test0158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0158");
        com.reservation_system.model.HeadLabCoordinator headLabCoordinator5 = new com.reservation_system.model.HeadLabCoordinator(97, "hi!", "Coordinator", "manager1@yorku.ca", true);
        java.lang.String str6 = headLabCoordinator5.getUserType();
        java.lang.String str7 = headLabCoordinator5.getEmail();
        java.lang.Class<?> wildcardClass8 = headLabCoordinator5.getClass();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "headlabcoordinator" + "'", str6, "headlabcoordinator");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Coordinator" + "'", str7, "Coordinator");
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0159");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("data/test-users.csv");
        boolean boolean3 = userRepository1.emailExists("data/test-users.csv");
        int int4 = userRepository1.getNextID();
// flaky "27) test0159(com.reservation_system.Randoop.CoordinatorService.RegressionTest0)":         org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
// flaky "6) test0159(com.reservation_system.Randoop.CoordinatorService.RegressionTest0)":         org.junit.Assert.assertTrue("'" + int4 + "' != '" + 101 + "'", int4 == 101);
    }

    @Test
    public void test0160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0160");
        com.reservation_system.repository.UserRepository userRepository0 = null;
        com.reservation_system.services.CoordinatorAccountService coordinatorAccountService1 = new com.reservation_system.services.CoordinatorAccountService(userRepository0);
        com.reservation_system.model.HeadLabCoordinator headLabCoordinator7 = new com.reservation_system.model.HeadLabCoordinator((int) (byte) 100, "labmanager", "manager1@yorku.ca", "Researcher", true);
        int int8 = headLabCoordinator7.getID();
        // The following exception was thrown during execution in test generation
        try {
            com.reservation_system.model.User user12 = coordinatorAccountService1.autoGenerateLabManagerAccount((com.reservation_system.model.User) headLabCoordinator7, "Researcher", "Coordinator2", "data/test-users.csv");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.reservation_system.repository.UserRepository.emailExists(String)\" because \"this.userRepository\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8 == 100);
    }

    @Test
    public void test0161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0161");
        com.reservation_system.model.LabManager labManager5 = new com.reservation_system.model.LabManager((int) (byte) -1, "headlabcoordinator", "Strong1!", "Manager1", true);
    }

    @Test
    public void test0162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0162");
        com.reservation_system.model.Student student5 = new com.reservation_system.model.Student((int) (short) 100, "coord@yorku.ca", "Coordinator2", "Faculty", true);
        java.lang.String str6 = student5.getUserType();
        java.lang.String str7 = student5.getPassword();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Student" + "'", str6, "Student");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Faculty" + "'", str7, "Faculty");
    }

    @Test
    public void test0163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0163");
        com.reservation_system.model.User user6 = com.reservation_system.patterns.factory.UserFactory.createUser("headlabcoordinator", 0, "Guest", "Strong1!", "Manager1", false);
        user6.setApproved(false);
        org.junit.Assert.assertNotNull(user6);
    }

    @Test
    public void test0164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0164");
        com.reservation_system.model.Guest guest5 = new com.reservation_system.model.Guest(0, "hi!", "hi!", "Student", false);
    }

    @Test
    public void test0165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0165");
        com.reservation_system.model.LabManager labManager5 = new com.reservation_system.model.LabManager(100, "coord@yorku.ca", "labmanager", "headlabcoordinator", false);
    }

    @Test
    public void test0166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0166");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("data/test-users.csv");
        boolean boolean2 = userRepository1.headLabCoordinatorExists();
        boolean boolean3 = userRepository1.headLabCoordinatorExists();
        boolean boolean5 = userRepository1.emailExists("Manager1");
        java.util.Optional<com.reservation_system.model.User> userOptional7 = userRepository1.findByEmail("Strong1!");
        java.util.List<com.reservation_system.model.User> userList8 = userRepository1.getAllUsers();
        boolean boolean9 = userRepository1.headLabCoordinatorExists();
        boolean boolean11 = userRepository1.emailExists("data/test-users.csv");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(userOptional7);
        org.junit.Assert.assertNotNull(userList8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
// flaky "28) test0166(com.reservation_system.Randoop.CoordinatorService.RegressionTest0)":         org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test0167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0167");
        com.reservation_system.model.Guest guest5 = new com.reservation_system.model.Guest((int) ' ', "", "Faculty", "headlabcoordinator", false);
    }

    @Test
    public void test0168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0168");
        com.reservation_system.model.LabManager labManager5 = new com.reservation_system.model.LabManager((int) 'a', "Manager1", "hi!", "Coordinator2", false);
        labManager5.setApproved(true);
        boolean boolean8 = labManager5.isApproved();
        java.lang.String str9 = labManager5.getUserType();
        labManager5.setApproved(false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "labmanager" + "'", str9, "labmanager");
    }

    @Test
    public void test0169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0169");
        com.reservation_system.model.Researcher researcher5 = new com.reservation_system.model.Researcher(0, "Student", "Faculty", "Faculty", false);
        java.lang.String str6 = researcher5.getEmail();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Faculty" + "'", str6, "Faculty");
    }

    @Test
    public void test0170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0170");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("data/test-users.csv");
        boolean boolean3 = userRepository1.emailExists("headlabcoordinator");
        int int4 = userRepository1.getNextID();
        int int5 = userRepository1.getNextID();
        java.util.Optional<com.reservation_system.model.User> userOptional7 = userRepository1.findByEmail("coord2@yorku.ca");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
// flaky "29) test0170(com.reservation_system.Randoop.CoordinatorService.RegressionTest0)":         org.junit.Assert.assertTrue("'" + int4 + "' != '" + 101 + "'", int4 == 101);
// flaky "7) test0170(com.reservation_system.Randoop.CoordinatorService.RegressionTest0)":         org.junit.Assert.assertTrue("'" + int5 + "' != '" + 101 + "'", int5 == 101);
        org.junit.Assert.assertNotNull(userOptional7);
    }

    @Test
    public void test0171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0171");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("data/test-users.csv");
        com.reservation_system.model.LabManager labManager7 = new com.reservation_system.model.LabManager((int) 'a', "Manager1", "hi!", "Coordinator2", false);
        java.lang.String str8 = labManager7.getUserType();
        java.lang.String str9 = labManager7.getUserType();
        java.lang.String str10 = labManager7.getUserType();
        userRepository1.addUser((com.reservation_system.model.User) labManager7);
        int int12 = labManager7.getID();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "labmanager" + "'", str8, "labmanager");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "labmanager" + "'", str9, "labmanager");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "labmanager" + "'", str10, "labmanager");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 97 + "'", int12 == 97);
    }

    @Test
    public void test0172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0172");
        com.reservation_system.model.HeadLabCoordinator headLabCoordinator5 = new com.reservation_system.model.HeadLabCoordinator((int) ' ', "", "Student", "Researcher", false);
        headLabCoordinator5.setApproved(true);
        java.lang.String str8 = headLabCoordinator5.getUserType();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "headlabcoordinator" + "'", str8, "headlabcoordinator");
    }

    @Test
    public void test0173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0173");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("data/test-users.csv");
        com.reservation_system.model.Faculty faculty7 = new com.reservation_system.model.Faculty((int) (byte) 1, "", "Guest", "Student", true);
        userRepository1.addUser((com.reservation_system.model.User) faculty7);
        java.util.List<com.reservation_system.model.User> userList9 = userRepository1.getAllUsers();
        int int10 = userRepository1.getNextID();
        int int11 = userRepository1.getNextID();
        com.reservation_system.services.CoordinatorAccountService coordinatorAccountService12 = new com.reservation_system.services.CoordinatorAccountService(userRepository1);
        // The following exception was thrown during execution in test generation
        try {
            com.reservation_system.model.User user16 = coordinatorAccountService12.createHeadLabCoordinator("Guest", "Researcher", "coord2@yorku.ca");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Only one head lab coordinator account is allowed.");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(userList9);
// flaky "30) test0173(com.reservation_system.Randoop.CoordinatorService.RegressionTest0)":         org.junit.Assert.assertTrue("'" + int10 + "' != '" + 101 + "'", int10 == 101);
// flaky "8) test0173(com.reservation_system.Randoop.CoordinatorService.RegressionTest0)":         org.junit.Assert.assertTrue("'" + int11 + "' != '" + 101 + "'", int11 == 101);
    }

    @Test
    public void test0174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0174");
        com.reservation_system.model.Student student5 = new com.reservation_system.model.Student((int) (byte) 0, "Faculty", "data/test-users.csv", "", false);
        java.lang.String str6 = student5.getName();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Faculty" + "'", str6, "Faculty");
    }

    @Test
    public void test0175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0175");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("data/test-users.csv");
        boolean boolean3 = userRepository1.emailExists("headlabcoordinator");
        com.reservation_system.services.CoordinatorAccountService coordinatorAccountService4 = new com.reservation_system.services.CoordinatorAccountService(userRepository1);
        com.reservation_system.services.CoordinatorAccountService coordinatorAccountService5 = new com.reservation_system.services.CoordinatorAccountService(userRepository1);
        com.reservation_system.model.User user6 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.reservation_system.model.User user10 = coordinatorAccountService5.autoGenerateLabManagerAccount(user6, "Strong1!", "labmanager", "Coordinator");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Only the head lab coordinator can generate lab manager accounts.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
    }

    @Test
    public void test0176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0176");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("data/test-users.csv");
        boolean boolean2 = userRepository1.headLabCoordinatorExists();
        com.reservation_system.services.CoordinatorAccountService coordinatorAccountService3 = new com.reservation_system.services.CoordinatorAccountService(userRepository1);
        java.util.List<com.reservation_system.model.User> userList4 = userRepository1.getAllUsers();
        com.reservation_system.services.CoordinatorAccountService coordinatorAccountService5 = new com.reservation_system.services.CoordinatorAccountService(userRepository1);
        com.reservation_system.model.Guest guest11 = new com.reservation_system.model.Guest((int) ' ', "data/test-users.csv", "coord2@yorku.ca", "data/test-users.csv", false);
        java.lang.String str12 = guest11.getPassword();
        java.lang.String str13 = guest11.getUserType();
        int int14 = guest11.getID();
        java.lang.String str15 = guest11.getName();
        // The following exception was thrown during execution in test generation
        try {
            com.reservation_system.model.User user19 = coordinatorAccountService5.autoGenerateLabManagerAccount((com.reservation_system.model.User) guest11, "Coordinator2", "manager1@yorku.ca", "labmanager");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Only the head lab coordinator can generate lab manager accounts.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(userList4);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "data/test-users.csv" + "'", str12, "data/test-users.csv");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Guest" + "'", str13, "Guest");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 32 + "'", int14 == 32);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "data/test-users.csv" + "'", str15, "data/test-users.csv");
    }

    @Test
    public void test0177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0177");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("data/test-users.csv");
        boolean boolean3 = userRepository1.emailExists("headlabcoordinator");
        com.reservation_system.services.CoordinatorAccountService coordinatorAccountService4 = new com.reservation_system.services.CoordinatorAccountService(userRepository1);
        com.reservation_system.services.CoordinatorAccountService coordinatorAccountService5 = new com.reservation_system.services.CoordinatorAccountService(userRepository1);
        com.reservation_system.services.CoordinatorAccountService coordinatorAccountService6 = new com.reservation_system.services.CoordinatorAccountService(userRepository1);
        com.reservation_system.model.Student student12 = new com.reservation_system.model.Student((int) (short) 100, "Guest", "Coordinator2", "Coordinator", true);
        java.lang.String str13 = student12.getUserType();
        // The following exception was thrown during execution in test generation
        try {
            com.reservation_system.model.User user17 = coordinatorAccountService6.autoGenerateLabManagerAccount((com.reservation_system.model.User) student12, "Manager1", "hi!", "Coordinator");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Only the head lab coordinator can generate lab manager accounts.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Student" + "'", str13, "Student");
    }

    @Test
    public void test0178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0178");
        com.reservation_system.model.Faculty faculty5 = new com.reservation_system.model.Faculty((int) (short) 0, "coord@yorku.ca", "Researcher", "hi!", true);
        java.lang.String str6 = faculty5.getName();
        java.lang.String str7 = faculty5.getEmail();
        java.lang.String str8 = faculty5.getUserType();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "coord@yorku.ca" + "'", str6, "coord@yorku.ca");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Researcher" + "'", str7, "Researcher");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Faculty" + "'", str8, "Faculty");
    }

    @Test
    public void test0179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0179");
        // The following exception was thrown during execution in test generation
        try {
            com.reservation_system.model.User user6 = com.reservation_system.patterns.factory.UserFactory.createUser("Coordinator2", (int) (short) 0, "manager1@yorku.ca", "Strong1!", "Researcher", false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid user type: Coordinator2");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0180");
        com.reservation_system.model.Faculty faculty5 = new com.reservation_system.model.Faculty((int) (byte) 1, "", "Guest", "Student", true);
        java.lang.String str6 = faculty5.getUserType();
        java.lang.String str7 = faculty5.getName();
        java.lang.String str8 = faculty5.getUserType();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Faculty" + "'", str6, "Faculty");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Faculty" + "'", str8, "Faculty");
    }

    @Test
    public void test0181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0181");
        com.reservation_system.model.HeadLabCoordinator headLabCoordinator5 = new com.reservation_system.model.HeadLabCoordinator(100, "Guest", "Researcher", "Coordinator", false);
    }

    @Test
    public void test0182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0182");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("data/test-users.csv");
        boolean boolean2 = userRepository1.headLabCoordinatorExists();
        boolean boolean3 = userRepository1.headLabCoordinatorExists();
        java.util.Optional<com.reservation_system.model.User> userOptional5 = userRepository1.findByEmail("");
        com.reservation_system.services.CoordinatorAccountService coordinatorAccountService6 = new com.reservation_system.services.CoordinatorAccountService(userRepository1);
        com.reservation_system.model.Guest guest12 = new com.reservation_system.model.Guest((int) (short) 100, "Manager1", "", "Student", false);
        userRepository1.addUser((com.reservation_system.model.User) guest12);
        com.reservation_system.repository.UserRepository userRepository15 = new com.reservation_system.repository.UserRepository("data/test-users.csv");
        boolean boolean16 = userRepository15.headLabCoordinatorExists();
        boolean boolean17 = userRepository15.headLabCoordinatorExists();
        boolean boolean19 = userRepository15.emailExists("Manager1");
        java.util.Optional<com.reservation_system.model.User> userOptional21 = userRepository15.findByEmail("Strong1!");
        java.util.List<com.reservation_system.model.User> userList22 = userRepository15.getAllUsers();
        userRepository1.saveAllUsers(userList22);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(userOptional5);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNotNull(userOptional21);
        org.junit.Assert.assertNotNull(userList22);
    }

    @Test
    public void test0183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0183");
        com.reservation_system.model.Student student5 = new com.reservation_system.model.Student((int) '#', "Coordinator", "Coordinator", "", false);
        boolean boolean6 = student5.requiresDepartmentApproval();
        boolean boolean7 = student5.requiresDepartmentApproval();
        java.lang.String str8 = student5.getUserType();
        student5.setApproved(false);
        java.lang.String str11 = student5.getUserType();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Student" + "'", str8, "Student");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Student" + "'", str11, "Student");
    }

    @Test
    public void test0184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0184");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("data/test-users.csv");
        com.reservation_system.model.LabManager labManager7 = new com.reservation_system.model.LabManager((int) 'a', "Manager1", "hi!", "Coordinator2", false);
        java.lang.String str8 = labManager7.getUserType();
        java.lang.String str9 = labManager7.getUserType();
        java.lang.String str10 = labManager7.getUserType();
        userRepository1.addUser((com.reservation_system.model.User) labManager7);
        java.lang.Class<?> wildcardClass12 = labManager7.getClass();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "labmanager" + "'", str8, "labmanager");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "labmanager" + "'", str9, "labmanager");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "labmanager" + "'", str10, "labmanager");
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0185");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("data/test-users.csv");
        boolean boolean3 = userRepository1.emailExists("headlabcoordinator");
        com.reservation_system.services.CoordinatorAccountService coordinatorAccountService4 = new com.reservation_system.services.CoordinatorAccountService(userRepository1);
        com.reservation_system.services.CoordinatorAccountService coordinatorAccountService5 = new com.reservation_system.services.CoordinatorAccountService(userRepository1);
        com.reservation_system.model.LabManager labManager11 = new com.reservation_system.model.LabManager((int) ' ', "manager1@yorku.ca", "Student", "coord2@yorku.ca", false);
        boolean boolean12 = labManager11.isApproved();
        // The following exception was thrown during execution in test generation
        try {
            com.reservation_system.model.User user16 = coordinatorAccountService5.autoGenerateLabManagerAccount((com.reservation_system.model.User) labManager11, "Faculty", "Strong1!", "coord2@yorku.ca");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Only the head lab coordinator can generate lab manager accounts.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test0186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0186");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("data/test-users.csv");
        java.util.Optional<com.reservation_system.model.User> userOptional3 = userRepository1.findByEmail("Faculty");
        int int4 = userRepository1.getNextID();
        org.junit.Assert.assertNotNull(userOptional3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 101 + "'", int4 == 101);
    }

    @Test
    public void test0187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0187");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("data/test-users.csv");
        com.reservation_system.model.LabManager labManager7 = new com.reservation_system.model.LabManager((int) (short) 0, "", "Faculty", "Student", true);
        java.lang.String str8 = labManager7.getUserType();
        java.lang.String str9 = labManager7.getPassword();
        userRepository1.addUser((com.reservation_system.model.User) labManager7);
        com.reservation_system.services.CoordinatorAccountService coordinatorAccountService11 = new com.reservation_system.services.CoordinatorAccountService(userRepository1);
        // The following exception was thrown during execution in test generation
        try {
            com.reservation_system.model.User user15 = coordinatorAccountService11.createHeadLabCoordinator("", "Faculty", "labmanager");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Name is required.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "labmanager" + "'", str8, "labmanager");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Student" + "'", str9, "Student");
    }

    @Test
    public void test0188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0188");
        com.reservation_system.model.HeadLabCoordinator headLabCoordinator5 = new com.reservation_system.model.HeadLabCoordinator(97, "Guest", "", "Student", false);
    }

    @Test
    public void test0189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0189");
        com.reservation_system.model.Faculty faculty5 = new com.reservation_system.model.Faculty((int) (short) 0, "Coordinator2", "Researcher", "coord@yorku.ca", false);
        int int6 = faculty5.getID();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test0190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0190");
        com.reservation_system.model.HeadLabCoordinator headLabCoordinator5 = new com.reservation_system.model.HeadLabCoordinator((int) (short) 10, "data/test-users.csv", "", "labmanager", false);
        java.lang.String str6 = headLabCoordinator5.getName();
        java.lang.String str7 = headLabCoordinator5.getUserType();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "data/test-users.csv" + "'", str6, "data/test-users.csv");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "headlabcoordinator" + "'", str7, "headlabcoordinator");
    }

    @Test
    public void test0191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0191");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("data/test-users.csv");
        com.reservation_system.model.Faculty faculty7 = new com.reservation_system.model.Faculty((int) (byte) 1, "", "Guest", "Student", true);
        userRepository1.addUser((com.reservation_system.model.User) faculty7);
        java.util.Optional<com.reservation_system.model.User> userOptional10 = userRepository1.findByEmail("Student");
        org.junit.Assert.assertNotNull(userOptional10);
    }

    @Test
    public void test0192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0192");
        com.reservation_system.model.Faculty faculty5 = new com.reservation_system.model.Faculty((int) '4', "Student", "Faculty", "headlabcoordinator", true);
        boolean boolean6 = faculty5.isApproved();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test0193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0193");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("data/test-users.csv");
        boolean boolean2 = userRepository1.headLabCoordinatorExists();
        boolean boolean3 = userRepository1.headLabCoordinatorExists();
        com.reservation_system.repository.UserRepository userRepository5 = new com.reservation_system.repository.UserRepository("data/test-users.csv");
        boolean boolean6 = userRepository5.headLabCoordinatorExists();
        boolean boolean7 = userRepository5.headLabCoordinatorExists();
        boolean boolean9 = userRepository5.emailExists("Manager1");
        java.util.Optional<com.reservation_system.model.User> userOptional11 = userRepository5.findByEmail("Strong1!");
        java.util.List<com.reservation_system.model.User> userList12 = userRepository5.getAllUsers();
        userRepository1.saveAllUsers(userList12);
        java.lang.Class<?> wildcardClass14 = userList12.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(userOptional11);
        org.junit.Assert.assertNotNull(userList12);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test0194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0194");
        com.reservation_system.model.HeadLabCoordinator headLabCoordinator5 = new com.reservation_system.model.HeadLabCoordinator((int) (byte) 100, "labmanager", "manager1@yorku.ca", "Researcher", true);
        int int6 = headLabCoordinator5.getID();
        java.lang.String str7 = headLabCoordinator5.getUserType();
        java.lang.String str8 = headLabCoordinator5.getUserType();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "headlabcoordinator" + "'", str7, "headlabcoordinator");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "headlabcoordinator" + "'", str8, "headlabcoordinator");
    }

    @Test
    public void test0195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0195");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("data/test-users.csv");
        boolean boolean2 = userRepository1.headLabCoordinatorExists();
        com.reservation_system.services.CoordinatorAccountService coordinatorAccountService3 = new com.reservation_system.services.CoordinatorAccountService(userRepository1);
        java.util.List<com.reservation_system.model.User> userList4 = userRepository1.getAllUsers();
        com.reservation_system.services.CoordinatorAccountService coordinatorAccountService5 = new com.reservation_system.services.CoordinatorAccountService(userRepository1);
        com.reservation_system.model.HeadLabCoordinator headLabCoordinator11 = new com.reservation_system.model.HeadLabCoordinator(1, "hi!", "manager1@yorku.ca", "Manager1", true);
        java.lang.String str12 = headLabCoordinator11.getPassword();
        java.lang.String str13 = headLabCoordinator11.getUserType();
        // The following exception was thrown during execution in test generation
        try {
            com.reservation_system.model.User user17 = coordinatorAccountService5.autoGenerateLabManagerAccount((com.reservation_system.model.User) headLabCoordinator11, "coord@yorku.ca", "Manager1", "data/test-users.csv");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Email is already registered.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(userList4);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Manager1" + "'", str12, "Manager1");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "headlabcoordinator" + "'", str13, "headlabcoordinator");
    }

    @Test
    public void test0196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0196");
        com.reservation_system.model.Researcher researcher5 = new com.reservation_system.model.Researcher((int) (short) -1, "coord@yorku.ca", "data/test-users.csv", "coord2@yorku.ca", false);
        java.lang.String str6 = researcher5.getUserType();
        java.lang.String str7 = researcher5.getUserType();
        int int8 = researcher5.getID();
        boolean boolean9 = researcher5.isApproved();
        boolean boolean10 = researcher5.requiresDepartmentApproval();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Researcher" + "'", str6, "Researcher");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Researcher" + "'", str7, "Researcher");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test0197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0197");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("data/test-users.csv");
        boolean boolean3 = userRepository1.emailExists("headlabcoordinator");
        com.reservation_system.services.CoordinatorAccountService coordinatorAccountService4 = new com.reservation_system.services.CoordinatorAccountService(userRepository1);
        com.reservation_system.services.CoordinatorAccountService coordinatorAccountService5 = new com.reservation_system.services.CoordinatorAccountService(userRepository1);
        // The following exception was thrown during execution in test generation
        try {
            com.reservation_system.model.User user9 = coordinatorAccountService5.createHeadLabCoordinator("Coordinator2", "labmanager", "Manager1");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Only one head lab coordinator account is allowed.");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
    }

    @Test
    public void test0198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0198");
        com.reservation_system.model.LabManager labManager5 = new com.reservation_system.model.LabManager(0, "headlabcoordinator", "coord@yorku.ca", "coord@yorku.ca", true);
        java.lang.String str6 = labManager5.getName();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "headlabcoordinator" + "'", str6, "headlabcoordinator");
    }

    @Test
    public void test0199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0199");
        com.reservation_system.model.LabManager labManager5 = new com.reservation_system.model.LabManager((int) (short) 100, "headlabcoordinator", "Coordinator", "Researcher", false);
        java.lang.String str6 = labManager5.getUserType();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "labmanager" + "'", str6, "labmanager");
    }

    @Test
    public void test0200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0200");
        com.reservation_system.model.Guest guest5 = new com.reservation_system.model.Guest(0, "headlabcoordinator", "Faculty", "labmanager", false);
        java.lang.String str6 = guest5.getUserType();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Guest" + "'", str6, "Guest");
    }

    @Test
    public void test0201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0201");
        com.reservation_system.model.Researcher researcher5 = new com.reservation_system.model.Researcher(35, "Coordinator", "headlabcoordinator", "Researcher", true);
    }

    @Test
    public void test0202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0202");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("data/test-users.csv");
        boolean boolean2 = userRepository1.headLabCoordinatorExists();
        com.reservation_system.services.CoordinatorAccountService coordinatorAccountService3 = new com.reservation_system.services.CoordinatorAccountService(userRepository1);
        java.util.List<com.reservation_system.model.User> userList4 = userRepository1.getAllUsers();
        com.reservation_system.services.CoordinatorAccountService coordinatorAccountService5 = new com.reservation_system.services.CoordinatorAccountService(userRepository1);
        com.reservation_system.services.CoordinatorAccountService coordinatorAccountService6 = new com.reservation_system.services.CoordinatorAccountService(userRepository1);
        // The following exception was thrown during execution in test generation
        try {
            com.reservation_system.model.User user10 = coordinatorAccountService6.createHeadLabCoordinator("Coordinator2", "Faculty", "Coordinator");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Only one head lab coordinator account is allowed.");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(userList4);
    }

    @Test
    public void test0203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0203");
        // The following exception was thrown during execution in test generation
        try {
            com.reservation_system.model.User user6 = com.reservation_system.patterns.factory.UserFactory.createUser("Strong1!", (int) (short) 1, "coord2@yorku.ca", "Coordinator", "Manager1", false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid user type: Strong1!");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0204");
        com.reservation_system.model.Faculty faculty5 = new com.reservation_system.model.Faculty(0, "Guest", "", "coord2@yorku.ca", true);
    }

    @Test
    public void test0205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0205");
        com.reservation_system.repository.UserRepository userRepository0 = null;
        com.reservation_system.services.CoordinatorAccountService coordinatorAccountService1 = new com.reservation_system.services.CoordinatorAccountService(userRepository0);
        com.reservation_system.model.LabManager labManager7 = new com.reservation_system.model.LabManager((int) (short) 0, "", "Faculty", "Student", true);
        boolean boolean8 = labManager7.isApproved();
        java.lang.String str9 = labManager7.getUserType();
        // The following exception was thrown during execution in test generation
        try {
            com.reservation_system.model.User user13 = coordinatorAccountService1.autoGenerateLabManagerAccount((com.reservation_system.model.User) labManager7, "Manager1", "", "");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Email is required.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "labmanager" + "'", str9, "labmanager");
    }

    @Test
    public void test0206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0206");
        // The following exception was thrown during execution in test generation
        try {
            com.reservation_system.model.User user6 = com.reservation_system.patterns.factory.UserFactory.createUser("Strong1!", 100, "labmanager", "Coordinator", "Faculty", true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid user type: Strong1!");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0207");
        com.reservation_system.model.HeadLabCoordinator headLabCoordinator5 = new com.reservation_system.model.HeadLabCoordinator((int) '4', "Student", "Manager1", "", true);
    }

    @Test
    public void test0208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0208");
        com.reservation_system.model.Faculty faculty5 = new com.reservation_system.model.Faculty(0, "Manager1", "Strong1!", "", true);
        java.lang.String str6 = faculty5.getUserType();
        java.lang.String str7 = faculty5.getUserType();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Faculty" + "'", str6, "Faculty");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Faculty" + "'", str7, "Faculty");
    }

    @Test
    public void test0209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0209");
        com.reservation_system.model.Student student5 = new com.reservation_system.model.Student((int) (byte) -1, "Guest", "Manager1", "manager1@yorku.ca", true);
    }

    @Test
    public void test0210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0210");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("data/test-users.csv");
        boolean boolean3 = userRepository1.emailExists("headlabcoordinator");
        com.reservation_system.services.CoordinatorAccountService coordinatorAccountService4 = new com.reservation_system.services.CoordinatorAccountService(userRepository1);
        com.reservation_system.services.CoordinatorAccountService coordinatorAccountService5 = new com.reservation_system.services.CoordinatorAccountService(userRepository1);
        com.reservation_system.repository.UserRepository userRepository7 = new com.reservation_system.repository.UserRepository("data/test-users.csv");
        java.util.Optional<com.reservation_system.model.User> userOptional9 = userRepository7.findByEmail("Faculty");
        java.util.Optional<com.reservation_system.model.User> userOptional11 = userRepository7.findByEmail("headlabcoordinator");
        com.reservation_system.model.Researcher researcher17 = new com.reservation_system.model.Researcher((int) '#', "Student", "coord2@yorku.ca", "labmanager", false);
        researcher17.setApproved(true);
        userRepository7.addUser((com.reservation_system.model.User) researcher17);
        // The following exception was thrown during execution in test generation
        try {
            com.reservation_system.model.User user24 = coordinatorAccountService5.autoGenerateLabManagerAccount((com.reservation_system.model.User) researcher17, "Coordinator2", "coord2@yorku.ca", "Guest");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Only the head lab coordinator can generate lab manager accounts.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(userOptional9);
        org.junit.Assert.assertNotNull(userOptional11);
    }

    @Test
    public void test0211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0211");
        com.reservation_system.model.HeadLabCoordinator headLabCoordinator5 = new com.reservation_system.model.HeadLabCoordinator((int) (byte) 10, "", "data/test-users.csv", "Guest", true);
    }

    @Test
    public void test0212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0212");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("data/test-users.csv");
        boolean boolean2 = userRepository1.headLabCoordinatorExists();
        java.util.List<com.reservation_system.model.User> userList3 = userRepository1.getAllUsers();
        int int4 = userRepository1.getNextID();
        com.reservation_system.repository.UserRepository userRepository6 = new com.reservation_system.repository.UserRepository("data/test-users.csv");
        com.reservation_system.model.LabManager labManager12 = new com.reservation_system.model.LabManager((int) (short) 0, "", "Faculty", "Student", true);
        java.lang.String str13 = labManager12.getUserType();
        java.lang.String str14 = labManager12.getPassword();
        userRepository6.addUser((com.reservation_system.model.User) labManager12);
        boolean boolean16 = userRepository6.headLabCoordinatorExists();
        com.reservation_system.model.Researcher researcher22 = new com.reservation_system.model.Researcher(0, "Student", "Faculty", "Faculty", false);
        userRepository6.addUser((com.reservation_system.model.User) researcher22);
        java.util.Optional<com.reservation_system.model.User> userOptional25 = userRepository6.findByEmail("data/test-users.csv");
        com.reservation_system.services.CoordinatorAccountService coordinatorAccountService26 = new com.reservation_system.services.CoordinatorAccountService(userRepository6);
        com.reservation_system.repository.UserRepository userRepository28 = new com.reservation_system.repository.UserRepository("data/test-users.csv");
        com.reservation_system.model.LabManager labManager34 = new com.reservation_system.model.LabManager((int) (short) 0, "", "Faculty", "Student", true);
        java.lang.String str35 = labManager34.getUserType();
        java.lang.String str36 = labManager34.getPassword();
        userRepository28.addUser((com.reservation_system.model.User) labManager34);
        boolean boolean38 = userRepository28.headLabCoordinatorExists();
        com.reservation_system.model.Researcher researcher44 = new com.reservation_system.model.Researcher(0, "Student", "Faculty", "Faculty", false);
        userRepository28.addUser((com.reservation_system.model.User) researcher44);
        java.util.Optional<com.reservation_system.model.User> userOptional47 = userRepository28.findByEmail("data/test-users.csv");
        int int48 = userRepository28.getNextID();
        java.util.List<com.reservation_system.model.User> userList49 = userRepository28.getAllUsers();
        userRepository6.saveAllUsers(userList49);
        userRepository1.saveAllUsers(userList49);
        int int52 = userRepository1.getNextID();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(userList3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 101 + "'", int4 == 101);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "labmanager" + "'", str13, "labmanager");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Student" + "'", str14, "Student");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNotNull(userOptional25);
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "labmanager" + "'", str35, "labmanager");
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "Student" + "'", str36, "Student");
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + true + "'", boolean38 == true);
        org.junit.Assert.assertNotNull(userOptional47);
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 101 + "'", int48 == 101);
        org.junit.Assert.assertNotNull(userList49);
        org.junit.Assert.assertTrue("'" + int52 + "' != '" + 101 + "'", int52 == 101);
    }

    @Test
    public void test0213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0213");
        // The following exception was thrown during execution in test generation
        try {
            com.reservation_system.model.User user6 = com.reservation_system.patterns.factory.UserFactory.createUser("Coordinator", (int) (byte) 10, "Faculty", "Coordinator", "Coordinator", false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid user type: Coordinator");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0214");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("data/test-users.csv");
        java.util.Optional<com.reservation_system.model.User> userOptional3 = userRepository1.findByEmail("Faculty");
        com.reservation_system.services.CoordinatorAccountService coordinatorAccountService4 = new com.reservation_system.services.CoordinatorAccountService(userRepository1);
        // The following exception was thrown during execution in test generation
        try {
            com.reservation_system.model.User user8 = coordinatorAccountService4.createHeadLabCoordinator("headlabcoordinator", "Researcher", "Guest");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Only one head lab coordinator account is allowed.");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(userOptional3);
    }

    @Test
    public void test0215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0215");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("data/test-users.csv");
        com.reservation_system.model.Faculty faculty7 = new com.reservation_system.model.Faculty((int) (byte) 1, "", "Guest", "Student", true);
        userRepository1.addUser((com.reservation_system.model.User) faculty7);
        java.util.List<com.reservation_system.model.User> userList9 = userRepository1.getAllUsers();
        int int10 = userRepository1.getNextID();
        int int11 = userRepository1.getNextID();
        com.reservation_system.services.CoordinatorAccountService coordinatorAccountService12 = new com.reservation_system.services.CoordinatorAccountService(userRepository1);
        com.reservation_system.services.CoordinatorAccountService coordinatorAccountService13 = new com.reservation_system.services.CoordinatorAccountService(userRepository1);
        com.reservation_system.model.User user14 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.reservation_system.model.User user18 = coordinatorAccountService13.autoGenerateLabManagerAccount(user14, "headlabcoordinator", "Coordinator", "data/test-users.csv");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Only the head lab coordinator can generate lab manager accounts.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(userList9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 101 + "'", int10 == 101);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 101 + "'", int11 == 101);
    }

    @Test
    public void test0216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0216");
        com.reservation_system.model.Faculty faculty5 = new com.reservation_system.model.Faculty((int) (short) 0, "Researcher", "Manager1", "Guest", false);
        boolean boolean6 = faculty5.isApproved();
        int int7 = faculty5.getID();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test0217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0217");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("data/test-users.csv");
        com.reservation_system.model.Faculty faculty7 = new com.reservation_system.model.Faculty((int) (byte) 1, "", "Guest", "Student", true);
        userRepository1.addUser((com.reservation_system.model.User) faculty7);
        java.util.List<com.reservation_system.model.User> userList9 = userRepository1.getAllUsers();
        com.reservation_system.services.CoordinatorAccountService coordinatorAccountService10 = new com.reservation_system.services.CoordinatorAccountService(userRepository1);
        com.reservation_system.model.Researcher researcher16 = new com.reservation_system.model.Researcher(35, "Guest", "", "", false);
        // The following exception was thrown during execution in test generation
        try {
            com.reservation_system.model.User user20 = coordinatorAccountService10.autoGenerateLabManagerAccount((com.reservation_system.model.User) researcher16, "Faculty", "", "");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Email is required.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(userList9);
    }

    @Test
    public void test0218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0218");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("data/test-users.csv");
        com.reservation_system.model.LabManager labManager7 = new com.reservation_system.model.LabManager((int) 'a', "Manager1", "hi!", "Coordinator2", false);
        java.lang.String str8 = labManager7.getUserType();
        java.lang.String str9 = labManager7.getUserType();
        java.lang.String str10 = labManager7.getUserType();
        userRepository1.addUser((com.reservation_system.model.User) labManager7);
        int int12 = userRepository1.getNextID();
        com.reservation_system.services.CoordinatorAccountService coordinatorAccountService13 = new com.reservation_system.services.CoordinatorAccountService(userRepository1);
        // The following exception was thrown during execution in test generation
        try {
            com.reservation_system.model.User user17 = coordinatorAccountService13.createHeadLabCoordinator("Coordinator2", "coord@yorku.ca", "Coordinator2");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Only one head lab coordinator account is allowed.");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "labmanager" + "'", str8, "labmanager");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "labmanager" + "'", str9, "labmanager");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "labmanager" + "'", str10, "labmanager");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 101 + "'", int12 == 101);
    }

    @Test
    public void test0219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0219");
        com.reservation_system.model.Student student5 = new com.reservation_system.model.Student((int) (short) -1, "coord2@yorku.ca", "Student", "Coordinator", true);
        java.lang.String str6 = student5.getUserType();
        java.lang.String str7 = student5.getUserType();
        java.lang.String str8 = student5.getUserType();
        java.lang.Class<?> wildcardClass9 = student5.getClass();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Student" + "'", str6, "Student");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Student" + "'", str7, "Student");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Student" + "'", str8, "Student");
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0220");
        com.reservation_system.model.Guest guest5 = new com.reservation_system.model.Guest((int) (byte) 1, "Coordinator", "Coordinator2", "Manager1", true);
        java.lang.String str6 = guest5.getName();
        java.lang.String str7 = guest5.getUserType();
        java.lang.String str8 = guest5.getName();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Coordinator" + "'", str6, "Coordinator");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Guest" + "'", str7, "Guest");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Coordinator" + "'", str8, "Coordinator");
    }

    @Test
    public void test0221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0221");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("data/test-users.csv");
        java.util.Optional<com.reservation_system.model.User> userOptional3 = userRepository1.findByEmail("Faculty");
        com.reservation_system.model.Student student9 = new com.reservation_system.model.Student((int) '#', "Coordinator", "Coordinator", "", false);
        boolean boolean10 = student9.isApproved();
        java.lang.String str11 = student9.getName();
        userRepository1.addUser((com.reservation_system.model.User) student9);
        int int13 = userRepository1.getNextID();
        int int14 = userRepository1.getNextID();
        java.util.List<com.reservation_system.model.User> userList15 = null;
        // The following exception was thrown during execution in test generation
        try {
            userRepository1.saveAllUsers(userList15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.List.iterator()\" because \"users\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(userOptional3);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Coordinator" + "'", str11, "Coordinator");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 101 + "'", int13 == 101);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 101 + "'", int14 == 101);
    }

    @Test
    public void test0222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0222");
        com.reservation_system.model.Guest guest5 = new com.reservation_system.model.Guest((int) (short) 10, "Coordinator", "", "labmanager", true);
        guest5.setApproved(false);
    }

    @Test
    public void test0223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0223");
        com.reservation_system.model.LabManager labManager5 = new com.reservation_system.model.LabManager(98, "", "coord@yorku.ca", "Coordinator", false);
        java.lang.String str6 = labManager5.getEmail();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "coord@yorku.ca" + "'", str6, "coord@yorku.ca");
    }

    @Test
    public void test0224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0224");
        // The following exception was thrown during execution in test generation
        try {
            com.reservation_system.model.User user6 = com.reservation_system.patterns.factory.UserFactory.createUser("data/test-users.csv", (int) (byte) 1, "labmanager", "Student", "Coordinator", false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid user type: data/test-users.csv");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0225");
        com.reservation_system.model.Researcher researcher5 = new com.reservation_system.model.Researcher((int) '4', "coord2@yorku.ca", "Student", "Faculty", false);
        int int6 = researcher5.getID();
        java.lang.String str7 = researcher5.getUserType();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 52 + "'", int6 == 52);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Researcher" + "'", str7, "Researcher");
    }

    @Test
    public void test0226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0226");
        com.reservation_system.model.Guest guest5 = new com.reservation_system.model.Guest((int) '4', "Coordinator2", "Coordinator", "Guest", true);
    }

    @Test
    public void test0227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0227");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("data/test-users.csv");
        java.util.Optional<com.reservation_system.model.User> userOptional3 = userRepository1.findByEmail("Faculty");
        java.util.Optional<com.reservation_system.model.User> userOptional5 = userRepository1.findByEmail("headlabcoordinator");
        boolean boolean7 = userRepository1.emailExists("Manager1");
        java.util.List<com.reservation_system.model.User> userList8 = userRepository1.getAllUsers();
        boolean boolean10 = userRepository1.emailExists("");
        com.reservation_system.model.LabManager labManager16 = new com.reservation_system.model.LabManager((int) (short) 0, "", "Faculty", "Student", true);
        java.lang.String str17 = labManager16.getEmail();
        java.lang.String str18 = labManager16.getUserType();
        userRepository1.addUser((com.reservation_system.model.User) labManager16);
        boolean boolean20 = userRepository1.headLabCoordinatorExists();
        com.reservation_system.model.Student student26 = new com.reservation_system.model.Student((int) (short) 0, "coord@yorku.ca", "headlabcoordinator", "Strong1!", true);
        java.lang.String str27 = student26.getPassword();
        userRepository1.addUser((com.reservation_system.model.User) student26);
        boolean boolean29 = userRepository1.headLabCoordinatorExists();
        com.reservation_system.repository.UserRepository userRepository31 = new com.reservation_system.repository.UserRepository("data/test-users.csv");
        boolean boolean32 = userRepository31.headLabCoordinatorExists();
        boolean boolean33 = userRepository31.headLabCoordinatorExists();
        boolean boolean35 = userRepository31.emailExists("Manager1");
        java.util.Optional<com.reservation_system.model.User> userOptional37 = userRepository31.findByEmail("Strong1!");
        java.util.List<com.reservation_system.model.User> userList38 = userRepository31.getAllUsers();
        userRepository1.saveAllUsers(userList38);
        com.reservation_system.model.LabManager labManager45 = new com.reservation_system.model.LabManager((int) (short) 0, "", "Faculty", "Student", true);
        java.lang.String str46 = labManager45.getUserType();
        java.lang.String str47 = labManager45.getPassword();
        userRepository1.addUser((com.reservation_system.model.User) labManager45);
        com.reservation_system.services.CoordinatorAccountService coordinatorAccountService49 = new com.reservation_system.services.CoordinatorAccountService(userRepository1);
        com.reservation_system.model.LabManager labManager55 = new com.reservation_system.model.LabManager((int) 'a', "Manager1", "hi!", "Coordinator2", false);
        java.lang.String str56 = labManager55.getEmail();
        java.lang.String str57 = labManager55.getUserType();
        java.lang.String str58 = labManager55.getName();
        // The following exception was thrown during execution in test generation
        try {
            com.reservation_system.model.User user62 = coordinatorAccountService49.autoGenerateLabManagerAccount((com.reservation_system.model.User) labManager55, "coord2@yorku.ca", "coord2@yorku.ca", "Researcher");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Only the head lab coordinator can generate lab manager accounts.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(userOptional3);
        org.junit.Assert.assertNotNull(userOptional5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(userList8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "Faculty" + "'", str17, "Faculty");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "labmanager" + "'", str18, "labmanager");
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "Strong1!" + "'", str27, "Strong1!");
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertNotNull(userOptional37);
        org.junit.Assert.assertNotNull(userList38);
        org.junit.Assert.assertEquals("'" + str46 + "' != '" + "labmanager" + "'", str46, "labmanager");
        org.junit.Assert.assertEquals("'" + str47 + "' != '" + "Student" + "'", str47, "Student");
        org.junit.Assert.assertEquals("'" + str56 + "' != '" + "hi!" + "'", str56, "hi!");
        org.junit.Assert.assertEquals("'" + str57 + "' != '" + "labmanager" + "'", str57, "labmanager");
        org.junit.Assert.assertEquals("'" + str58 + "' != '" + "Manager1" + "'", str58, "Manager1");
    }

    @Test
    public void test0228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0228");
        com.reservation_system.model.Researcher researcher5 = new com.reservation_system.model.Researcher((int) (short) 10, "Student", "Strong1!", "labmanager", true);
    }

    @Test
    public void test0229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0229");
        com.reservation_system.model.Faculty faculty5 = new com.reservation_system.model.Faculty((int) (short) 0, "coord@yorku.ca", "Researcher", "hi!", true);
        java.lang.String str6 = faculty5.getEmail();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Researcher" + "'", str6, "Researcher");
    }

    @Test
    public void test0230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0230");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("data/test-users.csv");
        boolean boolean2 = userRepository1.headLabCoordinatorExists();
        com.reservation_system.services.CoordinatorAccountService coordinatorAccountService3 = new com.reservation_system.services.CoordinatorAccountService(userRepository1);
        java.util.List<com.reservation_system.model.User> userList4 = userRepository1.getAllUsers();
        com.reservation_system.services.CoordinatorAccountService coordinatorAccountService5 = new com.reservation_system.services.CoordinatorAccountService(userRepository1);
        com.reservation_system.services.CoordinatorAccountService coordinatorAccountService6 = new com.reservation_system.services.CoordinatorAccountService(userRepository1);
        com.reservation_system.model.User user10 = coordinatorAccountService6.createHeadLabCoordinator("Strong1!", "Coordinator2", "coord2@yorku.ca");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(userList4);
        org.junit.Assert.assertNotNull(user10);
    }

    @Test
    public void test0231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0231");
        com.reservation_system.model.HeadLabCoordinator headLabCoordinator5 = new com.reservation_system.model.HeadLabCoordinator((int) (byte) 100, "Guest", "Researcher", "coord2@yorku.ca", true);
        java.lang.String str6 = headLabCoordinator5.getUserType();
        java.lang.String str7 = headLabCoordinator5.getEmail();
        int int8 = headLabCoordinator5.getID();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "headlabcoordinator" + "'", str6, "headlabcoordinator");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Researcher" + "'", str7, "Researcher");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8 == 100);
    }

    @Test
    public void test0232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0232");
        com.reservation_system.model.Guest guest5 = new com.reservation_system.model.Guest(0, "Researcher", "Manager1", "labmanager", false);
        int int6 = guest5.getID();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test0233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0233");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("data/test-users.csv");
        com.reservation_system.model.Faculty faculty7 = new com.reservation_system.model.Faculty((int) (byte) 1, "", "Guest", "Student", true);
        userRepository1.addUser((com.reservation_system.model.User) faculty7);
        java.util.List<com.reservation_system.model.User> userList9 = userRepository1.getAllUsers();
        java.util.Optional<com.reservation_system.model.User> userOptional11 = userRepository1.findByEmail("Coordinator2");
        org.junit.Assert.assertNotNull(userList9);
        org.junit.Assert.assertNotNull(userOptional11);
    }

    @Test
    public void test0234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0234");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("data/test-users.csv");
        boolean boolean3 = userRepository1.emailExists("headlabcoordinator");
        com.reservation_system.services.CoordinatorAccountService coordinatorAccountService4 = new com.reservation_system.services.CoordinatorAccountService(userRepository1);
        // The following exception was thrown during execution in test generation
        try {
            com.reservation_system.model.User user8 = coordinatorAccountService4.createHeadLabCoordinator("manager1@yorku.ca", "labmanager", "Strong1!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Only one head lab coordinator account is allowed.");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
    }

    @Test
    public void test0235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0235");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("data/test-users.csv");
        java.util.Optional<com.reservation_system.model.User> userOptional3 = userRepository1.findByEmail("Faculty");
        java.util.Optional<com.reservation_system.model.User> userOptional5 = userRepository1.findByEmail("headlabcoordinator");
        boolean boolean7 = userRepository1.emailExists("Manager1");
        java.util.List<com.reservation_system.model.User> userList8 = userRepository1.getAllUsers();
        boolean boolean10 = userRepository1.emailExists("");
        com.reservation_system.model.LabManager labManager16 = new com.reservation_system.model.LabManager((int) (short) 0, "", "Faculty", "Student", true);
        java.lang.String str17 = labManager16.getEmail();
        java.lang.String str18 = labManager16.getUserType();
        userRepository1.addUser((com.reservation_system.model.User) labManager16);
        java.util.Optional<com.reservation_system.model.User> userOptional21 = userRepository1.findByEmail("Student");
        org.junit.Assert.assertNotNull(userOptional3);
        org.junit.Assert.assertNotNull(userOptional5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(userList8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "Faculty" + "'", str17, "Faculty");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "labmanager" + "'", str18, "labmanager");
        org.junit.Assert.assertNotNull(userOptional21);
    }

    @Test
    public void test0236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0236");
        com.reservation_system.model.Researcher researcher5 = new com.reservation_system.model.Researcher((int) (byte) 100, "Researcher", "", "Manager1", false);
    }

    @Test
    public void test0237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0237");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("data/test-users.csv");
        java.util.Optional<com.reservation_system.model.User> userOptional3 = userRepository1.findByEmail("Faculty");
        java.util.Optional<com.reservation_system.model.User> userOptional5 = userRepository1.findByEmail("headlabcoordinator");
        boolean boolean7 = userRepository1.emailExists("");
        boolean boolean9 = userRepository1.emailExists("Student");
        java.util.List<com.reservation_system.model.User> userList10 = userRepository1.getAllUsers();
        org.junit.Assert.assertNotNull(userOptional3);
        org.junit.Assert.assertNotNull(userOptional5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(userList10);
    }

    @Test
    public void test0238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0238");
        com.reservation_system.model.Student student5 = new com.reservation_system.model.Student((int) '#', "Coordinator", "Coordinator", "", false);
        boolean boolean6 = student5.isApproved();
        java.lang.String str7 = student5.getName();
        java.lang.String str8 = student5.getUserType();
        java.lang.String str9 = student5.getEmail();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Coordinator" + "'", str7, "Coordinator");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Student" + "'", str8, "Student");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Coordinator" + "'", str9, "Coordinator");
    }

    @Test
    public void test0239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0239");
        com.reservation_system.model.Student student5 = new com.reservation_system.model.Student((int) '#', "Coordinator", "Coordinator", "", false);
        boolean boolean6 = student5.requiresDepartmentApproval();
        boolean boolean7 = student5.requiresDepartmentApproval();
        student5.setApproved(true);
        java.lang.String str10 = student5.getName();
        java.lang.String str11 = student5.getUserType();
        java.lang.String str12 = student5.getUserType();
        boolean boolean13 = student5.isApproved();
        boolean boolean14 = student5.isApproved();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Coordinator" + "'", str10, "Coordinator");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Student" + "'", str11, "Student");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Student" + "'", str12, "Student");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test0240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0240");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("data/test-users.csv");
        java.util.Optional<com.reservation_system.model.User> userOptional3 = userRepository1.findByEmail("Faculty");
        com.reservation_system.services.CoordinatorAccountService coordinatorAccountService4 = new com.reservation_system.services.CoordinatorAccountService(userRepository1);
        // The following exception was thrown during execution in test generation
        try {
            com.reservation_system.model.User user8 = coordinatorAccountService4.createHeadLabCoordinator("Coordinator", "labmanager", "Faculty");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Only one head lab coordinator account is allowed.");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(userOptional3);
    }

    @Test
    public void test0241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0241");
        com.reservation_system.model.LabManager labManager5 = new com.reservation_system.model.LabManager((int) (short) 10, "Faculty", "labmanager", "manager1@yorku.ca", true);
    }

    @Test
    public void test0242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0242");
        com.reservation_system.model.Faculty faculty5 = new com.reservation_system.model.Faculty(99, "", "Coordinator2", "data/test-users.csv", false);
    }

    @Test
    public void test0243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0243");
        com.reservation_system.model.Faculty faculty5 = new com.reservation_system.model.Faculty((int) (short) 0, "Researcher", "Manager1", "Guest", false);
        int int6 = faculty5.getID();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test0244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0244");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("data/test-users.csv");
        boolean boolean2 = userRepository1.headLabCoordinatorExists();
        com.reservation_system.services.CoordinatorAccountService coordinatorAccountService3 = new com.reservation_system.services.CoordinatorAccountService(userRepository1);
        java.util.List<com.reservation_system.model.User> userList4 = userRepository1.getAllUsers();
        com.reservation_system.model.Student student10 = new com.reservation_system.model.Student((int) '#', "Coordinator", "Coordinator", "", false);
        boolean boolean11 = student10.requiresDepartmentApproval();
        boolean boolean12 = student10.requiresDepartmentApproval();
        student10.setApproved(true);
        java.lang.String str15 = student10.getName();
        userRepository1.addUser((com.reservation_system.model.User) student10);
        java.util.Optional<com.reservation_system.model.User> userOptional18 = userRepository1.findByEmail("coord@yorku.ca");
        boolean boolean20 = userRepository1.emailExists("Coordinator2");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(userList4);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Coordinator" + "'", str15, "Coordinator");
        org.junit.Assert.assertNotNull(userOptional18);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
    }

    @Test
    public void test0245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0245");
        com.reservation_system.model.Researcher researcher5 = new com.reservation_system.model.Researcher((int) (short) 0, "", "headlabcoordinator", "Student", false);
    }

    @Test
    public void test0246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0246");
        com.reservation_system.model.Student student5 = new com.reservation_system.model.Student(35, "hi!", "Student", "Student", true);
        java.lang.Class<?> wildcardClass6 = student5.getClass();
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0247");
        // The following exception was thrown during execution in test generation
        try {
            com.reservation_system.model.User user6 = com.reservation_system.patterns.factory.UserFactory.createUser("manager1@yorku.ca", (int) (short) 1, "Student", "Coordinator2", "headlabcoordinator", true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid user type: manager1@yorku.ca");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0248");
        // The following exception was thrown during execution in test generation
        try {
            com.reservation_system.model.User user6 = com.reservation_system.patterns.factory.UserFactory.createUser("", (int) 'a', "labmanager", "Coordinator", "", true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid user type: ");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0249");
        // The following exception was thrown during execution in test generation
        try {
            com.reservation_system.model.User user6 = com.reservation_system.patterns.factory.UserFactory.createUser("hi!", (int) ' ', "coord@yorku.ca", "", "Researcher", true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid user type: hi!");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0250");
        // The following exception was thrown during execution in test generation
        try {
            com.reservation_system.model.User user6 = com.reservation_system.patterns.factory.UserFactory.createUser("data/test-users.csv", (int) (short) -1, "manager1@yorku.ca", "coord@yorku.ca", "", false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid user type: data/test-users.csv");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0251");
        com.reservation_system.model.Student student5 = new com.reservation_system.model.Student((int) '4', "coord@yorku.ca", "hi!", "data/test-users.csv", true);
    }

    @Test
    public void test0252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0252");
        com.reservation_system.model.Researcher researcher5 = new com.reservation_system.model.Researcher(0, "Student", "Faculty", "Faculty", false);
        boolean boolean6 = researcher5.requiresDepartmentApproval();
        java.lang.Class<?> wildcardClass7 = researcher5.getClass();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0253");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("data/test-users.csv");
        com.reservation_system.model.LabManager labManager7 = new com.reservation_system.model.LabManager((int) (short) 0, "", "Faculty", "Student", true);
        java.lang.String str8 = labManager7.getUserType();
        java.lang.String str9 = labManager7.getPassword();
        userRepository1.addUser((com.reservation_system.model.User) labManager7);
        boolean boolean11 = userRepository1.headLabCoordinatorExists();
        com.reservation_system.model.Researcher researcher17 = new com.reservation_system.model.Researcher(0, "Student", "Faculty", "Faculty", false);
        userRepository1.addUser((com.reservation_system.model.User) researcher17);
        java.util.Optional<com.reservation_system.model.User> userOptional20 = userRepository1.findByEmail("data/test-users.csv");
        com.reservation_system.services.CoordinatorAccountService coordinatorAccountService21 = new com.reservation_system.services.CoordinatorAccountService(userRepository1);
        int int22 = userRepository1.getNextID();
        java.util.Optional<com.reservation_system.model.User> userOptional24 = userRepository1.findByEmail("");
        com.reservation_system.model.Student student30 = new com.reservation_system.model.Student((int) '#', "Coordinator", "Coordinator", "", false);
        boolean boolean31 = student30.requiresDepartmentApproval();
        boolean boolean32 = student30.requiresDepartmentApproval();
        java.lang.String str33 = student30.getUserType();
        student30.setApproved(false);
        userRepository1.addUser((com.reservation_system.model.User) student30);
        java.lang.String str37 = student30.getUserType();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "labmanager" + "'", str8, "labmanager");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Student" + "'", str9, "Student");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(userOptional20);
// flaky "31) test0253(com.reservation_system.Randoop.CoordinatorService.RegressionTest0)":         org.junit.Assert.assertTrue("'" + int22 + "' != '" + 101 + "'", int22 == 101);
        org.junit.Assert.assertNotNull(userOptional24);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "Student" + "'", str33, "Student");
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "Student" + "'", str37, "Student");
    }

    @Test
    public void test0254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0254");
        com.reservation_system.model.Student student5 = new com.reservation_system.model.Student((-1), "Student", "", "Student", false);
    }

    @Test
    public void test0255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0255");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("data/test-users.csv");
        java.util.Optional<com.reservation_system.model.User> userOptional3 = userRepository1.findByEmail("Faculty");
        java.util.Optional<com.reservation_system.model.User> userOptional5 = userRepository1.findByEmail("headlabcoordinator");
        boolean boolean7 = userRepository1.emailExists("Manager1");
        java.util.List<com.reservation_system.model.User> userList8 = userRepository1.getAllUsers();
        boolean boolean10 = userRepository1.emailExists("");
        com.reservation_system.model.LabManager labManager16 = new com.reservation_system.model.LabManager((int) (short) 0, "", "Faculty", "Student", true);
        java.lang.String str17 = labManager16.getEmail();
        java.lang.String str18 = labManager16.getUserType();
        userRepository1.addUser((com.reservation_system.model.User) labManager16);
        boolean boolean21 = userRepository1.emailExists("labmanager");
        java.util.List<com.reservation_system.model.User> userList22 = userRepository1.getAllUsers();
        boolean boolean23 = userRepository1.headLabCoordinatorExists();
        com.reservation_system.services.CoordinatorAccountService coordinatorAccountService24 = new com.reservation_system.services.CoordinatorAccountService(userRepository1);
        com.reservation_system.model.Researcher researcher30 = new com.reservation_system.model.Researcher(35, "", "headlabcoordinator", "Faculty", false);
        boolean boolean31 = researcher30.requiresDepartmentApproval();
        // The following exception was thrown during execution in test generation
        try {
            com.reservation_system.model.User user35 = coordinatorAccountService24.autoGenerateLabManagerAccount((com.reservation_system.model.User) researcher30, "Faculty", "coord2@yorku.ca", "manager1@yorku.ca");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Only the head lab coordinator can generate lab manager accounts.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(userOptional3);
        org.junit.Assert.assertNotNull(userOptional5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(userList8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "Faculty" + "'", str17, "Faculty");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "labmanager" + "'", str18, "labmanager");
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(userList22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
    }

    @Test
    public void test0256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0256");
        com.reservation_system.model.Guest guest5 = new com.reservation_system.model.Guest(35, "labmanager", "data/test-users.csv", "labmanager", true);
        int int6 = guest5.getID();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 35 + "'", int6 == 35);
    }

    @Test
    public void test0257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0257");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("data/test-users.csv");
        java.util.Optional<com.reservation_system.model.User> userOptional3 = userRepository1.findByEmail("Faculty");
        java.util.Optional<com.reservation_system.model.User> userOptional5 = userRepository1.findByEmail("headlabcoordinator");
        boolean boolean7 = userRepository1.emailExists("Manager1");
        java.util.List<com.reservation_system.model.User> userList8 = userRepository1.getAllUsers();
        boolean boolean10 = userRepository1.emailExists("");
        com.reservation_system.model.LabManager labManager16 = new com.reservation_system.model.LabManager((int) (short) 0, "", "Faculty", "Student", true);
        java.lang.String str17 = labManager16.getEmail();
        java.lang.String str18 = labManager16.getUserType();
        userRepository1.addUser((com.reservation_system.model.User) labManager16);
        com.reservation_system.repository.UserRepository userRepository21 = new com.reservation_system.repository.UserRepository("data/test-users.csv");
        boolean boolean22 = userRepository21.headLabCoordinatorExists();
        boolean boolean23 = userRepository21.headLabCoordinatorExists();
        java.util.List<com.reservation_system.model.User> userList24 = userRepository21.getAllUsers();
        userRepository1.saveAllUsers(userList24);
        boolean boolean26 = userRepository1.headLabCoordinatorExists();
        org.junit.Assert.assertNotNull(userOptional3);
        org.junit.Assert.assertNotNull(userOptional5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(userList8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "Faculty" + "'", str17, "Faculty");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "labmanager" + "'", str18, "labmanager");
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertNotNull(userList24);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
    }

    @Test
    public void test0258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0258");
        // The following exception was thrown during execution in test generation
        try {
            com.reservation_system.model.User user6 = com.reservation_system.patterns.factory.UserFactory.createUser("Manager1", (int) '4', "", "Student", "coord@yorku.ca", true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid user type: Manager1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0259");
        com.reservation_system.model.HeadLabCoordinator headLabCoordinator5 = new com.reservation_system.model.HeadLabCoordinator((int) ' ', "coord2@yorku.ca", "Guest", "headlabcoordinator", false);
        java.lang.String str6 = headLabCoordinator5.getUserType();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "headlabcoordinator" + "'", str6, "headlabcoordinator");
    }

    @Test
    public void test0260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0260");
        com.reservation_system.model.LabManager labManager5 = new com.reservation_system.model.LabManager((int) (short) 0, "", "Faculty", "Student", true);
        java.lang.String str6 = labManager5.getEmail();
        java.lang.String str7 = labManager5.getUserType();
        int int8 = labManager5.getID();
        boolean boolean9 = labManager5.isApproved();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Faculty" + "'", str6, "Faculty");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "labmanager" + "'", str7, "labmanager");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test0261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0261");
        com.reservation_system.model.HeadLabCoordinator headLabCoordinator5 = new com.reservation_system.model.HeadLabCoordinator(10, "", "Researcher", "Faculty", false);
    }

    @Test
    public void test0262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0262");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("data/test-users.csv");
        java.util.Optional<com.reservation_system.model.User> userOptional3 = userRepository1.findByEmail("Faculty");
        java.util.Optional<com.reservation_system.model.User> userOptional5 = userRepository1.findByEmail("headlabcoordinator");
        boolean boolean7 = userRepository1.emailExists("Manager1");
        java.util.List<com.reservation_system.model.User> userList8 = userRepository1.getAllUsers();
        boolean boolean10 = userRepository1.emailExists("");
        com.reservation_system.model.LabManager labManager16 = new com.reservation_system.model.LabManager((int) (short) 0, "", "Faculty", "Student", true);
        java.lang.String str17 = labManager16.getEmail();
        java.lang.String str18 = labManager16.getUserType();
        userRepository1.addUser((com.reservation_system.model.User) labManager16);
        boolean boolean20 = userRepository1.headLabCoordinatorExists();
        com.reservation_system.model.Student student26 = new com.reservation_system.model.Student((int) (short) 0, "coord@yorku.ca", "headlabcoordinator", "Strong1!", true);
        java.lang.String str27 = student26.getPassword();
        userRepository1.addUser((com.reservation_system.model.User) student26);
        boolean boolean29 = userRepository1.headLabCoordinatorExists();
        com.reservation_system.repository.UserRepository userRepository31 = new com.reservation_system.repository.UserRepository("data/test-users.csv");
        boolean boolean32 = userRepository31.headLabCoordinatorExists();
        boolean boolean33 = userRepository31.headLabCoordinatorExists();
        boolean boolean35 = userRepository31.emailExists("Manager1");
        java.util.Optional<com.reservation_system.model.User> userOptional37 = userRepository31.findByEmail("Strong1!");
        java.util.List<com.reservation_system.model.User> userList38 = userRepository31.getAllUsers();
        userRepository1.saveAllUsers(userList38);
        com.reservation_system.model.LabManager labManager45 = new com.reservation_system.model.LabManager((int) (short) 0, "", "Faculty", "Student", true);
        java.lang.String str46 = labManager45.getUserType();
        java.lang.String str47 = labManager45.getPassword();
        userRepository1.addUser((com.reservation_system.model.User) labManager45);
        com.reservation_system.services.CoordinatorAccountService coordinatorAccountService49 = new com.reservation_system.services.CoordinatorAccountService(userRepository1);
        com.reservation_system.model.Student student55 = new com.reservation_system.model.Student((int) '#', "Coordinator", "Coordinator", "", false);
        boolean boolean56 = student55.requiresDepartmentApproval();
        java.lang.String str57 = student55.getUserType();
        student55.setApproved(false);
        boolean boolean60 = student55.requiresDepartmentApproval();
        // The following exception was thrown during execution in test generation
        try {
            com.reservation_system.model.User user64 = coordinatorAccountService49.autoGenerateLabManagerAccount((com.reservation_system.model.User) student55, "coord2@yorku.ca", "manager1@yorku.ca", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Only the head lab coordinator can generate lab manager accounts.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(userOptional3);
        org.junit.Assert.assertNotNull(userOptional5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(userList8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "Faculty" + "'", str17, "Faculty");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "labmanager" + "'", str18, "labmanager");
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "Strong1!" + "'", str27, "Strong1!");
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertNotNull(userOptional37);
        org.junit.Assert.assertNotNull(userList38);
        org.junit.Assert.assertEquals("'" + str46 + "' != '" + "labmanager" + "'", str46, "labmanager");
        org.junit.Assert.assertEquals("'" + str47 + "' != '" + "Student" + "'", str47, "Student");
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + true + "'", boolean56 == true);
        org.junit.Assert.assertEquals("'" + str57 + "' != '" + "Student" + "'", str57, "Student");
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + true + "'", boolean60 == true);
    }

    @Test
    public void test0263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0263");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("data/test-users.csv");
        boolean boolean2 = userRepository1.headLabCoordinatorExists();
        com.reservation_system.services.CoordinatorAccountService coordinatorAccountService3 = new com.reservation_system.services.CoordinatorAccountService(userRepository1);
        // The following exception was thrown during execution in test generation
        try {
            com.reservation_system.model.User user7 = coordinatorAccountService3.createHeadLabCoordinator("Manager1", "headlabcoordinator", "Faculty");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Only one head lab coordinator account is allowed.");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test0264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0264");
        com.reservation_system.model.LabManager labManager5 = new com.reservation_system.model.LabManager((int) 'a', "Coordinator2", "", "", false);
        java.lang.String str6 = labManager5.getPassword();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
    }

    @Test
    public void test0265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0265");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("data/test-users.csv");
        boolean boolean3 = userRepository1.emailExists("headlabcoordinator");
        boolean boolean5 = userRepository1.emailExists("");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test0266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0266");
        com.reservation_system.model.Faculty faculty5 = new com.reservation_system.model.Faculty(32, "Faculty", "Student", "Student", false);
        java.lang.String str6 = faculty5.getName();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Faculty" + "'", str6, "Faculty");
    }

    @Test
    public void test0267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0267");
        // The following exception was thrown during execution in test generation
        try {
            com.reservation_system.model.User user6 = com.reservation_system.patterns.factory.UserFactory.createUser("", 52, "Guest", "Coordinator2", "Coordinator2", true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid user type: ");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0268");
        com.reservation_system.model.Faculty faculty5 = new com.reservation_system.model.Faculty((int) ' ', "Researcher", "coord2@yorku.ca", "Coordinator", false);
    }

    @Test
    public void test0269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0269");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("data/test-users.csv");
        boolean boolean2 = userRepository1.headLabCoordinatorExists();
        com.reservation_system.services.CoordinatorAccountService coordinatorAccountService3 = new com.reservation_system.services.CoordinatorAccountService(userRepository1);
        java.util.List<com.reservation_system.model.User> userList4 = userRepository1.getAllUsers();
        com.reservation_system.services.CoordinatorAccountService coordinatorAccountService5 = new com.reservation_system.services.CoordinatorAccountService(userRepository1);
        com.reservation_system.model.Guest guest11 = new com.reservation_system.model.Guest((int) (byte) 1, "Coordinator", "Coordinator2", "Manager1", true);
        java.lang.String str12 = guest11.getName();
        // The following exception was thrown during execution in test generation
        try {
            com.reservation_system.model.User user16 = coordinatorAccountService5.autoGenerateLabManagerAccount((com.reservation_system.model.User) guest11, "hi!", "", "coord2@yorku.ca");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Email is required.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(userList4);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Coordinator" + "'", str12, "Coordinator");
    }

    @Test
    public void test0270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0270");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("data/test-users.csv");
        boolean boolean2 = userRepository1.headLabCoordinatorExists();
        java.util.List<com.reservation_system.model.User> userList3 = userRepository1.getAllUsers();
        int int4 = userRepository1.getNextID();
        java.util.Optional<com.reservation_system.model.User> userOptional6 = userRepository1.findByEmail("coord2@yorku.ca");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(userList3);
// flaky "32) test0270(com.reservation_system.Randoop.CoordinatorService.RegressionTest0)":         org.junit.Assert.assertTrue("'" + int4 + "' != '" + 101 + "'", int4 == 101);
        org.junit.Assert.assertNotNull(userOptional6);
    }

    @Test
    public void test0271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0271");
        com.reservation_system.model.LabManager labManager5 = new com.reservation_system.model.LabManager((int) (short) 0, "headlabcoordinator", "Student", "Student", false);
    }

    @Test
    public void test0272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0272");
        com.reservation_system.model.Guest guest5 = new com.reservation_system.model.Guest(10, "coord@yorku.ca", "Guest", "headlabcoordinator", false);
        boolean boolean6 = guest5.isApproved();
        java.lang.String str7 = guest5.getName();
        guest5.setApproved(true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "coord@yorku.ca" + "'", str7, "coord@yorku.ca");
    }

    @Test
    public void test0273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0273");
        com.reservation_system.model.LabManager labManager5 = new com.reservation_system.model.LabManager(1, "hi!", "manager1@yorku.ca", "hi!", false);
        boolean boolean6 = labManager5.requiresDepartmentApproval();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test0274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0274");
        com.reservation_system.model.Guest guest5 = new com.reservation_system.model.Guest((int) (byte) -1, "coord2@yorku.ca", "coord2@yorku.ca", "hi!", true);
        java.lang.String str6 = guest5.getUserType();
        java.lang.String str7 = guest5.getUserType();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Guest" + "'", str6, "Guest");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Guest" + "'", str7, "Guest");
    }

    @Test
    public void test0275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0275");
        com.reservation_system.model.Guest guest5 = new com.reservation_system.model.Guest(0, "Guest", "headlabcoordinator", "Faculty", false);
        java.lang.String str6 = guest5.getEmail();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "headlabcoordinator" + "'", str6, "headlabcoordinator");
    }

    @Test
    public void test0276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0276");
        com.reservation_system.model.Student student5 = new com.reservation_system.model.Student((int) '#', "Coordinator", "Coordinator", "", false);
        boolean boolean6 = student5.requiresDepartmentApproval();
        boolean boolean7 = student5.requiresDepartmentApproval();
        java.lang.String str8 = student5.getUserType();
        java.lang.String str9 = student5.getUserType();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Student" + "'", str8, "Student");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Student" + "'", str9, "Student");
    }

    @Test
    public void test0277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0277");
        com.reservation_system.model.LabManager labManager5 = new com.reservation_system.model.LabManager((int) (short) 0, "Guest", "Faculty", "", false);
        java.lang.String str6 = labManager5.getUserType();
        java.lang.String str7 = labManager5.getName();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "labmanager" + "'", str6, "labmanager");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Guest" + "'", str7, "Guest");
    }

    @Test
    public void test0278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0278");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("data/test-users.csv");
        java.util.Optional<com.reservation_system.model.User> userOptional3 = userRepository1.findByEmail("Faculty");
        com.reservation_system.services.CoordinatorAccountService coordinatorAccountService4 = new com.reservation_system.services.CoordinatorAccountService(userRepository1);
        com.reservation_system.model.HeadLabCoordinator headLabCoordinator10 = new com.reservation_system.model.HeadLabCoordinator((int) (short) 10, "data/test-users.csv", "", "labmanager", false);
        java.lang.String str11 = headLabCoordinator10.getName();
        // The following exception was thrown during execution in test generation
        try {
            com.reservation_system.model.User user15 = coordinatorAccountService4.autoGenerateLabManagerAccount((com.reservation_system.model.User) headLabCoordinator10, "", "", "Researcher");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Name is required.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(userOptional3);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "data/test-users.csv" + "'", str11, "data/test-users.csv");
    }

    @Test
    public void test0279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0279");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("data/test-users.csv");
        boolean boolean3 = userRepository1.emailExists("headlabcoordinator");
        int int4 = userRepository1.getNextID();
        int int5 = userRepository1.getNextID();
        int int6 = userRepository1.getNextID();
        boolean boolean8 = userRepository1.emailExists("Student");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
// flaky "33) test0279(com.reservation_system.Randoop.CoordinatorService.RegressionTest0)":         org.junit.Assert.assertTrue("'" + int4 + "' != '" + 101 + "'", int4 == 101);
// flaky "9) test0279(com.reservation_system.Randoop.CoordinatorService.RegressionTest0)":         org.junit.Assert.assertTrue("'" + int5 + "' != '" + 101 + "'", int5 == 101);
// flaky "2) test0279(com.reservation_system.Randoop.CoordinatorService.RegressionTest0)":         org.junit.Assert.assertTrue("'" + int6 + "' != '" + 101 + "'", int6 == 101);
// flaky "1) test0279(com.reservation_system.Randoop.CoordinatorService.RegressionTest0)":         org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test0280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0280");
        com.reservation_system.model.LabManager labManager5 = new com.reservation_system.model.LabManager((int) (short) 0, "coord@yorku.ca", "", "Manager1", true);
        java.lang.String str6 = labManager5.getName();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "coord@yorku.ca" + "'", str6, "coord@yorku.ca");
    }

    @Test
    public void test0281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0281");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("data/test-users.csv");
        boolean boolean3 = userRepository1.emailExists("headlabcoordinator");
        com.reservation_system.services.CoordinatorAccountService coordinatorAccountService4 = new com.reservation_system.services.CoordinatorAccountService(userRepository1);
        com.reservation_system.services.CoordinatorAccountService coordinatorAccountService5 = new com.reservation_system.services.CoordinatorAccountService(userRepository1);
        // The following exception was thrown during execution in test generation
        try {
            com.reservation_system.model.User user9 = coordinatorAccountService5.createHeadLabCoordinator("data/test-users.csv", "Faculty", "");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Password is required.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
    }

    @Test
    public void test0282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0282");
        com.reservation_system.model.Student student5 = new com.reservation_system.model.Student((int) (short) -1, "data/test-users.csv", "labmanager", "headlabcoordinator", false);
    }

    @Test
    public void test0283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0283");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("data/test-users.csv");
        java.util.Optional<com.reservation_system.model.User> userOptional3 = userRepository1.findByEmail("Faculty");
        java.util.Optional<com.reservation_system.model.User> userOptional5 = userRepository1.findByEmail("headlabcoordinator");
        boolean boolean7 = userRepository1.emailExists("Manager1");
        java.util.List<com.reservation_system.model.User> userList8 = userRepository1.getAllUsers();
        boolean boolean10 = userRepository1.emailExists("");
        com.reservation_system.model.LabManager labManager16 = new com.reservation_system.model.LabManager((int) (short) 0, "", "Faculty", "Student", true);
        java.lang.String str17 = labManager16.getEmail();
        java.lang.String str18 = labManager16.getUserType();
        userRepository1.addUser((com.reservation_system.model.User) labManager16);
        boolean boolean21 = userRepository1.emailExists("labmanager");
        java.util.List<com.reservation_system.model.User> userList22 = userRepository1.getAllUsers();
        boolean boolean23 = userRepository1.headLabCoordinatorExists();
        java.util.List<com.reservation_system.model.User> userList24 = userRepository1.getAllUsers();
        boolean boolean26 = userRepository1.emailExists("");
        org.junit.Assert.assertNotNull(userOptional3);
        org.junit.Assert.assertNotNull(userOptional5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(userList8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "Faculty" + "'", str17, "Faculty");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "labmanager" + "'", str18, "labmanager");
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(userList22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertNotNull(userList24);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
    }

    @Test
    public void test0284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0284");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("data/test-users.csv");
        com.reservation_system.model.LabManager labManager7 = new com.reservation_system.model.LabManager((int) (short) 0, "", "Faculty", "Student", true);
        java.lang.String str8 = labManager7.getUserType();
        java.lang.String str9 = labManager7.getPassword();
        userRepository1.addUser((com.reservation_system.model.User) labManager7);
        boolean boolean11 = userRepository1.headLabCoordinatorExists();
        boolean boolean13 = userRepository1.emailExists("Coordinator");
        java.util.Optional<com.reservation_system.model.User> userOptional15 = userRepository1.findByEmail("");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "labmanager" + "'", str8, "labmanager");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Student" + "'", str9, "Student");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(userOptional15);
    }

    @Test
    public void test0285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0285");
        com.reservation_system.model.LabManager labManager5 = new com.reservation_system.model.LabManager(35, "headlabcoordinator", "Guest", "hi!", true);
    }

    @Test
    public void test0286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0286");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("data/test-users.csv");
        boolean boolean2 = userRepository1.headLabCoordinatorExists();
        boolean boolean3 = userRepository1.headLabCoordinatorExists();
        java.util.Optional<com.reservation_system.model.User> userOptional5 = userRepository1.findByEmail("");
        com.reservation_system.services.CoordinatorAccountService coordinatorAccountService6 = new com.reservation_system.services.CoordinatorAccountService(userRepository1);
        com.reservation_system.model.Researcher researcher12 = new com.reservation_system.model.Researcher((int) '#', "Coordinator2", "Strong1!", "Faculty", true);
        // The following exception was thrown during execution in test generation
        try {
            com.reservation_system.model.User user16 = coordinatorAccountService6.autoGenerateLabManagerAccount((com.reservation_system.model.User) researcher12, "Strong1!", "Guest", "data/test-users.csv");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Only the head lab coordinator can generate lab manager accounts.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(userOptional5);
    }

    @Test
    public void test0287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0287");
        com.reservation_system.model.Guest guest5 = new com.reservation_system.model.Guest((int) (short) 0, "Manager1", "Coordinator2", "", true);
        int int6 = guest5.getID();
        java.lang.String str7 = guest5.getName();
        java.lang.String str8 = guest5.getUserType();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Manager1" + "'", str7, "Manager1");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Guest" + "'", str8, "Guest");
    }

    @Test
    public void test0288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0288");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("data/test-users.csv");
        com.reservation_system.model.Faculty faculty7 = new com.reservation_system.model.Faculty((int) (byte) 1, "", "Guest", "Student", true);
        userRepository1.addUser((com.reservation_system.model.User) faculty7);
        java.util.List<com.reservation_system.model.User> userList9 = userRepository1.getAllUsers();
        com.reservation_system.services.CoordinatorAccountService coordinatorAccountService10 = new com.reservation_system.services.CoordinatorAccountService(userRepository1);
        com.reservation_system.model.LabManager labManager16 = new com.reservation_system.model.LabManager(98, "", "coord@yorku.ca", "Coordinator", false);
        // The following exception was thrown during execution in test generation
        try {
            com.reservation_system.model.User user20 = coordinatorAccountService10.autoGenerateLabManagerAccount((com.reservation_system.model.User) labManager16, "", "data/test-users.csv", "Coordinator");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Name is required.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(userList9);
    }

    @Test
    public void test0289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0289");
        com.reservation_system.model.Researcher researcher5 = new com.reservation_system.model.Researcher((int) (byte) 1, "Coordinator", "", "Student", false);
    }

    @Test
    public void test0290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0290");
        com.reservation_system.model.Researcher researcher5 = new com.reservation_system.model.Researcher((int) (short) -1, "Manager1", "headlabcoordinator", "coord@yorku.ca", true);
        researcher5.setApproved(true);
        java.lang.String str8 = researcher5.getName();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Manager1" + "'", str8, "Manager1");
    }

    @Test
    public void test0291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0291");
        com.reservation_system.model.Guest guest5 = new com.reservation_system.model.Guest((int) (short) 0, "Manager1", "Coordinator2", "", true);
        java.lang.String str6 = guest5.getPassword();
        guest5.setApproved(false);
        boolean boolean9 = guest5.isApproved();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test0292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0292");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("data/test-users.csv");
        boolean boolean3 = userRepository1.emailExists("headlabcoordinator");
        com.reservation_system.services.CoordinatorAccountService coordinatorAccountService4 = new com.reservation_system.services.CoordinatorAccountService(userRepository1);
        com.reservation_system.services.CoordinatorAccountService coordinatorAccountService5 = new com.reservation_system.services.CoordinatorAccountService(userRepository1);
        // The following exception was thrown during execution in test generation
        try {
            com.reservation_system.model.User user9 = coordinatorAccountService5.createHeadLabCoordinator("Guest", "", "");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Email is required.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
    }

    @Test
    public void test0293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0293");
        com.reservation_system.model.HeadLabCoordinator headLabCoordinator5 = new com.reservation_system.model.HeadLabCoordinator((int) (short) 10, "", "", "labmanager", false);
        java.lang.String str6 = headLabCoordinator5.getUserType();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "headlabcoordinator" + "'", str6, "headlabcoordinator");
    }

    @Test
    public void test0294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0294");
        com.reservation_system.model.LabManager labManager5 = new com.reservation_system.model.LabManager((int) (short) 0, "", "Faculty", "Student", true);
        java.lang.String str6 = labManager5.getEmail();
        java.lang.String str7 = labManager5.getUserType();
        int int8 = labManager5.getID();
        java.lang.String str9 = labManager5.getUserType();
        java.lang.String str10 = labManager5.getUserType();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Faculty" + "'", str6, "Faculty");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "labmanager" + "'", str7, "labmanager");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "labmanager" + "'", str9, "labmanager");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "labmanager" + "'", str10, "labmanager");
    }

    @Test
    public void test0295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0295");
        com.reservation_system.model.Guest guest5 = new com.reservation_system.model.Guest((int) (byte) 0, "coord2@yorku.ca", "Student", "Faculty", false);
    }

    @Test
    public void test0296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0296");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("data/test-users.csv");
        com.reservation_system.model.LabManager labManager7 = new com.reservation_system.model.LabManager((int) (short) 0, "", "Faculty", "Student", true);
        java.lang.String str8 = labManager7.getUserType();
        java.lang.String str9 = labManager7.getPassword();
        userRepository1.addUser((com.reservation_system.model.User) labManager7);
        boolean boolean11 = userRepository1.headLabCoordinatorExists();
        com.reservation_system.model.Researcher researcher17 = new com.reservation_system.model.Researcher(0, "Student", "Faculty", "Faculty", false);
        userRepository1.addUser((com.reservation_system.model.User) researcher17);
        com.reservation_system.services.CoordinatorAccountService coordinatorAccountService19 = new com.reservation_system.services.CoordinatorAccountService(userRepository1);
        com.reservation_system.model.Guest guest25 = new com.reservation_system.model.Guest(0, "Guest", "headlabcoordinator", "Faculty", false);
        userRepository1.addUser((com.reservation_system.model.User) guest25);
        java.util.List<com.reservation_system.model.User> userList27 = userRepository1.getAllUsers();
        com.reservation_system.model.Researcher researcher33 = new com.reservation_system.model.Researcher((int) (short) -1, "labmanager", "coord2@yorku.ca", "Strong1!", false);
        userRepository1.addUser((com.reservation_system.model.User) researcher33);
        boolean boolean36 = userRepository1.emailExists("coord2@yorku.ca");
        java.util.Optional<com.reservation_system.model.User> userOptional38 = userRepository1.findByEmail("manager1@yorku.ca");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "labmanager" + "'", str8, "labmanager");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Student" + "'", str9, "Student");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(userList27);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertNotNull(userOptional38);
    }

    @Test
    public void test0297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0297");
        com.reservation_system.model.LabManager labManager5 = new com.reservation_system.model.LabManager(101, "Researcher", "coord2@yorku.ca", "Guest", false);
    }

    @Test
    public void test0298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0298");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("data/test-users.csv");
        java.util.Optional<com.reservation_system.model.User> userOptional3 = userRepository1.findByEmail("Faculty");
        java.util.Optional<com.reservation_system.model.User> userOptional5 = userRepository1.findByEmail("headlabcoordinator");
        boolean boolean7 = userRepository1.emailExists("Manager1");
        java.util.List<com.reservation_system.model.User> userList8 = userRepository1.getAllUsers();
        boolean boolean10 = userRepository1.emailExists("");
        com.reservation_system.services.CoordinatorAccountService coordinatorAccountService11 = new com.reservation_system.services.CoordinatorAccountService(userRepository1);
        com.reservation_system.model.Researcher researcher17 = new com.reservation_system.model.Researcher((int) (short) -1, "coord@yorku.ca", "data/test-users.csv", "coord2@yorku.ca", false);
        int int18 = researcher17.getID();
        // The following exception was thrown during execution in test generation
        try {
            com.reservation_system.model.User user22 = coordinatorAccountService11.autoGenerateLabManagerAccount((com.reservation_system.model.User) researcher17, "headlabcoordinator", "Coordinator", "Coordinator2");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Only the head lab coordinator can generate lab manager accounts.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(userOptional3);
        org.junit.Assert.assertNotNull(userOptional5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(userList8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
    }

    @Test
    public void test0299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0299");
        com.reservation_system.model.Faculty faculty5 = new com.reservation_system.model.Faculty((int) (byte) 10, "Coordinator2", "data/test-users.csv", "", false);
    }

    @Test
    public void test0300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0300");
        com.reservation_system.model.LabManager labManager5 = new com.reservation_system.model.LabManager((int) (byte) 10, "Coordinator2", "Researcher", "headlabcoordinator", true);
        java.lang.String str6 = labManager5.getName();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Coordinator2" + "'", str6, "Coordinator2");
    }

    @Test
    public void test0301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0301");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("data/test-users.csv");
        java.util.Optional<com.reservation_system.model.User> userOptional3 = userRepository1.findByEmail("Faculty");
        java.util.Optional<com.reservation_system.model.User> userOptional5 = userRepository1.findByEmail("headlabcoordinator");
        com.reservation_system.model.Researcher researcher11 = new com.reservation_system.model.Researcher((int) '#', "Student", "coord2@yorku.ca", "labmanager", false);
        researcher11.setApproved(true);
        userRepository1.addUser((com.reservation_system.model.User) researcher11);
        com.reservation_system.services.CoordinatorAccountService coordinatorAccountService15 = new com.reservation_system.services.CoordinatorAccountService(userRepository1);
        // The following exception was thrown during execution in test generation
        try {
            com.reservation_system.model.User user19 = coordinatorAccountService15.createHeadLabCoordinator("Student", "Researcher", "");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Password is required.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(userOptional3);
        org.junit.Assert.assertNotNull(userOptional5);
    }

    @Test
    public void test0302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0302");
        com.reservation_system.model.LabManager labManager5 = new com.reservation_system.model.LabManager((int) '#', "Faculty", "manager1@yorku.ca", "", true);
        java.lang.String str6 = labManager5.getUserType();
        boolean boolean7 = labManager5.requiresDepartmentApproval();
        java.lang.String str8 = labManager5.getPassword();
        java.lang.String str9 = labManager5.getUserType();
        boolean boolean10 = labManager5.requiresDepartmentApproval();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "labmanager" + "'", str6, "labmanager");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "labmanager" + "'", str9, "labmanager");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test0303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0303");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("data/test-users.csv");
        java.util.Optional<com.reservation_system.model.User> userOptional3 = userRepository1.findByEmail("Faculty");
        java.util.Optional<com.reservation_system.model.User> userOptional5 = userRepository1.findByEmail("headlabcoordinator");
        com.reservation_system.model.Researcher researcher11 = new com.reservation_system.model.Researcher((int) '#', "Student", "coord2@yorku.ca", "labmanager", false);
        researcher11.setApproved(true);
        userRepository1.addUser((com.reservation_system.model.User) researcher11);
        boolean boolean15 = userRepository1.headLabCoordinatorExists();
        org.junit.Assert.assertNotNull(userOptional3);
        org.junit.Assert.assertNotNull(userOptional5);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
    }

    @Test
    public void test0304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0304");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("data/test-users.csv");
        java.util.Optional<com.reservation_system.model.User> userOptional3 = userRepository1.findByEmail("Faculty");
        java.util.Optional<com.reservation_system.model.User> userOptional5 = userRepository1.findByEmail("headlabcoordinator");
        boolean boolean7 = userRepository1.emailExists("Manager1");
        java.util.List<com.reservation_system.model.User> userList8 = userRepository1.getAllUsers();
        boolean boolean10 = userRepository1.emailExists("");
        com.reservation_system.model.LabManager labManager16 = new com.reservation_system.model.LabManager((int) (short) 0, "", "Faculty", "Student", true);
        java.lang.String str17 = labManager16.getEmail();
        java.lang.String str18 = labManager16.getUserType();
        userRepository1.addUser((com.reservation_system.model.User) labManager16);
        boolean boolean20 = userRepository1.headLabCoordinatorExists();
        com.reservation_system.model.Student student26 = new com.reservation_system.model.Student((int) (short) 0, "coord@yorku.ca", "headlabcoordinator", "Strong1!", true);
        java.lang.String str27 = student26.getPassword();
        userRepository1.addUser((com.reservation_system.model.User) student26);
        boolean boolean29 = student26.isApproved();
        java.lang.String str30 = student26.getPassword();
        org.junit.Assert.assertNotNull(userOptional3);
        org.junit.Assert.assertNotNull(userOptional5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(userList8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "Faculty" + "'", str17, "Faculty");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "labmanager" + "'", str18, "labmanager");
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "Strong1!" + "'", str27, "Strong1!");
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "Strong1!" + "'", str30, "Strong1!");
    }

    @Test
    public void test0305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0305");
        com.reservation_system.model.Researcher researcher5 = new com.reservation_system.model.Researcher(99, "Student", "coord@yorku.ca", "", false);
        java.lang.Class<?> wildcardClass6 = researcher5.getClass();
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0306");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("data/test-users.csv");
        java.util.Optional<com.reservation_system.model.User> userOptional3 = userRepository1.findByEmail("Faculty");
        java.util.Optional<com.reservation_system.model.User> userOptional5 = userRepository1.findByEmail("headlabcoordinator");
        boolean boolean7 = userRepository1.emailExists("Manager1");
        java.util.List<com.reservation_system.model.User> userList8 = userRepository1.getAllUsers();
        boolean boolean10 = userRepository1.emailExists("");
        com.reservation_system.model.LabManager labManager16 = new com.reservation_system.model.LabManager((int) (short) 0, "", "Faculty", "Student", true);
        java.lang.String str17 = labManager16.getEmail();
        java.lang.String str18 = labManager16.getUserType();
        userRepository1.addUser((com.reservation_system.model.User) labManager16);
        boolean boolean20 = userRepository1.headLabCoordinatorExists();
        com.reservation_system.model.Student student26 = new com.reservation_system.model.Student((int) (short) 0, "coord@yorku.ca", "headlabcoordinator", "Strong1!", true);
        java.lang.String str27 = student26.getPassword();
        userRepository1.addUser((com.reservation_system.model.User) student26);
        com.reservation_system.model.Student student34 = new com.reservation_system.model.Student((int) '#', "Coordinator", "Coordinator", "", false);
        boolean boolean35 = student34.requiresDepartmentApproval();
        java.lang.String str36 = student34.getUserType();
        int int37 = student34.getID();
        userRepository1.addUser((com.reservation_system.model.User) student34);
        int int39 = userRepository1.getNextID();
        com.reservation_system.repository.UserRepository userRepository41 = new com.reservation_system.repository.UserRepository("data/test-users.csv");
        com.reservation_system.model.LabManager labManager47 = new com.reservation_system.model.LabManager((int) (short) 0, "", "Faculty", "Student", true);
        java.lang.String str48 = labManager47.getUserType();
        java.lang.String str49 = labManager47.getPassword();
        userRepository41.addUser((com.reservation_system.model.User) labManager47);
        boolean boolean51 = userRepository41.headLabCoordinatorExists();
        com.reservation_system.repository.UserRepository userRepository53 = new com.reservation_system.repository.UserRepository("data/test-users.csv");
        boolean boolean54 = userRepository53.headLabCoordinatorExists();
        boolean boolean55 = userRepository53.headLabCoordinatorExists();
        boolean boolean57 = userRepository53.emailExists("Manager1");
        java.util.Optional<com.reservation_system.model.User> userOptional59 = userRepository53.findByEmail("Strong1!");
        java.util.List<com.reservation_system.model.User> userList60 = userRepository53.getAllUsers();
        userRepository41.saveAllUsers(userList60);
        userRepository1.saveAllUsers(userList60);
        java.lang.Class<?> wildcardClass63 = userList60.getClass();
        org.junit.Assert.assertNotNull(userOptional3);
        org.junit.Assert.assertNotNull(userOptional5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(userList8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "Faculty" + "'", str17, "Faculty");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "labmanager" + "'", str18, "labmanager");
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "Strong1!" + "'", str27, "Strong1!");
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "Student" + "'", str36, "Student");
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 35 + "'", int37 == 35);
// flaky "34) test0306(com.reservation_system.Randoop.CoordinatorService.RegressionTest0)":         org.junit.Assert.assertTrue("'" + int39 + "' != '" + 101 + "'", int39 == 101);
        org.junit.Assert.assertEquals("'" + str48 + "' != '" + "labmanager" + "'", str48, "labmanager");
        org.junit.Assert.assertEquals("'" + str49 + "' != '" + "Student" + "'", str49, "Student");
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + true + "'", boolean51 == true);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + true + "'", boolean54 == true);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + true + "'", boolean55 == true);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
        org.junit.Assert.assertNotNull(userOptional59);
        org.junit.Assert.assertNotNull(userList60);
        org.junit.Assert.assertNotNull(wildcardClass63);
    }

    @Test
    public void test0307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0307");
        com.reservation_system.model.Student student5 = new com.reservation_system.model.Student((int) '#', "Coordinator", "Coordinator", "", false);
        boolean boolean6 = student5.requiresDepartmentApproval();
        java.lang.String str7 = student5.getUserType();
        java.lang.String str8 = student5.getUserType();
        java.lang.String str9 = student5.getUserType();
        int int10 = student5.getID();
        java.lang.Class<?> wildcardClass11 = student5.getClass();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Student" + "'", str7, "Student");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Student" + "'", str8, "Student");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Student" + "'", str9, "Student");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 35 + "'", int10 == 35);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0308");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("data/test-users.csv");
        boolean boolean3 = userRepository1.emailExists("data/test-users.csv");
        java.util.Optional<com.reservation_system.model.User> userOptional5 = userRepository1.findByEmail("coord2@yorku.ca");
        int int6 = userRepository1.getNextID();
        boolean boolean8 = userRepository1.emailExists("Strong1!");
        int int9 = userRepository1.getNextID();
        int int10 = userRepository1.getNextID();
// flaky "35) test0308(com.reservation_system.Randoop.CoordinatorService.RegressionTest0)":         org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(userOptional5);
// flaky "10) test0308(com.reservation_system.Randoop.CoordinatorService.RegressionTest0)":         org.junit.Assert.assertTrue("'" + int6 + "' != '" + 101 + "'", int6 == 101);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
// flaky "3) test0308(com.reservation_system.Randoop.CoordinatorService.RegressionTest0)":         org.junit.Assert.assertTrue("'" + int9 + "' != '" + 101 + "'", int9 == 101);
// flaky "2) test0308(com.reservation_system.Randoop.CoordinatorService.RegressionTest0)":         org.junit.Assert.assertTrue("'" + int10 + "' != '" + 101 + "'", int10 == 101);
    }

    @Test
    public void test0309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0309");
        com.reservation_system.model.Guest guest5 = new com.reservation_system.model.Guest((int) (short) 0, "", "labmanager", "", false);
    }

    @Test
    public void test0310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0310");
        com.reservation_system.model.LabManager labManager5 = new com.reservation_system.model.LabManager((int) 'a', "Coordinator2", "", "", false);
        java.lang.String str6 = labManager5.getName();
        labManager5.setApproved(true);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Coordinator2" + "'", str6, "Coordinator2");
    }

    @Test
    public void test0311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0311");
        com.reservation_system.model.Researcher researcher5 = new com.reservation_system.model.Researcher((int) (short) -1, "coord@yorku.ca", "data/test-users.csv", "coord2@yorku.ca", false);
        int int6 = researcher5.getID();
        java.lang.String str7 = researcher5.getPassword();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "coord2@yorku.ca" + "'", str7, "coord2@yorku.ca");
    }

    @Test
    public void test0312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0312");
        com.reservation_system.model.Researcher researcher5 = new com.reservation_system.model.Researcher((int) (short) -1, "coord@yorku.ca", "data/test-users.csv", "coord2@yorku.ca", false);
        java.lang.String str6 = researcher5.getUserType();
        java.lang.String str7 = researcher5.getUserType();
        int int8 = researcher5.getID();
        boolean boolean9 = researcher5.isApproved();
        int int10 = researcher5.getID();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Researcher" + "'", str6, "Researcher");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Researcher" + "'", str7, "Researcher");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
    }

    @Test
    public void test0313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0313");
        com.reservation_system.model.LabManager labManager5 = new com.reservation_system.model.LabManager(0, "headlabcoordinator", "coord@yorku.ca", "coord@yorku.ca", true);
        java.lang.String str6 = labManager5.getEmail();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "coord@yorku.ca" + "'", str6, "coord@yorku.ca");
    }

    @Test
    public void test0314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0314");
        com.reservation_system.model.Guest guest5 = new com.reservation_system.model.Guest((int) (byte) 100, "Faculty", "hi!", "coord@yorku.ca", true);
        java.lang.String str6 = guest5.getPassword();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "coord@yorku.ca" + "'", str6, "coord@yorku.ca");
    }

    @Test
    public void test0315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0315");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("data/test-users.csv");
        java.util.Optional<com.reservation_system.model.User> userOptional3 = userRepository1.findByEmail("Faculty");
        java.util.Optional<com.reservation_system.model.User> userOptional5 = userRepository1.findByEmail("headlabcoordinator");
        boolean boolean7 = userRepository1.emailExists("Manager1");
        java.util.List<com.reservation_system.model.User> userList8 = userRepository1.getAllUsers();
        boolean boolean10 = userRepository1.emailExists("");
        com.reservation_system.model.LabManager labManager16 = new com.reservation_system.model.LabManager((int) (short) 0, "", "Faculty", "Student", true);
        java.lang.String str17 = labManager16.getEmail();
        java.lang.String str18 = labManager16.getUserType();
        userRepository1.addUser((com.reservation_system.model.User) labManager16);
        java.lang.String str20 = labManager16.getUserType();
        org.junit.Assert.assertNotNull(userOptional3);
        org.junit.Assert.assertNotNull(userOptional5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(userList8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "Faculty" + "'", str17, "Faculty");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "labmanager" + "'", str18, "labmanager");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "labmanager" + "'", str20, "labmanager");
    }

    @Test
    public void test0316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0316");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("data/test-users.csv");
        com.reservation_system.model.LabManager labManager7 = new com.reservation_system.model.LabManager((int) 'a', "Manager1", "hi!", "Coordinator2", false);
        java.lang.String str8 = labManager7.getUserType();
        java.lang.String str9 = labManager7.getUserType();
        java.lang.String str10 = labManager7.getUserType();
        userRepository1.addUser((com.reservation_system.model.User) labManager7);
        boolean boolean12 = labManager7.isApproved();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "labmanager" + "'", str8, "labmanager");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "labmanager" + "'", str9, "labmanager");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "labmanager" + "'", str10, "labmanager");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test0317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0317");
        com.reservation_system.model.Researcher researcher5 = new com.reservation_system.model.Researcher(10, "coord2@yorku.ca", "Coordinator2", "Researcher", false);
    }

    @Test
    public void test0318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0318");
        com.reservation_system.model.Guest guest5 = new com.reservation_system.model.Guest((int) (short) 1, "hi!", "Coordinator2", "Strong1!", true);
    }

    @Test
    public void test0319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0319");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("data/test-users.csv");
        java.util.Optional<com.reservation_system.model.User> userOptional3 = userRepository1.findByEmail("Faculty");
        java.util.Optional<com.reservation_system.model.User> userOptional5 = userRepository1.findByEmail("headlabcoordinator");
        java.util.List<com.reservation_system.model.User> userList6 = userRepository1.getAllUsers();
        boolean boolean7 = userRepository1.headLabCoordinatorExists();
        java.util.List<com.reservation_system.model.User> userList8 = userRepository1.getAllUsers();
        org.junit.Assert.assertNotNull(userOptional3);
        org.junit.Assert.assertNotNull(userOptional5);
        org.junit.Assert.assertNotNull(userList6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(userList8);
    }

    @Test
    public void test0320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0320");
        com.reservation_system.model.LabManager labManager5 = new com.reservation_system.model.LabManager((int) 'a', "Manager1", "hi!", "Coordinator2", false);
        labManager5.setApproved(true);
        int int8 = labManager5.getID();
        java.lang.String str9 = labManager5.getUserType();
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 97 + "'", int8 == 97);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "labmanager" + "'", str9, "labmanager");
    }

    @Test
    public void test0321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0321");
        com.reservation_system.model.User user6 = com.reservation_system.patterns.factory.UserFactory.createUser("Guest", (int) 'a', "Manager1", "Guest", "Guest", false);
        java.lang.String str7 = user6.getEmail();
        org.junit.Assert.assertNotNull(user6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Guest" + "'", str7, "Guest");
    }

    @Test
    public void test0322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0322");
        com.reservation_system.model.Guest guest5 = new com.reservation_system.model.Guest(101, "Faculty", "Faculty", "Coordinator", true);
    }

    @Test
    public void test0323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0323");
        com.reservation_system.model.Guest guest5 = new com.reservation_system.model.Guest((int) (short) 10, "Researcher", "labmanager", "manager1@yorku.ca", false);
    }

    @Test
    public void test0324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0324");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("data/test-users.csv");
        java.util.Optional<com.reservation_system.model.User> userOptional3 = userRepository1.findByEmail("Faculty");
        java.util.Optional<com.reservation_system.model.User> userOptional5 = userRepository1.findByEmail("headlabcoordinator");
        boolean boolean7 = userRepository1.emailExists("Manager1");
        java.util.List<com.reservation_system.model.User> userList8 = userRepository1.getAllUsers();
        com.reservation_system.repository.UserRepository userRepository10 = new com.reservation_system.repository.UserRepository("data/test-users.csv");
        java.util.Optional<com.reservation_system.model.User> userOptional12 = userRepository10.findByEmail("Faculty");
        java.util.Optional<com.reservation_system.model.User> userOptional14 = userRepository10.findByEmail("headlabcoordinator");
        boolean boolean16 = userRepository10.emailExists("Manager1");
        java.util.List<com.reservation_system.model.User> userList17 = userRepository10.getAllUsers();
        userRepository1.saveAllUsers(userList17);
        java.util.Optional<com.reservation_system.model.User> userOptional20 = userRepository1.findByEmail("Coordinator2");
        com.reservation_system.model.Researcher researcher26 = new com.reservation_system.model.Researcher((int) (short) -1, "coord@yorku.ca", "data/test-users.csv", "coord2@yorku.ca", false);
        java.lang.String str27 = researcher26.getUserType();
        java.lang.String str28 = researcher26.getUserType();
        java.lang.String str29 = researcher26.getUserType();
        userRepository1.addUser((com.reservation_system.model.User) researcher26);
        boolean boolean31 = researcher26.requiresDepartmentApproval();
        org.junit.Assert.assertNotNull(userOptional3);
        org.junit.Assert.assertNotNull(userOptional5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(userList8);
        org.junit.Assert.assertNotNull(userOptional12);
        org.junit.Assert.assertNotNull(userOptional14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(userList17);
        org.junit.Assert.assertNotNull(userOptional20);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "Researcher" + "'", str27, "Researcher");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "Researcher" + "'", str28, "Researcher");
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "Researcher" + "'", str29, "Researcher");
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
    }

    @Test
    public void test0325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0325");
        com.reservation_system.model.Researcher researcher5 = new com.reservation_system.model.Researcher((int) (short) -1, "coord@yorku.ca", "data/test-users.csv", "coord2@yorku.ca", false);
        java.lang.String str6 = researcher5.getUserType();
        java.lang.String str7 = researcher5.getUserType();
        java.lang.String str8 = researcher5.getUserType();
        java.lang.String str9 = researcher5.getUserType();
        java.lang.String str10 = researcher5.getPassword();
        researcher5.setApproved(true);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Researcher" + "'", str6, "Researcher");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Researcher" + "'", str7, "Researcher");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Researcher" + "'", str8, "Researcher");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Researcher" + "'", str9, "Researcher");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "coord2@yorku.ca" + "'", str10, "coord2@yorku.ca");
    }

    @Test
    public void test0326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0326");
        com.reservation_system.model.Student student5 = new com.reservation_system.model.Student((int) (short) 0, "hi!", "Faculty", "Guest", true);
    }

    @Test
    public void test0327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0327");
        com.reservation_system.model.Researcher researcher5 = new com.reservation_system.model.Researcher((int) (short) -1, "coord@yorku.ca", "data/test-users.csv", "coord2@yorku.ca", false);
        java.lang.String str6 = researcher5.getUserType();
        java.lang.String str7 = researcher5.getUserType();
        int int8 = researcher5.getID();
        int int9 = researcher5.getID();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Researcher" + "'", str6, "Researcher");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Researcher" + "'", str7, "Researcher");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
    }

    @Test
    public void test0328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0328");
        // The following exception was thrown during execution in test generation
        try {
            com.reservation_system.model.User user6 = com.reservation_system.patterns.factory.UserFactory.createUser("data/test-users.csv", (int) (byte) 0, "coord2@yorku.ca", "Coordinator2", "data/test-users.csv", false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid user type: data/test-users.csv");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0329");
        com.reservation_system.model.Student student5 = new com.reservation_system.model.Student(10, "hi!", "Guest", "coord@yorku.ca", false);
        int int6 = student5.getID();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
    }

    @Test
    public void test0330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0330");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("data/test-users.csv");
        boolean boolean2 = userRepository1.headLabCoordinatorExists();
        java.util.List<com.reservation_system.model.User> userList3 = userRepository1.getAllUsers();
        boolean boolean4 = userRepository1.headLabCoordinatorExists();
        com.reservation_system.repository.UserRepository userRepository6 = new com.reservation_system.repository.UserRepository("data/test-users.csv");
        boolean boolean7 = userRepository6.headLabCoordinatorExists();
        java.util.List<com.reservation_system.model.User> userList8 = userRepository6.getAllUsers();
        int int9 = userRepository6.getNextID();
        com.reservation_system.model.Researcher researcher15 = new com.reservation_system.model.Researcher((int) (byte) 100, "", "Researcher", "labmanager", true);
        userRepository6.addUser((com.reservation_system.model.User) researcher15);
        java.util.List<com.reservation_system.model.User> userList17 = userRepository6.getAllUsers();
        userRepository1.saveAllUsers(userList17);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(userList3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(userList8);
// flaky "36) test0330(com.reservation_system.Randoop.CoordinatorService.RegressionTest0)":         org.junit.Assert.assertTrue("'" + int9 + "' != '" + 101 + "'", int9 == 101);
        org.junit.Assert.assertNotNull(userList17);
    }

    @Test
    public void test0331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0331");
        com.reservation_system.model.Guest guest5 = new com.reservation_system.model.Guest((int) (short) 100, "Guest", "labmanager", "data/test-users.csv", true);
        java.lang.String str6 = guest5.getUserType();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Guest" + "'", str6, "Guest");
    }

    @Test
    public void test0332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0332");
        com.reservation_system.model.User user6 = com.reservation_system.patterns.factory.UserFactory.createUser("Faculty", 10, "Student", "hi!", "", true);
        org.junit.Assert.assertNotNull(user6);
    }

    @Test
    public void test0333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0333");
        com.reservation_system.model.Student student5 = new com.reservation_system.model.Student((int) '#', "Coordinator", "Coordinator", "", false);
        boolean boolean6 = student5.requiresDepartmentApproval();
        java.lang.String str7 = student5.getPassword();
        java.lang.String str8 = student5.getEmail();
        java.lang.String str9 = student5.getUserType();
        student5.setApproved(true);
        java.lang.String str12 = student5.getName();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Coordinator" + "'", str8, "Coordinator");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Student" + "'", str9, "Student");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Coordinator" + "'", str12, "Coordinator");
    }

    @Test
    public void test0334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0334");
        com.reservation_system.model.Student student5 = new com.reservation_system.model.Student((int) (short) 1, "manager1@yorku.ca", "Faculty", "labmanager", true);
        java.lang.String str6 = student5.getEmail();
        java.lang.String str7 = student5.getPassword();
        java.lang.String str8 = student5.getEmail();
        java.lang.String str9 = student5.getPassword();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Faculty" + "'", str6, "Faculty");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "labmanager" + "'", str7, "labmanager");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Faculty" + "'", str8, "Faculty");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "labmanager" + "'", str9, "labmanager");
    }

    @Test
    public void test0335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0335");
        com.reservation_system.model.Faculty faculty5 = new com.reservation_system.model.Faculty((int) ' ', "Student", "Coordinator2", "data/test-users.csv", true);
        java.lang.String str6 = faculty5.getUserType();
        java.lang.String str7 = faculty5.getPassword();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Faculty" + "'", str6, "Faculty");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "data/test-users.csv" + "'", str7, "data/test-users.csv");
    }

    @Test
    public void test0336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0336");
        com.reservation_system.model.Student student5 = new com.reservation_system.model.Student((int) '#', "Coordinator", "Coordinator", "", false);
        boolean boolean6 = student5.requiresDepartmentApproval();
        java.lang.String str7 = student5.getPassword();
        java.lang.String str8 = student5.getPassword();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test0337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0337");
        com.reservation_system.model.Student student5 = new com.reservation_system.model.Student((int) (byte) 0, "Faculty", "data/test-users.csv", "", false);
        java.lang.String str6 = student5.getUserType();
        java.lang.Class<?> wildcardClass7 = student5.getClass();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Student" + "'", str6, "Student");
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0338");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("data/test-users.csv");
        java.util.Optional<com.reservation_system.model.User> userOptional3 = userRepository1.findByEmail("Faculty");
        java.util.Optional<com.reservation_system.model.User> userOptional5 = userRepository1.findByEmail("headlabcoordinator");
        com.reservation_system.model.Researcher researcher11 = new com.reservation_system.model.Researcher((int) '#', "Student", "coord2@yorku.ca", "labmanager", false);
        researcher11.setApproved(true);
        userRepository1.addUser((com.reservation_system.model.User) researcher11);
        java.lang.String str15 = researcher11.getUserType();
        org.junit.Assert.assertNotNull(userOptional3);
        org.junit.Assert.assertNotNull(userOptional5);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Researcher" + "'", str15, "Researcher");
    }

    @Test
    public void test0339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0339");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("data/test-users.csv");
        boolean boolean3 = userRepository1.emailExists("headlabcoordinator");
        com.reservation_system.services.CoordinatorAccountService coordinatorAccountService4 = new com.reservation_system.services.CoordinatorAccountService(userRepository1);
        com.reservation_system.services.CoordinatorAccountService coordinatorAccountService5 = new com.reservation_system.services.CoordinatorAccountService(userRepository1);
        com.reservation_system.services.CoordinatorAccountService coordinatorAccountService6 = new com.reservation_system.services.CoordinatorAccountService(userRepository1);
        // The following exception was thrown during execution in test generation
        try {
            com.reservation_system.model.User user10 = coordinatorAccountService6.createHeadLabCoordinator("headlabcoordinator", "manager1@yorku.ca", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Only one head lab coordinator account is allowed.");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
    }

    @Test
    public void test0340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0340");
        com.reservation_system.model.Student student5 = new com.reservation_system.model.Student((int) '#', "Coordinator", "Coordinator", "", false);
        boolean boolean6 = student5.requiresDepartmentApproval();
        java.lang.String str7 = student5.getPassword();
        java.lang.String str8 = student5.getUserType();
        java.lang.String str9 = student5.getUserType();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Student" + "'", str8, "Student");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Student" + "'", str9, "Student");
    }

    @Test
    public void test0341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0341");
        com.reservation_system.model.LabManager labManager5 = new com.reservation_system.model.LabManager(97, "data/test-users.csv", "Guest", "hi!", true);
    }

    @Test
    public void test0342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0342");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("data/test-users.csv");
        java.util.Optional<com.reservation_system.model.User> userOptional3 = userRepository1.findByEmail("Faculty");
        com.reservation_system.model.Student student9 = new com.reservation_system.model.Student((int) '#', "Coordinator", "Coordinator", "", false);
        boolean boolean10 = student9.isApproved();
        java.lang.String str11 = student9.getName();
        userRepository1.addUser((com.reservation_system.model.User) student9);
        int int13 = userRepository1.getNextID();
        java.util.Optional<com.reservation_system.model.User> userOptional15 = userRepository1.findByEmail("");
        com.reservation_system.services.CoordinatorAccountService coordinatorAccountService16 = new com.reservation_system.services.CoordinatorAccountService(userRepository1);
        com.reservation_system.model.LabManager labManager22 = new com.reservation_system.model.LabManager((int) (byte) 10, "headlabcoordinator", "Student", "", false);
        java.lang.String str23 = labManager22.getUserType();
        // The following exception was thrown during execution in test generation
        try {
            com.reservation_system.model.User user27 = coordinatorAccountService16.autoGenerateLabManagerAccount((com.reservation_system.model.User) labManager22, "coord2@yorku.ca", "data/test-users.csv", "Student");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Only the head lab coordinator can generate lab manager accounts.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(userOptional3);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Coordinator" + "'", str11, "Coordinator");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 101 + "'", int13 == 101);
        org.junit.Assert.assertNotNull(userOptional15);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "labmanager" + "'", str23, "labmanager");
    }

    @Test
    public void test0343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0343");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("data/test-users.csv");
        com.reservation_system.model.Faculty faculty7 = new com.reservation_system.model.Faculty((int) (byte) 1, "", "Guest", "Student", true);
        userRepository1.addUser((com.reservation_system.model.User) faculty7);
        boolean boolean9 = userRepository1.headLabCoordinatorExists();
        java.util.Optional<com.reservation_system.model.User> userOptional11 = userRepository1.findByEmail("Manager1");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(userOptional11);
    }

    @Test
    public void test0344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0344");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("data/test-users.csv");
        java.util.Optional<com.reservation_system.model.User> userOptional3 = userRepository1.findByEmail("Faculty");
        java.util.Optional<com.reservation_system.model.User> userOptional5 = userRepository1.findByEmail("headlabcoordinator");
        boolean boolean7 = userRepository1.emailExists("Manager1");
        java.util.List<com.reservation_system.model.User> userList8 = userRepository1.getAllUsers();
        boolean boolean10 = userRepository1.emailExists("");
        com.reservation_system.repository.UserRepository userRepository12 = new com.reservation_system.repository.UserRepository("data/test-users.csv");
        boolean boolean13 = userRepository12.headLabCoordinatorExists();
        boolean boolean14 = userRepository12.headLabCoordinatorExists();
        boolean boolean16 = userRepository12.emailExists("Manager1");
        java.util.Optional<com.reservation_system.model.User> userOptional18 = userRepository12.findByEmail("Strong1!");
        java.util.List<com.reservation_system.model.User> userList19 = userRepository12.getAllUsers();
        userRepository1.saveAllUsers(userList19);
        int int21 = userRepository1.getNextID();
        org.junit.Assert.assertNotNull(userOptional3);
        org.junit.Assert.assertNotNull(userOptional5);
// flaky "37) test0344(com.reservation_system.Randoop.CoordinatorService.RegressionTest0)":         org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(userList8);
// flaky "11) test0344(com.reservation_system.Randoop.CoordinatorService.RegressionTest0)":         org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
// flaky "4) test0344(com.reservation_system.Randoop.CoordinatorService.RegressionTest0)":         org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNotNull(userOptional18);
        org.junit.Assert.assertNotNull(userList19);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 101 + "'", int21 == 101);
    }

    @Test
    public void test0345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0345");
        com.reservation_system.model.LabManager labManager5 = new com.reservation_system.model.LabManager((int) (byte) 10, "headlabcoordinator", "Student", "", false);
        java.lang.String str6 = labManager5.getName();
        java.lang.String str7 = labManager5.getName();
        boolean boolean8 = labManager5.isApproved();
        int int9 = labManager5.getID();
        java.lang.String str10 = labManager5.getName();
        boolean boolean11 = labManager5.requiresDepartmentApproval();
        labManager5.setApproved(true);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "headlabcoordinator" + "'", str6, "headlabcoordinator");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "headlabcoordinator" + "'", str7, "headlabcoordinator");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10 + "'", int9 == 10);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "headlabcoordinator" + "'", str10, "headlabcoordinator");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test0346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0346");
        com.reservation_system.model.Guest guest5 = new com.reservation_system.model.Guest((int) (short) 1, "Coordinator", "headlabcoordinator", "hi!", false);
    }

    @Test
    public void test0347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0347");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("data/test-users.csv");
        boolean boolean3 = userRepository1.emailExists("headlabcoordinator");
        com.reservation_system.services.CoordinatorAccountService coordinatorAccountService4 = new com.reservation_system.services.CoordinatorAccountService(userRepository1);
        com.reservation_system.services.CoordinatorAccountService coordinatorAccountService5 = new com.reservation_system.services.CoordinatorAccountService(userRepository1);
        boolean boolean6 = userRepository1.headLabCoordinatorExists();
        com.reservation_system.model.LabManager labManager12 = new com.reservation_system.model.LabManager((int) '4', "manager1@yorku.ca", "Coordinator", "Coordinator", true);
        userRepository1.addUser((com.reservation_system.model.User) labManager12);
        com.reservation_system.repository.UserRepository userRepository15 = new com.reservation_system.repository.UserRepository("data/test-users.csv");
        com.reservation_system.model.LabManager labManager21 = new com.reservation_system.model.LabManager((int) (short) 0, "", "Faculty", "Student", true);
        java.lang.String str22 = labManager21.getUserType();
        java.lang.String str23 = labManager21.getPassword();
        userRepository15.addUser((com.reservation_system.model.User) labManager21);
        boolean boolean25 = userRepository15.headLabCoordinatorExists();
        com.reservation_system.model.Researcher researcher31 = new com.reservation_system.model.Researcher(0, "Student", "Faculty", "Faculty", false);
        userRepository15.addUser((com.reservation_system.model.User) researcher31);
        java.util.Optional<com.reservation_system.model.User> userOptional34 = userRepository15.findByEmail("data/test-users.csv");
        com.reservation_system.services.CoordinatorAccountService coordinatorAccountService35 = new com.reservation_system.services.CoordinatorAccountService(userRepository15);
        com.reservation_system.repository.UserRepository userRepository37 = new com.reservation_system.repository.UserRepository("data/test-users.csv");
        com.reservation_system.model.LabManager labManager43 = new com.reservation_system.model.LabManager((int) (short) 0, "", "Faculty", "Student", true);
        java.lang.String str44 = labManager43.getUserType();
        java.lang.String str45 = labManager43.getPassword();
        userRepository37.addUser((com.reservation_system.model.User) labManager43);
        boolean boolean47 = userRepository37.headLabCoordinatorExists();
        com.reservation_system.model.Researcher researcher53 = new com.reservation_system.model.Researcher(0, "Student", "Faculty", "Faculty", false);
        userRepository37.addUser((com.reservation_system.model.User) researcher53);
        java.util.Optional<com.reservation_system.model.User> userOptional56 = userRepository37.findByEmail("data/test-users.csv");
        int int57 = userRepository37.getNextID();
        java.util.List<com.reservation_system.model.User> userList58 = userRepository37.getAllUsers();
        userRepository15.saveAllUsers(userList58);
        userRepository1.saveAllUsers(userList58);
        java.util.Optional<com.reservation_system.model.User> userOptional62 = userRepository1.findByEmail("Strong1!");
        java.util.Optional<com.reservation_system.model.User> userOptional64 = userRepository1.findByEmail("labmanager");
        int int65 = userRepository1.getNextID();
        com.reservation_system.services.CoordinatorAccountService coordinatorAccountService66 = new com.reservation_system.services.CoordinatorAccountService(userRepository1);
        boolean boolean67 = userRepository1.headLabCoordinatorExists();
        java.lang.Class<?> wildcardClass68 = userRepository1.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "labmanager" + "'", str22, "labmanager");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "Student" + "'", str23, "Student");
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertNotNull(userOptional34);
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "labmanager" + "'", str44, "labmanager");
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + "Student" + "'", str45, "Student");
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + true + "'", boolean47 == true);
        org.junit.Assert.assertNotNull(userOptional56);
        org.junit.Assert.assertTrue("'" + int57 + "' != '" + 101 + "'", int57 == 101);
        org.junit.Assert.assertNotNull(userList58);
        org.junit.Assert.assertNotNull(userOptional62);
        org.junit.Assert.assertNotNull(userOptional64);
        org.junit.Assert.assertTrue("'" + int65 + "' != '" + 101 + "'", int65 == 101);
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + true + "'", boolean67 == true);
        org.junit.Assert.assertNotNull(wildcardClass68);
    }

    @Test
    public void test0348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0348");
        com.reservation_system.model.Student student5 = new com.reservation_system.model.Student((int) '#', "Coordinator", "Coordinator", "", false);
        boolean boolean6 = student5.requiresDepartmentApproval();
        java.lang.String str7 = student5.getPassword();
        boolean boolean8 = student5.isApproved();
        java.lang.String str9 = student5.getEmail();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Coordinator" + "'", str9, "Coordinator");
    }

    @Test
    public void test0349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0349");
        com.reservation_system.model.Faculty faculty5 = new com.reservation_system.model.Faculty(10, "Researcher", "", "coord2@yorku.ca", true);
        faculty5.setApproved(true);
    }

    @Test
    public void test0350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0350");
        com.reservation_system.model.Guest guest5 = new com.reservation_system.model.Guest(98, "", "Faculty", "manager1@yorku.ca", false);
    }

    @Test
    public void test0351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0351");
        com.reservation_system.model.Guest guest5 = new com.reservation_system.model.Guest(97, "headlabcoordinator", "Researcher", "Strong1!", false);
    }

    @Test
    public void test0352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0352");
        com.reservation_system.model.Guest guest5 = new com.reservation_system.model.Guest((int) (short) 0, "Manager1", "Coordinator2", "", true);
        java.lang.String str6 = guest5.getPassword();
        guest5.setApproved(false);
        guest5.setApproved(false);
        java.lang.String str11 = guest5.getUserType();
        java.lang.Class<?> wildcardClass12 = guest5.getClass();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Guest" + "'", str11, "Guest");
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0353");
        // The following exception was thrown during execution in test generation
        try {
            com.reservation_system.model.User user6 = com.reservation_system.patterns.factory.UserFactory.createUser("Manager1", (int) 'a', "coord2@yorku.ca", "coord2@yorku.ca", "Faculty", false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid user type: Manager1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0354");
        com.reservation_system.model.Student student5 = new com.reservation_system.model.Student((int) (short) 1, "manager1@yorku.ca", "headlabcoordinator", "Strong1!", false);
    }

    @Test
    public void test0355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0355");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("data/test-users.csv");
        java.util.Optional<com.reservation_system.model.User> userOptional3 = userRepository1.findByEmail("Faculty");
        boolean boolean5 = userRepository1.emailExists("");
        java.util.Optional<com.reservation_system.model.User> userOptional7 = userRepository1.findByEmail("data/test-users.csv");
        java.util.List<com.reservation_system.model.User> userList8 = userRepository1.getAllUsers();
        com.reservation_system.services.CoordinatorAccountService coordinatorAccountService9 = new com.reservation_system.services.CoordinatorAccountService(userRepository1);
        // The following exception was thrown during execution in test generation
        try {
            com.reservation_system.model.User user13 = coordinatorAccountService9.createHeadLabCoordinator("headlabcoordinator", "Researcher", "Manager1");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Only one head lab coordinator account is allowed.");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(userOptional3);
// flaky "38) test0355(com.reservation_system.Randoop.CoordinatorService.RegressionTest0)":         org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(userOptional7);
        org.junit.Assert.assertNotNull(userList8);
    }

    @Test
    public void test0356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0356");
        com.reservation_system.model.LabManager labManager5 = new com.reservation_system.model.LabManager(0, "Coordinator2", "coord2@yorku.ca", "", false);
        java.lang.String str6 = labManager5.getUserType();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "labmanager" + "'", str6, "labmanager");
    }

    @Test
    public void test0357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0357");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("data/test-users.csv");
        boolean boolean2 = userRepository1.headLabCoordinatorExists();
        com.reservation_system.services.CoordinatorAccountService coordinatorAccountService3 = new com.reservation_system.services.CoordinatorAccountService(userRepository1);
        java.util.List<com.reservation_system.model.User> userList4 = userRepository1.getAllUsers();
        com.reservation_system.services.CoordinatorAccountService coordinatorAccountService5 = new com.reservation_system.services.CoordinatorAccountService(userRepository1);
        boolean boolean6 = userRepository1.headLabCoordinatorExists();
        java.lang.Class<?> wildcardClass7 = userRepository1.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(userList4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0358");
        com.reservation_system.model.LabManager labManager5 = new com.reservation_system.model.LabManager(35, "coord@yorku.ca", "", "Student", false);
        java.lang.String str6 = labManager5.getPassword();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Student" + "'", str6, "Student");
    }

    @Test
    public void test0359() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0359");
        com.reservation_system.model.User user6 = com.reservation_system.patterns.factory.UserFactory.createUser("Guest", (int) (byte) 1, "Student", "", "manager1@yorku.ca", true);
        org.junit.Assert.assertNotNull(user6);
    }

    @Test
    public void test0360() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0360");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("data/test-users.csv");
        com.reservation_system.model.LabManager labManager7 = new com.reservation_system.model.LabManager((int) (short) 0, "", "Faculty", "Student", true);
        java.lang.String str8 = labManager7.getUserType();
        java.lang.String str9 = labManager7.getPassword();
        userRepository1.addUser((com.reservation_system.model.User) labManager7);
        boolean boolean11 = userRepository1.headLabCoordinatorExists();
        com.reservation_system.model.Researcher researcher17 = new com.reservation_system.model.Researcher(0, "Student", "Faculty", "Faculty", false);
        userRepository1.addUser((com.reservation_system.model.User) researcher17);
        com.reservation_system.services.CoordinatorAccountService coordinatorAccountService19 = new com.reservation_system.services.CoordinatorAccountService(userRepository1);
        com.reservation_system.model.LabManager labManager25 = new com.reservation_system.model.LabManager(98, "labmanager", "Researcher", "coord2@yorku.ca", false);
        java.lang.String str26 = labManager25.getUserType();
        // The following exception was thrown during execution in test generation
        try {
            com.reservation_system.model.User user30 = coordinatorAccountService19.autoGenerateLabManagerAccount((com.reservation_system.model.User) labManager25, "Coordinator", "Researcher", "Researcher");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Only the head lab coordinator can generate lab manager accounts.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "labmanager" + "'", str8, "labmanager");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Student" + "'", str9, "Student");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "labmanager" + "'", str26, "labmanager");
    }

    @Test
    public void test0361() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0361");
        com.reservation_system.model.LabManager labManager5 = new com.reservation_system.model.LabManager((int) (byte) -1, "", "Guest", "Coordinator", true);
        java.lang.String str6 = labManager5.getUserType();
        java.lang.Class<?> wildcardClass7 = labManager5.getClass();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "labmanager" + "'", str6, "labmanager");
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0362() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0362");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("data/test-users.csv");
        java.util.Optional<com.reservation_system.model.User> userOptional3 = userRepository1.findByEmail("Faculty");
        java.util.Optional<com.reservation_system.model.User> userOptional5 = userRepository1.findByEmail("headlabcoordinator");
        com.reservation_system.model.Researcher researcher11 = new com.reservation_system.model.Researcher((int) '#', "Student", "coord2@yorku.ca", "labmanager", false);
        researcher11.setApproved(true);
        userRepository1.addUser((com.reservation_system.model.User) researcher11);
        com.reservation_system.services.CoordinatorAccountService coordinatorAccountService15 = new com.reservation_system.services.CoordinatorAccountService(userRepository1);
        java.util.List<com.reservation_system.model.User> userList16 = null;
        // The following exception was thrown during execution in test generation
        try {
            userRepository1.saveAllUsers(userList16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.List.iterator()\" because \"users\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(userOptional3);
        org.junit.Assert.assertNotNull(userOptional5);
    }

    @Test
    public void test0363() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0363");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("data/test-users.csv");
        java.util.Optional<com.reservation_system.model.User> userOptional3 = userRepository1.findByEmail("Faculty");
        java.util.Optional<com.reservation_system.model.User> userOptional5 = userRepository1.findByEmail("headlabcoordinator");
        java.util.List<com.reservation_system.model.User> userList6 = userRepository1.getAllUsers();
        int int7 = userRepository1.getNextID();
        java.util.List<com.reservation_system.model.User> userList8 = userRepository1.getAllUsers();
        com.reservation_system.services.CoordinatorAccountService coordinatorAccountService9 = new com.reservation_system.services.CoordinatorAccountService(userRepository1);
        com.reservation_system.model.User user13 = coordinatorAccountService9.createHeadLabCoordinator("manager1@yorku.ca", "Coordinator2", "manager1@yorku.ca");
        org.junit.Assert.assertNotNull(userOptional3);
        org.junit.Assert.assertNotNull(userOptional5);
        org.junit.Assert.assertNotNull(userList6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertNotNull(userList8);
        org.junit.Assert.assertNotNull(user13);
    }

    @Test
    public void test0364() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0364");
        com.reservation_system.model.Guest guest5 = new com.reservation_system.model.Guest((int) (short) 0, "Manager1", "Coordinator2", "", true);
        int int6 = guest5.getID();
        java.lang.String str7 = guest5.getName();
        java.lang.String str8 = guest5.getEmail();
        java.lang.String str9 = guest5.getPassword();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Manager1" + "'", str7, "Manager1");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Coordinator2" + "'", str8, "Coordinator2");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test0365() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0365");
        com.reservation_system.model.Student student5 = new com.reservation_system.model.Student((int) (short) 1, "manager1@yorku.ca", "Faculty", "labmanager", true);
        java.lang.String str6 = student5.getEmail();
        java.lang.String str7 = student5.getName();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Faculty" + "'", str6, "Faculty");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "manager1@yorku.ca" + "'", str7, "manager1@yorku.ca");
    }

    @Test
    public void test0366() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0366");
        com.reservation_system.model.Guest guest5 = new com.reservation_system.model.Guest((int) (byte) -1, "Student", "Researcher", "Strong1!", false);
        java.lang.String str6 = guest5.getUserType();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Guest" + "'", str6, "Guest");
    }

    @Test
    public void test0367() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0367");
        com.reservation_system.model.Student student5 = new com.reservation_system.model.Student((int) '#', "Coordinator", "Coordinator", "", false);
        boolean boolean6 = student5.requiresDepartmentApproval();
        boolean boolean7 = student5.requiresDepartmentApproval();
        student5.setApproved(true);
        java.lang.String str10 = student5.getName();
        java.lang.String str11 = student5.getUserType();
        java.lang.String str12 = student5.getUserType();
        boolean boolean13 = student5.isApproved();
        boolean boolean14 = student5.requiresDepartmentApproval();
        java.lang.String str15 = student5.getUserType();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Coordinator" + "'", str10, "Coordinator");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Student" + "'", str11, "Student");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Student" + "'", str12, "Student");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Student" + "'", str15, "Student");
    }

    @Test
    public void test0368() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0368");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("data/test-users.csv");
        boolean boolean3 = userRepository1.emailExists("data/test-users.csv");
        boolean boolean5 = userRepository1.emailExists("");
        com.reservation_system.model.Faculty faculty11 = new com.reservation_system.model.Faculty((int) (byte) 1, "", "Guest", "Student", true);
        java.lang.String str12 = faculty11.getUserType();
        java.lang.String str13 = faculty11.getUserType();
        userRepository1.addUser((com.reservation_system.model.User) faculty11);
        java.lang.String str15 = faculty11.getUserType();
        int int16 = faculty11.getID();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Faculty" + "'", str12, "Faculty");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Faculty" + "'", str13, "Faculty");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Faculty" + "'", str15, "Faculty");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
    }

    @Test
    public void test0369() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0369");
        com.reservation_system.model.HeadLabCoordinator headLabCoordinator5 = new com.reservation_system.model.HeadLabCoordinator((int) (byte) 10, "headlabcoordinator", "Student", "headlabcoordinator", true);
    }

    @Test
    public void test0370() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0370");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("data/test-users.csv");
        com.reservation_system.model.LabManager labManager7 = new com.reservation_system.model.LabManager((int) (short) 0, "", "Faculty", "Student", true);
        java.lang.String str8 = labManager7.getUserType();
        java.lang.String str9 = labManager7.getPassword();
        userRepository1.addUser((com.reservation_system.model.User) labManager7);
        boolean boolean11 = userRepository1.headLabCoordinatorExists();
        com.reservation_system.model.Researcher researcher17 = new com.reservation_system.model.Researcher(0, "Student", "Faculty", "Faculty", false);
        userRepository1.addUser((com.reservation_system.model.User) researcher17);
        int int19 = researcher17.getID();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "labmanager" + "'", str8, "labmanager");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Student" + "'", str9, "Student");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
    }

    @Test
    public void test0371() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0371");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("data/test-users.csv");
        java.util.Optional<com.reservation_system.model.User> userOptional3 = userRepository1.findByEmail("Faculty");
        java.util.Optional<com.reservation_system.model.User> userOptional5 = userRepository1.findByEmail("headlabcoordinator");
        boolean boolean7 = userRepository1.emailExists("Manager1");
        boolean boolean8 = userRepository1.headLabCoordinatorExists();
        java.util.Optional<com.reservation_system.model.User> userOptional10 = userRepository1.findByEmail("Coordinator");
        java.util.List<com.reservation_system.model.User> userList11 = userRepository1.getAllUsers();
        java.util.Optional<com.reservation_system.model.User> userOptional13 = userRepository1.findByEmail("Strong1!");
        java.lang.Class<?> wildcardClass14 = userRepository1.getClass();
        org.junit.Assert.assertNotNull(userOptional3);
        org.junit.Assert.assertNotNull(userOptional5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(userOptional10);
        org.junit.Assert.assertNotNull(userList11);
        org.junit.Assert.assertNotNull(userOptional13);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test0372() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0372");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("data/test-users.csv");
        com.reservation_system.model.LabManager labManager7 = new com.reservation_system.model.LabManager((int) (short) 0, "", "Faculty", "Student", true);
        java.lang.String str8 = labManager7.getUserType();
        java.lang.String str9 = labManager7.getPassword();
        userRepository1.addUser((com.reservation_system.model.User) labManager7);
        boolean boolean11 = userRepository1.headLabCoordinatorExists();
        boolean boolean13 = userRepository1.emailExists("Coordinator");
        java.util.List<com.reservation_system.model.User> userList14 = userRepository1.getAllUsers();
        java.util.Optional<com.reservation_system.model.User> userOptional16 = userRepository1.findByEmail("Student");
        com.reservation_system.repository.UserRepository userRepository18 = new com.reservation_system.repository.UserRepository("data/test-users.csv");
        java.util.Optional<com.reservation_system.model.User> userOptional20 = userRepository18.findByEmail("Faculty");
        java.util.Optional<com.reservation_system.model.User> userOptional22 = userRepository18.findByEmail("headlabcoordinator");
        boolean boolean24 = userRepository18.emailExists("Manager1");
        java.util.List<com.reservation_system.model.User> userList25 = userRepository18.getAllUsers();
        userRepository1.saveAllUsers(userList25);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "labmanager" + "'", str8, "labmanager");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Student" + "'", str9, "Student");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
// flaky "39) test0372(com.reservation_system.Randoop.CoordinatorService.RegressionTest0)":         org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(userList14);
        org.junit.Assert.assertNotNull(userOptional16);
        org.junit.Assert.assertNotNull(userOptional20);
        org.junit.Assert.assertNotNull(userOptional22);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(userList25);
    }

    @Test
    public void test0373() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0373");
        com.reservation_system.model.Guest guest5 = new com.reservation_system.model.Guest((int) (byte) 0, "Strong1!", "manager1@yorku.ca", "hi!", true);
    }

    @Test
    public void test0374() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0374");
        com.reservation_system.model.User user6 = com.reservation_system.patterns.factory.UserFactory.createUser("Guest", (int) (short) 10, "headlabcoordinator", "Coordinator", "Guest", false);
        user6.setApproved(false);
        org.junit.Assert.assertNotNull(user6);
    }

    @Test
    public void test0375() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0375");
        com.reservation_system.model.Student student5 = new com.reservation_system.model.Student((int) '#', "Coordinator", "Coordinator", "", false);
        boolean boolean6 = student5.requiresDepartmentApproval();
        boolean boolean7 = student5.requiresDepartmentApproval();
        student5.setApproved(true);
        java.lang.String str10 = student5.getName();
        java.lang.String str11 = student5.getUserType();
        java.lang.Class<?> wildcardClass12 = student5.getClass();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Coordinator" + "'", str10, "Coordinator");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Student" + "'", str11, "Student");
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0376() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0376");
        com.reservation_system.model.Researcher researcher5 = new com.reservation_system.model.Researcher((int) (byte) 10, "labmanager", "Strong1!", "Guest", false);
    }

    @Test
    public void test0377() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0377");
        com.reservation_system.model.Faculty faculty5 = new com.reservation_system.model.Faculty((int) (byte) 10, "Guest", "manager1@yorku.ca", "Guest", false);
        java.lang.String str6 = faculty5.getUserType();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Faculty" + "'", str6, "Faculty");
    }

    @Test
    public void test0378() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0378");
        com.reservation_system.model.HeadLabCoordinator headLabCoordinator5 = new com.reservation_system.model.HeadLabCoordinator(97, "coord2@yorku.ca", "data/test-users.csv", "Manager1", false);
    }

    @Test
    public void test0379() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0379");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("data/test-users.csv");
        java.util.Optional<com.reservation_system.model.User> userOptional3 = userRepository1.findByEmail("Faculty");
        java.util.Optional<com.reservation_system.model.User> userOptional5 = userRepository1.findByEmail("headlabcoordinator");
        boolean boolean7 = userRepository1.emailExists("Manager1");
        java.util.List<com.reservation_system.model.User> userList8 = userRepository1.getAllUsers();
        boolean boolean10 = userRepository1.emailExists("");
        com.reservation_system.model.LabManager labManager16 = new com.reservation_system.model.LabManager((int) (short) 0, "", "Faculty", "Student", true);
        java.lang.String str17 = labManager16.getEmail();
        java.lang.String str18 = labManager16.getUserType();
        userRepository1.addUser((com.reservation_system.model.User) labManager16);
        boolean boolean21 = userRepository1.emailExists("labmanager");
        java.util.List<com.reservation_system.model.User> userList22 = userRepository1.getAllUsers();
        com.reservation_system.services.CoordinatorAccountService coordinatorAccountService23 = new com.reservation_system.services.CoordinatorAccountService(userRepository1);
        // The following exception was thrown during execution in test generation
        try {
            com.reservation_system.model.User user27 = coordinatorAccountService23.createHeadLabCoordinator("", "Coordinator", "Guest");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Name is required.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(userOptional3);
        org.junit.Assert.assertNotNull(userOptional5);
// flaky "40) test0379(com.reservation_system.Randoop.CoordinatorService.RegressionTest0)":         org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(userList8);
// flaky "12) test0379(com.reservation_system.Randoop.CoordinatorService.RegressionTest0)":         org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "Faculty" + "'", str17, "Faculty");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "labmanager" + "'", str18, "labmanager");
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(userList22);
    }

    @Test
    public void test0380() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0380");
        com.reservation_system.model.Faculty faculty5 = new com.reservation_system.model.Faculty((int) '4', "Manager1", "headlabcoordinator", "Coordinator", true);
    }

    @Test
    public void test0381() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0381");
        // The following exception was thrown during execution in test generation
        try {
            com.reservation_system.model.User user6 = com.reservation_system.patterns.factory.UserFactory.createUser("Manager1", (int) (byte) 10, "Strong1!", "data/test-users.csv", "coord2@yorku.ca", false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid user type: Manager1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0382() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0382");
        com.reservation_system.model.HeadLabCoordinator headLabCoordinator5 = new com.reservation_system.model.HeadLabCoordinator((int) (byte) 1, "headlabcoordinator", "Coordinator2", "coord@yorku.ca", true);
    }

    @Test
    public void test0383() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0383");
        com.reservation_system.model.User user6 = com.reservation_system.patterns.factory.UserFactory.createUser("Guest", (int) (short) 0, "Coordinator2", "Guest", "data/test-users.csv", true);
        org.junit.Assert.assertNotNull(user6);
    }

    @Test
    public void test0384() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0384");
        com.reservation_system.model.HeadLabCoordinator headLabCoordinator5 = new com.reservation_system.model.HeadLabCoordinator((int) (short) 10, "", "", "labmanager", false);
        headLabCoordinator5.setApproved(true);
        java.lang.String str8 = headLabCoordinator5.getUserType();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "headlabcoordinator" + "'", str8, "headlabcoordinator");
    }

    @Test
    public void test0385() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0385");
        com.reservation_system.model.Faculty faculty5 = new com.reservation_system.model.Faculty(100, "labmanager", "hi!", "data/test-users.csv", false);
    }

    @Test
    public void test0386() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0386");
        com.reservation_system.model.HeadLabCoordinator headLabCoordinator5 = new com.reservation_system.model.HeadLabCoordinator(52, "Researcher", "Faculty", "Student", false);
    }

    @Test
    public void test0387() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0387");
        com.reservation_system.model.LabManager labManager5 = new com.reservation_system.model.LabManager((int) 'a', "Manager1", "hi!", "Coordinator2", false);
        java.lang.String str6 = labManager5.getUserType();
        boolean boolean7 = labManager5.requiresDepartmentApproval();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "labmanager" + "'", str6, "labmanager");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test0388() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0388");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("data/test-users.csv");
        java.util.Optional<com.reservation_system.model.User> userOptional3 = userRepository1.findByEmail("Faculty");
        java.util.Optional<com.reservation_system.model.User> userOptional5 = userRepository1.findByEmail("headlabcoordinator");
        boolean boolean7 = userRepository1.emailExists("Manager1");
        java.util.List<com.reservation_system.model.User> userList8 = userRepository1.getAllUsers();
        boolean boolean10 = userRepository1.emailExists("");
        com.reservation_system.model.LabManager labManager16 = new com.reservation_system.model.LabManager((int) (short) 0, "", "Faculty", "Student", true);
        java.lang.String str17 = labManager16.getEmail();
        java.lang.String str18 = labManager16.getUserType();
        userRepository1.addUser((com.reservation_system.model.User) labManager16);
        boolean boolean20 = userRepository1.headLabCoordinatorExists();
        com.reservation_system.model.Student student26 = new com.reservation_system.model.Student((int) (short) 0, "coord@yorku.ca", "headlabcoordinator", "Strong1!", true);
        java.lang.String str27 = student26.getPassword();
        userRepository1.addUser((com.reservation_system.model.User) student26);
        java.util.List<com.reservation_system.model.User> userList29 = userRepository1.getAllUsers();
        org.junit.Assert.assertNotNull(userOptional3);
        org.junit.Assert.assertNotNull(userOptional5);
// flaky "41) test0388(com.reservation_system.Randoop.CoordinatorService.RegressionTest0)":         org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(userList8);
// flaky "13) test0388(com.reservation_system.Randoop.CoordinatorService.RegressionTest0)":         org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "Faculty" + "'", str17, "Faculty");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "labmanager" + "'", str18, "labmanager");
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "Strong1!" + "'", str27, "Strong1!");
        org.junit.Assert.assertNotNull(userList29);
    }

    @Test
    public void test0389() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0389");
        com.reservation_system.model.Faculty faculty5 = new com.reservation_system.model.Faculty((int) 'a', "Strong1!", "headlabcoordinator", "manager1@yorku.ca", false);
        java.lang.String str6 = faculty5.getUserType();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Faculty" + "'", str6, "Faculty");
    }

    @Test
    public void test0390() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0390");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("data/test-users.csv");
        java.util.Optional<com.reservation_system.model.User> userOptional3 = userRepository1.findByEmail("Faculty");
        java.util.Optional<com.reservation_system.model.User> userOptional5 = userRepository1.findByEmail("headlabcoordinator");
        boolean boolean7 = userRepository1.emailExists("Manager1");
        java.util.List<com.reservation_system.model.User> userList8 = userRepository1.getAllUsers();
        boolean boolean10 = userRepository1.emailExists("");
        com.reservation_system.model.LabManager labManager16 = new com.reservation_system.model.LabManager((int) (short) 0, "", "Faculty", "Student", true);
        java.lang.String str17 = labManager16.getEmail();
        java.lang.String str18 = labManager16.getUserType();
        userRepository1.addUser((com.reservation_system.model.User) labManager16);
        boolean boolean21 = userRepository1.emailExists("labmanager");
        java.util.List<com.reservation_system.model.User> userList22 = userRepository1.getAllUsers();
        com.reservation_system.repository.UserRepository userRepository24 = new com.reservation_system.repository.UserRepository("data/test-users.csv");
        boolean boolean26 = userRepository24.emailExists("data/test-users.csv");
        boolean boolean28 = userRepository24.emailExists("");
        com.reservation_system.repository.UserRepository userRepository30 = new com.reservation_system.repository.UserRepository("data/test-users.csv");
        com.reservation_system.model.LabManager labManager36 = new com.reservation_system.model.LabManager((int) (short) 0, "", "Faculty", "Student", true);
        java.lang.String str37 = labManager36.getUserType();
        java.lang.String str38 = labManager36.getPassword();
        userRepository30.addUser((com.reservation_system.model.User) labManager36);
        boolean boolean40 = userRepository30.headLabCoordinatorExists();
        com.reservation_system.model.Researcher researcher46 = new com.reservation_system.model.Researcher(0, "Student", "Faculty", "Faculty", false);
        userRepository30.addUser((com.reservation_system.model.User) researcher46);
        java.util.Optional<com.reservation_system.model.User> userOptional49 = userRepository30.findByEmail("data/test-users.csv");
        int int50 = userRepository30.getNextID();
        java.util.List<com.reservation_system.model.User> userList51 = userRepository30.getAllUsers();
        userRepository24.saveAllUsers(userList51);
        userRepository1.saveAllUsers(userList51);
        java.util.List<com.reservation_system.model.User> userList54 = userRepository1.getAllUsers();
        java.lang.Class<?> wildcardClass55 = userList54.getClass();
        org.junit.Assert.assertNotNull(userOptional3);
        org.junit.Assert.assertNotNull(userOptional5);
// flaky "42) test0390(com.reservation_system.Randoop.CoordinatorService.RegressionTest0)":         org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(userList8);
// flaky "14) test0390(com.reservation_system.Randoop.CoordinatorService.RegressionTest0)":         org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "Faculty" + "'", str17, "Faculty");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "labmanager" + "'", str18, "labmanager");
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(userList22);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
// flaky "5) test0390(com.reservation_system.Randoop.CoordinatorService.RegressionTest0)":         org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "labmanager" + "'", str37, "labmanager");
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "Student" + "'", str38, "Student");
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + true + "'", boolean40 == true);
        org.junit.Assert.assertNotNull(userOptional49);
// flaky "3) test0390(com.reservation_system.Randoop.CoordinatorService.RegressionTest0)":         org.junit.Assert.assertTrue("'" + int50 + "' != '" + 101 + "'", int50 == 101);
        org.junit.Assert.assertNotNull(userList51);
        org.junit.Assert.assertNotNull(userList54);
        org.junit.Assert.assertNotNull(wildcardClass55);
    }

    @Test
    public void test0391() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0391");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("data/test-users.csv");
        boolean boolean3 = userRepository1.emailExists("headlabcoordinator");
        com.reservation_system.services.CoordinatorAccountService coordinatorAccountService4 = new com.reservation_system.services.CoordinatorAccountService(userRepository1);
        com.reservation_system.services.CoordinatorAccountService coordinatorAccountService5 = new com.reservation_system.services.CoordinatorAccountService(userRepository1);
        int int6 = userRepository1.getNextID();
        com.reservation_system.services.CoordinatorAccountService coordinatorAccountService7 = new com.reservation_system.services.CoordinatorAccountService(userRepository1);
        // The following exception was thrown during execution in test generation
        try {
            com.reservation_system.model.User user11 = coordinatorAccountService7.createHeadLabCoordinator("data/test-users.csv", "Strong1!", "labmanager");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Only one head lab coordinator account is allowed.");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
// flaky "43) test0391(com.reservation_system.Randoop.CoordinatorService.RegressionTest0)":         org.junit.Assert.assertTrue("'" + int6 + "' != '" + 101 + "'", int6 == 101);
    }

    @Test
    public void test0392() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0392");
        com.reservation_system.model.Faculty faculty5 = new com.reservation_system.model.Faculty((int) (byte) -1, "headlabcoordinator", "Coordinator", "Strong1!", false);
        java.lang.String str6 = faculty5.getName();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "headlabcoordinator" + "'", str6, "headlabcoordinator");
    }

    @Test
    public void test0393() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0393");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("data/test-users.csv");
        com.reservation_system.model.LabManager labManager7 = new com.reservation_system.model.LabManager((int) (short) 0, "", "Faculty", "Student", true);
        java.lang.String str8 = labManager7.getUserType();
        java.lang.String str9 = labManager7.getPassword();
        userRepository1.addUser((com.reservation_system.model.User) labManager7);
        boolean boolean11 = userRepository1.headLabCoordinatorExists();
        com.reservation_system.model.Researcher researcher17 = new com.reservation_system.model.Researcher(0, "Student", "Faculty", "Faculty", false);
        userRepository1.addUser((com.reservation_system.model.User) researcher17);
        com.reservation_system.services.CoordinatorAccountService coordinatorAccountService19 = new com.reservation_system.services.CoordinatorAccountService(userRepository1);
        com.reservation_system.model.Guest guest25 = new com.reservation_system.model.Guest(0, "Guest", "headlabcoordinator", "Faculty", false);
        userRepository1.addUser((com.reservation_system.model.User) guest25);
        com.reservation_system.repository.UserRepository userRepository28 = new com.reservation_system.repository.UserRepository("data/test-users.csv");
        boolean boolean29 = userRepository28.headLabCoordinatorExists();
        boolean boolean30 = userRepository28.headLabCoordinatorExists();
        java.util.Optional<com.reservation_system.model.User> userOptional32 = userRepository28.findByEmail("");
        com.reservation_system.services.CoordinatorAccountService coordinatorAccountService33 = new com.reservation_system.services.CoordinatorAccountService(userRepository28);
        com.reservation_system.repository.UserRepository userRepository35 = new com.reservation_system.repository.UserRepository("data/test-users.csv");
        java.util.Optional<com.reservation_system.model.User> userOptional37 = userRepository35.findByEmail("Faculty");
        java.util.Optional<com.reservation_system.model.User> userOptional39 = userRepository35.findByEmail("headlabcoordinator");
        java.util.List<com.reservation_system.model.User> userList40 = userRepository35.getAllUsers();
        int int41 = userRepository35.getNextID();
        java.util.List<com.reservation_system.model.User> userList42 = userRepository35.getAllUsers();
        userRepository28.saveAllUsers(userList42);
        userRepository1.saveAllUsers(userList42);
        java.util.List<com.reservation_system.model.User> userList45 = userRepository1.getAllUsers();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "labmanager" + "'", str8, "labmanager");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Student" + "'", str9, "Student");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertNotNull(userOptional32);
        org.junit.Assert.assertNotNull(userOptional37);
        org.junit.Assert.assertNotNull(userOptional39);
        org.junit.Assert.assertNotNull(userList40);
// flaky "44) test0393(com.reservation_system.Randoop.CoordinatorService.RegressionTest0)":         org.junit.Assert.assertTrue("'" + int41 + "' != '" + 101 + "'", int41 == 101);
        org.junit.Assert.assertNotNull(userList42);
        org.junit.Assert.assertNotNull(userList45);
    }

    @Test
    public void test0394() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0394");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("data/test-users.csv");
        boolean boolean2 = userRepository1.headLabCoordinatorExists();
        com.reservation_system.services.CoordinatorAccountService coordinatorAccountService3 = new com.reservation_system.services.CoordinatorAccountService(userRepository1);
        java.util.List<com.reservation_system.model.User> userList4 = userRepository1.getAllUsers();
        java.util.Optional<com.reservation_system.model.User> userOptional6 = userRepository1.findByEmail("");
        boolean boolean8 = userRepository1.emailExists("");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(userList4);
        org.junit.Assert.assertNotNull(userOptional6);
// flaky "45) test0394(com.reservation_system.Randoop.CoordinatorService.RegressionTest0)":         org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test0395() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0395");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("data/test-users.csv");
        com.reservation_system.model.LabManager labManager7 = new com.reservation_system.model.LabManager((int) (short) 0, "", "Faculty", "Student", true);
        java.lang.String str8 = labManager7.getUserType();
        java.lang.String str9 = labManager7.getPassword();
        userRepository1.addUser((com.reservation_system.model.User) labManager7);
        boolean boolean11 = userRepository1.headLabCoordinatorExists();
        com.reservation_system.model.Researcher researcher17 = new com.reservation_system.model.Researcher(0, "Student", "Faculty", "Faculty", false);
        userRepository1.addUser((com.reservation_system.model.User) researcher17);
        com.reservation_system.services.CoordinatorAccountService coordinatorAccountService19 = new com.reservation_system.services.CoordinatorAccountService(userRepository1);
        com.reservation_system.model.Guest guest25 = new com.reservation_system.model.Guest(0, "Guest", "headlabcoordinator", "Faculty", false);
        userRepository1.addUser((com.reservation_system.model.User) guest25);
        java.util.List<com.reservation_system.model.User> userList27 = userRepository1.getAllUsers();
        com.reservation_system.model.Researcher researcher33 = new com.reservation_system.model.Researcher((int) (short) -1, "labmanager", "coord2@yorku.ca", "Strong1!", false);
        userRepository1.addUser((com.reservation_system.model.User) researcher33);
        com.reservation_system.model.Researcher researcher40 = new com.reservation_system.model.Researcher((int) (short) -1, "Manager1", "headlabcoordinator", "coord@yorku.ca", true);
        userRepository1.addUser((com.reservation_system.model.User) researcher40);
        boolean boolean42 = userRepository1.headLabCoordinatorExists();
        int int43 = userRepository1.getNextID();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "labmanager" + "'", str8, "labmanager");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Student" + "'", str9, "Student");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(userList27);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + true + "'", boolean42 == true);
// flaky "46) test0395(com.reservation_system.Randoop.CoordinatorService.RegressionTest0)":         org.junit.Assert.assertTrue("'" + int43 + "' != '" + 101 + "'", int43 == 101);
    }

    @Test
    public void test0396() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0396");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("data/test-users.csv");
        com.reservation_system.model.LabManager labManager7 = new com.reservation_system.model.LabManager((int) (short) 0, "", "Faculty", "Student", true);
        java.lang.String str8 = labManager7.getUserType();
        java.lang.String str9 = labManager7.getPassword();
        userRepository1.addUser((com.reservation_system.model.User) labManager7);
        boolean boolean11 = userRepository1.headLabCoordinatorExists();
        com.reservation_system.model.Researcher researcher17 = new com.reservation_system.model.Researcher(0, "Student", "Faculty", "Faculty", false);
        userRepository1.addUser((com.reservation_system.model.User) researcher17);
        com.reservation_system.services.CoordinatorAccountService coordinatorAccountService19 = new com.reservation_system.services.CoordinatorAccountService(userRepository1);
        com.reservation_system.model.Faculty faculty25 = new com.reservation_system.model.Faculty((int) ' ', "", "coord@yorku.ca", "Researcher", false);
        int int26 = faculty25.getID();
        // The following exception was thrown during execution in test generation
        try {
            com.reservation_system.model.User user30 = coordinatorAccountService19.autoGenerateLabManagerAccount((com.reservation_system.model.User) faculty25, "", "Guest", "Manager1");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Name is required.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "labmanager" + "'", str8, "labmanager");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Student" + "'", str9, "Student");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 32 + "'", int26 == 32);
    }

    @Test
    public void test0397() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0397");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("data/test-users.csv");
        boolean boolean3 = userRepository1.emailExists("data/test-users.csv");
        java.util.Optional<com.reservation_system.model.User> userOptional5 = userRepository1.findByEmail("coord2@yorku.ca");
        int int6 = userRepository1.getNextID();
        java.util.List<com.reservation_system.model.User> userList7 = userRepository1.getAllUsers();
        java.util.List<com.reservation_system.model.User> userList8 = userRepository1.getAllUsers();
// flaky "47) test0397(com.reservation_system.Randoop.CoordinatorService.RegressionTest0)":         org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(userOptional5);
// flaky "15) test0397(com.reservation_system.Randoop.CoordinatorService.RegressionTest0)":         org.junit.Assert.assertTrue("'" + int6 + "' != '" + 101 + "'", int6 == 101);
        org.junit.Assert.assertNotNull(userList7);
        org.junit.Assert.assertNotNull(userList8);
    }

    @Test
    public void test0398() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0398");
        com.reservation_system.model.Faculty faculty5 = new com.reservation_system.model.Faculty((-1), "labmanager", "coord@yorku.ca", "hi!", false);
    }

    @Test
    public void test0399() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0399");
        // The following exception was thrown during execution in test generation
        try {
            com.reservation_system.model.User user6 = com.reservation_system.patterns.factory.UserFactory.createUser("data/test-users.csv", (int) ' ', "Coordinator", "manager1@yorku.ca", "Coordinator2", false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid user type: data/test-users.csv");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0400() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0400");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("data/test-users.csv");
        com.reservation_system.model.LabManager labManager7 = new com.reservation_system.model.LabManager((int) (short) 0, "", "Faculty", "Student", true);
        java.lang.String str8 = labManager7.getUserType();
        java.lang.String str9 = labManager7.getPassword();
        userRepository1.addUser((com.reservation_system.model.User) labManager7);
        boolean boolean11 = userRepository1.headLabCoordinatorExists();
        com.reservation_system.model.Researcher researcher17 = new com.reservation_system.model.Researcher(0, "Student", "Faculty", "Faculty", false);
        userRepository1.addUser((com.reservation_system.model.User) researcher17);
        java.util.Optional<com.reservation_system.model.User> userOptional20 = userRepository1.findByEmail("data/test-users.csv");
        com.reservation_system.model.User user27 = com.reservation_system.patterns.factory.UserFactory.createUser("Student", (int) (byte) 10, "Faculty", "Manager1", "Manager1", true);
        int int28 = user27.getID();
        userRepository1.addUser(user27);
        boolean boolean31 = userRepository1.emailExists("headlabcoordinator");
        java.util.List<com.reservation_system.model.User> userList32 = userRepository1.getAllUsers();
        java.util.Optional<com.reservation_system.model.User> userOptional34 = userRepository1.findByEmail("labmanager");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "labmanager" + "'", str8, "labmanager");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Student" + "'", str9, "Student");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(userOptional20);
        org.junit.Assert.assertNotNull(user27);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 10 + "'", int28 == 10);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertNotNull(userList32);
        org.junit.Assert.assertNotNull(userOptional34);
    }

    @Test
    public void test0401() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0401");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("data/test-users.csv");
        java.util.Optional<com.reservation_system.model.User> userOptional3 = userRepository1.findByEmail("Faculty");
        com.reservation_system.services.CoordinatorAccountService coordinatorAccountService4 = new com.reservation_system.services.CoordinatorAccountService(userRepository1);
        com.reservation_system.model.Guest guest10 = new com.reservation_system.model.Guest((int) (short) 0, "Manager1", "Coordinator2", "", true);
        // The following exception was thrown during execution in test generation
        try {
            com.reservation_system.model.User user14 = coordinatorAccountService4.autoGenerateLabManagerAccount((com.reservation_system.model.User) guest10, "Strong1!", "coord2@yorku.ca", "Coordinator");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Only the head lab coordinator can generate lab manager accounts.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(userOptional3);
    }

    @Test
    public void test0402() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0402");
        com.reservation_system.model.Guest guest5 = new com.reservation_system.model.Guest((int) (short) 0, "Manager1", "Coordinator2", "", true);
        java.lang.String str6 = guest5.getPassword();
        boolean boolean7 = guest5.isApproved();
        int int8 = guest5.getID();
        java.lang.String str9 = guest5.getUserType();
        int int10 = guest5.getID();
        boolean boolean11 = guest5.requiresDepartmentApproval();
        boolean boolean12 = guest5.isApproved();
        java.lang.String str13 = guest5.getUserType();
        java.lang.String str14 = guest5.getUserType();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Guest" + "'", str9, "Guest");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Guest" + "'", str13, "Guest");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Guest" + "'", str14, "Guest");
    }

    @Test
    public void test0403() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0403");
        com.reservation_system.model.Researcher researcher5 = new com.reservation_system.model.Researcher((int) (short) 100, "labmanager", "Student", "Coordinator", false);
        java.lang.String str6 = researcher5.getUserType();
        boolean boolean7 = researcher5.requiresDepartmentApproval();
        java.lang.Class<?> wildcardClass8 = researcher5.getClass();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Researcher" + "'", str6, "Researcher");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0404() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0404");
        com.reservation_system.model.LabManager labManager5 = new com.reservation_system.model.LabManager(0, "headlabcoordinator", "coord@yorku.ca", "coord@yorku.ca", true);
        java.lang.String str6 = labManager5.getUserType();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "labmanager" + "'", str6, "labmanager");
    }

    @Test
    public void test0405() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0405");
        com.reservation_system.model.Researcher researcher5 = new com.reservation_system.model.Researcher(32, "coord@yorku.ca", "Researcher", "Strong1!", false);
        java.lang.String str6 = researcher5.getPassword();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Strong1!" + "'", str6, "Strong1!");
    }

    @Test
    public void test0406() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0406");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("data/test-users.csv");
        boolean boolean3 = userRepository1.emailExists("data/test-users.csv");
        boolean boolean5 = userRepository1.emailExists("");
        com.reservation_system.model.Faculty faculty11 = new com.reservation_system.model.Faculty((int) (byte) 1, "", "Guest", "Student", true);
        java.lang.String str12 = faculty11.getUserType();
        java.lang.String str13 = faculty11.getUserType();
        userRepository1.addUser((com.reservation_system.model.User) faculty11);
        com.reservation_system.services.CoordinatorAccountService coordinatorAccountService15 = new com.reservation_system.services.CoordinatorAccountService(userRepository1);
        java.util.List<com.reservation_system.model.User> userList16 = userRepository1.getAllUsers();
// flaky "48) test0406(com.reservation_system.Randoop.CoordinatorService.RegressionTest0)":         org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
// flaky "16) test0406(com.reservation_system.Randoop.CoordinatorService.RegressionTest0)":         org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Faculty" + "'", str12, "Faculty");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Faculty" + "'", str13, "Faculty");
        org.junit.Assert.assertNotNull(userList16);
    }

    @Test
    public void test0407() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0407");
        com.reservation_system.model.User user6 = com.reservation_system.patterns.factory.UserFactory.createUser("Student", (int) '#', "Coordinator2", "data/test-users.csv", "manager1@yorku.ca", false);
        org.junit.Assert.assertNotNull(user6);
    }

    @Test
    public void test0408() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0408");
        com.reservation_system.model.Student student5 = new com.reservation_system.model.Student((int) 'a', "manager1@yorku.ca", "labmanager", "labmanager", false);
        java.lang.String str6 = student5.getName();
        java.lang.String str7 = student5.getUserType();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "manager1@yorku.ca" + "'", str6, "manager1@yorku.ca");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Student" + "'", str7, "Student");
    }

    @Test
    public void test0409() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0409");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("data/test-users.csv");
        com.reservation_system.model.LabManager labManager7 = new com.reservation_system.model.LabManager((int) 'a', "Manager1", "hi!", "Coordinator2", false);
        java.lang.String str8 = labManager7.getUserType();
        java.lang.String str9 = labManager7.getUserType();
        java.lang.String str10 = labManager7.getUserType();
        userRepository1.addUser((com.reservation_system.model.User) labManager7);
        int int12 = userRepository1.getNextID();
        com.reservation_system.services.CoordinatorAccountService coordinatorAccountService13 = new com.reservation_system.services.CoordinatorAccountService(userRepository1);
        // The following exception was thrown during execution in test generation
        try {
            com.reservation_system.model.User user17 = coordinatorAccountService13.createHeadLabCoordinator("data/test-users.csv", "Manager1", "Strong1!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Only one head lab coordinator account is allowed.");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "labmanager" + "'", str8, "labmanager");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "labmanager" + "'", str9, "labmanager");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "labmanager" + "'", str10, "labmanager");
// flaky "49) test0409(com.reservation_system.Randoop.CoordinatorService.RegressionTest0)":         org.junit.Assert.assertTrue("'" + int12 + "' != '" + 101 + "'", int12 == 101);
    }

    @Test
    public void test0410() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0410");
        com.reservation_system.model.Student student5 = new com.reservation_system.model.Student(10, "hi!", "Guest", "coord@yorku.ca", false);
        java.lang.String str6 = student5.getUserType();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Student" + "'", str6, "Student");
    }

    @Test
    public void test0411() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0411");
        com.reservation_system.model.Researcher researcher5 = new com.reservation_system.model.Researcher(99, "hi!", "coord@yorku.ca", "hi!", false);
    }

    @Test
    public void test0412() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0412");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("data/test-users.csv");
        boolean boolean3 = userRepository1.emailExists("data/test-users.csv");
        boolean boolean5 = userRepository1.emailExists("");
        com.reservation_system.model.Faculty faculty11 = new com.reservation_system.model.Faculty((int) (byte) 1, "", "Guest", "Student", true);
        java.lang.String str12 = faculty11.getUserType();
        java.lang.String str13 = faculty11.getUserType();
        userRepository1.addUser((com.reservation_system.model.User) faculty11);
        com.reservation_system.services.CoordinatorAccountService coordinatorAccountService15 = new com.reservation_system.services.CoordinatorAccountService(userRepository1);
        com.reservation_system.model.HeadLabCoordinator headLabCoordinator21 = new com.reservation_system.model.HeadLabCoordinator(97, "hi!", "Coordinator", "manager1@yorku.ca", true);
        // The following exception was thrown during execution in test generation
        try {
            com.reservation_system.model.User user25 = coordinatorAccountService15.autoGenerateLabManagerAccount((com.reservation_system.model.User) headLabCoordinator21, "Coordinator2", "Researcher", "coord@yorku.ca");
// flaky "50) test0412(com.reservation_system.Randoop.CoordinatorService.RegressionTest0)":             org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Email is already registered.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
// flaky "17) test0412(com.reservation_system.Randoop.CoordinatorService.RegressionTest0)":         org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
// flaky "6) test0412(com.reservation_system.Randoop.CoordinatorService.RegressionTest0)":         org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Faculty" + "'", str12, "Faculty");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Faculty" + "'", str13, "Faculty");
    }

    @Test
    public void test0413() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0413");
        com.reservation_system.model.Guest guest5 = new com.reservation_system.model.Guest(0, "Researcher", "Manager1", "labmanager", false);
        java.lang.String str6 = guest5.getPassword();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "labmanager" + "'", str6, "labmanager");
    }

    @Test
    public void test0414() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0414");
        com.reservation_system.model.LabManager labManager5 = new com.reservation_system.model.LabManager((int) 'a', "headlabcoordinator", "Guest", "Manager1", true);
    }

    @Test
    public void test0415() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0415");
        // The following exception was thrown during execution in test generation
        try {
            com.reservation_system.model.User user6 = com.reservation_system.patterns.factory.UserFactory.createUser("data/test-users.csv", (int) (byte) 1, "manager1@yorku.ca", "headlabcoordinator", "Researcher", true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid user type: data/test-users.csv");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0416() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0416");
        com.reservation_system.model.Faculty faculty5 = new com.reservation_system.model.Faculty(1, "coord2@yorku.ca", "", "Guest", false);
        java.lang.String str6 = faculty5.getUserType();
        java.lang.String str7 = faculty5.getUserType();
        java.lang.String str8 = faculty5.getUserType();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Faculty" + "'", str6, "Faculty");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Faculty" + "'", str7, "Faculty");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Faculty" + "'", str8, "Faculty");
    }

    @Test
    public void test0417() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0417");
        com.reservation_system.model.Researcher researcher5 = new com.reservation_system.model.Researcher((int) (byte) 100, "labmanager", "Researcher", "hi!", false);
        java.lang.Class<?> wildcardClass6 = researcher5.getClass();
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0418() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0418");
        com.reservation_system.model.Student student5 = new com.reservation_system.model.Student((int) '#', "Coordinator", "Coordinator", "", false);
        student5.setApproved(false);
    }

    @Test
    public void test0419() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0419");
        com.reservation_system.model.HeadLabCoordinator headLabCoordinator5 = new com.reservation_system.model.HeadLabCoordinator(1, "manager1@yorku.ca", "Student", "data/test-users.csv", true);
        boolean boolean6 = headLabCoordinator5.requiresDepartmentApproval();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test0420() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0420");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("data/test-users.csv");
        boolean boolean2 = userRepository1.headLabCoordinatorExists();
        com.reservation_system.repository.UserRepository userRepository4 = new com.reservation_system.repository.UserRepository("data/test-users.csv");
        java.util.Optional<com.reservation_system.model.User> userOptional6 = userRepository4.findByEmail("Faculty");
        java.util.Optional<com.reservation_system.model.User> userOptional8 = userRepository4.findByEmail("headlabcoordinator");
        boolean boolean10 = userRepository4.emailExists("Manager1");
        java.util.List<com.reservation_system.model.User> userList11 = userRepository4.getAllUsers();
        boolean boolean13 = userRepository4.emailExists("");
        com.reservation_system.model.LabManager labManager19 = new com.reservation_system.model.LabManager((int) (short) 0, "", "Faculty", "Student", true);
        java.lang.String str20 = labManager19.getEmail();
        java.lang.String str21 = labManager19.getUserType();
        userRepository4.addUser((com.reservation_system.model.User) labManager19);
        boolean boolean23 = userRepository4.headLabCoordinatorExists();
        com.reservation_system.model.Student student29 = new com.reservation_system.model.Student((int) (short) 0, "coord@yorku.ca", "headlabcoordinator", "Strong1!", true);
        java.lang.String str30 = student29.getPassword();
        userRepository4.addUser((com.reservation_system.model.User) student29);
        boolean boolean32 = userRepository4.headLabCoordinatorExists();
        com.reservation_system.repository.UserRepository userRepository34 = new com.reservation_system.repository.UserRepository("data/test-users.csv");
        boolean boolean35 = userRepository34.headLabCoordinatorExists();
        boolean boolean36 = userRepository34.headLabCoordinatorExists();
        boolean boolean38 = userRepository34.emailExists("Manager1");
        java.util.Optional<com.reservation_system.model.User> userOptional40 = userRepository34.findByEmail("Strong1!");
        java.util.List<com.reservation_system.model.User> userList41 = userRepository34.getAllUsers();
        userRepository4.saveAllUsers(userList41);
        userRepository1.saveAllUsers(userList41);
        java.util.Optional<com.reservation_system.model.User> userOptional45 = userRepository1.findByEmail("Student");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(userOptional6);
        org.junit.Assert.assertNotNull(userOptional8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(userList11);
// flaky "51) test0420(com.reservation_system.Randoop.CoordinatorService.RegressionTest0)":         org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "Faculty" + "'", str20, "Faculty");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "labmanager" + "'", str21, "labmanager");
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "Strong1!" + "'", str30, "Strong1!");
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + true + "'", boolean38 == true);
        org.junit.Assert.assertNotNull(userOptional40);
        org.junit.Assert.assertNotNull(userList41);
        org.junit.Assert.assertNotNull(userOptional45);
    }

    @Test
    public void test0421() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0421");
        com.reservation_system.model.Guest guest5 = new com.reservation_system.model.Guest((int) (short) 0, "Manager1", "Coordinator2", "", true);
        java.lang.String str6 = guest5.getPassword();
        boolean boolean7 = guest5.isApproved();
        int int8 = guest5.getID();
        guest5.setApproved(false);
        java.lang.String str11 = guest5.getName();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Manager1" + "'", str11, "Manager1");
    }

    @Test
    public void test0422() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0422");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("data/test-users.csv");
        boolean boolean2 = userRepository1.headLabCoordinatorExists();
        com.reservation_system.services.CoordinatorAccountService coordinatorAccountService3 = new com.reservation_system.services.CoordinatorAccountService(userRepository1);
        java.util.List<com.reservation_system.model.User> userList4 = userRepository1.getAllUsers();
        com.reservation_system.services.CoordinatorAccountService coordinatorAccountService5 = new com.reservation_system.services.CoordinatorAccountService(userRepository1);
        com.reservation_system.services.CoordinatorAccountService coordinatorAccountService6 = new com.reservation_system.services.CoordinatorAccountService(userRepository1);
        com.reservation_system.model.Guest guest12 = new com.reservation_system.model.Guest((int) (byte) 10, "Student", "Researcher", "coord@yorku.ca", true);
        // The following exception was thrown during execution in test generation
        try {
            com.reservation_system.model.User user16 = coordinatorAccountService6.autoGenerateLabManagerAccount((com.reservation_system.model.User) guest12, "coord@yorku.ca", "", "headlabcoordinator");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Email is required.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(userList4);
    }

    @Test
    public void test0423() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0423");
        com.reservation_system.model.Researcher researcher5 = new com.reservation_system.model.Researcher((int) '#', "Student", "coord2@yorku.ca", "labmanager", false);
        researcher5.setApproved(true);
        int int8 = researcher5.getID();
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 35 + "'", int8 == 35);
    }

    @Test
    public void test0424() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0424");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("data/test-users.csv");
        java.util.Optional<com.reservation_system.model.User> userOptional3 = userRepository1.findByEmail("Faculty");
        java.util.Optional<com.reservation_system.model.User> userOptional5 = userRepository1.findByEmail("headlabcoordinator");
        boolean boolean6 = userRepository1.headLabCoordinatorExists();
        boolean boolean8 = userRepository1.emailExists("coord2@yorku.ca");
        com.reservation_system.services.CoordinatorAccountService coordinatorAccountService9 = new com.reservation_system.services.CoordinatorAccountService(userRepository1);
        com.reservation_system.model.User user16 = com.reservation_system.patterns.factory.UserFactory.createUser("headlabcoordinator", 0, "Guest", "Strong1!", "Manager1", false);
        java.lang.String str17 = user16.getName();
        // The following exception was thrown during execution in test generation
        try {
            com.reservation_system.model.User user21 = coordinatorAccountService9.autoGenerateLabManagerAccount(user16, "coord@yorku.ca", "hi!", "Student");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Head lab coordinator account is not approved.");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(userOptional3);
        org.junit.Assert.assertNotNull(userOptional5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(user16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "Guest" + "'", str17, "Guest");
    }

    @Test
    public void test0425() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0425");
        com.reservation_system.model.HeadLabCoordinator headLabCoordinator5 = new com.reservation_system.model.HeadLabCoordinator((int) (byte) 1, "coord@yorku.ca", "", "coord@yorku.ca", true);
        java.lang.Class<?> wildcardClass6 = headLabCoordinator5.getClass();
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0426() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0426");
        com.reservation_system.model.LabManager labManager5 = new com.reservation_system.model.LabManager(10, "", "Student", "Researcher", true);
        java.lang.String str6 = labManager5.getEmail();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Student" + "'", str6, "Student");
    }

    @Test
    public void test0427() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0427");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("data/test-users.csv");
        boolean boolean2 = userRepository1.headLabCoordinatorExists();
        boolean boolean3 = userRepository1.headLabCoordinatorExists();
        java.util.Optional<com.reservation_system.model.User> userOptional5 = userRepository1.findByEmail("");
        java.util.List<com.reservation_system.model.User> userList6 = userRepository1.getAllUsers();
        com.reservation_system.services.CoordinatorAccountService coordinatorAccountService7 = new com.reservation_system.services.CoordinatorAccountService(userRepository1);
        // The following exception was thrown during execution in test generation
        try {
            com.reservation_system.model.User user11 = coordinatorAccountService7.createHeadLabCoordinator("data/test-users.csv", "", "manager1@yorku.ca");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Email is required.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(userOptional5);
        org.junit.Assert.assertNotNull(userList6);
    }

    @Test
    public void test0428() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0428");
        com.reservation_system.model.Researcher researcher5 = new com.reservation_system.model.Researcher(10, "coord@yorku.ca", "Faculty", "Faculty", true);
        java.lang.String str6 = researcher5.getUserType();
        boolean boolean7 = researcher5.requiresDepartmentApproval();
        java.lang.String str8 = researcher5.getEmail();
        java.lang.String str9 = researcher5.getUserType();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Researcher" + "'", str6, "Researcher");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Faculty" + "'", str8, "Faculty");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Researcher" + "'", str9, "Researcher");
    }

    @Test
    public void test0429() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0429");
        // The following exception was thrown during execution in test generation
        try {
            com.reservation_system.model.User user6 = com.reservation_system.patterns.factory.UserFactory.createUser("Manager1", (-1), "", "data/test-users.csv", "coord2@yorku.ca", false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid user type: Manager1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0430() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0430");
        // The following exception was thrown during execution in test generation
        try {
            com.reservation_system.model.User user6 = com.reservation_system.patterns.factory.UserFactory.createUser("hi!", 100, "Strong1!", "Researcher", "Faculty", true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid user type: hi!");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0431() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0431");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("data/test-users.csv");
        com.reservation_system.model.Faculty faculty7 = new com.reservation_system.model.Faculty((int) (byte) 1, "", "Guest", "Student", true);
        userRepository1.addUser((com.reservation_system.model.User) faculty7);
        java.util.List<com.reservation_system.model.User> userList9 = userRepository1.getAllUsers();
        int int10 = userRepository1.getNextID();
        int int11 = userRepository1.getNextID();
        com.reservation_system.services.CoordinatorAccountService coordinatorAccountService12 = new com.reservation_system.services.CoordinatorAccountService(userRepository1);
        com.reservation_system.model.Faculty faculty18 = new com.reservation_system.model.Faculty((int) 'a', "Student", "", "manager1@yorku.ca", false);
        // The following exception was thrown during execution in test generation
        try {
            com.reservation_system.model.User user22 = coordinatorAccountService12.autoGenerateLabManagerAccount((com.reservation_system.model.User) faculty18, "Coordinator2", "headlabcoordinator", "manager1@yorku.ca");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Only the head lab coordinator can generate lab manager accounts.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(userList9);
// flaky "52) test0431(com.reservation_system.Randoop.CoordinatorService.RegressionTest0)":         org.junit.Assert.assertTrue("'" + int10 + "' != '" + 101 + "'", int10 == 101);
// flaky "18) test0431(com.reservation_system.Randoop.CoordinatorService.RegressionTest0)":         org.junit.Assert.assertTrue("'" + int11 + "' != '" + 101 + "'", int11 == 101);
    }

    @Test
    public void test0432() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0432");
        com.reservation_system.model.Student student5 = new com.reservation_system.model.Student((-1), "Guest", "data/test-users.csv", "coord2@yorku.ca", true);
        java.lang.String str6 = student5.getUserType();
        student5.setApproved(false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Student" + "'", str6, "Student");
    }

    @Test
    public void test0433() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0433");
        com.reservation_system.model.Guest guest5 = new com.reservation_system.model.Guest((int) '#', "Coordinator2", "Strong1!", "coord@yorku.ca", true);
    }

    @Test
    public void test0434() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0434");
        com.reservation_system.model.HeadLabCoordinator headLabCoordinator5 = new com.reservation_system.model.HeadLabCoordinator(2, "manager1@yorku.ca", "Coordinator2", "", false);
    }

    @Test
    public void test0435() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0435");
        com.reservation_system.model.LabManager labManager5 = new com.reservation_system.model.LabManager((int) (short) 100, "headlabcoordinator", "", "headlabcoordinator", true);
        java.lang.String str6 = labManager5.getName();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "headlabcoordinator" + "'", str6, "headlabcoordinator");
    }

    @Test
    public void test0436() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0436");
        com.reservation_system.model.HeadLabCoordinator headLabCoordinator5 = new com.reservation_system.model.HeadLabCoordinator((int) ' ', "", "Student", "Researcher", false);
        java.lang.String str6 = headLabCoordinator5.getUserType();
        java.lang.String str7 = headLabCoordinator5.getUserType();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "headlabcoordinator" + "'", str6, "headlabcoordinator");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "headlabcoordinator" + "'", str7, "headlabcoordinator");
    }

    @Test
    public void test0437() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0437");
        com.reservation_system.model.Faculty faculty5 = new com.reservation_system.model.Faculty((int) (short) 0, "coord@yorku.ca", "Researcher", "hi!", true);
        java.lang.String str6 = faculty5.getName();
        java.lang.String str7 = faculty5.getUserType();
        java.lang.Class<?> wildcardClass8 = faculty5.getClass();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "coord@yorku.ca" + "'", str6, "coord@yorku.ca");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Faculty" + "'", str7, "Faculty");
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0438() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0438");
        com.reservation_system.model.LabManager labManager5 = new com.reservation_system.model.LabManager((int) '4', "manager1@yorku.ca", "Coordinator", "Coordinator", true);
        java.lang.String str6 = labManager5.getUserType();
        java.lang.String str7 = labManager5.getUserType();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "labmanager" + "'", str6, "labmanager");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "labmanager" + "'", str7, "labmanager");
    }

    @Test
    public void test0439() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0439");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("data/test-users.csv");
        boolean boolean3 = userRepository1.emailExists("headlabcoordinator");
        com.reservation_system.services.CoordinatorAccountService coordinatorAccountService4 = new com.reservation_system.services.CoordinatorAccountService(userRepository1);
        // The following exception was thrown during execution in test generation
        try {
            com.reservation_system.model.User user8 = coordinatorAccountService4.createHeadLabCoordinator("Coordinator", "manager1@yorku.ca", "Coordinator");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Only one head lab coordinator account is allowed.");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
    }

    @Test
    public void test0440() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0440");
        com.reservation_system.model.Student student5 = new com.reservation_system.model.Student((int) '#', "coord@yorku.ca", "hi!", "", false);
        boolean boolean6 = student5.requiresDepartmentApproval();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test0441() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0441");
        com.reservation_system.model.Researcher researcher5 = new com.reservation_system.model.Researcher((int) (short) -1, "headlabcoordinator", "", "labmanager", true);
        java.lang.String str6 = researcher5.getUserType();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Researcher" + "'", str6, "Researcher");
    }

    @Test
    public void test0442() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0442");
        com.reservation_system.model.Faculty faculty5 = new com.reservation_system.model.Faculty(99, "Manager1", "manager1@yorku.ca", "manager1@yorku.ca", true);
        java.lang.Class<?> wildcardClass6 = faculty5.getClass();
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0443() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0443");
        com.reservation_system.model.Student student5 = new com.reservation_system.model.Student((int) (short) -1, "coord2@yorku.ca", "Student", "Coordinator", true);
        java.lang.String str6 = student5.getUserType();
        java.lang.String str7 = student5.getUserType();
        java.lang.String str8 = student5.getPassword();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Student" + "'", str6, "Student");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Student" + "'", str7, "Student");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Coordinator" + "'", str8, "Coordinator");
    }

    @Test
    public void test0444() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0444");
        com.reservation_system.model.Faculty faculty5 = new com.reservation_system.model.Faculty(100, "hi!", "", "coord@yorku.ca", false);
        java.lang.String str6 = faculty5.getUserType();
        java.lang.String str7 = faculty5.getUserType();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Faculty" + "'", str6, "Faculty");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Faculty" + "'", str7, "Faculty");
    }

    @Test
    public void test0445() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0445");
        com.reservation_system.model.Researcher researcher5 = new com.reservation_system.model.Researcher(10, "coord@yorku.ca", "Faculty", "Faculty", true);
        java.lang.String str6 = researcher5.getUserType();
        java.lang.String str7 = researcher5.getUserType();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Researcher" + "'", str6, "Researcher");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Researcher" + "'", str7, "Researcher");
    }

    @Test
    public void test0446() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0446");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("data/test-users.csv");
        com.reservation_system.model.LabManager labManager7 = new com.reservation_system.model.LabManager((int) (short) 0, "", "Faculty", "Student", true);
        java.lang.String str8 = labManager7.getUserType();
        java.lang.String str9 = labManager7.getPassword();
        userRepository1.addUser((com.reservation_system.model.User) labManager7);
        com.reservation_system.services.CoordinatorAccountService coordinatorAccountService11 = new com.reservation_system.services.CoordinatorAccountService(userRepository1);
        // The following exception was thrown during execution in test generation
        try {
            com.reservation_system.model.User user15 = coordinatorAccountService11.createHeadLabCoordinator("Coordinator2", "Student", "Strong1!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Only one head lab coordinator account is allowed.");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "labmanager" + "'", str8, "labmanager");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Student" + "'", str9, "Student");
    }

    @Test
    public void test0447() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0447");
        com.reservation_system.model.Researcher researcher5 = new com.reservation_system.model.Researcher(2, "coord2@yorku.ca", "Coordinator", "Coordinator", false);
    }

    @Test
    public void test0448() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0448");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("data/test-users.csv");
        com.reservation_system.model.Faculty faculty7 = new com.reservation_system.model.Faculty((int) (byte) 1, "", "Guest", "Student", true);
        userRepository1.addUser((com.reservation_system.model.User) faculty7);
        java.util.List<com.reservation_system.model.User> userList9 = userRepository1.getAllUsers();
        int int10 = userRepository1.getNextID();
        int int11 = userRepository1.getNextID();
        com.reservation_system.services.CoordinatorAccountService coordinatorAccountService12 = new com.reservation_system.services.CoordinatorAccountService(userRepository1);
        // The following exception was thrown during execution in test generation
        try {
            com.reservation_system.model.User user16 = coordinatorAccountService12.createHeadLabCoordinator("coord2@yorku.ca", "Student", "coord@yorku.ca");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Only one head lab coordinator account is allowed.");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(userList9);
// flaky "53) test0448(com.reservation_system.Randoop.CoordinatorService.RegressionTest0)":         org.junit.Assert.assertTrue("'" + int10 + "' != '" + 101 + "'", int10 == 101);
// flaky "19) test0448(com.reservation_system.Randoop.CoordinatorService.RegressionTest0)":         org.junit.Assert.assertTrue("'" + int11 + "' != '" + 101 + "'", int11 == 101);
    }

    @Test
    public void test0449() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0449");
        // The following exception was thrown during execution in test generation
        try {
            com.reservation_system.model.User user6 = com.reservation_system.patterns.factory.UserFactory.createUser("Coordinator", (int) (byte) 100, "", "", "", true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid user type: Coordinator");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0450() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0450");
        com.reservation_system.model.Guest guest5 = new com.reservation_system.model.Guest(32, "data/test-users.csv", "Researcher", "manager1@yorku.ca", true);
    }

    @Test
    public void test0451() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0451");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("data/test-users.csv");
        com.reservation_system.model.LabManager labManager7 = new com.reservation_system.model.LabManager((int) (short) 0, "", "Faculty", "Student", true);
        java.lang.String str8 = labManager7.getUserType();
        java.lang.String str9 = labManager7.getPassword();
        userRepository1.addUser((com.reservation_system.model.User) labManager7);
        boolean boolean11 = userRepository1.headLabCoordinatorExists();
        com.reservation_system.model.Researcher researcher17 = new com.reservation_system.model.Researcher(0, "Student", "Faculty", "Faculty", false);
        userRepository1.addUser((com.reservation_system.model.User) researcher17);
        com.reservation_system.services.CoordinatorAccountService coordinatorAccountService19 = new com.reservation_system.services.CoordinatorAccountService(userRepository1);
        java.util.Optional<com.reservation_system.model.User> userOptional21 = userRepository1.findByEmail("");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "labmanager" + "'", str8, "labmanager");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Student" + "'", str9, "Student");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(userOptional21);
    }

    @Test
    public void test0452() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0452");
        com.reservation_system.model.Faculty faculty5 = new com.reservation_system.model.Faculty(100, "manager1@yorku.ca", "manager1@yorku.ca", "manager1@yorku.ca", false);
    }

    @Test
    public void test0453() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0453");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("data/test-users.csv");
        java.util.Optional<com.reservation_system.model.User> userOptional3 = userRepository1.findByEmail("Faculty");
        boolean boolean5 = userRepository1.emailExists("");
        java.util.Optional<com.reservation_system.model.User> userOptional7 = userRepository1.findByEmail("data/test-users.csv");
        java.util.Optional<com.reservation_system.model.User> userOptional9 = userRepository1.findByEmail("Student");
        org.junit.Assert.assertNotNull(userOptional3);
// flaky "54) test0453(com.reservation_system.Randoop.CoordinatorService.RegressionTest0)":         org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(userOptional7);
        org.junit.Assert.assertNotNull(userOptional9);
    }

    @Test
    public void test0454() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0454");
        com.reservation_system.model.LabManager labManager5 = new com.reservation_system.model.LabManager(101, "headlabcoordinator", "", "hi!", true);
    }

    @Test
    public void test0455() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0455");
        com.reservation_system.model.Faculty faculty5 = new com.reservation_system.model.Faculty((int) (short) 1, "Guest", "Faculty", "Manager1", true);
    }

    @Test
    public void test0456() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0456");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("data/test-users.csv");
        java.util.Optional<com.reservation_system.model.User> userOptional3 = userRepository1.findByEmail("Faculty");
        java.util.Optional<com.reservation_system.model.User> userOptional5 = userRepository1.findByEmail("headlabcoordinator");
        java.util.List<com.reservation_system.model.User> userList6 = userRepository1.getAllUsers();
        int int7 = userRepository1.getNextID();
        java.util.List<com.reservation_system.model.User> userList8 = userRepository1.getAllUsers();
        com.reservation_system.repository.UserRepository userRepository10 = new com.reservation_system.repository.UserRepository("data/test-users.csv");
        boolean boolean11 = userRepository10.headLabCoordinatorExists();
        boolean boolean12 = userRepository10.headLabCoordinatorExists();
        boolean boolean14 = userRepository10.emailExists("Manager1");
        java.util.Optional<com.reservation_system.model.User> userOptional16 = userRepository10.findByEmail("Strong1!");
        java.util.List<com.reservation_system.model.User> userList17 = userRepository10.getAllUsers();
        userRepository1.saveAllUsers(userList17);
        java.util.Optional<com.reservation_system.model.User> userOptional20 = userRepository1.findByEmail("");
        org.junit.Assert.assertNotNull(userOptional3);
        org.junit.Assert.assertNotNull(userOptional5);
        org.junit.Assert.assertNotNull(userList6);
// flaky "55) test0456(com.reservation_system.Randoop.CoordinatorService.RegressionTest0)":         org.junit.Assert.assertTrue("'" + int7 + "' != '" + 101 + "'", int7 == 101);
        org.junit.Assert.assertNotNull(userList8);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(userOptional16);
        org.junit.Assert.assertNotNull(userList17);
        org.junit.Assert.assertNotNull(userOptional20);
    }

    @Test
    public void test0457() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0457");
        com.reservation_system.model.Researcher researcher5 = new com.reservation_system.model.Researcher(35, "", "headlabcoordinator", "Faculty", false);
        boolean boolean6 = researcher5.requiresDepartmentApproval();
        java.lang.String str7 = researcher5.getUserType();
        boolean boolean8 = researcher5.isApproved();
        java.lang.String str9 = researcher5.getUserType();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Researcher" + "'", str7, "Researcher");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Researcher" + "'", str9, "Researcher");
    }

    @Test
    public void test0458() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0458");
        com.reservation_system.model.Guest guest5 = new com.reservation_system.model.Guest((int) ' ', "data/test-users.csv", "coord2@yorku.ca", "data/test-users.csv", false);
        java.lang.String str6 = guest5.getPassword();
        java.lang.String str7 = guest5.getEmail();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "data/test-users.csv" + "'", str6, "data/test-users.csv");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "coord2@yorku.ca" + "'", str7, "coord2@yorku.ca");
    }

    @Test
    public void test0459() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0459");
        com.reservation_system.model.Researcher researcher5 = new com.reservation_system.model.Researcher((int) (byte) 100, "Manager1", "labmanager", "Manager1", false);
    }

    @Test
    public void test0460() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0460");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("data/test-users.csv");
        java.util.Optional<com.reservation_system.model.User> userOptional3 = userRepository1.findByEmail("Faculty");
        java.util.Optional<com.reservation_system.model.User> userOptional5 = userRepository1.findByEmail("headlabcoordinator");
        boolean boolean7 = userRepository1.emailExists("Manager1");
        java.util.List<com.reservation_system.model.User> userList8 = userRepository1.getAllUsers();
        boolean boolean10 = userRepository1.emailExists("");
        com.reservation_system.model.LabManager labManager16 = new com.reservation_system.model.LabManager((int) (short) 0, "", "Faculty", "Student", true);
        java.lang.String str17 = labManager16.getEmail();
        java.lang.String str18 = labManager16.getUserType();
        userRepository1.addUser((com.reservation_system.model.User) labManager16);
        boolean boolean21 = userRepository1.emailExists("labmanager");
        boolean boolean22 = userRepository1.headLabCoordinatorExists();
        org.junit.Assert.assertNotNull(userOptional3);
        org.junit.Assert.assertNotNull(userOptional5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(userList8);
// flaky "56) test0460(com.reservation_system.Randoop.CoordinatorService.RegressionTest0)":         org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "Faculty" + "'", str17, "Faculty");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "labmanager" + "'", str18, "labmanager");
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
    }

    @Test
    public void test0461() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0461");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("data/test-users.csv");
        java.util.Optional<com.reservation_system.model.User> userOptional3 = userRepository1.findByEmail("Faculty");
        java.util.Optional<com.reservation_system.model.User> userOptional5 = userRepository1.findByEmail("headlabcoordinator");
        boolean boolean7 = userRepository1.emailExists("Manager1");
        java.util.List<com.reservation_system.model.User> userList8 = userRepository1.getAllUsers();
        boolean boolean9 = userRepository1.headLabCoordinatorExists();
        java.util.List<com.reservation_system.model.User> userList10 = userRepository1.getAllUsers();
        java.util.List<com.reservation_system.model.User> userList11 = userRepository1.getAllUsers();
        com.reservation_system.services.CoordinatorAccountService coordinatorAccountService12 = new com.reservation_system.services.CoordinatorAccountService(userRepository1);
        com.reservation_system.model.LabManager labManager18 = new com.reservation_system.model.LabManager((int) 'a', "Manager1", "hi!", "Coordinator2", false);
        java.lang.String str19 = labManager18.getUserType();
        java.lang.String str20 = labManager18.getUserType();
        java.lang.String str21 = labManager18.getUserType();
        boolean boolean22 = labManager18.requiresDepartmentApproval();
        // The following exception was thrown during execution in test generation
        try {
            com.reservation_system.model.User user26 = coordinatorAccountService12.autoGenerateLabManagerAccount((com.reservation_system.model.User) labManager18, "hi!", "Student", "coord2@yorku.ca");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Only the head lab coordinator can generate lab manager accounts.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(userOptional3);
        org.junit.Assert.assertNotNull(userOptional5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(userList8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(userList10);
        org.junit.Assert.assertNotNull(userList11);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "labmanager" + "'", str19, "labmanager");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "labmanager" + "'", str20, "labmanager");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "labmanager" + "'", str21, "labmanager");
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
    }

    @Test
    public void test0462() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0462");
        com.reservation_system.model.LabManager labManager5 = new com.reservation_system.model.LabManager(0, "labmanager", "Faculty", "Strong1!", true);
    }

    @Test
    public void test0463() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0463");
        com.reservation_system.model.Researcher researcher5 = new com.reservation_system.model.Researcher((int) (byte) 10, "labmanager", "", "headlabcoordinator", true);
    }

    @Test
    public void test0464() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0464");
        com.reservation_system.model.Researcher researcher5 = new com.reservation_system.model.Researcher(97, "coord2@yorku.ca", "Faculty", "Coordinator2", true);
    }

    @Test
    public void test0465() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0465");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("data/test-users.csv");
        java.util.Optional<com.reservation_system.model.User> userOptional3 = userRepository1.findByEmail("Faculty");
        java.util.Optional<com.reservation_system.model.User> userOptional5 = userRepository1.findByEmail("headlabcoordinator");
        boolean boolean7 = userRepository1.emailExists("Manager1");
        boolean boolean8 = userRepository1.headLabCoordinatorExists();
        boolean boolean9 = userRepository1.headLabCoordinatorExists();
        org.junit.Assert.assertNotNull(userOptional3);
        org.junit.Assert.assertNotNull(userOptional5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test0466() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0466");
        com.reservation_system.model.Guest guest5 = new com.reservation_system.model.Guest((int) '#', "Faculty", "Strong1!", "Guest", false);
    }

    @Test
    public void test0467() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0467");
        com.reservation_system.model.Faculty faculty5 = new com.reservation_system.model.Faculty((int) (byte) -1, "coord2@yorku.ca", "Manager1", "coord2@yorku.ca", false);
        java.lang.String str6 = faculty5.getPassword();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "coord2@yorku.ca" + "'", str6, "coord2@yorku.ca");
    }

    @Test
    public void test0468() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0468");
        com.reservation_system.model.Guest guest5 = new com.reservation_system.model.Guest((int) (byte) -1, "data/test-users.csv", "data/test-users.csv", "", true);
        boolean boolean6 = guest5.requiresDepartmentApproval();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test0469() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0469");
        com.reservation_system.model.LabManager labManager5 = new com.reservation_system.model.LabManager((int) (short) 0, "coord@yorku.ca", "", "Manager1", true);
        int int6 = labManager5.getID();
        java.lang.String str7 = labManager5.getUserType();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "labmanager" + "'", str7, "labmanager");
    }

    @Test
    public void test0470() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0470");
        com.reservation_system.model.Student student5 = new com.reservation_system.model.Student((int) '#', "Coordinator", "Guest", "Strong1!", true);
        java.lang.String str6 = student5.getUserType();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Student" + "'", str6, "Student");
    }

    @Test
    public void test0471() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0471");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("data/test-users.csv");
        boolean boolean3 = userRepository1.emailExists("headlabcoordinator");
        int int4 = userRepository1.getNextID();
        com.reservation_system.repository.UserRepository userRepository6 = new com.reservation_system.repository.UserRepository("data/test-users.csv");
        java.util.Optional<com.reservation_system.model.User> userOptional8 = userRepository6.findByEmail("Faculty");
        java.util.Optional<com.reservation_system.model.User> userOptional10 = userRepository6.findByEmail("headlabcoordinator");
        java.util.List<com.reservation_system.model.User> userList11 = userRepository6.getAllUsers();
        int int12 = userRepository6.getNextID();
        java.util.List<com.reservation_system.model.User> userList13 = userRepository6.getAllUsers();
        userRepository1.saveAllUsers(userList13);
        boolean boolean16 = userRepository1.emailExists("coord@yorku.ca");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
// flaky "57) test0471(com.reservation_system.Randoop.CoordinatorService.RegressionTest0)":         org.junit.Assert.assertTrue("'" + int4 + "' != '" + 101 + "'", int4 == 101);
        org.junit.Assert.assertNotNull(userOptional8);
        org.junit.Assert.assertNotNull(userOptional10);
        org.junit.Assert.assertNotNull(userList11);
// flaky "20) test0471(com.reservation_system.Randoop.CoordinatorService.RegressionTest0)":         org.junit.Assert.assertTrue("'" + int12 + "' != '" + 101 + "'", int12 == 101);
        org.junit.Assert.assertNotNull(userList13);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test0472() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0472");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("data/test-users.csv");
        boolean boolean3 = userRepository1.emailExists("data/test-users.csv");
        java.util.Optional<com.reservation_system.model.User> userOptional5 = userRepository1.findByEmail("coord2@yorku.ca");
        int int6 = userRepository1.getNextID();
        boolean boolean8 = userRepository1.emailExists("Strong1!");
        java.util.Optional<com.reservation_system.model.User> userOptional10 = userRepository1.findByEmail("coord2@yorku.ca");
// flaky "58) test0472(com.reservation_system.Randoop.CoordinatorService.RegressionTest0)":         org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(userOptional5);
// flaky "21) test0472(com.reservation_system.Randoop.CoordinatorService.RegressionTest0)":         org.junit.Assert.assertTrue("'" + int6 + "' != '" + 101 + "'", int6 == 101);
// flaky "7) test0472(com.reservation_system.Randoop.CoordinatorService.RegressionTest0)":         org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(userOptional10);
    }

    @Test
    public void test0473() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0473");
        com.reservation_system.model.Researcher researcher5 = new com.reservation_system.model.Researcher((int) (short) -1, "coord@yorku.ca", "data/test-users.csv", "coord2@yorku.ca", false);
        java.lang.String str6 = researcher5.getUserType();
        java.lang.String str7 = researcher5.getUserType();
        java.lang.String str8 = researcher5.getUserType();
        java.lang.String str9 = researcher5.getUserType();
        java.lang.String str10 = researcher5.getPassword();
        int int11 = researcher5.getID();
        int int12 = researcher5.getID();
        int int13 = researcher5.getID();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Researcher" + "'", str6, "Researcher");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Researcher" + "'", str7, "Researcher");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Researcher" + "'", str8, "Researcher");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Researcher" + "'", str9, "Researcher");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "coord2@yorku.ca" + "'", str10, "coord2@yorku.ca");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
    }

    @Test
    public void test0474() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0474");
        com.reservation_system.model.Guest guest5 = new com.reservation_system.model.Guest((int) (short) 100, "Researcher", "Student", "Coordinator2", true);
        int int6 = guest5.getID();
        java.lang.String str7 = guest5.getUserType();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Guest" + "'", str7, "Guest");
    }

    @Test
    public void test0475() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0475");
        com.reservation_system.model.Researcher researcher5 = new com.reservation_system.model.Researcher((int) (short) 100, "coord2@yorku.ca", "labmanager", "Faculty", true);
    }

    @Test
    public void test0476() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0476");
        com.reservation_system.model.Faculty faculty5 = new com.reservation_system.model.Faculty((int) 'a', "manager1@yorku.ca", "", "Guest", false);
    }

    @Test
    public void test0477() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0477");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("data/test-users.csv");
        boolean boolean3 = userRepository1.emailExists("headlabcoordinator");
        int int4 = userRepository1.getNextID();
        com.reservation_system.repository.UserRepository userRepository6 = new com.reservation_system.repository.UserRepository("data/test-users.csv");
        java.util.Optional<com.reservation_system.model.User> userOptional8 = userRepository6.findByEmail("Faculty");
        java.util.Optional<com.reservation_system.model.User> userOptional10 = userRepository6.findByEmail("headlabcoordinator");
        java.util.List<com.reservation_system.model.User> userList11 = userRepository6.getAllUsers();
        int int12 = userRepository6.getNextID();
        java.util.List<com.reservation_system.model.User> userList13 = userRepository6.getAllUsers();
        userRepository1.saveAllUsers(userList13);
        int int15 = userRepository1.getNextID();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
// flaky "59) test0477(com.reservation_system.Randoop.CoordinatorService.RegressionTest0)":         org.junit.Assert.assertTrue("'" + int4 + "' != '" + 101 + "'", int4 == 101);
        org.junit.Assert.assertNotNull(userOptional8);
        org.junit.Assert.assertNotNull(userOptional10);
        org.junit.Assert.assertNotNull(userList11);
// flaky "22) test0477(com.reservation_system.Randoop.CoordinatorService.RegressionTest0)":         org.junit.Assert.assertTrue("'" + int12 + "' != '" + 101 + "'", int12 == 101);
        org.junit.Assert.assertNotNull(userList13);
// flaky "8) test0477(com.reservation_system.Randoop.CoordinatorService.RegressionTest0)":         org.junit.Assert.assertTrue("'" + int15 + "' != '" + 101 + "'", int15 == 101);
    }

    @Test
    public void test0478() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0478");
        com.reservation_system.model.Faculty faculty5 = new com.reservation_system.model.Faculty(0, "Guest", "labmanager", "Manager1", true);
        boolean boolean6 = faculty5.isApproved();
        boolean boolean7 = faculty5.isApproved();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test0479() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0479");
        com.reservation_system.model.Student student5 = new com.reservation_system.model.Student(10, "Strong1!", "Strong1!", "Student", false);
    }

    @Test
    public void test0480() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0480");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("data/test-users.csv");
        boolean boolean2 = userRepository1.headLabCoordinatorExists();
        boolean boolean3 = userRepository1.headLabCoordinatorExists();
        boolean boolean5 = userRepository1.emailExists("Manager1");
        java.util.Optional<com.reservation_system.model.User> userOptional7 = userRepository1.findByEmail("Researcher");
        java.util.Optional<com.reservation_system.model.User> userOptional9 = userRepository1.findByEmail("Strong1!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(userOptional7);
        org.junit.Assert.assertNotNull(userOptional9);
    }

    @Test
    public void test0481() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0481");
        com.reservation_system.model.Student student5 = new com.reservation_system.model.Student(10, "Manager1", "Faculty", "", true);
        java.lang.String str6 = student5.getEmail();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Faculty" + "'", str6, "Faculty");
    }

    @Test
    public void test0482() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0482");
        // The following exception was thrown during execution in test generation
        try {
            com.reservation_system.model.User user6 = com.reservation_system.patterns.factory.UserFactory.createUser("", (int) (short) 0, "", "Manager1", "headlabcoordinator", false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid user type: ");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0483() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0483");
        com.reservation_system.model.LabManager labManager5 = new com.reservation_system.model.LabManager(10, "hi!", "headlabcoordinator", "Manager1", true);
        java.lang.String str6 = labManager5.getUserType();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "labmanager" + "'", str6, "labmanager");
    }

    @Test
    public void test0484() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0484");
        com.reservation_system.model.Guest guest5 = new com.reservation_system.model.Guest((int) (byte) 100, "Faculty", "hi!", "coord@yorku.ca", true);
        boolean boolean6 = guest5.isApproved();
        guest5.setApproved(false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test0485() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0485");
        com.reservation_system.model.Student student5 = new com.reservation_system.model.Student((int) '#', "Coordinator", "Coordinator", "", false);
        boolean boolean6 = student5.requiresDepartmentApproval();
        java.lang.String str7 = student5.getPassword();
        java.lang.String str8 = student5.getEmail();
        int int9 = student5.getID();
        java.lang.String str10 = student5.getUserType();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Coordinator" + "'", str8, "Coordinator");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 35 + "'", int9 == 35);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Student" + "'", str10, "Student");
    }

    @Test
    public void test0486() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0486");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("data/test-users.csv");
        com.reservation_system.model.Faculty faculty7 = new com.reservation_system.model.Faculty((int) (byte) 1, "", "Guest", "Student", true);
        userRepository1.addUser((com.reservation_system.model.User) faculty7);
        java.util.List<com.reservation_system.model.User> userList9 = userRepository1.getAllUsers();
        int int10 = userRepository1.getNextID();
        com.reservation_system.model.Student student16 = new com.reservation_system.model.Student((int) '#', "Coordinator", "Coordinator", "", false);
        boolean boolean17 = student16.requiresDepartmentApproval();
        java.lang.String str18 = student16.getUserType();
        student16.setApproved(false);
        student16.setApproved(false);
        int int23 = student16.getID();
        userRepository1.addUser((com.reservation_system.model.User) student16);
        java.lang.String str25 = student16.getUserType();
        int int26 = student16.getID();
        org.junit.Assert.assertNotNull(userList9);
// flaky "60) test0486(com.reservation_system.Randoop.CoordinatorService.RegressionTest0)":         org.junit.Assert.assertTrue("'" + int10 + "' != '" + 101 + "'", int10 == 101);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Student" + "'", str18, "Student");
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 35 + "'", int23 == 35);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "Student" + "'", str25, "Student");
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 35 + "'", int26 == 35);
    }

    @Test
    public void test0487() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0487");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("data/test-users.csv");
        com.reservation_system.model.LabManager labManager7 = new com.reservation_system.model.LabManager((int) (short) 0, "", "Faculty", "Student", true);
        java.lang.String str8 = labManager7.getUserType();
        java.lang.String str9 = labManager7.getPassword();
        userRepository1.addUser((com.reservation_system.model.User) labManager7);
        boolean boolean11 = userRepository1.headLabCoordinatorExists();
        com.reservation_system.model.Researcher researcher17 = new com.reservation_system.model.Researcher(0, "Student", "Faculty", "Faculty", false);
        userRepository1.addUser((com.reservation_system.model.User) researcher17);
        com.reservation_system.services.CoordinatorAccountService coordinatorAccountService19 = new com.reservation_system.services.CoordinatorAccountService(userRepository1);
        com.reservation_system.model.Guest guest25 = new com.reservation_system.model.Guest(0, "Guest", "headlabcoordinator", "Faculty", false);
        userRepository1.addUser((com.reservation_system.model.User) guest25);
        java.util.List<com.reservation_system.model.User> userList27 = userRepository1.getAllUsers();
        java.util.Optional<com.reservation_system.model.User> userOptional29 = userRepository1.findByEmail("coord2@yorku.ca");
        com.reservation_system.model.User user30 = null;
        // The following exception was thrown during execution in test generation
        try {
            userRepository1.addUser(user30);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.reservation_system.model.User.getName()\" because \"user\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "labmanager" + "'", str8, "labmanager");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Student" + "'", str9, "Student");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(userList27);
        org.junit.Assert.assertNotNull(userOptional29);
    }

    @Test
    public void test0488() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0488");
        com.reservation_system.model.Student student5 = new com.reservation_system.model.Student((int) (short) 10, "headlabcoordinator", "Strong1!", "Strong1!", true);
        boolean boolean6 = student5.isApproved();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test0489() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0489");
        com.reservation_system.model.Researcher researcher5 = new com.reservation_system.model.Researcher(32, "Guest", "Student", "Researcher", true);
        java.lang.Class<?> wildcardClass6 = researcher5.getClass();
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0490() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0490");
        com.reservation_system.model.HeadLabCoordinator headLabCoordinator5 = new com.reservation_system.model.HeadLabCoordinator((int) (short) 10, "data/test-users.csv", "", "labmanager", false);
        headLabCoordinator5.setApproved(false);
        headLabCoordinator5.setApproved(true);
    }

    @Test
    public void test0491() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0491");
        com.reservation_system.model.Guest guest5 = new com.reservation_system.model.Guest(35, "Student", "", "", false);
    }

    @Test
    public void test0492() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0492");
        com.reservation_system.model.Faculty faculty5 = new com.reservation_system.model.Faculty((int) ' ', "", "coord@yorku.ca", "Researcher", false);
        int int6 = faculty5.getID();
        java.lang.String str7 = faculty5.getUserType();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 32 + "'", int6 == 32);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Faculty" + "'", str7, "Faculty");
    }

    @Test
    public void test0493() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0493");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("data/test-users.csv");
        boolean boolean3 = userRepository1.emailExists("headlabcoordinator");
        com.reservation_system.services.CoordinatorAccountService coordinatorAccountService4 = new com.reservation_system.services.CoordinatorAccountService(userRepository1);
        com.reservation_system.services.CoordinatorAccountService coordinatorAccountService5 = new com.reservation_system.services.CoordinatorAccountService(userRepository1);
        boolean boolean6 = userRepository1.headLabCoordinatorExists();
        com.reservation_system.model.LabManager labManager12 = new com.reservation_system.model.LabManager((int) '4', "manager1@yorku.ca", "Coordinator", "Coordinator", true);
        userRepository1.addUser((com.reservation_system.model.User) labManager12);
        com.reservation_system.repository.UserRepository userRepository15 = new com.reservation_system.repository.UserRepository("data/test-users.csv");
        boolean boolean17 = userRepository15.emailExists("data/test-users.csv");
        java.util.Optional<com.reservation_system.model.User> userOptional19 = userRepository15.findByEmail("Researcher");
        boolean boolean20 = userRepository15.headLabCoordinatorExists();
        com.reservation_system.repository.UserRepository userRepository22 = new com.reservation_system.repository.UserRepository("data/test-users.csv");
        java.util.Optional<com.reservation_system.model.User> userOptional24 = userRepository22.findByEmail("Faculty");
        java.util.Optional<com.reservation_system.model.User> userOptional26 = userRepository22.findByEmail("headlabcoordinator");
        java.util.List<com.reservation_system.model.User> userList27 = userRepository22.getAllUsers();
        userRepository15.saveAllUsers(userList27);
        userRepository1.saveAllUsers(userList27);
        int int30 = userRepository1.getNextID();
        java.util.Optional<com.reservation_system.model.User> userOptional32 = userRepository1.findByEmail("coord2@yorku.ca");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
// flaky "61) test0493(com.reservation_system.Randoop.CoordinatorService.RegressionTest0)":         org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNotNull(userOptional19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertNotNull(userOptional24);
        org.junit.Assert.assertNotNull(userOptional26);
        org.junit.Assert.assertNotNull(userList27);
// flaky "23) test0493(com.reservation_system.Randoop.CoordinatorService.RegressionTest0)":         org.junit.Assert.assertTrue("'" + int30 + "' != '" + 101 + "'", int30 == 101);
        org.junit.Assert.assertNotNull(userOptional32);
    }

    @Test
    public void test0494() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0494");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("data/test-users.csv");
        java.util.Optional<com.reservation_system.model.User> userOptional3 = userRepository1.findByEmail("Faculty");
        java.util.Optional<com.reservation_system.model.User> userOptional5 = userRepository1.findByEmail("headlabcoordinator");
        boolean boolean7 = userRepository1.emailExists("Manager1");
        java.util.List<com.reservation_system.model.User> userList8 = userRepository1.getAllUsers();
        boolean boolean10 = userRepository1.emailExists("");
        com.reservation_system.model.LabManager labManager16 = new com.reservation_system.model.LabManager((int) (short) 0, "", "Faculty", "Student", true);
        java.lang.String str17 = labManager16.getEmail();
        java.lang.String str18 = labManager16.getUserType();
        userRepository1.addUser((com.reservation_system.model.User) labManager16);
        boolean boolean21 = userRepository1.emailExists("labmanager");
        java.util.List<com.reservation_system.model.User> userList22 = userRepository1.getAllUsers();
        boolean boolean23 = userRepository1.headLabCoordinatorExists();
        com.reservation_system.services.CoordinatorAccountService coordinatorAccountService24 = new com.reservation_system.services.CoordinatorAccountService(userRepository1);
        com.reservation_system.services.CoordinatorAccountService coordinatorAccountService25 = new com.reservation_system.services.CoordinatorAccountService(userRepository1);
        com.reservation_system.model.Guest guest31 = new com.reservation_system.model.Guest((int) (byte) 100, "manager1@yorku.ca", "Manager1", "Student", true);
        // The following exception was thrown during execution in test generation
        try {
            com.reservation_system.model.User user35 = coordinatorAccountService25.autoGenerateLabManagerAccount((com.reservation_system.model.User) guest31, "Student", "", "Student");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Email is required.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(userOptional3);
        org.junit.Assert.assertNotNull(userOptional5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(userList8);
// flaky "62) test0494(com.reservation_system.Randoop.CoordinatorService.RegressionTest0)":         org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "Faculty" + "'", str17, "Faculty");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "labmanager" + "'", str18, "labmanager");
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(userList22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
    }

    @Test
    public void test0495() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0495");
        com.reservation_system.model.Faculty faculty5 = new com.reservation_system.model.Faculty((int) (short) 0, "labmanager", "Researcher", "hi!", true);
        java.lang.String str6 = faculty5.getEmail();
        java.lang.String str7 = faculty5.getEmail();
        faculty5.setApproved(true);
        int int10 = faculty5.getID();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Researcher" + "'", str6, "Researcher");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Researcher" + "'", str7, "Researcher");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test0496() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0496");
        com.reservation_system.model.Student student5 = new com.reservation_system.model.Student(101, "coord2@yorku.ca", "coord@yorku.ca", "manager1@yorku.ca", false);
    }

    @Test
    public void test0497() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0497");
        com.reservation_system.model.LabManager labManager5 = new com.reservation_system.model.LabManager((int) 'a', "Researcher", "hi!", "Student", true);
    }

    @Test
    public void test0498() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0498");
        com.reservation_system.model.Guest guest5 = new com.reservation_system.model.Guest((int) (short) 0, "Manager1", "Coordinator2", "", true);
        java.lang.String str6 = guest5.getPassword();
        boolean boolean7 = guest5.isApproved();
        int int8 = guest5.getID();
        java.lang.String str9 = guest5.getUserType();
        int int10 = guest5.getID();
        boolean boolean11 = guest5.requiresDepartmentApproval();
        java.lang.String str12 = guest5.getPassword();
        int int13 = guest5.getID();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Guest" + "'", str9, "Guest");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
    }

    @Test
    public void test0499() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0499");
        com.reservation_system.model.Researcher researcher5 = new com.reservation_system.model.Researcher((int) (byte) -1, "Manager1", "", "Strong1!", true);
        boolean boolean6 = researcher5.isApproved();
        java.lang.String str7 = researcher5.getPassword();
        java.lang.String str8 = researcher5.getPassword();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Strong1!" + "'", str7, "Strong1!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Strong1!" + "'", str8, "Strong1!");
    }

    @Test
    public void test0500() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0500");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("data/test-users.csv");
        com.reservation_system.model.LabManager labManager7 = new com.reservation_system.model.LabManager((int) (short) 0, "", "Faculty", "Student", true);
        java.lang.String str8 = labManager7.getUserType();
        java.lang.String str9 = labManager7.getPassword();
        userRepository1.addUser((com.reservation_system.model.User) labManager7);
        boolean boolean11 = userRepository1.headLabCoordinatorExists();
        com.reservation_system.model.Researcher researcher17 = new com.reservation_system.model.Researcher(0, "Student", "Faculty", "Faculty", false);
        userRepository1.addUser((com.reservation_system.model.User) researcher17);
        java.util.Optional<com.reservation_system.model.User> userOptional20 = userRepository1.findByEmail("data/test-users.csv");
        com.reservation_system.services.CoordinatorAccountService coordinatorAccountService21 = new com.reservation_system.services.CoordinatorAccountService(userRepository1);
        java.util.Optional<com.reservation_system.model.User> userOptional23 = userRepository1.findByEmail("Strong1!");
        java.util.List<com.reservation_system.model.User> userList24 = userRepository1.getAllUsers();
        com.reservation_system.services.CoordinatorAccountService coordinatorAccountService25 = new com.reservation_system.services.CoordinatorAccountService(userRepository1);
        com.reservation_system.model.LabManager labManager31 = new com.reservation_system.model.LabManager(10, "hi!", "headlabcoordinator", "Manager1", true);
        int int32 = labManager31.getID();
        // The following exception was thrown during execution in test generation
        try {
            com.reservation_system.model.User user36 = coordinatorAccountService25.autoGenerateLabManagerAccount((com.reservation_system.model.User) labManager31, "labmanager", "Manager1", "");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Password is required.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "labmanager" + "'", str8, "labmanager");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Student" + "'", str9, "Student");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(userOptional20);
        org.junit.Assert.assertNotNull(userOptional23);
        org.junit.Assert.assertNotNull(userList24);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 10 + "'", int32 == 10);
    }
}
