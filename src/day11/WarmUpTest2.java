package day11;
import java.util.Scanner;
public class WarmUpTest2 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the first letter of the room where you want to turn on the light.");

        char room = scan.next().charAt(0);


        switch (room){
           case 'B':
                System.out.println("You terned on light in bedroom.");
               break;
            case 'L':
                System.out.println("You terned on light in living room.");
                break;
          case 'K':
                System.out.println("You terned on light in kitchen.");
                break;
            case 'H':
                System.out.println("You terned on light in hallway.");
                break;
            default:
                System.out.println("Unknown location.");
                break;

        }

    }
}
