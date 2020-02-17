package day35;

public class CalculatePriceOfYourGrocery {
    public static void main(String[] args) {

        String sentence = "I bought 3 tomatoes and the price was 3.14 each";

        // How much is your final price?

        String[] array = sentence.split(" ");
        int countOfTomato = Integer.parseInt(array[2]);
        double priceForEach = Double.parseDouble(array[array.length-2]);

        double finalPrice = countOfTomato * priceForEach;
        System.out.println(finalPrice);


        }
    }

