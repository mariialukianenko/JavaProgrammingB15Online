package day00Traning;
import java.util.Scanner;

public class DoWhileLoop {
    public static void main(String[] args) {

        int count, number;
        System.out.println("Enter number:");
        Scanner keyboard = new Scanner (System.in);
        number = keyboard.nextInt();

        count = 1;
        do {
            System.out.println(count+", ");
            count++;
        } while (count <= number);
        System.out.println();
        System.out.println("Buckel my shoe.");
    }
}
