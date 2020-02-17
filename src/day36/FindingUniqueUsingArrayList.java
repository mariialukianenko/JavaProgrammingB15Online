package day36;

import java.util.ArrayList;

public class FindingUniqueUsingArrayList {
    public static void main(String[] args) {
        int [] nums = {11, 33, 44, 11, 67, 45, 33, 11, 23};

        ArrayList<Integer> uniqueList = new ArrayList<>();

        for (int each : nums) {
            if (!uniqueList.contains(each)) {

                uniqueList.add(each);
            }
        }
        System.out.println(uniqueList);
    }
}
