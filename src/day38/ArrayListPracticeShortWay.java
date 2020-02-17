package day38;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayListPracticeShortWay {
    public static void main(String[] args) {

        // create list of 6 double in short way, we will just read them and will not add or remove item

        List<Double> price = Arrays.asList(12.99, 24.90, 35.0, 12.0, 5.99, 3.76 );

        int count  = 0;

        for (Double each : price){
            if(each > 5){
                ++count;
            }
        }
        System.out.println("count = "+count);


        // I want to add 2 more prices ( does not have to be same list)
        ArrayList<Double> newPrices = new ArrayList<>(price);
        newPrices.add(199.99);
        newPrices.remove(5.99);  // will remove first occuranvce of the value
        System.out.println(newPrices);

        //Create a ArrayList Object in one shot with many items so we can add and remove

        // just one option to create arrayList Object in one shot
        ArrayList<Double> oneShotPrice = new ArrayList<>(Arrays.asList(12.99, 24.90, 35.0, 12.0));
    }
}
