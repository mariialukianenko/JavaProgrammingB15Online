package day09;
import javax.swing.*;
import java.util.Scanner;
public class TryingRepl35 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String item = scan.nextLine();

        //WRITE YOUR CODE HERE


        int smartphone=300;
        if (item.equalsIgnoreCase("smartphone")) {
            System.out.println("Sorry, not enough funds on your gift card!");
        }



        else if (item.equalsIgnoreCase("Laptop")) {
            System.out.println("Sorry, not enough funds on your gift card!");
        }
        else if (item.equalsIgnoreCase("Charger")) {
            System.out.println("Thank you for your purchase!");
            System.out.println("Your current balance is: 85$");
        }








    }
}
