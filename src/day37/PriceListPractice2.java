package day37;

import java.util.ArrayList;

public class PriceListPractice2 {
    public static void main(String[] args) {

        //task1
       ArrayList<Double> priceList = new ArrayList<>();

        priceList.add(9.99);
        priceList.add(3.99);
        priceList.add(934.99);
        priceList.add(5.99);
        priceList.add(56.99);
        priceList.add(7.99);
        priceList.add(12.99);
        priceList.add(999.99);


        System.out.println(priceList);

        // change the third price to 10$
        priceList.set(2,10.0);
        System.out.println("Third item new price = "+priceList.get(2));

        // add 4$ to first price
        priceList.set(0, priceList.get(0)+4);
        System.out.println("First item after add 4 = "+priceList.get(0));

        // change last price to sum of first and second price
        double sum = priceList.get(0) + priceList.get(1);
        priceList.set(priceList.size()-1, sum);
        System.out.println(priceList.get(priceList.size()-1));

        // give 40% off to second price
         priceList.set(1, priceList.get(1)*0.6);
        System.out.println("After 40% off = " + priceList.get(1));

        // double the value of each and every price in the list
        for (int i = 0; i <=priceList.size()-1 ; i++) {
            priceList.set(i, priceList.get(i)*2);
        }
        System.out.println(priceList);


        // cut the price into half if the price is more than 20$
        for (int y = 0; y <= priceList.size()-1 ; y++) {
            if (priceList.get(y) > 20.0){
                priceList.set(y, priceList.get(y)/2);
            }
        }
        System.out.println(priceList);

        // swap the first with last value
        Double temp = priceList.get(0);
        priceList.set(0, priceList.get(priceList.size()-1));
        priceList.set(priceList.size()-1, temp);
        System.out.println("After swaping: " + priceList);

        // Homework Reverse arraylist using the swap logic
    }
}
