package day34;

public class Create2LoginMethod {
    public static void main(String[] args) {

        login1("user", "abc123");
        login1("User", "abc123");

        System.out.println(login2("user", "abc123"));
        System.out.println(login2("User", "abc123"));


    }

    public static void login1 (String userName, String password){

        if (userName. equals("user") && password.equals("abc123")){
            System.out.println("Login successful.");
        }else{
            System.out.println("Failed.");
        }
    }

    public static boolean login2 (String userName, String password){
        if (userName. equals("user") && password.equals("abc123")){
            return true;
        }else
            return false;

        // or
        // return userName. equals("user") && password.equals("abc123");
    }
}
