// Project-2 LIBRARY MANAGEMENT SYSTEM
import java.util.Scanner;

class BookDetails{
    String bookname;
    String authorname;
    int rate;

    BookDetails(String bookname, String authorname, int rate){
        this.bookname = bookname;
        this.authorname = authorname;
        this.rate = rate;
    }

    void displaybookdetails(){
        System.out.println("Book Name: " + bookname);
        System.out.println("Author Name: " + authorname);
        System.out.println("Price: " + rate + "$");
    }
}

class MemberDetails{
    String name;
    int custId;
    float phno;

    MemberDetails(String name, int custId, float phno){
        this.name = name;
        this.custId = custId;
        this.phno = phno;
    }

    void displaymemberdetails(){
        System.out.println("Member Name: " + name);
        System.out.println("Member ID: " + custId);
        System.out.println("Phone Number: " + phno);
    }
}

class ReturningDetails{
    int issuedDate;
    String Imonth;
    int Iyear;
    int returnDate;
    String Rmonth;
    int Ryear;

    ReturningDetails(int issuedDate, String Imonth, int Iyear,
                     int returnDate, String Rmonth, int Ryear){
        this.issuedDate = issuedDate;
        this.Imonth = Imonth;
        this.Iyear = Iyear;
        this.returnDate = returnDate;
        this.Rmonth = Rmonth;
        this.Ryear = Ryear;
    }

    void displayreturningdetails(){
        System.out.println("Issued Date: " + issuedDate + " / " + Imonth + " / " + Iyear);
        System.out.println("Returning Date: " + returnDate + " / " + Rmonth + " / " + Ryear);
    }
}

public class Main {
    public static void main(String args[]) {

        Scanner s = new Scanner(System.in);

        System.out.println("Enter the Book Name: ");
        String bookname = s.nextLine();

        System.out.println("Enter the Author Name: ");
        String authorname = s.nextLine();

        System.out.println("Enter the Price: ");
        int rate = s.nextInt();
        s.nextLine();

        System.out.println("Enter the Member Name: ");
        String name = s.nextLine();

        System.out.println("Enter the Member ID: ");
        int custId = s.nextInt();

        System.out.println("Enter the Phone Number: ");
        float phno = s.nextFloat();

        System.out.println("Enter number of returning records: ");
        int n = s.nextInt();
        s.nextLine();

        ReturningDetails[] rd = new ReturningDetails[n];

        for(int i = 0; i < n; i++){
            System.out.println("\nRecord " + (i+1));

            System.out.println("Enter the Issued Date: ");
            int issuedDate = s.nextInt();
            s.nextLine();

            System.out.println("Enter the Issued Month: ");
            String Imonth = s.nextLine();

            System.out.println("Enter the Issued Year: ");
            int Iyear = s.nextInt();
            s.nextLine();

            System.out.println("Enter the Returning Date: ");
            int returnDate = s.nextInt();
            s.nextLine();

            System.out.println("Enter the Returning Month: ");
            String Rmonth = s.nextLine();

            System.out.println("Enter the Returning Year: ");
            int Ryear = s.nextInt();
            s.nextLine();

            rd[i] = new ReturningDetails(issuedDate, Imonth, Iyear,returnDate, Rmonth, Ryear);
        }
        BookDetails b1 = new BookDetails(bookname, authorname, rate);
        MemberDetails m1 = new MemberDetails(name, custId, phno);

        System.out.println("\n--- DETAILS ---");
        b1.displaybookdetails();
        m1.displaymemberdetails();

        for(ReturningDetails r : rd){
            r.displayreturningdetails();
        }
    }
}
