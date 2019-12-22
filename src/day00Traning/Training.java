package day00Traning;
import java.util.Scanner;

public class Training {


    public static void main(String[] args) {
	// write your code here
        Scanner keyboard = new Scanner(System.in);

        System.out.println("Enter fahrenheit: ");
        double farenheit = keyboard.nextDouble();

        double celcius = (5.0/9)*(farenheit-32);

        System.out.println("You entered " + farenheit+ " And it is equal to "+ celcius+ ("C."));

    }
}
