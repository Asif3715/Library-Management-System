package assignment;
import java.sql.*;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Mainmenu {
    
    public static void addbook() throws SQLException {
        Scanner inp = new Scanner(System.in);
        try{
        System.out.println("Enter the Book_ID");
        int id = inp.nextInt();
        inp.nextLine();
        System.out.println("Enter the Title");
        String title = inp.nextLine();
        System.out.println("Enter the name of the Author");
        String author = inp.nextLine();
        System.out.println("Enter the Genre");
        String genre = inp.nextLine();
        Books book = new Books(id, title, author, genre);
        Updation.addbook(book);}

        catch (InputMismatchException e) {
            System.out.println("Invalid input. Please enter a valid option.");
            inp.nextLine();
        

    }}

    public static void addUser() throws SQLException {
        Scanner inp = new Scanner(System.in);
        try {
        System.out.println("Enter the User_ID");
        int id = inp.nextInt();
        inp.nextLine();
        System.out.println("Enter the Name");
        String name = inp.nextLine();
        System.out.println("Enter the ContactNumber");
        String cont = inp.nextLine();

        User user = new User(id, name, cont);
        Updation.adduser(user);}
        catch (InputMismatchException e) {
            System.out.println("Invalid input. Please enter a valid option.");
            inp.nextLine();}

    }

    public static void viewBooks() throws SQLException {
        Updation.viewbooks();
    }

    public static void borrowBooks() throws SQLException {
        Scanner inp = new Scanner(System.in);
        try{System.out.println("Enter your ID");
        int id = inp.nextInt();
        inp.nextLine();
        boolean ans = Check.checkid(id);
        if (ans == true) {
            System.out.println("Enter the name of the Book you want to borrow?");

            String bn = inp.nextLine();
            boolean answer = Check.checkbook(bn);
            boolean an=Check.checkavailability(bn);
            if (answer == true &&an==true ) {
                // method to borrow book
                Updation.borrowbooks(id, bn);
            } else {
                System.out.println("Sorry this book is not found!");
            }

        } else {
            System.out.println("There is no such user with this ID");
        }} catch (InputMismatchException e) {
            System.out.println("Invalid input. Please enter a valid option.");
            inp.nextLine();}



    }

    public static void returningBooks() throws SQLException {
        Scanner inp = new Scanner(System.in);
        try{System.out.println("Enter your ID");
        int id = inp.nextInt();
        inp.nextLine();
        boolean ans = Check.checkid(id);
        if (ans == true) {
            System.out.println("Enter the name of the Book you want to return?");

            String bn = inp.nextLine();
            boolean answer = Check.checkbook(bn);
            
            if (answer == true) {
                
                Updation.returnBook(id, bn);
            } else {
                System.out.println("Sorry you entered the wrong book name!");
            }

        } else {
            System.out.println("There is no such user with this ID");
        }}
        catch (InputMismatchException e) {
            System.out.println("Invalid input. Please enter a valid option.");
            inp.nextLine();}

        

    }
    public static void searchBooksbyID()throws SQLException{
        Scanner inp = new Scanner(System.in);
        try{System.out.println("Enter the ID of the book");
        int op=inp.nextInt();
        inp.nextLine();
        Check.checkbookid(op);}
        catch (InputMismatchException e) {
            System.out.println("Invalid input. Please enter a valid option.");
            inp.nextLine();}



    }
    public static void searchBooksbyTitle()throws SQLException{
        Scanner inp = new Scanner(System.in);
        System.out.println("Enter the title of the book");
        String op=inp.nextLine();
        
        Check.checkbooktitle(op);
    }
    public static void checkavailabilityofbook()throws SQLException{
        Scanner inp = new Scanner(System.in);
        System.out.println("Enter the title of the book");
        String bn=inp.nextLine();
        boolean an=Check.checkavailability(bn);
        if(an==true){
            System.out.println("The Book is availaible!");

        }
        else{
            System.out.println("The book is not availaible");
        }

    }



    public static void main(String[] args) throws SQLException {
        Scanner sc = new Scanner(System.in);

        while(true){ 
     try{
        System.out.println("╔═══════════════════════════════════════╗");
        System.out.println("║      Library Management System        ║");
        System.out.println("╠═══════════════════════════════════════╣");
        System.out.println("║ 1. Add Book                           ║");
        System.out.println("╠───────────────────────────────────────╣");
        System.out.println("║ 2. Add User                           ║");
        System.out.println("╠───────────────────────────────────────╣");
        System.out.println("║ 3. Display Books                      ║");
        System.out.println("╠───────────────────────────────────────╣");
        System.out.println("║ 4. Borrow Books                       ║");
        System.out.println("╠───────────────────────────────────────╣");
        System.out.println("║ 5. Return Books                       ║");
        System.out.println("╠───────────────────────────────────────╣");
        System.out.println("║ 6. Search Books by Book ID            ║");
        System.out.println("╠───────────────────────────────────────╣");
        System.out.println("║ 7. Search Books by Title              ║");
        System.out.println("╠───────────────────────────────────────╣");
        System.out.println("║ 8. Check Availability of Books        ║");
        System.out.println("╚═══════════════════════════════════════╝");
        System.out.print("Enter your choice: ");
        
        short option = sc.nextShort();
        switch (option) {
            case 1:
                addbook();
                break;
            case 2:
                addUser();
                break;
            case 3:
                viewBooks();
                break;
            case 4:
                borrowBooks();
                break;
            case 5:
                returningBooks();
            
            case 6:
                searchBooksbyID();
                break;
            case 7:
                searchBooksbyTitle();
            case 8:
                checkavailabilityofbook();
            default:
            System.out.println("INVALID OPTION!");
        }
    }catch (InputMismatchException e) {
            System.out.println("Invalid input. Please enter a valid option.");
            sc.nextLine();

    }}
}}