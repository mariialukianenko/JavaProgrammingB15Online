package day11;
import java.util.Scanner;
public class StringEqualityPractice2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Please, enter world:");
        String word = scan.nextLine();

        if (word.equalsIgnoreCase("Java"))
            System.out.println("You are right.");
        else
            System.out.println("You are wrong.");

       if (!word.equalsIgnoreCase("Java"))
           System.out.println("You are right.");
      else
          System.out.println("You are wrong.");




    }
}
