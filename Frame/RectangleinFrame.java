package Frame;
import javax.swing.*;
import java.awt.*;

public class RectangleinFrame {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Text Rectangle Frame");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300, 200);

        JPanel panel = new JPanel() {
            @Override
            protected void paintComponent(Graphics g) {
                super.paintComponent(g);
                Graphics2D g2d = (Graphics2D) g;
                g2d.setColor(Color.BLACK); // Color of the rectangle
                g2d.drawRect(50, 50, 200, 100); // Draw the rectangle
                
                g2d.setColor(Color.BLACK); // Color of the text
                g2d.setFont(new Font("Arial", Font.PLAIN, 14)); // Set font for the text
            }
        };

        frame.add(panel);
        frame.setVisible(true);
    }
}
