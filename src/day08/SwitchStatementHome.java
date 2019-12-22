package day08;
import java.util.Scanner;

public class SwitchStatementHome {
    public static void main(String[] args) {

        Scanner keyboard = new Scanner(System.in);
        System.out.println("Which US state has only one syllabol in?");
        String answer = keyboard.next();

        switch (answer.toLowerCase()) {
            case "maine":
                System.out.println("Correct!");
                break;
            default:
                System.out.println("Incorrect, the answer is Maine");
                break;





        }
    }
}
