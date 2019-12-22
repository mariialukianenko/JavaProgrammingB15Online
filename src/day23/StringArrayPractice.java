package day23;

import java.util.Arrays;

public class StringArrayPractice {
    public static void main(String[] args) {
        
        String[] show = {"Orville", "Gifted", "Game of Throne", "Flash", "Arrow", "Super girl"};
        int showsCount = show.length;
        System.out.println("showsCount = " + showsCount);
        System.out.println(Arrays.toString(show));

        for (int x = 0; x <=show.length-1 ; x++) {
            System.out.println(show[x]+" charactar count: "+ show[x].length());

        }
    }
}
