
import java.awt.*;
import javax.swing.JFrame;

public class SimpleTest {
    static GraphicsConfiguration gc;
    public static void main(String[] args) {
        JFrame frame = new JFrame(gc);
        frame.setTitle("Welcome to hotel California");
        frame.setSize(600,400);
        frame.setLocation(200,200);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setResizable(false);
    }
    
}
