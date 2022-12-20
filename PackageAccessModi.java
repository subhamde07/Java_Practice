package JAVA;

class Account{
    String bankName;  // default Access Modifiers
    public String name;     // public modifiers
    protected String email;     //use class and child class
    private String password;    // use only class


    // getters & setters -->
    public String getPassword() {
        return this.password;
    }

    public void setPassword(String pass){
        this.password = pass;       //setter
    }
}

public class PackageAccessModi {
    public static void main(String[] args) {
        Account a1 = new Account();
        a1.name = "Apna College";
        a1.setPassword("abcd");
        a1.email = "hello@apnacollege.com";
    }
}
