package day31;

public class SeasonChecker {
    public static void main(String[] args) {

        String mySeason = "Winter";

        decideSeasonAction("Winter");
        decideSeasonAction("Summer");
        decideSeasonAction(mySeason);

    }

    public static void decideSeasonAction (String season){

        switch (season){
            case "Spring":
                System.out.println("Hiking");
                break;
            case "Summer":
                System.out.println("Swimming");
                break;
            case  "Fall":
                System.out.println("Pumpking picking");
                break;
            case "Winter":
                System.out.println("Snowboarding");
                break;
            default:
                System.out.println("Invalid Season");
        }
    }

}
