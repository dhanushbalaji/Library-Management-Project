import java.util.Scanner;
public class Student {
    String studentName;
    String regNum;
    String department;
    int year;
     Scanner input = new Scanner(System.in);
     Student(){
        System.out.println("Enter the Student Name: ");
        this.studentName = input.nextLine();
        System.out.println("Enter the Register Number: ");
        this.regNum = input.nextLine();
        System.out.println("Enter the Department: ");
        this.department = input.nextLine();
        System.out.println("Enter the Year ");
        this.year = input.nextInt();
     }
}
