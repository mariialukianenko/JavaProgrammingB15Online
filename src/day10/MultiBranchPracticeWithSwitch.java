package day10;

public class MultiBranchPracticeWithSwitch {

    public static void main(String[] args) {

        System.out.println("Welcom to Mcdonald, what can I get for you?");

        int itemNumber = 3;
        String order = "";
        switch (itemNumber){

            case 1:
                System.out.println("You chose 1.");
               order = "Burger";
               break;
            case 2:
                System.out.println("You chose 2.");
                order = "French Fry";
                break;
            case 3:
                System.out.println("You chose 3.");
                order = "Nuggets";
                break;
            case 4:
                System.out.println("You chose 4.");
                order = "Ice cream";
                break;
            case 5:
                System.out.println("You chose 5.");
                order = "Coke";
                break;
            default:
                order = "Unknow";
                break;



        }
        System.out.println("Your order is "+order+".");

    }
}
