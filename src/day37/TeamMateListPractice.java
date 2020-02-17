package day37;

import java.util.ArrayList;
import java.util.List;

public class TeamMateListPractice {
    public static void main(String[] args) {

        //task1
       ArrayList<String> teamMates = new ArrayList<>();

       teamMates.add("Mariia");
       teamMates.add("Illia");
       teamMates.add("Alexandr");
       teamMates.add("Valentina");
       System.out.println(teamMates);

        //task2  first and last item
        System.out.println(teamMates.get(0));
        System.out.println(teamMates.get(teamMates.size()-1));

        //task3 print one by one
        for (int x = 0; x <= teamMates.size()-1 ; x++) {
            System.out.println("Item = "+teamMates.get(x));
        }

        //task4 reverse print

        for (int y = teamMates.size()-1; y >= 0 ; y--) {
            System.out.println("Item "+ (y+1) +" in reverse order = "+teamMates.get(y));
        }

        //task5 print each 2
        for (int x = 0; x <= teamMates.size()-2 ; x++) {
            System.out.println(teamMates.get(x)+"---"+teamMates.get(x+1));
        }

       //task6  2 items at a time wothout repeating
        System.out.println();
        for (int x = 0; x <= teamMates.size()-2 ; x=x+2) {
            System.out.println(teamMates.get(x)+"---"+teamMates.get(x+1));
        }

        //task7 pair them up by 3

        // ...... for home

        //task8  concat everyone in one string separated by
        String result = "";

        for (int i = 0; i <= teamMates.size()-2 ; i++) {
            result = result + teamMates.get(i) + "-";
        }
        System.out.println("\n" + result + teamMates.get(teamMates.size()-1));


        // TODO. how we can turn a list into a String and store it? and manipulated

        String lstToString = teamMates.toString();
        System.out.println("\n"+lstToString.replace(", ", "-").replace("[","")
        .replace("]", ""));

    }
}
