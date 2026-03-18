package com.reservation_system;

import com.reservation_system.model.*;
import com.reservation_system.patterns.factory.UserFactory;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class UserFactoryTest {

    @Test
    void shouldCreateStudent() {
        User user = UserFactory.createUser(
                "student", 1, "Andrew", "a@yorku.ca", "Strong1!", true
        );

        assertInstanceOf(Student.class, user);
        assertEquals("student", user.getUserType().toLowerCase());
        assertTrue(user.isApproved());
    }

    @Test
    void shouldCreateFaculty() {
        User user = UserFactory.createUser(
                "faculty", 2, "Prof", "prof@yorku.ca", "Strong1!", true
        );

        assertInstanceOf(Faculty.class, user);
        assertEquals("faculty", user.getUserType().toLowerCase());
    }

    @Test
    void shouldCreateResearcher() {
        User user = UserFactory.createUser(
                "researcher", 3, "Res", "res@yorku.ca", "Strong1!", true
        );

        assertInstanceOf(Researcher.class, user);
        assertEquals("researcher", user.getUserType().toLowerCase());
    }

    @Test
    void shouldCreateGuest() {
        User user = UserFactory.createUser(
                "guest", 4, "Guest", "guest@gmail.com", "Strong1!", true
        );

        assertInstanceOf(Guest.class, user);
        assertEquals("guest", user.getUserType().toLowerCase());
    }

    @Test
    void shouldHandleCaseInsensitiveType() {
        User user = UserFactory.createUser(
                "StUdEnT", 5, "Test", "test@yorku.ca", "Strong1!", true
        );

        assertInstanceOf(Student.class, user);
    }

    @Test
    void shouldThrowExceptionForInvalidType() {
        assertThrows(IllegalArgumentException.class, () ->
                UserFactory.createUser(
                        "admin", 6, "Andrew", "a@yorku.ca", "Strong1!", true
                )
        );
    }

    @Test
    void shouldThrowExceptionForNullType() {
        assertThrows(IllegalArgumentException.class, () ->
                UserFactory.createUser(
                        null, 7, "Andrew", "a@yorku.ca", "Strong1!", true
                )
        );
    }
}
