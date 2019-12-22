package day06;
import java.util.Scanner;

public class ScannerCapturingMiltipleWord {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);

        System.out.println("What is your name?");
        String name = keyboard.next();
        System.out.println("You have entered "+name);

        // we can do just line 14 like: String nameBoth = keyboard.nextLine(); and you do not need line 13.

        keyboard.nextLine();
        System.out.println("What is your first and last name?");
        String nameBoth = keyboard.nextLine();
        System.out.println("You have entered "+nameBoth);


        System.out.println("Please enter your full name and adress: ");
        String yourData = keyboard.nextLine();
        System.out.println("You entered "+yourData);




    }
}
