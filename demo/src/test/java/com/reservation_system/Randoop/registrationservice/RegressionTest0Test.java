package com.reservation_system.Randoop.registrationservice;

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
        // The following exception was thrown during execution in test generation
        try {
            com.reservation_system.model.User user6 = com.reservation_system.patterns.factory.UserFactory.createUser("", (-1), "andrew@example.com", "researcher", "Password1!", true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid user type: ");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0002");
        com.reservation_system.model.Researcher researcher5 = new com.reservation_system.model.Researcher((int) (short) -1, "andrew@example.com", "guest", "labmanager", false);
        java.lang.Class<?> wildcardClass6 = researcher5.getClass();
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0003");
        com.reservation_system.model.Researcher researcher5 = new com.reservation_system.model.Researcher((int) (short) -1, "andrew@example.com", "guest", "labmanager", false);
        java.lang.String str6 = researcher5.getUserType();
        java.lang.Class<?> wildcardClass7 = researcher5.getClass();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Researcher" + "'", str6, "Researcher");
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0004");
        com.reservation_system.model.Faculty faculty5 = new com.reservation_system.model.Faculty(10, "researcher", "faculty", "", false);
        java.lang.Class<?> wildcardClass6 = faculty5.getClass();
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0005");
        com.reservation_system.patterns.factory.UserFactory userFactory0 = new com.reservation_system.patterns.factory.UserFactory();
    }

    @Test
    public void test0006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0006");
        com.reservation_system.model.Researcher researcher5 = new com.reservation_system.model.Researcher((int) (short) -1, "faculty", "researcher", "hi!", true);
        researcher5.setApproved(false);
        java.lang.String str8 = researcher5.getName();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "faculty" + "'", str8, "faculty");
    }

    @Test
    public void test0007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0007");
        com.reservation_system.model.Faculty faculty5 = new com.reservation_system.model.Faculty((int) (byte) -1, "guest", "Faculty", "Andrew", true);
    }

    @Test
    public void test0008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0008");
        // The following exception was thrown during execution in test generation
        try {
            com.reservation_system.model.User user6 = com.reservation_system.patterns.factory.UserFactory.createUser("Password1!", 1, "student", "Student", "researcher", false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid user type: Password1!");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0009");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("demo/data/test-users.csv");
        com.reservation_system.services.RegistrationService registrationService2 = new com.reservation_system.services.RegistrationService(userRepository1);
        // The following exception was thrown during execution in test generation
        try {
            com.reservation_system.model.User user7 = registrationService2.registerUser("andrew@example.com", "", "labmanager", "demo/data/test-users.csv");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid user type.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0010");
        com.reservation_system.model.Researcher researcher5 = new com.reservation_system.model.Researcher((int) (short) -1, "faculty", "researcher", "hi!", true);
        java.lang.String str6 = researcher5.getName();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "faculty" + "'", str6, "faculty");
    }

    @Test
    public void test0011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0011");
        com.reservation_system.model.Researcher researcher5 = new com.reservation_system.model.Researcher((int) (short) -1, "faculty", "researcher", "hi!", true);
        java.lang.String str6 = researcher5.getUserType();
        java.lang.String str7 = researcher5.getEmail();
        java.lang.String str8 = researcher5.getEmail();
        java.lang.Class<?> wildcardClass9 = researcher5.getClass();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Researcher" + "'", str6, "Researcher");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "researcher" + "'", str7, "researcher");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "researcher" + "'", str8, "researcher");
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0012");
        // The following exception was thrown during execution in test generation
        try {
            com.reservation_system.model.User user6 = com.reservation_system.patterns.factory.UserFactory.createUser("demo/data/test-users.csv", (int) (byte) 0, "guest", "demo/data/test-users.csv", "hi!", false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid user type: demo/data/test-users.csv");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0013");
        com.reservation_system.repository.UserRepository userRepository0 = null;
        com.reservation_system.services.RegistrationService registrationService1 = new com.reservation_system.services.RegistrationService(userRepository0);
        // The following exception was thrown during execution in test generation
        try {
            com.reservation_system.model.User user6 = registrationService1.registerUser("researcher", "demo/data/test-users.csv", "", "");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Email is required.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0014");
        // The following exception was thrown during execution in test generation
        try {
            com.reservation_system.model.User user6 = com.reservation_system.patterns.factory.UserFactory.createUser("Andrew", (-1), "", "demo/data/test-users.csv", "andrew@example.com", false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid user type: Andrew");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0015");
        com.reservation_system.model.Student student5 = new com.reservation_system.model.Student((int) (short) -1, "Andrew", "Guest", "Faculty", true);
        java.lang.Class<?> wildcardClass6 = student5.getClass();
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0016");
        com.reservation_system.model.User user6 = com.reservation_system.patterns.factory.UserFactory.createUser("headlabcoordinator", (int) (short) 10, "Researcher", "Researcher", "student", true);
        org.junit.Assert.assertNotNull(user6);
    }

    @Test
    public void test0017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0017");
        com.reservation_system.model.LabManager labManager5 = new com.reservation_system.model.LabManager((int) 'a', "headlabcoordinator", "Researcher", "Andrew", false);
        java.lang.String str6 = labManager5.getUserType();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "labmanager" + "'", str6, "labmanager");
    }

    @Test
    public void test0018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0018");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("demo/data/test-users.csv");
        com.reservation_system.services.RegistrationService registrationService2 = new com.reservation_system.services.RegistrationService(userRepository1);
        // The following exception was thrown during execution in test generation
        try {
            com.reservation_system.model.User user7 = registrationService2.registerUser("demo/data/test-users.csv", "Faculty", "labmanager", "andrew@example.com");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid user type.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0019");
        com.reservation_system.model.Researcher researcher5 = new com.reservation_system.model.Researcher((int) (short) -1, "andrew@example.com", "guest", "labmanager", false);
        java.lang.String str6 = researcher5.getPassword();
        researcher5.setApproved(true);
        researcher5.setApproved(true);
        java.lang.String str11 = researcher5.getUserType();
        int int12 = researcher5.getID();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "labmanager" + "'", str6, "labmanager");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Researcher" + "'", str11, "Researcher");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
    }

    @Test
    public void test0020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0020");
        com.reservation_system.model.Researcher researcher5 = new com.reservation_system.model.Researcher((int) (short) -1, "andrew@example.com", "guest", "labmanager", false);
        java.lang.String str6 = researcher5.getPassword();
        researcher5.setApproved(true);
        researcher5.setApproved(true);
        java.lang.String str11 = researcher5.getUserType();
        java.lang.Class<?> wildcardClass12 = researcher5.getClass();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "labmanager" + "'", str6, "labmanager");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Researcher" + "'", str11, "Researcher");
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0021");
        // The following exception was thrown during execution in test generation
        try {
            com.reservation_system.model.User user6 = com.reservation_system.patterns.factory.UserFactory.createUser("", (int) (short) 0, "Student", "demo/data/test-users.csv", "Password1!", true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid user type: ");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0022");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("demo/data/test-users.csv");
        com.reservation_system.services.RegistrationService registrationService2 = new com.reservation_system.services.RegistrationService(userRepository1);
        int int3 = userRepository1.getNextID();
        java.util.Optional<com.reservation_system.model.User> userOptional5 = userRepository1.findByEmail("Student");
// flaky "1) test0022(com.reservation_system.randoop.registrationservice.RegressionTest0)":         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 102 + "'", int3 == 102);
        org.junit.Assert.assertNotNull(userOptional5);
    }

    @Test
    public void test0023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0023");
        com.reservation_system.model.Researcher researcher5 = new com.reservation_system.model.Researcher((int) (byte) 100, "Password1!", "Password1!", "headlabcoordinator", true);
        java.lang.Class<?> wildcardClass6 = researcher5.getClass();
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0024");
        com.reservation_system.model.HeadLabCoordinator headLabCoordinator5 = new com.reservation_system.model.HeadLabCoordinator((int) '4', "headlabcoordinator", "demo/data/test-users.csv", "andrew@example.com", true);
    }

    @Test
    public void test0025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0025");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("demo/data/test-users.csv");
        com.reservation_system.services.RegistrationService registrationService2 = new com.reservation_system.services.RegistrationService(userRepository1);
        com.reservation_system.model.Faculty faculty8 = new com.reservation_system.model.Faculty(0, "Password1!", "demo/data/test-users.csv", "researcher", false);
        java.lang.String str9 = faculty8.getName();
        userRepository1.addUser((com.reservation_system.model.User) faculty8);
        boolean boolean11 = userRepository1.headLabCoordinatorExists();
        com.reservation_system.services.RegistrationService registrationService12 = new com.reservation_system.services.RegistrationService(userRepository1);
        // The following exception was thrown during execution in test generation
        try {
            com.reservation_system.model.User user17 = registrationService12.registerUser("Student", "andrew@example.com", "hi!", "student");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid email format.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Password1!" + "'", str9, "Password1!");
// flaky "2) test0025(com.reservation_system.randoop.registrationservice.RegressionTest0)":         org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test0026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0026");
        com.reservation_system.model.Researcher researcher5 = new com.reservation_system.model.Researcher((int) (short) -1, "faculty", "researcher", "hi!", true);
        researcher5.setApproved(false);
        boolean boolean8 = researcher5.requiresDepartmentApproval();
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test0027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0027");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("demo/data/test-users.csv");
        com.reservation_system.services.RegistrationService registrationService2 = new com.reservation_system.services.RegistrationService(userRepository1);
        com.reservation_system.model.Faculty faculty8 = new com.reservation_system.model.Faculty(0, "Password1!", "demo/data/test-users.csv", "researcher", false);
        java.lang.String str9 = faculty8.getName();
        userRepository1.addUser((com.reservation_system.model.User) faculty8);
        boolean boolean11 = userRepository1.headLabCoordinatorExists();
        com.reservation_system.model.Guest guest17 = new com.reservation_system.model.Guest((int) (byte) -1, "guest", "Researcher", "Faculty", true);
        userRepository1.addUser((com.reservation_system.model.User) guest17);
        boolean boolean20 = userRepository1.emailExists("Password1!");
        boolean boolean22 = userRepository1.emailExists("researcher");
        boolean boolean23 = userRepository1.headLabCoordinatorExists();
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Password1!" + "'", str9, "Password1!");
// flaky "3) test0027(com.reservation_system.randoop.registrationservice.RegressionTest0)":         org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
// flaky "1) test0027(com.reservation_system.randoop.registrationservice.RegressionTest0)":         org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
// flaky "1) test0027(com.reservation_system.randoop.registrationservice.RegressionTest0)":         org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
    }

    @Test
    public void test0028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0028");
        com.reservation_system.model.Guest guest5 = new com.reservation_system.model.Guest(102, "demo/data/test-users.csv", "Researcher", "Password1!", false);
    }

    @Test
    public void test0029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0029");
        com.reservation_system.model.Researcher researcher5 = new com.reservation_system.model.Researcher((int) (short) -1, "andrew@example.com", "guest", "labmanager", false);
        java.lang.String str6 = researcher5.getUserType();
        java.lang.String str7 = researcher5.getName();
        java.lang.String str8 = researcher5.getUserType();
        java.lang.String str9 = researcher5.getUserType();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Researcher" + "'", str6, "Researcher");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Researcher" + "'", str8, "Researcher");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Researcher" + "'", str9, "Researcher");
    }

    @Test
    public void test0030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0030");
        com.reservation_system.model.HeadLabCoordinator headLabCoordinator5 = new com.reservation_system.model.HeadLabCoordinator(1, "student", "Researcher", "", false);
        java.lang.String str6 = headLabCoordinator5.getUserType();
        java.lang.String str7 = headLabCoordinator5.getUserType();
        java.lang.Class<?> wildcardClass8 = headLabCoordinator5.getClass();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "headlabcoordinator" + "'", str6, "headlabcoordinator");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "headlabcoordinator" + "'", str7, "headlabcoordinator");
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0031");
        com.reservation_system.model.Faculty faculty5 = new com.reservation_system.model.Faculty(0, "Password1!", "demo/data/test-users.csv", "researcher", false);
        boolean boolean6 = faculty5.requiresDepartmentApproval();
        java.lang.String str7 = faculty5.getName();
        java.lang.String str8 = faculty5.getUserType();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Password1!" + "'", str7, "Password1!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Faculty" + "'", str8, "Faculty");
    }

    @Test
    public void test0032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0032");
        // The following exception was thrown during execution in test generation
        try {
            com.reservation_system.model.User user6 = com.reservation_system.patterns.factory.UserFactory.createUser("hi!", (int) (byte) 0, "Faculty", "labmanager", "Andrew", false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid user type: hi!");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0033");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("demo/data/test-users.csv");
        com.reservation_system.services.RegistrationService registrationService2 = new com.reservation_system.services.RegistrationService(userRepository1);
        com.reservation_system.model.Faculty faculty8 = new com.reservation_system.model.Faculty(0, "Password1!", "demo/data/test-users.csv", "researcher", false);
        java.lang.String str9 = faculty8.getName();
        userRepository1.addUser((com.reservation_system.model.User) faculty8);
        boolean boolean11 = userRepository1.headLabCoordinatorExists();
        com.reservation_system.services.RegistrationService registrationService12 = new com.reservation_system.services.RegistrationService(userRepository1);
        // The following exception was thrown during execution in test generation
        try {
            com.reservation_system.model.User user17 = registrationService12.registerUser("researcher", "", "Student", "Password1!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Name is required.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Password1!" + "'", str9, "Password1!");
// flaky "4) test0033(com.reservation_system.randoop.registrationservice.RegressionTest0)":         org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test0034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0034");
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
        java.lang.Class<?> wildcardClass23 = userRepository1.getClass();
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Password1!" + "'", str9, "Password1!");
// flaky "5) test0034(com.reservation_system.randoop.registrationservice.RegressionTest0)":         org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
// flaky "2) test0034(com.reservation_system.randoop.registrationservice.RegressionTest0)":         org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
// flaky "2) test0034(com.reservation_system.randoop.registrationservice.RegressionTest0)":         org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test0035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0035");
        com.reservation_system.model.Researcher researcher5 = new com.reservation_system.model.Researcher(0, "demo/data/test-users.csv", "Andrew", "", true);
    }

    @Test
    public void test0036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0036");
        com.reservation_system.model.Researcher researcher5 = new com.reservation_system.model.Researcher((int) (short) -1, "faculty", "researcher", "hi!", true);
        java.lang.String str6 = researcher5.getUserType();
        boolean boolean7 = researcher5.requiresDepartmentApproval();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Researcher" + "'", str6, "Researcher");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test0037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0037");
        com.reservation_system.model.Researcher researcher5 = new com.reservation_system.model.Researcher(0, "labmanager", "", "labmanager", false);
        java.lang.String str6 = researcher5.getEmail();
        java.lang.Class<?> wildcardClass7 = researcher5.getClass();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0038");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("demo/data/test-users.csv");
        com.reservation_system.services.RegistrationService registrationService2 = new com.reservation_system.services.RegistrationService(userRepository1);
        // The following exception was thrown during execution in test generation
        try {
            com.reservation_system.model.User user7 = registrationService2.registerUser("researcher", "Guest", "faculty", "faculty");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid email format.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0039");
        com.reservation_system.model.Researcher researcher5 = new com.reservation_system.model.Researcher((int) (short) -1, "andrew@example.com", "guest", "labmanager", false);
        java.lang.String str6 = researcher5.getUserType();
        java.lang.String str7 = researcher5.getName();
        boolean boolean8 = researcher5.requiresDepartmentApproval();
        boolean boolean9 = researcher5.requiresDepartmentApproval();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Researcher" + "'", str6, "Researcher");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test0040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0040");
        com.reservation_system.model.Guest guest5 = new com.reservation_system.model.Guest((int) (byte) -1, "guest", "Researcher", "Faculty", true);
        java.lang.String str6 = guest5.getUserType();
        java.lang.String str7 = guest5.getName();
        java.lang.String str8 = guest5.getEmail();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Guest" + "'", str6, "Guest");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "guest" + "'", str7, "guest");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Researcher" + "'", str8, "Researcher");
    }

    @Test
    public void test0041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0041");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("demo/data/test-users.csv");
        com.reservation_system.services.RegistrationService registrationService2 = new com.reservation_system.services.RegistrationService(userRepository1);
        com.reservation_system.model.Faculty faculty8 = new com.reservation_system.model.Faculty(0, "Password1!", "demo/data/test-users.csv", "researcher", false);
        java.lang.String str9 = faculty8.getName();
        userRepository1.addUser((com.reservation_system.model.User) faculty8);
        com.reservation_system.model.User user11 = null;
        // The following exception was thrown during execution in test generation
        try {
            userRepository1.addUser(user11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.reservation_system.model.User.getName()\" because \"user\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Password1!" + "'", str9, "Password1!");
    }

    @Test
    public void test0042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0042");
        com.reservation_system.model.Faculty faculty5 = new com.reservation_system.model.Faculty(0, "Password1!", "demo/data/test-users.csv", "researcher", false);
        boolean boolean6 = faculty5.requiresDepartmentApproval();
        java.lang.String str7 = faculty5.getName();
        faculty5.setApproved(true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Password1!" + "'", str7, "Password1!");
    }

    @Test
    public void test0043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0043");
        com.reservation_system.model.HeadLabCoordinator headLabCoordinator5 = new com.reservation_system.model.HeadLabCoordinator((int) (byte) 1, "hi!", "Guest", "Andrew", false);
        java.lang.Class<?> wildcardClass6 = headLabCoordinator5.getClass();
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0044");
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
        // The following exception was thrown during execution in test generation
        try {
            com.reservation_system.model.User user25 = registrationService20.registerUser("Researcher", "Guest", "", "guest");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Email is required.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Password1!" + "'", str9, "Password1!");
// flaky "6) test0044(com.reservation_system.randoop.registrationservice.RegressionTest0)":         org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
// flaky "3) test0044(com.reservation_system.randoop.registrationservice.RegressionTest0)":         org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
    }

    @Test
    public void test0045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0045");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("demo/data/test-users.csv");
        com.reservation_system.services.RegistrationService registrationService2 = new com.reservation_system.services.RegistrationService(userRepository1);
        // The following exception was thrown during execution in test generation
        try {
            com.reservation_system.model.User user7 = registrationService2.registerUser("labmanager", "demo/data/test-users.csv", "Faculty", "guest");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Lab manager accounts must be generated by the head lab coordinator.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0046");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("demo/data/test-users.csv");
        com.reservation_system.services.RegistrationService registrationService2 = new com.reservation_system.services.RegistrationService(userRepository1);
        com.reservation_system.model.Faculty faculty8 = new com.reservation_system.model.Faculty(0, "Password1!", "demo/data/test-users.csv", "researcher", false);
        java.lang.String str9 = faculty8.getName();
        userRepository1.addUser((com.reservation_system.model.User) faculty8);
        boolean boolean11 = userRepository1.headLabCoordinatorExists();
        com.reservation_system.services.RegistrationService registrationService12 = new com.reservation_system.services.RegistrationService(userRepository1);
        com.reservation_system.model.Researcher researcher18 = new com.reservation_system.model.Researcher((int) '4', "labmanager", "Andrew", "researcher", true);
        userRepository1.addUser((com.reservation_system.model.User) researcher18);
        java.util.Optional<com.reservation_system.model.User> userOptional21 = userRepository1.findByEmail("student");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Password1!" + "'", str9, "Password1!");
// flaky "7) test0046(com.reservation_system.randoop.registrationservice.RegressionTest0)":         org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(userOptional21);
    }

    @Test
    public void test0047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0047");
        com.reservation_system.model.Researcher researcher5 = new com.reservation_system.model.Researcher((int) (short) -1, "andrew@example.com", "guest", "labmanager", false);
        java.lang.String str6 = researcher5.getPassword();
        researcher5.setApproved(true);
        java.lang.Class<?> wildcardClass9 = researcher5.getClass();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "labmanager" + "'", str6, "labmanager");
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0048");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("demo/data/test-users.csv");
        com.reservation_system.services.RegistrationService registrationService2 = new com.reservation_system.services.RegistrationService(userRepository1);
        com.reservation_system.model.Faculty faculty8 = new com.reservation_system.model.Faculty(0, "Password1!", "demo/data/test-users.csv", "researcher", false);
        java.lang.String str9 = faculty8.getName();
        userRepository1.addUser((com.reservation_system.model.User) faculty8);
        com.reservation_system.services.RegistrationService registrationService11 = new com.reservation_system.services.RegistrationService(userRepository1);
        com.reservation_system.services.RegistrationService registrationService12 = new com.reservation_system.services.RegistrationService(userRepository1);
        // The following exception was thrown during execution in test generation
        try {
            com.reservation_system.model.User user17 = registrationService12.registerUser("", "", "demo/data/test-users.csv", "student");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid user type.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Password1!" + "'", str9, "Password1!");
    }

    @Test
    public void test0049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0049");
        com.reservation_system.model.Faculty faculty5 = new com.reservation_system.model.Faculty((int) (short) -1, "faculty", "demo/data/test-users.csv", "Andrew", false);
    }

    @Test
    public void test0050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0050");
        // The following exception was thrown during execution in test generation
        try {
            com.reservation_system.model.User user6 = com.reservation_system.patterns.factory.UserFactory.createUser("hi!", 1, "Researcher", "andrew@example.com", "Researcher", false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid user type: hi!");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0051");
        com.reservation_system.model.HeadLabCoordinator headLabCoordinator5 = new com.reservation_system.model.HeadLabCoordinator(1, "student", "Researcher", "", false);
        java.lang.String str6 = headLabCoordinator5.getUserType();
        java.lang.String str7 = headLabCoordinator5.getUserType();
        java.lang.String str8 = headLabCoordinator5.getName();
        int int9 = headLabCoordinator5.getID();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "headlabcoordinator" + "'", str6, "headlabcoordinator");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "headlabcoordinator" + "'", str7, "headlabcoordinator");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "student" + "'", str8, "student");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
    }

    @Test
    public void test0052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0052");
        com.reservation_system.model.HeadLabCoordinator headLabCoordinator5 = new com.reservation_system.model.HeadLabCoordinator(10, "faculty", "Faculty", "demo/data/test-users.csv", false);
        java.lang.String str6 = headLabCoordinator5.getUserType();
        boolean boolean7 = headLabCoordinator5.isApproved();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "headlabcoordinator" + "'", str6, "headlabcoordinator");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test0053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0053");
        com.reservation_system.model.Researcher researcher5 = new com.reservation_system.model.Researcher((int) (short) -1, "andrew@example.com", "guest", "labmanager", false);
        java.lang.String str6 = researcher5.getPassword();
        boolean boolean7 = researcher5.requiresDepartmentApproval();
        java.lang.String str8 = researcher5.getUserType();
        int int9 = researcher5.getID();
        java.lang.String str10 = researcher5.getEmail();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "labmanager" + "'", str6, "labmanager");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Researcher" + "'", str8, "Researcher");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "guest" + "'", str10, "guest");
    }

    @Test
    public void test0054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0054");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("demo/data/test-users.csv");
        com.reservation_system.services.RegistrationService registrationService2 = new com.reservation_system.services.RegistrationService(userRepository1);
        com.reservation_system.services.RegistrationService registrationService3 = new com.reservation_system.services.RegistrationService(userRepository1);
        // The following exception was thrown during execution in test generation
        try {
            com.reservation_system.model.User user8 = registrationService3.registerUser("Andrew", "guest", "labmanager", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid user type.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0055");
        com.reservation_system.repository.UserRepository userRepository0 = null;
        com.reservation_system.services.RegistrationService registrationService1 = new com.reservation_system.services.RegistrationService(userRepository0);
        // The following exception was thrown during execution in test generation
        try {
            com.reservation_system.model.User user6 = registrationService1.registerUser("Password1!", "guest", "Andrew", "Researcher");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid user type.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0056");
        com.reservation_system.model.Student student5 = new com.reservation_system.model.Student((int) (short) 1, "labmanager", "", "", true);
        int int6 = student5.getID();
        java.lang.String str7 = student5.getUserType();
        java.lang.Class<?> wildcardClass8 = student5.getClass();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Student" + "'", str7, "Student");
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0057");
        com.reservation_system.model.HeadLabCoordinator headLabCoordinator5 = new com.reservation_system.model.HeadLabCoordinator(0, "Password1!", "Faculty", "Faculty", false);
        java.lang.String str6 = headLabCoordinator5.getUserType();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "headlabcoordinator" + "'", str6, "headlabcoordinator");
    }

    @Test
    public void test0058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0058");
        com.reservation_system.model.Researcher researcher5 = new com.reservation_system.model.Researcher((int) (short) 1, "Andrew", "faculty", "guest", true);
        java.lang.String str6 = researcher5.getUserType();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Researcher" + "'", str6, "Researcher");
    }

    @Test
    public void test0059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0059");
        com.reservation_system.model.Faculty faculty5 = new com.reservation_system.model.Faculty(100, "", "andrew@example.com", "Guest", true);
        java.lang.String str6 = faculty5.getUserType();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Faculty" + "'", str6, "Faculty");
    }

    @Test
    public void test0060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0060");
        com.reservation_system.model.LabManager labManager5 = new com.reservation_system.model.LabManager(0, "", "Researcher", "demo/data/test-users.csv", true);
    }

    @Test
    public void test0061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0061");
        com.reservation_system.model.LabManager labManager5 = new com.reservation_system.model.LabManager((int) '4', "Student", "", "guest", false);
        java.lang.String str6 = labManager5.getUserType();
        java.lang.String str7 = labManager5.getUserType();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "labmanager" + "'", str6, "labmanager");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "labmanager" + "'", str7, "labmanager");
    }

    @Test
    public void test0062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0062");
        com.reservation_system.model.HeadLabCoordinator headLabCoordinator5 = new com.reservation_system.model.HeadLabCoordinator((int) (byte) 100, "researcher", "", "", false);
    }

    @Test
    public void test0063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0063");
        com.reservation_system.model.Student student5 = new com.reservation_system.model.Student((int) ' ', "", "labmanager", "headlabcoordinator", true);
        java.lang.String str6 = student5.getUserType();
        java.lang.String str7 = student5.getUserType();
        java.lang.String str8 = student5.getUserType();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Student" + "'", str6, "Student");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Student" + "'", str7, "Student");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Student" + "'", str8, "Student");
    }

    @Test
    public void test0064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0064");
        com.reservation_system.model.Student student5 = new com.reservation_system.model.Student((int) (byte) -1, "faculty", "Faculty", "Student", false);
        java.lang.String str6 = student5.getUserType();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Student" + "'", str6, "Student");
    }

    @Test
    public void test0065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0065");
        com.reservation_system.model.Guest guest5 = new com.reservation_system.model.Guest((int) (byte) 100, "andrew@example.com", "student", "Researcher", false);
        java.lang.String str6 = guest5.getEmail();
        guest5.setApproved(false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "student" + "'", str6, "student");
    }

    @Test
    public void test0066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0066");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("demo/data/test-users.csv");
        java.util.List<com.reservation_system.model.User> userList2 = userRepository1.getAllUsers();
        com.reservation_system.services.RegistrationService registrationService3 = new com.reservation_system.services.RegistrationService(userRepository1);
        java.util.List<com.reservation_system.model.User> userList4 = userRepository1.getAllUsers();
        boolean boolean6 = userRepository1.emailExists("Guest");
        java.util.List<com.reservation_system.model.User> userList7 = userRepository1.getAllUsers();
        boolean boolean9 = userRepository1.emailExists("researcher");
        org.junit.Assert.assertNotNull(userList2);
        org.junit.Assert.assertNotNull(userList4);
// flaky "8) test0066(com.reservation_system.randoop.registrationservice.RegressionTest0)":         org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(userList7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test0067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0067");
        com.reservation_system.model.HeadLabCoordinator headLabCoordinator5 = new com.reservation_system.model.HeadLabCoordinator(10, "researcher", "headlabcoordinator", "faculty", false);
        headLabCoordinator5.setApproved(true);
    }

    @Test
    public void test0068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0068");
        com.reservation_system.model.LabManager labManager5 = new com.reservation_system.model.LabManager((int) (short) 100, "guest", "Password1!", "Researcher", false);
        java.lang.String str6 = labManager5.getUserType();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "labmanager" + "'", str6, "labmanager");
    }

    @Test
    public void test0069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0069");
        com.reservation_system.model.Faculty faculty5 = new com.reservation_system.model.Faculty((int) (byte) 10, "guest", "Faculty", "Password1!", false);
    }

    @Test
    public void test0070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0070");
        // The following exception was thrown during execution in test generation
        try {
            com.reservation_system.model.User user6 = com.reservation_system.patterns.factory.UserFactory.createUser("hi!", (int) (short) -1, "guest", "labmanager", "hi!", false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid user type: hi!");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0071");
        com.reservation_system.model.Guest guest5 = new com.reservation_system.model.Guest(102, "headlabcoordinator", "Faculty", "Researcher", false);
    }

    @Test
    public void test0072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0072");
        com.reservation_system.model.Researcher researcher5 = new com.reservation_system.model.Researcher((int) (short) -1, "faculty", "researcher", "hi!", true);
        java.lang.String str6 = researcher5.getUserType();
        java.lang.String str7 = researcher5.getEmail();
        researcher5.setApproved(true);
        boolean boolean10 = researcher5.requiresDepartmentApproval();
        java.lang.String str11 = researcher5.getName();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Researcher" + "'", str6, "Researcher");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "researcher" + "'", str7, "researcher");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "faculty" + "'", str11, "faculty");
    }

    @Test
    public void test0073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0073");
        com.reservation_system.model.LabManager labManager5 = new com.reservation_system.model.LabManager(0, "faculty", "Andrew", "labmanager", true);
    }

    @Test
    public void test0074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0074");
        com.reservation_system.model.Faculty faculty5 = new com.reservation_system.model.Faculty((int) (byte) 1, "guest", "", "headlabcoordinator", false);
        boolean boolean6 = faculty5.requiresDepartmentApproval();
        java.lang.Class<?> wildcardClass7 = faculty5.getClass();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0075");
        com.reservation_system.model.Faculty faculty5 = new com.reservation_system.model.Faculty((int) '#', "student", "student", "Researcher", false);
    }

    @Test
    public void test0076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0076");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("demo/data/test-users.csv");
        boolean boolean2 = userRepository1.headLabCoordinatorExists();
        com.reservation_system.services.RegistrationService registrationService3 = new com.reservation_system.services.RegistrationService(userRepository1);
        boolean boolean4 = userRepository1.headLabCoordinatorExists();
        boolean boolean6 = userRepository1.emailExists("Andrew");
        com.reservation_system.services.RegistrationService registrationService7 = new com.reservation_system.services.RegistrationService(userRepository1);
        // The following exception was thrown during execution in test generation
        try {
            com.reservation_system.model.User user12 = registrationService7.registerUser("Student", "labmanager", "Andrew", "labmanager");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid email format.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
// flaky "9) test0076(com.reservation_system.randoop.registrationservice.RegressionTest0)":         org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
// flaky "4) test0076(com.reservation_system.randoop.registrationservice.RegressionTest0)":         org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test0077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0077");
        com.reservation_system.model.HeadLabCoordinator headLabCoordinator5 = new com.reservation_system.model.HeadLabCoordinator(52, "hi!", "headlabcoordinator", "Student", true);
    }

    @Test
    public void test0078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0078");
        com.reservation_system.model.Faculty faculty5 = new com.reservation_system.model.Faculty((int) ' ', "", "Faculty", "demo/data/test-users.csv", false);
        boolean boolean6 = faculty5.isApproved();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test0079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0079");
        com.reservation_system.model.Researcher researcher5 = new com.reservation_system.model.Researcher((int) (short) -1, "andrew@example.com", "guest", "labmanager", false);
        java.lang.String str6 = researcher5.getPassword();
        boolean boolean7 = researcher5.requiresDepartmentApproval();
        java.lang.String str8 = researcher5.getUserType();
        int int9 = researcher5.getID();
        java.lang.Class<?> wildcardClass10 = researcher5.getClass();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "labmanager" + "'", str6, "labmanager");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Researcher" + "'", str8, "Researcher");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0080");
        com.reservation_system.model.Researcher researcher5 = new com.reservation_system.model.Researcher((int) (byte) 1, "Password1!", "headlabcoordinator", "headlabcoordinator", false);
    }

    @Test
    public void test0081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0081");
        com.reservation_system.model.LabManager labManager5 = new com.reservation_system.model.LabManager((int) (byte) 10, "researcher", "guest", "researcher", false);
        java.lang.String str6 = labManager5.getPassword();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "researcher" + "'", str6, "researcher");
    }

    @Test
    public void test0082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0082");
        com.reservation_system.model.Faculty faculty5 = new com.reservation_system.model.Faculty(0, "Password1!", "demo/data/test-users.csv", "researcher", false);
        java.lang.String str6 = faculty5.getName();
        java.lang.String str7 = faculty5.getName();
        java.lang.String str8 = faculty5.getName();
        java.lang.String str9 = faculty5.getUserType();
        boolean boolean10 = faculty5.requiresDepartmentApproval();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Password1!" + "'", str6, "Password1!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Password1!" + "'", str7, "Password1!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Password1!" + "'", str8, "Password1!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Faculty" + "'", str9, "Faculty");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test0083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0083");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("demo/data/test-users.csv");
        com.reservation_system.services.RegistrationService registrationService2 = new com.reservation_system.services.RegistrationService(userRepository1);
        com.reservation_system.model.Faculty faculty8 = new com.reservation_system.model.Faculty(0, "Password1!", "demo/data/test-users.csv", "researcher", false);
        java.lang.String str9 = faculty8.getName();
        userRepository1.addUser((com.reservation_system.model.User) faculty8);
        java.util.List<com.reservation_system.model.User> userList11 = userRepository1.getAllUsers();
        int int12 = userRepository1.getNextID();
        java.lang.Class<?> wildcardClass13 = userRepository1.getClass();
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Password1!" + "'", str9, "Password1!");
        org.junit.Assert.assertNotNull(userList11);
// flaky "10) test0083(com.reservation_system.randoop.registrationservice.RegressionTest0)":         org.junit.Assert.assertTrue("'" + int12 + "' != '" + 102 + "'", int12 == 102);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0084");
        com.reservation_system.model.Researcher researcher5 = new com.reservation_system.model.Researcher(0, "student", "", "andrew@example.com", false);
        java.lang.Class<?> wildcardClass6 = researcher5.getClass();
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0085");
        com.reservation_system.model.Student student5 = new com.reservation_system.model.Student(10, "Password1!", "Researcher", "Password1!", false);
        java.lang.String str6 = student5.getPassword();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Password1!" + "'", str6, "Password1!");
    }

    @Test
    public void test0086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0086");
        com.reservation_system.model.Researcher researcher5 = new com.reservation_system.model.Researcher((int) (short) -1, "andrew@example.com", "guest", "labmanager", false);
        java.lang.String str6 = researcher5.getUserType();
        java.lang.String str7 = researcher5.getName();
        boolean boolean8 = researcher5.requiresDepartmentApproval();
        java.lang.String str9 = researcher5.getUserType();
        java.lang.Class<?> wildcardClass10 = researcher5.getClass();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Researcher" + "'", str6, "Researcher");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Researcher" + "'", str9, "Researcher");
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0087");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("demo/data/test-users.csv");
        java.util.List<com.reservation_system.model.User> userList2 = userRepository1.getAllUsers();
        com.reservation_system.services.RegistrationService registrationService3 = new com.reservation_system.services.RegistrationService(userRepository1);
        java.util.List<com.reservation_system.model.User> userList4 = userRepository1.getAllUsers();
        boolean boolean6 = userRepository1.emailExists("Guest");
        java.util.List<com.reservation_system.model.User> userList7 = userRepository1.getAllUsers();
        java.util.Optional<com.reservation_system.model.User> userOptional9 = userRepository1.findByEmail("Password1!");
        java.lang.Class<?> wildcardClass10 = userOptional9.getClass();
        org.junit.Assert.assertNotNull(userList2);
        org.junit.Assert.assertNotNull(userList4);
// flaky "11) test0087(com.reservation_system.randoop.registrationservice.RegressionTest0)":         org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(userList7);
        org.junit.Assert.assertNotNull(userOptional9);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0088");
        com.reservation_system.model.HeadLabCoordinator headLabCoordinator5 = new com.reservation_system.model.HeadLabCoordinator(102, "Andrew", "", "guest", false);
    }

    @Test
    public void test0089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0089");
        com.reservation_system.model.Guest guest5 = new com.reservation_system.model.Guest((int) '4', "", "guest", "Password1!", false);
    }

    @Test
    public void test0090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0090");
        com.reservation_system.model.LabManager labManager5 = new com.reservation_system.model.LabManager((int) (short) 100, "Faculty", "Student", "researcher", true);
        java.lang.String str6 = labManager5.getUserType();
        java.lang.String str7 = labManager5.getPassword();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "labmanager" + "'", str6, "labmanager");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "researcher" + "'", str7, "researcher");
    }

    @Test
    public void test0091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0091");
        com.reservation_system.model.Faculty faculty5 = new com.reservation_system.model.Faculty((int) (byte) 1, "headlabcoordinator", "guest", "student", true);
        java.lang.Class<?> wildcardClass6 = faculty5.getClass();
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0092");
        com.reservation_system.model.Faculty faculty5 = new com.reservation_system.model.Faculty((int) (byte) 10, "Guest", "", "guest", false);
    }

    @Test
    public void test0093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0093");
        com.reservation_system.model.Faculty faculty5 = new com.reservation_system.model.Faculty((int) '4', "Guest", "Student", "student", false);
    }

    @Test
    public void test0094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0094");
        com.reservation_system.model.Faculty faculty5 = new com.reservation_system.model.Faculty((int) 'a', "student", "hi!", "faculty", false);
    }

    @Test
    public void test0095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0095");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("demo/data/test-users.csv");
        java.util.List<com.reservation_system.model.User> userList2 = userRepository1.getAllUsers();
        com.reservation_system.services.RegistrationService registrationService3 = new com.reservation_system.services.RegistrationService(userRepository1);
        // The following exception was thrown during execution in test generation
        try {
            com.reservation_system.model.User user8 = registrationService3.registerUser("faculty", "labmanager", "Guest", "Andrew");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid email format.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(userList2);
    }

    @Test
    public void test0096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0096");
        com.reservation_system.model.Faculty faculty5 = new com.reservation_system.model.Faculty((int) (short) 0, "guest", "Andrew", "guest", true);
        int int6 = faculty5.getID();
        java.lang.Class<?> wildcardClass7 = faculty5.getClass();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0097");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("demo/data/test-users.csv");
        int int2 = userRepository1.getNextID();
        com.reservation_system.model.Researcher researcher8 = new com.reservation_system.model.Researcher((int) (short) -1, "andrew@example.com", "guest", "labmanager", false);
        java.lang.String str9 = researcher8.getPassword();
        researcher8.setApproved(true);
        java.lang.String str12 = researcher8.getEmail();
        userRepository1.addUser((com.reservation_system.model.User) researcher8);
        boolean boolean14 = researcher8.isApproved();
        java.lang.Class<?> wildcardClass15 = researcher8.getClass();
// flaky "12) test0097(com.reservation_system.randoop.registrationservice.RegressionTest0)":         org.junit.Assert.assertTrue("'" + int2 + "' != '" + 102 + "'", int2 == 102);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "labmanager" + "'", str9, "labmanager");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "guest" + "'", str12, "guest");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0098");
        com.reservation_system.model.HeadLabCoordinator headLabCoordinator5 = new com.reservation_system.model.HeadLabCoordinator((int) (byte) 10, "demo/data/test-users.csv", "faculty", "faculty", true);
    }

    @Test
    public void test0099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0099");
        com.reservation_system.model.Guest guest5 = new com.reservation_system.model.Guest((int) (byte) 0, "Password1!", "headlabcoordinator", "Andrew", true);
    }

    @Test
    public void test0100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0100");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("demo/data/test-users.csv");
        java.util.Optional<com.reservation_system.model.User> userOptional3 = userRepository1.findByEmail("hi!");
        int int4 = userRepository1.getNextID();
        com.reservation_system.model.Student student10 = new com.reservation_system.model.Student((int) (byte) 0, "Student", "Andrew", "labmanager", false);
        java.lang.String str11 = student10.getUserType();
        userRepository1.addUser((com.reservation_system.model.User) student10);
        org.junit.Assert.assertNotNull(userOptional3);
// flaky "13) test0100(com.reservation_system.randoop.registrationservice.RegressionTest0)":         org.junit.Assert.assertTrue("'" + int4 + "' != '" + 102 + "'", int4 == 102);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Student" + "'", str11, "Student");
    }

    @Test
    public void test0101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0101");
        // The following exception was thrown during execution in test generation
        try {
            com.reservation_system.model.User user6 = com.reservation_system.patterns.factory.UserFactory.createUser("Andrew", (int) '#', "student", "andrew@example.com", "student", false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid user type: Andrew");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0102");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("demo/data/test-users.csv");
        com.reservation_system.services.RegistrationService registrationService2 = new com.reservation_system.services.RegistrationService(userRepository1);
        com.reservation_system.model.Faculty faculty8 = new com.reservation_system.model.Faculty(0, "Password1!", "demo/data/test-users.csv", "researcher", false);
        java.lang.String str9 = faculty8.getName();
        userRepository1.addUser((com.reservation_system.model.User) faculty8);
        com.reservation_system.services.RegistrationService registrationService11 = new com.reservation_system.services.RegistrationService(userRepository1);
        // The following exception was thrown during execution in test generation
        try {
            com.reservation_system.model.User user16 = registrationService11.registerUser("labmanager", "", "andrew@example.com", "labmanager");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Lab manager accounts must be generated by the head lab coordinator.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Password1!" + "'", str9, "Password1!");
    }

    @Test
    public void test0103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0103");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("demo/data/test-users.csv");
        com.reservation_system.services.RegistrationService registrationService2 = new com.reservation_system.services.RegistrationService(userRepository1);
        com.reservation_system.services.RegistrationService registrationService3 = new com.reservation_system.services.RegistrationService(userRepository1);
        com.reservation_system.services.RegistrationService registrationService4 = new com.reservation_system.services.RegistrationService(userRepository1);
        // The following exception was thrown during execution in test generation
        try {
            com.reservation_system.model.User user9 = registrationService4.registerUser("hi!", "", "Faculty", "faculty");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid user type.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0104");
        com.reservation_system.model.Student student5 = new com.reservation_system.model.Student((int) ' ', "", "labmanager", "headlabcoordinator", true);
        java.lang.String str6 = student5.getUserType();
        java.lang.String str7 = student5.getUserType();
        int int8 = student5.getID();
        java.lang.String str9 = student5.getEmail();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Student" + "'", str6, "Student");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Student" + "'", str7, "Student");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 32 + "'", int8 == 32);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "labmanager" + "'", str9, "labmanager");
    }

    @Test
    public void test0105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0105");
        com.reservation_system.model.Faculty faculty5 = new com.reservation_system.model.Faculty((int) (byte) 10, "andrew@example.com", "Guest", "hi!", true);
    }

    @Test
    public void test0106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0106");
        // The following exception was thrown during execution in test generation
        try {
            com.reservation_system.model.User user6 = com.reservation_system.patterns.factory.UserFactory.createUser("demo/data/test-users.csv", (int) (byte) 1, "", "", "Guest", false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid user type: demo/data/test-users.csv");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0107");
        // The following exception was thrown during execution in test generation
        try {
            com.reservation_system.model.User user6 = com.reservation_system.patterns.factory.UserFactory.createUser("demo/data/test-users.csv", (int) (short) -1, "guest", "guest", "headlabcoordinator", true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid user type: demo/data/test-users.csv");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0108");
        com.reservation_system.model.Guest guest5 = new com.reservation_system.model.Guest((int) '#', "Andrew", "student", "Faculty", false);
        boolean boolean6 = guest5.requiresDepartmentApproval();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test0109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0109");
        com.reservation_system.model.HeadLabCoordinator headLabCoordinator5 = new com.reservation_system.model.HeadLabCoordinator(52, "demo/data/test-users.csv", "", "", true);
    }

    @Test
    public void test0110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0110");
        com.reservation_system.model.Student student5 = new com.reservation_system.model.Student((int) ' ', "Password1!", "andrew@example.com", "researcher", false);
        java.lang.Class<?> wildcardClass6 = student5.getClass();
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0111");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("demo/data/test-users.csv");
        boolean boolean2 = userRepository1.headLabCoordinatorExists();
        com.reservation_system.services.RegistrationService registrationService3 = new com.reservation_system.services.RegistrationService(userRepository1);
        java.util.Optional<com.reservation_system.model.User> userOptional5 = userRepository1.findByEmail("researcher");
        java.lang.Class<?> wildcardClass6 = userRepository1.getClass();
// flaky "14) test0111(com.reservation_system.randoop.registrationservice.RegressionTest0)":         org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(userOptional5);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0112");
        com.reservation_system.model.HeadLabCoordinator headLabCoordinator5 = new com.reservation_system.model.HeadLabCoordinator(10, "faculty", "Faculty", "demo/data/test-users.csv", false);
        boolean boolean6 = headLabCoordinator5.isApproved();
        java.lang.String str7 = headLabCoordinator5.getUserType();
        java.lang.String str8 = headLabCoordinator5.getName();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "headlabcoordinator" + "'", str7, "headlabcoordinator");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "faculty" + "'", str8, "faculty");
    }

    @Test
    public void test0113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0113");
        com.reservation_system.model.Guest guest5 = new com.reservation_system.model.Guest(52, "student", "demo/data/test-users.csv", "researcher", true);
        java.lang.String str6 = guest5.getUserType();
        java.lang.String str7 = guest5.getName();
        java.lang.String str8 = guest5.getUserType();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Guest" + "'", str6, "Guest");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "student" + "'", str7, "student");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Guest" + "'", str8, "Guest");
    }

    @Test
    public void test0114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0114");
        com.reservation_system.model.LabManager labManager5 = new com.reservation_system.model.LabManager((int) (short) 10, "demo/data/test-users.csv", "Guest", "andrew@example.com", false);
        labManager5.setApproved(true);
    }

    @Test
    public void test0115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0115");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("demo/data/test-users.csv");
        com.reservation_system.services.RegistrationService registrationService2 = new com.reservation_system.services.RegistrationService(userRepository1);
        com.reservation_system.model.Faculty faculty8 = new com.reservation_system.model.Faculty(0, "Password1!", "demo/data/test-users.csv", "researcher", false);
        java.lang.String str9 = faculty8.getName();
        userRepository1.addUser((com.reservation_system.model.User) faculty8);
        com.reservation_system.services.RegistrationService registrationService11 = new com.reservation_system.services.RegistrationService(userRepository1);
        com.reservation_system.services.RegistrationService registrationService12 = new com.reservation_system.services.RegistrationService(userRepository1);
        boolean boolean14 = userRepository1.emailExists("Guest");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Password1!" + "'", str9, "Password1!");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test0116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0116");
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
            com.reservation_system.model.User user15 = registrationService10.registerUser("andrew@example.com", "faculty", "Andrew", "Researcher");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid user type.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
// flaky "15) test0116(com.reservation_system.randoop.registrationservice.RegressionTest0)":         org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
// flaky "5) test0116(com.reservation_system.randoop.registrationservice.RegressionTest0)":         org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(userOptional9);
    }

    @Test
    public void test0117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0117");
        com.reservation_system.model.HeadLabCoordinator headLabCoordinator5 = new com.reservation_system.model.HeadLabCoordinator(10, "faculty", "Faculty", "demo/data/test-users.csv", false);
        boolean boolean6 = headLabCoordinator5.isApproved();
        java.lang.Class<?> wildcardClass7 = headLabCoordinator5.getClass();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0118");
        com.reservation_system.model.Student student5 = new com.reservation_system.model.Student((int) (short) -1, "Guest", "", "andrew@example.com", false);
        boolean boolean6 = student5.isApproved();
        java.lang.String str7 = student5.getUserType();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Student" + "'", str7, "Student");
    }

    @Test
    public void test0119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0119");
        // The following exception was thrown during execution in test generation
        try {
            com.reservation_system.model.User user6 = com.reservation_system.patterns.factory.UserFactory.createUser("hi!", (int) ' ', "demo/data/test-users.csv", "", "", false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid user type: hi!");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0120");
        com.reservation_system.model.Faculty faculty5 = new com.reservation_system.model.Faculty(100, "student", "Andrew", "researcher", true);
        java.lang.String str6 = faculty5.getUserType();
        java.lang.String str7 = faculty5.getName();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Faculty" + "'", str6, "Faculty");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "student" + "'", str7, "student");
    }

    @Test
    public void test0121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0121");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("demo/data/test-users.csv");
        com.reservation_system.services.RegistrationService registrationService2 = new com.reservation_system.services.RegistrationService(userRepository1);
        com.reservation_system.model.Researcher researcher8 = new com.reservation_system.model.Researcher((int) (short) 1, "Password1!", "headlabcoordinator", "", false);
        userRepository1.addUser((com.reservation_system.model.User) researcher8);
        com.reservation_system.services.RegistrationService registrationService10 = new com.reservation_system.services.RegistrationService(userRepository1);
        // The following exception was thrown during execution in test generation
        try {
            com.reservation_system.model.User user15 = registrationService10.registerUser("student", "Faculty", "Faculty", "guest");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid email format.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0122");
        com.reservation_system.model.Researcher researcher5 = new com.reservation_system.model.Researcher((int) '4', "labmanager", "Andrew", "researcher", true);
        java.lang.String str6 = researcher5.getPassword();
        java.lang.String str7 = researcher5.getName();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "researcher" + "'", str6, "researcher");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "labmanager" + "'", str7, "labmanager");
    }

    @Test
    public void test0123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0123");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("demo/data/test-users.csv");
        boolean boolean3 = userRepository1.emailExists("labmanager");
// flaky "16) test0123(com.reservation_system.randoop.registrationservice.RegressionTest0)":         org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
    }

    @Test
    public void test0124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0124");
        // The following exception was thrown during execution in test generation
        try {
            com.reservation_system.model.User user6 = com.reservation_system.patterns.factory.UserFactory.createUser("demo/data/test-users.csv", (int) 'a', "hi!", "demo/data/test-users.csv", "andrew@example.com", false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid user type: demo/data/test-users.csv");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0125");
        // The following exception was thrown during execution in test generation
        try {
            com.reservation_system.model.User user6 = com.reservation_system.patterns.factory.UserFactory.createUser("Password1!", (int) (short) 0, "Andrew", "Researcher", "Password1!", false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid user type: Password1!");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0126");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("demo/data/test-users.csv");
        java.util.List<com.reservation_system.model.User> userList2 = userRepository1.getAllUsers();
        com.reservation_system.services.RegistrationService registrationService3 = new com.reservation_system.services.RegistrationService(userRepository1);
        // The following exception was thrown during execution in test generation
        try {
            com.reservation_system.model.User user8 = registrationService3.registerUser("", "Faculty", "researcher", "headlabcoordinator");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid user type.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(userList2);
    }

    @Test
    public void test0127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0127");
        com.reservation_system.model.Faculty faculty5 = new com.reservation_system.model.Faculty(100, "student", "Andrew", "researcher", true);
        java.lang.String str6 = faculty5.getUserType();
        int int7 = faculty5.getID();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Faculty" + "'", str6, "Faculty");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 100 + "'", int7 == 100);
    }

    @Test
    public void test0128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0128");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("demo/data/test-users.csv");
        boolean boolean2 = userRepository1.headLabCoordinatorExists();
        com.reservation_system.services.RegistrationService registrationService3 = new com.reservation_system.services.RegistrationService(userRepository1);
        // The following exception was thrown during execution in test generation
        try {
            com.reservation_system.model.User user8 = registrationService3.registerUser("Andrew", "", "guest", "labmanager");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid user type.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
// flaky "17) test0128(com.reservation_system.randoop.registrationservice.RegressionTest0)":         org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test0129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0129");
        com.reservation_system.model.User user6 = com.reservation_system.patterns.factory.UserFactory.createUser("guest", (int) (short) 0, "Guest", "Andrew", "hi!", true);
        org.junit.Assert.assertNotNull(user6);
    }

    @Test
    public void test0130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0130");
        com.reservation_system.model.Student student5 = new com.reservation_system.model.Student((int) (byte) 0, "Password1!", "Student", "Researcher", true);
    }

    @Test
    public void test0131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0131");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("demo/data/test-users.csv");
        com.reservation_system.services.RegistrationService registrationService2 = new com.reservation_system.services.RegistrationService(userRepository1);
        com.reservation_system.model.Researcher researcher8 = new com.reservation_system.model.Researcher((int) (short) 1, "Password1!", "headlabcoordinator", "", false);
        userRepository1.addUser((com.reservation_system.model.User) researcher8);
        boolean boolean11 = userRepository1.emailExists("researcher");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test0132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0132");
        com.reservation_system.model.Researcher researcher5 = new com.reservation_system.model.Researcher((int) (short) -1, "andrew@example.com", "guest", "labmanager", false);
        java.lang.String str6 = researcher5.getUserType();
        java.lang.String str7 = researcher5.getName();
        boolean boolean8 = researcher5.requiresDepartmentApproval();
        java.lang.String str9 = researcher5.getUserType();
        java.lang.String str10 = researcher5.getEmail();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Researcher" + "'", str6, "Researcher");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Researcher" + "'", str9, "Researcher");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "guest" + "'", str10, "guest");
    }

    @Test
    public void test0133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0133");
        com.reservation_system.model.Student student5 = new com.reservation_system.model.Student((int) (short) -1, "Andrew", "Guest", "Faculty", true);
        java.lang.String str6 = student5.getUserType();
        int int7 = student5.getID();
        java.lang.String str8 = student5.getUserType();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Student" + "'", str6, "Student");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Student" + "'", str8, "Student");
    }

    @Test
    public void test0134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0134");
        com.reservation_system.model.Guest guest5 = new com.reservation_system.model.Guest((int) (byte) -1, "guest", "Researcher", "Faculty", true);
        java.lang.String str6 = guest5.getUserType();
        java.lang.String str7 = guest5.getName();
        java.lang.String str8 = guest5.getUserType();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Guest" + "'", str6, "Guest");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "guest" + "'", str7, "guest");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Guest" + "'", str8, "Guest");
    }

    @Test
    public void test0135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0135");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("demo/data/test-users.csv");
        com.reservation_system.services.RegistrationService registrationService2 = new com.reservation_system.services.RegistrationService(userRepository1);
        com.reservation_system.model.Researcher researcher8 = new com.reservation_system.model.Researcher((int) (short) 1, "Password1!", "headlabcoordinator", "", false);
        userRepository1.addUser((com.reservation_system.model.User) researcher8);
        java.lang.String str10 = researcher8.getUserType();
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Researcher" + "'", str10, "Researcher");
    }

    @Test
    public void test0136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0136");
        com.reservation_system.model.Guest guest5 = new com.reservation_system.model.Guest((int) (short) 1, "Researcher", "headlabcoordinator", "Researcher", true);
    }

    @Test
    public void test0137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0137");
        com.reservation_system.model.Guest guest5 = new com.reservation_system.model.Guest((int) (short) 10, "andrew@example.com", "hi!", "andrew@example.com", true);
    }

    @Test
    public void test0138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0138");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("demo/data/test-users.csv");
        java.util.List<com.reservation_system.model.User> userList2 = userRepository1.getAllUsers();
        com.reservation_system.services.RegistrationService registrationService3 = new com.reservation_system.services.RegistrationService(userRepository1);
        // The following exception was thrown during execution in test generation
        try {
            com.reservation_system.model.User user8 = registrationService3.registerUser("headlabcoordinator", "Faculty", "guest", "guest");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: A head lab coordinator account already exists.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(userList2);
    }

    @Test
    public void test0139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0139");
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
        int int63 = userRepository1.getNextID();
        java.util.List<com.reservation_system.model.User> userList64 = userRepository1.getAllUsers();
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Password1!" + "'", str9, "Password1!");
// flaky "18) test0139(com.reservation_system.randoop.registrationservice.RegressionTest0)":         org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
// flaky "6) test0139(com.reservation_system.randoop.registrationservice.RegressionTest0)":         org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "Password1!" + "'", str29, "Password1!");
// flaky "3) test0139(com.reservation_system.randoop.registrationservice.RegressionTest0)":         org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "Password1!" + "'", str41, "Password1!");
        org.junit.Assert.assertNotNull(userList43);
// flaky "1) test0139(com.reservation_system.randoop.registrationservice.RegressionTest0)":         org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + true + "'", boolean47 == true);
        org.junit.Assert.assertEquals("'" + str57 + "' != '" + "Password1!" + "'", str57, "Password1!");
// flaky "1) test0139(com.reservation_system.randoop.registrationservice.RegressionTest0)":         org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + true + "'", boolean59 == true);
        org.junit.Assert.assertNotNull(userList61);
// flaky "1) test0139(com.reservation_system.randoop.registrationservice.RegressionTest0)":         org.junit.Assert.assertTrue("'" + int63 + "' != '" + 102 + "'", int63 == 102);
        org.junit.Assert.assertNotNull(userList64);
    }

    @Test
    public void test0140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0140");
        com.reservation_system.model.Faculty faculty5 = new com.reservation_system.model.Faculty((int) (byte) 1, "researcher", "Andrew", "", false);
        java.lang.String str6 = faculty5.getName();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "researcher" + "'", str6, "researcher");
    }

    @Test
    public void test0141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0141");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("demo/data/test-users.csv");
        com.reservation_system.services.RegistrationService registrationService2 = new com.reservation_system.services.RegistrationService(userRepository1);
        com.reservation_system.services.RegistrationService registrationService3 = new com.reservation_system.services.RegistrationService(userRepository1);
        // The following exception was thrown during execution in test generation
        try {
            com.reservation_system.model.User user8 = registrationService3.registerUser("Andrew", "", "Researcher", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid user type.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0142");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("demo/data/test-users.csv");
        com.reservation_system.services.RegistrationService registrationService2 = new com.reservation_system.services.RegistrationService(userRepository1);
        com.reservation_system.services.RegistrationService registrationService3 = new com.reservation_system.services.RegistrationService(userRepository1);
        // The following exception was thrown during execution in test generation
        try {
            com.reservation_system.model.User user8 = registrationService3.registerUser("guest", "", "Andrew", "Student");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Name is required.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0143");
        com.reservation_system.model.Researcher researcher5 = new com.reservation_system.model.Researcher((int) (short) -1, "Andrew", "headlabcoordinator", "Guest", false);
        java.lang.Class<?> wildcardClass6 = researcher5.getClass();
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0144");
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
            com.reservation_system.model.User user15 = registrationService10.registerUser("hi!", "Andrew", "Password1!", "Faculty");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid user type.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
// flaky "19) test0144(com.reservation_system.randoop.registrationservice.RegressionTest0)":         org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
// flaky "7) test0144(com.reservation_system.randoop.registrationservice.RegressionTest0)":         org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(userOptional9);
    }

    @Test
    public void test0145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0145");
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
        java.util.Optional<com.reservation_system.model.User> userOptional31 = userRepository1.findByEmail("Password1!");
// flaky "20) test0145(com.reservation_system.randoop.registrationservice.RegressionTest0)":         org.junit.Assert.assertTrue("'" + int2 + "' != '" + 102 + "'", int2 == 102);
// flaky "8) test0145(com.reservation_system.randoop.registrationservice.RegressionTest0)":         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 102 + "'", int3 == 102);
// flaky "4) test0145(com.reservation_system.randoop.registrationservice.RegressionTest0)":         org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(userOptional14);
        org.junit.Assert.assertNotNull(userList22);
        org.junit.Assert.assertNotNull(userOptional31);
    }

    @Test
    public void test0146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0146");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("demo/data/test-users.csv");
        java.util.Optional<com.reservation_system.model.User> userOptional3 = userRepository1.findByEmail("hi!");
        boolean boolean5 = userRepository1.emailExists("Faculty");
        java.lang.Class<?> wildcardClass6 = userRepository1.getClass();
        org.junit.Assert.assertNotNull(userOptional3);
// flaky "21) test0146(com.reservation_system.randoop.registrationservice.RegressionTest0)":         org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0147");
        com.reservation_system.model.User user6 = com.reservation_system.patterns.factory.UserFactory.createUser("faculty", (int) (byte) 0, "Student", "Faculty", "", false);
        org.junit.Assert.assertNotNull(user6);
    }

    @Test
    public void test0148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0148");
        com.reservation_system.model.Researcher researcher5 = new com.reservation_system.model.Researcher((int) (short) -1, "andrew@example.com", "guest", "labmanager", false);
        java.lang.String str6 = researcher5.getUserType();
        boolean boolean7 = researcher5.isApproved();
        boolean boolean8 = researcher5.isApproved();
        boolean boolean9 = researcher5.requiresDepartmentApproval();
        boolean boolean10 = researcher5.requiresDepartmentApproval();
        int int11 = researcher5.getID();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Researcher" + "'", str6, "Researcher");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
    }

    @Test
    public void test0149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0149");
        com.reservation_system.model.Student student5 = new com.reservation_system.model.Student((int) (short) 100, "researcher", "Student", "Guest", true);
    }

    @Test
    public void test0150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0150");
        com.reservation_system.model.Faculty faculty5 = new com.reservation_system.model.Faculty(102, "Student", "hi!", "Password1!", false);
        java.lang.String str6 = faculty5.getUserType();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Faculty" + "'", str6, "Faculty");
    }

    @Test
    public void test0151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0151");
        com.reservation_system.model.Researcher researcher5 = new com.reservation_system.model.Researcher((int) (short) -1, "andrew@example.com", "guest", "labmanager", false);
        java.lang.String str6 = researcher5.getUserType();
        java.lang.String str7 = researcher5.getName();
        int int8 = researcher5.getID();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Researcher" + "'", str6, "Researcher");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
    }

    @Test
    public void test0152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0152");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("demo/data/test-users.csv");
        com.reservation_system.services.RegistrationService registrationService2 = new com.reservation_system.services.RegistrationService(userRepository1);
        // The following exception was thrown during execution in test generation
        try {
            com.reservation_system.model.User user7 = registrationService2.registerUser("Student", "faculty", "researcher", "Andrew");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid email format.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0153");
        // The following exception was thrown during execution in test generation
        try {
            com.reservation_system.model.User user6 = com.reservation_system.patterns.factory.UserFactory.createUser("hi!", 102, "Guest", "", "faculty", false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid user type: hi!");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0154");
        com.reservation_system.model.Researcher researcher5 = new com.reservation_system.model.Researcher(0, "Faculty", "andrew@example.com", "", false);
    }

    @Test
    public void test0155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0155");
        com.reservation_system.model.LabManager labManager5 = new com.reservation_system.model.LabManager((int) (byte) -1, "faculty", "demo/data/test-users.csv", "Andrew", true);
    }

    @Test
    public void test0156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0156");
        com.reservation_system.model.Faculty faculty5 = new com.reservation_system.model.Faculty((int) (short) 0, "", "Researcher", "faculty", false);
        faculty5.setApproved(false);
    }

    @Test
    public void test0157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0157");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("demo/data/test-users.csv");
        boolean boolean2 = userRepository1.headLabCoordinatorExists();
        com.reservation_system.services.RegistrationService registrationService3 = new com.reservation_system.services.RegistrationService(userRepository1);
        boolean boolean5 = userRepository1.emailExists("");
        boolean boolean6 = userRepository1.headLabCoordinatorExists();
        com.reservation_system.services.RegistrationService registrationService7 = new com.reservation_system.services.RegistrationService(userRepository1);
        com.reservation_system.services.RegistrationService registrationService8 = new com.reservation_system.services.RegistrationService(userRepository1);
// flaky "22) test0157(com.reservation_system.randoop.registrationservice.RegressionTest0)":         org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
// flaky "9) test0157(com.reservation_system.randoop.registrationservice.RegressionTest0)":         org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
// flaky "5) test0157(com.reservation_system.randoop.registrationservice.RegressionTest0)":         org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test0158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0158");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("demo/data/test-users.csv");
        int int2 = userRepository1.getNextID();
        int int3 = userRepository1.getNextID();
        boolean boolean5 = userRepository1.emailExists("faculty");
        com.reservation_system.model.LabManager labManager11 = new com.reservation_system.model.LabManager((int) (short) 0, "", "labmanager", "Password1!", true);
        userRepository1.addUser((com.reservation_system.model.User) labManager11);
        com.reservation_system.services.RegistrationService registrationService13 = new com.reservation_system.services.RegistrationService(userRepository1);
        // The following exception was thrown during execution in test generation
        try {
            com.reservation_system.model.User user18 = registrationService13.registerUser("", "", "hi!", "Guest");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid user type.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
// flaky "23) test0158(com.reservation_system.randoop.registrationservice.RegressionTest0)":         org.junit.Assert.assertTrue("'" + int2 + "' != '" + 102 + "'", int2 == 102);
// flaky "10) test0158(com.reservation_system.randoop.registrationservice.RegressionTest0)":         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 102 + "'", int3 == 102);
// flaky "6) test0158(com.reservation_system.randoop.registrationservice.RegressionTest0)":         org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
    }

    @Test
    public void test0159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0159");
        com.reservation_system.model.Researcher researcher5 = new com.reservation_system.model.Researcher((int) '4', "labmanager", "Andrew", "researcher", true);
        java.lang.String str6 = researcher5.getUserType();
        researcher5.setApproved(false);
        int int9 = researcher5.getID();
        java.lang.String str10 = researcher5.getPassword();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Researcher" + "'", str6, "Researcher");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 52 + "'", int9 == 52);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "researcher" + "'", str10, "researcher");
    }

    @Test
    public void test0160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0160");
        com.reservation_system.model.Student student5 = new com.reservation_system.model.Student((int) ' ', "", "labmanager", "headlabcoordinator", true);
        student5.setApproved(false);
        int int8 = student5.getID();
        java.lang.String str9 = student5.getEmail();
        java.lang.Class<?> wildcardClass10 = student5.getClass();
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 32 + "'", int8 == 32);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "labmanager" + "'", str9, "labmanager");
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0161");
        com.reservation_system.model.LabManager labManager5 = new com.reservation_system.model.LabManager((int) (byte) -1, "hi!", "", "Andrew", true);
        java.lang.String str6 = labManager5.getUserType();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "labmanager" + "'", str6, "labmanager");
    }

    @Test
    public void test0162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0162");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("demo/data/test-users.csv");
        java.util.List<com.reservation_system.model.User> userList2 = userRepository1.getAllUsers();
        com.reservation_system.services.RegistrationService registrationService3 = new com.reservation_system.services.RegistrationService(userRepository1);
        com.reservation_system.services.RegistrationService registrationService4 = new com.reservation_system.services.RegistrationService(userRepository1);
        java.util.List<com.reservation_system.model.User> userList5 = userRepository1.getAllUsers();
        boolean boolean7 = userRepository1.emailExists("labmanager");
        org.junit.Assert.assertNotNull(userList2);
        org.junit.Assert.assertNotNull(userList5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test0163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0163");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("demo/data/test-users.csv");
        boolean boolean2 = userRepository1.headLabCoordinatorExists();
        com.reservation_system.services.RegistrationService registrationService3 = new com.reservation_system.services.RegistrationService(userRepository1);
        boolean boolean4 = userRepository1.headLabCoordinatorExists();
        boolean boolean6 = userRepository1.emailExists("Andrew");
        com.reservation_system.services.RegistrationService registrationService7 = new com.reservation_system.services.RegistrationService(userRepository1);
        // The following exception was thrown during execution in test generation
        try {
            com.reservation_system.model.User user12 = registrationService7.registerUser("student", "demo/data/test-users.csv", "", "faculty");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Email is required.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
// flaky "24) test0163(com.reservation_system.randoop.registrationservice.RegressionTest0)":         org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
// flaky "11) test0163(com.reservation_system.randoop.registrationservice.RegressionTest0)":         org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test0164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0164");
        com.reservation_system.model.Faculty faculty5 = new com.reservation_system.model.Faculty(0, "labmanager", "researcher", "demo/data/test-users.csv", false);
    }

    @Test
    public void test0165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0165");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("demo/data/test-users.csv");
        com.reservation_system.services.RegistrationService registrationService2 = new com.reservation_system.services.RegistrationService(userRepository1);
        com.reservation_system.model.Faculty faculty8 = new com.reservation_system.model.Faculty(0, "Password1!", "demo/data/test-users.csv", "researcher", false);
        java.lang.String str9 = faculty8.getName();
        userRepository1.addUser((com.reservation_system.model.User) faculty8);
        java.util.List<com.reservation_system.model.User> userList11 = userRepository1.getAllUsers();
        boolean boolean12 = userRepository1.headLabCoordinatorExists();
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Password1!" + "'", str9, "Password1!");
        org.junit.Assert.assertNotNull(userList11);
// flaky "25) test0165(com.reservation_system.randoop.registrationservice.RegressionTest0)":         org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test0166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0166");
        com.reservation_system.model.Researcher researcher5 = new com.reservation_system.model.Researcher((int) '4', "labmanager", "Andrew", "researcher", true);
        java.lang.Class<?> wildcardClass6 = researcher5.getClass();
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0167");
        com.reservation_system.model.Guest guest5 = new com.reservation_system.model.Guest((int) (byte) 1, "Guest", "labmanager", "Researcher", true);
        java.lang.String str6 = guest5.getUserType();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Guest" + "'", str6, "Guest");
    }

    @Test
    public void test0168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0168");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("demo/data/test-users.csv");
        java.util.Optional<com.reservation_system.model.User> userOptional3 = userRepository1.findByEmail("hi!");
        int int4 = userRepository1.getNextID();
        com.reservation_system.services.RegistrationService registrationService5 = new com.reservation_system.services.RegistrationService(userRepository1);
        // The following exception was thrown during execution in test generation
        try {
            com.reservation_system.model.User user10 = registrationService5.registerUser("hi!", "researcher", "Password1!", "headlabcoordinator");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid user type.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(userOptional3);
// flaky "26) test0168(com.reservation_system.randoop.registrationservice.RegressionTest0)":         org.junit.Assert.assertTrue("'" + int4 + "' != '" + 102 + "'", int4 == 102);
    }

    @Test
    public void test0169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0169");
        com.reservation_system.model.Guest guest5 = new com.reservation_system.model.Guest((int) (byte) -1, "guest", "Researcher", "Faculty", true);
        java.lang.String str6 = guest5.getUserType();
        java.lang.String str7 = guest5.getName();
        java.lang.Class<?> wildcardClass8 = guest5.getClass();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Guest" + "'", str6, "Guest");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "guest" + "'", str7, "guest");
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0170");
        com.reservation_system.model.Faculty faculty5 = new com.reservation_system.model.Faculty((int) '4', "student", "andrew@example.com", "Guest", true);
        boolean boolean6 = faculty5.isApproved();
        faculty5.setApproved(false);
        java.lang.String str9 = faculty5.getUserType();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Faculty" + "'", str9, "Faculty");
    }

    @Test
    public void test0171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0171");
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
        boolean boolean65 = userRepository1.emailExists("Researcher");
// flaky "27) test0171(com.reservation_system.randoop.registrationservice.RegressionTest0)":         org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
// flaky "12) test0171(com.reservation_system.randoop.registrationservice.RegressionTest0)":         org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(userOptional9);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "Password1!" + "'", str20, "Password1!");
// flaky "7) test0171(com.reservation_system.randoop.registrationservice.RegressionTest0)":         org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "Password1!" + "'", str41, "Password1!");
// flaky "2) test0171(com.reservation_system.randoop.registrationservice.RegressionTest0)":         org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + true + "'", boolean43 == true);
        org.junit.Assert.assertNotNull(userList45);
        org.junit.Assert.assertEquals("'" + str55 + "' != '" + "Password1!" + "'", str55, "Password1!");
// flaky "2) test0171(com.reservation_system.randoop.registrationservice.RegressionTest0)":         org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + true + "'", boolean57 == true);
        org.junit.Assert.assertNotNull(userList59);
        org.junit.Assert.assertNotNull(userList62);
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + true + "'", boolean65 == true);
    }

    @Test
    public void test0172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0172");
        com.reservation_system.model.LabManager labManager5 = new com.reservation_system.model.LabManager((int) (short) 0, "", "labmanager", "Password1!", true);
        java.lang.String str6 = labManager5.getUserType();
        java.lang.Class<?> wildcardClass7 = labManager5.getClass();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "labmanager" + "'", str6, "labmanager");
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0173");
        com.reservation_system.model.Student student5 = new com.reservation_system.model.Student((int) ' ', "", "labmanager", "headlabcoordinator", true);
        java.lang.String str6 = student5.getUserType();
        boolean boolean7 = student5.isApproved();
        int int8 = student5.getID();
        java.lang.String str9 = student5.getPassword();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Student" + "'", str6, "Student");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 32 + "'", int8 == 32);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "headlabcoordinator" + "'", str9, "headlabcoordinator");
    }

    @Test
    public void test0174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0174");
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
        java.util.List<com.reservation_system.model.User> userList52 = userRepository1.getAllUsers();
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Password1!" + "'", str9, "Password1!");
// flaky "28) test0174(com.reservation_system.randoop.registrationservice.RegressionTest0)":         org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "Password1!" + "'", str30, "Password1!");
// flaky "13) test0174(com.reservation_system.randoop.registrationservice.RegressionTest0)":         org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertNotNull(userList34);
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "Password1!" + "'", str44, "Password1!");
// flaky "8) test0174(com.reservation_system.randoop.registrationservice.RegressionTest0)":         org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + true + "'", boolean46 == true);
        org.junit.Assert.assertNotNull(userList48);
        org.junit.Assert.assertNotNull(userList51);
        org.junit.Assert.assertNotNull(userList52);
    }

    @Test
    public void test0175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0175");
        com.reservation_system.model.HeadLabCoordinator headLabCoordinator5 = new com.reservation_system.model.HeadLabCoordinator((int) ' ', "", "", "andrew@example.com", true);
        int int6 = headLabCoordinator5.getID();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 32 + "'", int6 == 32);
    }

    @Test
    public void test0176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0176");
        com.reservation_system.model.Researcher researcher5 = new com.reservation_system.model.Researcher((int) (byte) 100, "Password1!", "Password1!", "headlabcoordinator", true);
        boolean boolean6 = researcher5.requiresDepartmentApproval();
        java.lang.String str7 = researcher5.getUserType();
        java.lang.String str8 = researcher5.getEmail();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Researcher" + "'", str7, "Researcher");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Password1!" + "'", str8, "Password1!");
    }

    @Test
    public void test0177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0177");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("demo/data/test-users.csv");
        int int2 = userRepository1.getNextID();
        int int3 = userRepository1.getNextID();
        boolean boolean5 = userRepository1.emailExists("faculty");
        com.reservation_system.model.LabManager labManager11 = new com.reservation_system.model.LabManager((int) (short) 0, "", "labmanager", "Password1!", true);
        userRepository1.addUser((com.reservation_system.model.User) labManager11);
        java.util.Optional<com.reservation_system.model.User> userOptional14 = userRepository1.findByEmail("");
        int int15 = userRepository1.getNextID();
// flaky "29) test0177(com.reservation_system.randoop.registrationservice.RegressionTest0)":         org.junit.Assert.assertTrue("'" + int2 + "' != '" + 102 + "'", int2 == 102);
// flaky "14) test0177(com.reservation_system.randoop.registrationservice.RegressionTest0)":         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 102 + "'", int3 == 102);
// flaky "9) test0177(com.reservation_system.randoop.registrationservice.RegressionTest0)":         org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(userOptional14);
// flaky "3) test0177(com.reservation_system.randoop.registrationservice.RegressionTest0)":         org.junit.Assert.assertTrue("'" + int15 + "' != '" + 102 + "'", int15 == 102);
    }

    @Test
    public void test0178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0178");
        com.reservation_system.model.Student student5 = new com.reservation_system.model.Student(10, "researcher", "", "guest", true);
    }

    @Test
    public void test0179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0179");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("demo/data/test-users.csv");
        com.reservation_system.services.RegistrationService registrationService2 = new com.reservation_system.services.RegistrationService(userRepository1);
        com.reservation_system.model.Faculty faculty8 = new com.reservation_system.model.Faculty(0, "Password1!", "demo/data/test-users.csv", "researcher", false);
        java.lang.String str9 = faculty8.getName();
        userRepository1.addUser((com.reservation_system.model.User) faculty8);
        boolean boolean11 = userRepository1.headLabCoordinatorExists();
        com.reservation_system.services.RegistrationService registrationService12 = new com.reservation_system.services.RegistrationService(userRepository1);
        com.reservation_system.services.RegistrationService registrationService13 = new com.reservation_system.services.RegistrationService(userRepository1);
        boolean boolean14 = userRepository1.headLabCoordinatorExists();
        java.util.Optional<com.reservation_system.model.User> userOptional16 = userRepository1.findByEmail("Student");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Password1!" + "'", str9, "Password1!");
// flaky "30) test0179(com.reservation_system.randoop.registrationservice.RegressionTest0)":         org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
// flaky "15) test0179(com.reservation_system.randoop.registrationservice.RegressionTest0)":         org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(userOptional16);
    }

    @Test
    public void test0180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0180");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("demo/data/test-users.csv");
        com.reservation_system.services.RegistrationService registrationService2 = new com.reservation_system.services.RegistrationService(userRepository1);
        com.reservation_system.model.Faculty faculty8 = new com.reservation_system.model.Faculty(0, "Password1!", "demo/data/test-users.csv", "researcher", false);
        java.lang.String str9 = faculty8.getName();
        userRepository1.addUser((com.reservation_system.model.User) faculty8);
        boolean boolean11 = userRepository1.headLabCoordinatorExists();
        com.reservation_system.services.RegistrationService registrationService12 = new com.reservation_system.services.RegistrationService(userRepository1);
        int int13 = userRepository1.getNextID();
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Password1!" + "'", str9, "Password1!");
// flaky "31) test0180(com.reservation_system.randoop.registrationservice.RegressionTest0)":         org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
// flaky "16) test0180(com.reservation_system.randoop.registrationservice.RegressionTest0)":         org.junit.Assert.assertTrue("'" + int13 + "' != '" + 102 + "'", int13 == 102);
    }

    @Test
    public void test0181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0181");
        com.reservation_system.model.Researcher researcher5 = new com.reservation_system.model.Researcher((-1), "headlabcoordinator", "andrew@example.com", "Guest", true);
    }

    @Test
    public void test0182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0182");
        com.reservation_system.model.Guest guest5 = new com.reservation_system.model.Guest((int) (byte) -1, "guest", "Researcher", "Faculty", true);
        java.lang.String str6 = guest5.getUserType();
        java.lang.String str7 = guest5.getUserType();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Guest" + "'", str6, "Guest");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Guest" + "'", str7, "Guest");
    }

    @Test
    public void test0183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0183");
        com.reservation_system.model.HeadLabCoordinator headLabCoordinator5 = new com.reservation_system.model.HeadLabCoordinator(102, "faculty", "Faculty", "faculty", true);
        boolean boolean6 = headLabCoordinator5.requiresDepartmentApproval();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test0184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0184");
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
            com.reservation_system.model.User user21 = registrationService16.registerUser("hi!", "Andrew", "Password1!", "headlabcoordinator");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid user type.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
// flaky "32) test0184(com.reservation_system.randoop.registrationservice.RegressionTest0)":         org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Password1!" + "'", str12, "Password1!");
        org.junit.Assert.assertNotNull(userList14);
    }

    @Test
    public void test0185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0185");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("demo/data/test-users.csv");
        boolean boolean2 = userRepository1.headLabCoordinatorExists();
        com.reservation_system.services.RegistrationService registrationService3 = new com.reservation_system.services.RegistrationService(userRepository1);
        boolean boolean5 = userRepository1.emailExists("");
        java.util.Optional<com.reservation_system.model.User> userOptional7 = userRepository1.findByEmail("");
        java.util.Optional<com.reservation_system.model.User> userOptional9 = userRepository1.findByEmail("hi!");
        java.util.List<com.reservation_system.model.User> userList10 = userRepository1.getAllUsers();
        com.reservation_system.repository.UserRepository userRepository12 = new com.reservation_system.repository.UserRepository("demo/data/test-users.csv");
        com.reservation_system.services.RegistrationService registrationService13 = new com.reservation_system.services.RegistrationService(userRepository12);
        com.reservation_system.model.Faculty faculty19 = new com.reservation_system.model.Faculty(0, "Password1!", "demo/data/test-users.csv", "researcher", false);
        java.lang.String str20 = faculty19.getName();
        userRepository12.addUser((com.reservation_system.model.User) faculty19);
        boolean boolean22 = userRepository12.headLabCoordinatorExists();
        com.reservation_system.model.Guest guest28 = new com.reservation_system.model.Guest((int) (byte) -1, "guest", "Researcher", "Faculty", true);
        userRepository12.addUser((com.reservation_system.model.User) guest28);
        boolean boolean31 = userRepository12.emailExists("Password1!");
        boolean boolean33 = userRepository12.emailExists("hi!");
        int int34 = userRepository12.getNextID();
        com.reservation_system.repository.UserRepository userRepository36 = new com.reservation_system.repository.UserRepository("demo/data/test-users.csv");
        com.reservation_system.services.RegistrationService registrationService37 = new com.reservation_system.services.RegistrationService(userRepository36);
        com.reservation_system.model.Faculty faculty43 = new com.reservation_system.model.Faculty(0, "Password1!", "demo/data/test-users.csv", "researcher", false);
        java.lang.String str44 = faculty43.getName();
        userRepository36.addUser((com.reservation_system.model.User) faculty43);
        boolean boolean46 = userRepository36.headLabCoordinatorExists();
        com.reservation_system.model.Guest guest52 = new com.reservation_system.model.Guest((int) (byte) -1, "guest", "Researcher", "Faculty", true);
        userRepository36.addUser((com.reservation_system.model.User) guest52);
        boolean boolean54 = userRepository36.headLabCoordinatorExists();
        com.reservation_system.repository.UserRepository userRepository56 = new com.reservation_system.repository.UserRepository("demo/data/test-users.csv");
        com.reservation_system.services.RegistrationService registrationService57 = new com.reservation_system.services.RegistrationService(userRepository56);
        com.reservation_system.model.Faculty faculty63 = new com.reservation_system.model.Faculty(0, "Password1!", "demo/data/test-users.csv", "researcher", false);
        java.lang.String str64 = faculty63.getName();
        userRepository56.addUser((com.reservation_system.model.User) faculty63);
        boolean boolean66 = userRepository56.headLabCoordinatorExists();
        com.reservation_system.repository.UserRepository userRepository68 = new com.reservation_system.repository.UserRepository("demo/data/test-users.csv");
        com.reservation_system.services.RegistrationService registrationService69 = new com.reservation_system.services.RegistrationService(userRepository68);
        com.reservation_system.model.Faculty faculty75 = new com.reservation_system.model.Faculty(0, "Password1!", "demo/data/test-users.csv", "researcher", false);
        java.lang.String str76 = faculty75.getName();
        userRepository68.addUser((com.reservation_system.model.User) faculty75);
        java.util.List<com.reservation_system.model.User> userList78 = userRepository68.getAllUsers();
        userRepository56.saveAllUsers(userList78);
        userRepository36.saveAllUsers(userList78);
        boolean boolean82 = userRepository36.emailExists("hi!");
        com.reservation_system.repository.UserRepository userRepository84 = new com.reservation_system.repository.UserRepository("demo/data/test-users.csv");
        com.reservation_system.services.RegistrationService registrationService85 = new com.reservation_system.services.RegistrationService(userRepository84);
        com.reservation_system.model.Faculty faculty91 = new com.reservation_system.model.Faculty(0, "Password1!", "demo/data/test-users.csv", "researcher", false);
        java.lang.String str92 = faculty91.getName();
        userRepository84.addUser((com.reservation_system.model.User) faculty91);
        boolean boolean94 = userRepository84.headLabCoordinatorExists();
        com.reservation_system.services.RegistrationService registrationService95 = new com.reservation_system.services.RegistrationService(userRepository84);
        java.util.List<com.reservation_system.model.User> userList96 = userRepository84.getAllUsers();
        userRepository36.saveAllUsers(userList96);
        userRepository12.saveAllUsers(userList96);
        userRepository1.saveAllUsers(userList96);
// flaky "33) test0185(com.reservation_system.randoop.registrationservice.RegressionTest0)":         org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
// flaky "17) test0185(com.reservation_system.randoop.registrationservice.RegressionTest0)":         org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(userOptional7);
        org.junit.Assert.assertNotNull(userOptional9);
        org.junit.Assert.assertNotNull(userList10);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "Password1!" + "'", str20, "Password1!");
// flaky "10) test0185(com.reservation_system.randoop.registrationservice.RegressionTest0)":         org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
// flaky "4) test0185(com.reservation_system.randoop.registrationservice.RegressionTest0)":         org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
// flaky "3) test0185(com.reservation_system.randoop.registrationservice.RegressionTest0)":         org.junit.Assert.assertTrue("'" + int34 + "' != '" + 102 + "'", int34 == 102);
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "Password1!" + "'", str44, "Password1!");
// flaky "2) test0185(com.reservation_system.randoop.registrationservice.RegressionTest0)":         org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + true + "'", boolean46 == true);
// flaky "1) test0185(com.reservation_system.randoop.registrationservice.RegressionTest0)":         org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + true + "'", boolean54 == true);
        org.junit.Assert.assertEquals("'" + str64 + "' != '" + "Password1!" + "'", str64, "Password1!");
// flaky "1) test0185(com.reservation_system.randoop.registrationservice.RegressionTest0)":         org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + true + "'", boolean66 == true);
        org.junit.Assert.assertEquals("'" + str76 + "' != '" + "Password1!" + "'", str76, "Password1!");
        org.junit.Assert.assertNotNull(userList78);
// flaky "1) test0185(com.reservation_system.randoop.registrationservice.RegressionTest0)":         org.junit.Assert.assertTrue("'" + boolean82 + "' != '" + true + "'", boolean82 == true);
        org.junit.Assert.assertEquals("'" + str92 + "' != '" + "Password1!" + "'", str92, "Password1!");
// flaky "1) test0185(com.reservation_system.randoop.registrationservice.RegressionTest0)":         org.junit.Assert.assertTrue("'" + boolean94 + "' != '" + true + "'", boolean94 == true);
        org.junit.Assert.assertNotNull(userList96);
    }

    @Test
    public void test0186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0186");
        com.reservation_system.model.HeadLabCoordinator headLabCoordinator5 = new com.reservation_system.model.HeadLabCoordinator(1, "student", "Researcher", "", false);
        java.lang.String str6 = headLabCoordinator5.getUserType();
        java.lang.String str7 = headLabCoordinator5.getUserType();
        java.lang.String str8 = headLabCoordinator5.getPassword();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "headlabcoordinator" + "'", str6, "headlabcoordinator");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "headlabcoordinator" + "'", str7, "headlabcoordinator");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test0187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0187");
        com.reservation_system.model.Student student5 = new com.reservation_system.model.Student((int) (byte) 0, "Student", "Andrew", "labmanager", false);
        java.lang.String str6 = student5.getUserType();
        java.lang.String str7 = student5.getUserType();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Student" + "'", str6, "Student");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Student" + "'", str7, "Student");
    }

    @Test
    public void test0188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0188");
        com.reservation_system.model.HeadLabCoordinator headLabCoordinator5 = new com.reservation_system.model.HeadLabCoordinator((int) (short) 1, "", "headlabcoordinator", "Andrew", false);
        java.lang.String str6 = headLabCoordinator5.getPassword();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Andrew" + "'", str6, "Andrew");
    }

    @Test
    public void test0189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0189");
        com.reservation_system.model.Guest guest5 = new com.reservation_system.model.Guest((-1), "demo/data/test-users.csv", "demo/data/test-users.csv", "researcher", true);
    }

    @Test
    public void test0190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0190");
        // The following exception was thrown during execution in test generation
        try {
            com.reservation_system.model.User user6 = com.reservation_system.patterns.factory.UserFactory.createUser("andrew@example.com", (int) (byte) 100, "hi!", "andrew@example.com", "Password1!", false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid user type: andrew@example.com");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0191");
        com.reservation_system.model.HeadLabCoordinator headLabCoordinator5 = new com.reservation_system.model.HeadLabCoordinator(10, "faculty", "Faculty", "demo/data/test-users.csv", false);
        int int6 = headLabCoordinator5.getID();
        java.lang.String str7 = headLabCoordinator5.getEmail();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Faculty" + "'", str7, "Faculty");
    }

    @Test
    public void test0192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0192");
        com.reservation_system.model.Researcher researcher5 = new com.reservation_system.model.Researcher(100, "Andrew", "Student", "Researcher", false);
        java.lang.Class<?> wildcardClass6 = researcher5.getClass();
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0193");
        com.reservation_system.model.Student student5 = new com.reservation_system.model.Student((int) ' ', "Password1!", "andrew@example.com", "researcher", false);
        java.lang.String str6 = student5.getUserType();
        int int7 = student5.getID();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Student" + "'", str6, "Student");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 32 + "'", int7 == 32);
    }

    @Test
    public void test0194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0194");
        com.reservation_system.model.Faculty faculty5 = new com.reservation_system.model.Faculty((int) (short) -1, "demo/data/test-users.csv", "Andrew", "", true);
    }

    @Test
    public void test0195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0195");
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
            com.reservation_system.model.User user18 = registrationService13.registerUser("", "faculty", "headlabcoordinator", "Guest");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid user type.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Password1!" + "'", str9, "Password1!");
    }

    @Test
    public void test0196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0196");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("demo/data/test-users.csv");
        com.reservation_system.services.RegistrationService registrationService2 = new com.reservation_system.services.RegistrationService(userRepository1);
        com.reservation_system.model.Faculty faculty8 = new com.reservation_system.model.Faculty(0, "Password1!", "demo/data/test-users.csv", "researcher", false);
        java.lang.String str9 = faculty8.getName();
        userRepository1.addUser((com.reservation_system.model.User) faculty8);
        java.util.List<com.reservation_system.model.User> userList11 = userRepository1.getAllUsers();
        com.reservation_system.model.LabManager labManager17 = new com.reservation_system.model.LabManager((int) (short) -1, "labmanager", "demo/data/test-users.csv", "Student", false);
        userRepository1.addUser((com.reservation_system.model.User) labManager17);
        com.reservation_system.services.RegistrationService registrationService19 = new com.reservation_system.services.RegistrationService(userRepository1);
        java.lang.Class<?> wildcardClass20 = registrationService19.getClass();
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Password1!" + "'", str9, "Password1!");
        org.junit.Assert.assertNotNull(userList11);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test0197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0197");
        com.reservation_system.model.Student student5 = new com.reservation_system.model.Student(102, "andrew@example.com", "Andrew", "Faculty", true);
    }

    @Test
    public void test0198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0198");
        com.reservation_system.model.User user6 = com.reservation_system.patterns.factory.UserFactory.createUser("headlabcoordinator", 100, "Password1!", "andrew@example.com", "faculty", false);
        java.lang.String str7 = user6.getPassword();
        org.junit.Assert.assertNotNull(user6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "faculty" + "'", str7, "faculty");
    }

    @Test
    public void test0199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0199");
        com.reservation_system.model.Guest guest5 = new com.reservation_system.model.Guest(0, "hi!", "hi!", "Password1!", false);
    }

    @Test
    public void test0200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0200");
        com.reservation_system.model.Guest guest5 = new com.reservation_system.model.Guest((int) (short) 10, "faculty", "researcher", "researcher", true);
        java.lang.String str6 = guest5.getUserType();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Guest" + "'", str6, "Guest");
    }

    @Test
    public void test0201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0201");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("demo/data/test-users.csv");
        boolean boolean2 = userRepository1.headLabCoordinatorExists();
        com.reservation_system.services.RegistrationService registrationService3 = new com.reservation_system.services.RegistrationService(userRepository1);
        boolean boolean5 = userRepository1.emailExists("");
        boolean boolean6 = userRepository1.headLabCoordinatorExists();
        java.util.List<com.reservation_system.model.User> userList7 = userRepository1.getAllUsers();
        com.reservation_system.model.Faculty faculty13 = new com.reservation_system.model.Faculty((int) '4', "Andrew", "", "faculty", false);
        userRepository1.addUser((com.reservation_system.model.User) faculty13);
        boolean boolean16 = userRepository1.emailExists("Student");
// flaky "34) test0201(com.reservation_system.randoop.registrationservice.RegressionTest0)":         org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
// flaky "18) test0201(com.reservation_system.randoop.registrationservice.RegressionTest0)":         org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
// flaky "11) test0201(com.reservation_system.randoop.registrationservice.RegressionTest0)":         org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(userList7);
// flaky "5) test0201(com.reservation_system.randoop.registrationservice.RegressionTest0)":         org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
    }

    @Test
    public void test0202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0202");
        com.reservation_system.model.Student student5 = new com.reservation_system.model.Student((int) '4', "student", "labmanager", "hi!", true);
    }

    @Test
    public void test0203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0203");
        com.reservation_system.model.Faculty faculty5 = new com.reservation_system.model.Faculty(0, "Password1!", "demo/data/test-users.csv", "researcher", false);
        java.lang.String str6 = faculty5.getName();
        java.lang.String str7 = faculty5.getName();
        java.lang.String str8 = faculty5.getName();
        boolean boolean9 = faculty5.isApproved();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Password1!" + "'", str6, "Password1!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Password1!" + "'", str7, "Password1!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Password1!" + "'", str8, "Password1!");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test0204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0204");
        com.reservation_system.model.User user6 = com.reservation_system.patterns.factory.UserFactory.createUser("student", (int) '4', "Researcher", "Guest", "Password1!", true);
        org.junit.Assert.assertNotNull(user6);
    }

    @Test
    public void test0205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0205");
        com.reservation_system.model.LabManager labManager5 = new com.reservation_system.model.LabManager((int) (short) 0, "", "labmanager", "Password1!", true);
        labManager5.setApproved(false);
        java.lang.String str8 = labManager5.getUserType();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "labmanager" + "'", str8, "labmanager");
    }

    @Test
    public void test0206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0206");
        com.reservation_system.model.Student student5 = new com.reservation_system.model.Student((int) ' ', "Password1!", "andrew@example.com", "researcher", false);
        java.lang.String str6 = student5.getEmail();
    }

    @Test
    public void test0207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0207");
        com.reservation_system.model.Researcher researcher5 = new com.reservation_system.model.Researcher((int) (short) -1, "faculty", "researcher", "hi!", true);
        java.lang.String str6 = researcher5.getUserType();
        java.lang.String str7 = researcher5.getEmail();
        researcher5.setApproved(true);
        boolean boolean10 = researcher5.requiresDepartmentApproval();
        java.lang.String str11 = researcher5.getUserType();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Researcher" + "'", str6, "Researcher");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "researcher" + "'", str7, "researcher");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Researcher" + "'", str11, "Researcher");
    }

    @Test
    public void test0208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0208");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("demo/data/test-users.csv");
        boolean boolean2 = userRepository1.headLabCoordinatorExists();
        com.reservation_system.services.RegistrationService registrationService3 = new com.reservation_system.services.RegistrationService(userRepository1);
        // The following exception was thrown during execution in test generation
        try {
            com.reservation_system.model.User user8 = registrationService3.registerUser("hi!", "andrew@example.com", "Student", "demo/data/test-users.csv");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid user type.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
// flaky "35) test0208(com.reservation_system.randoop.registrationservice.RegressionTest0)":         org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test0209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0209");
        com.reservation_system.model.Guest guest5 = new com.reservation_system.model.Guest(32, "labmanager", "labmanager", "", true);
    }

    @Test
    public void test0210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0210");
        com.reservation_system.model.Guest guest5 = new com.reservation_system.model.Guest((int) (short) 0, "Guest", "headlabcoordinator", "", true);
        boolean boolean6 = guest5.requiresDepartmentApproval();
        java.lang.String str7 = guest5.getUserType();
        java.lang.String str8 = guest5.getUserType();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Guest" + "'", str7, "Guest");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Guest" + "'", str8, "Guest");
    }

    @Test
    public void test0211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0211");
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
        java.lang.Class<?> wildcardClass25 = userRepository1.getClass();
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Password1!" + "'", str9, "Password1!");
// flaky "36) test0211(com.reservation_system.randoop.registrationservice.RegressionTest0)":         org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "Password1!" + "'", str21, "Password1!");
        org.junit.Assert.assertNotNull(userList23);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test0212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0212");
        com.reservation_system.model.Researcher researcher5 = new com.reservation_system.model.Researcher(102, "hi!", "Faculty", "researcher", true);
        researcher5.setApproved(true);
        java.lang.String str8 = researcher5.getUserType();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Researcher" + "'", str8, "Researcher");
    }

    @Test
    public void test0213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0213");
        com.reservation_system.model.LabManager labManager5 = new com.reservation_system.model.LabManager(32, "Researcher", "researcher", "andrew@example.com", false);
        java.lang.String str6 = labManager5.getEmail();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "researcher" + "'", str6, "researcher");
    }

    @Test
    public void test0214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0214");
        com.reservation_system.model.Researcher researcher5 = new com.reservation_system.model.Researcher(100, "Andrew", "Student", "Researcher", false);
        java.lang.String str6 = researcher5.getUserType();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Researcher" + "'", str6, "Researcher");
    }

    @Test
    public void test0215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0215");
        com.reservation_system.model.Student student5 = new com.reservation_system.model.Student(0, "Student", "Faculty", "hi!", false);
        java.lang.String str6 = student5.getPassword();
        java.lang.String str7 = student5.getUserType();
        java.lang.String str8 = student5.getUserType();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Student" + "'", str7, "Student");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Student" + "'", str8, "Student");
    }

    @Test
    public void test0216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0216");
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
        // The following exception was thrown during execution in test generation
        try {
            com.reservation_system.model.User user21 = registrationService16.registerUser("labmanager", "headlabcoordinator", "", "Password1!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Lab manager accounts must be generated by the head lab coordinator.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Password1!" + "'", str9, "Password1!");
// flaky "37) test0216(com.reservation_system.randoop.registrationservice.RegressionTest0)":         org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
// flaky "19) test0216(com.reservation_system.randoop.registrationservice.RegressionTest0)":         org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(userList15);
    }

    @Test
    public void test0217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0217");
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
        boolean boolean26 = userRepository1.emailExists("headlabcoordinator");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Password1!" + "'", str9, "Password1!");
// flaky "38) test0217(com.reservation_system.randoop.registrationservice.RegressionTest0)":         org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
// flaky "20) test0217(com.reservation_system.randoop.registrationservice.RegressionTest0)":         org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
// flaky "12) test0217(com.reservation_system.randoop.registrationservice.RegressionTest0)":         org.junit.Assert.assertTrue("'" + int23 + "' != '" + 102 + "'", int23 == 102);
// flaky "6) test0217(com.reservation_system.randoop.registrationservice.RegressionTest0)":         org.junit.Assert.assertTrue("'" + int24 + "' != '" + 102 + "'", int24 == 102);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
    }

    @Test
    public void test0218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0218");
        com.reservation_system.model.Student student5 = new com.reservation_system.model.Student(0, "Andrew", "andrew@example.com", "Faculty", false);
    }

    @Test
    public void test0219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0219");
        com.reservation_system.model.User user6 = com.reservation_system.patterns.factory.UserFactory.createUser("student", (-1), "", "andrew@example.com", "Guest", false);
        org.junit.Assert.assertNotNull(user6);
    }

    @Test
    public void test0220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0220");
        com.reservation_system.model.Researcher researcher5 = new com.reservation_system.model.Researcher((int) (short) -1, "faculty", "researcher", "hi!", true);
        java.lang.String str6 = researcher5.getUserType();
        java.lang.String str7 = researcher5.getEmail();
        researcher5.setApproved(true);
        boolean boolean10 = researcher5.requiresDepartmentApproval();
        java.lang.String str11 = researcher5.getEmail();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Researcher" + "'", str6, "Researcher");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "researcher" + "'", str7, "researcher");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "researcher" + "'", str11, "researcher");
    }

    @Test
    public void test0221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0221");
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
            com.reservation_system.model.User user21 = registrationService16.registerUser("Student", "headlabcoordinator", "andrew@example.com", "Student");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Password must contain uppercase, lowercase, number, and symbol, and be at least 8 characters long.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
// flaky "39) test0221(com.reservation_system.randoop.registrationservice.RegressionTest0)":         org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Password1!" + "'", str12, "Password1!");
        org.junit.Assert.assertNotNull(userList14);
    }

    @Test
    public void test0222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0222");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("demo/data/test-users.csv");
        com.reservation_system.services.RegistrationService registrationService2 = new com.reservation_system.services.RegistrationService(userRepository1);
        com.reservation_system.model.Faculty faculty8 = new com.reservation_system.model.Faculty(0, "Password1!", "demo/data/test-users.csv", "researcher", false);
        java.lang.String str9 = faculty8.getName();
        userRepository1.addUser((com.reservation_system.model.User) faculty8);
        boolean boolean12 = userRepository1.emailExists("Faculty");
        com.reservation_system.services.RegistrationService registrationService13 = new com.reservation_system.services.RegistrationService(userRepository1);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Password1!" + "'", str9, "Password1!");
// flaky "40) test0222(com.reservation_system.randoop.registrationservice.RegressionTest0)":         org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test0223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0223");
        com.reservation_system.model.Researcher researcher5 = new com.reservation_system.model.Researcher((int) (short) -1, "andrew@example.com", "guest", "labmanager", false);
        java.lang.String str6 = researcher5.getUserType();
        java.lang.String str7 = researcher5.getName();
        researcher5.setApproved(false);
        java.lang.String str10 = researcher5.getUserType();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Researcher" + "'", str6, "Researcher");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Researcher" + "'", str10, "Researcher");
    }

    @Test
    public void test0224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0224");
        com.reservation_system.model.Researcher researcher5 = new com.reservation_system.model.Researcher((int) (short) -1, "Andrew", "hi!", "Guest", false);
        java.lang.String str6 = researcher5.getName();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Andrew" + "'", str6, "Andrew");
    }

    @Test
    public void test0225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0225");
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
        boolean boolean49 = userRepository1.emailExists("Researcher");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Password1!" + "'", str9, "Password1!");
// flaky "41) test0225(com.reservation_system.randoop.registrationservice.RegressionTest0)":         org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
// flaky "21) test0225(com.reservation_system.randoop.registrationservice.RegressionTest0)":         org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "Password1!" + "'", str29, "Password1!");
// flaky "13) test0225(com.reservation_system.randoop.registrationservice.RegressionTest0)":         org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "Password1!" + "'", str41, "Password1!");
        org.junit.Assert.assertNotNull(userList43);
// flaky "7) test0225(com.reservation_system.randoop.registrationservice.RegressionTest0)":         org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + true + "'", boolean47 == true);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + true + "'", boolean49 == true);
    }

    @Test
    public void test0226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0226");
        com.reservation_system.model.Faculty faculty5 = new com.reservation_system.model.Faculty((int) 'a', "Password1!", "andrew@example.com", "Andrew", true);
        boolean boolean6 = faculty5.isApproved();
        java.lang.String str7 = faculty5.getPassword();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Andrew" + "'", str7, "Andrew");
    }

    @Test
    public void test0227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0227");
        com.reservation_system.model.Researcher researcher5 = new com.reservation_system.model.Researcher((int) (short) -1, "faculty", "researcher", "hi!", true);
        researcher5.setApproved(false);
        java.lang.String str8 = researcher5.getEmail();
        int int9 = researcher5.getID();
        int int10 = researcher5.getID();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "researcher" + "'", str8, "researcher");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
    }

    @Test
    public void test0228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0228");
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
        // The following exception was thrown during execution in test generation
        try {
            com.reservation_system.model.User user93 = registrationService88.registerUser("Faculty", "demo/data/test-users.csv", "researcher", "Student");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid email format.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Password1!" + "'", str9, "Password1!");
// flaky "42) test0228(com.reservation_system.randoop.registrationservice.RegressionTest0)":         org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
// flaky "22) test0228(com.reservation_system.randoop.registrationservice.RegressionTest0)":         org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
// flaky "14) test0228(com.reservation_system.randoop.registrationservice.RegressionTest0)":         org.junit.Assert.assertTrue("'" + int23 + "' != '" + 102 + "'", int23 == 102);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "Password1!" + "'", str33, "Password1!");
// flaky "8) test0228(com.reservation_system.randoop.registrationservice.RegressionTest0)":         org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
// flaky "4) test0228(com.reservation_system.randoop.registrationservice.RegressionTest0)":         org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + true + "'", boolean43 == true);
        org.junit.Assert.assertEquals("'" + str53 + "' != '" + "Password1!" + "'", str53, "Password1!");
// flaky "3) test0228(com.reservation_system.randoop.registrationservice.RegressionTest0)":         org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + true + "'", boolean55 == true);
        org.junit.Assert.assertEquals("'" + str65 + "' != '" + "Password1!" + "'", str65, "Password1!");
        org.junit.Assert.assertNotNull(userList67);
// flaky "2) test0228(com.reservation_system.randoop.registrationservice.RegressionTest0)":         org.junit.Assert.assertTrue("'" + boolean71 + "' != '" + true + "'", boolean71 == true);
        org.junit.Assert.assertEquals("'" + str81 + "' != '" + "Password1!" + "'", str81, "Password1!");
// flaky "2) test0228(com.reservation_system.randoop.registrationservice.RegressionTest0)":         org.junit.Assert.assertTrue("'" + boolean83 + "' != '" + true + "'", boolean83 == true);
        org.junit.Assert.assertNotNull(userList85);
    }

    @Test
    public void test0229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0229");
        com.reservation_system.model.LabManager labManager5 = new com.reservation_system.model.LabManager((int) (short) 10, "demo/data/test-users.csv", "Guest", "andrew@example.com", false);
        java.lang.Class<?> wildcardClass6 = labManager5.getClass();
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0230");
        com.reservation_system.model.Student student5 = new com.reservation_system.model.Student((int) ' ', "", "labmanager", "headlabcoordinator", true);
        student5.setApproved(false);
        boolean boolean8 = student5.isApproved();
        java.lang.String str9 = student5.getUserType();
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Student" + "'", str9, "Student");
    }

    @Test
    public void test0231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0231");
        com.reservation_system.model.Researcher researcher5 = new com.reservation_system.model.Researcher((int) (short) -1, "faculty", "researcher", "hi!", true);
        java.lang.String str6 = researcher5.getUserType();
        java.lang.String str7 = researcher5.getEmail();
        java.lang.String str8 = researcher5.getName();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Researcher" + "'", str6, "Researcher");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "researcher" + "'", str7, "researcher");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "faculty" + "'", str8, "faculty");
    }

    @Test
    public void test0232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0232");
        com.reservation_system.model.Guest guest5 = new com.reservation_system.model.Guest((int) (byte) -1, "Student", "labmanager", "Password1!", false);
    }

    @Test
    public void test0233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0233");
        // The following exception was thrown during execution in test generation
        try {
            com.reservation_system.model.User user6 = com.reservation_system.patterns.factory.UserFactory.createUser("", (int) ' ', "labmanager", "Faculty", "guest", false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid user type: ");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0234");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("demo/data/test-users.csv");
        boolean boolean2 = userRepository1.headLabCoordinatorExists();
        com.reservation_system.services.RegistrationService registrationService3 = new com.reservation_system.services.RegistrationService(userRepository1);
        boolean boolean5 = userRepository1.emailExists("");
        com.reservation_system.repository.UserRepository userRepository7 = new com.reservation_system.repository.UserRepository("demo/data/test-users.csv");
        com.reservation_system.services.RegistrationService registrationService8 = new com.reservation_system.services.RegistrationService(userRepository7);
        com.reservation_system.model.Faculty faculty14 = new com.reservation_system.model.Faculty(0, "Password1!", "demo/data/test-users.csv", "researcher", false);
        java.lang.String str15 = faculty14.getName();
        userRepository7.addUser((com.reservation_system.model.User) faculty14);
        java.util.List<com.reservation_system.model.User> userList17 = userRepository7.getAllUsers();
        userRepository1.saveAllUsers(userList17);
        boolean boolean20 = userRepository1.emailExists("Password1!");
        java.util.List<com.reservation_system.model.User> userList21 = userRepository1.getAllUsers();
// flaky "43) test0234(com.reservation_system.randoop.registrationservice.RegressionTest0)":         org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Password1!" + "'", str15, "Password1!");
        org.junit.Assert.assertNotNull(userList17);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertNotNull(userList21);
    }

    @Test
    public void test0235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0235");
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
            com.reservation_system.model.User user29 = registrationService24.registerUser("Andrew", "Researcher", "faculty", "");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid user type.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Password1!" + "'", str9, "Password1!");
// flaky "44) test0235(com.reservation_system.randoop.registrationservice.RegressionTest0)":         org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
// flaky "23) test0235(com.reservation_system.randoop.registrationservice.RegressionTest0)":         org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
// flaky "15) test0235(com.reservation_system.randoop.registrationservice.RegressionTest0)":         org.junit.Assert.assertTrue("'" + int23 + "' != '" + 102 + "'", int23 == 102);
    }

    @Test
    public void test0236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0236");
        com.reservation_system.model.Faculty faculty5 = new com.reservation_system.model.Faculty((int) (short) 100, "demo/data/test-users.csv", "", "Andrew", false);
    }

    @Test
    public void test0237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0237");
        com.reservation_system.model.Guest guest5 = new com.reservation_system.model.Guest((int) (short) 10, "researcher", "Student", "faculty", true);
    }

    @Test
    public void test0238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0238");
        com.reservation_system.model.HeadLabCoordinator headLabCoordinator5 = new com.reservation_system.model.HeadLabCoordinator((int) (byte) -1, "Password1!", "student", "", false);
    }

    @Test
    public void test0239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0239");
        com.reservation_system.model.LabManager labManager5 = new com.reservation_system.model.LabManager((int) 'a', "headlabcoordinator", "Researcher", "Andrew", false);
        boolean boolean6 = labManager5.isApproved();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test0240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0240");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("demo/data/test-users.csv");
        com.reservation_system.services.RegistrationService registrationService2 = new com.reservation_system.services.RegistrationService(userRepository1);
        com.reservation_system.model.Faculty faculty8 = new com.reservation_system.model.Faculty(0, "Password1!", "demo/data/test-users.csv", "researcher", false);
        java.lang.String str9 = faculty8.getName();
        userRepository1.addUser((com.reservation_system.model.User) faculty8);
        boolean boolean11 = userRepository1.headLabCoordinatorExists();
        com.reservation_system.model.Guest guest17 = new com.reservation_system.model.Guest((int) (byte) -1, "guest", "Researcher", "Faculty", true);
        userRepository1.addUser((com.reservation_system.model.User) guest17);
        boolean boolean20 = userRepository1.emailExists("Password1!");
        boolean boolean22 = userRepository1.emailExists("researcher");
        java.util.Optional<com.reservation_system.model.User> userOptional24 = userRepository1.findByEmail("Guest");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Password1!" + "'", str9, "Password1!");
// flaky "45) test0240(com.reservation_system.randoop.registrationservice.RegressionTest0)":         org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertNotNull(userOptional24);
    }

    @Test
    public void test0241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0241");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("demo/data/test-users.csv");
        boolean boolean2 = userRepository1.headLabCoordinatorExists();
        com.reservation_system.services.RegistrationService registrationService3 = new com.reservation_system.services.RegistrationService(userRepository1);
        boolean boolean5 = userRepository1.emailExists("");
        boolean boolean6 = userRepository1.headLabCoordinatorExists();
        com.reservation_system.services.RegistrationService registrationService7 = new com.reservation_system.services.RegistrationService(userRepository1);
        // The following exception was thrown during execution in test generation
        try {
            com.reservation_system.model.User user12 = registrationService7.registerUser("Password1!", "demo/data/test-users.csv", "guest", "labmanager");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid user type.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
// flaky "46) test0241(com.reservation_system.randoop.registrationservice.RegressionTest0)":         org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
// flaky "24) test0241(com.reservation_system.randoop.registrationservice.RegressionTest0)":         org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test0242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0242");
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
        java.util.List<com.reservation_system.model.User> userList30 = userRepository29.getAllUsers();
        com.reservation_system.services.RegistrationService registrationService31 = new com.reservation_system.services.RegistrationService(userRepository29);
        java.util.List<com.reservation_system.model.User> userList32 = userRepository29.getAllUsers();
        boolean boolean34 = userRepository29.emailExists("Guest");
        com.reservation_system.repository.UserRepository userRepository36 = new com.reservation_system.repository.UserRepository("demo/data/test-users.csv");
        boolean boolean37 = userRepository36.headLabCoordinatorExists();
        com.reservation_system.repository.UserRepository userRepository39 = new com.reservation_system.repository.UserRepository("demo/data/test-users.csv");
        com.reservation_system.services.RegistrationService registrationService40 = new com.reservation_system.services.RegistrationService(userRepository39);
        com.reservation_system.model.Faculty faculty46 = new com.reservation_system.model.Faculty(0, "Password1!", "demo/data/test-users.csv", "researcher", false);
        java.lang.String str47 = faculty46.getName();
        userRepository39.addUser((com.reservation_system.model.User) faculty46);
        boolean boolean49 = userRepository39.headLabCoordinatorExists();
        com.reservation_system.model.Guest guest55 = new com.reservation_system.model.Guest((int) (byte) -1, "guest", "Researcher", "Faculty", true);
        userRepository39.addUser((com.reservation_system.model.User) guest55);
        boolean boolean57 = userRepository39.headLabCoordinatorExists();
        com.reservation_system.repository.UserRepository userRepository59 = new com.reservation_system.repository.UserRepository("demo/data/test-users.csv");
        com.reservation_system.services.RegistrationService registrationService60 = new com.reservation_system.services.RegistrationService(userRepository59);
        com.reservation_system.model.Faculty faculty66 = new com.reservation_system.model.Faculty(0, "Password1!", "demo/data/test-users.csv", "researcher", false);
        java.lang.String str67 = faculty66.getName();
        userRepository59.addUser((com.reservation_system.model.User) faculty66);
        boolean boolean69 = userRepository59.headLabCoordinatorExists();
        com.reservation_system.repository.UserRepository userRepository71 = new com.reservation_system.repository.UserRepository("demo/data/test-users.csv");
        com.reservation_system.services.RegistrationService registrationService72 = new com.reservation_system.services.RegistrationService(userRepository71);
        com.reservation_system.model.Faculty faculty78 = new com.reservation_system.model.Faculty(0, "Password1!", "demo/data/test-users.csv", "researcher", false);
        java.lang.String str79 = faculty78.getName();
        userRepository71.addUser((com.reservation_system.model.User) faculty78);
        java.util.List<com.reservation_system.model.User> userList81 = userRepository71.getAllUsers();
        userRepository59.saveAllUsers(userList81);
        userRepository39.saveAllUsers(userList81);
        userRepository36.saveAllUsers(userList81);
        userRepository29.saveAllUsers(userList81);
        userRepository1.saveAllUsers(userList81);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Password1!" + "'", str9, "Password1!");
// flaky "47) test0242(com.reservation_system.randoop.registrationservice.RegressionTest0)":         org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
// flaky "25) test0242(com.reservation_system.randoop.registrationservice.RegressionTest0)":         org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
// flaky "16) test0242(com.reservation_system.randoop.registrationservice.RegressionTest0)":         org.junit.Assert.assertTrue("'" + int22 + "' != '" + 102 + "'", int22 == 102);
// flaky "9) test0242(com.reservation_system.randoop.registrationservice.RegressionTest0)":         org.junit.Assert.assertTrue("'" + int23 + "' != '" + 102 + "'", int23 == 102);
// flaky "5) test0242(com.reservation_system.randoop.registrationservice.RegressionTest0)":         org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertNotNull(userList26);
        org.junit.Assert.assertNotNull(userList30);
        org.junit.Assert.assertNotNull(userList32);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
// flaky "4) test0242(com.reservation_system.randoop.registrationservice.RegressionTest0)":         org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
        org.junit.Assert.assertEquals("'" + str47 + "' != '" + "Password1!" + "'", str47, "Password1!");
// flaky "3) test0242(com.reservation_system.randoop.registrationservice.RegressionTest0)":         org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + true + "'", boolean49 == true);
// flaky "3) test0242(com.reservation_system.randoop.registrationservice.RegressionTest0)":         org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + true + "'", boolean57 == true);
        org.junit.Assert.assertEquals("'" + str67 + "' != '" + "Password1!" + "'", str67, "Password1!");
// flaky "2) test0242(com.reservation_system.randoop.registrationservice.RegressionTest0)":         org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + true + "'", boolean69 == true);
        org.junit.Assert.assertEquals("'" + str79 + "' != '" + "Password1!" + "'", str79, "Password1!");
        org.junit.Assert.assertNotNull(userList81);
    }

    @Test
    public void test0243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0243");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("demo/data/test-users.csv");
        java.util.List<com.reservation_system.model.User> userList2 = userRepository1.getAllUsers();
        com.reservation_system.services.RegistrationService registrationService3 = new com.reservation_system.services.RegistrationService(userRepository1);
        java.lang.Class<?> wildcardClass4 = registrationService3.getClass();
        org.junit.Assert.assertNotNull(userList2);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test0244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0244");
        com.reservation_system.model.HeadLabCoordinator headLabCoordinator5 = new com.reservation_system.model.HeadLabCoordinator((int) (byte) 1, "", "Researcher", "faculty", true);
    }

    @Test
    public void test0245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0245");
        com.reservation_system.model.Student student5 = new com.reservation_system.model.Student((int) (short) 1, "labmanager", "", "", true);
        java.lang.String str6 = student5.getUserType();
        java.lang.String str7 = student5.getUserType();
        java.lang.String str8 = student5.getName();
        student5.setApproved(true);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Student" + "'", str6, "Student");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Student" + "'", str7, "Student");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "labmanager" + "'", str8, "labmanager");
    }

    @Test
    public void test0246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0246");
        com.reservation_system.model.Faculty faculty5 = new com.reservation_system.model.Faculty(102, "Guest", "Password1!", "faculty", false);
        java.lang.String str6 = faculty5.getUserType();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Faculty" + "'", str6, "Faculty");
    }

    @Test
    public void test0247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0247");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("demo/data/test-users.csv");
        int int2 = userRepository1.getNextID();
        int int3 = userRepository1.getNextID();
        boolean boolean5 = userRepository1.emailExists("faculty");
        java.util.Optional<com.reservation_system.model.User> userOptional7 = userRepository1.findByEmail("");
        boolean boolean8 = userRepository1.headLabCoordinatorExists();
        com.reservation_system.model.User user9 = null;
        // The following exception was thrown during execution in test generation
        try {
            userRepository1.addUser(user9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.reservation_system.model.User.getName()\" because \"user\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky "48) test0247(com.reservation_system.randoop.registrationservice.RegressionTest0)":         org.junit.Assert.assertTrue("'" + int2 + "' != '" + 102 + "'", int2 == 102);
// flaky "26) test0247(com.reservation_system.randoop.registrationservice.RegressionTest0)":         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 102 + "'", int3 == 102);
// flaky "17) test0247(com.reservation_system.randoop.registrationservice.RegressionTest0)":         org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(userOptional7);
// flaky "10) test0247(com.reservation_system.randoop.registrationservice.RegressionTest0)":         org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test0248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0248");
        com.reservation_system.model.Researcher researcher5 = new com.reservation_system.model.Researcher((int) (short) -1, "faculty", "researcher", "hi!", true);
        researcher5.setApproved(false);
        java.lang.String str8 = researcher5.getEmail();
        int int9 = researcher5.getID();
        java.lang.String str10 = researcher5.getName();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "researcher" + "'", str8, "researcher");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "faculty" + "'", str10, "faculty");
    }

    @Test
    public void test0249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0249");
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
        java.lang.String str39 = headLabCoordinator35.getUserType();
        org.junit.Assert.assertNotNull(userList2);
        org.junit.Assert.assertNotNull(userList4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(userList7);
        org.junit.Assert.assertNotNull(userOptional9);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "Password1!" + "'", str19, "Password1!");
// flaky "49) test0249(com.reservation_system.randoop.registrationservice.RegressionTest0)":         org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
// flaky "27) test0249(com.reservation_system.randoop.registrationservice.RegressionTest0)":         org.junit.Assert.assertTrue("'" + int22 + "' != '" + 102 + "'", int22 == 102);
        org.junit.Assert.assertNotNull(userList25);
        org.junit.Assert.assertNotNull(userList27);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 10 + "'", int36 == 10);
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "headlabcoordinator" + "'", str37, "headlabcoordinator");
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "headlabcoordinator" + "'", str39, "headlabcoordinator");
    }

    @Test
    public void test0250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0250");
        com.reservation_system.model.Faculty faculty5 = new com.reservation_system.model.Faculty((int) (short) 0, "", "hi!", "Faculty", true);
    }

    @Test
    public void test0251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0251");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("demo/data/test-users.csv");
        com.reservation_system.services.RegistrationService registrationService2 = new com.reservation_system.services.RegistrationService(userRepository1);
        com.reservation_system.model.Faculty faculty8 = new com.reservation_system.model.Faculty(0, "Password1!", "demo/data/test-users.csv", "researcher", false);
        java.lang.String str9 = faculty8.getName();
        userRepository1.addUser((com.reservation_system.model.User) faculty8);
        boolean boolean11 = userRepository1.headLabCoordinatorExists();
        com.reservation_system.services.RegistrationService registrationService12 = new com.reservation_system.services.RegistrationService(userRepository1);
        com.reservation_system.services.RegistrationService registrationService13 = new com.reservation_system.services.RegistrationService(userRepository1);
        // The following exception was thrown during execution in test generation
        try {
            com.reservation_system.model.User user18 = registrationService13.registerUser("demo/data/test-users.csv", "andrew@example.com", "andrew@example.com", "Researcher");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid user type.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Password1!" + "'", str9, "Password1!");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test0252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0252");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("demo/data/test-users.csv");
        com.reservation_system.services.RegistrationService registrationService2 = new com.reservation_system.services.RegistrationService(userRepository1);
        com.reservation_system.model.Faculty faculty8 = new com.reservation_system.model.Faculty(0, "Password1!", "demo/data/test-users.csv", "researcher", false);
        java.lang.String str9 = faculty8.getName();
        userRepository1.addUser((com.reservation_system.model.User) faculty8);
        boolean boolean11 = userRepository1.headLabCoordinatorExists();
        com.reservation_system.model.Guest guest17 = new com.reservation_system.model.Guest((int) (byte) -1, "guest", "Researcher", "Faculty", true);
        userRepository1.addUser((com.reservation_system.model.User) guest17);
        java.lang.String str19 = guest17.getUserType();
        java.lang.Class<?> wildcardClass20 = guest17.getClass();
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Password1!" + "'", str9, "Password1!");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "Guest" + "'", str19, "Guest");
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test0253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0253");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("demo/data/test-users.csv");
        java.util.Optional<com.reservation_system.model.User> userOptional3 = userRepository1.findByEmail("hi!");
        int int4 = userRepository1.getNextID();
        com.reservation_system.model.Researcher researcher10 = new com.reservation_system.model.Researcher((int) (byte) 10, "", "Guest", "headlabcoordinator", true);
        userRepository1.addUser((com.reservation_system.model.User) researcher10);
        java.lang.String str12 = researcher10.getName();
        org.junit.Assert.assertNotNull(userOptional3);
// flaky "50) test0253(com.reservation_system.randoop.registrationservice.RegressionTest0)":         org.junit.Assert.assertTrue("'" + int4 + "' != '" + 102 + "'", int4 == 102);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test0254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0254");
        com.reservation_system.model.Researcher researcher5 = new com.reservation_system.model.Researcher((-1), "demo/data/test-users.csv", "headlabcoordinator", "", false);
        boolean boolean6 = researcher5.requiresDepartmentApproval();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test0255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0255");
        com.reservation_system.model.Student student5 = new com.reservation_system.model.Student((int) (short) 10, "Password1!", "researcher", "student", true);
    }

    @Test
    public void test0256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0256");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("demo/data/test-users.csv");
        com.reservation_system.services.RegistrationService registrationService2 = new com.reservation_system.services.RegistrationService(userRepository1);
        com.reservation_system.model.Faculty faculty8 = new com.reservation_system.model.Faculty(0, "Password1!", "demo/data/test-users.csv", "researcher", false);
        java.lang.String str9 = faculty8.getName();
        userRepository1.addUser((com.reservation_system.model.User) faculty8);
        boolean boolean11 = userRepository1.headLabCoordinatorExists();
        com.reservation_system.model.Guest guest17 = new com.reservation_system.model.Guest((int) (byte) -1, "guest", "Researcher", "Faculty", true);
        userRepository1.addUser((com.reservation_system.model.User) guest17);
        boolean boolean19 = guest17.requiresDepartmentApproval();
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Password1!" + "'", str9, "Password1!");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test0257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0257");
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
        java.util.Optional<com.reservation_system.model.User> userOptional27 = userRepository1.findByEmail("labmanager");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Password1!" + "'", str9, "Password1!");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
// flaky "51) test0257(com.reservation_system.randoop.registrationservice.RegressionTest0)":         org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
// flaky "28) test0257(com.reservation_system.randoop.registrationservice.RegressionTest0)":         org.junit.Assert.assertTrue("'" + int23 + "' != '" + 102 + "'", int23 == 102);
// flaky "18) test0257(com.reservation_system.randoop.registrationservice.RegressionTest0)":         org.junit.Assert.assertTrue("'" + int24 + "' != '" + 102 + "'", int24 == 102);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertNotNull(userOptional27);
    }

    @Test
    public void test0258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0258");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("demo/data/test-users.csv");
        com.reservation_system.services.RegistrationService registrationService2 = new com.reservation_system.services.RegistrationService(userRepository1);
        com.reservation_system.services.RegistrationService registrationService3 = new com.reservation_system.services.RegistrationService(userRepository1);
        com.reservation_system.services.RegistrationService registrationService4 = new com.reservation_system.services.RegistrationService(userRepository1);
        // The following exception was thrown during execution in test generation
        try {
            com.reservation_system.model.User user9 = registrationService4.registerUser("Andrew", "labmanager", "Andrew", "Andrew");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid user type.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0259");
        com.reservation_system.model.Student student5 = new com.reservation_system.model.Student((int) ' ', "", "labmanager", "headlabcoordinator", true);
        java.lang.String str6 = student5.getUserType();
        student5.setApproved(true);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Student" + "'", str6, "Student");
    }

    @Test
    public void test0260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0260");
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
            com.reservation_system.model.User user22 = registrationService17.registerUser("Researcher", "headlabcoordinator", "labmanager", "student");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid email format.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Password1!" + "'", str12, "Password1!");
        org.junit.Assert.assertNotNull(userList14);
    }

    @Test
    public void test0261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0261");
        com.reservation_system.model.HeadLabCoordinator headLabCoordinator5 = new com.reservation_system.model.HeadLabCoordinator(10, "faculty", "Faculty", "demo/data/test-users.csv", false);
        int int6 = headLabCoordinator5.getID();
        java.lang.String str7 = headLabCoordinator5.getUserType();
        headLabCoordinator5.setApproved(false);
        java.lang.Class<?> wildcardClass10 = headLabCoordinator5.getClass();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "headlabcoordinator" + "'", str7, "headlabcoordinator");
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0262");
        com.reservation_system.model.Student student5 = new com.reservation_system.model.Student((int) (byte) 10, "", "", "Researcher", true);
    }

    @Test
    public void test0263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0263");
        // The following exception was thrown during execution in test generation
        try {
            com.reservation_system.model.User user6 = com.reservation_system.patterns.factory.UserFactory.createUser("Password1!", 1, "labmanager", "Guest", "Password1!", false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid user type: Password1!");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0264");
        com.reservation_system.model.Researcher researcher5 = new com.reservation_system.model.Researcher((int) '4', "hi!", "hi!", "labmanager", false);
        java.lang.String str6 = researcher5.getUserType();
        java.lang.String str7 = researcher5.getEmail();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Researcher" + "'", str6, "Researcher");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
    }

    @Test
    public void test0265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0265");
        com.reservation_system.model.LabManager labManager5 = new com.reservation_system.model.LabManager((int) '#', "headlabcoordinator", "", "Guest", true);
        java.lang.String str6 = labManager5.getPassword();
        java.lang.Class<?> wildcardClass7 = labManager5.getClass();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Guest" + "'", str6, "Guest");
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0266");
        com.reservation_system.model.LabManager labManager5 = new com.reservation_system.model.LabManager(1, "Guest", "", "Password1!", true);
    }

    @Test
    public void test0267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0267");
        com.reservation_system.model.Researcher researcher5 = new com.reservation_system.model.Researcher((int) '4', "labmanager", "Andrew", "researcher", true);
        java.lang.String str6 = researcher5.getUserType();
        researcher5.setApproved(false);
        java.lang.Class<?> wildcardClass9 = researcher5.getClass();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Researcher" + "'", str6, "Researcher");
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0268");
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
        // The following exception was thrown during execution in test generation
        try {
            com.reservation_system.model.User user26 = registrationService21.registerUser("andrew@example.com", "demo/data/test-users.csv", "", "");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid user type.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Password1!" + "'", str9, "Password1!");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
// flaky "52) test0268(com.reservation_system.randoop.registrationservice.RegressionTest0)":         org.junit.Assert.assertTrue("'" + int12 + "' != '" + 102 + "'", int12 == 102);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test0269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0269");
        // The following exception was thrown during execution in test generation
        try {
            com.reservation_system.model.User user6 = com.reservation_system.patterns.factory.UserFactory.createUser("Andrew", (int) 'a', "labmanager", "headlabcoordinator", "guest", false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid user type: Andrew");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0270");
        com.reservation_system.model.Faculty faculty5 = new com.reservation_system.model.Faculty((int) '#', "Andrew", "guest", "labmanager", true);
        java.lang.String str6 = faculty5.getPassword();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "labmanager" + "'", str6, "labmanager");
    }

    @Test
    public void test0271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0271");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("demo/data/test-users.csv");
        com.reservation_system.services.RegistrationService registrationService2 = new com.reservation_system.services.RegistrationService(userRepository1);
        com.reservation_system.services.RegistrationService registrationService3 = new com.reservation_system.services.RegistrationService(userRepository1);
        boolean boolean5 = userRepository1.emailExists("faculty");
        java.util.Optional<com.reservation_system.model.User> userOptional7 = userRepository1.findByEmail("researcher");
        com.reservation_system.model.Student student13 = new com.reservation_system.model.Student(0, "Student", "Faculty", "hi!", false);
        userRepository1.addUser((com.reservation_system.model.User) student13);
        java.lang.String str15 = student13.getUserType();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(userOptional7);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Student" + "'", str15, "Student");
    }

    @Test
    public void test0272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0272");
        com.reservation_system.model.HeadLabCoordinator headLabCoordinator5 = new com.reservation_system.model.HeadLabCoordinator((int) 'a', "headlabcoordinator", "", "Guest", true);
    }

    @Test
    public void test0273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0273");
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
        int int63 = userRepository1.getNextID();
        java.util.Optional<com.reservation_system.model.User> userOptional65 = userRepository1.findByEmail("Password1!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Password1!" + "'", str9, "Password1!");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "Password1!" + "'", str29, "Password1!");
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "Password1!" + "'", str41, "Password1!");
        org.junit.Assert.assertNotNull(userList43);
// flaky "53) test0273(com.reservation_system.randoop.registrationservice.RegressionTest0)":         org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + true + "'", boolean47 == true);
        org.junit.Assert.assertEquals("'" + str57 + "' != '" + "Password1!" + "'", str57, "Password1!");
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + true + "'", boolean59 == true);
        org.junit.Assert.assertNotNull(userList61);
// flaky "29) test0273(com.reservation_system.randoop.registrationservice.RegressionTest0)":         org.junit.Assert.assertTrue("'" + int63 + "' != '" + 102 + "'", int63 == 102);
        org.junit.Assert.assertNotNull(userOptional65);
    }

    @Test
    public void test0274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0274");
        com.reservation_system.model.User user6 = com.reservation_system.patterns.factory.UserFactory.createUser("faculty", (int) (short) -1, "faculty", "demo/data/test-users.csv", "Guest", false);
        org.junit.Assert.assertNotNull(user6);
    }

    @Test
    public void test0275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0275");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("demo/data/test-users.csv");
        com.reservation_system.services.RegistrationService registrationService2 = new com.reservation_system.services.RegistrationService(userRepository1);
        com.reservation_system.model.Faculty faculty8 = new com.reservation_system.model.Faculty(0, "Password1!", "demo/data/test-users.csv", "researcher", false);
        java.lang.String str9 = faculty8.getName();
        userRepository1.addUser((com.reservation_system.model.User) faculty8);
        boolean boolean11 = userRepository1.headLabCoordinatorExists();
        com.reservation_system.model.Guest guest17 = new com.reservation_system.model.Guest((int) (byte) -1, "guest", "Researcher", "Faculty", true);
        userRepository1.addUser((com.reservation_system.model.User) guest17);
        boolean boolean20 = userRepository1.emailExists("");
        boolean boolean21 = userRepository1.headLabCoordinatorExists();
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Password1!" + "'", str9, "Password1!");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
    }

    @Test
    public void test0276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0276");
        // The following exception was thrown during execution in test generation
        try {
            com.reservation_system.model.User user6 = com.reservation_system.patterns.factory.UserFactory.createUser("andrew@example.com", (int) (byte) 1, "guest", "andrew@example.com", "", false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid user type: andrew@example.com");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0277");
        com.reservation_system.model.Faculty faculty5 = new com.reservation_system.model.Faculty(100, "student", "Andrew", "researcher", true);
        java.lang.String str6 = faculty5.getUserType();
        java.lang.String str7 = faculty5.getUserType();
        faculty5.setApproved(true);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Faculty" + "'", str6, "Faculty");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Faculty" + "'", str7, "Faculty");
    }

    @Test
    public void test0278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0278");
        com.reservation_system.model.Student student5 = new com.reservation_system.model.Student((int) '4', "Researcher", "andrew@example.com", "headlabcoordinator", false);
    }

    @Test
    public void test0279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0279");
        com.reservation_system.model.Faculty faculty5 = new com.reservation_system.model.Faculty((-1), "Andrew", "hi!", "Andrew", true);
        java.lang.String str6 = faculty5.getEmail();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
    }

    @Test
    public void test0280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0280");
        com.reservation_system.model.Researcher researcher5 = new com.reservation_system.model.Researcher(0, "hi!", "Password1!", "Password1!", true);
        java.lang.String str6 = researcher5.getUserType();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Researcher" + "'", str6, "Researcher");
    }

    @Test
    public void test0281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0281");
        com.reservation_system.model.Researcher researcher5 = new com.reservation_system.model.Researcher(102, "Andrew", "guest", "Researcher", true);
        java.lang.String str6 = researcher5.getUserType();
        researcher5.setApproved(true);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Researcher" + "'", str6, "Researcher");
    }

    @Test
    public void test0282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0282");
        com.reservation_system.model.Researcher researcher5 = new com.reservation_system.model.Researcher((int) (byte) 10, "Researcher", "Faculty", "", true);
    }

    @Test
    public void test0283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0283");
        com.reservation_system.model.LabManager labManager5 = new com.reservation_system.model.LabManager((int) (byte) 10, "demo/data/test-users.csv", "hi!", "headlabcoordinator", true);
        java.lang.String str6 = labManager5.getEmail();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
    }

    @Test
    public void test0284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0284");
        com.reservation_system.model.Faculty faculty5 = new com.reservation_system.model.Faculty((int) (short) 0, "guest", "Andrew", "guest", true);
        int int6 = faculty5.getID();
        boolean boolean7 = faculty5.isApproved();
        boolean boolean8 = faculty5.requiresDepartmentApproval();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test0285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0285");
        com.reservation_system.model.Student student5 = new com.reservation_system.model.Student((int) ' ', "labmanager", "student", "labmanager", false);
    }

    @Test
    public void test0286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0286");
        // The following exception was thrown during execution in test generation
        try {
            com.reservation_system.model.User user6 = com.reservation_system.patterns.factory.UserFactory.createUser("hi!", 102, "Faculty", "", "hi!", true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid user type: hi!");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0287");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("demo/data/test-users.csv");
        boolean boolean2 = userRepository1.headLabCoordinatorExists();
        com.reservation_system.services.RegistrationService registrationService3 = new com.reservation_system.services.RegistrationService(userRepository1);
        boolean boolean5 = userRepository1.emailExists("");
        boolean boolean6 = userRepository1.headLabCoordinatorExists();
        java.util.List<com.reservation_system.model.User> userList7 = userRepository1.getAllUsers();
        com.reservation_system.model.Faculty faculty13 = new com.reservation_system.model.Faculty((int) '4', "Andrew", "", "faculty", false);
        userRepository1.addUser((com.reservation_system.model.User) faculty13);
        com.reservation_system.model.Faculty faculty20 = new com.reservation_system.model.Faculty((int) '4', "student", "andrew@example.com", "Guest", true);
        boolean boolean21 = faculty20.isApproved();
        faculty20.setApproved(false);
        boolean boolean24 = faculty20.requiresDepartmentApproval();
        userRepository1.addUser((com.reservation_system.model.User) faculty20);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(userList7);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
    }

    @Test
    public void test0288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0288");
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
        headLabCoordinator35.setApproved(false);
        org.junit.Assert.assertNotNull(userList2);
        org.junit.Assert.assertNotNull(userList4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(userList7);
        org.junit.Assert.assertNotNull(userOptional9);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "Password1!" + "'", str19, "Password1!");
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
// flaky "54) test0288(com.reservation_system.randoop.registrationservice.RegressionTest0)":         org.junit.Assert.assertTrue("'" + int22 + "' != '" + 102 + "'", int22 == 102);
        org.junit.Assert.assertNotNull(userList25);
        org.junit.Assert.assertNotNull(userList27);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 10 + "'", int36 == 10);
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "headlabcoordinator" + "'", str37, "headlabcoordinator");
    }

    @Test
    public void test0289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0289");
        com.reservation_system.model.LabManager labManager5 = new com.reservation_system.model.LabManager((int) (byte) 10, "researcher", "guest", "researcher", false);
        java.lang.String str6 = labManager5.getUserType();
        java.lang.String str7 = labManager5.getUserType();
        labManager5.setApproved(true);
        java.lang.Class<?> wildcardClass10 = labManager5.getClass();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "labmanager" + "'", str6, "labmanager");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "labmanager" + "'", str7, "labmanager");
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0290");
        com.reservation_system.model.HeadLabCoordinator headLabCoordinator5 = new com.reservation_system.model.HeadLabCoordinator(1, "headlabcoordinator", "labmanager", "Researcher", true);
        java.lang.String str6 = headLabCoordinator5.getUserType();
        int int7 = headLabCoordinator5.getID();
        java.lang.String str8 = headLabCoordinator5.getPassword();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "headlabcoordinator" + "'", str6, "headlabcoordinator");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Researcher" + "'", str8, "Researcher");
    }

    @Test
    public void test0291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0291");
        com.reservation_system.model.Student student5 = new com.reservation_system.model.Student((int) (byte) 100, "Researcher", "", "", false);
        java.lang.String str6 = student5.getUserType();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Student" + "'", str6, "Student");
    }

    @Test
    public void test0292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0292");
        com.reservation_system.model.Researcher researcher5 = new com.reservation_system.model.Researcher((int) (short) 1, "Password1!", "headlabcoordinator", "", false);
        researcher5.setApproved(true);
        researcher5.setApproved(false);
        java.lang.Class<?> wildcardClass10 = researcher5.getClass();
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0293");
        com.reservation_system.model.HeadLabCoordinator headLabCoordinator5 = new com.reservation_system.model.HeadLabCoordinator((int) (short) 0, "Researcher", "researcher", "Password1!", true);
        java.lang.String str6 = headLabCoordinator5.getName();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Researcher" + "'", str6, "Researcher");
    }

    @Test
    public void test0294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0294");
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
        // The following exception was thrown during execution in test generation
        try {
            com.reservation_system.model.User user25 = registrationService20.registerUser("Student", "faculty", "Faculty", "guest");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid email format.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Password1!" + "'", str9, "Password1!");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
    }

    @Test
    public void test0295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0295");
        com.reservation_system.model.Student student5 = new com.reservation_system.model.Student((int) (byte) 10, "andrew@example.com", "student", "Student", true);
        java.lang.String str6 = student5.getUserType();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Student" + "'", str6, "Student");
    }

    @Test
    public void test0296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0296");
        com.reservation_system.model.Faculty faculty5 = new com.reservation_system.model.Faculty(10, "researcher", "faculty", "", false);
        java.lang.String str6 = faculty5.getEmail();
        java.lang.String str7 = faculty5.getUserType();
        int int8 = faculty5.getID();
        java.lang.String str9 = faculty5.getUserType();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "faculty" + "'", str6, "faculty");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Faculty" + "'", str7, "Faculty");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 10 + "'", int8 == 10);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Faculty" + "'", str9, "Faculty");
    }

    @Test
    public void test0297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0297");
        com.reservation_system.model.Student student5 = new com.reservation_system.model.Student((int) (short) 1, "labmanager", "", "", true);
        int int6 = student5.getID();
        java.lang.String str7 = student5.getUserType();
        java.lang.String str8 = student5.getEmail();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Student" + "'", str7, "Student");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test0298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0298");
        com.reservation_system.model.Student student5 = new com.reservation_system.model.Student((int) (byte) 10, "hi!", "labmanager", "Password1!", false);
        java.lang.String str6 = student5.getUserType();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Student" + "'", str6, "Student");
    }

    @Test
    public void test0299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0299");
        com.reservation_system.model.HeadLabCoordinator headLabCoordinator5 = new com.reservation_system.model.HeadLabCoordinator(102, "demo/data/test-users.csv", "", "Andrew", false);
        java.lang.String str6 = headLabCoordinator5.getUserType();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "headlabcoordinator" + "'", str6, "headlabcoordinator");
    }

    @Test
    public void test0300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0300");
        com.reservation_system.model.Student student5 = new com.reservation_system.model.Student((int) (short) -1, "headlabcoordinator", "student", "Password1!", true);
    }

    @Test
    public void test0301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0301");
        com.reservation_system.model.Student student5 = new com.reservation_system.model.Student((int) (byte) 0, "Student", "headlabcoordinator", "student", false);
        boolean boolean6 = student5.isApproved();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test0302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0302");
        com.reservation_system.model.Guest guest5 = new com.reservation_system.model.Guest((int) '4', "", "andrew@example.com", "labmanager", false);
    }

    @Test
    public void test0303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0303");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("demo/data/test-users.csv");
        java.util.List<com.reservation_system.model.User> userList2 = userRepository1.getAllUsers();
        com.reservation_system.services.RegistrationService registrationService3 = new com.reservation_system.services.RegistrationService(userRepository1);
        com.reservation_system.services.RegistrationService registrationService4 = new com.reservation_system.services.RegistrationService(userRepository1);
        java.util.List<com.reservation_system.model.User> userList5 = userRepository1.getAllUsers();
        java.lang.Class<?> wildcardClass6 = userRepository1.getClass();
        org.junit.Assert.assertNotNull(userList2);
        org.junit.Assert.assertNotNull(userList5);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0304");
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
        int int51 = userRepository1.getNextID();
        boolean boolean53 = userRepository1.emailExists("Guest");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Password1!" + "'", str12, "Password1!");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "Password1!" + "'", str32, "Password1!");
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "Password1!" + "'", str44, "Password1!");
        org.junit.Assert.assertNotNull(userList46);
// flaky "55) test0304(com.reservation_system.randoop.registrationservice.RegressionTest0)":         org.junit.Assert.assertTrue("'" + int51 + "' != '" + 102 + "'", int51 == 102);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + true + "'", boolean53 == true);
    }

    @Test
    public void test0305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0305");
        com.reservation_system.model.Student student5 = new com.reservation_system.model.Student(10, "faculty", "", "", true);
    }

    @Test
    public void test0306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0306");
        com.reservation_system.model.Student student5 = new com.reservation_system.model.Student((int) ' ', "Faculty", "Researcher", "demo/data/test-users.csv", true);
    }

    @Test
    public void test0307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0307");
        com.reservation_system.model.Researcher researcher5 = new com.reservation_system.model.Researcher((int) (short) -1, "Andrew", "student", "Guest", false);
        java.lang.String str6 = researcher5.getName();
        java.lang.String str7 = researcher5.getUserType();
        java.lang.String str8 = researcher5.getEmail();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Andrew" + "'", str6, "Andrew");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Researcher" + "'", str7, "Researcher");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "student" + "'", str8, "student");
    }

    @Test
    public void test0308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0308");
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
        java.util.Optional<com.reservation_system.model.User> userOptional33 = userRepository1.findByEmail("labmanager");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Password1!" + "'", str9, "Password1!");
        org.junit.Assert.assertNotNull(userList11);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "Password1!" + "'", str27, "Password1!");
        org.junit.Assert.assertNotNull(userList29);
        org.junit.Assert.assertNotNull(userOptional33);
    }

    @Test
    public void test0309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0309");
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
            com.reservation_system.model.User user19 = registrationService14.registerUser("Researcher", "Guest", "Andrew", "");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid email format.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Password1!" + "'", str9, "Password1!");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
// flaky "56) test0309(com.reservation_system.randoop.registrationservice.RegressionTest0)":         org.junit.Assert.assertTrue("'" + int13 + "' != '" + 102 + "'", int13 == 102);
    }

    @Test
    public void test0310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0310");
        com.reservation_system.model.Researcher researcher5 = new com.reservation_system.model.Researcher((int) (byte) -1, "Andrew", "demo/data/test-users.csv", "Researcher", false);
    }

    @Test
    public void test0311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0311");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("demo/data/test-users.csv");
        boolean boolean2 = userRepository1.headLabCoordinatorExists();
        com.reservation_system.services.RegistrationService registrationService3 = new com.reservation_system.services.RegistrationService(userRepository1);
        boolean boolean5 = userRepository1.emailExists("");
        boolean boolean6 = userRepository1.headLabCoordinatorExists();
        com.reservation_system.services.RegistrationService registrationService7 = new com.reservation_system.services.RegistrationService(userRepository1);
        java.util.List<com.reservation_system.model.User> userList8 = userRepository1.getAllUsers();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(userList8);
    }

    @Test
    public void test0312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0312");
        com.reservation_system.model.Student student5 = new com.reservation_system.model.Student(10, "Password1!", "Researcher", "Password1!", false);
        java.lang.String str6 = student5.getUserType();
        boolean boolean7 = student5.requiresDepartmentApproval();
        java.lang.Class<?> wildcardClass8 = student5.getClass();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Student" + "'", str6, "Student");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0313");
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
        int int30 = userRepository1.getNextID();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "Password1!" + "'", str17, "Password1!");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNotNull(userList27);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
// flaky "57) test0313(com.reservation_system.randoop.registrationservice.RegressionTest0)":         org.junit.Assert.assertTrue("'" + int30 + "' != '" + 102 + "'", int30 == 102);
    }

    @Test
    public void test0314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0314");
        com.reservation_system.model.Researcher researcher5 = new com.reservation_system.model.Researcher((int) (byte) 10, "", "Guest", "headlabcoordinator", true);
        java.lang.String str6 = researcher5.getEmail();
        java.lang.String str7 = researcher5.getUserType();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Guest" + "'", str6, "Guest");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Researcher" + "'", str7, "Researcher");
    }

    @Test
    public void test0315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0315");
        com.reservation_system.model.Faculty faculty5 = new com.reservation_system.model.Faculty(0, "Password1!", "demo/data/test-users.csv", "researcher", false);
        boolean boolean6 = faculty5.isApproved();
        java.lang.String str7 = faculty5.getUserType();
        boolean boolean8 = faculty5.isApproved();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Faculty" + "'", str7, "Faculty");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test0316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0316");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("demo/data/test-users.csv");
        boolean boolean2 = userRepository1.headLabCoordinatorExists();
        com.reservation_system.services.RegistrationService registrationService3 = new com.reservation_system.services.RegistrationService(userRepository1);
        // The following exception was thrown during execution in test generation
        try {
            com.reservation_system.model.User user8 = registrationService3.registerUser("Password1!", "hi!", "andrew@example.com", "student");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid user type.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test0317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0317");
        com.reservation_system.model.User user6 = com.reservation_system.patterns.factory.UserFactory.createUser("researcher", 100, "", "Student", "", false);
        org.junit.Assert.assertNotNull(user6);
    }

    @Test
    public void test0318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0318");
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
            com.reservation_system.model.User user20 = registrationService15.registerUser("hi!", "hi!", "student", "faculty");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid user type.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Password1!" + "'", str9, "Password1!");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
// flaky "58) test0318(com.reservation_system.randoop.registrationservice.RegressionTest0)":         org.junit.Assert.assertTrue("'" + int13 + "' != '" + 102 + "'", int13 == 102);
    }

    @Test
    public void test0319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0319");
        com.reservation_system.model.Student student5 = new com.reservation_system.model.Student((int) (short) -1, "Guest", "Andrew", "headlabcoordinator", false);
    }

    @Test
    public void test0320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0320");
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
        com.reservation_system.services.RegistrationService registrationService37 = new com.reservation_system.services.RegistrationService(userRepository1);
        // The following exception was thrown during execution in test generation
        try {
            com.reservation_system.model.User user42 = registrationService37.registerUser("Student", "headlabcoordinator", "Password1!", "demo/data/test-users.csv");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid email format.");
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
// flaky "59) test0320(com.reservation_system.randoop.registrationservice.RegressionTest0)":         org.junit.Assert.assertTrue("'" + int29 + "' != '" + 102 + "'", int29 == 102);
        org.junit.Assert.assertNotNull(userList32);
        org.junit.Assert.assertNotNull(userList34);
    }

    @Test
    public void test0321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0321");
        com.reservation_system.model.User user6 = com.reservation_system.patterns.factory.UserFactory.createUser("faculty", (int) (byte) -1, "student", "", "Password1!", false);
        org.junit.Assert.assertNotNull(user6);
    }

    @Test
    public void test0322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0322");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("demo/data/test-users.csv");
        java.util.Optional<com.reservation_system.model.User> userOptional3 = userRepository1.findByEmail("hi!");
        int int4 = userRepository1.getNextID();
        int int5 = userRepository1.getNextID();
        com.reservation_system.model.Researcher researcher11 = new com.reservation_system.model.Researcher((int) 'a', "student", "", "researcher", true);
        userRepository1.addUser((com.reservation_system.model.User) researcher11);
        int int13 = userRepository1.getNextID();
        org.junit.Assert.assertNotNull(userOptional3);
// flaky "60) test0322(com.reservation_system.randoop.registrationservice.RegressionTest0)":         org.junit.Assert.assertTrue("'" + int4 + "' != '" + 102 + "'", int4 == 102);
// flaky "30) test0322(com.reservation_system.randoop.registrationservice.RegressionTest0)":         org.junit.Assert.assertTrue("'" + int5 + "' != '" + 102 + "'", int5 == 102);
// flaky "19) test0322(com.reservation_system.randoop.registrationservice.RegressionTest0)":         org.junit.Assert.assertTrue("'" + int13 + "' != '" + 102 + "'", int13 == 102);
    }

    @Test
    public void test0323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0323");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("demo/data/test-users.csv");
        com.reservation_system.services.RegistrationService registrationService2 = new com.reservation_system.services.RegistrationService(userRepository1);
        com.reservation_system.model.Faculty faculty8 = new com.reservation_system.model.Faculty(0, "Password1!", "demo/data/test-users.csv", "researcher", false);
        java.lang.String str9 = faculty8.getName();
        userRepository1.addUser((com.reservation_system.model.User) faculty8);
        boolean boolean11 = userRepository1.headLabCoordinatorExists();
        com.reservation_system.model.Guest guest17 = new com.reservation_system.model.Guest((int) (byte) -1, "guest", "Researcher", "Faculty", true);
        userRepository1.addUser((com.reservation_system.model.User) guest17);
        boolean boolean20 = userRepository1.emailExists("headlabcoordinator");
        int int21 = userRepository1.getNextID();
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Password1!" + "'", str9, "Password1!");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
// flaky "61) test0323(com.reservation_system.randoop.registrationservice.RegressionTest0)":         org.junit.Assert.assertTrue("'" + int21 + "' != '" + 102 + "'", int21 == 102);
    }

    @Test
    public void test0324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0324");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("demo/data/test-users.csv");
        java.util.Optional<com.reservation_system.model.User> userOptional3 = userRepository1.findByEmail("hi!");
        int int4 = userRepository1.getNextID();
        int int5 = userRepository1.getNextID();
        com.reservation_system.model.Researcher researcher11 = new com.reservation_system.model.Researcher((int) 'a', "student", "", "researcher", true);
        userRepository1.addUser((com.reservation_system.model.User) researcher11);
        com.reservation_system.model.Guest guest18 = new com.reservation_system.model.Guest((int) (byte) 10, "Andrew", "Student", "guest", true);
        boolean boolean19 = guest18.isApproved();
        userRepository1.addUser((com.reservation_system.model.User) guest18);
        boolean boolean21 = guest18.isApproved();
        org.junit.Assert.assertNotNull(userOptional3);
// flaky "62) test0324(com.reservation_system.randoop.registrationservice.RegressionTest0)":         org.junit.Assert.assertTrue("'" + int4 + "' != '" + 102 + "'", int4 == 102);
// flaky "31) test0324(com.reservation_system.randoop.registrationservice.RegressionTest0)":         org.junit.Assert.assertTrue("'" + int5 + "' != '" + 102 + "'", int5 == 102);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
    }

    @Test
    public void test0325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0325");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("demo/data/test-users.csv");
        com.reservation_system.services.RegistrationService registrationService2 = new com.reservation_system.services.RegistrationService(userRepository1);
        com.reservation_system.model.Faculty faculty8 = new com.reservation_system.model.Faculty(0, "Password1!", "demo/data/test-users.csv", "researcher", false);
        java.lang.String str9 = faculty8.getName();
        userRepository1.addUser((com.reservation_system.model.User) faculty8);
        boolean boolean12 = userRepository1.emailExists("Faculty");
        int int13 = userRepository1.getNextID();
        com.reservation_system.services.RegistrationService registrationService14 = new com.reservation_system.services.RegistrationService(userRepository1);
        java.util.Optional<com.reservation_system.model.User> userOptional16 = userRepository1.findByEmail("Andrew");
        boolean boolean17 = userRepository1.headLabCoordinatorExists();
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Password1!" + "'", str9, "Password1!");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
// flaky "63) test0325(com.reservation_system.randoop.registrationservice.RegressionTest0)":         org.junit.Assert.assertTrue("'" + int13 + "' != '" + 102 + "'", int13 == 102);
        org.junit.Assert.assertNotNull(userOptional16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
    }

    @Test
    public void test0326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0326");
        com.reservation_system.model.Guest guest5 = new com.reservation_system.model.Guest(52, "student", "demo/data/test-users.csv", "demo/data/test-users.csv", false);
    }

    @Test
    public void test0327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0327");
        com.reservation_system.model.Faculty faculty5 = new com.reservation_system.model.Faculty(52, "andrew@example.com", "guest", "Researcher", false);
    }

    @Test
    public void test0328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0328");
        com.reservation_system.model.LabManager labManager5 = new com.reservation_system.model.LabManager((int) 'a', "headlabcoordinator", "Researcher", "Andrew", false);
        java.lang.String str6 = labManager5.getEmail();
        java.lang.String str7 = labManager5.getUserType();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Researcher" + "'", str6, "Researcher");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "labmanager" + "'", str7, "labmanager");
    }

    @Test
    public void test0329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0329");
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
        // The following exception was thrown during execution in test generation
        try {
            com.reservation_system.model.User user95 = registrationService90.registerUser("Student", "Guest", "", "Student");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Email is required.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Password1!" + "'", str9, "Password1!");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
// flaky "64) test0329(com.reservation_system.randoop.registrationservice.RegressionTest0)":         org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
// flaky "32) test0329(com.reservation_system.randoop.registrationservice.RegressionTest0)":         org.junit.Assert.assertTrue("'" + int23 + "' != '" + 102 + "'", int23 == 102);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "Password1!" + "'", str33, "Password1!");
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + true + "'", boolean43 == true);
        org.junit.Assert.assertEquals("'" + str53 + "' != '" + "Password1!" + "'", str53, "Password1!");
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + true + "'", boolean55 == true);
        org.junit.Assert.assertEquals("'" + str65 + "' != '" + "Password1!" + "'", str65, "Password1!");
        org.junit.Assert.assertNotNull(userList67);
// flaky "20) test0329(com.reservation_system.randoop.registrationservice.RegressionTest0)":         org.junit.Assert.assertTrue("'" + boolean71 + "' != '" + true + "'", boolean71 == true);
        org.junit.Assert.assertEquals("'" + str81 + "' != '" + "Password1!" + "'", str81, "Password1!");
        org.junit.Assert.assertTrue("'" + boolean83 + "' != '" + true + "'", boolean83 == true);
        org.junit.Assert.assertNotNull(userList85);
        org.junit.Assert.assertTrue("'" + boolean89 + "' != '" + true + "'", boolean89 == true);
    }

    @Test
    public void test0330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0330");
        com.reservation_system.model.HeadLabCoordinator headLabCoordinator5 = new com.reservation_system.model.HeadLabCoordinator((int) '#', "headlabcoordinator", "Andrew", "demo/data/test-users.csv", true);
    }

    @Test
    public void test0331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0331");
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
        java.util.Optional<com.reservation_system.model.User> userOptional91 = userRepository1.findByEmail("Guest");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Password1!" + "'", str9, "Password1!");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
// flaky "65) test0331(com.reservation_system.randoop.registrationservice.RegressionTest0)":         org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
// flaky "33) test0331(com.reservation_system.randoop.registrationservice.RegressionTest0)":         org.junit.Assert.assertTrue("'" + int23 + "' != '" + 102 + "'", int23 == 102);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "Password1!" + "'", str33, "Password1!");
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + true + "'", boolean43 == true);
        org.junit.Assert.assertEquals("'" + str53 + "' != '" + "Password1!" + "'", str53, "Password1!");
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + true + "'", boolean55 == true);
        org.junit.Assert.assertEquals("'" + str65 + "' != '" + "Password1!" + "'", str65, "Password1!");
        org.junit.Assert.assertNotNull(userList67);
// flaky "21) test0331(com.reservation_system.randoop.registrationservice.RegressionTest0)":         org.junit.Assert.assertTrue("'" + boolean71 + "' != '" + true + "'", boolean71 == true);
        org.junit.Assert.assertEquals("'" + str81 + "' != '" + "Password1!" + "'", str81, "Password1!");
        org.junit.Assert.assertTrue("'" + boolean83 + "' != '" + true + "'", boolean83 == true);
        org.junit.Assert.assertNotNull(userList85);
// flaky "11) test0331(com.reservation_system.randoop.registrationservice.RegressionTest0)":         org.junit.Assert.assertTrue("'" + int89 + "' != '" + 102 + "'", int89 == 102);
        org.junit.Assert.assertNotNull(userOptional91);
    }

    @Test
    public void test0332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0332");
        com.reservation_system.model.Researcher researcher5 = new com.reservation_system.model.Researcher((int) (byte) 1, "Student", "andrew@example.com", "labmanager", false);
    }

    @Test
    public void test0333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0333");
        com.reservation_system.model.Student student5 = new com.reservation_system.model.Student((int) (short) 1, "labmanager", "", "", true);
        java.lang.String str6 = student5.getUserType();
        java.lang.String str7 = student5.getEmail();
        int int8 = student5.getID();
        java.lang.Class<?> wildcardClass9 = student5.getClass();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Student" + "'", str6, "Student");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0334");
        // The following exception was thrown during execution in test generation
        try {
            com.reservation_system.model.User user6 = com.reservation_system.patterns.factory.UserFactory.createUser("andrew@example.com", 1, "andrew@example.com", "", "headlabcoordinator", false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid user type: andrew@example.com");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0335");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("demo/data/test-users.csv");
        com.reservation_system.services.RegistrationService registrationService2 = new com.reservation_system.services.RegistrationService(userRepository1);
        com.reservation_system.model.Faculty faculty8 = new com.reservation_system.model.Faculty(0, "Password1!", "demo/data/test-users.csv", "researcher", false);
        java.lang.String str9 = faculty8.getName();
        userRepository1.addUser((com.reservation_system.model.User) faculty8);
        boolean boolean11 = userRepository1.headLabCoordinatorExists();
        com.reservation_system.services.RegistrationService registrationService12 = new com.reservation_system.services.RegistrationService(userRepository1);
        // The following exception was thrown during execution in test generation
        try {
            com.reservation_system.model.User user17 = registrationService12.registerUser("student", "", "Faculty", "Faculty");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Name is required.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Password1!" + "'", str9, "Password1!");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test0336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0336");
        com.reservation_system.model.Student student5 = new com.reservation_system.model.Student((int) (short) 1, "Guest", "researcher", "Andrew", true);
    }

    @Test
    public void test0337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0337");
        com.reservation_system.model.Faculty faculty5 = new com.reservation_system.model.Faculty(0, "Password1!", "demo/data/test-users.csv", "researcher", false);
        java.lang.String str6 = faculty5.getName();
        faculty5.setApproved(true);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Password1!" + "'", str6, "Password1!");
    }

    @Test
    public void test0338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0338");
        com.reservation_system.model.Guest guest5 = new com.reservation_system.model.Guest((int) (byte) 0, "Researcher", "Researcher", "researcher", false);
    }

    @Test
    public void test0339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0339");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("demo/data/test-users.csv");
        java.util.Optional<com.reservation_system.model.User> userOptional3 = userRepository1.findByEmail("hi!");
        int int4 = userRepository1.getNextID();
        int int5 = userRepository1.getNextID();
        com.reservation_system.model.Researcher researcher11 = new com.reservation_system.model.Researcher((int) 'a', "student", "", "researcher", true);
        userRepository1.addUser((com.reservation_system.model.User) researcher11);
        java.util.List<com.reservation_system.model.User> userList13 = null;
        // The following exception was thrown during execution in test generation
        try {
            userRepository1.saveAllUsers(userList13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(userOptional3);
// flaky "66) test0339(com.reservation_system.randoop.registrationservice.RegressionTest0)":         org.junit.Assert.assertTrue("'" + int4 + "' != '" + 102 + "'", int4 == 102);
// flaky "34) test0339(com.reservation_system.randoop.registrationservice.RegressionTest0)":         org.junit.Assert.assertTrue("'" + int5 + "' != '" + 102 + "'", int5 == 102);
    }

    @Test
    public void test0340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0340");
        com.reservation_system.model.LabManager labManager5 = new com.reservation_system.model.LabManager(0, "headlabcoordinator", "researcher", "Researcher", false);
    }

    @Test
    public void test0341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0341");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("demo/data/test-users.csv");
        int int2 = userRepository1.getNextID();
        int int3 = userRepository1.getNextID();
        boolean boolean5 = userRepository1.emailExists("faculty");
        com.reservation_system.model.LabManager labManager11 = new com.reservation_system.model.LabManager((int) (short) 0, "", "labmanager", "Password1!", true);
        userRepository1.addUser((com.reservation_system.model.User) labManager11);
        java.lang.String str13 = labManager11.getUserType();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "labmanager" + "'", str13, "labmanager");
    }

    @Test
    public void test0342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0342");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("demo/data/test-users.csv");
        com.reservation_system.services.RegistrationService registrationService2 = new com.reservation_system.services.RegistrationService(userRepository1);
        com.reservation_system.services.RegistrationService registrationService3 = new com.reservation_system.services.RegistrationService(userRepository1);
        java.util.List<com.reservation_system.model.User> userList4 = userRepository1.getAllUsers();
        java.util.Optional<com.reservation_system.model.User> userOptional6 = userRepository1.findByEmail("");
        org.junit.Assert.assertNotNull(userList4);
        org.junit.Assert.assertNotNull(userOptional6);
    }

    @Test
    public void test0343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0343");
        com.reservation_system.model.Researcher researcher5 = new com.reservation_system.model.Researcher(100, "labmanager", "Password1!", "Andrew", true);
    }

    @Test
    public void test0344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0344");
        com.reservation_system.model.Student student5 = new com.reservation_system.model.Student((int) ' ', "", "labmanager", "headlabcoordinator", true);
        java.lang.String str6 = student5.getUserType();
        java.lang.String str7 = student5.getUserType();
        int int8 = student5.getID();
        int int9 = student5.getID();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Student" + "'", str6, "Student");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Student" + "'", str7, "Student");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 32 + "'", int8 == 32);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 32 + "'", int9 == 32);
    }

    @Test
    public void test0345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0345");
        com.reservation_system.model.LabManager labManager5 = new com.reservation_system.model.LabManager(0, "guest", "student", "faculty", false);
        java.lang.String str6 = labManager5.getUserType();
        java.lang.String str7 = labManager5.getUserType();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "labmanager" + "'", str6, "labmanager");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "labmanager" + "'", str7, "labmanager");
    }

    @Test
    public void test0346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0346");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("demo/data/test-users.csv");
        boolean boolean2 = userRepository1.headLabCoordinatorExists();
        com.reservation_system.services.RegistrationService registrationService3 = new com.reservation_system.services.RegistrationService(userRepository1);
        boolean boolean5 = userRepository1.emailExists("");
        java.util.Optional<com.reservation_system.model.User> userOptional7 = userRepository1.findByEmail("");
        java.util.Optional<com.reservation_system.model.User> userOptional9 = userRepository1.findByEmail("hi!");
        com.reservation_system.services.RegistrationService registrationService10 = new com.reservation_system.services.RegistrationService(userRepository1);
        java.util.Optional<com.reservation_system.model.User> userOptional12 = userRepository1.findByEmail("demo/data/test-users.csv");
        java.lang.Class<?> wildcardClass13 = userOptional12.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(userOptional7);
        org.junit.Assert.assertNotNull(userOptional9);
        org.junit.Assert.assertNotNull(userOptional12);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0347");
        com.reservation_system.model.LabManager labManager5 = new com.reservation_system.model.LabManager((int) (short) 100, "Guest", "hi!", "Andrew", false);
    }

    @Test
    public void test0348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0348");
        com.reservation_system.model.Researcher researcher5 = new com.reservation_system.model.Researcher((int) (short) -1, "Faculty", "student", "labmanager", false);
    }

    @Test
    public void test0349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0349");
        com.reservation_system.model.Student student5 = new com.reservation_system.model.Student(32, "Faculty", "andrew@example.com", "Researcher", false);
        java.lang.String str6 = student5.getEmail();
    }

    @Test
    public void test0350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0350");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("demo/data/test-users.csv");
        boolean boolean2 = userRepository1.headLabCoordinatorExists();
        com.reservation_system.services.RegistrationService registrationService3 = new com.reservation_system.services.RegistrationService(userRepository1);
        boolean boolean5 = userRepository1.emailExists("");
        java.util.Optional<com.reservation_system.model.User> userOptional7 = userRepository1.findByEmail("");
        java.util.Optional<com.reservation_system.model.User> userOptional9 = userRepository1.findByEmail("hi!");
        com.reservation_system.services.RegistrationService registrationService10 = new com.reservation_system.services.RegistrationService(userRepository1);
        // The following exception was thrown during execution in test generation
        try {
            com.reservation_system.model.User user15 = registrationService10.registerUser("researcher", "headlabcoordinator", "labmanager", "Student");
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
    public void test0351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0351");
        // The following exception was thrown during execution in test generation
        try {
            com.reservation_system.model.User user6 = com.reservation_system.patterns.factory.UserFactory.createUser("andrew@example.com", (int) (byte) 10, "faculty", "Faculty", "Andrew", false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid user type: andrew@example.com");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0352");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("demo/data/test-users.csv");
        com.reservation_system.services.RegistrationService registrationService2 = new com.reservation_system.services.RegistrationService(userRepository1);
        com.reservation_system.model.Faculty faculty8 = new com.reservation_system.model.Faculty(0, "Password1!", "demo/data/test-users.csv", "researcher", false);
        java.lang.String str9 = faculty8.getName();
        userRepository1.addUser((com.reservation_system.model.User) faculty8);
        boolean boolean11 = userRepository1.headLabCoordinatorExists();
        com.reservation_system.model.Guest guest17 = new com.reservation_system.model.Guest((int) (byte) -1, "guest", "Researcher", "Faculty", true);
        userRepository1.addUser((com.reservation_system.model.User) guest17);
        boolean boolean20 = userRepository1.emailExists("headlabcoordinator");
        java.util.List<com.reservation_system.model.User> userList21 = userRepository1.getAllUsers();
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Password1!" + "'", str9, "Password1!");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(userList21);
    }

    @Test
    public void test0353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0353");
        com.reservation_system.model.Student student5 = new com.reservation_system.model.Student((int) '4', "demo/data/test-users.csv", "Password1!", "hi!", false);
    }

    @Test
    public void test0354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0354");
        // The following exception was thrown during execution in test generation
        try {
            com.reservation_system.model.User user6 = com.reservation_system.patterns.factory.UserFactory.createUser("", (-1), "demo/data/test-users.csv", "faculty", "Faculty", true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid user type: ");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0355");
        com.reservation_system.model.Faculty faculty5 = new com.reservation_system.model.Faculty(100, "labmanager", "Password1!", "labmanager", false);
    }

    @Test
    public void test0356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0356");
        com.reservation_system.model.Faculty faculty5 = new com.reservation_system.model.Faculty(0, "Faculty", "Faculty", "guest", true);
        java.lang.String str6 = faculty5.getEmail();
        java.lang.Class<?> wildcardClass7 = faculty5.getClass();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Faculty" + "'", str6, "Faculty");
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0357");
        com.reservation_system.model.HeadLabCoordinator headLabCoordinator5 = new com.reservation_system.model.HeadLabCoordinator((int) (short) 0, "Researcher", "researcher", "Password1!", true);
        boolean boolean6 = headLabCoordinator5.requiresDepartmentApproval();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test0358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0358");
        com.reservation_system.model.Faculty faculty5 = new com.reservation_system.model.Faculty((int) (byte) 1, "Faculty", "", "faculty", true);
    }

    @Test
    public void test0359() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0359");
        com.reservation_system.model.Faculty faculty5 = new com.reservation_system.model.Faculty(100, "guest", "student", "headlabcoordinator", true);
        boolean boolean6 = faculty5.isApproved();
        java.lang.String str7 = faculty5.getUserType();
        faculty5.setApproved(false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Faculty" + "'", str7, "Faculty");
    }

    @Test
    public void test0360() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0360");
        com.reservation_system.model.Student student5 = new com.reservation_system.model.Student((int) (short) 0, "researcher", "headlabcoordinator", "researcher", false);
        boolean boolean6 = student5.isApproved();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test0361() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0361");
        com.reservation_system.model.Researcher researcher5 = new com.reservation_system.model.Researcher((int) (short) 100, "andrew@example.com", "researcher", "Faculty", true);
    }

    @Test
    public void test0362() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0362");
        com.reservation_system.model.Faculty faculty5 = new com.reservation_system.model.Faculty((int) (short) 0, "guest", "Andrew", "guest", true);
        java.lang.String str6 = faculty5.getName();
        int int7 = faculty5.getID();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "guest" + "'", str6, "guest");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test0363() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0363");
        com.reservation_system.model.HeadLabCoordinator headLabCoordinator5 = new com.reservation_system.model.HeadLabCoordinator(1, "student", "Researcher", "", false);
        java.lang.String str6 = headLabCoordinator5.getUserType();
        java.lang.String str7 = headLabCoordinator5.getUserType();
        java.lang.String str8 = headLabCoordinator5.getUserType();
        java.lang.String str9 = headLabCoordinator5.getUserType();
        boolean boolean10 = headLabCoordinator5.isApproved();
        java.lang.String str11 = headLabCoordinator5.getUserType();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "headlabcoordinator" + "'", str6, "headlabcoordinator");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "headlabcoordinator" + "'", str7, "headlabcoordinator");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "headlabcoordinator" + "'", str8, "headlabcoordinator");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "headlabcoordinator" + "'", str9, "headlabcoordinator");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "headlabcoordinator" + "'", str11, "headlabcoordinator");
    }

    @Test
    public void test0364() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0364");
        com.reservation_system.model.Researcher researcher5 = new com.reservation_system.model.Researcher((int) (short) 1, "Password1!", "headlabcoordinator", "", false);
        researcher5.setApproved(true);
        researcher5.setApproved(false);
        boolean boolean10 = researcher5.requiresDepartmentApproval();
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test0365() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0365");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("demo/data/test-users.csv");
        com.reservation_system.services.RegistrationService registrationService2 = new com.reservation_system.services.RegistrationService(userRepository1);
        com.reservation_system.model.Faculty faculty8 = new com.reservation_system.model.Faculty(0, "Password1!", "demo/data/test-users.csv", "researcher", false);
        java.lang.String str9 = faculty8.getName();
        userRepository1.addUser((com.reservation_system.model.User) faculty8);
        java.lang.String str11 = faculty8.getPassword();
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Password1!" + "'", str9, "Password1!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "researcher" + "'", str11, "researcher");
    }

    @Test
    public void test0366() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0366");
        com.reservation_system.model.Guest guest5 = new com.reservation_system.model.Guest((int) '4', "researcher", "demo/data/test-users.csv", "andrew@example.com", false);
        java.lang.String str6 = guest5.getUserType();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Guest" + "'", str6, "Guest");
    }

    @Test
    public void test0367() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0367");
        com.reservation_system.model.Researcher researcher5 = new com.reservation_system.model.Researcher((int) 'a', "demo/data/test-users.csv", "", "", false);
        boolean boolean6 = researcher5.isApproved();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test0368() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0368");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("demo/data/test-users.csv");
        int int2 = userRepository1.getNextID();
        int int3 = userRepository1.getNextID();
        boolean boolean5 = userRepository1.emailExists("faculty");
        com.reservation_system.model.Faculty faculty11 = new com.reservation_system.model.Faculty(10, "researcher", "faculty", "", false);
        java.lang.String str12 = faculty11.getEmail();
        java.lang.String str13 = faculty11.getUserType();
        int int14 = faculty11.getID();
        userRepository1.addUser((com.reservation_system.model.User) faculty11);
        boolean boolean17 = userRepository1.emailExists("Faculty");
// flaky "67) test0368(com.reservation_system.randoop.registrationservice.RegressionTest0)":         org.junit.Assert.assertTrue("'" + int2 + "' != '" + 101 + "'", int2 == 101);
// flaky "35) test0368(com.reservation_system.randoop.registrationservice.RegressionTest0)":         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 101 + "'", int3 == 101);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "faculty" + "'", str12, "faculty");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Faculty" + "'", str13, "Faculty");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 10 + "'", int14 == 10);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
    }

    @Test
    public void test0369() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0369");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("demo/data/test-users.csv");
        java.util.Optional<com.reservation_system.model.User> userOptional3 = userRepository1.findByEmail("hi!");
        int int4 = userRepository1.getNextID();
        com.reservation_system.services.RegistrationService registrationService5 = new com.reservation_system.services.RegistrationService(userRepository1);
        java.util.List<com.reservation_system.model.User> userList6 = userRepository1.getAllUsers();
        org.junit.Assert.assertNotNull(userOptional3);
// flaky "68) test0369(com.reservation_system.randoop.registrationservice.RegressionTest0)":         org.junit.Assert.assertTrue("'" + int4 + "' != '" + 101 + "'", int4 == 101);
        org.junit.Assert.assertNotNull(userList6);
    }

    @Test
    public void test0370() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0370");
        com.reservation_system.model.Faculty faculty5 = new com.reservation_system.model.Faculty(1, "andrew@example.com", "andrew@example.com", "guest", false);
        java.lang.String str6 = faculty5.getName();
        java.lang.String str7 = faculty5.getUserType();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Faculty" + "'", str7, "Faculty");
    }

    @Test
    public void test0371() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0371");
        com.reservation_system.model.LabManager labManager5 = new com.reservation_system.model.LabManager((int) (short) 0, "", "labmanager", "Password1!", true);
        boolean boolean6 = labManager5.requiresDepartmentApproval();
        java.lang.String str7 = labManager5.getUserType();
        java.lang.String str8 = labManager5.getUserType();
        java.lang.Class<?> wildcardClass9 = labManager5.getClass();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "labmanager" + "'", str7, "labmanager");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "labmanager" + "'", str8, "labmanager");
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0372() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0372");
        com.reservation_system.model.Faculty faculty5 = new com.reservation_system.model.Faculty(0, "Password1!", "demo/data/test-users.csv", "researcher", false);
        java.lang.String str6 = faculty5.getName();
        java.lang.String str7 = faculty5.getName();
        java.lang.String str8 = faculty5.getName();
        java.lang.String str9 = faculty5.getEmail();
        java.lang.String str10 = faculty5.getUserType();
        int int11 = faculty5.getID();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Password1!" + "'", str6, "Password1!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Password1!" + "'", str7, "Password1!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Password1!" + "'", str8, "Password1!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "demo/data/test-users.csv" + "'", str9, "demo/data/test-users.csv");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Faculty" + "'", str10, "Faculty");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test0373() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0373");
        com.reservation_system.model.Student student5 = new com.reservation_system.model.Student((int) '#', "labmanager", "demo/data/test-users.csv", "labmanager", false);
        java.lang.String str6 = student5.getUserType();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Student" + "'", str6, "Student");
    }

    @Test
    public void test0374() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0374");
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
        com.reservation_system.repository.UserRepository userRepository24 = new com.reservation_system.repository.UserRepository("demo/data/test-users.csv");
        int int25 = userRepository24.getNextID();
        int int26 = userRepository24.getNextID();
        boolean boolean28 = userRepository24.emailExists("faculty");
        com.reservation_system.model.Faculty faculty34 = new com.reservation_system.model.Faculty(10, "researcher", "faculty", "", false);
        java.lang.String str35 = faculty34.getEmail();
        java.lang.String str36 = faculty34.getUserType();
        int int37 = faculty34.getID();
        userRepository24.addUser((com.reservation_system.model.User) faculty34);
        java.util.List<com.reservation_system.model.User> userList39 = userRepository24.getAllUsers();
        userRepository1.saveAllUsers(userList39);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Password1!" + "'", str9, "Password1!");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
// flaky "69) test0374(com.reservation_system.randoop.registrationservice.RegressionTest0)":         org.junit.Assert.assertTrue("'" + int12 + "' != '" + 101 + "'", int12 == 101);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
// flaky "36) test0374(com.reservation_system.randoop.registrationservice.RegressionTest0)":         org.junit.Assert.assertTrue("'" + int21 + "' != '" + 101 + "'", int21 == 101);
        org.junit.Assert.assertNotNull(userList22);
// flaky "22) test0374(com.reservation_system.randoop.registrationservice.RegressionTest0)":         org.junit.Assert.assertTrue("'" + int25 + "' != '" + 101 + "'", int25 == 101);
// flaky "12) test0374(com.reservation_system.randoop.registrationservice.RegressionTest0)":         org.junit.Assert.assertTrue("'" + int26 + "' != '" + 101 + "'", int26 == 101);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "faculty" + "'", str35, "faculty");
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "Faculty" + "'", str36, "Faculty");
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 10 + "'", int37 == 10);
        org.junit.Assert.assertNotNull(userList39);
    }

    @Test
    public void test0375() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0375");
        com.reservation_system.model.HeadLabCoordinator headLabCoordinator5 = new com.reservation_system.model.HeadLabCoordinator(1, "headlabcoordinator", "labmanager", "Researcher", true);
        java.lang.String str6 = headLabCoordinator5.getUserType();
        java.lang.String str7 = headLabCoordinator5.getUserType();
        java.lang.String str8 = headLabCoordinator5.getUserType();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "headlabcoordinator" + "'", str6, "headlabcoordinator");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "headlabcoordinator" + "'", str7, "headlabcoordinator");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "headlabcoordinator" + "'", str8, "headlabcoordinator");
    }

    @Test
    public void test0376() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0376");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("demo/data/test-users.csv");
        com.reservation_system.services.RegistrationService registrationService2 = new com.reservation_system.services.RegistrationService(userRepository1);
        java.util.Optional<com.reservation_system.model.User> userOptional4 = userRepository1.findByEmail("student");
        org.junit.Assert.assertNotNull(userOptional4);
    }

    @Test
    public void test0377() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0377");
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
        java.util.Optional<com.reservation_system.model.User> userOptional24 = userRepository1.findByEmail("hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Password1!" + "'", str9, "Password1!");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(userList19);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(userOptional24);
    }

    @Test
    public void test0378() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0378");
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
        com.reservation_system.services.RegistrationService registrationService28 = new com.reservation_system.services.RegistrationService(userRepository27);
        com.reservation_system.model.Faculty faculty34 = new com.reservation_system.model.Faculty(0, "Password1!", "demo/data/test-users.csv", "researcher", false);
        java.lang.String str35 = faculty34.getName();
        userRepository27.addUser((com.reservation_system.model.User) faculty34);
        boolean boolean37 = userRepository27.headLabCoordinatorExists();
        com.reservation_system.model.Guest guest43 = new com.reservation_system.model.Guest((int) (byte) -1, "guest", "Researcher", "Faculty", true);
        userRepository27.addUser((com.reservation_system.model.User) guest43);
        java.util.List<com.reservation_system.model.User> userList45 = userRepository27.getAllUsers();
        userRepository1.saveAllUsers(userList45);
        boolean boolean48 = userRepository1.emailExists("");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Password1!" + "'", str14, "Password1!");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(userList24);
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "Password1!" + "'", str35, "Password1!");
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertNotNull(userList45);
// flaky "70) test0378(com.reservation_system.randoop.registrationservice.RegressionTest0)":         org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + true + "'", boolean48 == true);
    }

    @Test
    public void test0379() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0379");
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
        java.lang.String str33 = headLabCoordinator30.getUserType();
        java.lang.String str34 = headLabCoordinator30.getUserType();
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Password1!" + "'", str9, "Password1!");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
// flaky "71) test0379(com.reservation_system.randoop.registrationservice.RegressionTest0)":         org.junit.Assert.assertTrue("'" + int23 + "' != '" + 101 + "'", int23 == 101);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "headlabcoordinator" + "'", str33, "headlabcoordinator");
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "headlabcoordinator" + "'", str34, "headlabcoordinator");
    }

    @Test
    public void test0380() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0380");
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
        com.reservation_system.services.RegistrationService registrationService76 = new com.reservation_system.services.RegistrationService(userRepository1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(userOptional9);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "Password1!" + "'", str20, "Password1!");
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "Password1!" + "'", str41, "Password1!");
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + true + "'", boolean43 == true);
        org.junit.Assert.assertNotNull(userList45);
        org.junit.Assert.assertEquals("'" + str55 + "' != '" + "Password1!" + "'", str55, "Password1!");
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + true + "'", boolean57 == true);
        org.junit.Assert.assertNotNull(userList59);
        org.junit.Assert.assertNotNull(userList62);
        org.junit.Assert.assertEquals("'" + str70 + "' != '" + "Researcher" + "'", str70, "Researcher");
        org.junit.Assert.assertTrue("'" + boolean74 + "' != '" + true + "'", boolean74 == true);
    }

    @Test
    public void test0381() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0381");
        com.reservation_system.model.Student student5 = new com.reservation_system.model.Student((int) (short) 0, "researcher", "headlabcoordinator", "researcher", false);
        java.lang.String str6 = student5.getUserType();
        java.lang.String str7 = student5.getUserType();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Student" + "'", str6, "Student");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Student" + "'", str7, "Student");
    }

    @Test
    public void test0382() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0382");
        com.reservation_system.model.Faculty faculty5 = new com.reservation_system.model.Faculty((int) (byte) 100, "labmanager", "Andrew", "headlabcoordinator", true);
    }

    @Test
    public void test0383() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0383");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("demo/data/test-users.csv");
        int int2 = userRepository1.getNextID();
        int int3 = userRepository1.getNextID();
        boolean boolean5 = userRepository1.emailExists("faculty");
        com.reservation_system.model.LabManager labManager11 = new com.reservation_system.model.LabManager((int) (short) 0, "", "labmanager", "Password1!", true);
        userRepository1.addUser((com.reservation_system.model.User) labManager11);
        java.util.Optional<com.reservation_system.model.User> userOptional14 = userRepository1.findByEmail("");
        com.reservation_system.model.Researcher researcher20 = new com.reservation_system.model.Researcher((int) (byte) 100, "Password1!", "Password1!", "headlabcoordinator", true);
        userRepository1.addUser((com.reservation_system.model.User) researcher20);
        java.lang.String str22 = researcher20.getUserType();
// flaky "72) test0383(com.reservation_system.randoop.registrationservice.RegressionTest0)":         org.junit.Assert.assertTrue("'" + int2 + "' != '" + 101 + "'", int2 == 101);
// flaky "37) test0383(com.reservation_system.randoop.registrationservice.RegressionTest0)":         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 101 + "'", int3 == 101);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(userOptional14);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "Researcher" + "'", str22, "Researcher");
    }

    @Test
    public void test0384() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0384");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("demo/data/test-users.csv");
        boolean boolean2 = userRepository1.headLabCoordinatorExists();
        com.reservation_system.services.RegistrationService registrationService3 = new com.reservation_system.services.RegistrationService(userRepository1);
        boolean boolean5 = userRepository1.emailExists("");
        boolean boolean6 = userRepository1.headLabCoordinatorExists();
        com.reservation_system.services.RegistrationService registrationService7 = new com.reservation_system.services.RegistrationService(userRepository1);
        // The following exception was thrown during execution in test generation
        try {
            com.reservation_system.model.User user12 = registrationService7.registerUser("Faculty", "", "researcher", "demo/data/test-users.csv");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Name is required.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
// flaky "73) test0384(com.reservation_system.randoop.registrationservice.RegressionTest0)":         org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test0385() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0385");
        com.reservation_system.model.Faculty faculty5 = new com.reservation_system.model.Faculty((int) (byte) 1, "researcher", "Andrew", "", false);
        java.lang.String str6 = faculty5.getUserType();
        java.lang.String str7 = faculty5.getPassword();
        int int8 = faculty5.getID();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Faculty" + "'", str6, "Faculty");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
    }

    @Test
    public void test0386() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0386");
        com.reservation_system.model.User user6 = com.reservation_system.patterns.factory.UserFactory.createUser("Guest", 100, "", "Student", "student", false);
        org.junit.Assert.assertNotNull(user6);
    }

    @Test
    public void test0387() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0387");
        com.reservation_system.model.LabManager labManager5 = new com.reservation_system.model.LabManager((int) ' ', "", "Andrew", "researcher", true);
        java.lang.String str6 = labManager5.getUserType();
        boolean boolean7 = labManager5.isApproved();
        java.lang.String str8 = labManager5.getUserType();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "labmanager" + "'", str6, "labmanager");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "labmanager" + "'", str8, "labmanager");
    }

    @Test
    public void test0388() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0388");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("demo/data/test-users.csv");
        int int2 = userRepository1.getNextID();
        int int3 = userRepository1.getNextID();
        boolean boolean5 = userRepository1.emailExists("faculty");
        com.reservation_system.model.LabManager labManager11 = new com.reservation_system.model.LabManager((int) (short) 0, "", "labmanager", "Password1!", true);
        userRepository1.addUser((com.reservation_system.model.User) labManager11);
        java.util.Optional<com.reservation_system.model.User> userOptional14 = userRepository1.findByEmail("");
        java.util.Optional<com.reservation_system.model.User> userOptional16 = userRepository1.findByEmail("Andrew");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 101 + "'", int2 == 101);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 101 + "'", int3 == 101);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(userOptional14);
        org.junit.Assert.assertNotNull(userOptional16);
    }

    @Test
    public void test0389() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0389");
        com.reservation_system.model.Researcher researcher5 = new com.reservation_system.model.Researcher((int) '#', "Student", "andrew@example.com", "Researcher", false);
    }

    @Test
    public void test0390() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0390");
        com.reservation_system.model.Faculty faculty5 = new com.reservation_system.model.Faculty((int) (byte) 0, "Andrew", "student", "andrew@example.com", false);
    }

    @Test
    public void test0391() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0391");
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
        com.reservation_system.repository.UserRepository userRepository35 = new com.reservation_system.repository.UserRepository("demo/data/test-users.csv");
        com.reservation_system.services.RegistrationService registrationService36 = new com.reservation_system.services.RegistrationService(userRepository35);
        com.reservation_system.model.Faculty faculty42 = new com.reservation_system.model.Faculty(0, "Password1!", "demo/data/test-users.csv", "researcher", false);
        java.lang.String str43 = faculty42.getName();
        userRepository35.addUser((com.reservation_system.model.User) faculty42);
        boolean boolean45 = userRepository35.headLabCoordinatorExists();
        com.reservation_system.repository.UserRepository userRepository47 = new com.reservation_system.repository.UserRepository("demo/data/test-users.csv");
        com.reservation_system.services.RegistrationService registrationService48 = new com.reservation_system.services.RegistrationService(userRepository47);
        com.reservation_system.model.Faculty faculty54 = new com.reservation_system.model.Faculty(0, "Password1!", "demo/data/test-users.csv", "researcher", false);
        java.lang.String str55 = faculty54.getName();
        userRepository47.addUser((com.reservation_system.model.User) faculty54);
        java.util.List<com.reservation_system.model.User> userList57 = userRepository47.getAllUsers();
        userRepository35.saveAllUsers(userList57);
        java.util.List<com.reservation_system.model.User> userList59 = userRepository35.getAllUsers();
        userRepository1.saveAllUsers(userList59);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Password1!" + "'", str15, "Password1!");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 101 + "'", int18 == 101);
        org.junit.Assert.assertNotNull(userList21);
        org.junit.Assert.assertNotNull(userList23);
        org.junit.Assert.assertNotNull(userList26);
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "Password1!" + "'", str43, "Password1!");
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + true + "'", boolean45 == true);
        org.junit.Assert.assertEquals("'" + str55 + "' != '" + "Password1!" + "'", str55, "Password1!");
        org.junit.Assert.assertNotNull(userList57);
        org.junit.Assert.assertNotNull(userList59);
    }

    @Test
    public void test0392() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0392");
        com.reservation_system.model.Faculty faculty5 = new com.reservation_system.model.Faculty(10, "researcher", "faculty", "", false);
        java.lang.String str6 = faculty5.getEmail();
        java.lang.String str7 = faculty5.getUserType();
        faculty5.setApproved(false);
        int int10 = faculty5.getID();
        java.lang.String str11 = faculty5.getUserType();
        boolean boolean12 = faculty5.isApproved();
        boolean boolean13 = faculty5.isApproved();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "faculty" + "'", str6, "faculty");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Faculty" + "'", str7, "Faculty");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 10 + "'", int10 == 10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Faculty" + "'", str11, "Faculty");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test0393() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0393");
        com.reservation_system.model.HeadLabCoordinator headLabCoordinator5 = new com.reservation_system.model.HeadLabCoordinator((int) (short) 100, "labmanager", "demo/data/test-users.csv", "hi!", true);
    }

    @Test
    public void test0394() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0394");
        com.reservation_system.model.Researcher researcher5 = new com.reservation_system.model.Researcher((int) (short) -1, "andrew@example.com", "guest", "labmanager", false);
        java.lang.String str6 = researcher5.getPassword();
        boolean boolean7 = researcher5.requiresDepartmentApproval();
        java.lang.String str8 = researcher5.getUserType();
        boolean boolean9 = researcher5.requiresDepartmentApproval();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "labmanager" + "'", str6, "labmanager");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Researcher" + "'", str8, "Researcher");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test0395() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0395");
        com.reservation_system.model.User user6 = com.reservation_system.patterns.factory.UserFactory.createUser("Student", (int) '4', "andrew@example.com", "Researcher", "Guest", true);
        org.junit.Assert.assertNotNull(user6);
    }

    @Test
    public void test0396() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0396");
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
        int int23 = userRepository1.getNextID();
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Password1!" + "'", str9, "Password1!");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 101 + "'", int23 == 101);
    }

    @Test
    public void test0397() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0397");
        com.reservation_system.model.LabManager labManager5 = new com.reservation_system.model.LabManager((int) (short) 1, "Student", "", "demo/data/test-users.csv", false);
    }

    @Test
    public void test0398() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0398");
        com.reservation_system.model.Faculty faculty5 = new com.reservation_system.model.Faculty(0, "Password1!", "demo/data/test-users.csv", "researcher", false);
        java.lang.String str6 = faculty5.getName();
        java.lang.String str7 = faculty5.getUserType();
        int int8 = faculty5.getID();
        int int9 = faculty5.getID();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Password1!" + "'", str6, "Password1!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Faculty" + "'", str7, "Faculty");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test0399() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0399");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("demo/data/test-users.csv");
        java.util.List<com.reservation_system.model.User> userList2 = userRepository1.getAllUsers();
        com.reservation_system.services.RegistrationService registrationService3 = new com.reservation_system.services.RegistrationService(userRepository1);
        java.util.List<com.reservation_system.model.User> userList4 = userRepository1.getAllUsers();
        java.util.Optional<com.reservation_system.model.User> userOptional6 = userRepository1.findByEmail("");
        java.util.List<com.reservation_system.model.User> userList7 = userRepository1.getAllUsers();
        org.junit.Assert.assertNotNull(userList2);
        org.junit.Assert.assertNotNull(userList4);
        org.junit.Assert.assertNotNull(userOptional6);
        org.junit.Assert.assertNotNull(userList7);
    }

    @Test
    public void test0400() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0400");
        com.reservation_system.model.Faculty faculty5 = new com.reservation_system.model.Faculty(10, "researcher", "Guest", "andrew@example.com", true);
        java.lang.String str6 = faculty5.getUserType();
        java.lang.String str7 = faculty5.getUserType();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Faculty" + "'", str6, "Faculty");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Faculty" + "'", str7, "Faculty");
    }

    @Test
    public void test0401() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0401");
        com.reservation_system.model.HeadLabCoordinator headLabCoordinator5 = new com.reservation_system.model.HeadLabCoordinator(32, "student", "headlabcoordinator", "Andrew", false);
        java.lang.String str6 = headLabCoordinator5.getPassword();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Andrew" + "'", str6, "Andrew");
    }

    @Test
    public void test0402() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0402");
        com.reservation_system.model.Guest guest5 = new com.reservation_system.model.Guest((int) (byte) 100, "faculty", "Andrew", "", true);
        java.lang.String str6 = guest5.getUserType();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Guest" + "'", str6, "Guest");
    }

    @Test
    public void test0403() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0403");
        com.reservation_system.model.Student student5 = new com.reservation_system.model.Student((int) (byte) -1, "Guest", "Andrew", "", false);
    }

    @Test
    public void test0404() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0404");
        com.reservation_system.model.Student student5 = new com.reservation_system.model.Student((int) (short) 10, "Faculty", "Faculty", "demo/data/test-users.csv", false);
    }

    @Test
    public void test0405() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0405");
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
        com.reservation_system.model.HeadLabCoordinator headLabCoordinator95 = new com.reservation_system.model.HeadLabCoordinator((int) (short) 10, "researcher", "student", "Faculty", false);
        userRepository1.addUser((com.reservation_system.model.User) headLabCoordinator95);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Password1!" + "'", str9, "Password1!");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
// flaky "74) test0405(com.reservation_system.randoop.registrationservice.RegressionTest0)":         org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 101 + "'", int23 == 101);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "Password1!" + "'", str33, "Password1!");
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + true + "'", boolean43 == true);
        org.junit.Assert.assertEquals("'" + str53 + "' != '" + "Password1!" + "'", str53, "Password1!");
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + true + "'", boolean55 == true);
        org.junit.Assert.assertEquals("'" + str65 + "' != '" + "Password1!" + "'", str65, "Password1!");
        org.junit.Assert.assertNotNull(userList67);
// flaky "38) test0405(com.reservation_system.randoop.registrationservice.RegressionTest0)":         org.junit.Assert.assertTrue("'" + boolean71 + "' != '" + true + "'", boolean71 == true);
        org.junit.Assert.assertEquals("'" + str81 + "' != '" + "Password1!" + "'", str81, "Password1!");
        org.junit.Assert.assertTrue("'" + boolean83 + "' != '" + true + "'", boolean83 == true);
        org.junit.Assert.assertNotNull(userList85);
        org.junit.Assert.assertTrue("'" + int89 + "' != '" + 101 + "'", int89 == 101);
    }

    @Test
    public void test0406() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0406");
        com.reservation_system.model.HeadLabCoordinator headLabCoordinator5 = new com.reservation_system.model.HeadLabCoordinator((int) (short) 0, "Researcher", "researcher", "Password1!", true);
        java.lang.String str6 = headLabCoordinator5.getUserType();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "headlabcoordinator" + "'", str6, "headlabcoordinator");
    }

    @Test
    public void test0407() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0407");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("demo/data/test-users.csv");
        boolean boolean2 = userRepository1.headLabCoordinatorExists();
        com.reservation_system.services.RegistrationService registrationService3 = new com.reservation_system.services.RegistrationService(userRepository1);
        boolean boolean5 = userRepository1.emailExists("");
        java.util.Optional<com.reservation_system.model.User> userOptional7 = userRepository1.findByEmail("");
        com.reservation_system.model.User user8 = null;
        // The following exception was thrown during execution in test generation
        try {
            userRepository1.addUser(user8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
// flaky "75) test0407(com.reservation_system.randoop.registrationservice.RegressionTest0)":         org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(userOptional7);
    }

    @Test
    public void test0408() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0408");
        com.reservation_system.model.Researcher researcher5 = new com.reservation_system.model.Researcher((-1), "Researcher", "guest", "hi!", false);
    }

    @Test
    public void test0409() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0409");
        com.reservation_system.model.Researcher researcher5 = new com.reservation_system.model.Researcher((int) (short) 1, "Student", "Student", "student", false);
    }

    @Test
    public void test0410() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0410");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("demo/data/test-users.csv");
        com.reservation_system.services.RegistrationService registrationService2 = new com.reservation_system.services.RegistrationService(userRepository1);
        com.reservation_system.model.Faculty faculty8 = new com.reservation_system.model.Faculty(0, "Password1!", "demo/data/test-users.csv", "researcher", false);
        java.lang.String str9 = faculty8.getName();
        userRepository1.addUser((com.reservation_system.model.User) faculty8);
        boolean boolean11 = userRepository1.headLabCoordinatorExists();
        com.reservation_system.services.RegistrationService registrationService12 = new com.reservation_system.services.RegistrationService(userRepository1);
        com.reservation_system.model.Researcher researcher18 = new com.reservation_system.model.Researcher((int) '4', "labmanager", "Andrew", "researcher", true);
        userRepository1.addUser((com.reservation_system.model.User) researcher18);
        int int20 = userRepository1.getNextID();
        com.reservation_system.repository.UserRepository userRepository22 = new com.reservation_system.repository.UserRepository("demo/data/test-users.csv");
        int int23 = userRepository22.getNextID();
        int int24 = userRepository22.getNextID();
        boolean boolean26 = userRepository22.emailExists("faculty");
        com.reservation_system.model.LabManager labManager32 = new com.reservation_system.model.LabManager((int) (short) 0, "", "labmanager", "Password1!", true);
        userRepository22.addUser((com.reservation_system.model.User) labManager32);
        java.util.Optional<com.reservation_system.model.User> userOptional35 = userRepository22.findByEmail("");
        com.reservation_system.model.Researcher researcher41 = new com.reservation_system.model.Researcher((int) (byte) 100, "Password1!", "Password1!", "headlabcoordinator", true);
        userRepository22.addUser((com.reservation_system.model.User) researcher41);
        java.util.List<com.reservation_system.model.User> userList43 = userRepository22.getAllUsers();
        userRepository1.saveAllUsers(userList43);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Password1!" + "'", str9, "Password1!");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 101 + "'", int20 == 101);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 101 + "'", int23 == 101);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 101 + "'", int24 == 101);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertNotNull(userOptional35);
        org.junit.Assert.assertNotNull(userList43);
    }

    @Test
    public void test0411() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0411");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("demo/data/test-users.csv");
        java.util.Optional<com.reservation_system.model.User> userOptional3 = userRepository1.findByEmail("hi!");
        int int4 = userRepository1.getNextID();
        int int5 = userRepository1.getNextID();
        int int6 = userRepository1.getNextID();
        boolean boolean7 = userRepository1.headLabCoordinatorExists();
        boolean boolean8 = userRepository1.headLabCoordinatorExists();
        org.junit.Assert.assertNotNull(userOptional3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 101 + "'", int4 == 101);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 101 + "'", int5 == 101);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 101 + "'", int6 == 101);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test0412() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0412");
        com.reservation_system.model.Faculty faculty5 = new com.reservation_system.model.Faculty((int) (byte) 0, "labmanager", "andrew@example.com", "Researcher", true);
    }

    @Test
    public void test0413() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0413");
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
        int int51 = userRepository1.getNextID();
        java.util.List<com.reservation_system.model.User> userList52 = userRepository1.getAllUsers();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Password1!" + "'", str12, "Password1!");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "Password1!" + "'", str32, "Password1!");
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "Password1!" + "'", str44, "Password1!");
        org.junit.Assert.assertNotNull(userList46);
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + 101 + "'", int51 == 101);
        org.junit.Assert.assertNotNull(userList52);
    }

    @Test
    public void test0414() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0414");
        com.reservation_system.model.Student student5 = new com.reservation_system.model.Student(0, "Guest", "headlabcoordinator", "Guest", true);
    }

    @Test
    public void test0415() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0415");
        com.reservation_system.model.Researcher researcher5 = new com.reservation_system.model.Researcher((int) (short) -1, "andrew@example.com", "guest", "labmanager", false);
        java.lang.String str6 = researcher5.getPassword();
        java.lang.String str7 = researcher5.getName();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "labmanager" + "'", str6, "labmanager");
    }

    @Test
    public void test0416() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0416");
        com.reservation_system.model.HeadLabCoordinator headLabCoordinator5 = new com.reservation_system.model.HeadLabCoordinator(102, "headlabcoordinator", "hi!", "", false);
    }

    @Test
    public void test0417() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0417");
        com.reservation_system.model.Guest guest5 = new com.reservation_system.model.Guest((int) (short) -1, "student", "", "Guest", true);
        java.lang.String str6 = guest5.getUserType();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Guest" + "'", str6, "Guest");
    }

    @Test
    public void test0418() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0418");
        com.reservation_system.model.Researcher researcher5 = new com.reservation_system.model.Researcher((int) (byte) 1, "guest", "researcher", "demo/data/test-users.csv", false);
        researcher5.setApproved(false);
    }

    @Test
    public void test0419() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0419");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("demo/data/test-users.csv");
        int int2 = userRepository1.getNextID();
        int int3 = userRepository1.getNextID();
        boolean boolean5 = userRepository1.emailExists("faculty");
        java.util.List<com.reservation_system.model.User> userList6 = userRepository1.getAllUsers();
        int int7 = userRepository1.getNextID();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 101 + "'", int2 == 101);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 101 + "'", int3 == 101);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(userList6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 101 + "'", int7 == 101);
    }

    @Test
    public void test0420() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0420");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("demo/data/test-users.csv");
        int int2 = userRepository1.getNextID();
        int int3 = userRepository1.getNextID();
        boolean boolean5 = userRepository1.emailExists("faculty");
        com.reservation_system.model.LabManager labManager11 = new com.reservation_system.model.LabManager((int) (short) 0, "", "labmanager", "Password1!", true);
        userRepository1.addUser((com.reservation_system.model.User) labManager11);
        com.reservation_system.services.RegistrationService registrationService13 = new com.reservation_system.services.RegistrationService(userRepository1);
        // The following exception was thrown during execution in test generation
        try {
            com.reservation_system.model.User user18 = registrationService13.registerUser("Guest", "hi!", "hi!", "faculty");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid email format.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 101 + "'", int2 == 101);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 101 + "'", int3 == 101);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
    }

    @Test
    public void test0421() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0421");
        com.reservation_system.model.Student student5 = new com.reservation_system.model.Student(52, "researcher", "guest", "Researcher", false);
        java.lang.String str6 = student5.getPassword();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Researcher" + "'", str6, "Researcher");
    }

    @Test
    public void test0422() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0422");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("demo/data/test-users.csv");
        java.util.Optional<com.reservation_system.model.User> userOptional3 = userRepository1.findByEmail("hi!");
        int int4 = userRepository1.getNextID();
        com.reservation_system.services.RegistrationService registrationService5 = new com.reservation_system.services.RegistrationService(userRepository1);
        // The following exception was thrown during execution in test generation
        try {
            com.reservation_system.model.User user10 = registrationService5.registerUser("student", "Andrew", "Andrew", "andrew@example.com");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid email format.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(userOptional3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 101 + "'", int4 == 101);
    }

    @Test
    public void test0423() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0423");
        com.reservation_system.model.Student student5 = new com.reservation_system.model.Student((int) (byte) 100, "student", "Student", "guest", true);
    }

    @Test
    public void test0424() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0424");
        com.reservation_system.model.Guest guest5 = new com.reservation_system.model.Guest((-1), "demo/data/test-users.csv", "", "Researcher", true);
        java.lang.String str6 = guest5.getUserType();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Guest" + "'", str6, "Guest");
    }

    @Test
    public void test0425() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0425");
        com.reservation_system.model.Faculty faculty5 = new com.reservation_system.model.Faculty((int) (short) 0, "guest", "Andrew", "guest", true);
        int int6 = faculty5.getID();
        boolean boolean7 = faculty5.isApproved();
        boolean boolean8 = faculty5.isApproved();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test0426() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0426");
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
            com.reservation_system.model.User user15 = registrationService10.registerUser("Student", "guest", "Researcher", "faculty");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid email format.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(userOptional9);
    }

    @Test
    public void test0427() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0427");
        com.reservation_system.model.User user6 = com.reservation_system.patterns.factory.UserFactory.createUser("labmanager", 101, "guest", "demo/data/test-users.csv", "andrew@example.com", true);
        org.junit.Assert.assertNotNull(user6);
    }

    @Test
    public void test0428() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0428");
        com.reservation_system.model.HeadLabCoordinator headLabCoordinator5 = new com.reservation_system.model.HeadLabCoordinator(102, "Researcher", "Researcher", "andrew@example.com", true);
    }

    @Test
    public void test0429() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0429");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("demo/data/test-users.csv");
        boolean boolean2 = userRepository1.headLabCoordinatorExists();
        com.reservation_system.services.RegistrationService registrationService3 = new com.reservation_system.services.RegistrationService(userRepository1);
        boolean boolean5 = userRepository1.emailExists("");
        boolean boolean6 = userRepository1.headLabCoordinatorExists();
        com.reservation_system.services.RegistrationService registrationService7 = new com.reservation_system.services.RegistrationService(userRepository1);
        int int8 = userRepository1.getNextID();
        boolean boolean10 = userRepository1.emailExists("Andrew");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
// flaky "76) test0429(com.reservation_system.randoop.registrationservice.RegressionTest0)":         org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 101 + "'", int8 == 101);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test0430() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0430");
        com.reservation_system.model.Researcher researcher5 = new com.reservation_system.model.Researcher(1, "Password1!", "labmanager", "Guest", false);
    }

    @Test
    public void test0431() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0431");
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
        boolean boolean25 = faculty19.requiresDepartmentApproval();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 101 + "'", int2 == 101);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "labmanager" + "'", str9, "labmanager");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "guest" + "'", str12, "guest");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "Password1!" + "'", str20, "Password1!");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "Password1!" + "'", str21, "Password1!");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "Password1!" + "'", str22, "Password1!");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "demo/data/test-users.csv" + "'", str23, "demo/data/test-users.csv");
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
    }

    @Test
    public void test0432() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0432");
        com.reservation_system.model.HeadLabCoordinator headLabCoordinator5 = new com.reservation_system.model.HeadLabCoordinator((int) (short) 10, "researcher", "student", "Faculty", false);
        java.lang.String str6 = headLabCoordinator5.getUserType();
        java.lang.String str7 = headLabCoordinator5.getUserType();
        boolean boolean8 = headLabCoordinator5.requiresDepartmentApproval();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "headlabcoordinator" + "'", str6, "headlabcoordinator");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "headlabcoordinator" + "'", str7, "headlabcoordinator");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test0433() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0433");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("demo/data/test-users.csv");
        com.reservation_system.services.RegistrationService registrationService2 = new com.reservation_system.services.RegistrationService(userRepository1);
        int int3 = userRepository1.getNextID();
        boolean boolean4 = userRepository1.headLabCoordinatorExists();
        boolean boolean5 = userRepository1.headLabCoordinatorExists();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 101 + "'", int3 == 101);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
    }

    @Test
    public void test0434() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0434");
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
            com.reservation_system.model.User user21 = registrationService16.registerUser("Student", "guest", "Faculty", "andrew@example.com");
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
    public void test0435() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0435");
        com.reservation_system.model.Researcher researcher5 = new com.reservation_system.model.Researcher((int) (short) -1, "faculty", "researcher", "hi!", true);
        researcher5.setApproved(false);
        java.lang.String str8 = researcher5.getEmail();
        java.lang.String str9 = researcher5.getUserType();
        java.lang.String str10 = researcher5.getUserType();
        java.lang.String str11 = researcher5.getUserType();
        java.lang.String str12 = researcher5.getName();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "researcher" + "'", str8, "researcher");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Researcher" + "'", str9, "Researcher");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Researcher" + "'", str10, "Researcher");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Researcher" + "'", str11, "Researcher");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "faculty" + "'", str12, "faculty");
    }

    @Test
    public void test0436() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0436");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("demo/data/test-users.csv");
        boolean boolean2 = userRepository1.headLabCoordinatorExists();
        com.reservation_system.services.RegistrationService registrationService3 = new com.reservation_system.services.RegistrationService(userRepository1);
        boolean boolean5 = userRepository1.emailExists("");
        com.reservation_system.repository.UserRepository userRepository7 = new com.reservation_system.repository.UserRepository("demo/data/test-users.csv");
        int int8 = userRepository7.getNextID();
        com.reservation_system.repository.UserRepository userRepository10 = new com.reservation_system.repository.UserRepository("demo/data/test-users.csv");
        boolean boolean11 = userRepository10.headLabCoordinatorExists();
        com.reservation_system.repository.UserRepository userRepository13 = new com.reservation_system.repository.UserRepository("demo/data/test-users.csv");
        com.reservation_system.services.RegistrationService registrationService14 = new com.reservation_system.services.RegistrationService(userRepository13);
        com.reservation_system.model.Faculty faculty20 = new com.reservation_system.model.Faculty(0, "Password1!", "demo/data/test-users.csv", "researcher", false);
        java.lang.String str21 = faculty20.getName();
        userRepository13.addUser((com.reservation_system.model.User) faculty20);
        java.util.List<com.reservation_system.model.User> userList23 = userRepository13.getAllUsers();
        userRepository10.saveAllUsers(userList23);
        com.reservation_system.services.RegistrationService registrationService25 = new com.reservation_system.services.RegistrationService(userRepository10);
        java.util.List<com.reservation_system.model.User> userList26 = userRepository10.getAllUsers();
        java.util.List<com.reservation_system.model.User> userList27 = userRepository10.getAllUsers();
        userRepository7.saveAllUsers(userList27);
        userRepository1.saveAllUsers(userList27);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
// flaky "77) test0436(com.reservation_system.randoop.registrationservice.RegressionTest0)":         org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 101 + "'", int8 == 101);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "Password1!" + "'", str21, "Password1!");
        org.junit.Assert.assertNotNull(userList23);
        org.junit.Assert.assertNotNull(userList26);
        org.junit.Assert.assertNotNull(userList27);
    }

    @Test
    public void test0437() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0437");
        com.reservation_system.model.HeadLabCoordinator headLabCoordinator5 = new com.reservation_system.model.HeadLabCoordinator((int) (short) 0, "", "Andrew", "andrew@example.com", true);
        java.lang.String str6 = headLabCoordinator5.getName();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
    }

    @Test
    public void test0438() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0438");
        com.reservation_system.model.Researcher researcher5 = new com.reservation_system.model.Researcher((int) (byte) 10, "", "hi!", "headlabcoordinator", true);
        java.lang.String str6 = researcher5.getEmail();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
    }

    @Test
    public void test0439() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0439");
        com.reservation_system.model.Guest guest5 = new com.reservation_system.model.Guest((int) (byte) -1, "guest", "Researcher", "Faculty", true);
        java.lang.String str6 = guest5.getUserType();
        java.lang.String str7 = guest5.getEmail();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Guest" + "'", str6, "Guest");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Researcher" + "'", str7, "Researcher");
    }

    @Test
    public void test0440() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0440");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("demo/data/test-users.csv");
        java.util.Optional<com.reservation_system.model.User> userOptional3 = userRepository1.findByEmail("hi!");
        java.util.List<com.reservation_system.model.User> userList4 = userRepository1.getAllUsers();
        com.reservation_system.services.RegistrationService registrationService5 = new com.reservation_system.services.RegistrationService(userRepository1);
        // The following exception was thrown during execution in test generation
        try {
            com.reservation_system.model.User user10 = registrationService5.registerUser("Researcher", "demo/data/test-users.csv", "hi!", "student");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid email format.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(userOptional3);
        org.junit.Assert.assertNotNull(userList4);
    }

    @Test
    public void test0441() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0441");
        com.reservation_system.model.Student student5 = new com.reservation_system.model.Student((int) (short) 100, "Student", "headlabcoordinator", "Andrew", true);
        java.lang.String str6 = student5.getUserType();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Student" + "'", str6, "Student");
    }

    @Test
    public void test0442() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0442");
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
        java.lang.String str35 = student32.getUserType();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Password1!" + "'", str15, "Password1!");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 101 + "'", int18 == 101);
        org.junit.Assert.assertNotNull(userList21);
        org.junit.Assert.assertNotNull(userList23);
        org.junit.Assert.assertNotNull(userList26);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "Researcher" + "'", str34, "Researcher");
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "Student" + "'", str35, "Student");
    }

    @Test
    public void test0443() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0443");
        // The following exception was thrown during execution in test generation
        try {
            com.reservation_system.model.User user6 = com.reservation_system.patterns.factory.UserFactory.createUser("", (int) (byte) 1, "labmanager", "student", "faculty", true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid user type: ");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0444() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0444");
        com.reservation_system.model.Faculty faculty5 = new com.reservation_system.model.Faculty(0, "Password1!", "demo/data/test-users.csv", "researcher", false);
        java.lang.String str6 = faculty5.getName();
        java.lang.String str7 = faculty5.getName();
        java.lang.String str8 = faculty5.getName();
        java.lang.String str9 = faculty5.getUserType();
        java.lang.String str10 = faculty5.getUserType();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Password1!" + "'", str6, "Password1!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Password1!" + "'", str7, "Password1!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Password1!" + "'", str8, "Password1!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Faculty" + "'", str9, "Faculty");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Faculty" + "'", str10, "Faculty");
    }

    @Test
    public void test0445() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0445");
        com.reservation_system.model.User user6 = com.reservation_system.patterns.factory.UserFactory.createUser("student", 10, "demo/data/test-users.csv", "Faculty", "", true);
        org.junit.Assert.assertNotNull(user6);
    }

    @Test
    public void test0446() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0446");
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
        com.reservation_system.services.RegistrationService registrationService37 = new com.reservation_system.services.RegistrationService(userRepository1);
        // The following exception was thrown during execution in test generation
        try {
            com.reservation_system.model.User user42 = registrationService37.registerUser("faculty", "student", "Faculty", "researcher");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid email format.");
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
    }

    @Test
    public void test0447() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0447");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("demo/data/test-users.csv");
        int int2 = userRepository1.getNextID();
        int int3 = userRepository1.getNextID();
        boolean boolean5 = userRepository1.emailExists("faculty");
        com.reservation_system.model.LabManager labManager11 = new com.reservation_system.model.LabManager((int) (short) 0, "", "labmanager", "Password1!", true);
        userRepository1.addUser((com.reservation_system.model.User) labManager11);
        java.util.Optional<com.reservation_system.model.User> userOptional14 = userRepository1.findByEmail("");
        boolean boolean16 = userRepository1.emailExists("hi!");
        boolean boolean17 = userRepository1.headLabCoordinatorExists();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 101 + "'", int2 == 101);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 101 + "'", int3 == 101);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(userOptional14);
// flaky "78) test0447(com.reservation_system.randoop.registrationservice.RegressionTest0)":         org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
    }

    @Test
    public void test0448() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0448");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("demo/data/test-users.csv");
        java.util.List<com.reservation_system.model.User> userList2 = userRepository1.getAllUsers();
        com.reservation_system.services.RegistrationService registrationService3 = new com.reservation_system.services.RegistrationService(userRepository1);
        java.util.List<com.reservation_system.model.User> userList4 = userRepository1.getAllUsers();
        com.reservation_system.services.RegistrationService registrationService5 = new com.reservation_system.services.RegistrationService(userRepository1);
        boolean boolean6 = userRepository1.headLabCoordinatorExists();
        org.junit.Assert.assertNotNull(userList2);
        org.junit.Assert.assertNotNull(userList4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test0449() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0449");
        com.reservation_system.model.Guest guest5 = new com.reservation_system.model.Guest((int) (short) 10, "student", "student", "Guest", false);
    }

    @Test
    public void test0450() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0450");
        com.reservation_system.model.Researcher researcher5 = new com.reservation_system.model.Researcher((int) (short) -1, "andrew@example.com", "guest", "labmanager", false);
        java.lang.String str6 = researcher5.getPassword();
        boolean boolean7 = researcher5.requiresDepartmentApproval();
        boolean boolean8 = researcher5.requiresDepartmentApproval();
        boolean boolean9 = researcher5.requiresDepartmentApproval();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "labmanager" + "'", str6, "labmanager");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test0451() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0451");
        com.reservation_system.model.Guest guest5 = new com.reservation_system.model.Guest((int) '4', "Researcher", "andrew@example.com", "Faculty", false);
        java.lang.String str6 = guest5.getUserType();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Guest" + "'", str6, "Guest");
    }

    @Test
    public void test0452() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0452");
        com.reservation_system.model.Faculty faculty5 = new com.reservation_system.model.Faculty(32, "labmanager", "hi!", "Faculty", false);
        java.lang.String str6 = faculty5.getUserType();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Faculty" + "'", str6, "Faculty");
    }

    @Test
    public void test0453() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0453");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("demo/data/test-users.csv");
        java.util.Optional<com.reservation_system.model.User> userOptional3 = userRepository1.findByEmail("hi!");
        boolean boolean5 = userRepository1.emailExists("Faculty");
        com.reservation_system.model.Faculty faculty11 = new com.reservation_system.model.Faculty((int) (byte) 1, "guest", "", "headlabcoordinator", false);
        boolean boolean12 = faculty11.requiresDepartmentApproval();
        userRepository1.addUser((com.reservation_system.model.User) faculty11);
        boolean boolean14 = faculty11.isApproved();
        org.junit.Assert.assertNotNull(userOptional3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test0454() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0454");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("demo/data/test-users.csv");
        java.util.Optional<com.reservation_system.model.User> userOptional3 = userRepository1.findByEmail("hi!");
        java.util.List<com.reservation_system.model.User> userList4 = userRepository1.getAllUsers();
        java.util.Optional<com.reservation_system.model.User> userOptional6 = userRepository1.findByEmail("labmanager");
        boolean boolean8 = userRepository1.emailExists("hi!");
        org.junit.Assert.assertNotNull(userOptional3);
        org.junit.Assert.assertNotNull(userList4);
        org.junit.Assert.assertNotNull(userOptional6);
// flaky "79) test0454(com.reservation_system.randoop.registrationservice.RegressionTest0)":         org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test0455() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0455");
        com.reservation_system.model.Faculty faculty5 = new com.reservation_system.model.Faculty(10, "researcher", "Guest", "andrew@example.com", true);
        java.lang.String str6 = faculty5.getPassword();
        faculty5.setApproved(true);
        java.lang.String str9 = faculty5.getPassword();
    }

    @Test
    public void test0456() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0456");
        com.reservation_system.model.LabManager labManager5 = new com.reservation_system.model.LabManager((int) (byte) 0, "guest", "Password1!", "Guest", true);
    }

    @Test
    public void test0457() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0457");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("demo/data/test-users.csv");
        com.reservation_system.services.RegistrationService registrationService2 = new com.reservation_system.services.RegistrationService(userRepository1);
        com.reservation_system.services.RegistrationService registrationService3 = new com.reservation_system.services.RegistrationService(userRepository1);
        boolean boolean5 = userRepository1.emailExists("faculty");
        java.util.Optional<com.reservation_system.model.User> userOptional7 = userRepository1.findByEmail("researcher");
        com.reservation_system.model.Student student13 = new com.reservation_system.model.Student(0, "Student", "Faculty", "hi!", false);
        userRepository1.addUser((com.reservation_system.model.User) student13);
        boolean boolean15 = student13.requiresDepartmentApproval();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(userOptional7);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
    }

    @Test
    public void test0458() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0458");
        com.reservation_system.model.Researcher researcher5 = new com.reservation_system.model.Researcher(102, "hi!", "Faculty", "researcher", true);
        java.lang.String str6 = researcher5.getPassword();
        researcher5.setApproved(true);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "researcher" + "'", str6, "researcher");
    }

    @Test
    public void test0459() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0459");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("demo/data/test-users.csv");
        java.util.List<com.reservation_system.model.User> userList2 = userRepository1.getAllUsers();
        com.reservation_system.services.RegistrationService registrationService3 = new com.reservation_system.services.RegistrationService(userRepository1);
        // The following exception was thrown during execution in test generation
        try {
            com.reservation_system.model.User user8 = registrationService3.registerUser("Faculty", "guest", "demo/data/test-users.csv", "guest");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid email format.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(userList2);
    }

    @Test
    public void test0460() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0460");
        com.reservation_system.model.Student student5 = new com.reservation_system.model.Student((int) (short) -1, "labmanager", "", "Faculty", true);
        boolean boolean6 = student5.requiresDepartmentApproval();
        java.lang.String str7 = student5.getUserType();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Student" + "'", str7, "Student");
    }

    @Test
    public void test0461() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0461");
        // The following exception was thrown during execution in test generation
        try {
            com.reservation_system.model.User user6 = com.reservation_system.patterns.factory.UserFactory.createUser("", 102, "labmanager", "", "Researcher", false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid user type: ");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0462() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0462");
        com.reservation_system.model.Researcher researcher5 = new com.reservation_system.model.Researcher((int) (byte) 10, "", "Guest", "headlabcoordinator", true);
        java.lang.String str6 = researcher5.getEmail();
        int int7 = researcher5.getID();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Guest" + "'", str6, "Guest");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 10 + "'", int7 == 10);
    }

    @Test
    public void test0463() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0463");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("demo/data/test-users.csv");
        java.util.List<com.reservation_system.model.User> userList2 = userRepository1.getAllUsers();
        com.reservation_system.services.RegistrationService registrationService3 = new com.reservation_system.services.RegistrationService(userRepository1);
        java.util.List<com.reservation_system.model.User> userList4 = userRepository1.getAllUsers();
        boolean boolean6 = userRepository1.emailExists("Guest");
        java.util.List<com.reservation_system.model.User> userList7 = userRepository1.getAllUsers();
        java.util.Optional<com.reservation_system.model.User> userOptional9 = userRepository1.findByEmail("Password1!");
        boolean boolean11 = userRepository1.emailExists("demo/data/test-users.csv");
        java.lang.Class<?> wildcardClass12 = userRepository1.getClass();
        org.junit.Assert.assertNotNull(userList2);
        org.junit.Assert.assertNotNull(userList4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(userList7);
        org.junit.Assert.assertNotNull(userOptional9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0464() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0464");
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
        com.reservation_system.model.LabManager labManager23 = new com.reservation_system.model.LabManager((int) 'a', "headlabcoordinator", "Researcher", "Andrew", false);
        java.lang.String str24 = labManager23.getEmail();
        labManager23.setApproved(false);
        userRepository1.addUser((com.reservation_system.model.User) labManager23);
        java.lang.String str28 = labManager23.getUserType();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Researcher" + "'", str14, "Researcher");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Researcher" + "'", str16, "Researcher");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "Researcher" + "'", str24, "Researcher");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "labmanager" + "'", str28, "labmanager");
    }

    @Test
    public void test0465() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0465");
        com.reservation_system.model.Faculty faculty5 = new com.reservation_system.model.Faculty(32, "demo/data/test-users.csv", "Andrew", "Faculty", false);
    }

    @Test
    public void test0466() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0466");
        com.reservation_system.model.HeadLabCoordinator headLabCoordinator5 = new com.reservation_system.model.HeadLabCoordinator(0, "faculty", "Student", "researcher", false);
    }

    @Test
    public void test0467() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0467");
        com.reservation_system.model.Researcher researcher5 = new com.reservation_system.model.Researcher((int) '#', "researcher", "Password1!", "Password1!", false);
        boolean boolean6 = researcher5.requiresDepartmentApproval();
        researcher5.setApproved(false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test0468() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0468");
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
            com.reservation_system.model.User user80 = registrationService75.registerUser("guest", "hi!", "researcher", "headlabcoordinator");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid email format.");
        } catch (java.lang.IllegalArgumentException e) {
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
    }

    @Test
    public void test0469() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0469");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("demo/data/test-users.csv");
        java.util.Optional<com.reservation_system.model.User> userOptional3 = userRepository1.findByEmail("hi!");
        int int4 = userRepository1.getNextID();
        boolean boolean5 = userRepository1.headLabCoordinatorExists();
        java.util.List<com.reservation_system.model.User> userList6 = userRepository1.getAllUsers();
        boolean boolean8 = userRepository1.emailExists("Andrew");
        java.util.List<com.reservation_system.model.User> userList9 = userRepository1.getAllUsers();
        org.junit.Assert.assertNotNull(userOptional3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 101 + "'", int4 == 101);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(userList6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(userList9);
    }

    @Test
    public void test0470() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0470");
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
            com.reservation_system.model.User user55 = registrationService50.registerUser("Researcher", "hi!", "faculty", "Researcher");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid email format.");
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
    public void test0471() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0471");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("demo/data/test-users.csv");
        com.reservation_system.services.RegistrationService registrationService2 = new com.reservation_system.services.RegistrationService(userRepository1);
        com.reservation_system.services.RegistrationService registrationService3 = new com.reservation_system.services.RegistrationService(userRepository1);
        boolean boolean5 = userRepository1.emailExists("faculty");
        java.util.Optional<com.reservation_system.model.User> userOptional7 = userRepository1.findByEmail("researcher");
        java.lang.Class<?> wildcardClass8 = userOptional7.getClass();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(userOptional7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0472() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0472");
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
        java.lang.Class<?> wildcardClass22 = userRepository1.getClass();
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Password1!" + "'", str9, "Password1!");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 101 + "'", int20 == 101);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test0473() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0473");
        com.reservation_system.model.LabManager labManager5 = new com.reservation_system.model.LabManager(102, "Faculty", "Faculty", "", true);
    }

    @Test
    public void test0474() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0474");
        com.reservation_system.model.Faculty faculty5 = new com.reservation_system.model.Faculty(1, "labmanager", "faculty", "Researcher", false);
    }

    @Test
    public void test0475() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0475");
        com.reservation_system.model.HeadLabCoordinator headLabCoordinator5 = new com.reservation_system.model.HeadLabCoordinator(10, "researcher", "headlabcoordinator", "faculty", false);
        java.lang.String str6 = headLabCoordinator5.getUserType();
        java.lang.Class<?> wildcardClass7 = headLabCoordinator5.getClass();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "headlabcoordinator" + "'", str6, "headlabcoordinator");
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0476() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0476");
        com.reservation_system.model.LabManager labManager5 = new com.reservation_system.model.LabManager((int) 'a', "headlabcoordinator", "Researcher", "Andrew", false);
        java.lang.String str6 = labManager5.getEmail();
        labManager5.setApproved(false);
        java.lang.String str9 = labManager5.getPassword();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Researcher" + "'", str6, "Researcher");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Andrew" + "'", str9, "Andrew");
    }

    @Test
    public void test0477() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0477");
        com.reservation_system.model.Faculty faculty5 = new com.reservation_system.model.Faculty((int) (short) 0, "Faculty", "Password1!", "Faculty", true);
        java.lang.String str6 = faculty5.getUserType();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Faculty" + "'", str6, "Faculty");
    }

    @Test
    public void test0478() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0478");
        com.reservation_system.model.HeadLabCoordinator headLabCoordinator5 = new com.reservation_system.model.HeadLabCoordinator(1, "student", "Researcher", "", false);
        boolean boolean6 = headLabCoordinator5.requiresDepartmentApproval();
        java.lang.String str7 = headLabCoordinator5.getUserType();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "headlabcoordinator" + "'", str7, "headlabcoordinator");
    }

    @Test
    public void test0479() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0479");
        com.reservation_system.model.LabManager labManager5 = new com.reservation_system.model.LabManager(32, "Researcher", "researcher", "andrew@example.com", false);
        java.lang.String str6 = labManager5.getUserType();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "labmanager" + "'", str6, "labmanager");
    }

    @Test
    public void test0480() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0480");
        com.reservation_system.model.Faculty faculty5 = new com.reservation_system.model.Faculty(0, "faculty", "Andrew", "student", true);
    }

    @Test
    public void test0481() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0481");
        com.reservation_system.model.Faculty faculty5 = new com.reservation_system.model.Faculty(10, "researcher", "faculty", "", false);
        java.lang.String str6 = faculty5.getEmail();
        boolean boolean7 = faculty5.requiresDepartmentApproval();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "faculty" + "'", str6, "faculty");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test0482() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0482");
        com.reservation_system.model.Faculty faculty5 = new com.reservation_system.model.Faculty(1, "", "labmanager", "Andrew", false);
    }

    @Test
    public void test0483() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0483");
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("demo/data/test-users.csv");
        com.reservation_system.services.RegistrationService registrationService2 = new com.reservation_system.services.RegistrationService(userRepository1);
        com.reservation_system.model.Faculty faculty8 = new com.reservation_system.model.Faculty(0, "Password1!", "demo/data/test-users.csv", "researcher", false);
        java.lang.String str9 = faculty8.getName();
        userRepository1.addUser((com.reservation_system.model.User) faculty8);
        boolean boolean11 = userRepository1.headLabCoordinatorExists();
        com.reservation_system.model.Guest guest17 = new com.reservation_system.model.Guest((int) (byte) -1, "guest", "Researcher", "Faculty", true);
        userRepository1.addUser((com.reservation_system.model.User) guest17);
        java.lang.String str19 = guest17.getUserType();
        java.lang.String str20 = guest17.getName();
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Password1!" + "'", str9, "Password1!");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "Guest" + "'", str19, "Guest");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "guest" + "'", str20, "guest");
    }

    @Test
    public void test0484() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0484");
        com.reservation_system.model.Student student5 = new com.reservation_system.model.Student((int) (byte) 1, "headlabcoordinator", "Guest", "hi!", true);
        boolean boolean6 = student5.isApproved();
        java.lang.String str7 = student5.getUserType();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Student" + "'", str7, "Student");
    }

    @Test
    public void test0485() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0485");
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
        java.lang.String str21 = guest19.getUserType();
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Password1!" + "'", str9, "Password1!");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 101 + "'", int12 == 101);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "Guest" + "'", str21, "Guest");
    }

    @Test
    public void test0486() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0486");
        com.reservation_system.model.Guest guest5 = new com.reservation_system.model.Guest(32, "", "headlabcoordinator", "guest", false);
        java.lang.String str6 = guest5.getUserType();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Guest" + "'", str6, "Guest");
    }

    @Test
    public void test0487() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0487");
        com.reservation_system.model.Researcher researcher5 = new com.reservation_system.model.Researcher(102, "Andrew", "guest", "Researcher", true);
        java.lang.String str6 = researcher5.getUserType();
        java.lang.String str7 = researcher5.getUserType();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Researcher" + "'", str6, "Researcher");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Researcher" + "'", str7, "Researcher");
    }

    @Test
    public void test0488() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0488");
        com.reservation_system.model.Researcher researcher5 = new com.reservation_system.model.Researcher((int) ' ', "demo/data/test-users.csv", "Andrew", "", true);
    }

    @Test
    public void test0489() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0489");
        com.reservation_system.model.Researcher researcher5 = new com.reservation_system.model.Researcher((int) '#', "labmanager", "hi!", "researcher", false);
    }

    @Test
    public void test0490() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0490");
        com.reservation_system.model.User user6 = com.reservation_system.patterns.factory.UserFactory.createUser("Faculty", (int) (byte) 0, "Guest", "Andrew", "Researcher", false);
        org.junit.Assert.assertNotNull(user6);
    }

    @Test
    public void test0491() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0491");
        com.reservation_system.model.HeadLabCoordinator headLabCoordinator5 = new com.reservation_system.model.HeadLabCoordinator(10, "researcher", "headlabcoordinator", "faculty", false);
        java.lang.String str6 = headLabCoordinator5.getUserType();
        java.lang.String str7 = headLabCoordinator5.getUserType();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "headlabcoordinator" + "'", str6, "headlabcoordinator");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "headlabcoordinator" + "'", str7, "headlabcoordinator");
    }

    @Test
    public void test0492() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0492");
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
            com.reservation_system.model.User user20 = registrationService15.registerUser("labmanager", "student", "Student", "Researcher");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Lab manager accounts must be generated by the head lab coordinator.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Password1!" + "'", str9, "Password1!");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 101 + "'", int13 == 101);
    }

    @Test
    public void test0493() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0493");
        com.reservation_system.model.User user6 = com.reservation_system.patterns.factory.UserFactory.createUser("researcher", (int) (byte) 100, "headlabcoordinator", "hi!", "headlabcoordinator", true);
        java.lang.String str7 = user6.getPassword();
        org.junit.Assert.assertNotNull(user6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "headlabcoordinator" + "'", str7, "headlabcoordinator");
    }

    @Test
    public void test0494() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0494");
        com.reservation_system.repository.UserRepository userRepository0 = null;
        com.reservation_system.services.RegistrationService registrationService1 = new com.reservation_system.services.RegistrationService(userRepository0);
        // The following exception was thrown during execution in test generation
        try {
            com.reservation_system.model.User user6 = registrationService1.registerUser("faculty", "demo/data/test-users.csv", "demo/data/test-users.csv", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid email format.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0495() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0495");
        com.reservation_system.model.User user6 = com.reservation_system.patterns.factory.UserFactory.createUser("researcher", (int) (byte) 1, "Guest", "andrew@example.com", "demo/data/test-users.csv", true);
        org.junit.Assert.assertNotNull(user6);
    }

    @Test
    public void test0496() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0496");
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
        // The following exception was thrown during execution in test generation
        try {
            com.reservation_system.model.User user95 = registrationService90.registerUser("Guest", "Password1!", "researcher", "student");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid email format.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Password1!" + "'", str9, "Password1!");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
// flaky "80) test0496(com.reservation_system.randoop.registrationservice.RegressionTest0)":         org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 101 + "'", int23 == 101);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "Password1!" + "'", str33, "Password1!");
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + true + "'", boolean43 == true);
        org.junit.Assert.assertEquals("'" + str53 + "' != '" + "Password1!" + "'", str53, "Password1!");
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + true + "'", boolean55 == true);
        org.junit.Assert.assertEquals("'" + str65 + "' != '" + "Password1!" + "'", str65, "Password1!");
        org.junit.Assert.assertNotNull(userList67);
// flaky "39) test0496(com.reservation_system.randoop.registrationservice.RegressionTest0)":         org.junit.Assert.assertTrue("'" + boolean71 + "' != '" + true + "'", boolean71 == true);
        org.junit.Assert.assertEquals("'" + str81 + "' != '" + "Password1!" + "'", str81, "Password1!");
        org.junit.Assert.assertTrue("'" + boolean83 + "' != '" + true + "'", boolean83 == true);
        org.junit.Assert.assertNotNull(userList85);
        org.junit.Assert.assertTrue("'" + boolean89 + "' != '" + true + "'", boolean89 == true);
    }

    @Test
    public void test0497() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0497");
        com.reservation_system.model.Researcher researcher5 = new com.reservation_system.model.Researcher(102, "student", "Faculty", "hi!", false);
    }

    @Test
    public void test0498() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0498");
        com.reservation_system.model.Guest guest5 = new com.reservation_system.model.Guest(52, "guest", "faculty", "demo/data/test-users.csv", false);
    }

    @Test
    public void test0499() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0499");
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
        // The following exception was thrown during execution in test generation
        try {
            com.reservation_system.model.User user22 = registrationService17.registerUser("demo/data/test-users.csv", "", "guest", "Faculty");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid user type.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Password1!" + "'", str9, "Password1!");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 101 + "'", int13 == 101);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
    }

    @Test
    public void test0500() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0500");
        com.reservation_system.model.LabManager labManager5 = new com.reservation_system.model.LabManager((int) (short) 0, "demo/data/test-users.csv", "Faculty", "Andrew", false);
        int int6 = labManager5.getID();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }
}
