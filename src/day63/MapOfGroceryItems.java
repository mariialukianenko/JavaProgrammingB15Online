package day63;

import java.util.HashMap;
import java.util.Map;

public class MapOfGroceryItems {

    public static void main(String[] args) {

        Map<String, Double> itemAndPrice = new HashMap<>();

        itemAndPrice.put("Blueberries", 2.99);
        itemAndPrice.put("Strawberry", 3.99);
        itemAndPrice.put("Salmon", 7.50);
        itemAndPrice.put("Banana", 0.99);
        itemAndPrice.put("Raspberries", 1.99);
        itemAndPrice.put("Bucket whwat", 5.99);
        itemAndPrice.put("Oatmeal", 3.45);

        System.out.println(itemAndPrice.size());

        itemAndPrice.putIfAbsent("Oatmeal", 3.60);
        System.out.println(itemAndPrice);  // no order, when printing

        System.out.println(itemAndPrice.get("Banana"));

        itemAndPrice.replace("Blueberries", 2.99 * 2 );
        System.out.println(itemAndPrice);

        itemAndPrice.remove("Banana");
        System.out.println(itemAndPrice);


    }
}
