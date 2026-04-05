package com.reservation_system.AI_assistant;

import com.reservation_system.model.*;
import com.reservation_system.patterns.factory.UserFactory;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class UserFactoryAITest {

    @Test
    void shouldCreateStudent() {
        User user = UserFactory.createUser(
                "student", 1, "Andrew", "a@yorku.ca", "Strong1!", true
        );

        assertInstanceOf(Student.class, user);
    }

    @Test
    void shouldCreateFaculty() {
        User user = UserFactory.createUser(
                "faculty", 2, "Prof", "prof@yorku.ca", "Strong1!", true
        );

        assertInstanceOf(Faculty.class, user);
    }

    @Test
    void shouldCreateResearcher() {
        User user = UserFactory.createUser(
                "researcher", 3, "Res", "res@yorku.ca", "Strong1!", true
        );

        assertInstanceOf(Researcher.class, user);
    }

    @Test
    void shouldCreateGuest() {
        User user = UserFactory.createUser(
                "guest", 4, "Guest", "guest@gmail.com", "Strong1!", true
        );

        assertInstanceOf(Guest.class, user);
    }

    @Test
    void shouldCreateHeadLabCoordinator() {
        User user = UserFactory.createUser(
                "headlabcoordinator", 5, "Head", "head@yorku.ca", "Strong1!", true
        );

        assertInstanceOf(HeadLabCoordinator.class, user);
    }

    @Test
    void shouldCreateLabManager() {
        User user = UserFactory.createUser(
                "labmanager", 6, "Manager", "manager@yorku.ca", "Strong1!", true
        );

        assertInstanceOf(LabManager.class, user);
    }

    @Test
    void shouldHandleCaseInsensitiveType() {
        User user = UserFactory.createUser(
                "StUdEnT", 7, "Test", "test@yorku.ca", "Strong1!", true
        );

        assertInstanceOf(Student.class, user);
    }

    @Test
    void shouldTrimWhitespaceAroundType() {
        User user = UserFactory.createUser(
                "   faculty   ", 8, "Prof", "prof@yorku.ca", "Strong1!", true
        );

        assertInstanceOf(Faculty.class, user);
    }

    @Test
    void shouldCreateUserWhenApprovedIsFalse() {
        User user = UserFactory.createUser(
                "guest", 9, "Guest", "guest@gmail.com", "Strong1!", false
        );

        assertInstanceOf(Guest.class, user);
    }

    @Test
    void shouldThrowExceptionForInvalidType() {
        IllegalArgumentException exception = assertThrows(
                IllegalArgumentException.class,
                () -> UserFactory.createUser(
                        "admin", 10, "Andrew", "a@yorku.ca", "Strong1!", true
                )
        );

        assertEquals("Invalid user type: admin", exception.getMessage());
    }

    @Test
    void shouldThrowExceptionForNullType() {
        IllegalArgumentException exception = assertThrows(
                IllegalArgumentException.class,
                () -> UserFactory.createUser(
                        null, 11, "Andrew", "a@yorku.ca", "Strong1!", true
                )
        );

        assertEquals("User type cannot be null.", exception.getMessage());
    }

    @Test
    void shouldThrowExceptionForBlankType() {
        IllegalArgumentException exception = assertThrows(
                IllegalArgumentException.class,
                () -> UserFactory.createUser(
                        "   ", 12, "Andrew", "a@yorku.ca", "Strong1!", true
                )
        );

        assertEquals("Invalid user type:    ", exception.getMessage());
    }
}