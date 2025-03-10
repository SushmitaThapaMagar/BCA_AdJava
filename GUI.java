import javax.swing.*;
import java.awt.*;
class ControlsDemo extends JFrame {
    JPanel p1, p2,p3,sp1,sp2;
    JLabel lblname,lblpass,lblsex,lblhobby,lblcountry,lblcomments;
    JTextField txtname;
    JPasswordField txtpass;
    JRadioButton rbmale,rbfemale;
    ButtonGroup bg;
    JCheckBox chkplay,chkread,chkvisit,chktkt;
    JComboBox cmbcountry;
    JTextArea txtarea;
    JScrollPane sp;
    JSlider sl;
    ControlsDemo() {
        setSize(600, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setTitle("Control Demo");
        p1 = new JPanel();
        p2 = new JPanel();
        p3 = new JPanel();
        sp1 = new JPanel();
        sp2 = new JPanel();
        p1.setPreferredSize(new Dimension(600, 50));
        p2.setPreferredSize(new Dimension(50, 400));

        //Adding three pannel in frame
        setLayout(new BorderLayout());
        add(p1, BorderLayout.NORTH);
        add(p2, BorderLayout.WEST);
        add(p3, BorderLayout.CENTER);
        p3.setLayout(new GridLayout());

        //Adding two panels in panel p3
        p3.add(sp1);
        p3.add(sp2);

        //Defining border of panels
        p1.setBorder(BorderFactory.createLineBorder(Color.black));
        p2.setBorder(BorderFactory.createLineBorder(Color.black));
        p3.setBorder(BorderFactory.createLineBorder(Color.black));

        //no Layout Manager
        sp1.setLayout(null);
        sp2.setLayout(null);

        //Setting background color of panels
        sp1.setBackground(Color.BLUE);
        sp2.setBackground(Color.BLUE);


        //Creating and Adding Label and Text Field
        lblname = new JLabel("User Name");
        txtname = new JTextField(20);
        lblname.setBounds(80, 20, 100, 25);
        txtname.setBounds(20, 20, 200, 25);
        sp1.add(lblname);
        sp2.add(txtname);

        //Creating and Adding Password field
        lblpass = new JLabel("Password");
        txtpass = new JPasswordField(28);
        lblpass.setBounds(20, 50, 100, 25);
        txtpass.setBounds(20, 20, 100, 25);
        sp1.add(lblpass);
        sp2.add(txtpass);

        //Creating and Adding Radio Button
        lblsex = new JLabel("Sex");
        rbmale = new JRadioButton("Male", true);
        rbfemale = new JRadioButton("Female");
        bg = new ButtonGroup();
        bg.add(rbmale);
        bg.add(rbfemale);
        lblsex.setBounds(80, 80, 100, 25);
        rbmale.setBounds(20, 80, 75, 25);
        rbfemale.setBounds(100, 80, 75, 25);
        sp1.add(lblsex);
        sp2.add(rbmale);
        sp2.add(rbfemale);


        //Creating and Adding checkbox
        lblhobby = new JLabel("Hobbies");
        chkplay = new JCheckBox("Playing");
        chkread = new JCheckBox("Reading");
        chkvisit = new JCheckBox("Visiting");
        chktkt = new JCheckBox("Ticketing");
        lblhobby.setBounds(80, 110, 100, 25);
        chkplay.setBounds(20, 110, 75, 25);
        chkread.setBounds(100, 110, 75, 25);
        chkvisit.setBounds(180, 110, 75, 25);
        chktkt.setBounds(20, 140, 90, 25);
        sp1.add(lblhobby);
        sp2.add(chkplay);
        sp2.add(chkread);
        sp2.add(chkvisit);
        sp2.add(chktkt);

        //creating and Adding combo box
        lblcountry = new JLabel("Select Country");
        cmbcountry = new JComboBox();
        cmbcountry.addItem("Nepal");
        cmbcountry.addItem("India");
        cmbcountry.addItem("China");
        lblcountry.setBounds(80, 170, 100, 25);
        lblcountry.setBounds(20, 170, 100, 25);
        cmbcountry.setSelectedIndex(0);
        sp1.add(lblcountry);
        sp2.add(cmbcountry);

        //Creating and Adding text area and Scroll pane
        lblcomments = new JLabel("Comments");
        txtarea = new JTextArea(3, 20);
        sp = new JScrollPane(txtarea);
        lblcomments.setBounds(80, 200, 100, 25);
        sp.setBounds(20, 200, 200, 75);
        sp1.add(lblcomments);
        sp2.add(sp);

        //Creating and Adding Adding Slider
        sl = new JSlider();
        sl.setBounds(20, 280, 200, 25);
        sp2.add(sl);
        setVisible(true);


    }
    public static void main(String[] args) {
        ControlsDemo frame = new ControlsDemo();
    }

}

