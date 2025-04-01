import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GridCalculator extends JFrame implements ActionListener {
    private JTextField display;
    private double firstNumber = 0;
    private String currentOperation = "";

    public GridCalculator() {
        setTitle("GridLayout Calculator");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(300, 400);
        
        // Main container with BorderLayout
        JPanel mainPanel = new JPanel(new BorderLayout());
        
        // Display field at top
        display = new JTextField();
        display.setEditable(false);
        mainPanel.add(display, BorderLayout.NORTH);
        
        // Button panel with GridLayout (4 rows, 4 columns + 1 row for special buttons)
        JPanel buttonPanel = new JPanel(new GridLayout(5, 4, 5, 5));
        
        // Calculator buttons
        String[] buttons = {
            "7", "8", "9", "/",
            "4", "5", "6", "*",
            "1", "2", "3", "-",
            "0", ".", "=", "+",
            "C", "CE" // Clear buttons
        };

        for (String text : buttons) {
            JButton btn = new JButton(text);
            btn.addActionListener(this);
            buttonPanel.add(btn);
        }

        mainPanel.add(buttonPanel, BorderLayout.CENTER);
        add(mainPanel);
        setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        String command = e.getActionCommand();
        
        if (Character.isDigit(command.charAt(0)) || command.equals(".")) {
            display.setText(display.getText() + command);
        } else if (command.equals("C")) {
            display.setText("");
            firstNumber = 0;
        } else if (command.equals("CE")) {
            display.setText("");
        } else if ("+-*/".contains(command)) {
            firstNumber = Double.parseDouble(display.getText());
            currentOperation = command;
            display.setText("");
        } else if (command.equals("=")) {
            double secondNumber = Double.parseDouble(display.getText());
            switch (currentOperation) {
                case "+":
                    display.setText(String.valueOf(firstNumber + secondNumber));
                    break;
                case "-":
                    display.setText(String.valueOf(firstNumber - secondNumber));
                    break;
                case "*":
                    display.setText(String.valueOf(firstNumber * secondNumber));
                    break;
                case "/":
                    if (secondNumber != 0) {
                        display.setText(String.valueOf(firstNumber / secondNumber));
                    } else {
                        display.setText("Error");
                    }
                    break;
            }
        }
    }

    public static void main(String[] args) {
        new GridCalculator();
    }
}

