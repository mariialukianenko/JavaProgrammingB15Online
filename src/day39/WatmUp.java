package day39;

import java.util.ArrayList;
import java.util.Arrays;

public class WatmUp {
    public static void main(String[] args) {

        ArrayList<String> productLst =
                new ArrayList<>(Arrays.asList("iPhone 6s,449,18.71",
                                              "iPhone 6s Plus,549,22.88",
                                              "iPhone X,1149,56.16",
                                              "MacbookPro,1499.99,79.49",
                                              "ThumbDrive,39.99,2.68",
                                              "Beats HeadPhones,349.99,15.12",
                                              "Mous,79.99,8.98",
                                              "Charger,39.99,4.56",
                                              "iPad,429,18.31",
                                              "Dyson Vacuum,399,16.25",
                                              "TV,2199,89.49",
                                              "Apple Watch,559,21.18"));
        System.out.println(productLst);

        System.out.println("element count = " + productLst.size());

        String itemDetail = "iPhone 6s,449,18.71";
//        System.out.println(itemDetail.split(",") [0]);
//        System.out.println(itemDetail.split(",") [1]);
//        System.out.println(itemDetail.split(",") [2 ]);

        System.out.println(itemDetail.split(",") [0]);
        System.out.println(Double.parseDouble(itemDetail.split(",") [1]));
        System.out.println(Double.parseDouble(itemDetail.split(",") [2 ]));

        // 1. print omly item name

        for ( String   eachProduct   : productLst){
            String namePart = eachProduct.split(",")[0];
            System.out.println("Product name: "+namePart);
        }

        // this for loop version
        for (int i = 0; i <= productLst.size()-1 ; i++) {
            System.out.println("Name: "+ productLst.get(i).split(",")[0]);
        }

        // 2.  print all the prices more than 500

        for ( String   eachProduct   : productLst){
            double price = Double.parseDouble(eachProduct.split(",")[1]);
            //System.out.println("Price = " + price);
            if (price>500){
                System.out.println(price);
            }
        }


        // 3. print avarage price

        double sum = 0;
        double avarage = 0;

        for ( String   eachProduct   : productLst){
            double price = Double.parseDouble(eachProduct.split(",")[1]);
         sum = sum + price;
        }
        avarage = sum / productLst.size();
        System.out.println("Avarage price = " + avarage);


        // 4. print all the item name that has less than 20$ monthly payment

        for ( String   eachProduct   : productLst){
            double price = Double.parseDouble(eachProduct.split(",")[2]);
            //System.out.println("Price = " + price);
            if (price<20){
                System.out.println("Monthly price less than 20: " + price);
            }
        }

        // 5. Print the monthly paymants of all the IPhone

        for ( String   eachProduct   : productLst){
            if (eachProduct.contains("iPhone")){
                double price = Double.parseDouble(eachProduct.split(",")[2]);
                System.out.println("Monthly paymants of all iPhone" + price);
            }
        }

        // 6.  Print all information about most expensive item.

//        double max = Double.parseDouble(productLst.get(0).split(",")[1]);
//
//        for ( String   eachProduct   : productLst) {
//            double price = Double.parseDouble(eachProduct.split(",")[1]);
//            if (price > max){
//                max = price;
//            }
//        }
//        System.out.println("max price: "+ max);
        // above solution will not work

        double maxPrice = Double.parseDouble(productLst.get(0).split(",")[1]);
        int maxPriceIndex = 0;

        for (int i = 0; i < productLst.size(); i++) {

            String priceStr = productLst.get(i).split(",")[1];
            double price = Double.parseDouble(priceStr);

            if (price > maxPrice){
                maxPrice = price;
                maxPriceIndex = i;
            }
        }
        System.out.println(maxPriceIndex);
        System.out.println(maxPrice);
        System.out.println(productLst.get(maxPriceIndex));


        // 7. update Dyson to 80% off

        // System.out.println(productLst.contains("Dyson")); // false

        int dysonIndex = 0;
        
        for (int i = 0; i < productLst.size() ; i++) {
            if (productLst.get(i).startsWith("Dyson")){
                dysonIndex = i;
            }
        }
        System.out.println("dysonIndex = " + dysonIndex);
         String dysonDetailed = productLst.get(dysonIndex);
         String priceStr = dysonDetailed.split(",")[1];
         double price = Double.parseDouble(dysonDetailed.split(",")[1]);
         dysonDetailed = dysonDetailed.replaceAll(priceStr, ""+price*0.2);
        System.out.println(dysonDetailed);


        // 8. count the item prices more than avarage price

        int cnt = 0;


        // 9. remove item with more than avarage price.


    }
}
