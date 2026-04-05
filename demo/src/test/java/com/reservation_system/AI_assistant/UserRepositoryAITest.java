package com.reservation_system.AI_assistant;

import com.reservation_system.model.Faculty;
import com.reservation_system.model.HeadLabCoordinator;
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

public class UserRepositoryAITest {

    private UserRepository repository;
    private Path testFile;

    @BeforeEach
    void setUp() throws Exception {
        testFile = Path.of("data/test-users.csv");
        Files.createDirectories(testFile.getParent());

        Files.writeString(testFile,
                "name,id,email,password,type,approved\n" +
                "t1,1,t1@yorku.ca,T1@test!,student,true\n" +
                "t2,2,t2@yorku.ca,T2@test!,faculty,true\n" +
                "t3,3,t3@yorku.ca,T3@test!,guest,false\n"
        );

        repository = new UserRepository(testFile.toString());
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
    void shouldFindUserByEmailIgnoringCase() {
        User foundUser = repository.findByEmail("T1@YORKU.CA").orElse(null);

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
    void shouldReturnOneWhenNoUsersExist() throws Exception {
        Files.writeString(testFile, "name,id,email,password,type,approved\n");
        repository = new UserRepository(testFile.toString());

        assertEquals(1, repository.getNextID());
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

        UserRepository newRepository = new UserRepository(testFile.toString());
        assertTrue(newRepository.emailExists("t4@gmail.com"));
    }

    @Test
    void shouldSaveAllUsers() {
        List<User> users = List.of(
                UserFactory.createUser("student", 1, "A", "a@yorku.ca", "Strong1!", true),
                UserFactory.createUser("faculty", 2, "B", "b@yorku.ca", "Strong2!", false)
        );

        repository.saveAllUsers(users);

        List<User> loadedUsers = repository.getAllUsers();
        assertEquals(2, loadedUsers.size());
        assertEquals("a@yorku.ca", loadedUsers.get(0).getEmail());
        assertEquals("b@yorku.ca", loadedUsers.get(1).getEmail());
        assertFalse(loadedUsers.get(1).isApproved());
    }

    @Test
    void shouldCreateCorrectSubtypeFromCsv() {
        List<User> users = repository.getAllUsers();

        assertTrue(users.get(0) instanceof Student);
        assertTrue(users.get(1) instanceof Faculty);
    }

    @Test
    void shouldLoadApprovedStatusFromCsv() {
        List<User> users = repository.getAllUsers();

        assertTrue(users.get(0).isApproved());
        assertTrue(users.get(1).isApproved());
        assertFalse(users.get(2).isApproved());
    }

    @Test
    void shouldLoadZeroUsersWhenOnlyHeaderExists() throws Exception {
        Files.writeString(testFile, "name,id,email,password,type,approved\n");
        repository = new UserRepository(testFile.toString());

        List<User> users = repository.getAllUsers();
        assertEquals(0, users.size());
    }

    @Test
    void shouldSkipMalformedCsvLines() throws Exception {
        Files.writeString(testFile,
                "name,id,email,password,type,approved\n" +
                "good,1,good@yorku.ca,Pass1!,student,true\n" +
                "badline,2,missingparts\n" +
                "good2,3,good2@yorku.ca,Pass2!,guest,true\n"
        );

        repository = new UserRepository(testFile.toString());
        List<User> users = repository.getAllUsers();

        assertEquals(2, users.size());
        assertTrue(repository.emailExists("good@yorku.ca"));
        assertTrue(repository.emailExists("good2@yorku.ca"));
    }

    @Test
    void shouldReturnFalseWhenNoHeadLabCoordinatorExists() {
        assertFalse(repository.headLabCoordinatorExists());
    }

    @Test
    void shouldReturnTrueWhenHeadLabCoordinatorExists() {
        User coordinator = UserFactory.createUser(
                "headlabcoordinator", 4, "Coord", "coord@yorku.ca", "Strong1!", true
        );

        repository.addUser(coordinator);

        assertTrue(repository.headLabCoordinatorExists());
    }

    @Test
    void shouldCreateFileAndHeaderWhenFileDoesNotExist() throws Exception {
        Path newFile = Path.of("data/new-users.csv");
        Files.deleteIfExists(newFile);

        UserRepository newRepository = new UserRepository(newFile.toString());

        assertTrue(Files.exists(newFile));

        List<String> lines = Files.readAllLines(newFile);
        assertFalse(lines.isEmpty());
        assertEquals("name,id,email,password,type,approved", lines.get(0));

        assertEquals(0, newRepository.getAllUsers().size());
    }

    @Test
    void shouldLoadHeadLabCoordinatorSubtypeFromCsv() throws Exception {
        Files.writeString(testFile,
                "name,id,email,password,type,approved\n" +
                "coord,1,coord@yorku.ca,Pass1!,headlabcoordinator,true\n"
        );

        repository = new UserRepository(testFile.toString());
        List<User> users = repository.getAllUsers();

        assertEquals(1, users.size());
        assertTrue(users.get(0) instanceof HeadLabCoordinator);
    }
}
