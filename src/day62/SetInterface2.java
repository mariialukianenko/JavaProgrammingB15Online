package day62;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class SetInterface2 {

    public static void main(String[] args) {

        // Creating a HashSet with items already inside
        // REMEMBER: in HashSet there is no defined order!!!!!!!!!!!
        // your output can be in any order java desire
        // you can use all the methods coming from Collection interface

        List<Integer> numList = Arrays.asList(10, 10, 20, 20, 20, 30, 30, 30, 30);
        System.out.println("numList = " + numList);

        Set<Integer> myNumSet = new HashSet<>(numList);
        System.out.println("myNumSet = " + myNumSet);




    }


}
