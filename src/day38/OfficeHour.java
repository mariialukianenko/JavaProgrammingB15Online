package day38;

import java.util.ArrayList;
import java.util.List;

public class OfficeHour {


    public static void main(String[] args) {

        /**
         * Given a ArrayList of 6 Integer 1,3,7,2,12,7
         * insert 100 in between each numbers
         * For example :
         * 1,100,3 ,100, 7, 100, 2, 100, 12, 100, 7
         *
         * Optionally make it a method
         * write a static void method that accept a ArrayList of integer object and insert 100 in between items.
         */

        List<Integer> numbers = new ArrayList<>();
        numbers.add(1);
        numbers.add(3);
        numbers.add(7);
        numbers.add(2);
        numbers.add(12);
        numbers.add(17);

        System.out.println(numbers);
//        numbers.add(1,100);
//        System.out.println(numbers);

        for (int i = 1; i <= numbers.size()-1 ; i= i+2) {
            numbers.add(i,100);
        }

        System.out.println("Numbers after inserting: "+numbers);


        System.out.println(nameCharsToList("Mariia"));
        List<Character> resultList = nameCharsToList("Illia");
        resultList.add('P');
        System.out.println(resultList);


    }
    /**
     * create a method that accept String object
     * and return List<Character> that contains each character
     */
    public static List<Character> nameCharsToList(String name){

        List<Character> charLst = new ArrayList<>();
        for (int i = 0; i <= name.length()-1 ; i++) {
            charLst.add(name.charAt(i));
        }
        return charLst;
    }
}
