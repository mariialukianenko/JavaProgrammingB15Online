package day05;
import java.util.Scanner;

public class ScannerPractice {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);

        System.out.println("What is your name?");
        String name = keyboard.next();
        System.out.println("Your name is "+name);

        System.out.println("What is your birth year?");
        int birthYear = keyboard.nextInt();
        System.out.println("You were born on "+birthYear);

        int yourAge = 2019 - birthYear;
        System.out.println("You are now "+yourAge);

        System.out.println("What is your height?");
        double height = keyboard.nextDouble();
        System.out.println("Your height is "+height);
        System.out.println("You are tall. It is cool.");

        String love;
        love = keyboard.nextLine();
        System.out.println("Do you love Mariia?");
        love = keyboard.nextLine();
        System.out.println("OOOOOOO, I love you too, honey.");








    }
}
