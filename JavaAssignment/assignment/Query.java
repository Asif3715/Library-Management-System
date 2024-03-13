package assignment;

public class Query {
    static String insertbook="insert into book values(?,?,?,?,?)";
    static String insertuser="insert into user values(?,?,?,?)";
    static String viewbooks="select title from book";
    static String checkingid="select User_ID from user";
    static String checkingBook="select title from book";
    static String borrowingBook="update book set availability_status=? where title=";
    static String borrowedbooks="update user set Borrowed_books=? where User_ID=";
    static String checkavail="select availability_status from book where title =";
    static String returnbook="update user set Borrowed_books= NULL where User_ID=";
    static String returnbook2="update book set availability_status = NULL where title=";
    static String chekbookid="select * from book";
    static String chekbooktitle="select * from book";

}
