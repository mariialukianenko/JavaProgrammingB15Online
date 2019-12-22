package day19;
import java.util.Scanner;
public class Repl86Party_Home {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        String name, yesOrNo, listOfGuests="";
        do{
            System.out.println("Please enter guest name:");
            name=input.next();
            listOfGuests+=name+", ";
            System.out.println("Do you want to enter new guest name:");
            yesOrNo=input.next();
        }while (yesOrNo.equalsIgnoreCase("yes"));

        System.out.println("Guest's list: "+listOfGuests.substring(0, listOfGuests.length()-2));
    }


}
