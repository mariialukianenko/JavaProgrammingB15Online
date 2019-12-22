package day05;
import java.util.Scanner;


public class ScannerBoolean {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);

        System.out.println("Are you married?");
        boolean ifMarried = keyboard.nextBoolean();

        System.out.println("you sad - "+ifMarried);


        System.out.println("Enter fahrenheit:");
        double temPah = keyboard.nextDouble();

        double celsius = (5.0/9) * (temPah - 32);
        System.out.println("In celsius you have "+celsius);






    }
}
