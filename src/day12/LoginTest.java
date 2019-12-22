package day12;

public class LoginTest {
    public static void main(String[] args) {

        String userName = "user123";
        String password = "2469813q";

        if (userName.equals("user123") && password.equals("pass123"))
            System.out.println("Successful");
        else if (userName.equals("user123") )
            System.out.println("Password wrong");
        else if (userName.equals("pass123") )
            System.out.println("Username wrong");
        else
            System.out.println("Wrong username and password.");


    }
}
