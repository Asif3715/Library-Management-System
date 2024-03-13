package assignment;

public class Books {
    private int bookID;
    private String title;
    private String author;
    private String genre;

    // String availibility;
    // 
    public Books(int bID, String t, String aut, String g) {
        this.bookID = bID;
        this.title = t;
        this.author = aut;
        this.genre = g;

    }

    public int getbookID() {
        return bookID;
    }

    public String getbooktitle() {
        return title;
    }

    public String getauthor() {
        return author;
    }

    public String getgenre() {
        return genre;
    }
}
  