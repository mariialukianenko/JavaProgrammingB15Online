package day08;
import java.util.Scanner;

public class ifElseStatementMultiHome {
    public static void main(String[] args) {

        Scanner keyboard = new Scanner(System.in);
        System.out.println("Enter your score:");
        int score = keyboard.nextInt();

        char grade;

        if (score >= 90)
           grade = 'A';
        else if (score >= 80)
            grade = 'B';
        else if (score >=70)
            grade = 'C';
        else if (score >= 60)
            grade = 'D';
        else
            grade = 'F';

        System.out.println("Your score = "+ score+ ". Your grade = "+grade+".");





    }
}
