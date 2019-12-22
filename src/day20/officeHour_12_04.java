package day20;

import java.util.Scanner;

public class officeHour_12_04 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter 1 st word with single chatracter:");
        String first = scanner.next();
        char firstAsChar = first.charAt(0);

        System.out.println("Enter 2 st word with single chatracter:");
        String second = scanner.next();
        char secondAsChar = second.charAt(0);

        for (char iChar = firstAsChar; iChar<=secondAsChar; iChar++){
            System.out.print( iChar + " ");
        }


    }
}
