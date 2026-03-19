package com.reservation_system;

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

public class CoordinatorAccountServiceTest {
    private CoordinatorAccountService coordinatorAccountService;
    private Path testFile = Path.of("data/test-users.csv");

    @BeforeEach
    void setUp() throws Exception {
        Files.createDirectories(testFile.getParent());
        Files.writeString(testFile, "name,id,email,password,type,approved\n");
        UserRepository repository = new UserRepository("data/test-users.csv");
        coordinatorAccountService = new CoordinatorAccountService(repository);
    }

    @Test
    void shouldCreateHeadLabCoordinatorWhenNoneExists() {
        User coordinator = coordinatorAccountService.createHeadLabCoordinator(
                "Coordinator",
                "coord@yorku.ca",
                "Strong1!"
        );

        assertEquals("headlabcoordinator", coordinator.getUserType());
        assertTrue(coordinator.isApproved());
    }

    @Test
    void shouldRejectSecondHeadLabCoordinator() {
        coordinatorAccountService.createHeadLabCoordinator(
                "Coordinator1",
                "coord1@yorku.ca",
                "Strong1!"
        );

        assertThrows(IllegalStateException.class, () ->
                coordinatorAccountService.createHeadLabCoordinator(
                        "Coordinator2",
                        "coord2@yorku.ca",
                        "Strong1!"
                )
        );
    }

    @Test
    void shouldAllowHeadLabCoordinatorToGenerateLabManager() {
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

        assertEquals("labmanager", manager.getUserType());
        assertTrue(manager.isApproved());
    }

    @Test
    void shouldRejectNonCoordinatorGeneratingLabManager() {
        User student = new Student(1, "Student1", "student1@yorku.ca", "Strong1!", true);

        assertThrows(IllegalArgumentException.class, () ->
                coordinatorAccountService.autoGenerateLabManagerAccount(
                        student,
                        "Manager1",
                        "manager1@yorku.ca",
                        "Strong1!"
                )
        );
    }

    @Test
    void shouldPersistGeneratedLabManager() {
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

        UserRepository repository = new UserRepository("data/test-users.csv");
        assertTrue(repository.emailExists("manager1@yorku.ca"));
    }

    @Test
    void shouldRejectDuplicateEmailForLabManager() {
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

        assertThrows(IllegalArgumentException.class, () ->
                coordinatorAccountService.autoGenerateLabManagerAccount(
                        coordinator,
                        "Manager2",
                        "manager1@yorku.ca",
                        "Strong1!"
                )
        );
    }

    @Test
    void shouldRejectUnapprovedCoordinatorGeneratingLabManager() {
        User unapprovedCoordinator = new HeadLabCoordinator(
                99, "Coord", "coord2@yorku.ca", "Strong1!", false
        );

        assertThrows(IllegalStateException.class, () ->
                coordinatorAccountService.autoGenerateLabManagerAccount(
                        unapprovedCoordinator,
                        "Manager1",
                        "manager1@yorku.ca",
                        "Strong1!"
                )
        );
    }
}
