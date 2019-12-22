package day13;

public class AmazonCalculator2 {
    public static void main(String[] args) {

        boolean youWantToShop = true;
        String preference = "online";

        if (youWantToShop == true){

                 if(preference.equalsIgnoreCase("Store")) {
                    System.out.println("Going to store for shopping.");
                  } else {
                   System.out.println("Going to online for shopping.");
                   }

        }else {
            System.out.println("Good job stay home coding");
        }





    }
}
