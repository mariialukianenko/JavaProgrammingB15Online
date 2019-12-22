package day14;

public class CreateEmail {
    public static void main(String[] args) {

        String email = "lukianenko.mariia@gmail.com";

        if (!email.contains("@"))
            System.out.println("Invalid email.");
        else if (email.contains(" "))
            System.out.println("Invalid email.");
        else if (email.endsWith("gmail.com"))
            System.out.println("It is gmail email.");
        else if (email.endsWith("yahoo.com"))
            System.out.println("It is yahoo email.");
        else if (email.endsWith("russian.com"))
            System.out.println("It is russian email.");

    }
}
