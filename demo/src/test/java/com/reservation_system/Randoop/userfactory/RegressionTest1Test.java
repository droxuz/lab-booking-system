package com.reservation_system.Randoop.userfactory;

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
        com.reservation_system.model.Guest guest5 = new com.reservation_system.model.Guest(1, "", "student", "student", true);
        guest5.setApproved(true);
        java.lang.String str8 = guest5.getUserType();
        boolean boolean9 = guest5.requiresDepartmentApproval();
        guest5.setApproved(false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Guest" + "'", str8, "Guest");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test0502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0502");
        com.reservation_system.model.Guest guest5 = new com.reservation_system.model.Guest((int) (byte) 100, "Student", "guest", "", true);
    }

    @Test
    public void test0503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0503");
        com.reservation_system.model.User user6 = com.reservation_system.patterns.factory.UserFactory.createUser("labmanager", (int) (byte) -1, "andrew@example.com", "labmanager", "headlabcoordinator", true);
        int int7 = user6.getID();
        org.junit.Assert.assertNotNull(user6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
    }

    @Test
    public void test0504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0504");
        com.reservation_system.model.LabManager labManager5 = new com.reservation_system.model.LabManager((int) (byte) -1, "labmanager", "Student", "Researcher", false);
    }

    @Test
    public void test0505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0505");
        com.reservation_system.model.Student student5 = new com.reservation_system.model.Student((int) 'a', "faculty", "Password1!", "hi!", false);
    }

    @Test
    public void test0506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0506");
        com.reservation_system.model.Student student5 = new com.reservation_system.model.Student((int) (byte) 10, "Andrew", "Guest", "Student", true);
        java.lang.String str6 = student5.getUserType();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Student" + "'", str6, "Student");
    }

    @Test
    public void test0507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0507");
        com.reservation_system.model.Student student5 = new com.reservation_system.model.Student(97, "labmanager", "Andrew", "Password1!", false);
        java.lang.String str6 = student5.getUserType();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Student" + "'", str6, "Student");
    }

    @Test
    public void test0508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0508");
        com.reservation_system.model.Researcher researcher5 = new com.reservation_system.model.Researcher(0, "student", "", "student", false);
        java.lang.String str6 = researcher5.getPassword();
        int int7 = researcher5.getID();
        boolean boolean8 = researcher5.isApproved();
        boolean boolean9 = researcher5.requiresDepartmentApproval();
        java.lang.String str10 = researcher5.getEmail();
        java.lang.Class<?> wildcardClass11 = researcher5.getClass();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "student" + "'", str6, "student");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0509");
        com.reservation_system.model.Guest guest5 = new com.reservation_system.model.Guest((int) '4', "andrew@example.com", "student", "faculty", true);
        boolean boolean6 = guest5.isApproved();
        java.lang.String str7 = guest5.getUserType();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Guest" + "'", str7, "Guest");
    }

    @Test
    public void test0510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0510");
        com.reservation_system.model.Faculty faculty5 = new com.reservation_system.model.Faculty((int) (short) 0, "guest", "Guest", "Researcher", true);
    }

    @Test
    public void test0511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0511");
        com.reservation_system.model.LabManager labManager5 = new com.reservation_system.model.LabManager((-1), "researcher", "hi!", "", true);
        java.lang.String str6 = labManager5.getUserType();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "labmanager" + "'", str6, "labmanager");
    }

    @Test
    public void test0512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0512");
        com.reservation_system.model.LabManager labManager5 = new com.reservation_system.model.LabManager(0, "hi!", "labmanager", "Guest", false);
        boolean boolean6 = labManager5.isApproved();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test0513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0513");
        com.reservation_system.model.Student student5 = new com.reservation_system.model.Student((int) '#', "faculty", "", "", false);
        java.lang.String str6 = student5.getName();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "faculty" + "'", str6, "faculty");
    }

    @Test
    public void test0514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0514");
        com.reservation_system.model.LabManager labManager5 = new com.reservation_system.model.LabManager((int) (short) 10, "headlabcoordinator", "Andrew", "guest", true);
        java.lang.String str6 = labManager5.getPassword();
        boolean boolean7 = labManager5.requiresDepartmentApproval();
        java.lang.String str8 = labManager5.getName();
        java.lang.String str9 = labManager5.getUserType();
        java.lang.Class<?> wildcardClass10 = labManager5.getClass();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "guest" + "'", str6, "guest");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "headlabcoordinator" + "'", str8, "headlabcoordinator");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "labmanager" + "'", str9, "labmanager");
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0515");
        com.reservation_system.model.HeadLabCoordinator headLabCoordinator5 = new com.reservation_system.model.HeadLabCoordinator(10, "Password1!", "student", "Andrew", false);
        java.lang.String str6 = headLabCoordinator5.getUserType();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "headlabcoordinator" + "'", str6, "headlabcoordinator");
    }

    @Test
    public void test0516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0516");
        com.reservation_system.model.HeadLabCoordinator headLabCoordinator5 = new com.reservation_system.model.HeadLabCoordinator((int) '#', "Password1!", "Researcher", "Student", true);
        java.lang.String str6 = headLabCoordinator5.getUserType();
        java.lang.String str7 = headLabCoordinator5.getPassword();
        headLabCoordinator5.setApproved(false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "headlabcoordinator" + "'", str6, "headlabcoordinator");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Student" + "'", str7, "Student");
    }

    @Test
    public void test0517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0517");
        com.reservation_system.model.HeadLabCoordinator headLabCoordinator5 = new com.reservation_system.model.HeadLabCoordinator(32, "Guest", "student", "Researcher", false);
    }

    @Test
    public void test0518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0518");
        com.reservation_system.model.Faculty faculty5 = new com.reservation_system.model.Faculty((int) (short) 100, "Faculty", "student", "Andrew", false);
    }

    @Test
    public void test0519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0519");
        com.reservation_system.model.Researcher researcher5 = new com.reservation_system.model.Researcher(0, "student", "", "student", false);
        java.lang.String str6 = researcher5.getPassword();
        int int7 = researcher5.getID();
        int int8 = researcher5.getID();
        java.lang.String str9 = researcher5.getUserType();
        java.lang.String str10 = researcher5.getName();
        researcher5.setApproved(false);
        java.lang.String str13 = researcher5.getName();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "student" + "'", str6, "student");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Researcher" + "'", str9, "Researcher");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "student" + "'", str10, "student");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "student" + "'", str13, "student");
    }

    @Test
    public void test0520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0520");
        com.reservation_system.model.LabManager labManager5 = new com.reservation_system.model.LabManager((int) '4', "researcher", "Faculty", "faculty", false);
        java.lang.String str6 = labManager5.getUserType();
        java.lang.String str7 = labManager5.getUserType();
        java.lang.String str8 = labManager5.getName();
        boolean boolean9 = labManager5.requiresDepartmentApproval();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "labmanager" + "'", str6, "labmanager");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "labmanager" + "'", str7, "labmanager");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "researcher" + "'", str8, "researcher");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test0521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0521");
        com.reservation_system.model.Researcher researcher5 = new com.reservation_system.model.Researcher((int) '4', "guest", "Student", "student", false);
    }

    @Test
    public void test0522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0522");
        com.reservation_system.model.LabManager labManager5 = new com.reservation_system.model.LabManager(10, "", "Andrew", "Researcher", true);
        java.lang.String str6 = labManager5.getUserType();
        java.lang.String str7 = labManager5.getUserType();
        java.lang.Class<?> wildcardClass8 = labManager5.getClass();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "labmanager" + "'", str6, "labmanager");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "labmanager" + "'", str7, "labmanager");
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0523");
        com.reservation_system.model.Guest guest5 = new com.reservation_system.model.Guest((int) (short) 10, "headlabcoordinator", "faculty", "Student", false);
        java.lang.String str6 = guest5.getUserType();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Guest" + "'", str6, "Guest");
    }

    @Test
    public void test0524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0524");
        com.reservation_system.model.Guest guest5 = new com.reservation_system.model.Guest((int) ' ', "student", "hi!", "hi!", true);
        boolean boolean6 = guest5.requiresDepartmentApproval();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test0525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0525");
        com.reservation_system.model.User user6 = com.reservation_system.patterns.factory.UserFactory.createUser("researcher", (int) (byte) 100, "Faculty", "student", "labmanager", true);
        org.junit.Assert.assertNotNull(user6);
    }

    @Test
    public void test0526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0526");
        com.reservation_system.model.HeadLabCoordinator headLabCoordinator5 = new com.reservation_system.model.HeadLabCoordinator((int) (byte) 1, "hi!", "hi!", "Andrew", true);
    }

    @Test
    public void test0527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0527");
        com.reservation_system.model.User user6 = com.reservation_system.patterns.factory.UserFactory.createUser("Guest", (int) (short) -1, "", "", "Andrew", false);
        org.junit.Assert.assertNotNull(user6);
    }

    @Test
    public void test0528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0528");
        com.reservation_system.model.HeadLabCoordinator headLabCoordinator5 = new com.reservation_system.model.HeadLabCoordinator((int) (byte) 10, "faculty", "Faculty", "Student", true);
        java.lang.String str6 = headLabCoordinator5.getUserType();
        java.lang.String str7 = headLabCoordinator5.getUserType();
        java.lang.Class<?> wildcardClass8 = headLabCoordinator5.getClass();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "headlabcoordinator" + "'", str6, "headlabcoordinator");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "headlabcoordinator" + "'", str7, "headlabcoordinator");
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0529");
        com.reservation_system.model.Researcher researcher5 = new com.reservation_system.model.Researcher(0, "faculty", "Student", "headlabcoordinator", true);
    }

    @Test
    public void test0530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0530");
        com.reservation_system.model.Researcher researcher5 = new com.reservation_system.model.Researcher(97, "Student", "guest", "Guest", true);
        java.lang.String str6 = researcher5.getUserType();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Researcher" + "'", str6, "Researcher");
    }

    @Test
    public void test0531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0531");
        com.reservation_system.model.Researcher researcher5 = new com.reservation_system.model.Researcher(0, "student", "", "student", false);
        java.lang.String str6 = researcher5.getPassword();
        int int7 = researcher5.getID();
        int int8 = researcher5.getID();
        java.lang.String str9 = researcher5.getUserType();
        researcher5.setApproved(true);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "student" + "'", str6, "student");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Researcher" + "'", str9, "Researcher");
    }

    @Test
    public void test0532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0532");
        com.reservation_system.model.Guest guest5 = new com.reservation_system.model.Guest(10, "student", "Researcher", "guest", false);
        java.lang.String str6 = guest5.getUserType();
        java.lang.String str7 = guest5.getName();
        guest5.setApproved(true);
        guest5.setApproved(false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Guest" + "'", str6, "Guest");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "student" + "'", str7, "student");
    }

    @Test
    public void test0533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0533");
        com.reservation_system.model.Researcher researcher5 = new com.reservation_system.model.Researcher(0, "student", "", "student", false);
        java.lang.String str6 = researcher5.getEmail();
        java.lang.String str7 = researcher5.getEmail();
        java.lang.String str8 = researcher5.getUserType();
        java.lang.String str9 = researcher5.getUserType();
        java.lang.String str10 = researcher5.getUserType();
        java.lang.String str11 = researcher5.getName();
        java.lang.String str12 = researcher5.getUserType();
        java.lang.String str13 = researcher5.getPassword();
        java.lang.Class<?> wildcardClass14 = researcher5.getClass();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Researcher" + "'", str8, "Researcher");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Researcher" + "'", str9, "Researcher");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Researcher" + "'", str10, "Researcher");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "student" + "'", str11, "student");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Researcher" + "'", str12, "Researcher");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "student" + "'", str13, "student");
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test0534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0534");
        com.reservation_system.model.LabManager labManager5 = new com.reservation_system.model.LabManager((-1), "Password1!", "andrew@example.com", "headlabcoordinator", false);
    }

    @Test
    public void test0535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0535");
        com.reservation_system.model.Faculty faculty5 = new com.reservation_system.model.Faculty((int) (byte) 1, "", "Password1!", "andrew@example.com", false);
        java.lang.String str6 = faculty5.getName();
        java.lang.String str7 = faculty5.getUserType();
        java.lang.Class<?> wildcardClass8 = faculty5.getClass();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Faculty" + "'", str7, "Faculty");
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0536");
        com.reservation_system.model.Researcher researcher5 = new com.reservation_system.model.Researcher(52, "", "andrew@example.com", "labmanager", true);
        boolean boolean6 = researcher5.requiresDepartmentApproval();
        java.lang.String str7 = researcher5.getName();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
    }

    @Test
    public void test0537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0537");
        com.reservation_system.model.HeadLabCoordinator headLabCoordinator5 = new com.reservation_system.model.HeadLabCoordinator((int) (short) 0, "Researcher", "guest", "researcher", false);
        java.lang.Class<?> wildcardClass6 = headLabCoordinator5.getClass();
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0538");
        com.reservation_system.model.Student student5 = new com.reservation_system.model.Student(97, "Faculty", "", "Student", true);
        java.lang.String str6 = student5.getUserType();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Student" + "'", str6, "Student");
    }

    @Test
    public void test0539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0539");
        com.reservation_system.model.User user6 = com.reservation_system.patterns.factory.UserFactory.createUser("guest", (int) (byte) 10, "Password1!", "Faculty", "Password1!", false);
        org.junit.Assert.assertNotNull(user6);
    }

    @Test
    public void test0540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0540");
        com.reservation_system.model.Researcher researcher5 = new com.reservation_system.model.Researcher((int) (byte) 10, "Faculty", "Faculty", "Researcher", true);
        java.lang.Class<?> wildcardClass6 = researcher5.getClass();
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0541() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0541");
        com.reservation_system.model.Student student5 = new com.reservation_system.model.Student((int) (byte) 0, "Student", "researcher", "Password1!", true);
    }

    @Test
    public void test0542() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0542");
        com.reservation_system.model.Faculty faculty5 = new com.reservation_system.model.Faculty((int) '4', "researcher", "researcher", "Researcher", true);
        java.lang.String str6 = faculty5.getUserType();
        java.lang.String str7 = faculty5.getUserType();
        java.lang.String str8 = faculty5.getUserType();
        java.lang.String str9 = faculty5.getEmail();
        java.lang.String str10 = faculty5.getPassword();
        boolean boolean11 = faculty5.isApproved();
        int int12 = faculty5.getID();
        java.lang.String str13 = faculty5.getUserType();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Faculty" + "'", str6, "Faculty");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Faculty" + "'", str7, "Faculty");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Faculty" + "'", str8, "Faculty");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "researcher" + "'", str9, "researcher");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Researcher" + "'", str10, "Researcher");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 52 + "'", int12 == 52);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Faculty" + "'", str13, "Faculty");
    }

    @Test
    public void test0543() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0543");
        com.reservation_system.model.HeadLabCoordinator headLabCoordinator5 = new com.reservation_system.model.HeadLabCoordinator((-1), "labmanager", "hi!", "Guest", true);
        java.lang.String str6 = headLabCoordinator5.getUserType();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "headlabcoordinator" + "'", str6, "headlabcoordinator");
    }

    @Test
    public void test0544() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0544");
        com.reservation_system.model.Researcher researcher5 = new com.reservation_system.model.Researcher(1, "andrew@example.com", "Guest", "faculty", true);
        java.lang.String str6 = researcher5.getUserType();
        java.lang.String str7 = researcher5.getUserType();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Researcher" + "'", str6, "Researcher");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Researcher" + "'", str7, "Researcher");
    }

    @Test
    public void test0545() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0545");
        com.reservation_system.model.Researcher researcher5 = new com.reservation_system.model.Researcher((-1), "labmanager", "andrew@example.com", "hi!", false);
        java.lang.Class<?> wildcardClass6 = researcher5.getClass();
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0546() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0546");
        com.reservation_system.model.Researcher researcher5 = new com.reservation_system.model.Researcher((int) (byte) -1, "hi!", "researcher", "Guest", false);
        researcher5.setApproved(true);
    }

    @Test
    public void test0547() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0547");
        com.reservation_system.model.Student student5 = new com.reservation_system.model.Student((int) (byte) 100, "headlabcoordinator", "headlabcoordinator", "guest", false);
        java.lang.String str6 = student5.getUserType();
        java.lang.String str7 = student5.getPassword();
        java.lang.String str8 = student5.getUserType();
        java.lang.String str9 = student5.getUserType();
        student5.setApproved(true);
        boolean boolean12 = student5.isApproved();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Student" + "'", str6, "Student");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "guest" + "'", str7, "guest");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Student" + "'", str8, "Student");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Student" + "'", str9, "Student");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test0548() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0548");
        com.reservation_system.model.HeadLabCoordinator headLabCoordinator5 = new com.reservation_system.model.HeadLabCoordinator((int) '#', "Password1!", "Researcher", "Student", true);
        java.lang.String str6 = headLabCoordinator5.getUserType();
        headLabCoordinator5.setApproved(false);
        boolean boolean9 = headLabCoordinator5.requiresDepartmentApproval();
        java.lang.Class<?> wildcardClass10 = headLabCoordinator5.getClass();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "headlabcoordinator" + "'", str6, "headlabcoordinator");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0549() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0549");
        com.reservation_system.model.Researcher researcher5 = new com.reservation_system.model.Researcher((int) 'a', "", "Researcher", "Faculty", true);
        java.lang.String str6 = researcher5.getUserType();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Researcher" + "'", str6, "Researcher");
    }

    @Test
    public void test0550() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0550");
        com.reservation_system.model.Student student5 = new com.reservation_system.model.Student((int) (short) 100, "Faculty", "researcher", "Andrew", false);
        java.lang.String str6 = student5.getUserType();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Student" + "'", str6, "Student");
    }

    @Test
    public void test0551() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0551");
        com.reservation_system.model.LabManager labManager5 = new com.reservation_system.model.LabManager(97, "Andrew", "", "student", true);
        boolean boolean6 = labManager5.isApproved();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test0552() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0552");
        com.reservation_system.model.Student student5 = new com.reservation_system.model.Student(97, "Researcher", "Guest", "guest", false);
        int int6 = student5.getID();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 97 + "'", int6 == 97);
    }

    @Test
    public void test0553() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0553");
        com.reservation_system.model.Researcher researcher5 = new com.reservation_system.model.Researcher((int) (byte) 100, "guest", "Password1!", "Password1!", false);
        java.lang.String str6 = researcher5.getEmail();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Password1!" + "'", str6, "Password1!");
    }

    @Test
    public void test0554() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0554");
        // The following exception was thrown during execution in test generation
        try {
            com.reservation_system.model.User user6 = com.reservation_system.patterns.factory.UserFactory.createUser("hi!", (int) (byte) 0, "Guest", "", "labmanager", true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid user type: hi!");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0555() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0555");
        com.reservation_system.model.Guest guest5 = new com.reservation_system.model.Guest(32, "Faculty", "", "Guest", true);
    }

    @Test
    public void test0556() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0556");
        com.reservation_system.model.LabManager labManager5 = new com.reservation_system.model.LabManager(0, "Student", "Student", "Researcher", true);
        int int6 = labManager5.getID();
        boolean boolean7 = labManager5.isApproved();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test0557() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0557");
        com.reservation_system.model.Faculty faculty5 = new com.reservation_system.model.Faculty((int) '4', "researcher", "researcher", "Researcher", true);
        java.lang.String str6 = faculty5.getUserType();
        java.lang.String str7 = faculty5.getUserType();
        java.lang.String str8 = faculty5.getName();
        boolean boolean9 = faculty5.requiresDepartmentApproval();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Faculty" + "'", str6, "Faculty");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Faculty" + "'", str7, "Faculty");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "researcher" + "'", str8, "researcher");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test0558() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0558");
        com.reservation_system.model.Guest guest5 = new com.reservation_system.model.Guest(10, "student", "Researcher", "guest", false);
        java.lang.String str6 = guest5.getUserType();
        java.lang.String str7 = guest5.getName();
        guest5.setApproved(true);
        java.lang.String str10 = guest5.getUserType();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Guest" + "'", str6, "Guest");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "student" + "'", str7, "student");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Guest" + "'", str10, "Guest");
    }

    @Test
    public void test0559() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0559");
        com.reservation_system.model.LabManager labManager5 = new com.reservation_system.model.LabManager((int) 'a', "faculty", "researcher", "", true);
        int int6 = labManager5.getID();
        labManager5.setApproved(true);
        java.lang.String str9 = labManager5.getUserType();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 97 + "'", int6 == 97);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "labmanager" + "'", str9, "labmanager");
    }

    @Test
    public void test0560() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0560");
        com.reservation_system.model.Guest guest5 = new com.reservation_system.model.Guest((int) (short) 1, "guest", "faculty", "Student", false);
        boolean boolean6 = guest5.isApproved();
        java.lang.String str7 = guest5.getName();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "guest" + "'", str7, "guest");
    }

    @Test
    public void test0561() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0561");
        com.reservation_system.model.Guest guest5 = new com.reservation_system.model.Guest((int) (short) 100, "andrew@example.com", "Andrew", "andrew@example.com", false);
    }

    @Test
    public void test0562() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0562");
        com.reservation_system.model.Guest guest5 = new com.reservation_system.model.Guest(97, "", "labmanager", "guest", true);
    }

    @Test
    public void test0563() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0563");
        com.reservation_system.model.HeadLabCoordinator headLabCoordinator5 = new com.reservation_system.model.HeadLabCoordinator((int) 'a', "researcher", "Password1!", "researcher", false);
        java.lang.String str6 = headLabCoordinator5.getUserType();
        boolean boolean7 = headLabCoordinator5.requiresDepartmentApproval();
        java.lang.String str8 = headLabCoordinator5.getUserType();
        boolean boolean9 = headLabCoordinator5.requiresDepartmentApproval();
        java.lang.String str10 = headLabCoordinator5.getName();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "headlabcoordinator" + "'", str6, "headlabcoordinator");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "headlabcoordinator" + "'", str8, "headlabcoordinator");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "researcher" + "'", str10, "researcher");
    }

    @Test
    public void test0564() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0564");
        com.reservation_system.model.Researcher researcher5 = new com.reservation_system.model.Researcher((-1), "guest", "andrew@example.com", "Guest", true);
        java.lang.String str6 = researcher5.getUserType();
        java.lang.String str7 = researcher5.getEmail();
        java.lang.Class<?> wildcardClass8 = researcher5.getClass();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Researcher" + "'", str6, "Researcher");
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0565() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0565");
        com.reservation_system.model.HeadLabCoordinator headLabCoordinator5 = new com.reservation_system.model.HeadLabCoordinator((int) (byte) -1, "student", "Guest", "student", false);
        java.lang.String str6 = headLabCoordinator5.getPassword();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "student" + "'", str6, "student");
    }

    @Test
    public void test0566() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0566");
        com.reservation_system.model.Researcher researcher5 = new com.reservation_system.model.Researcher((int) (short) 1, "andrew@example.com", "andrew@example.com", "Guest", false);
        java.lang.String str6 = researcher5.getUserType();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Researcher" + "'", str6, "Researcher");
    }

    @Test
    public void test0567() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0567");
        com.reservation_system.model.Faculty faculty5 = new com.reservation_system.model.Faculty(10, "guest", "", "headlabcoordinator", false);
    }

    @Test
    public void test0568() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0568");
        com.reservation_system.model.LabManager labManager5 = new com.reservation_system.model.LabManager((int) (short) 0, "", "labmanager", "Student", false);
        java.lang.String str6 = labManager5.getUserType();
        java.lang.String str7 = labManager5.getUserType();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "labmanager" + "'", str6, "labmanager");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "labmanager" + "'", str7, "labmanager");
    }

    @Test
    public void test0569() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0569");
        com.reservation_system.model.LabManager labManager5 = new com.reservation_system.model.LabManager(52, "Password1!", "Andrew", "Guest", true);
    }

    @Test
    public void test0570() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0570");
        // The following exception was thrown during execution in test generation
        try {
            com.reservation_system.model.User user6 = com.reservation_system.patterns.factory.UserFactory.createUser("", (int) 'a', "researcher", "researcher", "Andrew", false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid user type: ");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0571() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0571");
        com.reservation_system.model.Guest guest5 = new com.reservation_system.model.Guest(100, "andrew@example.com", "", "Student", false);
        boolean boolean6 = guest5.isApproved();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test0572() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0572");
        com.reservation_system.model.Faculty faculty5 = new com.reservation_system.model.Faculty(0, "hi!", "researcher", "researcher", false);
        java.lang.String str6 = faculty5.getUserType();
        java.lang.String str7 = faculty5.getName();
        java.lang.String str8 = faculty5.getPassword();
        java.lang.String str9 = faculty5.getUserType();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Faculty" + "'", str6, "Faculty");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "researcher" + "'", str8, "researcher");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Faculty" + "'", str9, "Faculty");
    }

    @Test
    public void test0573() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0573");
        com.reservation_system.model.Researcher researcher5 = new com.reservation_system.model.Researcher((int) (byte) 0, "headlabcoordinator", "guest", "labmanager", false);
        java.lang.String str6 = researcher5.getEmail();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "guest" + "'", str6, "guest");
    }

    @Test
    public void test0574() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0574");
        com.reservation_system.model.LabManager labManager5 = new com.reservation_system.model.LabManager((int) (byte) 0, "student", "guest", "", true);
        labManager5.setApproved(true);
    }

    @Test
    public void test0575() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0575");
        com.reservation_system.model.LabManager labManager5 = new com.reservation_system.model.LabManager((int) (short) 10, "headlabcoordinator", "Andrew", "guest", true);
        java.lang.String str6 = labManager5.getPassword();
        boolean boolean7 = labManager5.requiresDepartmentApproval();
        java.lang.String str8 = labManager5.getUserType();
        java.lang.String str9 = labManager5.getUserType();
        labManager5.setApproved(false);
        labManager5.setApproved(false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "guest" + "'", str6, "guest");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "labmanager" + "'", str8, "labmanager");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "labmanager" + "'", str9, "labmanager");
    }

    @Test
    public void test0576() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0576");
        com.reservation_system.model.Student student5 = new com.reservation_system.model.Student(52, "Faculty", "researcher", "Student", true);
    }

    @Test
    public void test0577() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0577");
        com.reservation_system.model.Guest guest5 = new com.reservation_system.model.Guest(32, "labmanager", "faculty", "guest", false);
    }

    @Test
    public void test0578() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0578");
        com.reservation_system.model.LabManager labManager5 = new com.reservation_system.model.LabManager(32, "", "andrew@example.com", "Faculty", true);
    }

    @Test
    public void test0579() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0579");
        com.reservation_system.model.Faculty faculty5 = new com.reservation_system.model.Faculty((int) '#', "Guest", "student", "Guest", false);
        java.lang.Class<?> wildcardClass6 = faculty5.getClass();
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0580() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0580");
        com.reservation_system.model.Researcher researcher5 = new com.reservation_system.model.Researcher(0, "student", "", "student", false);
        java.lang.String str6 = researcher5.getEmail();
        java.lang.String str7 = researcher5.getEmail();
        java.lang.String str8 = researcher5.getUserType();
        java.lang.String str9 = researcher5.getUserType();
        java.lang.String str10 = researcher5.getUserType();
        java.lang.String str11 = researcher5.getName();
        java.lang.String str12 = researcher5.getUserType();
        java.lang.String str13 = researcher5.getPassword();
        java.lang.String str14 = researcher5.getEmail();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Researcher" + "'", str8, "Researcher");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Researcher" + "'", str9, "Researcher");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Researcher" + "'", str10, "Researcher");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "student" + "'", str11, "student");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Researcher" + "'", str12, "Researcher");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "student" + "'", str13, "student");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
    }

    @Test
    public void test0581() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0581");
        com.reservation_system.model.LabManager labManager5 = new com.reservation_system.model.LabManager((int) ' ', "Guest", "Andrew", "Researcher", false);
    }

    @Test
    public void test0582() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0582");
        com.reservation_system.model.User user6 = com.reservation_system.patterns.factory.UserFactory.createUser("labmanager", (int) (byte) -1, "andrew@example.com", "labmanager", "headlabcoordinator", true);
        java.lang.String str7 = user6.getEmail();
        java.lang.String str8 = user6.getEmail();
        boolean boolean9 = user6.isApproved();
        org.junit.Assert.assertNotNull(user6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "labmanager" + "'", str7, "labmanager");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "labmanager" + "'", str8, "labmanager");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test0583() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0583");
        com.reservation_system.model.User user6 = com.reservation_system.patterns.factory.UserFactory.createUser("Guest", (int) (short) -1, "", "guest", "Researcher", true);
        org.junit.Assert.assertNotNull(user6);
    }

    @Test
    public void test0584() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0584");
        com.reservation_system.model.Guest guest5 = new com.reservation_system.model.Guest((int) (short) 0, "Researcher", "guest", "student", false);
    }

    @Test
    public void test0585() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0585");
        com.reservation_system.model.User user6 = com.reservation_system.patterns.factory.UserFactory.createUser("headlabcoordinator", 32, "Andrew", "guest", "", false);
        int int7 = user6.getID();
        java.lang.Class<?> wildcardClass8 = user6.getClass();
        org.junit.Assert.assertNotNull(user6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 32 + "'", int7 == 32);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0586() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0586");
        com.reservation_system.model.HeadLabCoordinator headLabCoordinator5 = new com.reservation_system.model.HeadLabCoordinator(10, "Guest", "Student", "Researcher", true);
        java.lang.String str6 = headLabCoordinator5.getUserType();
        int int7 = headLabCoordinator5.getID();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "headlabcoordinator" + "'", str6, "headlabcoordinator");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 10 + "'", int7 == 10);
    }

    @Test
    public void test0587() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0587");
        com.reservation_system.model.Guest guest5 = new com.reservation_system.model.Guest(1, "", "student", "student", true);
        java.lang.String str6 = guest5.getName();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
    }

    @Test
    public void test0588() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0588");
        com.reservation_system.model.Faculty faculty5 = new com.reservation_system.model.Faculty(1, "faculty", "faculty", "headlabcoordinator", true);
    }

    @Test
    public void test0589() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0589");
        com.reservation_system.model.Faculty faculty5 = new com.reservation_system.model.Faculty(0, "faculty", "Password1!", "guest", false);
    }

    @Test
    public void test0590() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0590");
        com.reservation_system.model.Student student5 = new com.reservation_system.model.Student((int) (byte) 10, "Guest", "researcher", "Researcher", false);
    }

    @Test
    public void test0591() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0591");
        com.reservation_system.model.User user6 = com.reservation_system.patterns.factory.UserFactory.createUser("headlabcoordinator", (int) '4', "student", "student", "labmanager", true);
        boolean boolean7 = user6.requiresDepartmentApproval();
        java.lang.String str8 = user6.getPassword();
        org.junit.Assert.assertNotNull(user6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "labmanager" + "'", str8, "labmanager");
    }

    @Test
    public void test0592() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0592");
        com.reservation_system.model.User user6 = com.reservation_system.patterns.factory.UserFactory.createUser("Faculty", (-1), "", "student", "guest", true);
        org.junit.Assert.assertNotNull(user6);
    }

    @Test
    public void test0593() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0593");
        com.reservation_system.model.Student student5 = new com.reservation_system.model.Student((int) (short) 10, "guest", "labmanager", "", false);
        java.lang.String str6 = student5.getEmail();
        java.lang.String str7 = student5.getEmail();
        java.lang.String str8 = student5.getEmail();
        java.lang.String str9 = student5.getEmail();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "labmanager" + "'", str6, "labmanager");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "labmanager" + "'", str7, "labmanager");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "labmanager" + "'", str8, "labmanager");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "labmanager" + "'", str9, "labmanager");
    }

    @Test
    public void test0594() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0594");
        com.reservation_system.model.Student student5 = new com.reservation_system.model.Student((int) (short) 10, "labmanager", "Student", "", true);
    }

    @Test
    public void test0595() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0595");
        com.reservation_system.model.Researcher researcher5 = new com.reservation_system.model.Researcher((int) '4', "researcher", "", "guest", true);
        researcher5.setApproved(false);
        java.lang.String str8 = researcher5.getUserType();
        java.lang.String str9 = researcher5.getUserType();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Researcher" + "'", str8, "Researcher");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Researcher" + "'", str9, "Researcher");
    }

    @Test
    public void test0596() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0596");
        com.reservation_system.model.HeadLabCoordinator headLabCoordinator5 = new com.reservation_system.model.HeadLabCoordinator((int) (short) 100, "Student", "headlabcoordinator", "headlabcoordinator", true);
    }

    @Test
    public void test0597() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0597");
        com.reservation_system.model.HeadLabCoordinator headLabCoordinator5 = new com.reservation_system.model.HeadLabCoordinator((int) (byte) 10, "Andrew", "faculty", "labmanager", false);
    }

    @Test
    public void test0598() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0598");
        com.reservation_system.model.Faculty faculty5 = new com.reservation_system.model.Faculty((int) 'a', "hi!", "Faculty", "Password1!", true);
    }

    @Test
    public void test0599() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0599");
        com.reservation_system.model.Researcher researcher5 = new com.reservation_system.model.Researcher(97, "Student", "andrew@example.com", "Student", true);
        int int6 = researcher5.getID();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 97 + "'", int6 == 97);
    }

    @Test
    public void test0600() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0600");
        com.reservation_system.model.Researcher researcher5 = new com.reservation_system.model.Researcher((int) (short) 1, "", "Guest", "researcher", false);
        java.lang.String str6 = researcher5.getUserType();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Researcher" + "'", str6, "Researcher");
    }

    @Test
    public void test0601() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0601");
        com.reservation_system.model.LabManager labManager5 = new com.reservation_system.model.LabManager((int) (short) 10, "headlabcoordinator", "Andrew", "guest", true);
        labManager5.setApproved(false);
        java.lang.String str8 = labManager5.getName();
        java.lang.String str9 = labManager5.getUserType();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "headlabcoordinator" + "'", str8, "headlabcoordinator");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "labmanager" + "'", str9, "labmanager");
    }

    @Test
    public void test0602() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0602");
        com.reservation_system.model.User user6 = com.reservation_system.patterns.factory.UserFactory.createUser("headlabcoordinator", 0, "", "hi!", "", false);
        java.lang.String str7 = user6.getEmail();
        java.lang.String str8 = user6.getEmail();
        java.lang.String str9 = user6.getEmail();
        java.lang.String str10 = user6.getName();
        int int11 = user6.getID();
        org.junit.Assert.assertNotNull(user6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test0603() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0603");
        com.reservation_system.model.Researcher researcher5 = new com.reservation_system.model.Researcher(0, "researcher", "faculty", "Researcher", true);
    }

    @Test
    public void test0604() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0604");
        com.reservation_system.model.Student student5 = new com.reservation_system.model.Student((int) (byte) 0, "", "guest", "labmanager", true);
        boolean boolean6 = student5.isApproved();
        java.lang.String str7 = student5.getUserType();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Student" + "'", str7, "Student");
    }

    @Test
    public void test0605() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0605");
        com.reservation_system.model.LabManager labManager5 = new com.reservation_system.model.LabManager((int) (short) 100, "", "student", "Password1!", false);
    }

    @Test
    public void test0606() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0606");
        com.reservation_system.model.Researcher researcher5 = new com.reservation_system.model.Researcher((int) ' ', "faculty", "faculty", "Student", true);
        boolean boolean6 = researcher5.requiresDepartmentApproval();
        java.lang.String str7 = researcher5.getEmail();
        boolean boolean8 = researcher5.requiresDepartmentApproval();
        java.lang.String str9 = researcher5.getUserType();
        researcher5.setApproved(true);
        java.lang.String str12 = researcher5.getName();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "faculty" + "'", str7, "faculty");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Researcher" + "'", str9, "Researcher");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "faculty" + "'", str12, "faculty");
    }

    @Test
    public void test0607() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0607");
        com.reservation_system.model.LabManager labManager5 = new com.reservation_system.model.LabManager((int) (short) 100, "student", "researcher", "hi!", true);
    }

    @Test
    public void test0608() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0608");
        com.reservation_system.model.LabManager labManager5 = new com.reservation_system.model.LabManager((int) '4', "labmanager", "faculty", "hi!", true);
    }

    @Test
    public void test0609() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0609");
        com.reservation_system.model.Faculty faculty5 = new com.reservation_system.model.Faculty((int) ' ', "hi!", "headlabcoordinator", "hi!", true);
        java.lang.String str6 = faculty5.getEmail();
        boolean boolean7 = faculty5.requiresDepartmentApproval();
        java.lang.String str8 = faculty5.getUserType();
        java.lang.String str9 = faculty5.getName();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "headlabcoordinator" + "'", str6, "headlabcoordinator");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Faculty" + "'", str8, "Faculty");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
    }

    @Test
    public void test0610() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0610");
        com.reservation_system.model.Researcher researcher5 = new com.reservation_system.model.Researcher((int) (byte) -1, "headlabcoordinator", "Faculty", "guest", true);
        boolean boolean6 = researcher5.requiresDepartmentApproval();
        java.lang.String str7 = researcher5.getUserType();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Researcher" + "'", str7, "Researcher");
    }

    @Test
    public void test0611() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0611");
        com.reservation_system.model.Student student5 = new com.reservation_system.model.Student((int) (byte) 100, "headlabcoordinator", "headlabcoordinator", "guest", false);
        java.lang.String str6 = student5.getUserType();
        java.lang.String str7 = student5.getPassword();
        java.lang.String str8 = student5.getName();
        java.lang.String str9 = student5.getUserType();
        student5.setApproved(false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Student" + "'", str6, "Student");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "guest" + "'", str7, "guest");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "headlabcoordinator" + "'", str8, "headlabcoordinator");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Student" + "'", str9, "Student");
    }

    @Test
    public void test0612() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0612");
        com.reservation_system.model.Student student5 = new com.reservation_system.model.Student((int) 'a', "headlabcoordinator", "Guest", "", false);
        student5.setApproved(false);
        student5.setApproved(true);
        student5.setApproved(true);
    }

    @Test
    public void test0613() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0613");
        com.reservation_system.model.LabManager labManager5 = new com.reservation_system.model.LabManager((int) (short) 10, "headlabcoordinator", "Andrew", "guest", true);
        java.lang.String str6 = labManager5.getPassword();
        boolean boolean7 = labManager5.requiresDepartmentApproval();
        boolean boolean8 = labManager5.requiresDepartmentApproval();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "guest" + "'", str6, "guest");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test0614() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0614");
        com.reservation_system.model.HeadLabCoordinator headLabCoordinator5 = new com.reservation_system.model.HeadLabCoordinator((int) (short) 100, "labmanager", "Researcher", "guest", true);
    }

    @Test
    public void test0615() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0615");
        com.reservation_system.model.Faculty faculty5 = new com.reservation_system.model.Faculty((int) '#', "", "", "guest", false);
        java.lang.String str6 = faculty5.getUserType();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Faculty" + "'", str6, "Faculty");
    }

    @Test
    public void test0616() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0616");
        com.reservation_system.model.Student student5 = new com.reservation_system.model.Student(10, "Andrew", "student", "Researcher", true);
        java.lang.String str6 = student5.getUserType();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Student" + "'", str6, "Student");
    }

    @Test
    public void test0617() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0617");
        com.reservation_system.model.Faculty faculty5 = new com.reservation_system.model.Faculty((int) (byte) 1, "", "Password1!", "andrew@example.com", false);
        java.lang.String str6 = faculty5.getEmail();
        boolean boolean7 = faculty5.requiresDepartmentApproval();
        java.lang.String str8 = faculty5.getUserType();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Password1!" + "'", str6, "Password1!");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Faculty" + "'", str8, "Faculty");
    }

    @Test
    public void test0618() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0618");
        com.reservation_system.model.LabManager labManager5 = new com.reservation_system.model.LabManager(100, "headlabcoordinator", "Faculty", "labmanager", true);
    }

    @Test
    public void test0619() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0619");
        com.reservation_system.model.Faculty faculty5 = new com.reservation_system.model.Faculty((int) 'a', "labmanager", "researcher", "Guest", true);
    }

    @Test
    public void test0620() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0620");
        com.reservation_system.model.Faculty faculty5 = new com.reservation_system.model.Faculty(0, "headlabcoordinator", "Faculty", "andrew@example.com", false);
        boolean boolean6 = faculty5.requiresDepartmentApproval();
        java.lang.Class<?> wildcardClass7 = faculty5.getClass();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0621() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0621");
        com.reservation_system.model.HeadLabCoordinator headLabCoordinator5 = new com.reservation_system.model.HeadLabCoordinator(32, "Researcher", "Faculty", "", false);
        java.lang.String str6 = headLabCoordinator5.getUserType();
        java.lang.String str7 = headLabCoordinator5.getPassword();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "headlabcoordinator" + "'", str6, "headlabcoordinator");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
    }

    @Test
    public void test0622() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0622");
        com.reservation_system.model.Guest guest5 = new com.reservation_system.model.Guest(32, "hi!", "", "Faculty", true);
    }

    @Test
    public void test0623() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0623");
        com.reservation_system.model.Student student5 = new com.reservation_system.model.Student((int) 'a', "headlabcoordinator", "Guest", "", false);
        boolean boolean6 = student5.isApproved();
        java.lang.String str7 = student5.getUserType();
        student5.setApproved(false);
        java.lang.String str10 = student5.getName();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Student" + "'", str7, "Student");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "headlabcoordinator" + "'", str10, "headlabcoordinator");
    }

    @Test
    public void test0624() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0624");
        com.reservation_system.model.Guest guest5 = new com.reservation_system.model.Guest((int) (byte) -1, "faculty", "Guest", "Student", false);
        guest5.setApproved(true);
    }

    @Test
    public void test0625() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0625");
        com.reservation_system.model.Guest guest5 = new com.reservation_system.model.Guest(100, "headlabcoordinator", "labmanager", "guest", true);
        java.lang.String str6 = guest5.getEmail();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "labmanager" + "'", str6, "labmanager");
    }

    @Test
    public void test0626() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0626");
        // The following exception was thrown during execution in test generation
        try {
            com.reservation_system.model.User user6 = com.reservation_system.patterns.factory.UserFactory.createUser("Andrew", (int) 'a', "Guest", "Password1!", "labmanager", false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid user type: Andrew");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0627() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0627");
        com.reservation_system.model.Researcher researcher5 = new com.reservation_system.model.Researcher((int) (short) 10, "headlabcoordinator", "andrew@example.com", "hi!", false);
        java.lang.String str6 = researcher5.getPassword();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
    }

    @Test
    public void test0628() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0628");
        com.reservation_system.model.Student student5 = new com.reservation_system.model.Student(1, "guest", "hi!", "student", false);
        java.lang.String str6 = student5.getEmail();
        java.lang.String str7 = student5.getUserType();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Student" + "'", str7, "Student");
    }

    @Test
    public void test0629() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0629");
        com.reservation_system.model.Researcher researcher5 = new com.reservation_system.model.Researcher((int) (short) 0, "andrew@example.com", "Faculty", "Student", true);
        java.lang.String str6 = researcher5.getUserType();
        boolean boolean7 = researcher5.isApproved();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Researcher" + "'", str6, "Researcher");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test0630() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0630");
        com.reservation_system.model.User user6 = com.reservation_system.patterns.factory.UserFactory.createUser("researcher", (int) (byte) 100, "", "Student", "Andrew", true);
        java.lang.String str7 = user6.getName();
        java.lang.String str8 = user6.getPassword();
        org.junit.Assert.assertNotNull(user6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Andrew" + "'", str8, "Andrew");
    }

    @Test
    public void test0631() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0631");
        com.reservation_system.model.LabManager labManager5 = new com.reservation_system.model.LabManager(10, "Faculty", "andrew@example.com", "student", false);
        java.lang.String str6 = labManager5.getUserType();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "labmanager" + "'", str6, "labmanager");
    }

    @Test
    public void test0632() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0632");
        com.reservation_system.model.Researcher researcher5 = new com.reservation_system.model.Researcher(0, "student", "", "student", false);
        java.lang.String str6 = researcher5.getPassword();
        researcher5.setApproved(true);
        java.lang.String str9 = researcher5.getUserType();
        java.lang.String str10 = researcher5.getName();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "student" + "'", str6, "student");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Researcher" + "'", str9, "Researcher");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "student" + "'", str10, "student");
    }

    @Test
    public void test0633() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0633");
        com.reservation_system.model.Researcher researcher5 = new com.reservation_system.model.Researcher(32, "andrew@example.com", "Researcher", "Student", false);
        boolean boolean6 = researcher5.isApproved();
        java.lang.Class<?> wildcardClass7 = researcher5.getClass();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0634() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0634");
        com.reservation_system.model.Student student5 = new com.reservation_system.model.Student((int) (short) 10, "Guest", "andrew@example.com", "Researcher", true);
        java.lang.String str6 = student5.getName();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Guest" + "'", str6, "Guest");
    }

    @Test
    public void test0635() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0635");
        com.reservation_system.model.Guest guest5 = new com.reservation_system.model.Guest((int) (byte) -1, "Student", "researcher", "andrew@example.com", false);
    }

    @Test
    public void test0636() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0636");
        com.reservation_system.model.Student student5 = new com.reservation_system.model.Student(0, "Researcher", "hi!", "Researcher", false);
    }

    @Test
    public void test0637() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0637");
        com.reservation_system.model.User user6 = com.reservation_system.patterns.factory.UserFactory.createUser("Student", 10, "Faculty", "Faculty", "Researcher", false);
        boolean boolean7 = user6.requiresDepartmentApproval();
        org.junit.Assert.assertNotNull(user6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test0638() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0638");
        com.reservation_system.model.Guest guest5 = new com.reservation_system.model.Guest((int) (short) 0, "andrew@example.com", "researcher", "", false);
        java.lang.String str6 = guest5.getUserType();
        int int7 = guest5.getID();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Guest" + "'", str6, "Guest");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test0639() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0639");
        com.reservation_system.model.User user6 = com.reservation_system.patterns.factory.UserFactory.createUser("student", (int) 'a', "Guest", "student", "guest", false);
        user6.setApproved(true);
        org.junit.Assert.assertNotNull(user6);
    }

    @Test
    public void test0640() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0640");
        com.reservation_system.model.Faculty faculty5 = new com.reservation_system.model.Faculty(0, "hi!", "researcher", "researcher", false);
        java.lang.String str6 = faculty5.getUserType();
        java.lang.String str7 = faculty5.getName();
        java.lang.String str8 = faculty5.getEmail();
        java.lang.String str9 = faculty5.getName();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Faculty" + "'", str6, "Faculty");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "researcher" + "'", str8, "researcher");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
    }

    @Test
    public void test0641() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0641");
        com.reservation_system.model.HeadLabCoordinator headLabCoordinator5 = new com.reservation_system.model.HeadLabCoordinator((-1), "Faculty", "researcher", "Student", false);
    }

    @Test
    public void test0642() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0642");
        com.reservation_system.model.Faculty faculty5 = new com.reservation_system.model.Faculty((int) '4', "researcher", "researcher", "Researcher", true);
        java.lang.String str6 = faculty5.getUserType();
        java.lang.String str7 = faculty5.getUserType();
        java.lang.String str8 = faculty5.getUserType();
        java.lang.String str9 = faculty5.getUserType();
        java.lang.String str10 = faculty5.getUserType();
        faculty5.setApproved(false);
        java.lang.String str13 = faculty5.getUserType();
        java.lang.String str14 = faculty5.getUserType();
        java.lang.String str15 = faculty5.getUserType();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Faculty" + "'", str6, "Faculty");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Faculty" + "'", str7, "Faculty");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Faculty" + "'", str8, "Faculty");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Faculty" + "'", str9, "Faculty");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Faculty" + "'", str10, "Faculty");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Faculty" + "'", str13, "Faculty");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Faculty" + "'", str14, "Faculty");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Faculty" + "'", str15, "Faculty");
    }

    @Test
    public void test0643() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0643");
        com.reservation_system.model.Student student5 = new com.reservation_system.model.Student(1, "guest", "hi!", "student", false);
        java.lang.String str6 = student5.getUserType();
        java.lang.String str7 = student5.getUserType();
        java.lang.String str8 = student5.getName();
        java.lang.String str9 = student5.getUserType();
        int int10 = student5.getID();
        student5.setApproved(false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Student" + "'", str6, "Student");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Student" + "'", str7, "Student");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "guest" + "'", str8, "guest");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Student" + "'", str9, "Student");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
    }

    @Test
    public void test0644() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0644");
        com.reservation_system.model.HeadLabCoordinator headLabCoordinator5 = new com.reservation_system.model.HeadLabCoordinator((int) (byte) -1, "Password1!", "guest", "Faculty", false);
    }

    @Test
    public void test0645() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0645");
        com.reservation_system.model.Guest guest5 = new com.reservation_system.model.Guest(10, "student", "Researcher", "guest", false);
        boolean boolean6 = guest5.requiresDepartmentApproval();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test0646() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0646");
        com.reservation_system.model.Researcher researcher5 = new com.reservation_system.model.Researcher(0, "student", "", "student", false);
        java.lang.String str6 = researcher5.getPassword();
        int int7 = researcher5.getID();
        int int8 = researcher5.getID();
        java.lang.String str9 = researcher5.getUserType();
        boolean boolean10 = researcher5.isApproved();
        java.lang.Class<?> wildcardClass11 = researcher5.getClass();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "student" + "'", str6, "student");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Researcher" + "'", str9, "Researcher");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0647() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0647");
        com.reservation_system.model.Faculty faculty5 = new com.reservation_system.model.Faculty(10, "Faculty", "hi!", "", true);
        java.lang.String str6 = faculty5.getUserType();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Faculty" + "'", str6, "Faculty");
    }

    @Test
    public void test0648() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0648");
        com.reservation_system.model.Guest guest5 = new com.reservation_system.model.Guest((int) (short) 0, "andrew@example.com", "researcher", "", false);
        java.lang.String str6 = guest5.getUserType();
        java.lang.String str7 = guest5.getPassword();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Guest" + "'", str6, "Guest");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
    }

    @Test
    public void test0649() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0649");
        com.reservation_system.model.LabManager labManager5 = new com.reservation_system.model.LabManager((int) '#', "Faculty", "Guest", "", true);
        java.lang.String str6 = labManager5.getUserType();
        java.lang.String str7 = labManager5.getUserType();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "labmanager" + "'", str6, "labmanager");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "labmanager" + "'", str7, "labmanager");
    }

    @Test
    public void test0650() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0650");
        com.reservation_system.model.HeadLabCoordinator headLabCoordinator5 = new com.reservation_system.model.HeadLabCoordinator((int) 'a', "guest", "Faculty", "", false);
        java.lang.String str6 = headLabCoordinator5.getUserType();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "headlabcoordinator" + "'", str6, "headlabcoordinator");
    }

    @Test
    public void test0651() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0651");
        com.reservation_system.model.Faculty faculty5 = new com.reservation_system.model.Faculty((int) '#', "labmanager", "hi!", "Researcher", true);
        java.lang.String str6 = faculty5.getUserType();
        java.lang.String str7 = faculty5.getEmail();
        java.lang.String str8 = faculty5.getUserType();
        java.lang.String str9 = faculty5.getPassword();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Faculty" + "'", str6, "Faculty");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Faculty" + "'", str8, "Faculty");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Researcher" + "'", str9, "Researcher");
    }

    @Test
    public void test0652() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0652");
        com.reservation_system.model.HeadLabCoordinator headLabCoordinator5 = new com.reservation_system.model.HeadLabCoordinator((int) (byte) -1, "faculty", "", "Student", true);
        java.lang.String str6 = headLabCoordinator5.getUserType();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "headlabcoordinator" + "'", str6, "headlabcoordinator");
    }

    @Test
    public void test0653() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0653");
        com.reservation_system.model.Student student5 = new com.reservation_system.model.Student((int) (byte) 100, "headlabcoordinator", "headlabcoordinator", "guest", false);
        java.lang.String str6 = student5.getUserType();
        java.lang.String str7 = student5.getPassword();
        java.lang.String str8 = student5.getUserType();
        java.lang.String str9 = student5.getUserType();
        java.lang.String str10 = student5.getUserType();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Student" + "'", str6, "Student");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "guest" + "'", str7, "guest");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Student" + "'", str8, "Student");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Student" + "'", str9, "Student");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Student" + "'", str10, "Student");
    }

    @Test
    public void test0654() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0654");
        com.reservation_system.model.Student student5 = new com.reservation_system.model.Student((int) 'a', "Andrew", "hi!", "headlabcoordinator", false);
    }

    @Test
    public void test0655() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0655");
        com.reservation_system.model.Student student5 = new com.reservation_system.model.Student((int) (short) 100, "Password1!", "guest", "Faculty", true);
        boolean boolean6 = student5.isApproved();
        java.lang.String str7 = student5.getEmail();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "guest" + "'", str7, "guest");
    }

    @Test
    public void test0656() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0656");
        com.reservation_system.model.HeadLabCoordinator headLabCoordinator5 = new com.reservation_system.model.HeadLabCoordinator((int) (short) -1, "faculty", "Student", "", false);
    }

    @Test
    public void test0657() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0657");
        com.reservation_system.model.Guest guest5 = new com.reservation_system.model.Guest(35, "labmanager", "headlabcoordinator", "guest", true);
    }

    @Test
    public void test0658() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0658");
        com.reservation_system.model.HeadLabCoordinator headLabCoordinator5 = new com.reservation_system.model.HeadLabCoordinator(97, "", "researcher", "Guest", false);
    }

    @Test
    public void test0659() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0659");
        com.reservation_system.model.Researcher researcher5 = new com.reservation_system.model.Researcher(100, "Guest", "researcher", "faculty", false);
        java.lang.Class<?> wildcardClass6 = researcher5.getClass();
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0660() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0660");
        com.reservation_system.model.Guest guest5 = new com.reservation_system.model.Guest((int) (short) 10, "faculty", "Guest", "Password1!", false);
        java.lang.String str6 = guest5.getPassword();
        java.lang.String str7 = guest5.getName();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Password1!" + "'", str6, "Password1!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "faculty" + "'", str7, "faculty");
    }

    @Test
    public void test0661() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0661");
        com.reservation_system.model.HeadLabCoordinator headLabCoordinator5 = new com.reservation_system.model.HeadLabCoordinator((int) '#', "Student", "Guest", "", true);
    }

    @Test
    public void test0662() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0662");
        com.reservation_system.model.Guest guest5 = new com.reservation_system.model.Guest((int) (byte) 1, "labmanager", "", "Faculty", true);
        java.lang.String str6 = guest5.getName();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "labmanager" + "'", str6, "labmanager");
    }

    @Test
    public void test0663() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0663");
        // The following exception was thrown during execution in test generation
        try {
            com.reservation_system.model.User user6 = com.reservation_system.patterns.factory.UserFactory.createUser("", 35, "Password1!", "Faculty", "Guest", false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid user type: ");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0664() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0664");
        com.reservation_system.model.LabManager labManager5 = new com.reservation_system.model.LabManager(100, "Researcher", "headlabcoordinator", "guest", false);
        java.lang.Class<?> wildcardClass6 = labManager5.getClass();
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0665() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0665");
        com.reservation_system.model.Student student5 = new com.reservation_system.model.Student(1, "guest", "hi!", "student", false);
        java.lang.String str6 = student5.getUserType();
        java.lang.String str7 = student5.getPassword();
        java.lang.String str8 = student5.getUserType();
        java.lang.String str9 = student5.getUserType();
        boolean boolean10 = student5.isApproved();
        java.lang.String str11 = student5.getEmail();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Student" + "'", str6, "Student");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "student" + "'", str7, "student");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Student" + "'", str8, "Student");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Student" + "'", str9, "Student");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
    }

    @Test
    public void test0666() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0666");
        com.reservation_system.model.Guest guest5 = new com.reservation_system.model.Guest((int) (short) 100, "Andrew", "", "Student", false);
        java.lang.String str6 = guest5.getPassword();
        java.lang.String str7 = guest5.getUserType();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Student" + "'", str6, "Student");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Guest" + "'", str7, "Guest");
    }

    @Test
    public void test0667() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0667");
        com.reservation_system.model.Student student5 = new com.reservation_system.model.Student(0, "researcher", "Guest", "Student", true);
        java.lang.String str6 = student5.getName();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "researcher" + "'", str6, "researcher");
    }

    @Test
    public void test0668() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0668");
        com.reservation_system.model.User user6 = com.reservation_system.patterns.factory.UserFactory.createUser("labmanager", (int) (byte) -1, "andrew@example.com", "labmanager", "headlabcoordinator", true);
        java.lang.String str7 = user6.getEmail();
        boolean boolean8 = user6.isApproved();
        boolean boolean9 = user6.requiresDepartmentApproval();
        org.junit.Assert.assertNotNull(user6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "labmanager" + "'", str7, "labmanager");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test0669() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0669");
        com.reservation_system.model.HeadLabCoordinator headLabCoordinator5 = new com.reservation_system.model.HeadLabCoordinator((int) (byte) 0, "Andrew", "hi!", "student", true);
    }

    @Test
    public void test0670() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0670");
        com.reservation_system.model.Researcher researcher5 = new com.reservation_system.model.Researcher((int) (byte) 10, "andrew@example.com", "Andrew", "hi!", false);
    }

    @Test
    public void test0671() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0671");
        com.reservation_system.model.Researcher researcher5 = new com.reservation_system.model.Researcher(100, "Faculty", "student", "", true);
        java.lang.String str6 = researcher5.getName();
        researcher5.setApproved(true);
        java.lang.String str9 = researcher5.getUserType();
        boolean boolean10 = researcher5.requiresDepartmentApproval();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Faculty" + "'", str6, "Faculty");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Researcher" + "'", str9, "Researcher");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test0672() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0672");
        com.reservation_system.model.HeadLabCoordinator headLabCoordinator5 = new com.reservation_system.model.HeadLabCoordinator(1, "Student", "researcher", "researcher", true);
    }

    @Test
    public void test0673() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0673");
        com.reservation_system.model.HeadLabCoordinator headLabCoordinator5 = new com.reservation_system.model.HeadLabCoordinator((int) (short) 100, "Faculty", "Student", "Researcher", false);
    }

    @Test
    public void test0674() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0674");
        com.reservation_system.model.LabManager labManager5 = new com.reservation_system.model.LabManager(32, "hi!", "Guest", "hi!", false);
    }

    @Test
    public void test0675() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0675");
        com.reservation_system.model.Faculty faculty5 = new com.reservation_system.model.Faculty(100, "researcher", "labmanager", "andrew@example.com", false);
        java.lang.String str6 = faculty5.getPassword();
    }

    @Test
    public void test0676() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0676");
        com.reservation_system.model.HeadLabCoordinator headLabCoordinator5 = new com.reservation_system.model.HeadLabCoordinator((int) (short) 100, "andrew@example.com", "Student", "Faculty", false);
        boolean boolean6 = headLabCoordinator5.requiresDepartmentApproval();
        java.lang.String str7 = headLabCoordinator5.getUserType();
        java.lang.String str8 = headLabCoordinator5.getUserType();
        java.lang.String str9 = headLabCoordinator5.getUserType();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "headlabcoordinator" + "'", str7, "headlabcoordinator");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "headlabcoordinator" + "'", str8, "headlabcoordinator");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "headlabcoordinator" + "'", str9, "headlabcoordinator");
    }

    @Test
    public void test0677() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0677");
        com.reservation_system.model.Student student5 = new com.reservation_system.model.Student((int) ' ', "Guest", "Andrew", "Researcher", true);
        int int6 = student5.getID();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 32 + "'", int6 == 32);
    }

    @Test
    public void test0678() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0678");
        com.reservation_system.model.Researcher researcher5 = new com.reservation_system.model.Researcher((int) (byte) -1, "Password1!", "student", "Researcher", true);
        java.lang.String str6 = researcher5.getUserType();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Researcher" + "'", str6, "Researcher");
    }

    @Test
    public void test0679() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0679");
        com.reservation_system.model.Researcher researcher5 = new com.reservation_system.model.Researcher((int) (short) 0, "andrew@example.com", "researcher", "", true);
        java.lang.String str6 = researcher5.getUserType();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Researcher" + "'", str6, "Researcher");
    }

    @Test
    public void test0680() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0680");
        com.reservation_system.model.LabManager labManager5 = new com.reservation_system.model.LabManager((int) ' ', "Student", "student", "", true);
        int int6 = labManager5.getID();
        labManager5.setApproved(false);
        java.lang.String str9 = labManager5.getName();
        boolean boolean10 = labManager5.requiresDepartmentApproval();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 32 + "'", int6 == 32);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Student" + "'", str9, "Student");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test0681() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0681");
        com.reservation_system.model.Faculty faculty5 = new com.reservation_system.model.Faculty((int) '4', "researcher", "researcher", "Researcher", true);
        java.lang.String str6 = faculty5.getUserType();
        java.lang.String str7 = faculty5.getUserType();
        java.lang.String str8 = faculty5.getUserType();
        java.lang.String str9 = faculty5.getUserType();
        java.lang.String str10 = faculty5.getUserType();
        faculty5.setApproved(false);
        java.lang.Class<?> wildcardClass13 = faculty5.getClass();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Faculty" + "'", str6, "Faculty");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Faculty" + "'", str7, "Faculty");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Faculty" + "'", str8, "Faculty");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Faculty" + "'", str9, "Faculty");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Faculty" + "'", str10, "Faculty");
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0682() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0682");
        com.reservation_system.model.Guest guest5 = new com.reservation_system.model.Guest((int) '4', "andrew@example.com", "student", "student", false);
        guest5.setApproved(false);
        java.lang.String str8 = guest5.getEmail();
        java.lang.String str9 = guest5.getUserType();
        boolean boolean10 = guest5.requiresDepartmentApproval();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "student" + "'", str8, "student");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Guest" + "'", str9, "Guest");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test0683() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0683");
        com.reservation_system.model.HeadLabCoordinator headLabCoordinator5 = new com.reservation_system.model.HeadLabCoordinator((int) (short) 10, "labmanager", "Researcher", "labmanager", false);
    }

    @Test
    public void test0684() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0684");
        com.reservation_system.model.LabManager labManager5 = new com.reservation_system.model.LabManager((int) (short) 1, "Student", "Faculty", "guest", true);
        labManager5.setApproved(false);
    }

    @Test
    public void test0685() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0685");
        com.reservation_system.model.Guest guest5 = new com.reservation_system.model.Guest((int) (byte) 0, "faculty", "Researcher", "headlabcoordinator", false);
        int int6 = guest5.getID();
        java.lang.Class<?> wildcardClass7 = guest5.getClass();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0686() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0686");
        com.reservation_system.model.LabManager labManager5 = new com.reservation_system.model.LabManager((int) (short) 1, "Guest", "", "Password1!", false);
        java.lang.String str6 = labManager5.getUserType();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "labmanager" + "'", str6, "labmanager");
    }

    @Test
    public void test0687() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0687");
        com.reservation_system.model.Student student5 = new com.reservation_system.model.Student(10, "Faculty", "headlabcoordinator", "Faculty", true);
        java.lang.String str6 = student5.getUserType();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Student" + "'", str6, "Student");
    }

    @Test
    public void test0688() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0688");
        com.reservation_system.model.LabManager labManager5 = new com.reservation_system.model.LabManager(97, "Faculty", "Guest", "Andrew", true);
        java.lang.String str6 = labManager5.getPassword();
        java.lang.Class<?> wildcardClass7 = labManager5.getClass();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Andrew" + "'", str6, "Andrew");
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0689() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0689");
        com.reservation_system.model.LabManager labManager5 = new com.reservation_system.model.LabManager((int) (byte) 10, "Faculty", "labmanager", "labmanager", false);
    }

    @Test
    public void test0690() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0690");
        // The following exception was thrown during execution in test generation
        try {
            com.reservation_system.model.User user6 = com.reservation_system.patterns.factory.UserFactory.createUser("", (int) (short) 100, "Student", "andrew@example.com", "hi!", false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid user type: ");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0691() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0691");
        com.reservation_system.model.Guest guest5 = new com.reservation_system.model.Guest((int) (short) 1, "faculty", "Student", "Faculty", true);
        java.lang.String str6 = guest5.getUserType();
        java.lang.String str7 = guest5.getName();
        boolean boolean8 = guest5.requiresDepartmentApproval();
        boolean boolean9 = guest5.requiresDepartmentApproval();
        java.lang.String str10 = guest5.getUserType();
        guest5.setApproved(true);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Guest" + "'", str6, "Guest");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "faculty" + "'", str7, "faculty");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Guest" + "'", str10, "Guest");
    }

    @Test
    public void test0692() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0692");
        com.reservation_system.model.HeadLabCoordinator headLabCoordinator5 = new com.reservation_system.model.HeadLabCoordinator((int) 'a', "Researcher", "researcher", "", false);
        int int6 = headLabCoordinator5.getID();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 97 + "'", int6 == 97);
    }

    @Test
    public void test0693() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0693");
        com.reservation_system.model.Faculty faculty5 = new com.reservation_system.model.Faculty(100, "researcher", "labmanager", "andrew@example.com", false);
        java.lang.Class<?> wildcardClass6 = faculty5.getClass();
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0694() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0694");
        com.reservation_system.model.User user6 = com.reservation_system.patterns.factory.UserFactory.createUser("faculty", (int) (short) 100, "", "Password1!", "faculty", false);
        org.junit.Assert.assertNotNull(user6);
    }

    @Test
    public void test0695() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0695");
        com.reservation_system.model.Guest guest5 = new com.reservation_system.model.Guest((int) '4', "andrew@example.com", "student", "faculty", true);
        java.lang.String str6 = guest5.getUserType();
        boolean boolean7 = guest5.requiresDepartmentApproval();
        java.lang.String str8 = guest5.getEmail();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Guest" + "'", str6, "Guest");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "student" + "'", str8, "student");
    }

    @Test
    public void test0696() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0696");
        com.reservation_system.model.Guest guest5 = new com.reservation_system.model.Guest((int) ' ', "", "Andrew", "hi!", false);
        java.lang.String str6 = guest5.getEmail();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Andrew" + "'", str6, "Andrew");
    }

    @Test
    public void test0697() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0697");
        com.reservation_system.model.Guest guest5 = new com.reservation_system.model.Guest((int) (short) 1, "faculty", "Student", "Faculty", true);
        java.lang.String str6 = guest5.getUserType();
        guest5.setApproved(false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Guest" + "'", str6, "Guest");
    }

    @Test
    public void test0698() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0698");
        com.reservation_system.model.Guest guest5 = new com.reservation_system.model.Guest((int) '4', "faculty", "labmanager", "faculty", false);
        java.lang.String str6 = guest5.getUserType();
        java.lang.String str7 = guest5.getUserType();
        int int8 = guest5.getID();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Guest" + "'", str6, "Guest");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Guest" + "'", str7, "Guest");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 52 + "'", int8 == 52);
    }

    @Test
    public void test0699() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0699");
        com.reservation_system.model.LabManager labManager5 = new com.reservation_system.model.LabManager((int) (short) 1, "headlabcoordinator", "Andrew", "guest", false);
    }

    @Test
    public void test0700() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0700");
        com.reservation_system.model.Researcher researcher5 = new com.reservation_system.model.Researcher((int) 'a', "", "researcher", "Student", false);
        int int6 = researcher5.getID();
        researcher5.setApproved(true);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 97 + "'", int6 == 97);
    }

    @Test
    public void test0701() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0701");
        com.reservation_system.model.User user6 = com.reservation_system.patterns.factory.UserFactory.createUser("Guest", (int) (short) 0, "guest", "headlabcoordinator", "", false);
        org.junit.Assert.assertNotNull(user6);
    }

    @Test
    public void test0702() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0702");
        com.reservation_system.model.Student student5 = new com.reservation_system.model.Student(97, "Guest", "Faculty", "Student", true);
        java.lang.String str6 = student5.getUserType();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Student" + "'", str6, "Student");
    }

    @Test
    public void test0703() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0703");
        com.reservation_system.model.Researcher researcher5 = new com.reservation_system.model.Researcher(0, "student", "", "student", false);
        java.lang.String str6 = researcher5.getName();
        java.lang.String str7 = researcher5.getName();
        java.lang.String str8 = researcher5.getPassword();
        researcher5.setApproved(false);
        researcher5.setApproved(false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "student" + "'", str6, "student");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "student" + "'", str7, "student");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "student" + "'", str8, "student");
    }

    @Test
    public void test0704() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0704");
        com.reservation_system.model.Student student5 = new com.reservation_system.model.Student((int) (byte) 0, "andrew@example.com", "", "student", true);
        java.lang.Class<?> wildcardClass6 = student5.getClass();
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0705() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0705");
        com.reservation_system.model.Researcher researcher5 = new com.reservation_system.model.Researcher((int) (byte) 1, "guest", "hi!", "", true);
    }

    @Test
    public void test0706() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0706");
        com.reservation_system.model.Faculty faculty5 = new com.reservation_system.model.Faculty(35, "Faculty", "labmanager", "Guest", true);
    }

    @Test
    public void test0707() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0707");
        com.reservation_system.model.Guest guest5 = new com.reservation_system.model.Guest((int) (short) 1, "guest", "faculty", "Student", false);
        boolean boolean6 = guest5.requiresDepartmentApproval();
        java.lang.String str7 = guest5.getUserType();
        int int8 = guest5.getID();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Guest" + "'", str7, "Guest");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
    }

    @Test
    public void test0708() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0708");
        com.reservation_system.model.Researcher researcher5 = new com.reservation_system.model.Researcher(52, "", "Password1!", "guest", false);
    }

    @Test
    public void test0709() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0709");
        com.reservation_system.model.HeadLabCoordinator headLabCoordinator5 = new com.reservation_system.model.HeadLabCoordinator((int) (short) 10, "guest", "", "", false);
    }

    @Test
    public void test0710() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0710");
        com.reservation_system.model.Student student5 = new com.reservation_system.model.Student((int) (byte) -1, "Password1!", "student", "Researcher", false);
        boolean boolean6 = student5.isApproved();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test0711() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0711");
        com.reservation_system.model.Student student5 = new com.reservation_system.model.Student(1, "guest", "hi!", "student", false);
        java.lang.String str6 = student5.getUserType();
        java.lang.String str7 = student5.getUserType();
        java.lang.String str8 = student5.getUserType();
        student5.setApproved(false);
        int int11 = student5.getID();
        java.lang.Class<?> wildcardClass12 = student5.getClass();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Student" + "'", str6, "Student");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Student" + "'", str7, "Student");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Student" + "'", str8, "Student");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0712() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0712");
        // The following exception was thrown during execution in test generation
        try {
            com.reservation_system.model.User user6 = com.reservation_system.patterns.factory.UserFactory.createUser("Password1!", (int) (short) 100, "faculty", "faculty", "Andrew", true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid user type: Password1!");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0713() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0713");
        com.reservation_system.model.LabManager labManager5 = new com.reservation_system.model.LabManager(1, "hi!", "Faculty", "Faculty", false);
    }

    @Test
    public void test0714() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0714");
        com.reservation_system.model.LabManager labManager5 = new com.reservation_system.model.LabManager((int) '4', "student", "Guest", "Password1!", false);
    }

    @Test
    public void test0715() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0715");
        com.reservation_system.model.Faculty faculty5 = new com.reservation_system.model.Faculty((int) 'a', "headlabcoordinator", "", "Researcher", true);
        java.lang.String str6 = faculty5.getEmail();
        java.lang.String str7 = faculty5.getEmail();
        java.lang.String str8 = faculty5.getPassword();
        int int9 = faculty5.getID();
        java.lang.String str10 = faculty5.getPassword();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Researcher" + "'", str8, "Researcher");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 97 + "'", int9 == 97);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Researcher" + "'", str10, "Researcher");
    }

    @Test
    public void test0716() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0716");
        com.reservation_system.model.Faculty faculty5 = new com.reservation_system.model.Faculty(0, "Guest", "Password1!", "Researcher", false);
    }

    @Test
    public void test0717() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0717");
        com.reservation_system.model.Faculty faculty5 = new com.reservation_system.model.Faculty((int) '#', "Guest", "student", "Guest", false);
        boolean boolean6 = faculty5.requiresDepartmentApproval();
        java.lang.String str7 = faculty5.getUserType();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Faculty" + "'", str7, "Faculty");
    }

    @Test
    public void test0718() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0718");
        com.reservation_system.model.Student student5 = new com.reservation_system.model.Student(97, "hi!", "Guest", "Password1!", true);
        java.lang.String str6 = student5.getUserType();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Student" + "'", str6, "Student");
    }

    @Test
    public void test0719() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0719");
        com.reservation_system.model.HeadLabCoordinator headLabCoordinator5 = new com.reservation_system.model.HeadLabCoordinator((int) '4', "", "", "Guest", false);
    }

    @Test
    public void test0720() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0720");
        com.reservation_system.model.Student student5 = new com.reservation_system.model.Student((int) ' ', "faculty", "faculty", "", true);
        java.lang.String str6 = student5.getUserType();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Student" + "'", str6, "Student");
    }

    @Test
    public void test0721() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0721");
        com.reservation_system.model.Faculty faculty5 = new com.reservation_system.model.Faculty((int) (short) 1, "guest", "faculty", "hi!", false);
        java.lang.String str6 = faculty5.getPassword();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
    }

    @Test
    public void test0722() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0722");
        // The following exception was thrown during execution in test generation
        try {
            com.reservation_system.model.User user6 = com.reservation_system.patterns.factory.UserFactory.createUser("", 0, "andrew@example.com", "researcher", "Guest", false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid user type: ");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0723() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0723");
        com.reservation_system.model.HeadLabCoordinator headLabCoordinator5 = new com.reservation_system.model.HeadLabCoordinator(10, "Guest", "Student", "Researcher", true);
        boolean boolean6 = headLabCoordinator5.isApproved();
        int int7 = headLabCoordinator5.getID();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 10 + "'", int7 == 10);
    }

    @Test
    public void test0724() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0724");
        com.reservation_system.model.Guest guest5 = new com.reservation_system.model.Guest(0, "labmanager", "Andrew", "student", false);
    }

    @Test
    public void test0725() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0725");
        com.reservation_system.model.HeadLabCoordinator headLabCoordinator5 = new com.reservation_system.model.HeadLabCoordinator(0, "Student", "Andrew", "Researcher", true);
        boolean boolean6 = headLabCoordinator5.isApproved();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test0726() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0726");
        com.reservation_system.model.Guest guest5 = new com.reservation_system.model.Guest((int) (byte) 0, "Student", "student", "faculty", true);
    }

    @Test
    public void test0727() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0727");
        com.reservation_system.model.Student student5 = new com.reservation_system.model.Student(0, "researcher", "faculty", "", false);
        java.lang.String str6 = student5.getName();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "researcher" + "'", str6, "researcher");
    }

    @Test
    public void test0728() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0728");
        com.reservation_system.model.HeadLabCoordinator headLabCoordinator5 = new com.reservation_system.model.HeadLabCoordinator((int) (short) -1, "Guest", "Password1!", "andrew@example.com", true);
        java.lang.String str6 = headLabCoordinator5.getUserType();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "headlabcoordinator" + "'", str6, "headlabcoordinator");
    }

    @Test
    public void test0729() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0729");
        com.reservation_system.model.Faculty faculty5 = new com.reservation_system.model.Faculty(100, "student", "Faculty", "", false);
        java.lang.Class<?> wildcardClass6 = faculty5.getClass();
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0730() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0730");
        com.reservation_system.model.Student student5 = new com.reservation_system.model.Student(0, "researcher", "student", "hi!", true);
        java.lang.String str6 = student5.getUserType();
        java.lang.String str7 = student5.getName();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Student" + "'", str6, "Student");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "researcher" + "'", str7, "researcher");
    }

    @Test
    public void test0731() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0731");
        com.reservation_system.model.Researcher researcher5 = new com.reservation_system.model.Researcher((int) (short) -1, "andrew@example.com", "", "", true);
        java.lang.String str6 = researcher5.getPassword();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
    }

    @Test
    public void test0732() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0732");
        com.reservation_system.model.User user6 = com.reservation_system.patterns.factory.UserFactory.createUser("Faculty", (int) (byte) -1, "hi!", "headlabcoordinator", "Student", true);
        org.junit.Assert.assertNotNull(user6);
    }

    @Test
    public void test0733() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0733");
        com.reservation_system.model.HeadLabCoordinator headLabCoordinator5 = new com.reservation_system.model.HeadLabCoordinator((int) (short) 0, "researcher", "Guest", "Student", false);
        java.lang.String str6 = headLabCoordinator5.getUserType();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "headlabcoordinator" + "'", str6, "headlabcoordinator");
    }

    @Test
    public void test0734() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0734");
        com.reservation_system.model.Researcher researcher5 = new com.reservation_system.model.Researcher(0, "student", "", "student", false);
        java.lang.String str6 = researcher5.getEmail();
        java.lang.String str7 = researcher5.getEmail();
        java.lang.String str8 = researcher5.getUserType();
        java.lang.String str9 = researcher5.getUserType();
        java.lang.String str10 = researcher5.getUserType();
        java.lang.String str11 = researcher5.getName();
        java.lang.String str12 = researcher5.getUserType();
        boolean boolean13 = researcher5.isApproved();
        java.lang.String str14 = researcher5.getUserType();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Researcher" + "'", str8, "Researcher");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Researcher" + "'", str9, "Researcher");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Researcher" + "'", str10, "Researcher");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "student" + "'", str11, "student");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Researcher" + "'", str12, "Researcher");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Researcher" + "'", str14, "Researcher");
    }

    @Test
    public void test0735() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0735");
        com.reservation_system.model.User user6 = com.reservation_system.patterns.factory.UserFactory.createUser("Researcher", (int) (short) 0, "guest", "researcher", "faculty", false);
        int int7 = user6.getID();
        boolean boolean8 = user6.isApproved();
        org.junit.Assert.assertNotNull(user6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test0736() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0736");
        com.reservation_system.model.Researcher researcher5 = new com.reservation_system.model.Researcher(0, "student", "", "student", false);
        java.lang.String str6 = researcher5.getPassword();
        java.lang.String str7 = researcher5.getEmail();
        int int8 = researcher5.getID();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "student" + "'", str6, "student");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test0737() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0737");
        com.reservation_system.model.Researcher researcher5 = new com.reservation_system.model.Researcher((int) (short) 100, "headlabcoordinator", "Student", "guest", true);
        java.lang.String str6 = researcher5.getUserType();
        researcher5.setApproved(true);
        java.lang.String str9 = researcher5.getEmail();
        boolean boolean10 = researcher5.isApproved();
        java.lang.String str11 = researcher5.getUserType();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Researcher" + "'", str6, "Researcher");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Student" + "'", str9, "Student");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Researcher" + "'", str11, "Researcher");
    }

    @Test
    public void test0738() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0738");
        com.reservation_system.model.Faculty faculty5 = new com.reservation_system.model.Faculty(0, "hi!", "researcher", "researcher", false);
        java.lang.Class<?> wildcardClass6 = faculty5.getClass();
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0739() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0739");
        com.reservation_system.model.HeadLabCoordinator headLabCoordinator5 = new com.reservation_system.model.HeadLabCoordinator((int) (byte) 10, "faculty", "Faculty", "Student", true);
        headLabCoordinator5.setApproved(true);
    }

    @Test
    public void test0740() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0740");
        com.reservation_system.model.Researcher researcher5 = new com.reservation_system.model.Researcher(0, "student", "", "student", false);
        java.lang.String str6 = researcher5.getPassword();
        java.lang.String str7 = researcher5.getEmail();
        boolean boolean8 = researcher5.isApproved();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "student" + "'", str6, "student");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test0741() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0741");
        com.reservation_system.model.Student student5 = new com.reservation_system.model.Student((int) (short) 100, "andrew@example.com", "Student", "Researcher", false);
    }

    @Test
    public void test0742() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0742");
        com.reservation_system.model.Student student5 = new com.reservation_system.model.Student((int) (byte) 0, "andrew@example.com", "andrew@example.com", "Guest", true);
    }

    @Test
    public void test0743() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0743");
        com.reservation_system.model.Faculty faculty5 = new com.reservation_system.model.Faculty((int) (byte) 1, "", "faculty", "", false);
    }

    @Test
    public void test0744() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0744");
        com.reservation_system.model.HeadLabCoordinator headLabCoordinator5 = new com.reservation_system.model.HeadLabCoordinator((int) (short) -1, "headlabcoordinator", "Researcher", "", true);
    }

    @Test
    public void test0745() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0745");
        com.reservation_system.model.Faculty faculty5 = new com.reservation_system.model.Faculty(52, "Faculty", "student", "Student", true);
    }

    @Test
    public void test0746() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0746");
        com.reservation_system.model.Student student5 = new com.reservation_system.model.Student((int) (short) 10, "Guest", "andrew@example.com", "Researcher", true);
        java.lang.String str6 = student5.getUserType();
        java.lang.Class<?> wildcardClass7 = student5.getClass();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Student" + "'", str6, "Student");
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0747() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0747");
        com.reservation_system.model.Guest guest5 = new com.reservation_system.model.Guest((int) (short) 1, "", "Password1!", "Student", true);
        java.lang.String str6 = guest5.getUserType();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Guest" + "'", str6, "Guest");
    }

    @Test
    public void test0748() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0748");
        // The following exception was thrown during execution in test generation
        try {
            com.reservation_system.model.User user6 = com.reservation_system.patterns.factory.UserFactory.createUser("", (int) (short) -1, "labmanager", "Password1!", "researcher", false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid user type: ");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0749() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0749");
        com.reservation_system.model.Researcher researcher5 = new com.reservation_system.model.Researcher(0, "student", "", "student", false);
        java.lang.String str6 = researcher5.getPassword();
        researcher5.setApproved(true);
        java.lang.String str9 = researcher5.getUserType();
        boolean boolean10 = researcher5.isApproved();
        java.lang.String str11 = researcher5.getUserType();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "student" + "'", str6, "student");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Researcher" + "'", str9, "Researcher");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Researcher" + "'", str11, "Researcher");
    }

    @Test
    public void test0750() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0750");
        com.reservation_system.model.User user6 = com.reservation_system.patterns.factory.UserFactory.createUser("headlabcoordinator", 52, "Andrew", "researcher", "Faculty", true);
        org.junit.Assert.assertNotNull(user6);
    }

    @Test
    public void test0751() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0751");
        com.reservation_system.model.HeadLabCoordinator headLabCoordinator5 = new com.reservation_system.model.HeadLabCoordinator(32, "Researcher", "Faculty", "", false);
        java.lang.String str6 = headLabCoordinator5.getUserType();
        headLabCoordinator5.setApproved(true);
        boolean boolean9 = headLabCoordinator5.requiresDepartmentApproval();
        java.lang.String str10 = headLabCoordinator5.getUserType();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "headlabcoordinator" + "'", str6, "headlabcoordinator");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "headlabcoordinator" + "'", str10, "headlabcoordinator");
    }

    @Test
    public void test0752() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0752");
        com.reservation_system.model.User user6 = com.reservation_system.patterns.factory.UserFactory.createUser("student", (-1), "Student", "student", "faculty", true);
        org.junit.Assert.assertNotNull(user6);
    }

    @Test
    public void test0753() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0753");
        com.reservation_system.model.Researcher researcher5 = new com.reservation_system.model.Researcher(100, "Faculty", "student", "", true);
        java.lang.String str6 = researcher5.getName();
        researcher5.setApproved(true);
        int int9 = researcher5.getID();
        boolean boolean10 = researcher5.requiresDepartmentApproval();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Faculty" + "'", str6, "Faculty");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 100 + "'", int9 == 100);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test0754() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0754");
        com.reservation_system.model.Student student5 = new com.reservation_system.model.Student(1, "guest", "hi!", "student", false);
        java.lang.String str6 = student5.getUserType();
        java.lang.String str7 = student5.getUserType();
        java.lang.String str8 = student5.getUserType();
        boolean boolean9 = student5.requiresDepartmentApproval();
        java.lang.String str10 = student5.getName();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Student" + "'", str6, "Student");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Student" + "'", str7, "Student");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Student" + "'", str8, "Student");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "guest" + "'", str10, "guest");
    }

    @Test
    public void test0755() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0755");
        com.reservation_system.model.HeadLabCoordinator headLabCoordinator5 = new com.reservation_system.model.HeadLabCoordinator((int) (short) 0, "", "andrew@example.com", "Andrew", true);
        java.lang.Class<?> wildcardClass6 = headLabCoordinator5.getClass();
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0756() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0756");
        com.reservation_system.model.LabManager labManager5 = new com.reservation_system.model.LabManager((int) (byte) 1, "student", "faculty", "Password1!", true);
        java.lang.String str6 = labManager5.getUserType();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "labmanager" + "'", str6, "labmanager");
    }

    @Test
    public void test0757() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0757");
        com.reservation_system.model.HeadLabCoordinator headLabCoordinator5 = new com.reservation_system.model.HeadLabCoordinator(10, "Guest", "Student", "Researcher", true);
        java.lang.String str6 = headLabCoordinator5.getUserType();
        java.lang.String str7 = headLabCoordinator5.getUserType();
        java.lang.String str8 = headLabCoordinator5.getUserType();
        boolean boolean9 = headLabCoordinator5.isApproved();
        java.lang.String str10 = headLabCoordinator5.getUserType();
        java.lang.String str11 = headLabCoordinator5.getUserType();
        java.lang.String str12 = headLabCoordinator5.getUserType();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "headlabcoordinator" + "'", str6, "headlabcoordinator");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "headlabcoordinator" + "'", str7, "headlabcoordinator");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "headlabcoordinator" + "'", str8, "headlabcoordinator");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "headlabcoordinator" + "'", str10, "headlabcoordinator");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "headlabcoordinator" + "'", str11, "headlabcoordinator");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "headlabcoordinator" + "'", str12, "headlabcoordinator");
    }

    @Test
    public void test0758() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0758");
        com.reservation_system.model.LabManager labManager5 = new com.reservation_system.model.LabManager(97, "Andrew", "", "student", true);
        java.lang.String str6 = labManager5.getName();
        java.lang.String str7 = labManager5.getName();
        boolean boolean8 = labManager5.requiresDepartmentApproval();
        java.lang.Class<?> wildcardClass9 = labManager5.getClass();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Andrew" + "'", str6, "Andrew");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Andrew" + "'", str7, "Andrew");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0759() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0759");
        com.reservation_system.model.User user6 = com.reservation_system.patterns.factory.UserFactory.createUser("headlabcoordinator", (int) (byte) 0, "andrew@example.com", "Guest", "andrew@example.com", true);
        org.junit.Assert.assertNotNull(user6);
    }

    @Test
    public void test0760() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0760");
        com.reservation_system.model.LabManager labManager5 = new com.reservation_system.model.LabManager((int) (byte) 1, "faculty", "headlabcoordinator", "headlabcoordinator", false);
        java.lang.String str6 = labManager5.getUserType();
        labManager5.setApproved(false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "labmanager" + "'", str6, "labmanager");
    }

    @Test
    public void test0761() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0761");
        com.reservation_system.model.HeadLabCoordinator headLabCoordinator5 = new com.reservation_system.model.HeadLabCoordinator(0, "Student", "Andrew", "Researcher", true);
        java.lang.String str6 = headLabCoordinator5.getUserType();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "headlabcoordinator" + "'", str6, "headlabcoordinator");
    }

    @Test
    public void test0762() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0762");
        com.reservation_system.model.Faculty faculty5 = new com.reservation_system.model.Faculty((int) (short) 0, "faculty", "", "Guest", false);
    }

    @Test
    public void test0763() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0763");
        com.reservation_system.model.Researcher researcher5 = new com.reservation_system.model.Researcher((int) '#', "faculty", "headlabcoordinator", "andrew@example.com", true);
    }

    @Test
    public void test0764() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0764");
        com.reservation_system.model.User user6 = com.reservation_system.patterns.factory.UserFactory.createUser("Student", 100, "Researcher", "labmanager", "guest", false);
        user6.setApproved(false);
        java.lang.Class<?> wildcardClass9 = user6.getClass();
        org.junit.Assert.assertNotNull(user6);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0765() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0765");
        com.reservation_system.model.HeadLabCoordinator headLabCoordinator5 = new com.reservation_system.model.HeadLabCoordinator(100, "student", "faculty", "Researcher", true);
        java.lang.String str6 = headLabCoordinator5.getEmail();
        int int7 = headLabCoordinator5.getID();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "faculty" + "'", str6, "faculty");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 100 + "'", int7 == 100);
    }

    @Test
    public void test0766() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0766");
        com.reservation_system.model.Guest guest5 = new com.reservation_system.model.Guest(52, "labmanager", "student", "", false);
        java.lang.String str6 = guest5.getUserType();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Guest" + "'", str6, "Guest");
    }

    @Test
    public void test0767() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0767");
        com.reservation_system.model.Guest guest5 = new com.reservation_system.model.Guest(0, "Researcher", "Student", "faculty", true);
    }

    @Test
    public void test0768() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0768");
        com.reservation_system.model.Researcher researcher5 = new com.reservation_system.model.Researcher((-1), "Andrew", "student", "Faculty", false);
    }

    @Test
    public void test0769() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0769");
        com.reservation_system.model.HeadLabCoordinator headLabCoordinator5 = new com.reservation_system.model.HeadLabCoordinator((int) (byte) 100, "headlabcoordinator", "", "Password1!", false);
        java.lang.String str6 = headLabCoordinator5.getUserType();
        java.lang.String str7 = headLabCoordinator5.getUserType();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "headlabcoordinator" + "'", str6, "headlabcoordinator");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "headlabcoordinator" + "'", str7, "headlabcoordinator");
    }

    @Test
    public void test0770() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0770");
        com.reservation_system.model.Faculty faculty5 = new com.reservation_system.model.Faculty((int) (byte) 0, "student", "Researcher", "hi!", true);
        java.lang.String str6 = faculty5.getUserType();
        faculty5.setApproved(false);
        java.lang.Class<?> wildcardClass9 = faculty5.getClass();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Faculty" + "'", str6, "Faculty");
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0771() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0771");
        com.reservation_system.model.Faculty faculty5 = new com.reservation_system.model.Faculty((int) '#', "Faculty", "guest", "headlabcoordinator", true);
    }

    @Test
    public void test0772() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0772");
        com.reservation_system.model.Student student5 = new com.reservation_system.model.Student((int) 'a', "headlabcoordinator", "Guest", "", false);
        int int6 = student5.getID();
        boolean boolean7 = student5.requiresDepartmentApproval();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 97 + "'", int6 == 97);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test0773() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0773");
        com.reservation_system.model.LabManager labManager5 = new com.reservation_system.model.LabManager(97, "Faculty", "Guest", "Andrew", true);
        java.lang.String str6 = labManager5.getPassword();
        java.lang.String str7 = labManager5.getUserType();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Andrew" + "'", str6, "Andrew");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "labmanager" + "'", str7, "labmanager");
    }

    @Test
    public void test0774() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0774");
        com.reservation_system.model.Student student5 = new com.reservation_system.model.Student((int) (short) -1, "guest", "Student", "andrew@example.com", false);
    }

    @Test
    public void test0775() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0775");
        com.reservation_system.model.LabManager labManager5 = new com.reservation_system.model.LabManager(10, "Faculty", "guest", "Andrew", false);
        int int6 = labManager5.getID();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
    }

    @Test
    public void test0776() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0776");
        com.reservation_system.model.HeadLabCoordinator headLabCoordinator5 = new com.reservation_system.model.HeadLabCoordinator((-1), "headlabcoordinator", "headlabcoordinator", "researcher", true);
        java.lang.String str6 = headLabCoordinator5.getUserType();
        boolean boolean7 = headLabCoordinator5.isApproved();
        java.lang.String str8 = headLabCoordinator5.getUserType();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "headlabcoordinator" + "'", str6, "headlabcoordinator");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "headlabcoordinator" + "'", str8, "headlabcoordinator");
    }

    @Test
    public void test0777() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0777");
        com.reservation_system.model.Researcher researcher5 = new com.reservation_system.model.Researcher((int) (byte) 100, "guest", "Password1!", "Password1!", false);
        java.lang.String str6 = researcher5.getUserType();
        java.lang.String str7 = researcher5.getEmail();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Researcher" + "'", str6, "Researcher");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Password1!" + "'", str7, "Password1!");
    }

    @Test
    public void test0778() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0778");
        com.reservation_system.model.Faculty faculty5 = new com.reservation_system.model.Faculty((int) (short) 10, "Student", "headlabcoordinator", "labmanager", false);
    }

    @Test
    public void test0779() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0779");
        com.reservation_system.model.Guest guest5 = new com.reservation_system.model.Guest(32, "Faculty", "Faculty", "Researcher", false);
        java.lang.String str6 = guest5.getUserType();
        java.lang.String str7 = guest5.getUserType();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Guest" + "'", str6, "Guest");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Guest" + "'", str7, "Guest");
    }

    @Test
    public void test0780() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0780");
        com.reservation_system.model.Faculty faculty5 = new com.reservation_system.model.Faculty(0, "Researcher", "guest", "hi!", true);
        java.lang.String str6 = faculty5.getUserType();
        boolean boolean7 = faculty5.requiresDepartmentApproval();
        boolean boolean8 = faculty5.requiresDepartmentApproval();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Faculty" + "'", str6, "Faculty");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test0781() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0781");
        com.reservation_system.model.Student student5 = new com.reservation_system.model.Student((int) (byte) -1, "", "headlabcoordinator", "Researcher", false);
        java.lang.String str6 = student5.getName();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
    }

    @Test
    public void test0782() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0782");
        com.reservation_system.model.Guest guest5 = new com.reservation_system.model.Guest((int) '4', "faculty", "labmanager", "faculty", false);
        java.lang.String str6 = guest5.getUserType();
        boolean boolean7 = guest5.requiresDepartmentApproval();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Guest" + "'", str6, "Guest");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test0783() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0783");
        com.reservation_system.model.User user6 = com.reservation_system.patterns.factory.UserFactory.createUser("labmanager", (int) (short) -1, "", "Student", "Andrew", false);
        org.junit.Assert.assertNotNull(user6);
    }

    @Test
    public void test0784() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0784");
        com.reservation_system.model.Researcher researcher5 = new com.reservation_system.model.Researcher(0, "student", "", "student", false);
        java.lang.String str6 = researcher5.getEmail();
        java.lang.String str7 = researcher5.getEmail();
        java.lang.String str8 = researcher5.getUserType();
        java.lang.String str9 = researcher5.getUserType();
        java.lang.String str10 = researcher5.getUserType();
        java.lang.String str11 = researcher5.getName();
        java.lang.String str12 = researcher5.getUserType();
        java.lang.String str13 = researcher5.getEmail();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Researcher" + "'", str8, "Researcher");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Researcher" + "'", str9, "Researcher");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Researcher" + "'", str10, "Researcher");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "student" + "'", str11, "student");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Researcher" + "'", str12, "Researcher");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
    }

    @Test
    public void test0785() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0785");
        com.reservation_system.model.Faculty faculty5 = new com.reservation_system.model.Faculty((-1), "hi!", "labmanager", "Andrew", true);
        java.lang.String str6 = faculty5.getName();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
    }

    @Test
    public void test0786() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0786");
        com.reservation_system.model.Researcher researcher5 = new com.reservation_system.model.Researcher(0, "student", "", "student", false);
        java.lang.String str6 = researcher5.getEmail();
        java.lang.String str7 = researcher5.getPassword();
        java.lang.String str8 = researcher5.getName();
        boolean boolean9 = researcher5.requiresDepartmentApproval();
        java.lang.String str10 = researcher5.getUserType();
        researcher5.setApproved(false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "student" + "'", str7, "student");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "student" + "'", str8, "student");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Researcher" + "'", str10, "Researcher");
    }

    @Test
    public void test0787() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0787");
        com.reservation_system.model.LabManager labManager5 = new com.reservation_system.model.LabManager((int) (short) -1, "Student", "researcher", "Faculty", false);
    }

    @Test
    public void test0788() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0788");
        com.reservation_system.model.Guest guest5 = new com.reservation_system.model.Guest((int) (short) 0, "student", "student", "Student", false);
        java.lang.String str6 = guest5.getUserType();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Guest" + "'", str6, "Guest");
    }

    @Test
    public void test0789() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0789");
        com.reservation_system.model.Student student5 = new com.reservation_system.model.Student(10, "student", "Student", "student", false);
        java.lang.String str6 = student5.getUserType();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Student" + "'", str6, "Student");
    }

    @Test
    public void test0790() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0790");
        com.reservation_system.model.Guest guest5 = new com.reservation_system.model.Guest((int) ' ', "student", "labmanager", "Researcher", true);
        java.lang.String str6 = guest5.getUserType();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Guest" + "'", str6, "Guest");
    }

    @Test
    public void test0791() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0791");
        com.reservation_system.model.Researcher researcher5 = new com.reservation_system.model.Researcher((int) '#', "Researcher", "labmanager", "student", false);
    }

    @Test
    public void test0792() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0792");
        com.reservation_system.model.Faculty faculty5 = new com.reservation_system.model.Faculty((int) ' ', "hi!", "guest", "faculty", false);
    }

    @Test
    public void test0793() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0793");
        com.reservation_system.model.LabManager labManager5 = new com.reservation_system.model.LabManager((int) (short) 10, "headlabcoordinator", "Andrew", "guest", true);
        java.lang.String str6 = labManager5.getPassword();
        boolean boolean7 = labManager5.requiresDepartmentApproval();
        java.lang.String str8 = labManager5.getName();
        labManager5.setApproved(true);
        java.lang.String str11 = labManager5.getUserType();
        java.lang.Class<?> wildcardClass12 = labManager5.getClass();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "guest" + "'", str6, "guest");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "headlabcoordinator" + "'", str8, "headlabcoordinator");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "labmanager" + "'", str11, "labmanager");
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0794() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0794");
        com.reservation_system.model.Researcher researcher5 = new com.reservation_system.model.Researcher((-1), "guest", "andrew@example.com", "Guest", true);
        java.lang.String str6 = researcher5.getUserType();
        java.lang.String str7 = researcher5.getUserType();
        boolean boolean8 = researcher5.isApproved();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Researcher" + "'", str6, "Researcher");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Researcher" + "'", str7, "Researcher");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test0795() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0795");
        com.reservation_system.model.HeadLabCoordinator headLabCoordinator5 = new com.reservation_system.model.HeadLabCoordinator(0, "hi!", "faculty", "Password1!", true);
        java.lang.String str6 = headLabCoordinator5.getEmail();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "faculty" + "'", str6, "faculty");
    }

    @Test
    public void test0796() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0796");
        com.reservation_system.model.Faculty faculty5 = new com.reservation_system.model.Faculty(0, "headlabcoordinator", "hi!", "Researcher", false);
    }

    @Test
    public void test0797() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0797");
        com.reservation_system.model.Guest guest5 = new com.reservation_system.model.Guest((int) (short) 10, "Student", "", "Andrew", true);
    }

    @Test
    public void test0798() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0798");
        com.reservation_system.model.Researcher researcher5 = new com.reservation_system.model.Researcher((int) (byte) -1, "", "headlabcoordinator", "headlabcoordinator", true);
        java.lang.String str6 = researcher5.getUserType();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Researcher" + "'", str6, "Researcher");
    }

    @Test
    public void test0799() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0799");
        com.reservation_system.model.Guest guest5 = new com.reservation_system.model.Guest(52, "guest", "researcher", "student", true);
    }

    @Test
    public void test0800() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0800");
        com.reservation_system.model.LabManager labManager5 = new com.reservation_system.model.LabManager((int) (short) -1, "headlabcoordinator", "faculty", "Researcher", true);
        java.lang.String str6 = labManager5.getUserType();
        java.lang.String str7 = labManager5.getName();
        java.lang.String str8 = labManager5.getUserType();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "labmanager" + "'", str6, "labmanager");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "headlabcoordinator" + "'", str7, "headlabcoordinator");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "labmanager" + "'", str8, "labmanager");
    }

    @Test
    public void test0801() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0801");
        com.reservation_system.model.Faculty faculty5 = new com.reservation_system.model.Faculty(52, "headlabcoordinator", "labmanager", "Guest", false);
    }

    @Test
    public void test0802() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0802");
        com.reservation_system.model.Guest guest5 = new com.reservation_system.model.Guest((int) (short) -1, "guest", "researcher", "andrew@example.com", true);
    }

    @Test
    public void test0803() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0803");
        // The following exception was thrown during execution in test generation
        try {
            com.reservation_system.model.User user6 = com.reservation_system.patterns.factory.UserFactory.createUser("hi!", 35, "", "Faculty", "Student", false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid user type: hi!");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0804() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0804");
        com.reservation_system.model.Guest guest5 = new com.reservation_system.model.Guest((int) (byte) -1, "Guest", "Guest", "headlabcoordinator", true);
    }

    @Test
    public void test0805() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0805");
        com.reservation_system.model.Guest guest5 = new com.reservation_system.model.Guest((int) '#', "labmanager", "Faculty", "headlabcoordinator", false);
        java.lang.String str6 = guest5.getUserType();
        boolean boolean7 = guest5.isApproved();
        guest5.setApproved(false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Guest" + "'", str6, "Guest");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test0806() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0806");
        com.reservation_system.model.Guest guest5 = new com.reservation_system.model.Guest((int) (short) 0, "", "researcher", "researcher", true);
    }

    @Test
    public void test0807() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0807");
        com.reservation_system.model.Researcher researcher5 = new com.reservation_system.model.Researcher((int) (short) 1, "student", "Faculty", "Student", false);
        researcher5.setApproved(false);
    }

    @Test
    public void test0808() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0808");
        com.reservation_system.model.LabManager labManager5 = new com.reservation_system.model.LabManager((int) (short) 10, "headlabcoordinator", "Andrew", "guest", true);
        java.lang.String str6 = labManager5.getUserType();
        java.lang.String str7 = labManager5.getUserType();
        java.lang.String str8 = labManager5.getUserType();
        labManager5.setApproved(false);
        java.lang.String str11 = labManager5.getUserType();
        java.lang.String str12 = labManager5.getUserType();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "labmanager" + "'", str6, "labmanager");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "labmanager" + "'", str7, "labmanager");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "labmanager" + "'", str8, "labmanager");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "labmanager" + "'", str11, "labmanager");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "labmanager" + "'", str12, "labmanager");
    }

    @Test
    public void test0809() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0809");
        com.reservation_system.model.Guest guest5 = new com.reservation_system.model.Guest((int) (short) 0, "", "faculty", "Student", false);
    }

    @Test
    public void test0810() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0810");
        com.reservation_system.model.HeadLabCoordinator headLabCoordinator5 = new com.reservation_system.model.HeadLabCoordinator(10, "Researcher", "headlabcoordinator", "hi!", true);
    }

    @Test
    public void test0811() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0811");
        com.reservation_system.model.Researcher researcher5 = new com.reservation_system.model.Researcher((int) (byte) 0, "Password1!", "Password1!", "Student", true);
    }

    @Test
    public void test0812() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0812");
        com.reservation_system.model.User user6 = com.reservation_system.patterns.factory.UserFactory.createUser("Student", 32, "Andrew", "Andrew", "Password1!", false);
        org.junit.Assert.assertNotNull(user6);
    }

    @Test
    public void test0813() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0813");
        com.reservation_system.model.Researcher researcher5 = new com.reservation_system.model.Researcher((int) (byte) 0, "faculty", "guest", "Password1!", false);
    }

    @Test
    public void test0814() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0814");
        com.reservation_system.model.LabManager labManager5 = new com.reservation_system.model.LabManager((int) '#', "student", "Password1!", "Guest", true);
        boolean boolean6 = labManager5.requiresDepartmentApproval();
        java.lang.String str7 = labManager5.getName();
        int int8 = labManager5.getID();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "student" + "'", str7, "student");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 35 + "'", int8 == 35);
    }

    @Test
    public void test0815() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0815");
        com.reservation_system.model.Student student5 = new com.reservation_system.model.Student(1, "guest", "guest", "faculty", true);
    }

    @Test
    public void test0816() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0816");
        com.reservation_system.model.LabManager labManager5 = new com.reservation_system.model.LabManager((int) (byte) -1, "guest", "headlabcoordinator", "Guest", false);
        java.lang.String str6 = labManager5.getEmail();
        int int7 = labManager5.getID();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "headlabcoordinator" + "'", str6, "headlabcoordinator");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
    }

    @Test
    public void test0817() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0817");
        com.reservation_system.model.Student student5 = new com.reservation_system.model.Student(35, "", "guest", "researcher", false);
    }

    @Test
    public void test0818() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0818");
        com.reservation_system.model.Guest guest5 = new com.reservation_system.model.Guest((int) '4', "andrew@example.com", "student", "faculty", true);
        boolean boolean6 = guest5.isApproved();
        boolean boolean7 = guest5.isApproved();
        java.lang.String str8 = guest5.getUserType();
        boolean boolean9 = guest5.isApproved();
        java.lang.String str10 = guest5.getUserType();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Guest" + "'", str8, "Guest");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Guest" + "'", str10, "Guest");
    }

    @Test
    public void test0819() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0819");
        com.reservation_system.model.Student student5 = new com.reservation_system.model.Student((int) (byte) 0, "andrew@example.com", "", "student", true);
        java.lang.String str6 = student5.getUserType();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Student" + "'", str6, "Student");
    }

    @Test
    public void test0820() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0820");
        com.reservation_system.model.Guest guest5 = new com.reservation_system.model.Guest((int) (byte) 10, "hi!", "", "researcher", true);
    }

    @Test
    public void test0821() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0821");
        com.reservation_system.model.User user6 = com.reservation_system.patterns.factory.UserFactory.createUser("faculty", 100, "Guest", "Faculty", "headlabcoordinator", false);
        org.junit.Assert.assertNotNull(user6);
    }

    @Test
    public void test0822() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0822");
        com.reservation_system.model.LabManager labManager5 = new com.reservation_system.model.LabManager(97, "faculty", "student", "andrew@example.com", false);
        boolean boolean6 = labManager5.isApproved();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test0823() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0823");
        com.reservation_system.model.Student student5 = new com.reservation_system.model.Student((int) (short) 10, "Guest", "Student", "", true);
        java.lang.Class<?> wildcardClass6 = student5.getClass();
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0824() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0824");
        com.reservation_system.model.Faculty faculty5 = new com.reservation_system.model.Faculty(97, "researcher", "student", "andrew@example.com", false);
    }

    @Test
    public void test0825() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0825");
        com.reservation_system.model.Researcher researcher5 = new com.reservation_system.model.Researcher((int) '4', "researcher", "", "guest", true);
        researcher5.setApproved(false);
        java.lang.Class<?> wildcardClass8 = researcher5.getClass();
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0826() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0826");
        com.reservation_system.model.Student student5 = new com.reservation_system.model.Student((-1), "andrew@example.com", "", "", true);
        boolean boolean6 = student5.requiresDepartmentApproval();
        student5.setApproved(false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test0827() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0827");
        com.reservation_system.model.Researcher researcher5 = new com.reservation_system.model.Researcher(0, "student", "", "student", false);
        java.lang.String str6 = researcher5.getPassword();
        int int7 = researcher5.getID();
        int int8 = researcher5.getID();
        java.lang.String str9 = researcher5.getUserType();
        java.lang.String str10 = researcher5.getName();
        researcher5.setApproved(false);
        java.lang.String str13 = researcher5.getUserType();
        researcher5.setApproved(true);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "student" + "'", str6, "student");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Researcher" + "'", str9, "Researcher");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "student" + "'", str10, "student");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Researcher" + "'", str13, "Researcher");
    }

    @Test
    public void test0828() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0828");
        com.reservation_system.model.Faculty faculty5 = new com.reservation_system.model.Faculty((int) (short) -1, "", "faculty", "", false);
    }

    @Test
    public void test0829() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0829");
        com.reservation_system.model.Researcher researcher5 = new com.reservation_system.model.Researcher(100, "Guest", "", "hi!", true);
        java.lang.Class<?> wildcardClass6 = researcher5.getClass();
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0830() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0830");
        com.reservation_system.model.Researcher researcher5 = new com.reservation_system.model.Researcher(32, "andrew@example.com", "Researcher", "Student", false);
        researcher5.setApproved(false);
        java.lang.String str8 = researcher5.getUserType();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Researcher" + "'", str8, "Researcher");
    }

    @Test
    public void test0831() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0831");
        com.reservation_system.model.LabManager labManager5 = new com.reservation_system.model.LabManager((int) (short) 10, "headlabcoordinator", "Andrew", "guest", true);
        java.lang.String str6 = labManager5.getUserType();
        java.lang.String str7 = labManager5.getUserType();
        java.lang.String str8 = labManager5.getUserType();
        java.lang.String str9 = labManager5.getEmail();
        java.lang.String str10 = labManager5.getUserType();
        boolean boolean11 = labManager5.isApproved();
        java.lang.String str12 = labManager5.getName();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "labmanager" + "'", str6, "labmanager");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "labmanager" + "'", str7, "labmanager");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "labmanager" + "'", str8, "labmanager");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Andrew" + "'", str9, "Andrew");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "labmanager" + "'", str10, "labmanager");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "headlabcoordinator" + "'", str12, "headlabcoordinator");
    }

    @Test
    public void test0832() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0832");
        com.reservation_system.model.Student student5 = new com.reservation_system.model.Student((int) (short) 100, "headlabcoordinator", "Faculty", "student", false);
        java.lang.String str6 = student5.getName();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "headlabcoordinator" + "'", str6, "headlabcoordinator");
    }

    @Test
    public void test0833() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0833");
        com.reservation_system.model.Student student5 = new com.reservation_system.model.Student((int) (byte) 100, "headlabcoordinator", "headlabcoordinator", "guest", false);
        java.lang.String str6 = student5.getUserType();
        java.lang.String str7 = student5.getUserType();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Student" + "'", str6, "Student");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Student" + "'", str7, "Student");
    }

    @Test
    public void test0834() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0834");
        com.reservation_system.model.User user6 = com.reservation_system.patterns.factory.UserFactory.createUser("Student", (int) ' ', "Student", "", "faculty", true);
        boolean boolean7 = user6.requiresDepartmentApproval();
        org.junit.Assert.assertNotNull(user6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test0835() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0835");
        com.reservation_system.model.LabManager labManager5 = new com.reservation_system.model.LabManager((int) (short) 100, "labmanager", "Password1!", "faculty", false);
        boolean boolean6 = labManager5.requiresDepartmentApproval();
        boolean boolean7 = labManager5.isApproved();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test0836() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0836");
        com.reservation_system.model.Faculty faculty5 = new com.reservation_system.model.Faculty((int) 'a', "headlabcoordinator", "", "Researcher", true);
        java.lang.String str6 = faculty5.getEmail();
        java.lang.String str7 = faculty5.getEmail();
        java.lang.String str8 = faculty5.getPassword();
        int int9 = faculty5.getID();
        java.lang.String str10 = faculty5.getUserType();
        java.lang.String str11 = faculty5.getUserType();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Researcher" + "'", str8, "Researcher");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 97 + "'", int9 == 97);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Faculty" + "'", str10, "Faculty");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Faculty" + "'", str11, "Faculty");
    }

    @Test
    public void test0837() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0837");
        com.reservation_system.model.Student student5 = new com.reservation_system.model.Student((int) ' ', "guest", "headlabcoordinator", "Researcher", false);
        java.lang.Class<?> wildcardClass6 = student5.getClass();
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0838() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0838");
        com.reservation_system.model.User user6 = com.reservation_system.patterns.factory.UserFactory.createUser("Guest", (int) (byte) 10, "Andrew", "student", "student", true);
        org.junit.Assert.assertNotNull(user6);
    }

    @Test
    public void test0839() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0839");
        com.reservation_system.model.Researcher researcher5 = new com.reservation_system.model.Researcher(0, "student", "", "student", false);
        java.lang.String str6 = researcher5.getUserType();
        boolean boolean7 = researcher5.isApproved();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Researcher" + "'", str6, "Researcher");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test0840() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0840");
        com.reservation_system.model.Faculty faculty5 = new com.reservation_system.model.Faculty(0, "hi!", "researcher", "researcher", false);
        java.lang.String str6 = faculty5.getUserType();
        java.lang.String str7 = faculty5.getName();
        boolean boolean8 = faculty5.requiresDepartmentApproval();
        java.lang.String str9 = faculty5.getPassword();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Faculty" + "'", str6, "Faculty");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "researcher" + "'", str9, "researcher");
    }

    @Test
    public void test0841() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0841");
        com.reservation_system.model.Guest guest5 = new com.reservation_system.model.Guest((int) (byte) -1, "guest", "Faculty", "Password1!", false);
    }

    @Test
    public void test0842() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0842");
        com.reservation_system.model.Student student5 = new com.reservation_system.model.Student((int) (byte) 0, "", "guest", "labmanager", true);
        java.lang.String str6 = student5.getUserType();
        int int7 = student5.getID();
        boolean boolean8 = student5.isApproved();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Student" + "'", str6, "Student");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test0843() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0843");
        com.reservation_system.model.User user6 = com.reservation_system.patterns.factory.UserFactory.createUser("Guest", 1, "Researcher", "", "guest", true);
        java.lang.String str7 = user6.getPassword();
        org.junit.Assert.assertNotNull(user6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "guest" + "'", str7, "guest");
    }

    @Test
    public void test0844() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0844");
        com.reservation_system.model.Guest guest5 = new com.reservation_system.model.Guest((int) (short) 0, "", "", "andrew@example.com", true);
    }

    @Test
    public void test0845() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0845");
        com.reservation_system.model.User user6 = com.reservation_system.patterns.factory.UserFactory.createUser("Faculty", 52, "hi!", "guest", "Password1!", true);
        int int7 = user6.getID();
        org.junit.Assert.assertNotNull(user6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 52 + "'", int7 == 52);
    }

    @Test
    public void test0846() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0846");
        com.reservation_system.model.Researcher researcher5 = new com.reservation_system.model.Researcher(0, "student", "", "student", false);
        java.lang.String str6 = researcher5.getEmail();
        java.lang.String str7 = researcher5.getEmail();
        java.lang.String str8 = researcher5.getUserType();
        java.lang.String str9 = researcher5.getUserType();
        java.lang.String str10 = researcher5.getUserType();
        java.lang.String str11 = researcher5.getUserType();
        boolean boolean12 = researcher5.isApproved();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Researcher" + "'", str8, "Researcher");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Researcher" + "'", str9, "Researcher");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Researcher" + "'", str10, "Researcher");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Researcher" + "'", str11, "Researcher");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test0847() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0847");
        com.reservation_system.model.LabManager labManager5 = new com.reservation_system.model.LabManager((int) (short) 10, "headlabcoordinator", "Andrew", "guest", true);
        java.lang.String str6 = labManager5.getUserType();
        java.lang.String str7 = labManager5.getUserType();
        java.lang.String str8 = labManager5.getUserType();
        java.lang.String str9 = labManager5.getEmail();
        java.lang.String str10 = labManager5.getPassword();
        java.lang.String str11 = labManager5.getUserType();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "labmanager" + "'", str6, "labmanager");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "labmanager" + "'", str7, "labmanager");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "labmanager" + "'", str8, "labmanager");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Andrew" + "'", str9, "Andrew");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "guest" + "'", str10, "guest");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "labmanager" + "'", str11, "labmanager");
    }

    @Test
    public void test0848() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0848");
        com.reservation_system.model.LabManager labManager5 = new com.reservation_system.model.LabManager((int) '#', "Faculty", "andrew@example.com", "", false);
    }

    @Test
    public void test0849() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0849");
        com.reservation_system.model.Faculty faculty5 = new com.reservation_system.model.Faculty(100, "faculty", "labmanager", "", false);
        java.lang.String str6 = faculty5.getPassword();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
    }

    @Test
    public void test0850() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0850");
        com.reservation_system.model.Guest guest5 = new com.reservation_system.model.Guest((int) '4', "andrew@example.com", "student", "student", false);
        guest5.setApproved(false);
        java.lang.String str8 = guest5.getUserType();
        java.lang.String str9 = guest5.getUserType();
        java.lang.String str10 = guest5.getEmail();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Guest" + "'", str8, "Guest");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Guest" + "'", str9, "Guest");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "student" + "'", str10, "student");
    }

    @Test
    public void test0851() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0851");
        com.reservation_system.model.LabManager labManager5 = new com.reservation_system.model.LabManager((int) (byte) -1, "guest", "headlabcoordinator", "Guest", false);
        java.lang.String str6 = labManager5.getPassword();
        java.lang.String str7 = labManager5.getUserType();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Guest" + "'", str6, "Guest");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "labmanager" + "'", str7, "labmanager");
    }

    @Test
    public void test0852() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0852");
        com.reservation_system.model.Student student5 = new com.reservation_system.model.Student(0, "researcher", "", "Faculty", false);
    }

    @Test
    public void test0853() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0853");
        com.reservation_system.model.Researcher researcher5 = new com.reservation_system.model.Researcher(0, "student", "", "student", false);
        java.lang.String str6 = researcher5.getEmail();
        java.lang.String str7 = researcher5.getEmail();
        boolean boolean8 = researcher5.isApproved();
        boolean boolean9 = researcher5.requiresDepartmentApproval();
        java.lang.String str10 = researcher5.getUserType();
        int int11 = researcher5.getID();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Researcher" + "'", str10, "Researcher");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test0854() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0854");
        com.reservation_system.model.Researcher researcher5 = new com.reservation_system.model.Researcher(1, "faculty", "Andrew", "Guest", true);
    }

    @Test
    public void test0855() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0855");
        com.reservation_system.model.HeadLabCoordinator headLabCoordinator5 = new com.reservation_system.model.HeadLabCoordinator((int) '4', "Guest", "Researcher", "Researcher", false);
        boolean boolean6 = headLabCoordinator5.isApproved();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test0856() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0856");
        com.reservation_system.model.Student student5 = new com.reservation_system.model.Student(1, "guest", "faculty", "", false);
    }

    @Test
    public void test0857() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0857");
        com.reservation_system.model.Faculty faculty5 = new com.reservation_system.model.Faculty(10, "hi!", "", "guest", false);
        java.lang.String str6 = faculty5.getUserType();
        java.lang.String str7 = faculty5.getUserType();
        java.lang.String str8 = faculty5.getEmail();
        java.lang.String str9 = faculty5.getPassword();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Faculty" + "'", str6, "Faculty");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Faculty" + "'", str7, "Faculty");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "guest" + "'", str9, "guest");
    }

    @Test
    public void test0858() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0858");
        com.reservation_system.model.Student student5 = new com.reservation_system.model.Student(10, "Student", "hi!", "researcher", true);
    }

    @Test
    public void test0859() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0859");
        com.reservation_system.model.LabManager labManager5 = new com.reservation_system.model.LabManager((int) '4', "", "Andrew", "Researcher", true);
    }

    @Test
    public void test0860() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0860");
        com.reservation_system.model.Student student5 = new com.reservation_system.model.Student(1, "", "headlabcoordinator", "andrew@example.com", false);
        java.lang.String str6 = student5.getUserType();
        java.lang.Class<?> wildcardClass7 = student5.getClass();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Student" + "'", str6, "Student");
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0861() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0861");
        com.reservation_system.model.HeadLabCoordinator headLabCoordinator5 = new com.reservation_system.model.HeadLabCoordinator((int) 'a', "researcher", "Password1!", "researcher", false);
        int int6 = headLabCoordinator5.getID();
        java.lang.String str7 = headLabCoordinator5.getPassword();
        headLabCoordinator5.setApproved(false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 97 + "'", int6 == 97);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "researcher" + "'", str7, "researcher");
    }

    @Test
    public void test0862() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0862");
        // The following exception was thrown during execution in test generation
        try {
            com.reservation_system.model.User user6 = com.reservation_system.patterns.factory.UserFactory.createUser("", 35, "researcher", "", "Researcher", false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid user type: ");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0863() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0863");
        com.reservation_system.model.Student student5 = new com.reservation_system.model.Student((int) (byte) 100, "headlabcoordinator", "headlabcoordinator", "guest", false);
        java.lang.String str6 = student5.getUserType();
        java.lang.String str7 = student5.getPassword();
        java.lang.String str8 = student5.getUserType();
        java.lang.String str9 = student5.getUserType();
        student5.setApproved(true);
        int int12 = student5.getID();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Student" + "'", str6, "Student");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "guest" + "'", str7, "guest");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Student" + "'", str8, "Student");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Student" + "'", str9, "Student");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 100 + "'", int12 == 100);
    }

    @Test
    public void test0864() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0864");
        com.reservation_system.model.Guest guest5 = new com.reservation_system.model.Guest((int) '4', "andrew@example.com", "student", "faculty", true);
        java.lang.String str6 = guest5.getUserType();
        java.lang.String str7 = guest5.getName();
        int int8 = guest5.getID();
        java.lang.String str9 = guest5.getUserType();
        java.lang.String str10 = guest5.getUserType();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Guest" + "'", str6, "Guest");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 52 + "'", int8 == 52);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Guest" + "'", str9, "Guest");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Guest" + "'", str10, "Guest");
    }

    @Test
    public void test0865() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0865");
        com.reservation_system.model.Guest guest5 = new com.reservation_system.model.Guest((int) '#', "faculty", "Guest", "researcher", false);
        java.lang.String str6 = guest5.getUserType();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Guest" + "'", str6, "Guest");
    }

    @Test
    public void test0866() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0866");
        com.reservation_system.model.Faculty faculty5 = new com.reservation_system.model.Faculty(0, "Password1!", "guest", "", false);
    }

    @Test
    public void test0867() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0867");
        com.reservation_system.model.LabManager labManager5 = new com.reservation_system.model.LabManager((int) '#', "student", "Password1!", "Guest", true);
        boolean boolean6 = labManager5.requiresDepartmentApproval();
        java.lang.String str7 = labManager5.getName();
        java.lang.Class<?> wildcardClass8 = labManager5.getClass();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "student" + "'", str7, "student");
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0868() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0868");
        com.reservation_system.model.Guest guest5 = new com.reservation_system.model.Guest((int) '4', "andrew@example.com", "student", "faculty", true);
        java.lang.String str6 = guest5.getUserType();
        java.lang.String str7 = guest5.getName();
        java.lang.String str8 = guest5.getUserType();
        int int9 = guest5.getID();
        java.lang.String str10 = guest5.getUserType();
        java.lang.String str11 = guest5.getUserType();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Guest" + "'", str6, "Guest");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Guest" + "'", str8, "Guest");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 52 + "'", int9 == 52);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Guest" + "'", str10, "Guest");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Guest" + "'", str11, "Guest");
    }

    @Test
    public void test0869() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0869");
        com.reservation_system.model.Researcher researcher5 = new com.reservation_system.model.Researcher((int) (byte) -1, "headlabcoordinator", "Faculty", "guest", true);
        java.lang.String str6 = researcher5.getUserType();
        boolean boolean7 = researcher5.requiresDepartmentApproval();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Researcher" + "'", str6, "Researcher");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test0870() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0870");
        com.reservation_system.model.Faculty faculty5 = new com.reservation_system.model.Faculty(35, "labmanager", "hi!", "andrew@example.com", false);
    }

    @Test
    public void test0871() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0871");
        com.reservation_system.model.HeadLabCoordinator headLabCoordinator5 = new com.reservation_system.model.HeadLabCoordinator(32, "hi!", "", "Researcher", true);
        java.lang.String str6 = headLabCoordinator5.getUserType();
        java.lang.String str7 = headLabCoordinator5.getUserType();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "headlabcoordinator" + "'", str6, "headlabcoordinator");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "headlabcoordinator" + "'", str7, "headlabcoordinator");
    }

    @Test
    public void test0872() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0872");
        com.reservation_system.model.Researcher researcher5 = new com.reservation_system.model.Researcher(0, "student", "", "student", false);
        java.lang.String str6 = researcher5.getEmail();
        java.lang.String str7 = researcher5.getEmail();
        java.lang.String str8 = researcher5.getUserType();
        java.lang.String str9 = researcher5.getUserType();
        java.lang.String str10 = researcher5.getUserType();
        java.lang.String str11 = researcher5.getUserType();
        java.lang.String str12 = researcher5.getName();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Researcher" + "'", str8, "Researcher");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Researcher" + "'", str9, "Researcher");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Researcher" + "'", str10, "Researcher");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Researcher" + "'", str11, "Researcher");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "student" + "'", str12, "student");
    }

    @Test
    public void test0873() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0873");
        com.reservation_system.model.Researcher researcher5 = new com.reservation_system.model.Researcher(1, "faculty", "labmanager", "", true);
        java.lang.String str6 = researcher5.getUserType();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Researcher" + "'", str6, "Researcher");
    }

    @Test
    public void test0874() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0874");
        com.reservation_system.model.LabManager labManager5 = new com.reservation_system.model.LabManager(10, "Faculty", "guest", "Andrew", false);
        labManager5.setApproved(true);
    }

    @Test
    public void test0875() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0875");
        com.reservation_system.model.LabManager labManager5 = new com.reservation_system.model.LabManager((int) (short) -1, "headlabcoordinator", "faculty", "Researcher", true);
        java.lang.String str6 = labManager5.getUserType();
        boolean boolean7 = labManager5.requiresDepartmentApproval();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "labmanager" + "'", str6, "labmanager");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test0876() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0876");
        com.reservation_system.model.Researcher researcher5 = new com.reservation_system.model.Researcher(100, "Faculty", "andrew@example.com", "Researcher", true);
    }

    @Test
    public void test0877() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0877");
        com.reservation_system.model.Student student5 = new com.reservation_system.model.Student((int) (short) 100, "headlabcoordinator", "Faculty", "student", false);
        java.lang.Class<?> wildcardClass6 = student5.getClass();
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0878() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0878");
        com.reservation_system.model.Researcher researcher5 = new com.reservation_system.model.Researcher((int) (short) 1, "", "Student", "Guest", false);
    }

    @Test
    public void test0879() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0879");
        com.reservation_system.model.Faculty faculty5 = new com.reservation_system.model.Faculty((-1), "headlabcoordinator", "andrew@example.com", "labmanager", false);
        java.lang.String str6 = faculty5.getPassword();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "labmanager" + "'", str6, "labmanager");
    }

    @Test
    public void test0880() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0880");
        com.reservation_system.model.User user6 = com.reservation_system.patterns.factory.UserFactory.createUser("student", (int) (short) 0, "faculty", "", "hi!", true);
        org.junit.Assert.assertNotNull(user6);
    }

    @Test
    public void test0881() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0881");
        com.reservation_system.model.Faculty faculty5 = new com.reservation_system.model.Faculty((int) '4', "researcher", "researcher", "Researcher", true);
        java.lang.String str6 = faculty5.getUserType();
        java.lang.String str7 = faculty5.getUserType();
        java.lang.String str8 = faculty5.getUserType();
        java.lang.String str9 = faculty5.getUserType();
        java.lang.String str10 = faculty5.getUserType();
        faculty5.setApproved(false);
        java.lang.String str13 = faculty5.getUserType();
        int int14 = faculty5.getID();
        java.lang.Class<?> wildcardClass15 = faculty5.getClass();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Faculty" + "'", str6, "Faculty");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Faculty" + "'", str7, "Faculty");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Faculty" + "'", str8, "Faculty");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Faculty" + "'", str9, "Faculty");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Faculty" + "'", str10, "Faculty");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Faculty" + "'", str13, "Faculty");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 52 + "'", int14 == 52);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0882() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0882");
        com.reservation_system.model.HeadLabCoordinator headLabCoordinator5 = new com.reservation_system.model.HeadLabCoordinator((int) (byte) 10, "faculty", "Faculty", "Student", true);
        int int6 = headLabCoordinator5.getID();
        java.lang.String str7 = headLabCoordinator5.getPassword();
        java.lang.String str8 = headLabCoordinator5.getEmail();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Student" + "'", str7, "Student");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Faculty" + "'", str8, "Faculty");
    }

    @Test
    public void test0883() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0883");
        com.reservation_system.model.HeadLabCoordinator headLabCoordinator5 = new com.reservation_system.model.HeadLabCoordinator(0, "guest", "faculty", "andrew@example.com", true);
        int int6 = headLabCoordinator5.getID();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test0884() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0884");
        com.reservation_system.model.HeadLabCoordinator headLabCoordinator5 = new com.reservation_system.model.HeadLabCoordinator(52, "andrew@example.com", "headlabcoordinator", "Researcher", false);
    }

    @Test
    public void test0885() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0885");
        com.reservation_system.model.HeadLabCoordinator headLabCoordinator5 = new com.reservation_system.model.HeadLabCoordinator((int) 'a', "researcher", "Password1!", "researcher", false);
        java.lang.String str6 = headLabCoordinator5.getUserType();
        boolean boolean7 = headLabCoordinator5.requiresDepartmentApproval();
        java.lang.String str8 = headLabCoordinator5.getUserType();
        boolean boolean9 = headLabCoordinator5.isApproved();
        java.lang.String str10 = headLabCoordinator5.getPassword();
        java.lang.String str11 = headLabCoordinator5.getUserType();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "headlabcoordinator" + "'", str6, "headlabcoordinator");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "headlabcoordinator" + "'", str8, "headlabcoordinator");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "researcher" + "'", str10, "researcher");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "headlabcoordinator" + "'", str11, "headlabcoordinator");
    }

    @Test
    public void test0886() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0886");
        com.reservation_system.model.LabManager labManager5 = new com.reservation_system.model.LabManager((int) (short) -1, "hi!", "Guest", "andrew@example.com", true);
        java.lang.String str6 = labManager5.getUserType();
        java.lang.String str7 = labManager5.getPassword();
        int int8 = labManager5.getID();
        java.lang.String str9 = labManager5.getUserType();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "labmanager" + "'", str6, "labmanager");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "labmanager" + "'", str9, "labmanager");
    }

    @Test
    public void test0887() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0887");
        com.reservation_system.model.Student student5 = new com.reservation_system.model.Student(52, "Password1!", "Researcher", "andrew@example.com", true);
        boolean boolean6 = student5.isApproved();
        java.lang.String str7 = student5.getName();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Password1!" + "'", str7, "Password1!");
    }

    @Test
    public void test0888() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0888");
        com.reservation_system.model.User user6 = com.reservation_system.patterns.factory.UserFactory.createUser("faculty", (int) (short) 1, "andrew@example.com", "headlabcoordinator", "Faculty", false);
        int int7 = user6.getID();
        org.junit.Assert.assertNotNull(user6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
    }

    @Test
    public void test0889() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0889");
        com.reservation_system.model.HeadLabCoordinator headLabCoordinator5 = new com.reservation_system.model.HeadLabCoordinator(32, "faculty", "guest", "student", false);
    }

    @Test
    public void test0890() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0890");
        com.reservation_system.model.Faculty faculty5 = new com.reservation_system.model.Faculty((int) 'a', "Researcher", "labmanager", "hi!", true);
        java.lang.String str6 = faculty5.getEmail();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "labmanager" + "'", str6, "labmanager");
    }

    @Test
    public void test0891() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0891");
        com.reservation_system.model.Guest guest5 = new com.reservation_system.model.Guest((int) (short) 1, "faculty", "Student", "Faculty", true);
        java.lang.String str6 = guest5.getUserType();
        java.lang.String str7 = guest5.getName();
        boolean boolean8 = guest5.requiresDepartmentApproval();
        java.lang.String str9 = guest5.getUserType();
        java.lang.String str10 = guest5.getPassword();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Guest" + "'", str6, "Guest");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "faculty" + "'", str7, "faculty");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Guest" + "'", str9, "Guest");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Faculty" + "'", str10, "Faculty");
    }

    @Test
    public void test0892() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0892");
        com.reservation_system.model.Guest guest5 = new com.reservation_system.model.Guest(0, "", "labmanager", "labmanager", true);
        java.lang.String str6 = guest5.getUserType();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Guest" + "'", str6, "Guest");
    }

    @Test
    public void test0893() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0893");
        com.reservation_system.model.User user6 = com.reservation_system.patterns.factory.UserFactory.createUser("Researcher", 100, "Guest", "Guest", "Guest", false);
        java.lang.String str7 = user6.getPassword();
        org.junit.Assert.assertNotNull(user6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Guest" + "'", str7, "Guest");
    }

    @Test
    public void test0894() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0894");
        com.reservation_system.model.Student student5 = new com.reservation_system.model.Student((int) (short) 100, "hi!", "student", "", true);
        java.lang.String str6 = student5.getPassword();
        java.lang.Class<?> wildcardClass7 = student5.getClass();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0895() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0895");
        com.reservation_system.model.Guest guest5 = new com.reservation_system.model.Guest(0, "", "labmanager", "labmanager", true);
        java.lang.Class<?> wildcardClass6 = guest5.getClass();
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0896() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0896");
        com.reservation_system.model.User user6 = com.reservation_system.patterns.factory.UserFactory.createUser("student", 35, "headlabcoordinator", "Faculty", "Guest", true);
        java.lang.String str7 = user6.getPassword();
        org.junit.Assert.assertNotNull(user6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Guest" + "'", str7, "Guest");
    }

    @Test
    public void test0897() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0897");
        com.reservation_system.model.Faculty faculty5 = new com.reservation_system.model.Faculty((int) ' ', "", "faculty", "faculty", true);
    }

    @Test
    public void test0898() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0898");
        com.reservation_system.model.Faculty faculty5 = new com.reservation_system.model.Faculty(100, "Faculty", "Password1!", "Student", false);
    }

    @Test
    public void test0899() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0899");
        com.reservation_system.model.Researcher researcher5 = new com.reservation_system.model.Researcher(0, "student", "", "student", false);
        java.lang.String str6 = researcher5.getUserType();
        int int7 = researcher5.getID();
        java.lang.String str8 = researcher5.getUserType();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Researcher" + "'", str6, "Researcher");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Researcher" + "'", str8, "Researcher");
    }

    @Test
    public void test0900() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0900");
        com.reservation_system.model.HeadLabCoordinator headLabCoordinator5 = new com.reservation_system.model.HeadLabCoordinator(32, "Guest", "Guest", "Andrew", true);
    }

    @Test
    public void test0901() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0901");
        com.reservation_system.model.Student student5 = new com.reservation_system.model.Student((int) (short) 1, "labmanager", "labmanager", "hi!", true);
        int int6 = student5.getID();
        java.lang.String str7 = student5.getUserType();
        java.lang.String str8 = student5.getPassword();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Student" + "'", str7, "Student");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
    }

    @Test
    public void test0902() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0902");
        com.reservation_system.model.Student student5 = new com.reservation_system.model.Student((int) (short) -1, "labmanager", "researcher", "hi!", true);
    }

    @Test
    public void test0903() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0903");
        com.reservation_system.model.Faculty faculty5 = new com.reservation_system.model.Faculty(52, "Andrew", "researcher", "labmanager", false);
        java.lang.String str6 = faculty5.getEmail();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "researcher" + "'", str6, "researcher");
    }

    @Test
    public void test0904() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0904");
        com.reservation_system.model.LabManager labManager5 = new com.reservation_system.model.LabManager(0, "Guest", "researcher", "", true);
    }

    @Test
    public void test0905() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0905");
        com.reservation_system.model.Student student5 = new com.reservation_system.model.Student((int) (short) 10, "guest", "labmanager", "", false);
        java.lang.String str6 = student5.getUserType();
        boolean boolean7 = student5.requiresDepartmentApproval();
        java.lang.String str8 = student5.getPassword();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Student" + "'", str6, "Student");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test0906() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0906");
        com.reservation_system.model.Faculty faculty5 = new com.reservation_system.model.Faculty(32, "andrew@example.com", "student", "Password1!", true);
        faculty5.setApproved(true);
        boolean boolean8 = faculty5.isApproved();
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test0907() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0907");
        com.reservation_system.model.User user6 = com.reservation_system.patterns.factory.UserFactory.createUser("Guest", (-1), "andrew@example.com", "hi!", "faculty", false);
        org.junit.Assert.assertNotNull(user6);
    }

    @Test
    public void test0908() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0908");
        com.reservation_system.model.Faculty faculty5 = new com.reservation_system.model.Faculty((int) '4', "researcher", "researcher", "Researcher", true);
        java.lang.String str6 = faculty5.getUserType();
        java.lang.String str7 = faculty5.getUserType();
        java.lang.String str8 = faculty5.getUserType();
        java.lang.String str9 = faculty5.getUserType();
        java.lang.String str10 = faculty5.getUserType();
        java.lang.String str11 = faculty5.getEmail();
        java.lang.String str12 = faculty5.getUserType();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Faculty" + "'", str6, "Faculty");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Faculty" + "'", str7, "Faculty");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Faculty" + "'", str8, "Faculty");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Faculty" + "'", str9, "Faculty");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Faculty" + "'", str10, "Faculty");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "researcher" + "'", str11, "researcher");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Faculty" + "'", str12, "Faculty");
    }

    @Test
    public void test0909() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0909");
        com.reservation_system.model.Researcher researcher5 = new com.reservation_system.model.Researcher(100, "Faculty", "hi!", "Researcher", false);
    }

    @Test
    public void test0910() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0910");
        com.reservation_system.model.LabManager labManager5 = new com.reservation_system.model.LabManager(100, "Guest", "labmanager", "labmanager", true);
        boolean boolean6 = labManager5.isApproved();
        java.lang.String str7 = labManager5.getUserType();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "labmanager" + "'", str7, "labmanager");
    }

    @Test
    public void test0911() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0911");
        // The following exception was thrown during execution in test generation
        try {
            com.reservation_system.model.User user6 = com.reservation_system.patterns.factory.UserFactory.createUser("Password1!", 35, "andrew@example.com", "labmanager", "andrew@example.com", true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid user type: Password1!");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0912() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0912");
        // The following exception was thrown during execution in test generation
        try {
            com.reservation_system.model.User user6 = com.reservation_system.patterns.factory.UserFactory.createUser("Andrew", 10, "researcher", "Guest", "student", true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid user type: Andrew");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0913() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0913");
        com.reservation_system.model.Faculty faculty5 = new com.reservation_system.model.Faculty((int) ' ', "Researcher", "Password1!", "Student", true);
        java.lang.Class<?> wildcardClass6 = faculty5.getClass();
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0914() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0914");
        com.reservation_system.model.Researcher researcher5 = new com.reservation_system.model.Researcher((-1), "guest", "andrew@example.com", "Guest", true);
        java.lang.String str6 = researcher5.getUserType();
        java.lang.String str7 = researcher5.getEmail();
        java.lang.String str8 = researcher5.getPassword();
        java.lang.String str9 = researcher5.getEmail();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Researcher" + "'", str6, "Researcher");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Guest" + "'", str8, "Guest");
    }

    @Test
    public void test0915() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0915");
        com.reservation_system.model.HeadLabCoordinator headLabCoordinator5 = new com.reservation_system.model.HeadLabCoordinator(10, "Guest", "Student", "Researcher", true);
        java.lang.String str6 = headLabCoordinator5.getPassword();
        int int7 = headLabCoordinator5.getID();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Researcher" + "'", str6, "Researcher");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 10 + "'", int7 == 10);
    }

    @Test
    public void test0916() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0916");
        com.reservation_system.model.Researcher researcher5 = new com.reservation_system.model.Researcher(10, "Student", "Guest", "Password1!", false);
        boolean boolean6 = researcher5.isApproved();
        java.lang.String str7 = researcher5.getUserType();
        java.lang.String str8 = researcher5.getUserType();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Researcher" + "'", str7, "Researcher");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Researcher" + "'", str8, "Researcher");
    }

    @Test
    public void test0917() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0917");
        com.reservation_system.model.HeadLabCoordinator headLabCoordinator5 = new com.reservation_system.model.HeadLabCoordinator(97, "Andrew", "", "Guest", false);
        boolean boolean6 = headLabCoordinator5.isApproved();
        boolean boolean7 = headLabCoordinator5.requiresDepartmentApproval();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test0918() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0918");
        com.reservation_system.model.Researcher researcher5 = new com.reservation_system.model.Researcher((int) (byte) 100, "guest", "Password1!", "Password1!", false);
        int int6 = researcher5.getID();
        java.lang.String str7 = researcher5.getName();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "guest" + "'", str7, "guest");
    }

    @Test
    public void test0919() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0919");
        com.reservation_system.model.HeadLabCoordinator headLabCoordinator5 = new com.reservation_system.model.HeadLabCoordinator((int) (byte) 1, "researcher", "labmanager", "Researcher", true);
        boolean boolean6 = headLabCoordinator5.requiresDepartmentApproval();
        java.lang.Class<?> wildcardClass7 = headLabCoordinator5.getClass();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0920() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0920");
        com.reservation_system.model.Faculty faculty5 = new com.reservation_system.model.Faculty((int) ' ', "guest", "Faculty", "Guest", true);
        java.lang.Class<?> wildcardClass6 = faculty5.getClass();
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0921() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0921");
        com.reservation_system.model.LabManager labManager5 = new com.reservation_system.model.LabManager((int) ' ', "Student", "student", "", true);
        java.lang.String str6 = labManager5.getUserType();
        labManager5.setApproved(false);
        java.lang.String str9 = labManager5.getName();
        java.lang.String str10 = labManager5.getUserType();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "labmanager" + "'", str6, "labmanager");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Student" + "'", str9, "Student");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "labmanager" + "'", str10, "labmanager");
    }

    @Test
    public void test0922() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0922");
        com.reservation_system.model.Student student5 = new com.reservation_system.model.Student((int) ' ', "Faculty", "Student", "hi!", true);
    }

    @Test
    public void test0923() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0923");
        com.reservation_system.model.Researcher researcher5 = new com.reservation_system.model.Researcher((int) (byte) 10, "guest", "Student", "", true);
    }

    @Test
    public void test0924() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0924");
        com.reservation_system.model.User user6 = com.reservation_system.patterns.factory.UserFactory.createUser("faculty", (-1), "researcher", "hi!", "andrew@example.com", true);
        org.junit.Assert.assertNotNull(user6);
    }

    @Test
    public void test0925() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0925");
        com.reservation_system.model.HeadLabCoordinator headLabCoordinator5 = new com.reservation_system.model.HeadLabCoordinator(0, "Password1!", "faculty", "Guest", false);
        java.lang.String str6 = headLabCoordinator5.getUserType();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "headlabcoordinator" + "'", str6, "headlabcoordinator");
    }

    @Test
    public void test0926() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0926");
        com.reservation_system.model.HeadLabCoordinator headLabCoordinator5 = new com.reservation_system.model.HeadLabCoordinator((int) '#', "hi!", "Password1!", "student", false);
        java.lang.String str6 = headLabCoordinator5.getUserType();
        java.lang.String str7 = headLabCoordinator5.getUserType();
        java.lang.String str8 = headLabCoordinator5.getUserType();
        java.lang.String str9 = headLabCoordinator5.getPassword();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "headlabcoordinator" + "'", str6, "headlabcoordinator");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "headlabcoordinator" + "'", str7, "headlabcoordinator");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "headlabcoordinator" + "'", str8, "headlabcoordinator");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "student" + "'", str9, "student");
    }

    @Test
    public void test0927() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0927");
        com.reservation_system.model.HeadLabCoordinator headLabCoordinator5 = new com.reservation_system.model.HeadLabCoordinator((int) 'a', "researcher", "Password1!", "researcher", false);
        java.lang.String str6 = headLabCoordinator5.getUserType();
        boolean boolean7 = headLabCoordinator5.requiresDepartmentApproval();
        headLabCoordinator5.setApproved(true);
        java.lang.String str10 = headLabCoordinator5.getUserType();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "headlabcoordinator" + "'", str6, "headlabcoordinator");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "headlabcoordinator" + "'", str10, "headlabcoordinator");
    }

    @Test
    public void test0928() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0928");
        com.reservation_system.model.HeadLabCoordinator headLabCoordinator5 = new com.reservation_system.model.HeadLabCoordinator((int) '#', "Faculty", "student", "Andrew", false);
        java.lang.String str6 = headLabCoordinator5.getName();
        headLabCoordinator5.setApproved(false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Faculty" + "'", str6, "Faculty");
    }

    @Test
    public void test0929() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0929");
        com.reservation_system.model.HeadLabCoordinator headLabCoordinator5 = new com.reservation_system.model.HeadLabCoordinator(52, "hi!", "", "researcher", false);
    }

    @Test
    public void test0930() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0930");
        com.reservation_system.model.Faculty faculty5 = new com.reservation_system.model.Faculty(0, "Guest", "student", "Student", false);
        java.lang.String str6 = faculty5.getEmail();
        java.lang.Class<?> wildcardClass7 = faculty5.getClass();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "student" + "'", str6, "student");
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0931() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0931");
        com.reservation_system.model.LabManager labManager5 = new com.reservation_system.model.LabManager(0, "labmanager", "Andrew", "headlabcoordinator", true);
    }

    @Test
    public void test0932() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0932");
        com.reservation_system.model.User user6 = com.reservation_system.patterns.factory.UserFactory.createUser("student", 52, "guest", "researcher", "faculty", false);
        org.junit.Assert.assertNotNull(user6);
    }

    @Test
    public void test0933() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0933");
        com.reservation_system.model.HeadLabCoordinator headLabCoordinator5 = new com.reservation_system.model.HeadLabCoordinator((int) ' ', "student", "student", "andrew@example.com", true);
    }

    @Test
    public void test0934() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0934");
        com.reservation_system.model.Researcher researcher5 = new com.reservation_system.model.Researcher(97, "headlabcoordinator", "", "andrew@example.com", false);
    }

    @Test
    public void test0935() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0935");
        com.reservation_system.model.Faculty faculty5 = new com.reservation_system.model.Faculty((-1), "headlabcoordinator", "hi!", "Andrew", true);
        boolean boolean6 = faculty5.isApproved();
        boolean boolean7 = faculty5.requiresDepartmentApproval();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test0936() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0936");
        com.reservation_system.model.Researcher researcher5 = new com.reservation_system.model.Researcher(52, "headlabcoordinator", "Andrew", "researcher", false);
        java.lang.String str6 = researcher5.getUserType();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Researcher" + "'", str6, "Researcher");
    }

    @Test
    public void test0937() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0937");
        com.reservation_system.model.HeadLabCoordinator headLabCoordinator5 = new com.reservation_system.model.HeadLabCoordinator((int) 'a', "hi!", "Guest", "researcher", true);
        java.lang.String str6 = headLabCoordinator5.getEmail();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Guest" + "'", str6, "Guest");
    }

    @Test
    public void test0938() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0938");
        // The following exception was thrown during execution in test generation
        try {
            com.reservation_system.model.User user6 = com.reservation_system.patterns.factory.UserFactory.createUser("andrew@example.com", (int) '#', "Guest", "headlabcoordinator", "hi!", true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid user type: andrew@example.com");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0939() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0939");
        com.reservation_system.model.Guest guest5 = new com.reservation_system.model.Guest(0, "Faculty", "labmanager", "Faculty", false);
    }

    @Test
    public void test0940() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0940");
        com.reservation_system.model.Faculty faculty5 = new com.reservation_system.model.Faculty((int) (short) 100, "Password1!", "guest", "guest", false);
    }

    @Test
    public void test0941() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0941");
        com.reservation_system.model.Faculty faculty5 = new com.reservation_system.model.Faculty((int) (short) -1, "Student", "Student", "", false);
    }

    @Test
    public void test0942() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0942");
        com.reservation_system.model.Faculty faculty5 = new com.reservation_system.model.Faculty(97, "andrew@example.com", "hi!", "Faculty", false);
    }

    @Test
    public void test0943() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0943");
        com.reservation_system.model.Student student5 = new com.reservation_system.model.Student(35, "Faculty", "labmanager", "Researcher", false);
        boolean boolean6 = student5.requiresDepartmentApproval();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test0944() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0944");
        com.reservation_system.model.HeadLabCoordinator headLabCoordinator5 = new com.reservation_system.model.HeadLabCoordinator(97, "guest", "hi!", "faculty", false);
        boolean boolean6 = headLabCoordinator5.isApproved();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test0945() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0945");
        com.reservation_system.model.Guest guest5 = new com.reservation_system.model.Guest((int) '4', "andrew@example.com", "student", "faculty", true);
        java.lang.String str6 = guest5.getUserType();
        java.lang.String str7 = guest5.getName();
        int int8 = guest5.getID();
        java.lang.String str9 = guest5.getPassword();
        guest5.setApproved(true);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Guest" + "'", str6, "Guest");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 52 + "'", int8 == 52);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "faculty" + "'", str9, "faculty");
    }

    @Test
    public void test0946() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0946");
        com.reservation_system.model.Faculty faculty5 = new com.reservation_system.model.Faculty((int) '#', "", "", "guest", false);
        boolean boolean6 = faculty5.requiresDepartmentApproval();
        java.lang.String str7 = faculty5.getPassword();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "guest" + "'", str7, "guest");
    }

    @Test
    public void test0947() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0947");
        com.reservation_system.model.HeadLabCoordinator headLabCoordinator5 = new com.reservation_system.model.HeadLabCoordinator(35, "student", "Student", "headlabcoordinator", false);
        java.lang.String str6 = headLabCoordinator5.getUserType();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "headlabcoordinator" + "'", str6, "headlabcoordinator");
    }

    @Test
    public void test0948() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0948");
        com.reservation_system.model.Student student5 = new com.reservation_system.model.Student(100, "Andrew", "Student", "Researcher", false);
    }

    @Test
    public void test0949() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0949");
        com.reservation_system.model.User user6 = com.reservation_system.patterns.factory.UserFactory.createUser("Researcher", (int) (byte) -1, "headlabcoordinator", "guest", "guest", false);
        org.junit.Assert.assertNotNull(user6);
    }

    @Test
    public void test0950() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0950");
        com.reservation_system.model.LabManager labManager5 = new com.reservation_system.model.LabManager((int) (byte) 1, "Andrew", "hi!", "faculty", true);
        java.lang.String str6 = labManager5.getUserType();
        java.lang.String str7 = labManager5.getEmail();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "labmanager" + "'", str6, "labmanager");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
    }

    @Test
    public void test0951() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0951");
        com.reservation_system.model.Faculty faculty5 = new com.reservation_system.model.Faculty((int) (short) 100, "Andrew", "researcher", "Guest", false);
        boolean boolean6 = faculty5.isApproved();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test0952() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0952");
        com.reservation_system.model.Guest guest5 = new com.reservation_system.model.Guest((int) (short) 10, "faculty", "Guest", "Password1!", false);
        java.lang.String str6 = guest5.getPassword();
        java.lang.String str7 = guest5.getUserType();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Password1!" + "'", str6, "Password1!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Guest" + "'", str7, "Guest");
    }

    @Test
    public void test0953() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0953");
        com.reservation_system.model.LabManager labManager5 = new com.reservation_system.model.LabManager((int) (short) 10, "headlabcoordinator", "Andrew", "guest", true);
        java.lang.String str6 = labManager5.getPassword();
        java.lang.String str7 = labManager5.getUserType();
        java.lang.String str8 = labManager5.getUserType();
        java.lang.String str9 = labManager5.getUserType();
        java.lang.String str10 = labManager5.getUserType();
        java.lang.Class<?> wildcardClass11 = labManager5.getClass();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "guest" + "'", str6, "guest");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "labmanager" + "'", str7, "labmanager");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "labmanager" + "'", str8, "labmanager");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "labmanager" + "'", str9, "labmanager");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "labmanager" + "'", str10, "labmanager");
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0954() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0954");
        com.reservation_system.model.HeadLabCoordinator headLabCoordinator5 = new com.reservation_system.model.HeadLabCoordinator((int) (byte) -1, "labmanager", "", "guest", false);
        java.lang.String str6 = headLabCoordinator5.getUserType();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "headlabcoordinator" + "'", str6, "headlabcoordinator");
    }

    @Test
    public void test0955() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0955");
        com.reservation_system.model.Student student5 = new com.reservation_system.model.Student((int) (byte) -1, "andrew@example.com", "labmanager", "Student", true);
    }

    @Test
    public void test0956() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0956");
        com.reservation_system.model.LabManager labManager5 = new com.reservation_system.model.LabManager((-1), "Andrew", "faculty", "headlabcoordinator", true);
    }

    @Test
    public void test0957() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0957");
        com.reservation_system.model.HeadLabCoordinator headLabCoordinator5 = new com.reservation_system.model.HeadLabCoordinator((int) (short) 100, "guest", "student", "Password1!", true);
    }

    @Test
    public void test0958() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0958");
        com.reservation_system.model.LabManager labManager5 = new com.reservation_system.model.LabManager((-1), "researcher", "Guest", "Researcher", false);
        labManager5.setApproved(false);
    }

    @Test
    public void test0959() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0959");
        com.reservation_system.model.LabManager labManager5 = new com.reservation_system.model.LabManager(52, "Researcher", "Guest", "labmanager", false);
        int int6 = labManager5.getID();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 52 + "'", int6 == 52);
    }

    @Test
    public void test0960() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0960");
        com.reservation_system.model.Guest guest5 = new com.reservation_system.model.Guest((int) (byte) 100, "Guest", "", "researcher", true);
    }

    @Test
    public void test0961() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0961");
        com.reservation_system.model.Guest guest5 = new com.reservation_system.model.Guest(52, "researcher", "Guest", "Student", true);
    }

    @Test
    public void test0962() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0962");
        com.reservation_system.model.LabManager labManager5 = new com.reservation_system.model.LabManager(97, "labmanager", "faculty", "guest", true);
    }

    @Test
    public void test0963() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0963");
        com.reservation_system.model.Researcher researcher5 = new com.reservation_system.model.Researcher(0, "researcher", "Faculty", "labmanager", true);
        java.lang.String str6 = researcher5.getEmail();
        java.lang.Class<?> wildcardClass7 = researcher5.getClass();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Faculty" + "'", str6, "Faculty");
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0964() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0964");
        com.reservation_system.model.Researcher researcher5 = new com.reservation_system.model.Researcher(0, "student", "", "student", false);
        java.lang.String str6 = researcher5.getEmail();
        java.lang.String str7 = researcher5.getEmail();
        java.lang.String str8 = researcher5.getUserType();
        java.lang.String str9 = researcher5.getUserType();
        java.lang.String str10 = researcher5.getUserType();
        java.lang.String str11 = researcher5.getUserType();
        java.lang.String str12 = researcher5.getUserType();
        java.lang.String str13 = researcher5.getEmail();
        java.lang.String str14 = researcher5.getPassword();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Researcher" + "'", str8, "Researcher");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Researcher" + "'", str9, "Researcher");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Researcher" + "'", str10, "Researcher");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Researcher" + "'", str11, "Researcher");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Researcher" + "'", str12, "Researcher");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "student" + "'", str14, "student");
    }

    @Test
    public void test0965() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0965");
        com.reservation_system.model.LabManager labManager5 = new com.reservation_system.model.LabManager((int) (byte) 10, "student", "Student", "guest", false);
    }

    @Test
    public void test0966() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0966");
        com.reservation_system.model.User user6 = com.reservation_system.patterns.factory.UserFactory.createUser("Faculty", (int) (byte) -1, "andrew@example.com", "andrew@example.com", "", false);
        java.lang.String str7 = user6.getPassword();
        org.junit.Assert.assertNotNull(user6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
    }

    @Test
    public void test0967() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0967");
        com.reservation_system.model.Researcher researcher5 = new com.reservation_system.model.Researcher(97, "Student", "guest", "Guest", true);
        boolean boolean6 = researcher5.requiresDepartmentApproval();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test0968() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0968");
        com.reservation_system.model.HeadLabCoordinator headLabCoordinator5 = new com.reservation_system.model.HeadLabCoordinator((int) (short) -1, "faculty", "labmanager", "Andrew", true);
        java.lang.String str6 = headLabCoordinator5.getPassword();
        java.lang.String str7 = headLabCoordinator5.getUserType();
        java.lang.String str8 = headLabCoordinator5.getUserType();
        int int9 = headLabCoordinator5.getID();
        boolean boolean10 = headLabCoordinator5.isApproved();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Andrew" + "'", str6, "Andrew");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "headlabcoordinator" + "'", str7, "headlabcoordinator");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "headlabcoordinator" + "'", str8, "headlabcoordinator");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test0969() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0969");
        com.reservation_system.model.Guest guest5 = new com.reservation_system.model.Guest((int) (short) 1, "faculty", "Student", "Faculty", true);
        java.lang.String str6 = guest5.getUserType();
        java.lang.String str7 = guest5.getName();
        java.lang.Class<?> wildcardClass8 = guest5.getClass();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Guest" + "'", str6, "Guest");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "faculty" + "'", str7, "faculty");
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0970() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0970");
        com.reservation_system.model.Student student5 = new com.reservation_system.model.Student((int) (byte) 0, "", "guest", "labmanager", true);
        int int6 = student5.getID();
        java.lang.String str7 = student5.getUserType();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Student" + "'", str7, "Student");
    }

    @Test
    public void test0971() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0971");
        com.reservation_system.model.Researcher researcher5 = new com.reservation_system.model.Researcher(35, "guest", "faculty", "Researcher", false);
        boolean boolean6 = researcher5.requiresDepartmentApproval();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test0972() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0972");
        com.reservation_system.model.HeadLabCoordinator headLabCoordinator5 = new com.reservation_system.model.HeadLabCoordinator(100, "headlabcoordinator", "Guest", "researcher", false);
        java.lang.String str6 = headLabCoordinator5.getUserType();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "headlabcoordinator" + "'", str6, "headlabcoordinator");
    }

    @Test
    public void test0973() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0973");
        com.reservation_system.model.Student student5 = new com.reservation_system.model.Student(97, "Guest", "Guest", "Faculty", true);
        java.lang.String str6 = student5.getUserType();
        int int7 = student5.getID();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Student" + "'", str6, "Student");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 97 + "'", int7 == 97);
    }

    @Test
    public void test0974() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0974");
        com.reservation_system.model.Guest guest5 = new com.reservation_system.model.Guest((-1), "student", "Student", "Password1!", true);
    }

    @Test
    public void test0975() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0975");
        com.reservation_system.model.HeadLabCoordinator headLabCoordinator5 = new com.reservation_system.model.HeadLabCoordinator((int) 'a', "researcher", "Password1!", "researcher", false);
        int int6 = headLabCoordinator5.getID();
        java.lang.String str7 = headLabCoordinator5.getUserType();
        java.lang.String str8 = headLabCoordinator5.getPassword();
        java.lang.String str9 = headLabCoordinator5.getUserType();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 97 + "'", int6 == 97);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "headlabcoordinator" + "'", str7, "headlabcoordinator");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "researcher" + "'", str8, "researcher");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "headlabcoordinator" + "'", str9, "headlabcoordinator");
    }

    @Test
    public void test0976() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0976");
        com.reservation_system.model.Guest guest5 = new com.reservation_system.model.Guest((int) (short) 100, "Andrew", "", "Student", false);
        java.lang.String str6 = guest5.getUserType();
        int int7 = guest5.getID();
        java.lang.String str8 = guest5.getUserType();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Guest" + "'", str6, "Guest");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 100 + "'", int7 == 100);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Guest" + "'", str8, "Guest");
    }

    @Test
    public void test0977() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0977");
        com.reservation_system.model.Researcher researcher5 = new com.reservation_system.model.Researcher((int) ' ', "faculty", "faculty", "Student", true);
        boolean boolean6 = researcher5.requiresDepartmentApproval();
        java.lang.String str7 = researcher5.getEmail();
        boolean boolean8 = researcher5.requiresDepartmentApproval();
        int int9 = researcher5.getID();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "faculty" + "'", str7, "faculty");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 32 + "'", int9 == 32);
    }

    @Test
    public void test0978() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0978");
        com.reservation_system.model.Student student5 = new com.reservation_system.model.Student(1, "guest", "hi!", "student", false);
        java.lang.String str6 = student5.getUserType();
        java.lang.String str7 = student5.getUserType();
        java.lang.String str8 = student5.getUserType();
        java.lang.String str9 = student5.getUserType();
        boolean boolean10 = student5.requiresDepartmentApproval();
        java.lang.String str11 = student5.getUserType();
        student5.setApproved(true);
        student5.setApproved(false);
        boolean boolean16 = student5.isApproved();
        java.lang.String str17 = student5.getUserType();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Student" + "'", str6, "Student");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Student" + "'", str7, "Student");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Student" + "'", str8, "Student");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Student" + "'", str9, "Student");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Student" + "'", str11, "Student");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "Student" + "'", str17, "Student");
    }

    @Test
    public void test0979() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0979");
        com.reservation_system.model.Faculty faculty5 = new com.reservation_system.model.Faculty((int) '4', "Faculty", "guest", "", true);
    }

    @Test
    public void test0980() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0980");
        com.reservation_system.model.LabManager labManager5 = new com.reservation_system.model.LabManager((int) 'a', "faculty", "researcher", "", true);
        int int6 = labManager5.getID();
        java.lang.String str7 = labManager5.getPassword();
        java.lang.String str8 = labManager5.getUserType();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 97 + "'", int6 == 97);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "labmanager" + "'", str8, "labmanager");
    }

    @Test
    public void test0981() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0981");
        com.reservation_system.model.HeadLabCoordinator headLabCoordinator5 = new com.reservation_system.model.HeadLabCoordinator((int) (short) -1, "faculty", "labmanager", "Andrew", true);
        java.lang.String str6 = headLabCoordinator5.getPassword();
        java.lang.String str7 = headLabCoordinator5.getUserType();
        java.lang.String str8 = headLabCoordinator5.getUserType();
        int int9 = headLabCoordinator5.getID();
        java.lang.String str10 = headLabCoordinator5.getUserType();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Andrew" + "'", str6, "Andrew");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "headlabcoordinator" + "'", str7, "headlabcoordinator");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "headlabcoordinator" + "'", str8, "headlabcoordinator");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "headlabcoordinator" + "'", str10, "headlabcoordinator");
    }

    @Test
    public void test0982() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0982");
        com.reservation_system.model.Researcher researcher5 = new com.reservation_system.model.Researcher((int) 'a', "Password1!", "Password1!", "", true);
        researcher5.setApproved(true);
        java.lang.String str8 = researcher5.getUserType();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Researcher" + "'", str8, "Researcher");
    }

    @Test
    public void test0983() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0983");
        com.reservation_system.model.HeadLabCoordinator headLabCoordinator5 = new com.reservation_system.model.HeadLabCoordinator((int) '#', "Student", "headlabcoordinator", "labmanager", true);
        java.lang.String str6 = headLabCoordinator5.getUserType();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "headlabcoordinator" + "'", str6, "headlabcoordinator");
    }

    @Test
    public void test0984() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0984");
        com.reservation_system.model.Researcher researcher5 = new com.reservation_system.model.Researcher(0, "student", "", "student", false);
        java.lang.String str6 = researcher5.getEmail();
        java.lang.String str7 = researcher5.getEmail();
        java.lang.String str8 = researcher5.getUserType();
        java.lang.String str9 = researcher5.getUserType();
        java.lang.String str10 = researcher5.getEmail();
        java.lang.String str11 = researcher5.getUserType();
        java.lang.String str12 = researcher5.getUserType();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Researcher" + "'", str8, "Researcher");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Researcher" + "'", str9, "Researcher");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Researcher" + "'", str11, "Researcher");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Researcher" + "'", str12, "Researcher");
    }

    @Test
    public void test0985() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0985");
        com.reservation_system.model.Student student5 = new com.reservation_system.model.Student((int) (byte) -1, "labmanager", "andrew@example.com", "guest", false);
        java.lang.String str6 = student5.getEmail();
        java.lang.String str7 = student5.getUserType();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Student" + "'", str7, "Student");
    }

    @Test
    public void test0986() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0986");
        com.reservation_system.model.Researcher researcher5 = new com.reservation_system.model.Researcher((int) (byte) 100, "Guest", "researcher", "Guest", true);
    }

    @Test
    public void test0987() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0987");
        com.reservation_system.model.Researcher researcher5 = new com.reservation_system.model.Researcher((int) '#', "Student", "headlabcoordinator", "faculty", false);
        java.lang.String str6 = researcher5.getPassword();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "faculty" + "'", str6, "faculty");
    }

    @Test
    public void test0988() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0988");
        com.reservation_system.model.LabManager labManager5 = new com.reservation_system.model.LabManager(0, "faculty", "faculty", "student", true);
        boolean boolean6 = labManager5.requiresDepartmentApproval();
        java.lang.Class<?> wildcardClass7 = labManager5.getClass();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0989() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0989");
        com.reservation_system.model.Student student5 = new com.reservation_system.model.Student(10, "", "student", "Student", false);
        java.lang.String str6 = student5.getUserType();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Student" + "'", str6, "Student");
    }

    @Test
    public void test0990() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0990");
        com.reservation_system.model.Guest guest5 = new com.reservation_system.model.Guest(100, "headlabcoordinator", "labmanager", "guest", true);
        boolean boolean6 = guest5.isApproved();
        boolean boolean7 = guest5.requiresDepartmentApproval();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test0991() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0991");
        com.reservation_system.model.User user6 = com.reservation_system.patterns.factory.UserFactory.createUser("Faculty", 32, "Researcher", "Researcher", "student", false);
        org.junit.Assert.assertNotNull(user6);
    }

    @Test
    public void test0992() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0992");
        com.reservation_system.model.LabManager labManager5 = new com.reservation_system.model.LabManager((int) (short) 10, "headlabcoordinator", "Andrew", "guest", true);
        labManager5.setApproved(false);
        java.lang.String str8 = labManager5.getName();
        boolean boolean9 = labManager5.isApproved();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "headlabcoordinator" + "'", str8, "headlabcoordinator");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test0993() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0993");
        com.reservation_system.model.LabManager labManager5 = new com.reservation_system.model.LabManager(0, "Student", "headlabcoordinator", "student", false);
        java.lang.String str6 = labManager5.getUserType();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "labmanager" + "'", str6, "labmanager");
    }

    @Test
    public void test0994() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0994");
        com.reservation_system.model.Faculty faculty5 = new com.reservation_system.model.Faculty((int) '4', "researcher", "researcher", "Researcher", true);
        java.lang.String str6 = faculty5.getUserType();
        java.lang.String str7 = faculty5.getUserType();
        java.lang.String str8 = faculty5.getUserType();
        java.lang.String str9 = faculty5.getUserType();
        java.lang.String str10 = faculty5.getUserType();
        faculty5.setApproved(false);
        java.lang.String str13 = faculty5.getPassword();
        faculty5.setApproved(true);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Faculty" + "'", str6, "Faculty");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Faculty" + "'", str7, "Faculty");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Faculty" + "'", str8, "Faculty");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Faculty" + "'", str9, "Faculty");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Faculty" + "'", str10, "Faculty");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Researcher" + "'", str13, "Researcher");
    }

    @Test
    public void test0995() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0995");
        com.reservation_system.model.Student student5 = new com.reservation_system.model.Student(10, "andrew@example.com", "Guest", "hi!", true);
    }

    @Test
    public void test0996() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0996");
        com.reservation_system.model.Researcher researcher5 = new com.reservation_system.model.Researcher((-1), "Faculty", "labmanager", "guest", true);
        java.lang.Class<?> wildcardClass6 = researcher5.getClass();
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0997() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0997");
        com.reservation_system.model.Student student5 = new com.reservation_system.model.Student(0, "student", "headlabcoordinator", "Researcher", true);
    }

    @Test
    public void test0998() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0998");
        com.reservation_system.model.LabManager labManager5 = new com.reservation_system.model.LabManager((int) '4', "", "student", "labmanager", false);
        java.lang.String str6 = labManager5.getName();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
    }

    @Test
    public void test0999() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0999");
        com.reservation_system.model.Faculty faculty5 = new com.reservation_system.model.Faculty((int) (short) 10, "hi!", "headlabcoordinator", "hi!", false);
        java.lang.String str6 = faculty5.getUserType();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Faculty" + "'", str6, "Faculty");
    }

    @Test
    public void test1000() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test1000");
        com.reservation_system.model.Faculty faculty5 = new com.reservation_system.model.Faculty((int) ' ', "Guest", "headlabcoordinator", "Student", false);
    }
}

