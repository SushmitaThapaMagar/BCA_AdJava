// 3. A program to demonstrate the use of JSwing Components and add layout managers to it
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class SwingDemo extends JFrame {
    public SwingDemo() {
        setTitle("JSwing Components & Layout Managers Demo");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(400, 250);

        // Use BorderLayout for the main frame
        setLayout(new BorderLayout());

        // NORTH: JLabel
        JLabel label = new JLabel("Welcome to Java Swing Demo!", JLabel.CENTER);
        add(label, BorderLayout.NORTH);

        // CENTER: JPanel with GridLayout for buttons
        JPanel centerPanel = new JPanel(new GridLayout(2, 2, 10, 10));
        JButton btnOk = new JButton("OK");
        JButton btnSubmit = new JButton("SUBMIT");
        JButton btnCancel = new JButton("CANCEL");
        JButton btnExit = new JButton("EXIT");
        centerPanel.add(btnOk);
        centerPanel.add(btnSubmit);
        centerPanel.add(btnCancel);
        centerPanel.add(btnExit);
        add(centerPanel, BorderLayout.CENTER);

        // SOUTH: JPanel with FlowLayout for text field and checkbox
        JPanel southPanel = new JPanel(new FlowLayout());
        JTextField textField = new JTextField(15);
        JCheckBox checkBox = new JCheckBox("Accept Terms");
        southPanel.add(new JLabel("Enter Name:"));
        southPanel.add(textField);
        southPanel.add(checkBox);
        add(southPanel, BorderLayout.SOUTH);

        // Add action for EXIT button
        btnExit.addActionListener(e -> System.exit(0));

        setVisible(true);
    }

    public static void main(String[] args) {
        // For thread safety
        SwingUtilities.invokeLater(SwingDemo::new);
    }
}
