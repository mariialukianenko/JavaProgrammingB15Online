package day25;

import java.util.Arrays;

public class WarmUpCheckArraySorrtingOrNot {
    public static void main(String[] args) {

        int[]  nums = {13, 31, 8, 5, 21, 2};
        // temporary save
        int [] numsCopy = new int [nums.length];
//        numsCopy[0] = nums[0];
//        numsCopy[1] = nums[1];
//        numsCopy[2] = nums[2];
//        numsCopy[3] = nums[3];
//        numsCopy[4] = nums[4];
//        numsCopy[5] = nums[5];

        for (int x = 0; x <= nums.length-1 ; x++) {
            numsCopy[x] = nums[x];
        }
        System.out.println("nums copy = "+ Arrays.toString(numsCopy));

        System.out.println("====================");

        Arrays.sort(numsCopy);
        System.out.println("After sort = "+Arrays.toString(numsCopy));


        if (Arrays.equals(nums,numsCopy)){
            System.out.println("this array is already sorted");
        }else {
            System.out.println("this arrya is not already sorted");
        }

    }
}
