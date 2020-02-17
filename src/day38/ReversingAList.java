package day38;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;

public class ReversingAList {
    public static void main(String[] args) {

        // reversing an ArrayList Object

        ArrayList<Integer> nums = new ArrayList<>(Arrays.asList(200, 100, 700, 400, 500));
        System.out.println(nums);

        Collections.reverse(nums);
        System.out.println(nums);

        Collections.sort(nums, Comparator.reverseOrder());
        System.out.println(nums);
    }
}
