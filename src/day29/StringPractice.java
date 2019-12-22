package day29;

import java.util.Arrays;

public class StringPractice {
    public static void main(String[] args) {

        String hero1 = "Superman-Clark Kent";

        String [] heroSplited = hero1.split("-");
        System.out.println(Arrays.toString(heroSplited));

        String heroCode = heroSplited[0];
        String fullName = heroSplited[1];

        System.out.println("Hero code is " + heroSplited[0]+ ". Identity is "+ heroSplited[1]);

        // to get initial
        // logic 1

        String [] fullNameSplitted = fullName.split(" ");
        System.out.println(Arrays.toString(fullNameSplitted));
        String lastName = fullNameSplitted[fullNameSplitted.length-1];
        System.out.println(lastName);

        System.out.println("Initial of the hero is: "+ fullName.charAt(0) + lastName.charAt(0));




    }
}
