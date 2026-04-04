package com.reservation_system.AI_assistant;

import com.reservation_system.model.User;
import com.reservation_system.patterns.factory.UserFactory;
import com.reservation_system.repository.UserRepository;
import com.reservation_system.services.AuthService;
import org.junit.jupiter.api.Test;

import java.util.Optional;

import static org.junit.jupiter.api.Assertions.*;

public class AuthServiceAITest {

    static class FakeUserRepository extends UserRepository {
        private final User storedUser;

        public FakeUserRepository(User user) {
            super("data/test-users.csv");
            this.storedUser = user;
        }

        @Override
        public Optional<User> findByEmail(String email) {
            if (storedUser != null && storedUser.getEmail().equalsIgnoreCase(email)) {
                return Optional.of(storedUser);
            }
            return Optional.empty();
        }
    }

    private User createUser() {
        return UserFactory.createUser(
                "student",
                1,
                "Andrew",
                "test@example.com",
                "Password1!",
                true
        );
    }

    @Test
    void login_validCredentials_returnsUser() {
        User user = createUser();
        AuthService authService = new AuthService(new FakeUserRepository(user));

        User result = authService.login("test@example.com", "Password1!");

        assertNotNull(result);
        assertSame(user, result);
        assertEquals("test@example.com", result.getEmail());
        assertEquals("Andrew", result.getName());
        assertEquals("Password1!", result.getPassword());
    }

    @Test
    void login_emailCaseInsensitive_returnsUser() {
        User user = createUser();
        AuthService authService = new AuthService(new FakeUserRepository(user));

        User result = authService.login("TEST@EXAMPLE.COM", "Password1!");

        assertNotNull(result);
        assertSame(user, result);
        assertEquals("test@example.com", result.getEmail());
    }

    @Test
    void login_nullEmail_throwsException() {
        AuthService authService = new AuthService(new FakeUserRepository(createUser()));

        IllegalArgumentException ex = assertThrows(
                IllegalArgumentException.class,
                () -> authService.login(null, "Password1!")
        );

        assertEquals("Email is required.", ex.getMessage());
    }

    @Test
    void login_blankEmail_throwsException() {
        AuthService authService = new AuthService(new FakeUserRepository(createUser()));

        IllegalArgumentException ex = assertThrows(
                IllegalArgumentException.class,
                () -> authService.login("   ", "Password1!")
        );

        assertEquals("Email is required.", ex.getMessage());
    }

    @Test
    void login_emptyEmail_throwsException() {
        AuthService authService = new AuthService(new FakeUserRepository(createUser()));

        IllegalArgumentException ex = assertThrows(
                IllegalArgumentException.class,
                () -> authService.login("", "Password1!")
        );

        assertEquals("Email is required.", ex.getMessage());
    }

    @Test
    void login_nullPassword_throwsException() {
        AuthService authService = new AuthService(new FakeUserRepository(createUser()));

        IllegalArgumentException ex = assertThrows(
                IllegalArgumentException.class,
                () -> authService.login("test@example.com", null)
        );

        assertEquals("Password is required.", ex.getMessage());
    }

    @Test
    void login_blankPassword_throwsException() {
        AuthService authService = new AuthService(new FakeUserRepository(createUser()));

        IllegalArgumentException ex = assertThrows(
                IllegalArgumentException.class,
                () -> authService.login("test@example.com", "   ")
        );

        assertEquals("Password is required.", ex.getMessage());
    }

    @Test
    void login_emptyPassword_throwsException() {
        AuthService authService = new AuthService(new FakeUserRepository(createUser()));

        IllegalArgumentException ex = assertThrows(
                IllegalArgumentException.class,
                () -> authService.login("test@example.com", "")
        );

        assertEquals("Password is required.", ex.getMessage());
    }

    @Test
    void login_emailNotFound_throwsException() {
        AuthService authService = new AuthService(new FakeUserRepository(null));

        IllegalArgumentException ex = assertThrows(
                IllegalArgumentException.class,
                () -> authService.login("missing@example.com", "Password1!")
        );

        assertEquals("No user found with that email.", ex.getMessage());
    }

    @Test
    void login_wrongPassword_throwsException() {
        User user = createUser();
        AuthService authService = new AuthService(new FakeUserRepository(user));

        IllegalArgumentException ex = assertThrows(
                IllegalArgumentException.class,
                () -> authService.login("test@example.com", "WrongPassword1!")
        );

        assertEquals("Incorrect password.", ex.getMessage());
    }

    @Test
    void login_passwordIsCaseSensitive_throwsException() {
        User user = createUser();
        AuthService authService = new AuthService(new FakeUserRepository(user));

        IllegalArgumentException ex = assertThrows(
                IllegalArgumentException.class,
                () -> authService.login("test@example.com", "password1!")
        );

        assertEquals("Incorrect password.", ex.getMessage());
    }
}
