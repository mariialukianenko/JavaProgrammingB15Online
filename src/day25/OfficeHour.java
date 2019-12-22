package day25;

import java.beans.beancontext.BeanContext;
import java.io.OutputStream;

public class OfficeHour {
    public static void main(String[] args) {
         String[] fruits = {"apple", "banana", "grape", "strawberry", "blueberry", "kiwi"};

        System.out.println();

        for (int i = 0; i <=fruits.length-1 ; i++) {
            if (fruits[i].endsWith("e")) {
                System.out.println(fruits[i]);
            }
        }

        System.out.println("------------------");
        for ( String eachFruit : fruits ) {
            char lastChar = eachFruit.charAt(eachFruit.length() - 1);
            if (lastChar == 'e') {
                System.out.println(eachFruit);
            }
        }
            // print last 3 characte

        System.out.println("------------------");
        for (int i = 0; i <=fruits.length-1 ; i++) {
            System.out.println(fruits[i].substring(fruits[i].length()-3));
        }
        System.out.println("--------------------");
        for ( String nameFruits : fruits){
            System.out.println(nameFruits.substring(nameFruits.length()-3));
        }

        System.out.println("--------------------");
        for ( String nameFruits : fruits) {
            System.out.println("" + nameFruits.charAt(nameFruits.length()-3)+ nameFruits.charAt(nameFruits.length()-2)+
                    nameFruits.charAt(nameFruits.length()-1));
        }

        System.out.println("--------------------");
        float [] prices = { 1.99f,   0.99f,    4.65f,    3.89f,     3.88f,   2.88f  };

        float max = prices[0];
        for (float eachPrice  : prices  ){
            if (max < eachPrice){
                max = eachPrice;
            }
        }
        System.out.println(max);

        System.out.println("--------------------");
        float maX = prices[0];
        for (float eachPrice  : prices  ){
            if (maX > eachPrice){
                continue;
            }
            maX = eachPrice;
        }
        System.out.println(maX);

        System.out.println("--------------------");
        // find second maximum number
        float secondMax = prices[0];
        for (float eachPrice  : prices ){
            if (secondMax<eachPrice && eachPrice != max){
                secondMax = eachPrice;
            }
        }
        System.out.println(secondMax);

        System.out.println("--------------------");
        // find index number of second maximum number

        for (int i = 0; i <=prices.length-1 ; i++) {
            if (prices[i] == secondMax){
                System.out.println("index number of "+ secondMax+ " is "+ i);
            }

        }







        }
    }

