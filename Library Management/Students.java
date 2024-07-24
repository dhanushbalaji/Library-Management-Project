import java.util.Scanner;
class Students{
    Scanner input = new Scanner(System.in);
    Student theStudent[] = new Student[5];
    int count = 0;
    void addStudent(Student s)
    {
        for (int i = 0; i < count; i++) {

            if (s.regNum.equalsIgnoreCase(theStudent[i].regNum)) {
                System.out.println("Student of Reg Num " + s.regNum + " is Already Registered.");
                return;
            }
        }
        if (count <= 50) {
            theStudent[count] = s;
            count++;
            System.out.println("Student added Successfully.");
        }
    }

    public void showAllStudent()
    {
        System.out.println("Student Name\tReg Number\t\t Department \t\t Year");
        for (int i = 0; i < count; i++) {
            System.out.println(theStudent[i].studentName + "\t\t\t" + theStudent[i].regNum +"\t\t" + theStudent[i].department + "\t\t"
            + theStudent[i].year);
        }
    }

    int isStudent()
    {
        System.out.println("Enter Reg Number:");
        String regNum = input.nextLine();
        for (int i = 0; i < count; i++) {
            if (theStudent[i].regNum.equalsIgnoreCase(regNum)) {
                return i;
            }
        }
        System.out.println("Student is not Registered.");
        System.out.println("Get Registered First.");
        return -1;
    }
}