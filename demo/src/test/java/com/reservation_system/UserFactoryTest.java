package com.reservation_system;

import com.reservation_system.model.student;
import com.reservation_system.model.user;
import com.reservation_system.patterns.factory.UserFactory;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class UserFactoryTest {

    @Test
    void shouldCreateStudent() {
        user user = UserFactory.createUser("Student", 1, "Andrew", "a@yorku.ca", "pass123");
        assertInstanceOf(student.class, user);
        assertEquals("Student", user.getUserType());
    }

    @Test
    void shouldThrowExceptionForInvalidType() {
        assertThrows(IllegalArgumentException.class, () ->
                UserFactory.createUser("Admin", 1, "Andrew", "a@yorku.ca", "pass123")
        );
    }
}
