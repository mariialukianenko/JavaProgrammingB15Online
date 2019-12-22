package day18;
import java.util.Scanner;
public class EmailReplHome {
    public static void main(String[] args) {

//        Example:
//        Input: craig_federighi@apple.com
//        Output:
//        First name: Craig
//        Last name: Federighi
//        Domain: apple
//        Top-Level Domain: com

        Scanner scan = new Scanner(System.in);
        String email = scan.next();

        String firstName = email.substring(0, email.indexOf("_"));
        String firstUpperCase = firstName.substring(0,1).toUpperCase();
        String correctName = firstUpperCase + firstName.substring(1);
        System.out.println(correctName);

        String lastName = email.substring(email.indexOf("_")+1, email.indexOf("@"));
        String firstLastNameUpperCase = lastName.substring(0,1).toUpperCase();
        String correctLastName = firstLastNameUpperCase + lastName.substring(1);
        System.out.println(correctLastName);

        String domain = email.substring(email.indexOf("@")+1, email.indexOf("."));
        System.out.println(domain);

        String topLevelDomain = email.substring(email.indexOf(".")+1);
        System.out.println(topLevelDomain);







    }
}
