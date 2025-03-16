//Student Registration form created by using AWT Controls

import java.awt.*;
class Student extends Frame{
    Label lblhd=new Label("Student Details", Label.CENTER);
    Label lblname=new Label("Name", Label.LEFT);
    Label lblage=new Label("Age", Label.LEFT);
    Label lblsex=new Label("Sex(M/F)", Label.LEFT);
    Label lbladdress=new Label("Address", Label.LEFT);
    Label lblcourse=new Label("Course", Label.LEFT);
    Label lblsem=new Label("Semester", Label.LEFT);
    Label l7=new Label("",Label.RIGHT);
    Label lblhobbies=new Label("Hobbies", Label.LEFT);
    TextField txtname=new TextField();
    Choice chage=new Choice();
    CheckboxGroup cbg=new CheckboxGroup();
    Checkbox chkmale=new Checkbox("Male",true,cbg);
    Checkbox chkfemale=new Checkbox("Female",false,cbg);
    List hb=new List(3,true);
    TextArea txtaddress=new TextArea("",180,90,TextArea.SCROLLBARS_VERTICAL_ONLY);
    Choice course=new Choice();
    Choice sem=new Choice();
    Choice age=new Choice();
    Button b1=new Button("Save");
    Student(){
        setBackground(Color.cyan);
        setForeground(Color.black);
        setLayout(null);

        lblhd.setBounds(10,40,280,20);
        add(lblhd);
        lblname.setBounds(100,65,170,20);
        add(lblname);
        txtname.setBounds(120,65,170,20);
        add(txtname);

        lblage.setBounds(25,90,90,20);
        add(lblage);
        age.setBounds(120,90,50,20);

        add(chage);
        chage.setBounds(125, 200 , 50 ,650);
        chage.add("17");
        chage.add("18");
        chage.add("19");
        chage.add("20");
        chage.add("21");

        lblsex.setBounds(120,90,50,20);
        add(lblsex);
        chkmale.setBounds(170,120,60,20);
        chkfemale.setBounds(120,120,60,20);

        add(chkmale);
        add(chkfemale);

        lblhobbies.setBounds(26,150,90,20);
        add(lblhobbies);
        hb.setBounds(120,150,90,20);
        add(hb);
        hb.add("Playing");
        hb.add("Visiting");
        hb.add("Reading");
        hb.add("Swimming");

        lbladdress.setBounds(25,230,90,20);
        add(lbladdress);
        txtaddress.setBounds(120,230,170,60);
        add(txtaddress);
        lblcourse.setBounds(25,305,90,20);
        add(lblcourse);

        course.setBounds(120,305,90,20);
        course.add("BSc.CSIT");
        course.add("BIM");
        course.add("BIT");
        course.add("BCA");
        course.add("B.E. Computer");
        add(course);

        lblsem.setBounds(25,335,90,20);
        add(lblsem);
        sem.add("1");
        sem.add("2");
        sem.add("3");
        sem.add("4");
        sem.add("5");
        sem.add("6");
        sem.add("7");
        sem.add("8");
        sem.setBounds(120,335,90,20);
        add(sem);

        l7.setBounds(25,225,90,20);
        add(l7);
        b1.setBounds(120,400,50,20);
        add(b1);


    }
    public static void main(String[] args) {
        Student stu=new Student();
        stu.setSize(new Dimension(500,500));
        stu.setTitle("Student Registration");
        stu.setVisible(true);
        }
    }
