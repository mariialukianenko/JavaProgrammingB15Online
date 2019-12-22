package day24;

import java.util.Arrays;

public class ArrayMethodSorting {
    public static void main(String[] args) {

        int [] scores = {99, 44, 66, 23, 19, 55 };
        System.out.println(Arrays.toString(scores));

        //  low to high
        Arrays.sort(scores);
        //the original index of items has changed.
        System.out.println(Arrays.toString(scores));

        System.out.println("First item value: "+ scores[0]);

        System.out.println("----------------------");
        
        char[] nameChar = {'G', ' ', 'd', 'Z', '9', 'A'};
        System.out.println("Before storting = " + Arrays.toString(nameChar));
        Arrays.sort(nameChar);
        System.out.println("After sorting = " + Arrays.toString(nameChar));
        // it is decided by ascii table
        // special character comes first, number, uppercase then lowercase


        System.out.println("----------------------");
        String[] superHeros = {"Superman", "Batman", "Wonder Woman", "Aquaman", "Cyborg", "Flash"};
        System.out.println(Arrays.toString(superHeros));
        Arrays.sort(superHeros);
        // only first characters matter
        System.out.println(Arrays.toString(superHeros));

        System.out.println("----------------------");
        boolean[] fiveSwitchOnOffs = {true, false, false, true, true};
        System.out.println(Arrays.toString(fiveSwitchOnOffs));
        ////Arrays.sort(fiveSwitchOnOffs);   does not for boolean!!!!









    }
}
