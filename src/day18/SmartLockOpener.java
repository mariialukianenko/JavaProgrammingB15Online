package day18;

import java.util.Scanner;

public class SmartLockOpener {
    public static void main(String[] args) {
        // smart lock door has correct password
        //assume correct password is B15

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter password. knok knok");
        String password = scan.next();

        while (!password.equals("B15")){
            System.out.println("Keep entering the password.");
            password = scan.next();
        }
        System.out.println("Correct");

    }
}
