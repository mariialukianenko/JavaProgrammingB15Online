package day25;

import java.util.Arrays;

public class WarmUpCheckArraySorrtingOrNot_2 {
    public static void main(String[] args) {

       int[]  nums = {13, 31, 8, 5, 21, 2};
       // int[]  nums = {1, 2, 3, 4, 5, 6};   //new
        System.out.println(Arrays.toString(nums));

        // assume the array is already sorted 
        boolean isSortedAlready = true;
        
        for (int i = 0; i <=nums.length-2; i++) {
          //  System.out.println(nums[i] +" "+ nums[i+1]);

            System.out.println("is "+ nums[i]+ " less than "+nums[i+1]+" ? " + (nums[i] < nums[i+1]));

            if (   ! (nums[i] < nums[i+1])    ){
                System.out.println("array is not sorted");
                isSortedAlready = false;    // new
                break;
            }
        }
        System.out.println("isSortedAlready = " + isSortedAlready);   // new



    }
}
