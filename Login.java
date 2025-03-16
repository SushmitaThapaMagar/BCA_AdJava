import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Login extends JFrame {

    private JLabel emailLabel, passwordLabel;
    private JTextField emailText;
    private JPasswordField passwordText;
    private JButton login;
    private JLabel forgetPassword;
    private JLabel message;

    public Login() {
        // Initialize components
        emailLabel = new JLabel("Email Address:");
        passwordLabel = new JLabel("Password:");
        emailText = new JTextField();
        passwordText = new JPasswordField();
        login = new JButton("Login");
        forgetPassword = new JLabel("Forget Password?");
        message = new JLabel();

        // Create panel and set layout
        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(5, 2));

        // Add components to the panel
        panel.add(emailLabel);
        panel.add(emailText);
        panel.add(passwordLabel);
        panel.add(passwordText);
        panel.add(new JLabel()); // Empty label for layout
        panel.add(login);
        panel.add(forgetPassword);
        panel.add(message);

        // Add action listeners
        login.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Handle login action
                String email = emailText.getText();
                String password = new String(passwordText.getPassword());

                // Check credentials (for example, against hardcoded values)
                if (email.equals("admin@example.com") && password.equals("admin")) {
                    message.setText("Login successful!");
                } else {
                    message.setText("Invalid credentials.");
                }
            }
        });

        forgetPassword.addMouseListener(new java.awt.event.MouseAdapter() {
            @Override
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                // Handle forget password action
                // Open a new window for password recovery
                PasswordRecoveryForm recoveryForm = new PasswordRecoveryForm();
            }
        });

        // Add panel to the frame
        add(panel, BorderLayout.CENTER);

        // Set frame properties
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(300, 200);
        setVisible(true);
    }

    public static void main(String[] args) {
        new Login();
    }
}

class PasswordRecoveryForm extends JFrame {
    public PasswordRecoveryForm() {
        // Initialize components
        JLabel emailLabel = new JLabel("Email Address:");
        JTextField emailText = new JTextField();
        JButton submit = new JButton("Submit");

        // Create panel and set layout
        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(3, 2));

        // Add components to the panel
        panel.add(emailLabel);
        panel.add(emailText);
        panel.add(new JLabel()); // Empty label for layout
        panel.add(submit);

        // Add action listeners
        submit.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Handle submit action
                String email = emailText.getText();

                // Password recovery logic here
                JOptionPane.showMessageDialog(null, "Password recovery email sent!");
            }
        });

        // Add panel to the frame
        add(panel, BorderLayout.CENTER);

        // Set frame properties
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(300, 150);
        setVisible(true);
    }
}
