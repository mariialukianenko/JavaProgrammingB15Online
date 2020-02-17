package day37;

import java.util.ArrayList;

public class ArrayListPractise {
    public static void main(String[] args) {

        ArrayList<String> nameLst = new ArrayList<>();
        nameLst.add("Mariia");
        nameLst.add("Illia");
        nameLst.add("Valentina");
        nameLst.add("Alexander");
        nameLst.add("Georg");
        nameLst.add("Irina");
        System.out.println(nameLst);

        // find longest world
        String longestNAme = nameLst.get(0);

        for (int x = 0; x <= nameLst.size()-1 ; x++) {
            // > will give you first longest name if you have more than one
            // >= will give you last longest name if you have more than one
            if ( nameLst.get(x).length() > longestNAme.length() ){
                longestNAme = nameLst.get(x);
            }
        }
        System.out.println("The longest name: " + longestNAme);

        // camcatenation all longest word
        for (int i = 0; i <= nameLst.size()-1 ; i++) {
            if (nameLst.get(i).length() == longestNAme.length()){
                System.out.println(nameLst.get(i));
            }
        }
        
        // how do we use for each loop go through each items
        for ( String eachName  : nameLst){
            System.out.println("eachName = " + eachName);
        }

    }
}
