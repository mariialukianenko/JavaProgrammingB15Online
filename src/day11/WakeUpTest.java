package day11;
        import java.util.Scanner;
public class WakeUpTest {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the room where you want to turn on the light.");
        String room = scan.nextLine();


        switch (room.toLowerCase()){
            case "bedroom":
                System.out.println("You terned on light in bedroom.");
                break;
            case "living room":
                System.out.println("You terned on light in living room.");
                break;
            case "kitchen":
                System.out.println("You terned on light in kitchen.");
                break;
            case "hallway":
                System.out.println("You terned on light in hallway.");
                break;
            default:
                System.out.println("Unknown location.");
                break;

        }

    }
}
