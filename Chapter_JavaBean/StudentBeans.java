package Chapter_JavaBean;
import java.io.Serializable;

public class StudentBeans implements Serializable {
    private String name;
    private int rollNumber;
    public StudentBeans() {}
    // Getters and setters
    public String getName() { //get : updates the value of a private attribute in a class
        return name;
    }
    public void setName(String name) { //Provides controlled access to private fields
        this.name = name;
    }
    public int getRollNumber() {
        return rollNumber;
    }
    public void setRollNumber(int rollNumber) {
        this.rollNumber = rollNumber;
    }
    @Override
    public String toString() {
        return "Student [name=" + name + ", rollNumber=" + rollNumber + "]";
    }
}