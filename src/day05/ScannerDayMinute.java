package day05;
import java.util.Scanner;


public class ScannerDayMinute {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);

        System.out.println("Enter days:");
        int day = keyboard.nextInt();
        int total = day * 24;
        int totalMinute = total * 60;
        System.out.println(day+" day(s)= "+totalMinute+ " minutes");

        System.out.println("What is your hourly wage?");
        int hourlyWage = keyboard.nextInt();
        int yearlySalary = hourlyWage * 2080;
        System.out.println("Your yearly salary is "+yearlySalary+".");

        System.out.println("What is the price for tomato per lb?");
        double tomatoPrice = keyboard.nextDouble();
        System.out.println("How many lb do you wanna buy?");
        double totalLb = keyboard.nextDouble();
        double result = tomatoPrice*totalLb;
        System.out.println("You will spend total "+result+ "$.");




    }
}
