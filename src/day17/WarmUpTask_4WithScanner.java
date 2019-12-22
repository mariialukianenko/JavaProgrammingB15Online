package day17;
import java.util.Scanner;
public class WarmUpTask_4WithScanner {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter your full name");
        String fullName = scan.nextLine();
        int indexOfSpace = fullName.indexOf(" ");

        String firstName = fullName.substring(0,indexOfSpace);
        String lastName = fullName.substring(indexOfSpace+1);

        String firstNameCorrect = firstName.toUpperCase().substring(0,1) + firstName.toLowerCase().substring(1);
        System.out.println(firstNameCorrect);

        String lastNameCorrect = lastName.toUpperCase().substring(0,1) + lastName.toLowerCase().substring(1);
        System.out.println(lastNameCorrect);

        System.out.println(firstNameCorrect+ " "+lastNameCorrect);



    }
}
