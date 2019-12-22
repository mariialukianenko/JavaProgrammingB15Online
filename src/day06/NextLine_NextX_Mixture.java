package day06;
import java.util.Scanner;
public class NextLine_NextX_Mixture {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);

        System.out.println("What is your name?");
        String name = keyboard.nextLine();
        System.out.println("Your name is "+ name);

        System.out.println("What is your age?");
        int age = keyboard.nextInt();
        System.out.println("Your age is "+ age);

        keyboard.nextLine();
        System.out.println("What is your adress?");
        String adress = keyboard.nextLine();
        System.out.println("Your adress is "+ adress);


    }
}
