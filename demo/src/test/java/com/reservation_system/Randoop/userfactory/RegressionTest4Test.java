package com.reservation_system.Randoop.userfactory;

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
        com.reservation_system.model.Researcher researcher5 = new com.reservation_system.model.Researcher((int) ' ', "faculty", "faculty", "Student", true);
        boolean boolean6 = researcher5.requiresDepartmentApproval();
        java.lang.String str7 = researcher5.getEmail();
        java.lang.String str8 = researcher5.getName();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "faculty" + "'", str7, "faculty");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "faculty" + "'", str8, "faculty");
    }

    @Test
    public void test2002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2002");
        com.reservation_system.model.Researcher researcher5 = new com.reservation_system.model.Researcher(0, "andrew@example.com", "", "researcher", false);
        boolean boolean6 = researcher5.requiresDepartmentApproval();
        boolean boolean7 = researcher5.requiresDepartmentApproval();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test2003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2003");
        com.reservation_system.model.LabManager labManager5 = new com.reservation_system.model.LabManager(32, "Faculty", "andrew@example.com", "Guest", false);
    }

    @Test
    public void test2004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2004");
        com.reservation_system.model.HeadLabCoordinator headLabCoordinator5 = new com.reservation_system.model.HeadLabCoordinator(10, "Researcher", "faculty", "Guest", false);
        boolean boolean6 = headLabCoordinator5.requiresDepartmentApproval();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test2005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2005");
        com.reservation_system.model.Researcher researcher5 = new com.reservation_system.model.Researcher(100, "Faculty", "student", "", true);
        java.lang.String str6 = researcher5.getName();
        researcher5.setApproved(true);
        boolean boolean9 = researcher5.requiresDepartmentApproval();
        boolean boolean10 = researcher5.isApproved();
        java.lang.String str11 = researcher5.getPassword();
        researcher5.setApproved(false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Faculty" + "'", str6, "Faculty");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
    }

    @Test
    public void test2006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2006");
        com.reservation_system.model.Faculty faculty5 = new com.reservation_system.model.Faculty((int) '4', "researcher", "researcher", "Researcher", true);
        java.lang.String str6 = faculty5.getUserType();
        java.lang.String str7 = faculty5.getName();
        java.lang.String str8 = faculty5.getEmail();
        faculty5.setApproved(true);
        faculty5.setApproved(true);
        int int13 = faculty5.getID();
        java.lang.String str14 = faculty5.getName();
        java.lang.String str15 = faculty5.getName();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Faculty" + "'", str6, "Faculty");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "researcher" + "'", str7, "researcher");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "researcher" + "'", str8, "researcher");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 52 + "'", int13 == 52);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "researcher" + "'", str14, "researcher");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "researcher" + "'", str15, "researcher");
    }

    @Test
    public void test2007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2007");
        com.reservation_system.model.Faculty faculty5 = new com.reservation_system.model.Faculty((int) (short) 10, "hi!", "student", "Guest", false);
    }

    @Test
    public void test2008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2008");
        com.reservation_system.model.HeadLabCoordinator headLabCoordinator5 = new com.reservation_system.model.HeadLabCoordinator((int) (short) 100, "headlabcoordinator", "faculty", "Guest", true);
        boolean boolean6 = headLabCoordinator5.requiresDepartmentApproval();
        java.lang.String str7 = headLabCoordinator5.getName();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "headlabcoordinator" + "'", str7, "headlabcoordinator");
    }

    @Test
    public void test2009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2009");
        com.reservation_system.model.HeadLabCoordinator headLabCoordinator5 = new com.reservation_system.model.HeadLabCoordinator((int) (short) 0, "Guest", "headlabcoordinator", "Student", false);
    }

    @Test
    public void test2010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2010");
        com.reservation_system.model.HeadLabCoordinator headLabCoordinator5 = new com.reservation_system.model.HeadLabCoordinator((int) (byte) 1, "", "andrew@example.com", "headlabcoordinator", false);
    }

    @Test
    public void test2011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2011");
        com.reservation_system.model.User user6 = com.reservation_system.patterns.factory.UserFactory.createUser("researcher", (int) '#', "", "Andrew", "Andrew", false);
        org.junit.Assert.assertNotNull(user6);
    }

    @Test
    public void test2012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2012");
        com.reservation_system.model.HeadLabCoordinator headLabCoordinator5 = new com.reservation_system.model.HeadLabCoordinator(0, "student", "student", "andrew@example.com", false);
        headLabCoordinator5.setApproved(true);
    }

    @Test
    public void test2013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2013");
        com.reservation_system.model.Guest guest5 = new com.reservation_system.model.Guest((int) (short) -1, "faculty", "labmanager", "", false);
        java.lang.Class<?> wildcardClass6 = guest5.getClass();
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test2014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2014");
        com.reservation_system.model.HeadLabCoordinator headLabCoordinator5 = new com.reservation_system.model.HeadLabCoordinator(35, "hi!", "Faculty", "Researcher", true);
        java.lang.Class<?> wildcardClass6 = headLabCoordinator5.getClass();
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test2015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2015");
        com.reservation_system.model.Faculty faculty5 = new com.reservation_system.model.Faculty((-1), "faculty", "Researcher", "Andrew", true);
    }

    @Test
    public void test2016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2016");
        com.reservation_system.model.Faculty faculty5 = new com.reservation_system.model.Faculty((int) (short) 100, "Researcher", "researcher", "Guest", true);
        boolean boolean6 = faculty5.isApproved();
        boolean boolean7 = faculty5.isApproved();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test2017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2017");
        com.reservation_system.model.Guest guest5 = new com.reservation_system.model.Guest(1, "", "student", "student", true);
        java.lang.String str6 = guest5.getUserType();
        java.lang.String str7 = guest5.getUserType();
        int int8 = guest5.getID();
        java.lang.String str9 = guest5.getUserType();
        java.lang.String str10 = guest5.getUserType();
        guest5.setApproved(true);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Guest" + "'", str6, "Guest");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Guest" + "'", str7, "Guest");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Guest" + "'", str9, "Guest");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Guest" + "'", str10, "Guest");
    }

    @Test
    public void test2018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2018");
        com.reservation_system.model.Faculty faculty5 = new com.reservation_system.model.Faculty(100, "hi!", "Password1!", "", false);
        boolean boolean6 = faculty5.requiresDepartmentApproval();
        java.lang.String str7 = faculty5.getName();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
    }

    @Test
    public void test2019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2019");
        com.reservation_system.model.Researcher researcher5 = new com.reservation_system.model.Researcher(100, "researcher", "guest", "researcher", true);
        boolean boolean6 = researcher5.requiresDepartmentApproval();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test2020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2020");
        com.reservation_system.model.Student student5 = new com.reservation_system.model.Student((int) ' ', "Guest", "Andrew", "Researcher", true);
        java.lang.String str6 = student5.getUserType();
        java.lang.String str7 = student5.getUserType();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Student" + "'", str6, "Student");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Student" + "'", str7, "Student");
    }

    @Test
    public void test2021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2021");
        com.reservation_system.model.Researcher researcher5 = new com.reservation_system.model.Researcher(0, "student", "", "student", false);
        boolean boolean6 = researcher5.isApproved();
        boolean boolean7 = researcher5.isApproved();
        java.lang.String str8 = researcher5.getName();
        java.lang.Class<?> wildcardClass9 = researcher5.getClass();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "student" + "'", str8, "student");
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test2022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2022");
        com.reservation_system.model.Researcher researcher5 = new com.reservation_system.model.Researcher((int) 'a', "", "researcher", "Student", false);
        java.lang.String str6 = researcher5.getUserType();
        boolean boolean7 = researcher5.isApproved();
        researcher5.setApproved(false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Researcher" + "'", str6, "Researcher");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test2023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2023");
        com.reservation_system.model.LabManager labManager5 = new com.reservation_system.model.LabManager(35, "Student", "guest", "headlabcoordinator", false);
    }

    @Test
    public void test2024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2024");
        com.reservation_system.model.Researcher researcher5 = new com.reservation_system.model.Researcher((int) (byte) -1, "student", "labmanager", "headlabcoordinator", false);
    }

    @Test
    public void test2025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2025");
        com.reservation_system.model.HeadLabCoordinator headLabCoordinator5 = new com.reservation_system.model.HeadLabCoordinator((-1), "researcher", "", "labmanager", false);
        boolean boolean6 = headLabCoordinator5.requiresDepartmentApproval();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test2026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2026");
        com.reservation_system.model.Guest guest5 = new com.reservation_system.model.Guest(10, "student", "Andrew", "andrew@example.com", true);
        java.lang.String str6 = guest5.getUserType();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Guest" + "'", str6, "Guest");
    }

    @Test
    public void test2027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2027");
        com.reservation_system.model.Student student5 = new com.reservation_system.model.Student((int) (short) 10, "guest", "labmanager", "", false);
        java.lang.String str6 = student5.getEmail();
        java.lang.String str7 = student5.getEmail();
        boolean boolean8 = student5.requiresDepartmentApproval();
        int int9 = student5.getID();
        boolean boolean10 = student5.requiresDepartmentApproval();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "labmanager" + "'", str6, "labmanager");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "labmanager" + "'", str7, "labmanager");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10 + "'", int9 == 10);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test2028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2028");
        com.reservation_system.model.Student student5 = new com.reservation_system.model.Student((int) '#', "", "Faculty", "researcher", true);
    }

    @Test
    public void test2029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2029");
        com.reservation_system.model.Faculty faculty5 = new com.reservation_system.model.Faculty((int) (byte) 0, "Andrew", "Andrew", "Password1!", false);
    }

    @Test
    public void test2030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2030");
        com.reservation_system.model.LabManager labManager5 = new com.reservation_system.model.LabManager((int) ' ', "Student", "student", "", true);
        int int6 = labManager5.getID();
        labManager5.setApproved(false);
        java.lang.Class<?> wildcardClass9 = labManager5.getClass();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 32 + "'", int6 == 32);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test2031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2031");
        com.reservation_system.model.Guest guest5 = new com.reservation_system.model.Guest(97, "", "Faculty", "", true);
    }

    @Test
    public void test2032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2032");
        com.reservation_system.model.Student student5 = new com.reservation_system.model.Student(97, "faculty", "researcher", "andrew@example.com", false);
        java.lang.String str6 = student5.getEmail();
        java.lang.String str7 = student5.getUserType();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "researcher" + "'", str6, "researcher");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Student" + "'", str7, "Student");
    }

    @Test
    public void test2033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2033");
        com.reservation_system.model.Guest guest5 = new com.reservation_system.model.Guest((int) (byte) 0, "hi!", "Password1!", "hi!", false);
    }

    @Test
    public void test2034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2034");
        com.reservation_system.model.Researcher researcher5 = new com.reservation_system.model.Researcher((int) (byte) 100, "guest", "Password1!", "Password1!", false);
        java.lang.String str6 = researcher5.getUserType();
        java.lang.String str7 = researcher5.getUserType();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Researcher" + "'", str6, "Researcher");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Researcher" + "'", str7, "Researcher");
    }

    @Test
    public void test2035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2035");
        com.reservation_system.model.Student student5 = new com.reservation_system.model.Student((int) (byte) 1, "andrew@example.com", "headlabcoordinator", "Password1!", false);
    }

    @Test
    public void test2036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2036");
        com.reservation_system.model.Researcher researcher5 = new com.reservation_system.model.Researcher((int) (byte) -1, "headlabcoordinator", "Faculty", "guest", true);
        java.lang.String str6 = researcher5.getPassword();
        boolean boolean7 = researcher5.requiresDepartmentApproval();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "guest" + "'", str6, "guest");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test2037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2037");
        com.reservation_system.model.HeadLabCoordinator headLabCoordinator5 = new com.reservation_system.model.HeadLabCoordinator((int) (short) 0, "headlabcoordinator", "headlabcoordinator", "Password1!", false);
    }

    @Test
    public void test2038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2038");
        com.reservation_system.model.LabManager labManager5 = new com.reservation_system.model.LabManager(10, "student", "Guest", "faculty", false);
        java.lang.String str6 = labManager5.getUserType();
        java.lang.String str7 = labManager5.getUserType();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "labmanager" + "'", str6, "labmanager");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "labmanager" + "'", str7, "labmanager");
    }

    @Test
    public void test2039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2039");
        com.reservation_system.model.Student student5 = new com.reservation_system.model.Student((int) (short) 100, "Password1!", "guest", "Faculty", true);
        boolean boolean6 = student5.isApproved();
        java.lang.String str7 = student5.getUserType();
        java.lang.String str8 = student5.getUserType();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Student" + "'", str7, "Student");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Student" + "'", str8, "Student");
    }

    @Test
    public void test2040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2040");
        com.reservation_system.model.Researcher researcher5 = new com.reservation_system.model.Researcher((int) (short) 10, "faculty", "Password1!", "headlabcoordinator", true);
    }

    @Test
    public void test2041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2041");
        com.reservation_system.model.LabManager labManager5 = new com.reservation_system.model.LabManager((int) '4', "", "labmanager", "andrew@example.com", true);
        java.lang.String str6 = labManager5.getPassword();
        int int7 = labManager5.getID();
        java.lang.String str8 = labManager5.getUserType();
        java.lang.String str9 = labManager5.getUserType();
        java.lang.String str10 = labManager5.getUserType();
        labManager5.setApproved(false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 52 + "'", int7 == 52);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "labmanager" + "'", str8, "labmanager");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "labmanager" + "'", str9, "labmanager");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "labmanager" + "'", str10, "labmanager");
    }

    @Test
    public void test2042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2042");
        com.reservation_system.model.Guest guest5 = new com.reservation_system.model.Guest((-1), "faculty", "Faculty", "labmanager", true);
    }

    @Test
    public void test2043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2043");
        com.reservation_system.model.Student student5 = new com.reservation_system.model.Student(1, "guest", "headlabcoordinator", "", false);
    }

    @Test
    public void test2044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2044");
        com.reservation_system.model.Faculty faculty5 = new com.reservation_system.model.Faculty((int) (byte) -1, "faculty", "guest", "andrew@example.com", true);
        java.lang.String str6 = faculty5.getUserType();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Faculty" + "'", str6, "Faculty");
    }

    @Test
    public void test2045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2045");
        com.reservation_system.model.Researcher researcher5 = new com.reservation_system.model.Researcher(0, "student", "", "student", false);
        java.lang.String str6 = researcher5.getEmail();
        java.lang.String str7 = researcher5.getEmail();
        java.lang.String str8 = researcher5.getUserType();
        java.lang.String str9 = researcher5.getUserType();
        int int10 = researcher5.getID();
        java.lang.String str11 = researcher5.getUserType();
        java.lang.String str12 = researcher5.getUserType();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Researcher" + "'", str8, "Researcher");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Researcher" + "'", str9, "Researcher");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Researcher" + "'", str11, "Researcher");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Researcher" + "'", str12, "Researcher");
    }

    @Test
    public void test2046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2046");
        com.reservation_system.model.Guest guest5 = new com.reservation_system.model.Guest((int) (short) 100, "Andrew", "", "Student", false);
        guest5.setApproved(false);
        guest5.setApproved(false);
    }

    @Test
    public void test2047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2047");
        com.reservation_system.model.Faculty faculty5 = new com.reservation_system.model.Faculty((int) ' ', "hi!", "headlabcoordinator", "hi!", true);
        java.lang.String str6 = faculty5.getEmail();
        boolean boolean7 = faculty5.requiresDepartmentApproval();
        java.lang.Class<?> wildcardClass8 = faculty5.getClass();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "headlabcoordinator" + "'", str6, "headlabcoordinator");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test2048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2048");
        com.reservation_system.model.Researcher researcher5 = new com.reservation_system.model.Researcher(100, "researcher", "guest", "researcher", true);
        java.lang.String str6 = researcher5.getUserType();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Researcher" + "'", str6, "Researcher");
    }

    @Test
    public void test2049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2049");
        com.reservation_system.model.Student student5 = new com.reservation_system.model.Student((int) 'a', "Faculty", "labmanager", "Andrew", true);
        student5.setApproved(false);
    }

    @Test
    public void test2050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2050");
        com.reservation_system.model.Faculty faculty5 = new com.reservation_system.model.Faculty((int) (byte) 1, "", "Password1!", "andrew@example.com", false);
        java.lang.String str6 = faculty5.getEmail();
        boolean boolean7 = faculty5.requiresDepartmentApproval();
        java.lang.String str8 = faculty5.getPassword();
        java.lang.String str9 = faculty5.getEmail();
        java.lang.String str10 = faculty5.getUserType();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Password1!" + "'", str6, "Password1!");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Password1!" + "'", str9, "Password1!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Faculty" + "'", str10, "Faculty");
    }

    @Test
    public void test2051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2051");
        com.reservation_system.model.Student student5 = new com.reservation_system.model.Student((int) (short) 10, "Guest", "andrew@example.com", "Researcher", true);
        boolean boolean6 = student5.requiresDepartmentApproval();
        java.lang.String str7 = student5.getUserType();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Student" + "'", str7, "Student");
    }

    @Test
    public void test2052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2052");
        com.reservation_system.model.Student student5 = new com.reservation_system.model.Student((int) (short) 100, "Guest", "Student", "student", false);
        int int6 = student5.getID();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
    }

    @Test
    public void test2053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2053");
        com.reservation_system.model.Student student5 = new com.reservation_system.model.Student((int) (byte) 100, "Andrew", "Researcher", "student", false);
    }

    @Test
    public void test2054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2054");
        com.reservation_system.model.Student student5 = new com.reservation_system.model.Student(1, "student", "", "", false);
        java.lang.String str6 = student5.getEmail();
        student5.setApproved(false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
    }

    @Test
    public void test2055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2055");
        com.reservation_system.model.HeadLabCoordinator headLabCoordinator5 = new com.reservation_system.model.HeadLabCoordinator(0, "guest", "hi!", "researcher", true);
    }

    @Test
    public void test2056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2056");
        com.reservation_system.model.Guest guest5 = new com.reservation_system.model.Guest((int) '4', "andrew@example.com", "student", "student", false);
        java.lang.String str6 = guest5.getUserType();
        boolean boolean7 = guest5.isApproved();
        java.lang.String str8 = guest5.getUserType();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Guest" + "'", str6, "Guest");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Guest" + "'", str8, "Guest");
    }

    @Test
    public void test2057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2057");
        com.reservation_system.model.Researcher researcher5 = new com.reservation_system.model.Researcher(97, "", "labmanager", "Andrew", false);
    }

    @Test
    public void test2058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2058");
        com.reservation_system.model.Guest guest5 = new com.reservation_system.model.Guest(52, "", "headlabcoordinator", "Student", true);
        java.lang.String str6 = guest5.getUserType();
        boolean boolean7 = guest5.isApproved();
        int int8 = guest5.getID();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Guest" + "'", str6, "Guest");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 52 + "'", int8 == 52);
    }

    @Test
    public void test2059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2059");
        com.reservation_system.model.Student student5 = new com.reservation_system.model.Student((int) (byte) 0, "", "guest", "labmanager", true);
        java.lang.String str6 = student5.getUserType();
        java.lang.String str7 = student5.getPassword();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Student" + "'", str6, "Student");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "labmanager" + "'", str7, "labmanager");
    }

    @Test
    public void test2060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2060");
        com.reservation_system.model.HeadLabCoordinator headLabCoordinator5 = new com.reservation_system.model.HeadLabCoordinator(0, "hi!", "", "researcher", false);
        java.lang.String str6 = headLabCoordinator5.getUserType();
        java.lang.Class<?> wildcardClass7 = headLabCoordinator5.getClass();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "headlabcoordinator" + "'", str6, "headlabcoordinator");
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test2061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2061");
        com.reservation_system.model.Guest guest5 = new com.reservation_system.model.Guest((int) (byte) 0, "Student", "Researcher", "faculty", false);
    }

    @Test
    public void test2062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2062");
        com.reservation_system.model.HeadLabCoordinator headLabCoordinator5 = new com.reservation_system.model.HeadLabCoordinator((int) (short) -1, "faculty", "labmanager", "Andrew", true);
        java.lang.String str6 = headLabCoordinator5.getUserType();
        boolean boolean7 = headLabCoordinator5.requiresDepartmentApproval();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "headlabcoordinator" + "'", str6, "headlabcoordinator");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test2063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2063");
        com.reservation_system.model.Researcher researcher5 = new com.reservation_system.model.Researcher((int) (short) -1, "Guest", "guest", "student", false);
    }

    @Test
    public void test2064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2064");
        com.reservation_system.model.Student student5 = new com.reservation_system.model.Student((int) (short) 1, "Password1!", "guest", "hi!", true);
    }

    @Test
    public void test2065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2065");
        com.reservation_system.model.Student student5 = new com.reservation_system.model.Student((int) (short) 100, "", "researcher", "Researcher", true);
        java.lang.String str6 = student5.getUserType();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Student" + "'", str6, "Student");
    }

    @Test
    public void test2066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2066");
        com.reservation_system.model.Faculty faculty5 = new com.reservation_system.model.Faculty((int) (short) 10, "hi!", "headlabcoordinator", "hi!", false);
        boolean boolean6 = faculty5.requiresDepartmentApproval();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test2067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2067");
        com.reservation_system.model.Researcher researcher5 = new com.reservation_system.model.Researcher(0, "student", "", "student", false);
        boolean boolean6 = researcher5.isApproved();
        boolean boolean7 = researcher5.isApproved();
        java.lang.String str8 = researcher5.getName();
        java.lang.String str9 = researcher5.getUserType();
        java.lang.String str10 = researcher5.getUserType();
        researcher5.setApproved(true);
        java.lang.String str13 = researcher5.getEmail();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "student" + "'", str8, "student");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Researcher" + "'", str9, "Researcher");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Researcher" + "'", str10, "Researcher");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
    }

    @Test
    public void test2068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2068");
        com.reservation_system.model.Researcher researcher5 = new com.reservation_system.model.Researcher((int) (byte) -1, "headlabcoordinator", "Faculty", "guest", true);
        java.lang.String str6 = researcher5.getPassword();
        java.lang.String str7 = researcher5.getUserType();
        java.lang.String str8 = researcher5.getUserType();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "guest" + "'", str6, "guest");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Researcher" + "'", str7, "Researcher");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Researcher" + "'", str8, "Researcher");
    }

    @Test
    public void test2069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2069");
        com.reservation_system.model.Student student5 = new com.reservation_system.model.Student(1, "guest", "hi!", "student", false);
        boolean boolean6 = student5.isApproved();
        student5.setApproved(false);
        boolean boolean9 = student5.isApproved();
        boolean boolean10 = student5.isApproved();
        java.lang.String str11 = student5.getUserType();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Student" + "'", str11, "Student");
    }

    @Test
    public void test2070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2070");
        com.reservation_system.model.Guest guest5 = new com.reservation_system.model.Guest((int) (byte) 0, "faculty", "researcher", "", false);
    }

    @Test
    public void test2071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2071");
        com.reservation_system.model.HeadLabCoordinator headLabCoordinator5 = new com.reservation_system.model.HeadLabCoordinator((int) (byte) 1, "Guest", "Password1!", "hi!", true);
    }

    @Test
    public void test2072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2072");
        com.reservation_system.model.User user6 = com.reservation_system.patterns.factory.UserFactory.createUser("student", 0, "Andrew", "Password1!", "hi!", true);
        org.junit.Assert.assertNotNull(user6);
    }

    @Test
    public void test2073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2073");
        com.reservation_system.model.HeadLabCoordinator headLabCoordinator5 = new com.reservation_system.model.HeadLabCoordinator((int) (byte) 100, "Student", "andrew@example.com", "Faculty", false);
    }

    @Test
    public void test2074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2074");
        com.reservation_system.model.Student student5 = new com.reservation_system.model.Student((int) (short) 1, "Password1!", "researcher", "Password1!", false);
        java.lang.String str6 = student5.getUserType();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Student" + "'", str6, "Student");
    }

    @Test
    public void test2075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2075");
        com.reservation_system.model.LabManager labManager5 = new com.reservation_system.model.LabManager((int) '4', "researcher", "Faculty", "faculty", false);
        java.lang.String str6 = labManager5.getUserType();
        java.lang.String str7 = labManager5.getUserType();
        java.lang.String str8 = labManager5.getUserType();
        java.lang.String str9 = labManager5.getUserType();
        labManager5.setApproved(true);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "labmanager" + "'", str6, "labmanager");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "labmanager" + "'", str7, "labmanager");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "labmanager" + "'", str8, "labmanager");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "labmanager" + "'", str9, "labmanager");
    }

    @Test
    public void test2076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2076");
        com.reservation_system.model.LabManager labManager5 = new com.reservation_system.model.LabManager((int) (short) 1, "headlabcoordinator", "guest", "Faculty", true);
    }

    @Test
    public void test2077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2077");
        com.reservation_system.model.Guest guest5 = new com.reservation_system.model.Guest(32, "Faculty", "Researcher", "Student", false);
        java.lang.String str6 = guest5.getUserType();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Guest" + "'", str6, "Guest");
    }

    @Test
    public void test2078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2078");
        com.reservation_system.model.User user6 = com.reservation_system.patterns.factory.UserFactory.createUser("faculty", 52, "Password1!", "Student", "Andrew", true);
        org.junit.Assert.assertNotNull(user6);
    }

    @Test
    public void test2079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2079");
        com.reservation_system.model.Student student5 = new com.reservation_system.model.Student((int) (byte) 0, "andrew@example.com", "", "student", true);
        java.lang.String str6 = student5.getPassword();
        java.lang.String str7 = student5.getUserType();
        java.lang.String str8 = student5.getUserType();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "student" + "'", str6, "student");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Student" + "'", str7, "Student");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Student" + "'", str8, "Student");
    }

    @Test
    public void test2080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2080");
        com.reservation_system.model.Student student5 = new com.reservation_system.model.Student((int) (short) 100, "hi!", "student", "", true);
        java.lang.String str6 = student5.getUserType();
        java.lang.String str7 = student5.getPassword();
        java.lang.String str8 = student5.getUserType();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Student" + "'", str6, "Student");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Student" + "'", str8, "Student");
    }

    @Test
    public void test2081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2081");
        com.reservation_system.model.HeadLabCoordinator headLabCoordinator5 = new com.reservation_system.model.HeadLabCoordinator((int) 'a', "researcher", "Password1!", "researcher", false);
        int int6 = headLabCoordinator5.getID();
        java.lang.String str7 = headLabCoordinator5.getPassword();
        java.lang.String str8 = headLabCoordinator5.getUserType();
        java.lang.String str9 = headLabCoordinator5.getPassword();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 97 + "'", int6 == 97);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "researcher" + "'", str7, "researcher");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "headlabcoordinator" + "'", str8, "headlabcoordinator");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "researcher" + "'", str9, "researcher");
    }

    @Test
    public void test2082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2082");
        com.reservation_system.model.Student student5 = new com.reservation_system.model.Student((int) ' ', "Password1!", "Andrew", "", true);
        boolean boolean6 = student5.isApproved();
        java.lang.String str7 = student5.getUserType();
        java.lang.String str8 = student5.getName();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Student" + "'", str7, "Student");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Password1!" + "'", str8, "Password1!");
    }

    @Test
    public void test2083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2083");
        com.reservation_system.model.HeadLabCoordinator headLabCoordinator5 = new com.reservation_system.model.HeadLabCoordinator(10, "guest", "Student", "Faculty", false);
    }

    @Test
    public void test2084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2084");
        com.reservation_system.model.LabManager labManager5 = new com.reservation_system.model.LabManager(52, "", "Student", "researcher", false);
    }

    @Test
    public void test2085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2085");
        com.reservation_system.model.Student student5 = new com.reservation_system.model.Student((int) ' ', "faculty", "faculty", "Student", true);
        java.lang.String str6 = student5.getUserType();
        java.lang.Class<?> wildcardClass7 = student5.getClass();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Student" + "'", str6, "Student");
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test2086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2086");
        // The following exception was thrown during execution in test generation
        try {
            com.reservation_system.model.User user6 = com.reservation_system.patterns.factory.UserFactory.createUser("andrew@example.com", (int) (byte) 1, "Guest", "Student", "guest", true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid user type: andrew@example.com");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2087");
        com.reservation_system.model.Faculty faculty5 = new com.reservation_system.model.Faculty(35, "Andrew", "Andrew", "guest", false);
    }

    @Test
    public void test2088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2088");
        com.reservation_system.model.Student student5 = new com.reservation_system.model.Student((int) (byte) 100, "student", "Student", "Password1!", true);
    }

    @Test
    public void test2089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2089");
        com.reservation_system.model.Faculty faculty5 = new com.reservation_system.model.Faculty(0, "Researcher", "guest", "hi!", true);
        java.lang.String str6 = faculty5.getUserType();
        boolean boolean7 = faculty5.requiresDepartmentApproval();
        boolean boolean8 = faculty5.isApproved();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Faculty" + "'", str6, "Faculty");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test2090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2090");
        com.reservation_system.model.LabManager labManager5 = new com.reservation_system.model.LabManager((int) (byte) 100, "guest", "Guest", "Faculty", true);
    }

    @Test
    public void test2091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2091");
        com.reservation_system.model.Faculty faculty5 = new com.reservation_system.model.Faculty(35, "headlabcoordinator", "Student", "researcher", false);
    }

    @Test
    public void test2092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2092");
        com.reservation_system.model.Faculty faculty5 = new com.reservation_system.model.Faculty((int) (short) 1, "student", "Guest", "Researcher", true);
    }

    @Test
    public void test2093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2093");
        com.reservation_system.model.Researcher researcher5 = new com.reservation_system.model.Researcher(97, "Student", "Faculty", "Guest", true);
        java.lang.String str6 = researcher5.getPassword();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Guest" + "'", str6, "Guest");
    }

    @Test
    public void test2094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2094");
        com.reservation_system.model.Guest guest5 = new com.reservation_system.model.Guest((int) (short) 100, "researcher", "labmanager", "faculty", false);
        java.lang.String str6 = guest5.getUserType();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Guest" + "'", str6, "Guest");
    }

    @Test
    public void test2095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2095");
        com.reservation_system.model.Student student5 = new com.reservation_system.model.Student((int) (byte) 0, "Student", "Researcher", "headlabcoordinator", false);
        int int6 = student5.getID();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test2096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2096");
        com.reservation_system.model.Researcher researcher5 = new com.reservation_system.model.Researcher(32, "guest", "researcher", "Researcher", false);
        java.lang.String str6 = researcher5.getUserType();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Researcher" + "'", str6, "Researcher");
    }

    @Test
    public void test2097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2097");
        // The following exception was thrown during execution in test generation
        try {
            com.reservation_system.model.User user6 = com.reservation_system.patterns.factory.UserFactory.createUser("andrew@example.com", 35, "Student", "labmanager", "andrew@example.com", true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid user type: andrew@example.com");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2098");
        com.reservation_system.model.HeadLabCoordinator headLabCoordinator5 = new com.reservation_system.model.HeadLabCoordinator((int) (short) 100, "researcher", "researcher", "headlabcoordinator", false);
    }

    @Test
    public void test2099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2099");
        com.reservation_system.model.Researcher researcher5 = new com.reservation_system.model.Researcher(0, "student", "", "student", false);
        java.lang.String str6 = researcher5.getPassword();
        researcher5.setApproved(true);
        boolean boolean9 = researcher5.requiresDepartmentApproval();
        java.lang.String str10 = researcher5.getUserType();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "student" + "'", str6, "student");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Researcher" + "'", str10, "Researcher");
    }

    @Test
    public void test2100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2100");
        com.reservation_system.model.Researcher researcher5 = new com.reservation_system.model.Researcher(32, "hi!", "", "guest", false);
        java.lang.String str6 = researcher5.getPassword();
        java.lang.String str7 = researcher5.getUserType();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "guest" + "'", str6, "guest");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Researcher" + "'", str7, "Researcher");
    }

    @Test
    public void test2101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2101");
        com.reservation_system.model.HeadLabCoordinator headLabCoordinator5 = new com.reservation_system.model.HeadLabCoordinator((int) (byte) -1, "", "Researcher", "andrew@example.com", true);
        java.lang.String str6 = headLabCoordinator5.getName();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
    }

    @Test
    public void test2102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2102");
        com.reservation_system.model.Guest guest5 = new com.reservation_system.model.Guest(35, "andrew@example.com", "Guest", "faculty", true);
        boolean boolean6 = guest5.isApproved();
        java.lang.String str7 = guest5.getUserType();
        java.lang.String str8 = guest5.getUserType();
        java.lang.String str9 = guest5.getUserType();
        java.lang.String str10 = guest5.getPassword();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Guest" + "'", str7, "Guest");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Guest" + "'", str8, "Guest");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Guest" + "'", str9, "Guest");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "faculty" + "'", str10, "faculty");
    }

    @Test
    public void test2103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2103");
        com.reservation_system.model.Student student5 = new com.reservation_system.model.Student((int) (short) 0, "labmanager", "Researcher", "Student", true);
        java.lang.String str6 = student5.getUserType();
        student5.setApproved(true);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Student" + "'", str6, "Student");
    }

    @Test
    public void test2104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2104");
        com.reservation_system.model.Researcher researcher5 = new com.reservation_system.model.Researcher(10, "Guest", "Password1!", "headlabcoordinator", true);
        java.lang.String str6 = researcher5.getUserType();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Researcher" + "'", str6, "Researcher");
    }

    @Test
    public void test2105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2105");
        com.reservation_system.model.Student student5 = new com.reservation_system.model.Student((int) '4', "labmanager", "headlabcoordinator", "Andrew", false);
        boolean boolean6 = student5.isApproved();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test2106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2106");
        com.reservation_system.model.HeadLabCoordinator headLabCoordinator5 = new com.reservation_system.model.HeadLabCoordinator(32, "Faculty", "", "", true);
        java.lang.String str6 = headLabCoordinator5.getUserType();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "headlabcoordinator" + "'", str6, "headlabcoordinator");
    }

    @Test
    public void test2107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2107");
        com.reservation_system.model.User user6 = com.reservation_system.patterns.factory.UserFactory.createUser("faculty", (int) (short) 1, "Password1!", "faculty", "Andrew", true);
        user6.setApproved(true);
        org.junit.Assert.assertNotNull(user6);
    }

    @Test
    public void test2108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2108");
        com.reservation_system.model.LabManager labManager5 = new com.reservation_system.model.LabManager(1, "", "faculty", "guest", true);
    }

    @Test
    public void test2109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2109");
        com.reservation_system.model.Researcher researcher5 = new com.reservation_system.model.Researcher(32, "hi!", "", "guest", false);
        java.lang.String str6 = researcher5.getPassword();
        researcher5.setApproved(false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "guest" + "'", str6, "guest");
    }

    @Test
    public void test2110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2110");
        com.reservation_system.model.Guest guest5 = new com.reservation_system.model.Guest((int) (short) 1, "faculty", "Student", "Faculty", true);
        java.lang.String str6 = guest5.getUserType();
        java.lang.String str7 = guest5.getName();
        java.lang.String str8 = guest5.getEmail();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Guest" + "'", str6, "Guest");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "faculty" + "'", str7, "faculty");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Student" + "'", str8, "Student");
    }

    @Test
    public void test2111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2111");
        com.reservation_system.model.HeadLabCoordinator headLabCoordinator5 = new com.reservation_system.model.HeadLabCoordinator((int) (byte) 0, "researcher", "andrew@example.com", "Andrew", false);
    }

    @Test
    public void test2112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2112");
        com.reservation_system.model.HeadLabCoordinator headLabCoordinator5 = new com.reservation_system.model.HeadLabCoordinator(52, "", "labmanager", "andrew@example.com", false);
    }

    @Test
    public void test2113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2113");
        com.reservation_system.model.Researcher researcher5 = new com.reservation_system.model.Researcher((int) (byte) 10, "Password1!", "Faculty", "faculty", true);
    }

    @Test
    public void test2114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2114");
        com.reservation_system.model.Faculty faculty5 = new com.reservation_system.model.Faculty(0, "hi!", "researcher", "researcher", false);
        java.lang.String str6 = faculty5.getUserType();
        java.lang.String str7 = faculty5.getUserType();
        int int8 = faculty5.getID();
        java.lang.String str9 = faculty5.getUserType();
        java.lang.String str10 = faculty5.getEmail();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Faculty" + "'", str6, "Faculty");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Faculty" + "'", str7, "Faculty");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Faculty" + "'", str9, "Faculty");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "researcher" + "'", str10, "researcher");
    }

    @Test
    public void test2115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2115");
        com.reservation_system.model.HeadLabCoordinator headLabCoordinator5 = new com.reservation_system.model.HeadLabCoordinator((int) ' ', "Guest", "", "Student", false);
    }

    @Test
    public void test2116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2116");
        com.reservation_system.model.Guest guest5 = new com.reservation_system.model.Guest((int) 'a', "hi!", "Researcher", "faculty", true);
        java.lang.String str6 = guest5.getName();
        java.lang.String str7 = guest5.getPassword();
        java.lang.String str8 = guest5.getEmail();
        java.lang.String str9 = guest5.getUserType();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "faculty" + "'", str7, "faculty");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Researcher" + "'", str8, "Researcher");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Guest" + "'", str9, "Guest");
    }

    @Test
    public void test2117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2117");
        com.reservation_system.model.HeadLabCoordinator headLabCoordinator5 = new com.reservation_system.model.HeadLabCoordinator((int) ' ', "faculty", "hi!", "researcher", false);
    }

    @Test
    public void test2118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2118");
        com.reservation_system.model.Guest guest5 = new com.reservation_system.model.Guest((int) (short) 0, "Andrew", "Student", "researcher", true);
    }

    @Test
    public void test2119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2119");
        com.reservation_system.model.Researcher researcher5 = new com.reservation_system.model.Researcher(97, "labmanager", "guest", "", true);
        researcher5.setApproved(true);
    }

    @Test
    public void test2120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2120");
        com.reservation_system.model.LabManager labManager5 = new com.reservation_system.model.LabManager(100, "Guest", "labmanager", "labmanager", true);
        boolean boolean6 = labManager5.isApproved();
        java.lang.String str7 = labManager5.getPassword();
        java.lang.String str8 = labManager5.getUserType();
        labManager5.setApproved(false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "labmanager" + "'", str7, "labmanager");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "labmanager" + "'", str8, "labmanager");
    }

    @Test
    public void test2121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2121");
        com.reservation_system.model.LabManager labManager5 = new com.reservation_system.model.LabManager((int) (byte) 1, "Researcher", "Researcher", "student", false);
        java.lang.String str6 = labManager5.getUserType();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "labmanager" + "'", str6, "labmanager");
    }

    @Test
    public void test2122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2122");
        com.reservation_system.model.User user6 = com.reservation_system.patterns.factory.UserFactory.createUser("researcher", (int) (short) 100, "Password1!", "faculty", "", false);
        org.junit.Assert.assertNotNull(user6);
    }

    @Test
    public void test2123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2123");
        com.reservation_system.model.Faculty faculty5 = new com.reservation_system.model.Faculty((int) (short) 1, "researcher", "andrew@example.com", "hi!", true);
        java.lang.String str6 = faculty5.getUserType();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Faculty" + "'", str6, "Faculty");
    }

    @Test
    public void test2124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2124");
        com.reservation_system.model.Guest guest5 = new com.reservation_system.model.Guest((int) (byte) -1, "Password1!", "andrew@example.com", "Researcher", false);
    }

    @Test
    public void test2125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2125");
        com.reservation_system.model.LabManager labManager5 = new com.reservation_system.model.LabManager((int) ' ', "researcher", "Researcher", "hi!", false);
        java.lang.String str6 = labManager5.getUserType();
        java.lang.Class<?> wildcardClass7 = labManager5.getClass();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "labmanager" + "'", str6, "labmanager");
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test2126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2126");
        com.reservation_system.model.LabManager labManager5 = new com.reservation_system.model.LabManager((-1), "andrew@example.com", "", "headlabcoordinator", true);
    }

    @Test
    public void test2127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2127");
        com.reservation_system.model.Guest guest5 = new com.reservation_system.model.Guest((int) '4', "andrew@example.com", "student", "faculty", true);
        java.lang.String str6 = guest5.getName();
        java.lang.String str7 = guest5.getPassword();
        java.lang.String str8 = guest5.getUserType();
        boolean boolean9 = guest5.isApproved();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "faculty" + "'", str7, "faculty");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Guest" + "'", str8, "Guest");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test2128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2128");
        com.reservation_system.model.Faculty faculty5 = new com.reservation_system.model.Faculty(0, "hi!", "researcher", "researcher", false);
        java.lang.String str6 = faculty5.getUserType();
        java.lang.String str7 = faculty5.getName();
        java.lang.String str8 = faculty5.getEmail();
        java.lang.String str9 = faculty5.getUserType();
        java.lang.String str10 = faculty5.getPassword();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Faculty" + "'", str6, "Faculty");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "researcher" + "'", str8, "researcher");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Faculty" + "'", str9, "Faculty");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "researcher" + "'", str10, "researcher");
    }

    @Test
    public void test2129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2129");
        com.reservation_system.model.Faculty faculty5 = new com.reservation_system.model.Faculty(35, "Student", "faculty", "headlabcoordinator", false);
    }

    @Test
    public void test2130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2130");
        com.reservation_system.model.User user6 = com.reservation_system.patterns.factory.UserFactory.createUser("guest", (int) ' ', "", "Faculty", "hi!", false);
        java.lang.String str7 = user6.getPassword();
        org.junit.Assert.assertNotNull(user6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
    }

    @Test
    public void test2131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2131");
        com.reservation_system.model.Student student5 = new com.reservation_system.model.Student((int) 'a', "headlabcoordinator", "Guest", "", false);
        boolean boolean6 = student5.isApproved();
        boolean boolean7 = student5.isApproved();
        java.lang.String str8 = student5.getUserType();
        int int9 = student5.getID();
        int int10 = student5.getID();
        java.lang.String str11 = student5.getUserType();
        boolean boolean12 = student5.requiresDepartmentApproval();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Student" + "'", str8, "Student");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 97 + "'", int9 == 97);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 97 + "'", int10 == 97);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Student" + "'", str11, "Student");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test2132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2132");
        com.reservation_system.model.Researcher researcher5 = new com.reservation_system.model.Researcher(0, "student", "", "student", false);
        java.lang.String str6 = researcher5.getEmail();
        java.lang.String str7 = researcher5.getEmail();
        boolean boolean8 = researcher5.isApproved();
        java.lang.String str9 = researcher5.getName();
        researcher5.setApproved(true);
        java.lang.String str12 = researcher5.getEmail();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "student" + "'", str9, "student");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test2133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2133");
        com.reservation_system.model.HeadLabCoordinator headLabCoordinator5 = new com.reservation_system.model.HeadLabCoordinator((int) '#', "Password1!", "Researcher", "Student", true);
        int int6 = headLabCoordinator5.getID();
        java.lang.String str7 = headLabCoordinator5.getUserType();
        java.lang.String str8 = headLabCoordinator5.getUserType();
        java.lang.String str9 = headLabCoordinator5.getUserType();
        java.lang.String str10 = headLabCoordinator5.getUserType();
        java.lang.String str11 = headLabCoordinator5.getUserType();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 35 + "'", int6 == 35);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "headlabcoordinator" + "'", str7, "headlabcoordinator");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "headlabcoordinator" + "'", str8, "headlabcoordinator");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "headlabcoordinator" + "'", str9, "headlabcoordinator");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "headlabcoordinator" + "'", str10, "headlabcoordinator");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "headlabcoordinator" + "'", str11, "headlabcoordinator");
    }

    @Test
    public void test2134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2134");
        com.reservation_system.model.HeadLabCoordinator headLabCoordinator5 = new com.reservation_system.model.HeadLabCoordinator((int) (byte) 10, "Password1!", "student", "Andrew", false);
        java.lang.String str6 = headLabCoordinator5.getUserType();
        java.lang.String str7 = headLabCoordinator5.getName();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "headlabcoordinator" + "'", str6, "headlabcoordinator");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Password1!" + "'", str7, "Password1!");
    }

    @Test
    public void test2135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2135");
        com.reservation_system.model.HeadLabCoordinator headLabCoordinator5 = new com.reservation_system.model.HeadLabCoordinator((int) (short) 1, "headlabcoordinator", "Guest", "Guest", false);
    }

    @Test
    public void test2136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2136");
        com.reservation_system.model.Researcher researcher5 = new com.reservation_system.model.Researcher((int) (byte) -1, "Password1!", "student", "Researcher", true);
        java.lang.String str6 = researcher5.getName();
        java.lang.String str7 = researcher5.getUserType();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Password1!" + "'", str6, "Password1!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Researcher" + "'", str7, "Researcher");
    }

    @Test
    public void test2137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2137");
        com.reservation_system.model.Guest guest5 = new com.reservation_system.model.Guest((int) (short) 0, "Researcher", "faculty", "", false);
    }

    @Test
    public void test2138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2138");
        com.reservation_system.model.Researcher researcher5 = new com.reservation_system.model.Researcher((int) (short) 100, "faculty", "Faculty", "faculty", false);
    }

    @Test
    public void test2139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2139");
        com.reservation_system.model.User user6 = com.reservation_system.patterns.factory.UserFactory.createUser("guest", (int) 'a', "headlabcoordinator", "Faculty", "Guest", true);
        org.junit.Assert.assertNotNull(user6);
    }

    @Test
    public void test2140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2140");
        com.reservation_system.model.Researcher researcher5 = new com.reservation_system.model.Researcher(0, "student", "", "student", false);
        boolean boolean6 = researcher5.isApproved();
        java.lang.String str7 = researcher5.getEmail();
        researcher5.setApproved(false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
    }

    @Test
    public void test2141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2141");
        com.reservation_system.model.Student student5 = new com.reservation_system.model.Student((int) (byte) 1, "hi!", "guest", "Researcher", true);
    }

    @Test
    public void test2142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2142");
        com.reservation_system.model.LabManager labManager5 = new com.reservation_system.model.LabManager((int) (short) -1, "hi!", "Guest", "andrew@example.com", true);
        java.lang.String str6 = labManager5.getPassword();
    }

    @Test
    public void test2143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2143");
        com.reservation_system.model.Student student5 = new com.reservation_system.model.Student(35, "headlabcoordinator", "", "Researcher", false);
    }

    @Test
    public void test2144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2144");
        com.reservation_system.model.Faculty faculty5 = new com.reservation_system.model.Faculty(10, "hi!", "", "guest", false);
        java.lang.String str6 = faculty5.getUserType();
        java.lang.String str7 = faculty5.getUserType();
        java.lang.String str8 = faculty5.getEmail();
        java.lang.String str9 = faculty5.getUserType();
        java.lang.String str10 = faculty5.getEmail();
        java.lang.String str11 = faculty5.getUserType();
        boolean boolean12 = faculty5.isApproved();
        java.lang.String str13 = faculty5.getUserType();
        java.lang.String str14 = faculty5.getUserType();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Faculty" + "'", str6, "Faculty");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Faculty" + "'", str7, "Faculty");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Faculty" + "'", str9, "Faculty");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Faculty" + "'", str11, "Faculty");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Faculty" + "'", str13, "Faculty");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Faculty" + "'", str14, "Faculty");
    }

    @Test
    public void test2145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2145");
        com.reservation_system.model.Student student5 = new com.reservation_system.model.Student(1, "guest", "hi!", "student", false);
        java.lang.String str6 = student5.getUserType();
        java.lang.String str7 = student5.getUserType();
        java.lang.String str8 = student5.getUserType();
        student5.setApproved(false);
        java.lang.String str11 = student5.getUserType();
        java.lang.String str12 = student5.getPassword();
        java.lang.String str13 = student5.getUserType();
        boolean boolean14 = student5.isApproved();
        java.lang.Class<?> wildcardClass15 = student5.getClass();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Student" + "'", str6, "Student");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Student" + "'", str7, "Student");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Student" + "'", str8, "Student");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Student" + "'", str11, "Student");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "student" + "'", str12, "student");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Student" + "'", str13, "Student");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test2146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2146");
        com.reservation_system.model.Researcher researcher5 = new com.reservation_system.model.Researcher(0, "student", "", "student", false);
        boolean boolean6 = researcher5.isApproved();
        boolean boolean7 = researcher5.isApproved();
        java.lang.String str8 = researcher5.getEmail();
        java.lang.String str9 = researcher5.getUserType();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Researcher" + "'", str9, "Researcher");
    }

    @Test
    public void test2147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2147");
        com.reservation_system.model.LabManager labManager5 = new com.reservation_system.model.LabManager((int) (short) 10, "headlabcoordinator", "Andrew", "guest", true);
        java.lang.String str6 = labManager5.getPassword();
        boolean boolean7 = labManager5.requiresDepartmentApproval();
        java.lang.String str8 = labManager5.getUserType();
        java.lang.String str9 = labManager5.getUserType();
        labManager5.setApproved(false);
        java.lang.String str12 = labManager5.getPassword();
        java.lang.Class<?> wildcardClass13 = labManager5.getClass();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "guest" + "'", str6, "guest");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "labmanager" + "'", str8, "labmanager");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "labmanager" + "'", str9, "labmanager");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "guest" + "'", str12, "guest");
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test2148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2148");
        com.reservation_system.model.HeadLabCoordinator headLabCoordinator5 = new com.reservation_system.model.HeadLabCoordinator((int) (byte) 100, "Guest", "hi!", "andrew@example.com", true);
        boolean boolean6 = headLabCoordinator5.isApproved();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test2149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2149");
        com.reservation_system.model.HeadLabCoordinator headLabCoordinator5 = new com.reservation_system.model.HeadLabCoordinator((int) (short) 10, "Researcher", "andrew@example.com", "student", false);
        java.lang.String str6 = headLabCoordinator5.getUserType();
        java.lang.String str7 = headLabCoordinator5.getUserType();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "headlabcoordinator" + "'", str6, "headlabcoordinator");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "headlabcoordinator" + "'", str7, "headlabcoordinator");
    }

    @Test
    public void test2150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2150");
        com.reservation_system.model.Researcher researcher5 = new com.reservation_system.model.Researcher((int) (byte) 100, "Faculty", "", "labmanager", true);
    }

    @Test
    public void test2151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2151");
        com.reservation_system.model.Researcher researcher5 = new com.reservation_system.model.Researcher((int) (byte) 1, "faculty", "labmanager", "Andrew", false);
    }

    @Test
    public void test2152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2152");
        com.reservation_system.model.Faculty faculty5 = new com.reservation_system.model.Faculty((int) (short) 0, "Student", "Password1!", "Andrew", true);
    }

    @Test
    public void test2153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2153");
        com.reservation_system.model.Faculty faculty5 = new com.reservation_system.model.Faculty((int) (byte) 0, "student", "Researcher", "hi!", true);
        java.lang.String str6 = faculty5.getUserType();
        faculty5.setApproved(false);
        java.lang.String str9 = faculty5.getUserType();
        int int10 = faculty5.getID();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Faculty" + "'", str6, "Faculty");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Faculty" + "'", str9, "Faculty");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test2154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2154");
        com.reservation_system.model.Researcher researcher5 = new com.reservation_system.model.Researcher(0, "student", "headlabcoordinator", "Guest", true);
        java.lang.String str6 = researcher5.getEmail();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "headlabcoordinator" + "'", str6, "headlabcoordinator");
    }

    @Test
    public void test2155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2155");
        com.reservation_system.model.Student student5 = new com.reservation_system.model.Student((int) (byte) 1, "headlabcoordinator", "labmanager", "faculty", true);
        java.lang.String str6 = student5.getEmail();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "labmanager" + "'", str6, "labmanager");
    }

    @Test
    public void test2156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2156");
        com.reservation_system.model.Researcher researcher5 = new com.reservation_system.model.Researcher((int) (short) 100, "andrew@example.com", "andrew@example.com", "", false);
    }

    @Test
    public void test2157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2157");
        com.reservation_system.model.HeadLabCoordinator headLabCoordinator5 = new com.reservation_system.model.HeadLabCoordinator((int) (byte) 100, "student", "student", "student", true);
        java.lang.String str6 = headLabCoordinator5.getUserType();
        java.lang.String str7 = headLabCoordinator5.getName();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "headlabcoordinator" + "'", str6, "headlabcoordinator");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "student" + "'", str7, "student");
    }

    @Test
    public void test2158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2158");
        com.reservation_system.model.User user6 = com.reservation_system.patterns.factory.UserFactory.createUser("Researcher", (int) (short) 0, "guest", "researcher", "faculty", false);
        boolean boolean7 = user6.requiresDepartmentApproval();
        boolean boolean8 = user6.requiresDepartmentApproval();
        org.junit.Assert.assertNotNull(user6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test2159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2159");
        com.reservation_system.model.HeadLabCoordinator headLabCoordinator5 = new com.reservation_system.model.HeadLabCoordinator(32, "Student", "Student", "Student", false);
    }

    @Test
    public void test2160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2160");
        com.reservation_system.model.Student student5 = new com.reservation_system.model.Student((int) '#', "faculty", "", "", false);
        java.lang.String str6 = student5.getUserType();
        java.lang.String str7 = student5.getUserType();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Student" + "'", str6, "Student");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Student" + "'", str7, "Student");
    }

    @Test
    public void test2161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2161");
        com.reservation_system.model.Faculty faculty5 = new com.reservation_system.model.Faculty((int) (byte) 0, "labmanager", "student", "labmanager", false);
    }

    @Test
    public void test2162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2162");
        com.reservation_system.model.Student student5 = new com.reservation_system.model.Student(0, "Password1!", "", "", false);
        java.lang.String str6 = student5.getUserType();
        java.lang.String str7 = student5.getEmail();
        java.lang.String str8 = student5.getUserType();
        java.lang.String str9 = student5.getUserType();
        java.lang.String str10 = student5.getEmail();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Student" + "'", str6, "Student");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Student" + "'", str8, "Student");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Student" + "'", str9, "Student");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test2163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2163");
        com.reservation_system.model.Guest guest5 = new com.reservation_system.model.Guest(97, "headlabcoordinator", "faculty", "guest", false);
    }

    @Test
    public void test2164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2164");
        com.reservation_system.model.Guest guest5 = new com.reservation_system.model.Guest((int) (byte) 100, "faculty", "faculty", "faculty", true);
        java.lang.String str6 = guest5.getUserType();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Guest" + "'", str6, "Guest");
    }

    @Test
    public void test2165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2165");
        com.reservation_system.model.HeadLabCoordinator headLabCoordinator5 = new com.reservation_system.model.HeadLabCoordinator(97, "Andrew", "", "Guest", false);
        java.lang.String str6 = headLabCoordinator5.getUserType();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "headlabcoordinator" + "'", str6, "headlabcoordinator");
    }

    @Test
    public void test2166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2166");
        com.reservation_system.model.Faculty faculty5 = new com.reservation_system.model.Faculty((int) '4', "researcher", "researcher", "Researcher", true);
        java.lang.String str6 = faculty5.getUserType();
        java.lang.String str7 = faculty5.getUserType();
        java.lang.String str8 = faculty5.getUserType();
        java.lang.String str9 = faculty5.getUserType();
        java.lang.String str10 = faculty5.getUserType();
        faculty5.setApproved(false);
        java.lang.String str13 = faculty5.getUserType();
        java.lang.String str14 = faculty5.getUserType();
        java.lang.String str15 = faculty5.getName();
        faculty5.setApproved(true);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Faculty" + "'", str6, "Faculty");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Faculty" + "'", str7, "Faculty");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Faculty" + "'", str8, "Faculty");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Faculty" + "'", str9, "Faculty");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Faculty" + "'", str10, "Faculty");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Faculty" + "'", str13, "Faculty");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Faculty" + "'", str14, "Faculty");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "researcher" + "'", str15, "researcher");
    }

    @Test
    public void test2167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2167");
        // The following exception was thrown during execution in test generation
        try {
            com.reservation_system.model.User user6 = com.reservation_system.patterns.factory.UserFactory.createUser("", (int) '#', "Researcher", "Student", "Guest", true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid user type: ");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2168");
        com.reservation_system.model.Student student5 = new com.reservation_system.model.Student((-1), "hi!", "Andrew", "labmanager", false);
        java.lang.String str6 = student5.getUserType();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Student" + "'", str6, "Student");
    }

    @Test
    public void test2169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2169");
        com.reservation_system.model.Faculty faculty5 = new com.reservation_system.model.Faculty((int) ' ', "hi!", "headlabcoordinator", "hi!", true);
        java.lang.String str6 = faculty5.getEmail();
        boolean boolean7 = faculty5.requiresDepartmentApproval();
        java.lang.String str8 = faculty5.getName();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "headlabcoordinator" + "'", str6, "headlabcoordinator");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
    }

    @Test
    public void test2170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2170");
        com.reservation_system.model.Student student5 = new com.reservation_system.model.Student(10, "student", "guest", "hi!", false);
    }

    @Test
    public void test2171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2171");
        com.reservation_system.model.Guest guest5 = new com.reservation_system.model.Guest(1, "", "student", "student", true);
        guest5.setApproved(true);
        java.lang.String str8 = guest5.getUserType();
        java.lang.String str9 = guest5.getPassword();
        int int10 = guest5.getID();
        java.lang.String str11 = guest5.getPassword();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Guest" + "'", str8, "Guest");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "student" + "'", str9, "student");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "student" + "'", str11, "student");
    }

    @Test
    public void test2172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2172");
        com.reservation_system.model.LabManager labManager5 = new com.reservation_system.model.LabManager((int) (short) 1, "researcher", "Andrew", "Guest", true);
        boolean boolean6 = labManager5.requiresDepartmentApproval();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test2173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2173");
        com.reservation_system.model.Researcher researcher5 = new com.reservation_system.model.Researcher(100, "Password1!", "", "Andrew", false);
    }

    @Test
    public void test2174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2174");
        com.reservation_system.model.Faculty faculty5 = new com.reservation_system.model.Faculty(32, "faculty", "hi!", "Password1!", true);
        java.lang.String str6 = faculty5.getPassword();
        java.lang.String str7 = faculty5.getUserType();
        faculty5.setApproved(true);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Password1!" + "'", str6, "Password1!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Faculty" + "'", str7, "Faculty");
    }

    @Test
    public void test2175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2175");
        com.reservation_system.model.User user6 = com.reservation_system.patterns.factory.UserFactory.createUser("Guest", (int) (byte) -1, "Researcher", "Password1!", "hi!", false);
        int int7 = user6.getID();
        org.junit.Assert.assertNotNull(user6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
    }

    @Test
    public void test2176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2176");
        com.reservation_system.model.Guest guest5 = new com.reservation_system.model.Guest(0, "faculty", "Andrew", "hi!", false);
        java.lang.String str6 = guest5.getUserType();
        java.lang.String str7 = guest5.getUserType();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Guest" + "'", str6, "Guest");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Guest" + "'", str7, "Guest");
    }

    @Test
    public void test2177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2177");
        com.reservation_system.model.Student student5 = new com.reservation_system.model.Student((-1), "student", "Guest", "faculty", true);
        java.lang.String str6 = student5.getUserType();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Student" + "'", str6, "Student");
    }

    @Test
    public void test2178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2178");
        com.reservation_system.model.Guest guest5 = new com.reservation_system.model.Guest((int) (byte) 1, "guest", "Guest", "guest", false);
        boolean boolean6 = guest5.requiresDepartmentApproval();
        java.lang.String str7 = guest5.getUserType();
        java.lang.String str8 = guest5.getEmail();
        java.lang.String str9 = guest5.getUserType();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Guest" + "'", str7, "Guest");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Guest" + "'", str8, "Guest");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Guest" + "'", str9, "Guest");
    }

    @Test
    public void test2179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2179");
        com.reservation_system.model.Researcher researcher5 = new com.reservation_system.model.Researcher(0, "Password1!", "Student", "student", false);
    }

    @Test
    public void test2180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2180");
        // The following exception was thrown during execution in test generation
        try {
            com.reservation_system.model.User user6 = com.reservation_system.patterns.factory.UserFactory.createUser("hi!", (int) (short) 0, "Password1!", "headlabcoordinator", "Guest", true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid user type: hi!");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2181");
        com.reservation_system.model.Student student5 = new com.reservation_system.model.Student((int) (short) 10, "guest", "labmanager", "", false);
        java.lang.String str6 = student5.getUserType();
        java.lang.String str7 = student5.getUserType();
        java.lang.String str8 = student5.getPassword();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Student" + "'", str6, "Student");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Student" + "'", str7, "Student");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test2182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2182");
        com.reservation_system.model.Student student5 = new com.reservation_system.model.Student(0, "hi!", "", "researcher", false);
        int int6 = student5.getID();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test2183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2183");
        com.reservation_system.model.LabManager labManager5 = new com.reservation_system.model.LabManager((int) '#', "Researcher", "hi!", "", false);
        java.lang.String str6 = labManager5.getUserType();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "labmanager" + "'", str6, "labmanager");
    }

    @Test
    public void test2184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2184");
        com.reservation_system.model.User user6 = com.reservation_system.patterns.factory.UserFactory.createUser("guest", 1, "Andrew", "student", "student", false);
        org.junit.Assert.assertNotNull(user6);
    }

    @Test
    public void test2185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2185");
        com.reservation_system.model.LabManager labManager5 = new com.reservation_system.model.LabManager(97, "Faculty", "Guest", "Andrew", true);
        java.lang.String str6 = labManager5.getUserType();
        java.lang.String str7 = labManager5.getUserType();
        java.lang.String str8 = labManager5.getUserType();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "labmanager" + "'", str6, "labmanager");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "labmanager" + "'", str7, "labmanager");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "labmanager" + "'", str8, "labmanager");
    }

    @Test
    public void test2186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2186");
        com.reservation_system.model.Student student5 = new com.reservation_system.model.Student((int) (byte) 1, "Student", "Researcher", "Student", false);
    }

    @Test
    public void test2187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2187");
        com.reservation_system.model.Student student5 = new com.reservation_system.model.Student(97, "Guest", "Guest", "Faculty", true);
        java.lang.String str6 = student5.getUserType();
        java.lang.String str7 = student5.getUserType();
        java.lang.String str8 = student5.getUserType();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Student" + "'", str6, "Student");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Student" + "'", str7, "Student");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Student" + "'", str8, "Student");
    }

    @Test
    public void test2188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2188");
        com.reservation_system.model.Guest guest5 = new com.reservation_system.model.Guest((int) (byte) -1, "", "Student", "faculty", true);
    }

    @Test
    public void test2189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2189");
        com.reservation_system.model.LabManager labManager5 = new com.reservation_system.model.LabManager((int) (short) 0, "", "labmanager", "Student", false);
        java.lang.String str6 = labManager5.getEmail();
        java.lang.String str7 = labManager5.getUserType();
        labManager5.setApproved(false);
        java.lang.String str10 = labManager5.getUserType();
        java.lang.String str11 = labManager5.getName();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "labmanager" + "'", str6, "labmanager");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "labmanager" + "'", str7, "labmanager");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "labmanager" + "'", str10, "labmanager");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
    }

    @Test
    public void test2190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2190");
        com.reservation_system.model.LabManager labManager5 = new com.reservation_system.model.LabManager((int) (short) 0, "", "labmanager", "Guest", false);
        int int6 = labManager5.getID();
        java.lang.Class<?> wildcardClass7 = labManager5.getClass();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test2191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2191");
        com.reservation_system.model.Faculty faculty5 = new com.reservation_system.model.Faculty((int) (byte) 1, "", "Password1!", "andrew@example.com", false);
        java.lang.String str6 = faculty5.getName();
        java.lang.String str7 = faculty5.getUserType();
        java.lang.String str8 = faculty5.getUserType();
        java.lang.String str9 = faculty5.getUserType();
        java.lang.String str10 = faculty5.getUserType();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Faculty" + "'", str7, "Faculty");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Faculty" + "'", str8, "Faculty");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Faculty" + "'", str9, "Faculty");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Faculty" + "'", str10, "Faculty");
    }

    @Test
    public void test2192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2192");
        com.reservation_system.model.Faculty faculty5 = new com.reservation_system.model.Faculty(10, "andrew@example.com", "Guest", "headlabcoordinator", false);
    }

    @Test
    public void test2193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2193");
        // The following exception was thrown during execution in test generation
        try {
            com.reservation_system.model.User user6 = com.reservation_system.patterns.factory.UserFactory.createUser("Password1!", 32, "", "researcher", "Andrew", false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid user type: Password1!");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2194");
        com.reservation_system.model.HeadLabCoordinator headLabCoordinator5 = new com.reservation_system.model.HeadLabCoordinator(10, "Password1!", "", "Faculty", true);
        java.lang.String str6 = headLabCoordinator5.getPassword();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Faculty" + "'", str6, "Faculty");
    }

    @Test
    public void test2195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2195");
        com.reservation_system.model.Researcher researcher5 = new com.reservation_system.model.Researcher(0, "student", "", "student", false);
        java.lang.String str6 = researcher5.getEmail();
        java.lang.String str7 = researcher5.getPassword();
        java.lang.String str8 = researcher5.getName();
        boolean boolean9 = researcher5.requiresDepartmentApproval();
        boolean boolean10 = researcher5.isApproved();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "student" + "'", str7, "student");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "student" + "'", str8, "student");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test2196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2196");
        com.reservation_system.model.HeadLabCoordinator headLabCoordinator5 = new com.reservation_system.model.HeadLabCoordinator((int) (short) -1, "faculty", "labmanager", "Andrew", true);
        java.lang.String str6 = headLabCoordinator5.getUserType();
        java.lang.String str7 = headLabCoordinator5.getUserType();
        boolean boolean8 = headLabCoordinator5.isApproved();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "headlabcoordinator" + "'", str6, "headlabcoordinator");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "headlabcoordinator" + "'", str7, "headlabcoordinator");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test2197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2197");
        com.reservation_system.model.Faculty faculty5 = new com.reservation_system.model.Faculty(0, "Guest", "student", "Student", false);
        java.lang.String str6 = faculty5.getEmail();
        java.lang.String str7 = faculty5.getUserType();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "student" + "'", str6, "student");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Faculty" + "'", str7, "Faculty");
    }

    @Test
    public void test2198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2198");
        com.reservation_system.model.Guest guest5 = new com.reservation_system.model.Guest(100, "headlabcoordinator", "Andrew", "hi!", true);
        java.lang.String str6 = guest5.getUserType();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Guest" + "'", str6, "Guest");
    }

    @Test
    public void test2199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2199");
        com.reservation_system.model.Faculty faculty5 = new com.reservation_system.model.Faculty((int) '4', "labmanager", "faculty", "", false);
        faculty5.setApproved(true);
    }

    @Test
    public void test2200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2200");
        com.reservation_system.model.Guest guest5 = new com.reservation_system.model.Guest(1, "", "student", "student", true);
        guest5.setApproved(true);
        guest5.setApproved(false);
        java.lang.String str10 = guest5.getName();
        java.lang.String str11 = guest5.getEmail();
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "student" + "'", str11, "student");
    }

    @Test
    public void test2201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2201");
        com.reservation_system.model.LabManager labManager5 = new com.reservation_system.model.LabManager((int) (short) 1, "andrew@example.com", "", "Andrew", true);
        java.lang.String str6 = labManager5.getUserType();
        java.lang.String str7 = labManager5.getEmail();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "labmanager" + "'", str6, "labmanager");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
    }

    @Test
    public void test2202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2202");
        com.reservation_system.model.LabManager labManager5 = new com.reservation_system.model.LabManager((int) (byte) 1, "Faculty", "labmanager", "andrew@example.com", false);
        java.lang.String str6 = labManager5.getUserType();
        labManager5.setApproved(true);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "labmanager" + "'", str6, "labmanager");
    }

    @Test
    public void test2203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2203");
        com.reservation_system.model.Faculty faculty5 = new com.reservation_system.model.Faculty(100, "Andrew", "andrew@example.com", "faculty", false);
    }

    @Test
    public void test2204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2204");
        com.reservation_system.model.Student student5 = new com.reservation_system.model.Student(0, "researcher", "student", "hi!", true);
        java.lang.String str6 = student5.getUserType();
        java.lang.String str7 = student5.getUserType();
        student5.setApproved(false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Student" + "'", str6, "Student");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Student" + "'", str7, "Student");
    }

    @Test
    public void test2205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2205");
        com.reservation_system.model.Faculty faculty5 = new com.reservation_system.model.Faculty(0, "hi!", "researcher", "researcher", false);
        java.lang.String str6 = faculty5.getUserType();
        java.lang.String str7 = faculty5.getName();
        boolean boolean8 = faculty5.requiresDepartmentApproval();
        java.lang.String str9 = faculty5.getUserType();
        faculty5.setApproved(true);
        java.lang.Class<?> wildcardClass12 = faculty5.getClass();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Faculty" + "'", str6, "Faculty");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Faculty" + "'", str9, "Faculty");
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test2206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2206");
        com.reservation_system.model.Guest guest5 = new com.reservation_system.model.Guest((int) (byte) 0, "faculty", "", "student", true);
    }

    @Test
    public void test2207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2207");
        com.reservation_system.model.Student student5 = new com.reservation_system.model.Student(32, "Password1!", "guest", "Password1!", false);
    }

    @Test
    public void test2208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2208");
        com.reservation_system.model.LabManager labManager5 = new com.reservation_system.model.LabManager(32, "headlabcoordinator", "Faculty", "", true);
    }

    @Test
    public void test2209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2209");
        com.reservation_system.model.HeadLabCoordinator headLabCoordinator5 = new com.reservation_system.model.HeadLabCoordinator(100, "Researcher", "", "researcher", false);
    }

    @Test
    public void test2210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2210");
        com.reservation_system.model.Faculty faculty5 = new com.reservation_system.model.Faculty(97, "", "Faculty", "Faculty", true);
        int int6 = faculty5.getID();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 97 + "'", int6 == 97);
    }

    @Test
    public void test2211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2211");
        com.reservation_system.model.HeadLabCoordinator headLabCoordinator5 = new com.reservation_system.model.HeadLabCoordinator((int) (short) -1, "faculty", "researcher", "Password1!", true);
    }

    @Test
    public void test2212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2212");
        com.reservation_system.model.Guest guest5 = new com.reservation_system.model.Guest((int) (short) 100, "Andrew", "", "Student", false);
        java.lang.String str6 = guest5.getPassword();
        boolean boolean7 = guest5.isApproved();
        java.lang.String str8 = guest5.getPassword();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Student" + "'", str6, "Student");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Student" + "'", str8, "Student");
    }

    @Test
    public void test2213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2213");
        com.reservation_system.model.HeadLabCoordinator headLabCoordinator5 = new com.reservation_system.model.HeadLabCoordinator(97, "guest", "hi!", "faculty", false);
        int int6 = headLabCoordinator5.getID();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 97 + "'", int6 == 97);
    }

    @Test
    public void test2214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2214");
        com.reservation_system.model.Guest guest5 = new com.reservation_system.model.Guest((int) '4', "andrew@example.com", "student", "student", false);
        guest5.setApproved(false);
        java.lang.String str8 = guest5.getEmail();
        java.lang.String str9 = guest5.getUserType();
        java.lang.String str10 = guest5.getUserType();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "student" + "'", str8, "student");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Guest" + "'", str9, "Guest");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Guest" + "'", str10, "Guest");
    }

    @Test
    public void test2215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2215");
        com.reservation_system.model.Guest guest5 = new com.reservation_system.model.Guest((int) (byte) 100, "headlabcoordinator", "researcher", "", true);
    }

    @Test
    public void test2216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2216");
        com.reservation_system.model.Faculty faculty5 = new com.reservation_system.model.Faculty(32, "Password1!", "student", "Researcher", false);
        java.lang.String str6 = faculty5.getUserType();
        java.lang.String str7 = faculty5.getUserType();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Faculty" + "'", str6, "Faculty");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Faculty" + "'", str7, "Faculty");
    }

    @Test
    public void test2217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2217");
        com.reservation_system.model.HeadLabCoordinator headLabCoordinator5 = new com.reservation_system.model.HeadLabCoordinator((int) (short) 100, "student", "student", "Faculty", false);
    }

    @Test
    public void test2218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2218");
        com.reservation_system.model.Researcher researcher5 = new com.reservation_system.model.Researcher((int) (short) 1, "Faculty", "Faculty", "guest", false);
        java.lang.String str6 = researcher5.getUserType();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Researcher" + "'", str6, "Researcher");
    }

    @Test
    public void test2219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2219");
        com.reservation_system.model.Faculty faculty5 = new com.reservation_system.model.Faculty((int) 'a', "Student", "guest", "Student", false);
    }

    @Test
    public void test2220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2220");
        com.reservation_system.model.Faculty faculty5 = new com.reservation_system.model.Faculty((int) (short) 100, "Guest", "", "Guest", false);
    }

    @Test
    public void test2221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2221");
        com.reservation_system.model.Student student5 = new com.reservation_system.model.Student(10, "student", "", "faculty", true);
        java.lang.String str6 = student5.getUserType();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Student" + "'", str6, "Student");
    }

    @Test
    public void test2222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2222");
        com.reservation_system.model.Faculty faculty5 = new com.reservation_system.model.Faculty((int) (byte) 1, "labmanager", "researcher", "labmanager", true);
    }

    @Test
    public void test2223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2223");
        com.reservation_system.model.Faculty faculty5 = new com.reservation_system.model.Faculty((int) (short) 0, "student", "Guest", "Guest", true);
    }

    @Test
    public void test2224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2224");
        com.reservation_system.model.Student student5 = new com.reservation_system.model.Student((int) (short) -1, "Guest", "", "guest", true);
        java.lang.String str6 = student5.getPassword();
        java.lang.String str7 = student5.getUserType();
        java.lang.String str8 = student5.getUserType();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "guest" + "'", str6, "guest");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Student" + "'", str7, "Student");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Student" + "'", str8, "Student");
    }

    @Test
    public void test2225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2225");
        com.reservation_system.model.Guest guest5 = new com.reservation_system.model.Guest(35, "labmanager", "guest", "Password1!", false);
    }

    @Test
    public void test2226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2226");
        com.reservation_system.model.LabManager labManager5 = new com.reservation_system.model.LabManager((int) '#', "faculty", "headlabcoordinator", "researcher", true);
        java.lang.Class<?> wildcardClass6 = labManager5.getClass();
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test2227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2227");
        com.reservation_system.model.Student student5 = new com.reservation_system.model.Student((int) (byte) 100, "headlabcoordinator", "headlabcoordinator", "guest", false);
        java.lang.String str6 = student5.getUserType();
        int int7 = student5.getID();
        java.lang.String str8 = student5.getUserType();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Student" + "'", str6, "Student");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 100 + "'", int7 == 100);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Student" + "'", str8, "Student");
    }

    @Test
    public void test2228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2228");
        com.reservation_system.model.Student student5 = new com.reservation_system.model.Student(97, "andrew@example.com", "andrew@example.com", "Faculty", true);
        java.lang.String str6 = student5.getUserType();
        boolean boolean7 = student5.requiresDepartmentApproval();
        java.lang.String str8 = student5.getUserType();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Student" + "'", str6, "Student");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Student" + "'", str8, "Student");
    }

    @Test
    public void test2229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2229");
        com.reservation_system.model.HeadLabCoordinator headLabCoordinator5 = new com.reservation_system.model.HeadLabCoordinator((int) (byte) -1, "faculty", "", "Student", true);
        boolean boolean6 = headLabCoordinator5.isApproved();
        java.lang.String str7 = headLabCoordinator5.getUserType();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "headlabcoordinator" + "'", str7, "headlabcoordinator");
    }

    @Test
    public void test2230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2230");
        com.reservation_system.model.Researcher researcher5 = new com.reservation_system.model.Researcher(52, "researcher", "andrew@example.com", "Faculty", true);
        java.lang.String str6 = researcher5.getUserType();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Researcher" + "'", str6, "Researcher");
    }

    @Test
    public void test2231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2231");
        com.reservation_system.model.Guest guest5 = new com.reservation_system.model.Guest((int) (short) 10, "Guest", "Faculty", "Researcher", false);
    }

    @Test
    public void test2232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2232");
        com.reservation_system.model.Researcher researcher5 = new com.reservation_system.model.Researcher((int) (byte) 100, "labmanager", "Faculty", "Researcher", false);
        java.lang.String str6 = researcher5.getPassword();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Researcher" + "'", str6, "Researcher");
    }

    @Test
    public void test2233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2233");
        com.reservation_system.model.Faculty faculty5 = new com.reservation_system.model.Faculty((int) (byte) -1, "andrew@example.com", "hi!", "Andrew", false);
        boolean boolean6 = faculty5.isApproved();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test2234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2234");
        com.reservation_system.model.HeadLabCoordinator headLabCoordinator5 = new com.reservation_system.model.HeadLabCoordinator((int) '#', "Password1!", "Researcher", "Student", true);
        int int6 = headLabCoordinator5.getID();
        java.lang.String str7 = headLabCoordinator5.getName();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 35 + "'", int6 == 35);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Password1!" + "'", str7, "Password1!");
    }

    @Test
    public void test2235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2235");
        com.reservation_system.model.Researcher researcher5 = new com.reservation_system.model.Researcher(35, "Researcher", "guest", "labmanager", false);
        java.lang.String str6 = researcher5.getUserType();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Researcher" + "'", str6, "Researcher");
    }

    @Test
    public void test2236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2236");
        com.reservation_system.model.Faculty faculty5 = new com.reservation_system.model.Faculty((int) (short) 0, "Guest", "labmanager", "Student", true);
        java.lang.String str6 = faculty5.getUserType();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Faculty" + "'", str6, "Faculty");
    }

    @Test
    public void test2237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2237");
        com.reservation_system.model.Researcher researcher5 = new com.reservation_system.model.Researcher(52, "", "student", "guest", false);
    }

    @Test
    public void test2238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2238");
        com.reservation_system.model.Guest guest5 = new com.reservation_system.model.Guest((-1), "hi!", "hi!", "student", true);
    }

    @Test
    public void test2239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2239");
        com.reservation_system.model.LabManager labManager5 = new com.reservation_system.model.LabManager((int) ' ', "Researcher", "Faculty", "Researcher", false);
    }

    @Test
    public void test2240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2240");
        com.reservation_system.model.HeadLabCoordinator headLabCoordinator5 = new com.reservation_system.model.HeadLabCoordinator((int) (byte) 0, "guest", "Password1!", "Faculty", true);
        int int6 = headLabCoordinator5.getID();
        headLabCoordinator5.setApproved(false);
        java.lang.String str9 = headLabCoordinator5.getName();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "guest" + "'", str9, "guest");
    }

    @Test
    public void test2241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2241");
        com.reservation_system.model.HeadLabCoordinator headLabCoordinator5 = new com.reservation_system.model.HeadLabCoordinator(1, "guest", "headlabcoordinator", "Guest", true);
    }

    @Test
    public void test2242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2242");
        com.reservation_system.model.Student student5 = new com.reservation_system.model.Student(10, "headlabcoordinator", "Student", "labmanager", true);
        java.lang.String str6 = student5.getUserType();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Student" + "'", str6, "Student");
    }

    @Test
    public void test2243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2243");
        com.reservation_system.model.Researcher researcher5 = new com.reservation_system.model.Researcher(32, "labmanager", "researcher", "andrew@example.com", false);
    }

    @Test
    public void test2244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2244");
        com.reservation_system.model.HeadLabCoordinator headLabCoordinator5 = new com.reservation_system.model.HeadLabCoordinator((int) '#', "guest", "Andrew", "Researcher", true);
        java.lang.String str6 = headLabCoordinator5.getUserType();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "headlabcoordinator" + "'", str6, "headlabcoordinator");
    }

    @Test
    public void test2245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2245");
        com.reservation_system.model.Guest guest5 = new com.reservation_system.model.Guest((int) '4', "andrew@example.com", "student", "faculty", true);
        boolean boolean6 = guest5.isApproved();
        boolean boolean7 = guest5.isApproved();
        java.lang.String str8 = guest5.getEmail();
        java.lang.String str9 = guest5.getUserType();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "student" + "'", str8, "student");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Guest" + "'", str9, "Guest");
    }

    @Test
    public void test2246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2246");
        com.reservation_system.model.Faculty faculty5 = new com.reservation_system.model.Faculty(97, "", "Password1!", "andrew@example.com", false);
    }

    @Test
    public void test2247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2247");
        com.reservation_system.model.Student student5 = new com.reservation_system.model.Student(0, "student", "guest", "hi!", false);
        java.lang.String str6 = student5.getUserType();
        java.lang.String str7 = student5.getUserType();
        boolean boolean8 = student5.isApproved();
        java.lang.String str9 = student5.getPassword();
        student5.setApproved(false);
        java.lang.String str12 = student5.getUserType();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Student" + "'", str6, "Student");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Student" + "'", str7, "Student");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Student" + "'", str12, "Student");
    }

    @Test
    public void test2248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2248");
        com.reservation_system.model.Guest guest5 = new com.reservation_system.model.Guest((int) '#', "labmanager", "Faculty", "headlabcoordinator", false);
        java.lang.String str6 = guest5.getName();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "labmanager" + "'", str6, "labmanager");
    }

    @Test
    public void test2249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2249");
        com.reservation_system.model.LabManager labManager5 = new com.reservation_system.model.LabManager((int) (short) 0, "hi!", "Student", "researcher", true);
    }

    @Test
    public void test2250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2250");
        com.reservation_system.model.Faculty faculty5 = new com.reservation_system.model.Faculty(0, "headlabcoordinator", "Faculty", "andrew@example.com", false);
        int int6 = faculty5.getID();
        java.lang.String str7 = faculty5.getUserType();
        boolean boolean8 = faculty5.isApproved();
        java.lang.String str9 = faculty5.getUserType();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Faculty" + "'", str7, "Faculty");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Faculty" + "'", str9, "Faculty");
    }

    @Test
    public void test2251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2251");
        com.reservation_system.model.Student student5 = new com.reservation_system.model.Student((int) (byte) 100, "faculty", "Password1!", "researcher", false);
    }

    @Test
    public void test2252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2252");
        com.reservation_system.model.Researcher researcher5 = new com.reservation_system.model.Researcher((int) (short) 10, "andrew@example.com", "Password1!", "researcher", true);
    }

    @Test
    public void test2253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2253");
        com.reservation_system.model.Guest guest5 = new com.reservation_system.model.Guest((int) 'a', "Andrew", "", "andrew@example.com", true);
    }

    @Test
    public void test2254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2254");
        com.reservation_system.model.Student student5 = new com.reservation_system.model.Student(1, "Faculty", "headlabcoordinator", "headlabcoordinator", false);
    }

    @Test
    public void test2255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2255");
        // The following exception was thrown during execution in test generation
        try {
            com.reservation_system.model.User user6 = com.reservation_system.patterns.factory.UserFactory.createUser("Andrew", 0, "faculty", "Faculty", "labmanager", true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid user type: Andrew");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2256");
        com.reservation_system.model.HeadLabCoordinator headLabCoordinator5 = new com.reservation_system.model.HeadLabCoordinator((int) (byte) 0, "Faculty", "Faculty", "Researcher", false);
        java.lang.String str6 = headLabCoordinator5.getPassword();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Researcher" + "'", str6, "Researcher");
    }

    @Test
    public void test2257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2257");
        com.reservation_system.model.Faculty faculty5 = new com.reservation_system.model.Faculty(0, "faculty", "student", "Student", true);
        int int6 = faculty5.getID();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test2258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2258");
        com.reservation_system.model.Faculty faculty5 = new com.reservation_system.model.Faculty(10, "Andrew", "Student", "student", true);
        boolean boolean6 = faculty5.isApproved();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test2259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2259");
        com.reservation_system.model.Faculty faculty5 = new com.reservation_system.model.Faculty((int) (byte) 100, "labmanager", "Student", "headlabcoordinator", false);
        java.lang.String str6 = faculty5.getUserType();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Faculty" + "'", str6, "Faculty");
    }

    @Test
    public void test2260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2260");
        com.reservation_system.model.Faculty faculty5 = new com.reservation_system.model.Faculty((int) (byte) 0, "guest", "guest", "headlabcoordinator", true);
        java.lang.String str6 = faculty5.getUserType();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Faculty" + "'", str6, "Faculty");
    }

    @Test
    public void test2261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2261");
        com.reservation_system.model.Faculty faculty5 = new com.reservation_system.model.Faculty(32, "andrew@example.com", "student", "Password1!", true);
        java.lang.String str6 = faculty5.getUserType();
        faculty5.setApproved(true);
        java.lang.String str9 = faculty5.getName();
        boolean boolean10 = faculty5.requiresDepartmentApproval();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Faculty" + "'", str6, "Faculty");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test2262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2262");
        com.reservation_system.model.HeadLabCoordinator headLabCoordinator5 = new com.reservation_system.model.HeadLabCoordinator((-1), "labmanager", "hi!", "Guest", true);
        java.lang.String str6 = headLabCoordinator5.getEmail();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
    }

    @Test
    public void test2263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2263");
        com.reservation_system.model.LabManager labManager5 = new com.reservation_system.model.LabManager((int) (short) 10, "headlabcoordinator", "Andrew", "guest", true);
        java.lang.String str6 = labManager5.getUserType();
        java.lang.String str7 = labManager5.getUserType();
        labManager5.setApproved(false);
        java.lang.String str10 = labManager5.getUserType();
        java.lang.String str11 = labManager5.getUserType();
        boolean boolean12 = labManager5.requiresDepartmentApproval();
        java.lang.String str13 = labManager5.getUserType();
        int int14 = labManager5.getID();
        java.lang.String str15 = labManager5.getUserType();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "labmanager" + "'", str6, "labmanager");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "labmanager" + "'", str7, "labmanager");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "labmanager" + "'", str10, "labmanager");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "labmanager" + "'", str11, "labmanager");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "labmanager" + "'", str13, "labmanager");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 10 + "'", int14 == 10);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "labmanager" + "'", str15, "labmanager");
    }

    @Test
    public void test2264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2264");
        com.reservation_system.model.User user6 = com.reservation_system.patterns.factory.UserFactory.createUser("headlabcoordinator", (int) (short) -1, "Student", "Andrew", "Faculty", true);
        int int7 = user6.getID();
        boolean boolean8 = user6.isApproved();
        java.lang.Class<?> wildcardClass9 = user6.getClass();
        org.junit.Assert.assertNotNull(user6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test2265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2265");
        com.reservation_system.model.Guest guest5 = new com.reservation_system.model.Guest((int) (byte) 10, "Password1!", "Researcher", "Researcher", true);
    }

    @Test
    public void test2266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2266");
        com.reservation_system.model.HeadLabCoordinator headLabCoordinator5 = new com.reservation_system.model.HeadLabCoordinator((-1), "", "researcher", "Password1!", false);
    }

    @Test
    public void test2267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2267");
        com.reservation_system.model.Researcher researcher5 = new com.reservation_system.model.Researcher((int) (byte) -1, "", "", "", false);
    }

    @Test
    public void test2268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2268");
        com.reservation_system.model.User user6 = com.reservation_system.patterns.factory.UserFactory.createUser("researcher", (int) ' ', "andrew@example.com", "headlabcoordinator", "Researcher", false);
        org.junit.Assert.assertNotNull(user6);
    }

    @Test
    public void test2269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2269");
        com.reservation_system.model.HeadLabCoordinator headLabCoordinator5 = new com.reservation_system.model.HeadLabCoordinator(0, "guest", "Password1!", "", false);
    }

    @Test
    public void test2270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2270");
        com.reservation_system.model.User user6 = com.reservation_system.patterns.factory.UserFactory.createUser("Guest", (int) (byte) -1, "Researcher", "Password1!", "hi!", false);
        boolean boolean7 = user6.isApproved();
        java.lang.Class<?> wildcardClass8 = user6.getClass();
        org.junit.Assert.assertNotNull(user6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test2271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2271");
        com.reservation_system.model.Faculty faculty5 = new com.reservation_system.model.Faculty((int) '4', "Password1!", "hi!", "labmanager", false);
        java.lang.String str6 = faculty5.getName();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Password1!" + "'", str6, "Password1!");
    }

    @Test
    public void test2272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2272");
        com.reservation_system.model.Student student5 = new com.reservation_system.model.Student(1, "guest", "hi!", "student", false);
        java.lang.String str6 = student5.getEmail();
        boolean boolean7 = student5.requiresDepartmentApproval();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test2273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2273");
        com.reservation_system.model.Student student5 = new com.reservation_system.model.Student(0, "headlabcoordinator", "faculty", "guest", false);
        java.lang.String str6 = student5.getEmail();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "faculty" + "'", str6, "faculty");
    }

    @Test
    public void test2274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2274");
        com.reservation_system.model.Student student5 = new com.reservation_system.model.Student(100, "faculty", "Password1!", "Student", true);
    }

    @Test
    public void test2275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2275");
        com.reservation_system.model.HeadLabCoordinator headLabCoordinator5 = new com.reservation_system.model.HeadLabCoordinator((int) (byte) -1, "andrew@example.com", "Faculty", "andrew@example.com", false);
    }

    @Test
    public void test2276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2276");
        com.reservation_system.model.HeadLabCoordinator headLabCoordinator5 = new com.reservation_system.model.HeadLabCoordinator((-1), "student", "headlabcoordinator", "Faculty", false);
        java.lang.String str6 = headLabCoordinator5.getUserType();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "headlabcoordinator" + "'", str6, "headlabcoordinator");
    }

    @Test
    public void test2277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2277");
        com.reservation_system.model.Faculty faculty5 = new com.reservation_system.model.Faculty((int) '#', "Guest", "student", "Guest", false);
        boolean boolean6 = faculty5.requiresDepartmentApproval();
        boolean boolean7 = faculty5.isApproved();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test2278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2278");
        com.reservation_system.model.LabManager labManager5 = new com.reservation_system.model.LabManager(52, "", "labmanager", "", true);
        java.lang.String str6 = labManager5.getUserType();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "labmanager" + "'", str6, "labmanager");
    }

    @Test
    public void test2279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2279");
        com.reservation_system.model.Guest guest5 = new com.reservation_system.model.Guest((int) '4', "hi!", "Faculty", "Researcher", false);
        java.lang.String str6 = guest5.getUserType();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Guest" + "'", str6, "Guest");
    }

    @Test
    public void test2280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2280");
        com.reservation_system.model.User user6 = com.reservation_system.patterns.factory.UserFactory.createUser("faculty", (int) '4', "faculty", "faculty", "guest", false);
        java.lang.String str7 = user6.getName();
        org.junit.Assert.assertNotNull(user6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "faculty" + "'", str7, "faculty");
    }

    @Test
    public void test2281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2281");
        com.reservation_system.model.LabManager labManager5 = new com.reservation_system.model.LabManager((int) (byte) 1, "Andrew", "hi!", "faculty", true);
        java.lang.String str6 = labManager5.getPassword();
        boolean boolean7 = labManager5.isApproved();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "faculty" + "'", str6, "faculty");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test2282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2282");
        com.reservation_system.model.Researcher researcher5 = new com.reservation_system.model.Researcher(97, "faculty", "Andrew", "Faculty", false);
    }

    @Test
    public void test2283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2283");
        com.reservation_system.model.Faculty faculty5 = new com.reservation_system.model.Faculty((int) '4', "researcher", "researcher", "Researcher", true);
        java.lang.String str6 = faculty5.getUserType();
        java.lang.String str7 = faculty5.getName();
        java.lang.String str8 = faculty5.getEmail();
        faculty5.setApproved(true);
        faculty5.setApproved(true);
        int int13 = faculty5.getID();
        int int14 = faculty5.getID();
        java.lang.String str15 = faculty5.getUserType();
        java.lang.String str16 = faculty5.getUserType();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Faculty" + "'", str6, "Faculty");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "researcher" + "'", str7, "researcher");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "researcher" + "'", str8, "researcher");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 52 + "'", int13 == 52);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 52 + "'", int14 == 52);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Faculty" + "'", str15, "Faculty");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Faculty" + "'", str16, "Faculty");
    }

    @Test
    public void test2284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2284");
        com.reservation_system.model.User user6 = com.reservation_system.patterns.factory.UserFactory.createUser("Student", (int) '4', "Guest", "Andrew", "hi!", false);
        org.junit.Assert.assertNotNull(user6);
    }

    @Test
    public void test2285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2285");
        com.reservation_system.model.LabManager labManager5 = new com.reservation_system.model.LabManager(1, "faculty", "andrew@example.com", "Guest", false);
        java.lang.String str6 = labManager5.getUserType();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "labmanager" + "'", str6, "labmanager");
    }

    @Test
    public void test2286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2286");
        com.reservation_system.model.Student student5 = new com.reservation_system.model.Student((int) (short) 1, "student", "Student", "headlabcoordinator", false);
        java.lang.String str6 = student5.getName();
        java.lang.String str7 = student5.getUserType();
        java.lang.String str8 = student5.getEmail();
        java.lang.String str9 = student5.getUserType();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "student" + "'", str6, "student");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Student" + "'", str7, "Student");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Student" + "'", str8, "Student");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Student" + "'", str9, "Student");
    }

    @Test
    public void test2287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2287");
        com.reservation_system.model.Student student5 = new com.reservation_system.model.Student(1, "guest", "hi!", "student", false);
        java.lang.String str6 = student5.getUserType();
        java.lang.String str7 = student5.getUserType();
        java.lang.String str8 = student5.getName();
        java.lang.String str9 = student5.getUserType();
        int int10 = student5.getID();
        int int11 = student5.getID();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Student" + "'", str6, "Student");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Student" + "'", str7, "Student");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "guest" + "'", str8, "guest");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Student" + "'", str9, "Student");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
    }

    @Test
    public void test2288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2288");
        com.reservation_system.model.Student student5 = new com.reservation_system.model.Student(10, "", "hi!", "Researcher", true);
        java.lang.String str6 = student5.getUserType();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Student" + "'", str6, "Student");
    }

    @Test
    public void test2289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2289");
        com.reservation_system.model.Researcher researcher5 = new com.reservation_system.model.Researcher(0, "student", "", "student", false);
        java.lang.String str6 = researcher5.getPassword();
        int int7 = researcher5.getID();
        int int8 = researcher5.getID();
        boolean boolean9 = researcher5.isApproved();
        java.lang.String str10 = researcher5.getUserType();
        int int11 = researcher5.getID();
        int int12 = researcher5.getID();
        researcher5.setApproved(false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "student" + "'", str6, "student");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Researcher" + "'", str10, "Researcher");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test2290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2290");
        com.reservation_system.model.User user6 = com.reservation_system.patterns.factory.UserFactory.createUser("Student", (int) (byte) 1, "Faculty", "Andrew", "Student", false);
        java.lang.String str7 = user6.getEmail();
        org.junit.Assert.assertNotNull(user6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Andrew" + "'", str7, "Andrew");
    }

    @Test
    public void test2291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2291");
        com.reservation_system.model.Researcher researcher5 = new com.reservation_system.model.Researcher((int) (short) 100, "headlabcoordinator", "Student", "guest", true);
        java.lang.String str6 = researcher5.getUserType();
        java.lang.String str7 = researcher5.getUserType();
        java.lang.String str8 = researcher5.getUserType();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Researcher" + "'", str6, "Researcher");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Researcher" + "'", str7, "Researcher");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Researcher" + "'", str8, "Researcher");
    }

    @Test
    public void test2292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2292");
        com.reservation_system.model.HeadLabCoordinator headLabCoordinator5 = new com.reservation_system.model.HeadLabCoordinator(0, "Faculty", "headlabcoordinator", "Password1!", false);
        java.lang.String str6 = headLabCoordinator5.getPassword();
        java.lang.String str7 = headLabCoordinator5.getUserType();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Password1!" + "'", str6, "Password1!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "headlabcoordinator" + "'", str7, "headlabcoordinator");
    }

    @Test
    public void test2293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2293");
        com.reservation_system.model.Faculty faculty5 = new com.reservation_system.model.Faculty((int) '4', "researcher", "researcher", "Researcher", true);
        java.lang.String str6 = faculty5.getUserType();
        java.lang.String str7 = faculty5.getUserType();
        java.lang.String str8 = faculty5.getUserType();
        java.lang.String str9 = faculty5.getUserType();
        java.lang.String str10 = faculty5.getUserType();
        faculty5.setApproved(false);
        java.lang.String str13 = faculty5.getPassword();
        boolean boolean14 = faculty5.isApproved();
        faculty5.setApproved(false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Faculty" + "'", str6, "Faculty");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Faculty" + "'", str7, "Faculty");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Faculty" + "'", str8, "Faculty");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Faculty" + "'", str9, "Faculty");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Faculty" + "'", str10, "Faculty");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Researcher" + "'", str13, "Researcher");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test2294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2294");
        com.reservation_system.model.Student student5 = new com.reservation_system.model.Student(1, "guest", "hi!", "student", false);
        java.lang.String str6 = student5.getUserType();
        java.lang.String str7 = student5.getUserType();
        java.lang.String str8 = student5.getName();
        java.lang.String str9 = student5.getUserType();
        boolean boolean10 = student5.isApproved();
        java.lang.String str11 = student5.getName();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Student" + "'", str6, "Student");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Student" + "'", str7, "Student");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "guest" + "'", str8, "guest");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Student" + "'", str9, "Student");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "guest" + "'", str11, "guest");
    }

    @Test
    public void test2295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2295");
        com.reservation_system.model.Student student5 = new com.reservation_system.model.Student(0, "Password1!", "", "", false);
        java.lang.String str6 = student5.getUserType();
        java.lang.String str7 = student5.getEmail();
        java.lang.String str8 = student5.getUserType();
        java.lang.String str9 = student5.getUserType();
        java.lang.String str10 = student5.getUserType();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Student" + "'", str6, "Student");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Student" + "'", str8, "Student");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Student" + "'", str9, "Student");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Student" + "'", str10, "Student");
    }

    @Test
    public void test2296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2296");
        com.reservation_system.model.Student student5 = new com.reservation_system.model.Student((int) (byte) 1, "headlabcoordinator", "labmanager", "faculty", true);
        boolean boolean6 = student5.isApproved();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test2297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2297");
        com.reservation_system.model.HeadLabCoordinator headLabCoordinator5 = new com.reservation_system.model.HeadLabCoordinator((int) (byte) 10, "hi!", "Researcher", "hi!", false);
        java.lang.Class<?> wildcardClass6 = headLabCoordinator5.getClass();
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test2298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2298");
        com.reservation_system.model.HeadLabCoordinator headLabCoordinator5 = new com.reservation_system.model.HeadLabCoordinator((int) (byte) 0, "researcher", "faculty", "", false);
        java.lang.String str6 = headLabCoordinator5.getUserType();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "headlabcoordinator" + "'", str6, "headlabcoordinator");
    }

    @Test
    public void test2299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2299");
        com.reservation_system.model.LabManager labManager5 = new com.reservation_system.model.LabManager(100, "", "Faculty", "andrew@example.com", false);
    }

    @Test
    public void test2300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2300");
        com.reservation_system.model.Faculty faculty5 = new com.reservation_system.model.Faculty((-1), "", "student", "headlabcoordinator", true);
        java.lang.String str6 = faculty5.getUserType();
        boolean boolean7 = faculty5.isApproved();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Faculty" + "'", str6, "Faculty");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test2301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2301");
        com.reservation_system.model.User user6 = com.reservation_system.patterns.factory.UserFactory.createUser("faculty", (int) 'a', "Password1!", "", "", true);
        user6.setApproved(false);
        boolean boolean9 = user6.isApproved();
        org.junit.Assert.assertNotNull(user6);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test2302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2302");
        com.reservation_system.model.LabManager labManager5 = new com.reservation_system.model.LabManager((int) '#', "student", "Password1!", "Guest", true);
        java.lang.String str6 = labManager5.getUserType();
        java.lang.String str7 = labManager5.getUserType();
        java.lang.String str8 = labManager5.getUserType();
        java.lang.String str9 = labManager5.getPassword();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "labmanager" + "'", str6, "labmanager");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "labmanager" + "'", str7, "labmanager");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "labmanager" + "'", str8, "labmanager");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Guest" + "'", str9, "Guest");
    }

    @Test
    public void test2303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2303");
        com.reservation_system.model.Guest guest5 = new com.reservation_system.model.Guest((int) (short) 0, "Password1!", "headlabcoordinator", "Student", false);
        boolean boolean6 = guest5.requiresDepartmentApproval();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test2304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2304");
        com.reservation_system.model.LabManager labManager5 = new com.reservation_system.model.LabManager((int) (byte) -1, "Andrew", "headlabcoordinator", "", true);
    }

    @Test
    public void test2305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2305");
        com.reservation_system.model.Student student5 = new com.reservation_system.model.Student((int) (byte) -1, "hi!", "andrew@example.com", "faculty", true);
    }

    @Test
    public void test2306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2306");
        com.reservation_system.model.Student student5 = new com.reservation_system.model.Student((int) ' ', "Guest", "Password1!", "andrew@example.com", false);
    }

    @Test
    public void test2307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2307");
        com.reservation_system.model.Student student5 = new com.reservation_system.model.Student((int) (short) 100, "andrew@example.com", "Researcher", "Andrew", true);
    }

    @Test
    public void test2308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2308");
        com.reservation_system.model.Guest guest5 = new com.reservation_system.model.Guest(0, "faculty", "Andrew", "hi!", false);
        java.lang.String str6 = guest5.getUserType();
        int int7 = guest5.getID();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Guest" + "'", str6, "Guest");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test2309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2309");
        com.reservation_system.model.Faculty faculty5 = new com.reservation_system.model.Faculty((int) ' ', "Researcher", "Password1!", "Student", true);
        java.lang.String str6 = faculty5.getUserType();
        java.lang.String str7 = faculty5.getName();
        java.lang.String str8 = faculty5.getUserType();
        java.lang.String str9 = faculty5.getUserType();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Faculty" + "'", str6, "Faculty");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Researcher" + "'", str7, "Researcher");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Faculty" + "'", str8, "Faculty");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Faculty" + "'", str9, "Faculty");
    }

    @Test
    public void test2310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2310");
        com.reservation_system.model.Faculty faculty5 = new com.reservation_system.model.Faculty((int) (byte) -1, "faculty", "Password1!", "", false);
    }

    @Test
    public void test2311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2311");
        com.reservation_system.model.LabManager labManager5 = new com.reservation_system.model.LabManager(32, "andrew@example.com", "Password1!", "", true);
        java.lang.String str6 = labManager5.getName();
        boolean boolean7 = labManager5.requiresDepartmentApproval();
        java.lang.String str8 = labManager5.getEmail();
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Password1!" + "'", str8, "Password1!");
    }

    @Test
    public void test2312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2312");
        com.reservation_system.model.Faculty faculty5 = new com.reservation_system.model.Faculty((int) (byte) 100, "hi!", "andrew@example.com", "hi!", false);
    }

    @Test
    public void test2313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2313");
        com.reservation_system.model.Guest guest5 = new com.reservation_system.model.Guest((int) (byte) 10, "", "", "guest", false);
    }

    @Test
    public void test2314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2314");
        com.reservation_system.model.Student student5 = new com.reservation_system.model.Student((-1), "student", "Guest", "faculty", true);
        java.lang.String str6 = student5.getEmail();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Guest" + "'", str6, "Guest");
    }

    @Test
    public void test2315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2315");
        com.reservation_system.model.LabManager labManager5 = new com.reservation_system.model.LabManager(0, "faculty", "faculty", "Andrew", true);
        java.lang.String str6 = labManager5.getPassword();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Andrew" + "'", str6, "Andrew");
    }

    @Test
    public void test2316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2316");
        com.reservation_system.model.HeadLabCoordinator headLabCoordinator5 = new com.reservation_system.model.HeadLabCoordinator(1, "faculty", "Researcher", "faculty", false);
    }

    @Test
    public void test2317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2317");
        com.reservation_system.model.Researcher researcher5 = new com.reservation_system.model.Researcher(0, "guest", "", "Andrew", true);
        java.lang.String str6 = researcher5.getPassword();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Andrew" + "'", str6, "Andrew");
    }

    @Test
    public void test2318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2318");
        com.reservation_system.model.Researcher researcher5 = new com.reservation_system.model.Researcher((int) (byte) 10, "faculty", "andrew@example.com", "researcher", false);
    }

    @Test
    public void test2319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2319");
        com.reservation_system.model.Researcher researcher5 = new com.reservation_system.model.Researcher((int) 'a', "", "researcher", "Student", false);
        java.lang.String str6 = researcher5.getUserType();
        java.lang.String str7 = researcher5.getUserType();
        java.lang.String str8 = researcher5.getUserType();
        researcher5.setApproved(false);
        java.lang.String str11 = researcher5.getUserType();
        java.lang.String str12 = researcher5.getName();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Researcher" + "'", str6, "Researcher");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Researcher" + "'", str7, "Researcher");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Researcher" + "'", str8, "Researcher");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Researcher" + "'", str11, "Researcher");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test2320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2320");
        com.reservation_system.model.Faculty faculty5 = new com.reservation_system.model.Faculty((int) '#', "Guest", "student", "Guest", false);
        java.lang.String str6 = faculty5.getUserType();
        faculty5.setApproved(true);
        java.lang.String str9 = faculty5.getUserType();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Faculty" + "'", str6, "Faculty");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Faculty" + "'", str9, "Faculty");
    }

    @Test
    public void test2321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2321");
        com.reservation_system.model.Researcher researcher5 = new com.reservation_system.model.Researcher((int) (short) 0, "Guest", "Password1!", "", true);
    }

    @Test
    public void test2322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2322");
        com.reservation_system.model.HeadLabCoordinator headLabCoordinator5 = new com.reservation_system.model.HeadLabCoordinator(52, "faculty", "Andrew", "", true);
        headLabCoordinator5.setApproved(true);
    }

    @Test
    public void test2323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2323");
        com.reservation_system.model.Student student5 = new com.reservation_system.model.Student((int) (byte) 0, "", "guest", "labmanager", true);
        java.lang.String str6 = student5.getUserType();
        int int7 = student5.getID();
        java.lang.String str8 = student5.getUserType();
        java.lang.String str9 = student5.getEmail();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Student" + "'", str6, "Student");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Student" + "'", str8, "Student");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "guest" + "'", str9, "guest");
    }

    @Test
    public void test2324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2324");
        com.reservation_system.model.User user6 = com.reservation_system.patterns.factory.UserFactory.createUser("researcher", (int) (byte) 1, "Faculty", "labmanager", "Researcher", true);
        org.junit.Assert.assertNotNull(user6);
    }

    @Test
    public void test2325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2325");
        com.reservation_system.model.HeadLabCoordinator headLabCoordinator5 = new com.reservation_system.model.HeadLabCoordinator((int) 'a', "", "headlabcoordinator", "researcher", true);
    }

    @Test
    public void test2326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2326");
        com.reservation_system.model.Student student5 = new com.reservation_system.model.Student((int) (byte) 0, "", "guest", "labmanager", true);
        java.lang.String str6 = student5.getUserType();
        int int7 = student5.getID();
        int int8 = student5.getID();
        java.lang.String str9 = student5.getUserType();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Student" + "'", str6, "Student");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Student" + "'", str9, "Student");
    }

    @Test
    public void test2327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2327");
        com.reservation_system.model.Researcher researcher5 = new com.reservation_system.model.Researcher((int) (short) 100, "labmanager", "headlabcoordinator", "student", true);
    }

    @Test
    public void test2328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2328");
        com.reservation_system.model.Faculty faculty5 = new com.reservation_system.model.Faculty((int) (short) 100, "Researcher", "researcher", "Guest", true);
        boolean boolean6 = faculty5.requiresDepartmentApproval();
        java.lang.String str7 = faculty5.getUserType();
        java.lang.String str8 = faculty5.getUserType();
        java.lang.String str9 = faculty5.getUserType();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Faculty" + "'", str7, "Faculty");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Faculty" + "'", str8, "Faculty");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Faculty" + "'", str9, "Faculty");
    }

    @Test
    public void test2329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2329");
        com.reservation_system.model.Researcher researcher5 = new com.reservation_system.model.Researcher((int) (byte) 10, "Faculty", "Faculty", "Researcher", true);
        int int6 = researcher5.getID();
        java.lang.String str7 = researcher5.getPassword();
        java.lang.String str8 = researcher5.getName();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Researcher" + "'", str7, "Researcher");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Faculty" + "'", str8, "Faculty");
    }

    @Test
    public void test2330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2330");
        com.reservation_system.model.Guest guest5 = new com.reservation_system.model.Guest(1, "Password1!", "researcher", "faculty", true);
    }

    @Test
    public void test2331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2331");
        com.reservation_system.model.HeadLabCoordinator headLabCoordinator5 = new com.reservation_system.model.HeadLabCoordinator((int) '#', "Password1!", "", "Faculty", false);
        int int6 = headLabCoordinator5.getID();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 35 + "'", int6 == 35);
    }

    @Test
    public void test2332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2332");
        com.reservation_system.model.Guest guest5 = new com.reservation_system.model.Guest((int) '4', "guest", "Researcher", "faculty", false);
    }

    @Test
    public void test2333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2333");
        com.reservation_system.model.HeadLabCoordinator headLabCoordinator5 = new com.reservation_system.model.HeadLabCoordinator(10, "guest", "researcher", "hi!", false);
    }

    @Test
    public void test2334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2334");
        com.reservation_system.model.Researcher researcher5 = new com.reservation_system.model.Researcher(52, "", "andrew@example.com", "labmanager", true);
        boolean boolean6 = researcher5.requiresDepartmentApproval();
        java.lang.String str7 = researcher5.getUserType();
        java.lang.String str8 = researcher5.getUserType();
        java.lang.String str9 = researcher5.getEmail();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Researcher" + "'", str7, "Researcher");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Researcher" + "'", str8, "Researcher");
    }

    @Test
    public void test2335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2335");
        com.reservation_system.model.Faculty faculty5 = new com.reservation_system.model.Faculty((int) ' ', "Researcher", "Password1!", "Student", true);
        java.lang.String str6 = faculty5.getPassword();
        java.lang.String str7 = faculty5.getUserType();
        java.lang.String str8 = faculty5.getUserType();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Student" + "'", str6, "Student");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Faculty" + "'", str7, "Faculty");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Faculty" + "'", str8, "Faculty");
    }

    @Test
    public void test2336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2336");
        com.reservation_system.model.HeadLabCoordinator headLabCoordinator5 = new com.reservation_system.model.HeadLabCoordinator((int) '#', "Faculty", "student", "Andrew", false);
        java.lang.String str6 = headLabCoordinator5.getUserType();
        boolean boolean7 = headLabCoordinator5.requiresDepartmentApproval();
        java.lang.String str8 = headLabCoordinator5.getPassword();
        java.lang.String str9 = headLabCoordinator5.getUserType();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "headlabcoordinator" + "'", str6, "headlabcoordinator");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Andrew" + "'", str8, "Andrew");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "headlabcoordinator" + "'", str9, "headlabcoordinator");
    }

    @Test
    public void test2337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2337");
        com.reservation_system.model.User user6 = com.reservation_system.patterns.factory.UserFactory.createUser("faculty", (int) (short) 1, "researcher", "Faculty", "hi!", true);
        org.junit.Assert.assertNotNull(user6);
    }

    @Test
    public void test2338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2338");
        com.reservation_system.model.Guest guest5 = new com.reservation_system.model.Guest((int) (short) 10, "labmanager", "", "Password1!", false);
    }

    @Test
    public void test2339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2339");
        com.reservation_system.model.Student student5 = new com.reservation_system.model.Student(52, "faculty", "Password1!", "hi!", false);
        boolean boolean6 = student5.requiresDepartmentApproval();
        boolean boolean7 = student5.isApproved();
        java.lang.String str8 = student5.getUserType();
        java.lang.String str9 = student5.getUserType();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Student" + "'", str8, "Student");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Student" + "'", str9, "Student");
    }

    @Test
    public void test2340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2340");
        com.reservation_system.model.Guest guest5 = new com.reservation_system.model.Guest(97, "researcher", "Password1!", "labmanager", false);
    }

    @Test
    public void test2341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2341");
        com.reservation_system.model.User user6 = com.reservation_system.patterns.factory.UserFactory.createUser("Researcher", (int) (short) 0, "guest", "researcher", "faculty", false);
        java.lang.String str7 = user6.getPassword();
        boolean boolean8 = user6.isApproved();
        boolean boolean9 = user6.requiresDepartmentApproval();
        user6.setApproved(true);
        org.junit.Assert.assertNotNull(user6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "faculty" + "'", str7, "faculty");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test2342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2342");
        com.reservation_system.model.Guest guest5 = new com.reservation_system.model.Guest((int) 'a', "", "Faculty", "Faculty", false);
    }

    @Test
    public void test2343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2343");
        com.reservation_system.model.Student student5 = new com.reservation_system.model.Student((int) 'a', "student", "hi!", "Student", true);
        java.lang.String str6 = student5.getEmail();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
    }

    @Test
    public void test2344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2344");
        com.reservation_system.model.Researcher researcher5 = new com.reservation_system.model.Researcher((int) (short) 1, "hi!", "Guest", "Password1!", false);
    }

    @Test
    public void test2345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2345");
        com.reservation_system.model.Researcher researcher5 = new com.reservation_system.model.Researcher((int) '4', "guest", "Password1!", "Andrew", false);
    }

    @Test
    public void test2346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2346");
        com.reservation_system.model.Faculty faculty5 = new com.reservation_system.model.Faculty((-1), "Faculty", "Faculty", "Student", false);
    }

    @Test
    public void test2347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2347");
        com.reservation_system.model.LabManager labManager5 = new com.reservation_system.model.LabManager((int) (short) 10, "headlabcoordinator", "Andrew", "guest", true);
        java.lang.String str6 = labManager5.getUserType();
        java.lang.String str7 = labManager5.getUserType();
        labManager5.setApproved(false);
        java.lang.String str10 = labManager5.getUserType();
        java.lang.String str11 = labManager5.getUserType();
        boolean boolean12 = labManager5.requiresDepartmentApproval();
        java.lang.String str13 = labManager5.getUserType();
        java.lang.String str14 = labManager5.getUserType();
        java.lang.Class<?> wildcardClass15 = labManager5.getClass();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "labmanager" + "'", str6, "labmanager");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "labmanager" + "'", str7, "labmanager");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "labmanager" + "'", str10, "labmanager");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "labmanager" + "'", str11, "labmanager");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "labmanager" + "'", str13, "labmanager");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "labmanager" + "'", str14, "labmanager");
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test2348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2348");
        com.reservation_system.model.Faculty faculty5 = new com.reservation_system.model.Faculty(1, "Password1!", "Andrew", "hi!", true);
    }

    @Test
    public void test2349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2349");
        com.reservation_system.model.Student student5 = new com.reservation_system.model.Student(52, "faculty", "Password1!", "hi!", false);
        boolean boolean6 = student5.requiresDepartmentApproval();
        boolean boolean7 = student5.isApproved();
        java.lang.Class<?> wildcardClass8 = student5.getClass();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test2350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2350");
        com.reservation_system.model.User user6 = com.reservation_system.patterns.factory.UserFactory.createUser("labmanager", (int) '4', "researcher", "researcher", "Student", false);
        java.lang.String str7 = user6.getPassword();
        org.junit.Assert.assertNotNull(user6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Student" + "'", str7, "Student");
    }

    @Test
    public void test2351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2351");
        com.reservation_system.model.LabManager labManager5 = new com.reservation_system.model.LabManager((int) (byte) 0, "hi!", "researcher", "Andrew", true);
        java.lang.String str6 = labManager5.getUserType();
        java.lang.String str7 = labManager5.getUserType();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "labmanager" + "'", str6, "labmanager");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "labmanager" + "'", str7, "labmanager");
    }

    @Test
    public void test2352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2352");
        com.reservation_system.model.LabManager labManager5 = new com.reservation_system.model.LabManager(10, "Faculty", "guest", "Andrew", false);
        java.lang.String str6 = labManager5.getPassword();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Andrew" + "'", str6, "Andrew");
    }

    @Test
    public void test2353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2353");
        com.reservation_system.model.User user6 = com.reservation_system.patterns.factory.UserFactory.createUser("headlabcoordinator", (int) '4', "student", "student", "labmanager", true);
        java.lang.Class<?> wildcardClass7 = user6.getClass();
        org.junit.Assert.assertNotNull(user6);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test2354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2354");
        com.reservation_system.model.Researcher researcher5 = new com.reservation_system.model.Researcher(0, "student", "", "student", false);
        java.lang.String str6 = researcher5.getEmail();
        java.lang.String str7 = researcher5.getPassword();
        java.lang.String str8 = researcher5.getName();
        int int9 = researcher5.getID();
        java.lang.String str10 = researcher5.getName();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "student" + "'", str7, "student");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "student" + "'", str8, "student");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "student" + "'", str10, "student");
    }

    @Test
    public void test2355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2355");
        com.reservation_system.model.Guest guest5 = new com.reservation_system.model.Guest((int) (short) 0, "Researcher", "headlabcoordinator", "Guest", true);
        int int6 = guest5.getID();
        java.lang.String str7 = guest5.getUserType();
        java.lang.String str8 = guest5.getUserType();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Guest" + "'", str7, "Guest");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Guest" + "'", str8, "Guest");
    }

    @Test
    public void test2356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2356");
        com.reservation_system.model.Guest guest5 = new com.reservation_system.model.Guest(0, "Student", "headlabcoordinator", "researcher", false);
        java.lang.String str6 = guest5.getEmail();
        java.lang.String str7 = guest5.getUserType();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "headlabcoordinator" + "'", str6, "headlabcoordinator");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Guest" + "'", str7, "Guest");
    }

    @Test
    public void test2357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2357");
        com.reservation_system.model.HeadLabCoordinator headLabCoordinator5 = new com.reservation_system.model.HeadLabCoordinator(52, "andrew@example.com", "Faculty", "Andrew", false);
        java.lang.String str6 = headLabCoordinator5.getName();
    }

    @Test
    public void test2358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2358");
        com.reservation_system.model.Faculty faculty5 = new com.reservation_system.model.Faculty((int) '#', "labmanager", "hi!", "Researcher", true);
        java.lang.String str6 = faculty5.getName();
        boolean boolean7 = faculty5.requiresDepartmentApproval();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "labmanager" + "'", str6, "labmanager");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test2359() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2359");
        com.reservation_system.model.Faculty faculty5 = new com.reservation_system.model.Faculty((int) (short) 1, "faculty", "", "labmanager", false);
    }

    @Test
    public void test2360() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2360");
        com.reservation_system.model.LabManager labManager5 = new com.reservation_system.model.LabManager(0, "faculty", "faculty", "student", true);
        java.lang.String str6 = labManager5.getUserType();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "labmanager" + "'", str6, "labmanager");
    }

    @Test
    public void test2361() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2361");
        com.reservation_system.model.Faculty faculty5 = new com.reservation_system.model.Faculty((int) '4', "researcher", "researcher", "Researcher", true);
        java.lang.String str6 = faculty5.getUserType();
        java.lang.String str7 = faculty5.getUserType();
        java.lang.String str8 = faculty5.getUserType();
        java.lang.String str9 = faculty5.getUserType();
        java.lang.String str10 = faculty5.getUserType();
        boolean boolean11 = faculty5.requiresDepartmentApproval();
        faculty5.setApproved(true);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Faculty" + "'", str6, "Faculty");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Faculty" + "'", str7, "Faculty");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Faculty" + "'", str8, "Faculty");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Faculty" + "'", str9, "Faculty");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Faculty" + "'", str10, "Faculty");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test2362() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2362");
        com.reservation_system.model.Faculty faculty5 = new com.reservation_system.model.Faculty((int) '4', "researcher", "researcher", "Researcher", true);
        java.lang.String str6 = faculty5.getUserType();
        java.lang.String str7 = faculty5.getName();
        java.lang.String str8 = faculty5.getEmail();
        faculty5.setApproved(true);
        faculty5.setApproved(true);
        int int13 = faculty5.getID();
        faculty5.setApproved(false);
        java.lang.String str16 = faculty5.getUserType();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Faculty" + "'", str6, "Faculty");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "researcher" + "'", str7, "researcher");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "researcher" + "'", str8, "researcher");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 52 + "'", int13 == 52);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Faculty" + "'", str16, "Faculty");
    }

    @Test
    public void test2363() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2363");
        com.reservation_system.model.Student student5 = new com.reservation_system.model.Student(0, "hi!", "headlabcoordinator", "Student", true);
        java.lang.String str6 = student5.getUserType();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Student" + "'", str6, "Student");
    }

    @Test
    public void test2364() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2364");
        com.reservation_system.model.Guest guest5 = new com.reservation_system.model.Guest((int) (byte) 0, "student", "student", "Andrew", true);
    }

    @Test
    public void test2365() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2365");
        com.reservation_system.model.HeadLabCoordinator headLabCoordinator5 = new com.reservation_system.model.HeadLabCoordinator((int) '#', "Faculty", "student", "Andrew", false);
        java.lang.String str6 = headLabCoordinator5.getUserType();
        boolean boolean7 = headLabCoordinator5.isApproved();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "headlabcoordinator" + "'", str6, "headlabcoordinator");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test2366() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2366");
        com.reservation_system.model.HeadLabCoordinator headLabCoordinator5 = new com.reservation_system.model.HeadLabCoordinator((int) (byte) 0, "student", "", "headlabcoordinator", false);
    }

    @Test
    public void test2367() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2367");
        com.reservation_system.model.LabManager labManager5 = new com.reservation_system.model.LabManager((int) (short) 10, "headlabcoordinator", "student", "guest", true);
    }

    @Test
    public void test2368() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2368");
        com.reservation_system.model.LabManager labManager5 = new com.reservation_system.model.LabManager((int) (short) 100, "Andrew", "hi!", "", false);
    }

    @Test
    public void test2369() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2369");
        com.reservation_system.model.LabManager labManager5 = new com.reservation_system.model.LabManager(1, "student", "Andrew", "hi!", false);
        java.lang.String str6 = labManager5.getPassword();
        java.lang.String str7 = labManager5.getUserType();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "labmanager" + "'", str7, "labmanager");
    }

    @Test
    public void test2370() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2370");
        com.reservation_system.model.Faculty faculty5 = new com.reservation_system.model.Faculty((int) (short) 10, "Faculty", "hi!", "researcher", false);
        boolean boolean6 = faculty5.isApproved();
        java.lang.String str7 = faculty5.getUserType();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Faculty" + "'", str7, "Faculty");
    }

    @Test
    public void test2371() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2371");
        com.reservation_system.model.Faculty faculty5 = new com.reservation_system.model.Faculty(10, "hi!", "", "guest", false);
        java.lang.String str6 = faculty5.getUserType();
        java.lang.String str7 = faculty5.getUserType();
        java.lang.String str8 = faculty5.getEmail();
        faculty5.setApproved(false);
        java.lang.String str11 = faculty5.getUserType();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Faculty" + "'", str6, "Faculty");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Faculty" + "'", str7, "Faculty");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Faculty" + "'", str11, "Faculty");
    }

    @Test
    public void test2372() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2372");
        com.reservation_system.model.Researcher researcher5 = new com.reservation_system.model.Researcher(32, "hi!", "", "guest", false);
        java.lang.String str6 = researcher5.getPassword();
        boolean boolean7 = researcher5.requiresDepartmentApproval();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "guest" + "'", str6, "guest");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test2373() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2373");
        com.reservation_system.model.Guest guest5 = new com.reservation_system.model.Guest((int) (byte) 100, "hi!", "hi!", "guest", false);
    }

    @Test
    public void test2374() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2374");
        com.reservation_system.model.Guest guest5 = new com.reservation_system.model.Guest(35, "Faculty", "headlabcoordinator", "", true);
        java.lang.String str6 = guest5.getUserType();
        java.lang.String str7 = guest5.getEmail();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Guest" + "'", str6, "Guest");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "headlabcoordinator" + "'", str7, "headlabcoordinator");
    }

    @Test
    public void test2375() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2375");
        com.reservation_system.model.Student student5 = new com.reservation_system.model.Student((int) (byte) 0, "andrew@example.com", "", "student", true);
        java.lang.String str6 = student5.getPassword();
        java.lang.String str7 = student5.getPassword();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "student" + "'", str6, "student");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "student" + "'", str7, "student");
    }

    @Test
    public void test2376() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2376");
        com.reservation_system.model.Faculty faculty5 = new com.reservation_system.model.Faculty(10, "guest", "headlabcoordinator", "Andrew", false);
        boolean boolean6 = faculty5.requiresDepartmentApproval();
        java.lang.String str7 = faculty5.getUserType();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Faculty" + "'", str7, "Faculty");
    }

    @Test
    public void test2377() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2377");
        com.reservation_system.model.Researcher researcher5 = new com.reservation_system.model.Researcher(97, "labmanager", "guest", "", true);
        java.lang.String str6 = researcher5.getUserType();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Researcher" + "'", str6, "Researcher");
    }

    @Test
    public void test2378() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2378");
        com.reservation_system.model.Student student5 = new com.reservation_system.model.Student((int) 'a', "headlabcoordinator", "Guest", "", false);
        boolean boolean6 = student5.isApproved();
        boolean boolean7 = student5.isApproved();
        java.lang.String str8 = student5.getPassword();
        int int9 = student5.getID();
        java.lang.String str10 = student5.getUserType();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 97 + "'", int9 == 97);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Student" + "'", str10, "Student");
    }

    @Test
    public void test2379() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2379");
        com.reservation_system.model.Faculty faculty5 = new com.reservation_system.model.Faculty(32, "student", "andrew@example.com", "faculty", true);
    }

    @Test
    public void test2380() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2380");
        com.reservation_system.model.Faculty faculty5 = new com.reservation_system.model.Faculty(0, "hi!", "researcher", "researcher", false);
        java.lang.String str6 = faculty5.getUserType();
        java.lang.String str7 = faculty5.getUserType();
        int int8 = faculty5.getID();
        java.lang.String str9 = faculty5.getUserType();
        faculty5.setApproved(false);
        java.lang.Class<?> wildcardClass12 = faculty5.getClass();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Faculty" + "'", str6, "Faculty");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Faculty" + "'", str7, "Faculty");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Faculty" + "'", str9, "Faculty");
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test2381() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2381");
        com.reservation_system.model.Faculty faculty5 = new com.reservation_system.model.Faculty(0, "hi!", "researcher", "researcher", false);
        java.lang.String str6 = faculty5.getUserType();
        java.lang.String str7 = faculty5.getUserType();
        int int8 = faculty5.getID();
        java.lang.String str9 = faculty5.getUserType();
        java.lang.String str10 = faculty5.getUserType();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Faculty" + "'", str6, "Faculty");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Faculty" + "'", str7, "Faculty");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Faculty" + "'", str9, "Faculty");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Faculty" + "'", str10, "Faculty");
    }

    @Test
    public void test2382() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2382");
        com.reservation_system.model.LabManager labManager5 = new com.reservation_system.model.LabManager((int) (short) 10, "Researcher", "Faculty", "hi!", true);
        boolean boolean6 = labManager5.requiresDepartmentApproval();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test2383() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2383");
        com.reservation_system.model.LabManager labManager5 = new com.reservation_system.model.LabManager((int) (short) 100, "researcher", "labmanager", "headlabcoordinator", false);
    }

    @Test
    public void test2384() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2384");
        com.reservation_system.model.Student student5 = new com.reservation_system.model.Student((int) (short) 100, "Password1!", "guest", "Faculty", true);
        java.lang.String str6 = student5.getUserType();
        java.lang.String str7 = student5.getUserType();
        java.lang.String str8 = student5.getName();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Student" + "'", str6, "Student");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Student" + "'", str7, "Student");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Password1!" + "'", str8, "Password1!");
    }

    @Test
    public void test2385() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2385");
        com.reservation_system.model.Faculty faculty5 = new com.reservation_system.model.Faculty((int) (short) 100, "Guest", "labmanager", "andrew@example.com", true);
        boolean boolean6 = faculty5.requiresDepartmentApproval();
        java.lang.String str7 = faculty5.getName();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Guest" + "'", str7, "Guest");
    }

    @Test
    public void test2386() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2386");
        com.reservation_system.model.Student student5 = new com.reservation_system.model.Student((int) (byte) 100, "researcher", "andrew@example.com", "", false);
    }

    @Test
    public void test2387() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2387");
        com.reservation_system.model.LabManager labManager5 = new com.reservation_system.model.LabManager(0, "researcher", "Guest", "", false);
    }

    @Test
    public void test2388() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2388");
        com.reservation_system.model.LabManager labManager5 = new com.reservation_system.model.LabManager((int) '#', "andrew@example.com", "Andrew", "Password1!", true);
        labManager5.setApproved(false);
        boolean boolean8 = labManager5.isApproved();
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test2389() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2389");
        com.reservation_system.model.Faculty faculty5 = new com.reservation_system.model.Faculty((int) (byte) 1, "", "Password1!", "andrew@example.com", false);
        java.lang.String str6 = faculty5.getPassword();
        java.lang.String str7 = faculty5.getUserType();
        java.lang.String str8 = faculty5.getUserType();
        java.lang.String str9 = faculty5.getUserType();
        java.lang.Class<?> wildcardClass10 = faculty5.getClass();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Faculty" + "'", str7, "Faculty");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Faculty" + "'", str8, "Faculty");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Faculty" + "'", str9, "Faculty");
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test2390() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2390");
        com.reservation_system.model.Faculty faculty5 = new com.reservation_system.model.Faculty((int) '#', "labmanager", "hi!", "Researcher", true);
        java.lang.String str6 = faculty5.getName();
        java.lang.String str7 = faculty5.getPassword();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "labmanager" + "'", str6, "labmanager");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Researcher" + "'", str7, "Researcher");
    }

    @Test
    public void test2391() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2391");
        com.reservation_system.model.Faculty faculty5 = new com.reservation_system.model.Faculty((int) (short) 10, "Faculty", "hi!", "faculty", true);
    }

    @Test
    public void test2392() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2392");
        com.reservation_system.model.Student student5 = new com.reservation_system.model.Student(0, "", "researcher", "researcher", false);
    }

    @Test
    public void test2393() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2393");
        com.reservation_system.model.HeadLabCoordinator headLabCoordinator5 = new com.reservation_system.model.HeadLabCoordinator((int) '4', "andrew@example.com", "faculty", "guest", false);
        java.lang.String str6 = headLabCoordinator5.getUserType();
        boolean boolean7 = headLabCoordinator5.isApproved();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "headlabcoordinator" + "'", str6, "headlabcoordinator");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test2394() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2394");
        com.reservation_system.model.HeadLabCoordinator headLabCoordinator5 = new com.reservation_system.model.HeadLabCoordinator(35, "", "student", "Researcher", true);
        java.lang.String str6 = headLabCoordinator5.getPassword();
        java.lang.String str7 = headLabCoordinator5.getUserType();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Researcher" + "'", str6, "Researcher");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "headlabcoordinator" + "'", str7, "headlabcoordinator");
    }

    @Test
    public void test2395() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2395");
        com.reservation_system.model.Student student5 = new com.reservation_system.model.Student((int) (byte) 100, "headlabcoordinator", "headlabcoordinator", "guest", false);
        java.lang.String str6 = student5.getUserType();
        java.lang.String str7 = student5.getPassword();
        java.lang.String str8 = student5.getName();
        boolean boolean9 = student5.isApproved();
        boolean boolean10 = student5.requiresDepartmentApproval();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Student" + "'", str6, "Student");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "guest" + "'", str7, "guest");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "headlabcoordinator" + "'", str8, "headlabcoordinator");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test2396() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2396");
        com.reservation_system.model.User user6 = com.reservation_system.patterns.factory.UserFactory.createUser("Researcher", 52, "student", "Student", "andrew@example.com", false);
        org.junit.Assert.assertNotNull(user6);
    }

    @Test
    public void test2397() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2397");
        com.reservation_system.model.Student student5 = new com.reservation_system.model.Student((int) (byte) 0, "Faculty", "Faculty", "headlabcoordinator", false);
        java.lang.String str6 = student5.getUserType();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Student" + "'", str6, "Student");
    }

    @Test
    public void test2398() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2398");
        com.reservation_system.model.LabManager labManager5 = new com.reservation_system.model.LabManager((int) (short) 0, "", "labmanager", "Student", false);
        java.lang.String str6 = labManager5.getEmail();
        java.lang.String str7 = labManager5.getUserType();
        labManager5.setApproved(false);
        java.lang.String str10 = labManager5.getUserType();
        java.lang.String str11 = labManager5.getUserType();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "labmanager" + "'", str6, "labmanager");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "labmanager" + "'", str7, "labmanager");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "labmanager" + "'", str10, "labmanager");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "labmanager" + "'", str11, "labmanager");
    }

    @Test
    public void test2399() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2399");
        com.reservation_system.model.User user6 = com.reservation_system.patterns.factory.UserFactory.createUser("headlabcoordinator", 52, "Andrew", "hi!", "", true);
        org.junit.Assert.assertNotNull(user6);
    }

    @Test
    public void test2400() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2400");
        com.reservation_system.model.Researcher researcher5 = new com.reservation_system.model.Researcher((int) (byte) 10, "Student", "", "headlabcoordinator", false);
        java.lang.String str6 = researcher5.getUserType();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Researcher" + "'", str6, "Researcher");
    }

    @Test
    public void test2401() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2401");
        com.reservation_system.model.LabManager labManager5 = new com.reservation_system.model.LabManager((int) (byte) 10, "guest", "Andrew", "Password1!", true);
        java.lang.Class<?> wildcardClass6 = labManager5.getClass();
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test2402() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2402");
        com.reservation_system.model.Guest guest5 = new com.reservation_system.model.Guest((int) (short) 100, "Andrew", "", "Student", false);
        guest5.setApproved(false);
        guest5.setApproved(true);
    }

    @Test
    public void test2403() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2403");
        com.reservation_system.model.Student student5 = new com.reservation_system.model.Student((int) 'a', "student", "hi!", "Student", true);
        boolean boolean6 = student5.isApproved();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test2404() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2404");
        com.reservation_system.model.Guest guest5 = new com.reservation_system.model.Guest((int) (short) -1, "faculty", "Researcher", "researcher", false);
    }

    @Test
    public void test2405() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2405");
        com.reservation_system.model.Student student5 = new com.reservation_system.model.Student(0, "student", "guest", "hi!", false);
        java.lang.String str6 = student5.getUserType();
        java.lang.String str7 = student5.getUserType();
        boolean boolean8 = student5.isApproved();
        boolean boolean9 = student5.requiresDepartmentApproval();
        java.lang.String str10 = student5.getPassword();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Student" + "'", str6, "Student");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Student" + "'", str7, "Student");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
    }

    @Test
    public void test2406() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2406");
        com.reservation_system.model.Guest guest5 = new com.reservation_system.model.Guest((int) '#', "Faculty", "", "Andrew", false);
        guest5.setApproved(false);
    }

    @Test
    public void test2407() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2407");
        com.reservation_system.model.HeadLabCoordinator headLabCoordinator5 = new com.reservation_system.model.HeadLabCoordinator(52, "", "faculty", "andrew@example.com", false);
    }

    @Test
    public void test2408() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2408");
        com.reservation_system.model.HeadLabCoordinator headLabCoordinator5 = new com.reservation_system.model.HeadLabCoordinator(10, "Guest", "Student", "headlabcoordinator", true);
        boolean boolean6 = headLabCoordinator5.isApproved();
        java.lang.String str7 = headLabCoordinator5.getUserType();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "headlabcoordinator" + "'", str7, "headlabcoordinator");
    }

    @Test
    public void test2409() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2409");
        com.reservation_system.model.User user6 = com.reservation_system.patterns.factory.UserFactory.createUser("Student", 97, "Password1!", "", "researcher", false);
        org.junit.Assert.assertNotNull(user6);
    }

    @Test
    public void test2410() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2410");
        com.reservation_system.model.LabManager labManager5 = new com.reservation_system.model.LabManager(0, "Faculty", "andrew@example.com", "Researcher", false);
    }

    @Test
    public void test2411() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2411");
        com.reservation_system.model.Guest guest5 = new com.reservation_system.model.Guest((int) (byte) 10, "", "student", "student", true);
    }

    @Test
    public void test2412() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2412");
        com.reservation_system.model.HeadLabCoordinator headLabCoordinator5 = new com.reservation_system.model.HeadLabCoordinator((int) '#', "Password1!", "Researcher", "Student", true);
        java.lang.String str6 = headLabCoordinator5.getUserType();
        headLabCoordinator5.setApproved(false);
        boolean boolean9 = headLabCoordinator5.requiresDepartmentApproval();
        java.lang.String str10 = headLabCoordinator5.getUserType();
        boolean boolean11 = headLabCoordinator5.requiresDepartmentApproval();
        java.lang.String str12 = headLabCoordinator5.getPassword();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "headlabcoordinator" + "'", str6, "headlabcoordinator");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "headlabcoordinator" + "'", str10, "headlabcoordinator");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Student" + "'", str12, "Student");
    }

    @Test
    public void test2413() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2413");
        com.reservation_system.model.Researcher researcher5 = new com.reservation_system.model.Researcher((-1), "andrew@example.com", "Student", "hi!", false);
        java.lang.String str6 = researcher5.getUserType();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Researcher" + "'", str6, "Researcher");
    }

    @Test
    public void test2414() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2414");
        com.reservation_system.model.Researcher researcher5 = new com.reservation_system.model.Researcher(32, "andrew@example.com", "Researcher", "Student", false);
        researcher5.setApproved(false);
        java.lang.String str8 = researcher5.getEmail();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Researcher" + "'", str8, "Researcher");
    }

    @Test
    public void test2415() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2415");
        com.reservation_system.model.Guest guest5 = new com.reservation_system.model.Guest((int) '#', "guest", "faculty", "faculty", true);
        boolean boolean6 = guest5.requiresDepartmentApproval();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test2416() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2416");
        com.reservation_system.model.Student student5 = new com.reservation_system.model.Student((int) (byte) 100, "Guest", "andrew@example.com", "hi!", true);
    }

    @Test
    public void test2417() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2417");
        com.reservation_system.model.LabManager labManager5 = new com.reservation_system.model.LabManager((int) (short) -1, "", "faculty", "faculty", true);
    }

    @Test
    public void test2418() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2418");
        com.reservation_system.model.Researcher researcher5 = new com.reservation_system.model.Researcher(0, "Student", "", "", false);
    }

    @Test
    public void test2419() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2419");
        com.reservation_system.model.User user6 = com.reservation_system.patterns.factory.UserFactory.createUser("Student", 10, "", "Faculty", "headlabcoordinator", false);
        org.junit.Assert.assertNotNull(user6);
    }

    @Test
    public void test2420() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2420");
        com.reservation_system.model.Researcher researcher5 = new com.reservation_system.model.Researcher(10, "Guest", "Andrew", "Faculty", true);
    }

    @Test
    public void test2421() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2421");
        // The following exception was thrown during execution in test generation
        try {
            com.reservation_system.model.User user6 = com.reservation_system.patterns.factory.UserFactory.createUser("Andrew", (int) (byte) 10, "faculty", "guest", "faculty", true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid user type: Andrew");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2422() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2422");
        com.reservation_system.model.HeadLabCoordinator headLabCoordinator5 = new com.reservation_system.model.HeadLabCoordinator((int) '4', "Guest", "Researcher", "Researcher", false);
        java.lang.String str6 = headLabCoordinator5.getUserType();
        boolean boolean7 = headLabCoordinator5.requiresDepartmentApproval();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "headlabcoordinator" + "'", str6, "headlabcoordinator");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test2423() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2423");
        com.reservation_system.model.LabManager labManager5 = new com.reservation_system.model.LabManager((int) '4', "guest", "Faculty", "Andrew", true);
        java.lang.String str6 = labManager5.getUserType();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "labmanager" + "'", str6, "labmanager");
    }

    @Test
    public void test2424() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2424");
        com.reservation_system.model.User user6 = com.reservation_system.patterns.factory.UserFactory.createUser("guest", (int) (byte) 10, "Andrew", "Faculty", "Faculty", false);
        org.junit.Assert.assertNotNull(user6);
    }

    @Test
    public void test2425() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2425");
        com.reservation_system.model.LabManager labManager5 = new com.reservation_system.model.LabManager((int) (short) 10, "headlabcoordinator", "Andrew", "guest", true);
        java.lang.String str6 = labManager5.getPassword();
        java.lang.String str7 = labManager5.getUserType();
        boolean boolean8 = labManager5.isApproved();
        java.lang.String str9 = labManager5.getUserType();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "guest" + "'", str6, "guest");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "labmanager" + "'", str7, "labmanager");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "labmanager" + "'", str9, "labmanager");
    }

    @Test
    public void test2426() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2426");
        com.reservation_system.model.Faculty faculty5 = new com.reservation_system.model.Faculty(32, "Student", "guest", "Andrew", true);
        faculty5.setApproved(true);
        java.lang.String str8 = faculty5.getUserType();
        java.lang.Class<?> wildcardClass9 = faculty5.getClass();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Faculty" + "'", str8, "Faculty");
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test2427() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2427");
        com.reservation_system.model.Faculty faculty5 = new com.reservation_system.model.Faculty((int) (short) 0, "", "andrew@example.com", "", false);
    }

    @Test
    public void test2428() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2428");
        com.reservation_system.model.HeadLabCoordinator headLabCoordinator5 = new com.reservation_system.model.HeadLabCoordinator((int) '#', "Andrew", "andrew@example.com", "Andrew", false);
        java.lang.String str6 = headLabCoordinator5.getUserType();
        java.lang.String str7 = headLabCoordinator5.getUserType();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "headlabcoordinator" + "'", str6, "headlabcoordinator");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "headlabcoordinator" + "'", str7, "headlabcoordinator");
    }

    @Test
    public void test2429() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2429");
        com.reservation_system.model.Guest guest5 = new com.reservation_system.model.Guest(0, "", "headlabcoordinator", "Guest", true);
    }

    @Test
    public void test2430() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2430");
        com.reservation_system.model.Faculty faculty5 = new com.reservation_system.model.Faculty(52, "Researcher", "", "Password1!", false);
    }

    @Test
    public void test2431() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2431");
        com.reservation_system.model.Student student5 = new com.reservation_system.model.Student((int) (short) 1, "Andrew", "Password1!", "Password1!", true);
    }

    @Test
    public void test2432() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2432");
        com.reservation_system.model.LabManager labManager5 = new com.reservation_system.model.LabManager((int) ' ', "Student", "student", "", true);
        java.lang.String str6 = labManager5.getUserType();
        boolean boolean7 = labManager5.requiresDepartmentApproval();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "labmanager" + "'", str6, "labmanager");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test2433() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2433");
        com.reservation_system.model.HeadLabCoordinator headLabCoordinator5 = new com.reservation_system.model.HeadLabCoordinator(52, "", "headlabcoordinator", "researcher", false);
    }

    @Test
    public void test2434() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2434");
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
        boolean boolean16 = student5.isApproved();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Student" + "'", str6, "Student");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Student" + "'", str7, "Student");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Student" + "'", str8, "Student");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Student" + "'", str11, "Student");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "student" + "'", str12, "student");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Student" + "'", str13, "Student");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Student" + "'", str15, "Student");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test2435() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2435");
        com.reservation_system.model.Student student5 = new com.reservation_system.model.Student(0, "labmanager", "andrew@example.com", "", true);
        java.lang.String str6 = student5.getPassword();
        java.lang.Class<?> wildcardClass7 = student5.getClass();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test2436() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2436");
        com.reservation_system.model.User user6 = com.reservation_system.patterns.factory.UserFactory.createUser("labmanager", 100, "hi!", "labmanager", "Andrew", false);
        boolean boolean7 = user6.requiresDepartmentApproval();
        org.junit.Assert.assertNotNull(user6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test2437() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2437");
        com.reservation_system.model.User user6 = com.reservation_system.patterns.factory.UserFactory.createUser("Student", (int) (byte) 1, "Faculty", "Password1!", "", false);
        org.junit.Assert.assertNotNull(user6);
    }

    @Test
    public void test2438() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2438");
        com.reservation_system.model.LabManager labManager5 = new com.reservation_system.model.LabManager(0, "", "Andrew", "Researcher", false);
    }

    @Test
    public void test2439() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2439");
        com.reservation_system.model.HeadLabCoordinator headLabCoordinator5 = new com.reservation_system.model.HeadLabCoordinator((int) (byte) 10, "Password1!", "student", "Andrew", false);
        java.lang.String str6 = headLabCoordinator5.getUserType();
        java.lang.String str7 = headLabCoordinator5.getUserType();
        headLabCoordinator5.setApproved(true);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "headlabcoordinator" + "'", str6, "headlabcoordinator");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "headlabcoordinator" + "'", str7, "headlabcoordinator");
    }

    @Test
    public void test2440() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2440");
        com.reservation_system.model.Faculty faculty5 = new com.reservation_system.model.Faculty((int) ' ', "Researcher", "Password1!", "Student", true);
        java.lang.String str6 = faculty5.getUserType();
        java.lang.String str7 = faculty5.getEmail();
        java.lang.String str8 = faculty5.getUserType();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Faculty" + "'", str6, "Faculty");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Password1!" + "'", str7, "Password1!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Faculty" + "'", str8, "Faculty");
    }

    @Test
    public void test2441() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2441");
        com.reservation_system.model.HeadLabCoordinator headLabCoordinator5 = new com.reservation_system.model.HeadLabCoordinator(10, "Guest", "Student", "Researcher", true);
        java.lang.String str6 = headLabCoordinator5.getUserType();
        headLabCoordinator5.setApproved(true);
        java.lang.String str9 = headLabCoordinator5.getUserType();
        java.lang.String str10 = headLabCoordinator5.getUserType();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "headlabcoordinator" + "'", str6, "headlabcoordinator");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "headlabcoordinator" + "'", str9, "headlabcoordinator");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "headlabcoordinator" + "'", str10, "headlabcoordinator");
    }

    @Test
    public void test2442() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2442");
        com.reservation_system.model.Researcher researcher5 = new com.reservation_system.model.Researcher((-1), "hi!", "guest", "researcher", false);
    }

    @Test
    public void test2443() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2443");
        com.reservation_system.model.Researcher researcher5 = new com.reservation_system.model.Researcher(0, "student", "", "student", false);
        java.lang.String str6 = researcher5.getPassword();
        int int7 = researcher5.getID();
        int int8 = researcher5.getID();
        researcher5.setApproved(false);
        java.lang.String str11 = researcher5.getPassword();
        java.lang.String str12 = researcher5.getName();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "student" + "'", str6, "student");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "student" + "'", str11, "student");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "student" + "'", str12, "student");
    }

    @Test
    public void test2444() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2444");
        com.reservation_system.model.Faculty faculty5 = new com.reservation_system.model.Faculty((int) '#', "Andrew", "", "labmanager", false);
        java.lang.String str6 = faculty5.getEmail();
        java.lang.String str7 = faculty5.getUserType();
        boolean boolean8 = faculty5.requiresDepartmentApproval();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Faculty" + "'", str7, "Faculty");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test2445() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2445");
        com.reservation_system.model.LabManager labManager5 = new com.reservation_system.model.LabManager(97, "headlabcoordinator", "", "researcher", false);
    }

    @Test
    public void test2446() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2446");
        com.reservation_system.model.Student student5 = new com.reservation_system.model.Student((int) '4', "Researcher", "Researcher", "hi!", false);
    }

    @Test
    public void test2447() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2447");
        com.reservation_system.model.Student student5 = new com.reservation_system.model.Student((int) '4', "faculty", "researcher", "andrew@example.com", true);
    }

    @Test
    public void test2448() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2448");
        com.reservation_system.model.Student student5 = new com.reservation_system.model.Student(52, "Faculty", "guest", "researcher", true);
    }

    @Test
    public void test2449() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2449");
        com.reservation_system.model.LabManager labManager5 = new com.reservation_system.model.LabManager((int) (short) 10, "headlabcoordinator", "Andrew", "guest", true);
        java.lang.String str6 = labManager5.getUserType();
        java.lang.String str7 = labManager5.getUserType();
        labManager5.setApproved(false);
        java.lang.String str10 = labManager5.getUserType();
        java.lang.String str11 = labManager5.getUserType();
        boolean boolean12 = labManager5.requiresDepartmentApproval();
        java.lang.String str13 = labManager5.getUserType();
        int int14 = labManager5.getID();
        java.lang.String str15 = labManager5.getName();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "labmanager" + "'", str6, "labmanager");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "labmanager" + "'", str7, "labmanager");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "labmanager" + "'", str10, "labmanager");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "labmanager" + "'", str11, "labmanager");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "labmanager" + "'", str13, "labmanager");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 10 + "'", int14 == 10);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "headlabcoordinator" + "'", str15, "headlabcoordinator");
    }

    @Test
    public void test2450() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2450");
        com.reservation_system.model.LabManager labManager5 = new com.reservation_system.model.LabManager(100, "Researcher", "headlabcoordinator", "headlabcoordinator", false);
    }

    @Test
    public void test2451() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2451");
        com.reservation_system.model.Researcher researcher5 = new com.reservation_system.model.Researcher(0, "student", "", "student", false);
        java.lang.String str6 = researcher5.getEmail();
        researcher5.setApproved(false);
        java.lang.String str9 = researcher5.getUserType();
        java.lang.String str10 = researcher5.getUserType();
        researcher5.setApproved(false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Researcher" + "'", str9, "Researcher");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Researcher" + "'", str10, "Researcher");
    }

    @Test
    public void test2452() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2452");
        com.reservation_system.model.LabManager labManager5 = new com.reservation_system.model.LabManager(97, "Guest", "andrew@example.com", "labmanager", false);
        labManager5.setApproved(true);
    }

    @Test
    public void test2453() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2453");
        com.reservation_system.model.Researcher researcher5 = new com.reservation_system.model.Researcher((int) (byte) 0, "faculty", "Student", "guest", false);
        java.lang.String str6 = researcher5.getUserType();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Researcher" + "'", str6, "Researcher");
    }

    @Test
    public void test2454() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2454");
        com.reservation_system.model.HeadLabCoordinator headLabCoordinator5 = new com.reservation_system.model.HeadLabCoordinator(32, "", "Andrew", "Guest", true);
    }

    @Test
    public void test2455() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2455");
        com.reservation_system.model.LabManager labManager5 = new com.reservation_system.model.LabManager(1, "student", "Andrew", "hi!", false);
        java.lang.String str6 = labManager5.getUserType();
        boolean boolean7 = labManager5.isApproved();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "labmanager" + "'", str6, "labmanager");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test2456() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2456");
        com.reservation_system.model.HeadLabCoordinator headLabCoordinator5 = new com.reservation_system.model.HeadLabCoordinator((int) 'a', "hi!", "", "Researcher", false);
    }

    @Test
    public void test2457() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2457");
        com.reservation_system.model.LabManager labManager5 = new com.reservation_system.model.LabManager((int) '#', "Researcher", "hi!", "", false);
        int int6 = labManager5.getID();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 35 + "'", int6 == 35);
    }

    @Test
    public void test2458() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2458");
        com.reservation_system.model.User user6 = com.reservation_system.patterns.factory.UserFactory.createUser("Faculty", (int) '4', "Researcher", "student", "Faculty", true);
        org.junit.Assert.assertNotNull(user6);
    }

    @Test
    public void test2459() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2459");
        com.reservation_system.model.Guest guest5 = new com.reservation_system.model.Guest(10, "andrew@example.com", "Faculty", "", true);
        java.lang.String str6 = guest5.getUserType();
        java.lang.String str7 = guest5.getUserType();
        guest5.setApproved(false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Guest" + "'", str6, "Guest");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Guest" + "'", str7, "Guest");
    }

    @Test
    public void test2460() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2460");
        com.reservation_system.model.Faculty faculty5 = new com.reservation_system.model.Faculty(52, "Password1!", "", "hi!", false);
    }

    @Test
    public void test2461() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2461");
        com.reservation_system.model.Researcher researcher5 = new com.reservation_system.model.Researcher(32, "Faculty", "faculty", "researcher", false);
    }

    @Test
    public void test2462() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2462");
        com.reservation_system.model.Student student5 = new com.reservation_system.model.Student(0, "student", "guest", "hi!", false);
        java.lang.String str6 = student5.getUserType();
        java.lang.String str7 = student5.getUserType();
        boolean boolean8 = student5.isApproved();
        boolean boolean9 = student5.requiresDepartmentApproval();
        java.lang.String str10 = student5.getUserType();
        java.lang.String str11 = student5.getEmail();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Student" + "'", str6, "Student");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Student" + "'", str7, "Student");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Student" + "'", str10, "Student");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "guest" + "'", str11, "guest");
    }

    @Test
    public void test2463() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2463");
        com.reservation_system.model.LabManager labManager5 = new com.reservation_system.model.LabManager((int) '4', "", "labmanager", "andrew@example.com", true);
        java.lang.String str6 = labManager5.getUserType();
        java.lang.String str7 = labManager5.getUserType();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "labmanager" + "'", str6, "labmanager");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "labmanager" + "'", str7, "labmanager");
    }

    @Test
    public void test2464() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2464");
        com.reservation_system.model.Student student5 = new com.reservation_system.model.Student(35, "Guest", "Guest", "Researcher", true);
    }

    @Test
    public void test2465() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2465");
        com.reservation_system.model.Faculty faculty5 = new com.reservation_system.model.Faculty(97, "andrew@example.com", "student", "Guest", true);
    }

    @Test
    public void test2466() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2466");
        com.reservation_system.model.Faculty faculty5 = new com.reservation_system.model.Faculty((int) (short) 100, "Researcher", "researcher", "Guest", true);
        boolean boolean6 = faculty5.requiresDepartmentApproval();
        boolean boolean7 = faculty5.requiresDepartmentApproval();
        boolean boolean8 = faculty5.isApproved();
        boolean boolean9 = faculty5.isApproved();
        java.lang.String str10 = faculty5.getUserType();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Faculty" + "'", str10, "Faculty");
    }

    @Test
    public void test2467() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2467");
        com.reservation_system.model.Researcher researcher5 = new com.reservation_system.model.Researcher((int) (short) 100, "headlabcoordinator", "Student", "guest", true);
        java.lang.String str6 = researcher5.getUserType();
        researcher5.setApproved(true);
        java.lang.String str9 = researcher5.getUserType();
        java.lang.String str10 = researcher5.getEmail();
        java.lang.String str11 = researcher5.getUserType();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Researcher" + "'", str6, "Researcher");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Researcher" + "'", str9, "Researcher");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Student" + "'", str10, "Student");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Researcher" + "'", str11, "Researcher");
    }

    @Test
    public void test2468() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2468");
        com.reservation_system.model.Faculty faculty5 = new com.reservation_system.model.Faculty((int) ' ', "Researcher", "Password1!", "Student", true);
        java.lang.String str6 = faculty5.getUserType();
        java.lang.String str7 = faculty5.getUserType();
        java.lang.String str8 = faculty5.getUserType();
        java.lang.Class<?> wildcardClass9 = faculty5.getClass();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Faculty" + "'", str6, "Faculty");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Faculty" + "'", str7, "Faculty");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Faculty" + "'", str8, "Faculty");
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test2469() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2469");
        com.reservation_system.model.Faculty faculty5 = new com.reservation_system.model.Faculty((int) (byte) -1, "guest", "Student", "", true);
    }

    @Test
    public void test2470() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2470");
        com.reservation_system.model.Guest guest5 = new com.reservation_system.model.Guest((int) (short) 1, "faculty", "Student", "Faculty", true);
        java.lang.String str6 = guest5.getUserType();
        java.lang.String str7 = guest5.getName();
        int int8 = guest5.getID();
        java.lang.String str9 = guest5.getUserType();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Guest" + "'", str6, "Guest");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "faculty" + "'", str7, "faculty");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Guest" + "'", str9, "Guest");
    }

    @Test
    public void test2471() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2471");
        com.reservation_system.model.LabManager labManager5 = new com.reservation_system.model.LabManager(1, "Andrew", "Student", "Guest", false);
    }

    @Test
    public void test2472() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2472");
        com.reservation_system.model.Guest guest5 = new com.reservation_system.model.Guest((int) ' ', "", "headlabcoordinator", "hi!", true);
        java.lang.String str6 = guest5.getEmail();
        java.lang.String str7 = guest5.getUserType();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "headlabcoordinator" + "'", str6, "headlabcoordinator");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Guest" + "'", str7, "Guest");
    }

    @Test
    public void test2473() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2473");
        com.reservation_system.model.HeadLabCoordinator headLabCoordinator5 = new com.reservation_system.model.HeadLabCoordinator((int) (byte) 10, "faculty", "Faculty", "Student", true);
        java.lang.String str6 = headLabCoordinator5.getUserType();
        java.lang.String str7 = headLabCoordinator5.getEmail();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "headlabcoordinator" + "'", str6, "headlabcoordinator");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Faculty" + "'", str7, "Faculty");
    }

    @Test
    public void test2474() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2474");
        com.reservation_system.model.Student student5 = new com.reservation_system.model.Student((int) (byte) 100, "", "Password1!", "", true);
        int int6 = student5.getID();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
    }

    @Test
    public void test2475() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2475");
        // The following exception was thrown during execution in test generation
        try {
            com.reservation_system.model.User user6 = com.reservation_system.patterns.factory.UserFactory.createUser("andrew@example.com", (int) (byte) 0, "headlabcoordinator", "", "faculty", false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid user type: andrew@example.com");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2476() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2476");
        com.reservation_system.model.Guest guest5 = new com.reservation_system.model.Guest((int) (byte) -1, "faculty", "", "student", false);
        java.lang.String str6 = guest5.getUserType();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Guest" + "'", str6, "Guest");
    }

    @Test
    public void test2477() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2477");
        com.reservation_system.model.User user6 = com.reservation_system.patterns.factory.UserFactory.createUser("labmanager", 97, "Guest", "Guest", "Guest", true);
        org.junit.Assert.assertNotNull(user6);
    }

    @Test
    public void test2478() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2478");
        com.reservation_system.model.Student student5 = new com.reservation_system.model.Student((int) '#', "labmanager", "Andrew", "researcher", false);
    }

    @Test
    public void test2479() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2479");
        com.reservation_system.model.LabManager labManager5 = new com.reservation_system.model.LabManager(35, "student", "hi!", "labmanager", false);
        java.lang.String str6 = labManager5.getUserType();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "labmanager" + "'", str6, "labmanager");
    }

    @Test
    public void test2480() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2480");
        com.reservation_system.model.HeadLabCoordinator headLabCoordinator5 = new com.reservation_system.model.HeadLabCoordinator(1, "Password1!", "andrew@example.com", "guest", false);
        java.lang.String str6 = headLabCoordinator5.getName();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Password1!" + "'", str6, "Password1!");
    }

    @Test
    public void test2481() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2481");
        com.reservation_system.model.LabManager labManager5 = new com.reservation_system.model.LabManager((int) '#', "student", "Password1!", "Guest", true);
        boolean boolean6 = labManager5.isApproved();
        boolean boolean7 = labManager5.isApproved();
        labManager5.setApproved(true);
        java.lang.String str10 = labManager5.getUserType();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "labmanager" + "'", str10, "labmanager");
    }

    @Test
    public void test2482() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2482");
        com.reservation_system.model.LabManager labManager5 = new com.reservation_system.model.LabManager((int) (byte) 10, "guest", "Researcher", "guest", true);
    }

    @Test
    public void test2483() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2483");
        com.reservation_system.model.HeadLabCoordinator headLabCoordinator5 = new com.reservation_system.model.HeadLabCoordinator((int) (short) 10, "guest", "Student", "headlabcoordinator", true);
    }

    @Test
    public void test2484() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2484");
        com.reservation_system.model.Faculty faculty5 = new com.reservation_system.model.Faculty((int) (short) -1, "student", "student", "", true);
    }

    @Test
    public void test2485() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2485");
        com.reservation_system.model.User user6 = com.reservation_system.patterns.factory.UserFactory.createUser("headlabcoordinator", (int) (byte) 10, "faculty", "student", "faculty", false);
        org.junit.Assert.assertNotNull(user6);
    }

    @Test
    public void test2486() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2486");
        com.reservation_system.model.Researcher researcher5 = new com.reservation_system.model.Researcher((int) 'a', "", "researcher", "Student", false);
        java.lang.String str6 = researcher5.getUserType();
        java.lang.String str7 = researcher5.getPassword();
        java.lang.String str8 = researcher5.getUserType();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Researcher" + "'", str6, "Researcher");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Student" + "'", str7, "Student");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Researcher" + "'", str8, "Researcher");
    }

    @Test
    public void test2487() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2487");
        com.reservation_system.model.Guest guest5 = new com.reservation_system.model.Guest((int) (short) 100, "Andrew", "", "Student", false);
        guest5.setApproved(false);
        java.lang.String str8 = guest5.getUserType();
        java.lang.String str9 = guest5.getName();
        boolean boolean10 = guest5.requiresDepartmentApproval();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Guest" + "'", str8, "Guest");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Andrew" + "'", str9, "Andrew");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test2488() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2488");
        com.reservation_system.model.Faculty faculty5 = new com.reservation_system.model.Faculty((int) (byte) 0, "Password1!", "andrew@example.com", "", false);
    }

    @Test
    public void test2489() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2489");
        com.reservation_system.model.Guest guest5 = new com.reservation_system.model.Guest((int) ' ', "", "andrew@example.com", "hi!", true);
        guest5.setApproved(false);
        java.lang.String str8 = guest5.getPassword();
        boolean boolean9 = guest5.requiresDepartmentApproval();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test2490() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2490");
        com.reservation_system.model.LabManager labManager5 = new com.reservation_system.model.LabManager(10, "hi!", "Andrew", "", true);
    }

    @Test
    public void test2491() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2491");
        com.reservation_system.model.LabManager labManager5 = new com.reservation_system.model.LabManager((int) (short) 1, "Student", "Faculty", "guest", true);
        boolean boolean6 = labManager5.requiresDepartmentApproval();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test2492() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2492");
        com.reservation_system.model.Guest guest5 = new com.reservation_system.model.Guest((int) '4', "andrew@example.com", "student", "faculty", true);
        java.lang.String str6 = guest5.getUserType();
        boolean boolean7 = guest5.requiresDepartmentApproval();
        int int8 = guest5.getID();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Guest" + "'", str6, "Guest");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 52 + "'", int8 == 52);
    }

    @Test
    public void test2493() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2493");
        com.reservation_system.model.HeadLabCoordinator headLabCoordinator5 = new com.reservation_system.model.HeadLabCoordinator((int) (byte) -1, "labmanager", "Researcher", "Student", false);
    }

    @Test
    public void test2494() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2494");
        com.reservation_system.model.User user6 = com.reservation_system.patterns.factory.UserFactory.createUser("faculty", 35, "Password1!", "andrew@example.com", "Faculty", false);
        org.junit.Assert.assertNotNull(user6);
    }

    @Test
    public void test2495() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2495");
        com.reservation_system.model.HeadLabCoordinator headLabCoordinator5 = new com.reservation_system.model.HeadLabCoordinator(32, "hi!", "", "Researcher", true);
        boolean boolean6 = headLabCoordinator5.requiresDepartmentApproval();
        java.lang.String str7 = headLabCoordinator5.getUserType();
        java.lang.String str8 = headLabCoordinator5.getName();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "headlabcoordinator" + "'", str7, "headlabcoordinator");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
    }

    @Test
    public void test2496() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2496");
        com.reservation_system.model.Student student5 = new com.reservation_system.model.Student(1, "guest", "hi!", "student", false);
        java.lang.String str6 = student5.getUserType();
        java.lang.String str7 = student5.getUserType();
        java.lang.String str8 = student5.getUserType();
        java.lang.String str9 = student5.getUserType();
        boolean boolean10 = student5.requiresDepartmentApproval();
        java.lang.String str11 = student5.getUserType();
        java.lang.String str12 = student5.getUserType();
        java.lang.String str13 = student5.getUserType();
        java.lang.String str14 = student5.getUserType();
        int int15 = student5.getID();
        java.lang.String str16 = student5.getUserType();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Student" + "'", str6, "Student");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Student" + "'", str7, "Student");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Student" + "'", str8, "Student");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Student" + "'", str9, "Student");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Student" + "'", str11, "Student");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Student" + "'", str12, "Student");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Student" + "'", str13, "Student");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Student" + "'", str14, "Student");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Student" + "'", str16, "Student");
    }

    @Test
    public void test2497() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2497");
        com.reservation_system.model.Faculty faculty5 = new com.reservation_system.model.Faculty((int) (byte) 1, "", "Password1!", "andrew@example.com", false);
        java.lang.String str6 = faculty5.getPassword();
        int int7 = faculty5.getID();
        java.lang.String str8 = faculty5.getName();
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test2498() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2498");
        com.reservation_system.model.Researcher researcher5 = new com.reservation_system.model.Researcher((int) (byte) 0, "", "Researcher", "Student", true);
    }

    @Test
    public void test2499() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2499");
        com.reservation_system.model.Student student5 = new com.reservation_system.model.Student(10, "Researcher", "Researcher", "", false);
    }

    @Test
    public void test2500() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2500");
        com.reservation_system.model.Researcher researcher5 = new com.reservation_system.model.Researcher(0, "student", "", "student", false);
        java.lang.String str6 = researcher5.getEmail();
        java.lang.String str7 = researcher5.getEmail();
        java.lang.String str8 = researcher5.getUserType();
        boolean boolean9 = researcher5.isApproved();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Researcher" + "'", str8, "Researcher");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }
}

