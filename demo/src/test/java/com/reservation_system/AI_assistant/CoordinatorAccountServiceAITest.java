package com.reservation_system.AI_assistant;

import com.reservation_system.model.HeadLabCoordinator;
import com.reservation_system.model.Student;
import com.reservation_system.model.User;
import com.reservation_system.repository.UserRepository;
import com.reservation_system.services.CoordinatorAccountService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.nio.file.Files;
import java.nio.file.Path;

import static org.junit.jupiter.api.Assertions.*;

public class CoordinatorAccountServiceAITest {

    private CoordinatorAccountService coordinatorAccountService;
    private Path testFile;

    @BeforeEach
    void setUp() throws Exception {
        testFile = Path.of("data/test-users.csv");
        Files.createDirectories(testFile.getParent());
        Files.writeString(testFile, "name,id,email,password,type,approved\n");

        UserRepository repository = new UserRepository(testFile.toString());
        coordinatorAccountService = new CoordinatorAccountService(repository);
    }

    @Test
    void createHeadLabCoordinator_validInput_returnsCoordinator() {
        User coordinator = coordinatorAccountService.createHeadLabCoordinator(
                "Coordinator",
                "coord@yorku.ca",
                "Strong1!"
        );

        assertNotNull(coordinator);
        assertEquals("headlabcoordinator", coordinator.getUserType());
        assertEquals("Coordinator", coordinator.getName());
        assertEquals("coord@yorku.ca", coordinator.getEmail());
        assertTrue(coordinator.isApproved());
    }

    @Test
    void createHeadLabCoordinator_persistsCoordinator() {
        coordinatorAccountService.createHeadLabCoordinator(
                "Coordinator",
                "coord@yorku.ca",
                "Strong1!"
        );

        UserRepository repository = new UserRepository(testFile.toString());
        assertTrue(repository.emailExists("coord@yorku.ca"));
        assertTrue(repository.headLabCoordinatorExists());
    }

    @Test
    void createHeadLabCoordinator_nullName_throwsException() {
        IllegalArgumentException ex = assertThrows(IllegalArgumentException.class, () ->
                coordinatorAccountService.createHeadLabCoordinator(
                        null,
                        "coord@yorku.ca",
                        "Strong1!"
                )
        );

        assertEquals("Name is required.", ex.getMessage());
    }

    @Test
    void createHeadLabCoordinator_blankName_throwsException() {
        IllegalArgumentException ex = assertThrows(IllegalArgumentException.class, () ->
                coordinatorAccountService.createHeadLabCoordinator(
                        "   ",
                        "coord@yorku.ca",
                        "Strong1!"
                )
        );

        assertEquals("Name is required.", ex.getMessage());
    }

    @Test
    void createHeadLabCoordinator_nullEmail_throwsException() {
        IllegalArgumentException ex = assertThrows(IllegalArgumentException.class, () ->
                coordinatorAccountService.createHeadLabCoordinator(
                        "Coordinator",
                        null,
                        "Strong1!"
                )
        );

        assertEquals("Email is required.", ex.getMessage());
    }

    @Test
    void createHeadLabCoordinator_blankEmail_throwsException() {
        IllegalArgumentException ex = assertThrows(IllegalArgumentException.class, () ->
                coordinatorAccountService.createHeadLabCoordinator(
                        "Coordinator",
                        "   ",
                        "Strong1!"
                )
        );

        assertEquals("Email is required.", ex.getMessage());
    }

    @Test
    void createHeadLabCoordinator_nullPassword_throwsException() {
        IllegalArgumentException ex = assertThrows(IllegalArgumentException.class, () ->
                coordinatorAccountService.createHeadLabCoordinator(
                        "Coordinator",
                        "coord@yorku.ca",
                        null
                )
        );

        assertEquals("Password is required.", ex.getMessage());
    }

    @Test
    void createHeadLabCoordinator_blankPassword_throwsException() {
        IllegalArgumentException ex = assertThrows(IllegalArgumentException.class, () ->
                coordinatorAccountService.createHeadLabCoordinator(
                        "Coordinator",
                        "coord@yorku.ca",
                        "   "
                )
        );

        assertEquals("Password is required.", ex.getMessage());
    }

    @Test
    void createHeadLabCoordinator_secondCoordinator_throwsException() {
        coordinatorAccountService.createHeadLabCoordinator(
                "Coordinator1",
                "coord1@yorku.ca",
                "Strong1!"
        );

        IllegalStateException ex = assertThrows(IllegalStateException.class, () ->
                coordinatorAccountService.createHeadLabCoordinator(
                        "Coordinator2",
                        "coord2@yorku.ca",
                        "Strong1!"
                )
        );

        assertEquals("Only one head lab coordinator account is allowed.", ex.getMessage());
    }

    @Test
    void createHeadLabCoordinator_duplicateEmail_throwsException() {
        coordinatorAccountService.createHeadLabCoordinator(
                "Coordinator1",
                "coord1@yorku.ca",
                "Strong1!"
        );

        IllegalStateException ex = assertThrows(IllegalStateException.class, () ->
                coordinatorAccountService.createHeadLabCoordinator(
                        "Coordinator2",
                        "coord1@yorku.ca",
                        "Strong2!"
                )
        );

        assertEquals("Only one head lab coordinator account is allowed.", ex.getMessage());
    }

    @Test
    void autoGenerateLabManagerAccount_validCoordinator_returnsManager() {
        User coordinator = coordinatorAccountService.createHeadLabCoordinator(
                "Coordinator",
                "coord@yorku.ca",
                "Strong1!"
        );

        User manager = coordinatorAccountService.autoGenerateLabManagerAccount(
                coordinator,
                "Manager1",
                "manager1@yorku.ca",
                "Strong1!"
        );

        assertNotNull(manager);
        assertEquals("labmanager", manager.getUserType());
        assertEquals("Manager1", manager.getName());
        assertEquals("manager1@yorku.ca", manager.getEmail());
        assertTrue(manager.isApproved());
    }

    @Test
    void autoGenerateLabManagerAccount_persistsManager() {
        User coordinator = coordinatorAccountService.createHeadLabCoordinator(
                "Coordinator",
                "coord@yorku.ca",
                "Strong1!"
        );

        coordinatorAccountService.autoGenerateLabManagerAccount(
                coordinator,
                "Manager1",
                "manager1@yorku.ca",
                "Strong1!"
        );

        UserRepository repository = new UserRepository(testFile.toString());
        assertTrue(repository.emailExists("manager1@yorku.ca"));
    }

    @Test
    void autoGenerateLabManagerAccount_nullName_throwsException() {
        User coordinator = new HeadLabCoordinator(1, "Coord", "coord@yorku.ca", "Strong1!", true);

        IllegalArgumentException ex = assertThrows(IllegalArgumentException.class, () ->
                coordinatorAccountService.autoGenerateLabManagerAccount(
                        coordinator,
                        null,
                        "manager1@yorku.ca",
                        "Strong1!"
                )
        );

        assertEquals("Name is required.", ex.getMessage());
    }

    @Test
    void autoGenerateLabManagerAccount_blankName_throwsException() {
        User coordinator = new HeadLabCoordinator(1, "Coord", "coord@yorku.ca", "Strong1!", true);

        IllegalArgumentException ex = assertThrows(IllegalArgumentException.class, () ->
                coordinatorAccountService.autoGenerateLabManagerAccount(
                        coordinator,
                        "   ",
                        "manager1@yorku.ca",
                        "Strong1!"
                )
        );

        assertEquals("Name is required.", ex.getMessage());
    }

    @Test
    void autoGenerateLabManagerAccount_nullEmail_throwsException() {
        User coordinator = new HeadLabCoordinator(1, "Coord", "coord@yorku.ca", "Strong1!", true);

        IllegalArgumentException ex = assertThrows(IllegalArgumentException.class, () ->
                coordinatorAccountService.autoGenerateLabManagerAccount(
                        coordinator,
                        "Manager1",
                        null,
                        "Strong1!"
                )
        );

        assertEquals("Email is required.", ex.getMessage());
    }

    @Test
    void autoGenerateLabManagerAccount_blankEmail_throwsException() {
        User coordinator = new HeadLabCoordinator(1, "Coord", "coord@yorku.ca", "Strong1!", true);

        IllegalArgumentException ex = assertThrows(IllegalArgumentException.class, () ->
                coordinatorAccountService.autoGenerateLabManagerAccount(
                        coordinator,
                        "Manager1",
                        "   ",
                        "Strong1!"
                )
        );

        assertEquals("Email is required.", ex.getMessage());
    }

    @Test
    void autoGenerateLabManagerAccount_nullPassword_throwsException() {
        User coordinator = new HeadLabCoordinator(1, "Coord", "coord@yorku.ca", "Strong1!", true);

        IllegalArgumentException ex = assertThrows(IllegalArgumentException.class, () ->
                coordinatorAccountService.autoGenerateLabManagerAccount(
                        coordinator,
                        "Manager1",
                        "manager1@yorku.ca",
                        null
                )
        );

        assertEquals("Password is required.", ex.getMessage());
    }

    @Test
    void autoGenerateLabManagerAccount_blankPassword_throwsException() {
        User coordinator = new HeadLabCoordinator(1, "Coord", "coord@yorku.ca", "Strong1!", true);

        IllegalArgumentException ex = assertThrows(IllegalArgumentException.class, () ->
                coordinatorAccountService.autoGenerateLabManagerAccount(
                        coordinator,
                        "Manager1",
                        "manager1@yorku.ca",
                        "   "
                )
        );

        assertEquals("Password is required.", ex.getMessage());
    }

    @Test
    void autoGenerateLabManagerAccount_nonCoordinator_throwsException() {
        User student = new Student(1, "Student1", "student1@yorku.ca", "Strong1!", true);

        IllegalArgumentException ex = assertThrows(IllegalArgumentException.class, () ->
                coordinatorAccountService.autoGenerateLabManagerAccount(
                        student,
                        "Manager1",
                        "manager1@yorku.ca",
                        "Strong1!"
                )
        );

        assertEquals("Only the head lab coordinator can generate lab manager accounts.", ex.getMessage());
    }

    @Test
    void autoGenerateLabManagerAccount_nullCurrentUser_throwsException() {
        IllegalArgumentException ex = assertThrows(IllegalArgumentException.class, () ->
                coordinatorAccountService.autoGenerateLabManagerAccount(
                        null,
                        "Manager1",
                        "manager1@yorku.ca",
                        "Strong1!"
                )
        );

        assertEquals("Only the head lab coordinator can generate lab manager accounts.", ex.getMessage());
    }

    @Test
    void autoGenerateLabManagerAccount_unapprovedCoordinator_throwsException() {
        User unapprovedCoordinator = new HeadLabCoordinator(
                99, "Coord", "coord2@yorku.ca", "Strong1!", false
        );

        IllegalStateException ex = assertThrows(IllegalStateException.class, () ->
                coordinatorAccountService.autoGenerateLabManagerAccount(
                        unapprovedCoordinator,
                        "Manager1",
                        "manager1@yorku.ca",
                        "Strong1!"
                )
        );

        assertEquals("Head lab coordinator account is not approved.", ex.getMessage());
    }

    @Test
    void autoGenerateLabManagerAccount_duplicateEmail_throwsException() {
        User coordinator = coordinatorAccountService.createHeadLabCoordinator(
                "Coordinator",
                "coord@yorku.ca",
                "Strong1!"
        );

        coordinatorAccountService.autoGenerateLabManagerAccount(
                coordinator,
                "Manager1",
                "manager1@yorku.ca",
                "Strong1!"
        );

        IllegalArgumentException ex = assertThrows(IllegalArgumentException.class, () ->
                coordinatorAccountService.autoGenerateLabManagerAccount(
                        coordinator,
                        "Manager2",
                        "manager1@yorku.ca",
                        "Strong1!"
                )
        );

        assertEquals("Email is already registered.", ex.getMessage());
    }
}
