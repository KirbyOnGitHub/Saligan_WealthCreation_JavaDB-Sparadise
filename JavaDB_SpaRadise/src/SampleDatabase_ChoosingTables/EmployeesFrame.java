package SampleDatabase_ChoosingTables;

import javax.swing.*;
import java.awt.*;

public class EmployeesFrame extends JFrame {
    public EmployeesFrame() {
        // Set up the GUI components for the employees table
        // For simplicity, just displaying a label here
        JLabel label = new JLabel("Employees Table");
        label.setFont(new Font("Arial", Font.BOLD, 20));

        this.getContentPane().add(label);
        this.setSize(300, 200);
        this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE); // Close only this frame, not the entire application
        this.setVisible(true);
    }
}
