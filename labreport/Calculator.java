import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Calculator extends JFrame implements ActionListener {
    private JTextField display;
    private String firstNumber = "";
    private String operator = "";

    public Calculator() {
        setTitle("Simple Calculator");
        setSize(300, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout());

        display = new JTextField();
        display.setEditable(false);
        display.setFont(new Font("Arial", Font.PLAIN, 24));
        add(display, BorderLayout.NORTH);

        JPanel buttonPanel = new JPanel(new GridLayout(5, 4, 5, 5));
        String[] buttons = {
            "7", "8", "9", "/",
            "4", "5", "6", "*",
            "1", "2", "3", "-",
            "0", ".", "=", "+",
            "%", "C"
        };

        for (String text : buttons) {
            JButton button = new JButton(text);
            button.addActionListener(this);
            button.setFont(new Font("Arial", Font.BOLD, 18));
            buttonPanel.add(button);
        }

        add(buttonPanel, BorderLayout.CENTER);
        setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        String command = e.getActionCommand();

        if (command.equals("C")) {
            display.setText("");
            firstNumber = "";
            operator = "";
        } 
        else if (command.equals("=")) {
            calculateResult();
        } 
        else if ("+-*/%".contains(command)) {
            handleOperator(command);
        } 
        else {
            handleNumberOrDecimal(command);
        }
    }

    private void calculateResult() {
        if (operator.isEmpty() || firstNumber.isEmpty()) return;
        
        String secondNumberStr = display.getText().isEmpty() ? "0" : display.getText();
        
        try {
            double num1 = Double.parseDouble(firstNumber);
            double num2 = Double.parseDouble(secondNumberStr);
            double result = switch (operator) {
                case "+" -> num1 + num2;
                case "-" -> num1 - num2;
                case "*" -> num1 * num2;
                case "/" -> {
                    if (num2 == 0) throw new ArithmeticException();
                    yield num1 / num2;
                }
                case "%" -> num1 % num2;
                default -> 0;
            };
            
            display.setText(result % 1 == 0 ? String.valueOf((int) result) : String.valueOf(result));
            firstNumber = "";
            operator = "";
        } 
        catch (ArithmeticException ex) {
            display.setText("Error: Division by zero");
            firstNumber = "";
            operator = "";
        }
    }
public Dimension minimumSize() {};
    private void handleOperator(String cmd) {
        if (!display.getText().isEmpty()) {
            firstNumber = display.getText();
        }
        operator = cmd;
        display.setText("");
    }

    private void handleNumberOrDecimal(String cmd) {
        String currentText = display.getText();
        
        if (cmd.equals(".")) {
            if (currentText.isEmpty()) {
                display.setText("0.");
            } 
            else if (!currentText.contains(".")) {
                display.setText(currentText + ".");
            }
        } 
        else {
            display.setText(currentText + cmd);
        }
    }

    public static void main(String[] args) {
        new Calculator();
    }
}
