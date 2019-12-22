package day09;

public class EvenOddFinder {
    public static void main(String[] args) {
        int myFavNumber = 300;

        System.out.println(myFavNumber/2);
        System.out.println(myFavNumber%2);

        int remainder = myFavNumber%2;

        if(remainder%2==0)
            System.out.println("Even number");

        else
            System.out.println("Odd number");



    }
}
