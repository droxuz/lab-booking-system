package com.reservation_system.Randoop.CoordinatorService;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class ErrorTest0 {

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
    public void test01() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test01");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("manager1@yorku.ca");
    }

    @Test
    public void test02() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test02");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("Coordinator");
    }

    @Test
    public void test03() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test03");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("");
    }

    @Test
    public void test04() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test04");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("coord@yorku.ca");
    }

    @Test
    public void test05() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test05");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("hi!");
    }

    @Test
    public void test06() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test06");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("labmanager");
    }

    @Test
    public void test07() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test07");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("Guest");
    }

    @Test
    public void test08() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test08");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("Coordinator2");
    }

    @Test
    public void test09() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test09");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("coord2@yorku.ca");
    }

    @Test
    public void test10() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test10");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("Researcher");
    }

    @Test
    public void test11() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test11");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("Manager1");
    }

    @Test
    public void test12() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test12");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("headlabcoordinator");
    }

    @Test
    public void test13() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test13");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("Strong1!");
    }

    @Test
    public void test14() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test14");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("Student");
    }

    @Test
    public void test15() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test15");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.reservation_system.repository.UserRepository userRepository1 = new com.reservation_system.repository.UserRepository("Faculty");
    }
}

