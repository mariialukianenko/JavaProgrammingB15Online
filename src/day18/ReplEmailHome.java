package day18;
import java.util.Scanner;

public class ReplEmailHome {
    public static void main(String[] args) {


//        In this task, you need to swap first name with last name in the email. If email doesn't contains underscore - do not anything.
//
//        Example:
//        input: mike_tyson@gmail.com
//        output: tyson_mike@gmail.com
//
//        Example:
//        input: barakobama@gmail.com
//        output: barakobama@gmail.com
        Scanner scan = new Scanner(System.in);
        String email = scan.next();


        if (email.contains("_")){
            String name = email.substring(0, email.indexOf("_"));
            String lastName = email.substring(email.indexOf("_")+1, email.indexOf("@"));
            String replace = lastName +"_"+name;

            System.out.println(replace + email.substring(email.indexOf("@")));
        }else if (!email.contains("_")) {
            System.out.println(email);
        }





    }
}