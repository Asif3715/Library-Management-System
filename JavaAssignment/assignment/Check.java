package assignment;

import java.sql.*;

public class Check {
    public static boolean checkid(int id) throws SQLException {
        Connection con = DB.connect();
        Statement st = con.createStatement();
        String query = Query.checkingid;
        ResultSet rs = st.executeQuery(query);
        boolean chh = false;
        while (rs.next()) {
            int i = rs.getInt("User_ID");
            if (i == id) {
                chh = true;
            }

        }
        return chh;
    }

    public static boolean checkbook(String bn) throws SQLException {
        Connection con = DB.connect();
        Statement st = con.createStatement();
        String query = Query.checkingBook;
        ResultSet rs = st.executeQuery(query);
        boolean chh = false;
        while (rs.next()) {
            String i = rs.getString("title");
            if (i.equals(bn)) {
                chh = true;
            }

        }
        return chh;

    }
   public static boolean checkavailability(String bn) throws SQLException{
    Connection con = DB.connect();
    Statement st = con.createStatement();
    String query = Query.checkavail;
    ResultSet rs = st.executeQuery(query+"'"+bn+"'");
    boolean a=false;
    while(rs.next()){
        String i = rs.getString("availability_status");
        if(rs.wasNull()){
            a=true;
        }
    }
    return a;
   }
   public static void checkbookid(int n)throws SQLException{
    Connection con= DB.connect();
    String query=Query.chekbookid;
    Statement st=con.createStatement();
    ResultSet rs=st.executeQuery(query);
    boolean aa=false;
    while(rs.next()){
        int i=rs.getInt("book_ID");
        if(i==n){
            System.out.println("\t\tBOOK INFO:");
            String s=rs.getString("title");
            String a=rs.getString("author");
            String g=rs.getString("genre");
            System.out.println("Book name: "+s);
            System.out.println("Book Author: "+a);
            System.out.println("Book Genre: "+g);
            aa=true;

        }
        
    }
   if(aa==false){
    System.out.println("NO BOOK FOUND WITH THIS ID!!!!!");
   }

   }
   public static void checkbooktitle(String n)throws SQLException{
    Connection con= DB.connect();
    String query=Query.chekbooktitle;
    Statement st=con.createStatement();
    ResultSet rs=st.executeQuery(query);
    boolean aa=false;
    while(rs.next()){
        String i=rs.getString("title");
        if(n.equals(i)){
            System.out.println("\t\tBOOK INFO:");
            String s=rs.getString("title");
            String a=rs.getString("author");
            String g=rs.getString("genre");
            System.out.println("Book name: "+s);
            System.out.println("Book Author: "+a);
            System.out.println("Book Genre: "+g);
            aa=true;

        }
        
    }
   if(aa==false){
    System.out.println("NO BOOK FOUND WITH THIS TITLE!!");
   }

   }
}
