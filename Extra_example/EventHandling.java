package Extra_example;
import java.awt.*; //imports classes from the AWT package, which is used for creating GUI components like Frame, Button, etc
import java.awt.event.*; // imports classes related to event handling, such as ActionEvent and ActionListener
public class EventHandling { 
    public static void main(String[] args) { //main method

        // Frame : a top-level window with a title and border
        // The constructor Frame("Event Handling Example") creates a new window with the title "Event Handling Example"
        Frame frame = new Frame("Event Handling Example"); 
        Button button = new Button("Click Me"); // Button is a GUI component that users can click

        //addActionListener(): registers an ActionListener to the button so that it can respond to click events
        //ActionListener(): an interface that listens for action events (e.g., button clicks)

        button.addActionListener(new ActionListener() { 
            @Override
            //actionPerformed(ActionEvent e) method is overridden to specify what happens when the button is clicked
            public void actionPerformed(ActionEvent e) {
                System.out.println("Button clicked!");
            }  
        });

        //The button is added to the frame's layout
        frame.add(button);
        //Setting Frame Properties
        frame.setSize(300, 200);
        frame.setLayout(new FlowLayout());
        frame.setVisible(true);
    }}
