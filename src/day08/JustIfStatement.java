package day08;
import java.util.Scanner;

public class JustIfStatement {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("What is your current speed?");
        int currentSpeed = scan.nextInt();

        System.out.println("What is speed limet?");
        int speedLimit = scan.nextInt();

        if (currentSpeed>=speedLimit) {
            System.out.println("Get pulled over by police");
            System.out.println("Go to court");
        }

        System.out.println("Move on!");
    }
}
