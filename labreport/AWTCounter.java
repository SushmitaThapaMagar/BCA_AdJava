import java.awt.*;
import java.awt.event.*;
import java.lang.classfile.Label;

import javax.swing.JFrame;

public class AWTCounter extends Frame implements ActionListener {
    private Label lblCount;      // Label to display "Counter"
    private TextField tfCount;   // Non-editable text field to display the counter value
    private Button btnCount;     // Button to trigger count increment
    private int count = 0;       // Counter's value

    // Constructor to set up UI components and event handlers
    public AWTCounter() {
        
        setLayout(new FlowLayout()); // Arrange components left-to-right

        lblCount = new Label("Counter"); // Construct Label
        add(lblCount);                  // Add Label to Frame

        tfCount = new TextField(count + "", 10); // Construct TextField
        tfCount.setEditable(false);               // Set TextField non-editable
        add(tfCount);                            // Add TextField to Frame

        btnCount = new Button("Count");           // Construct Button
        add(btnCount);                            // Add Button to Frame

        btnCount.addActionListener(this);         // Register listener

        setTitle("AWT Counter");
        setSize(250, 100);
        setVisible(true);
    }

    // ActionEvent handler - Called back when button is clicked
    @Override
    public void actionPerformed(ActionEvent evt) {
        ++count; // Increase the counter value
        tfCount.setText(count + ""); // Display on the TextField
    }

    // The entry main() method
    public static void main(String[] args) {
        new AWTCounter();
    }
}
