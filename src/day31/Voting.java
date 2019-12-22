package day31;

public class Voting {
    public static void main(String[] args) {

        checkEligibility(24);
        checkEligibility(16);
        checkEligibility(26);

    }

    // this method has one int parameter named age
       public static void checkEligibility( int age ){

           //int age = 15;
           if (age > 18){
               System.out.println("You are eligible to vote.");
           } else {
               System.out.println("You are not eligible to vote.");
           }
       }


}
