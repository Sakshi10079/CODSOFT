import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;
public class student {
   private String name;
   private int rollNo;


    private String grade;
    public student(String name,int rollNo, String grade) {
        this.name = name;
        this.rollNo = rollNo;
        this.grade = grade;
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    public int getRollNo() {
        return rollNo;
    }
    public void setRollNo(int rollNo) {
        this.rollNo = rollNo;
    }
    public String getGrade() {
        return grade;
    }

    public void setGrade(String grade) {
        this.grade = grade;
    }

@Override
 public String toString() {

    return "Name: " + name + ", Roll Number: " + rollNo + ", Grade: " + grade;
}
}
