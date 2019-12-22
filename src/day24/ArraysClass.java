package day24;

import java.util.Arrays;

public class ArraysClass {
    public static void main(String[] args) {

        // import java.util.Arrays;
        // import java.util.*;

        // 1. Arrays.toString(yourArrayHere)
        //  2. sort ----> Arrays.sort(yourArrayHere)
        // 3.  equality ------->  Arrays.equals(firstArray, secondArray)

        String[] superHeros = {"Superman", "Batman", "Wonder Woman", "Aquaman", "Cyborg", "Flash"};

        System.out.println(Arrays.toString(superHeros));
        
        String SuperHeroAsString = Arrays.toString(superHeros);
        System.out.println(SuperHeroAsString);

        // get first character
        System.out.println(SuperHeroAsString.charAt(0));

        System.out.println("-----------------------");
        int[] numbers = {10, 44, 55, 3 , 78};
        System.out.println(Arrays.toString(numbers));

        double[] items = { 10.99, 12.99, 15.99 };
        String pricesString = Arrays.toString(numbers);

        for (int i = 0; i <=pricesString.length()-1 ; i++) {
            System.out.println("character at index "+ i +" is: "+pricesString.charAt(i));

        }




    }
}
