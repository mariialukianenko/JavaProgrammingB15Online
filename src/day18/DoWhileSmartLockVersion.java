package day18;

import java.util.Scanner;

public class DoWhileSmartLockVersion {
    public static void main(String[] args) {
        Scanner scan = new Scanner (System.in);
        String password;

        do{
            System.out.println("Enter password. knok knok");
            password = scan.next();

        }while (!password.equals("B15"));
        System.out.println("Door is open");
    }
}
