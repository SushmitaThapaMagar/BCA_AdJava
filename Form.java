import javax.swing.*;

public class Form extends JFrame{
    JLabel label;

    Form(){
        setSize(400,500);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(null);
        label = new JLabel("This is label.");
        label.setBounds(40, 50, 80, 20);
        add(label);
        setVisible(true);
    }

    public static void main(String[] args){
        new Form();
    }
}