package day08;
import java.util.Scanner;
public class MultiBranchIf {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("What is your current speed?");
        int currentSpeed = scan.nextInt();

        if (currentSpeed>70) {
            System.out.println("you are speeding more than 70, point taken");
        }
        else if (currentSpeed>=60) {
            System.out.println("your speed more than 60 and less than 69");
        }
        else {
            System.out.println("keep driving. you are good");
        }


    }
}
