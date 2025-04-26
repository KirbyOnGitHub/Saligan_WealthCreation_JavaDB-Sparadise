package SampleDatabase_ChoosingTables;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MainApplication extends JFrame {
    private JComboBox<String> tableComboBox;
    private JButton showDataButton;

    public MainApplication() {
        tableComboBox = new JComboBox<>();
        showDataButton = new JButton("Show Data");

        // Populate the combo box with table names
        // Assuming you have a method getTableNames() that retrieves the table names from the database
        String[] tableNames = getTableNames();
        tableComboBox.setModel(new DefaultComboBoxModel<>(tableNames));

        showDataButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String selectedTable = tableComboBox.getSelectedItem().toString();
                openTableFrame(selectedTable);
            }
        });

        JPanel panel = new JPanel();
        panel.add(tableComboBox);
        panel.add(showDataButton);

        this.getContentPane().add(panel);
        this.setSize(300, 150);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);
    }

    private String[] getTableNames() {
        // Fetch table names from the database
        // Implement this method based on your database schema
        // For simplicity, returning a hardcoded array here
        return new String[]{"employees", "departments", "projects"};
    }

    private void openTableFrame(String tableName) {
        // Open the JFrame for the selected table
        if ("employees".equals(tableName)) {
            new EmployeesFrame();
        } else if ("departments".equals(tableName)) {
            new DepartmentsFrame();
        } else if ("projects".equals(tableName)) {
            new ProjectsFrame();
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            new MainApplication();
        });
    }
}

