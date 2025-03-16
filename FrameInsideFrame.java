import javax.swing.*;
import java.awt.*;

public class FrameInsideFrame {
    public static void main(String[] args) {
        JFrame outerFrame = new JFrame("Outer Frame");
        outerFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JDesktopPane desktop = new JDesktopPane();
        outerFrame.setContentPane(desktop);

        JInternalFrame innerFrame = new JInternalFrame("Inner Frame", true, true, true, true);
        innerFrame.setSize(200, 200); // Set size
        innerFrame.setLocation(10, 10); // Set location
        desktop.add(innerFrame);
        innerFrame.setVisible(true); // Make it visible

        outerFrame.setSize(400, 400); // Set outer frame size
        outerFrame.setVisible(true); // Show outer frame
    }
}
