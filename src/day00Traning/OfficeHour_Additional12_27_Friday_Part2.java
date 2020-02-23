package day00Traning;

import javax.accessibility.AccessibleStreamable;
import java.util.Arrays;

public class OfficeHour_Additional12_27_Friday_Part2 {

    public static void main(String[] args) {

        oddEven(11);
        oddEven(10);

        System.out.println(convertKmToMiles(120));

        System.out.println(convertGallonsToLitters(13));

        int[] array = {2, 3, 1, 5};
        printDescendingOrder(array);
        System.out.println();

        calculate(3,5,"*");


    }

    public static void oddEven(int number) {
        if (number % 2 == 0) {
            System.out.println("even number");
            return; // if not use return, we must use else condition
        }
        System.out.println("odd number");
    }

    // task convert km to miles
    public static double convertKmToMiles(double km) {
        double miles = km * 0.612;

        return miles;
    }

    public static double convertGallonsToLitters(double gallon) {
        double litters = gallon * 3.7;
        return litters;
    }

    public static void printDescendingOrder(int[] array) {

        Arrays.sort(array);
        for (int i = array.length - 1; i >= 0; i--) {
            System.out.print(array[i] + " ");

        }
    }

    public static void calculate(int a, int b, String operator) {

        if (operator.equals("-")) {
            System.out.println(a - b);
        } else if (operator.equals("+")) {
            System.out.println(a + b);
        } else if (operator.equals("*")) {
            System.out.println(a * b);
        } else if (operator.equals("/")) {
            System.out.println(a / b);
        } else if (operator.equals("%")) {
            System.out.println(a%b);
        }else
            System.out.println("Invalid operator.");

    }

}



