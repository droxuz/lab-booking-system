package com.reservation_system;

import com.reservation_system.model.User;
import com.reservation_system.patterns.factory.UserFactory;
import com.reservation_system.repository.UserRepository;
import com.reservation_system.services.AuthService;
import org.junit.jupiter.api.Test;

import java.util.Optional;

import static org.junit.jupiter.api.Assertions.*;

public class AuthServiceTest {

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
    void loginValidCredentialsReturnsUser() {
        User user = createUser();
        AuthService authService = new AuthService(new FakeUserRepository(user));

        User result = authService.login("test@example.com", "Password1!");

        assertNotNull(result);
        assertEquals("test@example.com", result.getEmail());
        assertEquals("Andrew", result.getName());
    }

    @Test
    void loginNullEmailThrowsException() {
        AuthService authService = new AuthService(new FakeUserRepository(createUser()));

        IllegalArgumentException ex = assertThrows(IllegalArgumentException.class,
                () -> authService.login(null, "Password1!"));

        assertEquals("Email is required.", ex.getMessage());
    }


    @Test
    void loginEmptyEmailThrowsException() {
        AuthService authService = new AuthService(new FakeUserRepository(createUser()));

        IllegalArgumentException ex = assertThrows(IllegalArgumentException.class,
                () -> authService.login("", "Password1!"));

        assertEquals("Email is required.", ex.getMessage());
    }

    @Test
    void loginNullPasswordThrowsException() {
        AuthService authService = new AuthService(new FakeUserRepository(createUser()));

        IllegalArgumentException ex = assertThrows(IllegalArgumentException.class,
                () -> authService.login("test@example.com", null));

        assertEquals("Password is required.", ex.getMessage());
    }

    @Test
    void loginBlankPasswordThrowsException() {
        AuthService authService = new AuthService(new FakeUserRepository(createUser()));

        IllegalArgumentException ex = assertThrows(IllegalArgumentException.class,
                () -> authService.login("test@example.com", "   "));

        assertEquals("Password is required.", ex.getMessage());
    }

    @Test
    void loginEmptyPasswordThrowsException() {
        AuthService authService = new AuthService(new FakeUserRepository(createUser()));

        IllegalArgumentException ex = assertThrows(IllegalArgumentException.class,
                () -> authService.login("test@example.com", ""));

        assertEquals("Password is required.", ex.getMessage());
    }

    @Test
    void loginEmailNotFoundThrowsException() {
        AuthService authService = new AuthService(new FakeUserRepository(null));

        IllegalArgumentException ex = assertThrows(IllegalArgumentException.class,
                () -> authService.login("missing@example.com", "Password1!"));

        assertEquals("No user found with that email.", ex.getMessage());
    }

    @Test
    void loginWrongPasswordThrowsException() {
        User user = createUser();
        AuthService authService = new AuthService(new FakeUserRepository(user));

        IllegalArgumentException ex = assertThrows(IllegalArgumentException.class,
                () -> authService.login("test@example.com", "WrongPassword1!"));

        assertEquals("Incorrect password.", ex.getMessage());
    }

}
