package com.reservation_system.gui;

import com.reservation_system.Equipment.Equipment;
import com.reservation_system.Equipment.EquipmentType;
import com.reservation_system.Equipment.LabLocation;
import com.reservation_system.model.LabManager;
import com.reservation_system.model.User;
import com.reservation_system.services.EquipmentManagementService;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;
import java.util.List;

public class LabManagerPanel extends JPanel {

    private final MainUI mainUI;
    private final EquipmentManagementService equipmentManagementService;

    private User currentUser;

    private final JTextField descriptionField;
    private final JComboBox<EquipmentType> equipmentTypeComboBox;
    private final JComboBox<LabLocation> labLocationComboBox;

    private final DefaultListModel<Equipment> equipmentListModel;
    private final JList<Equipment> equipmentJList;

    private final JTextArea statusArea;

    private final List<Equipment> equipmentList;

    public LabManagerPanel(MainUI mainUI, EquipmentManagementService equipmentManagementService) {
        this.mainUI = mainUI;
        this.equipmentManagementService = equipmentManagementService;
        this.equipmentList = new ArrayList<>();

        setLayout(new BorderLayout());

        JLabel titleLabel = new JLabel("Lab Manager Equipment Control", SwingConstants.CENTER);
        titleLabel.setFont(new Font("Arial", Font.BOLD, 22));
        add(titleLabel, BorderLayout.NORTH);

        JPanel centerPanel = new JPanel(new GridLayout(1, 2));

        JPanel formPanel = new JPanel(new GridLayout(6, 2, 10, 10));
        formPanel.setBorder(BorderFactory.createEmptyBorder(20, 20, 20, 20));

        descriptionField = new JTextField();
        equipmentTypeComboBox = new JComboBox<>(EquipmentType.values());
        labLocationComboBox = new JComboBox<>(LabLocation.values());

        JButton addButton = new JButton("Add Equipment");
        JButton enableButton = new JButton("Enable");
        JButton disableButton = new JButton("Disable");
        JButton maintenanceButton = new JButton("Mark Maintenance");
        JButton backButton = new JButton("Back");

        formPanel.add(new JLabel("Description:"));
        formPanel.add(descriptionField);

        formPanel.add(new JLabel("Equipment Type:"));
        formPanel.add(equipmentTypeComboBox);

        formPanel.add(new JLabel("Lab Location:"));
        formPanel.add(labLocationComboBox);

        formPanel.add(addButton);
        formPanel.add(enableButton);

        formPanel.add(disableButton);
        formPanel.add(maintenanceButton);

        formPanel.add(new JLabel());
        formPanel.add(backButton);

        equipmentListModel = new DefaultListModel<>();
        equipmentJList = new JList<>(equipmentListModel);
        JScrollPane listScrollPane = new JScrollPane(equipmentJList);

        centerPanel.add(formPanel);
        centerPanel.add(listScrollPane);

        add(centerPanel, BorderLayout.CENTER);

        statusArea = new JTextArea(6, 20);
        statusArea.setEditable(false);
        statusArea.setLineWrap(true);
        statusArea.setWrapStyleWord(true);
        add(new JScrollPane(statusArea), BorderLayout.SOUTH);

        addButton.addActionListener(e -> handleAddEquipment());
        enableButton.addActionListener(e -> handleEnableEquipment());
        disableButton.addActionListener(e -> handleDisableEquipment());
        maintenanceButton.addActionListener(e -> handleMarkMaintenance());
        backButton.addActionListener(e -> {
            if (currentUser != null) {
                mainUI.showDashboard(currentUser);
            }
        });
    }

    public void setCurrentUser(User currentUser) {
        this.currentUser = currentUser;
        refreshStatus("Logged in as: " + currentUser.getName() + " (" + currentUser.getUserType() + ")");
    }

    private LabManager getManager() {
        if (!(currentUser instanceof LabManager)) {
            throw new IllegalStateException("Current user is not a lab manager.");
        }
        return (LabManager) currentUser;
    }

    private void handleAddEquipment() {
        try {
            String description = descriptionField.getText().trim();
            EquipmentType equipmentType = (EquipmentType) equipmentTypeComboBox.getSelectedItem();
            LabLocation labLocation = (LabLocation) labLocationComboBox.getSelectedItem();

            if (description.isBlank()) {
                throw new IllegalArgumentException("Description is required.");
            }

            Equipment equipment = equipmentManagementService.addEquipment(
                    getManager(),
                    description,
                    equipmentType,
                    labLocation
            );

            equipmentList.add(equipment);
            equipmentListModel.addElement(equipment);
            refreshStatus("Added equipment: " + equipment.getDescription());

            descriptionField.setText("");
        } catch (Exception ex) {
            showError(ex.getMessage());
        }
    }

    private void handleEnableEquipment() {
        try {
            Equipment equipment = equipmentJList.getSelectedValue();
            if (equipment == null) {
                throw new IllegalArgumentException("Select an equipment item first.");
            }

            equipmentManagementService.enableEquipment(getManager(), equipment);
            equipmentJList.repaint();
            refreshStatus("Enabled equipment: " + equipment.getDescription());
        } catch (Exception ex) {
            showError(ex.getMessage());
        }
    }

    private void handleDisableEquipment() {
        try {
            Equipment equipment = equipmentJList.getSelectedValue();
            if (equipment == null) {
                throw new IllegalArgumentException("Select an equipment item first.");
            }

            equipmentManagementService.disableEquipment(getManager(), equipment);
            equipmentJList.repaint();
            refreshStatus("Disabled equipment: " + equipment.getDescription());
        } catch (Exception ex) {
            showError(ex.getMessage());
        }
    }

    private void handleMarkMaintenance() {
        try {
            Equipment equipment = equipmentJList.getSelectedValue();
            if (equipment == null) {
                throw new IllegalArgumentException("Select an equipment item first.");
            }

            equipmentManagementService.markEquipmentMaintenance(getManager(), equipment);
            equipmentJList.repaint();
            refreshStatus("Marked maintenance: " + equipment.getDescription());
        } catch (Exception ex) {
            showError(ex.getMessage());
        }
    }

    private void refreshStatus(String message) {
        statusArea.setText(message);
    }

    private void showError(String message) {
        JOptionPane.showMessageDialog(this, message, "Lab Manager Error", JOptionPane.ERROR_MESSAGE);
    }
}
