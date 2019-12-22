package day08;
import java.util.Scanner;
public class WarmUpTask {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Enter your age:");
        int age = keyboard.nextInt();

        if (age>=18)
            System.out.println("You are ready to vote.");
        else
            System.out.println("Wait untill you are 18.");







    }
}
