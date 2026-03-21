package com.reservation_system.gui;

import com.reservation_system.Equipment.Equipment;
import com.reservation_system.Equipment.EquipmentType;
import com.reservation_system.Equipment.LabLocation;
import com.reservation_system.Sensor.SensorGUI;
import com.reservation_system.model.LabManager;
import com.reservation_system.model.User;
import com.reservation_system.patterns.observer.EquipmentRegistry;
import com.reservation_system.services.EquipmentManagementService;

import javax.swing.*;
import java.awt.*;
import java.util.List;
import java.util.UUID;

public class LabManagerPanel extends JPanel {

    private final MainUI mainUI;
    private final EquipmentManagementService equipmentManagementService;
    private final EquipmentRegistry equipmentRegistry;

    private User currentUser;

    private final JTextField searchIdField;
    private final JTextField descriptionField;
    private final JComboBox<EquipmentType> equipmentTypeComboBox;
    private final JComboBox<LabLocation> labLocationComboBox;

    private final DefaultListModel<Equipment> equipmentListModel;
    private final JList<Equipment> equipmentJList;

    private final JTextArea statusArea;

    public LabManagerPanel(MainUI mainUI,
                           EquipmentManagementService equipmentManagementService,
                           EquipmentRegistry equipmentRegistry) {
        this.mainUI = mainUI;
        this.equipmentManagementService = equipmentManagementService;
        this.equipmentRegistry = equipmentRegistry;

        setLayout(new BorderLayout());

        JLabel titleLabel = new JLabel("Lab Manager Equipment Control", SwingConstants.CENTER);
        titleLabel.setFont(new Font("Arial", Font.BOLD, 22));
        add(titleLabel, BorderLayout.NORTH);

        JPanel centerPanel = new JPanel(new GridLayout(1, 2));

        JPanel formPanel = new JPanel(new GridLayout(10, 2, 10, 10));
        formPanel.setBorder(BorderFactory.createEmptyBorder(20, 20, 20, 20));

        searchIdField         = new JTextField();
        descriptionField      = new JTextField();
        equipmentTypeComboBox = new JComboBox<>(EquipmentType.values());
        labLocationComboBox   = new JComboBox<>(LabLocation.values());

        JButton searchByIdButton  = new JButton("Search by ID");
        JButton addButton         = new JButton("Add Equipment");
        JButton updateButton      = new JButton("Update Equipment");
        JButton removeButton      = new JButton("Remove Equipment");
        JButton enableButton      = new JButton("Enable");
        JButton disableButton     = new JButton("Disable");
        JButton maintenanceButton = new JButton("Mark Maintenance");
        JButton clearButton       = new JButton("Clear");
        JButton sensorButton      = new JButton("Sensor Dashboard");
        JButton backButton        = new JButton("Back");

        formPanel.add(new JLabel("Search Equipment ID:")); formPanel.add(searchIdField);
        formPanel.add(searchByIdButton);                   formPanel.add(clearButton);
        formPanel.add(new JLabel("Description:"));         formPanel.add(descriptionField);
        formPanel.add(new JLabel("Equipment Type:"));      formPanel.add(equipmentTypeComboBox);
        formPanel.add(new JLabel("Lab Location:"));        formPanel.add(labLocationComboBox);
        formPanel.add(addButton);                          formPanel.add(updateButton);
        formPanel.add(removeButton);                       formPanel.add(enableButton);
        formPanel.add(disableButton);                      formPanel.add(maintenanceButton);
        formPanel.add(sensorButton);                       formPanel.add(backButton);

        equipmentListModel = new DefaultListModel<>();
        equipmentJList     = new JList<>(equipmentListModel);
        JScrollPane listScrollPane = new JScrollPane(equipmentJList);

        centerPanel.add(formPanel);
        centerPanel.add(listScrollPane);
        add(centerPanel, BorderLayout.CENTER);

        statusArea = new JTextArea(6, 20);
        statusArea.setEditable(false);
        statusArea.setLineWrap(true);
        statusArea.setWrapStyleWord(true);
        add(new JScrollPane(statusArea), BorderLayout.SOUTH);

        searchByIdButton .addActionListener(e -> handleSearchById());
        clearButton      .addActionListener(e -> clearForm());
        addButton        .addActionListener(e -> handleAddEquipment());
        updateButton     .addActionListener(e -> handleUpdateEquipment());
        removeButton     .addActionListener(e -> handleRemoveEquipment());
        enableButton     .addActionListener(e -> handleEnableEquipment());
        disableButton    .addActionListener(e -> handleDisableEquipment());
        maintenanceButton.addActionListener(e -> handleMarkMaintenance());

        sensorButton.addActionListener(e -> {
            SensorGUI sensorGUI = new SensorGUI(this::loadEquipmentFromCSV);
            sensorGUI.setVisible(true);
        });

        backButton.addActionListener(e -> {
            if (currentUser != null) mainUI.showDashboard(currentUser);
        });

        equipmentJList.addListSelectionListener(e -> {
            if (!e.getValueIsAdjusting()) {
                Equipment selected = equipmentJList.getSelectedValue();
                if (selected != null) {
                    descriptionField.setText(selected.getDescription());
                    equipmentTypeComboBox.setSelectedItem(selected.getEquipmentType());
                    labLocationComboBox  .setSelectedItem(selected.getLabLocation());
                    refreshStatus("Selected: " + selected.getDescription()
                            + " | ID: " + selected.getEquipmentId());
                }
            }
        });

        loadEquipmentFromCSV();
    }

    public void setCurrentUser(User currentUser) {
        this.currentUser = currentUser;
        refreshStatus("Logged in as: " + currentUser.getName()
                + " (" + currentUser.getUserType() + ")");
        loadEquipmentFromCSV();
    }

    public void loadEquipmentFromCSV() {
        equipmentListModel.clear();
        List<Equipment> all = equipmentManagementService.loadAllEquipment();
        equipmentRegistry.replaceAll(all);
        for (Equipment eq : all) {
            equipmentListModel.addElement(eq);
        }
    }

    private LabManager getManager() {
        if (!(currentUser instanceof LabManager))
            throw new IllegalStateException("Current user is not a lab manager.");
        return (LabManager) currentUser;
    }

    private void handleSearchById() {
        try {
            String input = searchIdField.getText().trim();
            if (input.isBlank()) throw new IllegalArgumentException(
                    "Enter an equipment ID to search.");
            UUID searchedId;
            try {
                searchedId = UUID.fromString(input);
            } catch (IllegalArgumentException ex) {
                throw new IllegalArgumentException("Invalid equipment ID format.");
            }
            for (int i = 0; i < equipmentListModel.size(); i++) {
                Equipment eq = equipmentListModel.getElementAt(i);
                if (eq.getEquipmentId().equals(searchedId)) {
                    equipmentJList.setSelectedIndex(i);
                    equipmentJList.ensureIndexIsVisible(i);
                    refreshStatus("Found: " + eq.getDescription()
                            + " | ID: " + eq.getEquipmentId());
                    return;
                }
            }
            throw new IllegalArgumentException("No equipment found with that ID.");
        } catch (Exception ex) {
            showError(ex.getMessage());
        }
    }

    private void handleAddEquipment() {
        try {
            String        description   = descriptionField.getText().trim();
            EquipmentType equipmentType = (EquipmentType) equipmentTypeComboBox.getSelectedItem();
            LabLocation   labLocation   = (LabLocation)   labLocationComboBox  .getSelectedItem();
            if (description.isBlank())
                throw new IllegalArgumentException("Description is required.");
            Equipment equipment = equipmentManagementService.addEquipment(
                    getManager(), description, equipmentType, labLocation);
            equipmentListModel.addElement(equipment);
            equipmentRegistry.addEquipment(equipment);
            refreshStatus("Added: " + equipment.getDescription()
                    + " | ID: " + equipment.getEquipmentId());
            clearForm();
        } catch (Exception ex) {
            showError(ex.getMessage());
        }
    }

    private void handleUpdateEquipment() {
        try {
            Equipment equipment = equipmentJList.getSelectedValue();
            if (equipment == null)
                throw new IllegalArgumentException("Select an equipment item first.");
            String        description   = descriptionField.getText().trim();
            EquipmentType equipmentType = (EquipmentType) equipmentTypeComboBox.getSelectedItem();
            LabLocation   labLocation   = (LabLocation)   labLocationComboBox  .getSelectedItem();
            if (description.isBlank())
                throw new IllegalArgumentException("Description is required.");
            equipmentManagementService.updateEquipmentDetails(
                    getManager(), equipment, description, equipmentType, labLocation);
            equipmentJList.repaint();
            refreshStatus("Updated: " + equipment.getDescription()
                    + " | ID: " + equipment.getEquipmentId());
            clearForm();
        } catch (Exception ex) {
            showError(ex.getMessage());
        }
    }

    private void handleRemoveEquipment() {
        try {
            Equipment equipment = equipmentJList.getSelectedValue();
            if (equipment == null)
                throw new IllegalArgumentException("Select an equipment item first.");
            equipmentManagementService.removeEquipment(getManager(), equipment);
            equipmentListModel.removeElement(equipment);
            refreshStatus("Removed: " + equipment.getDescription()
                    + " | ID: " + equipment.getEquipmentId());
            clearForm();
        } catch (Exception ex) {
            showError(ex.getMessage());
        }
    }

    private void handleEnableEquipment() {
        try {
            Equipment equipment = equipmentJList.getSelectedValue();
            if (equipment == null)
                throw new IllegalArgumentException("Select an equipment item first.");
            equipmentManagementService.enableEquipment(getManager(), equipment);
            equipmentJList.repaint();
            refreshStatus("Enabled: " + equipment.getDescription());
        } catch (Exception ex) {
            showError(ex.getMessage());
        }
    }

    private void handleDisableEquipment() {
        try {
            Equipment equipment = equipmentJList.getSelectedValue();
            if (equipment == null)
                throw new IllegalArgumentException("Select an equipment item first.");
            equipmentManagementService.disableEquipment(getManager(), equipment);
            equipmentJList.repaint();
            refreshStatus("Disabled: " + equipment.getDescription());
        } catch (Exception ex) {
            showError(ex.getMessage());
        }
    }

    private void handleMarkMaintenance() {
        try {
            Equipment equipment = equipmentJList.getSelectedValue();
            if (equipment == null)
                throw new IllegalArgumentException("Select an equipment item first.");
            equipmentManagementService.markEquipmentMaintenance(getManager(), equipment);
            equipmentJList.repaint();
            refreshStatus("Marked maintenance: " + equipment.getDescription());
        } catch (Exception ex) {
            showError(ex.getMessage());
        }
    }

    private void clearForm() {
        searchIdField.setText("");
        descriptionField.setText("");
        equipmentTypeComboBox.setSelectedIndex(0);
        labLocationComboBox  .setSelectedIndex(0);
        equipmentJList.clearSelection();
    }

    private void refreshStatus(String message) { statusArea.setText(message); }

    private void showError(String message) {
        JOptionPane.showMessageDialog(this, message,
                "Lab Manager Error", JOptionPane.ERROR_MESSAGE);
    }
}