package com.reservation_system;

import com.reservation_system.model.User;
import com.reservation_system.repository.UserRepository;
import com.reservation_system.services.RegistrationService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.nio.file.Files;
import java.nio.file.Path;

import static org.junit.jupiter.api.Assertions.*;

public class UserRegistrationServiceTest {

    private RegistrationService registrationService;
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

        UserRepository repository = new UserRepository("data/test-users.csv");
        registrationService = new RegistrationService(repository);
    }

    @Test
        void shouldRegisterValidGuest() {
        User newUser = registrationService.registerUser(
                "guest", "guest1", "guest1@gmail.com", "Strong1!"
        );

        assertNotNull(newUser);
        assertEquals("guest", newUser.getUserType().toLowerCase());
        assertTrue(newUser.isApproved());
    }

    @Test
        void shouldRegisterValidStudent() {
        User newUser = registrationService.registerUser(
                "student", "student1", "student1@yorku.ca", "Strong1!"
        );

        assertNotNull(newUser);
        assertEquals("student", newUser.getUserType().toLowerCase());
        assertTrue(newUser.isApproved());
    }

    @Test
        void shouldRegisterValidFaculty() {
        User newUser = registrationService.registerUser(
                "faculty", "faculty1", "faculty1@yorku.ca", "Strong1!"
        );

        assertNotNull(newUser);
        assertEquals("faculty", newUser.getUserType().toLowerCase());
        assertTrue(newUser.isApproved());
    }

    @Test
        void shouldRegisterValidResearcher() {
        User newUser = registrationService.registerUser(
                "researcher", "researcher1", "researcher1@yorku.ca", "Strong1!"
        );

        assertNotNull(newUser);
        assertEquals("researcher", newUser.getUserType().toLowerCase());
        assertTrue(newUser.isApproved());
    }

    @Test
        void shouldRejectDuplicateEmail() {
        assertThrows(IllegalArgumentException.class, () ->
                registrationService.registerUser(
                        "student", "test", "t1@yorku.ca", "Strong1!"
                )
        );
    }

    @Test
        void shouldRejectInvalidEmail() {
        assertThrows(IllegalArgumentException.class, () ->
                registrationService.registerUser(
                        "student", "test", "invalid-email", "Strong1!"
                )
        );
    }

    @Test
        void shouldRejectBlankEmail() {
        assertThrows(IllegalArgumentException.class, () ->
                registrationService.registerUser(
                        "student", "test", "", "Strong1!"
                )
        );
    }

    @Test
        void shouldRejectBlankName() {
        assertThrows(IllegalArgumentException.class, () ->
                registrationService.registerUser(
                        "student", "", "new@yorku.ca", "Strong1!"
                )
        );
    }

    @Test
        void shouldRejectBlankType() {
        assertThrows(IllegalArgumentException.class, () ->
                registrationService.registerUser(
                        "", "test", "new@yorku.ca", "Strong1!"
                )
        );
    }

    @Test
        void shouldRejectInvalidType() {
        assertThrows(IllegalArgumentException.class, () ->
                registrationService.registerUser(
                        "admin", "test", "new@yorku.ca", "Strong1!"
                )
        );
    }

    @Test
        void shouldRejectBlankPassword() {
        assertThrows(IllegalArgumentException.class, () ->
                registrationService.registerUser(
                        "student", "test", "new@yorku.ca", ""
                )
        );
    }

    @Test
        void shouldRejectPasswordWithoutUppercase() {
        assertThrows(IllegalArgumentException.class, () ->
                registrationService.registerUser(
                        "student", "test", "new1@yorku.ca", "weak1!"
                )
        );
    }

    @Test
        void shouldRejectPasswordWithoutLowercase() {
        assertThrows(IllegalArgumentException.class, () ->
                registrationService.registerUser(
                        "student", "test", "new2@yorku.ca", "WEAK1!"
                )
        );
    }

    @Test
        void shouldRejectPasswordWithoutNumber() {
        assertThrows(IllegalArgumentException.class, () ->
                registrationService.registerUser(
                        "student", "test", "new3@yorku.ca", "Weak!!"
                )
        );
    }

    @Test
        void shouldRejectPasswordWithoutSymbol() {
        assertThrows(IllegalArgumentException.class, () ->
                registrationService.registerUser(
                        "student", "test", "new4@yorku.ca", "Weak1234"
                )
        );
    }

    @Test
        void shouldRejectShortPassword() {
        assertThrows(IllegalArgumentException.class, () ->
                registrationService.registerUser(
                        "student", "test", "new5@yorku.ca", "S1!a"
                )
        );
    }

    @Test
        void shouldPersistRegisteredUserToCsv() {
        registrationService.registerUser(
                "guest", "persist", "persist@gmail.com", "Strong1!"
        );

        UserRepository newRepository = new UserRepository("data/test-users.csv");
        assertTrue(newRepository.emailExists("persist@gmail.com"));
    }

    @Test
        void shouldAssignNextAvailableIdToRegisteredUser() {
        User newUser = registrationService.registerUser(
                "guest", "nextid", "nextid@gmail.com", "Strong1!"
        );

        assertEquals(4, newUser.getID());
    }

    @Test
        void shouldCreateCorrectSubtypeForStudent() {
        User newUser = registrationService.registerUser(
                "student", "student2", "student2@yorku.ca", "Strong1!"
        );

        assertEquals("student", newUser.getUserType().toLowerCase());
    }

    @Test
        void shouldCreateCorrectSubtypeForGuest() {
        User newUser = registrationService.registerUser(
                "guest", "guest2", "guest2@gmail.com", "Strong1!"
        );

        assertEquals("guest", newUser.getUserType().toLowerCase());
    }

    @Test
        void shouldSetGuestAsApproved() {
        User newUser = registrationService.registerUser(
                "guest", "guest3", "guest3@gmail.com", "Strong1!"
        );

        assertTrue(newUser.isApproved());
    }

    @Test
        void shouldSetStudentAsApproved() {
        User newUser = registrationService.registerUser(
                "student", "student3", "student3@yorku.ca", "Strong1!"
        );

        assertTrue(newUser.isApproved());
    }

    @Test
        void shouldSetFacultyAsApproved() {
        User newUser = registrationService.registerUser(
                "faculty", "faculty2", "faculty2@yorku.ca", "Strong1!"
        );

        assertTrue(newUser.isApproved());
    }

    @Test
        void shouldSetResearcherAsApproved() {
        User newUser = registrationService.registerUser(
                "researcher", "researcher2", "researcher2@yorku.ca", "Strong1!"
        );

        assertTrue(newUser.isApproved());
        }

        @Test
        void shouldAllowFirstHeadLabCoordinatorRegistration() {
        User user = registrationService.registerUser(
            "headlabcoordinator",
            "Coordinator",
            "coord@yorku.ca",
            "Strong1!"
        );

        assertEquals("headlabcoordinator", user.getUserType());
        }       
        @Test
        void shouldRejectSecondHeadLabCoordinatorRegistration() {
        registrationService.registerUser(
            "headlabcoordinator",
            "Coordinator1",
            "coord1@yorku.ca",
            "Strong1!"
        );

        assertThrows(IllegalArgumentException.class, () ->
            registrationService.registerUser(
                    "headlabcoordinator",
                    "Coordinator2",
                    "coord2@yorku.ca",
                    "Strong1!"
            )); 
        }
        @Test
        void shouldRejectLabManagerSelfRegistration() {
        assertThrows(IllegalArgumentException.class, () ->
            registrationService.registerUser(
                    "labmanager",
                    "Manager1",
                    "manager1@yorku.ca",
                    "Strong1!"
                ));
        }
}
