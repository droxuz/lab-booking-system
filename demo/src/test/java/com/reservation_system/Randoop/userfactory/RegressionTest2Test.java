package com.reservation_system.Randoop.userfactory;

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
        com.reservation_system.model.HeadLabCoordinator headLabCoordinator5 = new com.reservation_system.model.HeadLabCoordinator((int) 'a', "hi!", "Guest", "researcher", true);
        headLabCoordinator5.setApproved(false);
    }

    @Test
    public void test1002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1002");
        com.reservation_system.model.Faculty faculty5 = new com.reservation_system.model.Faculty((int) '4', "researcher", "researcher", "Researcher", true);
        java.lang.String str6 = faculty5.getUserType();
        java.lang.String str7 = faculty5.getUserType();
        java.lang.String str8 = faculty5.getUserType();
        java.lang.String str9 = faculty5.getUserType();
        boolean boolean10 = faculty5.requiresDepartmentApproval();
        faculty5.setApproved(false);
        java.lang.String str13 = faculty5.getName();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Faculty" + "'", str6, "Faculty");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Faculty" + "'", str7, "Faculty");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Faculty" + "'", str8, "Faculty");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Faculty" + "'", str9, "Faculty");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "researcher" + "'", str13, "researcher");
    }

    @Test
    public void test1003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1003");
        com.reservation_system.model.LabManager labManager5 = new com.reservation_system.model.LabManager((int) 'a', "faculty", "researcher", "", true);
        boolean boolean6 = labManager5.requiresDepartmentApproval();
        java.lang.String str7 = labManager5.getUserType();
        java.lang.String str8 = labManager5.getName();
        java.lang.String str9 = labManager5.getEmail();
        int int10 = labManager5.getID();
        java.lang.String str11 = labManager5.getUserType();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "labmanager" + "'", str7, "labmanager");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "faculty" + "'", str8, "faculty");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "researcher" + "'", str9, "researcher");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 97 + "'", int10 == 97);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "labmanager" + "'", str11, "labmanager");
    }

    @Test
    public void test1004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1004");
        com.reservation_system.model.User user6 = com.reservation_system.patterns.factory.UserFactory.createUser("Researcher", (int) (byte) 0, "guest", "faculty", "guest", true);
        org.junit.Assert.assertNotNull(user6);
    }

    @Test
    public void test1005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1005");
        com.reservation_system.model.Guest guest5 = new com.reservation_system.model.Guest(1, "hi!", "hi!", "Password1!", false);
    }

    @Test
    public void test1006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1006");
        com.reservation_system.model.LabManager labManager5 = new com.reservation_system.model.LabManager(10, "", "Password1!", "", false);
        java.lang.Class<?> wildcardClass6 = labManager5.getClass();
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test1007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1007");
        com.reservation_system.model.LabManager labManager5 = new com.reservation_system.model.LabManager((int) (byte) 0, "student", "guest", "", true);
        java.lang.String str6 = labManager5.getUserType();
        java.lang.String str7 = labManager5.getName();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "labmanager" + "'", str6, "labmanager");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "student" + "'", str7, "student");
    }

    @Test
    public void test1008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1008");
        com.reservation_system.model.Student student5 = new com.reservation_system.model.Student(1, "guest", "hi!", "student", false);
        java.lang.String str6 = student5.getUserType();
        java.lang.String str7 = student5.getUserType();
        java.lang.String str8 = student5.getUserType();
        student5.setApproved(false);
        java.lang.String str11 = student5.getUserType();
        java.lang.String str12 = student5.getPassword();
        java.lang.String str13 = student5.getUserType();
        boolean boolean14 = student5.isApproved();
        java.lang.String str15 = student5.getUserType();
        java.lang.String str16 = student5.getUserType();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Student" + "'", str6, "Student");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Student" + "'", str7, "Student");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Student" + "'", str8, "Student");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Student" + "'", str11, "Student");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "student" + "'", str12, "student");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Student" + "'", str13, "Student");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Student" + "'", str15, "Student");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Student" + "'", str16, "Student");
    }

    @Test
    public void test1009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1009");
        com.reservation_system.model.Faculty faculty5 = new com.reservation_system.model.Faculty(0, "hi!", "researcher", "hi!", false);
        java.lang.String str6 = faculty5.getUserType();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Faculty" + "'", str6, "Faculty");
    }

    @Test
    public void test1010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1010");
        com.reservation_system.model.LabManager labManager5 = new com.reservation_system.model.LabManager((int) 'a', "Student", "Andrew", "Guest", false);
        java.lang.String str6 = labManager5.getUserType();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "labmanager" + "'", str6, "labmanager");
    }

    @Test
    public void test1011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1011");
        com.reservation_system.model.Researcher researcher5 = new com.reservation_system.model.Researcher((int) (byte) 1, "Guest", "hi!", "hi!", false);
    }

    @Test
    public void test1012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1012");
        com.reservation_system.model.HeadLabCoordinator headLabCoordinator5 = new com.reservation_system.model.HeadLabCoordinator((int) 'a', "researcher", "Password1!", "researcher", false);
        java.lang.String str6 = headLabCoordinator5.getUserType();
        boolean boolean7 = headLabCoordinator5.requiresDepartmentApproval();
        java.lang.String str8 = headLabCoordinator5.getUserType();
        boolean boolean9 = headLabCoordinator5.isApproved();
        int int10 = headLabCoordinator5.getID();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "headlabcoordinator" + "'", str6, "headlabcoordinator");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "headlabcoordinator" + "'", str8, "headlabcoordinator");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 97 + "'", int10 == 97);
    }

    @Test
    public void test1013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1013");
        com.reservation_system.model.Faculty faculty5 = new com.reservation_system.model.Faculty(0, "Guest", "", "andrew@example.com", false);
    }

    @Test
    public void test1014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1014");
        com.reservation_system.model.Researcher researcher5 = new com.reservation_system.model.Researcher(10, "Student", "Guest", "Password1!", false);
        boolean boolean6 = researcher5.isApproved();
        java.lang.String str7 = researcher5.getUserType();
        int int8 = researcher5.getID();
        java.lang.String str9 = researcher5.getUserType();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Researcher" + "'", str7, "Researcher");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 10 + "'", int8 == 10);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Researcher" + "'", str9, "Researcher");
    }

    @Test
    public void test1015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1015");
        com.reservation_system.model.Researcher researcher5 = new com.reservation_system.model.Researcher(100, "Researcher", "headlabcoordinator", "Researcher", true);
    }

    @Test
    public void test1016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1016");
        com.reservation_system.model.HeadLabCoordinator headLabCoordinator5 = new com.reservation_system.model.HeadLabCoordinator(10, "", "Student", "Guest", false);
    }

    @Test
    public void test1017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1017");
        com.reservation_system.model.Student student5 = new com.reservation_system.model.Student((int) (short) 100, "Password1!", "guest", "Faculty", true);
        boolean boolean6 = student5.isApproved();
        int int7 = student5.getID();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 100 + "'", int7 == 100);
    }

    @Test
    public void test1018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1018");
        com.reservation_system.model.Faculty faculty5 = new com.reservation_system.model.Faculty((int) '4', "researcher", "researcher", "Researcher", true);
        java.lang.String str6 = faculty5.getUserType();
        java.lang.String str7 = faculty5.getUserType();
        java.lang.String str8 = faculty5.getName();
        faculty5.setApproved(true);
        java.lang.String str11 = faculty5.getUserType();
        java.lang.String str12 = faculty5.getUserType();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Faculty" + "'", str6, "Faculty");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Faculty" + "'", str7, "Faculty");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "researcher" + "'", str8, "researcher");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Faculty" + "'", str11, "Faculty");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Faculty" + "'", str12, "Faculty");
    }

    @Test
    public void test1019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1019");
        com.reservation_system.model.Researcher researcher5 = new com.reservation_system.model.Researcher((int) (short) 100, "guest", "", "Researcher", true);
        boolean boolean6 = researcher5.requiresDepartmentApproval();
        java.lang.String str7 = researcher5.getUserType();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Researcher" + "'", str7, "Researcher");
    }

    @Test
    public void test1020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1020");
        com.reservation_system.model.Student student5 = new com.reservation_system.model.Student(1, "guest", "hi!", "student", false);
        java.lang.String str6 = student5.getEmail();
        boolean boolean7 = student5.isApproved();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test1021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1021");
        com.reservation_system.model.Faculty faculty5 = new com.reservation_system.model.Faculty(35, "andrew@example.com", "faculty", "guest", true);
        boolean boolean6 = faculty5.requiresDepartmentApproval();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test1022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1022");
        com.reservation_system.model.HeadLabCoordinator headLabCoordinator5 = new com.reservation_system.model.HeadLabCoordinator(10, "", "labmanager", "student", true);
    }

    @Test
    public void test1023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1023");
        com.reservation_system.model.LabManager labManager5 = new com.reservation_system.model.LabManager((int) (short) -1, "headlabcoordinator", "faculty", "Researcher", true);
        java.lang.String str6 = labManager5.getUserType();
        java.lang.String str7 = labManager5.getName();
        java.lang.String str8 = labManager5.getName();
        java.lang.String str9 = labManager5.getPassword();
        labManager5.setApproved(true);
        labManager5.setApproved(false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "labmanager" + "'", str6, "labmanager");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "headlabcoordinator" + "'", str7, "headlabcoordinator");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "headlabcoordinator" + "'", str8, "headlabcoordinator");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Researcher" + "'", str9, "Researcher");
    }

    @Test
    public void test1024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1024");
        com.reservation_system.model.Student student5 = new com.reservation_system.model.Student((int) (byte) 1, "headlabcoordinator", "guest", "faculty", false);
        boolean boolean6 = student5.requiresDepartmentApproval();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test1025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1025");
        com.reservation_system.model.Researcher researcher5 = new com.reservation_system.model.Researcher(1, "andrew@example.com", "Guest", "faculty", true);
        java.lang.String str6 = researcher5.getUserType();
        int int7 = researcher5.getID();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Researcher" + "'", str6, "Researcher");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
    }

    @Test
    public void test1026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1026");
        com.reservation_system.model.Student student5 = new com.reservation_system.model.Student(1, "guest", "hi!", "student", false);
        java.lang.String str6 = student5.getUserType();
        java.lang.String str7 = student5.getUserType();
        java.lang.String str8 = student5.getUserType();
        java.lang.String str9 = student5.getUserType();
        student5.setApproved(false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Student" + "'", str6, "Student");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Student" + "'", str7, "Student");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Student" + "'", str8, "Student");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Student" + "'", str9, "Student");
    }

    @Test
    public void test1027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1027");
        com.reservation_system.model.Student student5 = new com.reservation_system.model.Student((int) (short) 1, "student", "Student", "headlabcoordinator", false);
        java.lang.String str6 = student5.getName();
        java.lang.String str7 = student5.getUserType();
        java.lang.String str8 = student5.getEmail();
        java.lang.String str9 = student5.getName();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "student" + "'", str6, "student");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Student" + "'", str7, "Student");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Student" + "'", str8, "Student");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "student" + "'", str9, "student");
    }

    @Test
    public void test1028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1028");
        com.reservation_system.model.Guest guest5 = new com.reservation_system.model.Guest(52, "", "student", "Faculty", false);
        boolean boolean6 = guest5.isApproved();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test1029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1029");
        com.reservation_system.model.Student student5 = new com.reservation_system.model.Student(97, "andrew@example.com", "faculty", "Andrew", false);
    }

    @Test
    public void test1030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1030");
        com.reservation_system.model.Researcher researcher5 = new com.reservation_system.model.Researcher(0, "student", "", "student", false);
        java.lang.String str6 = researcher5.getName();
        java.lang.String str7 = researcher5.getName();
        java.lang.String str8 = researcher5.getPassword();
        java.lang.String str9 = researcher5.getEmail();
        java.lang.String str10 = researcher5.getUserType();
        java.lang.String str11 = researcher5.getUserType();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "student" + "'", str6, "student");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "student" + "'", str7, "student");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "student" + "'", str8, "student");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Researcher" + "'", str10, "Researcher");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Researcher" + "'", str11, "Researcher");
    }

    @Test
    public void test1031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1031");
        com.reservation_system.model.HeadLabCoordinator headLabCoordinator5 = new com.reservation_system.model.HeadLabCoordinator((int) '4', "labmanager", "Student", "headlabcoordinator", false);
        java.lang.Class<?> wildcardClass6 = headLabCoordinator5.getClass();
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test1032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1032");
        com.reservation_system.model.LabManager labManager5 = new com.reservation_system.model.LabManager(100, "Andrew", "Faculty", "Guest", true);
        int int6 = labManager5.getID();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
    }

    @Test
    public void test1033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1033");
        com.reservation_system.model.LabManager labManager5 = new com.reservation_system.model.LabManager((int) (short) 10, "headlabcoordinator", "Andrew", "guest", true);
        java.lang.String str6 = labManager5.getUserType();
        java.lang.String str7 = labManager5.getUserType();
        java.lang.String str8 = labManager5.getUserType();
        java.lang.String str9 = labManager5.getUserType();
        int int10 = labManager5.getID();
        int int11 = labManager5.getID();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "labmanager" + "'", str6, "labmanager");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "labmanager" + "'", str7, "labmanager");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "labmanager" + "'", str8, "labmanager");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "labmanager" + "'", str9, "labmanager");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 10 + "'", int10 == 10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 10 + "'", int11 == 10);
    }

    @Test
    public void test1034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1034");
        com.reservation_system.model.HeadLabCoordinator headLabCoordinator5 = new com.reservation_system.model.HeadLabCoordinator((int) (byte) -1, "researcher", "faculty", "Password1!", true);
    }

    @Test
    public void test1035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1035");
        com.reservation_system.model.Faculty faculty5 = new com.reservation_system.model.Faculty((-1), "Student", "guest", "Andrew", true);
    }

    @Test
    public void test1036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1036");
        com.reservation_system.model.Student student5 = new com.reservation_system.model.Student(52, "student", "Guest", "Password1!", true);
    }

    @Test
    public void test1037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1037");
        com.reservation_system.model.Guest guest5 = new com.reservation_system.model.Guest((int) ' ', "", "andrew@example.com", "hi!", true);
        java.lang.String str6 = guest5.getName();
        int int7 = guest5.getID();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 32 + "'", int7 == 32);
    }

    @Test
    public void test1038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1038");
        // The following exception was thrown during execution in test generation
        try {
            com.reservation_system.model.User user6 = com.reservation_system.patterns.factory.UserFactory.createUser("", 97, "faculty", "researcher", "", true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid user type: ");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1039");
        com.reservation_system.model.Student student5 = new com.reservation_system.model.Student((int) (short) 10, "guest", "labmanager", "", false);
        boolean boolean6 = student5.isApproved();
        java.lang.String str7 = student5.getUserType();
        java.lang.String str8 = student5.getUserType();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Student" + "'", str7, "Student");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Student" + "'", str8, "Student");
    }

    @Test
    public void test1040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1040");
        com.reservation_system.model.User user6 = com.reservation_system.patterns.factory.UserFactory.createUser("Guest", (int) (byte) 10, "Andrew", "hi!", "andrew@example.com", false);
        java.lang.String str7 = user6.getPassword();
        org.junit.Assert.assertNotNull(user6);
    }

    @Test
    public void test1041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1041");
        com.reservation_system.model.Faculty faculty5 = new com.reservation_system.model.Faculty(1, "student", "Password1!", "labmanager", true);
    }

    @Test
    public void test1042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1042");
        com.reservation_system.model.HeadLabCoordinator headLabCoordinator5 = new com.reservation_system.model.HeadLabCoordinator(97, "Andrew", "", "Guest", false);
        boolean boolean6 = headLabCoordinator5.requiresDepartmentApproval();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test1043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1043");
        com.reservation_system.model.Guest guest5 = new com.reservation_system.model.Guest((int) ' ', "guest", "student", "andrew@example.com", false);
    }

    @Test
    public void test1044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1044");
        // The following exception was thrown during execution in test generation
        try {
            com.reservation_system.model.User user6 = com.reservation_system.patterns.factory.UserFactory.createUser("", 10, "guest", "Guest", "Password1!", true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid user type: ");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1045");
        com.reservation_system.model.Faculty faculty5 = new com.reservation_system.model.Faculty((int) ' ', "Researcher", "Password1!", "Student", true);
        java.lang.String str6 = faculty5.getPassword();
        java.lang.String str7 = faculty5.getEmail();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Student" + "'", str6, "Student");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Password1!" + "'", str7, "Password1!");
    }

    @Test
    public void test1046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1046");
        com.reservation_system.model.User user6 = com.reservation_system.patterns.factory.UserFactory.createUser("Student", (int) (byte) 1, "Faculty", "Andrew", "Student", false);
        int int7 = user6.getID();
        boolean boolean8 = user6.requiresDepartmentApproval();
        org.junit.Assert.assertNotNull(user6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test1047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1047");
        com.reservation_system.model.Guest guest5 = new com.reservation_system.model.Guest(10, "", "researcher", "labmanager", true);
        java.lang.String str6 = guest5.getName();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
    }

    @Test
    public void test1048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1048");
        com.reservation_system.model.LabManager labManager5 = new com.reservation_system.model.LabManager((int) (short) 0, "", "labmanager", "Guest", false);
        java.lang.String str6 = labManager5.getEmail();
        java.lang.String str7 = labManager5.getUserType();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "labmanager" + "'", str6, "labmanager");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "labmanager" + "'", str7, "labmanager");
    }

    @Test
    public void test1049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1049");
        com.reservation_system.model.LabManager labManager5 = new com.reservation_system.model.LabManager((int) 'a', "Researcher", "Guest", "student", true);
    }

    @Test
    public void test1050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1050");
        com.reservation_system.model.Guest guest5 = new com.reservation_system.model.Guest((int) '4', "andrew@example.com", "student", "faculty", true);
        java.lang.String str6 = guest5.getName();
        java.lang.String str7 = guest5.getPassword();
        java.lang.String str8 = guest5.getUserType();
        java.lang.String str9 = guest5.getName();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "faculty" + "'", str7, "faculty");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Guest" + "'", str8, "Guest");
    }

    @Test
    public void test1051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1051");
        com.reservation_system.model.Faculty faculty5 = new com.reservation_system.model.Faculty((int) '#', "Andrew", "Student", "Faculty", false);
    }

    @Test
    public void test1052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1052");
        com.reservation_system.model.Researcher researcher5 = new com.reservation_system.model.Researcher(0, "student", "", "student", false);
        java.lang.String str6 = researcher5.getPassword();
        researcher5.setApproved(true);
        boolean boolean9 = researcher5.requiresDepartmentApproval();
        researcher5.setApproved(true);
        java.lang.String str12 = researcher5.getUserType();
        java.lang.Class<?> wildcardClass13 = researcher5.getClass();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "student" + "'", str6, "student");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Researcher" + "'", str12, "Researcher");
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test1053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1053");
        com.reservation_system.model.Faculty faculty5 = new com.reservation_system.model.Faculty((int) (byte) 0, "student", "Researcher", "hi!", true);
        java.lang.String str6 = faculty5.getUserType();
        faculty5.setApproved(false);
        java.lang.String str9 = faculty5.getUserType();
        java.lang.String str10 = faculty5.getEmail();
        faculty5.setApproved(true);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Faculty" + "'", str6, "Faculty");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Faculty" + "'", str9, "Faculty");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Researcher" + "'", str10, "Researcher");
    }

    @Test
    public void test1054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1054");
        com.reservation_system.model.Researcher researcher5 = new com.reservation_system.model.Researcher(0, "student", "", "student", false);
        java.lang.String str6 = researcher5.getEmail();
        java.lang.String str7 = researcher5.getEmail();
        java.lang.String str8 = researcher5.getUserType();
        java.lang.String str9 = researcher5.getUserType();
        java.lang.String str10 = researcher5.getEmail();
        java.lang.String str11 = researcher5.getUserType();
        java.lang.String str12 = researcher5.getPassword();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Researcher" + "'", str8, "Researcher");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Researcher" + "'", str9, "Researcher");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Researcher" + "'", str11, "Researcher");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "student" + "'", str12, "student");
    }

    @Test
    public void test1055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1055");
        com.reservation_system.model.Student student5 = new com.reservation_system.model.Student((int) '#', "Faculty", "hi!", "Researcher", false);
    }

    @Test
    public void test1056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1056");
        com.reservation_system.model.Faculty faculty5 = new com.reservation_system.model.Faculty((int) (short) 10, "faculty", "", "Researcher", true);
        java.lang.String str6 = faculty5.getUserType();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Faculty" + "'", str6, "Faculty");
    }

    @Test
    public void test1057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1057");
        com.reservation_system.model.Guest guest5 = new com.reservation_system.model.Guest((-1), "Password1!", "Student", "Faculty", true);
        java.lang.String str6 = guest5.getUserType();
        boolean boolean7 = guest5.isApproved();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Guest" + "'", str6, "Guest");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test1058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1058");
        com.reservation_system.model.LabManager labManager5 = new com.reservation_system.model.LabManager((int) (short) 1, "andrew@example.com", "", "Andrew", true);
        boolean boolean6 = labManager5.isApproved();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test1059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1059");
        com.reservation_system.model.Guest guest5 = new com.reservation_system.model.Guest((int) (short) 100, "faculty", "Student", "Researcher", false);
        java.lang.String str6 = guest5.getUserType();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Guest" + "'", str6, "Guest");
    }

    @Test
    public void test1060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1060");
        com.reservation_system.model.Student student5 = new com.reservation_system.model.Student(1, "guest", "hi!", "student", false);
        java.lang.String str6 = student5.getUserType();
        java.lang.String str7 = student5.getUserType();
        java.lang.String str8 = student5.getName();
        student5.setApproved(false);
        java.lang.String str11 = student5.getUserType();
        java.lang.String str12 = student5.getUserType();
        java.lang.String str13 = student5.getUserType();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Student" + "'", str6, "Student");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Student" + "'", str7, "Student");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "guest" + "'", str8, "guest");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Student" + "'", str11, "Student");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Student" + "'", str12, "Student");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Student" + "'", str13, "Student");
    }

    @Test
    public void test1061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1061");
        com.reservation_system.model.Guest guest5 = new com.reservation_system.model.Guest(35, "andrew@example.com", "Guest", "faculty", true);
        boolean boolean6 = guest5.isApproved();
        java.lang.String str7 = guest5.getUserType();
        java.lang.String str8 = guest5.getUserType();
        java.lang.String str9 = guest5.getUserType();
        java.lang.String str10 = guest5.getName();
        java.lang.String str11 = guest5.getEmail();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Guest" + "'", str7, "Guest");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Guest" + "'", str8, "Guest");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Guest" + "'", str9, "Guest");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Guest" + "'", str11, "Guest");
    }

    @Test
    public void test1062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1062");
        com.reservation_system.model.Student student5 = new com.reservation_system.model.Student((int) (byte) 1, "Password1!", "Student", "Researcher", false);
    }

    @Test
    public void test1063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1063");
        com.reservation_system.model.HeadLabCoordinator headLabCoordinator5 = new com.reservation_system.model.HeadLabCoordinator((int) ' ', "headlabcoordinator", "Student", "Guest", false);
        java.lang.Class<?> wildcardClass6 = headLabCoordinator5.getClass();
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test1064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1064");
        com.reservation_system.model.Faculty faculty5 = new com.reservation_system.model.Faculty((int) '4', "researcher", "researcher", "Researcher", true);
        java.lang.String str6 = faculty5.getUserType();
        java.lang.String str7 = faculty5.getUserType();
        java.lang.String str8 = faculty5.getUserType();
        java.lang.String str9 = faculty5.getUserType();
        faculty5.setApproved(true);
        java.lang.String str12 = faculty5.getEmail();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Faculty" + "'", str6, "Faculty");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Faculty" + "'", str7, "Faculty");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Faculty" + "'", str8, "Faculty");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Faculty" + "'", str9, "Faculty");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "researcher" + "'", str12, "researcher");
    }

    @Test
    public void test1065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1065");
        com.reservation_system.model.Guest guest5 = new com.reservation_system.model.Guest((int) '4', "hi!", "hi!", "Student", true);
    }

    @Test
    public void test1066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1066");
        com.reservation_system.model.Researcher researcher5 = new com.reservation_system.model.Researcher(10, "Student", "Guest", "Password1!", false);
        boolean boolean6 = researcher5.isApproved();
        java.lang.String str7 = researcher5.getPassword();
        java.lang.String str8 = researcher5.getUserType();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Password1!" + "'", str7, "Password1!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Researcher" + "'", str8, "Researcher");
    }

    @Test
    public void test1067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1067");
        com.reservation_system.model.Guest guest5 = new com.reservation_system.model.Guest((int) '4', "andrew@example.com", "student", "student", false);
        java.lang.String str6 = guest5.getUserType();
        guest5.setApproved(false);
        guest5.setApproved(true);
        java.lang.String str11 = guest5.getUserType();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Guest" + "'", str6, "Guest");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Guest" + "'", str11, "Guest");
    }

    @Test
    public void test1068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1068");
        com.reservation_system.model.User user6 = com.reservation_system.patterns.factory.UserFactory.createUser("student", 0, "Faculty", "Guest", "", false);
        org.junit.Assert.assertNotNull(user6);
    }

    @Test
    public void test1069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1069");
        com.reservation_system.model.Guest guest5 = new com.reservation_system.model.Guest((int) (short) 1, "researcher", "guest", "", true);
        java.lang.String str6 = guest5.getUserType();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Guest" + "'", str6, "Guest");
    }

    @Test
    public void test1070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1070");
        com.reservation_system.model.Faculty faculty5 = new com.reservation_system.model.Faculty(32, "researcher", "labmanager", "andrew@example.com", true);
    }

    @Test
    public void test1071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1071");
        com.reservation_system.model.Faculty faculty5 = new com.reservation_system.model.Faculty((int) (byte) 100, "guest", "", "Researcher", false);
    }

    @Test
    public void test1072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1072");
        com.reservation_system.model.HeadLabCoordinator headLabCoordinator5 = new com.reservation_system.model.HeadLabCoordinator((int) '#', "researcher", "", "hi!", false);
    }

    @Test
    public void test1073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1073");
        com.reservation_system.model.HeadLabCoordinator headLabCoordinator5 = new com.reservation_system.model.HeadLabCoordinator(0, "Password1!", "Password1!", "", false);
        java.lang.String str6 = headLabCoordinator5.getName();
        headLabCoordinator5.setApproved(true);
        java.lang.String str9 = headLabCoordinator5.getUserType();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Password1!" + "'", str6, "Password1!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "headlabcoordinator" + "'", str9, "headlabcoordinator");
    }

    @Test
    public void test1074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1074");
        com.reservation_system.model.Student student5 = new com.reservation_system.model.Student(1, "student", "", "", false);
        java.lang.String str6 = student5.getPassword();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
    }

    @Test
    public void test1075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1075");
        com.reservation_system.model.HeadLabCoordinator headLabCoordinator5 = new com.reservation_system.model.HeadLabCoordinator((int) (short) -1, "faculty", "labmanager", "Andrew", true);
        java.lang.String str6 = headLabCoordinator5.getName();
        java.lang.String str7 = headLabCoordinator5.getEmail();
        int int8 = headLabCoordinator5.getID();
        int int9 = headLabCoordinator5.getID();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "faculty" + "'", str6, "faculty");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "labmanager" + "'", str7, "labmanager");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
    }

    @Test
    public void test1076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1076");
        com.reservation_system.model.User user6 = com.reservation_system.patterns.factory.UserFactory.createUser("labmanager", (int) (byte) -1, "andrew@example.com", "labmanager", "headlabcoordinator", true);
        java.lang.String str7 = user6.getEmail();
        java.lang.String str8 = user6.getEmail();
        java.lang.Class<?> wildcardClass9 = user6.getClass();
        org.junit.Assert.assertNotNull(user6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "labmanager" + "'", str7, "labmanager");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "labmanager" + "'", str8, "labmanager");
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test1077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1077");
        com.reservation_system.model.LabManager labManager5 = new com.reservation_system.model.LabManager(35, "Andrew", "", "Faculty", true);
        java.lang.String str6 = labManager5.getUserType();
        java.lang.String str7 = labManager5.getName();
        java.lang.String str8 = labManager5.getPassword();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "labmanager" + "'", str6, "labmanager");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Andrew" + "'", str7, "Andrew");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Faculty" + "'", str8, "Faculty");
    }

    @Test
    public void test1078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1078");
        com.reservation_system.model.User user6 = com.reservation_system.patterns.factory.UserFactory.createUser("Researcher", 0, "hi!", "", "Password1!", false);
        org.junit.Assert.assertNotNull(user6);
    }

    @Test
    public void test1079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1079");
        com.reservation_system.model.Faculty faculty5 = new com.reservation_system.model.Faculty((int) '4', "researcher", "researcher", "Researcher", true);
        java.lang.String str6 = faculty5.getUserType();
        java.lang.String str7 = faculty5.getName();
        java.lang.String str8 = faculty5.getName();
        boolean boolean9 = faculty5.isApproved();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Faculty" + "'", str6, "Faculty");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "researcher" + "'", str7, "researcher");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "researcher" + "'", str8, "researcher");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test1080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1080");
        com.reservation_system.model.LabManager labManager5 = new com.reservation_system.model.LabManager((int) (byte) 1, "faculty", "headlabcoordinator", "headlabcoordinator", false);
        java.lang.String str6 = labManager5.getUserType();
        boolean boolean7 = labManager5.requiresDepartmentApproval();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "labmanager" + "'", str6, "labmanager");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test1081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1081");
        com.reservation_system.model.Faculty faculty5 = new com.reservation_system.model.Faculty((int) (short) 1, "andrew@example.com", "Andrew", "labmanager", false);
        boolean boolean6 = faculty5.isApproved();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test1082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1082");
        com.reservation_system.model.Guest guest5 = new com.reservation_system.model.Guest((int) (byte) -1, "", "", "student", true);
    }

    @Test
    public void test1083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1083");
        com.reservation_system.model.Guest guest5 = new com.reservation_system.model.Guest((int) (short) 100, "student", "Faculty", "Andrew", false);
    }

    @Test
    public void test1084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1084");
        com.reservation_system.model.LabManager labManager5 = new com.reservation_system.model.LabManager((int) (short) 10, "headlabcoordinator", "Andrew", "guest", true);
        java.lang.String str6 = labManager5.getPassword();
        boolean boolean7 = labManager5.requiresDepartmentApproval();
        java.lang.String str8 = labManager5.getName();
        labManager5.setApproved(true);
        labManager5.setApproved(true);
        int int13 = labManager5.getID();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "guest" + "'", str6, "guest");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "headlabcoordinator" + "'", str8, "headlabcoordinator");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 10 + "'", int13 == 10);
    }

    @Test
    public void test1085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1085");
        com.reservation_system.model.Guest guest5 = new com.reservation_system.model.Guest((int) (short) -1, "Researcher", "researcher", "Faculty", false);
    }

    @Test
    public void test1086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1086");
        com.reservation_system.model.Researcher researcher5 = new com.reservation_system.model.Researcher(32, "hi!", "hi!", "headlabcoordinator", true);
        java.lang.String str6 = researcher5.getPassword();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "headlabcoordinator" + "'", str6, "headlabcoordinator");
    }

    @Test
    public void test1087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1087");
        com.reservation_system.model.Faculty faculty5 = new com.reservation_system.model.Faculty(10, "guest", "headlabcoordinator", "Andrew", false);
        boolean boolean6 = faculty5.requiresDepartmentApproval();
        boolean boolean7 = faculty5.requiresDepartmentApproval();
        java.lang.String str8 = faculty5.getPassword();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Andrew" + "'", str8, "Andrew");
    }

    @Test
    public void test1088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1088");
        com.reservation_system.model.HeadLabCoordinator headLabCoordinator5 = new com.reservation_system.model.HeadLabCoordinator((int) 'a', "researcher", "Password1!", "researcher", false);
        java.lang.String str6 = headLabCoordinator5.getUserType();
        boolean boolean7 = headLabCoordinator5.requiresDepartmentApproval();
        java.lang.String str8 = headLabCoordinator5.getUserType();
        boolean boolean9 = headLabCoordinator5.isApproved();
        boolean boolean10 = headLabCoordinator5.isApproved();
        java.lang.String str11 = headLabCoordinator5.getUserType();
        java.lang.String str12 = headLabCoordinator5.getUserType();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "headlabcoordinator" + "'", str6, "headlabcoordinator");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "headlabcoordinator" + "'", str8, "headlabcoordinator");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "headlabcoordinator" + "'", str11, "headlabcoordinator");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "headlabcoordinator" + "'", str12, "headlabcoordinator");
    }

    @Test
    public void test1089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1089");
        com.reservation_system.model.Student student5 = new com.reservation_system.model.Student(1, "guest", "hi!", "student", false);
        java.lang.String str6 = student5.getEmail();
        java.lang.Class<?> wildcardClass7 = student5.getClass();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test1090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1090");
        com.reservation_system.model.HeadLabCoordinator headLabCoordinator5 = new com.reservation_system.model.HeadLabCoordinator((int) (short) 0, "Andrew", "student", "hi!", true);
    }

    @Test
    public void test1091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1091");
        com.reservation_system.model.Student student5 = new com.reservation_system.model.Student(1, "", "headlabcoordinator", "andrew@example.com", false);
        int int6 = student5.getID();
        java.lang.String str7 = student5.getUserType();
        java.lang.String str8 = student5.getUserType();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Student" + "'", str7, "Student");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Student" + "'", str8, "Student");
    }

    @Test
    public void test1092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1092");
        com.reservation_system.model.Researcher researcher5 = new com.reservation_system.model.Researcher((int) (short) 100, "headlabcoordinator", "Student", "guest", true);
        java.lang.String str6 = researcher5.getUserType();
        researcher5.setApproved(true);
        java.lang.String str9 = researcher5.getEmail();
        boolean boolean10 = researcher5.isApproved();
        java.lang.Class<?> wildcardClass11 = researcher5.getClass();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Researcher" + "'", str6, "Researcher");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Student" + "'", str9, "Student");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test1093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1093");
        com.reservation_system.model.Faculty faculty5 = new com.reservation_system.model.Faculty((int) (byte) 10, "Andrew", "researcher", "faculty", false);
        java.lang.String str6 = faculty5.getUserType();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Faculty" + "'", str6, "Faculty");
    }

    @Test
    public void test1094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1094");
        com.reservation_system.model.Researcher researcher5 = new com.reservation_system.model.Researcher((int) 'a', "", "Researcher", "Faculty", true);
        java.lang.Class<?> wildcardClass6 = researcher5.getClass();
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test1095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1095");
        com.reservation_system.model.HeadLabCoordinator headLabCoordinator5 = new com.reservation_system.model.HeadLabCoordinator((int) (short) -1, "student", "headlabcoordinator", "hi!", false);
        headLabCoordinator5.setApproved(false);
    }

    @Test
    public void test1096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1096");
        com.reservation_system.model.Researcher researcher5 = new com.reservation_system.model.Researcher((int) (byte) 100, "researcher", "Student", "", true);
        java.lang.Class<?> wildcardClass6 = researcher5.getClass();
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test1097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1097");
        com.reservation_system.model.User user6 = com.reservation_system.patterns.factory.UserFactory.createUser("Guest", 100, "Password1!", "", "Password1!", true);
        org.junit.Assert.assertNotNull(user6);
    }

    @Test
    public void test1098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1098");
        com.reservation_system.model.LabManager labManager5 = new com.reservation_system.model.LabManager(1, "Faculty", "hi!", "faculty", true);
        boolean boolean6 = labManager5.requiresDepartmentApproval();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test1099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1099");
        com.reservation_system.model.Researcher researcher5 = new com.reservation_system.model.Researcher(32, "Andrew", "researcher", "labmanager", false);
        java.lang.String str6 = researcher5.getUserType();
        java.lang.Class<?> wildcardClass7 = researcher5.getClass();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Researcher" + "'", str6, "Researcher");
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test1100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1100");
        com.reservation_system.model.LabManager labManager5 = new com.reservation_system.model.LabManager((int) (short) -1, "headlabcoordinator", "faculty", "Researcher", true);
        java.lang.String str6 = labManager5.getUserType();
        java.lang.String str7 = labManager5.getName();
        java.lang.String str8 = labManager5.getName();
        java.lang.String str9 = labManager5.getPassword();
        labManager5.setApproved(false);
        java.lang.String str12 = labManager5.getPassword();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "labmanager" + "'", str6, "labmanager");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "headlabcoordinator" + "'", str7, "headlabcoordinator");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "headlabcoordinator" + "'", str8, "headlabcoordinator");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Researcher" + "'", str9, "Researcher");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Researcher" + "'", str12, "Researcher");
    }

    @Test
    public void test1101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1101");
        com.reservation_system.model.HeadLabCoordinator headLabCoordinator5 = new com.reservation_system.model.HeadLabCoordinator((int) '#', "Password1!", "Researcher", "Student", true);
        java.lang.String str6 = headLabCoordinator5.getUserType();
        headLabCoordinator5.setApproved(false);
        java.lang.String str9 = headLabCoordinator5.getUserType();
        java.lang.String str10 = headLabCoordinator5.getUserType();
        int int11 = headLabCoordinator5.getID();
        int int12 = headLabCoordinator5.getID();
        java.lang.Class<?> wildcardClass13 = headLabCoordinator5.getClass();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "headlabcoordinator" + "'", str6, "headlabcoordinator");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "headlabcoordinator" + "'", str9, "headlabcoordinator");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "headlabcoordinator" + "'", str10, "headlabcoordinator");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 35 + "'", int11 == 35);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 35 + "'", int12 == 35);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test1102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1102");
        com.reservation_system.model.Guest guest5 = new com.reservation_system.model.Guest((int) (byte) 0, "labmanager", "Student", "Andrew", true);
    }

    @Test
    public void test1103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1103");
        com.reservation_system.model.Researcher researcher5 = new com.reservation_system.model.Researcher((int) (byte) -1, "andrew@example.com", "andrew@example.com", "labmanager", false);
        java.lang.String str6 = researcher5.getUserType();
        java.lang.String str7 = researcher5.getUserType();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Researcher" + "'", str6, "Researcher");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Researcher" + "'", str7, "Researcher");
    }

    @Test
    public void test1104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1104");
        com.reservation_system.model.Researcher researcher5 = new com.reservation_system.model.Researcher((int) (byte) -1, "Guest", "researcher", "Student", true);
    }

    @Test
    public void test1105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1105");
        com.reservation_system.model.HeadLabCoordinator headLabCoordinator5 = new com.reservation_system.model.HeadLabCoordinator((int) (short) -1, "faculty", "labmanager", "Andrew", true);
        java.lang.String str6 = headLabCoordinator5.getPassword();
        java.lang.Class<?> wildcardClass7 = headLabCoordinator5.getClass();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Andrew" + "'", str6, "Andrew");
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test1106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1106");
        com.reservation_system.model.Student student5 = new com.reservation_system.model.Student(1, "student", "guest", "Researcher", false);
    }

    @Test
    public void test1107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1107");
        com.reservation_system.model.HeadLabCoordinator headLabCoordinator5 = new com.reservation_system.model.HeadLabCoordinator((int) (short) 1, "faculty", "Guest", "guest", false);
    }

    @Test
    public void test1108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1108");
        com.reservation_system.model.HeadLabCoordinator headLabCoordinator5 = new com.reservation_system.model.HeadLabCoordinator((int) '#', "Researcher", "Andrew", "Student", false);
    }

    @Test
    public void test1109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1109");
        com.reservation_system.model.Researcher researcher5 = new com.reservation_system.model.Researcher((int) '#', "labmanager", "faculty", "labmanager", false);
    }

    @Test
    public void test1110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1110");
        com.reservation_system.model.Guest guest5 = new com.reservation_system.model.Guest((int) '4', "faculty", "labmanager", "faculty", false);
        java.lang.String str6 = guest5.getUserType();
        java.lang.String str7 = guest5.getUserType();
        java.lang.String str8 = guest5.getUserType();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Guest" + "'", str6, "Guest");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Guest" + "'", str7, "Guest");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Guest" + "'", str8, "Guest");
    }

    @Test
    public void test1111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1111");
        com.reservation_system.model.HeadLabCoordinator headLabCoordinator5 = new com.reservation_system.model.HeadLabCoordinator(52, "andrew@example.com", "faculty", "andrew@example.com", true);
        java.lang.String str6 = headLabCoordinator5.getUserType();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "headlabcoordinator" + "'", str6, "headlabcoordinator");
    }

    @Test
    public void test1112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1112");
        com.reservation_system.model.Faculty faculty5 = new com.reservation_system.model.Faculty((int) ' ', "", "researcher", "", true);
        java.lang.String str6 = faculty5.getUserType();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Faculty" + "'", str6, "Faculty");
    }

    @Test
    public void test1113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1113");
        com.reservation_system.model.Student student5 = new com.reservation_system.model.Student((int) (short) 0, "", "Guest", "", false);
    }

    @Test
    public void test1114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1114");
        com.reservation_system.model.Faculty faculty5 = new com.reservation_system.model.Faculty((int) '4', "researcher", "researcher", "Researcher", true);
        java.lang.String str6 = faculty5.getUserType();
        java.lang.String str7 = faculty5.getUserType();
        faculty5.setApproved(true);
        faculty5.setApproved(false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Faculty" + "'", str6, "Faculty");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Faculty" + "'", str7, "Faculty");
    }

    @Test
    public void test1115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1115");
        com.reservation_system.model.Faculty faculty5 = new com.reservation_system.model.Faculty(52, "", "labmanager", "", false);
    }

    @Test
    public void test1116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1116");
        com.reservation_system.model.Student student5 = new com.reservation_system.model.Student(97, "Guest", "Guest", "Faculty", true);
        int int6 = student5.getID();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 97 + "'", int6 == 97);
    }

    @Test
    public void test1117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1117");
        com.reservation_system.model.User user6 = com.reservation_system.patterns.factory.UserFactory.createUser("headlabcoordinator", 0, "andrew@example.com", "Password1!", "labmanager", true);
        org.junit.Assert.assertNotNull(user6);
    }

    @Test
    public void test1118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1118");
        com.reservation_system.model.Faculty faculty5 = new com.reservation_system.model.Faculty((int) (byte) 0, "", "Researcher", "guest", false);
        java.lang.String str6 = faculty5.getUserType();
        java.lang.String str7 = faculty5.getUserType();
        java.lang.String str8 = faculty5.getUserType();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Faculty" + "'", str6, "Faculty");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Faculty" + "'", str7, "Faculty");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Faculty" + "'", str8, "Faculty");
    }

    @Test
    public void test1119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1119");
        com.reservation_system.model.Faculty faculty5 = new com.reservation_system.model.Faculty((int) '4', "researcher", "researcher", "Researcher", true);
        java.lang.String str6 = faculty5.getUserType();
        java.lang.String str7 = faculty5.getName();
        java.lang.String str8 = faculty5.getEmail();
        faculty5.setApproved(true);
        faculty5.setApproved(true);
        int int13 = faculty5.getID();
        java.lang.String str14 = faculty5.getName();
        java.lang.String str15 = faculty5.getUserType();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Faculty" + "'", str6, "Faculty");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "researcher" + "'", str7, "researcher");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "researcher" + "'", str8, "researcher");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 52 + "'", int13 == 52);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "researcher" + "'", str14, "researcher");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Faculty" + "'", str15, "Faculty");
    }

    @Test
    public void test1120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1120");
        com.reservation_system.model.Researcher researcher5 = new com.reservation_system.model.Researcher(10, "headlabcoordinator", "Researcher", "Researcher", false);
    }

    @Test
    public void test1121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1121");
        com.reservation_system.model.LabManager labManager5 = new com.reservation_system.model.LabManager(32, "Password1!", "Password1!", "Researcher", false);
        java.lang.String str6 = labManager5.getUserType();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "labmanager" + "'", str6, "labmanager");
    }

    @Test
    public void test1122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1122");
        com.reservation_system.model.Researcher researcher5 = new com.reservation_system.model.Researcher(100, "Faculty", "student", "", true);
        java.lang.String str6 = researcher5.getName();
        researcher5.setApproved(true);
        boolean boolean9 = researcher5.requiresDepartmentApproval();
        java.lang.String str10 = researcher5.getEmail();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Faculty" + "'", str6, "Faculty");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "student" + "'", str10, "student");
    }

    @Test
    public void test1123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1123");
        com.reservation_system.model.Faculty faculty5 = new com.reservation_system.model.Faculty(1, "Password1!", "", "Andrew", true);
        java.lang.String str6 = faculty5.getUserType();
        boolean boolean7 = faculty5.requiresDepartmentApproval();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Faculty" + "'", str6, "Faculty");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test1124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1124");
        com.reservation_system.model.Student student5 = new com.reservation_system.model.Student((int) (short) 10, "headlabcoordinator", "faculty", "Andrew", true);
    }

    @Test
    public void test1125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1125");
        com.reservation_system.model.Researcher researcher5 = new com.reservation_system.model.Researcher(0, "student", "", "student", false);
        java.lang.String str6 = researcher5.getName();
        java.lang.String str7 = researcher5.getName();
        java.lang.String str8 = researcher5.getPassword();
        researcher5.setApproved(false);
        researcher5.setApproved(true);
        java.lang.String str13 = researcher5.getPassword();
        java.lang.Class<?> wildcardClass14 = researcher5.getClass();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "student" + "'", str6, "student");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "student" + "'", str7, "student");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "student" + "'", str8, "student");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "student" + "'", str13, "student");
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test1126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1126");
        com.reservation_system.model.Researcher researcher5 = new com.reservation_system.model.Researcher(52, "Researcher", "Faculty", "headlabcoordinator", true);
        java.lang.String str6 = researcher5.getEmail();
        java.lang.String str7 = researcher5.getUserType();
        java.lang.String str8 = researcher5.getUserType();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Faculty" + "'", str6, "Faculty");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Researcher" + "'", str7, "Researcher");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Researcher" + "'", str8, "Researcher");
    }

    @Test
    public void test1127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1127");
        com.reservation_system.model.HeadLabCoordinator headLabCoordinator5 = new com.reservation_system.model.HeadLabCoordinator((int) (byte) 10, "Password1!", "hi!", "andrew@example.com", true);
    }

    @Test
    public void test1128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1128");
        com.reservation_system.model.Researcher researcher5 = new com.reservation_system.model.Researcher(0, "student", "", "student", false);
        java.lang.String str6 = researcher5.getEmail();
        java.lang.String str7 = researcher5.getPassword();
        java.lang.String str8 = researcher5.getName();
        int int9 = researcher5.getID();
        researcher5.setApproved(true);
        researcher5.setApproved(false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "student" + "'", str7, "student");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "student" + "'", str8, "student");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test1129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1129");
        com.reservation_system.model.HeadLabCoordinator headLabCoordinator5 = new com.reservation_system.model.HeadLabCoordinator((int) (byte) 100, "Researcher", "Guest", "Password1!", false);
        boolean boolean6 = headLabCoordinator5.requiresDepartmentApproval();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test1130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1130");
        com.reservation_system.model.Researcher researcher5 = new com.reservation_system.model.Researcher((int) (byte) 100, "hi!", "researcher", "headlabcoordinator", true);
    }

    @Test
    public void test1131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1131");
        com.reservation_system.model.Guest guest5 = new com.reservation_system.model.Guest((int) (short) 0, "labmanager", "hi!", "guest", false);
    }

    @Test
    public void test1132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1132");
        com.reservation_system.model.User user6 = com.reservation_system.patterns.factory.UserFactory.createUser("student", (int) '#', "andrew@example.com", "student", "researcher", false);
        org.junit.Assert.assertNotNull(user6);
    }

    @Test
    public void test1133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1133");
        com.reservation_system.model.Guest guest5 = new com.reservation_system.model.Guest((int) (byte) 10, "researcher", "guest", "headlabcoordinator", false);
    }

    @Test
    public void test1134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1134");
        com.reservation_system.model.User user6 = com.reservation_system.patterns.factory.UserFactory.createUser("headlabcoordinator", 0, "", "hi!", "", false);
        java.lang.String str7 = user6.getEmail();
        java.lang.String str8 = user6.getEmail();
        java.lang.String str9 = user6.getName();
        org.junit.Assert.assertNotNull(user6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test1135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1135");
        com.reservation_system.model.HeadLabCoordinator headLabCoordinator5 = new com.reservation_system.model.HeadLabCoordinator((int) (byte) 1, "researcher", "labmanager", "Researcher", true);
        java.lang.String str6 = headLabCoordinator5.getUserType();
        java.lang.String str7 = headLabCoordinator5.getPassword();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "headlabcoordinator" + "'", str6, "headlabcoordinator");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Researcher" + "'", str7, "Researcher");
    }

    @Test
    public void test1136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1136");
        com.reservation_system.model.Guest guest5 = new com.reservation_system.model.Guest(1, "", "student", "student", true);
        java.lang.String str6 = guest5.getUserType();
        java.lang.String str7 = guest5.getUserType();
        int int8 = guest5.getID();
        java.lang.String str9 = guest5.getUserType();
        guest5.setApproved(false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Guest" + "'", str6, "Guest");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Guest" + "'", str7, "Guest");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Guest" + "'", str9, "Guest");
    }

    @Test
    public void test1137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1137");
        com.reservation_system.model.Student student5 = new com.reservation_system.model.Student((-1), "hi!", "headlabcoordinator", "faculty", true);
        java.lang.Class<?> wildcardClass6 = student5.getClass();
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test1138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1138");
        com.reservation_system.model.Student student5 = new com.reservation_system.model.Student((int) (short) -1, "Guest", "", "guest", true);
        student5.setApproved(false);
    }

    @Test
    public void test1139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1139");
        com.reservation_system.model.Student student5 = new com.reservation_system.model.Student((int) 'a', "", "Guest", "", false);
    }

    @Test
    public void test1140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1140");
        com.reservation_system.model.Guest guest5 = new com.reservation_system.model.Guest((int) 'a', "", "", "hi!", true);
    }

    @Test
    public void test1141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1141");
        com.reservation_system.model.Researcher researcher5 = new com.reservation_system.model.Researcher(0, "student", "", "student", false);
        java.lang.String str6 = researcher5.getPassword();
        int int7 = researcher5.getID();
        int int8 = researcher5.getID();
        java.lang.String str9 = researcher5.getUserType();
        boolean boolean10 = researcher5.isApproved();
        java.lang.String str11 = researcher5.getUserType();
        java.lang.Class<?> wildcardClass12 = researcher5.getClass();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "student" + "'", str6, "student");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Researcher" + "'", str9, "Researcher");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Researcher" + "'", str11, "Researcher");
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test1142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1142");
        com.reservation_system.model.Student student5 = new com.reservation_system.model.Student(1, "student", "", "", false);
        java.lang.String str6 = student5.getUserType();
        java.lang.String str7 = student5.getUserType();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Student" + "'", str6, "Student");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Student" + "'", str7, "Student");
    }

    @Test
    public void test1143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1143");
        com.reservation_system.model.Guest guest5 = new com.reservation_system.model.Guest((-1), "Faculty", "", "headlabcoordinator", true);
    }

    @Test
    public void test1144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1144");
        com.reservation_system.model.LabManager labManager5 = new com.reservation_system.model.LabManager((int) '#', "student", "Password1!", "Guest", true);
        boolean boolean6 = labManager5.requiresDepartmentApproval();
        java.lang.String str7 = labManager5.getUserType();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "labmanager" + "'", str7, "labmanager");
    }

    @Test
    public void test1145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1145");
        com.reservation_system.model.Student student5 = new com.reservation_system.model.Student(32, "Student", "guest", "Password1!", true);
    }

    @Test
    public void test1146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1146");
        com.reservation_system.model.HeadLabCoordinator headLabCoordinator5 = new com.reservation_system.model.HeadLabCoordinator((int) '#', "hi!", "Password1!", "student", false);
        java.lang.String str6 = headLabCoordinator5.getUserType();
        java.lang.String str7 = headLabCoordinator5.getUserType();
        java.lang.String str8 = headLabCoordinator5.getUserType();
        headLabCoordinator5.setApproved(false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "headlabcoordinator" + "'", str6, "headlabcoordinator");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "headlabcoordinator" + "'", str7, "headlabcoordinator");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "headlabcoordinator" + "'", str8, "headlabcoordinator");
    }

    @Test
    public void test1147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1147");
        com.reservation_system.model.Guest guest5 = new com.reservation_system.model.Guest((int) '4', "andrew@example.com", "student", "faculty", true);
        java.lang.String str6 = guest5.getUserType();
        java.lang.String str7 = guest5.getName();
        int int8 = guest5.getID();
        guest5.setApproved(true);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Guest" + "'", str6, "Guest");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 52 + "'", int8 == 52);
    }

    @Test
    public void test1148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1148");
        com.reservation_system.model.User user6 = com.reservation_system.patterns.factory.UserFactory.createUser("headlabcoordinator", (int) (byte) 100, "guest", "headlabcoordinator", "headlabcoordinator", false);
        org.junit.Assert.assertNotNull(user6);
    }

    @Test
    public void test1149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1149");
        com.reservation_system.model.Guest guest5 = new com.reservation_system.model.Guest(32, "andrew@example.com", "Student", "Researcher", true);
        java.lang.String str6 = guest5.getName();
    }

    @Test
    public void test1150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1150");
        com.reservation_system.model.LabManager labManager5 = new com.reservation_system.model.LabManager((int) '#', "headlabcoordinator", "faculty", "Guest", true);
    }

    @Test
    public void test1151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1151");
        com.reservation_system.model.LabManager labManager5 = new com.reservation_system.model.LabManager((int) (short) 100, "labmanager", "researcher", "", false);
        java.lang.String str6 = labManager5.getUserType();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "labmanager" + "'", str6, "labmanager");
    }

    @Test
    public void test1152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1152");
        com.reservation_system.model.Faculty faculty5 = new com.reservation_system.model.Faculty((int) (byte) 10, "guest", "Password1!", "faculty", false);
    }

    @Test
    public void test1153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1153");
        com.reservation_system.model.Faculty faculty5 = new com.reservation_system.model.Faculty((int) '4', "researcher", "Password1!", "researcher", true);
    }

    @Test
    public void test1154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1154");
        com.reservation_system.model.Guest guest5 = new com.reservation_system.model.Guest((int) (short) 0, "Andrew", "hi!", "Password1!", false);
    }

    @Test
    public void test1155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1155");
        com.reservation_system.model.Researcher researcher5 = new com.reservation_system.model.Researcher(0, "student", "", "student", false);
        java.lang.String str6 = researcher5.getPassword();
        int int7 = researcher5.getID();
        int int8 = researcher5.getID();
        boolean boolean9 = researcher5.isApproved();
        java.lang.String str10 = researcher5.getUserType();
        int int11 = researcher5.getID();
        java.lang.String str12 = researcher5.getUserType();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "student" + "'", str6, "student");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Researcher" + "'", str10, "Researcher");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Researcher" + "'", str12, "Researcher");
    }

    @Test
    public void test1156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1156");
        com.reservation_system.model.LabManager labManager5 = new com.reservation_system.model.LabManager((int) ' ', "Student", "student", "", true);
        int int6 = labManager5.getID();
        java.lang.String str7 = labManager5.getPassword();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 32 + "'", int6 == 32);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
    }

    @Test
    public void test1157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1157");
        com.reservation_system.model.Guest guest5 = new com.reservation_system.model.Guest((int) 'a', "researcher", "guest", "guest", true);
    }

    @Test
    public void test1158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1158");
        com.reservation_system.model.Faculty faculty5 = new com.reservation_system.model.Faculty((int) (short) 1, "guest", "hi!", "", true);
        java.lang.String str6 = faculty5.getEmail();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
    }

    @Test
    public void test1159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1159");
        com.reservation_system.model.Guest guest5 = new com.reservation_system.model.Guest((int) '#', "faculty", "Guest", "researcher", false);
        guest5.setApproved(true);
        boolean boolean8 = guest5.requiresDepartmentApproval();
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test1160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1160");
        com.reservation_system.model.LabManager labManager5 = new com.reservation_system.model.LabManager(52, "hi!", "researcher", "Guest", false);
    }

    @Test
    public void test1161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1161");
        com.reservation_system.model.LabManager labManager5 = new com.reservation_system.model.LabManager((int) (short) 100, "guest", "andrew@example.com", "student", true);
        java.lang.String str6 = labManager5.getUserType();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "labmanager" + "'", str6, "labmanager");
    }

    @Test
    public void test1162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1162");
        com.reservation_system.model.Student student5 = new com.reservation_system.model.Student((int) 'a', "Faculty", "andrew@example.com", "researcher", false);
    }

    @Test
    public void test1163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1163");
        com.reservation_system.model.Faculty faculty5 = new com.reservation_system.model.Faculty((int) (short) 100, "Researcher", "researcher", "Guest", true);
        boolean boolean6 = faculty5.isApproved();
        int int7 = faculty5.getID();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 100 + "'", int7 == 100);
    }

    @Test
    public void test1164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1164");
        com.reservation_system.model.HeadLabCoordinator headLabCoordinator5 = new com.reservation_system.model.HeadLabCoordinator((-1), "Faculty", "researcher", "Password1!", true);
    }

    @Test
    public void test1165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1165");
        com.reservation_system.model.Faculty faculty5 = new com.reservation_system.model.Faculty((int) '4', "researcher", "researcher", "Researcher", true);
        java.lang.String str6 = faculty5.getUserType();
        java.lang.String str7 = faculty5.getName();
        java.lang.String str8 = faculty5.getEmail();
        faculty5.setApproved(true);
        faculty5.setApproved(true);
        int int13 = faculty5.getID();
        java.lang.String str14 = faculty5.getName();
        int int15 = faculty5.getID();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Faculty" + "'", str6, "Faculty");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "researcher" + "'", str7, "researcher");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "researcher" + "'", str8, "researcher");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 52 + "'", int13 == 52);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "researcher" + "'", str14, "researcher");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 52 + "'", int15 == 52);
    }

    @Test
    public void test1166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1166");
        com.reservation_system.model.Student student5 = new com.reservation_system.model.Student((int) 'a', "Student", "student", "headlabcoordinator", true);
        java.lang.String str6 = student5.getUserType();
        java.lang.String str7 = student5.getName();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Student" + "'", str6, "Student");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Student" + "'", str7, "Student");
    }

    @Test
    public void test1167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1167");
        com.reservation_system.model.LabManager labManager5 = new com.reservation_system.model.LabManager((int) (byte) 100, "", "Andrew", "Andrew", false);
    }

    @Test
    public void test1168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1168");
        com.reservation_system.model.Guest guest5 = new com.reservation_system.model.Guest((int) (short) 100, "Andrew", "", "Student", false);
        guest5.setApproved(false);
        java.lang.String str8 = guest5.getPassword();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Student" + "'", str8, "Student");
    }

    @Test
    public void test1169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1169");
        com.reservation_system.model.LabManager labManager5 = new com.reservation_system.model.LabManager((int) (short) 10, "headlabcoordinator", "Andrew", "guest", true);
        java.lang.String str6 = labManager5.getPassword();
        boolean boolean7 = labManager5.requiresDepartmentApproval();
        java.lang.String str8 = labManager5.getUserType();
        java.lang.String str9 = labManager5.getUserType();
        labManager5.setApproved(false);
        java.lang.String str12 = labManager5.getUserType();
        java.lang.String str13 = labManager5.getUserType();
        java.lang.Class<?> wildcardClass14 = labManager5.getClass();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "guest" + "'", str6, "guest");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "labmanager" + "'", str8, "labmanager");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "labmanager" + "'", str9, "labmanager");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "labmanager" + "'", str12, "labmanager");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "labmanager" + "'", str13, "labmanager");
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test1170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1170");
        com.reservation_system.model.Faculty faculty5 = new com.reservation_system.model.Faculty((int) ' ', "Researcher", "Password1!", "Student", true);
        java.lang.String str6 = faculty5.getUserType();
        java.lang.String str7 = faculty5.getUserType();
        java.lang.String str8 = faculty5.getUserType();
        faculty5.setApproved(false);
        java.lang.String str11 = faculty5.getUserType();
        int int12 = faculty5.getID();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Faculty" + "'", str6, "Faculty");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Faculty" + "'", str7, "Faculty");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Faculty" + "'", str8, "Faculty");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Faculty" + "'", str11, "Faculty");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 32 + "'", int12 == 32);
    }

    @Test
    public void test1171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1171");
        com.reservation_system.model.User user6 = com.reservation_system.patterns.factory.UserFactory.createUser("Student", 52, "headlabcoordinator", "Password1!", "", true);
        user6.setApproved(false);
        user6.setApproved(false);
        org.junit.Assert.assertNotNull(user6);
    }

    @Test
    public void test1172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1172");
        com.reservation_system.model.Student student5 = new com.reservation_system.model.Student(97, "andrew@example.com", "andrew@example.com", "Faculty", true);
        java.lang.String str6 = student5.getUserType();
        student5.setApproved(true);
        student5.setApproved(false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Student" + "'", str6, "Student");
    }

    @Test
    public void test1173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1173");
        com.reservation_system.model.Guest guest5 = new com.reservation_system.model.Guest((int) (short) 100, "Andrew", "", "Student", false);
        guest5.setApproved(false);
        java.lang.Class<?> wildcardClass8 = guest5.getClass();
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test1174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1174");
        com.reservation_system.model.Student student5 = new com.reservation_system.model.Student((int) (short) 10, "guest", "labmanager", "", false);
        java.lang.String str6 = student5.getEmail();
        java.lang.String str7 = student5.getPassword();
        java.lang.String str8 = student5.getUserType();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "labmanager" + "'", str6, "labmanager");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Student" + "'", str8, "Student");
    }

    @Test
    public void test1175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1175");
        com.reservation_system.model.Researcher researcher5 = new com.reservation_system.model.Researcher(0, "student", "", "student", false);
        java.lang.String str6 = researcher5.getEmail();
        java.lang.String str7 = researcher5.getEmail();
        java.lang.String str8 = researcher5.getName();
        java.lang.Class<?> wildcardClass9 = researcher5.getClass();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "student" + "'", str8, "student");
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test1176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1176");
        com.reservation_system.model.Guest guest5 = new com.reservation_system.model.Guest((int) '4', "andrew@example.com", "student", "student", false);
        guest5.setApproved(false);
        java.lang.String str8 = guest5.getUserType();
        boolean boolean9 = guest5.requiresDepartmentApproval();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Guest" + "'", str8, "Guest");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test1177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1177");
        com.reservation_system.model.Faculty faculty5 = new com.reservation_system.model.Faculty((int) (byte) -1, "", "hi!", "Password1!", true);
    }

    @Test
    public void test1178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1178");
        com.reservation_system.model.HeadLabCoordinator headLabCoordinator5 = new com.reservation_system.model.HeadLabCoordinator((int) '#', "Faculty", "student", "Andrew", false);
        java.lang.String str6 = headLabCoordinator5.getName();
        java.lang.String str7 = headLabCoordinator5.getUserType();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Faculty" + "'", str6, "Faculty");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "headlabcoordinator" + "'", str7, "headlabcoordinator");
    }

    @Test
    public void test1179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1179");
        com.reservation_system.model.LabManager labManager5 = new com.reservation_system.model.LabManager((int) '#', "faculty", "", "guest", true);
    }

    @Test
    public void test1180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1180");
        com.reservation_system.model.Faculty faculty5 = new com.reservation_system.model.Faculty((int) '#', "guest", "student", "Researcher", false);
        java.lang.String str6 = faculty5.getEmail();
        java.lang.String str7 = faculty5.getUserType();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "student" + "'", str6, "student");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Faculty" + "'", str7, "Faculty");
    }

    @Test
    public void test1181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1181");
        // The following exception was thrown during execution in test generation
        try {
            com.reservation_system.model.User user6 = com.reservation_system.patterns.factory.UserFactory.createUser("Andrew", (int) ' ', "hi!", "Faculty", "Faculty", true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid user type: Andrew");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1182");
        com.reservation_system.model.Guest guest5 = new com.reservation_system.model.Guest((int) (byte) 1, "Researcher", "andrew@example.com", "student", false);
        int int6 = guest5.getID();
        guest5.setApproved(false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
    }

    @Test
    public void test1183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1183");
        com.reservation_system.model.Guest guest5 = new com.reservation_system.model.Guest(100, "andrew@example.com", "", "Student", false);
        java.lang.String str6 = guest5.getName();
    }

    @Test
    public void test1184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1184");
        com.reservation_system.model.HeadLabCoordinator headLabCoordinator5 = new com.reservation_system.model.HeadLabCoordinator((int) 'a', "researcher", "Password1!", "researcher", false);
        int int6 = headLabCoordinator5.getID();
        java.lang.String str7 = headLabCoordinator5.getUserType();
        java.lang.String str8 = headLabCoordinator5.getUserType();
        java.lang.String str9 = headLabCoordinator5.getEmail();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 97 + "'", int6 == 97);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "headlabcoordinator" + "'", str7, "headlabcoordinator");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "headlabcoordinator" + "'", str8, "headlabcoordinator");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Password1!" + "'", str9, "Password1!");
    }

    @Test
    public void test1185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1185");
        com.reservation_system.model.Student student5 = new com.reservation_system.model.Student(1, "student", "", "", false);
        java.lang.String str6 = student5.getName();
        java.lang.String str7 = student5.getEmail();
        java.lang.String str8 = student5.getUserType();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "student" + "'", str6, "student");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Student" + "'", str8, "Student");
    }

    @Test
    public void test1186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1186");
        com.reservation_system.model.User user6 = com.reservation_system.patterns.factory.UserFactory.createUser("Researcher", (int) (byte) -1, "student", "Guest", "Password1!", true);
        user6.setApproved(true);
        org.junit.Assert.assertNotNull(user6);
    }

    @Test
    public void test1187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1187");
        com.reservation_system.model.Researcher researcher5 = new com.reservation_system.model.Researcher(97, "Student", "Faculty", "Guest", true);
        java.lang.String str6 = researcher5.getEmail();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Faculty" + "'", str6, "Faculty");
    }

    @Test
    public void test1188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1188");
        com.reservation_system.model.User user6 = com.reservation_system.patterns.factory.UserFactory.createUser("Student", 32, "", "", "", false);
        java.lang.Class<?> wildcardClass7 = user6.getClass();
        org.junit.Assert.assertNotNull(user6);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test1189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1189");
        com.reservation_system.model.Researcher researcher5 = new com.reservation_system.model.Researcher(0, "Faculty", "guest", "hi!", false);
    }

    @Test
    public void test1190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1190");
        com.reservation_system.model.Researcher researcher5 = new com.reservation_system.model.Researcher((int) ' ', "Researcher", "student", "", true);
        java.lang.String str6 = researcher5.getUserType();
        java.lang.Class<?> wildcardClass7 = researcher5.getClass();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Researcher" + "'", str6, "Researcher");
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test1191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1191");
        com.reservation_system.model.Researcher researcher5 = new com.reservation_system.model.Researcher(0, "student", "", "student", false);
        java.lang.String str6 = researcher5.getUserType();
        boolean boolean7 = researcher5.requiresDepartmentApproval();
        java.lang.String str8 = researcher5.getUserType();
        java.lang.String str9 = researcher5.getUserType();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Researcher" + "'", str6, "Researcher");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Researcher" + "'", str8, "Researcher");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Researcher" + "'", str9, "Researcher");
    }

    @Test
    public void test1192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1192");
        com.reservation_system.model.LabManager labManager5 = new com.reservation_system.model.LabManager((int) '4', "", "labmanager", "andrew@example.com", true);
        java.lang.String str6 = labManager5.getPassword();
        int int7 = labManager5.getID();
        int int8 = labManager5.getID();
        java.lang.String str9 = labManager5.getUserType();
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 52 + "'", int7 == 52);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 52 + "'", int8 == 52);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "labmanager" + "'", str9, "labmanager");
    }

    @Test
    public void test1193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1193");
        com.reservation_system.model.Student student5 = new com.reservation_system.model.Student(0, "student", "guest", "hi!", false);
        java.lang.String str6 = student5.getEmail();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "guest" + "'", str6, "guest");
    }

    @Test
    public void test1194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1194");
        com.reservation_system.model.Faculty faculty5 = new com.reservation_system.model.Faculty((int) (byte) 100, "guest", "Andrew", "Faculty", true);
    }

    @Test
    public void test1195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1195");
        com.reservation_system.model.Student student5 = new com.reservation_system.model.Student(1, "Researcher", "Researcher", "hi!", false);
    }

    @Test
    public void test1196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1196");
        com.reservation_system.model.HeadLabCoordinator headLabCoordinator5 = new com.reservation_system.model.HeadLabCoordinator((int) '#', "", "Password1!", "guest", false);
    }

    @Test
    public void test1197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1197");
        com.reservation_system.model.HeadLabCoordinator headLabCoordinator5 = new com.reservation_system.model.HeadLabCoordinator(10, "Guest", "Student", "headlabcoordinator", true);
        java.lang.Class<?> wildcardClass6 = headLabCoordinator5.getClass();
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test1198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1198");
        com.reservation_system.model.HeadLabCoordinator headLabCoordinator5 = new com.reservation_system.model.HeadLabCoordinator((int) 'a', "researcher", "Password1!", "researcher", false);
        java.lang.String str6 = headLabCoordinator5.getUserType();
        boolean boolean7 = headLabCoordinator5.requiresDepartmentApproval();
        java.lang.String str8 = headLabCoordinator5.getUserType();
        boolean boolean9 = headLabCoordinator5.requiresDepartmentApproval();
        java.lang.Class<?> wildcardClass10 = headLabCoordinator5.getClass();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "headlabcoordinator" + "'", str6, "headlabcoordinator");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "headlabcoordinator" + "'", str8, "headlabcoordinator");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test1199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1199");
        com.reservation_system.model.LabManager labManager5 = new com.reservation_system.model.LabManager((int) (short) 10, "", "Password1!", "guest", false);
        java.lang.Class<?> wildcardClass6 = labManager5.getClass();
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test1200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1200");
        com.reservation_system.model.Faculty faculty5 = new com.reservation_system.model.Faculty((int) '#', "Guest", "student", "Guest", false);
        boolean boolean6 = faculty5.requiresDepartmentApproval();
        int int7 = faculty5.getID();
        boolean boolean8 = faculty5.isApproved();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 35 + "'", int7 == 35);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test1201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1201");
        com.reservation_system.model.Faculty faculty5 = new com.reservation_system.model.Faculty((int) 'a', "Faculty", "labmanager", "Student", false);
    }

    @Test
    public void test1202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1202");
        com.reservation_system.model.Guest guest5 = new com.reservation_system.model.Guest((int) (short) 100, "Andrew", "", "Student", false);
        java.lang.String str6 = guest5.getPassword();
        boolean boolean7 = guest5.requiresDepartmentApproval();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Student" + "'", str6, "Student");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test1203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1203");
        com.reservation_system.model.HeadLabCoordinator headLabCoordinator5 = new com.reservation_system.model.HeadLabCoordinator(0, "labmanager", "Andrew", "", true);
        int int6 = headLabCoordinator5.getID();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test1204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1204");
        com.reservation_system.model.Student student5 = new com.reservation_system.model.Student(100, "Andrew", "", "Faculty", true);
        java.lang.Class<?> wildcardClass6 = student5.getClass();
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test1205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1205");
        com.reservation_system.model.Researcher researcher5 = new com.reservation_system.model.Researcher((int) (short) 0, "Password1!", "Faculty", "headlabcoordinator", false);
    }

    @Test
    public void test1206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1206");
        com.reservation_system.model.Researcher researcher5 = new com.reservation_system.model.Researcher((int) ' ', "faculty", "faculty", "Student", true);
        java.lang.String str6 = researcher5.getName();
        java.lang.Class<?> wildcardClass7 = researcher5.getClass();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "faculty" + "'", str6, "faculty");
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test1207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1207");
        com.reservation_system.model.Student student5 = new com.reservation_system.model.Student((int) (short) 1, "student", "Student", "headlabcoordinator", false);
        java.lang.String str6 = student5.getName();
        java.lang.String str7 = student5.getPassword();
        java.lang.String str8 = student5.getPassword();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "student" + "'", str6, "student");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "headlabcoordinator" + "'", str7, "headlabcoordinator");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "headlabcoordinator" + "'", str8, "headlabcoordinator");
    }

    @Test
    public void test1208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1208");
        com.reservation_system.model.Faculty faculty5 = new com.reservation_system.model.Faculty((int) '4', "researcher", "researcher", "Researcher", true);
        java.lang.String str6 = faculty5.getUserType();
        java.lang.String str7 = faculty5.getUserType();
        java.lang.String str8 = faculty5.getUserType();
        int int9 = faculty5.getID();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Faculty" + "'", str6, "Faculty");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Faculty" + "'", str7, "Faculty");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Faculty" + "'", str8, "Faculty");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 52 + "'", int9 == 52);
    }

    @Test
    public void test1209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1209");
        com.reservation_system.model.HeadLabCoordinator headLabCoordinator5 = new com.reservation_system.model.HeadLabCoordinator(52, "Password1!", "Password1!", "", false);
        java.lang.String str6 = headLabCoordinator5.getUserType();
        boolean boolean7 = headLabCoordinator5.requiresDepartmentApproval();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "headlabcoordinator" + "'", str6, "headlabcoordinator");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test1210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1210");
        // The following exception was thrown during execution in test generation
        try {
            com.reservation_system.model.User user6 = com.reservation_system.patterns.factory.UserFactory.createUser("", (int) (short) 10, "student", "hi!", "faculty", false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid user type: ");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1211");
        com.reservation_system.model.User user6 = com.reservation_system.patterns.factory.UserFactory.createUser("Researcher", 100, "Guest", "Guest", "Guest", false);
        java.lang.String str7 = user6.getName();
        org.junit.Assert.assertNotNull(user6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Guest" + "'", str7, "Guest");
    }

    @Test
    public void test1212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1212");
        com.reservation_system.model.Guest guest5 = new com.reservation_system.model.Guest((int) '4', "andrew@example.com", "student", "faculty", true);
        boolean boolean6 = guest5.isApproved();
        boolean boolean7 = guest5.isApproved();
        java.lang.String str8 = guest5.getName();
        java.lang.String str9 = guest5.getUserType();
        java.lang.String str10 = guest5.getUserType();
        java.lang.String str11 = guest5.getUserType();
        boolean boolean12 = guest5.isApproved();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Guest" + "'", str9, "Guest");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Guest" + "'", str10, "Guest");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Guest" + "'", str11, "Guest");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test1213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1213");
        com.reservation_system.model.LabManager labManager5 = new com.reservation_system.model.LabManager(35, "faculty", "student", "labmanager", false);
        java.lang.String str6 = labManager5.getPassword();
        java.lang.Class<?> wildcardClass7 = labManager5.getClass();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "labmanager" + "'", str6, "labmanager");
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test1214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1214");
        com.reservation_system.model.HeadLabCoordinator headLabCoordinator5 = new com.reservation_system.model.HeadLabCoordinator(0, "faculty", "Researcher", "andrew@example.com", true);
    }

    @Test
    public void test1215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1215");
        com.reservation_system.model.HeadLabCoordinator headLabCoordinator5 = new com.reservation_system.model.HeadLabCoordinator((-1), "headlabcoordinator", "andrew@example.com", "Student", true);
    }

    @Test
    public void test1216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1216");
        com.reservation_system.model.LabManager labManager5 = new com.reservation_system.model.LabManager((int) (short) 10, "headlabcoordinator", "Andrew", "guest", true);
        java.lang.String str6 = labManager5.getPassword();
        java.lang.String str7 = labManager5.getUserType();
        java.lang.String str8 = labManager5.getUserType();
        java.lang.String str9 = labManager5.getUserType();
        java.lang.String str10 = labManager5.getUserType();
        int int11 = labManager5.getID();
        labManager5.setApproved(false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "guest" + "'", str6, "guest");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "labmanager" + "'", str7, "labmanager");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "labmanager" + "'", str8, "labmanager");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "labmanager" + "'", str9, "labmanager");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "labmanager" + "'", str10, "labmanager");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 10 + "'", int11 == 10);
    }

    @Test
    public void test1217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1217");
        com.reservation_system.model.Researcher researcher5 = new com.reservation_system.model.Researcher((int) '#', "Student", "headlabcoordinator", "faculty", false);
        java.lang.Class<?> wildcardClass6 = researcher5.getClass();
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test1218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1218");
        com.reservation_system.model.Faculty faculty5 = new com.reservation_system.model.Faculty((int) 'a', "headlabcoordinator", "", "Researcher", true);
        java.lang.String str6 = faculty5.getEmail();
        java.lang.String str7 = faculty5.getEmail();
        java.lang.String str8 = faculty5.getPassword();
        faculty5.setApproved(false);
        java.lang.String str11 = faculty5.getUserType();
        java.lang.String str12 = faculty5.getPassword();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Researcher" + "'", str8, "Researcher");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Faculty" + "'", str11, "Faculty");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Researcher" + "'", str12, "Researcher");
    }

    @Test
    public void test1219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1219");
        com.reservation_system.model.HeadLabCoordinator headLabCoordinator5 = new com.reservation_system.model.HeadLabCoordinator((int) 'a', "labmanager", "", "researcher", true);
        java.lang.String str6 = headLabCoordinator5.getUserType();
        java.lang.String str7 = headLabCoordinator5.getUserType();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "headlabcoordinator" + "'", str6, "headlabcoordinator");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "headlabcoordinator" + "'", str7, "headlabcoordinator");
    }

    @Test
    public void test1220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1220");
        com.reservation_system.model.Researcher researcher5 = new com.reservation_system.model.Researcher(0, "student", "", "student", false);
        java.lang.String str6 = researcher5.getPassword();
        int int7 = researcher5.getID();
        boolean boolean8 = researcher5.isApproved();
        boolean boolean9 = researcher5.requiresDepartmentApproval();
        java.lang.String str10 = researcher5.getEmail();
        researcher5.setApproved(false);
        java.lang.String str13 = researcher5.getUserType();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "student" + "'", str6, "student");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Researcher" + "'", str13, "Researcher");
    }

    @Test
    public void test1221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1221");
        com.reservation_system.model.Guest guest5 = new com.reservation_system.model.Guest((int) (short) -1, "Guest", "andrew@example.com", "Faculty", true);
        java.lang.String str6 = guest5.getUserType();
        boolean boolean7 = guest5.isApproved();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Guest" + "'", str6, "Guest");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test1222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1222");
        com.reservation_system.model.LabManager labManager5 = new com.reservation_system.model.LabManager((int) (short) -1, "", "Researcher", "faculty", false);
    }

    @Test
    public void test1223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1223");
        com.reservation_system.model.HeadLabCoordinator headLabCoordinator5 = new com.reservation_system.model.HeadLabCoordinator((int) (byte) 100, "", "labmanager", "andrew@example.com", false);
        java.lang.String str6 = headLabCoordinator5.getUserType();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "headlabcoordinator" + "'", str6, "headlabcoordinator");
    }

    @Test
    public void test1224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1224");
        com.reservation_system.model.LabManager labManager5 = new com.reservation_system.model.LabManager(100, "Faculty", "", "labmanager", false);
    }

    @Test
    public void test1225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1225");
        com.reservation_system.model.LabManager labManager5 = new com.reservation_system.model.LabManager((int) (short) 10, "headlabcoordinator", "Andrew", "guest", true);
        java.lang.String str6 = labManager5.getPassword();
        java.lang.String str7 = labManager5.getUserType();
        java.lang.String str8 = labManager5.getUserType();
        java.lang.String str9 = labManager5.getUserType();
        java.lang.String str10 = labManager5.getName();
        boolean boolean11 = labManager5.requiresDepartmentApproval();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "guest" + "'", str6, "guest");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "labmanager" + "'", str7, "labmanager");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "labmanager" + "'", str8, "labmanager");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "labmanager" + "'", str9, "labmanager");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "headlabcoordinator" + "'", str10, "headlabcoordinator");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test1226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1226");
        com.reservation_system.model.HeadLabCoordinator headLabCoordinator5 = new com.reservation_system.model.HeadLabCoordinator((int) (short) 1, "Andrew", "guest", "student", true);
    }

    @Test
    public void test1227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1227");
        com.reservation_system.model.LabManager labManager5 = new com.reservation_system.model.LabManager((-1), "headlabcoordinator", "guest", "Guest", true);
        java.lang.String str6 = labManager5.getUserType();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "labmanager" + "'", str6, "labmanager");
    }

    @Test
    public void test1228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1228");
        // The following exception was thrown during execution in test generation
        try {
            com.reservation_system.model.User user6 = com.reservation_system.patterns.factory.UserFactory.createUser("andrew@example.com", (int) (byte) 1, "", "Guest", "hi!", false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid user type: andrew@example.com");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1229");
        com.reservation_system.model.Researcher researcher5 = new com.reservation_system.model.Researcher(0, "faculty", "", "labmanager", false);
        int int6 = researcher5.getID();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test1230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1230");
        com.reservation_system.model.User user6 = com.reservation_system.patterns.factory.UserFactory.createUser("Researcher", (int) '#', "labmanager", "labmanager", "Andrew", true);
        int int7 = user6.getID();
        org.junit.Assert.assertNotNull(user6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 35 + "'", int7 == 35);
    }

    @Test
    public void test1231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1231");
        com.reservation_system.model.Student student5 = new com.reservation_system.model.Student((int) (short) 100, "Guest", "Password1!", "headlabcoordinator", false);
        java.lang.String str6 = student5.getEmail();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Password1!" + "'", str6, "Password1!");
    }

    @Test
    public void test1232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1232");
        com.reservation_system.model.Guest guest5 = new com.reservation_system.model.Guest(52, "researcher", "", "guest", false);
    }

    @Test
    public void test1233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1233");
        com.reservation_system.model.Student student5 = new com.reservation_system.model.Student(1, "guest", "hi!", "student", false);
        java.lang.String str6 = student5.getUserType();
        java.lang.String str7 = student5.getUserType();
        java.lang.String str8 = student5.getUserType();
        java.lang.String str9 = student5.getUserType();
        boolean boolean10 = student5.requiresDepartmentApproval();
        java.lang.String str11 = student5.getUserType();
        boolean boolean12 = student5.requiresDepartmentApproval();
        java.lang.String str13 = student5.getEmail();
        java.lang.String str14 = student5.getName();
        java.lang.String str15 = student5.getUserType();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Student" + "'", str6, "Student");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Student" + "'", str7, "Student");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Student" + "'", str8, "Student");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Student" + "'", str9, "Student");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Student" + "'", str11, "Student");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "guest" + "'", str14, "guest");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Student" + "'", str15, "Student");
    }

    @Test
    public void test1234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1234");
        com.reservation_system.model.Guest guest5 = new com.reservation_system.model.Guest(0, "Faculty", "researcher", "Andrew", false);
    }

    @Test
    public void test1235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1235");
        com.reservation_system.model.Student student5 = new com.reservation_system.model.Student(1, "", "headlabcoordinator", "andrew@example.com", false);
        int int6 = student5.getID();
        java.lang.String str7 = student5.getEmail();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "headlabcoordinator" + "'", str7, "headlabcoordinator");
    }

    @Test
    public void test1236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1236");
        com.reservation_system.model.Guest guest5 = new com.reservation_system.model.Guest((int) '#', "labmanager", "Faculty", "headlabcoordinator", false);
        guest5.setApproved(true);
        java.lang.String str8 = guest5.getUserType();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Guest" + "'", str8, "Guest");
    }

    @Test
    public void test1237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1237");
        com.reservation_system.model.Faculty faculty5 = new com.reservation_system.model.Faculty(10, "hi!", "Faculty", "Andrew", false);
        java.lang.Class<?> wildcardClass6 = faculty5.getClass();
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test1238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1238");
        com.reservation_system.model.LabManager labManager5 = new com.reservation_system.model.LabManager((int) (byte) 10, "Faculty", "headlabcoordinator", "Guest", true);
        java.lang.String str6 = labManager5.getUserType();
        java.lang.String str7 = labManager5.getUserType();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "labmanager" + "'", str6, "labmanager");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "labmanager" + "'", str7, "labmanager");
    }

    @Test
    public void test1239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1239");
        com.reservation_system.model.Guest guest5 = new com.reservation_system.model.Guest((int) ' ', "student", "Andrew", "student", true);
        java.lang.String str6 = guest5.getName();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "student" + "'", str6, "student");
    }

    @Test
    public void test1240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1240");
        com.reservation_system.model.Student student5 = new com.reservation_system.model.Student((int) (short) 1, "student", "Student", "headlabcoordinator", false);
        java.lang.String str6 = student5.getName();
        java.lang.String str7 = student5.getEmail();
        java.lang.String str8 = student5.getUserType();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "student" + "'", str6, "student");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Student" + "'", str7, "Student");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Student" + "'", str8, "Student");
    }

    @Test
    public void test1241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1241");
        com.reservation_system.model.Student student5 = new com.reservation_system.model.Student(1, "guest", "hi!", "student", false);
        java.lang.String str6 = student5.getUserType();
        java.lang.String str7 = student5.getUserType();
        java.lang.String str8 = student5.getName();
        java.lang.String str9 = student5.getUserType();
        java.lang.Class<?> wildcardClass10 = student5.getClass();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Student" + "'", str6, "Student");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Student" + "'", str7, "Student");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "guest" + "'", str8, "guest");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Student" + "'", str9, "Student");
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test1242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1242");
        com.reservation_system.model.Guest guest5 = new com.reservation_system.model.Guest((int) '4', "andrew@example.com", "student", "faculty", true);
        boolean boolean6 = guest5.isApproved();
        boolean boolean7 = guest5.isApproved();
        java.lang.String str8 = guest5.getName();
        java.lang.String str9 = guest5.getUserType();
        java.lang.String str10 = guest5.getName();
        java.lang.String str11 = guest5.getUserType();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Guest" + "'", str9, "Guest");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Guest" + "'", str11, "Guest");
    }

    @Test
    public void test1243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1243");
        com.reservation_system.model.Student student5 = new com.reservation_system.model.Student((int) (byte) 1, "faculty", "Guest", "faculty", true);
        java.lang.String str6 = student5.getPassword();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "faculty" + "'", str6, "faculty");
    }

    @Test
    public void test1244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1244");
        com.reservation_system.model.Researcher researcher5 = new com.reservation_system.model.Researcher(0, "student", "", "student", false);
        java.lang.String str6 = researcher5.getEmail();
        java.lang.String str7 = researcher5.getEmail();
        java.lang.String str8 = researcher5.getUserType();
        java.lang.String str9 = researcher5.getUserType();
        java.lang.String str10 = researcher5.getUserType();
        java.lang.String str11 = researcher5.getName();
        java.lang.String str12 = researcher5.getUserType();
        java.lang.String str13 = researcher5.getPassword();
        java.lang.String str14 = researcher5.getUserType();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Researcher" + "'", str8, "Researcher");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Researcher" + "'", str9, "Researcher");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Researcher" + "'", str10, "Researcher");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "student" + "'", str11, "student");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Researcher" + "'", str12, "Researcher");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "student" + "'", str13, "student");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Researcher" + "'", str14, "Researcher");
    }

    @Test
    public void test1245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1245");
        com.reservation_system.model.LabManager labManager5 = new com.reservation_system.model.LabManager(100, "Guest", "labmanager", "labmanager", true);
        java.lang.String str6 = labManager5.getUserType();
        java.lang.String str7 = labManager5.getUserType();
        java.lang.String str8 = labManager5.getUserType();
        java.lang.String str9 = labManager5.getUserType();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "labmanager" + "'", str6, "labmanager");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "labmanager" + "'", str7, "labmanager");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "labmanager" + "'", str8, "labmanager");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "labmanager" + "'", str9, "labmanager");
    }

    @Test
    public void test1246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1246");
        com.reservation_system.model.Researcher researcher5 = new com.reservation_system.model.Researcher(35, "Faculty", "student", "headlabcoordinator", true);
        java.lang.String str6 = researcher5.getUserType();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Researcher" + "'", str6, "Researcher");
    }

    @Test
    public void test1247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1247");
        // The following exception was thrown during execution in test generation
        try {
            com.reservation_system.model.User user6 = com.reservation_system.patterns.factory.UserFactory.createUser("Andrew", (int) (byte) 0, "Andrew", "hi!", "Researcher", false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid user type: Andrew");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1248");
        // The following exception was thrown during execution in test generation
        try {
            com.reservation_system.model.User user6 = com.reservation_system.patterns.factory.UserFactory.createUser("hi!", (-1), "", "Password1!", "Guest", false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid user type: hi!");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1249");
        com.reservation_system.model.Student student5 = new com.reservation_system.model.Student(1, "guest", "hi!", "student", false);
        java.lang.String str6 = student5.getUserType();
        java.lang.String str7 = student5.getUserType();
        boolean boolean8 = student5.isApproved();
        int int9 = student5.getID();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Student" + "'", str6, "Student");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Student" + "'", str7, "Student");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
    }

    @Test
    public void test1250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1250");
        com.reservation_system.model.HeadLabCoordinator headLabCoordinator5 = new com.reservation_system.model.HeadLabCoordinator((int) (byte) -1, "Guest", "researcher", "headlabcoordinator", false);
    }

    @Test
    public void test1251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1251");
        com.reservation_system.model.LabManager labManager5 = new com.reservation_system.model.LabManager((int) (byte) 100, "labmanager", "faculty", "hi!", true);
        java.lang.String str6 = labManager5.getUserType();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "labmanager" + "'", str6, "labmanager");
    }

    @Test
    public void test1252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1252");
        com.reservation_system.model.Faculty faculty5 = new com.reservation_system.model.Faculty((int) (byte) 100, "Password1!", "", "", false);
    }

    @Test
    public void test1253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1253");
        com.reservation_system.model.Student student5 = new com.reservation_system.model.Student(0, "Guest", "", "", false);
        java.lang.String str6 = student5.getUserType();
        student5.setApproved(true);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Student" + "'", str6, "Student");
    }

    @Test
    public void test1254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1254");
        com.reservation_system.model.Faculty faculty5 = new com.reservation_system.model.Faculty(0, "hi!", "researcher", "researcher", false);
        java.lang.String str6 = faculty5.getUserType();
        java.lang.String str7 = faculty5.getUserType();
        int int8 = faculty5.getID();
        java.lang.String str9 = faculty5.getName();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Faculty" + "'", str6, "Faculty");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Faculty" + "'", str7, "Faculty");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
    }

    @Test
    public void test1255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1255");
        com.reservation_system.model.LabManager labManager5 = new com.reservation_system.model.LabManager(100, "Guest", "labmanager", "labmanager", true);
        boolean boolean6 = labManager5.isApproved();
        java.lang.String str7 = labManager5.getPassword();
        java.lang.String str8 = labManager5.getEmail();
        java.lang.String str9 = labManager5.getUserType();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "labmanager" + "'", str7, "labmanager");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "labmanager" + "'", str8, "labmanager");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "labmanager" + "'", str9, "labmanager");
    }

    @Test
    public void test1256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1256");
        com.reservation_system.model.Researcher researcher5 = new com.reservation_system.model.Researcher(100, "faculty", "student", "Researcher", true);
        java.lang.String str6 = researcher5.getEmail();
        java.lang.String str7 = researcher5.getUserType();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "student" + "'", str6, "student");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Researcher" + "'", str7, "Researcher");
    }

    @Test
    public void test1257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1257");
        com.reservation_system.model.HeadLabCoordinator headLabCoordinator5 = new com.reservation_system.model.HeadLabCoordinator((-1), "headlabcoordinator", "headlabcoordinator", "researcher", true);
        java.lang.String str6 = headLabCoordinator5.getUserType();
        java.lang.String str7 = headLabCoordinator5.getUserType();
        java.lang.String str8 = headLabCoordinator5.getUserType();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "headlabcoordinator" + "'", str6, "headlabcoordinator");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "headlabcoordinator" + "'", str7, "headlabcoordinator");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "headlabcoordinator" + "'", str8, "headlabcoordinator");
    }

    @Test
    public void test1258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1258");
        com.reservation_system.model.Faculty faculty5 = new com.reservation_system.model.Faculty((int) (short) 1, "guest", "hi!", "", true);
        java.lang.Class<?> wildcardClass6 = faculty5.getClass();
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test1259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1259");
        com.reservation_system.model.User user6 = com.reservation_system.patterns.factory.UserFactory.createUser("labmanager", 1, "Password1!", "Password1!", "Guest", true);
        org.junit.Assert.assertNotNull(user6);
    }

    @Test
    public void test1260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1260");
        com.reservation_system.model.HeadLabCoordinator headLabCoordinator5 = new com.reservation_system.model.HeadLabCoordinator((int) (short) -1, "faculty", "labmanager", "Andrew", true);
        java.lang.String str6 = headLabCoordinator5.getPassword();
        java.lang.String str7 = headLabCoordinator5.getEmail();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Andrew" + "'", str6, "Andrew");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "labmanager" + "'", str7, "labmanager");
    }

    @Test
    public void test1261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1261");
        com.reservation_system.model.Guest guest5 = new com.reservation_system.model.Guest((int) (short) 0, "student", "guest", "guest", false);
    }

    @Test
    public void test1262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1262");
        com.reservation_system.model.LabManager labManager5 = new com.reservation_system.model.LabManager(10, "", "Andrew", "Researcher", true);
        java.lang.String str6 = labManager5.getUserType();
        java.lang.String str7 = labManager5.getUserType();
        java.lang.String str8 = labManager5.getUserType();
        boolean boolean9 = labManager5.isApproved();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "labmanager" + "'", str6, "labmanager");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "labmanager" + "'", str7, "labmanager");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "labmanager" + "'", str8, "labmanager");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test1263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1263");
        com.reservation_system.model.Student student5 = new com.reservation_system.model.Student((int) (short) 1, "student", "Student", "headlabcoordinator", false);
        java.lang.String str6 = student5.getName();
        java.lang.String str7 = student5.getUserType();
        java.lang.String str8 = student5.getPassword();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "student" + "'", str6, "student");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Student" + "'", str7, "Student");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "headlabcoordinator" + "'", str8, "headlabcoordinator");
    }

    @Test
    public void test1264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1264");
        com.reservation_system.model.Student student5 = new com.reservation_system.model.Student(0, "Password1!", "", "", false);
        java.lang.String str6 = student5.getUserType();
        java.lang.String str7 = student5.getUserType();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Student" + "'", str6, "Student");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Student" + "'", str7, "Student");
    }

    @Test
    public void test1265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1265");
        com.reservation_system.model.Researcher researcher5 = new com.reservation_system.model.Researcher((int) 'a', "", "researcher", "Student", false);
        java.lang.String str6 = researcher5.getUserType();
        java.lang.String str7 = researcher5.getUserType();
        java.lang.String str8 = researcher5.getUserType();
        int int9 = researcher5.getID();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Researcher" + "'", str6, "Researcher");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Researcher" + "'", str7, "Researcher");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Researcher" + "'", str8, "Researcher");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 97 + "'", int9 == 97);
    }

    @Test
    public void test1266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1266");
        com.reservation_system.model.Researcher researcher5 = new com.reservation_system.model.Researcher((int) '#', "headlabcoordinator", "Student", "Andrew", false);
    }

    @Test
    public void test1267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1267");
        // The following exception was thrown during execution in test generation
        try {
            com.reservation_system.model.User user6 = com.reservation_system.patterns.factory.UserFactory.createUser("Password1!", 97, "Faculty", "student", "Password1!", false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid user type: Password1!");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1268");
        com.reservation_system.model.LabManager labManager5 = new com.reservation_system.model.LabManager((int) (byte) 0, "Student", "faculty", "Password1!", false);
    }

    @Test
    public void test1269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1269");
        com.reservation_system.model.HeadLabCoordinator headLabCoordinator5 = new com.reservation_system.model.HeadLabCoordinator((int) (short) 0, "Andrew", "Researcher", "student", false);
    }

    @Test
    public void test1270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1270");
        com.reservation_system.model.Faculty faculty5 = new com.reservation_system.model.Faculty(97, "researcher", "hi!", "Password1!", false);
    }

    @Test
    public void test1271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1271");
        com.reservation_system.model.User user6 = com.reservation_system.patterns.factory.UserFactory.createUser("Faculty", 0, "andrew@example.com", "Andrew", "Password1!", false);
        org.junit.Assert.assertNotNull(user6);
    }

    @Test
    public void test1272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1272");
        com.reservation_system.model.Student student5 = new com.reservation_system.model.Student((int) (byte) 0, "", "guest", "labmanager", true);
        java.lang.String str6 = student5.getUserType();
        int int7 = student5.getID();
        int int8 = student5.getID();
        java.lang.String str9 = student5.getEmail();
        java.lang.Class<?> wildcardClass10 = student5.getClass();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Student" + "'", str6, "Student");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "guest" + "'", str9, "guest");
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test1273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1273");
        com.reservation_system.model.Guest guest5 = new com.reservation_system.model.Guest((int) (short) 0, "student", "headlabcoordinator", "researcher", false);
        java.lang.String str6 = guest5.getUserType();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Guest" + "'", str6, "Guest");
    }

    @Test
    public void test1274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1274");
        com.reservation_system.model.Faculty faculty5 = new com.reservation_system.model.Faculty(0, "faculty", "", "", false);
    }

    @Test
    public void test1275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1275");
        com.reservation_system.model.Student student5 = new com.reservation_system.model.Student((int) 'a', "headlabcoordinator", "Guest", "", false);
        boolean boolean6 = student5.isApproved();
        boolean boolean7 = student5.isApproved();
        java.lang.String str8 = student5.getPassword();
        java.lang.String str9 = student5.getUserType();
        boolean boolean10 = student5.isApproved();
        java.lang.String str11 = student5.getUserType();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Student" + "'", str9, "Student");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Student" + "'", str11, "Student");
    }

    @Test
    public void test1276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1276");
        com.reservation_system.model.HeadLabCoordinator headLabCoordinator5 = new com.reservation_system.model.HeadLabCoordinator((int) (byte) -1, "Password1!", "Andrew", "andrew@example.com", false);
    }

    @Test
    public void test1277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1277");
        com.reservation_system.model.Researcher researcher5 = new com.reservation_system.model.Researcher((int) (short) -1, "headlabcoordinator", "andrew@example.com", "labmanager", true);
        boolean boolean6 = researcher5.requiresDepartmentApproval();
        boolean boolean7 = researcher5.requiresDepartmentApproval();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test1278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1278");
        com.reservation_system.model.Researcher researcher5 = new com.reservation_system.model.Researcher((int) (short) -1, "Faculty", "Researcher", "", false);
    }

    @Test
    public void test1279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1279");
        com.reservation_system.model.User user6 = com.reservation_system.patterns.factory.UserFactory.createUser("faculty", 97, "Faculty", "Faculty", "guest", true);
        org.junit.Assert.assertNotNull(user6);
    }

    @Test
    public void test1280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1280");
        com.reservation_system.model.Guest guest5 = new com.reservation_system.model.Guest((int) '#', "labmanager", "Faculty", "headlabcoordinator", false);
        java.lang.String str6 = guest5.getUserType();
        boolean boolean7 = guest5.isApproved();
        guest5.setApproved(true);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Guest" + "'", str6, "Guest");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test1281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1281");
        com.reservation_system.model.Student student5 = new com.reservation_system.model.Student((int) '#', "Password1!", "Student", "Guest", false);
        java.lang.String str6 = student5.getUserType();
        java.lang.String str7 = student5.getUserType();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Student" + "'", str6, "Student");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Student" + "'", str7, "Student");
    }

    @Test
    public void test1282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1282");
        com.reservation_system.model.Researcher researcher5 = new com.reservation_system.model.Researcher((int) (byte) 100, "labmanager", "student", "Guest", true);
    }

    @Test
    public void test1283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1283");
        com.reservation_system.model.HeadLabCoordinator headLabCoordinator5 = new com.reservation_system.model.HeadLabCoordinator((int) (byte) 1, "researcher", "labmanager", "Researcher", true);
        java.lang.String str6 = headLabCoordinator5.getUserType();
        int int7 = headLabCoordinator5.getID();
        int int8 = headLabCoordinator5.getID();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "headlabcoordinator" + "'", str6, "headlabcoordinator");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
    }

    @Test
    public void test1284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1284");
        com.reservation_system.model.Researcher researcher5 = new com.reservation_system.model.Researcher(0, "faculty", "Guest", "Password1!", false);
    }

    @Test
    public void test1285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1285");
        com.reservation_system.model.Researcher researcher5 = new com.reservation_system.model.Researcher((int) '#', "Password1!", "hi!", "researcher", true);
    }

    @Test
    public void test1286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1286");
        com.reservation_system.model.Guest guest5 = new com.reservation_system.model.Guest((int) ' ', "", "headlabcoordinator", "hi!", true);
        java.lang.String str6 = guest5.getUserType();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Guest" + "'", str6, "Guest");
    }

    @Test
    public void test1287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1287");
        com.reservation_system.model.HeadLabCoordinator headLabCoordinator5 = new com.reservation_system.model.HeadLabCoordinator(35, "Andrew", "labmanager", "student", true);
        java.lang.String str6 = headLabCoordinator5.getName();
        java.lang.String str7 = headLabCoordinator5.getUserType();
        java.lang.String str8 = headLabCoordinator5.getUserType();
        java.lang.String str9 = headLabCoordinator5.getUserType();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Andrew" + "'", str6, "Andrew");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "headlabcoordinator" + "'", str7, "headlabcoordinator");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "headlabcoordinator" + "'", str8, "headlabcoordinator");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "headlabcoordinator" + "'", str9, "headlabcoordinator");
    }

    @Test
    public void test1288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1288");
        com.reservation_system.model.User user6 = com.reservation_system.patterns.factory.UserFactory.createUser("Student", 10, "Faculty", "Faculty", "Researcher", false);
        java.lang.String str7 = user6.getPassword();
        org.junit.Assert.assertNotNull(user6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Researcher" + "'", str7, "Researcher");
    }

    @Test
    public void test1289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1289");
        com.reservation_system.model.Researcher researcher5 = new com.reservation_system.model.Researcher((int) ' ', "faculty", "faculty", "Student", true);
        boolean boolean6 = researcher5.requiresDepartmentApproval();
        java.lang.String str7 = researcher5.getEmail();
        boolean boolean8 = researcher5.requiresDepartmentApproval();
        boolean boolean9 = researcher5.isApproved();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "faculty" + "'", str7, "faculty");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test1290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1290");
        com.reservation_system.model.LabManager labManager5 = new com.reservation_system.model.LabManager((int) (short) -1, "headlabcoordinator", "faculty", "Researcher", true);
        java.lang.String str6 = labManager5.getUserType();
        java.lang.String str7 = labManager5.getUserType();
        java.lang.String str8 = labManager5.getPassword();
        java.lang.String str9 = labManager5.getUserType();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "labmanager" + "'", str6, "labmanager");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "labmanager" + "'", str7, "labmanager");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Researcher" + "'", str8, "Researcher");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "labmanager" + "'", str9, "labmanager");
    }

    @Test
    public void test1291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1291");
        com.reservation_system.model.LabManager labManager5 = new com.reservation_system.model.LabManager((int) (short) 0, "guest", "labmanager", "andrew@example.com", true);
        java.lang.String str6 = labManager5.getUserType();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "labmanager" + "'", str6, "labmanager");
    }

    @Test
    public void test1292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1292");
        com.reservation_system.model.Student student5 = new com.reservation_system.model.Student(32, "Researcher", "student", "Faculty", true);
    }

    @Test
    public void test1293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1293");
        com.reservation_system.model.Guest guest5 = new com.reservation_system.model.Guest(0, "headlabcoordinator", "guest", "Guest", true);
    }

    @Test
    public void test1294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1294");
        com.reservation_system.model.User user6 = com.reservation_system.patterns.factory.UserFactory.createUser("Student", 0, "labmanager", "Andrew", "andrew@example.com", false);
        org.junit.Assert.assertNotNull(user6);
    }

    @Test
    public void test1295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1295");
        com.reservation_system.model.Guest guest5 = new com.reservation_system.model.Guest((int) (byte) 0, "Faculty", "", "hi!", false);
        java.lang.String str6 = guest5.getUserType();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Guest" + "'", str6, "Guest");
    }

    @Test
    public void test1296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1296");
        com.reservation_system.model.Researcher researcher5 = new com.reservation_system.model.Researcher((int) '4', "Andrew", "Faculty", "student", true);
        java.lang.String str6 = researcher5.getEmail();
        java.lang.String str7 = researcher5.getUserType();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Faculty" + "'", str6, "Faculty");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Researcher" + "'", str7, "Researcher");
    }

    @Test
    public void test1297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1297");
        com.reservation_system.model.Student student5 = new com.reservation_system.model.Student((int) ' ', "Guest", "Andrew", "Researcher", true);
        student5.setApproved(false);
        java.lang.String str8 = student5.getUserType();
        boolean boolean9 = student5.requiresDepartmentApproval();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Student" + "'", str8, "Student");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test1298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1298");
        com.reservation_system.model.Faculty faculty5 = new com.reservation_system.model.Faculty(10, "guest", "Researcher", "Guest", false);
    }

    @Test
    public void test1299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1299");
        com.reservation_system.model.Guest guest5 = new com.reservation_system.model.Guest((int) '4', "andrew@example.com", "student", "faculty", true);
        boolean boolean6 = guest5.isApproved();
        boolean boolean7 = guest5.isApproved();
        java.lang.String str8 = guest5.getName();
        java.lang.String str9 = guest5.getName();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test1300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1300");
        com.reservation_system.model.LabManager labManager5 = new com.reservation_system.model.LabManager((int) (short) 10, "headlabcoordinator", "Andrew", "guest", true);
        java.lang.String str6 = labManager5.getPassword();
        boolean boolean7 = labManager5.requiresDepartmentApproval();
        java.lang.String str8 = labManager5.getName();
        java.lang.String str9 = labManager5.getUserType();
        java.lang.String str10 = labManager5.getUserType();
        boolean boolean11 = labManager5.requiresDepartmentApproval();
        java.lang.String str12 = labManager5.getUserType();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "guest" + "'", str6, "guest");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "headlabcoordinator" + "'", str8, "headlabcoordinator");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "labmanager" + "'", str9, "labmanager");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "labmanager" + "'", str10, "labmanager");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "labmanager" + "'", str12, "labmanager");
    }

    @Test
    public void test1301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1301");
        com.reservation_system.model.Faculty faculty5 = new com.reservation_system.model.Faculty((int) '4', "researcher", "researcher", "Researcher", true);
        java.lang.String str6 = faculty5.getUserType();
        java.lang.String str7 = faculty5.getUserType();
        java.lang.String str8 = faculty5.getUserType();
        java.lang.String str9 = faculty5.getUserType();
        faculty5.setApproved(true);
        java.lang.String str12 = faculty5.getPassword();
        java.lang.String str13 = faculty5.getUserType();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Faculty" + "'", str6, "Faculty");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Faculty" + "'", str7, "Faculty");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Faculty" + "'", str8, "Faculty");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Faculty" + "'", str9, "Faculty");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Researcher" + "'", str12, "Researcher");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Faculty" + "'", str13, "Faculty");
    }

    @Test
    public void test1302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1302");
        // The following exception was thrown during execution in test generation
        try {
            com.reservation_system.model.User user6 = com.reservation_system.patterns.factory.UserFactory.createUser("", 97, "Faculty", "", "", false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid user type: ");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1303");
        com.reservation_system.model.User user6 = com.reservation_system.patterns.factory.UserFactory.createUser("labmanager", (int) (byte) -1, "andrew@example.com", "labmanager", "headlabcoordinator", true);
        java.lang.String str7 = user6.getEmail();
        java.lang.String str8 = user6.getEmail();
        java.lang.String str9 = user6.getEmail();
        org.junit.Assert.assertNotNull(user6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "labmanager" + "'", str7, "labmanager");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "labmanager" + "'", str8, "labmanager");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "labmanager" + "'", str9, "labmanager");
    }

    @Test
    public void test1304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1304");
        com.reservation_system.model.Guest guest5 = new com.reservation_system.model.Guest(0, "", "labmanager", "labmanager", true);
        boolean boolean6 = guest5.isApproved();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test1305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1305");
        com.reservation_system.model.Researcher researcher5 = new com.reservation_system.model.Researcher(1, "Researcher", "Researcher", "researcher", false);
        java.lang.String str6 = researcher5.getUserType();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Researcher" + "'", str6, "Researcher");
    }

    @Test
    public void test1306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1306");
        com.reservation_system.model.Researcher researcher5 = new com.reservation_system.model.Researcher(10, "Password1!", "guest", "guest", false);
        java.lang.String str6 = researcher5.getUserType();
        java.lang.String str7 = researcher5.getUserType();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Researcher" + "'", str6, "Researcher");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Researcher" + "'", str7, "Researcher");
    }

    @Test
    public void test1307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1307");
        com.reservation_system.model.LabManager labManager5 = new com.reservation_system.model.LabManager((int) (short) -1, "Researcher", "Researcher", "Andrew", false);
    }

    @Test
    public void test1308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1308");
        com.reservation_system.model.Guest guest5 = new com.reservation_system.model.Guest((int) (byte) 0, "faculty", "Researcher", "headlabcoordinator", false);
        java.lang.String str6 = guest5.getUserType();
        java.lang.String str7 = guest5.getEmail();
        java.lang.String str8 = guest5.getUserType();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Guest" + "'", str6, "Guest");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Researcher" + "'", str7, "Researcher");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Guest" + "'", str8, "Guest");
    }

    @Test
    public void test1309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1309");
        com.reservation_system.model.User user6 = com.reservation_system.patterns.factory.UserFactory.createUser("Faculty", (int) ' ', "", "faculty", "labmanager", true);
        user6.setApproved(false);
        java.lang.String str9 = user6.getEmail();
        org.junit.Assert.assertNotNull(user6);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "faculty" + "'", str9, "faculty");
    }

    @Test
    public void test1310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1310");
        com.reservation_system.model.LabManager labManager5 = new com.reservation_system.model.LabManager((int) '#', "researcher", "Guest", "Student", false);
        java.lang.String str6 = labManager5.getUserType();
        java.lang.String str7 = labManager5.getEmail();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "labmanager" + "'", str6, "labmanager");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Guest" + "'", str7, "Guest");
    }

    @Test
    public void test1311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1311");
        com.reservation_system.model.Faculty faculty5 = new com.reservation_system.model.Faculty((int) (byte) 10, "andrew@example.com", "", "hi!", false);
        boolean boolean6 = faculty5.requiresDepartmentApproval();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test1312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1312");
        com.reservation_system.model.Faculty faculty5 = new com.reservation_system.model.Faculty((int) 'a', "Faculty", "Andrew", "andrew@example.com", false);
        int int6 = faculty5.getID();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 97 + "'", int6 == 97);
    }

    @Test
    public void test1313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1313");
        com.reservation_system.model.Faculty faculty5 = new com.reservation_system.model.Faculty((int) (short) -1, "hi!", "Student", "headlabcoordinator", false);
        java.lang.String str6 = faculty5.getUserType();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Faculty" + "'", str6, "Faculty");
    }

    @Test
    public void test1314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1314");
        com.reservation_system.model.LabManager labManager5 = new com.reservation_system.model.LabManager((int) (byte) 0, "", "Password1!", "student", false);
    }

    @Test
    public void test1315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1315");
        com.reservation_system.model.HeadLabCoordinator headLabCoordinator5 = new com.reservation_system.model.HeadLabCoordinator((int) (short) -1, "faculty", "labmanager", "Andrew", true);
        headLabCoordinator5.setApproved(false);
        boolean boolean8 = headLabCoordinator5.isApproved();
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test1316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1316");
        com.reservation_system.model.HeadLabCoordinator headLabCoordinator5 = new com.reservation_system.model.HeadLabCoordinator((-1), "headlabcoordinator", "headlabcoordinator", "researcher", true);
        java.lang.String str6 = headLabCoordinator5.getUserType();
        java.lang.String str7 = headLabCoordinator5.getUserType();
        java.lang.String str8 = headLabCoordinator5.getName();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "headlabcoordinator" + "'", str6, "headlabcoordinator");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "headlabcoordinator" + "'", str7, "headlabcoordinator");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "headlabcoordinator" + "'", str8, "headlabcoordinator");
    }

    @Test
    public void test1317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1317");
        com.reservation_system.model.Faculty faculty5 = new com.reservation_system.model.Faculty((int) (short) 10, "hi!", "headlabcoordinator", "hi!", false);
        faculty5.setApproved(false);
        faculty5.setApproved(false);
    }

    @Test
    public void test1318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1318");
        com.reservation_system.model.Faculty faculty5 = new com.reservation_system.model.Faculty((int) (byte) 0, "student", "Researcher", "hi!", true);
        java.lang.String str6 = faculty5.getUserType();
        java.lang.String str7 = faculty5.getName();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Faculty" + "'", str6, "Faculty");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "student" + "'", str7, "student");
    }

    @Test
    public void test1319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1319");
        com.reservation_system.model.Faculty faculty5 = new com.reservation_system.model.Faculty(97, "headlabcoordinator", "Faculty", "Password1!", true);
    }

    @Test
    public void test1320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1320");
        com.reservation_system.model.Researcher researcher5 = new com.reservation_system.model.Researcher((int) (short) 10, "Researcher", "Password1!", "Faculty", false);
    }

    @Test
    public void test1321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1321");
        com.reservation_system.model.Guest guest5 = new com.reservation_system.model.Guest(32, "hi!", "hi!", "Guest", true);
    }

    @Test
    public void test1322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1322");
        com.reservation_system.model.HeadLabCoordinator headLabCoordinator5 = new com.reservation_system.model.HeadLabCoordinator((int) (short) -1, "andrew@example.com", "Faculty", "andrew@example.com", false);
    }

    @Test
    public void test1323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1323");
        com.reservation_system.model.Researcher researcher5 = new com.reservation_system.model.Researcher(0, "student", "", "student", false);
        boolean boolean6 = researcher5.requiresDepartmentApproval();
        java.lang.String str7 = researcher5.getUserType();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Researcher" + "'", str7, "Researcher");
    }

    @Test
    public void test1324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1324");
        com.reservation_system.model.Researcher researcher5 = new com.reservation_system.model.Researcher(0, "student", "", "student", false);
        java.lang.String str6 = researcher5.getEmail();
        java.lang.String str7 = researcher5.getPassword();
        java.lang.String str8 = researcher5.getName();
        boolean boolean9 = researcher5.requiresDepartmentApproval();
        java.lang.String str10 = researcher5.getUserType();
        boolean boolean11 = researcher5.requiresDepartmentApproval();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "student" + "'", str7, "student");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "student" + "'", str8, "student");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Researcher" + "'", str10, "Researcher");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test1325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1325");
        com.reservation_system.model.LabManager labManager5 = new com.reservation_system.model.LabManager((int) (short) 10, "headlabcoordinator", "Andrew", "guest", true);
        java.lang.String str6 = labManager5.getUserType();
        java.lang.String str7 = labManager5.getUserType();
        labManager5.setApproved(false);
        java.lang.String str10 = labManager5.getUserType();
        java.lang.String str11 = labManager5.getEmail();
        boolean boolean12 = labManager5.requiresDepartmentApproval();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "labmanager" + "'", str6, "labmanager");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "labmanager" + "'", str7, "labmanager");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "labmanager" + "'", str10, "labmanager");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Andrew" + "'", str11, "Andrew");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test1326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1326");
        com.reservation_system.model.Faculty faculty5 = new com.reservation_system.model.Faculty((int) '4', "researcher", "researcher", "Researcher", true);
        java.lang.String str6 = faculty5.getUserType();
        java.lang.String str7 = faculty5.getUserType();
        java.lang.String str8 = faculty5.getUserType();
        java.lang.String str9 = faculty5.getUserType();
        java.lang.String str10 = faculty5.getUserType();
        faculty5.setApproved(false);
        java.lang.String str13 = faculty5.getPassword();
        boolean boolean14 = faculty5.isApproved();
        java.lang.String str15 = faculty5.getUserType();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Faculty" + "'", str6, "Faculty");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Faculty" + "'", str7, "Faculty");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Faculty" + "'", str8, "Faculty");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Faculty" + "'", str9, "Faculty");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Faculty" + "'", str10, "Faculty");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Researcher" + "'", str13, "Researcher");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Faculty" + "'", str15, "Faculty");
    }

    @Test
    public void test1327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1327");
        com.reservation_system.model.HeadLabCoordinator headLabCoordinator5 = new com.reservation_system.model.HeadLabCoordinator((int) (byte) 0, "researcher", "Guest", "Password1!", true);
        java.lang.String str6 = headLabCoordinator5.getUserType();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "headlabcoordinator" + "'", str6, "headlabcoordinator");
    }

    @Test
    public void test1328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1328");
        com.reservation_system.model.Guest guest5 = new com.reservation_system.model.Guest((int) (short) 100, "faculty", "headlabcoordinator", "", true);
        java.lang.String str6 = guest5.getUserType();
        java.lang.String str7 = guest5.getUserType();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Guest" + "'", str6, "Guest");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Guest" + "'", str7, "Guest");
    }

    @Test
    public void test1329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1329");
        com.reservation_system.model.LabManager labManager5 = new com.reservation_system.model.LabManager((int) 'a', "faculty", "researcher", "", true);
        boolean boolean6 = labManager5.requiresDepartmentApproval();
        java.lang.String str7 = labManager5.getUserType();
        java.lang.String str8 = labManager5.getUserType();
        java.lang.String str9 = labManager5.getUserType();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "labmanager" + "'", str7, "labmanager");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "labmanager" + "'", str8, "labmanager");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "labmanager" + "'", str9, "labmanager");
    }

    @Test
    public void test1330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1330");
        com.reservation_system.model.HeadLabCoordinator headLabCoordinator5 = new com.reservation_system.model.HeadLabCoordinator(0, "", "headlabcoordinator", "faculty", true);
    }

    @Test
    public void test1331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1331");
        com.reservation_system.model.LabManager labManager5 = new com.reservation_system.model.LabManager((-1), "hi!", "Student", "labmanager", true);
    }

    @Test
    public void test1332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1332");
        com.reservation_system.model.Student student5 = new com.reservation_system.model.Student((int) (short) 10, "hi!", "faculty", "faculty", false);
    }

    @Test
    public void test1333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1333");
        com.reservation_system.model.Faculty faculty5 = new com.reservation_system.model.Faculty((int) (short) 0, "andrew@example.com", "andrew@example.com", "Andrew", false);
        java.lang.String str6 = faculty5.getUserType();
        boolean boolean7 = faculty5.requiresDepartmentApproval();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Faculty" + "'", str6, "Faculty");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test1334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1334");
        com.reservation_system.model.LabManager labManager5 = new com.reservation_system.model.LabManager((int) (byte) 10, "Researcher", "Andrew", "labmanager", true);
    }

    @Test
    public void test1335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1335");
        com.reservation_system.model.Faculty faculty5 = new com.reservation_system.model.Faculty(1, "", "labmanager", "andrew@example.com", false);
    }

    @Test
    public void test1336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1336");
        com.reservation_system.model.Student student5 = new com.reservation_system.model.Student((int) (byte) 10, "researcher", "Researcher", "student", true);
    }

    @Test
    public void test1337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1337");
        com.reservation_system.model.Guest guest5 = new com.reservation_system.model.Guest((int) '#', "student", "Student", "", true);
    }

    @Test
    public void test1338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1338");
        com.reservation_system.model.Faculty faculty5 = new com.reservation_system.model.Faculty((int) (short) -1, "Researcher", "hi!", "Andrew", false);
    }

    @Test
    public void test1339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1339");
        com.reservation_system.model.Student student5 = new com.reservation_system.model.Student((int) (short) 100, "", "Student", "", true);
    }

    @Test
    public void test1340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1340");
        com.reservation_system.model.Faculty faculty5 = new com.reservation_system.model.Faculty(100, "hi!", "Password1!", "", false);
        boolean boolean6 = faculty5.requiresDepartmentApproval();
        java.lang.String str7 = faculty5.getUserType();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Faculty" + "'", str7, "Faculty");
    }

    @Test
    public void test1341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1341");
        com.reservation_system.model.HeadLabCoordinator headLabCoordinator5 = new com.reservation_system.model.HeadLabCoordinator((int) 'a', "Researcher", "researcher", "", false);
        boolean boolean6 = headLabCoordinator5.requiresDepartmentApproval();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test1342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1342");
        com.reservation_system.model.Faculty faculty5 = new com.reservation_system.model.Faculty(10, "hi!", "Faculty", "Andrew", false);
        java.lang.String str6 = faculty5.getUserType();
        java.lang.String str7 = faculty5.getUserType();
        int int8 = faculty5.getID();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Faculty" + "'", str6, "Faculty");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Faculty" + "'", str7, "Faculty");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 10 + "'", int8 == 10);
    }

    @Test
    public void test1343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1343");
        com.reservation_system.model.Researcher researcher5 = new com.reservation_system.model.Researcher(1, "labmanager", "student", "hi!", false);
        java.lang.String str6 = researcher5.getUserType();
        java.lang.String str7 = researcher5.getUserType();
        java.lang.String str8 = researcher5.getEmail();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Researcher" + "'", str6, "Researcher");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Researcher" + "'", str7, "Researcher");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "student" + "'", str8, "student");
    }

    @Test
    public void test1344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1344");
        com.reservation_system.model.Guest guest5 = new com.reservation_system.model.Guest((int) (byte) 1, "researcher", "guest", "guest", true);
        java.lang.String str6 = guest5.getUserType();
        java.lang.String str7 = guest5.getPassword();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Guest" + "'", str6, "Guest");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "guest" + "'", str7, "guest");
    }

    @Test
    public void test1345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1345");
        com.reservation_system.model.Student student5 = new com.reservation_system.model.Student((int) (short) 10, "guest", "labmanager", "", false);
        java.lang.String str6 = student5.getEmail();
        java.lang.String str7 = student5.getEmail();
        student5.setApproved(false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "labmanager" + "'", str6, "labmanager");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "labmanager" + "'", str7, "labmanager");
    }

    @Test
    public void test1346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1346");
        com.reservation_system.model.HeadLabCoordinator headLabCoordinator5 = new com.reservation_system.model.HeadLabCoordinator(0, "headlabcoordinator", "faculty", "guest", false);
        java.lang.String str6 = headLabCoordinator5.getUserType();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "headlabcoordinator" + "'", str6, "headlabcoordinator");
    }

    @Test
    public void test1347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1347");
        com.reservation_system.model.Guest guest5 = new com.reservation_system.model.Guest((int) '#', "faculty", "Researcher", "Student", false);
    }

    @Test
    public void test1348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1348");
        com.reservation_system.model.Researcher researcher5 = new com.reservation_system.model.Researcher((int) '4', "", "faculty", "researcher", true);
    }

    @Test
    public void test1349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1349");
        com.reservation_system.model.LabManager labManager5 = new com.reservation_system.model.LabManager((int) (short) 10, "", "Password1!", "guest", false);
        java.lang.String str6 = labManager5.getPassword();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "guest" + "'", str6, "guest");
    }

    @Test
    public void test1350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1350");
        com.reservation_system.model.Faculty faculty5 = new com.reservation_system.model.Faculty(97, "", "labmanager", "hi!", true);
    }

    @Test
    public void test1351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1351");
        com.reservation_system.model.User user6 = com.reservation_system.patterns.factory.UserFactory.createUser("Student", 97, "Researcher", "", "Student", false);
        java.lang.String str7 = user6.getPassword();
        org.junit.Assert.assertNotNull(user6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Student" + "'", str7, "Student");
    }

    @Test
    public void test1352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1352");
        // The following exception was thrown during execution in test generation
        try {
            com.reservation_system.model.User user6 = com.reservation_system.patterns.factory.UserFactory.createUser("", (int) (byte) 1, "Student", "", "hi!", true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid user type: ");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1353");
        com.reservation_system.model.Guest guest5 = new com.reservation_system.model.Guest(1, "", "student", "student", true);
        java.lang.String str6 = guest5.getUserType();
        java.lang.String str7 = guest5.getUserType();
        java.lang.String str8 = guest5.getUserType();
        java.lang.String str9 = guest5.getUserType();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Guest" + "'", str6, "Guest");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Guest" + "'", str7, "Guest");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Guest" + "'", str8, "Guest");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Guest" + "'", str9, "Guest");
    }

    @Test
    public void test1354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1354");
        com.reservation_system.model.User user6 = com.reservation_system.patterns.factory.UserFactory.createUser("Faculty", (-1), "Password1!", "Andrew", "student", false);
        org.junit.Assert.assertNotNull(user6);
    }

    @Test
    public void test1355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1355");
        com.reservation_system.model.Student student5 = new com.reservation_system.model.Student((int) (byte) 1, "labmanager", "faculty", "headlabcoordinator", false);
    }

    @Test
    public void test1356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1356");
        com.reservation_system.model.Student student5 = new com.reservation_system.model.Student((int) '4', "student", "", "guest", true);
    }

    @Test
    public void test1357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1357");
        com.reservation_system.model.Researcher researcher5 = new com.reservation_system.model.Researcher((int) (byte) 10, "Faculty", "Faculty", "Researcher", true);
        int int6 = researcher5.getID();
        java.lang.String str7 = researcher5.getUserType();
        java.lang.Class<?> wildcardClass8 = researcher5.getClass();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Researcher" + "'", str7, "Researcher");
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test1358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1358");
        com.reservation_system.model.HeadLabCoordinator headLabCoordinator5 = new com.reservation_system.model.HeadLabCoordinator(0, "Guest", "researcher", "guest", true);
    }

    @Test
    public void test1359() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1359");
        com.reservation_system.model.Faculty faculty5 = new com.reservation_system.model.Faculty(0, "headlabcoordinator", "Faculty", "andrew@example.com", false);
        boolean boolean6 = faculty5.requiresDepartmentApproval();
        int int7 = faculty5.getID();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test1360() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1360");
        com.reservation_system.model.HeadLabCoordinator headLabCoordinator5 = new com.reservation_system.model.HeadLabCoordinator((int) (short) 1, "", "", "", true);
    }

    @Test
    public void test1361() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1361");
        com.reservation_system.model.Faculty faculty5 = new com.reservation_system.model.Faculty((int) '4', "researcher", "researcher", "Researcher", true);
        java.lang.String str6 = faculty5.getUserType();
        java.lang.String str7 = faculty5.getName();
        java.lang.String str8 = faculty5.getEmail();
        faculty5.setApproved(true);
        faculty5.setApproved(true);
        int int13 = faculty5.getID();
        java.lang.String str14 = faculty5.getUserType();
        int int15 = faculty5.getID();
        java.lang.String str16 = faculty5.getEmail();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Faculty" + "'", str6, "Faculty");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "researcher" + "'", str7, "researcher");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "researcher" + "'", str8, "researcher");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 52 + "'", int13 == 52);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Faculty" + "'", str14, "Faculty");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 52 + "'", int15 == 52);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "researcher" + "'", str16, "researcher");
    }

    @Test
    public void test1362() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1362");
        // The following exception was thrown during execution in test generation
        try {
            com.reservation_system.model.User user6 = com.reservation_system.patterns.factory.UserFactory.createUser("Andrew", 1, "researcher", "Password1!", "hi!", true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid user type: Andrew");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1363() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1363");
        com.reservation_system.model.LabManager labManager5 = new com.reservation_system.model.LabManager(1, "Faculty", "hi!", "faculty", true);
        labManager5.setApproved(false);
    }

    @Test
    public void test1364() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1364");
        com.reservation_system.model.HeadLabCoordinator headLabCoordinator5 = new com.reservation_system.model.HeadLabCoordinator(97, "Guest", "Faculty", "Guest", false);
        java.lang.String str6 = headLabCoordinator5.getUserType();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "headlabcoordinator" + "'", str6, "headlabcoordinator");
    }

    @Test
    public void test1365() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1365");
        com.reservation_system.model.Guest guest5 = new com.reservation_system.model.Guest(0, "andrew@example.com", "student", "", false);
    }

    @Test
    public void test1366() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1366");
        com.reservation_system.model.Faculty faculty5 = new com.reservation_system.model.Faculty(0, "Student", "labmanager", "guest", true);
        java.lang.String str6 = faculty5.getUserType();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Faculty" + "'", str6, "Faculty");
    }

    @Test
    public void test1367() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1367");
        com.reservation_system.model.Guest guest5 = new com.reservation_system.model.Guest(35, "labmanager", "guest", "Researcher", true);
    }

    @Test
    public void test1368() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1368");
        com.reservation_system.model.Researcher researcher5 = new com.reservation_system.model.Researcher(52, "Researcher", "Faculty", "headlabcoordinator", true);
        java.lang.String str6 = researcher5.getUserType();
        java.lang.String str7 = researcher5.getUserType();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Researcher" + "'", str6, "Researcher");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Researcher" + "'", str7, "Researcher");
    }

    @Test
    public void test1369() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1369");
        com.reservation_system.model.Guest guest5 = new com.reservation_system.model.Guest(0, "Faculty", "guest", "", true);
        java.lang.String str6 = guest5.getUserType();
        boolean boolean7 = guest5.isApproved();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Guest" + "'", str6, "Guest");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test1370() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1370");
        com.reservation_system.model.Faculty faculty5 = new com.reservation_system.model.Faculty((int) '#', "Andrew", "", "labmanager", false);
        java.lang.String str6 = faculty5.getUserType();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Faculty" + "'", str6, "Faculty");
    }

    @Test
    public void test1371() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1371");
        com.reservation_system.model.Student student5 = new com.reservation_system.model.Student((-1), "labmanager", "Student", "faculty", false);
    }

    @Test
    public void test1372() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1372");
        com.reservation_system.model.Student student5 = new com.reservation_system.model.Student((-1), "andrew@example.com", "hi!", "researcher", false);
    }

    @Test
    public void test1373() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1373");
        com.reservation_system.model.Guest guest5 = new com.reservation_system.model.Guest(1, "Password1!", "headlabcoordinator", "labmanager", false);
        java.lang.String str6 = guest5.getUserType();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Guest" + "'", str6, "Guest");
    }

    @Test
    public void test1374() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1374");
        com.reservation_system.model.HeadLabCoordinator headLabCoordinator5 = new com.reservation_system.model.HeadLabCoordinator((int) (short) 10, "faculty", "", "student", false);
        java.lang.String str6 = headLabCoordinator5.getUserType();
        int int7 = headLabCoordinator5.getID();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "headlabcoordinator" + "'", str6, "headlabcoordinator");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 10 + "'", int7 == 10);
    }

    @Test
    public void test1375() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1375");
        com.reservation_system.model.HeadLabCoordinator headLabCoordinator5 = new com.reservation_system.model.HeadLabCoordinator(0, "Researcher", "Student", "Student", false);
    }

    @Test
    public void test1376() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1376");
        com.reservation_system.model.Student student5 = new com.reservation_system.model.Student(52, "Researcher", "guest", "hi!", false);
        java.lang.String str6 = student5.getUserType();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Student" + "'", str6, "Student");
    }

    @Test
    public void test1377() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1377");
        com.reservation_system.model.Student student5 = new com.reservation_system.model.Student((int) (byte) 100, "headlabcoordinator", "headlabcoordinator", "guest", false);
        java.lang.String str6 = student5.getUserType();
        java.lang.String str7 = student5.getPassword();
        java.lang.String str8 = student5.getName();
        boolean boolean9 = student5.requiresDepartmentApproval();
        java.lang.String str10 = student5.getUserType();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Student" + "'", str6, "Student");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "guest" + "'", str7, "guest");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "headlabcoordinator" + "'", str8, "headlabcoordinator");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Student" + "'", str10, "Student");
    }

    @Test
    public void test1378() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1378");
        com.reservation_system.model.Guest guest5 = new com.reservation_system.model.Guest((int) (byte) 100, "", "Password1!", "headlabcoordinator", false);
        java.lang.String str6 = guest5.getUserType();
        java.lang.String str7 = guest5.getEmail();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Guest" + "'", str6, "Guest");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Password1!" + "'", str7, "Password1!");
    }

    @Test
    public void test1379() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1379");
        com.reservation_system.model.Faculty faculty5 = new com.reservation_system.model.Faculty((int) (byte) -1, "guest", "Student", "Guest", false);
    }

    @Test
    public void test1380() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1380");
        com.reservation_system.model.Student student5 = new com.reservation_system.model.Student((int) (byte) 10, "Researcher", "hi!", "Student", true);
        int int6 = student5.getID();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
    }

    @Test
    public void test1381() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1381");
        com.reservation_system.model.LabManager labManager5 = new com.reservation_system.model.LabManager((int) (short) 10, "headlabcoordinator", "Andrew", "guest", true);
        java.lang.String str6 = labManager5.getUserType();
        java.lang.String str7 = labManager5.getUserType();
        labManager5.setApproved(false);
        java.lang.String str10 = labManager5.getUserType();
        java.lang.String str11 = labManager5.getUserType();
        labManager5.setApproved(true);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "labmanager" + "'", str6, "labmanager");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "labmanager" + "'", str7, "labmanager");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "labmanager" + "'", str10, "labmanager");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "labmanager" + "'", str11, "labmanager");
    }

    @Test
    public void test1382() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1382");
        com.reservation_system.model.Researcher researcher5 = new com.reservation_system.model.Researcher((int) (byte) -1, "Guest", "Faculty", "hi!", false);
    }

    @Test
    public void test1383() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1383");
        com.reservation_system.model.Guest guest5 = new com.reservation_system.model.Guest(100, "hi!", "Guest", "hi!", false);
        java.lang.String str6 = guest5.getUserType();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Guest" + "'", str6, "Guest");
    }

    @Test
    public void test1384() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1384");
        com.reservation_system.model.Researcher researcher5 = new com.reservation_system.model.Researcher(10, "Student", "Guest", "Password1!", false);
        boolean boolean6 = researcher5.isApproved();
        java.lang.String str7 = researcher5.getUserType();
        java.lang.String str8 = researcher5.getPassword();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Researcher" + "'", str7, "Researcher");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Password1!" + "'", str8, "Password1!");
    }

    @Test
    public void test1385() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1385");
        com.reservation_system.model.LabManager labManager5 = new com.reservation_system.model.LabManager((int) (byte) 100, "labmanager", "faculty", "hi!", true);
        java.lang.Class<?> wildcardClass6 = labManager5.getClass();
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test1386() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1386");
        com.reservation_system.model.Student student5 = new com.reservation_system.model.Student(0, "student", "guest", "hi!", false);
        java.lang.String str6 = student5.getUserType();
        java.lang.String str7 = student5.getUserType();
        boolean boolean8 = student5.isApproved();
        boolean boolean9 = student5.requiresDepartmentApproval();
        boolean boolean10 = student5.requiresDepartmentApproval();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Student" + "'", str6, "Student");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Student" + "'", str7, "Student");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test1387() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1387");
        com.reservation_system.model.Faculty faculty5 = new com.reservation_system.model.Faculty(52, "labmanager", "Password1!", "guest", true);
    }

    @Test
    public void test1388() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1388");
        com.reservation_system.model.Student student5 = new com.reservation_system.model.Student(1, "guest", "hi!", "student", false);
        java.lang.String str6 = student5.getUserType();
        java.lang.String str7 = student5.getUserType();
        boolean boolean8 = student5.isApproved();
        java.lang.String str9 = student5.getName();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Student" + "'", str6, "Student");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Student" + "'", str7, "Student");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "guest" + "'", str9, "guest");
    }

    @Test
    public void test1389() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1389");
        com.reservation_system.model.Guest guest5 = new com.reservation_system.model.Guest(0, "guest", "faculty", "Password1!", false);
    }

    @Test
    public void test1390() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1390");
        com.reservation_system.model.Faculty faculty5 = new com.reservation_system.model.Faculty((int) ' ', "Researcher", "Password1!", "Student", true);
        java.lang.String str6 = faculty5.getUserType();
        java.lang.String str7 = faculty5.getName();
        java.lang.String str8 = faculty5.getPassword();
        java.lang.String str9 = faculty5.getUserType();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Faculty" + "'", str6, "Faculty");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Researcher" + "'", str7, "Researcher");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Student" + "'", str8, "Student");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Faculty" + "'", str9, "Faculty");
    }

    @Test
    public void test1391() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1391");
        com.reservation_system.model.HeadLabCoordinator headLabCoordinator5 = new com.reservation_system.model.HeadLabCoordinator((int) (short) -1, "faculty", "labmanager", "Andrew", true);
        headLabCoordinator5.setApproved(false);
        java.lang.String str8 = headLabCoordinator5.getUserType();
        java.lang.String str9 = headLabCoordinator5.getUserType();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "headlabcoordinator" + "'", str8, "headlabcoordinator");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "headlabcoordinator" + "'", str9, "headlabcoordinator");
    }

    @Test
    public void test1392() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1392");
        com.reservation_system.model.HeadLabCoordinator headLabCoordinator5 = new com.reservation_system.model.HeadLabCoordinator(10, "Guest", "Student", "Researcher", true);
        headLabCoordinator5.setApproved(true);
        java.lang.String str8 = headLabCoordinator5.getName();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Guest" + "'", str8, "Guest");
    }

    @Test
    public void test1393() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1393");
        com.reservation_system.model.Faculty faculty5 = new com.reservation_system.model.Faculty(97, "", "Faculty", "Faculty", true);
        java.lang.String str6 = faculty5.getName();
        java.lang.String str7 = faculty5.getUserType();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Faculty" + "'", str7, "Faculty");
    }

    @Test
    public void test1394() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1394");
        com.reservation_system.model.Student student5 = new com.reservation_system.model.Student((int) 'a', "headlabcoordinator", "Guest", "", false);
        int int6 = student5.getID();
        java.lang.String str7 = student5.getPassword();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 97 + "'", int6 == 97);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
    }

    @Test
    public void test1395() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1395");
        com.reservation_system.model.Researcher researcher5 = new com.reservation_system.model.Researcher((int) (short) 1, "researcher", "", "Password1!", false);
    }

    @Test
    public void test1396() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1396");
        com.reservation_system.model.LabManager labManager5 = new com.reservation_system.model.LabManager((int) (byte) 100, "", "hi!", "Student", false);
    }

    @Test
    public void test1397() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1397");
        com.reservation_system.model.Student student5 = new com.reservation_system.model.Student(1, "guest", "hi!", "student", false);
        java.lang.String str6 = student5.getUserType();
        java.lang.String str7 = student5.getUserType();
        java.lang.String str8 = student5.getUserType();
        java.lang.String str9 = student5.getUserType();
        boolean boolean10 = student5.requiresDepartmentApproval();
        java.lang.String str11 = student5.getUserType();
        student5.setApproved(true);
        student5.setApproved(false);
        java.lang.String str16 = student5.getPassword();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Student" + "'", str6, "Student");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Student" + "'", str7, "Student");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Student" + "'", str8, "Student");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Student" + "'", str9, "Student");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Student" + "'", str11, "Student");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "student" + "'", str16, "student");
    }

    @Test
    public void test1398() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1398");
        com.reservation_system.model.Faculty faculty5 = new com.reservation_system.model.Faculty(32, "headlabcoordinator", "andrew@example.com", "", true);
    }

    @Test
    public void test1399() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1399");
        com.reservation_system.model.Student student5 = new com.reservation_system.model.Student((-1), "Guest", "Faculty", "faculty", true);
    }

    @Test
    public void test1400() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1400");
        com.reservation_system.model.Researcher researcher5 = new com.reservation_system.model.Researcher((int) 'a', "researcher", "Faculty", "Student", false);
    }

    @Test
    public void test1401() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1401");
        com.reservation_system.model.Researcher researcher5 = new com.reservation_system.model.Researcher((int) (short) 100, "headlabcoordinator", "Student", "guest", true);
        java.lang.String str6 = researcher5.getUserType();
        researcher5.setApproved(true);
        java.lang.String str9 = researcher5.getUserType();
        java.lang.String str10 = researcher5.getPassword();
        java.lang.String str11 = researcher5.getPassword();
        java.lang.String str12 = researcher5.getEmail();
        java.lang.String str13 = researcher5.getUserType();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Researcher" + "'", str6, "Researcher");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Researcher" + "'", str9, "Researcher");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "guest" + "'", str10, "guest");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "guest" + "'", str11, "guest");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Student" + "'", str12, "Student");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Researcher" + "'", str13, "Researcher");
    }

    @Test
    public void test1402() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1402");
        com.reservation_system.model.Researcher researcher5 = new com.reservation_system.model.Researcher(32, "Password1!", "student", "andrew@example.com", true);
    }

    @Test
    public void test1403() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1403");
        com.reservation_system.model.Guest guest5 = new com.reservation_system.model.Guest(1, "labmanager", "hi!", "Password1!", false);
    }

    @Test
    public void test1404() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1404");
        com.reservation_system.model.LabManager labManager5 = new com.reservation_system.model.LabManager(1, "researcher", "guest", "Guest", false);
    }

    @Test
    public void test1405() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1405");
        com.reservation_system.model.Student student5 = new com.reservation_system.model.Student((int) (byte) 100, "Researcher", "Researcher", "faculty", false);
        java.lang.Class<?> wildcardClass6 = student5.getClass();
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test1406() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1406");
        com.reservation_system.model.User user6 = com.reservation_system.patterns.factory.UserFactory.createUser("student", (int) (short) 0, "Password1!", "Faculty", "headlabcoordinator", true);
        org.junit.Assert.assertNotNull(user6);
    }

    @Test
    public void test1407() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1407");
        com.reservation_system.model.Researcher researcher5 = new com.reservation_system.model.Researcher((int) (byte) -1, "headlabcoordinator", "Faculty", "guest", true);
        boolean boolean6 = researcher5.requiresDepartmentApproval();
        researcher5.setApproved(true);
        java.lang.String str9 = researcher5.getUserType();
        java.lang.String str10 = researcher5.getUserType();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Researcher" + "'", str9, "Researcher");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Researcher" + "'", str10, "Researcher");
    }

    @Test
    public void test1408() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1408");
        com.reservation_system.model.HeadLabCoordinator headLabCoordinator5 = new com.reservation_system.model.HeadLabCoordinator(97, "Password1!", "faculty", "hi!", false);
    }

    @Test
    public void test1409() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1409");
        com.reservation_system.model.HeadLabCoordinator headLabCoordinator5 = new com.reservation_system.model.HeadLabCoordinator(1, "labmanager", "student", "researcher", true);
    }

    @Test
    public void test1410() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1410");
        com.reservation_system.model.LabManager labManager5 = new com.reservation_system.model.LabManager((int) '#', "andrew@example.com", "andrew@example.com", "faculty", true);
    }

    @Test
    public void test1411() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1411");
        com.reservation_system.model.LabManager labManager5 = new com.reservation_system.model.LabManager((int) (short) 10, "headlabcoordinator", "Andrew", "guest", true);
        labManager5.setApproved(false);
        java.lang.String str8 = labManager5.getName();
        java.lang.String str9 = labManager5.getName();
        labManager5.setApproved(true);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "headlabcoordinator" + "'", str8, "headlabcoordinator");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "headlabcoordinator" + "'", str9, "headlabcoordinator");
    }

    @Test
    public void test1412() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1412");
        com.reservation_system.model.Faculty faculty5 = new com.reservation_system.model.Faculty((int) (byte) 1, "hi!", "Guest", "Guest", true);
        java.lang.String str6 = faculty5.getUserType();
        java.lang.String str7 = faculty5.getName();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Faculty" + "'", str6, "Faculty");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
    }

    @Test
    public void test1413() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1413");
        com.reservation_system.model.HeadLabCoordinator headLabCoordinator5 = new com.reservation_system.model.HeadLabCoordinator(1, "", "guest", "", true);
        java.lang.String str6 = headLabCoordinator5.getPassword();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
    }

    @Test
    public void test1414() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1414");
        com.reservation_system.model.Guest guest5 = new com.reservation_system.model.Guest((int) '4', "andrew@example.com", "student", "faculty", true);
        java.lang.String str6 = guest5.getName();
        java.lang.String str7 = guest5.getUserType();
        java.lang.String str8 = guest5.getUserType();
        boolean boolean9 = guest5.isApproved();
        boolean boolean10 = guest5.requiresDepartmentApproval();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Guest" + "'", str7, "Guest");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Guest" + "'", str8, "Guest");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test1415() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1415");
        com.reservation_system.model.Researcher researcher5 = new com.reservation_system.model.Researcher(0, "student", "", "student", false);
        boolean boolean6 = researcher5.isApproved();
        java.lang.String str7 = researcher5.getUserType();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Researcher" + "'", str7, "Researcher");
    }

    @Test
    public void test1416() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1416");
        com.reservation_system.model.Researcher researcher5 = new com.reservation_system.model.Researcher(0, "student", "", "student", false);
        java.lang.String str6 = researcher5.getEmail();
        java.lang.String str7 = researcher5.getEmail();
        java.lang.String str8 = researcher5.getUserType();
        java.lang.String str9 = researcher5.getUserType();
        java.lang.String str10 = researcher5.getUserType();
        java.lang.String str11 = researcher5.getName();
        java.lang.String str12 = researcher5.getUserType();
        java.lang.String str13 = researcher5.getPassword();
        boolean boolean14 = researcher5.isApproved();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Researcher" + "'", str8, "Researcher");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Researcher" + "'", str9, "Researcher");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Researcher" + "'", str10, "Researcher");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "student" + "'", str11, "student");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Researcher" + "'", str12, "Researcher");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "student" + "'", str13, "student");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test1417() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1417");
        com.reservation_system.model.Student student5 = new com.reservation_system.model.Student((int) (byte) -1, "researcher", "student", "Researcher", false);
    }

    @Test
    public void test1418() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1418");
        com.reservation_system.model.Student student5 = new com.reservation_system.model.Student((int) (byte) 1, "headlabcoordinator", "guest", "faculty", false);
        int int6 = student5.getID();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
    }

    @Test
    public void test1419() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1419");
        com.reservation_system.model.LabManager labManager5 = new com.reservation_system.model.LabManager(1, "Student", "headlabcoordinator", "hi!", false);
        java.lang.String str6 = labManager5.getEmail();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "headlabcoordinator" + "'", str6, "headlabcoordinator");
    }

    @Test
    public void test1420() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1420");
        com.reservation_system.model.Faculty faculty5 = new com.reservation_system.model.Faculty(35, "andrew@example.com", "faculty", "guest", true);
        java.lang.String str6 = faculty5.getUserType();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Faculty" + "'", str6, "Faculty");
    }

    @Test
    public void test1421() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1421");
        com.reservation_system.model.Faculty faculty5 = new com.reservation_system.model.Faculty((int) (short) 100, "Andrew", "researcher", "Guest", false);
        java.lang.String str6 = faculty5.getUserType();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Faculty" + "'", str6, "Faculty");
    }

    @Test
    public void test1422() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1422");
        com.reservation_system.model.Researcher researcher5 = new com.reservation_system.model.Researcher((int) (short) 1, "", "faculty", "", true);
    }

    @Test
    public void test1423() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1423");
        com.reservation_system.model.LabManager labManager5 = new com.reservation_system.model.LabManager((int) ' ', "Student", "student", "", true);
        java.lang.String str6 = labManager5.getName();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Student" + "'", str6, "Student");
    }

    @Test
    public void test1424() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1424");
        com.reservation_system.model.Guest guest5 = new com.reservation_system.model.Guest((int) (short) 1, "Guest", "Andrew", "Faculty", false);
        java.lang.String str6 = guest5.getUserType();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Guest" + "'", str6, "Guest");
    }

    @Test
    public void test1425() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1425");
        com.reservation_system.model.Student student5 = new com.reservation_system.model.Student((int) (short) 10, "guest", "labmanager", "", false);
        java.lang.String str6 = student5.getUserType();
        java.lang.String str7 = student5.getUserType();
        java.lang.String str8 = student5.getName();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Student" + "'", str6, "Student");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Student" + "'", str7, "Student");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "guest" + "'", str8, "guest");
    }

    @Test
    public void test1426() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1426");
        com.reservation_system.model.Student student5 = new com.reservation_system.model.Student(1, "student", "", "", false);
        java.lang.String str6 = student5.getName();
        java.lang.String str7 = student5.getEmail();
        student5.setApproved(true);
        student5.setApproved(false);
        boolean boolean12 = student5.requiresDepartmentApproval();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "student" + "'", str6, "student");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test1427() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1427");
        com.reservation_system.model.Student student5 = new com.reservation_system.model.Student(1, "", "headlabcoordinator", "andrew@example.com", false);
        int int6 = student5.getID();
        java.lang.String str7 = student5.getUserType();
        java.lang.Class<?> wildcardClass8 = student5.getClass();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Student" + "'", str7, "Student");
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test1428() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1428");
        com.reservation_system.model.Student student5 = new com.reservation_system.model.Student((int) (byte) -1, "student", "labmanager", "guest", false);
        int int6 = student5.getID();
        boolean boolean7 = student5.isApproved();
        int int8 = student5.getID();
        java.lang.String str9 = student5.getUserType();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Student" + "'", str9, "Student");
    }

    @Test
    public void test1429() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1429");
        com.reservation_system.model.User user6 = com.reservation_system.patterns.factory.UserFactory.createUser("Faculty", (int) '#', "andrew@example.com", "labmanager", "Faculty", false);
        boolean boolean7 = user6.isApproved();
        org.junit.Assert.assertNotNull(user6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test1430() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1430");
        com.reservation_system.model.Guest guest5 = new com.reservation_system.model.Guest(100, "headlabcoordinator", "labmanager", "guest", true);
        java.lang.String str6 = guest5.getPassword();
        java.lang.String str7 = guest5.getUserType();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "guest" + "'", str6, "guest");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Guest" + "'", str7, "Guest");
    }

    @Test
    public void test1431() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1431");
        com.reservation_system.model.LabManager labManager5 = new com.reservation_system.model.LabManager((int) '#', "faculty", "Faculty", "andrew@example.com", true);
    }

    @Test
    public void test1432() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1432");
        com.reservation_system.model.Researcher researcher5 = new com.reservation_system.model.Researcher((int) (byte) 1, "student", "headlabcoordinator", "", true);
        java.lang.String str6 = researcher5.getUserType();
        java.lang.String str7 = researcher5.getEmail();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Researcher" + "'", str6, "Researcher");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "headlabcoordinator" + "'", str7, "headlabcoordinator");
    }

    @Test
    public void test1433() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1433");
        com.reservation_system.model.LabManager labManager5 = new com.reservation_system.model.LabManager(35, "guest", "guest", "", true);
    }

    @Test
    public void test1434() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1434");
        com.reservation_system.model.Faculty faculty5 = new com.reservation_system.model.Faculty((int) '4', "researcher", "researcher", "Researcher", true);
        java.lang.String str6 = faculty5.getUserType();
        java.lang.String str7 = faculty5.getUserType();
        java.lang.String str8 = faculty5.getUserType();
        java.lang.String str9 = faculty5.getUserType();
        boolean boolean10 = faculty5.isApproved();
        java.lang.Class<?> wildcardClass11 = faculty5.getClass();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Faculty" + "'", str6, "Faculty");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Faculty" + "'", str7, "Faculty");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Faculty" + "'", str8, "Faculty");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Faculty" + "'", str9, "Faculty");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test1435() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1435");
        com.reservation_system.model.Faculty faculty5 = new com.reservation_system.model.Faculty((int) (short) 10, "guest", "Student", "Faculty", true);
    }

    @Test
    public void test1436() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1436");
        com.reservation_system.model.Researcher researcher5 = new com.reservation_system.model.Researcher((int) 'a', "Password1!", "Password1!", "", true);
        researcher5.setApproved(true);
        java.lang.String str8 = researcher5.getEmail();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Password1!" + "'", str8, "Password1!");
    }

    @Test
    public void test1437() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1437");
        com.reservation_system.model.Guest guest5 = new com.reservation_system.model.Guest((int) (short) 100, "Andrew", "", "Student", false);
        guest5.setApproved(false);
        java.lang.String str8 = guest5.getUserType();
        guest5.setApproved(false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Guest" + "'", str8, "Guest");
    }

    @Test
    public void test1438() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1438");
        com.reservation_system.model.HeadLabCoordinator headLabCoordinator5 = new com.reservation_system.model.HeadLabCoordinator((int) (byte) 1, "labmanager", "Guest", "researcher", false);
    }

    @Test
    public void test1439() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1439");
        com.reservation_system.model.Researcher researcher5 = new com.reservation_system.model.Researcher(1, "student", "hi!", "student", true);
    }

    @Test
    public void test1440() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1440");
        com.reservation_system.model.LabManager labManager5 = new com.reservation_system.model.LabManager((int) (byte) 1, "Faculty", "labmanager", "andrew@example.com", false);
        java.lang.String str6 = labManager5.getUserType();
        java.lang.String str7 = labManager5.getUserType();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "labmanager" + "'", str6, "labmanager");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "labmanager" + "'", str7, "labmanager");
    }

    @Test
    public void test1441() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1441");
        com.reservation_system.model.HeadLabCoordinator headLabCoordinator5 = new com.reservation_system.model.HeadLabCoordinator(10, "guest", "Faculty", "researcher", false);
    }

    @Test
    public void test1442() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1442");
        // The following exception was thrown during execution in test generation
        try {
            com.reservation_system.model.User user6 = com.reservation_system.patterns.factory.UserFactory.createUser("Password1!", (int) (short) 0, "Faculty", "andrew@example.com", "", false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid user type: Password1!");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1443() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1443");
        com.reservation_system.model.HeadLabCoordinator headLabCoordinator5 = new com.reservation_system.model.HeadLabCoordinator((int) (short) -1, "guest", "labmanager", "student", true);
    }

    @Test
    public void test1444() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1444");
        com.reservation_system.model.Guest guest5 = new com.reservation_system.model.Guest((int) '4', "andrew@example.com", "student", "faculty", true);
        java.lang.String str6 = guest5.getUserType();
        java.lang.String str7 = guest5.getName();
        java.lang.String str8 = guest5.getUserType();
        boolean boolean9 = guest5.isApproved();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Guest" + "'", str6, "Guest");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Guest" + "'", str8, "Guest");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test1445() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1445");
        com.reservation_system.model.Faculty faculty5 = new com.reservation_system.model.Faculty((-1), "hi!", "hi!", "Student", false);
    }

    @Test
    public void test1446() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1446");
        com.reservation_system.model.Guest guest5 = new com.reservation_system.model.Guest((int) (byte) 1, "Researcher", "andrew@example.com", "student", false);
        int int6 = guest5.getID();
        java.lang.String str7 = guest5.getUserType();
        int int8 = guest5.getID();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Guest" + "'", str7, "Guest");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
    }

    @Test
    public void test1447() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1447");
        com.reservation_system.model.Guest guest5 = new com.reservation_system.model.Guest((int) (short) 1, "guest", "faculty", "Student", false);
        boolean boolean6 = guest5.requiresDepartmentApproval();
        java.lang.String str7 = guest5.getName();
        java.lang.String str8 = guest5.getEmail();
        java.lang.String str9 = guest5.getUserType();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "guest" + "'", str7, "guest");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "faculty" + "'", str8, "faculty");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Guest" + "'", str9, "Guest");
    }

    @Test
    public void test1448() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1448");
        com.reservation_system.model.LabManager labManager5 = new com.reservation_system.model.LabManager(35, "faculty", "student", "labmanager", false);
        int int6 = labManager5.getID();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 35 + "'", int6 == 35);
    }

    @Test
    public void test1449() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1449");
        com.reservation_system.model.Researcher researcher5 = new com.reservation_system.model.Researcher(100, "Faculty", "student", "", true);
        java.lang.String str6 = researcher5.getName();
        java.lang.String str7 = researcher5.getUserType();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Faculty" + "'", str6, "Faculty");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Researcher" + "'", str7, "Researcher");
    }

    @Test
    public void test1450() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1450");
        com.reservation_system.model.LabManager labManager5 = new com.reservation_system.model.LabManager(10, "guest", "", "Faculty", true);
    }

    @Test
    public void test1451() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1451");
        com.reservation_system.model.Student student5 = new com.reservation_system.model.Student((int) ' ', "guest", "Student", "hi!", false);
        java.lang.String str6 = student5.getUserType();
        java.lang.String str7 = student5.getUserType();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Student" + "'", str6, "Student");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Student" + "'", str7, "Student");
    }

    @Test
    public void test1452() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1452");
        com.reservation_system.model.Faculty faculty5 = new com.reservation_system.model.Faculty((int) '#', "Guest", "student", "Guest", false);
        java.lang.String str6 = faculty5.getUserType();
        faculty5.setApproved(true);
        java.lang.Class<?> wildcardClass9 = faculty5.getClass();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Faculty" + "'", str6, "Faculty");
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test1453() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1453");
        com.reservation_system.model.Student student5 = new com.reservation_system.model.Student((int) ' ', "Password1!", "Andrew", "", true);
        java.lang.String str6 = student5.getName();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Password1!" + "'", str6, "Password1!");
    }

    @Test
    public void test1454() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1454");
        com.reservation_system.model.Researcher researcher5 = new com.reservation_system.model.Researcher((int) '#', "Student", "headlabcoordinator", "faculty", false);
        boolean boolean6 = researcher5.isApproved();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test1455() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1455");
        com.reservation_system.model.Researcher researcher5 = new com.reservation_system.model.Researcher(0, "student", "", "student", false);
        java.lang.String str6 = researcher5.getEmail();
        java.lang.String str7 = researcher5.getEmail();
        boolean boolean8 = researcher5.isApproved();
        researcher5.setApproved(true);
        int int11 = researcher5.getID();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test1456() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1456");
        com.reservation_system.model.User user6 = com.reservation_system.patterns.factory.UserFactory.createUser("guest", 0, "student", "faculty", "", true);
        boolean boolean7 = user6.requiresDepartmentApproval();
        int int8 = user6.getID();
        org.junit.Assert.assertNotNull(user6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test1457() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1457");
        com.reservation_system.model.Student student5 = new com.reservation_system.model.Student(10, "Faculty", "Researcher", "Guest", false);
        java.lang.String str6 = student5.getUserType();
        java.lang.String str7 = student5.getUserType();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Student" + "'", str6, "Student");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Student" + "'", str7, "Student");
    }

    @Test
    public void test1458() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1458");
        com.reservation_system.model.Guest guest5 = new com.reservation_system.model.Guest((int) '#', "Andrew", "guest", "Student", false);
        java.lang.String str6 = guest5.getName();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Andrew" + "'", str6, "Andrew");
    }

    @Test
    public void test1459() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1459");
        com.reservation_system.model.User user6 = com.reservation_system.patterns.factory.UserFactory.createUser("Faculty", 0, "Guest", "guest", "Researcher", false);
        int int7 = user6.getID();
        org.junit.Assert.assertNotNull(user6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test1460() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1460");
        com.reservation_system.model.Researcher researcher5 = new com.reservation_system.model.Researcher(100, "Guest", "", "hi!", true);
        int int6 = researcher5.getID();
        java.lang.String str7 = researcher5.getUserType();
        java.lang.String str8 = researcher5.getPassword();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Researcher" + "'", str7, "Researcher");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
    }

    @Test
    public void test1461() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1461");
        com.reservation_system.model.Researcher researcher5 = new com.reservation_system.model.Researcher((-1), "hi!", "faculty", "researcher", false);
        java.lang.String str6 = researcher5.getUserType();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Researcher" + "'", str6, "Researcher");
    }

    @Test
    public void test1462() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1462");
        com.reservation_system.model.LabManager labManager5 = new com.reservation_system.model.LabManager((int) (short) -1, "headlabcoordinator", "faculty", "Researcher", true);
        java.lang.String str6 = labManager5.getUserType();
        java.lang.String str7 = labManager5.getName();
        java.lang.String str8 = labManager5.getName();
        java.lang.String str9 = labManager5.getPassword();
        labManager5.setApproved(false);
        java.lang.String str12 = labManager5.getUserType();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "labmanager" + "'", str6, "labmanager");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "headlabcoordinator" + "'", str7, "headlabcoordinator");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "headlabcoordinator" + "'", str8, "headlabcoordinator");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Researcher" + "'", str9, "Researcher");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "labmanager" + "'", str12, "labmanager");
    }

    @Test
    public void test1463() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1463");
        // The following exception was thrown during execution in test generation
        try {
            com.reservation_system.model.User user6 = com.reservation_system.patterns.factory.UserFactory.createUser("Password1!", (int) (byte) 100, "Student", "faculty", "faculty", true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid user type: Password1!");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1464() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1464");
        com.reservation_system.model.Guest guest5 = new com.reservation_system.model.Guest((int) '#', "Faculty", "", "Andrew", false);
        java.lang.String str6 = guest5.getPassword();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Andrew" + "'", str6, "Andrew");
    }

    @Test
    public void test1465() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1465");
        com.reservation_system.model.Researcher researcher5 = new com.reservation_system.model.Researcher((int) 'a', "", "researcher", "Student", false);
        java.lang.String str6 = researcher5.getUserType();
        java.lang.String str7 = researcher5.getUserType();
        java.lang.String str8 = researcher5.getUserType();
        java.lang.String str9 = researcher5.getUserType();
        java.lang.String str10 = researcher5.getUserType();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Researcher" + "'", str6, "Researcher");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Researcher" + "'", str7, "Researcher");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Researcher" + "'", str8, "Researcher");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Researcher" + "'", str9, "Researcher");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Researcher" + "'", str10, "Researcher");
    }

    @Test
    public void test1466() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1466");
        com.reservation_system.model.Researcher researcher5 = new com.reservation_system.model.Researcher(0, "student", "", "student", false);
        boolean boolean6 = researcher5.isApproved();
        boolean boolean7 = researcher5.isApproved();
        researcher5.setApproved(false);
        java.lang.String str10 = researcher5.getName();
        java.lang.String str11 = researcher5.getPassword();
        boolean boolean12 = researcher5.isApproved();
        boolean boolean13 = researcher5.requiresDepartmentApproval();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "student" + "'", str10, "student");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "student" + "'", str11, "student");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test1467() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1467");
        com.reservation_system.model.Student student5 = new com.reservation_system.model.Student((int) 'a', "", "hi!", "Guest", true);
        java.lang.String str6 = student5.getUserType();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Student" + "'", str6, "Student");
    }

    @Test
    public void test1468() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1468");
        com.reservation_system.model.LabManager labManager5 = new com.reservation_system.model.LabManager((-1), "hi!", "guest", "Researcher", true);
    }

    @Test
    public void test1469() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1469");
        com.reservation_system.model.Student student5 = new com.reservation_system.model.Student((int) (short) 1, "labmanager", "labmanager", "hi!", true);
        student5.setApproved(true);
    }

    @Test
    public void test1470() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1470");
        com.reservation_system.model.LabManager labManager5 = new com.reservation_system.model.LabManager((int) (byte) 1, "Andrew", "Student", "Password1!", true);
    }

    @Test
    public void test1471() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1471");
        com.reservation_system.model.LabManager labManager5 = new com.reservation_system.model.LabManager(1, "faculty", "Andrew", "Password1!", true);
    }

    @Test
    public void test1472() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1472");
        com.reservation_system.model.Faculty faculty5 = new com.reservation_system.model.Faculty((int) 'a', "headlabcoordinator", "", "Researcher", true);
        java.lang.String str6 = faculty5.getEmail();
        java.lang.String str7 = faculty5.getEmail();
        java.lang.String str8 = faculty5.getPassword();
        faculty5.setApproved(false);
        java.lang.String str11 = faculty5.getUserType();
        boolean boolean12 = faculty5.requiresDepartmentApproval();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Researcher" + "'", str8, "Researcher");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Faculty" + "'", str11, "Faculty");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test1473() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1473");
        com.reservation_system.model.Guest guest5 = new com.reservation_system.model.Guest(32, "Guest", "", "guest", true);
        java.lang.String str6 = guest5.getUserType();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Guest" + "'", str6, "Guest");
    }

    @Test
    public void test1474() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1474");
        com.reservation_system.model.LabManager labManager5 = new com.reservation_system.model.LabManager((int) (short) 10, "headlabcoordinator", "Andrew", "guest", true);
        java.lang.String str6 = labManager5.getUserType();
        java.lang.String str7 = labManager5.getUserType();
        java.lang.String str8 = labManager5.getUserType();
        int int9 = labManager5.getID();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "labmanager" + "'", str6, "labmanager");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "labmanager" + "'", str7, "labmanager");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "labmanager" + "'", str8, "labmanager");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10 + "'", int9 == 10);
    }

    @Test
    public void test1475() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1475");
        com.reservation_system.model.Faculty faculty5 = new com.reservation_system.model.Faculty(97, "", "Faculty", "Faculty", true);
        java.lang.String str6 = faculty5.getName();
        boolean boolean7 = faculty5.requiresDepartmentApproval();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test1476() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1476");
        com.reservation_system.model.HeadLabCoordinator headLabCoordinator5 = new com.reservation_system.model.HeadLabCoordinator((int) (byte) -1, "labmanager", "", "guest", false);
        java.lang.Class<?> wildcardClass6 = headLabCoordinator5.getClass();
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test1477() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1477");
        com.reservation_system.model.Student student5 = new com.reservation_system.model.Student(0, "researcher", "student", "hi!", true);
        java.lang.String str6 = student5.getUserType();
        java.lang.String str7 = student5.getUserType();
        java.lang.String str8 = student5.getName();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Student" + "'", str6, "Student");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Student" + "'", str7, "Student");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "researcher" + "'", str8, "researcher");
    }

    @Test
    public void test1478() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1478");
        com.reservation_system.model.Student student5 = new com.reservation_system.model.Student(0, "labmanager", "Student", "Guest", true);
    }

    @Test
    public void test1479() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1479");
        com.reservation_system.model.HeadLabCoordinator headLabCoordinator5 = new com.reservation_system.model.HeadLabCoordinator(0, "Password1!", "", "labmanager", true);
    }

    @Test
    public void test1480() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1480");
        com.reservation_system.model.Faculty faculty5 = new com.reservation_system.model.Faculty(1, "labmanager", "", "guest", false);
        java.lang.String str6 = faculty5.getEmail();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
    }

    @Test
    public void test1481() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1481");
        // The following exception was thrown during execution in test generation
        try {
            com.reservation_system.model.User user6 = com.reservation_system.patterns.factory.UserFactory.createUser("", (int) (short) 0, "", "headlabcoordinator", "researcher", false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid user type: ");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1482() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1482");
        com.reservation_system.model.Researcher researcher5 = new com.reservation_system.model.Researcher(52, "", "andrew@example.com", "labmanager", true);
        java.lang.String str6 = researcher5.getName();
        java.lang.String str7 = researcher5.getName();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
    }

    @Test
    public void test1483() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1483");
        com.reservation_system.model.Guest guest5 = new com.reservation_system.model.Guest((int) (short) 10, "student", "labmanager", "andrew@example.com", false);
    }

    @Test
    public void test1484() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1484");
        com.reservation_system.model.User user6 = com.reservation_system.patterns.factory.UserFactory.createUser("researcher", (int) (short) -1, "researcher", "faculty", "Researcher", true);
        java.lang.String str7 = user6.getPassword();
        org.junit.Assert.assertNotNull(user6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Researcher" + "'", str7, "Researcher");
    }

    @Test
    public void test1485() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1485");
        com.reservation_system.model.LabManager labManager5 = new com.reservation_system.model.LabManager((int) (short) 10, "headlabcoordinator", "Andrew", "guest", true);
        labManager5.setApproved(false);
        java.lang.String str8 = labManager5.getEmail();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Andrew" + "'", str8, "Andrew");
    }

    @Test
    public void test1486() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1486");
        com.reservation_system.model.LabManager labManager5 = new com.reservation_system.model.LabManager(10, "student", "Guest", "faculty", false);
        java.lang.String str6 = labManager5.getUserType();
        boolean boolean7 = labManager5.requiresDepartmentApproval();
        java.lang.String str8 = labManager5.getUserType();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "labmanager" + "'", str6, "labmanager");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "labmanager" + "'", str8, "labmanager");
    }

    @Test
    public void test1487() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1487");
        com.reservation_system.model.Student student5 = new com.reservation_system.model.Student((int) (byte) 1, "andrew@example.com", "labmanager", "", false);
        java.lang.String str6 = student5.getName();
    }

    @Test
    public void test1488() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1488");
        com.reservation_system.model.HeadLabCoordinator headLabCoordinator5 = new com.reservation_system.model.HeadLabCoordinator((int) (short) -1, "student", "Researcher", "guest", true);
    }

    @Test
    public void test1489() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1489");
        com.reservation_system.model.LabManager labManager5 = new com.reservation_system.model.LabManager((int) (byte) 0, "Student", "andrew@example.com", "headlabcoordinator", true);
    }

    @Test
    public void test1490() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1490");
        com.reservation_system.model.LabManager labManager5 = new com.reservation_system.model.LabManager((int) (short) 10, "headlabcoordinator", "andrew@example.com", "Researcher", true);
    }

    @Test
    public void test1491() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1491");
        com.reservation_system.model.Researcher researcher5 = new com.reservation_system.model.Researcher(97, "Student", "andrew@example.com", "Student", true);
        boolean boolean6 = researcher5.requiresDepartmentApproval();
        boolean boolean7 = researcher5.isApproved();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test1492() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1492");
        com.reservation_system.model.User user6 = com.reservation_system.patterns.factory.UserFactory.createUser("Faculty", 0, "Andrew", "headlabcoordinator", "labmanager", false);
        org.junit.Assert.assertNotNull(user6);
    }

    @Test
    public void test1493() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1493");
        com.reservation_system.model.Guest guest5 = new com.reservation_system.model.Guest((int) (short) 0, "labmanager", "andrew@example.com", "Researcher", true);
    }

    @Test
    public void test1494() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1494");
        com.reservation_system.model.HeadLabCoordinator headLabCoordinator5 = new com.reservation_system.model.HeadLabCoordinator(10, "Guest", "Student", "Researcher", true);
        boolean boolean6 = headLabCoordinator5.isApproved();
        java.lang.String str7 = headLabCoordinator5.getUserType();
        java.lang.String str8 = headLabCoordinator5.getPassword();
        headLabCoordinator5.setApproved(false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "headlabcoordinator" + "'", str7, "headlabcoordinator");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Researcher" + "'", str8, "Researcher");
    }

    @Test
    public void test1495() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1495");
        com.reservation_system.model.HeadLabCoordinator headLabCoordinator5 = new com.reservation_system.model.HeadLabCoordinator((int) (byte) 0, "researcher", "Guest", "Guest", true);
    }

    @Test
    public void test1496() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1496");
        com.reservation_system.model.LabManager labManager5 = new com.reservation_system.model.LabManager((int) (short) 10, "headlabcoordinator", "Andrew", "guest", true);
        java.lang.String str6 = labManager5.getPassword();
        java.lang.String str7 = labManager5.getUserType();
        java.lang.String str8 = labManager5.getUserType();
        java.lang.String str9 = labManager5.getUserType();
        java.lang.String str10 = labManager5.getUserType();
        java.lang.String str11 = labManager5.getUserType();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "guest" + "'", str6, "guest");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "labmanager" + "'", str7, "labmanager");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "labmanager" + "'", str8, "labmanager");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "labmanager" + "'", str9, "labmanager");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "labmanager" + "'", str10, "labmanager");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "labmanager" + "'", str11, "labmanager");
    }

    @Test
    public void test1497() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1497");
        com.reservation_system.model.Researcher researcher5 = new com.reservation_system.model.Researcher((int) (byte) -1, "", "Student", "labmanager", false);
        java.lang.String str6 = researcher5.getEmail();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Student" + "'", str6, "Student");
    }

    @Test
    public void test1498() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1498");
        com.reservation_system.model.User user6 = com.reservation_system.patterns.factory.UserFactory.createUser("Student", 100, "Researcher", "labmanager", "guest", false);
        boolean boolean7 = user6.isApproved();
        org.junit.Assert.assertNotNull(user6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test1499() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1499");
        com.reservation_system.model.Guest guest5 = new com.reservation_system.model.Guest((int) '#', "Andrew", "guest", "Student", false);
        java.lang.String str6 = guest5.getUserType();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Guest" + "'", str6, "Guest");
    }

    @Test
    public void test1500() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1500");
        com.reservation_system.model.Researcher researcher5 = new com.reservation_system.model.Researcher(0, "student", "", "student", false);
        java.lang.String str6 = researcher5.getPassword();
        java.lang.String str7 = researcher5.getEmail();
        java.lang.Class<?> wildcardClass8 = researcher5.getClass();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "student" + "'", str6, "student");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(wildcardClass8);
    }
}

