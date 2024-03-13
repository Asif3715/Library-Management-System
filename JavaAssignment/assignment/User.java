package assignment;

public class User {
    int user_id;
    String name;
    String cont;

    User(int uid, String n, String cont) {
        this.user_id = uid;
        this.name = n;
        this.cont = cont;

    }

    public int getUserId() {
        return user_id;
    }

    public String getusername(){
        return name;
    }

    public String getusercontact(){
        return cont;
    }

}
