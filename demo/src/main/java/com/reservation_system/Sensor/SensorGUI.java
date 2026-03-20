package com.reservation_system.Sensor;

import com.reservation_system.Equipment.Equipment;

import javax.swing.*;
import javax.swing.border.*;
import javax.swing.table.*;
import java.awt.*;
import java.time.LocalDateTime;
import java.util.List;
import java.util.UUID;

/**
 * Swing GUI for the Sensor Subsystem.
 *
 * Features:
 *  - DISPOSE_ON_CLOSE: closing this window does not kill the whole app
 *  - Close button in header returns user to Lab Manager
 *  - Equipment dropdown in Add Sensor card (no raw UUID typing needed)
 *  - "Link New Sensor" button on Equipment Status tab: click a row, jump
 *    to Manager Controls with that equipment pre-selected in dropdown
 *  - Sensor table row click auto-fills the state override UUID field
 *  - Runnable callback: LabManagerPanel passes this::loadEquipmentFromCSV
 *    so its equipment list refreshes automatically when a sensor event
 *    changes equipment status — no manual refresh needed
 */
public class SensorGUI extends JFrame {

    // ── Palette ───────────────────────────────────────────────
    private static final Color COL_PRIMARY   = new Color(28, 78, 128);
    private static final Color COL_HEADER    = new Color(22, 60, 100);
    private static final Color COL_BG        = new Color(245, 247, 250);
    private static final Color COL_WHITE     = Color.WHITE;
    private static final Color COL_SUCCESS   = new Color(39, 174, 96);
    private static final Color COL_DANGER    = new Color(192, 57, 43);
    private static final Color COL_WARNING   = new Color(211, 84, 0);
    private static final Color COL_AVAILABLE = new Color(212, 237, 218);
    private static final Color COL_IN_USE    = new Color(169, 223, 191);
    private static final Color COL_RESERVED  = new Color(209, 236, 241);
    private static final Color COL_DISABLED  = new Color(248, 215, 218);
    private static final Color COL_MAINT     = new Color(255, 243, 205);

    // ── Fonts ─────────────────────────────────────────────────
    private static final Font FONT_BODY  = new Font("Segoe UI", Font.PLAIN, 13);
    private static final Font FONT_BOLD  = new Font("Segoe UI", Font.BOLD,  13);
    private static final Font FONT_SMALL = new Font("Segoe UI", Font.PLAIN, 11);
    private static final Font FONT_TITLE = new Font("Segoe UI", Font.BOLD,  20);
    private static final Font FONT_SUB   = new Font("Segoe UI", Font.PLAIN, 12);

    // ── Core ──────────────────────────────────────────────────
    private final SensorSubsystemFacade facade;

    /**
     * Optional callback invoked on the EDT after every sensor event
     * that successfully changes equipment status.
     *
     * LabManagerPanel wires this up:
     *   new SensorGUI(this::loadEquipmentFromCSV)
     *
     * This means the moment a sensor sends IN_USE or IDLE, the Lab
     * Manager panel list updates without any manual click.
     */
    private final Runnable onEquipmentChangedCallback;

    // ── Tab pane ref — needed to switch tabs programmatically ─
    private JTabbedPane tabs;

    // ── Table models ──────────────────────────────────────────
    private DefaultTableModel sensorModel;
    private DefaultTableModel equipModel;
    private DefaultTableModel logModel;

    // ── Tables ────────────────────────────────────────────────
    private JTable sensorTable;
    private JTable equipTable;

    // ── Equipment dropdown in Add Sensor card ─────────────────
    // Stored as field so Equipment Status tab can pre-select into it
    private JComboBox<Equipment> equipDropdown;

    // ── State override UUID field (auto-filled from sensor table)
    private JTextField stateIdFld;

    // ── Status bar ────────────────────────────────────────────
    private JLabel statusBar;

    // ─────────────────────────────────────────────────────────

    /** Standalone — no external refresh callback. */
    public SensorGUI() {
        this(null);
    }

    /**
     * @param onEquipmentChanged Runnable called on EDT after sensor events
     *   that update equipment status. Pass null to disable.
     *   Typical usage from LabManagerPanel:
     *     new SensorGUI(this::loadEquipmentFromCSV)
     */
    public SensorGUI(Runnable onEquipmentChanged) {
        this.facade                     = new SensorSubsystemFacade();
        this.onEquipmentChangedCallback = onEquipmentChanged;
        buildUI();
    }

    // ── Top-level frame ────────────────────────────────────────

    private void buildUI() {
        setTitle("Lab Equipment Sensor Subsystem \u2014 York University");
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setSize(1200, 740);
        setMinimumSize(new Dimension(960, 600));
        setLocationRelativeTo(null);
        setLayout(new BorderLayout());

        add(buildHeader(),    BorderLayout.NORTH);
        add(buildTabs(),      BorderLayout.CENTER);
        add(buildStatusBar(), BorderLayout.SOUTH);
    }

    // ── Header ─────────────────────────────────────────────────

    private JPanel buildHeader() {
        JPanel h = new JPanel(new BorderLayout());
        h.setBackground(COL_HEADER);
        h.setBorder(new EmptyBorder(14, 20, 14, 20));

        JPanel text = new JPanel(new GridLayout(2, 1, 0, 2));
        text.setOpaque(false);
        JLabel title = new JLabel("Lab Equipment Sensor Subsystem");
        title.setFont(FONT_TITLE);
        title.setForeground(COL_WHITE);
        JLabel sub = new JLabel("York University \u00b7 Science & Engineering Faculty");
        sub.setFont(FONT_SUB);
        sub.setForeground(new Color(180, 210, 240));
        text.add(title);
        text.add(sub);
        h.add(text, BorderLayout.WEST);

        JPanel btnRow = new JPanel(new FlowLayout(FlowLayout.RIGHT, 8, 0));
        btnRow.setOpaque(false);

        JButton refresh = btn("\u21bb  Refresh All", new Color(60, 120, 180));
        refresh.addActionListener(e -> refreshAll());

        JButton close = btn("\u2715  Close", COL_DANGER);
        close.setToolTipText("Close sensor window and return to Lab Manager");
        close.addActionListener(e -> dispose());

        btnRow.add(refresh);
        btnRow.add(close);
        h.add(btnRow, BorderLayout.EAST);
        return h;
    }

    // ── Tabs ───────────────────────────────────────────────────

    private JTabbedPane buildTabs() {
        tabs = new JTabbedPane();
        tabs.setFont(FONT_BOLD);
        tabs.addTab("  Sensor Dashboard  ", buildSensorTab());
        tabs.addTab("  Equipment Status  ", buildEquipmentTab());
        tabs.addTab("  Usage Logs  ",        buildLogsTab());
        tabs.addTab("  Manager Controls  ", buildManagerTab());
        return tabs;
    }

    // ════════════════════════════════════════════════════════════
    //  TAB 1 — Sensor Dashboard
    // ════════════════════════════════════════════════════════════

    private JPanel buildSensorTab() {
        JPanel p = new JPanel(new BorderLayout(10, 10));
        p.setBackground(COL_BG);
        p.setBorder(new EmptyBorder(14, 14, 14, 14));

        sensorModel = noEdit("Sensor ID", "Type", "Linked Equipment ID", "State");
        sensorTable = styledTable(sensorModel);
        p.add(scroll(sensorTable, "Registered Sensors"), BorderLayout.CENTER);
        p.add(buildSimulatePanel(), BorderLayout.SOUTH);

        loadSensors();
        return p;
    }

    private JPanel buildSimulatePanel() {
        JPanel wrapper = new JPanel(new BorderLayout());
        wrapper.setBackground(COL_BG);
        wrapper.setBorder(titled("Simulate Sensor Data Input"));

        JPanel form = new JPanel(new FlowLayout(FlowLayout.LEFT, 12, 8));
        form.setBackground(COL_WHITE);

        JTextField sensorFld = new JTextField(18);
        JTextField equipFld  = new JTextField(18);
        JComboBox<String> statusCmb = new JComboBox<>(
                new String[]{"IN_USE", "IDLE", "OFF"});

        form.add(lbl("Sensor UUID:"));    form.add(sensorFld);
        form.add(lbl("Equipment UUID:")); form.add(equipFld);
        form.add(lbl("Usage Status:"));   form.add(statusCmb);

        JButton sendBtn = btn("Send Data", COL_PRIMARY);
        form.add(sendBtn);

        // Click a sensor row: auto-fill both UUID fields + state override field
        sensorTable.getSelectionModel().addListSelectionListener(e -> {
            int row = sensorTable.getSelectedRow();
            if (row >= 0) {
                String sid = (String) sensorModel.getValueAt(row, 0);
                String eid = (String) sensorModel.getValueAt(row, 2);
                sensorFld.setText(sid);
                equipFld .setText(eid);
                if (stateIdFld != null) stateIdFld.setText(sid);
            }
        });

        sendBtn.addActionListener(e -> {
            try {
                UUID   sid  = UUID.fromString(sensorFld.getText().trim());
                UUID   eid  = UUID.fromString(equipFld.getText().trim());
                String stat = (String) statusCmb.getSelectedItem();
                String res  = facade.sendUsageData(sid, eid, stat, LocalDateTime.now());
                if (res.startsWith("SUCCESS")) {
                    status("OK: " + res);
                    refreshAll();
                    fireEquipmentChanged(); // push update to LabManagerPanel
                } else {
                    error(res);
                }
            } catch (IllegalArgumentException ex) {
                error("Invalid UUID. Click a sensor row to auto-fill.");
            }
        });

        wrapper.add(form, BorderLayout.CENTER);
        return wrapper;
    }

    // ════════════════════════════════════════════════════════════
    //  TAB 2 — Equipment Status
    // ════════════════════════════════════════════════════════════

    private JPanel buildEquipmentTab() {
        JPanel p = new JPanel(new BorderLayout(10, 10));
        p.setBackground(COL_BG);
        p.setBorder(new EmptyBorder(14, 14, 14, 14));

        equipModel = noEdit("Equipment ID", "Type", "Description", "Location", "Status");
        equipTable = new JTable(equipModel) {
            @Override
            public Component prepareRenderer(TableCellRenderer r, int row, int col) {
                Component c = super.prepareRenderer(r, row, col);
                if (!isRowSelected(row)) {
                    String s = (String) getModel().getValueAt(row, 4);
                    switch (s) {
                        case "AVAILABLE":   c.setBackground(COL_AVAILABLE); break;
                        case "IN_USE":      c.setBackground(COL_IN_USE);    break;
                        case "RESERVED":    c.setBackground(COL_RESERVED);  break;
                        case "DISABLED":    c.setBackground(COL_DISABLED);  break;
                        case "MAINTENANCE": c.setBackground(COL_MAINT);     break;
                        default:            c.setBackground(COL_WHITE);
                    }
                }
                return c;
            }
        };
        styleTableHeaders(equipTable);
        p.add(scroll(equipTable, "Equipment Status Board"), BorderLayout.CENTER);

        // South: colour legend + Link Sensor button
        JPanel south = new JPanel(new BorderLayout());
        south.setBackground(COL_BG);
        south.add(buildLegend(), BorderLayout.WEST);

        JButton linkBtn = btn("Link New Sensor to Selected Equipment  ->", COL_PRIMARY);
        linkBtn.setToolTipText(
            "Select an equipment row, then click here to set up a sensor for it");
        linkBtn.addActionListener(e -> {
            int row = equipTable.getSelectedRow();
            if (row < 0) {
                error("Select an equipment row first, then click Link.");
                return;
            }
            UUID selectedId = UUID.fromString(
                    (String) equipModel.getValueAt(row, 0));
            // Pre-select this equipment in the Add Sensor dropdown
            if (equipDropdown != null) {
                for (int i = 0; i < equipDropdown.getItemCount(); i++) {
                    Equipment eq = equipDropdown.getItemAt(i);
                    if (eq != null && eq.getEquipmentId().equals(selectedId)) {
                        equipDropdown.setSelectedIndex(i);
                        break;
                    }
                }
            }
            tabs.setSelectedIndex(3); // jump to Manager Controls
            status("Equipment pre-selected. Choose sensor type and click Add Sensor.");
        });

        JPanel linkRow = new JPanel(new FlowLayout(FlowLayout.RIGHT, 10, 6));
        linkRow.setBackground(COL_BG);
        linkRow.add(linkBtn);
        south.add(linkRow, BorderLayout.EAST);
        p.add(south, BorderLayout.SOUTH);

        loadEquipment();
        return p;
    }

    private JPanel buildLegend() {
        JPanel p = new JPanel(new FlowLayout(FlowLayout.LEFT, 16, 6));
        p.setBackground(COL_BG);
        p.add(legendDot(COL_AVAILABLE, "Available"));
        p.add(legendDot(COL_IN_USE,    "In Use"));
        p.add(legendDot(COL_RESERVED,  "Reserved"));
        p.add(legendDot(COL_DISABLED,  "Disabled"));
        p.add(legendDot(COL_MAINT,     "Maintenance"));
        return p;
    }

    private JPanel legendDot(Color color, String label) {
        JPanel p = new JPanel(new FlowLayout(FlowLayout.LEFT, 4, 0));
        p.setOpaque(false);
        JPanel dot = new JPanel();
        dot.setBackground(color);
        dot.setBorder(BorderFactory.createLineBorder(Color.GRAY));
        dot.setPreferredSize(new Dimension(14, 14));
        JLabel l = new JLabel(label);
        l.setFont(FONT_SMALL);
        p.add(dot);
        p.add(l);
        return p;
    }

    // ════════════════════════════════════════════════════════════
    //  TAB 3 — Usage Logs
    // ════════════════════════════════════════════════════════════

    private JPanel buildLogsTab() {
        JPanel p = new JPanel(new BorderLayout(10, 10));
        p.setBackground(COL_BG);
        p.setBorder(new EmptyBorder(14, 14, 14, 14));

        logModel = noEdit("Log ID", "Sensor ID", "Equipment ID", "Timestamp", "Usage Status");
        JTable logTable = new JTable(logModel) {
            @Override
            public Component prepareRenderer(TableCellRenderer r, int row, int col) {
                Component c = super.prepareRenderer(r, row, col);
                if (!isRowSelected(row)) {
                    String s = (String) getModel().getValueAt(row, 4);
                    switch (s) {
                        case "IN_USE": c.setBackground(new Color(213, 245, 227)); break;
                        case "IDLE":   c.setBackground(new Color(235, 245, 251)); break;
                        case "OFF":    c.setBackground(new Color(245, 245, 245)); break;
                        default:       c.setBackground(COL_WHITE);
                    }
                }
                return c;
            }
        };
        styleTableHeaders(logTable);
        p.add(scroll(logTable, "All Usage Log Entries"), BorderLayout.CENTER);

        JPanel bottom = new JPanel(new FlowLayout(FlowLayout.RIGHT));
        bottom.setBackground(COL_BG);
        JButton clearBtn = btn("Clear Display", COL_DANGER);
        clearBtn.addActionListener(e -> logModel.setRowCount(0));
        bottom.add(clearBtn);
        p.add(bottom, BorderLayout.SOUTH);

        loadLogs();
        return p;
    }

    // ════════════════════════════════════════════════════════════
    //  TAB 4 — Manager Controls (sensors only)
    //  Equipment add/remove/status is in LabManagerPanel
    // ════════════════════════════════════════════════════════════

    private JPanel buildManagerTab() {
        JPanel outer = new JPanel(new BorderLayout(14, 14));
        outer.setBackground(COL_BG);
        outer.setBorder(new EmptyBorder(14, 14, 14, 14));

        JPanel note = new JPanel(new FlowLayout(FlowLayout.LEFT));
        note.setBackground(new Color(255, 243, 205));
        note.setBorder(BorderFactory.createLineBorder(new Color(230, 190, 50)));
        JLabel noteLbl = new JLabel(
            "  Note: Equipment add / remove / enable / disable is managed in the Lab Manager panel.  ");
        noteLbl.setFont(FONT_SMALL);
        note.add(noteLbl);

        outer.add(note,              BorderLayout.NORTH);
        outer.add(buildSensorMgmt(), BorderLayout.CENTER);
        return outer;
    }

    private JPanel buildSensorMgmt() {
        JPanel wrapper = new JPanel(new GridLayout(1, 3, 14, 0));
        wrapper.setBackground(COL_BG);

        // ── ADD SENSOR ────────────────────────────────────────
        JPanel addCard = card("Add New Sensor");
        JPanel addF = new JPanel(new GridLayout(0, 2, 8, 8));
        addF.setOpaque(false);

        JTextField sensorIdFld = new JTextField();
        JComboBox<SensorType> typeCmb = new JComboBox<>(SensorType.values());

        // Equipment dropdown: shows description + short UUID — no raw UUID typing
        equipDropdown = new JComboBox<>();
        equipDropdown.setRenderer(new DefaultListCellRenderer() {
            @Override
            public Component getListCellRendererComponent(JList<?> list, Object val,
                    int idx, boolean sel, boolean focus) {
                super.getListCellRendererComponent(list, val, idx, sel, focus);
                if (val instanceof Equipment) {
                    Equipment eq = (Equipment) val;
                    String shortId = eq.getEquipmentId().toString().substring(0, 8) + "...";
                    setText(eq.getDescription() + "  [" + shortId + "]");
                }
                return this;
            }
        });
        refreshEquipDropdown();

        addF.add(lbl("Sensor UUID (blank = auto):")); addF.add(sensorIdFld);
        addF.add(lbl("Sensor Type:"));                addF.add(typeCmb);
        addF.add(lbl("Link to Equipment:"));           addF.add(equipDropdown);

        JButton addBtn = btn("Add Sensor", COL_SUCCESS);
        addBtn.addActionListener(e -> {
            Equipment selected = (Equipment) equipDropdown.getSelectedItem();
            if (selected == null) {
                error("No equipment available. Add equipment in Lab Manager first.");
                return;
            }
            try {
                UUID sid = sensorIdFld.getText().isBlank()
                        ? UUID.randomUUID()
                        : UUID.fromString(sensorIdFld.getText().trim());
                facade.addSensor(sid, (SensorType) typeCmb.getSelectedItem(),
                                 selected.getEquipmentId());
                sensorIdFld.setText("");
                loadSensors();
                status("Sensor added for: " + selected.getDescription());
            } catch (IllegalArgumentException ex) {
                error("Invalid UUID format in Sensor UUID field.");
            }
        });

        addCard.add(addF);
        addCard.add(gap());
        addCard.add(addBtn);
        addCard.add(Box.createVerticalGlue());

        // ── OVERRIDE SENSOR STATE ─────────────────────────────
        JPanel stateCard = card("Override Sensor State");
        JPanel stateF = new JPanel(new GridLayout(0, 2, 8, 8));
        stateF.setOpaque(false);

        stateIdFld = new JTextField();  // auto-filled when sensor row is clicked
        JComboBox<String> stateCmb = new JComboBox<>(
                new String[]{"ACTIVE", "INACTIVE", "ERROR"});

        stateF.add(lbl("Sensor UUID:"));  stateF.add(stateIdFld);
        stateF.add(lbl("Target State:")); stateF.add(stateCmb);

        JLabel stateHint = new JLabel(
            "  Tip: click a sensor row on Dashboard to auto-fill");
        stateHint.setFont(FONT_SMALL);
        stateHint.setForeground(Color.GRAY);

        JButton stateBtn = btn("Apply State", COL_WARNING);
        stateBtn.addActionListener(e -> {
            try {
                UUID sid = UUID.fromString(stateIdFld.getText().trim());
                switch ((String) stateCmb.getSelectedItem()) {
                    case "ACTIVE":   facade.activateSensor(sid);   break;
                    case "INACTIVE": facade.deactivateSensor(sid); break;
                    case "ERROR":    facade.flagSensorError(sid);  break;
                }
                stateIdFld.setText("");
                loadSensors();
                status("Sensor state updated.");
            } catch (IllegalArgumentException ex) {
                error("Invalid UUID. Click a sensor row on Dashboard to auto-fill.");
            }
        });

        stateCard.add(stateF);
        stateCard.add(gap());
        stateCard.add(stateHint);
        stateCard.add(gap());
        stateCard.add(stateBtn);
        stateCard.add(Box.createVerticalGlue());

        // ── REMOVE SENSOR ─────────────────────────────────────
        JPanel remCard = card("Remove Sensor");
        JPanel remF = new JPanel(new GridLayout(0, 2, 8, 8));
        remF.setOpaque(false);

        JTextField remFld = new JTextField();
        remF.add(lbl("Sensor UUID:")); remF.add(remFld);

        JLabel remHint = new JLabel(
            "  Tip: click a sensor row on Dashboard to copy UUID");
        remHint.setFont(FONT_SMALL);
        remHint.setForeground(Color.GRAY);

        JButton remBtn = btn("Remove Sensor", COL_DANGER);
        remBtn.addActionListener(e -> {
            try {
                UUID sid = UUID.fromString(remFld.getText().trim());
                facade.removeSensor(sid);
                remFld.setText("");
                loadSensors();
                status("Sensor removed.");
            } catch (IllegalArgumentException ex) {
                error("Invalid UUID. Click a sensor row on Dashboard to copy.");
            }
        });

        remCard.add(remF);
        remCard.add(gap());
        remCard.add(remHint);
        remCard.add(gap());
        remCard.add(remBtn);
        remCard.add(Box.createVerticalGlue());

        wrapper.add(addCard);
        wrapper.add(stateCard);
        wrapper.add(remCard);
        return wrapper;
    }

    // ── Status bar ─────────────────────────────────────────────

    private JPanel buildStatusBar() {
        JPanel bar = new JPanel(new BorderLayout());
        bar.setBorder(new MatteBorder(1, 0, 0, 0, new Color(200, 200, 200)));
        bar.setBackground(new Color(250, 250, 250));
        statusBar = new JLabel("  Ready");
        statusBar.setFont(FONT_SMALL);
        statusBar.setBorder(new EmptyBorder(4, 10, 4, 10));
        bar.add(statusBar, BorderLayout.WEST);
        JLabel ver = new JLabel("Sensor Subsystem v2.1  ");
        ver.setFont(FONT_SMALL);
        ver.setForeground(Color.GRAY);
        bar.add(ver, BorderLayout.EAST);
        return bar;
    }

    // ── Data loaders ───────────────────────────────────────────

    private void loadSensors() {
        sensorModel.setRowCount(0);
        for (Sensor s : facade.getAllSensors()) {
            sensorModel.addRow(new Object[]{
                s.getSensorId().toString(),
                s.getSensorType().name(),
                s.getLinkedEquipmentId().toString(),
                s.getStateName()
            });
        }
    }

    private void loadEquipment() {
        equipModel.setRowCount(0);
        for (Equipment e : facade.getAllEquipment()) {
            equipModel.addRow(new Object[]{
                e.getEquipmentId().toString(),
                e.getEquipmentType().name(),
                e.getDescription(),
                e.getLabLocation().name(),
                e.getEquipmentStatus().name()
            });
        }
        refreshEquipDropdown();
    }

    private void loadLogs() {
        logModel.setRowCount(0);
        List<UsageLogEntry> logs = facade.getAllUsageLogs();
        for (int i = logs.size() - 1; i >= 0; i--) {
            UsageLogEntry l = logs.get(i);
            logModel.addRow(new Object[]{
                l.getLogId(),
                l.getSensorId().toString(),
                l.getEquipmentId().toString(),
                l.getTimestamp().toString().replace("T", " "),
                l.getUsageStatus()
            });
        }
    }

    private void refreshEquipDropdown() {
        if (equipDropdown == null) return;
        Equipment prev = (Equipment) equipDropdown.getSelectedItem();
        equipDropdown.removeAllItems();
        for (Equipment eq : facade.getAllEquipment()) {
            equipDropdown.addItem(eq);
        }
        if (prev != null) {
            for (int i = 0; i < equipDropdown.getItemCount(); i++) {
                Equipment eq = equipDropdown.getItemAt(i);
                if (eq != null && eq.getEquipmentId().equals(prev.getEquipmentId())) {
                    equipDropdown.setSelectedIndex(i);
                    break;
                }
            }
        }
    }

    private void refreshAll() {
        loadSensors();
        loadEquipment();
        loadLogs();
        status("Refreshed at " + LocalDateTime.now().toLocalTime().withNano(0));
    }

    /**
     * Fires the LabManagerPanel callback on the EDT so its equipment
     * list updates the instant a sensor event changes equipment status.
     */
    private void fireEquipmentChanged() {
        if (onEquipmentChangedCallback != null) {
            SwingUtilities.invokeLater(onEquipmentChangedCallback);
        }
    }

    // ── UI helpers ──────────────────────────────────────────────

    private DefaultTableModel noEdit(String... cols) {
        return new DefaultTableModel(cols, 0) {
            @Override public boolean isCellEditable(int r, int c) { return false; }
        };
    }

    private JTable styledTable(DefaultTableModel model) {
        JTable t = new JTable(model);
        styleTableHeaders(t);
        return t;
    }

    private void styleTableHeaders(JTable t) {
        t.setRowHeight(28);
        t.setFont(FONT_BODY);
        t.setGridColor(new Color(220, 225, 230));
        t.setShowGrid(true);
        t.setSelectionBackground(new Color(173, 216, 230));
        t.setSelectionForeground(Color.BLACK);
        t.setIntercellSpacing(new Dimension(1, 1));
        JTableHeader h = t.getTableHeader();
        h.setFont(FONT_BOLD);
        h.setBackground(COL_PRIMARY);
        h.setForeground(COL_WHITE);
        h.setReorderingAllowed(false);
    }

    private JScrollPane scroll(JTable t, String title) {
        JScrollPane sp = new JScrollPane(t);
        sp.setBorder(titled(title));
        return sp;
    }

    private TitledBorder titled(String title) {
        TitledBorder tb = BorderFactory.createTitledBorder(
            BorderFactory.createLineBorder(new Color(200, 210, 220)),
            "  " + title + "  ");
        tb.setTitleFont(FONT_BOLD);
        tb.setTitleColor(COL_PRIMARY);
        return tb;
    }

    private JPanel card(String title) {
        JPanel p = new JPanel();
        p.setLayout(new BoxLayout(p, BoxLayout.Y_AXIS));
        p.setBackground(COL_WHITE);
        p.setBorder(BorderFactory.createCompoundBorder(
            titled(title), new EmptyBorder(10, 10, 10, 10)));
        return p;
    }

    private JLabel lbl(String t) {
        JLabel l = new JLabel(t);
        l.setFont(FONT_BODY);
        return l;
    }

    private Component gap()      { return Box.createRigidArea(new Dimension(0, 4)); }
    private Component gap(int h) { return Box.createRigidArea(new Dimension(0, h)); }

    private JButton btn(String text, Color bg) {
        JButton b = new JButton(text);
        b.setBackground(bg);
        b.setForeground(COL_WHITE);
        b.setFont(FONT_BOLD);
        b.setFocusPainted(false);
        b.setOpaque(true);         // Mac: required to show background colour
        b.setBorderPainted(false); // Mac: required to honour background colour
        b.setBorder(new EmptyBorder(7, 16, 7, 16));
        b.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        return b;
    }

    private void status(String msg) { statusBar.setText("  " + msg); }

    private void error(String msg) {
        JOptionPane.showMessageDialog(this, msg, "Error", JOptionPane.ERROR_MESSAGE);
    }
}
