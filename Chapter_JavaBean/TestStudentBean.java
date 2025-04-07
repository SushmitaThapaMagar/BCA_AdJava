package Chapter_JavaBean;
public class TestStudentBean {
    public static void main(String[] args) {
        StudentBeans student = new StudentBeans();
        student.setName("John Doe");
        student.setRollNumber(101);
        
        System.out.println(student);
    }
}