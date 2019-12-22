package day12;
import java.util.Scanner;
public class PracticeSeason {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Please, enter your season:");
        String season = scan.nextLine();

        if (season.equalsIgnoreCase("Spring")) {
            System.out.println("Hiking, cool weather, warm.");
        }else if (season.equalsIgnoreCase("Summer")) {
            System.out.println("Barbecue, riding bike, swimmig, beach, vacation.");
        }else if (season.equalsIgnoreCase("Winter")) {
            System.out.println("Snow, snowboard, cold.");
        }else if (season.equalsIgnoreCase("Fall")) {
            System.out.println("Yellow.");
        } else {
            System.out.println("Can not recognize this word.");
        }
    }
}
