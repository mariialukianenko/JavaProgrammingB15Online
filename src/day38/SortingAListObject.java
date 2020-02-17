package day38;

import java.util.*;

public class SortingAListObject {
    public static void main(String[] args) {

        List<Integer> nums = new ArrayList<>(Arrays.asList(300, 200, 700, 600, 800));

        // 2 ways to sort an ArrayList
        // use collections utility class

        Collections.sort(nums);
        System.out.println(nums);

        Collections.sort( nums, Comparator.reverseOrder() );
        System.out.println(nums);

        //List itself also has sort method that accept one Comparator object
        //simple way to get Comparator objects are

//        Comparator.naturalOrder() --> low to high
//        Comparator.reverseOrder() --> high to low

        nums.sort(Comparator.naturalOrder());
        System.out.println(nums);

        nums.sort(Comparator.reverseOrder());
        System.out.println(nums);

    }
}
