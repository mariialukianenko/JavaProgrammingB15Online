package day08;
import java.util.Scanner;

public class Tearnary_ConditionalOperatorHome {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

       /*
                REGULAR IF ELSE STATEMENT
        System.out.println("How manu hour did you work last week?");
        double hour = scan.nextDouble();

        double pay;
        pay = 55;
        if (hour<=40)
            pay = hour * pay;

        else
            pay = pay * 40 + ((hour-40) * pay * 1.5);
        System.out.println("You earned " + pay);
         */

               // USING CONDITIONAL OPERATOR (TEARNARY)
        System.out.println("How manu hour did you work last week?");
        double hour = scan.nextDouble();

        double pay;
        pay = 55;

        pay = (hour<=40) ? (hour * pay) : (pay * 40 + ((hour-40) * pay * 1.5));
        System.out.println("You earned " + pay);




    }
}
