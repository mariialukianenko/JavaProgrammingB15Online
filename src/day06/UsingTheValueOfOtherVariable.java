package day06;

public class UsingTheValueOfOtherVariable {
    public static void main(String[] args) {

        int myFavNumber = 300;
        int yourFavNumber = myFavNumber;
        System.out.println("My fav number "+myFavNumber+" "+ yourFavNumber);

        yourFavNumber = 100;
        System.out.println("My fav number "+myFavNumber+" "+ yourFavNumber);

        String yourOrder = "Avocado toast";
        String myOrder = yourOrder;
        System.out.println("My order is " + myOrder);


    }
}
