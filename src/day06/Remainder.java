package day06;
import java.util.Scanner;
public class Remainder {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);

        //+-*/  and %

        System.out.println(5/2);
        System.out.println(5.0/2);
        System.out.println(5.0/2f);

        //2*2 + 1 = 5
        System.out.println(5%2);
        //10*9 + 9 = 99
        System.out.println(99%10);
        // 10*10 + 0 = 100
        System.out.println(100%10);

        System.out.println("Enter minutes as whole number");
        int minutes = keyboard.nextInt();
        int hourPart = minutes/60;  // it will be 2
        int minutePart = minutes%60; //15 cause 60*2+15 = 135
        System.out.println("You minutes is "+ minutes+ ". It is "+ hourPart +" hours and "+minutePart+ " minutes.");






    }
}
