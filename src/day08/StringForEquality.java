package day08;
import java.util.Scanner;

public class StringForEquality {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner (System.in);
        System.out.println("Enter two lines of text:");
        String s1 = keyboard.nextLine();
        String s2 = keyboard.nextLine();

        if (s1.equals(s2))
            System.out.println("The two lines are equal");
        else
            System.out.println("The two lines are not equal");

        if (s1.equalsIgnoreCase(s2))
            System.out.println("But the lines are equal, ignoring case.");
        else
            System.out.println("Lines are not equal, even ignoring case");




    }
}
