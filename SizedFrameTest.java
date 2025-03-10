import java.awt.*;
import javax.swing.*;

public class SizedFrameTest {
    public static void main(String[] args){
        EventQueue.invokeLater(()->{
            JFrame frame = new SizedFrame();
            frame.setTitle("SizedFrame");
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.setVisible(true);

        });
    }
    
}
class SizedFrame extends JFrame{
    public SizedFrame(){
        Toolkit kit = Toolkit.getDefaultToolkit();
        Dimension screenSize = kit.getScreenSize();
        int ScreenHeight = screenSize.height;
        int screenWidth = screenSize.width;

        setSize(screenWidth/2, ScreenHeight/2);
        setLocationByPlatform(true);

        Image img=new ImageIcon("icon.gif").getImage();
        setIconImage(img);
    }
}
