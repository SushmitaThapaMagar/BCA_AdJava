import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Page extends JFrame implements ActionListener {
    private JTextField emailField;
    private JPasswordField passwordField;
    private JLabel messageLabel;
    private JButton loginButton;

    public Page() {
        setTitle("Login Page");
        setSize(350, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        // Panel with GridLayout for form fields
        JPanel panel = new JPanel(new GridLayout(3, 2, 10, 10));
        panel.setBorder(BorderFactory.createEmptyBorder(20, 20, 10, 20));

        panel.add(new JLabel("Email:"));
        emailField = new JTextField();
        panel.add(emailField);

        panel.add(new JLabel("Password:"));
        passwordField = new JPasswordField();
        panel.add(passwordField);

        // Empty cell for layout alignment
        panel.add(new JLabel(""));

        loginButton = new JButton("Login");
        loginButton.addActionListener(this);
        panel.add(loginButton);

        // Message label for feedback
        messageLabel = new JLabel("", JLabel.CENTER);
        messageLabel.setForeground(Color.RED);

        add(panel, BorderLayout.CENTER);
        add(messageLabel, BorderLayout.SOUTH);

        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String email = emailField.getText().trim();
        String password = new String(passwordField.getPassword());

        // Simple authentication logic (example: email = user@example.com, password = password)
        if (email.equals("user@example.com") && password.equals("password")) {
            messageLabel.setForeground(new Color(0, 128, 0));
            messageLabel.setText("Login successful! Welcome.");
        } else {
            messageLabel.setForeground(Color.RED);
            messageLabel.setText("Invalid email or password.");
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(Page::new);
    }
}
