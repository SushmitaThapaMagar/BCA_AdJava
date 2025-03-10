import javax.swing.*;

class CommonGUI extends JFrame{
    JMenuBar menuBar;
    JMenu scrollMenu, dialogMenu, simpleForm;
    JMenuItem verticalScroll, horizontalScroll, noScroll, confirmation,alertDialog;
    JTextField textFeild;
    JPasswordField passwordField;
    JLabel label;
    JCheckBox checkBox;
    JRadioButton radioButton; //selection of gender like male and female
    JButton submitButton;
    JTextArea textArea;

    CommonGUI(){
        setSize(600,500);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setTitle("Common GUI Components");

        menuBar=new JMenuBar();
        scrollMenu=new JMenu("Scroll Menu");
        dialogMenu=new JMenu("Dialog Menu");
        simpleForm=new JMenu("Simple Menu");
        
        scrollMenu.setMnemonic('S'); //short form representator
        scrollMenu.setMnemonic('D');
        scrollMenu.setMnemonic('F');
        menuBar.add(scrollMenu);
        menuBar.add(dialogMenu);
        menuBar.add(simpleForm);

         // Add Menu Items
         verticalScroll = new JMenuItem("Vertical Scroll");
         horizontalScroll = new JMenuItem("Horizontal Scroll");
         noScroll = new JMenuItem("No Scroll");
         confirmation = new JMenuItem("Confirmation");
         alertDialog=new JMenuItem("Alert Dialog");

        scrollMenu.add(verticalScroll);
        scrollMenu.add(horizontalScroll);
        scrollMenu.add(noScroll);
        dialogMenu.add(confirmation);
        dialogMenu.add(alertDialog);

        add(menuBar);
        setVisible(true);
    }
    public static void main(String[] args){
        CommonGUI commonGUI=new CommonGUI();
    }

}