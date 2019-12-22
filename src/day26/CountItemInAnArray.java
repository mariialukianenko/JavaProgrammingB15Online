package day26;

import java.util.Arrays;

public class CountItemInAnArray {
    public static void main(String[] args) {

        String[] marvelHeros = {"Iron Man", "Capitan America", "Spiderman",
                "Black Panther", "Hulk", "Black Widow", "Wanda", "Capitan Marvel",
                "Capitan America", "Spiderman",
                "Black Widow", "Wanda", "Capitan Marvel",
                "Capitan America"};

        System.out.println("Marvel Heros = " + Arrays.toString(marvelHeros));
        int sizeOfArray = marvelHeros.length;
        System.out.println("Hero count = "+sizeOfArray);


        String itemToSearch = "Capitan America";
        int countOfItem = 0;
        
        for (String   eachHero :  marvelHeros){
            if (eachHero.equals(itemToSearch)){
                countOfItem++;
            }
        }
        System.out.println("countOfItem = " + countOfItem);


        //count the hero with the name contains BLACK
        int count2 = 0;
        for (String   eachHero :  marvelHeros) {
            if (eachHero.toLowerCase().contains("Black")){
                System.out.println(eachHero);
                count2++;
            }
        }
        System.out.println("count2 = " + count2);


    }
}
