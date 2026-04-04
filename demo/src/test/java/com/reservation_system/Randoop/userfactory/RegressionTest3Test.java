package com.reservation_system.Randoop.userfactory;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest3Test {

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
    public void test1501() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1501");
        com.reservation_system.model.Researcher researcher5 = new com.reservation_system.model.Researcher((int) (short) 1, "researcher", "andrew@example.com", "Andrew", false);
    }

    @Test
    public void test1502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1502");
        com.reservation_system.model.HeadLabCoordinator headLabCoordinator5 = new com.reservation_system.model.HeadLabCoordinator((int) (byte) 100, "andrew@example.com", "guest", "", true);
    }

    @Test
    public void test1503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1503");
        com.reservation_system.model.LabManager labManager5 = new com.reservation_system.model.LabManager((int) (byte) -1, "Password1!", "guest", "headlabcoordinator", true);
    }

    @Test
    public void test1504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1504");
        // The following exception was thrown during execution in test generation
        try {
            com.reservation_system.model.User user6 = com.reservation_system.patterns.factory.UserFactory.createUser("", (int) ' ', "guest", "headlabcoordinator", "Password1!", true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid user type: ");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1505");
        com.reservation_system.model.HeadLabCoordinator headLabCoordinator5 = new com.reservation_system.model.HeadLabCoordinator(32, "Guest", "guest", "Andrew", false);
    }

    @Test
    public void test1506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1506");
        com.reservation_system.model.HeadLabCoordinator headLabCoordinator5 = new com.reservation_system.model.HeadLabCoordinator((int) ' ', "Faculty", "headlabcoordinator", "Password1!", true);
        boolean boolean6 = headLabCoordinator5.isApproved();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test1507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1507");
        com.reservation_system.model.HeadLabCoordinator headLabCoordinator5 = new com.reservation_system.model.HeadLabCoordinator(100, "student", "faculty", "Researcher", true);
        java.lang.String str6 = headLabCoordinator5.getEmail();
        headLabCoordinator5.setApproved(false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "faculty" + "'", str6, "faculty");
    }

    @Test
    public void test1508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1508");
        com.reservation_system.model.Student student5 = new com.reservation_system.model.Student((int) (byte) 1, "headlabcoordinator", "guest", "faculty", false);
        java.lang.String str6 = student5.getPassword();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "faculty" + "'", str6, "faculty");
    }

    @Test
    public void test1509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1509");
        com.reservation_system.model.Guest guest5 = new com.reservation_system.model.Guest((int) '#', "Researcher", "Researcher", "labmanager", true);
    }

    @Test
    public void test1510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1510");
        com.reservation_system.model.Researcher researcher5 = new com.reservation_system.model.Researcher(52, "Andrew", "faculty", "hi!", true);
        java.lang.String str6 = researcher5.getName();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Andrew" + "'", str6, "Andrew");
    }

    @Test
    public void test1511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1511");
        com.reservation_system.model.Student student5 = new com.reservation_system.model.Student((int) (byte) 100, "headlabcoordinator", "headlabcoordinator", "guest", false);
        java.lang.String str6 = student5.getUserType();
        java.lang.String str7 = student5.getPassword();
        java.lang.String str8 = student5.getName();
        boolean boolean9 = student5.requiresDepartmentApproval();
        java.lang.Class<?> wildcardClass10 = student5.getClass();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Student" + "'", str6, "Student");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "guest" + "'", str7, "guest");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "headlabcoordinator" + "'", str8, "headlabcoordinator");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test1512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1512");
        com.reservation_system.model.Faculty faculty5 = new com.reservation_system.model.Faculty(32, "student", "headlabcoordinator", "headlabcoordinator", true);
        java.lang.String str6 = faculty5.getUserType();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Faculty" + "'", str6, "Faculty");
    }

    @Test
    public void test1513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1513");
        com.reservation_system.model.Student student5 = new com.reservation_system.model.Student((int) '#', "", "guest", "Andrew", true);
        java.lang.String str6 = student5.getUserType();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Student" + "'", str6, "Student");
    }

    @Test
    public void test1514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1514");
        com.reservation_system.model.HeadLabCoordinator headLabCoordinator5 = new com.reservation_system.model.HeadLabCoordinator((int) (short) 1, "faculty", "Researcher", "Faculty", true);
    }

    @Test
    public void test1515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1515");
        com.reservation_system.model.Researcher researcher5 = new com.reservation_system.model.Researcher(1, "Faculty", "hi!", "guest", false);
    }

    @Test
    public void test1516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1516");
        com.reservation_system.model.Researcher researcher5 = new com.reservation_system.model.Researcher((int) (short) 1, "Guest", "labmanager", "researcher", false);
        java.lang.String str6 = researcher5.getUserType();
        java.lang.String str7 = researcher5.getUserType();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Researcher" + "'", str6, "Researcher");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Researcher" + "'", str7, "Researcher");
    }

    @Test
    public void test1517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1517");
        com.reservation_system.model.LabManager labManager5 = new com.reservation_system.model.LabManager((int) '#', "student", "Password1!", "Guest", true);
        java.lang.String str6 = labManager5.getUserType();
        java.lang.String str7 = labManager5.getEmail();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "labmanager" + "'", str6, "labmanager");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Password1!" + "'", str7, "Password1!");
    }

    @Test
    public void test1518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1518");
        com.reservation_system.model.Researcher researcher5 = new com.reservation_system.model.Researcher(0, "student", "", "student", false);
        java.lang.String str6 = researcher5.getPassword();
        int int7 = researcher5.getID();
        boolean boolean8 = researcher5.requiresDepartmentApproval();
        int int9 = researcher5.getID();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "student" + "'", str6, "student");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test1519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1519");
        com.reservation_system.model.HeadLabCoordinator headLabCoordinator5 = new com.reservation_system.model.HeadLabCoordinator(10, "Guest", "Student", "Researcher", true);
        boolean boolean6 = headLabCoordinator5.isApproved();
        java.lang.String str7 = headLabCoordinator5.getUserType();
        java.lang.String str8 = headLabCoordinator5.getUserType();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "headlabcoordinator" + "'", str7, "headlabcoordinator");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "headlabcoordinator" + "'", str8, "headlabcoordinator");
    }

    @Test
    public void test1520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1520");
        com.reservation_system.model.Guest guest5 = new com.reservation_system.model.Guest(0, "andrew@example.com", "Andrew", "Researcher", false);
    }

    @Test
    public void test1521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1521");
        com.reservation_system.model.Researcher researcher5 = new com.reservation_system.model.Researcher(10, "", "Password1!", "Guest", false);
        java.lang.String str6 = researcher5.getUserType();
        java.lang.String str7 = researcher5.getEmail();
        java.lang.String str8 = researcher5.getUserType();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Researcher" + "'", str6, "Researcher");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Password1!" + "'", str7, "Password1!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Researcher" + "'", str8, "Researcher");
    }

    @Test
    public void test1522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1522");
        com.reservation_system.model.LabManager labManager5 = new com.reservation_system.model.LabManager((int) (short) 10, "headlabcoordinator", "Andrew", "guest", true);
        java.lang.String str6 = labManager5.getPassword();
        boolean boolean7 = labManager5.requiresDepartmentApproval();
        java.lang.String str8 = labManager5.getName();
        labManager5.setApproved(true);
        int int11 = labManager5.getID();
        java.lang.String str12 = labManager5.getUserType();
        java.lang.String str13 = labManager5.getUserType();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "guest" + "'", str6, "guest");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "headlabcoordinator" + "'", str8, "headlabcoordinator");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 10 + "'", int11 == 10);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "labmanager" + "'", str12, "labmanager");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "labmanager" + "'", str13, "labmanager");
    }

    @Test
    public void test1523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1523");
        com.reservation_system.model.Faculty faculty5 = new com.reservation_system.model.Faculty((int) (short) 100, "headlabcoordinator", "guest", "student", true);
    }

    @Test
    public void test1524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1524");
        com.reservation_system.model.Researcher researcher5 = new com.reservation_system.model.Researcher(52, "labmanager", "andrew@example.com", "Researcher", true);
        java.lang.String str6 = researcher5.getUserType();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Researcher" + "'", str6, "Researcher");
    }

    @Test
    public void test1525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1525");
        com.reservation_system.model.Student student5 = new com.reservation_system.model.Student(100, "Researcher", "guest", "Andrew", false);
    }

    @Test
    public void test1526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1526");
        com.reservation_system.model.Student student5 = new com.reservation_system.model.Student(0, "Guest", "", "", false);
        java.lang.String str6 = student5.getUserType();
        java.lang.String str7 = student5.getUserType();
        java.lang.String str8 = student5.getUserType();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Student" + "'", str6, "Student");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Student" + "'", str7, "Student");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Student" + "'", str8, "Student");
    }

    @Test
    public void test1527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1527");
        com.reservation_system.model.HeadLabCoordinator headLabCoordinator5 = new com.reservation_system.model.HeadLabCoordinator(52, "Guest", "headlabcoordinator", "faculty", true);
        headLabCoordinator5.setApproved(true);
        java.lang.String str8 = headLabCoordinator5.getUserType();
        java.lang.String str9 = headLabCoordinator5.getPassword();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "headlabcoordinator" + "'", str8, "headlabcoordinator");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "faculty" + "'", str9, "faculty");
    }

    @Test
    public void test1528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1528");
        com.reservation_system.model.Researcher researcher5 = new com.reservation_system.model.Researcher((int) (byte) -1, "andrew@example.com", "andrew@example.com", "labmanager", false);
        boolean boolean6 = researcher5.isApproved();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test1529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1529");
        com.reservation_system.model.HeadLabCoordinator headLabCoordinator5 = new com.reservation_system.model.HeadLabCoordinator((int) (short) 100, "labmanager", "Researcher", "labmanager", false);
        headLabCoordinator5.setApproved(false);
    }

    @Test
    public void test1530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1530");
        com.reservation_system.model.Researcher researcher5 = new com.reservation_system.model.Researcher(10, "", "Student", "faculty", true);
    }

    @Test
    public void test1531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1531");
        com.reservation_system.model.HeadLabCoordinator headLabCoordinator5 = new com.reservation_system.model.HeadLabCoordinator((int) 'a', "researcher", "Password1!", "researcher", false);
        java.lang.String str6 = headLabCoordinator5.getEmail();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Password1!" + "'", str6, "Password1!");
    }

    @Test
    public void test1532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1532");
        com.reservation_system.model.Student student5 = new com.reservation_system.model.Student((int) (byte) 1, "headlabcoordinator", "Student", "guest", false);
        java.lang.String str6 = student5.getUserType();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Student" + "'", str6, "Student");
    }

    @Test
    public void test1533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1533");
        com.reservation_system.model.Researcher researcher5 = new com.reservation_system.model.Researcher(0, "student", "", "student", false);
        boolean boolean6 = researcher5.isApproved();
        boolean boolean7 = researcher5.isApproved();
        java.lang.String str8 = researcher5.getEmail();
        java.lang.String str9 = researcher5.getPassword();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "student" + "'", str9, "student");
    }

    @Test
    public void test1534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1534");
        // The following exception was thrown during execution in test generation
        try {
            com.reservation_system.model.User user6 = com.reservation_system.patterns.factory.UserFactory.createUser("", 100, "Andrew", "Faculty", "Student", false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid user type: ");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1535");
        com.reservation_system.model.Faculty faculty5 = new com.reservation_system.model.Faculty(35, "Andrew", "guest", "", false);
    }

    @Test
    public void test1536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1536");
        com.reservation_system.model.LabManager labManager5 = new com.reservation_system.model.LabManager(35, "faculty", "student", "labmanager", false);
        java.lang.String str6 = labManager5.getPassword();
        labManager5.setApproved(false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "labmanager" + "'", str6, "labmanager");
    }

    @Test
    public void test1537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1537");
        com.reservation_system.model.User user6 = com.reservation_system.patterns.factory.UserFactory.createUser("student", (int) ' ', "headlabcoordinator", "student", "headlabcoordinator", false);
        java.lang.String str7 = user6.getPassword();
        org.junit.Assert.assertNotNull(user6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "headlabcoordinator" + "'", str7, "headlabcoordinator");
    }

    @Test
    public void test1538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1538");
        com.reservation_system.model.HeadLabCoordinator headLabCoordinator5 = new com.reservation_system.model.HeadLabCoordinator((int) (byte) 100, "Researcher", "Guest", "Password1!", false);
        java.lang.String str6 = headLabCoordinator5.getUserType();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "headlabcoordinator" + "'", str6, "headlabcoordinator");
    }

    @Test
    public void test1539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1539");
        com.reservation_system.model.Student student5 = new com.reservation_system.model.Student((int) (byte) 1, "headlabcoordinator", "Student", "guest", false);
        boolean boolean6 = student5.isApproved();
        java.lang.String str7 = student5.getPassword();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "guest" + "'", str7, "guest");
    }

    @Test
    public void test1540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1540");
        com.reservation_system.model.Student student5 = new com.reservation_system.model.Student((int) (byte) -1, "Researcher", "headlabcoordinator", "Andrew", true);
        student5.setApproved(true);
    }

    @Test
    public void test1541() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1541");
        com.reservation_system.model.HeadLabCoordinator headLabCoordinator5 = new com.reservation_system.model.HeadLabCoordinator(97, "hi!", "Password1!", "guest", true);
    }

    @Test
    public void test1542() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1542");
        com.reservation_system.model.HeadLabCoordinator headLabCoordinator5 = new com.reservation_system.model.HeadLabCoordinator((int) (byte) 10, "Faculty", "Andrew", "Password1!", false);
    }

    @Test
    public void test1543() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1543");
        com.reservation_system.model.LabManager labManager5 = new com.reservation_system.model.LabManager(0, "student", "Student", "faculty", true);
    }

    @Test
    public void test1544() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1544");
        com.reservation_system.model.User user6 = com.reservation_system.patterns.factory.UserFactory.createUser("labmanager", 97, "student", "labmanager", "Andrew", true);
        org.junit.Assert.assertNotNull(user6);
    }

    @Test
    public void test1545() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1545");
        com.reservation_system.model.Researcher researcher5 = new com.reservation_system.model.Researcher((-1), "labmanager", "andrew@example.com", "hi!", false);
        java.lang.String str6 = researcher5.getUserType();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Researcher" + "'", str6, "Researcher");
    }

    @Test
    public void test1546() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1546");
        com.reservation_system.model.LabManager labManager5 = new com.reservation_system.model.LabManager((int) 'a', "hi!", "faculty", "headlabcoordinator", false);
    }

    @Test
    public void test1547() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1547");
        com.reservation_system.model.LabManager labManager5 = new com.reservation_system.model.LabManager((int) 'a', "faculty", "researcher", "", true);
        boolean boolean6 = labManager5.requiresDepartmentApproval();
        java.lang.String str7 = labManager5.getUserType();
        java.lang.String str8 = labManager5.getName();
        java.lang.String str9 = labManager5.getEmail();
        java.lang.String str10 = labManager5.getUserType();
        java.lang.String str11 = labManager5.getUserType();
        boolean boolean12 = labManager5.isApproved();
        labManager5.setApproved(false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "labmanager" + "'", str7, "labmanager");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "faculty" + "'", str8, "faculty");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "researcher" + "'", str9, "researcher");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "labmanager" + "'", str10, "labmanager");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "labmanager" + "'", str11, "labmanager");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test1548() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1548");
        com.reservation_system.model.Faculty faculty5 = new com.reservation_system.model.Faculty((int) (byte) 1, "", "Password1!", "andrew@example.com", false);
        java.lang.String str6 = faculty5.getPassword();
        boolean boolean7 = faculty5.isApproved();
        boolean boolean8 = faculty5.requiresDepartmentApproval();
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test1549() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1549");
        com.reservation_system.model.Guest guest5 = new com.reservation_system.model.Guest(97, "andrew@example.com", "Faculty", "labmanager", false);
    }

    @Test
    public void test1550() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1550");
        com.reservation_system.model.Guest guest5 = new com.reservation_system.model.Guest((int) (short) 100, "Andrew", "", "Student", false);
        java.lang.String str6 = guest5.getUserType();
        int int7 = guest5.getID();
        boolean boolean8 = guest5.isApproved();
        java.lang.String str9 = guest5.getName();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Guest" + "'", str6, "Guest");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 100 + "'", int7 == 100);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Andrew" + "'", str9, "Andrew");
    }

    @Test
    public void test1551() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1551");
        com.reservation_system.model.LabManager labManager5 = new com.reservation_system.model.LabManager((int) (short) 1, "andrew@example.com", "", "Andrew", true);
        java.lang.String str6 = labManager5.getUserType();
        java.lang.String str7 = labManager5.getUserType();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "labmanager" + "'", str6, "labmanager");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "labmanager" + "'", str7, "labmanager");
    }

    @Test
    public void test1552() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1552");
        com.reservation_system.model.Researcher researcher5 = new com.reservation_system.model.Researcher((int) '#', "Password1!", "Researcher", "", true);
    }

    @Test
    public void test1553() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1553");
        com.reservation_system.model.HeadLabCoordinator headLabCoordinator5 = new com.reservation_system.model.HeadLabCoordinator(52, "Guest", "headlabcoordinator", "faculty", true);
        java.lang.String str6 = headLabCoordinator5.getUserType();
        java.lang.String str7 = headLabCoordinator5.getUserType();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "headlabcoordinator" + "'", str6, "headlabcoordinator");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "headlabcoordinator" + "'", str7, "headlabcoordinator");
    }

    @Test
    public void test1554() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1554");
        com.reservation_system.model.HeadLabCoordinator headLabCoordinator5 = new com.reservation_system.model.HeadLabCoordinator(35, "hi!", "Faculty", "Researcher", true);
        java.lang.String str6 = headLabCoordinator5.getUserType();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "headlabcoordinator" + "'", str6, "headlabcoordinator");
    }

    @Test
    public void test1555() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1555");
        com.reservation_system.model.Guest guest5 = new com.reservation_system.model.Guest(1, "headlabcoordinator", "Student", "andrew@example.com", false);
        java.lang.Class<?> wildcardClass6 = guest5.getClass();
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test1556() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1556");
        com.reservation_system.model.Guest guest5 = new com.reservation_system.model.Guest((int) '4', "andrew@example.com", "student", "student", false);
        guest5.setApproved(false);
        java.lang.String str8 = guest5.getUserType();
        guest5.setApproved(false);
        guest5.setApproved(false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Guest" + "'", str8, "Guest");
    }

    @Test
    public void test1557() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1557");
        com.reservation_system.model.HeadLabCoordinator headLabCoordinator5 = new com.reservation_system.model.HeadLabCoordinator((int) '#', "Password1!", "Researcher", "Student", true);
        int int6 = headLabCoordinator5.getID();
        java.lang.String str7 = headLabCoordinator5.getUserType();
        java.lang.String str8 = headLabCoordinator5.getUserType();
        java.lang.String str9 = headLabCoordinator5.getUserType();
        java.lang.String str10 = headLabCoordinator5.getEmail();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 35 + "'", int6 == 35);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "headlabcoordinator" + "'", str7, "headlabcoordinator");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "headlabcoordinator" + "'", str8, "headlabcoordinator");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "headlabcoordinator" + "'", str9, "headlabcoordinator");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Researcher" + "'", str10, "Researcher");
    }

    @Test
    public void test1558() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1558");
        com.reservation_system.model.Faculty faculty5 = new com.reservation_system.model.Faculty((int) '#', "Guest", "student", "Guest", false);
        java.lang.String str6 = faculty5.getUserType();
        java.lang.String str7 = faculty5.getPassword();
        java.lang.String str8 = faculty5.getPassword();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Faculty" + "'", str6, "Faculty");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Guest" + "'", str7, "Guest");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Guest" + "'", str8, "Guest");
    }

    @Test
    public void test1559() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1559");
        com.reservation_system.model.LabManager labManager5 = new com.reservation_system.model.LabManager((int) ' ', "Student", "student", "", true);
        int int6 = labManager5.getID();
        labManager5.setApproved(false);
        java.lang.String str9 = labManager5.getPassword();
        java.lang.String str10 = labManager5.getUserType();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 32 + "'", int6 == 32);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "labmanager" + "'", str10, "labmanager");
    }

    @Test
    public void test1560() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1560");
        com.reservation_system.model.HeadLabCoordinator headLabCoordinator5 = new com.reservation_system.model.HeadLabCoordinator(10, "Guest", "Student", "Researcher", true);
        java.lang.String str6 = headLabCoordinator5.getUserType();
        java.lang.String str7 = headLabCoordinator5.getUserType();
        java.lang.String str8 = headLabCoordinator5.getEmail();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "headlabcoordinator" + "'", str6, "headlabcoordinator");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "headlabcoordinator" + "'", str7, "headlabcoordinator");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Student" + "'", str8, "Student");
    }

    @Test
    public void test1561() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1561");
        com.reservation_system.model.LabManager labManager5 = new com.reservation_system.model.LabManager((int) '#', "student", "Guest", "Password1!", false);
        java.lang.Class<?> wildcardClass6 = labManager5.getClass();
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test1562() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1562");
        com.reservation_system.model.Student student5 = new com.reservation_system.model.Student((int) (byte) 0, "faculty", "Faculty", "", false);
    }

    @Test
    public void test1563() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1563");
        com.reservation_system.model.HeadLabCoordinator headLabCoordinator5 = new com.reservation_system.model.HeadLabCoordinator((int) (short) 100, "Student", "", "Researcher", false);
    }

    @Test
    public void test1564() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1564");
        com.reservation_system.model.Student student5 = new com.reservation_system.model.Student((int) (byte) -1, "student", "labmanager", "guest", false);
        java.lang.String str6 = student5.getUserType();
        java.lang.String str7 = student5.getUserType();
        java.lang.String str8 = student5.getName();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Student" + "'", str6, "Student");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Student" + "'", str7, "Student");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "student" + "'", str8, "student");
    }

    @Test
    public void test1565() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1565");
        com.reservation_system.model.LabManager labManager5 = new com.reservation_system.model.LabManager((-1), "Guest", "Guest", "researcher", true);
        java.lang.String str6 = labManager5.getUserType();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "labmanager" + "'", str6, "labmanager");
    }

    @Test
    public void test1566() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1566");
        com.reservation_system.model.Guest guest5 = new com.reservation_system.model.Guest(1, "", "student", "student", true);
        java.lang.String str6 = guest5.getUserType();
        java.lang.String str7 = guest5.getUserType();
        int int8 = guest5.getID();
        java.lang.String str9 = guest5.getUserType();
        java.lang.String str10 = guest5.getUserType();
        java.lang.String str11 = guest5.getUserType();
        java.lang.String str12 = guest5.getUserType();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Guest" + "'", str6, "Guest");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Guest" + "'", str7, "Guest");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Guest" + "'", str9, "Guest");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Guest" + "'", str10, "Guest");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Guest" + "'", str11, "Guest");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Guest" + "'", str12, "Guest");
    }

    @Test
    public void test1567() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1567");
        com.reservation_system.model.Faculty faculty5 = new com.reservation_system.model.Faculty(35, "andrew@example.com", "", "andrew@example.com", false);
    }

    @Test
    public void test1568() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1568");
        com.reservation_system.model.Guest guest5 = new com.reservation_system.model.Guest(52, "student", "labmanager", "faculty", false);
    }

    @Test
    public void test1569() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1569");
        com.reservation_system.model.HeadLabCoordinator headLabCoordinator5 = new com.reservation_system.model.HeadLabCoordinator((int) (short) 10, "", "Guest", "Researcher", false);
    }

    @Test
    public void test1570() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1570");
        com.reservation_system.model.Faculty faculty5 = new com.reservation_system.model.Faculty((int) ' ', "hi!", "headlabcoordinator", "hi!", true);
        java.lang.String str6 = faculty5.getEmail();
        boolean boolean7 = faculty5.requiresDepartmentApproval();
        java.lang.String str8 = faculty5.getUserType();
        java.lang.String str9 = faculty5.getPassword();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "headlabcoordinator" + "'", str6, "headlabcoordinator");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Faculty" + "'", str8, "Faculty");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
    }

    @Test
    public void test1571() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1571");
        com.reservation_system.model.Researcher researcher5 = new com.reservation_system.model.Researcher(0, "student", "", "student", false);
        java.lang.String str6 = researcher5.getPassword();
        java.lang.String str7 = researcher5.getUserType();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "student" + "'", str6, "student");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Researcher" + "'", str7, "Researcher");
    }

    @Test
    public void test1572() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1572");
        com.reservation_system.model.Faculty faculty5 = new com.reservation_system.model.Faculty((int) '4', "researcher", "researcher", "Researcher", true);
        java.lang.String str6 = faculty5.getUserType();
        boolean boolean7 = faculty5.isApproved();
        int int8 = faculty5.getID();
        java.lang.String str9 = faculty5.getPassword();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Faculty" + "'", str6, "Faculty");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 52 + "'", int8 == 52);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Researcher" + "'", str9, "Researcher");
    }

    @Test
    public void test1573() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1573");
        com.reservation_system.model.Student student5 = new com.reservation_system.model.Student((int) (short) 10, "guest", "labmanager", "", false);
        java.lang.String str6 = student5.getUserType();
        boolean boolean7 = student5.requiresDepartmentApproval();
        int int8 = student5.getID();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Student" + "'", str6, "Student");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 10 + "'", int8 == 10);
    }

    @Test
    public void test1574() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1574");
        com.reservation_system.model.Faculty faculty5 = new com.reservation_system.model.Faculty((int) '4', "researcher", "researcher", "Researcher", true);
        java.lang.String str6 = faculty5.getUserType();
        java.lang.String str7 = faculty5.getName();
        java.lang.String str8 = faculty5.getEmail();
        faculty5.setApproved(true);
        faculty5.setApproved(true);
        int int13 = faculty5.getID();
        int int14 = faculty5.getID();
        java.lang.String str15 = faculty5.getEmail();
        java.lang.String str16 = faculty5.getPassword();
        faculty5.setApproved(false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Faculty" + "'", str6, "Faculty");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "researcher" + "'", str7, "researcher");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "researcher" + "'", str8, "researcher");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 52 + "'", int13 == 52);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 52 + "'", int14 == 52);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "researcher" + "'", str15, "researcher");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Researcher" + "'", str16, "Researcher");
    }

    @Test
    public void test1575() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1575");
        com.reservation_system.model.Guest guest5 = new com.reservation_system.model.Guest(10, "Researcher", "Faculty", "student", true);
    }

    @Test
    public void test1576() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1576");
        com.reservation_system.model.HeadLabCoordinator headLabCoordinator5 = new com.reservation_system.model.HeadLabCoordinator((int) 'a', "researcher", "Password1!", "researcher", false);
        java.lang.String str6 = headLabCoordinator5.getUserType();
        boolean boolean7 = headLabCoordinator5.requiresDepartmentApproval();
        java.lang.String str8 = headLabCoordinator5.getUserType();
        boolean boolean9 = headLabCoordinator5.isApproved();
        java.lang.String str10 = headLabCoordinator5.getPassword();
        java.lang.String str11 = headLabCoordinator5.getName();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "headlabcoordinator" + "'", str6, "headlabcoordinator");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "headlabcoordinator" + "'", str8, "headlabcoordinator");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "researcher" + "'", str10, "researcher");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "researcher" + "'", str11, "researcher");
    }

    @Test
    public void test1577() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1577");
        com.reservation_system.model.Researcher researcher5 = new com.reservation_system.model.Researcher((int) (byte) 100, "headlabcoordinator", "student", "guest", true);
        researcher5.setApproved(false);
    }

    @Test
    public void test1578() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1578");
        com.reservation_system.model.Student student5 = new com.reservation_system.model.Student(0, "Andrew", "hi!", "", false);
        java.lang.String str6 = student5.getUserType();
        java.lang.String str7 = student5.getUserType();
        java.lang.String str8 = student5.getEmail();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Student" + "'", str6, "Student");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Student" + "'", str7, "Student");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
    }

    @Test
    public void test1579() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1579");
        com.reservation_system.model.Student student5 = new com.reservation_system.model.Student((int) (short) 100, "", "Andrew", "Researcher", false);
    }

    @Test
    public void test1580() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1580");
        com.reservation_system.model.User user6 = com.reservation_system.patterns.factory.UserFactory.createUser("Student", 100, "Researcher", "labmanager", "guest", false);
        user6.setApproved(false);
        java.lang.String str9 = user6.getEmail();
        org.junit.Assert.assertNotNull(user6);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "labmanager" + "'", str9, "labmanager");
    }

    @Test
    public void test1581() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1581");
        com.reservation_system.model.HeadLabCoordinator headLabCoordinator5 = new com.reservation_system.model.HeadLabCoordinator(100, "student", "faculty", "Researcher", true);
        java.lang.String str6 = headLabCoordinator5.getUserType();
        java.lang.String str7 = headLabCoordinator5.getUserType();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "headlabcoordinator" + "'", str6, "headlabcoordinator");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "headlabcoordinator" + "'", str7, "headlabcoordinator");
    }

    @Test
    public void test1582() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1582");
        com.reservation_system.model.User user6 = com.reservation_system.patterns.factory.UserFactory.createUser("headlabcoordinator", (int) '4', "student", "student", "labmanager", true);
        java.lang.String str7 = user6.getEmail();
        org.junit.Assert.assertNotNull(user6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "student" + "'", str7, "student");
    }

    @Test
    public void test1583() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1583");
        com.reservation_system.model.Faculty faculty5 = new com.reservation_system.model.Faculty((int) (byte) 1, "", "Password1!", "andrew@example.com", false);
        java.lang.String str6 = faculty5.getPassword();
        java.lang.String str7 = faculty5.getUserType();
        java.lang.String str8 = faculty5.getPassword();
        boolean boolean9 = faculty5.isApproved();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Faculty" + "'", str7, "Faculty");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test1584() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1584");
        com.reservation_system.model.Faculty faculty5 = new com.reservation_system.model.Faculty(10, "hi!", "", "guest", false);
        faculty5.setApproved(true);
        java.lang.String str8 = faculty5.getUserType();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Faculty" + "'", str8, "Faculty");
    }

    @Test
    public void test1585() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1585");
        com.reservation_system.model.Faculty faculty5 = new com.reservation_system.model.Faculty((int) (short) 1, "Researcher", "faculty", "Password1!", false);
    }

    @Test
    public void test1586() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1586");
        com.reservation_system.model.User user6 = com.reservation_system.patterns.factory.UserFactory.createUser("Student", 52, "headlabcoordinator", "Password1!", "", true);
        boolean boolean7 = user6.isApproved();
        org.junit.Assert.assertNotNull(user6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test1587() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1587");
        com.reservation_system.model.Faculty faculty5 = new com.reservation_system.model.Faculty((int) (byte) 0, "guest", "guest", "headlabcoordinator", true);
        java.lang.String str6 = faculty5.getName();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "guest" + "'", str6, "guest");
    }

    @Test
    public void test1588() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1588");
        com.reservation_system.model.Guest guest5 = new com.reservation_system.model.Guest(10, "student", "student", "faculty", true);
    }

    @Test
    public void test1589() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1589");
        com.reservation_system.model.Researcher researcher5 = new com.reservation_system.model.Researcher((int) (byte) 0, "Guest", "guest", "", true);
    }

    @Test
    public void test1590() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1590");
        com.reservation_system.model.Student student5 = new com.reservation_system.model.Student(100, "Andrew", "", "Faculty", true);
        java.lang.String str6 = student5.getUserType();
        java.lang.String str7 = student5.getUserType();
        student5.setApproved(true);
        int int10 = student5.getID();
        boolean boolean11 = student5.isApproved();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Student" + "'", str6, "Student");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Student" + "'", str7, "Student");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 100 + "'", int10 == 100);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test1591() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1591");
        com.reservation_system.model.User user6 = com.reservation_system.patterns.factory.UserFactory.createUser("Researcher", (int) (byte) -1, "student", "Guest", "Password1!", true);
        java.lang.String str7 = user6.getName();
        boolean boolean8 = user6.requiresDepartmentApproval();
        org.junit.Assert.assertNotNull(user6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "student" + "'", str7, "student");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test1592() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1592");
        com.reservation_system.model.HeadLabCoordinator headLabCoordinator5 = new com.reservation_system.model.HeadLabCoordinator((int) (short) 1, "andrew@example.com", "", "guest", true);
    }

    @Test
    public void test1593() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1593");
        com.reservation_system.model.Researcher researcher5 = new com.reservation_system.model.Researcher(32, "labmanager", "Password1!", "guest", true);
        researcher5.setApproved(false);
        java.lang.String str8 = researcher5.getUserType();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Researcher" + "'", str8, "Researcher");
    }

    @Test
    public void test1594() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1594");
        com.reservation_system.model.Researcher researcher5 = new com.reservation_system.model.Researcher((int) (short) 100, "labmanager", "Student", "researcher", true);
    }

    @Test
    public void test1595() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1595");
        com.reservation_system.model.Faculty faculty5 = new com.reservation_system.model.Faculty(10, "hi!", "", "guest", false);
        java.lang.String str6 = faculty5.getUserType();
        boolean boolean7 = faculty5.requiresDepartmentApproval();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Faculty" + "'", str6, "Faculty");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test1596() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1596");
        com.reservation_system.model.HeadLabCoordinator headLabCoordinator5 = new com.reservation_system.model.HeadLabCoordinator((int) 'a', "researcher", "Password1!", "researcher", false);
        java.lang.String str6 = headLabCoordinator5.getUserType();
        boolean boolean7 = headLabCoordinator5.requiresDepartmentApproval();
        java.lang.String str8 = headLabCoordinator5.getUserType();
        boolean boolean9 = headLabCoordinator5.isApproved();
        java.lang.String str10 = headLabCoordinator5.getUserType();
        java.lang.String str11 = headLabCoordinator5.getUserType();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "headlabcoordinator" + "'", str6, "headlabcoordinator");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "headlabcoordinator" + "'", str8, "headlabcoordinator");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "headlabcoordinator" + "'", str10, "headlabcoordinator");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "headlabcoordinator" + "'", str11, "headlabcoordinator");
    }

    @Test
    public void test1597() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1597");
        com.reservation_system.model.LabManager labManager5 = new com.reservation_system.model.LabManager(97, "", "Student", "Andrew", false);
        java.lang.String str6 = labManager5.getName();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
    }

    @Test
    public void test1598() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1598");
        com.reservation_system.model.Researcher researcher5 = new com.reservation_system.model.Researcher(10, "Student", "Password1!", "Faculty", false);
    }

    @Test
    public void test1599() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1599");
        com.reservation_system.model.Student student5 = new com.reservation_system.model.Student((int) (byte) 1, "headlabcoordinator", "Student", "guest", false);
        boolean boolean6 = student5.isApproved();
        boolean boolean7 = student5.requiresDepartmentApproval();
        java.lang.String str8 = student5.getUserType();
        boolean boolean9 = student5.isApproved();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Student" + "'", str8, "Student");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test1600() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1600");
        com.reservation_system.model.Student student5 = new com.reservation_system.model.Student((int) (short) 10, "guest", "labmanager", "", false);
        java.lang.String str6 = student5.getEmail();
        java.lang.String str7 = student5.getEmail();
        java.lang.String str8 = student5.getEmail();
        boolean boolean9 = student5.requiresDepartmentApproval();
        java.lang.String str10 = student5.getUserType();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "labmanager" + "'", str6, "labmanager");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "labmanager" + "'", str7, "labmanager");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "labmanager" + "'", str8, "labmanager");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Student" + "'", str10, "Student");
    }

    @Test
    public void test1601() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1601");
        com.reservation_system.model.HeadLabCoordinator headLabCoordinator5 = new com.reservation_system.model.HeadLabCoordinator((int) ' ', "faculty", "labmanager", "faculty", false);
    }

    @Test
    public void test1602() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1602");
        com.reservation_system.model.Guest guest5 = new com.reservation_system.model.Guest((int) (byte) 1, "researcher", "guest", "guest", true);
        java.lang.String str6 = guest5.getUserType();
        java.lang.String str7 = guest5.getUserType();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Guest" + "'", str6, "Guest");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Guest" + "'", str7, "Guest");
    }

    @Test
    public void test1603() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1603");
        com.reservation_system.model.LabManager labManager5 = new com.reservation_system.model.LabManager((int) (byte) 1, "hi!", "Andrew", "Student", false);
    }

    @Test
    public void test1604() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1604");
        com.reservation_system.model.LabManager labManager5 = new com.reservation_system.model.LabManager((-1), "Researcher", "Password1!", "labmanager", true);
        java.lang.String str6 = labManager5.getEmail();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Password1!" + "'", str6, "Password1!");
    }

    @Test
    public void test1605() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1605");
        com.reservation_system.model.Researcher researcher5 = new com.reservation_system.model.Researcher(0, "student", "", "student", false);
        java.lang.String str6 = researcher5.getUserType();
        java.lang.String str7 = researcher5.getUserType();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Researcher" + "'", str6, "Researcher");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Researcher" + "'", str7, "Researcher");
    }

    @Test
    public void test1606() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1606");
        com.reservation_system.model.HeadLabCoordinator headLabCoordinator5 = new com.reservation_system.model.HeadLabCoordinator(32, "Researcher", "Faculty", "", false);
        java.lang.String str6 = headLabCoordinator5.getUserType();
        int int7 = headLabCoordinator5.getID();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "headlabcoordinator" + "'", str6, "headlabcoordinator");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 32 + "'", int7 == 32);
    }

    @Test
    public void test1607() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1607");
        com.reservation_system.model.HeadLabCoordinator headLabCoordinator5 = new com.reservation_system.model.HeadLabCoordinator((int) (short) 1, "headlabcoordinator", "andrew@example.com", "Student", false);
        java.lang.String str6 = headLabCoordinator5.getUserType();
        java.lang.String str7 = headLabCoordinator5.getEmail();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "headlabcoordinator" + "'", str6, "headlabcoordinator");
    }

    @Test
    public void test1608() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1608");
        com.reservation_system.model.HeadLabCoordinator headLabCoordinator5 = new com.reservation_system.model.HeadLabCoordinator((int) (byte) 100, "headlabcoordinator", "", "Password1!", false);
        java.lang.String str6 = headLabCoordinator5.getUserType();
        java.lang.Class<?> wildcardClass7 = headLabCoordinator5.getClass();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "headlabcoordinator" + "'", str6, "headlabcoordinator");
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test1609() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1609");
        com.reservation_system.model.HeadLabCoordinator headLabCoordinator5 = new com.reservation_system.model.HeadLabCoordinator((int) 'a', "researcher", "Password1!", "researcher", false);
        java.lang.String str6 = headLabCoordinator5.getUserType();
        headLabCoordinator5.setApproved(false);
        java.lang.String str9 = headLabCoordinator5.getUserType();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "headlabcoordinator" + "'", str6, "headlabcoordinator");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "headlabcoordinator" + "'", str9, "headlabcoordinator");
    }

    @Test
    public void test1610() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1610");
        com.reservation_system.model.Researcher researcher5 = new com.reservation_system.model.Researcher(52, "headlabcoordinator", "", "Student", false);
        boolean boolean6 = researcher5.isApproved();
        researcher5.setApproved(true);
        java.lang.String str9 = researcher5.getUserType();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Researcher" + "'", str9, "Researcher");
    }

    @Test
    public void test1611() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1611");
        // The following exception was thrown during execution in test generation
        try {
            com.reservation_system.model.User user6 = com.reservation_system.patterns.factory.UserFactory.createUser("hi!", 32, "Password1!", "headlabcoordinator", "andrew@example.com", false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid user type: hi!");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1612() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1612");
        com.reservation_system.model.LabManager labManager5 = new com.reservation_system.model.LabManager((int) ' ', "Student", "student", "", true);
        int int6 = labManager5.getID();
        labManager5.setApproved(false);
        java.lang.String str9 = labManager5.getUserType();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 32 + "'", int6 == 32);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "labmanager" + "'", str9, "labmanager");
    }

    @Test
    public void test1613() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1613");
        com.reservation_system.model.LabManager labManager5 = new com.reservation_system.model.LabManager(10, "guest", "hi!", "Researcher", false);
        java.lang.String str6 = labManager5.getUserType();
        boolean boolean7 = labManager5.requiresDepartmentApproval();
        java.lang.String str8 = labManager5.getEmail();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "labmanager" + "'", str6, "labmanager");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
    }

    @Test
    public void test1614() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1614");
        com.reservation_system.model.Faculty faculty5 = new com.reservation_system.model.Faculty((int) (short) -1, "hi!", "Student", "headlabcoordinator", false);
        faculty5.setApproved(true);
        java.lang.String str8 = faculty5.getUserType();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Faculty" + "'", str8, "Faculty");
    }

    @Test
    public void test1615() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1615");
        com.reservation_system.model.Student student5 = new com.reservation_system.model.Student(97, "andrew@example.com", "andrew@example.com", "Faculty", true);
        java.lang.String str6 = student5.getUserType();
        java.lang.String str7 = student5.getUserType();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Student" + "'", str6, "Student");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Student" + "'", str7, "Student");
    }

    @Test
    public void test1616() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1616");
        com.reservation_system.model.Faculty faculty5 = new com.reservation_system.model.Faculty(52, "hi!", "Andrew", "", false);
    }

    @Test
    public void test1617() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1617");
        com.reservation_system.model.Faculty faculty5 = new com.reservation_system.model.Faculty(100, "hi!", "Password1!", "", false);
        java.lang.String str6 = faculty5.getUserType();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Faculty" + "'", str6, "Faculty");
    }

    @Test
    public void test1618() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1618");
        com.reservation_system.model.Researcher researcher5 = new com.reservation_system.model.Researcher(52, "Researcher", "Faculty", "headlabcoordinator", true);
        boolean boolean6 = researcher5.isApproved();
        java.lang.String str7 = researcher5.getPassword();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "headlabcoordinator" + "'", str7, "headlabcoordinator");
    }

    @Test
    public void test1619() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1619");
        com.reservation_system.model.Researcher researcher5 = new com.reservation_system.model.Researcher((int) (byte) 10, "Faculty", "Faculty", "Researcher", true);
        int int6 = researcher5.getID();
        java.lang.String str7 = researcher5.getUserType();
        java.lang.String str8 = researcher5.getUserType();
        java.lang.String str9 = researcher5.getUserType();
        java.lang.String str10 = researcher5.getUserType();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Researcher" + "'", str7, "Researcher");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Researcher" + "'", str8, "Researcher");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Researcher" + "'", str9, "Researcher");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Researcher" + "'", str10, "Researcher");
    }

    @Test
    public void test1620() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1620");
        com.reservation_system.model.User user6 = com.reservation_system.patterns.factory.UserFactory.createUser("Student", (int) ' ', "Student", "", "faculty", true);
        java.lang.Class<?> wildcardClass7 = user6.getClass();
        org.junit.Assert.assertNotNull(user6);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test1621() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1621");
        com.reservation_system.model.HeadLabCoordinator headLabCoordinator5 = new com.reservation_system.model.HeadLabCoordinator((int) (short) -1, "Student", "faculty", "Student", false);
    }

    @Test
    public void test1622() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1622");
        com.reservation_system.model.Guest guest5 = new com.reservation_system.model.Guest((int) (byte) 10, "", "Guest", "andrew@example.com", false);
    }

    @Test
    public void test1623() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1623");
        com.reservation_system.model.Student student5 = new com.reservation_system.model.Student((int) (short) 0, "labmanager", "Researcher", "Student", true);
        java.lang.String str6 = student5.getUserType();
        java.lang.Class<?> wildcardClass7 = student5.getClass();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Student" + "'", str6, "Student");
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test1624() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1624");
        com.reservation_system.model.Researcher researcher5 = new com.reservation_system.model.Researcher(100, "Guest", "researcher", "faculty", false);
        java.lang.String str6 = researcher5.getUserType();
        java.lang.String str7 = researcher5.getName();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Researcher" + "'", str6, "Researcher");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Guest" + "'", str7, "Guest");
    }

    @Test
    public void test1625() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1625");
        com.reservation_system.model.Faculty faculty5 = new com.reservation_system.model.Faculty((int) 'a', "hi!", "student", "labmanager", true);
    }

    @Test
    public void test1626() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1626");
        com.reservation_system.model.Guest guest5 = new com.reservation_system.model.Guest(0, "guest", "student", "researcher", false);
        java.lang.String str6 = guest5.getPassword();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "researcher" + "'", str6, "researcher");
    }

    @Test
    public void test1627() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1627");
        com.reservation_system.model.Student student5 = new com.reservation_system.model.Student(100, "Password1!", "", "faculty", false);
    }

    @Test
    public void test1628() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1628");
        com.reservation_system.model.User user6 = com.reservation_system.patterns.factory.UserFactory.createUser("Researcher", (-1), "Guest", "headlabcoordinator", "Researcher", false);
        user6.setApproved(false);
        org.junit.Assert.assertNotNull(user6);
    }

    @Test
    public void test1629() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1629");
        com.reservation_system.model.LabManager labManager5 = new com.reservation_system.model.LabManager((int) 'a', "faculty", "researcher", "", true);
        boolean boolean6 = labManager5.requiresDepartmentApproval();
        java.lang.String str7 = labManager5.getUserType();
        java.lang.String str8 = labManager5.getPassword();
        labManager5.setApproved(false);
        boolean boolean11 = labManager5.isApproved();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "labmanager" + "'", str7, "labmanager");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test1630() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1630");
        com.reservation_system.model.User user6 = com.reservation_system.patterns.factory.UserFactory.createUser("Student", (int) ' ', "Password1!", "Student", "Student", false);
        org.junit.Assert.assertNotNull(user6);
    }

    @Test
    public void test1631() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1631");
        com.reservation_system.model.Researcher researcher5 = new com.reservation_system.model.Researcher((int) ' ', "faculty", "faculty", "Student", true);
        boolean boolean6 = researcher5.requiresDepartmentApproval();
        java.lang.String str7 = researcher5.getEmail();
        int int8 = researcher5.getID();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "faculty" + "'", str7, "faculty");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 32 + "'", int8 == 32);
    }

    @Test
    public void test1632() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1632");
        com.reservation_system.model.Student student5 = new com.reservation_system.model.Student((int) '#', "andrew@example.com", "guest", "Guest", false);
        java.lang.String str6 = student5.getUserType();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Student" + "'", str6, "Student");
    }

    @Test
    public void test1633() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1633");
        com.reservation_system.model.LabManager labManager5 = new com.reservation_system.model.LabManager(100, "Guest", "labmanager", "labmanager", true);
        boolean boolean6 = labManager5.isApproved();
        java.lang.String str7 = labManager5.getPassword();
        java.lang.String str8 = labManager5.getEmail();
        labManager5.setApproved(true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "labmanager" + "'", str7, "labmanager");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "labmanager" + "'", str8, "labmanager");
    }

    @Test
    public void test1634() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1634");
        com.reservation_system.model.Faculty faculty5 = new com.reservation_system.model.Faculty(97, "", "Faculty", "Faculty", true);
        java.lang.String str6 = faculty5.getUserType();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Faculty" + "'", str6, "Faculty");
    }

    @Test
    public void test1635() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1635");
        com.reservation_system.model.Researcher researcher5 = new com.reservation_system.model.Researcher(32, "andrew@example.com", "Researcher", "Student", false);
        researcher5.setApproved(false);
        researcher5.setApproved(true);
    }

    @Test
    public void test1636() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1636");
        com.reservation_system.model.Guest guest5 = new com.reservation_system.model.Guest(52, "headlabcoordinator", "", "andrew@example.com", true);
        java.lang.String str6 = guest5.getName();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "headlabcoordinator" + "'", str6, "headlabcoordinator");
    }

    @Test
    public void test1637() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1637");
        com.reservation_system.model.Faculty faculty5 = new com.reservation_system.model.Faculty((int) (short) 100, "Faculty", "guest", "", false);
        boolean boolean6 = faculty5.requiresDepartmentApproval();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test1638() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1638");
        com.reservation_system.model.LabManager labManager5 = new com.reservation_system.model.LabManager(97, "andrew@example.com", "Guest", "guest", true);
    }

    @Test
    public void test1639() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1639");
        com.reservation_system.model.Student student5 = new com.reservation_system.model.Student((int) (short) 100, "guest", "Faculty", "headlabcoordinator", true);
    }

    @Test
    public void test1640() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1640");
        com.reservation_system.model.HeadLabCoordinator headLabCoordinator5 = new com.reservation_system.model.HeadLabCoordinator((int) 'a', "researcher", "Password1!", "researcher", false);
        java.lang.String str6 = headLabCoordinator5.getUserType();
        boolean boolean7 = headLabCoordinator5.requiresDepartmentApproval();
        headLabCoordinator5.setApproved(true);
        int int10 = headLabCoordinator5.getID();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "headlabcoordinator" + "'", str6, "headlabcoordinator");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 97 + "'", int10 == 97);
    }

    @Test
    public void test1641() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1641");
        com.reservation_system.model.Faculty faculty5 = new com.reservation_system.model.Faculty(0, "hi!", "researcher", "researcher", false);
        java.lang.String str6 = faculty5.getUserType();
        java.lang.String str7 = faculty5.getName();
        boolean boolean8 = faculty5.requiresDepartmentApproval();
        java.lang.String str9 = faculty5.getUserType();
        boolean boolean10 = faculty5.isApproved();
        faculty5.setApproved(true);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Faculty" + "'", str6, "Faculty");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Faculty" + "'", str9, "Faculty");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test1642() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1642");
        com.reservation_system.model.Researcher researcher5 = new com.reservation_system.model.Researcher(0, "hi!", "labmanager", "Andrew", true);
    }

    @Test
    public void test1643() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1643");
        com.reservation_system.model.HeadLabCoordinator headLabCoordinator5 = new com.reservation_system.model.HeadLabCoordinator((int) (byte) 100, "headlabcoordinator", "", "Password1!", false);
        java.lang.String str6 = headLabCoordinator5.getUserType();
        boolean boolean7 = headLabCoordinator5.requiresDepartmentApproval();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "headlabcoordinator" + "'", str6, "headlabcoordinator");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test1644() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1644");
        com.reservation_system.model.LabManager labManager5 = new com.reservation_system.model.LabManager((int) (short) 10, "headlabcoordinator", "Andrew", "guest", true);
        java.lang.String str6 = labManager5.getPassword();
        boolean boolean7 = labManager5.requiresDepartmentApproval();
        java.lang.String str8 = labManager5.getUserType();
        java.lang.String str9 = labManager5.getPassword();
        java.lang.Class<?> wildcardClass10 = labManager5.getClass();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "guest" + "'", str6, "guest");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "labmanager" + "'", str8, "labmanager");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "guest" + "'", str9, "guest");
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test1645() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1645");
        com.reservation_system.model.Student student5 = new com.reservation_system.model.Student(1, "guest", "hi!", "student", false);
        java.lang.String str6 = student5.getUserType();
        java.lang.String str7 = student5.getPassword();
        java.lang.String str8 = student5.getPassword();
        java.lang.String str9 = student5.getUserType();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Student" + "'", str6, "Student");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "student" + "'", str7, "student");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "student" + "'", str8, "student");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Student" + "'", str9, "Student");
    }

    @Test
    public void test1646() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1646");
        com.reservation_system.model.Faculty faculty5 = new com.reservation_system.model.Faculty(0, "Researcher", "guest", "hi!", true);
        boolean boolean6 = faculty5.requiresDepartmentApproval();
        boolean boolean7 = faculty5.isApproved();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test1647() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1647");
        com.reservation_system.model.HeadLabCoordinator headLabCoordinator5 = new com.reservation_system.model.HeadLabCoordinator(0, "researcher", "researcher", "headlabcoordinator", true);
        int int6 = headLabCoordinator5.getID();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test1648() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1648");
        com.reservation_system.model.User user6 = com.reservation_system.patterns.factory.UserFactory.createUser("headlabcoordinator", (-1), "guest", "Student", "Guest", false);
        java.lang.String str7 = user6.getPassword();
        org.junit.Assert.assertNotNull(user6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Guest" + "'", str7, "Guest");
    }

    @Test
    public void test1649() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1649");
        com.reservation_system.model.Guest guest5 = new com.reservation_system.model.Guest((int) (short) -1, "", "student", "headlabcoordinator", false);
    }

    @Test
    public void test1650() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1650");
        com.reservation_system.model.HeadLabCoordinator headLabCoordinator5 = new com.reservation_system.model.HeadLabCoordinator(35, "Faculty", "labmanager", "Guest", false);
    }

    @Test
    public void test1651() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1651");
        com.reservation_system.model.Student student5 = new com.reservation_system.model.Student(100, "andrew@example.com", "", "andrew@example.com", false);
    }

    @Test
    public void test1652() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1652");
        com.reservation_system.model.LabManager labManager5 = new com.reservation_system.model.LabManager(32, "Student", "researcher", "headlabcoordinator", false);
        java.lang.String str6 = labManager5.getUserType();
        java.lang.String str7 = labManager5.getUserType();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "labmanager" + "'", str6, "labmanager");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "labmanager" + "'", str7, "labmanager");
    }

    @Test
    public void test1653() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1653");
        com.reservation_system.model.Faculty faculty5 = new com.reservation_system.model.Faculty(10, "guest", "headlabcoordinator", "Andrew", false);
        boolean boolean6 = faculty5.requiresDepartmentApproval();
        java.lang.String str7 = faculty5.getName();
        java.lang.String str8 = faculty5.getName();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "guest" + "'", str7, "guest");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "guest" + "'", str8, "guest");
    }

    @Test
    public void test1654() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1654");
        com.reservation_system.model.Student student5 = new com.reservation_system.model.Student(32, "", "labmanager", "faculty", true);
    }

    @Test
    public void test1655() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1655");
        com.reservation_system.model.HeadLabCoordinator headLabCoordinator5 = new com.reservation_system.model.HeadLabCoordinator((int) 'a', "Password1!", "Researcher", "headlabcoordinator", true);
        java.lang.String str6 = headLabCoordinator5.getUserType();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "headlabcoordinator" + "'", str6, "headlabcoordinator");
    }

    @Test
    public void test1656() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1656");
        com.reservation_system.model.LabManager labManager5 = new com.reservation_system.model.LabManager((int) ' ', "researcher", "Researcher", "hi!", false);
        int int6 = labManager5.getID();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 32 + "'", int6 == 32);
    }

    @Test
    public void test1657() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1657");
        com.reservation_system.model.HeadLabCoordinator headLabCoordinator5 = new com.reservation_system.model.HeadLabCoordinator(100, "headlabcoordinator", "", "student", false);
        boolean boolean6 = headLabCoordinator5.requiresDepartmentApproval();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test1658() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1658");
        com.reservation_system.model.Guest guest5 = new com.reservation_system.model.Guest(1, "", "student", "student", true);
        guest5.setApproved(true);
        java.lang.String str8 = guest5.getUserType();
        boolean boolean9 = guest5.requiresDepartmentApproval();
        java.lang.String str10 = guest5.getUserType();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Guest" + "'", str8, "Guest");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Guest" + "'", str10, "Guest");
    }

    @Test
    public void test1659() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1659");
        com.reservation_system.model.Guest guest5 = new com.reservation_system.model.Guest(0, "Faculty", "hi!", "faculty", false);
        java.lang.String str6 = guest5.getName();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Faculty" + "'", str6, "Faculty");
    }

    @Test
    public void test1660() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1660");
        com.reservation_system.model.User user6 = com.reservation_system.patterns.factory.UserFactory.createUser("faculty", (int) 'a', "Password1!", "", "", true);
        user6.setApproved(false);
        user6.setApproved(true);
        java.lang.String str11 = user6.getPassword();
        org.junit.Assert.assertNotNull(user6);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
    }

    @Test
    public void test1661() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1661");
        com.reservation_system.model.Researcher researcher5 = new com.reservation_system.model.Researcher(0, "andrew@example.com", "", "researcher", false);
        boolean boolean6 = researcher5.requiresDepartmentApproval();
        boolean boolean7 = researcher5.isApproved();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test1662() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1662");
        com.reservation_system.model.HeadLabCoordinator headLabCoordinator5 = new com.reservation_system.model.HeadLabCoordinator((int) 'a', "Password1!", "Faculty", "andrew@example.com", true);
        int int6 = headLabCoordinator5.getID();
        java.lang.String str7 = headLabCoordinator5.getPassword();
        java.lang.Class<?> wildcardClass8 = headLabCoordinator5.getClass();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 97 + "'", int6 == 97);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test1663() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1663");
        com.reservation_system.model.Faculty faculty5 = new com.reservation_system.model.Faculty((int) (short) 1, "Student", "andrew@example.com", "Researcher", false);
        java.lang.Class<?> wildcardClass6 = faculty5.getClass();
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test1664() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1664");
        com.reservation_system.model.HeadLabCoordinator headLabCoordinator5 = new com.reservation_system.model.HeadLabCoordinator(97, "Faculty", "headlabcoordinator", "Faculty", true);
    }

    @Test
    public void test1665() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1665");
        com.reservation_system.model.Researcher researcher5 = new com.reservation_system.model.Researcher((int) (byte) 100, "Researcher", "Researcher", "Andrew", false);
    }

    @Test
    public void test1666() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1666");
        com.reservation_system.model.Student student5 = new com.reservation_system.model.Student((int) (short) -1, "Guest", "", "guest", true);
        java.lang.String str6 = student5.getName();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Guest" + "'", str6, "Guest");
    }

    @Test
    public void test1667() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1667");
        com.reservation_system.model.Researcher researcher5 = new com.reservation_system.model.Researcher(100, "Guest", "", "hi!", true);
        int int6 = researcher5.getID();
        java.lang.String str7 = researcher5.getUserType();
        int int8 = researcher5.getID();
        java.lang.String str9 = researcher5.getUserType();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Researcher" + "'", str7, "Researcher");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8 == 100);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Researcher" + "'", str9, "Researcher");
    }

    @Test
    public void test1668() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1668");
        com.reservation_system.model.User user6 = com.reservation_system.patterns.factory.UserFactory.createUser("Researcher", (int) ' ', "researcher", "Student", "faculty", false);
        org.junit.Assert.assertNotNull(user6);
    }

    @Test
    public void test1669() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1669");
        // The following exception was thrown during execution in test generation
        try {
            com.reservation_system.model.User user6 = com.reservation_system.patterns.factory.UserFactory.createUser("hi!", 10, "Researcher", "Faculty", "student", true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid user type: hi!");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1670() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1670");
        com.reservation_system.model.HeadLabCoordinator headLabCoordinator5 = new com.reservation_system.model.HeadLabCoordinator((int) (short) 1, "student", "Student", "labmanager", false);
        java.lang.String str6 = headLabCoordinator5.getUserType();
        boolean boolean7 = headLabCoordinator5.isApproved();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "headlabcoordinator" + "'", str6, "headlabcoordinator");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test1671() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1671");
        com.reservation_system.model.Student student5 = new com.reservation_system.model.Student((int) 'a', "Guest", "student", "Student", false);
    }

    @Test
    public void test1672() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1672");
        com.reservation_system.model.Student student5 = new com.reservation_system.model.Student((-1), "andrew@example.com", "", "", true);
        boolean boolean6 = student5.requiresDepartmentApproval();
        boolean boolean7 = student5.requiresDepartmentApproval();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test1673() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1673");
        com.reservation_system.model.HeadLabCoordinator headLabCoordinator5 = new com.reservation_system.model.HeadLabCoordinator(10, "researcher", "hi!", "faculty", false);
    }

    @Test
    public void test1674() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1674");
        com.reservation_system.model.Faculty faculty5 = new com.reservation_system.model.Faculty(52, "labmanager", "Faculty", "headlabcoordinator", true);
    }

    @Test
    public void test1675() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1675");
        com.reservation_system.model.HeadLabCoordinator headLabCoordinator5 = new com.reservation_system.model.HeadLabCoordinator((int) 'a', "researcher", "Password1!", "researcher", false);
        java.lang.String str6 = headLabCoordinator5.getUserType();
        java.lang.String str7 = headLabCoordinator5.getUserType();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "headlabcoordinator" + "'", str6, "headlabcoordinator");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "headlabcoordinator" + "'", str7, "headlabcoordinator");
    }

    @Test
    public void test1676() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1676");
        com.reservation_system.model.LabManager labManager5 = new com.reservation_system.model.LabManager((int) (short) 10, "headlabcoordinator", "Andrew", "guest", true);
        java.lang.String str6 = labManager5.getPassword();
        boolean boolean7 = labManager5.requiresDepartmentApproval();
        java.lang.String str8 = labManager5.getUserType();
        java.lang.String str9 = labManager5.getEmail();
        java.lang.String str10 = labManager5.getUserType();
        java.lang.String str11 = labManager5.getEmail();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "guest" + "'", str6, "guest");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "labmanager" + "'", str8, "labmanager");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Andrew" + "'", str9, "Andrew");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "labmanager" + "'", str10, "labmanager");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Andrew" + "'", str11, "Andrew");
    }

    @Test
    public void test1677() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1677");
        com.reservation_system.model.LabManager labManager5 = new com.reservation_system.model.LabManager(1, "guest", "researcher", "Faculty", false);
        java.lang.String str6 = labManager5.getName();
        java.lang.Class<?> wildcardClass7 = labManager5.getClass();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "guest" + "'", str6, "guest");
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test1678() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1678");
        com.reservation_system.model.User user6 = com.reservation_system.patterns.factory.UserFactory.createUser("student", 35, "headlabcoordinator", "Faculty", "Guest", true);
        java.lang.String str7 = user6.getEmail();
        org.junit.Assert.assertNotNull(user6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Faculty" + "'", str7, "Faculty");
    }

    @Test
    public void test1679() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1679");
        com.reservation_system.model.User user6 = com.reservation_system.patterns.factory.UserFactory.createUser("student", 97, "Student", "researcher", "labmanager", false);
        java.lang.String str7 = user6.getName();
        org.junit.Assert.assertNotNull(user6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Student" + "'", str7, "Student");
    }

    @Test
    public void test1680() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1680");
        com.reservation_system.model.Faculty faculty5 = new com.reservation_system.model.Faculty((int) (short) 10, "Student", "Andrew", "headlabcoordinator", false);
    }

    @Test
    public void test1681() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1681");
        com.reservation_system.model.Student student5 = new com.reservation_system.model.Student((int) (short) -1, "Guest", "", "guest", true);
        java.lang.String str6 = student5.getUserType();
        java.lang.String str7 = student5.getUserType();
        java.lang.String str8 = student5.getPassword();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Student" + "'", str6, "Student");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Student" + "'", str7, "Student");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "guest" + "'", str8, "guest");
    }

    @Test
    public void test1682() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1682");
        com.reservation_system.model.Guest guest5 = new com.reservation_system.model.Guest((int) (short) 1, "faculty", "Student", "Faculty", true);
        java.lang.String str6 = guest5.getUserType();
        java.lang.String str7 = guest5.getName();
        boolean boolean8 = guest5.requiresDepartmentApproval();
        boolean boolean9 = guest5.requiresDepartmentApproval();
        java.lang.String str10 = guest5.getUserType();
        java.lang.String str11 = guest5.getUserType();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Guest" + "'", str6, "Guest");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "faculty" + "'", str7, "faculty");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Guest" + "'", str10, "Guest");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Guest" + "'", str11, "Guest");
    }

    @Test
    public void test1683() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1683");
        com.reservation_system.model.Guest guest5 = new com.reservation_system.model.Guest((int) (byte) -1, "Researcher", "guest", "Andrew", true);
        java.lang.String str6 = guest5.getEmail();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "guest" + "'", str6, "guest");
    }

    @Test
    public void test1684() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1684");
        com.reservation_system.model.User user6 = com.reservation_system.patterns.factory.UserFactory.createUser("Faculty", 10, "student", "Password1!", "Student", false);
        org.junit.Assert.assertNotNull(user6);
    }

    @Test
    public void test1685() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1685");
        com.reservation_system.model.Guest guest5 = new com.reservation_system.model.Guest((int) (short) 0, "Researcher", "headlabcoordinator", "Guest", true);
        java.lang.String str6 = guest5.getUserType();
        java.lang.String str7 = guest5.getName();
        boolean boolean8 = guest5.isApproved();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Guest" + "'", str6, "Guest");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Researcher" + "'", str7, "Researcher");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test1686() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1686");
        com.reservation_system.model.LabManager labManager5 = new com.reservation_system.model.LabManager((int) (byte) 0, "Faculty", "labmanager", "Student", true);
        boolean boolean6 = labManager5.isApproved();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test1687() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1687");
        // The following exception was thrown during execution in test generation
        try {
            com.reservation_system.model.User user6 = com.reservation_system.patterns.factory.UserFactory.createUser("Andrew", 35, "Student", "", "Password1!", false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid user type: Andrew");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1688() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1688");
        com.reservation_system.model.Student student5 = new com.reservation_system.model.Student((-1), "hi!", "headlabcoordinator", "faculty", true);
        java.lang.String str6 = student5.getUserType();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Student" + "'", str6, "Student");
    }

    @Test
    public void test1689() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1689");
        com.reservation_system.model.Guest guest5 = new com.reservation_system.model.Guest((int) (short) 1, "Guest", "Andrew", "Faculty", false);
        java.lang.String str6 = guest5.getName();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Guest" + "'", str6, "Guest");
    }

    @Test
    public void test1690() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1690");
        com.reservation_system.model.Guest guest5 = new com.reservation_system.model.Guest((int) (byte) 1, "student", "headlabcoordinator", "headlabcoordinator", false);
    }

    @Test
    public void test1691() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1691");
        com.reservation_system.model.LabManager labManager5 = new com.reservation_system.model.LabManager((int) ' ', "", "student", "Password1!", false);
    }

    @Test
    public void test1692() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1692");
        com.reservation_system.model.LabManager labManager5 = new com.reservation_system.model.LabManager((-1), "Password1!", "Password1!", "Faculty", false);
        java.lang.String str6 = labManager5.getUserType();
        java.lang.String str7 = labManager5.getUserType();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "labmanager" + "'", str6, "labmanager");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "labmanager" + "'", str7, "labmanager");
    }

    @Test
    public void test1693() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1693");
        com.reservation_system.model.Faculty faculty5 = new com.reservation_system.model.Faculty(32, "faculty", "hi!", "Password1!", true);
        java.lang.String str6 = faculty5.getPassword();
        java.lang.String str7 = faculty5.getUserType();
        java.lang.String str8 = faculty5.getEmail();
        boolean boolean9 = faculty5.isApproved();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Password1!" + "'", str6, "Password1!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Faculty" + "'", str7, "Faculty");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test1694() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1694");
        com.reservation_system.model.LabManager labManager5 = new com.reservation_system.model.LabManager(0, "Faculty", "Student", "Andrew", false);
        java.lang.String str6 = labManager5.getUserType();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "labmanager" + "'", str6, "labmanager");
    }

    @Test
    public void test1695() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1695");
        com.reservation_system.model.User user6 = com.reservation_system.patterns.factory.UserFactory.createUser("Guest", 100, "Researcher", "labmanager", "faculty", false);
        org.junit.Assert.assertNotNull(user6);
    }

    @Test
    public void test1696() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1696");
        com.reservation_system.model.LabManager labManager5 = new com.reservation_system.model.LabManager(0, "hi!", "labmanager", "Guest", false);
        java.lang.String str6 = labManager5.getUserType();
        java.lang.String str7 = labManager5.getUserType();
        int int8 = labManager5.getID();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "labmanager" + "'", str6, "labmanager");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "labmanager" + "'", str7, "labmanager");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test1697() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1697");
        com.reservation_system.model.User user6 = com.reservation_system.patterns.factory.UserFactory.createUser("researcher", 1, "Password1!", "Researcher", "Student", false);
        org.junit.Assert.assertNotNull(user6);
    }

    @Test
    public void test1698() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1698");
        com.reservation_system.model.Guest guest5 = new com.reservation_system.model.Guest(1, "", "student", "student", true);
        java.lang.String str6 = guest5.getPassword();
        java.lang.String str7 = guest5.getUserType();
        java.lang.String str8 = guest5.getPassword();
        guest5.setApproved(false);
        java.lang.String str11 = guest5.getPassword();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "student" + "'", str6, "student");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Guest" + "'", str7, "Guest");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "student" + "'", str8, "student");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "student" + "'", str11, "student");
    }

    @Test
    public void test1699() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1699");
        com.reservation_system.model.HeadLabCoordinator headLabCoordinator5 = new com.reservation_system.model.HeadLabCoordinator(10, "Guest", "Student", "Researcher", true);
        java.lang.String str6 = headLabCoordinator5.getUserType();
        java.lang.String str7 = headLabCoordinator5.getUserType();
        java.lang.String str8 = headLabCoordinator5.getUserType();
        boolean boolean9 = headLabCoordinator5.isApproved();
        java.lang.String str10 = headLabCoordinator5.getUserType();
        java.lang.String str11 = headLabCoordinator5.getName();
        java.lang.String str12 = headLabCoordinator5.getEmail();
        java.lang.String str13 = headLabCoordinator5.getUserType();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "headlabcoordinator" + "'", str6, "headlabcoordinator");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "headlabcoordinator" + "'", str7, "headlabcoordinator");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "headlabcoordinator" + "'", str8, "headlabcoordinator");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "headlabcoordinator" + "'", str10, "headlabcoordinator");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Guest" + "'", str11, "Guest");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Student" + "'", str12, "Student");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "headlabcoordinator" + "'", str13, "headlabcoordinator");
    }

    @Test
    public void test1700() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1700");
        com.reservation_system.model.Student student5 = new com.reservation_system.model.Student((int) (short) 1, "", "labmanager", "student", true);
    }

    @Test
    public void test1701() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1701");
        com.reservation_system.model.HeadLabCoordinator headLabCoordinator5 = new com.reservation_system.model.HeadLabCoordinator((int) ' ', "headlabcoordinator", "Student", "Guest", false);
        java.lang.String str6 = headLabCoordinator5.getEmail();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Student" + "'", str6, "Student");
    }

    @Test
    public void test1702() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1702");
        com.reservation_system.model.Faculty faculty5 = new com.reservation_system.model.Faculty((int) '4', "researcher", "researcher", "Researcher", true);
        java.lang.String str6 = faculty5.getUserType();
        java.lang.String str7 = faculty5.getName();
        java.lang.String str8 = faculty5.getEmail();
        java.lang.String str9 = faculty5.getUserType();
        boolean boolean10 = faculty5.requiresDepartmentApproval();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Faculty" + "'", str6, "Faculty");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "researcher" + "'", str7, "researcher");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "researcher" + "'", str8, "researcher");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Faculty" + "'", str9, "Faculty");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test1703() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1703");
        com.reservation_system.model.Researcher researcher5 = new com.reservation_system.model.Researcher((int) 'a', "", "Student", "Faculty", true);
    }

    @Test
    public void test1704() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1704");
        com.reservation_system.model.Guest guest5 = new com.reservation_system.model.Guest(100, "headlabcoordinator", "labmanager", "guest", true);
        java.lang.String str6 = guest5.getUserType();
        java.lang.String str7 = guest5.getUserType();
        boolean boolean8 = guest5.requiresDepartmentApproval();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Guest" + "'", str6, "Guest");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Guest" + "'", str7, "Guest");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test1705() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1705");
        com.reservation_system.model.Guest guest5 = new com.reservation_system.model.Guest((int) (short) -1, "Guest", "andrew@example.com", "Faculty", true);
        java.lang.String str6 = guest5.getPassword();
        int int7 = guest5.getID();
        boolean boolean8 = guest5.isApproved();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Faculty" + "'", str6, "Faculty");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test1706() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1706");
        com.reservation_system.model.Guest guest5 = new com.reservation_system.model.Guest(10, "student", "Researcher", "guest", false);
        java.lang.String str6 = guest5.getUserType();
        guest5.setApproved(true);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Guest" + "'", str6, "Guest");
    }

    @Test
    public void test1707() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1707");
        com.reservation_system.model.Student student5 = new com.reservation_system.model.Student((int) (short) -1, "Guest", "Faculty", "Faculty", true);
        boolean boolean6 = student5.requiresDepartmentApproval();
        java.lang.String str7 = student5.getUserType();
        java.lang.String str8 = student5.getUserType();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Student" + "'", str7, "Student");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Student" + "'", str8, "Student");
    }

    @Test
    public void test1708() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1708");
        com.reservation_system.model.Faculty faculty5 = new com.reservation_system.model.Faculty((int) (short) -1, "faculty", "Password1!", "Researcher", false);
        faculty5.setApproved(true);
    }

    @Test
    public void test1709() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1709");
        com.reservation_system.model.LabManager labManager5 = new com.reservation_system.model.LabManager((int) (byte) 1, "Faculty", "Guest", "", false);
    }

    @Test
    public void test1710() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1710");
        com.reservation_system.model.Guest guest5 = new com.reservation_system.model.Guest((int) (short) 100, "Faculty", "Guest", "Password1!", true);
        int int6 = guest5.getID();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
    }

    @Test
    public void test1711() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1711");
        com.reservation_system.model.Researcher researcher5 = new com.reservation_system.model.Researcher((int) ' ', "faculty", "faculty", "Student", true);
        boolean boolean6 = researcher5.requiresDepartmentApproval();
        java.lang.String str7 = researcher5.getEmail();
        boolean boolean8 = researcher5.requiresDepartmentApproval();
        java.lang.String str9 = researcher5.getEmail();
        boolean boolean10 = researcher5.requiresDepartmentApproval();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "faculty" + "'", str7, "faculty");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "faculty" + "'", str9, "faculty");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test1712() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1712");
        com.reservation_system.model.User user6 = com.reservation_system.patterns.factory.UserFactory.createUser("guest", (int) (byte) 0, "andrew@example.com", "", "andrew@example.com", false);
        org.junit.Assert.assertNotNull(user6);
    }

    @Test
    public void test1713() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1713");
        com.reservation_system.model.Researcher researcher5 = new com.reservation_system.model.Researcher((int) (short) 0, "labmanager", "hi!", "researcher", true);
    }

    @Test
    public void test1714() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1714");
        // The following exception was thrown during execution in test generation
        try {
            com.reservation_system.model.User user6 = com.reservation_system.patterns.factory.UserFactory.createUser("Password1!", (int) '#', "", "", "hi!", true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid user type: Password1!");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1715() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1715");
        com.reservation_system.model.Student student5 = new com.reservation_system.model.Student((int) (short) -1, "Student", "labmanager", "Researcher", false);
        boolean boolean6 = student5.requiresDepartmentApproval();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test1716() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1716");
        com.reservation_system.model.LabManager labManager5 = new com.reservation_system.model.LabManager((int) 'a', "Password1!", "Andrew", "headlabcoordinator", true);
    }

    @Test
    public void test1717() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1717");
        com.reservation_system.model.Student student5 = new com.reservation_system.model.Student((int) (byte) 10, "Faculty", "headlabcoordinator", "student", false);
    }

    @Test
    public void test1718() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1718");
        com.reservation_system.model.LabManager labManager5 = new com.reservation_system.model.LabManager(32, "faculty", "guest", "", true);
    }

    @Test
    public void test1719() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1719");
        com.reservation_system.model.User user6 = com.reservation_system.patterns.factory.UserFactory.createUser("headlabcoordinator", (int) (short) -1, "Student", "Andrew", "Faculty", true);
        int int7 = user6.getID();
        boolean boolean8 = user6.isApproved();
        boolean boolean9 = user6.isApproved();
        java.lang.String str10 = user6.getEmail();
        java.lang.Class<?> wildcardClass11 = user6.getClass();
        org.junit.Assert.assertNotNull(user6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Andrew" + "'", str10, "Andrew");
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test1720() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1720");
        com.reservation_system.model.Guest guest5 = new com.reservation_system.model.Guest((int) (byte) 10, "Researcher", "guest", "Password1!", false);
        java.lang.String str6 = guest5.getUserType();
        java.lang.String str7 = guest5.getPassword();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Guest" + "'", str6, "Guest");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Password1!" + "'", str7, "Password1!");
    }

    @Test
    public void test1721() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1721");
        com.reservation_system.model.Researcher researcher5 = new com.reservation_system.model.Researcher((int) (short) 0, "headlabcoordinator", "Student", "Researcher", false);
    }

    @Test
    public void test1722() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1722");
        com.reservation_system.model.User user6 = com.reservation_system.patterns.factory.UserFactory.createUser("Researcher", 0, "Researcher", "guest", "Password1!", false);
        org.junit.Assert.assertNotNull(user6);
    }

    @Test
    public void test1723() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1723");
        com.reservation_system.model.Guest guest5 = new com.reservation_system.model.Guest(52, "", "Password1!", "Student", true);
    }

    @Test
    public void test1724() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1724");
        com.reservation_system.model.LabManager labManager5 = new com.reservation_system.model.LabManager((int) '4', "", "Faculty", "Faculty", false);
    }

    @Test
    public void test1725() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1725");
        com.reservation_system.model.Faculty faculty5 = new com.reservation_system.model.Faculty(10, "guest", "headlabcoordinator", "Andrew", false);
        boolean boolean6 = faculty5.requiresDepartmentApproval();
        java.lang.String str7 = faculty5.getName();
        java.lang.String str8 = faculty5.getUserType();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "guest" + "'", str7, "guest");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Faculty" + "'", str8, "Faculty");
    }

    @Test
    public void test1726() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1726");
        com.reservation_system.model.User user6 = com.reservation_system.patterns.factory.UserFactory.createUser("student", 35, "hi!", "student", "Researcher", false);
        org.junit.Assert.assertNotNull(user6);
    }

    @Test
    public void test1727() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1727");
        com.reservation_system.model.Guest guest5 = new com.reservation_system.model.Guest(35, "", "hi!", "Guest", true);
    }

    @Test
    public void test1728() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1728");
        com.reservation_system.model.User user6 = com.reservation_system.patterns.factory.UserFactory.createUser("Guest", 10, "Faculty", "hi!", "student", false);
        boolean boolean7 = user6.requiresDepartmentApproval();
        org.junit.Assert.assertNotNull(user6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test1729() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1729");
        com.reservation_system.model.HeadLabCoordinator headLabCoordinator5 = new com.reservation_system.model.HeadLabCoordinator((int) 'a', "Researcher", "researcher", "", false);
        java.lang.String str6 = headLabCoordinator5.getUserType();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "headlabcoordinator" + "'", str6, "headlabcoordinator");
    }

    @Test
    public void test1730() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1730");
        com.reservation_system.model.Faculty faculty5 = new com.reservation_system.model.Faculty((int) (byte) 100, "Andrew", "guest", "Password1!", false);
    }

    @Test
    public void test1731() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1731");
        com.reservation_system.model.Researcher researcher5 = new com.reservation_system.model.Researcher((int) 'a', "Password1!", "Password1!", "", true);
        researcher5.setApproved(true);
        boolean boolean8 = researcher5.requiresDepartmentApproval();
        java.lang.String str9 = researcher5.getName();
        java.lang.String str10 = researcher5.getUserType();
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Password1!" + "'", str9, "Password1!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Researcher" + "'", str10, "Researcher");
    }

    @Test
    public void test1732() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1732");
        com.reservation_system.model.Faculty faculty5 = new com.reservation_system.model.Faculty((int) (short) 100, "Guest", "labmanager", "andrew@example.com", true);
        java.lang.String str6 = faculty5.getUserType();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Faculty" + "'", str6, "Faculty");
    }

    @Test
    public void test1733() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1733");
        com.reservation_system.model.LabManager labManager5 = new com.reservation_system.model.LabManager((int) (byte) 1, "guest", "Faculty", "faculty", true);
        java.lang.String str6 = labManager5.getUserType();
        java.lang.String str7 = labManager5.getUserType();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "labmanager" + "'", str6, "labmanager");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "labmanager" + "'", str7, "labmanager");
    }

    @Test
    public void test1734() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1734");
        com.reservation_system.model.Faculty faculty5 = new com.reservation_system.model.Faculty(1, "Faculty", "guest", "student", true);
    }

    @Test
    public void test1735() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1735");
        com.reservation_system.model.Guest guest5 = new com.reservation_system.model.Guest(32, "Student", "Student", "Researcher", true);
    }

    @Test
    public void test1736() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1736");
        com.reservation_system.model.Guest guest5 = new com.reservation_system.model.Guest((int) (byte) 100, "headlabcoordinator", "Faculty", "student", false);
    }

    @Test
    public void test1737() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1737");
        com.reservation_system.model.Guest guest5 = new com.reservation_system.model.Guest((int) '4', "andrew@example.com", "student", "faculty", true);
        java.lang.String str6 = guest5.getName();
        java.lang.String str7 = guest5.getPassword();
        java.lang.String str8 = guest5.getEmail();
        java.lang.String str9 = guest5.getPassword();
        int int10 = guest5.getID();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "faculty" + "'", str7, "faculty");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "student" + "'", str8, "student");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "faculty" + "'", str9, "faculty");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 52 + "'", int10 == 52);
    }

    @Test
    public void test1738() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1738");
        com.reservation_system.model.LabManager labManager5 = new com.reservation_system.model.LabManager((int) (short) 10, "headlabcoordinator", "Andrew", "guest", true);
        labManager5.setApproved(false);
        java.lang.String str8 = labManager5.getUserType();
        java.lang.String str9 = labManager5.getUserType();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "labmanager" + "'", str8, "labmanager");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "labmanager" + "'", str9, "labmanager");
    }

    @Test
    public void test1739() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1739");
        com.reservation_system.model.Faculty faculty5 = new com.reservation_system.model.Faculty((int) '#', "labmanager", "hi!", "Researcher", true);
        java.lang.String str6 = faculty5.getPassword();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Researcher" + "'", str6, "Researcher");
    }

    @Test
    public void test1740() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1740");
        com.reservation_system.model.HeadLabCoordinator headLabCoordinator5 = new com.reservation_system.model.HeadLabCoordinator((int) (byte) 1, "researcher", "labmanager", "Researcher", true);
        java.lang.String str6 = headLabCoordinator5.getUserType();
        java.lang.String str7 = headLabCoordinator5.getUserType();
        java.lang.String str8 = headLabCoordinator5.getEmail();
        headLabCoordinator5.setApproved(true);
        java.lang.String str11 = headLabCoordinator5.getEmail();
        java.lang.String str12 = headLabCoordinator5.getUserType();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "headlabcoordinator" + "'", str6, "headlabcoordinator");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "headlabcoordinator" + "'", str7, "headlabcoordinator");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "labmanager" + "'", str8, "labmanager");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "labmanager" + "'", str11, "labmanager");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "headlabcoordinator" + "'", str12, "headlabcoordinator");
    }

    @Test
    public void test1741() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1741");
        com.reservation_system.model.Student student5 = new com.reservation_system.model.Student((int) 'a', "headlabcoordinator", "Guest", "", false);
        student5.setApproved(false);
        student5.setApproved(true);
        java.lang.Class<?> wildcardClass10 = student5.getClass();
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test1742() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1742");
        com.reservation_system.model.Researcher researcher5 = new com.reservation_system.model.Researcher(0, "Faculty", "labmanager", "", true);
        java.lang.String str6 = researcher5.getUserType();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Researcher" + "'", str6, "Researcher");
    }

    @Test
    public void test1743() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1743");
        com.reservation_system.model.User user6 = com.reservation_system.patterns.factory.UserFactory.createUser("headlabcoordinator", (int) (short) 0, "Andrew", "Researcher", "", false);
        org.junit.Assert.assertNotNull(user6);
    }

    @Test
    public void test1744() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1744");
        com.reservation_system.model.HeadLabCoordinator headLabCoordinator5 = new com.reservation_system.model.HeadLabCoordinator((int) (byte) 100, "", "headlabcoordinator", "faculty", true);
        java.lang.String str6 = headLabCoordinator5.getUserType();
        java.lang.String str7 = headLabCoordinator5.getUserType();
        java.lang.String str8 = headLabCoordinator5.getUserType();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "headlabcoordinator" + "'", str6, "headlabcoordinator");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "headlabcoordinator" + "'", str7, "headlabcoordinator");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "headlabcoordinator" + "'", str8, "headlabcoordinator");
    }

    @Test
    public void test1745() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1745");
        com.reservation_system.model.LabManager labManager5 = new com.reservation_system.model.LabManager((-1), "Guest", "andrew@example.com", "", false);
    }

    @Test
    public void test1746() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1746");
        com.reservation_system.model.Student student5 = new com.reservation_system.model.Student((int) (byte) 0, "andrew@example.com", "", "student", true);
        java.lang.String str6 = student5.getPassword();
        java.lang.String str7 = student5.getUserType();
        java.lang.String str8 = student5.getPassword();
        java.lang.String str9 = student5.getUserType();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "student" + "'", str6, "student");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Student" + "'", str7, "Student");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "student" + "'", str8, "student");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Student" + "'", str9, "Student");
    }

    @Test
    public void test1747() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1747");
        com.reservation_system.model.Student student5 = new com.reservation_system.model.Student(97, "Faculty", "", "Student", true);
        boolean boolean6 = student5.requiresDepartmentApproval();
        int int7 = student5.getID();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 97 + "'", int7 == 97);
    }

    @Test
    public void test1748() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1748");
        com.reservation_system.model.LabManager labManager5 = new com.reservation_system.model.LabManager((int) '#', "labmanager", "Andrew", "Researcher", true);
    }

    @Test
    public void test1749() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1749");
        com.reservation_system.model.Guest guest5 = new com.reservation_system.model.Guest((int) '4', "Researcher", "hi!", "", false);
    }

    @Test
    public void test1750() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1750");
        com.reservation_system.model.Faculty faculty5 = new com.reservation_system.model.Faculty(1, "labmanager", "Guest", "faculty", true);
        boolean boolean6 = faculty5.requiresDepartmentApproval();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test1751() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1751");
        com.reservation_system.model.LabManager labManager5 = new com.reservation_system.model.LabManager(32, "Student", "researcher", "headlabcoordinator", false);
        java.lang.Class<?> wildcardClass6 = labManager5.getClass();
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test1752() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1752");
        com.reservation_system.model.Guest guest5 = new com.reservation_system.model.Guest((int) '4', "andrew@example.com", "student", "faculty", true);
        java.lang.String str6 = guest5.getName();
        java.lang.String str7 = guest5.getUserType();
        java.lang.String str8 = guest5.getUserType();
        boolean boolean9 = guest5.isApproved();
        java.lang.String str10 = guest5.getUserType();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Guest" + "'", str7, "Guest");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Guest" + "'", str8, "Guest");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Guest" + "'", str10, "Guest");
    }

    @Test
    public void test1753() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1753");
        com.reservation_system.model.Faculty faculty5 = new com.reservation_system.model.Faculty(1, "guest", "Guest", "andrew@example.com", true);
    }

    @Test
    public void test1754() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1754");
        com.reservation_system.model.User user6 = com.reservation_system.patterns.factory.UserFactory.createUser("Researcher", 100, "Guest", "Guest", "Guest", false);
        java.lang.String str7 = user6.getEmail();
        org.junit.Assert.assertNotNull(user6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Guest" + "'", str7, "Guest");
    }

    @Test
    public void test1755() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1755");
        com.reservation_system.model.HeadLabCoordinator headLabCoordinator5 = new com.reservation_system.model.HeadLabCoordinator((int) (short) 0, "", "andrew@example.com", "Andrew", true);
        java.lang.String str6 = headLabCoordinator5.getUserType();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "headlabcoordinator" + "'", str6, "headlabcoordinator");
    }

    @Test
    public void test1756() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1756");
        com.reservation_system.model.HeadLabCoordinator headLabCoordinator5 = new com.reservation_system.model.HeadLabCoordinator(97, "guest", "hi!", "faculty", false);
        boolean boolean6 = headLabCoordinator5.requiresDepartmentApproval();
        java.lang.String str7 = headLabCoordinator5.getPassword();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "faculty" + "'", str7, "faculty");
    }

    @Test
    public void test1757() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1757");
        com.reservation_system.model.HeadLabCoordinator headLabCoordinator5 = new com.reservation_system.model.HeadLabCoordinator((int) '4', "Guest", "Researcher", "Researcher", false);
        java.lang.Class<?> wildcardClass6 = headLabCoordinator5.getClass();
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test1758() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1758");
        com.reservation_system.model.Student student5 = new com.reservation_system.model.Student((int) (short) 10, "guest", "labmanager", "", false);
        java.lang.String str6 = student5.getEmail();
        java.lang.String str7 = student5.getEmail();
        boolean boolean8 = student5.isApproved();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "labmanager" + "'", str6, "labmanager");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "labmanager" + "'", str7, "labmanager");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test1759() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1759");
        com.reservation_system.model.LabManager labManager5 = new com.reservation_system.model.LabManager((int) (short) 1, "Student", "Faculty", "guest", true);
        java.lang.String str6 = labManager5.getPassword();
        boolean boolean7 = labManager5.isApproved();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "guest" + "'", str6, "guest");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test1760() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1760");
        com.reservation_system.model.Guest guest5 = new com.reservation_system.model.Guest((int) '4', "andrew@example.com", "student", "faculty", true);
        java.lang.String str6 = guest5.getUserType();
        java.lang.String str7 = guest5.getName();
        java.lang.String str8 = guest5.getPassword();
        int int9 = guest5.getID();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Guest" + "'", str6, "Guest");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "faculty" + "'", str8, "faculty");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 52 + "'", int9 == 52);
    }

    @Test
    public void test1761() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1761");
        com.reservation_system.model.Student student5 = new com.reservation_system.model.Student((int) (short) -1, "hi!", "labmanager", "headlabcoordinator", true);
    }

    @Test
    public void test1762() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1762");
        com.reservation_system.model.Student student5 = new com.reservation_system.model.Student((int) ' ', "Researcher", "labmanager", "", true);
    }

    @Test
    public void test1763() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1763");
        com.reservation_system.model.LabManager labManager5 = new com.reservation_system.model.LabManager((int) (short) 10, "headlabcoordinator", "Andrew", "guest", true);
        java.lang.String str6 = labManager5.getPassword();
        boolean boolean7 = labManager5.requiresDepartmentApproval();
        java.lang.String str8 = labManager5.getName();
        labManager5.setApproved(true);
        java.lang.String str11 = labManager5.getUserType();
        java.lang.String str12 = labManager5.getUserType();
        java.lang.String str13 = labManager5.getUserType();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "guest" + "'", str6, "guest");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "headlabcoordinator" + "'", str8, "headlabcoordinator");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "labmanager" + "'", str11, "labmanager");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "labmanager" + "'", str12, "labmanager");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "labmanager" + "'", str13, "labmanager");
    }

    @Test
    public void test1764() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1764");
        com.reservation_system.model.Faculty faculty5 = new com.reservation_system.model.Faculty((int) (short) 100, "Researcher", "researcher", "Guest", true);
        faculty5.setApproved(true);
        java.lang.String str8 = faculty5.getUserType();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Faculty" + "'", str8, "Faculty");
    }

    @Test
    public void test1765() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1765");
        // The following exception was thrown during execution in test generation
        try {
            com.reservation_system.model.User user6 = com.reservation_system.patterns.factory.UserFactory.createUser("andrew@example.com", (int) (short) 10, "Faculty", "labmanager", "labmanager", true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid user type: andrew@example.com");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1766() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1766");
        com.reservation_system.model.HeadLabCoordinator headLabCoordinator5 = new com.reservation_system.model.HeadLabCoordinator(35, "", "", "", false);
    }

    @Test
    public void test1767() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1767");
        com.reservation_system.model.Student student5 = new com.reservation_system.model.Student(10, "", "Password1!", "Guest", false);
        java.lang.String str6 = student5.getEmail();
        java.lang.String str7 = student5.getName();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Password1!" + "'", str6, "Password1!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
    }

    @Test
    public void test1768() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1768");
        com.reservation_system.model.Researcher researcher5 = new com.reservation_system.model.Researcher(0, "", "Password1!", "Andrew", false);
        java.lang.String str6 = researcher5.getEmail();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Password1!" + "'", str6, "Password1!");
    }

    @Test
    public void test1769() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1769");
        com.reservation_system.model.LabManager labManager5 = new com.reservation_system.model.LabManager((int) '#', "Faculty", "student", "researcher", true);
        java.lang.String str6 = labManager5.getUserType();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "labmanager" + "'", str6, "labmanager");
    }

    @Test
    public void test1770() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1770");
        com.reservation_system.model.HeadLabCoordinator headLabCoordinator5 = new com.reservation_system.model.HeadLabCoordinator((int) ' ', "Researcher", "labmanager", "Guest", true);
    }

    @Test
    public void test1771() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1771");
        com.reservation_system.model.Guest guest5 = new com.reservation_system.model.Guest((int) (short) 100, "Andrew", "", "Student", false);
        java.lang.String str6 = guest5.getPassword();
        boolean boolean7 = guest5.isApproved();
        java.lang.String str8 = guest5.getUserType();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Student" + "'", str6, "Student");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Guest" + "'", str8, "Guest");
    }

    @Test
    public void test1772() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1772");
        com.reservation_system.model.Researcher researcher5 = new com.reservation_system.model.Researcher(52, "headlabcoordinator", "", "Student", false);
        java.lang.String str6 = researcher5.getEmail();
        java.lang.String str7 = researcher5.getUserType();
        java.lang.Class<?> wildcardClass8 = researcher5.getClass();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Researcher" + "'", str7, "Researcher");
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test1773() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1773");
        com.reservation_system.model.HeadLabCoordinator headLabCoordinator5 = new com.reservation_system.model.HeadLabCoordinator((int) (byte) 100, "", "headlabcoordinator", "faculty", true);
        java.lang.String str6 = headLabCoordinator5.getUserType();
        java.lang.String str7 = headLabCoordinator5.getUserType();
        boolean boolean8 = headLabCoordinator5.isApproved();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "headlabcoordinator" + "'", str6, "headlabcoordinator");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "headlabcoordinator" + "'", str7, "headlabcoordinator");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test1774() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1774");
        com.reservation_system.model.User user6 = com.reservation_system.patterns.factory.UserFactory.createUser("Researcher", (int) (short) 0, "guest", "researcher", "faculty", false);
        boolean boolean7 = user6.requiresDepartmentApproval();
        java.lang.String str8 = user6.getName();
        org.junit.Assert.assertNotNull(user6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "guest" + "'", str8, "guest");
    }

    @Test
    public void test1775() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1775");
        com.reservation_system.model.HeadLabCoordinator headLabCoordinator5 = new com.reservation_system.model.HeadLabCoordinator((int) (byte) 1, "researcher", "labmanager", "Researcher", true);
        java.lang.String str6 = headLabCoordinator5.getUserType();
        int int7 = headLabCoordinator5.getID();
        boolean boolean8 = headLabCoordinator5.isApproved();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "headlabcoordinator" + "'", str6, "headlabcoordinator");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test1776() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1776");
        com.reservation_system.model.User user6 = com.reservation_system.patterns.factory.UserFactory.createUser("researcher", (int) '4', "Faculty", "headlabcoordinator", "Password1!", true);
        java.lang.String str7 = user6.getName();
        java.lang.String str8 = user6.getEmail();
        int int9 = user6.getID();
        org.junit.Assert.assertNotNull(user6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Faculty" + "'", str7, "Faculty");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "headlabcoordinator" + "'", str8, "headlabcoordinator");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 52 + "'", int9 == 52);
    }

    @Test
    public void test1777() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1777");
        com.reservation_system.model.Faculty faculty5 = new com.reservation_system.model.Faculty(32, "Researcher", "Andrew", "", true);
        java.lang.String str6 = faculty5.getPassword();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
    }

    @Test
    public void test1778() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1778");
        com.reservation_system.model.LabManager labManager5 = new com.reservation_system.model.LabManager((int) (short) 10, "headlabcoordinator", "Andrew", "guest", true);
        java.lang.String str6 = labManager5.getPassword();
        boolean boolean7 = labManager5.requiresDepartmentApproval();
        java.lang.String str8 = labManager5.getName();
        labManager5.setApproved(true);
        int int11 = labManager5.getID();
        java.lang.String str12 = labManager5.getUserType();
        boolean boolean13 = labManager5.isApproved();
        java.lang.String str14 = labManager5.getUserType();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "guest" + "'", str6, "guest");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "headlabcoordinator" + "'", str8, "headlabcoordinator");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 10 + "'", int11 == 10);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "labmanager" + "'", str12, "labmanager");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "labmanager" + "'", str14, "labmanager");
    }

    @Test
    public void test1779() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1779");
        com.reservation_system.model.Researcher researcher5 = new com.reservation_system.model.Researcher((int) (short) 1, "Faculty", "headlabcoordinator", "andrew@example.com", true);
    }

    @Test
    public void test1780() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1780");
        com.reservation_system.model.LabManager labManager5 = new com.reservation_system.model.LabManager((int) (byte) -1, "student", "Student", "Password1!", false);
        java.lang.String str6 = labManager5.getUserType();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "labmanager" + "'", str6, "labmanager");
    }

    @Test
    public void test1781() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1781");
        com.reservation_system.model.Student student5 = new com.reservation_system.model.Student((int) 'a', "headlabcoordinator", "Guest", "", false);
        boolean boolean6 = student5.isApproved();
        boolean boolean7 = student5.isApproved();
        java.lang.String str8 = student5.getPassword();
        java.lang.String str9 = student5.getUserType();
        int int10 = student5.getID();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Student" + "'", str9, "Student");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 97 + "'", int10 == 97);
    }

    @Test
    public void test1782() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1782");
        com.reservation_system.model.HeadLabCoordinator headLabCoordinator5 = new com.reservation_system.model.HeadLabCoordinator((int) (byte) 100, "andrew@example.com", "Password1!", "Guest", false);
        int int6 = headLabCoordinator5.getID();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
    }

    @Test
    public void test1783() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1783");
        com.reservation_system.model.HeadLabCoordinator headLabCoordinator5 = new com.reservation_system.model.HeadLabCoordinator((int) (byte) 1, "guest", "student", "labmanager", false);
    }

    @Test
    public void test1784() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1784");
        com.reservation_system.model.Researcher researcher5 = new com.reservation_system.model.Researcher((int) (byte) 10, "labmanager", "faculty", "student", true);
        researcher5.setApproved(false);
    }

    @Test
    public void test1785() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1785");
        com.reservation_system.model.Guest guest5 = new com.reservation_system.model.Guest(32, "Faculty", "andrew@example.com", "", false);
    }

    @Test
    public void test1786() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1786");
        com.reservation_system.model.Faculty faculty5 = new com.reservation_system.model.Faculty((int) (byte) -1, "", "Student", "labmanager", true);
        java.lang.String str6 = faculty5.getUserType();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Faculty" + "'", str6, "Faculty");
    }

    @Test
    public void test1787() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1787");
        com.reservation_system.model.Faculty faculty5 = new com.reservation_system.model.Faculty(10, "hi!", "", "guest", false);
        java.lang.String str6 = faculty5.getUserType();
        java.lang.String str7 = faculty5.getUserType();
        java.lang.String str8 = faculty5.getEmail();
        java.lang.String str9 = faculty5.getUserType();
        faculty5.setApproved(false);
        java.lang.Class<?> wildcardClass12 = faculty5.getClass();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Faculty" + "'", str6, "Faculty");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Faculty" + "'", str7, "Faculty");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Faculty" + "'", str9, "Faculty");
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test1788() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1788");
        com.reservation_system.model.HeadLabCoordinator headLabCoordinator5 = new com.reservation_system.model.HeadLabCoordinator(100, "hi!", "", "headlabcoordinator", false);
    }

    @Test
    public void test1789() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1789");
        com.reservation_system.model.Researcher researcher5 = new com.reservation_system.model.Researcher(52, "guest", "", "Researcher", false);
    }

    @Test
    public void test1790() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1790");
        com.reservation_system.model.Faculty faculty5 = new com.reservation_system.model.Faculty((int) (short) 100, "Researcher", "researcher", "Guest", true);
        boolean boolean6 = faculty5.requiresDepartmentApproval();
        boolean boolean7 = faculty5.requiresDepartmentApproval();
        boolean boolean8 = faculty5.isApproved();
        java.lang.String str9 = faculty5.getUserType();
        java.lang.String str10 = faculty5.getUserType();
        boolean boolean11 = faculty5.requiresDepartmentApproval();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Faculty" + "'", str9, "Faculty");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Faculty" + "'", str10, "Faculty");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test1791() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1791");
        com.reservation_system.model.User user6 = com.reservation_system.patterns.factory.UserFactory.createUser("headlabcoordinator", 32, "Andrew", "Student", "guest", false);
        org.junit.Assert.assertNotNull(user6);
    }

    @Test
    public void test1792() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1792");
        com.reservation_system.model.HeadLabCoordinator headLabCoordinator5 = new com.reservation_system.model.HeadLabCoordinator((int) (byte) 0, "headlabcoordinator", "Guest", "student", true);
    }

    @Test
    public void test1793() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1793");
        com.reservation_system.model.HeadLabCoordinator headLabCoordinator5 = new com.reservation_system.model.HeadLabCoordinator(52, "", "Andrew", "Guest", false);
        java.lang.String str6 = headLabCoordinator5.getUserType();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "headlabcoordinator" + "'", str6, "headlabcoordinator");
    }

    @Test
    public void test1794() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1794");
        com.reservation_system.model.Faculty faculty5 = new com.reservation_system.model.Faculty((int) (short) 0, "Faculty", "faculty", "Password1!", false);
    }

    @Test
    public void test1795() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1795");
        com.reservation_system.model.Guest guest5 = new com.reservation_system.model.Guest((int) ' ', "hi!", "hi!", "", true);
        java.lang.String str6 = guest5.getUserType();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Guest" + "'", str6, "Guest");
    }

    @Test
    public void test1796() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1796");
        com.reservation_system.model.HeadLabCoordinator headLabCoordinator5 = new com.reservation_system.model.HeadLabCoordinator((int) (byte) 1, "researcher", "labmanager", "Researcher", true);
        java.lang.String str6 = headLabCoordinator5.getUserType();
        java.lang.String str7 = headLabCoordinator5.getName();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "headlabcoordinator" + "'", str6, "headlabcoordinator");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "researcher" + "'", str7, "researcher");
    }

    @Test
    public void test1797() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1797");
        // The following exception was thrown during execution in test generation
        try {
            com.reservation_system.model.User user6 = com.reservation_system.patterns.factory.UserFactory.createUser("", 1, "Andrew", "Student", "researcher", true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid user type: ");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1798() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1798");
        com.reservation_system.model.Guest guest5 = new com.reservation_system.model.Guest(0, "faculty", "Andrew", "hi!", false);
        java.lang.String str6 = guest5.getName();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "faculty" + "'", str6, "faculty");
    }

    @Test
    public void test1799() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1799");
        com.reservation_system.model.LabManager labManager5 = new com.reservation_system.model.LabManager((int) '4', "Student", "Student", "student", true);
        java.lang.String str6 = labManager5.getUserType();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "labmanager" + "'", str6, "labmanager");
    }

    @Test
    public void test1800() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1800");
        com.reservation_system.model.Faculty faculty5 = new com.reservation_system.model.Faculty((int) (short) -1, "hi!", "Student", "headlabcoordinator", false);
        int int6 = faculty5.getID();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
    }

    @Test
    public void test1801() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1801");
        com.reservation_system.model.Researcher researcher5 = new com.reservation_system.model.Researcher(0, "student", "", "student", false);
        java.lang.String str6 = researcher5.getPassword();
        researcher5.setApproved(true);
        java.lang.String str9 = researcher5.getPassword();
        boolean boolean10 = researcher5.requiresDepartmentApproval();
        java.lang.String str11 = researcher5.getEmail();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "student" + "'", str6, "student");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "student" + "'", str9, "student");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
    }

    @Test
    public void test1802() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1802");
        com.reservation_system.model.LabManager labManager5 = new com.reservation_system.model.LabManager((int) (short) -1, "student", "Student", "", true);
        java.lang.String str6 = labManager5.getUserType();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "labmanager" + "'", str6, "labmanager");
    }

    @Test
    public void test1803() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1803");
        com.reservation_system.model.Faculty faculty5 = new com.reservation_system.model.Faculty(0, "andrew@example.com", "andrew@example.com", "hi!", true);
        java.lang.String str6 = faculty5.getUserType();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Faculty" + "'", str6, "Faculty");
    }

    @Test
    public void test1804() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1804");
        com.reservation_system.model.Researcher researcher5 = new com.reservation_system.model.Researcher(52, "Researcher", "Faculty", "headlabcoordinator", true);
        java.lang.String str6 = researcher5.getUserType();
        boolean boolean7 = researcher5.isApproved();
        java.lang.String str8 = researcher5.getUserType();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Researcher" + "'", str6, "Researcher");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Researcher" + "'", str8, "Researcher");
    }

    @Test
    public void test1805() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1805");
        com.reservation_system.model.LabManager labManager5 = new com.reservation_system.model.LabManager(97, "guest", "researcher", "hi!", true);
    }

    @Test
    public void test1806() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1806");
        com.reservation_system.model.LabManager labManager5 = new com.reservation_system.model.LabManager((int) (byte) -1, "Faculty", "faculty", "labmanager", true);
    }

    @Test
    public void test1807() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1807");
        com.reservation_system.model.Guest guest5 = new com.reservation_system.model.Guest(97, "andrew@example.com", "andrew@example.com", "guest", false);
        java.lang.String str6 = guest5.getUserType();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Guest" + "'", str6, "Guest");
    }

    @Test
    public void test1808() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1808");
        com.reservation_system.model.User user6 = com.reservation_system.patterns.factory.UserFactory.createUser("researcher", (int) (short) 1, "student", "guest", "andrew@example.com", false);
        org.junit.Assert.assertNotNull(user6);
    }

    @Test
    public void test1809() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1809");
        com.reservation_system.model.User user6 = com.reservation_system.patterns.factory.UserFactory.createUser("headlabcoordinator", 10, "andrew@example.com", "labmanager", "Andrew", true);
        org.junit.Assert.assertNotNull(user6);
    }

    @Test
    public void test1810() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1810");
        com.reservation_system.model.LabManager labManager5 = new com.reservation_system.model.LabManager(1, "faculty", "", "andrew@example.com", false);
        java.lang.String str6 = labManager5.getUserType();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "labmanager" + "'", str6, "labmanager");
    }

    @Test
    public void test1811() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1811");
        com.reservation_system.model.Student student5 = new com.reservation_system.model.Student(0, "faculty", "hi!", "faculty", true);
    }

    @Test
    public void test1812() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1812");
        com.reservation_system.model.Researcher researcher5 = new com.reservation_system.model.Researcher(0, "student", "", "student", false);
        java.lang.String str6 = researcher5.getEmail();
        java.lang.String str7 = researcher5.getEmail();
        boolean boolean8 = researcher5.isApproved();
        java.lang.String str9 = researcher5.getName();
        researcher5.setApproved(true);
        int int12 = researcher5.getID();
        boolean boolean13 = researcher5.requiresDepartmentApproval();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "student" + "'", str9, "student");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test1813() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1813");
        com.reservation_system.model.Student student5 = new com.reservation_system.model.Student(97, "hi!", "Guest", "Password1!", true);
        int int6 = student5.getID();
        int int7 = student5.getID();
        java.lang.String str8 = student5.getUserType();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 97 + "'", int6 == 97);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 97 + "'", int7 == 97);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Student" + "'", str8, "Student");
    }

    @Test
    public void test1814() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1814");
        com.reservation_system.model.LabManager labManager5 = new com.reservation_system.model.LabManager((int) (short) 1, "", "Student", "Password1!", false);
        java.lang.String str6 = labManager5.getEmail();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Student" + "'", str6, "Student");
    }

    @Test
    public void test1815() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1815");
        com.reservation_system.model.Student student5 = new com.reservation_system.model.Student((int) (short) 100, "hi!", "student", "", true);
        java.lang.String str6 = student5.getPassword();
        java.lang.String str7 = student5.getPassword();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
    }

    @Test
    public void test1816() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1816");
        com.reservation_system.model.User user6 = com.reservation_system.patterns.factory.UserFactory.createUser("Guest", (int) (byte) 10, "researcher", "Andrew", "researcher", true);
        java.lang.Class<?> wildcardClass7 = user6.getClass();
        org.junit.Assert.assertNotNull(user6);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test1817() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1817");
        com.reservation_system.model.Student student5 = new com.reservation_system.model.Student((int) (byte) -1, "labmanager", "andrew@example.com", "guest", false);
        boolean boolean6 = student5.isApproved();
        boolean boolean7 = student5.isApproved();
        java.lang.String str8 = student5.getPassword();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "guest" + "'", str8, "guest");
    }

    @Test
    public void test1818() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1818");
        com.reservation_system.model.Researcher researcher5 = new com.reservation_system.model.Researcher((int) (byte) 10, "", "guest", "hi!", false);
    }

    @Test
    public void test1819() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1819");
        com.reservation_system.model.Student student5 = new com.reservation_system.model.Student(97, "", "student", "Andrew", true);
        java.lang.String str6 = student5.getPassword();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Andrew" + "'", str6, "Andrew");
    }

    @Test
    public void test1820() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1820");
        com.reservation_system.model.Researcher researcher5 = new com.reservation_system.model.Researcher(0, "student", "", "student", false);
        java.lang.String str6 = researcher5.getPassword();
        researcher5.setApproved(true);
        boolean boolean9 = researcher5.requiresDepartmentApproval();
        researcher5.setApproved(true);
        java.lang.String str12 = researcher5.getUserType();
        java.lang.String str13 = researcher5.getUserType();
        java.lang.String str14 = researcher5.getUserType();
        java.lang.String str15 = researcher5.getEmail();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "student" + "'", str6, "student");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Researcher" + "'", str12, "Researcher");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Researcher" + "'", str13, "Researcher");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Researcher" + "'", str14, "Researcher");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
    }

    @Test
    public void test1821() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1821");
        com.reservation_system.model.HeadLabCoordinator headLabCoordinator5 = new com.reservation_system.model.HeadLabCoordinator((int) 'a', "researcher", "Password1!", "researcher", false);
        java.lang.String str6 = headLabCoordinator5.getUserType();
        boolean boolean7 = headLabCoordinator5.requiresDepartmentApproval();
        java.lang.String str8 = headLabCoordinator5.getUserType();
        boolean boolean9 = headLabCoordinator5.isApproved();
        boolean boolean10 = headLabCoordinator5.isApproved();
        java.lang.String str11 = headLabCoordinator5.getUserType();
        headLabCoordinator5.setApproved(true);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "headlabcoordinator" + "'", str6, "headlabcoordinator");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "headlabcoordinator" + "'", str8, "headlabcoordinator");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "headlabcoordinator" + "'", str11, "headlabcoordinator");
    }

    @Test
    public void test1822() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1822");
        com.reservation_system.model.LabManager labManager5 = new com.reservation_system.model.LabManager(97, "Faculty", "Student", "faculty", false);
        java.lang.String str6 = labManager5.getUserType();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "labmanager" + "'", str6, "labmanager");
    }

    @Test
    public void test1823() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1823");
        com.reservation_system.model.Faculty faculty5 = new com.reservation_system.model.Faculty((int) (byte) 10, "Student", "Researcher", "labmanager", true);
    }

    @Test
    public void test1824() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1824");
        com.reservation_system.model.Faculty faculty5 = new com.reservation_system.model.Faculty((int) 'a', "headlabcoordinator", "", "Researcher", true);
        java.lang.String str6 = faculty5.getEmail();
        faculty5.setApproved(true);
        java.lang.String str9 = faculty5.getUserType();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Faculty" + "'", str9, "Faculty");
    }

    @Test
    public void test1825() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1825");
        com.reservation_system.model.User user6 = com.reservation_system.patterns.factory.UserFactory.createUser("Guest", (int) (byte) 10, "headlabcoordinator", "Student", "labmanager", true);
        org.junit.Assert.assertNotNull(user6);
    }

    @Test
    public void test1826() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1826");
        com.reservation_system.model.HeadLabCoordinator headLabCoordinator5 = new com.reservation_system.model.HeadLabCoordinator((int) 'a', "guest", "Faculty", "", false);
        headLabCoordinator5.setApproved(false);
        java.lang.String str8 = headLabCoordinator5.getEmail();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Faculty" + "'", str8, "Faculty");
    }

    @Test
    public void test1827() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1827");
        com.reservation_system.model.Researcher researcher5 = new com.reservation_system.model.Researcher((int) (byte) 100, "Andrew", "faculty", "researcher", false);
    }

    @Test
    public void test1828() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1828");
        com.reservation_system.model.Researcher researcher5 = new com.reservation_system.model.Researcher((int) (byte) 100, "Password1!", "hi!", "", true);
    }

    @Test
    public void test1829() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1829");
        com.reservation_system.model.LabManager labManager5 = new com.reservation_system.model.LabManager((int) (byte) -1, "headlabcoordinator", "guest", "labmanager", false);
        java.lang.String str6 = labManager5.getUserType();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "labmanager" + "'", str6, "labmanager");
    }

    @Test
    public void test1830() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1830");
        com.reservation_system.model.Student student5 = new com.reservation_system.model.Student(0, "andrew@example.com", "", "researcher", false);
        int int6 = student5.getID();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test1831() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1831");
        com.reservation_system.model.Guest guest5 = new com.reservation_system.model.Guest((int) (short) 10, "Researcher", "headlabcoordinator", "labmanager", false);
    }

    @Test
    public void test1832() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1832");
        com.reservation_system.model.Guest guest5 = new com.reservation_system.model.Guest(35, "researcher", "headlabcoordinator", "faculty", false);
    }

    @Test
    public void test1833() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1833");
        com.reservation_system.model.Researcher researcher5 = new com.reservation_system.model.Researcher(35, "Faculty", "student", "headlabcoordinator", true);
        researcher5.setApproved(false);
    }

    @Test
    public void test1834() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1834");
        com.reservation_system.model.Student student5 = new com.reservation_system.model.Student(97, "Guest", "Guest", "Faculty", true);
        java.lang.String str6 = student5.getUserType();
        java.lang.String str7 = student5.getUserType();
        boolean boolean8 = student5.isApproved();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Student" + "'", str6, "Student");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Student" + "'", str7, "Student");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test1835() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1835");
        com.reservation_system.model.Faculty faculty5 = new com.reservation_system.model.Faculty(1, "guest", "Student", "Andrew", false);
    }

    @Test
    public void test1836() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1836");
        com.reservation_system.model.Researcher researcher5 = new com.reservation_system.model.Researcher(0, "student", "", "student", false);
        java.lang.String str6 = researcher5.getEmail();
        java.lang.String str7 = researcher5.getEmail();
        boolean boolean8 = researcher5.isApproved();
        java.lang.String str9 = researcher5.getName();
        java.lang.String str10 = researcher5.getUserType();
        int int11 = researcher5.getID();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "student" + "'", str9, "student");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Researcher" + "'", str10, "Researcher");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test1837() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1837");
        // The following exception was thrown during execution in test generation
        try {
            com.reservation_system.model.User user6 = com.reservation_system.patterns.factory.UserFactory.createUser("", (int) '4', "Researcher", "andrew@example.com", "guest", false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid user type: ");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1838() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1838");
        com.reservation_system.model.Guest guest5 = new com.reservation_system.model.Guest((int) (short) 10, "hi!", "Researcher", "andrew@example.com", true);
    }

    @Test
    public void test1839() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1839");
        com.reservation_system.model.HeadLabCoordinator headLabCoordinator5 = new com.reservation_system.model.HeadLabCoordinator(35, "Researcher", "", "guest", true);
    }

    @Test
    public void test1840() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1840");
        // The following exception was thrown during execution in test generation
        try {
            com.reservation_system.model.User user6 = com.reservation_system.patterns.factory.UserFactory.createUser("hi!", (int) (byte) -1, "guest", "Password1!", "Password1!", true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid user type: hi!");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1841() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1841");
        com.reservation_system.model.Student student5 = new com.reservation_system.model.Student((int) '#', "guest", "Guest", "hi!", false);
        java.lang.Class<?> wildcardClass6 = student5.getClass();
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test1842() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1842");
        com.reservation_system.model.Guest guest5 = new com.reservation_system.model.Guest(0, "headlabcoordinator", "Password1!", "labmanager", true);
        java.lang.String str6 = guest5.getUserType();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Guest" + "'", str6, "Guest");
    }

    @Test
    public void test1843() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1843");
        com.reservation_system.model.HeadLabCoordinator headLabCoordinator5 = new com.reservation_system.model.HeadLabCoordinator(52, "andrew@example.com", "faculty", "andrew@example.com", true);
        boolean boolean6 = headLabCoordinator5.requiresDepartmentApproval();
        headLabCoordinator5.setApproved(true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test1844() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1844");
        com.reservation_system.model.LabManager labManager5 = new com.reservation_system.model.LabManager(10, "guest", "hi!", "Researcher", false);
        java.lang.String str6 = labManager5.getUserType();
        boolean boolean7 = labManager5.requiresDepartmentApproval();
        java.lang.String str8 = labManager5.getPassword();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "labmanager" + "'", str6, "labmanager");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Researcher" + "'", str8, "Researcher");
    }

    @Test
    public void test1845() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1845");
        com.reservation_system.model.Guest guest5 = new com.reservation_system.model.Guest(1, "", "student", "student", true);
        java.lang.String str6 = guest5.getPassword();
        java.lang.String str7 = guest5.getUserType();
        boolean boolean8 = guest5.isApproved();
        java.lang.String str9 = guest5.getUserType();
        guest5.setApproved(false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "student" + "'", str6, "student");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Guest" + "'", str7, "Guest");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Guest" + "'", str9, "Guest");
    }

    @Test
    public void test1846() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1846");
        com.reservation_system.model.Guest guest5 = new com.reservation_system.model.Guest((int) (byte) 10, "Student", "Faculty", "hi!", true);
    }

    @Test
    public void test1847() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1847");
        com.reservation_system.model.Researcher researcher5 = new com.reservation_system.model.Researcher(0, "student", "", "student", false);
        boolean boolean6 = researcher5.isApproved();
        boolean boolean7 = researcher5.isApproved();
        researcher5.setApproved(false);
        boolean boolean10 = researcher5.isApproved();
        boolean boolean11 = researcher5.requiresDepartmentApproval();
        java.lang.String str12 = researcher5.getUserType();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Researcher" + "'", str12, "Researcher");
    }

    @Test
    public void test1848() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1848");
        com.reservation_system.model.Guest guest5 = new com.reservation_system.model.Guest((int) (byte) 1, "labmanager", "", "Faculty", true);
        java.lang.String str6 = guest5.getUserType();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Guest" + "'", str6, "Guest");
    }

    @Test
    public void test1849() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1849");
        com.reservation_system.model.Researcher researcher5 = new com.reservation_system.model.Researcher((int) (byte) 100, "headlabcoordinator", "andrew@example.com", "guest", false);
        java.lang.String str6 = researcher5.getUserType();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Researcher" + "'", str6, "Researcher");
    }

    @Test
    public void test1850() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1850");
        com.reservation_system.model.Faculty faculty5 = new com.reservation_system.model.Faculty((-1), "researcher", "Faculty", "Andrew", true);
    }

    @Test
    public void test1851() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1851");
        com.reservation_system.model.User user6 = com.reservation_system.patterns.factory.UserFactory.createUser("Guest", 97, "faculty", "hi!", "Faculty", false);
        boolean boolean7 = user6.isApproved();
        org.junit.Assert.assertNotNull(user6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test1852() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1852");
        com.reservation_system.model.Student student5 = new com.reservation_system.model.Student((int) (byte) 0, "", "guest", "labmanager", true);
        int int6 = student5.getID();
        boolean boolean7 = student5.requiresDepartmentApproval();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test1853() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1853");
        com.reservation_system.model.Researcher researcher5 = new com.reservation_system.model.Researcher((int) (byte) -1, "Faculty", "faculty", "Andrew", true);
        int int6 = researcher5.getID();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
    }

    @Test
    public void test1854() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1854");
        com.reservation_system.model.Student student5 = new com.reservation_system.model.Student((int) (short) -1, "faculty", "headlabcoordinator", "Researcher", false);
    }

    @Test
    public void test1855() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1855");
        com.reservation_system.model.Student student5 = new com.reservation_system.model.Student((int) ' ', "faculty", "faculty", "Student", true);
        int int6 = student5.getID();
        boolean boolean7 = student5.requiresDepartmentApproval();
        java.lang.String str8 = student5.getUserType();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 32 + "'", int6 == 32);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Student" + "'", str8, "Student");
    }

    @Test
    public void test1856() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1856");
        com.reservation_system.model.Faculty faculty5 = new com.reservation_system.model.Faculty((int) ' ', "Researcher", "Password1!", "Student", true);
        java.lang.String str6 = faculty5.getPassword();
        java.lang.String str7 = faculty5.getPassword();
        java.lang.String str8 = faculty5.getUserType();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Student" + "'", str6, "Student");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Student" + "'", str7, "Student");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Faculty" + "'", str8, "Faculty");
    }

    @Test
    public void test1857() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1857");
        com.reservation_system.model.Student student5 = new com.reservation_system.model.Student(100, "andrew@example.com", "Password1!", "guest", true);
    }

    @Test
    public void test1858() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1858");
        com.reservation_system.model.HeadLabCoordinator headLabCoordinator5 = new com.reservation_system.model.HeadLabCoordinator((-1), "Researcher", "faculty", "Faculty", false);
    }

    @Test
    public void test1859() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1859");
        com.reservation_system.model.Researcher researcher5 = new com.reservation_system.model.Researcher(0, "faculty", "student", "andrew@example.com", false);
        java.lang.String str6 = researcher5.getPassword();
    }

    @Test
    public void test1860() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1860");
        com.reservation_system.model.Guest guest5 = new com.reservation_system.model.Guest((int) (short) 1, "", "", "Researcher", false);
    }

    @Test
    public void test1861() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1861");
        com.reservation_system.model.LabManager labManager5 = new com.reservation_system.model.LabManager(35, "Student", "hi!", "Guest", false);
    }

    @Test
    public void test1862() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1862");
        com.reservation_system.model.Student student5 = new com.reservation_system.model.Student((-1), "headlabcoordinator", "student", "Student", true);
        boolean boolean6 = student5.isApproved();
        int int7 = student5.getID();
        java.lang.String str8 = student5.getUserType();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Student" + "'", str8, "Student");
    }

    @Test
    public void test1863() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1863");
        com.reservation_system.model.Faculty faculty5 = new com.reservation_system.model.Faculty((int) ' ', "Andrew", "Researcher", "headlabcoordinator", true);
    }

    @Test
    public void test1864() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1864");
        com.reservation_system.model.Researcher researcher5 = new com.reservation_system.model.Researcher((int) (byte) -1, "", "andrew@example.com", "Guest", false);
    }

    @Test
    public void test1865() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1865");
        com.reservation_system.model.HeadLabCoordinator headLabCoordinator5 = new com.reservation_system.model.HeadLabCoordinator((int) (short) 10, "labmanager", "faculty", "Guest", false);
        boolean boolean6 = headLabCoordinator5.isApproved();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test1866() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1866");
        com.reservation_system.model.Guest guest5 = new com.reservation_system.model.Guest(0, "guest", "", "Guest", false);
        int int6 = guest5.getID();
        java.lang.String str7 = guest5.getPassword();
        java.lang.String str8 = guest5.getUserType();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Guest" + "'", str7, "Guest");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Guest" + "'", str8, "Guest");
    }

    @Test
    public void test1867() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1867");
        com.reservation_system.model.Guest guest5 = new com.reservation_system.model.Guest((int) '4', "andrew@example.com", "student", "faculty", true);
        java.lang.String str6 = guest5.getUserType();
        java.lang.String str7 = guest5.getName();
        int int8 = guest5.getID();
        java.lang.String str9 = guest5.getUserType();
        int int10 = guest5.getID();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Guest" + "'", str6, "Guest");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 52 + "'", int8 == 52);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Guest" + "'", str9, "Guest");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 52 + "'", int10 == 52);
    }

    @Test
    public void test1868() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1868");
        com.reservation_system.model.Faculty faculty5 = new com.reservation_system.model.Faculty((int) (byte) 10, "headlabcoordinator", "faculty", "Student", true);
    }

    @Test
    public void test1869() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1869");
        com.reservation_system.model.Student student5 = new com.reservation_system.model.Student((int) ' ', "Researcher", "Andrew", "researcher", true);
    }

    @Test
    public void test1870() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1870");
        com.reservation_system.model.Student student5 = new com.reservation_system.model.Student(35, "Guest", "Password1!", "Guest", false);
    }

    @Test
    public void test1871() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1871");
        com.reservation_system.model.Guest guest5 = new com.reservation_system.model.Guest((int) '4', "labmanager", "Student", "researcher", true);
    }

    @Test
    public void test1872() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1872");
        com.reservation_system.model.HeadLabCoordinator headLabCoordinator5 = new com.reservation_system.model.HeadLabCoordinator((int) (short) -1, "faculty", "labmanager", "Andrew", true);
        java.lang.String str6 = headLabCoordinator5.getUserType();
        java.lang.String str7 = headLabCoordinator5.getUserType();
        headLabCoordinator5.setApproved(true);
        headLabCoordinator5.setApproved(true);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "headlabcoordinator" + "'", str6, "headlabcoordinator");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "headlabcoordinator" + "'", str7, "headlabcoordinator");
    }

    @Test
    public void test1873() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1873");
        com.reservation_system.model.Student student5 = new com.reservation_system.model.Student(35, "Researcher", "hi!", "", false);
    }

    @Test
    public void test1874() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1874");
        com.reservation_system.model.LabManager labManager5 = new com.reservation_system.model.LabManager(10, "Faculty", "guest", "Andrew", false);
        java.lang.String str6 = labManager5.getUserType();
        boolean boolean7 = labManager5.isApproved();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "labmanager" + "'", str6, "labmanager");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test1875() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1875");
        com.reservation_system.model.Faculty faculty5 = new com.reservation_system.model.Faculty((int) (short) 0, "faculty", "faculty", "faculty", false);
    }

    @Test
    public void test1876() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1876");
        com.reservation_system.model.Guest guest5 = new com.reservation_system.model.Guest(0, "labmanager", "", "guest", false);
    }

    @Test
    public void test1877() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1877");
        com.reservation_system.model.Researcher researcher5 = new com.reservation_system.model.Researcher((int) (short) 0, "student", "Password1!", "Andrew", true);
        java.lang.String str6 = researcher5.getUserType();
        java.lang.Class<?> wildcardClass7 = researcher5.getClass();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Researcher" + "'", str6, "Researcher");
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test1878() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1878");
        com.reservation_system.model.Faculty faculty5 = new com.reservation_system.model.Faculty(52, "researcher", "researcher", "Researcher", true);
    }

    @Test
    public void test1879() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1879");
        com.reservation_system.model.HeadLabCoordinator headLabCoordinator5 = new com.reservation_system.model.HeadLabCoordinator((int) (short) 100, "headlabcoordinator", "Student", "", false);
    }

    @Test
    public void test1880() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1880");
        com.reservation_system.model.HeadLabCoordinator headLabCoordinator5 = new com.reservation_system.model.HeadLabCoordinator((int) (byte) 1, "researcher", "student", "", true);
        java.lang.String str6 = headLabCoordinator5.getUserType();
        java.lang.String str7 = headLabCoordinator5.getUserType();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "headlabcoordinator" + "'", str6, "headlabcoordinator");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "headlabcoordinator" + "'", str7, "headlabcoordinator");
    }

    @Test
    public void test1881() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1881");
        com.reservation_system.model.HeadLabCoordinator headLabCoordinator5 = new com.reservation_system.model.HeadLabCoordinator((int) '4', "", "Andrew", "researcher", true);
    }

    @Test
    public void test1882() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1882");
        com.reservation_system.model.Researcher researcher5 = new com.reservation_system.model.Researcher((int) '4', "labmanager", "Faculty", "Guest", false);
        java.lang.String str6 = researcher5.getUserType();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Researcher" + "'", str6, "Researcher");
    }

    @Test
    public void test1883() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1883");
        com.reservation_system.model.Faculty faculty5 = new com.reservation_system.model.Faculty(0, "hi!", "researcher", "researcher", false);
        java.lang.String str6 = faculty5.getUserType();
        java.lang.String str7 = faculty5.getName();
        java.lang.String str8 = faculty5.getPassword();
        faculty5.setApproved(true);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Faculty" + "'", str6, "Faculty");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "researcher" + "'", str8, "researcher");
    }

    @Test
    public void test1884() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1884");
        com.reservation_system.model.Faculty faculty5 = new com.reservation_system.model.Faculty((int) (byte) 1, "", "Password1!", "andrew@example.com", false);
        java.lang.String str6 = faculty5.getEmail();
        boolean boolean7 = faculty5.requiresDepartmentApproval();
        java.lang.String str8 = faculty5.getPassword();
        java.lang.String str9 = faculty5.getUserType();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Password1!" + "'", str6, "Password1!");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Faculty" + "'", str9, "Faculty");
    }

    @Test
    public void test1885() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1885");
        com.reservation_system.model.Faculty faculty5 = new com.reservation_system.model.Faculty((int) (byte) 10, "student", "Andrew", "student", false);
    }

    @Test
    public void test1886() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1886");
        com.reservation_system.model.Student student5 = new com.reservation_system.model.Student((int) 'a', "Researcher", "headlabcoordinator", "researcher", false);
    }

    @Test
    public void test1887() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1887");
        com.reservation_system.model.LabManager labManager5 = new com.reservation_system.model.LabManager((int) (short) 0, "", "labmanager", "Student", false);
        java.lang.String str6 = labManager5.getEmail();
        java.lang.String str7 = labManager5.getUserType();
        java.lang.String str8 = labManager5.getUserType();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "labmanager" + "'", str6, "labmanager");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "labmanager" + "'", str7, "labmanager");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "labmanager" + "'", str8, "labmanager");
    }

    @Test
    public void test1888() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1888");
        com.reservation_system.model.Faculty faculty5 = new com.reservation_system.model.Faculty(97, "Faculty", "hi!", "", true);
        java.lang.String str6 = faculty5.getUserType();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Faculty" + "'", str6, "Faculty");
    }

    @Test
    public void test1889() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1889");
        com.reservation_system.model.Researcher researcher5 = new com.reservation_system.model.Researcher((int) 'a', "Password1!", "Password1!", "", true);
        java.lang.String str6 = researcher5.getUserType();
        java.lang.String str7 = researcher5.getUserType();
        java.lang.String str8 = researcher5.getUserType();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Researcher" + "'", str6, "Researcher");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Researcher" + "'", str7, "Researcher");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Researcher" + "'", str8, "Researcher");
    }

    @Test
    public void test1890() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1890");
        com.reservation_system.model.Faculty faculty5 = new com.reservation_system.model.Faculty(1, "", "guest", "hi!", false);
    }

    @Test
    public void test1891() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1891");
        com.reservation_system.model.User user6 = com.reservation_system.patterns.factory.UserFactory.createUser("Researcher", (int) '4', "Researcher", "andrew@example.com", "researcher", false);
        java.lang.Class<?> wildcardClass7 = user6.getClass();
        org.junit.Assert.assertNotNull(user6);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test1892() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1892");
        com.reservation_system.model.Guest guest5 = new com.reservation_system.model.Guest(52, "faculty", "", "", true);
    }

    @Test
    public void test1893() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1893");
        com.reservation_system.model.Faculty faculty5 = new com.reservation_system.model.Faculty(0, "researcher", "", "", true);
    }

    @Test
    public void test1894() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1894");
        com.reservation_system.model.Faculty faculty5 = new com.reservation_system.model.Faculty(97, "researcher", "Guest", "Guest", false);
    }

    @Test
    public void test1895() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1895");
        com.reservation_system.model.User user6 = com.reservation_system.patterns.factory.UserFactory.createUser("faculty", (int) (short) 1, "headlabcoordinator", "guest", "andrew@example.com", false);
        boolean boolean7 = user6.requiresDepartmentApproval();
        org.junit.Assert.assertNotNull(user6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test1896() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1896");
        com.reservation_system.model.Student student5 = new com.reservation_system.model.Student(1, "guest", "hi!", "student", false);
        java.lang.String str6 = student5.getUserType();
        java.lang.String str7 = student5.getUserType();
        java.lang.String str8 = student5.getName();
        student5.setApproved(false);
        java.lang.String str11 = student5.getUserType();
        java.lang.String str12 = student5.getName();
        java.lang.String str13 = student5.getPassword();
        java.lang.String str14 = student5.getPassword();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Student" + "'", str6, "Student");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Student" + "'", str7, "Student");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "guest" + "'", str8, "guest");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Student" + "'", str11, "Student");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "guest" + "'", str12, "guest");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "student" + "'", str13, "student");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "student" + "'", str14, "student");
    }

    @Test
    public void test1897() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1897");
        com.reservation_system.model.LabManager labManager5 = new com.reservation_system.model.LabManager((int) (short) 10, "labmanager", "researcher", "researcher", false);
    }

    @Test
    public void test1898() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1898");
        com.reservation_system.model.Researcher researcher5 = new com.reservation_system.model.Researcher((int) (byte) -1, "Guest", "guest", "", true);
        java.lang.String str6 = researcher5.getUserType();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Researcher" + "'", str6, "Researcher");
    }

    @Test
    public void test1899() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1899");
        com.reservation_system.model.HeadLabCoordinator headLabCoordinator5 = new com.reservation_system.model.HeadLabCoordinator((int) (short) 10, "Student", "guest", "Faculty", false);
    }

    @Test
    public void test1900() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1900");
        com.reservation_system.model.Guest guest5 = new com.reservation_system.model.Guest((int) (byte) 100, "", "Faculty", "Password1!", false);
        java.lang.String str6 = guest5.getPassword();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Password1!" + "'", str6, "Password1!");
    }

    @Test
    public void test1901() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1901");
        com.reservation_system.model.Researcher researcher5 = new com.reservation_system.model.Researcher(0, "labmanager", "headlabcoordinator", "guest", true);
    }

    @Test
    public void test1902() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1902");
        // The following exception was thrown during execution in test generation
        try {
            com.reservation_system.model.User user6 = com.reservation_system.patterns.factory.UserFactory.createUser("andrew@example.com", (int) (short) -1, "", "", "faculty", false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid user type: andrew@example.com");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1903() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1903");
        com.reservation_system.model.Faculty faculty5 = new com.reservation_system.model.Faculty(10, "Researcher", "", "Student", false);
    }

    @Test
    public void test1904() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1904");
        com.reservation_system.model.HeadLabCoordinator headLabCoordinator5 = new com.reservation_system.model.HeadLabCoordinator((int) 'a', "Researcher", "Password1!", "researcher", false);
    }

    @Test
    public void test1905() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1905");
        com.reservation_system.model.LabManager labManager5 = new com.reservation_system.model.LabManager((int) (byte) 1, "hi!", "faculty", "faculty", true);
        boolean boolean6 = labManager5.requiresDepartmentApproval();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test1906() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1906");
        com.reservation_system.model.Guest guest5 = new com.reservation_system.model.Guest(0, "Guest", "guest", "Researcher", true);
    }

    @Test
    public void test1907() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1907");
        com.reservation_system.model.LabManager labManager5 = new com.reservation_system.model.LabManager(10, "headlabcoordinator", "Andrew", "Faculty", true);
        java.lang.String str6 = labManager5.getUserType();
        java.lang.String str7 = labManager5.getName();
        java.lang.String str8 = labManager5.getPassword();
        java.lang.String str9 = labManager5.getUserType();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "labmanager" + "'", str6, "labmanager");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "headlabcoordinator" + "'", str7, "headlabcoordinator");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Faculty" + "'", str8, "Faculty");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "labmanager" + "'", str9, "labmanager");
    }

    @Test
    public void test1908() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1908");
        com.reservation_system.model.Faculty faculty5 = new com.reservation_system.model.Faculty(10, "andrew@example.com", "hi!", "Faculty", false);
    }

    @Test
    public void test1909() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1909");
        com.reservation_system.model.Guest guest5 = new com.reservation_system.model.Guest((int) (short) 0, "andrew@example.com", "student", "student", false);
    }

    @Test
    public void test1910() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1910");
        com.reservation_system.model.Faculty faculty5 = new com.reservation_system.model.Faculty(0, "Guest", "student", "Student", false);
        java.lang.String str6 = faculty5.getUserType();
        java.lang.String str7 = faculty5.getUserType();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Faculty" + "'", str6, "Faculty");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Faculty" + "'", str7, "Faculty");
    }

    @Test
    public void test1911() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1911");
        com.reservation_system.model.HeadLabCoordinator headLabCoordinator5 = new com.reservation_system.model.HeadLabCoordinator((-1), "researcher", "", "labmanager", false);
        java.lang.String str6 = headLabCoordinator5.getUserType();
        java.lang.String str7 = headLabCoordinator5.getUserType();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "headlabcoordinator" + "'", str6, "headlabcoordinator");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "headlabcoordinator" + "'", str7, "headlabcoordinator");
    }

    @Test
    public void test1912() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1912");
        com.reservation_system.model.Faculty faculty5 = new com.reservation_system.model.Faculty((int) (byte) 0, "Faculty", "labmanager", "Student", false);
        java.lang.String str6 = faculty5.getPassword();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Student" + "'", str6, "Student");
    }

    @Test
    public void test1913() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1913");
        com.reservation_system.model.Faculty faculty5 = new com.reservation_system.model.Faculty((int) '4', "researcher", "researcher", "Researcher", true);
        java.lang.String str6 = faculty5.getUserType();
        java.lang.String str7 = faculty5.getName();
        java.lang.String str8 = faculty5.getEmail();
        faculty5.setApproved(true);
        faculty5.setApproved(true);
        java.lang.String str13 = faculty5.getPassword();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Faculty" + "'", str6, "Faculty");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "researcher" + "'", str7, "researcher");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "researcher" + "'", str8, "researcher");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Researcher" + "'", str13, "Researcher");
    }

    @Test
    public void test1914() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1914");
        com.reservation_system.model.Researcher researcher5 = new com.reservation_system.model.Researcher((int) (byte) 100, "Password1!", "guest", "Student", false);
    }

    @Test
    public void test1915() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1915");
        com.reservation_system.model.Student student5 = new com.reservation_system.model.Student(0, "labmanager", "andrew@example.com", "", true);
        java.lang.String str6 = student5.getUserType();
        java.lang.String str7 = student5.getUserType();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Student" + "'", str6, "Student");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Student" + "'", str7, "Student");
    }

    @Test
    public void test1916() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1916");
        com.reservation_system.model.Student student5 = new com.reservation_system.model.Student((int) (byte) 100, "headlabcoordinator", "headlabcoordinator", "guest", false);
        java.lang.String str6 = student5.getUserType();
        java.lang.String str7 = student5.getPassword();
        java.lang.String str8 = student5.getName();
        java.lang.String str9 = student5.getUserType();
        int int10 = student5.getID();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Student" + "'", str6, "Student");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "guest" + "'", str7, "guest");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "headlabcoordinator" + "'", str8, "headlabcoordinator");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Student" + "'", str9, "Student");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 100 + "'", int10 == 100);
    }

    @Test
    public void test1917() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1917");
        com.reservation_system.model.Faculty faculty5 = new com.reservation_system.model.Faculty(10, "hi!", "", "guest", false);
        java.lang.String str6 = faculty5.getPassword();
        boolean boolean7 = faculty5.isApproved();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "guest" + "'", str6, "guest");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test1918() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1918");
        com.reservation_system.model.Faculty faculty5 = new com.reservation_system.model.Faculty(1, "labmanager", "", "guest", false);
        java.lang.String str6 = faculty5.getUserType();
        java.lang.String str7 = faculty5.getUserType();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Faculty" + "'", str6, "Faculty");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Faculty" + "'", str7, "Faculty");
    }

    @Test
    public void test1919() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1919");
        com.reservation_system.model.Student student5 = new com.reservation_system.model.Student(100, "Student", "Andrew", "Password1!", false);
    }

    @Test
    public void test1920() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1920");
        com.reservation_system.model.Faculty faculty5 = new com.reservation_system.model.Faculty((int) '4', "headlabcoordinator", "Researcher", "researcher", false);
        java.lang.String str6 = faculty5.getUserType();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Faculty" + "'", str6, "Faculty");
    }

    @Test
    public void test1921() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1921");
        com.reservation_system.model.Faculty faculty5 = new com.reservation_system.model.Faculty(0, "andrew@example.com", "guest", "researcher", false);
    }

    @Test
    public void test1922() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1922");
        com.reservation_system.model.Student student5 = new com.reservation_system.model.Student((int) '#', "student", "Guest", "student", false);
        java.lang.String str6 = student5.getUserType();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Student" + "'", str6, "Student");
    }

    @Test
    public void test1923() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1923");
        com.reservation_system.model.LabManager labManager5 = new com.reservation_system.model.LabManager((int) (byte) 100, "Guest", "Faculty", "Password1!", false);
        java.lang.String str6 = labManager5.getPassword();
        java.lang.String str7 = labManager5.getUserType();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Password1!" + "'", str6, "Password1!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "labmanager" + "'", str7, "labmanager");
    }

    @Test
    public void test1924() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1924");
        com.reservation_system.model.HeadLabCoordinator headLabCoordinator5 = new com.reservation_system.model.HeadLabCoordinator(1, "Researcher", "Guest", "guest", false);
        java.lang.String str6 = headLabCoordinator5.getEmail();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Guest" + "'", str6, "Guest");
    }

    @Test
    public void test1925() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1925");
        com.reservation_system.model.Student student5 = new com.reservation_system.model.Student((int) (byte) 1, "headlabcoordinator", "Student", "guest", false);
        boolean boolean6 = student5.isApproved();
        java.lang.String str7 = student5.getUserType();
        java.lang.String str8 = student5.getUserType();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Student" + "'", str7, "Student");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Student" + "'", str8, "Student");
    }

    @Test
    public void test1926() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1926");
        com.reservation_system.model.LabManager labManager5 = new com.reservation_system.model.LabManager((int) (short) 1, "hi!", "Researcher", "", true);
    }

    @Test
    public void test1927() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1927");
        com.reservation_system.model.Faculty faculty5 = new com.reservation_system.model.Faculty((int) (byte) -1, "labmanager", "Researcher", "Guest", false);
    }

    @Test
    public void test1928() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1928");
        com.reservation_system.model.HeadLabCoordinator headLabCoordinator5 = new com.reservation_system.model.HeadLabCoordinator((int) (byte) 1, "researcher", "labmanager", "Researcher", true);
        java.lang.String str6 = headLabCoordinator5.getUserType();
        int int7 = headLabCoordinator5.getID();
        java.lang.String str8 = headLabCoordinator5.getUserType();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "headlabcoordinator" + "'", str6, "headlabcoordinator");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "headlabcoordinator" + "'", str8, "headlabcoordinator");
    }

    @Test
    public void test1929() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1929");
        com.reservation_system.model.Guest guest5 = new com.reservation_system.model.Guest(1, "", "Student", "hi!", false);
        java.lang.String str6 = guest5.getUserType();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Guest" + "'", str6, "Guest");
    }

    @Test
    public void test1930() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1930");
        com.reservation_system.model.User user6 = com.reservation_system.patterns.factory.UserFactory.createUser("researcher", (int) (short) 1, "Researcher", "hi!", "Password1!", false);
        org.junit.Assert.assertNotNull(user6);
    }

    @Test
    public void test1931() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1931");
        com.reservation_system.model.Guest guest5 = new com.reservation_system.model.Guest(10, "", "researcher", "labmanager", true);
        java.lang.String str6 = guest5.getPassword();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "labmanager" + "'", str6, "labmanager");
    }

    @Test
    public void test1932() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1932");
        com.reservation_system.model.HeadLabCoordinator headLabCoordinator5 = new com.reservation_system.model.HeadLabCoordinator(52, "Guest", "headlabcoordinator", "faculty", true);
        java.lang.String str6 = headLabCoordinator5.getUserType();
        java.lang.String str7 = headLabCoordinator5.getEmail();
        boolean boolean8 = headLabCoordinator5.requiresDepartmentApproval();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "headlabcoordinator" + "'", str6, "headlabcoordinator");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "headlabcoordinator" + "'", str7, "headlabcoordinator");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test1933() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1933");
        com.reservation_system.model.Student student5 = new com.reservation_system.model.Student((int) (byte) 1, "andrew@example.com", "labmanager", "", false);
        boolean boolean6 = student5.isApproved();
        java.lang.String str7 = student5.getUserType();
        java.lang.String str8 = student5.getUserType();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Student" + "'", str7, "Student");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Student" + "'", str8, "Student");
    }

    @Test
    public void test1934() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1934");
        com.reservation_system.model.User user6 = com.reservation_system.patterns.factory.UserFactory.createUser("Student", 0, "Password1!", "Password1!", "Faculty", false);
        java.lang.Class<?> wildcardClass7 = user6.getClass();
        org.junit.Assert.assertNotNull(user6);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test1935() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1935");
        com.reservation_system.model.Faculty faculty5 = new com.reservation_system.model.Faculty((int) '#', "Guest", "student", "Guest", false);
        boolean boolean6 = faculty5.requiresDepartmentApproval();
        int int7 = faculty5.getID();
        java.lang.String str8 = faculty5.getUserType();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 35 + "'", int7 == 35);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Faculty" + "'", str8, "Faculty");
    }

    @Test
    public void test1936() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1936");
        com.reservation_system.model.HeadLabCoordinator headLabCoordinator5 = new com.reservation_system.model.HeadLabCoordinator((int) '#', "Password1!", "Researcher", "Student", true);
        java.lang.String str6 = headLabCoordinator5.getUserType();
        headLabCoordinator5.setApproved(false);
        boolean boolean9 = headLabCoordinator5.requiresDepartmentApproval();
        java.lang.String str10 = headLabCoordinator5.getUserType();
        java.lang.String str11 = headLabCoordinator5.getName();
        java.lang.String str12 = headLabCoordinator5.getUserType();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "headlabcoordinator" + "'", str6, "headlabcoordinator");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "headlabcoordinator" + "'", str10, "headlabcoordinator");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Password1!" + "'", str11, "Password1!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "headlabcoordinator" + "'", str12, "headlabcoordinator");
    }

    @Test
    public void test1937() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1937");
        com.reservation_system.model.Researcher researcher5 = new com.reservation_system.model.Researcher((int) (byte) -1, "", "headlabcoordinator", "headlabcoordinator", true);
        java.lang.String str6 = researcher5.getName();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
    }

    @Test
    public void test1938() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1938");
        com.reservation_system.model.User user6 = com.reservation_system.patterns.factory.UserFactory.createUser("Guest", 0, "student", "", "Andrew", false);
        org.junit.Assert.assertNotNull(user6);
    }

    @Test
    public void test1939() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1939");
        com.reservation_system.model.HeadLabCoordinator headLabCoordinator5 = new com.reservation_system.model.HeadLabCoordinator((int) 'a', "Faculty", "hi!", "andrew@example.com", false);
        java.lang.String str6 = headLabCoordinator5.getName();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Faculty" + "'", str6, "Faculty");
    }

    @Test
    public void test1940() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1940");
        com.reservation_system.model.Faculty faculty5 = new com.reservation_system.model.Faculty(10, "", "Guest", "Andrew", false);
    }

    @Test
    public void test1941() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1941");
        com.reservation_system.model.HeadLabCoordinator headLabCoordinator5 = new com.reservation_system.model.HeadLabCoordinator((int) (byte) 1, "Student", "faculty", "", true);
    }

    @Test
    public void test1942() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1942");
        com.reservation_system.model.HeadLabCoordinator headLabCoordinator5 = new com.reservation_system.model.HeadLabCoordinator(10, "Guest", "Student", "Researcher", true);
        java.lang.String str6 = headLabCoordinator5.getUserType();
        headLabCoordinator5.setApproved(true);
        java.lang.String str9 = headLabCoordinator5.getEmail();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "headlabcoordinator" + "'", str6, "headlabcoordinator");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Student" + "'", str9, "Student");
    }

    @Test
    public void test1943() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1943");
        com.reservation_system.model.Student student5 = new com.reservation_system.model.Student(1, "guest", "hi!", "student", false);
        boolean boolean6 = student5.isApproved();
        student5.setApproved(false);
        java.lang.String str9 = student5.getEmail();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
    }

    @Test
    public void test1944() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1944");
        com.reservation_system.model.HeadLabCoordinator headLabCoordinator5 = new com.reservation_system.model.HeadLabCoordinator((int) (byte) 100, "", "Faculty", "guest", false);
    }

    @Test
    public void test1945() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1945");
        com.reservation_system.model.Guest guest5 = new com.reservation_system.model.Guest(10, "student", "Researcher", "guest", false);
        int int6 = guest5.getID();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
    }

    @Test
    public void test1946() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1946");
        com.reservation_system.model.LabManager labManager5 = new com.reservation_system.model.LabManager((int) (byte) 1, "", "Student", "Faculty", false);
    }

    @Test
    public void test1947() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1947");
        com.reservation_system.model.Researcher researcher5 = new com.reservation_system.model.Researcher((int) (short) 0, "hi!", "Researcher", "Faculty", true);
    }

    @Test
    public void test1948() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1948");
        com.reservation_system.model.Guest guest5 = new com.reservation_system.model.Guest((int) (short) 100, "headlabcoordinator", "Student", "hi!", false);
    }

    @Test
    public void test1949() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1949");
        com.reservation_system.model.Faculty faculty5 = new com.reservation_system.model.Faculty((-1), "andrew@example.com", "andrew@example.com", "Andrew", false);
        boolean boolean6 = faculty5.isApproved();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test1950() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1950");
        com.reservation_system.model.Student student5 = new com.reservation_system.model.Student((-1), "hi!", "", "student", false);
    }

    @Test
    public void test1951() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1951");
        com.reservation_system.model.HeadLabCoordinator headLabCoordinator5 = new com.reservation_system.model.HeadLabCoordinator(0, "faculty", "andrew@example.com", "headlabcoordinator", false);
    }

    @Test
    public void test1952() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1952");
        com.reservation_system.model.HeadLabCoordinator headLabCoordinator5 = new com.reservation_system.model.HeadLabCoordinator(32, "headlabcoordinator", "", "headlabcoordinator", true);
    }

    @Test
    public void test1953() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1953");
        com.reservation_system.model.HeadLabCoordinator headLabCoordinator5 = new com.reservation_system.model.HeadLabCoordinator((int) (byte) 100, "labmanager", "Student", "Researcher", false);
        java.lang.String str6 = headLabCoordinator5.getUserType();
        java.lang.String str7 = headLabCoordinator5.getEmail();
        java.lang.String str8 = headLabCoordinator5.getUserType();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "headlabcoordinator" + "'", str6, "headlabcoordinator");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Student" + "'", str7, "Student");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "headlabcoordinator" + "'", str8, "headlabcoordinator");
    }

    @Test
    public void test1954() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1954");
        com.reservation_system.model.LabManager labManager5 = new com.reservation_system.model.LabManager((-1), "Password1!", "Password1!", "Faculty", false);
        java.lang.Class<?> wildcardClass6 = labManager5.getClass();
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test1955() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1955");
        com.reservation_system.model.HeadLabCoordinator headLabCoordinator5 = new com.reservation_system.model.HeadLabCoordinator(10, "Student", "hi!", "", false);
    }

    @Test
    public void test1956() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1956");
        com.reservation_system.model.Faculty faculty5 = new com.reservation_system.model.Faculty((int) '4', "researcher", "researcher", "Researcher", true);
        java.lang.String str6 = faculty5.getUserType();
        java.lang.String str7 = faculty5.getUserType();
        java.lang.String str8 = faculty5.getUserType();
        java.lang.String str9 = faculty5.getEmail();
        java.lang.String str10 = faculty5.getUserType();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Faculty" + "'", str6, "Faculty");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Faculty" + "'", str7, "Faculty");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Faculty" + "'", str8, "Faculty");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "researcher" + "'", str9, "researcher");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Faculty" + "'", str10, "Faculty");
    }

    @Test
    public void test1957() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1957");
        com.reservation_system.model.HeadLabCoordinator headLabCoordinator5 = new com.reservation_system.model.HeadLabCoordinator((int) (short) 100, "andrew@example.com", "Researcher", "guest", false);
    }

    @Test
    public void test1958() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1958");
        com.reservation_system.model.Faculty faculty5 = new com.reservation_system.model.Faculty(0, "Student", "labmanager", "guest", true);
        boolean boolean6 = faculty5.requiresDepartmentApproval();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test1959() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1959");
        com.reservation_system.model.Student student5 = new com.reservation_system.model.Student((int) ' ', "Password1!", "Andrew", "", true);
        boolean boolean6 = student5.isApproved();
        java.lang.String str7 = student5.getUserType();
        java.lang.String str8 = student5.getUserType();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Student" + "'", str7, "Student");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Student" + "'", str8, "Student");
    }

    @Test
    public void test1960() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1960");
        com.reservation_system.model.User user6 = com.reservation_system.patterns.factory.UserFactory.createUser("Faculty", 1, "hi!", "headlabcoordinator", "Student", true);
        org.junit.Assert.assertNotNull(user6);
    }

    @Test
    public void test1961() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1961");
        com.reservation_system.model.LabManager labManager5 = new com.reservation_system.model.LabManager(100, "labmanager", "hi!", "Password1!", true);
    }

    @Test
    public void test1962() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1962");
        com.reservation_system.model.Guest guest5 = new com.reservation_system.model.Guest((int) (short) -1, "Guest", "andrew@example.com", "Faculty", true);
        java.lang.String str6 = guest5.getPassword();
        guest5.setApproved(false);
        java.lang.String str9 = guest5.getUserType();
        boolean boolean10 = guest5.isApproved();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Faculty" + "'", str6, "Faculty");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Guest" + "'", str9, "Guest");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test1963() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1963");
        com.reservation_system.model.User user6 = com.reservation_system.patterns.factory.UserFactory.createUser("headlabcoordinator", (int) (byte) 0, "labmanager", "headlabcoordinator", "student", true);
        org.junit.Assert.assertNotNull(user6);
    }

    @Test
    public void test1964() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1964");
        com.reservation_system.model.Researcher researcher5 = new com.reservation_system.model.Researcher(100, "faculty", "student", "Researcher", true);
        java.lang.Class<?> wildcardClass6 = researcher5.getClass();
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test1965() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1965");
        com.reservation_system.model.LabManager labManager5 = new com.reservation_system.model.LabManager((int) '4', "researcher", "Faculty", "faculty", false);
        boolean boolean6 = labManager5.isApproved();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test1966() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1966");
        com.reservation_system.model.LabManager labManager5 = new com.reservation_system.model.LabManager((int) (short) -1, "Andrew", "", "researcher", true);
        java.lang.String str6 = labManager5.getUserType();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "labmanager" + "'", str6, "labmanager");
    }

    @Test
    public void test1967() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1967");
        com.reservation_system.model.HeadLabCoordinator headLabCoordinator5 = new com.reservation_system.model.HeadLabCoordinator((int) (short) 0, "labmanager", "Faculty", "faculty", false);
        java.lang.String str6 = headLabCoordinator5.getUserType();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "headlabcoordinator" + "'", str6, "headlabcoordinator");
    }

    @Test
    public void test1968() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1968");
        com.reservation_system.model.Student student5 = new com.reservation_system.model.Student(1, "andrew@example.com", "Researcher", "Andrew", true);
    }

    @Test
    public void test1969() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1969");
        com.reservation_system.model.Researcher researcher5 = new com.reservation_system.model.Researcher((int) 'a', "Password1!", "hi!", "student", false);
        java.lang.String str6 = researcher5.getUserType();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Researcher" + "'", str6, "Researcher");
    }

    @Test
    public void test1970() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1970");
        com.reservation_system.model.Guest guest5 = new com.reservation_system.model.Guest((int) (byte) 0, "Researcher", "hi!", "", false);
    }

    @Test
    public void test1971() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1971");
        com.reservation_system.model.Researcher researcher5 = new com.reservation_system.model.Researcher(0, "student", "", "student", false);
        java.lang.String str6 = researcher5.getName();
        java.lang.String str7 = researcher5.getName();
        java.lang.String str8 = researcher5.getUserType();
        researcher5.setApproved(true);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "student" + "'", str6, "student");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "student" + "'", str7, "student");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Researcher" + "'", str8, "Researcher");
    }

    @Test
    public void test1972() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1972");
        // The following exception was thrown during execution in test generation
        try {
            com.reservation_system.model.User user6 = com.reservation_system.patterns.factory.UserFactory.createUser("", (int) (short) 10, "Student", "labmanager", "Researcher", false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid user type: ");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1973() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1973");
        com.reservation_system.model.HeadLabCoordinator headLabCoordinator5 = new com.reservation_system.model.HeadLabCoordinator((int) 'a', "Guest", "", "Andrew", true);
        boolean boolean6 = headLabCoordinator5.requiresDepartmentApproval();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test1974() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1974");
        com.reservation_system.model.Guest guest5 = new com.reservation_system.model.Guest(1, "Password1!", "headlabcoordinator", "labmanager", false);
        int int6 = guest5.getID();
        boolean boolean7 = guest5.requiresDepartmentApproval();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test1975() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1975");
        // The following exception was thrown during execution in test generation
        try {
            com.reservation_system.model.User user6 = com.reservation_system.patterns.factory.UserFactory.createUser("Password1!", (int) 'a', "andrew@example.com", "Guest", "headlabcoordinator", false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid user type: Password1!");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1976() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1976");
        com.reservation_system.model.Researcher researcher5 = new com.reservation_system.model.Researcher((int) ' ', "Andrew", "faculty", "hi!", false);
    }

    @Test
    public void test1977() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1977");
        com.reservation_system.model.Faculty faculty5 = new com.reservation_system.model.Faculty((int) ' ', "Researcher", "Password1!", "Student", true);
        java.lang.String str6 = faculty5.getUserType();
        java.lang.String str7 = faculty5.getUserType();
        java.lang.String str8 = faculty5.getUserType();
        java.lang.String str9 = faculty5.getUserType();
        java.lang.String str10 = faculty5.getUserType();
        java.lang.String str11 = faculty5.getUserType();
        java.lang.String str12 = faculty5.getName();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Faculty" + "'", str6, "Faculty");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Faculty" + "'", str7, "Faculty");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Faculty" + "'", str8, "Faculty");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Faculty" + "'", str9, "Faculty");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Faculty" + "'", str10, "Faculty");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Faculty" + "'", str11, "Faculty");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Researcher" + "'", str12, "Researcher");
    }

    @Test
    public void test1978() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1978");
        com.reservation_system.model.HeadLabCoordinator headLabCoordinator5 = new com.reservation_system.model.HeadLabCoordinator(0, "headlabcoordinator", "faculty", "guest", false);
        java.lang.String str6 = headLabCoordinator5.getPassword();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "guest" + "'", str6, "guest");
    }

    @Test
    public void test1979() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1979");
        com.reservation_system.model.LabManager labManager5 = new com.reservation_system.model.LabManager(97, "labmanager", "researcher", "hi!", false);
    }

    @Test
    public void test1980() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1980");
        com.reservation_system.model.Student student5 = new com.reservation_system.model.Student(100, "Researcher", "labmanager", "Guest", true);
    }

    @Test
    public void test1981() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1981");
        com.reservation_system.model.Guest guest5 = new com.reservation_system.model.Guest((int) '#', "guest", "faculty", "faculty", true);
        java.lang.String str6 = guest5.getEmail();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "faculty" + "'", str6, "faculty");
    }

    @Test
    public void test1982() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1982");
        com.reservation_system.model.User user6 = com.reservation_system.patterns.factory.UserFactory.createUser("labmanager", (-1), "", "hi!", "Student", true);
        int int7 = user6.getID();
        org.junit.Assert.assertNotNull(user6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
    }

    @Test
    public void test1983() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1983");
        com.reservation_system.model.Student student5 = new com.reservation_system.model.Student(10, "Faculty", "Faculty", "", false);
    }

    @Test
    public void test1984() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1984");
        com.reservation_system.model.HeadLabCoordinator headLabCoordinator5 = new com.reservation_system.model.HeadLabCoordinator((int) '#', "", "faculty", "hi!", true);
    }

    @Test
    public void test1985() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1985");
        com.reservation_system.model.Researcher researcher5 = new com.reservation_system.model.Researcher(0, "Andrew", "Guest", "labmanager", false);
        java.lang.String str6 = researcher5.getEmail();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Guest" + "'", str6, "Guest");
    }

    @Test
    public void test1986() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1986");
        com.reservation_system.model.LabManager labManager5 = new com.reservation_system.model.LabManager((int) (short) -1, "student", "Student", "", true);
        java.lang.String str6 = labManager5.getEmail();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Student" + "'", str6, "Student");
    }

    @Test
    public void test1987() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1987");
        com.reservation_system.model.Guest guest5 = new com.reservation_system.model.Guest((int) (byte) 1, "labmanager", "Researcher", "Student", true);
    }

    @Test
    public void test1988() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1988");
        com.reservation_system.model.User user6 = com.reservation_system.patterns.factory.UserFactory.createUser("Student", 100, "Researcher", "labmanager", "guest", false);
        int int7 = user6.getID();
        int int8 = user6.getID();
        org.junit.Assert.assertNotNull(user6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 100 + "'", int7 == 100);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8 == 100);
    }

    @Test
    public void test1989() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1989");
        com.reservation_system.model.HeadLabCoordinator headLabCoordinator5 = new com.reservation_system.model.HeadLabCoordinator((int) (byte) 10, "headlabcoordinator", "faculty", "hi!", false);
    }

    @Test
    public void test1990() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1990");
        com.reservation_system.model.Guest guest5 = new com.reservation_system.model.Guest(35, "faculty", "guest", "Faculty", false);
    }

    @Test
    public void test1991() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1991");
        com.reservation_system.model.Researcher researcher5 = new com.reservation_system.model.Researcher((int) ' ', "faculty", "faculty", "Student", true);
        boolean boolean6 = researcher5.requiresDepartmentApproval();
        java.lang.String str7 = researcher5.getEmail();
        boolean boolean8 = researcher5.requiresDepartmentApproval();
        java.lang.String str9 = researcher5.getEmail();
        java.lang.String str10 = researcher5.getUserType();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "faculty" + "'", str7, "faculty");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "faculty" + "'", str9, "faculty");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Researcher" + "'", str10, "Researcher");
    }

    @Test
    public void test1992() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1992");
        com.reservation_system.model.Researcher researcher5 = new com.reservation_system.model.Researcher((int) '4', "researcher", "", "guest", true);
        researcher5.setApproved(false);
        java.lang.String str8 = researcher5.getUserType();
        java.lang.String str9 = researcher5.getName();
        java.lang.String str10 = researcher5.getUserType();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Researcher" + "'", str8, "Researcher");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "researcher" + "'", str9, "researcher");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Researcher" + "'", str10, "Researcher");
    }

    @Test
    public void test1993() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1993");
        com.reservation_system.model.HeadLabCoordinator headLabCoordinator5 = new com.reservation_system.model.HeadLabCoordinator((int) (short) 1, "student", "Student", "labmanager", false);
        java.lang.String str6 = headLabCoordinator5.getName();
        java.lang.String str7 = headLabCoordinator5.getUserType();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "student" + "'", str6, "student");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "headlabcoordinator" + "'", str7, "headlabcoordinator");
    }

    @Test
    public void test1994() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1994");
        com.reservation_system.model.Faculty faculty5 = new com.reservation_system.model.Faculty((int) (short) -1, "Faculty", "guest", "guest", false);
        java.lang.String str6 = faculty5.getUserType();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Faculty" + "'", str6, "Faculty");
    }

    @Test
    public void test1995() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1995");
        com.reservation_system.model.Student student5 = new com.reservation_system.model.Student((int) (byte) -1, "headlabcoordinator", "", "Student", true);
    }

    @Test
    public void test1996() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1996");
        com.reservation_system.model.HeadLabCoordinator headLabCoordinator5 = new com.reservation_system.model.HeadLabCoordinator((int) '#', "headlabcoordinator", "guest", "Password1!", true);
        java.lang.String str6 = headLabCoordinator5.getEmail();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "guest" + "'", str6, "guest");
    }

    @Test
    public void test1997() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1997");
        com.reservation_system.model.Faculty faculty5 = new com.reservation_system.model.Faculty(52, "Andrew", "researcher", "labmanager", false);
        java.lang.String str6 = faculty5.getPassword();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "labmanager" + "'", str6, "labmanager");
    }

    @Test
    public void test1998() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1998");
        com.reservation_system.model.LabManager labManager5 = new com.reservation_system.model.LabManager((int) (short) 100, "hi!", "labmanager", "andrew@example.com", true);
        java.lang.String str6 = labManager5.getPassword();
        int int7 = labManager5.getID();
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 100 + "'", int7 == 100);
    }

    @Test
    public void test1999() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1999");
        com.reservation_system.model.LabManager labManager5 = new com.reservation_system.model.LabManager((int) '#', "guest", "", "guest", false);
    }

    @Test
    public void test2000() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test2000");
        com.reservation_system.model.User user6 = com.reservation_system.patterns.factory.UserFactory.createUser("headlabcoordinator", (int) '4', "researcher", "", "guest", false);
        org.junit.Assert.assertNotNull(user6);
    }
}

