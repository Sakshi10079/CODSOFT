import java.text.NumberFormat;
import java.util.Scanner;

public class studentManagementSystemTask3 {
    private static Scanner sc = new Scanner(System.in);
    private static studentManagementSystem Stu = new studentManagementSystem();
    public static void main(String args[]){
        boolean isRunning = true;
        while (isRunning){
         printMenu();
         int choice = getUserChoice();
            switch (choice) {
                case 1:
                    Add();
                    break;
                case 2:
                    Edit();
                    break;
                case 3:
                    Search();
                    break;
                case 4:
                    Display();
                    break;

                case 5:
                    isRunning = false;
                    System.out.println("Exiting the App");
                    System.exit(0);
                    break;
                default:
                    System.out.println("Invalid option");
            }
        }
    }
    private static void printMenu(){
        System.out.println("Welcome to the CODSOFT 3rd Task : studentManagementSystem interface");
        System.out.println("1. Add student");
        System.out.println("2. Edit student");
        System.out.println("3. Search for a student");
        System.out.println("4. Display all the students");
        System.out.println("5. Exit");
        System.out.println("Enter your choice");
    }
    private static  int getUserChoice(){
        try{
            return Integer.parseInt(sc.nextLine());
        }
        catch (NumberFormatException e){
            return -1;
        }
    }
    private static void Add(){
        System.out.println("Enter the students's name: ");
        String name = sc.nextLine();
        while(name.trim().isEmpty()){
            System.out.println("name cannot be empty. please try again!");
            System.out.println("Enter the students's name: ");
             name = sc.nextLine();
        }
        int rollNo= -1;
        boolean isValidRollNo = false;
        while(!isValidRollNo){
            System.out.println("Enter the students's RollNo: ");
            try{
                rollNo= Integer.parseInt(sc.nextLine());
                isValidRollNo= true;
            }
            catch (NumberFormatException e){
                System.out.println("invalid rollno format. please enter a valid integer");
            }
        }
      System.out.println("Enter the student's grade: ");
        String grade = sc.nextLine();
        while (grade.trim().isEmpty()){
            System.out.println("grade cannot be empty. Enter the student's grade in digits like 1,2,3 etc.");
            grade= sc.nextLine();
        }
        student newStudent = new student(name,rollNo,grade);
        Stu.Add(newStudent);

        System.out.println("Student added successfully!");
    }
    private static void Edit(){
        System.out.println("Enter the rollno of the student whose info you want to edit: ");
        int rollNo = Integer.parseInt(sc.nextLine());
       student foundStudent = Stu.Search(rollNo);
       if(foundStudent != null) {
           System.out.println("Student found: " + foundStudent.getName());
           System.out.println("Enter the new name (press enter to skip): ");
           String name = sc.nextLine();
           if (!name.isEmpty()) {
               foundStudent.setName(name);
           }
           System.out.println("Enter the new grade (press enter to skip): ");
           String grade = sc.nextLine();
           if (!grade.isEmpty()) {
               foundStudent.setGrade(grade);
           }
           System.out.println("Student info updated successfully! ");
       } else {
               System.out.println("Student with rollNo: " + rollNo + "not found.");
       }
    }
    private static void Search(){
      System.out.println("Enter the rollno of the student you want to search for: ");
      int rollNo = Integer.parseInt(sc.nextLine());

      student foundStudent = Stu.Search(rollNo);
      if (foundStudent != null){
          System.out.println("Student found: " + foundStudent.getName() + ",RollNo: " + foundStudent.getRollNo() +
                  ", Grade: " + foundStudent.getGrade());
      }
      else {
          System.out.println("Student with rollNo: " + rollNo + "not found.");
      }
    }
    private static void Display(){
        System.out.println("All students: ");
        Stu.Display();
    }

}
