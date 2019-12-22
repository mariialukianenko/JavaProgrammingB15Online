package day06;
import java.util.Scanner;

public class WarmUpTask {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);

        System.out.println("Enter regular price and discount:");
        double regularPrice = keyboard.nextDouble();
        double discountPercentage = keyboard.nextDouble();

        double salePrice = regularPrice*discountPercentage;
        double yourDeal = regularPrice-salePrice;
        System.out.println("Regular price is "+regularPrice+" Your discount is "+ discountPercentage+" You will get item for "+yourDeal);

    }
}
