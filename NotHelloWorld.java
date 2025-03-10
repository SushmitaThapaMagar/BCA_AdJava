
import javax.swing.*;
import java.awt.*;

public class NotHelloWorld {
    public static void main(String[] args) {

        EventQueue.invokeLater(()->{  //EventQueue.invokeLater() : call the event Later
        JFrame frame = new NotHelloWorldFrame();
        frame.setTitle("Not Saying Hello");
        frame.setBounds(300,300,300,300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    });
    }
}


class NotHelloWorldFrame extends JFrame{ //JFrame is a cointainer
public NotHelloWorldFrame(){
    add(new NotHelloWorldComponent());
    pack();
}
}
class NotHelloWorldComponent extends JComponent{ //JComponent includes components in cointainer
    public static final int MESSAGE_X = 75;
    public static final int MESSAGE_Y = 100;

    private static final int DEFAULT_WIDTH = 300;
    private static final int DEFAULT_HEIGHT = 200;

    public void paintComponent(Graphics g){
        g.drawString("Not a Hello, World Program", MESSAGE_X, MESSAGE_Y);
    }
    public Dimension getPreferredDimension(){
        return new Dimension(DEFAULT_WIDTH, DEFAULT_HEIGHT);
    }
}