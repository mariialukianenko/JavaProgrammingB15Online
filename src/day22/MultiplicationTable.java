package day22;

import java.util.Scanner;

public class MultiplicationTable {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter number:");
        int number = scan.nextInt();

        for (int i = 1; i <=10 ; i++) {
            System.out.println(number+"*"+i+"="+number*i);
        }

    }
}