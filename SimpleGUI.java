import javax.swing.*;

class SimpleGUI extends JFrame {
    JLabel label;
    JTextField textField;

    SimpleGUI() {
        setSize(400, 600);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setTitle("Simple GUI with Swing Components");
        setLayout(null); // Corrected method name
        label = new JLabel("Enter Name");
        textField = new JTextField(); // Added parentheses
        label.setBounds(50, 50, 100, 20); // Corrected variable name
        add(label);
        textField.setBounds(150, 90, 200, 20); // Adjusted position and size for better visibility
        add(textField);
        setVisible(true);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            SimpleGUI gui = new SimpleGUI();
        });
    }
}
