package day08;
import java.util.Scanner;

public class IfElseHome {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter number:");
        int number = scan.nextInt();

        if (!(number<0))     // (!     )   use ! to negate the value of a boolean
            System.out.println("Ok");
        else
            System.out.println("Negative");



    }
}
