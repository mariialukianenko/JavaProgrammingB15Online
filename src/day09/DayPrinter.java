package day09;
import java.util.Scanner;
public class DayPrinter {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Please enter the number of day:");
        int numberDay = scan.nextInt();

        if (numberDay==1)
            System.out.println("Monday");
        else if (numberDay==2)
            System.out.println("Tuasday");
        else if (numberDay==3)
            System.out.println("Wednesday");
        else if (numberDay==4)
            System.out.println("Thursday");
        else if (numberDay==5)
            System.out.println("Friday");
        else if (numberDay==6)
            System.out.println("Saturday");
        else if (numberDay==7)
            System.out.println("Sunday");
        else
            System.out.println("Unknow");


    }
}
