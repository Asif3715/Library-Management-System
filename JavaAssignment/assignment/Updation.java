package assignment;
import java.sql.*;
public class Updation {
    public static void addbook(Books book)throws SQLException{
        Connection con= DB.connect();
        String query=Query.insertbook;
        PreparedStatement ppst= con.prepareStatement(query);
        ppst.setInt(1, book.getbookID());
        ppst.setString(2, book.getbooktitle());
        ppst.setString(3, book.getauthor());
        ppst.setString(4, book.getgenre());
        ppst.setString(5, null);
        
        ppst.executeUpdate();
        ppst.close();

    }
    public static void adduser(User user)throws SQLException{
        Connection con= DB.connect();
        String query=Query.insertuser;
        PreparedStatement ppst= con.prepareStatement(query);
        ppst.setInt(1, user.getUserId());
        ppst.setString(2, user.getusername());
        ppst.setString(3, user.getusercontact());
        ppst.setString(4, null);
        
        ppst.executeUpdate();
        ppst.close();

    }
    public static void viewbooks() throws SQLException{
        Connection con=DB.connect();
        String query=Query.viewbooks;
        Statement st=con.createStatement();
        ResultSet rs=st.executeQuery(query);
        System.out.println("\t\tBOOKS");
        while (rs.next()) {
            String b=rs.getString("title");
            System.out.println(b);
        }

    }
    public static void borrowbooks(int ID, String bookname) throws SQLException{
        Connection con = DB.connect();
        String query=Query.borrowingBook;
        //setting availability status as users ID
        PreparedStatement ppst= con.prepareStatement(query+"'"+ bookname+"'");
        
        ppst.setInt(1, ID);
        
        ppst.executeUpdate();
      
        String query2=Query.borrowedbooks;

        ppst =con.prepareStatement(query2+ID);
        ppst.setString(1, bookname);

        ppst.executeUpdate();
        System.out.println("Done successfully");
        ppst.close();

    }
    public static void returnBook(int id, String bn) throws SQLException {
        Connection con = DB.connect();
        String query=Query.returnbook;
        PreparedStatement pst=con.prepareStatement(query+id);
        
        pst.executeUpdate();

        String query2=Query.returnbook2;
        PreparedStatement ppst=con.prepareStatement(query2+"'"+bn+"'");
        
        ppst.executeUpdate();
        System.out.println("Book returned successfully!");
    }
}
