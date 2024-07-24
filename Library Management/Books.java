import java.util.Scanner;
public class Books {
    Book theBooks[] = new Book[5];
    public static int count;
    Scanner input = new Scanner(System.in);
    public int compareBookObjects(Book b1, Book b2)
    {
        if (b1.bookName.equalsIgnoreCase(b2.bookName)) {
            System.out.println("Book of this Name Already Exists.");
            return 0;
        }
        if (b1.bookId == b2.bookId) {
            System.out.println("Book of this ID Already Exists.");
            return 0;
        }
        return 1;
    }

    void addBook(Book b){
        for (int i = 1; i < count; i++) {
            if (this.compareBookObjects(b, this.theBooks[i])== 0)
                return;
        }
        if (count < 5) {
            theBooks[count] = b;
            count++;
            System.out.println("The Book is added successfully.");
        }
        else {
            System.out.println(
                "No Space to Add More Books.");
        } 
    }
    
    void searchByBookid(){
        int bookId;
        System.out.println("Enter the Book id: ");
        bookId = input.nextInt();
        int flag = 0;
        for (int i = 0; i < count; i++) {
            if (bookId == theBooks[i].bookId) {
                System.out.println(theBooks[i].bookId + "\t\t" + theBooks[i].bookName + "\t\t" + theBooks[i].authorName );
                flag++;
                return;
            }
        }
        if (flag == 0)
            System.out.println("No Book for this Book Id  "
                               + bookId + " Found.");
    }

    void authorName(){
        System.out.println("Enter Author Name:");
        String authorName = input.nextLine();
        int flag = 0;
        for (int i = 0; i < count; i++) {
            if (authorName.equalsIgnoreCase(theBooks[i].authorName)) {
                System.out.println(theBooks[i].bookId + "\t\t" + theBooks[i].bookName + "\t\t" + theBooks[i].authorName );
                flag++;
            }
        }
        if (flag == 0)
            System.out.println("No Books of " + authorName + " Found.");
    }

    public void showAllBooks()
    {
        System.out.println("Book Id\t\tName\t\tAuthor");
        for (int i = 0; i < count; i++) {
            System.out.println(
                theBooks[i].bookId + "\t\t" + theBooks[i].bookName + "\t\t" + theBooks[i].authorName);
        }
    }
    public void dispMenu(){
        System.out.println("Press 1 to Add new Book.");
        System.out.println("Press 2 to Search a Book.");
        System.out.println("Press 3 to Show All Books.");
    }
}

