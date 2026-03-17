package com.reservation_system;

import com.reservation_system.model.Student;
import com.reservation_system.model.User;
import com.reservation_system.patterns.factory.UserFactory;
import com.reservation_system.repository.UserRepository;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class UserRepositoryTest {

    private UserRepository repository;
    private Path testFile = Path.of("data/test-users.csv");

    @BeforeEach
    void setUp() throws Exception {
        Files.createDirectories(testFile.getParent());

        Files.writeString(testFile,
                "name,id,email,password,type,approved\n" +
                "t1,1,t1@yorku.ca,T1@test!,student,true\n" +
                "t2,2,t2@yorku.ca,T2@test!,faculty,true\n" +
                "t3,3,t3@yorku.ca,T3@test!,guest,true\n"
        );

        repository = new UserRepository("data/test-users.csv");
    }

    @Test
    void shouldLoadAllUsers() {
        List<User> users = repository.getAllUsers();
        assertEquals(3, users.size());
    }

    @Test
    void shouldFindUserByEmail() {
        User foundUser = repository.findByEmail("t1@yorku.ca").orElse(null);

        assertNotNull(foundUser);
        assertEquals("t1", foundUser.getName());
    }

    @Test
    void shouldReturnEmptyWhenEmailDoesNotExist() {
        assertTrue(repository.findByEmail("missing@yorku.ca").isEmpty());
    }

    @Test
    void shouldReturnTrueWhenEmailExists() {
        assertTrue(repository.emailExists("t2@yorku.ca"));
    }

    @Test
    void shouldReturnFalseWhenEmailDoesNotExist() {
        assertFalse(repository.emailExists("nope@yorku.ca"));
    }

    @Test
    void shouldReturnNextAvailableID() {
        assertEquals(4, repository.getNextID());
    }

    @Test
    void shouldAddUserToRepository() {
        User newUser = UserFactory.createUser(
                "student", 4, "t4", "t4@yorku.ca", "Strong1!", true
        );

        repository.addUser(newUser);

        List<User> users = repository.getAllUsers();
        assertEquals(4, users.size());
        assertTrue(repository.emailExists("t4@yorku.ca"));
    }

    @Test
    void shouldPersistAddedUserToCsv() {
        User newUser = UserFactory.createUser(
                "guest", 4, "t4", "t4@gmail.com", "Strong1!", true
        );

        repository.addUser(newUser);

        UserRepository newRepository = new UserRepository("data/test-users.csv");
        assertTrue(newRepository.emailExists("t4@gmail.com"));
    }

    @Test
    void shouldCreateCorrectSubtypeFromCsv() {
        List<User> users = repository.getAllUsers();

        assertTrue(users.get(0) instanceof Student);
    }

    @Test
    void shouldLoadApprovedStatusFromCsv() {
        List<User> users = repository.getAllUsers();

        assertTrue(users.get(0).isApproved());
        assertTrue(users.get(1).isApproved());
        assertTrue(users.get(2).isApproved());
    }

    @Test
    void shouldLoadZeroUsersWhenOnlyHeaderExists() throws Exception {
        Files.writeString(testFile, "name,id,email,password,type,approved\n");

        repository = new UserRepository("data/test-users.csv");

        List<User> users = repository.getAllUsers();
        assertEquals(0, users.size());
    }
}