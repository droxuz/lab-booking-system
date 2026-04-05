package com.reservation_system.gui;

import com.reservation_system.model.User;
import com.reservation_system.patterns.observer.EquipmentRegistry;
import com.reservation_system.repository.UserRepository;
import com.reservation_system.services.AuthService;
import com.reservation_system.services.CoordinatorAccountService;
import com.reservation_system.services.EquipmentManagementService;
import com.reservation_system.services.RegistrationService;
import com.reservation_system.services.ReservationService;

import javax.swing.*;
import java.awt.*;

public class MainUI extends JFrame {

    private final CardLayout cardLayout;
    private final JPanel mainPanel;

    private final UserRepository             userRepository;
    private final RegistrationService        registrationService;
    private final AuthService                authenticationService;
    private final CoordinatorAccountService  coordinatorAccountService;
    private final EquipmentManagementService equipmentManagementService;
    private final EquipmentRegistry          equipmentRegistry;
    private final ReservationService         reservationService;

    private final LoginPanel              loginPanel;
    private final RegisterPanel           registerPanel;
    private final DashboardPanel          dashboardPanel;
    private final GenerateLabManagerPanel generateLabManagerPanel;
    private final LabManagerPanel         labManagerPanel;
    private final ReservationPanel        reservationPanel;

    public MainUI() {
        super("Lab Equipment Reservation System");

        userRepository            = new UserRepository("data/users.csv");
        registrationService       = new RegistrationService(userRepository);
        authenticationService     = new AuthService(userRepository);
        coordinatorAccountService = new CoordinatorAccountService(userRepository);
        equipmentManagementService = new EquipmentManagementService();
        equipmentRegistry         = new EquipmentRegistry();
        reservationService        = new ReservationService();

        cardLayout = new CardLayout();
        mainPanel  = new JPanel(cardLayout);

        loginPanel              = new LoginPanel(this, authenticationService);
        registerPanel           = new RegisterPanel(this, registrationService);
        dashboardPanel          = new DashboardPanel(this);
        generateLabManagerPanel = new GenerateLabManagerPanel(this, coordinatorAccountService);
        labManagerPanel = new LabManagerPanel(this, equipmentManagementService);
        reservationPanel        = new ReservationPanel(this, reservationService);

        equipmentRegistry.addObserver(reservationPanel);
        labManagerPanel.loadEquipmentFromCSV();

        mainPanel.add(loginPanel,              "login");
        mainPanel.add(registerPanel,           "register");
        mainPanel.add(dashboardPanel,          "dashboard");
        mainPanel.add(generateLabManagerPanel, "generateLabManager");
        mainPanel.add(labManagerPanel,         "labManager");
        mainPanel.add(reservationPanel,        "reservation");

        add(mainPanel);

        showScreen("login");

        setSize(900, 580);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
    }

    public void showScreen(String screenName) {
        cardLayout.show(mainPanel, screenName);
    }

    public void showDashboard(User user) {
        dashboardPanel.setUser(user);
        showScreen("dashboard");
    }

    public void showGenerateLabManagerPanel(User user) {
        generateLabManagerPanel.setCurrentUser(user);
        showScreen("generateLabManager");
    }

    public void showLabManagerPanel(User user) {
        labManagerPanel.setCurrentUser(user);
        showScreen("labManager");
    }

    public void showReservationPanel(User user) {
        reservationPanel.setCurrentUser(user);
        showScreen("reservation");
    }
}