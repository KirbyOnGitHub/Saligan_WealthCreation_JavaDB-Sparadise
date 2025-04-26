package SampleDatabase_ChoosingTables;

import javax.swing.*;
import java.awt.*;

public class DepartmentsFrame extends JFrame {
    public DepartmentsFrame() {
        // Set up the GUI components for the departments table
        // For simplicity, just displaying a label here
        JLabel label = new JLabel("Departments Table");
        label.setFont(new Font("Arial", Font.BOLD, 20));

        this.getContentPane().add(label);
        this.setSize(300, 200);
        this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        this.setVisible(true);
    }
}
