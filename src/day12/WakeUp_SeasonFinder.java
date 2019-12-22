package day12;
import  java.util.Scanner;
public class WakeUp_SeasonFinder {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Enter number of month:");
        int month = keyboard.nextInt();

       if (month<1 || month>12)
           System.out.println("Invalid month");

        else if (month>=3 && month<=5)
            System.out.println("spring");

        else if (month>=6 && month<=8)
           System.out.println("summer");

       else if (month>=9 && month<=11)
           System.out.println("fall");

       else if (month==12 || month==1 || month==2)
           System.out.println("winter");

    }
}
