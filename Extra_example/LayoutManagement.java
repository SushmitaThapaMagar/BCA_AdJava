package Extra_example;

import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.*;



public class LayoutManagement extends JFrame{
    JLabel Namelabel;
    JLabel Password;
    JTextArea Namearea;
    JTextArea Passwordarea;

    LayoutManagement(){
        setSize(400,400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setTitle("Layout Management");
        // setLayout(new FlowLayout());
        // setLayout(new BoxLayout(this.getContentPane(),1));

        setLayout(new BorderLayout());
        Namelabel= new JLabel("Name :");
        // Namelabel.setBounds(10,20,150,20);
        add(Namelabel, BorderLayout.EAST);

        
        Namearea = new JTextArea("Enter Your Name");
        // Namearea.setBounds(60,22,250,30);
        add(Namearea);

        setLayout(new BorderLayout());
        Password= new JLabel("Password :");
        // Password.setBounds(20,40,250,60);
        add(Password, BorderLayout.WEST);
       
        Passwordarea = new JTextArea("Enter Your Password");
        // Password.setBounds(120,100,250,30);
        add(Passwordarea);



        setVisible(true);




    }
    public static void main(String[] args) {
        new LayoutManagement();
    }
}
