import java.util.List;
import java.util.ArrayList;
public class studentManagementSystem  {
    private List<student> students;
    public studentManagementSystem() {
     students= new ArrayList<>();
    }
    public void Add(student student){
     students.add(student);
    }
   public  void Remove(student student){
     students.remove(student);
    }
   public student Search(int rollNo){
     for(student student : students){
         if(student.getRollNo()== rollNo){
             return student;
         }
     }
     return null;
    }
    public List<student> getAllStudents(){
        return students;
    }
      public   void Display(){
        for(student student : students){
            System.out.println(student);
        }
      }
    }


