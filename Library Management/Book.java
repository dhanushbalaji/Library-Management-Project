import java.util.Scanner;
public class Book {
    int bookId;
    String bookName;
    String authorName;
    Scanner input = new Scanner(System.in);
    Book(){ 
        System.out.println("Enter the Book Id: ");
        this.bookId = input.nextInt();
        input.nextLine();
        System.out.println("Enter the Book Name: ");
        this.bookName = input.nextLine();
        System.out.println("Enter the Author Name: ");
        this.authorName = input.nextLine();
    }
}

